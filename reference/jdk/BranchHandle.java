_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  public void setInstruction(Instruction i) {

  /**
   * Set new contents. Old instruction is disposed and may not be used anymore.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  public InstructionHandle getTarget() {

  /**
   * @return target of instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  public void updateTarget(InstructionHandle old_ih, InstructionHandle new_ih) {

  /**
   * Update target of instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  public void setTarget(InstructionHandle ih) {

  /**
   * Pass new target to instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  protected void addHandle() {

  /** Handle adds itself to the list of resuable handles.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  private static BranchHandle bh_list = null; // List of reusable handles

  /** Factory methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
public final class BranchHandle extends InstructionHandle {

/**
 * BranchHandle is returned by specialized InstructionList.append() whenever a
 * BranchInstruction is appended. This is useful when the target of this
 * instruction is not known at time of creation and must be set later
 * via setTarget().
 *
 * @see InstructionHandle
 * @see Instruction
 * @see InstructionList
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  public void setInstruction(Instruction i) {

  /**
   * Set new contents. Old instruction is disposed and may not be used anymore.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  public InstructionHandle getTarget() {

  /**
   * @return target of instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  public void updateTarget(InstructionHandle old_ih, InstructionHandle new_ih) {

  /**
   * Update target of instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  public void setTarget(InstructionHandle ih) {

  /**
   * Pass new target to instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  protected void addHandle() {

  /** Handle adds itself to the list of resuable handles.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
  private static BranchHandle bh_list = null; // List of reusable handles

  /** Factory methods.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/BranchHandle.java
public final class BranchHandle extends InstructionHandle {

/**
 * BranchHandle is returned by specialized InstructionList.append() whenever a
 * BranchInstruction is appended. This is useful when the target of this
 * instruction is not known at time of creation and must be set later
 * via setTarget().
 *
 * @see InstructionHandle
 * @see Instruction
 * @see InstructionList
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
