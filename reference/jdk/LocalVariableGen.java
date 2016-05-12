_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  @Override

  /**
   * We consider two local variables to be equal, if they use the same index and
   * are valid in the same range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  @Override

  /**
   * @return true, if ih is target of this variable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  @Override

  /**
   * @param old_ih old target, either start or end
   * @param new_ih new target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  void notifyTargetChanged() {

  /**
   * Add back 'this' in all HashSet in which it should be registered.
   **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  void notifyTargetChanging() {

  /**
   * Remove this from any known HashSet in which it might be registered.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  public LocalVariable getLocalVariable(ConstantPoolGen cp) {

  /**
   * Get LocalVariable object.
   *
   * This relies on that the instruction list has already been dumped to byte code or
   * or that the `setPositions' methods has been called for the instruction list.
   *
   * Note that for local variables whose scope end at the last
   * instruction of the method's code, the JVM specification is ambiguous:
   * both a start_pc+length ending at the last instruction and
   * start_pc+length ending at first index beyond the end of the code are
   * valid.
   *
   * @param il instruction list (byte code) which this variable belongs to
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  public LocalVariableGen(int index, String name, Type type,
                          InstructionHandle start, InstructionHandle end) {

  /**
   * Generate a local variable that with index `index'. Note that double and long
   * variables need two indexs. Index indices have to be provided by the user.
   *
   * @param index index of local variable
   * @param name its name
   * @param type its type
   * @param start from where the instruction is valid (null means from the start)
   * @param end until where the instruction is valid (null means to the end)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
public class LocalVariableGen

/**
 * This class represents a local variable within a method. It contains its
 * scope, name and type. The generated LocalVariable object can be obtained
 * with getLocalVariable which needs the instruction list and the constant
 * pool as parameters.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     LocalVariable
 * @see     MethodGen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  @Override

  /**
   * We consider two local variables to be equal, if they use the same index and
   * are valid in the same range.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  @Override

  /**
   * @return true, if ih is target of this variable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  @Override

  /**
   * @param old_ih old target, either start or end
   * @param new_ih new target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  void notifyTargetChanged() {

  /**
   * Add back 'this' in all HashSet in which it should be registered.
   **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  void notifyTargetChanging() {

  /**
   * Remove this from any known HashSet in which it might be registered.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  public LocalVariable getLocalVariable(ConstantPoolGen cp) {

  /**
   * Get LocalVariable object.
   *
   * This relies on that the instruction list has already been dumped to byte code or
   * or that the `setPositions' methods has been called for the instruction list.
   *
   * Note that for local variables whose scope end at the last
   * instruction of the method's code, the JVM specification is ambiguous:
   * both a start_pc+length ending at the last instruction and
   * start_pc+length ending at first index beyond the end of the code are
   * valid.
   *
   * @param il instruction list (byte code) which this variable belongs to
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
  public LocalVariableGen(int index, String name, Type type,
                          InstructionHandle start, InstructionHandle end) {

  /**
   * Generate a local variable that with index `index'. Note that double and long
   * variables need two indexs. Index indices have to be provided by the user.
   *
   * @param index index of local variable
   * @param name its name
   * @param type its type
   * @param start from where the instruction is valid (null means from the start)
   * @param end until where the instruction is valid (null means to the end)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/LocalVariableGen.java
public class LocalVariableGen

/**
 * This class represents a local variable within a method. It contains its
 * scope, name and type. The generated LocalVariable object can be obtained
 * with getLocalVariable which needs the instruction list and the constant
 * pool as parameters.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     LocalVariable
 * @see     MethodGen
 */
