_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public synchronized void freeInstance(Object obj)

  /**
   * Add an instance of the given object to the pool
   *
   *
   * @param obj Object to add.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public synchronized Object getInstance()

  /**
   * Get an instance of the given object in this pool
   *
   *
   * @return An instance of the given object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public synchronized Object getInstanceIfFree()

  /**
   * Get an instance of the given object in this pool if available
   *
   *
   * @return an instance of the given object if available or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public ObjectPool()

  /**
   * Constructor ObjectPool
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public ObjectPool(Class type, int size)

  /**
   * Constructor ObjectPool
   *
   *
   * @param type Type of objects for this pool
   * @param size Size of vector to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public ObjectPool(String className)

  /**
   * Constructor ObjectPool
   *
   * @param className Fully qualified name of the type of objects for this pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public ObjectPool(Class type)

  /**
   * Constructor ObjectPool
   *
   * @param type Type of objects for this pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  private final ArrayList freeStack;

  /** Stack of given objects this points to.
   *  @serial          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  private final Class objectType;

  /** Type of objects in this pool.
   *  @serial          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
public class ObjectPool implements java.io.Serializable

/**
 * Pool of object of a given type to pick from to help memory usage
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public synchronized void freeInstance(Object obj)

  /**
   * Add an instance of the given object to the pool
   *
   *
   * @param obj Object to add.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public synchronized Object getInstance()

  /**
   * Get an instance of the given object in this pool
   *
   *
   * @return An instance of the given object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public synchronized Object getInstanceIfFree()

  /**
   * Get an instance of the given object in this pool if available
   *
   *
   * @return an instance of the given object if available or null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public ObjectPool()

  /**
   * Constructor ObjectPool
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public ObjectPool(Class type, int size)

  /**
   * Constructor ObjectPool
   *
   *
   * @param type Type of objects for this pool
   * @param size Size of vector to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public ObjectPool(String className)

  /**
   * Constructor ObjectPool
   *
   * @param className Fully qualified name of the type of objects for this pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  public ObjectPool(Class type)

  /**
   * Constructor ObjectPool
   *
   * @param type Type of objects for this pool
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  private final ArrayList freeStack;

  /** Stack of given objects this points to.
   *  @serial          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
  private final Class objectType;

  /** Type of objects in this pool.
   *  @serial          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectPool.java
public class ObjectPool implements java.io.Serializable

/**
 * Pool of object of a given type to pick from to help memory usage
 * @xsl.usage internal
 */
