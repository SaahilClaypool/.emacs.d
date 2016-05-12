_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    private Exception exception;

    /**
     * @serial The embedded exception if tunnelling, or null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    // Internal state.

    //////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    public String toString ()

    /**
     * Override toString to pick up any embedded exception.
     *
     * @return A string representation of this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    public Throwable getCause() {

    /**
     * Return the cause of the exception
     *
     * @return Return the cause of the exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    public Exception getException ()

    /**
     * Return the embedded exception, if any.
     *
     * @return The embedded exception, or null if there is none.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    public String getMessage ()

    /**
     * Return a detail message for this exception.
     *
     * <p>If there is an embedded exception, and if the SAXException
     * has no detail message of its own, this method will return
     * the detail message from the embedded exception.</p>
     *
     * @return The error or warning message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    public SAXException (String message, Exception e)

    /**
     * Create a new SAXException from an existing exception.
     *
     * <p>The existing exception will be embedded in the new
     * one, but the new exception will have its own message.</p>
     *
     * @param message The detail message.
     * @param e The exception to be wrapped in a SAXException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    public SAXException (Exception e)

    /**
     * Create a new SAXException wrapping an existing exception.
     *
     * <p>The existing exception will be embedded in the new
     * one, and its message will become the default message for
     * the SAXException.</p>
     *
     * @param e The exception to be wrapped in a SAXException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    public SAXException (String message) {

    /**
     * Create a new SAXException.
     *
     * @param message The error or warning message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
    public SAXException ()

    /**
     * Create a new SAXException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/SAXException.java
public class SAXException extends Exception {

/**
 * Encapsulate a general SAX error or warning.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This class can contain basic error or warning information from
 * either the XML parser or the application: a parser writer or
 * application writer can subclass it to provide additional
 * functionality.  SAX handlers may throw this exception or
 * any exception subclassed from it.</p>
 *
 * <p>If the application needs to pass through other types of
 * exceptions, it must wrap those exceptions in a SAXException
 * or an exception derived from a SAXException.</p>
 *
 * <p>If the parser or application needs to include information about a
 * specific location in an XML document, it should use the
 * {@link org.xml.sax.SAXParseException SAXParseException} subclass.</p>
 *
 * @since SAX 1.0
 * @author David Megginson
 * @version 2.0.1 (sax2r2)
 * @see org.xml.sax.SAXParseException
 */
