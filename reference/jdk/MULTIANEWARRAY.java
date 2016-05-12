_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public int consumeStack(ConstantPoolGen cpg) { return dimensions; }

  /**
   * Also works for instructions whose stack effect depends on the
   * constant pool entry they reference.
   * @return Number of words consumed from stack by this instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public String toString(ConstantPool cp) {

  /**
   * @return mnemonic for instruction with symbolic references resolved
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public String toString(boolean verbose) {

  /**
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public final short getDimensions() { return dimensions; }

  /**
   * @return number of dimensions to be created
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  protected void initFromFile(ByteSequence bytes, boolean wide)

  /**
   * Read needed data (i.e., no. dimension) from file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  MULTIANEWARRAY() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
public class MULTIANEWARRAY extends CPInstruction implements LoadClass, AllocationInstruction, ExceptionThrower {

/**
 * MULTIANEWARRAY - Create new mutidimensional array of references
 * <PRE>Stack: ..., count1, [count2, ...] -&gt; ..., arrayref</PRE>
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public int consumeStack(ConstantPoolGen cpg) { return dimensions; }

  /**
   * Also works for instructions whose stack effect depends on the
   * constant pool entry they reference.
   * @return Number of words consumed from stack by this instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public String toString(ConstantPool cp) {

  /**
   * @return mnemonic for instruction with symbolic references resolved
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public String toString(boolean verbose) {

  /**
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public final short getDimensions() { return dimensions; }

  /**
   * @return number of dimensions to be created
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  protected void initFromFile(ByteSequence bytes, boolean wide)

  /**
   * Read needed data (i.e., no. dimension) from file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
  MULTIANEWARRAY() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MULTIANEWARRAY.java
public class MULTIANEWARRAY extends CPInstruction implements LoadClass, AllocationInstruction, ExceptionThrower {

/**
 * MULTIANEWARRAY - Create new mutidimensional array of references
 * <PRE>Stack: ..., count1, [count2, ...] -&gt; ..., arrayref</PRE>
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
