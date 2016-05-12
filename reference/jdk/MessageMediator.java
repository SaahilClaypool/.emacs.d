_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public InputObject getInputObject();

    /**
     * Used to get the
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     * used for the message.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public void setInputObject(InputObject inputObject);

    /**
     * Used to set the
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     * used for the message.
     *
     * @param inputObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public OutputObject getOutputObject();

    /**
     * Used to get the
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * used for the message.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public void setOutputObject(OutputObject outputObject);

    /**
     * Used to set the
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * used for the message.
     *
     * @param outputObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    @Deprecated

    /**
     * Used to wait for a response for synchronous messages.
     *
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public void finishSendingRequest();

    /**
     * Used to send the message (or its last fragment).
     *
     * Note: this should be moved to a <code>RequestDispatcher</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public void initializeMessage();

    /**
     * Used to initialize message headers.
     *
     * Note: this should be moved to a <code>RequestDispatcher</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public Connection getConnection();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.Connection Connection}
     * on which this message is sent or received.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public ContactInfo getContactInfo();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * which created this <code>MessageMediator</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public Broker getBroker();

    /**
     * The {@link com.sun.corba.se.pept.broker.Broker Broker} associated
     * with an invocation.
     *
     * @return {@link com.sun.corba.se.pept.broker.Broker Broker}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
public interface MessageMediator

/**
 * <code>MessageMediator</code> is a central repository for artifacts
 * associated with an individual message.
 *
 * @author Harold Carr
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public InputObject getInputObject();

    /**
     * Used to get the
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     * used for the message.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public void setInputObject(InputObject inputObject);

    /**
     * Used to set the
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     * used for the message.
     *
     * @param inputObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public OutputObject getOutputObject();

    /**
     * Used to get the
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * used for the message.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public void setOutputObject(OutputObject outputObject);

    /**
     * Used to set the
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * used for the message.
     *
     * @param outputObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    @Deprecated

    /**
     * Used to wait for a response for synchronous messages.
     *
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public void finishSendingRequest();

    /**
     * Used to send the message (or its last fragment).
     *
     * Note: this should be moved to a <code>RequestDispatcher</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public void initializeMessage();

    /**
     * Used to initialize message headers.
     *
     * Note: this should be moved to a <code>RequestDispatcher</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public Connection getConnection();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.Connection Connection}
     * on which this message is sent or received.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public ContactInfo getContactInfo();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * which created this <code>MessageMediator</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
    public Broker getBroker();

    /**
     * The {@link com.sun.corba.se.pept.broker.Broker Broker} associated
     * with an invocation.
     *
     * @return {@link com.sun.corba.se.pept.broker.Broker Broker}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/protocol/MessageMediator.java
public interface MessageMediator

/**
 * <code>MessageMediator</code> is a central repository for artifacts
 * associated with an individual message.
 *
 * @author Harold Carr
 */
