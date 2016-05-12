_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
    public abstract long getSize();

    /** @return size of class file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
    public abstract long getTime();

    /** @return modification time of class file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
    public abstract String getBase();

    /** @return base path of found class, i.e. class is contained relative
     * to that path, which may either denote a directory, or zip file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
    public abstract String getPath();

    /** @return canonical path to class file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public interface ClassFile {

  /** Contains information about file/ZIP entry of the Java class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public String getPath(String name, String suffix) throws IOException {

  /**
   * @param name name of file to search for, e.g. java/lang/String
   * @param suffix file name suffix, e.g. .java
   * @return full (canonical) path for file, if it exists
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public String getPath(String name) throws IOException {

  /**
   * @param name name of file to search for, e.g. java/lang/String.java
   * @return full (canonical) path for file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public byte[] getBytes(String name) throws IOException {

  /**
   * @return byte array for class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public byte[] getBytes(String name, String suffix) throws IOException {

  /**
   * @param name fully qualified file name, e.g. java/lang/String
   * @param suffix file name ends with suffix, e.g. .java
   * @return byte array for file on class path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public ClassFile getClassFile(String name) throws IOException {

  /**
   * @param name fully qualified class name, e.g. java.lang.String
   * @return input stream for class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public ClassFile getClassFile(String name, String suffix) throws IOException {

  /**
   * @param name fully qualified file name, e.g. java/lang/String
   * @param suffix file name ends with suff, e.g. .java
   * @return class file for the java class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public InputStream getInputStream(String name, String suffix) throws IOException {

  /**
   * Return stream for class or resource on CLASSPATH.
   *
   * @param name fully qualified file name, e.g. java/lang/String
   * @param suffix file name ends with suff, e.g. .java
   * @return input stream for file on class path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public InputStream getInputStream(String name) throws IOException {

  /**
   * @param name fully qualified class name, e.g. java.lang.String
   * @return input stream for class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public static final String getClassPath() {

  /** Checks for class path components in the following properties:
   * "java.class.path", "sun.boot.class.path", "java.ext.dirs"
   *
   * @return class path as used by default by BCEL
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public String toString() {

  /** @return used class path string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public ClassPath() {

  /**
   * Search for classes in CLASSPATH.
   * @deprecated Use SYSTEM_CLASS_PATH constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public ClassPath(String class_path) {

  /**
   * Search for classes in given path.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
public class ClassPath implements Serializable {

/**
 * Responsible for loading (class) files from the CLASSPATH. Inspired by
 * sun.tools.ClassPath.
 *
 * @version $Id: ClassPath.java,v 1.4 2007-07-19 04:34:52 ofung Exp $
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
    public abstract long getSize();

    /** @return size of class file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
    public abstract long getTime();

    /** @return modification time of class file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
    public abstract String getBase();

    /** @return base path of found class, i.e. class is contained relative
     * to that path, which may either denote a directory, or zip file
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
    public abstract String getPath();

    /** @return canonical path to class file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public interface ClassFile {

  /** Contains information about file/ZIP entry of the Java class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public String getPath(String name, String suffix) throws IOException {

  /**
   * @param name name of file to search for, e.g. java/lang/String
   * @param suffix file name suffix, e.g. .java
   * @return full (canonical) path for file, if it exists
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public String getPath(String name) throws IOException {

  /**
   * @param name name of file to search for, e.g. java/lang/String.java
   * @return full (canonical) path for file
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public byte[] getBytes(String name) throws IOException {

  /**
   * @return byte array for class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public byte[] getBytes(String name, String suffix) throws IOException {

  /**
   * @param name fully qualified file name, e.g. java/lang/String
   * @param suffix file name ends with suffix, e.g. .java
   * @return byte array for file on class path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public ClassFile getClassFile(String name) throws IOException {

  /**
   * @param name fully qualified class name, e.g. java.lang.String
   * @return input stream for class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public ClassFile getClassFile(String name, String suffix) throws IOException {

  /**
   * @param name fully qualified file name, e.g. java/lang/String
   * @param suffix file name ends with suff, e.g. .java
   * @return class file for the java class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public InputStream getInputStream(String name, String suffix) throws IOException {

  /**
   * Return stream for class or resource on CLASSPATH.
   *
   * @param name fully qualified file name, e.g. java/lang/String
   * @param suffix file name ends with suff, e.g. .java
   * @return input stream for file on class path
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public InputStream getInputStream(String name) throws IOException {

  /**
   * @param name fully qualified class name, e.g. java.lang.String
   * @return input stream for class
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public static final String getClassPath() {

  /** Checks for class path components in the following properties:
   * "java.class.path", "sun.boot.class.path", "java.ext.dirs"
   *
   * @return class path as used by default by BCEL
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public String toString() {

  /** @return used class path string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public ClassPath() {

  /**
   * Search for classes in CLASSPATH.
   * @deprecated Use SYSTEM_CLASS_PATH constant
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
  public ClassPath(String class_path) {

  /**
   * Search for classes in given path.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/bcel/internal/util/ClassPath.java
public class ClassPath implements Serializable {

/**
 * Responsible for loading (class) files from the CLASSPATH. Inspired by
 * sun.tools.ClassPath.
 *
 * @version $Id: ClassPath.java,v 1.4 2007-07-19 04:34:52 ofung Exp $
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
