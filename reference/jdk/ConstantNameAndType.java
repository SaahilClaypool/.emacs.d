_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final void setSignatureIndex(int signature_index) {

  /**
   * @param signature_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final void setNameIndex(int name_index) {

  /**
   * @param name_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final String getSignature(ConstantPool cp) {

  /** @return signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final int getSignatureIndex() { return signature_index; }

  /**
   * @return Index in constant pool of field/method signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final String getName(ConstantPool cp) {

  /** @return name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final int getNameIndex()      { return name_index; }

  /**
   * @return Name index in constant pool of field/method name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump name and signature index to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public ConstantNameAndType(int name_index,
                             int signature_index)

  /**
   * @param name_index Name of field/method
   * @param signature_index and its signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  ConstantNameAndType(DataInputStream file) throws IOException

  /**
   * Initialize instance from file data.
   *
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public ConstantNameAndType(ConstantNameAndType c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
public final class ConstantNameAndType extends Constant {

/**
 * This class is derived from the abstract
 * <A HREF="com.sun.org.apache.bcel.internal.classfile.Constant.html">Constant</A> class
 * and represents a reference to the name and signature
 * of a field or method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Constant
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final void setSignatureIndex(int signature_index) {

  /**
   * @param signature_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final void setNameIndex(int name_index) {

  /**
   * @param name_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final String getSignature(ConstantPool cp) {

  /** @return signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final int getSignatureIndex() { return signature_index; }

  /**
   * @return Index in constant pool of field/method signature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final String getName(ConstantPool cp) {

  /** @return name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final int getNameIndex()      { return name_index; }

  /**
   * @return Name index in constant pool of field/method name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump name and signature index to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public ConstantNameAndType(int name_index,
                             int signature_index)

  /**
   * @param name_index Name of field/method
   * @param signature_index and its signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  ConstantNameAndType(DataInputStream file) throws IOException

  /**
   * Initialize instance from file data.
   *
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
  public ConstantNameAndType(ConstantNameAndType c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantNameAndType.java
public final class ConstantNameAndType extends Constant {

/**
 * This class is derived from the abstract
 * <A HREF="com.sun.org.apache.bcel.internal.classfile.Constant.html">Constant</A> class
 * and represents a reference to the name and signature
 * of a field or method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Constant
 */
