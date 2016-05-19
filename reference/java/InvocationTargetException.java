_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this exception (the thrown target exception,
     * which may be {@code null}).
     *
     * @return  the cause of this exception.
     * @since   1.4
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getTargetException() {

    /**
     * Get the thrown target exception.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the thrown target exception (cause of this exception).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target, String s) {

    /**
     * Constructs a InvocationTargetException with a target exception
     * and a detail message.
     *
     * @param target the target exception
     * @param s      the detail message
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target) {

    /**
     * Constructs a InvocationTargetException with a target exception.
     *
     * @param target the target exception
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    protected InvocationTargetException() {

    /**
     * Constructs an {@code InvocationTargetException} with
     * {@code null} as the target exception.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private Throwable target;

     /**
     * This field holds the target if the
     * InvocationTargetException(Throwable target) constructor was
     * used to instantiate the object
     *
     * @serial
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private static final long serialVersionUID = 4085088731926701167L;

    /**
     * Use serialVersionUID from JDK 1.1.X for interoperability
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
public class InvocationTargetException extends ReflectiveOperationException {

/**
 * InvocationTargetException is a checked exception that wraps
 * an exception thrown by an invoked method or constructor.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "target exception"
 * that is provided at construction time and accessed via the
 * {@link #getTargetException()} method is now known as the <i>cause</i>,
 * and may be accessed via the {@link Throwable#getCause()} method,
 * as well as the aforementioned "legacy method."
 *
 * @see Method
 * @see Constructor
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this exception (the thrown target exception,
     * which may be {@code null}).
     *
     * @return  the cause of this exception.
     * @since   1.4
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getTargetException() {

    /**
     * Get the thrown target exception.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the thrown target exception (cause of this exception).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target, String s) {

    /**
     * Constructs a InvocationTargetException with a target exception
     * and a detail message.
     *
     * @param target the target exception
     * @param s      the detail message
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target) {

    /**
     * Constructs a InvocationTargetException with a target exception.
     *
     * @param target the target exception
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    protected InvocationTargetException() {

    /**
     * Constructs an {@code InvocationTargetException} with
     * {@code null} as the target exception.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private Throwable target;

     /**
     * This field holds the target if the
     * InvocationTargetException(Throwable target) constructor was
     * used to instantiate the object
     *
     * @serial
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private static final long serialVersionUID = 4085088731926701167L;

    /**
     * Use serialVersionUID from JDK 1.1.X for interoperability
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
public class InvocationTargetException extends ReflectiveOperationException {

/**
 * InvocationTargetException is a checked exception that wraps
 * an exception thrown by an invoked method or constructor.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "target exception"
 * that is provided at construction time and accessed via the
 * {@link #getTargetException()} method is now known as the <i>cause</i>,
 * and may be accessed via the {@link Throwable#getCause()} method,
 * as well as the aforementioned "legacy method."
 *
 * @see Method
 * @see Constructor
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this exception (the thrown target exception,
     * which may be {@code null}).
     *
     * @return  the cause of this exception.
     * @since   1.4
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getTargetException() {

    /**
     * Get the thrown target exception.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the thrown target exception (cause of this exception).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target, String s) {

    /**
     * Constructs a InvocationTargetException with a target exception
     * and a detail message.
     *
     * @param target the target exception
     * @param s      the detail message
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target) {

    /**
     * Constructs a InvocationTargetException with a target exception.
     *
     * @param target the target exception
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    protected InvocationTargetException() {

    /**
     * Constructs an {@code InvocationTargetException} with
     * {@code null} as the target exception.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private Throwable target;

     /**
     * This field holds the target if the
     * InvocationTargetException(Throwable target) constructor was
     * used to instantiate the object
     *
     * @serial
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private static final long serialVersionUID = 4085088731926701167L;

    /**
     * Use serialVersionUID from JDK 1.1.X for interoperability
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
public class InvocationTargetException extends ReflectiveOperationException {

/**
 * InvocationTargetException is a checked exception that wraps
 * an exception thrown by an invoked method or constructor.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "target exception"
 * that is provided at construction time and accessed via the
 * {@link #getTargetException()} method is now known as the <i>cause</i>,
 * and may be accessed via the {@link Throwable#getCause()} method,
 * as well as the aforementioned "legacy method."
 *
 * @see Method
 * @see Constructor
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this exception (the thrown target exception,
     * which may be {@code null}).
     *
     * @return  the cause of this exception.
     * @since   1.4
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getTargetException() {

    /**
     * Get the thrown target exception.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the thrown target exception (cause of this exception).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target, String s) {

    /**
     * Constructs a InvocationTargetException with a target exception
     * and a detail message.
     *
     * @param target the target exception
     * @param s      the detail message
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target) {

    /**
     * Constructs a InvocationTargetException with a target exception.
     *
     * @param target the target exception
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    protected InvocationTargetException() {

    /**
     * Constructs an {@code InvocationTargetException} with
     * {@code null} as the target exception.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private Throwable target;

     /**
     * This field holds the target if the
     * InvocationTargetException(Throwable target) constructor was
     * used to instantiate the object
     *
     * @serial
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private static final long serialVersionUID = 4085088731926701167L;

    /**
     * Use serialVersionUID from JDK 1.1.X for interoperability
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
public class InvocationTargetException extends ReflectiveOperationException {

/**
 * InvocationTargetException is a checked exception that wraps
 * an exception thrown by an invoked method or constructor.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "target exception"
 * that is provided at construction time and accessed via the
 * {@link #getTargetException()} method is now known as the <i>cause</i>,
 * and may be accessed via the {@link Throwable#getCause()} method,
 * as well as the aforementioned "legacy method."
 *
 * @see Method
 * @see Constructor
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getCause() {

    /**
     * Returns the cause of this exception (the thrown target exception,
     * which may be {@code null}).
     *
     * @return  the cause of this exception.
     * @since   1.4
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public Throwable getTargetException() {

    /**
     * Get the thrown target exception.
     *
     * <p>This method predates the general-purpose exception chaining facility.
     * The {@link Throwable#getCause()} method is now the preferred means of
     * obtaining this information.
     *
     * @return the thrown target exception (cause of this exception).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target, String s) {

    /**
     * Constructs a InvocationTargetException with a target exception
     * and a detail message.
     *
     * @param target the target exception
     * @param s      the detail message
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    public InvocationTargetException(Throwable target) {

    /**
     * Constructs a InvocationTargetException with a target exception.
     *
     * @param target the target exception
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    protected InvocationTargetException() {

    /**
     * Constructs an {@code InvocationTargetException} with
     * {@code null} as the target exception.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private Throwable target;

     /**
     * This field holds the target if the
     * InvocationTargetException(Throwable target) constructor was
     * used to instantiate the object
     *
     * @serial
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
    private static final long serialVersionUID = 4085088731926701167L;

    /**
     * Use serialVersionUID from JDK 1.1.X for interoperability
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//reflect/InvocationTargetException.java
public class InvocationTargetException extends ReflectiveOperationException {

/**
 * InvocationTargetException is a checked exception that wraps
 * an exception thrown by an invoked method or constructor.
 *
 * <p>As of release 1.4, this exception has been retrofitted to conform to
 * the general purpose exception-chaining mechanism.  The "target exception"
 * that is provided at construction time and accessed via the
 * {@link #getTargetException()} method is now known as the <i>cause</i>,
 * and may be accessed via the {@link Throwable#getCause()} method,
 * as well as the aforementioned "legacy method."
 *
 * @see Method
 * @see Constructor
 */
