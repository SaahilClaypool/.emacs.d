_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void init(InetAddressAcl acl, int p, InetAddress a) {

    /**
     * Common initializations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void readObject(ObjectInputStream stream)

    /**
     * Control the way the SnmpAdaptorServer service is deserialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    long getSysUpTime() {

    /**
     * Returns the time (in hundreths of second) elapsed since the SNMP
     * protocol adaptor startup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the string used in debug traces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Finalizer of the SNMP protocol adaptor objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more
     * references to the object.
     * <P>Closes the datagram socket associated to this SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    InetAddress getAddress() {

    /**
     * Gets the IP address to bind.
     * This getter is used to initialize the DatagramSocket in the
     * SnmpSocket object created for the inform request stuff.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    synchronized void closeInformSocketIfNeeded() {

    /**
     * Close informSocket if the SNMP protocol adaptor is not ONLINE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    synchronized void openInformSocketIfNeeded() throws SocketException {

    /**
     * Open informSocket if it's not already done.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public static int mapErrorStatus(int errorStatus,
                                     int protocolVersion,
                                     int reqPduType) {

    /**
     * Method that maps an SNMP error status in the passed protocolVersion
     * according to the provided pdu type.
     * @param errorStatus The error status to convert.
     * @param protocolVersion The protocol version.
     * @param reqPduType The pdu type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform is sent to the specified <CODE>SnmpPeer</CODE>
     *     destination.
     * <BR>The community string used is the one located in the
     *     <CODE>SnmpPeer</CODE> parameters
     *     (<CODE>SnmpParameters.getInformCommunity() </CODE>).
     * <BR>The variable list included in the outgoing inform is composed
     *     of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination for this inform
     *             request.
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return The inform request object.
     *
     * @exception IllegalStateException  This method has been invoked while
     *            the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the
     *            inform request.
     * @exception SnmpStatusException If the inform request exceeds the
     *            limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform is sent to the specified <CODE>InetAddress</CODE>
     * destination
     * using the specified community string.
     * <BR>The variable list included in the outgoing inform is composed
     *     of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *      <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param addr The <CODE>InetAddress</CODE> destination for this inform
     *             request.
     * @param cs The community string to be used for the inform request.
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return The inform request object.
     *
     * @exception IllegalStateException  This method has been invoked
     *            while the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the
     *            inform request.
     * @exception SnmpStatusException If the inform request exceeds the
     *            limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform request is sent to each destination defined in the ACL
     * file (if available).
     * If no ACL file or no destinations are available, the inform request is
     * sent to the local host.
     * <BR>The variable list included in the outgoing inform is composed of
     * the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return A vector of {@link com.sun.jmx.snmp.daemon.SnmpInformRequest}
     *         objects.
     *         <P>If there is no destination host for this inform request,
     *         the returned vector will be empty.
     *
     * @exception IllegalStateException  This method has been invoked while
     *            the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the
     *            inform request.
     * @exception SnmpStatusException If the inform request exceeds the
     *            limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    synchronized void closeTrapSocketIfNeeded() {

    /**
     * Close trapSocket if the SNMP protocol adaptor is not ONLINE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    synchronized void openTrapSocketIfNeeded() throws SocketException {

    /**
     * Open trapSocket if it's not already done.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void sendTrapMessage(SnmpMessage msg)

    /**
     * Send the specified message on trapSocket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void sendTrapPdu(InetAddress addr, SnmpPduPacket pdu)

    /**
     * Send the specified trap PDU to the specified destination.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void sendTrapPdu(SnmpPduPacket pdu)

    /**
     * Send the specified trap PDU to every destinations from the ACL file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Send the specified trap PDU to the passed <CODE>SnmpPeer</CODE>.
     * @param peer The destination peer. The Read community string is used of
     * <CODE>SnmpParameters</CODE> is used as the trap community string.
     * @param pdu The pdu to send.
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     * by <CODE>bufferSize</CODE>.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Send the specified trap PDU to the passed <CODE>InetAddress</CODE>.
     * @param address The destination address.
     * @param pdu The pdu to send.
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     * defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public void snmpV2Trap(InetAddress addr,
                           String cs,
                           SnmpOid trapOid,
                           SnmpVarBindList varBindList,
                           SnmpTimeticks time)

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE>
     * destination using the specified parameters (and the ACL file is not
     * used).
     * Note that if the specified <CODE>InetAddress</CODE> destination is null,
     * then the ACL file mechanism is used.
     * <BR>The variable list included in the outgoing trap is composed of the
     * following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with the value specified by
     *     <CODE>time</CODE></LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     *
     * @param addr The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     * defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE>
     * destination using the specified community string (and the ACL file
     * is not used).
     * <BR>The variable list included in the outgoing trap is composed of
     * the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     *
     * @param addr The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     *            defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to each destination defined in the ACL file
     * (if available). If no ACL file or no destinations are available,
     * the trap is sent to the local host.
     * <BR>The variable list included in the outgoing trap is composed of
     * the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     *
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     *            by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * <BR>The community string used is the one located in the
     * <CODE>SnmpPeer</CODE> parameters
     * (<CODE>SnmpParameters.getRdCommunity() </CODE>).
     * <BR>The variable list included in the outgoing trap is composed of
     * the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with the value specified by
     *     <CODE>time</CODE></LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination of the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     * defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * The community string used is the one located in the
     * <CODE>SnmpPeer</CODE> parameters
     * (<CODE>SnmpParameters.getRdCommunity() </CODE>).
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination of the trap.
     * @param agentAddr The agent address to be used for the trap.
     * @param enterpOid The enterprise OID to be used for the trap.
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     * defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public void snmpV1Trap(InetAddress addr,
                           SnmpIpAddress agentAddr,
                           String cs,
                           SnmpOid enterpOid,
                           int generic,
                           int specific,
                           SnmpVarBindList varBindList,
                           SnmpTimeticks time)

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE>
     * destination using the specified parameters (and the ACL file is not
     * used).
     * Note that if the specified <CODE>InetAddress</CODE> destination is null,
     * then the ACL file mechanism is used.
     *
     * @param addr The <CODE>InetAddress</CODE> destination of the trap.
     * @param agentAddr The agent address to be used for the trap.
     * @param cs The community string to be used for the trap.
     * @param enterpOid The enterprise OID to be used for the trap.
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     *            by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE>
     * destination using the specified community string (and the ACL file
     * is not used).
     *
     * @param addr The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     *            by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to each destination defined in the ACL file
     * (if available).
     * If no ACL file or no destinations are available, the trap is sent
     * to the local host.
     *
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     *            by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Stops this SNMP protocol adaptor.
     * Closes the datagram socket.
     * <p>
     * Has no effect if this SNMP protocol adaptor is <CODE>OFFLINE</CODE> or
     * <CODE>STOPPING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * The number of times the communicator server will attempt
     * to bind before giving up.
     * We attempt only once...
     * @return 1
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Reads a packet from the datagram socket and creates a request
     * handler which decodes and processes the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Closes the datagram socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Return the actual port to which the adaptor is bound.
     * Can be different from the port given at construction time if
     * that port number was 0.
     * @return the actual port to which the adaptor is bound.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Creates the datagram socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

     /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     *
     * @param mib The MIB to be removed.
     * @param contextName The context name used at registration time.
     * @param oids The oid the MIB was previously registered for.
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was
     * a MIB included in the SNMP MIB handler, <CODE>false</CODE>
     * otherwise.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     *
     * @param mib The MIB to be removed.
     * @param oids The oid the MIB was previously registered for.
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was
     * a MIB included in the SNMP MIB handler, <CODE>false</CODE>
     * otherwise.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     *
     * @param mib The MIB to be removed.
     *
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was a MIB
     *         included in the SNMP MIB handler, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     * In SNMP V1 and V2 the <CODE>contextName</CODE> is useless and this
     * method is equivalent to <CODE>removeMib(SnmpMibAgent mib)</CODE>.
     *
     * @param mib The MIB to be removed.
     * @param contextName The context name used at registration time.
     *
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was
     * a MIB included in the SNMP MIB handler, <CODE>false</CODE>
     * otherwise.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Adds a new MIB in the SNMP MIB handler. In SNMP V1 and V2 the
     * <CODE>contextName</CODE> is useless and this method
     * is equivalent to <CODE>addMib(SnmpMibAgent mib, SnmpOid[] oids)</CODE>.
     *
     * @param mib The MIB to add.
     * @param contextName The MIB context. If null is passed, will be
     *        registered in the default context.
     * @param oids The set of OIDs this agent implements.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Adds a new MIB in the SNMP MIB handler. In SNMP V1 and V2 the
     * <CODE>contextName</CODE> is useless and this method
     * is equivalent to <CODE>addMib(SnmpMibAgent mib)</CODE>.
     *
     * @param mib The MIB to add.
     * @param contextName The MIB context name.
     * @return A reference on the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Adds a new MIB in the SNMP MIB handler.
     * This method is to be called to set a specific agent to a specific OID.
     * This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case,
     * the OID nearer agent will be used on SNMP operations.
     *
     * @param mib The MIB to add.
     * @param oids The set of OIDs this agent implements.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Adds a new MIB in the SNMP MIB handler.
     *
     * @param mib The MIB to add.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Allows the MBean to perform any operations it needs before being
     * registered in the MBean server.
     * If the name of the SNMP protocol adaptor MBean is not specified,
     * it is initialized with the default value:
     * {@link com.sun.jmx.snmp.ServiceName#DOMAIN
     *   com.sun.jmx.snmp.ServiceName.DOMAIN}:{@link
     * com.sun.jmx.snmp.ServiceName#SNMP_ADAPTOR_SERVER
     * com.sun.jmx.snmp.ServiceName.SNMP_ADAPTOR_SERVER}.
     * If any exception is raised, the SNMP protocol adaptor MBean will
     * not be registered in the MBean server.
     *
     * @param server The MBean server to register the service with.
     * @param name The object name.
     *
     * @return The name of the SNMP protocol adaptor registered.
     *
     * @exception java.lang.Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpProxyDrops</CODE> value defined in RFC
     * 1907 NMPv2-MIB .
     *
     * @return The <CODE>snmpProxyDrops</CODE> value.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpSilentDrops</CODE> value defined in RFC
     * 1907 NMPv2-MIB .
     *
     * @return The <CODE>snmpSilentDrops</CODE> value.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInTotalReqVars</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInTotalReqVars</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInTotalSetVars</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInTotalSetVars</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInSetRequests</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInSetRequests</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInGetNexts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInGetNexts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInGetRequests</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInGetRequests</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInPkts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInPkts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutPkts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutPkts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInBadVersions</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadVersions</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInBadCommunityNames</CODE> value defined in
     * MIB-II.
     *
     * @return The <CODE>snmpInBadCommunityNames</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInBadCommunityUses</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadCommunityUses</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInASNParseErrs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInASNParseErrs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutTooBigs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutTooBigs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutNoSuchNames</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutNoSuchNames</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutBadValues</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutBadValues</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutGenErrs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutGenErrs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutGetResponses</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutGetResponses</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutTraps</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutTraps</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the names of the MIBs available in this SNMP protocol adaptor.
     *
     * @return An array of MIB names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the enterprise OID.
     *
     * @param oid The OID in string format "x.x.x.x".
     *
     * @exception IllegalArgumentException The string format is incorrect
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the enterprise OID. It is used by
     * {@link #snmpV1Trap snmpV1Trap} to fill the 'enterprise' field of the
     * trap request.
     *
     * @return The OID in string format "x.x.x.x".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the flag indicating if responses need to be sent in case of
     * authentication failure.
     *
     * @param enabled Flag indicating if responses need to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns <code>true</code> if this SNMP protocol adaptor sends a
     * response in case of authentication failure.
     * <P>
     * When this feature is enabled, the SNMP protocol adaptor sends a
     * response with <CODE>noSuchName</CODE> or <CODE>readOnly</CODE> when
     * the authentication failed. If the flag is disabled, the
     * SNMP protocol adaptor trashes the PDU silently.
     * <P>
     * The default behavior is to send responses.
     *
     * @return <CODE>true</CODE> if responses are sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the flag indicating if traps need to be sent in case of
     * authentication failure.
     *
     * @param enabled Flag indicating if traps need to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns <CODE>true</CODE> if authentication traps are enabled.
     * <P>
     * When this feature is enabled, the SNMP protocol adaptor sends
     * an <CODE>authenticationFailure</CODE> trap each time an
     * authentication fails.
     * <P>
     * The default behaviour is to send authentication traps.
     *
     * @return <CODE>true</CODE> if authentication traps are enabled,
     *         <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Get the user-data factory associated with this SNMP protocol adaptor.
     *
     * @return The factory object (null means no factory).
     * @see com.sun.jmx.snmp.agent.SnmpUserDataFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Set the user-data factory of this SNMP protocol adaptor.
     *
     * @param factory The factory object (null means no factory).
     * @see com.sun.jmx.snmp.agent.SnmpUserDataFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the message factory of this SNMP protocol adaptor.
     *
     * @param factory The factory object (null means the default factory).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the message factory of this SNMP protocol adaptor.
     *
     * @return The factory object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Changes the timeout to wait for an inform response from the manager.
     * @param newTimeout The timeout (in milliseconds).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the timeout to wait for an inform response from the manager.
     * By default, a timeout of 3 seconds is used.
     * @return The value of the timeout property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Changes the maximun number of times to try sending an inform
     * request before giving up.
     * @param newMaxTries The maximun number of tries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the number of times to try sending an inform request before
     * giving up.
     * By default, a maximum of 3 tries is used.
     * @return The maximun number of tries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the buffer size of this SNMP protocol adaptor.
     * This buffer size is used for both incoming request and outgoing
     * inform requests.
     *
     * @param s The buffer size.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was <CODE>ONLINE</CODE> or <CODE>STARTING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the buffer size of this SNMP protocol adaptor.
     * This buffer size is used for both incoming request and outgoing
     * inform requests.
     * By default, buffer size 1024 is used.
     *
     * @return The buffer size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the protocol of this SNMP protocol adaptor.
     *
     * @return The string "snmp".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the port used by this SNMP protocol adaptor for sending
     * inform requests.
     *
     * @param port The port number for sending SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the port used by this SNMP protocol adaptor for sending
     * inform requests. By default, port 162 is used.
     *
     * @return The port number for sending SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public void setTrapPort(int port) {

    /**
     * Sets the port used by this SNMP protocol adaptor for sending traps.
     *
     * @param port The port number for sending SNMP traps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the port used by this SNMP protocol adaptor for sending traps.
     *
     * @param port The port number for sending SNMP traps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the port used by this SNMP protocol adaptor for sending traps.
     * By default, port 162 is used.
     *
     * @return The port number for sending SNMP traps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the Ip address based ACL used by this SNMP protocol adaptor.
     * @return The <CODE>InetAddressAcl</CODE> implementation.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the maximum number of managers this SNMP protocol adaptor can
     * process concurrently.
     *
     * @param c The number of managers.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was <CODE>ONLINE</CODE> or <CODE>STARTING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the maximum number of managers that this SNMP protocol adaptor can
     * process concurrently.
     *
     * @return The maximum number of managers that this SNMP protocol adaptor
     *         can process concurrently.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the number of managers currently being processed by this
     * SNMP protocol adaptor.
     *
     * @return The number of managers currently being processed by this
     * SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the number of managers that have been processed by this
     * SNMP protocol adaptor  since its creation.
     *
     * @return The number of managers handled by this SNMP protocol adaptor
     * since its creation. This counter is not reset by the <CODE>stop</CODE>
     * method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(boolean useAcl, int port, InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port and the
     * specified <CODE>InetAddress</CODE>.
     * This constructor allows to initialize an SNMP adaptor without using
     * the ACL mechanism (by setting the <CODE>useAcl</CODE> parameter to
     * false).
     * <br>This constructor must be used in particular with a platform that
     * does not support the <CODE>java.security.acl</CODE> package like pJava.
     *
     * @param useAcl Specifies if this new SNMP adaptor uses the ACL mechanism.
     * If the specified parameter is set to <CODE>true</CODE>, this
     * constructor is equivalent to
     * <CODE>SnmpAdaptorServer((int)port,(InetAddress)addr)</CODE>.
     * @param port The port number for sending SNMP responses.
     * @param addr The IP address to bind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddressAcl acl, int port, InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port, the
     * specified  address based ACL implementation and the specified
     * <CODE>InetAddress</CODE>.
     *
     * @param acl The <CODE>InetAddressAcl</CODE> implementation.
     * @param port The port number for sending SNMP responses.
     * @param addr The IP address to bind.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddressAcl acl, InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the specified IP
     * address based ACL implementation and the specified
     * <CODE>InetAddress</CODE>.
     *
     * @param acl The <CODE>InetAddressAcl</CODE> implementation.
     * @param addr The IP address to bind.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(int port, InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port and the
     * specified <CODE>InetAddress</CODE>.
     * Use the {@link com.sun.jmx.snmp.IPAcl.SnmpAcl} default
     * implementation of the <CODE>InetAddressAcl</CODE> interface.
     *
     * @param port The port number for sending SNMP responses.
     * @param addr The IP address to bind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddressAcl acl, int port) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port and the
     * specified IP address based ACL implementation.
     *
     * @param acl The <CODE>InetAddressAcl</CODE> implementation.
     *        <code>null</code> means no ACL - everybody is authorized.
     * @param port The port number for sending SNMP responses.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the default port (161)
     * and the
     * specified <CODE>InetAddress</CODE>.
     * Use the {@link com.sun.jmx.snmp.IPAcl.SnmpAcl} default
     * implementation of the <CODE>InetAddressAcl</CODE> interface.
     *
     * @param addr The IP address to bind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddressAcl acl) {

    /**
     * Initializes this SNMP protocol adaptor using the default port (161)
     * and the specified IP address based ACL implementation.
     *
     * @param acl The <CODE>InetAddressAcl</CODE> implementation.
     *        <code>null</code> means no ACL - everybody is authorized.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(int port) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port.
     * Use the {@link com.sun.jmx.snmp.IPAcl.SnmpAcl} default
     * implementation of the <CODE>InetAddressAcl</CODE> interface.
     *
     * @param port The port number for sending SNMP responses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer() {

    /**
     * Initializes this SNMP protocol adaptor using the default port (161).
     * Use the {@link com.sun.jmx.snmp.IPAcl.SnmpAcl} default
     * implementation of the <CODE>InetAddressAcl</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpSilentDrops=0;

    /**
     * The <CODE>snmpInTotalSetVars</CODE> value defined in rfc 1907 MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInTotalSetVars=0;

    /**
     * The <CODE>snmpInTotalSetVars</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInTotalReqVars=0;

    /**
     * The <CODE>snmpInTotalReqVars</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInPkts=0;

    /**
     * The <CODE>snmpInPkts</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInSetRequests=0;

    /**
     * The <CODE>snmpInSetRequests</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInGetNexts=0;

    /**
     * The <CODE>snmpInGetNexts</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInGetRequests=0;

    /**
     * The <CODE>snmpInGetRequests</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInBadVersions=0;

    /**
     * The <CODE>snmpInBadVersions</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInBadCommunityNames=0;

    /**
     * The <CODE>snmpInBadCommunityNames</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInBadCommunityUses=0;

    /**
     * The <CODE>snmpInBadCommunityUses</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInASNParseErrs=0;

    /**
     * The <CODE>snmpInASNParseErrs</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    int snmpOutPkts=0;

    /**
     * The <CODE>snmpOutPkts</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutTooBigs=0;

    /**
     * The <CODE>snmpOutTooBigs</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutNoSuchNames=0;

    /**
     * The <CODE>snmpOutNoSuchNames</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutBadValues=0;

    /**
     * The <CODE>snmpOutBadValues</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutGenErrs=0;

    /**
     * The <CODE>snmpOutGenErrs</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutGetResponses=0;

    /**
     * The <CODE>snmpOutGetResponses</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    int snmpOutTraps=0;

    /**
     * The <CODE>snmpOutTraps</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int timeout = 3 * 1000 ;

    /**
     * The amount of time to wait for an inform response from the manager.
     * The default amount of time is 3000 millisec.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int maxTries = 3 ;

    /**
     * Number of times to try an inform request before giving up.
     * The default number is 3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private transient boolean         useAcl = true;

    /**
     * Whether ACL must be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    int bufferSize = 1024;

    /**
     * The buffer size of the SNMP protocol adaptor.
     * This buffer size is used for both incoming request and outgoing
     * inform requests.
     * <BR>The default value is 1024.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private SnmpOid enterpriseOid = new SnmpOid("1.3.6.1.4.1.42");

    /**
     * The enterprise OID.
     * <BR>The default value is "1.3.6.1.4.1.42".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private boolean authTrapEnabled = true;

    /**
     * Indicates if authentication traps are enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private boolean authRespEnabled = true;

    /**
     * Indicates if the SNMP protocol adaptor sends a response in case
     * of authentication failure
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private SnmpUserDataFactory userDataFactory = null;

    /**
     * The user-data factory object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private SnmpPduFactory pduFactory = null;

    /**
     * The factory object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private InetAddressAcl ipacl = null;

    /**
     * The IP address based ACL used by this SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    InetAddress address = null;

    /**
     * The <CODE>InetAddress</CODE> used when creating the datagram socket.
     * <BR>It is specified when creating the SNMP protocol adaptor.
     * If not specified, the local host machine is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int                 informPort = 162;

    /**
     * Port number for sending SNMP inform requests.
     * <BR>The default value is 162.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int                 trapPort = 162;

    /**
     * Port number for sending SNMP traps.
     * <BR>The default value is 162.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
public class SnmpAdaptorServer extends CommunicatorServer

/**
 * Implements an adaptor on top of the SNMP protocol.
 * <P>
 * When this SNMP protocol adaptor is started it creates a datagram socket
 * and is able to receive requests and send traps or inform requests.
 * When it is stopped, the socket is closed and neither requests
 * and nor traps/inform request are processed.
 * <P>
 * The default port number of the socket is 161. This default value can be
 * changed by specifying a port number:
 * <UL>
 * <LI>in the object constructor</LI>
 * <LI>using the {@link com.sun.jmx.snmp.daemon.CommunicatorServer#setPort
 *     setPort} method before starting the adaptor</LI>
 * </UL>
 * The default object name is defined by {@link
 * com.sun.jmx.snmp.ServiceName#DOMAIN com.sun.jmx.snmp.ServiceName.DOMAIN}
 * and {@link com.sun.jmx.snmp.ServiceName#SNMP_ADAPTOR_SERVER
 * com.sun.jmx.snmp.ServiceName.SNMP_ADAPTOR_SERVER}.
 * <P>
 * The SNMP protocol adaptor supports versions 1 and 2 of the SNMP protocol
 * in a stateless way: when it receives a v1 request, it replies with a v1
 * response, when it receives a v2 request it replies with a v2 response.
 * <BR>The method {@link #snmpV1Trap snmpV1Trap} sends traps using SNMP v1
 * format.
 * The method {@link #snmpV2Trap snmpV2Trap} sends traps using SNMP v2 format.
 * The method {@link #snmpInformRequest snmpInformRequest} sends inform
 * requests using SNMP v2 format.
 * <P>
 * To receive data packets, the SNMP protocol adaptor uses a buffer
 * which size can be configured using the property <CODE>bufferSize</CODE>
 * (default value is 1024).
 * Packets which do not fit into the buffer are rejected.
 * Increasing <CODE>bufferSize</CODE> allows the exchange of bigger packets.
 * However, the underlying networking system may impose a limit on the size
 * of UDP packets.
 * Packets which size exceed this limit will be rejected, no matter what
 * the value of <CODE>bufferSize</CODE> actually is.
 * <P>
 * An SNMP protocol adaptor may serve several managers concurrently. The
 * number of concurrent managers can be limited using the property
 * <CODE>maxActiveClientCount</CODE>.
 * <p>
 * The SNMP protocol adaptor specifies a default value (10) for the
 * <CODE>maxActiveClientCount</CODE> property. When the adaptor is stopped,
 * the active requests are interrupted and an error result is sent to
 * the managers.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void init(InetAddressAcl acl, int p, InetAddress a) {

    /**
     * Common initializations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void readObject(ObjectInputStream stream)

    /**
     * Control the way the SnmpAdaptorServer service is deserialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    long getSysUpTime() {

    /**
     * Returns the time (in hundreths of second) elapsed since the SNMP
     * protocol adaptor startup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the string used in debug traces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Finalizer of the SNMP protocol adaptor objects.
     * This method is called by the garbage collector on an object
     * when garbage collection determines that there are no more
     * references to the object.
     * <P>Closes the datagram socket associated to this SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    InetAddress getAddress() {

    /**
     * Gets the IP address to bind.
     * This getter is used to initialize the DatagramSocket in the
     * SnmpSocket object created for the inform request stuff.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    synchronized void closeInformSocketIfNeeded() {

    /**
     * Close informSocket if the SNMP protocol adaptor is not ONLINE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    synchronized void openInformSocketIfNeeded() throws SocketException {

    /**
     * Open informSocket if it's not already done.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public static int mapErrorStatus(int errorStatus,
                                     int protocolVersion,
                                     int reqPduType) {

    /**
     * Method that maps an SNMP error status in the passed protocolVersion
     * according to the provided pdu type.
     * @param errorStatus The error status to convert.
     * @param protocolVersion The protocol version.
     * @param reqPduType The pdu type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform is sent to the specified <CODE>SnmpPeer</CODE>
     *     destination.
     * <BR>The community string used is the one located in the
     *     <CODE>SnmpPeer</CODE> parameters
     *     (<CODE>SnmpParameters.getInformCommunity() </CODE>).
     * <BR>The variable list included in the outgoing inform is composed
     *     of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination for this inform
     *             request.
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return The inform request object.
     *
     * @exception IllegalStateException  This method has been invoked while
     *            the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the
     *            inform request.
     * @exception SnmpStatusException If the inform request exceeds the
     *            limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform is sent to the specified <CODE>InetAddress</CODE>
     * destination
     * using the specified community string.
     * <BR>The variable list included in the outgoing inform is composed
     *     of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *      <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param addr The <CODE>InetAddress</CODE> destination for this inform
     *             request.
     * @param cs The community string to be used for the inform request.
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return The inform request object.
     *
     * @exception IllegalStateException  This method has been invoked
     *            while the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the
     *            inform request.
     * @exception SnmpStatusException If the inform request exceeds the
     *            limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform request is sent to each destination defined in the ACL
     * file (if available).
     * If no ACL file or no destinations are available, the inform request is
     * sent to the local host.
     * <BR>The variable list included in the outgoing inform is composed of
     * the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return A vector of {@link com.sun.jmx.snmp.daemon.SnmpInformRequest}
     *         objects.
     *         <P>If there is no destination host for this inform request,
     *         the returned vector will be empty.
     *
     * @exception IllegalStateException  This method has been invoked while
     *            the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the
     *            inform request.
     * @exception SnmpStatusException If the inform request exceeds the
     *            limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    synchronized void closeTrapSocketIfNeeded() {

    /**
     * Close trapSocket if the SNMP protocol adaptor is not ONLINE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    synchronized void openTrapSocketIfNeeded() throws SocketException {

    /**
     * Open trapSocket if it's not already done.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void sendTrapMessage(SnmpMessage msg)

    /**
     * Send the specified message on trapSocket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void sendTrapPdu(InetAddress addr, SnmpPduPacket pdu)

    /**
     * Send the specified trap PDU to the specified destination.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private void sendTrapPdu(SnmpPduPacket pdu)

    /**
     * Send the specified trap PDU to every destinations from the ACL file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Send the specified trap PDU to the passed <CODE>SnmpPeer</CODE>.
     * @param peer The destination peer. The Read community string is used of
     * <CODE>SnmpParameters</CODE> is used as the trap community string.
     * @param pdu The pdu to send.
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     * by <CODE>bufferSize</CODE>.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Send the specified trap PDU to the passed <CODE>InetAddress</CODE>.
     * @param address The destination address.
     * @param pdu The pdu to send.
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     * defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public void snmpV2Trap(InetAddress addr,
                           String cs,
                           SnmpOid trapOid,
                           SnmpVarBindList varBindList,
                           SnmpTimeticks time)

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE>
     * destination using the specified parameters (and the ACL file is not
     * used).
     * Note that if the specified <CODE>InetAddress</CODE> destination is null,
     * then the ACL file mechanism is used.
     * <BR>The variable list included in the outgoing trap is composed of the
     * following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with the value specified by
     *     <CODE>time</CODE></LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     *
     * @param addr The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     * defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE>
     * destination using the specified community string (and the ACL file
     * is not used).
     * <BR>The variable list included in the outgoing trap is composed of
     * the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     *
     * @param addr The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     *            defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to each destination defined in the ACL file
     * (if available). If no ACL file or no destinations are available,
     * the trap is sent to the local host.
     * <BR>The variable list included in the outgoing trap is composed of
     * the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value</LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     *
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     *            by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * <BR>The community string used is the one located in the
     * <CODE>SnmpPeer</CODE> parameters
     * (<CODE>SnmpParameters.getRdCommunity() </CODE>).
     * <BR>The variable list included in the outgoing trap is composed of
     * the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with the value specified by
     *     <CODE>time</CODE></LI>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by
     *     <CODE>trapOid</CODE></LI>
     * <LI><CODE>all the (oid,values)</CODE> from the specified
     *     <CODE>varBindList</CODE></LI>
     * </UL>
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination of the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     * defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * The community string used is the one located in the
     * <CODE>SnmpPeer</CODE> parameters
     * (<CODE>SnmpParameters.getRdCommunity() </CODE>).
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination of the trap.
     * @param agentAddr The agent address to be used for the trap.
     * @param enterpOid The enterprise OID to be used for the trap.
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit
     * defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public void snmpV1Trap(InetAddress addr,
                           SnmpIpAddress agentAddr,
                           String cs,
                           SnmpOid enterpOid,
                           int generic,
                           int specific,
                           SnmpVarBindList varBindList,
                           SnmpTimeticks time)

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE>
     * destination using the specified parameters (and the ACL file is not
     * used).
     * Note that if the specified <CODE>InetAddress</CODE> destination is null,
     * then the ACL file mechanism is used.
     *
     * @param addr The <CODE>InetAddress</CODE> destination of the trap.
     * @param agentAddr The agent address to be used for the trap.
     * @param cs The community string to be used for the trap.
     * @param enterpOid The enterprise OID to be used for the trap.
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     *            by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE>
     * destination using the specified community string (and the ACL file
     * is not used).
     *
     * @param addr The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     *            by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to each destination defined in the ACL file
     * (if available).
     * If no ACL file or no destinations are available, the trap is sent
     * to the local host.
     *
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined
     *            by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Stops this SNMP protocol adaptor.
     * Closes the datagram socket.
     * <p>
     * Has no effect if this SNMP protocol adaptor is <CODE>OFFLINE</CODE> or
     * <CODE>STOPPING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * The number of times the communicator server will attempt
     * to bind before giving up.
     * We attempt only once...
     * @return 1
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Reads a packet from the datagram socket and creates a request
     * handler which decodes and processes the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Closes the datagram socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Return the actual port to which the adaptor is bound.
     * Can be different from the port given at construction time if
     * that port number was 0.
     * @return the actual port to which the adaptor is bound.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Creates the datagram socket.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

     /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     *
     * @param mib The MIB to be removed.
     * @param contextName The context name used at registration time.
     * @param oids The oid the MIB was previously registered for.
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was
     * a MIB included in the SNMP MIB handler, <CODE>false</CODE>
     * otherwise.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     *
     * @param mib The MIB to be removed.
     * @param oids The oid the MIB was previously registered for.
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was
     * a MIB included in the SNMP MIB handler, <CODE>false</CODE>
     * otherwise.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     *
     * @param mib The MIB to be removed.
     *
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was a MIB
     *         included in the SNMP MIB handler, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     * In SNMP V1 and V2 the <CODE>contextName</CODE> is useless and this
     * method is equivalent to <CODE>removeMib(SnmpMibAgent mib)</CODE>.
     *
     * @param mib The MIB to be removed.
     * @param contextName The context name used at registration time.
     *
     * @return <CODE>true</CODE> if the specified <CODE>mib</CODE> was
     * a MIB included in the SNMP MIB handler, <CODE>false</CODE>
     * otherwise.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Adds a new MIB in the SNMP MIB handler. In SNMP V1 and V2 the
     * <CODE>contextName</CODE> is useless and this method
     * is equivalent to <CODE>addMib(SnmpMibAgent mib, SnmpOid[] oids)</CODE>.
     *
     * @param mib The MIB to add.
     * @param contextName The MIB context. If null is passed, will be
     *        registered in the default context.
     * @param oids The set of OIDs this agent implements.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Adds a new MIB in the SNMP MIB handler. In SNMP V1 and V2 the
     * <CODE>contextName</CODE> is useless and this method
     * is equivalent to <CODE>addMib(SnmpMibAgent mib)</CODE>.
     *
     * @param mib The MIB to add.
     * @param contextName The MIB context name.
     * @return A reference on the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Adds a new MIB in the SNMP MIB handler.
     * This method is to be called to set a specific agent to a specific OID.
     * This can be useful when dealing with MIB overlapping.
     * Some OID can be implemented in more than one MIB. In this case,
     * the OID nearer agent will be used on SNMP operations.
     *
     * @param mib The MIB to add.
     * @param oids The set of OIDs this agent implements.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Adds a new MIB in the SNMP MIB handler.
     *
     * @param mib The MIB to add.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Allows the MBean to perform any operations it needs before being
     * registered in the MBean server.
     * If the name of the SNMP protocol adaptor MBean is not specified,
     * it is initialized with the default value:
     * {@link com.sun.jmx.snmp.ServiceName#DOMAIN
     *   com.sun.jmx.snmp.ServiceName.DOMAIN}:{@link
     * com.sun.jmx.snmp.ServiceName#SNMP_ADAPTOR_SERVER
     * com.sun.jmx.snmp.ServiceName.SNMP_ADAPTOR_SERVER}.
     * If any exception is raised, the SNMP protocol adaptor MBean will
     * not be registered in the MBean server.
     *
     * @param server The MBean server to register the service with.
     * @param name The object name.
     *
     * @return The name of the SNMP protocol adaptor registered.
     *
     * @exception java.lang.Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpProxyDrops</CODE> value defined in RFC
     * 1907 NMPv2-MIB .
     *
     * @return The <CODE>snmpProxyDrops</CODE> value.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpSilentDrops</CODE> value defined in RFC
     * 1907 NMPv2-MIB .
     *
     * @return The <CODE>snmpSilentDrops</CODE> value.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInTotalReqVars</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInTotalReqVars</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInTotalSetVars</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInTotalSetVars</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInSetRequests</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInSetRequests</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInGetNexts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInGetNexts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInGetRequests</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInGetRequests</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInPkts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInPkts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutPkts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutPkts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInBadVersions</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadVersions</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInBadCommunityNames</CODE> value defined in
     * MIB-II.
     *
     * @return The <CODE>snmpInBadCommunityNames</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInBadCommunityUses</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadCommunityUses</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpInASNParseErrs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInASNParseErrs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutTooBigs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutTooBigs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutNoSuchNames</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutNoSuchNames</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutBadValues</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutBadValues</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutGenErrs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutGenErrs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutGetResponses</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutGetResponses</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the <CODE>snmpOutTraps</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutTraps</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the names of the MIBs available in this SNMP protocol adaptor.
     *
     * @return An array of MIB names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the enterprise OID.
     *
     * @param oid The OID in string format "x.x.x.x".
     *
     * @exception IllegalArgumentException The string format is incorrect
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the enterprise OID. It is used by
     * {@link #snmpV1Trap snmpV1Trap} to fill the 'enterprise' field of the
     * trap request.
     *
     * @return The OID in string format "x.x.x.x".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the flag indicating if responses need to be sent in case of
     * authentication failure.
     *
     * @param enabled Flag indicating if responses need to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns <code>true</code> if this SNMP protocol adaptor sends a
     * response in case of authentication failure.
     * <P>
     * When this feature is enabled, the SNMP protocol adaptor sends a
     * response with <CODE>noSuchName</CODE> or <CODE>readOnly</CODE> when
     * the authentication failed. If the flag is disabled, the
     * SNMP protocol adaptor trashes the PDU silently.
     * <P>
     * The default behavior is to send responses.
     *
     * @return <CODE>true</CODE> if responses are sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the flag indicating if traps need to be sent in case of
     * authentication failure.
     *
     * @param enabled Flag indicating if traps need to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns <CODE>true</CODE> if authentication traps are enabled.
     * <P>
     * When this feature is enabled, the SNMP protocol adaptor sends
     * an <CODE>authenticationFailure</CODE> trap each time an
     * authentication fails.
     * <P>
     * The default behaviour is to send authentication traps.
     *
     * @return <CODE>true</CODE> if authentication traps are enabled,
     *         <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Get the user-data factory associated with this SNMP protocol adaptor.
     *
     * @return The factory object (null means no factory).
     * @see com.sun.jmx.snmp.agent.SnmpUserDataFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Set the user-data factory of this SNMP protocol adaptor.
     *
     * @param factory The factory object (null means no factory).
     * @see com.sun.jmx.snmp.agent.SnmpUserDataFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the message factory of this SNMP protocol adaptor.
     *
     * @param factory The factory object (null means the default factory).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the message factory of this SNMP protocol adaptor.
     *
     * @return The factory object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Changes the timeout to wait for an inform response from the manager.
     * @param newTimeout The timeout (in milliseconds).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the timeout to wait for an inform response from the manager.
     * By default, a timeout of 3 seconds is used.
     * @return The value of the timeout property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Changes the maximun number of times to try sending an inform
     * request before giving up.
     * @param newMaxTries The maximun number of tries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the number of times to try sending an inform request before
     * giving up.
     * By default, a maximum of 3 tries is used.
     * @return The maximun number of tries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the buffer size of this SNMP protocol adaptor.
     * This buffer size is used for both incoming request and outgoing
     * inform requests.
     *
     * @param s The buffer size.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was <CODE>ONLINE</CODE> or <CODE>STARTING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the buffer size of this SNMP protocol adaptor.
     * This buffer size is used for both incoming request and outgoing
     * inform requests.
     * By default, buffer size 1024 is used.
     *
     * @return The buffer size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the protocol of this SNMP protocol adaptor.
     *
     * @return The string "snmp".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the port used by this SNMP protocol adaptor for sending
     * inform requests.
     *
     * @param port The port number for sending SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the port used by this SNMP protocol adaptor for sending
     * inform requests. By default, port 162 is used.
     *
     * @return The port number for sending SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public void setTrapPort(int port) {

    /**
     * Sets the port used by this SNMP protocol adaptor for sending traps.
     *
     * @param port The port number for sending SNMP traps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the port used by this SNMP protocol adaptor for sending traps.
     *
     * @param port The port number for sending SNMP traps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the port used by this SNMP protocol adaptor for sending traps.
     * By default, port 162 is used.
     *
     * @return The port number for sending SNMP traps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Returns the Ip address based ACL used by this SNMP protocol adaptor.
     * @return The <CODE>InetAddressAcl</CODE> implementation.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Sets the maximum number of managers this SNMP protocol adaptor can
     * process concurrently.
     *
     * @param c The number of managers.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was <CODE>ONLINE</CODE> or <CODE>STARTING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the maximum number of managers that this SNMP protocol adaptor can
     * process concurrently.
     *
     * @return The maximum number of managers that this SNMP protocol adaptor
     *         can process concurrently.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the number of managers currently being processed by this
     * SNMP protocol adaptor.
     *
     * @return The number of managers currently being processed by this
     * SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    @Override

    /**
     * Gets the number of managers that have been processed by this
     * SNMP protocol adaptor  since its creation.
     *
     * @return The number of managers handled by this SNMP protocol adaptor
     * since its creation. This counter is not reset by the <CODE>stop</CODE>
     * method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(boolean useAcl, int port, InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port and the
     * specified <CODE>InetAddress</CODE>.
     * This constructor allows to initialize an SNMP adaptor without using
     * the ACL mechanism (by setting the <CODE>useAcl</CODE> parameter to
     * false).
     * <br>This constructor must be used in particular with a platform that
     * does not support the <CODE>java.security.acl</CODE> package like pJava.
     *
     * @param useAcl Specifies if this new SNMP adaptor uses the ACL mechanism.
     * If the specified parameter is set to <CODE>true</CODE>, this
     * constructor is equivalent to
     * <CODE>SnmpAdaptorServer((int)port,(InetAddress)addr)</CODE>.
     * @param port The port number for sending SNMP responses.
     * @param addr The IP address to bind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddressAcl acl, int port, InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port, the
     * specified  address based ACL implementation and the specified
     * <CODE>InetAddress</CODE>.
     *
     * @param acl The <CODE>InetAddressAcl</CODE> implementation.
     * @param port The port number for sending SNMP responses.
     * @param addr The IP address to bind.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddressAcl acl, InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the specified IP
     * address based ACL implementation and the specified
     * <CODE>InetAddress</CODE>.
     *
     * @param acl The <CODE>InetAddressAcl</CODE> implementation.
     * @param addr The IP address to bind.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(int port, InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port and the
     * specified <CODE>InetAddress</CODE>.
     * Use the {@link com.sun.jmx.snmp.IPAcl.SnmpAcl} default
     * implementation of the <CODE>InetAddressAcl</CODE> interface.
     *
     * @param port The port number for sending SNMP responses.
     * @param addr The IP address to bind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddressAcl acl, int port) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port and the
     * specified IP address based ACL implementation.
     *
     * @param acl The <CODE>InetAddressAcl</CODE> implementation.
     *        <code>null</code> means no ACL - everybody is authorized.
     * @param port The port number for sending SNMP responses.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddress addr) {

    /**
     * Initializes this SNMP protocol adaptor using the default port (161)
     * and the
     * specified <CODE>InetAddress</CODE>.
     * Use the {@link com.sun.jmx.snmp.IPAcl.SnmpAcl} default
     * implementation of the <CODE>InetAddressAcl</CODE> interface.
     *
     * @param addr The IP address to bind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(InetAddressAcl acl) {

    /**
     * Initializes this SNMP protocol adaptor using the default port (161)
     * and the specified IP address based ACL implementation.
     *
     * @param acl The <CODE>InetAddressAcl</CODE> implementation.
     *        <code>null</code> means no ACL - everybody is authorized.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer(int port) {

    /**
     * Initializes this SNMP protocol adaptor using the specified port.
     * Use the {@link com.sun.jmx.snmp.IPAcl.SnmpAcl} default
     * implementation of the <CODE>InetAddressAcl</CODE> interface.
     *
     * @param port The port number for sending SNMP responses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    public SnmpAdaptorServer() {

    /**
     * Initializes this SNMP protocol adaptor using the default port (161).
     * Use the {@link com.sun.jmx.snmp.IPAcl.SnmpAcl} default
     * implementation of the <CODE>InetAddressAcl</CODE> interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpSilentDrops=0;

    /**
     * The <CODE>snmpInTotalSetVars</CODE> value defined in rfc 1907 MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInTotalSetVars=0;

    /**
     * The <CODE>snmpInTotalSetVars</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInTotalReqVars=0;

    /**
     * The <CODE>snmpInTotalReqVars</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInPkts=0;

    /**
     * The <CODE>snmpInPkts</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInSetRequests=0;

    /**
     * The <CODE>snmpInSetRequests</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInGetNexts=0;

    /**
     * The <CODE>snmpInGetNexts</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInGetRequests=0;

    /**
     * The <CODE>snmpInGetRequests</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInBadVersions=0;

    /**
     * The <CODE>snmpInBadVersions</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInBadCommunityNames=0;

    /**
     * The <CODE>snmpInBadCommunityNames</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInBadCommunityUses=0;

    /**
     * The <CODE>snmpInBadCommunityUses</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpInASNParseErrs=0;

    /**
     * The <CODE>snmpInASNParseErrs</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    int snmpOutPkts=0;

    /**
     * The <CODE>snmpOutPkts</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutTooBigs=0;

    /**
     * The <CODE>snmpOutTooBigs</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutNoSuchNames=0;

    /**
     * The <CODE>snmpOutNoSuchNames</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutBadValues=0;

    /**
     * The <CODE>snmpOutBadValues</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutGenErrs=0;

    /**
     * The <CODE>snmpOutGenErrs</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int snmpOutGetResponses=0;

    /**
     * The <CODE>snmpOutGetResponses</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    int snmpOutTraps=0;

    /**
     * The <CODE>snmpOutTraps</CODE> value defined in MIB-II.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int timeout = 3 * 1000 ;

    /**
     * The amount of time to wait for an inform response from the manager.
     * The default amount of time is 3000 millisec.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int maxTries = 3 ;

    /**
     * Number of times to try an inform request before giving up.
     * The default number is 3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private transient boolean         useAcl = true;

    /**
     * Whether ACL must be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    int bufferSize = 1024;

    /**
     * The buffer size of the SNMP protocol adaptor.
     * This buffer size is used for both incoming request and outgoing
     * inform requests.
     * <BR>The default value is 1024.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private SnmpOid enterpriseOid = new SnmpOid("1.3.6.1.4.1.42");

    /**
     * The enterprise OID.
     * <BR>The default value is "1.3.6.1.4.1.42".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private boolean authTrapEnabled = true;

    /**
     * Indicates if authentication traps are enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private boolean authRespEnabled = true;

    /**
     * Indicates if the SNMP protocol adaptor sends a response in case
     * of authentication failure
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private SnmpUserDataFactory userDataFactory = null;

    /**
     * The user-data factory object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private SnmpPduFactory pduFactory = null;

    /**
     * The factory object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private InetAddressAcl ipacl = null;

    /**
     * The IP address based ACL used by this SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    InetAddress address = null;

    /**
     * The <CODE>InetAddress</CODE> used when creating the datagram socket.
     * <BR>It is specified when creating the SNMP protocol adaptor.
     * If not specified, the local host machine is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int                 informPort = 162;

    /**
     * Port number for sending SNMP inform requests.
     * <BR>The default value is 162.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
    private int                 trapPort = 162;

    /**
     * Port number for sending SNMP traps.
     * <BR>The default value is 162.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServer.java
public class SnmpAdaptorServer extends CommunicatorServer

/**
 * Implements an adaptor on top of the SNMP protocol.
 * <P>
 * When this SNMP protocol adaptor is started it creates a datagram socket
 * and is able to receive requests and send traps or inform requests.
 * When it is stopped, the socket is closed and neither requests
 * and nor traps/inform request are processed.
 * <P>
 * The default port number of the socket is 161. This default value can be
 * changed by specifying a port number:
 * <UL>
 * <LI>in the object constructor</LI>
 * <LI>using the {@link com.sun.jmx.snmp.daemon.CommunicatorServer#setPort
 *     setPort} method before starting the adaptor</LI>
 * </UL>
 * The default object name is defined by {@link
 * com.sun.jmx.snmp.ServiceName#DOMAIN com.sun.jmx.snmp.ServiceName.DOMAIN}
 * and {@link com.sun.jmx.snmp.ServiceName#SNMP_ADAPTOR_SERVER
 * com.sun.jmx.snmp.ServiceName.SNMP_ADAPTOR_SERVER}.
 * <P>
 * The SNMP protocol adaptor supports versions 1 and 2 of the SNMP protocol
 * in a stateless way: when it receives a v1 request, it replies with a v1
 * response, when it receives a v2 request it replies with a v2 response.
 * <BR>The method {@link #snmpV1Trap snmpV1Trap} sends traps using SNMP v1
 * format.
 * The method {@link #snmpV2Trap snmpV2Trap} sends traps using SNMP v2 format.
 * The method {@link #snmpInformRequest snmpInformRequest} sends inform
 * requests using SNMP v2 format.
 * <P>
 * To receive data packets, the SNMP protocol adaptor uses a buffer
 * which size can be configured using the property <CODE>bufferSize</CODE>
 * (default value is 1024).
 * Packets which do not fit into the buffer are rejected.
 * Increasing <CODE>bufferSize</CODE> allows the exchange of bigger packets.
 * However, the underlying networking system may impose a limit on the size
 * of UDP packets.
 * Packets which size exceed this limit will be rejected, no matter what
 * the value of <CODE>bufferSize</CODE> actually is.
 * <P>
 * An SNMP protocol adaptor may serve several managers concurrently. The
 * number of concurrent managers can be limited using the property
 * <CODE>maxActiveClientCount</CODE>.
 * <p>
 * The SNMP protocol adaptor specifies a default value (10) for the
 * <CODE>maxActiveClientCount</CODE> property. When the adaptor is stopped,
 * the active requests are interrupted and an error result is sent to
 * the managers.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
