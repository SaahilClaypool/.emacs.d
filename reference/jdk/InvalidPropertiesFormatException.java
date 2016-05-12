_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/InvalidPropertiesFormatException.java
    private void readObject(java.io.ObjectInputStream in)

    /**
     * Throws NotSerializableException, since InvalidPropertiesFormatException
     * objects are not intended to be serializable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/InvalidPropertiesFormatException.java
    private void writeObject(java.io.ObjectOutputStream out)

    /**
     * Throws NotSerializableException, since InvalidPropertiesFormatException
     * objects are not intended to be serializable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/InvalidPropertiesFormatException.java
    public InvalidPropertiesFormatException(String message) {

   /**
    * Constructs an InvalidPropertiesFormatException with the specified
    * detail message.
    *
    * @param   message   the detail message. The detail message is saved for
    *          later retrieval by the {@link Throwable#getMessage()} method.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/InvalidPropertiesFormatException.java
    public InvalidPropertiesFormatException(Throwable cause) {

    /**
     * Constructs an InvalidPropertiesFormatException with the specified
     * cause.
     *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link Throwable#getCause()} method).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/InvalidPropertiesFormatException.java
public class InvalidPropertiesFormatException extends IOException {

/**
 * Thrown to indicate that an operation could not complete because
 * the input did not conform to the appropriate XML document type
 * for a collection of properties, as per the {@link Properties}
 * specification.<p>
 *
 * Note, that although InvalidPropertiesFormatException inherits Serializable
 * interface from Exception, it is not intended to be Serializable. Appropriate
 * serialization methods are implemented to throw NotSerializableException.
 *
 * @see     Properties
 * @since   1.5
 * @serial exclude
 */
