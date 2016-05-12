_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public Grammar loadGrammar(XMLInputSource source)

    /**
     * Returns a Grammar object by parsing the contents of the
     * entity pointed to by source.
     *
     * @param source        the location of the entity which forms
     *                          the starting point of the grammar to be constructed.
     * @throws IOException      When a problem is encountered reading the entity
     *          XNIException    When a condition arises (such as a FatalError) that requires parsing
     *                              of the entity be terminated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public XMLEntityResolver getEntityResolver();

    /** Returns the registered entity resolver.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setEntityResolver(XMLEntityResolver entityResolver);

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public XMLErrorHandler getErrorHandler();

    /** Returns the registered error handler.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setErrorHandler(XMLErrorHandler errorHandler);

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public Locale getLocale();

    /** Return the Locale the XMLGrammarLoader is using. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setLocale(Locale locale);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setProperty(String propertyId,
                Object state) throws XMLConfigurationException;

    /**
     * Sets the state of a property.
     *
     * @param propertyId The property identifier.
     * @param state     The state of the property.
     *
     * @throws XMLConfigurationException Thrown when a property is not
     *                  recognized or cannot be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public Object getProperty(String propertyId)

    /**
     * Returns the state of a property.
     *
     * @param propertyId The property identifier.
     *
     * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public String[] getRecognizedProperties();

    /**
     * Returns a list of property identifiers that are recognized by
     * this XMLGrammarLoader.  This method may return null if no properties
     * are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setFeature(String featureId,
                boolean state) throws XMLConfigurationException;

    /**
     * Sets the state of a feature.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws XMLConfigurationException Thrown when a feature is not
     *                  recognized or cannot be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public boolean getFeature(String featureId)

    /**
     * Returns the state of a feature.
     *
     * @param featureId The feature identifier.
     *
     * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public String[] getRecognizedFeatures();

    /**
     * Returns a list of feature identifiers that are recognized by
     * this XMLGrammarLoader.  This method may return null if no features
     * are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
public interface XMLGrammarLoader {

/**
 * The intention of this interface is to provide a generic means
 * by which Grammar objects may be created without parsing instance
 * documents.  Implementations of this interface will know how to load
 * specific types of grammars (e.g., DTD's or schemas); a wrapper
 * will be provided for user applications to interact with these implementations.
 *
 * @author Neil Graham, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public Grammar loadGrammar(XMLInputSource source)

    /**
     * Returns a Grammar object by parsing the contents of the
     * entity pointed to by source.
     *
     * @param source        the location of the entity which forms
     *                          the starting point of the grammar to be constructed.
     * @throws IOException      When a problem is encountered reading the entity
     *          XNIException    When a condition arises (such as a FatalError) that requires parsing
     *                              of the entity be terminated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public XMLEntityResolver getEntityResolver();

    /** Returns the registered entity resolver.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setEntityResolver(XMLEntityResolver entityResolver);

    /**
     * Sets the entity resolver.
     *
     * @param entityResolver The new entity resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public XMLErrorHandler getErrorHandler();

    /** Returns the registered error handler.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setErrorHandler(XMLErrorHandler errorHandler);

    /**
     * Sets the error handler.
     *
     * @param errorHandler The error handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public Locale getLocale();

    /** Return the Locale the XMLGrammarLoader is using. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setLocale(Locale locale);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setProperty(String propertyId,
                Object state) throws XMLConfigurationException;

    /**
     * Sets the state of a property.
     *
     * @param propertyId The property identifier.
     * @param state     The state of the property.
     *
     * @throws XMLConfigurationException Thrown when a property is not
     *                  recognized or cannot be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public Object getProperty(String propertyId)

    /**
     * Returns the state of a property.
     *
     * @param propertyId The property identifier.
     *
     * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public String[] getRecognizedProperties();

    /**
     * Returns a list of property identifiers that are recognized by
     * this XMLGrammarLoader.  This method may return null if no properties
     * are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public void setFeature(String featureId,
                boolean state) throws XMLConfigurationException;

    /**
     * Sets the state of a feature.
     *
     * @param featureId The feature identifier.
     * @param state     The state of the feature.
     *
     * @throws XMLConfigurationException Thrown when a feature is not
     *                  recognized or cannot be set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public boolean getFeature(String featureId)

    /**
     * Returns the state of a feature.
     *
     * @param featureId The feature identifier.
     *
     * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
    public String[] getRecognizedFeatures();

    /**
     * Returns a list of feature identifiers that are recognized by
     * this XMLGrammarLoader.  This method may return null if no features
     * are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLGrammarLoader.java
public interface XMLGrammarLoader {

/**
 * The intention of this interface is to provide a generic means
 * by which Grammar objects may be created without parsing instance
 * documents.  Implementations of this interface will know how to load
 * specific types of grammars (e.g., DTD's or schemas); a wrapper
 * will be provided for user applications to interact with these implementations.
 *
 * @author Neil Graham, IBM
 */
