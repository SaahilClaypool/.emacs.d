_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    private void updateClientRequestDispatcherForward(
        ClientRequestInfoImpl info )

    /**
     * Update the client delegate in the event of a ForwardRequest, given the
     * information in the passed-in info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeServerInterceptorEndingPoint( ServerRequestInfoImpl info ) {

    /**
     * Invokes either send_reply, send_exception, or send_other,
     * depending on the value of info.getEndingPointCall()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeServerInterceptorIntermediatePoint(
        ServerRequestInfoImpl info )

    /**
     * Invokes receive_request interception points
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeServerInterceptorStartingPoint( ServerRequestInfoImpl info ) {

    /**
     * Invokes receive_request_service_context interception points.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeClientInterceptorEndingPoint( ClientRequestInfoImpl info ) {

    /**
     * Invokes either receive_reply, receive_exception, or receive_other,
     * depending on the value of info.getEndingPointCall()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeClientInterceptorStartingPoint( ClientRequestInfoImpl info ) {

    /**
     * Invokes either send_request, or send_poll, depending on the value
     * of info.getStartingPointCall()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void objectAdapterCreated( ObjectAdapter oa ) {

    /**
     * Called when a new POA is created.
     *
     * @param oa The Object Adapter associated with the IOR interceptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void setEnabled( boolean enabled ) {

    /**
     * Enables or disables the interceptor invoker
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    InterceptorInvoker( ORB orb, InterceptorList interceptorList,
                        PICurrent piCurrent )

    /**
     * Creates a new Interceptor Invoker.  Constructor is package scope so
     * only the ORB can create it.  The invoker is initially disabled, and
     * must be explicitly enabled using setEnabled().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
public class InterceptorInvoker {

/**
 * Handles invocation of interceptors.  Has specific knowledge of how to
 * invoke IOR, ClientRequest, and ServerRequest interceptors.
 * Makes use of the InterceptorList to retrieve the list of interceptors to
 * be invoked.  Most methods in this class are package scope so that they
 * may only be called from the PIHandlerImpl.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    private void updateClientRequestDispatcherForward(
        ClientRequestInfoImpl info )

    /**
     * Update the client delegate in the event of a ForwardRequest, given the
     * information in the passed-in info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeServerInterceptorEndingPoint( ServerRequestInfoImpl info ) {

    /**
     * Invokes either send_reply, send_exception, or send_other,
     * depending on the value of info.getEndingPointCall()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeServerInterceptorIntermediatePoint(
        ServerRequestInfoImpl info )

    /**
     * Invokes receive_request interception points
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeServerInterceptorStartingPoint( ServerRequestInfoImpl info ) {

    /**
     * Invokes receive_request_service_context interception points.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeClientInterceptorEndingPoint( ClientRequestInfoImpl info ) {

    /**
     * Invokes either receive_reply, receive_exception, or receive_other,
     * depending on the value of info.getEndingPointCall()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void invokeClientInterceptorStartingPoint( ClientRequestInfoImpl info ) {

    /**
     * Invokes either send_request, or send_poll, depending on the value
     * of info.getStartingPointCall()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void objectAdapterCreated( ObjectAdapter oa ) {

    /**
     * Called when a new POA is created.
     *
     * @param oa The Object Adapter associated with the IOR interceptor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    void setEnabled( boolean enabled ) {

    /**
     * Enables or disables the interceptor invoker
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
    InterceptorInvoker( ORB orb, InterceptorList interceptorList,
                        PICurrent piCurrent )

    /**
     * Creates a new Interceptor Invoker.  Constructor is package scope so
     * only the ORB can create it.  The invoker is initially disabled, and
     * must be explicitly enabled using setEnabled().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/InterceptorInvoker.java
public class InterceptorInvoker {

/**
 * Handles invocation of interceptors.  Has specific knowledge of how to
 * invoke IOR, ClientRequest, and ServerRequest interceptors.
 * Makes use of the InterceptorList to retrieve the list of interceptors to
 * be invoked.  Most methods in this class are package scope so that they
 * may only be called from the PIHandlerImpl.
 */
