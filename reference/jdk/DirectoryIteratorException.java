_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/DirectoryIteratorException.java
    private void readObject(ObjectInputStream s)

    /**
     * Called to read the object from a stream.
     *
     * @throws  InvalidObjectException
     *          if the object is invalid or has a cause that is not
     *          an {@code IOException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/DirectoryIteratorException.java
    @Override

    /**
     * Returns the cause of this exception.
     *
     * @return  the cause
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/DirectoryIteratorException.java
    public DirectoryIteratorException(IOException cause) {

    /**
     * Constructs an instance of this class.
     *
     * @param   cause
     *          the {@code IOException} that caused the directory iteration
     *          to fail
     *
     * @throws  NullPointerException
     *          if the cause is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/DirectoryIteratorException.java
public final class DirectoryIteratorException

/**
 * Runtime exception thrown if an I/O error is encountered when iterating over
 * the entries in a directory. The I/O error is retrieved as an {@link
 * IOException} using the {@link #getCause() getCause()} method.
 *
 * @since 1.7
 * @see DirectoryStream
 */
