_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private void readObject(ObjectInputStream stream)

    /**
     * Reconstitute this object from a stream (i.e., deserialize it).
     *
     * We handle both JDK 1.1
     * binary formats and full formats with a packed byte array.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private void writeObject(ObjectOutputStream stream)

    /**
     * Save the state of this object to a stream (i.e., serialize it).
     *
     * @serialData We write out two formats, a JDK 1.1 compatible format, using
     * <code>DOW_IN_MONTH_MODE</code> rules, in the required section, followed
     * by the full rules, in packed format, in the optional section.  The
     * optional section will be ignored by JDK 1.1 code upon stream in.
     * <p> Contents of the optional section: The length of a byte array is
     * emitted (int); this is 4 as of this release. The byte array of the given
     * length is emitted. The contents of the byte array are the true values of
     * the fields <code>startDay</code>, <code>startDayOfWeek</code>,
     * <code>endDay</code>, and <code>endDayOfWeek</code>.  The values of these
     * fields in the required section are approximate values suited to the rule
     * mode <code>DOW_IN_MONTH_MODE</code>, which is the only mode recognized by
     * JDK 1.1.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private void unpackTimes(int[] times) {

    /**
     * Unpack the start and end times from an array of bytes.  This is required
     * as of serial version 2.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int[] packTimes() {

    /**
     * Pack the start and end times into an array of bytes.  This is required
     * as of serial version 2.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private void unpackRules(byte[] rules)

    /**
     * Given an array of bytes produced by packRules, interpret them
     * as the start and end rules.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private byte[] packRules()

    /**
     * Pack the start and end rules into an array of bytes.  Only pack
     * data which is not preserved by makeRulesCompatible.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private void makeRulesCompatible()

    /**
     * Make rules compatible to 1.1 FCS code.  Since 1.1 FCS code only understands
     * day-of-week-in-month rules, we must modify other modes of rules to their
     * approximate equivalent in 1.1 FCS terms.  This method is used when streaming
     * out objects of this class.  After it is called, the rules will be modified,
     * with a possible loss of information.  startMode and endMode will NOT be
     * altered, even though semantically they should be set to DOW_IN_MONTH_MODE,
     * since the rule modification is only intended to be temporary.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private void decodeEndRule() {

    /**
     * Decode the end rule and validate the parameters.  This method is exactly
     * analogous to decodeStartRule().
     * @see decodeStartRule
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private void decodeStartRule() {

    /**
     * Decode the start rule and validate the parameters.  The parameters are
     * expected to be in encoded form, which represents the various rule modes
     * by negating or zeroing certain values.  Representation formats are:
     * <p>
     * <pre>
     *            DOW_IN_MONTH  DOM    DOW>=DOM  DOW<=DOM  no DST
     *            ------------  -----  --------  --------  ----------
     * month       0..11        same    same      same     don't care
     * day        -5..5         1..31   1..31    -1..-31   0
     * dayOfWeek   1..7         0      -1..-7    -1..-7    don't care
     * time        0..ONEDAY    same    same      same     don't care
     * </pre>
     * The range for month does not include UNDECIMBER since this class is
     * really specific to GregorianCalendar, which does not use that month.
     * The range for time includes ONEDAY (vs. ending at ONEDAY-1) because the
     * end rule is an exclusive limit point.  That is, the range of times that
     * are in DST include those >= the start and < the end.  For this reason,
     * it should be possible to specify an end of ONEDAY in order to include the
     * entire day.  Although this is equivalent to time 0 of the following day,
     * it's not always possible to specify that, for example, on December 31.
     * While arguably the start range should still be 0..ONEDAY-1, we keep
     * the start and end ranges the same for consistency.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private void decodeRules()

    /**
     * Given a set of encoded rules in startDay and startDayOfMonth, decode
     * them and set the startMode appropriately.  Do the same for endDay and
     * endDayOfMonth.  Upon entry, the day of week variables may be zero or
     * negative, in order to indicate special modes.  The day of month
     * variables may also be negative.  Upon exit, the mode variables will be
     * set, and the day of week and day of month variables will be positive.
     * This method also recognizes a startDay or endDay of zero as indicating
     * no DST.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int serialVersionOnStream = currentSerialVersion;

    /**
     * The version of the serialized data on the stream.  Possible values:
     * <dl>
     * <dt><b>0</b> or not present on stream</dt>
     * <dd>
     * JDK 1.1.3 or earlier.
     * </dd>
     * <dt><b>1</b></dt>
     * <dd>
     * JDK 1.1.4 or later.  Includes three new fields: <code>startMode</code>,
     * <code>endMode</code>, and <code>dstSavings</code>.
     * </dd>
     * <dt><b>2</b></dt>
     * <dd>
     * JDK 1.3 or later.  Includes two new fields: <code>startTimeMode</code>
     * and <code>endTimeMode</code>.
     * </dd>
     * </dl>
     * When streaming out this class, the most recent format
     * and the highest allowable <code>serialVersionOnStream</code>
     * is written.
     * @serial
     * @since 1.1.4
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public static final int UTC_TIME = 2;

    /**
     * Constant for a mode of start or end time specified as UTC. European
     * Union rules are specified as UTC time, for example.
     * @since 1.4
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public static final int STANDARD_TIME = 1;

    /**
     * Constant for a mode of start or end time specified as standard time.
     * @since 1.4
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public static final int WALL_TIME = 0; // Zero for backward compatibility

    /**
     * Constant for a mode of start or end time specified as wall clock
     * time.  Wall clock time is standard time for the onset rule, and
     * daylight time for the end rule.
     * @since 1.4
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private static final int DOM_MODE          = 1; // Exact day of month, "Mar 1"

    /**
     * Constants specifying values of startMode and endMode.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private transient long cacheYear;

    /**
     * Cache values representing a single period of daylight saving
     * time. When the cache values are valid, cacheStart is the start
     * time (inclusive) of daylight saving time and cacheEnd is the
     * end time (exclusive).
     *
     * cacheYear has a year value if both cacheStart and cacheEnd are
     * in the same year. cacheYear is set to startYear - 1 if
     * cacheStart and cacheEnd are in different years. cacheStart is 0
     * if the cache values are void. cacheYear is a long to support
     * Integer.MIN_VALUE - 1 (JCK requirement).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int dstSavings;

    /**
     * A positive value indicating the amount of time saved during DST in
     * milliseconds.
     * Typically one hour (3600000); sometimes 30 minutes (1800000).
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     * @since 1.1.4
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int endMode;

    /**
     * Variables specifying the mode of the end rule.  Takes the following
     * values:
     * <dl>
     * <dt><code>DOM_MODE</code></dt>
     * <dd>
     * Exact day of week; e.g., March 1.
     * </dd>
     * <dt><code>DOW_IN_MONTH_MODE</code></dt>
     * <dd>
     * Day of week in month; e.g., last Sunday in March.
     * </dd>
     * <dt><code>DOW_GE_DOM_MODE</code></dt>
     * <dd>
     * Day of week after day of month; e.g., Sunday on or after March 15.
     * </dd>
     * <dt><code>DOW_LE_DOM_MODE</code></dt>
     * <dd>
     * Day of week before day of month; e.g., Sunday on or before March 15.
     * </dd>
     * </dl>
     * The setting of this field affects the interpretation of the
     * <code>endDay</code> field.
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     * @since 1.1.4
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int startMode;

    /**
     * Variables specifying the mode of the start rule.  Takes the following
     * values:
     * <dl>
     * <dt><code>DOM_MODE</code></dt>
     * <dd>
     * Exact day of week; e.g., March 1.
     * </dd>
     * <dt><code>DOW_IN_MONTH_MODE</code></dt>
     * <dd>
     * Day of week in month; e.g., last Sunday in March.
     * </dd>
     * <dt><code>DOW_GE_DOM_MODE</code></dt>
     * <dd>
     * Day of week after day of month; e.g., Sunday on or after March 15.
     * </dd>
     * <dt><code>DOW_LE_DOM_MODE</code></dt>
     * <dd>
     * Day of week before day of month; e.g., Sunday on or before March 15.
     * </dd>
     * </dl>
     * The setting of this field affects the interpretation of the
     * <code>startDay</code> field.
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     * @since 1.1.4
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private final byte monthLength[] = staticMonthLength;

    /**
     * This field was serialized in JDK 1.1, so we have to keep it that way
     * to maintain serialization compatibility. However, there's no need to
     * recreate the array each time we create a new time zone.
     * @serial An array of bytes containing the values {31, 28, 31, 30, 31, 30,
     * 31, 31, 30, 31, 30, 31}.  This is ignored as of the Java 2 platform v1.2, however, it must
     * be streamed out for compatibility with JDK 1.1.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private boolean useDaylight=false; // indicate if this time zone uses DST

    /**
     * A boolean value which is true if and only if this zone uses daylight
     * saving time.  If this value is false, several other fields are ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int rawOffset;

    /**
     * The offset in milliseconds between this zone and GMT.  Negative offsets
     * are to the west of Greenwich.  To obtain local <em>standard</em> time,
     * add the offset to GMT time.  To obtain local wall time it may also be
     * necessary to add <code>dstSavings</code>.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int startYear;

    /**
     * The year in which daylight saving time is first observed.  This is an {@link GregorianCalendar#AD AD}
     * value.  If this value is less than 1 then daylight saving time is observed
     * for all <code>AD</code> years.
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int endTimeMode;

    /**
     * The format of endTime, either <code>WALL_TIME</code>,
     * <code>STANDARD_TIME</code>, or <code>UTC_TIME</code>.
     * @serial
     * @since 1.3
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int endTime;

    /**
     * The time in milliseconds after midnight at which daylight saving
     * time ends.  This value is expressed as wall time, standard time,
     * or UTC time, depending on the setting of <code>endTimeMode</code>.
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int endDayOfWeek;

    /**
     * The day of the week on which daylight saving time ends.  This value
     * must be between <code>Calendar.SUNDAY</code> and
     * <code>Calendar.SATURDAY</code> inclusive.
     * <p>If <code>useDaylight</code> is false or
     * <code>endMode == DAY_OF_MONTH</code>, this value is ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int endDay;

    /**
     * This field has two possible interpretations:
     * <dl>
     * <dt><code>endMode == DOW_IN_MONTH</code></dt>
     * <dd>
     * <code>endDay</code> indicates the day of the month of
     * <code>endMonth</code> on which daylight
     * saving time ends, from 1 to 28, 30, or 31, depending on the
     * <code>endMonth</code>.
     * </dd>
     * <dt><code>endMode != DOW_IN_MONTH</code></dt>
     * <dd>
     * <code>endDay</code> indicates which <code>endDayOfWeek</code> in th
     * month <code>endMonth</code> daylight
     * saving time ends on.  For example, a value of +1 and a
     * <code>endDayOfWeek</code> of <code>Calendar.SUNDAY</code> indicates the
     * first Sunday of <code>endMonth</code>.  Likewise, +2 would indicate the
     * second Sunday, and -1 the last Sunday.  A value of 0 is illegal.
     * </dd>
     * </dl>
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int endMonth;

    /**
     * The month in which daylight saving time ends.  This value must be
     * between <code>Calendar.JANUARY</code> and
     * <code>Calendar.UNDECIMBER</code>.  This value must not equal
     * <code>startMonth</code>.
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int startTimeMode;

    /**
     * The format of startTime, either WALL_TIME, STANDARD_TIME, or UTC_TIME.
     * @serial
     * @since 1.3
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int startTime;

    /**
     * The time in milliseconds after midnight at which daylight saving
     * time starts.  This value is expressed as wall time, standard time,
     * or UTC time, depending on the setting of <code>startTimeMode</code>.
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int startDayOfWeek;

    /**
     * The day of the week on which daylight saving time starts.  This value
     * must be between <code>Calendar.SUNDAY</code> and
     * <code>Calendar.SATURDAY</code> inclusive.
     * <p>If <code>useDaylight</code> is false or
     * <code>startMode == DAY_OF_MONTH</code>, this value is ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int startDay;

    /**
     * This field has two possible interpretations:
     * <dl>
     * <dt><code>startMode == DOW_IN_MONTH</code></dt>
     * <dd>
     * <code>startDay</code> indicates the day of the month of
     * <code>startMonth</code> on which daylight
     * saving time starts, from 1 to 28, 30, or 31, depending on the
     * <code>startMonth</code>.
     * </dd>
     * <dt><code>startMode != DOW_IN_MONTH</code></dt>
     * <dd>
     * <code>startDay</code> indicates which <code>startDayOfWeek</code> in the
     * month <code>startMonth</code> daylight
     * saving time starts on.  For example, a value of +1 and a
     * <code>startDayOfWeek</code> of <code>Calendar.SUNDAY</code> indicates the
     * first Sunday of <code>startMonth</code>.  Likewise, +2 would indicate the
     * second Sunday, and -1 the last Sunday.  A value of 0 is illegal.
     * </dd>
     * </dl>
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    private int startMonth;

    /**
     * The month in which daylight saving time starts.  This value must be
     * between <code>Calendar.JANUARY</code> and
     * <code>Calendar.DECEMBER</code> inclusive.  This value must not equal
     * <code>endMonth</code>.
     * <p>If <code>useDaylight</code> is false, this value is ignored.
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public String toString() {

    /**
     * Returns a string representation of this time zone.
     * @return a string representation of this time zone.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public boolean hasSameRules(TimeZone other) {

    /**
     * Returns <code>true</code> if this zone has the same rules and offset as another zone.
     * @param other the TimeZone object to be compared with
     * @return <code>true</code> if the given zone is a SimpleTimeZone and has the
     * same rules and offset as this one
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public boolean equals(Object obj)

    /**
     * Compares the equality of two <code>SimpleTimeZone</code> objects.
     *
     * @param obj  The <code>SimpleTimeZone</code> object to be compared with.
     * @return     True if the given <code>obj</code> is the same as this
     *             <code>SimpleTimeZone</code> object; false otherwise.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public synchronized int hashCode()

    /**
     * Generates the hash code for the SimpleDateFormat object.
     * @return the hash code for this object
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public Object clone()

    /**
     * Returns a clone of this <code>SimpleTimeZone</code> instance.
     * @return a clone of this instance.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public boolean inDaylightTime(Date date)

    /**
     * Queries if the given date is in daylight saving time.
     * @return true if daylight saving time is in effective at the
     * given date; false otherwise.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    @Override

    /**
     * Returns {@code true} if this {@code SimpleTimeZone} observes
     * Daylight Saving Time. This method is equivalent to {@link
     * #useDaylightTime()}.
     *
     * @return {@code true} if this {@code SimpleTimeZone} observes
     * Daylight Saving Time; {@code false} otherwise.
     * @since 1.7
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public boolean useDaylightTime()

    /**
     * Queries if this time zone uses daylight saving time.
     * @return true if this time zone uses daylight saving time;
     * false otherwise.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public int getDSTSavings() {

    /**
     * Returns the amount of time in milliseconds that the clock is
     * advanced during daylight saving time.
     *
     * @return the number of milliseconds the time is advanced with
     * respect to standard time when the daylight saving rules are in
     * effect, or 0 (zero) if this time zone doesn't observe daylight
     * saving time.
     *
     * @see #setDSTSavings
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public void setDSTSavings(int millisSavedDuringDST) {

    /**
     * Sets the amount of time in milliseconds that the clock is advanced
     * during daylight saving time.
     * @param millisSavedDuringDST the number of milliseconds the time is
     * advanced with respect to standard time when the daylight saving time rules
     * are in effect. A positive number, typically one hour (3600000).
     * @see #getDSTSavings
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public void setRawOffset(int offsetMillis)

    /**
     * Sets the base time zone offset to GMT.
     * This is the offset to add to UTC to get local time.
     * @see #getRawOffset
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public int getRawOffset()

    /**
     * Gets the GMT offset for this time zone.
     * @return the GMT offset value in milliseconds
     * @see #setRawOffset
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public int getOffset(int era, int year, int month, int day, int dayOfWeek,
                         int millis)

   /**
     * Returns the difference in milliseconds between local time and
     * UTC, taking into account both the raw offset and the effect of
     * daylight saving, for the specified date and time.  This method
     * assumes that the start and end month are distinct.  It also
     * uses a default {@link GregorianCalendar} object as its
     * underlying calendar, such as for determining leap years.  Do
     * not use the result of this method with a calendar other than a
     * default <code>GregorianCalendar</code>.
     *
     * <p><em>Note:  In general, clients should use
     * <code>Calendar.get(ZONE_OFFSET) + Calendar.get(DST_OFFSET)</code>
     * instead of calling this method.</em>
     *
     * @param era       The era of the given date.
     * @param year      The year in the given date.
     * @param month     The month in the given date. Month is 0-based. e.g.,
     *                  0 for January.
     * @param day       The day-in-month of the given date.
     * @param dayOfWeek The day-of-week of the given date.
     * @param millis    The milliseconds in day in <em>standard</em> local time.
     * @return          The milliseconds to add to UTC to get local time.
     * @exception       IllegalArgumentException the <code>era</code>,
     *                  <code>month</code>, <code>day</code>, <code>dayOfWeek</code>,
     *                  or <code>millis</code> parameters are out of range
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    int getOffsets(long date, int[] offsets) {

    /**
     * @see TimeZone#getOffsets
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public int getOffset(long date) {

    /**
     * Returns the offset of this time zone from UTC at the given
     * time. If daylight saving time is in effect at the given time,
     * the offset value is adjusted with the amount of daylight
     * saving.
     *
     * @param date the time at which the time zone offset is found
     * @return the amount of time in milliseconds to add to UTC to get
     * local time.
     * @since 1.4
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public void setEndRule(int endMonth, int endDay, int endDayOfWeek, int endTime, boolean after)

    /**
     * Sets the daylight saving time end rule to a weekday before or after the given date within
     * a month, e.g., the first Monday on or after the 8th.
     *
     * @param endMonth        The daylight saving time ending month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 9 for October).
     * @param endDay          The day of the month on which the daylight saving time ends.
     * @param endDayOfWeek    The daylight saving time ending day-of-week.
     * @param endTime         The daylight saving ending time in local wall clock time,
     *                        (in milliseconds within the day) which is local daylight
     *                        time in this case.
     * @param after           If true, this rule selects the first <code>endDayOfWeek</code> on
     *                        or <em>after</em> <code>endDay</code>.  If false, this rule
     *                        selects the last <code>endDayOfWeek</code> on or before
     *                        <code>endDay</code> of the month.
     * @exception IllegalArgumentException the <code>endMonth</code>, <code>endDay</code>,
     * <code>endDayOfWeek</code>, or <code>endTime</code> parameters are out of range
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public void setEndRule(int endMonth, int endDay, int endTime)

    /**
     * Sets the daylight saving time end rule to a fixed date within a month.
     * This method is equivalent to:
     * <pre><code>setEndRule(endMonth, endDay, 0, endTime)</code></pre>
     *
     * @param endMonth        The daylight saving time ending month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 9 for October).
     * @param endDay          The day of the month on which the daylight saving time ends.
     * @param endTime         The daylight saving ending time in local wall clock time,
     *                        (in milliseconds within the day) which is local daylight
     *                        time in this case.
     * @exception IllegalArgumentException the <code>endMonth</code>, <code>endDay</code>,
     * or <code>endTime</code> parameters are out of range
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public void setEndRule(int endMonth, int endDay, int endDayOfWeek,
                           int endTime)

    /**
     * Sets the daylight saving time end rule. For example, if daylight saving time
     * ends on the last Sunday in October at 2 am in wall clock time,
     * you can set the end rule by calling:
     * <code>setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2*60*60*1000);</code>
     *
     * @param endMonth        The daylight saving time ending month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 9 for October).
     * @param endDay          The day of the month on which the daylight saving time ends.
     *                        See the class description for the special cases of this parameter.
     * @param endDayOfWeek    The daylight saving time ending day-of-week.
     *                        See the class description for the special cases of this parameter.
     * @param endTime         The daylight saving ending time in local wall clock time,
     *                        (in milliseconds within the day) which is local daylight
     *                        time in this case.
     * @exception IllegalArgumentException if the <code>endMonth</code>, <code>endDay</code>,
     * <code>endDayOfWeek</code>, or <code>endTime</code> parameters are out of range
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public void setStartRule(int startMonth, int startDay, int startDayOfWeek,
                             int startTime, boolean after)

    /**
     * Sets the daylight saving time start rule to a weekday before or after the given date within
     * a month, e.g., the first Monday on or after the 8th.
     *
     * @param startMonth      The daylight saving time starting month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 0 for January).
     * @param startDay        The day of the month on which the daylight saving time starts.
     * @param startDayOfWeek  The daylight saving time starting day-of-week.
     * @param startTime       The daylight saving time starting time in local wall clock
     *                        time, which is local standard time in this case.
     * @param after           If true, this rule selects the first <code>dayOfWeek</code> on or
     *                        <em>after</em> <code>dayOfMonth</code>.  If false, this rule
     *                        selects the last <code>dayOfWeek</code> on or <em>before</em>
     *                        <code>dayOfMonth</code>.
     * @exception IllegalArgumentException if the <code>startMonth</code>, <code>startDay</code>,
     * <code>startDayOfWeek</code>, or <code>startTime</code> parameters are out of range
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public void setStartRule(int startMonth, int startDay, int startTime) {

    /**
     * Sets the daylight saving time start rule to a fixed date within a month.
     * This method is equivalent to:
     * <pre><code>setStartRule(startMonth, startDay, 0, startTime)</code></pre>
     *
     * @param startMonth      The daylight saving time starting month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 0 for January).
     * @param startDay        The day of the month on which the daylight saving time starts.
     * @param startTime       The daylight saving time starting time in local wall clock
     *                        time, which is local standard time in this case.
     *                        See the class description for the special cases of this parameter.
     * @exception IllegalArgumentException if the <code>startMonth</code>,
     * <code>startDayOfMonth</code>, or <code>startTime</code> parameters are out of range
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public void setStartRule(int startMonth, int startDay, int startDayOfWeek, int startTime)

    /**
     * Sets the daylight saving time start rule. For example, if daylight saving
     * time starts on the first Sunday in April at 2 am in local wall clock
     * time, you can set the start rule by calling:
     * <pre><code>setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2*60*60*1000);</code></pre>
     *
     * @param startMonth      The daylight saving time starting month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 0 for January).
     * @param startDay        The day of the month on which the daylight saving time starts.
     *                        See the class description for the special cases of this parameter.
     * @param startDayOfWeek  The daylight saving time starting day-of-week.
     *                        See the class description for the special cases of this parameter.
     * @param startTime       The daylight saving time starting time in local wall clock
     *                        time, which is local standard time in this case.
     * @exception IllegalArgumentException if the <code>startMonth</code>, <code>startDay</code>,
     * <code>startDayOfWeek</code>, or <code>startTime</code> parameters are out of range
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public void setStartYear(int year)

    /**
     * Sets the daylight saving time starting year.
     *
     * @param year  The daylight saving starting year.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public SimpleTimeZone(int rawOffset, String ID,
                          int startMonth, int startDay, int startDayOfWeek,
                          int startTime, int startTimeMode,
                          int endMonth, int endDay, int endDayOfWeek,
                          int endTime, int endTimeMode,
                          int dstSavings) {

    /**
     * Constructs a SimpleTimeZone with the given base time zone offset from
     * GMT, time zone ID, and rules for starting and ending the daylight
     * time.
     * This constructor takes the full set of the start and end rules
     * parameters, including modes of <code>startTime</code> and
     * <code>endTime</code>. The mode specifies either {@link #WALL_TIME wall
     * time} or {@link #STANDARD_TIME standard time} or {@link #UTC_TIME UTC
     * time}.
     *
     * @param rawOffset       The given base time zone offset from GMT.
     * @param ID              The time zone ID which is given to this object.
     * @param startMonth      The daylight saving time starting month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 0 for January).
     * @param startDay        The day of the month on which the daylight saving time starts.
     *                        See the class description for the special cases of this parameter.
     * @param startDayOfWeek  The daylight saving time starting day-of-week.
     *                        See the class description for the special cases of this parameter.
     * @param startTime       The daylight saving time starting time in the time mode
     *                        specified by <code>startTimeMode</code>.
     * @param startTimeMode   The mode of the start time specified by startTime.
     * @param endMonth        The daylight saving time ending month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 9 for October).
     * @param endDay          The day of the month on which the daylight saving time ends.
     *                        See the class description for the special cases of this parameter.
     * @param endDayOfWeek    The daylight saving time ending day-of-week.
     *                        See the class description for the special cases of this parameter.
     * @param endTime         The daylight saving ending time in time time mode
     *                        specified by <code>endTimeMode</code>.
     * @param endTimeMode     The mode of the end time specified by endTime
     * @param dstSavings      The amount of time in milliseconds saved during
     *                        daylight saving time.
     *
     * @exception IllegalArgumentException if the month, day, dayOfWeek, time more, or
     * time parameters are out of range for the start or end rule, or if a time mode
     * value is invalid.
     *
     * @see #WALL_TIME
     * @see #STANDARD_TIME
     * @see #UTC_TIME
     *
     * @since 1.4
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public SimpleTimeZone(int rawOffset, String ID,
                          int startMonth, int startDay, int startDayOfWeek, int startTime,
                          int endMonth, int endDay, int endDayOfWeek, int endTime,
                          int dstSavings)

    /**
     * Constructs a SimpleTimeZone with the given base time zone offset from
     * GMT, time zone ID, and rules for starting and ending the daylight
     * time.
     * Both <code>startTime</code> and <code>endTime</code> are assumed to be
     * represented in the wall clock time. This constructor is equivalent to:
     * <pre><code>
     *     SimpleTimeZone(rawOffset,
     *                    ID,
     *                    startMonth,
     *                    startDay,
     *                    startDayOfWeek,
     *                    startTime,
     *                    SimpleTimeZone.{@link #WALL_TIME},
     *                    endMonth,
     *                    endDay,
     *                    endDayOfWeek,
     *                    endTime,
     *                    SimpleTimeZone.{@link #WALL_TIME},
     *                    dstSavings)
     * </code></pre>
     *
     * @param rawOffset       The given base time zone offset from GMT.
     * @param ID              The time zone ID which is given to this object.
     * @param startMonth      The daylight saving time starting month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 0 for January).
     * @param startDay        The day of the month on which the daylight saving time starts.
     *                        See the class description for the special cases of this parameter.
     * @param startDayOfWeek  The daylight saving time starting day-of-week.
     *                        See the class description for the special cases of this parameter.
     * @param startTime       The daylight saving time starting time in local wall clock
     *                        time, which is local standard time in this case.
     * @param endMonth        The daylight saving time ending month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 9 for October).
     * @param endDay          The day of the month on which the daylight saving time ends.
     *                        See the class description for the special cases of this parameter.
     * @param endDayOfWeek    The daylight saving time ending day-of-week.
     *                        See the class description for the special cases of this parameter.
     * @param endTime         The daylight saving ending time in local wall clock time,
     *                        which is local daylight time in this case.
     * @param dstSavings      The amount of time in milliseconds saved during
     *                        daylight saving time.
     * @exception IllegalArgumentException if the month, day, dayOfWeek, or time
     * parameters are out of range for the start or end rule
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public SimpleTimeZone(int rawOffset, String ID,
                          int startMonth, int startDay, int startDayOfWeek, int startTime,
                          int endMonth, int endDay, int endDayOfWeek, int endTime)

    /**
     * Constructs a SimpleTimeZone with the given base time zone offset from
     * GMT, time zone ID, and rules for starting and ending the daylight
     * time.
     * Both <code>startTime</code> and <code>endTime</code> are specified to be
     * represented in the wall clock time. The amount of daylight saving is
     * assumed to be 3600000 milliseconds (i.e., one hour). This constructor is
     * equivalent to:
     * <pre><code>
     *     SimpleTimeZone(rawOffset,
     *                    ID,
     *                    startMonth,
     *                    startDay,
     *                    startDayOfWeek,
     *                    startTime,
     *                    SimpleTimeZone.{@link #WALL_TIME},
     *                    endMonth,
     *                    endDay,
     *                    endDayOfWeek,
     *                    endTime,
     *                    SimpleTimeZone.{@link #WALL_TIME},
     *                    3600000)
     * </code></pre>
     *
     * @param rawOffset       The given base time zone offset from GMT.
     * @param ID              The time zone ID which is given to this object.
     * @param startMonth      The daylight saving time starting month. Month is
     *                        a {@link Calendar#MONTH MONTH} field value (0-based. e.g., 0
     *                        for January).
     * @param startDay        The day of the month on which the daylight saving time starts.
     *                        See the class description for the special cases of this parameter.
     * @param startDayOfWeek  The daylight saving time starting day-of-week.
     *                        See the class description for the special cases of this parameter.
     * @param startTime       The daylight saving time starting time in local wall clock
     *                        time (in milliseconds within the day), which is local
     *                        standard time in this case.
     * @param endMonth        The daylight saving time ending month. Month is
     *                        a {@link Calendar#MONTH MONTH} field
     *                        value (0-based. e.g., 9 for October).
     * @param endDay          The day of the month on which the daylight saving time ends.
     *                        See the class description for the special cases of this parameter.
     * @param endDayOfWeek    The daylight saving time ending day-of-week.
     *                        See the class description for the special cases of this parameter.
     * @param endTime         The daylight saving ending time in local wall clock time,
     *                        (in milliseconds within the day) which is local daylight
     *                        time in this case.
     * @exception IllegalArgumentException if the month, day, dayOfWeek, or time
     * parameters are out of range for the start or end rule
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
    public SimpleTimeZone(int rawOffset, String ID)

    /**
     * Constructs a SimpleTimeZone with the given base time zone offset from GMT
     * and time zone ID with no daylight saving time schedule.
     *
     * @param rawOffset  The base time zone offset in milliseconds to GMT.
     * @param ID         The time zone name that is given to this instance.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//SimpleTimeZone.java
public class SimpleTimeZone extends TimeZone {

/**
 * <code>SimpleTimeZone</code> is a concrete subclass of <code>TimeZone</code>
 * that represents a time zone for use with a Gregorian calendar.
 * The class holds an offset from GMT, called <em>raw offset</em>, and start
 * and end rules for a daylight saving time schedule.  Since it only holds
 * single values for each, it cannot handle historical changes in the offset
 * from GMT and the daylight saving schedule, except that the {@link
 * #setStartYear setStartYear} method can specify the year when the daylight
 * saving time schedule starts in effect.
 * <p>
 * To construct a <code>SimpleTimeZone</code> with a daylight saving time
 * schedule, the schedule can be described with a set of rules,
 * <em>start-rule</em> and <em>end-rule</em>. A day when daylight saving time
 * starts or ends is specified by a combination of <em>month</em>,
 * <em>day-of-month</em>, and <em>day-of-week</em> values. The <em>month</em>
 * value is represented by a Calendar {@link Calendar#MONTH MONTH} field
 * value, such as {@link Calendar#MARCH}. The <em>day-of-week</em> value is
 * represented by a Calendar {@link Calendar#DAY_OF_WEEK DAY_OF_WEEK} value,
 * such as {@link Calendar#SUNDAY SUNDAY}. The meanings of value combinations
 * are as follows.
 *
 * <ul>
 * <li><b>Exact day of month</b><br>
 * To specify an exact day of month, set the <em>month</em> and
 * <em>day-of-month</em> to an exact value, and <em>day-of-week</em> to zero. For
 * example, to specify March 1, set the <em>month</em> to {@link Calendar#MARCH
 * MARCH}, <em>day-of-month</em> to 1, and <em>day-of-week</em> to 0.</li>
 *
 * <li><b>Day of week on or after day of month</b><br>
 * To specify a day of week on or after an exact day of month, set the
 * <em>month</em> to an exact month value, <em>day-of-month</em> to the day on
 * or after which the rule is applied, and <em>day-of-week</em> to a negative {@link
 * Calendar#DAY_OF_WEEK DAY_OF_WEEK} field value. For example, to specify the
 * second Sunday of April, set <em>month</em> to {@link Calendar#APRIL APRIL},
 * <em>day-of-month</em> to 8, and <em>day-of-week</em> to <code>-</code>{@link
 * Calendar#SUNDAY SUNDAY}.</li>
 *
 * <li><b>Day of week on or before day of month</b><br>
 * To specify a day of the week on or before an exact day of the month, set
 * <em>day-of-month</em> and <em>day-of-week</em> to a negative value. For
 * example, to specify the last Wednesday on or before the 21st of March, set
 * <em>month</em> to {@link Calendar#MARCH MARCH}, <em>day-of-month</em> is -21
 * and <em>day-of-week</em> is <code>-</code>{@link Calendar#WEDNESDAY WEDNESDAY}. </li>
 *
 * <li><b>Last day-of-week of month</b><br>
 * To specify, the last day-of-week of the month, set <em>day-of-week</em> to a
 * {@link Calendar#DAY_OF_WEEK DAY_OF_WEEK} value and <em>day-of-month</em> to
 * -1. For example, to specify the last Sunday of October, set <em>month</em>
 * to {@link Calendar#OCTOBER OCTOBER}, <em>day-of-week</em> to {@link
 * Calendar#SUNDAY SUNDAY} and <em>day-of-month</em> to -1.  </li>
 *
 * </ul>
 * The time of the day at which daylight saving time starts or ends is
 * specified by a millisecond value within the day. There are three kinds of
 * <em>mode</em>s to specify the time: {@link #WALL_TIME}, {@link
 * #STANDARD_TIME} and {@link #UTC_TIME}. For example, if daylight
 * saving time ends
 * at 2:00 am in the wall clock time, it can be specified by 7200000
 * milliseconds in the {@link #WALL_TIME} mode. In this case, the wall clock time
 * for an <em>end-rule</em> means the same thing as the daylight time.
 * <p>
 * The following are examples of parameters for constructing time zone objects.
 * <pre><code>
 *      // Base GMT offset: -8:00
 *      // DST starts:      at 2:00am in standard time
 *      //                  on the first Sunday in April
 *      // DST ends:        at 2:00am in daylight time
 *      //                  on the last Sunday in October
 *      // Save:            1 hour
 *      SimpleTimeZone(-28800000,
 *                     "America/Los_Angeles",
 *                     Calendar.APRIL, 1, -Calendar.SUNDAY,
 *                     7200000,
 *                     Calendar.OCTOBER, -1, Calendar.SUNDAY,
 *                     7200000,
 *                     3600000)
 *
 *      // Base GMT offset: +1:00
 *      // DST starts:      at 1:00am in UTC time
 *      //                  on the last Sunday in March
 *      // DST ends:        at 1:00am in UTC time
 *      //                  on the last Sunday in October
 *      // Save:            1 hour
 *      SimpleTimeZone(3600000,
 *                     "Europe/Paris",
 *                     Calendar.MARCH, -1, Calendar.SUNDAY,
 *                     3600000, SimpleTimeZone.UTC_TIME,
 *                     Calendar.OCTOBER, -1, Calendar.SUNDAY,
 *                     3600000, SimpleTimeZone.UTC_TIME,
 *                     3600000)
 * </code></pre>
 * These parameter rules are also applicable to the set rule methods, such as
 * <code>setStartRule</code>.
 *
 * @since 1.1
 * @see      Calendar
 * @see      GregorianCalendar
 * @see      TimeZone
 * @author   David Goldsmith, Mark Davis, Chen-Lieh Huang, Alan Liu
 */
