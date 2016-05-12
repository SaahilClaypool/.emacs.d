_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FloatHolder.java
    public org.omg.CORBA.TypeCode _type() {

    /**
     * Return the <code>TypeCode</code> of this Streamable.
     *
     * @return the <code>TypeCode</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FloatHolder.java
    public void _write(OutputStream output) {

    /**
     * Write the float value into an output stream.
     *
     * @param output the <code>OutputStream</code> to write into.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FloatHolder.java
    public void _read(InputStream input) {

    /**
     * Read a float from an input stream and initialize the value
     * member with the float value.
     *
     * @param input the <code>InputStream</code> to read from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FloatHolder.java
    public FloatHolder(float initial) {

    /**
     * Constructs a new <code>FloatHolder</code> object for the given
     * <code>float</code>.
     * @param initial the <code>float</code> with which to initialize
     *                the <code>value</code> field of the new
     *                <code>FloatHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FloatHolder.java
    public FloatHolder() {

    /**
     * Constructs a new <code>FloatHolder</code> object with its
     * <code>value</code> field initialized to 0.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FloatHolder.java
public final class FloatHolder implements Streamable {

/**
 * The Holder for <tt>Float</tt>.  For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P>
 * A Holder class for a <code>float</code>
 * that is used to store "out" and "inout" parameters in IDL methods.
 * If an IDL method signature has an IDL <code>float</code> as an "out"
 * or "inout" parameter, the programmer must pass an instance of
 * <code>FloatHolder</code> as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the
 * value corresponding to the "out" value returned from the server.
 * <P>
 * If <code>myFloatHolder</code> is an instance of <code>FloatHolder</code>,
 * the value stored in its <code>value</code> field can be accessed with
 * <code>myFloatHolder.value</code>.
 *
 * @since       JDK1.2
 */
