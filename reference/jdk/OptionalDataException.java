_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/OptionalDataException.java
    public boolean eof;

    /**
     * True if there is no more data in the buffered part of the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/OptionalDataException.java
    public int length;

    /**
     * The number of bytes of primitive data available to be read
     * in the current buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/OptionalDataException.java
public class OptionalDataException extends java.io.IOException {

/**
 * Unexpected data appeared in an ObjectInputStream trying to read
 * an Object.
 * This exception occurs when the stream contains primitive data
 * instead of the object expected by readObject.
 * The eof flag in the exception is true to indicate that no more
 * primitive data is available.
 * The count field contains the number of bytes available to read.
 *
 * @author  unascribed
 * @since   JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OptionalDataException.java
    public boolean eof;

    /**
     * True if there is no more data in the buffered part of the stream.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OptionalDataException.java
    public int length;

    /**
     * The number of bytes of primitive data available to be read
     * in the current buffer.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OptionalDataException.java
public class OptionalDataException extends ObjectStreamException {

/**
 * Exception indicating the failure of an object read operation due to
 * unread primitive data, or the end of data belonging to a serialized
 * object in the stream.  This exception may be thrown in two cases:
 *
 * <ul>
 *   <li>An attempt was made to read an object when the next element in the
 *       stream is primitive data.  In this case, the OptionalDataException's
 *       length field is set to the number of bytes of primitive data
 *       immediately readable from the stream, and the eof field is set to
 *       false.
 *
 *   <li>An attempt was made to read past the end of data consumable by a
 *       class-defined readObject or readExternal method.  In this case, the
 *       OptionalDataException's eof field is set to true, and the length field
 *       is set to 0.
 * </ul>
 *
 * @author  unascribed
 * @since   JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/OptionalDataException.java
    public boolean eof;

    /**
     * True if there is no more data in the buffered part of the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/OptionalDataException.java
    public int length;

    /**
     * The number of bytes of primitive data available to be read
     * in the current buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/io/OptionalDataException.java
public class OptionalDataException extends java.io.IOException {

/**
 * Unexpected data appeared in an ObjectInputStream trying to read
 * an Object.
 * This exception occurs when the stream contains primitive data
 * instead of the object expected by readObject.
 * The eof flag in the exception is true to indicate that no more
 * primitive data is available.
 * The count field contains the number of bytes available to read.
 *
 * @author  unascribed
 * @since   JDK1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OptionalDataException.java
    public boolean eof;

    /**
     * True if there is no more data in the buffered part of the stream.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OptionalDataException.java
    public int length;

    /**
     * The number of bytes of primitive data available to be read
     * in the current buffer.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/io/OptionalDataException.java
public class OptionalDataException extends ObjectStreamException {

/**
 * Exception indicating the failure of an object read operation due to
 * unread primitive data, or the end of data belonging to a serialized
 * object in the stream.  This exception may be thrown in two cases:
 *
 * <ul>
 *   <li>An attempt was made to read an object when the next element in the
 *       stream is primitive data.  In this case, the OptionalDataException's
 *       length field is set to the number of bytes of primitive data
 *       immediately readable from the stream, and the eof field is set to
 *       false.
 *
 *   <li>An attempt was made to read past the end of data consumable by a
 *       class-defined readObject or readExternal method.  In this case, the
 *       OptionalDataException's eof field is set to true, and the length field
 *       is set to 0.
 * </ul>
 *
 * @author  unascribed
 * @since   JDK1.1
 */
