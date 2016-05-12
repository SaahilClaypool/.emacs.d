_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/AccessException.java
    public AccessException(String s, Exception ex) {

    /**
     * Constructs an <code>AccessException</code> with the specified
     * detail message and nested exception.
     *
     * @param s the detail message
     * @param ex the nested exception
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/AccessException.java
    public AccessException(String s) {

    /**
     * Constructs an <code>AccessException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/AccessException.java
public class AccessException extends java.rmi.RemoteException {

/**
 * An <code>AccessException</code> is thrown by certain methods of the
 * <code>java.rmi.Naming</code> class (specifically <code>bind</code>,
 * <code>rebind</code>, and <code>unbind</code>) and methods of the
 * <code>java.rmi.activation.ActivationSystem</code> interface to
 * indicate that the caller does not have permission to perform the action
 * requested by the method call.  If the method was invoked from a non-local
 * host, then an <code>AccessException</code> is thrown.
 *
 * @author  Ann Wollrath
 * @author  Roger Riggs
 * @since   JDK1.1
 * @see     java.rmi.Naming
 * @see     java.rmi.activation.ActivationSystem
 */
