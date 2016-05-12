_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectionImpl.java
    private static Exception extractException(Exception e) {

    /**
     * Iterate until we extract the real exception
     * from a stack of PrivilegedActionExceptions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectionImpl.java
    private static IOException newIOException(String message,
                                              Throwable cause) {

    /**
     * Construct a new IOException with a nested exception.
     * The nested exception is set only if JDK {@literal >= 1.4}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectionImpl.java
    @Override

    /**
     * <p>Returns a string representation of this object.  In general,
     * the <code>toString</code> method returns a string that
     * "textually represents" this object. The result should be a
     * concise but informative representation that is easy for a
     * person to read.</p>
     *
     * @return a String representation of this object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectionImpl.java
    public RMIConnectionImpl(RMIServerImpl rmiServer,
                             String connectionId,
                             ClassLoader defaultClassLoader,
                             Subject subject,
                             Map<String,?> env) {

    /**
     * Constructs a new {@link RMIConnection}. This connection can be
     * used with either the JRMP or IIOP transport. This object does
     * not export itself: it is the responsibility of the caller to
     * export it appropriately (see {@link
     * RMIJRMPServerImpl#makeClient(String,Subject)} and {@link
     * RMIIIOPServerImpl#makeClient(String,Subject)}.
     *
     * @param rmiServer The RMIServerImpl object for which this
     * connection is created.  The behavior is unspecified if this
     * parameter is null.
     * @param connectionId The ID for this connection.  The behavior
     * is unspecified if this parameter is null.
     * @param defaultClassLoader The default ClassLoader to be used
     * when deserializing marshalled objects.  Can be null, to signify
     * the bootstrap class loader.
     * @param subject the authenticated subject to be used for
     * authorization.  Can be null, to signify that no subject has
     * been authenticated.
     * @param env the environment containing attributes for the new
     * <code>RMIServerImpl</code>.  Can be null, equivalent to an
     * empty map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/rmi/RMIConnectionImpl.java
/*

/**
 * <p>Implementation of the {@link RMIConnection} interface.  User
 * code will not usually reference this class.</p>
 *
 * @since 1.5
 */
