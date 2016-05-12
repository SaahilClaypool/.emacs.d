_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public Object clone()

  /**
   * Returns clone of current ObjectVector
   *
   * @return clone of current ObjectVector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final int lastIndexOf(Object elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final int indexOf(Object elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final int indexOf(Object elem, int index)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final boolean contains(Object s)

  /**
   * Tell if the table contains the given Object.
   *
   * @param s object to look for
   *
   * @return true if the object is in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final Object elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i index of object to get
   *
   * @return object at given index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void setElementAt(Object value, int index)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void removeElementAt(int i)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param i index of where to remove an object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final boolean removeElement(Object s)

  /**
   * Removes the first occurrence of the argument from this vector.
   * If the object is found in this vector, each component in the vector
   * with an index greater or equal to the object's index is shifted
   * downward to have an index one smaller than the value it had
   * previously.
   *
   * @param s Object to remove from array
   *
   * @return True if the object was removed, false if it was not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void removeAllElements()

  /**
   * Remove all elements objects from the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void insertElementAt(Object value, int at)

  /**
   * Inserts the specified object in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * @param value Object to insert
   * @param at Index of where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void addElements(int numberOfElements)

  /**
   * Append several slots onto the vector, but do not set the values.
   *
   * @param numberOfElements number of slots to append
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void addElements(Object value, int numberOfElements)

  /**
   * Append several Object values onto the vector.
   *
   * @param value Object to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void addElement(Object value)

  /**
   * Append an object onto the vector.
   *
   * @param value Object to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void setSize(int sz)

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public ObjectVector(ObjectVector v)

  /**
   * Copy constructor for ObjectVector
   *
   * @param v Existing ObjectVector to copy
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public ObjectVector(int blocksize, int increaseSize)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public ObjectVector(int blocksize)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public ObjectVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  protected int m_mapSize;

  /** Size of array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  protected int m_firstFree = 0;

  /** Number of ints in array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  protected Object m_map[];

  /** Array of objects          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  protected int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
public class ObjectVector implements Cloneable

/**
 * A very simple table that stores a list of objects.
 *
 * This version is based on a "realloc" strategy -- a simle array is
 * used, and when more storage is needed, a larger array is obtained
 * and all existing data is recopied into it. As a result, read/write
 * access to existing nodes is O(1) fast but appending may be O(N**2)
 * slow.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public Object clone()

  /**
   * Returns clone of current ObjectVector
   *
   * @return clone of current ObjectVector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final int lastIndexOf(Object elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final int indexOf(Object elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final int indexOf(Object elem, int index)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final boolean contains(Object s)

  /**
   * Tell if the table contains the given Object.
   *
   * @param s object to look for
   *
   * @return true if the object is in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final Object elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i index of object to get
   *
   * @return object at given index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void setElementAt(Object value, int index)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void removeElementAt(int i)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param i index of where to remove an object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final boolean removeElement(Object s)

  /**
   * Removes the first occurrence of the argument from this vector.
   * If the object is found in this vector, each component in the vector
   * with an index greater or equal to the object's index is shifted
   * downward to have an index one smaller than the value it had
   * previously.
   *
   * @param s Object to remove from array
   *
   * @return True if the object was removed, false if it was not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void removeAllElements()

  /**
   * Remove all elements objects from the list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void insertElementAt(Object value, int at)

  /**
   * Inserts the specified object in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * @param value Object to insert
   * @param at Index of where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void addElements(int numberOfElements)

  /**
   * Append several slots onto the vector, but do not set the values.
   *
   * @param numberOfElements number of slots to append
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void addElements(Object value, int numberOfElements)

  /**
   * Append several Object values onto the vector.
   *
   * @param value Object to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void addElement(Object value)

  /**
   * Append an object onto the vector.
   *
   * @param value Object to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final void setSize(int sz)

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public ObjectVector(ObjectVector v)

  /**
   * Copy constructor for ObjectVector
   *
   * @param v Existing ObjectVector to copy
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public ObjectVector(int blocksize, int increaseSize)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public ObjectVector(int blocksize)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  public ObjectVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  protected int m_mapSize;

  /** Size of array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  protected int m_firstFree = 0;

  /** Number of ints in array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  protected Object m_map[];

  /** Array of objects          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
  protected int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectVector.java
public class ObjectVector implements Cloneable

/**
 * A very simple table that stores a list of objects.
 *
 * This version is based on a "realloc" strategy -- a simle array is
 * used, and when more storage is needed, a larger array is obtained
 * and all existing data is recopied into it. As a result, read/write
 * access to existing nodes is O(1) fast but appending may be O(N**2)
 * slow.
 * @xsl.usage internal
 */
