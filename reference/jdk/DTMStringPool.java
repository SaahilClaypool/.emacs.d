_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
  public static void _main(String[] args)

  /** Command-line unit test driver. This test relies on the fact that
   * this version of the pool assigns indices consecutively, starting
   * from zero, as new unique strings are encountered.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
  public int stringToIndex(String s)

  /** @return integer index uniquely identifying the value of this string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
  public String indexToString(int i)

  /** @return string whose value is uniquely identified by this integer index.
   * @throws java.lang.ArrayIndexOutOfBoundsException
   *  if index doesn't map to a string.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
  public DTMStringPool(int chainSize)

  /**
   * Create a DTMStringPool using the given chain size
   *
   * @param chainSize The size of the hash chain vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
public class DTMStringPool

/** <p>DTMStringPool is an "interning" mechanism for strings. It will
 * create a stable 1:1 mapping between a set of string values and a set of
 * integer index values, so the integers can be used to reliably and
 * uniquely identify (and when necessary retrieve) the strings.</p>
 *
 * <p>Design Priorities:
 * <ul>
 * <li>String-to-index lookup speed is critical.</li>
 * <li>Index-to-String lookup speed is slightly less so.</li>
 * <li>Threadsafety is not guaranteed at this level.
 * Enforce that in the application if needed.</li>
 * <li>Storage efficiency is an issue but not a huge one.
 * It is expected that string pools won't exceed about 2000 entries.</li>
 * </ul>
 * </p>
 *
 * <p>Implementation detail: A standard Hashtable is relatively
 * inefficient when looking up primitive int values, especially when
 * we're already maintaining an int-to-string vector.  So I'm
 * maintaining a simple hash chain within this class.</p>
 *
 * <p>NOTE: There is nothing in the code that has a real dependency upon
 * String. It would work with any object type that implements reliable
 * .hashCode() and .equals() operations. The API enforces Strings because
 * it's safer that way, but this could trivially be turned into a general
 * ObjectPool if one was needed.</p>
 *
 * <p>Status: Passed basic test in main().</p>
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
  public static void _main(String[] args)

  /** Command-line unit test driver. This test relies on the fact that
   * this version of the pool assigns indices consecutively, starting
   * from zero, as new unique strings are encountered.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
  public int stringToIndex(String s)

  /** @return integer index uniquely identifying the value of this string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
  public String indexToString(int i)

  /** @return string whose value is uniquely identified by this integer index.
   * @throws java.lang.ArrayIndexOutOfBoundsException
   *  if index doesn't map to a string.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
  public DTMStringPool(int chainSize)

  /**
   * Create a DTMStringPool using the given chain size
   *
   * @param chainSize The size of the hash chain vector
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMStringPool.java
public class DTMStringPool

/** <p>DTMStringPool is an "interning" mechanism for strings. It will
 * create a stable 1:1 mapping between a set of string values and a set of
 * integer index values, so the integers can be used to reliably and
 * uniquely identify (and when necessary retrieve) the strings.</p>
 *
 * <p>Design Priorities:
 * <ul>
 * <li>String-to-index lookup speed is critical.</li>
 * <li>Index-to-String lookup speed is slightly less so.</li>
 * <li>Threadsafety is not guaranteed at this level.
 * Enforce that in the application if needed.</li>
 * <li>Storage efficiency is an issue but not a huge one.
 * It is expected that string pools won't exceed about 2000 entries.</li>
 * </ul>
 * </p>
 *
 * <p>Implementation detail: A standard Hashtable is relatively
 * inefficient when looking up primitive int values, especially when
 * we're already maintaining an int-to-string vector.  So I'm
 * maintaining a simple hash chain within this class.</p>
 *
 * <p>NOTE: There is nothing in the code that has a real dependency upon
 * String. It would work with any object type that implements reliable
 * .hashCode() and .equals() operations. The API enforces Strings because
 * it's safer that way, but this could trivially be turned into a general
 * ObjectPool if one was needed.</p>
 *
 * <p>Status: Passed basic test in main().</p>
 * */
