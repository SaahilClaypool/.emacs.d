_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public com.sun.org.apache.xpath.internal.XPathContext getXPathContext()

  /**
   * Get the XPathContext that owns this ExpressionContext.
   *
   * Note: exslt:function requires the XPathContext to access
   * the variable stack and TransformerImpl.
   *
   * @return The current XPathContext.
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public XObject getVariableOrParam(com.sun.org.apache.xml.internal.utils.QName qname)

  /**
   * Get a variable based on it's qualified name.
   *
   * @param qname The qualified name of the variable.
   *
   * @return The evaluated value of the variable.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public String toString(Node n);

  /**
   * Get the value of a node as a string.
   * @param n Node to be converted to a string.  May be null.
   * @return value of n as a string, or an empty string if n is null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public double toNumber(Node n);

  /**
   * Get the value of a node as a number.
   * @param n Node to be converted to a number.  May be null.
   * @return value of n as a number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public ErrorListener getErrorListener();

  /**
   * Get the error listener.
   * @return The registered error listener.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public NodeIterator getContextNodes();

  /**
   * Get the current context node list.
   * @return An iterator for the current context list, as
   * defined in XSLT.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public Node getContextNode();

  /**
   * Get the current context node.
   * @return The current context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
public interface ExpressionContext

/**
 * An object that implements this interface can supply
 * information about the current XPath expression context.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public com.sun.org.apache.xpath.internal.XPathContext getXPathContext()

  /**
   * Get the XPathContext that owns this ExpressionContext.
   *
   * Note: exslt:function requires the XPathContext to access
   * the variable stack and TransformerImpl.
   *
   * @return The current XPathContext.
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public XObject getVariableOrParam(com.sun.org.apache.xml.internal.utils.QName qname)

  /**
   * Get a variable based on it's qualified name.
   *
   * @param qname The qualified name of the variable.
   *
   * @return The evaluated value of the variable.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public String toString(Node n);

  /**
   * Get the value of a node as a string.
   * @param n Node to be converted to a string.  May be null.
   * @return value of n as a string, or an empty string if n is null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public double toNumber(Node n);

  /**
   * Get the value of a node as a number.
   * @param n Node to be converted to a number.  May be null.
   * @return value of n as a number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public ErrorListener getErrorListener();

  /**
   * Get the error listener.
   * @return The registered error listener.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public NodeIterator getContextNodes();

  /**
   * Get the current context node list.
   * @return An iterator for the current context list, as
   * defined in XSLT.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
  public Node getContextNode();

  /**
   * Get the current context node.
   * @return The current context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/extensions/ExpressionContext.java
public interface ExpressionContext

/**
 * An object that implements this interface can supply
 * information about the current XPath expression context.
 */
