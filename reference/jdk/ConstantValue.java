_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public final String toString() {

  /**
   * @return String representation of constant value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public final void setConstantValueIndex(int constantvalue_index) {

  /**
   * @param constantvalue_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public final int getConstantValueIndex() { return constantvalue_index; }

  /**
   * @return Index in constant pool of constant value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump constant value attribute to file stream on binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public void accept(Visitor v) {

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public ConstantValue(int name_index, int length,
                       int constantvalue_index,
                       ConstantPool constant_pool)

  /**
   * @param name_index Name index in constant pool
   * @param length Content length in bytes
   * @param constantvalue_index Index in constant pool
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  ConstantValue(int name_index, int length, DataInputStream file,
                ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Name index in constant pool
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throw IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public ConstantValue(ConstantValue c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
public final class ConstantValue extends Attribute {

/**
 * This class is derived from <em>Attribute</em> and represents a constant
 * value, i.e., a default value for initializing a class field.
 * This class is instantiated by the <em>Attribute.readAttribute()</em> method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public final String toString() {

  /**
   * @return String representation of constant value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public final void setConstantValueIndex(int constantvalue_index) {

  /**
   * @param constantvalue_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public final int getConstantValueIndex() { return constantvalue_index; }

  /**
   * @return Index in constant pool of constant value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump constant value attribute to file stream on binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public void accept(Visitor v) {

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public ConstantValue(int name_index, int length,
                       int constantvalue_index,
                       ConstantPool constant_pool)

  /**
   * @param name_index Name index in constant pool
   * @param length Content length in bytes
   * @param constantvalue_index Index in constant pool
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  ConstantValue(int name_index, int length, DataInputStream file,
                ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Name index in constant pool
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throw IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
  public ConstantValue(ConstantValue c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantValue.java
public final class ConstantValue extends Attribute {

/**
 * This class is derived from <em>Attribute</em> and represents a constant
 * value, i.e., a default value for initializing a class field.
 * This class is instantiated by the <em>Attribute.readAttribute()</em> method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 */
