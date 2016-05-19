_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/NullServant.java
    SystemException getException() ;

    /** Obtain the exception that is associated with this
     * NullServant instance.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/oa/NullServant.java
public interface NullServant

/** NullServant is used to represent a null servant returned
 * OAInvocationInfo after a
 * ObjectAdapter.getInvocationServant( OAInvocationInfo ) call.
 * If the getInvocationServant call could not locate a servant
 * for the ObjectId in the OAInvocationInfo, getServantContainer
 * will contain a NullServant.  Later stages of the request
 * dispatch may choose either to throw the exception or perform
 * some other action in response to the NullServant result.
 */
