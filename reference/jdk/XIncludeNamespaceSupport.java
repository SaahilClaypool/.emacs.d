_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public String getURIFromIncludeParent(String prefix) {

    /**
     * This returns the namespace URI which was associated with the given pretext, in
     * the context that existed at the include parent of the current element.  The
     * include parent is the last element, before the current one, which was not set
     * to an invalid context using setContextInvalid()
     *
     * @param prefix the prefix of the desired URI
     * @return the URI corresponding to the prefix in the context of the include parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public void setContextInvalid() {

    /**
     * This method is used to set a context invalid for XInclude namespace processing.
     * Any context defined by an &lt;include&gt; or &lt;fallback&gt; element is not
     * valid for processing the include parent's [in-scope namespaces]. Thus, contexts
     * defined by these elements are set to invalid by the XInclude processor using
     * this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public void pushContext() {

    /**
     * Pushes a new context onto the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public XIncludeNamespaceSupport(NamespaceContext context) {

    /**
     * @param context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public XIncludeNamespaceSupport() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    private boolean[] fValidContext = new boolean[8];

    /**
     * This stores whether or not the context at the matching depth was valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
public class XIncludeNamespaceSupport extends MultipleScopeNamespaceSupport {

/**
 * This is an implementation of NamespaceContext which is intended to be used for
 * XInclude processing.  It enables each context to be marked as invalid, if necessary,
 * to indicate that the namespaces recorded on those contexts won't be apparent in the
 * resulting infoset.
 *
 * @author Peter McCracken, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public String getURIFromIncludeParent(String prefix) {

    /**
     * This returns the namespace URI which was associated with the given pretext, in
     * the context that existed at the include parent of the current element.  The
     * include parent is the last element, before the current one, which was not set
     * to an invalid context using setContextInvalid()
     *
     * @param prefix the prefix of the desired URI
     * @return the URI corresponding to the prefix in the context of the include parent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public void setContextInvalid() {

    /**
     * This method is used to set a context invalid for XInclude namespace processing.
     * Any context defined by an &lt;include&gt; or &lt;fallback&gt; element is not
     * valid for processing the include parent's [in-scope namespaces]. Thus, contexts
     * defined by these elements are set to invalid by the XInclude processor using
     * this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public void pushContext() {

    /**
     * Pushes a new context onto the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public XIncludeNamespaceSupport(NamespaceContext context) {

    /**
     * @param context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    public XIncludeNamespaceSupport() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
    private boolean[] fValidContext = new boolean[8];

    /**
     * This stores whether or not the context at the matching depth was valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/XIncludeNamespaceSupport.java
public class XIncludeNamespaceSupport extends MultipleScopeNamespaceSupport {

/**
 * This is an implementation of NamespaceContext which is intended to be used for
 * XInclude processing.  It enables each context to be marked as invalid, if necessary,
 * to indicate that the namespaces recorded on those contexts won't be apparent in the
 * resulting infoset.
 *
 * @author Peter McCracken, IBM
 *
 */
