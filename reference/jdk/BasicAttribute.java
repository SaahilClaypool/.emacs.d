_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    private static final long serialVersionUID = 6743528196119291326L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    private void readObject(java.io.ObjectInputStream s)

    /**
     * Overridden to avoid exposing implementation details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    private void writeObject(java.io.ObjectOutputStream s)

    /**
     * Overridden to avoid exposing implementation details
     * @serialData Default field (the attribute ID -- a String),
     * followed by the number of values (an int), and the
     * individual values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public DirContext getAttributeDefinition() throws NamingException {

    /**
      * Retrieves this attribute's schema definition.
      *<p>
      * This method by default throws OperationNotSupportedException. A subclass
      * should override this method if it supports schema.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public DirContext getAttributeSyntaxDefinition() throws NamingException {

    /**
      * Retrieves the syntax definition associated with this attribute.
      *<p>
      * This method by default throws OperationNotSupportedException. A subclass
      * should override this method if it supports schema.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public boolean remove(Object attrval) {

    /**
      * Removes a specified value from this attribute.
      *<p>
      * By default, <tt>Object.equals()</tt> is used when comparing <tt>attrVal</tt>
      * with this attribute's values except when <tt>attrVal</tt> is an array.
      * For an array, each element of the array is checked using
      * <tt>Object.equals()</tt>.
      * A subclass may use schema information to determine equality.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public boolean add(Object attrVal) {

    /**
      * Adds a new value to this attribute.
      *<p>
      * By default, <tt>Object.equals()</tt> is used when comparing <tt>attrVal</tt>
      * with this attribute's values except when <tt>attrVal</tt> is an array.
      * For an array, each element of the array is checked using
      * <tt>Object.equals()</tt>.
      * A subclass may use schema information to determine equality.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    private static boolean arrayEquals(Object a1, Object a2) {

    /**
     * Determines whether two arrays are equal by comparing each of their
     * elements using <tt>Object.equals()</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    private static boolean valueEquals(Object obj1, Object obj2) {

    /**
     * Determines whether two attribute values are equal.
     * Use arrayEquals for arrays and <tt>Object.equals()</tt> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public boolean contains(Object attrVal) {

    /**
      * Determines whether a value is in this attribute.
      *<p>
      * By default,
      * <tt>Object.equals()</tt> is used when comparing <tt>attrVal</tt>
      * with this attribute's values except when <tt>attrVal</tt> is an array.
      * For an array, each element of the array is checked using
      * <tt>Object.equals()</tt>.
      * A subclass may use schema information to determine equality.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public Object get() throws NamingException {

    /**
      * Retrieves one of this attribute's values.
      *<p>
      * By default, the value returned is one of those passed to the
      * constructor and/or manipulated using the add/replace/remove methods.
      * A subclass may override this to retrieve the value dynamically
      * from the directory.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public NamingEnumeration<?> getAll() throws NamingException {

    /**
      * Retrieves an enumeration of this attribute's values.
      *<p>
      * By default, the values returned are those passed to the
      * constructor and/or manipulated using the add/replace/remove methods.
      * A subclass may override this to retrieve the values dynamically
      * from the directory.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public BasicAttribute(String id, Object value, boolean ordered) {

    /**
      * Constructs a new instance of a possibly ordered attribute with a
      * single value.
      *
      * @param id The attribute's id. It cannot be null.
      * @param value The attribute's value. If null, a null
      *        value is added to the attribute.
      * @param ordered true means the attribute's values will be ordered;
      * false otherwise.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public BasicAttribute(String id, boolean ordered) {

    /**
      * Constructs a new instance of a possibly ordered attribute with no value.
      *
      * @param id The attribute's id. It cannot be null.
      * @param ordered true means the attribute's values will be ordered;
      * false otherwise.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public BasicAttribute(String id, Object value) {

    /**
      * Constructs a new instance of an unordered attribute with a single value.
      *
      * @param id The attribute's id. It cannot be null.
      * @param value The attribute's value. If null, a null
      *        value is added to the attribute.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public BasicAttribute(String id) {

    /**
      * Constructs a new instance of an unordered attribute with no value.
      *
      * @param id The attribute's id. It cannot be null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public String toString() {

    /**
      * Generates the string representation of this attribute.
      * The string consists of the attribute's id and its values.
      * This string is meant for debugging and not meant to be
      * interpreted programmatically.
      * @return The non-null string representation of this attribute.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public int hashCode() {

    /**
      * Calculates the hash code of this attribute.
      *<p>
      * The hash code is computed by adding the hash code of
      * the attribute's id and that of all of its values except for
      * values that are arrays.
      * For an array, the hash code of each element of the array is summed.
      * If a subclass overrides <tt>hashCode()</tt>, it should override
      * <tt>equals()</tt>
      * as well so that two attributes that are equal have the same hash code.
      *
      * @return an int representing the hash code of this attribute.
      * @see #equals
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    public boolean equals(Object obj) {

    /**
      * Determines whether obj is equal to this attribute.
      * Two attributes are equal if their attribute-ids, syntaxes
      * and values are equal.
      * If the attribute values are unordered, the order that the values were added
      * are irrelevant. If the attribute values are ordered, then the
      * order the values must match.
      * If obj is null or not an Attribute, false is returned.
      *<p>
      * By default <tt>Object.equals()</tt> is used when comparing the attribute
      * id and its values except when a value is an array. For an array,
      * each element of the array is checked using <tt>Object.equals()</tt>.
      * A subclass may override this to make
      * use of schema syntax information and matching rules,
      * which define what it means for two attributes to be equal.
      * How and whether a subclass makes
      * use of the schema information is determined by the subclass.
      * If a subclass overrides <tt>equals()</tt>, it should also override
      * <tt>hashCode()</tt>
      * such that two attributes that are equal have the same hash code.
      *
      * @param obj      The possibly null object to check.
      * @return true if obj is equal to this attribute; false otherwise.
      * @see #hashCode
      * @see #contains
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    protected boolean ordered = false;

    /**
     * A flag for recording whether this attribute's values are ordered.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
    protected transient Vector<Object> values;

    /**
     * Holds the attribute's values. Initialized by public constructors.
     * Cannot be null unless methods in BasicAttribute that use
     * values have been overridden.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/BasicAttribute.java
public class BasicAttribute implements Attribute {

/**
  * This class provides a basic implementation of the <tt>Attribute</tt> interface.
  *<p>
  * This implementation does not support the schema methods
  * <tt>getAttributeDefinition()</tt> and <tt>getAttributeSyntaxDefinition()</tt>.
  * They simply throw <tt>OperationNotSupportedException</tt>.
  * Subclasses of <tt>BasicAttribute</tt> should override these methods if they
  * support them.
  *<p>
  * The <tt>BasicAttribute</tt> class by default uses <tt>Object.equals()</tt> to
  * determine equality of attribute values when testing for equality or
  * when searching for values, <em>except</em> when the value is an array.
  * For an array, each element of the array is checked using <tt>Object.equals()</tt>.
  * Subclasses of <tt>BasicAttribute</tt> can make use of schema information
  * when doing similar equality checks by overriding methods
  * in which such use of schema is meaningful.
  * Similarly, the <tt>BasicAttribute</tt> class by default returns the values passed to its
  * constructor and/or manipulated using the add/remove methods.
  * Subclasses of <tt>BasicAttribute</tt> can override <tt>get()</tt> and <tt>getAll()</tt>
  * to get the values dynamically from the directory (or implement
  * the <tt>Attribute</tt> interface directly instead of subclassing <tt>BasicAttribute</tt>).
  *<p>
  * Note that updates to <tt>BasicAttribute</tt> (such as adding or removing a value)
  * does not affect the corresponding representation of the attribute
  * in the directory.  Updates to the directory can only be effected
  * using operations in the <tt>DirContext</tt> interface.
  *<p>
  * A <tt>BasicAttribute</tt> instance is not synchronized against concurrent
  * multithreaded access. Multiple threads trying to access and modify a
  * <tt>BasicAttribute</tt> should lock the object.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
