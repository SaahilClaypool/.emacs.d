_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    protected void checkAccess( int methodID )

    /**
     * See description for RequestInfoImpl.checkAccess
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    protected void setException( Exception exception ) {

    /**
     * Overridden from RequestInfoImpl.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    protected void setPICurrentPushed( boolean piCurrentPushed ) {

    /**
     * The PICurrent stack should only be popped if it was pushed.
     * This is generally the case.  But exceptions which occur
     * after the stub's entry to _request but before the push
     * end up in _releaseReply which will try to pop unless told not to.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    protected boolean isDIIInitiate() {

    /**
     * See comment for setDIIInitiate
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    protected void setDIIInitiate( boolean diiInitiate ) {

    /**
     * Keeps track of whether initiate was called for a DII request.  The ORB
     * needs to know this so it knows whether to ignore a second call to
     * initiateClientPIRequest or not.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    protected void setDIIRequest(org.omg.CORBA.Request req) {

    /**
     * Sets DII request object in the RequestInfoObject.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    protected void setReplyStatus( short replyStatus ) {

    /**
     * Overridden from RequestInfoImpl.  Calls the super class, then
     * sets the ending point call depending on the reply status.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    int getEntryCount() {

    /**
     * Retrieve the current entry count
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    void decrementEntryCount() {

    /**
     * Decreases the entry count by 1.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    void incrementEntryCount() {

    /**
     * Increases the entry count by 1.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    RetryType getRetryRequest() {

    /**
     * Retrieve the current retry request status.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    void setRetryRequest( RetryType retryRequest ) {

    /**
     * Set or reset the retry request flag.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public org.omg.IOP.ServiceContext get_reply_service_context( int id ) {

    /**
     * does not contain an etry for that ID, BAD_PARAM with a minor code of
     * TBD_BP is raised.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public org.omg.IOP.ServiceContext get_request_service_context( int id ) {

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public Object forward_reference (){

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public boolean response_expected (){

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public Any result (){

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public String[] operation_context (){

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public String[] contexts (){

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public TypeCode[] exceptions (){

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public Parameter[] arguments (){

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public String operation (){

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public int request_id (){

    /**
     * See RequestInfoImpl for javadoc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public void add_request_service_context (ServiceContext service_context,
                                             boolean replace)

    /**
     * Allows interceptors to add service contexts to the request.
     * <p>
     * There is no declaration of the order of the service contexts.  They
     * may or may not appear in the order they are added.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public Policy get_request_policy (int type){

    /**
     * Returns the given policy in effect for this operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public TaggedComponent[] get_effective_components (int id){

    /**
     * Returns all the tagged components with the given ID from the profile
     * selected for this request.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public TaggedComponent get_effective_component (int id){

    /**
     * Returns the IOP::TaggedComponent with the given ID from the profile
     * selected for this request.  IF there is more than one component for a
     * given component ID, it is undefined which component this operation
     * returns (get_effective_component should be called instead).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public String received_exception_id (){

    /**
     * The CORBA::RepositoryId of the exception to be returned to the client.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public Any received_exception (){

    /**
     * Contains the exception to be returned to the client.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public TaggedProfile effective_profile (){

    /**
     * The profile that will be used to send the request.  If a location
     * forward has occurred for this operation's object and that object's
     * profile change accordingly, then this profile will be that located
     * profile.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public org.omg.CORBA.Object effective_target() {

    /**
     * The actual object on which the operation will be invoked.  If the
     * reply_status is LOCATION_FORWARD, then on subsequent requests,
     * effective_target will contain the forwarded IOR while target will
     * remain unchanged.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    public org.omg.CORBA.Object target (){

    /**
     * The object which the client called to perform the operation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    protected ClientRequestInfoImpl( ORB myORB ) {

    /**
     * Creates a new ClientRequestInfo implementation.
     * The constructor is package scope since no other package need create
     * an instance of this class.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    /**

    //////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    // The current retry request status.  True if this request is being

    //////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ClientRequestInfoImpl.java
public final class ClientRequestInfoImpl

/**
 * Implementation of the ClientRequestInfo interface as specified in
 * orbos/99-12-02 section 5.4.2.
 */
