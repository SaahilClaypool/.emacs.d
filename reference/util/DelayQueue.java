_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    private class Itr implements Iterator<E> {

    /**
     * Snapshot iterator that works off copy of underlying q array.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public Iterator<E> iterator() {

    /**
     * Returns an iterator over all the elements (both expired and
     * unexpired) in this queue. The iterator does not return the
     * elements in any particular order.
     *
     * <p>The returned iterator is
     * <a href="package-summary.html#Weakly"><i>weakly consistent</i></a>.
     *
     * @return an iterator over the elements in this queue
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    void removeEQ(Object o) {

    /**
     * Identity-based version for use in Itr.remove
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public boolean remove(Object o) {

    /**
     * Removes a single instance of the specified element from this
     * queue, if it is present, whether or not it has expired.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public <T> T[] toArray(T[] a) {

    /**
     * Returns an array containing all of the elements in this queue; the
     * runtime type of the returned array is that of the specified array.
     * The returned array elements are in no particular order.
     * If the queue fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of the
     * specified array and the size of this queue.
     *
     * <p>If this queue fits in the specified array with room to spare
     * (i.e., the array has more elements than this queue), the element in
     * the array immediately following the end of the queue is set to
     * {@code null}.
     *
     * <p>Like the {@link #toArray()} method, this method acts as bridge between
     * array-based and collection-based APIs.  Further, this method allows
     * precise control over the runtime type of the output array, and may,
     * under certain circumstances, be used to save allocation costs.
     *
     * <p>The following code can be used to dump a delay queue into a newly
     * allocated array of {@code Delayed}:
     *
     * <pre> {@code Delayed[] a = q.toArray(new Delayed[0]);}</pre>
     *
     * Note that {@code toArray(new Object[0])} is identical in function to
     * {@code toArray()}.
     *
     * @param a the array into which the elements of the queue are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose
     * @return an array containing all of the elements in this queue
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this queue
     * @throws NullPointerException if the specified array is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public Object[] toArray() {

    /**
     * Returns an array containing all of the elements in this queue.
     * The returned array elements are in no particular order.
     *
     * <p>The returned array will be "safe" in that no references to it are
     * maintained by this queue.  (In other words, this method must allocate
     * a new array).  The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this queue
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public int remainingCapacity() {

    /**
     * Always returns {@code Integer.MAX_VALUE} because
     * a {@code DelayQueue} is not capacity constrained.
     *
     * @return {@code Integer.MAX_VALUE}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public void clear() {

    /**
     * Atomically removes all of the elements from this delay queue.
     * The queue will be empty after this call returns.
     * Elements with an unexpired delay are not waited for; they are
     * simply discarded from the queue.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public int drainTo(Collection<? super E> c, int maxElements) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public int drainTo(Collection<? super E> c) {

    /**
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    private E peekExpired() {

    /**
     * Returns first element only if it is expired.
     * Used only by drainTo.  Call only when holding lock.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public E peek() {

    /**
     * Retrieves, but does not remove, the head of this queue, or
     * returns {@code null} if this queue is empty.  Unlike
     * {@code poll}, if no expired elements are available in the queue,
     * this method returns the element that will expire next,
     * if one exists.
     *
     * @return the head of this queue, or {@code null} if this
     *         queue is empty
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {

    /**
     * Retrieves and removes the head of this queue, waiting if necessary
     * until an element with an expired delay is available on this queue,
     * or the specified wait time expires.
     *
     * @return the head of this queue, or {@code null} if the
     *         specified waiting time elapses before an element with
     *         an expired delay becomes available
     * @throws InterruptedException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public E take() throws InterruptedException {

    /**
     * Retrieves and removes the head of this queue, waiting if necessary
     * until an element with an expired delay is available on this queue.
     *
     * @return the head of this queue
     * @throws InterruptedException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public E poll() {

    /**
     * Retrieves and removes the head of this queue, or returns {@code null}
     * if this queue has no elements with an expired delay.
     *
     * @return the head of this queue, or {@code null} if this
     *         queue has no elements with an expired delay
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public boolean offer(E e, long timeout, TimeUnit unit) {

    /**
     * Inserts the specified element into this delay queue. As the queue is
     * unbounded this method will never block.
     *
     * @param e the element to add
     * @param timeout This parameter is ignored as the method never blocks
     * @param unit This parameter is ignored as the method never blocks
     * @return {@code true}
     * @throws NullPointerException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public void put(E e) {

    /**
     * Inserts the specified element into this delay queue. As the queue is
     * unbounded this method will never block.
     *
     * @param e the element to add
     * @throws NullPointerException {@inheritDoc}
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public boolean offer(E e) {

    /**
     * Inserts the specified element into this delay queue.
     *
     * @param e the element to add
     * @return {@code true}
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public boolean add(E e) {

    /**
     * Inserts the specified element into this delay queue.
     *
     * @param e the element to add
     * @return {@code true} (as specified by {@link Collection#add})
     * @throws NullPointerException if the specified element is null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public DelayQueue(Collection<? extends E> c) {

    /**
     * Creates a {@code DelayQueue} initially containing the elements of the
     * given collection of {@link Delayed} instances.
     *
     * @param c the collection of elements to initially contain
     * @throws NullPointerException if the specified collection or any
     *         of its elements are null
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    public DelayQueue() {}

    /**
     * Creates a new {@code DelayQueue} that is initially empty.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    private final Condition available = lock.newCondition();

    /**
     * Condition signalled when a newer element becomes available
     * at the head of the queue or a new thread may need to
     * become leader.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
    private Thread leader = null;

    /**
     * Thread designated to wait for the element at the head of
     * the queue.  This variant of the Leader-Follower pattern
     * (http://www.cs.wustl.edu/~schmidt/POSA/POSA2/) serves to
     * minimize unnecessary timed waiting.  When a thread becomes
     * the leader, it waits only for the next delay to elapse, but
     * other threads await indefinitely.  The leader thread must
     * signal some other thread before returning from take() or
     * poll(...), unless some other thread becomes leader in the
     * interim.  Whenever the head of the queue is replaced with
     * an element with an earlier expiration time, the leader
     * field is invalidated by being reset to null, and some
     * waiting thread, but not necessarily the current leader, is
     * signalled.  So waiting threads must be prepared to acquire
     * and lose leadership while waiting.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/DelayQueue.java
public class DelayQueue<E extends Delayed> extends AbstractQueue<E>

/**
 * An unbounded {@linkplain BlockingQueue blocking queue} of
 * {@code Delayed} elements, in which an element can only be taken
 * when its delay has expired.  The <em>head</em> of the queue is that
 * {@code Delayed} element whose delay expired furthest in the
 * past.  If no delay has expired there is no head and {@code poll}
 * will return {@code null}. Expiration occurs when an element's
 * {@code getDelay(TimeUnit.NANOSECONDS)} method returns a value less
 * than or equal to zero.  Even though unexpired elements cannot be
 * removed using {@code take} or {@code poll}, they are otherwise
 * treated as normal elements. For example, the {@code size} method
 * returns the count of both expired and unexpired elements.
 * This queue does not permit null elements.
 *
 * <p>This class and its iterator implement all of the
 * <em>optional</em> methods of the {@link Collection} and {@link
 * Iterator} interfaces.  The Iterator provided in method {@link
 * #iterator()} is <em>not</em> guaranteed to traverse the elements of
 * the DelayQueue in any particular order.
 *
 * <p>This class is a member of the
 * <a href="{@docRoot}/../technotes/guides/collections/index.html">
 * Java Collections Framework</a>.
 *
 * @since 1.5
 * @author Doug Lea
 * @param <E> the type of elements held in this collection
 */
