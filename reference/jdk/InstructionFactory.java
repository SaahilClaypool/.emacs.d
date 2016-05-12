_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static BranchInstruction createBranchInstruction(short opcode, InstructionHandle target) {

  /** Create branch instruction by given opcode, except LOOKUPSWITCH and TABLESWITCH.
   * For those you should use the SWITCH compound instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static Instruction createNull(Type type) {

  /** Create "null" value for reference types, 0 for basic types like int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public Instruction createNewArray(Type t, short dim) {

  /** Create new array of given size and type.
   * @return an instruction that creates the corresponding array at runtime, i.e. is an AllocationInstruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public Instruction createCast(Type src_type, Type dest_type) {

  /** Create conversion operation for two stack operands, this may be an I2C, instruction, e.g.,
   * if the operands are basic types and CHECKCAST if they are reference types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static ArrayInstruction createArrayStore(Type type) {

  /**
   * @param type type of elements of array, i.e., array.getElementType()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static ArrayInstruction createArrayLoad(Type type) {

  /**
   * @param type type of elements of array, i.e., array.getElementType()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static LocalVariableInstruction createLoad(Type type, int index) {

  /**
   * @param index index of local variable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static LocalVariableInstruction createStore(Type type, int index) {

  /**
   * @param index index of local variable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static StackInstruction createDup_1(int size) {

  /**
   * @param size size of operand, either 1 (int, e.g.) or 2 (double)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static StackInstruction createDup_2(int size) {

  /**
   * @param size size of operand, either 1 (int, e.g.) or 2 (double)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static StackInstruction createDup(int size) {

  /**
   * @param size size of operand, either 1 (int, e.g.) or 2 (double)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static StackInstruction createPop(int size) {

  /**
   * @param size size of operand, either 1 (int, e.g.) or 2 (double)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static ArithmeticInstruction createBinaryOperation(String op, Type type) {

  /**
   * Create binary operation for simple basic types, such as int and float.
   *
   * @param op operation, such as "+", "*", "<<", etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static ReturnInstruction createReturn(Type type) {

  /** Create typed return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static Instruction createThis() {

  /** Create reference to `this'
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public FieldInstruction createFieldAccess(String class_name, String name, Type type, short kind) {

  /** Create a field instruction.
   *
   * @param class_name name of the accessed class
   * @param name name of the referenced field
   * @param type  type of field
   * @param kind how to access, i.e., GETFIELD, PUTFIELD, GETSTATIC, PUTSTATIC
   * @see Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public Instruction createConstant(Object value) {

  /** Uses PUSH to push a constant value onto the stack.
   * @param value must be of type Number, Boolean, Character or String
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public InstructionList createPrintln(String s) {

  /** Create a call to the most popular System.out.println() method.
   *
   * @param s the string to print
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public InvokeInstruction createInvoke(String class_name, String name, Type ret_type,
                                        Type[] arg_types, short kind) {

  /** Create an invoke instruction.
   *
   * @param class_name name of the called class
   * @param name name of the called method
   * @param ret_type return type of method
   * @param arg_types argument types of method
   * @param kind how to invoke, i.e., INVOKEINTERFACE, INVOKESTATIC, INVOKEVIRTUAL,
   * or INVOKESPECIAL
   * @see Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public InstructionFactory(ConstantPoolGen cp) {

  /** Initialize just with ConstantPoolGen object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public InstructionFactory(ClassGen cg) {

  /** Initialize with ClassGen object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
public class InstructionFactory

/**
 * Instances of this class may be used, e.g., to generate typed
 * versions of instructions. Its main purpose is to be used as the
 * byte code generating backend of a compiler. You can subclass it to
 * add your own create methods.
 *
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see Constants
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static BranchInstruction createBranchInstruction(short opcode, InstructionHandle target) {

  /** Create branch instruction by given opcode, except LOOKUPSWITCH and TABLESWITCH.
   * For those you should use the SWITCH compound instruction.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static Instruction createNull(Type type) {

  /** Create "null" value for reference types, 0 for basic types like int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public Instruction createNewArray(Type t, short dim) {

  /** Create new array of given size and type.
   * @return an instruction that creates the corresponding array at runtime, i.e. is an AllocationInstruction
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public Instruction createCast(Type src_type, Type dest_type) {

  /** Create conversion operation for two stack operands, this may be an I2C, instruction, e.g.,
   * if the operands are basic types and CHECKCAST if they are reference types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static ArrayInstruction createArrayStore(Type type) {

  /**
   * @param type type of elements of array, i.e., array.getElementType()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static ArrayInstruction createArrayLoad(Type type) {

  /**
   * @param type type of elements of array, i.e., array.getElementType()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static LocalVariableInstruction createLoad(Type type, int index) {

  /**
   * @param index index of local variable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static LocalVariableInstruction createStore(Type type, int index) {

  /**
   * @param index index of local variable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static StackInstruction createDup_1(int size) {

  /**
   * @param size size of operand, either 1 (int, e.g.) or 2 (double)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static StackInstruction createDup_2(int size) {

  /**
   * @param size size of operand, either 1 (int, e.g.) or 2 (double)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static StackInstruction createDup(int size) {

  /**
   * @param size size of operand, either 1 (int, e.g.) or 2 (double)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static StackInstruction createPop(int size) {

  /**
   * @param size size of operand, either 1 (int, e.g.) or 2 (double)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static ArithmeticInstruction createBinaryOperation(String op, Type type) {

  /**
   * Create binary operation for simple basic types, such as int and float.
   *
   * @param op operation, such as "+", "*", "<<", etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static ReturnInstruction createReturn(Type type) {

  /** Create typed return
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public static Instruction createThis() {

  /** Create reference to `this'
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public FieldInstruction createFieldAccess(String class_name, String name, Type type, short kind) {

  /** Create a field instruction.
   *
   * @param class_name name of the accessed class
   * @param name name of the referenced field
   * @param type  type of field
   * @param kind how to access, i.e., GETFIELD, PUTFIELD, GETSTATIC, PUTSTATIC
   * @see Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public Instruction createConstant(Object value) {

  /** Uses PUSH to push a constant value onto the stack.
   * @param value must be of type Number, Boolean, Character or String
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public InstructionList createPrintln(String s) {

  /** Create a call to the most popular System.out.println() method.
   *
   * @param s the string to print
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public InvokeInstruction createInvoke(String class_name, String name, Type ret_type,
                                        Type[] arg_types, short kind) {

  /** Create an invoke instruction.
   *
   * @param class_name name of the called class
   * @param name name of the called method
   * @param ret_type return type of method
   * @param arg_types argument types of method
   * @param kind how to invoke, i.e., INVOKEINTERFACE, INVOKESTATIC, INVOKEVIRTUAL,
   * or INVOKESPECIAL
   * @see Constants
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public InstructionFactory(ConstantPoolGen cp) {

  /** Initialize just with ConstantPoolGen object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
  public InstructionFactory(ClassGen cg) {

  /** Initialize with ClassGen object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/InstructionFactory.java
public class InstructionFactory

/**
 * Instances of this class may be used, e.g., to generate typed
 * versions of instructions. Its main purpose is to be used as the
 * byte code generating backend of a compiler. You can subclass it to
 * add your own create methods.
 *
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @see Constants
 */
