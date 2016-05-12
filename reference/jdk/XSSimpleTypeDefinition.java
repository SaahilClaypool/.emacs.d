_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSObjectList getMultiValueFacets();

    /**
     *  A list of enumeration and pattern constraining facets if it exists,
     * otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSObjectList getFacets();

    /**
     *  A list of constraining facets if it exists, otherwise an empty
     * <code>XSObjectList</code>. Note: This method must not be used to
     * retrieve values for <code>enumeration</code> and <code>pattern</code>
     * facets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean getNumeric();

    /**
     * Fundamental Facet: numeric.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean getBounded();

    /**
     * Fundamental Facet: bounded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean getFinite();

    /**
     * Fundamental Facet: cardinality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public short getOrdered();

    /**
     *  Fundamental Facet: ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public StringList getLexicalPattern();

    /**
     * A list of pattern values if it exists, otherwise an empty
     * <code>StringList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public StringList getLexicalEnumeration();

    /**
     * A list of enumeration values if it exists, otherwise an empty
     * <code>StringList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public String getLexicalFacetValue(short facetName);

    /**
     * Convenience method. Returns a value of a single constraining facet for
     * this simple type definition. This method must not be used to retrieve
     * values for <code>enumeration</code> and <code>pattern</code> facets.
     * @param facetName The name of the facet, i.e.
     *   <code>FACET_LENGTH, FACET_TOTALDIGITS</code>.
     *   To retrieve the value for a pattern or
     *   an enumeration, see <code>enumeration</code> and
     *   <code>pattern</code>.
     * @return A value of the facet specified in <code>facetName</code> for
     *   this simple type definition or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean isFixedFacet(short facetName);

    /**
     * Convenience method. [Facets]: check whether a facet is defined and
     * fixed on this type.
     * @param facetName  The name of the facet.
     * @return  True if the facet is fixed, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public short getFixedFacets();

    /**
     * [facets]: all defined facets for this type which are fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean isDefinedFacet(short facetName);

    /**
     * Convenience method. [Facets]: check whether a facet is defined on this
     * type.
     * @param facetName  The name of the facet.
     * @return  True if the facet is defined, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public short getDefinedFacets();

    /**
     * [facets]: all facets defined on this type. The value is a bit
     * combination of FACET_XXX constants of all defined facets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSObjectList getMemberTypes();

    /**
     * If variety is <code>union</code> the list of member type definitions (a
     * non-empty sequence of simple type definitions) is available,
     * otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSSimpleTypeDefinition getItemType();

    /**
     * If variety is <code>list</code> the item type definition (an atomic or
     * union simple type definition) is available, otherwise
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public short getBuiltInKind();

    /**
     * Returns the closest built-in type category this type represents or
     * derived from. For example, if this simple type is a built-in derived
     * type integer the <code>INTEGER_DV</code> is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSSimpleTypeDefinition getPrimitiveType();

    /**
     * If variety is <code>atomic</code> the primitive type definition (a
     * built-in primitive datatype definition or the simple ur-type
     * definition) is available, otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short ORDERED_TOTAL             = 2;

    /**
     * A constant defined for the 'ordered' fundamental facet: total ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short ORDERED_FALSE             = 0;

    /**
     * A constant defined for the 'ordered' fundamental facet: not ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_ENUMERATION         = 2048;

    /**
     * 4.3.5 enumeration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_TOTALDIGITS         = 512;

    /**
     * 4.3.11 totalDigits .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_MINEXCLUSIVE        = 128;

    /**
     * 4.3.9 minExclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_MAXINCLUSIVE        = 32;

    /**
     * 4.3.7 maxInclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_PATTERN             = 8;

    /**
     * 4.3.4 pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_MINLENGTH           = 2;

    /**
     * 4.3.2 minLength.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_NONE                = 0;

    /**
     * No facets defined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short VARIETY_LIST              = 2;

    /**
     * <code>List</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short VARIETY_ABSENT            = 0;

    /**
     * The variety is absent for the anySimpleType definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
public interface XSSimpleTypeDefinition extends XSTypeDefinition {

/**
 * This interface represents the Simple Type Definition schema component. This
 * interface provides several query operations for facet components. Users
 * can either retrieve the defined facets as XML Schema components, using
 * the <code>facets</code> and the <code>multiValueFacets</code> attributes;
 * or users can separately query a facet's properties using methods such as
 * <code>getLexicalFacetValue</code>, <code>isFixedFacet</code>, etc.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSObjectList getMultiValueFacets();

    /**
     *  A list of enumeration and pattern constraining facets if it exists,
     * otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSObjectList getFacets();

    /**
     *  A list of constraining facets if it exists, otherwise an empty
     * <code>XSObjectList</code>. Note: This method must not be used to
     * retrieve values for <code>enumeration</code> and <code>pattern</code>
     * facets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean getNumeric();

    /**
     * Fundamental Facet: numeric.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean getBounded();

    /**
     * Fundamental Facet: bounded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean getFinite();

    /**
     * Fundamental Facet: cardinality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public short getOrdered();

    /**
     *  Fundamental Facet: ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public StringList getLexicalPattern();

    /**
     * A list of pattern values if it exists, otherwise an empty
     * <code>StringList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public StringList getLexicalEnumeration();

    /**
     * A list of enumeration values if it exists, otherwise an empty
     * <code>StringList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public String getLexicalFacetValue(short facetName);

    /**
     * Convenience method. Returns a value of a single constraining facet for
     * this simple type definition. This method must not be used to retrieve
     * values for <code>enumeration</code> and <code>pattern</code> facets.
     * @param facetName The name of the facet, i.e.
     *   <code>FACET_LENGTH, FACET_TOTALDIGITS</code>.
     *   To retrieve the value for a pattern or
     *   an enumeration, see <code>enumeration</code> and
     *   <code>pattern</code>.
     * @return A value of the facet specified in <code>facetName</code> for
     *   this simple type definition or <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean isFixedFacet(short facetName);

    /**
     * Convenience method. [Facets]: check whether a facet is defined and
     * fixed on this type.
     * @param facetName  The name of the facet.
     * @return  True if the facet is fixed, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public short getFixedFacets();

    /**
     * [facets]: all defined facets for this type which are fixed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public boolean isDefinedFacet(short facetName);

    /**
     * Convenience method. [Facets]: check whether a facet is defined on this
     * type.
     * @param facetName  The name of the facet.
     * @return  True if the facet is defined, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public short getDefinedFacets();

    /**
     * [facets]: all facets defined on this type. The value is a bit
     * combination of FACET_XXX constants of all defined facets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSObjectList getMemberTypes();

    /**
     * If variety is <code>union</code> the list of member type definitions (a
     * non-empty sequence of simple type definitions) is available,
     * otherwise an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSSimpleTypeDefinition getItemType();

    /**
     * If variety is <code>list</code> the item type definition (an atomic or
     * union simple type definition) is available, otherwise
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public short getBuiltInKind();

    /**
     * Returns the closest built-in type category this type represents or
     * derived from. For example, if this simple type is a built-in derived
     * type integer the <code>INTEGER_DV</code> is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public XSSimpleTypeDefinition getPrimitiveType();

    /**
     * If variety is <code>atomic</code> the primitive type definition (a
     * built-in primitive datatype definition or the simple ur-type
     * definition) is available, otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short ORDERED_TOTAL             = 2;

    /**
     * A constant defined for the 'ordered' fundamental facet: total ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short ORDERED_FALSE             = 0;

    /**
     * A constant defined for the 'ordered' fundamental facet: not ordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_ENUMERATION         = 2048;

    /**
     * 4.3.5 enumeration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_TOTALDIGITS         = 512;

    /**
     * 4.3.11 totalDigits .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_MINEXCLUSIVE        = 128;

    /**
     * 4.3.9 minExclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_MAXINCLUSIVE        = 32;

    /**
     * 4.3.7 maxInclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_PATTERN             = 8;

    /**
     * 4.3.4 pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_MINLENGTH           = 2;

    /**
     * 4.3.2 minLength.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short FACET_NONE                = 0;

    /**
     * No facets defined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short VARIETY_LIST              = 2;

    /**
     * <code>List</code> type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
    public static final short VARIETY_ABSENT            = 0;

    /**
     * The variety is absent for the anySimpleType definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSSimpleTypeDefinition.java
public interface XSSimpleTypeDefinition extends XSTypeDefinition {

/**
 * This interface represents the Simple Type Definition schema component. This
 * interface provides several query operations for facet components. Users
 * can either retrieve the defined facets as XML Schema components, using
 * the <code>facets</code> and the <code>multiValueFacets</code> attributes;
 * or users can separately query a facet's properties using methods such as
 * <code>getLexicalFacetValue</code>, <code>isFixedFacet</code>, etc.
 */
