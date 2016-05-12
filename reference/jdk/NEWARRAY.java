_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  protected void initFromFile(ByteSequence bytes, boolean wide) throws IOException

  /**
   * Read needed data (e.g. index) from file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  public String toString(boolean verbose) {

  /**
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  public final Type getType() {

  /**
   * @return type of constructed array
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  public final byte getTypecode() { return type; }

  /**
   * @return numeric code for basic element type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  NEWARRAY() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
public class NEWARRAY extends Instruction

/**
 * NEWARRAY -  Create new array of basic type (int, short, ...)
 * <PRE>Stack: ..., count -&gt; ..., arrayref</PRE>
 * type must be one of T_INT, T_SHORT, ...
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  protected void initFromFile(ByteSequence bytes, boolean wide) throws IOException

  /**
   * Read needed data (e.g. index) from file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  public String toString(boolean verbose) {

  /**
   * @return mnemonic for instruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  public final Type getType() {

  /**
   * @return type of constructed array
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  public final byte getTypecode() { return type; }

  /**
   * @return numeric code for basic element type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
  NEWARRAY() {}

  /**
   * Empty constructor needed for the Class.newInstance() statement in
   * Instruction.readInstruction(). Not to be used otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/NEWARRAY.java
public class NEWARRAY extends Instruction

/**
 * NEWARRAY -  Create new array of basic type (int, short, ...)
 * <PRE>Stack: ..., count -&gt; ..., arrayref</PRE>
 * type must be one of T_INT, T_SHORT, ...
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
