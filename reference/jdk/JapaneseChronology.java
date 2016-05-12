_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    @Override

    /**
     * Returns the calendar system era object from the given numeric value.
     *
     * See the description of each Era for the numeric values of:
     * {@link JapaneseEra#HEISEI}, {@link JapaneseEra#SHOWA},{@link JapaneseEra#TAISHO},
     * {@link JapaneseEra#MEIJI}), only Meiji and later eras are supported.
     *
     * @param eraValue  the era value
     * @return the Japanese {@code Era} for the given numeric era value
     * @throws DateTimeException if {@code eraValue} is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    @Override

    /**
     * Checks if the specified year is a leap year.
     * <p>
     * Japanese calendar leap years occur exactly in line with ISO leap years.
     * This method does not validate the year passed in, and only has a
     * well-defined result for years in the supported range.
     *
     * @param prolepticYear  the proleptic-year to check, not validated for range
     * @return true if the year is a leap year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    @Override  // override with covariant return type

    /**
     * Obtains a local date in the Japanese calendar system from the epoch-day.
     *
     * @param epochDay  the epoch day
     * @return the Japanese local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    @Override

    /**
     * Obtains a local date in Japanese calendar system from the
     * proleptic-year and day-of-year fields.
     * <p>
     * The day-of-year in this factory is expressed relative to the start of the proleptic year.
     * The Japanese proleptic year and day-of-year are the same as those in the ISO calendar system.
     * They are not reset when the era changes.
     *
     * @param prolepticYear  the proleptic-year
     * @param dayOfYear  the day-of-year
     * @return the Japanese local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    @Override

    /**
     * Obtains a local date in Japanese calendar system from the
     * era, year-of-era and day-of-year fields.
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
     * @param yearOfEra  the year-of-era
     * @param dayOfYear  the day-of-year
     * @return the Japanese local date, not null
     * @throws DateTimeException if unable to create the date
     * @throws ClassCastException if the {@code era} is not a {@code JapaneseEra}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    @Override

    /**
     * Obtains a local date in Japanese calendar system from the
     * proleptic-year, month-of-year and day-of-month fields.
     * <p>
     * The Japanese proleptic year, month and day-of-month are the same as those
     * in the ISO calendar system. They are not reset when the era changes.
     *
     * @param prolepticYear  the proleptic-year
     * @param month  the month-of-year
     * @param dayOfMonth  the day-of-month
     * @return the Japanese local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    @Override

    /**
     * Obtains a local date in Japanese calendar system from the
     * era, year-of-era, month-of-year and day-of-month fields.
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
     * @param yearOfEra  the year-of-era
     * @param month  the month-of-year
     * @param dayOfMonth  the day-of-month
     * @return the Japanese local date, not null
     * @throws DateTimeException if unable to create the date
     * @throws ClassCastException if the {@code era} is not a {@code JapaneseEra}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    @Override

    /**
     * Gets the calendar type of the underlying calendar system - 'japanese'.
     * <p>
     * The calendar type is an identifier defined by the
     * <em>Unicode Locale Data Markup Language (LDML)</em> specification.
     * It can be used to lookup the {@code Chronology} using {@link Chronology#of(String)}.
     * It can also be used as part of a locale, accessible via
     * {@link Locale#getUnicodeLocaleType(String)} with the key 'ca'.
     *
     * @return the calendar system type - 'japanese'
     * @see #getId()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    @Override

    /**
     * Gets the ID of the chronology - 'Japanese'.
     * <p>
     * The ID uniquely identifies the {@code Chronology}.
     * It can be used to lookup the {@code Chronology} using {@link Chronology#of(String)}.
     *
     * @return the chronology ID - 'Japanese'
     * @see #getCalendarType()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    private JapaneseChronology() {

    /**
     * Restricted constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    private static final long serialVersionUID = 459996390165777884L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
    public static final JapaneseChronology INSTANCE = new JapaneseChronology();

    /**
     * Singleton instance for Japanese chronology.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseChronology.java
public final class JapaneseChronology extends AbstractChronology implements Serializable {

/**
 * The Japanese Imperial calendar system.
 * <p>
 * This chronology defines the rules of the Japanese Imperial calendar system.
 * This calendar system is primarily used in Japan.
 * The Japanese Imperial calendar system is the same as the ISO calendar system
 * apart from the era-based year numbering.
 * <p>
 * Japan introduced the Gregorian calendar starting with Meiji 6.
 * Only Meiji and later eras are supported;
 * dates before Meiji 6, January 1 are not supported.
 * <p>
 * The supported {@code ChronoField} instances are:
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
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
