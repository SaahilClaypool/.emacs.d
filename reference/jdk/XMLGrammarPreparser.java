_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLGrammarPool getGrammarPool() {

    /** Returns the registered grammar pool.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public void setGrammarPool(XMLGrammarPool grammarPool) {

    /**
     * Sets the grammar pool.
     *
     * @param grammarPool The new grammar pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLEntityResolver getEntityResolver() {

    /** Returns the registered entity resolver.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public void setEntityResolver(XMLEntityResolver entityResolver) {

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLErrorHandler getErrorHandler() {

    /** Returns the registered error handler.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public void setErrorHandler(XMLErrorHandler errorHandler) {

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public Locale getLocale() {

    /** Return the Locale the XMLGrammarLoader is using. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public void setLocale(Locale locale) {

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     * @exception XNIException Thrown if the parser does not support the
     *                         specified locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public Grammar preparseGrammar(String type, XMLInputSource
                is) throws XNIException, IOException {

    /**
     * Parse a grammar from a location identified by an
     * XMLInputSource.
     * This method also adds this grammar to the XMLGrammarPool
     *
     * @param type The type of the grammar to be constructed
     * @param is The XMLInputSource containing this grammar's
     * information
     * <strong>If a URI is included in the systemId field, the parser will not expand this URI or make it
     * available to the EntityResolver</strong>
     * @return The newly created <code>Grammar</code>.
     * @exception XNIException thrown on an error in grammar
     * construction
     * @exception IOException thrown if an error is encountered
     * in reading the file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLGrammarPreparser (SymbolTable symbolTable) {

    /**
     * Constructs a preparser using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLGrammarPreparser() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String GRAMMAR_POOL =

    /** Property identifier: grammar pool . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
public class XMLGrammarPreparser {

/**
 * <p> This class provides an easy way for a user to preparse grammars
 * of various types.  By default, it knows how to preparse external
 * DTD's and schemas; it provides an easy way for user applications to
 * register classes that know how to parse additional grammar types.
 * By default, it does no grammar caching; but it provides ways for
 * user applications to do so.
 *
 * @author Neil Graham, IBM
 *
 * @version $Id: XMLGrammarPreparser.java,v 1.7 2010-11-01 04:40:10 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLGrammarPool getGrammarPool() {

    /** Returns the registered grammar pool.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public void setGrammarPool(XMLGrammarPool grammarPool) {

    /**
     * Sets the grammar pool.
     *
     * @param grammarPool The new grammar pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLEntityResolver getEntityResolver() {

    /** Returns the registered entity resolver.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public void setEntityResolver(XMLEntityResolver entityResolver) {

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLErrorHandler getErrorHandler() {

    /** Returns the registered error handler.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public void setErrorHandler(XMLErrorHandler errorHandler) {

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public Locale getLocale() {

    /** Return the Locale the XMLGrammarLoader is using. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public void setLocale(Locale locale) {

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     * @exception XNIException Thrown if the parser does not support the
     *                         specified locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public Grammar preparseGrammar(String type, XMLInputSource
                is) throws XNIException, IOException {

    /**
     * Parse a grammar from a location identified by an
     * XMLInputSource.
     * This method also adds this grammar to the XMLGrammarPool
     *
     * @param type The type of the grammar to be constructed
     * @param is The XMLInputSource containing this grammar's
     * information
     * <strong>If a URI is included in the systemId field, the parser will not expand this URI or make it
     * available to the EntityResolver</strong>
     * @return The newly created <code>Grammar</code>.
     * @exception XNIException thrown on an error in grammar
     * construction
     * @exception IOException thrown if an error is encountered
     * in reading the file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLGrammarPreparser (SymbolTable symbolTable) {

    /**
     * Constructs a preparser using the specified symbol table.
     *
     * @param symbolTable The symbol table to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    public XMLGrammarPreparser() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    private static final String[] RECOGNIZED_PROPERTIES = {

    /** Recognized properties. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String GRAMMAR_POOL =

    /** Property identifier: grammar pool . */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String ENTITY_RESOLVER =

    /** Property identifier: entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String ERROR_HANDLER =

    /** Property identifier: error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String ERROR_REPORTER =

    /** Property identifier: error reporter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
    protected static final String SYMBOL_TABLE =

    /** Property identifier: symbol table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/parsers/XMLGrammarPreparser.java
public class XMLGrammarPreparser {

/**
 * <p> This class provides an easy way for a user to preparse grammars
 * of various types.  By default, it knows how to preparse external
 * DTD's and schemas; it provides an easy way for user applications to
 * register classes that know how to parse additional grammar types.
 * By default, it does no grammar caching; but it provides ways for
 * user applications to do so.
 *
 * @author Neil Graham, IBM
 *
 * @version $Id: XMLGrammarPreparser.java,v 1.7 2010-11-01 04:40:10 joehw Exp $
 */
