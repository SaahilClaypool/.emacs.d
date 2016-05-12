_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public boolean equals(java.lang.Object obj) {

    /**
     * Compares this <code>ObjectImpl</code> object with the given one
     * for equality.
     *
     *@param obj the object with which to compare this object
     *@return <code>true</code> if the two objects are equal;
     *        <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public int hashCode() {

    /**
     * Returns the hash code for this <code>ObjectImpl</code> object.
     *
     * @return the hash code for this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public String toString() {

    /**
     * Returns a <code>String</code> object that represents this
     * <code>ObjectImpl</code> object.
     *
     * @return the <code>String</code> representation of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public void _releaseReply(InputStream input) {

    /**
     * Releases the given
     * reply stream back to the ORB when unmarshalling has
     * completed after a call to the method <code>_invoke</code>.
     * Calling this method is optional for the stub.
     *
     * @param input  the <code>InputStream</code> object that was returned
     *        by the <code>_invoke</code> method or the
     *        <code>ApplicationException.getInputStream</code> method;
     *        may be <code>null</code>, in which case this method does
     *        nothing
     * @see #_invoke
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public InputStream _invoke(OutputStream output)

    /**
     * Invokes an operation and returns an <code>InputStream</code>
     * object for reading the response. The stub provides the
     * <code>OutputStream</code> object that was previously returned by a
     * call to the <code>_request</code> method. The method specified
     * as an argument to <code>_request</code> when it was
     * called previously is the method that this method invokes.
     * <P>
     * If an exception occurs, the <code>_invoke</code> method may throw an
     * <code>ApplicationException</code> object that contains an InputStream from
     * which the user exception state may be unmarshalled.
     *
     * @param output  an OutputStream object for dispatching the request
     * @return an <code>InputStream</code> object containing the marshalled
     *         response to the method invoked
     * @throws ApplicationException if the invocation
     *         meets application-defined exception
     * @throws RemarshalException if the invocation leads
     *         to a remarshalling error
     * @see #_request
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public OutputStream _request(String operation,
                                 boolean responseExpected) {

    /**
     * Returns an <code>OutputStream</code> object to use for marshalling
     * the arguments of the given method.  This method is called by a stub,
     * which must indicate if a response is expected, that is, whether or not
     * the call is oneway.
     *
     * @param operation         a String giving the name of the method.
     * @param responseExpected  a boolean -- <code>true</code> if the
     *         request is not one way, that is, a response is expected
     * @return an <code>OutputStream</code> object for dispatching the request
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public void _servant_postinvoke(ServantObject servant) {

    /**
     * Is called by the local stub after it has invoked an operation
     * on the local servant that was previously retrieved from a
     * call to the method <code>_servant_preinvoke</code>.
     * The <code>_servant_postinvoke</code> method must be called
     * if the <code>_servant_preinvoke</code>
     * method returned a non-null value, even if an exception was thrown
     * by the method invoked by the servant. For this reason, the call
     * to the method <code>_servant_postinvoke</code> should be placed
     * in a Java <code>finally</code> clause.
     *
     * @param servant the instance of the <code>ServantObject</code>
     *        returned by the <code>_servant_preinvoke</code> method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public ServantObject _servant_preinvoke(String operation,
                                            Class expectedType) {

    /**
     * Returns a Java reference to the local servant that should be used for sending
     * a request for the method specified. If this <code>ObjectImpl</code>
     * object is a local stub, it will invoke the <code>_servant_preinvoke</code>
     * method before sending a request in order to obtain the
     * <code>ServantObject</code> instance to use.
     * <P>
     * If a <code>ServantObject</code> object is returned, its <code>servant</code>
     * field has been set to an object of the expected type (Note: the object may
     * or may not be the actual servant instance). The local stub may cast
     * the servant field to the expected type, and then invoke the operation
     * directly. The <code>ServantRequest</code> object is valid for only one
     * invocation and cannot be used for more than one invocation.
     *
     * @param operation a <code>String</code> containing the name of the method
     *        to be invoked. This name should correspond to the method name as
     *        it would be encoded in a GIOP request.
     *
     * @param expectedType a <code>Class</code> object representing the
     *        expected type of the servant that is returned. This expected
     *        type is the <code>Class</code> object associated with the
     *        operations class for the stub's interface. For example, a
     *        stub for an interface <code>Foo</code> would pass the
     *        <code>Class</code> object for the <code>FooOperations</code>
     *        interface.
     *
     * @return (1) a <code>ServantObject</code> object, which may or may
     *         not be the actual servant instance, or (2) <code>null</code> if
     *         (a) the servant is not local or (b) the servant has ceased to
     *         be local due to a ForwardRequest from a POA ServantManager
     * @throws org.omg.CORBA.BAD_PARAM if the servant is not the expected type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public boolean _is_local() {

    /**
     * Checks whether this <code>ObjectImpl</code> object is implemented
     * by a local servant.  If so, local invocation API's may be used.
     *
     * @return <code>true</code> if this object is implemented by a local
     *         servant; <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public org.omg.CORBA.Object

    /**
     * Sets this <code>ObjectImpl</code> object's override type for
     * the given policies to the given instance of
     * <code>SetOverrideType</code>.
     *
     * @param policies an array of <code>Policy</code> objects with the
     *         policies that will replace the current policies or be
     *         added to the current policies
     * @param set_add either <code>SetOverrideType.SET_OVERRIDE</code>,
     *         indicating that the given policies will replace any existing
     *         ones, or <code>SetOverrideType.ADD_OVERRIDE</code>, indicating
     *         that the given policies should be added to any existing ones
     * @return an <code>Object</code> with the given policies replacing or
     *         added to its previous policies
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public org.omg.CORBA.DomainManager[] _get_domain_managers() {

    /**
     * Retrieves a list of the domain managers for this
     * <code>ObjectImpl</code> object.
     *
     * @return an array containing the <code>DomainManager</code>
     *         objects for this instance of <code>ObjectImpl</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public org.omg.CORBA.Policy _get_policy(int policy_type) {

    /**
     * Retrieves the <code>Policy</code> object for this
     * <code>ObjectImpl</code> object that has the given
     * policy type.
     *
     * @param policy_type an int indicating the policy type
     * @return the <code>Policy</code> object that is the specified policy type
     *         and that applies to this <code>ObjectImpl</code> object
     * @see org.omg.CORBA.PolicyOperations#policy_type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public org.omg.CORBA.ORB _orb() {

    /**
     * Returns a reference to the ORB associated with this object and
     * its delegate.  This is the <code>ORB</code> object that created
     * the delegate.
     *
     * @return the <code>ORB</code> instance that created the
     *          <code>Delegate</code> object contained in this
     *          <code>ObjectImpl</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public org.omg.CORBA.Object _get_interface_def()

    /**
     * Retrieves the interface definition for this <code>ObjectImpl</code>
     * object.
     *
     * @return the <code>org.omg.CORBA.Object</code> instance that is the
     *         interface definition for this <code>ObjectImpl</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public Request _create_request(Context ctx,
                                   String operation,
                                   NVList arg_list,
                                   NamedValue result,
                                   ExceptionList exceptions,
                                   ContextList contexts) {

    /**
     * Creates a <code>Request</code> object that contains the given context,
     * method, argument list, container for the result, exceptions, and
     * list of property names to be used in resolving the context strings.
     * This <code>Request</code> object is for use in the Dynamic
     * Invocation Interface.
     *
     * @param ctx the <code>Context</code> object that contains the
     *        context strings that must be resolved before they are
     *        sent along with the request
     * @param operation the method that the new <code>Request</code>
     *        object will invoke
     * @param arg_list the arguments for the method; an <code>NVList</code>
     *        in which each argument is a <code>NamedValue</code> object
     * @param result a <code>NamedValue</code> object to be used for
     *        returning the result of executing the request's method
     * @param exceptions a list of the exceptions that the given method
     *        throws
     * @param contexts a list of the properties that are needed to
     *        resolve the contexts in <i>ctx</i>; the strings in
     *        <i>contexts</i> are used as arguments to the method
     *        <code>Context.get_values</code>,
     *        which returns the value associated with the given property
     * @return a new <code>Request</code> object initialized with the
     *         given context strings to resolve, method, argument list,
     *         container for the result, exceptions, and list of property
     *         names to be used in resolving the context strings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public Request _create_request(Context ctx,
                                   String operation,
                                   NVList arg_list,
                                   NamedValue result) {

    /**
     * Creates a <code>Request</code> object that contains the given context,
     * method, argument list, and container for the result.
     *
     * @param ctx the Context for the request
     * @param operation the method that the new <code>Request</code>
     *        object will invoke
     * @param arg_list the arguments for the method; an <code>NVList</code>
     *        in which each argument is a <code>NamedValue</code> object
     * @param result a <code>NamedValue</code> object to be used for
     *        returning the result of executing the request's method
     * @return a new <code>Request</code> object initialized with the
     *         given context, method, argument list, and container for the
     *         return value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public Request _request(String operation) {

    /**
     * Creates a <code>Request</code> object containing the given method
     * that can be used with the Dynamic Invocation Interface.
     *
     * @param operation the method to be invoked by the new <code>Request</code>
     *        object
     * @return a new <code>Request</code> object initialized with the
     *         given method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public int _hash(int maximum) {

    /**
     * Retrieves the hash code that serves as an ORB-internal identifier for
     * this <code>ObjectImpl</code> object.
     *
     * @param maximum an <code>int</code> indicating the upper bound on the hash
     *        value returned by the ORB
     * @return an <code>int</code> representing the hash code for this
     *         <code>ObjectImpl</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public boolean _non_existent() {

    /**
     * Checks whether the server object for this <code>ObjectImpl</code>
     * object has been destroyed.
     *
     * @return <code>true</code> if the ORB knows authoritatively that the
     *         server object does not exist; <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public boolean _is_equivalent(org.omg.CORBA.Object that) {

    /**
     * Checks whether the the given <code>ObjectImpl</code> object is
     * equivalent to this <code>ObjectImpl</code> object.
     *
     * @param that an instance of <code>ObjectImpl</code> to compare with
     *        this <code>ObjectImpl</code> object
     * @return <code>true</code> if the given object is equivalent
     *         to this <code>ObjectImpl</code> object;
     *         <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public boolean _is_a(String repository_id) {

    /**
     * Checks whether the object identified by the given repository
     * identifier is an <code>ObjectImpl</code> object.
     *
     * @param repository_id a <code>String</code> object with the repository
     *        identifier to check
     * @return <code>true</code> if the object identified by the given
     *         repository id is an instance of <code>ObjectImpl</code>;
     *         <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public void _release() {

    /**
     * Releases the resources associated with this <code>ObjectImpl</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public org.omg.CORBA.Object _duplicate() {

    /**
     * Returns a duplicate of this <code>ObjectImpl</code> object.
     *
     * @return an <code>orb.omg.CORBA.Object</code> object that is
     *         a duplicate of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public abstract String[] _ids();

    /**
     * Retrieves a string array containing the repository identifiers
     * supported by this <code>ObjectImpl</code> object.  For example,
     * for a stub, this method returns information about all the
     * interfaces supported by the stub.
     *
     * @return the array of all repository identifiers supported by this
     *         <code>ObjectImpl</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public void _set_delegate(Delegate delegate) {

    /**
     * Sets the Delegate for this <code>ObjectImpl</code> instance to the given
     * <code>Delegate</code> object.  All method invocations on this
     * <code>ObjectImpl</code> object will be forwarded to this delegate.
     *
     * @param delegate the <code>Delegate</code> instance to which
     *        all method calls on this <code>ObjectImpl</code> object
     *        will be delegated; may be implemented by a third-party ORB
     * @see #_get_delegate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    public Delegate _get_delegate() {

    /**
     * Retrieves the reference to the vendor-specific <code>Delegate</code>
     * object to which this <code>ObjectImpl</code> object delegates all
     * methods invoked on it.
     *
     * @return the Delegate contained in this ObjectImpl instance
     * @throws BAD_OPERATION if the delegate has not been set
     * @see #_set_delegate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
    private transient Delegate __delegate;

    /**
     * The field that stores the <code>Delegate</code> instance for
     * this <code>ObjectImpl</code> object. This <code>Delegate</code>
     * instance can be implemented by a vendor-specific ORB.  Stub classes,
     * which are derived from this <code>ObjectImpl</code> class, can be
     * portable because they delegate all of the methods called on them to this
     * <code>Delegate</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ObjectImpl.java
abstract public class ObjectImpl implements org.omg.CORBA.Object

/**
 *  The common base class for all stub classes; provides default implementations
 *  of the <code>org.omg.CORBA.Object</code> methods. All method implementations are
 *  forwarded to a <code>Delegate</code> object stored in the <code>ObjectImpl</code>
 *  instance.  <code>ObjectImpl</code> allows for portable stubs because the
 *  <code>Delegate</code> can be implemented by a different vendor-specific ORB.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/ObjectImpl.java
    public java.lang.String _get_codebase() {

    /** Returns the codebase for this object reference.
     * @return the codebase as a space delimited list of url strings or
     * null if none.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA_2_3/portable/ObjectImpl.java
public abstract class ObjectImpl extends org.omg.CORBA.portable.ObjectImpl {

/**
 * ObjectImpl class is the base class for all stubs.  It provides the
 * basic delegation mechanism.  It extends org.omg.CORBA.portable.ObjectImpl
 * and provides new methods defined by CORBA 2.3.
 *
 * @see org.omg.CORBA.portable.ObjectImpl
 * @author  OMG
 * @since   JDK1.2
 */
