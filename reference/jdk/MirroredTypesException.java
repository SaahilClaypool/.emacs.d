_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/MirroredTypesException.java
    private void readObject(ObjectInputStream s)

    /**
     * Explicitly set all transient fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/MirroredTypesException.java
    public List<? extends TypeMirror> getTypeMirrors() {

    /**
     * Returns the type mirrors corresponding to the types being accessed.
     * The type mirrors may be unavailable if this exception has been
     * serialized and then read back in.
     *
     * @return the type mirrors in construction order, or {@code null} if unavailable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/MirroredTypesException.java
    public MirroredTypesException(List<? extends TypeMirror> types) {

    /**
     * Constructs a new MirroredTypesException for the specified types.
     *
     * @param types  the types being accessed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/MirroredTypesException.java
public class MirroredTypesException extends RuntimeException {

/**
 * Thrown when an application attempts to access a sequence of {@link
 * Class} objects each corresponding to a {@link TypeMirror}.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see MirroredTypeException
 * @see Element#getAnnotation(Class)
 * @since 1.6
 */
