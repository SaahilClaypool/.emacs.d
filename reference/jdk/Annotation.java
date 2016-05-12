_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/Annotation.java
    Class<? extends Annotation> annotationType();

    /**
     * Returns the annotation type of this annotation.
     * @return the annotation type of this annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/Annotation.java
    String toString();

    /**
     * Returns a string representation of this annotation.  The details
     * of the representation are implementation-dependent, but the following
     * may be regarded as typical:
     * <pre>
     *   &#064;com.acme.util.Name(first=Alfred, middle=E., last=Neuman)
     * </pre>
     *
     * @return a string representation of this annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/Annotation.java
    int hashCode();

    /**
     * Returns the hash code of this annotation, as defined below:
     *
     * <p>The hash code of an annotation is the sum of the hash codes
     * of its members (including those with default values), as defined
     * below:
     *
     * The hash code of an annotation member is (127 times the hash code
     * of the member-name as computed by {@link String#hashCode()}) XOR
     * the hash code of the member-value, as defined below:
     *
     * <p>The hash code of a member-value depends on its type:
     * <ul>
     * <li>The hash code of a primitive value <tt><i>v</i></tt> is equal to
     *     <tt><i>WrapperType</i>.valueOf(<i>v</i>).hashCode()</tt>, where
     *     <tt><i>WrapperType</i></tt> is the wrapper type corresponding
     *     to the primitive type of <tt><i>v</i></tt> ({@link Byte},
     *     {@link Character}, {@link Double}, {@link Float}, {@link Integer},
     *     {@link Long}, {@link Short}, or {@link Boolean}).
     *
     * <li>The hash code of a string, enum, class, or annotation member-value
     I     <tt><i>v</i></tt> is computed as by calling
     *     <tt><i>v</i>.hashCode()</tt>.  (In the case of annotation
     *     member values, this is a recursive definition.)
     *
     * <li>The hash code of an array member-value is computed by calling
     *     the appropriate overloading of
     *     {@link java.util.Arrays#hashCode(long[]) Arrays.hashCode}
     *     on the value.  (There is one overloading for each primitive
     *     type, and one for object reference types.)
     * </ul>
     *
     * @return the hash code of this annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/Annotation.java
public interface Annotation {

/**
 * The common interface extended by all annotation types.  Note that an
 * interface that manually extends this one does <i>not</i> define
 * an annotation type.  Also note that this interface does not itself
 * define an annotation type.
 *
 * More information about annotation types can be found in section 9.6 of
 * <cite>The Java&trade; Language Specification</cite>.
 *
 * The {@link java.lang.reflect.AnnotatedElement} interface discusses
 * compatibility concerns when evolving an annotation type from being
 * non-repeatable to being repeatable.
 *
 * @author  Josh Bloch
 * @since   1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/Annotation.java
    Class<? extends Annotation> annotationType();

    /**
     * Returns the annotation type of this annotation.
     * @return the annotation type of this annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/Annotation.java
    String toString();

    /**
     * Returns a string representation of this annotation.  The details
     * of the representation are implementation-dependent, but the following
     * may be regarded as typical:
     * <pre>
     *   &#064;com.acme.util.Name(first=Alfred, middle=E., last=Neuman)
     * </pre>
     *
     * @return a string representation of this annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/Annotation.java
    int hashCode();

    /**
     * Returns the hash code of this annotation, as defined below:
     *
     * <p>The hash code of an annotation is the sum of the hash codes
     * of its members (including those with default values), as defined
     * below:
     *
     * The hash code of an annotation member is (127 times the hash code
     * of the member-name as computed by {@link String#hashCode()}) XOR
     * the hash code of the member-value, as defined below:
     *
     * <p>The hash code of a member-value depends on its type:
     * <ul>
     * <li>The hash code of a primitive value <tt><i>v</i></tt> is equal to
     *     <tt><i>WrapperType</i>.valueOf(<i>v</i>).hashCode()</tt>, where
     *     <tt><i>WrapperType</i></tt> is the wrapper type corresponding
     *     to the primitive type of <tt><i>v</i></tt> ({@link Byte},
     *     {@link Character}, {@link Double}, {@link Float}, {@link Integer},
     *     {@link Long}, {@link Short}, or {@link Boolean}).
     *
     * <li>The hash code of a string, enum, class, or annotation member-value
     I     <tt><i>v</i></tt> is computed as by calling
     *     <tt><i>v</i>.hashCode()</tt>.  (In the case of annotation
     *     member values, this is a recursive definition.)
     *
     * <li>The hash code of an array member-value is computed by calling
     *     the appropriate overloading of
     *     {@link java.util.Arrays#hashCode(long[]) Arrays.hashCode}
     *     on the value.  (There is one overloading for each primitive
     *     type, and one for object reference types.)
     * </ul>
     *
     * @return the hash code of this annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/annotation/Annotation.java
public interface Annotation {

/**
 * The common interface extended by all annotation types.  Note that an
 * interface that manually extends this one does <i>not</i> define
 * an annotation type.  Also note that this interface does not itself
 * define an annotation type.
 *
 * More information about annotation types can be found in section 9.6 of
 * <cite>The Java&trade; Language Specification</cite>.
 *
 * The {@link java.lang.reflect.AnnotatedElement} interface discusses
 * compatibility concerns when evolving an annotation type from being
 * non-repeatable to being repeatable.
 *
 * @author  Josh Bloch
 * @since   1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/Annotation.java
    public String toString() {

    /**
     * Returns the String representation of this Annotation.
     *
     * @return the {@code String} representation of this {@code Annotation}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/Annotation.java
    public Object getValue() {

    /**
     * Returns the value of the attribute, which may be null.
     *
     * @return the value of the attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/Annotation.java
    public Annotation(Object value) {

    /**
     * Constructs an annotation record with the given value, which
     * may be null.
     *
     * @param value the value of the attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/Annotation.java
public class Annotation {

/**
* An Annotation object is used as a wrapper for a text attribute value if
* the attribute has annotation characteristics. These characteristics are:
* <ul>
* <li>The text range that the attribute is applied to is critical to the
* semantics of the range. That means, the attribute cannot be applied to subranges
* of the text range that it applies to, and, if two adjacent text ranges have
* the same value for this attribute, the attribute still cannot be applied to
* the combined range as a whole with this value.
* <li>The attribute or its value usually do no longer apply if the underlying text is
* changed.
* </ul>
*
* An example is grammatical information attached to a sentence:
* For the previous sentence, you can say that "an example"
* is the subject, but you cannot say the same about "an", "example", or "exam".
* When the text is changed, the grammatical information typically becomes invalid.
* Another example is Japanese reading information (yomi).
*
* <p>
* Wrapping the attribute value into an Annotation object guarantees that
* adjacent text runs don't get merged even if the attribute values are equal,
* and indicates to text containers that the attribute should be discarded if
* the underlying text is modified.
*
* @see AttributedCharacterIterator
* @since 1.2
*/
