_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  public synchronized void freeInstance(DTMIterator obj)

  /**
   * Add an instance of the given object to the pool
   *
   *
   * @param obj Object to add.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  public synchronized DTMIterator getInstance()

  /**
   * Get an instance of the given object in this pool
   *
   * @return An instance of the given object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  public synchronized DTMIterator getInstanceOrThrow()

  /**
   * Get an instance of the given object in this pool
   *
   * @return An instance of the given object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  public IteratorPool(DTMIterator original)

  /**
   * Constructor IteratorPool
   *
   * @param original The original iterator from which all others will be cloned.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  private final ArrayList m_freeStack;

  /**
   * Stack of given objects this points to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  private final DTMIterator m_orig;

  /**
   * Type of objects in this pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
public final class IteratorPool implements java.io.Serializable

/**
 * Pool of object of a given type to pick from to help memory usage
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  public synchronized void freeInstance(DTMIterator obj)

  /**
   * Add an instance of the given object to the pool
   *
   *
   * @param obj Object to add.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  public synchronized DTMIterator getInstance()

  /**
   * Get an instance of the given object in this pool
   *
   * @return An instance of the given object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  public synchronized DTMIterator getInstanceOrThrow()

  /**
   * Get an instance of the given object in this pool
   *
   * @return An instance of the given object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  public IteratorPool(DTMIterator original)

  /**
   * Constructor IteratorPool
   *
   * @param original The original iterator from which all others will be cloned.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  private final ArrayList m_freeStack;

  /**
   * Stack of given objects this points to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
  private final DTMIterator m_orig;

  /**
   * Type of objects in this pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/IteratorPool.java
public final class IteratorPool implements java.io.Serializable

/**
 * Pool of object of a given type to pick from to help memory usage
 * @xsl.usage internal
 */
