_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    @Override

    /**
     * Returns the string representation of this {@code FileTime}. The string
     * is returned in the <a
     * href="http://www.w3.org/TR/NOTE-datetime">ISO&nbsp;8601</a> format:
     * <pre>
     *     YYYY-MM-DDThh:mm:ss[.s+]Z
     * </pre>
     * where "{@code [.s+]}" represents a dot followed by one of more digits
     * for the decimal fraction of a second. It is only present when the decimal
     * fraction of a second is not zero. For example, {@code
     * FileTime.fromMillis(1234567890000L).toString()} yields {@code
     * "2009-02-13T23:31:30Z"}, and {@code FileTime.fromMillis(1234567890123L).toString()}
     * yields {@code "2009-02-13T23:31:30.123Z"}.
     *
     * <p> A {@code FileTime} is primarily intended to represent the value of a
     * file's time stamp. Where used to represent <i>extreme values</i>, where
     * the year is less than "{@code 0001}" or greater than "{@code 9999}" then
     * this method deviates from ISO 8601 in the same manner as the
     * <a href="http://www.w3.org/TR/xmlschema-2/#deviantformats">XML Schema
     * language</a>. That is, the year may be expanded to more than four digits
     * and may be negative-signed. If more than four digits then leading zeros
     * are not present. The year before "{@code 0001}" is "{@code -0001}".
     *
     * @return  the string representation of this file time
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    @Override

    /**
     * Compares the value of two {@code FileTime} objects for order.
     *
     * @param   other
     *          the other {@code FileTime} to be compared
     *
     * @return  {@code 0} if this {@code FileTime} is equal to {@code other}, a
     *          value less than 0 if this {@code FileTime} represents a time
     *          that is before {@code other}, and a value greater than 0 if this
     *          {@code FileTime} represents a time that is after {@code other}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    @Override

    /**
     * Computes a hash code for this file time.
     *
     * <p> The hash code is based upon the value represented, and satisfies the
     * general contract of the {@link Object#hashCode} method.
     *
     * @return  the hash-code value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    @Override

    /**
     * Tests this {@code FileTime} for equality with the given object.
     *
     * <p> The result is {@code true} if and only if the argument is not {@code
     * null} and is a {@code FileTime} that represents the same time. This
     * method satisfies the general contract of the {@code Object.equals} method.
     *
     * @param   obj
     *          the object to compare with
     *
     * @return  {@code true} if, and only if, the given object is a {@code
     *          FileTime} that represents the same time
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    public Instant toInstant() {

    /**
     * Converts this {@code FileTime} object to an {@code Instant}.
     *
     * <p> The conversion creates an {@code Instant} that represents the
     * same point on the time-line as this {@code FileTime}.
     *
     * <p> {@code FileTime} can store points on the time-line further in the
     * future and further in the past than {@code Instant}. Conversion
     * from such further time points saturates to {@link Instant#MIN} if
     * earlier than {@code Instant.MIN} or {@link Instant#MAX} if later
     * than {@code Instant.MAX}.
     *
     * @return  an instant representing the same point on the time-line as
     *          this {@code FileTime} object
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    private static final long HOURS_PER_DAY      = 24L;

    /**
     * Time unit constants for conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    public long toMillis() {

    /**
     * Returns the value in milliseconds.
     *
     * <p> Conversion from a coarser granularity that would numerically overflow
     * saturate to {@code Long.MIN_VALUE} if negative or {@code Long.MAX_VALUE}
     * if positive.
     *
     * @return  the value in milliseconds, since the epoch (1970-01-01T00:00:00Z)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    public long to(TimeUnit unit) {

    /**
     * Returns the value at the given unit of granularity.
     *
     * <p> Conversion from a coarser granularity that would numerically overflow
     * saturate to {@code Long.MIN_VALUE} if negative or {@code Long.MAX_VALUE}
     * if positive.
     *
     * @param   unit
     *          the unit of granularity for the return value
     *
     * @return  value in the given unit of granularity, since the epoch
     *          since the epoch (1970-01-01T00:00:00Z); can be negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    public static FileTime from(Instant instant) {

    /**
     * Returns a {@code FileTime} representing the same point of time value
     * on the time-line as the provided {@code Instant} object.
     *
     * @param   instant
     *          the instant to convert
     * @return  a {@code FileTime} representing the same point on the time-line
     *          as the provided instant
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    public static FileTime fromMillis(long value) {

    /**
     * Returns a {@code FileTime} representing the given value in milliseconds.
     *
     * @param   value
     *          the value, in milliseconds, since the epoch
     *          (1970-01-01T00:00:00Z); can be negative
     *
     * @return  a {@code FileTime} representing the given value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    public static FileTime from(long value, TimeUnit unit) {

    /**
     * Returns a {@code FileTime} representing a value at the given unit of
     * granularity.
     *
     * @param   value
     *          the value since the epoch (1970-01-01T00:00:00Z); can be
     *          negative
     * @param   unit
     *          the unit of granularity to interpret the value
     *
     * @return  a {@code FileTime} representing the given value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    private FileTime(long value, TimeUnit unit, Instant instant) {

    /**
     * Initializes a new instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    private String valueAsString;

    /**
     * The value return by toString (created lazily)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    private Instant instant;

    /**
     * The value as Instant (created lazily, if not from an instant)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    private final long value;

    /**
     * The value since the epoch; can be negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
    private final TimeUnit unit;

    /**
     * The unit of granularity to interpret the value. Null if
     * this {@code FileTime} is converted from an {@code Instant},
     * the {@code value} and {@code unit} pair will not be used
     * in this scenario.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/attribute/FileTime.java
public final class FileTime

/**
 * Represents the value of a file's time stamp attribute. For example, it may
 * represent the time that the file was last
 * {@link BasicFileAttributes#lastModifiedTime() modified},
 * {@link BasicFileAttributes#lastAccessTime() accessed},
 * or {@link BasicFileAttributes#creationTime() created}.
 *
 * <p> Instances of this class are immutable.
 *
 * @since 1.7
 * @see java.nio.file.Files#setLastModifiedTime
 * @see java.nio.file.Files#getLastModifiedTime
 */
