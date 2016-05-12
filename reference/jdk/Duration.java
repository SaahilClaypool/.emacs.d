_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private Object writeReplace() {

    /**
     * Writes the object using a
     * <a href="../../serialized-form.html#java.time.Ser">dedicated serialized form</a>.
     * @serialData
     * <pre>
     *  out.writeByte(1);  // identifies a Duration
     *  out.writeLong(seconds);
     *  out.writeInt(nanos);
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    @Override

    /**
     * A string representation of this duration using ISO-8601 seconds
     * based representation, such as {@code PT8H6M12.345S}.
     * <p>
     * The format of the returned string will be {@code PTnHnMnS}, where n is
     * the relevant hours, minutes or seconds part of the duration.
     * Any fractional seconds are placed after a decimal point i the seconds section.
     * If a section has a zero value, it is omitted.
     * The hours, minutes and seconds will all have the same sign.
     * <p>
     * Examples:
     * <pre>
     *    "20.345 seconds"                 -- "PT20.345S
     *    "15 minutes" (15 * 60 seconds)   -- "PT15M"
     *    "10 hours" (10 * 3600 seconds)   -- "PT10H"
     *    "2 days" (2 * 86400 seconds)     -- "PT48H"
     * </pre>
     * Note that multiples of 24 hours are not output as days to avoid confusion
     * with {@code Period}.
     *
     * @return an ISO-8601 representation of this duration, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    @Override

    /**
     * A hash code for this duration.
     *
     * @return a suitable hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    @Override

    /**
     * Checks if this duration is equal to the specified {@code Duration}.
     * <p>
     * The comparison is based on the total length of the durations.
     *
     * @param otherDuration  the other duration, null returns false
     * @return true if the other duration is equal to this one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    @Override

    /**
     * Compares this duration to the specified {@code Duration}.
     * <p>
     * The comparison is based on the total length of the durations.
     * It is "consistent with equals", as defined by {@link Comparable}.
     *
     * @param otherDuration  the other duration to compare to, not null
     * @return the comparator value, negative if less, positive if greater
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public long toNanos() {

    /**
     * Converts this duration to the total length in nanoseconds expressed as a {@code long}.
     * <p>
     * If this duration is too large to fit in a {@code long} nanoseconds, then an
     * exception is thrown.
     *
     * @return the total length of the duration in nanoseconds
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public long toMillis() {

    /**
     * Converts this duration to the total length in milliseconds.
     * <p>
     * If this duration is too large to fit in a {@code long} milliseconds, then an
     * exception is thrown.
     * <p>
     * If this duration has greater than millisecond precision, then the conversion
     * will drop any excess precision information as though the amount in nanoseconds
     * was subject to integer division by one million.
     *
     * @return the total length of the duration in milliseconds
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public long toMinutes() {

    /**
     * Gets the number of minutes in this duration.
     * <p>
     * This returns the total number of minutes in the duration by dividing the
     * number of seconds by 60.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return the number of minutes in the duration, may be negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public long toHours() {

    /**
     * Gets the number of hours in this duration.
     * <p>
     * This returns the total number of hours in the duration by dividing the
     * number of seconds by 3600.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return the number of hours in the duration, may be negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public long toDays() {

    /**
     * Gets the number of days in this duration.
     * <p>
     * This returns the total number of days in the duration by dividing the
     * number of seconds by 86400.
     * This is based on the standard definition of a day as 24 hours.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return the number of days in the duration, may be negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    @Override

    /**
     * Subtracts this duration from the specified temporal object.
     * <p>
     * This returns a temporal object of the same observable type as the input
     * with this duration subtracted.
     * <p>
     * In most cases, it is clearer to reverse the calling pattern by using
     * {@link Temporal#minus(TemporalAmount)}.
     * <pre>
     *   // these two lines are equivalent, but the second approach is recommended
     *   dateTime = thisDuration.subtractFrom(dateTime);
     *   dateTime = dateTime.minus(thisDuration);
     * </pre>
     * <p>
     * The calculation will subtract the seconds, then nanos.
     * Only non-zero amounts will be added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param temporal  the temporal object to adjust, not null
     * @return an object of the same type with the adjustment made, not null
     * @throws DateTimeException if unable to subtract
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    @Override

    /**
     * Adds this duration to the specified temporal object.
     * <p>
     * This returns a temporal object of the same observable type as the input
     * with this duration added.
     * <p>
     * In most cases, it is clearer to reverse the calling pattern by using
     * {@link Temporal#plus(TemporalAmount)}.
     * <pre>
     *   // these two lines are equivalent, but the second approach is recommended
     *   dateTime = thisDuration.addTo(dateTime);
     *   dateTime = dateTime.plus(thisDuration);
     * </pre>
     * <p>
     * The calculation will add the seconds, then nanos.
     * Only non-zero amounts will be added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param temporal  the temporal object to adjust, not null
     * @return an object of the same type with the adjustment made, not null
     * @throws DateTimeException if unable to add
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration abs() {

    /**
     * Returns a copy of this duration with a positive length.
     * <p>
     * This method returns a positive duration by effectively removing the sign from any negative total length.
     * For example, {@code PT-1.3S} will be returned as {@code PT1.3S}.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return a {@code Duration} based on this duration with an absolute length, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration negated() {

    /**
     * Returns a copy of this duration with the length negated.
     * <p>
     * This method swaps the sign of the total length of this duration.
     * For example, {@code PT1.3S} will be returned as {@code PT-1.3S}.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @return a {@code Duration} based on this duration with the amount negated, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private static Duration create(BigDecimal seconds) {

    /**
     * Creates an instance of {@code Duration} from a number of seconds.
     *
     * @param seconds  the number of seconds, up to scale 9, positive or negative
     * @return a {@code Duration}, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private BigDecimal toSeconds() {

    /**
     * Converts this duration to the total length in seconds and
     * fractional nanoseconds expressed as a {@code BigDecimal}.
     *
     * @return the total length of the duration in seconds, with a scale of 9, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration dividedBy(long divisor) {

    /**
     * Returns a copy of this duration divided by the specified value.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param divisor  the value to divide the duration by, positive or negative, not zero
     * @return a {@code Duration} based on this duration divided by the specified divisor, not null
     * @throws ArithmeticException if the divisor is zero or if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration multipliedBy(long multiplicand) {

    /**
     * Returns a copy of this duration multiplied by the scalar.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param multiplicand  the value to multiply the duration by, positive or negative
     * @return a {@code Duration} based on this duration multiplied by the specified scalar, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration minusNanos(long nanosToSubtract) {

    /**
     * Returns a copy of this duration with the specified duration in nanoseconds subtracted.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param nanosToSubtract  the nanoseconds to subtract, positive or negative
     * @return a {@code Duration} based on this duration with the specified nanoseconds subtracted, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration minusMillis(long millisToSubtract) {

    /**
     * Returns a copy of this duration with the specified duration in milliseconds subtracted.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param millisToSubtract  the milliseconds to subtract, positive or negative
     * @return a {@code Duration} based on this duration with the specified milliseconds subtracted, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration minusSeconds(long secondsToSubtract) {

    /**
     * Returns a copy of this duration with the specified duration in seconds subtracted.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param secondsToSubtract  the seconds to subtract, positive or negative
     * @return a {@code Duration} based on this duration with the specified seconds subtracted, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration minusMinutes(long minutesToSubtract) {

    /**
     * Returns a copy of this duration with the specified duration in minutes subtracted.
     * <p>
     * The number of hours is multiplied by 60 to obtain the number of seconds to subtract.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param minutesToSubtract  the minutes to subtract, positive or negative
     * @return a {@code Duration} based on this duration with the specified minutes subtracted, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration minusHours(long hoursToSubtract) {

    /**
     * Returns a copy of this duration with the specified duration in hours subtracted.
     * <p>
     * The number of hours is multiplied by 3600 to obtain the number of seconds to subtract.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param hoursToSubtract  the hours to subtract, positive or negative
     * @return a {@code Duration} based on this duration with the specified hours subtracted, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration minusDays(long daysToSubtract) {

    /**
     * Returns a copy of this duration with the specified duration in standard 24 hour days subtracted.
     * <p>
     * The number of days is multiplied by 86400 to obtain the number of seconds to subtract.
     * This is based on the standard definition of a day as 24 hours.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param daysToSubtract  the days to subtract, positive or negative
     * @return a {@code Duration} based on this duration with the specified days subtracted, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration minus(long amountToSubtract, TemporalUnit unit) {

    /**
     * Returns a copy of this duration with the specified duration subtracted.
     * <p>
     * The duration amount is measured in terms of the specified unit.
     * Only a subset of units are accepted by this method.
     * The unit must either have an {@linkplain TemporalUnit#isDurationEstimated() exact duration} or
     * be {@link ChronoUnit#DAYS} which is treated as 24 hours. Other units throw an exception.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param amountToSubtract  the amount to subtract, measured in terms of the unit, positive or negative
     * @param unit  the unit that the amount is measured in, must have an exact duration, not null
     * @return a {@code Duration} based on this duration with the specified duration subtracted, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration minus(Duration duration) {

    /**
     * Returns a copy of this duration with the specified duration subtracted.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param duration  the duration to subtract, positive or negative, not null
     * @return a {@code Duration} based on this duration with the specified duration subtracted, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private Duration plus(long secondsToAdd, long nanosToAdd) {

    /**
     * Returns a copy of this duration with the specified duration added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param secondsToAdd  the seconds to add, positive or negative
     * @param nanosToAdd  the nanos to add, positive or negative
     * @return a {@code Duration} based on this duration with the specified seconds added, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration plusNanos(long nanosToAdd) {

    /**
     * Returns a copy of this duration with the specified duration in nanoseconds added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param nanosToAdd  the nanoseconds to add, positive or negative
     * @return a {@code Duration} based on this duration with the specified nanoseconds added, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration plusMillis(long millisToAdd) {

    /**
     * Returns a copy of this duration with the specified duration in milliseconds added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param millisToAdd  the milliseconds to add, positive or negative
     * @return a {@code Duration} based on this duration with the specified milliseconds added, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration plusSeconds(long secondsToAdd) {

    /**
     * Returns a copy of this duration with the specified duration in seconds added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param secondsToAdd  the seconds to add, positive or negative
     * @return a {@code Duration} based on this duration with the specified seconds added, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration plusMinutes(long minutesToAdd) {

    /**
     * Returns a copy of this duration with the specified duration in minutes added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param minutesToAdd  the minutes to add, positive or negative
     * @return a {@code Duration} based on this duration with the specified minutes added, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration plusHours(long hoursToAdd) {

    /**
     * Returns a copy of this duration with the specified duration in hours added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param hoursToAdd  the hours to add, positive or negative
     * @return a {@code Duration} based on this duration with the specified hours added, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration plusDays(long daysToAdd) {

    /**
     * Returns a copy of this duration with the specified duration in standard 24 hour days added.
     * <p>
     * The number of days is multiplied by 86400 to obtain the number of seconds to add.
     * This is based on the standard definition of a day as 24 hours.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param daysToAdd  the days to add, positive or negative
     * @return a {@code Duration} based on this duration with the specified days added, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration plus(long amountToAdd, TemporalUnit unit) {

    /**
     * Returns a copy of this duration with the specified duration added.
     * <p>
     * The duration amount is measured in terms of the specified unit.
     * Only a subset of units are accepted by this method.
     * The unit must either have an {@linkplain TemporalUnit#isDurationEstimated() exact duration} or
     * be {@link ChronoUnit#DAYS} which is treated as 24 hours. Other units throw an exception.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param amountToAdd  the amount to add, measured in terms of the unit, positive or negative
     * @param unit  the unit that the amount is measured in, must have an exact duration, not null
     * @return a {@code Duration} based on this duration with the specified duration added, not null
     * @throws UnsupportedTemporalTypeException if the unit is not supported
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration plus(Duration duration) {

    /**
     * Returns a copy of this duration with the specified duration added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param duration  the duration to add, positive or negative, not null
     * @return a {@code Duration} based on this duration with the specified duration added, not null
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration withNanos(int nanoOfSecond) {

    /**
     * Returns a copy of this duration with the specified nano-of-second.
     * <p>
     * This returns a duration with the specified nano-of-second, retaining the
     * seconds part of this duration.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param nanoOfSecond  the nano-of-second to represent, from 0 to 999,999,999
     * @return a {@code Duration} based on this period with the requested nano-of-second, not null
     * @throws DateTimeException if the nano-of-second is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public Duration withSeconds(long seconds) {

    /**
     * Returns a copy of this duration with the specified amount of seconds.
     * <p>
     * This returns a duration with the specified seconds, retaining the
     * nano-of-second part of this duration.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param seconds  the seconds to represent, may be negative
     * @return a {@code Duration} based on this period with the requested seconds, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public int getNano() {

    /**
     * Gets the number of nanoseconds within the second in this duration.
     * <p>
     * The length of the duration is stored using two fields - seconds and nanoseconds.
     * The nanoseconds part is a value from 0 to 999,999,999 that is an adjustment to
     * the length in seconds.
     * The total duration is defined by calling this method and {@link #getSeconds()}.
     * <p>
     * A {@code Duration} represents a directed distance between two points on the time-line.
     * A negative duration is expressed by the negative sign of the seconds part.
     * A duration of -1 nanosecond is stored as -1 seconds plus 999,999,999 nanoseconds.
     *
     * @return the nanoseconds within the second part of the length of the duration, from 0 to 999,999,999
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public long getSeconds() {

    /**
     * Gets the number of seconds in this duration.
     * <p>
     * The length of the duration is stored using two fields - seconds and nanoseconds.
     * The nanoseconds part is a value from 0 to 999,999,999 that is an adjustment to
     * the length in seconds.
     * The total duration is defined by calling this method and {@link #getNano()}.
     * <p>
     * A {@code Duration} represents a directed distance between two points on the time-line.
     * A negative duration is expressed by the negative sign of the seconds part.
     * A duration of -1 nanosecond is stored as -1 seconds plus 999,999,999 nanoseconds.
     *
     * @return the whole seconds part of the length of the duration, positive or negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public boolean isNegative() {

    /**
     * Checks if this duration is negative, excluding zero.
     * <p>
     * A {@code Duration} represents a directed distance between two points on
     * the time-line and can therefore be positive, zero or negative.
     * This method checks whether the length is less than zero.
     *
     * @return true if this duration has a total length less than zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public boolean isZero() {

    /**
     * Checks if this duration is zero length.
     * <p>
     * A {@code Duration} represents a directed distance between two points on
     * the time-line and can therefore be positive, zero or negative.
     * This method checks whether the length is zero.
     *
     * @return true if this duration has a total length equal to zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private static class DurationUnits {

    /**
     * Private class to delay initialization of this list until needed.
     * The circular dependency between Duration and ChronoUnit prevents
     * the simple initialization in Duration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    @Override

    /**
     * Gets the set of units supported by this duration.
     * <p>
     * The supported units are {@link ChronoUnit#SECONDS SECONDS},
     * and {@link ChronoUnit#NANOS NANOS}.
     * They are returned in the order seconds, nanos.
     * <p>
     * This set can be used in conjunction with {@link #get(TemporalUnit)}
     * to access the entire state of the duration.
     *
     * @return a list containing the seconds and nanos units, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    @Override

    /**
     * Gets the value of the requested unit.
     * <p>
     * This returns a value for each of the two supported units,
     * {@link ChronoUnit#SECONDS SECONDS} and {@link ChronoUnit#NANOS NANOS}.
     * All other units throw an exception.
     *
     * @param unit the {@code TemporalUnit} for which to return the value
     * @return the long value of the unit
     * @throws DateTimeException if the unit is not supported
     * @throws UnsupportedTemporalTypeException if the unit is not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private Duration(long seconds, int nanos) {

    /**
     * Constructs an instance of {@code Duration} using seconds and nanoseconds.
     *
     * @param seconds  the length of the duration in seconds, positive or negative
     * @param nanos  the nanoseconds within the second, from 0 to 999,999,999
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private static Duration create(long seconds, int nanoAdjustment) {

    /**
     * Obtains an instance of {@code Duration} using seconds and nanoseconds.
     *
     * @param seconds  the length of the duration in seconds, positive or negative
     * @param nanoAdjustment  the nanosecond adjustment within the second, from 0 to 999,999,999
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration between(Temporal startInclusive, Temporal endExclusive) {

    /**
     * Obtains a {@code Duration} representing the duration between two temporal objects.
     * <p>
     * This calculates the duration between two temporal objects. If the objects
     * are of different types, then the duration is calculated based on the type
     * of the first object. For example, if the first argument is a {@code LocalTime}
     * then the second argument is converted to a {@code LocalTime}.
     * <p>
     * The specified temporal objects must support the {@link ChronoUnit#SECONDS SECONDS} unit.
     * For full accuracy, either the {@link ChronoUnit#NANOS NANOS} unit or the
     * {@link ChronoField#NANO_OF_SECOND NANO_OF_SECOND} field should be supported.
     * <p>
     * The result of this method can be a negative period if the end is before the start.
     * To guarantee to obtain a positive duration call {@link #abs()} on the result.
     *
     * @param startInclusive  the start instant, inclusive, not null
     * @param endExclusive  the end instant, exclusive, not null
     * @return a {@code Duration}, not null
     * @throws DateTimeException if the seconds between the temporals cannot be obtained
     * @throws ArithmeticException if the calculation exceeds the capacity of {@code Duration}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration parse(CharSequence text) {

    /**
     * Obtains a {@code Duration} from a text string such as {@code PnDTnHnMn.nS}.
     * <p>
     * This will parse a textual representation of a duration, including the
     * string produced by {@code toString()}. The formats accepted are based
     * on the ISO-8601 duration format {@code PnDTnHnMn.nS} with days
     * considered to be exactly 24 hours.
     * <p>
     * The string starts with an optional sign, denoted by the ASCII negative
     * or positive symbol. If negative, the whole period is negated.
     * The ASCII letter "P" is next in upper or lower case.
     * There are then four sections, each consisting of a number and a suffix.
     * The sections have suffixes in ASCII of "D", "H", "M" and "S" for
     * days, hours, minutes and seconds, accepted in upper or lower case.
     * The suffixes must occur in order. The ASCII letter "T" must occur before
     * the first occurrence, if any, of an hour, minute or second section.
     * At least one of the four sections must be present, and if "T" is present
     * there must be at least one section after the "T".
     * The number part of each section must consist of one or more ASCII digits.
     * The number may be prefixed by the ASCII negative or positive symbol.
     * The number of days, hours and minutes must parse to an {@code long}.
     * The number of seconds must parse to an {@code long} with optional fraction.
     * The decimal point may be either a dot or a comma.
     * The fractional part may have from zero to 9 digits.
     * <p>
     * The leading plus/minus sign, and negative values for other units are
     * not part of the ISO-8601 standard.
     * <p>
     * Examples:
     * <pre>
     *    "PT20.345S" -- parses as "20.345 seconds"
     *    "PT15M"     -- parses as "15 minutes" (where a minute is 60 seconds)
     *    "PT10H"     -- parses as "10 hours" (where an hour is 3600 seconds)
     *    "P2D"       -- parses as "2 days" (where a day is 24 hours or 86400 seconds)
     *    "P2DT3H4M"  -- parses as "2 days, 3 hours and 4 minutes"
     *    "P-6H3M"    -- parses as "-6 hours and +3 minutes"
     *    "-P6H3M"    -- parses as "-6 hours and -3 minutes"
     *    "-P-6H+3M"  -- parses as "+6 hours and -3 minutes"
     * </pre>
     *
     * @param text  the text to parse, not null
     * @return the parsed duration, not null
     * @throws DateTimeParseException if the text cannot be parsed to a duration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration from(TemporalAmount amount) {

    /**
     * Obtains an instance of {@code Duration} from a temporal amount.
     * <p>
     * This obtains a duration based on the specified amount.
     * A {@code TemporalAmount} represents an  amount of time, which may be
     * date-based or time-based, which this factory extracts to a duration.
     * <p>
     * The conversion loops around the set of units from the amount and uses
     * the {@linkplain TemporalUnit#getDuration() duration} of the unit to
     * calculate the total {@code Duration}.
     * Only a subset of units are accepted by this method. The unit must either
     * have an {@linkplain TemporalUnit#isDurationEstimated() exact duration}
     * or be {@link ChronoUnit#DAYS} which is treated as 24 hours.
     * If any other units are found then an exception is thrown.
     *
     * @param amount  the temporal amount to convert, not null
     * @return the equivalent duration, not null
     * @throws DateTimeException if unable to convert to a {@code Duration}
     * @throws ArithmeticException if numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration of(long amount, TemporalUnit unit) {

    /**
     * Obtains a {@code Duration} representing an amount in the specified unit.
     * <p>
     * The parameters represent the two parts of a phrase like '6 Hours'. For example:
     * <pre>
     *  Duration.of(3, SECONDS);
     *  Duration.of(465, HOURS);
     * </pre>
     * Only a subset of units are accepted by this method.
     * The unit must either have an {@linkplain TemporalUnit#isDurationEstimated() exact duration} or
     * be {@link ChronoUnit#DAYS} which is treated as 24 hours. Other units throw an exception.
     *
     * @param amount  the amount of the duration, measured in terms of the unit, positive or negative
     * @param unit  the unit that the duration is measured in, must have an exact duration, not null
     * @return a {@code Duration}, not null
     * @throws DateTimeException if the period unit has an estimated duration
     * @throws ArithmeticException if a numeric overflow occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration ofNanos(long nanos) {

    /**
     * Obtains a {@code Duration} representing a number of nanoseconds.
     * <p>
     * The seconds and nanoseconds are extracted from the specified nanoseconds.
     *
     * @param nanos  the number of nanoseconds, positive or negative
     * @return a {@code Duration}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration ofMillis(long millis) {

    /**
     * Obtains a {@code Duration} representing a number of milliseconds.
     * <p>
     * The seconds and nanoseconds are extracted from the specified milliseconds.
     *
     * @param millis  the number of milliseconds, positive or negative
     * @return a {@code Duration}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration ofSeconds(long seconds, long nanoAdjustment) {

    /**
     * Obtains a {@code Duration} representing a number of seconds and an
     * adjustment in nanoseconds.
     * <p>
     * This method allows an arbitrary number of nanoseconds to be passed in.
     * The factory will alter the values of the second and nanosecond in order
     * to ensure that the stored nanosecond is in the range 0 to 999,999,999.
     * For example, the following will result in the exactly the same duration:
     * <pre>
     *  Duration.ofSeconds(3, 1);
     *  Duration.ofSeconds(4, -999_999_999);
     *  Duration.ofSeconds(2, 1000_000_001);
     * </pre>
     *
     * @param seconds  the number of seconds, positive or negative
     * @param nanoAdjustment  the nanosecond adjustment to the number of seconds, positive or negative
     * @return a {@code Duration}, not null
     * @throws ArithmeticException if the adjustment causes the seconds to exceed the capacity of {@code Duration}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration ofSeconds(long seconds) {

    /**
     * Obtains a {@code Duration} representing a number of seconds.
     * <p>
     * The nanosecond in second field is set to zero.
     *
     * @param seconds  the number of seconds, positive or negative
     * @return a {@code Duration}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration ofMinutes(long minutes) {

    /**
     * Obtains a {@code Duration} representing a number of standard minutes.
     * <p>
     * The seconds are calculated based on the standard definition of a minute,
     * where each minute is 60 seconds.
     * The nanosecond in second field is set to zero.
     *
     * @param minutes  the number of minutes, positive or negative
     * @return a {@code Duration}, not null
     * @throws ArithmeticException if the input minutes exceeds the capacity of {@code Duration}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration ofHours(long hours) {

    /**
     * Obtains a {@code Duration} representing a number of standard hours.
     * <p>
     * The seconds are calculated based on the standard definition of an hour,
     * where each hour is 3600 seconds.
     * The nanosecond in second field is set to zero.
     *
     * @param hours  the number of hours, positive or negative
     * @return a {@code Duration}, not null
     * @throws ArithmeticException if the input hours exceeds the capacity of {@code Duration}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static Duration ofDays(long days) {

    /**
     * Obtains a {@code Duration} representing a number of standard 24 hour days.
     * <p>
     * The seconds are calculated based on the standard definition of a day,
     * where each day is 86400 seconds which implies a 24 hour day.
     * The nanosecond in second field is set to zero.
     *
     * @param days  the number of days, positive or negative
     * @return a {@code Duration}, not null
     * @throws ArithmeticException if the input days exceeds the capacity of {@code Duration}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private final long seconds;

    /**
     * The number of seconds in the duration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    private static final BigInteger BI_NANOS_PER_SECOND = BigInteger.valueOf(NANOS_PER_SECOND);

    /**
     * Constant for nanos per second.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
    public static final Duration ZERO = new Duration(0, 0);

    /**
     * Constant for a duration of zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/Duration.java
public final class Duration

/**
 * A time-based amount of time, such as '34.5 seconds'.
 * <p>
 * This class models a quantity or amount of time in terms of seconds and nanoseconds.
 * It can be accessed using other duration-based units, such as minutes and hours.
 * In addition, the {@link ChronoUnit#DAYS DAYS} unit can be used and is treated as
 * exactly equal to 24 hours, thus ignoring daylight savings effects.
 * See {@link Period} for the date-based equivalent to this class.
 * <p>
 * A physical duration could be of infinite length.
 * For practicality, the duration is stored with constraints similar to {@link Instant}.
 * The duration uses nanosecond resolution with a maximum value of the seconds that can
 * be held in a {@code long}. This is greater than the current estimated age of the universe.
 * <p>
 * The range of a duration requires the storage of a number larger than a {@code long}.
 * To achieve this, the class stores a {@code long} representing seconds and an {@code int}
 * representing nanosecond-of-second, which will always be between 0 and 999,999,999.
 * The model is of a directed duration, meaning that the duration may be negative.
 * <p>
 * The duration is measured in "seconds", but these are not necessarily identical to
 * the scientific "SI second" definition based on atomic clocks.
 * This difference only impacts durations measured near a leap-second and should not affect
 * most applications.
 * See {@link Instant} for a discussion as to the meaning of the second and time-scales.
 *
 * <p>
 * This is a <a href="{@docRoot}/java/lang/doc-files/ValueBased.html">value-based</a>
 * class; use of identity-sensitive operations (including reference equality
 * ({@code ==}), identity hash code, or synchronization) on instances of
 * {@code Duration} may have unpredictable results and should be avoided.
 * The {@code equals} method should be used for comparisons.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    private static long getCalendarTimeInMillis(final Calendar cal) {

    /**
     * <p>Calls the {@link Calendar#getTimeInMillis} method.
     * Prior to JDK1.4, this method was protected and therefore
     * cannot be invoked directly.</p>
     *
     * <p>TODO: In future, this should be replaced by <code>cal.getTimeInMillis()</code>.</p>
     *
     * @param cal <code>Calendar</code> to get time in milliseconds.
     *
     * @return Milliseconds of <code>cal</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public String toString() {

    /**
     * <p>Returns a <code>String</code> representation of this <code>Duration</code> <code>Object</code>.</p>
     *
     * <p>The result is formatted according to the XML Schema 1.0 spec and can be always parsed back later into the
     * equivalent <code>Duration</code> <code>Object</code> by {@link DatatypeFactory#newDuration(String  lexicalRepresentation)}.</p>
     *
     * <p>Formally, the following holds for any <code>Duration</code>
     * <code>Object</code> x:</p>
     * <pre>
     * new Duration(x.toString()).equals(x)
     * </pre>
     *
     * @return A non-<code>null</code> valid <code>String</code> representation of this <code>Duration</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract int hashCode();

    /**
     * Returns a hash code consistent with the definition of the equals method.
     *
     * @see Object#hashCode()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public boolean equals(final Object duration) {

    /**
     * <p>Checks if this duration object has the same duration
     * as another <code>Duration</code> object.</p>
     *
     * <p>For example, "P1D" (1 day) is equal to "PT24H" (24 hours).</p>
     *
     * <p>Duration X is equal to Y if and only if time instant
     * t+X and t+Y are the same for all the test time instants
     * specified in the section 3.2.6.2 of the XML Schema 1.0
     * specification.</p>
     *
     * <p>Note that there are cases where two <code>Duration</code>s are
     * "incomparable" to each other, like one month and 30 days.
     * For example,</p>
     * <pre>
     * !new Duration("P1M").isShorterThan(new Duration("P30D"))
     * !new Duration("P1M").isLongerThan(new Duration("P30D"))
     * !new Duration("P1M").equals(new Duration("P30D"))
     * </pre>
     *
     * @param duration
     *      The object to compare this <code>Duration</code> against.
     *
     * @return
     *      <code>true</code> if this duration is the same length as
     *         <code>duration</code>.
     *      <code>false</code> if <code>duration</code> is <code>null</code>,
     *         is not a
     *         <code>Duration</code> object,
     *         or its length is different from this duration.
     *
     * @throws UnsupportedOperationException If the underlying implementation
     *   cannot reasonably process the request, e.g. W3C XML Schema allows for
     *   arbitrarily large/small/precise values, the request may be beyond the
     *   implementations capability.
     *
     * @see #compare(Duration duration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public boolean isShorterThan(final Duration duration) {

    /**
     * <p>Checks if this duration object is strictly shorter than
     * another <code>Duration</code> object.</p>
     *
     * @param duration <code>Duration</code> to test this <code>Duration</code> against.
     *
     * @return <code>true</code> if <code>duration</code> parameter is shorter than this <code>Duration</code>,
     *   else <code>false</code>.
     *
     * @throws UnsupportedOperationException If the underlying implementation
     *   cannot reasonably process the request, e.g. W3C XML Schema allows for
     *   arbitrarily large/small/precise values, the request may be beyond the
     *   implementations capability.
     * @throws NullPointerException if <code>duration</code> is null.
     *
     * @see #isLongerThan(Duration duration)
     * @see #compare(Duration duration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public boolean isLongerThan(final Duration duration) {

    /**
     * <p>Checks if this duration object is strictly longer than
     * another <code>Duration</code> object.</p>
     *
     * <p>Duration X is "longer" than Y if and only if X>Y
     * as defined in the section 3.2.6.2 of the XML Schema 1.0
     * specification.</p>
     *
     * <p>For example, "P1D" (one day) > "PT12H" (12 hours) and
     * "P2Y" (two years) > "P23M" (23 months).</p>
     *
     * @param duration <code>Duration</code> to test this <code>Duration</code> against.
     *
     * @throws UnsupportedOperationException If the underlying implementation
     *   cannot reasonably process the request, e.g. W3C XML Schema allows for
     *   arbitrarily large/small/precise values, the request may be beyond the
     *   implementations capability.
     * @throws NullPointerException If <code>duration</code> is null.
     *
     * @return
     *      true if the duration represented by this object
     *      is longer than the given duration. false otherwise.
     *
     * @see #isShorterThan(Duration)
     * @see #compare(Duration duration)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract int compare(final Duration duration);

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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract Duration normalizeWith(final Calendar startTimeInstant);

    /**
     * <p>Converts the years and months fields into the days field
     * by using a specific time instant as the reference point.</p>
     *
     * <p>For example, duration of one month normalizes to 31 days
     * given the start time instance "July 8th 2003, 17:40:32".</p>
     *
     * <p>Formally, the computation is done as follows:</p>
     * <ol>
     *  <li>the given Calendar object is cloned</li>
     *  <li>the years, months and days fields will be added to the {@link Calendar} object
     *      by using the {@link Calendar#add(int,int)} method</li>
     *  <li>the difference between the two Calendars in computed in milliseconds and converted to days,
     *     if a remainder occurs due to Daylight Savings Time, it is discarded</li>
     *  <li>the computed days, along with the hours, minutes and seconds
     *      fields of this duration object is used to construct a new
     *      Duration object.</li>
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract Duration negate();

    /**
     * Returns a new <code>Duration</code> object whose
     * value is <code>-this</code>.
     *
     * <p>
     * Since the <code>Duration</code> class is immutable, this method
     * doesn't change the value of this object. It simply computes
     * a new Duration object and returns it.
     *
     * @return
     *      always return a non-null valid <code>Duration</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract Duration multiply(final BigDecimal factor);

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
     * Since the <code>Duration</code> class is immutable, this method
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
     *      returns a non-null valid <code>Duration</code> object
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
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
     * First, we can assume that two <code>Duration</code>s are both positive
     * without losing generality.  (i.e.,
     * <code>(-X)-Y=-(X+Y)</code>, <code>X-(-Y)=X+Y</code>,
     * <code>(-X)-(-Y)=-(X-Y)</code>)</p>
     *
     * <p>Then two durations are subtracted field by field.
     * If the sign of any non-zero field <code>F</code> is different from
     * the sign of the most significant field,
     * 1 (if <code>F</code> is negative) or -1 (otherwise)
     * will be borrowed from the next bigger unit of <code>F</code>.</p>
     *
     * <p>This process is repeated until all the non-zero fields have
     * the same sign.</p>
     *
     * <p>If a borrow occurs in the days field (in other words, if
     * the computation needs to borrow 1 or -1 month to compensate
     * days), then the computation fails by throwing an
     * {@link IllegalStateException}.</p>
     *
     * @param rhs <code>Duration</code> to subtract from this <code>Duration</code>.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract void addTo(Calendar calendar);

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
     * Any fractional parts of this <code>Duration</code> object
     * beyond milliseconds will be simply ignored. For example, if
     * this duration is "P1.23456S", then 1 is added to SECONDS,
     * 234 is added to MILLISECONDS, and the rest will be unused.
     * </p>
     *
     * <p>
     * Note that because {@link Calendar#add(int, int)} is using
     * <code>int</code>, <code>Duration</code> with values beyond the
     * range of <code>int</code> in its fields
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract Duration add(final Duration rhs);

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
     * Firstly, we can assume that two <code>Duration</code>s to be added
     * are both positive without losing generality (i.e.,
     * <code>(-X)+Y=Y-X</code>, <code>X+(-Y)=X-Y</code>,
     * <code>(-X)+(-Y)=-(X+Y)</code>)
     *
     * <p>
     * Addition of two positive <code>Duration</code>s are simply defined as
     * field by field addition where missing fields are treated as 0.
     * <p>
     * A field of the resulting <code>Duration</code> will be unset if and
     * only if respective fields of two input <code>Duration</code>s are unset.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract boolean isSet(final DatatypeConstants.Field field);

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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract Number getField(final DatatypeConstants.Field field);

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
     *      returns a {@link java.math.BigInteger} object. For SECONDS, this
     *      method returns a {@link java.math.BigDecimal}.
     *
     * @throws NullPointerException If the <code>field</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public long getTimeInMillis(final Date startInstant) {

    /**
     * <p>Returns the length of the duration in milli-seconds.</p>
     *
     * <p>If the seconds field carries more digits than milli-second order,
     * those will be simply discarded (or in other words, rounded to zero.)
     * For example, for any <code>Date</code> value <code>x</code>,</p>
     * <pre>
     * <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>.
     * <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>.
     * </pre>
     *
     * <p>
     * Note that this method uses the {@link #addTo(Date)} method,
     * which may work incorrectly with <code>Duration</code> objects with
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public long getTimeInMillis(final Calendar startInstant) {

    /**
     * <p>Returns the length of the duration in milli-seconds.</p>
     *
     * <p>If the seconds field carries more digits than milli-second order,
     * those will be simply discarded (or in other words, rounded to zero.)
     * For example, for any Calendar value <code>x</code>,</p>
     * <pre>
     * <code>new Duration("PT10.00099S").getTimeInMills(x) == 10000</code>.
     * <code>new Duration("-PT10.00099S").getTimeInMills(x) == -10000</code>.
     * </pre>
     *
     * <p>
     * Note that this method uses the {@link #addTo(Calendar)} method,
     * which may work incorrectly with <code>Duration</code> objects with
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public int getYears() {

    /**
     * <p>Get the years value of this <code>Duration</code> as an <code>int</code> or <code>0</code> if not present.</p>
     *
     * <p><code>getYears()</code> is a convenience method for
     * {@link #getField(DatatypeConstants.Field field) getField(DatatypeConstants.YEARS)}.</p>
     *
     * <p>As the return value is an <code>int</code>, an incorrect value will be returned for <code>Duration</code>s
     * with years that go beyond the range of an <code>int</code>.
     * Use {@link #getField(DatatypeConstants.Field field) getField(DatatypeConstants.YEARS)} to avoid possible loss of precision.</p>
     *
     * @return If the years field is present, return its value as an <code>int</code>, else return <code>0</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public abstract int getSign();

    /**
     * Returns the sign of this duration in -1,0, or 1.
     *
     * @return
     *      -1 if this duration is negative, 0 if the duration is zero,
     *      and 1 if the duration is positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public QName getXMLSchemaType() {

    /**
     * <p>Return the name of the XML Schema date/time type that this instance
     * maps to. Type is computed based on fields that are set,
     * i.e. {@link #isSet(DatatypeConstants.Field field)} == <code>true</code>.</p>
     *
     * <table border="2" rules="all" cellpadding="2">
     *   <thead>
     *     <tr>
     *       <th align="center" colspan="7">
     *         Required fields for XML Schema 1.0 Date/Time Datatypes.<br/>
     *         <i>(timezone is optional for all date/time datatypes)</i>
     *       </th>
     *     </tr>
     *   </thead>
     *   <tbody>
     *     <tr>
     *       <td>Datatype</td>
     *       <td>year</td>
     *       <td>month</td>
     *       <td>day</td>
     *       <td>hour</td>
     *       <td>minute</td>
     *       <td>second</td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#DURATION}</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#DURATION_DAYTIME}</td>
     *       <td></td>
     *       <td></td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#DURATION_YEARMONTH}</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *   </tbody>
     * </table>
     *
     * @return one of the following constants:
     *   {@link DatatypeConstants#DURATION},
     *   {@link DatatypeConstants#DURATION_DAYTIME} or
     *   {@link DatatypeConstants#DURATION_YEARMONTH}.
     *
     * @throws IllegalStateException If the combination of set fields does not match one of the XML Schema date/time datatypes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    public Duration() {

    /**
     * Default no-arg constructor.
     *
     * <p>Note: Always use the {@link DatatypeFactory} to
     * construct an instance of <code>Duration</code>.
     * The constructor on this class cannot be guaranteed to
     * produce an object with a consistent state and may be
     * removed in the future.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
    private static final boolean DEBUG = true;

    /**
     * <p>Debugging <code>true</code> or <code>false</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/Duration.java
public abstract class Duration {

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
 *
 * <p>For example, 30 days cannot be meaningfully compared to one month.
 * The {@link #compare(Duration duration)} method implements this
 * relationship.</p>
 *
 * <p>See the {@link #isLongerThan(Duration)} method for details about
 * the order relationship among <code>Duration</code> objects.</p>
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
 * the <code>Duration</code> class can only deal with finite precision
 * decimal numbers. For example, one cannot represent 1 sec divided by 3.</p>
 *
 * <p>However, you could substitute a division by 3 with multiplying
 * by numbers such as 0.3 or 0.333.</p>
 *
 * <h2>Range of allowed values</h2>
 * <p>
 * Because some operations of <code>Duration</code> rely on {@link Calendar}
 * even though {@link Duration} can hold very large or very small values,
 * some of the methods may not work correctly on such <code>Duration</code>s.
 * The impacted methods document their dependency on {@link Calendar}.
 *
 * @author <a href="mailto:Joseph.Fialli@Sun.COM">Joseph Fialli</a>
 * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @author <a href="mailto:Sunitha.Reddy@Sun.com">Sunitha Reddy</a>
 * @see XMLGregorianCalendar#add(Duration)
 * @since 1.5
 */
