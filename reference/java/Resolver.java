_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/resolver/Resolver.java
    java.util.Set list() ;

    /** Return the entire collection of names that are currently bound
     * by this resolver.  Resulting collection contains only strings for
     * which resolve does not return null.  Some resolvers may not support
     * this method, in which case they return an empty set.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/resolver/Resolver.java
    org.omg.CORBA.Object resolve( String name ) ;

    /** Look up the name using this resolver and return the CORBA object
     * reference bound to this name, if any.  Returns null if no object
     * is bound to the name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/resolver/Resolver.java
public interface Resolver {

/** Resolver defines the operations needed to support ORB operations for
 * resolve_initial_references and list_initial_services.
 */
