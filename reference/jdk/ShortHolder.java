_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ShortHolder.java
    public org.omg.CORBA.TypeCode _type() {

    /**
     * Returns the TypeCode corresponding to the value held in
     * this <code>ShortHolder</code> object.
     *
     * @return    the TypeCode of the value held in
     *            this <code>ShortHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ShortHolder.java
    public void _write(OutputStream output) {

    /**
     * Marshals to <code>output</code> the value in
     * this <code>ShortHolder</code> object.
     *
     * @param output the OutputStream which will contain the CDR formatted data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ShortHolder.java
    public void _read(InputStream input) {

    /**
     * Reads from <code>input</code> and initalizes the value in
     * this <code>ShortHolder</code> object
     * with the unmarshalled data.
     *
     * @param input the InputStream containing CDR formatted data from the wire.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ShortHolder.java
    public ShortHolder(short initial) {

    /**
     * Constructs a new <code>ShortHolder</code> object with its
     * <code>value</code> field initialized to the given
     * <code>short</code>.
     * @param initial the <code>short</code> with which to initialize
     *                the <code>value</code> field of the newly-created
     *                <code>ShortHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ShortHolder.java
    public ShortHolder() {

    /**
     * Constructs a new <code>ShortHolder</code> object with its
     * <code>value</code> field initialized to <code>0</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ShortHolder.java
    public short value;

    /**
     * The <code>short</code> value held by this <code>ShortHolder</code>
     * object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ShortHolder.java
public final class ShortHolder implements Streamable {

/**
 * The Holder for <tt>Short</tt>.  For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P
 * A Holder class for a <code>short</code>
 * that is used to store "out" and "inout" parameters in IDL operations.
 * If an IDL operation signature has an IDL <code>short</code> as an "out"
 * or "inout" parameter, the programmer must pass an instance of
 * <code>ShortHolder</code> as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the
 * value corresponding to the "out" value returned from the server.
 * <P>
 * If <code>myShortHolder</code> is an instance of <code>ShortHolder</code>,
 * the value stored in its <code>value</code> field can be accessed with
 * <code>myShortHolder.value</code>.
 *
 * @since       JDK1.2
 */
