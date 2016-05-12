_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    private Object writeReplace() {

    /**
     * Writes the ChronoLocalDateTime using a
     * <a href="../../../serialized-form.html#java.time.chrono.Ser">dedicated serialized form</a>.
     * @serialData
     * <pre>
     *  out.writeByte(2);              // identifies a ChronoLocalDateTime
     *  out.writeObject(toLocalDate());
     *  out.witeObject(toLocalTime());
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    private ChronoLocalDateTimeImpl<D> with(Temporal newDate, LocalTime newTime) {

    /**
     * Returns a copy of this date-time with the new date and time, checking
     * to see if a new object is in fact required.
     *
     * @param newDate  the date of the new date-time, not null
     * @param newTime  the time of the new date-time, not null
     * @return the date-time, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    private ChronoLocalDateTimeImpl(D date, LocalTime time) {

    /**
     * Constructor.
     *
     * @param date  the date part of the date-time, not null
     * @param time  the time part of the date-time, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    static <R extends ChronoLocalDate> ChronoLocalDateTimeImpl<R> ensureValid(Chronology chrono, Temporal temporal) {

    /**
     * Casts the {@code Temporal} to {@code ChronoLocalDateTime} ensuring it bas the specified chronology.
     *
     * @param chrono  the chronology to check for, not null
     * @param temporal   a date-time to cast, not null
     * @return the date-time checked and cast to {@code ChronoLocalDateTime}, not null
     * @throws ClassCastException if the date-time cannot be cast to ChronoLocalDateTimeImpl
     *  or the chronology is not equal this Chronology
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    static <R extends ChronoLocalDate> ChronoLocalDateTimeImpl<R> of(R date, LocalTime time) {

    /**
     * Obtains an instance of {@code ChronoLocalDateTime} from a date and time.
     *
     * @param date  the local date, not null
     * @param time  the local time, not null
     * @return the local date-time, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    private final transient D date;

    /**
     * The date part.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    static final long NANOS_PER_DAY = NANOS_PER_HOUR * HOURS_PER_DAY;

    /**
     * Nanos per day.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    static final long NANOS_PER_MINUTE = NANOS_PER_SECOND * SECONDS_PER_MINUTE;

    /**
     * Nanos per minute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    static final long MICROS_PER_DAY = SECONDS_PER_DAY * 1000_000L;

    /**
     * Microseconds per day.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    static final int SECONDS_PER_DAY = SECONDS_PER_HOUR * HOURS_PER_DAY;

    /**
     * Seconds per day.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    static final int SECONDS_PER_MINUTE = 60;

    /**
     * Seconds per minute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    static final int MINUTES_PER_HOUR = 60;

    /**
     * Minutes per hour.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
    private static final long serialVersionUID = 4556003607393004514L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoLocalDateTimeImpl.java
final class ChronoLocalDateTimeImpl<D extends ChronoLocalDate>

/**
 * A date-time without a time-zone for the calendar neutral API.
 * <p>
 * {@code ChronoLocalDateTime} is an immutable date-time object that represents a date-time, often
 * viewed as year-month-day-hour-minute-second. This object can also access other
 * fields such as day-of-year, day-of-week and week-of-year.
 * <p>
 * This class stores all date and time fields, to a precision of nanoseconds.
 * It does not store or represent a time-zone. For example, the value
 * "2nd October 2007 at 13:45.30.123456789" can be stored in an {@code ChronoLocalDateTime}.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 * @serial
 * @param <D> the concrete type for the date of this date-time
 * @since 1.8
 */
