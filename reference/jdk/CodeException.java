_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public CodeException copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final String toString(ConstantPool cp, boolean verbose) {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void setStartPC(int start_pc) {

  /**
   * @param start_pc start of handled block
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void setHandlerPC(int handler_pc) {

  /**
   * @param handler_pc where the actual code is
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void setEndPC(int end_pc) {

  /**
   * @param end_pc end of handled block
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void setCatchType(int catch_type) {

  /**
   * @param catch_type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final int getStartPC() { return start_pc; }

  /**
   * @return Inclusive start index of the region where the handler is active.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final int getHandlerPC() { return handler_pc; }

  /**
   * @return Starting address of exception handler, relative to the code.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final int getEndPC() { return end_pc; }

  /**
   * @return Exclusive end index of the region where the handler is active.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final int getCatchType() { return catch_type; }

  /**
   * @return 0, if the handler catches any exception, otherwise it points to
   * the exception class which is to be caught.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump code exception to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public CodeException(int start_pc, int end_pc, int handler_pc,
                       int catch_type)

  /**
   * @param start_pc Range in the code the exception handler is active,
   * start_pc is inclusive while
   * @param end_pc is exclusive
   * @param handler_pc Starting address of exception handler, i.e.,
   * an offset from start of code.
   * @param catch_type If zero the handler catches any
   * exception, otherwise it points to the exception class which is
   * to be caught.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  CodeException(DataInputStream file) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public CodeException(CodeException c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
public final class CodeException

/**
 * This class represents an entry in the exception table of the <em>Code</em>
 * attribute and is used only there. It contains a range in which a
 * particular exception handler is active.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Code
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public CodeException copy() {

  /**
   * @return deep copy of this object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final String toString(ConstantPool cp, boolean verbose) {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final String toString() {

  /**
   * @return String representation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void setStartPC(int start_pc) {

  /**
   * @param start_pc start of handled block
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void setHandlerPC(int handler_pc) {

  /**
   * @param handler_pc where the actual code is
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void setEndPC(int end_pc) {

  /**
   * @param end_pc end of handled block
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void setCatchType(int catch_type) {

  /**
   * @param catch_type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final int getStartPC() { return start_pc; }

  /**
   * @return Inclusive start index of the region where the handler is active.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final int getHandlerPC() { return handler_pc; }

  /**
   * @return Starting address of exception handler, relative to the code.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final int getEndPC() { return end_pc; }

  /**
   * @return Exclusive end index of the region where the handler is active.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final int getCatchType() { return catch_type; }

  /**
   * @return 0, if the handler catches any exception, otherwise it points to
   * the exception class which is to be caught.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public final void dump(DataOutputStream file) throws IOException

  /**
   * Dump code exception to file stream in binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public CodeException(int start_pc, int end_pc, int handler_pc,
                       int catch_type)

  /**
   * @param start_pc Range in the code the exception handler is active,
   * start_pc is inclusive while
   * @param end_pc is exclusive
   * @param handler_pc Starting address of exception handler, i.e.,
   * an offset from start of code.
   * @param catch_type If zero the handler catches any
   * exception, otherwise it points to the exception class which is
   * to be caught.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  CodeException(DataInputStream file) throws IOException

  /**
   * Construct object from file stream.
   * @param file Input stream
   * @throws IOException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
  public CodeException(CodeException c) {

  /**
   * Initialize from another object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/classfile/CodeException.java
public final class CodeException

/**
 * This class represents an entry in the exception table of the <em>Code</em>
 * attribute and is used only there. It contains a range in which a
 * particular exception handler is active.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Code
 */
