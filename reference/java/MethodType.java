_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T add(T elem) {

        /**
         * Interns the element.
         * Always returns non-null element, matching the one in the intern set.
         * Under the race against another add(), it can return <i>different</i>
         * element, if another thread beats us to interning it.
         *
         * @param elem element to add
         * @return element that was actually added
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T get(T elem) {

        /**
         * Get the existing interned element.
         * This method returns null if no element is interned.
         *
         * @param elem element to look up
         * @return the interned element
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static class ConcurrentWeakInternSet<T> {

    /**
     * Simple implementation of weak concurrent intern set.
     *
     * @param <T> interned type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private Object readResolve() {

    /**
     * Resolves and initializes a {@code MethodType} object
     * after serialization.
     * @return the fully initialized {@code MethodType} object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType() {

    /**
     * For serialization only.
     * Sets the final fields to null, pending {@code Unsafe.putObject}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {

    /**
     * Reconstitute the {@code MethodType} instance from a stream (that is,
     * deserialize it).
     * This instance is a scratch object with bogus final fields.
     * It provides the parameters to the factory method called by
     * {@link #readResolve readResolve}.
     * After that call it is discarded.
     * @param s the stream to read the object from
     * @throws java.io.IOException if there is a problem reading the object
     * @throws ClassNotFoundException if one of the component classes cannot be resolved
     * @see #MethodType()
     * @see #readResolve
     * @see #writeObject
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {

    /**
     * Save the {@code MethodType} instance to a stream.
     *
     * @serialData
     * For portability, the serialized format does not refer to named fields.
     * Instead, the return type and parameter type arrays are written directly
     * from the {@code writeObject} method, using two calls to {@code s.writeObject}
     * as follows:
     * <blockquote><pre>{@code
s.writeObject(this.returnType());
s.writeObject(this.parameterArray());
     * }</pre></blockquote>
     * <p>
     * The deserialized field values are checked as if they were
     * provided to the factory method {@link #methodType(Class,Class[]) methodType}.
     * For example, null values, or {@code void} parameter types,
     * will lead to exceptions during deserialization.
     * @param s the stream to write the object to
     * @throws java.io.IOException if there is a problem writing the object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /**

    /// Serialization.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public String toMethodDescriptorString() {

    /**
     * Produces a bytecode descriptor representation of the method type.
     * <p>
     * Note that this is not a strict inverse of {@link #fromMethodDescriptorString fromMethodDescriptorString}.
     * Two distinct classes which share a common name but have different class loaders
     * will appear identical when viewed within descriptor strings.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * {@link #fromMethodDescriptorString(java.lang.String, java.lang.ClassLoader) fromMethodDescriptorString},
     * because the latter requires a suitable class loader argument.
     * @return the bytecode type descriptor representation
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader loader)

    /**
     * Finds or creates an instance of a method type, given the spelling of its bytecode descriptor.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * Any class or interface name embedded in the descriptor string
     * will be resolved by calling {@link ClassLoader#loadClass(java.lang.String)}
     * on the given loader (or if it is null, on the system class loader).
     * <p>
     * Note that it is possible to encounter method types which cannot be
     * constructed by this method, because their component types are
     * not all reachable from a common class loader.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * @param descriptor a bytecode-level type descriptor string "(T...)T"
     * @param loader the class loader in which to look up the types
     * @return a method type matching the bytecode-level type descriptor
     * @throws NullPointerException if the string is null
     * @throws IllegalArgumentException if the string is not well-formed
     * @throws TypeNotPresentException if a named type cannot be found
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int returnSlotCount() {

    /** Reports the number of JVM stack slots required to receive a return value
     * from a method of this type.
     * If the {@link #returnType() return type} is void, it will be zero,
     * else if the return type is long or double, it will be two, else one.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @return the number of JVM stack slots (0, 1, or 2) for this type's return value
     * Will be removed for PFD.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int parameterSlotDepth(int num) {

    /** Reports the number of JVM stack slots which carry all parameters including and after
     * the given position, which must be in the range of 0 to
     * {@code parameterCount} inclusive.  Successive parameters are
     * more shallowly stacked, and parameters are indexed in the bytecodes
     * according to their trailing edge.  Thus, to obtain the depth
     * in the outgoing call stack of parameter {@code N}, obtain
     * the {@code parameterSlotDepth} of its trailing edge
     * at position {@code N+1}.
     * <p>
     * Parameters of type {@code long} and {@code double} occupy
     * two stack slots (for historical reasons) and all others occupy one.
     * Therefore, the number returned is the number of arguments
     * <em>including</em> and <em>after</em> the given parameter,
     * <em>plus</em> the number of long or double arguments
     * at or after after the argument for the given parameter.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @param num an index (zero-based, inclusive) within the parameter types
     * @return the index of the (shallowest) JVM stack slot transmitting the
     *         given parameter
     * @throws IllegalArgumentException if {@code num} is negative or greater than {@code parameterCount()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /** Reports the number of JVM stack slots required to invoke a method

    /// Queries which have to do with the bytecode architecture
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static boolean explicitCastEquivalentToAsType(Class<?> src, Class<?> dst) {

    /** Reports true if the src can be converted to the dst, by both asType and MHs.eCE,
     *  and with the same effect.
     *  MHs.eCA has the following "upgrades" to MH.asType:
     *  1. interfaces are unchecked (that is, treated as if aliased to Object)
     *     Therefore, {@code Object->CharSequence} is possible in both cases but has different semantics
     *  2. the full matrix of primitive-to-primitive conversions is supported
     *     Narrowing like {@code long->byte} and basic-typing like {@code boolean->int}
     *     are not supported by asType, but anything supported by asType is equivalent
     *     with MHs.eCE.
     *  3a. unboxing conversions can be followed by the full matrix of primitive conversions
     *  3b. unboxing of null is permitted (creates a zero primitive value)
     * Other than interfaces, reference-to-reference conversions are the same.
     * Boxing primitives to references is the same for both operators.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** Returns true if MHs.explicitCastArguments produces the same result as MH.asType.
     *  If the type conversion is impossible for either, the result should be false.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the new parameters can be viewed (w/o casting) under the old parameter types. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the old return type can always be viewed (w/o casting) under new return type,
     *  and the new parameters can be viewed (w/o casting) under the old parameter types.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns a string representation of the method type,
     * of the form {@code "(PT0,PT1...)RT"}.
     * The string representation of a method type is a
     * parenthesis enclosed, comma separated list of type names,
     * followed immediately by the return type.
     * <p>
     * Each type is represented by its
     * {@link java.lang.Class#getSimpleName simple name}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns the hash code value for this method type.
     * It is defined to be the same as the hashcode of a List
     * whose elements are the return type followed by the
     * parameter types.
     * @return the hash code value for this method type
     * @see Object#hashCode()
     * @see #equals(Object)
     * @see List#hashCode()
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Compares the specified object with this type for equality.
     * That is, it returns <tt>true</tt> if and only if the specified object
     * is also a method type with exactly the same parameters and return type.
     * @param x object to compare
     * @see Object#equals(Object)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?>[] parameterArray() {

    /**
     * Presents the parameter types as an array (a convenience method).
     * Changes to the array will not result in changes to the type.
     * @return the parameter types (as a fresh copy if necessary)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public List<Class<?>> parameterList() {

    /**
     * Presents the parameter types as a list (a convenience method).
     * The list will be immutable.
     * @return the parameter types (as an immutable list)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> returnType() {

    /**
     * Returns the return type of this method type.
     * @return the return type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public int parameterCount() {

    /**
     * Returns the number of parameter types in this method type.
     * @return the number of parameter types
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> parameterType(int num) {

    /**
     * Returns the parameter type at the specified index, within this method type.
     * @param num the index (zero-based) of the desired parameter type
     * @return the selected parameter type
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType unwrap() {

    /**
     * Converts all wrapper types to their corresponding primitive types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * A return type of {@code java.lang.Void} is changed to {@code void}.
     * @return a version of the original type with all wrapper types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType wrap() {

    /**
     * Converts all primitive types to their corresponding wrapper types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All reference types (including wrapper types) will remain unchanged.
     * A {@code void} return type is changed to the type {@code java.lang.Void}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all primitive types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType generic() {

    /**
     * Converts all types, both reference and primitive, to {@code Object}.
     * Convenience method for {@link #genericMethodType(int) genericMethodType}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType invokerType() {

    /**
     * @return a version of the original type with MethodHandle prepended as the first argument
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType basicType() {

    /**
     * Erases all reference types to {@code Object}, and all subword types to {@code int}.
     * This is the reduced type polymorphism used by private methods
     * such as {@link MethodHandle#invokeBasic invokeBasic}.
     * @return a version of the original type with all reference and subword types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType erase() {

    /**
     * Erases all reference types to {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * @return a version of the original type with all reference types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasWrappers() {

    /**
     * Reports if this type contains a wrapper argument or return value.
     * Wrappers are types which box primitive values, such as {@link Integer}.
     * The reference type {@code java.lang.Void} counts as a wrapper,
     * if it occurs as a return type.
     * @return true if any of the types are wrappers
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasPrimitives() {

    /**
     * Reports if this type contains a primitive argument or return value.
     * The return type {@code void} counts as a primitive.
     * @return true if any of the types are primitives
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeReturnType(Class<?> nrtype) {

    /**
     * Finds or creates a method type with a different return type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param nrtype a return parameter type to replace the old one with
     * @return the same type, except with the return type change
     * @throws NullPointerException if {@code nrtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType dropParameterTypes(int start, int end) {

    /**
     * Finds or creates a method type with some parameter types omitted.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the index (zero-based) of the first parameter type to remove
     * @param end    the index (greater than {@code start}) of the first parameter type after not to remove
     * @return the same type, except with the selected parameter(s) removed
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asCollectorType(Class<?> arrayType, int arrayLength) {

    /** Delete the last parameter type and replace it with arrayLength copies of the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to insert
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ Class<?> leadingReferenceParameter() {

    /** Return the leading parameter type, which must exist and be a reference.
     *  @return the leading parameter type, after error checks
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asSpreaderType(Class<?> arrayType, int arrayLength) {

    /** Replace the last arrayLength parameter types with the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to change
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType replaceParameterTypes(int start, int end, Class<?>... ptypesToInsert) {

     /**
     * Finds or creates a method type with modified parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the position (zero-based) of the first replaced parameter type(s)
     * @param end    the position (zero-based) after the last replaced parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) replaced
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeParameterType(int num, Class<?> nptype) {

    /**
     * Finds or creates a method type with a single different parameter type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the index (zero-based) of the parameter type to change
     * @param nptype a new parameter type to replace the old one with
     * @return the same type, except with the selected parameter changed
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     * @throws IllegalArgumentException if {@code nptype} is {@code void.class}
     * @throws NullPointerException if {@code nptype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are all {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be Object.
     * @param objectArgCount number of parameters
     * @return a generally applicable method type, for all calls of the given argument count
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255
     * @see #genericMethodType(int, boolean)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are {@code Object} with an optional trailing {@code Object[]} array.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be {@code Object},
     * except the final array parameter if any, which will be {@code Object[]}.
     * @param objectArgCount number of parameters (excluding the final array parameter if any)
     * @param finalArray whether there will be a trailing array parameter, of type {@code Object[]}
     * @return a generally applicable method type, for all calls of the given fixed argument count and a collected array of further arguments
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255 (or 254, if {@code finalArray} is true)
     * @see #genericMethodType(int)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*trusted*/ static

    /**
     * Sole factory method to find or create an interned method type.
     * @param rtype desired return type
     * @param ptypes desired parameter types
     * @param trusted whether the ptypes can be used without cloning
     * @return the unique method type of the desired structure
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the same parameter types as {@code ptypes},
     * and the specified return type.
     * @param rtype  the return type
     * @param ptypes the method type which supplies the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the single given parameter type.
     * @param rtype  the return type
     * @param ptype0 the parameter type
     * @return a method type with the given return value and parameter type
     * @throws NullPointerException if {@code rtype} or {@code ptype0} is null
     * @throws IllegalArgumentException if {@code ptype0} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has no parameter types.
     * @param rtype  the return type
     * @return a method type with the given return value
     * @throws NullPointerException if {@code rtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The leading parameter type is prepended to the remaining array.
     * @param rtype  the return type
     * @param ptype0 the first parameter type
     * @param ptypes the remaining parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates an instance of the given method type.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static int checkPtypes(Class<?>[] ptypes) {

    /** Return number of extra slots (count of long/double args). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_MH_INVOKER_ARITY = MAX_MH_ARITY-1;  // deduct one more for invoker

    /** This number is the maximum arity of a method handle invoker, 253.
     *  It is derived from the absolute JVM-imposed arity by subtracting two,
     *  which are the slots occupied by invoke method handle, and the
     *  target method handle, which are both at the beginning of the argument
     *  list used to invoke the target method handle.
     *  The longest possible invocation will look like
     *  {@code invokermh.invoke(targetmh, arg1, arg2, ..., arg253)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    // Issue:  Should we allow MH.invokeWithArguments to go to the full 255?

    /** This number is the maximum arity of a method handle, 254.
     *  It is derived from the absolute JVM-imposed arity by subtracting one,
     *  which is the slot occupied by the method handle itself at the
     *  beginning of the argument list used to invoke the method handle.
     *  The longest possible invocation will look like
     *  {@code mh.invoke(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_JVM_ARITY = 255;  // this is mandated by the JVM spec.

    /** This number, mandated by the JVM spec as 255,
     *  is the maximum number of <em>slots</em>
     *  that any Java method can receive in its argument list.
     *  It limits both JVM signatures and method type objects.
     *  The longest possible invocation will look like
     *  {@code staticMethod(arg1, arg2, ..., arg255)} or
     *  {@code x.virtualMethod(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?>[] ptypes, Class<?> rtype) {

    /**
     * Construct a temporary unchecked instance of MethodType for use only as a key to the intern table.
     * Does not check the given parameters for validity, and must be discarded after it is used as a searching key.
     * The parameters are reversed for this constructor, so that is is not accidentally used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?> rtype, Class<?>[] ptypes, boolean trusted) {

    /**
     * Check the given parameters for validity and store them into the final fields.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
public final

/**
 * A method type represents the arguments and return type accepted and
 * returned by a method handle, or the arguments and return type passed
 * and expected  by a method handle caller.  Method types must be properly
 * matched between a method handle and all its callers,
 * and the JVM's operations enforce this matching at, specifically
 * during calls to {@link MethodHandle#invokeExact MethodHandle.invokeExact}
 * and {@link MethodHandle#invoke MethodHandle.invoke}, and during execution
 * of {@code invokedynamic} instructions.
 * <p>
 * The structure is a return type accompanied by any number of parameter types.
 * The types (primitive, {@code void}, and reference) are represented by {@link Class} objects.
 * (For ease of exposition, we treat {@code void} as if it were a type.
 * In fact, it denotes the absence of a return type.)
 * <p>
 * All instances of {@code MethodType} are immutable.
 * Two instances are completely interchangeable if they compare equal.
 * Equality depends on pairwise correspondence of the return and parameter types and on nothing else.
 * <p>
 * This type can be created only by factory methods.
 * All factory methods may cache values, though caching is not guaranteed.
 * Some factory methods are static, while others are virtual methods which
 * modify precursor method types, e.g., by changing a selected parameter.
 * <p>
 * Factory methods which operate on groups of parameter types
 * are systematically presented in two versions, so that both Java arrays and
 * Java lists can be used to work with groups of parameter types.
 * The query methods {@code parameterArray} and {@code parameterList}
 * also provide a choice between arrays and lists.
 * <p>
 * {@code MethodType} objects are sometimes derived from bytecode instructions
 * such as {@code invokedynamic}, specifically from the type descriptor strings associated
 * with the instructions in a class file's constant pool.
 * <p>
 * Like classes and strings, method types can also be represented directly
 * in a class file's constant pool as constants.
 * A method type may be loaded by an {@code ldc} instruction which refers
 * to a suitable {@code CONSTANT_MethodType} constant pool entry.
 * The entry refers to a {@code CONSTANT_Utf8} spelling for the descriptor string.
 * (For full details on method type constants,
 * see sections 4.4.8 and 5.4.3.5 of the Java Virtual Machine Specification.)
 * <p>
 * When the JVM materializes a {@code MethodType} from a descriptor string,
 * all classes named in the descriptor must be accessible, and will be loaded.
 * (But the classes need not be initialized, as is the case with a {@code CONSTANT_Class}.)
 * This loading may occur at any time before the {@code MethodType} object is first derived.
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T add(T elem) {

        /**
         * Interns the element.
         * Always returns non-null element, matching the one in the intern set.
         * Under the race against another add(), it can return <i>different</i>
         * element, if another thread beats us to interning it.
         *
         * @param elem element to add
         * @return element that was actually added
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T get(T elem) {

        /**
         * Get the existing interned element.
         * This method returns null if no element is interned.
         *
         * @param elem element to look up
         * @return the interned element
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static class ConcurrentWeakInternSet<T> {

    /**
     * Simple implementation of weak concurrent intern set.
     *
     * @param <T> interned type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private Object readResolve() {

    /**
     * Resolves and initializes a {@code MethodType} object
     * after serialization.
     * @return the fully initialized {@code MethodType} object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType() {

    /**
     * For serialization only.
     * Sets the final fields to null, pending {@code Unsafe.putObject}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {

    /**
     * Reconstitute the {@code MethodType} instance from a stream (that is,
     * deserialize it).
     * This instance is a scratch object with bogus final fields.
     * It provides the parameters to the factory method called by
     * {@link #readResolve readResolve}.
     * After that call it is discarded.
     * @param s the stream to read the object from
     * @throws java.io.IOException if there is a problem reading the object
     * @throws ClassNotFoundException if one of the component classes cannot be resolved
     * @see #MethodType()
     * @see #readResolve
     * @see #writeObject
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {

    /**
     * Save the {@code MethodType} instance to a stream.
     *
     * @serialData
     * For portability, the serialized format does not refer to named fields.
     * Instead, the return type and parameter type arrays are written directly
     * from the {@code writeObject} method, using two calls to {@code s.writeObject}
     * as follows:
     * <blockquote><pre>{@code
s.writeObject(this.returnType());
s.writeObject(this.parameterArray());
     * }</pre></blockquote>
     * <p>
     * The deserialized field values are checked as if they were
     * provided to the factory method {@link #methodType(Class,Class[]) methodType}.
     * For example, null values, or {@code void} parameter types,
     * will lead to exceptions during deserialization.
     * @param s the stream to write the object to
     * @throws java.io.IOException if there is a problem writing the object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /**

    /// Serialization.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public String toMethodDescriptorString() {

    /**
     * Produces a bytecode descriptor representation of the method type.
     * <p>
     * Note that this is not a strict inverse of {@link #fromMethodDescriptorString fromMethodDescriptorString}.
     * Two distinct classes which share a common name but have different class loaders
     * will appear identical when viewed within descriptor strings.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * {@link #fromMethodDescriptorString(java.lang.String, java.lang.ClassLoader) fromMethodDescriptorString},
     * because the latter requires a suitable class loader argument.
     * @return the bytecode type descriptor representation
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader loader)

    /**
     * Finds or creates an instance of a method type, given the spelling of its bytecode descriptor.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * Any class or interface name embedded in the descriptor string
     * will be resolved by calling {@link ClassLoader#loadClass(java.lang.String)}
     * on the given loader (or if it is null, on the system class loader).
     * <p>
     * Note that it is possible to encounter method types which cannot be
     * constructed by this method, because their component types are
     * not all reachable from a common class loader.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * @param descriptor a bytecode-level type descriptor string "(T...)T"
     * @param loader the class loader in which to look up the types
     * @return a method type matching the bytecode-level type descriptor
     * @throws NullPointerException if the string is null
     * @throws IllegalArgumentException if the string is not well-formed
     * @throws TypeNotPresentException if a named type cannot be found
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int returnSlotCount() {

    /** Reports the number of JVM stack slots required to receive a return value
     * from a method of this type.
     * If the {@link #returnType() return type} is void, it will be zero,
     * else if the return type is long or double, it will be two, else one.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @return the number of JVM stack slots (0, 1, or 2) for this type's return value
     * Will be removed for PFD.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int parameterSlotDepth(int num) {

    /** Reports the number of JVM stack slots which carry all parameters including and after
     * the given position, which must be in the range of 0 to
     * {@code parameterCount} inclusive.  Successive parameters are
     * more shallowly stacked, and parameters are indexed in the bytecodes
     * according to their trailing edge.  Thus, to obtain the depth
     * in the outgoing call stack of parameter {@code N}, obtain
     * the {@code parameterSlotDepth} of its trailing edge
     * at position {@code N+1}.
     * <p>
     * Parameters of type {@code long} and {@code double} occupy
     * two stack slots (for historical reasons) and all others occupy one.
     * Therefore, the number returned is the number of arguments
     * <em>including</em> and <em>after</em> the given parameter,
     * <em>plus</em> the number of long or double arguments
     * at or after after the argument for the given parameter.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @param num an index (zero-based, inclusive) within the parameter types
     * @return the index of the (shallowest) JVM stack slot transmitting the
     *         given parameter
     * @throws IllegalArgumentException if {@code num} is negative or greater than {@code parameterCount()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /** Reports the number of JVM stack slots required to invoke a method

    /// Queries which have to do with the bytecode architecture
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static boolean explicitCastEquivalentToAsType(Class<?> src, Class<?> dst) {

    /** Reports true if the src can be converted to the dst, by both asType and MHs.eCE,
     *  and with the same effect.
     *  MHs.eCA has the following "upgrades" to MH.asType:
     *  1. interfaces are unchecked (that is, treated as if aliased to Object)
     *     Therefore, {@code Object->CharSequence} is possible in both cases but has different semantics
     *  2. the full matrix of primitive-to-primitive conversions is supported
     *     Narrowing like {@code long->byte} and basic-typing like {@code boolean->int}
     *     are not supported by asType, but anything supported by asType is equivalent
     *     with MHs.eCE.
     *  3a. unboxing conversions can be followed by the full matrix of primitive conversions
     *  3b. unboxing of null is permitted (creates a zero primitive value)
     * Other than interfaces, reference-to-reference conversions are the same.
     * Boxing primitives to references is the same for both operators.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** Returns true if MHs.explicitCastArguments produces the same result as MH.asType.
     *  If the type conversion is impossible for either, the result should be false.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the new parameters can be viewed (w/o casting) under the old parameter types. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the old return type can always be viewed (w/o casting) under new return type,
     *  and the new parameters can be viewed (w/o casting) under the old parameter types.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns a string representation of the method type,
     * of the form {@code "(PT0,PT1...)RT"}.
     * The string representation of a method type is a
     * parenthesis enclosed, comma separated list of type names,
     * followed immediately by the return type.
     * <p>
     * Each type is represented by its
     * {@link java.lang.Class#getSimpleName simple name}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns the hash code value for this method type.
     * It is defined to be the same as the hashcode of a List
     * whose elements are the return type followed by the
     * parameter types.
     * @return the hash code value for this method type
     * @see Object#hashCode()
     * @see #equals(Object)
     * @see List#hashCode()
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Compares the specified object with this type for equality.
     * That is, it returns <tt>true</tt> if and only if the specified object
     * is also a method type with exactly the same parameters and return type.
     * @param x object to compare
     * @see Object#equals(Object)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?>[] parameterArray() {

    /**
     * Presents the parameter types as an array (a convenience method).
     * Changes to the array will not result in changes to the type.
     * @return the parameter types (as a fresh copy if necessary)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public List<Class<?>> parameterList() {

    /**
     * Presents the parameter types as a list (a convenience method).
     * The list will be immutable.
     * @return the parameter types (as an immutable list)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> returnType() {

    /**
     * Returns the return type of this method type.
     * @return the return type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public int parameterCount() {

    /**
     * Returns the number of parameter types in this method type.
     * @return the number of parameter types
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> parameterType(int num) {

    /**
     * Returns the parameter type at the specified index, within this method type.
     * @param num the index (zero-based) of the desired parameter type
     * @return the selected parameter type
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType unwrap() {

    /**
     * Converts all wrapper types to their corresponding primitive types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * A return type of {@code java.lang.Void} is changed to {@code void}.
     * @return a version of the original type with all wrapper types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType wrap() {

    /**
     * Converts all primitive types to their corresponding wrapper types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All reference types (including wrapper types) will remain unchanged.
     * A {@code void} return type is changed to the type {@code java.lang.Void}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all primitive types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType generic() {

    /**
     * Converts all types, both reference and primitive, to {@code Object}.
     * Convenience method for {@link #genericMethodType(int) genericMethodType}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType invokerType() {

    /**
     * @return a version of the original type with MethodHandle prepended as the first argument
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType basicType() {

    /**
     * Erases all reference types to {@code Object}, and all subword types to {@code int}.
     * This is the reduced type polymorphism used by private methods
     * such as {@link MethodHandle#invokeBasic invokeBasic}.
     * @return a version of the original type with all reference and subword types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType erase() {

    /**
     * Erases all reference types to {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * @return a version of the original type with all reference types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasWrappers() {

    /**
     * Reports if this type contains a wrapper argument or return value.
     * Wrappers are types which box primitive values, such as {@link Integer}.
     * The reference type {@code java.lang.Void} counts as a wrapper,
     * if it occurs as a return type.
     * @return true if any of the types are wrappers
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasPrimitives() {

    /**
     * Reports if this type contains a primitive argument or return value.
     * The return type {@code void} counts as a primitive.
     * @return true if any of the types are primitives
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeReturnType(Class<?> nrtype) {

    /**
     * Finds or creates a method type with a different return type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param nrtype a return parameter type to replace the old one with
     * @return the same type, except with the return type change
     * @throws NullPointerException if {@code nrtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType dropParameterTypes(int start, int end) {

    /**
     * Finds or creates a method type with some parameter types omitted.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the index (zero-based) of the first parameter type to remove
     * @param end    the index (greater than {@code start}) of the first parameter type after not to remove
     * @return the same type, except with the selected parameter(s) removed
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asCollectorType(Class<?> arrayType, int arrayLength) {

    /** Delete the last parameter type and replace it with arrayLength copies of the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to insert
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ Class<?> leadingReferenceParameter() {

    /** Return the leading parameter type, which must exist and be a reference.
     *  @return the leading parameter type, after error checks
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asSpreaderType(Class<?> arrayType, int arrayLength) {

    /** Replace the last arrayLength parameter types with the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to change
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType replaceParameterTypes(int start, int end, Class<?>... ptypesToInsert) {

     /**
     * Finds or creates a method type with modified parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the position (zero-based) of the first replaced parameter type(s)
     * @param end    the position (zero-based) after the last replaced parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) replaced
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeParameterType(int num, Class<?> nptype) {

    /**
     * Finds or creates a method type with a single different parameter type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the index (zero-based) of the parameter type to change
     * @param nptype a new parameter type to replace the old one with
     * @return the same type, except with the selected parameter changed
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     * @throws IllegalArgumentException if {@code nptype} is {@code void.class}
     * @throws NullPointerException if {@code nptype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are all {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be Object.
     * @param objectArgCount number of parameters
     * @return a generally applicable method type, for all calls of the given argument count
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255
     * @see #genericMethodType(int, boolean)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are {@code Object} with an optional trailing {@code Object[]} array.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be {@code Object},
     * except the final array parameter if any, which will be {@code Object[]}.
     * @param objectArgCount number of parameters (excluding the final array parameter if any)
     * @param finalArray whether there will be a trailing array parameter, of type {@code Object[]}
     * @return a generally applicable method type, for all calls of the given fixed argument count and a collected array of further arguments
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255 (or 254, if {@code finalArray} is true)
     * @see #genericMethodType(int)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*trusted*/ static

    /**
     * Sole factory method to find or create an interned method type.
     * @param rtype desired return type
     * @param ptypes desired parameter types
     * @param trusted whether the ptypes can be used without cloning
     * @return the unique method type of the desired structure
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the same parameter types as {@code ptypes},
     * and the specified return type.
     * @param rtype  the return type
     * @param ptypes the method type which supplies the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the single given parameter type.
     * @param rtype  the return type
     * @param ptype0 the parameter type
     * @return a method type with the given return value and parameter type
     * @throws NullPointerException if {@code rtype} or {@code ptype0} is null
     * @throws IllegalArgumentException if {@code ptype0} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has no parameter types.
     * @param rtype  the return type
     * @return a method type with the given return value
     * @throws NullPointerException if {@code rtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The leading parameter type is prepended to the remaining array.
     * @param rtype  the return type
     * @param ptype0 the first parameter type
     * @param ptypes the remaining parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates an instance of the given method type.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static int checkPtypes(Class<?>[] ptypes) {

    /** Return number of extra slots (count of long/double args). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_MH_INVOKER_ARITY = MAX_MH_ARITY-1;  // deduct one more for invoker

    /** This number is the maximum arity of a method handle invoker, 253.
     *  It is derived from the absolute JVM-imposed arity by subtracting two,
     *  which are the slots occupied by invoke method handle, and the
     *  target method handle, which are both at the beginning of the argument
     *  list used to invoke the target method handle.
     *  The longest possible invocation will look like
     *  {@code invokermh.invoke(targetmh, arg1, arg2, ..., arg253)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    // Issue:  Should we allow MH.invokeWithArguments to go to the full 255?

    /** This number is the maximum arity of a method handle, 254.
     *  It is derived from the absolute JVM-imposed arity by subtracting one,
     *  which is the slot occupied by the method handle itself at the
     *  beginning of the argument list used to invoke the method handle.
     *  The longest possible invocation will look like
     *  {@code mh.invoke(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_JVM_ARITY = 255;  // this is mandated by the JVM spec.

    /** This number, mandated by the JVM spec as 255,
     *  is the maximum number of <em>slots</em>
     *  that any Java method can receive in its argument list.
     *  It limits both JVM signatures and method type objects.
     *  The longest possible invocation will look like
     *  {@code staticMethod(arg1, arg2, ..., arg255)} or
     *  {@code x.virtualMethod(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?>[] ptypes, Class<?> rtype) {

    /**
     * Construct a temporary unchecked instance of MethodType for use only as a key to the intern table.
     * Does not check the given parameters for validity, and must be discarded after it is used as a searching key.
     * The parameters are reversed for this constructor, so that is is not accidentally used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?> rtype, Class<?>[] ptypes, boolean trusted) {

    /**
     * Check the given parameters for validity and store them into the final fields.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
public final

/**
 * A method type represents the arguments and return type accepted and
 * returned by a method handle, or the arguments and return type passed
 * and expected  by a method handle caller.  Method types must be properly
 * matched between a method handle and all its callers,
 * and the JVM's operations enforce this matching at, specifically
 * during calls to {@link MethodHandle#invokeExact MethodHandle.invokeExact}
 * and {@link MethodHandle#invoke MethodHandle.invoke}, and during execution
 * of {@code invokedynamic} instructions.
 * <p>
 * The structure is a return type accompanied by any number of parameter types.
 * The types (primitive, {@code void}, and reference) are represented by {@link Class} objects.
 * (For ease of exposition, we treat {@code void} as if it were a type.
 * In fact, it denotes the absence of a return type.)
 * <p>
 * All instances of {@code MethodType} are immutable.
 * Two instances are completely interchangeable if they compare equal.
 * Equality depends on pairwise correspondence of the return and parameter types and on nothing else.
 * <p>
 * This type can be created only by factory methods.
 * All factory methods may cache values, though caching is not guaranteed.
 * Some factory methods are static, while others are virtual methods which
 * modify precursor method types, e.g., by changing a selected parameter.
 * <p>
 * Factory methods which operate on groups of parameter types
 * are systematically presented in two versions, so that both Java arrays and
 * Java lists can be used to work with groups of parameter types.
 * The query methods {@code parameterArray} and {@code parameterList}
 * also provide a choice between arrays and lists.
 * <p>
 * {@code MethodType} objects are sometimes derived from bytecode instructions
 * such as {@code invokedynamic}, specifically from the type descriptor strings associated
 * with the instructions in a class file's constant pool.
 * <p>
 * Like classes and strings, method types can also be represented directly
 * in a class file's constant pool as constants.
 * A method type may be loaded by an {@code ldc} instruction which refers
 * to a suitable {@code CONSTANT_MethodType} constant pool entry.
 * The entry refers to a {@code CONSTANT_Utf8} spelling for the descriptor string.
 * (For full details on method type constants,
 * see sections 4.4.8 and 5.4.3.5 of the Java Virtual Machine Specification.)
 * <p>
 * When the JVM materializes a {@code MethodType} from a descriptor string,
 * all classes named in the descriptor must be accessible, and will be loaded.
 * (But the classes need not be initialized, as is the case with a {@code CONSTANT_Class}.)
 * This loading may occur at any time before the {@code MethodType} object is first derived.
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T add(T elem) {

        /**
         * Interns the element.
         * Always returns non-null element, matching the one in the intern set.
         * Under the race against another add(), it can return <i>different</i>
         * element, if another thread beats us to interning it.
         *
         * @param elem element to add
         * @return element that was actually added
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T get(T elem) {

        /**
         * Get the existing interned element.
         * This method returns null if no element is interned.
         *
         * @param elem element to look up
         * @return the interned element
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static class ConcurrentWeakInternSet<T> {

    /**
     * Simple implementation of weak concurrent intern set.
     *
     * @param <T> interned type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private Object readResolve() {

    /**
     * Resolves and initializes a {@code MethodType} object
     * after serialization.
     * @return the fully initialized {@code MethodType} object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType() {

    /**
     * For serialization only.
     * Sets the final fields to null, pending {@code Unsafe.putObject}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {

    /**
     * Reconstitute the {@code MethodType} instance from a stream (that is,
     * deserialize it).
     * This instance is a scratch object with bogus final fields.
     * It provides the parameters to the factory method called by
     * {@link #readResolve readResolve}.
     * After that call it is discarded.
     * @param s the stream to read the object from
     * @throws java.io.IOException if there is a problem reading the object
     * @throws ClassNotFoundException if one of the component classes cannot be resolved
     * @see #MethodType()
     * @see #readResolve
     * @see #writeObject
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {

    /**
     * Save the {@code MethodType} instance to a stream.
     *
     * @serialData
     * For portability, the serialized format does not refer to named fields.
     * Instead, the return type and parameter type arrays are written directly
     * from the {@code writeObject} method, using two calls to {@code s.writeObject}
     * as follows:
     * <blockquote><pre>{@code
s.writeObject(this.returnType());
s.writeObject(this.parameterArray());
     * }</pre></blockquote>
     * <p>
     * The deserialized field values are checked as if they were
     * provided to the factory method {@link #methodType(Class,Class[]) methodType}.
     * For example, null values, or {@code void} parameter types,
     * will lead to exceptions during deserialization.
     * @param s the stream to write the object to
     * @throws java.io.IOException if there is a problem writing the object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /**

    /// Serialization.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public String toMethodDescriptorString() {

    /**
     * Produces a bytecode descriptor representation of the method type.
     * <p>
     * Note that this is not a strict inverse of {@link #fromMethodDescriptorString fromMethodDescriptorString}.
     * Two distinct classes which share a common name but have different class loaders
     * will appear identical when viewed within descriptor strings.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * {@link #fromMethodDescriptorString(java.lang.String, java.lang.ClassLoader) fromMethodDescriptorString},
     * because the latter requires a suitable class loader argument.
     * @return the bytecode type descriptor representation
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader loader)

    /**
     * Finds or creates an instance of a method type, given the spelling of its bytecode descriptor.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * Any class or interface name embedded in the descriptor string
     * will be resolved by calling {@link ClassLoader#loadClass(java.lang.String)}
     * on the given loader (or if it is null, on the system class loader).
     * <p>
     * Note that it is possible to encounter method types which cannot be
     * constructed by this method, because their component types are
     * not all reachable from a common class loader.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * @param descriptor a bytecode-level type descriptor string "(T...)T"
     * @param loader the class loader in which to look up the types
     * @return a method type matching the bytecode-level type descriptor
     * @throws NullPointerException if the string is null
     * @throws IllegalArgumentException if the string is not well-formed
     * @throws TypeNotPresentException if a named type cannot be found
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int returnSlotCount() {

    /** Reports the number of JVM stack slots required to receive a return value
     * from a method of this type.
     * If the {@link #returnType() return type} is void, it will be zero,
     * else if the return type is long or double, it will be two, else one.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @return the number of JVM stack slots (0, 1, or 2) for this type's return value
     * Will be removed for PFD.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int parameterSlotDepth(int num) {

    /** Reports the number of JVM stack slots which carry all parameters including and after
     * the given position, which must be in the range of 0 to
     * {@code parameterCount} inclusive.  Successive parameters are
     * more shallowly stacked, and parameters are indexed in the bytecodes
     * according to their trailing edge.  Thus, to obtain the depth
     * in the outgoing call stack of parameter {@code N}, obtain
     * the {@code parameterSlotDepth} of its trailing edge
     * at position {@code N+1}.
     * <p>
     * Parameters of type {@code long} and {@code double} occupy
     * two stack slots (for historical reasons) and all others occupy one.
     * Therefore, the number returned is the number of arguments
     * <em>including</em> and <em>after</em> the given parameter,
     * <em>plus</em> the number of long or double arguments
     * at or after after the argument for the given parameter.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @param num an index (zero-based, inclusive) within the parameter types
     * @return the index of the (shallowest) JVM stack slot transmitting the
     *         given parameter
     * @throws IllegalArgumentException if {@code num} is negative or greater than {@code parameterCount()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /** Reports the number of JVM stack slots required to invoke a method

    /// Queries which have to do with the bytecode architecture
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static boolean explicitCastEquivalentToAsType(Class<?> src, Class<?> dst) {

    /** Reports true if the src can be converted to the dst, by both asType and MHs.eCE,
     *  and with the same effect.
     *  MHs.eCA has the following "upgrades" to MH.asType:
     *  1. interfaces are unchecked (that is, treated as if aliased to Object)
     *     Therefore, {@code Object->CharSequence} is possible in both cases but has different semantics
     *  2. the full matrix of primitive-to-primitive conversions is supported
     *     Narrowing like {@code long->byte} and basic-typing like {@code boolean->int}
     *     are not supported by asType, but anything supported by asType is equivalent
     *     with MHs.eCE.
     *  3a. unboxing conversions can be followed by the full matrix of primitive conversions
     *  3b. unboxing of null is permitted (creates a zero primitive value)
     * Other than interfaces, reference-to-reference conversions are the same.
     * Boxing primitives to references is the same for both operators.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** Returns true if MHs.explicitCastArguments produces the same result as MH.asType.
     *  If the type conversion is impossible for either, the result should be false.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the new parameters can be viewed (w/o casting) under the old parameter types. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the old return type can always be viewed (w/o casting) under new return type,
     *  and the new parameters can be viewed (w/o casting) under the old parameter types.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns a string representation of the method type,
     * of the form {@code "(PT0,PT1...)RT"}.
     * The string representation of a method type is a
     * parenthesis enclosed, comma separated list of type names,
     * followed immediately by the return type.
     * <p>
     * Each type is represented by its
     * {@link java.lang.Class#getSimpleName simple name}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns the hash code value for this method type.
     * It is defined to be the same as the hashcode of a List
     * whose elements are the return type followed by the
     * parameter types.
     * @return the hash code value for this method type
     * @see Object#hashCode()
     * @see #equals(Object)
     * @see List#hashCode()
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Compares the specified object with this type for equality.
     * That is, it returns <tt>true</tt> if and only if the specified object
     * is also a method type with exactly the same parameters and return type.
     * @param x object to compare
     * @see Object#equals(Object)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?>[] parameterArray() {

    /**
     * Presents the parameter types as an array (a convenience method).
     * Changes to the array will not result in changes to the type.
     * @return the parameter types (as a fresh copy if necessary)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public List<Class<?>> parameterList() {

    /**
     * Presents the parameter types as a list (a convenience method).
     * The list will be immutable.
     * @return the parameter types (as an immutable list)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> returnType() {

    /**
     * Returns the return type of this method type.
     * @return the return type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public int parameterCount() {

    /**
     * Returns the number of parameter types in this method type.
     * @return the number of parameter types
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> parameterType(int num) {

    /**
     * Returns the parameter type at the specified index, within this method type.
     * @param num the index (zero-based) of the desired parameter type
     * @return the selected parameter type
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType unwrap() {

    /**
     * Converts all wrapper types to their corresponding primitive types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * A return type of {@code java.lang.Void} is changed to {@code void}.
     * @return a version of the original type with all wrapper types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType wrap() {

    /**
     * Converts all primitive types to their corresponding wrapper types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All reference types (including wrapper types) will remain unchanged.
     * A {@code void} return type is changed to the type {@code java.lang.Void}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all primitive types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType generic() {

    /**
     * Converts all types, both reference and primitive, to {@code Object}.
     * Convenience method for {@link #genericMethodType(int) genericMethodType}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType invokerType() {

    /**
     * @return a version of the original type with MethodHandle prepended as the first argument
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType basicType() {

    /**
     * Erases all reference types to {@code Object}, and all subword types to {@code int}.
     * This is the reduced type polymorphism used by private methods
     * such as {@link MethodHandle#invokeBasic invokeBasic}.
     * @return a version of the original type with all reference and subword types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType erase() {

    /**
     * Erases all reference types to {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * @return a version of the original type with all reference types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasWrappers() {

    /**
     * Reports if this type contains a wrapper argument or return value.
     * Wrappers are types which box primitive values, such as {@link Integer}.
     * The reference type {@code java.lang.Void} counts as a wrapper,
     * if it occurs as a return type.
     * @return true if any of the types are wrappers
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasPrimitives() {

    /**
     * Reports if this type contains a primitive argument or return value.
     * The return type {@code void} counts as a primitive.
     * @return true if any of the types are primitives
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeReturnType(Class<?> nrtype) {

    /**
     * Finds or creates a method type with a different return type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param nrtype a return parameter type to replace the old one with
     * @return the same type, except with the return type change
     * @throws NullPointerException if {@code nrtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType dropParameterTypes(int start, int end) {

    /**
     * Finds or creates a method type with some parameter types omitted.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the index (zero-based) of the first parameter type to remove
     * @param end    the index (greater than {@code start}) of the first parameter type after not to remove
     * @return the same type, except with the selected parameter(s) removed
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asCollectorType(Class<?> arrayType, int arrayLength) {

    /** Delete the last parameter type and replace it with arrayLength copies of the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to insert
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ Class<?> leadingReferenceParameter() {

    /** Return the leading parameter type, which must exist and be a reference.
     *  @return the leading parameter type, after error checks
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asSpreaderType(Class<?> arrayType, int arrayLength) {

    /** Replace the last arrayLength parameter types with the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to change
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType replaceParameterTypes(int start, int end, Class<?>... ptypesToInsert) {

     /**
     * Finds or creates a method type with modified parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the position (zero-based) of the first replaced parameter type(s)
     * @param end    the position (zero-based) after the last replaced parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) replaced
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeParameterType(int num, Class<?> nptype) {

    /**
     * Finds or creates a method type with a single different parameter type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the index (zero-based) of the parameter type to change
     * @param nptype a new parameter type to replace the old one with
     * @return the same type, except with the selected parameter changed
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     * @throws IllegalArgumentException if {@code nptype} is {@code void.class}
     * @throws NullPointerException if {@code nptype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are all {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be Object.
     * @param objectArgCount number of parameters
     * @return a generally applicable method type, for all calls of the given argument count
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255
     * @see #genericMethodType(int, boolean)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are {@code Object} with an optional trailing {@code Object[]} array.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be {@code Object},
     * except the final array parameter if any, which will be {@code Object[]}.
     * @param objectArgCount number of parameters (excluding the final array parameter if any)
     * @param finalArray whether there will be a trailing array parameter, of type {@code Object[]}
     * @return a generally applicable method type, for all calls of the given fixed argument count and a collected array of further arguments
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255 (or 254, if {@code finalArray} is true)
     * @see #genericMethodType(int)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*trusted*/ static

    /**
     * Sole factory method to find or create an interned method type.
     * @param rtype desired return type
     * @param ptypes desired parameter types
     * @param trusted whether the ptypes can be used without cloning
     * @return the unique method type of the desired structure
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the same parameter types as {@code ptypes},
     * and the specified return type.
     * @param rtype  the return type
     * @param ptypes the method type which supplies the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the single given parameter type.
     * @param rtype  the return type
     * @param ptype0 the parameter type
     * @return a method type with the given return value and parameter type
     * @throws NullPointerException if {@code rtype} or {@code ptype0} is null
     * @throws IllegalArgumentException if {@code ptype0} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has no parameter types.
     * @param rtype  the return type
     * @return a method type with the given return value
     * @throws NullPointerException if {@code rtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The leading parameter type is prepended to the remaining array.
     * @param rtype  the return type
     * @param ptype0 the first parameter type
     * @param ptypes the remaining parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates an instance of the given method type.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static int checkPtypes(Class<?>[] ptypes) {

    /** Return number of extra slots (count of long/double args). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_MH_INVOKER_ARITY = MAX_MH_ARITY-1;  // deduct one more for invoker

    /** This number is the maximum arity of a method handle invoker, 253.
     *  It is derived from the absolute JVM-imposed arity by subtracting two,
     *  which are the slots occupied by invoke method handle, and the
     *  target method handle, which are both at the beginning of the argument
     *  list used to invoke the target method handle.
     *  The longest possible invocation will look like
     *  {@code invokermh.invoke(targetmh, arg1, arg2, ..., arg253)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    // Issue:  Should we allow MH.invokeWithArguments to go to the full 255?

    /** This number is the maximum arity of a method handle, 254.
     *  It is derived from the absolute JVM-imposed arity by subtracting one,
     *  which is the slot occupied by the method handle itself at the
     *  beginning of the argument list used to invoke the method handle.
     *  The longest possible invocation will look like
     *  {@code mh.invoke(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_JVM_ARITY = 255;  // this is mandated by the JVM spec.

    /** This number, mandated by the JVM spec as 255,
     *  is the maximum number of <em>slots</em>
     *  that any Java method can receive in its argument list.
     *  It limits both JVM signatures and method type objects.
     *  The longest possible invocation will look like
     *  {@code staticMethod(arg1, arg2, ..., arg255)} or
     *  {@code x.virtualMethod(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?>[] ptypes, Class<?> rtype) {

    /**
     * Construct a temporary unchecked instance of MethodType for use only as a key to the intern table.
     * Does not check the given parameters for validity, and must be discarded after it is used as a searching key.
     * The parameters are reversed for this constructor, so that is is not accidentally used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?> rtype, Class<?>[] ptypes, boolean trusted) {

    /**
     * Check the given parameters for validity and store them into the final fields.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
public final

/**
 * A method type represents the arguments and return type accepted and
 * returned by a method handle, or the arguments and return type passed
 * and expected  by a method handle caller.  Method types must be properly
 * matched between a method handle and all its callers,
 * and the JVM's operations enforce this matching at, specifically
 * during calls to {@link MethodHandle#invokeExact MethodHandle.invokeExact}
 * and {@link MethodHandle#invoke MethodHandle.invoke}, and during execution
 * of {@code invokedynamic} instructions.
 * <p>
 * The structure is a return type accompanied by any number of parameter types.
 * The types (primitive, {@code void}, and reference) are represented by {@link Class} objects.
 * (For ease of exposition, we treat {@code void} as if it were a type.
 * In fact, it denotes the absence of a return type.)
 * <p>
 * All instances of {@code MethodType} are immutable.
 * Two instances are completely interchangeable if they compare equal.
 * Equality depends on pairwise correspondence of the return and parameter types and on nothing else.
 * <p>
 * This type can be created only by factory methods.
 * All factory methods may cache values, though caching is not guaranteed.
 * Some factory methods are static, while others are virtual methods which
 * modify precursor method types, e.g., by changing a selected parameter.
 * <p>
 * Factory methods which operate on groups of parameter types
 * are systematically presented in two versions, so that both Java arrays and
 * Java lists can be used to work with groups of parameter types.
 * The query methods {@code parameterArray} and {@code parameterList}
 * also provide a choice between arrays and lists.
 * <p>
 * {@code MethodType} objects are sometimes derived from bytecode instructions
 * such as {@code invokedynamic}, specifically from the type descriptor strings associated
 * with the instructions in a class file's constant pool.
 * <p>
 * Like classes and strings, method types can also be represented directly
 * in a class file's constant pool as constants.
 * A method type may be loaded by an {@code ldc} instruction which refers
 * to a suitable {@code CONSTANT_MethodType} constant pool entry.
 * The entry refers to a {@code CONSTANT_Utf8} spelling for the descriptor string.
 * (For full details on method type constants,
 * see sections 4.4.8 and 5.4.3.5 of the Java Virtual Machine Specification.)
 * <p>
 * When the JVM materializes a {@code MethodType} from a descriptor string,
 * all classes named in the descriptor must be accessible, and will be loaded.
 * (But the classes need not be initialized, as is the case with a {@code CONSTANT_Class}.)
 * This loading may occur at any time before the {@code MethodType} object is first derived.
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T add(T elem) {

        /**
         * Interns the element.
         * Always returns non-null element, matching the one in the intern set.
         * Under the race against another add(), it can return <i>different</i>
         * element, if another thread beats us to interning it.
         *
         * @param elem element to add
         * @return element that was actually added
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T get(T elem) {

        /**
         * Get the existing interned element.
         * This method returns null if no element is interned.
         *
         * @param elem element to look up
         * @return the interned element
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static class ConcurrentWeakInternSet<T> {

    /**
     * Simple implementation of weak concurrent intern set.
     *
     * @param <T> interned type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private Object readResolve() {

    /**
     * Resolves and initializes a {@code MethodType} object
     * after serialization.
     * @return the fully initialized {@code MethodType} object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType() {

    /**
     * For serialization only.
     * Sets the final fields to null, pending {@code Unsafe.putObject}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {

    /**
     * Reconstitute the {@code MethodType} instance from a stream (that is,
     * deserialize it).
     * This instance is a scratch object with bogus final fields.
     * It provides the parameters to the factory method called by
     * {@link #readResolve readResolve}.
     * After that call it is discarded.
     * @param s the stream to read the object from
     * @throws java.io.IOException if there is a problem reading the object
     * @throws ClassNotFoundException if one of the component classes cannot be resolved
     * @see #MethodType()
     * @see #readResolve
     * @see #writeObject
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {

    /**
     * Save the {@code MethodType} instance to a stream.
     *
     * @serialData
     * For portability, the serialized format does not refer to named fields.
     * Instead, the return type and parameter type arrays are written directly
     * from the {@code writeObject} method, using two calls to {@code s.writeObject}
     * as follows:
     * <blockquote><pre>{@code
s.writeObject(this.returnType());
s.writeObject(this.parameterArray());
     * }</pre></blockquote>
     * <p>
     * The deserialized field values are checked as if they were
     * provided to the factory method {@link #methodType(Class,Class[]) methodType}.
     * For example, null values, or {@code void} parameter types,
     * will lead to exceptions during deserialization.
     * @param s the stream to write the object to
     * @throws java.io.IOException if there is a problem writing the object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /**

    /// Serialization.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public String toMethodDescriptorString() {

    /**
     * Produces a bytecode descriptor representation of the method type.
     * <p>
     * Note that this is not a strict inverse of {@link #fromMethodDescriptorString fromMethodDescriptorString}.
     * Two distinct classes which share a common name but have different class loaders
     * will appear identical when viewed within descriptor strings.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * {@link #fromMethodDescriptorString(java.lang.String, java.lang.ClassLoader) fromMethodDescriptorString},
     * because the latter requires a suitable class loader argument.
     * @return the bytecode type descriptor representation
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader loader)

    /**
     * Finds or creates an instance of a method type, given the spelling of its bytecode descriptor.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * Any class or interface name embedded in the descriptor string
     * will be resolved by calling {@link ClassLoader#loadClass(java.lang.String)}
     * on the given loader (or if it is null, on the system class loader).
     * <p>
     * Note that it is possible to encounter method types which cannot be
     * constructed by this method, because their component types are
     * not all reachable from a common class loader.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * @param descriptor a bytecode-level type descriptor string "(T...)T"
     * @param loader the class loader in which to look up the types
     * @return a method type matching the bytecode-level type descriptor
     * @throws NullPointerException if the string is null
     * @throws IllegalArgumentException if the string is not well-formed
     * @throws TypeNotPresentException if a named type cannot be found
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int returnSlotCount() {

    /** Reports the number of JVM stack slots required to receive a return value
     * from a method of this type.
     * If the {@link #returnType() return type} is void, it will be zero,
     * else if the return type is long or double, it will be two, else one.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @return the number of JVM stack slots (0, 1, or 2) for this type's return value
     * Will be removed for PFD.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int parameterSlotDepth(int num) {

    /** Reports the number of JVM stack slots which carry all parameters including and after
     * the given position, which must be in the range of 0 to
     * {@code parameterCount} inclusive.  Successive parameters are
     * more shallowly stacked, and parameters are indexed in the bytecodes
     * according to their trailing edge.  Thus, to obtain the depth
     * in the outgoing call stack of parameter {@code N}, obtain
     * the {@code parameterSlotDepth} of its trailing edge
     * at position {@code N+1}.
     * <p>
     * Parameters of type {@code long} and {@code double} occupy
     * two stack slots (for historical reasons) and all others occupy one.
     * Therefore, the number returned is the number of arguments
     * <em>including</em> and <em>after</em> the given parameter,
     * <em>plus</em> the number of long or double arguments
     * at or after after the argument for the given parameter.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @param num an index (zero-based, inclusive) within the parameter types
     * @return the index of the (shallowest) JVM stack slot transmitting the
     *         given parameter
     * @throws IllegalArgumentException if {@code num} is negative or greater than {@code parameterCount()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /** Reports the number of JVM stack slots required to invoke a method

    /// Queries which have to do with the bytecode architecture
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static boolean explicitCastEquivalentToAsType(Class<?> src, Class<?> dst) {

    /** Reports true if the src can be converted to the dst, by both asType and MHs.eCE,
     *  and with the same effect.
     *  MHs.eCA has the following "upgrades" to MH.asType:
     *  1. interfaces are unchecked (that is, treated as if aliased to Object)
     *     Therefore, {@code Object->CharSequence} is possible in both cases but has different semantics
     *  2. the full matrix of primitive-to-primitive conversions is supported
     *     Narrowing like {@code long->byte} and basic-typing like {@code boolean->int}
     *     are not supported by asType, but anything supported by asType is equivalent
     *     with MHs.eCE.
     *  3a. unboxing conversions can be followed by the full matrix of primitive conversions
     *  3b. unboxing of null is permitted (creates a zero primitive value)
     * Other than interfaces, reference-to-reference conversions are the same.
     * Boxing primitives to references is the same for both operators.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** Returns true if MHs.explicitCastArguments produces the same result as MH.asType.
     *  If the type conversion is impossible for either, the result should be false.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the new parameters can be viewed (w/o casting) under the old parameter types. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the old return type can always be viewed (w/o casting) under new return type,
     *  and the new parameters can be viewed (w/o casting) under the old parameter types.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns a string representation of the method type,
     * of the form {@code "(PT0,PT1...)RT"}.
     * The string representation of a method type is a
     * parenthesis enclosed, comma separated list of type names,
     * followed immediately by the return type.
     * <p>
     * Each type is represented by its
     * {@link java.lang.Class#getSimpleName simple name}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns the hash code value for this method type.
     * It is defined to be the same as the hashcode of a List
     * whose elements are the return type followed by the
     * parameter types.
     * @return the hash code value for this method type
     * @see Object#hashCode()
     * @see #equals(Object)
     * @see List#hashCode()
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Compares the specified object with this type for equality.
     * That is, it returns <tt>true</tt> if and only if the specified object
     * is also a method type with exactly the same parameters and return type.
     * @param x object to compare
     * @see Object#equals(Object)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?>[] parameterArray() {

    /**
     * Presents the parameter types as an array (a convenience method).
     * Changes to the array will not result in changes to the type.
     * @return the parameter types (as a fresh copy if necessary)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public List<Class<?>> parameterList() {

    /**
     * Presents the parameter types as a list (a convenience method).
     * The list will be immutable.
     * @return the parameter types (as an immutable list)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> returnType() {

    /**
     * Returns the return type of this method type.
     * @return the return type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public int parameterCount() {

    /**
     * Returns the number of parameter types in this method type.
     * @return the number of parameter types
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> parameterType(int num) {

    /**
     * Returns the parameter type at the specified index, within this method type.
     * @param num the index (zero-based) of the desired parameter type
     * @return the selected parameter type
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType unwrap() {

    /**
     * Converts all wrapper types to their corresponding primitive types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * A return type of {@code java.lang.Void} is changed to {@code void}.
     * @return a version of the original type with all wrapper types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType wrap() {

    /**
     * Converts all primitive types to their corresponding wrapper types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All reference types (including wrapper types) will remain unchanged.
     * A {@code void} return type is changed to the type {@code java.lang.Void}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all primitive types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType generic() {

    /**
     * Converts all types, both reference and primitive, to {@code Object}.
     * Convenience method for {@link #genericMethodType(int) genericMethodType}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType invokerType() {

    /**
     * @return a version of the original type with MethodHandle prepended as the first argument
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType basicType() {

    /**
     * Erases all reference types to {@code Object}, and all subword types to {@code int}.
     * This is the reduced type polymorphism used by private methods
     * such as {@link MethodHandle#invokeBasic invokeBasic}.
     * @return a version of the original type with all reference and subword types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType erase() {

    /**
     * Erases all reference types to {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * @return a version of the original type with all reference types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasWrappers() {

    /**
     * Reports if this type contains a wrapper argument or return value.
     * Wrappers are types which box primitive values, such as {@link Integer}.
     * The reference type {@code java.lang.Void} counts as a wrapper,
     * if it occurs as a return type.
     * @return true if any of the types are wrappers
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasPrimitives() {

    /**
     * Reports if this type contains a primitive argument or return value.
     * The return type {@code void} counts as a primitive.
     * @return true if any of the types are primitives
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeReturnType(Class<?> nrtype) {

    /**
     * Finds or creates a method type with a different return type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param nrtype a return parameter type to replace the old one with
     * @return the same type, except with the return type change
     * @throws NullPointerException if {@code nrtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType dropParameterTypes(int start, int end) {

    /**
     * Finds or creates a method type with some parameter types omitted.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the index (zero-based) of the first parameter type to remove
     * @param end    the index (greater than {@code start}) of the first parameter type after not to remove
     * @return the same type, except with the selected parameter(s) removed
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asCollectorType(Class<?> arrayType, int arrayLength) {

    /** Delete the last parameter type and replace it with arrayLength copies of the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to insert
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ Class<?> leadingReferenceParameter() {

    /** Return the leading parameter type, which must exist and be a reference.
     *  @return the leading parameter type, after error checks
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asSpreaderType(Class<?> arrayType, int arrayLength) {

    /** Replace the last arrayLength parameter types with the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to change
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType replaceParameterTypes(int start, int end, Class<?>... ptypesToInsert) {

     /**
     * Finds or creates a method type with modified parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the position (zero-based) of the first replaced parameter type(s)
     * @param end    the position (zero-based) after the last replaced parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) replaced
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeParameterType(int num, Class<?> nptype) {

    /**
     * Finds or creates a method type with a single different parameter type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the index (zero-based) of the parameter type to change
     * @param nptype a new parameter type to replace the old one with
     * @return the same type, except with the selected parameter changed
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     * @throws IllegalArgumentException if {@code nptype} is {@code void.class}
     * @throws NullPointerException if {@code nptype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are all {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be Object.
     * @param objectArgCount number of parameters
     * @return a generally applicable method type, for all calls of the given argument count
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255
     * @see #genericMethodType(int, boolean)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are {@code Object} with an optional trailing {@code Object[]} array.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be {@code Object},
     * except the final array parameter if any, which will be {@code Object[]}.
     * @param objectArgCount number of parameters (excluding the final array parameter if any)
     * @param finalArray whether there will be a trailing array parameter, of type {@code Object[]}
     * @return a generally applicable method type, for all calls of the given fixed argument count and a collected array of further arguments
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255 (or 254, if {@code finalArray} is true)
     * @see #genericMethodType(int)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*trusted*/ static

    /**
     * Sole factory method to find or create an interned method type.
     * @param rtype desired return type
     * @param ptypes desired parameter types
     * @param trusted whether the ptypes can be used without cloning
     * @return the unique method type of the desired structure
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the same parameter types as {@code ptypes},
     * and the specified return type.
     * @param rtype  the return type
     * @param ptypes the method type which supplies the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the single given parameter type.
     * @param rtype  the return type
     * @param ptype0 the parameter type
     * @return a method type with the given return value and parameter type
     * @throws NullPointerException if {@code rtype} or {@code ptype0} is null
     * @throws IllegalArgumentException if {@code ptype0} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has no parameter types.
     * @param rtype  the return type
     * @return a method type with the given return value
     * @throws NullPointerException if {@code rtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The leading parameter type is prepended to the remaining array.
     * @param rtype  the return type
     * @param ptype0 the first parameter type
     * @param ptypes the remaining parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates an instance of the given method type.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static int checkPtypes(Class<?>[] ptypes) {

    /** Return number of extra slots (count of long/double args). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_MH_INVOKER_ARITY = MAX_MH_ARITY-1;  // deduct one more for invoker

    /** This number is the maximum arity of a method handle invoker, 253.
     *  It is derived from the absolute JVM-imposed arity by subtracting two,
     *  which are the slots occupied by invoke method handle, and the
     *  target method handle, which are both at the beginning of the argument
     *  list used to invoke the target method handle.
     *  The longest possible invocation will look like
     *  {@code invokermh.invoke(targetmh, arg1, arg2, ..., arg253)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    // Issue:  Should we allow MH.invokeWithArguments to go to the full 255?

    /** This number is the maximum arity of a method handle, 254.
     *  It is derived from the absolute JVM-imposed arity by subtracting one,
     *  which is the slot occupied by the method handle itself at the
     *  beginning of the argument list used to invoke the method handle.
     *  The longest possible invocation will look like
     *  {@code mh.invoke(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_JVM_ARITY = 255;  // this is mandated by the JVM spec.

    /** This number, mandated by the JVM spec as 255,
     *  is the maximum number of <em>slots</em>
     *  that any Java method can receive in its argument list.
     *  It limits both JVM signatures and method type objects.
     *  The longest possible invocation will look like
     *  {@code staticMethod(arg1, arg2, ..., arg255)} or
     *  {@code x.virtualMethod(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?>[] ptypes, Class<?> rtype) {

    /**
     * Construct a temporary unchecked instance of MethodType for use only as a key to the intern table.
     * Does not check the given parameters for validity, and must be discarded after it is used as a searching key.
     * The parameters are reversed for this constructor, so that is is not accidentally used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?> rtype, Class<?>[] ptypes, boolean trusted) {

    /**
     * Check the given parameters for validity and store them into the final fields.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
public final

/**
 * A method type represents the arguments and return type accepted and
 * returned by a method handle, or the arguments and return type passed
 * and expected  by a method handle caller.  Method types must be properly
 * matched between a method handle and all its callers,
 * and the JVM's operations enforce this matching at, specifically
 * during calls to {@link MethodHandle#invokeExact MethodHandle.invokeExact}
 * and {@link MethodHandle#invoke MethodHandle.invoke}, and during execution
 * of {@code invokedynamic} instructions.
 * <p>
 * The structure is a return type accompanied by any number of parameter types.
 * The types (primitive, {@code void}, and reference) are represented by {@link Class} objects.
 * (For ease of exposition, we treat {@code void} as if it were a type.
 * In fact, it denotes the absence of a return type.)
 * <p>
 * All instances of {@code MethodType} are immutable.
 * Two instances are completely interchangeable if they compare equal.
 * Equality depends on pairwise correspondence of the return and parameter types and on nothing else.
 * <p>
 * This type can be created only by factory methods.
 * All factory methods may cache values, though caching is not guaranteed.
 * Some factory methods are static, while others are virtual methods which
 * modify precursor method types, e.g., by changing a selected parameter.
 * <p>
 * Factory methods which operate on groups of parameter types
 * are systematically presented in two versions, so that both Java arrays and
 * Java lists can be used to work with groups of parameter types.
 * The query methods {@code parameterArray} and {@code parameterList}
 * also provide a choice between arrays and lists.
 * <p>
 * {@code MethodType} objects are sometimes derived from bytecode instructions
 * such as {@code invokedynamic}, specifically from the type descriptor strings associated
 * with the instructions in a class file's constant pool.
 * <p>
 * Like classes and strings, method types can also be represented directly
 * in a class file's constant pool as constants.
 * A method type may be loaded by an {@code ldc} instruction which refers
 * to a suitable {@code CONSTANT_MethodType} constant pool entry.
 * The entry refers to a {@code CONSTANT_Utf8} spelling for the descriptor string.
 * (For full details on method type constants,
 * see sections 4.4.8 and 5.4.3.5 of the Java Virtual Machine Specification.)
 * <p>
 * When the JVM materializes a {@code MethodType} from a descriptor string,
 * all classes named in the descriptor must be accessible, and will be loaded.
 * (But the classes need not be initialized, as is the case with a {@code CONSTANT_Class}.)
 * This loading may occur at any time before the {@code MethodType} object is first derived.
 * @author John Rose, JSR 292 EG
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T add(T elem) {

        /**
         * Interns the element.
         * Always returns non-null element, matching the one in the intern set.
         * Under the race against another add(), it can return <i>different</i>
         * element, if another thread beats us to interning it.
         *
         * @param elem element to add
         * @return element that was actually added
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
        public T get(T elem) {

        /**
         * Get the existing interned element.
         * This method returns null if no element is interned.
         *
         * @param elem element to look up
         * @return the interned element
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static class ConcurrentWeakInternSet<T> {

    /**
     * Simple implementation of weak concurrent intern set.
     *
     * @param <T> interned type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private Object readResolve() {

    /**
     * Resolves and initializes a {@code MethodType} object
     * after serialization.
     * @return the fully initialized {@code MethodType} object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType() {

    /**
     * For serialization only.
     * Sets the final fields to null, pending {@code Unsafe.putObject}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {

    /**
     * Reconstitute the {@code MethodType} instance from a stream (that is,
     * deserialize it).
     * This instance is a scratch object with bogus final fields.
     * It provides the parameters to the factory method called by
     * {@link #readResolve readResolve}.
     * After that call it is discarded.
     * @param s the stream to read the object from
     * @throws java.io.IOException if there is a problem reading the object
     * @throws ClassNotFoundException if one of the component classes cannot be resolved
     * @see #MethodType()
     * @see #readResolve
     * @see #writeObject
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {

    /**
     * Save the {@code MethodType} instance to a stream.
     *
     * @serialData
     * For portability, the serialized format does not refer to named fields.
     * Instead, the return type and parameter type arrays are written directly
     * from the {@code writeObject} method, using two calls to {@code s.writeObject}
     * as follows:
     * <blockquote><pre>{@code
s.writeObject(this.returnType());
s.writeObject(this.parameterArray());
     * }</pre></blockquote>
     * <p>
     * The deserialized field values are checked as if they were
     * provided to the factory method {@link #methodType(Class,Class[]) methodType}.
     * For example, null values, or {@code void} parameter types,
     * will lead to exceptions during deserialization.
     * @param s the stream to write the object to
     * @throws java.io.IOException if there is a problem writing the object
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /**

    /// Serialization.
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public String toMethodDescriptorString() {

    /**
     * Produces a bytecode descriptor representation of the method type.
     * <p>
     * Note that this is not a strict inverse of {@link #fromMethodDescriptorString fromMethodDescriptorString}.
     * Two distinct classes which share a common name but have different class loaders
     * will appear identical when viewed within descriptor strings.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * {@link #fromMethodDescriptorString(java.lang.String, java.lang.ClassLoader) fromMethodDescriptorString},
     * because the latter requires a suitable class loader argument.
     * @return the bytecode type descriptor representation
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader loader)

    /**
     * Finds or creates an instance of a method type, given the spelling of its bytecode descriptor.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * Any class or interface name embedded in the descriptor string
     * will be resolved by calling {@link ClassLoader#loadClass(java.lang.String)}
     * on the given loader (or if it is null, on the system class loader).
     * <p>
     * Note that it is possible to encounter method types which cannot be
     * constructed by this method, because their component types are
     * not all reachable from a common class loader.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and {@code invokedynamic}.
     * @param descriptor a bytecode-level type descriptor string "(T...)T"
     * @param loader the class loader in which to look up the types
     * @return a method type matching the bytecode-level type descriptor
     * @throws NullPointerException if the string is null
     * @throws IllegalArgumentException if the string is not well-formed
     * @throws TypeNotPresentException if a named type cannot be found
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int returnSlotCount() {

    /** Reports the number of JVM stack slots required to receive a return value
     * from a method of this type.
     * If the {@link #returnType() return type} is void, it will be zero,
     * else if the return type is long or double, it will be two, else one.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @return the number of JVM stack slots (0, 1, or 2) for this type's return value
     * Will be removed for PFD.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ int parameterSlotDepth(int num) {

    /** Reports the number of JVM stack slots which carry all parameters including and after
     * the given position, which must be in the range of 0 to
     * {@code parameterCount} inclusive.  Successive parameters are
     * more shallowly stacked, and parameters are indexed in the bytecodes
     * according to their trailing edge.  Thus, to obtain the depth
     * in the outgoing call stack of parameter {@code N}, obtain
     * the {@code parameterSlotDepth} of its trailing edge
     * at position {@code N+1}.
     * <p>
     * Parameters of type {@code long} and {@code double} occupy
     * two stack slots (for historical reasons) and all others occupy one.
     * Therefore, the number returned is the number of arguments
     * <em>including</em> and <em>after</em> the given parameter,
     * <em>plus</em> the number of long or double arguments
     * at or after after the argument for the given parameter.
     * <p>
     * This method is included for the benefit of applications that must
     * generate bytecodes that process method handles and invokedynamic.
     * @param num an index (zero-based, inclusive) within the parameter types
     * @return the index of the (shallowest) JVM stack slot transmitting the
     *         given parameter
     * @throws IllegalArgumentException if {@code num} is negative or greater than {@code parameterCount()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /** Reports the number of JVM stack slots required to invoke a method

    /// Queries which have to do with the bytecode architecture
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static boolean explicitCastEquivalentToAsType(Class<?> src, Class<?> dst) {

    /** Reports true if the src can be converted to the dst, by both asType and MHs.eCE,
     *  and with the same effect.
     *  MHs.eCA has the following "upgrades" to MH.asType:
     *  1. interfaces are unchecked (that is, treated as if aliased to Object)
     *     Therefore, {@code Object->CharSequence} is possible in both cases but has different semantics
     *  2. the full matrix of primitive-to-primitive conversions is supported
     *     Narrowing like {@code long->byte} and basic-typing like {@code boolean->int}
     *     are not supported by asType, but anything supported by asType is equivalent
     *     with MHs.eCE.
     *  3a. unboxing conversions can be followed by the full matrix of primitive conversions
     *  3b. unboxing of null is permitted (creates a zero primitive value)
     * Other than interfaces, reference-to-reference conversions are the same.
     * Boxing primitives to references is the same for both operators.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** Returns true if MHs.explicitCastArguments produces the same result as MH.asType.
     *  If the type conversion is impossible for either, the result should be false.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the new parameters can be viewed (w/o casting) under the old parameter types. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/

    /** True if the old return type can always be viewed (w/o casting) under new return type,
     *  and the new parameters can be viewed (w/o casting) under the old parameter types.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns a string representation of the method type,
     * of the form {@code "(PT0,PT1...)RT"}.
     * The string representation of a method type is a
     * parenthesis enclosed, comma separated list of type names,
     * followed immediately by the return type.
     * <p>
     * Each type is represented by its
     * {@link java.lang.Class#getSimpleName simple name}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Returns the hash code value for this method type.
     * It is defined to be the same as the hashcode of a List
     * whose elements are the return type followed by the
     * parameter types.
     * @return the hash code value for this method type
     * @see Object#hashCode()
     * @see #equals(Object)
     * @see List#hashCode()
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    @Override

    /**
     * Compares the specified object with this type for equality.
     * That is, it returns <tt>true</tt> if and only if the specified object
     * is also a method type with exactly the same parameters and return type.
     * @param x object to compare
     * @see Object#equals(Object)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?>[] parameterArray() {

    /**
     * Presents the parameter types as an array (a convenience method).
     * Changes to the array will not result in changes to the type.
     * @return the parameter types (as a fresh copy if necessary)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public List<Class<?>> parameterList() {

    /**
     * Presents the parameter types as a list (a convenience method).
     * The list will be immutable.
     * @return the parameter types (as an immutable list)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> returnType() {

    /**
     * Returns the return type of this method type.
     * @return the return type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public int parameterCount() {

    /**
     * Returns the number of parameter types in this method type.
     * @return the number of parameter types
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public Class<?> parameterType(int num) {

    /**
     * Returns the parameter type at the specified index, within this method type.
     * @param num the index (zero-based) of the desired parameter type
     * @return the selected parameter type
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType unwrap() {

    /**
     * Converts all wrapper types to their corresponding primitive types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * A return type of {@code java.lang.Void} is changed to {@code void}.
     * @return a version of the original type with all wrapper types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType wrap() {

    /**
     * Converts all primitive types to their corresponding wrapper types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All reference types (including wrapper types) will remain unchanged.
     * A {@code void} return type is changed to the type {@code java.lang.Void}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all primitive types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType generic() {

    /**
     * Converts all types, both reference and primitive, to {@code Object}.
     * Convenience method for {@link #genericMethodType(int) genericMethodType}.
     * The expression {@code type.wrap().erase()} produces the same value
     * as {@code type.generic()}.
     * @return a version of the original type with all types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType invokerType() {

    /**
     * @return a version of the original type with MethodHandle prepended as the first argument
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType basicType() {

    /**
     * Erases all reference types to {@code Object}, and all subword types to {@code int}.
     * This is the reduced type polymorphism used by private methods
     * such as {@link MethodHandle#invokeBasic invokeBasic}.
     * @return a version of the original type with all reference and subword types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType erase() {

    /**
     * Erases all reference types to {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All primitive types (including {@code void}) will remain unchanged.
     * @return a version of the original type with all reference types replaced
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasWrappers() {

    /**
     * Reports if this type contains a wrapper argument or return value.
     * Wrappers are types which box primitive values, such as {@link Integer}.
     * The reference type {@code java.lang.Void} counts as a wrapper,
     * if it occurs as a return type.
     * @return true if any of the types are wrappers
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public boolean hasPrimitives() {

    /**
     * Reports if this type contains a primitive argument or return value.
     * The return type {@code void} counts as a primitive.
     * @return true if any of the types are primitives
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeReturnType(Class<?> nrtype) {

    /**
     * Finds or creates a method type with a different return type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param nrtype a return parameter type to replace the old one with
     * @return the same type, except with the return type change
     * @throws NullPointerException if {@code nrtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType dropParameterTypes(int start, int end) {

    /**
     * Finds or creates a method type with some parameter types omitted.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the index (zero-based) of the first parameter type to remove
     * @param end    the index (greater than {@code start}) of the first parameter type after not to remove
     * @return the same type, except with the selected parameter(s) removed
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asCollectorType(Class<?> arrayType, int arrayLength) {

    /** Delete the last parameter type and replace it with arrayLength copies of the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to insert
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ Class<?> leadingReferenceParameter() {

    /** Return the leading parameter type, which must exist and be a reference.
     *  @return the leading parameter type, after error checks
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType asSpreaderType(Class<?> arrayType, int arrayLength) {

    /** Replace the last arrayLength parameter types with the component type of arrayType.
     * @param arrayType any array type
     * @param arrayLength the number of parameter types to change
     * @return the resulting type
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ MethodType replaceParameterTypes(int start, int end, Class<?>... ptypesToInsert) {

     /**
     * Finds or creates a method type with modified parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param start  the position (zero-based) of the first replaced parameter type(s)
     * @param end    the position (zero-based) after the last replaced parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) replaced
     * @throws IndexOutOfBoundsException if {@code start} is negative or greater than {@code parameterCount()}
     *                                  or if {@code end} is negative or greater than {@code parameterCount()}
     *                                  or if {@code start} is greater than {@code end}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, List<Class<?>> ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType appendParameterTypes(Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param ptypesToInsert zero or more new parameter types to insert after the end of the parameter list
     * @return the same type, except with the selected parameter(s) appended
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType insertParameterTypes(int num, Class<?>... ptypesToInsert) {

    /**
     * Finds or creates a method type with additional parameter types.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the position (zero-based) of the inserted parameter type(s)
     * @param ptypesToInsert zero or more new parameter types to insert into the parameter list
     * @return the same type, except with the selected parameter(s) inserted
     * @throws IndexOutOfBoundsException if {@code num} is negative or greater than {@code parameterCount()}
     * @throws IllegalArgumentException if any element of {@code ptypesToInsert} is {@code void.class}
     *                                  or if the resulting method type would have more than 255 parameter slots
     * @throws NullPointerException if {@code ptypesToInsert} or any of its elements is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public MethodType changeParameterType(int num, Class<?> nptype) {

    /**
     * Finds or creates a method type with a single different parameter type.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param num    the index (zero-based) of the parameter type to change
     * @param nptype a new parameter type to replace the old one with
     * @return the same type, except with the selected parameter changed
     * @throws IndexOutOfBoundsException if {@code num} is not a valid index into {@code parameterArray()}
     * @throws IllegalArgumentException if {@code nptype} is {@code void.class}
     * @throws NullPointerException if {@code nptype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are all {@code Object}.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be Object.
     * @param objectArgCount number of parameters
     * @return a generally applicable method type, for all calls of the given argument count
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255
     * @see #genericMethodType(int, boolean)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type whose components are {@code Object} with an optional trailing {@code Object[]} array.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * All parameters and the return type will be {@code Object},
     * except the final array parameter if any, which will be {@code Object[]}.
     * @param objectArgCount number of parameters (excluding the final array parameter if any)
     * @param finalArray whether there will be a trailing array parameter, of type {@code Object[]}
     * @return a generally applicable method type, for all calls of the given fixed argument count and a collected array of further arguments
     * @throws IllegalArgumentException if {@code objectArgCount} is negative or greater than 255 (or 254, if {@code finalArray} is true)
     * @see #genericMethodType(int)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*trusted*/ static

    /**
     * Sole factory method to find or create an interned method type.
     * @param rtype desired return type
     * @param ptypes desired parameter types
     * @param trusted whether the ptypes can be used without cloning
     * @return the unique method type of the desired structure
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the same parameter types as {@code ptypes},
     * and the specified return type.
     * @param rtype  the return type
     * @param ptypes the method type which supplies the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has the single given parameter type.
     * @param rtype  the return type
     * @param ptype0 the parameter type
     * @return a method type with the given return value and parameter type
     * @throws NullPointerException if {@code rtype} or {@code ptype0} is null
     * @throws IllegalArgumentException if {@code ptype0} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The resulting method has no parameter types.
     * @param rtype  the return type
     * @return a method type with the given return value
     * @throws NullPointerException if {@code rtype} is null
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * The leading parameter type is prepended to the remaining array.
     * @param rtype  the return type
     * @param ptype0 the first parameter type
     * @param ptypes the remaining parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if {@code ptype0} or {@code ptypes} or any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates a method type with the given components.
     * Convenience method for {@link #methodType(java.lang.Class, java.lang.Class[]) methodType}.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    public static

    /**
     * Finds or creates an instance of the given method type.
     * @param rtype  the return type
     * @param ptypes the parameter types
     * @return a method type with the given components
     * @throws NullPointerException if {@code rtype} or {@code ptypes} or any element of {@code ptypes} is null
     * @throws IllegalArgumentException if any element of {@code ptypes} is {@code void.class}
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private static int checkPtypes(Class<?>[] ptypes) {

    /** Return number of extra slots (count of long/double args). */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_MH_INVOKER_ARITY = MAX_MH_ARITY-1;  // deduct one more for invoker

    /** This number is the maximum arity of a method handle invoker, 253.
     *  It is derived from the absolute JVM-imposed arity by subtracting two,
     *  which are the slots occupied by invoke method handle, and the
     *  target method handle, which are both at the beginning of the argument
     *  list used to invoke the target method handle.
     *  The longest possible invocation will look like
     *  {@code invokermh.invoke(targetmh, arg1, arg2, ..., arg253)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    // Issue:  Should we allow MH.invokeWithArguments to go to the full 255?

    /** This number is the maximum arity of a method handle, 254.
     *  It is derived from the absolute JVM-imposed arity by subtracting one,
     *  which is the slot occupied by the method handle itself at the
     *  beginning of the argument list used to invoke the method handle.
     *  The longest possible invocation will look like
     *  {@code mh.invoke(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    /*non-public*/ static final int MAX_JVM_ARITY = 255;  // this is mandated by the JVM spec.

    /** This number, mandated by the JVM spec as 255,
     *  is the maximum number of <em>slots</em>
     *  that any Java method can receive in its argument list.
     *  It limits both JVM signatures and method type objects.
     *  The longest possible invocation will look like
     *  {@code staticMethod(arg1, arg2, ..., arg255)} or
     *  {@code x.virtualMethod(arg1, arg2, ..., arg254)}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?>[] ptypes, Class<?> rtype) {

    /**
     * Construct a temporary unchecked instance of MethodType for use only as a key to the intern table.
     * Does not check the given parameters for validity, and must be discarded after it is used as a searching key.
     * The parameters are reversed for this constructor, so that is is not accidentally used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
    private MethodType(Class<?> rtype, Class<?>[] ptypes, boolean trusted) {

    /**
     * Check the given parameters for validity and store them into the final fields.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MethodType.java
public final

/**
 * A method type represents the arguments and return type accepted and
 * returned by a method handle, or the arguments and return type passed
 * and expected  by a method handle caller.  Method types must be properly
 * matched between a method handle and all its callers,
 * and the JVM's operations enforce this matching at, specifically
 * during calls to {@link MethodHandle#invokeExact MethodHandle.invokeExact}
 * and {@link MethodHandle#invoke MethodHandle.invoke}, and during execution
 * of {@code invokedynamic} instructions.
 * <p>
 * The structure is a return type accompanied by any number of parameter types.
 * The types (primitive, {@code void}, and reference) are represented by {@link Class} objects.
 * (For ease of exposition, we treat {@code void} as if it were a type.
 * In fact, it denotes the absence of a return type.)
 * <p>
 * All instances of {@code MethodType} are immutable.
 * Two instances are completely interchangeable if they compare equal.
 * Equality depends on pairwise correspondence of the return and parameter types and on nothing else.
 * <p>
 * This type can be created only by factory methods.
 * All factory methods may cache values, though caching is not guaranteed.
 * Some factory methods are static, while others are virtual methods which
 * modify precursor method types, e.g., by changing a selected parameter.
 * <p>
 * Factory methods which operate on groups of parameter types
 * are systematically presented in two versions, so that both Java arrays and
 * Java lists can be used to work with groups of parameter types.
 * The query methods {@code parameterArray} and {@code parameterList}
 * also provide a choice between arrays and lists.
 * <p>
 * {@code MethodType} objects are sometimes derived from bytecode instructions
 * such as {@code invokedynamic}, specifically from the type descriptor strings associated
 * with the instructions in a class file's constant pool.
 * <p>
 * Like classes and strings, method types can also be represented directly
 * in a class file's constant pool as constants.
 * A method type may be loaded by an {@code ldc} instruction which refers
 * to a suitable {@code CONSTANT_MethodType} constant pool entry.
 * The entry refers to a {@code CONSTANT_Utf8} spelling for the descriptor string.
 * (For full details on method type constants,
 * see sections 4.4.8 and 5.4.3.5 of the Java Virtual Machine Specification.)
 * <p>
 * When the JVM materializes a {@code MethodType} from a descriptor string,
 * all classes named in the descriptor must be accessible, and will be loaded.
 * (But the classes need not be initialized, as is the case with a {@code CONSTANT_Class}.)
 * This loading may occur at any time before the {@code MethodType} object is first derived.
 * @author John Rose, JSR 292 EG
 */
