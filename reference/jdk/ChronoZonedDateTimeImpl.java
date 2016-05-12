_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    private Object writeReplace() {

    /**
     * Writes the ChronoZonedDateTime using a
     * <a href="../../../serialized-form.html#java.time.chrono.Ser">dedicated serialized form</a>.
     * @serialData
     * <pre>
     *  out.writeByte(3);                  // identifies a ChronoZonedDateTime
     *  out.writeObject(toLocalDateTime());
     *  out.writeObject(getOffset());
     *  out.writeObject(getZone());
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    }

        return ChronoZonedDateTimeImpl.ensureValid(getChronology(), unit.addTo(this, amountToAdd));   /// TODO: Generics replacement Risk!
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    private ChronoZonedDateTimeImpl(ChronoLocalDateTimeImpl<D> dateTime, ZoneOffset offset, ZoneId zone) {

    /**
     * Constructor.
     *
     * @param dateTime  the date-time, not null
     * @param offset  the zone offset, not null
     * @param zone  the zone ID, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    static <R extends ChronoLocalDate> ChronoZonedDateTimeImpl<R> ensureValid(Chronology chrono, Temporal temporal) {

    /**
     * Casts the {@code Temporal} to {@code ChronoZonedDateTimeImpl} ensuring it bas the specified chronology.
     *
     * @param chrono  the chronology to check for, not null
     * @param temporal  a date-time to cast, not null
     * @return the date-time checked and cast to {@code ChronoZonedDateTimeImpl}, not null
     * @throws ClassCastException if the date-time cannot be cast to ChronoZonedDateTimeImpl
     *  or the chronology is not equal this Chronology
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    @SuppressWarnings("unchecked")

    /**
     * Obtains an instance from an {@code Instant}.
     *
     * @param instant  the instant to create the date-time from, not null
     * @param zone  the time-zone to use, validated not null
     * @return the zoned date-time, validated not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    static ChronoZonedDateTimeImpl<?> ofInstant(Chronology chrono, Instant instant, ZoneId zone) {

    /**
     * Obtains an instance from an instant using the specified time-zone.
     *
     * @param chrono  the chronology, not null
     * @param instant  the instant, not null
     * @param zone  the zone identifier, not null
     * @return the zoned date-time, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    static <R extends ChronoLocalDate> ChronoZonedDateTime<R> ofBest(
            ChronoLocalDateTimeImpl<R> localDateTime, ZoneId zone, ZoneOffset preferredOffset) {

    /**
     * Obtains an instance from a local date-time using the preferred offset if possible.
     *
     * @param localDateTime  the local date-time, not null
     * @param zone  the zone identifier, not null
     * @param preferredOffset  the zone offset, null if no preference
     * @return the zoned date-time, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    private final transient ZoneId zone;

    /**
     * The zone ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    private final transient ChronoLocalDateTimeImpl<D> dateTime;

    /**
     * The local date-time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
    private static final long serialVersionUID = -5261813987200935591L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoZonedDateTimeImpl.java
final class ChronoZonedDateTimeImpl<D extends ChronoLocalDate>

/**
 * A date-time with a time-zone in the calendar neutral API.
 * <p>
 * {@code ZoneChronoDateTime} is an immutable representation of a date-time with a time-zone.
 * This class stores all date and time fields, to a precision of nanoseconds,
 * as well as a time-zone and zone offset.
 * <p>
 * The purpose of storing the time-zone is to distinguish the ambiguous case where
 * the local time-line overlaps, typically as a result of the end of daylight time.
 * Information about the local-time can be obtained using methods on the time-zone.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @serial Document the delegation of this class in the serialized-form specification.
 * @param <D> the concrete type for the date of this date-time
 * @since 1.8
 */
