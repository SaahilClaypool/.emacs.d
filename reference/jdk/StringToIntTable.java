_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final String[] keys()

  /**
   * Return array of keys in the table.
   *
   * @return Array of strings
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final boolean contains(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look for
   *
   * @return True if the string is in the table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final int getIgnoreCase(String key)

  /**
   * Tell if the table contains the given string. Ignore case.
   *
   * @param key String to look for
   *
   * @return The string's int value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final int get(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look for
   *
   * @return The String's int value
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final void put(String key, int value)

  /**
   * Append a string onto the vector.
   *
   * @param key String to append
   * @param value The int value of the string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final int getLength()

  /**
   * Get the length of the list.
   *
   * @return the length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public StringToIntTable(int blocksize)

  /**
   * Construct a StringToIntTable, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public StringToIntTable()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private int m_mapSize;

  /** Size of this table         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private int m_firstFree = 0;

  /** Number of ints in the table          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private int m_values[];

  /** Array of ints this table points. Associated with strings from
   * m_map.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private String m_map[];

  /** Array of strings this table points to. Associated with ints
   * in m_values         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private int m_blocksize;

  /** Block size to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
public final class StringToIntTable

/**
 * A very simple lookup table that stores a list of strings, the even
 * number strings being keys, and the odd number strings being values.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * This class is not a public API, it is only public so it can be used
 * in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final String[] keys()

  /**
   * Return array of keys in the table.
   *
   * @return Array of strings
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final boolean contains(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look for
   *
   * @return True if the string is in the table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final int getIgnoreCase(String key)

  /**
   * Tell if the table contains the given string. Ignore case.
   *
   * @param key String to look for
   *
   * @return The string's int value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final int get(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look for
   *
   * @return The String's int value
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final void put(String key, int value)

  /**
   * Append a string onto the vector.
   *
   * @param key String to append
   * @param value The int value of the string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final int getLength()

  /**
   * Get the length of the list.
   *
   * @return the length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public StringToIntTable(int blocksize)

  /**
   * Construct a StringToIntTable, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public StringToIntTable()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private int m_mapSize;

  /** Size of this table         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private int m_firstFree = 0;

  /** Number of ints in the table          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private int m_values[];

  /** Array of ints this table points. Associated with strings from
   * m_map.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private String m_map[];

  /** Array of strings this table points to. Associated with ints
   * in m_values         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private int m_blocksize;

  /** Block size to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
public class StringToIntTable

/**
 * A very simple lookup table that stores a list of strings, the even
 * number strings being keys, and the odd number strings being values.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final String[] keys()

  /**
   * Return array of keys in the table.
   *
   * @return Array of strings
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final boolean contains(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look for
   *
   * @return True if the string is in the table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final int getIgnoreCase(String key)

  /**
   * Tell if the table contains the given string. Ignore case.
   *
   * @param key String to look for
   *
   * @return The string's int value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final int get(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look for
   *
   * @return The String's int value
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final void put(String key, int value)

  /**
   * Append a string onto the vector.
   *
   * @param key String to append
   * @param value The int value of the string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public final int getLength()

  /**
   * Get the length of the list.
   *
   * @return the length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public StringToIntTable(int blocksize)

  /**
   * Construct a StringToIntTable, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  public StringToIntTable()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private int m_mapSize;

  /** Size of this table         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private int m_firstFree = 0;

  /** Number of ints in the table          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private int m_values[];

  /** Array of ints this table points. Associated with strings from
   * m_map.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private String m_map[];

  /** Array of strings this table points to. Associated with ints
   * in m_values         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
  private int m_blocksize;

  /** Block size to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/StringToIntTable.java
public final class StringToIntTable

/**
 * A very simple lookup table that stores a list of strings, the even
 * number strings being keys, and the odd number strings being values.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * This class is not a public API, it is only public so it can be used
 * in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final String[] keys()

  /**
   * Return array of keys in the table.
   *
   * @return Array of strings
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final boolean contains(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look for
   *
   * @return True if the string is in the table
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final int getIgnoreCase(String key)

  /**
   * Tell if the table contains the given string. Ignore case.
   *
   * @param key String to look for
   *
   * @return The string's int value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final int get(String key)

  /**
   * Tell if the table contains the given string.
   *
   * @param key String to look for
   *
   * @return The String's int value
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final void put(String key, int value)

  /**
   * Append a string onto the vector.
   *
   * @param key String to append
   * @param value The int value of the string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public final int getLength()

  /**
   * Get the length of the list.
   *
   * @return the length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public StringToIntTable(int blocksize)

  /**
   * Construct a StringToIntTable, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  public StringToIntTable()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private int m_mapSize;

  /** Size of this table         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private int m_firstFree = 0;

  /** Number of ints in the table          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private int m_values[];

  /** Array of ints this table points. Associated with strings from
   * m_map.         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private String m_map[];

  /** Array of strings this table points to. Associated with ints
   * in m_values         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
  private int m_blocksize;

  /** Block size to allocate          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringToIntTable.java
public class StringToIntTable

/**
 * A very simple lookup table that stores a list of strings, the even
 * number strings being keys, and the odd number strings being values.
 * @xsl.usage internal
 */
