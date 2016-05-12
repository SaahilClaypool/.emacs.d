_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CRC32.java
    public long getValue() {

    /**
     * Returns CRC-32 value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CRC32.java
    public void reset() {

    /**
     * Resets CRC-32 to initial value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CRC32.java
    public void update(ByteBuffer buffer) {

    /**
     * Updates the checksum with the bytes from the specified buffer.
     *
     * The checksum is updated using
     * buffer.{@link java.nio.Buffer#remaining() remaining()}
     * bytes starting at
     * buffer.{@link java.nio.Buffer#position() position()}
     * Upon return, the buffer's position will
     * be updated to its limit; its limit will not have been changed.
     *
     * @param buffer the ByteBuffer to update the checksum with
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CRC32.java
    public void update(byte[] b) {

    /**
     * Updates the CRC-32 checksum with the specified array of bytes.
     *
     * @param b the array of bytes to update the checksum with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CRC32.java
    public void update(byte[] b, int off, int len) {

    /**
     * Updates the CRC-32 checksum with the specified array of bytes.
     *
     * @throws  ArrayIndexOutOfBoundsException
     *          if {@code off} is negative, or {@code len} is negative,
     *          or {@code off+len} is greater than the length of the
     *          array {@code b}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CRC32.java
    public void update(int b) {

    /**
     * Updates the CRC-32 checksum with the specified byte (the low
     * eight bits of the argument b).
     *
     * @param b the byte to update the checksum with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CRC32.java
    public CRC32() {

    /**
     * Creates a new CRC32 object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CRC32.java
public

/**
 * A class that can be used to compute the CRC-32 of a data stream.
 *
 * <p> Passing a {@code null} argument to a method in this class will cause
 * a {@link NullPointerException} to be thrown.
 *
 * @see         Checksum
 * @author      David Connelly
 */
