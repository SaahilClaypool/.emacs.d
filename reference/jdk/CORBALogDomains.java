_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String UTIL = "util" ;

    /** Log domain for utility classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RMIIIOP_DELEGATE = "rmiiiop.delegate" ;

    /** Log domain for the RMI-IIOP implementation in the Stub, Util, and
     * PortableRemoteObject delegates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String OA_INVOCATION = "oa.invocation" ;

    /** Log domain for object adapter request dispatch.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String OA_IOR = "oa.ior" ;

    /** Log domain for all IOR related code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String OA_LIFECYCLE = "oa.lifecycle" ;

    /** Log domain for creation, destruction, and state change of
     * Object Adapters and related classes (e.g. POAManager).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORB_RESOLVER = "orb.resolver" ;

    /** Log domain for ORB client side name resolution and supporting
     * functions such as INS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORB_LIFECYCLE = "orb.lifecycle" ;

    /** Log domain for ORB initialization, configuration, startup,
     * and shutdown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORBD_SERVERTOOL = "orbd.servertool" ;

    /** Log domain for the servertool utilitiy used to update the
     * implementation repository.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORBD_REPOSITORY = "orbd.repository" ;

    /** Log domain for the Implementation Repository.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORBD_ACTIVATOR = "orbd.activator" ;

    /** Log domain for the ORBD activator function, which starts
     * server instances on demand.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORBD_LOCATOR = "orbd.locator" ;

    /** Log domain for the ORBD locator function, which forwards
     * client requests to their current server incarnation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String NAMING_UPDATE = "naming.update" ;

    /** Log domain for name service bind, rebind, destroy, and other state
     * change operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String NAMING_READ = "naming.read" ;

    /** Log domain for name service lookup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String NAMING_LIFECYCLE = "naming.lifecycle" ;

    /** Log domain for naming context creation and destruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RPC_TRANSPORT = "rpc.transport" ;

    /** Log domain for low-level transport details, which are
     * independent of encoding and presentation details.  This
     * includes selectors, acceptors, connections, connection management,
     * and any other transport management functions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RPC_PROTOCOL = "rpc.protocol" ;

    /** Log domain for the code used to handle any kind of invocation
     * protocol.  This includes client and server delegates, client and
     * server request dispatchers, service contexts, portable interceptors,
     * and the GIOP protocol (but not CDR representation of data).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RPC_ENCODING = "rpc.encoding" ;

    /** Log domain for any sort of wire encoding used in marshalling
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RPC_PRESENTATION = "rpc.presentation" ;

    /** Log domain for code directly implementing the CORBA API and
     * the typecode/any machinery.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
public abstract class CORBALogDomains {

/** Defines constants for all of the logging domains used in the ORB.
 * Note that this is the suffix to the log domain.  The full domain is given by
 * <code>javax.enterprise.resource.corba.{ORBId}.{Log domain}</code>
 * where {ORBId} is the ORB ID of the ORB instance doing the logging.
 * <P>
 * The ORB implementation packages are mapped into these domains as follows:
 * <ul>
 * <li>activation: orbd.*
 * <li>corba: rpc.presentation (CORBA API, typecode/any), oa.invocation (DII)
 * <li>core: service context code in rpc.protocol (will eventually move to its own package)
 * <li>dynamicany: rpc.presentation
 * <li>encoding: rpc.encoding
 * <li>iiop: rmiiop.delegate (ShutdownUtilDelegate needs to move somewhere)
 * <li>interceptors: rpc.protocol
 * <li>io: rpc.encoding
 * <li>ior: oa.ior
 * <li>javax: rmiiiop.delegate
 * <li>logging: logging does not have a domain
 * <li>naming: naming
 * <li>oa: oa
 * <li>orb: orb.lifecycle
 * <li>orbutil: util
 * <li>protocol: rpc.protocol
 * <li>resolver: orb.resolver
 * <li>transport: rpc.transport
 * <li>txpoa: this will be removed in the future.
 * <li>util: util
 * </ul>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String UTIL = "util" ;

    /** Log domain for utility classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RMIIIOP_DELEGATE = "rmiiiop.delegate" ;

    /** Log domain for the RMI-IIOP implementation in the Stub, Util, and
     * PortableRemoteObject delegates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String OA_INVOCATION = "oa.invocation" ;

    /** Log domain for object adapter request dispatch.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String OA_IOR = "oa.ior" ;

    /** Log domain for all IOR related code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String OA_LIFECYCLE = "oa.lifecycle" ;

    /** Log domain for creation, destruction, and state change of
     * Object Adapters and related classes (e.g. POAManager).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORB_RESOLVER = "orb.resolver" ;

    /** Log domain for ORB client side name resolution and supporting
     * functions such as INS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORB_LIFECYCLE = "orb.lifecycle" ;

    /** Log domain for ORB initialization, configuration, startup,
     * and shutdown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORBD_SERVERTOOL = "orbd.servertool" ;

    /** Log domain for the servertool utilitiy used to update the
     * implementation repository.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORBD_REPOSITORY = "orbd.repository" ;

    /** Log domain for the Implementation Repository.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORBD_ACTIVATOR = "orbd.activator" ;

    /** Log domain for the ORBD activator function, which starts
     * server instances on demand.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String ORBD_LOCATOR = "orbd.locator" ;

    /** Log domain for the ORBD locator function, which forwards
     * client requests to their current server incarnation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String NAMING_UPDATE = "naming.update" ;

    /** Log domain for name service bind, rebind, destroy, and other state
     * change operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String NAMING_READ = "naming.read" ;

    /** Log domain for name service lookup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String NAMING_LIFECYCLE = "naming.lifecycle" ;

    /** Log domain for naming context creation and destruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RPC_TRANSPORT = "rpc.transport" ;

    /** Log domain for low-level transport details, which are
     * independent of encoding and presentation details.  This
     * includes selectors, acceptors, connections, connection management,
     * and any other transport management functions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RPC_PROTOCOL = "rpc.protocol" ;

    /** Log domain for the code used to handle any kind of invocation
     * protocol.  This includes client and server delegates, client and
     * server request dispatchers, service contexts, portable interceptors,
     * and the GIOP protocol (but not CDR representation of data).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RPC_ENCODING = "rpc.encoding" ;

    /** Log domain for any sort of wire encoding used in marshalling
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
    public static final String RPC_PRESENTATION = "rpc.presentation" ;

    /** Log domain for code directly implementing the CORBA API and
     * the typecode/any machinery.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/logging/CORBALogDomains.java
public abstract class CORBALogDomains {

/** Defines constants for all of the logging domains used in the ORB.
 * Note that this is the suffix to the log domain.  The full domain is given by
 * <code>javax.enterprise.resource.corba.{ORBId}.{Log domain}</code>
 * where {ORBId} is the ORB ID of the ORB instance doing the logging.
 * <P>
 * The ORB implementation packages are mapped into these domains as follows:
 * <ul>
 * <li>activation: orbd.*
 * <li>corba: rpc.presentation (CORBA API, typecode/any), oa.invocation (DII)
 * <li>core: service context code in rpc.protocol (will eventually move to its own package)
 * <li>dynamicany: rpc.presentation
 * <li>encoding: rpc.encoding
 * <li>iiop: rmiiop.delegate (ShutdownUtilDelegate needs to move somewhere)
 * <li>interceptors: rpc.protocol
 * <li>io: rpc.encoding
 * <li>ior: oa.ior
 * <li>javax: rmiiiop.delegate
 * <li>logging: logging does not have a domain
 * <li>naming: naming
 * <li>oa: oa
 * <li>orb: orb.lifecycle
 * <li>orbutil: util
 * <li>protocol: rpc.protocol
 * <li>resolver: orb.resolver
 * <li>transport: rpc.transport
 * <li>txpoa: this will be removed in the future.
 * <li>util: util
 * </ul>
 */
