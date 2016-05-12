_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final Instant toInstant() {

    /**
     * Converts this object to an {@link Instant}.
     * <p>
     * The conversion creates an {@code Instant} that represents the
     * same point on the time-line as this {@code Calendar}.
     *
     * @return the instant representing the same point on the time-line
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private void readObject(ObjectInputStream stream)

    /**
     * Reconstitutes this object from a stream (i.e., deserialize it).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private synchronized void writeObject(ObjectOutputStream stream)

    /**
     * Save the state of this object to a stream (i.e., serialize it).
     *
     * Ideally, <code>Calendar</code> would only write out its state data and
     * the current time, and not write any field data out, such as
     * <code>fields[]</code>, <code>isTimeSet</code>, <code>areFieldsSet</code>,
     * and <code>isSet[]</code>.  <code>nextStamp</code> also should not be part
     * of the persistent state. Unfortunately, this didn't happen before JDK 1.1
     * shipped. To be compatible with JDK 1.1, we will always have to write out
     * the field values and state flags.  However, <code>nextStamp</code> can be
     * removed from the serialization stream; this will probably happen in the
     * near future.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private void invalidateWeekFields()

    /**
     * Sets the WEEK_OF_MONTH and WEEK_OF_YEAR fields to new values with the
     * new parameter value if they have been calculated internally.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private void adjustStamp() {

    /**
     * Adjusts the stamp[] values before nextStamp overflow. nextStamp
     * is set to the next stamp value upon the return.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private void updateTime() {

    /**
     * Recomputes the time and updates the status fields isTimeSet
     * and areFieldsSet.  Callers should check isTimeSet and only
     * call this method if isTimeSet is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private void setWeekCountData(Locale desiredLocale)

    /**
     * Both firstDayOfWeek and minimalDaysInFirstWeek are locale-dependent.
     * They are used to figure out the week count for a specific date for
     * a given locale. These must be set when a Calendar is constructed.
     * @param desiredLocale the given locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @Override

    /**
     * Return a string representation of this calendar. This method
     * is intended to be used only for debugging purposes, and the
     * format of the returned string may vary between implementations.
     * The returned string may be empty but may not be <code>null</code>.
     *
     * @return  a string representation of this calendar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    static String getFieldName(int field) {

    /**
     * Returns the name of the specified calendar field.
     *
     * @param field the calendar field
     * @return the calendar field name
     * @exception IndexOutOfBoundsException if <code>field</code> is negative,
     * equal to or greater then <code>FIELD_COUNT</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @Override

    /**
     * Creates and returns a copy of this object.
     *
     * @return a copy of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public int getActualMaximum(int field) {

    /**
     * Returns the maximum value that the specified calendar field
     * could have, given the time value of this
     * <code>Calendar</code>. For example, the actual maximum value of
     * the <code>MONTH</code> field is 12 in some years, and 13 in
     * other years in the Hebrew calendar system.
     *
     * <p>The default implementation of this method uses an iterative
     * algorithm to determine the actual maximum value for the
     * calendar field. Subclasses should, if possible, override this
     * with a more efficient implementation.
     *
     * @param field the calendar field
     * @return the maximum of the given calendar field for the time
     * value of this <code>Calendar</code>
     * @see #getMinimum(int)
     * @see #getMaximum(int)
     * @see #getGreatestMinimum(int)
     * @see #getLeastMaximum(int)
     * @see #getActualMinimum(int)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public int getActualMinimum(int field) {

    /**
     * Returns the minimum value that the specified calendar field
     * could have, given the time value of this <code>Calendar</code>.
     *
     * <p>The default implementation of this method uses an iterative
     * algorithm to determine the actual minimum value for the
     * calendar field. Subclasses should, if possible, override this
     * with a more efficient implementation - in many cases, they can
     * simply return <code>getMinimum()</code>.
     *
     * @param field the calendar field
     * @return the minimum of the given calendar field for the time
     * value of this <code>Calendar</code>
     * @see #getMinimum(int)
     * @see #getMaximum(int)
     * @see #getGreatestMinimum(int)
     * @see #getLeastMaximum(int)
     * @see #getActualMaximum(int)
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    abstract public int getLeastMaximum(int field);

    /**
     * Returns the lowest maximum value for the given calendar field
     * of this <code>Calendar</code> instance. The lowest maximum
     * value is defined as the smallest value returned by {@link
     * #getActualMaximum(int)} for any possible time value. The least
     * maximum value depends on calendar system specific parameters of
     * the instance. For example, a <code>Calendar</code> for the
     * Gregorian calendar system returns 28 for the
     * <code>DAY_OF_MONTH</code> field, because the 28th is the last
     * day of the shortest month of this calendar, February in a
     * common year.
     *
     * @param field the calendar field.
     * @return the lowest maximum value for the given calendar field.
     * @see #getMinimum(int)
     * @see #getMaximum(int)
     * @see #getGreatestMinimum(int)
     * @see #getActualMinimum(int)
     * @see #getActualMaximum(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    abstract public int getGreatestMinimum(int field);

    /**
     * Returns the highest minimum value for the given calendar field
     * of this <code>Calendar</code> instance. The highest minimum
     * value is defined as the largest value returned by {@link
     * #getActualMinimum(int)} for any possible time value. The
     * greatest minimum value depends on calendar system specific
     * parameters of the instance.
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    abstract public int getMaximum(int field);

    /**
     * Returns the maximum value for the given calendar field of this
     * <code>Calendar</code> instance. The maximum value is defined as
     * the largest value returned by the {@link #get(int) get} method
     * for any possible time value. The maximum value depends on
     * calendar system specific parameters of the instance.
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    abstract public int getMinimum(int field);

    /**
     * Returns the minimum value for the given calendar field of this
     * <code>Calendar</code> instance. The minimum value is defined as
     * the smallest value returned by the {@link #get(int) get} method
     * for any possible time value.  The minimum value depends on
     * calendar system specific parameters of the instance.
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public int getWeeksInWeekYear() {

    /**
     * Returns the number of weeks in the week year represented by this
     * {@code Calendar}.
     *
     * <p>The default implementation of this method throws an
     * {@code UnsupportedOperationException}.
     *
     * @return the number of weeks in the week year.
     * @exception UnsupportedOperationException
     *            if any week year numbering isn't supported in this
     *            {@code Calendar}.
     * @see #WEEK_OF_YEAR
     * @see #isWeekDateSupported()
     * @see #getWeekYear()
     * @see #getActualMaximum(int)
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public void setWeekDate(int weekYear, int weekOfYear, int dayOfWeek) {

    /**
     * Sets the date of this {@code Calendar} with the the given date
     * specifiers - week year, week of year, and day of week.
     *
     * <p>Unlike the {@code set} method, all of the calendar fields
     * and {@code time} values are calculated upon return.
     *
     * <p>If {@code weekOfYear} is out of the valid week-of-year range
     * in {@code weekYear}, the {@code weekYear} and {@code
     * weekOfYear} values are adjusted in lenient mode, or an {@code
     * IllegalArgumentException} is thrown in non-lenient mode.
     *
     * <p>The default implementation of this method throws an
     * {@code UnsupportedOperationException}.
     *
     * @param weekYear   the week year
     * @param weekOfYear the week number based on {@code weekYear}
     * @param dayOfWeek  the day of week value: one of the constants
     *                   for the {@link #DAY_OF_WEEK} field: {@link
     *                   #SUNDAY}, ..., {@link #SATURDAY}.
     * @exception IllegalArgumentException
     *            if any of the given date specifiers is invalid
     *            or any of the calendar fields are inconsistent
     *            with the given date specifiers in non-lenient mode
     * @exception UnsupportedOperationException
     *            if any week year numbering isn't supported in this
     *            {@code Calendar}.
     * @see #isWeekDateSupported()
     * @see #getFirstDayOfWeek()
     * @see #getMinimalDaysInFirstWeek()
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public int getWeekYear() {

    /**
     * Returns the week year represented by this {@code Calendar}. The
     * week year is in sync with the week cycle. The {@linkplain
     * #getFirstDayOfWeek() first day of the first week} is the first
     * day of the week year.
     *
     * <p>The default implementation of this method throws an
     * {@link UnsupportedOperationException}.
     *
     * @return the week year of this {@code Calendar}
     * @exception UnsupportedOperationException
     *            if any week year numbering isn't supported
     *            in this {@code Calendar}.
     * @see #isWeekDateSupported()
     * @see #getFirstDayOfWeek()
     * @see #getMinimalDaysInFirstWeek()
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public boolean isWeekDateSupported() {

    /**
     * Returns whether this {@code Calendar} supports week dates.
     *
     * <p>The default implementation of this method returns {@code false}.
     *
     * @return {@code true} if this {@code Calendar} supports week dates;
     *         {@code false} otherwise.
     * @see #getWeekYear()
     * @see #setWeekDate(int,int,int)
     * @see #getWeeksInWeekYear()
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public int getMinimalDaysInFirstWeek()

    /**
     * Gets what the minimal days required in the first week of the year are;
     * e.g., if the first week is defined as one that contains the first day
     * of the first month of a year, this method returns 1. If
     * the minimal days required must be a full week, this method
     * returns 7.
     *
     * @return the minimal days required in the first week of the year.
     * @see #setMinimalDaysInFirstWeek(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public void setMinimalDaysInFirstWeek(int value)

    /**
     * Sets what the minimal days required in the first week of the year are;
     * For example, if the first week is defined as one that contains the first
     * day of the first month of a year, call this method with value 1. If it
     * must be a full week, use value 7.
     *
     * @param value the given minimal days required in the first week
     * of the year.
     * @see #getMinimalDaysInFirstWeek()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public int getFirstDayOfWeek()

    /**
     * Gets what the first day of the week is; e.g., <code>SUNDAY</code> in the U.S.,
     * <code>MONDAY</code> in France.
     *
     * @return the first day of the week.
     * @see #setFirstDayOfWeek(int)
     * @see #getMinimalDaysInFirstWeek()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public void setFirstDayOfWeek(int value)

    /**
     * Sets what the first day of the week is; e.g., <code>SUNDAY</code> in the U.S.,
     * <code>MONDAY</code> in France.
     *
     * @param value the given first day of the week.
     * @see #getFirstDayOfWeek()
     * @see #getMinimalDaysInFirstWeek()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public boolean isLenient()

    /**
     * Tells whether date/time interpretation is to be lenient.
     *
     * @return <code>true</code> if the interpretation mode of this calendar is lenient;
     * <code>false</code> otherwise.
     * @see #setLenient(boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public void setLenient(boolean lenient)

    /**
     * Specifies whether or not date/time interpretation is to be lenient.  With
     * lenient interpretation, a date such as "February 942, 1996" will be
     * treated as being equivalent to the 941st day after February 1, 1996.
     * With strict (non-lenient) interpretation, such dates will cause an exception to be
     * thrown. The default is lenient.
     *
     * @param lenient <code>true</code> if the lenient mode is to be turned
     * on; <code>false</code> if it is to be turned off.
     * @see #isLenient()
     * @see java.text.DateFormat#setLenient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    void setZoneShared(boolean shared) {

    /**
     * Sets the sharedZone flag to <code>shared</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    TimeZone getZone() {

    /**
     * Returns the time zone (without cloning).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public TimeZone getTimeZone()

    /**
     * Gets the time zone.
     *
     * @return the time zone object associated with this calendar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public void setTimeZone(TimeZone value)

    /**
     * Sets the time zone with the given time zone value.
     *
     * @param value the given time zone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public void roll(int field, int amount)

    /**
     * Adds the specified (signed) amount to the specified calendar field
     * without changing larger fields.  A negative amount means to roll
     * down.
     *
     * <p>NOTE:  This default implementation on <code>Calendar</code> just repeatedly calls the
     * version of {@link #roll(int,boolean) roll()} that rolls by one unit.  This may not
     * always do the right thing.  For example, if the <code>DAY_OF_MONTH</code> field is 31,
     * rolling through February will leave it set to 28.  The <code>GregorianCalendar</code>
     * version of this function takes care of this problem.  Other subclasses
     * should also provide overrides of this function that do the right thing.
     *
     * @param field the calendar field.
     * @param amount the signed amount to add to the calendar <code>field</code>.
     * @since 1.2
     * @see #roll(int,boolean)
     * @see #add(int,int)
     * @see #set(int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    abstract public void roll(int field, boolean up);

    /**
     * Adds or subtracts (up/down) a single unit of time on the given time
     * field without changing larger fields. For example, to roll the current
     * date up by one day, you can achieve it by calling:
     * <p>roll(Calendar.DATE, true).
     * When rolling on the year or Calendar.YEAR field, it will roll the year
     * value in the range between 1 and the value returned by calling
     * <code>getMaximum(Calendar.YEAR)</code>.
     * When rolling on the month or Calendar.MONTH field, other fields like
     * date might conflict and, need to be changed. For instance,
     * rolling the month on the date 01/31/96 will result in 02/29/96.
     * When rolling on the hour-in-day or Calendar.HOUR_OF_DAY field, it will
     * roll the hour value in the range between 0 and 23, which is zero-based.
     *
     * @param field the time field.
     * @param up indicates if the value of the specified time field is to be
     * rolled up or rolled down. Use true if rolling up, false otherwise.
     * @see Calendar#add(int,int)
     * @see Calendar#set(int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    abstract public void add(int field, int amount);

    /**
     * Adds or subtracts the specified amount of time to the given calendar field,
     * based on the calendar's rules. For example, to subtract 5 days from
     * the current time of the calendar, you can achieve it by calling:
     * <p><code>add(Calendar.DAY_OF_MONTH, -5)</code>.
     *
     * @param field the calendar field.
     * @param amount the amount of date or time to be added to the field.
     * @see #roll(int,int)
     * @see #set(int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @Override

    /**
     * Compares the time values (millisecond offsets from the <a
     * href="#Epoch">Epoch</a>) represented by two
     * <code>Calendar</code> objects.
     *
     * @param anotherCalendar the <code>Calendar</code> to be compared.
     * @return the value <code>0</code> if the time represented by the argument
     * is equal to the time represented by this <code>Calendar</code>; a value
     * less than <code>0</code> if the time of this <code>Calendar</code> is
     * before the time represented by the argument; and a value greater than
     * <code>0</code> if the time of this <code>Calendar</code> is after the
     * time represented by the argument.
     * @exception NullPointerException if the specified <code>Calendar</code> is
     *            <code>null</code>.
     * @exception IllegalArgumentException if the time value of the
     * specified <code>Calendar</code> object can't be obtained due to
     * any invalid calendar values.
     * @since   1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public boolean after(Object when) {

    /**
     * Returns whether this <code>Calendar</code> represents a time
     * after the time represented by the specified
     * <code>Object</code>. This method is equivalent to:
     * <pre>{@code
     *         compareTo(when) > 0
     * }</pre>
     * if and only if <code>when</code> is a <code>Calendar</code>
     * instance. Otherwise, the method returns <code>false</code>.
     *
     * @param when the <code>Object</code> to be compared
     * @return <code>true</code> if the time of this <code>Calendar</code> is
     * after the time represented by <code>when</code>; <code>false</code>
     * otherwise.
     * @see     #compareTo(Calendar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public boolean before(Object when) {

    /**
     * Returns whether this <code>Calendar</code> represents a time
     * before the time represented by the specified
     * <code>Object</code>. This method is equivalent to:
     * <pre>{@code
     *         compareTo(when) < 0
     * }</pre>
     * if and only if <code>when</code> is a <code>Calendar</code>
     * instance. Otherwise, the method returns <code>false</code>.
     *
     * @param when the <code>Object</code> to be compared
     * @return <code>true</code> if the time of this
     * <code>Calendar</code> is before the time represented by
     * <code>when</code>; <code>false</code> otherwise.
     * @see     #compareTo(Calendar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @Override

    /**
     * Returns a hash code for this calendar.
     *
     * @return a hash code value for this object.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")

    /**
     * Compares this <code>Calendar</code> to the specified
     * <code>Object</code>.  The result is <code>true</code> if and only if
     * the argument is a <code>Calendar</code> object of the same calendar
     * system that represents the same time value (millisecond offset from the
     * <a href="#Epoch">Epoch</a>) under the same
     * <code>Calendar</code> parameters as this object.
     *
     * <p>The <code>Calendar</code> parameters are the values represented
     * by the <code>isLenient</code>, <code>getFirstDayOfWeek</code>,
     * <code>getMinimalDaysInFirstWeek</code> and <code>getTimeZone</code>
     * methods. If there is any difference in those parameters
     * between the two <code>Calendar</code>s, this method returns
     * <code>false</code>.
     *
     * <p>Use the {@link #compareTo(Calendar) compareTo} method to
     * compare only the time values.
     *
     * @param obj the object to compare with.
     * @return <code>true</code> if this object is equal to <code>obj</code>;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public String getCalendarType() {

    /**
     * Returns the calendar type of this {@code Calendar}. Calendar types are
     * defined by the <em>Unicode Locale Data Markup Language (LDML)</em>
     * specification.
     *
     * <p>The default implementation of this method returns the class name of
     * this {@code Calendar} instance. Any subclasses that implement
     * LDML-defined calendar systems should override this method to return
     * appropriate calendar types.
     *
     * @return the LDML-defined calendar type or the class name of this
     *         {@code Calendar} instance
     * @since 1.8
     * @see <a href="Locale.html#def_extensions">Locale extensions</a>
     * @see Locale.Builder#setLocale(Locale)
     * @see Locale.Builder#setUnicodeLocaleKeyword(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static Set<String> getAvailableCalendarTypes() {

    /**
     * Returns an unmodifiable {@code Set} containing all calendar types
     * supported by {@code Calendar} in the runtime environment. The available
     * calendar types can be used for the <a
     * href="Locale.html#def_locale_extension">Unicode locale extensions</a>.
     * The {@code Set} returned contains at least {@code "gregory"}. The
     * calendar types don't include aliases, such as {@code "gregorian"} for
     * {@code "gregory"}.
     *
     * @return an unmodifiable {@code Set} containing all available calendar types
     * @since 1.8
     * @see #getCalendarType()
     * @see Calendar.Builder#setCalendarType(String)
     * @see Locale#getUnicodeLocaleType(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private static int aggregateStamp(int stamp_a, int stamp_b) {

    /**
     * Returns the pseudo-time-stamp for two fields, given their
     * individual pseudo-time-stamps.  If either of the fields
     * is unset, then the aggregate is unset.  Otherwise, the
     * aggregate is the later of the two stamps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    final int selectFields() {

    /**
     * Returns a field mask indicating which calendar field values
     * to be used to calculate the time value. The calendar fields are
     * returned as a bit mask, each bit of which corresponds to a field, i.e.,
     * the mask value of <code>field</code> is <code>(1 &lt;&lt;
     * field)</code>. For example, 0x26 represents the <code>YEAR</code>,
     * <code>MONTH</code>, and <code>DAY_OF_MONTH</code> fields (i.e., 0x26 is
     * equal to
     * <code>(1&lt;&lt;YEAR)|(1&lt;&lt;MONTH)|(1&lt;&lt;DAY_OF_MONTH))</code>.
     *
     * <p>This method supports the calendar fields resolution as described in
     * the class description. If the bit mask for a given field is on and its
     * field has not been set (i.e., <code>isSet(field)</code> is
     * <code>false</code>), then the default value of the field has to be
     * used, which case means that the field has been selected because the
     * selected combination involves the field.
     *
     * @return a bit mask of selected fields
     * @see #isExternallySet(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    static boolean isFieldSet(int fieldMask, int field) {

    /**
     * Returns whether the specified <code>field</code> is on in the
     * <code>fieldMask</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    final void setUnnormalized() {

    /**
     * Marks this Calendar as not sync'd.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    final boolean isFullyNormalized() {

    /**
     * Returns whether the calendar fields are fully in sync with the time
     * value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    final boolean isPartiallyNormalized() {

    /**
     * Returns whether the calendar fields are partially in sync with the time
     * value or fully in sync but not stamp values are not normalized yet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    final void setFieldsNormalized(int fieldMask) {

    /**
     * Sets the state of the calendar fields that are <em>not</em> specified
     * by <code>fieldMask</code> to <em>unset</em>. If <code>fieldMask</code>
     * specifies all the calendar fields, then the state of this
     * <code>Calendar</code> becomes that all the calendar fields are in sync
     * with the time value (millisecond offset from the Epoch).
     *
     * @param fieldMask the field mask indicating which calendar fields are in
     * sync with the time value.
     * @exception IndexOutOfBoundsException if the specified
     *                <code>field</code> is out of range
     *               (<code>field &lt; 0 || field &gt;= FIELD_COUNT</code>).
     * @see #isExternallySet(int)
     * @see #selectFields()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    final void setFieldsComputed(int fieldMask) {

    /**
     * Sets the state of the specified calendar fields to
     * <em>computed</em>. This state means that the specified calendar fields
     * have valid values that have been set by internal time calculation
     * rather than by calling one of the setter methods.
     *
     * @param fieldMask the field to be marked as computed.
     * @exception IndexOutOfBoundsException if the specified
     *                <code>field</code> is out of range
     *               (<code>field &lt; 0 || field &gt;= FIELD_COUNT</code>).
     * @see #isExternallySet(int)
     * @see #selectFields()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    final int getSetStateFields() {

    /**
     * Returns a field mask (bit mask) indicating all calendar fields that
     * have the state of externally or internally set.
     *
     * @return a bit mask indicating set state fields
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    final boolean isExternallySet(int field) {

    /**
     * Returns whether the value of the specified calendar field has been set
     * externally by calling one of the setter methods rather than by the
     * internal time calculation.
     *
     * @return <code>true</code> if the field has been set externally,
     * <code>false</code> otherwise.
     * @exception IndexOutOfBoundsException if the specified
     *                <code>field</code> is out of range
     *               (<code>field &lt; 0 || field &gt;= FIELD_COUNT</code>).
     * @see #selectFields()
     * @see #setFieldsComputed(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    protected void complete()

    /**
     * Fills in any unset fields in the calendar fields. First, the {@link
     * #computeTime()} method is called if the time value (millisecond offset
     * from the <a href="#Epoch">Epoch</a>) has not been calculated from
     * calendar field values. Then, the {@link #computeFields()} method is
     * called to calculate all calendar field values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public Map<String, Integer> getDisplayNames(int field, int style, Locale locale) {

    /**
     * Returns a {@code Map} containing all names of the calendar
     * {@code field} in the given {@code style} and
     * {@code locale} and their corresponding field values. For
     * example, if this {@code Calendar} is a {@link
     * GregorianCalendar}, the returned map would contain "Jan" to
     * {@link #JANUARY}, "Feb" to {@link #FEBRUARY}, and so on, in the
     * {@linkplain #SHORT short} style in an English locale.
     *
     * <p>Narrow names may not be unique due to use of single characters,
     * such as "S" for Sunday and Saturday. In that case narrow names are not
     * included in the returned {@code Map}.
     *
     * <p>The values of other calendar fields may be taken into
     * account to determine a set of display names. For example, if
     * this {@code Calendar} is a lunisolar calendar system and
     * the year value given by the {@link #YEAR} field has a leap
     * month, this method would return month names containing the leap
     * month name, and month names are mapped to their values specific
     * for the year.
     *
     * <p>The default implementation supports display names contained in
     * a {@link DateFormatSymbols}. For example, if {@code field}
     * is {@link #MONTH} and {@code style} is {@link
     * #ALL_STYLES}, this method returns a {@code Map} containing
     * all strings returned by {@link DateFormatSymbols#getShortMonths()}
     * and {@link DateFormatSymbols#getMonths()}.
     *
     * @param field
     *        the calendar field for which the display names are returned
     * @param style
     *        the style applied to the string representation; one of {@link
     *        #SHORT_FORMAT} ({@link #SHORT}), {@link #SHORT_STANDALONE},
     *        {@link #LONG_FORMAT} ({@link #LONG}), {@link #LONG_STANDALONE},
     *        {@link #NARROW_FORMAT}, or {@link #NARROW_STANDALONE}
     * @param locale
     *        the locale for the display names
     * @return a {@code Map} containing all display names in
     *        {@code style} and {@code locale} and their
     *        field values, or {@code null} if no display names
     *        are defined for {@code field}
     * @exception IllegalArgumentException
     *        if {@code field} or {@code style} is invalid,
     *        or if this {@code Calendar} is non-lenient and any
     *        of the calendar fields have invalid values
     * @exception NullPointerException
     *        if {@code locale} is null
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public String getDisplayName(int field, int style, Locale locale) {

    /**
     * Returns the string representation of the calendar
     * <code>field</code> value in the given <code>style</code> and
     * <code>locale</code>.  If no string representation is
     * applicable, <code>null</code> is returned. This method calls
     * {@link Calendar#get(int) get(field)} to get the calendar
     * <code>field</code> value if the string representation is
     * applicable to the given calendar <code>field</code>.
     *
     * <p>For example, if this <code>Calendar</code> is a
     * <code>GregorianCalendar</code> and its date is 2005-01-01, then
     * the string representation of the {@link #MONTH} field would be
     * "January" in the long style in an English locale or "Jan" in
     * the short style. However, no string representation would be
     * available for the {@link #DAY_OF_MONTH} field, and this method
     * would return <code>null</code>.
     *
     * <p>The default implementation supports the calendar fields for
     * which a {@link DateFormatSymbols} has names in the given
     * <code>locale</code>.
     *
     * @param field
     *        the calendar field for which the string representation
     *        is returned
     * @param style
     *        the style applied to the string representation; one of {@link
     *        #SHORT_FORMAT} ({@link #SHORT}), {@link #SHORT_STANDALONE},
     *        {@link #LONG_FORMAT} ({@link #LONG}), {@link #LONG_STANDALONE},
     *        {@link #NARROW_FORMAT}, or {@link #NARROW_STANDALONE}.
     * @param locale
     *        the locale for the string representation
     *        (any calendar types specified by {@code locale} are ignored)
     * @return the string representation of the given
     *        {@code field} in the given {@code style}, or
     *        {@code null} if no string representation is
     *        applicable.
     * @exception IllegalArgumentException
     *        if {@code field} or {@code style} is invalid,
     *        or if this {@code Calendar} is non-lenient and any
     *        of the calendar fields have invalid values
     * @exception NullPointerException
     *        if {@code locale} is null
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final boolean isSet(int field)

    /**
     * Determines if the given calendar field has a value set,
     * including cases that the value has been set by internal fields
     * calculations triggered by a <code>get</code> method call.
     *
     * @param field the calendar field to test
     * @return <code>true</code> if the given calendar field has a value set;
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final void clear(int field)

    /**
     * Sets the given calendar field value and the time value
     * (millisecond offset from the <a href="#Epoch">Epoch</a>) of
     * this <code>Calendar</code> undefined. This means that {@link
     * #isSet(int) isSet(field)} will return <code>false</code>, and
     * the date and time calculations will treat the field as if it
     * had never been set. A <code>Calendar</code> implementation
     * class may use the field's specific default value for date and
     * time calculations.
     *
     * <p>The {@link #HOUR_OF_DAY}, {@link #HOUR} and {@link #AM_PM}
     * fields are handled independently and the <a
     * href="#time_resolution">the resolution rule for the time of
     * day</a> is applied. Clearing one of the fields doesn't reset
     * the hour of day value of this <code>Calendar</code>. Use {@link
     * #set(int,int) set(Calendar.HOUR_OF_DAY, 0)} to reset the hour
     * value.
     *
     * @param field the calendar field to be cleared.
     * @see #clear()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final void clear()

    /**
     * Sets all the calendar field values and the time value
     * (millisecond offset from the <a href="#Epoch">Epoch</a>) of
     * this <code>Calendar</code> undefined. This means that {@link
     * #isSet(int) isSet()} will return <code>false</code> for all the
     * calendar fields, and the date and time calculations will treat
     * the fields as if they had never been set. A
     * <code>Calendar</code> implementation class may use its specific
     * default field values for date/time calculations. For example,
     * <code>GregorianCalendar</code> uses 1970 if the
     * <code>YEAR</code> field value is undefined.
     *
     * @see #clear(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final void set(int year, int month, int date, int hourOfDay, int minute,
                          int second)

    /**
     * Sets the values for the fields <code>YEAR</code>, <code>MONTH</code>,
     * <code>DAY_OF_MONTH</code>, <code>HOUR_OF_DAY</code>, <code>MINUTE</code>, and
     * <code>SECOND</code>.
     * Previous values of other fields are retained.  If this is not desired,
     * call {@link #clear()} first.
     *
     * @param year the value used to set the <code>YEAR</code> calendar field.
     * @param month the value used to set the <code>MONTH</code> calendar field.
     * Month value is 0-based. e.g., 0 for January.
     * @param date the value used to set the <code>DAY_OF_MONTH</code> calendar field.
     * @param hourOfDay the value used to set the <code>HOUR_OF_DAY</code> calendar field.
     * @param minute the value used to set the <code>MINUTE</code> calendar field.
     * @param second the value used to set the <code>SECOND</code> calendar field.
     * @see #set(int,int)
     * @see #set(int,int,int)
     * @see #set(int,int,int,int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final void set(int year, int month, int date, int hourOfDay, int minute)

    /**
     * Sets the values for the calendar fields <code>YEAR</code>,
     * <code>MONTH</code>, <code>DAY_OF_MONTH</code>,
     * <code>HOUR_OF_DAY</code>, and <code>MINUTE</code>.
     * Previous values of other fields are retained.  If this is not desired,
     * call {@link #clear()} first.
     *
     * @param year the value used to set the <code>YEAR</code> calendar field.
     * @param month the value used to set the <code>MONTH</code> calendar field.
     * Month value is 0-based. e.g., 0 for January.
     * @param date the value used to set the <code>DAY_OF_MONTH</code> calendar field.
     * @param hourOfDay the value used to set the <code>HOUR_OF_DAY</code> calendar field.
     * @param minute the value used to set the <code>MINUTE</code> calendar field.
     * @see #set(int,int)
     * @see #set(int,int,int)
     * @see #set(int,int,int,int,int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final void set(int year, int month, int date)

    /**
     * Sets the values for the calendar fields <code>YEAR</code>,
     * <code>MONTH</code>, and <code>DAY_OF_MONTH</code>.
     * Previous values of other calendar fields are retained.  If this is not desired,
     * call {@link #clear()} first.
     *
     * @param year the value used to set the <code>YEAR</code> calendar field.
     * @param month the value used to set the <code>MONTH</code> calendar field.
     * Month value is 0-based. e.g., 0 for January.
     * @param date the value used to set the <code>DAY_OF_MONTH</code> calendar field.
     * @see #set(int,int)
     * @see #set(int,int,int,int,int)
     * @see #set(int,int,int,int,int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public void set(int field, int value)

    /**
     * Sets the given calendar field to the given value. The value is not
     * interpreted by this method regardless of the leniency mode.
     *
     * @param field the given calendar field.
     * @param value the value to be set for the given calendar field.
     * @throws ArrayIndexOutOfBoundsException if the specified field is out of range
     *             (<code>field &lt; 0 || field &gt;= FIELD_COUNT</code>).
     * in non-lenient mode.
     * @see #set(int,int,int)
     * @see #set(int,int,int,int,int)
     * @see #set(int,int,int,int,int,int)
     * @see #get(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    final void internalSet(int field, int value)

    /**
     * Sets the value of the given calendar field. This method does
     * not affect any setting state of the field in this
     * <code>Calendar</code> instance.
     *
     * @throws IndexOutOfBoundsException if the specified field is out of range
     *             (<code>field &lt; 0 || field &gt;= FIELD_COUNT</code>).
     * @see #areFieldsSet
     * @see #isTimeSet
     * @see #areAllFieldsSet
     * @see #set(int,int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    protected final int internalGet(int field)

    /**
     * Returns the value of the given calendar field. This method does
     * not involve normalization or validation of the field value.
     *
     * @param field the given calendar field.
     * @return the value for the given calendar field.
     * @see #get(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public int get(int field)

    /**
     * Returns the value of the given calendar field. In lenient mode,
     * all calendar fields are normalized. In non-lenient mode, all
     * calendar fields are validated and this method throws an
     * exception if any calendar fields have out-of-range values. The
     * normalization and validation are handled by the
     * {@link #complete()} method, which process is calendar
     * system dependent.
     *
     * @param field the given calendar field.
     * @return the value for the given calendar field.
     * @throws ArrayIndexOutOfBoundsException if the specified field is out of range
     *             (<code>field &lt; 0 || field &gt;= FIELD_COUNT</code>).
     * @see #set(int,int)
     * @see #complete()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public void setTimeInMillis(long millis) {

    /**
     * Sets this Calendar's current time from the given long value.
     *
     * @param millis the new time in UTC milliseconds from the epoch.
     * @see #setTime(Date)
     * @see #getTimeInMillis()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public long getTimeInMillis() {

    /**
     * Returns this Calendar's time value in milliseconds.
     *
     * @return the current time as UTC milliseconds from the epoch.
     * @see #getTime()
     * @see #setTimeInMillis(long)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final void setTime(Date date) {

    /**
     * Sets this Calendar's time with the given <code>Date</code>.
     * <p>
     * Note: Calling <code>setTime()</code> with
     * <code>Date(Long.MAX_VALUE)</code> or <code>Date(Long.MIN_VALUE)</code>
     * may yield incorrect field values from <code>get()</code>.
     *
     * @param date the given Date.
     * @see #getTime()
     * @see #setTimeInMillis(long)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final Date getTime() {

    /**
     * Returns a <code>Date</code> object representing this
     * <code>Calendar</code>'s time value (millisecond offset from the <a
     * href="#Epoch">Epoch</a>").
     *
     * @return a <code>Date</code> representing the time value.
     * @see #setTime(Date)
     * @see #getTimeInMillis()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    protected abstract void computeFields();

    /**
     * Converts the current millisecond time value {@link #time}
     * to calendar field values in {@link #fields fields[]}.
     * This allows you to sync up the calendar field values with
     * a new time that is set for the calendar.  The time is <em>not</em>
     * recomputed first; to recompute the time, then the fields, call the
     * {@link #complete()} method.
     *
     * @see #computeTime()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    protected abstract void computeTime();

    /**
     * Converts the current calendar field values in {@link #fields fields[]}
     * to the millisecond time value
     * {@link #time}.
     *
     * @see #complete()
     * @see #computeFields()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static synchronized Locale[] getAvailableLocales()

    /**
     * Returns an array of all locales for which the <code>getInstance</code>
     * methods of this class can return localized instances.
     * The array returned must contain at least a <code>Locale</code>
     * instance equal to {@link java.util.Locale#US Locale.US}.
     *
     * @return An array of locales for which localized
     *         <code>Calendar</code> instances are available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static Calendar getInstance(TimeZone zone,
                                       Locale aLocale)

    /**
     * Gets a calendar with the specified time zone and locale.
     * The <code>Calendar</code> returned is based on the current time
     * in the given time zone with the given locale.
     *
     * @param zone the time zone to use
     * @param aLocale the locale for the week data
     * @return a Calendar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static Calendar getInstance(Locale aLocale)

    /**
     * Gets a calendar using the default time zone and specified locale.
     * The <code>Calendar</code> returned is based on the current time
     * in the default time zone with the given locale.
     *
     * @param aLocale the locale for the week data
     * @return a Calendar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static Calendar getInstance(TimeZone zone)

    /**
     * Gets a calendar using the specified time zone and default locale.
     * The <code>Calendar</code> returned is based on the current time
     * in the given time zone with the default
     * {@link Locale.Category#FORMAT FORMAT} locale.
     *
     * @param zone the time zone to use
     * @return a Calendar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static Calendar getInstance()

    /**
     * Gets a calendar using the default time zone and locale. The
     * <code>Calendar</code> returned is based on the current time
     * in the default time zone with the default
     * {@link Locale.Category#FORMAT FORMAT} locale.
     *
     * @return a Calendar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    protected Calendar(TimeZone zone, Locale aLocale)

    /**
     * Constructs a calendar with the specified time zone and locale.
     *
     * @param zone the time zone to use
     * @param aLocale the locale for the week data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    protected Calendar()

    /**
     * Constructs a Calendar with the default time zone
     * and the default {@link java.util.Locale.Category#FORMAT FORMAT}
     * locale.
     * @see     TimeZone#getDefault
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Calendar build() {

        /**
         * Returns a {@code Calendar} built from the parameters set by the
         * setter methods. The calendar type given by the {@link #setCalendarType(String)
         * setCalendarType} method or the {@linkplain #setLocale(Locale) locale} is
         * used to determine what {@code Calendar} to be created. If no explicit
         * calendar type is given, the locale's default calendar is created.
         *
         * <p>If the calendar type is {@code "iso8601"}, the
         * {@linkplain GregorianCalendar#setGregorianChange(Date) Gregorian change date}
         * of a {@link GregorianCalendar} is set to {@code Date(Long.MIN_VALUE)}
         * to be the <em>proleptic</em> Gregorian calendar. Its week definition
         * parameters are also set to be <a
         * href="GregorianCalendar.html#iso8601_compatible_setting">compatible
         * with the ISO 8601 standard</a>. Note that the
         * {@link GregorianCalendar#getCalendarType() getCalendarType} method of
         * a {@code GregorianCalendar} created with {@code "iso8601"} returns
         * {@code "gregory"}.
         *
         * <p>The default values are used for locale and time zone if these
         * parameters haven't been given explicitly.
         *
         * <p>Any out of range field values are either normalized in lenient
         * mode or detected as an invalid value in non-lenient mode.
         *
         * @return a {@code Calendar} built with parameters of this {@code
         *         Calendar.Builder}
         * @throws IllegalArgumentException if the calendar type is unknown, or
         *             if any invalid field values are given in non-lenient mode, or
         *             if a week date is given for the calendar type that doesn't
         *             support week dates.
         * @see Calendar#getInstance(TimeZone, Locale)
         * @see Locale#getDefault(Locale.Category)
         * @see TimeZone#getDefault()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setWeekDefinition(int firstDayOfWeek, int minimalDaysInFirstWeek) {

        /**
         * Sets the week definition parameters to the values given by
         * {@code firstDayOfWeek} and {@code minimalDaysInFirstWeek} that are
         * used to determine the <a href="Calendar.html#First_Week">first
         * week</a> of a year. The parameters given by this method have
         * precedence over the default values given by the
         * {@linkplain #setLocale(Locale) locale}.
         *
         * @param firstDayOfWeek the first day of a week; one of
         *                       {@link Calendar#SUNDAY} to {@link Calendar#SATURDAY}
         * @param minimalDaysInFirstWeek the minimal number of days in the first
         *                               week (1..7)
         * @return this {@code Calendar.Builder}
         * @throws IllegalArgumentException if {@code firstDayOfWeek} or
         *                                  {@code minimalDaysInFirstWeek} is invalid
         * @see Calendar#getFirstDayOfWeek()
         * @see Calendar#getMinimalDaysInFirstWeek()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setLocale(Locale locale) {

        /**
         * Sets the locale parameter to the given {@code locale}. If no locale
         * is given to this {@code Calendar.Builder}, the {@linkplain
         * Locale#getDefault(Locale.Category) default <code>Locale</code>}
         * for {@link Locale.Category#FORMAT} will be used.
         *
         * <p>If no calendar type is explicitly given by a call to the
         * {@link #setCalendarType(String) setCalendarType} method,
         * the {@code Locale} value is used to determine what type of
         * {@code Calendar} to be built.
         *
         * <p>If no week definition parameters are explicitly given by a call to
         * the {@link #setWeekDefinition(int,int) setWeekDefinition} method, the
         * {@code Locale}'s default values are used.
         *
         * @param locale the {@link Locale}
         * @throws NullPointerException if {@code locale} is {@code null}
         * @return this {@code Calendar.Builder}
         * @see Calendar#getInstance(Locale)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setCalendarType(String type) {

        /**
         * Sets the calendar type parameter to the given {@code type}. The
         * calendar type given by this method has precedence over any explicit
         * or implicit calendar type given by the
         * {@linkplain #setLocale(Locale) locale}.
         *
         * <p>In addition to the available calendar types returned by the
         * {@link Calendar#getAvailableCalendarTypes() Calendar.getAvailableCalendarTypes}
         * method, {@code "gregorian"} and {@code "iso8601"} as aliases of
         * {@code "gregory"} can be used with this method.
         *
         * @param type the calendar type
         * @return this {@code Calendar.Builder}
         * @throws NullPointerException if {@code type} is {@code null}
         * @throws IllegalArgumentException if {@code type} is unknown
         * @throws IllegalStateException if another calendar type has already been set
         * @see Calendar#getCalendarType()
         * @see Calendar#getAvailableCalendarTypes()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setLenient(boolean lenient) {

        /**
         * Sets the lenient mode parameter to the value given by {@code lenient}.
         * If no lenient parameter is given to this {@code Calendar.Builder},
         * lenient mode will be used in the {@link #build() build} method.
         *
         * @param lenient {@code true} for lenient mode;
         *                {@code false} for non-lenient mode
         * @return this {@code Calendar.Builder}
         * @see Calendar#setLenient(boolean)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setTimeZone(TimeZone zone) {

        /**
         * Sets the time zone parameter to the given {@code zone}. If no time
         * zone parameter is given to this {@code Caledar.Builder}, the
         * {@linkplain TimeZone#getDefault() default
         * <code>TimeZone</code>} will be used in the {@link #build() build}
         * method.
         *
         * @param zone the {@link TimeZone}
         * @return this {@code Calendar.Builder}
         * @throws NullPointerException if {@code zone} is {@code null}
         * @see Calendar#setTimeZone(TimeZone)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setWeekDate(int weekYear, int weekOfYear, int dayOfWeek) {

        /**
         * Sets the week-based date parameters to the values with the given
         * date specifiers - week year, week of year, and day of week.
         *
         * <p>If the specified calendar doesn't support week dates, the
         * {@link #build() build} method will throw an {@link IllegalArgumentException}.
         *
         * @param weekYear   the week year
         * @param weekOfYear the week number based on {@code weekYear}
         * @param dayOfWeek  the day of week value: one of the constants
         *     for the {@link Calendar#DAY_OF_WEEK DAY_OF_WEEK} field:
         *     {@link Calendar#SUNDAY SUNDAY}, ..., {@link Calendar#SATURDAY SATURDAY}.
         * @return this {@code Calendar.Builder}
         * @see Calendar#setWeekDate(int, int, int)
         * @see Calendar#isWeekDateSupported()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setTimeOfDay(int hourOfDay, int minute, int second, int millis) {

        /**
         * Sets the time of day field parameters to the values given by
         * {@code hourOfDay}, {@code minute}, {@code second}, and
         * {@code millis}. This method is equivalent to a call to:
         * <pre>
         *   setFields(Calendar.HOUR_OF_DAY, hourOfDay,
         *             Calendar.MINUTE, minute,
         *             Calendar.SECOND, second,
         *             Calendar.MILLISECOND, millis);</pre>
         *
         * @param hourOfDay the {@link Calendar#HOUR_OF_DAY HOUR_OF_DAY} value
         *                  (24-hour clock)
         * @param minute    the {@link Calendar#MINUTE MINUTE} value
         * @param second    the {@link Calendar#SECOND SECOND} value
         * @param millis    the {@link Calendar#MILLISECOND MILLISECOND} value
         * @return this {@code Calendar.Builder}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setTimeOfDay(int hourOfDay, int minute, int second) {

        /**
         * Sets the time of day field parameters to the values given by
         * {@code hourOfDay}, {@code minute}, and {@code second}. This method is
         * equivalent to a call to:
         * <pre>
         *   setTimeOfDay(hourOfDay, minute, second, 0);</pre>
         *
         * @param hourOfDay the {@link Calendar#HOUR_OF_DAY HOUR_OF_DAY} value
         *                  (24-hour clock)
         * @param minute    the {@link Calendar#MINUTE MINUTE} value
         * @param second    the {@link Calendar#SECOND SECOND} value
         * @return this {@code Calendar.Builder}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setDate(int year, int month, int dayOfMonth) {

        /**
         * Sets the date field parameters to the values given by {@code year},
         * {@code month}, and {@code dayOfMonth}. This method is equivalent to
         * a call to:
         * <pre>
         *   setFields(Calendar.YEAR, year,
         *             Calendar.MONTH, month,
         *             Calendar.DAY_OF_MONTH, dayOfMonth);</pre>
         *
         * @param year       the {@link Calendar#YEAR YEAR} value
         * @param month      the {@link Calendar#MONTH MONTH} value
         *                   (the month numbering is <em>0-based</em>).
         * @param dayOfMonth the {@link Calendar#DAY_OF_MONTH DAY_OF_MONTH} value
         * @return this {@code Calendar.Builder}
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setFields(int... fieldValuePairs) {

        /**
         * Sets field parameters to their values given by
         * {@code fieldValuePairs} that are pairs of a field and its value.
         * For example,
         * <pre>
         *   setFeilds(Calendar.YEAR, 2013,
         *             Calendar.MONTH, Calendar.DECEMBER,
         *             Calendar.DAY_OF_MONTH, 23);</pre>
         * is equivalent to the sequence of the following
         * {@link #set(int, int) set} calls:
         * <pre>
         *   set(Calendar.YEAR, 2013)
         *   .set(Calendar.MONTH, Calendar.DECEMBER)
         *   .set(Calendar.DAY_OF_MONTH, 23);</pre>
         *
         * @param fieldValuePairs field-value pairs
         * @return this {@code Calendar.Builder}
         * @throws NullPointerException if {@code fieldValuePairs} is {@code null}
         * @throws IllegalArgumentException if any of fields are invalid,
         *             or if {@code fieldValuePairs.length} is an odd number.
         * @throws IllegalStateException    if the instant value has been set,
         *             or if fields have been set too many (approximately
         *             {@link Integer#MAX_VALUE}) times.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder set(int field, int value) {

        /**
         * Sets the {@code field} parameter to the given {@code value}.
         * {@code field} is an index to the {@link Calendar#fields}, such as
         * {@link Calendar#DAY_OF_MONTH DAY_OF_MONTH}. Field value validation is
         * not performed in this method. Any out of range values are either
         * normalized in lenient mode or detected as an invalid value in
         * non-lenient mode when building a {@code Calendar}.
         *
         * @param field an index to the {@code Calendar} fields
         * @param value the field value
         * @return this {@code Calendar.Builder}
         * @throws IllegalArgumentException if {@code field} is invalid
         * @throws IllegalStateException if the instant value has already been set,
         *                      or if fields have been set too many
         *                      (approximately {@link Integer#MAX_VALUE}) times.
         * @see Calendar#set(int, int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setInstant(Date instant) {

        /**
         * Sets the instant parameter to the {@code instant} value given by a
         * {@link Date}. This method is equivalent to a call to
         * {@link #setInstant(long) setInstant(instant.getTime())}.
         *
         * @param instant a {@code Date} representing a millisecond offset from
         *                the Epoch
         * @return this {@code Calendar.Builder}
         * @throws NullPointerException  if {@code instant} is {@code null}
         * @throws IllegalStateException if any of the field parameters have
         *                               already been set
         * @see Calendar#setTime(Date)
         * @see Calendar#setTimeInMillis(long)
         * @see Calendar#time
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder setInstant(long instant) {

        /**
         * Sets the instant parameter to the given {@code instant} value that is
         * a millisecond offset from <a href="Calendar.html#Epoch">the
         * Epoch</a>.
         *
         * @param instant a millisecond offset from the Epoch
         * @return this {@code Calendar.Builder}
         * @throws IllegalStateException if any of the field parameters have
         *                               already been set
         * @see Calendar#setTime(Date)
         * @see Calendar#setTimeInMillis(long)
         * @see Calendar#time
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
        public Builder() {

        /**
         * Constructs a {@code Calendar.Builder}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static class Builder {

    /**
     * {@code Calendar.Builder} is used for creating a {@code Calendar} from
     * various date-time parameters.
     *
     * <p>There are two ways to set a {@code Calendar} to a date-time value. One
     * is to set the instant parameter to a millisecond offset from the <a
     * href="Calendar.html#Epoch">Epoch</a>. The other is to set individual
     * field parameters, such as {@link Calendar#YEAR YEAR}, to their desired
     * values. These two ways can't be mixed. Trying to set both the instant and
     * individual fields will cause an {@link IllegalStateException} to be
     * thrown. However, it is permitted to override previous values of the
     * instant or field parameters.
     *
     * <p>If no enough field parameters are given for determining date and/or
     * time, calendar specific default values are used when building a
     * {@code Calendar}. For example, if the {@link Calendar#YEAR YEAR} value
     * isn't given for the Gregorian calendar, 1970 will be used. If there are
     * any conflicts among field parameters, the <a
     * href="Calendar.html#resolution"> resolution rules</a> are applied.
     * Therefore, the order of field setting matters.
     *
     * <p>In addition to the date-time parameters,
     * the {@linkplain #setLocale(Locale) locale},
     * {@linkplain #setTimeZone(TimeZone) time zone},
     * {@linkplain #setWeekDefinition(int, int) week definition}, and
     * {@linkplain #setLenient(boolean) leniency mode} parameters can be set.
     *
     * <p><b>Examples</b>
     * <p>The following are sample usages. Sample code assumes that the
     * {@code Calendar} constants are statically imported.
     *
     * <p>The following code produces a {@code Calendar} with date 2012-12-31
     * (Gregorian) because Monday is the first day of a week with the <a
     * href="GregorianCalendar.html#iso8601_compatible_setting"> ISO 8601
     * compatible week parameters</a>.
     * <pre>
     *   Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
     *                        .setWeekDate(2013, 1, MONDAY).build();</pre>
     * <p>The following code produces a Japanese {@code Calendar} with date
     * 1989-01-08 (Gregorian), assuming that the default {@link Calendar#ERA ERA}
     * is <em>Heisei</em> that started on that day.
     * <pre>
     *   Calendar cal = new Calendar.Builder().setCalendarType("japanese")
     *                        .setFields(YEAR, 1, DAY_OF_YEAR, 1).build();</pre>
     *
     * @since 1.8
     * @see Calendar#getInstance(TimeZone, Locale)
     * @see Calendar#fields
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private int             serialVersionOnStream = currentSerialVersion;

    /**
     * The version of the serialized data on the stream.  Possible values:
     * <dl>
     * <dt><b>0</b> or not present on stream</dt>
     * <dd>
     * JDK 1.1.5 or earlier.
     * </dd>
     * <dt><b>1</b></dt>
     * <dd>
     * JDK 1.1.6 or later.  Writes a correct 'time' value
     * as well as compatible values for other fields.  This is a
     * transitional format.
     * </dd>
     * </dl>
     * When streaming out this class, the most recent format
     * and the highest allowable <code>serialVersionOnStream</code>
     * is written.
     * @serial
     * @since JDK1.1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private int             nextStamp = MINIMUM_USER_STAMP;

    /**
     * The next available value for <code>stamp[]</code>, an internal array.
     * This actually should not be written out to the stream, and will probably
     * be removed from the stream in the near future.  In the meantime,
     * a value of <code>MINIMUM_USER_STAMP</code> should be used.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    static final int ALL_FIELDS = (1 << FIELD_COUNT) - 1;

    /**
     * The mask value that represents all of the fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private static final int        MINIMUM_USER_STAMP = 2;

    /**
     * The value of the corresponding fields[] has been set externally. Stamp
     * values which are greater than 1 represents the (pseudo) time when the
     * corresponding fields[] value was set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private static final int        COMPUTED = 1;

    /**
     * The value of the corresponding fields[] has been calculated internally.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private static final int        UNSET = 0;

    /**
     * The corresponding fields[] has no value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private static final ConcurrentMap<Locale, int[]> cachedLocaleData

    /**
     * Cache to hold the firstDayOfWeek and minimalDaysInFirstWeek
     * of a Locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private int             minimalDaysInFirstWeek;

    /**
     * The number of days required for the first week in a month or year,
     * with possible values from 1 to 7.  This is a locale-dependent value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private int             firstDayOfWeek;

    /**
     * The first day of the week, with possible values <code>SUNDAY</code>,
     * <code>MONDAY</code>, etc.  This is a locale-dependent value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    transient private boolean sharedZone = false;

    /**
     * <code>True</code> if zone references to a shared TimeZone object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private TimeZone        zone;

    /**
     * The <code>TimeZone</code> used by this calendar. <code>Calendar</code>
     * uses the time zone data to translate between locale and GMT time.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    private boolean         lenient = true;

    /**
     * <code>True</code> if this calendar allows out-of-range field values during computation
     * of <code>time</code> from <code>fields[]</code>.
     * @see #setLenient
     * @see #isLenient
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    transient boolean       areAllFieldsSet;

    /**
     * True if all fields have been set.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @SuppressWarnings("ProtectedField")

    /**
     * True if <code>fields[]</code> are in sync with the currently set time.
     * If false, then the next attempt to get the value of a field will
     * force a recomputation of all fields from the current value of
     * <code>time</code>.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @SuppressWarnings("ProtectedField")

    /**
     * True if then the value of <code>time</code> is valid.
     * The time is made invalid by a change to an item of <code>field[]</code>.
     * @see #time
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @SuppressWarnings("ProtectedField")

    /**
     * The currently set time for this calendar, expressed in milliseconds after
     * January 1, 1970, 0:00:00 GMT.
     * @see #isTimeSet
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    transient private int   stamp[];

    /**
     * Pseudo-time-stamps which specify when each field was set. There
     * are two special values, UNSET and COMPUTED. Values from
     * MINIMUM_USER_SET to Integer.MAX_VALUE are legal user set values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @SuppressWarnings("ProtectedField")

    /**
     * The flags which tell if a specified calendar field for the calendar is set.
     * A new object has no fields set.  After the first call to a method
     * which generates the fields, they all remain set after that.
     * This is an array of <code>FIELD_COUNT</code> booleans, with index values
     * <code>ERA</code> through <code>DST_OFFSET</code>.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    @SuppressWarnings("ProtectedField")

    /**
     * The calendar field values for the currently set time for this calendar.
     * This is an array of <code>FIELD_COUNT</code> integers, with index values
     * <code>ERA</code> through <code>DST_OFFSET</code>.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static final int LONG_STANDALONE = LONG | STANDALONE_MASK;

    /**
     * A style specifier for {@link #getDisplayName(int, int, Locale)
     * getDisplayName} and {@link #getDisplayNames(int, int, Locale)
     * getDisplayNames} indicating a long name used independently,
     * such as a month name as calendar headers.
     *
     * @see #LONG_FORMAT
     * @see #SHORT_FORMAT
     * @see #SHORT_STANDALONE
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static final int SHORT_STANDALONE = SHORT | STANDALONE_MASK;

    /**
     * A style specifier for {@link #getDisplayName(int, int, Locale)
     * getDisplayName} and {@link #getDisplayNames(int, int, Locale)
     * getDisplayNames} indicating a short name used independently,
     * such as a month abbreviation as calendar headers.
     *
     * @see #SHORT_FORMAT
     * @see #LONG_FORMAT
     * @see #LONG_STANDALONE
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static final int LONG_FORMAT = 2;

    /**
     * A style specifier for {@link #getDisplayName(int, int, Locale)
     * getDisplayName} and {@link #getDisplayNames(int, int, Locale)
     * getDisplayNames} indicating a long name used for format.
     *
     * @see #LONG_STANDALONE
     * @see #SHORT_FORMAT
     * @see #SHORT_STANDALONE
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static final int SHORT_FORMAT = 1;

    /**
     * A style specifier for {@link #getDisplayName(int, int, Locale)
     * getDisplayName} and {@link #getDisplayNames(int, int, Locale)
     * getDisplayNames} indicating a short name used for format.
     *
     * @see #SHORT_STANDALONE
     * @see #LONG_FORMAT
     * @see #LONG_STANDALONE
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static final int NARROW_STANDALONE = NARROW_FORMAT | STANDALONE_MASK;

    /**
     * A style specifier for {@link #getDisplayName(int, int, Locale)
     * getDisplayName} and {@link #getDisplayNames(int, int, Locale)
     * getDisplayNames} indicating a narrow name independently. Narrow names
     * are typically single character strings, such as "M" for Monday.
     *
     * @see #NARROW_FORMAT
     * @see #SHORT_STANDALONE
     * @see #LONG_STANDALONE
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static final int NARROW_FORMAT = 4;

    /**
     * A style specifier for {@link #getDisplayName(int, int, Locale)
     * getDisplayName} and {@link #getDisplayNames(int, int, Locale)
     * getDisplayNames} indicating a narrow name used for format. Narrow names
     * are typically single character strings, such as "M" for Monday.
     *
     * @see #NARROW_STANDALONE
     * @see #SHORT_FORMAT
     * @see #LONG_FORMAT
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static final int LONG = 2;

    /**
     * A style specifier for {@link #getDisplayName(int, int, Locale)
     * getDisplayName} and {@link #getDisplayNames(int, int, Locale)
     * getDisplayNames} equivalent to {@link #LONG_FORMAT}.
     *
     * @see #LONG_STANDALONE
     * @see #SHORT
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static final int SHORT = 1;

    /**
     * A style specifier for {@link #getDisplayName(int, int, Locale)
     * getDisplayName} and {@link #getDisplayNames(int, int, Locale)
     * getDisplayNames} equivalent to {@link #SHORT_FORMAT}.
     *
     * @see #SHORT_STANDALONE
     * @see #LONG
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public static final int ALL_STYLES = 0;

    /**
     * A style specifier for {@link #getDisplayNames(int, int, Locale)
     * getDisplayNames} indicating names in all styles, such as
     * "January" and "Jan".
     *
     * @see #SHORT_FORMAT
     * @see #LONG_FORMAT
     * @see #SHORT_STANDALONE
     * @see #LONG_STANDALONE
     * @see #SHORT
     * @see #LONG
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int PM = 1;

    /**
     * Value of the {@link #AM_PM} field indicating the
     * period of the day from noon to just before midnight.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int AM = 0;

    /**
     * Value of the {@link #AM_PM} field indicating the
     * period of the day from midnight to just before noon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int UNDECIMBER = 12;

    /**
     * Value of the {@link #MONTH} field indicating the
     * thirteenth month of the year. Although <code>GregorianCalendar</code>
     * does not use this value, lunar calendars do.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int DECEMBER = 11;

    /**
     * Value of the {@link #MONTH} field indicating the
     * twelfth month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int NOVEMBER = 10;

    /**
     * Value of the {@link #MONTH} field indicating the
     * eleventh month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int OCTOBER = 9;

    /**
     * Value of the {@link #MONTH} field indicating the
     * tenth month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int SEPTEMBER = 8;

    /**
     * Value of the {@link #MONTH} field indicating the
     * ninth month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int AUGUST = 7;

    /**
     * Value of the {@link #MONTH} field indicating the
     * eighth month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int JULY = 6;

    /**
     * Value of the {@link #MONTH} field indicating the
     * seventh month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int JUNE = 5;

    /**
     * Value of the {@link #MONTH} field indicating the
     * sixth month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int MAY = 4;

    /**
     * Value of the {@link #MONTH} field indicating the
     * fifth month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int APRIL = 3;

    /**
     * Value of the {@link #MONTH} field indicating the
     * fourth month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int MARCH = 2;

    /**
     * Value of the {@link #MONTH} field indicating the
     * third month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int FEBRUARY = 1;

    /**
     * Value of the {@link #MONTH} field indicating the
     * second month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int JANUARY = 0;

    /**
     * Value of the {@link #MONTH} field indicating the
     * first month of the year in the Gregorian and Julian calendars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int SATURDAY = 7;

    /**
     * Value of the {@link #DAY_OF_WEEK} field indicating
     * Saturday.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int FRIDAY = 6;

    /**
     * Value of the {@link #DAY_OF_WEEK} field indicating
     * Friday.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int THURSDAY = 5;

    /**
     * Value of the {@link #DAY_OF_WEEK} field indicating
     * Thursday.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int WEDNESDAY = 4;

    /**
     * Value of the {@link #DAY_OF_WEEK} field indicating
     * Wednesday.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int TUESDAY = 3;

    /**
     * Value of the {@link #DAY_OF_WEEK} field indicating
     * Tuesday.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int MONDAY = 2;

    /**
     * Value of the {@link #DAY_OF_WEEK} field indicating
     * Monday.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int SUNDAY = 1;

    /**
     * Value of the {@link #DAY_OF_WEEK} field indicating
     * Sunday.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int FIELD_COUNT = 17;

    /**
     * The number of distinct fields recognized by <code>get</code> and <code>set</code>.
     * Field numbers range from <code>0..FIELD_COUNT-1</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int DST_OFFSET = 16;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * daylight saving offset in milliseconds.
     * <p>
     * This field reflects the correct daylight saving offset value of
     * the time zone of this <code>Calendar</code> if the
     * <code>TimeZone</code> implementation subclass supports
     * historical Daylight Saving Time schedule changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int ZONE_OFFSET = 15;

    /**
     * Field number for <code>get</code> and <code>set</code>
     * indicating the raw offset from GMT in milliseconds.
     * <p>
     * This field reflects the correct GMT offset value of the time
     * zone of this <code>Calendar</code> if the
     * <code>TimeZone</code> implementation subclass supports
     * historical GMT offset changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int MILLISECOND = 14;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * millisecond within the second.
     * E.g., at 10:04:15.250 PM the <code>MILLISECOND</code> is 250.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int SECOND = 13;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * second within the minute.
     * E.g., at 10:04:15.250 PM the <code>SECOND</code> is 15.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int MINUTE = 12;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * minute within the hour.
     * E.g., at 10:04:15.250 PM the <code>MINUTE</code> is 4.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int HOUR_OF_DAY = 11;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * hour of the day. <code>HOUR_OF_DAY</code> is used for the 24-hour clock.
     * E.g., at 10:04:15.250 PM the <code>HOUR_OF_DAY</code> is 22.
     *
     * @see #HOUR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int HOUR = 10;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * hour of the morning or afternoon. <code>HOUR</code> is used for the
     * 12-hour clock (0 - 11). Noon and midnight are represented by 0, not by 12.
     * E.g., at 10:04:15.250 PM the <code>HOUR</code> is 10.
     *
     * @see #AM_PM
     * @see #HOUR_OF_DAY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int AM_PM = 9;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating
     * whether the <code>HOUR</code> is before or after noon.
     * E.g., at 10:04:15.250 PM the <code>AM_PM</code> is <code>PM</code>.
     *
     * @see #AM
     * @see #PM
     * @see #HOUR
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int DAY_OF_WEEK_IN_MONTH = 8;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * ordinal number of the day of the week within the current month. Together
     * with the <code>DAY_OF_WEEK</code> field, this uniquely specifies a day
     * within a month.  Unlike <code>WEEK_OF_MONTH</code> and
     * <code>WEEK_OF_YEAR</code>, this field's value does <em>not</em> depend on
     * <code>getFirstDayOfWeek()</code> or
     * <code>getMinimalDaysInFirstWeek()</code>.  <code>DAY_OF_MONTH 1</code>
     * through <code>7</code> always correspond to <code>DAY_OF_WEEK_IN_MONTH
     * 1</code>; <code>8</code> through <code>14</code> correspond to
     * <code>DAY_OF_WEEK_IN_MONTH 2</code>, and so on.
     * <code>DAY_OF_WEEK_IN_MONTH 0</code> indicates the week before
     * <code>DAY_OF_WEEK_IN_MONTH 1</code>.  Negative values count back from the
     * end of the month, so the last Sunday of a month is specified as
     * <code>DAY_OF_WEEK = SUNDAY, DAY_OF_WEEK_IN_MONTH = -1</code>.  Because
     * negative values count backward they will usually be aligned differently
     * within the month than positive values.  For example, if a month has 31
     * days, <code>DAY_OF_WEEK_IN_MONTH -1</code> will overlap
     * <code>DAY_OF_WEEK_IN_MONTH 5</code> and the end of <code>4</code>.
     *
     * @see #DAY_OF_WEEK
     * @see #WEEK_OF_MONTH
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int DAY_OF_WEEK = 7;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the day
     * of the week.  This field takes values <code>SUNDAY</code>,
     * <code>MONDAY</code>, <code>TUESDAY</code>, <code>WEDNESDAY</code>,
     * <code>THURSDAY</code>, <code>FRIDAY</code>, and <code>SATURDAY</code>.
     *
     * @see #SUNDAY
     * @see #MONDAY
     * @see #TUESDAY
     * @see #WEDNESDAY
     * @see #THURSDAY
     * @see #FRIDAY
     * @see #SATURDAY
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int DAY_OF_YEAR = 6;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the day
     * number within the current year.  The first day of the year has value 1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int DAY_OF_MONTH = 5;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * day of the month. This is a synonym for <code>DATE</code>.
     * The first day of the month has value 1.
     *
     * @see #DATE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int DATE = 5;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * day of the month. This is a synonym for <code>DAY_OF_MONTH</code>.
     * The first day of the month has value 1.
     *
     * @see #DAY_OF_MONTH
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int WEEK_OF_MONTH = 4;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * week number within the current month.  The first week of the month, as
     * defined by <code>getFirstDayOfWeek()</code> and
     * <code>getMinimalDaysInFirstWeek()</code>, has value 1.  Subclasses define
     * the value of <code>WEEK_OF_MONTH</code> for days before the first week of
     * the month.
     *
     * @see #getFirstDayOfWeek
     * @see #getMinimalDaysInFirstWeek
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int WEEK_OF_YEAR = 3;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * week number within the current year.  The first week of the year, as
     * defined by <code>getFirstDayOfWeek()</code> and
     * <code>getMinimalDaysInFirstWeek()</code>, has value 1.  Subclasses define
     * the value of <code>WEEK_OF_YEAR</code> for days before the first week of
     * the year.
     *
     * @see #getFirstDayOfWeek
     * @see #getMinimalDaysInFirstWeek
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int MONTH = 2;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * month. This is a calendar-specific value. The first month of
     * the year in the Gregorian and Julian calendars is
     * <code>JANUARY</code> which is 0; the last depends on the number
     * of months in a year.
     *
     * @see #JANUARY
     * @see #FEBRUARY
     * @see #MARCH
     * @see #APRIL
     * @see #MAY
     * @see #JUNE
     * @see #JULY
     * @see #AUGUST
     * @see #SEPTEMBER
     * @see #OCTOBER
     * @see #NOVEMBER
     * @see #DECEMBER
     * @see #UNDECIMBER
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int YEAR = 1;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * year. This is a calendar-specific value; see subclass documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
    public final static int ERA = 0;

    /**
     * Field number for <code>get</code> and <code>set</code> indicating the
     * era, e.g., AD or BC in the Julian calendar. This is a calendar-specific
     * value; see subclass documentation.
     *
     * @see GregorianCalendar#AD
     * @see GregorianCalendar#BC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Calendar.java
public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar> {

/**
 * The <code>Calendar</code> class is an abstract class that provides methods
 * for converting between a specific instant in time and a set of {@link
 * #fields calendar fields} such as <code>YEAR</code>, <code>MONTH</code>,
 * <code>DAY_OF_MONTH</code>, <code>HOUR</code>, and so on, and for
 * manipulating the calendar fields, such as getting the date of the next
 * week. An instant in time can be represented by a millisecond value that is
 * an offset from the <a name="Epoch"><em>Epoch</em></a>, January 1, 1970
 * 00:00:00.000 GMT (Gregorian).
 *
 * <p>The class also provides additional fields and methods for
 * implementing a concrete calendar system outside the package. Those
 * fields and methods are defined as <code>protected</code>.
 *
 * <p>
 * Like other locale-sensitive classes, <code>Calendar</code> provides a
 * class method, <code>getInstance</code>, for getting a generally useful
 * object of this type. <code>Calendar</code>'s <code>getInstance</code> method
 * returns a <code>Calendar</code> object whose
 * calendar fields have been initialized with the current date and time:
 * <blockquote>
 * <pre>
 *     Calendar rightNow = Calendar.getInstance();
 * </pre>
 * </blockquote>
 *
 * <p>A <code>Calendar</code> object can produce all the calendar field values
 * needed to implement the date-time formatting for a particular language and
 * calendar style (for example, Japanese-Gregorian, Japanese-Traditional).
 * <code>Calendar</code> defines the range of values returned by
 * certain calendar fields, as well as their meaning.  For example,
 * the first month of the calendar system has value <code>MONTH ==
 * JANUARY</code> for all calendars.  Other values are defined by the
 * concrete subclass, such as <code>ERA</code>.  See individual field
 * documentation and subclass documentation for details.
 *
 * <h3>Getting and Setting Calendar Field Values</h3>
 *
 * <p>The calendar field values can be set by calling the <code>set</code>
 * methods. Any field values set in a <code>Calendar</code> will not be
 * interpreted until it needs to calculate its time value (milliseconds from
 * the Epoch) or values of the calendar fields. Calling the
 * <code>get</code>, <code>getTimeInMillis</code>, <code>getTime</code>,
 * <code>add</code> and <code>roll</code> involves such calculation.
 *
 * <h4>Leniency</h4>
 *
 * <p><code>Calendar</code> has two modes for interpreting the calendar
 * fields, <em>lenient</em> and <em>non-lenient</em>.  When a
 * <code>Calendar</code> is in lenient mode, it accepts a wider range of
 * calendar field values than it produces.  When a <code>Calendar</code>
 * recomputes calendar field values for return by <code>get()</code>, all of
 * the calendar fields are normalized. For example, a lenient
 * <code>GregorianCalendar</code> interprets <code>MONTH == JANUARY</code>,
 * <code>DAY_OF_MONTH == 32</code> as February 1.

 * <p>When a <code>Calendar</code> is in non-lenient mode, it throws an
 * exception if there is any inconsistency in its calendar fields. For
 * example, a <code>GregorianCalendar</code> always produces
 * <code>DAY_OF_MONTH</code> values between 1 and the length of the month. A
 * non-lenient <code>GregorianCalendar</code> throws an exception upon
 * calculating its time or calendar field values if any out-of-range field
 * value has been set.
 *
 * <h4><a name="first_week">First Week</a></h4>
 *
 * <code>Calendar</code> defines a locale-specific seven day week using two
 * parameters: the first day of the week and the minimal days in first week
 * (from 1 to 7).  These numbers are taken from the locale resource data when a
 * <code>Calendar</code> is constructed.  They may also be specified explicitly
 * through the methods for setting their values.
 *
 * <p>When setting or getting the <code>WEEK_OF_MONTH</code> or
 * <code>WEEK_OF_YEAR</code> fields, <code>Calendar</code> must determine the
 * first week of the month or year as a reference point.  The first week of a
 * month or year is defined as the earliest seven day period beginning on
 * <code>getFirstDayOfWeek()</code> and containing at least
 * <code>getMinimalDaysInFirstWeek()</code> days of that month or year.  Weeks
 * numbered ..., -1, 0 precede the first week; weeks numbered 2, 3,... follow
 * it.  Note that the normalized numbering returned by <code>get()</code> may be
 * different.  For example, a specific <code>Calendar</code> subclass may
 * designate the week before week 1 of a year as week <code><i>n</i></code> of
 * the previous year.
 *
 * <h4>Calendar Fields Resolution</h4>
 *
 * When computing a date and time from the calendar fields, there
 * may be insufficient information for the computation (such as only
 * year and month with no day of month), or there may be inconsistent
 * information (such as Tuesday, July 15, 1996 (Gregorian) -- July 15,
 * 1996 is actually a Monday). <code>Calendar</code> will resolve
 * calendar field values to determine the date and time in the
 * following way.
 *
 * <p><a name="resolution">If there is any conflict in calendar field values,
 * <code>Calendar</code> gives priorities to calendar fields that have been set
 * more recently.</a> The following are the default combinations of the
 * calendar fields. The most recent combination, as determined by the
 * most recently set single field, will be used.
 *
 * <p><a name="date_resolution">For the date fields</a>:
 * <blockquote>
 * <pre>
 * YEAR + MONTH + DAY_OF_MONTH
 * YEAR + MONTH + WEEK_OF_MONTH + DAY_OF_WEEK
 * YEAR + MONTH + DAY_OF_WEEK_IN_MONTH + DAY_OF_WEEK
 * YEAR + DAY_OF_YEAR
 * YEAR + DAY_OF_WEEK + WEEK_OF_YEAR
 * </pre></blockquote>
 *
 * <a name="time_resolution">For the time of day fields</a>:
 * <blockquote>
 * <pre>
 * HOUR_OF_DAY
 * AM_PM + HOUR
 * </pre></blockquote>
 *
 * <p>If there are any calendar fields whose values haven't been set in the selected
 * field combination, <code>Calendar</code> uses their default values. The default
 * value of each field may vary by concrete calendar systems. For example, in
 * <code>GregorianCalendar</code>, the default of a field is the same as that
 * of the start of the Epoch: i.e., <code>YEAR = 1970</code>, <code>MONTH =
 * JANUARY</code>, <code>DAY_OF_MONTH = 1</code>, etc.
 *
 * <p>
 * <strong>Note:</strong> There are certain possible ambiguities in
 * interpretation of certain singular times, which are resolved in the
 * following ways:
 * <ol>
 *     <li> 23:59 is the last minute of the day and 00:00 is the first
 *          minute of the next day. Thus, 23:59 on Dec 31, 1999 &lt; 00:00 on
 *          Jan 1, 2000 &lt; 00:01 on Jan 1, 2000.
 *
 *     <li> Although historically not precise, midnight also belongs to "am",
 *          and noon belongs to "pm", so on the same day,
 *          12:00 am (midnight) &lt; 12:01 am, and 12:00 pm (noon) &lt; 12:01 pm
 * </ol>
 *
 * <p>
 * The date or time format strings are not part of the definition of a
 * calendar, as those must be modifiable or overridable by the user at
 * runtime. Use {@link DateFormat}
 * to format dates.
 *
 * <h4>Field Manipulation</h4>
 *
 * The calendar fields can be changed using three methods:
 * <code>set()</code>, <code>add()</code>, and <code>roll()</code>.
 *
 * <p><strong><code>set(f, value)</code></strong> changes calendar field
 * <code>f</code> to <code>value</code>.  In addition, it sets an
 * internal member variable to indicate that calendar field <code>f</code> has
 * been changed. Although calendar field <code>f</code> is changed immediately,
 * the calendar's time value in milliseconds is not recomputed until the next call to
 * <code>get()</code>, <code>getTime()</code>, <code>getTimeInMillis()</code>,
 * <code>add()</code>, or <code>roll()</code> is made. Thus, multiple calls to
 * <code>set()</code> do not trigger multiple, unnecessary
 * computations. As a result of changing a calendar field using
 * <code>set()</code>, other calendar fields may also change, depending on the
 * calendar field, the calendar field value, and the calendar system. In addition,
 * <code>get(f)</code> will not necessarily return <code>value</code> set by
 * the call to the <code>set</code> method
 * after the calendar fields have been recomputed. The specifics are determined by
 * the concrete calendar class.</p>
 *
 * <p><em>Example</em>: Consider a <code>GregorianCalendar</code>
 * originally set to August 31, 1999. Calling <code>set(Calendar.MONTH,
 * Calendar.SEPTEMBER)</code> sets the date to September 31,
 * 1999. This is a temporary internal representation that resolves to
 * October 1, 1999 if <code>getTime()</code>is then called. However, a
 * call to <code>set(Calendar.DAY_OF_MONTH, 30)</code> before the call to
 * <code>getTime()</code> sets the date to September 30, 1999, since
 * no recomputation occurs after <code>set()</code> itself.</p>
 *
 * <p><strong><code>add(f, delta)</code></strong> adds <code>delta</code>
 * to field <code>f</code>.  This is equivalent to calling <code>set(f,
 * get(f) + delta)</code> with two adjustments:</p>
 *
 * <blockquote>
 *   <p><strong>Add rule 1</strong>. The value of field <code>f</code>
 *   after the call minus the value of field <code>f</code> before the
 *   call is <code>delta</code>, modulo any overflow that has occurred in
 *   field <code>f</code>. Overflow occurs when a field value exceeds its
 *   range and, as a result, the next larger field is incremented or
 *   decremented and the field value is adjusted back into its range.</p>
 *
 *   <p><strong>Add rule 2</strong>. If a smaller field is expected to be
 *   invariant, but it is impossible for it to be equal to its
 *   prior value because of changes in its minimum or maximum after field
 *   <code>f</code> is changed or other constraints, such as time zone
 *   offset changes, then its value is adjusted to be as close
 *   as possible to its expected value. A smaller field represents a
 *   smaller unit of time. <code>HOUR</code> is a smaller field than
 *   <code>DAY_OF_MONTH</code>. No adjustment is made to smaller fields
 *   that are not expected to be invariant. The calendar system
 *   determines what fields are expected to be invariant.</p>
 * </blockquote>
 *
 * <p>In addition, unlike <code>set()</code>, <code>add()</code> forces
 * an immediate recomputation of the calendar's milliseconds and all
 * fields.</p>
 *
 * <p><em>Example</em>: Consider a <code>GregorianCalendar</code>
 * originally set to August 31, 1999. Calling <code>add(Calendar.MONTH,
 * 13)</code> sets the calendar to September 30, 2000. <strong>Add rule
 * 1</strong> sets the <code>MONTH</code> field to September, since
 * adding 13 months to August gives September of the next year. Since
 * <code>DAY_OF_MONTH</code> cannot be 31 in September in a
 * <code>GregorianCalendar</code>, <strong>add rule 2</strong> sets the
 * <code>DAY_OF_MONTH</code> to 30, the closest possible value. Although
 * it is a smaller field, <code>DAY_OF_WEEK</code> is not adjusted by
 * rule 2, since it is expected to change when the month changes in a
 * <code>GregorianCalendar</code>.</p>
 *
 * <p><strong><code>roll(f, delta)</code></strong> adds
 * <code>delta</code> to field <code>f</code> without changing larger
 * fields. This is equivalent to calling <code>add(f, delta)</code> with
 * the following adjustment:</p>
 *
 * <blockquote>
 *   <p><strong>Roll rule</strong>. Larger fields are unchanged after the
 *   call. A larger field represents a larger unit of
 *   time. <code>DAY_OF_MONTH</code> is a larger field than
 *   <code>HOUR</code>.</p>
 * </blockquote>
 *
 * <p><em>Example</em>: See {@link java.util.GregorianCalendar#roll(int, int)}.
 *
 * <p><strong>Usage model</strong>. To motivate the behavior of
 * <code>add()</code> and <code>roll()</code>, consider a user interface
 * component with increment and decrement buttons for the month, day, and
 * year, and an underlying <code>GregorianCalendar</code>. If the
 * interface reads January 31, 1999 and the user presses the month
 * increment button, what should it read? If the underlying
 * implementation uses <code>set()</code>, it might read March 3, 1999. A
 * better result would be February 28, 1999. Furthermore, if the user
 * presses the month increment button again, it should read March 31,
 * 1999, not March 28, 1999. By saving the original date and using either
 * <code>add()</code> or <code>roll()</code>, depending on whether larger
 * fields should be affected, the user interface can behave as most users
 * will intuitively expect.</p>
 *
 * @see          java.lang.System#currentTimeMillis()
 * @see          Date
 * @see          GregorianCalendar
 * @see          TimeZone
 * @see          java.text.DateFormat
 * @author Mark Davis, David Goldsmith, Chen-Lieh Huang, Alan Liu
 * @since JDK1.1
 */
