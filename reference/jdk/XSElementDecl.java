_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSAnnotation getAnnotation() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean getAbstract() {

    /**
     * {abstract} A boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getDisallowedSubstitutions() {

    /**
     * The supplied values for {disallowed substitutions}
     *
     * @return A bit flag representing {substitution, extension, restriction} or NONE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean isDisallowedSubstitution(short disallowed) {

    /**
     * Convenience method. Check if <code>disallowed</code> is a disallowed
     * substitution for this element declaration.
     * @param disallowed Substitution, extension, restriction or none.
     *   Represents a block set for the element.
     * @return True if <code>disallowed</code> is a part of the substitution
     *   group exclusion subset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getSubstitutionGroupExclusions() {

    /**
     * Specifies if this declaration can be nominated as
     * the {substitution group affiliation} of other
     * element declarations having the same {type definition}
     * or types derived therefrom.
     *
     * @return A bit flag representing {extension, restriction} or NONE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean isSubstitutionGroupExclusion(short exclusion) {

    /**
     * Convenience method. Check if <code>exclusion</code> is a substitution
     * group exclusion for this element declaration.
     * @param exclusion Extension, restriction or none. Represents final
     *   set for the element.
     * @return True if <code>exclusion</code> is a part of the substitution
     *   group exclusion subset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSElementDeclaration getSubstitutionGroupAffiliation() {

    /**
     * {substitution group affiliation} Optional. A top-level element
     * definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSNamedMap getIdentityConstraints() {

    /**
     * {identity-constraint definitions} A set of constraint definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean getNillable() {

    /**
     * If {nillable} is true, then an element may also be valid if it carries
     * the namespace qualified attribute with [local name] nil from
     * namespace http://www.w3.org/2001/XMLSchema-instance and value true
     * (see xsi:nil (2.6.2)) even if it has no text or element content
     * despite a {content type} which would otherwise require content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public String getConstraintValue() {

    /**
     * A value constraint: The actual value (with respect to the {type
     * definition})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getConstraintType() {

    /**
     * A value constraint: one of default, fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSComplexTypeDefinition getEnclosingCTDefinition() {

    /**
     * Locally scoped declarations are available for use only within the
     * complex type definition identified by the <code>scope</code>
     * property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getScope() {

    /**
     * Optional. Either global or a complex type definition (
     * <code>ctDefinition</code>). This property is absent in the case of
     * declarations within named model groups: their scope will be
     * determined when they are used in the construction of complex type
     * definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSTypeDefinition getTypeDefinition() {

    /**
     * Either a simple type definition or a complex type definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public void reset(){

    /**
      * Reset current element declaration
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean equals(Object o) {

    /**
     * whether two decls are the same
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public int hashCode() {

    /**
     * get the hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    private String fDescription = null;

    /**
     * get the string description of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
public class XSElementDecl implements XSElementDeclaration {

/**
 * The XML representation for an element declaration
 * schema component is an <element> element information item
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Sandy Gao, IBM
 * @version $Id: XSElementDecl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSAnnotation getAnnotation() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean getAbstract() {

    /**
     * {abstract} A boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getDisallowedSubstitutions() {

    /**
     * The supplied values for {disallowed substitutions}
     *
     * @return A bit flag representing {substitution, extension, restriction} or NONE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean isDisallowedSubstitution(short disallowed) {

    /**
     * Convenience method. Check if <code>disallowed</code> is a disallowed
     * substitution for this element declaration.
     * @param disallowed Substitution, extension, restriction or none.
     *   Represents a block set for the element.
     * @return True if <code>disallowed</code> is a part of the substitution
     *   group exclusion subset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getSubstitutionGroupExclusions() {

    /**
     * Specifies if this declaration can be nominated as
     * the {substitution group affiliation} of other
     * element declarations having the same {type definition}
     * or types derived therefrom.
     *
     * @return A bit flag representing {extension, restriction} or NONE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean isSubstitutionGroupExclusion(short exclusion) {

    /**
     * Convenience method. Check if <code>exclusion</code> is a substitution
     * group exclusion for this element declaration.
     * @param exclusion Extension, restriction or none. Represents final
     *   set for the element.
     * @return True if <code>exclusion</code> is a part of the substitution
     *   group exclusion subset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSElementDeclaration getSubstitutionGroupAffiliation() {

    /**
     * {substitution group affiliation} Optional. A top-level element
     * definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSNamedMap getIdentityConstraints() {

    /**
     * {identity-constraint definitions} A set of constraint definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean getNillable() {

    /**
     * If {nillable} is true, then an element may also be valid if it carries
     * the namespace qualified attribute with [local name] nil from
     * namespace http://www.w3.org/2001/XMLSchema-instance and value true
     * (see xsi:nil (2.6.2)) even if it has no text or element content
     * despite a {content type} which would otherwise require content.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public String getConstraintValue() {

    /**
     * A value constraint: The actual value (with respect to the {type
     * definition})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getConstraintType() {

    /**
     * A value constraint: one of default, fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSComplexTypeDefinition getEnclosingCTDefinition() {

    /**
     * Locally scoped declarations are available for use only within the
     * complex type definition identified by the <code>scope</code>
     * property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getScope() {

    /**
     * Optional. Either global or a complex type definition (
     * <code>ctDefinition</code>). This property is absent in the case of
     * declarations within named model groups: their scope will be
     * determined when they are used in the construction of complex type
     * definitions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public XSTypeDefinition getTypeDefinition() {

    /**
     * Either a simple type definition or a complex type definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public void reset(){

    /**
      * Reset current element declaration
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public boolean equals(Object o) {

    /**
     * whether two decls are the same
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    public int hashCode() {

    /**
     * get the hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
    private String fDescription = null;

    /**
     * get the string description of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSElementDecl.java
public class XSElementDecl implements XSElementDeclaration {

/**
 * The XML representation for an element declaration
 * schema component is an <element> element information item
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Sandy Gao, IBM
 * @version $Id: XSElementDecl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
