_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/PortInfo.java
  public String getBindingID();

  /**
   *  Gets the URI identifying the binding used by the port being accessed.
   *
   *  @return String The binding identifier for the port.
   *
   *  @see javax.xml.ws.Binding
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/PortInfo.java
  public QName getPortName();

  /**
   *  Gets the qualified name of the WSDL port being accessed.
   *
   *  @return javax.xml.namespace.QName The qualified name of the WSDL port.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/PortInfo.java
  public QName getServiceName();

  /**
   *  Gets the qualified name of the WSDL service name containing
   *  the port being accessed.
   *
   *  @return javax.xml.namespace.QName The qualified name of the WSDL service.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/PortInfo.java
public interface PortInfo {

/**
 *  The <code>PortInfo</code> interface is used by a
 *  <code>HandlerResolver</code> to query information about
 *  the port it is being asked to create a handler chain for.
 *  <p>
 *  This interface is never implemented by an application,
 *  only by a JAX-WS implementation.
 *
 *  @since JAX-WS 2.0
**/
