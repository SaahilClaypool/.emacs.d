_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        private ValueRange rangeWeekOfWeekBasedYear(TemporalAccessor temporal) {

        /**
         * Map the field range to a week range of a week year.
         * @param temporal  the temporal
         * @return the ValueRange with the range adjusted to weeks.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        private ValueRange rangeByWeek(TemporalAccessor temporal, TemporalField field) {

        /**
         * Map the field range to a week range
         * @param temporal the temporal
         * @param field the field to get the range of
         * @return the ValueRange with the range adjusted to weeks.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        private int computeWeek(int offset, int day) {

        /**
         * Returns the week number computed from the reference day and reference dayOfWeek.
         *
         * @param offset the offset to align a date with the start of week
         *     from {@link #startOfWeekOffset}.
         * @param day  the day for which to compute the week number
         * @return the week number where zero is used for a partial week and 1 for the first full week
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        private int startOfWeekOffset(int day, int dow) {

        /**
         * Returns an offset to align week start with a day of month or day of year.
         *
         * @param day  the day; 1 through infinity
         * @param dow  the day of the week of that day; 1 through 7
         * @return  an offset in days to align a day with the start of the first 'full' week
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        private int localizedWeekOfWeekBasedYear(TemporalAccessor temporal) {

        /**
         * Returns the week of week-based-year for the temporal.
         * The week can be part of the previous year, the current year,
         * or the next year depending on the week start and minimum number
         * of days.
         * @param temporal  a date of any chronology
         * @return the week of the year
         * @see #localizedWeekBasedYear(java.time.temporal.TemporalAccessor)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        private int localizedWeekBasedYear(TemporalAccessor temporal) {

        /**
         * Returns the year of week-based-year for the temporal.
         * The year can be the previous year, the current year, or the next year.
         * @param temporal a date of any chronology, not null
         * @return the year of week-based-year for the date
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        private ChronoLocalDate ofWeekBasedYear(Chronology chrono,
                int yowby, int wowby, int dow) {

        /**
         * Return a new week-based-year date of the Chronology, year, week-of-year,
         * and dow of week.
         * @param chrono The chronology of the new date
         * @param yowby the year of the week-based-year
         * @param wowby the week of the week-based-year
         * @param dow the day of the week
         * @return a ChronoLocalDate for the requested year, week of year, and day of week
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        static ComputedDayOfField ofWeekBasedYearField(WeekFields weekDef) {

        /**
         * Returns a field to access the week of week-based-year,
         * computed based on a WeekFields.
         * @see WeekFields#weekBasedYear()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        static ComputedDayOfField ofWeekOfWeekBasedYearField(WeekFields weekDef) {

        /**
         * Returns a field to access the week of week-based-year,
         * computed based on a WeekFields.
         * @see WeekFields#weekOfWeekBasedYear()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        static ComputedDayOfField ofWeekOfYearField(WeekFields weekDef) {

        /**
         * Returns a field to access the week of year,
         * computed based on a WeekFields.
         * @see WeekFields#weekOfYear()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        static ComputedDayOfField ofWeekOfMonthField(WeekFields weekDef) {

        /**
         * Returns a field to access the week of month,
         * computed based on a WeekFields.
         * @see WeekFields#weekOfMonth()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
        static ComputedDayOfField ofDayOfWeekField(WeekFields weekDef) {

        /**
         * Returns a field to access the day of week,
         * computed based on a WeekFields.
         * <p>
         * The WeekDefintion of the first day of the week is used with
         * the ISO DAY_OF_WEEK field to compute week boundaries.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    static class ComputedDayOfField implements TemporalField {

    /**
     * Field type that computes DayOfWeek, WeekOfMonth, and WeekOfYear
     * based on a WeekFields.
     * A separate Field instance is required for each different WeekFields;
     * combination of start of week and minimum number of days.
     * Constructors are provided to create fields for DayOfWeek, WeekOfMonth,
     * and WeekOfYear.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    @Override

    /**
     * A string representation of this {@code WeekFields} instance.
     *
     * @return the string representation, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    @Override

    /**
     * A hash code for this {@code WeekFields}.
     *
     * @return a suitable hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    @Override

    /**
     * Checks if this {@code WeekFields} is equal to the specified object.
     * <p>
     * The comparison is based on the entire state of the rules, which is
     * the first day-of-week and minimal days.
     *
     * @param object  the other rules to compare to, null returns false
     * @return true if this is equal to the specified rules
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public TemporalField weekBasedYear() {

    /**
     * Returns a field to access the year of a week-based-year based on this {@code WeekFields}.
     * <p>
     * This represents the concept of the year where weeks start on a fixed day-of-week,
     * such as Monday and each week belongs to exactly one year.
     * This field is typically used with {@link WeekFields#dayOfWeek()} and
     * {@link WeekFields#weekOfWeekBasedYear()}.
     * <p>
     * Week one(1) is the week starting on the {@link WeekFields#getFirstDayOfWeek}
     * where there are at least {@link WeekFields#getMinimalDaysInFirstWeek()} days in the year.
     * Thus, week one may start before the start of the year.
     * If the first week starts after the start of the year then the period before
     * is in the last week of the previous year.
     * <p>
     * This field can be used with any calendar system.
     * <p>
     * In the resolving phase of parsing, a date can be created from a week-based-year,
     * week-of-year and day-of-week.
     * <p>
     * In {@linkplain ResolverStyle#STRICT strict mode}, all three fields are
     * validated against their range of valid values. The week-of-year field
     * is validated to ensure that the resulting week-based-year is the
     * week-based-year requested.
     * <p>
     * In {@linkplain ResolverStyle#SMART smart mode}, all three fields are
     * validated against their range of valid values. The week-of-week-based-year field
     * is validated from 1 to 53, meaning that the resulting date can be in the
     * following week-based-year to that specified.
     * <p>
     * In {@linkplain ResolverStyle#LENIENT lenient mode}, the year and day-of-week
     * are validated against the range of valid values. The resulting date is calculated
     * equivalent to the following three stage approach.
     * First, create a date on the first day of the first week in the requested week-based-year.
     * Then take the week-of-week-based-year, subtract one, and add the amount in weeks to the date.
     * Finally, adjust to the correct day-of-week within the localized week.
     *
     * @return a field providing access to the week-based-year, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public TemporalField weekOfWeekBasedYear() {

    /**
     * Returns a field to access the week of a week-based-year based on this {@code WeekFields}.
     * <p>
     * This represents the concept of the count of weeks within the year where weeks
     * start on a fixed day-of-week, such as Monday and each week belongs to exactly one year.
     * This field is typically used with {@link WeekFields#dayOfWeek()} and
     * {@link WeekFields#weekBasedYear()}.
     * <p>
     * Week one(1) is the week starting on the {@link WeekFields#getFirstDayOfWeek}
     * where there are at least {@link WeekFields#getMinimalDaysInFirstWeek()} days in the year.
     * If the first week starts after the start of the year then the period before
     * is in the last week of the previous year.
     * <p>
     * For example:<br>
     * - if the 1st day of the year is a Monday, week one starts on the 1st<br>
     * - if the 2nd day of the year is a Monday, week one starts on the 2nd and
     *   the 1st is in the last week of the previous year<br>
     * - if the 4th day of the year is a Monday, week one starts on the 4th and
     *   the 1st to 3rd is in the last week of the previous year<br>
     * - if the 5th day of the year is a Monday, week two starts on the 5th and
     *   the 1st to 4th is in week one<br>
     * <p>
     * This field can be used with any calendar system.
     * <p>
     * In the resolving phase of parsing, a date can be created from a week-based-year,
     * week-of-year and day-of-week.
     * <p>
     * In {@linkplain ResolverStyle#STRICT strict mode}, all three fields are
     * validated against their range of valid values. The week-of-year field
     * is validated to ensure that the resulting week-based-year is the
     * week-based-year requested.
     * <p>
     * In {@linkplain ResolverStyle#SMART smart mode}, all three fields are
     * validated against their range of valid values. The week-of-week-based-year field
     * is validated from 1 to 53, meaning that the resulting date can be in the
     * following week-based-year to that specified.
     * <p>
     * In {@linkplain ResolverStyle#LENIENT lenient mode}, the year and day-of-week
     * are validated against the range of valid values. The resulting date is calculated
     * equivalent to the following three stage approach.
     * First, create a date on the first day of the first week in the requested week-based-year.
     * Then take the week-of-week-based-year, subtract one, and add the amount in weeks to the date.
     * Finally, adjust to the correct day-of-week within the localized week.
     *
     * @return a field providing access to the week-of-week-based-year, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public TemporalField weekOfYear() {

    /**
     * Returns a field to access the week of year based on this {@code WeekFields}.
     * <p>
     * This represents the concept of the count of weeks within the year where weeks
     * start on a fixed day-of-week, such as Monday.
     * This field is typically used with {@link WeekFields#dayOfWeek()}.
     * <p>
     * Week one(1) is the week starting on the {@link WeekFields#getFirstDayOfWeek}
     * where there are at least {@link WeekFields#getMinimalDaysInFirstWeek()} days in the year.
     * Thus, week one may start up to {@code minDays} days before the start of the year.
     * If the first week starts after the start of the year then the period before is week zero (0).
     * <p>
     * For example:<br>
     * - if the 1st day of the year is a Monday, week one starts on the 1st and there is no week zero<br>
     * - if the 2nd day of the year is a Monday, week one starts on the 2nd and the 1st is in week zero<br>
     * - if the 4th day of the year is a Monday, week one starts on the 4th and the 1st to 3rd is in week zero<br>
     * - if the 5th day of the year is a Monday, week two starts on the 5th and the 1st to 4th is in week one<br>
     * <p>
     * This field can be used with any calendar system.
     * <p>
     * In the resolving phase of parsing, a date can be created from a year,
     * week-of-year and day-of-week.
     * <p>
     * In {@linkplain ResolverStyle#STRICT strict mode}, all three fields are
     * validated against their range of valid values. The week-of-year field
     * is validated to ensure that the resulting year is the year requested.
     * <p>
     * In {@linkplain ResolverStyle#SMART smart mode}, all three fields are
     * validated against their range of valid values. The week-of-year field
     * is validated from 0 to 54, meaning that the resulting date can be in a
     * different year to that specified.
     * <p>
     * In {@linkplain ResolverStyle#LENIENT lenient mode}, the year and day-of-week
     * are validated against the range of valid values. The resulting date is calculated
     * equivalent to the following three stage approach.
     * First, create a date on the first day of the first week in the requested year.
     * Then take the week-of-year, subtract one, and add the amount in weeks to the date.
     * Finally, adjust to the correct day-of-week within the localized week.
     *
     * @return a field providing access to the week-of-year, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public TemporalField weekOfMonth() {

    /**
     * Returns a field to access the week of month based on this {@code WeekFields}.
     * <p>
     * This represents the concept of the count of weeks within the month where weeks
     * start on a fixed day-of-week, such as Monday.
     * This field is typically used with {@link WeekFields#dayOfWeek()}.
     * <p>
     * Week one (1) is the week starting on the {@link WeekFields#getFirstDayOfWeek}
     * where there are at least {@link WeekFields#getMinimalDaysInFirstWeek()} days in the month.
     * Thus, week one may start up to {@code minDays} days before the start of the month.
     * If the first week starts after the start of the month then the period before is week zero (0).
     * <p>
     * For example:<br>
     * - if the 1st day of the month is a Monday, week one starts on the 1st and there is no week zero<br>
     * - if the 2nd day of the month is a Monday, week one starts on the 2nd and the 1st is in week zero<br>
     * - if the 4th day of the month is a Monday, week one starts on the 4th and the 1st to 3rd is in week zero<br>
     * - if the 5th day of the month is a Monday, week two starts on the 5th and the 1st to 4th is in week one<br>
     * <p>
     * This field can be used with any calendar system.
     * <p>
     * In the resolving phase of parsing, a date can be created from a year,
     * week-of-month, month-of-year and day-of-week.
     * <p>
     * In {@linkplain ResolverStyle#STRICT strict mode}, all four fields are
     * validated against their range of valid values. The week-of-month field
     * is validated to ensure that the resulting month is the month requested.
     * <p>
     * In {@linkplain ResolverStyle#SMART smart mode}, all four fields are
     * validated against their range of valid values. The week-of-month field
     * is validated from 0 to 6, meaning that the resulting date can be in a
     * different month to that specified.
     * <p>
     * In {@linkplain ResolverStyle#LENIENT lenient mode}, the year and day-of-week
     * are validated against the range of valid values. The resulting date is calculated
     * equivalent to the following four stage approach.
     * First, create a date on the first day of the first week of January in the requested year.
     * Then take the month-of-year, subtract one, and add the amount in months to the date.
     * Then take the week-of-month, subtract one, and add the amount in weeks to the date.
     * Finally, adjust to the correct day-of-week within the localized week.
     *
     * @return a field providing access to the week-of-month, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public TemporalField dayOfWeek() {

    /**
     * Returns a field to access the day of week based on this {@code WeekFields}.
     * <p>
     * This is similar to {@link ChronoField#DAY_OF_WEEK} but uses values for
     * the day-of-week based on this {@code WeekFields}.
     * The days are numbered from 1 to 7 where the
     * {@link #getFirstDayOfWeek() first day-of-week} is assigned the value 1.
     * <p>
     * For example, if the first day-of-week is Sunday, then that will have the
     * value 1, with other days ranging from Monday as 2 to Saturday as 7.
     * <p>
     * In the resolving phase of parsing, a localized day-of-week will be converted
     * to a standardized {@code ChronoField} day-of-week.
     * The day-of-week must be in the valid range 1 to 7.
     * Other fields in this class build dates using the standardized day-of-week.
     *
     * @return a field providing access to the day-of-week with localized numbering, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public int getMinimalDaysInFirstWeek() {

    /**
     * Gets the minimal number of days in the first week.
     * <p>
     * The number of days considered to define the first week of a month or year
     * varies by culture.
     * For example, the ISO-8601 requires 4 days (more than half a week) to
     * be present before counting the first week.
     *
     * @return the minimal number of days in the first week of a month or year, from 1 to 7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public DayOfWeek getFirstDayOfWeek() {

    /**
     * Gets the first day-of-week.
     * <p>
     * The first day-of-week varies by culture.
     * For example, the US uses Sunday, while France and the ISO-8601 standard use Monday.
     * This method returns the first day using the standard {@code DayOfWeek} enum.
     *
     * @return the first day-of-week, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    private Object readResolve() throws InvalidObjectException {

    /**
     * Return the singleton WeekFields associated with the
     * {@code firstDayOfWeek} and {@code minimalDays}.
     * @return the singleton WeekFields for the firstDayOfWeek and minimalDays.
     * @throws InvalidObjectException if the serialized object has invalid
     *     values for firstDayOfWeek or minimalDays.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    private void readObject(ObjectInputStream s)

    /**
     * Restore the state of a WeekFields from the stream.
     * Check that the values are valid.
     *
     * @param s the stream to read
     * @throws InvalidObjectException if the serialized object has an invalid
     *     value for firstDayOfWeek or minimalDays.
     * @throws ClassNotFoundException if a class cannot be resolved
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    private WeekFields(DayOfWeek firstDayOfWeek, int minimalDaysInFirstWeek) {

    /**
     * Creates an instance of the definition.
     *
     * @param firstDayOfWeek  the first day of the week, not null
     * @param minimalDaysInFirstWeek  the minimal number of days in the first week, from 1 to 7
     * @throws IllegalArgumentException if the minimal days value is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public static WeekFields of(DayOfWeek firstDayOfWeek, int minimalDaysInFirstWeek) {

    /**
     * Obtains an instance of {@code WeekFields} from the first day-of-week and minimal days.
     * <p>
     * The first day-of-week defines the ISO {@code DayOfWeek} that is day 1 of the week.
     * The minimal number of days in the first week defines how many days must be present
     * in a month or year, starting from the first day-of-week, before the week is counted
     * as the first week. A value of 1 will count the first day of the month or year as part
     * of the first week, whereas a value of 7 will require the whole seven days to be in
     * the new month or year.
     * <p>
     * WeekFields instances are singletons; for each unique combination
     * of {@code firstDayOfWeek} and {@code minimalDaysInFirstWeek} the
     * the same instance will be returned.
     *
     * @param firstDayOfWeek  the first day of the week, not null
     * @param minimalDaysInFirstWeek  the minimal number of days in the first week, from 1 to 7
     * @return the week-definition, not null
     * @throws IllegalArgumentException if the minimal days value is less than one
     *      or greater than 7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public static WeekFields of(Locale locale) {

    /**
     * Obtains an instance of {@code WeekFields} appropriate for a locale.
     * <p>
     * This will look up appropriate values from the provider of localization data.
     *
     * @param locale  the locale to use, not null
     * @return the week-definition, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    private final transient TemporalField weekBasedYear = ComputedDayOfField.ofWeekBasedYearField(this);

    /**
     * The field that represents the week-based-year.
     * <p>
     * This field allows the week-based-year value to be queried and set.
     * <p>
     * This unit is an immutable and thread-safe singleton.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    private final transient TemporalField weekOfYear = ComputedDayOfField.ofWeekOfYearField(this);

    /**
     * The field used to access the computed WeekOfYear.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    private final transient TemporalField dayOfWeek = ComputedDayOfField.ofDayOfWeekField(this);

    /**
     * The field used to access the computed DayOfWeek.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    private final DayOfWeek firstDayOfWeek;

    /**
     * The first day-of-week.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    private static final long serialVersionUID = -1177360819670808121L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public static final TemporalUnit WEEK_BASED_YEARS = IsoFields.WEEK_BASED_YEARS;

    /**
     * The unit that represents week-based-years for the purpose of addition and subtraction.
     * <p>
     * This allows a number of week-based-years to be added to, or subtracted from, a date.
     * The unit is equal to either 52 or 53 weeks.
     * The estimated duration of a week-based-year is the same as that of a standard ISO
     * year at {@code 365.2425 Days}.
     * <p>
     * The rules for addition add the number of week-based-years to the existing value
     * for the week-based-year field retaining the week-of-week-based-year
     * and day-of-week, unless the week number it too large for the target year.
     * In that case, the week is set to the last week of the year
     * with the same day-of-week.
     * <p>
     * This unit is an immutable and thread-safe singleton.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public static final WeekFields SUNDAY_START = WeekFields.of(DayOfWeek.SUNDAY, 1);

    /**
     * The common definition of a week that starts on Sunday and the first week
     * has a minimum of 1 day.
     * <p>
     * Defined as starting on Sunday and with a minimum of 1 day in the month.
     * This week definition is in use in the US and other European countries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    public static final WeekFields ISO = new WeekFields(DayOfWeek.MONDAY, 4);

    /**
     * The ISO-8601 definition, where a week starts on Monday and the first week
     * has a minimum of 4 days.
     * <p>
     * The ISO-8601 standard defines a calendar system based on weeks.
     * It uses the week-based-year and week-of-week-based-year concepts to split
     * up the passage of days instead of the standard year/month/day.
     * <p>
     * Note that the first week may start in the previous calendar year.
     * Note also that the first few days of a calendar year may be in the
     * week-based-year corresponding to the previous calendar year.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
    private static final ConcurrentMap<String, WeekFields> CACHE = new ConcurrentHashMap<>(4, 0.75f, 2);

    /**
     * The cache of rules by firstDayOfWeek plus minimalDays.
     * Initialized first to be available for definition of ISO, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/temporal/WeekFields.java
public final class WeekFields implements Serializable {

/**
 * Localized definitions of the day-of-week, week-of-month and week-of-year fields.
 * <p>
 * A standard week is seven days long, but cultures have different definitions for some
 * other aspects of a week. This class represents the definition of the week, for the
 * purpose of providing {@link TemporalField} instances.
 * <p>
 * WeekFields provides five fields,
 * {@link #dayOfWeek()}, {@link #weekOfMonth()}, {@link #weekOfYear()},
 * {@link #weekOfWeekBasedYear()}, and {@link #weekBasedYear()}
 * that provide access to the values from any {@linkplain Temporal temporal object}.
 * <p>
 * The computations for day-of-week, week-of-month, and week-of-year are based
 * on the  {@linkplain ChronoField#YEAR proleptic-year},
 * {@linkplain ChronoField#MONTH_OF_YEAR month-of-year},
 * {@linkplain ChronoField#DAY_OF_MONTH day-of-month}, and
 * {@linkplain ChronoField#DAY_OF_WEEK ISO day-of-week} which are based on the
 * {@linkplain ChronoField#EPOCH_DAY epoch-day} and the chronology.
 * The values may not be aligned with the {@linkplain ChronoField#YEAR_OF_ERA year-of-Era}
 * depending on the Chronology.
 * <p>A week is defined by:
 * <ul>
 * <li>The first day-of-week.
 * For example, the ISO-8601 standard considers Monday to be the first day-of-week.
 * <li>The minimal number of days in the first week.
 * For example, the ISO-8601 standard counts the first week as needing at least 4 days.
 * </ul>
 * Together these two values allow a year or month to be divided into weeks.
 *
 * <h3>Week of Month</h3>
 * One field is used: week-of-month.
 * The calculation ensures that weeks never overlap a month boundary.
 * The month is divided into periods where each period starts on the defined first day-of-week.
 * The earliest period is referred to as week 0 if it has less than the minimal number of days
 * and week 1 if it has at least the minimal number of days.
 *
 * <table cellpadding="0" cellspacing="3" border="0" style="text-align: left; width: 50%;">
 * <caption>Examples of WeekFields</caption>
 * <tr><th>Date</th><td>Day-of-week</td>
 *  <td>First day: Monday<br>Minimal days: 4</td><td>First day: Monday<br>Minimal days: 5</td></tr>
 * <tr><th>2008-12-31</th><td>Wednesday</td>
 *  <td>Week 5 of December 2008</td><td>Week 5 of December 2008</td></tr>
 * <tr><th>2009-01-01</th><td>Thursday</td>
 *  <td>Week 1 of January 2009</td><td>Week 0 of January 2009</td></tr>
 * <tr><th>2009-01-04</th><td>Sunday</td>
 *  <td>Week 1 of January 2009</td><td>Week 0 of January 2009</td></tr>
 * <tr><th>2009-01-05</th><td>Monday</td>
 *  <td>Week 2 of January 2009</td><td>Week 1 of January 2009</td></tr>
 * </table>
 *
 * <h3>Week of Year</h3>
 * One field is used: week-of-year.
 * The calculation ensures that weeks never overlap a year boundary.
 * The year is divided into periods where each period starts on the defined first day-of-week.
 * The earliest period is referred to as week 0 if it has less than the minimal number of days
 * and week 1 if it has at least the minimal number of days.
 *
 * <h3>Week Based Year</h3>
 * Two fields are used for week-based-year, one for the
 * {@link #weekOfWeekBasedYear() week-of-week-based-year} and one for
 * {@link #weekBasedYear() week-based-year}.  In a week-based-year, each week
 * belongs to only a single year.  Week 1 of a year is the first week that
 * starts on the first day-of-week and has at least the minimum number of days.
 * The first and last weeks of a year may contain days from the
 * previous calendar year or next calendar year respectively.
 *
 * <table cellpadding="0" cellspacing="3" border="0" style="text-align: left; width: 50%;">
 * <caption>Examples of WeekFields for week-based-year</caption>
 * <tr><th>Date</th><td>Day-of-week</td>
 *  <td>First day: Monday<br>Minimal days: 4</td><td>First day: Monday<br>Minimal days: 5</td></tr>
 * <tr><th>2008-12-31</th><td>Wednesday</td>
 *  <td>Week 1 of 2009</td><td>Week 53 of 2008</td></tr>
 * <tr><th>2009-01-01</th><td>Thursday</td>
 *  <td>Week 1 of 2009</td><td>Week 53 of 2008</td></tr>
 * <tr><th>2009-01-04</th><td>Sunday</td>
 *  <td>Week 1 of 2009</td><td>Week 53 of 2008</td></tr>
 * <tr><th>2009-01-05</th><td>Monday</td>
 *  <td>Week 2 of 2009</td><td>Week 1 of 2009</td></tr>
 * </table>
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
