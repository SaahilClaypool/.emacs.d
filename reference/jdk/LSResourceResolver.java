_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/ls/LSResourceResolver.java
public interface LSResourceResolver {

/**
 *  <code>LSResourceResolver</code> provides a way for applications to
 * redirect references to external resources.
 * <p> Applications needing to implement custom handling for external
 * resources can implement this interface and register their implementation
 * by setting the "resource-resolver" parameter of
 * <code>DOMConfiguration</code> objects attached to <code>LSParser</code>
 * and <code>LSSerializer</code>. It can also be register on
 * <code>DOMConfiguration</code> objects attached to <code>Document</code>
 * if the "LS" feature is supported.
 * <p> The <code>LSParser</code> will then allow the application to intercept
 * any external entities, including the external DTD subset and external
 * parameter entities, before including them. The top-level document entity
 * is never passed to the <code>resolveResource</code> method.
 * <p> Many DOM applications will not need to implement this interface, but it
 * will be especially useful for applications that build XML documents from
 * databases or other specialized input sources, or for applications that
 * use URNs.
 * <p ><b>Note:</b>  <code>LSResourceResolver</code> is based on the SAX2 [<a href='http://www.saxproject.org/'>SAX</a>] <code>EntityResolver</code>
 * interface.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407'>Document Object Model (DOM) Level 3 Load
and Save Specification</a>.
 */
