_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for LambdaForm interpreter frames.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for byte-compiled LambdaForms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int useCount(Name n) {

    /** Return the number of times n is used as an argument or return value. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int lastUseIndex(Name n) {

    /** Return the index of the last name which contains n as an argument.
     *  Return -1 if the name is not used.  Return names.length if it is the return value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int useCount(Name n) {

        /** Return the number of occurrences of n in the argument array.
         *  Return 0 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int lastUseIndex(Name n) {

        /** Return the index of the last occurrence of n in the argument array.
         *  Return -1 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name replaceNames(Name[] oldNames, Name[] newNames, int start, int end) {

        /** In the arguments of this Name, replace oldNames[i] pairwise by newNames[i].
         *  Limit such replacements to {@code start<=i<end}.  Return possibly changed self.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(BasicType type) { this(-1, type); }

        /** Create a raw parameter of the given type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(int index, BasicType type) {

        /** Create a raw parameter of the given type, with an expected index. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** Object return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** void return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretName(Name name, Object[] values) throws Throwable {

    /** Evaluate a single Name within this form, applying its function to its arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretWithArguments(Object... argumentValues) throws Throwable {

    /** Interpretively invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private static final int COMPILE_THRESHOLD;

    /** If the invocation count hits the threshold we spin bytecodes and call that subsequently. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MemberName compileToBytecode() {

    /** Generate optimizable bytecode for this form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    public void prepare() {

    /**
     * Make this LF directly executable, as part of a MethodHandle.
     * Invariant:  Every MH which is invoked must prepare its LF
     * before invocation.
     * (In principle, the JVM could do this very lazily,
     * as a sort of pre-invocation linkage step.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    final String basicTypeSignature() {

    /** Return ABC_Z, where the ABC are parameter type characters, and Z is the return type character. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MethodType methodType() {

    /** Return the method type corresponding to my basic type signature. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int expressionCount() {

    /** Report the number of expressions (non-parameter names). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int arity() {

    /** Report the arity. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object parameterConstraint(int n) {

    /** Report the N-th argument type constraint. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Name parameter(int n) {

    /** Report the N-th argument name. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType parameterType(int n) {

    /** Report the N-th argument type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType returnType() {

    /** Report the return type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    // final Object invoke(Object... args) throws Throwable {

    /** Invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    boolean nameRefsAreLegal() {

    /**
     * Check that all embedded Name references are localizable to this lambda,
     * and are properly ordered after their corresponding definitions.
     * <p>
     * Note that a Name can be local to multiple lambdas, as long as
     * it possesses the same index in each use site.
     * This allows Name references to be freely reused to construct
     * fresh lambdas, without confusion.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private int normalize() {

    /** Renumber and/or replace params so that they are interned and canonically numbered.
     *  @return maximum argument list length among the names (since we have to pass over them anyway)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
class LambdaForm {

/**
 * The symbolic, non-executable form of a method handle's invocation semantics.
 * It consists of a series of names.
 * The first N (N=arity) names are parameters,
 * while any remaining names are temporary values.
 * Each temporary specifies the application of a function to some arguments.
 * The functions are method handles, while the arguments are mixes of
 * constant values and local names.
 * The result of the lambda is defined as one of the names, often the last one.
 * <p>
 * Here is an approximate grammar:
 * <blockquote><pre>{@code
 * LambdaForm = "(" ArgName* ")=>{" TempName* Result "}"
 * ArgName = "a" N ":" T
 * TempName = "t" N ":" T "=" Function "(" Argument* ");"
 * Function = ConstantValue
 * Argument = NameRef | ConstantValue
 * Result = NameRef | "void"
 * NameRef = "a" N | "t" N
 * N = (any whole number)
 * T = "L" | "I" | "J" | "F" | "D" | "V"
 * }</pre></blockquote>
 * Names are numbered consecutively from left to right starting at zero.
 * (The letters are merely a taste of syntax sugar.)
 * Thus, the first temporary (if any) is always numbered N (where N=arity).
 * Every occurrence of a name reference in an argument list must refer to
 * a name previously defined within the same lambda.
 * A lambda has a void result if and only if its result index is -1.
 * If a temporary has the type "V", it cannot be the subject of a NameRef,
 * even though possesses a number.
 * Note that all reference types are erased to "L", which stands for {@code Object}.
 * All subword types (boolean, byte, short, char) are erased to "I" which is {@code int}.
 * The other types stand for the usual primitive types.
 * <p>
 * Function invocation closely follows the static rules of the Java verifier.
 * Arguments and return values must exactly match when their "Name" types are
 * considered.
 * Conversions are allowed only if they do not change the erased type.
 * <ul>
 * <li>L = Object: casts are used freely to convert into and out of reference types
 * <li>I = int: subword types are forcibly narrowed when passed as arguments (see {@code explicitCastArguments})
 * <li>J = long: no implicit conversions
 * <li>F = float: no implicit conversions
 * <li>D = double: no implicit conversions
 * <li>V = void: a function result may be void if and only if its Name is of type "V"
 * </ul>
 * Although implicit conversions are not allowed, explicit ones can easily be
 * encoded by using temporary expressions which call type-transformed identity functions.
 * <p>
 * Examples:
 * <blockquote><pre>{@code
 * (a0:J)=>{ a0 }
 *     == identity(long)
 * (a0:I)=>{ t1:V = System.out#println(a0); void }
 *     == System.out#println(int)
 * (a0:L)=>{ t1:V = System.out#println(a0); a0 }
 *     == identity, with printing side-effect
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = BoundMethodHandle#target(a0);
 *                 t4:L = MethodHandle#invoke(t3, t2, a1); t4 }
 *     == general invoker for unary insertArgument combination
 * (a0:L, a1:L)=>{ t2:L = FilterMethodHandle#filter(a0);
 *                 t3:L = MethodHandle#invoke(t2, a1);
 *                 t4:L = FilterMethodHandle#target(a0);
 *                 t5:L = MethodHandle#invoke(t4, t3); t5 }
 *     == general invoker for unary filterArgument combination
 * (a0:L, a1:L)=>{ ...(same as previous example)...
 *                 t5:L = MethodHandle#invoke(t4, t3, a1); t5 }
 *     == general invoker for unary/unary foldArgument combination
 * (a0:L, a1:I)=>{ t2:I = identity(long).asType((int)->long)(a1); t2 }
 *     == invoker for identity method handle which performs i2l
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = Class#cast(t2,a1); t3 }
 *     == invoker for identity method handle which performs cast
 * }</pre></blockquote>
 * <p>
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for LambdaForm interpreter frames.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for byte-compiled LambdaForms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int useCount(Name n) {

    /** Return the number of times n is used as an argument or return value. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int lastUseIndex(Name n) {

    /** Return the index of the last name which contains n as an argument.
     *  Return -1 if the name is not used.  Return names.length if it is the return value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int useCount(Name n) {

        /** Return the number of occurrences of n in the argument array.
         *  Return 0 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int lastUseIndex(Name n) {

        /** Return the index of the last occurrence of n in the argument array.
         *  Return -1 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name replaceNames(Name[] oldNames, Name[] newNames, int start, int end) {

        /** In the arguments of this Name, replace oldNames[i] pairwise by newNames[i].
         *  Limit such replacements to {@code start<=i<end}.  Return possibly changed self.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(BasicType type) { this(-1, type); }

        /** Create a raw parameter of the given type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(int index, BasicType type) {

        /** Create a raw parameter of the given type, with an expected index. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** Object return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** void return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretName(Name name, Object[] values) throws Throwable {

    /** Evaluate a single Name within this form, applying its function to its arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretWithArguments(Object... argumentValues) throws Throwable {

    /** Interpretively invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private static final int COMPILE_THRESHOLD;

    /** If the invocation count hits the threshold we spin bytecodes and call that subsequently. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MemberName compileToBytecode() {

    /** Generate optimizable bytecode for this form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    public void prepare() {

    /**
     * Make this LF directly executable, as part of a MethodHandle.
     * Invariant:  Every MH which is invoked must prepare its LF
     * before invocation.
     * (In principle, the JVM could do this very lazily,
     * as a sort of pre-invocation linkage step.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    final String basicTypeSignature() {

    /** Return ABC_Z, where the ABC are parameter type characters, and Z is the return type character. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MethodType methodType() {

    /** Return the method type corresponding to my basic type signature. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int expressionCount() {

    /** Report the number of expressions (non-parameter names). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int arity() {

    /** Report the arity. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object parameterConstraint(int n) {

    /** Report the N-th argument type constraint. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Name parameter(int n) {

    /** Report the N-th argument name. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType parameterType(int n) {

    /** Report the N-th argument type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType returnType() {

    /** Report the return type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    // final Object invoke(Object... args) throws Throwable {

    /** Invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    boolean nameRefsAreLegal() {

    /**
     * Check that all embedded Name references are localizable to this lambda,
     * and are properly ordered after their corresponding definitions.
     * <p>
     * Note that a Name can be local to multiple lambdas, as long as
     * it possesses the same index in each use site.
     * This allows Name references to be freely reused to construct
     * fresh lambdas, without confusion.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private int normalize() {

    /** Renumber and/or replace params so that they are interned and canonically numbered.
     *  @return maximum argument list length among the names (since we have to pass over them anyway)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
class LambdaForm {

/**
 * The symbolic, non-executable form of a method handle's invocation semantics.
 * It consists of a series of names.
 * The first N (N=arity) names are parameters,
 * while any remaining names are temporary values.
 * Each temporary specifies the application of a function to some arguments.
 * The functions are method handles, while the arguments are mixes of
 * constant values and local names.
 * The result of the lambda is defined as one of the names, often the last one.
 * <p>
 * Here is an approximate grammar:
 * <blockquote><pre>{@code
 * LambdaForm = "(" ArgName* ")=>{" TempName* Result "}"
 * ArgName = "a" N ":" T
 * TempName = "t" N ":" T "=" Function "(" Argument* ");"
 * Function = ConstantValue
 * Argument = NameRef | ConstantValue
 * Result = NameRef | "void"
 * NameRef = "a" N | "t" N
 * N = (any whole number)
 * T = "L" | "I" | "J" | "F" | "D" | "V"
 * }</pre></blockquote>
 * Names are numbered consecutively from left to right starting at zero.
 * (The letters are merely a taste of syntax sugar.)
 * Thus, the first temporary (if any) is always numbered N (where N=arity).
 * Every occurrence of a name reference in an argument list must refer to
 * a name previously defined within the same lambda.
 * A lambda has a void result if and only if its result index is -1.
 * If a temporary has the type "V", it cannot be the subject of a NameRef,
 * even though possesses a number.
 * Note that all reference types are erased to "L", which stands for {@code Object}.
 * All subword types (boolean, byte, short, char) are erased to "I" which is {@code int}.
 * The other types stand for the usual primitive types.
 * <p>
 * Function invocation closely follows the static rules of the Java verifier.
 * Arguments and return values must exactly match when their "Name" types are
 * considered.
 * Conversions are allowed only if they do not change the erased type.
 * <ul>
 * <li>L = Object: casts are used freely to convert into and out of reference types
 * <li>I = int: subword types are forcibly narrowed when passed as arguments (see {@code explicitCastArguments})
 * <li>J = long: no implicit conversions
 * <li>F = float: no implicit conversions
 * <li>D = double: no implicit conversions
 * <li>V = void: a function result may be void if and only if its Name is of type "V"
 * </ul>
 * Although implicit conversions are not allowed, explicit ones can easily be
 * encoded by using temporary expressions which call type-transformed identity functions.
 * <p>
 * Examples:
 * <blockquote><pre>{@code
 * (a0:J)=>{ a0 }
 *     == identity(long)
 * (a0:I)=>{ t1:V = System.out#println(a0); void }
 *     == System.out#println(int)
 * (a0:L)=>{ t1:V = System.out#println(a0); a0 }
 *     == identity, with printing side-effect
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = BoundMethodHandle#target(a0);
 *                 t4:L = MethodHandle#invoke(t3, t2, a1); t4 }
 *     == general invoker for unary insertArgument combination
 * (a0:L, a1:L)=>{ t2:L = FilterMethodHandle#filter(a0);
 *                 t3:L = MethodHandle#invoke(t2, a1);
 *                 t4:L = FilterMethodHandle#target(a0);
 *                 t5:L = MethodHandle#invoke(t4, t3); t5 }
 *     == general invoker for unary filterArgument combination
 * (a0:L, a1:L)=>{ ...(same as previous example)...
 *                 t5:L = MethodHandle#invoke(t4, t3, a1); t5 }
 *     == general invoker for unary/unary foldArgument combination
 * (a0:L, a1:I)=>{ t2:I = identity(long).asType((int)->long)(a1); t2 }
 *     == invoker for identity method handle which performs i2l
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = Class#cast(t2,a1); t3 }
 *     == invoker for identity method handle which performs cast
 * }</pre></blockquote>
 * <p>
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for LambdaForm interpreter frames.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for byte-compiled LambdaForms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int useCount(Name n) {

    /** Return the number of times n is used as an argument or return value. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int lastUseIndex(Name n) {

    /** Return the index of the last name which contains n as an argument.
     *  Return -1 if the name is not used.  Return names.length if it is the return value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int useCount(Name n) {

        /** Return the number of occurrences of n in the argument array.
         *  Return 0 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int lastUseIndex(Name n) {

        /** Return the index of the last occurrence of n in the argument array.
         *  Return -1 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name replaceNames(Name[] oldNames, Name[] newNames, int start, int end) {

        /** In the arguments of this Name, replace oldNames[i] pairwise by newNames[i].
         *  Limit such replacements to {@code start<=i<end}.  Return possibly changed self.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(BasicType type) { this(-1, type); }

        /** Create a raw parameter of the given type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(int index, BasicType type) {

        /** Create a raw parameter of the given type, with an expected index. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** Object return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** void return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretName(Name name, Object[] values) throws Throwable {

    /** Evaluate a single Name within this form, applying its function to its arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretWithArguments(Object... argumentValues) throws Throwable {

    /** Interpretively invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private static final int COMPILE_THRESHOLD;

    /** If the invocation count hits the threshold we spin bytecodes and call that subsequently. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MemberName compileToBytecode() {

    /** Generate optimizable bytecode for this form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    public void prepare() {

    /**
     * Make this LF directly executable, as part of a MethodHandle.
     * Invariant:  Every MH which is invoked must prepare its LF
     * before invocation.
     * (In principle, the JVM could do this very lazily,
     * as a sort of pre-invocation linkage step.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    final String basicTypeSignature() {

    /** Return ABC_Z, where the ABC are parameter type characters, and Z is the return type character. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MethodType methodType() {

    /** Return the method type corresponding to my basic type signature. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int expressionCount() {

    /** Report the number of expressions (non-parameter names). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int arity() {

    /** Report the arity. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object parameterConstraint(int n) {

    /** Report the N-th argument type constraint. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Name parameter(int n) {

    /** Report the N-th argument name. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType parameterType(int n) {

    /** Report the N-th argument type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType returnType() {

    /** Report the return type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    // final Object invoke(Object... args) throws Throwable {

    /** Invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    boolean nameRefsAreLegal() {

    /**
     * Check that all embedded Name references are localizable to this lambda,
     * and are properly ordered after their corresponding definitions.
     * <p>
     * Note that a Name can be local to multiple lambdas, as long as
     * it possesses the same index in each use site.
     * This allows Name references to be freely reused to construct
     * fresh lambdas, without confusion.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private int normalize() {

    /** Renumber and/or replace params so that they are interned and canonically numbered.
     *  @return maximum argument list length among the names (since we have to pass over them anyway)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
class LambdaForm {

/**
 * The symbolic, non-executable form of a method handle's invocation semantics.
 * It consists of a series of names.
 * The first N (N=arity) names are parameters,
 * while any remaining names are temporary values.
 * Each temporary specifies the application of a function to some arguments.
 * The functions are method handles, while the arguments are mixes of
 * constant values and local names.
 * The result of the lambda is defined as one of the names, often the last one.
 * <p>
 * Here is an approximate grammar:
 * <blockquote><pre>{@code
 * LambdaForm = "(" ArgName* ")=>{" TempName* Result "}"
 * ArgName = "a" N ":" T
 * TempName = "t" N ":" T "=" Function "(" Argument* ");"
 * Function = ConstantValue
 * Argument = NameRef | ConstantValue
 * Result = NameRef | "void"
 * NameRef = "a" N | "t" N
 * N = (any whole number)
 * T = "L" | "I" | "J" | "F" | "D" | "V"
 * }</pre></blockquote>
 * Names are numbered consecutively from left to right starting at zero.
 * (The letters are merely a taste of syntax sugar.)
 * Thus, the first temporary (if any) is always numbered N (where N=arity).
 * Every occurrence of a name reference in an argument list must refer to
 * a name previously defined within the same lambda.
 * A lambda has a void result if and only if its result index is -1.
 * If a temporary has the type "V", it cannot be the subject of a NameRef,
 * even though possesses a number.
 * Note that all reference types are erased to "L", which stands for {@code Object}.
 * All subword types (boolean, byte, short, char) are erased to "I" which is {@code int}.
 * The other types stand for the usual primitive types.
 * <p>
 * Function invocation closely follows the static rules of the Java verifier.
 * Arguments and return values must exactly match when their "Name" types are
 * considered.
 * Conversions are allowed only if they do not change the erased type.
 * <ul>
 * <li>L = Object: casts are used freely to convert into and out of reference types
 * <li>I = int: subword types are forcibly narrowed when passed as arguments (see {@code explicitCastArguments})
 * <li>J = long: no implicit conversions
 * <li>F = float: no implicit conversions
 * <li>D = double: no implicit conversions
 * <li>V = void: a function result may be void if and only if its Name is of type "V"
 * </ul>
 * Although implicit conversions are not allowed, explicit ones can easily be
 * encoded by using temporary expressions which call type-transformed identity functions.
 * <p>
 * Examples:
 * <blockquote><pre>{@code
 * (a0:J)=>{ a0 }
 *     == identity(long)
 * (a0:I)=>{ t1:V = System.out#println(a0); void }
 *     == System.out#println(int)
 * (a0:L)=>{ t1:V = System.out#println(a0); a0 }
 *     == identity, with printing side-effect
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = BoundMethodHandle#target(a0);
 *                 t4:L = MethodHandle#invoke(t3, t2, a1); t4 }
 *     == general invoker for unary insertArgument combination
 * (a0:L, a1:L)=>{ t2:L = FilterMethodHandle#filter(a0);
 *                 t3:L = MethodHandle#invoke(t2, a1);
 *                 t4:L = FilterMethodHandle#target(a0);
 *                 t5:L = MethodHandle#invoke(t4, t3); t5 }
 *     == general invoker for unary filterArgument combination
 * (a0:L, a1:L)=>{ ...(same as previous example)...
 *                 t5:L = MethodHandle#invoke(t4, t3, a1); t5 }
 *     == general invoker for unary/unary foldArgument combination
 * (a0:L, a1:I)=>{ t2:I = identity(long).asType((int)->long)(a1); t2 }
 *     == invoker for identity method handle which performs i2l
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = Class#cast(t2,a1); t3 }
 *     == invoker for identity method handle which performs cast
 * }</pre></blockquote>
 * <p>
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for LambdaForm interpreter frames.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for byte-compiled LambdaForms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int useCount(Name n) {

    /** Return the number of times n is used as an argument or return value. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int lastUseIndex(Name n) {

    /** Return the index of the last name which contains n as an argument.
     *  Return -1 if the name is not used.  Return names.length if it is the return value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int useCount(Name n) {

        /** Return the number of occurrences of n in the argument array.
         *  Return 0 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int lastUseIndex(Name n) {

        /** Return the index of the last occurrence of n in the argument array.
         *  Return -1 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name replaceNames(Name[] oldNames, Name[] newNames, int start, int end) {

        /** In the arguments of this Name, replace oldNames[i] pairwise by newNames[i].
         *  Limit such replacements to {@code start<=i<end}.  Return possibly changed self.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(BasicType type) { this(-1, type); }

        /** Create a raw parameter of the given type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(int index, BasicType type) {

        /** Create a raw parameter of the given type, with an expected index. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** Object return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** void return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretName(Name name, Object[] values) throws Throwable {

    /** Evaluate a single Name within this form, applying its function to its arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretWithArguments(Object... argumentValues) throws Throwable {

    /** Interpretively invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private static final int COMPILE_THRESHOLD;

    /** If the invocation count hits the threshold we spin bytecodes and call that subsequently. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MemberName compileToBytecode() {

    /** Generate optimizable bytecode for this form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    public void prepare() {

    /**
     * Make this LF directly executable, as part of a MethodHandle.
     * Invariant:  Every MH which is invoked must prepare its LF
     * before invocation.
     * (In principle, the JVM could do this very lazily,
     * as a sort of pre-invocation linkage step.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    final String basicTypeSignature() {

    /** Return ABC_Z, where the ABC are parameter type characters, and Z is the return type character. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MethodType methodType() {

    /** Return the method type corresponding to my basic type signature. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int expressionCount() {

    /** Report the number of expressions (non-parameter names). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int arity() {

    /** Report the arity. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object parameterConstraint(int n) {

    /** Report the N-th argument type constraint. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Name parameter(int n) {

    /** Report the N-th argument name. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType parameterType(int n) {

    /** Report the N-th argument type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType returnType() {

    /** Report the return type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    // final Object invoke(Object... args) throws Throwable {

    /** Invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    boolean nameRefsAreLegal() {

    /**
     * Check that all embedded Name references are localizable to this lambda,
     * and are properly ordered after their corresponding definitions.
     * <p>
     * Note that a Name can be local to multiple lambdas, as long as
     * it possesses the same index in each use site.
     * This allows Name references to be freely reused to construct
     * fresh lambdas, without confusion.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private int normalize() {

    /** Renumber and/or replace params so that they are interned and canonically numbered.
     *  @return maximum argument list length among the names (since we have to pass over them anyway)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
class LambdaForm {

/**
 * The symbolic, non-executable form of a method handle's invocation semantics.
 * It consists of a series of names.
 * The first N (N=arity) names are parameters,
 * while any remaining names are temporary values.
 * Each temporary specifies the application of a function to some arguments.
 * The functions are method handles, while the arguments are mixes of
 * constant values and local names.
 * The result of the lambda is defined as one of the names, often the last one.
 * <p>
 * Here is an approximate grammar:
 * <blockquote><pre>{@code
 * LambdaForm = "(" ArgName* ")=>{" TempName* Result "}"
 * ArgName = "a" N ":" T
 * TempName = "t" N ":" T "=" Function "(" Argument* ");"
 * Function = ConstantValue
 * Argument = NameRef | ConstantValue
 * Result = NameRef | "void"
 * NameRef = "a" N | "t" N
 * N = (any whole number)
 * T = "L" | "I" | "J" | "F" | "D" | "V"
 * }</pre></blockquote>
 * Names are numbered consecutively from left to right starting at zero.
 * (The letters are merely a taste of syntax sugar.)
 * Thus, the first temporary (if any) is always numbered N (where N=arity).
 * Every occurrence of a name reference in an argument list must refer to
 * a name previously defined within the same lambda.
 * A lambda has a void result if and only if its result index is -1.
 * If a temporary has the type "V", it cannot be the subject of a NameRef,
 * even though possesses a number.
 * Note that all reference types are erased to "L", which stands for {@code Object}.
 * All subword types (boolean, byte, short, char) are erased to "I" which is {@code int}.
 * The other types stand for the usual primitive types.
 * <p>
 * Function invocation closely follows the static rules of the Java verifier.
 * Arguments and return values must exactly match when their "Name" types are
 * considered.
 * Conversions are allowed only if they do not change the erased type.
 * <ul>
 * <li>L = Object: casts are used freely to convert into and out of reference types
 * <li>I = int: subword types are forcibly narrowed when passed as arguments (see {@code explicitCastArguments})
 * <li>J = long: no implicit conversions
 * <li>F = float: no implicit conversions
 * <li>D = double: no implicit conversions
 * <li>V = void: a function result may be void if and only if its Name is of type "V"
 * </ul>
 * Although implicit conversions are not allowed, explicit ones can easily be
 * encoded by using temporary expressions which call type-transformed identity functions.
 * <p>
 * Examples:
 * <blockquote><pre>{@code
 * (a0:J)=>{ a0 }
 *     == identity(long)
 * (a0:I)=>{ t1:V = System.out#println(a0); void }
 *     == System.out#println(int)
 * (a0:L)=>{ t1:V = System.out#println(a0); a0 }
 *     == identity, with printing side-effect
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = BoundMethodHandle#target(a0);
 *                 t4:L = MethodHandle#invoke(t3, t2, a1); t4 }
 *     == general invoker for unary insertArgument combination
 * (a0:L, a1:L)=>{ t2:L = FilterMethodHandle#filter(a0);
 *                 t3:L = MethodHandle#invoke(t2, a1);
 *                 t4:L = FilterMethodHandle#target(a0);
 *                 t5:L = MethodHandle#invoke(t4, t3); t5 }
 *     == general invoker for unary filterArgument combination
 * (a0:L, a1:L)=>{ ...(same as previous example)...
 *                 t5:L = MethodHandle#invoke(t4, t3, a1); t5 }
 *     == general invoker for unary/unary foldArgument combination
 * (a0:L, a1:I)=>{ t2:I = identity(long).asType((int)->long)(a1); t2 }
 *     == invoker for identity method handle which performs i2l
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = Class#cast(t2,a1); t3 }
 *     == invoker for identity method handle which performs cast
 * }</pre></blockquote>
 * <p>
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for LambdaForm interpreter frames.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    /*non-public*/

    /**
     * Internal marker for byte-compiled LambdaForms.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int useCount(Name n) {

    /** Return the number of times n is used as an argument or return value. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int lastUseIndex(Name n) {

    /** Return the index of the last name which contains n as an argument.
     *  Return -1 if the name is not used.  Return names.length if it is the return value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int useCount(Name n) {

        /** Return the number of occurrences of n in the argument array.
         *  Return 0 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        int lastUseIndex(Name n) {

        /** Return the index of the last occurrence of n in the argument array.
         *  Return -1 if the name is not used.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name replaceNames(Name[] oldNames, Name[] newNames, int start, int end) {

        /** In the arguments of this Name, replace oldNames[i] pairwise by newNames[i].
         *  Limit such replacements to {@code start<=i<end}.  Return possibly changed self.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(BasicType type) { this(-1, type); }

        /** Create a raw parameter of the given type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        Name(int index, BasicType type) {

        /** Create a raw parameter of the given type, with an expected index. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** Object return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
        @Hidden

        /** void return type invokers. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretName(Name name, Object[] values) throws Throwable {

    /** Evaluate a single Name within this form, applying its function to its arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object interpretWithArguments(Object... argumentValues) throws Throwable {

    /** Interpretively invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private static final int COMPILE_THRESHOLD;

    /** If the invocation count hits the threshold we spin bytecodes and call that subsequently. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MemberName compileToBytecode() {

    /** Generate optimizable bytecode for this form. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    public void prepare() {

    /**
     * Make this LF directly executable, as part of a MethodHandle.
     * Invariant:  Every MH which is invoked must prepare its LF
     * before invocation.
     * (In principle, the JVM could do this very lazily,
     * as a sort of pre-invocation linkage step.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    final String basicTypeSignature() {

    /** Return ABC_Z, where the ABC are parameter type characters, and Z is the return type character. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    MethodType methodType() {

    /** Return the method type corresponding to my basic type signature. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int expressionCount() {

    /** Report the number of expressions (non-parameter names). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    int arity() {

    /** Report the arity. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Object parameterConstraint(int n) {

    /** Report the N-th argument type constraint. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    Name parameter(int n) {

    /** Report the N-th argument name. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType parameterType(int n) {

    /** Report the N-th argument type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    BasicType returnType() {

    /** Report the return type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    // final Object invoke(Object... args) throws Throwable {

    /** Invoke this form on the given arguments. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    boolean nameRefsAreLegal() {

    /**
     * Check that all embedded Name references are localizable to this lambda,
     * and are properly ordered after their corresponding definitions.
     * <p>
     * Note that a Name can be local to multiple lambdas, as long as
     * it possesses the same index in each use site.
     * This allows Name references to be freely reused to construct
     * fresh lambdas, without confusion.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
    private int normalize() {

    /** Renumber and/or replace params so that they are interned and canonically numbered.
     *  @return maximum argument list length among the names (since we have to pass over them anyway)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/LambdaForm.java
class LambdaForm {

/**
 * The symbolic, non-executable form of a method handle's invocation semantics.
 * It consists of a series of names.
 * The first N (N=arity) names are parameters,
 * while any remaining names are temporary values.
 * Each temporary specifies the application of a function to some arguments.
 * The functions are method handles, while the arguments are mixes of
 * constant values and local names.
 * The result of the lambda is defined as one of the names, often the last one.
 * <p>
 * Here is an approximate grammar:
 * <blockquote><pre>{@code
 * LambdaForm = "(" ArgName* ")=>{" TempName* Result "}"
 * ArgName = "a" N ":" T
 * TempName = "t" N ":" T "=" Function "(" Argument* ");"
 * Function = ConstantValue
 * Argument = NameRef | ConstantValue
 * Result = NameRef | "void"
 * NameRef = "a" N | "t" N
 * N = (any whole number)
 * T = "L" | "I" | "J" | "F" | "D" | "V"
 * }</pre></blockquote>
 * Names are numbered consecutively from left to right starting at zero.
 * (The letters are merely a taste of syntax sugar.)
 * Thus, the first temporary (if any) is always numbered N (where N=arity).
 * Every occurrence of a name reference in an argument list must refer to
 * a name previously defined within the same lambda.
 * A lambda has a void result if and only if its result index is -1.
 * If a temporary has the type "V", it cannot be the subject of a NameRef,
 * even though possesses a number.
 * Note that all reference types are erased to "L", which stands for {@code Object}.
 * All subword types (boolean, byte, short, char) are erased to "I" which is {@code int}.
 * The other types stand for the usual primitive types.
 * <p>
 * Function invocation closely follows the static rules of the Java verifier.
 * Arguments and return values must exactly match when their "Name" types are
 * considered.
 * Conversions are allowed only if they do not change the erased type.
 * <ul>
 * <li>L = Object: casts are used freely to convert into and out of reference types
 * <li>I = int: subword types are forcibly narrowed when passed as arguments (see {@code explicitCastArguments})
 * <li>J = long: no implicit conversions
 * <li>F = float: no implicit conversions
 * <li>D = double: no implicit conversions
 * <li>V = void: a function result may be void if and only if its Name is of type "V"
 * </ul>
 * Although implicit conversions are not allowed, explicit ones can easily be
 * encoded by using temporary expressions which call type-transformed identity functions.
 * <p>
 * Examples:
 * <blockquote><pre>{@code
 * (a0:J)=>{ a0 }
 *     == identity(long)
 * (a0:I)=>{ t1:V = System.out#println(a0); void }
 *     == System.out#println(int)
 * (a0:L)=>{ t1:V = System.out#println(a0); a0 }
 *     == identity, with printing side-effect
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = BoundMethodHandle#target(a0);
 *                 t4:L = MethodHandle#invoke(t3, t2, a1); t4 }
 *     == general invoker for unary insertArgument combination
 * (a0:L, a1:L)=>{ t2:L = FilterMethodHandle#filter(a0);
 *                 t3:L = MethodHandle#invoke(t2, a1);
 *                 t4:L = FilterMethodHandle#target(a0);
 *                 t5:L = MethodHandle#invoke(t4, t3); t5 }
 *     == general invoker for unary filterArgument combination
 * (a0:L, a1:L)=>{ ...(same as previous example)...
 *                 t5:L = MethodHandle#invoke(t4, t3, a1); t5 }
 *     == general invoker for unary/unary foldArgument combination
 * (a0:L, a1:I)=>{ t2:I = identity(long).asType((int)->long)(a1); t2 }
 *     == invoker for identity method handle which performs i2l
 * (a0:L, a1:L)=>{ t2:L = BoundMethodHandle#argument(a0);
 *                 t3:L = Class#cast(t2,a1); t3 }
 *     == invoker for identity method handle which performs cast
 * }</pre></blockquote>
 * <p>
 * @author John Rose, JSR 292 EG
 */
