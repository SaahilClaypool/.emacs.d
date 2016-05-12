_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/NamespaceContextWrapper.java
    public com.sun.org.apache.xerces.internal.xni.NamespaceContext getNamespaceContext() {

    /**
     * This method supports all functions in the NamespaceContext utility class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/NamespaceContextWrapper.java
    public java.util.Iterator getPrefixes(String namespaceURI) {

    /**
     * TODO: Namespace doesn't give information giving multiple prefixes for
     * the same namespaceURI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/NamespaceContextWrapper.java
public class NamespaceContextWrapper implements NamespaceContext {

/**
 * Writing a wrapper to re-use most of the namespace functionality
 * already provided by NamespaceSupport, which implements NamespaceContext
 * from XNI. It would be good if we can change the XNI NamespaceContext
 * interface to implement the JAXP NamespaceContext interface.
 *
 * Note that NamespaceSupport assumes the use of symbols. Since this class
 * can be exposed to the application, we must intern all Strings before
 * calling NamespaceSupport methods.
 *
 * @author  Neeraj Bajaj, Sun Microsystems, inc.
 * @author Santiago.PericasGeertsen@sun.com
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/NamespaceContextWrapper.java
    public com.sun.org.apache.xerces.internal.xni.NamespaceContext getNamespaceContext() {

    /**
     * This method supports all functions in the NamespaceContext utility class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/NamespaceContextWrapper.java
    public java.util.Iterator getPrefixes(String namespaceURI) {

    /**
     * TODO: Namespace doesn't give information giving multiple prefixes for
     * the same namespaceURI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/NamespaceContextWrapper.java
public class NamespaceContextWrapper implements NamespaceContext {

/**
 * Writing a wrapper to re-use most of the namespace functionality
 * already provided by NamespaceSupport, which implements NamespaceContext
 * from XNI. It would be good if we can change the XNI NamespaceContext
 * interface to implement the JAXP NamespaceContext interface.
 *
 * Note that NamespaceSupport assumes the use of symbols. Since this class
 * can be exposed to the application, we must intern all Strings before
 * calling NamespaceSupport methods.
 *
 * @author  Neeraj Bajaj, Sun Microsystems, inc.
 * @author Santiago.PericasGeertsen@sun.com
 *
 */
