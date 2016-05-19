_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static IOR connectAndGetIOR( ORB orb, org.omg.CORBA.Object obj )

    /** Obtains an IOR for the object reference obj, first connecting it to
    * the ORB if necessary.
    * @return IOR the IOR that represents this objref.  This will
    * never be null.
    * @exception BAD_OPERATION if the object could not be connected,
    * if a connection attempt was needed.
    * @exception BAD_PARAM if obj is a local object, or else was
    * created by a foreign ORB.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static IOR getIOR( org.omg.CORBA.Object obj )

    /** This method obtains an IOR from a CORBA object reference.
    * It will return null if obj is a local object, a null object,
    * or an object implemented by a different ORB.  It will
    * throw BAD_OPERATION if obj is an unconnected RMI-IIOP object.
    * @return IOR the IOR that represents this objref.  This will
    * never be null.
    * @exception BAD_OPERATION (from oi._get_delegate) if obj is a
    * normal objref, but does not have a delegate set.
    * @exception BAD_PARAM if obj is a local object, or else was
    * created by a foreign ORB.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static org.omg.CORBA.Object makeObjectReference( IOR ior )

    /** This method is used to create untyped object references.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static byte getMaxStreamFormatVersion() {

    /**
     * Returns the maximum stream format version supported by our
     * ValueHandler.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static void throwNotSerializableForCorba(String className) {

    /**
     * Throws the CORBA equivalent of a java.io.NotSerializableException
     *
     * Duplicated from util/Utility for Pure ORB reasons.  There are two
     * reasons for this:
     *
     * 1) We can't introduce dependencies on the util version from outside
     * of the io/util packages since it will not exist in the pure ORB
     * build running on JDK 1.3.x.
     *
     * 2) We need to pick up the correct minor code from OMGSystemException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static synchronized int compareVersion(String v1, String v2) {

    /** Compare two version strings.
        Return 1, 0 or -1 if v1 is greater than, equal to, or less than v2.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static int compareVersion(int[] v1, int[] v2) {

    /** Compare two version arrays.
        Return 1, 0 or -1 if v1 is greater than, equal to, or less than v2.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static int[] parseVersion(String version) {

    /** Parse a version string such as "1.1.6" or "jdk1.2fcs" into
        a version array of integers {1, 1, 6} or {1, 2}.
        A string of "n." or "n..m" is equivalent to "n.0" or "n.0.m" respectively.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static String repositoryIdOf(String name)

    /**
     * Get the repository id corresponding to a particular class.
     * This is used by the system to write the
     * appropriate repository id for a system exception.
     * @param name The class name of the system exception.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static byte getEncodingVersion(ORB orb, IOR ior) {

    /**
     * @return the Java serialization encoding version.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static boolean isSystemException(String repositoryId)

    /**
     * Return true if this repositoryId is a SystemException.
     * @param repositoryId The repository Id to check.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static String classNameOf(String repositoryId)

    /**
     * Get the class name corresponding to a particular repository Id.
     * This is used by the system to unmarshal (instantiate) the
     * appropriate exception class for an marshaled as the value of
     * its repository Id.
     * @param repositoryId The repository Id for which we want a class name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static SystemException readSystemException(InputStream strm)

    /**
     * Static method for reading a CORBA standard exception from a stream.
     * @param strm The InputStream to use for unmarshaling.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static void writeSystemException(SystemException ex, OutputStream strm)

    /**
     * Static method for writing a CORBA standard exception to a stream.
     * @param strm The OutputStream to use for marshaling.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static int hexOf( char x )

    /** Converts an Ascii Character into Hexadecimal digit
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static void intToBytes(int value, byte[] array, int offset)

    /** Marshal an integer to a byte array.
        The bytes are in BIGENDIAN order.
        i.e. array[offset] is the most-significant-byte
        and  array[offset+3] is the least-significant-byte.
        @param array The array of bytes.
        @param offset The offset from which to start marshalling.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static int bytesToInt(byte[] array, int offset)

    /** Unmarshal a byte array to an integer.
        Assume the bytes are in BIGENDIAN order.
        i.e. array[offset] is the most-significant-byte
        and  array[offset+3] is the least-significant-byte.
        @param array The array of bytes.
        @param offset The offset from which to start unmarshalling.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static boolean isForeignORB(ORB orb)

    /**
     * Returns true if it was accurately determined that the remote ORB is
     * a foreign (non-JavaSoft) ORB.  Note:  If passed the ORBSingleton, this
     * will return false.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static ValueHandler createValueHandler() {

    /**
     * Return default ValueHandler
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
    public static void insertSystemException(SystemException ex, Any any) {

    /**
     * Static method for writing a CORBA standard exception to an Any.
     * @param any The Any to write the SystemException into.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/ORBUtility.java
public final class ORBUtility {

/**
 *  Handy class full of static functions that don't belong in util.Utility for pure ORB reasons.
 */
