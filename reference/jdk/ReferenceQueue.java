_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/ReferenceQueue.java
    public Reference<? extends T> remove() throws InterruptedException {

    /**
     * Removes the next reference object in this queue, blocking until one
     * becomes available.
     *
     * @return A reference object, blocking until one becomes available
     * @throws  InterruptedException  If the wait is interrupted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/ReferenceQueue.java
    public Reference<? extends T> remove(long timeout)

    /**
     * Removes the next reference object in this queue, blocking until either
     * one becomes available or the given timeout period expires.
     *
     * <p> This method does not offer real-time guarantees: It schedules the
     * timeout as if by invoking the {@link Object#wait(long)} method.
     *
     * @param  timeout  If positive, block for up to <code>timeout</code>
     *                  milliseconds while waiting for a reference to be
     *                  added to this queue.  If zero, block indefinitely.
     *
     * @return  A reference object, if one was available within the specified
     *          timeout period, otherwise <code>null</code>
     *
     * @throws  IllegalArgumentException
     *          If the value of the timeout argument is negative
     *
     * @throws  InterruptedException
     *          If the timeout wait is interrupted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/ReferenceQueue.java
    public Reference<? extends T> poll() {

    /**
     * Polls this queue to see if a reference object is available.  If one is
     * available without further delay then it is removed from the queue and
     * returned.  Otherwise this method immediately returns <tt>null</tt>.
     *
     * @return  A reference object, if one was immediately available,
     *          otherwise <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/ReferenceQueue.java
    public ReferenceQueue() { }

    /**
     * Constructs a new reference-object queue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/ReferenceQueue.java
public class ReferenceQueue<T> {

/**
 * Reference queues, to which registered reference objects are appended by the
 * garbage collector after the appropriate reachability changes are detected.
 *
 * @author   Mark Reinhold
 * @since    1.2
 */
