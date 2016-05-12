_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private Object writeReplace() {

    /**
     * Writes the object using a
     * <a href="../../../serialized-form.html#java.time.chrono.Ser">dedicated serialized form</a>.
     * @serialData
     * <pre>
     *  out.writeByte(6);                 // identifies a HijrahDate
     *  out.writeObject(chrono);          // the HijrahChronology variant
     *  out.writeInt(get(YEAR));
     *  out.writeByte(get(MONTH_OF_YEAR));
     *  out.writeByte(get(DAY_OF_MONTH));
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override  // override for performance

    /**
     * A hash code for this date.
     *
     * @return a suitable hash code based only on the Chronology and the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override  // override for performance

    /**
     * Compares this date to another date, including the chronology.
     * <p>
     * Compares this {@code HijrahDate} with another ensuring that the date is the same.
     * <p>
     * Only objects of type {@code HijrahDate} are compared, other types return false.
     * To compare the dates of two {@code TemporalAccessor} instances, including dates
     * in two different chronologies, use {@link ChronoField#EPOCH_DAY} as a comparator.
     *
     * @param obj  the object to check, null returns false
     * @return true if this is equal to the other date and the Chronologies are equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override

    /**
     * Checks if the year is a leap year, according to the Hijrah calendar system rules.
     *
     * @return true if this date is in a leap year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private int getEraValue() {

    /**
     * Gets the Era of this date.
     *
     * @return the Era of this date; computed from epochDay
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private int getDayOfWeek() {

    /**
     * Gets the day-of-week value.
     *
     * @return the day-of-week; computed from the epochday
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private int getDayOfYear() {

    /**
     * Gets the day-of-year field.
     * <p>
     * This method returns the primitive {@code int} value for the day-of-year.
     *
     * @return the day-of-year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override

    /**
     * {@inheritDoc}
     * @throws DateTimeException {@inheritDoc}
     * @throws ArithmeticException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override

    /**
     * {@inheritDoc}
     * @throws DateTimeException {@inheritDoc}
     * @throws ArithmeticException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    public HijrahDate withVariant(HijrahChronology chronology) {

    /**
     * Returns a {@code HijrahDate} with the Chronology requested.
     * <p>
     * The year, month, and day are checked against the new requested
     * HijrahChronology.  If the chronology has a shorter month length
     * for the month, the day is reduced to be the last day of the month.
     *
     * @param chronology the new HijrahChonology, non-null
     * @return a HijrahDate with the requested HijrahChronology, non-null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override

    /**
     * {@inheritDoc}
     * @throws DateTimeException if unable to make the adjustment.
     *     For example, if the adjuster requires an ISO chronology
     * @throws ArithmeticException {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override

    /**
     * Returns the length of the year represented by this date.
     * <p>
     * This returns the length of the year in days.
     * A Hijrah calendar system year is typically shorter than
     * that of the ISO calendar system.
     *
     * @return the length of the year in days
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override

    /**
     * Returns the length of the month represented by this date.
     * <p>
     * This returns the length of the month in days.
     * Month lengths in the Hijrah calendar system vary between 29 and 30 days.
     *
     * @return the length of the month in days
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override

    /**
     * Gets the era applicable at this date.
     * <p>
     * The Hijrah calendar system has one era, 'AH',
     * defined by {@link HijrahEra}.
     *
     * @return the era applicable at this date, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    @Override

    /**
     * Gets the chronology of this date, which is the Hijrah calendar system.
     * <p>
     * The {@code Chronology} represents the calendar system in use.
     * The era and other fields in {@link ChronoField} are defined by the chronology.
     *
     * @return the Hijrah chronology, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private HijrahDate(HijrahChronology chrono, long epochDay) {

    /**
     * Constructs an instance with the Epoch Day.
     *
     * @param epochDay  the epochDay
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private HijrahDate(HijrahChronology chrono, int prolepticYear, int monthOfYear, int dayOfMonth) {

    /**
     * Constructs an {@code HijrahDate} with the proleptic-year, month-of-year and
     * day-of-month fields.
     *
     * @param chrono The chronology to create the date with
     * @param prolepticYear the proleptic year
     * @param monthOfYear the month of year
     * @param dayOfMonth the day of month
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    public static HijrahDate from(TemporalAccessor temporal) {

    /**
     * Obtains a {@code HijrahDate} of the Islamic Umm Al-Qura calendar from a temporal object.
     * <p>
     * This obtains a date in the Hijrah calendar system based on the specified temporal.
     * A {@code TemporalAccessor} represents an arbitrary set of date and time information,
     * which this factory converts to an instance of {@code HijrahDate}.
     * <p>
     * The conversion typically uses the {@link ChronoField#EPOCH_DAY EPOCH_DAY}
     * field, which is standardized across calendar systems.
     * <p>
     * This method matches the signature of the functional interface {@link TemporalQuery}
     * allowing it to be used as a query via method reference, {@code HijrahDate::from}.
     *
     * @param temporal  the temporal object to convert, not null
     * @return the date in Hijrah calendar system, not null
     * @throws DateTimeException if unable to convert to a {@code HijrahDate}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    public static HijrahDate of(int prolepticYear, int month, int dayOfMonth) {

    /**
     * Obtains a {@code HijrahDate} of the Islamic Umm Al-Qura calendar
     * from the proleptic-year, month-of-year and day-of-month fields.
     * <p>
     * This returns a {@code HijrahDate} with the specified fields.
     * The day must be valid for the year and month, otherwise an exception will be thrown.
     *
     * @param prolepticYear  the Hijrah proleptic-year
     * @param month  the Hijrah month-of-year, from 1 to 12
     * @param dayOfMonth  the Hijrah day-of-month, from 1 to 30
     * @return the date in Hijrah calendar system, not null
     * @throws DateTimeException if the value of any field is out of range,
     *  or if the day-of-month is invalid for the month-year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    public static HijrahDate now(Clock clock) {

    /**
     * Obtains the current {@code HijrahDate} of the Islamic Umm Al-Qura calendar
     * from the specified clock.
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
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    public static HijrahDate now(ZoneId zone) {

    /**
     * Obtains the current {@code HijrahDate} of the Islamic Umm Al-Qura calendar
     * in the specified time-zone.
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
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    public static HijrahDate now() {

    /**
     * Obtains the current {@code HijrahDate} of the Islamic Umm Al-Qura calendar
     * in the default time-zone.
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
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    static HijrahDate ofEpochDay(HijrahChronology chrono, long epochDay) {

    /**
     * Returns a HijrahDate for the chronology and epochDay.
     * @param chrono The Hijrah chronology
     * @param epochDay the epoch day
     * @return a HijrahDate for the epoch day; non-null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    static HijrahDate of(HijrahChronology chrono, int prolepticYear, int monthOfYear, int dayOfMonth) {

    /**
     * Obtains an instance of {@code HijrahDate} from the Hijrah proleptic year,
     * month-of-year and day-of-month.
     *
     * @param prolepticYear  the proleptic year to represent in the Hijrah calendar
     * @param monthOfYear  the month-of-year to represent, from 1 to 12
     * @param dayOfMonth  the day-of-month to represent, from 1 to 30
     * @return the Hijrah date, never null
     * @throws DateTimeException if the value of any field is out of range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private final transient int dayOfMonth;

    /**
     * The day-of-month.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private final transient int prolepticYear;

    /**
     * The proleptic year.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
    private static final long serialVersionUID = -5207853542612002020L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahDate.java
public final class HijrahDate

/**
 * A date in the Hijrah calendar system.
 * <p>
 * This date operates using one of several variants of the
 * {@linkplain HijrahChronology Hijrah calendar}.
 * <p>
 * The Hijrah calendar has a different total of days in a year than
 * Gregorian calendar, and the length of each month is based on the period
 * of a complete revolution of the moon around the earth
 * (as between successive new moons).
 * Refer to the {@link HijrahChronology} for details of supported variants.
 * <p>
 * Each HijrahDate is created bound to a particular HijrahChronology,
 * The same chronology is propagated to each HijrahDate computed from the date.
 * To use a different Hijrah variant, its HijrahChronology can be used
 * to create new HijrahDate instances.
 * Alternatively, the {@link #withVariant} method can be used to convert
 * to a new HijrahChronology.
 *
 * <p>
 * This is a <a href="{@docRoot}/java/lang/doc-files/ValueBased.html">value-based</a>
 * class; use of identity-sensitive operations (including reference equality
 * ({@code ==}), identity hash code, or synchronization) on instances of
 * {@code HijrahDate} may have unpredictable results and should be avoided.
 * The {@code equals} method should be used for comparisons.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
