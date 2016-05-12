_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static boolean isCallerSensitive(MemberName mem) {

    /**
     * Is this method a caller-sensitive method?
     * I.e., does it call Reflection.getCallerClass or a similer method
     * to ask about the identity of its caller?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static private Error initCauseFrom(Error err, Exception ex) {

    /**
     * Use best possible cause for err.initCause(), substituting the
     * cause for err itself if the cause has the same (or better) type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static MethodHandle linkMethodHandleConstant(Class<?> callerClass, int refKind,
                                                 Class<?> defc, String name, Object type) {

    /**
     * The JVM is resolving a CONSTANT_MethodHandle CP entry.  And it wants our help.
     * It will make an up-call to this method.  (Do not change the name or signature.)
     * The type argument is a Class for field requests and a MethodType for non-fields.
     * <p>
     * Recent versions of the JVM may also pass a resolved MemberName for the type.
     * In that case, the name is ignored and may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static MemberName linkMethod(Class<?> callerClass, int refKind,
                                 Class<?> defc, String name, Object type,
                                 Object[] appendixResult) {

    /**
     * The JVM wants to link a call site that requires a dynamic type check.
     * Name is a type-checking invoker, invokeExact or invoke.
     * Return a JVM method (MemberName) to handle the invoking.
     * The method assumes the following arguments on the stack:
     * 0: the method handle being invoked
     * 1-N: the arguments to the method handle invocation
     * N+1: an optional, implicitly added argument (typically the given MethodType)
     * <p>
     * The nominal method at such a call site is an instance of
     * a signature-polymorphic method (see @PolymorphicSignature).
     * Such method instances are user-visible entities which are
     * "split" from the generic placeholder method in {@code MethodHandle}.
     * (Note that the placeholder method is not identical with any of
     * its instances.  If invoked reflectively, is guaranteed to throw an
     * {@code UnsupportedOperationException}.)
     * If the signature-polymorphic method instance is ever reified,
     * it appears as a "copy" of the original placeholder
     * (a native final member of {@code MethodHandle}) except
     * that its type descriptor has shape required by the instance,
     * and the method instance is <em>not</em> varargs.
     * The method instance is also marked synthetic, since the
     * method (by definition) does not appear in Java source code.
     * <p>
     * The JVM is allowed to reify this method as instance metadata.
     * For example, {@code invokeBasic} is always reified.
     * But the JVM may instead call {@code linkMethod}.
     * If the result is an * ordered pair of a {@code (method, appendix)},
     * the method gets all the arguments (0..N inclusive)
     * plus the appendix (N+1), and uses the appendix to complete the call.
     * In this way, one reusable method (called a "linker method")
     * can perform the function of any number of polymorphic instance
     * methods.
     * <p>
     * Linker methods are allowed to be weakly typed, with any or
     * all references rewritten to {@code Object} and any primitives
     * (except {@code long}/{@code float}/{@code double})
     * rewritten to {@code int}.
     * A linker method is trusted to return a strongly typed result,
     * according to the specific method type descriptor of the
     * signature-polymorphic instance it is emulating.
     * This can involve (as necessary) a dynamic check using
     * data extracted from the appendix argument.
     * <p>
     * The JVM does not inspect the appendix, other than to pass
     * it verbatim to the linker method at every call.
     * This means that the JDK runtime has wide latitude
     * for choosing the shape of each linker method and its
     * corresponding appendix.
     * Linker methods should be generated from {@code LambdaForm}s
     * so that they do not become visible on stack traces.
     * <p>
     * The {@code linkMethod} call is free to omit the appendix
     * (returning null) and instead emulate the required function
     * completely in the linker method.
     * As a corner case, if N==255, no appendix is possible.
     * In this case, the method returned must be custom-generated to
     * to perform any needed type checking.
     * <p>
     * If the JVM does not reify a method at a call site, but instead
     * calls {@code linkMethod}, the corresponding call represented
     * in the bytecodes may mention a valid method which is not
     * representable with a {@code MemberName}.
     * Therefore, use cases for {@code linkMethod} tend to correspond to
     * special cases in reflective code such as {@code findVirtual}
     * or {@code revealDirect}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static MethodType findMethodHandleType(Class<?> rtype, Class<?>[] ptypes) {

    /**
     * The JVM wants a pointer to a MethodType.  Oblige it by finding or creating one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static MemberName linkCallSite(Object callerObj,
                                   Object bootstrapMethodObj,
                                   Object nameObj, Object typeObj,
                                   Object staticArguments,
                                   Object[] appendixResult) {

    /**
     * The JVM is linking an invokedynamic instruction.  Create a reified call site for it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
        static final byte

        /**
         * Constant pool reference-kind codes, as used by CONSTANT_MethodHandle CP entries.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
        static final char

        /**
         * Access modifier flags.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
        static final byte

        /**
         * Constant pool entry types.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
        static final int

        /**
         * Basic types as encoded in the JVM.  These code values are not
         * intended for use outside this class.  They are used as part of
         * a private interface between the JVM and this class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    /** Tell the JVM that we need to change the target of a CallSite. */

    /// CallSite support
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    /** Fetch MH-related JVM parameter.

    /// MethodHandle support
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static native long objectFieldOffset(MemberName self);  // e.g., returns vmindex

    /// Field layout queries parallel to sun.misc.Unsafe:
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static native void init(MemberName self, Object ref);

    /// MemberName support
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
class MethodHandleNatives {

/**
 * The JVM interface for the method handles package is all here.
 * This is an interface internal and private to an implementation of JSR 292.
 * <em>This class is not part of the JSR 292 standard.</em>
 * @author jrose
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static boolean isCallerSensitive(MemberName mem) {

    /**
     * Is this method a caller-sensitive method?
     * I.e., does it call Reflection.getCallerClass or a similer method
     * to ask about the identity of its caller?
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static private Error initCauseFrom(Error err, Exception ex) {

    /**
     * Use best possible cause for err.initCause(), substituting the
     * cause for err itself if the cause has the same (or better) type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static MethodHandle linkMethodHandleConstant(Class<?> callerClass, int refKind,
                                                 Class<?> defc, String name, Object type) {

    /**
     * The JVM is resolving a CONSTANT_MethodHandle CP entry.  And it wants our help.
     * It will make an up-call to this method.  (Do not change the name or signature.)
     * The type argument is a Class for field requests and a MethodType for non-fields.
     * <p>
     * Recent versions of the JVM may also pass a resolved MemberName for the type.
     * In that case, the name is ignored and may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static MemberName linkMethod(Class<?> callerClass, int refKind,
                                 Class<?> defc, String name, Object type,
                                 Object[] appendixResult) {

    /**
     * The JVM wants to link a call site that requires a dynamic type check.
     * Name is a type-checking invoker, invokeExact or invoke.
     * Return a JVM method (MemberName) to handle the invoking.
     * The method assumes the following arguments on the stack:
     * 0: the method handle being invoked
     * 1-N: the arguments to the method handle invocation
     * N+1: an optional, implicitly added argument (typically the given MethodType)
     * <p>
     * The nominal method at such a call site is an instance of
     * a signature-polymorphic method (see @PolymorphicSignature).
     * Such method instances are user-visible entities which are
     * "split" from the generic placeholder method in {@code MethodHandle}.
     * (Note that the placeholder method is not identical with any of
     * its instances.  If invoked reflectively, is guaranteed to throw an
     * {@code UnsupportedOperationException}.)
     * If the signature-polymorphic method instance is ever reified,
     * it appears as a "copy" of the original placeholder
     * (a native final member of {@code MethodHandle}) except
     * that its type descriptor has shape required by the instance,
     * and the method instance is <em>not</em> varargs.
     * The method instance is also marked synthetic, since the
     * method (by definition) does not appear in Java source code.
     * <p>
     * The JVM is allowed to reify this method as instance metadata.
     * For example, {@code invokeBasic} is always reified.
     * But the JVM may instead call {@code linkMethod}.
     * If the result is an * ordered pair of a {@code (method, appendix)},
     * the method gets all the arguments (0..N inclusive)
     * plus the appendix (N+1), and uses the appendix to complete the call.
     * In this way, one reusable method (called a "linker method")
     * can perform the function of any number of polymorphic instance
     * methods.
     * <p>
     * Linker methods are allowed to be weakly typed, with any or
     * all references rewritten to {@code Object} and any primitives
     * (except {@code long}/{@code float}/{@code double})
     * rewritten to {@code int}.
     * A linker method is trusted to return a strongly typed result,
     * according to the specific method type descriptor of the
     * signature-polymorphic instance it is emulating.
     * This can involve (as necessary) a dynamic check using
     * data extracted from the appendix argument.
     * <p>
     * The JVM does not inspect the appendix, other than to pass
     * it verbatim to the linker method at every call.
     * This means that the JDK runtime has wide latitude
     * for choosing the shape of each linker method and its
     * corresponding appendix.
     * Linker methods should be generated from {@code LambdaForm}s
     * so that they do not become visible on stack traces.
     * <p>
     * The {@code linkMethod} call is free to omit the appendix
     * (returning null) and instead emulate the required function
     * completely in the linker method.
     * As a corner case, if N==255, no appendix is possible.
     * In this case, the method returned must be custom-generated to
     * to perform any needed type checking.
     * <p>
     * If the JVM does not reify a method at a call site, but instead
     * calls {@code linkMethod}, the corresponding call represented
     * in the bytecodes may mention a valid method which is not
     * representable with a {@code MemberName}.
     * Therefore, use cases for {@code linkMethod} tend to correspond to
     * special cases in reflective code such as {@code findVirtual}
     * or {@code revealDirect}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static MethodType findMethodHandleType(Class<?> rtype, Class<?>[] ptypes) {

    /**
     * The JVM wants a pointer to a MethodType.  Oblige it by finding or creating one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static MemberName linkCallSite(Object callerObj,
                                   Object bootstrapMethodObj,
                                   Object nameObj, Object typeObj,
                                   Object staticArguments,
                                   Object[] appendixResult) {

    /**
     * The JVM is linking an invokedynamic instruction.  Create a reified call site for it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
        static final byte

        /**
         * Constant pool reference-kind codes, as used by CONSTANT_MethodHandle CP entries.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
        static final char

        /**
         * Access modifier flags.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
        static final byte

        /**
         * Constant pool entry types.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
        static final int

        /**
         * Basic types as encoded in the JVM.  These code values are not
         * intended for use outside this class.  They are used as part of
         * a private interface between the JVM and this class.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    /** Tell the JVM that we need to change the target of a CallSite. */

    /// CallSite support
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    /** Fetch MH-related JVM parameter.

    /// MethodHandle support
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static native long objectFieldOffset(MemberName self);  // e.g., returns vmindex

    /// Field layout queries parallel to sun.misc.Unsafe:
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
    static native void init(MemberName self, Object ref);

    /// MemberName support
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodHandleNatives.java
class MethodHandleNatives {

/**
 * The JVM interface for the method handles package is all here.
 * This is an interface internal and private to an implementation of JSR 292.
 * <em>This class is not part of the JSR 292 standard.</em>
 * @author jrose
 */
