_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/Response.java
public interface Response<T> extends Future<T> {

/** The <code>Response</code> interface provides methods used to obtain the
 *  payload and context of a message sent in response to an operation
 *  invocation.
 *
 *  <p>For asynchronous operation invocations it provides additional methods
 *  to check the status of the request. The <code>get(...)</code> methods may
 *  throw the standard
 *  set of exceptions and their cause may be a <code>RemoteException</code> or a
 *  {@link WebServiceException} that represents the error that occured during the
 *  asynchronous method invocation.</p>
 *
 *  @since JAX-WS 2.0
**/
