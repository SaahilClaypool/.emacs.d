_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/AnnotationDesc.java
        AnnotationValue value();

        /**
         * Returns the value associated with the annotation type element.
         *
         * @return the value associated with the annotation type element.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/AnnotationDesc.java
        AnnotationTypeElementDoc element();

        /**
         * Returns the annotation type element.
         *
         * @return the annotation type element.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/AnnotationDesc.java
    public interface ElementValuePair {

    /**
     * Represents an association between an annotation type element
     * and one of its values.
     *
     * @author Scott Seligman
     * @since 1.5
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/AnnotationDesc.java
    boolean isSynthesized();

    /**
     * Check for the synthesized bit on the annotation.
     *
     * @return true if the annotation is synthesized.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/AnnotationDesc.java
    ElementValuePair[] elementValues();

    /**
     * Returns this annotation's elements and their values.
     * Only those explicitly present in the annotation are
     * included, not those assuming their default values.
     * Returns an empty array if there are none.
     *
     * @return this annotation's elements and their values.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/AnnotationDesc.java
    AnnotationTypeDoc annotationType();

    /**
     * Returns the annotation type of this annotation.
     *
     * @return the annotation type of this annotation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/javadoc/AnnotationDesc.java
public interface AnnotationDesc {

/**
 * Represents an annotation.
 * An annotation associates a value with each element of an annotation type.
 *
 * @author Scott Seligman
 * @since 1.5
 */
