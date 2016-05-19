_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IORFactory.java
    boolean isEquivalent( IORFactory other ) ;

    /** Return true iff this.makeIOR(orb,typeid,oid).isEquivalent(
     * other.makeIOR(orb,typeid,oid) for all orb, typeid, and oid.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IORFactory.java
    IOR makeIOR( ORB orb, String typeid, ObjectId oid ) ;

    /** Construct an IOR containing the given ORB, typeid, and ObjectId.
     * The same ObjectId will be used for all TaggedProfileTemplates in
     * the IORFactory.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IORFactory.java
public interface IORFactory extends Writeable, MakeImmutable {

/** An IORFactory provides the capability of creating IORs.  It contains
 * some collection of TaggedProfileTemplates, which can be iterated over
 * for portable interceptors.
 */
