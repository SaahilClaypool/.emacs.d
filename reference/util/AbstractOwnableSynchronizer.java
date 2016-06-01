_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/AbstractOwnableSynchronizer.java
    protected final Thread getExclusiveOwnerThread() {

    /**
     * Returns the thread last set by {@code setExclusiveOwnerThread},
     * or {@code null} if never set.  This method does not otherwise
     * impose any synchronization or {@code volatile} field accesses.
     * @return the owner thread
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/AbstractOwnableSynchronizer.java
    protected final void setExclusiveOwnerThread(Thread thread) {

    /**
     * Sets the thread that currently owns exclusive access.
     * A {@code null} argument indicates that no thread owns access.
     * This method does not otherwise impose any synchronization or
     * {@code volatile} field accesses.
     * @param thread the owner thread
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/AbstractOwnableSynchronizer.java
    private transient Thread exclusiveOwnerThread;

    /**
     * The current owner of exclusive mode synchronization.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/AbstractOwnableSynchronizer.java
    protected AbstractOwnableSynchronizer() { }

    /**
     * Empty constructor for use by subclasses.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/AbstractOwnableSynchronizer.java
    private static final long serialVersionUID = 3737899427754241961L;

    /** Use serial ID even though all fields transient. */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//concurrent/locks/AbstractOwnableSynchronizer.java
public abstract class AbstractOwnableSynchronizer

/**
 * A synchronizer that may be exclusively owned by a thread.  This
 * class provides a basis for creating locks and related synchronizers
 * that may entail a notion of ownership.  The
 * {@code AbstractOwnableSynchronizer} class itself does not manage or
 * use this information. However, subclasses and tools may use
 * appropriately maintained values to help control and monitor access
 * and provide diagnostics.
 *
 * @since 1.6
 * @author Doug Lea
 */
