_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void bogusMethod(Object... os) {

    /**
     * Emit a bogus method that just loads some string constants. This is to get the constants into the constant pool
     * for debugging purposes.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateNamedFunctionInvoker(MethodTypeForm typeForm) {

    /**
     * Generate bytecode for a NamedFunction invoker.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateLambdaFormInterpreterEntryPoint(String sig) {

    /**
     * Generate bytecode for a LambdaForm.vmentry which calls interpretWithArguments.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitPrimCast(Wrapper from, Wrapper to) {

    /**
     * Emit a type conversion bytecode casting from "from" to "to".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturn(Name onStack) {

    /**
     * Emits a return statement from a LF invoker. If required, the result type is cast to the correct return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitStoreResult(Name name) {

    /**
     * Store the name to its local, if necessary.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitGuardWithCatch(int pos) {

    /**
      * Emit bytecode for the guardWithCatch idiom.
      *
      * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithCatch):
      * <blockquote><pre>{@code
      *  guardWithCatch=Lambda(a0:L,a1:L,a2:L,a3:L,a4:L,a5:L,a6:L,a7:L)=>{
      *    t8:L=MethodHandle.invokeBasic(a4:L,a6:L,a7:L);
      *    t9:L=MethodHandleImpl.guardWithCatch(a1:L,a2:L,a3:L,t8:L);
      *   t10:I=MethodHandle.invokeBasic(a5:L,t9:L);t10:I}
      * }</pre></blockquote>
      *
      * It is compiled into bytecode equivalent of the following code:
      * <blockquote><pre>{@code
      *  try {
      *      return a1.invokeBasic(a6, a7);
      *  } catch (Throwable e) {
      *      if (!a2.isInstance(e)) throw e;
      *      return a3.invokeBasic(ex, a6, a7);
      *  }}
      */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitSelectAlternative(Name selectAlternativeName, Name invokeBasicName) {

    /**
     * Emit bytecode for the selectAlternative idiom.
     *
     * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithTest):
     * <blockquote><pre>{@code
     *   Lambda(a0:L,a1:I)=>{
     *     t2:I=foo.test(a1:I);
     *     t3:L=MethodHandleImpl.selectAlternative(t2:I,(MethodHandle(int)int),(MethodHandle(int)int));
     *     t4:I=MethodHandle.invokeBasic(t3:L,a1:I);t4:I}
     * }</pre></blockquote>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isGuardWithCatch(int pos) {

    /**
     * Check if i-th name is a start of GuardWithCatch idiom.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isSelectAlternative(int pos) {

    /**
     * Check if i-th name is a call to MethodHandleImpl.selectAlternative.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isLinkerMethodInvoke(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.linkToStatic, etc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isInvokeBasic(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean memberRefersTo(MemberName member, Class<?> declaringClass, String name) {

    /**
     * Check if MemberName is a call to a method named {@code name} in class {@code declaredClass}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitStaticInvoke(MemberName member, Name name) {

    /**
     * Emit an invoke for the given name, using the MemberName directly.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitInvoke(Name name) {

    /**
     * Emit an invoke for the given name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private byte[] generateCustomizedCodeBytes() {

    /**
     * Generate an invoker method for the passed {@link LambdaForm}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateCustomizedCode(LambdaForm form, MethodType invokerType) {

    /**
     * Generate customized bytecode for a given LambdaForm.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturnInsn(BasicType type) {

    /**
     * Emits an actual return instruction conforming to the given return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean assertStaticType(Class<?> cls, Name n) {

    /** Update localClasses type map.  Return true if the information is already present. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitImplicitConversion(BasicType ptype, Class<?> pclass, Object arg) {

    /**
     * Emit an implicit conversion for an argument which must be of the given pclass.
     * This is usually a no-op, except when pclass is a subword type or a reference other than Object or an interface.
     *
     * @param ptype type of value present on stack
     * @param pclass type of value required on stack
     * @param arg compile-time representation of value on stack (Node, constant) or null if none
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitUnboxing(Wrapper wrapper) {

    /**
     * Emit an unboxing call (plus preceding checkcast).
     *
     * @param wrapper wrapper type class to unbox.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitBoxing(Wrapper wrapper) {

    /**
     * Emit a boxing call.
     *
     * @param wrapper primitive type class to box.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFileEpilogue() {

    /**
     * Tear down class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFilePrologue() {

    /**
     * Set up class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static Class<?> loadAndInitializeInvokerClass(byte[] classBytes, Object[] patches) {

    /**
     * Define a given class as anonymous class in the runtime system.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private MemberName loadMethod(byte[] classFile) {

    /**
     * Extract the MemberName of a newly-defined method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static int getConstantPoolSize(byte[] classFile) {

    /**
     * Extract the number of constant pool entries from a given class file.
     *
     * @param classFile the bytes of the class file in question.
     * @return the number of entries in the constant pool.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static File DUMP_CLASS_FILES_DIR;

    /** debugging flag for saving generated class files */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static HashMap<String,Integer> DUMP_CLASS_FILES_COUNTERS;

    /** instance counters for dumped classes */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, LambdaForm form, MethodType invokerType) {

    /** For generating customized code for a single LambdaForm. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, String invokerName, MethodType invokerType) {

    /** For generating LambdaForm interpreter entry points. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(LambdaForm lambdaForm, int localsMapSize,
                                     String className, String invokerName, MethodType invokerType) {

    /** Main constructor; other constructors delegate to this one. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private ClassWriter cw;

    /** ASM bytecode generation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final int[]       localsMap;    // index

    /** Info about local variables in compiled lambda form */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String sourceFile;

    /** Name of the source file (for stack trace printing). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String className;

    /** Name of new class */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String superName = OBJ;

    /** Name of its super class*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String MH      = "java/lang/invoke/MethodHandle";

    /** Define class names for convenience. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
class InvokerBytecodeGenerator {

/**
 * Code generation backend for LambdaForm.
 * <p>
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void bogusMethod(Object... os) {

    /**
     * Emit a bogus method that just loads some string constants. This is to get the constants into the constant pool
     * for debugging purposes.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateNamedFunctionInvoker(MethodTypeForm typeForm) {

    /**
     * Generate bytecode for a NamedFunction invoker.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateLambdaFormInterpreterEntryPoint(String sig) {

    /**
     * Generate bytecode for a LambdaForm.vmentry which calls interpretWithArguments.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitPrimCast(Wrapper from, Wrapper to) {

    /**
     * Emit a type conversion bytecode casting from "from" to "to".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturn(Name onStack) {

    /**
     * Emits a return statement from a LF invoker. If required, the result type is cast to the correct return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitStoreResult(Name name) {

    /**
     * Store the name to its local, if necessary.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitGuardWithCatch(int pos) {

    /**
      * Emit bytecode for the guardWithCatch idiom.
      *
      * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithCatch):
      * <blockquote><pre>{@code
      *  guardWithCatch=Lambda(a0:L,a1:L,a2:L,a3:L,a4:L,a5:L,a6:L,a7:L)=>{
      *    t8:L=MethodHandle.invokeBasic(a4:L,a6:L,a7:L);
      *    t9:L=MethodHandleImpl.guardWithCatch(a1:L,a2:L,a3:L,t8:L);
      *   t10:I=MethodHandle.invokeBasic(a5:L,t9:L);t10:I}
      * }</pre></blockquote>
      *
      * It is compiled into bytecode equivalent of the following code:
      * <blockquote><pre>{@code
      *  try {
      *      return a1.invokeBasic(a6, a7);
      *  } catch (Throwable e) {
      *      if (!a2.isInstance(e)) throw e;
      *      return a3.invokeBasic(ex, a6, a7);
      *  }}
      */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitSelectAlternative(Name selectAlternativeName, Name invokeBasicName) {

    /**
     * Emit bytecode for the selectAlternative idiom.
     *
     * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithTest):
     * <blockquote><pre>{@code
     *   Lambda(a0:L,a1:I)=>{
     *     t2:I=foo.test(a1:I);
     *     t3:L=MethodHandleImpl.selectAlternative(t2:I,(MethodHandle(int)int),(MethodHandle(int)int));
     *     t4:I=MethodHandle.invokeBasic(t3:L,a1:I);t4:I}
     * }</pre></blockquote>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isGuardWithCatch(int pos) {

    /**
     * Check if i-th name is a start of GuardWithCatch idiom.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isSelectAlternative(int pos) {

    /**
     * Check if i-th name is a call to MethodHandleImpl.selectAlternative.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isLinkerMethodInvoke(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.linkToStatic, etc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isInvokeBasic(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean memberRefersTo(MemberName member, Class<?> declaringClass, String name) {

    /**
     * Check if MemberName is a call to a method named {@code name} in class {@code declaredClass}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitStaticInvoke(MemberName member, Name name) {

    /**
     * Emit an invoke for the given name, using the MemberName directly.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitInvoke(Name name) {

    /**
     * Emit an invoke for the given name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private byte[] generateCustomizedCodeBytes() {

    /**
     * Generate an invoker method for the passed {@link LambdaForm}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateCustomizedCode(LambdaForm form, MethodType invokerType) {

    /**
     * Generate customized bytecode for a given LambdaForm.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturnInsn(BasicType type) {

    /**
     * Emits an actual return instruction conforming to the given return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean assertStaticType(Class<?> cls, Name n) {

    /** Update localClasses type map.  Return true if the information is already present. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitImplicitConversion(BasicType ptype, Class<?> pclass, Object arg) {

    /**
     * Emit an implicit conversion for an argument which must be of the given pclass.
     * This is usually a no-op, except when pclass is a subword type or a reference other than Object or an interface.
     *
     * @param ptype type of value present on stack
     * @param pclass type of value required on stack
     * @param arg compile-time representation of value on stack (Node, constant) or null if none
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitUnboxing(Wrapper wrapper) {

    /**
     * Emit an unboxing call (plus preceding checkcast).
     *
     * @param wrapper wrapper type class to unbox.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitBoxing(Wrapper wrapper) {

    /**
     * Emit a boxing call.
     *
     * @param wrapper primitive type class to box.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFileEpilogue() {

    /**
     * Tear down class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFilePrologue() {

    /**
     * Set up class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static Class<?> loadAndInitializeInvokerClass(byte[] classBytes, Object[] patches) {

    /**
     * Define a given class as anonymous class in the runtime system.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private MemberName loadMethod(byte[] classFile) {

    /**
     * Extract the MemberName of a newly-defined method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static int getConstantPoolSize(byte[] classFile) {

    /**
     * Extract the number of constant pool entries from a given class file.
     *
     * @param classFile the bytes of the class file in question.
     * @return the number of entries in the constant pool.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static File DUMP_CLASS_FILES_DIR;

    /** debugging flag for saving generated class files */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static HashMap<String,Integer> DUMP_CLASS_FILES_COUNTERS;

    /** instance counters for dumped classes */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, LambdaForm form, MethodType invokerType) {

    /** For generating customized code for a single LambdaForm. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, String invokerName, MethodType invokerType) {

    /** For generating LambdaForm interpreter entry points. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(LambdaForm lambdaForm, int localsMapSize,
                                     String className, String invokerName, MethodType invokerType) {

    /** Main constructor; other constructors delegate to this one. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private ClassWriter cw;

    /** ASM bytecode generation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final int[]       localsMap;    // index

    /** Info about local variables in compiled lambda form */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String sourceFile;

    /** Name of the source file (for stack trace printing). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String className;

    /** Name of new class */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String superName = OBJ;

    /** Name of its super class*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String MH      = "java/lang/invoke/MethodHandle";

    /** Define class names for convenience. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
class InvokerBytecodeGenerator {

/**
 * Code generation backend for LambdaForm.
 * <p>
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void bogusMethod(Object... os) {

    /**
     * Emit a bogus method that just loads some string constants. This is to get the constants into the constant pool
     * for debugging purposes.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateNamedFunctionInvoker(MethodTypeForm typeForm) {

    /**
     * Generate bytecode for a NamedFunction invoker.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateLambdaFormInterpreterEntryPoint(String sig) {

    /**
     * Generate bytecode for a LambdaForm.vmentry which calls interpretWithArguments.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitPrimCast(Wrapper from, Wrapper to) {

    /**
     * Emit a type conversion bytecode casting from "from" to "to".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturn(Name onStack) {

    /**
     * Emits a return statement from a LF invoker. If required, the result type is cast to the correct return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitStoreResult(Name name) {

    /**
     * Store the name to its local, if necessary.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitGuardWithCatch(int pos) {

    /**
      * Emit bytecode for the guardWithCatch idiom.
      *
      * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithCatch):
      * <blockquote><pre>{@code
      *  guardWithCatch=Lambda(a0:L,a1:L,a2:L,a3:L,a4:L,a5:L,a6:L,a7:L)=>{
      *    t8:L=MethodHandle.invokeBasic(a4:L,a6:L,a7:L);
      *    t9:L=MethodHandleImpl.guardWithCatch(a1:L,a2:L,a3:L,t8:L);
      *   t10:I=MethodHandle.invokeBasic(a5:L,t9:L);t10:I}
      * }</pre></blockquote>
      *
      * It is compiled into bytecode equivalent of the following code:
      * <blockquote><pre>{@code
      *  try {
      *      return a1.invokeBasic(a6, a7);
      *  } catch (Throwable e) {
      *      if (!a2.isInstance(e)) throw e;
      *      return a3.invokeBasic(ex, a6, a7);
      *  }}
      */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitSelectAlternative(Name selectAlternativeName, Name invokeBasicName) {

    /**
     * Emit bytecode for the selectAlternative idiom.
     *
     * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithTest):
     * <blockquote><pre>{@code
     *   Lambda(a0:L,a1:I)=>{
     *     t2:I=foo.test(a1:I);
     *     t3:L=MethodHandleImpl.selectAlternative(t2:I,(MethodHandle(int)int),(MethodHandle(int)int));
     *     t4:I=MethodHandle.invokeBasic(t3:L,a1:I);t4:I}
     * }</pre></blockquote>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isGuardWithCatch(int pos) {

    /**
     * Check if i-th name is a start of GuardWithCatch idiom.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isSelectAlternative(int pos) {

    /**
     * Check if i-th name is a call to MethodHandleImpl.selectAlternative.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isLinkerMethodInvoke(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.linkToStatic, etc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isInvokeBasic(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean memberRefersTo(MemberName member, Class<?> declaringClass, String name) {

    /**
     * Check if MemberName is a call to a method named {@code name} in class {@code declaredClass}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitStaticInvoke(MemberName member, Name name) {

    /**
     * Emit an invoke for the given name, using the MemberName directly.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitInvoke(Name name) {

    /**
     * Emit an invoke for the given name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private byte[] generateCustomizedCodeBytes() {

    /**
     * Generate an invoker method for the passed {@link LambdaForm}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateCustomizedCode(LambdaForm form, MethodType invokerType) {

    /**
     * Generate customized bytecode for a given LambdaForm.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturnInsn(BasicType type) {

    /**
     * Emits an actual return instruction conforming to the given return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean assertStaticType(Class<?> cls, Name n) {

    /** Update localClasses type map.  Return true if the information is already present. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitImplicitConversion(BasicType ptype, Class<?> pclass, Object arg) {

    /**
     * Emit an implicit conversion for an argument which must be of the given pclass.
     * This is usually a no-op, except when pclass is a subword type or a reference other than Object or an interface.
     *
     * @param ptype type of value present on stack
     * @param pclass type of value required on stack
     * @param arg compile-time representation of value on stack (Node, constant) or null if none
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitUnboxing(Wrapper wrapper) {

    /**
     * Emit an unboxing call (plus preceding checkcast).
     *
     * @param wrapper wrapper type class to unbox.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitBoxing(Wrapper wrapper) {

    /**
     * Emit a boxing call.
     *
     * @param wrapper primitive type class to box.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFileEpilogue() {

    /**
     * Tear down class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFilePrologue() {

    /**
     * Set up class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static Class<?> loadAndInitializeInvokerClass(byte[] classBytes, Object[] patches) {

    /**
     * Define a given class as anonymous class in the runtime system.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private MemberName loadMethod(byte[] classFile) {

    /**
     * Extract the MemberName of a newly-defined method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static int getConstantPoolSize(byte[] classFile) {

    /**
     * Extract the number of constant pool entries from a given class file.
     *
     * @param classFile the bytes of the class file in question.
     * @return the number of entries in the constant pool.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static File DUMP_CLASS_FILES_DIR;

    /** debugging flag for saving generated class files */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static HashMap<String,Integer> DUMP_CLASS_FILES_COUNTERS;

    /** instance counters for dumped classes */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, LambdaForm form, MethodType invokerType) {

    /** For generating customized code for a single LambdaForm. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, String invokerName, MethodType invokerType) {

    /** For generating LambdaForm interpreter entry points. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(LambdaForm lambdaForm, int localsMapSize,
                                     String className, String invokerName, MethodType invokerType) {

    /** Main constructor; other constructors delegate to this one. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private ClassWriter cw;

    /** ASM bytecode generation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final int[]       localsMap;    // index

    /** Info about local variables in compiled lambda form */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String sourceFile;

    /** Name of the source file (for stack trace printing). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String className;

    /** Name of new class */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String superName = OBJ;

    /** Name of its super class*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String MH      = "java/lang/invoke/MethodHandle";

    /** Define class names for convenience. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
class InvokerBytecodeGenerator {

/**
 * Code generation backend for LambdaForm.
 * <p>
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void bogusMethod(Object... os) {

    /**
     * Emit a bogus method that just loads some string constants. This is to get the constants into the constant pool
     * for debugging purposes.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateNamedFunctionInvoker(MethodTypeForm typeForm) {

    /**
     * Generate bytecode for a NamedFunction invoker.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateLambdaFormInterpreterEntryPoint(String sig) {

    /**
     * Generate bytecode for a LambdaForm.vmentry which calls interpretWithArguments.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitPrimCast(Wrapper from, Wrapper to) {

    /**
     * Emit a type conversion bytecode casting from "from" to "to".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturn(Name onStack) {

    /**
     * Emits a return statement from a LF invoker. If required, the result type is cast to the correct return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitStoreResult(Name name) {

    /**
     * Store the name to its local, if necessary.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitGuardWithCatch(int pos) {

    /**
      * Emit bytecode for the guardWithCatch idiom.
      *
      * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithCatch):
      * <blockquote><pre>{@code
      *  guardWithCatch=Lambda(a0:L,a1:L,a2:L,a3:L,a4:L,a5:L,a6:L,a7:L)=>{
      *    t8:L=MethodHandle.invokeBasic(a4:L,a6:L,a7:L);
      *    t9:L=MethodHandleImpl.guardWithCatch(a1:L,a2:L,a3:L,t8:L);
      *   t10:I=MethodHandle.invokeBasic(a5:L,t9:L);t10:I}
      * }</pre></blockquote>
      *
      * It is compiled into bytecode equivalent of the following code:
      * <blockquote><pre>{@code
      *  try {
      *      return a1.invokeBasic(a6, a7);
      *  } catch (Throwable e) {
      *      if (!a2.isInstance(e)) throw e;
      *      return a3.invokeBasic(ex, a6, a7);
      *  }}
      */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitSelectAlternative(Name selectAlternativeName, Name invokeBasicName) {

    /**
     * Emit bytecode for the selectAlternative idiom.
     *
     * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithTest):
     * <blockquote><pre>{@code
     *   Lambda(a0:L,a1:I)=>{
     *     t2:I=foo.test(a1:I);
     *     t3:L=MethodHandleImpl.selectAlternative(t2:I,(MethodHandle(int)int),(MethodHandle(int)int));
     *     t4:I=MethodHandle.invokeBasic(t3:L,a1:I);t4:I}
     * }</pre></blockquote>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isGuardWithCatch(int pos) {

    /**
     * Check if i-th name is a start of GuardWithCatch idiom.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isSelectAlternative(int pos) {

    /**
     * Check if i-th name is a call to MethodHandleImpl.selectAlternative.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isLinkerMethodInvoke(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.linkToStatic, etc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isInvokeBasic(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean memberRefersTo(MemberName member, Class<?> declaringClass, String name) {

    /**
     * Check if MemberName is a call to a method named {@code name} in class {@code declaredClass}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitStaticInvoke(MemberName member, Name name) {

    /**
     * Emit an invoke for the given name, using the MemberName directly.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitInvoke(Name name) {

    /**
     * Emit an invoke for the given name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private byte[] generateCustomizedCodeBytes() {

    /**
     * Generate an invoker method for the passed {@link LambdaForm}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateCustomizedCode(LambdaForm form, MethodType invokerType) {

    /**
     * Generate customized bytecode for a given LambdaForm.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturnInsn(BasicType type) {

    /**
     * Emits an actual return instruction conforming to the given return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean assertStaticType(Class<?> cls, Name n) {

    /** Update localClasses type map.  Return true if the information is already present. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitImplicitConversion(BasicType ptype, Class<?> pclass, Object arg) {

    /**
     * Emit an implicit conversion for an argument which must be of the given pclass.
     * This is usually a no-op, except when pclass is a subword type or a reference other than Object or an interface.
     *
     * @param ptype type of value present on stack
     * @param pclass type of value required on stack
     * @param arg compile-time representation of value on stack (Node, constant) or null if none
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitUnboxing(Wrapper wrapper) {

    /**
     * Emit an unboxing call (plus preceding checkcast).
     *
     * @param wrapper wrapper type class to unbox.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitBoxing(Wrapper wrapper) {

    /**
     * Emit a boxing call.
     *
     * @param wrapper primitive type class to box.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFileEpilogue() {

    /**
     * Tear down class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFilePrologue() {

    /**
     * Set up class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static Class<?> loadAndInitializeInvokerClass(byte[] classBytes, Object[] patches) {

    /**
     * Define a given class as anonymous class in the runtime system.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private MemberName loadMethod(byte[] classFile) {

    /**
     * Extract the MemberName of a newly-defined method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static int getConstantPoolSize(byte[] classFile) {

    /**
     * Extract the number of constant pool entries from a given class file.
     *
     * @param classFile the bytes of the class file in question.
     * @return the number of entries in the constant pool.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static File DUMP_CLASS_FILES_DIR;

    /** debugging flag for saving generated class files */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static HashMap<String,Integer> DUMP_CLASS_FILES_COUNTERS;

    /** instance counters for dumped classes */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, LambdaForm form, MethodType invokerType) {

    /** For generating customized code for a single LambdaForm. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, String invokerName, MethodType invokerType) {

    /** For generating LambdaForm interpreter entry points. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(LambdaForm lambdaForm, int localsMapSize,
                                     String className, String invokerName, MethodType invokerType) {

    /** Main constructor; other constructors delegate to this one. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private ClassWriter cw;

    /** ASM bytecode generation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final int[]       localsMap;    // index

    /** Info about local variables in compiled lambda form */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String sourceFile;

    /** Name of the source file (for stack trace printing). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String className;

    /** Name of new class */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String superName = OBJ;

    /** Name of its super class*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String MH      = "java/lang/invoke/MethodHandle";

    /** Define class names for convenience. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
class InvokerBytecodeGenerator {

/**
 * Code generation backend for LambdaForm.
 * <p>
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void bogusMethod(Object... os) {

    /**
     * Emit a bogus method that just loads some string constants. This is to get the constants into the constant pool
     * for debugging purposes.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateNamedFunctionInvoker(MethodTypeForm typeForm) {

    /**
     * Generate bytecode for a NamedFunction invoker.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateLambdaFormInterpreterEntryPoint(String sig) {

    /**
     * Generate bytecode for a LambdaForm.vmentry which calls interpretWithArguments.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitPrimCast(Wrapper from, Wrapper to) {

    /**
     * Emit a type conversion bytecode casting from "from" to "to".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturn(Name onStack) {

    /**
     * Emits a return statement from a LF invoker. If required, the result type is cast to the correct return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitStoreResult(Name name) {

    /**
     * Store the name to its local, if necessary.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitGuardWithCatch(int pos) {

    /**
      * Emit bytecode for the guardWithCatch idiom.
      *
      * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithCatch):
      * <blockquote><pre>{@code
      *  guardWithCatch=Lambda(a0:L,a1:L,a2:L,a3:L,a4:L,a5:L,a6:L,a7:L)=>{
      *    t8:L=MethodHandle.invokeBasic(a4:L,a6:L,a7:L);
      *    t9:L=MethodHandleImpl.guardWithCatch(a1:L,a2:L,a3:L,t8:L);
      *   t10:I=MethodHandle.invokeBasic(a5:L,t9:L);t10:I}
      * }</pre></blockquote>
      *
      * It is compiled into bytecode equivalent of the following code:
      * <blockquote><pre>{@code
      *  try {
      *      return a1.invokeBasic(a6, a7);
      *  } catch (Throwable e) {
      *      if (!a2.isInstance(e)) throw e;
      *      return a3.invokeBasic(ex, a6, a7);
      *  }}
      */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private Name emitSelectAlternative(Name selectAlternativeName, Name invokeBasicName) {

    /**
     * Emit bytecode for the selectAlternative idiom.
     *
     * The pattern looks like (Cf. MethodHandleImpl.makeGuardWithTest):
     * <blockquote><pre>{@code
     *   Lambda(a0:L,a1:I)=>{
     *     t2:I=foo.test(a1:I);
     *     t3:L=MethodHandleImpl.selectAlternative(t2:I,(MethodHandle(int)int),(MethodHandle(int)int));
     *     t4:I=MethodHandle.invokeBasic(t3:L,a1:I);t4:I}
     * }</pre></blockquote>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isGuardWithCatch(int pos) {

    /**
     * Check if i-th name is a start of GuardWithCatch idiom.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isSelectAlternative(int pos) {

    /**
     * Check if i-th name is a call to MethodHandleImpl.selectAlternative.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isLinkerMethodInvoke(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.linkToStatic, etc.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean isInvokeBasic(Name name) {

    /**
     * Check if MemberName is a call to MethodHandle.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean memberRefersTo(MemberName member, Class<?> declaringClass, String name) {

    /**
     * Check if MemberName is a call to a method named {@code name} in class {@code declaredClass}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitStaticInvoke(MemberName member, Name name) {

    /**
     * Emit an invoke for the given name, using the MemberName directly.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    void emitInvoke(Name name) {

    /**
     * Emit an invoke for the given name.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private byte[] generateCustomizedCodeBytes() {

    /**
     * Generate an invoker method for the passed {@link LambdaForm}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    static MemberName generateCustomizedCode(LambdaForm form, MethodType invokerType) {

    /**
     * Generate customized bytecode for a given LambdaForm.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitReturnInsn(BasicType type) {

    /**
     * Emits an actual return instruction conforming to the given return type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private boolean assertStaticType(Class<?> cls, Name n) {

    /** Update localClasses type map.  Return true if the information is already present. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitImplicitConversion(BasicType ptype, Class<?> pclass, Object arg) {

    /**
     * Emit an implicit conversion for an argument which must be of the given pclass.
     * This is usually a no-op, except when pclass is a subword type or a reference other than Object or an interface.
     *
     * @param ptype type of value present on stack
     * @param pclass type of value required on stack
     * @param arg compile-time representation of value on stack (Node, constant) or null if none
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitUnboxing(Wrapper wrapper) {

    /**
     * Emit an unboxing call (plus preceding checkcast).
     *
     * @param wrapper wrapper type class to unbox.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void emitBoxing(Wrapper wrapper) {

    /**
     * Emit a boxing call.
     *
     * @param wrapper primitive type class to box.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFileEpilogue() {

    /**
     * Tear down class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private void classFilePrologue() {

    /**
     * Set up class file generation.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static Class<?> loadAndInitializeInvokerClass(byte[] classBytes, Object[] patches) {

    /**
     * Define a given class as anonymous class in the runtime system.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private MemberName loadMethod(byte[] classFile) {

    /**
     * Extract the MemberName of a newly-defined method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static int getConstantPoolSize(byte[] classFile) {

    /**
     * Extract the number of constant pool entries from a given class file.
     *
     * @param classFile the bytes of the class file in question.
     * @return the number of entries in the constant pool.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static File DUMP_CLASS_FILES_DIR;

    /** debugging flag for saving generated class files */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final static HashMap<String,Integer> DUMP_CLASS_FILES_COUNTERS;

    /** instance counters for dumped classes */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, LambdaForm form, MethodType invokerType) {

    /** For generating customized code for a single LambdaForm. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(String className, String invokerName, MethodType invokerType) {

    /** For generating LambdaForm interpreter entry points. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private InvokerBytecodeGenerator(LambdaForm lambdaForm, int localsMapSize,
                                     String className, String invokerName, MethodType invokerType) {

    /** Main constructor; other constructors delegate to this one. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private ClassWriter cw;

    /** ASM bytecode generation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final int[]       localsMap;    // index

    /** Info about local variables in compiled lambda form */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String sourceFile;

    /** Name of the source file (for stack trace printing). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private final String className;

    /** Name of new class */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String superName = OBJ;

    /** Name of its super class*/
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
    private static final String MH      = "java/lang/invoke/MethodHandle";

    /** Define class names for convenience. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/InvokerBytecodeGenerator.java
class InvokerBytecodeGenerator {

/**
 * Code generation backend for LambdaForm.
 * <p>
 * @author John Rose, JSR 292 EG
 */
