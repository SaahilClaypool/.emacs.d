_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public LineNumber copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final void setStartPC(int start_pc) {

  /**
   * @param start_pc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final void setLineNumber(int line_number) {

  /**
   * @param line_number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final int getStartPC() { return start_pc; }

  /**
   * @return PC in code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final int getLineNumber() { return line_number; }

  /**
   * @return Corresponding source line
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump line number/pc pair to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public LineNumber(int start_pc, int line_number)

  /**
   * @param start_pc Program Counter (PC) corresponds to
   * @param line_number line number in source file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  LineNumber(DataInputStream file) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public LineNumber(LineNumber c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
public final class LineNumber implements Cloneable, Node, Serializable {

/**
 * This class represents a (PC offset, line number) pair, i.e., a line number in
 * the source that corresponds to a relative address in the byte code. This
 * is used for debugging purposes.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     LineNumberTable
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public LineNumber copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final String toString() {

  /**
   * @return String representation
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final void setStartPC(int start_pc) {

  /**
   * @param start_pc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final void setLineNumber(int line_number) {

  /**
   * @param line_number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final int getStartPC() { return start_pc; }

  /**
   * @return PC in code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final int getLineNumber() { return line_number; }

  /**
   * @return Corresponding source line
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump line number/pc pair to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public LineNumber(int start_pc, int line_number)

  /**
   * @param start_pc Program Counter (PC) corresponds to
   * @param line_number line number in source file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  LineNumber(DataInputStream file) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
  public LineNumber(LineNumber c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/LineNumber.java
public final class LineNumber implements Cloneable, Node, Serializable {

/**
 * This class represents a (PC offset, line number) pair, i.e., a line number in
 * the source that corresponds to a relative address in the byte code. This
 * is used for debugging purposes.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     LineNumberTable
 */
