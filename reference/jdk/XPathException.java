_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPathException.java
    public XPathException(String key) {

    /** Constructs an exception with the specified key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPathException.java
    public XPathException() {

    /** Constructs an exception. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPathException.java
    static final long serialVersionUID = -948482312169512085L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPathException.java
public class XPathException

/**
 * XPath exception.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public Throwable getException()

  /**
   *  Return the embedded exception, if any.
   *  Overrides javax.xml.transform.TransformerException.getException().
   *
   *  @return The embedded exception, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public void printStackTrace(java.io.PrintWriter s)

  /**
   * Print the the trace of methods from where the error
   * originated.  This will trace all nested exception
   * objects, as well as this object.
   * @param s The writer where the dump will be sent to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public String getMessage()

  /**
   * Find the most contained message.
   *
   * @return The error message of the originating exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public void printStackTrace(java.io.PrintStream s)

  /**
   * Print the the trace of methods from where the error
   * originated.  This will trace all nested exception
   * objects, as well as this object.
   * @param s The stream where the dump will be sent to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message, Exception e)

  /**
   * Create an XPathException object that holds
   * an error message, and another exception
   * that caused this exception.
   * @param message The error message.
   * @param e The exception that caused this exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message, Node styleNode, Exception e)

  /**
   * Create an XPathException object that holds
   * an error message, the stylesheet node that
   * the error originated from, and another exception
   * that caused this exception.
   * @param message The error message.
   * @param styleNode The stylesheet node that the error originated from.
   * @param e The exception that caused this exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message, Object styleNode)

  /**
   * Create an XPathException object that holds
   * an error message and the stylesheet node that
   * the error originated from.
   * @param message The error message.
   * @param styleNode The stylesheet node that the error originated from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  protected ExpressionNode getExpressionOwner(ExpressionNode ex)

  /**
   * Get the first non-Expression parent of this node.
   * @return null or first ancestor that is not an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public org.w3c.dom.Node getStylesheetNode(ExpressionNode ex)

  /**
   * Get the XSLT ElemVariable that this sub-expression references.  In order for
   * this to work, the SourceLocator must be the owning ElemTemplateElement.
   * @return The dereference to the ElemVariable, or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message)

  /**
   * Create an XPathException object that holds
   * an error message.
   * @param message The error message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message, ExpressionNode ex)

  /**
   * Create an XPathException object that holds
   * an error message.
   * @param message The error message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  protected Exception m_exception;

  /** A nested exception.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public void setStylesheetNode(Object styleNode)

  /**
   * Set the stylesheet node from where this error originated.
   * @param styleNode The stylesheet node from where this error originated, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public Object getStylesheetNode()

  /**
   * Get the stylesheet node from where this error originated.
   * @return The stylesheet node from where this error originated, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  Object m_styleNode = null;

  /** The home of the expression that caused the error.
   *  @serial  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
public class XPathException extends TransformerException

/**
 * This class implements an exception object that all
 * XPath classes will throw in case of an error.  This class
 * extends TransformerException, and may hold other exceptions. In the
 * case of nested exceptions, printStackTrace will dump
 * all the traces of the nested exceptions, not just the trace
 * of this object.
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPathException.java
    public XPathException(String key) {

    /** Constructs an exception with the specified key. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPathException.java
    public XPathException() {

    /** Constructs an exception. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPathException.java
    static final long serialVersionUID = -948482312169512085L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xpath/XPathException.java
public class XPathException

/**
 * XPath exception.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public Throwable getException()

  /**
   *  Return the embedded exception, if any.
   *  Overrides javax.xml.transform.TransformerException.getException().
   *
   *  @return The embedded exception, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public void printStackTrace(java.io.PrintWriter s)

  /**
   * Print the the trace of methods from where the error
   * originated.  This will trace all nested exception
   * objects, as well as this object.
   * @param s The writer where the dump will be sent to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public String getMessage()

  /**
   * Find the most contained message.
   *
   * @return The error message of the originating exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public void printStackTrace(java.io.PrintStream s)

  /**
   * Print the the trace of methods from where the error
   * originated.  This will trace all nested exception
   * objects, as well as this object.
   * @param s The stream where the dump will be sent to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message, Exception e)

  /**
   * Create an XPathException object that holds
   * an error message, and another exception
   * that caused this exception.
   * @param message The error message.
   * @param e The exception that caused this exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message, Node styleNode, Exception e)

  /**
   * Create an XPathException object that holds
   * an error message, the stylesheet node that
   * the error originated from, and another exception
   * that caused this exception.
   * @param message The error message.
   * @param styleNode The stylesheet node that the error originated from.
   * @param e The exception that caused this exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message, Object styleNode)

  /**
   * Create an XPathException object that holds
   * an error message and the stylesheet node that
   * the error originated from.
   * @param message The error message.
   * @param styleNode The stylesheet node that the error originated from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  protected ExpressionNode getExpressionOwner(ExpressionNode ex)

  /**
   * Get the first non-Expression parent of this node.
   * @return null or first ancestor that is not an Expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public org.w3c.dom.Node getStylesheetNode(ExpressionNode ex)

  /**
   * Get the XSLT ElemVariable that this sub-expression references.  In order for
   * this to work, the SourceLocator must be the owning ElemTemplateElement.
   * @return The dereference to the ElemVariable, or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message)

  /**
   * Create an XPathException object that holds
   * an error message.
   * @param message The error message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public XPathException(String message, ExpressionNode ex)

  /**
   * Create an XPathException object that holds
   * an error message.
   * @param message The error message.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  protected Exception m_exception;

  /** A nested exception.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public void setStylesheetNode(Object styleNode)

  /**
   * Set the stylesheet node from where this error originated.
   * @param styleNode The stylesheet node from where this error originated, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  public Object getStylesheetNode()

  /**
   * Get the stylesheet node from where this error originated.
   * @return The stylesheet node from where this error originated, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
  Object m_styleNode = null;

  /** The home of the expression that caused the error.
   *  @serial  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathException.java
public class XPathException extends TransformerException

/**
 * This class implements an exception object that all
 * XPath classes will throw in case of an error.  This class
 * extends TransformerException, and may hold other exceptions. In the
 * case of nested exceptions, printStackTrace will dump
 * all the traces of the nested exceptions, not just the trace
 * of this object.
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
    public void printStackTrace(PrintWriter s) {

    /**
     * <p>Print stack trace to specified <code>PrintWriter</code>.</p>
     *
     * @param s Print stack trace to this <code>PrintWriter</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
    public void printStackTrace() {

    /**
     * <p>Print stack trace to <code>System.err</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
    public void printStackTrace(java.io.PrintStream s) {

    /**
     * <p>Print stack trace to specified <code>PrintStream</code>.</p>
     *
     * @param s Print stack trace to this <code>PrintStream</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
    private void readObject(ObjectInputStream in)

    /**
     * Reads the "cause" field from the stream.
     * And initializes the "cause" if it wasn't
     * done before.
     *
     * @param in stream used for deserialization
     * @throws IOException thrown by <code>ObjectInputStream</code>
     * @throws ClassNotFoundException  thrown by <code>ObjectInputStream</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Writes "cause" field to the stream.
     * The cause is got from the parent class.
     *
     * @param out stream used for serialization.
     * @throws IOException thrown by <code>ObjectOutputStream</code>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
    public Throwable getCause() {

    /**
     * <p>Get the cause of this XPathException.</p>
     *
     * @return Cause of this XPathException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
    public XPathException(Throwable cause) {

    /**
     * <p>Constructs a new <code>XPathException</code>
     * with the specified <code>cause</code>.</p>
     *
     * <p>If <code>cause</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param cause The cause.
     *
     * @throws NullPointerException if <code>cause</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
    public XPathException(String message) {

    /**
     * <p>Constructs a new <code>XPathException</code>
     * with the specified detail <code>message</code>.</p>
     *
     * <p>The <code>cause</code> is not initialized.</p>
     *
     * <p>If <code>message</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param message The detail message.
     *
     * @throws NullPointerException When <code>message</code> is
     *   <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
    private static final long serialVersionUID = -1837080260374986980L;

    /**
     * <p>Stream Unique Identifier.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathException.java
public class XPathException extends Exception {

/**
 * <code>XPathException</code> represents a generic XPath exception.</p>
 *
 * @author  <a href="Norman.Walsh@Sun.com">Norman Walsh</a>
 * @author <a href="mailto:Jeff.Suttor@Sun.COM">Jeff Suttor</a>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathException.java
    public static final short INVALID_EXPRESSION_ERR    = 1;

    /**
     * If the expression has a syntax error or otherwise is not a legal
     * expression according to the rules of the specific
     * <code>XPathEvaluator</code> or contains specialized extension
     * functions or variables not supported by this implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/xpath/XPathException.java
public class XPathException extends RuntimeException {

/**
 * A new exception has been created for exceptions specific to these XPath
 * interfaces.
 * <p>See also the <a href='http://www.w3.org/2002/08/WD-DOM-Level-3-XPath-20020820'>Document Object Model (DOM) Level 3 XPath Specification</a>.
 */
