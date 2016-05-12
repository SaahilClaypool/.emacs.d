_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public void popScope() {

    /**
     * Pops the current scope.  The namespace bindings from the new current scope
     * are then used for searching for namespaces and prefixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public void pushScope() {

    /**
     * Begins a new scope.  None of the previous namespace bindings will be used,
     * until the new scope is popped with popScope()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public void reset() {

    /**
     * Only resets the current scope -- all namespaces defined in lower scopes
     * remain valid after a call to reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public MultipleScopeNamespaceSupport(NamespaceContext context) {

    /**
     * @param context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public MultipleScopeNamespaceSupport() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
public class MultipleScopeNamespaceSupport extends NamespaceSupport {

/**
 * This implementation of NamespaceContext has the ability to maintain multiple
 * scopes of namespace/prefix bindings.  This is useful in situations when it is
 * not always appropriate for elements to inherit the namespace bindings of their
 * ancestors (such as included elements in XInclude).
 *
 * When searching for a URI to match a prefix, or a prefix to match a URI, it is
 * searched for in the current context, then the ancestors of the current context,
 * up to the beginning of the current scope.  Other scopes are not searched.
 *
 * @author Peter McCracken, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public void popScope() {

    /**
     * Pops the current scope.  The namespace bindings from the new current scope
     * are then used for searching for namespaces and prefixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public void pushScope() {

    /**
     * Begins a new scope.  None of the previous namespace bindings will be used,
     * until the new scope is popped with popScope()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public void reset() {

    /**
     * Only resets the current scope -- all namespaces defined in lower scopes
     * remain valid after a call to reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public MultipleScopeNamespaceSupport(NamespaceContext context) {

    /**
     * @param context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
    public MultipleScopeNamespaceSupport() {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xinclude/MultipleScopeNamespaceSupport.java
public class MultipleScopeNamespaceSupport extends NamespaceSupport {

/**
 * This implementation of NamespaceContext has the ability to maintain multiple
 * scopes of namespace/prefix bindings.  This is useful in situations when it is
 * not always appropriate for elements to inherit the namespace bindings of their
 * ancestors (such as included elements in XInclude).
 *
 * When searching for a URI to match a prefix, or a prefix to match a URI, it is
 * searched for in the current context, then the ancestors of the current context,
 * up to the beginning of the current scope.  Other scopes are not searched.
 *
 * @author Peter McCracken, IBM
 *
 */
