_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/DOMErrorHandler.java
public interface DOMErrorHandler {

/**
 *  <code>DOMErrorHandler</code> is a callback interface that the DOM
 * implementation can call when reporting errors that happens while
 * processing XML data, or when doing some other processing (e.g. validating
 * a document). A <code>DOMErrorHandler</code> object can be attached to a
 * <code>Document</code> using the "error-handler" on the
 * <code>DOMConfiguration</code> interface. If more than one error needs to
 * be reported during an operation, the sequence and numbers of the errors
 * passed to the error handler are implementation dependent.
 * <p> The application that is using the DOM implementation is expected to
 * implement this interface.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 * @since DOM Level 3
 */
