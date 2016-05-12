_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            XSObjectList annotations = newGrammar.getAnnotations();

            /**
             * Add all annotations. Since these components are not named it's
             * possible we'll add duplicate components. There isn't much we can
             * do. It's no worse than XMLSchemaLoader when used as an XSLoader.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.NOTATION_DECLARATION);

            /** Add new top-level notation declarations. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.MODEL_GROUP);

            /** Add new top-level model group definitions. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.ATTRIBUTE_GROUP);

            /** Add new top-level attribute group definitions. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.TYPE_DEFINITION);

            /** Add new top-level type definitions. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.ATTRIBUTE_DECLARATION);

            /** Add new top-level attribute declarations. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            XSNamedMap map = newGrammar.getComponents(XSConstants.ELEMENT_DECLARATION);

            /** Add new top-level element declarations. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    private static final class XSGrammarMerger extends XSGrammarPool {

    /**
     * Grammar pool which merges grammars from the same namespace into one. This eliminates
     * duplicate named components. It doesn't ensure that the grammar is consistent, however
     * this no worse than than the behaviour of XMLSchemaLoader alone when used as an XSLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSModel load(LSInput is) {

    /**
     *  Parse an XML Schema document from a resource identified by a
     * <code>LSInput</code> .
     * @param is  The <code>LSInput</code> from which the source
     *   document is to be read.
     * @return An XSModel representing this schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSModel loadURI(String uri) {

    /**
     * Parse an XML Schema document from a location identified by a URI
     * reference. If the URI contains a fragment identifier, the behavior is
     * not defined by this specification.
     * @param uri The location of the XML Schema document to be read.
     * @return An XSModel representing this schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSModel loadInputList(LSInputList is) {

    /**
     *  Parses the content of XML Schema documents specified as a list of
     * <code>LSInput</code>s.
     * @param is  The list of <code>LSInput</code>s from which the XML
     *   Schema documents are to be read.
     * @return An XSModel representing the schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSModel loadURIList(StringList uriList) {

    /**
     * Parses the content of XML Schema documents specified as the list of URI
     * references. If the URI contains a fragment identifier, the behavior
     * is not defined by this specification.
     * @param uriList The list of URI locations.
     * @return An XSModel representing the schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public DOMConfiguration getConfig() {

    /**
     *  The configuration of a document. It maintains a table of recognized
     * parameters. Using the configuration, it is possible to change the
     * behavior of the load methods. The configuration may support the
     * setting of and the retrieval of the following non-boolean parameters
     * defined on the <code>DOMConfiguration</code> interface:
     * <code>error-handler</code> (<code>DOMErrorHandler</code>) and
     * <code>resource-resolver</code> (<code>LSResourceResolver</code>).
     * <br> The following list of boolean parameters is defined:
     * <dl>
     * <dt>
     * <code>"validate"</code></dt>
     * <dd>
     * <dl>
     * <dt><code>true</code></dt>
     * <dd>[required] (default) Validate an XML
     * Schema during loading. If validation errors are found, the error
     * handler is notified. </dd>
     * <dt><code>false</code></dt>
     * <dd>[optional] Do not
     * report errors during the loading of an XML Schema document. </dd>
     * </dl></dd>
     * </dl>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSLoaderImpl() {

    /**
     * No-args constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    private final XMLSchemaLoader fSchemaLoader = new XMLSchemaLoader();

    /** Schema loader. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    private final XSGrammarPool fGrammarPool = new XSGrammarMerger();

    /**
     * Grammar pool. Need this to prevent us from
     * getting two grammars from the same namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
public final class XSLoaderImpl implements XSLoader, DOMConfiguration {

/**
 * <p>An implementation of XSLoader which wraps XMLSchemaLoader.</p>
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XSLoaderImpl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            XSObjectList annotations = newGrammar.getAnnotations();

            /**
             * Add all annotations. Since these components are not named it's
             * possible we'll add duplicate components. There isn't much we can
             * do. It's no worse than XMLSchemaLoader when used as an XSLoader.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.NOTATION_DECLARATION);

            /** Add new top-level notation declarations. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.MODEL_GROUP);

            /** Add new top-level model group definitions. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.ATTRIBUTE_GROUP);

            /** Add new top-level attribute group definitions. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.TYPE_DEFINITION);

            /** Add new top-level type definitions. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            map = newGrammar.getComponents(XSConstants.ATTRIBUTE_DECLARATION);

            /** Add new top-level attribute declarations. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
            XSNamedMap map = newGrammar.getComponents(XSConstants.ELEMENT_DECLARATION);

            /** Add new top-level element declarations. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    private static final class XSGrammarMerger extends XSGrammarPool {

    /**
     * Grammar pool which merges grammars from the same namespace into one. This eliminates
     * duplicate named components. It doesn't ensure that the grammar is consistent, however
     * this no worse than than the behaviour of XMLSchemaLoader alone when used as an XSLoader.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSModel load(LSInput is) {

    /**
     *  Parse an XML Schema document from a resource identified by a
     * <code>LSInput</code> .
     * @param is  The <code>LSInput</code> from which the source
     *   document is to be read.
     * @return An XSModel representing this schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSModel loadURI(String uri) {

    /**
     * Parse an XML Schema document from a location identified by a URI
     * reference. If the URI contains a fragment identifier, the behavior is
     * not defined by this specification.
     * @param uri The location of the XML Schema document to be read.
     * @return An XSModel representing this schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSModel loadInputList(LSInputList is) {

    /**
     *  Parses the content of XML Schema documents specified as a list of
     * <code>LSInput</code>s.
     * @param is  The list of <code>LSInput</code>s from which the XML
     *   Schema documents are to be read.
     * @return An XSModel representing the schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSModel loadURIList(StringList uriList) {

    /**
     * Parses the content of XML Schema documents specified as the list of URI
     * references. If the URI contains a fragment identifier, the behavior
     * is not defined by this specification.
     * @param uriList The list of URI locations.
     * @return An XSModel representing the schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public DOMConfiguration getConfig() {

    /**
     *  The configuration of a document. It maintains a table of recognized
     * parameters. Using the configuration, it is possible to change the
     * behavior of the load methods. The configuration may support the
     * setting of and the retrieval of the following non-boolean parameters
     * defined on the <code>DOMConfiguration</code> interface:
     * <code>error-handler</code> (<code>DOMErrorHandler</code>) and
     * <code>resource-resolver</code> (<code>LSResourceResolver</code>).
     * <br> The following list of boolean parameters is defined:
     * <dl>
     * <dt>
     * <code>"validate"</code></dt>
     * <dd>
     * <dl>
     * <dt><code>true</code></dt>
     * <dd>[required] (default) Validate an XML
     * Schema during loading. If validation errors are found, the error
     * handler is notified. </dd>
     * <dt><code>false</code></dt>
     * <dd>[optional] Do not
     * report errors during the loading of an XML Schema document. </dd>
     * </dl></dd>
     * </dl>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    public XSLoaderImpl() {

    /**
     * No-args constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    private final XMLSchemaLoader fSchemaLoader = new XMLSchemaLoader();

    /** Schema loader. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
    private final XSGrammarPool fGrammarPool = new XSGrammarMerger();

    /**
     * Grammar pool. Need this to prevent us from
     * getting two grammars from the same namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSLoaderImpl.java
public final class XSLoaderImpl implements XSLoader, DOMConfiguration {

/**
 * <p>An implementation of XSLoader which wraps XMLSchemaLoader.</p>
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 *
 * @version $Id: XSLoaderImpl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
