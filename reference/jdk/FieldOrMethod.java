_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  protected FieldOrMethod copy_(ConstantPool constant_pool) {

  /**
   * @return deep copy of this field
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final String getSignature() {

  /**
   * @return String representation of object's type signature (java style)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final String getName() {

  /**
   * @return Name of object, i.e., method name or field name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void setSignatureIndex(int signature_index) {

  /**
   * @param signature_index Index in constant pool of field signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final int getSignatureIndex() { return signature_index; }

  /**
   * @return Index in constant pool of field signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void setNameIndex(int name_index) {

  /**
   * @param name_index Index in constant pool of object's name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final int getNameIndex() { return name_index; }

  /**
   * @return Index in constant pool of object's name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void setAttributes(Attribute[] attributes) {

  /**
   * @param attributes Collection of object attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final Attribute[] getAttributes() { return attributes; }

  /**
   * @return Collection of object attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump object to file stream on binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  protected FieldOrMethod(int access_flags, int name_index, int signature_index,
                          Attribute[] attributes, ConstantPool constant_pool)

  /**
   * @param access_flags Access rights of method
   * @param name_index Points to field name in constant pool
   * @param signature_index Points to encoded signature
   * @param attributes Collection of attributes
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  protected FieldOrMethod(DataInputStream file, ConstantPool constant_pool)

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   * @throws ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  protected FieldOrMethod(FieldOrMethod c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
public abstract class FieldOrMethod extends AccessFlags implements Cloneable, Node {

/**
 * Abstract super class for fields and methods.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public ObjectType getLoadClassType(ConstantPoolGen cpg) {

  /** @return type of the referenced class/interface
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public ObjectType getClassType(ConstantPoolGen cpg) {

  /** @return type of the referenced class/interface
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public String getClassName(ConstantPoolGen cpg) {

  /** @return name of the referenced class/interface
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public String getName(ConstantPoolGen cpg) {

  /** @return name of referenced method/field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public String getSignature(ConstantPoolGen cpg) {

  /** @return signature of referenced method/field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  protected FieldOrMethod(short opcode, int index) {

  /**
   * @param index to constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
public abstract class FieldOrMethod extends CPInstruction implements LoadClass {

/**
 * Super class for InvokeInstruction and FieldInstruction, since they have
 * some methods in common!
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  protected FieldOrMethod copy_(ConstantPool constant_pool) {

  /**
   * @return deep copy of this field
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final String getSignature() {

  /**
   * @return String representation of object's type signature (java style)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final String getName() {

  /**
   * @return Name of object, i.e., method name or field name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void setSignatureIndex(int signature_index) {

  /**
   * @param signature_index Index in constant pool of field signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final int getSignatureIndex() { return signature_index; }

  /**
   * @return Index in constant pool of field signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void setNameIndex(int name_index) {

  /**
   * @param name_index Index in constant pool of object's name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final int getNameIndex() { return name_index; }

  /**
   * @return Index in constant pool of object's name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void setAttributes(Attribute[] attributes) {

  /**
   * @param attributes Collection of object attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final Attribute[] getAttributes() { return attributes; }

  /**
   * @return Collection of object attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump object to file stream on binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  protected FieldOrMethod(int access_flags, int name_index, int signature_index,
                          Attribute[] attributes, ConstantPool constant_pool)

  /**
   * @param access_flags Access rights of method
   * @param name_index Points to field name in constant pool
   * @param signature_index Points to encoded signature
   * @param attributes Collection of attributes
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  protected FieldOrMethod(DataInputStream file, ConstantPool constant_pool)

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   * @throws ClassFormatException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
  protected FieldOrMethod(FieldOrMethod c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/FieldOrMethod.java
public abstract class FieldOrMethod extends AccessFlags implements Cloneable, Node {

/**
 * Abstract super class for fields and methods.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public ObjectType getLoadClassType(ConstantPoolGen cpg) {

  /** @return type of the referenced class/interface
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public ObjectType getClassType(ConstantPoolGen cpg) {

  /** @return type of the referenced class/interface
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public String getClassName(ConstantPoolGen cpg) {

  /** @return name of the referenced class/interface
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public String getName(ConstantPoolGen cpg) {

  /** @return name of referenced method/field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  public String getSignature(ConstantPoolGen cpg) {

  /** @return signature of referenced method/field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
  protected FieldOrMethod(short opcode, int index) {

  /**
   * @param index to constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/FieldOrMethod.java
public abstract class FieldOrMethod extends CPInstruction implements LoadClass {

/**
 * Super class for InvokeInstruction and FieldInstruction, since they have
 * some methods in common!
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
