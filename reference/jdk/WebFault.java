_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebFault.java
  public String messageName() default "";

  /**
   *  wsdl:Message's name. Default name is the exception's class name.
   *  @since JAX-WS 2.2
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebFault.java
  public String faultBean() default "";

  /**
   *  Fault bean name.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebFault.java
  public String targetNamespace() default "";

  /**
   *  Element's namespace name.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebFault.java
  public String name() default "";

  /**
   *  Element's local name.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/WebFault.java
@Target({ElementType.TYPE})

/**
 * Used to annotate service specific exception classes to customize
 * to the local and namespace name of the fault element and the name
 * of the fault bean.
 *
 *  @since JAX-WS 2.0
**/
