_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public final int[][] getMap()

  /**
   * Return the m_map double array
   * @return the internal map of array of arrays
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public final int[] getMap0()

  /**
   * Return the internal m_map0 array
   * @return the m_map0 array
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  int lastIndexOf(int elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public int indexOf(int elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public int indexOf(int elem, int index)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  boolean contains(int s)

  /**
   * Tell if the table contains the given node.
   *
   * @param s object to look for
   *
   * @return true if the object is in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public int elementAt(int i)

  /**
   * Get the nth element. This is often at the innermost loop of an
   * application, so performance is critical.
   *
   * @param i index of value to get
   *
   * @return value at given index. If that value wasn't previously set,
   * the result is undefined for performance reasons. It may throw an
   * exception (see below), may return zero, or (if setSize has previously
   * been used) may return stale data.
   *
   * @throws ArrayIndexOutOfBoundsException if the index was _clearly_
   * unreasonable (negative, or past the highest block).
   *
   * @throws NullPointerException if the index points to a block that could
   * have existed (based on the highest index used) but has never had anything
   * set into it.
   * %REVIEW% Could add a catch to create the block in that case, or return 0.
   * Try/Catch is _supposed_ to be nearly free when not thrown to. Do we
   * believe that? Should we have a separate safeElementAt?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public void setElementAt(int value, int at)

  /**
   * Sets the component at the specified index of this vector to be the
   * specified object. The previous component at that position is discarded.
   *
   * The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   *
   * @param value object to set
   * @param at    Index of where to set the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  void removeElementAt(int at)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param at index of where to remove and int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  boolean removeElement(int s)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public void removeAllElements()

  /**
   * Wipe it out. Currently defined as equivalent to setSize(0).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  void insertElementAt(int value, int at)

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * Insertion may be an EXPENSIVE operation!
   *
   * @param value Int to insert
   * @param at Index of where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  void addElements(int numberOfElements)

  /**
   * Append several slots onto the vector, but do not set the values.
   * Note: "Not Set" means the value is unspecified.
   *
   * @param numberOfElements Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  void addElements(int value, int numberOfElements)

  /**
   * Append several int values onto the vector.
   *
   * @param value Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public  void addElement(int value)

  /**
   * Append a int onto the vector.
   *
   * @param value Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public void setSize(int sz)

  /**
   * Set the length of the list. This will only work to truncate the list, and
   * even then it has not been heavily tested and may not be trustworthy.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public int size()

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public SuballocatedIntVector(int blocksize)

  /** Construct a IntVector, using the given block size and
   * the default number of blocks (32).
   *
   * @param blocksize Size of block to allocate
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public SuballocatedIntVector(int blocksize, int numblocks)

  /**
   * Construct a IntVector, using the given block size and number
   * of blocks. For efficiency, we will round the requested size
   * off to a power of two.
   *
   * @param blocksize Size of block to allocate
   * @param numblocks Number of blocks to allocate
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public SuballocatedIntVector()

  /**
   * Default constructor.  Note that the default
   * block size is currently 2K, which may be overkill for
   * small lists and undershootng for large ones.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_buildCache[];

  /** "Shortcut" handle to most recently added row of m_map.
   * Very helpful during construction.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_map0[];

  /** "Shortcut" handle to m_map[0]. Surprisingly helpful for short vectors. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_firstFree = 0;

  /** Number of ints in array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_map[][];

  /** Array of arrays of ints          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_numblocks = NUMBLOCKS_DEFAULT;

  /** The number of blocks to (over)allocate by */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected static final int NUMBLOCKS_DEFAULT = 32;

  /** The default number of blocks to (over)allocate by */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_SHIFT, m_MASK;

  /** Bitwise addressing (much faster than div/remainder */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
public class SuballocatedIntVector

