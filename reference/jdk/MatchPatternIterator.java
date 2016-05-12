_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  public short acceptNode(int n, XPathContext xctxt)

  /**
   *  Test whether a specified node is visible in the logical view of a
   * TreeWalker or NodeIterator. This function will be called by the
   * implementation of TreeWalker and NodeIterator; it is not intended to
   * be called directly from user code.
   * @param n  The node to check to see if it passes the filter or not.
   * @return  a constant to determine whether the node is accepted,
   *   rejected, or skipped, as defined  above .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  protected int getNextNode()

  /**
   * Get the next node via getNextXXX.  Bottlenecked for derived class override.
   * @return The next node on the axis, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  MatchPatternIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a LocPathIterator object, including creation
   * of step walkers from the opcode list, and call back
   * into the Compiler to create predicate expressions.
   *
   * @param compiler The Compiler which is creating
   * this expression.
   * @param opPos The position of this iterator in the
   * opcode list from the compiler.
   * @param analysis Analysis bits that give general information about the
   * LocationPath.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  private static final boolean DEBUG = false;

  /** DEBUG flag for diagnostic dumps. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  protected DTMAxisTraverser m_traverser;

  /** The DTM inner traversal class, that corresponds to the super axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  protected int m_superAxis = -1;

  /** The traversal axis from where the nodes will be filtered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  protected StepPattern m_pattern;

  /** This is the select pattern, translated into a match pattern. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
public class MatchPatternIterator extends LocPathIterator

/**
 * This class treats a
 * <a href="http://www.w3.org/TR/xpath#location-paths">LocationPath</a> as a
 * filtered iteration over the tree, evaluating each node in a super axis
 * traversal against the LocationPath interpreted as a match pattern.  This
 * class is useful to find nodes in document order that are complex paths
 * whose steps probably criss-cross each other.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  public short acceptNode(int n, XPathContext xctxt)

  /**
   *  Test whether a specified node is visible in the logical view of a
   * TreeWalker or NodeIterator. This function will be called by the
   * implementation of TreeWalker and NodeIterator; it is not intended to
   * be called directly from user code.
   * @param n  The node to check to see if it passes the filter or not.
   * @return  a constant to determine whether the node is accepted,
   *   rejected, or skipped, as defined  above .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  protected int getNextNode()

  /**
   * Get the next node via getNextXXX.  Bottlenecked for derived class override.
   * @return The next node on the axis, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  MatchPatternIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a LocPathIterator object, including creation
   * of step walkers from the opcode list, and call back
   * into the Compiler to create predicate expressions.
   *
   * @param compiler The Compiler which is creating
   * this expression.
   * @param opPos The position of this iterator in the
   * opcode list from the compiler.
   * @param analysis Analysis bits that give general information about the
   * LocationPath.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  private static final boolean DEBUG = false;

  /** DEBUG flag for diagnostic dumps. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  protected DTMAxisTraverser m_traverser;

  /** The DTM inner traversal class, that corresponds to the super axis. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  protected int m_superAxis = -1;

  /** The traversal axis from where the nodes will be filtered. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
  protected StepPattern m_pattern;

  /** This is the select pattern, translated into a match pattern. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/MatchPatternIterator.java
public class MatchPatternIterator extends LocPathIterator

/**
 * This class treats a
 * <a href="http://www.w3.org/TR/xpath#location-paths">LocationPath</a> as a
 * filtered iteration over the tree, evaluating each node in a super axis
 * traversal against the LocationPath interpreted as a match pattern.  This
 * class is useful to find nodes in document order that are complex paths
 * whose steps probably criss-cross each other.
 */
