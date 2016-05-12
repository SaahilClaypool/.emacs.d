_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void update() {

  /** Call notify() method on all observers. This method is not called
   * automatically whenever the state has changed, but has to be
   * called by the user after he has finished editing the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void removeObserver(InstructionListObserver o) {

  /** Remove observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void addObserver(InstructionListObserver o) {

  /** Add observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void redirectExceptionHandlers(CodeExceptionGen[] exceptions,
                                        InstructionHandle old_target,
                                        InstructionHandle new_target) {

  /**
   * Redirect all references of exception handlers from old_target to new_target.
   *
   * @param exceptions array of exception handlers
   * @param old_target the old target instruction handle
   * @param new_target the new target instruction handle
   * @see MethodGen
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void redirectLocalVariables(LocalVariableGen[] lg,
                                     InstructionHandle old_target,
                                     InstructionHandle new_target) {

  /**
   * Redirect all references of local variables from old_target to new_target.
   *
   * @param lg array of local variables
   * @param old_target the old target instruction handle
   * @param new_target the new target instruction handle
   * @see MethodGen
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void redirectBranches(InstructionHandle old_target,
                               InstructionHandle new_target) {

  /**
   * Redirect all references from old_target to new_target, i.e., update targets
   * of branch instructions.
   *
   * @param old_target the old target instruction handle
   * @param new_target the new target instruction handle
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public int size() { return length; }

  /**
   * @return length of list (Number of instructions, not bytes)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public int getLength() { return length; }

  /**
   * @return length of list (Number of instructions, not bytes)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle getEnd()   { return end; }

  /**
   * @return end of list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle getStart() { return start; }

  /**
   * @return start of list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void dispose() {

  /**
   * Delete contents of list. Provides besser memory utilization,
   * because the system then may reuse the instruction handles. This
   * method is typically called right after
   * <href="MethodGen.html#getMethod()">MethodGen.getMethod()</a>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void replaceConstantPool(ConstantPoolGen old_cp, ConstantPoolGen new_cp) {

  /** Replace all references to the old constant pool with references to the new
   *  constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList copy() {

  /**
   * @return complete, i.e., deep copy of this list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public int[] getInstructionPositions() { return byte_positions; }

  /**
   * Get positions (offsets) of all instructions in the list. This relies on that
   * the list has been freshly created from an byte code array, or that setPositions()
   * has been called. Otherwise this may be inaccurate.
   *
   * @return array containing all instruction's offset in byte code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle[] getInstructionHandles() {

  /**
   * @return array containing all instructions (handles)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public Iterator iterator() {

  /**
   * @return Enumeration that lists all instructions (handles)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public String toString(boolean verbose) {

  /**
   * @param verbose toggle output format
   * @return String containing all instructions in this list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public Instruction[] getInstructions() {

  /**
   * @return an array of instructions without target information for branch instructions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public byte[] getByteCode() {

  /**
   * When everything is finished, use this method to convert the instruction
   * list into an array of bytes.
   *
   * @return the byte code ready to be dumped
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void setPositions(boolean check) {

  /**
   * Give all instructions their position number (offset in byte stream), i.e.,
   * make the list ready to be dumped.
   *
   * @param check Perform sanity checks, e.g. if all targeted instructions really belong
   * to this list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private InstructionHandle findInstruction2(Instruction i) {

  /**
   * Search for given Instruction reference, start at end of list
   *
   * @param i instruction to search for
   * @return instruction found on success, null otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private InstructionHandle findInstruction1(Instruction i) {

  /**
   * Search for given Instruction reference, start at beginning of list.
   *
   * @param i instruction to search for
   * @return instruction found on success, null otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void delete(Instruction from, Instruction to) throws TargetLostException {

  /**
   * Remove instructions from instruction `from' to instruction `to' contained
   * in this list. The user must ensure that `from' is an instruction before
   * `to', or risk havoc. The corresponding Instruction handles must not be reused!
   *
   * @param from where to start deleting (inclusive)
   * @param to   where to end deleting (inclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void delete(InstructionHandle from, InstructionHandle to)

  /**
   * Remove instructions from instruction `from' to instruction `to' contained
   * in this list. The user must ensure that `from' is an instruction before
   * `to', or risk havoc. The corresponding Instruction handles must not be reused!
   *
   * @param from where to start deleting (inclusive)
   * @param to   where to end deleting (inclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void delete(Instruction i) throws TargetLostException {

  /**
   * Remove instruction from this list. The corresponding Instruction
   * handles must not be reused!
   *
   * @param i instruction to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void delete(InstructionHandle ih) throws TargetLostException {

  /**
   * Remove instruction from this list. The corresponding Instruction
   * handles must not be reused!
   *
   * @param ih instruction (handle) to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private void remove(InstructionHandle prev, InstructionHandle next)

  /**
   * Remove from instruction `prev' to instruction `next' both contained
   * in this list. Throws TargetLostException when one of the removed instruction handles
   * is still being targeted.
   *
   * @param prev where to start deleting (predecessor, exclusive)
   * @param next where to end deleting (successor, exclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void move(InstructionHandle ih, InstructionHandle target) {

  /**
   * Move a single instruction (handle) to a new location.
   *
   * @param ih     moved instruction
   * @param target new location of moved instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void move(InstructionHandle start, InstructionHandle end, InstructionHandle target) {

  /**
   * Take all instructions (handles) from "start" to "end" and append them after the
   * new location "target". Of course, "end" must be after "start" and target must
   * not be located withing this range. If you want to move something to the start of
   * the list use null as value for target.<br>
   * Any instruction targeters pointing to handles within the block, keep their targets.
   *
   * @param start  of moved block
   * @param end    of moved block
   * @param target of moved block
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public BranchHandle insert(InstructionHandle ih, BranchInstruction i) {

  /**
   * Insert an instruction before instruction (handle) ih contained in this list.
   *
   * @param ih where to insert to the instruction list
   * @param i Instruction to insert
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(InstructionHandle ih, CompoundInstruction c) {

  /**
   * Insert a compound instruction.
   *
   * @param ih where to insert the instruction list
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(InstructionHandle ih, Instruction i) {

  /**
   * Insert an instruction before instruction (handle) ih contained in this list.
   *
   * @param ih where to insert to the instruction list
   * @param i Instruction to insert
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(CompoundInstruction c) {

  /**
   * Insert a compound instruction.
   *
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(Instruction i, CompoundInstruction c) {

  /**
   * Insert a compound instruction before instruction i.
   *
   * @param i Instruction in list
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(Instruction i, Instruction j) {

  /**
   * Insert a single instruction j before another instruction i, which
   * must be in this list of course!
   *
   * @param i Instruction in list
   * @param j Instruction to insert before i in list
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public BranchHandle insert(BranchInstruction i) {

  /**
   * Insert a branch instruction at start of this list.
   *
   * @param i branch instruction to insert
   * @return branch instruction handle of the appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(Instruction i) {

  /**
   * Insert an instruction at start of this list.
   *
   * @param i instruction to insert
   * @return instruction handle of the inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(Instruction i, InstructionList il) {

  /**
   * Insert another list before Instruction i contained in this list.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param i  where to append the instruction list
   * @param il Instruction list to insert
   * @return instruction handle pointing to the first inserted instruction,
   * i.e., il.getStart()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private void insert(InstructionHandle ih) {

  /**
   * Insert an instruction at start of this list.
   *
   * @param ih instruction to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(InstructionList il) {

  /**
   * Insert another list.
   *
   * @param il list to insert before start of this list
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(InstructionHandle ih, InstructionList il) {

  /**
   * Insert another list before Instruction handle ih contained in this list.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param i  where to append the instruction list
   * @param il Instruction list to insert
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public BranchHandle append(InstructionHandle ih, BranchInstruction i) {

  /**
   * Append an instruction after instruction (handle) ih contained in this list.
   *
   * @param ih where to append the instruction list
   * @param i Instruction to append
   * @return instruction handle pointing to the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(InstructionHandle ih, Instruction i) {

  /**
   * Append an instruction after instruction (handle) ih contained in this list.
   *
   * @param ih where to append the instruction list
   * @param i Instruction to append
   * @return instruction handle pointing to the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(InstructionHandle ih, CompoundInstruction c) {

  /**
   * Append a compound instruction.
   *
   * @param ih where to append the instruction list
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(CompoundInstruction c) {

  /**
   * Append a compound instruction.
   *
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(Instruction i, CompoundInstruction c) {

  /**
   * Append a compound instruction, after instruction i.
   *
   * @param i Instruction in list
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(Instruction i, Instruction j) {

  /**
   * Append a single instruction j after another instruction i, which
   * must be in this list of course!
   *
   * @param i Instruction in list
   * @param j Instruction to append after i in list
   * @return instruction handle of the first appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public BranchHandle append(BranchInstruction i) {

  /**
   * Append a branch instruction to the end of this list.
   *
   * @param i branch instruction to append
   * @return branch instruction handle of the appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(Instruction i) {

  /**
   * Append an instruction to the end of this list.
   *
   * @param i instruction to append
   * @return instruction handle of the appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private void append(InstructionHandle ih) {

  /**
   * Append an instruction to the end of this list.
   *
   * @param ih instruction to append
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(InstructionList il) {

  /**
   * Append another list to this one.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param il list to append to end of this list
   * @return instruction handle of the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(Instruction i, InstructionList il) {

  /**
   * Append another list after instruction i contained in this list.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param i  where to append the instruction list
   * @param il Instruction list to append to this one
   * @return instruction handle pointing to the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(InstructionHandle ih, InstructionList il) {

  /**
   * Append another list after instruction (handle) ih contained in this list.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param ih where to append the instruction list
   * @param il Instruction list to append to this one
   * @return instruction handle pointing to the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList(byte[] code) {

  /**
   * Initialize instruction list from byte array.
   *
   * @param code byte array containing the instructions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle findHandle(int pos) {

  /**
   * Get instruction handle for instruction at byte code position pos.
   * This only works properly, if the list is freshly initialized from a byte array or
   * setPositions() has been called before this method.
   *
   * @param pos byte code position to search for
   * @return target position's instruction handle if available
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public static InstructionHandle findHandle(InstructionHandle[] ihs,
                                             int[] pos, int count,
                                             int target) {

  /**
   * Find the target instruction (handle) that corresponds to the given target
   * position (byte code offset).
   *
   * @param ihs array of instruction handles, i.e. il.getInstructionHandles()
   * @param pos array of positions corresponding to ihs, i.e. il.getInstructionPositions()
   * @param count length of arrays
   * @param target target position to search for
   * @return target position's instruction handle if available
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public boolean isEmpty() { return start == null; } // && end == null

  /**
   * Test for empty list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList(CompoundInstruction c) {

  /**
   * Initialize list with (nonnull) compound instruction. Consumes argument
   * list, i.e., it becomes empty.
   *
   * @param c compound instruction (list)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList(BranchInstruction i) {

  /**
   * Create instruction list containing one instruction.
   * @param i initial instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList(Instruction i) {

  /**
   * Create instruction list containing one instruction.
   * @param i initial instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList() {}

  /**
   * Create (empty) instruction list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
public class InstructionList implements Serializable {

/**
 * This class is a container for a list of <a
 * href="Instruction.html">Instruction</a> objects. Instructions can
 * be appended, inserted, moved, deleted, etc.. Instructions are being
 * wrapped into <a
 * href="InstructionHandle.html">InstructionHandles</a> objects that
 * are returned upon append/insert operations. They give the user
 * (read only) access to the list structure, such that it can be traversed and
 * manipulated in a controlled way.
 *
 * A list is finally dumped to a byte code array with <a
 * href="#getByteCode()">getByteCode</a>.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Instruction
 * @see     InstructionHandle
 * @see BranchHandle
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void update() {

  /** Call notify() method on all observers. This method is not called
   * automatically whenever the state has changed, but has to be
   * called by the user after he has finished editing the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void removeObserver(InstructionListObserver o) {

  /** Remove observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void addObserver(InstructionListObserver o) {

  /** Add observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void redirectExceptionHandlers(CodeExceptionGen[] exceptions,
                                        InstructionHandle old_target,
                                        InstructionHandle new_target) {

  /**
   * Redirect all references of exception handlers from old_target to new_target.
   *
   * @param exceptions array of exception handlers
   * @param old_target the old target instruction handle
   * @param new_target the new target instruction handle
   * @see MethodGen
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void redirectLocalVariables(LocalVariableGen[] lg,
                                     InstructionHandle old_target,
                                     InstructionHandle new_target) {

  /**
   * Redirect all references of local variables from old_target to new_target.
   *
   * @param lg array of local variables
   * @param old_target the old target instruction handle
   * @param new_target the new target instruction handle
   * @see MethodGen
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void redirectBranches(InstructionHandle old_target,
                               InstructionHandle new_target) {

  /**
   * Redirect all references from old_target to new_target, i.e., update targets
   * of branch instructions.
   *
   * @param old_target the old target instruction handle
   * @param new_target the new target instruction handle
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public int size() { return length; }

  /**
   * @return length of list (Number of instructions, not bytes)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public int getLength() { return length; }

  /**
   * @return length of list (Number of instructions, not bytes)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle getEnd()   { return end; }

  /**
   * @return end of list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle getStart() { return start; }

  /**
   * @return start of list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void dispose() {

  /**
   * Delete contents of list. Provides besser memory utilization,
   * because the system then may reuse the instruction handles. This
   * method is typically called right after
   * <href="MethodGen.html#getMethod()">MethodGen.getMethod()</a>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void replaceConstantPool(ConstantPoolGen old_cp, ConstantPoolGen new_cp) {

  /** Replace all references to the old constant pool with references to the new
   *  constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList copy() {

  /**
   * @return complete, i.e., deep copy of this list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public int[] getInstructionPositions() { return byte_positions; }

  /**
   * Get positions (offsets) of all instructions in the list. This relies on that
   * the list has been freshly created from an byte code array, or that setPositions()
   * has been called. Otherwise this may be inaccurate.
   *
   * @return array containing all instruction's offset in byte code
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle[] getInstructionHandles() {

  /**
   * @return array containing all instructions (handles)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public Iterator iterator() {

  /**
   * @return Enumeration that lists all instructions (handles)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public String toString(boolean verbose) {

  /**
   * @param verbose toggle output format
   * @return String containing all instructions in this list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public Instruction[] getInstructions() {

  /**
   * @return an array of instructions without target information for branch instructions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public byte[] getByteCode() {

  /**
   * When everything is finished, use this method to convert the instruction
   * list into an array of bytes.
   *
   * @return the byte code ready to be dumped
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void setPositions(boolean check) {

  /**
   * Give all instructions their position number (offset in byte stream), i.e.,
   * make the list ready to be dumped.
   *
   * @param check Perform sanity checks, e.g. if all targeted instructions really belong
   * to this list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private InstructionHandle findInstruction2(Instruction i) {

  /**
   * Search for given Instruction reference, start at end of list
   *
   * @param i instruction to search for
   * @return instruction found on success, null otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private InstructionHandle findInstruction1(Instruction i) {

  /**
   * Search for given Instruction reference, start at beginning of list.
   *
   * @param i instruction to search for
   * @return instruction found on success, null otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void delete(Instruction from, Instruction to) throws TargetLostException {

  /**
   * Remove instructions from instruction `from' to instruction `to' contained
   * in this list. The user must ensure that `from' is an instruction before
   * `to', or risk havoc. The corresponding Instruction handles must not be reused!
   *
   * @param from where to start deleting (inclusive)
   * @param to   where to end deleting (inclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void delete(InstructionHandle from, InstructionHandle to)

  /**
   * Remove instructions from instruction `from' to instruction `to' contained
   * in this list. The user must ensure that `from' is an instruction before
   * `to', or risk havoc. The corresponding Instruction handles must not be reused!
   *
   * @param from where to start deleting (inclusive)
   * @param to   where to end deleting (inclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void delete(Instruction i) throws TargetLostException {

  /**
   * Remove instruction from this list. The corresponding Instruction
   * handles must not be reused!
   *
   * @param i instruction to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void delete(InstructionHandle ih) throws TargetLostException {

  /**
   * Remove instruction from this list. The corresponding Instruction
   * handles must not be reused!
   *
   * @param ih instruction (handle) to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private void remove(InstructionHandle prev, InstructionHandle next)

  /**
   * Remove from instruction `prev' to instruction `next' both contained
   * in this list. Throws TargetLostException when one of the removed instruction handles
   * is still being targeted.
   *
   * @param prev where to start deleting (predecessor, exclusive)
   * @param next where to end deleting (successor, exclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void move(InstructionHandle ih, InstructionHandle target) {

  /**
   * Move a single instruction (handle) to a new location.
   *
   * @param ih     moved instruction
   * @param target new location of moved instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public void move(InstructionHandle start, InstructionHandle end, InstructionHandle target) {

  /**
   * Take all instructions (handles) from "start" to "end" and append them after the
   * new location "target". Of course, "end" must be after "start" and target must
   * not be located withing this range. If you want to move something to the start of
   * the list use null as value for target.<br>
   * Any instruction targeters pointing to handles within the block, keep their targets.
   *
   * @param start  of moved block
   * @param end    of moved block
   * @param target of moved block
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public BranchHandle insert(InstructionHandle ih, BranchInstruction i) {

  /**
   * Insert an instruction before instruction (handle) ih contained in this list.
   *
   * @param ih where to insert to the instruction list
   * @param i Instruction to insert
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(InstructionHandle ih, CompoundInstruction c) {

  /**
   * Insert a compound instruction.
   *
   * @param ih where to insert the instruction list
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(InstructionHandle ih, Instruction i) {

  /**
   * Insert an instruction before instruction (handle) ih contained in this list.
   *
   * @param ih where to insert to the instruction list
   * @param i Instruction to insert
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(CompoundInstruction c) {

  /**
   * Insert a compound instruction.
   *
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(Instruction i, CompoundInstruction c) {

  /**
   * Insert a compound instruction before instruction i.
   *
   * @param i Instruction in list
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(Instruction i, Instruction j) {

  /**
   * Insert a single instruction j before another instruction i, which
   * must be in this list of course!
   *
   * @param i Instruction in list
   * @param j Instruction to insert before i in list
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public BranchHandle insert(BranchInstruction i) {

  /**
   * Insert a branch instruction at start of this list.
   *
   * @param i branch instruction to insert
   * @return branch instruction handle of the appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(Instruction i) {

  /**
   * Insert an instruction at start of this list.
   *
   * @param i instruction to insert
   * @return instruction handle of the inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(Instruction i, InstructionList il) {

  /**
   * Insert another list before Instruction i contained in this list.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param i  where to append the instruction list
   * @param il Instruction list to insert
   * @return instruction handle pointing to the first inserted instruction,
   * i.e., il.getStart()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private void insert(InstructionHandle ih) {

  /**
   * Insert an instruction at start of this list.
   *
   * @param ih instruction to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(InstructionList il) {

  /**
   * Insert another list.
   *
   * @param il list to insert before start of this list
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle insert(InstructionHandle ih, InstructionList il) {

  /**
   * Insert another list before Instruction handle ih contained in this list.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param i  where to append the instruction list
   * @param il Instruction list to insert
   * @return instruction handle of the first inserted instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public BranchHandle append(InstructionHandle ih, BranchInstruction i) {

  /**
   * Append an instruction after instruction (handle) ih contained in this list.
   *
   * @param ih where to append the instruction list
   * @param i Instruction to append
   * @return instruction handle pointing to the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(InstructionHandle ih, Instruction i) {

  /**
   * Append an instruction after instruction (handle) ih contained in this list.
   *
   * @param ih where to append the instruction list
   * @param i Instruction to append
   * @return instruction handle pointing to the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(InstructionHandle ih, CompoundInstruction c) {

  /**
   * Append a compound instruction.
   *
   * @param ih where to append the instruction list
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(CompoundInstruction c) {

  /**
   * Append a compound instruction.
   *
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(Instruction i, CompoundInstruction c) {

  /**
   * Append a compound instruction, after instruction i.
   *
   * @param i Instruction in list
   * @param c The composite instruction (containing an InstructionList)
   * @return instruction handle of the first appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(Instruction i, Instruction j) {

  /**
   * Append a single instruction j after another instruction i, which
   * must be in this list of course!
   *
   * @param i Instruction in list
   * @param j Instruction to append after i in list
   * @return instruction handle of the first appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public BranchHandle append(BranchInstruction i) {

  /**
   * Append a branch instruction to the end of this list.
   *
   * @param i branch instruction to append
   * @return branch instruction handle of the appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(Instruction i) {

  /**
   * Append an instruction to the end of this list.
   *
   * @param i instruction to append
   * @return instruction handle of the appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  private void append(InstructionHandle ih) {

  /**
   * Append an instruction to the end of this list.
   *
   * @param ih instruction to append
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(InstructionList il) {

  /**
   * Append another list to this one.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param il list to append to end of this list
   * @return instruction handle of the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(Instruction i, InstructionList il) {

  /**
   * Append another list after instruction i contained in this list.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param i  where to append the instruction list
   * @param il Instruction list to append to this one
   * @return instruction handle pointing to the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle append(InstructionHandle ih, InstructionList il) {

  /**
   * Append another list after instruction (handle) ih contained in this list.
   * Consumes argument list, i.e., it becomes empty.
   *
   * @param ih where to append the instruction list
   * @param il Instruction list to append to this one
   * @return instruction handle pointing to the <B>first</B> appended instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList(byte[] code) {

  /**
   * Initialize instruction list from byte array.
   *
   * @param code byte array containing the instructions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionHandle findHandle(int pos) {

  /**
   * Get instruction handle for instruction at byte code position pos.
   * This only works properly, if the list is freshly initialized from a byte array or
   * setPositions() has been called before this method.
   *
   * @param pos byte code position to search for
   * @return target position's instruction handle if available
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public static InstructionHandle findHandle(InstructionHandle[] ihs,
                                             int[] pos, int count,
                                             int target) {

  /**
   * Find the target instruction (handle) that corresponds to the given target
   * position (byte code offset).
   *
   * @param ihs array of instruction handles, i.e. il.getInstructionHandles()
   * @param pos array of positions corresponding to ihs, i.e. il.getInstructionPositions()
   * @param count length of arrays
   * @param target target position to search for
   * @return target position's instruction handle if available
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public boolean isEmpty() { return start == null; } // && end == null

  /**
   * Test for empty list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList(CompoundInstruction c) {

  /**
   * Initialize list with (nonnull) compound instruction. Consumes argument
   * list, i.e., it becomes empty.
   *
   * @param c compound instruction (list)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList(BranchInstruction i) {

  /**
   * Create instruction list containing one instruction.
   * @param i initial instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList(Instruction i) {

  /**
   * Create instruction list containing one instruction.
   * @param i initial instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
  public InstructionList() {}

  /**
   * Create (empty) instruction list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionList.java
public class InstructionList implements Serializable {

/**
 * This class is a container for a list of <a
 * href="Instruction.html">Instruction</a> objects. Instructions can
 * be appended, inserted, moved, deleted, etc.. Instructions are being
 * wrapped into <a
 * href="InstructionHandle.html">InstructionHandles</a> objects that
 * are returned upon append/insert operations. They give the user
 * (read only) access to the list structure, such that it can be traversed and
 * manipulated in a controlled way.
 *
 * A list is finally dumped to a byte code array with <a
 * href="#getByteCode()">getByteCode</a>.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     Instruction
 * @see     InstructionHandle
 * @see BranchHandle
 */
