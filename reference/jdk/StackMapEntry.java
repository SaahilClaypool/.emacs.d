_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public StackMapEntry copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump stack map entry
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  StackMapEntry(DataInputStream file, ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
public final class StackMapEntry implements Cloneable {

/**
 * This class represents a stack map entry recording the types of
 * local variables and the the of stack items at a given byte code offset.
 * See CLDC specification 5.3.1.2
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     StackMap
 * @see     StackMapType
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public StackMapEntry copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump stack map entry
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
  StackMapEntry(DataInputStream file, ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapEntry.java
public final class StackMapEntry implements Cloneable {

/**
 * This class represents a stack map entry recording the types of
 * local variables and the the of stack items at a given byte code offset.
 * See CLDC specification 5.3.1.2
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     StackMap
 * @see     StackMapType
 */
