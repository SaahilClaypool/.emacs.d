_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getProhibitedSubstitutions() {

    /**
     * {prohibited substitutions}
     *
     * @return A bit flag corresponding to prohibited substitutions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean isProhibitedSubstitution(short prohibited) {

    /**
     * {prohibited substitutions} A subset of {extension, restriction}.
     * @param prohibited  extention or restriction constants (defined in
     *   <code>XSConstants</code>).
     * @return True if prohibited is a prohibited substitution, otherwise
     *   false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSParticle getParticle() {

    /**
     * A particle for mixed or element-only content model, otherwise
     * <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSSimpleTypeDefinition getSimpleType() {

    /**
     * A simple type definition corresponding to simple content model,
     * otherwise <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getContentType() {

    /**
     * {content type} One of empty, a simple type definition (see
     * <code>simpleType</code>, or mixed, element-only (see
     * <code>cmParticle</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSWildcard getAttributeWildcard() {

    /**
     * {attribute wildcard} Optional. A wildcard.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSObjectList getAttributeUses() {

    /**
     *  {attribute uses} A set of attribute uses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean getAbstract() {

    /**
     * {abstract} A boolean. Complex types for which {abstract} is true must
     * not be used as the {type definition} for the validation of element
     * information items.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getFinal() {

    /**
     * {final} For complex type definition it is a subset of {extension, restriction}.
     *
     * @return A bit flag that represents:
     *         {extension, restriction) or none for complexTypes;
     *         {extension, list, restriction, union} or none for simpleTypes;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean isFinal(short derivation) {

    /**
     * {final} For complex type definition it is a subset of {extension,
     * restriction}. For simple type definition it is a subset of
     * {extension, list, restriction, union}.
     * @param derivation  Extension, restriction, list, union constants
     *   (defined in <code>XSConstants</code>).
     * @return True if derivation is in the final set, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getDerivationMethod() {

    /**
     * {derivation method} Either extension or restriction. The valid constant
     * value for this <code>XSConstants</code> EXTENTION, RESTRICTION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSTypeDefinition getBaseType() {

    /**
     * {base type definition} Either a simple type definition or a complex
     * type definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean getAnonymous() {

    /**
     * A boolean that specifies if the type definition is anonymous.
     * Convenience attribute. This is a field is not part of
     * XML Schema component model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    private boolean isDerivedByExtension(String ancestorNS,
            String ancestorName, int derivationMethod, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by extension. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            A short indication the method of derivation
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by extension for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    private boolean isDerivedByRestriction(String ancestorNS,
            String ancestorName, int derivationMethod, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            A short indication the method of derivation *
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    private boolean isDerivedByAny(String ancestorNS, String ancestorName,
            int derivationMethod, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by any combination of
     * restriction, list ir union. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            A short indication the method of derivation
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by any method for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean isDOMDerivedFrom(String ancestorNS, String ancestorName,
            int derivationMethod) {

    /**
     * Checks if a type is derived from another given the the name, namespace
     * and derivation method. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            The derivation method
     *
     * @return boolean True if the ancestor type is derived from the reference
     *         type by the specifiied derivation method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
public class XSComplexTypeDecl implements XSComplexTypeDefinition, TypeInfo {

/**
 * The XML representation for a complexType
 * schema component is a <complexType> element information item
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Sandy Gao, IBM
 * @version $Id: XSComplexTypeDecl.java,v 1.8 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see org.apache.xerces.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSObjectList getAnnotations() {

    /**
     * Optional. Annotation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getProhibitedSubstitutions() {

    /**
     * {prohibited substitutions}
     *
     * @return A bit flag corresponding to prohibited substitutions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean isProhibitedSubstitution(short prohibited) {

    /**
     * {prohibited substitutions} A subset of {extension, restriction}.
     * @param prohibited  extention or restriction constants (defined in
     *   <code>XSConstants</code>).
     * @return True if prohibited is a prohibited substitution, otherwise
     *   false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSParticle getParticle() {

    /**
     * A particle for mixed or element-only content model, otherwise
     * <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSSimpleTypeDefinition getSimpleType() {

    /**
     * A simple type definition corresponding to simple content model,
     * otherwise <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getContentType() {

    /**
     * {content type} One of empty, a simple type definition (see
     * <code>simpleType</code>, or mixed, element-only (see
     * <code>cmParticle</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSWildcard getAttributeWildcard() {

    /**
     * {attribute wildcard} Optional. A wildcard.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSObjectList getAttributeUses() {

    /**
     *  {attribute uses} A set of attribute uses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean getAbstract() {

    /**
     * {abstract} A boolean. Complex types for which {abstract} is true must
     * not be used as the {type definition} for the validation of element
     * information items.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getFinal() {

    /**
     * {final} For complex type definition it is a subset of {extension, restriction}.
     *
     * @return A bit flag that represents:
     *         {extension, restriction) or none for complexTypes;
     *         {extension, list, restriction, union} or none for simpleTypes;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean isFinal(short derivation) {

    /**
     * {final} For complex type definition it is a subset of {extension,
     * restriction}. For simple type definition it is a subset of
     * {extension, list, restriction, union}.
     * @param derivation  Extension, restriction, list, union constants
     *   (defined in <code>XSConstants</code>).
     * @return True if derivation is in the final set, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getDerivationMethod() {

    /**
     * {derivation method} Either extension or restriction. The valid constant
     * value for this <code>XSConstants</code> EXTENTION, RESTRICTION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public XSTypeDefinition getBaseType() {

    /**
     * {base type definition} Either a simple type definition or a complex
     * type definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public String getNamespace() {

    /**
     * The namespace URI of this node, or <code>null</code> if it is
     * unspecified.  defines how a namespace URI is attached to schema
     * components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean getAnonymous() {

    /**
     * A boolean that specifies if the type definition is anonymous.
     * Convenience attribute. This is a field is not part of
     * XML Schema component model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public String getName() {

    /**
     * The <code>name</code> of this <code>XSObject</code> depending on the
     * <code>XSObject</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public short getType() {

    /**
     * Get the type of the object, i.e ELEMENT_DECLARATION.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    private boolean isDerivedByExtension(String ancestorNS,
            String ancestorName, int derivationMethod, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by extension. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            A short indication the method of derivation
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by extension for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    private boolean isDerivedByRestriction(String ancestorNS,
            String ancestorName, int derivationMethod, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            A short indication the method of derivation *
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    private boolean isDerivedByAny(String ancestorNS, String ancestorName,
            int derivationMethod, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by any combination of
     * restriction, list ir union. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            A short indication the method of derivation
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by any method for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
    public boolean isDOMDerivedFrom(String ancestorNS, String ancestorName,
            int derivationMethod) {

    /**
     * Checks if a type is derived from another given the the name, namespace
     * and derivation method. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            The derivation method
     *
     * @return boolean True if the ancestor type is derived from the reference
     *         type by the specifiied derivation method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSComplexTypeDecl.java
public class XSComplexTypeDecl implements XSComplexTypeDefinition, TypeInfo {

/**
 * The XML representation for a complexType
 * schema component is a <complexType> element information item
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @author Sandy Gao, IBM
 * @version $Id: XSComplexTypeDecl.java,v 1.8 2010-11-01 04:39:55 joehw Exp $
 */
