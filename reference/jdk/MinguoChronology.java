_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    @Override

    /**
     * Checks if the specified year is a leap year.
     * <p>
     * Minguo leap years occur exactly in line with ISO leap years.
     * This method does not validate the year passed in, and only has a
     * well-defined result for years in the supported range.
     *
     * @param prolepticYear  the proleptic-year to check, not validated for range
     * @return true if the year is a leap year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    @Override  // override with covariant return type

    /**
     * Obtains a local date in the Minguo calendar system from the epoch-day.
     *
     * @param epochDay  the epoch day
     * @return the Minguo local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    @Override

    /**
     * Obtains a local date in Minguo calendar system from the
     * proleptic-year and day-of-year fields.
     *
     * @param prolepticYear  the proleptic-year
     * @param dayOfYear  the day-of-year
     * @return the Minguo local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    @Override

    /**
     * Obtains a local date in Minguo calendar system from the
     * era, year-of-era and day-of-year fields.
     *
     * @param era  the Minguo era, not null
     * @param yearOfEra  the year-of-era
     * @param dayOfYear  the day-of-year
     * @return the Minguo local date, not null
     * @throws DateTimeException if unable to create the date
     * @throws ClassCastException if the {@code era} is not a {@code MinguoEra}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    @Override

    /**
     * Obtains a local date in Minguo calendar system from the
     * proleptic-year, month-of-year and day-of-month fields.
     *
     * @param prolepticYear  the proleptic-year
     * @param month  the month-of-year
     * @param dayOfMonth  the day-of-month
     * @return the Minguo local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    @Override

    /**
     * Obtains a local date in Minguo calendar system from the
     * era, year-of-era, month-of-year and day-of-month fields.
     *
     * @param era  the Minguo era, not null
     * @param yearOfEra  the year-of-era
     * @param month  the month-of-year
     * @param dayOfMonth  the day-of-month
     * @return the Minguo local date, not null
     * @throws DateTimeException if unable to create the date
     * @throws ClassCastException if the {@code era} is not a {@code MinguoEra}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    @Override

    /**
     * Gets the calendar type of the underlying calendar system - 'roc'.
     * <p>
     * The calendar type is an identifier defined by the
     * <em>Unicode Locale Data Markup Language (LDML)</em> specification.
     * It can be used to lookup the {@code Chronology} using {@link Chronology#of(String)}.
     * It can also be used as part of a locale, accessible via
     * {@link Locale#getUnicodeLocaleType(String)} with the key 'ca'.
     *
     * @return the calendar system type - 'roc'
     * @see #getId()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    @Override

    /**
     * Gets the ID of the chronology - 'Minguo'.
     * <p>
     * The ID uniquely identifies the {@code Chronology}.
     * It can be used to lookup the {@code Chronology} using {@link Chronology#of(String)}.
     *
     * @return the chronology ID - 'Minguo'
     * @see #getCalendarType()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    private MinguoChronology() {

    /**
     * Restricted constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    private static final long serialVersionUID = 1039765215346859963L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
    public static final MinguoChronology INSTANCE = new MinguoChronology();

    /**
     * Singleton instance for the Minguo chronology.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/MinguoChronology.java
public final class MinguoChronology extends AbstractChronology implements Serializable {

/**
 * The Minguo calendar system.
 * <p>
 * This chronology defines the rules of the Minguo calendar system.
 * This calendar system is primarily used in the Republic of China, often known as Taiwan.
 * Dates are aligned such that {@code 0001-01-01 (Minguo)} is {@code 1912-01-01 (ISO)}.
 * <p>
 * The fields are defined as follows:
 * <ul>
 * <li>era - There are two eras, the current 'Republic' (ERA_ROC) and the previous era (ERA_BEFORE_ROC).
 * <li>year-of-era - The year-of-era for the current era increases uniformly from the epoch at year one.
 *  For the previous era the year increases from one as time goes backwards.
 *  The value for the current era is equal to the ISO proleptic-year minus 1911.
 * <li>proleptic-year - The proleptic year is the same as the year-of-era for the
 *  current era. For the previous era, years have zero, then negative values.
 *  The value is equal to the ISO proleptic-year minus 1911.
 * <li>month-of-year - The Minguo month-of-year exactly matches ISO.
 * <li>day-of-month - The Minguo day-of-month exactly matches ISO.
 * <li>day-of-year - The Minguo day-of-year exactly matches ISO.
 * <li>leap-year - The Minguo leap-year pattern exactly matches ISO, such that the two calendars
 *  are never out of step.
 * </ul>
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
