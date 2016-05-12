_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static long getCalendarTimeInMillis(Calendar cal) {

    /**
     * Calls the {@link Calendar#getTimeInMillis} method.
     * Prior to JDK1.4, this method was protected and therefore
     * cannot be invoked directly.
     *
     * In future, this should be replaced by
     * <code>cal.getTimeInMillis()</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static class DurationStream implements Serializable {

    /**
     * Representation of {@link Duration} in the object stream.
     *
     * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private Object writeReplace() throws IOException {

    /**
     * Writes {@link Duration} as a lexical representation
     * for maximum future compatibility.
     *
     * @return
     *      An object that encapsulates the string
     *      returned by <code>this.toString()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final long serialVersionUID = 1L;

    /**
     * <p>Stream Unique Identifier.</p>
     *
     * <p>TODO: Serialization should use the XML string representation as
     * the serialization format to ensure future compatibility.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public void addTo(Date date) {

    /**
     * Adds this duration to a {@link Date} object.
     *
     * <p>
     * The given date is first converted into
     * a {@link java.util.GregorianCalendar}, then the duration
     * is added exactly like the {@link #addTo(Calendar)} method.
     *
     * <p>
     * The updated time instant is then converted back into a
     * {@link Date} object and used to update the given {@link Date} object.
     *
     * <p>
     * This somewhat redundant computation is necessary to unambiguously
     * determine the duration of months and years.
     *
     * @param date
     *      A date object whose value will be modified.
     * @throws NullPointerException
     *      if the date parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public void addTo(Calendar calendar) {

    /**
     * Adds this duration to a {@link Calendar} object.
     *
     * <p>
     * Calls {@link java.util.Calendar#add(int,int)} in the
     * order of YEARS, MONTHS, DAYS, HOURS, MINUTES, SECONDS, and MILLISECONDS
     * if those fields are present. Because the {@link Calendar} class
     * uses int to hold values, there are cases where this method
     * won't work correctly (for example if values of fields
     * exceed the range of int.)
     * </p>
     *
     * <p>
     * Also, since this duration class is a Gregorian duration, this
     * method will not work correctly if the given {@link Calendar}
     * object is based on some other calendar systems.
     * </p>
     *
     * <p>
     * Any fractional parts of this {@link Duration} object
     * beyond milliseconds will be simply ignored. For example, if
     * this duration is "P1.23456S", then 1 is added to SECONDS,
     * 234 is added to MILLISECONDS, and the rest will be unused.
     * </p>
     *
     * <p>
     * Note that because {@link Calendar#add(int, int)} is using
     * <tt>int</tt>, {@link Duration} with values beyond the
     * range of <tt>int</tt> in its fields
     * will cause overflow/underflow to the given {@link Calendar}.
     * {@link XMLGregorianCalendar#add(Duration)} provides the same
     * basic operation as this method while avoiding
     * the overflow/underflow issues.
     *
     * @param calendar
     *      A calendar object whose value will be modified.
     * @throws NullPointerException
     *      if the calendar parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int signum() {

    /**
     * Returns the sign of this duration in -1,0, or 1.
     *
     * @return
     *      -1 if this duration is negative, 0 if the duration is zero,
     *      and 1 if the duration is postive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration negate() {

    /**
     * Returns a new {@link Duration} object whose
     * value is <code>-this</code>.
     *
     * <p>
     * Since the {@link Duration} class is immutable, this method
     * doesn't change the value of this object. It simply computes
     * a new Duration object and returns it.
     *
     * @return
     *      always return a non-null valid {@link Duration} object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration subtract(final Duration rhs) {

    /**
     * <p>Computes a new duration whose value is <code>this-rhs</code>.</p>
     *
     * <p>For example:</p>
     * <pre>
     * "1 day" - "-3 days" = "4 days"
     * "1 year" - "1 day" = IllegalStateException
     * "-(1 hour,50 minutes)" - "-20 minutes" = "-(1hours,30 minutes)"
     * "15 hours" - "-3 days" = "3 days and 15 hours"
     * "1 year" - "-1 day" = "1 year and 1 day"
     * </pre>
     *
     * <p>Since there's no way to meaningfully subtract 1 day from 1 month,
     * there are cases where the operation fails in {@link IllegalStateException}.</p>
     *
     * <p>Formally the computation is defined as follows.
     * First, we can assume that two {@link Duration}s are both positive
     * without losing generality.  (i.e.,
     * <code>(-X)-Y=-(X+Y)</code>, <code>X-(-Y)=X+Y</code>,
     * <code>(-X)-(-Y)=-(X-Y)</code>)</p>
     *
     * <p>Then two durations are subtracted field by field.
     * If the sign of any non-zero field <tt>F</tt> is different from
     * the sign of the most significant field,
     * 1 (if <tt>F</tt> is negative) or -1 (otherwise)
     * will be borrowed from the next bigger unit of <tt>F</tt>.</p>
     *
     * <p>This process is repeated until all the non-zero fields have
     * the same sign.</p>
     *
     * <p>If a borrow occurs in the days field (in other words, if
     * the computation needs to borrow 1 or -1 month to compensate
     * days), then the computation fails by throwing an
     * {@link IllegalStateException}.</p>
     *
     * @param rhs <code>Duration</code> to substract from this <code>Duration</code>.
     *
     * @return New <code>Duration</code> created from subtracting <code>rhs</code> from this <code>Duration</code>.
     *
     * @throws IllegalStateException
     *      If two durations cannot be meaningfully subtracted. For
     *      example, subtracting one day from one month causes
     *      this exception.
     *
     * @throws NullPointerException
     *      If the rhs parameter is null.
     *
     * @see #add(Duration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    static BigDecimal sanitize(BigDecimal value, int signum) {

    /**
     * <p>Compute <code>value*signum</code> where <code>value==null</code> is treated as <code>value==0</code></p>.
     *
     * @param value Value to sanitize.
     * @param signum 0 to sanitize to 0, > 0 to sanitize to <code>value</code>, < 0 to sanitize to negative <code>value</code>.
     *
     * @return non-null {@link BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static BigDecimal sanitize(BigInteger value, int signum) {

    /**
     * Compute <code>value*signum</code> where value==null is treated as
     * value==0.
     * @param value Value to sanitize.
     * @param signum 0 to sanitize to 0, > 0 to sanitize to <code>value</code>, < 0 to sanitize to negative <code>value</code>.
     *
     * @return non-null {@link BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration add(final Duration rhs) {

    /**
     * <p>Computes a new duration whose value is <code>this+rhs</code>.</p>
     *
     * <p>For example,</p>
     * <pre>
     * "1 day" + "-3 days" = "-2 days"
     * "1 year" + "1 day" = "1 year and 1 day"
     * "-(1 hour,50 minutes)" + "-20 minutes" = "-(1 hours,70 minutes)"
     * "15 hours" + "-3 days" = "-(2 days,9 hours)"
     * "1 year" + "-1 day" = IllegalStateException
     * </pre>
     *
     * <p>Since there's no way to meaningfully subtract 1 day from 1 month,
     * there are cases where the operation fails in
     * {@link IllegalStateException}.</p>
     *
     * <p>
     * Formally, the computation is defined as follows.</p>
     * <p>
     * Firstly, we can assume that two {@link Duration}s to be added
     * are both positive without losing generality (i.e.,
     * <code>(-X)+Y=Y-X</code>, <code>X+(-Y)=X-Y</code>,
     * <code>(-X)+(-Y)=-(X+Y)</code>)
     *
     * <p>
     * Addition of two positive {@link Duration}s are simply defined as
     * field by field addition where missing fields are treated as 0.
     * <p>
     * A field of the resulting {@link Duration} will be unset if and
     * only if respective fields of two input {@link Duration}s are unset.
     * <p>
     * Note that <code>lhs.add(rhs)</code> will be always successful if
     * <code>lhs.signum()*rhs.signum()!=-1</code> or both of them are
     * normalized.</p>
     *
     * @param rhs <code>Duration</code> to add to this <code>Duration</code>
     *
     * @return
     *      non-null valid Duration object.
     *
     * @throws NullPointerException
     *      If the rhs parameter is null.
     * @throws IllegalStateException
     *      If two durations cannot be meaningfully added. For
     *      example, adding negative one day to one month causes
     *      this exception.
     *
     *
     * @see #subtract(Duration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final BigDecimal[] FACTORS = new BigDecimal[]{

    /**
     * 1 unit of FIELDS[i] is equivalent to <code>FACTORS[i]</code> unit of
     * FIELDS[i+1].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static BigInteger toBigInteger(
        BigDecimal value,
        boolean canBeNull) {

    /**
     * <p>BigInteger value of BigDecimal value.</p>
     *
     * @param value Value to convert.
     * @param canBeNull Can returned value be null?
     *
     * @return BigInteger value of BigDecimal, possibly null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private BigDecimal getFieldAsBigDecimal(DatatypeConstants.Field f) {

    /**
     * <p>Gets the value of the field as a {@link BigDecimal}.</p>
     *
     * <p>If the field is unset, return 0.</p>
     *
     * @param f Field to get value for.
     *
     * @return  non-null valid {@link BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration multiply(BigDecimal factor) {

    /**
     * Computes a new duration whose value is <code>factor</code> times
     * longer than the value of this duration.
     *
     * <p>
     * For example,
     * <pre>
     * "P1M" (1 month) * "12" = "P12M" (12 months)
     * "PT1M" (1 min) * "0.3" = "PT18S" (18 seconds)
     * "P1M" (1 month) * "1.5" = IllegalStateException
     * </pre>
     *
     * <p>
     * Since the {@link Duration} class is immutable, this method
     * doesn't change the value of this object. It simply computes
     * a new Duration object and returns it.
     *
     * <p>
     * The operation will be performed field by field with the precision
     * of {@link BigDecimal}. Since all the fields except seconds are
     * restricted to hold integers,
     * any fraction produced by the computation will be
     * carried down toward the next lower unit. For example,
     * if you multiply "P1D" (1 day) with "0.5", then it will be 0.5 day,
     * which will be carried down to "PT12H" (12 hours).
     * When fractions of month cannot be meaningfully carried down
     * to days, or year to months, this will cause an
     * {@link IllegalStateException} to be thrown.
     * For example if you multiple one month by 0.5.</p>
     *
     * <p>
     * To avoid {@link IllegalStateException}, use
     * the {@link #normalizeWith(Calendar)} method to remove the years
     * and months fields.
     *
     * @param factor to multiply by
     *
     * @return
     *      returns a non-null valid {@link Duration} object
     *
     * @throws IllegalStateException if operation produces fraction in
     * the months field.
     *
     * @throws NullPointerException if the <code>factor</code> parameter is
     * <code>null</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration multiply(int factor) {

    /**
     * <p>Computes a new duration whose value is <code>factor</code> times
     * longer than the value of this duration.</p>
     *
     * <p>This method is provided for the convenience.
     * It is functionally equivalent to the following code:</p>
     * <pre>
     * multiply(new BigDecimal(String.valueOf(factor)))
     * </pre>
     *
     * @param factor Factor times longer of new <code>Duration</code> to create.
     *
     * @return New <code>Duration</code> that is <code>factor</code>times longer than this <code>Duration</code>.
     *
     * @see #multiply(BigDecimal)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration normalizeWith(Calendar startTimeInstant) {

    /**
     * <p>Converts the years and months fields into the days field
     * by using a specific time instant as the reference point.</p>
     *
     * <p>For example, duration of one month normalizes to 31 days
     * given the start time instance "July 8th 2003, 17:40:32".</p>
     *
     * <p>Formally, the computation is done as follows:</p>
     * <ol>
     *  <li>The given Calendar object is cloned.
     *  <li>The years, months and days fields will be added to
     *      the {@link Calendar} object
     *      by using the {@link Calendar#add(int,int)} method.
     *  <li>The difference between two Calendars are computed in terms of days.
     *  <li>The computed days, along with the hours, minutes and seconds
     *      fields of this duration object is used to construct a new
     *      Duration object.
     * </ol>
     *
     * <p>Note that since the Calendar class uses <code>int</code> to
     * hold the value of year and month, this method may produce
     * an unexpected result if this duration object holds
     * a very large value in the years or months fields.</p>
     *
     * @param startTimeInstant <code>Calendar</code> reference point.
     *
     * @return <code>Duration</code> of years and months of this <code>Duration</code> as days.
     *
     * @throws NullPointerException If the startTimeInstant parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
//    public Duration normalize() {

//    /**
//     * Returns an equivalent but "normalized" duration value.
//     *
//     * Intuitively, the normalization moves YEARS into
//     * MONTHS (by x12) and moves DAYS, HOURS, and MINUTES fields
//     * into SECONDS (by x86400, x3600, and x60 respectively.)
//     *
//     *
//     * Formally, this method satisfies the following conditions:
//     * <ul>
//     *  <li>x.normalize().equals(x)
//     *  <li>!x.normalize().isSet(Duration.YEARS)
//     *  <li>!x.normalize().isSet(Duration.DAYS)
//     *  <li>!x.normalize().isSet(Duration.HOURS)
//     *  <li>!x.normalize().isSet(Duration.MINUTES)
//     * </ul>
//     *
//     * @return
//     *      always return a non-null valid value.
//     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public long getTimeInMillis(final Date startInstant) {

    /**
     * <p>Returns the length of the duration in milli-seconds.</p>
     *
     * <p>If the seconds field carries more digits than milli-second order,
     * those will be simply discarded (or in other words, rounded to zero.)
     * For example, for any <code>Date</code> value <code>x<code>,</p>
     * <pre>
     * <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>.
     * <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>.
     * </pre>
     *
     * <p>
     * Note that this method uses the {@link #addTo(Date)} method,
     * which may work incorectly with {@link Duration} objects with
     * very large values in its fields. See the {@link #addTo(Date)}
     * method for details.
     *
     * @param startInstant
     *      The length of a month/year varies. The <code>startInstant</code> is
     *      used to disambiguate this variance. Specifically, this method
     *      returns the difference between <code>startInstant</code> and
     *      <code>startInstant+duration</code>.
     *
     * @throws NullPointerException
     *      If the startInstant parameter is null.
     *
     * @return milliseconds between <code>startInstant</code> and
     *   <code>startInstant</code> plus this <code>Duration</code>
     *
     * @see #getTimeInMillis(Calendar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public long getTimeInMillis(final Calendar startInstant) {

    /**
     * <p>Returns the length of the duration in milli-seconds.</p>
     *
     * <p>If the seconds field carries more digits than milli-second order,
     * those will be simply discarded (or in other words, rounded to zero.)
     * For example, for any Calendar value <code>x<code>,</p>
     * <pre>
     * <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>.
     * <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>.
     * </pre>
     *
     * <p>
     * Note that this method uses the {@link #addTo(Calendar)} method,
     * which may work incorectly with {@link Duration} objects with
     * very large values in its fields. See the {@link #addTo(Calendar)}
     * method for details.
     *
     * @param startInstant
     *      The length of a month/year varies. The <code>startInstant</code> is
     *      used to disambiguate this variance. Specifically, this method
     *      returns the difference between <code>startInstant</code> and
     *      <code>startInstant+duration</code>
     *
     * @return milliseconds between <code>startInstant</code> and
     *   <code>startInstant</code> plus this <code>Duration</code>
     *
     * @throws NullPointerException if <code>startInstant</code> parameter
     * is null.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private int getInt(DatatypeConstants.Field field) {

    /**
     * <p>Return the requested field value as an int.</p>
     *
     * <p>If field is not set, i.e. == null, 0 is returned.</p>
     *
     * @param field To get value for.
     *
     * @return int value of field or 0 if field is not set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getSeconds() {

    /**
     * Obtains the value of the SECONDS field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the SECONDS field.
     *
     * @return seconds in the integer value. The fraction of seconds
     *   will be discarded (for example, if the actual value is 2.5,
     *   this method returns 2)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getMinutes() {

    /**
     * Obtains the value of the MINUTES field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the MINUTES field.
     *
     * @return Minutes of this <code>Duration</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getHours() {

    /**
     * Obtains the value of the HOURS field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the HOURS field.
     *
     * @return Hours of this <code>Duration</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getDays() {

    /**
     * Obtains the value of the DAYS field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the DAYS field.
     *
     * @return Days of this <code>Duration</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getMonths() {

    /**
     * Obtains the value of the MONTHS field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the MONTHS field.
     *
     * @return Months of this <code>Duration</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getYears() {

    /**
     * Obtains the value of the YEARS field as an integer value,
     * or 0 if not present.
     *
     * <p>
     * This method is a convenience method around the
     * {@link #getField(DatatypeConstants.Field)} method.
     *
     * <p>
     * Note that since this method returns <tt>int</tt>, this
     * method will return an incorrect value for {@link Duration}s
     * with the year field that goes beyond the range of <tt>int</tt>.
     * Use <code>getField(YEARS)</code> to avoid possible loss of precision.</p>
     *
     * @return
     *      If the YEARS field is present, return
     *      its value as an integer by using the {@link Number#intValue()}
     *      method. If the YEARS field is not present, return 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
        String methodName = "javax.xml.datatype.Duration" + "#(getSet(DatatypeConstants.Field field)";

                /**
                throw new IllegalArgumentException(
                        "javax.xml.datatype.Duration"
                        + "#(getSet(DatatypeConstants.Field field) called with an unknown field: "
                        + field.toString()
                );
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Number getField(DatatypeConstants.Field field) {

    /**
     * Gets the value of a field.
     *
     * Fields of a duration object may contain arbitrary large value.
     * Therefore this method is designed to return a {@link Number} object.
     *
     * In case of YEARS, MONTHS, DAYS, HOURS, and MINUTES, the returned
     * number will be a non-negative integer. In case of seconds,
     * the returned number may be a non-negative decimal value.
     *
     * @param field
     *      one of the six Field constants (YEARS,MONTHS,DAYS,HOURS,
     *      MINUTES, or SECONDS.)
     * @return
     *      If the specified field is present, this method returns
     *      a non-null non-negative {@link Number} object that
     *      represents its value. If it is not present, return null.
     *      For YEARS, MONTHS, DAYS, HOURS, and MINUTES, this method
     *      returns a {@link BigInteger} object. For SECONDS, this
     *      method returns a {@link BigDecimal}.
     *
     * @throws NullPointerException
     *      If the field parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public boolean isSet(DatatypeConstants.Field field) {

    /**
     * Checks if a field is set.
     *
     * A field of a duration object may or may not be present.
     * This method can be used to test if a field is present.
     *
     * @param field
     *      one of the six Field constants (YEARS,MONTHS,DAYS,HOURS,
     *      MINUTES, or SECONDS.)
     * @return
     *      true if the field is present. false if not.
     *
     * @throws NullPointerException
     *      If the field parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private String toString(BigDecimal bd) {

    /**
     * <p>Turns {@link BigDecimal} to a string representation.</p>
     *
     * <p>Due to a behavior change in the {@link BigDecimal#toString()}
     * method in JDK1.5, this had to be implemented here.</p>
     *
     * @param bd <code>BigDecimal</code> to format as a <code>String</code>
     *
     * @return  <code>String</code> representation of <code>BigDecimal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public String toString() {

    /**
     * Returns a string representation of this duration object.
     *
     * <p>
     * The result is formatter according to the XML Schema 1.0
     * spec and can be always parsed back later into the
     * equivalent duration object by
     * the {@link #DurationImpl(String)} constructor.
     *
     * <p>
     * Formally, the following holds for any {@link Duration}
     * object x.
     * <pre>
     * new Duration(x.toString()).equals(x)
     * </pre>
     *
     * @return
     *      Always return a non-null valid String object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int hashCode() {

    /**
     * Returns a hash code consistent with the definition of the equals method.
     *
     * @see Object#hashCode()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private int compareDates(Duration duration1, Duration duration2) {

    /**
     * Compares 2 given durations. (refer to W3C Schema Datatypes "3.2.6 duration")
     *
     * @param duration1  Unnormalized duration
     * @param duration2  Unnormalized duration
     * @return INDETERMINATE if the order relationship between date1 and date2 is indeterminate.
     * EQUAL if the order relation between date1 and date2 is EQUAL.
     * If the strict parameter is true, return LESS_THAN if date1 is less than date2 and
     * return GREATER_THAN if date1 is greater than date2.
     * If the strict parameter is false, return LESS_THAN if date1 is less than OR equal to date2 and
     * return GREATER_THAN if date1 is greater than OR equal to date2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int compare(Duration rhs) {

        /**
         * <p>Partial order relation comparison with this <code>Duration</code> instance.</p>
         *
         * <p>Comparison result must be in accordance with
         * <a href="http://www.w3.org/TR/xmlschema-2/#duration-order">W3C XML Schema 1.0 Part 2, Section 3.2.7.6.2,
         * <i>Order relation on duration</i></a>.</p>
         *
         * <p>Return:</p>
         * <ul>
         *   <li>{@link DatatypeConstants#LESSER} if this <code>Duration</code> is shorter than <code>duration</code> parameter</li>
         *   <li>{@link DatatypeConstants#EQUAL} if this <code>Duration</code> is equal to <code>duration</code> parameter</li>
         *   <li>{@link DatatypeConstants#GREATER} if this <code>Duration</code> is longer than <code>duration</code> parameter</li>
         *   <li>{@link DatatypeConstants#INDETERMINATE} if a conclusive partial order relation cannot be determined</li>
         * </ul>
         *
         * @param duration to compare
         *
         * @return the relationship between <code>this</code> <code>Duration</code>and <code>duration</code> parameter as
         *   {@link DatatypeConstants#LESSER}, {@link DatatypeConstants#EQUAL}, {@link DatatypeConstants#GREATER}
         *   or {@link DatatypeConstants#INDETERMINATE}.
         *
         * @throws UnsupportedOperationException If the underlying implementation
         *   cannot reasonably process the request, e.g. W3C XML Schema allows for
         *   arbitrarily large/small/precise values, the request may be beyond the
         *   implementations capability.
         * @throws NullPointerException if <code>duration</code> is <code>null</code>.
         *
         * @see #isShorterThan(Duration)
         * @see #isLongerThan(Duration)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final XMLGregorianCalendar[] TEST_POINTS = new XMLGregorianCalendar[] {

    /**
     * <p>Four constants defined for the comparison of durations.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static BigDecimal parseBigDecimal(
        String whole,
        String part,
        int index)

    /**
     * TODO: Javadoc.
     *
     * @param whole TODO: ???.
     * @param part TODO: ???.
     * @param index TODO: ???.
     *
     * @return TODO: ???.
     *
     * @throws IllegalArgumentException TODO: ???.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static BigInteger parseBigInteger(
        String whole,
        String part,
        int index)

    /**
     * TODO: Javadoc
     *
     * @param whole TODO: ???.
     * @param part TODO: ???.
     * @param index TODO: ???.
     *
     * @return TODO: ???.
     *
     * @throws IllegalArgumentException TODO: ???.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static void organizeParts(
        String whole,
        String[] parts,
        int[] partsIndex,
        int len,
        String tokens)

    /**
     * TODO: Javadoc.
     *
     * @param whole TODO: ???
     * @param parts TODO: ???
     * @param partsIndex TODO: ???
     * @param len TODO: ???
     * @param tokens TODO: ???
     *
     * @throws IllegalArgumentException TODO: ???
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static String parsePiece(String whole, int[] idx)

    /**
     * TODO: Javadoc
     *
     * @param whole String to parse.
     * @param idx TODO: ???
     *
     * @return Result of parsing.
     *
     * @throws IllegalArgumentException If whole cannot be parsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static boolean isDigitOrPeriod(char ch) {

    /**
     * TODO: Javadoc
     *
     * @param ch to test.
     *
     * @return true if ch is a digit or a period, else false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static boolean isDigit(char ch) {

    /**
     * TODO: Javadoc
     *
     * @param ch char to test.
     *
     * @return true if ch is a digit, else false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected DurationImpl(String lexicalRepresentation)

    /**
     * Constructs a new Duration object by
     * parsing its string representation
     * "PnYnMnDTnHnMnS" as defined in XML Schema 1.0 section 3.2.6.1.
     *
     * <p>
     * The string representation may not have any leading
     * and trailing whitespaces.
     *
     * <p>
     * For example, this method parses strings like
     * "P1D" (1 day), "-PT100S" (-100 sec.), "P1DT12H" (1 days and 12 hours).
     *
     * <p>
     * The parsing is done field by field so that
     * the following holds for any lexically correct string x:
     * <pre>
     * new Duration(x).toString().equals(x)
     * </pre>
     *
     * Returns a non-null valid duration object that holds the value
     * indicated by the lexicalRepresentation parameter.
     *
     * @param lexicalRepresentation
     *      Lexical representation of a duration.
     * @throws IllegalArgumentException
     *      If the given string does not conform to the aforementioned
     *      specification.
     * @throws NullPointerException
     *      If the given string is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected DurationImpl(final long durationInMilliSeconds) {

    /**
     * <p>Constructs a new Duration object by specifying the duration
     * in milliseconds.</p>
     *
     * @param durationInMilliSeconds
     *      The length of the duration in milliseconds.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected static BigInteger wrap(final int i) {

        /**
         * TODO: Javadoc
         *
         * @param i int to convert to BigInteger.
         *
         * @return BigInteger representation of int.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected DurationImpl(
        final boolean isPositive,
        final int years,
        final int months,
        final int days,
        final int hours,
        final int minutes,
        final int seconds) {

    /**
     * <p>Constructs a new Duration object by specifying each field
     * individually.</p>
     *
     * <p>This method is functionally equivalent to
     * invoking another constructor by wrapping
     * all non-zero parameters into {@link BigInteger} and {@link BigDecimal}.
     * Zero value of int parameter is equivalent of null value of
     * the corresponding field.</p>
     *
     * @see #DurationImpl(boolean, BigInteger, BigInteger, BigInteger, BigInteger,
     *   BigInteger, BigDecimal)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected static void testNonNegative(BigDecimal n, DatatypeConstants.Field f) {

    /**
     * <p>Makes sure that the given number is non-negative. If it is not,
     * throw {@link IllegalArgumentException}.</p>
     *
     * @param n Number to test.
     * @param f Field to test.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected static void testNonNegative(BigInteger n, DatatypeConstants.Field f) {

    /**
     * <p>Makes sure that the given number is non-negative. If it is not,
     * throw {@link IllegalArgumentException}.</p>
     *
     * @param n Number to test.
     * @param f Field to test.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected DurationImpl(
        boolean isPositive,
        BigInteger years,
        BigInteger months,
        BigInteger days,
        BigInteger hours,
        BigInteger minutes,
        BigDecimal seconds) {

    /**
     * <p>Constructs a new Duration object by specifying each field individually.</p>
     *
     * <p>All the parameters are optional as long as at least one field is present.
     * If specified, parameters have to be zero or positive.</p>
     *
     * @param isPositive Set to <code>false</code> to create a negative duration. When the length
     *   of the duration is zero, this parameter will be ignored.
     * @param years of this <code>Duration</code>
     * @param months of this <code>Duration</code>
     * @param days of this <code>Duration</code>
     * @param hours of this <code>Duration</code>
     * @param minutes of this <code>Duration</code>
     * @param seconds of this <code>Duration</code>
     *
     * @throws IllegalArgumentException
     *    If years, months, days, hours, minutes and
     *    seconds parameters are all <code>null</code>. Or if any
     *    of those parameters are negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected int calcSignum(boolean isPositive) {

        /**
         * TODO: Javadoc
         * @param isPositive Sign.
         *
         * @return 1 if positive, else -1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
        public int getSign() {

        /**
         * Returns the sign of this duration in -1,0, or 1.
         *
         * @return
         *      -1 if this duration is negative, 0 if the duration is zero,
         *      and 1 if the duration is postive.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigDecimal seconds;

    /**
     * <p>Seconds of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigInteger minutes;

    /**
     * <p>Minutes of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigInteger hours;

    /**
     * <p>Hours of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigInteger days;

    /**
     * <p>Days of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigInteger months;

    /**
     * <p>Months of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    /**

    /**
     * <p>Years of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected int signum;

    /**
     * <p>Indicates the sign. -1, 0 or 1 if the duration is negative,
     * zero, or positive.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
        private static final BigDecimal ZERO = BigDecimal.valueOf((long) 0);

        /**
         * <p>BigDecimal value of 0.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");

    /**
     * TimeZone for GMT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
                private static final int[] FIELD_IDS = {

                /**
                 * <p>Internal array of value Field ids.</p>
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
        private static final DatatypeConstants.Field[] FIELDS = new DatatypeConstants.Field[]{

    /**
     * <p>Internal array of value Fields.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final int FIELD_NUM = 6;

    /**
     * <p>Number of Fields.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
class DurationImpl

/**
 * <p>Immutable representation of a time span as defined in
 * the W3C XML Schema 1.0 specification.</p>
 *
 * <p>A Duration object represents a period of Gregorian time,
 * which consists of six fields (years, months, days, hours,
 * minutes, and seconds) plus a sign (+/-) field.</p>
 *
 * <p>The first five fields have non-negative (>=0) integers or null
 * (which represents that the field is not set),
 * and the seconds field has a non-negative decimal or null.
 * A negative sign indicates a negative duration.</p>
 *
 * <p>This class provides a number of methods that make it easy
 * to use for the duration datatype of XML Schema 1.0 with
 * the errata.</p>
 *
 * <h2>Order relationship</h2>
 * <p>Duration objects only have partial order, where two values A and B
 * maybe either:</p>
 * <ol>
 *  <li>A&lt;B (A is shorter than B)
 *  <li>A&gt;B (A is longer than B)
 *  <li>A==B   (A and B are of the same duration)
 *  <li>A&lt;>B (Comparison between A and B is indeterminate)
 * </ol>
 * <p>For example, 30 days cannot be meaningfully compared to one month.
 * The {@link #compare(Duration)} method implements this
 * relationship.</p>
 *
 * <p>See the {@link #isLongerThan(Duration)} method for details about
 * the order relationship among {@link Duration} objects.</p>
 *
 *
 *
 * <h2>Operations over Duration</h2>
 * <p>This class provides a set of basic arithmetic operations, such
 * as addition, subtraction and multiplication.
 * Because durations don't have total order, an operation could
 * fail for some combinations of operations. For example, you cannot
 * subtract 15 days from 1 month. See the javadoc of those methods
 * for detailed conditions where this could happen.</p>
 *
 * <p>Also, division of a duration by a number is not provided because
 * the {@link Duration} class can only deal with finite precision
 * decimal numbers. For example, one cannot represent 1 sec divided by 3.</p>
 *
 * <p>However, you could substitute a division by 3 with multiplying
 * by numbers such as 0.3 or 0.333.</p>
 *
 *
 *
 * <h2>Range of allowed values</h2>
 * <p>
 * Because some operations of {@link Duration} rely on {@link Calendar}
 * even though {@link Duration} can hold very large or very small values,
 * some of the methods may not work correctly on such {@link Duration}s.
 * The impacted methods document their dependency on {@link Calendar}.
 *
 *
 * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @author <a href="mailto:Joseph.Fialli@Sun.com">Joseph Fialli</a>
 * @version $Revision: 1.8 $, $Date: 2010/05/19 23:20:06 $

 * @see XMLGregorianCalendar#add(Duration)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static long getCalendarTimeInMillis(Calendar cal) {

    /**
     * Calls the {@link Calendar#getTimeInMillis} method.
     * Prior to JDK1.4, this method was protected and therefore
     * cannot be invoked directly.
     *
     * In future, this should be replaced by
     * <code>cal.getTimeInMillis()</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static class DurationStream implements Serializable {

    /**
     * Representation of {@link Duration} in the object stream.
     *
     * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private Object writeReplace() throws IOException {

    /**
     * Writes {@link Duration} as a lexical representation
     * for maximum future compatibility.
     *
     * @return
     *      An object that encapsulates the string
     *      returned by <code>this.toString()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final long serialVersionUID = 1L;

    /**
     * <p>Stream Unique Identifier.</p>
     *
     * <p>TODO: Serialization should use the XML string representation as
     * the serialization format to ensure future compatibility.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public void addTo(Date date) {

    /**
     * Adds this duration to a {@link Date} object.
     *
     * <p>
     * The given date is first converted into
     * a {@link java.util.GregorianCalendar}, then the duration
     * is added exactly like the {@link #addTo(Calendar)} method.
     *
     * <p>
     * The updated time instant is then converted back into a
     * {@link Date} object and used to update the given {@link Date} object.
     *
     * <p>
     * This somewhat redundant computation is necessary to unambiguously
     * determine the duration of months and years.
     *
     * @param date
     *      A date object whose value will be modified.
     * @throws NullPointerException
     *      if the date parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public void addTo(Calendar calendar) {

    /**
     * Adds this duration to a {@link Calendar} object.
     *
     * <p>
     * Calls {@link java.util.Calendar#add(int,int)} in the
     * order of YEARS, MONTHS, DAYS, HOURS, MINUTES, SECONDS, and MILLISECONDS
     * if those fields are present. Because the {@link Calendar} class
     * uses int to hold values, there are cases where this method
     * won't work correctly (for example if values of fields
     * exceed the range of int.)
     * </p>
     *
     * <p>
     * Also, since this duration class is a Gregorian duration, this
     * method will not work correctly if the given {@link Calendar}
     * object is based on some other calendar systems.
     * </p>
     *
     * <p>
     * Any fractional parts of this {@link Duration} object
     * beyond milliseconds will be simply ignored. For example, if
     * this duration is "P1.23456S", then 1 is added to SECONDS,
     * 234 is added to MILLISECONDS, and the rest will be unused.
     * </p>
     *
     * <p>
     * Note that because {@link Calendar#add(int, int)} is using
     * <tt>int</tt>, {@link Duration} with values beyond the
     * range of <tt>int</tt> in its fields
     * will cause overflow/underflow to the given {@link Calendar}.
     * {@link XMLGregorianCalendar#add(Duration)} provides the same
     * basic operation as this method while avoiding
     * the overflow/underflow issues.
     *
     * @param calendar
     *      A calendar object whose value will be modified.
     * @throws NullPointerException
     *      if the calendar parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int signum() {

    /**
     * Returns the sign of this duration in -1,0, or 1.
     *
     * @return
     *      -1 if this duration is negative, 0 if the duration is zero,
     *      and 1 if the duration is postive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration negate() {

    /**
     * Returns a new {@link Duration} object whose
     * value is <code>-this</code>.
     *
     * <p>
     * Since the {@link Duration} class is immutable, this method
     * doesn't change the value of this object. It simply computes
     * a new Duration object and returns it.
     *
     * @return
     *      always return a non-null valid {@link Duration} object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration subtract(final Duration rhs) {

    /**
     * <p>Computes a new duration whose value is <code>this-rhs</code>.</p>
     *
     * <p>For example:</p>
     * <pre>
     * "1 day" - "-3 days" = "4 days"
     * "1 year" - "1 day" = IllegalStateException
     * "-(1 hour,50 minutes)" - "-20 minutes" = "-(1hours,30 minutes)"
     * "15 hours" - "-3 days" = "3 days and 15 hours"
     * "1 year" - "-1 day" = "1 year and 1 day"
     * </pre>
     *
     * <p>Since there's no way to meaningfully subtract 1 day from 1 month,
     * there are cases where the operation fails in {@link IllegalStateException}.</p>
     *
     * <p>Formally the computation is defined as follows.
     * First, we can assume that two {@link Duration}s are both positive
     * without losing generality.  (i.e.,
     * <code>(-X)-Y=-(X+Y)</code>, <code>X-(-Y)=X+Y</code>,
     * <code>(-X)-(-Y)=-(X-Y)</code>)</p>
     *
     * <p>Then two durations are subtracted field by field.
     * If the sign of any non-zero field <tt>F</tt> is different from
     * the sign of the most significant field,
     * 1 (if <tt>F</tt> is negative) or -1 (otherwise)
     * will be borrowed from the next bigger unit of <tt>F</tt>.</p>
     *
     * <p>This process is repeated until all the non-zero fields have
     * the same sign.</p>
     *
     * <p>If a borrow occurs in the days field (in other words, if
     * the computation needs to borrow 1 or -1 month to compensate
     * days), then the computation fails by throwing an
     * {@link IllegalStateException}.</p>
     *
     * @param rhs <code>Duration</code> to substract from this <code>Duration</code>.
     *
     * @return New <code>Duration</code> created from subtracting <code>rhs</code> from this <code>Duration</code>.
     *
     * @throws IllegalStateException
     *      If two durations cannot be meaningfully subtracted. For
     *      example, subtracting one day from one month causes
     *      this exception.
     *
     * @throws NullPointerException
     *      If the rhs parameter is null.
     *
     * @see #add(Duration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    static BigDecimal sanitize(BigDecimal value, int signum) {

    /**
     * <p>Compute <code>value*signum</code> where <code>value==null</code> is treated as <code>value==0</code></p>.
     *
     * @param value Value to sanitize.
     * @param signum 0 to sanitize to 0, > 0 to sanitize to <code>value</code>, < 0 to sanitize to negative <code>value</code>.
     *
     * @return non-null {@link BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static BigDecimal sanitize(BigInteger value, int signum) {

    /**
     * Compute <code>value*signum</code> where value==null is treated as
     * value==0.
     * @param value Value to sanitize.
     * @param signum 0 to sanitize to 0, > 0 to sanitize to <code>value</code>, < 0 to sanitize to negative <code>value</code>.
     *
     * @return non-null {@link BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration add(final Duration rhs) {

    /**
     * <p>Computes a new duration whose value is <code>this+rhs</code>.</p>
     *
     * <p>For example,</p>
     * <pre>
     * "1 day" + "-3 days" = "-2 days"
     * "1 year" + "1 day" = "1 year and 1 day"
     * "-(1 hour,50 minutes)" + "-20 minutes" = "-(1 hours,70 minutes)"
     * "15 hours" + "-3 days" = "-(2 days,9 hours)"
     * "1 year" + "-1 day" = IllegalStateException
     * </pre>
     *
     * <p>Since there's no way to meaningfully subtract 1 day from 1 month,
     * there are cases where the operation fails in
     * {@link IllegalStateException}.</p>
     *
     * <p>
     * Formally, the computation is defined as follows.</p>
     * <p>
     * Firstly, we can assume that two {@link Duration}s to be added
     * are both positive without losing generality (i.e.,
     * <code>(-X)+Y=Y-X</code>, <code>X+(-Y)=X-Y</code>,
     * <code>(-X)+(-Y)=-(X+Y)</code>)
     *
     * <p>
     * Addition of two positive {@link Duration}s are simply defined as
     * field by field addition where missing fields are treated as 0.
     * <p>
     * A field of the resulting {@link Duration} will be unset if and
     * only if respective fields of two input {@link Duration}s are unset.
     * <p>
     * Note that <code>lhs.add(rhs)</code> will be always successful if
     * <code>lhs.signum()*rhs.signum()!=-1</code> or both of them are
     * normalized.</p>
     *
     * @param rhs <code>Duration</code> to add to this <code>Duration</code>
     *
     * @return
     *      non-null valid Duration object.
     *
     * @throws NullPointerException
     *      If the rhs parameter is null.
     * @throws IllegalStateException
     *      If two durations cannot be meaningfully added. For
     *      example, adding negative one day to one month causes
     *      this exception.
     *
     *
     * @see #subtract(Duration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final BigDecimal[] FACTORS = new BigDecimal[]{

    /**
     * 1 unit of FIELDS[i] is equivalent to <code>FACTORS[i]</code> unit of
     * FIELDS[i+1].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static BigInteger toBigInteger(
        BigDecimal value,
        boolean canBeNull) {

    /**
     * <p>BigInteger value of BigDecimal value.</p>
     *
     * @param value Value to convert.
     * @param canBeNull Can returned value be null?
     *
     * @return BigInteger value of BigDecimal, possibly null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private BigDecimal getFieldAsBigDecimal(DatatypeConstants.Field f) {

    /**
     * <p>Gets the value of the field as a {@link BigDecimal}.</p>
     *
     * <p>If the field is unset, return 0.</p>
     *
     * @param f Field to get value for.
     *
     * @return  non-null valid {@link BigDecimal}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration multiply(BigDecimal factor) {

    /**
     * Computes a new duration whose value is <code>factor</code> times
     * longer than the value of this duration.
     *
     * <p>
     * For example,
     * <pre>
     * "P1M" (1 month) * "12" = "P12M" (12 months)
     * "PT1M" (1 min) * "0.3" = "PT18S" (18 seconds)
     * "P1M" (1 month) * "1.5" = IllegalStateException
     * </pre>
     *
     * <p>
     * Since the {@link Duration} class is immutable, this method
     * doesn't change the value of this object. It simply computes
     * a new Duration object and returns it.
     *
     * <p>
     * The operation will be performed field by field with the precision
     * of {@link BigDecimal}. Since all the fields except seconds are
     * restricted to hold integers,
     * any fraction produced by the computation will be
     * carried down toward the next lower unit. For example,
     * if you multiply "P1D" (1 day) with "0.5", then it will be 0.5 day,
     * which will be carried down to "PT12H" (12 hours).
     * When fractions of month cannot be meaningfully carried down
     * to days, or year to months, this will cause an
     * {@link IllegalStateException} to be thrown.
     * For example if you multiple one month by 0.5.</p>
     *
     * <p>
     * To avoid {@link IllegalStateException}, use
     * the {@link #normalizeWith(Calendar)} method to remove the years
     * and months fields.
     *
     * @param factor to multiply by
     *
     * @return
     *      returns a non-null valid {@link Duration} object
     *
     * @throws IllegalStateException if operation produces fraction in
     * the months field.
     *
     * @throws NullPointerException if the <code>factor</code> parameter is
     * <code>null</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration multiply(int factor) {

    /**
     * <p>Computes a new duration whose value is <code>factor</code> times
     * longer than the value of this duration.</p>
     *
     * <p>This method is provided for the convenience.
     * It is functionally equivalent to the following code:</p>
     * <pre>
     * multiply(new BigDecimal(String.valueOf(factor)))
     * </pre>
     *
     * @param factor Factor times longer of new <code>Duration</code> to create.
     *
     * @return New <code>Duration</code> that is <code>factor</code>times longer than this <code>Duration</code>.
     *
     * @see #multiply(BigDecimal)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Duration normalizeWith(Calendar startTimeInstant) {

    /**
     * <p>Converts the years and months fields into the days field
     * by using a specific time instant as the reference point.</p>
     *
     * <p>For example, duration of one month normalizes to 31 days
     * given the start time instance "July 8th 2003, 17:40:32".</p>
     *
     * <p>Formally, the computation is done as follows:</p>
     * <ol>
     *  <li>The given Calendar object is cloned.
     *  <li>The years, months and days fields will be added to
     *      the {@link Calendar} object
     *      by using the {@link Calendar#add(int,int)} method.
     *  <li>The difference between two Calendars are computed in terms of days.
     *  <li>The computed days, along with the hours, minutes and seconds
     *      fields of this duration object is used to construct a new
     *      Duration object.
     * </ol>
     *
     * <p>Note that since the Calendar class uses <code>int</code> to
     * hold the value of year and month, this method may produce
     * an unexpected result if this duration object holds
     * a very large value in the years or months fields.</p>
     *
     * @param startTimeInstant <code>Calendar</code> reference point.
     *
     * @return <code>Duration</code> of years and months of this <code>Duration</code> as days.
     *
     * @throws NullPointerException If the startTimeInstant parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
//    public Duration normalize() {

//    /**
//     * Returns an equivalent but "normalized" duration value.
//     *
//     * Intuitively, the normalization moves YEARS into
//     * MONTHS (by x12) and moves DAYS, HOURS, and MINUTES fields
//     * into SECONDS (by x86400, x3600, and x60 respectively.)
//     *
//     *
//     * Formally, this method satisfies the following conditions:
//     * <ul>
//     *  <li>x.normalize().equals(x)
//     *  <li>!x.normalize().isSet(Duration.YEARS)
//     *  <li>!x.normalize().isSet(Duration.DAYS)
//     *  <li>!x.normalize().isSet(Duration.HOURS)
//     *  <li>!x.normalize().isSet(Duration.MINUTES)
//     * </ul>
//     *
//     * @return
//     *      always return a non-null valid value.
//     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public long getTimeInMillis(final Date startInstant) {

    /**
     * <p>Returns the length of the duration in milli-seconds.</p>
     *
     * <p>If the seconds field carries more digits than milli-second order,
     * those will be simply discarded (or in other words, rounded to zero.)
     * For example, for any <code>Date</code> value <code>x<code>,</p>
     * <pre>
     * <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>.
     * <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>.
     * </pre>
     *
     * <p>
     * Note that this method uses the {@link #addTo(Date)} method,
     * which may work incorectly with {@link Duration} objects with
     * very large values in its fields. See the {@link #addTo(Date)}
     * method for details.
     *
     * @param startInstant
     *      The length of a month/year varies. The <code>startInstant</code> is
     *      used to disambiguate this variance. Specifically, this method
     *      returns the difference between <code>startInstant</code> and
     *      <code>startInstant+duration</code>.
     *
     * @throws NullPointerException
     *      If the startInstant parameter is null.
     *
     * @return milliseconds between <code>startInstant</code> and
     *   <code>startInstant</code> plus this <code>Duration</code>
     *
     * @see #getTimeInMillis(Calendar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public long getTimeInMillis(final Calendar startInstant) {

    /**
     * <p>Returns the length of the duration in milli-seconds.</p>
     *
     * <p>If the seconds field carries more digits than milli-second order,
     * those will be simply discarded (or in other words, rounded to zero.)
     * For example, for any Calendar value <code>x<code>,</p>
     * <pre>
     * <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>.
     * <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>.
     * </pre>
     *
     * <p>
     * Note that this method uses the {@link #addTo(Calendar)} method,
     * which may work incorectly with {@link Duration} objects with
     * very large values in its fields. See the {@link #addTo(Calendar)}
     * method for details.
     *
     * @param startInstant
     *      The length of a month/year varies. The <code>startInstant</code> is
     *      used to disambiguate this variance. Specifically, this method
     *      returns the difference between <code>startInstant</code> and
     *      <code>startInstant+duration</code>
     *
     * @return milliseconds between <code>startInstant</code> and
     *   <code>startInstant</code> plus this <code>Duration</code>
     *
     * @throws NullPointerException if <code>startInstant</code> parameter
     * is null.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private int getInt(DatatypeConstants.Field field) {

    /**
     * <p>Return the requested field value as an int.</p>
     *
     * <p>If field is not set, i.e. == null, 0 is returned.</p>
     *
     * @param field To get value for.
     *
     * @return int value of field or 0 if field is not set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getSeconds() {

    /**
     * Obtains the value of the SECONDS field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the SECONDS field.
     *
     * @return seconds in the integer value. The fraction of seconds
     *   will be discarded (for example, if the actual value is 2.5,
     *   this method returns 2)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getMinutes() {

    /**
     * Obtains the value of the MINUTES field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the MINUTES field.
     *
     * @return Minutes of this <code>Duration</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getHours() {

    /**
     * Obtains the value of the HOURS field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the HOURS field.
     *
     * @return Hours of this <code>Duration</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getDays() {

    /**
     * Obtains the value of the DAYS field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the DAYS field.
     *
     * @return Days of this <code>Duration</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getMonths() {

    /**
     * Obtains the value of the MONTHS field as an integer value,
     * or 0 if not present.
     *
     * This method works just like {@link #getYears()} except
     * that this method works on the MONTHS field.
     *
     * @return Months of this <code>Duration</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int getYears() {

    /**
     * Obtains the value of the YEARS field as an integer value,
     * or 0 if not present.
     *
     * <p>
     * This method is a convenience method around the
     * {@link #getField(DatatypeConstants.Field)} method.
     *
     * <p>
     * Note that since this method returns <tt>int</tt>, this
     * method will return an incorrect value for {@link Duration}s
     * with the year field that goes beyond the range of <tt>int</tt>.
     * Use <code>getField(YEARS)</code> to avoid possible loss of precision.</p>
     *
     * @return
     *      If the YEARS field is present, return
     *      its value as an integer by using the {@link Number#intValue()}
     *      method. If the YEARS field is not present, return 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
        String methodName = "javax.xml.datatype.Duration" + "#(getSet(DatatypeConstants.Field field)";

                /**
                throw new IllegalArgumentException(
                        "javax.xml.datatype.Duration"
                        + "#(getSet(DatatypeConstants.Field field) called with an unknown field: "
                        + field.toString()
                );
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public Number getField(DatatypeConstants.Field field) {

    /**
     * Gets the value of a field.
     *
     * Fields of a duration object may contain arbitrary large value.
     * Therefore this method is designed to return a {@link Number} object.
     *
     * In case of YEARS, MONTHS, DAYS, HOURS, and MINUTES, the returned
     * number will be a non-negative integer. In case of seconds,
     * the returned number may be a non-negative decimal value.
     *
     * @param field
     *      one of the six Field constants (YEARS,MONTHS,DAYS,HOURS,
     *      MINUTES, or SECONDS.)
     * @return
     *      If the specified field is present, this method returns
     *      a non-null non-negative {@link Number} object that
     *      represents its value. If it is not present, return null.
     *      For YEARS, MONTHS, DAYS, HOURS, and MINUTES, this method
     *      returns a {@link BigInteger} object. For SECONDS, this
     *      method returns a {@link BigDecimal}.
     *
     * @throws NullPointerException
     *      If the field parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public boolean isSet(DatatypeConstants.Field field) {

    /**
     * Checks if a field is set.
     *
     * A field of a duration object may or may not be present.
     * This method can be used to test if a field is present.
     *
     * @param field
     *      one of the six Field constants (YEARS,MONTHS,DAYS,HOURS,
     *      MINUTES, or SECONDS.)
     * @return
     *      true if the field is present. false if not.
     *
     * @throws NullPointerException
     *      If the field parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private String toString(BigDecimal bd) {

    /**
     * <p>Turns {@link BigDecimal} to a string representation.</p>
     *
     * <p>Due to a behavior change in the {@link BigDecimal#toString()}
     * method in JDK1.5, this had to be implemented here.</p>
     *
     * @param bd <code>BigDecimal</code> to format as a <code>String</code>
     *
     * @return  <code>String</code> representation of <code>BigDecimal</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public String toString() {

    /**
     * Returns a string representation of this duration object.
     *
     * <p>
     * The result is formatter according to the XML Schema 1.0
     * spec and can be always parsed back later into the
     * equivalent duration object by
     * the {@link #DurationImpl(String)} constructor.
     *
     * <p>
     * Formally, the following holds for any {@link Duration}
     * object x.
     * <pre>
     * new Duration(x.toString()).equals(x)
     * </pre>
     *
     * @return
     *      Always return a non-null valid String object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int hashCode() {

    /**
     * Returns a hash code consistent with the definition of the equals method.
     *
     * @see Object#hashCode()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private int compareDates(Duration duration1, Duration duration2) {

    /**
     * Compares 2 given durations. (refer to W3C Schema Datatypes "3.2.6 duration")
     *
     * @param duration1  Unnormalized duration
     * @param duration2  Unnormalized duration
     * @return INDETERMINATE if the order relationship between date1 and date2 is indeterminate.
     * EQUAL if the order relation between date1 and date2 is EQUAL.
     * If the strict parameter is true, return LESS_THAN if date1 is less than date2 and
     * return GREATER_THAN if date1 is greater than date2.
     * If the strict parameter is false, return LESS_THAN if date1 is less than OR equal to date2 and
     * return GREATER_THAN if date1 is greater than OR equal to date2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    public int compare(Duration rhs) {

        /**
         * <p>Partial order relation comparison with this <code>Duration</code> instance.</p>
         *
         * <p>Comparison result must be in accordance with
         * <a href="http://www.w3.org/TR/xmlschema-2/#duration-order">W3C XML Schema 1.0 Part 2, Section 3.2.7.6.2,
         * <i>Order relation on duration</i></a>.</p>
         *
         * <p>Return:</p>
         * <ul>
         *   <li>{@link DatatypeConstants#LESSER} if this <code>Duration</code> is shorter than <code>duration</code> parameter</li>
         *   <li>{@link DatatypeConstants#EQUAL} if this <code>Duration</code> is equal to <code>duration</code> parameter</li>
         *   <li>{@link DatatypeConstants#GREATER} if this <code>Duration</code> is longer than <code>duration</code> parameter</li>
         *   <li>{@link DatatypeConstants#INDETERMINATE} if a conclusive partial order relation cannot be determined</li>
         * </ul>
         *
         * @param duration to compare
         *
         * @return the relationship between <code>this</code> <code>Duration</code>and <code>duration</code> parameter as
         *   {@link DatatypeConstants#LESSER}, {@link DatatypeConstants#EQUAL}, {@link DatatypeConstants#GREATER}
         *   or {@link DatatypeConstants#INDETERMINATE}.
         *
         * @throws UnsupportedOperationException If the underlying implementation
         *   cannot reasonably process the request, e.g. W3C XML Schema allows for
         *   arbitrarily large/small/precise values, the request may be beyond the
         *   implementations capability.
         * @throws NullPointerException if <code>duration</code> is <code>null</code>.
         *
         * @see #isShorterThan(Duration)
         * @see #isLongerThan(Duration)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final XMLGregorianCalendar[] TEST_POINTS = new XMLGregorianCalendar[] {

    /**
     * <p>Four constants defined for the comparison of durations.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static BigDecimal parseBigDecimal(
        String whole,
        String part,
        int index)

    /**
     * TODO: Javadoc.
     *
     * @param whole TODO: ???.
     * @param part TODO: ???.
     * @param index TODO: ???.
     *
     * @return TODO: ???.
     *
     * @throws IllegalArgumentException TODO: ???.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static BigInteger parseBigInteger(
        String whole,
        String part,
        int index)

    /**
     * TODO: Javadoc
     *
     * @param whole TODO: ???.
     * @param part TODO: ???.
     * @param index TODO: ???.
     *
     * @return TODO: ???.
     *
     * @throws IllegalArgumentException TODO: ???.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static void organizeParts(
        String whole,
        String[] parts,
        int[] partsIndex,
        int len,
        String tokens)

    /**
     * TODO: Javadoc.
     *
     * @param whole TODO: ???
     * @param parts TODO: ???
     * @param partsIndex TODO: ???
     * @param len TODO: ???
     * @param tokens TODO: ???
     *
     * @throws IllegalArgumentException TODO: ???
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static String parsePiece(String whole, int[] idx)

    /**
     * TODO: Javadoc
     *
     * @param whole String to parse.
     * @param idx TODO: ???
     *
     * @return Result of parsing.
     *
     * @throws IllegalArgumentException If whole cannot be parsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static boolean isDigitOrPeriod(char ch) {

    /**
     * TODO: Javadoc
     *
     * @param ch to test.
     *
     * @return true if ch is a digit or a period, else false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static boolean isDigit(char ch) {

    /**
     * TODO: Javadoc
     *
     * @param ch char to test.
     *
     * @return true if ch is a digit, else false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected DurationImpl(String lexicalRepresentation)

    /**
     * Constructs a new Duration object by
     * parsing its string representation
     * "PnYnMnDTnHnMnS" as defined in XML Schema 1.0 section 3.2.6.1.
     *
     * <p>
     * The string representation may not have any leading
     * and trailing whitespaces.
     *
     * <p>
     * For example, this method parses strings like
     * "P1D" (1 day), "-PT100S" (-100 sec.), "P1DT12H" (1 days and 12 hours).
     *
     * <p>
     * The parsing is done field by field so that
     * the following holds for any lexically correct string x:
     * <pre>
     * new Duration(x).toString().equals(x)
     * </pre>
     *
     * Returns a non-null valid duration object that holds the value
     * indicated by the lexicalRepresentation parameter.
     *
     * @param lexicalRepresentation
     *      Lexical representation of a duration.
     * @throws IllegalArgumentException
     *      If the given string does not conform to the aforementioned
     *      specification.
     * @throws NullPointerException
     *      If the given string is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected DurationImpl(final long durationInMilliSeconds) {

    /**
     * <p>Constructs a new Duration object by specifying the duration
     * in milliseconds.</p>
     *
     * @param durationInMilliSeconds
     *      The length of the duration in milliseconds.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected static BigInteger wrap(final int i) {

        /**
         * TODO: Javadoc
         *
         * @param i int to convert to BigInteger.
         *
         * @return BigInteger representation of int.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected DurationImpl(
        final boolean isPositive,
        final int years,
        final int months,
        final int days,
        final int hours,
        final int minutes,
        final int seconds) {

    /**
     * <p>Constructs a new Duration object by specifying each field
     * individually.</p>
     *
     * <p>This method is functionally equivalent to
     * invoking another constructor by wrapping
     * all non-zero parameters into {@link BigInteger} and {@link BigDecimal}.
     * Zero value of int parameter is equivalent of null value of
     * the corresponding field.</p>
     *
     * @see #DurationImpl(boolean, BigInteger, BigInteger, BigInteger, BigInteger,
     *   BigInteger, BigDecimal)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected static void testNonNegative(BigDecimal n, DatatypeConstants.Field f) {

    /**
     * <p>Makes sure that the given number is non-negative. If it is not,
     * throw {@link IllegalArgumentException}.</p>
     *
     * @param n Number to test.
     * @param f Field to test.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected static void testNonNegative(BigInteger n, DatatypeConstants.Field f) {

    /**
     * <p>Makes sure that the given number is non-negative. If it is not,
     * throw {@link IllegalArgumentException}.</p>
     *
     * @param n Number to test.
     * @param f Field to test.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected DurationImpl(
        boolean isPositive,
        BigInteger years,
        BigInteger months,
        BigInteger days,
        BigInteger hours,
        BigInteger minutes,
        BigDecimal seconds) {

    /**
     * <p>Constructs a new Duration object by specifying each field individually.</p>
     *
     * <p>All the parameters are optional as long as at least one field is present.
     * If specified, parameters have to be zero or positive.</p>
     *
     * @param isPositive Set to <code>false</code> to create a negative duration. When the length
     *   of the duration is zero, this parameter will be ignored.
     * @param years of this <code>Duration</code>
     * @param months of this <code>Duration</code>
     * @param days of this <code>Duration</code>
     * @param hours of this <code>Duration</code>
     * @param minutes of this <code>Duration</code>
     * @param seconds of this <code>Duration</code>
     *
     * @throws IllegalArgumentException
     *    If years, months, days, hours, minutes and
     *    seconds parameters are all <code>null</code>. Or if any
     *    of those parameters are negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected int calcSignum(boolean isPositive) {

        /**
         * TODO: Javadoc
         * @param isPositive Sign.
         *
         * @return 1 if positive, else -1.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
        public int getSign() {

        /**
         * Returns the sign of this duration in -1,0, or 1.
         *
         * @return
         *      -1 if this duration is negative, 0 if the duration is zero,
         *      and 1 if the duration is postive.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigDecimal seconds;

    /**
     * <p>Seconds of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigInteger minutes;

    /**
     * <p>Minutes of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigInteger hours;

    /**
     * <p>Hours of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigInteger days;

    /**
     * <p>Days of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected BigInteger months;

    /**
     * <p>Months of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    /**

    /**
     * <p>Years of this <code>Duration</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    protected int signum;

    /**
     * <p>Indicates the sign. -1, 0 or 1 if the duration is negative,
     * zero, or positive.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
        private static final BigDecimal ZERO = BigDecimal.valueOf((long) 0);

        /**
         * <p>BigDecimal value of 0.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");

    /**
     * TimeZone for GMT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
                private static final int[] FIELD_IDS = {

                /**
                 * <p>Internal array of value Field ids.</p>
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
        private static final DatatypeConstants.Field[] FIELDS = new DatatypeConstants.Field[]{

    /**
     * <p>Internal array of value Fields.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
    private static final int FIELD_NUM = 6;

    /**
     * <p>Number of Fields.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationImpl.java
class DurationImpl

/**
 * <p>Immutable representation of a time span as defined in
 * the W3C XML Schema 1.0 specification.</p>
 *
 * <p>A Duration object represents a period of Gregorian time,
 * which consists of six fields (years, months, days, hours,
 * minutes, and seconds) plus a sign (+/-) field.</p>
 *
 * <p>The first five fields have non-negative (>=0) integers or null
 * (which represents that the field is not set),
 * and the seconds field has a non-negative decimal or null.
 * A negative sign indicates a negative duration.</p>
 *
 * <p>This class provides a number of methods that make it easy
 * to use for the duration datatype of XML Schema 1.0 with
 * the errata.</p>
 *
 * <h2>Order relationship</h2>
 * <p>Duration objects only have partial order, where two values A and B
 * maybe either:</p>
 * <ol>
 *  <li>A&lt;B (A is shorter than B)
 *  <li>A&gt;B (A is longer than B)
 *  <li>A==B   (A and B are of the same duration)
 *  <li>A&lt;>B (Comparison between A and B is indeterminate)
 * </ol>
 * <p>For example, 30 days cannot be meaningfully compared to one month.
 * The {@link #compare(Duration)} method implements this
 * relationship.</p>
 *
 * <p>See the {@link #isLongerThan(Duration)} method for details about
 * the order relationship among {@link Duration} objects.</p>
 *
 *
 *
 * <h2>Operations over Duration</h2>
 * <p>This class provides a set of basic arithmetic operations, such
 * as addition, subtraction and multiplication.
 * Because durations don't have total order, an operation could
 * fail for some combinations of operations. For example, you cannot
 * subtract 15 days from 1 month. See the javadoc of those methods
 * for detailed conditions where this could happen.</p>
 *
 * <p>Also, division of a duration by a number is not provided because
 * the {@link Duration} class can only deal with finite precision
 * decimal numbers. For example, one cannot represent 1 sec divided by 3.</p>
 *
 * <p>However, you could substitute a division by 3 with multiplying
 * by numbers such as 0.3 or 0.333.</p>
 *
 *
 *
 * <h2>Range of allowed values</h2>
 * <p>
 * Because some operations of {@link Duration} rely on {@link Calendar}
 * even though {@link Duration} can hold very large or very small values,
 * some of the methods may not work correctly on such {@link Duration}s.
 * The impacted methods document their dependency on {@link Calendar}.
 *
 *
 * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @author <a href="mailto:Joseph.Fialli@Sun.com">Joseph Fialli</a>
 * @version $Revision: 1.8 $, $Date: 2010/05/19 23:20:06 $

 * @see XMLGregorianCalendar#add(Duration)
 */
