_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public OutputObject createOutputObject(Broker broker,
                                           MessageMediator messageMediator);

    /**
     * Used to get a
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * for the specific <em>encoding</em> represented by this
     * <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public InputObject createInputObject(Broker broker,
                                         MessageMediator messageMediator);

    /**
     * Used to get a
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     * for the specific <em>encoding</em> represented by this
     * <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public MessageMediator finishCreatingMessageMediator(Broker broker,
                                                         Connection xconnection,
                                                         MessageMediator messageMediator);

    /**
     * Used to finish creating a
     * {@link com.sun.corba.se.pept.protocol.MessageMeidator MessageMediator}
     * to with internal data for a message received using the specific
     * encoding, protocol, transport combination represented by this
     * <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.protocol.MessageMediator MessageMediator}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public MessageMediator createMessageMediator(Broker xbroker,
                                                 Connection xconnection);

    /**
     * Used to get a
     * {@link com.sun.corba.se.pept.protocol.MessageMeidator MessageMediator}
     * to hold internal data for a message received using the specific
     * encoding, protocol, transport combination represented by this
     * <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.protocol.MessageMeidator MessageMediator}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public void close();

    /**
     * Close the <code>Acceptor</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public void accept();

    /**
     * Accept a connection request.
     *
     * This is called either when the selector gets an accept event
     * for this <code>Acceptor</code> or by a
     * {@link com.sun.corba.se.pept.transport.ListenerThread ListenerThread}.
     *
     * It results in a
     * {@link com.sun.corba.se.pept.transport.Connection Connection}
     * being created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public boolean shouldRegisterAcceptEvent();

    /**
     * Used to determine if the <code>Acceptor</code> should register
     * with
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     * to handle accept events.
     *
     * For example, this may be <em>false</em> in the case of Solaris Doors
     * which do not actively listen.
     *
     * @return <code>true</code> if the <code>Acceptor</code> should be
     * registered with
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public InboundConnectionCache getConnectionCache();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.Inbound.ConnectionCache InboundConnectionCache}
     * used by this <code>Acceptor</code>
     *
     * PEPt uses separate caches for each type of <code>Acceptor</code>
     * as given by {@link #getConnectionCacheType}.
     * {@link #setConnectionCache} and {@link #getConnectionCache} support
     * an optimzation to avoid hashing to find that cache.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.ConnectionCache ConnectionCache}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public void setConnectionCache(InboundConnectionCache connectionCache);

    /**
     * Set the
     * {@link com.sun.corba.se.pept.transport.Inbound.ConnectionCache InboundConnectionCache}
     * to be used by this <code>Acceptor</code>.
     *
     * PEPt uses separate caches for each type of <code>Acceptor</code>
     * as given by {@link #getConnectionCacheType}.
     * {@link #setConnectionCache} and {@link #getConnectionCache} support
     * an optimzation to avoid hashing to find that cache.
     *
     * @param connectionCache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public String getConnectionCacheType();

    /**
     * PEPt uses separate caches for each type of <code>Acceptor</code>
     * as given by <code>getConnectionCacheType</code>.
     *
     * @return {@link java.lang.String}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public boolean initialized();

    /**
     * Used to determine if an <code>Acceptor</code> has been initialized.
     *
     * @return <code>true</code. if the <code>Acceptor</code> has been
     * initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public boolean initialize();

    /**
     * Used to initialize an <code>Acceptor</code>.
     *
     * For example, initialization may mean to create a
     * {@link java.nio.channels.ServerSocketChannel ServerSocketChannel}.
     *
     * Note: this must be prepared to be be called multiple times.
     *
     * @return <code>true</code> when it performs initializatin
     * actions (typically the first call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
public interface Acceptor

/**
 * <p>The <b><em>primary</em></b> PEPt server-side plug-in point and enabler
 * for <b><em>altenate encodings, protocols and transports</em></b>.</p>
 *
 * <p><code>Acceptor</code> is a <em>factory</em> for client-side
 * artifacts used to receive a message (and possibly send a response).</p>
 *
 * @author Harold Carr
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public OutputObject createOutputObject(Broker broker,
                                           MessageMediator messageMediator);

    /**
     * Used to get a
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * for the specific <em>encoding</em> represented by this
     * <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public InputObject createInputObject(Broker broker,
                                         MessageMediator messageMediator);

    /**
     * Used to get a
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     * for the specific <em>encoding</em> represented by this
     * <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public MessageMediator finishCreatingMessageMediator(Broker broker,
                                                         Connection xconnection,
                                                         MessageMediator messageMediator);

    /**
     * Used to finish creating a
     * {@link com.sun.corba.se.pept.protocol.MessageMeidator MessageMediator}
     * to with internal data for a message received using the specific
     * encoding, protocol, transport combination represented by this
     * <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.protocol.MessageMediator MessageMediator}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public MessageMediator createMessageMediator(Broker xbroker,
                                                 Connection xconnection);

    /**
     * Used to get a
     * {@link com.sun.corba.se.pept.protocol.MessageMeidator MessageMediator}
     * to hold internal data for a message received using the specific
     * encoding, protocol, transport combination represented by this
     * <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.protocol.MessageMeidator MessageMediator}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public void close();

    /**
     * Close the <code>Acceptor</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public void accept();

    /**
     * Accept a connection request.
     *
     * This is called either when the selector gets an accept event
     * for this <code>Acceptor</code> or by a
     * {@link com.sun.corba.se.pept.transport.ListenerThread ListenerThread}.
     *
     * It results in a
     * {@link com.sun.corba.se.pept.transport.Connection Connection}
     * being created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public boolean shouldRegisterAcceptEvent();

    /**
     * Used to determine if the <code>Acceptor</code> should register
     * with
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     * to handle accept events.
     *
     * For example, this may be <em>false</em> in the case of Solaris Doors
     * which do not actively listen.
     *
     * @return <code>true</code> if the <code>Acceptor</code> should be
     * registered with
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public InboundConnectionCache getConnectionCache();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.Inbound.ConnectionCache InboundConnectionCache}
     * used by this <code>Acceptor</code>
     *
     * PEPt uses separate caches for each type of <code>Acceptor</code>
     * as given by {@link #getConnectionCacheType}.
     * {@link #setConnectionCache} and {@link #getConnectionCache} support
     * an optimzation to avoid hashing to find that cache.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.ConnectionCache ConnectionCache}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public void setConnectionCache(InboundConnectionCache connectionCache);

    /**
     * Set the
     * {@link com.sun.corba.se.pept.transport.Inbound.ConnectionCache InboundConnectionCache}
     * to be used by this <code>Acceptor</code>.
     *
     * PEPt uses separate caches for each type of <code>Acceptor</code>
     * as given by {@link #getConnectionCacheType}.
     * {@link #setConnectionCache} and {@link #getConnectionCache} support
     * an optimzation to avoid hashing to find that cache.
     *
     * @param connectionCache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public String getConnectionCacheType();

    /**
     * PEPt uses separate caches for each type of <code>Acceptor</code>
     * as given by <code>getConnectionCacheType</code>.
     *
     * @return {@link java.lang.String}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public boolean initialized();

    /**
     * Used to determine if an <code>Acceptor</code> has been initialized.
     *
     * @return <code>true</code. if the <code>Acceptor</code> has been
     * initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
    public boolean initialize();

    /**
     * Used to initialize an <code>Acceptor</code>.
     *
     * For example, initialization may mean to create a
     * {@link java.nio.channels.ServerSocketChannel ServerSocketChannel}.
     *
     * Note: this must be prepared to be be called multiple times.
     *
     * @return <code>true</code> when it performs initializatin
     * actions (typically the first call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Acceptor.java
public interface Acceptor

/**
 * <p>The <b><em>primary</em></b> PEPt server-side plug-in point and enabler
 * for <b><em>altenate encodings, protocols and transports</em></b>.</p>
 *
 * <p><code>Acceptor</code> is a <em>factory</em> for client-side
 * artifacts used to receive a message (and possibly send a response).</p>
 *
 * @author Harold Carr
 */
