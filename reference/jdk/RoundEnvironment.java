_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/RoundEnvironment.java
    Set<? extends Element> getElementsAnnotatedWith(Class<? extends Annotation> a);

    /**
     * Returns the elements annotated with the given annotation type.
     * The annotation may appear directly or be inherited.  Only
     * package elements and type elements <i>included</i> in this
     * round of annotation processing, or declarations of members,
     * constructors, parameters, or type parameters declared within
     * those, are returned.  Included type elements are {@linkplain
     * #getRootElements root types} and any member types nested within
     * them.  Elements in a package are not considered included simply
     * because a {@code package-info} file for that package was
     * created.
     *
     * @param a  annotation type being requested
     * @return the elements annotated with the given annotation type,
     * or an empty set if there are none
     * @throws IllegalArgumentException if the argument does not
     * represent an annotation type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/RoundEnvironment.java
    Set<? extends Element> getElementsAnnotatedWith(TypeElement a);

    /**
     * Returns the elements annotated with the given annotation type.
     * The annotation may appear directly or be inherited.  Only
     * package elements and type elements <i>included</i> in this
     * round of annotation processing, or declarations of members,
     * constructors, parameters, or type parameters declared within
     * those, are returned.  Included type elements are {@linkplain
     * #getRootElements root types} and any member types nested within
     * them.  Elements in a package are not considered included simply
     * because a {@code package-info} file for that package was
     * created.
     *
     * @param a  annotation type being requested
     * @return the elements annotated with the given annotation type,
     * or an empty set if there are none
     * @throws IllegalArgumentException if the argument does not
     * represent an annotation type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/RoundEnvironment.java
    Set<? extends Element> getRootElements();

    /**
     * Returns the root elements for annotation processing generated
     * by the prior round.
     *
     * @return the root elements for annotation processing generated
     * by the prior round, or an empty set if there were none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/RoundEnvironment.java
    boolean errorRaised();

    /**
     * Returns {@code true} if an error was raised in the prior round
     * of processing; returns {@code false} otherwise.
     *
     * @return {@code true} if an error was raised in the prior round
     * of processing; returns {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/RoundEnvironment.java
public interface RoundEnvironment {

/**
 * An annotation processing tool framework will {@linkplain
 * Processor#process provide an annotation processor with an object
 * implementing this interface} so that the processor can query for
 * information about a round of annotation processing.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
