_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    public boolean exit() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    public WaitDispatchSupport(EventDispatchThread dispatchThread,
                               Conditional extCondition,
                               EventFilter filter, long interval)

    /**
     * Creates a {@code WaitDispatchSupport} instance to
     * serve the given event dispatch thread.
     * <p>
     * The {@link EventFilter} is set on the {@code dispatchThread}
     * while waiting. The filter is removed on completion of the
     * waiting process.
     * <p>
     *
     *
     * @param dispatchThread An event dispatch thread that
     *        should not stop dispatching events while waiting
     * @param filter {@code EventFilter} to be set
     * @param interval A time interval to wait for. Note that
     *        when the waiting process takes place on EDT
     *        there is no guarantee to stop it in the given time
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    public WaitDispatchSupport(EventDispatchThread dispatchThread,
                               Conditional extCond)

    /**
     * Creates a {@code WaitDispatchSupport} instance to
     * serve the given event dispatch thread.
     *
     * @param dispatchThread An event dispatch thread that
     *        should not stop dispatching events while waiting
     * @param extCond A conditional object used to determine
     *        if the loop should be terminated
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    public WaitDispatchSupport(EventDispatchThread dispatchThread) {

    /**
     * Creates a {@code WaitDispatchSupport} instance to
     * serve the given event dispatch thread.
     *
     * @param dispatchThread An event dispatch thread that
     *        should not stop dispatching events while waiting
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
class WaitDispatchSupport implements SecondaryLoop {

/**
 * This utility class is used to suspend execution on a thread
 * while still allowing {@code EventDispatchThread} to dispatch events.
 * The API methods of the class are thread-safe.
 *
 * @author Anton Tarasov, Artem Ananiev
 *
 * @since 1.7
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    public boolean exit() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    public WaitDispatchSupport(EventDispatchThread dispatchThread,
                               Conditional extCondition,
                               EventFilter filter, long interval)

    /**
     * Creates a {@code WaitDispatchSupport} instance to
     * serve the given event dispatch thread.
     * <p>
     * The {@link EventFilter} is set on the {@code dispatchThread}
     * while waiting. The filter is removed on completion of the
     * waiting process.
     * <p>
     *
     *
     * @param dispatchThread An event dispatch thread that
     *        should not stop dispatching events while waiting
     * @param filter {@code EventFilter} to be set
     * @param interval A time interval to wait for. Note that
     *        when the waiting process takes place on EDT
     *        there is no guarantee to stop it in the given time
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    public WaitDispatchSupport(EventDispatchThread dispatchThread,
                               Conditional extCond)

    /**
     * Creates a {@code WaitDispatchSupport} instance to
     * serve the given event dispatch thread.
     *
     * @param dispatchThread An event dispatch thread that
     *        should not stop dispatching events while waiting
     * @param extCond A conditional object used to determine
     *        if the loop should be terminated
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
    public WaitDispatchSupport(EventDispatchThread dispatchThread) {

    /**
     * Creates a {@code WaitDispatchSupport} instance to
     * serve the given event dispatch thread.
     *
     * @param dispatchThread An event dispatch thread that
     *        should not stop dispatching events while waiting
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/WaitDispatchSupport.java
class WaitDispatchSupport implements SecondaryLoop {

/**
 * This utility class is used to suspend execution on a thread
 * while still allowing {@code EventDispatchThread} to dispatch events.
 * The API methods of the class are thread-safe.
 *
 * @author Anton Tarasov, Artem Ananiev
 *
 * @since 1.7
 */
