_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    @Override

    /**
     * Returns a string describing this object.
     *
     * @return a string for debugging, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    @Override

    /**
     * Returns a suitable hash code.
     *
     * @return the hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    @Override

    /**
     * Checks if this object equals another.
     * <p>
     * The entire state of the object is compared.
     *
     * @param other  the other object to compare to, null returns false
     * @return true if equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    @Override

    /**
     * Compares this transition to another based on the transition instant.
     * <p>
     * This compares the instants of each transition.
     * The offsets are ignored, making this order inconsistent with equals.
     *
     * @param transition  the transition to compare to, not null
     * @return the comparator value, negative if less, positive if greater
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    List<ZoneOffset> getValidOffsets() {

    /**
     * Gets the valid offsets during this transition.
     * <p>
     * A gap will return an empty list, while an overlap will return both offsets.
     *
     * @return the list of valid offsets
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public boolean isValidOffset(ZoneOffset offset) {

    /**
     * Checks if the specified offset is valid during this transition.
     * <p>
     * This checks to see if the given offset will be valid at some point in the transition.
     * A gap will always return false.
     * An overlap will return true if the offset is either the before or after offset.
     *
     * @param offset  the offset to check, null returns false
     * @return true if the offset is valid during the transition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public boolean isOverlap() {

    /**
     * Does this transition represent an overlap in the local time-line.
     * <p>
     * Overlaps occur where there are local date-times that exist twice.
     * An example would be when the offset changes from {@code +02:00} to {@code +01:00}.
     * This might be described as 'the clocks will move back one hour tonight at 2am'.
     *
     * @return true if this transition is an overlap, false if it is a gap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public boolean isGap() {

    /**
     * Does this transition represent a gap in the local time-line.
     * <p>
     * Gaps occur where there are local date-times that simply do not exist.
     * An example would be when the offset changes from {@code +01:00} to {@code +02:00}.
     * This might be described as 'the clocks will move forward one hour tonight at 1am'.
     *
     * @return true if this transition is a gap, false if it is an overlap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    private int getDurationSeconds() {

    /**
     * Gets the duration of the transition in seconds.
     *
     * @return the duration in seconds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public Duration getDuration() {

    /**
     * Gets the duration of the transition.
     * <p>
     * In most cases, the transition duration is one hour, however this is not always the case.
     * The duration will be positive for a gap and negative for an overlap.
     * Time-zones are second-based, so the nanosecond part of the duration will be zero.
     *
     * @return the duration of the transition, positive for gaps, negative for overlaps
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public ZoneOffset getOffsetAfter() {

    /**
     * Gets the offset after the transition.
     * <p>
     * This is the offset in use on and after the instant of the transition.
     *
     * @return the offset after the transition, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public ZoneOffset getOffsetBefore() {

    /**
     * Gets the offset before the transition.
     * <p>
     * This is the offset in use before the instant of the transition.
     *
     * @return the offset before the transition, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public LocalDateTime getDateTimeAfter() {

    /**
     * Gets the local transition date-time, as would be expressed with the 'after' offset.
     * <p>
     * This is the first date-time after the discontinuity, when the new offset applies.
     * <p>
     * The combination of the 'before' date-time and offset represents the same instant
     * as the 'after' date-time and offset.
     *
     * @return the transition date-time expressed with the after offset, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public LocalDateTime getDateTimeBefore() {

    /**
     * Gets the local transition date-time, as would be expressed with the 'before' offset.
     * <p>
     * This is the date-time where the discontinuity begins expressed with the 'before' offset.
     * At this instant, the 'after' offset is actually used, therefore the combination of this
     * date-time and the 'before' offset will never occur.
     * <p>
     * The combination of the 'before' date-time and offset represents the same instant
     * as the 'after' date-time and offset.
     *
     * @return the transition date-time expressed with the before offset, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public long toEpochSecond() {

    /**
     * Gets the transition instant as an epoch second.
     *
     * @return the transition epoch second
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public Instant getInstant() {

    /**
     * Gets the transition instant.
     * <p>
     * This is the instant of the discontinuity, which is defined as the first
     * instant that the 'after' offset applies.
     * <p>
     * The methods {@link #getInstant()}, {@link #getDateTimeBefore()} and {@link #getDateTimeAfter()}
     * all represent the same instant.
     *
     * @return the transition instant, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    static ZoneOffsetTransition readExternal(DataInput in) throws IOException {

    /**
     * Reads the state from the stream.
     *
     * @param in  the input stream, not null
     * @return the created object, not null
     * @throws IOException if an error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    void writeExternal(DataOutput out) throws IOException {

    /**
     * Writes the state to the stream.
     *
     * @param out  the output stream, not null
     * @throws IOException if an error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    private Object writeReplace() {

    /**
     * Writes the object using a
     * <a href="../../../serialized-form.html#java.time.zone.Ser">dedicated serialized form</a>.
     * @serialData
     * Refer to the serialized form of
     * <a href="../../../serialized-form.html#java.time.zone.ZoneRules">ZoneRules.writeReplace</a>
     * for the encoding of epoch seconds and offsets.
     * <pre style="font-size:1.0em">{@code
     *
     *   out.writeByte(2);                // identifies a ZoneOffsetTransition
     *   out.writeEpochSec(toEpochSecond);
     *   out.writeOffset(offsetBefore);
     *   out.writeOffset(offsetAfter);
     * }
     * </pre>
     * @return the replacing object, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    ZoneOffsetTransition(long epochSecond, ZoneOffset offsetBefore, ZoneOffset offsetAfter) {

    /**
     * Creates an instance from epoch-second and offsets.
     *
     * @param epochSecond  the transition epoch-second
     * @param offsetBefore  the offset before the transition, not null
     * @param offsetAfter  the offset at and after the transition, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    ZoneOffsetTransition(LocalDateTime transition, ZoneOffset offsetBefore, ZoneOffset offsetAfter) {

    /**
     * Creates an instance defining a transition between two offsets.
     *
     * @param transition  the transition date-time with the offset before the transition, not null
     * @param offsetBefore  the offset before the transition, not null
     * @param offsetAfter  the offset at and after the transition, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    public static ZoneOffsetTransition of(LocalDateTime transition, ZoneOffset offsetBefore, ZoneOffset offsetAfter) {

    /**
     * Obtains an instance defining a transition between two offsets.
     * <p>
     * Applications should normally obtain an instance from {@link ZoneRules}.
     * This factory is only intended for use when creating {@link ZoneRules}.
     *
     * @param transition  the transition date-time at the transition, which never
     *  actually occurs, expressed local to the before offset, not null
     * @param offsetBefore  the offset before the transition, not null
     * @param offsetAfter  the offset at and after the transition, not null
     * @return the transition, not null
     * @throws IllegalArgumentException if {@code offsetBefore} and {@code offsetAfter}
     *         are equal, or {@code transition.getNano()} returns non-zero value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    private final ZoneOffset offsetBefore;

    /**
     * The offset before transition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
    private static final long serialVersionUID = -6946044323557704546L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/ZoneOffsetTransition.java
public final class ZoneOffsetTransition

/**
 * A transition between two offsets caused by a discontinuity in the local time-line.
 * <p>
 * A transition between two offsets is normally the result of a daylight savings cutover.
 * The discontinuity is normally a gap in spring and an overlap in autumn.
 * {@code ZoneOffsetTransition} models the transition between the two offsets.
 * <p>
 * Gaps occur where there are local date-times that simply do not exist.
 * An example would be when the offset changes from {@code +03:00} to {@code +04:00}.
 * This might be described as 'the clocks will move forward one hour tonight at 1am'.
 * <p>
 * Overlaps occur where there are local date-times that exist twice.
 * An example would be when the offset changes from {@code +04:00} to {@code +03:00}.
 * This might be described as 'the clocks will move back one hour tonight at 2am'.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
