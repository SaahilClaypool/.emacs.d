_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    abstract public String[] _all_interfaces( POA poa, byte[] objectId);

    /**
     * Used by the ORB to obtain complete type
     * information from the servant.
     * @param poa POA with which the servant is associated.
     * @param objectId is the id corresponding to the object
     *         associated with this servant.
     * @return list of type information for the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    public org.omg.CORBA.Object _get_interface_def()

    /**
     * Returns an <code>InterfaceDef</code> object as a
     * <code>CORBA::Object</code> that defines the runtime type of the
     * <code>CORBA::Object</code> implemented by the <code>Servant</code>.
     * The invoker of <code>_get_interface_def</code>
     * must narrow the result to an <code>InterfaceDef</code> in order
     * to use it.
     * <P>This default implementation of <code>_get_interface_def()</code>
     * can be overridden
     * by derived servants if the default behavior is not adequate.
     * As defined in the CORBA 2.3.1 specification, section 11.3.1, the
     * default behavior of <code>_get_interface_def()</code> is to use
     * the most derived
     * interface of a static servant or the most derived interface retrieved
     * from a dynamic servant to obtain the <code>InterfaceDef</code>.
     * This behavior must
     * be supported by the <code>Delegate</code> that implements the
     * <code>Servant</code>.
     * @return <code>get_interface_def</code> an <code>InterfaceDef</code>
     * object as a
     * <code>CORBA::Object</code> that defines the runtime type of the
     * <code>CORBA::Object</code> implemented by the <code>Servant</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    /*

    /**
     * Returns an object in the Interface Repository
     * which provides type information that may be useful to a program.
     * <code>Servant</code> provides a default implementation of
     * <code>_get_interface()</code>
     * that can be overridden by derived servants if the default
     * behavior is not adequate.
     * @return <code>get_interface</code> type information that corresponds to this servant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    public boolean _non_existent() {

    /**
     * Checks for the existence of an
     * <code>Object</code>.
     * The <code>Servant</code> provides a default implementation of
     * <code>_non_existent()</code> that can be overridden by derived servants.
     * @return <code>non_existent</code> <code>true</code> if that object does
     *           not exist,  <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    public boolean _is_a(String repository_id) {

    /**
     * Checks to see if the specified <code>repository_id</code> is present
     * on the list returned by <code>_all_interfaces()</code> or is the
     * <code>repository_id</code> for the generic CORBA Object.
     * @param repository_id the <code>repository_id</code>
     *          to be checked in the repository list or against the id
     *          of generic CORBA objects.
     * @return <code>is_a</code> boolean indicating whether the specified
     *          <code>repository_id</code> is
     *         in the repository list or is same as a generic CORBA
     *         object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    public POA _default_POA() {

    /**
     * Returns the
     * root POA from the ORB instance associated with the servant.
     * Subclasses may override this method to return a different POA.
     * @return <code>default_POA</code> the POA associated with the
     * <code>Servant</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    final public byte[] _object_id() {

    /**
     * Allows easy execution of
     * common methods, equivalent
     * to calling <code>PortableServer::Current::get_object_id</code>.
     * @return <code>object_id</code> the <code>Object</code> ID associated
     * with this servant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    final public POA _poa() {

    /**
     * Allows easy execution of common methods, equivalent to
     * <code>PortableServer::Current:get_POA</code>.
     * @return <code>poa</code> POA associated with the servant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    final public ORB _orb() {

    /**
     * Returns the instance of the ORB
     * currently associated with the <code>Servant</code> (convenience method).
     * @return <code>orb</code> the instance of the ORB currently
     * associated with the <code>Servant</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    final public org.omg.CORBA.Object _this_object(ORB orb) {

    /**
     * Allows the servant to obtain the object reference for
     * the target CORBA Object it is incarnating for that request.
     * @param orb ORB with which the servant is associated.
     * @return <code>_this_object</code> reference associated with the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    final public org.omg.CORBA.Object _this_object() {

    /**
     * Allows the servant to obtain the object reference for
     * the target CORBA object it is incarnating for that request.
     * @return <code>this_object</code> <code>Object</code> reference
     * associated with the request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    final public void _set_delegate(Delegate delegate) {

    /**
     * Supports the Java ORB portability
     * interfaces by providing a method for classes that support
     * ORB portability through delegation to set their delegate.
     * @param delegate ORB vendor-specific implementation of
     *                 the <code>PortableServer::Servant</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
    final public Delegate _get_delegate() {

    /**
     * Gets the ORB vendor-specific implementation of
     * <code>PortableServer::Servant</code>.
     * @return <code>_delegate</code> the ORB vendor-specific
     * implementation of <code>PortableServer::Servant</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/Servant.java
abstract public class Servant {

/**
 * Defines the native <code>Servant</code> type. In Java, the
 * <code>Servant</code> type is mapped to the Java
 * <code>org.omg.PortableServer.Servant</code> class.
 * It serves as the base class for all POA servant
 * implementations and provides a number of methods that may
 * be invoked by the application programmer, as well as methods
 * which are invoked by the POA itself and may be overridden by
 * the user to control aspects of servant behavior.
 * Based on IDL to Java spec. (CORBA V2.3.1) ptc/00-01-08.pdf.
 */
