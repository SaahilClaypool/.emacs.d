_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private void clearRootNamingContextCache( ) {

    /**
     *  A utility method to clear the RootNamingContext, if there is an
     *  exception in resolving CosNaming:Name from the RootNamingContext,
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private NamingContextExt getDefaultRootNamingContext( ) {

    /**
     *  This is required for corbaname: resolution. Currently we
     *  are not caching RootNamingContext as the reference to rootNamingContext
     *  may not be Persistent in all the implementations.
     *  _REVISIT_ to clear the rootNamingContext in case of COMM_FAILURE.
     *
     *  @return the org.omg.COSNaming.NamingContextExt if resolution is
     *   successful
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
     private org.omg.CORBA.Object getIORUsingCorbaloc( INSURL corbalocObject )

    /**
     *  This is an internal method to get the IOR from the CorbalocURL object.
     *
     *  @return the CORBA.Object if resolution is successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private org.omg.CORBA.Object resolveCorbaname( CorbanameURL theCorbaName ) {

    /**
     *  resolves a corbaname: url that is encapsulated in a CorbanameURL object.
     *
     *  @return the CORBA.Object if resolution is successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private org.omg.CORBA.Object resolveCorbaloc(
        CorbalocURL theCorbaLocObject )

    /**
     *  resolves a corbaloc: url that is encapsulated in a CorbalocURL object.
     *
     *  @return the CORBA.Object if resolution is successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private org.omg.CORBA.Object getIORFromString( String str )

    /** This static method takes a Stringified IOR and converts it into IOR object.
      * It is the caller's responsibility to only pass strings that start with "IOR:".
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
public class INSURLOperationImpl implements Operation

/**
 * This class provides an Operation that converts from CORBA INS URL strings into
 * CORBA object references.  It will eventually become extensible, but for now it
 * simply encapsulates the existing implementation.  Once the full extensibility
 * is in place, we want this operation to convert string to INSURL, which has mainly
 * a public resolver method that returns an object reference.
 *
 * @author  Hemanth
 * @author  Ken
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private void clearRootNamingContextCache( ) {

    /**
     *  A utility method to clear the RootNamingContext, if there is an
     *  exception in resolving CosNaming:Name from the RootNamingContext,
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private NamingContextExt getDefaultRootNamingContext( ) {

    /**
     *  This is required for corbaname: resolution. Currently we
     *  are not caching RootNamingContext as the reference to rootNamingContext
     *  may not be Persistent in all the implementations.
     *  _REVISIT_ to clear the rootNamingContext in case of COMM_FAILURE.
     *
     *  @return the org.omg.COSNaming.NamingContextExt if resolution is
     *   successful
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
     private org.omg.CORBA.Object getIORUsingCorbaloc( INSURL corbalocObject )

    /**
     *  This is an internal method to get the IOR from the CorbalocURL object.
     *
     *  @return the CORBA.Object if resolution is successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private org.omg.CORBA.Object resolveCorbaname( CorbanameURL theCorbaName ) {

    /**
     *  resolves a corbaname: url that is encapsulated in a CorbanameURL object.
     *
     *  @return the CORBA.Object if resolution is successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private org.omg.CORBA.Object resolveCorbaloc(
        CorbalocURL theCorbaLocObject )

    /**
     *  resolves a corbaloc: url that is encapsulated in a CorbalocURL object.
     *
     *  @return the CORBA.Object if resolution is successful
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
    private org.omg.CORBA.Object getIORFromString( String str )

    /** This static method takes a Stringified IOR and converts it into IOR object.
      * It is the caller's responsibility to only pass strings that start with "IOR:".
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/resolver/INSURLOperationImpl.java
public class INSURLOperationImpl implements Operation

/**
 * This class provides an Operation that converts from CORBA INS URL strings into
 * CORBA object references.  It will eventually become extensible, but for now it
 * simply encapsulates the existing implementation.  Once the full extensibility
 * is in place, we want this operation to convert string to INSURL, which has mainly
 * a public resolver method that returns an object reference.
 *
 * @author  Hemanth
 * @author  Ken
 */
