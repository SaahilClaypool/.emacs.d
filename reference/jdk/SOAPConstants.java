_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final QName SOAP_RECEIVER_FAULT =

    /**
     * SOAP 1.2 Receiver Fault
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final QName SOAP_SENDER_FAULT =

    /**
     * SOAP 1.2 Sender Fault
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final QName SOAP_DATAENCODINGUNKNOWN_FAULT =

    /**
     * SOAP 1.2 DataEncodingUnknown Fault
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final QName SOAP_MUSTUNDERSTAND_FAULT =

    /**
     * SOAP 1.2 MustUnderstand Fault
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final QName SOAP_VERSIONMISMATCH_FAULT =

    /**
     * SOAP 1.2 VersionMismatch Fault
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String SOAP_ENV_PREFIX = "env";

    /**
     * The default namespace prefix for http://www.w3.org/2003/05/soap-envelope
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The URI identifying the ultimate receiver of the SOAP 1.2 message.
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The URI specifying the role None in SOAP 1.2.
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The URI identifying the next application processing a SOAP request as the intended
     * role for a SOAP 1.2 header entry (see section 2.2 of part 1 of the SOAP 1.2
     * specification).
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The URI identifying the next application processing a SOAP request as the intended
     * actor for a SOAP 1.1 header entry (see section 4.2.2 of the SOAP 1.1 specification).
     * <p>
     * This value can be passed to
     * {@link SOAPHeader#examineMustUnderstandHeaderElements(String)},
     * {@link SOAPHeader#examineHeaderElements(String)} and
     * {@link SOAPHeader#extractHeaderElements(String)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The media type  of the <code>Content-Type</code> MIME header in SOAP 1.2.
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The media type  of the <code>Content-Type</code> MIME header in SOAP 1.1.
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The namespace identifier for the SOAP 1.2 encoding.
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The namespace identifier for the SOAP 1.1 encoding.
     * An attribute named <code>encodingStyle</code> in the
     * <code>URI_NS_SOAP_ENVELOPE</code> namespace and set to the value
     * <code>URI_NS_SOAP_ENCODING</code> can be added to an element to indicate
     * that it is encoded using the rules in section 5 of the SOAP 1.1
     * specification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The namespace identifier for the SOAP 1.1 envelope, All SOAPElements in this
     * namespace are defined by the SOAP 1.1 specification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The namespace identifier for the SOAP 1.2 envelope.
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String

    /**
     * The namespace identifier for the SOAP 1.1 envelope.
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String DEFAULT_SOAP_PROTOCOL = SOAP_1_1_PROTOCOL;

    /**
     * The default protocol: SOAP 1.1 for backwards compatibility.
     *
     * @since SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String SOAP_1_2_PROTOCOL = "SOAP 1.2 Protocol";

    /**
     * Used to create <code>MessageFactory</code> instances that create
     * <code>SOAPMessages</code> whose behavior supports the SOAP 1.2
     * specification
     *
     * @since  SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
    public static final String SOAP_1_1_PROTOCOL = "SOAP 1.1 Protocol";

    /**
     * Used to create <code>MessageFactory</code> instances that create
     * <code>SOAPMessages</code> whose behavior supports the SOAP 1.1  specification.
     *
     * @since  SAAJ 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/SOAPConstants.java
public interface SOAPConstants {

/**
 * The definition of constants pertaining to the SOAP protocol.
 */
