_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    public boolean isField() {

    /**
     * Returns {@code true} if this is a kind of field:
     * either {@code FIELD} or {@code ENUM_CONSTANT}.
     *
     * @return {@code true} if this is a kind of field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    public boolean isInterface() {

    /**
     * Returns {@code true} if this is a kind of interface:
     * either {@code INTERFACE} or {@code ANNOTATION_TYPE}.
     *
     * @return {@code true} if this is a kind of interface
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    public boolean isClass() {

    /**
     * Returns {@code true} if this is a kind of class:
     * either {@code CLASS} or {@code ENUM}.
     *
     * @return {@code true} if this is a kind of class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    RESOURCE_VARIABLE;

    /**
     * A resource variable.
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    OTHER,

    /**
     * An implementation-reserved element.  This is not the element
     * you are looking for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    TYPE_PARAMETER,

    /** A type parameter. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    STATIC_INIT,

    /** A static initializer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    METHOD,

    /** A method. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    EXCEPTION_PARAMETER,

    /** A parameter of an exception handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    PARAMETER,

    /** A parameter of a method or constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    ENUM_CONSTANT,

    /** An enum constant. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    ANNOTATION_TYPE,

    /** An annotation type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    ENUM,

    /** An enum type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
    PACKAGE,

    /** A package. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/ElementKind.java
public enum ElementKind {

/**
 * The {@code kind} of an element.
 *
 * <p>Note that it is possible additional element kinds will be added
 * to accommodate new, currently unknown, language structures added to
 * future versions of the Java&trade; programming language.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see Element
 * @since 1.6
 */
