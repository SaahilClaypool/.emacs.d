_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IOR.java
    IIOPProfile getProfile() ;

    /** Return the first IIOPProfile in this IOR.
     * XXX THIS IS TEMPORARY FOR BACKWARDS COMPATIBILITY AND WILL BE REMOVED
     * SOON!
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IOR.java
    IORTemplateList getIORTemplates() ;

    /** Return the IORTemplate for this IOR.  This is simply a list
     * of all TaggedProfileTemplates derived from the TaggedProfiles
     * of the IOR.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IOR.java
    boolean isEquivalent(IOR ior) ;

    /** Return true if this IOR is equivalent to ior.  Here equivalent means
     * that the typeids are the same, they have the same number of profiles,
     * and each profile is equivalent to the corresponding profile.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IOR.java
    boolean isNil() ;

    /** Return true if this IOR has no profiles.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IOR.java
    org.omg.IOP.IOR getIOPIOR() ;

    /** Return a representation of this IOR in the standard GIOP marshalled
     * form.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IOR.java
    String stringify() ;

    /** Return a representation of this IOR in the standard GIOP stringified
     * format that begins with "IOR:".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IOR.java
    Iterator iteratorById( int id ) ;

    /** Return an iterator that iterates over tagged profiles with
    * identifier id.  It is not possible to modify the list through this
    * iterator.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IOR.java
    String getTypeId() ;

    /** Return the type id string from the IOR.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IOR.java
public interface IOR extends List, Writeable, MakeImmutable

/** An IOR is represented as a list of profiles.
* Only instances of TaggedProfile are contained in the list.
*/
