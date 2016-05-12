_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    public boolean isCorbanameURL( ) {

    /**
     * Will be true only in CorbanameURL class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
     private String getIPV6Host( String endpointInfo ) {

     /**
      * Returns an IPV6 Host that is inside [ ] tokens. There is no validation
      * done here, if it is an incorrect IPV6 address then the request through
      * this URL results in a COMM_FAILURE, otherwise malformed list will
      * result in BAD_PARAM exception thrown in checkcorbalocGrammer.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
     private String getIPV6Port( String endpointInfo )

    /**
      * Returns an IPV6 Port that is after [<ipv6>]:. There is no validation
      * done here, if it is an incorrect port then the request through
      * this URL results in a COMM_FAILURE, otherwise malformed list will
      * result in BAD_PARAM exception thrown in checkcorbalocGrammer.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    private void handleRIRColon( String rirInfo )

    /**
     *  Validate 'rir:' case.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    private IIOPEndpointInfo handleColon( String iiopInfo ) {

    /**
     * This is to handle the case of host information with no 'iiop:' prefix.
     * instead if ':' is specified then iiop is assumed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    private IIOPEndpointInfo handleIIOPColon( String iiopInfo )

    /**
     *  If there is 'iiop:' token in the URL, this method will parses
     *  and  validates that host and port information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    private void badAddress( java.lang.Throwable e )

    /**
     *  A Utility method to throw BAD_PARAM exception to signal malformed
     *  INS URL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    public CorbalocURL( String aURL ) {

    /**
     * This constructor parses the URL and initializes all the variables. Once
     * the URL Object is constructed it is immutable. URL parameter is a
     * corbaloc: URL string with 'corbaloc:' prefix stripped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
public class CorbalocURL extends INSURLBase

/**
 *  The corbaloc: URL definitions from the -ORBInitDef and -ORBDefaultInitDef's
 *  will be parsed and converted to  this object. This object is capable of
 *  storing multiple  Host profiles as defined in the CorbaLoc grammer.
 *
 *  @author  Hemanth
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    public boolean isCorbanameURL( ) {

    /**
     * Will be true only in CorbanameURL class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
     private String getIPV6Host( String endpointInfo ) {

     /**
      * Returns an IPV6 Host that is inside [ ] tokens. There is no validation
      * done here, if it is an incorrect IPV6 address then the request through
      * this URL results in a COMM_FAILURE, otherwise malformed list will
      * result in BAD_PARAM exception thrown in checkcorbalocGrammer.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
     private String getIPV6Port( String endpointInfo )

    /**
      * Returns an IPV6 Port that is after [<ipv6>]:. There is no validation
      * done here, if it is an incorrect port then the request through
      * this URL results in a COMM_FAILURE, otherwise malformed list will
      * result in BAD_PARAM exception thrown in checkcorbalocGrammer.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    private void handleRIRColon( String rirInfo )

    /**
     *  Validate 'rir:' case.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    private IIOPEndpointInfo handleColon( String iiopInfo ) {

    /**
     * This is to handle the case of host information with no 'iiop:' prefix.
     * instead if ':' is specified then iiop is assumed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    private IIOPEndpointInfo handleIIOPColon( String iiopInfo )

    /**
     *  If there is 'iiop:' token in the URL, this method will parses
     *  and  validates that host and port information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    private void badAddress( java.lang.Throwable e )

    /**
     *  A Utility method to throw BAD_PARAM exception to signal malformed
     *  INS URL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
    public CorbalocURL( String aURL ) {

    /**
     * This constructor parses the URL and initializes all the variables. Once
     * the URL Object is constructed it is immutable. URL parameter is a
     * corbaloc: URL string with 'corbaloc:' prefix stripped.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/namingutil/CorbalocURL.java
public class CorbalocURL extends INSURLBase

/**
 *  The corbaloc: URL definitions from the -ORBInitDef and -ORBDefaultInitDef's
 *  will be parsed and converted to  this object. This object is capable of
 *  storing multiple  Host profiles as defined in the CorbaLoc grammer.
 *
 *  @author  Hemanth
 */
