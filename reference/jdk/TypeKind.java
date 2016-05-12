_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    public boolean isPrimitive() {

    /**
     * Returns {@code true} if this kind corresponds to a primitive
     * type and {@code false} otherwise.
     * @return {@code true} if this kind corresponds to a primitive type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    INTERSECTION;

    /**
      * An intersection type.
      *
      * @since 1.8
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    UNION,

    /**
      * A union type.
      *
      * @since 1.7
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    OTHER,

    /**
     * An implementation-reserved type.
     * This is not the type you are looking for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    EXECUTABLE,

    /**
     * A method, constructor, or initializer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    PACKAGE,

    /**
     * A pseudo-type corresponding to a package element.
     * @see NoType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    WILDCARD,

    /**
     * A wildcard type argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    TYPEVAR,

    /**
     * A type variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    ERROR,

    /**
     * A class or interface type that could not be resolved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    DECLARED,

    /**
     * A class or interface type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    ARRAY,

    /**
     * An array type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    NULL,

    /**
     * The null type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    NONE,

    /**
     * A pseudo-type used where no actual type is appropriate.
     * @see NoType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    VOID,

    /**
     * The pseudo-type corresponding to the keyword {@code void}.
     * @see NoType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    DOUBLE,

    /**
     * The primitive type {@code double}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    FLOAT,

    /**
     * The primitive type {@code float}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    CHAR,

    /**
     * The primitive type {@code char}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    LONG,

    /**
     * The primitive type {@code long}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    INT,

    /**
     * The primitive type {@code int}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    SHORT,

    /**
     * The primitive type {@code short}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
    BYTE,

    /**
     * The primitive type {@code byte}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/TypeKind.java
public enum TypeKind {

/**
 * The kind of a type mirror.
 *
 * <p>Note that it is possible additional type kinds will be added to
 * accommodate new, currently unknown, language structures added to
 * future versions of the Java&trade; programming language.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see TypeMirror
 * @since 1.6
 */
