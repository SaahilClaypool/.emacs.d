_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceClient.java
  String wsdlLocation() default "";

  /**
   *  The location of the WSDL document for the service (a URL).
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceClient.java
  String targetNamespace() default "";

  /**
   *  The namespace for the Web service.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceClient.java
  String name() default "";

  /**
   *  The local name of the Web service.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebServiceClient.java
@Target({ElementType.TYPE})

/**
 *  Used to annotate a generated service interface.
 *
 *  <p>The information specified in this annotation is sufficient
 *  to uniquely identify a <code>wsdl:service</code>
 *  element inside a WSDL document. This <code>wsdl:service</code>
 *  element represents the Web service for which the generated
 *  service interface provides a client view.
 *
 *  @since JAX-WS 2.0
**/
