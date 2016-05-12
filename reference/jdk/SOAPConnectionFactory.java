_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConnectionFactory.java
    public abstract SOAPConnection createConnection()

    /**
     * Create a new <code>SOAPConnection</code>.
     *
     * @return the new <code>SOAPConnection</code> object.
     *
     * @exception SOAPException if there was an exception creating the
     * <code>SOAPConnection</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConnectionFactory.java
    public static SOAPConnectionFactory newInstance()

    /**
     * Creates an instance of the default
     * <code>SOAPConnectionFactory</code> object.
     *
     * @return a new instance of a default
     *         <code>SOAPConnectionFactory</code> object
     *
     * @exception SOAPException if there was an error creating the
     *            <code>SOAPConnectionFactory</code>
     *
     * @exception UnsupportedOperationException if newInstance is not
     * supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConnectionFactory.java
    static private final String SF_PROPERTY

    /**
     * A constant representing the <code>SOAPConnection</code> class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConnectionFactory.java
public abstract class SOAPConnectionFactory {

/**
 * A factory for creating <code>SOAPConnection</code> objects. Implementation of this class
 * is optional. If <code>SOAPConnectionFactory.newInstance()</code> throws an
 * UnsupportedOperationException then the implementation does not support the
 * SAAJ communication infrastructure. Otherwise {@link SOAPConnection} objects
 * can be created by calling <code>createConnection()</code> on the newly
 * created <code>SOAPConnectionFactory</code> object.
 */
