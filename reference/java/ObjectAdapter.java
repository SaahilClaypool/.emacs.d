_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    String[] getInterfaces( Object servant, byte[] objectId ) ;

    /** Return the most derived interface for the given servant and objectId.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    OAInvocationInfo makeInvocationInfo( byte[] objectId ) ;

    /** Create an instance of InvocationInfo that is appropriate for this
    * Object adapter.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    public void returnServant() ;

    /** Must be called every time getInvocationServant is called after
     * the request has completed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    void exit( ) ;

    /** exit must be called after each request has been completed.  If enter
    * is called, there must always be a corresponding exit.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    void enter( ) throws OADestroyed ;

    /** enter must be called before each request is invoked on a servant.
      * @exception OADestroyed is thrown when an OA has been destroyed, which
      * requires a retry in the case where an AdapterActivator is present.
      */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    void getInvocationServant( OAInvocationInfo info ) ;

    /** Get the servant for the request given by the parameters.
    * info must contain a valid objectId in this call.
    * The servant is set in the InvocationInfo argument that is passed into
    * this call.
    * @param info is the InvocationInfo object for the object reference
    * @exception ForwardException (a runtime exception) is thrown if the request
    * is to be handled by a different object reference.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    /** Get the servant corresponding to the given objectId, if this is supported.

    ////////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    // Methods required for dispatching to servants

    ////////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    void setCurrentFactory( ObjectReferenceFactory factory ) ;

    /** Change the current factory.  This may only be called during the
    * AdapterCreated call.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    short getState() ;

    /** Return the current state of this object adapter (see
    * org.omg.PortableInterceptors for states.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    /** Return the ID of the AdapterManager for this object adapter.

    ////////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    // Methods needed to support ORT.

    ////////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    IORTemplate getIORTemplate() ;

    /** Returns the IOR template of this adapter.  The profiles
    * in this template may be updated only during the AdapterCreated call.
    * After that call completes, the IOR template must be made immutable.
    * Note that the server ID, ORB ID, and adapter name are all available
    * from the IOR template.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    /** Returns the ORB associated with this adapter.

    ////////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
    // Basic methods for supporting interceptors

    ////////////////////////////////////////////////////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/ObjectAdapter.java
public interface ObjectAdapter

/** ObjectAdapter represents the abstract model of an object
* adapter that was introduced by ORT.  This means that all
* object adapters must:
* <UL>
* <LI>Have an ORB</LI>
* <LI>Have a name</LI>
* <LI>Have an adapter manager (represented by an ID)</LI>
* <LI>Have an adapter template</LI>
* <LI>Support getting and setting their ObjectReferenceFactory</LI>
* <LI>Provide access to their current state</LI>
* <LI>Support adding components to their profiles expressed in the adapter template</LI>
* </UL>
* Other requirements:
* <UL>
* <LI>All object adapters must invoke ORB.AdapterCreated when they are created.
* </LI>
* <LI>All adapter managers must invoke ORB.AdapterManagerStateChanged when
* their state changes, mapping the internal state to an ORT state.</LI>
* <LI>AdapterStateChanged must be invoked (from somewhere) whenever
* an adapter state changes that is not due to an adapter manager state change.</LI>
* </UL>
* <P>
* Object adapters must also provide mechanisms for:
* <UL>
* <LI>Managing object reference lifecycle</LI>
* <LI>Controlling how servants are associated with object references</LI>
* <LI>Manage the state of the adapter, if the adapter desires to implement such mechanisms</LI>
* </UL>
* Such mechanisms are all object adapter specific, and so we do not attempt to
* create general APIs for these functions here.  The object adapter itself
* must provide these APIs directly to the user, and they do not affect the rest of the
* ORB.  This interface basically makes it possible to plug any object adapter into the
* ORB and have the OA work propertly with portable interceptors, and also have requests
* dispatched properly to the object adapter.
* <P>
* The basic function of an ObjectAdapter is to map object IDs to servants and to support
* the dispatch operation of the subcontract, which dispatches requests to servants.
* This is the purpose of the getInvocationServant method.  In addition, ObjectAdapters must be
* able to change state gracefully in the presence of executing methods.  This
* requires the use of the enter/exit methods.  Finally, ObjectAdapters often
* require access to information about requests.  This is accomodated through the
* OAInvocationInfo class and the thread local stack maintained by push/pop/peekInvocationInfo
* on the ORB.
* <P>
* To be useful, this dispatch cycle must be extremely efficient.  There are several
* scenarios that matter:
* <ol>
* <li>A remote invocation, where the dispatch is handled in the server subcontract.</li>
* <li>A local invocation, where the dispatch is handled in the client subcontract.</li>
* <li>A cached local invocation, where the servant is cached when the IOR is established
* for the client subcontract, and the dispatch is handled in the client subcontract
* to the cached subcontract.<li>
* </ol>
* <p>
* Each of these 3 cases is handled a bit differently.  On each request, assume as known
* ObjectId and ObjectAdapterId, which can be obtained from the object key.
* The ObjectAdaptorFactory is available in the subcontract registry, where it is
* registered under the subcontract ID.  The Subcontract ID is also available in the
* object key.
* <ol>
* <li>The remote pattern:
*   <ol>
*   <li>oa = oaf.find( oaid )</li>
*   <li>oa.enter()</li>
*   <li>info = oa.makeInvocationInfo( oid )</li>
*   <li>info.setOperation( operation )</li>
*   <li>push info</li>
*   <li>oa.getInvocationServant( info )</li>
*   <li>sreq.setExecuteReturnServantInResponseConstructor( true )</li>
*   <li>dispatch to servant</li>
*   <li>oa.returnServant()</li>
*   <li>oa.exit()</li>
*   <li>pop info</li>
*   <ol>
* </li>
* REVISIT: Is this the required order for exit/pop?  Cna they be nested instead?
* Note that getInvocationServant and returnServant may throw exceptions.  In such cases,
* returnServant, exit, and pop must be called in the correct order.
* <li>The local pattern:
*   <ol>
*   <li>oa = oaf.find( oaid )</li>
*   <li>oa.enter()</li>
*   <li>info = oa.makeInvocationInfo( oid )</li>
*   <li>info.setOperation( operation )</li>
*   <li>push info</li>
*   <li>oa.getInvocationServant( info )</li>
*   <li>dispatch to servant</li>
*   <li>oa.returnServant()</li>
*   <li>oa.exit()</li>
*   <li>pop info</li>
*   <ol>
* </li>
* This is the same as the remote case, except that setExecuteReturnServantInResponseConstructor
* is not needed (or possible, since there is no server request).
* <li>The fast local pattern: When delegate is constructed,
*    first extract ObjectKey from IOR in delegate,
*    then get ObjectId, ObjectAdapterId, and ObjectAdapterFactory (oaf). Then:
*    <ol>
*    <li>oa = oaf.find( oaid )</li>
*    <li>info = oa.makeInvocationInfo( oid ) (note: no operation!)</li>
*    <li>push info (needed for the correct functioning of getInvocationServant)</li>
*    <li>oa.getInvocationServant( info )</li>
*    <li>pop info
*    </ol>
*    The info instance (which includes the Servant) is cached in the client subcontract.
*    <p>Then, on each invocation:</p>
*    <ol>
*    <li>newinfo = copy of info (clone)</li>
*    <li>info.setOperation( operation )</li>
*    <li>push newinfo</li>
*    <li>oa.enter()</li>
*    <li>dispatch to servant</li>
*    <li>oa.returnServant()</li>  // XXX This is probably wrong: remove it.
*    <li>oa.exit()</li>
*    <li>pop info</li>
*    </ol>
* </li>
* </ol>
* XXX fast local should not call returnServant: what is correct here?
*/