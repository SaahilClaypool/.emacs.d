_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class FJDouble {

    /** double support class */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class FJFloat {

    /** float support class */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class FJLong {

    /** long support class */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class FJInt {

    /** int support class */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class FJShort {

    /** short support class */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class FJChar {

    /** char support class */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class FJByte {

    /** byte support class */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class FJObject {

    /** Object + Comparator support class */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class Relay extends CountedCompleter<Void> {

    /**
     * A trigger for secondary merge of two merges
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
    static final class EmptyCompleter extends CountedCompleter<Void> {

    /**
     * A placeholder task for Sorters, used for the lowest
     * quartile task, that does not need to maintain array state.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//ArraysParallelSortHelpers.java
/*package*/ class ArraysParallelSortHelpers {

/**
 * Helper utilities for the parallel sort methods in Arrays.parallelSort.
 *
 * For each primitive type, plus Object, we define a static class to
 * contain the Sorter and Merger implementations for that type:
 *
 * Sorter classes based mainly on CilkSort
 * <A href="http://supertech.lcs.mit.edu/cilk/"> Cilk</A>:
 * Basic algorithm:
 * if array size is small, just use a sequential quicksort (via Arrays.sort)
 *         Otherwise:
 *         1. Break array in half.
 *         2. For each half,
 *             a. break the half in half (i.e., quarters),
 *             b. sort the quarters
 *             c. merge them together
 *         3. merge together the two halves.
 *
 * One reason for splitting in quarters is that this guarantees that
 * the final sort is in the main array, not the workspace array.
 * (workspace and main swap roles on each subsort step.)  Leaf-level
 * sorts use the associated sequential sort.
 *
 * Merger classes perform merging for Sorter.  They are structured
 * such that if the underlying sort is stable (as is true for
 * TimSort), then so is the full sort.  If big enough, they split the
 * largest of the two partitions in half, find the greatest point in
 * smaller partition less than the beginning of the second half of
 * larger via binary search; and then merge in parallel the two
 * partitions.  In part to ensure tasks are triggered in
 * stability-preserving order, the current CountedCompleter design
 * requires some little tasks to serve as place holders for triggering
 * completion tasks.  These classes (EmptyCompleter and Relay) don't
 * need to keep track of the arrays, and are never themselves forked,
 * so don't hold any task state.
 *
 * The primitive class versions (FJByte... FJDouble) are
 * identical to each other except for type declarations.
 *
 * The base sequential sorts rely on non-public versions of TimSort,
 * ComparableTimSort, and DualPivotQuicksort sort methods that accept
 * temp workspace array slices that we will have already allocated, so
 * avoids redundant allocation. (Except for DualPivotQuicksort byte[]
 * sort, that does not ever use a workspace array.)
 */
