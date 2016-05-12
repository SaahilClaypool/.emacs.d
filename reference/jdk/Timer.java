_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    void heapify() {

    /**
     * Establishes the heap invariant (described above) in the entire tree,
     * assuming nothing about the order of the elements prior to the call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    private void fixDown(int k) {

    /**
     * Establishes the heap invariant (described above) in the subtree
     * rooted at k, which is assumed to satisfy the heap invariant except
     * possibly for node k itself (which may have a nextExecutionTime greater
     * than its children's).
     *
     * This method functions by "demoting" queue[k] down the hierarchy
     * (by swapping it with its smaller child) repeatedly until queue[k]'s
     * nextExecutionTime is less than or equal to those of its children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    private void fixUp(int k) {

    /**
     * Establishes the heap invariant (described above) assuming the heap
     * satisfies the invariant except possibly for the leaf-node indexed by k
     * (which may have a nextExecutionTime less than its parent's).
     *
     * This method functions by "promoting" queue[k] up the hierarchy
     * (by swapping it with its parent) repeatedly until queue[k]'s
     * nextExecutionTime is greater than or equal to that of its parent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    void clear() {

    /**
     * Removes all elements from the priority queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    boolean isEmpty() {

    /**
     * Returns true if the priority queue contains no elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    void rescheduleMin(long newTime) {

    /**
     * Sets the nextExecutionTime associated with the head task to the
     * specified value, and adjusts priority queue accordingly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    void quickRemove(int i) {

    /**
     * Removes the ith element from queue without regard for maintaining
     * the heap invariant.  Recall that queue is one-based, so
     * 1 <= i <= size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    void removeMin() {

    /**
     * Remove the head task from the priority queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    TimerTask get(int i) {

    /**
     * Return the ith task in the priority queue, where i ranges from 1 (the
     * head task, which is returned by getMin) to the number of tasks on the
     * queue, inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    TimerTask getMin() {

    /**
     * Return the "head task" of the priority queue.  (The head task is an
     * task with the lowest nextExecutionTime.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    void add(TimerTask task) {

    /**
     * Adds a new task to the priority queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    int size() {

    /**
     * Returns the number of tasks currently on the queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    private int size = 0;

    /**
     * The number of tasks in the priority queue.  (The tasks are stored in
     * queue[1] up to queue[size]).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
class TaskQueue {

/**
 * This class represents a timer task queue: a priority queue of TimerTasks,
 * ordered on nextExecutionTime.  Each Timer object has one of these, which it
 * shares with its TimerThread.  Internally this class uses a heap, which
 * offers log(n) performance for the add, removeMin and rescheduleMin
 * operations, and constant time performance for the getMin operation.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    private void mainLoop() {

    /**
     * The main timer loop.  (See class comment.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    private TaskQueue queue;

    /**
     * Our Timer's queue.  We store this reference in preference to
     * a reference to the Timer so the reference graph remains acyclic.
     * Otherwise, the Timer would never be garbage-collected and this
     * thread would never go away.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
class TimerThread extends Thread {

/**
 * This "helper class" implements the timer's task execution thread, which
 * waits for tasks on the timer queue, executions them when they fire,
 * reschedules repeating tasks, and removes cancelled tasks and spent
 * non-repeating tasks from the queue.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
     public int purge() {

    /**
     * Removes all cancelled tasks from this timer's task queue.  <i>Calling
     * this method has no effect on the behavior of the timer</i>, but
     * eliminates the references to the cancelled tasks from the queue.
     * If there are no external references to these tasks, they become
     * eligible for garbage collection.
     *
     * <p>Most programs will have no need to call this method.
     * It is designed for use by the rare application that cancels a large
     * number of tasks.  Calling this method trades time for space: the
     * runtime of the method may be proportional to n + c log n, where n
     * is the number of tasks in the queue and c is the number of cancelled
     * tasks.
     *
     * <p>Note that it is permissible to call this method from within a
     * a task scheduled on this timer.
     *
     * @return the number of tasks removed from the queue.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public void cancel() {

    /**
     * Terminates this timer, discarding any currently scheduled tasks.
     * Does not interfere with a currently executing task (if it exists).
     * Once a timer has been terminated, its execution thread terminates
     * gracefully, and no more tasks may be scheduled on it.
     *
     * <p>Note that calling this method from within the run method of a
     * timer task that was invoked by this timer absolutely guarantees that
     * the ongoing task execution is the last task execution that will ever
     * be performed by this timer.
     *
     * <p>This method may be called repeatedly; the second and subsequent
     * calls have no effect.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    private void sched(TimerTask task, long time, long period) {

    /**
     * Schedule the specified timer task for execution at the specified
     * time with the specified period, in milliseconds.  If period is
     * positive, the task is scheduled for repeated execution; if period is
     * zero, the task is scheduled for one-time execution. Time is specified
     * in Date.getTime() format.  This method checks timer state, task state,
     * and initial execution time, but not period.
     *
     * @throws IllegalArgumentException if <tt>time</tt> is negative.
     * @throws IllegalStateException if task was already scheduled or
     *         cancelled, timer was cancelled, or timer thread terminated.
     * @throws NullPointerException if {@code task} is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public void scheduleAtFixedRate(TimerTask task, Date firstTime,
                                    long period) {

    /**
     * Schedules the specified task for repeated <i>fixed-rate execution</i>,
     * beginning at the specified time. Subsequent executions take place at
     * approximately regular intervals, separated by the specified period.
     *
     * <p>In fixed-rate execution, each execution is scheduled relative to the
     * scheduled execution time of the initial execution.  If an execution is
     * delayed for any reason (such as garbage collection or other background
     * activity), two or more executions will occur in rapid succession to
     * "catch up."  In the long run, the frequency of execution will be
     * exactly the reciprocal of the specified period (assuming the system
     * clock underlying <tt>Object.wait(long)</tt> is accurate).  As a
     * consequence of the above, if the scheduled first time is in the past,
     * then any "missed" executions will be scheduled for immediate "catch up"
     * execution.
     *
     * <p>Fixed-rate execution is appropriate for recurring activities that
     * are sensitive to <i>absolute</i> time, such as ringing a chime every
     * hour on the hour, or running scheduled maintenance every day at a
     * particular time.  It is also appropriate for recurring activities
     * where the total time to perform a fixed number of executions is
     * important, such as a countdown timer that ticks once every second for
     * ten seconds.  Finally, fixed-rate execution is appropriate for
     * scheduling multiple repeating timer tasks that must remain synchronized
     * with respect to one another.
     *
     * @param task   task to be scheduled.
     * @param firstTime First time at which task is to be executed.
     * @param period time in milliseconds between successive task executions.
     * @throws IllegalArgumentException if {@code firstTime.getTime() < 0} or
     *         {@code period <= 0}
     * @throws IllegalStateException if task was already scheduled or
     *         cancelled, timer was cancelled, or timer thread terminated.
     * @throws NullPointerException if {@code task} or {@code firstTime} is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public void scheduleAtFixedRate(TimerTask task, long delay, long period) {

    /**
     * Schedules the specified task for repeated <i>fixed-rate execution</i>,
     * beginning after the specified delay.  Subsequent executions take place
     * at approximately regular intervals, separated by the specified period.
     *
     * <p>In fixed-rate execution, each execution is scheduled relative to the
     * scheduled execution time of the initial execution.  If an execution is
     * delayed for any reason (such as garbage collection or other background
     * activity), two or more executions will occur in rapid succession to
     * "catch up."  In the long run, the frequency of execution will be
     * exactly the reciprocal of the specified period (assuming the system
     * clock underlying <tt>Object.wait(long)</tt> is accurate).
     *
     * <p>Fixed-rate execution is appropriate for recurring activities that
     * are sensitive to <i>absolute</i> time, such as ringing a chime every
     * hour on the hour, or running scheduled maintenance every day at a
     * particular time.  It is also appropriate for recurring activities
     * where the total time to perform a fixed number of executions is
     * important, such as a countdown timer that ticks once every second for
     * ten seconds.  Finally, fixed-rate execution is appropriate for
     * scheduling multiple repeating timer tasks that must remain synchronized
     * with respect to one another.
     *
     * @param task   task to be scheduled.
     * @param delay  delay in milliseconds before task is to be executed.
     * @param period time in milliseconds between successive task executions.
     * @throws IllegalArgumentException if {@code delay < 0}, or
     *         {@code delay + System.currentTimeMillis() < 0}, or
     *         {@code period <= 0}
     * @throws IllegalStateException if task was already scheduled or
     *         cancelled, timer was cancelled, or timer thread terminated.
     * @throws NullPointerException if {@code task} is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public void schedule(TimerTask task, Date firstTime, long period) {

    /**
     * Schedules the specified task for repeated <i>fixed-delay execution</i>,
     * beginning at the specified time. Subsequent executions take place at
     * approximately regular intervals, separated by the specified period.
     *
     * <p>In fixed-delay execution, each execution is scheduled relative to
     * the actual execution time of the previous execution.  If an execution
     * is delayed for any reason (such as garbage collection or other
     * background activity), subsequent executions will be delayed as well.
     * In the long run, the frequency of execution will generally be slightly
     * lower than the reciprocal of the specified period (assuming the system
     * clock underlying <tt>Object.wait(long)</tt> is accurate).  As a
     * consequence of the above, if the scheduled first time is in the past,
     * it is scheduled for immediate execution.
     *
     * <p>Fixed-delay execution is appropriate for recurring activities
     * that require "smoothness."  In other words, it is appropriate for
     * activities where it is more important to keep the frequency accurate
     * in the short run than in the long run.  This includes most animation
     * tasks, such as blinking a cursor at regular intervals.  It also includes
     * tasks wherein regular activity is performed in response to human
     * input, such as automatically repeating a character as long as a key
     * is held down.
     *
     * @param task   task to be scheduled.
     * @param firstTime First time at which task is to be executed.
     * @param period time in milliseconds between successive task executions.
     * @throws IllegalArgumentException if {@code firstTime.getTime() < 0}, or
     *         {@code period <= 0}
     * @throws IllegalStateException if task was already scheduled or
     *         cancelled, timer was cancelled, or timer thread terminated.
     * @throws NullPointerException if {@code task} or {@code firstTime} is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public void schedule(TimerTask task, long delay, long period) {

    /**
     * Schedules the specified task for repeated <i>fixed-delay execution</i>,
     * beginning after the specified delay.  Subsequent executions take place
     * at approximately regular intervals separated by the specified period.
     *
     * <p>In fixed-delay execution, each execution is scheduled relative to
     * the actual execution time of the previous execution.  If an execution
     * is delayed for any reason (such as garbage collection or other
     * background activity), subsequent executions will be delayed as well.
     * In the long run, the frequency of execution will generally be slightly
     * lower than the reciprocal of the specified period (assuming the system
     * clock underlying <tt>Object.wait(long)</tt> is accurate).
     *
     * <p>Fixed-delay execution is appropriate for recurring activities
     * that require "smoothness."  In other words, it is appropriate for
     * activities where it is more important to keep the frequency accurate
     * in the short run than in the long run.  This includes most animation
     * tasks, such as blinking a cursor at regular intervals.  It also includes
     * tasks wherein regular activity is performed in response to human
     * input, such as automatically repeating a character as long as a key
     * is held down.
     *
     * @param task   task to be scheduled.
     * @param delay  delay in milliseconds before task is to be executed.
     * @param period time in milliseconds between successive task executions.
     * @throws IllegalArgumentException if {@code delay < 0}, or
     *         {@code delay + System.currentTimeMillis() < 0}, or
     *         {@code period <= 0}
     * @throws IllegalStateException if task was already scheduled or
     *         cancelled, timer was cancelled, or timer thread terminated.
     * @throws NullPointerException if {@code task} is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public void schedule(TimerTask task, Date time) {

    /**
     * Schedules the specified task for execution at the specified time.  If
     * the time is in the past, the task is scheduled for immediate execution.
     *
     * @param task task to be scheduled.
     * @param time time at which task is to be executed.
     * @throws IllegalArgumentException if <tt>time.getTime()</tt> is negative.
     * @throws IllegalStateException if task was already scheduled or
     *         cancelled, timer was cancelled, or timer thread terminated.
     * @throws NullPointerException if {@code task} or {@code time} is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public void schedule(TimerTask task, long delay) {

    /**
     * Schedules the specified task for execution after the specified delay.
     *
     * @param task  task to be scheduled.
     * @param delay delay in milliseconds before task is to be executed.
     * @throws IllegalArgumentException if <tt>delay</tt> is negative, or
     *         <tt>delay + System.currentTimeMillis()</tt> is negative.
     * @throws IllegalStateException if task was already scheduled or
     *         cancelled, timer was cancelled, or timer thread terminated.
     * @throws NullPointerException if {@code task} is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public Timer(String name, boolean isDaemon) {

    /**
     * Creates a new timer whose associated thread has the specified name,
     * and may be specified to
     * {@linkplain Thread#setDaemon run as a daemon}.
     *
     * @param name the name of the associated thread
     * @param isDaemon true if the associated thread should run as a daemon
     * @throws NullPointerException if {@code name} is null
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public Timer(String name) {

    /**
     * Creates a new timer whose associated thread has the specified name.
     * The associated thread does <i>not</i>
     * {@linkplain Thread#setDaemon run as a daemon}.
     *
     * @param name the name of the associated thread
     * @throws NullPointerException if {@code name} is null
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public Timer(boolean isDaemon) {

    /**
     * Creates a new timer whose associated thread may be specified to
     * {@linkplain Thread#setDaemon run as a daemon}.
     * A daemon thread is called for if the timer will be used to
     * schedule repeating "maintenance activities", which must be
     * performed as long as the application is running, but should not
     * prolong the lifetime of the application.
     *
     * @param isDaemon true if the associated thread should run as a daemon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    public Timer() {

    /**
     * Creates a new timer.  The associated thread does <i>not</i>
     * {@linkplain Thread#setDaemon run as a daemon}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    private final static AtomicInteger nextSerialNumber = new AtomicInteger(0);

    /**
     * This ID is used to generate thread names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    private final Object threadReaper = new Object() {

    /**
     * This object causes the timer's task execution thread to exit
     * gracefully when there are no live references to the Timer object and no
     * tasks in the timer queue.  It is used in preference to a finalizer on
     * Timer as such a finalizer would be susceptible to a subclass's
     * finalizer forgetting to call it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
    private final TimerThread thread = new TimerThread(queue);

    /**
     * The timer thread.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Timer.java
public class Timer {

/**
 * A facility for threads to schedule tasks for future execution in a
 * background thread.  Tasks may be scheduled for one-time execution, or for
 * repeated execution at regular intervals.
 *
 * <p>Corresponding to each <tt>Timer</tt> object is a single background
 * thread that is used to execute all of the timer's tasks, sequentially.
 * Timer tasks should complete quickly.  If a timer task takes excessive time
 * to complete, it "hogs" the timer's task execution thread.  This can, in
 * turn, delay the execution of subsequent tasks, which may "bunch up" and
 * execute in rapid succession when (and if) the offending task finally
 * completes.
 *
 * <p>After the last live reference to a <tt>Timer</tt> object goes away
 * <i>and</i> all outstanding tasks have completed execution, the timer's task
 * execution thread terminates gracefully (and becomes subject to garbage
 * collection).  However, this can take arbitrarily long to occur.  By
 * default, the task execution thread does not run as a <i>daemon thread</i>,
 * so it is capable of keeping an application from terminating.  If a caller
 * wants to terminate a timer's task execution thread rapidly, the caller
 * should invoke the timer's <tt>cancel</tt> method.
 *
 * <p>If the timer's task execution thread terminates unexpectedly, for
 * example, because its <tt>stop</tt> method is invoked, any further
 * attempt to schedule a task on the timer will result in an
 * <tt>IllegalStateException</tt>, as if the timer's <tt>cancel</tt>
 * method had been invoked.
 *
 * <p>This class is thread-safe: multiple threads can share a single
 * <tt>Timer</tt> object without the need for external synchronization.
 *
 * <p>This class does <i>not</i> offer real-time guarantees: it schedules
 * tasks using the <tt>Object.wait(long)</tt> method.
 *
 * <p>Java 5.0 introduced the {@code java.util.concurrent} package and
 * one of the concurrency utilities therein is the {@link
 * java.util.concurrent.ScheduledThreadPoolExecutor
 * ScheduledThreadPoolExecutor} which is a thread pool for repeatedly
 * executing tasks at a given rate or delay.  It is effectively a more
 * versatile replacement for the {@code Timer}/{@code TimerTask}
 * combination, as it allows multiple service threads, accepts various
 * time units, and doesn't require subclassing {@code TimerTask} (just
 * implement {@code Runnable}).  Configuring {@code
 * ScheduledThreadPoolExecutor} with one thread makes it equivalent to
 * {@code Timer}.
 *
 * <p>Implementation note: This class scales to large numbers of concurrently
 * scheduled tasks (thousands should present no problem).  Internally,
 * it uses a binary heap to represent its task queue, so the cost to schedule
 * a task is O(log n), where n is the number of concurrently scheduled tasks.
 *
 * <p>Implementation note: All constructors start a timer thread.
 *
 * @author  Josh Bloch
 * @see     TimerTask
 * @see     Object#wait(long)
 * @since   1.3
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    void sendNotification(Date timeStamp, TimerNotification notification) {

    /**
     * This method is used by the timer MBean to update and send a timer
     * notification to all the listeners registered for this kind of notification.
     *
     * @param timeStamp The notification emission date.
     * @param notification The timer notification to send.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    @SuppressWarnings("deprecation")

    /**
     * This method is called by the timer each time
     * the TimerAlarmClock has exceeded its timeout.
     *
     * @param notification The TimerAlarmClock notification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    private synchronized void updateTimerTable(Integer notifID) {

    /**
     * If the timer notification is not periodic, it is removed from the list of notifications.
     * <P>
     * If the timer period of the timer notification has a non null periodicity,
     * the date of the timer notification is updated by adding the periodicity.
     * The associated TimerAlarmClock is updated by setting its timeout to the period value.
     * <P>
     * If the timer period has a defined number of occurrences, the timer
     * notification is updated if the number of occurrences has not yet been reached.
     * Otherwise it is removed from the list of notifications.
     *
     * @param notifID The timer notification identifier to update.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    private synchronized void sendPastNotifications(Date currentDate, boolean currentFlag) {

    /**
     * Sends or not past notifications depending on the specified flag.
     *
     * @param currentDate The current date.
     * @param currentFlag The flag indicating if past notifications must be sent or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized boolean isEmpty() {

    /**
     * Tests whether the list of timer notifications is empty.
     *
     * @return <CODE>true</CODE> if the list of timer notifications is empty, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public boolean isActive() {

    /**
     * Tests whether the timer MBean is active.
     * A timer MBean is marked active when the {@link #start start} method is called.
     * It becomes inactive when the {@link #stop stop} method is called.
     * <BR>The default value of the active on/off flag is <CODE>false</CODE>.
     *
     * @return <CODE>true</CODE> if the timer MBean is active, <CODE>false</CODE> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public void setSendPastNotifications(boolean value) {

    /**
     * Sets the flag indicating whether the timer sends past notifications or not.
     * <BR>The default value of the past notifications sending on/off flag is <CODE>false</CODE>.
     *
     * @param value The past notifications sending on/off flag value.
     *
     * @see #getSendPastNotifications
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public boolean getSendPastNotifications() {

    /**
     * Gets the flag indicating whether or not the timer sends past notifications.
     * <BR>The default value of the past notifications sending on/off flag is <CODE>false</CODE>.
     *
     * @return The past notifications sending on/off flag value.
     *
     * @see #setSendPastNotifications
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized Boolean getFixedRate(Integer id) {

    /**
     * Gets a copy of the flag indicating whether a periodic notification is
     * executed at <i>fixed-delay</i> or at <i>fixed-rate</i>.
     *
     * @param id The timer notification identifier.
     *
     * @return A copy of the flag indicating whether a periodic notification is
     *         executed at <i>fixed-delay</i> or at <i>fixed-rate</i>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized Long getNbOccurences(Integer id) {

    /**
     * Gets a copy of the remaining number of occurrences associated to a timer notification.
     *
     * @param id The timer notification identifier.
     *
     * @return A copy of the remaining number of occurrences or null if the identifier is not mapped to any
     * timer notification registered for this timer MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized Long getPeriod(Integer id) {

    /**
     * Gets a copy of the period (in milliseconds) associated to a timer notification.
     *
     * @param id The timer notification identifier.
     *
     * @return A copy of the period or null if the identifier is not mapped to any
     * timer notification registered for this timer MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized Date getDate(Integer id) {

    /**
     * Gets a copy of the date associated to a timer notification.
     *
     * @param id The timer notification identifier.
     *
     * @return A copy of the date or null if the identifier is not mapped to any
     * timer notification registered for this timer MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    // NPCTE fix for bugId 4464388, esc 0, MR, 03 sept 2001, to be added after modification of jmx spec

    /**
     * Gets the timer notification user data object corresponding to the specified identifier.
     *
     * @param id The timer notification identifier.
     *
     * @return The timer notification user data object or null if the identifier is not mapped to any
     * timer notification registered for this timer MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized String getNotificationMessage(Integer id) {

    /**
     * Gets the timer notification detailed message corresponding to the specified identifier.
     *
     * @param id The timer notification identifier.
     *
     * @return The timer notification detailed message or null if the identifier is not mapped to any
     * timer notification registered for this timer MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized String getNotificationType(Integer id) {

    /**
     * Gets the timer notification type corresponding to the specified identifier.
     *
     * @param id The timer notification identifier.
     *
     * @return The timer notification type or null if the identifier is not mapped to any
     * timer notification registered for this timer MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized Vector<Integer> getNotificationIDs(String type) {

    /**
     * Gets all the identifiers of timer notifications corresponding to the specified type.
     *
     * @param type The timer notification type.
     *
     * @return A vector of <CODE>Integer</CODE> objects containing all the identifiers of
     * timer notifications with the specified <CODE>type</CODE>.
     * <BR>The vector is empty if there is no timer notifications registered for this timer MBean
     * with the specified <CODE>type</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized Vector<Integer> getAllNotificationIDs() {

    /**
     * Gets all timer notification identifiers registered into the list of notifications.
     *
     * @return A vector of <CODE>Integer</CODE> objects containing all the timer notification identifiers.
     * <BR>The vector is empty if there is no timer notification registered for this timer MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized int getNbNotifications() {

    /**
     * Gets the number of timer notifications registered into the list of notifications.
     *
     * @return The number of timer notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized void removeAllNotifications() {

    /**
     * Removes all the timer notifications from the list of notifications
     * and resets the counter used to update the timer notification identifiers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized void removeNotifications(String type) throws InstanceNotFoundException {

    /**
     * Removes all the timer notifications corresponding to the specified type from the list of notifications.
     *
     * @param type The timer notification type.
     *
     * @exception InstanceNotFoundException The specified type does not correspond to any timer notification
     * in the list of notifications of this timer MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized void removeNotification(Integer id) throws InstanceNotFoundException {

    /**
     * Removes the timer notification corresponding to the specified identifier from the list of notifications.
     *
     * @param id The timer notification identifier.
     *
     * @exception InstanceNotFoundException The specified identifier does not correspond to any timer notification
     * in the list of notifications of this timer MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
// NPCTE fix for bugId 4464388, esc 0,  MR, to be added after modification of jmx spec

    /**
     * Creates a new timer notification with the specified <CODE>type</CODE>, <CODE>message</CODE>
     * and <CODE>userData</CODE> and inserts it into the list of notifications with a given date
     * and a null period and number of occurrences.
     * <P>
     * The timer notification will be handled once at the specified date.
     * <P>
     * If the timer notification to be inserted has a date that is before the current date,
     * the method behaves as if the specified date were the current date and the
     * notification is delivered immediately.
     *
     * @param type The timer notification type.
     * @param message The timer notification detailed message.
     * @param userData The timer notification user data object.
     * @param date The date when the notification occurs.
     *
     * @return The identifier of the new created timer notification.
     *
     * @exception java.lang.IllegalArgumentException The date is {@code null}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
// NPCTE fix for bugId 4464388, esc 0,  MR , to be added after modification of jmx spec

    /**
     * Creates a new timer notification with the specified <CODE>type</CODE>, <CODE>message</CODE>
     * and <CODE>userData</CODE> and inserts it into the list of notifications with a given date
     * and period and a null number of occurrences.
     * <P>
     * The timer notification will repeat continuously using the timer period using a <i>fixed-delay</i>
     * execution scheme, as specified in {@link java.util.Timer}. In order to use a <i>fixed-rate</i>
     * execution scheme, use {@link #addNotification(String, String, Object, Date, long, long,
     * boolean)} instead.
     * <P>
     * If the timer notification to be inserted has a date that is before the current date,
     * the method behaves as if the specified date were the current date. The
     * first notification is delivered immediately and the subsequent ones are
     * spaced as specified by the period parameter.
     *
     * @param type The timer notification type.
     * @param message The timer notification detailed message.
     * @param userData The timer notification user data object.
     * @param date The date when the notification occurs.
     * @param period The period of the timer notification (in milliseconds).
     *
     * @return The identifier of the new created timer notification.
     *
     * @exception java.lang.IllegalArgumentException The date is {@code null} or
     * the period is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
// NPCTE fix for bugId 4464388, esc 0,  MR , to be added after modification of jmx spec

    /**
     * Creates a new timer notification with the specified <CODE>type</CODE>, <CODE>message</CODE>
     * and <CODE>userData</CODE> and inserts it into the list of notifications with a given date,
     * period and number of occurrences.
     * <P>
     * If the timer notification to be inserted has a date that is before the current date,
     * the method behaves as if the specified date were the current date. <BR>
     * For once-off notifications, the notification is delivered immediately. <BR>
     * For periodic notifications, the first notification is delivered immediately and the
     * subsequent ones are spaced as specified by the period parameter.
     * <P>
     * Note that once the timer notification has been added into the list of notifications,
     * its associated date, period and number of occurrences cannot be updated.
     * <P>
     * In the case of a periodic notification, uses a <i>fixed-delay</i> execution scheme, as specified in
     * {@link java.util.Timer}. In order to use a <i>fixed-rate</i> execution scheme, use
     * {@link #addNotification(String, String, Object, Date, long, long, boolean)} instead.
     *
     * @param type The timer notification type.
     * @param message The timer notification detailed message.
     * @param userData The timer notification user data object.
     * @param date The date when the notification occurs.
     * @param period The period of the timer notification (in milliseconds).
     * @param nbOccurences The total number the timer notification will be emitted.
     *
     * @return The identifier of the new created timer notification.
     *
     * @exception java.lang.IllegalArgumentException The date is {@code null} or
     * the period or the number of occurrences is negative.
     *
     * @see #addNotification(String, String, Object, Date, long, long, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
// NPCTE fix for bugId 4464388, esc 0,  MR, to be added after modification of jmx spec

    /**
     * Creates a new timer notification with the specified <CODE>type</CODE>, <CODE>message</CODE>
     * and <CODE>userData</CODE> and inserts it into the list of notifications with a given date,
     * period and number of occurrences.
     * <P>
     * If the timer notification to be inserted has a date that is before the current date,
     * the method behaves as if the specified date were the current date. <BR>
     * For once-off notifications, the notification is delivered immediately. <BR>
     * For periodic notifications, the first notification is delivered immediately and the
     * subsequent ones are spaced as specified by the period parameter.
     * <P>
     * Note that once the timer notification has been added into the list of notifications,
     * its associated date, period and number of occurrences cannot be updated.
     * <P>
     * In the case of a periodic notification, the value of parameter <i>fixedRate</i> is used to
     * specify the execution scheme, as specified in {@link java.util.Timer}.
     *
     * @param type The timer notification type.
     * @param message The timer notification detailed message.
     * @param userData The timer notification user data object.
     * @param date The date when the notification occurs.
     * @param period The period of the timer notification (in milliseconds).
     * @param nbOccurences The total number the timer notification will be emitted.
     * @param fixedRate If <code>true</code> and if the notification is periodic, the notification
     *                  is scheduled with a <i>fixed-rate</i> execution scheme. If
     *                  <code>false</code> and if the notification is periodic, the notification
     *                  is scheduled with a <i>fixed-delay</i> execution scheme. Ignored if the
     *                  notification is not periodic.
     *
     * @return The identifier of the new created timer notification.
     *
     * @exception java.lang.IllegalArgumentException The date is {@code null} or
     * the period or the number of occurrences is negative.
     *
     * @see #addNotification(String, String, Object, Date, long, long)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized void stop() {

    /**
     * Stops the timer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public synchronized void start() {

    /**
     * Starts the timer.
     * <P>
     * If there is one or more timer notifications before the time in the list of notifications, the notification
     * is sent according to the <CODE>sendPastNotifications</CODE> flag and then, updated
     * according to its period and remaining number of occurrences.
     * If the timer notification date remains earlier than the current date, this notification is just removed
     * from the list of notifications.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public void postDeregister() {

    /**
     * Allows the timer MBean to perform any operations needed after having been
     * unregistered by the MBean server.
     * <P>
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public void preDeregister() throws java.lang.Exception {

    /**
     * Allows the timer MBean to perform any operations it needs before being unregistered
     * by the MBean server.
     * <P>
     * Stops the timer.
     *
     * @exception java.lang.Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public void postRegister (Boolean registrationDone) {

    /**
     * Allows the timer MBean to perform any operations needed after having been
     * registered in the MBean server or after the registration has failed.
     * <P>
     * Not used in this context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public ObjectName preRegister(MBeanServer server, ObjectName name)

    /**
     * Allows the timer MBean to perform any operations it needs before being registered
     * in the MBean server.
     * <P>
     * Not used in this context.
     *
     * @param server The MBean server in which the timer MBean will be registered.
     * @param name The object name of the timer MBean.
     *
     * @return The name of the timer MBean registered.
     *
     * @exception java.lang.Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public Timer() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    volatile private int counterID = 0;

    /**
     * The notification counter ID.
     * Used to keep the max key value inserted into the timer table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    private transient long sequenceNumber = 0;

    /**
     * Timer sequence number.
     * The default value is set to 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    private transient boolean isActive = false;

    /**
     * Timer state.
     * The default value is set to <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    private boolean sendPastNotifications = false;

    /**
     * Past notifications sending on/off flag value.
     * This attribute is used to specify if the timer has to send past notifications after start.
     * <BR>The default value is set to <CODE>false</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    final private Map<Integer,Object[]> timerTable =

    /**
     * Table containing all the timer notifications of this timer,
     * with the associated date, period and number of occurrences.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public static final long ONE_WEEK   = 7*ONE_DAY;

    /**
     * Number of milliseconds in one week.
     * Useful constant for the <CODE>addNotification</CODE> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public static final long ONE_DAY    = 24*ONE_HOUR;

    /**
     * Number of milliseconds in one day.
     * Useful constant for the <CODE>addNotification</CODE> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public static final long ONE_HOUR   = 60*ONE_MINUTE;

    /**
     * Number of milliseconds in one hour.
     * Useful constant for the <CODE>addNotification</CODE> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public static final long ONE_MINUTE = 60*ONE_SECOND;

    /**
     * Number of milliseconds in one minute.
     * Useful constant for the <CODE>addNotification</CODE> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
    public static final long ONE_SECOND = 1000;

    /**
     * Number of milliseconds in one second.
     * Useful constant for the <CODE>addNotification</CODE> method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/timer/Timer.java
public class Timer extends NotificationBroadcasterSupport

/**
 *
 * Provides the implementation of the timer MBean.
 * The timer MBean sends out an alarm at a specified time
 * that wakes up all the listeners registered to receive timer notifications.
 * <P>
 *
 * This class manages a list of dated timer notifications.
 * A method allows users to add/remove as many notifications as required.
 * When a timer notification is emitted by the timer and becomes obsolete,
 * it is automatically removed from the list of timer notifications.
 * <BR>Additional timer notifications can be added into regularly repeating notifications.
 * <P>
 *
 * Note:
 * <OL>
 * <LI>When sending timer notifications, the timer updates the notification sequence number
 * irrespective of the notification type.
 * <LI>The timer service relies on the system date of the host where the <CODE>Timer</CODE> class is loaded.
 * Listeners may receive untimely notifications
 * if their host has a different system date.
 * To avoid such problems, synchronize the system date of all host machines where timing is needed.
 * <LI>The default behavior for periodic notifications is <i>fixed-delay execution</i>, as
 *     specified in {@link java.util.Timer}. In order to use <i>fixed-rate execution</i>, use the
 *     overloaded {@link #addNotification(String, String, Object, Date, long, long, boolean)} method.
 * <LI>Notification listeners are potentially all executed in the same
 * thread.  Therefore, they should execute rapidly to avoid holding up
 * other listeners or perturbing the regularity of fixed-delay
 * executions.  See {@link NotificationBroadcasterSupport}.
 * </OL>
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    void cancelEvent() {

    /**
     * Resets the internal state to indicate this Timer shouldn't notify
     * any of its listeners. This does not stop a repeatable Timer from
     * firing again, use <code>stop</code> for that.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public void restart() {

    /**
     * Restarts the <code>Timer</code>,
     * canceling any pending firings and causing
     * it to fire with its initial delay.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public void stop() {

    /**
     * Stops the <code>Timer</code>,
     * causing it to stop sending action events
     * to its listeners.
     *
     * @see #start
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public boolean isRunning() {

    /**
     * Returns <code>true</code> if the <code>Timer</code> is running.
     *
     * @see #start
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
     public void start() {

    /**
     * Starts the <code>Timer</code>,
     * causing it to start sending action events
     * to its listeners.
     *
     * @see #stop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public String getActionCommand() {

    /**
     * Returns the string that will be delivered as the action command
     * in <code>ActionEvent</code>s fired by this timer. May be
     * <code>null</code>, which is also the default.
     *
     * @return the action command used in firing events
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public void setActionCommand(String command) {

    /**
     * Sets the string that will be delivered as the action command
     * in <code>ActionEvent</code>s fired by this timer.
     * <code>null</code> is an acceptable value.
     *
     * @param command the action command
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public boolean isCoalesce() {

    /**
     * Returns <code>true</code> if the <code>Timer</code> coalesces
     * multiple pending action events.
     *
     * @see #setCoalesce
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public void setCoalesce(boolean flag) {

    /**
     * Sets whether the <code>Timer</code> coalesces multiple pending
     * <code>ActionEvent</code> firings.
     * A busy application may not be able
     * to keep up with a <code>Timer</code>'s event generation,
     * causing multiple
     * action events to be queued.  When processed,
     * the application sends these events one after the other, causing the
     * <code>Timer</code>'s listeners to receive a sequence of
     * events with no delay between them. Coalescing avoids this situation
     * by reducing multiple pending events to a single event.
     * <code>Timer</code>s
     * coalesce events by default.
     *
     * @param flag specify <code>false</code> to turn off coalescing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public boolean isRepeats() {

    /**
     * Returns <code>true</code> (the default)
     * if the <code>Timer</code> will send
     * an action event
     * to its listeners multiple times.
     *
     * @see #setRepeats
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public void setRepeats(boolean flag) {

    /**
     * If <code>flag</code> is <code>false</code>,
     * instructs the <code>Timer</code> to send only one
     * action event to its listeners.
     *
     * @param flag specify <code>false</code> to make the timer
     *             stop after sending its first action event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public int getInitialDelay() {

    /**
     * Returns the <code>Timer</code>'s initial delay.
     *
     * @see #setInitialDelay
     * @see #setDelay
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public void setInitialDelay(int initialDelay) {

    /**
     * Sets the <code>Timer</code>'s initial delay, the time
     * in milliseconds to wait after the timer is started
     * before firing the first event. Upon construction, this
     * is set to be the same as the between-event delay,
     * but then its value is independent and remains unaffected
     * by changes to the between-event delay.
     *
     * @param initialDelay the initial delay, in milliseconds
     * @see #setDelay
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public int getDelay() {

    /**
     * Returns the delay, in milliseconds,
     * between firings of action events.
     *
     * @see #setDelay
     * @see #getInitialDelay
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public void setDelay(int delay) {

    /**
     * Sets the <code>Timer</code>'s between-event delay, the number of milliseconds
     * between successive action events. This does not affect the initial delay
     * property, which can be set by the {@code setInitialDelay} method.
     *
     * @param delay the delay in milliseconds
     * @see #setInitialDelay
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public static boolean getLogTimers() {

    /**
     * Returns <code>true</code> if logging is enabled.
     *
     * @return <code>true</code> if logging is enabled; otherwise, false
     * @see #setLogTimers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public static void setLogTimers(boolean flag) {

    /**
     * Enables or disables the timer log. When enabled, a message
     * is posted to <code>System.out</code> whenever the timer goes off.
     *
     * @param flag  <code>true</code> to enable logging
     * @see #getLogTimers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    private TimerQueue timerQueue() {

    /**
     * Returns the timer queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered as
     * <code><em>Foo</em>Listener</code>s
     * upon this <code>Timer</code>.
     * <code><em>Foo</em>Listener</code>s
     * are registered using the <code>add<em>Foo</em>Listener</code> method.
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a <code>Timer</code>
     * instance <code>t</code>
     * for its action listeners
     * with the following code:
     *
     * <pre>ActionListener[] als = (ActionListener[])(t.getListeners(ActionListener.class));</pre>
     *
     * If no such listeners exist,
     * this method returns an empty array.
     *
     * @param listenerType  the type of listeners requested;
     *          this parameter should specify an interface
     *          that descends from <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s
     *          on this timer,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code> doesn't
     *          specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getActionListeners
     * @see #addActionListener
     * @see #removeActionListener
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    protected void fireActionPerformed(ActionEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param e the action event to fire
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public ActionListener[] getActionListeners() {

    /**
     * Returns an array of all the action listeners registered
     * on this timer.
     *
     * @return all of the timer's <code>ActionListener</code>s or an empty
     *         array if no action listeners are currently registered
     *
     * @see #addActionListener
     * @see #removeActionListener
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public void removeActionListener(ActionListener listener) {

    /**
     * Removes the specified action listener from the <code>Timer</code>.
     *
     * @param listener the listener to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public void addActionListener(ActionListener listener) {

    /**
     * Adds an action listener to the <code>Timer</code>.
     *
     * @param listener the listener to add
     *
     * @see #Timer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    class DoPostEvent implements Runnable

    /**
     * DoPostEvent is a runnable class that fires actionEvents to
     * the listeners on the EventDispatchThread, via invokeLater.
     * @see Timer#post
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
     final AccessControlContext getAccessControlContext() {

    /**
      * Returns the acc this timer was constructed with.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
    public Timer(int delay, ActionListener listener) {

    /**
     * Creates a {@code Timer} and initializes both the initial delay and
     * between-event delay to {@code delay} milliseconds. If {@code delay}
     * is less than or equal to zero, the timer fires as soon as it
     * is started. If <code>listener</code> is not <code>null</code>,
     * it's registered as an action listener on the timer.
     *
     * @param delay milliseconds for the initial and between-event delay
     * @param listener  an initial listener; can be <code>null</code>
     *
     * @see #addActionListener
     * @see #setInitialDelay
     * @see #setRepeats
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Timer.java
@SuppressWarnings("serial")

/**
 * Fires one or more {@code ActionEvent}s at specified
 * intervals. An example use is an animation object that uses a
 * <code>Timer</code> as the trigger for drawing its frames.
 *<p>
 * Setting up a timer
 * involves creating a <code>Timer</code> object,
 * registering one or more action listeners on it,
 * and starting the timer using
 * the <code>start</code> method.
 * For example,
 * the following code creates and starts a timer
 * that fires an action event once per second
 * (as specified by the first argument to the <code>Timer</code> constructor).
 * The second argument to the <code>Timer</code> constructor
 * specifies a listener to receive the timer's action events.
 *
 *<pre>
 *  int delay = 1000; //milliseconds
 *  ActionListener taskPerformer = new ActionListener() {
 *      public void actionPerformed(ActionEvent evt) {
 *          <em>//...Perform a task...</em>
 *      }
 *  };
 *  new Timer(delay, taskPerformer).start();</pre>
 *
 * <p>
 * {@code Timers} are constructed by specifying both a delay parameter
 * and an {@code ActionListener}. The delay parameter is used
 * to set both the initial delay and the delay between event
 * firing, in milliseconds. Once the timer has been started,
 * it waits for the initial delay before firing its
 * first <code>ActionEvent</code> to registered listeners.
 * After this first event, it continues to fire events
 * every time the between-event delay has elapsed, until it
 * is stopped.
 * <p>
 * After construction, the initial delay and the between-event
 * delay can be changed independently, and additional
 * <code>ActionListeners</code> may be added.
 * <p>
 * If you want the timer to fire only the first time and then stop,
 * invoke <code>setRepeats(false)</code> on the timer.
 * <p>
 * Although all <code>Timer</code>s perform their waiting
 * using a single, shared thread
 * (created by the first <code>Timer</code> object that executes),
 * the action event handlers for <code>Timer</code>s
 * execute on another thread -- the event-dispatching thread.
 * This means that the action handlers for <code>Timer</code>s
 * can safely perform operations on Swing components.
 * However, it also means that the handlers must execute quickly
 * to keep the GUI responsive.
 *
 * <p>
 * In v 1.3, another <code>Timer</code> class was added
 * to the Java platform: <code>java.util.Timer</code>.
 * Both it and <code>javax.swing.Timer</code>
 * provide the same basic functionality,
 * but <code>java.util.Timer</code>
 * is more general and has more features.
 * The <code>javax.swing.Timer</code> has two features
 * that can make it a little easier to use with GUIs.
 * First, its event handling metaphor is familiar to GUI programmers
 * and can make dealing with the event-dispatching thread
 * a bit simpler.
 * Second, its
 * automatic thread sharing means that you don't have to
 * take special steps to avoid spawning
 * too many threads.
 * Instead, your timer uses the same thread
 * used to make cursors blink,
 * tool tips appear,
 * and so on.
 *
 * <p>
 * You can find further documentation
 * and several examples of using timers by visiting
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html"
 * target = "_top">How to Use Timers</a>,
 * a section in <em>The Java Tutorial.</em>
 * For more examples and help in choosing between
 * this <code>Timer</code> class and
 * <code>java.util.Timer</code>,
 * see
 * <a href="http://java.sun.com/products/jfc/tsc/articles/timer/"
 * target="_top">Using Timers in Swing Applications</a>,
 * an article in <em>The Swing Connection.</em>
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @see java.util.Timer <code>java.util.Timer</code>
 *
 *
 * @author Dave Moore
 */
