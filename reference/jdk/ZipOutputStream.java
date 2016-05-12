_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public void close() throws IOException {

    /**
     * Closes the ZIP output stream as well as the stream being filtered.
     * @exception ZipException if a ZIP file error has occurred
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public void finish() throws IOException {

    /**
     * Finishes writing the contents of the ZIP output stream without closing
     * the underlying stream. Use this method when applying multiple filters
     * in succession to the same output stream.
     * @exception ZipException if a ZIP file error has occurred
     * @exception IOException if an I/O exception has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public synchronized void write(byte[] b, int off, int len)

    /**
     * Writes an array of bytes to the current ZIP entry data. This method
     * will block until all the bytes are written.
     * @param b the data to be written
     * @param off the start offset in the data
     * @param len the number of bytes that are written
     * @exception ZipException if a ZIP file error has occurred
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public void closeEntry() throws IOException {

    /**
     * Closes the current ZIP entry and positions the stream for writing
     * the next entry.
     * @exception ZipException if a ZIP format error has occurred
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public void putNextEntry(ZipEntry e) throws IOException {

    /**
     * Begins writing a new ZIP file entry and positions the stream to the
     * start of the entry data. Closes the current entry if still active.
     * The default compression method will be used if no compression method
     * was specified for the entry, and the current time will be used if
     * the entry has no set modification time.
     * @param e the ZIP entry to be written
     * @exception ZipException if a ZIP format error has occurred
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public void setLevel(int level) {

    /**
     * Sets the compression level for subsequent entries which are DEFLATED.
     * The default setting is DEFAULT_COMPRESSION.
     * @param level the compression level (0-9)
     * @exception IllegalArgumentException if the compression level is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public void setMethod(int method) {

    /**
     * Sets the default compression method for subsequent entries. This
     * default will be used whenever the compression method is not specified
     * for an individual ZIP file entry, and is initially set to DEFLATED.
     * @param method the default compression method
     * @exception IllegalArgumentException if the specified compression method
     *            is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public void setComment(String comment) {

    /**
     * Sets the ZIP file comment.
     * @param comment the comment string
     * @exception IllegalArgumentException if the length of the specified
     *            ZIP file comment is greater than 0xFFFF bytes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public ZipOutputStream(OutputStream out, Charset charset) {

    /**
     * Creates a new ZIP output stream.
     *
     * @param out the actual output stream
     *
     * @param charset the {@linkplain java.nio.charset.Charset charset}
     *                to be used to encode the entry names and comments
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public ZipOutputStream(OutputStream out) {

    /**
     * Creates a new ZIP output stream.
     *
     * <p>The UTF-8 {@link java.nio.charset.Charset charset} is used
     * to encode the entry names and comments.
     *
     * @param out the actual output stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public static final int DEFLATED = ZipEntry.DEFLATED;

    /**
     * Compression method for compressed (DEFLATED) entries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    public static final int STORED = ZipEntry.STORED;

    /**
     * Compression method for uncompressed (STORED) entries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    private void ensureOpen() throws IOException {

    /**
     * Checks to make sure that this stream has not been closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
    private static final boolean inhibitZip64 =

    /**
     * Whether to use ZIP64 for zip files with more than 64k entries.
     * Until ZIP64 support in zip implementations is ubiquitous, this
     * system property allows the creation of zip files which can be
     * read by legacy zip implementations which tolerate "incorrect"
     * total entry count fields, such as the ones in jdk6, and even
     * some in jdk7.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipOutputStream.java
public

/**
 * This class implements an output stream filter for writing files in the
 * ZIP file format. Includes support for both compressed and uncompressed
 * entries.
 *
 * @author      David Connelly
 */
