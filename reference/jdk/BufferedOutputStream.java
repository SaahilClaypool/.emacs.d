_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public synchronized void flush() throws IOException {

    /**
     * Flushes this buffered output stream. This forces any buffered
     * output bytes to be written out to the underlying output stream.
     *
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public synchronized void write(byte b[], int off, int len) throws IOException {

    /**
     * Writes <code>len</code> bytes from the specified byte array
     * starting at offset <code>off</code> to this buffered output stream.
     *
     * <p> Ordinarily this method stores bytes from the given array into this
     * stream's buffer, flushing the buffer to the underlying output stream as
     * needed.  If the requested length is at least as large as this stream's
     * buffer, however, then this method will flush the buffer and write the
     * bytes directly to the underlying output stream.  Thus redundant
     * <code>BufferedOutputStream</code>s will not copy data unnecessarily.
     *
     * @param      b     the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of bytes to write.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public synchronized void write(int b) throws IOException {

    /**
     * Writes the specified byte to this buffered output stream.
     *
     * @param      b   the byte to be written.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    private void flushBuffer() throws IOException {

    /** Flush the internal buffer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public BufferedOutputStream(OutputStream out, int size) {

    /**
     * Creates a new buffered output stream to write data to the
     * specified underlying output stream with the specified buffer
     * size.
     *
     * @param   out    the underlying output stream.
     * @param   size   the buffer size.
     * @exception IllegalArgumentException if size &lt;= 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public BufferedOutputStream(OutputStream out) {

    /**
     * Creates a new buffered output stream to write data to the
     * specified underlying output stream.
     *
     * @param   out   the underlying output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    protected int count;

    /**
     * The number of valid bytes in the buffer. This value is always
     * in the range <tt>0</tt> through <tt>buf.length</tt>; elements
     * <tt>buf[0]</tt> through <tt>buf[count-1]</tt> contain valid
     * byte data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    protected byte buf[];

    /**
     * The internal buffer where data is stored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
public

/**
 * The class implements a buffered output stream. By setting up such
 * an output stream, an application can write bytes to the underlying
 * output stream without necessarily causing a call to the underlying
 * system for each byte written.
 *
 * @author  Arthur van Hoff
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public synchronized void flush() throws IOException {

    /**
     * Flushes this buffered output stream. This forces any buffered
     * output bytes to be written out to the underlying output stream.
     *
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.FilterOutputStream#out
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public synchronized void write(byte b[], int off, int len) throws IOException {

    /**
     * Writes <code>len</code> bytes from the specified byte array
     * starting at offset <code>off</code> to this buffered output stream.
     *
     * <p> Ordinarily this method stores bytes from the given array into this
     * stream's buffer, flushing the buffer to the underlying output stream as
     * needed.  If the requested length is at least as large as this stream's
     * buffer, however, then this method will flush the buffer and write the
     * bytes directly to the underlying output stream.  Thus redundant
     * <code>BufferedOutputStream</code>s will not copy data unnecessarily.
     *
     * @param      b     the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of bytes to write.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public synchronized void write(int b) throws IOException {

    /**
     * Writes the specified byte to this buffered output stream.
     *
     * @param      b   the byte to be written.
     * @exception  IOException  if an I/O error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    private void flushBuffer() throws IOException {

    /** Flush the internal buffer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public BufferedOutputStream(OutputStream out, int size) {

    /**
     * Creates a new buffered output stream to write data to the
     * specified underlying output stream with the specified buffer
     * size.
     *
     * @param   out    the underlying output stream.
     * @param   size   the buffer size.
     * @exception IllegalArgumentException if size &lt;= 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    public BufferedOutputStream(OutputStream out) {

    /**
     * Creates a new buffered output stream to write data to the
     * specified underlying output stream.
     *
     * @param   out   the underlying output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    protected int count;

    /**
     * The number of valid bytes in the buffer. This value is always
     * in the range <tt>0</tt> through <tt>buf.length</tt>; elements
     * <tt>buf[0]</tt> through <tt>buf[count-1]</tt> contain valid
     * byte data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
    protected byte buf[];

    /**
     * The internal buffer where data is stored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedOutputStream.java
public

/**
 * The class implements a buffered output stream. By setting up such
 * an output stream, an application can write bytes to the underlying
 * output stream without necessarily causing a call to the underlying
 * system for each byte written.
 *
 * @author  Arthur van Hoff
 * @since   JDK1.0
 */
