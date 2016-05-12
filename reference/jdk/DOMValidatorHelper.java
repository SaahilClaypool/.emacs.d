_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
        protected boolean fDOMContextBuilt = false;

        /**
         * Flag indicating whether the namespace context
         * has been from the root node's ancestors.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
        protected int fNamespaceSize = 0;

        /** The size of the namespace information array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
        protected String[] fNamespace = new String[16 * 2];

        /**
         * Namespace binding information. This array is composed of a
         * series of tuples containing the namespace binding information:
         * &lt;prefix, uri&gt;.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    final class DOMNamespaceContext implements NamespaceContext {

    /**
     * NamespaceContext for the DOMSource, includes context for ancestor nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void setupDOMResultHandler(DOMSource source, DOMResult result) throws SAXException {

    /**
     * Sets up handler for <code>DOMResult</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void setupEntityMap(Document doc) {

    /**
     * Extracts NamedNodeMap of entities. We need this to validate
     * elements and attributes of type xs:ENTITY, xs:ENTITIES or
     * types dervied from them.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void finishNode(Node node) {

    /** Do processing for the end of a node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
                if (fDOMValidatorHandler != null) {

                /**
                 * Send the DocumentType node directly to the result builder.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
                if (fDOMValidatorHandler != null) {

                /**
                 * The validator does nothing with comments so bypass it.
                 * Send the Comment node directly to the result builder.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
                if (fDOMValidatorHandler != null) {

                /**
                 * The validator does nothing with processing instructions so bypass it.
                 * Send the ProcessingInstruction node directly to the result builder.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void beginNode(Node node) {

    /** Do processing for the start of a node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void validate(Node node) {

    /** Traverse the DOM and fire events to the schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    final QName fElementQName = new QName();

    /** Fields for start element, end element and characters. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private Node fCurrentElement;

    /** Current element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private Node fRoot;

    /** Root node. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private char [] fCharBuffer = new char[CHUNK_SIZE];

    /** Array for holding character data. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private NamedNodeMap fEntities = null;

    /** Map for tracking unparsed entities. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private final DOMResultBuilder fDOMResultBuilder = new DOMResultBuilder();

    /** DOM result builder. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private final DOMResultAugmentor fDOMResultAugmentor = new DOMResultAugmentor(this);

    /** DOM result augmentor. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private DOMDocumentHandler fDOMValidatorHandler;

    /** DOM document handler. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private final SimpleLocator fXMLLocator = new SimpleLocator(null, null, -1, -1, -1);

    /** Simple Locator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private XMLSchemaValidatorComponentManager fComponentManager;

    /** Component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private ValidationManager fValidationManager;

    /** Validation manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private SymbolTable fSymbolTable;

    /** Symbol table **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private XMLSchemaValidator fSchemaValidator;

    /** Schema validator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private DOMNamespaceContext fDOMNamespaceContext = new DOMNamespaceContext();

    /** The namespace context of the DOMSource, includes context from ancestor nodes. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private NamespaceSupport fNamespaceContext;

    /** The namespace context of this document: stores namespaces in scope. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String VALIDATION_MANAGER =

    /** Property identifier: validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String SCHEMA_VALIDATOR =

    /** Property identifier: XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String NAMESPACE_CONTEXT =

    /** Property identifier: namespace context. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask (CHUNK_SIZE - 1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final int CHUNK_SIZE = (1 << 10);

    /** Chunk size (1024). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
final class DOMValidatorHelper implements ValidatorHelper, EntityState {

/**
 * <p>A validator helper for <code>DOMSource</code>s.</p>
 *
 * @author Michael Glavassevich, IBM
 * @version $Id: DOMValidatorHelper.java,v 1.9 2010-11-01 04:40:08 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
        protected boolean fDOMContextBuilt = false;

        /**
         * Flag indicating whether the namespace context
         * has been from the root node's ancestors.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
        protected int fNamespaceSize = 0;

        /** The size of the namespace information array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
        protected String[] fNamespace = new String[16 * 2];

        /**
         * Namespace binding information. This array is composed of a
         * series of tuples containing the namespace binding information:
         * &lt;prefix, uri&gt;.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    final class DOMNamespaceContext implements NamespaceContext {

    /**
     * NamespaceContext for the DOMSource, includes context for ancestor nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void setupDOMResultHandler(DOMSource source, DOMResult result) throws SAXException {

    /**
     * Sets up handler for <code>DOMResult</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void setupEntityMap(Document doc) {

    /**
     * Extracts NamedNodeMap of entities. We need this to validate
     * elements and attributes of type xs:ENTITY, xs:ENTITIES or
     * types dervied from them.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void finishNode(Node node) {

    /** Do processing for the end of a node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
                if (fDOMValidatorHandler != null) {

                /**
                 * Send the DocumentType node directly to the result builder.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
                if (fDOMValidatorHandler != null) {

                /**
                 * The validator does nothing with comments so bypass it.
                 * Send the Comment node directly to the result builder.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
                if (fDOMValidatorHandler != null) {

                /**
                 * The validator does nothing with processing instructions so bypass it.
                 * Send the ProcessingInstruction node directly to the result builder.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void beginNode(Node node) {

    /** Do processing for the start of a node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private void validate(Node node) {

    /** Traverse the DOM and fire events to the schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    final QName fElementQName = new QName();

    /** Fields for start element, end element and characters. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private Node fCurrentElement;

    /** Current element. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private Node fRoot;

    /** Root node. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private char [] fCharBuffer = new char[CHUNK_SIZE];

    /** Array for holding character data. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private NamedNodeMap fEntities = null;

    /** Map for tracking unparsed entities. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private final DOMResultBuilder fDOMResultBuilder = new DOMResultBuilder();

    /** DOM result builder. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private final DOMResultAugmentor fDOMResultAugmentor = new DOMResultAugmentor(this);

    /** DOM result augmentor. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private DOMDocumentHandler fDOMValidatorHandler;

    /** DOM document handler. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private final SimpleLocator fXMLLocator = new SimpleLocator(null, null, -1, -1, -1);

    /** Simple Locator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private XMLSchemaValidatorComponentManager fComponentManager;

    /** Component manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private ValidationManager fValidationManager;

    /** Validation manager. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private SymbolTable fSymbolTable;

    /** Symbol table **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private XMLSchemaValidator fSchemaValidator;

    /** Schema validator. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private DOMNamespaceContext fDOMNamespaceContext = new DOMNamespaceContext();

    /** The namespace context of the DOMSource, includes context from ancestor nodes. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private NamespaceSupport fNamespaceContext;

    /** The namespace context of this document: stores namespaces in scope. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private XMLErrorReporter fErrorReporter;

    /** Error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String VALIDATION_MANAGER =

    /** Property identifier: validation manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String SCHEMA_VALIDATOR =

    /** Property identifier: XML Schema validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String NAMESPACE_CONTEXT =

    /** Property identifier: namespace context. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask (CHUNK_SIZE - 1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
    private static final int CHUNK_SIZE = (1 << 10);

    /** Chunk size (1024). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMValidatorHelper.java
final class DOMValidatorHelper implements ValidatorHelper, EntityState {

/**
 * <p>A validator helper for <code>DOMSource</code>s.</p>
 *
 * @author Michael Glavassevich, IBM
 * @version $Id: DOMValidatorHelper.java,v 1.9 2010-11-01 04:40:08 joehw Exp $
 */
