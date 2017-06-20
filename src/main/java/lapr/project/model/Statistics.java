package lapr.project.model;

import org.apache.commons.math3.distribution.NormalDistribution;

/**
 *
 * @author MarioDias
 */
public class Statistics {

    private float variance;
    private final float FIFTYPERCENT = 0.5f;
    private double zCritical;
    private int total;
    private double significance;
    private float acceptanceRate;
    private double obsValue;

    /**
     *
     * @param significance
     * @param total
     */
    public Statistics(double significance, int total, float acceptanceRate) {
        this.total = total;
        this.significance = significance;
        this.acceptanceRate = acceptanceRate;
    }

    private void eventNormalDistributionUnilateral(double significance) {
        NormalDistribution normal = new NormalDistribution();
        zCritical = normal.inverseCumulativeProbability(1 - significance);
        ValueVariance();
        obsValueUnilateral();
    }

    private void obsValueUnilateral() {
        obsValue = (acceptanceRate - FIFTYPERCENT) / Math.sqrt(variance);
    }

    private void ValueVariance() {
        variance = (FIFTYPERCENT * (1 - FIFTYPERCENT) / total);
    }

    public double getzCritical() {
        return zCritical;
    }

    public double getObsValue() {
        return obsValue;
    }
    

}
