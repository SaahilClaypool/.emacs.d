_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    private static String convertFromISOLatin1 (String name) {

    /**
     * Convert strings with ISO Latin 1 escape sequences back to original strings.
     * <p>
     * Section 5.5.7 of OBV spec.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    public static String convertToISOLatin1 (String name) {

    /**
     * Convert strings with illegal IDL identifier characters.
     * <p>
     * Section 5.5.7 of OBV spec.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    public static String createForAnyType(Class type) {

    /**
     * Createa a repository ID for the type if it is either a java type
     * or an IDL type.
     * @param type The type to create rep. id for
     * @return The rep. id.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    public static String createForIDLType(Class ser, int major, int minor)

    /**
     * Creates a repository ID for an IDL Java Type.
     * @param ser The IDL Value object to create a repository ID for
     * @param major The major version number
     * @param minor The minor version number
     * @exception com.sun.corba.se.impl.io.TypeMismatchException if ser does not implement the
     * org.omg.CORBA.portable.IDLEntity interface which indicates it is an IDL Value type.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    public static String createForJavaType(Class clz)

    /**
     * Creates a repository ID for a normal Java Type.
     * @param clz The Java class to create a repository ID for
     * @exception com.sun.corba.se.impl.io.TypeMismatchException if ser implements the
     * org.omg.CORBA.portable.IDLEntity interface which indicates it is an IDL Value type.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    public static String createForJavaType(java.io.Serializable ser)

    /**
     * Creates a repository ID for a normal Java Type.
     * @param ser The Java object to create a repository ID for
     * @exception com.sun.corba.se.impl.io.TypeMismatchException if ser implements the
     * org.omg.CORBA.portable.IDLEntity interface which indicates it is an IDL Value type.
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    public static String createSequenceRepID(java.lang.Class clazz){

    /**
     * Creates a repository ID for a sequence.  This is for expert users only as
     * this method assumes the object passed is an array.  If passed an object
     * that is not an array, it will produce a malformed rep id.
     * @param clazz The Java class to create a repository ID for
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    public static String createSequenceRepID(java.lang.Object ser){

    /**
     * Creates a repository ID for a sequence.  This is for expert users only as
     * this method assumes the object passed is an array.  If passed an object
     * that is not an array, it will produce a rep id for a sequence of zero
     * length.  This would be an error.
     * @param ser The Java object to create a repository ID for
     **/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    public static boolean useFullValueDescription(Class clazz, String repositoryID)

    /**
     * Checks to see if the FullValueDescription should be retrieved.
     * @exception Throws IOException if suids do not match or if the repositoryID
     * is not an RMIValueType
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/util/RepositoryId.java
    private static final byte ASCII_HEX[] =     {

    /**
     * Used to convert ascii to hex.
     */
