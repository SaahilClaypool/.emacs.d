_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BooleanHolder.java
    public TypeCode _type() {

    /**
     * Retrieves the <code>TypeCode</code> object that corresponds to the
     * value held in this <code>BooleanHolder</code> object.
     *
     * @return    the <code>TypeCode</code> for the value held
     *            in this <code>BooleanHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BooleanHolder.java
    public void _write(OutputStream output) {

    /**
     * Marshals the value in this <code>BooleanHolder</code> object's
     * <code>value</code> field to the output stream <code>output</code>.
     *
     * @param output the OutputStream which will contain the CDR formatted data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BooleanHolder.java
    public void _read(InputStream input) {

    /**
     * Reads unmarshalled data from <code>input</code> and assigns it to this
     * <code>BooleanHolder</code> object's <code>value</code> field.
     *
     * @param input the <code>InputStream</code> object containing
     *              CDR formatted data from the wire
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BooleanHolder.java
    public BooleanHolder(boolean initial) {

    /**
     * Constructs a new <code>BooleanHolder</code> object with its
     * <code>value</code> field initialized with the given <code>boolean</code>.
     * @param initial the <code>boolean</code> with which to initialize
     *                the <code>value</code> field of the newly-created
     *                <code>BooleanHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BooleanHolder.java
    public BooleanHolder() {

    /**
     * Constructs a new <code>BooleanHolder</code> object with its
     * <code>value</code> field initialized to <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BooleanHolder.java
    public boolean value;

    /**
     * The <code>boolean</code> value held by this <code>BooleanHolder</code>
     * object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/BooleanHolder.java
public final class BooleanHolder implements Streamable {

/**
 * The Holder for <tt>Boolean</tt>.  For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P>
 * A Holder class for a <code>boolean</code>
 * that is used to store "out" and "inout" parameters in IDL methods.
 * If an IDL method signature has an IDL <code>boolean</code> as an "out"
 * or "inout" parameter, the programmer must pass an instance of
 * <code>BooleanHolder</code> as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the
 * value corresponding to the "out" value returned from the server.
 * <P>
 * If <code>myBooleanHolder</code> is an instance of <code>BooleanHolder</code>,
 * the value stored in its <code>value</code> field can be accessed with
 * <code>myBooleanHolder.value</code>.
 *
 * @since       JDK1.2
 */
