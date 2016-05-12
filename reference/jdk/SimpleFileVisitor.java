_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/SimpleFileVisitor.java
    @Override

    /**
     * Invoked for a directory after entries in the directory, and all of their
     * descendants, have been visited.
     *
     * <p> Unless overridden, this method returns {@link FileVisitResult#CONTINUE
     * CONTINUE} if the directory iteration completes without an I/O exception;
     * otherwise this method re-throws the I/O exception that caused the iteration
     * of the directory to terminate prematurely.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/SimpleFileVisitor.java
    @Override

    /**
     * Invoked for a file that could not be visited.
     *
     * <p> Unless overridden, this method re-throws the I/O exception that prevented
     * the file from being visited.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/SimpleFileVisitor.java
    @Override

    /**
     * Invoked for a file in a directory.
     *
     * <p> Unless overridden, this method returns {@link FileVisitResult#CONTINUE
     * CONTINUE}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/SimpleFileVisitor.java
    @Override

    /**
     * Invoked for a directory before entries in the directory are visited.
     *
     * <p> Unless overridden, this method returns {@link FileVisitResult#CONTINUE
     * CONTINUE}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/SimpleFileVisitor.java
public class SimpleFileVisitor<T> implements FileVisitor<T> {

/**
 * A simple visitor of files with default behavior to visit all files and to
 * re-throw I/O errors.
 *
 * <p> Methods in this class may be overridden subject to their general contract.
 *
 * @param   <T>     The type of reference to the files
 *
 * @since 1.7
 */
