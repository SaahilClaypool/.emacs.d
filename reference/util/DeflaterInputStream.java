_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public void reset() throws IOException {

    /**
     * <i>This operation is not supported</i>.
     *
     * @throws IOException always thrown
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public void mark(int limit) {

    /**
     * <i>This operation is not supported</i>.
     *
     * @param limit maximum bytes that can be read before invalidating the position marker
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public boolean markSupported() {

    /**
     * Always returns {@code false} because this input stream does not support
     * the {@link #mark mark()} and {@link #reset reset()} methods.
     *
     * @return false, always
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public int available() throws IOException {

    /**
     * Returns 0 after EOF has been reached, otherwise always return 1.
     * <p>
     * Programs should not count on this method to return the actual number
     * of bytes that could be read without blocking
     * @return zero after the end of the underlying input stream has been
     * reached, otherwise always returns 1
     * @throws IOException if an I/O error occurs or if this stream is
     * already closed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public long skip(long n) throws IOException {

    /**
     * Skips over and discards data from the input stream.
     * This method may block until the specified number of bytes are read and
     * skipped. <em>Note:</em> While {@code n} is given as a {@code long},
     * the maximum number of bytes which can be skipped is
     * {@code Integer.MAX_VALUE}.
     *
     * @param n number of bytes to be skipped
     * @return the actual number of bytes skipped
     * @throws IOException if an I/O error occurs or if this stream is
     * already closed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public int read(byte[] b, int off, int len) throws IOException {

    /**
     * Reads compressed data into a byte array.
     * This method will block until some input can be read and compressed.
     *
     * @param b buffer into which the data is read
     * @param off starting offset of the data within {@code b}
     * @param len maximum number of compressed bytes to read into {@code b}
     * @return the actual number of bytes read, or -1 if the end of the
     * uncompressed input stream is reached
     * @throws IndexOutOfBoundsException  if {@code len > b.length - off}
     * @throws IOException if an I/O error occurs or if this input stream is
     * already closed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public int read() throws IOException {

    /**
     * Reads a single byte of compressed data from the input stream.
     * This method will block until some input can be read and compressed.
     *
     * @return a single byte of compressed data, or -1 if the end of the
     * uncompressed input stream is reached
     * @throws IOException if an I/O error occurs or if this stream is
     * already closed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public void close() throws IOException {

    /**
     * Closes this input stream and its underlying input stream, discarding
     * any pending uncompressed data.
     *
     * @throws IOException if an I/O error occurs
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public DeflaterInputStream(InputStream in, Deflater defl, int bufLen) {

    /**
     * Creates a new input stream with the specified compressor and buffer
     * size.
     *
     * @param in input stream to read the uncompressed data to
     * @param defl compressor ("deflater") for this stream
     * @param bufLen compression buffer size
     * @throws IllegalArgumentException if {@code bufLen <= 0}
     * @throws NullPointerException if {@code in} or {@code defl} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public DeflaterInputStream(InputStream in, Deflater defl) {

    /**
     * Creates a new input stream with the specified compressor and a
     * default buffer size.
     *
     * @param in input stream to read the uncompressed data to
     * @param defl compressor ("deflater") for this stream
     * @throws NullPointerException if {@code in} or {@code defl} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    public DeflaterInputStream(InputStream in) {

    /**
     * Creates a new input stream with a default compressor and buffer
     * size.
     *
     * @param in input stream to read the uncompressed data to
     * @throws NullPointerException if {@code in} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    private void ensureOpen() throws IOException {

    /**
     * Check to make sure that this stream has not been closed.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    private boolean reachEOF = false;

    /** End of the underlying input stream has been reached. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    private boolean usesDefaultDeflater = false;

    /** Default compressor is used. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    private byte[] rbuf = new byte[1];

    /** Temporary read buffer. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    protected final byte[] buf;

    /** Input buffer for reading compressed data. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
    protected final Deflater def;

    /** Compressor for this stream. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/DeflaterInputStream.java
public class DeflaterInputStream extends FilterInputStream {

/**
 * Implements an input stream filter for compressing data in the "deflate"
 * compression format.
 *
 * @since       1.6
 * @author      David R Tribble (david@tribble.com)
 *
 * @see DeflaterOutputStream
 * @see InflaterOutputStream
 * @see InflaterInputStream
 */
