_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void setLast(int last);

  /**
   * Set the index of the last node in this list.
   *
   *
   * @param last the index of the last node in this list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public int getLast();

  /**
   * Get the index of the last node in this list.
   *
   *
   * @return the index of the last node in this list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public Object clone() throws CloneNotSupportedException;

  /**
   * Get a clone of this iterator.  Be aware that this operation may be
   * somewhat expensive.
   *
   *
   * @return A clone of this object.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public NodeIterator cloneWithReset() throws CloneNotSupportedException;

  /**
   * Get a cloned Iterator that is reset to the start of the iteration.
   *
   * @return A clone of this iteration that has been reset.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public boolean isFresh();

  /**
   * Tells if this NodeSetDTM is "fresh", in other words, if
   * the first nextNode() that is called will return the
   * first node in the set.
   *
   * @return true if the iteration of this list has not yet begun.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public int size();

  /**
   * Get the length of the list.
   *
   * @return The number of nodes in this node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void setCurrentPos(int i);

  /**
   * Set the current position in the node set.
   * @param i Must be a valid index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void runTo(int index);

  /**
   * If an index is requested, NodeSetDTM will call this method
   * to run the iterator to the index.  By default this sets
   * m_next to the index.  If the index argument is -1, this
   * signals that the iterator should be run to the end.
   *
   * @param index The index to run to, or -1 if the iterator should be run
   *              to the end.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void setShouldCacheNodes(boolean b);

  /**
   * If setShouldCacheNodes(true) is called, then nodes will
   * be cached.  They are not cached by default.
   *
   * @param b true if the nodes should be cached.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void reset();

  /**
   * Reset the iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public int getCurrentPos();

  /**
   * Get the current position, which is one less than
   * the next nextNode() call will retrieve.  i.e. if
   * you call getCurrentPos() and the return is 0, the next
   * fetch will take place at index 1.
   *
   * @return The position of the
   * <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>
   * in the  <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public Node getCurrentNode();

  /**
   * Get the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   *
   *
   * @return The current node, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
public interface ContextNodeList

/**
 * Classes who implement this interface can be a
 * <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>,
 * also refered to here as a <term>context node list</term>.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void setLast(int last);

  /**
   * Set the index of the last node in this list.
   *
   *
   * @param last the index of the last node in this list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public int getLast();

  /**
   * Get the index of the last node in this list.
   *
   *
   * @return the index of the last node in this list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public Object clone() throws CloneNotSupportedException;

  /**
   * Get a clone of this iterator.  Be aware that this operation may be
   * somewhat expensive.
   *
   *
   * @return A clone of this object.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public NodeIterator cloneWithReset() throws CloneNotSupportedException;

  /**
   * Get a cloned Iterator that is reset to the start of the iteration.
   *
   * @return A clone of this iteration that has been reset.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public boolean isFresh();

  /**
   * Tells if this NodeSetDTM is "fresh", in other words, if
   * the first nextNode() that is called will return the
   * first node in the set.
   *
   * @return true if the iteration of this list has not yet begun.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public int size();

  /**
   * Get the length of the list.
   *
   * @return The number of nodes in this node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void setCurrentPos(int i);

  /**
   * Set the current position in the node set.
   * @param i Must be a valid index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void runTo(int index);

  /**
   * If an index is requested, NodeSetDTM will call this method
   * to run the iterator to the index.  By default this sets
   * m_next to the index.  If the index argument is -1, this
   * signals that the iterator should be run to the end.
   *
   * @param index The index to run to, or -1 if the iterator should be run
   *              to the end.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void setShouldCacheNodes(boolean b);

  /**
   * If setShouldCacheNodes(true) is called, then nodes will
   * be cached.  They are not cached by default.
   *
   * @param b true if the nodes should be cached.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public void reset();

  /**
   * Reset the iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public int getCurrentPos();

  /**
   * Get the current position, which is one less than
   * the next nextNode() call will retrieve.  i.e. if
   * you call getCurrentPos() and the return is 0, the next
   * fetch will take place at index 1.
   *
   * @return The position of the
   * <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>
   * in the  <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
  public Node getCurrentNode();

  /**
   * Get the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   *
   *
   * @return The current node, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/ContextNodeList.java
public interface ContextNodeList

/**
 * Classes who implement this interface can be a
 * <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>,
 * also refered to here as a <term>context node list</term>.
 * @xsl.usage advanced
 */
