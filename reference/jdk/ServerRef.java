_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerRef.java
    String getClientHost() throws ServerNotActiveException;

    /**
     * Returns the hostname of the current client.  When called from a
     * thread actively handling a remote method invocation the
     * hostname of the client is returned.
     * @return the client's host name
     * @exception ServerNotActiveException if called outside of servicing
     * a remote method invocation
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerRef.java
    RemoteStub exportObject(Remote obj, Object data)

    /**
     * Creates a client stub object for the supplied Remote object.
     * If the call completes successfully, the remote object should
     * be able to accept incoming calls from clients.
     * @param obj the remote object implementation
     * @param data information necessary to export the object
     * @return the stub for the remote object
     * @exception RemoteException if an exception occurs attempting
     * to export the object (e.g., stub class could not be found)
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerRef.java
    static final long serialVersionUID = -4557750989390278438L;

    /** indicate compatibility with JDK 1.1.x version of class. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/server/ServerRef.java
@Deprecated

/**
 * A ServerRef represents the server-side handle for a remote object
 * implementation.
 *
 * @author  Ann Wollrath
 * @since   JDK1.1
 * @deprecated No replacement. This interface is unused and is obsolete.
 */
