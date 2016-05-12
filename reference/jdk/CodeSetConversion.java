_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public final static CodeSetConversion impl() {

    /**
     * CodeSetConversion is a singleton, and this is the access point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public CodeSetComponentInfo.CodeSetContext negotiate(CodeSetComponentInfo client,
                                                         CodeSetComponentInfo server) {

    /**
     * Perform the code set negotiation algorithm and come up with
     * the two encodings to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private int selectEncoding(CodeSetComponentInfo.CodeSetComponent client,
                               CodeSetComponentInfo.CodeSetComponent server) {

    /**
     * Follows the code set negotiation algorithm in CORBA formal 99-10-07 13.7.2.
     *
     * Returns the proper negotiated OSF character encoding number or
     * CodeSetConversion.FALLBACK_CODESET.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public BTCConverter getBTCConverter(OSFCodeSetRegistry.Entry codeset,
                                        boolean defaultToLittleEndian) {

    /**
     * BTCConverter factory for fixed width multibyte encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public BTCConverter getBTCConverter(OSFCodeSetRegistry.Entry codeset) {

    /**
     * BTCConverter factory for single byte or variable width encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public CTBConverter getCTBConverter(OSFCodeSetRegistry.Entry codeset,
                                        boolean littleEndian,
                                        boolean useByteOrderMarkers) {

    /**
     * CTB converter factory for multibyte (mainly fixed) encodings.
     *
     * Because of the awkwardness with byte order markers and the possibility of
     * using UCS-2, you must specify both the endianness of the stream as well as
     * whether or not to use byte order markers if applicable.  UCS-2 has no byte
     * order markers.  UTF-16 has optional markers.
     *
     * If you select useByteOrderMarkers, there is no guarantee that the encoding
     * will use the endianness specified.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public CTBConverter getCTBConverter(OSFCodeSetRegistry.Entry codeset) {

    /**
     * CTB converter factory for single byte or variable length encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
        private void switchToConverter(OSFCodeSetRegistry.Entry newCodeSet) {

        /**
         * The current solution for dealing with UTF-16 in CORBA
         * is that if our sun.io converter requires byte order markers,
         * and then we see a CORBA wstring/wchar without them, we
         * switch to the sun.io converter that doesn't require them.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
        private boolean hasUTF16ByteOrderMarker(byte[] array, int offset, int length) {

        /**
         * Utility method for determining if a UTF-16 byte order marker is present.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private class UTF16BTCConverter extends JavaBTCConverter

    /**
     * Special converter for UTF16 since it's required to optionally
     * support a byte order marker while the internal Java converters
     * either require it or require that it isn't there.
     *
     * The solution is to check for the byte order marker, and if we
     * need to do something differently, switch internal converters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
        protected CharsetDecoder getConverter(String javaCodeSetName) {

        /**
         * Utility method to find a CharsetDecoder in the
         * cache or create a new one if necessary.  Throws an
         * INTERNAL if the code set is unknown.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private class JavaBTCConverter extends BTCConverter

    /**
     * Implementation of BTCConverter which uses a sun.io.ByteToCharConverter
     * for the real work.  Handles translation of exceptions to the
     * appropriate CORBA versions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private class UTF16CTBConverter extends JavaCTBConverter

    /**
     * Special UTF16 converter which can either always write a BOM
     * or use a specified byte order without one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private class JavaCTBConverter extends CTBConverter

    /**
     * Implementation of CTBConverter which uses a nio.Charset.CharsetEncoder
     * to do the real work.  Handles translation of exceptions to the
     * appropriate CORBA versions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public abstract static class BTCConverter

    /**
     * Abstraction for byte to char conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public abstract static class CTBConverter

    /**
     * Abstraction for char to byte conversion.
     *
     * Must be used in the proper sequence:
     *
     * 1)  convert
     * 2)  Optional getNumBytes and/or getAlignment (if necessary)
     * 3)  getBytes (see warning)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
public class CodeSetConversion

/**
 * Collection of classes, interfaces, and factory methods for
 * CORBA code set conversion.
 *
 * This is mainly used to shield other code from the sun.io
 * converters which might change, as well as provide some basic
 * translation from conversion to CORBA error exceptions.  Some
 * extra work is required here to facilitate the way CORBA
 * says it uses UTF-16 as of the 00-11-03 spec.
 *
 * REVISIT - Since the nio.Charset and nio.Charset.Encoder/Decoder
 *           use NIO ByteBuffer and NIO CharBuffer, the interaction
 *           and interface between this class and the CDR streams
 *           should be looked at more closely for optimizations to
 *           avoid unnecessary copying of data between char[] &
 *           CharBuffer and byte[] & ByteBuffer, especially
 *           DirectByteBuffers.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public final static CodeSetConversion impl() {

    /**
     * CodeSetConversion is a singleton, and this is the access point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public CodeSetComponentInfo.CodeSetContext negotiate(CodeSetComponentInfo client,
                                                         CodeSetComponentInfo server) {

    /**
     * Perform the code set negotiation algorithm and come up with
     * the two encodings to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private int selectEncoding(CodeSetComponentInfo.CodeSetComponent client,
                               CodeSetComponentInfo.CodeSetComponent server) {

    /**
     * Follows the code set negotiation algorithm in CORBA formal 99-10-07 13.7.2.
     *
     * Returns the proper negotiated OSF character encoding number or
     * CodeSetConversion.FALLBACK_CODESET.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public BTCConverter getBTCConverter(OSFCodeSetRegistry.Entry codeset,
                                        boolean defaultToLittleEndian) {

    /**
     * BTCConverter factory for fixed width multibyte encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public BTCConverter getBTCConverter(OSFCodeSetRegistry.Entry codeset) {

    /**
     * BTCConverter factory for single byte or variable width encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public CTBConverter getCTBConverter(OSFCodeSetRegistry.Entry codeset,
                                        boolean littleEndian,
                                        boolean useByteOrderMarkers) {

    /**
     * CTB converter factory for multibyte (mainly fixed) encodings.
     *
     * Because of the awkwardness with byte order markers and the possibility of
     * using UCS-2, you must specify both the endianness of the stream as well as
     * whether or not to use byte order markers if applicable.  UCS-2 has no byte
     * order markers.  UTF-16 has optional markers.
     *
     * If you select useByteOrderMarkers, there is no guarantee that the encoding
     * will use the endianness specified.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public CTBConverter getCTBConverter(OSFCodeSetRegistry.Entry codeset) {

    /**
     * CTB converter factory for single byte or variable length encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
        private void switchToConverter(OSFCodeSetRegistry.Entry newCodeSet) {

        /**
         * The current solution for dealing with UTF-16 in CORBA
         * is that if our sun.io converter requires byte order markers,
         * and then we see a CORBA wstring/wchar without them, we
         * switch to the sun.io converter that doesn't require them.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
        private boolean hasUTF16ByteOrderMarker(byte[] array, int offset, int length) {

        /**
         * Utility method for determining if a UTF-16 byte order marker is present.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private class UTF16BTCConverter extends JavaBTCConverter

    /**
     * Special converter for UTF16 since it's required to optionally
     * support a byte order marker while the internal Java converters
     * either require it or require that it isn't there.
     *
     * The solution is to check for the byte order marker, and if we
     * need to do something differently, switch internal converters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
        protected CharsetDecoder getConverter(String javaCodeSetName) {

        /**
         * Utility method to find a CharsetDecoder in the
         * cache or create a new one if necessary.  Throws an
         * INTERNAL if the code set is unknown.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private class JavaBTCConverter extends BTCConverter

    /**
     * Implementation of BTCConverter which uses a sun.io.ByteToCharConverter
     * for the real work.  Handles translation of exceptions to the
     * appropriate CORBA versions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private class UTF16CTBConverter extends JavaCTBConverter

    /**
     * Special UTF16 converter which can either always write a BOM
     * or use a specified byte order without one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    private class JavaCTBConverter extends CTBConverter

    /**
     * Implementation of CTBConverter which uses a nio.Charset.CharsetEncoder
     * to do the real work.  Handles translation of exceptions to the
     * appropriate CORBA versions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public abstract static class BTCConverter

    /**
     * Abstraction for byte to char conversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
    public abstract static class CTBConverter

    /**
     * Abstraction for char to byte conversion.
     *
     * Must be used in the proper sequence:
     *
     * 1)  convert
     * 2)  Optional getNumBytes and/or getAlignment (if necessary)
     * 3)  getBytes (see warning)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/CodeSetConversion.java
public class CodeSetConversion

/**
 * Collection of classes, interfaces, and factory methods for
 * CORBA code set conversion.
 *
 * This is mainly used to shield other code from the sun.io
 * converters which might change, as well as provide some basic
 * translation from conversion to CORBA error exceptions.  Some
 * extra work is required here to facilitate the way CORBA
 * says it uses UTF-16 as of the 00-11-03 spec.
 *
 * REVISIT - Since the nio.Charset and nio.Charset.Encoder/Decoder
 *           use NIO ByteBuffer and NIO CharBuffer, the interaction
 *           and interface between this class and the CDR streams
 *           should be looked at more closely for optimizations to
 *           avoid unnecessary copying of data between char[] &
 *           CharBuffer and byte[] & ByteBuffer, especially
 *           DirectByteBuffers.
 *
 */
