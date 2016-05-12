_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private void checkEntityLimit(boolean isPEDecl, String entityName, int len) {

    /**
     * Add the count and check limit
     * @param isPEDecl a flag to indicate whether the entity is parameter
     * @param entityName entity name
     * @param len length of the buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private void checkEntityLimit(boolean isPEDecl, String entityName, XMLString buffer) {

    /**
     * Add the count of the content buffer and check if the accumulated
     * value exceeds the limit
     * @param isPEDecl a flag to indicate whether the entity is parameter
     * @param entityName entity name
     * @param buffer content buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final boolean peekReportEntity() {

    /** look at the top of the stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final int popPEStack() {

    /** pop the stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private boolean skipSeparator(boolean spaceRequired, boolean lookForPERefs)

    /**
     * Skip separator. This is typically just whitespace but it can also be one
     * or more parameter entity references.
     * <p>
     * If there are some it "expands them" by calling the corresponding entity
     * from the entity manager.
     * <p>
     * This is recursive and will process has many refs as possible.
     *
     * @param spaceRequired Specify whether some leading whitespace should be
     *                      found
     * @param lookForPERefs Specify whether parameter entity references should
     *                      be looked for
     * @return True if any leading whitespace was found or the end of a
     *         parameter entity was crossed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final boolean scanDecls(boolean complete)

    /**
     * Dispatch an XML "event".
     *
     * @param complete True if this method is intended to scan
     *                 and dispatch as much as possible.
     *
     * @return True if there is more to scan.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown on parse error.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanConditionalSect(int currPEDepth)

    /**
     * Scans a conditional section. If it's a section to ignore the whole
     * section gets scanned through and this method only returns after the
     * closing bracket has been found. When it's an include section though, it
     * returns to let the main loop take care of scanning it. In that case the
     * end of the section if handled by the main loop (scanDecls).
     * <p>
     * <pre>
     * [61] conditionalSect   ::= includeSect | ignoreSect
     * [62] includeSect       ::= '&lt;![' S? 'INCLUDE' S? '[' extSubsetDecl ']]>'
     * [63] ignoreSect   ::= '&lt;![' S? 'IGNORE' S? '[' ignoreSectContents* ']]>'
     * [64] ignoreSectContents ::= Ignore ('&lt;![' ignoreSectContents ']]>' Ignore)*
     * [65] Ignore            ::=    Char* - (Char* ('&lt;![' | ']]>') Char*)
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;![' */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanNotationDecl() throws IOException, XNIException {

    /**
     * Scans a notation declaration
     * <p>
     * <pre>
     * [82] NotationDecl ::= '&lt;!NOTATION' S Name S (ExternalID|PublicID) S? '>'
     * [83]  PublicID    ::= 'PUBLIC' S PubidLiteral
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!NOTATION'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanEntityValue(String entityName, boolean isPEDecl, XMLString value,
    XMLString nonNormalizedValue)

    /**
     * Scans an entity value.
     *
     * @param value The string to fill in with the value.
     * @param nonNormalizedValue The string to fill in with the
     *                           non-normalized value.
     *
     * <strong>Note:</strong> This method uses fString, fStringBuffer (through
     * the use of scanCharReferenceValue), and fStringBuffer2, anything in them
     * at the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanEntityDecl() throws IOException, XNIException {

    /**
     * Scans an entity declaration
     * <p>
     * <pre>
     * [70]    EntityDecl  ::=    GEDecl | PEDecl
     * [71]    GEDecl      ::=    '&lt;!ENTITY' S Name S EntityDef S? '>'
     * [72]    PEDecl      ::=    '&lt;!ENTITY' S '%' S Name S PEDef S? '>'
     * [73]    EntityDef   ::=    EntityValue | (ExternalID NDataDecl?)
     * [74]    PEDef       ::=    EntityValue | ExternalID
     * [75]    ExternalID  ::=    'SYSTEM' S SystemLiteral
     *                          | 'PUBLIC' S PubidLiteral S SystemLiteral
     * [76]    NDataDecl   ::=    S 'NDATA' S Name
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!ENTITY'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final String scanAttDefaultDecl(String elName, String atName,
    String type,
    XMLString defaultVal,
    XMLString nonNormalizedDefaultVal)

    /**
     * Scans an attribute default declaration
     * <p>
     * <pre>
     * [60] DefaultDecl ::= '#REQUIRED' | '#IMPLIED' | (('#FIXED' S)? AttValue)
     * </pre>
     *
     * @param name The name of the attribute being scanned.
     * @param defaultVal The string to fill in with the default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final String scanAttType(String elName, String atName)

    /**
     * Scans an attribute type definition
     * <p>
     * <pre>
     * [54]  AttType        ::=   StringType | TokenizedType | EnumeratedType
     * [55]  StringType     ::=   'CDATA'
     * [56]  TokenizedType  ::=   'ID'
     *                          | 'IDREF'
     *                          | 'IDREFS'
     *                          | 'ENTITY'
     *                          | 'ENTITIES'
     *                          | 'NMTOKEN'
     *                          | 'NMTOKENS'
     * [57]  EnumeratedType ::=    NotationType | Enumeration
     * [58]  NotationType ::= 'NOTATION' S '(' S? Name (S? '|' S? Name)* S? ')'
     * [59]  Enumeration    ::=    '(' S? Nmtoken (S? '|' S? Nmtoken)* S? ')'
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!ATTLIST'
     *
     * @param elName The element type name this declaration is about.
     * @param atName The attribute name this declaration is about.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanAttlistDecl() throws IOException, XNIException {

    /**
     * Scans an attlist declaration
     * <p>
     * <pre>
     * [52]  AttlistDecl    ::=   '&lt;!ATTLIST' S Name AttDef* S? '>'
     * [53]  AttDef         ::=   S Name S AttType S DefaultDecl
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!ATTLIST'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanChildren(String elName)

    /**
     * scan children content model
     * This assumes it can simply append to fStringBuffer.
     * <pre>
     * [47]    children  ::=    (choice | seq) ('?' | '*' | '+')?
     * [48]    cp        ::=    (Name | choice | seq) ('?' | '*' | '+')?
     * [49]    choice    ::=    '(' S? cp ( S? '|' S? cp )+ S? ')'
     * [50]    seq       ::=    '(' S? cp ( S? ',' S? cp )* S? ')'
     * </pre>
     *
     * @param elName The element type name this declaration is about.
     *
     * <strong>Note:</strong> Called after scanning past the first open
     * paranthesis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanMixed(String elName)

    /**
     * scan Mixed content model
     * This assumes the content model has been parsed up to #PCDATA and
     * can simply append to fStringBuffer.
     * <pre>
     * [51]    Mixed    ::=    '(' S? '#PCDATA' (S? '|' S? Name)* S? ')*'
     *                       | '(' S? '#PCDATA' S? ')'
     * </pre>
     *
     * @param elName The element type name this declaration is about.
     *
     * <strong>Note:</strong> Called after scanning past '(#PCDATA'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanElementDecl() throws IOException, XNIException {

    /**
     * Scans an element declaration
     * <p>
     * <pre>
     * [45]    elementdecl    ::=    '&lt;!ELEMENT' S Name S contentspec S? '>'
     * [46]    contentspec    ::=    'EMPTY' | 'ANY' | Mixed | children
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!ELEMENT'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanComment() throws IOException, XNIException {

    /**
     * Scans a comment.
     * <p>
     * <pre>
     * [15] Comment ::= '&lt!--' ((Char - '-') | ('-' (Char - '-')))* '-->'
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!--'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanPIData(String target, XMLString data)

    /**
     * Scans a processing data. This is needed to handle the situation
     * where a document starts with a processing instruction whose
     * target name <em>starts with</em> "xml". (e.g. xmlfoo)
     *
     * @param target The PI target
     * @param data The string to fill in with the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final boolean scanTextDecl()

    /**
     * Dispatch an XML "event".
     *
     * @param complete True if this method is intended to scan
     *                 and dispatch as much as possible.
     *
     * @return True if a TextDecl was scanned.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown on parse error.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected void startPE(String name, boolean literal)

    /**
     * start a parameter entity dealing with the textdecl if there is any
     *
     * @param name The name of the parameter entity to start (without the '%')
     * @param literal Whether this is happening within a literal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static String getScannerStateName(int state) {

    /** Returns the scanner state name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void setScannerState(int state) {

    /**
     * Sets the scanner state.
     *
     * @param state The new scanner state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void endEntity(String name, Augmentations augs)

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entities
     * are just specified by their name.
     *
     * @param name The name of the entity.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void startEntity(String name,
                            XMLResourceIdentifier identifier,
                            String encoding, Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entities are just specified by their name.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDContentModelHandler getDTDContentModelHandler() {

    /**
     * getDTDContentModelHandler
     *
     * @return XMLDTDContentModelHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler
    dtdContentModelHandler) {

    /**
     * setDTDContentModelHandler
     *
     * @param dtdContentModelHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDHandler getDTDHandler() {

    /**
     * getDTDHandler
     *
     * @return the XMLDTDHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void setDTDHandler(XMLDTDHandler dtdHandler) {

    /**
     * setDTDHandler
     *
     * @param dtdHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void reset(XMLComponentManager componentManager)

    /**
     * reset
     *
     * @param componentManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    @Override

    /**
     * Skip the DTD if javax.xml.stream.supportDTD is false.
     *
     * @param supportDTD The value of the property javax.xml.stream.supportDTD.
     * @return true if DTD is skipped, false otherwise.
     * @throws java.io.IOException if i/o error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public boolean scanDTDInternalSubset(boolean complete, boolean standalone,
    boolean hasExternalSubset)

    /**
     * Scans the internal subset of the document.
     *
     * @param complete True if the scanner should scan the document
     *                 completely, pushing all events to the registered
     *                 document handler. A value of false indicates that
     *                 that the scanner should only scan the next portion
     *                 of the document and return. A scanner instance is
     *                 permitted to completely scan a document if it does
     *                 not support this "pull" scanning model.
     * @param standalone True if the document was specified as standalone.
     *                   This value is important for verifying certain
     *                   well-formedness constraints.
     * @param hasExternalDTD True if the document has an external DTD.
     *                       This allows the scanner to properly notify
     *                       the handler of the end of the DTD in the
     *                       absence of an external subset.
     *
     * @return True if there is more to scan, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public boolean scanDTDExternalSubset(boolean complete)

    /**
     * Scans the external subset of the document.
     *
     * @param complete True if the scanner should scan the document
     *                 completely, pushing all events to the registered
     *                 document handler. A value of false indicates that
     *                 that the scanner should only scan the next portion
     *                 of the document and return. A scanner instance is
     *                 permitted to completely scan a document if it does
     *                 not support this "pull" scanning model.
     *
     * @return True if there is more to scan, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void setInputSource(XMLInputSource inputSource) throws IOException {

    /**
     * Sets the input source.
     *
     * @param inputSource The input source or null.
     *
     * @throws IOException Thrown on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDScannerImpl(SymbolTable symbolTable,
            XMLErrorReporter errorReporter, XMLEntityManager entityManager) {

    /** Constructor for he use of non-XMLComponentManagers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDScannerImpl() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    DTDGrammar nvGrammarInfo = null;

    /** Object contains grammar information for a non-validaing parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLStringBuffer fIgnoreConditionalBuffer = new XMLStringBuffer(128);

    /** Ignore conditional section buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fEnumerationCount;

    /** Enumeration values count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private String[] fEnumeration = new String[5];

    /** Enumeration values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLString fLiteral2 = new XMLString();

    /** Literal text. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLString fLiteral = new XMLString();

    /** Literal text. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLStringBuffer fStringBuffer2 = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLString fString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private String[] fStrings = new String[3];

    /** Array of 3 strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fIncludeSectDepth;

    /** Number of opened include sections. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fExtEntityDepth;

    /** Number of opened external entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fMarkUpDepth;

    /** Markup depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fPEDepth;

    /** Number of opened parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private boolean[] fPEReport = new boolean[5];

    /** Parameter entity stack to report start/end entity calls. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int[] fPEStack = new int[5];

    /** Parameter entity stack to check well-formedness. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fContentDepth;

    /** Size of content stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int[] fContentStack = new int[5];

    /**
     * Stack of content operators (either '|' or ',') in children
     * content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLAttributesImpl fAttributes = new XMLAttributesImpl();

    /** Default attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private boolean fStartDTDCalled;

    /** Start DTD called. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected boolean fSeenExternalPE;

    /** Seen external parameter entity. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected boolean fSeenExternalDTD;

    /** Seen external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected boolean fStandalone;

    /** Standalone. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected int fScannerState;

    /** Scanner state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected XMLDTDContentModelHandler fDTDContentModelHandler;

    /** DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDHandler fDTDHandler = null;

    /** DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final boolean DEBUG_SCANNER_STATE = false;

    /** Debug scanner state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected static final int SCANNER_STATE_MARKUP_DECL = 2;

    /** Scanner state: markup declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected static final int SCANNER_STATE_TEXT_DECL = 1;

    /** Scanner state: text declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected static final int SCANNER_STATE_END_OF_INPUT = 0;

    /** Scanner state: end of input. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
public class XMLDTDScannerImpl

/**
 * This class is responsible for scanning the declarations found
 * in the internal and external subsets of a DTD in an XML document.
 * The scanner acts as the sources for the DTD information which is
 * communicated to the DTD handlers.
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
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 * @author Glenn Marcy, IBM
 * @author Eric Ye, IBM
 *
 * @version $Id: XMLDTDScannerImpl.java,v 1.8 2010-11-01 04:39:41 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private void checkEntityLimit(boolean isPEDecl, String entityName, int len) {

    /**
     * Add the count and check limit
     * @param isPEDecl a flag to indicate whether the entity is parameter
     * @param entityName entity name
     * @param len length of the buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private void checkEntityLimit(boolean isPEDecl, String entityName, XMLString buffer) {

    /**
     * Add the count of the content buffer and check if the accumulated
     * value exceeds the limit
     * @param isPEDecl a flag to indicate whether the entity is parameter
     * @param entityName entity name
     * @param buffer content buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final boolean peekReportEntity() {

    /** look at the top of the stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final int popPEStack() {

    /** pop the stack */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private boolean skipSeparator(boolean spaceRequired, boolean lookForPERefs)

    /**
     * Skip separator. This is typically just whitespace but it can also be one
     * or more parameter entity references.
     * <p>
     * If there are some it "expands them" by calling the corresponding entity
     * from the entity manager.
     * <p>
     * This is recursive and will process has many refs as possible.
     *
     * @param spaceRequired Specify whether some leading whitespace should be
     *                      found
     * @param lookForPERefs Specify whether parameter entity references should
     *                      be looked for
     * @return True if any leading whitespace was found or the end of a
     *         parameter entity was crossed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final boolean scanDecls(boolean complete)

    /**
     * Dispatch an XML "event".
     *
     * @param complete True if this method is intended to scan
     *                 and dispatch as much as possible.
     *
     * @return True if there is more to scan.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown on parse error.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanConditionalSect(int currPEDepth)

    /**
     * Scans a conditional section. If it's a section to ignore the whole
     * section gets scanned through and this method only returns after the
     * closing bracket has been found. When it's an include section though, it
     * returns to let the main loop take care of scanning it. In that case the
     * end of the section if handled by the main loop (scanDecls).
     * <p>
     * <pre>
     * [61] conditionalSect   ::= includeSect | ignoreSect
     * [62] includeSect       ::= '&lt;![' S? 'INCLUDE' S? '[' extSubsetDecl ']]>'
     * [63] ignoreSect   ::= '&lt;![' S? 'IGNORE' S? '[' ignoreSectContents* ']]>'
     * [64] ignoreSectContents ::= Ignore ('&lt;![' ignoreSectContents ']]>' Ignore)*
     * [65] Ignore            ::=    Char* - (Char* ('&lt;![' | ']]>') Char*)
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;![' */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanNotationDecl() throws IOException, XNIException {

    /**
     * Scans a notation declaration
     * <p>
     * <pre>
     * [82] NotationDecl ::= '&lt;!NOTATION' S Name S (ExternalID|PublicID) S? '>'
     * [83]  PublicID    ::= 'PUBLIC' S PubidLiteral
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!NOTATION'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanEntityValue(String entityName, boolean isPEDecl, XMLString value,
    XMLString nonNormalizedValue)

    /**
     * Scans an entity value.
     *
     * @param value The string to fill in with the value.
     * @param nonNormalizedValue The string to fill in with the
     *                           non-normalized value.
     *
     * <strong>Note:</strong> This method uses fString, fStringBuffer (through
     * the use of scanCharReferenceValue), and fStringBuffer2, anything in them
     * at the time of calling is lost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanEntityDecl() throws IOException, XNIException {

    /**
     * Scans an entity declaration
     * <p>
     * <pre>
     * [70]    EntityDecl  ::=    GEDecl | PEDecl
     * [71]    GEDecl      ::=    '&lt;!ENTITY' S Name S EntityDef S? '>'
     * [72]    PEDecl      ::=    '&lt;!ENTITY' S '%' S Name S PEDef S? '>'
     * [73]    EntityDef   ::=    EntityValue | (ExternalID NDataDecl?)
     * [74]    PEDef       ::=    EntityValue | ExternalID
     * [75]    ExternalID  ::=    'SYSTEM' S SystemLiteral
     *                          | 'PUBLIC' S PubidLiteral S SystemLiteral
     * [76]    NDataDecl   ::=    S 'NDATA' S Name
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!ENTITY'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final String scanAttDefaultDecl(String elName, String atName,
    String type,
    XMLString defaultVal,
    XMLString nonNormalizedDefaultVal)

    /**
     * Scans an attribute default declaration
     * <p>
     * <pre>
     * [60] DefaultDecl ::= '#REQUIRED' | '#IMPLIED' | (('#FIXED' S)? AttValue)
     * </pre>
     *
     * @param name The name of the attribute being scanned.
     * @param defaultVal The string to fill in with the default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final String scanAttType(String elName, String atName)

    /**
     * Scans an attribute type definition
     * <p>
     * <pre>
     * [54]  AttType        ::=   StringType | TokenizedType | EnumeratedType
     * [55]  StringType     ::=   'CDATA'
     * [56]  TokenizedType  ::=   'ID'
     *                          | 'IDREF'
     *                          | 'IDREFS'
     *                          | 'ENTITY'
     *                          | 'ENTITIES'
     *                          | 'NMTOKEN'
     *                          | 'NMTOKENS'
     * [57]  EnumeratedType ::=    NotationType | Enumeration
     * [58]  NotationType ::= 'NOTATION' S '(' S? Name (S? '|' S? Name)* S? ')'
     * [59]  Enumeration    ::=    '(' S? Nmtoken (S? '|' S? Nmtoken)* S? ')'
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!ATTLIST'
     *
     * @param elName The element type name this declaration is about.
     * @param atName The attribute name this declaration is about.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanAttlistDecl() throws IOException, XNIException {

    /**
     * Scans an attlist declaration
     * <p>
     * <pre>
     * [52]  AttlistDecl    ::=   '&lt;!ATTLIST' S Name AttDef* S? '>'
     * [53]  AttDef         ::=   S Name S AttType S DefaultDecl
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!ATTLIST'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanChildren(String elName)

    /**
     * scan children content model
     * This assumes it can simply append to fStringBuffer.
     * <pre>
     * [47]    children  ::=    (choice | seq) ('?' | '*' | '+')?
     * [48]    cp        ::=    (Name | choice | seq) ('?' | '*' | '+')?
     * [49]    choice    ::=    '(' S? cp ( S? '|' S? cp )+ S? ')'
     * [50]    seq       ::=    '(' S? cp ( S? ',' S? cp )* S? ')'
     * </pre>
     *
     * @param elName The element type name this declaration is about.
     *
     * <strong>Note:</strong> Called after scanning past the first open
     * paranthesis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private final void scanMixed(String elName)

    /**
     * scan Mixed content model
     * This assumes the content model has been parsed up to #PCDATA and
     * can simply append to fStringBuffer.
     * <pre>
     * [51]    Mixed    ::=    '(' S? '#PCDATA' (S? '|' S? Name)* S? ')*'
     *                       | '(' S? '#PCDATA' S? ')'
     * </pre>
     *
     * @param elName The element type name this declaration is about.
     *
     * <strong>Note:</strong> Called after scanning past '(#PCDATA'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanElementDecl() throws IOException, XNIException {

    /**
     * Scans an element declaration
     * <p>
     * <pre>
     * [45]    elementdecl    ::=    '&lt;!ELEMENT' S Name S contentspec S? '>'
     * [46]    contentspec    ::=    'EMPTY' | 'ANY' | Mixed | children
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!ELEMENT'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanComment() throws IOException, XNIException {

    /**
     * Scans a comment.
     * <p>
     * <pre>
     * [15] Comment ::= '&lt!--' ((Char - '-') | ('-' (Char - '-')))* '-->'
     * </pre>
     * <p>
     * <strong>Note:</strong> Called after scanning past '&lt;!--'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void scanPIData(String target, XMLString data)

    /**
     * Scans a processing data. This is needed to handle the situation
     * where a document starts with a processing instruction whose
     * target name <em>starts with</em> "xml". (e.g. xmlfoo)
     *
     * @param target The PI target
     * @param data The string to fill in with the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final boolean scanTextDecl()

    /**
     * Dispatch an XML "event".
     *
     * @param complete True if this method is intended to scan
     *                 and dispatch as much as possible.
     *
     * @return True if a TextDecl was scanned.
     *
     * @throws IOException  Thrown on i/o error.
     * @throws XNIException Thrown on parse error.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected void startPE(String name, boolean literal)

    /**
     * start a parameter entity dealing with the textdecl if there is any
     *
     * @param name The name of the parameter entity to start (without the '%')
     * @param literal Whether this is happening within a literal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static String getScannerStateName(int state) {

    /** Returns the scanner state name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected final void setScannerState(int state) {

    /**
     * Sets the scanner state.
     *
     * @param state The new scanner state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void endEntity(String name, Augmentations augs)

    /**
     * This method notifies the end of an entity. The DTD has the pseudo-name
     * of "[dtd]" parameter entity names start with '%'; and general entities
     * are just specified by their name.
     *
     * @param name The name of the entity.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void startEntity(String name,
                            XMLResourceIdentifier identifier,
                            String encoding, Augmentations augs) throws XNIException {

    /**
     * This method notifies of the start of an entity. The DTD has the
     * pseudo-name of "[dtd]" parameter entity names start with '%'; and
     * general entities are just specified by their name.
     *
     * @param name     The name of the entity.
     * @param identifier The resource identifier.
     * @param encoding The auto-detected IANA encoding name of the entity
     *                 stream. This value will be null in those situations
     *                 where the entity encoding is not auto-detected (e.g.
     *                 internal entities or a document entity that is
     *                 parsed from a java.io.Reader).
     * @param augs     Additional information that may include infoset augmentations
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDContentModelHandler getDTDContentModelHandler() {

    /**
     * getDTDContentModelHandler
     *
     * @return XMLDTDContentModelHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler
    dtdContentModelHandler) {

    /**
     * setDTDContentModelHandler
     *
     * @param dtdContentModelHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDHandler getDTDHandler() {

    /**
     * getDTDHandler
     *
     * @return the XMLDTDHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void setDTDHandler(XMLDTDHandler dtdHandler) {

    /**
     * setDTDHandler
     *
     * @param dtdHandler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public Object getPropertyDefault(String propertyId) {

    /**
     * Returns the default state for a property, or null if this
     * component does not want to report a default value for this
     * property.
     *
     * @param propertyId The property identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public Boolean getFeatureDefault(String featureId) {

    /**
     * Returns the default state for a feature, or null if this
     * component does not want to report a default value for this
     * feature.
     *
     * @param featureId The feature identifier.
     *
     * @since Xerces 2.2.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public String[] getRecognizedProperties() {

    /**
     * Returns a list of property identifiers that are recognized by
     * this component. This method may return null if no properties
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public String[] getRecognizedFeatures() {

    /**
     * Returns a list of feature identifiers that are recognized by
     * this component. This method may return null if no features
     * are recognized by this component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void reset(XMLComponentManager componentManager)

    /**
     * reset
     *
     * @param componentManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    @Override

    /**
     * Skip the DTD if javax.xml.stream.supportDTD is false.
     *
     * @param supportDTD The value of the property javax.xml.stream.supportDTD.
     * @return true if DTD is skipped, false otherwise.
     * @throws java.io.IOException if i/o error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public boolean scanDTDInternalSubset(boolean complete, boolean standalone,
    boolean hasExternalSubset)

    /**
     * Scans the internal subset of the document.
     *
     * @param complete True if the scanner should scan the document
     *                 completely, pushing all events to the registered
     *                 document handler. A value of false indicates that
     *                 that the scanner should only scan the next portion
     *                 of the document and return. A scanner instance is
     *                 permitted to completely scan a document if it does
     *                 not support this "pull" scanning model.
     * @param standalone True if the document was specified as standalone.
     *                   This value is important for verifying certain
     *                   well-formedness constraints.
     * @param hasExternalDTD True if the document has an external DTD.
     *                       This allows the scanner to properly notify
     *                       the handler of the end of the DTD in the
     *                       absence of an external subset.
     *
     * @return True if there is more to scan, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public boolean scanDTDExternalSubset(boolean complete)

    /**
     * Scans the external subset of the document.
     *
     * @param complete True if the scanner should scan the document
     *                 completely, pushing all events to the registered
     *                 document handler. A value of false indicates that
     *                 that the scanner should only scan the next portion
     *                 of the document and return. A scanner instance is
     *                 permitted to completely scan a document if it does
     *                 not support this "pull" scanning model.
     *
     * @return True if there is more to scan, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public void setInputSource(XMLInputSource inputSource) throws IOException {

    /**
     * Sets the input source.
     *
     * @param inputSource The input source or null.
     *
     * @throws IOException Thrown on i/o error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDScannerImpl(SymbolTable symbolTable,
            XMLErrorReporter errorReporter, XMLEntityManager entityManager) {

    /** Constructor for he use of non-XMLComponentManagers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDScannerImpl() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    DTDGrammar nvGrammarInfo = null;

    /** Object contains grammar information for a non-validaing parser. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLStringBuffer fIgnoreConditionalBuffer = new XMLStringBuffer(128);

    /** Ignore conditional section buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fEnumerationCount;

    /** Enumeration values count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private String[] fEnumeration = new String[5];

    /** Enumeration values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLString fLiteral2 = new XMLString();

    /** Literal text. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLString fLiteral = new XMLString();

    /** Literal text. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLStringBuffer fStringBuffer2 = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLStringBuffer fStringBuffer = new XMLStringBuffer();

    /** String buffer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLString fString = new XMLString();

    /** String. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private String[] fStrings = new String[3];

    /** Array of 3 strings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fIncludeSectDepth;

    /** Number of opened include sections. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fExtEntityDepth;

    /** Number of opened external entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fMarkUpDepth;

    /** Markup depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fPEDepth;

    /** Number of opened parameter entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private boolean[] fPEReport = new boolean[5];

    /** Parameter entity stack to report start/end entity calls. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int[] fPEStack = new int[5];

    /** Parameter entity stack to check well-formedness. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int fContentDepth;

    /** Size of content stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private int[] fContentStack = new int[5];

    /**
     * Stack of content operators (either '|' or ',') in children
     * content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private XMLAttributesImpl fAttributes = new XMLAttributesImpl();

    /** Default attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private boolean fStartDTDCalled;

    /** Start DTD called. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected boolean fSeenExternalPE;

    /** Seen external parameter entity. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected boolean fSeenExternalDTD;

    /** Seen external DTD. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected boolean fStandalone;

    /** Standalone. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected int fScannerState;

    /** Scanner state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected XMLDTDContentModelHandler fDTDContentModelHandler;

    /** DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    public XMLDTDHandler fDTDHandler = null;

    /** DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final boolean DEBUG_SCANNER_STATE = false;

    /** Debug scanner state. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final Object[] PROPERTY_DEFAULTS = {

    /** Property defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final Boolean[] FEATURE_DEFAULTS = {

    /** Feature defaults. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    private static final String[] RECOGNIZED_FEATURES = {

    /** Recognized features. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected static final int SCANNER_STATE_MARKUP_DECL = 2;

    /** Scanner state: markup declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected static final int SCANNER_STATE_TEXT_DECL = 1;

    /** Scanner state: text declaration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
    protected static final int SCANNER_STATE_END_OF_INPUT = 0;

    /** Scanner state: end of input. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/XMLDTDScannerImpl.java
public class XMLDTDScannerImpl

/**
 * This class is responsible for scanning the declarations found
 * in the internal and external subsets of a DTD in an XML document.
 * The scanner acts as the sources for the DTD information which is
 * communicated to the DTD handlers.
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
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 * @author Glenn Marcy, IBM
 * @author Eric Ye, IBM
 *
 * @version $Id: XMLDTDScannerImpl.java,v 1.8 2010-11-01 04:39:41 joehw Exp $
 */
