_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    @SuppressWarnings("unchecked")

    /**
     * Returns a copy of this date with the specified number of days subtracted.
     * <p>
     * This subtracts the specified period in days to the date.
     * <p>
     * The default implementation uses {@link #plusDays(long)}.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param daysToSubtract  the days to subtract, may be negative
     * @return a date based on this one with the days subtracted, not null
     * @throws DateTimeException if the result exceeds the supported date range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    @SuppressWarnings("unchecked")

    /**
     * Returns a copy of this date with the specified number of weeks subtracted.
     * <p>
     * This subtracts the specified period in weeks to the date.
     * In some cases, subtracting weeks can cause the resulting date to become invalid.
     * If this occurs, then other fields will be adjusted to ensure that the result is valid.
     * <p>
     * The default implementation uses {@link #plusWeeks(long)}.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param weeksToSubtract  the weeks to subtract, may be negative
     * @return a date based on this one with the weeks subtracted, not null
     * @throws DateTimeException if the result exceeds the supported date range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    @SuppressWarnings("unchecked")

    /**
     * Returns a copy of this date with the specified number of months subtracted.
     * <p>
     * This subtracts the specified period in months to the date.
     * In some cases, subtracting months can cause the resulting date to become invalid.
     * If this occurs, then other fields, typically the day-of-month, will be adjusted to ensure
     * that the result is valid. Typically this will select the last valid day of the month.
     * <p>
     * The default implementation uses {@link #plusMonths(long)}.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param monthsToSubtract  the months to subtract, may be negative
     * @return a date based on this one with the months subtracted, not null
     * @throws DateTimeException if the result exceeds the supported date range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    @SuppressWarnings("unchecked")

    /**
     * Returns a copy of this date with the specified number of years subtracted.
     * <p>
     * This subtracts the specified period in years to the date.
     * In some cases, subtracting years can cause the resulting date to become invalid.
     * If this occurs, then other fields, typically the day-of-month, will be adjusted to ensure
     * that the result is valid. Typically this will select the last valid day of the month.
     * <p>
     * The default implementation uses {@link #plusYears(long)}.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param yearsToSubtract  the years to subtract, may be negative
     * @return a date based on this one with the years subtracted, not null
     * @throws DateTimeException if the result exceeds the supported date range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    abstract D plusDays(long daysToAdd);

    /**
     * Returns a copy of this date with the specified number of days added.
     * <p>
     * This adds the specified period in days to the date.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param daysToAdd  the days to add, may be negative
     * @return a date based on this one with the days added, not null
     * @throws DateTimeException if the result exceeds the supported date range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    D plusWeeks(long weeksToAdd) {

    /**
     * Returns a copy of this date with the specified number of weeks added.
     * <p>
     * This adds the specified period in weeks to the date.
     * In some cases, adding weeks can cause the resulting date to become invalid.
     * If this occurs, then other fields will be adjusted to ensure that the result is valid.
     * <p>
     * The default implementation uses {@link #plusDays(long)} using a 7 day week.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param weeksToAdd  the weeks to add, may be negative
     * @return a date based on this one with the weeks added, not null
     * @throws DateTimeException if the result exceeds the supported date range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    abstract D plusMonths(long monthsToAdd);

    /**
     * Returns a copy of this date with the specified number of months added.
     * <p>
     * This adds the specified period in months to the date.
     * In some cases, adding months can cause the resulting date to become invalid.
     * If this occurs, then other fields, typically the day-of-month, will be adjusted to ensure
     * that the result is valid. Typically this will select the last valid day of the month.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param monthsToAdd  the months to add, may be negative
     * @return a date based on this one with the months added, not null
     * @throws DateTimeException if the result exceeds the supported date range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    abstract D plusYears(long yearsToAdd);

    /**
     * Returns a copy of this date with the specified number of years added.
     * <p>
     * This adds the specified period in years to the date.
     * In some cases, adding years can cause the resulting date to become invalid.
     * If this occurs, then other fields, typically the day-of-month, will be adjusted to ensure
     * that the result is valid. Typically this will select the last valid day of the month.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param yearsToAdd  the years to add, may be negative
     * @return a date based on this one with the years added, not null
     * @throws DateTimeException if the result exceeds the supported date range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    ChronoLocalDateImpl() {

    /**
     * Creates an instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    static <D extends ChronoLocalDate> D ensureValid(Chronology chrono, Temporal temporal) {

    /**
     * Casts the {@code Temporal} to {@code ChronoLocalDate} ensuring it bas the specified chronology.
     *
     * @param chrono  the chronology to check for, not null
     * @param temporal  a date-time to cast, not null
     * @return the date-time checked and cast to {@code ChronoLocalDate}, not null
     * @throws ClassCastException if the date-time cannot be cast to ChronoLocalDate
     *  or the chronology is not equal this Chronology
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
    private static final long serialVersionUID = 6282433883239719096L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateImpl.java
abstract class ChronoLocalDateImpl<D extends ChronoLocalDate>

/**
 * A date expressed in terms of a standard year-month-day calendar system.
 * <p>
 * This class is used by applications seeking to handle dates in non-ISO calendar systems.
 * For example, the Japanese, Minguo, Thai Buddhist and others.
 * <p>
 * {@code ChronoLocalDate} is built on the generic concepts of year, month and day.
 * The calendar system, represented by a {@link java.time.chrono.Chronology}, expresses the relationship between
 * the fields and this class allows the resulting date to be manipulated.
 * <p>
 * Note that not all calendar systems are suitable for use with this class.
 * For example, the Mayan calendar uses a system that bears no relation to years, months and days.
 * <p>
 * The API design encourages the use of {@code LocalDate} for the majority of the application.
 * This includes code to read and write from a persistent data store, such as a database,
 * and to send dates and times across a network. The {@code ChronoLocalDate} instance is then used
 * at the user interface level to deal with localized input/output.
 *
 * <P>Example: </p>
 * <pre>
 *        System.out.printf("Example()%n");
 *        // Enumerate the list of available calendars and print today for each
 *        Set&lt;Chronology&gt; chronos = Chronology.getAvailableChronologies();
 *        for (Chronology chrono : chronos) {
 *            ChronoLocalDate date = chrono.dateNow();
 *            System.out.printf("   %20s: %s%n", chrono.getID(), date.toString());
 *        }
 *
 *        // Print the Hijrah date and calendar
 *        ChronoLocalDate date = Chronology.of("Hijrah").dateNow();
 *        int day = date.get(ChronoField.DAY_OF_MONTH);
 *        int dow = date.get(ChronoField.DAY_OF_WEEK);
 *        int month = date.get(ChronoField.MONTH_OF_YEAR);
 *        int year = date.get(ChronoField.YEAR);
 *        System.out.printf("  Today is %s %s %d-%s-%d%n", date.getChronology().getID(),
 *                dow, day, month, year);

 *        // Print today's date and the last day of the year
 *        ChronoLocalDate now1 = Chronology.of("Hijrah").dateNow();
 *        ChronoLocalDate first = now1.with(ChronoField.DAY_OF_MONTH, 1)
 *                .with(ChronoField.MONTH_OF_YEAR, 1);
 *        ChronoLocalDate last = first.plus(1, ChronoUnit.YEARS)
 *                .minus(1, ChronoUnit.DAYS);
 *        System.out.printf("  Today is %s: start: %s; end: %s%n", last.getChronology().getID(),
 *                first, last);
 * </pre>
 *
 * <h3>Adding Calendars</h3>
 * <p> The set of calendars is extensible by defining a subclass of {@link ChronoLocalDate}
 * to represent a date instance and an implementation of {@code Chronology}
 * to be the factory for the ChronoLocalDate subclass.
 * </p>
 * <p> To permit the discovery of the additional calendar types the implementation of
 * {@code Chronology} must be registered as a Service implementing the {@code Chronology} interface
 * in the {@code META-INF/Services} file as per the specification of {@link java.util.ServiceLoader}.
 * The subclass must function according to the {@code Chronology} class description and must provide its
 * {@link java.time.chrono.Chronology#getId() chronlogy ID} and {@link Chronology#getCalendarType() calendar type}. </p>
 *
 * @implSpec
 * This abstract class must be implemented with care to ensure other classes operate correctly.
 * All implementations that can be instantiated must be final, immutable and thread-safe.
 * Subclasses should be Serializable wherever possible.
 *
 * @param <D> the ChronoLocalDate of this date-time
 * @since 1.8
 */
