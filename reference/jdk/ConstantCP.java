_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final void setNameAndTypeIndex(int name_and_type_index) {

  /**
   * @param name_and_type_index points to Constant_NameAndType
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public String getClass(ConstantPool cp) {

  /**
   * @return Class this field belongs to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final void setClassIndex(int class_index) {

  /**
   * @param class_index points to Constant_class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final int getNameAndTypeIndex() { return name_and_type_index; }

  /**
   * @return Reference (index) to signature of the field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final int getClassIndex()       { return class_index; }

  /**
   * @return Reference (index) to class this field or method belongs to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump constant field reference to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  protected ConstantCP(byte tag, int class_index,
                       int name_and_type_index) {

  /**
   * @param class_index Reference to the class containing the field
   * @param name_and_type_index and the field signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  ConstantCP(byte tag, DataInputStream file) throws IOException

  /**
   * Initialize instance from file data.
   *
   * @param tag  Constant type tag
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public ConstantCP(ConstantCP c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
public abstract class ConstantCP extends Constant {

/**
 * Abstract super class for Fieldref and Methodref constants.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     ConstantFieldref
 * @see     ConstantMethodref
 * @see     ConstantInterfaceMethodref
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final void setNameAndTypeIndex(int name_and_type_index) {

  /**
   * @param name_and_type_index points to Constant_NameAndType
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public String getClass(ConstantPool cp) {

  /**
   * @return Class this field belongs to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final void setClassIndex(int class_index) {

  /**
   * @param class_index points to Constant_class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final int getNameAndTypeIndex() { return name_and_type_index; }

  /**
   * @return Reference (index) to signature of the field.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final int getClassIndex()       { return class_index; }

  /**
   * @return Reference (index) to class this field or method belongs to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump constant field reference to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  protected ConstantCP(byte tag, int class_index,
                       int name_and_type_index) {

  /**
   * @param class_index Reference to the class containing the field
   * @param name_and_type_index and the field signature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  ConstantCP(byte tag, DataInputStream file) throws IOException

  /**
   * Initialize instance from file data.
   *
   * @param tag  Constant type tag
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
  public ConstantCP(ConstantCP c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ConstantCP.java
public abstract class ConstantCP extends Constant {

/**
 * Abstract super class for Fieldref and Methodref constants.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     ConstantFieldref
 * @see     ConstantMethodref
 * @see     ConstantInterfaceMethodref
 */
