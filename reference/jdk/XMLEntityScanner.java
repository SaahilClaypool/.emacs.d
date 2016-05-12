_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                } else {

                    /*** NEWLINE NORMALIZATION ***
                     * else {
                     * if (fCurrentEntity.ch[fCurrentEntity.position + 1] == '\r'
                     * && external) {
                     * fCurrentEntity.position++;
                     * }
                     * }
                     * /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final boolean skipDeclSpaces() throws IOException {

    /**
     * Skips space characters appearing immediately on the input that would
     * match non-terminal S (0x09, 0x0A, 0x0D, 0x20) before end of line
     * normalization is performed. This is useful when scanning structures
     * such as the XMLDecl and TextDecl that can only contain US-ASCII
     * characters.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if they would
     * match non-terminal S before end of line normalization is performed.
     *
     * @return Returns true if at least one space character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isSpace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void invokeListeners(int loadPos){

    /**
     *
     * @param loadPos Starting position from which new data is being loaded into scanner buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void registerListener(XMLBufferListener listener) {

    /**
     * Registers the listener object and provides callback.
     * @param listener listener to which call back should be provided when scanner buffer
     * is being changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    //

    /**
     * xxx not removing endEntity() so that i remember that we need to implement it.
     * Ends an entity.
     *
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected Object[] getEncodingName(byte[] b4, int count) {

    /**
     * Returns the IANA encoding name that is auto-detected from
     * the bytes specified, with the endian-ness of that encoding where appropriate.
     *
     * @param b4    The first four bytes of the input.
     * @param count The number of bytes actually read.
     * @return a 2-element array:  the first element, an IANA-encoding string,
     *  the second element a Boolean which is true iff the document is big endian, false
     *  if it's little-endian, and null if the distinction isn't relevant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected Reader createReader(InputStream inputStream, String encoding, Boolean isBigEndian)

    /**
     * Creates a reader capable of reading the given input stream in
     * the specified encoding.
     *
     * @param inputStream  The input stream.
     * @param encoding     The encoding name that the input stream is
     *                     encoded using. If the user has specified that
     *                     Java encoding names are allowed, then the
     *                     encoding name may be a Java encoding name;
     *                     otherwise, it is an ianaEncoding name.
     * @param isBigEndian   For encodings (like uCS-4), whose names cannot
     *                      specify a byte order, this tells whether the order is bigEndian.  null menas
     *                      unknown or not relevant.
     *
     * @return Returns a reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    final boolean load(int offset, boolean changeEntity, boolean notify)

    /**
     * Loads a chunk of text.
     *
     * @param offset       The offset into the character buffer to
     *                     read the next batch of characters.
     * @param changeEntity True if the load should change entities
     *                     at the end of the entity, otherwise leave
     *                     the current entity in place and the entity
     *                     boundary will be signaled by the return
     *                     value.
     * @param notify       Determine whether to notify listeners of
     *                     the event
     *
     * @returns Returns true if the entity changed as a result of this
     *          load operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean skipString(String s) throws IOException {

    /**
     * Skips the specified string appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if all
     * the characters are skipped.
     *
     * @param s The string to skip.
     *
     * @return Returns true if the string was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean arrangeCapacity(int length, boolean changeEntity) throws IOException{

    /**
     * @param legnth This function checks that following number of characters are available.
     * to the underlying buffer.
     * @param if the underlying function should change the entity
     * @return This function returns true if capacity asked is available.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean arrangeCapacity(int length) throws IOException{

    /**
     * @param legnth This function checks that following number of characters are available.
     * to the underlying buffer.
     * @return This function returns true if capacity asked is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean skipSpaces() throws IOException {

    /**
     * Skips space characters appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if they are
     * space characters.
     *
     * @return Returns true if at least one space character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isSpace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean skipChar(int c) throws IOException {

    /**
     * Skips a character appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The character is consumed only if it matches
     * the specified character.
     *
     * @param c The character to skip.
     *
     * @return Returns true if the character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                        else {

                        /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean scanData(String delimiter, XMLStringBuffer buffer)

    /**
     * Scans a range of character data up to the specified delimiter,
     * setting the fields of the XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This assumes that the length of the delimiter
     * and that the delimiter contains at least one character.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of character data. This method may return before
     * the delimiter due to reaching the end of the input buffer or any
     * other reason.
     * <p>
     * @param delimiter The string that signifies the end of the character
     *                  data to be scanned.
     * @param buffer    The XMLStringBuffer to fill.
     *
     * @return Returns true if there is more data to scan, false otherwise.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    private void storeWhiteSpace(int whiteSpacePos) {

    /**
     * Save whitespace information. Increase the whitespace buffer by 100
     * when needed.
     *
     * For XML 1.0, legal characters below 0x20 are 0x09 (TAB), 0x0A (LF) and 0x0D (CR).
     *
     * @param whiteSpacePos position of a whitespace in the scanner entity buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                } else {

                    /*** NEWLINE NORMALIZATION ***
                     * if (fCurrentEntity.ch[fCurrentEntity.position] == '\r'
                     * && external) {
                     * fCurrentEntity.position++;
                     * offset++;
                     * }
                     * /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                } else if (c == '\n') {

                    /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                    else {

                    /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public int scanLiteral(int quote, XMLString content)

    /**
     * Scans a range of attribute value data, setting the fields of the
     * XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of attribute value data. This method may return
     * before the quote character due to reaching the end of the input
     * buffer or any other reason.
     * <p>
     * <strong>Note:</strong> The fields contained in the XMLString
     * structure are not guaranteed to remain valid upon subsequent calls
     * to the entity scanner. Therefore, the caller is responsible for
     * immediately using the returned character data or making a copy of
     * the character data.
     *
     * @param quote   The quote character that signifies the end of the
     *                attribute value data.
     * @param content The content structure to fill.
     *
     * @return Returns the next character on the input, if known. This
     *         value may be -1 but this does <em>note</em> designate
     *         end of file.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                    else {

                    /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public int scanContent(XMLString content) throws IOException {

    /**
     * CHANGED:
     * Scans a range of parsed character data, This function appends the character data to
     * the supplied buffer.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of parsed character data. This method may return
     * before markup due to reaching the end of the input buffer or any
     * other reason.
     * <p>
     *
     * @param content The content structure to fill.
     *
     * @return Returns the next character on the input, if known. This
     *         value may be -1 but this does <em>note</em> designate
     *         end of file.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected void checkLimit(Limit limit, ScannedEntity entity, int offset, int length) {

    /**
     * Checks whether the value of the specified Limit exceeds its limit
     *
     * @param limit The Limit to be checked.
     * @param entity The current entity.
     * @param offset The index of the first byte
     * @param length The length of the entity scanned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean scanQName(QName qname) throws IOException {

    /**
     * Scans a qualified name from the input, setting the fields of the
     * QName structure appropriately.
     * <p>
     * <strong>Note:</strong> The qualified name characters are consumed.
     * <p>
     * <strong>Note:</strong> The strings used to set the values of the
     * QName structure must be symbols. The SymbolTable can be used for
     * this purpose.
     *
     * @param qname The qualified name structure to fill.
     *
     * @return Returns true if a qualified name appeared immediately on
     *         the input and was scanned, false otherwise.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isName
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isNameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public String scanName() throws IOException {

    /**
     * Returns a string matching the Name production appearing immediately
     * on the input as a symbol, or null if no Name string is present.
     * <p>
     * <strong>Note:</strong> The Name characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isName
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isNameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public String scanNmtoken() throws IOException {

    /**
     * Returns a string matching the NMTOKEN production appearing immediately
     * on the input as a symbol, or null if NMTOKEN Name string is present.
     * <p>
     * <strong>Note:</strong> The NMTOKEN characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public int scanChar() throws IOException {

    /**
     * Returns the next character on the input.
     * <p>
     * <strong>Note:</strong> The character is consumed.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public int peekChar() throws IOException {

    /**
     * Returns the next character on the input.
     * <p>
     * <strong>Note:</strong> The character is <em>not</em> consumed.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final boolean isExternal() {

    /** Returns true if the current entity being scanned is external. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final void setEncoding(String encoding) throws IOException {

    /**
     * Sets the encoding of the scanner. This method is used by the
     * scanners if the XMLDecl or TextDecl line contains an encoding
     * pseudo-attribute.
     * <p>
     * <strong>Note:</strong> The underlying character reader on the
     * current entity will be changed to accomodate the new encoding.
     * However, the new encoding is ignored if the current reader was
     * not constructed from an input stream (e.g. an external entity
     * that is resolved directly to the appropriate java.io.Reader
     * object).
     *
     * @param encoding The IANA encoding name of the new encoding.
     *
     * @throws IOException Thrown if the new encoding is not supported.
     *
     * @see com.sun.org.apache.xerces.internal.util.EncodingMap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getEncoding() {

    /**
     * Returns the encoding of the current entity.
     * Note that, for a given entity, this value can only be
     * considered final once the encoding declaration has been read (or once it
     * has been determined that there is no such declaration) since, no encoding
     * having been specified on the XMLInputSource, the parser
     * will make an initial "guess" which could be in error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    /** the version of the current entity being scanned */

    ///////////////// Locator methods finished.
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setPublicId(String publicId) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier#setPublicId(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getPublicId() {

    /** Returns the public identifier.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setLiteralSystemId(String systemId) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier#setLiteralSystemId(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getLiteralSystemId() {

    /** Returns the literal system identifier.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setExpandedSystemId(String systemId) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier#setExpandedSystemId(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getExpandedSystemId() {

    /** Returns the expanded system identifier.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setColumnNumber(int col) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLLocator#setColumnNumber(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setLineNumber(int line) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLLocator#setLineNumber(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final int getLineNumber(){

    ///////////// Locator methods start.
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setBaseSystemId(String systemId) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier#setBaseSystemId(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getBaseSystemId() {

    /**
     * Returns the base system identifier of the currently scanned
     * entity, or null if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final void setCurrentEntity(Entity.ScannedEntity scannedEntity){

    /** set the instance of current scanned entity.
     *   @param ScannedEntity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final void setXMLVersion(String xmlVersion) {

    /**
     * Sets the XML version. This method is used by the
     * scanners to report the value of the version pseudo-attribute
     * in an XML or text declaration.
     *
     * @param xmlVersion the XML version of the current entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getXMLVersion() {

    /**
     * Returns the XML version of the current entity. This will normally be the
     * value from the XML or text declaration or defaulted by the parser. Note that
     * that this value may be different than the version of the processing rules
     * applied to the current entity. For instance, an XML 1.1 document may refer to
     * XML 1.0 entities. In such a case the rules of XML 1.1 are applied to the entire
     * document. Also note that, for a given entity, this value can only be considered
     * final once the XML or text declaration has been read or once it has been
     * determined that there is no such declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void reset(XMLComponentManager componentManager)

    /**
     * Resets the component. The component can query the component manager
     * about any features and properties that affect the operation of the
     * component.
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Thrown by component on initialization error.
     *                      For example, if a feature or property is
     *                      required for the operation of the component, the
     *                      component manager may throw a
     *                      SAXNotRecognizedException or a
     *                      SAXNotSupportedException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void reset(PropertyManager propertyManager){

    /**
     * Resets the components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public XMLEntityScanner(PropertyManager propertyManager, XMLEntityManager entityManager) {

    /**  private constructor, this class can only be instantiated within this class. Instance of this class should
     *    be obtained using getEntityScanner() or getEntityScanner(ScannedEntity scannedEntity)
     *    @see getEntityScanner()
     *    @see getEntityScanner(ScannedEntity)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public XMLEntityScanner() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow Java encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected boolean fAllowJavaEncodings;

    /**
     * Allow Java encoding names. This feature identifier is:
     * http://apache.org/xml/features/allow-java-encodings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    private static final EOFException END_OF_DOCUMENT_ENTITY = new EOFException() {

    /**
     * To signal the end of the document entity, this exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    private static final boolean DEBUG_BUFFER = false;

    /**
     * Debug printing of buffer. This debugging flag works best when you
     * resize the DEFAULT_BUFFER_SIZE down to something reasonable like
     * 64 characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    private static final boolean DEBUG_ENCODINGS = false;

    /** Debug switching readers for encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected XMLLimitAnalyzer fLimitAnalyzer = null;

    /** Limit analyzer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected XMLSecurityManager fSecurityManager = null;

    /** Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
public class XMLEntityScanner implements XMLLocator  {

/**
 * Implements the entity scanner methods.
 *
 * @author Neeraj Bajaj, Sun Microsystems
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author K.Venugopal Sun Microsystems
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                } else {

                    /*** NEWLINE NORMALIZATION ***
                     * else {
                     * if (fCurrentEntity.ch[fCurrentEntity.position + 1] == '\r'
                     * && external) {
                     * fCurrentEntity.position++;
                     * }
                     * }
                     * /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final boolean skipDeclSpaces() throws IOException {

    /**
     * Skips space characters appearing immediately on the input that would
     * match non-terminal S (0x09, 0x0A, 0x0D, 0x20) before end of line
     * normalization is performed. This is useful when scanning structures
     * such as the XMLDecl and TextDecl that can only contain US-ASCII
     * characters.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if they would
     * match non-terminal S before end of line normalization is performed.
     *
     * @return Returns true if at least one space character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isSpace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void invokeListeners(int loadPos){

    /**
     *
     * @param loadPos Starting position from which new data is being loaded into scanner buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void registerListener(XMLBufferListener listener) {

    /**
     * Registers the listener object and provides callback.
     * @param listener listener to which call back should be provided when scanner buffer
     * is being changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    //

    /**
     * xxx not removing endEntity() so that i remember that we need to implement it.
     * Ends an entity.
     *
     * @throws XNIException Thrown by entity handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected Object[] getEncodingName(byte[] b4, int count) {

    /**
     * Returns the IANA encoding name that is auto-detected from
     * the bytes specified, with the endian-ness of that encoding where appropriate.
     *
     * @param b4    The first four bytes of the input.
     * @param count The number of bytes actually read.
     * @return a 2-element array:  the first element, an IANA-encoding string,
     *  the second element a Boolean which is true iff the document is big endian, false
     *  if it's little-endian, and null if the distinction isn't relevant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected Reader createReader(InputStream inputStream, String encoding, Boolean isBigEndian)

    /**
     * Creates a reader capable of reading the given input stream in
     * the specified encoding.
     *
     * @param inputStream  The input stream.
     * @param encoding     The encoding name that the input stream is
     *                     encoded using. If the user has specified that
     *                     Java encoding names are allowed, then the
     *                     encoding name may be a Java encoding name;
     *                     otherwise, it is an ianaEncoding name.
     * @param isBigEndian   For encodings (like uCS-4), whose names cannot
     *                      specify a byte order, this tells whether the order is bigEndian.  null menas
     *                      unknown or not relevant.
     *
     * @return Returns a reader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    final boolean load(int offset, boolean changeEntity, boolean notify)

    /**
     * Loads a chunk of text.
     *
     * @param offset       The offset into the character buffer to
     *                     read the next batch of characters.
     * @param changeEntity True if the load should change entities
     *                     at the end of the entity, otherwise leave
     *                     the current entity in place and the entity
     *                     boundary will be signaled by the return
     *                     value.
     * @param notify       Determine whether to notify listeners of
     *                     the event
     *
     * @returns Returns true if the entity changed as a result of this
     *          load operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean skipString(String s) throws IOException {

    /**
     * Skips the specified string appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if all
     * the characters are skipped.
     *
     * @param s The string to skip.
     *
     * @return Returns true if the string was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean arrangeCapacity(int length, boolean changeEntity) throws IOException{

    /**
     * @param legnth This function checks that following number of characters are available.
     * to the underlying buffer.
     * @param if the underlying function should change the entity
     * @return This function returns true if capacity asked is available.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean arrangeCapacity(int length) throws IOException{

    /**
     * @param legnth This function checks that following number of characters are available.
     * to the underlying buffer.
     * @return This function returns true if capacity asked is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean skipSpaces() throws IOException {

    /**
     * Skips space characters appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The characters are consumed only if they are
     * space characters.
     *
     * @return Returns true if at least one space character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isSpace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean skipChar(int c) throws IOException {

    /**
     * Skips a character appearing immediately on the input.
     * <p>
     * <strong>Note:</strong> The character is consumed only if it matches
     * the specified character.
     *
     * @param c The character to skip.
     *
     * @return Returns true if the character was skipped.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                        else {

                        /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean scanData(String delimiter, XMLStringBuffer buffer)

    /**
     * Scans a range of character data up to the specified delimiter,
     * setting the fields of the XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This assumes that the length of the delimiter
     * and that the delimiter contains at least one character.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of character data. This method may return before
     * the delimiter due to reaching the end of the input buffer or any
     * other reason.
     * <p>
     * @param delimiter The string that signifies the end of the character
     *                  data to be scanned.
     * @param buffer    The XMLStringBuffer to fill.
     *
     * @return Returns true if there is more data to scan, false otherwise.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    private void storeWhiteSpace(int whiteSpacePos) {

    /**
     * Save whitespace information. Increase the whitespace buffer by 100
     * when needed.
     *
     * For XML 1.0, legal characters below 0x20 are 0x09 (TAB), 0x0A (LF) and 0x0D (CR).
     *
     * @param whiteSpacePos position of a whitespace in the scanner entity buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                } else {

                    /*** NEWLINE NORMALIZATION ***
                     * if (fCurrentEntity.ch[fCurrentEntity.position] == '\r'
                     * && external) {
                     * fCurrentEntity.position++;
                     * offset++;
                     * }
                     * /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                } else if (c == '\n') {

                    /***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                    else {

                    /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public int scanLiteral(int quote, XMLString content)

    /**
     * Scans a range of attribute value data, setting the fields of the
     * XMLString structure, appropriately.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of attribute value data. This method may return
     * before the quote character due to reaching the end of the input
     * buffer or any other reason.
     * <p>
     * <strong>Note:</strong> The fields contained in the XMLString
     * structure are not guaranteed to remain valid upon subsequent calls
     * to the entity scanner. Therefore, the caller is responsible for
     * immediately using the returned character data or making a copy of
     * the character data.
     *
     * @param quote   The quote character that signifies the end of the
     *                attribute value data.
     * @param content The content structure to fill.
     *
     * @return Returns the next character on the input, if known. This
     *         value may be -1 but this does <em>note</em> designate
     *         end of file.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
                    else {

                    /*** NEWLINE NORMALIZATION ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public int scanContent(XMLString content) throws IOException {

    /**
     * CHANGED:
     * Scans a range of parsed character data, This function appends the character data to
     * the supplied buffer.
     * <p>
     * <strong>Note:</strong> The characters are consumed.
     * <p>
     * <strong>Note:</strong> This method does not guarantee to return
     * the longest run of parsed character data. This method may return
     * before markup due to reaching the end of the input buffer or any
     * other reason.
     * <p>
     *
     * @param content The content structure to fill.
     *
     * @return Returns the next character on the input, if known. This
     *         value may be -1 but this does <em>note</em> designate
     *         end of file.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected void checkLimit(Limit limit, ScannedEntity entity, int offset, int length) {

    /**
     * Checks whether the value of the specified Limit exceeds its limit
     *
     * @param limit The Limit to be checked.
     * @param entity The current entity.
     * @param offset The index of the first byte
     * @param length The length of the entity scanned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public boolean scanQName(QName qname) throws IOException {

    /**
     * Scans a qualified name from the input, setting the fields of the
     * QName structure appropriately.
     * <p>
     * <strong>Note:</strong> The qualified name characters are consumed.
     * <p>
     * <strong>Note:</strong> The strings used to set the values of the
     * QName structure must be symbols. The SymbolTable can be used for
     * this purpose.
     *
     * @param qname The qualified name structure to fill.
     *
     * @return Returns true if a qualified name appeared immediately on
     *         the input and was scanned, false otherwise.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isName
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isNameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public String scanName() throws IOException {

    /**
     * Returns a string matching the Name production appearing immediately
     * on the input as a symbol, or null if no Name string is present.
     * <p>
     * <strong>Note:</strong> The Name characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isName
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isNameStart
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public String scanNmtoken() throws IOException {

    /**
     * Returns a string matching the NMTOKEN production appearing immediately
     * on the input as a symbol, or null if NMTOKEN Name string is present.
     * <p>
     * <strong>Note:</strong> The NMTOKEN characters are consumed.
     * <p>
     * <strong>Note:</strong> The string returned must be a symbol. The
     * SymbolTable can be used for this purpose.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     *
     * @see com.sun.org.apache.xerces.internal.util.SymbolTable
     * @see com.sun.org.apache.xerces.internal.util.XMLChar#isName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public int scanChar() throws IOException {

    /**
     * Returns the next character on the input.
     * <p>
     * <strong>Note:</strong> The character is consumed.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public int peekChar() throws IOException {

    /**
     * Returns the next character on the input.
     * <p>
     * <strong>Note:</strong> The character is <em>not</em> consumed.
     *
     * @throws IOException  Thrown if i/o error occurs.
     * @throws EOFException Thrown on end of file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final boolean isExternal() {

    /** Returns true if the current entity being scanned is external. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final void setEncoding(String encoding) throws IOException {

    /**
     * Sets the encoding of the scanner. This method is used by the
     * scanners if the XMLDecl or TextDecl line contains an encoding
     * pseudo-attribute.
     * <p>
     * <strong>Note:</strong> The underlying character reader on the
     * current entity will be changed to accomodate the new encoding.
     * However, the new encoding is ignored if the current reader was
     * not constructed from an input stream (e.g. an external entity
     * that is resolved directly to the appropriate java.io.Reader
     * object).
     *
     * @param encoding The IANA encoding name of the new encoding.
     *
     * @throws IOException Thrown if the new encoding is not supported.
     *
     * @see com.sun.org.apache.xerces.internal.util.EncodingMap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getEncoding() {

    /**
     * Returns the encoding of the current entity.
     * Note that, for a given entity, this value can only be
     * considered final once the encoding declaration has been read (or once it
     * has been determined that there is no such declaration) since, no encoding
     * having been specified on the XMLInputSource, the parser
     * will make an initial "guess" which could be in error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    /** the version of the current entity being scanned */

    ///////////////// Locator methods finished.
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setPublicId(String publicId) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier#setPublicId(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getPublicId() {

    /** Returns the public identifier.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setLiteralSystemId(String systemId) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier#setLiteralSystemId(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getLiteralSystemId() {

    /** Returns the literal system identifier.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setExpandedSystemId(String systemId) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier#setExpandedSystemId(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getExpandedSystemId() {

    /** Returns the expanded system identifier.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setColumnNumber(int col) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLLocator#setColumnNumber(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setLineNumber(int line) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLLocator#setLineNumber(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final int getLineNumber(){

    ///////////// Locator methods start.
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void setBaseSystemId(String systemId) {

    /**
     * @see com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier#setBaseSystemId(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getBaseSystemId() {

    /**
     * Returns the base system identifier of the currently scanned
     * entity, or null if none is available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final void setCurrentEntity(Entity.ScannedEntity scannedEntity){

    /** set the instance of current scanned entity.
     *   @param ScannedEntity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final void setXMLVersion(String xmlVersion) {

    /**
     * Sets the XML version. This method is used by the
     * scanners to report the value of the version pseudo-attribute
     * in an XML or text declaration.
     *
     * @param xmlVersion the XML version of the current entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public final String getXMLVersion() {

    /**
     * Returns the XML version of the current entity. This will normally be the
     * value from the XML or text declaration or defaulted by the parser. Note that
     * that this value may be different than the version of the processing rules
     * applied to the current entity. For instance, an XML 1.1 document may refer to
     * XML 1.0 entities. In such a case the rules of XML 1.1 are applied to the entire
     * document. Also note that, for a given entity, this value can only be considered
     * final once the XML or text declaration has been read or once it has been
     * determined that there is no such declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void reset(XMLComponentManager componentManager)

    /**
     * Resets the component. The component can query the component manager
     * about any features and properties that affect the operation of the
     * component.
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Thrown by component on initialization error.
     *                      For example, if a feature or property is
     *                      required for the operation of the component, the
     *                      component manager may throw a
     *                      SAXNotRecognizedException or a
     *                      SAXNotSupportedException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public void reset(PropertyManager propertyManager){

    /**
     * Resets the components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public XMLEntityScanner(PropertyManager propertyManager, XMLEntityManager entityManager) {

    /**  private constructor, this class can only be instantiated within this class. Instance of this class should
     *    be obtained using getEntityScanner() or getEntityScanner(ScannedEntity scannedEntity)
     *    @see getEntityScanner()
     *    @see getEntityScanner(ScannedEntity)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    public XMLEntityScanner() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier: allow Java encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected boolean fAllowJavaEncodings;

    /**
     * Allow Java encoding names. This feature identifier is:
     * http://apache.org/xml/features/allow-java-encodings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    private static final EOFException END_OF_DOCUMENT_ENTITY = new EOFException() {

    /**
     * To signal the end of the document entity, this exception will be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    private static final boolean DEBUG_BUFFER = false;

    /**
     * Debug printing of buffer. This debugging flag works best when you
     * resize the DEFAULT_BUFFER_SIZE down to something reasonable like
     * 64 characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    private static final boolean DEBUG_ENCODINGS = false;

    /** Debug switching readers for encodings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected XMLLimitAnalyzer fLimitAnalyzer = null;

    /** Limit analyzer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
    protected XMLSecurityManager fSecurityManager = null;

    /** Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLEntityScanner.java
public class XMLEntityScanner implements XMLLocator  {

/**
 * Implements the entity scanner methods.
 *
 * @author Neeraj Bajaj, Sun Microsystems
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author K.Venugopal Sun Microsystems
 *
 */
