_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public MessageFactory getMessageFactory();

  /**
   * Gets the SAAJ <code>MessageFactory</code> instance used by this SOAP binding.
   *
   * @return MessageFactory instance used by this SOAP binding.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public SOAPFactory getSOAPFactory();

  /**
   * Gets the SAAJ <code>SOAPFactory</code> instance used by this SOAP binding.
   *
   * @return SOAPFactory instance used by this SOAP binding.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public void setMTOMEnabled(boolean flag);

  /**
   * Enables or disables use of MTOM.
   *
   * @param flag   A <code>boolean</code> specifying whether the use of MTOM should
   *               be enabled or disabled.
   * @throws WebServiceException If the specified setting is not supported
   *                  by this binding instance.
   *
   **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public boolean isMTOMEnabled();

  /**
   * Returns <code>true</code> if the use of MTOM is enabled.
   *
   * @return <code>true</code> if and only if the use of MTOM is enabled.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public void setRoles(Set<String> roles);

  /** Sets the roles played by the SOAP binding instance.
   *
   *  @param roles    The set of roles played by the binding instance.
   *  @throws WebServiceException On an error in the configuration of
   *                  the list of roles.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public Set<String> getRoles();

  /** Gets the roles played by the SOAP binding instance.
   *
   *  @return Set&lt;String> The set of roles played by the binding instance.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public static final String SOAP12HTTP_MTOM_BINDING = "http://www.w3.org/2003/05/soap/bindings/HTTP/?mtom=true";

  /**
   * A constant representing the identity of the SOAP 1.2 over HTTP binding
   * with MTOM enabled by default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public static final String SOAP11HTTP_MTOM_BINDING = "http://schemas.xmlsoap.org/wsdl/soap/http?mtom=true";

  /**
   * A constant representing the identity of the SOAP 1.1 over HTTP binding
   * with MTOM enabled by default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public static final String SOAP12HTTP_BINDING = "http://www.w3.org/2003/05/soap/bindings/HTTP/";

  /**
   * A constant representing the identity of the SOAP 1.2 over HTTP binding.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
  public static final String SOAP11HTTP_BINDING = "http://schemas.xmlsoap.org/wsdl/soap/http";

  /**
   * A constant representing the identity of the SOAP 1.1 over HTTP binding.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/soap/SOAPBinding.java
public interface SOAPBinding extends Binding {

/** The <code>SOAPBinding</code> interface is an abstraction for
 *  the SOAP binding.
 *
 *  @since JAX-WS 2.0
**/
