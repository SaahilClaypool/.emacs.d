_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/toa/TOAImpl.java
    public String[] getInterfaces( Object servant, byte[] objectId )

    /** Return the most derived interface for the given servant and objectId.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/toa/TOAImpl.java
    public void getInvocationServant( OAInvocationInfo info )

    /** Get the servant for the request given by the parameters.
    * This will update thread Current, so that subsequent calls to
    * returnServant and removeCurrent from the same thread are for the
    * same request.
    * @param request is the request containing the rest of the request
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/toa/TOAImpl.java
public class TOAImpl extends ObjectAdapterBase implements TOA

/** The Transient Object Adapter (TOA) represents the OA for purely transient
* objects.  It is used for standard RMI-IIOP as well as backwards compatible
* server support (i.e. the ORB.connect() method)
* Its characteristics include:
* <UL>
* <LI>There is only one OA instance of the TOA.  Its OAId is { "TOA" }</LI>
* <LI>There is not adapter manager.  The TOA manager ID is fixed.<LI>
* <LI>State is the same as ORB state (TBD)</LI>
* </UL>
* Other requirements:
* <UL>
* <LI>All object adapters must invoke ORB.adapterCreated when they are created.
* </LI>
* <LI>All adapter managers must invoke ORB.adapterManagerStateChanged when
* their state changes, mapping the internal state to an ORT state.</LI>
* <LI>AdapterStateChanged must be invoked (from somewhere) whenever
* an adapter state changes that is not due to an adapter manager state change.</LI>
* </UL>
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/toa/TOAImpl.java
    public String[] getInterfaces( Object servant, byte[] objectId )

    /** Return the most derived interface for the given servant and objectId.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/toa/TOAImpl.java
    public void getInvocationServant( OAInvocationInfo info )

    /** Get the servant for the request given by the parameters.
    * This will update thread Current, so that subsequent calls to
    * returnServant and removeCurrent from the same thread are for the
    * same request.
    * @param request is the request containing the rest of the request
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/oa/toa/TOAImpl.java
public class TOAImpl extends ObjectAdapterBase implements TOA

/** The Transient Object Adapter (TOA) represents the OA for purely transient
* objects.  It is used for standard RMI-IIOP as well as backwards compatible
* server support (i.e. the ORB.connect() method)
* Its characteristics include:
* <UL>
* <LI>There is only one OA instance of the TOA.  Its OAId is { "TOA" }</LI>
* <LI>There is not adapter manager.  The TOA manager ID is fixed.<LI>
* <LI>State is the same as ORB state (TBD)</LI>
* </UL>
* Other requirements:
* <UL>
* <LI>All object adapters must invoke ORB.adapterCreated when they are created.
* </LI>
* <LI>All adapter managers must invoke ORB.adapterManagerStateChanged when
* their state changes, mapping the internal state to an ORT state.</LI>
* <LI>AdapterStateChanged must be invoked (from somewhere) whenever
* an adapter state changes that is not due to an adapter manager state change.</LI>
* </UL>
*/
