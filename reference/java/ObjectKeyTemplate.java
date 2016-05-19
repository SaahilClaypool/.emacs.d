_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/ObjectKeyTemplate.java
    public byte[] getAdapterId() ;

    /** Compute an adapter ID for this template than includes
    * all of the template information.
    * This value is cached to avoid the expense of recomputing
    * it.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/ObjectKeyTemplate.java
    public ObjectAdapterId getObjectAdapterId() ;

    /** Return the object adapter ID for this template.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/ObjectKeyTemplate.java
    public String getORBId() ;

    /** Return the ORB ID for this template.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/ObjectKeyTemplate.java
    public int getServerId() ;

    /** Return the server ID for this template.
    * For CORBA 3.0, this should be a String, but it is currently
    * an int in the object key template.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/ObjectKeyTemplate.java
    public int getSubcontractId();

    /** An ID used to determine how to perform operations on this
     * ObjectKeyTemplate.  This id determines how to process requests
     * on this object reference, and what object adapter type to use.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/ObjectKeyTemplate.java
public interface ObjectKeyTemplate extends Writeable

/** An ObjectKeyTemplate represents the part of an Object Key
 * that corresponds to the object adapter used to create an
 * object reference.  The template is shared between many
 * object references.
 */
