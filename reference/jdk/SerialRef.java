_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    static final long serialVersionUID = -4727123500609662274L;

    /**
     * The identifier that assists in the serialization of this <code>SerialRef</code>
     * object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    private void writeObject(ObjectOutputStream s)

    /**
     * writeObject is called to save the state of the SerialRef
     * to a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    private void readObject(ObjectInputStream s)

    /**
     * readObject is called to restore the state of the SerialRef from
     * a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    public Object clone() {

    /**
     * Returns a clone of this {@code SerialRef}.
     * The underlying {@code Ref} object will be set to null.
     *
     * @return  a clone of this SerialRef
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    public int hashCode() {

    /**
     * Returns a hash code for this {@code SerialRef}.
     * @return  a hash code value for this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    public boolean equals(Object obj) {

    /**
     * Compares this SerialRef to the specified object.  The result is {@code
     * true} if and only if the argument is not {@code null} and is a {@code
     * SerialRef} object that represents the same object as this
     * object.
     *
     * @param  obj The object to compare this {@code SerialRef} against
     *
     * @return  {@code true} if the given object represents a {@code SerialRef}
     *          equivalent to this SerialRef, {@code false} otherwise
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    public void setObject(Object obj) throws SerialException {

    /**
     * Sets the SQL structured type that this <code>SerialRef</code> object
     * references to the given <code>Object</code> object.
     *
     * @param obj an <code>Object</code> representing the SQL structured type
     *        to be referenced
     * @throws SerialException if an error is encountered generating the
     * the structured type referenced by this <code>SerialRef</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    public Object getObject() throws SerialException {

    /**
     * Returns an <code>Object</code> representing the SQL structured type
     * to which this <code>SerialRef</code> object refers.
     *
     * @return an object instance resolved from the Ref reference
     * @throws SerialException if an error is encountered in the reference
     *         resolution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    public Object getObject(java.util.Map<String,Class<?>> map)

    /**
     * Returns an <code>Object</code> representing the SQL structured type
     * to which this <code>SerialRef</code> object refers.  The attributes
     * of the structured type are mapped according to the given type map.
     *
     * @param map a <code>java.util.Map</code> object containing zero or
     *        more entries, with each entry consisting of 1) a <code>String</code>
     *        giving the fully qualified name of a UDT and 2) the
     *        <code>Class</code> object for the <code>SQLData</code> implementation
     *        that defines how the UDT is to be mapped
     * @return an object instance resolved from the Ref reference and mapped
     *        according to the supplied type map
     * @throws SerialException if an error is encountered in the reference
     *        resolution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    public String getBaseTypeName() throws SerialException {

    /**
     * Returns a string describing the base type name of the <code>Ref</code>.
     *
     * @return a string of the base type name of the Ref
     * @throws SerialException in no Ref object has been set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    public SerialRef(Ref ref) throws SerialException, SQLException {

    /**
     * Constructs a <code>SerialRef</code> object from the given <code>Ref</code>
     * object.
     *
     * @param ref a Ref object; cannot be <code>null</code>
     * @throws SQLException if a database access occurs; if <code>ref</code>
     *     is <code>null</code>; or if the <code>Ref</code> object returns a
     *     <code>null</code> value base type name.
     * @throws SerialException if an error occurs serializing the <code>Ref</code>
     *     object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    private Ref reference;

    /**
     * Private copy of the Ref reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    private Object object;

    /**
     * This will store the type <code>Ref</code> as an <code>Object</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
    private String baseTypeName;

    /**
     * String containing the base type name.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/serial/SerialRef.java
public class SerialRef implements Ref, Serializable, Cloneable {

/**
 * A serialized mapping of a <code>Ref</code> object, which is the mapping in the
 * Java programming language of an SQL <code>REF</code> value.
 * <p>
 * The <code>SerialRef</code> class provides a constructor  for
 * creating a <code>SerialRef</code> instance from a <code>Ref</code>
 * object and provides methods for getting and setting the <code>Ref</code> object.
 *
 * <h3> Thread safety </h3>
 *
 * A SerialRef is not safe for use by multiple concurrent threads.  If a
 * SerialRef is to be used by more than one thread then access to the SerialRef
 * should be controlled by appropriate synchronization.
 *
 */
