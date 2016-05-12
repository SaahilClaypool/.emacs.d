_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  public InstructionHandle[] getTargets() { return targets; }

  /**
   * @return array of match targets
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  public int[] getIndices() { return indices; }

  /**
   * @return array of match target offsets
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  public int[] getMatchs() { return match; }

  /**
   * @return array of match indices
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * Inform targets that they're not targeted anymore.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * @return true, if ih is target of this instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * @param old_ih old target
   * @param new_ih new target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  public final void setTarget(int i, InstructionHandle target) {

  /**
   * Set branch target for `i'th case
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * Read needed data (e.g. index) from file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * Since this is a variable length instruction, it may shift the following
   * instructions which then need to update their position.
   *
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  Select(short opcode, int[] match, InstructionHandle[] targets,
         InstructionHandle target) {

  /**
   * (Match, target) pairs for switch.
   * `Match' and `targets' must have the same length of course.
   *
   * @param match array of matching values
   * @param targets instruction targets
   * @param target default instruction target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  Select() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
public abstract class Select extends BranchInstruction

/**
 * Select - Abstract super class for LOOKUPSWITCH and TABLESWITCH instructions.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see LOOKUPSWITCH
 * @see TABLESWITCH
 * @see InstructionList
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  public InstructionHandle[] getTargets() { return targets; }

  /**
   * @return array of match targets
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  public int[] getIndices() { return indices; }

  /**
   * @return array of match target offsets
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  public int[] getMatchs() { return match; }

  /**
   * @return array of match indices
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * Inform targets that they're not targeted anymore.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * @return true, if ih is target of this instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * @param old_ih old target
   * @param new_ih new target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  public final void setTarget(int i, InstructionHandle target) {

  /**
   * Set branch target for `i'th case
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * Read needed data (e.g. index) from file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  @Override

  /**
   * Since this is a variable length instruction, it may shift the following
   * instructions which then need to update their position.
   *
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  Select(short opcode, int[] match, InstructionHandle[] targets,
         InstructionHandle target) {

  /**
   * (Match, target) pairs for switch.
   * `Match' and `targets' must have the same length of course.
   *
   * @param match array of matching values
   * @param targets instruction targets
   * @param target default instruction target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
  Select() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/Select.java
public abstract class Select extends BranchInstruction

/**
 * Select - Abstract super class for LOOKUPSWITCH and TABLESWITCH instructions.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see LOOKUPSWITCH
 * @see TABLESWITCH
 * @see InstructionList
 */
