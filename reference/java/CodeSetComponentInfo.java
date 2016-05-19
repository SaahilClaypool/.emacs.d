_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetComponentInfo.java
    public static final CodeSetContext LOCAL_CODE_SETS

    /**
     * Code sets for local cases without a connection.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetComponentInfo.java
    public static CodeSetComponent createFromString(String str) {

    /**
     * Creates a CodeSetComponent from a String which contains a comma
     * delimited list of OSF Code Set Registry numbers.  An INITIALIZE
     * exception is thrown if any of the numbers are not known by our
     * registry.  Used by corba.ORB init.
     *
     * The first number in the list is taken as the native code set,
     * and the rest is the conversion code set list.
     *
     * The numbers can either be decimal or hex.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetComponentInfo.java
    public static final CodeSetComponentInfo JAVASOFT_DEFAULT_CODESETS;

    /**
     * Our default code set scheme is as follows:
     *
     * char data:
     *
     * Native code set:  ISO 8859-1 (8-bit)
     * Conversion sets:  UTF-8, ISO 646 (7-bit)
     *
     * wchar data:
     *
     * Native code set:  UTF-16
     * Conversion sets:  UCS-2
     *
     * Pre-Merlin/J2EE 1.3 JavaSoft ORBs listed ISO646 for char and
     * UCS-2 for wchar, and provided no conversion sets.  They also
     * didn't do correct negotiation or provide the fallback sets.
     * UCS-2 is still in the conversion list for backwards compatibility.
     *
     * The fallbacks are UTF-8 for char and UTF-16 for wchar.
     *
     * In GIOP 1.1, interoperability with wchar is limited to 2 byte fixed
     * width encodings since its wchars aren't preceded by a length.
     * Thus, I've chosen not to include UTF-8 in the conversion set
     * for wchar data.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetComponentInfo.java
    public static final class CodeSetContext {

    /**
     * CodeSetContext goes in a GIOP service context
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CodeSetComponentInfo.java
    public static final class CodeSetComponent {

    /**
     * CodeSetComponent is part of an IOR multi-component profile.  Two
     * instances constitute a CodeSetComponentInfo (one for char and one
     * for wchar data)
     */
