_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public void setGenerateSyntheticAnnotations(boolean state) {

    /**
     * @param state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
            // condition 2: same namespace

            /** if (referType == XSDDescription.CONTEXT_REDEFINE ||
                    key.referType == XSDDescription.CONTEXT_REDEFINE) {
                if (referType != key.referType)
                    return false;
            }**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private static class XSDKey {

    /**
     * used to identify a reference to a schema document
     * if the same document is referenced twice with the same key, then
     * we only need to parse it once.
     *
     * When 2 XSDKey's are compared, the following table can be used to
     * determine whether they are equal:
     *      inc     red     imp     pre     ins
     * inc  N/L      ?      N/L     N/L     N/L
     * red   ?      N/L      ?       ?       ?
     * imp  N/L      ?      N/P     N/P     N/P
     * pre  N/L      ?      N/P     N/P     N/P
     * ins  N/L      ?      N/P     N/P     N/P
     *
     * Where: N/L: duplicate when they have the same namespace and location.
     *         ? : not clear from the spec.
     *             REVISIT: to simplify the process, also considering
     *             it's very rare, we treat them as not duplicate.
     *        N/P: not possible. imp/pre/ins are referenced by namespace.
     *             when the first time we encounter a schema document for a
     *             namespace, we create a grammar and store it in the grammar
     *             bucket. when we see another reference to the same namespace,
     *             we first check whether a grammar with the same namespace is
     *             already in the bucket, which is true in this case, so we
     *             won't create another XSDKey.
     *
     * Conclusion from the table: two XSDKey's are duplicate only when all of
     * the following are true:
     * 1. They are both "redefine", or neither is "redefine";
     * 2. They have the same namespace;
     * 3. They have the same non-null location.
     *
     * About 3: if neither has a non-null location, then it's the case where
     * 2 input streams are provided, but no system ID is provided. We can't tell
     * whether the 2 streams have the same content, so we treat them as not
     * duplicate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
                        for (int i = 0; i < schemaGrammars.length; ++i) {

                        /**
                         * If the grammar bucket already contains the schema for schemas
                         * then we already have the definitions for the parts relevant
                         * to annotations.
                         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private static class XSAnnotationGrammarPool implements XMLGrammarPool {

    /**
     * Grammar pool used for validating annotations. This will return all of the
     * grammars from the grammar bucket. It will also return an object for the
     * schema for schemas which will contain at least the relevant declarations
     * for annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public boolean element2Locator(Element e, SimpleLocator l) {

    /**
     * Extract location information from an Element node, store such
     * information in the passed-in SimpleLocator object, then return
     * true. Returning false means can't extract or store such information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public SimpleLocator element2Locator(Element e) {

    /**
     * Extract location information from an Element node, and create a
     * new SimpleLocator object from such information. Returning null means
     * no information can be retrieved from the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    } // findXSDocumentForDecl(XSDocumentInfo, Element):  XSDocumentInfo

        /*********
         Logic here is unnecessary after schema WG's recent decision to allow
         schema components from one document to refer to components of any other,
         so long as there's some include/import/redefine path amongst them.
         If they rver reverse this decision the code's right here though...  - neilg
         // now look in fDependencyMap to see if this is reachable
          if(((Vector)fDependencyMap.get(currSchema)).contains(declDocInfo)) {
          return declDocInfo;
          }
          // obviously the requesting doc didn't include, redefine or
           // import the one containing decl...
            return null;
            **********/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    void checkForDuplicateNames(String qName, int declType,
            Map<String,Element> registry, Map<String,XSDocumentInfo> registry_sub, Element currComp,
            XSDocumentInfo currSchema) {

    /** This method makes sure that
     * if this component is being redefined that it lives in the
     * right schema.  It then renames the component correctly.  If it
     * detects a collision--a duplicate definition--then it complains.
     * Note that redefines must be handled carefully:  if there
     * is a collision, it may be because we're redefining something we know about
     * or because we've found the thing we're redefining.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    void traverseLocalElements() {

    /**
     * Traverse all the deferred local elements. This method should be called
     * by traverseSchemas after we've done with all the global declarations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(XSInputSource schemaSource, XSDDescription desc) {

    /**
     * getSchemaDocument method uses XMLInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument1(boolean mustResolve, boolean hasInput,
            XMLInputSource schemaSource, Element referElement, IOException ioe) {

    /**
     * Error handling code shared between the various getSchemaDocument() methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument0(XSDKey key, String schemaId, Element schemaElement) {

    /**
     * Code shared between the various getSchemaDocument() methods which
     * stores mapping information for the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(String schemaNamespace, StAXInputSource schemaSource,
            boolean mustResolve, short referType, Element referElement) {

    /**
     * getSchemaDocument method uses StAXInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(String schemaNamespace, DOMInputSource schemaSource,
            boolean mustResolve, short referType, Element referElement) {

    /**
     * getSchemaDocument method uses DOMInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(String schemaNamespace, SAXInputSource schemaSource,
            boolean mustResolve, short referType, Element referElement) {

    /**
     * getSchemaDocument method uses SAXInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(String schemaNamespace, XMLInputSource schemaSource,
            boolean mustResolve, short referType, Element referElement) {

    /**
     * getSchemaDocument method uses XMLInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element resolveSchema(XSDDescription desc, boolean mustResolve,
                                  Element referElement, boolean usePairs) {

    /**
     * resolveSchema method is responsible for resolving location of the schema (using XMLEntityResolver),
     * and if it was succefully resolved getting the schema Document.
     * @param desc
     * @param mustResolve
     * @param referElement
     * @return A schema Element or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
                if (info != null) {

                /** Only add annotations to the list if there were any in this document. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
            if (annotationInfo != null) {

            /** Collect annotation information for validation. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private void updateImportListWith(SchemaGrammar newGrammar) {

    /**
     * Namespace growth
     *
     * Go throuth the grammar bucket, and for each grammar in the bucket
     * check the import list. If there exists a grammar in import list
     * that has the same namespace as newGrammar, but a different instance,
     * then update the import list and replace the old grammar instance with
     * the new one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private void updateImportListFor(SchemaGrammar grammar) {

    /**
     * Namespace growth
     *
     * Go through the import list of a given grammar and for each imported
     * grammar, check to see if the grammar bucket has a newer version.
     * If a new instance is found, we update the import list with the
     * newer version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected SchemaGrammar findGrammar(XSDDescription desc, boolean ignoreConflict) {

    /**
     * First try to find a grammar in the bucket, if failed, consult the
     * grammar pool. If a grammar is found in the pool, then add it (and all
     * imported ones) into the bucket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    SchemaGrammar getGrammar(String tns) {

    /**
     * Pull the grammar out of the bucket simply using
     * its TNS as a key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
        Locale locale = fErrorReporter.getLocale();

        /** Set locale. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
        XMLErrorHandler errorHandler = fErrorReporter.getErrorHandler();

        /** Set error handler. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
        if (fValidateAnnotations && annotationInfo.size() > 0) {

        /** validate annotations **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public SchemaGrammar parseSchema(XMLInputSource is, XSDDescription desc,
            Map<String, XMLSchemaLoader.LocationArray> locationPairs)

    //************ Traversers **********
    XSDAttributeGroupTraverser fAttributeGroupTraverser;
    XSDAttributeTraverser fAttributeTraverser;
    XSDComplexTypeTraverser fComplexTypeTraverser;
    XSDElementTraverser fElementTraverser;
    XSDGroupTraverser fGroupTraverser;
    XSDKeyrefTraverser fKeyrefTraverser;
    XSDNotationTraverser fNotationTraverser;
    XSDSimpleTypeTraverser fSimpleTypeTraverser;
    XSDUniqueOrKeyTraverser fUniqueOrKeyTraverser;
    XSDWildcardTraverser fWildCardTraverser;

    SchemaDVFactory fDVFactory;
    SchemaDOMParser fSchemaParser;
    SchemaContentHandler fXSContentHandler;
    StAXSchemaParser fStAXSchemaParser;
    XML11Configuration fAnnotationValidator;
    XSAnnotationGrammarPool fGrammarBucketAdapter;

    // these data members are needed for the deferred traversal
    // of local elements.

    // the initial size of the array to store deferred local elements
    private static final int INIT_STACK_SIZE = 30;
    // the incremental size of the array to store deferred local elements
    private static final int INC_STACK_SIZE  = 10;
    // current position of the array (# of deferred local elements)
    private int fLocalElemStackPos = 0;

    private XSParticleDecl[] fParticle = new XSParticleDecl[INIT_STACK_SIZE];
    private Element[] fLocalElementDecl = new Element[INIT_STACK_SIZE];
    private XSDocumentInfo[] fLocalElementDecl_schema = new XSDocumentInfo[INIT_STACK_SIZE]; //JACK
    private int[] fAllContext = new int[INIT_STACK_SIZE];
    private XSObject[] fParent = new XSObject[INIT_STACK_SIZE];
    private String [][] fLocalElemNamespaceContext = new String [INIT_STACK_SIZE][1];

    // these data members are needed for the deferred traversal
    // of keyrefs.

    // the initial size of the array to store deferred keyrefs
    private static final int INIT_KEYREF_STACK = 2;
    // the incremental size of the array to store deferred keyrefs
    private static final int INC_KEYREF_STACK_AMOUNT = 2;
    // current position of the array (# of deferred keyrefs)
    private int fKeyrefStackPos = 0;

    private Element [] fKeyrefs = new Element[INIT_KEYREF_STACK];
    private XSDocumentInfo [] fKeyrefsMapXSDocumentInfo = new XSDocumentInfo[INIT_KEYREF_STACK];
    private XSElementDecl [] fKeyrefElems = new XSElementDecl [INIT_KEYREF_STACK];
    private String [][] fKeyrefNamespaceContext = new String[INIT_KEYREF_STACK][1];

    // global decls: map from decl name to decl object
    SymbolHash fGlobalAttrDecls = new SymbolHash(12);
    SymbolHash fGlobalAttrGrpDecls = new SymbolHash(5);
    SymbolHash fGlobalElemDecls = new SymbolHash(25);
    SymbolHash fGlobalGroupDecls = new SymbolHash(5);
    SymbolHash fGlobalNotationDecls = new SymbolHash(1);
    SymbolHash fGlobalIDConstraintDecls = new SymbolHash(3);
    SymbolHash fGlobalTypeDecls = new SymbolHash(25);

    // Constructors
    public XSDHandler(){
        fHiddenNodes = new HashMap<>();
        fSchemaParser = new SchemaDOMParser(new SchemaParsingConfig());
    }

    // it should be possible to use the same XSDHandler to parse
    // multiple schema documents; this will allow one to be
    // constructed.
    public XSDHandler (XSGrammarBucket gBucket) {
        this();
        fGrammarBucket = gBucket;

        // Note: don't use SchemaConfiguration internally
        //       we will get stack overflaw because
        //       XMLSchemaValidator will be instantiating XSDHandler...
        fSchemaGrammarDescription = new XSDDescription();
    } // end constructor

    /**
     * This method initiates the parse of a schema.  It will likely be
     * called from the Validator and it will make the
     * resulting grammar available; it returns a reference to this object just
     * in case.  A reset(XMLComponentManager) must be called before this methods is called.
     * @param is
     * @param desc
     * @param locationPairs
     * @return the SchemaGrammar
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
        if(ele.getOwnerDocument() instanceof com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM){

        /**
         * REVISIT: Casting until DOM Level 3 interfaces are available. -- mrglavas
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected XMLSecurityManager fSecureProcessing = null;

    /**
     * <p>Security manager in effect.</p>
     *
     * <p>Protected to allow access by any traverser.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

        /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String STRING_INTERNING =

    /** Feature identifier: string interning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private static final String NAMESPACE_PREFIXES =

    /** Feature identifier: namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String TOLERATE_DUPLICATES =

    /** Feature identifier: tolerate duplicates */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String HONOUR_ALL_SCHEMALOCATIONS =

    /** Feature identifier: honour all schemaLocations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String VALIDATE_ANNOTATIONS =

    /** Feature identifier: validate annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS =

    /** Feature: generate synthetic annotations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String DISALLOW_DOCTYPE =

    /** Feature: disallow doctype*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String STANDARD_URI_CONFORMANT_FEATURE =

    /** Feature identifier:  allow java encodings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier:  continue after fatal error */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier:  allow java encodings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String XMLSCHEMA_VALIDATION =

    /** feature identifier: XML Schema validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
public class XSDHandler {

/**
 * The purpose of this class is to co-ordinate the construction of a
 * grammar object corresponding to a schema.  To do this, it must be
 * prepared to parse several schema documents (for instance if the
 * schema document originally referred to contains <include> or
 * <redefined> information items).  If any of the schemas imports a
 * schema, other grammars may be constructed as a side-effect.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @author Pavani Mukthipudi, Sun Microsystems
 *
 * @version $Id: XSDHandler.java,v 1.9 2010-11-01 04:40:02 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public void setGenerateSyntheticAnnotations(boolean state) {

    /**
     * @param state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
            // condition 2: same namespace

            /** if (referType == XSDDescription.CONTEXT_REDEFINE ||
                    key.referType == XSDDescription.CONTEXT_REDEFINE) {
                if (referType != key.referType)
                    return false;
            }**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private static class XSDKey {

    /**
     * used to identify a reference to a schema document
     * if the same document is referenced twice with the same key, then
     * we only need to parse it once.
     *
     * When 2 XSDKey's are compared, the following table can be used to
     * determine whether they are equal:
     *      inc     red     imp     pre     ins
     * inc  N/L      ?      N/L     N/L     N/L
     * red   ?      N/L      ?       ?       ?
     * imp  N/L      ?      N/P     N/P     N/P
     * pre  N/L      ?      N/P     N/P     N/P
     * ins  N/L      ?      N/P     N/P     N/P
     *
     * Where: N/L: duplicate when they have the same namespace and location.
     *         ? : not clear from the spec.
     *             REVISIT: to simplify the process, also considering
     *             it's very rare, we treat them as not duplicate.
     *        N/P: not possible. imp/pre/ins are referenced by namespace.
     *             when the first time we encounter a schema document for a
     *             namespace, we create a grammar and store it in the grammar
     *             bucket. when we see another reference to the same namespace,
     *             we first check whether a grammar with the same namespace is
     *             already in the bucket, which is true in this case, so we
     *             won't create another XSDKey.
     *
     * Conclusion from the table: two XSDKey's are duplicate only when all of
     * the following are true:
     * 1. They are both "redefine", or neither is "redefine";
     * 2. They have the same namespace;
     * 3. They have the same non-null location.
     *
     * About 3: if neither has a non-null location, then it's the case where
     * 2 input streams are provided, but no system ID is provided. We can't tell
     * whether the 2 streams have the same content, so we treat them as not
     * duplicate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
                        for (int i = 0; i < schemaGrammars.length; ++i) {

                        /**
                         * If the grammar bucket already contains the schema for schemas
                         * then we already have the definitions for the parts relevant
                         * to annotations.
                         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private static class XSAnnotationGrammarPool implements XMLGrammarPool {

    /**
     * Grammar pool used for validating annotations. This will return all of the
     * grammars from the grammar bucket. It will also return an object for the
     * schema for schemas which will contain at least the relevant declarations
     * for annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public boolean element2Locator(Element e, SimpleLocator l) {

    /**
     * Extract location information from an Element node, store such
     * information in the passed-in SimpleLocator object, then return
     * true. Returning false means can't extract or store such information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public SimpleLocator element2Locator(Element e) {

    /**
     * Extract location information from an Element node, and create a
     * new SimpleLocator object from such information. Returning null means
     * no information can be retrieved from the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    } // findXSDocumentForDecl(XSDocumentInfo, Element):  XSDocumentInfo

        /*********
         Logic here is unnecessary after schema WG's recent decision to allow
         schema components from one document to refer to components of any other,
         so long as there's some include/import/redefine path amongst them.
         If they rver reverse this decision the code's right here though...  - neilg
         // now look in fDependencyMap to see if this is reachable
          if(((Vector)fDependencyMap.get(currSchema)).contains(declDocInfo)) {
          return declDocInfo;
          }
          // obviously the requesting doc didn't include, redefine or
           // import the one containing decl...
            return null;
            **********/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    void checkForDuplicateNames(String qName, int declType,
            Map<String,Element> registry, Map<String,XSDocumentInfo> registry_sub, Element currComp,
            XSDocumentInfo currSchema) {

    /** This method makes sure that
     * if this component is being redefined that it lives in the
     * right schema.  It then renames the component correctly.  If it
     * detects a collision--a duplicate definition--then it complains.
     * Note that redefines must be handled carefully:  if there
     * is a collision, it may be because we're redefining something we know about
     * or because we've found the thing we're redefining.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    void traverseLocalElements() {

    /**
     * Traverse all the deferred local elements. This method should be called
     * by traverseSchemas after we've done with all the global declarations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(XSInputSource schemaSource, XSDDescription desc) {

    /**
     * getSchemaDocument method uses XMLInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument1(boolean mustResolve, boolean hasInput,
            XMLInputSource schemaSource, Element referElement, IOException ioe) {

    /**
     * Error handling code shared between the various getSchemaDocument() methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument0(XSDKey key, String schemaId, Element schemaElement) {

    /**
     * Code shared between the various getSchemaDocument() methods which
     * stores mapping information for the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(String schemaNamespace, StAXInputSource schemaSource,
            boolean mustResolve, short referType, Element referElement) {

    /**
     * getSchemaDocument method uses StAXInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(String schemaNamespace, DOMInputSource schemaSource,
            boolean mustResolve, short referType, Element referElement) {

    /**
     * getSchemaDocument method uses DOMInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(String schemaNamespace, SAXInputSource schemaSource,
            boolean mustResolve, short referType, Element referElement) {

    /**
     * getSchemaDocument method uses SAXInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element getSchemaDocument(String schemaNamespace, XMLInputSource schemaSource,
            boolean mustResolve, short referType, Element referElement) {

    /**
     * getSchemaDocument method uses XMLInputSource to parse a schema document.
     * @param schemaNamespace
     * @param schemaSource
     * @param mustResolve
     * @param referType
     * @param referElement
     * @return A schema Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private Element resolveSchema(XSDDescription desc, boolean mustResolve,
                                  Element referElement, boolean usePairs) {

    /**
     * resolveSchema method is responsible for resolving location of the schema (using XMLEntityResolver),
     * and if it was succefully resolved getting the schema Document.
     * @param desc
     * @param mustResolve
     * @param referElement
     * @return A schema Element or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
                if (info != null) {

                /** Only add annotations to the list if there were any in this document. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
            if (annotationInfo != null) {

            /** Collect annotation information for validation. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private void updateImportListWith(SchemaGrammar newGrammar) {

    /**
     * Namespace growth
     *
     * Go throuth the grammar bucket, and for each grammar in the bucket
     * check the import list. If there exists a grammar in import list
     * that has the same namespace as newGrammar, but a different instance,
     * then update the import list and replace the old grammar instance with
     * the new one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private void updateImportListFor(SchemaGrammar grammar) {

    /**
     * Namespace growth
     *
     * Go through the import list of a given grammar and for each imported
     * grammar, check to see if the grammar bucket has a newer version.
     * If a new instance is found, we update the import list with the
     * newer version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected SchemaGrammar findGrammar(XSDDescription desc, boolean ignoreConflict) {

    /**
     * First try to find a grammar in the bucket, if failed, consult the
     * grammar pool. If a grammar is found in the pool, then add it (and all
     * imported ones) into the bucket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    SchemaGrammar getGrammar(String tns) {

    /**
     * Pull the grammar out of the bucket simply using
     * its TNS as a key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
        Locale locale = fErrorReporter.getLocale();

        /** Set locale. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
        XMLErrorHandler errorHandler = fErrorReporter.getErrorHandler();

        /** Set error handler. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
        if (fValidateAnnotations && annotationInfo.size() > 0) {

        /** validate annotations **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public SchemaGrammar parseSchema(XMLInputSource is, XSDDescription desc,
            Map<String, XMLSchemaLoader.LocationArray> locationPairs)

    //************ Traversers **********
    XSDAttributeGroupTraverser fAttributeGroupTraverser;
    XSDAttributeTraverser fAttributeTraverser;
    XSDComplexTypeTraverser fComplexTypeTraverser;
    XSDElementTraverser fElementTraverser;
    XSDGroupTraverser fGroupTraverser;
    XSDKeyrefTraverser fKeyrefTraverser;
    XSDNotationTraverser fNotationTraverser;
    XSDSimpleTypeTraverser fSimpleTypeTraverser;
    XSDUniqueOrKeyTraverser fUniqueOrKeyTraverser;
    XSDWildcardTraverser fWildCardTraverser;

    SchemaDVFactory fDVFactory;
    SchemaDOMParser fSchemaParser;
    SchemaContentHandler fXSContentHandler;
    StAXSchemaParser fStAXSchemaParser;
    XML11Configuration fAnnotationValidator;
    XSAnnotationGrammarPool fGrammarBucketAdapter;

    // these data members are needed for the deferred traversal
    // of local elements.

    // the initial size of the array to store deferred local elements
    private static final int INIT_STACK_SIZE = 30;
    // the incremental size of the array to store deferred local elements
    private static final int INC_STACK_SIZE  = 10;
    // current position of the array (# of deferred local elements)
    private int fLocalElemStackPos = 0;

    private XSParticleDecl[] fParticle = new XSParticleDecl[INIT_STACK_SIZE];
    private Element[] fLocalElementDecl = new Element[INIT_STACK_SIZE];
    private XSDocumentInfo[] fLocalElementDecl_schema = new XSDocumentInfo[INIT_STACK_SIZE]; //JACK
    private int[] fAllContext = new int[INIT_STACK_SIZE];
    private XSObject[] fParent = new XSObject[INIT_STACK_SIZE];
    private String [][] fLocalElemNamespaceContext = new String [INIT_STACK_SIZE][1];

    // these data members are needed for the deferred traversal
    // of keyrefs.

    // the initial size of the array to store deferred keyrefs
    private static final int INIT_KEYREF_STACK = 2;
    // the incremental size of the array to store deferred keyrefs
    private static final int INC_KEYREF_STACK_AMOUNT = 2;
    // current position of the array (# of deferred keyrefs)
    private int fKeyrefStackPos = 0;

    private Element [] fKeyrefs = new Element[INIT_KEYREF_STACK];
    private XSDocumentInfo [] fKeyrefsMapXSDocumentInfo = new XSDocumentInfo[INIT_KEYREF_STACK];
    private XSElementDecl [] fKeyrefElems = new XSElementDecl [INIT_KEYREF_STACK];
    private String [][] fKeyrefNamespaceContext = new String[INIT_KEYREF_STACK][1];

    // global decls: map from decl name to decl object
    SymbolHash fGlobalAttrDecls = new SymbolHash(12);
    SymbolHash fGlobalAttrGrpDecls = new SymbolHash(5);
    SymbolHash fGlobalElemDecls = new SymbolHash(25);
    SymbolHash fGlobalGroupDecls = new SymbolHash(5);
    SymbolHash fGlobalNotationDecls = new SymbolHash(1);
    SymbolHash fGlobalIDConstraintDecls = new SymbolHash(3);
    SymbolHash fGlobalTypeDecls = new SymbolHash(25);

    // Constructors
    public XSDHandler(){
        fHiddenNodes = new HashMap<>();
        fSchemaParser = new SchemaDOMParser(new SchemaParsingConfig());
    }

    // it should be possible to use the same XSDHandler to parse
    // multiple schema documents; this will allow one to be
    // constructed.
    public XSDHandler (XSGrammarBucket gBucket) {
        this();
        fGrammarBucket = gBucket;

        // Note: don't use SchemaConfiguration internally
        //       we will get stack overflaw because
        //       XMLSchemaValidator will be instantiating XSDHandler...
        fSchemaGrammarDescription = new XSDDescription();
    } // end constructor

    /**
     * This method initiates the parse of a schema.  It will likely be
     * called from the Validator and it will make the
     * resulting grammar available; it returns a reference to this object just
     * in case.  A reset(XMLComponentManager) must be called before this methods is called.
     * @param is
     * @param desc
     * @param locationPairs
     * @return the SchemaGrammar
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
        if(ele.getOwnerDocument() instanceof com.sun.org.apache.xerces.internal.impl.xs.opti.SchemaDOM){

        /**
         * REVISIT: Casting until DOM Level 3 interfaces are available. -- mrglavas
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected XMLSecurityManager fSecureProcessing = null;

    /**
     * <p>Security manager in effect.</p>
     *
     * <p>Protected to allow access by any traverser.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

        /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String LOCALE =

    /** Property identifier: locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String SECURITY_MANAGER =

    /** Property identifier: security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String ENTITY_MANAGER =

    /** Property identifier: entity manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    public static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String JAXP_SCHEMA_SOURCE =

    /** Property identifier: JAXP schema source. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String STRING_INTERNING =

    /** Feature identifier: string interning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    private static final String NAMESPACE_PREFIXES =

    /** Feature identifier: namespace prefixes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String TOLERATE_DUPLICATES =

    /** Feature identifier: tolerate duplicates */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String NAMESPACE_GROWTH =

    /** Feature identifier: namespace growth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String HONOUR_ALL_SCHEMALOCATIONS =

    /** Feature identifier: honour all schemaLocations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String VALIDATE_ANNOTATIONS =

    /** Feature identifier: validate annotations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String GENERATE_SYNTHETIC_ANNOTATIONS =

    /** Feature: generate synthetic annotations */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String DISALLOW_DOCTYPE =

    /** Feature: disallow doctype*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String STANDARD_URI_CONFORMANT_FEATURE =

    /** Feature identifier:  allow java encodings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String CONTINUE_AFTER_FATAL_ERROR =

    /** Feature identifier:  continue after fatal error */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String ALLOW_JAVA_ENCODINGS =

    /** Feature identifier:  allow java encodings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String XMLSCHEMA_VALIDATION =

    /** feature identifier: XML Schema validation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
    protected static final String VALIDATION =

    /** Feature identifier: validation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/traversers/XSDHandler.java
public class XSDHandler {

/**
 * The purpose of this class is to co-ordinate the construction of a
 * grammar object corresponding to a schema.  To do this, it must be
 * prepared to parse several schema documents (for instance if the
 * schema document originally referred to contains <include> or
 * <redefined> information items).  If any of the schemas imports a
 * schema, other grammars may be constructed as a side-effect.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @author Pavani Mukthipudi, Sun Microsystems
 *
 * @version $Id: XSDHandler.java,v 1.9 2010-11-01 04:40:02 joehw Exp $
 */
