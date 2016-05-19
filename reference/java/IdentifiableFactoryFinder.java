_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IdentifiableFactoryFinder.java
    void registerFactory( IdentifiableFactory factory ) ;

    /** Register a factory for the given id.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IdentifiableFactoryFinder.java
    Identifiable create(int id, InputStream is);

    /** If there is a registered factory for id, use it to
     * read an Identifiable from is.  Otherwise create an
     * appropriate generic container, or throw an error.
     * The type of generic container, or error behavior is
     * a property of the implementation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/ior/IdentifiableFactoryFinder.java
public interface IdentifiableFactoryFinder

/** Interface used to manage a group of related IdentifiableFactory instances.
 * Factories can be registered, and invoked through a create method, which
 * must be implemented to handle the case of no registered factory
 * appropriately.
 * @author Ken Cavanaugh
 */
