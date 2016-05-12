_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void checkAccess( int methodID )

    /**
     * See description for RequestInfoImpl.checkAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    boolean isDynamic() {

    /**
     * Returns true if this is a dynamic invocation, or false if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    boolean isForwardRequestRaisedInEnding() {

    /**
     * Returns true if ForwardRequest was raised by a server ending point
     * or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    void setForwardRequestRaisedInEnding() {

    /**
     * Sets the forwardRequestRaisedInEnding flag to true, indicating that
     * a server ending point has raised location forward at some point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    void releaseServant() {

    /**
     * Release the servant object so the user has control over its lifetime.
     * Called after receive_request is finished executing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setReplyStatus( short replyStatus ) {

    /**
     * Overridden from RequestInfoImpl.  Calls the super class, then
     * sets the ending point call depending on the reply status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    void setReplyMessage( ReplyMessage replyMessage ) {

    /**
     * Set reply message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setInfo( java.lang.Object servant,
                            String targetMostDerivedInterface )

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setException( Exception exception ) {

    /**
     * Sets the exception to be returned by received_exception and
     * received_exception_id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setDSIResult( Any result ) {

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setDSIException( Any exception ) {

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setDSIArguments( NVList arguments ) {

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setInfo( CorbaMessageMediator request, ObjectAdapter oa,
        byte[] objectId, ObjectKeyTemplate oktemp )

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setCurrentExecutionPoint( int executionPoint ) {

    /**
     * Overridden from RequestInfoImpl.  This version calls the super
     * and then, if we are changing to ending points, executes all
     * enqueued AddReplyServiceContextCommands.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public org.omg.IOP.ServiceContext get_reply_service_context( int id ) {

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public org.omg.IOP.ServiceContext get_request_service_context( int id ) {

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Object forward_reference (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public boolean response_expected (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Any result (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public String[] operation_context (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public String[] contexts (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public TypeCode[] exceptions (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Parameter[] arguments (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public String operation (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public int request_id (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public void add_reply_service_context ( ServiceContext service_context,
                                            boolean replace )

    /**
     * Allows Interceptors to add service contexts to the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public boolean target_is_a (String id) {

    /**
     * Returns true if the servant is the given RepositoryId, false if it is
     * not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public void set_slot (int id, Any data) throws InvalidSlot {

    /**
     * Allows an Interceptor to set a slot in the Current that is in the scope
     * of the request.  If data already exists in that slot, it will be
     * overwritten.  If the ID does not define an allocated slot, InvalidSlot
     * is raised.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Policy get_server_policy (int type) {

    /**
     * Returns the policy in effect for this operation for the given policy
     * type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public String target_most_derived_interface () {

    /**
     * The RepositoryID for the most derived interface of the servant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    synchronized public byte[] adapter_id ()

    /**
     * The opaque identifier for the object adapter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public byte[] object_id () {

    /**
     * The opaque object_id describing the target of the operation invocation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Any sending_exception () {

    /**
     * Any containing the exception to be returned to the client.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    ServerRequestInfoImpl( ORB myORB ) {

    /**
     * Creates a new ServerRequestInfo implementation.
     * The constructor is package scope since no other package need create
     * an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    /**

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    // Set to true if the server ending point raised ForwardRequest at some

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
public final class ServerRequestInfoImpl

/**
 * Implementation of the ServerRequestInfo interface as specified in
 * orbos/99-12-02 section 5.4.3.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void checkAccess( int methodID )

    /**
     * See description for RequestInfoImpl.checkAccess
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    boolean isDynamic() {

    /**
     * Returns true if this is a dynamic invocation, or false if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    boolean isForwardRequestRaisedInEnding() {

    /**
     * Returns true if ForwardRequest was raised by a server ending point
     * or false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    void setForwardRequestRaisedInEnding() {

    /**
     * Sets the forwardRequestRaisedInEnding flag to true, indicating that
     * a server ending point has raised location forward at some point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    void releaseServant() {

    /**
     * Release the servant object so the user has control over its lifetime.
     * Called after receive_request is finished executing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setReplyStatus( short replyStatus ) {

    /**
     * Overridden from RequestInfoImpl.  Calls the super class, then
     * sets the ending point call depending on the reply status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    void setReplyMessage( ReplyMessage replyMessage ) {

    /**
     * Set reply message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setInfo( java.lang.Object servant,
                            String targetMostDerivedInterface )

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setException( Exception exception ) {

    /**
     * Sets the exception to be returned by received_exception and
     * received_exception_id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setDSIResult( Any result ) {

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setDSIException( Any exception ) {

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setDSIArguments( NVList arguments ) {

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setInfo( CorbaMessageMediator request, ObjectAdapter oa,
        byte[] objectId, ObjectKeyTemplate oktemp )

    /**
     * Stores the various sources of information used for this info object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    protected void setCurrentExecutionPoint( int executionPoint ) {

    /**
     * Overridden from RequestInfoImpl.  This version calls the super
     * and then, if we are changing to ending points, executes all
     * enqueued AddReplyServiceContextCommands.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public org.omg.IOP.ServiceContext get_reply_service_context( int id ) {

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public org.omg.IOP.ServiceContext get_request_service_context( int id ) {

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Object forward_reference (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public boolean response_expected (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Any result (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public String[] operation_context (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public String[] contexts (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public TypeCode[] exceptions (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Parameter[] arguments (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public String operation (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public int request_id (){

    /**
     * See ServerRequestInfo for javadocs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public void add_reply_service_context ( ServiceContext service_context,
                                            boolean replace )

    /**
     * Allows Interceptors to add service contexts to the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public boolean target_is_a (String id) {

    /**
     * Returns true if the servant is the given RepositoryId, false if it is
     * not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public void set_slot (int id, Any data) throws InvalidSlot {

    /**
     * Allows an Interceptor to set a slot in the Current that is in the scope
     * of the request.  If data already exists in that slot, it will be
     * overwritten.  If the ID does not define an allocated slot, InvalidSlot
     * is raised.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Policy get_server_policy (int type) {

    /**
     * Returns the policy in effect for this operation for the given policy
     * type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public String target_most_derived_interface () {

    /**
     * The RepositoryID for the most derived interface of the servant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    synchronized public byte[] adapter_id ()

    /**
     * The opaque identifier for the object adapter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public byte[] object_id () {

    /**
     * The opaque object_id describing the target of the operation invocation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    public Any sending_exception () {

    /**
     * Any containing the exception to be returned to the client.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    ServerRequestInfoImpl( ORB myORB ) {

    /**
     * Creates a new ServerRequestInfo implementation.
     * The constructor is package scope since no other package need create
     * an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    /**

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    // Set to true if the server ending point raised ForwardRequest at some

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
    //

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/interceptors/ServerRequestInfoImpl.java
public final class ServerRequestInfoImpl

/**
 * Implementation of the ServerRequestInfo interface as specified in
 * orbos/99-12-02 section 5.4.3.
 */
