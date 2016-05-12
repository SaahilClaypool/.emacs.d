_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLDTDValidator createDTDValidator() {

    /** Create a DTD validator: this validator performs namespace binding.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLDocumentScanner createDocumentScanner() {

    /** Create a document scanner: this scanner performs namespace binding
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
        protected void configurePipeline() {

    /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    public IntegratedParserConfiguration(SymbolTable symbolTable,
                                         XMLGrammarPool grammarPool,
                                         XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table,
     * grammar pool, and parent settings.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable    The symbol table to use.
     * @param grammarPool    The grammar pool to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    public IntegratedParserConfiguration(SymbolTable symbolTable,
                                         XMLGrammarPool grammarPool) {

    /**
     * Constructs a parser configuration using the specified symbol table and
     * grammar pool.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable The symbol table to use.
     * @param grammarPool The grammar pool to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    public IntegratedParserConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    public IntegratedParserConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLDTDValidator fNonNSDTDValidator;

    /** DTD Validator that does not bind namespaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLDocumentScannerImpl fNonNSScanner;

    /** Default Xerces implementation of scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLNSDocumentScannerImpl fNamespaceScanner;

    /** Document scanner that does namespace binding. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
public class IntegratedParserConfiguration

/**
 * This is configuration uses a scanner that integrates both scanning of the document
 * and binding namespaces.
 *
 * If namespace feature is turned on, the pipeline is constructured with the
 * following components:
 * XMLNSDocumentScannerImpl -> XMLNSDTDValidator -> (optional) XMLSchemaValidator
 *
 * If the namespace feature is turned off the default document scanner implementation
 * is used (XMLDocumentScannerImpl).
 * <p>
 * In addition to the features and properties recognized by the base
 * parser configuration, this class recognizes these additional
 * features and properties:
 * <ul>
 * <li>Features
 *  <ul>
 *  <li>http://apache.org/xml/features/validation/schema</li>
 *  <li>http://apache.org/xml/features/validation/schema-full-checking</li>
 *  <li>http://apache.org/xml/features/validation/schema/normalized-value</li>
 *  <li>http://apache.org/xml/features/validation/schema/element-default</li>
 *  </ul>
 * <li>Properties
 *  <ul>
 *   <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *   <li>http://apache.org/xml/properties/internal/entity-manager</li>
 *   <li>http://apache.org/xml/properties/internal/document-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/dtd-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *   <li>http://apache.org/xml/properties/internal/validator/dtd</li>
 *   <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 *  </ul>
 * </ul>
 *
 * @author Elena Litani, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLDTDValidator createDTDValidator() {

    /** Create a DTD validator: this validator performs namespace binding.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLDocumentScanner createDocumentScanner() {

    /** Create a document scanner: this scanner performs namespace binding
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
        protected void configurePipeline() {

    /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    public IntegratedParserConfiguration(SymbolTable symbolTable,
                                         XMLGrammarPool grammarPool,
                                         XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table,
     * grammar pool, and parent settings.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable    The symbol table to use.
     * @param grammarPool    The grammar pool to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    public IntegratedParserConfiguration(SymbolTable symbolTable,
                                         XMLGrammarPool grammarPool) {

    /**
     * Constructs a parser configuration using the specified symbol table and
     * grammar pool.
     * <p>
     * <strong>REVISIT:</strong>
     * Grammar pool will be updated when the new validation engine is
     * implemented.
     *
     * @param symbolTable The symbol table to use.
     * @param grammarPool The grammar pool to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    public IntegratedParserConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    public IntegratedParserConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLDTDValidator fNonNSDTDValidator;

    /** DTD Validator that does not bind namespaces */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLDocumentScannerImpl fNonNSScanner;

    /** Default Xerces implementation of scanner */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
    protected XMLNSDocumentScannerImpl fNamespaceScanner;

    /** Document scanner that does namespace binding. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/IntegratedParserConfiguration.java
public class IntegratedParserConfiguration

/**
 * This is configuration uses a scanner that integrates both scanning of the document
 * and binding namespaces.
 *
 * If namespace feature is turned on, the pipeline is constructured with the
 * following components:
 * XMLNSDocumentScannerImpl -> XMLNSDTDValidator -> (optional) XMLSchemaValidator
 *
 * If the namespace feature is turned off the default document scanner implementation
 * is used (XMLDocumentScannerImpl).
 * <p>
 * In addition to the features and properties recognized by the base
 * parser configuration, this class recognizes these additional
 * features and properties:
 * <ul>
 * <li>Features
 *  <ul>
 *  <li>http://apache.org/xml/features/validation/schema</li>
 *  <li>http://apache.org/xml/features/validation/schema-full-checking</li>
 *  <li>http://apache.org/xml/features/validation/schema/normalized-value</li>
 *  <li>http://apache.org/xml/features/validation/schema/element-default</li>
 *  </ul>
 * <li>Properties
 *  <ul>
 *   <li>http://apache.org/xml/properties/internal/error-reporter</li>
 *   <li>http://apache.org/xml/properties/internal/entity-manager</li>
 *   <li>http://apache.org/xml/properties/internal/document-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/dtd-scanner</li>
 *   <li>http://apache.org/xml/properties/internal/grammar-pool</li>
 *   <li>http://apache.org/xml/properties/internal/validator/dtd</li>
 *   <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li>
 *  </ul>
 * </ul>
 *
 * @author Elena Litani, IBM
 *
 */
