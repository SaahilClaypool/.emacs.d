_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * Inform target that it's not targeted anymore.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * @return true, if ih is target of this instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * @param old_ih old target
   * @param new_ih new target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  static void notifyTargetChanged(InstructionHandle new_ih,
                                 InstructionTargeter t) {

  /**
   * Used by BranchInstruction, LocalVariableGen, CodeExceptionGen.
   * Must be called after the target is actually changed in the
   * InstructionTargeter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  static void notifyTargetChanging(InstructionHandle old_ih,
                                 InstructionTargeter t) {

  /**
   * Used by BranchInstruction, LocalVariableGen, CodeExceptionGen.
   * Must be called before the target is actually changed in the
   * InstructionTargeter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  public final void setTarget(InstructionHandle target) {

  /**
   * Set branch target
   * @param target branch target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  public InstructionHandle getTarget() { return target; }

  /**
   * @return target of branch instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  public final int getIndex() { return index; }

  /**
   * @return target offset in byte code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * Read needed data (e.g. index) from file. Conversion to a InstructionHandle
   * is done in InstructionList(byte[]).
   *
   * @param bytes input stream
   * @param wide wide prefix?
   * @see InstructionList
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * Long output format:
   *
   * &lt;position in byte code&gt;
   * &lt;name of opcode&gt; "["&lt;opcode number&gt;"]"
   * "("&lt;length of instruction&gt;")"
   * "&lt;"&lt;target instruction&gt;"&gt;" "@"&lt;branch target offset&gt;
   *
   * @param verbose long/short format switch
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  protected int updatePosition(int offset, int max_offset) {

  /**
   * Called by InstructionList.setPositions when setting the position for every
   * instruction. In the presence of variable length instructions `setPositions'
   * performs multiple passes over the instruction list to calculate the
   * correct (byte) positions and offsets by calling this function.
   *
   * @param offset additional offset caused by preceding (variable length) instructions
   * @param max_offset the maximum offset that may be caused by these instructions
   * @return additional offset caused by possible change of this instruction's length
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  protected int getTargetOffset() { return getTargetOffset(target); }

  /**
   * @return the offset to this instruction's target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  protected int getTargetOffset(InstructionHandle target) {

  /**
   * @param target branch target
   * @return the offset to  `target' relative to this instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  protected BranchInstruction(short opcode, InstructionHandle target) {

  /** Common super constructor
   * @param opcodee Instruction opcode
   * @param target instruction to branch to
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  BranchInstruction() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
public abstract class BranchInstruction extends Instruction implements InstructionTargeter {

/**
 * Abstract super class for branching instructions like GOTO, IFEQ, etc..
 * Branch instructions may have a variable length, namely GOTO, JSR,
 * LOOKUPSWITCH and TABLESWITCH.
 *
 * @see InstructionList
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * Inform target that it's not targeted anymore.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * @return true, if ih is target of this instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * @param old_ih old target
   * @param new_ih new target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  static void notifyTargetChanged(InstructionHandle new_ih,
                                 InstructionTargeter t) {

  /**
   * Used by BranchInstruction, LocalVariableGen, CodeExceptionGen.
   * Must be called after the target is actually changed in the
   * InstructionTargeter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  static void notifyTargetChanging(InstructionHandle old_ih,
                                 InstructionTargeter t) {

  /**
   * Used by BranchInstruction, LocalVariableGen, CodeExceptionGen.
   * Must be called before the target is actually changed in the
   * InstructionTargeter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  public final void setTarget(InstructionHandle target) {

  /**
   * Set branch target
   * @param target branch target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  public InstructionHandle getTarget() { return target; }

  /**
   * @return target of branch instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  public final int getIndex() { return index; }

  /**
   * @return target offset in byte code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * Read needed data (e.g. index) from file. Conversion to a InstructionHandle
   * is done in InstructionList(byte[]).
   *
   * @param bytes input stream
   * @param wide wide prefix?
   * @see InstructionList
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * Long output format:
   *
   * &lt;position in byte code&gt;
   * &lt;name of opcode&gt; "["&lt;opcode number&gt;"]"
   * "("&lt;length of instruction&gt;")"
   * "&lt;"&lt;target instruction&gt;"&gt;" "@"&lt;branch target offset&gt;
   *
   * @param verbose long/short format switch
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  protected int updatePosition(int offset, int max_offset) {

  /**
   * Called by InstructionList.setPositions when setting the position for every
   * instruction. In the presence of variable length instructions `setPositions'
   * performs multiple passes over the instruction list to calculate the
   * correct (byte) positions and offsets by calling this function.
   *
   * @param offset additional offset caused by preceding (variable length) instructions
   * @param max_offset the maximum offset that may be caused by these instructions
   * @return additional offset caused by possible change of this instruction's length
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  protected int getTargetOffset() { return getTargetOffset(target); }

  /**
   * @return the offset to this instruction's target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  protected int getTargetOffset(InstructionHandle target) {

  /**
   * @param target branch target
   * @return the offset to  `target' relative to this instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  @Override

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  protected BranchInstruction(short opcode, InstructionHandle target) {

  /** Common super constructor
   * @param opcodee Instruction opcode
   * @param target instruction to branch to
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
  BranchInstruction() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchInstruction.java
public abstract class BranchInstruction extends Instruction implements InstructionTargeter {

/**
 * Abstract super class for branching instructions like GOTO, IFEQ, etc..
 * Branch instructions may have a variable length, namely GOTO, JSR,
 * LOOKUPSWITCH and TABLESWITCH.
 *
 * @see InstructionList
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
