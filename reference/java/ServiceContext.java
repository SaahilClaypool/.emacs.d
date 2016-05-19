_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContext.java
    protected InputStream in = null ;

    /** in is the stream containing the service context representation.
     * It is constructed by the stream constructor, and available for use
     * in the subclass stream constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContext.java
    protected abstract void writeData( OutputStream os ) ;

    /** Writes the data used to represent the subclasses service context
     * into an encapsulation stream.  Must be overloaded in subclass.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContext.java
    public void write(OutputStream s, GIOPVersion gv) throws SystemException

    /** Write the service context to an output stream.  This method
     * must be used for writing the service context to a request or reply
     * header.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContext.java
    public abstract int getId() ;

    /** Returns Service context id.  Must be overloaded in subclass.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContext.java
    protected ServiceContext(InputStream s, GIOPVersion gv) throws SystemException

    /** Stream constructor used when subclass is constructed from an
     * InputStream.  This constructor must be called by super( stream )
     * in the subclass.  After this constructor completes, the service
     * context representation can be read from in.
     * Note that the service context id has been consumed from the input
     * stream before this object is constructed.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContext.java
    protected ServiceContext() { }

    /** Simple default constructor used when subclass is constructed
     * from its representation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/servicecontext/ServiceContext.java
public abstract class ServiceContext {

/** Base class for all ServiceContext classes.
* There is a derived ServiceContext class for each service context that
* the ORB supports.  Each subclass encapsulates the representation of
* the service context and provides any needed methods for manipulating
* the service context.  Each subclass must provide the following
* members:
* <p>
* <ul>
* </li>a public static final int SERVICE_CONTEXT_ID that gives the OMG
* (or other) defined id for the service context.  This is needed for the
* registration mechanism defined in ServiceContexts. OMG defined
* service context ids are taken from section 13.6.7 of ptc/98-12-04.</li>
* <li>a public constructor that takes an InputStream as its argument.</li>
* <li>Appropriate definitions of getId() and writeData().  getId() must
* return SERVICE_CONTEXT_ID.</li>
* </ul>
* <p>
* The subclass can be constructed either directly from the service context
* representation, or by reading the representation from an input stream.
* These cases are needed when the service context is created and written to
* the request or reply, and when the service context is read from the
* received request or reply.
*/
