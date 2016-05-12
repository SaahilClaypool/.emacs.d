_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/soap/SOAPHandler.java
  Set<QName> getHeaders();

  /** Gets the header blocks that can be processed by this Handler
   *  instance.
   *
   *  @return Set of <code>QNames</code> of header blocks processed by this
   *           handler instance. <code>QName</code> is the qualified
   *           name of the outermost element of the Header block.
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/handler/soap/SOAPHandler.java
public interface SOAPHandler<T extends SOAPMessageContext>

/** The <code>SOAPHandler</code> class extends <code>Handler</code>
 *  to provide typesafety for the message context parameter and add a method
 *  to obtain access to the headers that may be processed by the handler.
 *
 *  @since JAX-WS 2.0
**/
