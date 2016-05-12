_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
        private static void formatTwoDigits(int n, StringBuilder buf) {

        /** formats Integer into two-character-wide string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
        private static void formatTimeZone(Calendar cal, StringBuilder buf) {

        /** formats time zone specifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
    public static int _printBase64Binary(byte[] input, int offset, int len, byte[] out, int ptr) {

    /**
     * Encodes a byte array into another byte array by first doing base64 encoding
     * then encoding the result in ASCII.
     *
     * The caller must supply a big enough buffer.
     *
     * @return
     *      the value of {@code ptr+((len+2)/3)*4}, which is the new offset
     *      in the output buffer where the further bytes should be placed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
    public static int _printBase64Binary(byte[] input, int offset, int len, char[] buf, int ptr) {

    /**
     * Encodes a byte array into a char array by doing base64 encoding.
     *
     * The caller must supply a big enough buffer.
     *
     * @return
     *      the value of {@code ptr+((len+2)/3)*4}, which is the new offset
     *      in the output buffer where the further bytes should be placed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
    public static byte[] _parseBase64Binary(String text) {

    /**
     * @param text
     *      base64Binary data is likely to be long, and decoding requires
     *      each character to be accessed twice (once for counting length, another
     *      for decoding.)
     *
     *      A benchmark showed that taking {@link String} is faster, presumably
     *      because JIT can inline a lot of string access (with data of 1K chars, it was twice as fast)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
    private static int guessLength(String text) {

    /**
     * computes the length of binary data speculatively.
     *
     * <p>
     * Our requirement is to create byte[] of the exact length to store the binary data.
     * If we do this in a straight-forward way, it takes two passes over the data.
     * Experiments show that this is a non-trivial overhead (35% or so is spent on
     * the first pass in calculating the length.)
     *
     * <p>
     * So the approach here is that we compute the length speculatively, without looking
     * at the whole contents. The obtained speculative value is never less than the
     * actual length of the binary data, but it may be bigger. So if the speculation
     * goes wrong, we'll pay the cost of reallocation and buffer copying.
     *
     * <p>
     * If the base64 text is tightly packed with no indentation nor illegal char
     * (like what most web services produce), then the speculation of this method
     * will be correct, so we get the performance benefit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
    public static String installHook(String s) {

    /**
     * Just return the string passed as a parameter but
     * installs an instance of this class as the DatatypeConverter
     * implementation. Used from static fixed value initializers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
    public static QName _parseQName(CharSequence text, NamespaceContext nsc) {

    /**
     * @return null if fails to convert.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
    public static int _parseInt(CharSequence s) {

    /**
     * Faster but less robust String->int conversion.
     *
     * Note that:
     * <ol>
     *  <li>XML Schema allows '+', but {@link Integer#valueOf(String)} is not.
     *  <li>XML Schema allows leading and trailing (but not in-between) whitespaces.
     *      {@link Integer#valueOf(String)} doesn't allow any.
     * </ol>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
    public static final DatatypeConverterInterface theInstance = new DatatypeConverterImpl();

    /**
     * To avoid re-creating instances, we cache one instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/DatatypeConverterImpl.java
final class DatatypeConverterImpl implements DatatypeConverterInterface {

/**
 * This class is the JAXB RI's default implementation of the
 * {@link DatatypeConverterInterface}.
 *
 * <p>
 * When client applications specify the use of the static print/parse
 * methods in {@link DatatypeConverter}, it will delegate
 * to this class.
 *
 * <p>
 * This class is responsible for whitespace normalization.
 *
 * @author <ul><li>Ryan Shoemaker, Sun Microsystems, Inc.</li></ul>
 * @since JAXB2.1
 */
