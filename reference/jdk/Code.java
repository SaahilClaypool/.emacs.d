_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final String toString() {

  /**
   * @return String representation of code chunk.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final String toString(boolean verbose) {

  /**
   * @return String representation of code chunk.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setMaxStack(int max_stack) {

  /**
   * @param max_stack maximum stack size
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setMaxLocals(int max_locals) {

  /**
   * @param max_locals maximum number of local variables
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setExceptionTable(CodeException[] exception_table) {

  /**
   * @param exception_table exception table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setCode(byte[] code) {

  /**
   * @param code byte code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setAttributes(Attribute[] attributes) {

  /**
   * @param attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  private final int calculateLength() {

  /**
   * @return the full size of this code attribute, minus its first 6 bytes,
   * including the size of all its contained attributes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  private final int getInternalLength() {

  /**
   * @return the internal length of this code attribute (minus the first 6 bytes)
   * and excluding all its attributes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final int  getMaxStack()  { return max_stack; }

  /**
   * @return Maximum size of stack used by this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final int  getMaxLocals() { return max_locals; }

  /**
   * @return Number of local variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final CodeException[] getExceptionTable() { return exception_table; }

  /**
   * @return Table of handled exceptions.
   * @see CodeException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final byte[] getCode()      { return code; }

  /**
   * @return Actual byte code of the method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public LocalVariableTable getLocalVariableTable() {

  /**
   * @return LocalVariableTable of Code, if it has one
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public LineNumberTable getLineNumberTable() {

  /**
   * @return LineNumberTable of Code, if it has one
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final Attribute[] getAttributes()         { return attributes; }

  /**
   * @return Collection of code attributes.
   * @see Attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump code attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public Code(int name_index, int length,
              int max_stack,  int max_locals,
              byte[]          code,
              CodeException[] exception_table,
              Attribute[]     attributes,
              ConstantPool    constant_pool)

  /**
   * @param name_index Index pointing to the name <em>Code</em>
   * @param length Content length in bytes
   * @param max_stack Maximum size of stack
   * @param max_locals Number of local variables
   * @param code Actual byte code
   * @param exception_table Table of handled exceptions
   * @param attributes Attributes of code: LineNumber or LocalVariable
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  Code(int name_index, int length, DataInputStream file,
       ConstantPool constant_pool) throws IOException

  /**
   * @param name_index Index pointing to the name <em>Code</em>
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public Code(Code c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use copy() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
public final class Code extends Attribute {

/**
 * This class represents a chunk of Java byte code contained in a
 * method. It is instantiated by the
 * <em>Attribute.readAttribute()</em> method. A <em>Code</em>
 * attribute contains informations about operand stack, local
 * variables, byte code and the exceptions handled within this
 * method.
 *
 * This attribute has attributes itself, namely <em>LineNumberTable</em> which
 * is used for debugging purposes and <em>LocalVariableTable</em> which
 * contains information about the local variables.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 * @see     CodeException
 * @see     LineNumberTable
 * @see LocalVariableTable
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final String toString() {

  /**
   * @return String representation of code chunk.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final String toString(boolean verbose) {

  /**
   * @return String representation of code chunk.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setMaxStack(int max_stack) {

  /**
   * @param max_stack maximum stack size
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setMaxLocals(int max_locals) {

  /**
   * @param max_locals maximum number of local variables
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setExceptionTable(CodeException[] exception_table) {

  /**
   * @param exception_table exception table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setCode(byte[] code) {

  /**
   * @param code byte code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void setAttributes(Attribute[] attributes) {

  /**
   * @param attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  private final int calculateLength() {

  /**
   * @return the full size of this code attribute, minus its first 6 bytes,
   * including the size of all its contained attributes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  private final int getInternalLength() {

  /**
   * @return the internal length of this code attribute (minus the first 6 bytes)
   * and excluding all its attributes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final int  getMaxStack()  { return max_stack; }

  /**
   * @return Maximum size of stack used by this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final int  getMaxLocals() { return max_locals; }

  /**
   * @return Number of local variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final CodeException[] getExceptionTable() { return exception_table; }

  /**
   * @return Table of handled exceptions.
   * @see CodeException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final byte[] getCode()      { return code; }

  /**
   * @return Actual byte code of the method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public LocalVariableTable getLocalVariableTable() {

  /**
   * @return LocalVariableTable of Code, if it has one
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public LineNumberTable getLineNumberTable() {

  /**
   * @return LineNumberTable of Code, if it has one
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final Attribute[] getAttributes()         { return attributes; }

  /**
   * @return Collection of code attributes.
   * @see Attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump code attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public Code(int name_index, int length,
              int max_stack,  int max_locals,
              byte[]          code,
              CodeException[] exception_table,
              Attribute[]     attributes,
              ConstantPool    constant_pool)

  /**
   * @param name_index Index pointing to the name <em>Code</em>
   * @param length Content length in bytes
   * @param max_stack Maximum size of stack
   * @param max_locals Number of local variables
   * @param code Actual byte code
   * @param exception_table Table of handled exceptions
   * @param attributes Attributes of code: LineNumber or LocalVariable
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  Code(int name_index, int length, DataInputStream file,
       ConstantPool constant_pool) throws IOException

  /**
   * @param name_index Index pointing to the name <em>Code</em>
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
  public Code(Code c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use copy() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/Code.java
public final class Code extends Attribute {

/**
 * This class represents a chunk of Java byte code contained in a
 * method. It is instantiated by the
 * <em>Attribute.readAttribute()</em> method. A <em>Code</em>
 * attribute contains informations about operand stack, local
 * variables, byte code and the exceptions handled within this
 * method.
 *
 * This attribute has attributes itself, namely <em>LineNumberTable</em> which
 * is used for debugging purposes and <em>LocalVariableTable</em> which
 * contains information about the local variables.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Attribute
 * @see     CodeException
 * @see     LineNumberTable
 * @see LocalVariableTable
 */
