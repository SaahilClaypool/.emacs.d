_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/MirroredTypeException.java
    private void readObject(ObjectInputStream s)

    /**
     * Explicitly set all transient fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/MirroredTypeException.java
    public TypeMirror getTypeMirror() {

    /**
     * Returns the type mirror corresponding to the type being accessed.
     * The type mirror may be unavailable if this exception has been
     * serialized and then read back in.
     *
     * @return the type mirror, or {@code null} if unavailable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/MirroredTypeException.java
    public MirroredTypeException(TypeMirror type) {

    /**
     * Constructs a new MirroredTypeException for the specified type.
     *
     * @param type  the type being accessed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/lang/model/type/MirroredTypeException.java
public class MirroredTypeException extends MirroredTypesException {

/**
 * Thrown when an application attempts to access the {@link Class} object
 * corresponding to a {@link TypeMirror}.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see MirroredTypesException
 * @see Element#getAnnotation(Class)
 * @since 1.6
 */
