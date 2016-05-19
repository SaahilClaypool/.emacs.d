_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/DataCollector.java
    Properties getProperties() ;

    /** Return the consolidated property information to be used
     * for ORB configuration.  Note that -ORBInitRef arguments are
     * handled specially: all -ORBInitRef name=value arguments are
     * converted into ( org.omg.CORBA.ORBInitRef.name, value )
     * mappings in the resulting properties.  Also, -ORBInitialServices
     * is handled specially in applet mode: they are converted from
     * relative to absolute URLs.
     * @raises IllegalStateException if setPropertyNames has not
     * been called.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/DataCollector.java
    void setParser( PropertyParser parser ) ;

    /** Set the parser which is used to obtain property names.
     * This must be called before getProperties
     * may be called.  It may be called multiple times if different
     * sets of properties are needed for the same data sources.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/DataCollector.java
    boolean initialHostIsLocal() ;

    /** Return true iff the local host and ORB initial host are the same.
    * This is provided to avoid exposing the local host in insecure
    * contexts.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/DataCollector.java
    boolean isApplet() ;

    /** Return true iff this DataCollector was created from
     * applet data.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/DataCollector.java
public interface DataCollector {

/** Interface for collecting all sources of ORB configuration properties
 * into a single properties object.   A PropertyParser is needed so that
 * the set of property names of interest is known.
 */
