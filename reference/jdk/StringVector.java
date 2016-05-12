_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final String peek()

  /**
   * Get the string at the tail of this vector without popping.
   *
   * @return The string at the tail of this vector.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final String pop()

  /**
   * Pop the tail of this vector.
   *
   * @return The String last added to this vector or null not found.
   * The string is removed from the vector.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final void push(String s)

  /**
   * Tell if the table contains the given string.
   *
   * @param s String to push into the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final boolean containsIgnoreCase(String s)

  /**
   * Tell if the table contains the given string. Ignore case.
   *
   * @param s String to find
   *
   * @return True if the String is in this vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final boolean contains(String s)

  /**
   * Tell if the table contains the given string.
   *
   * @param s String to look for
   *
   * @return True if the string is in this table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final String elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i Index of string to find
   *
   * @return String at given index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final void addElement(String value)

  /**
   * Append a string onto the vector.
   *
   * @param value Sting to add to the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return Number of strings in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public int getLength()

  /**
   * Get the length of the list.
   *
   * @return Number of strings in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public StringVector(int blocksize)

  /**
   * Construct a StringVector, using the given block size.
   *
   * @param blocksize Size of the blocks to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public StringVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  protected int m_mapSize;

  /** @serial Size of the array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  protected int m_firstFree = 0;

  /** @serial Number of strings this contains          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  protected String m_map[];

  /** @serial Array of strings this contains          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  protected int m_blocksize;

  /** @serial Size of blocks to allocate           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
public class StringVector implements java.io.Serializable

/**
 * A very simple table that stores a list of strings, optimized
 * for small lists.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final String peek()

  /**
   * Get the string at the tail of this vector without popping.
   *
   * @return The string at the tail of this vector.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final String pop()

  /**
   * Pop the tail of this vector.
   *
   * @return The String last added to this vector or null not found.
   * The string is removed from the vector.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final void push(String s)

  /**
   * Tell if the table contains the given string.
   *
   * @param s String to push into the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final boolean containsIgnoreCase(String s)

  /**
   * Tell if the table contains the given string. Ignore case.
   *
   * @param s String to find
   *
   * @return True if the String is in this vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final boolean contains(String s)

  /**
   * Tell if the table contains the given string.
   *
   * @param s String to look for
   *
   * @return True if the string is in this table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final String elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i Index of string to find
   *
   * @return String at given index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final void addElement(String value)

  /**
   * Append a string onto the vector.
   *
   * @param value Sting to add to the vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return Number of strings in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public int getLength()

  /**
   * Get the length of the list.
   *
   * @return Number of strings in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public StringVector(int blocksize)

  /**
   * Construct a StringVector, using the given block size.
   *
   * @param blocksize Size of the blocks to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  public StringVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  protected int m_mapSize;

  /** @serial Size of the array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  protected int m_firstFree = 0;

  /** @serial Number of strings this contains          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  protected String m_map[];

  /** @serial Array of strings this contains          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
  protected int m_blocksize;

  /** @serial Size of blocks to allocate           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringVector.java
public class StringVector implements java.io.Serializable

/**
 * A very simple table that stores a list of strings, optimized
 * for small lists.
 * @xsl.usage internal
 */
