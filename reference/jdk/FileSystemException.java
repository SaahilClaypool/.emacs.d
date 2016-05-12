_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileSystemException.java
    @Override

    /**
     * Returns the detail message string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileSystemException.java
    public String getReason() {

    /**
     * Returns the string explaining why the file system operation failed.
     *
     * @return  the string explaining why the file system operation failed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileSystemException.java
    public String getOtherFile() {

    /**
     * Returns the other file used to create this exception.
     *
     * @return  the other file (can be {@code null})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileSystemException.java
    public String getFile() {

    /**
     * Returns the file used to create this exception.
     *
     * @return  the file (can be {@code null})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileSystemException.java
    public FileSystemException(String file, String other, String reason) {

    /**
     * Constructs an instance of this class. This constructor should be used
     * when an operation involving two files fails, or there is additional
     * information to explain the reason.
     *
     * @param   file
     *          a string identifying the file or {@code null} if not known.
     * @param   other
     *          a string identifying the other file or {@code null} if there
     *          isn't another file or if not known
     * @param   reason
     *          a reason message with additional information or {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileSystemException.java
    public FileSystemException(String file) {

    /**
     * Constructs an instance of this class. This constructor should be used
     * when an operation involving one file fails and there isn't any additional
     * information to explain the reason.
     *
     * @param   file
     *          a string identifying the file or {@code null} if not known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/FileSystemException.java
public class FileSystemException

/**
 * Thrown when a file system operation fails on one or two files. This class is
 * the general class for file system exceptions.
 *
 * @since 1.7
 */
