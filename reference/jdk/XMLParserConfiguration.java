_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public Locale getLocale();

    /** Returns the locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setLocale(Locale locale) throws XNIException;

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     * @exception XNIException Thrown if the parser does not support the
     *                         specified locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLEntityResolver getEntityResolver();

    /** Returns the registered entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setEntityResolver(XMLEntityResolver entityResolver);

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLDTDContentModelHandler getDTDContentModelHandler();

    /** Returns the registered DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler dtdContentModelHandler);

    /**
     * Sets the DTD content model handler.
     *
     * @param dtdContentModelHandler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLDTDHandler getDTDHandler();

    /** Returns the registered DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setDTDHandler(XMLDTDHandler dtdHandler);

    /**
     * Sets the DTD handler.
     *
     * @param dtdHandler The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLDocumentHandler getDocumentHandler();

    /** Returns the registered document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler);

    /**
     * Sets the document handler to receive information about the document.
     *
     * @param documentHandler The document handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLErrorHandler getErrorHandler();

    /** Returns the registered error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setErrorHandler(XMLErrorHandler errorHandler);

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public Object getProperty(String propertyId)

    /**
     * Returns the value of a property.
     *
     * @param propertyId The property identifier.
     *
     * @throws XMLConfigurationException Thrown if there is a configuration
     *                                   error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the parser
     * and gets propagated to components in this parser configuration.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws XMLConfigurationException Thrown if there is a configuration
     *                                   error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void addRecognizedProperties(String[] propertyIds);

    /**
     * Allows a parser to add parser specific properties to be recognized
     * and managed by the parser configuration.
     *
     * @param propertyIds An array of the additional property identifiers
     *                    to be recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public boolean getFeature(String featureId)

    /**
     * Returns the state of a feature.
     *
     * @param featureId The feature identifier.
     *
     * @throws XMLConfigurationException Thrown if there is a configuration
     *                                   error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the parser
     * and gets propagated to components in this parser configuration.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws XMLConfigurationException Thrown if there is a configuration
     *                                   error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void addRecognizedFeatures(String[] featureIds);

    /**
     * Allows a parser to add parser specific features to be recognized
     * and managed by the parser configuration.
     *
     * @param featureIds An array of the additional feature identifiers
     *                   to be recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void parse(XMLInputSource inputSource)

    /**
     * Parse an XML document.
     * <p>
     * The parser can use this method to instruct this configuration
     * to begin parsing an XML document from any valid input source
     * (a character stream, a byte stream, or a URI).
     * <p>
     * Parsers may not invoke this method while a parse is in progress.
     * Once a parse is complete, the parser may then parse another XML
     * document.
     * <p>
     * This method is synchronous: it will not return until parsing
     * has ended.  If a client application wants to terminate
     * parsing early, it should throw an exception.
     * <p>
     * When this method returns, all characters streams and byte streams
     * opened by the parser are closed.
     *
     * @param inputSource The input source for the top-level of the
     *                    XML document.
     *
     * @exception XNIException Any XNI exception, possibly wrapping
     *                         another exception.
     * @exception IOException  An IO exception from the parser, possibly
     *                         from a byte stream or character stream
     *                         supplied by the parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
public interface XMLParserConfiguration

/**
 * Represents a parser configuration. The parser configuration maintains
 * a table of recognized features and properties, assembles components
 * for the parsing pipeline, and is responsible for initiating parsing
 * of an XML document.
 * <p>
 * By separating the configuration of a parser from the specific parser
 * instance, applications can create new configurations and re-use the
 * existing parser components and external API generators (e.g. the
 * DOMParser and SAXParser).
 * <p>
 * The internals of any specific parser configuration instance are hidden.
 * Therefore, each configuration may implement the parsing mechanism any
 * way necessary. However, the parser configuration should follow these
 * guidelines:
 * <ul>
 *  <li>
 *   Call the <code>reset</code> method on each component before parsing.
 *   This is only required if the configuration is re-using existing
 *   components that conform to the <code>XMLComponent</code> interface.
 *   If the configuration uses all custom parts, then it is free to
 *   implement everything as it sees fit as long as it follows the
 *   other guidelines.
 *  </li>
 *  <li>
 *   Call the <code>setFeature</code> and <code>setProperty</code> method
 *   on each component during parsing to propagate features and properties
 *   that have changed. This is only required if the configuration is
 *   re-using existing components that conform to the <code>XMLComponent</code>
 *   interface. If the configuration uses all custom parts, then it is free
 *   to implement everything as it sees fit as long as it follows the other
 *   guidelines.
 *  </li>
 *  <li>
 *   Pass the same unique String references for all symbols that are
 *   propagated to the registered handlers. Symbols include, but may not
 *   be limited to, the names of elements and attributes (including their
 *   uri, prefix, and localpart). This is suggested but not an absolute
 *   must. However, the standard parser components may require access to
 *   the same symbol table for creation of unique symbol references to be
 *   propagated in the XNI pipeline.
 *  </li>
 * </ul>
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public Locale getLocale();

    /** Returns the locale. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setLocale(Locale locale) throws XNIException;

    /**
     * Set the locale to use for messages.
     *
     * @param locale The locale object to use for localization of messages.
     *
     * @exception XNIException Thrown if the parser does not support the
     *                         specified locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLEntityResolver getEntityResolver();

    /** Returns the registered entity resolver. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setEntityResolver(XMLEntityResolver entityResolver);

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLDTDContentModelHandler getDTDContentModelHandler();

    /** Returns the registered DTD content model handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setDTDContentModelHandler(XMLDTDContentModelHandler dtdContentModelHandler);

    /**
     * Sets the DTD content model handler.
     *
     * @param dtdContentModelHandler The DTD content model handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLDTDHandler getDTDHandler();

    /** Returns the registered DTD handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setDTDHandler(XMLDTDHandler dtdHandler);

    /**
     * Sets the DTD handler.
     *
     * @param dtdHandler The DTD handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLDocumentHandler getDocumentHandler();

    /** Returns the registered document handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setDocumentHandler(XMLDocumentHandler documentHandler);

    /**
     * Sets the document handler to receive information about the document.
     *
     * @param documentHandler The document handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public XMLErrorHandler getErrorHandler();

    /** Returns the registered error handler. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setErrorHandler(XMLErrorHandler errorHandler);

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public Object getProperty(String propertyId)

    /**
     * Returns the value of a property.
     *
     * @param propertyId The property identifier.
     *
     * @throws XMLConfigurationException Thrown if there is a configuration
     *                                   error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setProperty(String propertyId, Object value)

    /**
     * Sets the value of a property. This method is called by the parser
     * and gets propagated to components in this parser configuration.
     *
     * @param propertyId The property identifier.
     * @param value      The value of the property.
     *
     * @throws XMLConfigurationException Thrown if there is a configuration
     *                                   error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void addRecognizedProperties(String[] propertyIds);

    /**
     * Allows a parser to add parser specific properties to be recognized
     * and managed by the parser configuration.
     *
     * @param propertyIds An array of the additional property identifiers
     *                    to be recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public boolean getFeature(String featureId)

    /**
     * Returns the state of a feature.
     *
     * @param featureId The feature identifier.
     *
     * @throws XMLConfigurationException Thrown if there is a configuration
     *                                   error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void setFeature(String featureId, boolean state)

    /**
     * Sets the state of a feature. This method is called by the parser
     * and gets propagated to components in this parser configuration.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws XMLConfigurationException Thrown if there is a configuration
     *                                   error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void addRecognizedFeatures(String[] featureIds);

    /**
     * Allows a parser to add parser specific features to be recognized
     * and managed by the parser configuration.
     *
     * @param featureIds An array of the additional feature identifiers
     *                   to be recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
    public void parse(XMLInputSource inputSource)

    /**
     * Parse an XML document.
     * <p>
     * The parser can use this method to instruct this configuration
     * to begin parsing an XML document from any valid input source
     * (a character stream, a byte stream, or a URI).
     * <p>
     * Parsers may not invoke this method while a parse is in progress.
     * Once a parse is complete, the parser may then parse another XML
     * document.
     * <p>
     * This method is synchronous: it will not return until parsing
     * has ended.  If a client application wants to terminate
     * parsing early, it should throw an exception.
     * <p>
     * When this method returns, all characters streams and byte streams
     * opened by the parser are closed.
     *
     * @param inputSource The input source for the top-level of the
     *                    XML document.
     *
     * @exception XNIException Any XNI exception, possibly wrapping
     *                         another exception.
     * @exception IOException  An IO exception from the parser, possibly
     *                         from a byte stream or character stream
     *                         supplied by the parser.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLParserConfiguration.java
public interface XMLParserConfiguration

/**
 * Represents a parser configuration. The parser configuration maintains
 * a table of recognized features and properties, assembles components
 * for the parsing pipeline, and is responsible for initiating parsing
 * of an XML document.
 * <p>
 * By separating the configuration of a parser from the specific parser
 * instance, applications can create new configurations and re-use the
 * existing parser components and external API generators (e.g. the
 * DOMParser and SAXParser).
 * <p>
 * The internals of any specific parser configuration instance are hidden.
 * Therefore, each configuration may implement the parsing mechanism any
 * way necessary. However, the parser configuration should follow these
 * guidelines:
 * <ul>
 *  <li>
 *   Call the <code>reset</code> method on each component before parsing.
 *   This is only required if the configuration is re-using existing
 *   components that conform to the <code>XMLComponent</code> interface.
 *   If the configuration uses all custom parts, then it is free to
 *   implement everything as it sees fit as long as it follows the
 *   other guidelines.
 *  </li>
 *  <li>
 *   Call the <code>setFeature</code> and <code>setProperty</code> method
 *   on each component during parsing to propagate features and properties
 *   that have changed. This is only required if the configuration is
 *   re-using existing components that conform to the <code>XMLComponent</code>
 *   interface. If the configuration uses all custom parts, then it is free
 *   to implement everything as it sees fit as long as it follows the other
 *   guidelines.
 *  </li>
 *  <li>
 *   Pass the same unique String references for all symbols that are
 *   propagated to the registered handlers. Symbols include, but may not
 *   be limited to, the names of elements and attributes (including their
 *   uri, prefix, and localpart). This is suggested but not an absolute
 *   must. However, the standard parser components may require access to
 *   the same symbol table for creation of unique symbol references to be
 *   propagated in the XNI pipeline.
 *  </li>
 * </ul>
 *
 * @author Arnaud  Le Hors, IBM
 * @author Andy Clark, IBM
 *
 */
