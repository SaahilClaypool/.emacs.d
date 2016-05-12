_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public boolean derivedFrom(String namespace,
                               String name,
                               short derivationMethod);

    /**
     * Convenience method which checks if this type is derived from the given
     * ancestor type.
     * @param namespace  An ancestor type namespace.
     * @param name  An ancestor type name.
     * @param derivationMethod  A bit combination representing a subset of {
     *   <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code>
     *   }.
     * @return  True if this type is derived from <code>ancestorType</code>
     *   using only derivation methods from the <code>derivationMethod</code>
     *   .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public boolean derivedFromType(XSTypeDefinition ancestorType,
                                   short derivationMethod);

    /**
     * Convenience method which checks if this type is derived from the given
     * <code>ancestorType</code>.
     * @param ancestorType  An ancestor type definition.
     * @param derivationMethod  A bit combination representing a subset of {
     *   <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code>
     *   }.
     * @return  True if this type is derived from <code>ancestorType</code>
     *   using only derivation methods from the <code>derivationMethod</code>
     *   .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public boolean getAnonymous();

    /**
     *  Convenience attribute. A boolean that specifies if the type definition
     * is anonymous.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public short getFinal();

    /**
     * For complex types the returned value is a bit combination of the subset
     * of {<code>DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code>}
     * corresponding to <code>final</code> set of this type or
     * <code>DERIVATION_NONE</code>. For simple types the returned value is
     * a bit combination of the subset of {
     * <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code>
     * } corresponding to <code>final</code> set of this type or
     * <code>DERIVATION_NONE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public boolean isFinal(short restriction);

    /**
     * {final}. For a complex type definition it is a subset of {extension,
     * restriction}. For a simple type definition it is a subset of
     * {extension, list, restriction, union}.
     * @param restriction  Extension, restriction, list, union constants
     *   (defined in <code>XSConstants</code>).
     * @return True if <code>restriction</code> is in the final set,
     *   otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public XSTypeDefinition getBaseType();

    /**
     * {base type definition}: either a simple type definition or a complex
     * type definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public static final short SIMPLE_TYPE               = 16;

    /**
     * The object describes a simple type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
public interface XSTypeDefinition extends XSObject {

/**
 * This interface represents a complex or simple type definition.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public boolean derivedFrom(String namespace,
                               String name,
                               short derivationMethod);

    /**
     * Convenience method which checks if this type is derived from the given
     * ancestor type.
     * @param namespace  An ancestor type namespace.
     * @param name  An ancestor type name.
     * @param derivationMethod  A bit combination representing a subset of {
     *   <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code>
     *   }.
     * @return  True if this type is derived from <code>ancestorType</code>
     *   using only derivation methods from the <code>derivationMethod</code>
     *   .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public boolean derivedFromType(XSTypeDefinition ancestorType,
                                   short derivationMethod);

    /**
     * Convenience method which checks if this type is derived from the given
     * <code>ancestorType</code>.
     * @param ancestorType  An ancestor type definition.
     * @param derivationMethod  A bit combination representing a subset of {
     *   <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code>
     *   }.
     * @return  True if this type is derived from <code>ancestorType</code>
     *   using only derivation methods from the <code>derivationMethod</code>
     *   .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public boolean getAnonymous();

    /**
     *  Convenience attribute. A boolean that specifies if the type definition
     * is anonymous.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public short getFinal();

    /**
     * For complex types the returned value is a bit combination of the subset
     * of {<code>DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code>}
     * corresponding to <code>final</code> set of this type or
     * <code>DERIVATION_NONE</code>. For simple types the returned value is
     * a bit combination of the subset of {
     * <code>DERIVATION_RESTRICTION, DERIVATION_EXTENSION, DERIVATION_UNION, DERIVATION_LIST</code>
     * } corresponding to <code>final</code> set of this type or
     * <code>DERIVATION_NONE</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public boolean isFinal(short restriction);

    /**
     * {final}. For a complex type definition it is a subset of {extension,
     * restriction}. For a simple type definition it is a subset of
     * {extension, list, restriction, union}.
     * @param restriction  Extension, restriction, list, union constants
     *   (defined in <code>XSConstants</code>).
     * @return True if <code>restriction</code> is in the final set,
     *   otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public XSTypeDefinition getBaseType();

    /**
     * {base type definition}: either a simple type definition or a complex
     * type definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
    public static final short SIMPLE_TYPE               = 16;

    /**
     * The object describes a simple type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSTypeDefinition.java
public interface XSTypeDefinition extends XSObject {

/**
 * This interface represents a complex or simple type definition.
 */
