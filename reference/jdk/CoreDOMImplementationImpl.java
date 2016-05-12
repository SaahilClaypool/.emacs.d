_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
       protected synchronized int assignDocTypeNumber() {

       /** NON-DOM:  increment document/doctype counter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
       protected synchronized int assignDocumentNumber() {

       /** NON-DOM:  increment document/doctype counter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        synchronized void releaseValidator(String schemaType,
                                         RevalidationHandler validator) {

        /** NON-DOM: release validator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        synchronized RevalidationHandler getValidator(String schemaType) {

        /** NON-DOM: retrieve validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public LSInput createLSInput() {

        /**
         * DOM Level 3 LS CR - Experimental.
         * Create a new empty input source.
         * @return  The newly created input object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public LSSerializer createLSSerializer() {

        /**
         * DOM Level 3 LS CR - Experimental.
         * Create a new <code>LSSerializer</code> object.
         * @return The newly created <code>LSSerializer</code> object.
         * <p ><b>Note:</b>    By default, the newly created
         * <code>LSSerializer</code> has no <code>DOMErrorHandler</code>,
         * i.e. the value of the <code>"error-handler"</code> configuration
         * parameter is <code>null</code>. However, implementations may
         * provide a default error handler at creation time. In that case, the
         * initial value of the <code>"error-handler"</code> configuration
         * parameter on the new created <code>LSSerializer</code> contains a
         * reference to the default error handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public LSParser createLSParser(short mode, String schemaType)

        /**
         * DOM Level 3 LS CR - Experimental.
     * Create a new <code>LSParser</code>. The newly constructed parser may
     * then be configured by means of its <code>DOMConfiguration</code>
     * object, and used to parse documents by means of its <code>parse</code>
     *  method.
     * @param mode  The <code>mode</code> argument is either
     *   <code>MODE_SYNCHRONOUS</code> or <code>MODE_ASYNCHRONOUS</code>, if
     *   <code>mode</code> is <code>MODE_SYNCHRONOUS</code> then the
     *   <code>LSParser</code> that is created will operate in synchronous
     *   mode, if it's <code>MODE_ASYNCHRONOUS</code> then the
     *   <code>LSParser</code> that is created will operate in asynchronous
     *   mode.
     * @param schemaType  An absolute URI representing the type of the schema
     *   language used during the load of a <code>Document</code> using the
     *   newly created <code>LSParser</code>. Note that no lexical checking
     *   is done on the absolute URI. In order to create a
     *   <code>LSParser</code> for any kind of schema types (i.e. the
     *   LSParser will be free to use any schema found), use the value
     *   <code>null</code>.
     * <p ><b>Note:</b>    For W3C XML Schema [<a href='http://www.w3.org/TR/2001/REC-xmlschema-1-20010502/'>XML Schema Part 1</a>]
     *   , applications must use the value
     *   <code>"http://www.w3.org/2001/XMLSchema"</code>. For XML DTD [<a href='http://www.w3.org/TR/2000/REC-xml-20001006'>XML 1.0</a>],
     *   applications must use the value
     *   <code>"http://www.w3.org/TR/REC-xml"</code>. Other Schema languages
     *   are outside the scope of the W3C and therefore should recommend an
     *   absolute URI in order to use this method.
     * @return  The newly created <code>LSParser</code> object. This
     *   <code>LSParser</code> is either synchronous or asynchronous
     *   depending on the value of the <code>mode</code> argument.
     * <p ><b>Note:</b>    By default, the newly created <code>LSParser</code>
     *    does not contain a <code>DOMErrorHandler</code>, i.e. the value of
     *   the "<a href='http://www.w3.org/TR/2003/WD-DOM-Level-3-Core-20030609/core.html#parameter-error-handler'>
     *   error-handler</a>" configuration parameter is <code>null</code>. However, implementations
     *   may provide a default error handler at creation time. In that case,
     *   the initial value of the <code>"error-handler"</code> configuration
     *   parameter on the new created <code>LSParser</code> contains a
     *   reference to the default error handler.
     * @exception DOMException
     *    NOT_SUPPORTED_ERR: Raised if the requested mode or schema type is
     *   not supported.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public Object getFeature(String feature, String version) {

        /**
         * DOM Level 3 WD - Experimental.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public Document createDocument(
                String namespaceURI,
                String qualifiedName,
                DocumentType doctype)

        /**
         * Introduced in DOM Level 2. <p>
         *
         * Creates an XML Document object of the specified type with its document
         * element.
         *
         * @param namespaceURI     The namespace URI of the document
         *                         element to create, or null.
         * @param qualifiedName    The qualified name of the document
         *                         element to create.
         * @param doctype          The type of document to be created or null.<p>
         *
         *                         When doctype is not null, its
         *                         Node.ownerDocument attribute is set to
         *                         the document being created.
         * @return Document        A new Document object.
         * @throws DOMException    WRONG_DOCUMENT_ERR: Raised if doctype has
         *                         already been used with a different document.
         * @since WD-DOM-Level-2-19990923
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public DocumentType createDocumentType( String qualifiedName,
                                    String publicID, String systemID) {

        /**
         * Introduced in DOM Level 2. <p>
         *
         * Creates an empty DocumentType node.
         *
         * @param qualifiedName The qualified name of the document type to be created.
         * @param publicID The document type public identifier.
         * @param systemID The document type system identifier.
         * @since WD-DOM-Level-2-19990923
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public boolean hasFeature(String feature, String version) {

        /**
         * Test if the DOM implementation supports a specific "feature" --
         * currently meaning language and level thereof.
         *
         * @param feature The package name of the feature to test.
         * In Level 1, supported values are "HTML" and "XML" (case-insensitive).
         * At this writing, com.sun.org.apache.xerces.internal.dom supports only XML.
         *
         * @param version The version number of the feature being tested.
         * This is interpreted as "Version of the DOM API supported for the
         * specified Feature", and in Level 1 should be "1.0"
         *
         * @return true iff this implementation is compatable with the specified
         * feature and version.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public static DOMImplementation getDOMImplementation() {

        /** NON-DOM: Obtain and return the single shared object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        static CoreDOMImplementationImpl singleton =

        /** Dom implementation singleton. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
public class CoreDOMImplementationImpl

/**
 * The DOMImplementation class is description of a particular
 * implementation of the Document Object Model. As such its data is
 * static, shared by all instances of this implementation.
 * <P>
 * The DOM API requires that it be a real object rather than static
 * methods. However, there's nothing that says it can't be a singleton,
 * so that's how I've implemented it.
 * <P>
 * This particular class, along with CoreDocumentImpl, supports the DOM
 * Core and Load/Save (Experimental). Optional modules are supported by
 * the more complete DOMImplementation class along with DocumentImpl.
 *
 * @xerces.internal
 *
 * @version $Id: CoreDOMImplementationImpl.java,v 1.6 2010-11-01 04:39:37 joehw Exp $
 * @since PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
       protected synchronized int assignDocTypeNumber() {

       /** NON-DOM:  increment document/doctype counter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
       protected synchronized int assignDocumentNumber() {

       /** NON-DOM:  increment document/doctype counter */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        synchronized void releaseValidator(String schemaType,
                                         RevalidationHandler validator) {

        /** NON-DOM: release validator */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        synchronized RevalidationHandler getValidator(String schemaType) {

        /** NON-DOM: retrieve validator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public LSInput createLSInput() {

        /**
         * DOM Level 3 LS CR - Experimental.
         * Create a new empty input source.
         * @return  The newly created input object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public LSSerializer createLSSerializer() {

        /**
         * DOM Level 3 LS CR - Experimental.
         * Create a new <code>LSSerializer</code> object.
         * @return The newly created <code>LSSerializer</code> object.
         * <p ><b>Note:</b>    By default, the newly created
         * <code>LSSerializer</code> has no <code>DOMErrorHandler</code>,
         * i.e. the value of the <code>"error-handler"</code> configuration
         * parameter is <code>null</code>. However, implementations may
         * provide a default error handler at creation time. In that case, the
         * initial value of the <code>"error-handler"</code> configuration
         * parameter on the new created <code>LSSerializer</code> contains a
         * reference to the default error handler.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public LSParser createLSParser(short mode, String schemaType)

        /**
         * DOM Level 3 LS CR - Experimental.
     * Create a new <code>LSParser</code>. The newly constructed parser may
     * then be configured by means of its <code>DOMConfiguration</code>
     * object, and used to parse documents by means of its <code>parse</code>
     *  method.
     * @param mode  The <code>mode</code> argument is either
     *   <code>MODE_SYNCHRONOUS</code> or <code>MODE_ASYNCHRONOUS</code>, if
     *   <code>mode</code> is <code>MODE_SYNCHRONOUS</code> then the
     *   <code>LSParser</code> that is created will operate in synchronous
     *   mode, if it's <code>MODE_ASYNCHRONOUS</code> then the
     *   <code>LSParser</code> that is created will operate in asynchronous
     *   mode.
     * @param schemaType  An absolute URI representing the type of the schema
     *   language used during the load of a <code>Document</code> using the
     *   newly created <code>LSParser</code>. Note that no lexical checking
     *   is done on the absolute URI. In order to create a
     *   <code>LSParser</code> for any kind of schema types (i.e. the
     *   LSParser will be free to use any schema found), use the value
     *   <code>null</code>.
     * <p ><b>Note:</b>    For W3C XML Schema [<a href='http://www.w3.org/TR/2001/REC-xmlschema-1-20010502/'>XML Schema Part 1</a>]
     *   , applications must use the value
     *   <code>"http://www.w3.org/2001/XMLSchema"</code>. For XML DTD [<a href='http://www.w3.org/TR/2000/REC-xml-20001006'>XML 1.0</a>],
     *   applications must use the value
     *   <code>"http://www.w3.org/TR/REC-xml"</code>. Other Schema languages
     *   are outside the scope of the W3C and therefore should recommend an
     *   absolute URI in order to use this method.
     * @return  The newly created <code>LSParser</code> object. This
     *   <code>LSParser</code> is either synchronous or asynchronous
     *   depending on the value of the <code>mode</code> argument.
     * <p ><b>Note:</b>    By default, the newly created <code>LSParser</code>
     *    does not contain a <code>DOMErrorHandler</code>, i.e. the value of
     *   the "<a href='http://www.w3.org/TR/2003/WD-DOM-Level-3-Core-20030609/core.html#parameter-error-handler'>
     *   error-handler</a>" configuration parameter is <code>null</code>. However, implementations
     *   may provide a default error handler at creation time. In that case,
     *   the initial value of the <code>"error-handler"</code> configuration
     *   parameter on the new created <code>LSParser</code> contains a
     *   reference to the default error handler.
     * @exception DOMException
     *    NOT_SUPPORTED_ERR: Raised if the requested mode or schema type is
     *   not supported.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public Object getFeature(String feature, String version) {

        /**
         * DOM Level 3 WD - Experimental.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public Document createDocument(
                String namespaceURI,
                String qualifiedName,
                DocumentType doctype)

        /**
         * Introduced in DOM Level 2. <p>
         *
         * Creates an XML Document object of the specified type with its document
         * element.
         *
         * @param namespaceURI     The namespace URI of the document
         *                         element to create, or null.
         * @param qualifiedName    The qualified name of the document
         *                         element to create.
         * @param doctype          The type of document to be created or null.<p>
         *
         *                         When doctype is not null, its
         *                         Node.ownerDocument attribute is set to
         *                         the document being created.
         * @return Document        A new Document object.
         * @throws DOMException    WRONG_DOCUMENT_ERR: Raised if doctype has
         *                         already been used with a different document.
         * @since WD-DOM-Level-2-19990923
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public DocumentType createDocumentType( String qualifiedName,
                                    String publicID, String systemID) {

        /**
         * Introduced in DOM Level 2. <p>
         *
         * Creates an empty DocumentType node.
         *
         * @param qualifiedName The qualified name of the document type to be created.
         * @param publicID The document type public identifier.
         * @param systemID The document type system identifier.
         * @since WD-DOM-Level-2-19990923
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public boolean hasFeature(String feature, String version) {

        /**
         * Test if the DOM implementation supports a specific "feature" --
         * currently meaning language and level thereof.
         *
         * @param feature The package name of the feature to test.
         * In Level 1, supported values are "HTML" and "XML" (case-insensitive).
         * At this writing, com.sun.org.apache.xerces.internal.dom supports only XML.
         *
         * @param version The version number of the feature being tested.
         * This is interpreted as "Version of the DOM API supported for the
         * specified Feature", and in Level 1 should be "1.0"
         *
         * @return true iff this implementation is compatable with the specified
         * feature and version.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        public static DOMImplementation getDOMImplementation() {

        /** NON-DOM: Obtain and return the single shared object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
        static CoreDOMImplementationImpl singleton =

        /** Dom implementation singleton. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CoreDOMImplementationImpl.java
public class CoreDOMImplementationImpl

/**
 * The DOMImplementation class is description of a particular
 * implementation of the Document Object Model. As such its data is
 * static, shared by all instances of this implementation.
 * <P>
 * The DOM API requires that it be a real object rather than static
 * methods. However, there's nothing that says it can't be a singleton,
 * so that's how I've implemented it.
 * <P>
 * This particular class, along with CoreDocumentImpl, supports the DOM
 * Core and Load/Save (Experimental). Optional modules are supported by
 * the more complete DOMImplementation class along with DocumentImpl.
 *
 * @xerces.internal
 *
 * @version $Id: CoreDOMImplementationImpl.java,v 1.6 2010-11-01 04:39:37 joehw Exp $
 * @since PR-DOM-Level-1-19980818.
 */
