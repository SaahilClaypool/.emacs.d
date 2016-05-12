_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    /* We rely on the fact that ThreadContext objects are immutable.

    /**
     * <p>Set the initial context of the calling thread to a context obtained
     * from another thread.  After this call, the calling thread will see
     * the same results from the <code>get</code> method as the thread
     * from which the <code>context</code> argument was obtained, at the
     * time it was obtained.</p>
     *
     * <p>The <code>context</code> argument must be the result of an earlier
     * <code>push</code> or <code>getThreadContext</code> call.  It is an
     * error (which may or may not be detected) if this context has been
     * undone by a <code>restore</code>.</p>
     *
     * <p>The context stack of the calling thread must be empty before this
     * call, i.e., there must not have been a <code>push</code> not undone
     * by a subsequent <code>restore</code>.</p>
     *
     * @exception IllegalArgumentException if the context stack was
     * not empty before the call.  An implementation may also throw this
     * exception if <code>context</code> is no longer current in the
     * thread from which it was obtained.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static void restore(ThreadContext oldContext)

    /**
     * <p>Restore the context stack to an earlier state.  This typically
     * undoes the effect of one or more <code>push</code> calls.</p>
     *
     * @param oldContext the state to return.  This is usually the return
     * value of an earlier <code>push</code> operation.
     *
     * @exception NullPointerException if <code>oldContext</code> is null.
     * @exception IllegalArgumentException if <code>oldContext</code>
     * does not represent a context from this thread, or if that
     * context was undone by an earlier <code>restore</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static ThreadContext getThreadContext() {

    /**
     * <p>Return an object that can later be supplied to <code>restore</code>
     * to restore the context stack to its current state.  The object can
     * also be given to <code>setInitialContext</code>.</p>
     *
     * @return a ThreadContext that represents the current context stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static ThreadContext push(String key, Object value)

    /**
     * <p>Push an object on the context stack with the given key.
     * This operation can subsequently be undone by calling
     * <code>restore</code> with the ThreadContext value returned
     * here.</p>
     *
     * @param key the key that will be used to find the object while it is
     * on the stack.
     * @param value the value to be associated with that key.  It may be null.
     *
     * @return a ThreadContext that can be given to <code>restore</code> to
     * restore the stack to its state before the <code>push</code>.
     *
     * @exception IllegalArgumentException if <code>key</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
//  public static Object set(String key, Object value)

//  /**
//   * Change the value that was most recently associated with the given key
//   * in a <code>push</code> operation not cancelled by a subsequent
//   * <code>restore</code>.  If there is no such association, nothing happens
//   * and the return value is null.
//   *
//   * @param key the key of interest.
//   * @param value the new value to associate with that key.
//   *
//   * @return the value that was previously associated with the key, or null
//   * if the key does not exist in the stack.
//   *
//   * @exception IllegalArgumentException if <code>key</code> is null.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    private static ThreadContext contextContaining(String key)

    /**
     * <p>Find the ThreadContext in the stack that contains the given key,
     * or return null if there is none.</p>
     *
     * @exception IllegalArgumentException if <code>key</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static boolean contains(String key)

    /**
     * <p>Check whether a value with the given key exists in the stack.
     * This means that the <code>push</code> method was called with
     * this key and it was not cancelled by a subsequent
     * <code>restore</code>.  This method is useful when the
     * <code>get</code> method returns null, to distinguish between
     * the case where the key exists in the stack but is associated
     * with a null value, and the case where the key does not exist in
     * the stack.</p>
     *
     * @return true if the key exists in the stack.
     *
     * @exception IllegalArgumentException if <code>key</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static Object get(String key) throws IllegalArgumentException {

    /**
     * <p>Get the Object that was most recently pushed with the given key.</p>
     *
     * @param key the key of interest.
     *
     * @return the last Object that was pushed (using
     * <code>push</code>) with that key and not subsequently canceled
     * by a <code>restore</code>; or null if there is no such object.
     * A null return value may also indicate that the last Object
     * pushed was the value <code>null</code>.  Use the
     * <code>contains</code> method to distinguish this case from the
     * case where there is no Object.
     *
     * @exception IllegalArgumentException if <code>key</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
public class ThreadContext implements Cloneable {

/**
 * <p><b>Warning: The interface of this class is subject to change.
 * Use at your own risk.</b></p>
 *
 * <p>This class associates a context with each thread that
 * references it.  The context is a set of mappings between Strings
 * and Objects.  It is managed as a stack, typically with code like
 * this:</p>
 *
 * <pre>
 * ThreadContext oldContext = ThreadContext.push(myKey, myObject);
 * // plus possibly further calls to ThreadContext.push...
 * try {
 *      doSomeOperation();
 * } finally {
 *      ThreadContext.restore(oldContext);
 * }
 * </pre>
 *
 * <p>The <code>try</code>...<code>finally</code> block ensures that
 * the <code>restore</code> is done even if
 * <code>doSomeOperation</code> terminates abnormally (with an
 * exception).</p>
 *
 * <p>A thread can consult its own context using
 * <code>ThreadContext.get(myKey)</code>.  The result is the
 * value that was most recently pushed with the given key.</p>
 *
 * <p>A thread cannot read or modify the context of another thread.</p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    /* We rely on the fact that ThreadContext objects are immutable.

    /**
     * <p>Set the initial context of the calling thread to a context obtained
     * from another thread.  After this call, the calling thread will see
     * the same results from the <code>get</code> method as the thread
     * from which the <code>context</code> argument was obtained, at the
     * time it was obtained.</p>
     *
     * <p>The <code>context</code> argument must be the result of an earlier
     * <code>push</code> or <code>getThreadContext</code> call.  It is an
     * error (which may or may not be detected) if this context has been
     * undone by a <code>restore</code>.</p>
     *
     * <p>The context stack of the calling thread must be empty before this
     * call, i.e., there must not have been a <code>push</code> not undone
     * by a subsequent <code>restore</code>.</p>
     *
     * @exception IllegalArgumentException if the context stack was
     * not empty before the call.  An implementation may also throw this
     * exception if <code>context</code> is no longer current in the
     * thread from which it was obtained.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static void restore(ThreadContext oldContext)

    /**
     * <p>Restore the context stack to an earlier state.  This typically
     * undoes the effect of one or more <code>push</code> calls.</p>
     *
     * @param oldContext the state to return.  This is usually the return
     * value of an earlier <code>push</code> operation.
     *
     * @exception NullPointerException if <code>oldContext</code> is null.
     * @exception IllegalArgumentException if <code>oldContext</code>
     * does not represent a context from this thread, or if that
     * context was undone by an earlier <code>restore</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static ThreadContext getThreadContext() {

    /**
     * <p>Return an object that can later be supplied to <code>restore</code>
     * to restore the context stack to its current state.  The object can
     * also be given to <code>setInitialContext</code>.</p>
     *
     * @return a ThreadContext that represents the current context stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static ThreadContext push(String key, Object value)

    /**
     * <p>Push an object on the context stack with the given key.
     * This operation can subsequently be undone by calling
     * <code>restore</code> with the ThreadContext value returned
     * here.</p>
     *
     * @param key the key that will be used to find the object while it is
     * on the stack.
     * @param value the value to be associated with that key.  It may be null.
     *
     * @return a ThreadContext that can be given to <code>restore</code> to
     * restore the stack to its state before the <code>push</code>.
     *
     * @exception IllegalArgumentException if <code>key</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
//  public static Object set(String key, Object value)

//  /**
//   * Change the value that was most recently associated with the given key
//   * in a <code>push</code> operation not cancelled by a subsequent
//   * <code>restore</code>.  If there is no such association, nothing happens
//   * and the return value is null.
//   *
//   * @param key the key of interest.
//   * @param value the new value to associate with that key.
//   *
//   * @return the value that was previously associated with the key, or null
//   * if the key does not exist in the stack.
//   *
//   * @exception IllegalArgumentException if <code>key</code> is null.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    private static ThreadContext contextContaining(String key)

    /**
     * <p>Find the ThreadContext in the stack that contains the given key,
     * or return null if there is none.</p>
     *
     * @exception IllegalArgumentException if <code>key</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static boolean contains(String key)

    /**
     * <p>Check whether a value with the given key exists in the stack.
     * This means that the <code>push</code> method was called with
     * this key and it was not cancelled by a subsequent
     * <code>restore</code>.  This method is useful when the
     * <code>get</code> method returns null, to distinguish between
     * the case where the key exists in the stack but is associated
     * with a null value, and the case where the key does not exist in
     * the stack.</p>
     *
     * @return true if the key exists in the stack.
     *
     * @exception IllegalArgumentException if <code>key</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
    public static Object get(String key) throws IllegalArgumentException {

    /**
     * <p>Get the Object that was most recently pushed with the given key.</p>
     *
     * @param key the key of interest.
     *
     * @return the last Object that was pushed (using
     * <code>push</code>) with that key and not subsequently canceled
     * by a <code>restore</code>; or null if there is no such object.
     * A null return value may also indicate that the last Object
     * pushed was the value <code>null</code>.  Use the
     * <code>contains</code> method to distinguish this case from the
     * case where there is no Object.
     *
     * @exception IllegalArgumentException if <code>key</code> is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/ThreadContext.java
public class ThreadContext implements Cloneable {

/**
 * <p><b>Warning: The interface of this class is subject to change.
 * Use at your own risk.</b></p>
 *
 * <p>This class associates a context with each thread that
 * references it.  The context is a set of mappings between Strings
 * and Objects.  It is managed as a stack, typically with code like
 * this:</p>
 *
 * <pre>
 * ThreadContext oldContext = ThreadContext.push(myKey, myObject);
 * // plus possibly further calls to ThreadContext.push...
 * try {
 *      doSomeOperation();
 * } finally {
 *      ThreadContext.restore(oldContext);
 * }
 * </pre>
 *
 * <p>The <code>try</code>...<code>finally</code> block ensures that
 * the <code>restore</code> is done even if
 * <code>doSomeOperation</code> terminates abnormally (with an
 * exception).</p>
 *
 * <p>A thread can consult its own context using
 * <code>ThreadContext.get(myKey)</code>.  The result is the
 * value that was most recently pushed with the given key.</p>
 *
 * <p>A thread cannot read or modify the context of another thread.</p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
