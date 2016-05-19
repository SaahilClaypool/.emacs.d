_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/resolver/ResolverDefault.java
    public static Resolver makeCompositeResolver( Resolver first, Resolver second )

    /** Return a resolver composed of the two given resolvers.  result.list() is the
    * union of first.list() and second.list().  result.resolve( name ) returns
    * first.resolve( name ) if that is not null, otherwise returns the result of
    * second.resolve( name ).
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/resolver/ResolverDefault.java
    public static Resolver makeBootstrapResolver( ORB orb, String host, int port )

    /** Return a resolver that uses the proprietary bootstrap protocol
    * to implement a resolver.  Obtains the necessary host and port
    * information from the ORB.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/resolver/ResolverDefault.java
    public static Resolver makeORBInitRefResolver( Operation urlOperation,
        StringPair[] initRefs )

    /** Return a resolver that relies on configured values of ORBInitRef for data.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/resolver/ResolverDefault.java
    public static LocalResolver makeLocalResolver( )

    /** Return a local resolver that simply stores bindings in a map.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/resolver/ResolverDefault.java
public class ResolverDefault {

/** Utility class that provides factory methods for all of the
 * standard resolvers that we provide.
 */
