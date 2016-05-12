_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    // Internal state.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public void setColumnNumber (int columnNumber)

    /**
     * Set the column number for this locator (1-based).
     *
     * @param columnNumber The column number, or -1 if none is available.
     * @see #getColumnNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public void setLineNumber (int lineNumber)

    /**
     * Set the line number for this locator (1-based).
     *
     * @param lineNumber The line number, or -1 if none is available.
     * @see #getLineNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public void setSystemId (String systemId)

    /**
     * Set the system identifier for this locator.
     *
     * @param systemId The new system identifier, or null
     *        if none is available.
     * @see #getSystemId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public void setPublicId (String publicId)

    /**
     * Set the public identifier for this locator.
     *
     * @param publicId The new public identifier, or null
     *        if none is available.
     * @see #getPublicId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    // Setters for the properties (not in org.xml.sax.Locator)

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public int getColumnNumber ()

    /**
     * Return the saved column number (1-based).
     *
     * @return The column number as an integer, or -1 if none is available.
     * @see org.xml.sax.Locator#getColumnNumber
     * @see #setColumnNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public int getLineNumber ()

    /**
     * Return the saved line number (1-based).
     *
     * @return The line number as an integer, or -1 if none is available.
     * @see org.xml.sax.Locator#getLineNumber
     * @see #setLineNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public String getSystemId ()

    /**
     * Return the saved system identifier.
     *
     * @return The system identifier as a string, or null if none
     *         is available.
     * @see org.xml.sax.Locator#getSystemId
     * @see #setSystemId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public String getPublicId ()

    /**
     * Return the saved public identifier.
     *
     * @return The public identifier as a string, or null if none
     *         is available.
     * @see org.xml.sax.Locator#getPublicId
     * @see #setPublicId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    // Implementation of org.xml.sax.Locator

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public LocatorImpl (Locator locator)

    /**
     * Copy constructor.
     *
     * <p>Create a persistent copy of the current state of a locator.
     * When the original locator changes, this copy will still keep
     * the original values (and it can be used outside the scope of
     * DocumentHandler methods).</p>
     *
     * @param locator The locator to copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
    public LocatorImpl ()

    /**
     * Zero-argument constructor.
     *
     * <p>This will not normally be useful, since the main purpose
     * of this class is to make a snapshot of an existing Locator.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/LocatorImpl.java
public class LocatorImpl implements Locator

/**
 * Provide an optional convenience implementation of Locator.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This class is available mainly for application writers, who
 * can use it to make a persistent snapshot of a locator at any
 * point during a document parse:</p>
 *
 * <pre>
 * Locator locator;
 * Locator startloc;
 *
 * public void setLocator (Locator locator)
 * {
 *         // note the locator
 *   this.locator = locator;
 * }
 *
 * public void startDocument ()
 * {
 *         // save the location of the start of the document
 *         // for future use.
 *   Locator startloc = new LocatorImpl(locator);
 * }
 *</pre>
 *
 * <p>Normally, parser writers will not use this class, since it
 * is more efficient to provide location information only when
 * requested, rather than constantly updating a Locator object.</p>
 *
 * @since SAX 1.0
 * @author David Megginson
 * @see org.xml.sax.Locator Locator
 */
