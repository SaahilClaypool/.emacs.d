_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    private void printError(String type, XMLParseException ex) {

    /** Prints the error message. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public void fatalError(String domain, String key, XMLParseException ex)

    /** Fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public void error(String domain, String key, XMLParseException ex)

    /** Error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public void warning(String domain, String key, XMLParseException ex)

    /** Warning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public DefaultErrorHandler(PrintWriter out) {

    /**
     * Constructs an error handler that prints error messages to the
     * specified <code>PrintWriter</code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public DefaultErrorHandler() {

    /**
     * Constructs an error handler that prints error messages to
     * <code>System.err</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    protected PrintWriter fOut;

    /** Print writer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
public class DefaultErrorHandler

/**
 * Default error handler.
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void fatalError(TransformerException exception) throws TransformerException

  /**
   * Receive notification of a non-recoverable error.
   *
   * <p>This corresponds to the definition of "fatal error" in
   * section 1.2 of the W3C XML 1.0 Recommendation.  For example, a
   * parser would use this callback to report the violation of a
   * well-formedness constraint.</p>
   *
   * <p>The application must assume that the document is unusable
   * after the parser has invoked this method, and should continue
   * (if at all) only for the sake of collecting addition error
   * messages: in fact, SAX parsers are free to stop reporting any
   * other events once this method has been invoked.</p>
   *
   * @param exception The error information encapsulated in a
   *                  SAX parse exception.
   * @throws javax.xml.transform.TransformerException Any SAX exception, possibly
   *            wrapping another exception.
   * @see javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void error(TransformerException exception) throws TransformerException

  /**
   * Receive notification of a recoverable error.
   *
   * <p>This corresponds to the definition of "error" in section 1.2
   * of the W3C XML 1.0 Recommendation.  For example, a validating
   * parser would use this callback to report the violation of a
   * validity constraint.  The default behaviour is to take no
   * action.</p>
   *
   * <p>The SAX parser must continue to provide normal parsing events
   * after invoking this method: it should still be possible for the
   * application to process the document through to the end.  If the
   * application cannot do so, then the parser should report a fatal
   * error even if the XML 1.0 recommendation does not require it to
   * do so.</p>
   *
   * @param exception The error information encapsulated in a
   *                  SAX parse exception.
   * @throws javax.xml.transform.TransformerException Any SAX exception, possibly
   *            wrapping another exception.
   * @see javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void warning(TransformerException exception) throws TransformerException

  /**
   * Receive notification of a warning.
   *
   * <p>SAX parsers will use this method to report conditions that
   * are not errors or fatal errors as defined by the XML 1.0
   * recommendation.  The default behaviour is to take no action.</p>
   *
   * <p>The SAX parser must continue to provide normal parsing events
   * after invoking this method: it should still be possible for the
   * application to process the document through to the end.</p>
   *
   * @param exception The warning information encapsulated in a
   *                  SAX parse exception.
   * @throws javax.xml.transform.TransformerException Any SAX exception, possibly
   *            wrapping another exception.
   * @see javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void fatalError(SAXParseException exception) throws SAXException

  /**
   * Receive notification of a non-recoverable error.
   *
   * <p>This corresponds to the definition of "fatal error" in
   * section 1.2 of the W3C XML 1.0 Recommendation.  For example, a
   * parser would use this callback to report the violation of a
   * well-formedness constraint.</p>
   *
   * <p>The application must assume that the document is unusable
   * after the parser has invoked this method, and should continue
   * (if at all) only for the sake of collecting addition error
   * messages: in fact, SAX parsers are free to stop reporting any
   * other events once this method has been invoked.</p>
   *
   * @param exception The error information encapsulated in a
   *                  SAX parse exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void error(SAXParseException exception) throws SAXException

  /**
   * Receive notification of a recoverable error.
   *
   * <p>This corresponds to the definition of "error" in section 1.2
   * of the W3C XML 1.0 Recommendation.  For example, a validating
   * parser would use this callback to report the violation of a
   * validity constraint.  The default behaviour is to take no
   * action.</p>
   *
   * <p>The SAX parser must continue to provide normal parsing events
   * after invoking this method: it should still be possible for the
   * application to process the document through to the end.  If the
   * application cannot do so, then the parser should report a fatal
   * error even if the XML 1.0 recommendation does not require it to
   * do so.</p>
   *
   * @param exception The error information encapsulated in a
   *                  SAX parse exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void warning(SAXParseException exception) throws SAXException

  /**
   * Receive notification of a warning.
   *
   * <p>SAX parsers will use this method to report conditions that
   * are not errors or fatal errors as defined by the XML 1.0
   * recommendation.  The default behaviour is to take no action.</p>
   *
   * <p>The SAX parser must continue to provide normal parsing events
   * after invoking this method: it should still be possible for the
   * application to process the document through to the end.</p>
   *
   * @param exception The warning information encapsulated in a
   *                  SAX parse exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public DefaultErrorHandler(boolean throwExceptionOnError)

  /**
   * Constructor DefaultErrorHandler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public DefaultErrorHandler()

  /**
   * Constructor DefaultErrorHandler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public DefaultErrorHandler(PrintStream pw)

  /**
   * Constructor DefaultErrorHandler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public DefaultErrorHandler(PrintWriter pw)

  /**
   * Constructor DefaultErrorHandler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  boolean m_throwExceptionOnError = true;

  /**
   * if this flag is set to true, we will rethrow the exception on
   * the error() and fatalError() methods. If it is false, the errors
   * are reported to System.err.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
public class DefaultErrorHandler implements ErrorHandler, ErrorListener

/**
 * Implement SAX error handler for default reporting.
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    private void printError(String type, XMLParseException ex) {

    /** Prints the error message. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public void fatalError(String domain, String key, XMLParseException ex)

    /** Fatal error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public void error(String domain, String key, XMLParseException ex)

    /** Error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public void warning(String domain, String key, XMLParseException ex)

    /** Warning. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public DefaultErrorHandler(PrintWriter out) {

    /**
     * Constructs an error handler that prints error messages to the
     * specified <code>PrintWriter</code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    public DefaultErrorHandler() {

    /**
     * Constructs an error handler that prints error messages to
     * <code>System.err</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
    protected PrintWriter fOut;

    /** Print writer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/DefaultErrorHandler.java
public class DefaultErrorHandler

/**
 * Default error handler.
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void fatalError(TransformerException exception) throws TransformerException

  /**
   * Receive notification of a non-recoverable error.
   *
   * <p>This corresponds to the definition of "fatal error" in
   * section 1.2 of the W3C XML 1.0 Recommendation.  For example, a
   * parser would use this callback to report the violation of a
   * well-formedness constraint.</p>
   *
   * <p>The application must assume that the document is unusable
   * after the parser has invoked this method, and should continue
   * (if at all) only for the sake of collecting addition error
   * messages: in fact, SAX parsers are free to stop reporting any
   * other events once this method has been invoked.</p>
   *
   * @param exception The error information encapsulated in a
   *                  SAX parse exception.
   * @throws javax.xml.transform.TransformerException Any SAX exception, possibly
   *            wrapping another exception.
   * @see javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void error(TransformerException exception) throws TransformerException

  /**
   * Receive notification of a recoverable error.
   *
   * <p>This corresponds to the definition of "error" in section 1.2
   * of the W3C XML 1.0 Recommendation.  For example, a validating
   * parser would use this callback to report the violation of a
   * validity constraint.  The default behaviour is to take no
   * action.</p>
   *
   * <p>The SAX parser must continue to provide normal parsing events
   * after invoking this method: it should still be possible for the
   * application to process the document through to the end.  If the
   * application cannot do so, then the parser should report a fatal
   * error even if the XML 1.0 recommendation does not require it to
   * do so.</p>
   *
   * @param exception The error information encapsulated in a
   *                  SAX parse exception.
   * @throws javax.xml.transform.TransformerException Any SAX exception, possibly
   *            wrapping another exception.
   * @see javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void warning(TransformerException exception) throws TransformerException

  /**
   * Receive notification of a warning.
   *
   * <p>SAX parsers will use this method to report conditions that
   * are not errors or fatal errors as defined by the XML 1.0
   * recommendation.  The default behaviour is to take no action.</p>
   *
   * <p>The SAX parser must continue to provide normal parsing events
   * after invoking this method: it should still be possible for the
   * application to process the document through to the end.</p>
   *
   * @param exception The warning information encapsulated in a
   *                  SAX parse exception.
   * @throws javax.xml.transform.TransformerException Any SAX exception, possibly
   *            wrapping another exception.
   * @see javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void fatalError(SAXParseException exception) throws SAXException

  /**
   * Receive notification of a non-recoverable error.
   *
   * <p>This corresponds to the definition of "fatal error" in
   * section 1.2 of the W3C XML 1.0 Recommendation.  For example, a
   * parser would use this callback to report the violation of a
   * well-formedness constraint.</p>
   *
   * <p>The application must assume that the document is unusable
   * after the parser has invoked this method, and should continue
   * (if at all) only for the sake of collecting addition error
   * messages: in fact, SAX parsers are free to stop reporting any
   * other events once this method has been invoked.</p>
   *
   * @param exception The error information encapsulated in a
   *                  SAX parse exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void error(SAXParseException exception) throws SAXException

  /**
   * Receive notification of a recoverable error.
   *
   * <p>This corresponds to the definition of "error" in section 1.2
   * of the W3C XML 1.0 Recommendation.  For example, a validating
   * parser would use this callback to report the violation of a
   * validity constraint.  The default behaviour is to take no
   * action.</p>
   *
   * <p>The SAX parser must continue to provide normal parsing events
   * after invoking this method: it should still be possible for the
   * application to process the document through to the end.  If the
   * application cannot do so, then the parser should report a fatal
   * error even if the XML 1.0 recommendation does not require it to
   * do so.</p>
   *
   * @param exception The error information encapsulated in a
   *                  SAX parse exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public void warning(SAXParseException exception) throws SAXException

  /**
   * Receive notification of a warning.
   *
   * <p>SAX parsers will use this method to report conditions that
   * are not errors or fatal errors as defined by the XML 1.0
   * recommendation.  The default behaviour is to take no action.</p>
   *
   * <p>The SAX parser must continue to provide normal parsing events
   * after invoking this method: it should still be possible for the
   * application to process the document through to the end.</p>
   *
   * @param exception The warning information encapsulated in a
   *                  SAX parse exception.
   * @throws SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public DefaultErrorHandler(boolean throwExceptionOnError)

  /**
   * Constructor DefaultErrorHandler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public DefaultErrorHandler()

  /**
   * Constructor DefaultErrorHandler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public DefaultErrorHandler(PrintStream pw)

  /**
   * Constructor DefaultErrorHandler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  public DefaultErrorHandler(PrintWriter pw)

  /**
   * Constructor DefaultErrorHandler
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
  boolean m_throwExceptionOnError = true;

  /**
   * if this flag is set to true, we will rethrow the exception on
   * the error() and fatalError() methods. If it is false, the errors
   * are reported to System.err.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/DefaultErrorHandler.java
public class DefaultErrorHandler implements ErrorHandler, ErrorListener

/**
 * Implement SAX error handler for default reporting.
 * @xsl.usage general
 */
