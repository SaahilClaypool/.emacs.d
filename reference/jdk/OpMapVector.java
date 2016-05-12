_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  public OpMapVector(int blocksize, int increaseSize, int lengthPos)

    /**
   * Construct a OpMapVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  protected int m_mapSize;

  /** Size of array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  protected int m_lengthPos = 0;

  /** Position where size of array is kept          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  protected int m_map[]; // IntStack is trying to see this directly

  /** Array of ints          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  protected int m_blocksize;

 /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
public class OpMapVector {

/**
 *
 * Like IntVector, but used only for the OpMap array.  Length of array
 * is kept in the m_lengthPos position of the array.  Only the required methods
 * are in included here.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  public OpMapVector(int blocksize, int increaseSize, int lengthPos)

    /**
   * Construct a OpMapVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  protected int m_mapSize;

  /** Size of array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  protected int m_lengthPos = 0;

  /** Position where size of array is kept          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  protected int m_map[]; // IntStack is trying to see this directly

  /** Array of ints          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
  protected int m_blocksize;

 /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/OpMapVector.java
public class OpMapVector {

/**
 *
 * Like IntVector, but used only for the OpMap array.  Length of array
 * is kept in the m_lengthPos position of the array.  Only the required methods
 * are in included here.
 * @xsl.usage internal
 */
