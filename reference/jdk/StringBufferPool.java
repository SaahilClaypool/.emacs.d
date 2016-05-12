_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringBufferPool.java
  public synchronized static void free(FastStringBuffer sb)

  /**
   * Return a string buffer back to the pool.
   *
   * @param sb Must be a non-null reference to a string buffer.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringBufferPool.java
  public synchronized static FastStringBuffer get()

  /**
   * Get the first free instance of a string buffer, or create one
   * if there are no free instances.
   *
   * @return A string buffer ready for use.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringBufferPool.java
  private static ObjectPool m_stringBufPool =

  /** The global pool of string buffers.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringBufferPool.java
public class StringBufferPool

/**
 * This class pools string buffers, since they are reused so often.
 * String buffers are good candidates for pooling, because of
 * their supporting character arrays.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringBufferPool.java
  public synchronized static void free(FastStringBuffer sb)

  /**
   * Return a string buffer back to the pool.
   *
   * @param sb Must be a non-null reference to a string buffer.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringBufferPool.java
  public synchronized static FastStringBuffer get()

  /**
   * Get the first free instance of a string buffer, or create one
   * if there are no free instances.
   *
   * @return A string buffer ready for use.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringBufferPool.java
  private static ObjectPool m_stringBufPool =

  /** The global pool of string buffers.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/StringBufferPool.java
public class StringBufferPool

/**
 * This class pools string buffers, since they are reused so often.
 * String buffers are good candidates for pooling, because of
 * their supporting character arrays.
 * @xsl.usage internal
 */
