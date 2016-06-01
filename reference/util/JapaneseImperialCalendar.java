_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private void readObject(ObjectInputStream stream)

    /**
     * Updates internal state.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private int internalGetEra() {

    /**
     * Returns the ERA.  We need a special method for this because the
     * default ERA is the current era, but a zero (unset) ERA means before Meiji.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private static int getRolledValue(int value, int amount, int min, int max) {

    /**
     * Returns the new value after 'roll'ing the specified value and amount.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private void pinDayOfMonth(LocalGregorianCalendar.Date date) {

    /**
     * After adjustments such as add(MONTH), add(YEAR), we don't want the
     * month to jump around.  E.g., we don't want Jan 31 + 1 month to go to Mar
     * 3, we want it to go to Feb 28.  Adjustments which might run into this
     * problem call this method to retain the proper month.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private JapaneseImperialCalendar getNormalizedCalendar() {

    /**
     * Returns this object if it's normalized (all fields and time are
     * in sync). Otherwise, a cloned object is returned after calling
     * complete() in lenient mode.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private static int getTransitionEraIndex(LocalGregorianCalendar.Date date) {

    /**
     * Returns the index to the new era if the given date is in a
     * transition month.  For example, if the give date is Heisei 1
     * (1989) January 20, then the era index for Heisei is
     * returned. Likewise, if the given date is Showa 64 (1989)
     * January 3, then the era index for Heisei is returned. If the
     * given date is not in any transition month, then -1 is returned.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private int monthLength(int month) {

    /**
     * Returns the length of the specified month in the year provided
     * by internalGet(YEAR).
     *
     * @see GregorianCalendar#isLeapYear(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private int monthLength(int month, int gregorianYear) {

    /**
     * Returns the length of the specified month in the specified
     * Gregorian year. The year number must be normalized.
     *
     * @see GregorianCalendar#isLeapYear(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private static LocalGregorianCalendar.Date getCalendarDate(long fd) {

    /**
     * Returns a LocalGregorianCalendar.Date produced from the specified fixed date.
     *
     * @param fd the fixed date
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private long getFixedDateMonth1(LocalGregorianCalendar.Date date,
                                          long fixedDate) {

    /**
     * Returns the fixed date of the first date of the month (usually
     * the 1st of the month) before the specified date.
     *
     * @param date the date for which the first day of the month is
     * calculated. The date must be in the era transition year.
     * @param fixedDate the fixed date representation of the date
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private long getFixedDateJan1(LocalGregorianCalendar.Date date, long fixedDate) {

    /**
     * Returns the fixed date of the first day of the year (usually
     * January 1) before the specified date.
     *
     * @param date the date for which the first day of the year is
     * calculated. The date has to be in the cut-over year.
     * @param fixedDate the fixed date representation of the date
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private long getFixedDate(int era, int year, int fieldMask) {

    /**
     * Computes the fixed date under either the Gregorian or the
     * Julian calendar, using the given year and the specified calendar fields.
     *
     * @param era era index
     * @param year the normalized year number, with 0 indicating the
     * year 1 BCE, -1 indicating 2 BCE, etc.
     * @param fieldMask the calendar fields to be used for the date calculation
     * @return the fixed date
     * @see Calendar#selectFields
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    protected void computeTime() {

    /**
     * Converts calendar field values to the time value (millisecond
     * offset from the <a href="Calendar.html#Epoch">Epoch</a>).
     *
     * @exception IllegalArgumentException if any calendar fields are invalid.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private int getWeekNumber(long fixedDay1, long fixedDate) {

    /**
     * Returns the number of weeks in a period between fixedDay1 and
     * fixedDate. The getFirstDayOfWeek-getMinimalDaysInFirstWeek rule
     * is applied to calculate the number of weeks.
     *
     * @param fixedDay1 the fixed date of the first day of the period
     * @param fixedDate the fixed date of the last day of the period
     * @return the number of weeks of the given period
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private int computeFields(int fieldMask, int tzMask) {

    /**
     * This computeFields implements the conversion from UTC
     * (millisecond offset from the Epoch) to calendar
     * field values. fieldMask specifies which fields to change the
     * setting state to COMPUTED, although all fields are set to
     * the correct values. This is required to fix 4685354.
     *
     * @param fieldMask a bit mask to specify which fields to change
     * the setting state.
     * @param tzMask a bit mask to specify which time zone offset
     * fields to be used for time calculations
     * @return a new field mask that indicates what field values have
     * actually been set.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    protected void computeFields() {

    /**
     * Converts the time value (millisecond offset from the <a
     * href="Calendar.html#Epoch">Epoch</a>) to calendar field values.
     * The time is <em>not</em>
     * recomputed first; to recompute the time, then the fields, call the
     * <code>complete</code> method.
     *
     * @see Calendar#complete
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    transient private long cachedFixedDate = Long.MIN_VALUE;

    /**
     * The fixed date corresponding to jdate. If the value is
     * Long.MIN_VALUE, the fixed date value is unknown.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private long getYearOffsetInMillis(CalendarDate date) {

    /**
     * Returns the millisecond offset from the beginning of the
     * year. In the year for Long.MIN_VALUE, it's a pseudo value
     * beyond the limit. The given CalendarDate object must have been
     * normalized before calling this method.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public int getActualMaximum(int field) {

    /**
     * Returns the maximum value that this calendar field could have,
     * taking into consideration the given time value and the current
     * values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * and
     * {@link Calendar#getTimeZone() getTimeZone} methods.
     * For example, if the date of this instance is Heisei 16February 1,
     * the actual maximum value of the <code>DAY_OF_MONTH</code> field
     * is 29 because Heisei 16 is a leap year, and if the date of this
     * instance is Heisei 17 February 1, it's 28.
     *
     * @param field the calendar field
     * @return the maximum of the given field for the time value of
     * this <code>JapaneseImperialCalendar</code>
     * @see #getMinimum(int)
     * @see #getMaximum(int)
     * @see #getGreatestMinimum(int)
     * @see #getLeastMaximum(int)
     * @see #getActualMinimum(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public int getActualMinimum(int field) {

    /**
     * Returns the minimum value that this calendar field could have,
     * taking into consideration the given time value and the current
     * values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * and {@link Calendar#getTimeZone() getTimeZone} methods.
     *
     * @param field the calendar field
     * @return the minimum of the given field for the time value of
     * this <code>JapaneseImperialCalendar</code>
     * @see #getMinimum(int)
     * @see #getMaximum(int)
     * @see #getGreatestMinimum(int)
     * @see #getLeastMaximum(int)
     * @see #getActualMaximum(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public int getLeastMaximum(int field) {

    /**
     * Returns the lowest maximum value for the given calendar field
     * of this <code>GregorianCalendar</code> instance. The lowest
     * maximum value is defined as the smallest value returned by
     * {@link #getActualMaximum(int)} for any possible time value,
     * taking into consideration the current values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * and {@link Calendar#getTimeZone() getTimeZone} methods.
     *
     * @param field the calendar field
     * @return the lowest maximum value for the given calendar field.
     * @see #getMinimum(int)
     * @see #getMaximum(int)
     * @see #getGreatestMinimum(int)
     * @see #getActualMinimum(int)
     * @see #getActualMaximum(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public int getGreatestMinimum(int field) {

    /**
     * Returns the highest minimum value for the given calendar field
     * of this <code>GregorianCalendar</code> instance. The highest
     * minimum value is defined as the largest value returned by
     * {@link #getActualMinimum(int)} for any possible time value,
     * taking into consideration the current values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * and {@link Calendar#getTimeZone() getTimeZone} methods.
     *
     * @param field the calendar field.
     * @return the highest minimum value for the given calendar field.
     * @see #getMinimum(int)
     * @see #getMaximum(int)
     * @see #getLeastMaximum(int)
     * @see #getActualMinimum(int)
     * @see #getActualMaximum(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public int getMaximum(int field) {

    /**
     * Returns the maximum value for the given calendar field of this
     * <code>GregorianCalendar</code> instance. The maximum value is
     * defined as the largest value returned by the {@link
     * Calendar#get(int) get} method for any possible time value,
     * taking into consideration the current values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * and {@link Calendar#getTimeZone() getTimeZone} methods.
     *
     * @param field the calendar field.
     * @return the maximum value for the given calendar field.
     * @see #getMinimum(int)
     * @see #getGreatestMinimum(int)
     * @see #getLeastMaximum(int)
     * @see #getActualMinimum(int)
     * @see #getActualMaximum(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public int getMinimum(int field) {

    /**
     * Returns the minimum value for the given calendar field of this
     * <code>Calendar</code> instance. The minimum value is
     * defined as the smallest value returned by the {@link
     * Calendar#get(int) get} method for any possible time value,
     * taking into consideration the current values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * and {@link Calendar#getTimeZone() getTimeZone} methods.
     *
     * @param field the calendar field.
     * @return the minimum value for the given calendar field.
     * @see #getMaximum(int)
     * @see #getGreatestMinimum(int)
     * @see #getLeastMaximum(int)
     * @see #getActualMinimum(int)
     * @see #getActualMaximum(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public void roll(int field, int amount) {

    /**
     * Adds a signed amount to the specified calendar field without changing larger fields.
     * A negative roll amount means to subtract from field without changing
     * larger fields. If the specified amount is 0, this method performs nothing.
     *
     * <p>This method calls {@link #complete()} before adding the
     * amount so that all the calendar fields are normalized. If there
     * is any calendar field having an out-of-range value in non-lenient mode, then an
     * <code>IllegalArgumentException</code> is thrown.
     *
     * @param field the calendar field.
     * @param amount the signed amount to add to <code>field</code>.
     * @exception IllegalArgumentException if <code>field</code> is
     * <code>ZONE_OFFSET</code>, <code>DST_OFFSET</code>, or unknown,
     * or if any calendar fields have out-of-range values in
     * non-lenient mode.
     * @see #roll(int,boolean)
     * @see #add(int,int)
     * @see #set(int,int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public void add(int field, int amount) {

    /**
     * Adds the specified (signed) amount of time to the given calendar field,
     * based on the calendar's rules.
     *
     * <p><em>Add rule 1</em>. The value of <code>field</code>
     * after the call minus the value of <code>field</code> before the
     * call is <code>amount</code>, modulo any overflow that has occurred in
     * <code>field</code>. Overflow occurs when a field value exceeds its
     * range and, as a result, the next larger field is incremented or
     * decremented and the field value is adjusted back into its range.</p>
     *
     * <p><em>Add rule 2</em>. If a smaller field is expected to be
     * invariant, but it is impossible for it to be equal to its
     * prior value because of changes in its minimum or maximum after
     * <code>field</code> is changed, then its value is adjusted to be as close
     * as possible to its expected value. A smaller field represents a
     * smaller unit of time. <code>HOUR</code> is a smaller field than
     * <code>DAY_OF_MONTH</code>. No adjustment is made to smaller fields
     * that are not expected to be invariant. The calendar system
     * determines what fields are expected to be invariant.</p>
     *
     * @param field the calendar field.
     * @param amount the amount of date or time to be added to the field.
     * @exception IllegalArgumentException if <code>field</code> is
     * <code>ZONE_OFFSET</code>, <code>DST_OFFSET</code>, or unknown,
     * or if any calendar fields have out-of-range values in
     * non-lenient mode.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public int hashCode() {

    /**
     * Generates the hash code for this
     * <code>JapaneseImperialCalendar</code> object.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public boolean equals(Object obj) {

    /**
     * Compares this <code>JapaneseImperialCalendar</code> to the specified
     * <code>Object</code>. The result is <code>true</code> if and
     * only if the argument is a <code>JapaneseImperialCalendar</code> object
     * that represents the same time value (millisecond offset from
     * the <a href="Calendar.html#Epoch">Epoch</a>) under the same
     * <code>Calendar</code> parameters.
     *
     * @param obj the object to compare with.
     * @return <code>true</code> if this object is equal to <code>obj</code>;
     * <code>false</code> otherwise.
     * @see Calendar#compareTo(Calendar)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    @Override

    /**
     * Returns {@code "japanese"} as the calendar type of this {@code
     * JapaneseImperialCalendar}.
     *
     * @return {@code "japanese"}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    JapaneseImperialCalendar(TimeZone zone, Locale aLocale, boolean flag) {

    /**
     * Constructs an "empty" {@code JapaneseImperialCalendar}.
     *
     * @param zone    the given time zone
     * @param aLocale the given locale
     * @param flag    the flag requesting an empty instance
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    JapaneseImperialCalendar(TimeZone zone, Locale aLocale) {

    /**
     * Constructs a <code>JapaneseImperialCalendar</code> based on the current time
     * in the given time zone with the given locale.
     *
     * @param zone the given time zone.
     * @param aLocale the given locale.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private transient int[] originalFields;

    /**
     * Temporary storage for saving original fields[] values in
     * non-lenient mode.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private transient int[] zoneOffsets;

    /**
     * Temporary int[2] to get time zone offsets. zoneOffsets[0] gets
     * the GMT offset value and zoneOffsets[1] gets the daylight saving
     * value.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    private transient LocalGregorianCalendar.Date jdate;

    /**
     * jdate always has a sun.util.calendar.LocalGregorianCalendar.Date instance to
     * avoid overhead of creating it for each calculation.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public static final int HEISEI = 4;

    /**
     * The ERA constant designating the Heisei era.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public static final int SHOWA = 3;

    /**
     * The ERA constant designating the Showa era.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public static final int TAISHO = 2;

    /**
     * The ERA constant designating the Taisho era.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public static final int MEIJI = 1;

    /**
     * The ERA constant designating the Meiji era.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
    public static final int BEFORE_MEIJI = 0;

    /**
     * The ERA constant designating the era before Meiji.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//JapaneseImperialCalendar.java
class JapaneseImperialCalendar extends Calendar {

/**
 * <code>JapaneseImperialCalendar</code> implements a Japanese
 * calendar system in which the imperial era-based year numbering is
 * supported from the Meiji era. The following are the eras supported
 * by this calendar system.
 * <pre><tt>
 * ERA value   Era name    Since (in Gregorian)
 * ------------------------------------------------------
 *     0       N/A         N/A
 *     1       Meiji       1868-01-01 midnight local time
 *     2       Taisho      1912-07-30 midnight local time
 *     3       Showa       1926-12-25 midnight local time
 *     4       Heisei      1989-01-08 midnight local time
 * ------------------------------------------------------
 * </tt></pre>
 *
 * <p><code>ERA</code> value 0 specifies the years before Meiji and
 * the Gregorian year values are used. Unlike {@link
 * GregorianCalendar}, the Julian to Gregorian transition is not
 * supported because it doesn't make any sense to the Japanese
 * calendar systems used before Meiji. To represent the years before
 * Gregorian year 1, 0 and negative values are used. The Japanese
 * Imperial rescripts and government decrees don't specify how to deal
 * with time differences for applying the era transitions. This
 * calendar implementation assumes local time for all transitions.
 *
 * @author Masayoshi Okutsu
 * @since 1.6
 */
