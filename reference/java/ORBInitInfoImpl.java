_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    private void nullParam()

    /**
     * Called when an invalid null parameter was passed.  Throws a
     * BAD_PARAM with a minor code of 1
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public void register_policy_factory( int type,
                                         PolicyFactory policy_factory )

    /**
     * Register a PolicyFactory for the given PolicyType.
     * <p>
     * If a PolicyFactory already exists for the given PolicyType,
     * BAD_INV_ORDER is raised with a minor code of TBD_BIO+2.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public int allocate_slot_id () {

    /**
     * A service calls allocate_slot_id to allocate a slot on
     * PortableInterceptor::Current.
     *
     * @return The index to the slot which has been allocated.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public void add_ior_interceptor (
        IORInterceptor interceptor )

    /**
     * This operation is used to add an IOR Interceptor to
     * the list of IOR Interceptors.
     * <p>
     * If an IOR Interceptor has already been registered
     * with this Interceptor's name, DuplicateName is raised.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public void add_server_request_interceptor (
        ServerRequestInterceptor interceptor)

    /**
     * This operation is used to add a server-side request Interceptor to
     * the list of server-side request Interceptors.
     * <p>
     * If a server-side request Interceptor has already been registered
     * with this Interceptor's name, DuplicateName is raised.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public void add_client_request_interceptor (
        ClientRequestInterceptor interceptor)

    /**
     * This operation is used to add a client-side request Interceptor to
     * the list of client-side request Interceptors.
     * <p>
     * If a client-side request Interceptor has already been registered
     * with this Interceptor's name, DuplicateName is raised.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public org.omg.CORBA.Object resolve_initial_references (String id)

    /**
     * This operation is only valid during post_init.  It is identical to
     * ORB::resolve_initial_references.  This same functionality exists here
     * because the ORB, not yet fully initialized, is not yet available,
     * but initial references may be required from the ORB as part
     * of Interceptor registration.
     * <p>
     * (incorporates changes from errata in orbos/00-01-01)
     * <p>
     * This method may not be called during pre_init.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public void register_initial_reference( String id,
                                            org.omg.CORBA.Object obj )

    /**
     * See orbos/99-12-02, Chapter 11, Dynamic Initial References on page
     * 11-81.  This operation is identical to ORB::register_initial_reference
     * described there.  This same functionality exists here because the ORB,
     * not yet fully initialized, is not yet available but initial references
     * may need to be registered as part of Interceptor registration.
     * <p>
     * This method may not be called during post_init.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public CodecFactory codec_factory () {

    /**
     * This attribute is the IOP::CodecFactory.  The CodecFactory is normally
     * obtained via a call to ORB::resolve_initial_references( "CodecFactory" )
     * but since the ORB is not yet available and Interceptors, particularly
     * when processing service contexts, will require a Codec, a means of
     * obtaining a Codec is necessary during ORB intialization.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public String orb_id () {

    /**
     * This attribute is the ID of the ORB being initialized
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public String[] arguments () {

    /**
     * This attribute contains the arguments passed to ORB_init.  They may
     * or may not contain the ORB's arguments
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    private void checkStage() {

    /**
     * Throws an exception if the current stage is STAGE_CLOSED.
     * This is called before any method is invoked to ensure that
     * no method invocations are attempted after all calls to post_init()
     * are completed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    void setStage( int stage ) {

    /**
     * Sets the current stage we are in.  This limits access to certain
     * functionality.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    public ORB getORB()

    /** Return the ORB behind this ORBInitInfo.  This is defined in the
     * ORBInitInfoExt interface.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
    ORBInitInfoImpl( ORB orb, String[] args,
        String orbId, CodecFactory codecFactory )

    /**
     * Creates a new ORBInitInfoImpl object (scoped to package)
     *
     * @param args The arguments passed to ORB_init.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/ORBInitInfoImpl.java
public final class ORBInitInfoImpl

/**
 * ORBInitInfoImpl is the implementation of the ORBInitInfo class to be
 * passed to ORBInitializers, as described in orbos/99-12-02.
 */
