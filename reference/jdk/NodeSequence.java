_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
    protected IteratorCache getIteratorCache() {

    /**
     * Get the cached list of nodes appended with
     * values obtained from the iterator as
     * a NodeSequence is walked when its
     * nextNode() method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private boolean isComplete() {

        /**
         * Returns true if no cache is complete
         * and immutable.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private void setCacheComplete(boolean b) {

        /**
         * Call this method with 'true' if the
         * iterator is exhausted and the cached list
         * is complete, or no longer growing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private NodeVector getVector() {

        /**
         * Get the cached list of nodes obtained from
         * the iterator so far.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private void setVector(NodeVector nv) {

        /**
         * Sets the NodeVector that holds the
         * growing list of nodes as they are appended
         * to the cached list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private void increaseUseCount() {

        /**
         * This method is called when yet another
         * NodeSequence object uses, or shares
         * this same cache.
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private int useCount() {

        /**
         * Returns count of how many NodeSequence objects share this
         * IteratorCache object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private boolean m_isComplete2;

        /**
         * true if the associated iterator is exhausted and
         * all nodes obtained from it are in the cache.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
   private final static class IteratorCache {

   /**
    * Each NodeSequence object has an iterator which is "walked".
    * As an iterator is walked one obtains nodes from it.
    * As those nodes are obtained they may be cached, making
    * the next walking of a copy or clone of the iterator faster.
    * This field (m_cache) is a reference to such a cache,
    * which is populated as the iterator is walked.
    * <p>
    * Note that multiple NodeSequence objects may hold a
    * reference to the same cache, and also
    * (and this is important) the same iterator.
    * The iterator and its cache may be shared among
    * many NodeSequence objects.
    * <p>
    * If one of the NodeSequence objects walks ahead
    * of the others it fills in the cache.
    * As the others NodeSequence objects catch up they
    * get their values from
    * the cache rather than the iterator itself, so
    * the iterator is only ever walked once and everyone
    * benefits from the cache.
    * <p>
    * At some point the cache may be
    * complete due to walking to the end of one of
    * the copies of the iterator, and the cache is
    * then marked as "complete".
    * and the cache will have no more nodes added to it.
    * <p>
    * Its use-count is the number of NodeSequence objects that use it.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
   protected void setObject(Object obj) {

   /**
    * It used to be that many locations in the code simply
    * did an assignment to this.m_obj directly, rather than
    * calling the setObject(Object) method. The problem is
    * that our super-class would be updated on what the
    * cache associated with this NodeSequence, but
    * we wouldn't know ourselves.
    * <p>
    * All setting of m_obj is done through setObject() now,
    * and this method over-rides the super-class method.
    * So now we are in the loop have an opportunity
    * to update some caching information.
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
   protected int addNodeInDocOrder(int node)

  /**
   * Add the node into a vector of nodes where it should occur in
   * document order.
   * @param node The node to be added.
   * @return insertIndex.
   * @throws RuntimeException thrown if this NodeSetDTM is not of
   * a mutable type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void fixupVariables(Vector vars, int globalsSize)

  /**
   * @see org.apache.xpath.Expression#fixupVariables(Vector, int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getAnalysisBits()

  /**
   * @see PathComponent#getAnalysisBits()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getAxis()

  /**
   * @see DTMIterator#getAxis()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean isDocOrdered()

  /**
   * @see DTMIterator#isDocOrdered()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a clone of this iterator, but don't reset the iteration in the
   * process, so that it may be used from the current position.
   * Note: Not a deep clone.
   *
   * @return A clone of this object.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public DTMIterator cloneWithReset() throws CloneNotSupportedException

  /**
   * Note: Not a deep clone.
   * @see DTMIterator#cloneWithReset()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getLength()

  /**
   * @see DTMIterator#getLength()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void setItem(int node, int index)

  /**
   * @see DTMIterator#setItem(int, int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int item(int index)

  /**
   * @see DTMIterator#item(int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void setCurrentPos(int i)

  /**
   * @see DTMIterator#setCurrentPos(int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void runTo(int index)

  /**
   * @see DTMIterator#runTo(int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getCurrentPos()

  /**
   * @see DTMIterator#getCurrentPos()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean isMutable()

  /**
   * @see DTMIterator#isMutable()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void setShouldCacheNodes(boolean b)

  /**
   * @see DTMIterator#setShouldCacheNodes(boolean)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean isFresh()

  /**
   * @see DTMIterator#isFresh()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getCurrentNode()

  /**
   * @see DTMIterator#getCurrentNode()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void allowDetachToRelease(boolean allowRelease)

  /**
   * Calling this with a value of false will cause the nodeset
   * to be cached.
   * @see DTMIterator#allowDetachToRelease(boolean)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void detach()

  /**
   * @see DTMIterator#detach()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int previousNode()

  /**
   * @see DTMIterator#previousNode()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int nextNode()

  /**
   * @see DTMIterator#nextNode()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean getExpandEntityReferences()

  /**
   * @see DTMIterator#getExpandEntityReferences()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getWhatToShow()

  /**
   * @see DTMIterator#getWhatToShow()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void reset()

  /**
   * @see DTMIterator#reset()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void setRoot(int nodeHandle, Object environment)

  /**
   * @see DTMIterator#setRoot(int, Object)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getRoot()

  /**
   * @see DTMIterator#getRoot()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public DTMManager getDTMManager()

  /**
   * @see DTMIterator#getDTMManager()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public DTM getDTM(int nodeHandle)

  /**
   * @see DTMIterator#getDTM(int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public NodeSequence()

  /**
   * Create a new NodeSequence in an invalid (null) state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private NodeSequence(DTMManager dtmMgr)

  /**
   * Construct an empty XNodeSet object.  This is used to create a mutable
   * nodeset to which random nodes may be added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public NodeSequence(Object nodeVector)

  /**
   * Create a new NodeSequence from a (already cloned) iterator.
   *
   * @param nodeVector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private NodeSequence(DTMIterator iter, int context, XPathContext xctxt, boolean shouldCacheNodes)

  /**
   * Create a new NodeSequence from a (already cloned) iterator.
   *
   * @param iter Cloned (not static) DTMIterator.
   * @param context The initial context node.
   * @param xctxt The execution context.
   * @param shouldCacheNodes True if this sequence can random access.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected DTMManager m_dtmMgr;

  /**
   * The DTMManager to use if we're using a NodeVector only.
   * We may well want to do away with this, and store it in the NodeVector.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public final DTMIterator getContainedIter()

  /**
   * Get the functional iterator that fetches nodes.
   * @return The contained iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public final void setIter(DTMIterator iter)

  /**
   * Set the functional iterator that fetches nodes.
   * @param iter The iterator that is to be contained.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected DTMIterator m_iter;

  /**
   * The functional iterator that fetches nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private void markCacheComplete() {

  /**
   * If this NodeSequence has a cache, mark that it is complete.
   * This method should be called after the iterator is exhausted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private boolean cacheComplete() {

  /**
   * If this NodeSequence has a cache, and that cache is
   * fully populated then this method returns true, otherwise
   * if there is no cache or it is not complete it returns false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean hasCache()

  /**
   * If the iterator needs to cache nodes as they are fetched,
   * then this method returns true.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected void SetVector(NodeVector v)

  /**
   * Set the vector where nodes will be cached.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private IteratorCache getCache() {

  /**
   * Get the cache (if any) of nodes obtained from
   * the iterator so far. Note that the cache keeps
   * growing until the iterator is walked to exhaustion,
   * at which point the cache is "complete".
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected NodeVector getVector() {

  /**
   * If this iterator needs to cache nodes that are fetched, they
   * are stored in the Vector in the generic object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private IteratorCache m_cache;

  /**
   * A cache of a list of nodes obtained from the iterator so far.
   * This list is appended to until the iterator is exhausted and
   * the cache is complete.
   * <p>
   * Multiple NodeSequence objects may share the same cache.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected int m_next = 0;

  /**
   * The index of the next node to be fetched.  Useful if this
   * is a cached iterator, and is being used as random access
   * NodeList.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected int m_last = -1;

  /** The index of the last node in the iteration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
public class NodeSequence extends XObject

/**
 * This class is the dynamic wrapper for a Xalan DTMIterator instance, and
 * provides random access capabilities.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
    protected IteratorCache getIteratorCache() {

    /**
     * Get the cached list of nodes appended with
     * values obtained from the iterator as
     * a NodeSequence is walked when its
     * nextNode() method is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private boolean isComplete() {

        /**
         * Returns true if no cache is complete
         * and immutable.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private void setCacheComplete(boolean b) {

        /**
         * Call this method with 'true' if the
         * iterator is exhausted and the cached list
         * is complete, or no longer growing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private NodeVector getVector() {

        /**
         * Get the cached list of nodes obtained from
         * the iterator so far.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private void setVector(NodeVector nv) {

        /**
         * Sets the NodeVector that holds the
         * growing list of nodes as they are appended
         * to the cached list.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private void increaseUseCount() {

        /**
         * This method is called when yet another
         * NodeSequence object uses, or shares
         * this same cache.
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private int useCount() {

        /**
         * Returns count of how many NodeSequence objects share this
         * IteratorCache object.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
        private boolean m_isComplete2;

        /**
         * true if the associated iterator is exhausted and
         * all nodes obtained from it are in the cache.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
   private final static class IteratorCache {

   /**
    * Each NodeSequence object has an iterator which is "walked".
    * As an iterator is walked one obtains nodes from it.
    * As those nodes are obtained they may be cached, making
    * the next walking of a copy or clone of the iterator faster.
    * This field (m_cache) is a reference to such a cache,
    * which is populated as the iterator is walked.
    * <p>
    * Note that multiple NodeSequence objects may hold a
    * reference to the same cache, and also
    * (and this is important) the same iterator.
    * The iterator and its cache may be shared among
    * many NodeSequence objects.
    * <p>
    * If one of the NodeSequence objects walks ahead
    * of the others it fills in the cache.
    * As the others NodeSequence objects catch up they
    * get their values from
    * the cache rather than the iterator itself, so
    * the iterator is only ever walked once and everyone
    * benefits from the cache.
    * <p>
    * At some point the cache may be
    * complete due to walking to the end of one of
    * the copies of the iterator, and the cache is
    * then marked as "complete".
    * and the cache will have no more nodes added to it.
    * <p>
    * Its use-count is the number of NodeSequence objects that use it.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
   protected void setObject(Object obj) {

   /**
    * It used to be that many locations in the code simply
    * did an assignment to this.m_obj directly, rather than
    * calling the setObject(Object) method. The problem is
    * that our super-class would be updated on what the
    * cache associated with this NodeSequence, but
    * we wouldn't know ourselves.
    * <p>
    * All setting of m_obj is done through setObject() now,
    * and this method over-rides the super-class method.
    * So now we are in the loop have an opportunity
    * to update some caching information.
    *
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
   protected int addNodeInDocOrder(int node)

  /**
   * Add the node into a vector of nodes where it should occur in
   * document order.
   * @param node The node to be added.
   * @return insertIndex.
   * @throws RuntimeException thrown if this NodeSetDTM is not of
   * a mutable type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void fixupVariables(Vector vars, int globalsSize)

  /**
   * @see org.apache.xpath.Expression#fixupVariables(Vector, int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getAnalysisBits()

  /**
   * @see PathComponent#getAnalysisBits()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getAxis()

  /**
   * @see DTMIterator#getAxis()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean isDocOrdered()

  /**
   * @see DTMIterator#isDocOrdered()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a clone of this iterator, but don't reset the iteration in the
   * process, so that it may be used from the current position.
   * Note: Not a deep clone.
   *
   * @return A clone of this object.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public DTMIterator cloneWithReset() throws CloneNotSupportedException

  /**
   * Note: Not a deep clone.
   * @see DTMIterator#cloneWithReset()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getLength()

  /**
   * @see DTMIterator#getLength()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void setItem(int node, int index)

  /**
   * @see DTMIterator#setItem(int, int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int item(int index)

  /**
   * @see DTMIterator#item(int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void setCurrentPos(int i)

  /**
   * @see DTMIterator#setCurrentPos(int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void runTo(int index)

  /**
   * @see DTMIterator#runTo(int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getCurrentPos()

  /**
   * @see DTMIterator#getCurrentPos()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean isMutable()

  /**
   * @see DTMIterator#isMutable()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void setShouldCacheNodes(boolean b)

  /**
   * @see DTMIterator#setShouldCacheNodes(boolean)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean isFresh()

  /**
   * @see DTMIterator#isFresh()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getCurrentNode()

  /**
   * @see DTMIterator#getCurrentNode()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void allowDetachToRelease(boolean allowRelease)

  /**
   * Calling this with a value of false will cause the nodeset
   * to be cached.
   * @see DTMIterator#allowDetachToRelease(boolean)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void detach()

  /**
   * @see DTMIterator#detach()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int previousNode()

  /**
   * @see DTMIterator#previousNode()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int nextNode()

  /**
   * @see DTMIterator#nextNode()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean getExpandEntityReferences()

  /**
   * @see DTMIterator#getExpandEntityReferences()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getWhatToShow()

  /**
   * @see DTMIterator#getWhatToShow()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void reset()

  /**
   * @see DTMIterator#reset()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public void setRoot(int nodeHandle, Object environment)

  /**
   * @see DTMIterator#setRoot(int, Object)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public int getRoot()

  /**
   * @see DTMIterator#getRoot()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public DTMManager getDTMManager()

  /**
   * @see DTMIterator#getDTMManager()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public DTM getDTM(int nodeHandle)

  /**
   * @see DTMIterator#getDTM(int)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public NodeSequence()

  /**
   * Create a new NodeSequence in an invalid (null) state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private NodeSequence(DTMManager dtmMgr)

  /**
   * Construct an empty XNodeSet object.  This is used to create a mutable
   * nodeset to which random nodes may be added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public NodeSequence(Object nodeVector)

  /**
   * Create a new NodeSequence from a (already cloned) iterator.
   *
   * @param nodeVector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private NodeSequence(DTMIterator iter, int context, XPathContext xctxt, boolean shouldCacheNodes)

  /**
   * Create a new NodeSequence from a (already cloned) iterator.
   *
   * @param iter Cloned (not static) DTMIterator.
   * @param context The initial context node.
   * @param xctxt The execution context.
   * @param shouldCacheNodes True if this sequence can random access.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected DTMManager m_dtmMgr;

  /**
   * The DTMManager to use if we're using a NodeVector only.
   * We may well want to do away with this, and store it in the NodeVector.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public final DTMIterator getContainedIter()

  /**
   * Get the functional iterator that fetches nodes.
   * @return The contained iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public final void setIter(DTMIterator iter)

  /**
   * Set the functional iterator that fetches nodes.
   * @param iter The iterator that is to be contained.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected DTMIterator m_iter;

  /**
   * The functional iterator that fetches nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private void markCacheComplete() {

  /**
   * If this NodeSequence has a cache, mark that it is complete.
   * This method should be called after the iterator is exhausted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private boolean cacheComplete() {

  /**
   * If this NodeSequence has a cache, and that cache is
   * fully populated then this method returns true, otherwise
   * if there is no cache or it is not complete it returns false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  public boolean hasCache()

  /**
   * If the iterator needs to cache nodes as they are fetched,
   * then this method returns true.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected void SetVector(NodeVector v)

  /**
   * Set the vector where nodes will be cached.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private IteratorCache getCache() {

  /**
   * Get the cache (if any) of nodes obtained from
   * the iterator so far. Note that the cache keeps
   * growing until the iterator is walked to exhaustion,
   * at which point the cache is "complete".
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected NodeVector getVector() {

  /**
   * If this iterator needs to cache nodes that are fetched, they
   * are stored in the Vector in the generic object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  private IteratorCache m_cache;

  /**
   * A cache of a list of nodes obtained from the iterator so far.
   * This list is appended to until the iterator is exhausted and
   * the cache is complete.
   * <p>
   * Multiple NodeSequence objects may share the same cache.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected int m_next = 0;

  /**
   * The index of the next node to be fetched.  Useful if this
   * is a cached iterator, and is being used as random access
   * NodeList.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
  protected int m_last = -1;

  /** The index of the last node in the iteration. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/NodeSequence.java
public class NodeSequence extends XObject

/**
 * This class is the dynamic wrapper for a Xalan DTMIterator instance, and
 * provides random access capabilities.
 */
