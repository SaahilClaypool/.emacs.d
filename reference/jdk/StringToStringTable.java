_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final boolean containsValue(String val)

  /**
   * Tell if the table contains the given string.
   *
   * @param val value to look up
   *
   * @return True if the given value is in the table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final boolean contains(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look up
   *
   * @return True if the given string is in this table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final String elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i index of the string to look up.
   *
   * @return The string at the given index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final String getByValue(String val)

  /**
   * Tell if the table contains the given string in the value.
   *
   * @param val Value of the string to look up
   *
   * @return the string associated with the given value or null if not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final String getIgnoreCase(String key)

  /**
   * Tell if the table contains the given string. Ignore case
   *
   * @param key String to look up
   *
   * @return The value of the string or null if not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final void remove(String key)

  /**
   * Remove the given string and its value from this table.
   *
   * @param key String to remove from the table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final String get(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look up
   *
   * @return return the value of the string or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final void put(String key, String value)

  /**
   * Append a string onto the vector.
   * The strings go to the even locations in the array
   * and the values in the odd.
   *
   * @param key String to add to the list
   * @param value Value of the string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final int getLength()

  /**
   * Get the length of the list.
   *
   * @return Number of strings in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public StringToStringTable(int blocksize)

  /**
   * Construct a StringToStringTable, using the given block size.
   *
   * @param blocksize Size of blocks to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public StringToStringTable()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  private int m_mapSize;

  /** Size of this table           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  private int m_firstFree = 0;

  /** Number of strings this contains           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  private String m_map[];

  /** Array of strings this contains          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  private int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
public class StringToStringTable

/**
 * A very simple lookup table that stores a list of strings, the even
 * number strings being keys, and the odd number strings being values.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final boolean containsValue(String val)

  /**
   * Tell if the table contains the given string.
   *
   * @param val value to look up
   *
   * @return True if the given value is in the table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final boolean contains(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look up
   *
   * @return True if the given string is in this table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final String elementAt(int i)

  /**
   * Get the nth element.
   *
   * @param i index of the string to look up.
   *
   * @return The string at the given index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final String getByValue(String val)

  /**
   * Tell if the table contains the given string in the value.
   *
   * @param val Value of the string to look up
   *
   * @return the string associated with the given value or null if not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final String getIgnoreCase(String key)

  /**
   * Tell if the table contains the given string. Ignore case
   *
   * @param key String to look up
   *
   * @return The value of the string or null if not found
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final void remove(String key)

  /**
   * Remove the given string and its value from this table.
   *
   * @param key String to remove from the table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final String get(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look up
   *
   * @return return the value of the string or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final void put(String key, String value)

  /**
   * Append a string onto the vector.
   * The strings go to the even locations in the array
   * and the values in the odd.
   *
   * @param key String to add to the list
   * @param value Value of the string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public final int getLength()

  /**
   * Get the length of the list.
   *
   * @return Number of strings in the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public StringToStringTable(int blocksize)

  /**
   * Construct a StringToStringTable, using the given block size.
   *
   * @param blocksize Size of blocks to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  public StringToStringTable()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  private int m_mapSize;

  /** Size of this table           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  private int m_firstFree = 0;

  /** Number of strings this contains           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  private String m_map[];

  /** Array of strings this contains          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
  private int m_blocksize;

  /** Size of blocks to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToStringTable.java
public class StringToStringTable

/**
 * A very simple lookup table that stores a list of strings, the even
 * number strings being keys, and the odd number strings being values.
 * @xsl.usage internal
 */
