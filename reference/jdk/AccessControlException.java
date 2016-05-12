_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlException.java
    public Permission getPermission() {

    /**
     * Gets the Permission object associated with this exception, or
     * null if there was no corresponding Permission object.
     *
     * @return the Permission object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlException.java
    public AccessControlException(String s, Permission p) {

    /**
     * Constructs an {@code AccessControlException} with the
     * specified, detailed message, and the requested permission that caused
     * the exception.
     *
     * @param   s   the detail message.
     * @param   p   the permission that caused the exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlException.java
    public AccessControlException(String s) {

    /**
     * Constructs an {@code AccessControlException} with the
     * specified, detailed message.
     *
     * @param   s   the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/AccessControlException.java
public class AccessControlException extends SecurityException {

/**
 * <p> This exception is thrown by the AccessController to indicate
 * that a requested access (to a critical system resource such as the
 * file system or the network) is denied.
 *
 * <p> The reason to deny access can vary.  For example, the requested
 * permission might be of an incorrect type,  contain an invalid
 * value, or request access that is not allowed according to the
 * security policy.  Such information should be given whenever
 * possible at the time the exception is thrown.
 *
 * @author Li Gong
 * @author Roland Schemers
 */
