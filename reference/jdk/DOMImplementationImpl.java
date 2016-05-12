_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
    public Document           createDocument(String namespaceURI,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
    public boolean hasFeature(String feature, String version) {

    /**
     * Test if the DOM implementation supports a specific "feature" --
     * currently meaning language and level thereof.
     *
     * @param feature      The package name of the feature to test.
     * In Level 1, supported values are "HTML" and "XML" (case-insensitive).
     * At this writing, com.sun.org.apache.xerces.internal.dom supports only XML.
     *
     * @param version      The version number of the feature being tested.
     * This is interpreted as "Version of the DOM API supported for the
     * specified Feature", and in Level 1 should be "1.0"
     *
     * @return    true iff this implementation is compatable with the
     * specified feature and version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
    public static DOMImplementation getDOMImplementation() {

    /** NON-DOM: Obtain and return the single shared object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
    static DOMImplementationImpl singleton = new DOMImplementationImpl();

    /** Dom implementation singleton. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
public class DOMImplementationImpl extends CoreDOMImplementationImpl

/**
 * The DOMImplementation class is description of a particular
 * implementation of the Document Object Model. As such its data is
 * static, shared by all instances of this implementation.
 * <P>
 * The DOM API requires that it be a real object rather than static
 * methods. However, there's nothing that says it can't be a singleton,
 * so that's how I've implemented it.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
    public Document           createDocument(String namespaceURI,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
    public boolean hasFeature(String feature, String version) {

    /**
     * Test if the DOM implementation supports a specific "feature" --
     * currently meaning language and level thereof.
     *
     * @param feature      The package name of the feature to test.
     * In Level 1, supported values are "HTML" and "XML" (case-insensitive).
     * At this writing, com.sun.org.apache.xerces.internal.dom supports only XML.
     *
     * @param version      The version number of the feature being tested.
     * This is interpreted as "Version of the DOM API supported for the
     * specified Feature", and in Level 1 should be "1.0"
     *
     * @return    true iff this implementation is compatable with the
     * specified feature and version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
    public static DOMImplementation getDOMImplementation() {

    /** NON-DOM: Obtain and return the single shared object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
    static DOMImplementationImpl singleton = new DOMImplementationImpl();

    /** Dom implementation singleton. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMImplementationImpl.java
public class DOMImplementationImpl extends CoreDOMImplementationImpl

/**
 * The DOMImplementation class is description of a particular
 * implementation of the Document Object Model. As such its data is
 * static, shared by all instances of this implementation.
 * <P>
 * The DOM API requires that it be a real object rather than static
 * methods. However, there's nothing that says it can't be a singleton,
 * so that's how I've implemented it.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
