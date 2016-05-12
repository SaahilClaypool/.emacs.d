_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  int lastIndexOf(byte elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public int indexOf(byte elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public int indexOf(byte elem, int index)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  boolean contains(byte s)

  /**
   * Tell if the table contains the given node.
   *
   * @param s object to look for
   *
   * @return true if the object is in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public byte elementAt(int i)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public void setElementAt(byte value, int at)

  /**
   * Sets the component at the specified index of this vector to be the
   * specified object. The previous component at that position is discarded.
   *
   * The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   *
   * @param value
   * @param at     Index of where to set the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void removeElementAt(int at)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param at index of where to remove a byte
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  boolean removeElement(byte s)

  /**
   * Removes the first occurrence of the argument from this vector.
   * If the object is found in this vector, each component in the vector
   * with an index greater or equal to the object's index is shifted
   * downward to have an index one smaller than the value it had
   * previously.
   *
   * @param s Byte to remove from array
   *
   * @return True if the byte was removed, false if it was not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public void removeAllElements()

  /**
   * Wipe it out.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void insertElementAt(byte value, int at)

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * Insertion may be an EXPENSIVE operation!
   *
   * @param value Byte to insert
   * @param at Index of where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void addElements(int numberOfElements)

  /**
   * Append several slots onto the vector, but do not set the values.
   * Note: "Not Set" means the value is unspecified.
   *
   * @param numberOfElements
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void addElements(byte value, int numberOfElements)

  /**
   * Append several byte values onto the vector.
   *
   * @param value Byte to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public  void addElement(byte value)

  /**
   * Append a byte onto the vector.
   *
   * @param value Byte to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void setSize(int sz)

  /**
   * Set the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public int size()

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public SuballocatedByteVector(int blocksize, int increaseSize)

  /**
   * Construct a ByteVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public SuballocatedByteVector(int blocksize)

  /**
   * Construct a ByteVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public SuballocatedByteVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected byte m_map0[];

  /** "Shortcut" handle to m_map[0] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected int m_firstFree = 0;

  /** Number of bytes in array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected byte m_map[][];

  /** Array of arrays of bytes          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected  int m_numblocks=32;

  /** Number of blocks to (over)allocate by */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
public class SuballocatedByteVector

/**
 * A very simple table that stores a list of byte. Very similar API to our
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
 * If an element has not been set (because we skipped it), its value will
 * initially be 0. Shortening the vector does not clear old storage; if you
 * then skip values and setElementAt a higher index again, you may see old data
 * reappear in the truncated-and-restored section. Doing anything else would
 * have performance costs.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  int lastIndexOf(byte elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public int indexOf(byte elem)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public int indexOf(byte elem, int index)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  boolean contains(byte s)

  /**
   * Tell if the table contains the given node.
   *
   * @param s object to look for
   *
   * @return true if the object is in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public byte elementAt(int i)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public void setElementAt(byte value, int at)

  /**
   * Sets the component at the specified index of this vector to be the
   * specified object. The previous component at that position is discarded.
   *
   * The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   *
   * @param value
   * @param at     Index of where to set the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void removeElementAt(int at)

  /**
   * Deletes the component at the specified index. Each component in
   * this vector with an index greater or equal to the specified
   * index is shifted downward to have an index one smaller than
   * the value it had previously.
   *
   * @param at index of where to remove a byte
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  boolean removeElement(byte s)

  /**
   * Removes the first occurrence of the argument from this vector.
   * If the object is found in this vector, each component in the vector
   * with an index greater or equal to the object's index is shifted
   * downward to have an index one smaller than the value it had
   * previously.
   *
   * @param s Byte to remove from array
   *
   * @return True if the byte was removed, false if it was not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public void removeAllElements()

  /**
   * Wipe it out.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void insertElementAt(byte value, int at)

  /**
   * Inserts the specified node in this vector at the specified index.
   * Each component in this vector with an index greater or equal to
   * the specified index is shifted upward to have an index one greater
   * than the value it had previously.
   *
   * Insertion may be an EXPENSIVE operation!
   *
   * @param value Byte to insert
   * @param at Index of where to insert
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void addElements(int numberOfElements)

  /**
   * Append several slots onto the vector, but do not set the values.
   * Note: "Not Set" means the value is unspecified.
   *
   * @param numberOfElements
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void addElements(byte value, int numberOfElements)

  /**
   * Append several byte values onto the vector.
   *
   * @param value Byte to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public  void addElement(byte value)

  /**
   * Append a byte onto the vector.
   *
   * @param value Byte to add to the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  private  void setSize(int sz)

  /**
   * Set the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public int size()

  /**
   * Get the length of the list.
   *
   * @return length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public SuballocatedByteVector(int blocksize, int increaseSize)

  /**
   * Construct a ByteVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public SuballocatedByteVector(int blocksize)

  /**
   * Construct a ByteVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  public SuballocatedByteVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected byte m_map0[];

  /** "Shortcut" handle to m_map[0] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected int m_firstFree = 0;

  /** Number of bytes in array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected byte m_map[][];

  /** Array of arrays of bytes          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected  int m_numblocks=32;

  /** Number of blocks to (over)allocate by */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
  protected int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SuballocatedByteVector.java
public class SuballocatedByteVector

/**
 * A very simple table that stores a list of byte. Very similar API to our
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
 * If an element has not been set (because we skipped it), its value will
 * initially be 0. Shortening the vector does not clear old storage; if you
 * then skip values and setElementAt a higher index again, you may see old data
 * reappear in the truncated-and-restored section. Doing anything else would
 * have performance costs.
 * @xsl.usage internal
 */
