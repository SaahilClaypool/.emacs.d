_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  protected AxesWalker m_firstWalker;

  /** The head of the step walker list.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  protected AxesWalker m_lastUsedWalker;

  /** The last used step walker in the walker list.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * This function is used to fixup variables from QNames to stack frame
   * indexes at stylesheet build time.
   * @param vars List of QNames that correspond to variables.  This list
   * should be searched backwards for the first qualified name that
   * corresponds to the variable reference qname.  The position of the
   * QName in the vector from the start of the vector will be its position
   * in the stack frame (but variables above the globalsTop value will need
   * to be offset to the current stack frame).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void detach()

  /**
   *  Detaches the iterator from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state. After<code>detach</code> has been invoked, calls to
   * <code>nextNode</code> or<code>previousNode</code> will raise the
   * exception INVALID_STATE_ERR.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public final AxesWalker getLastUsedWalker()

  /**
   * Get the last used walker.
   *
   * @return The last used walker, or null.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public final void setLastUsedWalker(AxesWalker walker)

  /**
   * Set the last used walker.
   *
   * @param walker The last used walker, or null.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public final void setFirstWalker(AxesWalker walker)

  /**
   * Set the head of the walker list.
   *
   * @param walker Should be a valid AxesWalker.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public final AxesWalker getFirstWalker()

  /**
   * Get the head of the walker list.
   *
   * @return The head of the walker list, or null
   * if this iterator does not implement walkers.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public int nextNode()

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void setRoot(int context, Object environment)

  /**
   * Initialize the context values for this expression
   * after it is cloned.
   *
   * @param context The XPath runtime context for this
   * transformation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void reset()

  /**
   * Reset the iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned WalkingIterator that holds the same
   * position as this iterator.
   *
   * @return A clone of this iterator that holds the same node position.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public WalkingIterator(PrefixResolver nscontext)

  /**
   * Create a WalkingIterator object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  WalkingIterator(
          Compiler compiler, int opPos, int analysis, boolean shouldLoadWalkers)

  /**
   * Create a WalkingIterator iterator, including creation
   * of step walkers from the opcode list, and call back
   * into the Compiler to create predicate expressions.
   *
   * @param compiler The Compiler which is creating
   * this expression.
   * @param opPos The position of this iterator in the
   * opcode list from the compiler.
   * @param shouldLoadWalkers True if walkers should be
   * loaded, or false if this is a derived iterator and
   * it doesn't wish to load child walkers.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
public class WalkingIterator extends LocPathIterator implements ExpressionOwner

/**
 * Location path iterator that uses Walkers.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void setExpression(Expression exp)

  /**
   * @see ExpressionOwner#setExpression(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public Expression getExpression()

  /**
   * @see ExpressionOwner#getExpression()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  protected AxesWalker m_firstWalker;

  /** The head of the step walker list.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  protected AxesWalker m_lastUsedWalker;

  /** The last used step walker in the walker list.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * This function is used to fixup variables from QNames to stack frame
   * indexes at stylesheet build time.
   * @param vars List of QNames that correspond to variables.  This list
   * should be searched backwards for the first qualified name that
   * corresponds to the variable reference qname.  The position of the
   * QName in the vector from the start of the vector will be its position
   * in the stack frame (but variables above the globalsTop value will need
   * to be offset to the current stack frame).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void detach()

  /**
   *  Detaches the iterator from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state. After<code>detach</code> has been invoked, calls to
   * <code>nextNode</code> or<code>previousNode</code> will raise the
   * exception INVALID_STATE_ERR.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public final AxesWalker getLastUsedWalker()

  /**
   * Get the last used walker.
   *
   * @return The last used walker, or null.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public final void setLastUsedWalker(AxesWalker walker)

  /**
   * Set the last used walker.
   *
   * @param walker The last used walker, or null.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public final void setFirstWalker(AxesWalker walker)

  /**
   * Set the head of the walker list.
   *
   * @param walker Should be a valid AxesWalker.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public final AxesWalker getFirstWalker()

  /**
   * Get the head of the walker list.
   *
   * @return The head of the walker list, or null
   * if this iterator does not implement walkers.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public int nextNode()

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void setRoot(int context, Object environment)

  /**
   * Initialize the context values for this expression
   * after it is cloned.
   *
   * @param context The XPath runtime context for this
   * transformation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public void reset()

  /**
   * Reset the iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned WalkingIterator that holds the same
   * position as this iterator.
   *
   * @return A clone of this iterator that holds the same node position.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  public WalkingIterator(PrefixResolver nscontext)

  /**
   * Create a WalkingIterator object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
  WalkingIterator(
          Compiler compiler, int opPos, int analysis, boolean shouldLoadWalkers)

  /**
   * Create a WalkingIterator iterator, including creation
   * of step walkers from the opcode list, and call back
   * into the Compiler to create predicate expressions.
   *
   * @param compiler The Compiler which is creating
   * this expression.
   * @param opPos The position of this iterator in the
   * opcode list from the compiler.
   * @param shouldLoadWalkers True if walkers should be
   * loaded, or false if this is a derived iterator and
   * it doesn't wish to load child walkers.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIterator.java
public class WalkingIterator extends LocPathIterator implements ExpressionOwner

/**
 * Location path iterator that uses Walkers.
 */
