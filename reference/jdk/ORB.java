_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/internal/iiop/ORB.java
public class ORB extends /* 1.4 value: com.sun.corba.se.internal.corba.ORB */

/**
 * Deprecated class for backward compatibility.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/org/omg/CORBA/ORB.java
    public void register_initial_reference( String id,
                                            org.omg.CORBA.Object obj )

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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/org/omg/CORBA/ORB.java
abstract public class ORB extends org.omg.CORBA_2_3.ORB

/** This ORB class is defined to provide a home for the
* register_initial_reference operation, which is added by
* portable interceptors and CORBA 2.4.  It is added here
* until there is an official Java language mapping for the
* method.
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public static LogWrapperBase staticGetLogWrapper( String logDomain,
        String exceptionGroup, LogWrapperFactory factory )

    /** get the log wrapper class (its type is dependent on the exceptionGroup) for the
     * given log domain and exception group in this ORB instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public LogWrapperBase getLogWrapper( String logDomain,
        String exceptionGroup, LogWrapperFactory factory )

    /** get the log wrapper class (its type is dependent on the exceptionGroup) for the
     * given log domain and exception group in this ORB instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public Logger getLogger( String domain )

    /**
     * Returns the logger based on the category.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract TaggedComponentFactoryFinder getTaggedComponentFactoryFinder() ;

    /** Factory finders for the various parts of the IOR: tagged components, tagged
     * profiles, and tagged profile templates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setINSDelegate( CorbaServerRequestDispatcher insDelegate ) ;

    /** Set the ServerRequestDispatcher that should be used for handling INS requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract Operation getURLOperation() ;

    /** Get the operation used in string_to_object calls.  The Operation must expect a
     * String and return an org.omg.CORBA.Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setURLOperation( Operation stringToObject ) ;

    /** Set the operation used in string_to_object calls.  The Operation must expect a
     * String and return an org.omg.CORBA.Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract LocalResolver getLocalResolver() ;

    /** Get the LocalResolver used in this ORB.  This LocalResolver is used for
     * register_initial_reference only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setLocalResolver( LocalResolver resolver ) ;

    /** Set the LocalResolver used in this ORB.  This LocalResolver is used for
     * register_initial_reference only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract Resolver getResolver() ;

    /** Get the resolver used in this ORB.  This resolver will be used for list_initial_services
     * and resolve_initial_references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setResolver( Resolver resolver ) ;

    /** Set the resolver used in this ORB.  This resolver will be used for list_initial_services
     * and resolve_initial_references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract int getTransientServerId();

    /** Return this ORB's transient server ID.  This is needed for
     * initializing object adapters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void handleBadServerId( ObjectKey okey ) ;

    /**
     * Handle a bad server id for the given object key.  This should
     * always through an exception: either a ForwardException to
     * allow another server to handle the request, or else an error
     * indication.  XXX Remove after ORT for ORBD work is integrated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public static PresentationManager.StubFactoryFactory

    /** Get the appropriate StubFactoryFactory.  This
     * will be dynamic or static depending on whether
     * com.sun.CORBA.ORBUseDynamicStub is true or false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public static PresentationManager getPresentationManager()

    /**
     * Returns the Presentation Manager for the current thread group, using the ThreadGroup-specific
     * AppContext to hold it. Creates and records one if needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/internal/iiop/ORB.java
public class ORB extends /* 1.4 value: com.sun.corba.se.internal.corba.ORB */

