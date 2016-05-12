_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
    public XSModel load(LSInput is);

    /**
     *  Parse an XML Schema document from a resource identified by a
     * <code>LSInput</code> .
     * @param is  The <code>LSInput</code> from which the source
     *   document is to be read.
     * @return An XSModel representing this schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
    public XSModel loadURI(String uri);

    /**
     * Parse an XML Schema document from a location identified by a URI
     * reference. If the URI contains a fragment identifier, the behavior is
     * not defined by this specification.
     * @param uri The location of the XML Schema document to be read.
     * @return An XSModel representing this schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
    public XSModel loadInputList(LSInputList is);

    /**
     *  Parses the content of XML Schema documents specified as a list of
     * <code>LSInput</code>s.
     * @param is  The list of <code>LSInput</code>s from which the XML
     *   Schema documents are to be read.
     * @return An XSModel representing the schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
    public XSModel loadURIList(StringList uriList);

    /**
     * Parses the content of XML Schema documents specified as the list of URI
     * references. If the URI contains a fragment identifier, the behavior
     * is not defined by this specification.
     * @param uriList The list of URI locations.
     * @return An XSModel representing the schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
public interface XSLoader {

/**
 * An interface that provides a method to load XML Schema documents. This
 * interface uses the DOM Level 3 Core and Load and Save interfaces.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
    public XSModel load(LSInput is);

    /**
     *  Parse an XML Schema document from a resource identified by a
     * <code>LSInput</code> .
     * @param is  The <code>LSInput</code> from which the source
     *   document is to be read.
     * @return An XSModel representing this schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
    public XSModel loadURI(String uri);

    /**
     * Parse an XML Schema document from a location identified by a URI
     * reference. If the URI contains a fragment identifier, the behavior is
     * not defined by this specification.
     * @param uri The location of the XML Schema document to be read.
     * @return An XSModel representing this schema.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
    public XSModel loadInputList(LSInputList is);

    /**
     *  Parses the content of XML Schema documents specified as a list of
     * <code>LSInput</code>s.
     * @param is  The list of <code>LSInput</code>s from which the XML
     *   Schema documents are to be read.
     * @return An XSModel representing the schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
    public XSModel loadURIList(StringList uriList);

    /**
     * Parses the content of XML Schema documents specified as the list of URI
     * references. If the URI contains a fragment identifier, the behavior
     * is not defined by this specification.
     * @param uriList The list of URI locations.
     * @return An XSModel representing the schema documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSLoader.java
public interface XSLoader {

/**
 * An interface that provides a method to load XML Schema documents. This
 * interface uses the DOM Level 3 Core and Load and Save interfaces.
 */
