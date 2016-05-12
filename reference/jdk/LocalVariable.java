_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public LocalVariable copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final String toString() {

  /**
   * @return string representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setStartPC(int start_pc) {

  /**
   * @param start_pc Specify range where the local variable is valid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setIndex(int index) { this.index = index; }

  /**
   * @param index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setSignatureIndex(int signature_index) {

  /**
   * @param signature_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setNameIndex(int name_index) {

  /**
   * @param name_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setLength(int length) {

  /**
   * @param length.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getStartPC()        { return start_pc; }

  /**
   * @return Start of range where he variable is valid
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getIndex()           { return index; }

  /**
   * @return index of register where variable is stored
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getSignatureIndex() { return signature_index; }

  /**
   * @return Index in constant pool of variable signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final String getSignature() {

  /**
   * @return Signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getNameIndex()      { return name_index; }

  /**
   * @return Index in constant pool of variable name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final String getName() {

  /**
   * @return Variable name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getLength()         { return length; }

  /**
   * @return Variable is valid within getStartPC() .. getStartPC()+getLength()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump local variable to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public LocalVariable(int start_pc, int length, int name_index,
                       int signature_index, int index,
                       ConstantPool constant_pool)

  /**
   * @param start_pc Range in which the variable
   * @param length ... is valid
   * @param name_index Index in constant pool of variable name
   * @param signature_index Index of variable's signature
   * @param index Variable is `index'th local variable on the method's frame
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  LocalVariable(DataInputStream file, ConstantPool constant_pool)

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public LocalVariable(LocalVariable c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use copy() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
public final class LocalVariable

/**
 * This class represents a local variable within a method. It contains its
 * scope, name, signature and index on the method's frame.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     LocalVariableTable
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public LocalVariable copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final String toString() {

  /**
   * @return string representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setStartPC(int start_pc) {

  /**
   * @param start_pc Specify range where the local variable is valid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setIndex(int index) { this.index = index; }

  /**
   * @param index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setSignatureIndex(int signature_index) {

  /**
   * @param signature_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setNameIndex(int name_index) {

  /**
   * @param name_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setLength(int length) {

  /**
   * @param length.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void setConstantPool(ConstantPool constant_pool) {

  /**
   * @param constant_pool Constant pool to be used for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getStartPC()        { return start_pc; }

  /**
   * @return Start of range where he variable is valid
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getIndex()           { return index; }

  /**
   * @return index of register where variable is stored
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getSignatureIndex() { return signature_index; }

  /**
   * @return Index in constant pool of variable signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final String getSignature() {

  /**
   * @return Signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getNameIndex()      { return name_index; }

  /**
   * @return Index in constant pool of variable name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final String getName() {

  /**
   * @return Variable name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final int getLength()         { return length; }

  /**
   * @return Variable is valid within getStartPC() .. getStartPC()+getLength()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final ConstantPool getConstantPool() { return constant_pool; }

  /**
   * @return Constant pool used by this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump local variable to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public LocalVariable(int start_pc, int length, int name_index,
                       int signature_index, int index,
                       ConstantPool constant_pool)

  /**
   * @param start_pc Range in which the variable
   * @param length ... is valid
   * @param name_index Index in constant pool of variable name
   * @param signature_index Index of variable's signature
   * @param index Variable is `index'th local variable on the method's frame
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  LocalVariable(DataInputStream file, ConstantPool constant_pool)

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
  public LocalVariable(LocalVariable c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use copy() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LocalVariable.java
public final class LocalVariable

/**
 * This class represents a local variable within a method. It contains its
 * scope, name, signature and index on the method's frame.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     LocalVariableTable
 */
