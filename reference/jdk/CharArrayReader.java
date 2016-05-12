_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public void close() {

    /**
     * Closes the stream and releases any system resources associated with
     * it.  Once the stream has been closed, further read(), ready(),
     * mark(), reset(), or skip() invocations will throw an IOException.
     * Closing a previously closed stream has no effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public void reset() throws IOException {

    /**
     * Resets the stream to the most recent mark, or to the beginning if it has
     * never been marked.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Marks the present position in the stream.  Subsequent calls to reset()
     * will reposition the stream to this point.
     *
     * @param  readAheadLimit  Limit on the number of characters that may be
     *                         read while still preserving the mark.  Because
     *                         the stream's input comes from a character array,
     *                         there is no actual limit; hence this argument is
     *                         ignored.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public boolean markSupported() {

    /**
     * Tells whether this stream supports the mark() operation, which it does.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public boolean ready() throws IOException {

    /**
     * Tells whether this stream is ready to be read.  Character-array readers
     * are always ready to be read.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public long skip(long n) throws IOException {

    /**
     * Skips characters.  Returns the number of characters that were skipped.
     *
     * <p>The <code>n</code> parameter may be negative, even though the
     * <code>skip</code> method of the {@link Reader} superclass throws
     * an exception in this case. If <code>n</code> is negative, then
     * this method does nothing and returns <code>0</code>.
     *
     * @param n The number of characters to skip
     * @return       The number of characters actually skipped
     * @exception  IOException If the stream is closed, or an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public int read(char b[], int off, int len) throws IOException {

    /**
     * Reads characters into a portion of an array.
     * @param b  Destination buffer
     * @param off  Offset at which to start storing characters
     * @param len   Maximum number of characters to read
     * @return  The actual number of characters read, or -1 if
     *          the end of the stream has been reached
     *
     * @exception   IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public int read() throws IOException {

    /**
     * Reads a single character.
     *
     * @exception   IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    private void ensureOpen() throws IOException {

    /** Checks to make sure that the stream has not been closed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public CharArrayReader(char buf[], int offset, int length) {

    /**
     * Creates a CharArrayReader from the specified array of chars.
     *
     * <p> The resulting reader will start reading at the given
     * <tt>offset</tt>.  The total number of <tt>char</tt> values that can be
     * read from this reader will be either <tt>length</tt> or
     * <tt>buf.length-offset</tt>, whichever is smaller.
     *
     * @throws IllegalArgumentException
     *         If <tt>offset</tt> is negative or greater than
     *         <tt>buf.length</tt>, or if <tt>length</tt> is negative, or if
     *         the sum of these two values is negative.
     *
     * @param buf       Input buffer (not copied)
     * @param offset    Offset of the first char to read
     * @param length    Number of chars to read
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public CharArrayReader(char buf[]) {

    /**
     * Creates a CharArrayReader from the specified array of chars.
     * @param buf       Input buffer (not copied)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    protected int count;

    /**
     *  The index of the end of this buffer.  There is not valid
     *  data at or beyond this index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    protected int markedPos = 0;

    /** The position of mark in buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    protected int pos;

    /** The current buffer position. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
public class CharArrayReader extends Reader {

/**
 * This class implements a character buffer that can be used as a
 * character-input stream.
 *
 * @author      Herb Jellinek
 * @since       JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public void close() {

    /**
     * Closes the stream and releases any system resources associated with
     * it.  Once the stream has been closed, further read(), ready(),
     * mark(), reset(), or skip() invocations will throw an IOException.
     * Closing a previously closed stream has no effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public void reset() throws IOException {

    /**
     * Resets the stream to the most recent mark, or to the beginning if it has
     * never been marked.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Marks the present position in the stream.  Subsequent calls to reset()
     * will reposition the stream to this point.
     *
     * @param  readAheadLimit  Limit on the number of characters that may be
     *                         read while still preserving the mark.  Because
     *                         the stream's input comes from a character array,
     *                         there is no actual limit; hence this argument is
     *                         ignored.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public boolean markSupported() {

    /**
     * Tells whether this stream supports the mark() operation, which it does.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public boolean ready() throws IOException {

    /**
     * Tells whether this stream is ready to be read.  Character-array readers
     * are always ready to be read.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public long skip(long n) throws IOException {

    /**
     * Skips characters.  Returns the number of characters that were skipped.
     *
     * <p>The <code>n</code> parameter may be negative, even though the
     * <code>skip</code> method of the {@link Reader} superclass throws
     * an exception in this case. If <code>n</code> is negative, then
     * this method does nothing and returns <code>0</code>.
     *
     * @param n The number of characters to skip
     * @return       The number of characters actually skipped
     * @exception  IOException If the stream is closed, or an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public int read(char b[], int off, int len) throws IOException {

    /**
     * Reads characters into a portion of an array.
     * @param b  Destination buffer
     * @param off  Offset at which to start storing characters
     * @param len   Maximum number of characters to read
     * @return  The actual number of characters read, or -1 if
     *          the end of the stream has been reached
     *
     * @exception   IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public int read() throws IOException {

    /**
     * Reads a single character.
     *
     * @exception   IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    private void ensureOpen() throws IOException {

    /** Checks to make sure that the stream has not been closed */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public CharArrayReader(char buf[], int offset, int length) {

    /**
     * Creates a CharArrayReader from the specified array of chars.
     *
     * <p> The resulting reader will start reading at the given
     * <tt>offset</tt>.  The total number of <tt>char</tt> values that can be
     * read from this reader will be either <tt>length</tt> or
     * <tt>buf.length-offset</tt>, whichever is smaller.
     *
     * @throws IllegalArgumentException
     *         If <tt>offset</tt> is negative or greater than
     *         <tt>buf.length</tt>, or if <tt>length</tt> is negative, or if
     *         the sum of these two values is negative.
     *
     * @param buf       Input buffer (not copied)
     * @param offset    Offset of the first char to read
     * @param length    Number of chars to read
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    public CharArrayReader(char buf[]) {

    /**
     * Creates a CharArrayReader from the specified array of chars.
     * @param buf       Input buffer (not copied)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    protected int count;

    /**
     *  The index of the end of this buffer.  There is not valid
     *  data at or beyond this index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    protected int markedPos = 0;

    /** The position of mark in buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
    protected int pos;

    /** The current buffer position. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/CharArrayReader.java
public class CharArrayReader extends Reader {

/**
 * This class implements a character buffer that can be used as a
 * character-input stream.
 *
 * @author      Herb Jellinek
 * @since       JDK1.1
 */
