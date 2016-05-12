_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMSafeStringPool.java
  public static void _main(String[] args)

  /** Command-line unit test driver. This test relies on the fact that
   * this version of the pool assigns indices consecutively, starting
   * from zero, as new unique strings are encountered.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMSafeStringPool.java
  public synchronized int stringToIndex(String s)

  /** @return integer index uniquely identifying the value of this string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMSafeStringPool.java
  public synchronized String indexToString(int i)

  /** @return string whose value is uniquely identified by this integer index.
   * @throws java.lang.ArrayIndexOutOfBoundsException
   *  if index doesn't map to a string.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMSafeStringPool.java
public class DTMSafeStringPool

/** <p>Like DTMStringPool, but threadsafe. It's been proposed that DTMs
 * share their string pool(s); that raises threadsafety issues which
 * this addresses. Of course performance is inferior to that of the
 * bare-bones version.</p>
 *
 * <p>Status: Passed basic test in main().</p>
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMSafeStringPool.java
  public static void _main(String[] args)

  /** Command-line unit test driver. This test relies on the fact that
   * this version of the pool assigns indices consecutively, starting
   * from zero, as new unique strings are encountered.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMSafeStringPool.java
  public synchronized int stringToIndex(String s)

  /** @return integer index uniquely identifying the value of this string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMSafeStringPool.java
  public synchronized String indexToString(int i)

  /** @return string whose value is uniquely identified by this integer index.
   * @throws java.lang.ArrayIndexOutOfBoundsException
   *  if index doesn't map to a string.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMSafeStringPool.java
public class DTMSafeStringPool

/** <p>Like DTMStringPool, but threadsafe. It's been proposed that DTMs
 * share their string pool(s); that raises threadsafety issues which
 * this addresses. Of course performance is inferior to that of the
 * bare-bones version.</p>
 *
 * <p>Status: Passed basic test in main().</p>
 * */
