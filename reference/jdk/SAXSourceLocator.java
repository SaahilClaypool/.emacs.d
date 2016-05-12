_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public int getColumnNumber()

  /**
   * Return the column number where the current document event ends.
   *
   * <p><strong>Warning:</strong> The return value from the method
   * is intended only as an approximation for the sake of error
   * reporting; it is not intended to provide sufficient information
   * to edit the character content of the original XML document.</p>
   *
   * <p>The return value is an approximation of the column number
   * in the document entity or external parsed entity where the
   * markup triggering the event appears.</p>
   *
   * @return The column number, or -1 if none is available.
   * @see #getLineNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public int getLineNumber()

  /**
   * Return the line number where the current document event ends.
   *
   * <p><strong>Warning:</strong> The return value from the method
   * is intended only as an approximation for the sake of error
   * reporting; it is not intended to provide sufficient information
   * to edit the character content of the original XML document.</p>
   *
   * <p>The return value is an approximation of the line number
   * in the document entity or external parsed entity where the
   * markup triggering the event appears.</p>
   *
   * @return The line number, or -1 if none is available.
   * @see #getColumnNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public String getSystemId()

  /**
   * Return the system identifier for the current document event.
   *
   * <p>The return value is the system identifier of the document
   * entity or of the external parsed entity in which the markup
   * triggering the event appears.</p>
   *
   * <p>If the system identifier is a URL, the parser must resolve it
   * fully before passing it to the application.</p>
   *
   * @return A string containing the system identifier, or null
   *         if none is available.
   * @see #getPublicId
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public String getPublicId()

  /**
   * Return the public identifier for the current document event.
   *
   * <p>The return value is the public identifier of the document
   * entity or of the external parsed entity in which the markup
   * triggering the event appears.</p>
   *
   * @return A string containing the public identifier, or
   *         null if none is available.
   * @see #getSystemId
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public SAXSourceLocator(SAXParseException spe)

  /**
   * Constructor SAXSourceLocator
   *
   *
   * @param spe SAXParseException exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public SAXSourceLocator(javax.xml.transform.SourceLocator locator)

  /**
   * Constructor SAXSourceLocator
   *
   *
   * @param locator Source locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public SAXSourceLocator(Locator locator)

  /**
   * Constructor SAXSourceLocator
   *
   *
   * @param locator Source locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public SAXSourceLocator(){}

  /**
   * Constructor SAXSourceLocator
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  Locator m_locator;

  /** The SAX Locator object.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
public class SAXSourceLocator extends LocatorImpl

/**
 * Class SAXSourceLocator extends org.xml.sax.helpers.LocatorImpl
 * for the purpose of implementing the SourceLocator interface,
 * and thus can be both a SourceLocator and a SAX Locator.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public int getColumnNumber()

  /**
   * Return the column number where the current document event ends.
   *
   * <p><strong>Warning:</strong> The return value from the method
   * is intended only as an approximation for the sake of error
   * reporting; it is not intended to provide sufficient information
   * to edit the character content of the original XML document.</p>
   *
   * <p>The return value is an approximation of the column number
   * in the document entity or external parsed entity where the
   * markup triggering the event appears.</p>
   *
   * @return The column number, or -1 if none is available.
   * @see #getLineNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public int getLineNumber()

  /**
   * Return the line number where the current document event ends.
   *
   * <p><strong>Warning:</strong> The return value from the method
   * is intended only as an approximation for the sake of error
   * reporting; it is not intended to provide sufficient information
   * to edit the character content of the original XML document.</p>
   *
   * <p>The return value is an approximation of the line number
   * in the document entity or external parsed entity where the
   * markup triggering the event appears.</p>
   *
   * @return The line number, or -1 if none is available.
   * @see #getColumnNumber
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public String getSystemId()

  /**
   * Return the system identifier for the current document event.
   *
   * <p>The return value is the system identifier of the document
   * entity or of the external parsed entity in which the markup
   * triggering the event appears.</p>
   *
   * <p>If the system identifier is a URL, the parser must resolve it
   * fully before passing it to the application.</p>
   *
   * @return A string containing the system identifier, or null
   *         if none is available.
   * @see #getPublicId
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public String getPublicId()

  /**
   * Return the public identifier for the current document event.
   *
   * <p>The return value is the public identifier of the document
   * entity or of the external parsed entity in which the markup
   * triggering the event appears.</p>
   *
   * @return A string containing the public identifier, or
   *         null if none is available.
   * @see #getSystemId
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public SAXSourceLocator(SAXParseException spe)

  /**
   * Constructor SAXSourceLocator
   *
   *
   * @param spe SAXParseException exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public SAXSourceLocator(javax.xml.transform.SourceLocator locator)

  /**
   * Constructor SAXSourceLocator
   *
   *
   * @param locator Source locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public SAXSourceLocator(Locator locator)

  /**
   * Constructor SAXSourceLocator
   *
   *
   * @param locator Source locator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  public SAXSourceLocator(){}

  /**
   * Constructor SAXSourceLocator
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
  Locator m_locator;

  /** The SAX Locator object.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SAXSourceLocator.java
public class SAXSourceLocator extends LocatorImpl

/**
 * Class SAXSourceLocator extends org.xml.sax.helpers.LocatorImpl
 * for the purpose of implementing the SourceLocator interface,
 * and thus can be both a SourceLocator and a SAX Locator.
 */
