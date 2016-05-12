_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/UnknownAnnotationValueException.java
    public Object getArgument() {

    /**
     * Returns the additional argument.
     *
     * @return the additional argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/UnknownAnnotationValueException.java
    public AnnotationValue getUnknownAnnotationValue() {

    /**
     * Returns the unknown annotation value.
     * The value may be unavailable if this exception has been
     * serialized and then read back in.
     *
     * @return the unknown element, or {@code null} if unavailable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/UnknownAnnotationValueException.java
    public UnknownAnnotationValueException(AnnotationValue av, Object p) {

    /**
     * Creates a new {@code UnknownAnnotationValueException}.  The
     * {@code p} parameter may be used to pass in an additional
     * argument with information about the context in which the
     * unknown annotation value was encountered; for example, the
     * visit methods of {@link AnnotationValueVisitor} may pass in
     * their additional parameter.
     *
     * @param av the unknown annotation value, may be {@code null}
     * @param p an additional parameter, may be {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/element/UnknownAnnotationValueException.java
public class UnknownAnnotationValueException extends UnknownEntityException {

/**
 * Indicates that an unknown kind of annotation value was encountered.
 * This can occur if the language evolves and new kinds of annotation
 * values can be stored in an annotation.  May be thrown by an
 * {@linkplain AnnotationValueVisitor annotation value visitor} to
 * indicate that the visitor was created for a prior version of the
 * language.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see AnnotationValueVisitor#visitUnknown
 * @since 1.6
 */
