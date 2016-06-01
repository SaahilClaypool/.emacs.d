_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private long cancelWaiter(WNode node, WNode group, boolean interrupted) {

    /**
     * If node non-null, forces cancel status and unsplices it from
     * queue if possible and wakes up any cowaiters (of the node, or
     * group, as applicable), and in any case helps release current
     * first waiter if lock is free. (Calling with null arguments
     * serves as a conditional form of release, which is not currently
     * needed but may be needed under possible future cancellation
     * policies). This is a variant of cancellation methods in
     * AbstractQueuedSynchronizer (see its detailed explanation in AQS
     * internal documentation).
     *
     * @param node if nonnull, the waiter
     * @param group either node or the group node is cowaiting with
     * @param interrupted if already interrupted
     * @return INTERRUPTED if interrupted or Thread.interrupted, else zero
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private long acquireRead(boolean interruptible, long deadline) {

    /**
     * See above for explanation.
     *
     * @param interruptible true if should check interrupts and if so
     * return INTERRUPTED
     * @param deadline if nonzero, the System.nanoTime value to timeout
     * at (and return zero)
     * @return next state, or INTERRUPTED
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private long acquireWrite(boolean interruptible, long deadline) {

    /**
     * See above for explanation.
     *
     * @param interruptible true if should check interrupts and if so
     * return INTERRUPTED
     * @param deadline if nonzero, the System.nanoTime value to timeout
     * at (and return zero)
     * @return next state, or INTERRUPTED
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private void release(WNode h) {

    /**
     * Wakes up the successor of h (normally whead). This is normally
     * just h.next, but may require traversal from wtail if next
     * pointers are lagging. This may fail to wake up an acquiring
     * thread when one or more have been cancelled, but the cancel
     * methods themselves provide extra safeguards to ensure liveness.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private long tryDecReaderOverflow(long s) {

    /**
     * Tries to decrement readerOverflow.
     *
     * @param s a reader overflow stamp: (s & ABITS) >= RFULL
     * @return new stamp on success, else zero
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private long tryIncReaderOverflow(long s) {

    /**
     * Tries to increment readerOverflow by first setting state
     * access bits value to RBITS, indicating hold of spinlock,
     * then updating, then releasing.
     *
     * @param s a reader overflow stamp: (s & ABITS) >= RFULL
     * @return new stamp on success, else zero
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public ReadWriteLock asReadWriteLock() {

    /**
     * Returns a {@link ReadWriteLock} view of this StampedLock in
     * which the {@link ReadWriteLock#readLock()} method is mapped to
     * {@link #asReadLock()}, and {@link ReadWriteLock#writeLock()} to
     * {@link #asWriteLock()}.
     *
     * @return the lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public Lock asWriteLock() {

    /**
     * Returns a plain {@link Lock} view of this StampedLock in which
     * the {@link Lock#lock} method is mapped to {@link #writeLock},
     * and similarly for other methods. The returned Lock does not
     * support a {@link Condition}; method {@link
     * Lock#newCondition()} throws {@code
     * UnsupportedOperationException}.
     *
     * @return the lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public Lock asReadLock() {

    /**
     * Returns a plain {@link Lock} view of this StampedLock in which
     * the {@link Lock#lock} method is mapped to {@link #readLock},
     * and similarly for other methods. The returned Lock does not
     * support a {@link Condition}; method {@link
     * Lock#newCondition()} throws {@code
     * UnsupportedOperationException}.
     *
     * @return the lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public String toString() {

    /**
     * Returns a string identifying this lock, as well as its lock
     * state.  The state, in brackets, includes the String {@code
     * "Unlocked"} or the String {@code "Write-locked"} or the String
     * {@code "Read-locks:"} followed by the current number of
     * read-locks held.
     *
     * @return a string identifying this lock, as well as its lock state
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public int getReadLockCount() {

    /**
     * Queries the number of read locks held for this lock. This
     * method is designed for use in monitoring system state, not for
     * synchronization control.
     * @return the number of read locks held
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public boolean isReadLocked() {

    /**
     * Returns {@code true} if the lock is currently held non-exclusively.
     *
     * @return {@code true} if the lock is currently held non-exclusively
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public boolean isWriteLocked() {

    /**
     * Returns {@code true} if the lock is currently held exclusively.
     *
     * @return {@code true} if the lock is currently held exclusively
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private int getReadLockCount(long s) {

    /**
     * Returns combined state-held and overflow read count for given
     * state s.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public boolean tryUnlockRead() {

    /**
     * Releases one hold of the read lock if it is held, without
     * requiring a stamp value. This method may be useful for recovery
     * after errors.
     *
     * @return {@code true} if the read lock was held, else false
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public boolean tryUnlockWrite() {

    /**
     * Releases the write lock if it is held, without requiring a
     * stamp value. This method may be useful for recovery after
     * errors.
     *
     * @return {@code true} if the lock was held, else false
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long tryConvertToOptimisticRead(long stamp) {

    /**
     * If the lock state matches the given stamp then, if the stamp
     * represents holding a lock, releases it and returns an
     * observation stamp.  Or, if an optimistic read, returns it if
     * validated. This method returns zero in all other cases, and so
     * may be useful as a form of "tryUnlock".
     *
     * @param stamp a stamp
     * @return a valid optimistic read stamp, or zero on failure
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long tryConvertToReadLock(long stamp) {

    /**
     * If the lock state matches the given stamp, performs one of
     * the following actions. If the stamp represents holding a write
     * lock, releases it and obtains a read lock.  Or, if a read lock,
     * returns it. Or, if an optimistic read, acquires a read lock and
     * returns a read stamp only if immediately available. This method
     * returns zero in all other cases.
     *
     * @param stamp a stamp
     * @return a valid read stamp, or zero on failure
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long tryConvertToWriteLock(long stamp) {

    /**
     * If the lock state matches the given stamp, performs one of
     * the following actions. If the stamp represents holding a write
     * lock, returns it.  Or, if a read lock, if the write lock is
     * available, releases the read lock and returns a write stamp.
     * Or, if an optimistic read, returns a write stamp only if
     * immediately available. This method returns zero in all other
     * cases.
     *
     * @param stamp a stamp
     * @return a valid write stamp, or zero on failure
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public void unlock(long stamp) {

    /**
     * If the lock state matches the given stamp, releases the
     * corresponding mode of the lock.
     *
     * @param stamp a stamp returned by a lock operation
     * @throws IllegalMonitorStateException if the stamp does
     * not match the current state of this lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public void unlockRead(long stamp) {

    /**
     * If the lock state matches the given stamp, releases the
     * non-exclusive lock.
     *
     * @param stamp a stamp returned by a read-lock operation
     * @throws IllegalMonitorStateException if the stamp does
     * not match the current state of this lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public void unlockWrite(long stamp) {

    /**
     * If the lock state matches the given stamp, releases the
     * exclusive lock.
     *
     * @param stamp a stamp returned by a write-lock operation
     * @throws IllegalMonitorStateException if the stamp does
     * not match the current state of this lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public boolean validate(long stamp) {

    /**
     * Returns true if the lock has not been exclusively acquired
     * since issuance of the given stamp. Always returns false if the
     * stamp is zero. Always returns true if the stamp represents a
     * currently held lock. Invoking this method with a value not
     * obtained from {@link #tryOptimisticRead} or a locking method
     * for this lock has no defined effect or result.
     *
     * @param stamp a stamp
     * @return {@code true} if the lock has not been exclusively acquired
     * since issuance of the given stamp; else false
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long tryOptimisticRead() {

    /**
     * Returns a stamp that can later be validated, or zero
     * if exclusively locked.
     *
     * @return a stamp, or zero if exclusively locked
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long readLockInterruptibly() throws InterruptedException {

    /**
     * Non-exclusively acquires the lock, blocking if necessary
     * until available or the current thread is interrupted.
     * Behavior under interruption matches that specified
     * for method {@link Lock#lockInterruptibly()}.
     *
     * @return a stamp that can be used to unlock or convert mode
     * @throws InterruptedException if the current thread is interrupted
     * before acquiring the lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long tryReadLock(long time, TimeUnit unit)

    /**
     * Non-exclusively acquires the lock if it is available within the
     * given time and the current thread has not been interrupted.
     * Behavior under timeout and interruption matches that specified
     * for method {@link Lock#tryLock(long,TimeUnit)}.
     *
     * @param time the maximum time to wait for the lock
     * @param unit the time unit of the {@code time} argument
     * @return a stamp that can be used to unlock or convert mode,
     * or zero if the lock is not available
     * @throws InterruptedException if the current thread is interrupted
     * before acquiring the lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long tryReadLock() {

    /**
     * Non-exclusively acquires the lock if it is immediately available.
     *
     * @return a stamp that can be used to unlock or convert mode,
     * or zero if the lock is not available
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long readLock() {

    /**
     * Non-exclusively acquires the lock, blocking if necessary
     * until available.
     *
     * @return a stamp that can be used to unlock or convert mode
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long writeLockInterruptibly() throws InterruptedException {

    /**
     * Exclusively acquires the lock, blocking if necessary
     * until available or the current thread is interrupted.
     * Behavior under interruption matches that specified
     * for method {@link Lock#lockInterruptibly()}.
     *
     * @return a stamp that can be used to unlock or convert mode
     * @throws InterruptedException if the current thread is interrupted
     * before acquiring the lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long tryWriteLock(long time, TimeUnit unit)

    /**
     * Exclusively acquires the lock if it is available within the
     * given time and the current thread has not been interrupted.
     * Behavior under timeout and interruption matches that specified
     * for method {@link Lock#tryLock(long,TimeUnit)}.
     *
     * @param time the maximum time to wait for the lock
     * @param unit the time unit of the {@code time} argument
     * @return a stamp that can be used to unlock or convert mode,
     * or zero if the lock is not available
     * @throws InterruptedException if the current thread is interrupted
     * before acquiring the lock
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long tryWriteLock() {

    /**
     * Exclusively acquires the lock if it is immediately available.
     *
     * @return a stamp that can be used to unlock or convert mode,
     * or zero if the lock is not available
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public long writeLock() {

    /**
     * Exclusively acquires the lock, blocking if necessary
     * until available.
     *
     * @return a stamp that can be used to unlock or convert mode
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    public StampedLock() {

    /**
     * Creates a new lock, initially in unlocked state.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private transient int readerOverflow;

    /** extra reader count when state read count saturated */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private transient volatile long state;

    /** Lock sequence/state */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private transient volatile WNode wtail;

    /** Tail (last) of CLH queue */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private transient volatile WNode whead;

    /** Head of CLH queue */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    static final class WNode {

    /** Wait nodes */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private static final int LG_READERS = 7;

    /** The number of bits to use for reader count before overflowing */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private static final int OVERFLOW_YIELD_RATE = 7; // must be power 2 - 1

    /** The period for yielding when waiting for overflow spinlock */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private static final int MAX_HEAD_SPINS = (NCPU > 1) ? 1 << 16 : 0;

    /** Maximum number of retries before re-blocking */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private static final int HEAD_SPINS = (NCPU > 1) ? 1 << 10 : 0;

    /** Maximum number of retries before blocking at head on acquisition */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private static final int SPINS = (NCPU > 1) ? 1 << 6 : 0;

    /** Maximum number of retries before enqueuing on acquisition */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
    private static final int NCPU = Runtime.getRuntime().availableProcessors();

    /** Number of processors, for spin control */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/StampedLock.java
public class StampedLock implements java.io.Serializable {

/**
 * A capability-based lock with three modes for controlling read/write
 * access.  The state of a StampedLock consists of a version and mode.
 * Lock acquisition methods return a stamp that represents and
 * controls access with respect to a lock state; "try" versions of
 * these methods may instead return the special value zero to
 * represent failure to acquire access. Lock release and conversion
 * methods require stamps as arguments, and fail if they do not match
 * the state of the lock. The three modes are:
 *
 * <ul>
 *
 *  <li><b>Writing.</b> Method {@link #writeLock} possibly blocks
 *   waiting for exclusive access, returning a stamp that can be used
 *   in method {@link #unlockWrite} to release the lock. Untimed and
 *   timed versions of {@code tryWriteLock} are also provided. When
 *   the lock is held in write mode, no read locks may be obtained,
 *   and all optimistic read validations will fail.  </li>
 *
 *  <li><b>Reading.</b> Method {@link #readLock} possibly blocks
 *   waiting for non-exclusive access, returning a stamp that can be
 *   used in method {@link #unlockRead} to release the lock. Untimed
 *   and timed versions of {@code tryReadLock} are also provided. </li>
 *
 *  <li><b>Optimistic Reading.</b> Method {@link #tryOptimisticRead}
 *   returns a non-zero stamp only if the lock is not currently held
 *   in write mode. Method {@link #validate} returns true if the lock
 *   has not been acquired in write mode since obtaining a given
 *   stamp.  This mode can be thought of as an extremely weak version
 *   of a read-lock, that can be broken by a writer at any time.  The
 *   use of optimistic mode for short read-only code segments often
 *   reduces contention and improves throughput.  However, its use is
 *   inherently fragile.  Optimistic read sections should only read
 *   fields and hold them in local variables for later use after
 *   validation. Fields read while in optimistic mode may be wildly
 *   inconsistent, so usage applies only when you are familiar enough
 *   with data representations to check consistency and/or repeatedly
 *   invoke method {@code validate()}.  For example, such steps are
 *   typically required when first reading an object or array
 *   reference, and then accessing one of its fields, elements or
 *   methods. </li>
 *
 * </ul>
 *
 * <p>This class also supports methods that conditionally provide
 * conversions across the three modes. For example, method {@link
 * #tryConvertToWriteLock} attempts to "upgrade" a mode, returning
 * a valid write stamp if (1) already in writing mode (2) in reading
 * mode and there are no other readers or (3) in optimistic mode and
 * the lock is available. The forms of these methods are designed to
 * help reduce some of the code bloat that otherwise occurs in
 * retry-based designs.
 *
 * <p>StampedLocks are designed for use as internal utilities in the
 * development of thread-safe components. Their use relies on
 * knowledge of the internal properties of the data, objects, and
 * methods they are protecting.  They are not reentrant, so locked
 * bodies should not call other unknown methods that may try to
 * re-acquire locks (although you may pass a stamp to other methods
 * that can use or convert it).  The use of read lock modes relies on
 * the associated code sections being side-effect-free.  Unvalidated
 * optimistic read sections cannot call methods that are not known to
 * tolerate potential inconsistencies.  Stamps use finite
 * representations, and are not cryptographically secure (i.e., a
 * valid stamp may be guessable). Stamp values may recycle after (no
 * sooner than) one year of continuous operation. A stamp held without
 * use or validation for longer than this period may fail to validate
 * correctly.  StampedLocks are serializable, but always deserialize
 * into initial unlocked state, so they are not useful for remote
 * locking.
 *
 * <p>The scheduling policy of StampedLock does not consistently
 * prefer readers over writers or vice versa.  All "try" methods are
 * best-effort and do not necessarily conform to any scheduling or
 * fairness policy. A zero return from any "try" method for acquiring
 * or converting locks does not carry any information about the state
 * of the lock; a subsequent invocation may succeed.
 *
 * <p>Because it supports coordinated usage across multiple lock
 * modes, this class does not directly implement the {@link Lock} or
 * {@link ReadWriteLock} interfaces. However, a StampedLock may be
 * viewed {@link #asReadLock()}, {@link #asWriteLock()}, or {@link
 * #asReadWriteLock()} in applications requiring only the associated
 * set of functionality.
 *
 * <p><b>Sample Usage.</b> The following illustrates some usage idioms
 * in a class that maintains simple two-dimensional points. The sample
 * code illustrates some try/catch conventions even though they are
 * not strictly needed here because no exceptions can occur in their
 * bodies.<br>
 *
 *  <pre>{@code
 * class Point {
 *   private double x, y;
 *   private final StampedLock sl = new StampedLock();
 *
 *   void move(double deltaX, double deltaY) { // an exclusively locked method
 *     long stamp = sl.writeLock();
 *     try {
 *       x += deltaX;
 *       y += deltaY;
 *     } finally {
 *       sl.unlockWrite(stamp);
 *     }
 *   }
 *
 *   double distanceFromOrigin() { // A read-only method
 *     long stamp = sl.tryOptimisticRead();
 *     double currentX = x, currentY = y;
 *     if (!sl.validate(stamp)) {
 *        stamp = sl.readLock();
 *        try {
 *          currentX = x;
 *          currentY = y;
 *        } finally {
 *           sl.unlockRead(stamp);
 *        }
 *     }
 *     return Math.sqrt(currentX * currentX + currentY * currentY);
 *   }
 *
 *   void moveIfAtOrigin(double newX, double newY) { // upgrade
 *     // Could instead start with optimistic, not read mode
 *     long stamp = sl.readLock();
 *     try {
 *       while (x == 0.0 && y == 0.0) {
 *         long ws = sl.tryConvertToWriteLock(stamp);
 *         if (ws != 0L) {
 *           stamp = ws;
 *           x = newX;
 *           y = newY;
 *           break;
 *         }
 *         else {
 *           sl.unlockRead(stamp);
 *           stamp = sl.writeLock();
 *         }
 *       }
 *     } finally {
 *       sl.unlock(stamp);
 *     }
 *   }
 * }}</pre>
 *
 * @since 1.8
 * @author Doug Lea
 */