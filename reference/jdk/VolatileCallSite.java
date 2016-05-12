_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
    @Override public void setTarget(MethodHandle newTarget) {

    /**
     * Updates the target method of this call site, as a volatile variable.
     * The type of the new target must agree with the type of the old target.
     * <p>
     * The interactions with memory are the same as of a write to a volatile field.
     * In particular, any threads is guaranteed to see the updated target
     * the next time it calls {@code getTarget}.
     * @param newTarget the new target
     * @throws NullPointerException if the proposed new target is null
     * @throws WrongMethodTypeException if the proposed new target
     *         has a method type that differs from the previous target
     * @see #getTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
    @Override public final MethodHandle getTarget() {

    /**
     * Returns the target method of the call site, which behaves
     * like a {@code volatile} field of the {@code VolatileCallSite}.
     * <p>
     * The interactions of {@code getTarget} with memory are the same
     * as of a read from a {@code volatile} field.
     * <p>
     * In particular, the current thread is required to issue a fresh
     * read of the target from memory, and must not fail to see
     * a recent update to the target by another thread.
     *
     * @return the linkage state of this call site, a method handle which can change over time
     * @see #setTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
    public VolatileCallSite(MethodHandle target) {

    /**
     * Creates a call site with a volatile binding to its target.
     * The target is set to the given value.
     * @param target the method handle that will be the initial target of the call site
     * @throws NullPointerException if the proposed target is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
public class VolatileCallSite extends CallSite {

/**
 * A {@code VolatileCallSite} is a {@link CallSite} whose target acts like a volatile variable.
 * An {@code invokedynamic} instruction linked to a {@code VolatileCallSite} sees updates
 * to its call site target immediately, even if the update occurs in another thread.
 * There may be a performance penalty for such tight coupling between threads.
 * <p>
 * Unlike {@code MutableCallSite}, there is no
 * {@linkplain MutableCallSite#syncAll syncAll operation} on volatile
 * call sites, since every write to a volatile variable is implicitly
 * synchronized with reader threads.
 * <p>
 * In other respects, a {@code VolatileCallSite} is interchangeable
 * with {@code MutableCallSite}.
 * @see MutableCallSite
 * @author John Rose, JSR 292 EG
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
    @Override public void setTarget(MethodHandle newTarget) {

    /**
     * Updates the target method of this call site, as a volatile variable.
     * The type of the new target must agree with the type of the old target.
     * <p>
     * The interactions with memory are the same as of a write to a volatile field.
     * In particular, any threads is guaranteed to see the updated target
     * the next time it calls {@code getTarget}.
     * @param newTarget the new target
     * @throws NullPointerException if the proposed new target is null
     * @throws WrongMethodTypeException if the proposed new target
     *         has a method type that differs from the previous target
     * @see #getTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
    @Override public final MethodHandle getTarget() {

    /**
     * Returns the target method of the call site, which behaves
     * like a {@code volatile} field of the {@code VolatileCallSite}.
     * <p>
     * The interactions of {@code getTarget} with memory are the same
     * as of a read from a {@code volatile} field.
     * <p>
     * In particular, the current thread is required to issue a fresh
     * read of the target from memory, and must not fail to see
     * a recent update to the target by another thread.
     *
     * @return the linkage state of this call site, a method handle which can change over time
     * @see #setTarget
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
    public VolatileCallSite(MethodHandle target) {

    /**
     * Creates a call site with a volatile binding to its target.
     * The target is set to the given value.
     * @param target the method handle that will be the initial target of the call site
     * @throws NullPointerException if the proposed target is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/invoke/VolatileCallSite.java
public class VolatileCallSite extends CallSite {

/**
 * A {@code VolatileCallSite} is a {@link CallSite} whose target acts like a volatile variable.
 * An {@code invokedynamic} instruction linked to a {@code VolatileCallSite} sees updates
 * to its call site target immediately, even if the update occurs in another thread.
 * There may be a performance penalty for such tight coupling between threads.
 * <p>
 * Unlike {@code MutableCallSite}, there is no
 * {@linkplain MutableCallSite#syncAll syncAll operation} on volatile
 * call sites, since every write to a volatile variable is implicitly
 * synchronized with reader threads.
 * <p>
 * In other respects, a {@code VolatileCallSite} is interchangeable
 * with {@code MutableCallSite}.
 * @see MutableCallSite
 * @author John Rose, JSR 292 EG
 */
