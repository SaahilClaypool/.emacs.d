_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    public void write(byte[] b, int off, int len) throws IOException {

    /**
     * Writes an array of bytes to the uncompressed output stream.
     *
     * @param b buffer containing compressed data to decompress and write to
     * the output stream
     * @param off starting offset of the compressed data within {@code b}
     * @param len number of bytes to decompress from {@code b}
     * @throws IndexOutOfBoundsException if {@code off < 0}, or if
     * {@code len < 0}, or if {@code len > b.length - off}
     * @throws IOException if an I/O error occurs or this stream is already
     * closed
     * @throws NullPointerException if {@code b} is null
     * @throws ZipException if a compression (ZIP) format error occurs
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    public void write(int b) throws IOException {

    /**
     * Writes a byte to the uncompressed output stream.
     *
     * @param b a single byte of compressed data to decompress and write to
     * the output stream
     * @throws IOException if an I/O error occurs or this stream is already
     * closed
     * @throws ZipException if a compression (ZIP) format error occurs
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    public void finish() throws IOException {

    /**
     * Finishes writing uncompressed data to the output stream without closing
     * the underlying stream.  Use this method when applying multiple filters in
     * succession to the same output stream.
     *
     * @throws IOException if an I/O error occurs or this stream is already
     * closed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    public void flush() throws IOException {

    /**
     * Flushes this output stream, forcing any pending buffered output bytes to be
     * written.
     *
     * @throws IOException if an I/O error occurs or this stream is already
     * closed
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    public void close() throws IOException {

    /**
     * Writes any remaining uncompressed data to the output stream and closes
     * the underlying output stream.
     *
     * @throws IOException if an I/O error occurs
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    public InflaterOutputStream(OutputStream out, Inflater infl, int bufLen) {

    /**
     * Creates a new output stream with the specified decompressor and
     * buffer size.
     *
     * @param out output stream to write the uncompressed data to
     * @param infl decompressor ("inflater") for this stream
     * @param bufLen decompression buffer size
     * @throws IllegalArgumentException if {@code bufLen <= 0}
     * @throws NullPointerException if {@code out} or {@code infl} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    public InflaterOutputStream(OutputStream out, Inflater infl) {

    /**
     * Creates a new output stream with the specified decompressor and a
     * default buffer size.
     *
     * @param out output stream to write the uncompressed data to
     * @param infl decompressor ("inflater") for this stream
     * @throws NullPointerException if {@code out} or {@code infl} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    public InflaterOutputStream(OutputStream out) {

    /**
     * Creates a new output stream with a default decompressor and buffer
     * size.
     *
     * @param out output stream to write the uncompressed data to
     * @throws NullPointerException if {@code out} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    private void ensureOpen() throws IOException {

    /**
     * Checks to make sure that this stream has not been closed.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    private boolean closed = false;

    /** true iff {@link #close()} has been called. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    private boolean usesDefaultInflater = false;

    /** Default decompressor is used. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    private final byte[] wbuf = new byte[1];

    /** Temporary write buffer. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    protected final byte[] buf;

    /** Output buffer for writing uncompressed data. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
    protected final Inflater inf;

    /** Decompressor for this stream. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//zip/InflaterOutputStream.java
public class InflaterOutputStream extends FilterOutputStream {

/**
 * Implements an output stream filter for uncompressing data stored in the
 * "deflate" compression format.
 *
 * @since       1.6
 * @author      David R Tribble (david@tribble.com)
 *
 * @see InflaterInputStream
 * @see DeflaterInputStream
 * @see DeflaterOutputStream
 */
