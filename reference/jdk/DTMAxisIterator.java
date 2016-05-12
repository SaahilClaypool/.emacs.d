_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int getNodeByPosition(int position);

  /**
   * Return the node at the given position.
   *
   * @param position The position
   * @return The node at the given position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public void setRestartable(boolean isRestartable);

  /**
   * Set if restartable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public DTMAxisIterator cloneIterator();

  /**
   * @return a deep copy of this iterator. The clone should not be reset
   * from its current position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public boolean isReverse();

  /**
   * @return true if this iterator has a reversed axis, else false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int getStartNode();

  /**
   * Get start to END should 'close' the iterator,
   * i.e. subsequent call to next() should return END.
   *
   * @return The root node of the iteration.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public DTMAxisIterator setStartNode(int node);

  /**
   * Set start to END should 'close' the iterator,
   * i.e. subsequent call to next() should return END.
   *
   * @param node Sets the root of the iteration.
   *
   * @return A DTMAxisIterator set to the start of the iteration.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public void gotoMark();

  /**
   * Restores the current node remembered by setMark().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public void setMark();

  /**
   * Remembers the current node for the next call to gotoMark().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int getPosition();

  /**
   * @return The position of the current node in the set, as defined by XPath.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int getLast();

  /**
   * @return the number of nodes in this iterator.  This may be an expensive
   * operation when called the first time.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public DTMAxisIterator reset();

  /**
   * Resets the iterator to the last start node.
   *
   * @return A DTMAxisIterator, which may or may not be the same as this
   *         iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int next();

  /**
   * Get the next node in the iteration.
   *
   * @return The next node handle in the iteration, or END.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public static final int END = DTM.NULL;

  /** Specifies the end of the iteration, and is the same as DTM.NULL.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
public interface DTMAxisIterator extends Cloneable

/**
 * This class iterates over a single XPath Axis, and returns node handles.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int getNodeByPosition(int position);

  /**
   * Return the node at the given position.
   *
   * @param position The position
   * @return The node at the given position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public void setRestartable(boolean isRestartable);

  /**
   * Set if restartable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public DTMAxisIterator cloneIterator();

  /**
   * @return a deep copy of this iterator. The clone should not be reset
   * from its current position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public boolean isReverse();

  /**
   * @return true if this iterator has a reversed axis, else false.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int getStartNode();

  /**
   * Get start to END should 'close' the iterator,
   * i.e. subsequent call to next() should return END.
   *
   * @return The root node of the iteration.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public DTMAxisIterator setStartNode(int node);

  /**
   * Set start to END should 'close' the iterator,
   * i.e. subsequent call to next() should return END.
   *
   * @param node Sets the root of the iteration.
   *
   * @return A DTMAxisIterator set to the start of the iteration.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public void gotoMark();

  /**
   * Restores the current node remembered by setMark().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public void setMark();

  /**
   * Remembers the current node for the next call to gotoMark().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int getPosition();

  /**
   * @return The position of the current node in the set, as defined by XPath.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int getLast();

  /**
   * @return the number of nodes in this iterator.  This may be an expensive
   * operation when called the first time.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public DTMAxisIterator reset();

  /**
   * Resets the iterator to the last start node.
   *
   * @return A DTMAxisIterator, which may or may not be the same as this
   *         iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public int next();

  /**
   * Get the next node in the iteration.
   *
   * @return The next node handle in the iteration, or END.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
  public static final int END = DTM.NULL;

  /** Specifies the end of the iteration, and is the same as DTM.NULL.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/DTMAxisIterator.java
public interface DTMAxisIterator extends Cloneable

/**
 * This class iterates over a single XPath Axis, and returns node handles.
 */
