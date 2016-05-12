_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/xpath/XPathVariableResolver.java
public interface XPathVariableResolver {

/**
 * <p><code>XPathVariableResolver</code> provides access to the set of user defined XPath variables.</p>
 *
 * <p>The <code>XPathVariableResolver</code> and the XPath evaluator must adhere to a contract that
 * cannot be directly enforced by the API.  Although variables may be mutable,
 * that is, an application may wish to evaluate the same XPath expression more
 * than once with different variable values, in the course of evaluating any
 * single XPath expression, a variable's value <strong><em>must</em></strong>
 * not change.</p>
 *
 * @author  <a href="mailto:Norman.Walsh@Sun.com">Norman Walsh</a>
 * @author  <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @since 1.5
 */
