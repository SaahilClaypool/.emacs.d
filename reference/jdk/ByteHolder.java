_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ByteHolder.java
    public org.omg.CORBA.TypeCode _type() {

    /**
     * Returns the TypeCode corresponding to the value held in
     * this <code>ByteHolder</code> object.
     *
     * @return    the TypeCode of the value held in
     *               this <code>ByteHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ByteHolder.java
    public void _write(OutputStream output) {

    /**
     * Marshals to <code>output</code> the value in
     * this <code>ByteHolder</code> object.
     *
     * @param output the OutputStream which will contain the CDR formatted data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ByteHolder.java
    public void _read(InputStream input) {

    /**
     * Reads from <code>input</code> and initalizes the value in
     * this <code>ByteHolder</code> object
     * with the unmarshalled data.
     *
     * @param input the InputStream containing CDR formatted data from the wire.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ByteHolder.java
    public ByteHolder(byte initial) {

    /**
     * Constructs a new <code>ByteHolder</code> object for the given
     * <code>byte</code>.
     * @param initial the <code>byte</code> with which to initialize
     *                the <code>value</code> field of the new
     *                <code>ByteHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ByteHolder.java
    public ByteHolder() {

    /**
     * Constructs a new <code>ByteHolder</code> object with its
     * <code>value</code> field initialized to 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ByteHolder.java
public final class ByteHolder implements Streamable {

/**
 * The Holder for <tt>Byte</tt>.  For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P>
 * A Holder class for a <code>byte</code>
 * that is used to store "out" and "inout" parameters in IDL methods.
 * If an IDL method signature has an IDL <code>octet</code> as an "out"
 * or "inout" parameter, the programmer must pass an instance of
 * <code>ByteHolder</code> as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the
 * value corresponding to the "out" value returned from the server.
 * <P>
 * If <code>myByteHolder</code> is an instance of <code>ByteHolder</code>,
 * the value stored in its <code>value</code> field can be accessed with
 * <code>myByteHolder.value</code>.
 *
 * @since       JDK1.2
 */
