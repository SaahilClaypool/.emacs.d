_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void sort() throws Exception

  /**
   * Sort an array using a quicksort algorithm.
   *
   * @throws Exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void sort(int a[], int lo0, int hi0) throws Exception

  /**
   * Sort an array using a quicksort algorithm.
   *
   * @param a The array to be sorted.
   * @param lo0  The low index.
   * @param hi0  The high index.
   *
   * @throws Exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public int indexOf(int elem)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem Node to look for
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public int indexOf(int elem, int index)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem Node to look for
   * @param index Index of where to start the search
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public boolean contains(int s)

  /**
   * Tell if the table contains the given node.
   *
   * @param s Node to look for
   *
   * @return True if the given node was found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public int elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i Index of node to get
   *
   * @return Node at specified index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void setElementAt(int node, int index)

  /**
   * Sets the component at the specified index of this vector to be the
   * specified object. The previous component at that position is discarded.
   *
   * The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   *
   * @param node Node to set
   * @param index Index of where to set the node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void removeElementAt(int i)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param i Index of node to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public boolean removeElement(int s)

  /**
   * Removes the first occurrence of the argument from this vector.
   * If the object is found in this vector, each component in the vector
   * with an index greater or equal to the object's index is shifted
   * downward to have an index one smaller than the value it had
   * previously.
   *
   * @param s Node to remove from the list
   *
   * @return True if the node was successfully removed
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void RemoveAllNoClear()

  /**
   * Set the length to zero, but don't clear the array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void removeAllElements()

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void appendNodes(NodeVector nodes)

  /**
   * Append the nodes to the list.
   *
   * @param nodes NodeVector to append to this list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void insertElementAt(int value, int at)

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * @param value Node to insert
   * @param at Position where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void insertInOrder(int value)

  /**
   * Insert a node in order in the list.
   *
   * @param value Node to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int peepTailSub1()

  /**
   * Return the node one position from the tail without popping.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @return Node one away from the tail
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int peepTail()

  /**
   * Return the node at the tail of the vector without popping
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @return Node at the tail of the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void setTailSub1(int n)

  /**
   * Set the given node one position from the tail.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @param n Node to set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void setTail(int n)

  /**
   * Set the tail of the stack to the given node.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @param n Node to set at the tail of vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void popPair()

  /**
   * Pop a pair of nodes from the tail of the stack.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void pushPair(int v1, int v2)

  /**
   * Push a pair of nodes into the stack.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @param v1 First node to add to vector
   * @param v2 Second node to add to vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int peepOrNull()

  /**
   * Return the node at the top of the stack without popping the stack.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @return Node at the top of the stack or null if stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void popQuick()

  /**
   * Pop a node from the tail of the vector.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int popAndTop()

  /**
   * Pop a node from the tail of the vector and return the
   * top of the stack after the pop.
   *
   * @return The top of the stack after it's been popped
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int pop()

  /**
   * Pop a node from the tail of the vector and return the result.
   *
   * @return the node at the tail of the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void push(int value)

  /**
   * Append a Node onto the vector.
   *
   * @param value Node to add to the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void addElement(int value)

  /**
   * Append a Node onto the vector.
   *
   * @param value Node to add to the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public int size()

  /**
   * Get the length of the list.
   *
   * @return Number of nodes in this NodeVector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned LocPathIterator.
   *
   * @return A clone of this
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public NodeVector(int blocksize)

  /**
   * Construct a NodeVector, using the given block size.
   *
   * @param blocksize Size of blocks to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public NodeVector()

  /**
   * Default constructor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  private int m_mapSize;  // lazy initialization

  /**
   * Size of the array this points to.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  protected int m_firstFree = 0;

  /**
   * Number of nodes in this NodeVector.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  private int m_map[];

  /**
   * Array of nodes this points to.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  private int m_blocksize;

  /**
   * Size of blocks to allocate.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
public class NodeVector implements Serializable, Cloneable

/**
 * A very simple table that stores a list of Nodes.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void sort() throws Exception

  /**
   * Sort an array using a quicksort algorithm.
   *
   * @throws Exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void sort(int a[], int lo0, int hi0) throws Exception

  /**
   * Sort an array using a quicksort algorithm.
   *
   * @param a The array to be sorted.
   * @param lo0  The low index.
   * @param hi0  The high index.
   *
   * @throws Exception
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public int indexOf(int elem)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem Node to look for
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public int indexOf(int elem, int index)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem Node to look for
   * @param index Index of where to start the search
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public boolean contains(int s)

  /**
   * Tell if the table contains the given node.
   *
   * @param s Node to look for
   *
   * @return True if the given node was found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public int elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i Index of node to get
   *
   * @return Node at specified index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void setElementAt(int node, int index)

  /**
   * Sets the component at the specified index of this vector to be the
   * specified object. The previous component at that position is discarded.
   *
   * The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   *
   * @param node Node to set
   * @param index Index of where to set the node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void removeElementAt(int i)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param i Index of node to remove
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public boolean removeElement(int s)

  /**
   * Removes the first occurrence of the argument from this vector.
   * If the object is found in this vector, each component in the vector
   * with an index greater or equal to the object's index is shifted
   * downward to have an index one smaller than the value it had
   * previously.
   *
   * @param s Node to remove from the list
   *
   * @return True if the node was successfully removed
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void RemoveAllNoClear()

  /**
   * Set the length to zero, but don't clear the array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void removeAllElements()

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void appendNodes(NodeVector nodes)

  /**
   * Append the nodes to the list.
   *
   * @param nodes NodeVector to append to this list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void insertElementAt(int value, int at)

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * @param value Node to insert
   * @param at Position where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void insertInOrder(int value)

  /**
   * Insert a node in order in the list.
   *
   * @param value Node to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int peepTailSub1()

  /**
   * Return the node one position from the tail without popping.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @return Node one away from the tail
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int peepTail()

  /**
   * Return the node at the tail of the vector without popping
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @return Node at the tail of the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void setTailSub1(int n)

  /**
   * Set the given node one position from the tail.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @param n Node to set
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void setTail(int n)

  /**
   * Set the tail of the stack to the given node.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @param n Node to set at the tail of vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void popPair()

  /**
   * Pop a pair of nodes from the tail of the stack.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void pushPair(int v1, int v2)

  /**
   * Push a pair of nodes into the stack.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @param v1 First node to add to vector
   * @param v2 Second node to add to vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int peepOrNull()

  /**
   * Return the node at the top of the stack without popping the stack.
   * Special purpose method for TransformerImpl, pushElemTemplateElement.
   * Performance critical.
   *
   * @return Node at the top of the stack or null if stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void popQuick()

  /**
   * Pop a node from the tail of the vector.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int popAndTop()

  /**
   * Pop a node from the tail of the vector and return the
   * top of the stack after the pop.
   *
   * @return The top of the stack after it's been popped
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final int pop()

  /**
   * Pop a node from the tail of the vector and return the result.
   *
   * @return the node at the tail of the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public final void push(int value)

  /**
   * Append a Node onto the vector.
   *
   * @param value Node to add to the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public void addElement(int value)

  /**
   * Append a Node onto the vector.
   *
   * @param value Node to add to the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public int size()

  /**
   * Get the length of the list.
   *
   * @return Number of nodes in this NodeVector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned LocPathIterator.
   *
   * @return A clone of this
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public NodeVector(int blocksize)

  /**
   * Construct a NodeVector, using the given block size.
   *
   * @param blocksize Size of blocks to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  public NodeVector()

  /**
   * Default constructor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  private int m_mapSize;  // lazy initialization

  /**
   * Size of the array this points to.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  protected int m_firstFree = 0;

  /**
   * Number of nodes in this NodeVector.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  private int m_map[];

  /**
   * Array of nodes this points to.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
  private int m_blocksize;

  /**
   * Size of blocks to allocate.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/NodeVector.java
public class NodeVector implements Serializable, Cloneable

/**
 * A very simple table that stores a list of Nodes.
 * @xsl.usage internal
 */
