_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/InheritableThreadLocal.java
    void createMap(Thread t, T firstValue) {

    /**
     * Create the map associated with a ThreadLocal.
     *
     * @param t the current thread
     * @param firstValue value for the initial entry of the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/InheritableThreadLocal.java
    ThreadLocalMap getMap(Thread t) {

    /**
     * Get the map associated with a ThreadLocal.
     *
     * @param t the current thread
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/InheritableThreadLocal.java
public class InheritableThreadLocal<T> extends ThreadLocal<T> {

/**
 * This class extends <tt>ThreadLocal</tt> to provide inheritance of values
 * from parent thread to child thread: when a child thread is created, the
 * child receives initial values for all inheritable thread-local variables
 * for which the parent has values.  Normally the child's values will be
 * identical to the parent's; however, the child's value can be made an
 * arbitrary function of the parent's by overriding the <tt>childValue</tt>
 * method in this class.
 *
 * <p>Inheritable thread-local variables are used in preference to
 * ordinary thread-local variables when the per-thread-attribute being
 * maintained in the variable (e.g., User ID, Transaction ID) must be
 * automatically transmitted to any child threads that are created.
 *
 * @author  Josh Bloch and Doug Lea
 * @see     ThreadLocal
 * @since   1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/InheritableThreadLocal.java
    void createMap(Thread t, T firstValue) {

    /**
     * Create the map associated with a ThreadLocal.
     *
     * @param t the current thread
     * @param firstValue value for the initial entry of the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/InheritableThreadLocal.java
    ThreadLocalMap getMap(Thread t) {

    /**
     * Get the map associated with a ThreadLocal.
     *
     * @param t the current thread
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/InheritableThreadLocal.java
public class InheritableThreadLocal<T> extends ThreadLocal<T> {

/**
 * This class extends <tt>ThreadLocal</tt> to provide inheritance of values
 * from parent thread to child thread: when a child thread is created, the
 * child receives initial values for all inheritable thread-local variables
 * for which the parent has values.  Normally the child's values will be
 * identical to the parent's; however, the child's value can be made an
 * arbitrary function of the parent's by overriding the <tt>childValue</tt>
 * method in this class.
 *
 * <p>Inheritable thread-local variables are used in preference to
 * ordinary thread-local variables when the per-thread-attribute being
 * maintained in the variable (e.g., User ID, Transaction ID) must be
 * automatically transmitted to any child threads that are created.
 *
 * @author  Josh Bloch and Doug Lea
 * @see     ThreadLocal
 * @since   1.2
 */
