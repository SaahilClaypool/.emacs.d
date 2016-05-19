_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IdentifiableBase.java
    final public void write( OutputStream os )

    /** Write the data for this object as a CDR encapsulation.
    * This is used for writing tagged components and profiles.
    * These data types must be written out as encapsulations,
    * which means that we need to first write the data out to
    * an encapsulation stream, then extract the data and write
    * it to os as an array of octets.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IdentifiableBase.java
public abstract class IdentifiableBase implements Identifiable,

/** Provide support for properly reading and writing Identifiable objects
* that are also encapsulations (tagged profiles and components).
*/
