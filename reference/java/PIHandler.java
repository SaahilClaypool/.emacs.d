_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void cleanupServerPIRequest() ;

    /**
     * Invoked when a request is about to be cleaned up.  Must be called
     * after ending points are called so that the info object on the stack
     * can be deinitialized and popped from the stack at the appropriate
     * time.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void setServerPIInfo( Any result ) ;

    /**
     * Notifies PI of additional information for server-side interceptors.
     * PI will use this information as a source of information for the
     * ServerRequestInfo object.  This is the result of a DSI request.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void setServerPIExceptionInfo( Any exception ) ;

    /**
     * Notifies PI of additional information for server-side interceptors.
     * PI will use this information as a source of information for the
     * ServerRequestInfo object.  This is the exception of a DSI request.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void setServerPIInfo( NVList arguments ) ;

    /**
     * Notifies PI of additional information for server-side interceptors.
     * PI will use this information as a source of information for the
     * ServerRequestInfo object.  These are the arguments for a DSI request.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void setServerPIInfo( Exception exception ) ;

    /**
     * Notifies PI of additional information required for ServerRequestInfo.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void setServerPIInfo( java.lang.Object servant,
                                    String targetMostDerivedInterface ) ;

    /**
     * Notifies PI of additional information reqired for ServerRequestInfo.
     *
     * @param servant The servant.  This is java.lang.Object because in the
     *     POA case, this will be a org.omg.PortableServer.Servant whereas
     *     in the ServerRequestDispatcher case this will be an ObjectImpl.
     * @param targetMostDerivedInterface.  The most derived interface.  This
     *     is passed in instead of calculated when needed because it requires
     *     extra information in the POA case that we didn't want to bother
     *     creating extra methods for to pass in.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void initializeServerPIInfo( CorbaMessageMediator request,
        ObjectAdapter oa, byte[] objectId, ObjectKeyTemplate oktemp ) ;

    /**
     * Notifies PI to start a new server request and set initial
     * information for server-side interceptors.
     * PI will use this information as a source of information for the
     * ServerRequestInfo object.  poaimpl is declared as an Object so that
     * we need not introduce a dependency on the POA package.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void invokeServerPIEndingPoint( ReplyMessage replyMessage ) ;

    /**
     * Called when the appropriate server ending interception point is
     * to be invoked for all appropriate server-side request interceptors.
     *
     * @param replyMessage The iiop.messages.ReplyMessage containing the
     *     reply status.
     * @throws ForwardException Thrown if an interceptor raises
     *     ForwardRequest.  This is an unchecked exception so that we need
     *     not modify the entire execution path to declare throwing
     *     ForwardException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void invokeServerPIIntermediatePoint() ;

    /**
     * Called when the appropriate server intermediate interception point is
     * to be invoked for all appropriate server-side request interceptors.
     *
     * @throws ForwardException Thrown if an interceptor raises
     *     ForwardRequest.  This is an unchecked exception so that we need
     *     not modify the entire execution path to declare throwing
     *     ForwardException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void invokeServerPIStartingPoint() ;

    /**
     * Called when the appropriate server starting interception point is
     * to be invoked for all appropriate server-side request interceptors.
     *
     * @throws ForwardException Thrown if an interceptor raises
     *     ForwardRequest.  This is an unchecked exception so that we need
     *     not modify the entire execution path to declare throwing
     *     ForwardException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void setClientPIInfo(CorbaMessageMediator messageMediator) ;

    /**
     * Notify PI of the MessageMediator for the request.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void setClientPIInfo( RequestImpl requestImpl ) ;

    /**
     * Notifies PI of additional information for client-side interceptors.
     * PI will use this information as a source of information for the
     * ClientRequestInfo object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void cleanupClientPIRequest() ;

    /**
     * Invoked when a request is about to be cleaned up.  Must be called
     * after ending points are called so that the info object on the stack
     * can be deinitialized and popped from the stack at the appropriate
     * time.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void initiateClientPIRequest( boolean diiRequest ) ;

    /**
     * Invoked when a request is about to be created.  Must be called before
     * any of the setClientPI* methods so that a new info object can be
     * prepared for information collection.
     *
     * @param diiRequest True if this is to be a DII request, or false if it
     *     is a "normal" request.  In the DII case, initiateClientPIRequest
     *     is called twice and we need to ignore the second one.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    Exception makeCompletedClientRequest(
        int replyStatus, Exception exception ) ;

    /**
     * Called when a retry is needed after initiateClientPIRequest but
     * before invokeClientPIRequest.  In this case, we need to properly
     * balance initiateClientPIRequest/cleanupClientPIRequest calls,
     * but WITHOUT extraneous calls to invokeClientPIEndingPoint
     * (see bug 6763340).
     *
     * @param replyStatus One of the constants in iiop.messages.ReplyMessage
     *     indicating which reply status to set.
     * @param exception The exception before ending interception points have
     *     been invoked, or null if no exception at the moment.
     * @return The exception to be thrown, after having gone through
     *     all ending points, or null if there is no exception to be
     *     thrown.  Note that this exception can be either the same or
     *     different from the exception set using setClientPIException.
     *     There are four possible return types: null (no exception),
     *     SystemException, UserException, or RemarshalException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    Exception invokeClientPIEndingPoint(
        int replyStatus, Exception exception ) ;

    /**
     * Called when the appropriate client ending interception point is
     * to be invoked for all apporpriate client-side request interceptors.
     *
     * @param replyStatus One of the constants in iiop.messages.ReplyMessage
     *     indicating which reply status to set.
     * @param exception The exception before ending interception points have
     *     been invoked, or null if no exception at the moment.
     * @return The exception to be thrown, after having gone through
     *     all ending points, or null if there is no exception to be
     *     thrown.  Note that this exception can be either the same or
     *     different from the exception set using setClientPIException.
     *     There are four possible return types: null (no exception),
     *     SystemException, UserException, or RemarshalException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void invokeClientPIStartingPoint()

    /**
     * Called when the send_request or send_poll portable interception point
     * is to be invoked for all appropriate client-side request interceptors.
     *
     * @exception RemarhsalException - Thrown when this request needs to
     *     be retried.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void enableInterceptorsThisThread() ;

    /**
     * Called for pseudo-ops to re-enable portable interceptor
     * hooks for calls on this thread.  Decrements the disabledCount.
     * If disabledCount is 0, interceptors are re-enabled.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void disableInterceptorsThisThread() ;

    /**
     * Called for pseudo-ops to temporarily disable portable interceptor
     * hooks for calls on this thread.  Keeps track of the number of
     * times this is called and increments the disabledCount.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void adapterStateChanged( ObjectReferenceTemplate[] templates,
        short newState ) ;

    /** Called whenever a state change occurs in an object adapter that
    * was not caused by an adapter manager state change.
    *
    * @param templates The templates that are changing state.
    * @param newState The new state of the adapters identified by the
    * templates.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void adapterManagerStateChanged( int managerId,
        short newState ) ;

    /**
     * Called whenever a state change occurs in an adapter manager.
     *
     * @param managerId managerId The adapter manager id
     * @param newState newState The new state of the adapter manager,
     * and by implication of all object adapters managed by this manager.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    void objectAdapterCreated( ObjectAdapter oa )  ;

    /**
     * Called when a new object adapter is created.
     *
     * @param oa The adapter associated with the interceptors to be
     *   invoked.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
    public void initialize() ;

    /** Complete the initialization of the PIHandler.  This will execute the methods
    * on the ORBInitializers, if any are defined.  This must be done here so that
    * the ORB can obtain the PIHandler BEFORE the ORBInitializers run, since they
    * will need access to the PIHandler through the ORB.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/protocol/PIHandler.java
public interface PIHandler extends Closeable {

/** This interface defines the PI interface that is used to interface the rest of the
 * ORB to the PI implementation.
 */
