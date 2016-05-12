_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Object copyObject (Object obj, org.omg.CORBA.ORB orb)

    /**
     * Copies or connects an object. Used by local stubs to copy
     * an actual parameter, result object, or exception.
     * @param obj the object to copy.
     * @param orb the ORB.
     * @return the copy or connected object.
     * @exception RemoteException if the object could not be copied or connected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Object[] copyObjects (Object[] obj, org.omg.CORBA.ORB orb)

    /**
     * Copies or connects an array of objects. Used by local stubs
     * to copy any number of actual parameters, preserving sharing
     * across parameters as necessary to support RMI semantics.
     * @param obj the objects to copy or connect.
     * @param orb the ORB.
     * @return the copied or connected objects.
     * @exception RemoteException if any object could not be copied or connected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public RemoteException wrapException(Throwable orig)

    /**
     * Wraps an exception thrown by an implementation
     * method.  It returns the corresponding client-side exception.
     * @param orig the exception to wrap.
     * @return the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public boolean isLocal(javax.rmi.CORBA.Stub stub) throws RemoteException

    /**
     * The <tt>isLocal</tt> method has the same semantics as the
     * ObjectImpl._is_local method, except that it can throw a RemoteException.
     * (no it doesn't but the spec says it should.)
     *
     * The <tt>_is_local()</tt> method is provided so that stubs may determine
     * if a particular object is implemented by a local servant and hence local
     * invocation APIs may be used.
     *
     * @param stub the stub to test.
     *
     * @return The <tt>_is_local()</tt> method returns true if
     * the servant incarnating the object is located in the same process as
     * the stub and they both share the same ORB instance.  The <tt>_is_local()</tt>
     * method returns false otherwise. The default behavior of <tt>_is_local()</tt> is
     * to return false.
     *
     * @throws RemoteException The Java to IDL specification does to
     * specify the conditions that cause a RemoteException to be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Class loadClass( String className, String remoteCodebase,
        ClassLoader loader) throws ClassNotFoundException

    /**
     * Returns a class instance for the specified class.
     * @param className the name of the class.
     * @param remoteCodebase a space-separated list of URLs at which
     * the class might be found. May be null.
     * @param loadingContext a class whose ClassLoader may be used to
     * load the class if all other methods fail.
     * @return the <code>Class</code> object representing the loaded class.
     * @exception ClassNotFoundException if class cannot be loaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public String getCodebase(java.lang.Class clz) {

    /**
     * Returns the codebase, if any, for the given class.
     * @param clz the class to get a codebase for.
     * @return a space-separated list of URLs, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public ValueHandler createValueHandler()

    /**
     * Returns a singleton instance of a class that implements the
     * {@link ValueHandler} interface.
     * @return a class which implements the ValueHandler interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    private static Tie lookupTie (Remote target)

    /**
     * An unsynchronized version of getTie() for internal use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Tie getTie (Remote target)

    /**
     * Returns the tie (if any) for a given target object.
     * @return the tie or null if no tie is registered for the given target.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void unexportObject(java.rmi.Remote target)

    /**
     * Removes the associated tie from an internal table and calls {@link Tie#deactivate}
     * to deactivate the object.
     * @param target the object to unexport.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void registerTarget(javax.rmi.CORBA.Tie tie, java.rmi.Remote target)

    /**
     * Registers a target for a tie. Adds the tie to an internal table and calls
     * {@link Tie#setTarget} on the tie object.
     * @param tie the tie to register.
     * @param target the target for the tie.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void writeAbstractObject( OutputStream out, java.lang.Object obj )

    /**
     * Writes a java.lang.Object as either a value or a CORBA Object.
     * If <code>obj</code> is a value object or a stub object, it is written to
     * <code>out.write_abstract_interface(java.lang.Object)</code>. If <code>obj</code> is an exported
     * RMI-IIOP server object, the tie is found and wired to <code>obj</code>,
     * then written to <code>out.write_abstract_interface(java.lang.Object)</code>.
     * @param out the stream in which to write the object.
     * @param obj the object to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void writeRemoteObject(OutputStream out, java.lang.Object obj)

    /**
     * Writes a java.lang.Object as a CORBA Object. If <code>obj</code> is
     * an exported RMI-IIOP server object, the tie is found
     * and wired to <code>obj</code>, then written to <code>out.write_Object(org.omg.CORBA.Object)</code>.
     * If <code>obj</code> is a CORBA Object, it is written to
     * <code>out.write_Object(org.omg.CORBA.Object)</code>.
     * @param out the stream in which to write the object.
     * @param obj the object to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Object readAny(InputStream in)

    /**
     * Reads a java.lang.Object as a CORBA any.
     * @param in the stream from which to read the any.
     * @return the object read from the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    private TypeCode createTypeCodeForNull(org.omg.CORBA.ORB orb)

    /**
     * This is used to create the TypeCode for a null reference.
     * It also handles backwards compatibility with JDK 1.3.x.
     *
     * This method will not return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    private TypeCode createTypeCode(Serializable obj,
                                    org.omg.CORBA.Any any,
                                    org.omg.CORBA.ORB orb) {

    /**
     * When using our own ORB and Any implementations, we need to get
     * the ORB version and create the type code appropriately.  This is
     * to overcome a bug in which the JDK 1.3.x ORBs used a tk_char
     * rather than a tk_wchar to describe a Java char field.
     *
     * This only works in RMI-IIOP with Util.writeAny since we actually
     * know what ORB and stream we're writing with when we insert
     * the value.
     *
     * Returns null if it wasn't possible to create the TypeCode (means
     * it wasn't our ORB or Any implementation).
     *
     * This does not handle null objs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void writeAny( org.omg.CORBA.portable.OutputStream out,
                         java.lang.Object obj)

    /**
     * Writes any java.lang.Object as a CORBA any.
     * @param out the stream in which to write the any.
     * @param obj the object to write as an any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public RemoteException mapSystemException(SystemException ex)

   /**
     * Maps a SystemException to a RemoteException.
     * @param ex the SystemException to map.
     * @return the mapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
public class Util implements javax.rmi.CORBA.UtilDelegate

/**
 * Provides utility methods that can be used by stubs and ties to
 * perform common operations.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Util.java
    public static boolean wildmatch(String str, String pat) {

    /** Match a string against a shell-style pattern.  The only pattern
        characters recognized are <code>?</code>, standing for any one
        character, and <code>*</code>, standing for any string of
        characters, including the empty string.

        @param str the string to match.
        @param pat the pattern to match the string against.

        @return true if and only if the string matches the pattern.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Util.java
    /* The algorithm is a classical one.  We advance pointers in

    /** Match a part of a string against a shell-style pattern.
        The only pattern characters recognized are <code>?</code>,
        standing for any one character,
        and <code>*</code>, standing for any string of
        characters, including the empty string. For instance,
        {@code wildmatch("sandwich","sa?d*ch",1,4,1,4)} will match
        {@code "and"} against {@code "a?d"}.

        @param str  the string containing the sequence to match.
        @param pat  a string containing a pattern to match the sub string
                    against.
        @param stri   the index in the string at which matching should begin.
        @param strend the index in the string at which the matching should
                      end.
        @param pati   the index in the pattern at which matching should begin.
        @param patend the index in the pattern at which the matching should
                      end.

        @return true if and only if the string matches the pattern.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Util.java
    public static int hashCode(String[] names, Object[] values) {

    /**
     * Computes a descriptor hashcode from its names and values.
     * @param names  the sorted array of descriptor names.
     * @param values the array of descriptor values.
     * @return a hash code value, as described in {@link #hashCode(Descriptor)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static boolean isValidQNames(String str) {

    /**
     * Checks if the string is valid list of qnames
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static boolean isLiteral(String str) {

    /**
     * Checks if the string is a literal (i.e. not an AVT) or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String escape(String input) {

    /**
     * Replace occurances of '.', '-', '/' and ':'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String replace(String base, char ch, String str) {

    /**
     * Replace a certain character in a string with a new substring.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String toJavaName(String name) {

    /**
     * Replace all illegal Java chars by '_'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String pathName(String name) {

    /**
     * Search for both slashes in order to support URLs and
     * files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String baseName(String name) {

    /**
     * Search for both slashes in order to support URLs and
     * files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
public final class Util {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/Util.java
    public static InputSource getInputSource(XSLTC xsltc, Source source)

    /**
     * Creates a SAX2 InputSource object from a TrAX Source object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/Util.java
public final class Util {

/**
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/Util.java
    public static SAXException toSAXException(XNIException e) {

    /**
     * Reconstructs {@link SAXException} from XNIException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/Util.java
    public static final XMLInputSource toXMLInputSource( StreamSource in ) {

    /**
     * Creates a proper {@link XMLInputSource} from a {@link StreamSource}.
     *
     * @return always return non-null valid object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/Util.java
final class Util {

/**
 * <p>Static utility methods for the Validation API implementation.</p>
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Object copyObject (Object obj, org.omg.CORBA.ORB orb)

    /**
     * Copies or connects an object. Used by local stubs to copy
     * an actual parameter, result object, or exception.
     * @param obj the object to copy.
     * @param orb the ORB.
     * @return the copy or connected object.
     * @exception RemoteException if the object could not be copied or connected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Object[] copyObjects (Object[] obj, org.omg.CORBA.ORB orb)

    /**
     * Copies or connects an array of objects. Used by local stubs
     * to copy any number of actual parameters, preserving sharing
     * across parameters as necessary to support RMI semantics.
     * @param obj the objects to copy or connect.
     * @param orb the ORB.
     * @return the copied or connected objects.
     * @exception RemoteException if any object could not be copied or connected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public RemoteException wrapException(Throwable orig)

    /**
     * Wraps an exception thrown by an implementation
     * method.  It returns the corresponding client-side exception.
     * @param orig the exception to wrap.
     * @return the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public boolean isLocal(javax.rmi.CORBA.Stub stub) throws RemoteException

    /**
     * The <tt>isLocal</tt> method has the same semantics as the
     * ObjectImpl._is_local method, except that it can throw a RemoteException.
     * (no it doesn't but the spec says it should.)
     *
     * The <tt>_is_local()</tt> method is provided so that stubs may determine
     * if a particular object is implemented by a local servant and hence local
     * invocation APIs may be used.
     *
     * @param stub the stub to test.
     *
     * @return The <tt>_is_local()</tt> method returns true if
     * the servant incarnating the object is located in the same process as
     * the stub and they both share the same ORB instance.  The <tt>_is_local()</tt>
     * method returns false otherwise. The default behavior of <tt>_is_local()</tt> is
     * to return false.
     *
     * @throws RemoteException The Java to IDL specification does to
     * specify the conditions that cause a RemoteException to be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Class loadClass( String className, String remoteCodebase,
        ClassLoader loader) throws ClassNotFoundException

    /**
     * Returns a class instance for the specified class.
     * @param className the name of the class.
     * @param remoteCodebase a space-separated list of URLs at which
     * the class might be found. May be null.
     * @param loadingContext a class whose ClassLoader may be used to
     * load the class if all other methods fail.
     * @return the <code>Class</code> object representing the loaded class.
     * @exception ClassNotFoundException if class cannot be loaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public String getCodebase(java.lang.Class clz) {

    /**
     * Returns the codebase, if any, for the given class.
     * @param clz the class to get a codebase for.
     * @return a space-separated list of URLs, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public ValueHandler createValueHandler()

    /**
     * Returns a singleton instance of a class that implements the
     * {@link ValueHandler} interface.
     * @return a class which implements the ValueHandler interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    private static Tie lookupTie (Remote target)

    /**
     * An unsynchronized version of getTie() for internal use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Tie getTie (Remote target)

    /**
     * Returns the tie (if any) for a given target object.
     * @return the tie or null if no tie is registered for the given target.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void unexportObject(java.rmi.Remote target)

    /**
     * Removes the associated tie from an internal table and calls {@link Tie#deactivate}
     * to deactivate the object.
     * @param target the object to unexport.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void registerTarget(javax.rmi.CORBA.Tie tie, java.rmi.Remote target)

    /**
     * Registers a target for a tie. Adds the tie to an internal table and calls
     * {@link Tie#setTarget} on the tie object.
     * @param tie the tie to register.
     * @param target the target for the tie.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void writeAbstractObject( OutputStream out, java.lang.Object obj )

    /**
     * Writes a java.lang.Object as either a value or a CORBA Object.
     * If <code>obj</code> is a value object or a stub object, it is written to
     * <code>out.write_abstract_interface(java.lang.Object)</code>. If <code>obj</code> is an exported
     * RMI-IIOP server object, the tie is found and wired to <code>obj</code>,
     * then written to <code>out.write_abstract_interface(java.lang.Object)</code>.
     * @param out the stream in which to write the object.
     * @param obj the object to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void writeRemoteObject(OutputStream out, java.lang.Object obj)

    /**
     * Writes a java.lang.Object as a CORBA Object. If <code>obj</code> is
     * an exported RMI-IIOP server object, the tie is found
     * and wired to <code>obj</code>, then written to <code>out.write_Object(org.omg.CORBA.Object)</code>.
     * If <code>obj</code> is a CORBA Object, it is written to
     * <code>out.write_Object(org.omg.CORBA.Object)</code>.
     * @param out the stream in which to write the object.
     * @param obj the object to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public Object readAny(InputStream in)

    /**
     * Reads a java.lang.Object as a CORBA any.
     * @param in the stream from which to read the any.
     * @return the object read from the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    private TypeCode createTypeCodeForNull(org.omg.CORBA.ORB orb)

    /**
     * This is used to create the TypeCode for a null reference.
     * It also handles backwards compatibility with JDK 1.3.x.
     *
     * This method will not return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    private TypeCode createTypeCode(Serializable obj,
                                    org.omg.CORBA.Any any,
                                    org.omg.CORBA.ORB orb) {

    /**
     * When using our own ORB and Any implementations, we need to get
     * the ORB version and create the type code appropriately.  This is
     * to overcome a bug in which the JDK 1.3.x ORBs used a tk_char
     * rather than a tk_wchar to describe a Java char field.
     *
     * This only works in RMI-IIOP with Util.writeAny since we actually
     * know what ORB and stream we're writing with when we insert
     * the value.
     *
     * Returns null if it wasn't possible to create the TypeCode (means
     * it wasn't our ORB or Any implementation).
     *
     * This does not handle null objs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public void writeAny( org.omg.CORBA.portable.OutputStream out,
                         java.lang.Object obj)

    /**
     * Writes any java.lang.Object as a CORBA any.
     * @param out the stream in which to write the any.
     * @param obj the object to write as an any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
    public RemoteException mapSystemException(SystemException ex)

   /**
     * Maps a SystemException to a RemoteException.
     * @param ex the SystemException to map.
     * @return the mapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/javax/rmi/CORBA/Util.java
public class Util implements javax.rmi.CORBA.UtilDelegate

/**
 * Provides utility methods that can be used by stubs and ties to
 * perform common operations.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Util.java
    public static boolean wildmatch(String str, String pat) {

    /** Match a string against a shell-style pattern.  The only pattern
        characters recognized are <code>?</code>, standing for any one
        character, and <code>*</code>, standing for any string of
        characters, including the empty string.

        @param str the string to match.
        @param pat the pattern to match the string against.

        @return true if and only if the string matches the pattern.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Util.java
    /* The algorithm is a classical one.  We advance pointers in

    /** Match a part of a string against a shell-style pattern.
        The only pattern characters recognized are <code>?</code>,
        standing for any one character,
        and <code>*</code>, standing for any string of
        characters, including the empty string. For instance,
        {@code wildmatch("sandwich","sa?d*ch",1,4,1,4)} will match
        {@code "and"} against {@code "a?d"}.

        @param str  the string containing the sequence to match.
        @param pat  a string containing a pattern to match the sub string
                    against.
        @param stri   the index in the string at which matching should begin.
        @param strend the index in the string at which the matching should
                      end.
        @param pati   the index in the pattern at which matching should begin.
        @param patend the index in the pattern at which the matching should
                      end.

        @return true if and only if the string matches the pattern.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/mbeanserver/Util.java
    public static int hashCode(String[] names, Object[] values) {

    /**
     * Computes a descriptor hashcode from its names and values.
     * @param names  the sorted array of descriptor names.
     * @param values the array of descriptor values.
     * @return a hash code value, as described in {@link #hashCode(Descriptor)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static boolean isValidQNames(String str) {

    /**
     * Checks if the string is valid list of qnames
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static boolean isLiteral(String str) {

    /**
     * Checks if the string is a literal (i.e. not an AVT) or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String escape(String input) {

    /**
     * Replace occurances of '.', '-', '/' and ':'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String replace(String base, char ch, String str) {

    /**
     * Replace a certain character in a string with a new substring.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String toJavaName(String name) {

    /**
     * Replace all illegal Java chars by '_'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String pathName(String name) {

    /**
     * Search for both slashes in order to support URLs and
     * files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
    public static String baseName(String name) {

    /**
     * Search for both slashes in order to support URLs and
     * files.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/util/Util.java
public final class Util {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/Util.java
    public static InputSource getInputSource(XSLTC xsltc, Source source)

    /**
     * Creates a SAX2 InputSource object from a TrAX Source object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/trax/Util.java
public final class Util {

/**
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/Util.java
    public static SAXException toSAXException(XNIException e) {

    /**
     * Reconstructs {@link SAXException} from XNIException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/Util.java
    public static final XMLInputSource toXMLInputSource( StreamSource in ) {

    /**
     * Creates a proper {@link XMLInputSource} from a {@link StreamSource}.
     *
     * @return always return non-null valid object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/Util.java
final class Util {

/**
 * <p>Static utility methods for the Validation API implementation.</p>
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    private static Properties getORBPropertiesFile ()

    /**
     * Load the orb.properties file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static Object copyObject (Object obj, ORB orb)

    /**
     * Copies or connects an object. Used by local stubs to copy
     * an actual parameter, result object, or exception.
     * @param obj the object to copy.
     * @param orb the ORB.
     * @return the copy or connected object.
     * @exception RemoteException if the object could not be copied or connected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static Object[] copyObjects (Object[] obj, ORB orb)

    /**
     * Copies or connects an array of objects. Used by local stubs
     * to copy any number of actual parameters, preserving sharing
     * across parameters as necessary to support RMI semantics.
     * @param obj the objects to copy or connect.
     * @param orb the ORB.
     * @return the copied or connected objects.
     * @exception RemoteException if any object could not be copied or connected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static RemoteException wrapException(Throwable orig) {

    /**
     * Wraps an exception thrown by an implementation
     * method.  It returns the corresponding client-side exception.
     * @param orig the exception to wrap.
     * @return the wrapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static boolean isLocal(Stub stub) throws RemoteException {

    /**
     * The <tt>isLocal</tt> method has the same semantics as the
     * <tt>ObjectImpl._is_local</tt>
     * method, except that it can throw a <tt>RemoteException</tt>.
     *
     * The <tt>_is_local()</tt> method is provided so that stubs may determine if a
     * particular object is implemented by a local servant and hence local
     * invocation APIs may be used.
     *
     * @param stub the stub to test.
     *
     * @return The <tt>_is_local()</tt> method returns true if
     * the servant incarnating the object is located in the same process as
     * the stub and they both share the same ORB instance.  The <tt>_is_local()</tt>
     * method returns false otherwise. The default behavior of <tt>_is_local()</tt> is
     * to return false.
     *
     * @throws RemoteException The Java to IDL specification does not
     * specify the conditions that cause a <tt>RemoteException</tt> to be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static Class loadClass(String className,
                                  String remoteCodebase,
                                  ClassLoader loader)

    /**
     * Returns a class instance for the specified class.
     * <P>The spec for this method is the "Java to IDL language
     * mapping", ptc/00-01-06.
     * <P>In Java SE Platform, this method works as follows:
     * <UL><LI>Find the first non-null <tt>ClassLoader</tt> on the
     * call stack and attempt to load the class using this
     * <tt>ClassLoader</tt>.
     * <LI>If the first step fails, and if <tt>remoteCodebase</tt>
     * is non-null and
     * <tt>useCodebaseOnly</tt> is false, then call
     * <tt>java.rmi.server.RMIClassLoader.loadClass(remoteCodebase, className)</tt>.
     * <LI>If <tt>remoteCodebase</tt> is null or <tt>useCodebaseOnly</tt>
     * is true, then call <tt>java.rmi.server.RMIClassLoader.loadClass(className)</tt>.
     * <LI>If a class was not successfully loaded by step 1, 2, or 3,
     * and <tt>loader</tt> is non-null, then call <tt>loader.loadClass(className)</tt>.
     * <LI>If a class was successfully loaded by step 1, 2, 3, or 4, then
     *  return the loaded class, else throw <tt>ClassNotFoundException</tt>.
     * @param className the name of the class.
     * @param remoteCodebase a space-separated list of URLs at which
     * the class might be found. May be null.
     * @param loader a <tt>ClassLoader</tt> that may be used to
     * load the class if all other methods fail.
     * @return the <code>Class</code> object representing the loaded class.
     * @exception ClassNotFoundException if class cannot be loaded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static String getCodebase(java.lang.Class clz) {

    /**
     * Returns the codebase, if any, for the given class.
     * @param clz the class to get a codebase for.
     * @return a space-separated list of URLs, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static ValueHandler createValueHandler() {

    /**
     * Returns a singleton instance of a class that implements the
     * {@link ValueHandler} interface.
     * @return a class which implements the ValueHandler interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static Tie getTie (Remote target) {

    /**
     * Returns the tie (if any) for a given target object.
     * @return the tie or null if no tie is registered for the given target.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static void unexportObject(java.rmi.Remote target)

    /**
     * Removes the associated tie from an internal table and calls {@link
Tie#deactivate}
     * to deactivate the object.
     * @param target the object to unexport.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static void registerTarget(javax.rmi.CORBA.Tie tie,
                                      java.rmi.Remote target) {

    /**
     * Registers a target for a tie. Adds the tie to an internal table and calls
     * {@link Tie#setTarget} on the tie object.
     * @param tie the tie to register.
     * @param target the target for the tie.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static void writeAbstractObject(OutputStream out,
                                           java.lang.Object obj) {

    /**
     * Writes a java.lang.Object as either a value or a CORBA Object.
     * If <code>obj</code> is a value object or a stub object, it is written to
     * <code>out.write_abstract_interface(java.lang.Object)</code>. If <code>obj</code>
is
an exported
     * RMI-IIOP server object, the tie is found and wired to <code>obj</code>,
     * then written to <code>out.write_abstract_interface(java.lang.Object)</code>.
     * @param out the stream in which to write the object.
     * @param obj the object to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static void writeRemoteObject(OutputStream out,
                                         java.lang.Object obj) {

    /**
     * Writes a java.lang.Object as a CORBA Object. If <code>obj</code> is
     * an exported RMI-IIOP server object, the tie is found
     * and wired to <code>obj</code>, then written to
<code>out.write_Object(org.omg.CORBA.Object)</code>.
     * If <code>obj</code> is a CORBA Object, it is written to
     * <code>out.write_Object(org.omg.CORBA.Object)</code>.
     * @param out the stream in which to write the object.
     * @param obj the object to write.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static Object readAny(InputStream in) {

    /**
     * Reads a java.lang.Object as a CORBA any.
     * @param in the stream from which to read the any.
     * @return the object read from the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static void writeAny(OutputStream out, Object obj) {

    /**
     * Writes any java.lang.Object as a CORBA any.
     * @param out the stream in which to write the any.
     * @param obj the object to write as an any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
    public static RemoteException mapSystemException(SystemException ex) {

    /**
     * Maps a SystemException to a RemoteException.
     * @param ex the SystemException to map.
     * @return the mapped exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/rmi/CORBA/Util.java
public class Util {

/**
 * Provides utility methods that can be used by stubs and ties to
 * perform common operations.
 */
