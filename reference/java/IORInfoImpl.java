_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/IORInfoImpl.java
    private void nullParam()

    /**
     * Called when an invalid null parameter was passed.  Throws a
     * BAD_PARAM with a minor code of 1
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/IORInfoImpl.java
    private void addIORComponentToProfileInternal(
        TaggedComponent tagged_component, Iterator iterator )

    /**
     * Internal utility method to add an IOR component to the set of profiles
     * present in the iterator.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/IORInfoImpl.java
    public int getServerPort(String type)

    /**
     * @param type The type of the server port
     *     (see connection.ORBSocketFactory for discussion).
     * @return The listen port number for that type.
     * @throws UnknownType if no port of the given type is found.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/IORInfoImpl.java
    public void add_ior_component_to_profile (
        TaggedComponent tagged_component, int profile_id )

    /**
     * A portable ORB service implementation calls this method from its
     * implementation of establish_components to add a tagged component to
     * the set which will be included when constructing IORs.  The
     * components in this set will be included in the specified profile.
     * <p>
     * Any number of components may exist with the same component ID.
     * <p>
     * If the given profile ID does not define a known profile or it is
     * impossible to add components to thgat profile, BAD_PARAM is raised
     * with a minor code of TBD_BP + 3.
     *
     * @param tagged_component The IOP::TaggedComponent to add.
     * @param profile_id The IOP::ProfileId tof the profile to which this
     *     component will be added.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/IORInfoImpl.java
    public void add_ior_component (TaggedComponent tagged_component) {

    /**
     * A portable ORB service implementation calls this method from its
     * implementation of establish_components to add a tagged component to
     * the set which will be included when constructing IORs.  The
     * components in this set will be included in all profiles.
     * <p>
     * Any number of components may exist with the same component ID.
     *
     * @param tagged_component The IOP::TaggedComponent to add
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/IORInfoImpl.java
    public Policy get_effective_policy (int type) {

    /**
     * An ORB service implementation may determine what server side policy
     * of a particular type is in effect for an IOR being constructed by
     * calling the get_effective_policy operation.  When the IOR being
     * constructed is for an object implemented using a POA, all Policy
     * objects passed to the PortableServer::POA::create_POA call that
     * created that POA are accessible via get_effective_policy.
     * <p>
     * If a policy for the given type is not known to the ORB, then this
     * operation will raise INV_POLICY with a standard minor code of 2.
     *
     * @param type The CORBA::PolicyType specifying the type of policy to
     *   return.
     * @return The effective CORBA::Policy object of the requested type.
     *   If the given policy type is known, but no policy of that tpye is
     *   in effect, then this operation will return a nil object reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/IORInfoImpl.java
    IORInfoImpl( ObjectAdapter adapter ) {

    /**
     * Creates a new IORInfo implementation.  This info object will establish
     * tagged components with the template for the provided IOR Template.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/interceptors/IORInfoImpl.java
public final class IORInfoImpl

/**
 * IORInfoImpl is the implementation of the IORInfo class, as described
 * in orbos/99-12-02, section 7.
 */
