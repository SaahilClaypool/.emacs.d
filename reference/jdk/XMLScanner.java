_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void reportFatalError(String msgId, Object[] args)

    /**
     * Convenience function used in all XML scanners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean scanSurrogates(XMLStringBuffer buf)

    /**
     * Scans surrogates and append them to the specified buffer.
     * <p>
     * <strong>Note:</strong> This assumes the current char has already been
     * identified as a high surrogate.
     *
     * @param buf The StringBuffer to append the read surrogates to.
     * @return True if it succeeded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected int scanCharReferenceValue(XMLStringBuffer buf, XMLStringBuffer buf2)

    /**
     * Scans a character reference and append the corresponding chars to the
     * specified buffer.
     *
     * <p>
     * <pre>
     * [66] CharRef ::= '&#' [0-9]+ ';' | '&#x' [0-9a-fA-F]+ ';'
     * </pre>
     *
     * <strong>Note:</strong> This method uses fStringBuffer, anything in it
     * at the time of calling is lost.
     *
     * @param buf the character buffer to append chars to
     * @param buf2 the character buffer to append non-normalized chars to
     *
     * @return the character value or (-1) on conversion failure
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public void endEntity(String name, Augmentations augs) throws IOException, XNIException {

    /**
     * This method notifies the end of an entity. The document entity has
     * the pseudo-name of "[xml]" the DTD has the pseudo-name of "[dtd]"
     * parameter entity names start with '%'; and general entities are just
     * specified by their name.
     *
     * @param name The name of the entity.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public void startEntity(String name,
            XMLResourceIdentifier identifier,
            String encoding, Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The document entity
     * has the pseudo-name of "[xml]" the DTD has the pseudo-name of "[dtd]"
     * parameter entity names start with '%'; and general entities are just
     * specified by their name.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void normalizeWhitespace(XMLString value) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean scanPubidLiteral(XMLString literal)

    /**
     * Scans public ID literal.
     *
     * [12] PubidLiteral ::= '"' PubidChar* '"' | "'" (PubidChar - "'")* "'"
     * [13] PubidChar::= #x20 | #xD | #xA | [a-zA-Z0-9] | [-'()+,./:=?;!*#@$_%]
     *
     * The returned string is normalized according to the following rule,
     * from http://www.w3.org/TR/REC-xml#dt-pubid:
     *
     * Before a match is attempted, all strings of white space in the public
     * identifier must be normalized to single space characters (#x20), and
     * leading and trailing white space must be removed.
     *
     * @param literal The string to fill in with the public ID literal.
     * @return True on success.
     *
     * <strong>Note:</strong> This method uses fStringBuffer, anything in it at
     * the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void scanExternalID(String[] identifiers,
            boolean optionalSystemId)

    /**
     * Scans External ID and return the public and system IDs.
     *
     * @param identifiers An array of size 2 to return the system id,
     *                    and public id (in that order).
     * @param optionalSystemId Specifies whether the system id is optional.
     *
     * <strong>Note:</strong> This method uses fString and fStringBuffer,
     * anything in them at the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void scanAttributeValue(XMLString value,
            XMLString nonNormalizedValue,
            String atName,
            XMLAttributes attributes, int attrIndex,
            boolean checkEntities, String eleName)

    /**
     * Scans an attribute value and normalizes whitespace converting all
     * whitespace characters to space characters.
     *
     * [10] AttValue ::= '"' ([^<&"] | Reference)* '"' | "'" ([^<&'] | Reference)* "'"
     *
     * @param value The XMLString to fill in with the value.
     * @param nonNormalizedValue The XMLString to fill in with the
     *                           non-normalized value.
     * @param atName The name of the attribute being parsed (for error msgs).
     * @param attributes The attributes list for the scanned attribute.
     * @param attrIndex The index of the attribute to use from the list.
     * @param checkEntities true if undeclared entities should be reported as VC violation,
     *                      false if undeclared entities should be reported as WFC violation.
     * @param eleName The name of element to which this attribute belongs.
     *
     * <strong>Note:</strong> This method uses fStringBuffer2, anything in it
     * at the time of calling is lost.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void scanComment(XMLStringBuffer text)

    /**
     * Scans a comment.
     * <p>
     * <pre>
     * [15] Comment ::= '&lt!--' ((Char - '-') | ('-' (Char - '-')))* '-->'
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!--'
     * <strong>Note:</strong> This method uses fString, anything in it
     * at the time of calling is lost.
     *
     * @param text The buffer to fill in with the text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    //CHANGED:

    /**
     * Scans a processing data. This is needed to handle the situation
     * where a document starts with a processing instruction whose
     * target name <em>starts with</em> "xml". (e.g. xmlfoo)
     *
     * This method would always read the whole data. We have while loop and data is buffered
     * until delimeter is encountered.
     *
     * @param target The PI target
     * @param data The string to fill in with the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    //CHANGED:

    /**
     * Scans a processing instruction.
     * <p>
     * <pre>
     * [16] PI ::= '&lt;?' PITarget (S (Char* - (Char* '?>' Char*)))? '?>'
     * [17] PITarget ::= Name - (('X' | 'x') ('M' | 'm') ('L' | 'l'))
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private String scanPseudoAttributeName() throws IOException, XNIException {

    /**
     * Scans the name of a pseudo attribute. The only legal names
     * in XML 1.0/1.1 documents are 'version', 'encoding' and 'standalone'.
     *
     * @return the name of the pseudo attribute or <code>null</code>
     * if a legal pseudo attribute name could not be scanned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public String scanPseudoAttribute(boolean scanningTextDecl,
            XMLString value)

    /**
     * Scans a pseudo attribute.
     *
     * @param scanningTextDecl True if scanning this pseudo-attribute for a
     *                         TextDecl; false if scanning XMLDecl. This
     *                         flag is needed to report the correct type of
     *                         error.
     * @param value            The string to fill in with the attribute
     *                         value.
     *
     * @return The name of the attribute
     *
     * <strong>Note:</strong> This method uses fStringBuffer2, anything in it
     * at the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void scanXMLDeclOrTextDecl(boolean scanningTextDecl,
            String[] pseudoAttributeValues)

    /**
     * Scans an XML or text declaration.
     * <p>
     * <pre>
     * [23] XMLDecl ::= '<?xml' VersionInfo EncodingDecl? SDDecl? S? '?>'
     * [24] VersionInfo ::= S 'version' Eq (' VersionNum ' | " VersionNum ")
     * [80] EncodingDecl ::= S 'encoding' Eq ('"' EncName '"' |  "'" EncName "'" )
     * [81] EncName ::= [A-Za-z] ([A-Za-z0-9._] | '-')*
     * [32] SDDecl ::= S 'standalone' Eq (("'" ('yes' | 'no') "'")
     *                 | ('"' ('yes' | 'no') '"'))
     *
     * [77] TextDecl ::= '<?xml' VersionInfo? EncodingDecl S? '?>'
     * </pre>
     *
     * @param scanningTextDecl True if a text declaration is to
     *                         be scanned instead of an XML
     *                         declaration.
     * @param pseudoAttributeValues An array of size 3 to return the version,
     *                         encoding and standalone pseudo attribute values
     *                         (in that order).
     *
     * <strong>Note:</strong> This method uses fString, anything in it
     * at the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property during parsing.
     *
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public void reset(XMLComponentManager componentManager)

    /**
     *
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Throws exception if required features and
     *                      properties cannot be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private XMLStringBuffer fStringBuffer3 = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private XMLStringBuffer fStringBuffer2 = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private XMLString fString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fAposSymbol = "apos".intern();

    /** Symbol: "apos". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fQuotSymbol = "quot".intern();

    /** Symbol: "quot". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fGtSymbol = "gt".intern();

    /** Symbol: "gt". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fLtSymbol = "lt".intern();

    /** Symbol: "lt". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fAmpSymbol = "amp".intern();

    /** Symbol: "amp". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fStandaloneSymbol = "standalone".intern();

    /** Symbol: "standalone". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fEncodingSymbol = "encoding".intern();

    /** Symbol: "encoding". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fVersionSymbol = "version".intern();

    /** Symbol: "version". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fReportEntity;

    /** Report entity boundary. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fScanningAttribute;

    /** Scanning attribute. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected String fCharRefLiteral = null;

    /** Literal value of the last character refence scanned. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected int fEntityDepth;

    /** Entity depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLEntityScanner fEntityScanner = null;

    /** Entity scanner, this alwasy works on last entity that was opened. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLEvent fEvent ;

    /** event type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLLimitAnalyzer fLimitAnalyzer = null;

    /** Limit analyzer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLSecurityManager fSecurityManager = null;

    /** Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLEntityStorage fEntityStore = null ;

    /** xxx this should be available from EntityManager Entity storage */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    //protected XMLEntityManager fEntityManager = PropertyManager.getEntityManager();

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
        protected boolean fParserSettings = true;

    /** Internal parser-settings feature */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fNotifyCharRefs = false;

    /** Character references notification. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fNamespaces;

    /** Namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fValidation = false;

    /**
     * Validation. This feature identifier is:
     * http://xml.org/sax/features/validation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final boolean DEBUG_ATTR_NORMALIZATION = false;

    /** Debug attribute normalization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private static final String SECURITY_MANAGER = Constants.SECURITY_MANAGER;

    /** Property identifier: Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String NOTIFY_CHAR_REFS =

    /** Feature identifier: notify character references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
public abstract class XMLScanner

/**
 * This class is responsible for holding scanning methods common to
 * scanning the XML document structure and content as well as the DTD
 * structure and content. Both XMLDocumentScanner and XMLDTDScanner inherit
 * from this base class.
 *
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/scanner/notify-char-refs</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-manager</li>
 * </ul>
 *
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Eric Ye, IBM
 * @author K.Venugopal SUN Microsystems
 * @author Sunitha Reddy, SUN Microsystems
 * @version $Id: XMLScanner.java,v 1.12 2010-11-01 04:39:41 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void reportFatalError(String msgId, Object[] args)

    /**
     * Convenience function used in all XML scanners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean scanSurrogates(XMLStringBuffer buf)

    /**
     * Scans surrogates and append them to the specified buffer.
     * <p>
     * <strong>Note:</strong> This assumes the current char has already been
     * identified as a high surrogate.
     *
     * @param buf The StringBuffer to append the read surrogates to.
     * @return True if it succeeded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected int scanCharReferenceValue(XMLStringBuffer buf, XMLStringBuffer buf2)

    /**
     * Scans a character reference and append the corresponding chars to the
     * specified buffer.
     *
     * <p>
     * <pre>
     * [66] CharRef ::= '&#' [0-9]+ ';' | '&#x' [0-9a-fA-F]+ ';'
     * </pre>
     *
     * <strong>Note:</strong> This method uses fStringBuffer, anything in it
     * at the time of calling is lost.
     *
     * @param buf the character buffer to append chars to
     * @param buf2 the character buffer to append non-normalized chars to
     *
     * @return the character value or (-1) on conversion failure
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public void endEntity(String name, Augmentations augs) throws IOException, XNIException {

    /**
     * This method notifies the end of an entity. The document entity has
     * the pseudo-name of "[xml]" the DTD has the pseudo-name of "[dtd]"
     * parameter entity names start with '%'; and general entities are just
     * specified by their name.
     *
     * @param name The name of the entity.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public void startEntity(String name,
            XMLResourceIdentifier identifier,
            String encoding, Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The document entity
     * has the pseudo-name of "[xml]" the DTD has the pseudo-name of "[dtd]"
     * parameter entity names start with '%'; and general entities are just
     * specified by their name.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void normalizeWhitespace(XMLString value) {

    /**
     * Normalize whitespace in an XMLString converting all whitespace
     * characters to space characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean scanPubidLiteral(XMLString literal)

    /**
     * Scans public ID literal.
     *
     * [12] PubidLiteral ::= '"' PubidChar* '"' | "'" (PubidChar - "'")* "'"
     * [13] PubidChar::= #x20 | #xD | #xA | [a-zA-Z0-9] | [-'()+,./:=?;!*#@$_%]
     *
     * The returned string is normalized according to the following rule,
     * from http://www.w3.org/TR/REC-xml#dt-pubid:
     *
     * Before a match is attempted, all strings of white space in the public
     * identifier must be normalized to single space characters (#x20), and
     * leading and trailing white space must be removed.
     *
     * @param literal The string to fill in with the public ID literal.
     * @return True on success.
     *
     * <strong>Note:</strong> This method uses fStringBuffer, anything in it at
     * the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void scanExternalID(String[] identifiers,
            boolean optionalSystemId)

    /**
     * Scans External ID and return the public and system IDs.
     *
     * @param identifiers An array of size 2 to return the system id,
     *                    and public id (in that order).
     * @param optionalSystemId Specifies whether the system id is optional.
     *
     * <strong>Note:</strong> This method uses fString and fStringBuffer,
     * anything in them at the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void scanAttributeValue(XMLString value,
            XMLString nonNormalizedValue,
            String atName,
            XMLAttributes attributes, int attrIndex,
            boolean checkEntities, String eleName)

    /**
     * Scans an attribute value and normalizes whitespace converting all
     * whitespace characters to space characters.
     *
     * [10] AttValue ::= '"' ([^<&"] | Reference)* '"' | "'" ([^<&'] | Reference)* "'"
     *
     * @param value The XMLString to fill in with the value.
     * @param nonNormalizedValue The XMLString to fill in with the
     *                           non-normalized value.
     * @param atName The name of the attribute being parsed (for error msgs).
     * @param attributes The attributes list for the scanned attribute.
     * @param attrIndex The index of the attribute to use from the list.
     * @param checkEntities true if undeclared entities should be reported as VC violation,
     *                      false if undeclared entities should be reported as WFC violation.
     * @param eleName The name of element to which this attribute belongs.
     *
     * <strong>Note:</strong> This method uses fStringBuffer2, anything in it
     * at the time of calling is lost.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void scanComment(XMLStringBuffer text)

    /**
     * Scans a comment.
     * <p>
     * <pre>
     * [15] Comment ::= '&lt!--' ((Char - '-') | ('-' (Char - '-')))* '-->'
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!--'
     * <strong>Note:</strong> This method uses fString, anything in it
     * at the time of calling is lost.
     *
     * @param text The buffer to fill in with the text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    //CHANGED:

    /**
     * Scans a processing data. This is needed to handle the situation
     * where a document starts with a processing instruction whose
     * target name <em>starts with</em> "xml". (e.g. xmlfoo)
     *
     * This method would always read the whole data. We have while loop and data is buffered
     * until delimeter is encountered.
     *
     * @param target The PI target
     * @param data The string to fill in with the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    //CHANGED:

    /**
     * Scans a processing instruction.
     * <p>
     * <pre>
     * [16] PI ::= '&lt;?' PITarget (S (Char* - (Char* '?>' Char*)))? '?>'
     * [17] PITarget ::= Name - (('X' | 'x') ('M' | 'm') ('L' | 'l'))
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private String scanPseudoAttributeName() throws IOException, XNIException {

    /**
     * Scans the name of a pseudo attribute. The only legal names
     * in XML 1.0/1.1 documents are 'version', 'encoding' and 'standalone'.
     *
     * @return the name of the pseudo attribute or <code>null</code>
     * if a legal pseudo attribute name could not be scanned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public String scanPseudoAttribute(boolean scanningTextDecl,
            XMLString value)

    /**
     * Scans a pseudo attribute.
     *
     * @param scanningTextDecl True if scanning this pseudo-attribute for a
     *                         TextDecl; false if scanning XMLDecl. This
     *                         flag is needed to report the correct type of
     *                         error.
     * @param value            The string to fill in with the attribute
     *                         value.
     *
     * @return The name of the attribute
     *
     * <strong>Note:</strong> This method uses fStringBuffer2, anything in it
     * at the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected void scanXMLDeclOrTextDecl(boolean scanningTextDecl,
            String[] pseudoAttributeValues)

    /**
     * Scans an XML or text declaration.
     * <p>
     * <pre>
     * [23] XMLDecl ::= '<?xml' VersionInfo EncodingDecl? SDDecl? S? '?>'
     * [24] VersionInfo ::= S 'version' Eq (' VersionNum ' | " VersionNum ")
     * [80] EncodingDecl ::= S 'encoding' Eq ('"' EncName '"' |  "'" EncName "'" )
     * [81] EncName ::= [A-Za-z] ([A-Za-z0-9._] | '-')*
     * [32] SDDecl ::= S 'standalone' Eq (("'" ('yes' | 'no') "'")
     *                 | ('"' ('yes' | 'no') '"'))
     *
     * [77] TextDecl ::= '<?xml' VersionInfo? EncodingDecl S? '?>'
     * </pre>
     *
     * @param scanningTextDecl True if a text declaration is to
     *                         be scanned instead of an XML
     *                         declaration.
     * @param pseudoAttributeValues An array of size 3 to return the version,
     *                         encoding and standalone pseudo attribute values
     *                         (in that order).
     *
     * <strong>Note:</strong> This method uses fString, anything in it
     * at the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property during parsing.
     *
     * @param propertyId
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    public void reset(XMLComponentManager componentManager)

    /**
     *
     *
     * @param componentManager The component manager.
     *
     * @throws SAXException Throws exception if required features and
     *                      properties cannot be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private XMLStringBuffer fStringBuffer3 = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private XMLStringBuffer fStringBuffer2 = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private XMLString fString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fAposSymbol = "apos".intern();

    /** Symbol: "apos". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fQuotSymbol = "quot".intern();

    /** Symbol: "quot". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fGtSymbol = "gt".intern();

    /** Symbol: "gt". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fLtSymbol = "lt".intern();

    /** Symbol: "lt". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fAmpSymbol = "amp".intern();

    /** Symbol: "amp". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fStandaloneSymbol = "standalone".intern();

    /** Symbol: "standalone". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fEncodingSymbol = "encoding".intern();

    /** Symbol: "encoding". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected final static String fVersionSymbol = "version".intern();

    /** Symbol: "version". */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fReportEntity;

    /** Report entity boundary. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fScanningAttribute;

    /** Scanning attribute. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected String fCharRefLiteral = null;

    /** Literal value of the last character refence scanned. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected int fEntityDepth;

    /** Entity depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLEntityScanner fEntityScanner = null;

    /** Entity scanner, this alwasy works on last entity that was opened. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLEvent fEvent ;

    /** event type */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLLimitAnalyzer fLimitAnalyzer = null;

    /** Limit analyzer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLSecurityManager fSecurityManager = null;

    /** Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLEntityStorage fEntityStore = null ;

    /** xxx this should be available from EntityManager Entity storage */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    //protected XMLEntityManager fEntityManager = PropertyManager.getEntityManager();

    /** Entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected SymbolTable fSymbolTable;

    /** Symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
        protected boolean fParserSettings = true;

    /** Internal parser-settings feature */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fNotifyCharRefs = false;

    /** Character references notification. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fNamespaces;

    /** Namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected boolean fValidation = false;

    /**
     * Validation. This feature identifier is:
     * http://xml.org/sax/features/validation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final boolean DEBUG_ATTR_NORMALIZATION = false;

    /** Debug attribute normalization. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    private static final String SECURITY_MANAGER = Constants.SECURITY_MANAGER;

    /** Property identifier: Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String NOTIFY_CHAR_REFS =

    /** Feature identifier: notify character references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
    protected static final String NAMESPACES =

    /** Feature identifier: namespaces. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLScanner.java
public abstract class XMLScanner

/**
 * This class is responsible for holding scanning methods common to
 * scanning the XML document structure and content as well as the DTD
 * structure and content. Both XMLDocumentScanner and XMLDTDScanner inherit
 * from this base class.
 *
 * <p>
 * This component requires the following features and properties from the
 * component manager that uses it:
 * <ul>
 *  <li>http://xml.org/sax/features/validation</li>
 *  <li>http://apache.org/xml/features/scanner/notify-char-refs</li>
 *  <li>http://apache.org/xml/properties/internal/symbol-table</li>
 *  <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *  <li>http://apache.org/xml/properties/internal/entity-manager</li>
 * </ul>
 *
 * @author Andy Clark, IBM
 * @author Arnaud  Le Hors, IBM
 * @author Eric Ye, IBM
 * @author K.Venugopal SUN Microsystems
 * @author Sunitha Reddy, SUN Microsystems
 * @version $Id: XMLScanner.java,v 1.12 2010-11-01 04:39:41 joehw Exp $
 */
