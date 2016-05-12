_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/AnnotationMirror.java
    Map<? extends ExecutableElement, ? extends AnnotationValue> getElementValues();

    /**
     * Returns the values of this annotation's elements.
     * This is returned in the form of a map that associates elements
     * with their corresponding values.
     * Only those elements with values explicitly present in the
     * annotation are included, not those that are implicitly assuming
     * their default values.
     * The order of the map matches the order in which the
     * values appear in the annotation's source.
     *
     * <p>Note that an annotation mirror of a marker annotation type
     * will by definition have an empty map.
     *
     * <p>To fill in default values, use {@link
     * javax.lang.model.util.Elements#getElementValuesWithDefaults
     * getElementValuesWithDefaults}.
     *
     * @return the values of this annotation's elements,
     *          or an empty map if there are none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/AnnotationMirror.java
    DeclaredType getAnnotationType();

    /**
     * Returns the type of this annotation.
     *
     * @return the type of this annotation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/AnnotationMirror.java
public interface AnnotationMirror {

/**
 * Represents an annotation.  An annotation associates a value with
 * each element of an annotation type.
 *
 * <p> Annotations should be compared using the {@code equals}
 * method.  There is no guarantee that any particular annotation will
 * always be represented by the same object.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
