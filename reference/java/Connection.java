_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public void unregisterWaiter(MessageMediator messageMediator);

    /**
     * Unregister an invocation's
     * {@link com.sun.corba.se.pept.protocol.MessageMediator MessageMediator}
     * with the <code>Connection</code>.
     *
     * @param messageMediator
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public InputObject waitForResponse(MessageMediator messageMediator);

    /**
     * If a message expect's a response then this method is called.
     *
     * This method might block on a read (e.g., HTTP), put the calling
     * thread to sleep while another thread read's the response (e.g., GIOP),
     * or it may use the calling thread to perform the server-side work
     * (e.g., Solaris Doors).
     *
     * @param messageMediator
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public void registerWaiter(MessageMediator messageMediator);

    /**
     * Register an invocation's
     * {@link com.sun.corba.se.pept.protocol.MessageMediator MessageMediator}
     * with the <code>Connection</code>.
     *
     * This is useful in protocols which support fragmentation.
     *
     * @param messageMediator
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public void writeUnlock();

    /**
     * Release a write lock on the <code>Connection</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public void writeLock();

    /**
     * Grab a write lock on the <code>Connection</code>.
     *
     * If another thread already has a write lock then the calling
     * thread will block until the lock is released.  The calling
     * thread must call
     * {@link #writeUnlock}
     * when it is done.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public void setState(String state);

    /**
     * The "state" of the <code>Connection</code>.
     *
     * param state
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public void setTimeStamp(long time);

    /**
     * Timestamps are used for connection management, in particular, for
     * reclaiming idle <code>Connection</code>s.
     *
     * @param time - the "time" the <code>Connection</code> was last used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public long getTimeStamp();

    /**
     * Timestamps are used for connection management, in particular, for
     * reclaiming idle <code>Connection</code>s.
     *
     * @return the "time" the <code>Connection</code> was last used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public boolean isBusy();

    /**
     * Indicates if the <code>Connection</code> is in the process of
     * sending or receiving a message.
     *
     * @return <code>true</code> if the <code>Connection</code> is busy.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public boolean isServer();

    /**
     * Indicates whether a
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * or a
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     * created the
     * <code>Connection</code>.
     *
     * @return <code>true</code> if <code>Connection</code> an
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     * created the <code>Connection</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public EventHandler getEventHandler();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.EventHandler EventHandler}
     * associated with this <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.EventHandler EventHandler}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public ContactInfo getContactInfo();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * that created this <code>Connection</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public Acceptor getAcceptor();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     * that created this <code>Connection</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public void close();

    /**
     * Close the <code>Connection</code>.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public boolean read();

    /**
     * Called to read incoming messages.
     *
     * @return <code>true</code> if the thread calling read can be released.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public boolean shouldRegisterServerReadEvent(); // REVISIT - why special?

    /**
     * Used to determine if the <code>Connection</code> should register
     * with the
     * {@link com.sun.corba.se.pept.transport.TransportManager
     * TransportManager}
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     * to handle read events.
     *
     * For example, an HTTP transport would not register since the requesting
     * thread would just block on read when waiting for the reply.
     *
     * @return <code>true</code> if it should be registered.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
    public boolean shouldRegisterReadEvent();

    /**
     * Used to determine if the <code>Connection</code> should register
     * with the
     * {@link com.sun.corba.se.pept.transport.TransportManager
     * TransportManager}
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     * to handle read events.
     *
     * For example, an HTTP transport would not register since the requesting
     * thread would just block on read when waiting for the reply.
     *
     * @return <code>true</code> if it should be registered.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/transport/Connection.java
public interface Connection

/**
 * <p><code>Connection</code> represents a <em>transport</em> in the
 * PEPt architecture.</p>
 *
 * @author Harold Carr
*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/legacy/connection/Connection.java
public interface Connection

/**
 * This interface represents the connection on which a request is made.
 */
