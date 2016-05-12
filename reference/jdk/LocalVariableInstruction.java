_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public Type getType(ConstantPoolGen cp) {

  /**
   * Returns the type associated with the instruction -
   * in case of ALOAD or ASTORE Type.OBJECT is returned.
   * This is just a bit incorrect, because ALOAD and ASTORE
   * may work on every ReferenceType (including Type.NULL) and
   * ASTORE may even work on a ReturnaddressType .
   * @return type associated with the instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public short getCanonicalTag() {

  /** @return canonical tag for instruction, e.g., ALOAD for ALOAD_0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public void setIndex(int n) {

  /**
   * Set the local variable index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public final int getIndex() { return n; }

  /**
   * @return local variable index  referred by this instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  protected void initFromFile(ByteSequence bytes, boolean wide)

  /**
   * Read needed data (e.g. index) from file.
   * PRE: (ILOAD <= tag <= ALOAD_3) || (ISTORE <= tag <= ASTORE_3)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public String toString(boolean verbose) {

  /**
   * Long output format:
   *
   * &lt;name of opcode&gt; "["&lt;opcode number&gt;"]"
   * "("&lt;length of instruction&gt;")" "&lt;"&lt; local variable index&gt;"&gt;"
   *
   * @param verbose long/short format switch
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  protected LocalVariableInstruction(short opcode, short c_tag, int n) {

  /**
   * @param opcode Instruction opcode
   * @param c_tag Instruction number for compact version, ALOAD_0, e.g.
   * @param n local variable index (unsigned short)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  LocalVariableInstruction() {

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Also used by IINC()!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  LocalVariableInstruction(short canon_tag, short c_tag) {

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   * tag and length are defined in readInstruction and initFromFile, respectively.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
public abstract class LocalVariableInstruction extends Instruction

/**
 * Abstract super class for instructions dealing with local variables.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public Type getType(ConstantPoolGen cp) {

  /**
   * Returns the type associated with the instruction -
   * in case of ALOAD or ASTORE Type.OBJECT is returned.
   * This is just a bit incorrect, because ALOAD and ASTORE
   * may work on every ReferenceType (including Type.NULL) and
   * ASTORE may even work on a ReturnaddressType .
   * @return type associated with the instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public short getCanonicalTag() {

  /** @return canonical tag for instruction, e.g., ALOAD for ALOAD_0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public void setIndex(int n) {

  /**
   * Set the local variable index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public final int getIndex() { return n; }

  /**
   * @return local variable index  referred by this instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  protected void initFromFile(ByteSequence bytes, boolean wide)

  /**
   * Read needed data (e.g. index) from file.
   * PRE: (ILOAD <= tag <= ALOAD_3) || (ISTORE <= tag <= ASTORE_3)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public String toString(boolean verbose) {

  /**
   * Long output format:
   *
   * &lt;name of opcode&gt; "["&lt;opcode number&gt;"]"
   * "("&lt;length of instruction&gt;")" "&lt;"&lt; local variable index&gt;"&gt;"
   *
   * @param verbose long/short format switch
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  protected LocalVariableInstruction(short opcode, short c_tag, int n) {

  /**
   * @param opcode Instruction opcode
   * @param c_tag Instruction number for compact version, ALOAD_0, e.g.
   * @param n local variable index (unsigned short)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  LocalVariableInstruction() {

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Also used by IINC()!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
  LocalVariableInstruction(short canon_tag, short c_tag) {

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   * tag and length are defined in readInstruction and initFromFile, respectively.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableInstruction.java
public abstract class LocalVariableInstruction extends Instruction

/**
 * Abstract super class for instructions dealing with local variables.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
