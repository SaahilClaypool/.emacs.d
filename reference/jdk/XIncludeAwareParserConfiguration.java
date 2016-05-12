_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected void configurePipeline() {

    /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    public XIncludeAwareParserConfiguration(
            SymbolTable symbolTable,
            XMLGrammarPool grammarPool,
            XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table,
     * grammar pool, and parent settings.
     * <p>
     *
     * @param symbolTable    The symbol table to use.
     * @param grammarPool    The grammar pool to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    public XIncludeAwareParserConfiguration(
            SymbolTable symbolTable,
            XMLGrammarPool grammarPool) {

    /**
     * Constructs a parser configuration using the specified symbol table and
     * grammar pool.
     * <p>
     *
     * @param symbolTable The symbol table to use.
     * @param grammarPool The grammar pool to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    public XIncludeAwareParserConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    public XIncludeAwareParserConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected boolean fXIncludeEnabled = false;

    /** Flag indicating whether XInclude processsing is enabled. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected NamespaceContext fCurrentNSContext;

    /** Current NamespaceContext. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected XIncludeNamespaceSupport fXIncludeNSContext;

    /** XInclude NamespaceContext. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected NamespaceSupport fNonXIncludeNSContext;

    /** Non-XInclude NamespaceContext. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected XIncludeHandler fXIncludeHandler;

    /** XInclude handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String NAMESPACE_CONTEXT =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String XINCLUDE_HANDLER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String XINCLUDE_FEATURE =

    /** Feature identifier: XInclude processing */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String XINCLUDE_FIXUP_LANGUAGE =

    /** Feature identifier: fixup language. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String XINCLUDE_FIXUP_BASE_URIS =

    /** Feature identifier: fixup base URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String ALLOW_UE_AND_NOTATION_EVENTS =

    /** Feature identifier: allow notation and unparsed entity events to be sent out of order. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
public class XIncludeAwareParserConfiguration extends XML11Configuration {

/**
 * This class is the configuration used to parse XML 1.0 and XML 1.1 documents
 * and provides support for XInclude. This is the default Xerces configuration.
 *
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XIncludeAwareParserConfiguration.java,v 1.5 2010-11-01 04:40:10 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected void configurePipeline() {

    /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    public XIncludeAwareParserConfiguration(
            SymbolTable symbolTable,
            XMLGrammarPool grammarPool,
            XMLComponentManager parentSettings) {

    /**
     * Constructs a parser configuration using the specified symbol table,
     * grammar pool, and parent settings.
     * <p>
     *
     * @param symbolTable    The symbol table to use.
     * @param grammarPool    The grammar pool to use.
     * @param parentSettings The parent settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    public XIncludeAwareParserConfiguration(
            SymbolTable symbolTable,
            XMLGrammarPool grammarPool) {

    /**
     * Constructs a parser configuration using the specified symbol table and
     * grammar pool.
     * <p>
     *
     * @param symbolTable The symbol table to use.
     * @param grammarPool The grammar pool to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    public XIncludeAwareParserConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    public XIncludeAwareParserConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected boolean fXIncludeEnabled = false;

    /** Flag indicating whether XInclude processsing is enabled. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected NamespaceContext fCurrentNSContext;

    /** Current NamespaceContext. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected XIncludeNamespaceSupport fXIncludeNSContext;

    /** XInclude NamespaceContext. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected NamespaceSupport fNonXIncludeNSContext;

    /** Non-XInclude NamespaceContext. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected XIncludeHandler fXIncludeHandler;

    /** XInclude handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String NAMESPACE_CONTEXT =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String XINCLUDE_HANDLER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String XINCLUDE_FEATURE =

    /** Feature identifier: XInclude processing */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String XINCLUDE_FIXUP_LANGUAGE =

    /** Feature identifier: fixup language. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String XINCLUDE_FIXUP_BASE_URIS =

    /** Feature identifier: fixup base URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
    protected static final String ALLOW_UE_AND_NOTATION_EVENTS =

    /** Feature identifier: allow notation and unparsed entity events to be sent out of order. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeAwareParserConfiguration.java
public class XIncludeAwareParserConfiguration extends XML11Configuration {

/**
 * This class is the configuration used to parse XML 1.0 and XML 1.1 documents
 * and provides support for XInclude. This is the default Xerces configuration.
 *
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XIncludeAwareParserConfiguration.java,v 1.5 2010-11-01 04:40:10 joehw Exp $
 */
