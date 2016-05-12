_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public MethodGen copy(String class_name, ConstantPoolGen cp) {

  /** @return deep copy of this method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public final String toString() {

  /**
   * Return string representation close to declaration format,
   * `public static void _main(String[]) throws IOException', e.g.
   *
   * @return String representation of the method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void update() {

  /** Call notify() method on all observers. This method is not called
   * automatically whenever the state has changed, but has to be
   * called by the user after he has finished editing the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeObserver(MethodObserver o) {

  /** Remove observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void addObserver(MethodObserver o) {

  /** Add observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public static int getMaxStack(ConstantPoolGen cp, InstructionList il, CodeExceptionGen[] et) {

  /**
   * Computes stack usage of an instruction list by performing control flow analysis.
   *
   * @return maximum stack depth used by method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void stripAttributes(boolean flag) { strip_attributes = flag; }

  /** Do not/Do produce attributes code attributesLineNumberTable and
   * LocalVariableTable, like javac -O
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void setMaxLocals() {

  /**
   * Compute maximum number of local variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void setMaxStack() {

  /**
   * Computes max. stack size by performing control flow analysis.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public String getClassName()                     { return class_name; }

  /** @return class that contains this method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void   setMaxStack(int m)  { max_stack = m; }

  /**
   * Set maximum stack size for this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void   setMaxLocals(int m)  { max_locals = m; }

  /**
   * Set maximum number of local variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeNOPs() {

  /**
   * Remove all NOPs from the instruction list (if possible) and update every
   * object refering to them, i.e., branch instructions, local variables and
   * exception handlers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public Method getMethod() {

  /**
   * Get method object. Never forget to call setMaxStack() or setMaxStack(max), respectively,
   * before calling this method (the same applies for max locals).
   *
   * @return method object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public Attribute[] getCodeAttributes() {

  /**
   * @return all attributes of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeCodeAttributes() {

  /**
   * Remove all code attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeCodeAttribute(Attribute a) { code_attrs_vec.remove(a); }

  /**
   * Remove a code attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void addCodeAttribute(Attribute a) { code_attrs_vec.add(a); }

  /**
   * Add an attribute to the code. Currently, the JVM knows about the
   * LineNumberTable, LocalVariableTable and StackMap attributes,
   * where the former two will be generated automatically and the
   * latter is used for the MIDP only. Other attributes will be
   * ignored by the JVM but do no harm.
   *
   * @param a attribute to be added
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private ExceptionTable getExceptionTable(ConstantPoolGen cp) {

  /**
   * @return `Exceptions' attribute of all the exceptions thrown by this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeExceptions() {

  /**
   * Remove all exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeException(String c) {

  /**
   * Remove an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void addException(String class_name) {

  /**
   * Add an exception possibly thrown by this method.
   *
   * @param class_name (fully qualified) name of exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private CodeException[] getCodeExceptions() {

  /**
   * @return code exceptions for `Code' attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeExceptionHandlers() {

  /**
   * Remove all line numbers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeExceptionHandler(CodeExceptionGen c) {

  /**
   * Remove an exception handler.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public CodeExceptionGen addExceptionHandler(InstructionHandle start_pc,
                                              InstructionHandle end_pc,
                                              InstructionHandle handler_pc,
                                              ObjectType catch_type) {

  /**
   * Add an exception handler, i.e., specify region where a handler is active and an
   * instruction where the actual handling is done.
   *
   * @param start_pc Start of region (inclusive)
   * @param end_pc End of region (inclusive)
   * @param handler_pc Where handling is done
   * @param catch_type class type of handled exception or null if any
   * exception is handled
   * @return new exception handler object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LineNumberTable getLineNumberTable(ConstantPoolGen cp) {

  /**
   * @return `LineNumberTable' attribute of all the local variables of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeLineNumbers() {

  /**
   * Remove all line numbers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeLineNumber(LineNumberGen l) {

  /**
   * Remove a line number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LineNumberGen addLineNumber(InstructionHandle ih, int src_line) {

  /**
   * Give an instruction a line number corresponding to the source code line.
   *
   * @param ih instruction to tag
   * @return new line number object
   * @see LineNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private void removeLocalVariableTypes() {

  /**
   * Remove all local variable types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private LocalVariableGen addLocalVariableType(String name, Type type, int slot,
                                           InstructionHandle start,
                                           InstructionHandle end) {

  /**
   * Adds a local variable type to this method.
   *
   * @param name variable name
   * @param type variable type
   * @param slot the index of the local variable, if type is long or double, the next available
   * index is slot+2
   * @param start from where the variable is valid
   * @param end until where the variable is valid
   * @return new local variable object
   * @see LocalVariable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LocalVariableTypeTable getLocalVariableTypeTable(ConstantPoolGen cp) {

  /**
   * @return `LocalVariableTypeTable' attribute of all the local variable
   * types of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LocalVariableTable getLocalVariableTable(ConstantPoolGen cp) {

  /**
   * @return `LocalVariableTable' attribute of all the local variables of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private static final void sort(LocalVariableGen[] vars, int l, int r) {

  /**
   * Sort local variables by index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeLocalVariables() {

  /**
   * Remove all local variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeLocalVariable(LocalVariableGen l) {

  /**
   * Remove a local variable, its slot will not be reused, if you do not use addLocalVariable
   * with an explicit index argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LocalVariableGen addLocalVariable(String name, Type type,
                                           InstructionHandle start,
                                           InstructionHandle end) {

  /**
   * Adds a local variable to this method and assigns an index automatically.
   *
   * @param name variable name
   * @param type variable type
   * @param start from where the variable is valid, if this is null,
   * it is valid from the start
   * @param end until where the variable is valid, if this is null,
   * it is valid to the end
   * @return new local variable object
   * @see LocalVariable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LocalVariableGen addLocalVariable(String name, Type type, int slot,
                                           InstructionHandle start,
                                           InstructionHandle end) {

  /**
   * Adds a local variable to this method.
   *
   * @param name variable name
   * @param type variable type
   * @param slot the index of the local variable, if type is long or double, the next available
   * index is slot+2
   * @param start from where the variable is valid
   * @param end until where the variable is valid
   * @return new local variable object
   * @see LocalVariable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public MethodGen(Method m, String class_name, ConstantPoolGen cp) {

  /**
   * Instantiate from existing method.
   *
   * @param m method
   * @param class_name class name containing this method
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public MethodGen(int access_flags, Type return_type, Type[] arg_types,
                   String[] arg_names, String method_name, String class_name,
                   InstructionList il, ConstantPoolGen cp) {

  /**
   * Declare method. If the method is non-static the constructor
   * automatically declares a local variable `$this' in slot 0. The
   * actual code is contained in the `il' parameter, which may further
   * manipulated by the user. But he must take care not to remove any
   * instruction (handles) that are still referenced from this object.
   *
   * For example one may not add a local variable and later remove the
   * instructions it refers to without causing havoc. It is safe
   * however if you remove that local variable, too.
   *
   * @param access_flags access qualifiers
   * @param return_type  method type
   * @param arg_types argument types
   * @param arg_names argument names (if this is null, default names will be provided
   * for them)
   * @param method_name name of method
   * @param class_name class name containing this method (may be null, if you don't care)
   * @param il instruction list associated with this method, may be null only for
   * abstract or native methods
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
public class MethodGen extends FieldGenOrMethodGen {

/**
 * Template class for building up a method. This is done by defining exception
 * handlers, adding thrown exceptions, local variables and attributes, whereas
 * the `LocalVariableTable' and `LineNumberTable' attributes will be set
 * automatically for the code. Use stripAttributes() if you don't like this.
 *
 * While generating code it may be necessary to insert NOP operations. You can
 * use the `removeNOPs' method to get rid off them.
 * The resulting method object can be obtained via the `getMethod()' method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @author  <A HREF="http://www.vmeng.com/beard">Patrick C. Beard</A> [setMaxStack()]
 * @see     InstructionList
 * @see     Method
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public MethodGen copy(String class_name, ConstantPoolGen cp) {

  /** @return deep copy of this method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public final String toString() {

  /**
   * Return string representation close to declaration format,
   * `public static void _main(String[]) throws IOException', e.g.
   *
   * @return String representation of the method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void update() {

  /** Call notify() method on all observers. This method is not called
   * automatically whenever the state has changed, but has to be
   * called by the user after he has finished editing the object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeObserver(MethodObserver o) {

  /** Remove observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void addObserver(MethodObserver o) {

  /** Add observer for this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public static int getMaxStack(ConstantPoolGen cp, InstructionList il, CodeExceptionGen[] et) {

  /**
   * Computes stack usage of an instruction list by performing control flow analysis.
   *
   * @return maximum stack depth used by method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void stripAttributes(boolean flag) { strip_attributes = flag; }

  /** Do not/Do produce attributes code attributesLineNumberTable and
   * LocalVariableTable, like javac -O
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void setMaxLocals() {

  /**
   * Compute maximum number of local variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void setMaxStack() {

  /**
   * Computes max. stack size by performing control flow analysis.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public String getClassName()                     { return class_name; }

  /** @return class that contains this method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void   setMaxStack(int m)  { max_stack = m; }

  /**
   * Set maximum stack size for this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void   setMaxLocals(int m)  { max_locals = m; }

  /**
   * Set maximum number of local variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeNOPs() {

  /**
   * Remove all NOPs from the instruction list (if possible) and update every
   * object refering to them, i.e., branch instructions, local variables and
   * exception handlers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public Method getMethod() {

  /**
   * Get method object. Never forget to call setMaxStack() or setMaxStack(max), respectively,
   * before calling this method (the same applies for max locals).
   *
   * @return method object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public Attribute[] getCodeAttributes() {

  /**
   * @return all attributes of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeCodeAttributes() {

  /**
   * Remove all code attributes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeCodeAttribute(Attribute a) { code_attrs_vec.remove(a); }

  /**
   * Remove a code attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void addCodeAttribute(Attribute a) { code_attrs_vec.add(a); }

  /**
   * Add an attribute to the code. Currently, the JVM knows about the
   * LineNumberTable, LocalVariableTable and StackMap attributes,
   * where the former two will be generated automatically and the
   * latter is used for the MIDP only. Other attributes will be
   * ignored by the JVM but do no harm.
   *
   * @param a attribute to be added
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private ExceptionTable getExceptionTable(ConstantPoolGen cp) {

  /**
   * @return `Exceptions' attribute of all the exceptions thrown by this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeExceptions() {

  /**
   * Remove all exceptions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeException(String c) {

  /**
   * Remove an exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void addException(String class_name) {

  /**
   * Add an exception possibly thrown by this method.
   *
   * @param class_name (fully qualified) name of exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private CodeException[] getCodeExceptions() {

  /**
   * @return code exceptions for `Code' attribute
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeExceptionHandlers() {

  /**
   * Remove all line numbers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeExceptionHandler(CodeExceptionGen c) {

  /**
   * Remove an exception handler.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public CodeExceptionGen addExceptionHandler(InstructionHandle start_pc,
                                              InstructionHandle end_pc,
                                              InstructionHandle handler_pc,
                                              ObjectType catch_type) {

  /**
   * Add an exception handler, i.e., specify region where a handler is active and an
   * instruction where the actual handling is done.
   *
   * @param start_pc Start of region (inclusive)
   * @param end_pc End of region (inclusive)
   * @param handler_pc Where handling is done
   * @param catch_type class type of handled exception or null if any
   * exception is handled
   * @return new exception handler object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LineNumberTable getLineNumberTable(ConstantPoolGen cp) {

  /**
   * @return `LineNumberTable' attribute of all the local variables of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeLineNumbers() {

  /**
   * Remove all line numbers.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeLineNumber(LineNumberGen l) {

  /**
   * Remove a line number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LineNumberGen addLineNumber(InstructionHandle ih, int src_line) {

  /**
   * Give an instruction a line number corresponding to the source code line.
   *
   * @param ih instruction to tag
   * @return new line number object
   * @see LineNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private void removeLocalVariableTypes() {

  /**
   * Remove all local variable types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private LocalVariableGen addLocalVariableType(String name, Type type, int slot,
                                           InstructionHandle start,
                                           InstructionHandle end) {

  /**
   * Adds a local variable type to this method.
   *
   * @param name variable name
   * @param type variable type
   * @param slot the index of the local variable, if type is long or double, the next available
   * index is slot+2
   * @param start from where the variable is valid
   * @param end until where the variable is valid
   * @return new local variable object
   * @see LocalVariable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LocalVariableTypeTable getLocalVariableTypeTable(ConstantPoolGen cp) {

  /**
   * @return `LocalVariableTypeTable' attribute of all the local variable
   * types of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LocalVariableTable getLocalVariableTable(ConstantPoolGen cp) {

  /**
   * @return `LocalVariableTable' attribute of all the local variables of this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  private static final void sort(LocalVariableGen[] vars, int l, int r) {

  /**
   * Sort local variables by index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeLocalVariables() {

  /**
   * Remove all local variables.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public void removeLocalVariable(LocalVariableGen l) {

  /**
   * Remove a local variable, its slot will not be reused, if you do not use addLocalVariable
   * with an explicit index argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LocalVariableGen addLocalVariable(String name, Type type,
                                           InstructionHandle start,
                                           InstructionHandle end) {

  /**
   * Adds a local variable to this method and assigns an index automatically.
   *
   * @param name variable name
   * @param type variable type
   * @param start from where the variable is valid, if this is null,
   * it is valid from the start
   * @param end until where the variable is valid, if this is null,
   * it is valid to the end
   * @return new local variable object
   * @see LocalVariable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public LocalVariableGen addLocalVariable(String name, Type type, int slot,
                                           InstructionHandle start,
                                           InstructionHandle end) {

  /**
   * Adds a local variable to this method.
   *
   * @param name variable name
   * @param type variable type
   * @param slot the index of the local variable, if type is long or double, the next available
   * index is slot+2
   * @param start from where the variable is valid
   * @param end until where the variable is valid
   * @return new local variable object
   * @see LocalVariable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public MethodGen(Method m, String class_name, ConstantPoolGen cp) {

  /**
   * Instantiate from existing method.
   *
   * @param m method
   * @param class_name class name containing this method
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
  public MethodGen(int access_flags, Type return_type, Type[] arg_types,
                   String[] arg_names, String method_name, String class_name,
                   InstructionList il, ConstantPoolGen cp) {

  /**
   * Declare method. If the method is non-static the constructor
   * automatically declares a local variable `$this' in slot 0. The
   * actual code is contained in the `il' parameter, which may further
   * manipulated by the user. But he must take care not to remove any
   * instruction (handles) that are still referenced from this object.
   *
   * For example one may not add a local variable and later remove the
   * instructions it refers to without causing havoc. It is safe
   * however if you remove that local variable, too.
   *
   * @param access_flags access qualifiers
   * @param return_type  method type
   * @param arg_types argument types
   * @param arg_names argument names (if this is null, default names will be provided
   * for them)
   * @param method_name name of method
   * @param class_name class name containing this method (may be null, if you don't care)
   * @param il instruction list associated with this method, may be null only for
   * abstract or native methods
   * @param cp constant pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/generic/MethodGen.java
public class MethodGen extends FieldGenOrMethodGen {

/**
 * Template class for building up a method. This is done by defining exception
 * handlers, adding thrown exceptions, local variables and attributes, whereas
 * the `LocalVariableTable' and `LineNumberTable' attributes will be set
 * automatically for the code. Use stripAttributes() if you don't like this.
 *
 * While generating code it may be necessary to insert NOP operations. You can
 * use the `removeNOPs' method to get rid off them.
 * The resulting method object can be obtained via the `getMethod()' method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @author  <A HREF="http://www.vmeng.com/beard">Patrick C. Beard</A> [setMaxStack()]
 * @see     InstructionList
 * @see     Method
 */
