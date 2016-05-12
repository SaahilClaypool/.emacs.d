_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public void reset() throws IOException {

    /**
     * Resets the stream.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Marks the present position in the stream.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public boolean markSupported() {

    /**
     * Tells whether this stream supports the mark() operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public boolean ready() throws IOException {

    /**
     * Tells whether this stream is ready to be read.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public long skip(long n) throws IOException {

    /**
     * Skips characters.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public int read(char cbuf[], int off, int len) throws IOException {

    /**
     * Reads characters into a portion of an array.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public int read() throws IOException {

    /**
     * Reads a single character.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    protected FilterReader(Reader in) {

    /**
     * Creates a new filtered reader.
     *
     * @param in  a Reader object providing the underlying stream.
     * @throws NullPointerException if <code>in</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    protected Reader in;

    /**
     * The underlying character-input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
public abstract class FilterReader extends Reader {

/**
 * Abstract class for reading filtered character streams.
 * The abstract class <code>FilterReader</code> itself
 * provides default methods that pass all requests to
 * the contained stream. Subclasses of <code>FilterReader</code>
 * should override some of these methods and may also provide
 * additional methods and fields.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public void reset() throws IOException {

    /**
     * Resets the stream.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public void mark(int readAheadLimit) throws IOException {

    /**
     * Marks the present position in the stream.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public boolean markSupported() {

    /**
     * Tells whether this stream supports the mark() operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public boolean ready() throws IOException {

    /**
     * Tells whether this stream is ready to be read.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public long skip(long n) throws IOException {

    /**
     * Skips characters.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public int read(char cbuf[], int off, int len) throws IOException {

    /**
     * Reads characters into a portion of an array.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    public int read() throws IOException {

    /**
     * Reads a single character.
     *
     * @exception  IOException  If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    protected FilterReader(Reader in) {

    /**
     * Creates a new filtered reader.
     *
     * @param in  a Reader object providing the underlying stream.
     * @throws NullPointerException if <code>in</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
    protected Reader in;

    /**
     * The underlying character-input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/FilterReader.java
public abstract class FilterReader extends Reader {

/**
 * Abstract class for reading filtered character streams.
 * The abstract class <code>FilterReader</code> itself
 * provides default methods that pass all requests to
 * the contained stream. Subclasses of <code>FilterReader</code>
 * should override some of these methods and may also provide
 * additional methods and fields.
 *
 * @author      Mark Reinhold
 * @since       JDK1.1
 */
