_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void flush() throws IOException {

    /**
     * Flushes the stream.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void newLine() throws IOException {

    /**
     * Writes a line separator.  The line separator string is defined by the
     * system property <tt>line.separator</tt>, and is not necessarily a single
     * newline ('\n') character.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void write(String s, int off, int len) throws IOException {

    /**
     * Writes a portion of a String.
     *
     * <p> If the value of the <tt>len</tt> parameter is negative then no
     * characters are written.  This is contrary to the specification of this
     * method in the {@linkplain java.io.Writer#write(java.lang.String,int,int)
     * superclass}, which requires that an {@link IndexOutOfBoundsException} be
     * thrown.
     *
     * @param  s     String to be written
     * @param  off   Offset from which to start reading characters
     * @param  len   Number of characters to be written
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void write(char cbuf[], int off, int len) throws IOException {

    /**
     * Writes a portion of an array of characters.
     *
     * <p> Ordinarily this method stores characters from the given array into
     * this stream's buffer, flushing the buffer to the underlying stream as
     * needed.  If the requested length is at least as large as the buffer,
     * however, then this method will flush the buffer and write the characters
     * directly to the underlying stream.  Thus redundant
     * <code>BufferedWriter</code>s will not copy data unnecessarily.
     *
     * @param  cbuf  A character array
     * @param  off   Offset from which to start reading characters
     * @param  len   Number of characters to write
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    private int min(int a, int b) {

    /**
     * Our own little min method, to avoid loading java.lang.Math if we've run
     * out of file descriptors and we're trying to print a stack trace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void write(int c) throws IOException {

    /**
     * Writes a single character.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    void flushBuffer() throws IOException {

    /**
     * Flushes the output buffer to the underlying character stream, without
     * flushing the stream itself.  This method is non-private only so that it
     * may be invoked by PrintStream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    private void ensureOpen() throws IOException {

    /** Checks to make sure that the stream has not been closed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public BufferedWriter(Writer out, int sz) {

    /**
     * Creates a new buffered character-output stream that uses an output
     * buffer of the given size.
     *
     * @param  out  A Writer
     * @param  sz   Output-buffer size, a positive integer
     *
     * @exception  IllegalArgumentException  If {@code sz <= 0}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public BufferedWriter(Writer out) {

    /**
     * Creates a buffered character-output stream that uses a default-sized
     * output buffer.
     *
     * @param  out  A Writer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    private String lineSeparator;

    /**
     * Line separator string.  This is the value of the line.separator
     * property at the moment that the stream was created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
public class BufferedWriter extends Writer {

/**
 * Writes text to a character-output stream, buffering characters so as to
 * provide for the efficient writing of single characters, arrays, and strings.
 *
 * <p> The buffer size may be specified, or the default size may be accepted.
 * The default is large enough for most purposes.
 *
 * <p> A newLine() method is provided, which uses the platform's own notion of
 * line separator as defined by the system property <tt>line.separator</tt>.
 * Not all platforms use the newline character ('\n') to terminate lines.
 * Calling this method to terminate each output line is therefore preferred to
 * writing a newline character directly.
 *
 * <p> In general, a Writer sends its output immediately to the underlying
 * character or byte stream.  Unless prompt output is required, it is advisable
 * to wrap a BufferedWriter around any Writer whose write() operations may be
 * costly, such as FileWriters and OutputStreamWriters.  For example,
 *
 * <pre>
 * PrintWriter out
 *   = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
 * </pre>
 *
 * will buffer the PrintWriter's output to the file.  Without buffering, each
 * invocation of a print() method would cause characters to be converted into
 * bytes that would then be written immediately to the file, which can be very
 * inefficient.
 *
 * @see PrintWriter
 * @see FileWriter
 * @see OutputStreamWriter
 * @see java.nio.file.Files#newBufferedWriter
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void flush() throws IOException {

    /**
     * Flushes the stream.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void newLine() throws IOException {

    /**
     * Writes a line separator.  The line separator string is defined by the
     * system property <tt>line.separator</tt>, and is not necessarily a single
     * newline ('\n') character.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void write(String s, int off, int len) throws IOException {

    /**
     * Writes a portion of a String.
     *
     * <p> If the value of the <tt>len</tt> parameter is negative then no
     * characters are written.  This is contrary to the specification of this
     * method in the {@linkplain java.io.Writer#write(java.lang.String,int,int)
     * superclass}, which requires that an {@link IndexOutOfBoundsException} be
     * thrown.
     *
     * @param  s     String to be written
     * @param  off   Offset from which to start reading characters
     * @param  len   Number of characters to be written
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void write(char cbuf[], int off, int len) throws IOException {

    /**
     * Writes a portion of an array of characters.
     *
     * <p> Ordinarily this method stores characters from the given array into
     * this stream's buffer, flushing the buffer to the underlying stream as
     * needed.  If the requested length is at least as large as the buffer,
     * however, then this method will flush the buffer and write the characters
     * directly to the underlying stream.  Thus redundant
     * <code>BufferedWriter</code>s will not copy data unnecessarily.
     *
     * @param  cbuf  A character array
     * @param  off   Offset from which to start reading characters
     * @param  len   Number of characters to write
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    private int min(int a, int b) {

    /**
     * Our own little min method, to avoid loading java.lang.Math if we've run
     * out of file descriptors and we're trying to print a stack trace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public void write(int c) throws IOException {

    /**
     * Writes a single character.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    void flushBuffer() throws IOException {

    /**
     * Flushes the output buffer to the underlying character stream, without
     * flushing the stream itself.  This method is non-private only so that it
     * may be invoked by PrintStream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    private void ensureOpen() throws IOException {

    /** Checks to make sure that the stream has not been closed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public BufferedWriter(Writer out, int sz) {

    /**
     * Creates a new buffered character-output stream that uses an output
     * buffer of the given size.
     *
     * @param  out  A Writer
     * @param  sz   Output-buffer size, a positive integer
     *
     * @exception  IllegalArgumentException  If {@code sz <= 0}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    public BufferedWriter(Writer out) {

    /**
     * Creates a buffered character-output stream that uses a default-sized
     * output buffer.
     *
     * @param  out  A Writer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
    private String lineSeparator;

    /**
     * Line separator string.  This is the value of the line.separator
     * property at the moment that the stream was created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/BufferedWriter.java
public class BufferedWriter extends Writer {

/**
 * Writes text to a character-output stream, buffering characters so as to
 * provide for the efficient writing of single characters, arrays, and strings.
 *
 * <p> The buffer size may be specified, or the default size may be accepted.
 * The default is large enough for most purposes.
 *
 * <p> A newLine() method is provided, which uses the platform's own notion of
 * line separator as defined by the system property <tt>line.separator</tt>.
 * Not all platforms use the newline character ('\n') to terminate lines.
 * Calling this method to terminate each output line is therefore preferred to
 * writing a newline character directly.
 *
 * <p> In general, a Writer sends its output immediately to the underlying
 * character or byte stream.  Unless prompt output is required, it is advisable
 * to wrap a BufferedWriter around any Writer whose write() operations may be
 * costly, such as FileWriters and OutputStreamWriters.  For example,
 *
 * <pre>
 * PrintWriter out
 *   = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
 * </pre>
 *
 * will buffer the PrintWriter's output to the file.  Without buffering, each
 * invocation of a print() method would cause characters to be converted into
 * bytes that would then be written immediately to the file, which can be very
 * inefficient.
 *
 * @see PrintWriter
 * @see FileWriter
 * @see OutputStreamWriter
 * @see java.nio.file.Files#newBufferedWriter
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
