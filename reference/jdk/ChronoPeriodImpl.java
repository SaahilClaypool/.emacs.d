_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    private void readObject(ObjectInputStream s) throws ObjectStreamException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    protected Object writeReplace() {

    /**
     * Writes the Chronology using a
     * <a href="../../../serialized-form.html#java.time.chrono.Ser">dedicated serialized form</a>.
     * <pre>
     *  out.writeByte(12);  // identifies this as a ChronoPeriodImpl
     *  out.writeUTF(getId());  // the chronology
     *  out.writeInt(years);
     *  out.writeInt(months);
     *  out.writeInt(days);
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    private void validateChrono(TemporalAccessor temporal) {

    /**
     * Validates that the temporal has the correct chronology.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    private long monthRange() {

    /**
     * Calculates the range of months.
     *
     * @return the month range, -1 if not fixed range
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    private ChronoPeriodImpl validateAmount(TemporalAmount amount) {

    /**
     * Obtains an instance of {@code ChronoPeriodImpl} from a temporal amount.
     *
     * @param amount  the temporal amount to convert, not null
     * @return the period, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    ChronoPeriodImpl(Chronology chrono, int years, int months, int days) {

    /**
     * Creates an instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    final int months;

    /**
     * The number of months.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    private final Chronology chrono;

    /**
     * The chronology.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    private static final List<TemporalUnit> SUPPORTED_UNITS =

    /**
     * The set of supported units.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
    private static final long serialVersionUID = 57387258289L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/ChronoPeriodImpl.java
final class ChronoPeriodImpl

/**
 * A period expressed in terms of a standard year-month-day calendar system.
 * <p>
 * This class is used by applications seeking to handle dates in non-ISO calendar systems.
 * For example, the Japanese, Minguo, Thai Buddhist and others.
 *
 * @implSpec
 * This class is immutable nad thread-safe.
 *
 * @since 1.8
 */
