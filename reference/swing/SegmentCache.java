_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
    private static class CachedSegment extends Segment {

    /**
     * CachedSegment is used as a tagging interface to determine if
     * a Segment can successfully be shared.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
    public void releaseSegment(Segment segment) {

    /**
     * Releases a Segment. You should not use a Segment after you release it,
     * and you should NEVER release the same Segment more than once, eg:
     * <pre>
     *   segmentCache.releaseSegment(segment);
     *   segmentCache.releaseSegment(segment);
     * </pre>
     * Will likely result in very bad things happening!
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
    public Segment getSegment() {

    /**
     * Returns a <code>Segment</code>. When done, the <code>Segment</code>
     * should be recycled by invoking <code>releaseSegment</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
    public SegmentCache() {

    /**
     * Creates and returns a SegmentCache.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
    public static void releaseSharedSegment(Segment segment) {

    /**
     * A convenience method to release a Segment to the shared
     * <code>SegmentCache</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
    public static Segment getSharedSegment() {

    /**
     * A convenience method to get a Segment from the shared
     * <code>SegmentCache</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
    public static SegmentCache getSharedInstance() {

    /**
     * Returns the shared SegmentCache.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
    private List<Segment> segments;

    /**
     * A list of the currently unused Segments.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
    private static SegmentCache sharedCache = new SegmentCache();

    /**
     * A global cache.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/SegmentCache.java
class SegmentCache {

/**
 * SegmentCache caches <code>Segment</code>s to avoid continually creating
 * and destroying of <code>Segment</code>s. A common use of this class would
 * be:
 * <pre>
 *   Segment segment = segmentCache.getSegment();
 *   // do something with segment
 *   ...
 *   segmentCache.releaseSegment(segment);
 * </pre>
 *
 */
