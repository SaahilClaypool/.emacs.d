_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public void reset() throws IOException {

    /**
     * Reset the stream to the most recent mark.
     *
     * @throws  IOException
     *          If the stream has not been marked, or if the mark has been
     *          invalidated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Mark the present position in the stream.  Subsequent calls to reset()
     * will attempt to reposition the stream to this point, and will also reset
     * the line number appropriately.
     *
     * @param  readAheadLimit
     *         Limit on the number of characters that may be read while still
     *         preserving the mark.  After reading this many characters,
     *         attempting to reset the stream may fail.
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public long skip(long n) throws IOException {

    /**
     * Skip characters.
     *
     * @param  n
     *         The number of characters to skip
     *
     * @return  The number of characters actually skipped
     *
     * @throws  IOException
     *          If an I/O error occurs
     *
     * @throws  IllegalArgumentException
     *          If <tt>n</tt> is negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private char skipBuffer[] = null;

    /** Skip buffer, null until allocated */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private static final int maxSkipBufferSize = 8192;

    /** Maximum skip-buffer size */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public String readLine() throws IOException {

    /**
     * Read a line of text.  Whenever a <a href="#lt">line terminator</a> is
     * read the current line number is incremented.
     *
     * @return  A String containing the contents of the line, not including
     *          any <a href="#lt">line termination characters</a>, or
     *          <tt>null</tt> if the end of the stream has been reached
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    @SuppressWarnings("fallthrough")

    /**
     * Read characters into a portion of an array.  Whenever a <a
     * href="#lt">line terminator</a> is read the current line number is
     * incremented.
     *
     * @param  cbuf
     *         Destination buffer
     *
     * @param  off
     *         Offset at which to start storing characters
     *
     * @param  len
     *         Maximum number of characters to read
     *
     * @return  The number of bytes read, or -1 if the end of the stream has
     *          already been reached
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    @SuppressWarnings("fallthrough")

    /**
     * Read a single character.  <a href="#lt">Line terminators</a> are
     * compressed into single newline ('\n') characters.  Whenever a line
     * terminator is read the current line number is incremented.
     *
     * @return  The character read, or -1 if the end of the stream has been
     *          reached
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public int getLineNumber() {

    /**
     * Get the current line number.
     *
     * @return  The current line number
     *
     * @see #setLineNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public void setLineNumber(int lineNumber) {

    /**
     * Set the current line number.
     *
     * @param  lineNumber
     *         An int specifying the line number
     *
     * @see #getLineNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public LineNumberReader(Reader in, int sz) {

    /**
     * Create a new line-numbering reader, reading characters into a buffer of
     * the given size.
     *
     * @param  in
     *         A Reader object to provide the underlying stream
     *
     * @param  sz
     *         An int specifying the size of the buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public LineNumberReader(Reader in) {

    /**
     * Create a new line-numbering reader, using the default input-buffer
     * size.
     *
     * @param  in
     *         A Reader object to provide the underlying stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private boolean markedSkipLF;

    /** The skipLF flag when the mark was set */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private boolean skipLF;

    /** If the next character is a line feed, skip it */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private int markedLineNumber; // Defaults to 0

    /** The line number of the mark, if any */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private int lineNumber = 0;

    /** The current line number */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
public class LineNumberReader extends BufferedReader {

/**
 * A buffered character-input stream that keeps track of line numbers.  This
 * class defines methods {@link #setLineNumber(int)} and {@link
 * #getLineNumber()} for setting and getting the current line number
 * respectively.
 *
 * <p> By default, line numbering begins at 0. This number increments at every
 * <a href="#lt">line terminator</a> as the data is read, and can be changed
 * with a call to <tt>setLineNumber(int)</tt>.  Note however, that
 * <tt>setLineNumber(int)</tt> does not actually change the current position in
 * the stream; it only changes the value that will be returned by
 * <tt>getLineNumber()</tt>.
 *
 * <p> A line is considered to be <a name="lt">terminated</a> by any one of a
 * line feed ('\n'), a carriage return ('\r'), or a carriage return followed
 * immediately by a linefeed.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public void reset() throws IOException {

    /**
     * Reset the stream to the most recent mark.
     *
     * @throws  IOException
     *          If the stream has not been marked, or if the mark has been
     *          invalidated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Mark the present position in the stream.  Subsequent calls to reset()
     * will attempt to reposition the stream to this point, and will also reset
     * the line number appropriately.
     *
     * @param  readAheadLimit
     *         Limit on the number of characters that may be read while still
     *         preserving the mark.  After reading this many characters,
     *         attempting to reset the stream may fail.
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public long skip(long n) throws IOException {

    /**
     * Skip characters.
     *
     * @param  n
     *         The number of characters to skip
     *
     * @return  The number of characters actually skipped
     *
     * @throws  IOException
     *          If an I/O error occurs
     *
     * @throws  IllegalArgumentException
     *          If <tt>n</tt> is negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private char skipBuffer[] = null;

    /** Skip buffer, null until allocated */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private static final int maxSkipBufferSize = 8192;

    /** Maximum skip-buffer size */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public String readLine() throws IOException {

    /**
     * Read a line of text.  Whenever a <a href="#lt">line terminator</a> is
     * read the current line number is incremented.
     *
     * @return  A String containing the contents of the line, not including
     *          any <a href="#lt">line termination characters</a>, or
     *          <tt>null</tt> if the end of the stream has been reached
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    @SuppressWarnings("fallthrough")

    /**
     * Read characters into a portion of an array.  Whenever a <a
     * href="#lt">line terminator</a> is read the current line number is
     * incremented.
     *
     * @param  cbuf
     *         Destination buffer
     *
     * @param  off
     *         Offset at which to start storing characters
     *
     * @param  len
     *         Maximum number of characters to read
     *
     * @return  The number of bytes read, or -1 if the end of the stream has
     *          already been reached
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    @SuppressWarnings("fallthrough")

    /**
     * Read a single character.  <a href="#lt">Line terminators</a> are
     * compressed into single newline ('\n') characters.  Whenever a line
     * terminator is read the current line number is incremented.
     *
     * @return  The character read, or -1 if the end of the stream has been
     *          reached
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public int getLineNumber() {

    /**
     * Get the current line number.
     *
     * @return  The current line number
     *
     * @see #setLineNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public void setLineNumber(int lineNumber) {

    /**
     * Set the current line number.
     *
     * @param  lineNumber
     *         An int specifying the line number
     *
     * @see #getLineNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public LineNumberReader(Reader in, int sz) {

    /**
     * Create a new line-numbering reader, reading characters into a buffer of
     * the given size.
     *
     * @param  in
     *         A Reader object to provide the underlying stream
     *
     * @param  sz
     *         An int specifying the size of the buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    public LineNumberReader(Reader in) {

    /**
     * Create a new line-numbering reader, using the default input-buffer
     * size.
     *
     * @param  in
     *         A Reader object to provide the underlying stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private boolean markedSkipLF;

    /** The skipLF flag when the mark was set */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private boolean skipLF;

    /** If the next character is a line feed, skip it */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private int markedLineNumber; // Defaults to 0

    /** The line number of the mark, if any */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
    private int lineNumber = 0;

    /** The current line number */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/LineNumberReader.java
public class LineNumberReader extends BufferedReader {

/**
 * A buffered character-input stream that keeps track of line numbers.  This
 * class defines methods {@link #setLineNumber(int)} and {@link
 * #getLineNumber()} for setting and getting the current line number
 * respectively.
 *
 * <p> By default, line numbering begins at 0. This number increments at every
 * <a href="#lt">line terminator</a> as the data is read, and can be changed
 * with a call to <tt>setLineNumber(int)</tt>.  Note however, that
 * <tt>setLineNumber(int)</tt> does not actually change the current position in
 * the stream; it only changes the value that will be returned by
 * <tt>getLineNumber()</tt>.
 *
 * <p> A line is considered to be <a name="lt">terminated</a> by any one of a
 * line feed ('\n'), a carriage return ('\r'), or a carriage return followed
 * immediately by a linefeed.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
