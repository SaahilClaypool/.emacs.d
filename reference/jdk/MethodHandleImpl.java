_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle varargsArray(Class<?> arrayType, int nargs) {

    /** Return a method handle that takes the indicated number of
     *  typed arguments and returns an array of them.
     *  The type argument is the array type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static MethodHandle fillToRight(int nargs) {

    /** fill_array_to_right(N).invoke(a, argL..arg[N-1])
     *  fills a[L]..a[N-1] with corresponding arguments,
     *  and then returns a.  The value L is a global constant (LEFT_ARGS).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle varargsArray(int nargs) {

    /** Return a method handle that takes the indicated number of Object
     *  arguments and returns an Object array of them, as if for varargs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static MethodHandle findCollector(String name, int nargs, Class<?> rtype, Class<?>... ptypes) {

    /// Collection of multiple arguments.
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static final class IntrinsicMethodHandle extends DelegatingMethodHandle {

    /** Mark arbitrary method handle as intrinsic.
     * InvokerBytecodeGenerator uses this info to produce more efficient bytecode shape. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    /*non-public*/

    /** Intrinsic IDs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static final class WrappedMember extends DelegatingMethodHandle {

    /** This subclass allows a wrapped method handle to be re-associated with an arbitrary member name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static

    /**
     * Create an alias for the method handle which, when called,
     * appears to be called from the same class loader and protection domain
     * as hostClass.
     * This is an expensive no-op unless the method which is called
     * is sensitive to its caller.  A small number of system methods
     * are in this category, including Class.forName and Method.invoke.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    @LambdaForm.Hidden

    /** Prepend an element {@code elem} to an {@code array}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    @LambdaForm.Hidden

    /**
     * Intrinsified during LambdaForm compilation
     * (see {@link InvokerBytecodeGenerator#emitGuardWithCatch emitGuardWithCatch}).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static LambdaForm makeGuardWithCatchForm(MethodType basicType) {

    /**
     * The LambaForm shape for catchException combinator is the following:
     * <blockquote><pre>{@code
     *  guardWithCatch=Lambda(a0:L,a1:L,a2:L)=>{
     *    t3:L=BoundMethodHandle$Species_LLLLL.argL0(a0:L);
     *    t4:L=BoundMethodHandle$Species_LLLLL.argL1(a0:L);
     *    t5:L=BoundMethodHandle$Species_LLLLL.argL2(a0:L);
     *    t6:L=BoundMethodHandle$Species_LLLLL.argL3(a0:L);
     *    t7:L=BoundMethodHandle$Species_LLLLL.argL4(a0:L);
     *    t8:L=MethodHandle.invokeBasic(t6:L,a1:L,a2:L);
     *    t9:L=MethodHandleImpl.guardWithCatch(t3:L,t4:L,t5:L,t8:L);
     *   t10:I=MethodHandle.invokeBasic(t7:L,t9:L);t10:I}
     * }</pre></blockquote>
     *
     * argL0 and argL2 are target and catcher method handles. argL1 is exception class.
     * argL3 and argL4 are auxiliary method handles: argL3 boxes arguments and wraps them into Object[]
     * (ValueConversions.array()) and argL4 unboxes result if necessary (ValueConversions.unbox()).
     *
     * Having t8 and t10 passed outside and not hardcoded into a lambda form allows to share lambda forms
     * among catchException combinators with the same basic type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static class CountingWrapper extends DelegatingMethodHandle {

    /**
     * Counting method handle. It has 2 states: counting and non-counting.
     * It is in counting state for the first n invocations and then transitions to non-counting state.
     * Behavior in counting and non-counting states is determined by lambda forms produced by
     * countingFormProducer & nonCountingFormProducer respectively.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static final Function<MethodHandle, LambdaForm> PRODUCE_REINVOKER_FORM = new Function<MethodHandle, LambdaForm>() {

    /** Constructs simple reinvoker lambda form for a particular method handle */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static final Function<MethodHandle, LambdaForm> PRODUCE_BLOCK_INLINING_FORM = new Function<MethodHandle, LambdaForm>() {

    /** Constructs reinvoker lambda form which block inlining during JIT-compilation for a particular method handle */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static

    /**
     * Block inlining during JIT-compilation of a target method handle if it hasn't been invoked enough times.
     * Corresponding LambdaForm has @DontInline when compiled into bytecode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle makeCollectArguments(MethodHandle target,
                MethodHandle collector, int collectArgPos, boolean retainOriginalArgs) {

    /** Factory method:  Collect or filter selected argument(s). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static class Lazy {

    /**
     * Pre-initialized NamedFunctions for bootstrapping purposes.
     * Factored in an inner class to delay initialization until first usage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle makeSpreadArguments(MethodHandle target,
                                            Class<?> spreadArgType, int spreadArgPos, int spreadArgCount) {

    /** Factory method:  Spread selected argument. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static Object valueConversion(Class<?> src, Class<?> dst, boolean strict, boolean monobox) {

    /**
     * Find a conversion function from the given source to the given destination.
     * This conversion function will be used as a LF NamedFunction.
     * Return a Class object if a simple cast is needed.
     * Return void.class if void is involved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    @ForceInline

    /**
     * Identity function, with reference cast.
     * @param t an arbitrary reference type
     * @param x an arbitrary reference value
     * @return the same value x
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle makePairwiseConvert(MethodHandle target, MethodType srcType,
                                            boolean strict, boolean monobox) {

    /**
     * Create a JVM-level adapter method handle to conform the given method
     * handle to the similar newType, using only pairwise argument conversions.
     * For each argument, convert incoming argument to the exact type needed.
     * The argument conversions allowed are casting, boxing and unboxing,
     * integral widening or narrowing, and floating point widening or narrowing.
     * @param srcType required call type
     * @param target original method handle
     * @param strict if true, only asType conversions are allowed; if false, explicitCastArguments conversions allowed
     * @param monobox if true, unboxing conversions are assumed to be exactly typed (Integer to int only, not long or double)
     * @return an adapter to the original handle with the desired new type,
     *          or the original target if the types are already identical
     *          or null if the adaptation cannot be made
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
        static final int GETTER_INDEX = 0, SETTER_INDEX = 1, INDEX_LIMIT = 2;

        /// Support for array element access
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static void initStatics() {

    /// Factory methods to create method handles:
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
/*non-public*/ abstract class MethodHandleImpl {

/**
 * Trusted implementation code for MethodHandle.
 * @author jrose
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle varargsArray(Class<?> arrayType, int nargs) {

    /** Return a method handle that takes the indicated number of
     *  typed arguments and returns an array of them.
     *  The type argument is the array type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static MethodHandle fillToRight(int nargs) {

    /** fill_array_to_right(N).invoke(a, argL..arg[N-1])
     *  fills a[L]..a[N-1] with corresponding arguments,
     *  and then returns a.  The value L is a global constant (LEFT_ARGS).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle varargsArray(int nargs) {

    /** Return a method handle that takes the indicated number of Object
     *  arguments and returns an Object array of them, as if for varargs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static MethodHandle findCollector(String name, int nargs, Class<?> rtype, Class<?>... ptypes) {

    /// Collection of multiple arguments.
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static final class IntrinsicMethodHandle extends DelegatingMethodHandle {

    /** Mark arbitrary method handle as intrinsic.
     * InvokerBytecodeGenerator uses this info to produce more efficient bytecode shape. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    /*non-public*/

    /** Intrinsic IDs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static final class WrappedMember extends DelegatingMethodHandle {

    /** This subclass allows a wrapped method handle to be re-associated with an arbitrary member name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static

    /**
     * Create an alias for the method handle which, when called,
     * appears to be called from the same class loader and protection domain
     * as hostClass.
     * This is an expensive no-op unless the method which is called
     * is sensitive to its caller.  A small number of system methods
     * are in this category, including Class.forName and Method.invoke.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    @LambdaForm.Hidden

    /** Prepend an element {@code elem} to an {@code array}. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    @LambdaForm.Hidden

    /**
     * Intrinsified during LambdaForm compilation
     * (see {@link InvokerBytecodeGenerator#emitGuardWithCatch emitGuardWithCatch}).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static LambdaForm makeGuardWithCatchForm(MethodType basicType) {

    /**
     * The LambaForm shape for catchException combinator is the following:
     * <blockquote><pre>{@code
     *  guardWithCatch=Lambda(a0:L,a1:L,a2:L)=>{
     *    t3:L=BoundMethodHandle$Species_LLLLL.argL0(a0:L);
     *    t4:L=BoundMethodHandle$Species_LLLLL.argL1(a0:L);
     *    t5:L=BoundMethodHandle$Species_LLLLL.argL2(a0:L);
     *    t6:L=BoundMethodHandle$Species_LLLLL.argL3(a0:L);
     *    t7:L=BoundMethodHandle$Species_LLLLL.argL4(a0:L);
     *    t8:L=MethodHandle.invokeBasic(t6:L,a1:L,a2:L);
     *    t9:L=MethodHandleImpl.guardWithCatch(t3:L,t4:L,t5:L,t8:L);
     *   t10:I=MethodHandle.invokeBasic(t7:L,t9:L);t10:I}
     * }</pre></blockquote>
     *
     * argL0 and argL2 are target and catcher method handles. argL1 is exception class.
     * argL3 and argL4 are auxiliary method handles: argL3 boxes arguments and wraps them into Object[]
     * (ValueConversions.array()) and argL4 unboxes result if necessary (ValueConversions.unbox()).
     *
     * Having t8 and t10 passed outside and not hardcoded into a lambda form allows to share lambda forms
     * among catchException combinators with the same basic type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static class CountingWrapper extends DelegatingMethodHandle {

    /**
     * Counting method handle. It has 2 states: counting and non-counting.
     * It is in counting state for the first n invocations and then transitions to non-counting state.
     * Behavior in counting and non-counting states is determined by lambda forms produced by
     * countingFormProducer & nonCountingFormProducer respectively.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static final Function<MethodHandle, LambdaForm> PRODUCE_REINVOKER_FORM = new Function<MethodHandle, LambdaForm>() {

    /** Constructs simple reinvoker lambda form for a particular method handle */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    private static final Function<MethodHandle, LambdaForm> PRODUCE_BLOCK_INLINING_FORM = new Function<MethodHandle, LambdaForm>() {

    /** Constructs reinvoker lambda form which block inlining during JIT-compilation for a particular method handle */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static

    /**
     * Block inlining during JIT-compilation of a target method handle if it hasn't been invoked enough times.
     * Corresponding LambdaForm has @DontInline when compiled into bytecode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle makeCollectArguments(MethodHandle target,
                MethodHandle collector, int collectArgPos, boolean retainOriginalArgs) {

    /** Factory method:  Collect or filter selected argument(s). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static class Lazy {

    /**
     * Pre-initialized NamedFunctions for bootstrapping purposes.
     * Factored in an inner class to delay initialization until first usage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle makeSpreadArguments(MethodHandle target,
                                            Class<?> spreadArgType, int spreadArgPos, int spreadArgCount) {

    /** Factory method:  Spread selected argument. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static Object valueConversion(Class<?> src, Class<?> dst, boolean strict, boolean monobox) {

    /**
     * Find a conversion function from the given source to the given destination.
     * This conversion function will be used as a LF NamedFunction.
     * Return a Class object if a simple cast is needed.
     * Return void.class if void is involved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    @ForceInline

    /**
     * Identity function, with reference cast.
     * @param t an arbitrary reference type
     * @param x an arbitrary reference value
     * @return the same value x
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static MethodHandle makePairwiseConvert(MethodHandle target, MethodType srcType,
                                            boolean strict, boolean monobox) {

    /**
     * Create a JVM-level adapter method handle to conform the given method
     * handle to the similar newType, using only pairwise argument conversions.
     * For each argument, convert incoming argument to the exact type needed.
     * The argument conversions allowed are casting, boxing and unboxing,
     * integral widening or narrowing, and floating point widening or narrowing.
     * @param srcType required call type
     * @param target original method handle
     * @param strict if true, only asType conversions are allowed; if false, explicitCastArguments conversions allowed
     * @param monobox if true, unboxing conversions are assumed to be exactly typed (Integer to int only, not long or double)
     * @return an adapter to the original handle with the desired new type,
     *          or the original target if the types are already identical
     *          or null if the adaptation cannot be made
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
        static final int GETTER_INDEX = 0, SETTER_INDEX = 1, INDEX_LIMIT = 2;

        /// Support for array element access
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
    static void initStatics() {

    /// Factory methods to create method handles:
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleImpl.java
/*non-public*/ abstract class MethodHandleImpl {

/**
 * Trusted implementation code for MethodHandle.
 * @author jrose
 */
