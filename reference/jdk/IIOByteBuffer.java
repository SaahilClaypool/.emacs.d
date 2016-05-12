_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/IIOByteBuffer.java
    public void setLength(int length) {

    /**
     * Updates the value that will be returned by subsequent calls
     * to the <code>getLength</code> method.
     *
     * @param length an int containing the new length value.
     *
     * @see #getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/IIOByteBuffer.java
    public int getLength() {

    /**
     * Returns the length of the data of interest within the byte
     * array returned by <code>getData</code>.
     *
     * @return an int length.
     *
     * @see #getData
     * @see #getOffset
     * @see #setLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/IIOByteBuffer.java
    public void setOffset(int offset) {

    /**
     * Updates the value that will be returned by subsequent calls
     * to the <code>getOffset</code> method.
     *
     * @param offset an int containing the new offset value.
     *
     * @see #getOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/IIOByteBuffer.java
    public int getOffset() {

    /**
     * Returns the offset within the byte array returned by
     * <code>getData</code> at which the data of interest start.
     *
     * @return an int offset.
     *
     * @see #getData
     * @see #getLength
     * @see #setOffset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/IIOByteBuffer.java
    public void setData(byte[] data) {

    /**
     * Updates the array reference that will be returned by subsequent calls
     * to the <code>getData</code> method.
     *
     * @param data a byte array reference containing the new data value.
     *
     * @see #getData
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/IIOByteBuffer.java
    public byte[] getData() {

    /**
     * Returns a reference to the byte array.  The returned value should
     * be treated as read-only, and only the portion specified by the
     * values of <code>getOffset</code> and <code>getLength</code> should
     * be used.
     *
     * @return a byte array reference.
     *
     * @see #getOffset
     * @see #getLength
     * @see #setData
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/IIOByteBuffer.java
    public IIOByteBuffer(byte[] data, int offset, int length) {

    /**
     * Constructs an <code>IIOByteBuffer</code> that references a
     * given byte array, offset, and length.
     *
     * @param data a byte array.
     * @param offset an int offset within the array.
     * @param length an int specifying the length of the data of
     * interest within byte array, in bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/stream/IIOByteBuffer.java
public class IIOByteBuffer {

/**
 * A class representing a mutable reference to an array of bytes and
 * an offset and length within that array.  <code>IIOByteBuffer</code>
 * is used by <code>ImageInputStream</code> to supply a sequence of bytes
 * to the caller, possibly with fewer copies than using the conventional
 * <code>read</code> methods that take a user-supplied byte array.
 *
 * <p> The byte array referenced by an <code>IIOByteBuffer</code> will
 * generally be part of an internal data structure belonging to an
 * <code>ImageReader</code> implementation; its contents should be
 * considered read-only and must not be modified.
 *
 */
