_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    byte[] newSystemId() throws WrongPolicy ;

    /** Allocate a new, unique system ID.  Requires the ID assignment policy
    * to be SYSTEM.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    Servant deactivateObject( byte[] id ) throws ObjectNotActive, WrongPolicy ;

    /** Deactivate the object that is associated with the given id.
    * Returns the servant for id.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    void setDefaultServant( Servant servant ) throws WrongPolicy ;

    /** Set the default servant.   Will throw WrongPolicy
    * if the request processing policy is not USE_DEFAULT_SERVANT.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    Servant getDefaultServant() throws NoServant, WrongPolicy ;

    /** Return the default servant.   Will throw WrongPolicy
    * if the request processing policy is not USE_DEFAULT_SERVANT.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    void setServantManager( ServantManager servantManager ) throws WrongPolicy ;

    /** Set the servant manager.  Will throw WrongPolicy
    * if the request processing policy is not USE_SERVANT_MANAGER.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    ServantManager getServantManager() throws WrongPolicy ;

    /** Return the servant manager.  Will throw WrongPolicy
    * if the request processing policy is not USE_SERVANT_MANAGER.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    void clearAOM() ;

    /** Delete everything in the active object map.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    void etherealizeAll() ;

    /** Etherealize all servants associated with this POAPolicyMediator.
    * Does nothing if the retention policy is non-retain.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    void returnServant() ;

    /** Release a servant that was obtained from getInvocationServant.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    java.lang.Object getInvocationServant( byte[] id,
        String operation ) throws ForwardRequest ;

    /** Get the servant to use for an invocation with the
    * given id and operation.
    * @param id the object ID for which we are requesting a servant
    * @param operation the name of the operation to be performed on
    * the servant
    * @return the resulting Servant.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    int getServerId() ;

    /** Return the server ID to use in the IIOP profile in IORs
    * created by this POAPolicyMediator's POA.  This is initialized
    * according to the policies and the POA used to construct this
    * POAPolicyMediator in the POAPolicyMediatorFactory.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    int getScid() ;

    /** Return the subcontract ID to use in the IIOP profile in IORs
    * created by this POAPolicyMediator's POA.  This is initialized
    * according to the policies and the POA used to construct this
    * POAPolicyMediator in the POAPolicyMediatorFactory.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
    Policies getPolicies() ;

    /** Return the policies object that was used to create this
    * POAPolicyMediator.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/oa/poa/POAPolicyMediator.java
public interface POAPolicyMediator {

/** POAPolicyMediator defines an interface to which the POA delegates all
 * policy specific operations.  This permits code paths for different
 * policies to be optimized by creating the correct code at POA creation
 * time.  Also note that as much as possible, this interface does not
 * do any concurrency control, except as noted.  The POA is responsible
 * for concurrency control.
 */
