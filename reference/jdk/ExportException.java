_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ExportException.java
    public ExportException(String s, Exception ex) {

    /**
     * Constructs an <code>ExportException</code> with the specified
     * detail message and nested exception.
     *
     * @param s the detail message
     * @param ex the nested exception
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ExportException.java
    public ExportException(String s) {

    /**
     * Constructs an <code>ExportException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ExportException.java
public class ExportException extends java.rmi.RemoteException {

/**
 * An <code>ExportException</code> is a <code>RemoteException</code>
 * thrown if an attempt to export a remote object fails.  A remote object is
 * exported via the constructors and <code>exportObject</code> methods of
 * <code>java.rmi.server.UnicastRemoteObject</code> and
 * <code>java.rmi.activation.Activatable</code>.
 *
 * @author  Ann Wollrath
 * @since   JDK1.1
 * @see java.rmi.server.UnicastRemoteObject
 * @see java.rmi.activation.Activatable
 */
