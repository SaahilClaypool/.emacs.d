_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    Set<ObjectAdapterFactory> getObjectAdapterFactories();

    /** Return the set of all ObjectAdapterFactory instances that are registered.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    ObjectAdapterFactory getObjectAdapterFactory( int scid ) ;

    /** Get the ObjectAdapterFactory for a particular subcontract ID scid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    void registerObjectAdapterFactory( ObjectAdapterFactory oaf, int scid) ;

    /** Register an ObjectAdapterFactory for a particular subcontract ID.
     * This controls how Object references are created and managed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    CorbaServerRequestDispatcher getServerRequestDispatcher( String name ) ;

    /** Get the CorbaServerRequestDispatcher for a particular object key.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    void registerServerRequestDispatcher( CorbaServerRequestDispatcher ssc, String name ) ;

    /** Register a CorbaServerRequestDispatcher for handling an explicit object key name.
     * This is used for non-standard invocations such as INS and the bootstrap name service.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    CorbaServerRequestDispatcher getServerRequestDispatcher(int scid) ;

    /** Get the CorbaServerRequestDispatcher for subcontract ID scid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    void registerServerRequestDispatcher( CorbaServerRequestDispatcher ssc, int scid) ;

    /** Register a CorbaServerRequestDispatcher for a particular subcontract ID.
     * The subcontract ID appears in the ObjectKey of an object reference, and is used
     * to control how a particular kind of request is processed when received by the ORB.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    LocalClientRequestDispatcherFactory getLocalClientRequestDispatcherFactory( int scid ) ;

    /** Get the LocalClientRequestDispatcher for subcontract ID scid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    void registerLocalClientRequestDispatcherFactory( LocalClientRequestDispatcherFactory csc, int scid) ;

    /** Register a LocalClientRequestDispatcher for a particular subcontract ID.
     * The subcontract ID appears in the ObjectKey of an object reference, and is used
     * to control how a particular kind of colocated request is processed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    ClientRequestDispatcher getClientRequestDispatcher( int scid ) ;

    /** Get the ClientRequestDispatcher for subcontract ID scid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
    void registerClientRequestDispatcher( ClientRequestDispatcher csc, int scid) ;

    /** Register a ClientRequestDispatcher for a particular subcontract ID.
     * The subcontract ID appears in the ObjectKey of an object reference, and is used
     * to control how a remote method invocation is processed by the ORB for a
     * particular kind of object reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/RequestDispatcherRegistry.java
public interface RequestDispatcherRegistry {

/**
 * This is a registry of all subcontract ID dependent objects.  This includes:
 * LocalClientRequestDispatcherFactory, ClientRequestDispatcher, ServerRequestDispatcher, and
 * ObjectAdapterFactory.
 */
