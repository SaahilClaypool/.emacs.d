_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXServerErrorException.java
    private final Error cause;

    /**
     * @serial An {@link Error} that caused this exception to be thrown.
     * @see #getCause()
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXServerErrorException.java
    public JMXServerErrorException(String s, Error err) {

    /**
     * Constructs a <code>JMXServerErrorException</code> with the specified
     * detail message and nested error.
     *
     * @param s the detail message.
     * @param err the nested error.  An instance of this class can be
     * constructed where this parameter is null, but the standard
     * connectors will never do so.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXServerErrorException.java
public class JMXServerErrorException extends IOException {

/**
 * Exception thrown as the result of a remote {@link MBeanServer}
 * method invocation when an <code>Error</code> is thrown while
 * processing the invocation in the remote MBean server.  A
 * <code>JMXServerErrorException</code> instance contains the original
 * <code>Error</code> that occurred as its cause.
 *
 * @see java.rmi.ServerError
 * @since 1.5
 */
