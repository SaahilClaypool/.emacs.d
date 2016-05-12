_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
  protected void initFromFile(ByteSequence bytes, boolean wide) throws IOException

  /**
   * Read needed data (e.g. index) from file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
  public TABLESWITCH(int[] match, InstructionHandle[] targets,
                     InstructionHandle target) {

  /**
   * @param match sorted array of match values, match[0] must be low value,
   * match[match_length - 1] high value
   * @param targets where to branch for matched values
   * @param target default branch
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
public class TABLESWITCH extends Select {

/**
 * TABLESWITCH - Switch within given range of values, i.e., low..high
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see SWITCH
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
  protected void initFromFile(ByteSequence bytes, boolean wide) throws IOException

  /**
   * Read needed data (e.g. index) from file.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
  public void dump(DataOutputStream out) throws IOException {

  /**
   * Dump instruction as byte code to stream out.
   * @param out Output stream
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
  public TABLESWITCH(int[] match, InstructionHandle[] targets,
                     InstructionHandle target) {

  /**
   * @param match sorted array of match values, match[0] must be low value,
   * match[match_length - 1] high value
   * @param targets where to branch for matched values
   * @param target default branch
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/TABLESWITCH.java
public class TABLESWITCH extends Select {

/**
 * TABLESWITCH - Switch within given range of values, i.e., low..high
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see SWITCH
 */
