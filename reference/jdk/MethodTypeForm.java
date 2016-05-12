_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    static Class<?>[] canonicalizeAll(Class<?>[] ts, int how) {

    /** Canonicalize each param type in the given array.
     *  Return null if all types are already canonicalized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    static Class<?> canonicalize(Class<?> t, int how) {

    /** Canonicalize the given return or param type.
     *  Return null if the type is already canonicalized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    public static MethodType canonicalize(MethodType mt, int howRet, int howArgs) {

    /** Canonicalize the types in the given method type.
     * If any types change, intern the new type, and return it.
     * Otherwise return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    public static final int NO_CHANGE = 0, ERASE = 1, WRAP = 2, UNWRAP = 3, INTS = 4, LONGS = 5, RAW_RETURN = 6;

    /** Codes for {@link #canonicalize(java.lang.Class, int)}.
     * ERASE means change every reference to {@code Object}.
     * WRAP means convert primitives (including {@code void} to their
     * corresponding wrapper types.  UNWRAP means the reverse of WRAP.
     * INTS means convert all non-void primitive types to int or long,
     * according to size.  LONGS means convert all non-void primitives
     * to long, regardless of size.  RAW_RETURN means convert a type
     * (assumed to be a return type) to int if it is smaller than an int,
     * or if it is void.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    @SuppressWarnings({"rawtypes", "unchecked"})

    /**
     * Build an MTF for a given type, which must have all references erased to Object.
     * This MTF will stand for that type and all un-erased variations.
     * Eagerly compute some basic properties of the type, common to all variations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    public MethodType basicType() {

    /** Return the basic type derived from the erased type of this MT-form.
     *  A basic type is erased (all references Object) and also has all primitive
     *  types (except int, long, float, double, void) normalized to int.
     *  Such basic types correspond to low-level JVM calling sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    public MethodType erasedType() {

    /** Return the type corresponding uniquely (1-1) to this MT-form.
     *  It might have any primitive returns or arguments, but will have no references except Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
final class MethodTypeForm {

/**
 * Shared information for a group of method types, which differ
 * only by reference types, and therefore share a common erasure
 * and wrapping.
 * <p>
 * For an empirical discussion of the structure of method types,
 * see <a href="http://groups.google.com/group/jvm-languages/browse_thread/thread/ac9308ae74da9b7e/">
 * the thread "Avoiding Boxing" on jvm-languages</a>.
 * There are approximately 2000 distinct erased method types in the JDK.
 * There are a little over 10 times that number of unerased types.
 * No more than half of these are likely to be loaded at once.
 * @author John Rose
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    static Class<?>[] canonicalizeAll(Class<?>[] ts, int how) {

    /** Canonicalize each param type in the given array.
     *  Return null if all types are already canonicalized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    static Class<?> canonicalize(Class<?> t, int how) {

    /** Canonicalize the given return or param type.
     *  Return null if the type is already canonicalized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    public static MethodType canonicalize(MethodType mt, int howRet, int howArgs) {

    /** Canonicalize the types in the given method type.
     * If any types change, intern the new type, and return it.
     * Otherwise return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    public static final int NO_CHANGE = 0, ERASE = 1, WRAP = 2, UNWRAP = 3, INTS = 4, LONGS = 5, RAW_RETURN = 6;

    /** Codes for {@link #canonicalize(java.lang.Class, int)}.
     * ERASE means change every reference to {@code Object}.
     * WRAP means convert primitives (including {@code void} to their
     * corresponding wrapper types.  UNWRAP means the reverse of WRAP.
     * INTS means convert all non-void primitive types to int or long,
     * according to size.  LONGS means convert all non-void primitives
     * to long, regardless of size.  RAW_RETURN means convert a type
     * (assumed to be a return type) to int if it is smaller than an int,
     * or if it is void.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    @SuppressWarnings({"rawtypes", "unchecked"})

    /**
     * Build an MTF for a given type, which must have all references erased to Object.
     * This MTF will stand for that type and all un-erased variations.
     * Eagerly compute some basic properties of the type, common to all variations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    public MethodType basicType() {

    /** Return the basic type derived from the erased type of this MT-form.
     *  A basic type is erased (all references Object) and also has all primitive
     *  types (except int, long, float, double, void) normalized to int.
     *  Such basic types correspond to low-level JVM calling sequences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
    public MethodType erasedType() {

    /** Return the type corresponding uniquely (1-1) to this MT-form.
     *  It might have any primitive returns or arguments, but will have no references except Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/MethodTypeForm.java
final class MethodTypeForm {

/**
 * Shared information for a group of method types, which differ
 * only by reference types, and therefore share a common erasure
 * and wrapping.
 * <p>
 * For an empirical discussion of the structure of method types,
 * see <a href="http://groups.google.com/group/jvm-languages/browse_thread/thread/ac9308ae74da9b7e/">
 * the thread "Avoiding Boxing" on jvm-languages</a>.
 * There are approximately 2000 distinct erased method types in the JDK.
 * There are a little over 10 times that number of unerased types.
 * No more than half of these are likely to be loaded at once.
 * @author John Rose
 */
