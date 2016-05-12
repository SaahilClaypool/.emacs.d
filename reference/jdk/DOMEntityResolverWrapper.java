_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    private String getType(XMLResourceIdentifier resourceIdentifier) {

    /** Determines the type of resource being resolved **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
                XMLInputSource xmlInputSource =

                /**
                 * An LSParser looks at inputs specified in LSInput in
                 * the following order: characterStream, byteStream,
                 * stringData, systemId, publicId.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier)

    /**
     * Resolves an external parsed entity. If the entity cannot be
     * resolved, this method should return null.
     *
     * @param resourceIdentifier        description of the resource to be revsoved
     * @throws XNIException Thrown on general error.
     * @throws IOException  Thrown if resolved entity stream cannot be
     *                      opened or some other i/o error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public LSResourceResolver getEntityResolver() {

    /** Returns the DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public void setEntityResolver(LSResourceResolver entityResolver) {

    /** Sets the DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public DOMEntityResolverWrapper(LSResourceResolver entityResolver) {

    /** Wraps the specified DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public DOMEntityResolverWrapper() {}

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    protected LSResourceResolver fEntityResolver;

    /** The DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    private static final String XSD_TYPE = "http://www.w3.org/2001/XMLSchema";

    /** XML Schema constant according to DOM L3 LS CR spec "http://www.w3.org/TR/2003/CR-DOM-Level-3-LS-20031107" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    private static final String XML_TYPE = "http://www.w3.org/TR/REC-xml";

    /** XML 1.0 type constant according to DOM L3 LS CR spec "http://www.w3.org/TR/2003/CR-DOM-Level-3-LS-20031107" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
public class DOMEntityResolverWrapper

/**
 * This class wraps DOM entity resolver to XNI entity resolver.
 *
 * @see LSResourceResolver
 *
 * @author Gopal Sharma, SUN MicroSystems Inc.
 * @author Elena Litani, IBM
 * @author Ramesh Mandava, Sun Microsystems
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    private String getType(XMLResourceIdentifier resourceIdentifier) {

    /** Determines the type of resource being resolved **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
                XMLInputSource xmlInputSource =

                /**
                 * An LSParser looks at inputs specified in LSInput in
                 * the following order: characterStream, byteStream,
                 * stringData, systemId, publicId.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public XMLInputSource resolveEntity(XMLResourceIdentifier resourceIdentifier)

    /**
     * Resolves an external parsed entity. If the entity cannot be
     * resolved, this method should return null.
     *
     * @param resourceIdentifier        description of the resource to be revsoved
     * @throws XNIException Thrown on general error.
     * @throws IOException  Thrown if resolved entity stream cannot be
     *                      opened or some other i/o error occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public LSResourceResolver getEntityResolver() {

    /** Returns the DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public void setEntityResolver(LSResourceResolver entityResolver) {

    /** Sets the DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public DOMEntityResolverWrapper(LSResourceResolver entityResolver) {

    /** Wraps the specified DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    public DOMEntityResolverWrapper() {}

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    protected LSResourceResolver fEntityResolver;

    /** The DOM entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    private static final String XSD_TYPE = "http://www.w3.org/2001/XMLSchema";

    /** XML Schema constant according to DOM L3 LS CR spec "http://www.w3.org/TR/2003/CR-DOM-Level-3-LS-20031107" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
    private static final String XML_TYPE = "http://www.w3.org/TR/REC-xml";

    /** XML 1.0 type constant according to DOM L3 LS CR spec "http://www.w3.org/TR/2003/CR-DOM-Level-3-LS-20031107" */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DOMEntityResolverWrapper.java
public class DOMEntityResolverWrapper

/**
 * This class wraps DOM entity resolver to XNI entity resolver.
 *
 * @see LSResourceResolver
 *
 * @author Gopal Sharma, SUN MicroSystems Inc.
 * @author Elena Litani, IBM
 * @author Ramesh Mandava, Sun Microsystems
 */
