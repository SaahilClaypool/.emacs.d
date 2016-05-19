_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/pcosnaming/NameService.java
    String getObjectKey( org.omg.CORBA.Object reference )

    /**
     * getObjectKey gets the Object Key from the reference using POA.reference_to_id method
     * @param reference an CORBA.Object.
     * @returns Object Key as String
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/pcosnaming/NameService.java
    org.omg.CORBA.Object getObjectReferenceFromKey( String key )

    /**
     * getObjectReferenceFromKey returns the Object reference from the objectkey using POA.create_reference_with_id method
     * @param Object Key as String
     * @returns reference an CORBA.Object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/pcosnaming/NameService.java
    public NamingContext NewContext( ) throws org.omg.CORBA.SystemException

    /**
     * This method  creates a NewContext, This will internally invoked from
     * NamingContextImpl. It is not a public API. NewContext is in this class
     * because a Persiten reference has to be created with Persistent NameService
     * POA.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/pcosnaming/NameService.java
    POA getNSPOA( ) {

    /**
     * This method returns nsPOA which is the only POA that we use for
     * Persistent Naming Contexts.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/pcosnaming/NameService.java
    public NamingContext initialNamingContext()

    /**
     * This method returns the Root Naming Context
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/pcosnaming/NameService.java
    public NameService(ORB orb, File logDir)

    /**
     * Create NameService which starts the Root Naming Context in Persistent CosNaming
     * @param orb an ORB object.
     * @param logDir a File
     * @exception java.lang.Exception a Java exception.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/pcosnaming/NameService.java
public class NameService

/**
 * @author      Hemanth Puttaswamy
 * @since       JDK1.2
 */
