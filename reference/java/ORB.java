_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/internal/iiop/ORB.java
public class ORB extends /* 1.4 value: com.sun.corba.se.internal.corba.ORB */

/**
 * Deprecated class for backward compatibility.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/org/omg/CORBA/ORB.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/org/omg/CORBA/ORB.java
abstract public class ORB extends org.omg.CORBA_2_3.ORB

/** This ORB class is defined to provide a home for the
* register_initial_reference operation, which is added by
* portable interceptors and CORBA 2.4.  It is added here
* until there is an official Java language mapping for the
* method.
*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public static LogWrapperBase staticGetLogWrapper( String logDomain,
        String exceptionGroup, LogWrapperFactory factory )

    /** get the log wrapper class (its type is dependent on the exceptionGroup) for the
     * given log domain and exception group in this ORB instance.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public LogWrapperBase getLogWrapper( String logDomain,
        String exceptionGroup, LogWrapperFactory factory )

    /** get the log wrapper class (its type is dependent on the exceptionGroup) for the
     * given log domain and exception group in this ORB instance.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public Logger getLogger( String domain )

    /**
     * Returns the logger based on the category.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract TaggedComponentFactoryFinder getTaggedComponentFactoryFinder() ;

    /** Factory finders for the various parts of the IOR: tagged components, tagged
     * profiles, and tagged profile templates.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setINSDelegate( CorbaServerRequestDispatcher insDelegate ) ;

    /** Set the ServerRequestDispatcher that should be used for handling INS requests.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract Operation getURLOperation() ;

    /** Get the operation used in string_to_object calls.  The Operation must expect a
     * String and return an org.omg.CORBA.Object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setURLOperation( Operation stringToObject ) ;

    /** Set the operation used in string_to_object calls.  The Operation must expect a
     * String and return an org.omg.CORBA.Object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract LocalResolver getLocalResolver() ;

    /** Get the LocalResolver used in this ORB.  This LocalResolver is used for
     * register_initial_reference only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setLocalResolver( LocalResolver resolver ) ;

    /** Set the LocalResolver used in this ORB.  This LocalResolver is used for
     * register_initial_reference only.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract Resolver getResolver() ;

    /** Get the resolver used in this ORB.  This resolver will be used for list_initial_services
     * and resolve_initial_references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void setResolver( Resolver resolver ) ;

    /** Set the resolver used in this ORB.  This resolver will be used for list_initial_services
     * and resolve_initial_references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract int getTransientServerId();

    /** Return this ORB's transient server ID.  This is needed for
     * initializing object adapters.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public abstract void handleBadServerId( ObjectKey okey ) ;

    /**
     * Handle a bad server id for the given object key.  This should
     * always through an exception: either a ForwardException to
     * allow another server to handle the request, or else an error
     * indication.  XXX Remove after ORT for ORBD work is integrated.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public static PresentationManager.StubFactoryFactory

    /** Get the appropriate StubFactoryFactory.  This
     * will be dynamic or static depending on whether
     * com.sun.CORBA.ORBUseDynamicStub is true or false.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORB.java
    public static PresentationManager getPresentationManager()

    /**
     * Returns the Presentation Manager for the current thread group, using the ThreadGroup-specific
     * AppContext to hold it. Creates and records one if needed.
     */
