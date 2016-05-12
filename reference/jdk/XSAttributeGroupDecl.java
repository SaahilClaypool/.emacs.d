_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSAnnotation getAnnotation() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSWildcard getAttributeWildcard() {

    /**
     * {attribute wildcard} Optional. A wildcard.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSObjectList getAttributeUses() {

    /**
     * {attribute uses} A set of attribute uses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public Object[] validRestrictionOf(String typeName, XSAttributeGroupDecl baseGroup) {

    /**
     * Check that the attributes in this group validly restrict those from a base group.
     * If an error is found, an Object[] is returned. This contains the arguments for the error message
     * describing the error. The last element in the array (at index arr.length - 1) is the the error code.
     * Returns null if there is no error.
     *
     * REVISIT: is there a better way of returning the appropriate information for the error?
     *
     * @param typeName the name of the type containing this attribute group, used for error reporting purposes
     * @param baseGroup the XSAttributeGroupDecl that is the base we are checking against
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
public class XSAttributeGroupDecl implements XSAttributeGroupDefinition {

/**
 * The XML representation for an attribute group declaration
 * schema component is a global <attributeGroup> element information item
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: XSAttributeGroupDecl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSAnnotation getAnnotation() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSWildcard getAttributeWildcard() {

    /**
     * {attribute wildcard} Optional. A wildcard.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public XSObjectList getAttributeUses() {

    /**
     * {attribute uses} A set of attribute uses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
    public Object[] validRestrictionOf(String typeName, XSAttributeGroupDecl baseGroup) {

    /**
     * Check that the attributes in this group validly restrict those from a base group.
     * If an error is found, an Object[] is returned. This contains the arguments for the error message
     * describing the error. The last element in the array (at index arr.length - 1) is the the error code.
     * Returns null if there is no error.
     *
     * REVISIT: is there a better way of returning the appropriate information for the error?
     *
     * @param typeName the name of the type containing this attribute group, used for error reporting purposes
     * @param baseGroup the XSAttributeGroupDecl that is the base we are checking against
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSAttributeGroupDecl.java
public class XSAttributeGroupDecl implements XSAttributeGroupDefinition {

/**
 * The XML representation for an attribute group declaration
 * schema component is a global <attributeGroup> element information item
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Rahul Srivastava, Sun Microsystems Inc.
 *
 * @version $Id: XSAttributeGroupDecl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
