_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public void clear() {

  /** Clear all entries from cache.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public JavaClass loadClass(Class clazz) throws ClassNotFoundException {

  /**
   * Try to find class source via getResourceAsStream().
   * @see Class
   * @return JavaClass object for given runtime class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public JavaClass loadClass(String className)

  /**
   * Load a JavaClass object for the given class name using
   * the CLASSPATH environment variable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public JavaClass findClass(String className) {

  /**
   * Find an already defined (cached) JavaClass object by name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public void removeClass(JavaClass clazz) {

  /**
   * Remove class from repository
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public void storeClass(JavaClass clazz) {

  /**
   * Store a new JavaClass instance into this Repository.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
public class SyntheticRepository implements Repository {

/**
 * This repository is used in situations where a Class is created
 * outside the realm of a ClassLoader. Classes are loaded from
 * the file systems using the paths specified in the given
 * class path. By default, this is the value returned by
 * ClassPath.getClassPath().
 * <br>
 * It is designed to be used as a singleton, however it
 * can also be used with custom classpaths.
 *
/**
 * Abstract definition of a class repository. Instances may be used
 * to load classes from different sources and may be used in the
 * Repository.setRepository method.
 *
 * @see com.sun.org.apache.bcel.internal.Repository
 *
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @author David Dixon-Peugh
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public void clear() {

  /** Clear all entries from cache.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public JavaClass loadClass(Class clazz) throws ClassNotFoundException {

  /**
   * Try to find class source via getResourceAsStream().
   * @see Class
   * @return JavaClass object for given runtime class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public JavaClass loadClass(String className)

  /**
   * Load a JavaClass object for the given class name using
   * the CLASSPATH environment variable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public JavaClass findClass(String className) {

  /**
   * Find an already defined (cached) JavaClass object by name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public void removeClass(JavaClass clazz) {

  /**
   * Remove class from repository
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
  public void storeClass(JavaClass clazz) {

  /**
   * Store a new JavaClass instance into this Repository.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/SyntheticRepository.java
public class SyntheticRepository implements Repository {

/**
 * This repository is used in situations where a Class is created
 * outside the realm of a ClassLoader. Classes are loaded from
 * the file systems using the paths specified in the given
 * class path. By default, this is the value returned by
 * ClassPath.getClassPath().
 * <br>
 * It is designed to be used as a singleton, however it
 * can also be used with custom classpaths.
 *
/**
 * Abstract definition of a class repository. Instances may be used
 * to load classes from different sources and may be used in the
 * Repository.setRepository method.
 *
 * @see com.sun.org.apache.bcel.internal.Repository
 *
 * @author <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 * @author David Dixon-Peugh
 */
