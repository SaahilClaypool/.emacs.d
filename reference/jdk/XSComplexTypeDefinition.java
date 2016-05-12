_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public short getProhibitedSubstitutions();

    /**
     *  [prohibited substitutions]: A subset of {extension, restriction} or
     * <code>DERIVATION_NONE</code> represented as a bit flag (see
     * <code>XSConstants</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public boolean isProhibitedSubstitution(short restriction);

    /**
     * [prohibited substitutions]: a subset of {extension, restriction}
     * @param restriction  Extension or restriction constants (see
     *   <code>XSConstants</code>).
     * @return True if <code>restriction</code> is a prohibited substitution,
     *   otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSParticle getParticle();

    /**
     * A particle for a mixed or element-only content model, otherwise
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSSimpleTypeDefinition getSimpleType();

    /**
     * A simple type definition corresponding to a simple content model,
     * otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public short getContentType();

    /**
     * [content type]: one of empty (<code>CONTENTTYPE_EMPTY</code>), a simple
     * type definition (<code>CONTENTTYPE_SIMPLE</code>), mixed (
     * <code>CONTENTTYPE_MIXED</code>), or element-only (
     * <code>CONTENTTYPE_ELEMENT</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSWildcard getAttributeWildcard();

    /**
     * An attribute wildcard if it exists, otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSObjectList getAttributeUses();

    /**
     *  A set of attribute uses if it exists, otherwise an empty
     * <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public boolean getAbstract();

    /**
     * [abstract]: a boolean. Complex types for which <code>abstract</code> is
     * true must not be used as the type definition for the validation of
     * element information items.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public short getDerivationMethod();

    /**
     * [derivation method]: either <code>DERIVATION_EXTENSION</code>,
     * <code>DERIVATION_RESTRICTION</code>, or <code>DERIVATION_NONE</code>
     * (see <code>XSConstants</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public static final short CONTENTTYPE_ELEMENT       = 2;

    /**
     * Represents an element-only content type. An element-only content type
     * validates elements with children that conform to the supplied content
     * model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public static final short CONTENTTYPE_EMPTY         = 0;

    /**
     * Represents an empty content type. A content type with the distinguished
     * value empty validates elements with no character or element
     * information item children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
public interface XSComplexTypeDefinition extends XSTypeDefinition {

/**
 * This interface represents the Complex Type Definition schema component.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSObjectList getAnnotations();

    /**
     * A sequence of [annotations] or an empty <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public short getProhibitedSubstitutions();

    /**
     *  [prohibited substitutions]: A subset of {extension, restriction} or
     * <code>DERIVATION_NONE</code> represented as a bit flag (see
     * <code>XSConstants</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public boolean isProhibitedSubstitution(short restriction);

    /**
     * [prohibited substitutions]: a subset of {extension, restriction}
     * @param restriction  Extension or restriction constants (see
     *   <code>XSConstants</code>).
     * @return True if <code>restriction</code> is a prohibited substitution,
     *   otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSParticle getParticle();

    /**
     * A particle for a mixed or element-only content model, otherwise
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSSimpleTypeDefinition getSimpleType();

    /**
     * A simple type definition corresponding to a simple content model,
     * otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public short getContentType();

    /**
     * [content type]: one of empty (<code>CONTENTTYPE_EMPTY</code>), a simple
     * type definition (<code>CONTENTTYPE_SIMPLE</code>), mixed (
     * <code>CONTENTTYPE_MIXED</code>), or element-only (
     * <code>CONTENTTYPE_ELEMENT</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSWildcard getAttributeWildcard();

    /**
     * An attribute wildcard if it exists, otherwise <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public XSObjectList getAttributeUses();

    /**
     *  A set of attribute uses if it exists, otherwise an empty
     * <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public boolean getAbstract();

    /**
     * [abstract]: a boolean. Complex types for which <code>abstract</code> is
     * true must not be used as the type definition for the validation of
     * element information items.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public short getDerivationMethod();

    /**
     * [derivation method]: either <code>DERIVATION_EXTENSION</code>,
     * <code>DERIVATION_RESTRICTION</code>, or <code>DERIVATION_NONE</code>
     * (see <code>XSConstants</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public static final short CONTENTTYPE_ELEMENT       = 2;

    /**
     * Represents an element-only content type. An element-only content type
     * validates elements with children that conform to the supplied content
     * model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
    public static final short CONTENTTYPE_EMPTY         = 0;

    /**
     * Represents an empty content type. A content type with the distinguished
     * value empty validates elements with no character or element
     * information item children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSComplexTypeDefinition.java
public interface XSComplexTypeDefinition extends XSTypeDefinition {

/**
 * This interface represents the Complex Type Definition schema component.
 */
