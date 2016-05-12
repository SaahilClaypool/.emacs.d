_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/UnknownTypeException.java
    public Object getArgument() {

    /**
     * Returns the additional argument.
     *
     * @return the additional argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/UnknownTypeException.java
    public TypeMirror getUnknownType() {

    /**
     * Returns the unknown type.
     * The value may be unavailable if this exception has been
     * serialized and then read back in.
     *
     * @return the unknown type, or {@code null} if unavailable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/UnknownTypeException.java
    public UnknownTypeException(TypeMirror t, Object p) {

    /**
     * Creates a new {@code UnknownTypeException}.The {@code p}
     * parameter may be used to pass in an additional argument with
     * information about the context in which the unknown type was
     * encountered; for example, the visit methods of {@link
     * TypeVisitor} may pass in their additional parameter.
     *
     * @param t the unknown type, may be {@code null}
     * @param p an additional parameter, may be {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/UnknownTypeException.java
public class UnknownTypeException extends UnknownEntityException {

/**
 * Indicates that an unknown kind of type was encountered.  This can
 * occur if the language evolves and new kinds of types are added to
 * the {@code TypeMirror} hierarchy.  May be thrown by a {@linkplain
 * TypeVisitor type visitor} to indicate that the visitor was created
 * for a prior version of the language.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see TypeVisitor#visitUnknown
 * @since 1.6
 */
