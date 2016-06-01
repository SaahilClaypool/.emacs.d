_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public static GregorianCalendar from(ZonedDateTime zdt) {

    /**
     * Obtains an instance of {@code GregorianCalendar} with the default locale
     * from a {@code ZonedDateTime} object.
     * <p>
     * Since {@code ZonedDateTime} does not support a Julian-Gregorian cutover
     * date and uses ISO calendar system, the return GregorianCalendar is a pure
     * Gregorian calendar and uses ISO 8601 standard for week definitions,
     * which has {@code MONDAY} as the {@link Calendar#getFirstDayOfWeek()
     * FirstDayOfWeek} and {@code 4} as the value of the
     * {@link Calendar#getMinimalDaysInFirstWeek() MinimalDaysInFirstWeek}.
     * <p>
     * {@code ZoneDateTime} can store points on the time-line further in the
     * future and further in the past than {@code GregorianCalendar}. In this
     * scenario, this method will throw an {@code IllegalArgumentException}
     * exception.
     *
     * @param zdt  the zoned date-time object to convert
     * @return  the gregorian calendar representing the same point on the
     *  time-line as the zoned date-time provided
     * @exception NullPointerException if {@code zdt} is null
     * @exception IllegalArgumentException if the zoned date-time is too
     * large to represent as a {@code GregorianCalendar}
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public ZonedDateTime toZonedDateTime() {

    /**
     * Converts this object to a {@code ZonedDateTime} that represents
     * the same point on the time-line as this {@code GregorianCalendar}.
     * <p>
     * Since this object supports a Julian-Gregorian cutover date and
     * {@code ZonedDateTime} does not, it is possible that the resulting year,
     * month and day will have different values.  The result will represent the
     * correct date in the ISO calendar system, which will also be the same value
     * for Modified Julian Days.
     *
     * @return a zoned date-time representing the same point on the time-line
     *  as this gregorian calendar
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private void readObject(ObjectInputStream stream)

    /**
     * Updates internal state.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private int internalGetEra() {

    /**
     * Returns the ERA.  We need a special method for this because the
     * default ERA is CE, but a zero (unset) ERA is BCE.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private static int getRolledValue(int value, int amount, int min, int max) {

    /**
     * Returns the new value after 'roll'ing the specified value and amount.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private long getCurrentFixedDate() {

    /**
     * Returns the fixed date value of this object. The time value and
     * calendar fields must be in synch.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private void pinDayOfMonth() {

    /**
     * After adjustments such as add(MONTH), add(YEAR), we don't want the
     * month to jump around.  E.g., we don't want Jan 31 + 1 month to go to Mar
     * 3, we want it to go to Feb 28.  Adjustments which might run into this
     * problem call this method to retain the proper month.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private int yearLength() {

    /**
     * Returns the length (in days) of the year provided by
     * internalGet(YEAR).
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private int yearLength(int year) {

    /**
     * Returns the length (in days) of the specified year. The year
     * must be normalized.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private int monthLength(int month) {

    /**
     * Returns the length of the specified month in the year provided
     * by internalGet(YEAR).
     *
     * @see #isLeapYear(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private int monthLength(int month, int year) {

    /**
     * Returns the length of the specified month in the specified
     * year. The year number must be normalized.
     *
     * @see #isLeapYear(int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private BaseCalendar.Date getLastJulianDate() {

    /**
     * Returns the day before the Gregorian cutover date as a
     * BaseCalendar.Date. The date is a Julian date.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private BaseCalendar.Date getGregorianCutoverDate() {

    /**
     * Returns the Gregorian cutover date as a BaseCalendar.Date. The
     * date is a Gregorian date.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private BaseCalendar.Date getCalendarDate(long fd) {

    /**
     * Returns a CalendarDate produced from the specified fixed date.
     *
     * @param fd the fixed date
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private long getFixedDateMonth1(BaseCalendar.Date date, long fixedDate) {

    /**
     * Returns the fixed date of the first date of the month (usually
     * the 1st of the month) before the specified date.
     *
     * @param date the date for which the first day of the month is
     * calculated. The date has to be in the cut-over year (Gregorian
     * or Julian).
     * @param fixedDate the fixed date representation of the date
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private long getFixedDateJan1(BaseCalendar.Date date, long fixedDate) {

    /**
     * Returns the fixed date of the first day of the year (usually
     * January 1) before the specified date.
     *
     * @param date the date for which the first day of the year is
     * calculated. The date has to be in the cut-over year (Gregorian
     * or Julian).
     * @param fixedDate the fixed date representation of the date
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private boolean isCutoverYear(int normalizedYear) {

    /**
     * Determines if the specified year (normalized) is the Gregorian
     * cutover year. This object must have been normalized.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private BaseCalendar getCutoverCalendarSystem() {

    /**
     * Returns the calendar system for dates before the cutover date
     * in the cutover year. If the cutover date is January 1, the
     * method returns Gregorian. Otherwise, Julian.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private static synchronized BaseCalendar getJulianCalendarSystem() {

    /**
     * Returns the Julian calendar system instance (singleton). 'jcal'
     * and 'jeras' are set upon the return.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private GregorianCalendar getNormalizedCalendar() {

    /**
     * Returns this object if it's normalized (all fields and time are
     * in sync). Otherwise, a cloned object is returned after calling
     * complete() in lenient mode.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private long getFixedDate(BaseCalendar cal, int year, int fieldMask) {

    /**
     * Computes the fixed date under either the Gregorian or the
     * Julian calendar, using the given year and the specified calendar fields.
     *
     * @param cal the CalendarSystem to be used for the date calculation
     * @param year the normalized year number, with 0 indicating the
     * year 1 BCE, -1 indicating 2 BCE, etc.
     * @param fieldMask the calendar fields to be used for the date calculation
     * @return the fixed date
     * @see Calendar#selectFields
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Converts calendar field values to the time value (millisecond
     * offset from the <a href="Calendar.html#Epoch">Epoch</a>).
     *
     * @exception IllegalArgumentException if any calendar fields are invalid.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    /**

/////////////////////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
// Time => Fields computation

/////////////////////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns the number of weeks in the <a href="#week_year">week year</a>
     * represented by this {@code GregorianCalendar}.
     *
     * <p>For example, if this {@code GregorianCalendar}'s date is
     * December 31, 2008 with <a href="#iso8601_compatible_setting">the ISO
     * 8601 compatible setting</a>, this method will return 53 for the
     * period: December 29, 2008 to January 3, 2010 while {@link
     * #getActualMaximum(int) getActualMaximum(WEEK_OF_YEAR)} will return
     * 52 for the period: December 31, 2007 to December 28, 2008.
     *
     * @return the number of weeks in the week year.
     * @see Calendar#WEEK_OF_YEAR
     * @see #getWeekYear()
     * @see #getActualMaximum(int)
     * @since 1.7
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Sets this {@code GregorianCalendar} to the date given by the
     * date specifiers - <a href="#week_year">{@code weekYear}</a>,
     * {@code weekOfYear}, and {@code dayOfWeek}. {@code weekOfYear}
     * follows the <a href="#week_and_year">{@code WEEK_OF_YEAR}
     * numbering</a>.  The {@code dayOfWeek} value must be one of the
     * {@link Calendar#DAY_OF_WEEK DAY_OF_WEEK} values: {@link
     * Calendar#SUNDAY SUNDAY} to {@link Calendar#SATURDAY SATURDAY}.
     *
     * <p>Note that the numeric day-of-week representation differs from
     * the ISO 8601 standard, and that the {@code weekOfYear}
     * numbering is compatible with the standard when {@code
     * getFirstDayOfWeek()} is {@code MONDAY} and {@code
     * getMinimalDaysInFirstWeek()} is 4.
     *
     * <p>Unlike the {@code set} method, all of the calendar fields
     * and the instant of time value are calculated upon return.
     *
     * <p>If {@code weekOfYear} is out of the valid week-of-year
     * range in {@code weekYear}, the {@code weekYear}
     * and {@code weekOfYear} values are adjusted in lenient
     * mode, or an {@code IllegalArgumentException} is thrown in
     * non-lenient mode.
     *
     * @param weekYear    the week year
     * @param weekOfYear  the week number based on {@code weekYear}
     * @param dayOfWeek   the day of week value: one of the constants
     *                    for the {@link #DAY_OF_WEEK DAY_OF_WEEK} field:
     *                    {@link Calendar#SUNDAY SUNDAY}, ...,
     *                    {@link Calendar#SATURDAY SATURDAY}.
     * @exception IllegalArgumentException
     *            if any of the given date specifiers is invalid,
     *            or if any of the calendar fields are inconsistent
     *            with the given date specifiers in non-lenient mode
     * @see GregorianCalendar#isWeekDateSupported()
     * @see Calendar#getFirstDayOfWeek()
     * @see Calendar#getMinimalDaysInFirstWeek()
     * @since 1.7
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns the <a href="#week_year">week year</a> represented by this
     * {@code GregorianCalendar}. The dates in the weeks between 1 and the
     * maximum week number of the week year have the same week year value
     * that may be one year before or after the {@link Calendar#YEAR YEAR}
     * (calendar year) value.
     *
     * <p>This method calls {@link Calendar#complete()} before
     * calculating the week year.
     *
     * @return the week year represented by this {@code GregorianCalendar}.
     *         If the {@link Calendar#ERA ERA} value is {@link #BC}, the year is
     *         represented by 0 or a negative number: BC 1 is 0, BC 2
     *         is -1, BC 3 is -2, and so on.
     * @throws IllegalArgumentException
     *         if any of the calendar fields is invalid in non-lenient mode.
     * @see #isWeekDateSupported()
     * @see #getWeeksInWeekYear()
     * @see Calendar#getFirstDayOfWeek()
     * @see Calendar#getMinimalDaysInFirstWeek()
     * @since 1.7
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns {@code true} indicating this {@code GregorianCalendar}
     * supports week dates.
     *
     * @return {@code true} (always)
     * @see #getWeekYear()
     * @see #setWeekDate(int,int,int)
     * @see #getWeeksInWeekYear()
     * @since 1.7
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private long getYearOffsetInMillis() {

    /**
     * Returns the millisecond offset from the beginning of this
     * year. This Calendar object must have been normalized.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns the maximum value that this calendar field could have,
     * taking into consideration the given time value and the current
     * values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * {@link #getGregorianChange() getGregorianChange} and
     * {@link Calendar#getTimeZone() getTimeZone} methods.
     * For example, if the date of this instance is February 1, 2004,
     * the actual maximum value of the <code>DAY_OF_MONTH</code> field
     * is 29 because 2004 is a leap year, and if the date of this
     * instance is February 1, 2005, it's 28.
     *
     * <p>This method calculates the maximum value of {@link
     * Calendar#WEEK_OF_YEAR WEEK_OF_YEAR} based on the {@link
     * Calendar#YEAR YEAR} (calendar year) value, not the <a
     * href="#week_year">week year</a>. Call {@link
     * #getWeeksInWeekYear()} to get the maximum value of {@code
     * WEEK_OF_YEAR} in the week year of this {@code GregorianCalendar}.
     *
     * @param field the calendar field
     * @return the maximum of the given field for the time value of
     * this <code>GregorianCalendar</code>
     * @see #getMinimum(int)
     * @see #getMaximum(int)
     * @see #getGreatestMinimum(int)
     * @see #getLeastMaximum(int)
     * @see #getActualMinimum(int)
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns the minimum value that this calendar field could have,
     * taking into consideration the given time value and the current
     * values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * {@link #getGregorianChange() getGregorianChange} and
     * {@link Calendar#getTimeZone() getTimeZone} methods.
     *
     * <p>For example, if the Gregorian change date is January 10,
     * 1970 and the date of this <code>GregorianCalendar</code> is
     * January 20, 1970, the actual minimum value of the
     * <code>DAY_OF_MONTH</code> field is 10 because the previous date
     * of January 10, 1970 is December 27, 1996 (in the Julian
     * calendar). Therefore, December 28, 1969 to January 9, 1970
     * don't exist.
     *
     * @param field the calendar field
     * @return the minimum of the given field for the time value of
     * this <code>GregorianCalendar</code>
     * @see #getMinimum(int)
     * @see #getMaximum(int)
     * @see #getGreatestMinimum(int)
     * @see #getLeastMaximum(int)
     * @see #getActualMaximum(int)
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns the lowest maximum value for the given calendar field
     * of this <code>GregorianCalendar</code> instance. The lowest
     * maximum value is defined as the smallest value returned by
     * {@link #getActualMaximum(int)} for any possible time value,
     * taking into consideration the current values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * {@link #getGregorianChange() getGregorianChange} and
     * {@link Calendar#getTimeZone() getTimeZone} methods.
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns the highest minimum value for the given calendar field
     * of this <code>GregorianCalendar</code> instance. The highest
     * minimum value is defined as the largest value returned by
     * {@link #getActualMinimum(int)} for any possible time value,
     * taking into consideration the current values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * {@link #getGregorianChange() getGregorianChange} and
     * {@link Calendar#getTimeZone() getTimeZone} methods.
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns the maximum value for the given calendar field of this
     * <code>GregorianCalendar</code> instance. The maximum value is
     * defined as the largest value returned by the {@link
     * Calendar#get(int) get} method for any possible time value,
     * taking into consideration the current values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * {@link #getGregorianChange() getGregorianChange} and
     * {@link Calendar#getTimeZone() getTimeZone} methods.
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns the minimum value for the given calendar field of this
     * <code>GregorianCalendar</code> instance. The minimum value is
     * defined as the smallest value returned by the {@link
     * Calendar#get(int) get} method for any possible time value,
     * taking into consideration the current values of the
     * {@link Calendar#getFirstDayOfWeek() getFirstDayOfWeek},
     * {@link Calendar#getMinimalDaysInFirstWeek() getMinimalDaysInFirstWeek},
     * {@link #getGregorianChange() getGregorianChange} and
     * {@link Calendar#getTimeZone() getTimeZone} methods.
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
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

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
     * <p>
     * <em>Example</em>: Consider a <code>GregorianCalendar</code>
     * originally set to August 31, 1999. Calling <code>roll(Calendar.MONTH,
     * 8)</code> sets the calendar to April 30, <strong>1999</strong>. Using a
     * <code>GregorianCalendar</code>, the <code>DAY_OF_MONTH</code> field cannot
     * be 31 in the month April. <code>DAY_OF_MONTH</code> is set to the closest possible
     * value, 30. The <code>YEAR</code> field maintains the value of 1999 because it
     * is a larger field than <code>MONTH</code>.
     * <p>
     * <em>Example</em>: Consider a <code>GregorianCalendar</code>
     * originally set to Sunday June 6, 1999. Calling
     * <code>roll(Calendar.WEEK_OF_MONTH, -1)</code> sets the calendar to
     * Tuesday June 1, 1999, whereas calling
     * <code>add(Calendar.WEEK_OF_MONTH, -1)</code> sets the calendar to
     * Sunday May 30, 1999. This is because the roll rule imposes an
     * additional constraint: The <code>MONTH</code> must not change when the
     * <code>WEEK_OF_MONTH</code> is rolled. Taken together with add rule 1,
     * the resultant date must be between Tuesday June 1 and Saturday June
     * 5. According to add rule 2, the <code>DAY_OF_WEEK</code>, an invariant
     * when changing the <code>WEEK_OF_MONTH</code>, is set to Tuesday, the
     * closest possible value to Sunday (where Sunday is the first day of the
     * week).</p>
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
     * @since 1.2
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Adds or subtracts (up/down) a single unit of time on the given time
     * field without changing larger fields.
     * <p>
     * <em>Example</em>: Consider a <code>GregorianCalendar</code>
     * originally set to December 31, 1999. Calling {@link #roll(int,boolean) roll(Calendar.MONTH, true)}
     * sets the calendar to January 31, 1999.  The <code>YEAR</code> field is unchanged
     * because it is a larger field than <code>MONTH</code>.</p>
     *
     * @param up indicates if the value of the specified calendar field is to be
     * rolled up or rolled down. Use <code>true</code> if rolling up, <code>false</code> otherwise.
     * @exception IllegalArgumentException if <code>field</code> is
     * <code>ZONE_OFFSET</code>, <code>DST_OFFSET</code>, or unknown,
     * or if any calendar fields have out-of-range values in
     * non-lenient mode.
     * @see #add(int,int)
     * @see #set(int,int)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

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
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Generates the hash code for this <code>GregorianCalendar</code> object.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Compares this <code>GregorianCalendar</code> to the specified
     * <code>Object</code>. The result is <code>true</code> if and
     * only if the argument is a <code>GregorianCalendar</code> object
     * that represents the same time value (millisecond offset from
     * the <a href="Calendar.html#Epoch">Epoch</a>) under the same
     * <code>Calendar</code> parameters and Gregorian change date as
     * this object.
     *
     * @param obj the object to compare with.
     * @return <code>true</code> if this object is equal to <code>obj</code>;
     * <code>false</code> otherwise.
     * @see Calendar#compareTo(Calendar)
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    @Override

    /**
     * Returns {@code "gregory"} as the calendar type.
     *
     * @return {@code "gregory"}
     * @since 1.8
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public boolean isLeapYear(int year) {

    /**
     * Determines if the given year is a leap year. Returns <code>true</code> if
     * the given year is a leap year. To specify BC year numbers,
     * <code>1 - year number</code> must be given. For example, year BC 4 is
     * specified as -3.
     *
     * @param year the given year.
     * @return <code>true</code> if the given year is a leap year; <code>false</code> otherwise.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public final Date getGregorianChange() {

    /**
     * Gets the Gregorian Calendar change date.  This is the point when the
     * switch from Julian dates to Gregorian dates occurred. Default is
     * October 15, 1582 (Gregorian). Previous to this, dates will be in the Julian
     * calendar.
     *
     * @return the Gregorian cutover date for this <code>GregorianCalendar</code> object.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    /**

/////////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
// Public methods

/////////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    GregorianCalendar(TimeZone zone, Locale locale, boolean flag) {

    /**
     * Constructs an empty GregorianCalendar.
     *
     * @param zone    the given time zone
     * @param aLocale the given locale
     * @param flag    the flag requesting an empty instance
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    GregorianCalendar(int year, int month, int dayOfMonth,
                      int hourOfDay, int minute, int second, int millis) {

    /**
     * Constructs a <code>GregorianCalendar</code> with the given date
     * and time set for the default time zone with the default locale.
     *
     * @param year the value used to set the <code>YEAR</code> calendar field in the calendar.
     * @param month the value used to set the <code>MONTH</code> calendar field in the calendar.
     * Month value is 0-based. e.g., 0 for January.
     * @param dayOfMonth the value used to set the <code>DAY_OF_MONTH</code> calendar field in the calendar.
     * @param hourOfDay the value used to set the <code>HOUR_OF_DAY</code> calendar field
     * in the calendar.
     * @param minute the value used to set the <code>MINUTE</code> calendar field
     * in the calendar.
     * @param second the value used to set the <code>SECOND</code> calendar field
     * in the calendar.
     * @param millis the value used to set the <code>MILLISECOND</code> calendar field
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public GregorianCalendar(int year, int month, int dayOfMonth, int hourOfDay,
                             int minute, int second) {

    /**
     * Constructs a GregorianCalendar with the given date
     * and time set for the default time zone with the default locale.
     *
     * @param year the value used to set the <code>YEAR</code> calendar field in the calendar.
     * @param month the value used to set the <code>MONTH</code> calendar field in the calendar.
     * Month value is 0-based. e.g., 0 for January.
     * @param dayOfMonth the value used to set the <code>DAY_OF_MONTH</code> calendar field in the calendar.
     * @param hourOfDay the value used to set the <code>HOUR_OF_DAY</code> calendar field
     * in the calendar.
     * @param minute the value used to set the <code>MINUTE</code> calendar field
     * in the calendar.
     * @param second the value used to set the <code>SECOND</code> calendar field
     * in the calendar.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public GregorianCalendar(int year, int month, int dayOfMonth, int hourOfDay,
                             int minute) {

    /**
     * Constructs a <code>GregorianCalendar</code> with the given date
     * and time set for the default time zone with the default locale.
     *
     * @param year the value used to set the <code>YEAR</code> calendar field in the calendar.
     * @param month the value used to set the <code>MONTH</code> calendar field in the calendar.
     * Month value is 0-based. e.g., 0 for January.
     * @param dayOfMonth the value used to set the <code>DAY_OF_MONTH</code> calendar field in the calendar.
     * @param hourOfDay the value used to set the <code>HOUR_OF_DAY</code> calendar field
     * in the calendar.
     * @param minute the value used to set the <code>MINUTE</code> calendar field
     * in the calendar.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public GregorianCalendar(int year, int month, int dayOfMonth) {

    /**
     * Constructs a <code>GregorianCalendar</code> with the given date set
     * in the default time zone with the default locale.
     *
     * @param year the value used to set the <code>YEAR</code> calendar field in the calendar.
     * @param month the value used to set the <code>MONTH</code> calendar field in the calendar.
     * Month value is 0-based. e.g., 0 for January.
     * @param dayOfMonth the value used to set the <code>DAY_OF_MONTH</code> calendar field in the calendar.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public GregorianCalendar(TimeZone zone, Locale aLocale) {

    /**
     * Constructs a <code>GregorianCalendar</code> based on the current time
     * in the given time zone with the given locale.
     *
     * @param zone the given time zone.
     * @param aLocale the given locale.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public GregorianCalendar(Locale aLocale) {

    /**
     * Constructs a <code>GregorianCalendar</code> based on the current time
     * in the default time zone with the given locale.
     *
     * @param aLocale the given locale.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public GregorianCalendar(TimeZone zone) {

    /**
     * Constructs a <code>GregorianCalendar</code> based on the current time
     * in the given time zone with the default
     * {@link Locale.Category#FORMAT FORMAT} locale.
     *
     * @param zone the given time zone.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    /**

///////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
// Constructors

///////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private transient int[] originalFields;

    /**
     * Temporary storage for saving original fields[] values in
     * non-lenient mode.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private transient int[] zoneOffsets;

    /**
     * Temporary int[2] to get time zone offsets. zoneOffsets[0] gets
     * the GMT offset value and zoneOffsets[1] gets the DST saving
     * value.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private transient BaseCalendar calsys;

    /**
     * The CalendarSystem used to calculate the date in cdate. After
     * calling complete(), this value is guaranteed to be set and
     * consistent with the cdate value.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private transient BaseCalendar.Date cdate;

    /**
     * Reference to either gdate or a JulianCalendar.Date
     * instance. After calling complete(), this value is guaranteed to
     * be set.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private transient BaseCalendar.Date gdate;

    /**
     * gdate always has a sun.util.calendar.Gregorian.Date instance to
     * avoid overhead of creating it. The assumption is that most
     * applications will need only Gregorian calendar calculations.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private transient int gregorianCutoverYearJulian = 1582;

    /**
     * The normalized year of the gregorianCutover in Julian, with 0
     * representing 1 BCE, -1 representing 2 BCE, etc.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private transient int gregorianCutoverYear = 1582;

    /**
     * The normalized year of the gregorianCutover in Gregorian, with
     * 0 representing 1 BCE, -1 representing 2 BCE, etc.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    private transient long gregorianCutoverDate =

    /**
     * The fixed date of the gregorianCutover.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    /**

/////////////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
// Instance Variables

/////////////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    static final int CE = 1;

    /**
     * Value of the {@link #ERA} field indicating
     * the common era, the same value as {@link #AD}.
     *
     * @see #BCE
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    public static final int AD = 1;

    /**
     * Value of the <code>ERA</code> field indicating
     * the common era (Anno Domini), also known as CE.
     * The sequence of years at the transition from <code>BC</code> to <code>AD</code> is
     * ..., 2 BC, 1 BC, 1 AD, 2 AD,...
     *
     * @see #ERA
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    static final int BCE = 0;

    /**
     * Value of the {@link #ERA} field indicating
     * the period before the common era, the same value as {@link #BC}.
     *
     * @see #CE
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
    /**

//////////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
// Class Variables

//////////////////
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//GregorianCalendar.java
public class GregorianCalendar extends Calendar {

/**
 * <code>GregorianCalendar</code> is a concrete subclass of
 * <code>Calendar</code> and provides the standard calendar system
 * used by most of the world.
 *
 * <p> <code>GregorianCalendar</code> is a hybrid calendar that
 * supports both the Julian and Gregorian calendar systems with the
 * support of a single discontinuity, which corresponds by default to
 * the Gregorian date when the Gregorian calendar was instituted
 * (October 15, 1582 in some countries, later in others).  The cutover
 * date may be changed by the caller by calling {@link
 * #setGregorianChange(Date) setGregorianChange()}.
 *
 * <p>
 * Historically, in those countries which adopted the Gregorian calendar first,
 * October 4, 1582 (Julian) was thus followed by October 15, 1582 (Gregorian). This calendar models
 * this correctly.  Before the Gregorian cutover, <code>GregorianCalendar</code>
 * implements the Julian calendar.  The only difference between the Gregorian
 * and the Julian calendar is the leap year rule. The Julian calendar specifies
 * leap years every four years, whereas the Gregorian calendar omits century
 * years which are not divisible by 400.
 *
 * <p>
 * <code>GregorianCalendar</code> implements <em>proleptic</em> Gregorian and
 * Julian calendars. That is, dates are computed by extrapolating the current
 * rules indefinitely far backward and forward in time. As a result,
 * <code>GregorianCalendar</code> may be used for all years to generate
 * meaningful and consistent results. However, dates obtained using
 * <code>GregorianCalendar</code> are historically accurate only from March 1, 4
 * AD onward, when modern Julian calendar rules were adopted.  Before this date,
 * leap year rules were applied irregularly, and before 45 BC the Julian
 * calendar did not even exist.
 *
 * <p>
 * Prior to the institution of the Gregorian calendar, New Year's Day was
 * March 25. To avoid confusion, this calendar always uses January 1. A manual
 * adjustment may be made if desired for dates that are prior to the Gregorian
 * changeover and which fall between January 1 and March 24.
 *
 * <h3><a name="week_and_year">Week Of Year and Week Year</a></h3>
 *
 * <p>Values calculated for the {@link Calendar#WEEK_OF_YEAR
 * WEEK_OF_YEAR} field range from 1 to 53. The first week of a
 * calendar year is the earliest seven day period starting on {@link
 * Calendar#getFirstDayOfWeek() getFirstDayOfWeek()} that contains at
 * least {@link Calendar#getMinimalDaysInFirstWeek()
 * getMinimalDaysInFirstWeek()} days from that year. It thus depends
 * on the values of {@code getMinimalDaysInFirstWeek()}, {@code
 * getFirstDayOfWeek()}, and the day of the week of January 1. Weeks
 * between week 1 of one year and week 1 of the following year
 * (exclusive) are numbered sequentially from 2 to 52 or 53 (except
 * for year(s) involved in the Julian-Gregorian transition).
 *
 * <p>The {@code getFirstDayOfWeek()} and {@code
 * getMinimalDaysInFirstWeek()} values are initialized using
 * locale-dependent resources when constructing a {@code
 * GregorianCalendar}. <a name="iso8601_compatible_setting">The week
 * determination is compatible</a> with the ISO 8601 standard when {@code
 * getFirstDayOfWeek()} is {@code MONDAY} and {@code
 * getMinimalDaysInFirstWeek()} is 4, which values are used in locales
 * where the standard is preferred. These values can explicitly be set by
 * calling {@link Calendar#setFirstDayOfWeek(int) setFirstDayOfWeek()} and
 * {@link Calendar#setMinimalDaysInFirstWeek(int)
 * setMinimalDaysInFirstWeek()}.
 *
 * <p>A <a name="week_year"><em>week year</em></a> is in sync with a
 * {@code WEEK_OF_YEAR} cycle. All weeks between the first and last
 * weeks (inclusive) have the same <em>week year</em> value.
 * Therefore, the first and last days of a week year may have
 * different calendar year values.
 *
 * <p>For example, January 1, 1998 is a Thursday. If {@code
 * getFirstDayOfWeek()} is {@code MONDAY} and {@code
 * getMinimalDaysInFirstWeek()} is 4 (ISO 8601 standard compatible
 * setting), then week 1 of 1998 starts on December 29, 1997, and ends
 * on January 4, 1998. The week year is 1998 for the last three days
 * of calendar year 1997. If, however, {@code getFirstDayOfWeek()} is
 * {@code SUNDAY}, then week 1 of 1998 starts on January 4, 1998, and
 * ends on January 10, 1998; the first three days of 1998 then are
 * part of week 53 of 1997 and their week year is 1997.
 *
 * <h4>Week Of Month</h4>
 *
 * <p>Values calculated for the <code>WEEK_OF_MONTH</code> field range from 0
 * to 6.  Week 1 of a month (the days with <code>WEEK_OF_MONTH =
 * 1</code>) is the earliest set of at least
 * <code>getMinimalDaysInFirstWeek()</code> contiguous days in that month,
 * ending on the day before <code>getFirstDayOfWeek()</code>.  Unlike
 * week 1 of a year, week 1 of a month may be shorter than 7 days, need
 * not start on <code>getFirstDayOfWeek()</code>, and will not include days of
 * the previous month.  Days of a month before week 1 have a
 * <code>WEEK_OF_MONTH</code> of 0.
 *
 * <p>For example, if <code>getFirstDayOfWeek()</code> is <code>SUNDAY</code>
 * and <code>getMinimalDaysInFirstWeek()</code> is 4, then the first week of
 * January 1998 is Sunday, January 4 through Saturday, January 10.  These days
 * have a <code>WEEK_OF_MONTH</code> of 1.  Thursday, January 1 through
 * Saturday, January 3 have a <code>WEEK_OF_MONTH</code> of 0.  If
 * <code>getMinimalDaysInFirstWeek()</code> is changed to 3, then January 1
 * through January 3 have a <code>WEEK_OF_MONTH</code> of 1.
 *
 * <h4>Default Fields Values</h4>
 *
 * <p>The <code>clear</code> method sets calendar field(s)
 * undefined. <code>GregorianCalendar</code> uses the following
 * default value for each calendar field if its value is undefined.
 *
 * <table cellpadding="0" cellspacing="3" border="0"
 *        summary="GregorianCalendar default field values"
 *        style="text-align: left; width: 66%;">
 *   <tbody>
 *     <tr>
 *       <th style="vertical-align: top; background-color: rgb(204, 204, 255);
 *           text-align: center;">Field<br>
 *       </th>
 *       <th style="vertical-align: top; background-color: rgb(204, 204, 255);
 *           text-align: center;">Default Value<br>
 *       </th>
 *     </tr>
 *     <tr>
 *       <td style="vertical-align: middle;">
 *              <code>ERA<br></code>
 *       </td>
 *       <td style="vertical-align: middle;">
 *              <code>AD<br></code>
 *       </td>
 *     </tr>
 *     <tr>
 *       <td style="vertical-align: middle; background-color: rgb(238, 238, 255);">
 *              <code>YEAR<br></code>
 *       </td>
 *       <td style="vertical-align: middle; background-color: rgb(238, 238, 255);">
 *              <code>1970<br></code>
 *       </td>
 *     </tr>
 *     <tr>
 *       <td style="vertical-align: middle;">
 *              <code>MONTH<br></code>
 *       </td>
 *       <td style="vertical-align: middle;">
 *              <code>JANUARY<br></code>
 *       </td>
 *     </tr>
 *     <tr>
 *       <td style="vertical-align: top; background-color: rgb(238, 238, 255);">
 *              <code>DAY_OF_MONTH<br></code>
 *       </td>
 *       <td style="vertical-align: top; background-color: rgb(238, 238, 255);">
 *              <code>1<br></code>
 *       </td>
 *     </tr>
 *     <tr>
 *       <td style="vertical-align: middle;">
 *              <code>DAY_OF_WEEK<br></code>
 *       </td>
 *       <td style="vertical-align: middle;">
 *              <code>the first day of week<br></code>
 *       </td>
 *     </tr>
 *     <tr>
 *       <td style="vertical-align: top; background-color: rgb(238, 238, 255);">
 *              <code>WEEK_OF_MONTH<br></code>
 *       </td>
 *       <td style="vertical-align: top; background-color: rgb(238, 238, 255);">
 *              <code>0<br></code>
 *       </td>
 *     </tr>
 *     <tr>
 *       <td style="vertical-align: top;">
 *              <code>DAY_OF_WEEK_IN_MONTH<br></code>
 *       </td>
 *       <td style="vertical-align: top;">
 *              <code>1<br></code>
 *       </td>
 *     </tr>
 *     <tr>
 *       <td style="vertical-align: middle; background-color: rgb(238, 238, 255);">
 *              <code>AM_PM<br></code>
 *       </td>
 *       <td style="vertical-align: middle; background-color: rgb(238, 238, 255);">
 *              <code>AM<br></code>
 *       </td>
 *     </tr>
 *     <tr>
 *       <td style="vertical-align: middle;">
 *              <code>HOUR, HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND<br></code>
 *       </td>
 *       <td style="vertical-align: middle;">
 *              <code>0<br></code>
 *       </td>
 *     </tr>
 *   </tbody>
 * </table>
 * <br>Default values are not applicable for the fields not listed above.
 *
 * <p>
 * <strong>Example:</strong>
 * <blockquote>
 * <pre>
 * // get the supported ids for GMT-08:00 (Pacific Standard Time)
 * String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
 * // if no ids were returned, something is wrong. get out.
 * if (ids.length == 0)
 *     System.exit(0);
 *
 *  // begin output
 * System.out.println("Current Time");
 *
 * // create a Pacific Standard Time time zone
 * SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
 *
 * // set up rules for Daylight Saving Time
 * pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
 * pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
 *
 * // create a GregorianCalendar with the Pacific Daylight time zone
 * // and the current date and time
 * Calendar calendar = new GregorianCalendar(pdt);
 * Date trialTime = new Date();
 * calendar.setTime(trialTime);
 *
 * // print out a bunch of interesting things
 * System.out.println("ERA: " + calendar.get(Calendar.ERA));
 * System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
 * System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
 * System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
 * System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
 * System.out.println("DATE: " + calendar.get(Calendar.DATE));
 * System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
 * System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
 * System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
 * System.out.println("DAY_OF_WEEK_IN_MONTH: "
 *                    + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
 * System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
 * System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
 * System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
 * System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
 * System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
 * System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
 * System.out.println("ZONE_OFFSET: "
 *                    + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
 * System.out.println("DST_OFFSET: "
 *                    + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));

 * System.out.println("Current Time, with hour reset to 3");
 * calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
 * calendar.set(Calendar.HOUR, 3);
 * System.out.println("ERA: " + calendar.get(Calendar.ERA));
 * System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
 * System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
 * System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
 * System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
 * System.out.println("DATE: " + calendar.get(Calendar.DATE));
 * System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
 * System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
 * System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
 * System.out.println("DAY_OF_WEEK_IN_MONTH: "
 *                    + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
 * System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
 * System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
 * System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
 * System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
 * System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
 * System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
 * System.out.println("ZONE_OFFSET: "
 *        + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // in hours
 * System.out.println("DST_OFFSET: "
 *        + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000))); // in hours
 * </pre>
 * </blockquote>
 *
 * @see          TimeZone
 * @author David Goldsmith, Mark Davis, Chen-Lieh Huang, Alan Liu
 * @since JDK1.1
 */
