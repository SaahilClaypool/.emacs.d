_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public Type getType(ConstantPoolGen cpg) {

  /** @return type related with this instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public void setIndex(int index) {

  /**
   * Set the index to constant pool.
   * @param index in  constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public final int getIndex() { return index; }

  /**
   * @return index in constant pool referred by this instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  protected void initFromFile(ByteSequence bytes, boolean wide)

  /**
   * Read needed data (i.e., index) from file.
   * @param bytes input stream
   * @param wide wide prefix?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public String toString(ConstantPool cp) {

  /**
   * @return mnemonic for instruction with symbolic references resolved
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public String toString(boolean verbose) {

  /**
   * Long output format:
   *
   * &lt;name of opcode&gt; "["&lt;opcode number&gt;"]"
   * "("&lt;length of instruction&gt;")" "&lt;"&lt; constant pool index&gt;"&gt;"
   *
   * @param verbose long/short format switch
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  protected CPInstruction(short opcode, int index) {

  /**
   * @param index to constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  CPInstruction() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
public abstract class CPInstruction extends Instruction

/**
 * Abstract super class for instructions that use an index into the
 * constant pool such as LDC, INVOKEVIRTUAL, etc.
 *
 * @see ConstantPoolGen
 * @see LDC
 * @see INVOKEVIRTUAL
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public Type getType(ConstantPoolGen cpg) {

  /** @return type related with this instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public void setIndex(int index) {

  /**
   * Set the index to constant pool.
   * @param index in  constant pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public final int getIndex() { return index; }

  /**
   * @return index in constant pool referred by this instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  protected void initFromFile(ByteSequence bytes, boolean wide)

  /**
   * Read needed data (i.e., index) from file.
   * @param bytes input stream
   * @param wide wide prefix?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public String toString(ConstantPool cp) {

  /**
   * @return mnemonic for instruction with symbolic references resolved
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public String toString(boolean verbose) {

  /**
   * Long output format:
   *
   * &lt;name of opcode&gt; "["&lt;opcode number&gt;"]"
   * "("&lt;length of instruction&gt;")" "&lt;"&lt; constant pool index&gt;"&gt;"
   *
   * @param verbose long/short format switch
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  protected CPInstruction(short opcode, int index) {

  /**
   * @param index to constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
  CPInstruction() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CPInstruction.java
public abstract class CPInstruction extends Instruction

/**
 * Abstract super class for instructions that use an index into the
 * constant pool such as LDC, INVOKEVIRTUAL, etc.
 *
 * @see ConstantPoolGen
 * @see LDC
 * @see INVOKEVIRTUAL
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
