_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FixedHolder.java
    public org.omg.CORBA.TypeCode _type() {

    /**
     * Return the <code>TypeCode</code> of this holder object.
     *
     * @return the <code>TypeCode</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FixedHolder.java
    public void _write(OutputStream output) {

    /**
     * Write the fixed point value stored in this holder to an
     * <code>OutputStream</code>.
     *
     * @param output the <code>OutputStream</code> to write into.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FixedHolder.java
    public void _read(InputStream input) {

    /**
     * Read a fixed point value from the input stream and store it in
     * the value member.
     *
     * @param input the <code>InputStream</code> to read from.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FixedHolder.java
    public FixedHolder(java.math.BigDecimal initial) {

    /**
     * Construct the FixedHolder and initialize it with the given value.
     * @param initial the value used to initialize the FixedHolder
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FixedHolder.java
    public FixedHolder() {

    /**
     * Construct the FixedHolder without initializing the contained value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/FixedHolder.java
public final class FixedHolder implements Streamable {

/**
 * The Holder for <tt>Fixed</tt>.  For more information on
 * Holder files, see <a href="doc-files/generatedfiles.html#holder">
 * "Generated Files: Holder Files"</a>.<P>
 * FixedHolder is a container class for values of IDL type "fixed",
 * which is mapped to the Java class java.math.BigDecimal.
 * It is usually used to store "out" and "inout" IDL method parameters.
 * If an IDL method signature has a fixed as an "out" or "inout" parameter,
 * the programmer must pass an instance of FixedHolder as the corresponding
 * parameter in the method invocation; for "inout" parameters, the programmer
 * must also fill the "in" value to be sent to the server.
 * Before the method invocation returns, the ORB will fill in the contained
 * value corresponding to the "out" value returned from the server.
 *
 */
