_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
  public int getUtf16Offset(){

  /**
   * The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646],
   * offset into the input source this locator is pointing to or -1 if there
   * is no UTF-16 offset available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
  public int getByteOffset(){

  /**
   * The byte offset into the input source this locator is pointing to or -1
   * if there is no byte offset available
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
  public String getUri(){

  /**
   * The URI where the error occured, or null if there is no URI available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
  public int getColumnNumber(){

  /**
   * The column number where the error occured, or -1 if there is no column
   * number available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int getLineNumber(){

  /**
   * The line number where the error occured, or -1 if there is no line
   * number available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int fUtf16Offset = -1;

   /**
    * The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646],
    * offset into the input source this locator is pointing to or -1 if there
    * is no UTF-16 offset available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int fByteOffset = -1;

   /**
    * The byte offset into the input source this locator is pointing to or -1
    * if there is no byte offset available
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public String fUri = null;

   /**
    * The URI where the error occured,
    * or null if there is no URI available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public Node fRelatedNode = null;

   /** related data node*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int fLineNumber = -1;

   /**
    * The line number where the error occured,
    * or -1 if there is no line number available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int fColumnNumber = -1;

   /**
    * The column number where the error occured,
    * or -1 if there is no column number available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
public class DOMLocatorImpl implements DOMLocator {

/**
 * <code>DOMLocatorImpl</code> is an implementaion that describes a location (e.g.
 * where an error occured).
 * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010913'>Document Object Model (DOM) Level 3 Core Specification</a>.
 *
 * @xerces.internal
 *
 * @author Gopal Sharma, SUN Microsystems Inc.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
  public int getUtf16Offset(){

  /**
   * The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646],
   * offset into the input source this locator is pointing to or -1 if there
   * is no UTF-16 offset available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
  public int getByteOffset(){

  /**
   * The byte offset into the input source this locator is pointing to or -1
   * if there is no byte offset available
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
  public String getUri(){

  /**
   * The URI where the error occured, or null if there is no URI available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
  public int getColumnNumber(){

  /**
   * The column number where the error occured, or -1 if there is no column
   * number available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int getLineNumber(){

  /**
   * The line number where the error occured, or -1 if there is no line
   * number available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int fUtf16Offset = -1;

   /**
    * The UTF-16, as defined in [Unicode] and Amendment 1 of [ISO/IEC 10646],
    * offset into the input source this locator is pointing to or -1 if there
    * is no UTF-16 offset available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int fByteOffset = -1;

   /**
    * The byte offset into the input source this locator is pointing to or -1
    * if there is no byte offset available
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public String fUri = null;

   /**
    * The URI where the error occured,
    * or null if there is no URI available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public Node fRelatedNode = null;

   /** related data node*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int fLineNumber = -1;

   /**
    * The line number where the error occured,
    * or -1 if there is no line number available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
   public int fColumnNumber = -1;

   /**
    * The column number where the error occured,
    * or -1 if there is no column number available.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DOMLocatorImpl.java
public class DOMLocatorImpl implements DOMLocator {

/**
 * <code>DOMLocatorImpl</code> is an implementaion that describes a location (e.g.
 * where an error occured).
 * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-Core-20010913'>Document Object Model (DOM) Level 3 Core Specification</a>.
 *
 * @xerces.internal
 *
 * @author Gopal Sharma, SUN Microsystems Inc.
 */
