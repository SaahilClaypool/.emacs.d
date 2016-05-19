_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
class SynchVariable

////////////////////////////////////////////////////////////////////////
/// Helper class for a Synchronization Variable
////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public Operation getURLOperation()

    /** Get the operation used in string_to_object calls.  The Operation must expect a
     * String and return an org.omg.CORBA.Object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public void setURLOperation( Operation stringToObject )

    /** Set the operation used in string_to_object calls.  The Operation must expect a
     * String and return an org.omg.CORBA.Object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public LocalResolver getLocalResolver()

    /** Get the LocalResolver used in this ORB.  This LocalResolver is used for
     * register_initial_reference only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public void setLocalResolver( LocalResolver resolver )

    /** Set the LocalResolver used in this ORB.  This LocalResolver is used for
     * register_initial_reference only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public Resolver getResolver()

    /** Get the resolver used in this ORB.  This resolver will be used for list_initial_services
     * and resolve_initial_references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public void setResolver( Resolver resolver )

    /** Set the resolver used in this ORB.  This resolver will be used for list_initial_services
     * and resolve_initial_references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    //

    ////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    //

    ////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized void perform_work()

    /** This method does nothing. It is not required by the spec to do anything!
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    /** This method always returns false because the ORB never needs the

 /******************************************************************************
 *  The following public methods are for ORB shutdown.
 *
 ******************************************************************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    private String getHostName(String host)

    /*************************************************************************
     *  The following public methods are for ORB shutdown.
     *************************************************************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized void connect(org.omg.CORBA.Object servant)

    /** This is the implementation of the public API used to connect
     *  a servant-skeleton to the ORB.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    private Object badServerIdHandlerAccessLock = new Object();

    /**
     * The bad server id handler is used by the Locator to
     * send back the location of a persistant server to the client.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized ValueFactory lookup_value_factory(String repositoryID)

    /**
     * Finds and returns a value factory for the given repository ID.
     * The value factory returned was previously registered by a call to
     * {@link #register_value_factory} or is the default factory.
     *
     * @param repositoryID the repository ID.
     * @return the value factory.
     * @exception org.omg.CORBA.BAD_PARAM if unable to locate a factory.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized void unregister_value_factory(String repositoryID)

    /**
     * Unregisters a value factory for a particular repository ID.
     *
     * @param repositoryID the repository ID.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized ValueFactory register_value_factory(String repositoryID,
        ValueFactory factory)

    /**
     * Registers a value factory for a particular repository ID.
     *
     * @param repositoryID the repository ID.
     * @param factory the factory.
     * @return the previously registered factory for the given repository ID,
     * or null if no such factory was previously registered.
     * @exception org.omg.CORBA.BAD_PARAM if the registration fails.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public void destroy()

    /**
     *  formal/99-10-07 p 159: "If destroy is called on an ORB that has
     *  not been shut down, it will start the shutdown process and block until
     *  the ORB has shut down before it destroys the ORB."
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public void run()

/****************************************************************************
 * The following methods (introduced in POA / CORBA2.1) deal with
 * shutdown / single threading.
 ****************************************************************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public void register_initial_reference(
        String id, org.omg.CORBA.Object obj ) throws InvalidName

    /**
     * If this operation is called with an id, <code>"Y"</code>, and an
     * object, <code>YY</code>, then a subsequent call to
     * <code>ORB.resolve_initial_references( "Y" )</code> will
     * return object <code>YY</code>.
     *
     * @param id The ID by which the initial reference will be known.
     * @param obj The initial reference itself.
     * @throws InvalidName if this operation is called with an empty string id
     *     or this operation is called with an id that is already registered,
     *     including the default names defined by OMG.
     * @throws BAD_PARAM if the obj parameter is null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public org.omg.CORBA.Object resolve_initial_references(
        String identifier) throws InvalidName

    /**
     * Resolve the stringified reference of one of the initially
     * available CORBA services.
     * @param identifier The stringified object reference of the
     * desired service.
     * @return An object reference for the desired service.
     * @exception InvalidName The supplied identifier is not associated
     * with a known service.
     * @exception SystemException One of a fixed set of Corba system exceptions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    /**

/****************************************************************************
 * The following methods deal with listing and resolving the initial
 * (bootstrap) object references such as "NameService".
 ****************************************************************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized Any create_any()

    /**
     * Create a new Any
     *
     * @return          the new Any created.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_array_tc(int length,
                                    TypeCode element_type)

    /**
     * Create a TypeCode for an array.
     *
     * @param length    the length of the array.
     * @param element_type
     *                  the type of elements of the array.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_recursive_sequence_tc(int bound,
                                                 int offset)

    /**
     * Create a recursive TypeCode in a sequence.
     *
     * @param bound     the bound for the sequence.
     * @param offset    the index to the enclosing TypeCode that is
     *                  being referenced.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_sequence_tc(int bound,
                                       TypeCode element_type)

    /**
     * Create a TypeCode for a sequence.
     *
     * @param bound     the bound for the sequence.
     * @param element_type
     *                  the type of elements of the sequence.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_wstring_tc(int bound)

    /**
     * Create a TypeCode for a wide string.
     *
     * @param bound     the bound for the string.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_string_tc(int bound)

    /**
     * Create a TypeCode for a string.
     *
     * @param bound     the bound for the string.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_interface_tc(String id,
                                        String name)

    /**
     * Create a TypeCode for an interface.
     *
     * @param id                the logical id for the typecode.
     * @param name      the name for the typecode.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_exception_tc(String id,
                                        String name,
                                        StructMember[] members)

    /**
     * Create a TypeCode for an exception.
     *
     * @param id                the logical id for the typecode.
     * @param name      the name for the typecode.
     * @param members   an array describing the members of the TypeCode.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_alias_tc(String id,
                                    String name,
                                    TypeCode original_type)

    /**
     * Create a TypeCode for an alias.
     *
     * @param id                the logical id for the typecode.
     * @param name      the name for the typecode.
     * @param original_type
     *                  the type this is an alias for.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_enum_tc(String id,
                                   String name,
                                   String[] members)

    /**
     * Create a TypeCode for an enum.
     *
     * @param id                the logical id for the typecode.
     * @param name      the name for the typecode.
     * @param members   an array describing the members of the TypeCode.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_union_tc(String id,
                                    String name,
                                    TypeCode discriminator_type,
                                    UnionMember[] members)

    /**
     * Create a TypeCode for a union.
     *
     * @param id                the logical id for the typecode.
     * @param name      the name for the typecode.
     * @param discriminator_type
     *                  the type of the union discriminator.
     * @param members   an array describing the members of the TypeCode.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode create_struct_tc(String id,
                                     String name,
                                     StructMember[] members)

    /**
     * Create a TypeCode for a structure.
     *
     * @param id                the logical id for the typecode.
     * @param name      the name for the typecode.
     * @param members   an array describing the members of the TypeCode.
     * @return          the requested TypeCode.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized TypeCode get_primitive_tc(TCKind tcKind)

    /**
     * Get the TypeCode for a primitive type.
     *
     * @param tcKind    the integer kind for the primitive type
     * @return          the requested TypeCode
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public org.omg.CORBA.Object string_to_object(String str)

    /**
     * Convert a stringified object reference to the object it represents.
     * @param str The stringified object reference.
     * @return The unstringified object reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized String object_to_string(org.omg.CORBA.Object obj)

    /**
     * Convert an object ref to a string.
     * @param obj The object to stringify.
     * @return A stringified object reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public void notifyORB()

    /**
     * Notify response to ORB for get_next_response
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public org.omg.CORBA.Request get_next_response()

    /**
     * Get the next request that has gotten a response.
     *
     * @result            the next request ready with a response.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized boolean poll_next_response()

    /**
     * Find out if any of the deferred invocations have a response yet.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized void send_multiple_requests_deferred(Request[] req)

    /**
     * Send multiple dynamic requests asynchronously.
     *
     * @param req         an array of request objects.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized org.omg.CORBA.Environment create_environment()

    /**
     * Create an Environment
     *
     * @result          Environment created
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized org.omg.CORBA.Context get_default_context()

    /**
     * Get the default Context object
     *
     * @result          the default Context object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized org.omg.CORBA.ContextList create_context_list()

    /**
     * Create a ContextList
     *
     * @result          ContextList created
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized org.omg.CORBA.ExceptionList create_exception_list()

    /**
     * Create an ExceptionList
     *
     * @result          ExceptionList created
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized NamedValue create_named_value(String s, Any any, int flags)

    /**
     * Create a NamedValue
     *
     * @result          NamedValue created
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized NVList create_operation_list(org.omg.CORBA.Object oper)

    /**
     * Create an NVList corresponding to an OperationDef
     *
     * @param oper      operation def to use to create list
     * @result          NVList created
     *
     * @see NVList
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized NVList create_list(int count)

    /**
     * Create an NVList
     *
     * @param count     size of list to create
     * @result          NVList created
     *
     * @see NVList
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized org.omg.CORBA.Current get_current()

    /**
     * Get a Current pseudo-object.
     * The Current interface is used to manage thread-specific
     * information for use by the transactions, security and other
     * services. This method is deprecated,
     * and replaced by ORB.resolve_initial_references("NameOfCurrentObject");
     *
     * @return          a Current pseudo-object.
     * @deprecated
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public synchronized org.omg.CORBA.portable.OutputStream create_output_stream()

/****************************************************************************
 * The following methods are standard public CORBA ORB APIs
 ****************************************************************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    // preInit initializes all non-pluggable ORB data that is independent

/****************************************************************************
 * The following methods are ORB initialization
 ****************************************************************************/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    public ORBImpl()

    /**
     * Create a new ORB. Should be followed by the appropriate
     * set_parameters() call.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
    //

    ////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orb/ORBImpl.java
public class ORBImpl extends com.sun.corba.se.spi.orb.ORB

/**
 * The JavaIDL ORB implementation.
 */
