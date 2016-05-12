_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        return valueType;

        /** Other types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        if (valueType <= XSConstants.POSITIVEINTEGER_DT) {

        /** Types derived from decimal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        if (valueType <= XSConstants.ENTITY_DT) {

        /** Types derived from string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        if (valueType <= XSConstants.NOTATION_DT) {

        /** Primitive datatypes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        public XSObjectList getAnnotations() {

        /**
         * Optional. Annotations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        public XSAnnotation getAnnotation() {

        /**
         * Optional. Annotation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSObjectList getMultiValueFacets() {

    /**
     *  A list of enumeration and pattern constraining facets if it exists,
     * otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSObjectList getFacets() {

    /**
     *  A list of constraining facets if it exists, otherwise an empty
     * <code>XSObjectList</code>. Note: This method must not be used to
     * retrieve values for <code>enumeration</code> and <code>pattern</code>
     * facets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public String toString() {

    /**
     * @see java.lang.Object#toString()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see com.sun.org.apache.xerces.internal.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    static final class ValidationContextImpl implements ValidationContext {

    /**
     * A wrapper of ValidationContext, to provide a way of switching to a
     * different Namespace declaration context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    static final ValidationContext fDummyContext = new ValidationContext() {

    /**
     * Validation context used to validate facet values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    private boolean isDerivedByUnion (String ancestorNS, String ancestorName, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by union.  See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by union for the reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    private boolean isDerivedByList (String ancestorNS, String ancestorName, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by list. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by list for the reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    private boolean isDerivedByRestriction (String ancestorNS, String ancestorName, XSTypeDefinition type) {

    /**
     * DOM Level 3
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    private boolean isDerivedByAny(String ancestorNS, String ancestorName,
            XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by any combination of restriction, list ir union. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean isDOMDerivedFrom(String ancestorNS, String ancestorName, int derivationMethod) {

    /**
     * Checks if a type is derived from another by restriction, given the name
     * and namespace. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            The derivation method
     *
     * @return boolean True if the ancestor type is derived from the reference type by the specifiied derivation method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSObjectList getAnnotations() {

    /**
     * [annotations]: a set of annotations for this simple type component if
     * it exists, otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public StringList getLexicalPattern() {

    /**
     * A list of pattern values if it exists, otherwise an empty
     * <code>StringList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public ObjectList getEnumerationItemTypeList() {

    /**
     * A list of enumeration type values (as a list of ShortList objects) if it exists, otherwise returns
     * null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public ObjectList getActualEnumeration() {

    /**
     * A list of actual enumeration values if it exists, otherwise an empty
     * <code>ObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public StringList getLexicalEnumeration() {

    /**
     * A list of enumeration values if it exists, otherwise an empty
     * <code>StringList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public String getLexicalFacetValue(short facetName) {

    /**
     * Convenience method. Returns a value of a single constraining facet for
     * this simple type definition. This method must not be used to retrieve
     * values for <code>enumeration</code> and <code>pattern</code> facets.
     * @param facetName The name of the facet, i.e.
     *   <code>FACET_LENGTH, FACET_TOTALDIGITS </code> (see
     *   <code>XSConstants</code>). To retrieve the value for a pattern or
     *   an enumeration, see <code>enumeration</code> and
     *   <code>pattern</code>.
     * @return A value of the facet specified in <code>facetName</code> for
     *   this simple type definition or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public short getFixedFacets() {

    /**
     * [facets]: all defined facets for this type which are fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean isFixedFacet(short facetName) {

    /**
     * Convenience method. [Facets]: check whether a facet is defined and
     * fixed on this type.
     * @param facetName  The name of the facet.
     * @return  True if the facet is fixed, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public short getDefinedFacets() {

    /**
     * [facets]: all facets defined on this type. The value is a bit
     * combination of FACET_XXX constants of all defined facets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean isDefinedFacet(short facetName) {

    /**
     * Convenience method. [Facets]: check whether a facet is defined on this
     * type.
     * @param facetName  The name of the facet.
     * @return  True if the facet is defined, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean getNumeric(){

    /**
     * Fundamental Facet: numeric.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean getFinite(){

    /**
     * Fundamental Facet: cardinality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean getBounded(){

    /**
     * Fundamental Facet: bounded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public short getOrdered() {

    /**
     *  Fundamental Facet: ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public void validate(ValidationContext context, ValidatedInfo validatedInfo)

    /**
     * validate an actual value against this DV
     *
     * @param context       the validation context
     * @param validatedInfo used to provide the actual value and member types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public Object validate(Object content, ValidationContext context, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {

    /**
     * validate a value, and return the compiled form
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public ValidatedInfo validateWithInfo(String content, ValidationContext context, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {

    /**
     * validate a value, and return the compiled form
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public Object validate(String content, ValidationContext context, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {

    /**
     * validate a value, and return the compiled form
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    void applyFacets(XSFacets facets, short presentFacet, short fixedFacet, short patternType, ValidationContext context)

    /**
     * If <restriction> is chosen, or built-in derived types by restriction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    void applyFacets1(XSFacets facets, short presentFacet, short fixedFacet, short patternType) {

    /**
     * built-in derived types by restriction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    void applyFacets1(XSFacets facets, short presentFacet, short fixedFacet) {

    /**
     * built-in derived types by restriction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public void applyFacets(XSFacets facets, short presentFacet, short fixedFacet, ValidationContext context)

    /**
     * If <restriction> is chosen
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSObjectList getMemberTypes() {

    /**
     * If variety is <code>union</code> the list of member type definitions (a
     * non-empty sequence of simple type definitions) is available,
     * otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSSimpleTypeDefinition getItemType() {

    /**
     * If variety is <code>list</code> the item type definition (an atomic or
     * union simple type definition) is available, otherwise
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSSimpleTypeDefinition getPrimitiveType() {

    /**
     * If variety is <code>atomic</code> the primitive type definition (a
     * built-in primitive datatype definition or the simple ur-type
     * definition) is available, otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public short getBuiltInKind() {

    /**
     * Returns the closest built-in type category this type represents or
     * derived from. For example, if this simple type is a built-in derived
     * type integer the <code>INTEGER_DV</code> is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
public class XSSimpleTypeDecl implements XSSimpleType, TypeInfo {

/**
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 *
 * @version $Id: XSSimpleTypeDecl.java 3029 2011-04-24 17:50:18Z joehw $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        return valueType;

        /** Other types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        if (valueType <= XSConstants.POSITIVEINTEGER_DT) {

        /** Types derived from decimal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        if (valueType <= XSConstants.ENTITY_DT) {

        /** Types derived from string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        if (valueType <= XSConstants.NOTATION_DT) {

        /** Primitive datatypes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        public XSObjectList getAnnotations() {

        /**
         * Optional. Annotations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
        public XSAnnotation getAnnotation() {

        /**
         * Optional. Annotation.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSObjectList getMultiValueFacets() {

    /**
     *  A list of enumeration and pattern constraining facets if it exists,
     * otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSObjectList getFacets() {

    /**
     *  A list of constraining facets if it exists, otherwise an empty
     * <code>XSObjectList</code>. Note: This method must not be used to
     * retrieve values for <code>enumeration</code> and <code>pattern</code>
     * facets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public String toString() {

    /**
     * @see java.lang.Object#toString()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSNamespaceItem getNamespaceItem() {

    /**
     * @see com.sun.org.apache.xerces.internal.xs.XSObject#getNamespaceItem()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    static final class ValidationContextImpl implements ValidationContext {

    /**
     * A wrapper of ValidationContext, to provide a way of switching to a
     * different Namespace declaration context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    static final ValidationContext fDummyContext = new ValidationContext() {

    /**
     * Validation context used to validate facet values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    private boolean isDerivedByUnion (String ancestorNS, String ancestorName, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by union.  See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by union for the reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    private boolean isDerivedByList (String ancestorNS, String ancestorName, XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by list. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by list for the reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    private boolean isDerivedByRestriction (String ancestorNS, String ancestorName, XSTypeDefinition type) {

    /**
     * DOM Level 3
     * Checks if a type is derived from another by restriction. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the
     *         reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    private boolean isDerivedByAny(String ancestorNS, String ancestorName,
            XSTypeDefinition type) {

    /**
     * Checks if a type is derived from another by any combination of restriction, list ir union. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param type
     *            The reference type definition
     *
     * @return boolean True if the type is derived by restriciton for the reference type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean isDOMDerivedFrom(String ancestorNS, String ancestorName, int derivationMethod) {

    /**
     * Checks if a type is derived from another by restriction, given the name
     * and namespace. See:
     * http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#TypeInfo-isDerivedFrom
     *
     * @param ancestorNS
     *            The namspace of the ancestor type declaration
     * @param ancestorName
     *            The name of the ancestor type declaration
     * @param derivationMethod
     *            The derivation method
     *
     * @return boolean True if the ancestor type is derived from the reference type by the specifiied derivation method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSObjectList getAnnotations() {

    /**
     * [annotations]: a set of annotations for this simple type component if
     * it exists, otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public StringList getLexicalPattern() {

    /**
     * A list of pattern values if it exists, otherwise an empty
     * <code>StringList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public ObjectList getEnumerationItemTypeList() {

    /**
     * A list of enumeration type values (as a list of ShortList objects) if it exists, otherwise returns
     * null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public ObjectList getActualEnumeration() {

    /**
     * A list of actual enumeration values if it exists, otherwise an empty
     * <code>ObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public StringList getLexicalEnumeration() {

    /**
     * A list of enumeration values if it exists, otherwise an empty
     * <code>StringList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public String getLexicalFacetValue(short facetName) {

    /**
     * Convenience method. Returns a value of a single constraining facet for
     * this simple type definition. This method must not be used to retrieve
     * values for <code>enumeration</code> and <code>pattern</code> facets.
     * @param facetName The name of the facet, i.e.
     *   <code>FACET_LENGTH, FACET_TOTALDIGITS </code> (see
     *   <code>XSConstants</code>). To retrieve the value for a pattern or
     *   an enumeration, see <code>enumeration</code> and
     *   <code>pattern</code>.
     * @return A value of the facet specified in <code>facetName</code> for
     *   this simple type definition or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public short getFixedFacets() {

    /**
     * [facets]: all defined facets for this type which are fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean isFixedFacet(short facetName) {

    /**
     * Convenience method. [Facets]: check whether a facet is defined and
     * fixed on this type.
     * @param facetName  The name of the facet.
     * @return  True if the facet is fixed, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public short getDefinedFacets() {

    /**
     * [facets]: all facets defined on this type. The value is a bit
     * combination of FACET_XXX constants of all defined facets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean isDefinedFacet(short facetName) {

    /**
     * Convenience method. [Facets]: check whether a facet is defined on this
     * type.
     * @param facetName  The name of the facet.
     * @return  True if the facet is defined, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean getNumeric(){

    /**
     * Fundamental Facet: numeric.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean getFinite(){

    /**
     * Fundamental Facet: cardinality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public boolean getBounded(){

    /**
     * Fundamental Facet: bounded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public short getOrdered() {

    /**
     *  Fundamental Facet: ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public void validate(ValidationContext context, ValidatedInfo validatedInfo)

    /**
     * validate an actual value against this DV
     *
     * @param context       the validation context
     * @param validatedInfo used to provide the actual value and member types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public Object validate(Object content, ValidationContext context, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {

    /**
     * validate a value, and return the compiled form
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public ValidatedInfo validateWithInfo(String content, ValidationContext context, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {

    /**
     * validate a value, and return the compiled form
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public Object validate(String content, ValidationContext context, ValidatedInfo validatedInfo) throws InvalidDatatypeValueException {

    /**
     * validate a value, and return the compiled form
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    void applyFacets(XSFacets facets, short presentFacet, short fixedFacet, short patternType, ValidationContext context)

    /**
     * If <restriction> is chosen, or built-in derived types by restriction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    void applyFacets1(XSFacets facets, short presentFacet, short fixedFacet, short patternType) {

    /**
     * built-in derived types by restriction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    void applyFacets1(XSFacets facets, short presentFacet, short fixedFacet) {

    /**
     * built-in derived types by restriction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public void applyFacets(XSFacets facets, short presentFacet, short fixedFacet, ValidationContext context)

    /**
     * If <restriction> is chosen
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSObjectList getMemberTypes() {

    /**
     * If variety is <code>union</code> the list of member type definitions (a
     * non-empty sequence of simple type definitions) is available,
     * otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSSimpleTypeDefinition getItemType() {

    /**
     * If variety is <code>list</code> the item type definition (an atomic or
     * union simple type definition) is available, otherwise
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public XSSimpleTypeDefinition getPrimitiveType() {

    /**
     * If variety is <code>atomic</code> the primitive type definition (a
     * built-in primitive datatype definition or the simple ur-type
     * definition) is available, otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
    public short getBuiltInKind() {

    /**
     * Returns the closest built-in type category this type represents or
     * derived from. For example, if this simple type is a built-in derived
     * type integer the <code>INTEGER_DV</code> is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/XSSimpleTypeDecl.java
public class XSSimpleTypeDecl implements XSSimpleType, TypeInfo {

/**
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 *
 * @version $Id: XSSimpleTypeDecl.java 3029 2011-04-24 17:50:18Z joehw $
 */
