_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/OptionalDataException.java
    public boolean eof;

    /**
     * True if there is no more data in the buffered part of the stream.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/OptionalDataException.java
    public int length;

    /**
     * The number of bytes of primitive data available to be read
     * in the current buffer.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/OptionalDataException.java
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
