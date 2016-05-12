_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
    Object m_Value;

    /** The value.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
    Node m_nextChar[];

    /** The next nodes.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
    Node()

    /**
     * Constructor, creates a Node[ALPHA_SIZE].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  class Node

  /**
   * The node representation for the trie.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
public Object get(final String key)

  /**
   * Get an object that matches the key.
   *
   * @param key must be a 7-bit ASCII string
   *
   * @return The object that matches the key, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  public Object put(String key, Object value)

  /**
   * Put an object into the trie for lookup.
   *
   * @param key must be a 7-bit ASCII string
   * @param value any java object.
   *
   * @return The old object that matched key, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  public Trie()

  /**
   * Construct the trie.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  private char[] m_charBuffer = new char[0];

  /** helper buffer to convert Strings to char arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  Node m_Root;

  /** The root node of the tree.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  public static final int ALPHA_SIZE = 128;

  /** Size of the m_nextChar array.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
public class Trie

/**
 * A digital search trie for 7-bit ASCII text
 * The API is a subset of java.util.Hashtable
 * The key must be a 7-bit ASCII string
 * The value may be any Java Object
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
    Object m_Value;

    /** The value.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
    Node m_nextChar[];

    /** The next nodes.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
    Node()

    /**
     * Constructor, creates a Node[ALPHA_SIZE].
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  class Node

  /**
   * The node representation for the trie.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
public Object get(final String key)

  /**
   * Get an object that matches the key.
   *
   * @param key must be a 7-bit ASCII string
   *
   * @return The object that matches the key, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  public Object put(String key, Object value)

  /**
   * Put an object into the trie for lookup.
   *
   * @param key must be a 7-bit ASCII string
   * @param value any java object.
   *
   * @return The old object that matched key, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  public Trie()

  /**
   * Construct the trie.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  private char[] m_charBuffer = new char[0];

  /** helper buffer to convert Strings to char arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  Node m_Root;

  /** The root node of the tree.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
  public static final int ALPHA_SIZE = 128;

  /** Size of the m_nextChar array.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/Trie.java
public class Trie

/**
 * A digital search trie for 7-bit ASCII text
 * The API is a subset of java.util.Hashtable
 * The key must be a 7-bit ASCII string
 * The value may be any Java Object
 * @xsl.usage internal
 */
