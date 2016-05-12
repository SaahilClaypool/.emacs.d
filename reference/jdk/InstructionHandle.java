_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void accept(Visitor v) {

  /** Convenience method, simply calls accept() on the contained instruction.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public Collection getAttributes() {

  /** @return all attributes associated with this handle
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public Object getAttribute(Object key) {

  /** Get attribute of an instruction handle.
   *
   * @param key the key object to store/retrieve the attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void removeAttribute(Object key) {

  /** Delete an attribute of an instruction handle.
   *
   * @param key the key object to retrieve the attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void addAttribute(Object key, Object attr) {

  /** Add an attribute to an instruction handle.
   *
   * @param key the key object to store/retrieve the attribute
   * @param attr the attribute to associate with this handle
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public String toString() {

  /** @return a string representation of the contained instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public String toString(boolean verbose) {

  /** @return a (verbose) string representation of the contained instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public InstructionTargeter[] getTargeters() {

  /**
   * @return null, if there are no targeters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void addTargeter(InstructionTargeter t) {

  /**
   * Denote this handle is being referenced by t.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void removeTargeter(InstructionTargeter t) {

  /**
   * Denote this handle isn't referenced anymore by t.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void removeAllTargeters() {

  /** Remove all targeters, if any.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  void dispose() {

  /**
   * Delete contents, i.e., remove user access and make handle reusable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  protected void addHandle() {

  /** Overridden in BranchHandle
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  void setPosition(int pos) { i_position = pos; }

  /** Set the position, i.e., the byte code offset of the contained
   * instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public int getPosition() { return i_position; }

  /** @return the position, i.e., the byte code offset of the contained
   * instruction. This is accurate only after
   * InstructionList.setPositions() has been called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  protected int updatePosition(int offset, int max_offset) {

  /**
   * Called by InstructionList.setPositions when setting the position for every
   * instruction. In the presence of variable length instructions `setPositions()'
   * performs multiple passes over the instruction list to calculate the
   * correct (byte) positions and offsets by calling this function.
   *
   * @param offset additional offset caused by preceding (variable length) instructions
   * @param max_offset the maximum offset that may be caused by these instructions
   * @return additional offset caused by possible change of this instruction's length
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  static final InstructionHandle getInstructionHandle(Instruction i) {

  /** Factory method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public Instruction swapInstruction(Instruction i) {

  /**
   * Temporarily swap the current instruction, without disturbing
   * anything. Meant to be used by a debugger, implementing
   * breakpoints. Current instruction is returned.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void setInstruction(Instruction i) { // Overridden in BranchHandle

  /**
   * Replace current instruction contained in this handle.
   * Old instruction is disposed using Instruction.dispose().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
public class InstructionHandle implements java.io.Serializable {

/**
 * Instances of this class give users a handle to the instructions contained in
 * an InstructionList. Instruction objects may be used more than once within a
 * list, this is useful because it saves memory and may be much faster.
 *
 * Within an InstructionList an InstructionHandle object is wrapped
 * around all instructions, i.e., it implements a cell in a
 * doubly-linked list. From the outside only the next and the
 * previous instruction (handle) are accessible. One
 * can traverse the list via an Enumeration returned by
 * InstructionList.elements().
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see Instruction
 * @see BranchHandle
 * @see InstructionList
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void accept(Visitor v) {

  /** Convenience method, simply calls accept() on the contained instruction.
   *
   * @param v Visitor object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public Collection getAttributes() {

  /** @return all attributes associated with this handle
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public Object getAttribute(Object key) {

  /** Get attribute of an instruction handle.
   *
   * @param key the key object to store/retrieve the attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void removeAttribute(Object key) {

  /** Delete an attribute of an instruction handle.
   *
   * @param key the key object to retrieve the attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void addAttribute(Object key, Object attr) {

  /** Add an attribute to an instruction handle.
   *
   * @param key the key object to store/retrieve the attribute
   * @param attr the attribute to associate with this handle
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public String toString() {

  /** @return a string representation of the contained instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public String toString(boolean verbose) {

  /** @return a (verbose) string representation of the contained instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public InstructionTargeter[] getTargeters() {

  /**
   * @return null, if there are no targeters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void addTargeter(InstructionTargeter t) {

  /**
   * Denote this handle is being referenced by t.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void removeTargeter(InstructionTargeter t) {

  /**
   * Denote this handle isn't referenced anymore by t.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void removeAllTargeters() {

  /** Remove all targeters, if any.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  void dispose() {

  /**
   * Delete contents, i.e., remove user access and make handle reusable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  protected void addHandle() {

  /** Overridden in BranchHandle
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  void setPosition(int pos) { i_position = pos; }

  /** Set the position, i.e., the byte code offset of the contained
   * instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public int getPosition() { return i_position; }

  /** @return the position, i.e., the byte code offset of the contained
   * instruction. This is accurate only after
   * InstructionList.setPositions() has been called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  protected int updatePosition(int offset, int max_offset) {

  /**
   * Called by InstructionList.setPositions when setting the position for every
   * instruction. In the presence of variable length instructions `setPositions()'
   * performs multiple passes over the instruction list to calculate the
   * correct (byte) positions and offsets by calling this function.
   *
   * @param offset additional offset caused by preceding (variable length) instructions
   * @param max_offset the maximum offset that may be caused by these instructions
   * @return additional offset caused by possible change of this instruction's length
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  static final InstructionHandle getInstructionHandle(Instruction i) {

  /** Factory method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public Instruction swapInstruction(Instruction i) {

  /**
   * Temporarily swap the current instruction, without disturbing
   * anything. Meant to be used by a debugger, implementing
   * breakpoints. Current instruction is returned.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
  public void setInstruction(Instruction i) { // Overridden in BranchHandle

  /**
   * Replace current instruction contained in this handle.
   * Old instruction is disposed using Instruction.dispose().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionHandle.java
public class InstructionHandle implements java.io.Serializable {

/**
 * Instances of this class give users a handle to the instructions contained in
 * an InstructionList. Instruction objects may be used more than once within a
 * list, this is useful because it saves memory and may be much faster.
 *
 * Within an InstructionList an InstructionHandle object is wrapped
 * around all instructions, i.e., it implements a cell in a
 * doubly-linked list. From the outside only the next and the
 * previous instruction (handle) are accessible. One
 * can traverse the list via an Enumeration returned by
 * InstructionList.elements().
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see Instruction
 * @see BranchHandle
 * @see InstructionList
 */
