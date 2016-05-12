_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/InvalidTargetObjectTypeException.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes an {@link InvalidTargetObjectTypeException} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/InvalidTargetObjectTypeException.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes an {@link InvalidTargetObjectTypeException} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/InvalidTargetObjectTypeException.java
    public InvalidTargetObjectTypeException (Exception e, String s)

    /**
     * Constructor taking an exception and a string.
     *
     * @param e Exception that we may have caught to reissue as an
     *    InvalidTargetObjectTypeException.  The message will be used, and we may want to
     *    consider overriding the printStackTrace() methods to get data
     *    pointing back to original throw stack.
     * @param s String value that will be incorporated in message for
     *    this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/InvalidTargetObjectTypeException.java
    public InvalidTargetObjectTypeException (String s)

    /**
     * Constructor from a string.
     *
     * @param s String value that will be incorporated in the message for
     *    this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/InvalidTargetObjectTypeException.java
    public InvalidTargetObjectTypeException ()

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/InvalidTargetObjectTypeException.java
    Exception exception;

    /**
     * @serial Encapsulated {@link Exception}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/InvalidTargetObjectTypeException.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField exception Exception Encapsulated {@link Exception}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/modelmbean/InvalidTargetObjectTypeException.java
@SuppressWarnings("serial")  // serialVersionUID not constant

/**
 * Exception thrown when an invalid target object type is specified.
 *
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>1190536278266811217L</code>.
 *
 * @since 1.5
 */
