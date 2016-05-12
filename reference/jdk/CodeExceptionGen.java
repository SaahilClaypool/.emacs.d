_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public InstructionHandle getHandlerPC()                             { return handler_pc; }

  /** @return start of handler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public InstructionHandle getEndPC()                                 { return end_pc; }

  /** @return end of handled region (inclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public InstructionHandle getStartPC()                               { return start_pc; }

  /** @return start of handled region (inclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public void              setCatchType(ObjectType catch_type)        { this.catch_type = catch_type; }

  /** Sets the type of the Exception to catch. Set 'null' for ANY. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  @Override

  /**
   * @return true, if ih is target of this handler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  @Override

  /**
   * @param old_ih old target, either start or end
   * @param new_ih new target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public CodeException getCodeException(ConstantPoolGen cp) {

  /**
   * Get CodeException object.<BR>
   *
   * This relies on that the instruction list has already been dumped
   * to byte code or or that the `setPositions' methods has been
   * called for the instruction list.
   *
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public CodeExceptionGen(InstructionHandle start_pc, InstructionHandle end_pc,
                          InstructionHandle handler_pc, ObjectType catch_type) {

  /**
   * Add an exception handler, i.e., specify region where a handler is active and an
   * instruction where the actual handling is done.
   *
   * @param start_pc Start of handled region (inclusive)
   * @param end_pc End of handled region (inclusive)
   * @param handler_pc Where handling is done
   * @param catch_type which exception is handled, null for ANY
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
public final class CodeExceptionGen

/**
 * This class represents an exception handler, i.e., specifies the  region where
 * a handler is active and an instruction where the actual handling is done.
 * pool as parameters. Opposed to the JVM specification the end of the handled
 * region is set to be inclusive, i.e. all instructions between start and end
 * are protected including the start and end instructions (handles) themselves.
 * The end of the region is automatically mapped to be exclusive when calling
 * getCodeException(), i.e., there is no difference semantically.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     MethodGen
 * @see     CodeException
 * @see     InstructionHandle
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public InstructionHandle getHandlerPC()                             { return handler_pc; }

  /** @return start of handler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public InstructionHandle getEndPC()                                 { return end_pc; }

  /** @return end of handled region (inclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public InstructionHandle getStartPC()                               { return start_pc; }

  /** @return start of handled region (inclusive)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public void              setCatchType(ObjectType catch_type)        { this.catch_type = catch_type; }

  /** Sets the type of the Exception to catch. Set 'null' for ANY. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  @Override

  /**
   * @return true, if ih is target of this handler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  @Override

  /**
   * @param old_ih old target, either start or end
   * @param new_ih new target
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public CodeException getCodeException(ConstantPoolGen cp) {

  /**
   * Get CodeException object.<BR>
   *
   * This relies on that the instruction list has already been dumped
   * to byte code or or that the `setPositions' methods has been
   * called for the instruction list.
   *
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
  public CodeExceptionGen(InstructionHandle start_pc, InstructionHandle end_pc,
                          InstructionHandle handler_pc, ObjectType catch_type) {

  /**
   * Add an exception handler, i.e., specify region where a handler is active and an
   * instruction where the actual handling is done.
   *
   * @param start_pc Start of handled region (inclusive)
   * @param end_pc End of handled region (inclusive)
   * @param handler_pc Where handling is done
   * @param catch_type which exception is handled, null for ANY
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/CodeExceptionGen.java
public final class CodeExceptionGen

/**
 * This class represents an exception handler, i.e., specifies the  region where
 * a handler is active and an instruction where the actual handling is done.
 * pool as parameters. Opposed to the JVM specification the end of the handled
 * region is set to be inclusive, i.e. all instructions between start and end
 * are protected including the start and end instructions (handles) themselves.
 * The end of the region is automatically mapped to be exclusive when calling
 * getCodeException(), i.e., there is no difference semantically.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see     MethodGen
 * @see     CodeException
 * @see     InstructionHandle
 */
