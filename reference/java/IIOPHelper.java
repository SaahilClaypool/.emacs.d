_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static Remote toStub(Remote obj) throws IOException {

    /**
     * Returns a stub for the given server object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static void unexportObject(Remote obj) throws IOException {

    /**
     * Deregisters a server object from the runtime.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static void exportObject(Remote obj) throws IOException {

    /**
     * Makes a server object ready to receive remote calls
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static <T> T narrow(Object narrowFrom, Class<T> narrowTo) {

    /**
     * Checks to ensure that an object of a remote or abstract interface
     * type can be cast to a desired type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static String objectToString(Object orb, Object obj) {

    /**
     * Converts the given CORBA object reference to a string.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static Object stringToObject(Object orb, String str) {

    /**
     * Converts a string, produced by the object_to_string method, back
     * to a CORBA object reference.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static Object createOrb(String[] args, Properties props)

    /**
     * Creates, and returns, a new ORB instance.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static boolean isOrb(Object obj) {

    /**
     * Returns true if the given object is an ORB.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static void connect(Object stub, Object orb)

    /**
     * Connects the Stub to the given ORB.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static Object getOrb(Object stub) {

    /**
     * Returns the ORB associated with the given stub
     *
     * @throws  UnsupportedOperationException
     *          if the object does not support the operation that
     *          was invoked
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static void setDelegate(Object stub, Object delegate) {

    /**
     * Sets the Delegate for a given Stub.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static Object getDelegate(Object stub) {

    /**
     * Returns the Delegate to which the given Stub delegates.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static boolean isStub(Object obj) {

    /**
     * Returns true if the given object is a Stub.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
    public static boolean isAvailable() {

    /**
     * Returns true if RMI-IIOP and CORBA is available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/IIOPHelper.java
public final class IIOPHelper {

/**
 * A helper class for RMI-IIOP and CORBA APIs.
 */
