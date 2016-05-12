_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    @Override

    /**
     * Writes the Chronology using a
     * <a href="../../../serialized-form.html#java.time.chrono.Ser">dedicated serialized form</a>.
     * @serialData
     * <pre>
     *  out.writeByte(1);     // identifies a Chronology
     *  out.writeUTF(getId());
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    @Override

    /**
     * Checks if the specified year is a leap year.
     * <p>
     * Thai Buddhist leap years occur exactly in line with ISO leap years.
     * This method does not validate the year passed in, and only has a
     * well-defined result for years in the supported range.
     *
     * @param prolepticYear  the proleptic-year to check, not validated for range
     * @return true if the year is a leap year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    @Override  // override with covariant return type

    /**
     * Obtains a local date in the Thai Buddhist calendar system from the epoch-day.
     *
     * @param epochDay  the epoch day
     * @return the Thai Buddhist local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    @Override

    /**
     * Obtains a local date in Thai Buddhist calendar system from the
     * proleptic-year and day-of-year fields.
     *
     * @param prolepticYear  the proleptic-year
     * @param dayOfYear  the day-of-year
     * @return the Thai Buddhist local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    @Override

    /**
     * Obtains a local date in Thai Buddhist calendar system from the
     * era, year-of-era and day-of-year fields.
     *
     * @param era  the Thai Buddhist era, not null
     * @param yearOfEra  the year-of-era
     * @param dayOfYear  the day-of-year
     * @return the Thai Buddhist local date, not null
     * @throws DateTimeException if unable to create the date
     * @throws ClassCastException if the {@code era} is not a {@code ThaiBuddhistEra}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    @Override

    /**
     * Obtains a local date in Thai Buddhist calendar system from the
     * proleptic-year, month-of-year and day-of-month fields.
     *
     * @param prolepticYear  the proleptic-year
     * @param month  the month-of-year
     * @param dayOfMonth  the day-of-month
     * @return the Thai Buddhist local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    @Override

    /**
     * Obtains a local date in Thai Buddhist calendar system from the
     * era, year-of-era, month-of-year and day-of-month fields.
     *
     * @param era  the Thai Buddhist era, not null
     * @param yearOfEra  the year-of-era
     * @param month  the month-of-year
     * @param dayOfMonth  the day-of-month
     * @return the Thai Buddhist local date, not null
     * @throws DateTimeException if unable to create the date
     * @throws ClassCastException if the {@code era} is not a {@code ThaiBuddhistEra}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    @Override

    /**
     * Gets the calendar type of the underlying calendar system - 'buddhist'.
     * <p>
     * The calendar type is an identifier defined by the
     * <em>Unicode Locale Data Markup Language (LDML)</em> specification.
     * It can be used to lookup the {@code Chronology} using {@link Chronology#of(String)}.
     * It can also be used as part of a locale, accessible via
     * {@link Locale#getUnicodeLocaleType(String)} with the key 'ca'.
     *
     * @return the calendar system type - 'buddhist'
     * @see #getId()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    @Override

    /**
     * Gets the ID of the chronology - 'ThaiBuddhist'.
     * <p>
     * The ID uniquely identifies the {@code Chronology}.
     * It can be used to lookup the {@code Chronology} using {@link Chronology#of(String)}.
     *
     * @return the chronology ID - 'ThaiBuddhist'
     * @see #getCalendarType()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    private ThaiBuddhistChronology() {

    /**
     * Restricted constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    private static final String TARGET_LANGUAGE = "th";

    /**
     * Language that has the era names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    private static final HashMap<String, String[]> ERA_FULL_NAMES = new HashMap<>();

    /**
     * Full names for eras.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    private static final HashMap<String, String[]> ERA_NARROW_NAMES = new HashMap<>();

    /**
     * Narrow names for eras.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    private static final long serialVersionUID = 2775954514031616474L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
    public static final ThaiBuddhistChronology INSTANCE = new ThaiBuddhistChronology();

    /**
     * Singleton instance of the Buddhist chronology.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ThaiBuddhistChronology.java
public final class ThaiBuddhistChronology extends AbstractChronology implements Serializable {

/**
 * The Thai Buddhist calendar system.
 * <p>
 * This chronology defines the rules of the Thai Buddhist calendar system.
 * This calendar system is primarily used in Thailand.
 * Dates are aligned such that {@code 2484-01-01 (Buddhist)} is {@code 1941-01-01 (ISO)}.
 * <p>
 * The fields are defined as follows:
 * <ul>
 * <li>era - There are two eras, the current 'Buddhist' (ERA_BE) and the previous era (ERA_BEFORE_BE).
 * <li>year-of-era - The year-of-era for the current era increases uniformly from the epoch at year one.
 *  For the previous era the year increases from one as time goes backwards.
 *  The value for the current era is equal to the ISO proleptic-year plus 543.
 * <li>proleptic-year - The proleptic year is the same as the year-of-era for the
 *  current era. For the previous era, years have zero, then negative values.
 *  The value is equal to the ISO proleptic-year plus 543.
 * <li>month-of-year - The ThaiBuddhist month-of-year exactly matches ISO.
 * <li>day-of-month - The ThaiBuddhist day-of-month exactly matches ISO.
 * <li>day-of-year - The ThaiBuddhist day-of-year exactly matches ISO.
 * <li>leap-year - The ThaiBuddhist leap-year pattern exactly matches ISO, such that the two calendars
 *  are never out of step.
 * </ul>
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
