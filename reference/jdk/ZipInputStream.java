_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    protected ZipEntry createZipEntry(String name) {

    /**
     * Creates a new <code>ZipEntry</code> object for the specified
     * entry name.
     *
     * @param name the ZIP file entry name
     * @return the ZipEntry just created
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    public void close() throws IOException {

    /**
     * Closes this input stream and releases any system resources associated
     * with the stream.
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    public long skip(long n) throws IOException {

    /**
     * Skips specified number of bytes in the current ZIP entry.
     * @param n the number of bytes to skip
     * @return the actual number of bytes skipped
     * @exception ZipException if a ZIP file error has occurred
     * @exception IOException if an I/O error has occurred
     * @exception IllegalArgumentException if {@code n < 0}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    public int read(byte[] b, int off, int len) throws IOException {

    /**
     * Reads from the current ZIP entry into an array of bytes.
     * If <code>len</code> is not zero, the method
     * blocks until some input is available; otherwise, no
     * bytes are read and <code>0</code> is returned.
     * @param b the buffer into which the data is read
     * @param off the start offset in the destination array <code>b</code>
     * @param len the maximum number of bytes read
     * @return the actual number of bytes read, or -1 if the end of the
     *         entry is reached
     * @exception  NullPointerException if <code>b</code> is <code>null</code>.
     * @exception  IndexOutOfBoundsException if <code>off</code> is negative,
     * <code>len</code> is negative, or <code>len</code> is greater than
     * <code>b.length - off</code>
     * @exception ZipException if a ZIP file error has occurred
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    public int available() throws IOException {

    /**
     * Returns 0 after EOF has reached for the current entry data,
     * otherwise always return 1.
     * <p>
     * Programs should not count on this method to return the actual number
     * of bytes that could be read without blocking.
     *
     * @return     1 before EOF and 0 after EOF has reached for current entry.
     * @exception  IOException  if an I/O error occurs.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    public void closeEntry() throws IOException {

    /**
     * Closes the current ZIP entry and positions the stream for reading the
     * next entry.
     * @exception ZipException if a ZIP file error has occurred
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    public ZipEntry getNextEntry() throws IOException {

    /**
     * Reads the next ZIP file entry and positions the stream at the
     * beginning of the entry data.
     * @return the next ZIP file entry, or null if there are no more entries
     * @exception ZipException if a ZIP file error has occurred
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    public ZipInputStream(InputStream in, Charset charset) {

    /**
     * Creates a new ZIP input stream.
     *
     * @param in the actual input stream
     *
     * @param charset
     *        The {@linkplain java.nio.charset.Charset charset} to be
     *        used to decode the ZIP entry name (ignored if the
     *        <a href="package-summary.html#lang_encoding"> language
     *        encoding bit</a> of the ZIP entry's general purpose bit
     *        flag is set).
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    public ZipInputStream(InputStream in) {

    /**
     * Creates a new ZIP input stream.
     *
     * <p>The UTF-8 {@link java.nio.charset.Charset charset} is used to
     * decode the entry names.
     *
     * @param in the actual input stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
    private void ensureOpen() throws IOException {

    /**
     * Check to make sure that this stream has not been closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipInputStream.java
public

/**
 * This class implements an input stream filter for reading files in the
 * ZIP file format. Includes support for both compressed and uncompressed
 * entries.
 *
 * @author      David Connelly
 */
