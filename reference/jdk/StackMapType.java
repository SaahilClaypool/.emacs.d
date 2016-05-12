_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public StackMapType copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final boolean hasIndex() {

  /** @return true, if type is either ITEM_Object or ITEM_NewObject
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump type entries to file.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public int  getIndex()      { return index; }

  /** @return index to constant pool if type == ITEM_Object, or offset
   * in byte code, if type == ITEM_NewObject, and -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public StackMapType(byte type, int index, ConstantPool constant_pool) {

  /**
   * @param type type tag as defined in the Constants interface
   * @param index index to constant pool, or byte code offset
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  StackMapType(DataInputStream file, ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
public final class StackMapType implements Cloneable {

/**
 * This class represents the type of a local variable or item on stack
 * used in the StackMap entries.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     StackMapEntry
 * @see     StackMap
 * @see     Constants
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public StackMapType copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final boolean hasIndex() {

  /** @return true, if type is either ITEM_Object or ITEM_NewObject
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump type entries to file.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public int  getIndex()      { return index; }

  /** @return index to constant pool if type == ITEM_Object, or offset
   * in byte code, if type == ITEM_NewObject, and -1 otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  public StackMapType(byte type, int index, ConstantPool constant_pool) {

  /**
   * @param type type tag as defined in the Constants interface
   * @param index index to constant pool, or byte code offset
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
  StackMapType(DataInputStream file, ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/StackMapType.java
public final class StackMapType implements Cloneable {

/**
 * This class represents the type of a local variable or item on stack
 * used in the StackMap entries.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     StackMapEntry
 * @see     StackMap
 * @see     Constants
 */
