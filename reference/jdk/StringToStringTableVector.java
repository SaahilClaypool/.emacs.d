_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final boolean contains(StringToStringTable s)

  /**
   * Tell if the table contains the given StringToStringTable.
   *
   * @param s The StringToStringTable to find
   *
   * @return True if the StringToStringTable is found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final StringToStringTable elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i Index of element to find
   *
   * @return The StringToStringTable object at the given index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final void removeLastElem()

  /**
   * Remove the last element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final boolean containsKey(String key)

  /**
   * Given a string, find out if there is a value in this table
   * that matches the key.
   *
   * @param key String to look for
   *
   * @return True if the string was found in table, null if not
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final String get(String key)

  /**
   * Given a string, find the last added occurance value
   * that matches the key.
   *
   * @param key String to look up
   *
   * @return the last added occurance value that matches the key
   * or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final void addElement(StringToStringTable value)

  /**
   * Append a StringToStringTable object onto the vector.
   *
   * @param value StringToStringTable object to add
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return Number of StringToStringTable objects in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final int getLength()

  /**
   * Get the length of the list.
   *
   * @return Number of StringToStringTable objects in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public StringToStringTableVector(int blocksize)

  /**
   * Construct a StringToStringTableVector, using the given block size.
   *
   * @param blocksize Size of blocks to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public StringToStringTableVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  private int m_mapSize;

  /** Size of this array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  private int m_firstFree = 0;

  /** Number of StringToStringTable objects in this array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  private StringToStringTable m_map[];

  /** Array of StringToStringTable objects          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  private int m_blocksize;

  /** Size of blocks to allocate         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
public class StringToStringTableVector

/**
 * A very simple table that stores a list of StringToStringTables, optimized
 * for small lists.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final boolean contains(StringToStringTable s)

  /**
   * Tell if the table contains the given StringToStringTable.
   *
   * @param s The StringToStringTable to find
   *
   * @return True if the StringToStringTable is found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final StringToStringTable elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i Index of element to find
   *
   * @return The StringToStringTable object at the given index
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final void removeLastElem()

  /**
   * Remove the last element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final boolean containsKey(String key)

  /**
   * Given a string, find out if there is a value in this table
   * that matches the key.
   *
   * @param key String to look for
   *
   * @return True if the string was found in table, null if not
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final String get(String key)

  /**
   * Given a string, find the last added occurance value
   * that matches the key.
   *
   * @param key String to look up
   *
   * @return the last added occurance value that matches the key
   * or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final void addElement(StringToStringTable value)

  /**
   * Append a StringToStringTable object onto the vector.
   *
   * @param value StringToStringTable object to add
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return Number of StringToStringTable objects in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public final int getLength()

  /**
   * Get the length of the list.
   *
   * @return Number of StringToStringTable objects in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public StringToStringTableVector(int blocksize)

  /**
   * Construct a StringToStringTableVector, using the given block size.
   *
   * @param blocksize Size of blocks to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  public StringToStringTableVector()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  private int m_mapSize;

  /** Size of this array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  private int m_firstFree = 0;

  /** Number of StringToStringTable objects in this array          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  private StringToStringTable m_map[];

  /** Array of StringToStringTable objects          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
  private int m_blocksize;

  /** Size of blocks to allocate         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTableVector.java
public class StringToStringTableVector

/**
 * A very simple table that stores a list of StringToStringTables, optimized
 * for small lists.
 * @xsl.usage internal
 */
