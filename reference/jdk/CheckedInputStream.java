_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedInputStream.java
    public Checksum getChecksum() {

    /**
     * Returns the Checksum for this input stream.
     * @return the Checksum value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedInputStream.java
    public long skip(long n) throws IOException {

    /**
     * Skips specified number of bytes of input.
     * @param n the number of bytes to skip
     * @return the actual number of bytes skipped
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedInputStream.java
    public int read(byte[] buf, int off, int len) throws IOException {

    /**
     * Reads into an array of bytes. If <code>len</code> is not zero, the method
     * blocks until some input is available; otherwise, no
     * bytes are read and <code>0</code> is returned.
     * @param buf the buffer into which the data is read
     * @param off the start offset in the destination array <code>b</code>
     * @param len the maximum number of bytes read
     * @return    the actual number of bytes read, or -1 if the end
     *            of the stream is reached.
     * @exception  NullPointerException If <code>buf</code> is <code>null</code>.
     * @exception  IndexOutOfBoundsException If <code>off</code> is negative,
     * <code>len</code> is negative, or <code>len</code> is greater than
     * <code>buf.length - off</code>
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedInputStream.java
    public int read() throws IOException {

    /**
     * Reads a byte. Will block if no input is available.
     * @return the byte read, or -1 if the end of the stream is reached.
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedInputStream.java
    public CheckedInputStream(InputStream in, Checksum cksum) {

    /**
     * Creates an input stream using the specified Checksum.
     * @param in the input stream
     * @param cksum the Checksum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedInputStream.java
public

/**
 * An input stream that also maintains a checksum of the data being read.
 * The checksum can then be used to verify the integrity of the input data.
 *
 * @see         Checksum
 * @author      David Connelly
 */
