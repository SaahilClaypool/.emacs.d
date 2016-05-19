_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getNestedTypes(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all nested types defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                String name, Class<?> type, Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned fields will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getConstructors(Class<?> defc, Class<?> lookupClass) {

        /** Return a list of all constructors defined by the given class.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                String name, MethodType type, Class<?> lookupClass) {

        /** Return a list of matching methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned methods will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, return null.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, a {@linkplain ReflectiveOperationException} is thrown.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        private MemberName resolve(byte refKind, MemberName ref, Class<?> lookupClass) {

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, null is returned.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        List<MemberName> getMembers(Class<?> defc,
                String matchName, Object matchType,
                int matchFlags, Class<?> lookupClass) {

        /// Queries
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static class Factory {

    /** A factory type for resolving member names with the help of the VM.
     *  TBD: Define access-safe public constructors for this factory.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static Factory getFactory() {

    /** Actually making a query requires an access check. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LocalVariableHidesMemberVariable")

    /** Produce a string form of this member name.
     *  For types, it is simply the type's own string (as reported by {@code toString}).
     *  For fields, it is {@code "DeclaringClass.name/type"}.
     *  For methods and constructors, it is {@code "DeclaringClass.name(ptype...)rtype"}.
     *  If the declaring class is null, the prefix {@code "DeclaringClass."} is omitted.
     *  If the member is unresolved, a prefix {@code "*."} is prepended.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isResolved() {

    /** Query whether this member name is resolved.
     *  A resolved member name is one for which the JVM has found
     *  a method, constructor, field, or type binding corresponding exactly to the name.
     *  (Document?)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean hasReceiverTypeDispatch() {

    /** Query whether this member name is resolved to a non-static, non-final method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(byte refKind, Class<?> defClass, String name, Object type) {

    /** Create a method, constructor, or field name from the given components:
     *  Reference kind, declaring class, name, type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, MethodType type, byte refKind) {

    /** Create a method or constructor name from the given components:
     *  Declaring class, name, type, reference kind.
     *  It will be a constructor if and only if the name is {@code "&lt;init&gt;"}.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The last argument is optional, a boolean which requests REF_invokeSpecial.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, Class<?> type, byte refKind) {

    /** Create a field or type name from the given components:
     *  Declaring class, name, type, reference kind.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean equals(MemberName that) {

    /** Decide if two member names have exactly the same symbolic content.
     *  Does not take into account any actual class members, so even if
     *  two member names resolve to the same actual member, they may
     *  be distinct references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName getDefinition() {

    /** Get the definition of this member name.
     *  This may be in a super-class of the declaring class of this member.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    static MemberName makeMethodHandleInvoke(String name, MethodType type) {

    /**
     * Create a name for a signature-polymorphic invoker.
     * This is a placeholder for a signature-polymorphic instance
     * (of MH.invokeExact, etc.) that the JVM does not reify.
     * See comments on {@link MethodHandleNatives#linkMethod}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> type) {

    /** Create a name for the given class.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Field fld) {

    /** Create a name for the given reflected field.  The resulting name will be in a resolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LeakingThisInConstructor")

    /** Create a name for the given reflected constructor.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asNormalOriginal() {

    /** If this MN is a REF_invokeSpecial, return a clone with the "normal" kind
     *  REF_invokeVirtual; also switch either to REF_invokeInterface if clazz.isInterface.
     *  The end result is to get a fully virtualized version of the MN.
     *  (Note that resolving in the JVM will sometimes devirtualize, changing
     *  REF_invokeVirtual of a final to REF_invokeSpecial, and REF_invokeInterface
     *  in some corner cases to either of the previous two; this transform
     *  undoes that change under the assumption that it occurred.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asConstructor() {

    /** If this MN is not REF_newInvokeSpecial, return a clone with that ref. kind.
     *  In that case it must already be REF_invokeSpecial.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Method m) {

    /** Create a name for the given reflected method.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void expandFromVM() {

    /**
     * Calls down to the VM to fill in the fields.  This method is
     * synchronized to avoid racing calls.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void init(Class<?> defClass, String name, Object type, int flags) {

    /** Initialize a query.   It is not resolved. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAccessibleFrom(Class<?> lookupClass) {

    /** Utility method to query whether this member is accessible from a given lookup class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isCallerSensitive() {

    /** Query whether this member has a CallerSensitive annotation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPackage() {

    /** Utility method to query whether this member is neither public, private, nor protected. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isType() {

    /** Query whether this member is a type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isField() {

    /** Query whether this member is a field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isConstructor() {

    /** Query whether this member is a constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethod() {

    /** Query whether this member is a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFieldOrMethod() {

    /** Utility method to query whether this member is a method, constructor, or field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isInvocable() {

    /** Utility method to query whether this member is a method or constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isSynthetic() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVarargs() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isBridge() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isNative() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAbstract() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVolatile() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean canBeStaticallyBound() {

    /** Utility method to query whether this member or its defining class is final. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFinal() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isProtected() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPrivate() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPublic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isStatic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethodHandleInvoke() {

    /** Utility method to query if this member is a method handle invocation (invoke or invokeExact).
     *  Also returns true for the non-public MH.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public byte getReferenceKind() {

    /** Return the reference kind of this member, or zero if none.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public int getModifiers() {

    /** Return the modifier flags of this member.
     *  @see java.lang.reflect.Modifier
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getSignature() {

    /** Utility method to produce the signature of this member,
     *  used within the class file format to describe its type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Object getType() {

    /** Utility method to produce either the method type or field type of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getFieldType() {

    /** Return the declared type of this member, which
     *  must be a field or type.
     *  If it is a type member, that type itself is returned.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getReturnType() {

    /** Utility method producing the return type of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?>[] getParameterTypes() {

    /** Utility method producing the parameter types of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getInvocationType() {

    /** Return the actual type under which this method or constructor must be invoked.
     *  For non-static methods or constructors, this is the type with a leading parameter,
     *  a reference to declaring class.  For static methods, it is the same as the declared type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getMethodType() {

    /** Return the declared type of this member, which
     *  must be a method or constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getName() {

    /** Return the simple name of this member.
     *  For a type, it is the same as {@link Class#getSimpleName}.
     *  For a method or field, it is the simple name of the member.
     *  For a constructor, it is always {@code "&lt;init&gt;"}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public ClassLoader getClassLoader() {

    /** Utility method producing the class loader of the declaring class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getDeclaringClass() {

    /** Return the declaring class of this member.
     *  In the case of a bare name and type, the declaring class will be null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
/*non-public*/ final class MemberName implements Member, Cloneable {

/**
 * A {@code MemberName} is a compact symbolic datum which fully characterizes
 * a method or field reference.
 * A member name refers to a field, method, constructor, or member type.
 * Every member name has a simple name (a string) and a type (either a Class or MethodType).
 * A member name may also have a non-null declaring class, or it may be simply
 * a naked name/type pair.
 * A member name may also have non-zero modifier flags.
 * Finally, a member name may be either resolved or unresolved.
 * If it is resolved, the existence of the named
 * <p>
 * Whether resolved or not, a member name provides no access rights or
 * invocation capability to its possessor.  It is merely a compact
 * representation of all symbolic information necessary to link to
 * and properly use the named member.
 * <p>
 * When resolved, a member name's internal implementation may include references to JVM metadata.
 * This representation is stateless and only decriptive.
 * It provides no private information and no capability to use the member.
 * <p>
 * By contrast, a {@linkplain java.lang.reflect.Method} contains fuller information
 * about the internals of a method (except its bytecodes) and also
 * allows invocation.  A MemberName is much lighter than a Method,
 * since it contains about 7 fields to the 16 of Method (plus its sub-arrays),
 * and those seven fields omit much of the information in Method.
 * @author jrose
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getNestedTypes(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all nested types defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                String name, Class<?> type, Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned fields will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getConstructors(Class<?> defc, Class<?> lookupClass) {

        /** Return a list of all constructors defined by the given class.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                String name, MethodType type, Class<?> lookupClass) {

        /** Return a list of matching methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned methods will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, return null.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, a {@linkplain ReflectiveOperationException} is thrown.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        private MemberName resolve(byte refKind, MemberName ref, Class<?> lookupClass) {

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, null is returned.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        List<MemberName> getMembers(Class<?> defc,
                String matchName, Object matchType,
                int matchFlags, Class<?> lookupClass) {

        /// Queries
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static class Factory {

    /** A factory type for resolving member names with the help of the VM.
     *  TBD: Define access-safe public constructors for this factory.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static Factory getFactory() {

    /** Actually making a query requires an access check. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LocalVariableHidesMemberVariable")

    /** Produce a string form of this member name.
     *  For types, it is simply the type's own string (as reported by {@code toString}).
     *  For fields, it is {@code "DeclaringClass.name/type"}.
     *  For methods and constructors, it is {@code "DeclaringClass.name(ptype...)rtype"}.
     *  If the declaring class is null, the prefix {@code "DeclaringClass."} is omitted.
     *  If the member is unresolved, a prefix {@code "*."} is prepended.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isResolved() {

    /** Query whether this member name is resolved.
     *  A resolved member name is one for which the JVM has found
     *  a method, constructor, field, or type binding corresponding exactly to the name.
     *  (Document?)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean hasReceiverTypeDispatch() {

    /** Query whether this member name is resolved to a non-static, non-final method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(byte refKind, Class<?> defClass, String name, Object type) {

    /** Create a method, constructor, or field name from the given components:
     *  Reference kind, declaring class, name, type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, MethodType type, byte refKind) {

    /** Create a method or constructor name from the given components:
     *  Declaring class, name, type, reference kind.
     *  It will be a constructor if and only if the name is {@code "&lt;init&gt;"}.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The last argument is optional, a boolean which requests REF_invokeSpecial.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, Class<?> type, byte refKind) {

    /** Create a field or type name from the given components:
     *  Declaring class, name, type, reference kind.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean equals(MemberName that) {

    /** Decide if two member names have exactly the same symbolic content.
     *  Does not take into account any actual class members, so even if
     *  two member names resolve to the same actual member, they may
     *  be distinct references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName getDefinition() {

    /** Get the definition of this member name.
     *  This may be in a super-class of the declaring class of this member.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    static MemberName makeMethodHandleInvoke(String name, MethodType type) {

    /**
     * Create a name for a signature-polymorphic invoker.
     * This is a placeholder for a signature-polymorphic instance
     * (of MH.invokeExact, etc.) that the JVM does not reify.
     * See comments on {@link MethodHandleNatives#linkMethod}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> type) {

    /** Create a name for the given class.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Field fld) {

    /** Create a name for the given reflected field.  The resulting name will be in a resolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LeakingThisInConstructor")

    /** Create a name for the given reflected constructor.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asNormalOriginal() {

    /** If this MN is a REF_invokeSpecial, return a clone with the "normal" kind
     *  REF_invokeVirtual; also switch either to REF_invokeInterface if clazz.isInterface.
     *  The end result is to get a fully virtualized version of the MN.
     *  (Note that resolving in the JVM will sometimes devirtualize, changing
     *  REF_invokeVirtual of a final to REF_invokeSpecial, and REF_invokeInterface
     *  in some corner cases to either of the previous two; this transform
     *  undoes that change under the assumption that it occurred.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asConstructor() {

    /** If this MN is not REF_newInvokeSpecial, return a clone with that ref. kind.
     *  In that case it must already be REF_invokeSpecial.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Method m) {

    /** Create a name for the given reflected method.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void expandFromVM() {

    /**
     * Calls down to the VM to fill in the fields.  This method is
     * synchronized to avoid racing calls.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void init(Class<?> defClass, String name, Object type, int flags) {

    /** Initialize a query.   It is not resolved. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAccessibleFrom(Class<?> lookupClass) {

    /** Utility method to query whether this member is accessible from a given lookup class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isCallerSensitive() {

    /** Query whether this member has a CallerSensitive annotation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPackage() {

    /** Utility method to query whether this member is neither public, private, nor protected. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isType() {

    /** Query whether this member is a type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isField() {

    /** Query whether this member is a field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isConstructor() {

    /** Query whether this member is a constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethod() {

    /** Query whether this member is a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFieldOrMethod() {

    /** Utility method to query whether this member is a method, constructor, or field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isInvocable() {

    /** Utility method to query whether this member is a method or constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isSynthetic() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVarargs() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isBridge() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isNative() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAbstract() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVolatile() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean canBeStaticallyBound() {

    /** Utility method to query whether this member or its defining class is final. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFinal() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isProtected() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPrivate() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPublic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isStatic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethodHandleInvoke() {

    /** Utility method to query if this member is a method handle invocation (invoke or invokeExact).
     *  Also returns true for the non-public MH.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public byte getReferenceKind() {

    /** Return the reference kind of this member, or zero if none.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public int getModifiers() {

    /** Return the modifier flags of this member.
     *  @see java.lang.reflect.Modifier
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getSignature() {

    /** Utility method to produce the signature of this member,
     *  used within the class file format to describe its type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Object getType() {

    /** Utility method to produce either the method type or field type of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getFieldType() {

    /** Return the declared type of this member, which
     *  must be a field or type.
     *  If it is a type member, that type itself is returned.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getReturnType() {

    /** Utility method producing the return type of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?>[] getParameterTypes() {

    /** Utility method producing the parameter types of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getInvocationType() {

    /** Return the actual type under which this method or constructor must be invoked.
     *  For non-static methods or constructors, this is the type with a leading parameter,
     *  a reference to declaring class.  For static methods, it is the same as the declared type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getMethodType() {

    /** Return the declared type of this member, which
     *  must be a method or constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getName() {

    /** Return the simple name of this member.
     *  For a type, it is the same as {@link Class#getSimpleName}.
     *  For a method or field, it is the simple name of the member.
     *  For a constructor, it is always {@code "&lt;init&gt;"}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public ClassLoader getClassLoader() {

    /** Utility method producing the class loader of the declaring class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getDeclaringClass() {

    /** Return the declaring class of this member.
     *  In the case of a bare name and type, the declaring class will be null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
/*non-public*/ final class MemberName implements Member, Cloneable {

/**
 * A {@code MemberName} is a compact symbolic datum which fully characterizes
 * a method or field reference.
 * A member name refers to a field, method, constructor, or member type.
 * Every member name has a simple name (a string) and a type (either a Class or MethodType).
 * A member name may also have a non-null declaring class, or it may be simply
 * a naked name/type pair.
 * A member name may also have non-zero modifier flags.
 * Finally, a member name may be either resolved or unresolved.
 * If it is resolved, the existence of the named
 * <p>
 * Whether resolved or not, a member name provides no access rights or
 * invocation capability to its possessor.  It is merely a compact
 * representation of all symbolic information necessary to link to
 * and properly use the named member.
 * <p>
 * When resolved, a member name's internal implementation may include references to JVM metadata.
 * This representation is stateless and only decriptive.
 * It provides no private information and no capability to use the member.
 * <p>
 * By contrast, a {@linkplain java.lang.reflect.Method} contains fuller information
 * about the internals of a method (except its bytecodes) and also
 * allows invocation.  A MemberName is much lighter than a Method,
 * since it contains about 7 fields to the 16 of Method (plus its sub-arrays),
 * and those seven fields omit much of the information in Method.
 * @author jrose
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getNestedTypes(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all nested types defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                String name, Class<?> type, Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned fields will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getConstructors(Class<?> defc, Class<?> lookupClass) {

        /** Return a list of all constructors defined by the given class.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                String name, MethodType type, Class<?> lookupClass) {

        /** Return a list of matching methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned methods will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, return null.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, a {@linkplain ReflectiveOperationException} is thrown.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        private MemberName resolve(byte refKind, MemberName ref, Class<?> lookupClass) {

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, null is returned.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        List<MemberName> getMembers(Class<?> defc,
                String matchName, Object matchType,
                int matchFlags, Class<?> lookupClass) {

        /// Queries
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static class Factory {

    /** A factory type for resolving member names with the help of the VM.
     *  TBD: Define access-safe public constructors for this factory.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static Factory getFactory() {

    /** Actually making a query requires an access check. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LocalVariableHidesMemberVariable")

    /** Produce a string form of this member name.
     *  For types, it is simply the type's own string (as reported by {@code toString}).
     *  For fields, it is {@code "DeclaringClass.name/type"}.
     *  For methods and constructors, it is {@code "DeclaringClass.name(ptype...)rtype"}.
     *  If the declaring class is null, the prefix {@code "DeclaringClass."} is omitted.
     *  If the member is unresolved, a prefix {@code "*."} is prepended.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isResolved() {

    /** Query whether this member name is resolved.
     *  A resolved member name is one for which the JVM has found
     *  a method, constructor, field, or type binding corresponding exactly to the name.
     *  (Document?)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean hasReceiverTypeDispatch() {

    /** Query whether this member name is resolved to a non-static, non-final method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(byte refKind, Class<?> defClass, String name, Object type) {

    /** Create a method, constructor, or field name from the given components:
     *  Reference kind, declaring class, name, type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, MethodType type, byte refKind) {

    /** Create a method or constructor name from the given components:
     *  Declaring class, name, type, reference kind.
     *  It will be a constructor if and only if the name is {@code "&lt;init&gt;"}.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The last argument is optional, a boolean which requests REF_invokeSpecial.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, Class<?> type, byte refKind) {

    /** Create a field or type name from the given components:
     *  Declaring class, name, type, reference kind.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean equals(MemberName that) {

    /** Decide if two member names have exactly the same symbolic content.
     *  Does not take into account any actual class members, so even if
     *  two member names resolve to the same actual member, they may
     *  be distinct references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName getDefinition() {

    /** Get the definition of this member name.
     *  This may be in a super-class of the declaring class of this member.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    static MemberName makeMethodHandleInvoke(String name, MethodType type) {

    /**
     * Create a name for a signature-polymorphic invoker.
     * This is a placeholder for a signature-polymorphic instance
     * (of MH.invokeExact, etc.) that the JVM does not reify.
     * See comments on {@link MethodHandleNatives#linkMethod}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> type) {

    /** Create a name for the given class.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Field fld) {

    /** Create a name for the given reflected field.  The resulting name will be in a resolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LeakingThisInConstructor")

    /** Create a name for the given reflected constructor.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asNormalOriginal() {

    /** If this MN is a REF_invokeSpecial, return a clone with the "normal" kind
     *  REF_invokeVirtual; also switch either to REF_invokeInterface if clazz.isInterface.
     *  The end result is to get a fully virtualized version of the MN.
     *  (Note that resolving in the JVM will sometimes devirtualize, changing
     *  REF_invokeVirtual of a final to REF_invokeSpecial, and REF_invokeInterface
     *  in some corner cases to either of the previous two; this transform
     *  undoes that change under the assumption that it occurred.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asConstructor() {

    /** If this MN is not REF_newInvokeSpecial, return a clone with that ref. kind.
     *  In that case it must already be REF_invokeSpecial.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Method m) {

    /** Create a name for the given reflected method.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void expandFromVM() {

    /**
     * Calls down to the VM to fill in the fields.  This method is
     * synchronized to avoid racing calls.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void init(Class<?> defClass, String name, Object type, int flags) {

    /** Initialize a query.   It is not resolved. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAccessibleFrom(Class<?> lookupClass) {

    /** Utility method to query whether this member is accessible from a given lookup class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isCallerSensitive() {

    /** Query whether this member has a CallerSensitive annotation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPackage() {

    /** Utility method to query whether this member is neither public, private, nor protected. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isType() {

    /** Query whether this member is a type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isField() {

    /** Query whether this member is a field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isConstructor() {

    /** Query whether this member is a constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethod() {

    /** Query whether this member is a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFieldOrMethod() {

    /** Utility method to query whether this member is a method, constructor, or field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isInvocable() {

    /** Utility method to query whether this member is a method or constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isSynthetic() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVarargs() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isBridge() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isNative() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAbstract() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVolatile() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean canBeStaticallyBound() {

    /** Utility method to query whether this member or its defining class is final. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFinal() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isProtected() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPrivate() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPublic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isStatic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethodHandleInvoke() {

    /** Utility method to query if this member is a method handle invocation (invoke or invokeExact).
     *  Also returns true for the non-public MH.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public byte getReferenceKind() {

    /** Return the reference kind of this member, or zero if none.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public int getModifiers() {

    /** Return the modifier flags of this member.
     *  @see java.lang.reflect.Modifier
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getSignature() {

    /** Utility method to produce the signature of this member,
     *  used within the class file format to describe its type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Object getType() {

    /** Utility method to produce either the method type or field type of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getFieldType() {

    /** Return the declared type of this member, which
     *  must be a field or type.
     *  If it is a type member, that type itself is returned.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getReturnType() {

    /** Utility method producing the return type of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?>[] getParameterTypes() {

    /** Utility method producing the parameter types of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getInvocationType() {

    /** Return the actual type under which this method or constructor must be invoked.
     *  For non-static methods or constructors, this is the type with a leading parameter,
     *  a reference to declaring class.  For static methods, it is the same as the declared type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getMethodType() {

    /** Return the declared type of this member, which
     *  must be a method or constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getName() {

    /** Return the simple name of this member.
     *  For a type, it is the same as {@link Class#getSimpleName}.
     *  For a method or field, it is the simple name of the member.
     *  For a constructor, it is always {@code "&lt;init&gt;"}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public ClassLoader getClassLoader() {

    /** Utility method producing the class loader of the declaring class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getDeclaringClass() {

    /** Return the declaring class of this member.
     *  In the case of a bare name and type, the declaring class will be null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
/*non-public*/ final class MemberName implements Member, Cloneable {

/**
 * A {@code MemberName} is a compact symbolic datum which fully characterizes
 * a method or field reference.
 * A member name refers to a field, method, constructor, or member type.
 * Every member name has a simple name (a string) and a type (either a Class or MethodType).
 * A member name may also have a non-null declaring class, or it may be simply
 * a naked name/type pair.
 * A member name may also have non-zero modifier flags.
 * Finally, a member name may be either resolved or unresolved.
 * If it is resolved, the existence of the named
 * <p>
 * Whether resolved or not, a member name provides no access rights or
 * invocation capability to its possessor.  It is merely a compact
 * representation of all symbolic information necessary to link to
 * and properly use the named member.
 * <p>
 * When resolved, a member name's internal implementation may include references to JVM metadata.
 * This representation is stateless and only decriptive.
 * It provides no private information and no capability to use the member.
 * <p>
 * By contrast, a {@linkplain java.lang.reflect.Method} contains fuller information
 * about the internals of a method (except its bytecodes) and also
 * allows invocation.  A MemberName is much lighter than a Method,
 * since it contains about 7 fields to the 16 of Method (plus its sub-arrays),
 * and those seven fields omit much of the information in Method.
 * @author jrose
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getNestedTypes(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all nested types defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                String name, Class<?> type, Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned fields will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getConstructors(Class<?> defc, Class<?> lookupClass) {

        /** Return a list of all constructors defined by the given class.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                String name, MethodType type, Class<?> lookupClass) {

        /** Return a list of matching methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned methods will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, return null.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, a {@linkplain ReflectiveOperationException} is thrown.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        private MemberName resolve(byte refKind, MemberName ref, Class<?> lookupClass) {

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, null is returned.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        List<MemberName> getMembers(Class<?> defc,
                String matchName, Object matchType,
                int matchFlags, Class<?> lookupClass) {

        /// Queries
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static class Factory {

    /** A factory type for resolving member names with the help of the VM.
     *  TBD: Define access-safe public constructors for this factory.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static Factory getFactory() {

    /** Actually making a query requires an access check. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LocalVariableHidesMemberVariable")

    /** Produce a string form of this member name.
     *  For types, it is simply the type's own string (as reported by {@code toString}).
     *  For fields, it is {@code "DeclaringClass.name/type"}.
     *  For methods and constructors, it is {@code "DeclaringClass.name(ptype...)rtype"}.
     *  If the declaring class is null, the prefix {@code "DeclaringClass."} is omitted.
     *  If the member is unresolved, a prefix {@code "*."} is prepended.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isResolved() {

    /** Query whether this member name is resolved.
     *  A resolved member name is one for which the JVM has found
     *  a method, constructor, field, or type binding corresponding exactly to the name.
     *  (Document?)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean hasReceiverTypeDispatch() {

    /** Query whether this member name is resolved to a non-static, non-final method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(byte refKind, Class<?> defClass, String name, Object type) {

    /** Create a method, constructor, or field name from the given components:
     *  Reference kind, declaring class, name, type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, MethodType type, byte refKind) {

    /** Create a method or constructor name from the given components:
     *  Declaring class, name, type, reference kind.
     *  It will be a constructor if and only if the name is {@code "&lt;init&gt;"}.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The last argument is optional, a boolean which requests REF_invokeSpecial.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, Class<?> type, byte refKind) {

    /** Create a field or type name from the given components:
     *  Declaring class, name, type, reference kind.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean equals(MemberName that) {

    /** Decide if two member names have exactly the same symbolic content.
     *  Does not take into account any actual class members, so even if
     *  two member names resolve to the same actual member, they may
     *  be distinct references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName getDefinition() {

    /** Get the definition of this member name.
     *  This may be in a super-class of the declaring class of this member.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    static MemberName makeMethodHandleInvoke(String name, MethodType type) {

    /**
     * Create a name for a signature-polymorphic invoker.
     * This is a placeholder for a signature-polymorphic instance
     * (of MH.invokeExact, etc.) that the JVM does not reify.
     * See comments on {@link MethodHandleNatives#linkMethod}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> type) {

    /** Create a name for the given class.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Field fld) {

    /** Create a name for the given reflected field.  The resulting name will be in a resolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LeakingThisInConstructor")

    /** Create a name for the given reflected constructor.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asNormalOriginal() {

    /** If this MN is a REF_invokeSpecial, return a clone with the "normal" kind
     *  REF_invokeVirtual; also switch either to REF_invokeInterface if clazz.isInterface.
     *  The end result is to get a fully virtualized version of the MN.
     *  (Note that resolving in the JVM will sometimes devirtualize, changing
     *  REF_invokeVirtual of a final to REF_invokeSpecial, and REF_invokeInterface
     *  in some corner cases to either of the previous two; this transform
     *  undoes that change under the assumption that it occurred.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asConstructor() {

    /** If this MN is not REF_newInvokeSpecial, return a clone with that ref. kind.
     *  In that case it must already be REF_invokeSpecial.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Method m) {

    /** Create a name for the given reflected method.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void expandFromVM() {

    /**
     * Calls down to the VM to fill in the fields.  This method is
     * synchronized to avoid racing calls.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void init(Class<?> defClass, String name, Object type, int flags) {

    /** Initialize a query.   It is not resolved. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAccessibleFrom(Class<?> lookupClass) {

    /** Utility method to query whether this member is accessible from a given lookup class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isCallerSensitive() {

    /** Query whether this member has a CallerSensitive annotation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPackage() {

    /** Utility method to query whether this member is neither public, private, nor protected. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isType() {

    /** Query whether this member is a type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isField() {

    /** Query whether this member is a field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isConstructor() {

    /** Query whether this member is a constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethod() {

    /** Query whether this member is a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFieldOrMethod() {

    /** Utility method to query whether this member is a method, constructor, or field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isInvocable() {

    /** Utility method to query whether this member is a method or constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isSynthetic() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVarargs() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isBridge() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isNative() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAbstract() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVolatile() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean canBeStaticallyBound() {

    /** Utility method to query whether this member or its defining class is final. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFinal() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isProtected() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPrivate() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPublic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isStatic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethodHandleInvoke() {

    /** Utility method to query if this member is a method handle invocation (invoke or invokeExact).
     *  Also returns true for the non-public MH.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public byte getReferenceKind() {

    /** Return the reference kind of this member, or zero if none.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public int getModifiers() {

    /** Return the modifier flags of this member.
     *  @see java.lang.reflect.Modifier
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getSignature() {

    /** Utility method to produce the signature of this member,
     *  used within the class file format to describe its type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Object getType() {

    /** Utility method to produce either the method type or field type of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getFieldType() {

    /** Return the declared type of this member, which
     *  must be a field or type.
     *  If it is a type member, that type itself is returned.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getReturnType() {

    /** Utility method producing the return type of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?>[] getParameterTypes() {

    /** Utility method producing the parameter types of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getInvocationType() {

    /** Return the actual type under which this method or constructor must be invoked.
     *  For non-static methods or constructors, this is the type with a leading parameter,
     *  a reference to declaring class.  For static methods, it is the same as the declared type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getMethodType() {

    /** Return the declared type of this member, which
     *  must be a method or constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getName() {

    /** Return the simple name of this member.
     *  For a type, it is the same as {@link Class#getSimpleName}.
     *  For a method or field, it is the simple name of the member.
     *  For a constructor, it is always {@code "&lt;init&gt;"}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public ClassLoader getClassLoader() {

    /** Utility method producing the class loader of the declaring class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getDeclaringClass() {

    /** Return the declaring class of this member.
     *  In the case of a bare name and type, the declaring class will be null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
/*non-public*/ final class MemberName implements Member, Cloneable {

/**
 * A {@code MemberName} is a compact symbolic datum which fully characterizes
 * a method or field reference.
 * A member name refers to a field, method, constructor, or member type.
 * Every member name has a simple name (a string) and a type (either a Class or MethodType).
 * A member name may also have a non-null declaring class, or it may be simply
 * a naked name/type pair.
 * A member name may also have non-zero modifier flags.
 * Finally, a member name may be either resolved or unresolved.
 * If it is resolved, the existence of the named
 * <p>
 * Whether resolved or not, a member name provides no access rights or
 * invocation capability to its possessor.  It is merely a compact
 * representation of all symbolic information necessary to link to
 * and properly use the named member.
 * <p>
 * When resolved, a member name's internal implementation may include references to JVM metadata.
 * This representation is stateless and only decriptive.
 * It provides no private information and no capability to use the member.
 * <p>
 * By contrast, a {@linkplain java.lang.reflect.Method} contains fuller information
 * about the internals of a method (except its bytecodes) and also
 * allows invocation.  A MemberName is much lighter than a Method,
 * since it contains about 7 fields to the 16 of Method (plus its sub-arrays),
 * and those seven fields omit much of the information in Method.
 * @author jrose
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getNestedTypes(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all nested types defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                String name, Class<?> type, Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned fields will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getFields(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all fields defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getConstructors(Class<?> defc, Class<?> lookupClass) {

        /** Return a list of all constructors defined by the given class.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                String name, MethodType type, Class<?> lookupClass) {

        /** Return a list of matching methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Returned methods will match the name (if not null) and the type (if not null).
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public List<MemberName> getMethods(Class<?> defc, boolean searchSupers,
                Class<?> lookupClass) {

        /** Return a list of all methods defined by the given class.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  Inaccessible members are not added to the last.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, return null.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        public

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, a {@linkplain ReflectiveOperationException} is thrown.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        private MemberName resolve(byte refKind, MemberName ref, Class<?> lookupClass) {

        /** Produce a resolved version of the given member.
         *  Super types are searched (for inherited members) if {@code searchSupers} is true.
         *  Access checking is performed on behalf of the given {@code lookupClass}.
         *  If lookup fails or access is not permitted, null is returned.
         *  Otherwise a fresh copy of the given member is returned, with modifier bits filled in.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
        List<MemberName> getMembers(Class<?> defc,
                String matchName, Object matchType,
                int matchFlags, Class<?> lookupClass) {

        /// Queries
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static class Factory {

    /** A factory type for resolving member names with the help of the VM.
     *  TBD: Define access-safe public constructors for this factory.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    /*non-public*/ static Factory getFactory() {

    /** Actually making a query requires an access check. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LocalVariableHidesMemberVariable")

    /** Produce a string form of this member name.
     *  For types, it is simply the type's own string (as reported by {@code toString}).
     *  For fields, it is {@code "DeclaringClass.name/type"}.
     *  For methods and constructors, it is {@code "DeclaringClass.name(ptype...)rtype"}.
     *  If the declaring class is null, the prefix {@code "DeclaringClass."} is omitted.
     *  If the member is unresolved, a prefix {@code "*."} is prepended.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isResolved() {

    /** Query whether this member name is resolved.
     *  A resolved member name is one for which the JVM has found
     *  a method, constructor, field, or type binding corresponding exactly to the name.
     *  (Document?)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean hasReceiverTypeDispatch() {

    /** Query whether this member name is resolved to a non-static, non-final method.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(byte refKind, Class<?> defClass, String name, Object type) {

    /** Create a method, constructor, or field name from the given components:
     *  Reference kind, declaring class, name, type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, MethodType type, byte refKind) {

    /** Create a method or constructor name from the given components:
     *  Declaring class, name, type, reference kind.
     *  It will be a constructor if and only if the name is {@code "&lt;init&gt;"}.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The last argument is optional, a boolean which requests REF_invokeSpecial.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> defClass, String name, Class<?> type, byte refKind) {

    /** Create a field or type name from the given components:
     *  Declaring class, name, type, reference kind.
     *  The declaring class may be supplied as null if this is to be a bare name and type.
     *  The resulting name will in an unresolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean equals(MemberName that) {

    /** Decide if two member names have exactly the same symbolic content.
     *  Does not take into account any actual class members, so even if
     *  two member names resolve to the same actual member, they may
     *  be distinct references.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName getDefinition() {

    /** Get the definition of this member name.
     *  This may be in a super-class of the declaring class of this member.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    static MemberName makeMethodHandleInvoke(String name, MethodType type) {

    /**
     * Create a name for a signature-polymorphic invoker.
     * This is a placeholder for a signature-polymorphic instance
     * (of MH.invokeExact, etc.) that the JVM does not reify.
     * See comments on {@link MethodHandleNatives#linkMethod}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Class<?> type) {

    /** Create a name for the given class.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Field fld) {

    /** Create a name for the given reflected field.  The resulting name will be in a resolved state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    @SuppressWarnings("LeakingThisInConstructor")

    /** Create a name for the given reflected constructor.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asNormalOriginal() {

    /** If this MN is a REF_invokeSpecial, return a clone with the "normal" kind
     *  REF_invokeVirtual; also switch either to REF_invokeInterface if clazz.isInterface.
     *  The end result is to get a fully virtualized version of the MN.
     *  (Note that resolving in the JVM will sometimes devirtualize, changing
     *  REF_invokeVirtual of a final to REF_invokeSpecial, and REF_invokeInterface
     *  in some corner cases to either of the previous two; this transform
     *  undoes that change under the assumption that it occurred.)
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName asConstructor() {

    /** If this MN is not REF_newInvokeSpecial, return a clone with that ref. kind.
     *  In that case it must already be REF_invokeSpecial.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MemberName(Method m) {

    /** Create a name for the given reflected method.  The resulting name will be in a resolved state. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void expandFromVM() {

    /**
     * Calls down to the VM to fill in the fields.  This method is
     * synchronized to avoid racing calls.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    private void init(Class<?> defClass, String name, Object type, int flags) {

    /** Initialize a query.   It is not resolved. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAccessibleFrom(Class<?> lookupClass) {

    /** Utility method to query whether this member is accessible from a given lookup class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isCallerSensitive() {

    /** Query whether this member has a CallerSensitive annotation. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPackage() {

    /** Utility method to query whether this member is neither public, private, nor protected. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isType() {

    /** Query whether this member is a type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isField() {

    /** Query whether this member is a field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isConstructor() {

    /** Query whether this member is a constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethod() {

    /** Query whether this member is a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFieldOrMethod() {

    /** Utility method to query whether this member is a method, constructor, or field. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isInvocable() {

    /** Utility method to query whether this member is a method or constructor. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isSynthetic() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVarargs() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isBridge() {

    /** Utility method to query the modifier flags of this member; returns false if the member is not a method. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isNative() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isAbstract() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isVolatile() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean canBeStaticallyBound() {

    /** Utility method to query whether this member or its defining class is final. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isFinal() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isProtected() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPrivate() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isPublic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isStatic() {

    /** Utility method to query the modifier flags of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public boolean isMethodHandleInvoke() {

    /** Utility method to query if this member is a method handle invocation (invoke or invokeExact).
     *  Also returns true for the non-public MH.invokeBasic.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public byte getReferenceKind() {

    /** Return the reference kind of this member, or zero if none.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public int getModifiers() {

    /** Return the modifier flags of this member.
     *  @see java.lang.reflect.Modifier
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getSignature() {

    /** Utility method to produce the signature of this member,
     *  used within the class file format to describe its type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Object getType() {

    /** Utility method to produce either the method type or field type of this member. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getFieldType() {

    /** Return the declared type of this member, which
     *  must be a field or type.
     *  If it is a type member, that type itself is returned.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getReturnType() {

    /** Utility method producing the return type of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?>[] getParameterTypes() {

    /** Utility method producing the parameter types of the method type. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getInvocationType() {

    /** Return the actual type under which this method or constructor must be invoked.
     *  For non-static methods or constructors, this is the type with a leading parameter,
     *  a reference to declaring class.  For static methods, it is the same as the declared type.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public MethodType getMethodType() {

    /** Return the declared type of this member, which
     *  must be a method or constructor.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public String getName() {

    /** Return the simple name of this member.
     *  For a type, it is the same as {@link Class#getSimpleName}.
     *  For a method or field, it is the simple name of the member.
     *  For a constructor, it is always {@code "&lt;init&gt;"}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public ClassLoader getClassLoader() {

    /** Utility method producing the class loader of the declaring class. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
    public Class<?> getDeclaringClass() {

    /** Return the declaring class of this member.
     *  In the case of a bare name and type, the declaring class will be null.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//invoke/MemberName.java
/*non-public*/ final class MemberName implements Member, Cloneable {

/**
 * A {@code MemberName} is a compact symbolic datum which fully characterizes
 * a method or field reference.
 * A member name refers to a field, method, constructor, or member type.
 * Every member name has a simple name (a string) and a type (either a Class or MethodType).
 * A member name may also have a non-null declaring class, or it may be simply
 * a naked name/type pair.
 * A member name may also have non-zero modifier flags.
 * Finally, a member name may be either resolved or unresolved.
 * If it is resolved, the existence of the named
 * <p>
 * Whether resolved or not, a member name provides no access rights or
 * invocation capability to its possessor.  It is merely a compact
 * representation of all symbolic information necessary to link to
 * and properly use the named member.
 * <p>
 * When resolved, a member name's internal implementation may include references to JVM metadata.
 * This representation is stateless and only decriptive.
 * It provides no private information and no capability to use the member.
 * <p>
 * By contrast, a {@linkplain java.lang.reflect.Method} contains fuller information
 * about the internals of a method (except its bytecodes) and also
 * allows invocation.  A MemberName is much lighter than a Method,
 * since it contains about 7 fields to the 16 of Method (plus its sub-arrays),
 * and those seven fields omit much of the information in Method.
 * @author jrose
 */
