_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/GZIPInputStream.java
    public final static int GZIP_MAGIC = 0x8b1f;

    /**
     * GZIP header magic number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/GZIPInputStream.java
    public void close() throws IOException {

    /**
     * Closes this input stream and releases any system resources associated
     * with the stream.
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/GZIPInputStream.java
    public int read(byte[] buf, int off, int len) throws IOException {

    /**
     * Reads uncompressed data into an array of bytes. If <code>len</code> is not
     * zero, the method will block until some input can be decompressed; otherwise,
     * no bytes are read and <code>0</code> is returned.
     * @param buf the buffer into which the data is read
     * @param off the start offset in the destination array <code>b</code>
     * @param len the maximum number of bytes read
     * @return  the actual number of bytes read, or -1 if the end of the
     *          compressed input stream is reached
     *
     * @exception  NullPointerException If <code>buf</code> is <code>null</code>.
     * @exception  IndexOutOfBoundsException If <code>off</code> is negative,
     * <code>len</code> is negative, or <code>len</code> is greater than
     * <code>buf.length - off</code>
     * @exception ZipException if the compressed input data is corrupt.
     * @exception IOException if an I/O error has occurred.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/GZIPInputStream.java
    public GZIPInputStream(InputStream in) throws IOException {

    /**
     * Creates a new input stream with a default buffer size.
     * @param in the input stream
     *
     * @exception ZipException if a GZIP format error has occurred or the
     *                         compression method used is unsupported
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/GZIPInputStream.java
    public GZIPInputStream(InputStream in, int size) throws IOException {

    /**
     * Creates a new input stream with the specified buffer size.
     * @param in the input stream
     * @param size the input buffer size
     *
     * @exception ZipException if a GZIP format error has occurred or the
     *                         compression method used is unsupported
     * @exception IOException if an I/O error has occurred
     * @exception IllegalArgumentException if {@code size <= 0}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/GZIPInputStream.java
    private void ensureOpen() throws IOException {

    /**
     * Check to make sure that this stream has not been closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/GZIPInputStream.java
    protected boolean eos;

    /**
     * Indicates end of input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/GZIPInputStream.java
    protected CRC32 crc = new CRC32();

    /**
     * CRC-32 for uncompressed data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/GZIPInputStream.java
public

/**
 * This class implements a stream filter for reading compressed data in
 * the GZIP file format.
 *
 * @see         InflaterInputStream
 * @author      David Connelly
 *
 */
