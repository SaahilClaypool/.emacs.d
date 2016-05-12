_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public String getEncoding() {

    /** Returns the encoding of the stream, or null if not known. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setEncoding(String encoding) {

    /**
     * Sets the encoding of the stream.
     *
     * @param encoding The new encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public Reader getCharacterStream() {

    /** Returns the character stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setCharacterStream(Reader charStream) {

    /**
     * Sets the character stream. If the character stream is not already
     * opened when this object is instantiated, then the code that opens
     * the stream should also set the character stream on this object.
     * Also, the encoding of the byte stream used by the reader should
     * also be set on this object, if known.
     *
     * @param charStream The new character stream.
     *
     * @see #setEncoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public InputStream getByteStream() {

    /** Returns the byte stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setByteStream(InputStream byteStream) {

    /**
     * Sets the byte stream. If the byte stream is not already opened
     * when this object is instantiated, then the code that opens the
     * stream should also set the byte stream on this object. Also, if
     * the encoding is auto-detected, then the encoding should also be
     * set on this object.
     *
     * @param byteStream The new byte stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public String getBaseSystemId() {

    /** Returns the base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setBaseSystemId(String baseSystemId) {

    /**
     * Sets the base system identifier.
     *
     * @param baseSystemId The new base system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public String getSystemId() {

    /** Returns the system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setSystemId(String systemId) {

    /**
     * Sets the system identifier.
     *
     * @param systemId The new system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public String getPublicId() {

    /** Returns the public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setPublicId(String publicId) {

    /**
     * Sets the public identifier.
     *
     * @param publicId The new public identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public XMLInputSource(String publicId, String systemId,
                          String baseSystemId, Reader charStream,
                          String encoding) {

    /**
     * Constructs an input source from a character stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param charStream   The character stream.
     * @param encoding     The original encoding of the byte stream
     *                     used by the reader, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public XMLInputSource(String publicId, String systemId,
                          String baseSystemId, InputStream byteStream,
                          String encoding) {

    /**
     * Constructs an input source from a byte stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param byteStream   The byte stream.
     * @param encoding     The encoding of the byte stream, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public XMLInputSource(XMLResourceIdentifier resourceIdentifier) {

    /**
     * Constructs an input source from a XMLResourceIdentifier
     * object, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param resourceIdentifier    the XMLResourceIdentifier containing the information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public XMLInputSource(String publicId, String systemId,
                          String baseSystemId) {

    /**
     * Constructs an input source from just the public and system
     * identifiers, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected String fEncoding;

    /** Encoding. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected Reader fCharStream;

    /** Character stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected InputStream fByteStream;

    /** Byte stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected String fBaseSystemId;

    /** Base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected String fSystemId;

    /** System identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected String fPublicId;

    /** Public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
public class XMLInputSource {

/**
 * This class represents an input source for an XML document. The
 * basic properties of an input source are the following:
 * <ul>
 *  <li>public identifier</li>
 *  <li>system identifier</li>
 *  <li>byte stream or character stream</li>
 *  <li>
 * </ul>
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public String getEncoding() {

    /** Returns the encoding of the stream, or null if not known. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setEncoding(String encoding) {

    /**
     * Sets the encoding of the stream.
     *
     * @param encoding The new encoding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public Reader getCharacterStream() {

    /** Returns the character stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setCharacterStream(Reader charStream) {

    /**
     * Sets the character stream. If the character stream is not already
     * opened when this object is instantiated, then the code that opens
     * the stream should also set the character stream on this object.
     * Also, the encoding of the byte stream used by the reader should
     * also be set on this object, if known.
     *
     * @param charStream The new character stream.
     *
     * @see #setEncoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public InputStream getByteStream() {

    /** Returns the byte stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setByteStream(InputStream byteStream) {

    /**
     * Sets the byte stream. If the byte stream is not already opened
     * when this object is instantiated, then the code that opens the
     * stream should also set the byte stream on this object. Also, if
     * the encoding is auto-detected, then the encoding should also be
     * set on this object.
     *
     * @param byteStream The new byte stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public String getBaseSystemId() {

    /** Returns the base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setBaseSystemId(String baseSystemId) {

    /**
     * Sets the base system identifier.
     *
     * @param baseSystemId The new base system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public String getSystemId() {

    /** Returns the system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setSystemId(String systemId) {

    /**
     * Sets the system identifier.
     *
     * @param systemId The new system identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public String getPublicId() {

    /** Returns the public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public void setPublicId(String publicId) {

    /**
     * Sets the public identifier.
     *
     * @param publicId The new public identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public XMLInputSource(String publicId, String systemId,
                          String baseSystemId, Reader charStream,
                          String encoding) {

    /**
     * Constructs an input source from a character stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param charStream   The character stream.
     * @param encoding     The original encoding of the byte stream
     *                     used by the reader, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public XMLInputSource(String publicId, String systemId,
                          String baseSystemId, InputStream byteStream,
                          String encoding) {

    /**
     * Constructs an input source from a byte stream.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     * @param byteStream   The byte stream.
     * @param encoding     The encoding of the byte stream, if known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public XMLInputSource(XMLResourceIdentifier resourceIdentifier) {

    /**
     * Constructs an input source from a XMLResourceIdentifier
     * object, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param resourceIdentifier    the XMLResourceIdentifier containing the information
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    public XMLInputSource(String publicId, String systemId,
                          String baseSystemId) {

    /**
     * Constructs an input source from just the public and system
     * identifiers, leaving resolution of the entity and opening of
     * the input stream up to the caller.
     *
     * @param publicId     The public identifier, if known.
     * @param systemId     The system identifier. This value should
     *                     always be set, if possible, and can be
     *                     relative or absolute. If the system identifier
     *                     is relative, then the base system identifier
     *                     should be set.
     * @param baseSystemId The base system identifier. This value should
     *                     always be set to the fully expanded URI of the
     *                     base system identifier, if possible.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected String fEncoding;

    /** Encoding. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected Reader fCharStream;

    /** Character stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected InputStream fByteStream;

    /** Byte stream. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected String fBaseSystemId;

    /** Base system identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected String fSystemId;

    /** System identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
    protected String fPublicId;

    /** Public identifier. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLInputSource.java
public class XMLInputSource {

/**
 * This class represents an input source for an XML document. The
 * basic properties of an input source are the following:
 * <ul>
 *  <li>public identifier</li>
 *  <li>system identifier</li>
 *  <li>byte stream or character stream</li>
 *  <li>
 * </ul>
 *
 * @author Andy Clark, IBM
 *
 */
