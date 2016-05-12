_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public boolean equals(Object that) {

  /** Check for equality, delegated to comparator
   * @return true if that is an Instruction and has the same opcode
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public static void setComparator(InstructionComparator c) { cmp = c; }

  /** Set comparator to be used for equals().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public static InstructionComparator getComparator() { return cmp; }

  /** Get Comparator object used in the equals() method to determine
   * equality of instructions.
   *
   * @return currently used comparator for equals()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public abstract void accept(Visitor v);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  void dispose() {}

  /** Some instructions may be reused, so don't do anything by default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  private void setOpcode(short opcode) { this.opcode = opcode; }

  /**
   * Needed in readInstruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public int getLength()   { return length; }

  /**
   * @return length (in bytes) of instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public short getOpcode()    { return opcode; }

  /**
   * @return this instructions opcode
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public int produceStack(ConstantPoolGen cpg) {

  /**
   * This method also gives right results for instructions whose
   * effect on the stack depends on the constant pool entry they
   * reference.
   * @return Number of words produced onto stack by this instruction,
   * or Constants.UNPREDICTABLE, if this can not be computed statically
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public int consumeStack(ConstantPoolGen cpg) {

  /**
   * This method also gives right results for instructions whose
   * effect on the stack depends on the constant pool entry they
   * reference.
   *  @return Number of words consumed from stack by this instruction,
   * or Constants.UNPREDICTABLE, if this can not be computed statically
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public static final Instruction readInstruction(ByteSequence bytes)

  /**
   * Read an instruction from (byte code) input stream and return the
   * appropiate object.
   *
   * @param file file to read from
   * @return instruction object being read
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  protected void initFromFile(ByteSequence bytes, boolean wide)

  /**
   * Read needed data (e.g. index) from file.
   *
   * @param bytes byte sequence to read from
   * @param wide "wide" instruction flag
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public Instruction copy() {

  /**
   * Use with caution, since `BranchInstruction's have a `target' reference which
   * is not copied correctly (only basic types are). This also applies for
   * `Select' instructions with their multiple branch targets.
   *
   * @see BranchInstruction
   * @return (shallow) copy of an instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public String toString(ConstantPool cp) {

  /**
   * @return mnemonic for instruction with sumbolic references resolved
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public String toString() {

  /**
   * @return mnemonic for instruction in verbose format
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public String toString(boolean verbose) {

  /**
   * Long output format:
   *
   * &lt;name of opcode&gt; "["&lt;opcode number&gt;"]"
   * "("&lt;length of instruction&gt;")"
   *
   * @param verbose long/short format switch
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public String getName() {

  /** @return name of instruction, i.e., opcode name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  Instruction() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
public abstract class Instruction implements Cloneable, Serializable {

/**
 * Abstract super class for all Java byte codes.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Instruction.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate this node into JVM bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Instruction.java
abstract class Instruction extends SyntaxTreeNode {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public boolean equals(Object that) {

  /** Check for equality, delegated to comparator
   * @return true if that is an Instruction and has the same opcode
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public static void setComparator(InstructionComparator c) { cmp = c; }

  /** Set comparator to be used for equals().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public static InstructionComparator getComparator() { return cmp; }

  /** Get Comparator object used in the equals() method to determine
   * equality of instructions.
   *
   * @return currently used comparator for equals()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public abstract void accept(Visitor v);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  void dispose() {}

  /** Some instructions may be reused, so don't do anything by default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  private void setOpcode(short opcode) { this.opcode = opcode; }

  /**
   * Needed in readInstruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public int getLength()   { return length; }

  /**
   * @return length (in bytes) of instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public short getOpcode()    { return opcode; }

  /**
   * @return this instructions opcode
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public int produceStack(ConstantPoolGen cpg) {

  /**
   * This method also gives right results for instructions whose
   * effect on the stack depends on the constant pool entry they
   * reference.
   * @return Number of words produced onto stack by this instruction,
   * or Constants.UNPREDICTABLE, if this can not be computed statically
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public int consumeStack(ConstantPoolGen cpg) {

  /**
   * This method also gives right results for instructions whose
   * effect on the stack depends on the constant pool entry they
   * reference.
   *  @return Number of words consumed from stack by this instruction,
   * or Constants.UNPREDICTABLE, if this can not be computed statically
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public static final Instruction readInstruction(ByteSequence bytes)

  /**
   * Read an instruction from (byte code) input stream and return the
   * appropiate object.
   *
   * @param file file to read from
   * @return instruction object being read
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  protected void initFromFile(ByteSequence bytes, boolean wide)

  /**
   * Read needed data (e.g. index) from file.
   *
   * @param bytes byte sequence to read from
   * @param wide "wide" instruction flag
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public Instruction copy() {

  /**
   * Use with caution, since `BranchInstruction's have a `target' reference which
   * is not copied correctly (only basic types are). This also applies for
   * `Select' instructions with their multiple branch targets.
   *
   * @see BranchInstruction
   * @return (shallow) copy of an instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public String toString(ConstantPool cp) {

  /**
   * @return mnemonic for instruction with sumbolic references resolved
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public String toString() {

  /**
   * @return mnemonic for instruction in verbose format
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public String toString(boolean verbose) {

  /**
   * Long output format:
   *
   * &lt;name of opcode&gt; "["&lt;opcode number&gt;"]"
   * "("&lt;length of instruction&gt;")"
   *
   * @param verbose long/short format switch
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public String getName() {

  /** @return name of instruction, i.e., opcode name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
  Instruction() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Instruction.java
public abstract class Instruction implements Cloneable, Serializable {

/**
 * Abstract super class for all Java byte codes.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Instruction.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate this node into JVM bytecodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Instruction.java
abstract class Instruction extends SyntaxTreeNode {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
