package lapr.project.model;

import java.util.ArrayList;

/**
 *
 * @author MarioDias
 */
public class ShowStandInformation {

    private StandRegistry standRegistry;
    private float intervalMatrix[][];
    private ArrayList<String> intervals;
    private ArrayList<Float> classMarkArray;
    private ArrayList<Float> clmMinusMeanSquared;
    private ArrayList<Integer> frequency;
    private float totalAmplitude = 0;
    private String frequencyString;
    private float mean = 0;
    private float standartDeviation = 0;

    /**
     *
     * @param standRegistry
     */
    public ShowStandInformation(StandRegistry standRegistry) {
        this.standRegistry = standRegistry;
        this.intervals = new ArrayList<>();
        this.classMarkArray = new ArrayList<>();
        this.frequency = new ArrayList<>();
        this.clmMinusMeanSquared = new ArrayList<>();
        TotalAmplitude();
        SturgesRule();
    }

    private StandRegistry getStandRegistry() {
        return standRegistry;
    }

    /**
     *
     * @param pos
     * @return
     */
    public StandRegistry newStandRegistryInterval(int pos) {
        StandRegistry newStandRegistry = new StandRegistry();
        for (int i = 0; i < standRegistry.size(); i++) {
            if (getStandRegistry().getStand(i).getArea() <= intervalMatrix[pos][1] && getStandRegistry().getStand(i).getArea() >= intervalMatrix[pos][0]) {
                newStandRegistry.addStand(standRegistry.getStand(i));
            }
        }
        float n = (float) newStandRegistry.size() / standRegistry.size();
        float frequency = (float) (n * 100.00);
        frequencyString = String.valueOf(Math.round(frequency * 100.00) / 100.00+"%");
        return newStandRegistry;
    }

    private void SturgesRule() {
        int k = (int) (1 + 3.3 * Math.log10(standRegistry.size()));
        float amplitude = totalAmplitude / k;
        createElements(amplitude, k);
    }

    private void createElements(float amplitude, int k) {
        float value = standRegistry.getStand(0).getArea();
        intervalMatrix = new float[k][2];
        for (int i = 0; i < k; i++) {
            intervalMatrix[i][0] = value;//Lower interval
            intervalMatrix[i][1] = value + amplitude; //Upper interval
            frequencyForInterval(intervalMatrix[i][0], intervalMatrix[i][1]);
            float classmark = (intervalMatrix[i][0] + intervalMatrix[i][1]) / 2;// ClassMark for each interval
            classMarkArray.add(classmark);
            intervals.add("[" + Math.round(intervalMatrix[i][0] * 100.00) / 100.00 + "," + (Math.round(intervalMatrix[i][1] * 100.00)) / 100.00 + "]");
            value += amplitude;
        }
        Mean();
        calculateDiferenceClassMarkMean();
        StandartDeviation();
    }

    private void calculateDiferenceClassMarkMean() {
        for (int i = 0; i < classMarkArray.size(); i++) {
            float value = (float) Math.pow((classMarkArray.get(i) - mean), 2);
            clmMinusMeanSquared.add(value);
        }
    }

    private void StandartDeviation() {
        for (int i = 0; i < frequency.size(); i++) {
            standartDeviation += frequency.get(i) * clmMinusMeanSquared.get(i);
        }
        standartDeviation /= standRegistry.size();//the sum of producto of clm * frequency / by the amount of stands
        standartDeviation = (float) Math.sqrt((double) standartDeviation);//sqrt of the prevvious result, return the Standart Deviation
    }

    /**
     *
     * @return
     */
    public float getStandartDeviation() {
        return standartDeviation;
    }

    private void frequencyForInterval(float min, float max) {
        int counter = 0;
        for (int j = 0; j < standRegistry.size(); j++) {
            if (standRegistry.getStand(j).getArea() >= min && standRegistry.getStand(j).getArea() <= max) {
                counter++;
            }
        }
        frequency.add(counter);
    }

    private void TotalAmplitude() {
        standRegistry.sort();
        float min = standRegistry.getStand(0).getArea();
        float max = standRegistry.getStand(standRegistry.size() - 1).getArea();
        totalAmplitude = max - min;
    }

    private void Mean() {
        mean = 0;
        for (int i = 0; i < classMarkArray.size(); i++) {
            mean += classMarkArray.get(i) * frequency.get(i);
        }
        mean /= standRegistry.size();
    }

    /**
     *
     * @return
     */
    public float[][] getIntervalMatrix() {
        return intervalMatrix;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getIntervals() {
        return intervals;
    }

    /**
     *
     * @return
     */
    public String getFrequencyString() {
        return frequencyString;
    }

    /**
     *
     * @return
     */
    public ArrayList<Float> getClassMarkArray() {
        return classMarkArray;
    }

    /**
     *
     * @return
     */
    public float getMean() {
        return mean;
    }

    /**
     *
     * @return
     */
    public ArrayList<Integer> getFrequency() {
        return frequency;
    }

}
