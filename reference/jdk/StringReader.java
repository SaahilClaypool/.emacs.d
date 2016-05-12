_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public void close() {

    /**
     * Closes the stream and releases any system resources associated with
     * it. Once the stream has been closed, further read(),
     * ready(), mark(), or reset() invocations will throw an IOException.
     * Closing a previously closed stream has no effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public void reset() throws IOException {

    /**
     * Resets the stream to the most recent mark, or to the beginning of the
     * string if it has never been marked.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Marks the present position in the stream.  Subsequent calls to reset()
     * will reposition the stream to this point.
     *
     * @param  readAheadLimit  Limit on the number of characters that may be
     *                         read while still preserving the mark.  Because
     *                         the stream's input comes from a string, there
     *                         is no actual limit, so this argument must not
     *                         be negative, but is otherwise ignored.
     *
     * @exception  IllegalArgumentException  If {@code readAheadLimit < 0}
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public boolean markSupported() {

    /**
     * Tells whether this stream supports the mark() operation, which it does.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public boolean ready() throws IOException {

    /**
     * Tells whether this stream is ready to be read.
     *
     * @return True if the next read() is guaranteed not to block for input
     *
     * @exception  IOException  If the stream is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public long skip(long ns) throws IOException {

    /**
     * Skips the specified number of characters in the stream. Returns
     * the number of characters that were skipped.
     *
     * <p>The <code>ns</code> parameter may be negative, even though the
     * <code>skip</code> method of the {@link Reader} superclass throws
     * an exception in this case. Negative values of <code>ns</code> cause the
     * stream to skip backwards. Negative return values indicate a skip
     * backwards. It is not possible to skip backwards past the beginning of
     * the string.
     *
     * <p>If the entire string has been read or skipped, then this method has
     * no effect and always returns 0.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public int read(char cbuf[], int off, int len) throws IOException {

    /**
     * Reads characters into a portion of an array.
     *
     * @param      cbuf  Destination buffer
     * @param      off   Offset at which to start writing characters
     * @param      len   Maximum number of characters to read
     *
     * @return     The number of characters read, or -1 if the end of the
     *             stream has been reached
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public int read() throws IOException {

    /**
     * Reads a single character.
     *
     * @return     The character read, or -1 if the end of the stream has been
     *             reached
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    private void ensureOpen() throws IOException {

    /** Check to make sure that the stream has not been closed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public StringReader(String s) {

    /**
     * Creates a new string reader.
     *
     * @param s  String providing the character stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
public class StringReader extends Reader {

/**
 * A character stream whose source is a string.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public void close() {

    /**
     * Closes the stream and releases any system resources associated with
     * it. Once the stream has been closed, further read(),
     * ready(), mark(), or reset() invocations will throw an IOException.
     * Closing a previously closed stream has no effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public void reset() throws IOException {

    /**
     * Resets the stream to the most recent mark, or to the beginning of the
     * string if it has never been marked.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Marks the present position in the stream.  Subsequent calls to reset()
     * will reposition the stream to this point.
     *
     * @param  readAheadLimit  Limit on the number of characters that may be
     *                         read while still preserving the mark.  Because
     *                         the stream's input comes from a string, there
     *                         is no actual limit, so this argument must not
     *                         be negative, but is otherwise ignored.
     *
     * @exception  IllegalArgumentException  If {@code readAheadLimit < 0}
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public boolean markSupported() {

    /**
     * Tells whether this stream supports the mark() operation, which it does.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public boolean ready() throws IOException {

    /**
     * Tells whether this stream is ready to be read.
     *
     * @return True if the next read() is guaranteed not to block for input
     *
     * @exception  IOException  If the stream is closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public long skip(long ns) throws IOException {

    /**
     * Skips the specified number of characters in the stream. Returns
     * the number of characters that were skipped.
     *
     * <p>The <code>ns</code> parameter may be negative, even though the
     * <code>skip</code> method of the {@link Reader} superclass throws
     * an exception in this case. Negative values of <code>ns</code> cause the
     * stream to skip backwards. Negative return values indicate a skip
     * backwards. It is not possible to skip backwards past the beginning of
     * the string.
     *
     * <p>If the entire string has been read or skipped, then this method has
     * no effect and always returns 0.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public int read(char cbuf[], int off, int len) throws IOException {

    /**
     * Reads characters into a portion of an array.
     *
     * @param      cbuf  Destination buffer
     * @param      off   Offset at which to start writing characters
     * @param      len   Maximum number of characters to read
     *
     * @return     The number of characters read, or -1 if the end of the
     *             stream has been reached
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public int read() throws IOException {

    /**
     * Reads a single character.
     *
     * @return     The character read, or -1 if the end of the stream has been
     *             reached
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    private void ensureOpen() throws IOException {

    /** Check to make sure that the stream has not been closed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
    public StringReader(String s) {

    /**
     * Creates a new string reader.
     *
     * @param s  String providing the character stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringReader.java
public class StringReader extends Reader {

/**
 * A character stream whose source is a string.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
