_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSImplementationImpl.java
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
     * @return    true iff this implementation is compatable with the specified
     * feature and version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSImplementationImpl.java
    public static DOMImplementation getDOMImplementation() {

    /** NON-DOM: Obtain and return the single shared object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSImplementationImpl.java
    static XSImplementationImpl singleton = new XSImplementationImpl();

    /** Dom implementation singleton. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSImplementationImpl.java
public class XSImplementationImpl extends CoreDOMImplementationImpl

/**
 * Implements XSImplementation interface that allows one to retrieve an instance of <code>XSLoader</code>.
 * This interface should be implemented on the same object that implements
 * DOMImplementation.
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSImplementationImpl.java
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
     * @return    true iff this implementation is compatable with the specified
     * feature and version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSImplementationImpl.java
    public static DOMImplementation getDOMImplementation() {

    /** NON-DOM: Obtain and return the single shared object */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSImplementationImpl.java
    static XSImplementationImpl singleton = new XSImplementationImpl();

    /** Dom implementation singleton. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSImplementationImpl.java
public class XSImplementationImpl extends CoreDOMImplementationImpl

/**
 * Implements XSImplementation interface that allows one to retrieve an instance of <code>XSLoader</code>.
 * This interface should be implemented on the same object that implements
 * DOMImplementation.
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 */
