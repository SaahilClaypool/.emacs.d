_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IdentifiableContainerBase.java
    public Iterator iteratorById( final int id)

    /** Return an iterator which iterates over all contained Identifiables
     * with type given by id.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IdentifiableContainerBase.java
    public IdentifiableContainerBase()

    /** Create this class with an empty list of identifiables.
     * The current implementation uses an ArrayList.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IdentifiableContainerBase.java
public class IdentifiableContainerBase extends FreezableList

/** Convenience class for defining objects that contain lists of Identifiables.
 * Mainly implements iteratorById.  Also note that the constructor creates the
 * list, which here is always an ArrayList, as this is much more efficient overall
 * for short lists.
 * @author  Ken Cavanaugh
 */
