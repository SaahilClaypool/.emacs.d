_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final String getPMGClassName() {

  /**
   * @return PMG class name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final String getPMGName() {

  /**
   * @return PMG name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final void setPMGIndex(int pmg_index) {

  /**
   * @param PMGClass_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final int getPMGIndex() { return pmg_index; }

  /**
   * @return Index in constant pool of source file name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final void setPMGClassIndex(int pmg_class_index) {

  /**
   * @param PMGClass_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final int getPMGClassIndex() { return pmg_class_index; }

  /**
   * @return Index in constant pool of source file name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump source file attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public PMGClass(int name_index, int length, int pmg_index, int pmg_class_index,
                  ConstantPool constant_pool)

  /**
   * @param name_index Index in constant pool to CONSTANT_Utf8
   * @param length Content length in bytes
   * @param constant_pool Array of constants
   * @param PMGClass_index Index in constant pool to CONSTANT_Utf8
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  PMGClass(int name_index, int length, DataInputStream file,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public PMGClass(PMGClass c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
public final class PMGClass extends Attribute {

/**
 * This class is derived from <em>Attribute</em> and represents a reference
 * to a <a href="http://www.inf.fu-berlin.de/~bokowski/pmgjava/index.html">PMG</a>
 * attribute.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final String getPMGClassName() {

  /**
   * @return PMG class name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final String getPMGName() {

  /**
   * @return PMG name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final void setPMGIndex(int pmg_index) {

  /**
   * @param PMGClass_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final int getPMGIndex() { return pmg_index; }

  /**
   * @return Index in constant pool of source file name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final void setPMGClassIndex(int pmg_class_index) {

  /**
   * @param PMGClass_index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final int getPMGClassIndex() { return pmg_class_index; }

  /**
   * @return Index in constant pool of source file name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump source file attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public PMGClass(int name_index, int length, int pmg_index, int pmg_class_index,
                  ConstantPool constant_pool)

  /**
   * @param name_index Index in constant pool to CONSTANT_Utf8
   * @param length Content length in bytes
   * @param constant_pool Array of constants
   * @param PMGClass_index Index in constant pool to CONSTANT_Utf8
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  PMGClass(int name_index, int length, DataInputStream file,
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
  public PMGClass(PMGClass c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/PMGClass.java
public final class PMGClass extends Attribute {

/**
 * This class is derived from <em>Attribute</em> and represents a reference
 * to a <a href="http://www.inf.fu-berlin.de/~bokowski/pmgjava/index.html">PMG</a>
 * attribute.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 */
