_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Encodings.java
    static EncodingInfo getEncodingInfo(String encoding, boolean allowJavaNames) throws UnsupportedEncodingException {

    /**
     * @param encoding a MIME charset name, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Encodings.java
    static final int DEFAULT_LAST_PRINTABLE = 0x7F;

    /**
     * The last printable character for unknown encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Encodings.java
class Encodings

/**
 * Provides information about encodings. Depends on the Java runtime
 * to provides writers for the different encodings, but can be used
 * to override encoding names and provide the last printable character
 * for each encoding.
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static int toCodePoint(char ch) {

    /**
     * Return the unicode code point represented by the char.
     * A bit of a dummy method, since all it does is return the char,
     * but as an int value.
     * <p>
     * This is not a public API.
     * @param ch the char.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static int toCodePoint(char highSurrogate, char lowSurrogate) {

    /**
     * Return the unicode code point represented by the high/low surrogate pair.
     * <p>
     * This is not a public API.
     * @param highSurrogate the high char of the high/low pair
     * @param lowSurrogate the low char of the high/low pair
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static boolean isLowUTF16Surrogate(char ch) {

    /**
     * Return true if the character is the low member of a surrogate pair.
     * <p>
     * This is not a public API.
     * @param ch the character to test
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static boolean isHighUTF16Surrogate(char ch) {

    /**
     * Return true if the character is the high member of a surrogate pair.
     * <p>
     * This is not a public API.
     * @param ch the character to test
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
        private void loadEncodingInfo() {

        /**
         * Loads a list of all the supported encodings.
         *
         * System property "encodings" formatted using URL syntax may define an
         * external encodings list. Thanks to Sergey Ushakov for the code
         * contribution!
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    public static String convertMime2JavaEncoding(String encoding)

    /**
     * Try the best we can to convert a Java encoding to a XML-style encoding.
     *
     * @param encoding non-null reference to encoding string, java style.
     *
     * @return ISO-style encoding string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    private static String convertJava2MimeEncoding(String encoding)

    /**
     * Try the best we can to convert a Java encoding to a XML-style encoding.
     *
     * @param encoding non-null reference to encoding string, java style.
     *
     * @return ISO-style encoding string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static String getMimeEncoding(String encoding)

    /**
     * Get the proper mime encoding.  From the XSLT recommendation: "The encoding
     * attribute specifies the preferred encoding to use for outputting the result
     * tree. XSLT processors are required to respect values of UTF-8 and UTF-16.
     * For other values, if the XSLT processor does not support the specified
     * encoding it may signal an error; if it does not signal an error it should
     * use UTF-8 or UTF-16 instead. The XSLT processor must not use an encoding
     * whose name does not match the EncName production of the XML Recommendation
     * [XML]. If no encoding attribute is specified, then the XSLT processor should
     * use either UTF-8 or UTF-16."
     *
     * @param encoding Reference to java-style encoding string, which may be null,
     * in which case a default will be found.
     *
     * @return The ISO-style encoding string, or null if failure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static final String DEFAULT_MIME_ENCODING = "UTF-8";

    /** The default encoding, ISO style, ISO style.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static private String toUpperCaseFast(final String s) {

    /**
     * A fast and cheap way to uppercase a String that is
     * only made of printable ASCII characters.
     * <p>
     * This is not a public API.
     * @param s a String of ASCII characters
     * @return an uppercased version of the input String,
     * possibly the same String.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static EncodingInfo getEncodingInfo(String encoding)

    /**
     * Returns the EncodingInfo object for the specified
     * encoding.
     * <p>
     * This is not a public API.
     *
     * @param encoding The encoding
     * @return The object that is used to determine if
     * characters are in the given encoding.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    public static int getLastPrintable()

    /**
     * Returns the last printable character for an unspecified
     * encoding.
     *
     * @return the default size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static Writer getWriter(OutputStream output, String encoding)

    /**
     * Returns a writer for the specified encoding based on
     * an output stream.
     *
     * @param output The output stream
     * @param encoding The encoding
     * @return A suitable writer
     * @throws UnsupportedEncodingException There is no convertor
     *  to support this encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    private static final String ENCODINGS_PROP = "com.sun.org.apache.xalan.internal.serialize.encodings";

    /**
     * Standard filename for properties file with encodings data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    private static final String ENCODINGS_FILE = "com/sun/org/apache/xml/internal/serializer/Encodings.properties";

    /**
     * Standard filename for properties file with encodings data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    private static final int m_defaultLastPrintable = 0x7F;

    /**
     * The last printable character for unknown encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
public final class Encodings extends Object

/**
 * Provides information about encodings. Depends on the Java runtime
 * to provides writers for the different encodings, but can be used
 * to override encoding names and provide the last printable character
 * for each encoding.
 *
 * @version $Revision: 1.11 $ $Date: 2010-11-01 04:34:44 $
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Encodings.java
    static EncodingInfo getEncodingInfo(String encoding, boolean allowJavaNames) throws UnsupportedEncodingException {

    /**
     * @param encoding a MIME charset name, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Encodings.java
    static final int DEFAULT_LAST_PRINTABLE = 0x7F;

    /**
     * The last printable character for unknown encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serialize/Encodings.java
class Encodings

/**
 * Provides information about encodings. Depends on the Java runtime
 * to provides writers for the different encodings, but can be used
 * to override encoding names and provide the last printable character
 * for each encoding.
 *
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static int toCodePoint(char ch) {

    /**
     * Return the unicode code point represented by the char.
     * A bit of a dummy method, since all it does is return the char,
     * but as an int value.
     * <p>
     * This is not a public API.
     * @param ch the char.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static int toCodePoint(char highSurrogate, char lowSurrogate) {

    /**
     * Return the unicode code point represented by the high/low surrogate pair.
     * <p>
     * This is not a public API.
     * @param highSurrogate the high char of the high/low pair
     * @param lowSurrogate the low char of the high/low pair
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static boolean isLowUTF16Surrogate(char ch) {

    /**
     * Return true if the character is the low member of a surrogate pair.
     * <p>
     * This is not a public API.
     * @param ch the character to test
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static boolean isHighUTF16Surrogate(char ch) {

    /**
     * Return true if the character is the high member of a surrogate pair.
     * <p>
     * This is not a public API.
     * @param ch the character to test
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
        private void loadEncodingInfo() {

        /**
         * Loads a list of all the supported encodings.
         *
         * System property "encodings" formatted using URL syntax may define an
         * external encodings list. Thanks to Sergey Ushakov for the code
         * contribution!
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    public static String convertMime2JavaEncoding(String encoding)

    /**
     * Try the best we can to convert a Java encoding to a XML-style encoding.
     *
     * @param encoding non-null reference to encoding string, java style.
     *
     * @return ISO-style encoding string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    private static String convertJava2MimeEncoding(String encoding)

    /**
     * Try the best we can to convert a Java encoding to a XML-style encoding.
     *
     * @param encoding non-null reference to encoding string, java style.
     *
     * @return ISO-style encoding string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static String getMimeEncoding(String encoding)

    /**
     * Get the proper mime encoding.  From the XSLT recommendation: "The encoding
     * attribute specifies the preferred encoding to use for outputting the result
     * tree. XSLT processors are required to respect values of UTF-8 and UTF-16.
     * For other values, if the XSLT processor does not support the specified
     * encoding it may signal an error; if it does not signal an error it should
     * use UTF-8 or UTF-16 instead. The XSLT processor must not use an encoding
     * whose name does not match the EncName production of the XML Recommendation
     * [XML]. If no encoding attribute is specified, then the XSLT processor should
     * use either UTF-8 or UTF-16."
     *
     * @param encoding Reference to java-style encoding string, which may be null,
     * in which case a default will be found.
     *
     * @return The ISO-style encoding string, or null if failure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static final String DEFAULT_MIME_ENCODING = "UTF-8";

    /** The default encoding, ISO style, ISO style.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static private String toUpperCaseFast(final String s) {

    /**
     * A fast and cheap way to uppercase a String that is
     * only made of printable ASCII characters.
     * <p>
     * This is not a public API.
     * @param s a String of ASCII characters
     * @return an uppercased version of the input String,
     * possibly the same String.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static EncodingInfo getEncodingInfo(String encoding)

    /**
     * Returns the EncodingInfo object for the specified
     * encoding.
     * <p>
     * This is not a public API.
     *
     * @param encoding The encoding
     * @return The object that is used to determine if
     * characters are in the given encoding.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    public static int getLastPrintable()

    /**
     * Returns the last printable character for an unspecified
     * encoding.
     *
     * @return the default size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    static Writer getWriter(OutputStream output, String encoding)

    /**
     * Returns a writer for the specified encoding based on
     * an output stream.
     *
     * @param output The output stream
     * @param encoding The encoding
     * @return A suitable writer
     * @throws UnsupportedEncodingException There is no convertor
     *  to support this encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    private static final String ENCODINGS_PROP = "com.sun.org.apache.xalan.internal.serialize.encodings";

    /**
     * Standard filename for properties file with encodings data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    private static final String ENCODINGS_FILE = "com/sun/org/apache/xml/internal/serializer/Encodings.properties";

    /**
     * Standard filename for properties file with encodings data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
    private static final int m_defaultLastPrintable = 0x7F;

    /**
     * The last printable character for unknown encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/Encodings.java
public final class Encodings extends Object

/**
 * Provides information about encodings. Depends on the Java runtime
 * to provides writers for the different encodings, but can be used
 * to override encoding names and provide the last printable character
 * for each encoding.
 *
 * @version $Revision: 1.11 $ $Date: 2010-11-01 04:34:44 $
 * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a>
 */
