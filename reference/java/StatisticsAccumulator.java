_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
    public void unitTestValidate( String expectedUnit, double expectedMin,
        double expectedMax, long expectedSampleCount, double expectedAverage,
        double expectedStandardDeviation )

    /**
     *  This is an internal API to test StatisticsAccumulator...
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
    void clearState( ) {

    /**
     *  Clears the samples and starts fresh on new samples.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
    public StatisticsAccumulator( String unit ) {

/**
 * <p>
 * Construct the Statistics Accumulator by providing the unit as a String.
 * The examples of units are &quot;Hours&quot;, &quot;Minutes&quot;,
 * &quot;Seconds&quot;, &quot;MilliSeconds&quot;, &quot;Micro Seconds&quot;
 * etc.,
 * </p>
 * <p>
 *
 * @return a StatisticsAccumulator with ...
 * </p>
 * <p>
 * @param unit a String representing the units for the samples collected
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
    protected double computeStandardDeviation( ) {

    /**
     * We use a derived Standard Deviation formula to compute SD. This way
     * there is no need to hold on to all the samples provided.
     *
     * The method is protected to let users extend and format the results.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
    protected double computeAverage( ) {

    /**
     *  If users choose to custom format the stats.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
    public String toString( ) {

    /**
     *  Users can extend StatisticsAccumulator to provide the complete
     *  Stats in the format they prefer, if the default format doesn't suffice.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
    public String getValue( ) {

    /**
     *  Computes the Standard Statistic Results based on the samples collected
     *  so far and provides the complete value as a formatted String
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
    public void sample(double value) {

/**
 * <p>
 * User will use this method to just register a sample with the
 * StatisticsAccumulator. This is the only method that User will use to
 * expose the statistics, internally the StatisticMonitoredAttribute will
 * collect the information when requested from the ASAdmin.
 * </p>
 * <p>
 *
 * </p>
 * <p>
 *
 * @param value a double value to make it more precise
 * </p>
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
  // operations

  ///////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
  // attributes

  ///////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/monitoring/StatisticsAccumulator.java
public class StatisticsAccumulator {

/**
 * <p>
 *
 * @author Hemanth Puttaswamy
 * </p>
 * <p>
 * StatisticsAccumulator accumulates the samples provided by the user and
 * computes the value of minimum, maximum, sum and sample square sum. When
 * the StatisticMonitoredAttribute calls getValue(), it will compute all
 * the statistics for the collected samples (Which are Minimum, Maximum,
 * Average, StandardDeviation) and provides a nice printable record as a
 * String.
 *
 * Users can easily extend this class and provide the implementation of
 * toString() method to format the stats as desired. By default all the stats
 * are printed in a single line.
 * </p>
 */
