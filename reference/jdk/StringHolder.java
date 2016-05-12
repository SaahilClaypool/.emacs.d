_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StringHolder.java
    public org.omg.CORBA.TypeCode _type() {

    /**
     * Retrieves the <code>TypeCode</code> object that corresponds to
     * the value held in this <code>StringHolder</code> object.
     *
     * @return    the type code of the value held in this <code>StringHolder</code>
     *            object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StringHolder.java
    public void _write(OutputStream output) {

    /**
     * Marshals the value held by this <code>StringHolder</code> object
     * to the output stream  <code>output</code>.
     *
     * @param output the OutputStream which will contain the CDR formatted data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StringHolder.java
    public void _read(InputStream input) {

    /**
     * Reads the unmarshalled data from <code>input</code> and assigns it to
     * the <code>value</code> field of this <code>StringHolder</code> object.
     *
     * @param input the InputStream containing CDR formatted data from the wire.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StringHolder.java
    public StringHolder(String initial) {

    /**
     * Constructs a new <code>StringHolder</code> object with its
     * <code>value</code> field initialized to the given
     * <code>String</code>.
     * @param initial the <code>String</code> with which to initialize
     *                the <code>value</code> field of the newly-created
     *                <code>StringHolder</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StringHolder.java
    public StringHolder() {

    /**
     * Constructs a new <code>StringHolder</code> object with its
     * <code>value</code> field initialized to <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StringHolder.java
    public String value;

    /**
     * The <code>String</code> value held by this <code>StringHolder</code>
     * object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/StringHolder.java
public final class StringHolder implements Streamable {

/**
 * The Holder for <tt>String</tt>.  For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P>
 * A Holder class for a <code>String</code>
 * that is used to store "out" and "inout" parameters in IDL operations.
 * If an IDL operation signature has an IDL <code>string</code> as an "out"
 * or "inout" parameter, the programmer must pass an instance of
 * <code>StringHolder</code> as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the
 * value corresponding to the "out" value returned from the server.
 * <P>
 * If <code>myStringHolder</code> is an instance of <code>StringHolder</code>,
 * the value stored in its <code>value</code> field can be accessed with
 * <code>myStringHolder.value</code>.
 *
 * @since       JDK1.2
 */
