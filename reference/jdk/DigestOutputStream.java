_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestOutputStream.java
     public String toString() {

    /**
     * Prints a string representation of this digest output stream and
     * its associated message digest object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestOutputStream.java
    public void on(boolean on) {

    /**
     * Turns the digest function on or off. The default is on.  When
     * it is on, a call to one of the {@code write} methods results in an
     * update on the message digest.  But when it is off, the message
     * digest is not updated.
     *
     * @param on true to turn the digest function on, false to turn it
     * off.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestOutputStream.java
    public void write(byte[] b, int off, int len) throws IOException {

    /**
     * Updates the message digest (if the digest function is on) using
     * the specified subarray, and in any case writes the subarray to
     * the output stream. That is, if the digest function is on (see
     * {@link #on(boolean) on}), this method calls {@code update}
     * on the message digest associated with this stream, passing it
     * the subarray specifications. This method then writes the subarray
     * bytes to the output stream, blocking until the bytes are actually
     * written.
     *
     * @param b the array containing the subarray to be used for updating
     * and writing to the output stream.
     *
     * @param off the offset into {@code b} of the first byte to
     * be updated and written.
     *
     * @param len the number of bytes of data to be updated and written
     * from {@code b}, starting at offset {@code off}.
     *
     * @exception IOException if an I/O error occurs.
     *
     * @see MessageDigest#update(byte[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestOutputStream.java
    public void write(int b) throws IOException {

    /**
     * Updates the message digest (if the digest function is on) using
     * the specified byte, and in any case writes the byte
     * to the output stream. That is, if the digest function is on
     * (see {@link #on(boolean) on}), this method calls
     * {@code update} on the message digest associated with this
     * stream, passing it the byte {@code b}. This method then
     * writes the byte to the output stream, blocking until the byte
     * is actually written.
     *
     * @param b the byte to be used for updating and writing to the
     * output stream.
     *
     * @exception IOException if an I/O error occurs.
     *
     * @see MessageDigest#update(byte)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestOutputStream.java
    public void setMessageDigest(MessageDigest digest) {

    /**
     * Associates the specified message digest with this stream.
     *
     * @param digest the message digest to be associated with this stream.
     * @see #getMessageDigest()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestOutputStream.java
    public MessageDigest getMessageDigest() {

    /**
     * Returns the message digest associated with this stream.
     *
     * @return the message digest associated with this stream.
     * @see #setMessageDigest(java.security.MessageDigest)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestOutputStream.java
    public DigestOutputStream(OutputStream stream, MessageDigest digest) {

    /**
     * Creates a digest output stream, using the specified output stream
     * and message digest.
     *
     * @param stream the output stream.
     *
     * @param digest the message digest to associate with this stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestOutputStream.java
    protected MessageDigest digest;

    /**
     * The message digest associated with this stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/DigestOutputStream.java
public class DigestOutputStream extends FilterOutputStream {

/**
 * A transparent stream that updates the associated message digest using
 * the bits going through the stream.
 *
 * <p>To complete the message digest computation, call one of the
 * {@code digest} methods on the associated message
 * digest after your calls to one of this digest output stream's
 * {@link #write(int) write} methods.
 *
 * <p>It is possible to turn this stream on or off (see
 * {@link #on(boolean) on}). When it is on, a call to one of the
 * {@code write} methods results in
 * an update on the message digest.  But when it is off, the message
 * digest is not updated. The default is for the stream to be on.
 *
 * @see MessageDigest
 * @see DigestInputStream
 *
 * @author Benjamin Renaud
 */