/**
 * A very simple table that stores a list of int. Very similar API to our
 * IntVector class (same API); different internal storage.
 *
 * This version uses an array-of-arrays solution. Read/write access is thus
 * a bit slower than the simple IntVector, and basic storage is a trifle
 * higher due to the top-level array -- but appending is O(1) fast rather
 * than O(N**2) slow, which will swamp those costs in situations where
 * long vectors are being built up.
 *
 * Known issues:
 *
 * Some methods are private because they haven't yet been tested properly.
 *
 * Retrieval performance is critical, since this is used at the core
 * of the DTM model. (Append performance is almost as important.)
 * That's pushing me toward just letting reads from unset indices
 * throw exceptions or return stale data; safer behavior would have
 * performance costs.
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public final int[][] getMap()

  /**
   * Return the m_map double array
   * @return the internal map of array of arrays
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public final int[] getMap0()

  /**
   * Return the internal m_map0 array
   * @return the m_map0 array
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  int lastIndexOf(int elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public int indexOf(int elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public int indexOf(int elem, int index)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  boolean contains(int s)

  /**
   * Tell if the table contains the given node.
   *
   * @param s object to look for
   *
   * @return true if the object is in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public int elementAt(int i)

  /**
   * Get the nth element. This is often at the innermost loop of an
   * application, so performance is critical.
   *
   * @param i index of value to get
   *
   * @return value at given index. If that value wasn't previously set,
   * the result is undefined for performance reasons. It may throw an
   * exception (see below), may return zero, or (if setSize has previously
   * been used) may return stale data.
   *
   * @throws ArrayIndexOutOfBoundsException if the index was _clearly_
   * unreasonable (negative, or past the highest block).
   *
   * @throws NullPointerException if the index points to a block that could
   * have existed (based on the highest index used) but has never had anything
   * set into it.
   * %REVIEW% Could add a catch to create the block in that case, or return 0.
   * Try/Catch is _supposed_ to be nearly free when not thrown to. Do we
   * believe that? Should we have a separate safeElementAt?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public void setElementAt(int value, int at)

  /**
   * Sets the component at the specified index of this vector to be the
   * specified object. The previous component at that position is discarded.
   *
   * The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   *
   * @param value object to set
   * @param at    Index of where to set the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  void removeElementAt(int at)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param at index of where to remove and int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  boolean removeElement(int s)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public void removeAllElements()

  /**
   * Wipe it out. Currently defined as equivalent to setSize(0).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  void insertElementAt(int value, int at)

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * Insertion may be an EXPENSIVE operation!
   *
   * @param value Int to insert
   * @param at Index of where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  void addElements(int numberOfElements)

  /**
   * Append several slots onto the vector, but do not set the values.
   * Note: "Not Set" means the value is unspecified.
   *
   * @param numberOfElements Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  private  void addElements(int value, int numberOfElements)

  /**
   * Append several int values onto the vector.
   *
   * @param value Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public  void addElement(int value)

  /**
   * Append a int onto the vector.
   *
   * @param value Int to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public void setSize(int sz)

  /**
   * Set the length of the list. This will only work to truncate the list, and
   * even then it has not been heavily tested and may not be trustworthy.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public int size()

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public SuballocatedIntVector(int blocksize)

  /** Construct a IntVector, using the given block size and
   * the default number of blocks (32).
   *
   * @param blocksize Size of block to allocate
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public SuballocatedIntVector(int blocksize, int numblocks)

  /**
   * Construct a IntVector, using the given block size and number
   * of blocks. For efficiency, we will round the requested size
   * off to a power of two.
   *
   * @param blocksize Size of block to allocate
   * @param numblocks Number of blocks to allocate
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  public SuballocatedIntVector()

  /**
   * Default constructor.  Note that the default
   * block size is currently 2K, which may be overkill for
   * small lists and undershootng for large ones.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_buildCache[];

  /** "Shortcut" handle to most recently added row of m_map.
   * Very helpful during construction.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_map0[];

  /** "Shortcut" handle to m_map[0]. Surprisingly helpful for short vectors. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_firstFree = 0;

  /** Number of ints in array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_map[][];

  /** Array of arrays of ints          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_numblocks = NUMBLOCKS_DEFAULT;

  /** The number of blocks to (over)allocate by */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected static final int NUMBLOCKS_DEFAULT = 32;

  /** The default number of blocks to (over)allocate by */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_SHIFT, m_MASK;

  /** Bitwise addressing (much faster than div/remainder */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
  protected int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedIntVector.java
public class SuballocatedIntVector

/**
 * A very simple table that stores a list of int. Very similar API to our
 * IntVector class (same API); different internal storage.
 *
 * This version uses an array-of-arrays solution. Read/write access is thus
 * a bit slower than the simple IntVector, and basic storage is a trifle
 * higher due to the top-level array -- but appending is O(1) fast rather
 * than O(N**2) slow, which will swamp those costs in situations where
 * long vectors are being built up.
 *
 * Known issues:
 *
 * Some methods are private because they haven't yet been tested properly.
 *
 * Retrieval performance is critical, since this is used at the core
 * of the DTM model. (Append performance is almost as important.)
 * That's pushing me toward just letting reads from unset indices
 * throw exceptions or return stale data; safer behavior would have
 * performance costs.
 * */
