_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final String toString() {

  /**
   * @return String representation, i.e., a list of thrown exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final void setExceptionIndexTable(int[] exception_index_table) {

  /**
   * @param exception_index_table.
   * Also redefines number_of_exceptions according to table length.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final String[] getExceptionNames() {

  /**
   * @return class names of thrown exceptions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final int[] getExceptionIndexTable() {return exception_index_table;}

  /**
   * @return Array of indices into constant pool of thrown exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump exceptions attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  ExceptionTable(int name_index, int length, DataInputStream file,
                 ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Index in constant pool
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public ExceptionTable(int        name_index, int length,
                        int[]      exception_index_table,
                        ConstantPool constant_pool)

  /**
   * @param name_index Index in constant pool
   * @param length Content length in bytes
   * @param exception_index_table Table of indices in constant pool
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public ExceptionTable(ExceptionTable c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use copy() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
public final class ExceptionTable extends Attribute {

/**
 * This class represents the table of exceptions that are thrown by a
 * method. This attribute may be used once per method.  The name of
 * this class is <em>ExceptionTable</em> for historical reasons; The
 * Java Virtual Machine Specification, Second Edition defines this
 * attribute using the name <em>Exceptions</em> (which is inconsistent
 * with the other classes).
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Code
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final String toString() {

  /**
   * @return String representation, i.e., a list of thrown exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final void setExceptionIndexTable(int[] exception_index_table) {

  /**
   * @param exception_index_table.
   * Also redefines number_of_exceptions according to table length.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final String[] getExceptionNames() {

  /**
   * @return class names of thrown exceptions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final int[] getExceptionIndexTable() {return exception_index_table;}

  /**
   * @return Array of indices into constant pool of thrown exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump exceptions attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  ExceptionTable(int name_index, int length, DataInputStream file,
                 ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Index in constant pool
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public ExceptionTable(int        name_index, int length,
                        int[]      exception_index_table,
                        ConstantPool constant_pool)

  /**
   * @param name_index Index in constant pool
   * @param length Content length in bytes
   * @param exception_index_table Table of indices in constant pool
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
  public ExceptionTable(ExceptionTable c) {

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use copy() for a physical copy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/ExceptionTable.java
public final class ExceptionTable extends Attribute {

/**
 * This class represents the table of exceptions that are thrown by a
 * method. This attribute may be used once per method.  The name of
 * this class is <em>ExceptionTable</em> for historical reasons; The
 * Java Virtual Machine Specification, Second Edition defines this
 * attribute using the name <em>Exceptions</em> (which is inconsistent
 * with the other classes).
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Code
 */
