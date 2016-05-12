_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/UnexpectedException.java
    public UnexpectedException(String s, Exception ex) {

    /**
     * Constructs a <code>UnexpectedException</code> with the specified
     * detail message and nested exception.
     *
     * @param s the detail message
     * @param ex the nested exception
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/UnexpectedException.java
    public UnexpectedException(String s) {

    /**
     * Constructs an <code>UnexpectedException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/UnexpectedException.java
public class UnexpectedException extends RemoteException {

/**
 * An <code>UnexpectedException</code> is thrown if the client of a
 * remote method call receives, as a result of the call, a checked
 * exception that is not among the checked exception types declared in the
 * <code>throws</code> clause of the method in the remote interface.
 *
 * @author  Roger Riggs
 * @since   JDK1.1
 */
