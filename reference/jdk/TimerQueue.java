_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/TimerQueue.java
        private volatile long time;

        /** The time the task is enabled to execute in nanoTime units */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/TimerQueue.java
        private final long sequenceNumber;

        /** Sequence number to break ties FIFO */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/TimerQueue.java
        private static final AtomicLong sequencer = new AtomicLong(0);

        /**
         * Sequence number to break scheduling ties, and in turn to
         * guarantee FIFO order among tied entries.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/TimerQueue.java
    private static long now() {

    /**
     * Returns nanosecond time offset by origin
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/TimerQueue.java
    public TimerQueue() {

    /**
     * Constructor for TimerQueue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/TimerQueue.java
    private static final long NANO_ORIGIN = System.nanoTime();

    /** Base of nanosecond timings, to avoid wrapping */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/TimerQueue.java
class TimerQueue implements Runnable

/**
 * Internal class to manage all Timers using one thread.
 * TimerQueue manages a queue of Timers. The Timers are chained
 * together in a linked list sorted by the order in which they will expire.
 *
 * @author Dave Moore
 * @author Igor Kushnirskiy
 */
