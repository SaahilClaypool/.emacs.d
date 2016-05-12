_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpInformRequest snmpInformRequest(SnmpPeer peer,
                                               SnmpInformHandler cb,
                                               SnmpOid trapOid,
                                               SnmpVarBindList varBindList) throws IllegalStateException, IOException, SnmpStatusException;

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * <BR> The community string used is the one located in the <CODE>SnmpPeer</CODE> parameters (<CODE>SnmpParameters.getInformCommunity() </CODE>).
     * <BR>The variable list included in the outgoing inform is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination for this inform request.
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return The inform request object.
     *
     * @exception IllegalStateException  This method has been invoked while the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the inform request.
     * @exception SnmpStatusException If the inform request exceeds the limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpInformRequest snmpInformRequest(InetAddress address, String cs, SnmpInformHandler cb,
                                               SnmpOid trapOid, SnmpVarBindList varBindList)

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform is sent to the specified <CODE>InetAddress</CODE> destination
     * using the specified community string.
     * <BR>The variable list included in the outgoing inform request is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param address The <CODE>InetAddress</CODE> destination for this inform request.
     * @param cs The community string to be used for the inform request.
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return The inform request object.
     *
     * @exception IllegalStateException  This method has been invoked while the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the inform request.
     * @exception SnmpStatusException If the inform request exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Vector<?> snmpInformRequest(SnmpInformHandler cb, SnmpOid trapOid,
            SnmpVarBindList varBindList)

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform request is sent to each destination defined in the ACL file (if available).
     * If no ACL file or no destinations are available, the inform request is sent to the local host.
     * <BR>The variable list included in the outgoing inform request is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return A vector of {@link com.sun.jmx.snmp.daemon.SnmpInformRequest} objects.
     * <P>If there is no destination host for this inform request, the returned vector will be empty.
     *
     * @exception IllegalStateException  This method has been invoked while the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the inform request.
     * @exception SnmpStatusException If the inform request exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpPduTrap(SnmpPeer peer,
                            SnmpPduPacket pdu)

    /**
     * Send the specified trap PDU to the passed <CODE>SnmpPeer</CODE>.
     * @param peer The destination peer. The Read community string is used of <CODE>SnmpParameters</CODE> is used as the trap community string.
     * @param pdu The pdu to send.
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpPduTrap(InetAddress address, SnmpPduPacket pdu)

    /**
     * Send the specified trap PDU to the passed <CODE>InetAddress</CODE>.
     * @param address The destination address.
     * @param pdu The pdu to send.
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV2Trap(InetAddress address, String cs, SnmpOid trapOid, SnmpVarBindList varBindList)

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE> destination
     * using the specified community string (and the ACL file is not used).
     * <BR>The variable list included in the outgoing trap is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     *
     * @param address The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV2Trap(SnmpOid trapOid, SnmpVarBindList varBindList) throws IOException, SnmpStatusException;

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to each destination defined in the ACL file (if available).
     * If no ACL file or no destinations are available, the trap is sent to the local host.
     * <BR>The variable list included in the outgoing trap is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     *
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV2Trap(SnmpPeer peer,
                           SnmpOid trapOid,
                           SnmpVarBindList varBindList,
                           SnmpTimeticks time) throws IOException, SnmpStatusException;

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * <BR>The community string used is the one located in the <CODE>SnmpPeer</CODE> parameters (<CODE>SnmpParameters.getRdCommunity() </CODE>).
     * <BR>The variable list included in the outgoing trap is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with the value specified by <CODE>time</CODE>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination of the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV1Trap(SnmpPeer peer,
                           SnmpIpAddress agentAddr,
                           SnmpOid enterpOid,
                           int generic,
                           int specific,
                           SnmpVarBindList varBindList,
                           SnmpTimeticks time) throws IOException, SnmpStatusException;

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * The community string used is the one located in the <CODE>SnmpPeer</CODE> parameters (<CODE>SnmpParameters.getRdCommunity() </CODE>).
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
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV1Trap(InetAddress address, String cs, int generic, int specific, SnmpVarBindList varBindList)

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE> destination
     * using the specified community string (and the ACL file is not used).
     *
     * @param address The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV1Trap(int generic, int specific, SnmpVarBindList varBindList) throws IOException, SnmpStatusException;

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to each destination defined in the ACL file (if available).
     * If no ACL file or no destinations are available, the trap is sent to the local host.
     *
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public boolean removeMib(SnmpMibAgent mib);

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     * This method is called automatically by {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptor(SnmpMibHandler)}
     * and {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptorName(ObjectName)}
     * and should not be called directly.
     *
     * @param mib The MIB to be removed.
     *
     * @return <code>true</code> if the specified <CODE>mib</CODE> was a MIB included in the SNMP MIB handler,
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpMibHandler addMib(SnmpMibAgent mib, SnmpOid[] oids) throws IllegalArgumentException;

    /**
     * Adds a new MIB in the SNMP MIB handler.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpMibHandler addMib(SnmpMibAgent mib) throws IllegalArgumentException;

    /**
     * Adds a new MIB in the SNMP MIB handler.
     * This method is called automatically by {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptor(SnmpMibHandler)}
     * and {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptorName(ObjectName)}
     * and should not be called directly.
     *
     * @param mib The MIB to add.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpProxyDrops();

    /**
     * Returns the <CODE>snmpProxyDrops</CODE> value defined in rfc 1907 NMPv2-MIB .
     *
     * @return The <CODE>snmpProxyDrops</CODE> value.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpSilentDrops();

    /**
     * Returns the <CODE>snmpSilentDrops</CODE> value defined in rfc 1907 NMPv2-MIB .
     *
     * @return The <CODE>snmpSilentDrops</CODE> value.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInTotalReqVars();

    /**
     * Returns the <CODE>snmpInTotalReqVars</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInTotalReqVars</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInTotalSetVars();

    /**
     * Returns the <CODE>snmpInTotalSetVars</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInTotalSetVars</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInSetRequests();

    /**
     * Returns the <CODE>snmpInSetRequests</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInSetRequests</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInGetNexts();

    /**
     * Returns the <CODE>snmpInGetNexts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInGetNexts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInGetRequests();

    /**
     * Returns the <CODE>snmpInGetRequests</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInGetRequests</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInPkts();

    /**
     * Returns the <CODE>snmpInPkts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInPkts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutPkts();

    /**
     * Returns the <CODE>snmpOutPkts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutPkts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInBadVersions();

    /**
     * Returns the <CODE>snmpInBadVersions</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadVersions</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInBadCommunityNames();

    /**
     * Returns the <CODE>snmpInBadCommunityNames</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadCommunityNames</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInBadCommunityUses();

    /**
     * Returns the <CODE>snmpInBadCommunityUses</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadCommunityUses</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInASNParseErrs();

    /**
     * Returns the <CODE>snmpInASNParseErrs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInASNParseErrs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutTooBigs();

    /**
     * Returns the <CODE>snmpOutTooBigs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutTooBigs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutNoSuchNames();

    /**
     * Returns the <CODE>snmpOutNoSuchNames</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutNoSuchNames</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutBadValues();

    /**
     * Returns the <CODE>snmpOutBadValues</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutBadValues</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutGenErrs();

    /**
     * Returns the <CODE>snmpOutGenErrs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutGenErrs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutGetResponses();

    /**
     * Returns the <CODE>snmpOutGetResponses</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutGetResponses</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutTraps();

    /**
     * Returns the <CODE>snmpOutTraps</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutTraps</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public String[] getMibs();

    /**
     * Returns the names of the MIBs available in this SNMP protocol adaptor.
     *
     * @return An array of MIB names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setEnterpriseOid(String oid) throws IllegalArgumentException;

    /**
     * Sets the enterprise OID.
     *
     * @param oid The OID in string format "x.x.x.x".
     *
     * @exception IllegalArgumentException The string format is incorrect
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public String getEnterpriseOid();

    /**
     * Returns the enterprise OID. It is used by {@link #snmpV1Trap snmpV1Trap} to fill
     * the 'enterprise' field of the trap request.
     *
     * @return The OID in string format "x.x.x.x".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setAuthRespEnabled(boolean enabled);

    /**
     * Sets the flag indicating if responses need to be sent in case of authentication failure.
     *
     * @param enabled Flag indicating if responses need to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public boolean getAuthRespEnabled();

    /**
     * Returns <code>true</code> if this SNMP protocol adaptor sends a response in case
     * of authentication failure.
     * <P>
     * When this feature is enabled, the SNMP protocol adaptor sends a response with <CODE>noSuchName</CODE>
     * or <CODE>readOnly</CODE> when the authentication failed. If the flag is disabled, the
     * SNMP protocol adaptor trashes the PDU silently.
     * <P>
     * The default behavior is to send responses.
     *
     * @return <code>true</code> if responses are sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setAuthTrapEnabled(boolean enabled);

    /**
     * Sets the flag indicating if traps need to be sent in case of authentication failure.
     *
     * @param enabled Flag indicating if traps need to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public boolean getAuthTrapEnabled();

    /**
     * Returns <CODE>true</CODE> if authentication traps are enabled.
     * <P>
     * When this feature is enabled, the SNMP protocol adaptor sends
     * an <CODE>authenticationFailure</CODE> trap each time an authentication fails.
     * <P>
     * The default behaviour is to send authentication traps.
     *
     * @return <CODE>true</CODE> if authentication traps are enabled, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpUserDataFactory getUserDataFactory();

    /**
     * Get the user-data factory associated with this SNMP protocol adaptor.
     *
     * @return The factory object (null means no factory).
     * @see com.sun.jmx.snmp.agent.SnmpUserDataFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setUserDataFactory(SnmpUserDataFactory factory);

    /**
     * Set the user-data factory of this SNMP protocol adaptor.
     *
     * @param factory The factory object (null means no factory).
     * @see com.sun.jmx.snmp.agent.SnmpUserDataFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setPduFactory(SnmpPduFactory factory);

    /**
     * Sets the message factory of this SNMP protocol adaptor.
     *
     * @param factory The factory object (null means the default factory).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpPduFactory getPduFactory();

    /**
     * Returns the message factory of this SNMP protocol adaptor.
     *
     * @return The factory object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setTimeout(int newTimeout);

    /**
     * Changes the timeout to wait for an inform response from the manager.
     * @param newTimeout The timeout (in milliseconds).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getTimeout();

    /**
     * Gets the timeout to wait for an inform response from the manager.
     * @return The value of the timeout property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setMaxTries(int newMaxTries);

    /**
     * Changes the maximun number of times to try sending an inform request before giving up.
     * @param newMaxTries The maximun number of tries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getMaxTries();

    /**
     * Gets the number of times to try sending an inform request before giving up.
     * @return The maximun number of tries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setBufferSize(Integer s) throws java.lang.IllegalStateException;

    /**
     * Sets the buffer size of this SNMP protocol adaptor.
     *
     * @param s The buffer size.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was <CODE>ONLINE</CODE> or <CODE>STARTING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Integer getBufferSize();

    /**
     * Returns the buffer size of this SNMP protocol adaptor.
     * By default, buffer size 1024 is used.
     *
     * @return The buffer size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    @Override

    /**
     * Returns the protocol of this SNMP protocol adaptor.
     *
     * @return The string "snmp".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setMaxActiveClientCount(int c) throws java.lang.IllegalStateException;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getMaxActiveClientCount();

    /**
     * Gets the maximum number of managers that this SNMP protocol adaptor can
     * process concurrently.
     *
     * @return The maximum number of managers that this SNMP protocol adaptor can
     * process concurrently.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getActiveClientCount();

    /**
     * Gets the number of managers currently being processed by this
     * SNMP protocol adaptor.
     *
     * @return The number of managers currently being processed by this
     * SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getServedClientCount();

    /**
     * Gets the number of managers that have been processed by this SNMP protocol adaptor
     * since its creation.
     *
     * @return The number of managers handled by this SNMP protocol adaptor
     * since its creation. This counter is not reset by the <CODE>stop</CODE> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setInformPort(int port);

    /**
     * Sets the port used by this SNMP protocol adaptor for sending inform requests.
     *
     * @param port The port number for sending SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getInformPort();

    /**
     * Returns the port used by this SNMP protocol adaptor for sending inform requests.
     * By default, port 162 is used.
     *
     * @return The port number for sending SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setTrapPort(Integer port);

    /**
     * Sets the port used by this SNMP protocol adaptor for sending traps.
     *
     * @param port The port number for sending SNMP traps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public InetAddressAcl getInetAddressAcl();

    /**
     * Returns the Ip address based ACL used by this SNMP protocol adaptor.
     * @return The <CODE>InetAddressAcl</CODE> implementation.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
public interface SnmpAdaptorServerMBean extends CommunicatorServerMBean {

/**
 * Exposes the remote management interface of the {@link SnmpAdaptorServer} MBean.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpInformRequest snmpInformRequest(SnmpPeer peer,
                                               SnmpInformHandler cb,
                                               SnmpOid trapOid,
                                               SnmpVarBindList varBindList) throws IllegalStateException, IOException, SnmpStatusException;

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * <BR> The community string used is the one located in the <CODE>SnmpPeer</CODE> parameters (<CODE>SnmpParameters.getInformCommunity() </CODE>).
     * <BR>The variable list included in the outgoing inform is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination for this inform request.
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return The inform request object.
     *
     * @exception IllegalStateException  This method has been invoked while the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the inform request.
     * @exception SnmpStatusException If the inform request exceeds the limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpInformRequest snmpInformRequest(InetAddress address, String cs, SnmpInformHandler cb,
                                               SnmpOid trapOid, SnmpVarBindList varBindList)

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform is sent to the specified <CODE>InetAddress</CODE> destination
     * using the specified community string.
     * <BR>The variable list included in the outgoing inform request is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param address The <CODE>InetAddress</CODE> destination for this inform request.
     * @param cs The community string to be used for the inform request.
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return The inform request object.
     *
     * @exception IllegalStateException  This method has been invoked while the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the inform request.
     * @exception SnmpStatusException If the inform request exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Vector<?> snmpInformRequest(SnmpInformHandler cb, SnmpOid trapOid,
            SnmpVarBindList varBindList)

    /**
     * Sends an inform using SNMP V2 inform request format.
     * <BR>The inform request is sent to each destination defined in the ACL file (if available).
     * If no ACL file or no destinations are available, the inform request is sent to the local host.
     * <BR>The variable list included in the outgoing inform request is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     * To send an inform request, the SNMP adaptor server must be active.
     *
     * @param cb The callback that is invoked when a request is complete.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @return A vector of {@link com.sun.jmx.snmp.daemon.SnmpInformRequest} objects.
     * <P>If there is no destination host for this inform request, the returned vector will be empty.
     *
     * @exception IllegalStateException  This method has been invoked while the SNMP adaptor server was not active.
     * @exception IOException An I/O error occurred while sending the inform request.
     * @exception SnmpStatusException If the inform request exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpPduTrap(SnmpPeer peer,
                            SnmpPduPacket pdu)

    /**
     * Send the specified trap PDU to the passed <CODE>SnmpPeer</CODE>.
     * @param peer The destination peer. The Read community string is used of <CODE>SnmpParameters</CODE> is used as the trap community string.
     * @param pdu The pdu to send.
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpPduTrap(InetAddress address, SnmpPduPacket pdu)

    /**
     * Send the specified trap PDU to the passed <CODE>InetAddress</CODE>.
     * @param address The destination address.
     * @param pdu The pdu to send.
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV2Trap(InetAddress address, String cs, SnmpOid trapOid, SnmpVarBindList varBindList)

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE> destination
     * using the specified community string (and the ACL file is not used).
     * <BR>The variable list included in the outgoing trap is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     *
     * @param address The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV2Trap(SnmpOid trapOid, SnmpVarBindList varBindList) throws IOException, SnmpStatusException;

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to each destination defined in the ACL file (if available).
     * If no ACL file or no destinations are available, the trap is sent to the local host.
     * <BR>The variable list included in the outgoing trap is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with its current value
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     *
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV2Trap(SnmpPeer peer,
                           SnmpOid trapOid,
                           SnmpVarBindList varBindList,
                           SnmpTimeticks time) throws IOException, SnmpStatusException;

    /**
     * Sends a trap using SNMP V2 trap format.
     * <BR>The trap is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * <BR>The community string used is the one located in the <CODE>SnmpPeer</CODE> parameters (<CODE>SnmpParameters.getRdCommunity() </CODE>).
     * <BR>The variable list included in the outgoing trap is composed of the following items:
     * <UL>
     * <LI><CODE>sysUpTime.0</CODE> with the value specified by <CODE>time</CODE>
     * <LI><CODE>snmpTrapOid.0</CODE> with the value specified by <CODE>trapOid</CODE>
     * <LI><CODE>all the (oid,values)</CODE> from the specified <CODE>varBindList</CODE>
     * </UL>
     *
     * @param peer The <CODE>SnmpPeer</CODE> destination of the trap.
     * @param trapOid The OID identifying the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     * @param time The time stamp (overwrite the current time).
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV1Trap(SnmpPeer peer,
                           SnmpIpAddress agentAddr,
                           SnmpOid enterpOid,
                           int generic,
                           int specific,
                           SnmpVarBindList varBindList,
                           SnmpTimeticks time) throws IOException, SnmpStatusException;

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>SnmpPeer</CODE> destination.
     * The community string used is the one located in the <CODE>SnmpPeer</CODE> parameters (<CODE>SnmpParameters.getRdCommunity() </CODE>).
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
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV1Trap(InetAddress address, String cs, int generic, int specific, SnmpVarBindList varBindList)

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to the specified <CODE>InetAddress</CODE> destination
     * using the specified community string (and the ACL file is not used).
     *
     * @param address The <CODE>InetAddress</CODE> destination of the trap.
     * @param cs The community string to be used for the trap.
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void snmpV1Trap(int generic, int specific, SnmpVarBindList varBindList) throws IOException, SnmpStatusException;

    /**
     * Sends a trap using SNMP V1 trap format.
     * <BR>The trap is sent to each destination defined in the ACL file (if available).
     * If no ACL file or no destinations are available, the trap is sent to the local host.
     *
     * @param generic The generic number of the trap.
     * @param specific The specific number of the trap.
     * @param varBindList A list of <CODE>SnmpVarBind</CODE> instances or null.
     *
     * @exception IOException An I/O error occurred while sending the trap.
     * @exception SnmpStatusException If the trap exceeds the limit defined by <CODE>bufferSize</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public boolean removeMib(SnmpMibAgent mib);

    /**
     * Removes the specified MIB from the SNMP protocol adaptor.
     * This method is called automatically by {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptor(SnmpMibHandler)}
     * and {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptorName(ObjectName)}
     * and should not be called directly.
     *
     * @param mib The MIB to be removed.
     *
     * @return <code>true</code> if the specified <CODE>mib</CODE> was a MIB included in the SNMP MIB handler,
     * <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpMibHandler addMib(SnmpMibAgent mib, SnmpOid[] oids) throws IllegalArgumentException;

    /**
     * Adds a new MIB in the SNMP MIB handler.
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpMibHandler addMib(SnmpMibAgent mib) throws IllegalArgumentException;

    /**
     * Adds a new MIB in the SNMP MIB handler.
     * This method is called automatically by {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptor(SnmpMibHandler)}
     * and {@link com.sun.jmx.snmp.agent.SnmpMibAgent#setSnmpAdaptorName(ObjectName)}
     * and should not be called directly.
     *
     * @param mib The MIB to add.
     *
     * @return A reference to the SNMP MIB handler.
     *
     * @exception IllegalArgumentException If the parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpProxyDrops();

    /**
     * Returns the <CODE>snmpProxyDrops</CODE> value defined in rfc 1907 NMPv2-MIB .
     *
     * @return The <CODE>snmpProxyDrops</CODE> value.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpSilentDrops();

    /**
     * Returns the <CODE>snmpSilentDrops</CODE> value defined in rfc 1907 NMPv2-MIB .
     *
     * @return The <CODE>snmpSilentDrops</CODE> value.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInTotalReqVars();

    /**
     * Returns the <CODE>snmpInTotalReqVars</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInTotalReqVars</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInTotalSetVars();

    /**
     * Returns the <CODE>snmpInTotalSetVars</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInTotalSetVars</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInSetRequests();

    /**
     * Returns the <CODE>snmpInSetRequests</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInSetRequests</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInGetNexts();

    /**
     * Returns the <CODE>snmpInGetNexts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInGetNexts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInGetRequests();

    /**
     * Returns the <CODE>snmpInGetRequests</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInGetRequests</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInPkts();

    /**
     * Returns the <CODE>snmpInPkts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInPkts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutPkts();

    /**
     * Returns the <CODE>snmpOutPkts</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutPkts</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInBadVersions();

    /**
     * Returns the <CODE>snmpInBadVersions</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadVersions</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInBadCommunityNames();

    /**
     * Returns the <CODE>snmpInBadCommunityNames</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadCommunityNames</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInBadCommunityUses();

    /**
     * Returns the <CODE>snmpInBadCommunityUses</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInBadCommunityUses</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpInASNParseErrs();

    /**
     * Returns the <CODE>snmpInASNParseErrs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpInASNParseErrs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutTooBigs();

    /**
     * Returns the <CODE>snmpOutTooBigs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutTooBigs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutNoSuchNames();

    /**
     * Returns the <CODE>snmpOutNoSuchNames</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutNoSuchNames</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutBadValues();

    /**
     * Returns the <CODE>snmpOutBadValues</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutBadValues</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutGenErrs();

    /**
     * Returns the <CODE>snmpOutGenErrs</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutGenErrs</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutGetResponses();

    /**
     * Returns the <CODE>snmpOutGetResponses</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutGetResponses</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Long getSnmpOutTraps();

    /**
     * Returns the <CODE>snmpOutTraps</CODE> value defined in MIB-II.
     *
     * @return The <CODE>snmpOutTraps</CODE> value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public String[] getMibs();

    /**
     * Returns the names of the MIBs available in this SNMP protocol adaptor.
     *
     * @return An array of MIB names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setEnterpriseOid(String oid) throws IllegalArgumentException;

    /**
     * Sets the enterprise OID.
     *
     * @param oid The OID in string format "x.x.x.x".
     *
     * @exception IllegalArgumentException The string format is incorrect
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public String getEnterpriseOid();

    /**
     * Returns the enterprise OID. It is used by {@link #snmpV1Trap snmpV1Trap} to fill
     * the 'enterprise' field of the trap request.
     *
     * @return The OID in string format "x.x.x.x".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setAuthRespEnabled(boolean enabled);

    /**
     * Sets the flag indicating if responses need to be sent in case of authentication failure.
     *
     * @param enabled Flag indicating if responses need to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public boolean getAuthRespEnabled();

    /**
     * Returns <code>true</code> if this SNMP protocol adaptor sends a response in case
     * of authentication failure.
     * <P>
     * When this feature is enabled, the SNMP protocol adaptor sends a response with <CODE>noSuchName</CODE>
     * or <CODE>readOnly</CODE> when the authentication failed. If the flag is disabled, the
     * SNMP protocol adaptor trashes the PDU silently.
     * <P>
     * The default behavior is to send responses.
     *
     * @return <code>true</code> if responses are sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setAuthTrapEnabled(boolean enabled);

    /**
     * Sets the flag indicating if traps need to be sent in case of authentication failure.
     *
     * @param enabled Flag indicating if traps need to be sent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public boolean getAuthTrapEnabled();

    /**
     * Returns <CODE>true</CODE> if authentication traps are enabled.
     * <P>
     * When this feature is enabled, the SNMP protocol adaptor sends
     * an <CODE>authenticationFailure</CODE> trap each time an authentication fails.
     * <P>
     * The default behaviour is to send authentication traps.
     *
     * @return <CODE>true</CODE> if authentication traps are enabled, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpUserDataFactory getUserDataFactory();

    /**
     * Get the user-data factory associated with this SNMP protocol adaptor.
     *
     * @return The factory object (null means no factory).
     * @see com.sun.jmx.snmp.agent.SnmpUserDataFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setUserDataFactory(SnmpUserDataFactory factory);

    /**
     * Set the user-data factory of this SNMP protocol adaptor.
     *
     * @param factory The factory object (null means no factory).
     * @see com.sun.jmx.snmp.agent.SnmpUserDataFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setPduFactory(SnmpPduFactory factory);

    /**
     * Sets the message factory of this SNMP protocol adaptor.
     *
     * @param factory The factory object (null means the default factory).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public SnmpPduFactory getPduFactory();

    /**
     * Returns the message factory of this SNMP protocol adaptor.
     *
     * @return The factory object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setTimeout(int newTimeout);

    /**
     * Changes the timeout to wait for an inform response from the manager.
     * @param newTimeout The timeout (in milliseconds).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getTimeout();

    /**
     * Gets the timeout to wait for an inform response from the manager.
     * @return The value of the timeout property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setMaxTries(int newMaxTries);

    /**
     * Changes the maximun number of times to try sending an inform request before giving up.
     * @param newMaxTries The maximun number of tries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getMaxTries();

    /**
     * Gets the number of times to try sending an inform request before giving up.
     * @return The maximun number of tries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setBufferSize(Integer s) throws java.lang.IllegalStateException;

    /**
     * Sets the buffer size of this SNMP protocol adaptor.
     *
     * @param s The buffer size.
     *
     * @exception java.lang.IllegalStateException This method has been invoked
     * while the communicator was <CODE>ONLINE</CODE> or <CODE>STARTING</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public Integer getBufferSize();

    /**
     * Returns the buffer size of this SNMP protocol adaptor.
     * By default, buffer size 1024 is used.
     *
     * @return The buffer size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    @Override

    /**
     * Returns the protocol of this SNMP protocol adaptor.
     *
     * @return The string "snmp".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setMaxActiveClientCount(int c) throws java.lang.IllegalStateException;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getMaxActiveClientCount();

    /**
     * Gets the maximum number of managers that this SNMP protocol adaptor can
     * process concurrently.
     *
     * @return The maximum number of managers that this SNMP protocol adaptor can
     * process concurrently.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getActiveClientCount();

    /**
     * Gets the number of managers currently being processed by this
     * SNMP protocol adaptor.
     *
     * @return The number of managers currently being processed by this
     * SNMP protocol adaptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getServedClientCount();

    /**
     * Gets the number of managers that have been processed by this SNMP protocol adaptor
     * since its creation.
     *
     * @return The number of managers handled by this SNMP protocol adaptor
     * since its creation. This counter is not reset by the <CODE>stop</CODE> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setInformPort(int port);

    /**
     * Sets the port used by this SNMP protocol adaptor for sending inform requests.
     *
     * @param port The port number for sending SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public int getInformPort();

    /**
     * Returns the port used by this SNMP protocol adaptor for sending inform requests.
     * By default, port 162 is used.
     *
     * @return The port number for sending SNMP inform requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public void setTrapPort(Integer port);

    /**
     * Sets the port used by this SNMP protocol adaptor for sending traps.
     *
     * @param port The port number for sending SNMP traps.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
    public InetAddressAcl getInetAddressAcl();

    /**
     * Returns the Ip address based ACL used by this SNMP protocol adaptor.
     * @return The <CODE>InetAddressAcl</CODE> implementation.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/SnmpAdaptorServerMBean.java
public interface SnmpAdaptorServerMBean extends CommunicatorServerMBean {

/**
 * Exposes the remote management interface of the {@link SnmpAdaptorServer} MBean.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
