_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  protected DTMAxisTraverser m_traverser;

  /** The DTM inner traversal class, that corresponds to the super axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  protected int m_axis = -1;

  /** The traversal axis from where the nodes will be filtered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  AxesWalker m_prevWalker;

  /** The previous walker in the location step chain, or null.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  protected AxesWalker m_nextWalker;

  /** The next walker in the location step chain.
   *  @serial  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  transient boolean m_isFresh;

  /** True if an itteration has not begun.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  private transient int m_currentNode = DTM.NULL;

  /**
   *  The node at which the TreeWalker is currently positioned.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  transient int m_root = DTM.NULL;

  /**
   *  The root node of the TreeWalker, as specified when it was created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * This will traverse the heararchy, calling the visitor for
   * each member.  If the called visitor method returns
   * false, the subtree should not be called.
   *
   * @param owner The owner of the visitor, where that path may be
   *              rewritten if needed.
   * @param visitor The visitor whose appropriate method will be called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   * Warning: This can only be called after setRoot has been called!
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public DTM getDTM(int node)

  /**
   * Get the DTM for this walker.
   *
   * @return Non-null reference to a DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setDefaultDTM(DTM dtm)

  /**
   * Set the DTM for this walker.
   *
   * @param dtm Non-null reference to a DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  private DTM m_dtm;

  /**
   * The DTM for the root.  This can not be used, or must be changed,
   * for the filter walker, or any walker that can have nodes
   * from multiple documents.
   * Never, ever, access this value without going through getDTM(int node).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the index of the last node that can be itterated to.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the index of the last node that can be itterated to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int nextNode()

  /**
   *  Moves the <code>TreeWalker</code> to the next visible node in document
   * order relative to the current node, and returns the new node. If the
   * current node has no next node,  or if the search for nextNode attempts
   * to step upward from the TreeWalker's root node, returns
   * <code>null</code> , and retains the current node.
   * @return  The new node, or <code>null</code> if the current node has no
   *   next node  in the TreeWalker's logical view.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  protected int getNextNode()

  /**
   * Get the next node in document order on the axes.
   *
   * @return the next node in document order on the axes, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  private int returnNextNode(int n)

  /**
   * This is simply a way to bottle-neck the return of the next node, for
   * diagnostic purposes.
   *
   * @param n Node to return, or null.
   *
   * @return The argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public AxesWalker getPrevWalker()

  /**
   * Get the previous walker reference in the location step chain.
   *
   *
   * @return Reference to previous walker reference in the location
   *               step chain, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setPrevWalker(AxesWalker walker)

  /**
   * Set or clear the previous walker reference in the location step chain.
   *
   *
   * @param walker Reference to previous walker reference in the location
   *               step chain, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public AxesWalker getNextWalker()

  /**
   * Get the next walker in the location step chain.
   *
   *
   * @return Reference to AxesWalker derivative, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setNextWalker(AxesWalker walker)

  /**
   * Set the next walker in the location step chain.
   *
   *
   * @param walker Reference to AxesWalker derivative, or may be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public final int getCurrentNode()

  /**
   * The node at which the TreeWalker is currently positioned.
   * <br> The value must not be null. Alterations to the DOM tree may cause
   * the current node to no longer be accepted by the TreeWalker's
   * associated filter. currentNode may also be explicitly set to any node,
   * whether or not it is within the subtree specified by the root node or
   * would be accepted by the filter and whatToShow flags. Further
   * traversal occurs relative to currentNode even if it is not part of the
   * current view by applying the filters in the requested direction (not
   * changing currentNode where no traversal is possible).
   *
   * @return The node at which the TreeWalker is currently positioned, only null
   * if setRoot has not yet been called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setRoot(int root)

  /**
   * Set the root node of the TreeWalker.
   * (Not part of the DOM2 TreeWalker interface).
   *
   * @param root The context node of this step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int getRoot()

  /**
   * The root node of the TreeWalker, as specified in setRoot(int root).
   * Note that this may actually be below the current node.
   *
   * @return The context node of the step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void detach()

  /**
   * Detaches the walker from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  static AxesWalker findClone(AxesWalker key, Vector cloneList)

  /**
   * Find a clone that corresponds to the key argument.
   *
   * @param key The original AxesWalker for which there may be a clone.
   * @param cloneList vector of sources in odd elements, and the
   *                  corresponding clones in even vectors, may be null.
   *
   * @return A clone that corresponds to the key, or null if key not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  AxesWalker cloneDeep(WalkingIterator cloneOwner, Vector cloneList)

  /**
   * Do a deep clone of this walker, including next and previous walkers.
   * If the this AxesWalker is on the clone list, don't clone but
   * return the already cloned version.
   *
   * @param cloneOwner non-null reference to the cloned location path
   *                   iterator to which this clone will be added.
   * @param cloneList non-null vector of sources in odd elements, and the
   *                  corresponding clones in even vectors.
   *
   * @return non-null clone, which may be a new clone, or may be a clone
   *         contained on the cloneList.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned AxesWalker.
   *
   * @return A new AxesWalker that can be used without mutating this one.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void init(Compiler compiler, int opPos, int stepType)

  /**
   * Initialize an AxesWalker during the parse of the XPath expression.
   *
   * @param compiler The Compiler object that has information about this
   *                 walker in the op map.
   * @param opPos The op code position of this location step.
   * @param stepType  The type of location step.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public AxesWalker(LocPathIterator locPathIterator, int axis)

  /**
   * Construct an AxesWalker using a LocPathIterator.
   *
   * @param locPathIterator non-null reference to the parent iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
public class AxesWalker extends PredicatedNodeTest

/**
 * Serves as common interface for axes Walkers, and stores common
 * state variables.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  protected DTMAxisTraverser m_traverser;

  /** The DTM inner traversal class, that corresponds to the super axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  protected int m_axis = -1;

  /** The traversal axis from where the nodes will be filtered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  AxesWalker m_prevWalker;

  /** The previous walker in the location step chain, or null.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  protected AxesWalker m_nextWalker;

  /** The next walker in the location step chain.
   *  @serial  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  transient boolean m_isFresh;

  /** True if an itteration has not begun.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  private transient int m_currentNode = DTM.NULL;

  /**
   *  The node at which the TreeWalker is currently positioned.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  transient int m_root = DTM.NULL;

  /**
   *  The root node of the TreeWalker, as specified when it was created.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * This will traverse the heararchy, calling the visitor for
   * each member.  If the called visitor method returns
   * false, the subtree should not be called.
   *
   * @param owner The owner of the visitor, where that path may be
   *              rewritten if needed.
   * @param visitor The visitor whose appropriate method will be called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   * Warning: This can only be called after setRoot has been called!
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public DTM getDTM(int node)

  /**
   * Get the DTM for this walker.
   *
   * @return Non-null reference to a DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setDefaultDTM(DTM dtm)

  /**
   * Set the DTM for this walker.
   *
   * @param dtm Non-null reference to a DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  private DTM m_dtm;

  /**
   * The DTM for the root.  This can not be used, or must be changed,
   * for the filter walker, or any walker that can have nodes
   * from multiple documents.
   * Never, ever, access this value without going through getDTM(int node).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the index of the last node that can be itterated to.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the index of the last node that can be itterated to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int nextNode()

  /**
   *  Moves the <code>TreeWalker</code> to the next visible node in document
   * order relative to the current node, and returns the new node. If the
   * current node has no next node,  or if the search for nextNode attempts
   * to step upward from the TreeWalker's root node, returns
   * <code>null</code> , and retains the current node.
   * @return  The new node, or <code>null</code> if the current node has no
   *   next node  in the TreeWalker's logical view.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  protected int getNextNode()

  /**
   * Get the next node in document order on the axes.
   *
   * @return the next node in document order on the axes, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  private int returnNextNode(int n)

  /**
   * This is simply a way to bottle-neck the return of the next node, for
   * diagnostic purposes.
   *
   * @param n Node to return, or null.
   *
   * @return The argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public AxesWalker getPrevWalker()

  /**
   * Get the previous walker reference in the location step chain.
   *
   *
   * @return Reference to previous walker reference in the location
   *               step chain, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setPrevWalker(AxesWalker walker)

  /**
   * Set or clear the previous walker reference in the location step chain.
   *
   *
   * @param walker Reference to previous walker reference in the location
   *               step chain, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public AxesWalker getNextWalker()

  /**
   * Get the next walker in the location step chain.
   *
   *
   * @return Reference to AxesWalker derivative, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setNextWalker(AxesWalker walker)

  /**
   * Set the next walker in the location step chain.
   *
   *
   * @param walker Reference to AxesWalker derivative, or may be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public final int getCurrentNode()

  /**
   * The node at which the TreeWalker is currently positioned.
   * <br> The value must not be null. Alterations to the DOM tree may cause
   * the current node to no longer be accepted by the TreeWalker's
   * associated filter. currentNode may also be explicitly set to any node,
   * whether or not it is within the subtree specified by the root node or
   * would be accepted by the filter and whatToShow flags. Further
   * traversal occurs relative to currentNode even if it is not part of the
   * current view by applying the filters in the requested direction (not
   * changing currentNode where no traversal is possible).
   *
   * @return The node at which the TreeWalker is currently positioned, only null
   * if setRoot has not yet been called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void setRoot(int root)

  /**
   * Set the root node of the TreeWalker.
   * (Not part of the DOM2 TreeWalker interface).
   *
   * @param root The context node of this step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public int getRoot()

  /**
   * The root node of the TreeWalker, as specified in setRoot(int root).
   * Note that this may actually be below the current node.
   *
   * @return The context node of the step.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void detach()

  /**
   * Detaches the walker from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  static AxesWalker findClone(AxesWalker key, Vector cloneList)

  /**
   * Find a clone that corresponds to the key argument.
   *
   * @param key The original AxesWalker for which there may be a clone.
   * @param cloneList vector of sources in odd elements, and the
   *                  corresponding clones in even vectors, may be null.
   *
   * @return A clone that corresponds to the key, or null if key not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  AxesWalker cloneDeep(WalkingIterator cloneOwner, Vector cloneList)

  /**
   * Do a deep clone of this walker, including next and previous walkers.
   * If the this AxesWalker is on the clone list, don't clone but
   * return the already cloned version.
   *
   * @param cloneOwner non-null reference to the cloned location path
   *                   iterator to which this clone will be added.
   * @param cloneList non-null vector of sources in odd elements, and the
   *                  corresponding clones in even vectors.
   *
   * @return non-null clone, which may be a new clone, or may be a clone
   *         contained on the cloneList.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned AxesWalker.
   *
   * @return A new AxesWalker that can be used without mutating this one.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public void init(Compiler compiler, int opPos, int stepType)

  /**
   * Initialize an AxesWalker during the parse of the XPath expression.
   *
   * @param compiler The Compiler object that has information about this
   *                 walker in the op map.
   * @param opPos The op code position of this location step.
   * @param stepType  The type of location step.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
  public AxesWalker(LocPathIterator locPathIterator, int axis)

  /**
   * Construct an AxesWalker using a LocPathIterator.
   *
   * @param locPathIterator non-null reference to the parent iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/AxesWalker.java
public class AxesWalker extends PredicatedNodeTest

/**
 * Serves as common interface for axes Walkers, and stores common
 * state variables.
 */
