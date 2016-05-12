_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/AccessDeniedException.java
    public AccessDeniedException(String file, String other, String reason) {

    /**
     * Constructs an instance of this class.
     *
     * @param   file
     *          a string identifying the file or {@code null} if not known
     * @param   other
     *          a string identifying the other file or {@code null} if not known
     * @param   reason
     *          a reason message with additional information or {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/AccessDeniedException.java
    public AccessDeniedException(String file) {

    /**
     * Constructs an instance of this class.
     *
     * @param   file
     *          a string identifying the file or {@code null} if not known
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/file/AccessDeniedException.java
public class AccessDeniedException

/**
 * Checked exception thrown when a file system operation is denied, typically
 * due to a file permission or other access check.
 *
 * <p> This exception is not related to the {@link
 * java.security.AccessControlException AccessControlException} or {@link
 * SecurityException} thrown by access controllers or security managers when
 * access to a file is denied.
 *
 * @since 1.7
 */
