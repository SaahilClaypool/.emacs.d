_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    private Object writeReplace() {

    /**
     * Writes the object using a
     * <a href="../../../serialized-form.html#java.time.chrono.Ser">dedicated serialized form</a>.
     * @serialData
     * <pre>
     *  out.writeByte(4);                 // identifies a JapaneseDate
     *  out.writeInt(get(YEAR));
     *  out.writeByte(get(MONTH_OF_YEAR));
     *  out.writeByte(get(DAY_OF_MONTH));
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    @Override  // override for performance

    /**
     * A hash code for this date.
     *
     * @return a suitable hash code based only on the Chronology and the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    @Override  // override for performance

    /**
     * Compares this date to another date, including the chronology.
     * <p>
     * Compares this {@code JapaneseDate} with another ensuring that the date is the same.
     * <p>
     * Only objects of type {@code JapaneseDate} are compared, other types return false.
     * To compare the dates of two {@code TemporalAccessor} instances, including dates
     * in two different chronologies, use {@link ChronoField#EPOCH_DAY} as a comparator.
     *
     * @param obj  the object to check, null returns false
     * @return true if this is equal to the other date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    private JapaneseDate withYear(int year) {

    /**
     * Returns a copy of this date with the year-of-era altered.
     * <p>
     * This method changes the year-of-era of the date.
     * If the month-day is invalid for the year, then the previous valid day
     * will be selected instead.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param year  the year to set in the returned date
     * @return a {@code JapaneseDate} based on this date with the requested year-of-era, never null
     * @throws DateTimeException if {@code year} is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    private JapaneseDate withYear(JapaneseEra era, int yearOfEra) {

    /**
     * Returns a copy of this date with the year altered.
     * <p>
     * This method changes the year of the date.
     * If the month-day is invalid for the year, then the previous valid day
     * will be selected instead.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param era  the era to set in the result, not null
     * @param yearOfEra  the year-of-era to set in the returned date
     * @return a {@code JapaneseDate} based on this date with the requested year, never null
     * @throws DateTimeException if {@code year} is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    @Override

    /**
     * {@inheritDoc}
     * @throws DateTimeException {@inheritDoc}
     * @throws ArithmeticException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    @Override

    /**
     * {@inheritDoc}
     * @throws DateTimeException {@inheritDoc}
     * @throws ArithmeticException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    @Override

    /**
     * {@inheritDoc}
     * @throws DateTimeException {@inheritDoc}
     * @throws ArithmeticException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    private static LocalGregorianCalendar.Date toPrivateJapaneseDate(LocalDate isoDate) {

    /**
     * Returns a {@code LocalGregorianCalendar.Date} converted from the given {@code isoDate}.
     *
     * @param isoDate  the local date, not null
     * @return a {@code LocalGregorianCalendar.Date}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    @Override

    /**
     * Checks if the specified field is supported.
     * <p>
     * This checks if this date can be queried for the specified field.
     * If false, then calling the {@link #range(TemporalField) range} and
     * {@link #get(TemporalField) get} methods will throw an exception.
     * <p>
     * If the field is a {@link ChronoField} then the query is implemented here.
     * The supported fields are:
     * <ul>
     * <li>{@code DAY_OF_WEEK}
     * <li>{@code DAY_OF_MONTH}
     * <li>{@code DAY_OF_YEAR}
     * <li>{@code EPOCH_DAY}
     * <li>{@code MONTH_OF_YEAR}
     * <li>{@code PROLEPTIC_MONTH}
     * <li>{@code YEAR_OF_ERA}
     * <li>{@code YEAR}
     * <li>{@code ERA}
     * </ul>
     * All other {@code ChronoField} instances will return false.
     * <p>
     * If the field is not a {@code ChronoField}, then the result of this method
     * is obtained by invoking {@code TemporalField.isSupportedBy(TemporalAccessor)}
     * passing {@code this} as the argument.
     * Whether the field is supported is determined by the field.
     *
     * @param field  the field to check, null returns false
     * @return true if the field is supported on this date, false if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    @Override

    /**
     * Returns the length of the month represented by this date.
     * <p>
     * This returns the length of the month in days.
     * Month lengths match those of the ISO calendar system.
     *
     * @return the length of the month in days
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    @Override

    /**
     * Gets the era applicable at this date.
     * <p>
     * The Japanese calendar system has multiple eras defined by {@link JapaneseEra}.
     *
     * @return the era applicable at this date, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    @Override

    /**
     * Gets the chronology of this date, which is the Japanese calendar system.
     * <p>
     * The {@code Chronology} represents the calendar system in use.
     * The era and other fields in {@link ChronoField} are defined by the chronology.
     *
     * @return the Japanese chronology, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    JapaneseDate(JapaneseEra era, int year, LocalDate isoDate) {

    /**
     * Constructs a {@code JapaneseDate}. This constructor does NOT validate the given parameters,
     * and {@code era} and {@code year} must agree with {@code isoDate}.
     *
     * @param era  the era, validated not null
     * @param year  the year-of-era, validated
     * @param isoDate  the standard local date, validated not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    JapaneseDate(LocalDate isoDate) {

    /**
     * Creates an instance from an ISO date.
     *
     * @param isoDate  the standard local date, validated not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    public static JapaneseDate from(TemporalAccessor temporal) {

    /**
     * Obtains a {@code JapaneseDate} from a temporal object.
     * <p>
     * This obtains a date in the Japanese calendar system based on the specified temporal.
     * A {@code TemporalAccessor} represents an arbitrary set of date and time information,
     * which this factory converts to an instance of {@code JapaneseDate}.
     * <p>
     * The conversion typically uses the {@link ChronoField#EPOCH_DAY EPOCH_DAY}
     * field, which is standardized across calendar systems.
     * <p>
     * This method matches the signature of the functional interface {@link TemporalQuery}
     * allowing it to be used as a query via method reference, {@code JapaneseDate::from}.
     *
     * @param temporal  the temporal object to convert, not null
     * @return the date in Japanese calendar system, not null
     * @throws DateTimeException if unable to convert to a {@code JapaneseDate}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    static JapaneseDate ofYearDay(JapaneseEra era, int yearOfEra, int dayOfYear) {

    /**
     * Obtains a {@code JapaneseDate} representing a date in the Japanese calendar
     * system from the era, year-of-era and day-of-year fields.
     * <p>
     * This returns a {@code JapaneseDate} with the specified fields.
     * The day must be valid for the year, otherwise an exception will be thrown.
     * <p>
     * The day-of-year in this factory is expressed relative to the start of the year-of-era.
     * This definition changes the normal meaning of day-of-year only in those years
     * where the year-of-era is reset to one due to a change in the era.
     * For example:
     * <pre>
     *  6th Jan Showa 64 = day-of-year 6
     *  7th Jan Showa 64 = day-of-year 7
     *  8th Jan Heisei 1 = day-of-year 1
     *  9th Jan Heisei 1 = day-of-year 2
     * </pre>
     *
     * @param era  the Japanese era, not null
     * @param yearOfEra  the Japanese year-of-era
     * @param dayOfYear  the chronology day-of-year, from 1 to 366
     * @return the date in Japanese calendar system, not null
     * @throws DateTimeException if the value of any field is out of range,
     *  or if the day-of-year is invalid for the year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    public static JapaneseDate of(int prolepticYear, int month, int dayOfMonth) {

    /**
     * Obtains a {@code JapaneseDate} representing a date in the Japanese calendar
     * system from the proleptic-year, month-of-year and day-of-month fields.
     * <p>
     * This returns a {@code JapaneseDate} with the specified fields.
     * The day must be valid for the year and month, otherwise an exception will be thrown.
     * <p>
     * The Japanese proleptic year, month and day-of-month are the same as those
     * in the ISO calendar system. They are not reset when the era changes.
     *
     * @param prolepticYear  the Japanese proleptic-year
     * @param month  the Japanese month-of-year, from 1 to 12
     * @param dayOfMonth  the Japanese day-of-month, from 1 to 31
     * @return the date in Japanese calendar system, not null
     * @throws DateTimeException if the value of any field is out of range,
     *  or if the day-of-month is invalid for the month-year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    public static JapaneseDate of(JapaneseEra era, int yearOfEra, int month, int dayOfMonth) {

    /**
     * Obtains a {@code JapaneseDate} representing a date in the Japanese calendar
     * system from the era, year-of-era, month-of-year and day-of-month fields.
     * <p>
     * This returns a {@code JapaneseDate} with the specified fields.
     * The day must be valid for the year and month, otherwise an exception will be thrown.
     * <p>
     * The Japanese month and day-of-month are the same as those in the
     * ISO calendar system. They are not reset when the era changes.
     * For example:
     * <pre>
     *  6th Jan Showa 64 = ISO 1989-01-06
     *  7th Jan Showa 64 = ISO 1989-01-07
     *  8th Jan Heisei 1 = ISO 1989-01-08
     *  9th Jan Heisei 1 = ISO 1989-01-09
     * </pre>
     *
     * @param era  the Japanese era, not null
     * @param yearOfEra  the Japanese year-of-era
     * @param month  the Japanese month-of-year, from 1 to 12
     * @param dayOfMonth  the Japanese day-of-month, from 1 to 31
     * @return the date in Japanese calendar system, not null
     * @throws DateTimeException if the value of any field is out of range,
     *  or if the day-of-month is invalid for the month-year,
     *  or if the date is not a Japanese era
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    public static JapaneseDate now(Clock clock) {

    /**
     * Obtains the current {@code JapaneseDate} from the specified clock.
     * <p>
     * This will query the specified clock to obtain the current date - today.
     * Using this method allows the use of an alternate clock for testing.
     * The alternate clock may be introduced using {@linkplain Clock dependency injection}.
     *
     * @param clock  the clock to use, not null
     * @return the current date, not null
     * @throws DateTimeException if the current date cannot be obtained
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    public static JapaneseDate now(ZoneId zone) {

    /**
     * Obtains the current {@code JapaneseDate} from the system clock in the specified time-zone.
     * <p>
     * This will query the {@link Clock#system(ZoneId) system clock} to obtain the current date.
     * Specifying the time-zone avoids dependence on the default time-zone.
     * <p>
     * Using this method will prevent the ability to use an alternate clock for testing
     * because the clock is hard-coded.
     *
     * @param zone  the zone ID to use, not null
     * @return the current date using the system clock, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    public static JapaneseDate now() {

    /**
     * Obtains the current {@code JapaneseDate} from the system clock in the default time-zone.
     * <p>
     * This will query the {@link Clock#systemDefaultZone() system clock} in the default
     * time-zone to obtain the current date.
     * <p>
     * Using this method will prevent the ability to use an alternate clock for testing
     * because the clock is hard-coded.
     *
     * @return the current date using the system clock and default time-zone, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    static final LocalDate MEIJI_6_ISODATE = LocalDate.of(1873, 1, 1);

    /**
     * The first day supported by the JapaneseChronology is Meiji 6, January 1st.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    private transient int yearOfEra;

    /**
     * The Japanese imperial calendar year of this date.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    private final transient LocalDate isoDate;

    /**
     * The underlying ISO local date.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
    private static final long serialVersionUID = -305327627230580483L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseDate.java
public final class JapaneseDate

/**
 * A date in the Japanese Imperial calendar system.
 * <p>
 * This date operates using the {@linkplain JapaneseChronology Japanese Imperial calendar}.
 * This calendar system is primarily used in Japan.
 * <p>
 * The Japanese Imperial calendar system is the same as the ISO calendar system
 * apart from the era-based year numbering. The proleptic-year is defined to be
 * equal to the ISO proleptic-year.
 * <p>
 * Japan introduced the Gregorian calendar starting with Meiji 6.
 * Only Meiji and later eras are supported;
 * dates before Meiji 6, January 1 are not supported.
 * <p>
 * For example, the Japanese year "Heisei 24" corresponds to ISO year "2012".<br>
 * Calling {@code japaneseDate.get(YEAR_OF_ERA)} will return 24.<br>
 * Calling {@code japaneseDate.get(YEAR)} will return 2012.<br>
 * Calling {@code japaneseDate.get(ERA)} will return 2, corresponding to
 * {@code JapaneseChronology.ERA_HEISEI}.<br>
 *
 * <p>
 * This is a <a href="{@docRoot}/java/lang/doc-files/ValueBased.html">value-based</a>
 * class; use of identity-sensitive operations (including reference equality
 * ({@code ==}), identity hash code, or synchronization) on instances of
 * {@code JapaneseDate} may have unpredictable results and should be avoided.
 * The {@code equals} method should be used for comparisons.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
