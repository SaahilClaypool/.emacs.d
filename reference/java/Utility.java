_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/namingutil/Utility.java
    static void validateGIOPVersion( IIOPEndpointInfo endpointInfo ) {

    /**
     * If GIOP Version is not correct, This method throws a BAD_PARAM
     * Exception.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/namingutil/Utility.java
    static int hexOf( char x )

    /**
     *  Converts an Ascii Character into Hexadecimal digit
     *  NOTE: THIS METHOD IS DUPLICATED TO DELIVER NAMING AS A SEPARATE
     *  COMPONENT TO RI.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/namingutil/Utility.java
    static String cleanEscapes( String stringToDecode ) {

    /**
     * cleanEscapes removes URL escapes as per IETF 2386 RFP.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/naming/namingutil/Utility.java
class Utility {

/**
 *  Utility methods for Naming.
 *
 *  @Author Hemanth
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    static int hexOf( char x )

    /** Converts an Ascii Character into Hexadecimal digit
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    public static Object readAbstractAndNarrow(
        org.omg.CORBA_2_3.portable.InputStream in, Class narrowTo)

    /**
     * Read an abstract interface type from the input stream and narrow
     * it to the desired type.
     * @param in the stream to read from.
     * @throws ClassCastException if narrowFrom cannot be cast to narrowTo.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    public static Object readObjectAndNarrow(InputStream in,
                                             Class narrowTo)

    /**
     * Read an object reference from the input stream and narrow
     * it to the desired type.
     * @param in the stream to read from.
     * @throws ClassCastException if narrowFrom cannot be cast to narrowTo.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    public static String idlStubName(String className)

    /**
     * Create an IDL stub name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    public static void throwNotSerializableForCorba(String className) {

    /**
     * Throws the CORBA equivalent of a java.io.NotSerializableException
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    public static String tieName (String className)

    /**
     * Create an RMI tie name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    public static String stubName (String className)

    /**
     * Create an RMI stub name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    public static ValueFactory getFactory(Class clazz, String codebase,
                               ORB orb, String repId)

    /**
     * Get the factory for an IDLValue
     *
     * Throws MARSHAL exception if no factory found.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    public static BoxedValueHelper getHelper(Class clazz, String codebase,
        String repId)

    /**
     * Get the helper for an IDLValue
     *
     * Throws MARSHAL exception if no helper found.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
    public static Object autoConnect(Object obj, ORB orb, boolean convertToStub)

    /**
     * Ensure that stubs, ties, and implementation objects
     * are 'connected' to the runtime. Converts implementation
     * objects to a type suitable for sending on the wire.
     * @param obj the object to connect.
     * @param orb the ORB to connect to if obj is exported to IIOP.
     * @param convertToStub true if implementation types should be
     * converted to Stubs rather than just org.omg.CORBA.Object.
     * @return the connected object.
     * @exception NoSuchObjectException if obj is an implementation
     * which has not been exported.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/Utility.java
public final class Utility {

/**
 *  Handy class full of static functions.
 */
