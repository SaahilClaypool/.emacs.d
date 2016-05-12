_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public Object clone()

  /**
   * Returns clone of current IntVector
   *
   * @return clone of current IntVector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int lastIndexOf(int elem)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem Object to look for
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int indexOf(int elem)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem object to look for
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int indexOf(int elem, int index)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem object to look for
   * @param index Index of where to begin search
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final boolean contains(int s)

  /**
   * Tell if the table contains the given node.
   *
   * @param s object to look for
   *
   * @return true if the object is in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i index of object to get
   *
   * @return object at given index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void setElementAt(int value, int index)

  /**
   * Sets the component at the specified index of this vector to be the
   * specified object. The previous component at that position is discarded.
   *
   * The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   *
   * @param value object to set
   * @param index Index of where to set the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void removeElementAt(int i)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param i index of where to remove and int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final boolean removeElement(int s)

  /**
   * Removes the first occurrence of the argument from this vector.
   * If the object is found in this vector, each component in the vector
   * with an index greater or equal to the object's index is shifted
   * downward to have an index one smaller than the value it had
   * previously.
   *
   * @param s Int to remove from array
   *
   * @return True if the int was removed, false if it was not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void removeAllElements()

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void insertElementAt(int value, int at)

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * @param value Int to insert
   * @param at Index of where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void addElements(int numberOfElements)

  /**
   * Append several slots onto the vector, but do not set the values.
   *
   * @param numberOfElements Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void addElements(int value, int numberOfElements)

  /**
   * Append several int values onto the vector.
   *
   * @param value Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void addElement(int value)

  /**
   * Append a int onto the vector.
   *
   * @param value Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void setSize(int sz)

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public IntVector(IntVector v)

  /**
   * Copy constructor for IntVector
   *
   * @param v Existing IntVector to copy
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public IntVector(int blocksize, int increaseSize)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public IntVector(int blocksize)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public IntVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  protected int m_mapSize;

  /** Size of array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  protected int m_firstFree = 0;

  /** Number of ints in array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  protected int m_map[]; // IntStack is trying to see this directly

  /** Array of ints          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  protected int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
public class IntVector implements Cloneable

/**
 * A very simple table that stores a list of int.
 *
 * This version is based on a "realloc" strategy -- a simle array is
 * used, and when more storage is needed, a larger array is obtained
 * and all existing data is recopied into it. As a result, read/write
 * access to existing nodes is O(1) fast but appending may be O(N**2)
 * slow. See also SuballocatedIntVector.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public Object clone()

  /**
   * Returns clone of current IntVector
   *
   * @return clone of current IntVector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int lastIndexOf(int elem)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem Object to look for
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int indexOf(int elem)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem object to look for
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int indexOf(int elem, int index)

  /**
   * Searches for the first occurence of the given argument,
   * beginning the search at index, and testing for equality
   * using the equals method.
   *
   * @param elem object to look for
   * @param index Index of where to begin search
   * @return the index of the first occurrence of the object
   * argument in this vector at position index or later in the
   * vector; returns -1 if the object is not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final boolean contains(int s)

  /**
   * Tell if the table contains the given node.
   *
   * @param s object to look for
   *
   * @return true if the object is in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i index of object to get
   *
   * @return object at given index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void setElementAt(int value, int index)

  /**
   * Sets the component at the specified index of this vector to be the
   * specified object. The previous component at that position is discarded.
   *
   * The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   *
   * @param value object to set
   * @param index Index of where to set the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void removeElementAt(int i)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param i index of where to remove and int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final boolean removeElement(int s)

  /**
   * Removes the first occurrence of the argument from this vector.
   * If the object is found in this vector, each component in the vector
   * with an index greater or equal to the object's index is shifted
   * downward to have an index one smaller than the value it had
   * previously.
   *
   * @param s Int to remove from array
   *
   * @return True if the int was removed, false if it was not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void removeAllElements()

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void insertElementAt(int value, int at)

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * @param value Int to insert
   * @param at Index of where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void addElements(int numberOfElements)

  /**
   * Append several slots onto the vector, but do not set the values.
   *
   * @param numberOfElements Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void addElements(int value, int numberOfElements)

  /**
   * Append several int values onto the vector.
   *
   * @param value Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void addElement(int value)

  /**
   * Append a int onto the vector.
   *
   * @param value Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final void setSize(int sz)

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public IntVector(IntVector v)

  /**
   * Copy constructor for IntVector
   *
   * @param v Existing IntVector to copy
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public IntVector(int blocksize, int increaseSize)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public IntVector(int blocksize)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  public IntVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  protected int m_mapSize;

  /** Size of array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  protected int m_firstFree = 0;

  /** Number of ints in array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  protected int m_map[]; // IntStack is trying to see this directly

  /** Array of ints          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
  protected int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/IntVector.java
public class IntVector implements Cloneable

/**
 * A very simple table that stores a list of int.
 *
 * This version is based on a "realloc" strategy -- a simle array is
 * used, and when more storage is needed, a larger array is obtained
 * and all existing data is recopied into it. As a result, read/write
 * access to existing nodes is O(1) fast but appending may be O(N**2)
 * slow. See also SuballocatedIntVector.
 * @xsl.usage internal
 */
