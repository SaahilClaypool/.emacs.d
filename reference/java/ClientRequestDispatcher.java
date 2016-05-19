_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/protocol/ClientRequestDispatcher.java
    public void endRequest(Broker broker,
                           java.lang.Object self,
                           InputObject inputObject);

    /**
     * After the presentation block completes a request it signals
     * the PEPt runtime by calling this method.
     *
     * This method may release resources.  In some cases it may cause
     * control or error messages to be sent.
     *
     * @param broker -
     * @param inputObject -
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/protocol/ClientRequestDispatcher.java
    public InputObject marshalingComplete(java.lang.Object self,
                                          OutputObject outputObject)

    /**
     * After the presentation block has set data on the
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * it signals the PEPt runtime to send the encoded data by calling this
     * method.
     *
     * @param self -
     * @param outputObject
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     * if the message is synchronous.
     *
     * @throws
     * {@link org.omg.CORBA.portable.ApplicationException ApplicationException}
     * if the remote side raises an exception declared in the remote interface.
     *
     * @throws
     * {@link org.omg.CORBA.portable.RemarshalException RemarshalException}
     * if the PEPt runtime would like the presentation block to start over.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/protocol/ClientRequestDispatcher.java
    public OutputObject beginRequest(Object self,
                                     String methodName,
                                     boolean isOneWay,
                                     ContactInfo contactInfo);

    /**
     * At the beginning of a request the presentation block uses this
     * to obtain an
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * to set data to be sent on a message.
     *
     * @param self -
     * @param methodName - the remote method name
     * @param isOneWay - <code>true</code> if the message is asynchronous
     * @param contactInfo - the
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * which which created/chose this <code>ClientRequestDispatcher</code>
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/pept/protocol/ClientRequestDispatcher.java
public interface ClientRequestDispatcher

/**
 * <code>ClientRequestDispatcher</code> coordinates the request (and possible
 * response) processing for a specific <em>protocol</em>.
 *
 * @author Harold Carr
 */
