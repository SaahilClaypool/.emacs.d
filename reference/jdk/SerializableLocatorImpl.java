_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    private int columnNumber;

    /**
     * The column number.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    private int lineNumber;

    /**
     * The line number.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    private String systemId;

    /**
     * The system ID.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    private String publicId;

    /**
     * The public ID.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    // Internal state.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    public void setColumnNumber (int columnNumber)

    /**
     * Set the column number for this locator (1-based).
     *
     * @param columnNumber The column number, or -1 if none is available.
     * @see #getColumnNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    public void setLineNumber (int lineNumber)

    /**
     * Set the line number for this locator (1-based).
     *
     * @param lineNumber The line number, or -1 if none is available.
     * @see #getLineNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    // Setters for the properties (not in org.xml.sax.Locator)

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    // Implementation of org.xml.sax.Locator

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    public SerializableLocatorImpl (org.xml.sax.Locator locator)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    public SerializableLocatorImpl ()

    /**
     * Zero-argument constructor.
     *
     * <p>SAX says "This will not normally be useful, since the main purpose
     * of this class is to make a snapshot of an existing Locator." In fact,
     * it _is_ sometimes useful when you want to construct a new Locator
     * pointing to a specific location... which, after all, is why the
     * setter methods are provided.
     * </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
public class SerializableLocatorImpl

/**
 * The standard SAX implementation of LocatorImpl is not serializable,
 * limiting its utility as "a persistent snapshot of a locator".
 * This is a quick hack to make it so. Note that it makes more sense
 * in many cases to set up fields to hold this data rather than pointing
 * at another object... but that decision should be made on architectural
 * grounds rather than serializability.
 *<p>
 * It isn't clear whether subclassing LocatorImpl and adding serialization
 * methods makes more sense than copying it and just adding Serializable
 * to its interface. Since it's so simple, I've taken the latter approach
 * for now.
 *
 * @see org.xml.sax.helpers.LocatorImpl
 * @see org.xml.sax.Locator Locator
 * @since XalanJ2
 * @author Joe Kesselman
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    private int columnNumber;

    /**
     * The column number.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    private int lineNumber;

    /**
     * The line number.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    private String systemId;

    /**
     * The system ID.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    private String publicId;

    /**
     * The public ID.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    // Internal state.

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    public void setColumnNumber (int columnNumber)

    /**
     * Set the column number for this locator (1-based).
     *
     * @param columnNumber The column number, or -1 if none is available.
     * @see #getColumnNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    public void setLineNumber (int lineNumber)

    /**
     * Set the line number for this locator (1-based).
     *
     * @param lineNumber The line number, or -1 if none is available.
     * @see #getLineNumber
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    // Setters for the properties (not in org.xml.sax.Locator)

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    // Implementation of org.xml.sax.Locator

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    public SerializableLocatorImpl (org.xml.sax.Locator locator)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
    public SerializableLocatorImpl ()

    /**
     * Zero-argument constructor.
     *
     * <p>SAX says "This will not normally be useful, since the main purpose
     * of this class is to make a snapshot of an existing Locator." In fact,
     * it _is_ sometimes useful when you want to construct a new Locator
     * pointing to a specific location... which, after all, is why the
     * setter methods are provided.
     * </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/SerializableLocatorImpl.java
public class SerializableLocatorImpl

/**
 * The standard SAX implementation of LocatorImpl is not serializable,
 * limiting its utility as "a persistent snapshot of a locator".
 * This is a quick hack to make it so. Note that it makes more sense
 * in many cases to set up fields to hold this data rather than pointing
 * at another object... but that decision should be made on architectural
 * grounds rather than serializability.
 *<p>
 * It isn't clear whether subclassing LocatorImpl and adding serialization
 * methods makes more sense than copying it and just adding Serializable
 * to its interface. Since it's so simple, I've taken the latter approach
 * for now.
 *
 * @see org.xml.sax.helpers.LocatorImpl
 * @see org.xml.sax.Locator Locator
 * @since XalanJ2
 * @author Joe Kesselman
 */
