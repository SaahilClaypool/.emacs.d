_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void close() throws IOException {

    /**
     * Closing a <tt>StringWriter</tt> has no effect. The methods in this
     * class can be called after the stream has been closed without generating
     * an <tt>IOException</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void flush() {

    /**
     * Flush the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringBuffer getBuffer() {

    /**
     * Return the string buffer itself.
     *
     * @return StringBuffer holding the current buffer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public String toString() {

    /**
     * Return the buffer's current value as a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter append(char c) {

    /**
     * Appends the specified character to this writer.
     *
     * <p> An invocation of this method of the form <tt>out.append(c)</tt>
     * behaves in exactly the same way as the invocation
     *
     * <pre>
     *     out.write(c) </pre>
     *
     * @param  c
     *         The 16-bit character to append
     *
     * @return  This writer
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter append(CharSequence csq, int start, int end) {

    /**
     * Appends a subsequence of the specified character sequence to this writer.
     *
     * <p> An invocation of this method of the form <tt>out.append(csq, start,
     * end)</tt> when <tt>csq</tt> is not <tt>null</tt>, behaves in
     * exactly the same way as the invocation
     *
     * <pre>
     *     out.write(csq.subSequence(start, end).toString()) </pre>
     *
     * @param  csq
     *         The character sequence from which a subsequence will be
     *         appended.  If <tt>csq</tt> is <tt>null</tt>, then characters
     *         will be appended as if <tt>csq</tt> contained the four
     *         characters <tt>"null"</tt>.
     *
     * @param  start
     *         The index of the first character in the subsequence
     *
     * @param  end
     *         The index of the character following the last character in the
     *         subsequence
     *
     * @return  This writer
     *
     * @throws  IndexOutOfBoundsException
     *          If <tt>start</tt> or <tt>end</tt> are negative, <tt>start</tt>
     *          is greater than <tt>end</tt>, or <tt>end</tt> is greater than
     *          <tt>csq.length()</tt>
     *
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter append(CharSequence csq) {

    /**
     * Appends the specified character sequence to this writer.
     *
     * <p> An invocation of this method of the form <tt>out.append(csq)</tt>
     * behaves in exactly the same way as the invocation
     *
     * <pre>
     *     out.write(csq.toString()) </pre>
     *
     * <p> Depending on the specification of <tt>toString</tt> for the
     * character sequence <tt>csq</tt>, the entire sequence may not be
     * appended. For instance, invoking the <tt>toString</tt> method of a
     * character buffer will return a subsequence whose content depends upon
     * the buffer's position and limit.
     *
     * @param  csq
     *         The character sequence to append.  If <tt>csq</tt> is
     *         <tt>null</tt>, then the four characters <tt>"null"</tt> are
     *         appended to this writer.
     *
     * @return  This writer
     *
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void write(String str, int off, int len)  {

    /**
     * Write a portion of a string.
     *
     * @param  str  String to be written
     * @param  off  Offset from which to start writing characters
     * @param  len  Number of characters to write
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void write(String str) {

    /**
     * Write a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void write(char cbuf[], int off, int len) {

    /**
     * Write a portion of an array of characters.
     *
     * @param  cbuf  Array of characters
     * @param  off   Offset from which to start writing characters
     * @param  len   Number of characters to write
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void write(int c) {

    /**
     * Write a single character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter(int initialSize) {

    /**
     * Create a new string writer using the specified initial string-buffer
     * size.
     *
     * @param initialSize
     *        The number of <tt>char</tt> values that will fit into this buffer
     *        before it is automatically expanded
     *
     * @throws IllegalArgumentException
     *         If <tt>initialSize</tt> is negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter() {

    /**
     * Create a new string writer using the default initial string-buffer
     * size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
public class StringWriter extends Writer {

/**
 * A character stream that collects its output in a string buffer, which can
 * then be used to construct a string.
 * <p>
 * Closing a <tt>StringWriter</tt> has no effect. The methods in this class
 * can be called after the stream has been closed without generating an
 * <tt>IOException</tt>.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void close() throws IOException {

    /**
     * Closing a <tt>StringWriter</tt> has no effect. The methods in this
     * class can be called after the stream has been closed without generating
     * an <tt>IOException</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void flush() {

    /**
     * Flush the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringBuffer getBuffer() {

    /**
     * Return the string buffer itself.
     *
     * @return StringBuffer holding the current buffer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public String toString() {

    /**
     * Return the buffer's current value as a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter append(char c) {

    /**
     * Appends the specified character to this writer.
     *
     * <p> An invocation of this method of the form <tt>out.append(c)</tt>
     * behaves in exactly the same way as the invocation
     *
     * <pre>
     *     out.write(c) </pre>
     *
     * @param  c
     *         The 16-bit character to append
     *
     * @return  This writer
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter append(CharSequence csq, int start, int end) {

    /**
     * Appends a subsequence of the specified character sequence to this writer.
     *
     * <p> An invocation of this method of the form <tt>out.append(csq, start,
     * end)</tt> when <tt>csq</tt> is not <tt>null</tt>, behaves in
     * exactly the same way as the invocation
     *
     * <pre>
     *     out.write(csq.subSequence(start, end).toString()) </pre>
     *
     * @param  csq
     *         The character sequence from which a subsequence will be
     *         appended.  If <tt>csq</tt> is <tt>null</tt>, then characters
     *         will be appended as if <tt>csq</tt> contained the four
     *         characters <tt>"null"</tt>.
     *
     * @param  start
     *         The index of the first character in the subsequence
     *
     * @param  end
     *         The index of the character following the last character in the
     *         subsequence
     *
     * @return  This writer
     *
     * @throws  IndexOutOfBoundsException
     *          If <tt>start</tt> or <tt>end</tt> are negative, <tt>start</tt>
     *          is greater than <tt>end</tt>, or <tt>end</tt> is greater than
     *          <tt>csq.length()</tt>
     *
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter append(CharSequence csq) {

    /**
     * Appends the specified character sequence to this writer.
     *
     * <p> An invocation of this method of the form <tt>out.append(csq)</tt>
     * behaves in exactly the same way as the invocation
     *
     * <pre>
     *     out.write(csq.toString()) </pre>
     *
     * <p> Depending on the specification of <tt>toString</tt> for the
     * character sequence <tt>csq</tt>, the entire sequence may not be
     * appended. For instance, invoking the <tt>toString</tt> method of a
     * character buffer will return a subsequence whose content depends upon
     * the buffer's position and limit.
     *
     * @param  csq
     *         The character sequence to append.  If <tt>csq</tt> is
     *         <tt>null</tt>, then the four characters <tt>"null"</tt> are
     *         appended to this writer.
     *
     * @return  This writer
     *
     * @since  1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void write(String str, int off, int len)  {

    /**
     * Write a portion of a string.
     *
     * @param  str  String to be written
     * @param  off  Offset from which to start writing characters
     * @param  len  Number of characters to write
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void write(String str) {

    /**
     * Write a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void write(char cbuf[], int off, int len) {

    /**
     * Write a portion of an array of characters.
     *
     * @param  cbuf  Array of characters
     * @param  off   Offset from which to start writing characters
     * @param  len   Number of characters to write
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public void write(int c) {

    /**
     * Write a single character.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter(int initialSize) {

    /**
     * Create a new string writer using the specified initial string-buffer
     * size.
     *
     * @param initialSize
     *        The number of <tt>char</tt> values that will fit into this buffer
     *        before it is automatically expanded
     *
     * @throws IllegalArgumentException
     *         If <tt>initialSize</tt> is negative
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
    public StringWriter() {

    /**
     * Create a new string writer using the default initial string-buffer
     * size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/StringWriter.java
public class StringWriter extends Writer {

/**
 * A character stream that collects its output in a string buffer, which can
 * then be used to construct a string.
 * <p>
 * Closing a <tt>StringWriter</tt> has no effect. The methods in this class
 * can be called after the stream has been closed without generating an
 * <tt>IOException</tt>.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
