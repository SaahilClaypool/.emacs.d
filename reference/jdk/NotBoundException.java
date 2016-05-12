_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/NotBoundException.java
    public NotBoundException(String s) {

    /**
     * Constructs a <code>NotBoundException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/NotBoundException.java
    public NotBoundException() {

    /**
     * Constructs a <code>NotBoundException</code> with no
     * specified detail message.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/NotBoundException.java
public class NotBoundException extends java.lang.Exception {

/**
 * A <code>NotBoundException</code> is thrown if an attempt
 * is made to lookup or unbind in the registry a name that has
 * no associated binding.
 *
 * @since   JDK1.1
 * @author  Ann Wollrath
 * @author  Roger Riggs
 * @see     java.rmi.Naming#lookup(String)
 * @see     java.rmi.Naming#unbind(String)
 * @see     java.rmi.registry.Registry#lookup(String)
 * @see     java.rmi.registry.Registry#unbind(String)
 */
