_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/WrappedSAXException.java
public class WrappedSAXException extends RuntimeException {

/**
 * Wraps {@link SAXException} and make it an unchecked exception.
 * <p>
 * Xerces XNI doesn't allow {@link SAXException} to be thrown.
 * So when the user-supplied error handler throws it,
 * it needs to be tunneled through Xerces.
 *
 * <p>
 * It is a bug if this exception "leaks" to the application.
 *
 * FIXME: use XNIException for this purpose. It's already doing this
 * kind of SAXException tunneling.
 *
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/WrappedSAXException.java
public class WrappedSAXException extends RuntimeException {

/**
 * Wraps {@link SAXException} and make it an unchecked exception.
 * <p>
 * Xerces XNI doesn't allow {@link SAXException} to be thrown.
 * So when the user-supplied error handler throws it,
 * it needs to be tunneled through Xerces.
 *
 * <p>
 * It is a bug if this exception "leaks" to the application.
 *
 * FIXME: use XNIException for this purpose. It's already doing this
 * kind of SAXException tunneling.
 *
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
