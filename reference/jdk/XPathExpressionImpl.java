_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
    public Object evaluate(
        Node contextNode,
        short type,
        Object result)

    /**
     *
     * This method provides an implementation XPathResult.evaluate according
     * to the DOM L3 XPath Specification, Working Group Note 26 February 2004.
     *
     * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p>
     *
     * <p>Evaluates this XPath expression and returns a result.</p>
     * @param contextNode The <code>context</code> is context node for the
     *   evaluation of this XPath expression.If the XPathEvaluator was
     *   obtained by casting the <code>Document</code> then this must be
     *   owned by the same document and must be a <code>Document</code>,
     *   <code>Element</code>, <code>Attribute</code>, <code>Text</code>,
     *   <code>CDATASection</code>, <code>Comment</code>,
     *   <code>ProcessingInstruction</code>, or <code>XPathNamespace</code>
     *   node.If the context node is a <code>Text</code> or a
     *   <code>CDATASection</code>, then the context is interpreted as the
     *   whole logical text node as seen by XPath, unless the node is empty
     *   in which case it may not serve as the XPath context.
     * @param type If a specific <code>type</code> is specified, then the
     *   result will be coerced to return the specified type relying on
     *   XPath conversions and fail if the desired coercion is not possible.
     *   This must be one of the type codes of <code>XPathResult</code>.
    *  @param result The <code>result</code> specifies a specific result
     *   object which may be reused and returned by this method. If this is
     *   specified as <code>null</code>or the implementation does not reuse
     *   the specified result, a new result object will be constructed and
     *   returned.For XPath 1.0 results, this object will be of type
     *   <code>XPathResult</code>.
     * @return The result of the evaluation of the XPath expression.For XPath
     *   1.0 results, this object will be of type <code>XPathResult</code>.
     * @exception XPathException
     *   TYPE_ERR: Raised if the result cannot be converted to return the
     *   specified type.
     * @exception DOMException
     *   WRONG_DOCUMENT_ERR: The Node is from a document that is not supported
     *   by the XPathEvaluator that created this
     *   <code>XPathExpression</code>.
     *   <br>NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath
     *   context node.
     *
     * @see org.w3c.dom.xpath.XPathExpression#evaluate(Node, short, XPathResult)
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
    XPathExpressionImpl(XPath xpath, Document doc) {

    /**
     * Constructor for XPathExpressionImpl.
     *
     * @param xpath The wrapped XPath object.
     * @param doc The document to be searched, to parallel the case where''
     *            the XPathEvaluator is obtained by casting the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
  final private Document m_doc;

  /**
   * The document to be searched to parallel the case where the XPathEvaluator
   * is obtained by casting a Document.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
  final private XPath m_xpath;

  /**
   * The xpath object that this expression wraps
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
class XPathExpressionImpl implements XPathExpression {

/**
 *
 * The class provides an implementation of XPathExpression according
 * to the DOM L3 XPath Specification, Working Group Note 26 February 2004.
 *
 * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p>
 *
 * <p>The <code>XPathExpression</code> interface represents a parsed and resolved
 * XPath expression.</p>
 *
 * @see org.w3c.dom.xpath.XPathExpression
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    public String evaluate(InputSource source)

    /**
     * <p>Evaluate the compiled XPath expression in the context of the specified <code>InputSource</code> and return the result as a
     * <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(InputSource source, QName returnType)} with a <code>returnType</code> of
     * {@link XPathConstants#STRING}.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>source</code> is <code>null</code>, then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param source The <code>InputSource</code> of the document to evaluate over.
     *
     * @return The <code>String</code> that is the result of evaluating the expression and converting the result to a
     *   <code>String</code>.
     *
     * @throws XPathExpressionException If the expression cannot be evaluated.
     * @throws NullPointerException If  <code>source</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    public Object evaluate(InputSource source, QName returnType)

    /**
     * <p>Evaluate the compiled XPath expression in the context of the
     * specified <code>InputSource</code> and return the result as the
     *  specified type.</p>
     *
     * <p>This method builds a data model for the {@link InputSource} and calls
     * {@link #evaluate(Object item, QName returnType)} on the resulting
     * document object.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     *  for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined in
     * {@link XPathConstants},
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     *<p>If <code>source</code> or <code>returnType</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param source The <code>InputSource</code> of the document to evaluate
     * over.
     * @param returnType The desired return type.
     *
     * @return The <code>Object</code> that is the result of evaluating the
     * expression and converting the result to
     *   <code>returnType</code>.
     *
     * @throws XPathExpressionException If the expression cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one
     * of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If  <code>source</code> or
     * <code>returnType</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    public String evaluate(Object item)

    /**
     * <p>Evaluate the compiled XPath expression in the specified context and
     * return the result as a <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(Object item, QName returnType)}
     * with a <code>returnType</code> of
     * {@link XPathConstants#STRING}.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     *  for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     *
     * @param item The starting context (node or node list, for example).
     *
     * @return The <code>String</code> that is the result of evaluating the
     * expression and converting the result to a
     *   <code>String</code>.
     *
     * @throws XPathExpressionException If the expression cannot be evaluated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    public Object evaluate(Object item, QName returnType)

    /**
     * <p>Evaluate the compiled XPath expression in the specified context and
     *  return the result as the specified type.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined
     * in {@link XPathConstants},
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     * If <code>returnType</code> is <code>null</code>, then a
     * <code>NullPointerException</code> is thrown.</p>
     *
     * @param item The starting context (node or node list, for example).
     * @param returnType The desired return type.
     *
     * @return The <code>Object</code> that is the result of evaluating the
     * expression and converting the result to
     *   <code>returnType</code>.
     *
     * @throws XPathExpressionException If the expression cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one
     * of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If  <code>returnType</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    protected XPathExpressionImpl() {

    /** Protected constructor to prevent direct instantiation; use compile()
     * from the context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
public class XPathExpressionImpl  implements javax.xml.xpath.XPathExpression{

/**
 * The XPathExpression interface encapsulates a (compiled) XPath expression.
 *
 * @version $Revision: 1.10 $
 * @author  Ramesh Mandava
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
    public Object evaluate(
        Node contextNode,
        short type,
        Object result)

    /**
     *
     * This method provides an implementation XPathResult.evaluate according
     * to the DOM L3 XPath Specification, Working Group Note 26 February 2004.
     *
     * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p>
     *
     * <p>Evaluates this XPath expression and returns a result.</p>
     * @param contextNode The <code>context</code> is context node for the
     *   evaluation of this XPath expression.If the XPathEvaluator was
     *   obtained by casting the <code>Document</code> then this must be
     *   owned by the same document and must be a <code>Document</code>,
     *   <code>Element</code>, <code>Attribute</code>, <code>Text</code>,
     *   <code>CDATASection</code>, <code>Comment</code>,
     *   <code>ProcessingInstruction</code>, or <code>XPathNamespace</code>
     *   node.If the context node is a <code>Text</code> or a
     *   <code>CDATASection</code>, then the context is interpreted as the
     *   whole logical text node as seen by XPath, unless the node is empty
     *   in which case it may not serve as the XPath context.
     * @param type If a specific <code>type</code> is specified, then the
     *   result will be coerced to return the specified type relying on
     *   XPath conversions and fail if the desired coercion is not possible.
     *   This must be one of the type codes of <code>XPathResult</code>.
    *  @param result The <code>result</code> specifies a specific result
     *   object which may be reused and returned by this method. If this is
     *   specified as <code>null</code>or the implementation does not reuse
     *   the specified result, a new result object will be constructed and
     *   returned.For XPath 1.0 results, this object will be of type
     *   <code>XPathResult</code>.
     * @return The result of the evaluation of the XPath expression.For XPath
     *   1.0 results, this object will be of type <code>XPathResult</code>.
     * @exception XPathException
     *   TYPE_ERR: Raised if the result cannot be converted to return the
     *   specified type.
     * @exception DOMException
     *   WRONG_DOCUMENT_ERR: The Node is from a document that is not supported
     *   by the XPathEvaluator that created this
     *   <code>XPathExpression</code>.
     *   <br>NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath
     *   context node.
     *
     * @see org.w3c.dom.xpath.XPathExpression#evaluate(Node, short, XPathResult)
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
    XPathExpressionImpl(XPath xpath, Document doc) {

    /**
     * Constructor for XPathExpressionImpl.
     *
     * @param xpath The wrapped XPath object.
     * @param doc The document to be searched, to parallel the case where''
     *            the XPathEvaluator is obtained by casting the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
  final private Document m_doc;

  /**
   * The document to be searched to parallel the case where the XPathEvaluator
   * is obtained by casting a Document.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
  final private XPath m_xpath;

  /**
   * The xpath object that this expression wraps
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathExpressionImpl.java
class XPathExpressionImpl implements XPathExpression {

/**
 *
 * The class provides an implementation of XPathExpression according
 * to the DOM L3 XPath Specification, Working Group Note 26 February 2004.
 *
 * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p>
 *
 * <p>The <code>XPathExpression</code> interface represents a parsed and resolved
 * XPath expression.</p>
 *
 * @see org.w3c.dom.xpath.XPathExpression
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    public String evaluate(InputSource source)

    /**
     * <p>Evaluate the compiled XPath expression in the context of the specified <code>InputSource</code> and return the result as a
     * <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(InputSource source, QName returnType)} with a <code>returnType</code> of
     * {@link XPathConstants#STRING}.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>source</code> is <code>null</code>, then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param source The <code>InputSource</code> of the document to evaluate over.
     *
     * @return The <code>String</code> that is the result of evaluating the expression and converting the result to a
     *   <code>String</code>.
     *
     * @throws XPathExpressionException If the expression cannot be evaluated.
     * @throws NullPointerException If  <code>source</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    public Object evaluate(InputSource source, QName returnType)

    /**
     * <p>Evaluate the compiled XPath expression in the context of the
     * specified <code>InputSource</code> and return the result as the
     *  specified type.</p>
     *
     * <p>This method builds a data model for the {@link InputSource} and calls
     * {@link #evaluate(Object item, QName returnType)} on the resulting
     * document object.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     *  for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined in
     * {@link XPathConstants},
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     *<p>If <code>source</code> or <code>returnType</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param source The <code>InputSource</code> of the document to evaluate
     * over.
     * @param returnType The desired return type.
     *
     * @return The <code>Object</code> that is the result of evaluating the
     * expression and converting the result to
     *   <code>returnType</code>.
     *
     * @throws XPathExpressionException If the expression cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one
     * of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If  <code>source</code> or
     * <code>returnType</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    public String evaluate(Object item)

    /**
     * <p>Evaluate the compiled XPath expression in the specified context and
     * return the result as a <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(Object item, QName returnType)}
     * with a <code>returnType</code> of
     * {@link XPathConstants#STRING}.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     *  for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     *
     * @param item The starting context (node or node list, for example).
     *
     * @return The <code>String</code> that is the result of evaluating the
     * expression and converting the result to a
     *   <code>String</code>.
     *
     * @throws XPathExpressionException If the expression cannot be evaluated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    public Object evaluate(Object item, QName returnType)

    /**
     * <p>Evaluate the compiled XPath expression in the specified context and
     *  return the result as the specified type.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined
     * in {@link XPathConstants},
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     * If <code>returnType</code> is <code>null</code>, then a
     * <code>NullPointerException</code> is thrown.</p>
     *
     * @param item The starting context (node or node list, for example).
     * @param returnType The desired return type.
     *
     * @return The <code>Object</code> that is the result of evaluating the
     * expression and converting the result to
     *   <code>returnType</code>.
     *
     * @throws XPathExpressionException If the expression cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one
     * of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If  <code>returnType</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
    protected XPathExpressionImpl() {

    /** Protected constructor to prevent direct instantiation; use compile()
     * from the context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathExpressionImpl.java
public class XPathExpressionImpl  implements javax.xml.xpath.XPathExpression{

/**
 * The XPathExpression interface encapsulates a (compiled) XPath expression.
 *
 * @version $Revision: 1.10 $
 * @author  Ramesh Mandava
 */
