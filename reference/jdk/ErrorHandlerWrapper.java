_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    protected static XNIException createXNIException(SAXException exception) {

    /** Creates an XNIException from a SAXException.
        NOTE:  care should be taken *not* to call this with a SAXParseException; this will
        lose information!!! */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    protected static XMLParseException createXMLParseException(SAXParseException exception) {

    /** Creates an XMLParseException from a SAXParseException. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    protected static SAXParseException createSAXParseException(XMLParseException exception) {

    /** Creates a SAXParseException from an XMLParseException. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public void fatalError(String domain, String key,
                           XMLParseException exception) throws XNIException {

    /**
     * Report a fatal error. Fatal errors usually occur when the document
     * is not well-formed and signifies that the parser cannot continue
     * normal operation.
     * <p>
     * <strong>Note:</strong> The error handler should <em>always</em>
     * throw an <code>XNIException</code> from this method. This exception
     * can either be the same exception that is passed as a parameter to
     * the method or a new XNI exception object. If the registered error
     * handler fails to throw an exception, the continuing operation of
     * the parser is undetermined.
     *
     * @param domain    The domain of the fatal error. The domain can be
     *                  any string but is suggested to be a valid URI. The
     *                  domain can be used to conveniently specify a web
     *                  site location of the relevent specification or
     *                  document pertaining to this fatal error.
     * @param key       The fatal error key. This key can be any string
     *                  and is implementation dependent.
     * @param exception Exception.
     *
     * @throws XNIException Thrown to signal that the parser should stop
     *                      parsing the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public void error(String domain, String key,
                      XMLParseException exception) throws XNIException {

    /**
     * Reports an error. Errors are non-fatal and usually signify that the
     * document is invalid with respect to its grammar(s).
     *
     * @param domain    The domain of the error. The domain can be any
     *                  string but is suggested to be a valid URI. The
     *                  domain can be used to conveniently specify a web
     *                  site location of the relevent specification or
     *                  document pertaining to this error.
     * @param key       The error key. This key can be any string and
     *                  is implementation dependent.
     * @param exception Exception.
     *
     * @throws XNIException Thrown to signal that the parser should stop
     *                      parsing the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public void warning(String domain, String key,
                        XMLParseException exception) throws XNIException {

    /**
     * Reports a warning. Warnings are non-fatal and can be safely ignored
     * by most applications.
     *
     * @param domain    The domain of the warning. The domain can be any
     *                  string but is suggested to be a valid URI. The
     *                  domain can be used to conveniently specify a web
     *                  site location of the relevent specification or
     *                  document pertaining to this warning.
     * @param key       The warning key. This key can be any string and
     *                  is implementation dependent.
     * @param exception Exception.
     *
     * @throws XNIException Thrown to signal that the parser should stop
     *                      parsing the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public ErrorHandler getErrorHandler() {

    /** Returns the SAX error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public void setErrorHandler(ErrorHandler errorHandler) {

    /** Sets the SAX error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public ErrorHandlerWrapper(ErrorHandler errorHandler) {

    /** Wraps the specified SAX error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public ErrorHandlerWrapper() {}

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    protected ErrorHandler fErrorHandler;

    /** The SAX error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
public class ErrorHandlerWrapper

/**
 * This class wraps a SAX error handler in an XNI error handler.
 *
 * @see ErrorHandler
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    protected static XNIException createXNIException(SAXException exception) {

    /** Creates an XNIException from a SAXException.
        NOTE:  care should be taken *not* to call this with a SAXParseException; this will
        lose information!!! */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    protected static XMLParseException createXMLParseException(SAXParseException exception) {

    /** Creates an XMLParseException from a SAXParseException. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    protected static SAXParseException createSAXParseException(XMLParseException exception) {

    /** Creates a SAXParseException from an XMLParseException. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public void fatalError(String domain, String key,
                           XMLParseException exception) throws XNIException {

    /**
     * Report a fatal error. Fatal errors usually occur when the document
     * is not well-formed and signifies that the parser cannot continue
     * normal operation.
     * <p>
     * <strong>Note:</strong> The error handler should <em>always</em>
     * throw an <code>XNIException</code> from this method. This exception
     * can either be the same exception that is passed as a parameter to
     * the method or a new XNI exception object. If the registered error
     * handler fails to throw an exception, the continuing operation of
     * the parser is undetermined.
     *
     * @param domain    The domain of the fatal error. The domain can be
     *                  any string but is suggested to be a valid URI. The
     *                  domain can be used to conveniently specify a web
     *                  site location of the relevent specification or
     *                  document pertaining to this fatal error.
     * @param key       The fatal error key. This key can be any string
     *                  and is implementation dependent.
     * @param exception Exception.
     *
     * @throws XNIException Thrown to signal that the parser should stop
     *                      parsing the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public void error(String domain, String key,
                      XMLParseException exception) throws XNIException {

    /**
     * Reports an error. Errors are non-fatal and usually signify that the
     * document is invalid with respect to its grammar(s).
     *
     * @param domain    The domain of the error. The domain can be any
     *                  string but is suggested to be a valid URI. The
     *                  domain can be used to conveniently specify a web
     *                  site location of the relevent specification or
     *                  document pertaining to this error.
     * @param key       The error key. This key can be any string and
     *                  is implementation dependent.
     * @param exception Exception.
     *
     * @throws XNIException Thrown to signal that the parser should stop
     *                      parsing the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public void warning(String domain, String key,
                        XMLParseException exception) throws XNIException {

    /**
     * Reports a warning. Warnings are non-fatal and can be safely ignored
     * by most applications.
     *
     * @param domain    The domain of the warning. The domain can be any
     *                  string but is suggested to be a valid URI. The
     *                  domain can be used to conveniently specify a web
     *                  site location of the relevent specification or
     *                  document pertaining to this warning.
     * @param key       The warning key. This key can be any string and
     *                  is implementation dependent.
     * @param exception Exception.
     *
     * @throws XNIException Thrown to signal that the parser should stop
     *                      parsing the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public ErrorHandler getErrorHandler() {

    /** Returns the SAX error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public void setErrorHandler(ErrorHandler errorHandler) {

    /** Sets the SAX error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public ErrorHandlerWrapper(ErrorHandler errorHandler) {

    /** Wraps the specified SAX error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    public ErrorHandlerWrapper() {}

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
    protected ErrorHandler fErrorHandler;

    /** The SAX error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerWrapper.java
public class ErrorHandlerWrapper

/**
 * This class wraps a SAX error handler in an XNI error handler.
 *
 * @see ErrorHandler
 *
 * @author Andy Clark, IBM
 *
 */
