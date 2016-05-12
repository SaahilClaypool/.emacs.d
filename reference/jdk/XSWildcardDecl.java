_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSAnnotation getAnnotation() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public String getProcessContentsAsString() {

    /**
     * String valid of {process contents}. One of "skip", "lax" or "strict".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public short getProcessContents() {

    /**
     * {process contents} One of skip, lax or strict. Valid constants values
     * are: PC_SKIP, PC_LAX, PC_STRICT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public StringList getNsConstraintList() {

    /**
     * Namespace constraint. For <code>constraintType</code>
     * LIST_NSCONSTRAINT, the list contains allowed namespaces. For
     * <code>constraintType</code> NOT_NSCONSTRAINT, the list contains
     * disallowed namespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public short getConstraintType() {

    /**
     * Namespace constraint: A constraint type: any, not, list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    private String fDescription = null;

    /**
     * get the string description of this wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSWildcardDecl performIntersectionWith(XSWildcardDecl wildcard,
                                                  short processContents) {

    /**
     * Schema Component Constraint: Attribute Wildcard Intersection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSWildcardDecl performUnionWith(XSWildcardDecl wildcard,
                                           short processContents) {

    /**
     * Schema Component Constraint: Attribute Wildcard Union
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public boolean weakerProcessContents(XSWildcardDecl superWildcard) {

    /**
     * Check whether this wildcard has a weaker process contents than the super.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public boolean isSubsetOf(XSWildcardDecl superWildcard) {

    /**
     *  Schema Component Constraint: Wildcard Subset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public boolean allowNamespace(String namespace) {

    /**
     * Validation Rule: Wildcard allows Namespace Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
public class XSWildcardDecl implements XSWildcard {

/**
 * The XML representation for a wildcard declaration
 * schema component is an <any> or <anyAttribute> element information item
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: XSWildcardDecl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSAnnotation getAnnotation() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public String getProcessContentsAsString() {

    /**
     * String valid of {process contents}. One of "skip", "lax" or "strict".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public short getProcessContents() {

    /**
     * {process contents} One of skip, lax or strict. Valid constants values
     * are: PC_SKIP, PC_LAX, PC_STRICT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public StringList getNsConstraintList() {

    /**
     * Namespace constraint. For <code>constraintType</code>
     * LIST_NSCONSTRAINT, the list contains allowed namespaces. For
     * <code>constraintType</code> NOT_NSCONSTRAINT, the list contains
     * disallowed namespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public short getConstraintType() {

    /**
     * Namespace constraint: A constraint type: any, not, list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    private String fDescription = null;

    /**
     * get the string description of this wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSWildcardDecl performIntersectionWith(XSWildcardDecl wildcard,
                                                  short processContents) {

    /**
     * Schema Component Constraint: Attribute Wildcard Intersection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public XSWildcardDecl performUnionWith(XSWildcardDecl wildcard,
                                           short processContents) {

    /**
     * Schema Component Constraint: Attribute Wildcard Union
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public boolean weakerProcessContents(XSWildcardDecl superWildcard) {

    /**
     * Check whether this wildcard has a weaker process contents than the super.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public boolean isSubsetOf(XSWildcardDecl superWildcard) {

    /**
     *  Schema Component Constraint: Wildcard Subset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
    public boolean allowNamespace(String namespace) {

    /**
     * Validation Rule: Wildcard allows Namespace Name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSWildcardDecl.java
public class XSWildcardDecl implements XSWildcard {

/**
 * The XML representation for a wildcard declaration
 * schema component is an <any> or <anyAttribute> element information item
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: XSWildcardDecl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
