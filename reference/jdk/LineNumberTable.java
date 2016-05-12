_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public int getSourceLine(int pos) {

  /**
   * Map byte code positions to source code lines.
   *
   * @param pos byte code offset
   * @return corresponding line in source code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public final void setLineNumberTable(LineNumber[] line_number_table) {

  /**
   * @param line_number_table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public final LineNumber[] getLineNumberTable() { return line_number_table; }

  /**
   * @return Array of (pc offset, line number) pairs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump line number table attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  LineNumberTable(int name_index, int length, DataInputStream file,
                  ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Index of name
   * @param length Content length in bytes
   * @param file Input stream
   * @throws IOException
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
public final class LineNumberTable extends Attribute {

/**
 * This class represents a table of line numbers for debugging
 * purposes. This attribute is used by the <em>Code</em> attribute. It
 * contains pairs of PCs and line numbers.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Code
 * @see LineNumber
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public Attribute copy(ConstantPool constant_pool) {

  /**
   * @return deep copy of this attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public int getSourceLine(int pos) {

  /**
   * Map byte code positions to source code lines.
   *
   * @param pos byte code offset
   * @return corresponding line in source code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public final void setLineNumberTable(LineNumber[] line_number_table) {

  /**
   * @param line_number_table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public final LineNumber[] getLineNumberTable() { return line_number_table; }

  /**
   * @return Array of (pc offset, line number) pairs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump line number table attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
  LineNumberTable(int name_index, int length, DataInputStream file,
                  ConstantPool constant_pool) throws IOException

  /**
   * Construct object from file stream.
   * @param name_index Index of name
   * @param length Content length in bytes
   * @param file Input stream
   * @throws IOException
   * @param constant_pool Array of constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumberTable.java
public final class LineNumberTable extends Attribute {

/**
 * This class represents a table of line numbers for debugging
 * purposes. This attribute is used by the <em>Code</em> attribute. It
 * contains pairs of PCs and line numbers.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Code
 * @see LineNumber
 */
