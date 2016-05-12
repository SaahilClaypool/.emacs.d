_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/WildcardType.java
    Type[] superBounds();

    /**
     * Return the lower bounds of this wildcard type argument
     * as given by the <i>super</i> clause.
     * Return an empty array if no such bounds are explicitly given.
     *
     * @return the super bounds of this wildcard type argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/WildcardType.java
    Type[] extendsBounds();

    /**
     * Return the upper bounds of this wildcard type argument
     * as given by the <i>extends</i> clause.
     * Return an empty array if no such bounds are explicitly given.
     *
     * @return the extends bounds of this wildcard type argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/WildcardType.java
public interface WildcardType extends Type {

/**
 * Represents a wildcard type argument.
 * Examples include:    <pre>
 * {@code <?>}
 * {@code <? extends E>}
 * {@code <? super T>}
 * </pre>
 * A wildcard type can have explicit <i>extends</i> bounds
 * or explicit <i>super</i> bounds or neither, but not both.
 *
 * @author Scott Seligman
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/WildcardType.java
    Type[] superBounds();

    /**
     * Return the lower bounds of this wildcard type argument
     * as given by the <i>super</i> clause.
     * Return an empty array if no such bounds are explicitly given.
     *
     * @return the super bounds of this wildcard type argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/WildcardType.java
    Type[] extendsBounds();

    /**
     * Return the upper bounds of this wildcard type argument
     * as given by the <i>extends</i> clause.
     * Return an empty array if no such bounds are explicitly given.
     *
     * @return the extends bounds of this wildcard type argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/javadoc/WildcardType.java
public interface WildcardType extends Type {

/**
 * Represents a wildcard type argument.
 * Examples include:    <pre>
 * {@code <?>}
 * {@code <? extends E>}
 * {@code <? super T>}
 * </pre>
 * A wildcard type can have explicit <i>extends</i> bounds
 * or explicit <i>super</i> bounds or neither, but not both.
 *
 * @author Scott Seligman
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/WildcardType.java
    Type[] getLowerBounds();

    /**
     * Returns an array of {@code Type} objects representing the
     * lower bound(s) of this type variable.  Note that if no lower bound is
     * explicitly declared, the lower bound is the type of {@code null}.
     * In this case, a zero length array is returned.
     *
     * <p>For each lower bound B :
     * <ul>
     *   <li>if B is a parameterized type or a type variable, it is created,
     *  (see {@link java.lang.reflect.ParameterizedType ParameterizedType}
     *  for the details of the creation process for parameterized types).
     *   <li>Otherwise, B is resolved.
     * </ul>
     *
     * @return an array of Types representing the lower bound(s) of this
     *     type variable
     * @throws TypeNotPresentException if any of the
     *     bounds refers to a non-existent type declaration
     * @throws MalformedParameterizedTypeException if any of the
     *     bounds refer to a parameterized type that cannot be instantiated
     *     for any reason
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/reflect/WildcardType.java
public interface WildcardType extends Type {

/**
 * WildcardType represents a wildcard type expression, such as
 * {@code ?}, {@code ? extends Number}, or {@code ? super Integer}.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/WildcardType.java
    TypeMirror getSuperBound();

    /**
     * Returns the lower bound of this wildcard.
     * If no lower bound is explicitly declared,
     * {@code null} is returned.
     *
     * @return the lower bound of this wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/WildcardType.java
    TypeMirror getExtendsBound();

    /**
     * Returns the upper bound of this wildcard.
     * If no upper bound is explicitly declared,
     * {@code null} is returned.
     *
     * @return the upper bound of this wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/WildcardType.java
public interface WildcardType extends TypeMirror {

/**
 * Represents a wildcard type argument.
 * Examples include:    <pre><tt>
 *   ?
 *   ? extends Number
 *   ? super T
 * </tt></pre>
 *
 * <p> A wildcard may have its upper bound explicitly set by an
 * {@code extends} clause, its lower bound explicitly set by a
 * {@code super} clause, or neither (but not both).
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
