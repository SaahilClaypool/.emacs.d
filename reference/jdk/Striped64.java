_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    final void doubleAccumulate(double x, DoubleBinaryOperator fn,
                                boolean wasUncontended) {

    /**
     * Same as longAccumulate, but injecting long/double conversions
     * in too many places to sensibly merge with long version, given
     * the low-overhead requirements of this class. So must instead be
     * maintained by copy/paste/adapt.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    final void longAccumulate(long x, LongBinaryOperator fn,
                              boolean wasUncontended) {

    /**
     * Handles cases of updates involving initialization, resizing,
     * creating new Cells, and/or contention. See above for
     * explanation. This method suffers the usual non-modularity
     * problems of optimistic retry code, relying on rechecked sets of
     * reads.
     *
     * @param x the value
     * @param fn the update function, or null for add (this convention
     * avoids the need for an extra field or function in LongAdder).
     * @param wasUncontended false if CAS failed before call
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    static final int advanceProbe(int probe) {

    /**
     * Pseudo-randomly advances and records the given probe value for the
     * given thread.
     * Duplicated from ThreadLocalRandom because of packaging restrictions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    static final int getProbe() {

    /**
     * Returns the probe value for the current thread.
     * Duplicated from ThreadLocalRandom because of packaging restrictions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    final boolean casCellsBusy() {

    /**
     * CASes the cellsBusy field from 0 to 1 to acquire lock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    final boolean casBase(long cmp, long val) {

    /**
     * CASes the base field.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    Striped64() {

    /**
     * Package-private default constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    transient volatile int cellsBusy;

    /**
     * Spinlock (locked via CAS) used when resizing and/or creating Cells.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    transient volatile long base;

    /**
     * Base value, used mainly when there is no contention, but also as
     * a fallback during table initialization races. Updated via CAS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    transient volatile Cell[] cells;

    /**
     * Table of cells. When non-null, size is a power of 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    /** Number of CPUS, to place bound on table size */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
    @sun.misc.Contended static final class Cell {

    /**
     * Padded variant of AtomicLong supporting only raw accesses plus CAS.
     *
     * JVM intrinsics note: It would be possible to use a release-only
     * form of CAS here, if it were provided.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/atomic/Striped64.java
@SuppressWarnings("serial")

/**
 * A package-local class holding common representation and mechanics
 * for classes supporting dynamic striping on 64bit values. The class
 * extends Number so that concrete subclasses must publicly do so.
 */
