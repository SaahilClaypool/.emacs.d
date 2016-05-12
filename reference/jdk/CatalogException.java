_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public String toString ()

  /**
   * Override toString to pick up any embedded exception.
   *
   * @return A string representation of this exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public int getExceptionType ()

  /**
   * Return the exception type
   *
   * @return The exception type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public Exception getException ()

  /**
   * Return the embedded exception, if any.
   *
   * @return The embedded exception, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public String getMessage ()

  /**
   * Return a detail message for this exception.
   *
   * <p>If there is an embedded exception, and if the CatalogException
   * has no detail message of its own, this method will return
   * the detail message from the embedded exception.</p>
   *
   * @return The error or warning message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public CatalogException (String message, Exception e) {

  /**
   * Create a new CatalogException from an existing exception.
   *
   * <p>The existing exception will be embedded in the new
   * one, but the new exception will have its own message.</p>
   *
   * @param message The detail message.
   * @param e The exception to be wrapped in a CatalogException.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public CatalogException (Exception e) {

  /**
   * Create a new CatalogException wrapping an existing exception.
   *
   * <p>The existing exception will be embedded in the new
   * one, and its message will become the default message for
   * the CatalogException.</p>
   *
   * @param e The exception to be wrapped in a CatalogException.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public CatalogException (int type) {

  /**
   * Create a new CatalogException.
   *
   * @param type The exception type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public CatalogException (int type, String message) {

  /**
   * Create a new CatalogException.
   *
   * @param type The exception type
   * @param message The error or warning message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  private Exception exception = null;

  /**
   * The embedded exception if tunnelling, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public static final int UNENDED_COMMENT = 8;

  /** Text catalog ended in mid-comment */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public static final int UNPARSEABLE = 6;

  /** Unparseable XML catalog (not XML)*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public static final int NO_XML_PARSER = 4;

  /** Could not instantiate an XML parser */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public static final int INVALID_ENTRY = 2;

  /** An invalid entry */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
public class CatalogException extends Exception {

/**
 * Signal Catalog exception.
 *
 * <p>This exception is thrown if an error occurs loading a
 * catalog file.</p>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public String toString ()

  /**
   * Override toString to pick up any embedded exception.
   *
   * @return A string representation of this exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public int getExceptionType ()

  /**
   * Return the exception type
   *
   * @return The exception type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public Exception getException ()

  /**
   * Return the embedded exception, if any.
   *
   * @return The embedded exception, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public String getMessage ()

  /**
   * Return a detail message for this exception.
   *
   * <p>If there is an embedded exception, and if the CatalogException
   * has no detail message of its own, this method will return
   * the detail message from the embedded exception.</p>
   *
   * @return The error or warning message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public CatalogException (String message, Exception e) {

  /**
   * Create a new CatalogException from an existing exception.
   *
   * <p>The existing exception will be embedded in the new
   * one, but the new exception will have its own message.</p>
   *
   * @param message The detail message.
   * @param e The exception to be wrapped in a CatalogException.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public CatalogException (Exception e) {

  /**
   * Create a new CatalogException wrapping an existing exception.
   *
   * <p>The existing exception will be embedded in the new
   * one, and its message will become the default message for
   * the CatalogException.</p>
   *
   * @param e The exception to be wrapped in a CatalogException.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public CatalogException (int type) {

  /**
   * Create a new CatalogException.
   *
   * @param type The exception type
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public CatalogException (int type, String message) {

  /**
   * Create a new CatalogException.
   *
   * @param type The exception type
   * @param message The error or warning message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  private Exception exception = null;

  /**
   * The embedded exception if tunnelling, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public static final int UNENDED_COMMENT = 8;

  /** Text catalog ended in mid-comment */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public static final int UNPARSEABLE = 6;

  /** Unparseable XML catalog (not XML)*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public static final int NO_XML_PARSER = 4;

  /** Could not instantiate an XML parser */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
  public static final int INVALID_ENTRY = 2;

  /** An invalid entry */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogException.java
public class CatalogException extends Exception {

/**
 * Signal Catalog exception.
 *
 * <p>This exception is thrown if an error occurs loading a
 * catalog file.</p>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
