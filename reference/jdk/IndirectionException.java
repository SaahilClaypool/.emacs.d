_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/IndirectionException.java
    public IndirectionException(int offset){

    /**
     * Creates an IndirectionException with the right offset value.
     * The stream offset is returned in the exception's offset field.
     * This exception is constructed and thrown during reading
     * recursively defined values off of a stream.
     *
     * @param offset the stream offset where recursion is detected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/IndirectionException.java
    public int offset;

    /**
     * Points to the stream's offset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/IndirectionException.java
public class IndirectionException extends SystemException {

/**
 * The Indirection exception is a Java specific system exception.
 * It is thrown when the ORB's input stream is called to demarshal
 * a value that is encoded as an indirection that is in the process
 * of being demarshaled. This can occur when the ORB input stream
 * calls the ValueHandler to demarshal an RMI value whose state
 * contains a recursive reference to itself. Because the top-level
 * ValueHandler.read_value() call has not yet returned a value,
 * the ORB input stream's indirection table does not contain an entry
 * for an object with the stream offset specified by the indirection
 * tag. The stream offset is returned in the exception's offset field.
 * @see org.omg.CORBA_2_3.portable.InputStream
 * @see org.omg.CORBA_2_3.portable.OutputStream
 */
