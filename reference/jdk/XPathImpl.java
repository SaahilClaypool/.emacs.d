_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public void reset() {

    /**
     * <p>Reset this <code>XPath</code> to its original configuration.</p>
     *
     * <p><code>XPath</code> is reset to the same state as when it was created with
     * {@link XPathFactory#newXPath()}.
     * <code>reset()</code> is designed to allow the reuse of existing <code>XPath</code>s
     * thus saving resources associated with the creation of new <code>XPath</code>s.</p>
     *
     * <p>The reset <code>XPath</code> is not guaranteed to have the same
     * {@link XPathFunctionResolver}, {@link XPathVariableResolver}
     * or {@link NamespaceContext} <code>Object</code>s, e.g. {@link Object#equals(Object obj)}.
     * It is guaranteed to have a functionally equal <code>XPathFunctionResolver</code>,
     * <code>XPathVariableResolver</code>
     * and <code>NamespaceContext</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public String evaluate(String expression, InputSource source)

    /**
     * <p>Evaluate an XPath expression in the context of the specified <code>InputSource</code>
     * and return the result as a <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(String expression, InputSource source, QName returnType)} with a
     * <code>returnType</code> of {@link XPathConstants#STRING}.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>expression</code> or <code>source</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param source The <code>InputSource</code> of the document to evaluate over.
     *
     * @return The <code>String</code> that is the result of evaluating the expression and
     *   converting the result to a <code>String</code>.
     *
     * @throws XPathExpressionException If expression cannot be evaluated.
     * @throws NullPointerException If <code>expression</code> or <code>source</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public Object evaluate(String expression, InputSource source,
            QName returnType) throws XPathExpressionException {

    /**
     * <p>Evaluate an XPath expression in the context of the specified <code>InputSource</code>
     * and return the result as the specified type.</p>
     *
     * <p>This method builds a data model for the {@link InputSource} and calls
     * {@link #evaluate(String expression, Object item, QName returnType)} on the resulting document object.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined in {@link XPathConstants},
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     * <p>If <code>expression</code>, <code>source</code> or <code>returnType</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param source The input source of the document to evaluate over.
     * @param returnType The desired return type.
     *
     * @return The <code>Object</code> that encapsulates the result of evaluating the expression.
     *
     * @throws XPathExpressionException If expression cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If <code>expression</code>, <code>source</code> or <code>returnType</code>
     *   is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public XPathExpression compile(String expression)

    /**
     * <p>Compile an XPath expression for later evaluation.</p>
     *
     * <p>If <code>expression</code> contains any {@link XPathFunction}s,
     * they must be available via the {@link XPathFunctionResolver}.
     * An {@link XPathExpressionException} will be thrown if the <code>XPathFunction</code>
     * cannot be resovled with the <code>XPathFunctionResolver</code>.</p>
     *
     * <p>If <code>expression</code> is <code>null</code>, a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     *
     * @return Compiled XPath expression.

     * @throws XPathExpressionException If <code>expression</code> cannot be compiled.
     * @throws NullPointerException If <code>expression</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public String evaluate(String expression, Object item)

    /**
     * <p>Evaluate an XPath expression in the specified context and return the result as a <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(String expression, Object item, QName returnType)} with a <code>returnType</code> of
     * {@link XPathConstants#STRING}.</p>
     *
     * <p>See "Evaluation of XPath Expressions" of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     * If <code>expression</code> is <code>null</code>, then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param item The starting context (node or node list, for example).
     *
     * @return The <code>String</code> that is the result of evaluating the expression and
     *   converting the result to a <code>String</code>.
     *
     * @throws XPathExpressionException If <code>expression</code> cannot be evaluated.
     * @throws NullPointerException If <code>expression</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public Object evaluate(String expression, Object item, QName returnType)

    /**
     * <p>Evaluate an <code>XPath</code> expression in the specified context and return the result as the specified type.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and <code>QName</code> resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined in {@link XPathConstants} (
     * {@link XPathConstants#NUMBER NUMBER},
     * {@link XPathConstants#STRING STRING},
     * {@link XPathConstants#BOOLEAN BOOLEAN},
     * {@link XPathConstants#NODE NODE} or
     * {@link XPathConstants#NODESET NODESET})
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     * If <code>expression</code> or <code>returnType</code> is <code>null</code>, then a
     * <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param item The starting context (node or node list, for example).
     * @param returnType The desired return type.
     *
     * @return Result of evaluating an XPath expression as an <code>Object</code> of <code>returnType</code>.
     *
     * @throws XPathExpressionException If <code>expression</code> cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If <code>expression</code> or <code>returnType</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public NamespaceContext getNamespaceContext() {

    /**
     * <p>Returns the current namespace context.</p>
     *
     * @return Current Namespace context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public void setNamespaceContext(NamespaceContext nsContext) {

    /**
     * <p>Establishes a namespace context.</p>
     *
     * @param nsContext Namespace context to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public XPathFunctionResolver getXPathFunctionResolver() {

    /**
     * <p>Returns the current function resolver.</p>
     *
     * @return Current function resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public void setXPathFunctionResolver(XPathFunctionResolver resolver) {

    /**
     * <p>Establishes a function resolver.</p>
     *
     * @param resolver XPath function resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public XPathVariableResolver getXPathVariableResolver() {

    /**
     * <p>Returns the current variable resolver.</p>
     *
     * @return Current variable resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public void setXPathVariableResolver(XPathVariableResolver resolver) {

    /**
     * <p>Establishes a variable resolver.</p>
     *
     * @param resolver Variable Resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
public class XPathImpl implements javax.xml.xpath.XPath {

/**
 * The XPathImpl class provides implementation for the methods defined  in
 * javax.xml.xpath.XPath interface. This provide simple access to the results
 * of an XPath expression.
 *
 *
 * @version $Revision: 1.10 $
 * @author  Ramesh Mandava
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public void reset() {

    /**
     * <p>Reset this <code>XPath</code> to its original configuration.</p>
     *
     * <p><code>XPath</code> is reset to the same state as when it was created with
     * {@link XPathFactory#newXPath()}.
     * <code>reset()</code> is designed to allow the reuse of existing <code>XPath</code>s
     * thus saving resources associated with the creation of new <code>XPath</code>s.</p>
     *
     * <p>The reset <code>XPath</code> is not guaranteed to have the same
     * {@link XPathFunctionResolver}, {@link XPathVariableResolver}
     * or {@link NamespaceContext} <code>Object</code>s, e.g. {@link Object#equals(Object obj)}.
     * It is guaranteed to have a functionally equal <code>XPathFunctionResolver</code>,
     * <code>XPathVariableResolver</code>
     * and <code>NamespaceContext</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public String evaluate(String expression, InputSource source)

    /**
     * <p>Evaluate an XPath expression in the context of the specified <code>InputSource</code>
     * and return the result as a <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(String expression, InputSource source, QName returnType)} with a
     * <code>returnType</code> of {@link XPathConstants#STRING}.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>expression</code> or <code>source</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param source The <code>InputSource</code> of the document to evaluate over.
     *
     * @return The <code>String</code> that is the result of evaluating the expression and
     *   converting the result to a <code>String</code>.
     *
     * @throws XPathExpressionException If expression cannot be evaluated.
     * @throws NullPointerException If <code>expression</code> or <code>source</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public Object evaluate(String expression, InputSource source,
            QName returnType) throws XPathExpressionException {

    /**
     * <p>Evaluate an XPath expression in the context of the specified <code>InputSource</code>
     * and return the result as the specified type.</p>
     *
     * <p>This method builds a data model for the {@link InputSource} and calls
     * {@link #evaluate(String expression, Object item, QName returnType)} on the resulting document object.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined in {@link XPathConstants},
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     * <p>If <code>expression</code>, <code>source</code> or <code>returnType</code> is <code>null</code>,
     * then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param source The input source of the document to evaluate over.
     * @param returnType The desired return type.
     *
     * @return The <code>Object</code> that encapsulates the result of evaluating the expression.
     *
     * @throws XPathExpressionException If expression cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If <code>expression</code>, <code>source</code> or <code>returnType</code>
     *   is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public XPathExpression compile(String expression)

    /**
     * <p>Compile an XPath expression for later evaluation.</p>
     *
     * <p>If <code>expression</code> contains any {@link XPathFunction}s,
     * they must be available via the {@link XPathFunctionResolver}.
     * An {@link XPathExpressionException} will be thrown if the <code>XPathFunction</code>
     * cannot be resovled with the <code>XPathFunctionResolver</code>.</p>
     *
     * <p>If <code>expression</code> is <code>null</code>, a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     *
     * @return Compiled XPath expression.

     * @throws XPathExpressionException If <code>expression</code> cannot be compiled.
     * @throws NullPointerException If <code>expression</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public String evaluate(String expression, Object item)

    /**
     * <p>Evaluate an XPath expression in the specified context and return the result as a <code>String</code>.</p>
     *
     * <p>This method calls {@link #evaluate(String expression, Object item, QName returnType)} with a <code>returnType</code> of
     * {@link XPathConstants#STRING}.</p>
     *
     * <p>See "Evaluation of XPath Expressions" of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and QName resolution and return type conversion.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     * If <code>expression</code> is <code>null</code>, then a <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param item The starting context (node or node list, for example).
     *
     * @return The <code>String</code> that is the result of evaluating the expression and
     *   converting the result to a <code>String</code>.
     *
     * @throws XPathExpressionException If <code>expression</code> cannot be evaluated.
     * @throws NullPointerException If <code>expression</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public Object evaluate(String expression, Object item, QName returnType)

    /**
     * <p>Evaluate an <code>XPath</code> expression in the specified context and return the result as the specified type.</p>
     *
     * <p>See "Evaluation of XPath Expressions" section of JAXP 1.3 spec
     * for context item evaluation,
     * variable, function and <code>QName</code> resolution and return type conversion.</p>
     *
     * <p>If <code>returnType</code> is not one of the types defined in {@link XPathConstants} (
     * {@link XPathConstants#NUMBER NUMBER},
     * {@link XPathConstants#STRING STRING},
     * {@link XPathConstants#BOOLEAN BOOLEAN},
     * {@link XPathConstants#NODE NODE} or
     * {@link XPathConstants#NODESET NODESET})
     * then an <code>IllegalArgumentException</code> is thrown.</p>
     *
     * <p>If a <code>null</code> value is provided for
     * <code>item</code>, an empty document will be used for the
     * context.
     * If <code>expression</code> or <code>returnType</code> is <code>null</code>, then a
     * <code>NullPointerException</code> is thrown.</p>
     *
     * @param expression The XPath expression.
     * @param item The starting context (node or node list, for example).
     * @param returnType The desired return type.
     *
     * @return Result of evaluating an XPath expression as an <code>Object</code> of <code>returnType</code>.
     *
     * @throws XPathExpressionException If <code>expression</code> cannot be evaluated.
     * @throws IllegalArgumentException If <code>returnType</code> is not one of the types defined in {@link XPathConstants}.
     * @throws NullPointerException If <code>expression</code> or <code>returnType</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public NamespaceContext getNamespaceContext() {

    /**
     * <p>Returns the current namespace context.</p>
     *
     * @return Current Namespace context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public void setNamespaceContext(NamespaceContext nsContext) {

    /**
     * <p>Establishes a namespace context.</p>
     *
     * @param nsContext Namespace context to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public XPathFunctionResolver getXPathFunctionResolver() {

    /**
     * <p>Returns the current function resolver.</p>
     *
     * @return Current function resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public void setXPathFunctionResolver(XPathFunctionResolver resolver) {

    /**
     * <p>Establishes a function resolver.</p>
     *
     * @param resolver XPath function resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public XPathVariableResolver getXPathVariableResolver() {

    /**
     * <p>Returns the current variable resolver.</p>
     *
     * @return Current variable resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
    public void setXPathVariableResolver(XPathVariableResolver resolver) {

    /**
     * <p>Establishes a variable resolver.</p>
     *
     * @param resolver Variable Resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/jaxp/XPathImpl.java
public class XPathImpl implements javax.xml.xpath.XPath {

/**
 * The XPathImpl class provides implementation for the methods defined  in
 * javax.xml.xpath.XPath interface. This provide simple access to the results
 * of an XPath expression.
 *
 *
 * @version $Revision: 1.10 $
 * @author  Ramesh Mandava
 */
