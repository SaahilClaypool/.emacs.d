_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV3AccessControlModel = snmpVersionThree;

    /**
     * Snmp V3 access control model id (3).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV2AccessControlModel = snmpVersionTwo;

    /**
     * Snmp V2 access control model id (1).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV1AccessControlModel = snmpVersionOne;

    /**
     * Snmp V1 access control model id (0).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV2MsgProcessingModel = snmpVersionTwo;

    /**
     * Snmp V2 msg processing model id (1).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpUsmSecurityModel = 3;

    /**
     * Snmp V3 security model id (3).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV1SecurityModel = 1;

    /**
     * Snmp V1 security model id (1).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpUsmInvalidTimeliness = (0xF8);

    /**
     * SNMP Usm V3 Error code specific to the API.
     * <P>Used if the timeliness params are invalid.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpUsmBadEngineId = (0xF7);

    /**
     * SNMP Usm V3 Error code specific to the API.
     * <P>Used if the authoritative engine Id is not associated to the current user.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpBadSecurityLevel = (0xF9);

    /**
     * SNMP V3 Error code specific to the API.
     * <P>Used if privacy is not supported for the current user.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpPrivNotSupported = (0xF6);

    /**
     * SNMP V3 Error code specific to the API.
     * <P>Used if privacy is not supported for the current user.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpAuthNotSupported = (0xF5);

    /**
     * SNMP V3 Error code specific to the API.
     * <P>Used if authentication is not supported for the current user.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpUnknownPrincipal    = (0xF4);

    /**
     * SNMP V3 Error code specific to the API.
     * <P>Used if the used principal is unknown.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpWrongSnmpVersion    = (0xF3) ;

    /**
     * Error code specific to the API.
     * <P>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqUnknownError     = (0xF2) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU fails at encoding time or sending time for a reason
     * not covered by the previous error codes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqSocketIOError    = (0xF1) ;

    /**
     * Error code specific to the API.
     * <P>Used if an I/O error occurs when sending the request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqInternalError    = (0xF0) ;

    /**
     * Error code specific to the API.
     * <P>Used if an internal error occurs when processing the request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqTooBigImpossible = (0xE8) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU fails with a <CODE>tooBig</CODE> error status
     * but its <CODE>varBindList</CODE> contains just one element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqHandleTooBig     = (0xE7) ;

    /**
     * Error code specific to the API.
     * <P>Used if the size of the request PDU <CODE>varBindList</CODE> exceeds
     * the <CODE>maxVarBindLimit</CODE> limit defined in the
     * {@link com.sun.jmx.snmp.SnmpPeer SnmpPeer} object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqRefireAfterVbFix = (0xE6) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU is retried after a <CODE>noSuchName</CODE> error fixed.
     * This is an internal temporary status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspEndOfTable       = (0xE5) ;

    /**
     * Error code specific to the API.
     * <P>Used for the last variable returned by a <CODE>Walk</CODE> request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqPacketOverflow   = (0xE4) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU does not fit in the <CODE>maxSnmpPktSize</CODE> limit
     * defined in the {@link com.sun.jmx.snmp.SnmpPeer SnmpPeer} object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqEncodingError    = (0xE3) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU does not retreive the community string at
     * authentication encoding time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspDecodingError    = (0xE2) ;

    /**
     * Error code specific to the API.
     * <P>Used if the response to the request PDU fails at decoding time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqAborted          = (0xE1) ;

    /**
     * Error code specific to the API.
     * <P>Used if the pending request PDU is cancelled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqTimeout          = (0xE0) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU exceeds the <CODE>maxTries</CODE> limit
     * defined in the {@link com.sun.jmx.snmp.SnmpPeer SnmpPeer} object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int notInView = 22;

    /**
     * Error that is returned by VACM.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int noGroupName = 21;

    /**
     * Error that is returned by VACM.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int noSuchContext = 20;

    /**
     * Error that is returned by VACM.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int noSuchView = 19;

    /**
     * Error that is returned by VACM.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspInconsistentName    = 18;

    /**
     * Error code as defined in RFC 1448 for: <CODE>inconsistentName</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNotWritable         = 17;

    /**
     * Error code as defined in RFC 1448 for: <CODE>notWritable</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspAuthorizationError  = 16;

    /**
     * Error code as defined in RFC 1448 for: <CODE>authorizationError</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspUndoFailed          = 15;

    /**
     * Error code as defined in RFC 1448 for: <CODE>undoFailed</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspCommitFailed        = 14;

    /**
     * Error code as defined in RFC 1448 for: <CODE>commitFailed</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspResourceUnavailable = 13;

    /**
     * Error code as defined in RFC 1448 for: <CODE>resourceUnavailable</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspInconsistentValue   = 12;

    /**
     * Error code as defined in RFC 1448 for: <CODE>inconsistentValue</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNoCreation          = 11;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noCreation</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspWrongValue          = 10;

    /**
     * Error code as defined in RFC 1448 for: <CODE>wrongValue</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspWrongEncoding       = 9;

    /**
     * Error code as defined in RFC 1448 for: <CODE>wrongEncoding</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspWrongLength         = 8;

    /**
     * Error code as defined in RFC 1448 for: <CODE>wrongLength</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspWrongType           = 7;

    /**
     * Error code as defined in RFC 1448 for: <CODE>wrongType</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNoAccess            = 6;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noAccess</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspGenErr              = 5;

    /**
     * Error code as defined in RFC 1448 for: <CODE>genErr</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspReadOnly            = 4;

    /**
     * Error code as defined in RFC 1448 for: <CODE>readOnly</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspBadValue            = 3;

    /**
     * Error code as defined in RFC 1448 for: <CODE>badValue</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNoSuchName          = 2;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noSuchName</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspTooBig              = 1;

    /**
     * Error code as defined in RFC 1448 for: <CODE>tooBig</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNoError             = 0;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noError</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapEnterpriseSpecific = 6 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>enterpriseSpecific</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapEgpNeighborLoss = 5 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>egpNeighborLoss</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapAuthenticationFailure = 4 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>authenticationFailure</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapLinkUp = 3 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>linkUp</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapLinkDown = 2 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>linkDown</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapWarmStart = 1 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>warmStart</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapColdStart = 0 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>coldStart</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduReportPdu         = CtxtConsFlag|8 ;

    /**
     * Represents a <CODE>Report</CODE> PDU type (V2 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduInformRequestPdu  = CtxtConsFlag|6 ;

    /**
     * Represents an <CODE>InformRequest</CODE> PDU type (V2 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduV2TrapPdu         = CtxtConsFlag|7 ;

    /**
     * Represents a <CODE>V2Trap</CODE> PDU type (V2 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduV1TrapPdu           = CtxtConsFlag|4 ;

    /**
     * Represents a <CODE>V1Trap</CODE> PDU type (V1 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduWalkRequest      =  0xFD ;

    /**
     * Represents a <CODE>Walk</CODE> request.
     * A walk uses the <CODE>getNext</CODE> request to "walk" through a given MIB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduGetBulkRequestPdu = CtxtConsFlag|5 ;

    /**
     * Represents a <CODE>GetBulkRequest</CODE> PDU type (V2 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduSetRequestPdu     = CtxtConsFlag|3 ;

    /**
     * Represents a <CODE>SetRequest</CODE> PDU type (V1 or V2).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduGetResponsePdu    = CtxtConsFlag|2 ;

    /**
     * Represents a <CODE>GetResponse</CODE> PDU type (V1 or V2).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduGetNextRequestPdu = CtxtConsFlag|1 ;

    /**
     * Represents a <CODE>GetNextRequest</CODE> PDU type (V1 or V2).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduGetRequestPdu     = CtxtConsFlag|0 ;

    /**
     * Represents a <CODE>GetRequest</CODE> PDU type (V1 or V2).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static byte snmpVersionThree       = 3 ;

     /**
      * Represents the SNMP protocol version: <CODE>SnmpV3</CODE>.
      *
      * @since 1.5
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static byte snmpVersionTwo         = 1 ;

    /**
     * Represents the SNMP protocol version: <CODE>SnmpV2</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static byte snmpVersionOne         = 0 ;

    /**
     * Represents the SNMP protocol version: <CODE>SnmpV1</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int CtxtConsFlag      = 128|32 ;

    /**
     * ASN.1 prefix for encoding PDU types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int authPrivMask = 3;

    /**
     * Mask used to isolate authentication and privacy information within a message flag.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int authMask = 1;

    /**
     * Mask used to isolate authentication information within a message flag.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int reportableFlag = 4;

    /**
     * Flag that indicates that a report is to be sent. Value is 4, as
     * defined in RFC 2572.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int authPriv = 3;

    /**
     * Security level. Authentication, privacy. Value is 3, as defined
     * in RFC 2572.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int authNoPriv = 1;

    /**
     * Security level. Authentication, no privacy. Value is 1, as
     * defined in RFC 2572.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
public interface SnmpDefinitions {

/**
 * Contains SNMP constants related to command and response codes.
 * All members are static and can be used by any application.
 *
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV3AccessControlModel = snmpVersionThree;

    /**
     * Snmp V3 access control model id (3).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV2AccessControlModel = snmpVersionTwo;

    /**
     * Snmp V2 access control model id (1).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV1AccessControlModel = snmpVersionOne;

    /**
     * Snmp V1 access control model id (0).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV2MsgProcessingModel = snmpVersionTwo;

    /**
     * Snmp V2 msg processing model id (1).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpUsmSecurityModel = 3;

    /**
     * Snmp V3 security model id (3).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpV1SecurityModel = 1;

    /**
     * Snmp V1 security model id (1).
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpUsmInvalidTimeliness = (0xF8);

    /**
     * SNMP Usm V3 Error code specific to the API.
     * <P>Used if the timeliness params are invalid.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpUsmBadEngineId = (0xF7);

    /**
     * SNMP Usm V3 Error code specific to the API.
     * <P>Used if the authoritative engine Id is not associated to the current user.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpBadSecurityLevel = (0xF9);

    /**
     * SNMP V3 Error code specific to the API.
     * <P>Used if privacy is not supported for the current user.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpPrivNotSupported = (0xF6);

    /**
     * SNMP V3 Error code specific to the API.
     * <P>Used if privacy is not supported for the current user.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpAuthNotSupported = (0xF5);

    /**
     * SNMP V3 Error code specific to the API.
     * <P>Used if authentication is not supported for the current user.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpUnknownPrincipal    = (0xF4);

    /**
     * SNMP V3 Error code specific to the API.
     * <P>Used if the used principal is unknown.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpWrongSnmpVersion    = (0xF3) ;

    /**
     * Error code specific to the API.
     * <P>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqUnknownError     = (0xF2) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU fails at encoding time or sending time for a reason
     * not covered by the previous error codes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqSocketIOError    = (0xF1) ;

    /**
     * Error code specific to the API.
     * <P>Used if an I/O error occurs when sending the request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqInternalError    = (0xF0) ;

    /**
     * Error code specific to the API.
     * <P>Used if an internal error occurs when processing the request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqTooBigImpossible = (0xE8) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU fails with a <CODE>tooBig</CODE> error status
     * but its <CODE>varBindList</CODE> contains just one element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqHandleTooBig     = (0xE7) ;

    /**
     * Error code specific to the API.
     * <P>Used if the size of the request PDU <CODE>varBindList</CODE> exceeds
     * the <CODE>maxVarBindLimit</CODE> limit defined in the
     * {@link com.sun.jmx.snmp.SnmpPeer SnmpPeer} object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqRefireAfterVbFix = (0xE6) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU is retried after a <CODE>noSuchName</CODE> error fixed.
     * This is an internal temporary status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspEndOfTable       = (0xE5) ;

    /**
     * Error code specific to the API.
     * <P>Used for the last variable returned by a <CODE>Walk</CODE> request PDU.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqPacketOverflow   = (0xE4) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU does not fit in the <CODE>maxSnmpPktSize</CODE> limit
     * defined in the {@link com.sun.jmx.snmp.SnmpPeer SnmpPeer} object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqEncodingError    = (0xE3) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU does not retreive the community string at
     * authentication encoding time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspDecodingError    = (0xE2) ;

    /**
     * Error code specific to the API.
     * <P>Used if the response to the request PDU fails at decoding time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqAborted          = (0xE1) ;

    /**
     * Error code specific to the API.
     * <P>Used if the pending request PDU is cancelled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpReqTimeout          = (0xE0) ;

    /**
     * Error code specific to the API.
     * <P>Used if the request PDU exceeds the <CODE>maxTries</CODE> limit
     * defined in the {@link com.sun.jmx.snmp.SnmpPeer SnmpPeer} object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int notInView = 22;

    /**
     * Error that is returned by VACM.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int noGroupName = 21;

    /**
     * Error that is returned by VACM.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int noSuchContext = 20;

    /**
     * Error that is returned by VACM.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int noSuchView = 19;

    /**
     * Error that is returned by VACM.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspInconsistentName    = 18;

    /**
     * Error code as defined in RFC 1448 for: <CODE>inconsistentName</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNotWritable         = 17;

    /**
     * Error code as defined in RFC 1448 for: <CODE>notWritable</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspAuthorizationError  = 16;

    /**
     * Error code as defined in RFC 1448 for: <CODE>authorizationError</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspUndoFailed          = 15;

    /**
     * Error code as defined in RFC 1448 for: <CODE>undoFailed</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspCommitFailed        = 14;

    /**
     * Error code as defined in RFC 1448 for: <CODE>commitFailed</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspResourceUnavailable = 13;

    /**
     * Error code as defined in RFC 1448 for: <CODE>resourceUnavailable</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspInconsistentValue   = 12;

    /**
     * Error code as defined in RFC 1448 for: <CODE>inconsistentValue</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNoCreation          = 11;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noCreation</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspWrongValue          = 10;

    /**
     * Error code as defined in RFC 1448 for: <CODE>wrongValue</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspWrongEncoding       = 9;

    /**
     * Error code as defined in RFC 1448 for: <CODE>wrongEncoding</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspWrongLength         = 8;

    /**
     * Error code as defined in RFC 1448 for: <CODE>wrongLength</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspWrongType           = 7;

    /**
     * Error code as defined in RFC 1448 for: <CODE>wrongType</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNoAccess            = 6;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noAccess</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspGenErr              = 5;

    /**
     * Error code as defined in RFC 1448 for: <CODE>genErr</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspReadOnly            = 4;

    /**
     * Error code as defined in RFC 1448 for: <CODE>readOnly</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspBadValue            = 3;

    /**
     * Error code as defined in RFC 1448 for: <CODE>badValue</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNoSuchName          = 2;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noSuchName</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspTooBig              = 1;

    /**
     * Error code as defined in RFC 1448 for: <CODE>tooBig</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static int snmpRspNoError             = 0;

    /**
     * Error code as defined in RFC 1448 for: <CODE>noError</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapEnterpriseSpecific = 6 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>enterpriseSpecific</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapEgpNeighborLoss = 5 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>egpNeighborLoss</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapAuthenticationFailure = 4 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>authenticationFailure</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapLinkUp = 3 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>linkUp</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapLinkDown = 2 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>linkDown</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapWarmStart = 1 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>warmStart</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int trapColdStart = 0 ;

    /**
     * Code as defined in RFC 1157 for generic trap info in Trap-PDU: <CODE>coldStart</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduReportPdu         = CtxtConsFlag|8 ;

    /**
     * Represents a <CODE>Report</CODE> PDU type (V2 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduInformRequestPdu  = CtxtConsFlag|6 ;

    /**
     * Represents an <CODE>InformRequest</CODE> PDU type (V2 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduV2TrapPdu         = CtxtConsFlag|7 ;

    /**
     * Represents a <CODE>V2Trap</CODE> PDU type (V2 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduV1TrapPdu           = CtxtConsFlag|4 ;

    /**
     * Represents a <CODE>V1Trap</CODE> PDU type (V1 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduWalkRequest      =  0xFD ;

    /**
     * Represents a <CODE>Walk</CODE> request.
     * A walk uses the <CODE>getNext</CODE> request to "walk" through a given MIB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduGetBulkRequestPdu = CtxtConsFlag|5 ;

    /**
     * Represents a <CODE>GetBulkRequest</CODE> PDU type (V2 only).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduSetRequestPdu     = CtxtConsFlag|3 ;

    /**
     * Represents a <CODE>SetRequest</CODE> PDU type (V1 or V2).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduGetResponsePdu    = CtxtConsFlag|2 ;

    /**
     * Represents a <CODE>GetResponse</CODE> PDU type (V1 or V2).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduGetNextRequestPdu = CtxtConsFlag|1 ;

    /**
     * Represents a <CODE>GetNextRequest</CODE> PDU type (V1 or V2).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int pduGetRequestPdu     = CtxtConsFlag|0 ;

    /**
     * Represents a <CODE>GetRequest</CODE> PDU type (V1 or V2).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static byte snmpVersionThree       = 3 ;

     /**
      * Represents the SNMP protocol version: <CODE>SnmpV3</CODE>.
      *
      * @since 1.5
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static byte snmpVersionTwo         = 1 ;

    /**
     * Represents the SNMP protocol version: <CODE>SnmpV2</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    final public static byte snmpVersionOne         = 0 ;

    /**
     * Represents the SNMP protocol version: <CODE>SnmpV1</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public final static int CtxtConsFlag      = 128|32 ;

    /**
     * ASN.1 prefix for encoding PDU types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int authPrivMask = 3;

    /**
     * Mask used to isolate authentication and privacy information within a message flag.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int authMask = 1;

    /**
     * Mask used to isolate authentication information within a message flag.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int reportableFlag = 4;

    /**
     * Flag that indicates that a report is to be sent. Value is 4, as
     * defined in RFC 2572.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int authPriv = 3;

    /**
     * Security level. Authentication, privacy. Value is 3, as defined
     * in RFC 2572.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
    public static final int authNoPriv = 1;

    /**
     * Security level. Authentication, no privacy. Value is 1, as
     * defined in RFC 2572.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpDefinitions.java
public interface SnmpDefinitions {

/**
 * Contains SNMP constants related to command and response codes.
 * All members are static and can be used by any application.
 *
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
