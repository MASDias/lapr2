package lapr.project.model;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.descriptive.moment.Variance;

/**
 *
 * @author MarioDias
 */
public class Statistics {

    private float varianceUnilateral;
    private float varianceBilateral;

    private final float FIFTYPERCENT = 0.5f;
    private double zCritical;
    private int totalUnilateral;
    private int totalBilateral;

    private double significance;
    private float firstProporcion;
    private float secondProporcion;
    private double obsValue;

    /**
     *
     * @param significance
     * @param total
     * @param firstProportion
     */
    public Statistics(double significance, int total, float firstProportion) {
        this.totalUnilateral = total;
        this.significance = significance;
        this.firstProporcion = firstProportion;
        NormalDistributionUnilateral(significance, this.firstProporcion, FIFTYPERCENT);
        Variance v = new Variance();

    }

    /**
     *
     * @param significance
     * @param firstTotal
     * @param secondTotal
     * @param firstProporcion
     * @param secondProporcion
     */
    public Statistics(double significance, int firstTotal, int secondTotal, float firstProporcion, float secondProporcion) {
        this.totalUnilateral = firstTotal;
        this.totalBilateral = secondTotal;
        this.significance = significance;
        this.firstProporcion = firstProporcion;
        this.secondProporcion = secondProporcion;
        NormalDistributionBilateral(significance);
        ValueVarianceBilateral(firstProporcion, secondProporcion);
        obsValueBilateral(firstProporcion, secondProporcion);
    }

    private void NormalDistributionUnilateral(double significance, float firstProporcion, float secondProporcion) {
        NormalDistribution normal = new NormalDistribution(0, 1);
        zCritical = normal.inverseCumulativeProbability(1 - significance);
        ValueVarianceUnilateral();
        obsValueUnilateral(firstProporcion, secondProporcion);
    }

    private void NormalDistributionBilateral(double significance) {
        NormalDistribution normal = new NormalDistribution(0, 1);
        zCritical = normal.inverseCumulativeProbability(1 - (significance / 2));
    }

    private void obsValueUnilateral(float firstProporcion, float secondProporcion) {
        obsValue = (firstProporcion - secondProporcion) / Math.sqrt(varianceUnilateral);
    }

    private void obsValueBilateral(float firstProporcion, float secondProporcion) {
        obsValue = (firstProporcion - secondProporcion) / Math.sqrt((varianceUnilateral + varianceBilateral));
    }

    private void ValueVarianceBilateral(float firstProporcion, float secondProporcion) {
        varianceUnilateral = (firstProporcion * (1 - firstProporcion)) / totalUnilateral;
        varianceBilateral = (secondProporcion * (1 - secondProporcion)) / totalBilateral;
    }

    private void ValueVarianceUnilateral() {
        varianceUnilateral = (FIFTYPERCENT * (1 - FIFTYPERCENT)) / totalUnilateral;
    }

    public double deviationVariance(double[] values) {
        return new Variance().evaluate(values);
    }
    
    public double deviationAvarage(double[] values){
        double average = 0;
        for (int i = 0; i < values.length; i++) {
            System.out.println(average);
            average+=values[i];
        }
        return average/values.length;
    }

    /**
     *
     * @return
     */
    public double getzCritical() {
        return zCritical;
    }

    /**
     *
     * @return
     */
    public double getObsValue() {
        return obsValue;
    }

}
