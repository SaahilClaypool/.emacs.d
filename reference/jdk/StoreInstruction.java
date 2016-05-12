_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/StoreInstruction.java
  public void accept(Visitor v) {

  /**
   * Call corresponding visitor method(s). The order is:
   * Call visitor methods of implemented interfaces first, then
   * call methods according to the class hierarchy in descending order,
   * i.e., the most specific visitXXX() call comes last.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/StoreInstruction.java
  protected StoreInstruction(short opcode, short c_tag, int n) {

  /**
   * @param opcode Instruction opcode
   * @param c_tag Instruction number for compact version, ASTORE_0, e.g.
   * @param n local variable index (unsigned short)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/StoreInstruction.java
  StoreInstruction(short canon_tag, short c_tag) {

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   * tag and length are defined in readInstruction and initFromFile, respectively.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/StoreInstruction.java
public abstract class StoreInstruction extends LocalVariableInstruction

/**
 * Denotes an unparameterized instruction to store a value into a local variable,
 * e.g. ISTORE.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/StoreInstruction.java
  public void accept(Visitor v) {

  /**
   * Call corresponding visitor method(s). The order is:
   * Call visitor methods of implemented interfaces first, then
   * call methods according to the class hierarchy in descending order,
   * i.e., the most specific visitXXX() call comes last.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/StoreInstruction.java
  protected StoreInstruction(short opcode, short c_tag, int n) {

  /**
   * @param opcode Instruction opcode
   * @param c_tag Instruction number for compact version, ASTORE_0, e.g.
   * @param n local variable index (unsigned short)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/StoreInstruction.java
  StoreInstruction(short canon_tag, short c_tag) {

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   * tag and length are defined in readInstruction and initFromFile, respectively.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/StoreInstruction.java
public abstract class StoreInstruction extends LocalVariableInstruction

/**
 * Denotes an unparameterized instruction to store a value into a local variable,
 * e.g. ISTORE.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
