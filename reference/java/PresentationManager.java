_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
    boolean useDynamicStubs() ;

    /** Returns the value of the com.sun.CORBA.ORBUseDynamicStub
     * property.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
    Tie getTie() ;

    /** Equivalent to getStubFactoryFactory( true ).getTie( null ).
     * Provided for compatibility with earlier versions of PresentationManager
     * as used in the app server.  The class argument is ignored in
     * the dynamic case, so this is safe.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
    void setStubFactoryFactory( boolean isDynamic, StubFactoryFactory sff ) ;

    /** Register the StubFactoryFactory.  Note that
     * a static StubFactoryFactory is always required for IDL.  The
     * dynamic stubFactoryFactory is optional.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
    StubFactoryFactory getStubFactoryFactory( boolean isDynamic ) ;

    /** Return the registered StubFactoryFactory.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
    DynamicMethodMarshaller getDynamicMethodMarshaller( Method method ) ;

    /** Given a particular method, return a DynamicMethodMarshaller
     * for that method.  This is used for dynamic stubs and ties.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
    ClassData getClassData( Class cls ) ;

    /** Get the ClassData for a particular class.
     * This class may be an implementation class, in which
     * case the IDLNameTranslator handles all Remote interfaces implemented by
     * the class.  If the class implements more than one remote interface, and not
     * all of the remote interfaces are related by inheritance, then the type
     * IDs have the implementation class as element 0.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        Map getDictionary() ;

        /** Get the dictionary for this ClassData instance.
         * This is used to hold class-specific information for a Class
         * in the class data.  This avoids the need to create other
         * caches for accessing the information.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        InvocationHandlerFactory getInvocationHandlerFactory() ;

        /** Get the InvocationHandlerFactory that is used to create
         * an InvocationHandler for dynamic stubs of the type of the
         * ClassData.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        String[] getTypeIds() ;

        /** Return the array of repository IDs for all of the remote
         * interfaces implemented by this class.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        IDLNameTranslator getIDLNameTranslator() ;

        /** Get the IDLNameTranslator for the class used to create
         * this ClassData instance.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        Class getMyClass() ;

        /** Get the class used to create this ClassData instance
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        String[] getTypeIds() ;

        /** Return the repository ID information for all Stubs
         * created by this stub factory.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        org.omg.CORBA.Object makeStub() ;

        /** Create a new dynamic stub.  It has the type that was
         * used to create this factory.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
    public interface StubFactory

    /** Creates the actual stub needed for RMI-IIOP remote
     * references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        boolean createsDynamicStubs() ;

        /** Return whether or not this StubFactoryFactory creates StubFactory
         * instances that create dynamic stubs and ties.  At the top level,
         * true indicates that rmic -iiop is not needed for generating stubs
         * or ties.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        Tie getTie( Class cls ) ;

        /** Return a Tie for the given class.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        PresentationManager.StubFactory createStubFactory( String className,
            boolean isIDLStub, String remoteCodeBase, Class expectedClass,
            ClassLoader classLoader);

        /** Create a stub factory for stubs for the interface whose type is given by
         * className.  className may identify either an IDL interface or an RMI-IIOP
         * interface.
         * @param className The name of the remote interface as a Java class name.
         * @param isIDLStub True if className identifies an IDL stub, else false.
         * @param remoteCodeBase The CodeBase to use for loading Stub classes, if
         * necessary (may be null or unused).
         * @param expectedClass The expected stub type (may be null or unused).
         * @param classLoader The classLoader to use (may be null).
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
        String getStubName( String className ) ;

        /** Return the standard name of a stub (according to the RMI-IIOP specification
         * and rmic).  This is needed so that the name of a stub is known for
         * standalone clients of the app server.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
    public interface StubFactoryFactory

    /** Creates StubFactory and Tie instances.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/presentation/rmi/PresentationManager.java
public interface PresentationManager

/** Provides access to RMI-IIOP stubs and ties.
 * Any style of stub and tie generation may be used.
 * This includes compiler generated stubs and runtime generated stubs
 * as well as compiled and reflective ties.  There is normally
 * only one instance of this interface per VM.  The instance
 * is obtained from the static method
 * com.sun.corba.se.spi.orb.ORB.getPresentationManager.
 * <p>
 * Note that
 * the getClassData and getDynamicMethodMarshaller methods
 * maintain caches to avoid redundant computation.
 */
