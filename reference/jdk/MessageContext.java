_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public Scope getScope(String  name);

    /**
     * Gets the scope of a property.
     *
     * @param name Name of the property
     * @return Scope of the property
     * @throws java.lang.IllegalArgumentException if a non-existant
     *             property name is specified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public void setScope(String name,  Scope scope);

    /**
     * Sets the scope of a property.
     *
     * @param name Name of the property associated with the
     *             <code>MessageContext</code>
     * @param scope Desired scope of the property
     * @throws java.lang.IllegalArgumentException if an illegal
     *             property name is specified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public enum Scope {APPLICATION, HANDLER};

    /**
     * Property scope. Properties scoped as <code>APPLICATION</code> are
     * visible to handlers,
     * client applications and service endpoints; properties scoped as
     * <code>HANDLER</code>
     * are only normally visible to handlers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String REFERENCE_PARAMETERS =

    /**
     * Standard property: WS Addressing Reference Parameters.
     * The list MUST include all SOAP headers marked with the
     * wsa:IsReferenceParameter="true" attribute.
     * <p>Type: List&lt;Element>
     *
     * @since JAX-WS 2.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String PATH_INFO =

    /**
     * Standard property: Request Path Info
     * <p>Type: String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String QUERY_STRING =

    /**
     * Standard property: Query string for request.
     * <p>Type: String
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String SERVLET_CONTEXT =

    /**
     * Standard property: servlet context object.
     * <p>Type: javax.servlet.ServletContext
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String SERVLET_RESPONSE =

    /**
     * Standard property: servlet response object.
     * <p>Type: javax.servlet.http.HttpServletResponse
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String SERVLET_REQUEST =

    /**
     * Standard property: servlet request object.
     * <p>Type: javax.servlet.http.HttpServletRequest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String HTTP_REQUEST_METHOD =

    /**
     * Standard property: HTTP request method.
     * <p>Type: java.lang.String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String HTTP_RESPONSE_HEADERS =

    /**
     * Standard property: HTTP response headers.
     * <p>Type: java.util.Map&lt;java.lang.String, java.util.List&lt;java.lang.String>>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String HTTP_REQUEST_HEADERS =

    /**
     * Standard property: HTTP request headers.
     * <p>Type: java.util.Map&lt;java.lang.String, java.util.List&lt;java.lang.String>>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String HTTP_RESPONSE_CODE =

    /**
     * Standard property: HTTP response status code.
     * <p>Type: java.lang.Integer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String WSDL_OPERATION =

    /**
     * Standard property: name of WSDL operation.
     * <p>Type: javax.xml.namespace.QName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String WSDL_INTERFACE =

    /**
     * Standard property: name of wsdl interface (2.0) or port type (1.1).
     * <p>Type: javax.xml.namespace.QName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String WSDL_PORT =

    /**
     * Standard property: name of WSDL port.
     * <p>Type: javax.xml.namespace.QName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String WSDL_SERVICE =

    /**
     * Standard property: name of WSDL service.
     * <p>Type: javax.xml.namespace.QName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String WSDL_DESCRIPTION =

    /**
     * Standard property: input source for WSDL document.
     * <p>Type: org.xml.sax.InputSource
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String OUTBOUND_MESSAGE_ATTACHMENTS =

    /**
     * Standard property: Map of attachments to a message for the outbound
     * message, key is the MIME Content-ID, value is a DataHandler.
     * <p>Type: java.util.Map&lt;String,DataHandler>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String INBOUND_MESSAGE_ATTACHMENTS =

    /**
     * Standard property: Map of attachments to a message for the inbound
     * message, key is  the MIME Content-ID, value is a DataHandler.
     * <p>Type: java.util.Map&lt;String,DataHandler>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
    public static final String MESSAGE_OUTBOUND_PROPERTY =

    /**
     * Standard property: message direction, <code>true</code> for
     * outbound messages, <code>false</code> for inbound.
     * <p>Type: boolean
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/MessageContext.java
public interface MessageContext extends Map<String, Object> {

/**
 * The interface <code>MessageContext</code> abstracts the message
 * context that is processed by a handler in the <code>handle</code>
 * method.
 *
 * <p>The <code>MessageContext</code> interface provides methods to
 * manage a property set. <code>MessageContext</code> properties
 * enable handlers in a handler chain to share processing related
 * state.
 *
 * @since JAX-WS 2.0
 */
