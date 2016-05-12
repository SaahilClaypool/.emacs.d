_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ static

    /** Static definition of MethodHandle.invokeGeneric checking code. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ static

    /** Static definition of MethodHandle.invokeGeneric checking code.
     * Directly returns the type-adjusted MH to invoke, as follows:
     * {@code (R)MH.invoke(a*) => MH.asType(TYPEOF(a*:R)).invokeBasic(a*)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ static

    /** Static definition of MethodHandle.invokeExact checking code. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    private static LambdaForm invokeHandleForm(MethodType mtype, boolean customized, int which) {

    /** Returns an adapter for invokeExact or generic invoke, as a MH or constant pool linker.
     * If !customized, caller is responsible for supplying, during adapter execution,
     * a copy of the exact mtype.  This is because the adapter might be generalized to
     * a basic type.
     * @param mtype the caller's method type (either basic or full-custom)
     * @param customized whether to use a trailing appendix argument (to carry the mtype)
     * @param which bit-encoded 0x01 whether it is a CP adapter ("linker") or MHs.invoker value ("invoker");
     *                          0x02 whether it is for invokeExact or generic invoke
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ MethodHandle spreadInvoker(int leadingArgCount) {

    /**
     * Find or create an invoker which passes unchanged a given number of arguments
     * and spreads the rest from a trailing array argument.
     * The invoker target type is the post-spread type {@code (TYPEOF(uarg*), TYPEOF(sarg*))=>RT}.
     * All the {@code sarg}s must have a common type {@code C}.  (If there are none, {@code Object} is assumed.}
     * @param leadingArgCount the number of unchanged (non-spread) arguments
     * @return {@code invoker.invokeExact(mh, uarg*, C[]{sarg*}) := (RT)mh.invoke(uarg*, sarg*)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    private void maybeCompileToBytecode(MethodHandle invoker) {

    /** If the target type seems to be common enough, eagerly compile the invoker to bytecodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ Invokers(MethodType targetType) {

    /** Compute and cache information common to all collecting adapters
     *  that implement members of the erasure-family of the given erased type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
class Invokers {

/**
 * Construction and caching of often-used invokers.
 * @author jrose
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ static

    /** Static definition of MethodHandle.invokeGeneric checking code. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ static

    /** Static definition of MethodHandle.invokeGeneric checking code.
     * Directly returns the type-adjusted MH to invoke, as follows:
     * {@code (R)MH.invoke(a*) => MH.asType(TYPEOF(a*:R)).invokeBasic(a*)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ static

    /** Static definition of MethodHandle.invokeExact checking code. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    private static LambdaForm invokeHandleForm(MethodType mtype, boolean customized, int which) {

    /** Returns an adapter for invokeExact or generic invoke, as a MH or constant pool linker.
     * If !customized, caller is responsible for supplying, during adapter execution,
     * a copy of the exact mtype.  This is because the adapter might be generalized to
     * a basic type.
     * @param mtype the caller's method type (either basic or full-custom)
     * @param customized whether to use a trailing appendix argument (to carry the mtype)
     * @param which bit-encoded 0x01 whether it is a CP adapter ("linker") or MHs.invoker value ("invoker");
     *                          0x02 whether it is for invokeExact or generic invoke
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ MethodHandle spreadInvoker(int leadingArgCount) {

    /**
     * Find or create an invoker which passes unchanged a given number of arguments
     * and spreads the rest from a trailing array argument.
     * The invoker target type is the post-spread type {@code (TYPEOF(uarg*), TYPEOF(sarg*))=>RT}.
     * All the {@code sarg}s must have a common type {@code C}.  (If there are none, {@code Object} is assumed.}
     * @param leadingArgCount the number of unchanged (non-spread) arguments
     * @return {@code invoker.invokeExact(mh, uarg*, C[]{sarg*}) := (RT)mh.invoke(uarg*, sarg*)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    private void maybeCompileToBytecode(MethodHandle invoker) {

    /** If the target type seems to be common enough, eagerly compile the invoker to bytecodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
    /*non-public*/ Invokers(MethodType targetType) {

    /** Compute and cache information common to all collecting adapters
     *  that implement members of the erasure-family of the given erased type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/Invokers.java
class Invokers {

/**
 * Construction and caching of often-used invokers.
 * @author jrose
 */
