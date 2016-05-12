_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    void getSystemProperty(Enum property, String systemProperty) {

    /**
     * Read from system properties, or those in jaxp.properties
     *
     * @param property the property
     * @param systemProperty the name of the system property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public abstract int getIndex(String propertyName);

    /**
     * Get the index by property name
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public String getValueByIndex(int index) {

    /**
     * Return the value of a property by its ordinal
     * @param index the index of a property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public String getValueAsString(String propertyName) {

    /**
     * Return the value of the specified property.
     *
     * @param propertyName the property name
     * @return the value of the property as a string. If a property is managed
     * by this manager, its value shall not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public String getValue(String property) {

    /**
     * Return the value of the specified property
     *
     * @param property the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public String getValue(Enum property) {

    /**
     * Return the value of the specified property
     *
     * @param property the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public boolean setValue(String propertyName, State state, boolean value) {

     /**
     * Set value by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security property manager;
     *         false if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public boolean setValue(String propertyName, State state, Object value) {

     /**
     * Set value by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security property manager;
     *         false if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public void setValue(int index, State state, String value) {

    /**
     * Set the value of a property by its index
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public void setValue(Enum property, State state, String value) {

    /**
     * Set the value for a specific property.
     *
     * @param property the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    String[] values = null;

    /**
     * Values of the properties as defined in enum Properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public static enum State {

    /**
     * States of the settings of a property, in the order: default value, value
     * set by FEATURE_SECURE_PROCESSING, jaxp.properties file, jaxp system
     * properties, and jaxp api properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
public abstract class FeaturePropertyBase {

/**
 * This is the base class for features and properties
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    void getSystemProperty(Enum property, String systemProperty) {

    /**
     * Read from system properties, or those in jaxp.properties
     *
     * @param property the property
     * @param systemProperty the name of the system property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public abstract int getIndex(String propertyName);

    /**
     * Get the index by property name
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public String getValueByIndex(int index) {

    /**
     * Return the value of a property by its ordinal
     * @param index the index of a property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public String getValueAsString(String propertyName) {

    /**
     * Return the value of the specified property.
     *
     * @param propertyName the property name
     * @return the value of the property as a string. If a property is managed
     * by this manager, its value shall not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public String getValue(String property) {

    /**
     * Return the value of the specified property
     *
     * @param property the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public String getValue(Enum property) {

    /**
     * Return the value of the specified property
     *
     * @param property the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public boolean setValue(String propertyName, State state, boolean value) {

     /**
     * Set value by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security property manager;
     *         false if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public boolean setValue(String propertyName, State state, Object value) {

     /**
     * Set value by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security property manager;
     *         false if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public void setValue(int index, State state, String value) {

    /**
     * Set the value of a property by its index
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public void setValue(Enum property, State state, String value) {

    /**
     * Set the value for a specific property.
     *
     * @param property the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    String[] values = null;

    /**
     * Values of the properties as defined in enum Properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
    public static enum State {

    /**
     * States of the settings of a property, in the order: default value, value
     * set by FEATURE_SECURE_PROCESSING, jaxp.properties file, jaxp system
     * properties, and jaxp api properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/FeaturePropertyBase.java
public abstract class FeaturePropertyBase {

/**
 * This is the base class for features and properties
 *
 */
