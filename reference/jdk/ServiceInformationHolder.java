_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformationHolder.java
    public org.omg.CORBA.TypeCode _type() {

    /**
     * Retrieves the <code>TypeCode</code> object that corresponds
     * to the value held in this <code>ServiceInformationHolder</code> object's
     * <code>value</code> field.
     *
     * @return    the type code for the value held in this <code>ServiceInformationHolder</code>
     *            object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformationHolder.java
    public void _read(org.omg.CORBA.portable.InputStream in) {

    /**
     * Reads unmarshalled data from the input stream <code>in</code> and assigns it to
     * the <code>value</code> field in this <code>ServiceInformationHolder</code> object.
     *
     * @param in the <code>InputStream</code> object containing CDR
     *              formatted data from the wire
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformationHolder.java
    public void _write(org.omg.CORBA.portable.OutputStream out) {

    /**
     * Marshals the value in this <code>ServiceInformationHolder</code> object's
     * <code>value</code> field to the output stream <code>out</code>.
     *
     * @param out the <code>OutputStream</code> object that will contain
     *               the CDR formatted data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformationHolder.java
    public ServiceInformationHolder(org.omg.CORBA.ServiceInformation arg) {

    /**
     * Constructs a new <code>ServiceInformationHolder</code> object with its
     * <code>value</code> field initialized to the given
     * <code>ServiceInformation</code> object.
     *
     * @param arg the <code>ServiceInformation</code> object with which to initialize
     *                the <code>value</code> field of the newly-created
     *                <code>ServiceInformationHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformationHolder.java
    public ServiceInformationHolder() {

    /**
     * Constructs a new <code>ServiceInformationHolder</code> object with its
     * <code>value</code> field initialized to null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformationHolder.java
    public ServiceInformation value;

    /**
     * The <code>ServiceInformation</code> value held by this
     * <code>ServiceInformationHolder</code> object in its <code>value</code> field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformationHolder.java
public final class ServiceInformationHolder

/**
 * The Holder for <tt>ServiceInformation</tt>.  For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P>
 * A Holder class for a <code>ServiceInformation</code> object
 * that is used to store "out" and "inout" parameters in IDL methods.
 * If an IDL method signature has an IDL <code>xxx</code> as an "out"
 * or "inout" parameter, the programmer must pass an instance of
 * <code>ServiceInformationHolder</code> as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the
 * value corresponding to the "out" value returned from the server.
 * <P>
 * If <code>myServiceInformationHolder</code> is an instance of <code>ServiceInformationHolder</code>,
 * the value stored in its <code>value</code> field can be accessed with
 * <code>myServiceInformationHolder.value</code>.
 */
