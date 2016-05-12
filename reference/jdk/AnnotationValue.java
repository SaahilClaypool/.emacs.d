_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/AnnotationValue.java
    String toString();

    /**
     * Returns a string representation of the value.
     *
     * @return the text of a Java language annotation value expression
     *          whose value is the value of this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/AnnotationValue.java
    Object value();

    /**
     * Returns the value.
     * The type of the returned object is one of the following:
     * <ul><li> a wrapper class for a primitive type
     *     <li> <code>String</code>
     *     <li> <code>Type</code> (representing a class literal)
     *     <li> <code>FieldDoc</code> (representing an enum constant)
     *     <li> <code>AnnotationDesc</code>
     *     <li> <code>AnnotationValue[]</code>
     * </ul>
     *
     * @return the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/AnnotationValue.java
public interface AnnotationValue {

/**
 * Represents a value of an annotation type element.
 *
 * @author Scott Seligman
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/AnnotationValue.java
    String toString();

    /**
     * Returns a string representation of the value.
     *
     * @return the text of a Java language annotation value expression
     *          whose value is the value of this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/AnnotationValue.java
    Object value();

    /**
     * Returns the value.
     * The type of the returned object is one of the following:
     * <ul><li> a wrapper class for a primitive type
     *     <li> <code>String</code>
     *     <li> <code>Type</code> (representing a class literal)
     *     <li> <code>FieldDoc</code> (representing an enum constant)
     *     <li> <code>AnnotationDesc</code>
     *     <li> <code>AnnotationValue[]</code>
     * </ul>
     *
     * @return the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/AnnotationValue.java
public interface AnnotationValue {

/**
 * Represents a value of an annotation type element.
 *
 * @author Scott Seligman
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/AnnotationValue.java
    <R, P> R accept(AnnotationValueVisitor<R, P> v, P p);

    /**
     * Applies a visitor to this value.
     *
     * @param <R> the return type of the visitor's methods
     * @param <P> the type of the additional parameter to the visitor's methods
     * @param v   the visitor operating on this value
     * @param p   additional parameter to the visitor
     * @return a visitor-specified result
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/AnnotationValue.java
    String toString();

    /**
     * Returns a string representation of this value.
     * This is returned in a form suitable for representing this value
     * in the source code of an annotation.
     *
     * @return a string representation of this value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/AnnotationValue.java
    Object getValue();

    /**
     * Returns the value.
     *
     * @return the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/AnnotationValue.java
public interface AnnotationValue {

/**
 * Represents a value of an annotation type element.
 * A value is of one of the following types:
 * <ul><li> a wrapper class (such as {@link Integer}) for a primitive type
 *     <li> {@code String}
 *     <li> {@code TypeMirror}
 *     <li> {@code VariableElement} (representing an enum constant)
 *     <li> {@code AnnotationMirror}
 *     <li> {@code List<? extends AnnotationValue>}
 *              (representing the elements, in declared order, if the value is an array)
 * </ul>
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
