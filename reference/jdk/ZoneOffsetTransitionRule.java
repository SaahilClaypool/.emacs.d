_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
        public LocalDateTime createDateTime(LocalDateTime dateTime, ZoneOffset standardOffset, ZoneOffset wallOffset) {

        /**
         * Converts the specified local date-time to the local date-time actually
         * seen on a wall clock.
         * <p>
         * This method converts using the type of this enum.
         * The output is defined relative to the 'before' offset of the transition.
         * <p>
         * The UTC type uses the UTC offset.
         * The STANDARD type uses the standard offset.
         * The WALL type returns the input date-time.
         * The result is intended for use with the wall-offset.
         *
         * @param dateTime  the local date-time, not null
         * @param standardOffset  the standard offset, not null
         * @param wallOffset  the wall offset, not null
         * @return the date-time relative to the wall/before offset, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
        WALL,

        /** The local date-time is expressed in terms of the wall offset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public static enum TimeDefinition {

    /**
     * A definition of the way a local time can be converted to the actual
     * transition date-time.
     * <p>
     * Time zone rules are expressed in one of three ways:
     * <ul>
     * <li>Relative to UTC</li>
     * <li>Relative to the standard offset in force</li>
     * <li>Relative to the wall offset (what you would see on a clock on the wall)</li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    @Override

    /**
     * Returns a string describing this object.
     *
     * @return a string for debugging, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    @Override

    /**
     * Returns a suitable hash code.
     *
     * @return the hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    @Override

    /**
     * Checks if this object equals another.
     * <p>
     * The entire state of the object is compared.
     *
     * @param otherRule  the other object to compare to, null returns false
     * @return true if equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public ZoneOffsetTransition createTransition(int year) {

    /**
     * Creates a transition instance for the specified year.
     * <p>
     * Calculations are performed using the ISO-8601 chronology.
     *
     * @param year  the year to create a transition for, not null
     * @return the transition instance, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public ZoneOffset getOffsetAfter() {

    /**
     * Gets the offset after the transition.
     *
     * @return the offset after, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public ZoneOffset getOffsetBefore() {

    /**
     * Gets the offset before the transition.
     *
     * @return the offset before, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public ZoneOffset getStandardOffset() {

    /**
     * Gets the standard offset in force at the transition.
     *
     * @return the standard offset, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public TimeDefinition getTimeDefinition() {

    /**
     * Gets the time definition, specifying how to convert the time to an instant.
     * <p>
     * The local time can be converted to an instant using the standard offset,
     * the wall offset or UTC.
     *
     * @return the time definition, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public boolean isMidnightEndOfDay() {

    /**
     * Is the transition local time midnight at the end of day.
     * <p>
     * The transition may be represented as occurring at 24:00.
     *
     * @return whether a local time of midnight is at the start or end of the day
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public LocalTime getLocalTime() {

    /**
     * Gets the local time of day of the transition which must be checked with
     * {@link #isMidnightEndOfDay()}.
     * <p>
     * The time is converted into an instant using the time definition.
     *
     * @return the local time of day of the transition, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public DayOfWeek getDayOfWeek() {

    /**
     * Gets the day-of-week of the transition.
     * <p>
     * If the rule defines an exact date then this returns null.
     * <p>
     * If the rule defines a week where the cutover might occur, then this method
     * returns the day-of-week that the month-day will be adjusted to.
     * If the day is positive then the adjustment is later.
     * If the day is negative then the adjustment is earlier.
     *
     * @return the day-of-week that the transition occurs, null if the rule defines an exact date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public int getDayOfMonthIndicator() {

    /**
     * Gets the indicator of the day-of-month of the transition.
     * <p>
     * If the rule defines an exact date then the day is the month of that date.
     * <p>
     * If the rule defines a week where the transition might occur, then the day
     * defines either the start of the end of the transition week.
     * <p>
     * If the value is positive, then it represents a normal day-of-month, and is the
     * earliest possible date that the transition can be.
     * The date may refer to 29th February which should be treated as 1st March in non-leap years.
     * <p>
     * If the value is negative, then it represents the number of days back from the
     * end of the month where {@code -1} is the last day of the month.
     * In this case, the day identified is the latest possible date that the transition can be.
     *
     * @return the day-of-month indicator, from -28 to 31 excluding 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public Month getMonth() {

    /**
     * Gets the month of the transition.
     * <p>
     * If the rule defines an exact date then the month is the month of that date.
     * <p>
     * If the rule defines a week where the transition might occur, then the month
     * if the month of either the earliest or latest possible date of the cutover.
     *
     * @return the month of the transition, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    static ZoneOffsetTransitionRule readExternal(DataInput in) throws IOException {

    /**
     * Reads the state from the stream.
     *
     * @param in  the input stream, not null
     * @return the created object, not null
     * @throws IOException if an error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    void writeExternal(DataOutput out) throws IOException {

    /**
     * Writes the state to the stream.
     *
     * @param out  the output stream, not null
     * @throws IOException if an error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    private Object writeReplace() {

    /**
     * Writes the object using a
     * <a href="../../../serialized-form.html#java.time.zone.Ser">dedicated serialized form</a>.
     * @serialData
     * Refer to the serialized form of
     * <a href="../../../serialized-form.html#java.time.zone.ZoneRules">ZoneRules.writeReplace</a>
     * for the encoding of epoch seconds and offsets.
     * <pre style="font-size:1.0em">{@code
     *
     *      out.writeByte(3);                // identifies a ZoneOffsetTransition
     *      final int timeSecs = (timeEndOfDay ? 86400 : time.toSecondOfDay());
     *      final int stdOffset = standardOffset.getTotalSeconds();
     *      final int beforeDiff = offsetBefore.getTotalSeconds() - stdOffset;
     *      final int afterDiff = offsetAfter.getTotalSeconds() - stdOffset;
     *      final int timeByte = (timeSecs % 3600 == 0 ? (timeEndOfDay ? 24 : time.getHour()) : 31);
     *      final int stdOffsetByte = (stdOffset % 900 == 0 ? stdOffset / 900 + 128 : 255);
     *      final int beforeByte = (beforeDiff == 0 || beforeDiff == 1800 || beforeDiff == 3600 ? beforeDiff / 1800 : 3);
     *      final int afterByte = (afterDiff == 0 || afterDiff == 1800 || afterDiff == 3600 ? afterDiff / 1800 : 3);
     *      final int dowByte = (dow == null ? 0 : dow.getValue());
     *      int b = (month.getValue() << 28) +          // 4 bits
     *              ((dom + 32) << 22) +                // 6 bits
     *              (dowByte << 19) +                   // 3 bits
     *              (timeByte << 14) +                  // 5 bits
     *              (timeDefinition.ordinal() << 12) +  // 2 bits
     *              (stdOffsetByte << 4) +              // 8 bits
     *              (beforeByte << 2) +                 // 2 bits
     *              afterByte;                          // 2 bits
     *      out.writeInt(b);
     *      if (timeByte == 31) {
     *          out.writeInt(timeSecs);
     *      }
     *      if (stdOffsetByte == 255) {
     *          out.writeInt(stdOffset);
     *      }
     *      if (beforeByte == 3) {
     *          out.writeInt(offsetBefore.getTotalSeconds());
     *      }
     *      if (afterByte == 3) {
     *          out.writeInt(offsetAfter.getTotalSeconds());
     *      }
     * }
     * </pre>
     *
     * @return the replacing object, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    ZoneOffsetTransitionRule(
            Month month,
            int dayOfMonthIndicator,
            DayOfWeek dayOfWeek,
            LocalTime time,
            boolean timeEndOfDay,
            TimeDefinition timeDefnition,
            ZoneOffset standardOffset,
            ZoneOffset offsetBefore,
            ZoneOffset offsetAfter) {

    /**
     * Creates an instance defining the yearly rule to create transitions between two offsets.
     *
     * @param month  the month of the month-day of the first day of the cutover week, not null
     * @param dayOfMonthIndicator  the day of the month-day of the cutover week, positive if the week is that
     *  day or later, negative if the week is that day or earlier, counting from the last day of the month,
     *  from -28 to 31 excluding 0
     * @param dayOfWeek  the required day-of-week, null if the month-day should not be changed
     * @param time  the cutover time in the 'before' offset, not null
     * @param timeEndOfDay  whether the time is midnight at the end of day
     * @param timeDefnition  how to interpret the cutover
     * @param standardOffset  the standard offset in force at the cutover, not null
     * @param offsetBefore  the offset before the cutover, not null
     * @param offsetAfter  the offset after the cutover, not null
     * @throws IllegalArgumentException if the day of month indicator is invalid
     * @throws IllegalArgumentException if the end of day flag is true when the time is not midnight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    public static ZoneOffsetTransitionRule of(
            Month month,
            int dayOfMonthIndicator,
            DayOfWeek dayOfWeek,
            LocalTime time,
            boolean timeEndOfDay,
            TimeDefinition timeDefnition,
            ZoneOffset standardOffset,
            ZoneOffset offsetBefore,
            ZoneOffset offsetAfter) {

    /**
     * Obtains an instance defining the yearly rule to create transitions between two offsets.
     * <p>
     * Applications should normally obtain an instance from {@link ZoneRules}.
     * This factory is only intended for use when creating {@link ZoneRules}.
     *
     * @param month  the month of the month-day of the first day of the cutover week, not null
     * @param dayOfMonthIndicator  the day of the month-day of the cutover week, positive if the week is that
     *  day or later, negative if the week is that day or earlier, counting from the last day of the month,
     *  from -28 to 31 excluding 0
     * @param dayOfWeek  the required day-of-week, null if the month-day should not be changed
     * @param time  the cutover time in the 'before' offset, not null
     * @param timeEndOfDay  whether the time is midnight at the end of day
     * @param timeDefnition  how to interpret the cutover
     * @param standardOffset  the standard offset in force at the cutover, not null
     * @param offsetBefore  the offset before the cutover, not null
     * @param offsetAfter  the offset after the cutover, not null
     * @return the rule, not null
     * @throws IllegalArgumentException if the day of month indicator is invalid
     * @throws IllegalArgumentException if the end of day flag is true when the time is not midnight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    private final ZoneOffset offsetAfter;

    /**
     * The offset after the cutover.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    private final ZoneOffset standardOffset;

    /**
     * The standard offset at the cutover.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    private final boolean timeEndOfDay;

    /**
     * Whether the cutover time is midnight at the end of day.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    private final DayOfWeek dow;

    /**
     * The cutover day-of-week, null to retain the day-of-month.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    private final Month month;

    /**
     * The month of the month-day of the first day of the cutover week.
     * The actual date will be adjusted by the dowChange field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
    private static final long serialVersionUID = 6889046316657758795L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransitionRule.java
public final class ZoneOffsetTransitionRule implements Serializable {

/**
 * A rule expressing how to create a transition.
 * <p>
 * This class allows rules for identifying future transitions to be expressed.
 * A rule might be written in many forms:
 * <ul>
 * <li>the 16th March
 * <li>the Sunday on or after the 16th March
 * <li>the Sunday on or before the 16th March
 * <li>the last Sunday in February
 * </ul>
 * These different rule types can be expressed and queried.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
