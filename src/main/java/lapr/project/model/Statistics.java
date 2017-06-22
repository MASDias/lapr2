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
    private double varianceFirstDeviation;
    private double varianceSecondDeviation;

    private double averageFirstDeviation;
    private double averageSecondDeviation;

    private final float FIFTYPERCENT = 0.5f;
    private double zCritical;
    private int totalUnilateral;
    private int totalBilateral;

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
        this.firstProporcion = firstProportion;
        NormalDistributionUnilateral(significance, this.firstProporcion, FIFTYPERCENT);
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
        this.firstProporcion = firstProporcion;
        this.secondProporcion = secondProporcion;
        NormalDistributionBilateral(significance);
        ValueVarianceBilateral(this.firstProporcion, this.secondProporcion);
        obsValueBilateral(firstProporcion, secondProporcion);
    }

    /**
     *
     * @param significance
     * @param theoriticalValue
     * @param totalEmployeeApplication
     * @param values
     */
    public Statistics(double significance, float theoriticalValue, int totalEmployeeApplication, double[] values) {
        NormalDistribution normal = new NormalDistribution(0, 1);
        zCritical = normal.inverseCumulativeProbability(1 - significance);
        NormalDistributionEmployeeDeviation(values);
        obsValue = (averageFirstDeviation - theoriticalValue) / Math.sqrt(getVarianceFirstDeviation() / totalEmployeeApplication);
    }

    /**
     *
     * @param significance
     * @param firstMean
     * @param secondMean
     * @param totalEmployeeApplicationOne
     * @param totalEmployeeApplicationTwo
     * @param valuesOne
     * @param valuesTwo
     */
    public Statistics(double significance, float firstMean, float secondMean, int totalEmployeeApplicationOne, int totalEmployeeApplicationTwo, double[] valuesOne, double[] valuesTwo) {
        NormalDistribution normal = new NormalDistribution(0, 1);
        zCritical = normal.inverseCumulativeProbability(1 - (significance / 2));
        NormalDistributionEmployeeDeviationCompare(valuesOne, valuesTwo);
        obsValue = getObsEmployeeComparison(firstMean, secondMean, varianceFirstDeviation, varianceSecondDeviation, totalEmployeeApplicationOne, totalEmployeeApplicationTwo);
    }

    private void NormalDistributionEmployeeDeviation(double[] values) {
        varianceFirstDeviation = deviationVariance(values);
        averageFirstDeviation = deviationAverage(values);
    }

    private void NormalDistributionEmployeeDeviationCompare(double[] values, double[] valuesTwo) {
        varianceFirstDeviation = deviationVariance(values);
        averageFirstDeviation = deviationAverage(values);
        varianceSecondDeviation = deviationVariance(valuesTwo);
        averageSecondDeviation = deviationAverage(valuesTwo);
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

    /**
     *
     * @return
     */
    public double getVarianceFirstDeviation() {
        return varianceFirstDeviation;
    }

    /**
     *
     * @return
     */
    public double getAverageFirstDeviation() {
        return averageFirstDeviation;
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

    /**
     *
     * @param values
     * @return
     */
    public double deviationVariance(double[] values) {
        return new Variance().evaluate(values);
    }

    /**
     *
     * @param values
     * @return
     */
    public double deviationAverage(double[] values) {
        double average = 0;
        for (int i = 0; i < values.length; i++) {
            average += values[i];
        }
        return average / values.length;
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

    private double getObsEmployeeComparison(double averageOne, double averageTwo, double varianceOne, double varianceTwo, int totalOne, int totalTwo) {
        return (averageOne - averageTwo) / Math.sqrt((varianceOne / totalOne) + (varianceTwo / totalTwo));
    }

}
