_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSAnnotation getAnnotation() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public String getConstraintValue() {

    /**
     * Value constraint: The actual value (with respect to the {type
     * definition}) Should we return Object instead of DOMString?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public short getConstraintType() {

    /**
     * Value constraint: one of default, fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSComplexTypeDefinition getEnclosingCTDefinition() {

    /**
     * Locally scoped declarations are available for use only within the
     * complex type definition identified by the <code>scope</code>
     * property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public short getScope() {

    /**
     * Optional. Either global or a complex type definition (
     * <code>ctDefinition</code>). This property is absent in the case of
     * declarations within attribute group definitions: their scope will be
     * determined when they are used in the construction of complex type
     * definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSSimpleTypeDefinition getTypeDefinition() {

    /**
     * A simple type definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
public class XSAttributeDecl implements XSAttributeDeclaration {

/**
 * The XML representation for an attribute declaration
 * schema component is an <attribute> element information item
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Sandy Gao, IBM
 * @version $Id: XSAttributeDecl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSAnnotation getAnnotation() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public String getConstraintValue() {

    /**
     * Value constraint: The actual value (with respect to the {type
     * definition}) Should we return Object instead of DOMString?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public short getConstraintType() {

    /**
     * Value constraint: one of default, fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSComplexTypeDefinition getEnclosingCTDefinition() {

    /**
     * Locally scoped declarations are available for use only within the
     * complex type definition identified by the <code>scope</code>
     * property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public short getScope() {

    /**
     * Optional. Either global or a complex type definition (
     * <code>ctDefinition</code>). This property is absent in the case of
     * declarations within attribute group definitions: their scope will be
     * determined when they are used in the construction of complex type
     * definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public XSSimpleTypeDefinition getTypeDefinition() {

    /**
     * A simple type definition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeDecl.java
public class XSAttributeDecl implements XSAttributeDeclaration {

/**
 * The XML representation for an attribute declaration
 * schema component is an <attribute> element information item
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Sandy Gao, IBM
 * @version $Id: XSAttributeDecl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
