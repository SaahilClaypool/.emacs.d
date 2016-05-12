_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    private XMLInputSource createXMLInputSource(InputSource source, String baseURI) {

    /**
     * Creates an XMLInputSource from a SAX InputSource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier)

    /**
     * Resolves an external parsed entity. If the entity cannot be
     * resolved, this method should return null.
     *
     * @param resourceIdentifier contains the physical co-ordinates of the resource to be resolved
     *
     * @throws XNIException Thrown on general error.
     * @throws IOException  Thrown if resolved entity stream cannot be
     *                      opened or some other i/o error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public XMLInputSource getExternalSubset(XMLDTDDescription grammarDescription)

    /**
     * <p>Locates an external subset for documents which do not explicitly
     * provide one. If no external subset is provided, this method should
     * return <code>null</code>.</p>
     *
     * @param grammarDescription a description of the DTD
     *
     * @throws XNIException Thrown on general error.
     * @throws IOException  Thrown if resolved entity stream cannot be
     *                      opened or some other i/o error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public EntityResolver2 getEntityResolver() {

    /**
     * <p>Returns the SAX entity resolver wrapped by this object.</p>
     *
     * @return the SAX entity resolver wrapped by this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public void setEntityResolver(EntityResolver2 entityResolver) {

    /**
     * <p>Sets the SAX entity resolver wrapped by this object.</p>
     *
     * @param entityResolver the SAX entity resolver to wrap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public EntityResolver2Wrapper(EntityResolver2 entityResolver) {

    /**
     * <p>Creates a new instance wrapping the given SAX entity resolver.</p>
     *
     * @param entityResolver the SAX entity resolver to wrap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public EntityResolver2Wrapper() {}

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    protected EntityResolver2 fEntityResolver;

    /** An instance of SAX2 Extensions 1.1's EntityResolver2. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
public class EntityResolver2Wrapper

/**
 * <p>This class wraps a SAX entity resolver (EntityResolver2) in an XNI entity resolver.</p>
 *
 * @author Michael Glavassevich, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    private XMLInputSource createXMLInputSource(InputSource source, String baseURI) {

    /**
     * Creates an XMLInputSource from a SAX InputSource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier)

    /**
     * Resolves an external parsed entity. If the entity cannot be
     * resolved, this method should return null.
     *
     * @param resourceIdentifier contains the physical co-ordinates of the resource to be resolved
     *
     * @throws XNIException Thrown on general error.
     * @throws IOException  Thrown if resolved entity stream cannot be
     *                      opened or some other i/o error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public XMLInputSource getExternalSubset(XMLDTDDescription grammarDescription)

    /**
     * <p>Locates an external subset for documents which do not explicitly
     * provide one. If no external subset is provided, this method should
     * return <code>null</code>.</p>
     *
     * @param grammarDescription a description of the DTD
     *
     * @throws XNIException Thrown on general error.
     * @throws IOException  Thrown if resolved entity stream cannot be
     *                      opened or some other i/o error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public EntityResolver2 getEntityResolver() {

    /**
     * <p>Returns the SAX entity resolver wrapped by this object.</p>
     *
     * @return the SAX entity resolver wrapped by this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public void setEntityResolver(EntityResolver2 entityResolver) {

    /**
     * <p>Sets the SAX entity resolver wrapped by this object.</p>
     *
     * @param entityResolver the SAX entity resolver to wrap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public EntityResolver2Wrapper(EntityResolver2 entityResolver) {

    /**
     * <p>Creates a new instance wrapping the given SAX entity resolver.</p>
     *
     * @param entityResolver the SAX entity resolver to wrap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    public EntityResolver2Wrapper() {}

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
    protected EntityResolver2 fEntityResolver;

    /** An instance of SAX2 Extensions 1.1's EntityResolver2. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/EntityResolver2Wrapper.java
public class EntityResolver2Wrapper

/**
 * <p>This class wraps a SAX entity resolver (EntityResolver2) in an XNI entity resolver.</p>
 *
 * @author Michael Glavassevich, IBM
 *
 */
