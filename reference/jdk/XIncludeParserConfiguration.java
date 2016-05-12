_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected void configurePipeline() {

        /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    public XIncludeParserConfiguration(
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    public XIncludeParserConfiguration(
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    public XIncludeParserConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    public XIncludeParserConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String NAMESPACE_CONTEXT =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String XINCLUDE_HANDLER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String XINCLUDE_FIXUP_LANGUAGE =

    /** Feature identifier: fixup language. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String XINCLUDE_FIXUP_BASE_URIS =

    /** Feature identifier: fixup base URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String ALLOW_UE_AND_NOTATION_EVENTS =

    /** Feature identifier: allow notation and unparsed entity events to be sent out of order. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
public class XIncludeParserConfiguration extends XML11Configuration {

/**
 * This parser configuration includes an <code>XIncludeHandler</code> in the pipeline
 * before the schema validator, or as the last component in the pipeline if there is
 * no schema validator.  Using this pipeline will enable processing according to the
 * XML Inclusions specification, to the conformance level described in
 * <code>XIncludeHandler</code>.
 *
 * @author Peter McCracken, IBM
 * @see com.sun.org.apache.xerces.internal.xinclude.XIncludeHandler
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected void configurePipeline() {

        /** Configures the pipeline. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    public XIncludeParserConfiguration(
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    public XIncludeParserConfiguration(
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    public XIncludeParserConfiguration(SymbolTable symbolTable) {

    /**
     * Constructs a parser configuration using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    public XIncludeParserConfiguration() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String NAMESPACE_CONTEXT =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String XINCLUDE_HANDLER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String XINCLUDE_FIXUP_LANGUAGE =

    /** Feature identifier: fixup language. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String XINCLUDE_FIXUP_BASE_URIS =

    /** Feature identifier: fixup base URIs. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
    protected static final String ALLOW_UE_AND_NOTATION_EVENTS =

    /** Feature identifier: allow notation and unparsed entity events to be sent out of order. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XIncludeParserConfiguration.java
public class XIncludeParserConfiguration extends XML11Configuration {

/**
 * This parser configuration includes an <code>XIncludeHandler</code> in the pipeline
 * before the schema validator, or as the last component in the pipeline if there is
 * no schema validator.  Using this pipeline will enable processing according to the
 * XML Inclusions specification, to the conformance level described in
 * <code>XIncludeHandler</code>.
 *
 * @author Peter McCracken, IBM
 * @see com.sun.org.apache.xerces.internal.xinclude.XIncludeHandler
 */
