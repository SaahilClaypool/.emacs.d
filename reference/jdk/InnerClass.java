_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public InnerClass copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final String toString(ConstantPool constant_pool) {

  /**
   * @return Resolved string representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void setOuterClassIndex(int outer_class_index) {

  /**
   * @param outer_class_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void setInnerNameIndex(int inner_name_index) {

  /**
   * @param inner_name_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void setInnerClassIndex(int inner_class_index) {

  /**
   * @param inner_class_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void setInnerAccessFlags(int inner_access_flags) {

  /**
   * @param inner_access_flags.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final int getInnerNameIndex() { return inner_name_index; }

  /**
   * @return name index of inner class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final int getInnerAccessFlags() { return inner_access_flags; }

  /**
   * @return access flags of inner class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump inner class attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public InnerClass(int inner_class_index, int outer_class_index,
                    int inner_name_index, int inner_access_flags)

  /**
   * @param inner_class_index Class index in constant pool of inner class
   * @param outer_class_index Class index in constant pool of outer class
   * @param inner_name_index  Name index in constant pool of inner class
   * @param inner_access_flags Access flags of inner class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  InnerClass(DataInputStream file) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public InnerClass(InnerClass c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
public final class InnerClass implements Cloneable, Node {

/**
 * This class represents a inner class attribute, i.e., the class
 * indices of the inner and outer classes, the name and the attributes
 * of the inner class.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see InnerClasses
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public InnerClass copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final String toString(ConstantPool constant_pool) {

  /**
   * @return Resolved string representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void setOuterClassIndex(int outer_class_index) {

  /**
   * @param outer_class_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void setInnerNameIndex(int inner_name_index) {

  /**
   * @param inner_name_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void setInnerClassIndex(int inner_class_index) {

  /**
   * @param inner_class_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void setInnerAccessFlags(int inner_access_flags) {

  /**
   * @param inner_access_flags.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final int getInnerNameIndex() { return inner_name_index; }

  /**
   * @return name index of inner class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final int getInnerAccessFlags() { return inner_access_flags; }

  /**
   * @return access flags of inner class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump inner class attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public InnerClass(int inner_class_index, int outer_class_index,
                    int inner_name_index, int inner_access_flags)

  /**
   * @param inner_class_index Class index in constant pool of inner class
   * @param outer_class_index Class index in constant pool of outer class
   * @param inner_name_index  Name index in constant pool of inner class
   * @param inner_access_flags Access flags of inner class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  InnerClass(DataInputStream file) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
  public InnerClass(InnerClass c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/InnerClass.java
public final class InnerClass implements Cloneable, Node {

/**
 * This class represents a inner class attribute, i.e., the class
 * indices of the inner and outer classes, the name and the attributes
 * of the inner class.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see InnerClasses
 */
