_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
    public Object getProperty(String propertyId, Object defaultObject);

    /**
     * Returns the value of a property.
     * Does not throw exceptions.
     *
     * @param propertyId The property identifier.
     * @param defaultObject Return value if property is not available.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
    public Object getProperty(String propertyId)

    /**
     * Returns the value of a property.
     *
     * @param propertyId The property identifier.
     *
    * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
    public boolean getFeature(String featureId, boolean defaultValue);

    /**
     * Returns the state of a feature.
     * Does not throw exceptions.
     *
     * @param featureId The feature identifier.
     * @param defaultValue Default value if future is not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
public interface XMLComponentManager {

/**
 * The component manager manages a parser configuration and the components
 * that make up that configuration. The manager notifies each component
 * before parsing to allow the components to initialize their state; and
 * also any time that a parser feature or property changes.
 * <p>
 * The methods of the component manager allow components to query features
 * and properties that affect the operation of the component.
 *
 * @see XMLComponent
 *
 * @author Andy Clark, IBM
 *
 * @version $Id: XMLComponentManager.java,v 1.6 2010-11-01 04:40:22 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
    public Object getProperty(String propertyId, Object defaultObject);

    /**
     * Returns the value of a property.
     * Does not throw exceptions.
     *
     * @param propertyId The property identifier.
     * @param defaultObject Return value if property is not available.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
    public Object getProperty(String propertyId)

    /**
     * Returns the value of a property.
     *
     * @param propertyId The property identifier.
     *
    * @throws XMLConfigurationException Thrown on configuration error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
    public boolean getFeature(String featureId, boolean defaultValue);

    /**
     * Returns the state of a feature.
     * Does not throw exceptions.
     *
     * @param featureId The feature identifier.
     * @param defaultValue Default value if future is not available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/parser/XMLComponentManager.java
public interface XMLComponentManager {

/**
 * The component manager manages a parser configuration and the components
 * that make up that configuration. The manager notifies each component
 * before parsing to allow the components to initialize their state; and
 * also any time that a parser feature or property changes.
 * <p>
 * The methods of the component manager allow components to query features
 * and properties that affect the operation of the component.
 *
 * @see XMLComponent
 *
 * @author Andy Clark, IBM
 *
 * @version $Id: XMLComponentManager.java,v 1.6 2010-11-01 04:40:22 joehw Exp $
 */
