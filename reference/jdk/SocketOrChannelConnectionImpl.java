_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public void sendCancelRequest(GIOPVersion giopVersion, int requestId)

    /**
     * Send a CancelRequest message. This does not lock the connection, so the
     * caller needs to ensure this method is called appropriately.
     * @exception IOException - could be due to abortive connection closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public void sendCloseConnection(GIOPVersion giopVersion)

    /*************************************************************************
    * The following methods are for dealing with Connection cleaning for
    * better scalability of servers in high network load conditions.
    **************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public void purgeCalls(SystemException systemException,
                           boolean die, boolean lockHeld)

    /**
     * Wake up the outstanding requests on the connection, and hand them
     * COMM_FAILURE exception with a given minor code.
     *
     * Also, delete connection from connection table and
     * stop the reader thread.

     * Note that this should only ever be called by the Reader thread for
     * this connection.
     *
     * @param minor_code The minor code for the COMM_FAILURE major code.
     * @param die Kill the reader thread (this thread) before exiting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public synchronized void serverRequestProcessingBegins()

    /** It is possible for a Close Connection to have been
     ** sent here, but we will not check for this. A "lazy"
     ** Exception will be thrown in the Worker thread after the
     ** incoming request has been processed even though the connection
     ** is closed before the request is processed. This is o.k because
     ** it is a boundary condition. To prevent it we would have to add
     ** more locks which would reduce performance in the normal case.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    //

    ////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    //

    ////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    //

    ////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public void writeLock()

    /**
     * Sets the writeLock for this connection.
     * If the writeLock is already set by someone else, block till the
     * writeLock is released and can set by us.
     * IMPORTANT: this connection's lock must be acquired before
     * setting the writeLock and must be unlocked after setting the writeLock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public synchronized void close()

    /**
     * Note:it is possible for this to be called more than once
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    //

    ////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
public class SocketOrChannelConnectionImpl

/**
 * @author Harold Carr
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public void sendCancelRequest(GIOPVersion giopVersion, int requestId)

    /**
     * Send a CancelRequest message. This does not lock the connection, so the
     * caller needs to ensure this method is called appropriately.
     * @exception IOException - could be due to abortive connection closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public void sendCloseConnection(GIOPVersion giopVersion)

    /*************************************************************************
    * The following methods are for dealing with Connection cleaning for
    * better scalability of servers in high network load conditions.
    **************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public void purgeCalls(SystemException systemException,
                           boolean die, boolean lockHeld)

    /**
     * Wake up the outstanding requests on the connection, and hand them
     * COMM_FAILURE exception with a given minor code.
     *
     * Also, delete connection from connection table and
     * stop the reader thread.

     * Note that this should only ever be called by the Reader thread for
     * this connection.
     *
     * @param minor_code The minor code for the COMM_FAILURE major code.
     * @param die Kill the reader thread (this thread) before exiting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public synchronized void serverRequestProcessingBegins()

    /** It is possible for a Close Connection to have been
     ** sent here, but we will not check for this. A "lazy"
     ** Exception will be thrown in the Worker thread after the
     ** incoming request has been processed even though the connection
     ** is closed before the request is processed. This is o.k because
     ** it is a boundary condition. To prevent it we would have to add
     ** more locks which would reduce performance in the normal case.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    //

    ////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    //

    ////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    //

    ////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public void writeLock()

    /**
     * Sets the writeLock for this connection.
     * If the writeLock is already set by someone else, block till the
     * writeLock is released and can set by us.
     * IMPORTANT: this connection's lock must be acquired before
     * setting the writeLock and must be unlocked after setting the writeLock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    public synchronized void close()

    /**
     * Note:it is possible for this to be called more than once
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
    //

    ////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/transport/SocketOrChannelConnectionImpl.java
public class SocketOrChannelConnectionImpl

/**
 * @author Harold Carr
 */
