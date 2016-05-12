_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void append(XMLString s) {

    /**
     * append
     *
     * @param s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void append(char[] ch, int offset, int length) {

    /**
     * append
     *
     * @param ch
     * @param offset
     * @param length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void append(String s) {

    /**
     * append
     *
     * @param s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void append(char c) {

    /**
     * append
     *
     * @param c
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void clear() {

    /** Clears the string buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(XMLString s) {

    /** Constructs a string buffer from the specified XMLString. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(char[] ch, int offset, int length) {

    /** Constructs a string buffer from the specified character array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(String s) {

    /** Constructs a string buffer from a String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(char c) {

    /** Constructs a string buffer from a char. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(int size) {

    /**
     *
     *
     * @param size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public static final int DEFAULT_SIZE = 32;

    /** Default buffer size (32). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
public class XMLStringBuffer

/**
 * XMLString is a structure used to pass character arrays. However,
 * XMLStringBuffer is a buffer in which characters can be appended
 * and extends XMLString so that it can be passed to methods
 * expecting an XMLString object. This is a safe operation because
 * it is assumed that any callee will <strong>not</strong> modify
 * the contents of the XMLString structure.
 * <p>
 * The contents of the string are managed by the string buffer. As
 * characters are appended, the string buffer will grow as needed.
 * <p>
 * <strong>Note:</strong> Never set the <code>ch</code>,
 * <code>offset</code>, and <code>length</code> fields directly.
 * These fields are managed by the string buffer. In order to reset
 * the buffer, call <code>clear()</code>.
 *
 * @author Andy Clark, IBM
 * @author Eric Ye, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void append(XMLString s) {

    /**
     * append
     *
     * @param s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void append(char[] ch, int offset, int length) {

    /**
     * append
     *
     * @param ch
     * @param offset
     * @param length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void append(String s) {

    /**
     * append
     *
     * @param s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void append(char c) {

    /**
     * append
     *
     * @param c
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public void clear() {

    /** Clears the string buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(XMLString s) {

    /** Constructs a string buffer from the specified XMLString. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(char[] ch, int offset, int length) {

    /** Constructs a string buffer from the specified character array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(String s) {

    /** Constructs a string buffer from a String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(char c) {

    /** Constructs a string buffer from a char. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer(int size) {

    /**
     *
     *
     * @param size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public XMLStringBuffer() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
    public static final int DEFAULT_SIZE = 32;

    /** Default buffer size (32). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLStringBuffer.java
public class XMLStringBuffer

/**
 * XMLString is a structure used to pass character arrays. However,
 * XMLStringBuffer is a buffer in which characters can be appended
 * and extends XMLString so that it can be passed to methods
 * expecting an XMLString object. This is a safe operation because
 * it is assumed that any callee will <strong>not</strong> modify
 * the contents of the XMLString structure.
 * <p>
 * The contents of the string are managed by the string buffer. As
 * characters are appended, the string buffer will grow as needed.
 * <p>
 * <strong>Note:</strong> Never set the <code>ch</code>,
 * <code>offset</code>, and <code>length</code> fields directly.
 * These fields are managed by the string buffer. In order to reset
 * the buffer, call <code>clear()</code>.
 *
 * @author Andy Clark, IBM
 * @author Eric Ye, IBM
 *
 */
