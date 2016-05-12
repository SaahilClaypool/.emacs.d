_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
    private void readSystemProperties() {

    /**
     * Read from system properties, or those in jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
    public int getIndex(String propertyName){

    /**
     * Get the index by property name
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
    public XMLSecurityPropertyManager() {

    /**
     * Default constructor. Establishes default values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
    public static enum Property {

    /**
     * Properties managed by the security property manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
public final class XMLSecurityPropertyManager extends FeaturePropertyBase {

/**
 * This class manages security related properties
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    private void getSystemProperty(Property property, String systemProperty) {

    /**
     * Read from system properties, or those in jaxp.properties
     *
     * @param property the property
     * @param systemProperty the name of the system property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    private void readSystemProperties() {

    /**
     * Read from system properties, or those in jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public int getIndex(String propertyName){

    /**
     * Get the index by property name
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public String getValueByIndex(int index) {

    /**
     * Return the value of a property by its ordinal
     * @param index the index of a property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public String getValue(Property property) {

    /**
     * Return the value of the specified property
     *
     * @param property the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public String getValue(String propertyName) {

    /**
     * Return the value of the specified property
     *
     * @param propertyName the property name
     * @return the value of the property as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public void setValue(int index, State state, String value) {

    /**
     * Set the value of a property by its index
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public void setValue(Property property, State state, String value) {

    /**
     * Set the value for a specific property.
     *
     * @param property the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public boolean setValue(String propertyName, State state, Object value) {

    /**
     * Set limit by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security property manager;
     *         false if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public XMLSecurityPropertyManager() {

    /**
     * Default constructor. Establishes default values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    private final String[] values;

    /**
     * Values of the properties as defined in enum Properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public static enum Property {

    /**
     * Limits managed by the security manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public static enum State {

    /**
     * States of the settings of a property, in the order: default value, value
     * set by FEATURE_SECURE_PROCESSING, jaxp.properties file, jaxp system
     * properties, and jaxp api properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
public final class XMLSecurityPropertyManager {

/**
 * This class manages security related properties
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
    private void readSystemProperties() {

    /**
     * Read from system properties, or those in jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
    public int getIndex(String propertyName){

    /**
     * Get the index by property name
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
    public XMLSecurityPropertyManager() {

    /**
     * Default constructor. Establishes default values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
    public static enum Property {

    /**
     * Properties managed by the security property manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityPropertyManager.java
public final class XMLSecurityPropertyManager extends FeaturePropertyBase {

/**
 * This class manages security related properties
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    private void getSystemProperty(Property property, String systemProperty) {

    /**
     * Read from system properties, or those in jaxp.properties
     *
     * @param property the property
     * @param systemProperty the name of the system property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    private void readSystemProperties() {

    /**
     * Read from system properties, or those in jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public int getIndex(String propertyName){

    /**
     * Get the index by property name
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public String getValueByIndex(int index) {

    /**
     * Return the value of a property by its ordinal
     * @param index the index of a property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public String getValue(Property property) {

    /**
     * Return the value of the specified property
     *
     * @param property the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public String getValue(String propertyName) {

    /**
     * Return the value of the specified property
     *
     * @param propertyName the property name
     * @return the value of the property as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public void setValue(int index, State state, String value) {

    /**
     * Set the value of a property by its index
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public void setValue(Property property, State state, String value) {

    /**
     * Set the value for a specific property.
     *
     * @param property the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public boolean setValue(String propertyName, State state, Object value) {

    /**
     * Set limit by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security property manager;
     *         false if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public XMLSecurityPropertyManager() {

    /**
     * Default constructor. Establishes default values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    private final String[] values;

    /**
     * Values of the properties as defined in enum Properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public static enum Property {

    /**
     * Limits managed by the security manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
    public static enum State {

    /**
     * States of the settings of a property, in the order: default value, value
     * set by FEATURE_SECURE_PROCESSING, jaxp.properties file, jaxp system
     * properties, and jaxp api properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityPropertyManager.java
public final class XMLSecurityPropertyManager {

/**
 * This class manages security related properties
 *
 */
