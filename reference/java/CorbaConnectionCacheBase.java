_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/transport/CorbaConnectionCacheBase.java
    //

    ////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/transport/CorbaConnectionCacheBase.java
    //

    ////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/transport/CorbaConnectionCacheBase.java
    synchronized public boolean reclaim()

    /**
     * Discarding least recently used Connections that are not busy
     *
     * This method must be synchronized since one WorkerThread could
     * be reclaming connections inside the synchronized backingStore
     * block and a second WorkerThread (or a SelectorThread) could have
     * already executed the if (numberOfConnections <= .... ). As a
     * result the second thread would also attempt to reclaim connections.
     *
     * If connection reclamation becomes a performance issue, the connection
     * reclamation could make its own task and consequently executed in
     * a separate thread.
     * Currently, the accept & reclaim are done in the same thread, WorkerThread
     * by default. It could be changed such that the SelectorThread would do
     * it for SocketChannels and WorkerThreads for Sockets by updating the
     * ParserTable.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/transport/CorbaConnectionCacheBase.java
    //

    ////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/transport/CorbaConnectionCacheBase.java
public abstract class CorbaConnectionCacheBase

/**
 * @author Harold Carr
 */
