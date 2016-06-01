_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    @Override

    /**
     * {@inheritDoc}
     *
     * Returns a non-empty string representation of this object suitable for
     * debugging. The exact presentation format is unspecified and may vary
     * between implementations and versions.
     *
     * @implSpec If a value is present the result must include its string
     * representation in the result. Empty and present instances must be
     * unambiguously differentiable.
     *
     * @return the string representation of this instance
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    @Override

    /**
     * Returns the hash code value of the present value, if any, or 0 (zero) if
     * no value is present.
     *
     * @return hash code value of the present value or 0 if no value is present
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    @Override

    /**
     * Indicates whether some other object is "equal to" this OptionalLong. The
     * other object is considered equal if:
     * <ul>
     * <li>it is also an {@code OptionalLong} and;
     * <li>both instances have no value present or;
     * <li>the present values are "equal to" each other via {@code ==}.
     * </ul>
     *
     * @param obj an object to be tested for equality
     * @return {code true} if the other object is "equal to" this object
     * otherwise {@code false}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    public<X extends Throwable> long orElseThrow(Supplier<X> exceptionSupplier) throws X {

    /**
     * Return the contained value, if present, otherwise throw an exception
     * to be created by the provided supplier.
     *
     * @apiNote A method reference to the exception constructor with an empty
     * argument list can be used as the supplier. For example,
     * {@code IllegalStateException::new}
     *
     * @param <X> Type of the exception to be thrown
     * @param exceptionSupplier The supplier which will return the exception to
     * be thrown
     * @return the present value
     * @throws X if there is no value present
     * @throws NullPointerException if no value is present and
     * {@code exceptionSupplier} is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    public long orElseGet(LongSupplier other) {

    /**
     * Return the value if present, otherwise invoke {@code other} and return
     * the result of that invocation.
     *
     * @param other a {@code LongSupplier} whose result is returned if no value
     * is present
     * @return the value if present otherwise the result of {@code other.getAsLong()}
     * @throws NullPointerException if value is not present and {@code other} is
     * null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    public long orElse(long other) {

    /**
     * Return the value if present, otherwise return {@code other}.
     *
     * @param other the value to be returned if there is no value present
     * @return the value, if present, otherwise {@code other}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    public void ifPresent(LongConsumer consumer) {

    /**
     * Have the specified consumer accept the value if a value is present,
     * otherwise do nothing.
     *
     * @param consumer block to be executed if a value is present
     * @throws NullPointerException if value is present and {@code consumer} is
     * null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    public boolean isPresent() {

    /**
     * Return {@code true} if there is a value present, otherwise {@code false}.
     *
     * @return {@code true} if there is a value present, otherwise {@code false}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    public long getAsLong() {

    /**
     * If a value is present in this {@code OptionalLong}, returns the value,
     * otherwise throws {@code NoSuchElementException}.
     *
     * @return the value held by this {@code OptionalLong}
     * @throws NoSuchElementException if there is no value present
     *
     * @see OptionalLong#isPresent()
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    public static OptionalLong of(long value) {

    /**
     * Return an {@code OptionalLong} with the specified value present.
     *
     * @param value the value to be present
     * @return an {@code OptionalLong} with the value present
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    private OptionalLong(long value) {

    /**
     * Construct an instance with the value present.
     *
     * @param value the long value to be present
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    public static OptionalLong empty() {

    /**
     * Returns an empty {@code OptionalLong} instance.  No value is present for this
     * OptionalLong.
     *
     * @apiNote Though it may be tempting to do so, avoid testing if an object
     * is empty by comparing with {@code ==} against instances returned by
     * {@code Option.empty()}. There is no guarantee that it is a singleton.
     * Instead, use {@link #isPresent()}.
     *
     *  @return an empty {@code OptionalLong}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    private OptionalLong() {

    /**
     * Construct an empty instance.
     *
     * @implNote generally only one empty instance, {@link OptionalLong#EMPTY},
     * should exist per VM.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    private final boolean isPresent;

    /**
     * If true then the value is present, otherwise indicates no value is present
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
    private static final OptionalLong EMPTY = new OptionalLong();

    /**
     * Common instance for {@code empty()}.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//OptionalLong.java
public final class OptionalLong {

/**
 * A container object which may or may not contain a {@code long} value.
 * If a value is present, {@code isPresent()} will return {@code true} and
 * {@code getAsLong()} will return the value.
 *
 * <p>Additional methods that depend on the presence or absence of a contained
 * value are provided, such as {@link #orElse(long) orElse()}
 * (return a default value if value not present) and
 * {@link #ifPresent(java.util.function.LongConsumer) ifPresent()} (execute a block
 * of code if the value is present).
 *
 * <p>This is a <a href="../lang/doc-files/ValueBased.html">value-based</a>
 * class; use of identity-sensitive operations (including reference equality
 * ({@code ==}), identity hash code, or synchronization) on instances of
 * {@code OptionalLong} may have unpredictable results and should be avoided.
 *
 * @since 1.8
 */
