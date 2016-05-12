_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerNotActiveException.java
    public ServerNotActiveException(String s)

    /**
     * Constructs an <code>ServerNotActiveException</code> with the specified
     * detail message.
     *
     * @param s the detail message.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerNotActiveException.java
    public ServerNotActiveException() {}

    /**
     * Constructs an <code>ServerNotActiveException</code> with no specified
     * detail message.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerNotActiveException.java
public class ServerNotActiveException extends java.lang.Exception {

/**
 * An <code>ServerNotActiveException</code> is an <code>Exception</code>
 * thrown during a call to <code>RemoteServer.getClientHost</code> if
 * the getClientHost method is called outside of servicing a remote
 * method call.
 *
 * @author  Roger Riggs
 * @since   JDK1.1
 * @see java.rmi.server.RemoteServer#getClientHost()
 */
