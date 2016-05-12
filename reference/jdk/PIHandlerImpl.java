_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    public void registerPolicyFactory( int type, PolicyFactory factory ) {

    /** This method registers the Policy Factory in the policyFactoryTable,
     *  which is a HashMap. This method is made package private, because
     *  it is used internally by the  Interceptors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    public org.omg.CORBA.Policy create_policy(int type, org.omg.CORBA.Any val)

    /** This is the implementation of standard API defined in org.omg.CORBA.ORB
     *  class. This method finds the Policy Factory for the given Policy Type
     *  and instantiates the Policy object from the Factory. It will throw
     *  PolicyError exception, If the PolicyFactory for the given type is
     *  not registered.
     *  _REVISIT_, Once Policy Framework work is completed, Reorganize
     *  this method to com.sun.corba.se.spi.orb.ORB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private void nullParam()

    /**
     * Called when an invalid null parameter was passed.  Throws a
     * BAD_PARAM with a minor code of 1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    public void register_interceptor( Interceptor interceptor, int type )

    /**
     * Called by ORBInitInfo when an interceptor needs to be registered.
     * The type is one of:
     * <ul>
     *   <li>INTERCEPTOR_TYPE_CLIENT - ClientRequestInterceptor
     *   <li>INTERCEPTOR_TYPE_SERVER - ServerRequestInterceptor
     *   <li>INTERCEPTOR_TYPE_IOR - IORInterceptor
     * </ul>
     *
     * @exception DuplicateName Thrown if an interceptor of the given
     *     name already exists for the given type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private ORBInitInfoImpl createORBInitInfo() {

    /**
     * Creates the ORBInitInfo object to be passed to ORB intializers'
     * pre_init and post_init methods
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private void postInitORBInitializers( ORBInitInfoImpl info ) {

    /**
     * Call post_init on all ORB initializers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private void preInitORBInitializers( ORBInitInfoImpl info ) {

    /**
     * Call pre_init on all ORB initializers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private boolean isClientPIEnabledForThisThread() {

    /**
     * Convenience method to determine whether Client PI is enabled
     * for requests on this thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private ServerRequestInfoImpl peekServerRequestInfoImplStack() {

    /**
     * Convenience method to get the ServerRequestInfoImpl object off the
     * top of the ThreadLocal stack.  Returns null if there are none.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private ClientRequestInfoImpl peekClientRequestInfoImplStack() {

    /**
     * Convenience method to get the ClientRequestInfoImpl object off the
     * top of the ThreadLocal stack.  Throws an INTERNAL exception if
     * the Info stack is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private int convertPIReplyStatusToReplyMessage( short replyStatus ) {

    /**
     * Utility method to convert a PI reply status short to a ReplyMessage
     * constant.  This is a reverse lookup on the table defined in
     * REPLY_MESSAGE_TO_PI_REPLY_STATUS.  The reverse lookup need not be
     * performed as quickly since it is only executed in exception
     * conditions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private void serverPIHandleExceptions( ServerRequestInfoImpl info )

    /**
     * Handles exceptions for the starting and intermediate points for
     * server request interceptors.  This is common code that has been
     * factored out into this utility method.
     * <p>
     * This method will NOT work for ending points.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    public void destroyInterceptors() {

    /**
     *  ptc/00-08-06 p 205: "When an application calls ORB::destroy, the ORB
     *  1) waits for all requests in progress to complete
     *  2) calls the Interceptor::destroy operation for each interceptor
     *  3) completes destruction of the ORB"
     *
     * This must be called at the end of ORB.destroy.  Note that this is not
     * part of the PIHandler interface, since ORBImpl implements the ORB interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
public class PIHandlerImpl implements PIHandler

/**
 * Provides portable interceptor functionality.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    public void registerPolicyFactory( int type, PolicyFactory factory ) {

    /** This method registers the Policy Factory in the policyFactoryTable,
     *  which is a HashMap. This method is made package private, because
     *  it is used internally by the  Interceptors.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    public org.omg.CORBA.Policy create_policy(int type, org.omg.CORBA.Any val)

    /** This is the implementation of standard API defined in org.omg.CORBA.ORB
     *  class. This method finds the Policy Factory for the given Policy Type
     *  and instantiates the Policy object from the Factory. It will throw
     *  PolicyError exception, If the PolicyFactory for the given type is
     *  not registered.
     *  _REVISIT_, Once Policy Framework work is completed, Reorganize
     *  this method to com.sun.corba.se.spi.orb.ORB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private void nullParam()

    /**
     * Called when an invalid null parameter was passed.  Throws a
     * BAD_PARAM with a minor code of 1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    public void register_interceptor( Interceptor interceptor, int type )

    /**
     * Called by ORBInitInfo when an interceptor needs to be registered.
     * The type is one of:
     * <ul>
     *   <li>INTERCEPTOR_TYPE_CLIENT - ClientRequestInterceptor
     *   <li>INTERCEPTOR_TYPE_SERVER - ServerRequestInterceptor
     *   <li>INTERCEPTOR_TYPE_IOR - IORInterceptor
     * </ul>
     *
     * @exception DuplicateName Thrown if an interceptor of the given
     *     name already exists for the given type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private ORBInitInfoImpl createORBInitInfo() {

    /**
     * Creates the ORBInitInfo object to be passed to ORB intializers'
     * pre_init and post_init methods
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private void postInitORBInitializers( ORBInitInfoImpl info ) {

    /**
     * Call post_init on all ORB initializers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private void preInitORBInitializers( ORBInitInfoImpl info ) {

    /**
     * Call pre_init on all ORB initializers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private boolean isClientPIEnabledForThisThread() {

    /**
     * Convenience method to determine whether Client PI is enabled
     * for requests on this thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private ServerRequestInfoImpl peekServerRequestInfoImplStack() {

    /**
     * Convenience method to get the ServerRequestInfoImpl object off the
     * top of the ThreadLocal stack.  Returns null if there are none.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private ClientRequestInfoImpl peekClientRequestInfoImplStack() {

    /**
     * Convenience method to get the ClientRequestInfoImpl object off the
     * top of the ThreadLocal stack.  Throws an INTERNAL exception if
     * the Info stack is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private int convertPIReplyStatusToReplyMessage( short replyStatus ) {

    /**
     * Utility method to convert a PI reply status short to a ReplyMessage
     * constant.  This is a reverse lookup on the table defined in
     * REPLY_MESSAGE_TO_PI_REPLY_STATUS.  The reverse lookup need not be
     * performed as quickly since it is only executed in exception
     * conditions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    private void serverPIHandleExceptions( ServerRequestInfoImpl info )

    /**
     * Handles exceptions for the starting and intermediate points for
     * server request interceptors.  This is common code that has been
     * factored out into this utility method.
     * <p>
     * This method will NOT work for ending points.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
    public void destroyInterceptors() {

    /**
     *  ptc/00-08-06 p 205: "When an application calls ORB::destroy, the ORB
     *  1) waits for all requests in progress to complete
     *  2) calls the Interceptor::destroy operation for each interceptor
     *  3) completes destruction of the ORB"
     *
     * This must be called at the end of ORB.destroy.  Note that this is not
     * part of the PIHandler interface, since ORBImpl implements the ORB interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/PIHandlerImpl.java
public class PIHandlerImpl implements PIHandler

/**
 * Provides portable interceptor functionality.
 */
