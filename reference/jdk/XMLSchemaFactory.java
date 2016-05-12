_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    static class XMLGrammarPoolWrapper implements XMLGrammarPool {

    /**
     * A grammar pool which wraps another.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
        int getGrammarCount() {

        /** Returns the number of grammars contained in this pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
        public XMLGrammarPoolImplExtension(int initialCapacity) {

        /** Constructs a grammar pool with a specified number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
        public XMLGrammarPoolImplExtension() {

        /** Constructs a grammar pool with a default number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    static class XMLGrammarPoolImplExtension extends XMLGrammarPoolImpl {

    /**
     * Extension of XMLGrammarPoolImpl which exposes the number of
     * grammars stored in the grammar pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    public boolean isSchemaLanguageSupported(String schemaLanguage) {

    /**
     * <p>Is specified schema supported by this <code>SchemaFactory</code>?</p>
     *
     * @param schemaLanguage Specifies the schema language which the returned <code>SchemaFactory</code> will understand.
     *    <code>schemaLanguage</code> must specify a <a href="#schemaLanguage">valid</a> schema language.
     *
     * @return <code>true</code> if <code>SchemaFactory</code> supports <code>schemaLanguage</code>, else <code>false</code>.
     *
     * @throws NullPointerException If <code>schemaLanguage</code> is <code>null</code>.
     * @throws IllegalArgumentException If <code>schemaLanguage.length() == 0</code>
     *   or <code>schemaLanguage</code> does not specify a <a href="#schemaLanguage">valid</a> schema language.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private final boolean fUseServicesMechanism;

    /**
     * Indicates whether implementation parts should use
     *   service loader (or similar).
     * Note the default value (false) is the safe option..
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private XMLGrammarPoolWrapper fXMLGrammarPoolWrapper;

    /** The container for the real grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private XMLSecurityPropertyManager fSecurityPropertyMgr;

    /** The Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private XMLSecurityManager fSecurityManager;

    /** The SecurityManager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private ErrorHandlerWrapper fErrorHandlerWrapper;

    /** The ErrorHandlerWrapper */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private final DOMEntityResolverWrapper fDOMEntityResolverWrapper;

    /** The DOMEntityResolverWrapper */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private LSResourceResolver fLSResourceResolver;

    /** The LSResrouceResolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private ErrorHandler fErrorHandler;

    /** User-specified ErrorHandler; can be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private final XMLSchemaLoader fXMLSchemaLoader = new XMLSchemaLoader();

    /** The XMLSchemaLoader */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: XMLSecurityManager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private static final String SCHEMA_FULL_CHECKING =

    /** Feature identifier: schema full checking. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
public final class XMLSchemaFactory extends SchemaFactory {

/**
 * {@link SchemaFactory} for XML Schema.
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 * @version $Id: XMLSchemaFactory.java,v 1.11 2010-11-01 04:40:08 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    static class XMLGrammarPoolWrapper implements XMLGrammarPool {

    /**
     * A grammar pool which wraps another.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
        int getGrammarCount() {

        /** Returns the number of grammars contained in this pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
        public XMLGrammarPoolImplExtension(int initialCapacity) {

        /** Constructs a grammar pool with a specified number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
        public XMLGrammarPoolImplExtension() {

        /** Constructs a grammar pool with a default number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    static class XMLGrammarPoolImplExtension extends XMLGrammarPoolImpl {

    /**
     * Extension of XMLGrammarPoolImpl which exposes the number of
     * grammars stored in the grammar pool.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    public boolean isSchemaLanguageSupported(String schemaLanguage) {

    /**
     * <p>Is specified schema supported by this <code>SchemaFactory</code>?</p>
     *
     * @param schemaLanguage Specifies the schema language which the returned <code>SchemaFactory</code> will understand.
     *    <code>schemaLanguage</code> must specify a <a href="#schemaLanguage">valid</a> schema language.
     *
     * @return <code>true</code> if <code>SchemaFactory</code> supports <code>schemaLanguage</code>, else <code>false</code>.
     *
     * @throws NullPointerException If <code>schemaLanguage</code> is <code>null</code>.
     * @throws IllegalArgumentException If <code>schemaLanguage.length() == 0</code>
     *   or <code>schemaLanguage</code> does not specify a <a href="#schemaLanguage">valid</a> schema language.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private final boolean fUseServicesMechanism;

    /**
     * Indicates whether implementation parts should use
     *   service loader (or similar).
     * Note the default value (false) is the safe option..
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private XMLGrammarPoolWrapper fXMLGrammarPoolWrapper;

    /** The container for the real grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private XMLSecurityPropertyManager fSecurityPropertyMgr;

    /** The Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private XMLSecurityManager fSecurityManager;

    /** The SecurityManager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private ErrorHandlerWrapper fErrorHandlerWrapper;

    /** The ErrorHandlerWrapper */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private final DOMEntityResolverWrapper fDOMEntityResolverWrapper;

    /** The DOMEntityResolverWrapper */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private LSResourceResolver fLSResourceResolver;

    /** The LSResrouceResolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private ErrorHandler fErrorHandler;

    /** User-specified ErrorHandler; can be null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private final XMLSchemaLoader fXMLSchemaLoader = new XMLSchemaLoader();

    /** The XMLSchemaLoader */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private static final String SECURITY_MANAGER =

    /** Property identifier: XMLSecurityManager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private static final String XMLGRAMMAR_POOL =

    /** Property identifier: grammar pool. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
    private static final String SCHEMA_FULL_CHECKING =

    /** Feature identifier: schema full checking. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/XMLSchemaFactory.java
public final class XMLSchemaFactory extends SchemaFactory {

/**
 * {@link SchemaFactory} for XML Schema.
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 * @version $Id: XMLSchemaFactory.java,v 1.11 2010-11-01 04:40:08 joehw Exp $
 */
