_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public synchronized void reset() throws IOException {

    /**
     * Repositions this stream to the position at the time the
     * <code>mark</code> method was last called on this input stream.
     *
     * <p> The method <code>reset</code> for class
     * <code>InflaterInputStream</code> does nothing except throw an
     * <code>IOException</code>.
     *
     * @exception  IOException  if this method is invoked.
     * @see     java.io.InputStream#mark(int)
     * @see     java.io.IOException
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public synchronized void mark(int readlimit) {

    /**
     * Marks the current position in this input stream.
     *
     * <p> The <code>mark</code> method of <code>InflaterInputStream</code>
     * does nothing.
     *
     * @param   readlimit   the maximum limit of bytes that can be read before
     *                      the mark position becomes invalid.
     * @see     java.io.InputStream#reset()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public boolean markSupported() {

    /**
     * Tests if this input stream supports the <code>mark</code> and
     * <code>reset</code> methods. The <code>markSupported</code>
     * method of <code>InflaterInputStream</code> returns
     * <code>false</code>.
     *
     * @return  a <code>boolean</code> indicating if this stream type supports
     *          the <code>mark</code> and <code>reset</code> methods.
     * @see     java.io.InputStream#mark(int)
     * @see     java.io.InputStream#reset()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    protected void fill() throws IOException {

    /**
     * Fills input buffer with more data to decompress.
     * @exception IOException if an I/O error has occurred
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public void close() throws IOException {

    /**
     * Closes this input stream and releases any system resources associated
     * with the stream.
     * @exception IOException if an I/O error has occurred
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public long skip(long n) throws IOException {

    /**
     * Skips specified number of bytes of uncompressed data.
     * @param n the number of bytes to skip
     * @return the actual number of bytes skipped.
     * @exception IOException if an I/O error has occurred
     * @exception IllegalArgumentException if {@code n < 0}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public int available() throws IOException {

    /**
     * Returns 0 after EOF has been reached, otherwise always return 1.
     * <p>
     * Programs should not count on this method to return the actual number
     * of bytes that could be read without blocking.
     *
     * @return     1 before EOF and 0 after EOF.
     * @exception  IOException  if an I/O error occurs.
     *
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public int read(byte[] b, int off, int len) throws IOException {

    /**
     * Reads uncompressed data into an array of bytes. If <code>len</code> is not
     * zero, the method will block until some input can be decompressed; otherwise,
     * no bytes are read and <code>0</code> is returned.
     * @param b the buffer into which the data is read
     * @param off the start offset in the destination array <code>b</code>
     * @param len the maximum number of bytes read
     * @return the actual number of bytes read, or -1 if the end of the
     *         compressed input is reached or a preset dictionary is needed
     * @exception  NullPointerException If <code>b</code> is <code>null</code>.
     * @exception  IndexOutOfBoundsException If <code>off</code> is negative,
     * <code>len</code> is negative, or <code>len</code> is greater than
     * <code>b.length - off</code>
     * @exception ZipException if a ZIP format error has occurred
     * @exception IOException if an I/O error has occurred
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public int read() throws IOException {

    /**
     * Reads a byte of uncompressed data. This method will block until
     * enough input is available for decompression.
     * @return the byte read, or -1 if end of compressed input is reached
     * @exception IOException if an I/O error has occurred
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public InflaterInputStream(InputStream in) {

    /**
     * Creates a new input stream with a default decompressor and buffer size.
     * @param in the input stream
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public InflaterInputStream(InputStream in, Inflater inf) {

    /**
     * Creates a new input stream with the specified decompressor and a
     * default buffer size.
     * @param in the input stream
     * @param inf the decompressor ("inflater")
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    public InflaterInputStream(InputStream in, Inflater inf, int size) {

    /**
     * Creates a new input stream with the specified decompressor and
     * buffer size.
     * @param in the input stream
     * @param inf the decompressor ("inflater")
     * @param size the input buffer size
     * @exception IllegalArgumentException if {@code size <= 0}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    private void ensureOpen() throws IOException {

    /**
     * Check to make sure that this stream has not been closed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    protected int len;

    /**
     * Length of input buffer.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    protected byte[] buf;

    /**
     * Input buffer for decompression.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
    protected Inflater inf;

    /**
     * Decompressor for this stream.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterInputStream.java
public

/**
 * This class implements a stream filter for uncompressing data in the
 * "deflate" compression format. It is also used as the basis for other
 * decompression filters, such as GZIPInputStream.
 *
 * @see         Inflater
 * @author      David Connelly
 */
