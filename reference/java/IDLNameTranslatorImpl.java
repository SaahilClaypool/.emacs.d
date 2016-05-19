_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private static class IDLMethodInfo

    /**
     * Internal helper class for tracking information related to each
     * interface method while we're building the name translation table.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private static String getUnmappedContainerName(Class c) {

    /**
     * Return portion of class name excluding package name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private static String getPackageName(Class c) {

    /**
     * Return Class' package name or null if there is no package.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private static String mangleOverloadedMethod(String mangledName, Method m) {

    /**
     * Mangle an overloaded method name as defined in Section 1.3.2.6 of
     * Java2IDL spec.  Current value of method name is passed in as argument.
     * We can't start from original method name since the name might have
     * been partially mangled as a result of the other rules.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private static boolean isIDLDecimalDigit(char c) {

    /**
     * True if character is one of 10 Decimal Digits
     * specified in Table 3 of Chapter 3 in CORBA spec.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private static boolean isIDLAlphabeticChar(char c) {

    /**
     * True if character is one of 114 Alphabetic characters as
     * specified in Table 2 of Chapter 3 in CORBA spec.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    public static String charToUnicodeRepresentation(char c) {

    /**
     * Returns Unicode mangling as defined in Section 1.3.2.4 of
     * Java2IDL spec.
     *
     * "For Java identifiers that contain illegal OMG IDL identifier
     * characters such as '$' or Unicode characters outside of ISO Latin 1,
     * any such illegal characters are replaced by "U" followed by the
     * 4 hexadecimal characters(in upper case) representing the Unicode
     * value.  So, the Java name a$b is mapped to aU0024b and
     * x\u03bCy is mapped to xU03BCy."
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private static boolean identifierClashesWithContainer

    /**
     * Implements Section 1.3.2.9 of Java2IDL Mapping. Container in this
     * context means the name of the java Class(excluding package) in which
     * the identifier is defined.  Comparison is case-insensitive.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    String mangleCaseSensitiveCollision(String identifier) {

    /**
     * Implements mangling portion of Section 1.3.2.7 of Java2IDL spec.
     * This method only deals with the actual mangling.  Decision about
     * whether case-sensitive collision mangling is required is made
     * elsewhere.
     *
     *
     * "...a mangled name is generated consisting of the original name
     * followed by an underscore separated list of decimal indices
     * into the string, where the indices identify all the upper case
     * characters in the original string. Indices are zero based."
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    static String mangleUnicodeChars(String identifier) {

    /**
     * Implements Section 1.3.2.4 of Java2IDL Mapping.
     * All non-IDL identifier characters must be replaced
     * with their Unicode representation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private static boolean hasLeadingUnderscore(String identifier) {

    /**
     * Checks whether a java identifier starts with an underscore.
     * Used to implement section 1.3.2.3 of Java2IDL spec.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    static boolean isIDLKeyword(String identifier) {

    /**
     * Checks whether a java identifier clashes with an
     * IDL keyword.  Note that this is a case-insensitive
     * comparison.
     *
     * Used to implement section 1.3.2.2 of Java2IDL spec.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private static String mangleIdentifier(String identifier) {

    /**
     * Perform all necessary stand-alone identifier mangling operations
     * on a java identifier that is being transformed into an IDL name.
     * That is, mangling operations that don't require looking at anything
     * else but the identifier itself.  This covers sections 1.3.2.2, 1.3.2.3,
     * and 1.3.2.4 of the Java2IDL spec.  Method overloading and
     * case-sensitivity checks are handled elsewhere.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    private IDLNameTranslatorImpl(Class[] interfaces)

    /**
     * Initialize an IDLNameTranslator for the given interface.
     *
     * @throws IllegalStateException if given class is not a valid
     *         RMI/IIOP Remote Interface
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    public static IDLNameTranslator get( Class[] interfaces )

    /**
     * Return an IDLNameTranslator for the given interfacex.
     *
     * @throws IllegalStateException if given classes are not  valid
     *         RMI/IIOP Remote Interfaces
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
    public static IDLNameTranslator get( Class interf )

    /**
     * Return an IDLNameTranslator for the given interface.
     *
     * @throws IllegalStateException if given class is not a valid
     *         RMI/IIOP Remote Interface
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/IDLNameTranslatorImpl.java
public class IDLNameTranslatorImpl implements IDLNameTranslator {

/**
 * Bidirectional translator between RMI-IIOP interface methods and
 * and IDL Names.
 */
