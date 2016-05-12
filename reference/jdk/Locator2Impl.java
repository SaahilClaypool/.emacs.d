_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/Locator2Impl.java
    public void setEncoding (String encoding)

    /**
     * Assigns the current value of the encoding property.
     *
     * @param encoding the new "encoding" value
     * @see #getEncoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/Locator2Impl.java
    public void setXMLVersion (String version)

    /**
     * Assigns the current value of the version property.
     *
     * @param version the new "version" value
     * @see #getXMLVersion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/Locator2Impl.java
    // Setters

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/Locator2Impl.java
    public String getEncoding ()

    /**
     * Returns the current value of the encoding property.
     *
     * @see #setEncoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/Locator2Impl.java
    public String getXMLVersion ()

    /**
     * Returns the current value of the version property.
     *
     * @see #setXMLVersion
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/Locator2Impl.java
    // Locator2 method implementations

    ////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/Locator2Impl.java
    public Locator2Impl (Locator locator)

    /**
     * Copy an existing Locator or Locator2 object.
     * If the object implements Locator2, values of the
     * <em>encoding</em> and <em>version</em>strings are copied,
     * otherwise they set to <em>null</em>.
     *
     * @param locator The existing Locator object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/Locator2Impl.java
    public Locator2Impl () { }

    /**
     * Construct a new, empty Locator2Impl object.
     * This will not normally be useful, since the main purpose
     * of this class is to make a snapshot of an existing Locator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/ext/Locator2Impl.java
public class Locator2Impl extends LocatorImpl implements Locator2

/**
 * SAX2 extension helper for holding additional Entity information,
 * implementing the {@link Locator2} interface.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * </blockquote>
 *
 * <p> This is not part of core-only SAX2 distributions.</p>
 *
 * @since SAX 2.0.2
 * @author David Brownell
 */
