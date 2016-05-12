_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    private static class Lazy {

    /**
     * Pre-initialized NamedFunctions for bootstrapping purposes.
     * Factored in an inner class to delay initialization until first usage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    private static LambdaForm preparedFieldLambdaForm(MemberName m) {

    /**
     * Create a LF which can access the given field.
     * Cache and share this structure among all fields with
     * the same basicType and refKind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    static class StaticAccessor extends DirectMethodHandle {

    /** This subclass handles static field references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    static class Accessor extends DirectMethodHandle {

    /** This subclass handles non-static field references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    static class Constructor extends DirectMethodHandle {

    /** This subclass handles constructor references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    static class Special extends DirectMethodHandle {

    /** This subclass represents invokespecial instructions. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    /*non-public*/ static Object internalMemberNameEnsureInit(Object mh) {

    /** Static wrapper for DirectMethodHandle.internalMemberName.
     * This one also forces initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    @ForceInline

    /** Static wrapper for DirectMethodHandle.internalMemberName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    private static LambdaForm preparedLambdaForm(MemberName m) {

    /**
     * Create a LF which can invoke the given method.
     * Cache and share this structure among all methods with
     * the same basicType and refKind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    @Override

    //// Implementation methods.
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
class DirectMethodHandle extends MethodHandle {

/**
 * The flavor of method handle which implements a constant reference
 * to a class member.
 * @author jrose
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    private static class Lazy {

    /**
     * Pre-initialized NamedFunctions for bootstrapping purposes.
     * Factored in an inner class to delay initialization until first usage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    private static LambdaForm preparedFieldLambdaForm(MemberName m) {

    /**
     * Create a LF which can access the given field.
     * Cache and share this structure among all fields with
     * the same basicType and refKind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    static class StaticAccessor extends DirectMethodHandle {

    /** This subclass handles static field references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    static class Accessor extends DirectMethodHandle {

    /** This subclass handles non-static field references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    static class Constructor extends DirectMethodHandle {

    /** This subclass handles constructor references. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    static class Special extends DirectMethodHandle {

    /** This subclass represents invokespecial instructions. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    /*non-public*/ static Object internalMemberNameEnsureInit(Object mh) {

    /** Static wrapper for DirectMethodHandle.internalMemberName.
     * This one also forces initialization.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    @ForceInline

    /** Static wrapper for DirectMethodHandle.internalMemberName. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    private static LambdaForm preparedLambdaForm(MemberName m) {

    /**
     * Create a LF which can invoke the given method.
     * Cache and share this structure among all methods with
     * the same basicType and refKind.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
    @Override

    //// Implementation methods.
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/DirectMethodHandle.java
class DirectMethodHandle extends MethodHandle {

/**
 * The flavor of method handle which implements a constant reference
 * to a class member.
 * @author jrose
 */
