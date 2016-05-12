_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionConstants.java
  static final Clinit bla = new Clinit();

  /** Interfaces may have no static initializers, so we simulate this
   * with an inner class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionConstants.java
  public static final Instruction[] INSTRUCTIONS = new Instruction[256];

  /** Get object via its opcode, for immutable instructions like
   * branch instructions entries are set to null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionConstants.java
  public static final LocalVariableInstruction THIS    = new ALOAD(0);

  /** You can use these constants in multiple places safely, if you can guarantee
   * that you will never alter their internal values, e.g. call setIndex().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionConstants.java
public interface InstructionConstants {

/**
 * This interface contains shareable instruction objects.
 *
 * In order to save memory you can use some instructions multiply,
 * since they have an immutable state and are directly derived from
 * Instruction.  I.e. they have no instance fields that could be
 * changed. Since some of these instructions like ICONST_0 occur
 * very frequently this can save a lot of time and space. This
 * feature is an adaptation of the FlyWeight design pattern, we
 * just use an array instead of a factory.
 *
 * The Instructions can also accessed directly under their names, so
 * it's possible to write il.append(Instruction.ICONST_0);
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionConstants.java
  static final Clinit bla = new Clinit();

  /** Interfaces may have no static initializers, so we simulate this
   * with an inner class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionConstants.java
  public static final Instruction[] INSTRUCTIONS = new Instruction[256];

  /** Get object via its opcode, for immutable instructions like
   * branch instructions entries are set to null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionConstants.java
  public static final LocalVariableInstruction THIS    = new ALOAD(0);

  /** You can use these constants in multiple places safely, if you can guarantee
   * that you will never alter their internal values, e.g. call setIndex().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionConstants.java
public interface InstructionConstants {

/**
 * This interface contains shareable instruction objects.
 *
 * In order to save memory you can use some instructions multiply,
 * since they have an immutable state and are directly derived from
 * Instruction.  I.e. they have no instance fields that could be
 * changed. Since some of these instructions like ICONST_0 occur
 * very frequently this can save a lot of time and space. This
 * feature is an adaptation of the FlyWeight design pattern, we
 * just use an array instead of a factory.
 *
 * The Instructions can also accessed directly under their names, so
 * it's possible to write il.append(Instruction.ICONST_0);
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
