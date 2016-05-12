_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    public void flush() throws IOException {

    /**
     * Flushes the stream.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    public void write(String str, int off, int len) throws IOException {

    /**
     * Writes a portion of a string.
     *
     * @param  str  String to be written
     * @param  off  Offset from which to start reading characters
     * @param  len  Number of characters to be written
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    public void write(char cbuf[], int off, int len) throws IOException {

    /**
     * Writes a portion of an array of characters.
     *
     * @param  cbuf  Buffer of characters to be written
     * @param  off   Offset from which to start reading characters
     * @param  len   Number of characters to be written
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    public void write(int c) throws IOException {

    /**
     * Writes a single character.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    protected FilterWriter(Writer out) {

    /**
     * Create a new filtered writer.
     *
     * @param out  a Writer object to provide the underlying stream.
     * @throws NullPointerException if <code>out</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    protected Writer out;

    /**
     * The underlying character-output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
public abstract class FilterWriter extends Writer {

/**
 * Abstract class for writing filtered character streams.
 * The abstract class <code>FilterWriter</code> itself
 * provides default methods that pass all requests to the
 * contained stream. Subclasses of <code>FilterWriter</code>
 * should override some of these methods and may also
 * provide additional methods and fields.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    public void flush() throws IOException {

    /**
     * Flushes the stream.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    public void write(String str, int off, int len) throws IOException {

    /**
     * Writes a portion of a string.
     *
     * @param  str  String to be written
     * @param  off  Offset from which to start reading characters
     * @param  len  Number of characters to be written
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    public void write(char cbuf[], int off, int len) throws IOException {

    /**
     * Writes a portion of an array of characters.
     *
     * @param  cbuf  Buffer of characters to be written
     * @param  off   Offset from which to start reading characters
     * @param  len   Number of characters to be written
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    public void write(int c) throws IOException {

    /**
     * Writes a single character.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    protected FilterWriter(Writer out) {

    /**
     * Create a new filtered writer.
     *
     * @param out  a Writer object to provide the underlying stream.
     * @throws NullPointerException if <code>out</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
    protected Writer out;

    /**
     * The underlying character-output stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterWriter.java
public abstract class FilterWriter extends Writer {

/**
 * Abstract class for writing filtered character streams.
 * The abstract class <code>FilterWriter</code> itself
 * provides default methods that pass all requests to the
 * contained stream. Subclasses of <code>FilterWriter</code>
 * should override some of these methods and may also
 * provide additional methods and fields.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
