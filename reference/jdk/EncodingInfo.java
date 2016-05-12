_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    static class CharToByteConverterMethods {

    /**
     * Holder of methods from sun.io.CharToByteConverter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    static class CharsetMethods {

    /**
     * Holder of methods from java.nio.charset.Charset and java.nio.charset.CharsetEncoder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    private boolean isPrintable0(char ch) {

    /**
     * Checks whether the specified character is printable or not in this encoding.
     * This method accomplishes this using a java.nio.CharsetEncoder. If NIO isn't
     * available it will attempt use a sun.io.CharToByteConverter.
     *
     * @param ch a code point (0-0x10ffff)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    public boolean isPrintable(char ch) {

    /**
     * Checks whether the specified character is printable or not in this encoding.
     *
     * @param ch a code point (0-0x10ffff)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    public Writer getWriter(OutputStream output)

    /**
     * Returns a writer for this encoding based on
     * an output stream.
     *
     * @return A suitable writer
     * @exception UnsupportedEncodingException There is no convertor
     *  to support this encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    public String getIANAName() {

    /**
     * Returns a MIME charset name of this encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    public EncodingInfo(String ianaName, String javaName, int lastPrintable) {

    /**
     * Creates new <code>EncodingInfo</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
public class EncodingInfo {

/**
 * This class represents an encoding.
 *
 * @version $Id: EncodingInfo.java,v 1.6 2007/10/18 03:39:08 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private static boolean inEncoding(char ch, byte[] data) {

    /**
     * This method is the core of determining if character
     * is in the encoding. The method is not foolproof, because
     * s.getBytes(encoding) has specified behavior only if the
     * characters are in the specified encoding. However this
     * method tries it's best.
     * @param ch the char that was converted using getBytes, or
     * the first char of a high/low pair that was converted.
     * @param data the bytes written out by the call to s.getBytes(encoding);
     * @return true if the character is in the encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private static boolean inEncoding(char high, char low, String encoding) {

    /**
     * This is heart of the code that determines if a given high/low
     * surrogate pair forms a character that is in the given encoding.
     * This method is probably expensive, and the answer should be cached.
     * <p>
     * This method is not a public API,
     * and should only be used internally within the serializer.
     * @param high the high char of
     * a high/low surrogate pair.
     * @param low the low char of a high/low surrogate pair.
     * @param encoding the Java name of the encoding.
     *
     * @xsl.usage internal
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private static boolean inEncoding(char ch, String encoding) {

    /**
     * This is heart of the code that determines if a given character
     * is in the given encoding. This method is probably expensive,
     * and the answer should be cached.
     * <p>
     * This method is not a public API,
     * and should only be used internally within the serializer.
     * @param ch the char in question, that is not a high char of
     * a high/low surrogate pair.
     * @param encoding the Java name of the enocding.
     *
     * @xsl.usage internal
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        final private boolean m_alreadyKnown[] = new boolean[RANGE];

        /**
         * A flag to record if we already know the answer
         * for the given unicode value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        private static final int RANGE = 128;

        /**
         * The number of unicode values explicitly handled
         * by a single EncodingInfo object. This value is
         * tuneable, but is set to 128 because that covers the
         * entire low range of ASCII type chars within a single
         * object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        private InEncoding m_before;

        /**
         * The object, of the same type as this one,
         * that handles unicode values in a range before
         * the range explictly handled by this object, and
         * to which this object may delegate.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        final private int m_explFirst;

        /**
         * m_explFirst through m_explLast is the range of unicode
         * value that this object handles explicitly and does not
         * delegate to a similar object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        final private String m_encoding;

        /**
         * The encoding.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private class EncodingImpl implements InEncoding {

    /**
     * This class implements the
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        public boolean isInEncoding(char high, char low);

        /**
         * Returns true if the high/low surrogate pair forms
         * a character that is in the encoding.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private interface InEncoding {

    /**
     * A simple interface to isolate the implementation.
     * We could also use some new JRE 1.4 methods in another implementation
     * provided we use reflection with them.
     * <p>
     * This interface is not a public API,
     * and should only be used internally within the serializer.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    public EncodingInfo(String name, String javaName)

    /**
     * Create an EncodingInfo object based on the ISO name and Java name.
     * If both parameters are null any character will be considered to
     * be in the encoding. This is useful for when the serializer is in
     * temporary output state, and has no assciated encoding.
     *
     * @param name reference to the ISO name.
     * @param javaName reference to the Java encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    public boolean isInEncoding(char high, char low) {

    /**
     * This is not a public API. It returns true if the
     * character formed by the high/low pair is in the encoding.
     * @param high a char that the a high char of a high/low surrogate pair.
     * @param low a char that is the low char of a high/low surrogate pair.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    public boolean isInEncoding(char ch) {

    /**
     * This is not a public API. It returns true if the
     * char in question is in the encoding.
     * @param ch the char in question.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private InEncoding m_encoding;

    /**
     * A helper object that we can ask if a
     * single char, or a surrogate UTF-16 pair
     * of chars that form a single character,
     * is in this encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    final String javaName;

    /**
     * The name used by the Java convertor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    final String name;

    /**
     * The ISO encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
public final class EncodingInfo extends Object

/**
 * Holds information about a given encoding, which is the Java name for the
 * encoding, the equivalent ISO name.
 * <p>
 * An object of this type has two useful methods
 * <pre>
 * isInEncoding(char ch);
 * </pre>
 * which can be called if the character is not the high one in
 * a surrogate pair and:
 * <pre>
 * isInEncoding(char high, char low);
 * </pre>
 * which can be called if the two characters from a high/low surrogate pair.
 * <p>
 * An EncodingInfo object is a node in a binary search tree. Such a node
 * will answer if a character is in the encoding, and do so for a given
 * range of unicode values (<code>m_first</code> to
 * <code>m_last</code>). It will handle a certain range of values
 * explicitly (<code>m_explFirst</code> to <code>m_explLast</code>).
 * If the unicode point is before that explicit range, that is it
 * is in the range <code>m_first <= value < m_explFirst</code>, then it will delegate to another EncodingInfo object for The root
 * of such a tree, m_before.  Likewise for values in the range
 * <code>m_explLast < value <= m_last</code>, but delgating to <code>m_after</code>
 * <p>
 * Actually figuring out if a code point is in the encoding is expensive. So the
 * purpose of this tree is to cache such determinations, and not to build the
 * entire tree of information at the start, but only build up as much of the
 * tree as is used during the transformation.
 * <p>
 * This Class is not a public API, and should only be used internally within
 * the serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    static class CharToByteConverterMethods {

    /**
     * Holder of methods from sun.io.CharToByteConverter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    static class CharsetMethods {

    /**
     * Holder of methods from java.nio.charset.Charset and java.nio.charset.CharsetEncoder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    private boolean isPrintable0(char ch) {

    /**
     * Checks whether the specified character is printable or not in this encoding.
     * This method accomplishes this using a java.nio.CharsetEncoder. If NIO isn't
     * available it will attempt use a sun.io.CharToByteConverter.
     *
     * @param ch a code point (0-0x10ffff)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    public boolean isPrintable(char ch) {

    /**
     * Checks whether the specified character is printable or not in this encoding.
     *
     * @param ch a code point (0-0x10ffff)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    public Writer getWriter(OutputStream output)

    /**
     * Returns a writer for this encoding based on
     * an output stream.
     *
     * @return A suitable writer
     * @exception UnsupportedEncodingException There is no convertor
     *  to support this encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    public String getIANAName() {

    /**
     * Returns a MIME charset name of this encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
    public EncodingInfo(String ianaName, String javaName, int lastPrintable) {

    /**
     * Creates new <code>EncodingInfo</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/EncodingInfo.java
public class EncodingInfo {

/**
 * This class represents an encoding.
 *
 * @version $Id: EncodingInfo.java,v 1.6 2007/10/18 03:39:08 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private static boolean inEncoding(char ch, byte[] data) {

    /**
     * This method is the core of determining if character
     * is in the encoding. The method is not foolproof, because
     * s.getBytes(encoding) has specified behavior only if the
     * characters are in the specified encoding. However this
     * method tries it's best.
     * @param ch the char that was converted using getBytes, or
     * the first char of a high/low pair that was converted.
     * @param data the bytes written out by the call to s.getBytes(encoding);
     * @return true if the character is in the encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private static boolean inEncoding(char high, char low, String encoding) {

    /**
     * This is heart of the code that determines if a given high/low
     * surrogate pair forms a character that is in the given encoding.
     * This method is probably expensive, and the answer should be cached.
     * <p>
     * This method is not a public API,
     * and should only be used internally within the serializer.
     * @param high the high char of
     * a high/low surrogate pair.
     * @param low the low char of a high/low surrogate pair.
     * @param encoding the Java name of the encoding.
     *
     * @xsl.usage internal
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private static boolean inEncoding(char ch, String encoding) {

    /**
     * This is heart of the code that determines if a given character
     * is in the given encoding. This method is probably expensive,
     * and the answer should be cached.
     * <p>
     * This method is not a public API,
     * and should only be used internally within the serializer.
     * @param ch the char in question, that is not a high char of
     * a high/low surrogate pair.
     * @param encoding the Java name of the enocding.
     *
     * @xsl.usage internal
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        final private boolean m_alreadyKnown[] = new boolean[RANGE];

        /**
         * A flag to record if we already know the answer
         * for the given unicode value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        private static final int RANGE = 128;

        /**
         * The number of unicode values explicitly handled
         * by a single EncodingInfo object. This value is
         * tuneable, but is set to 128 because that covers the
         * entire low range of ASCII type chars within a single
         * object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        private InEncoding m_before;

        /**
         * The object, of the same type as this one,
         * that handles unicode values in a range before
         * the range explictly handled by this object, and
         * to which this object may delegate.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        final private int m_explFirst;

        /**
         * m_explFirst through m_explLast is the range of unicode
         * value that this object handles explicitly and does not
         * delegate to a similar object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        final private String m_encoding;

        /**
         * The encoding.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private class EncodingImpl implements InEncoding {

    /**
     * This class implements the
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
        public boolean isInEncoding(char high, char low);

        /**
         * Returns true if the high/low surrogate pair forms
         * a character that is in the encoding.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private interface InEncoding {

    /**
     * A simple interface to isolate the implementation.
     * We could also use some new JRE 1.4 methods in another implementation
     * provided we use reflection with them.
     * <p>
     * This interface is not a public API,
     * and should only be used internally within the serializer.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    public EncodingInfo(String name, String javaName)

    /**
     * Create an EncodingInfo object based on the ISO name and Java name.
     * If both parameters are null any character will be considered to
     * be in the encoding. This is useful for when the serializer is in
     * temporary output state, and has no assciated encoding.
     *
     * @param name reference to the ISO name.
     * @param javaName reference to the Java encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    public boolean isInEncoding(char high, char low) {

    /**
     * This is not a public API. It returns true if the
     * character formed by the high/low pair is in the encoding.
     * @param high a char that the a high char of a high/low surrogate pair.
     * @param low a char that is the low char of a high/low surrogate pair.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    public boolean isInEncoding(char ch) {

    /**
     * This is not a public API. It returns true if the
     * char in question is in the encoding.
     * @param ch the char in question.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    private InEncoding m_encoding;

    /**
     * A helper object that we can ask if a
     * single char, or a surrogate UTF-16 pair
     * of chars that form a single character,
     * is in this encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    final String javaName;

    /**
     * The name used by the Java convertor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
    final String name;

    /**
     * The ISO encoding name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/EncodingInfo.java
public final class EncodingInfo extends Object

/**
 * Holds information about a given encoding, which is the Java name for the
 * encoding, the equivalent ISO name.
 * <p>
 * An object of this type has two useful methods
 * <pre>
 * isInEncoding(char ch);
 * </pre>
 * which can be called if the character is not the high one in
 * a surrogate pair and:
 * <pre>
 * isInEncoding(char high, char low);
 * </pre>
 * which can be called if the two characters from a high/low surrogate pair.
 * <p>
 * An EncodingInfo object is a node in a binary search tree. Such a node
 * will answer if a character is in the encoding, and do so for a given
 * range of unicode values (<code>m_first</code> to
 * <code>m_last</code>). It will handle a certain range of values
 * explicitly (<code>m_explFirst</code> to <code>m_explLast</code>).
 * If the unicode point is before that explicit range, that is it
 * is in the range <code>m_first <= value < m_explFirst</code>, then it will delegate to another EncodingInfo object for The root
 * of such a tree, m_before.  Likewise for values in the range
 * <code>m_explLast < value <= m_last</code>, but delgating to <code>m_after</code>
 * <p>
 * Actually figuring out if a code point is in the encoding is expensive. So the
 * purpose of this tree is to cache such determinations, and not to build the
 * entire tree of information at the start, but only build up as much of the
 * tree as is used during the transformation.
 * <p>
 * This Class is not a public API, and should only be used internally within
 * the serializer.
 *
 * @xsl.usage internal
 */