/**
 * Deprecated class for backward compatibility.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/org/omg/CORBA/ORB.java
    public void register_initial_reference( String id,
                                            org.omg.CORBA.Object obj )

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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/org/omg/CORBA/ORB.java
abstract public class ORB extends org.omg.CORBA_2_3.ORB

/** This ORB class is defined to provide a home for the
* register_initial_reference operation, which is added by
* portable interceptors and CORBA 2.4.  It is added here
* until there is an official Java language mapping for the
* method.
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public static LogWrapperBase staticGetLogWrapper( String logDomain,
        String exceptionGroup, LogWrapperFactory factory )

    /** get the log wrapper class (its type is dependent on the exceptionGroup) for the
     * given log domain and exception group in this ORB instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public LogWrapperBase getLogWrapper( String logDomain,
        String exceptionGroup, LogWrapperFactory factory )

    /** get the log wrapper class (its type is dependent on the exceptionGroup) for the
     * given log domain and exception group in this ORB instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public Logger getLogger( String domain )

    /**
     * Returns the logger based on the category.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract TaggedComponentFactoryFinder getTaggedComponentFactoryFinder() ;

    /** Factory finders for the various parts of the IOR: tagged components, tagged
     * profiles, and tagged profile templates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setINSDelegate( CorbaServerRequestDispatcher insDelegate ) ;

    /** Set the ServerRequestDispatcher that should be used for handling INS requests.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract Operation getURLOperation() ;

    /** Get the operation used in string_to_object calls.  The Operation must expect a
     * String and return an org.omg.CORBA.Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setURLOperation( Operation stringToObject ) ;

    /** Set the operation used in string_to_object calls.  The Operation must expect a
     * String and return an org.omg.CORBA.Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract LocalResolver getLocalResolver() ;

    /** Get the LocalResolver used in this ORB.  This LocalResolver is used for
     * register_initial_reference only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setLocalResolver( LocalResolver resolver ) ;

    /** Set the LocalResolver used in this ORB.  This LocalResolver is used for
     * register_initial_reference only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract Resolver getResolver() ;

    /** Get the resolver used in this ORB.  This resolver will be used for list_initial_services
     * and resolve_initial_references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setResolver( Resolver resolver ) ;

    /** Set the resolver used in this ORB.  This resolver will be used for list_initial_services
     * and resolve_initial_references.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract int getTransientServerId();

    /** Return this ORB's transient server ID.  This is needed for
     * initializing object adapters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void handleBadServerId( ObjectKey okey ) ;

    /**
     * Handle a bad server id for the given object key.  This should
     * always through an exception: either a ForwardException to
     * allow another server to handle the request, or else an error
     * indication.  XXX Remove after ORT for ORBD work is integrated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public static PresentationManager.StubFactoryFactory

    /** Get the appropriate StubFactoryFactory.  This
     * will be dynamic or static depending on whether
     * com.sun.CORBA.ORBUseDynamicStub is true or false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORB.java
    public static PresentationManager getPresentationManager()

    /**
     * Returns the Presentation Manager for the current thread group, using the ThreadGroup-specific
     * AppContext to hold it. Creates and records one if needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public org.omg.CORBA.Policy create_policy(int type, org.omg.CORBA.Any val)

    /**
    * Can be invoked to create new instances of policy objects
    * of a specific type with specified initial state. If
    * <tt>create_policy</tt> fails to instantiate a new Policy
    * object due to its inability to interpret the requested type
    * and content of the policy, it raises the <tt>PolicyError</tt>
    * exception with the appropriate reason.
    * @param type the <tt>PolicyType</tt> of the policy object to
    *        be created
    * @param val the value that will be used to set the initial
    *        state of the <tt>Policy</tt> object that is created
    * @return Reference to a newly created <tt>Policy</tt> object
    *        of type specified by the <tt>type</tt> parameter and
    *        initialized to a state specified by the <tt>val</tt>
    *        parameter
    * @throws <tt>org.omg.CORBA.PolicyError</tt> when the requested
    *        policy is not supported or a requested initial state
    *        for the policy is not supported.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    @Deprecated

    /**
     * Creates a new <code>DynEnum</code> object from the given
     * <code>TypeCode</code> object.
     * <P>
     * @param type the <code>TypeCode</code> object from which to create a new
     *        <code>DynEnum</code> object
     * @return the new <code>DynEnum</code> object created from the given
     *         <code>TypeCode</code> object
     * @throws org.omg.CORBA.ORBPackage.InconsistentTypeCode if the given
     *         <code>TypeCode</code> object is not consistent with the operation.
     * @see <a href="package-summary.html#unimpl"><code>CORBA</code> package
     *      comments for unimplemented features</a>
     * @deprecated Use the new <a href="../DynamicAny/DynAnyFactory.html">DynAnyFactory</a> API instead
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    @Deprecated

    /**
     * Creates a new <code>DynUnion</code> object from the given
     * <code>TypeCode</code> object.
     * <P>
     * @param type the <code>TypeCode</code> object from which to create a new
     *        <code>DynUnion</code> object
     * @return the new <code>DynUnion</code> object created from the given
     *         <code>TypeCode</code> object
     * @throws org.omg.CORBA.ORBPackage.InconsistentTypeCode if the given
     *         <code>TypeCode</code> object is not consistent with the operation.
     * @see <a href="package-summary.html#unimpl"><code>CORBA</code> package
     *      comments for unimplemented features</a>
     * @deprecated Use the new <a href="../DynamicAny/DynAnyFactory.html">DynAnyFactory</a> API instead
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    @Deprecated

    /**
     * Creates a new <code>DynArray</code> object from the given
     * <code>TypeCode</code> object.
     * <P>
     * @param type the <code>TypeCode</code> object from which to create a new
     *        <code>DynArray</code> object
     * @return the new <code>DynArray</code> object created from the given
     *         <code>TypeCode</code> object
     * @throws org.omg.CORBA.ORBPackage.InconsistentTypeCode if the given
     *         <code>TypeCode</code> object is not consistent with the operation.
     * @see <a href="package-summary.html#unimpl"><code>CORBA</code> package
     *      comments for unimplemented features</a>
     * @deprecated Use the new <a href="../DynamicAny/DynAnyFactory.html">DynAnyFactory</a> API instead
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    @Deprecated

    /**
     * Creates a new <code>DynSequence</code> object from the given
     * <code>TypeCode</code> object.
     * <P>
     * @param type the <code>TypeCode</code> object from which to create a new
     *        <code>DynSequence</code> object
     * @return the new <code>DynSequence</code> object created from the given
     *         <code>TypeCode</code> object
     * @throws org.omg.CORBA.ORBPackage.InconsistentTypeCode if the given
     *         <code>TypeCode</code> object is not consistent with the operation.
     * @see <a href="package-summary.html#unimpl"><code>CORBA</code> package
     *      comments for unimplemented features</a>
     * @deprecated Use the new <a href="../DynamicAny/DynAnyFactory.html">DynAnyFactory</a> API instead
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    @Deprecated

    /**
     * Creates a new <code>DynStruct</code> object from the given
     * <code>TypeCode</code> object.
     * <P>
     * @param type the <code>TypeCode</code> object from which to create a new
     *        <code>DynStruct</code> object
     * @return the new <code>DynStruct</code> object created from the given
     *         <code>TypeCode</code> object
     * @throws org.omg.CORBA.ORBPackage.InconsistentTypeCode if the given
     *         <code>TypeCode</code> object is not consistent with the operation.
     * @see <a href="package-summary.html#unimpl"><code>CORBA</code> package
     *      comments for unimplemented features</a>
     * @deprecated Use the new <a href="../DynamicAny/DynAnyFactory.html">DynAnyFactory</a> API instead
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    @Deprecated

    /**
     * Creates a basic <code>DynAny</code> object from the given
     * <code>TypeCode</code> object.
     * <P>
     * @param type the <code>TypeCode</code> object from which to create a new
     *        <code>DynAny</code> object
     * @return the new <code>DynAny</code> object created from the given
     *         <code>TypeCode</code> object
     * @throws org.omg.CORBA.ORBPackage.InconsistentTypeCode if the given
     *         <code>TypeCode</code> object is not consistent with the operation.
     * @see <a href="package-summary.html#unimpl"><code>CORBA</code> package
     *      comments for unimplemented features</a>
     * @deprecated Use the new <a href="../DynamicAny/DynAnyFactory.html">DynAnyFactory</a> API instead
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    @Deprecated

    /**
     * Creates a new <code>DynAny</code> object from the given
     * <code>Any</code> object.
     * <P>
     * @param value the <code>Any</code> object from which to create a new
     *        <code>DynAny</code> object
     * @return the new <code>DynAny</code> object created from the given
     *         <code>Any</code> object
     * @see <a href="package-summary.html#unimpl"><code>CORBA</code> package
     *      comments for unimplemented features</a>
     * @deprecated Use the new <a href="../DynamicAny/DynAnyFactory.html">DynAnyFactory</a> API instead
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public boolean get_service_information(short service_type,
                                           ServiceInformationHolder service_info)

    /**
     * Used to obtain information about CORBA facilities and services
     * that are supported by this ORB. The service type for which
     * information is being requested is passed in as the in
     * parameter <tt>service_type</tt>, the values defined by
     * constants in the CORBA module. If service information is
     * available for that type, that is returned in the out parameter
     * <tt>service_info</tt>, and the operation returns the
     * value <tt>true</tt>. If no information for the requested
     * services type is available, the operation returns <tt>false</tt>
     *  (i.e., the service is not supported by this ORB).
     * <P>
     * @param service_type a <code>short</code> indicating the
     *        service type for which information is being requested
     * @param service_info a <code>ServiceInformationHolder</code> object
     *        that will hold the <code>ServiceInformation</code> object
     *        produced by this method
     * @return <code>true</code> if service information is available
     *        for the <tt>service_type</tt>;
     *         <tt>false</tt> if no information for the
     *         requested services type is available
     * @see <a href="package-summary.html#unimpl"><code>CORBA</code> package
     *      comments for unimplemented features</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public void perform_work()

    /**
     * Performs an implementation-dependent unit of work if called
     * by the main thread. Otherwise it does nothing.
     * The methods <code>work_pending</code> and <code>perform_work</code>
     * can be used in
     * conjunction to implement a simple polling loop that multiplexes
     * the main thread among the ORB and other activities.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public boolean work_pending()

    /**
     * Returns <code>true</code> if the ORB needs the main thread to
     * perform some work, and <code>false</code> if the ORB does not
     * need the main thread.
     *
     * @return <code>true</code> if there is work pending, meaning that the ORB
     *         needs the main thread to perform some work; <code>false</code>
     *         if there is no work pending and thus the ORB does not need the
     *         main thread
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public void shutdown(boolean wait_for_completion)

    /**
     * Instructs the ORB to shut down, which causes all
     * object adapters to shut down, in preparation for destruction.<br>
     * If the <code>wait_for_completion</code> parameter
     * is true, this operation blocks until all ORB processing (including
     * processing of currently executing requests, object deactivation,
     * and other object adapter operations) has completed.
     * If an application does this in a thread that is currently servicing
     * an invocation, the <code>BAD_INV_ORDER</code> system exception
     * will be thrown with the OMG minor code 3,
     * since blocking would result in a deadlock.<br>
     * If the <code>wait_for_completion</code> parameter is <code>FALSE</code>,
     * then shutdown may not have completed upon return.<p>
     * While the ORB is in the process of shutting down, the ORB operates as normal,
     * servicing incoming and outgoing requests until all requests have been completed.
     * Once an ORB has shutdown, only object reference management operations
     * may be invoked on the ORB or any object reference obtained from it.
     * An application may also invoke the <code>destroy</code> operation on the ORB itself.
     * Invoking any other operation will throw the <code>BAD_INV_ORDER</code>
     * system exception with the OMG minor code 4.<p>
     * The <code>ORB.run</code> method will return after
     * <code>shutdown</code> has been called.
     *
     * @param wait_for_completion <code>true</code> if the call
     *        should block until the shutdown is complete;
     *        <code>false</code> if it should return immediately
     * @throws org.omg.CORBA.BAD_INV_ORDER if the current thread is servicing
     *         an invocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public void run()

    /**
     * This operation blocks the current thread until the ORB has
     * completed the shutdown process, initiated when some thread calls
     * <code>shutdown</code>. It may be used by multiple threads which
     * get all notified when the ORB shuts down.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    @Deprecated

    /**
     * Retrieves a <code>Current</code> object.
     * The <code>Current</code> interface is used to manage thread-specific
     * information for use by services such as transactions and security.
     *
     * @see <a href="package-summary.html#unimpl"><code>CORBA</code> package
     *      comments for unimplemented features</a>
     *
     * @return          a newly-created <code>Current</code> object
     * @deprecated      use <code>resolve_initial_references</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public Any create_any();

    /**
     * Creates an IDL <code>Any</code> object initialized to
     * contain a <code>Typecode</code> object whose <code>kind</code> field
     * is set to <code>TCKind.tc_null</code>.
     *
     * @return          a newly-created <code>Any</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public org.omg.CORBA.TypeCode create_value_box_tc(String id,
                                                      String name,
                                                      TypeCode boxed_type)

    /**
     * Creates a <code>TypeCode</code> object for an IDL value box.
     *
     * @param id                 the logical id for the value type
     * @param name               the name of the value type
     * @param boxed_type         the TypeCode for the type
     * @return                   the requested TypeCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public org.omg.CORBA.TypeCode create_recursive_tc(String id) {

    /**
     * Create a recursive <code>TypeCode</code> object which
     * serves as a placeholder for a concrete TypeCode during the process of creating
     * TypeCodes which contain recursion. The id parameter specifies the repository id of
     * the type for which the recursive TypeCode is serving as a placeholder. Once the
     * recursive TypeCode has been properly embedded in the enclosing TypeCode which
     * corresponds to the specified repository id, it will function as a normal TypeCode.
     * Invoking operations on the recursive TypeCode before it has been embedded in the
     * enclosing TypeCode will result in a <code>BAD_TYPECODE</code> exception.
     * <P>
     * For example, the following IDL type declaration contains recursion:
     * <PRE>
     *    Struct Node {
     *        Sequence&lt;Node&gt; subnodes;
     *    };
     * </PRE>
     * <P>
     * To create a TypeCode for struct Node, you would invoke the TypeCode creation
     * operations as shown below:
     * <PRE>
     * String nodeID = "IDL:Node:1.0";
     * TypeCode recursiveSeqTC = orb.create_sequence_tc(0, orb.create_recursive_tc(nodeID));
     * StructMember[] members = { new StructMember("subnodes", recursiveSeqTC, null) };
     * TypeCode structNodeTC = orb.create_struct_tc(nodeID, "Node", members);
     * </PRE>
     * <P>
     * Also note that the following is an illegal IDL type declaration:
     * <PRE>
     *    Struct Node {
     *        Node next;
     *    };
     * </PRE>
     * <P>
     * Recursive types can only appear within sequences which can be empty.
     * That way marshaling problems, when transmitting the struct in an Any, are avoided.
     * <P>
     * @param id                 the logical id of the referenced type
     * @return                   the requested TypeCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public org.omg.CORBA.TypeCode create_value_tc(String id,
                                                  String name,
                                                  short type_modifier,
                                                  TypeCode concrete_base,
                                                  ValueMember[] members)

    /**
     * Create a <code>TypeCode</code> object for an IDL value type.
     * The concrete_base parameter is the TypeCode for the immediate
     * concrete valuetype base of the valuetype for which the TypeCode
     * is being created.
     * It may be null if the valuetype does not have a concrete base.
     *
     * @param id                 the logical id for the value type.
     * @param name               the name of the value type.
     * @param type_modifier      one of the value type modifier constants:
     *                           VM_NONE, VM_CUSTOM, VM_ABSTRACT or VM_TRUNCATABLE
     * @param concrete_base      a <code>TypeCode</code> object
     *                           describing the concrete valuetype base
     * @param members            an array containing the members of the value type
     * @return                   the requested TypeCode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public org.omg.CORBA.TypeCode create_fixed_tc(short digits, short scale)

    /**
     * Create a <code>TypeCode</code> object for an IDL fixed type.
     *
     * @param digits    specifies the total number of decimal digits in the number
     *                  and must be from 1 to 31 inclusive.
     * @param scale     specifies the position of the decimal point.
     * @return          the requested TypeCode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public org.omg.CORBA.TypeCode create_abstract_interface_tc(
                                                               String id,
                                                               String name)

    /**
     * Create a <code>TypeCode</code> object for an IDL abstract interface.
     *
     * @param id        the logical id for the abstract interface type.
     * @param name      the name of the abstract interface type.
     * @return          the requested TypeCode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public org.omg.CORBA.TypeCode create_native_tc(String id,
                                                   String name)

    /**
     * Create a <code>TypeCode</code> object for an IDL native type.
     *
     * @param id        the logical id for the native type.
     * @param name      the name of the native type.
     * @return          the requested TypeCode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_array_tc(int length, TypeCode element_type);

    /**
     * Creates a <code>TypeCode</code> object representing an IDL <code>array</code>.
     * The <code>TypeCode</code> object is initialized with the given length and
     * element type.
     *
     * @param length    the length of the <code>array</code>
     * @param element_type  a <code>TypeCode</code> object describing the type
     *                      of element contained in the <code>array</code>
     * @return          a newly-created <code>TypeCode</code> object describing
     *              an IDL <code>array</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    @Deprecated

    /**
     * Creates a <code>TypeCode</code> object representing a
     * a recursive IDL <code>sequence</code>.
     * <P>
     * For the IDL <code>struct</code> Node in following code fragment,
     * the offset parameter for creating its sequence would be 1:
     * <PRE>
     *    Struct Node {
     *        long value;
     *        Sequence &lt;Node&gt; subnodes;
     *    };
     * </PRE>
     *
     * @param bound     the bound for the sequence, 0 if unbounded
     * @param offset    the index to the enclosing <code>TypeCode</code> object
     *                  that describes the elements of this sequence
     * @return          a newly-created <code>TypeCode</code> object describing
     *                   a recursive sequence
     * @deprecated Use a combination of create_recursive_tc and create_sequence_tc instead
     * @see #create_recursive_tc(String) create_recursive_tc
     * @see #create_sequence_tc(int, TypeCode) create_sequence_tc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_sequence_tc(int bound, TypeCode element_type);

    /**
     * Creates a <code>TypeCode</code> object representing an IDL <code>sequence</code>.
     * The <code>TypeCode</code> object is initialized with the given bound and
     * element type.
     *
     * @param bound     the bound for the <code>sequence</code>, 0 if unbounded
     * @param element_type
     *                  the <code>TypeCode</code> object describing the elements
     *          contained in the <code>sequence</code>
     * @return          a newly-created <code>TypeCode</code> object describing
     *              an IDL <code>sequence</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_wstring_tc(int bound);

    /**
     * Creates a <code>TypeCode</code> object representing a bounded IDL
     * <code>wstring</code> (wide string).
     * The <code>TypeCode</code> object is initialized with the given bound,
     * which represents the maximum length of the wide string. Zero indicates
     * that the string described by this type code is unbounded.
     *
     * @param bound     the bound for the <code>wstring</code>; cannot be negative
     * @return          a newly-created <code>TypeCode</code> object describing
     *              a bounded IDL <code>wstring</code>
     * @exception BAD_PARAM if bound is a negative value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_string_tc(int bound);

    /**
     * Creates a <code>TypeCode</code> object representing a bounded IDL
     * <code>string</code>.
     * The <code>TypeCode</code> object is initialized with the given bound,
     * which represents the maximum length of the string. Zero indicates
     * that the string described by this type code is unbounded.
     *
     * @param bound     the bound for the <code>string</code>; cannot be negative
     * @return          a newly-created <code>TypeCode</code> object describing
     *              a bounded IDL <code>string</code>
     * @exception BAD_PARAM if bound is a negative value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_interface_tc(String id, String name);

    /**
     * Creates a <code>TypeCode</code> object representing an IDL <code>interface</code>.
     * The <code>TypeCode</code> object is initialized with the given id
     * and name.
     *
     * @param id        the repository id for the interface
     * @param name      the name for the interface
     * @return          a newly-created <code>TypeCode</code> object describing
     *              an IDL <code>interface</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_exception_tc(String id, String name,
                                                 StructMember[] members);

    /**
     * Creates a <code>TypeCode</code> object representing an IDL <code>exception</code>.
     * The <code>TypeCode</code> object is initialized with the given id,
     * name, and members.
     *
     * @param id        the repository id for the <code>exception</code>
     * @param name      the name for the <code>exception</code>
     * @param members   an array describing the members of the <code>exception</code>
     * @return          a newly-created <code>TypeCode</code> object describing
     *              an IDL <code>exception</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_alias_tc(String id, String name,
                                             TypeCode original_type);

    /**
     * Creates a <code>TypeCode</code> object representing an IDL <code>alias</code>
     * (<code>typedef</code>).
     * The <code>TypeCode</code> object is initialized with the given id,
     * name, and original type.
     *
     * @param id        the repository id for the alias
     * @param name      the name for the alias
     * @param original_type
     *                  the <code>TypeCode</code> object describing the original type
     *          for which this is an alias
     * @return          a newly-created <code>TypeCode</code> object describing
     *              an IDL <code>alias</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_enum_tc(String id, String name, String[] members);

    /**
     * Creates a <code>TypeCode</code> object representing an IDL <code>enum</code>.
     * The <code>TypeCode</code> object is initialized with the given id,
     * name, and members.
     *
     * @param id        the repository id for the <code>enum</code>
     * @param name      the name for the <code>enum</code>
     * @param members   an array describing the members of the <code>enum</code>
     * @return          a newly-created <code>TypeCode</code> object describing
     *              an IDL <code>enum</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_union_tc(String id, String name,
                                             TypeCode discriminator_type,
                                             UnionMember[] members);

    /**
     * Creates a <code>TypeCode</code> object representing an IDL <code>union</code>.
     * The <code>TypeCode</code> object is initialized with the given id,
     * name, discriminator type, and members.
     *
     * @param id        the repository id of the <code>union</code>
     * @param name      the name of the <code>union</code>
     * @param discriminator_type        the type of the <code>union</code> discriminator
     * @param members   an array describing the members of the <code>union</code>
     * @return          a newly-created <code>TypeCode</code> object describing
     *              an IDL <code>union</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode create_struct_tc(String id, String name,
                                              StructMember[] members);

    /**
     * Creates a <code>TypeCode</code> object representing an IDL <code>struct</code>.
     * The <code>TypeCode</code> object is initialized with the given id,
     * name, and members.
     *
     * @param id        the repository id for the <code>struct</code>
     * @param name      the name of the <code>struct</code>
     * @param members   an array describing the members of the <code>struct</code>
     * @return          a newly-created <code>TypeCode</code> object describing
     *              an IDL <code>struct</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public TypeCode get_primitive_tc(TCKind tcKind);

    /**
     * Retrieves the <code>TypeCode</code> object that represents
     * the given primitive IDL type.
     *
     * @param tcKind    the <code>TCKind</code> instance corresponding to the
     *                  desired primitive type
     * @return          the requested <code>TypeCode</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public Request get_next_response() throws WrongTransaction;

    /**
     * Gets the next <code>Request</code> instance for which a response
     * has been received.
     *
     * @return          the next <code>Request</code> object ready with a response
     * @exception WrongTransaction if the method <code>get_next_response</code>
     * is called from a transaction scope different
     * from the one from which the original request was sent. See the
     * OMG Transaction Service specification for details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public boolean poll_next_response();

    /**
     * Finds out if any of the deferred (asynchronous) invocations have
     * a response yet.
     * @return <code>true</code> if there is a response available;
     *         <code> false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public void send_multiple_requests_deferred(Request[] req);

    /**
     * Sends multiple dynamic (DII) requests asynchronously.
     *
     * @param req               an array of <code>Request</code> objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public void send_multiple_requests_oneway(Request[] req);

    /**
     * Sends multiple dynamic (DII) requests asynchronously without expecting
     * any responses. Note that oneway invocations are not guaranteed to
     * reach the server.
     *
     * @param req               an array of request objects
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public org.omg.CORBA.portable.OutputStream create_output_stream();

    /**
     * Creates a new <code>org.omg.CORBA.portable.OutputStream</code> into which
     * IDL method parameters can be marshalled during method invocation.
     * @return          the newly-created
     *              <code>org.omg.CORBA.portable.OutputStream</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public Environment create_environment();

    /**
     * Creates an <code>Environment</code> object.
     *
     * @return  the newly-created <code>Environment</code> object
     * @see Environment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public Context get_default_context();

    /**
     * Gets the default <code>Context</code> object.
     *
     * @return the default <code>Context</code> object
     * @see Context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public ContextList create_context_list();

    /**
     * Creates an empty <code>ContextList</code> object.
     *
     * @return  the newly-created <code>ContextList</code> object
     * @see ContextList
     * @see Context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public ExceptionList create_exception_list();

    /**
     * Creates an empty <code>ExceptionList</code> object.
     *
     * @return  the newly-created <code>ExceptionList</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public NamedValue create_named_value(String s, Any any, int flags);

    /**
     * Creates a <code>NamedValue</code> object
     * using the given name, value, and argument mode flags.
     * <P>
     * A <code>NamedValue</code> object serves as (1) a parameter or return
     * value or (2) a context property.
     * It may be used by itself or
     * as an element in an <code>NVList</code> object.
     *
     * @param s  the name of the <code>NamedValue</code> object
     * @param any  the <code>Any</code> value to be inserted into the
     *             <code>NamedValue</code> object
     * @param flags  the argument mode flags for the <code>NamedValue</code>: one of
     * <code>ARG_IN.value</code>, <code>ARG_OUT.value</code>,
     * or <code>ARG_INOUT.value</code>.
     *
     * @return  the newly-created <code>NamedValue</code> object
     * @see NamedValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public NVList create_operation_list(org.omg.CORBA.Object oper)

    /**
     * Creates an <code>NVList</code> initialized with argument
     * descriptions for the operation described in the given
     * <code>OperationDef</code> object.  This <code>OperationDef</code> object
     * is obtained from an Interface Repository. The arguments in the
     * returned <code>NVList</code> object are in the same order as in the
     * original IDL operation definition, which makes it possible for the list
     * to be used in dynamic invocation requests.
     *
     * @param oper      the <code>OperationDef</code> object to use to create the list
     * @return          a newly-created <code>NVList</code> object containing
     * descriptions of the arguments to the method described in the given
     * <code>OperationDef</code> object
     *
     * @see NVList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public NVList create_list(int count);

    /**
     * Allocates an <code>NVList</code> with (probably) enough
     * space for the specified number of <code>NamedValue</code> objects.
     * Note that the specified size is only a hint to help with
     * storage allocation and does not imply the maximum size of the list.
     *
     * @param count  suggested number of <code>NamedValue</code> objects for
     *               which to allocate space
     * @return the newly-created <code>NVList</code>
     *
     * @see NVList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public org.omg.CORBA.Object string_to_object(String str);

    /**
     * Converts a string produced by the method <code>object_to_string</code>
     * back to a CORBA object reference.
     *
     * @param str the string to be converted back to an object reference.  It must
     * be the result of converting an object reference to a string using the
     * method <code>object_to_string</code>.
     * @return the object reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public String object_to_string(org.omg.CORBA.Object obj);

    /**
     * Converts the given CORBA object reference to a string.
     * Note that the format of this string is predefined by IIOP, allowing
     * strings generated by a different ORB to be converted back into an object
     * reference.
     * <P>
     * The resulting <code>String</code> object may be stored or communicated
     * in any way that a <code>String</code> object can be manipulated.
     *
     * @param obj the object reference to stringify
     * @return the string representing the object reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public org.omg.CORBA.Object resolve_initial_references(String object_name)

    /**
     * Resolves a specific object reference from the set of available
     * initial service names.
     *
     * @param object_name the name of the initial service as a string
     * @return  the object reference associated with the given name
     * @exception InvalidName if the given name is not associated with a
     *                         known service
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract public String[] list_initial_services();

    /**
     * Returns a list of the initially available CORBA object references,
     * such as "NameService" and "InterfaceRepository".
     *
     * @return an array of <code>String</code> objects that represent
     *         the object references for CORBA services
     *         that are initially available with this ORB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public void disconnect(org.omg.CORBA.Object obj) {

    /**
     * Disconnects the given servant object from the ORB. After this method returns,
     * the ORB will reject incoming remote requests for the disconnected
     * servant and will send the exception
     * <code>org.omg.CORBA.OBJECT_NOT_EXIST</code> back to the
     * remote client. Thus the object appears to be destroyed from the
     * point of view of remote clients. Note, however, that local requests issued
     * using the servant  directly do not
     * pass through the ORB; hence, they will continue to be processed by the
     * servant.
     * <P>
     * Calling the method <code>disconnect</code> has no effect
     * if the servant is not connected to the ORB.
     * <P>
     * Deprecated by the OMG in favor of the Portable Object Adapter APIs.
     *
     * @param obj The servant object to be disconnected from the ORB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public void destroy( ) {

    /**
     * Destroys the ORB so that its resources can be reclaimed.
     * Any operation invoked on a destroyed ORB reference will throw the
     * <code>OBJECT_NOT_EXIST</code> exception.
     * Once an ORB has been destroyed, another call to <code>init</code>
     * with the same ORBid will return a reference to a newly constructed ORB.<p>
     * If <code>destroy</code> is called on an ORB that has not been shut down,
     * it will start the shut down process and block until the ORB has shut down
     * before it destroys the ORB.<br>
     * If an application calls <code>destroy</code> in a thread that is currently servicing
     * an invocation, the <code>BAD_INV_ORDER</code> system exception will be thrown
     * with the OMG minor code 3, since blocking would result in a deadlock.<p>
     * For maximum portability and to avoid resource leaks, an application should
     * always call <code>shutdown</code> and <code>destroy</code>
     * on all ORB instances before exiting.
     *
     * @throws org.omg.CORBA.BAD_INV_ORDER if the current thread is servicing an invocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public void connect(org.omg.CORBA.Object obj) {

    /**
     * Connects the given servant object (a Java object that is
     * an instance of the server implementation class)
     * to the ORB. The servant class must
     * extend the <code>ImplBase</code> class corresponding to the interface that is
     * supported by the server. The servant must thus be a CORBA object
     * reference, and inherit from <code>org.omg.CORBA.Object</code>.
     * Servants created by the user can start receiving remote invocations
     * after the method <code>connect</code> has been called. A servant may also be
     * automatically and implicitly connected to the ORB if it is passed as
     * an IDL parameter in an IDL method invocation on a non-local object,
     * that is, if the servant object has to be marshalled and sent outside of the
     * process address space.
     * <P>
     * Calling the method <code>connect</code> has no effect
     * when the servant object is already connected to the ORB.
     * <P>
     * Deprecated by the OMG in favor of the Portable Object Adapter APIs.
     *
     * @param obj The servant object reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract protected void set_parameters(Applet app, Properties props);

    /**
     * Allows the ORB implementation to be initialized with the given
     * applet and parameters. This method, used in applets only,
     * is implemented by subclass ORB implementations and called
     * by the appropriate <code>init</code> method to pass in its parameters.
     *
     * @param app the applet; may be <code>null</code>
     * @param props applet-specific properties; may be <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    abstract protected void set_parameters(String[] args, Properties props);

    /**
     * Allows the ORB implementation to be initialized with the given
     * parameters and properties. This method, used in applications only,
     * is implemented by subclass ORB implementations and called
     * by the appropriate <code>init</code> method to pass in its parameters.
     *
     * @param args command-line arguments for the application's <code>main</code>
     *             method; may be <code>null</code>
     * @param props application-specific properties; may be <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public static ORB init(Applet app, Properties props) {

    /**
     * Creates a new <code>ORB</code> instance for an applet.  This
     * method may be called from applets only and returns a new
     * fully-functional <code>ORB</code> object each time it is called.
     * @param app the applet; may be <code>null</code>
     * @param props applet-specific properties; may be <code>null</code>
     * @return the newly-created ORB instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public static ORB init(String[] args, Properties props) {

    /**
     * Creates a new <code>ORB</code> instance for a standalone
     * application.  This method may be called from applications
     * only and returns a new fully functional <code>ORB</code> object
     * each time it is called.
     * @param args command-line arguments for the application's <code>main</code>
     *             method; may be <code>null</code>
     * @param props application-specific properties; may be <code>null</code>
     * @return the newly-created ORB instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
    public static synchronized ORB init() {

    /**
     * Returns the <code>ORB</code> singleton object. This method always returns the
     * same ORB instance, which is an instance of the class described by the
     * <code>org.omg.CORBA.ORBSingletonClass</code> system property.
     * <P>
     * This no-argument version of the method <code>init</code> is used primarily
     * as a factory for <code>TypeCode</code> objects, which are used by
     * <code>Helper</code> classes to implement the method <code>type</code>.
     * It is also used to create <code>Any</code> objects that are used to
     * describe <code>union</code> labels (as part of creating a <code>
     * TypeCode</code> object for a <code>union</code>).
     * <P>
     * This method is not intended to be used by applets, and in the event
     * that it is called in an applet environment, the ORB it returns
     * is restricted so that it can be used only as a factory for
     * <code>TypeCode</code> objects.  Any <code>TypeCode</code> objects
     * it produces can be safely shared among untrusted applets.
     * <P>
     * If an ORB is created using this method from an applet,
     * a system exception will be thrown if
     * methods other than those for
     * creating <code>TypeCode</code> objects are invoked.
     *
     * @return the singleton ORB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ORB.java
abstract public class ORB {

/**
 * A class providing APIs for the CORBA Object Request Broker
 * features.  The <code>ORB</code> class also provides
 * "pluggable ORB implementation" APIs that allow another vendor's ORB
 * implementation to be used.
 * <P>
 * An ORB makes it possible for CORBA objects to communicate
 * with each other by connecting objects making requests (clients) with
 * objects servicing requests (servers).
 * <P>
 *
 * The <code>ORB</code> class, which
 * encapsulates generic CORBA functionality, does the following:
 * (Note that items 5 and 6, which include most of the methods in
 * the class <code>ORB</code>, are typically used with the <code>Dynamic Invocation
 * Interface</code> (DII) and the <code>Dynamic Skeleton Interface</code>
 * (DSI).
 * These interfaces may be used by a developer directly, but
 * most commonly they are used by the ORB internally and are
 * not seen by the general programmer.)
 * <OL>
 * <li> initializes the ORB implementation by supplying values for
 *      predefined properties and environmental parameters
 * <li> obtains initial object references to services such as
 * the NameService using the method <code>resolve_initial_references</code>
 * <li> converts object references to strings and back
 * <li> connects the ORB to a servant (an instance of a CORBA object
 * implementation) and disconnects the ORB from a servant
 * <li> creates objects such as
 *   <ul>
 *   <li><code>TypeCode</code>
 *   <li><code>Any</code>
 *   <li><code>NamedValue</code>
 *   <li><code>Context</code>
 *   <li><code>Environment</code>
 *   <li>lists (such as <code>NVList</code>) containing these objects
 *   </ul>
 * <li> sends multiple messages in the DII
 * </OL>
 *
 * <P>
 * The <code>ORB</code> class can be used to obtain references to objects
 * implemented anywhere on the network.
 * <P>
 * An application or applet gains access to the CORBA environment
 * by initializing itself into an <code>ORB</code> using one of
 * three <code>init</code> methods.  Two of the three methods use the properties
 * (associations of a name with a value) shown in the
 * table below.<BR>
 * <TABLE BORDER=1 SUMMARY="Standard Java CORBA Properties">
 * <TR><TH>Property Name</TH>   <TH>Property Value</TH></TR>
 * <CAPTION>Standard Java CORBA Properties:</CAPTION>
 *     <TR><TD>org.omg.CORBA.ORBClass</TD>
 *     <TD>class name of an ORB implementation</TD></TR>
 *     <TR><TD>org.omg.CORBA.ORBSingletonClass</TD>
 *     <TD>class name of the ORB returned by <code>init()</code></TD></TR>
 * </TABLE>
 * <P>
 * These properties allow a different vendor's <code>ORB</code>
 * implementation to be "plugged in."
 * <P>
 * When an ORB instance is being created, the class name of the ORB
 * implementation is located using
 * the following standard search order:<P>
 *
 * <OL>
 *     <LI>check in Applet parameter or application string array, if any
 *
 *     <LI>check in properties parameter, if any
 *
 *     <LI>check in the System properties
 *
 *     <LI>check in the orb.properties file located in the user.home
 *         directory (if any)
 *
 *     <LI>check in the orb.properties file located in the java.home/lib
 *         directory (if any)
 *
 *     <LI>fall back on a hardcoded default behavior (use the Java&nbsp;IDL
 *         implementation)
 * </OL>
 * <P>
 * Note that Java&nbsp;IDL provides a default implementation for the
 * fully-functional ORB and for the Singleton ORB.  When the method
 * <code>init</code> is given no parameters, the default Singleton
 * ORB is returned.  When the method <code>init</code> is given parameters
 * but no ORB class is specified, the Java&nbsp;IDL ORB implementation
 * is returned.
 * <P>
 * The following code fragment creates an <code>ORB</code> object
 * initialized with the default ORB Singleton.
 * This ORB has a
 * restricted implementation to prevent malicious applets from doing
 * anything beyond creating typecodes.
 * It is called a singleton
 * because there is only one instance for an entire virtual machine.
 * <PRE>
 *    ORB orb = ORB.init();
 * </PRE>
 * <P>
 * The following code fragment creates an <code>ORB</code> object
 * for an application.  The parameter <code>args</code>
 * represents the arguments supplied to the application's <code>main</code>
 * method.  Since the property specifies the ORB class to be
 * "SomeORBImplementation", the new ORB will be initialized with
 * that ORB implementation.  If p had been null,
 * and the arguments had not specified an ORB class,
 * the new ORB would have been
 * initialized with the default Java&nbsp;IDL implementation.
 * <PRE>
 *    Properties p = new Properties();
 *    p.put("org.omg.CORBA.ORBClass", "SomeORBImplementation");
 *    ORB orb = ORB.init(args, p);
 * </PRE>
 * <P>
 * The following code fragment creates an <code>ORB</code> object
 * for the applet supplied as the first parameter.  If the given
 * applet does not specify an ORB class, the new ORB will be
 * initialized with the default Java&nbsp;IDL implementation.
 * <PRE>
 *    ORB orb = ORB.init(myApplet, null);
 * </PRE>
 * <P>
 * An application or applet can be initialized in one or more ORBs.
 * ORB initialization is a bootstrap call into the CORBA world.
 * @since   JDK1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/ORB.java
     public void set_delegate(java.lang.Object wrapper) {

/**
 * @see <a href="package-summary.html#unimpl"><code>CORBA_2_3</code> package
 *      comments for unimplemented features</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/ORB.java
    // always return a ValueDef or throw BAD_PARAM if

/**
 * @see <a href="package-summary.html#unimpl"><code>CORBA_2_3</code> package
 *      comments for unimplemented features</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/ORB.java
    public org.omg.CORBA.portable.ValueFactory lookup_value_factory(String id)

/**
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/ORB.java
    public void unregister_value_factory(String id)

/**
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/ORB.java
    public org.omg.CORBA.portable.ValueFactory register_value_factory(String id,
                                                                     org.omg.CORBA.portable.ValueFactory factory)

/**
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/ORB.java
public abstract class ORB extends org.omg.CORBA.ORB {

/**
 * A class extending <code>org.omg.CORBA.ORB</code> to make the ORB
 * portable under the OMG CORBA version 2.3 specification.
 */
