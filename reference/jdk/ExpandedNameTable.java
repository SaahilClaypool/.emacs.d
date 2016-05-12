_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static final class HashEntry

  /**
   * Inner class which represents a hash table entry.
   * The field next points to the next entry which is hashed into
   * the same bucket in the case of "hash collision".
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public ExtendedType[] getExtendedTypes()

  /**
   * Return the array of extended types
   *
   * @return The array of extended types
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public int getSize()

  /**
   * Return the size of the ExpandedNameTable
   *
   * @return The size of the ExpandedNameTable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public final short getType(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the local name ID.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return The id of this local name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public final int getNamespaceID(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the namespace URI ID.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return The id of this namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public String getNamespace(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the namespace URI part.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public final int getLocalNameID(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the local name ID.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return The id of this local name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public String getLocalName(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the local name part.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return String Local name of this node, or null if the node has no name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public int getExpandedTypeID(int type)

  /**
   * Given a type, return an expanded name ID.Any additional nodes that are
   * created that have this expanded name will use this ID.
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private void rehash()

  /**
   * Increases the capacity of and internally reorganizes the hashtable,
   * in order to accommodate and access its entries more efficiently.
   * This method is called when the number of keys in the hashtable exceeds
   * this hashtable's capacity and load factor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public int getExpandedTypeID(String namespace, String localName, int type, boolean searchOnly)

  /**
   * Given an expanded name represented by namespace, local name and node type,
   * return an ID.  If the expanded-name does not exist in the internal tables,
   * the entry will be created, and the ID will be returned.  Any additional
   * nodes that are created that have this expanded name will use this ID.
   * <p>
   * If searchOnly is true, we will return -1 if the name is not found in the
   * table, otherwise the name is added to the table and the expanded name id
   * of the new entry is returned.
   *
   * @param namespace The namespace
   * @param localName The local name
   * @param type The node type
   * @param searchOnly If it is true, we will only search for the expanded name.
   * -1 is return is the name is not found.
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public int getExpandedTypeID(String namespace, String localName, int type)

  /**
   * Given an expanded name represented by namespace, local name and node type,
   * return an ID.  If the expanded-name does not exist in the internal tables,
   * the entry will be created, and the ID will be returned.  Any additional
   * nodes that are created that have this expanded name will use this ID.
   *
   * @param namespace The namespace
   * @param localName The local name
   * @param type The node type
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private void initExtendedTypes()

  /**
   *  Initialize the vector of extended types with the
   *  basic DOM node types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public ExpandedNameTable()

  /**
   * Create an expanded name table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  static {

  /**
   * Init default values
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private HashEntry[] m_table;

  /**
   * The internal array to store the hash entries.
   * Each array member is a slot for a hash bucket.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private int m_threshold;

  /**
   * The threshold of the hash table, which is equal to capacity * loadFactor.
   * If the number of entries in the hash table is bigger than the threshold,
   * the hash table needs to be expanded.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private int m_capacity;

  /**
   * The capacity of the hash table, i.e. the size of the
   * internal HashEntry array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static int m_initialCapacity = 203;

  /**
   * The initial capacity of the hash table. Use a bigger number
   * to avoid the cost of expanding the table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static float m_loadFactor = 0.75f;

  /**
   * The default load factor of the Hashtable.
   * This is used to calcualte the threshold.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static ExtendedType[] m_defaultExtendedTypes;

  /** The array to store the default extended types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  ExtendedType hashET = new ExtendedType(-1, "", "");

  /** Workspace for lookup. NOT THREAD SAFE!
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  // %REVIEW% Since this is (should be) always equal

  /** Next available extended type   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static int m_initialSize = 128;

  /** The initial size of the m_extendedTypes array */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private ExtendedType[] m_extendedTypes;

  /** Array of extended types for this document   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
public class ExpandedNameTable

/**
 * This is a default implementation of a table that manages mappings from
 * expanded names to expandedNameIDs.
 *
 * %OPT% The performance of the getExpandedTypeID() method is very important
 * to DTM building. To get the best performance out of this class, we implement
 * a simple hash algorithm directly into this class, instead of using the
 * inefficient java.util.Hashtable. The code for the get and put operations
 * are combined in getExpandedTypeID() method to share the same hash calculation
 * code. We only need to implement the rehash() interface which is used to
 * expand the hash table.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static final class HashEntry

  /**
   * Inner class which represents a hash table entry.
   * The field next points to the next entry which is hashed into
   * the same bucket in the case of "hash collision".
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public ExtendedType[] getExtendedTypes()

  /**
   * Return the array of extended types
   *
   * @return The array of extended types
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public int getSize()

  /**
   * Return the size of the ExpandedNameTable
   *
   * @return The size of the ExpandedNameTable
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public final short getType(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the local name ID.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return The id of this local name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public final int getNamespaceID(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the namespace URI ID.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return The id of this namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public String getNamespace(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the namespace URI part.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public final int getLocalNameID(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the local name ID.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return The id of this local name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public String getLocalName(int ExpandedNameID)

  /**
   * Given an expanded-name ID, return the local name part.
   *
   * @param ExpandedNameID an ID that represents an expanded-name.
   * @return String Local name of this node, or null if the node has no name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public int getExpandedTypeID(int type)

  /**
   * Given a type, return an expanded name ID.Any additional nodes that are
   * created that have this expanded name will use this ID.
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private void rehash()

  /**
   * Increases the capacity of and internally reorganizes the hashtable,
   * in order to accommodate and access its entries more efficiently.
   * This method is called when the number of keys in the hashtable exceeds
   * this hashtable's capacity and load factor.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public int getExpandedTypeID(String namespace, String localName, int type, boolean searchOnly)

  /**
   * Given an expanded name represented by namespace, local name and node type,
   * return an ID.  If the expanded-name does not exist in the internal tables,
   * the entry will be created, and the ID will be returned.  Any additional
   * nodes that are created that have this expanded name will use this ID.
   * <p>
   * If searchOnly is true, we will return -1 if the name is not found in the
   * table, otherwise the name is added to the table and the expanded name id
   * of the new entry is returned.
   *
   * @param namespace The namespace
   * @param localName The local name
   * @param type The node type
   * @param searchOnly If it is true, we will only search for the expanded name.
   * -1 is return is the name is not found.
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public int getExpandedTypeID(String namespace, String localName, int type)

  /**
   * Given an expanded name represented by namespace, local name and node type,
   * return an ID.  If the expanded-name does not exist in the internal tables,
   * the entry will be created, and the ID will be returned.  Any additional
   * nodes that are created that have this expanded name will use this ID.
   *
   * @param namespace The namespace
   * @param localName The local name
   * @param type The node type
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private void initExtendedTypes()

  /**
   *  Initialize the vector of extended types with the
   *  basic DOM node types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  public ExpandedNameTable()

  /**
   * Create an expanded name table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  static {

  /**
   * Init default values
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private HashEntry[] m_table;

  /**
   * The internal array to store the hash entries.
   * Each array member is a slot for a hash bucket.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private int m_threshold;

  /**
   * The threshold of the hash table, which is equal to capacity * loadFactor.
   * If the number of entries in the hash table is bigger than the threshold,
   * the hash table needs to be expanded.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private int m_capacity;

  /**
   * The capacity of the hash table, i.e. the size of the
   * internal HashEntry array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static int m_initialCapacity = 203;

  /**
   * The initial capacity of the hash table. Use a bigger number
   * to avoid the cost of expanding the table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static float m_loadFactor = 0.75f;

  /**
   * The default load factor of the Hashtable.
   * This is used to calcualte the threshold.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static ExtendedType[] m_defaultExtendedTypes;

  /** The array to store the default extended types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  ExtendedType hashET = new ExtendedType(-1, "", "");

  /** Workspace for lookup. NOT THREAD SAFE!
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  // %REVIEW% Since this is (should be) always equal

  /** Next available extended type   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private static int m_initialSize = 128;

  /** The initial size of the m_extendedTypes array */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
  private ExtendedType[] m_extendedTypes;

  /** Array of extended types for this document   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ExpandedNameTable.java
public class ExpandedNameTable

/**
 * This is a default implementation of a table that manages mappings from
 * expanded names to expandedNameIDs.
 *
 * %OPT% The performance of the getExpandedTypeID() method is very important
 * to DTM building. To get the best performance out of this class, we implement
 * a simple hash algorithm directly into this class, instead of using the
 * inefficient java.util.Hashtable. The code for the get and put operations
 * are combined in getExpandedTypeID() method to share the same hash calculation
 * code. We only need to implement the rehash() interface which is used to
 * expand the hash table.
 */
