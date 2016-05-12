_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    void setSlotTable(SlotTable slotTable)

    /**
     * The server side does an explicit set rather than taking the
     * current PICurrent table as is done in the general RequestInfoImpl
     * constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected abstract void checkAccess( int methodID )

    /**
     * Check whether the caller is allowed to access this method at
     * this particular time.  This is overridden in subclasses to implement
     * the validity table specified in ptc/00-04-05, table 21-1 and 21-2.
     * The currentExecutionPoint attribute is checked, and if access is
     * forbidden at this time, BAD_INV_ORDER is raised with a minor code of
     * TBD_BIO.
     *
     * @param methodID The ID of this method, one of the MID_* constants.
     *     This allows us to easily look up the method access in a table.
     *     Note that method ids may overlap between subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setCurrentExecutionPoint( int executionPoint ) {

    /**
     * Sets the execution point that we are currently executing
     * (starting points, intermediate points, or ending points).
     * This allows us to enforce the validity table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    Exception getException() {

    /**
     * Returns the exception to be returned by received_exception and
     * received_exception_id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setException( Exception exception ) {

    /**
     * Sets the exception to be returned by received_exception and
     * received_exception_id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected IOR getForwardRequestIOR() {

    /**
     * Retrieves the IOR of the ForwardRequest exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected ForwardRequest getForwardRequestException() {

    /**
     * Retrieves the ForwardRequest object as a ForwardRequest exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setForwardRequest( IOR ior ) {

    /**
     * Stores the given IOR for later forward request analysis.
     * This version supplements setForwardRequest( ForwardRequest );
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setForwardRequest( ForwardRequest forwardRequest ) {

    /**
     * Stores the given ForwardRequest object for later analysis.
     * This version supplements setForwardRequest( IOR );
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected short getReplyStatus() {

    /**
     * Gets the current reply_status without doing an access check
     * (available only to package and subclasses)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setReplyStatus( short replyStatus ) {

    /**
     * Sets the value to be returned by reply_status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setAlreadyExecuted( boolean alreadyExecuted ) {

    /**
     * Sets whether all interceotrs' starting and ending points
     * have already been executed to completion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected boolean getAlreadyExecuted() {

    /**
     * Returns true if all interceptors' starting and ending points
     * have already executed to completion, or false if not yet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected int getStartingPointCall() {

    /**
     * Retrieves the current starting point call type (see
     * setStartingPointCall for more details).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setStartingPointCall( int call ) {

    /**
     * Sets which starting interception point should be called
     * for each interceptor in the virtual flow stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected int getIntermediatePointCall() {

    /**
     * Retrieves the current intermediate point call type (see
     * setEndingPointCall for more details).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setIntermediatePointCall( int call ) {

    /**
     * Sets which intermediate interception point should be called
     * for each interceptor in the virtual flow stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected int getEndingPointCall() {

    /**
     * Retrieves the current ending point call type (see
     * setEndingPointCall for more details).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setEndingPointCall( int call ) {

    /**
     * Sets which ending interception point should be called
     * for each interceptor in the virtual flow stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected int getFlowStackIndex() {

    /**
     * Returns the number of interceptors whose starting interception
     * points were actually invoked on this client request.  See
     * setFlowStackIndex for more details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setFlowStackIndex(int num ) {

    /**
     * Sets the number of interceptors whose starting interception
     * points were successfully invoked on this client call.  As specified
     * in orbos/99-12-02, section 5.2.1., not all interceptors will
     * be invoked if a ForwardRequest exception or a system exception
     * is raised.  This keeps track of how many were successfully executed
     * so we know not to execute the corresponding ending interception
     * points for the interceptors whose starting interception points
     * were not completed.  This simulates the "Flow Stack Visual Model"
     * presented in section 5.1.3.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void addServiceContext(
        HashMap cachedServiceContexts,
        ServiceContexts serviceContexts,
        org.omg.IOP.ServiceContext service_context,
        boolean replace )

    /**
     * Utility method to add an IOP.ServiceContext to a core.ServiceContexts
     * object.  If replace is true, any service context with the given id
     * is replaced.
     * <p>
     * Raises BAD_INV_ORDER if replace is false and a service context with
     * the given id already exists.
     * <p>
     * Uses the given HashMap as a cache.  If a service context is placed
     * in the container, it goes in the HashMap as well.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected org.omg.IOP.ServiceContext

    /**
     * Utility method to look up a service context with the given id and
     * convert it to an IOP.ServiceContext.  Uses the given HashMap as
     * a cache.  If not found in cache, the result is inserted in the cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected Any exceptionToAny( Exception exception ){

    /**
     * Utility to wrap the given Exception in an Any object and return it.
     * If the exception is a UserException which cannot be inserted into
     * an any, then this returns an Any containing the system exception
     * UNKNOWN.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected Parameter[] nvListToParameterArray( NVList parNVList ) {

    /**
     * Internal utility method to convert an NVList into a PI Parameter[]
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    private void insertUserException( UserException userException, Any result )

    /**
     * Inserts the UserException into the given Any.
     * Throws an UNKNOWN with minor code
     * OMGSYstemException.UNKNOWN_USER_EXCEPTION if the Helper class could not be
     * found to insert it with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    private void insertApplicationException( ApplicationException appException,
                                             Any result )

    /**
     * Inserts the UserException inside the given ApplicationException
     * into the given Any.  Throws an UNKNOWN with minor code
     * OMGSYstemException.UNKNOWN_USER_EXCEPTION if the Helper class could not be
     * found to insert it with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public com.sun.corba.se.spi.legacy.connection.Connection connection()

    /**
     * @return The connection on which the request is made.
     *
     * Note: we store the connection as an internal type but
     * expose it here as an external type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public org.omg.IOP.ServiceContext

    /**
     * Implementation for get_reply_service_context() differs for client
     * and server implementations.
     *
     * This operation returns a copy of the service context with the given ID
     * that is associated with the reply.  IF the request's service context
     * does not contain an entry for that ID, BAD_PARAM with a minor code of
     * TBD_BP is raised.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public org.omg.IOP.ServiceContext

    /**
     * Implementation for get_request_service_context() differs for client
     * and server implementations.
     *
     * This operation returns a copy of the service context with the given ID
     * that is associated with the request.  If the request's service context
     * does not contain an etry for that ID, BAD_PARAM with a minor code of
     * TBD_BP is raised.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public Any get_slot (int id)

    /**
     * Returns the data from the given slot of the PortableInterceptor::Current
     * that is in the scope of the request.
     * <p>
     * If the given slot has not been set, then an any containing a type code
     * with a TCKind value of tk_null is returned.
     * <p>
     * If the ID does not define an allocated slot, InvalidSlot is raised.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public Object forward_reference ();

    /**
     * Implementation for forward_reference() differs for client and server
     * implementations.
     *
     * If the reply_status attribute is LOCATION_FORWARD
     * then this attribute will contain the object
     * to which the request will be forwarded.  It is indeterminate whether a
     * forwarded request will actually occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public short reply_status (){

    /**
     * Describes the state of the result of the operation invocation.  Its
     * value can be one of the following:
     * <ul>
     *   <li>PortableInterceptor::SUCCESSFUL</li>
     *   <li>PortableInterceptor::SYSTEM_EXCEPTION</li>
     *   <li>PortableInterceptor::USER_EXCEPTION</li>
     *   <li>PortableInterceptor::LOCATION_FORWARD</li>
     *   <li>PortableInterceptor::TRANSPORT_RETRY</li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public short sync_scope (){

    /**
     * Defined in the Messaging specification.  Pertinent only when
     * response_expected is false.  If response_expected is true, the value
     * of sync_scope is undefined.  It defines how far the request shall
     * progress before control is returned to the client.  This attribute may
     * have one of the follwing values:
     * <ul>
     *   <li>Messaging::SYNC_NONE</li>
     *   <li>Messaging::SYNC_WITH_TRANSPORT</li>
     *   <li>Messaging::SYNC_WITH_SERVER</li>
     *   <li>Messaging::SYNC_WITH_TARGET</li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public boolean response_expected ();

    /**
     * Implementation for response_expected() differs for client and server
     * implementations.
     *
     * Indicates whether a response is expected.  On the client, a reply is
     * not returned when response_expected is false, so receive_reply cannot
     * be called.  receive_other is called unless an exception occurs, in
     * which case receive_exception is called.  On the client, within
     * send_poll, this attribute is true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public Any result ();

    /**
     * This method returns the result from the invoked DII operation.
     * It raises NO_RESOURCES exception if the operation is not invoked by
     * using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public String[] operation_context ();

    /**
     * This method returns the list of operation_context for the DII operation.
     * It raises NO_RESOURCES exception if the operation is not invoked by
     * using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public String[] contexts ();

    /**
     * This method returns the list of contexts for the DII operation.
     * It raises NO_RESOURCES exception if the operation is not invoked by
     * using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public TypeCode[] exceptions ();

    /**
     * This method returns the list of exceptios  that was raised when the
     * operation was invoked. It raises NO_RESOURCES exception if the operation
     * is not invoked by using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public Parameter[] arguments ();

    /**
     * This method returns the list of arguments for the operation that was
     * invoked. It raises NO_RESOURCES exception if the operation is not invoked
     * by using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public String operation ();

    /**
     * Implementation for operation() differs for client and server
     * implementations.
     *
     * The name of the operation being invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public int request_id ();

    /**
     * Implementation for request_id() differs for client and server
     * implementations.
     *
     * Uniquely identifies an active request/reply sequence.  Once a
     * request/reply sequence is concluded this ID may be reused.  (this
     * is NOT necessarily the same as the GIOP request_id).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public RequestInfoImpl( ORB myORB ) {

    /**
     * Creates a new RequestInfoImpl object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    /**

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    // The ORB from which to get PICurrent and other info

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
public abstract class RequestInfoImpl

/**
 * Implementation of the RequestInfo interface as specified in
 * orbos/99-12-02 section 5.4.1.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    void setSlotTable(SlotTable slotTable)

    /**
     * The server side does an explicit set rather than taking the
     * current PICurrent table as is done in the general RequestInfoImpl
     * constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected abstract void checkAccess( int methodID )

    /**
     * Check whether the caller is allowed to access this method at
     * this particular time.  This is overridden in subclasses to implement
     * the validity table specified in ptc/00-04-05, table 21-1 and 21-2.
     * The currentExecutionPoint attribute is checked, and if access is
     * forbidden at this time, BAD_INV_ORDER is raised with a minor code of
     * TBD_BIO.
     *
     * @param methodID The ID of this method, one of the MID_* constants.
     *     This allows us to easily look up the method access in a table.
     *     Note that method ids may overlap between subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setCurrentExecutionPoint( int executionPoint ) {

    /**
     * Sets the execution point that we are currently executing
     * (starting points, intermediate points, or ending points).
     * This allows us to enforce the validity table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    Exception getException() {

    /**
     * Returns the exception to be returned by received_exception and
     * received_exception_id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setException( Exception exception ) {

    /**
     * Sets the exception to be returned by received_exception and
     * received_exception_id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected IOR getForwardRequestIOR() {

    /**
     * Retrieves the IOR of the ForwardRequest exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected ForwardRequest getForwardRequestException() {

    /**
     * Retrieves the ForwardRequest object as a ForwardRequest exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setForwardRequest( IOR ior ) {

    /**
     * Stores the given IOR for later forward request analysis.
     * This version supplements setForwardRequest( ForwardRequest );
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setForwardRequest( ForwardRequest forwardRequest ) {

    /**
     * Stores the given ForwardRequest object for later analysis.
     * This version supplements setForwardRequest( IOR );
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected short getReplyStatus() {

    /**
     * Gets the current reply_status without doing an access check
     * (available only to package and subclasses)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setReplyStatus( short replyStatus ) {

    /**
     * Sets the value to be returned by reply_status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setAlreadyExecuted( boolean alreadyExecuted ) {

    /**
     * Sets whether all interceotrs' starting and ending points
     * have already been executed to completion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected boolean getAlreadyExecuted() {

    /**
     * Returns true if all interceptors' starting and ending points
     * have already executed to completion, or false if not yet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected int getStartingPointCall() {

    /**
     * Retrieves the current starting point call type (see
     * setStartingPointCall for more details).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setStartingPointCall( int call ) {

    /**
     * Sets which starting interception point should be called
     * for each interceptor in the virtual flow stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected int getIntermediatePointCall() {

    /**
     * Retrieves the current intermediate point call type (see
     * setEndingPointCall for more details).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setIntermediatePointCall( int call ) {

    /**
     * Sets which intermediate interception point should be called
     * for each interceptor in the virtual flow stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected int getEndingPointCall() {

    /**
     * Retrieves the current ending point call type (see
     * setEndingPointCall for more details).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setEndingPointCall( int call ) {

    /**
     * Sets which ending interception point should be called
     * for each interceptor in the virtual flow stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected int getFlowStackIndex() {

    /**
     * Returns the number of interceptors whose starting interception
     * points were actually invoked on this client request.  See
     * setFlowStackIndex for more details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void setFlowStackIndex(int num ) {

    /**
     * Sets the number of interceptors whose starting interception
     * points were successfully invoked on this client call.  As specified
     * in orbos/99-12-02, section 5.2.1., not all interceptors will
     * be invoked if a ForwardRequest exception or a system exception
     * is raised.  This keeps track of how many were successfully executed
     * so we know not to execute the corresponding ending interception
     * points for the interceptors whose starting interception points
     * were not completed.  This simulates the "Flow Stack Visual Model"
     * presented in section 5.1.3.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected void addServiceContext(
        HashMap cachedServiceContexts,
        ServiceContexts serviceContexts,
        org.omg.IOP.ServiceContext service_context,
        boolean replace )

    /**
     * Utility method to add an IOP.ServiceContext to a core.ServiceContexts
     * object.  If replace is true, any service context with the given id
     * is replaced.
     * <p>
     * Raises BAD_INV_ORDER if replace is false and a service context with
     * the given id already exists.
     * <p>
     * Uses the given HashMap as a cache.  If a service context is placed
     * in the container, it goes in the HashMap as well.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected org.omg.IOP.ServiceContext

    /**
     * Utility method to look up a service context with the given id and
     * convert it to an IOP.ServiceContext.  Uses the given HashMap as
     * a cache.  If not found in cache, the result is inserted in the cache.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected Any exceptionToAny( Exception exception ){

    /**
     * Utility to wrap the given Exception in an Any object and return it.
     * If the exception is a UserException which cannot be inserted into
     * an any, then this returns an Any containing the system exception
     * UNKNOWN.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    protected Parameter[] nvListToParameterArray( NVList parNVList ) {

    /**
     * Internal utility method to convert an NVList into a PI Parameter[]
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    private void insertUserException( UserException userException, Any result )

    /**
     * Inserts the UserException into the given Any.
     * Throws an UNKNOWN with minor code
     * OMGSYstemException.UNKNOWN_USER_EXCEPTION if the Helper class could not be
     * found to insert it with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    private void insertApplicationException( ApplicationException appException,
                                             Any result )

    /**
     * Inserts the UserException inside the given ApplicationException
     * into the given Any.  Throws an UNKNOWN with minor code
     * OMGSYstemException.UNKNOWN_USER_EXCEPTION if the Helper class could not be
     * found to insert it with.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public com.sun.corba.se.spi.legacy.connection.Connection connection()

    /**
     * @return The connection on which the request is made.
     *
     * Note: we store the connection as an internal type but
     * expose it here as an external type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public org.omg.IOP.ServiceContext

    /**
     * Implementation for get_reply_service_context() differs for client
     * and server implementations.
     *
     * This operation returns a copy of the service context with the given ID
     * that is associated with the reply.  IF the request's service context
     * does not contain an entry for that ID, BAD_PARAM with a minor code of
     * TBD_BP is raised.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public org.omg.IOP.ServiceContext

    /**
     * Implementation for get_request_service_context() differs for client
     * and server implementations.
     *
     * This operation returns a copy of the service context with the given ID
     * that is associated with the request.  If the request's service context
     * does not contain an etry for that ID, BAD_PARAM with a minor code of
     * TBD_BP is raised.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public Any get_slot (int id)

    /**
     * Returns the data from the given slot of the PortableInterceptor::Current
     * that is in the scope of the request.
     * <p>
     * If the given slot has not been set, then an any containing a type code
     * with a TCKind value of tk_null is returned.
     * <p>
     * If the ID does not define an allocated slot, InvalidSlot is raised.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public Object forward_reference ();

    /**
     * Implementation for forward_reference() differs for client and server
     * implementations.
     *
     * If the reply_status attribute is LOCATION_FORWARD
     * then this attribute will contain the object
     * to which the request will be forwarded.  It is indeterminate whether a
     * forwarded request will actually occur.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public short reply_status (){

    /**
     * Describes the state of the result of the operation invocation.  Its
     * value can be one of the following:
     * <ul>
     *   <li>PortableInterceptor::SUCCESSFUL</li>
     *   <li>PortableInterceptor::SYSTEM_EXCEPTION</li>
     *   <li>PortableInterceptor::USER_EXCEPTION</li>
     *   <li>PortableInterceptor::LOCATION_FORWARD</li>
     *   <li>PortableInterceptor::TRANSPORT_RETRY</li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public short sync_scope (){

    /**
     * Defined in the Messaging specification.  Pertinent only when
     * response_expected is false.  If response_expected is true, the value
     * of sync_scope is undefined.  It defines how far the request shall
     * progress before control is returned to the client.  This attribute may
     * have one of the follwing values:
     * <ul>
     *   <li>Messaging::SYNC_NONE</li>
     *   <li>Messaging::SYNC_WITH_TRANSPORT</li>
     *   <li>Messaging::SYNC_WITH_SERVER</li>
     *   <li>Messaging::SYNC_WITH_TARGET</li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public boolean response_expected ();

    /**
     * Implementation for response_expected() differs for client and server
     * implementations.
     *
     * Indicates whether a response is expected.  On the client, a reply is
     * not returned when response_expected is false, so receive_reply cannot
     * be called.  receive_other is called unless an exception occurs, in
     * which case receive_exception is called.  On the client, within
     * send_poll, this attribute is true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public Any result ();

    /**
     * This method returns the result from the invoked DII operation.
     * It raises NO_RESOURCES exception if the operation is not invoked by
     * using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public String[] operation_context ();

    /**
     * This method returns the list of operation_context for the DII operation.
     * It raises NO_RESOURCES exception if the operation is not invoked by
     * using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public String[] contexts ();

    /**
     * This method returns the list of contexts for the DII operation.
     * It raises NO_RESOURCES exception if the operation is not invoked by
     * using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public TypeCode[] exceptions ();

    /**
     * This method returns the list of exceptios  that was raised when the
     * operation was invoked. It raises NO_RESOURCES exception if the operation
     * is not invoked by using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public Parameter[] arguments ();

    /**
     * This method returns the list of arguments for the operation that was
     * invoked. It raises NO_RESOURCES exception if the operation is not invoked
     * by using DII mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public String operation ();

    /**
     * Implementation for operation() differs for client and server
     * implementations.
     *
     * The name of the operation being invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    abstract public int request_id ();

    /**
     * Implementation for request_id() differs for client and server
     * implementations.
     *
     * Uniquely identifies an active request/reply sequence.  Once a
     * request/reply sequence is concluded this ID may be reused.  (this
     * is NOT necessarily the same as the GIOP request_id).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    public RequestInfoImpl( ORB myORB ) {

    /**
     * Creates a new RequestInfoImpl object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    /**

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    // The ORB from which to get PICurrent and other info

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/RequestInfoImpl.java
public abstract class RequestInfoImpl

/**
 * Implementation of the RequestInfo interface as specified in
 * orbos/99-12-02 section 5.4.1.
 */
