_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public final void setBytes(byte[] bytes) {

  /**
   * @param bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public final byte[] getBytes() { return bytes; }

  /**
   * @return data bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump source file attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  Synthetic(int name_index, int length, DataInputStream file,
            ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Index in constant pool to CONSTANT_Utf8
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public Synthetic(int name_index, int length, byte[] bytes,
                   ConstantPool constant_pool)

  /**
   * @param name_index Index in constant pool to CONSTANT_Utf8, which
   * should represent the string "Synthetic".
   * @param length Content length in bytes - should be zero.
   * @param bytes Attribute contents
   * @param constant_pool The constant pool this attribute is associated
   * with.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public Synthetic(Synthetic c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use copy() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
public final class Synthetic extends Attribute {

/**
 * This class is derived from <em>Attribute</em> and declares this class as
 * `synthetic', i.e., it needs special handling.  The JVM specification
 * states "A class member that does not appear in the source code must be
 * marked using a Synthetic attribute."  It may appear in the ClassFile
 * attribute table, a field_info table or a method_info table.  This class
 * is intended to be instantiated from the
 * <em>Attribute.readAttribute()</em> method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public final void setBytes(byte[] bytes) {

  /**
   * @param bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public final byte[] getBytes() { return bytes; }

  /**
   * @return data bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump source file attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  Synthetic(int name_index, int length, DataInputStream file,
            ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Index in constant pool to CONSTANT_Utf8
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public Synthetic(int name_index, int length, byte[] bytes,
                   ConstantPool constant_pool)

  /**
   * @param name_index Index in constant pool to CONSTANT_Utf8, which
   * should represent the string "Synthetic".
   * @param length Content length in bytes - should be zero.
   * @param bytes Attribute contents
   * @param constant_pool The constant pool this attribute is associated
   * with.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
  public Synthetic(Synthetic c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use copy() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Synthetic.java
public final class Synthetic extends Attribute {

/**
 * This class is derived from <em>Attribute</em> and declares this class as
 * `synthetic', i.e., it needs special handling.  The JVM specification
 * states "A class member that does not appear in the source code must be
 * marked using a Synthetic attribute."  It may appear in the ClassFile
 * attribute table, a field_info table or a method_info table.  This class
 * is intended to be instantiated from the
 * <em>Attribute.readAttribute()</em> method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 */
