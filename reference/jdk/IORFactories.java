_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static void registerValueFactories( ORB orb )

    /** This method must be called in order to register the value
     * factories for the ObjectReferenceTemplate and ObjectReferenceFactory
     * value types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IORTemplate makeIORTemplate( InputStream is )

    /** Read an IORTemplate from an InputStream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IORTemplate makeIORTemplate( ObjectKeyTemplate oktemp )

    /** Create an IORTemplate with the given ObjectKeyTemplate.  The result
     * is mutable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IOR makeIOR( InputStream is )

    /** Read an IOR from an InputStream.  ObjectKeys are not shared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IOR makeIOR( ORB orb )

    /** Create an empty IOR for the given orb with a null typeid.  The result is mutable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IOR makeIOR( ORB orb, String typeid )

    /** Create an empty IOR for the given orb and typeid.  The result is mutable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static ObjectKey makeObjectKey( ObjectKeyTemplate oktemp, ObjectId oid )

    /** Create an ObjectKey for the given ObjectKeyTemplate and
     * ObjectId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static ObjectId makeObjectId( byte[] id )

    /** Create an ObjectId for the given byte sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
public class IORFactories {

/** This class provides a number of factory methods for creating
 * various IOR SPI classes which are not subclassed for specific protocols.
 * The following types must be created using this class:
 * <ul>
 * <li>ObjectId</li>
 * <li>ObjectKey</li>
 * <li>IOR</li>
 * <li>IORTemplate</li>
 * </ul>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static void registerValueFactories( ORB orb )

    /** This method must be called in order to register the value
     * factories for the ObjectReferenceTemplate and ObjectReferenceFactory
     * value types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IORTemplate makeIORTemplate( InputStream is )

    /** Read an IORTemplate from an InputStream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IORTemplate makeIORTemplate( ObjectKeyTemplate oktemp )

    /** Create an IORTemplate with the given ObjectKeyTemplate.  The result
     * is mutable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IOR makeIOR( InputStream is )

    /** Read an IOR from an InputStream.  ObjectKeys are not shared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IOR makeIOR( ORB orb )

    /** Create an empty IOR for the given orb with a null typeid.  The result is mutable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static IOR makeIOR( ORB orb, String typeid )

    /** Create an empty IOR for the given orb and typeid.  The result is mutable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static ObjectKey makeObjectKey( ObjectKeyTemplate oktemp, ObjectId oid )

    /** Create an ObjectKey for the given ObjectKeyTemplate and
     * ObjectId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
    public static ObjectId makeObjectId( byte[] id )

    /** Create an ObjectId for the given byte sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/ior/IORFactories.java
public class IORFactories {

/** This class provides a number of factory methods for creating
 * various IOR SPI classes which are not subclassed for specific protocols.
 * The following types must be created using this class:
 * <ul>
 * <li>ObjectId</li>
 * <li>ObjectKey</li>
 * <li>IOR</li>
 * <li>IORTemplate</li>
 * </ul>
 */
