_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public String toString() {

  /**
   * @return attribute name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public abstract Attribute copy(ConstantPool constant_pool);

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public Object clone() {

  /**
   * Use copy() if you want to have a deep copy(), i.e., with all references
   * copied correctly.
   *
   * @return shallow copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   * @see ConstantPool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   * @see ConstantPool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final byte  getTag()       { return tag; }

  /**
   * @return Tag of attribute, i.e., its type. Value may not be altered, thus
   * there is no setTag() method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final int getNameIndex() { return name_index; }

  /**
   * @return Name index in constant pool of attribute name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final void setNameIndex(int name_index) {

  /**
   * @param name_index of attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final void setLength(int length) {

  /**
   * @param Attribute length in bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final int   getLength()    { return length; }

  /**
   * @return Length of attribute field in bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public static void removeAttributeReader(String name) {

  /** Remove attribute reader
   *
   * @param name the name of the attribute as stored in the class file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public static void addAttributeReader(String name, AttributeReader r) {

  /** Add an Attribute reader capable of parsing (user-defined) attributes
   * named "name". You should not add readers for the standard attributes
   * such as "LineNumberTable", because those are handled internally.
   *
   * @param name the name of the attribute as stored in the class file
   * @param r the reader object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public void dump(DataOutputStream file) throws IOException

  /**
   * Dump attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public abstract void accept(Visitor v);

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
public abstract class Attribute implements Cloneable, Node, Serializable {

/**
 * Abstract super class for <em>Attribute</em> objects. Currently the
 * <em>ConstantValue</em>, <em>SourceFile</em>, <em>Code</em>,
 * <em>Exceptiontable</em>, <em>LineNumberTable</em>,
 * <em>LocalVariableTable</em>, <em>InnerClasses</em> and
 * <em>Synthetic</em> attributes are supported. The
 * <em>Unknown</em> attribute stands for non-standard-attributes.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     ConstantValue
 * @see     SourceFile
 * @see     Code
 * @see     Unknown
 * @see     ExceptionTable
 * @see     LineNumberTable
 * @see     LocalVariableTable
 * @see     InnerClasses
 * @see     Synthetic
 * @see     Deprecated
 * @see     Signature
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Attribute.java
final class Attribute extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public String toString() {

  /**
   * @return attribute name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public abstract Attribute copy(ConstantPool constant_pool);

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public Object clone() {

  /**
   * Use copy() if you want to have a deep copy(), i.e., with all references
   * copied correctly.
   *
   * @return shallow copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   * @see ConstantPool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   * @see ConstantPool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final byte  getTag()       { return tag; }

  /**
   * @return Tag of attribute, i.e., its type. Value may not be altered, thus
   * there is no setTag() method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final int getNameIndex() { return name_index; }

  /**
   * @return Name index in constant pool of attribute name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final void setNameIndex(int name_index) {

  /**
   * @param name_index of attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final void setLength(int length) {

  /**
   * @param Attribute length in bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public final int   getLength()    { return length; }

  /**
   * @return Length of attribute field in bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public static void removeAttributeReader(String name) {

  /** Remove attribute reader
   *
   * @param name the name of the attribute as stored in the class file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public static void addAttributeReader(String name, AttributeReader r) {

  /** Add an Attribute reader capable of parsing (user-defined) attributes
   * named "name". You should not add readers for the standard attributes
   * such as "LineNumberTable", because those are handled internally.
   *
   * @param name the name of the attribute as stored in the class file
   * @param r the reader object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public void dump(DataOutputStream file) throws IOException

  /**
   * Dump attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
  public abstract void accept(Visitor v);

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Attribute.java
public abstract class Attribute implements Cloneable, Node, Serializable {

/**
 * Abstract super class for <em>Attribute</em> objects. Currently the
 * <em>ConstantValue</em>, <em>SourceFile</em>, <em>Code</em>,
 * <em>Exceptiontable</em>, <em>LineNumberTable</em>,
 * <em>LocalVariableTable</em>, <em>InnerClasses</em> and
 * <em>Synthetic</em> attributes are supported. The
 * <em>Unknown</em> attribute stands for non-standard-attributes.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     ConstantValue
 * @see     SourceFile
 * @see     Code
 * @see     Unknown
 * @see     ExceptionTable
 * @see     LineNumberTable
 * @see     LocalVariableTable
 * @see     InnerClasses
 * @see     Synthetic
 * @see     Deprecated
 * @see     Signature
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Attribute.java
final class Attribute extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Attribute.java
    public String toString() {

    /**
     * Returns a String object representing this Attribute's value. The format of this
     * string is not specified, but users can expect that two Attributes return the
     * same string if and only if they are equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Attribute.java
    public int hashCode() {

    /**
     * Returns a hash code value for this attribute.
     *
     * @return a hash code value for this attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Attribute.java
    public boolean equals(Object object)  {

    /**
     * Compares the current Attribute Object with another Attribute Object.
     *
     * @param object  The Attribute that the current Attribute is to be compared with.
     *
     * @return  True if the two Attribute objects are equal, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Attribute.java
    public Object getValue()  {

    /**
     * Returns an Object that is the value of this attribute.
     *
     * @return the value of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Attribute.java
    public String getName()  {

    /**
     * Returns a String containing the  name of the attribute.
     *
     * @return the name of the attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Attribute.java
    public Attribute(String name, Object value) {

    /**
     * Constructs an Attribute object which associates the given attribute name with the given value.
     *
     * @param name A String containing the name of the attribute to be created. Cannot be null.
     * @param value The Object which is assigned to the attribute. This object must be of the same type as the attribute.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Attribute.java
    private Object value= null;

    /**
     * @serial Attribute value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Attribute.java
    private String name;

    /**
     * @serial Attribute name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/Attribute.java
public class Attribute implements Serializable   {

/**
 * Represents an MBean attribute by associating its name with its value.
 * The MBean server and other objects use this class to get and set attributes values.
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    static final long serialVersionUID = 8707690322213556804L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    Object set(int ix, Object attrVal);

    /**
     * Sets an attribute value in the ordered list of attribute values.
     * This method sets the value at the <tt>ix</tt> index of the list of
     * attribute values to be <tt>attrVal</tt>. The old value is removed.
     * If the attribute values are unordered,
     * this method sets the value that happens to be at that index
     * to <tt>attrVal</tt>, unless <tt>attrVal</tt> is already one of the values.
     * In that case, <tt>IllegalStateException</tt> is thrown.
     *
     * @param ix The index of the value in the ordered list of attribute values.
     * {@code 0 <= ix < size()}.
     * @param attrVal The possibly null attribute value to use.
     * If null, 'null' replaces the old value.
     * @return The possibly null attribute value at index ix that was replaced.
     *   Null if the attribute value was null.
     * @exception IndexOutOfBoundsException If <tt>ix</tt> is outside the specified range.
     * @exception IllegalStateException If <tt>attrVal</tt> already exists and the
     *    attribute values are unordered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    void add(int ix, Object attrVal);

    /**
     * Adds an attribute value to the ordered list of attribute values.
     * This method adds <tt>attrVal</tt> to the list of attribute values at
     * index <tt>ix</tt>.
     * Values located at indices at or greater than <tt>ix</tt> are
     * shifted down towards the end of the list (and their indices incremented
     * by one).
     * If the attribute values are unordered and already have <tt>attrVal</tt>,
     * <tt>IllegalStateException</tt> is thrown.
     *
     * @param ix The index in the ordered list of attribute values to add the new value.
     * {@code 0 <= ix <= size()}.
     * @param attrVal The possibly null attribute value to add; if null, null is
     * the value added.
     * @exception IndexOutOfBoundsException If <tt>ix</tt> is outside the specified range.
     * @exception IllegalStateException If the attribute values are unordered and
     * <tt>attrVal</tt> is one of those values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    Object remove(int ix);

    /**
     * Removes an attribute value from the ordered list of attribute values.
     * This method removes the value at the <tt>ix</tt> index of the list of
     * attribute values.
     * If the attribute values are unordered,
     * this method removes the value that happens to be at that index.
     * Values located at indices greater than <tt>ix</tt> are shifted up towards
     * the front of the list (and their indices decremented by one).
     *
     * @param ix The index of the value to remove.
     * {@code 0 <= ix < size()}.
     * @return The possibly null attribute value at index <tt>ix</tt> that was removed;
     *   null if the attribute value is null.
     * @exception IndexOutOfBoundsException If <tt>ix</tt> is outside the specified range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    Object get(int ix) throws NamingException;

    /**
     * Retrieves the attribute value from the ordered list of attribute values.
     * This method returns the value at the <tt>ix</tt> index of the list of
     * attribute values.
     * If the attribute values are unordered,
     * this method returns the value that happens to be at that index.
     * @param ix The index of the value in the ordered list of attribute values.
     * {@code 0 <= ix < size()}.
     * @return The possibly null attribute value at index <tt>ix</tt>;
     *   null if the attribute value is null.
     * @exception NamingException If a naming exception was encountered while
     * retrieving the value.
     * @exception IndexOutOfBoundsException If <tt>ix</tt> is outside the specified range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    boolean isOrdered();

    /**
      * Determines whether this attribute's values are ordered.
      * If an attribute's values are ordered, duplicate values are allowed.
      * If an attribute's values are unordered, they are presented
      * in any order and there are no duplicate values.
      * @return true if this attribute's values are ordered; false otherwise.
      * @see #get(int)
      * @see #remove(int)
      * @see #add(int, java.lang.Object)
      * @see #set(int, java.lang.Object)
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    Object clone();

    /**
      * Makes a copy of the attribute.
      * The copy contains the same attribute values as the original attribute:
      * the attribute values are not themselves cloned.
      * Changes to the copy will not affect the original and vice versa.
      *
      * @return A non-null copy of the attribute.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    DirContext getAttributeDefinition() throws NamingException;

    /**
      * Retrieves the attribute's schema definition.
      * An attribute's schema definition contains information
      * such as whether the attribute is multivalued or single-valued,
      * the matching rules to use when comparing the attribute's values.
      *
      * The information that you can retrieve from an attribute definition
      * is directory-dependent.
      *
      *<p>
      * If an implementation does not support schemas, it should throw
      * OperationNotSupportedException. If an implementation does support
      * schemas, it should define this method to return the appropriate
      * information.
      * @return This attribute's schema definition. Null if the implementation
      *     supports schemas but this particular attribute does not have
      *     any schema information.
      * @exception OperationNotSupportedException If getting the schema
      *         is not supported.
      * @exception NamingException If a naming exception occurs while getting
      *         the schema.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    DirContext getAttributeSyntaxDefinition() throws NamingException;

    /**
      * Retrieves the syntax definition associated with the attribute.
      * An attribute's syntax definition specifies the format
      * of the attribute's value(s). Note that this is different from
      * the attribute value's representation as a Java object. Syntax
      * definition refers to the directory's notion of <em>syntax</em>.
      *<p>
      * For example, even though a value might be
      * a Java String object, its directory syntax might be "Printable String"
      * or "Telephone Number". Or a value might be a byte array, and its
      * directory syntax is "JPEG" or "Certificate".
      * For example, if this attribute's syntax is "JPEG",
      * this method would return the syntax definition for "JPEG".
      * <p>
      * The information that you can retrieve from a syntax definition
      * is directory-dependent.
      *<p>
      * If an implementation does not support schemas, it should throw
      * OperationNotSupportedException. If an implementation does support
      * schemas, it should define this method to return the appropriate
      * information.
      * @return The attribute's syntax definition. Null if the implementation
      *    supports schemas but this particular attribute does not have
      *    any schema information.
      * @exception OperationNotSupportedException If getting the schema
      *         is not supported.
      * @exception NamingException If a naming exception occurs while getting
      *         the schema.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    void clear();

    /**
      * Removes all values from this attribute.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    boolean remove(Object attrval);

    /**
      * Removes a specified value from the attribute.
      * If <tt>attrval</tt> is not in the attribute, this method does nothing.
      * If the attribute values are ordered, the first occurrence of
      * <tt>attrVal</tt> is removed and attribute values at indices greater
      * than the removed
      * value are shifted up towards the head of the list (and their indices
      * decremented by one).
      *<p>
      * Equality is determined by the implementation, which may use
      * <tt>Object.equals()</tt> or schema information to determine equality.
      *
      * @param attrval The possibly null value to remove from this attribute.
      * If null, remove the attribute value that is null.
      * @return true if the value was removed; false otherwise.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    boolean contains(Object attrVal);

    /**
      * Determines whether a value is in the attribute.
      * Equality is determined by the implementation, which may use
      * <tt>Object.equals()</tt> or schema information to determine equality.
      *
      * @param attrVal The possibly null value to check. If null, check
      *  whether the attribute has an attribute value whose value is null.
      * @return true if attrVal is one of this attribute's values; false otherwise.
      * @see java.lang.Object#equals
      * @see BasicAttribute#equals
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    String getID();

    /**
      * Retrieves the id of this attribute.
      *
      * @return The id of this attribute. It cannot be null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    int size();

    /**
      * Retrieves the number of values in this attribute.
      *
      * @return The nonnegative number of values in this attribute.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
    Object get() throws NamingException;

    /**
      * Retrieves one of this attribute's values.
      * If the attribute has more than one value and is unordered, any one of
      * the values is returned.
      * If the attribute has more than one value and is ordered, the
      * first value is returned.
      *
      * @return A possibly null object representing one of
      *        the attribute's value. It is null if the attribute's value
      *        is null.
      * @exception NamingException
      *         If a naming exception was encountered while retrieving
      *         the value.
      * @exception java.util.NoSuchElementException
      *         If this attribute has no values.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/Attribute.java
public interface Attribute extends Cloneable, java.io.Serializable {

/**
  * This interface represents an attribute associated with a named object.
  *<p>
  * In a directory, named objects can have associated with them
  * attributes.  The <tt>Attribute</tt> interface represents an attribute associated
  * with a named object.  An attribute contains 0 or more, possibly null, values.
  * The attribute values can be ordered or unordered (see <tt>isOrdered()</tt>).
  * If the values are unordered, no duplicates are allowed.
  * If the values are ordered, duplicates are allowed.
  *<p>
  * The content and representation of an attribute and its values is defined by
  * the attribute's <em>schema</em>. The schema contains information
  * about the attribute's syntax and other properties about the attribute.
  * See <tt>getAttributeDefinition()</tt> and
  * <tt>getAttributeSyntaxDefinition()</tt>
  * for details regarding how to get schema information about an attribute
  * if the underlying directory service supports schemas.
  *<p>
  * Equality of two attributes is determined by the implementation class.
  * A simple implementation can use <tt>Object.equals()</tt> to determine equality
  * of attribute values, while a more sophisticated implementation might
  * make use of schema information to determine equality.
  * Similarly, one implementation might provide a static storage
  * structure which simply returns the values passed to its
  * constructor, while another implementation might define <tt>get()</tt> and
  * <tt>getAll()</tt>.
  * to get the values dynamically from the directory.
  *<p>
  * Note that updates to <tt>Attribute</tt> (such as adding or removing a
  * value) do not affect the corresponding representation of the attribute
  * in the directory.  Updates to the directory can only be effected
  * using operations in the <tt>DirContext</tt> interface.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see BasicAttribute
  * @since 1.3
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/Attribute.java
  public String getName();

  /**
   * Get the name of the category of which this attribute value is an
   * instance.
   * <P>
   * <I>Note:</I> This method is intended to provide a default, nonlocalized
   * string for the attribute's category. If two attribute objects return the
   * same category from the <CODE>getCategory()</CODE> method, they should
   * return the same name from the <CODE>getName()</CODE> method.
   *
   * @return  Attribute category name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/Attribute.java
  public Class<? extends Attribute> getCategory();

  /**
   * Get the printing attribute class which is to be used as the "category"
   * for this printing attribute value when it is added to an attribute set.
   *
   * @return  Printing attribute class (category), an instance of class
   *          {@link java.lang.Class java.lang.Class}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/Attribute.java
public interface Attribute extends Serializable {

/**
 * Interface Attribute is the base interface implemented by any and every
 * printing attribute class to indicate that the class represents a
 * printing attribute. All printing attributes are serializable.
 * <P>
 *
 * @author  David Mendenhall
 * @author  Alan Kaminsky
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Attribute.java
  public boolean isSpecified();

  /**
   * A flag indicating whether this attribute was actually
   * specified in the start-tag of its element, or was defaulted from the schema.
   * @return returns true if this was specified in the start element
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Attribute.java
  public String getDTDType();

  /**
   * Gets the type of this attribute, default is
   * the String "CDATA"
   * @return the type as a String, default is "CDATA"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Attribute.java
  public String getValue();

  /**
   * Gets the normalized value of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Attribute.java
  QName getName();

  /**
   * Returns the QName for this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/Attribute.java
public interface Attribute extends XMLEvent {

/**
 * An interface that contains information about an attribute.  Attributes are reported
 * as a set of events accessible from a StartElement.  Other applications may report
 * Attributes as first-order events, for example as the results of an XPath expression.
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @see StartElement
 * @since 1.6
 */
