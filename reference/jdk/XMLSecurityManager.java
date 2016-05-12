_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private boolean getSystemProperty(Limit limit, String sysPropertyName) {

    /**
     * Read from system properties, or those in jaxp.properties
     *
     * @param property the type of the property
     * @param sysPropertyName the name of system property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private void readSystemProperties() {

    /**
     * Read from system properties, or those in jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public boolean isSet(int index) {

    /**
     * Indicate if a property is set explicitly
     * @param index
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public int getIndex(String propertyName) {

    /**
     * Get the index by property name
     *
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public String getStateLiteral(Limit limit) {

    /**
     * Return the state of the limit property
     *
     * @param limit the limit
     * @return the state of the limit property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public State getState(Limit limit) {

    /**
     * Return the state of the limit property
     *
     * @param limit the limit
     * @return the state of the limit property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public String getLimitValueByIndex(int index) {

    /**
     * Return the value of a property by its index
     *
     * @param index the index of a property
     * @return limit of a property as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public int getLimitByIndex(int index) {

    /**
     * Return the value of a property by its ordinal
     *
     * @param index the index of a property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public int getLimit(Limit limit) {

    /**
     * Return the value of the specified property
     *
     * @param limit the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public String getLimitValueAsString(Limit limit) {

    /**
     * Return the value of a property by its ordinal
     *
     * @param limit the property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public String getLimitAsString(String propertyName) {

    /**
     * Return the value of the specified property.
     *
     * @param propertyName the property name
     * @return the value of the property as a string. If a property is managed
     * by this manager, its value shall not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public void setLimit(int index, State state, int value) {

    /**
     * Set the value of a property by its index
     *
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public void setLimit(int index, State state, Object value) {

    /**
     * Set the value of a property by its index
     *
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public void setLimit(Limit limit, State state, int value) {

    /**
     * Set the value for a specific limit.
     *
     * @param limit the limit
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public boolean setLimit(String propertyName, State state, Object value) {

    /**
     * Set limit by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security manager; false
     *              if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public void setSecureProcessing(boolean secure) {

    /**
     * Setting FEATURE_SECURE_PROCESSING explicitly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public XMLSecurityManager(boolean secureProcessing) {

    /**
     * Instantiate Security Manager in accordance with the status of
     * secure processing
     * @param secureProcessing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public XMLSecurityManager() {

    /**
     * Default constructor. Establishes default values for known security
     * vulnerabilities.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private final int indexEntityCountInfo = 10000;

    /**
     * Index of the special entityCountInfo property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private boolean[] isSet;

    /**
     * States that determine if properties are set explicitly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private final int[] values;

    /**
     * Values of the properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public static enum NameMap {

    /**
     * Map old property names with the new ones
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public static enum Limit {

    /**
     * Limits managed by the security manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public static enum State {

    /**
     * States of the settings of a property, in the order: default value, value
     * set by FEATURE_SECURE_PROCESSING, jaxp.properties file, jaxp system
     * properties, and jaxp api properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
public final class XMLSecurityManager {

/**
 * This class is not the same as that in Xerces. It is used to manage the
 * state of corresponding Xerces properties and pass the values over to
 * the Xerces Security Manager.
 *
 * @author Joe Wang Oracle Corp.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    static public XMLSecurityManager convert(Object value, XMLSecurityManager securityManager) {

    /**
     * Convert a value set through setProperty to XMLSecurityManager.
     * If the value is an instance of XMLSecurityManager, use it to override the default;
     * If the value is an old SecurityManager, convert to the new XMLSecurityManager.
     *
     * @param value user specified security manager
     * @param securityManager an instance of XMLSecurityManager
     * @return an instance of the new security manager XMLSecurityManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private boolean getSystemProperty(Limit limit, String sysPropertyName) {

    /**
     * Read from system properties, or those in jaxp.properties
     *
     * @param property the type of the property
     * @param sysPropertyName the name of system property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private void readSystemProperties() {

    /**
     * Read from system properties, or those in jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isSet(int index) {

    /**
     * Indicate if a property is set explicitly
     * @param index
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isOverLimit(Limit limit, XMLLimitAnalyzer limitAnalyzer) {

    /**
     * Check against cumulated value
     *
     * @param limit the type of the limit property
     * @param size the size (count or length) of the entity
     * @return true if the size is over the limit, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isOverLimit(int index, String entityName, int size,
            XMLLimitAnalyzer limitAnalyzer) {

    /**
     * Check if the value (length or count) of the specified limit property is
     * over the limit
     *
     * @param index the index of the limit property
     * @param entityName the name of the entity
     * @param size the size (count or length) of the entity
     * @return true if the size is over the limit, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isOverLimit(Limit limit, String entityName, int size,
            XMLLimitAnalyzer limitAnalyzer) {

    /**
     * Check if the size (length or count) of the specified limit property is
     * over the limit
     *
     * @param limit the type of the limit property
     * @param entityName the name of the entity
     * @param size the size (count or length) of the entity
     * @return true if the size is over the limit, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isNoLimit(int limit) {

    /**
     * Check if there's no limit defined by the Security Manager
     * @param limit
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public int getIndex(String propertyName) {

    /**
     * Get the index by property name
     *
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public String getStateLiteral(Limit limit) {

    /**
     * Return the state of the limit property
     *
     * @param limit the limit
     * @return the state of the limit property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public State getState(Limit limit) {

    /**
     * Return the state of the limit property
     *
     * @param limit the limit
     * @return the state of the limit property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public String getLimitValueByIndex(int index) {

    /**
     * Return the value of a property by its ordinal
     *
     * @param index the index of a property
     * @return limit of a property as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public String getLimitValueAsString(Limit limit) {

    /**
     * Return the value of a property by its ordinal
     *
     * @param limit the property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public int getLimit(Limit limit) {

    /**
     * Return the value of the specified property
     *
     * @param limit the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public String getLimitAsString(String propertyName) {

    /**
     * Return the value of the specified property
     *
     * @param propertyName the property name
     * @return the value of the property as a string. If a property is managed
     * by this manager, its value shall not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public void setLimit(int index, State state, int value) {

    /**
     * Set the value of a property by its index
     *
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public void setLimit(int index, State state, Object value) {

    /**
     * Set the value of a property by its index
     *
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public void setLimit(Limit limit, State state, int value) {

    /**
     * Set the value for a specific limit.
     *
     * @param limit the limit
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean setLimit(String propertyName, State state, Object value) {

    /**
     * Set limit by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security manager; false
     *              if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isSecureProcessing() {

    /**
     * Return the state of secure processing
     * @return the state of secure processing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public void setSecureProcessing(boolean secure) {

    /**
     * Setting FEATURE_SECURE_PROCESSING explicitly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public XMLSecurityManager(boolean secureProcessing) {

    /**
     * Instantiate Security Manager in accordance with the status of
     * secure processing
     * @param secureProcessing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public XMLSecurityManager() {

    /**
     * Default constructor. Establishes default values for known security
     * vulnerabilities.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private final int indexEntityCountInfo = 10000;

    /**
     * Index of the special entityCountInfo property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private boolean[] isSet;

    /**
     * States that determine if properties are set explicitly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    boolean secureProcessing;

    /**
     * Flag indicating if secure processing is set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private final int[] values;

    /**
     * Values of the properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public static enum NameMap {

    /**
     * Map old property names with the new ones
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public static enum Limit {

    /**
     * Limits managed by the security manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public static enum State {

    /**
     * States of the settings of a property, in the order: default value, value
     * set by FEATURE_SECURE_PROCESSING, jaxp.properties file, jaxp system
     * properties, and jaxp api properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
public final class XMLSecurityManager {

/**
 * This class manages standard and implementation-specific limitations.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private boolean getSystemProperty(Limit limit, String sysPropertyName) {

    /**
     * Read from system properties, or those in jaxp.properties
     *
     * @param property the type of the property
     * @param sysPropertyName the name of system property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private void readSystemProperties() {

    /**
     * Read from system properties, or those in jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public boolean isSet(int index) {

    /**
     * Indicate if a property is set explicitly
     * @param index
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public int getIndex(String propertyName) {

    /**
     * Get the index by property name
     *
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public String getStateLiteral(Limit limit) {

    /**
     * Return the state of the limit property
     *
     * @param limit the limit
     * @return the state of the limit property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public State getState(Limit limit) {

    /**
     * Return the state of the limit property
     *
     * @param limit the limit
     * @return the state of the limit property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public String getLimitValueByIndex(int index) {

    /**
     * Return the value of a property by its index
     *
     * @param index the index of a property
     * @return limit of a property as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public int getLimitByIndex(int index) {

    /**
     * Return the value of a property by its ordinal
     *
     * @param index the index of a property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public int getLimit(Limit limit) {

    /**
     * Return the value of the specified property
     *
     * @param limit the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public String getLimitValueAsString(Limit limit) {

    /**
     * Return the value of a property by its ordinal
     *
     * @param limit the property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public String getLimitAsString(String propertyName) {

    /**
     * Return the value of the specified property.
     *
     * @param propertyName the property name
     * @return the value of the property as a string. If a property is managed
     * by this manager, its value shall not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public void setLimit(int index, State state, int value) {

    /**
     * Set the value of a property by its index
     *
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public void setLimit(int index, State state, Object value) {

    /**
     * Set the value of a property by its index
     *
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public void setLimit(Limit limit, State state, int value) {

    /**
     * Set the value for a specific limit.
     *
     * @param limit the limit
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public boolean setLimit(String propertyName, State state, Object value) {

    /**
     * Set limit by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security manager; false
     *              if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public void setSecureProcessing(boolean secure) {

    /**
     * Setting FEATURE_SECURE_PROCESSING explicitly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public XMLSecurityManager(boolean secureProcessing) {

    /**
     * Instantiate Security Manager in accordance with the status of
     * secure processing
     * @param secureProcessing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public XMLSecurityManager() {

    /**
     * Default constructor. Establishes default values for known security
     * vulnerabilities.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private final int indexEntityCountInfo = 10000;

    /**
     * Index of the special entityCountInfo property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private boolean[] isSet;

    /**
     * States that determine if properties are set explicitly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    private final int[] values;

    /**
     * Values of the properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public static enum NameMap {

    /**
     * Map old property names with the new ones
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public static enum Limit {

    /**
     * Limits managed by the security manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
    public static enum State {

    /**
     * States of the settings of a property, in the order: default value, value
     * set by FEATURE_SECURE_PROCESSING, jaxp.properties file, jaxp system
     * properties, and jaxp api properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/utils/XMLSecurityManager.java
public final class XMLSecurityManager {

/**
 * This class is not the same as that in Xerces. It is used to manage the
 * state of corresponding Xerces properties and pass the values over to
 * the Xerces Security Manager.
 *
 * @author Joe Wang Oracle Corp.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    static public XMLSecurityManager convert(Object value, XMLSecurityManager securityManager) {

    /**
     * Convert a value set through setProperty to XMLSecurityManager.
     * If the value is an instance of XMLSecurityManager, use it to override the default;
     * If the value is an old SecurityManager, convert to the new XMLSecurityManager.
     *
     * @param value user specified security manager
     * @param securityManager an instance of XMLSecurityManager
     * @return an instance of the new security manager XMLSecurityManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private boolean getSystemProperty(Limit limit, String sysPropertyName) {

    /**
     * Read from system properties, or those in jaxp.properties
     *
     * @param property the type of the property
     * @param sysPropertyName the name of system property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private void readSystemProperties() {

    /**
     * Read from system properties, or those in jaxp.properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isSet(int index) {

    /**
     * Indicate if a property is set explicitly
     * @param index
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isOverLimit(Limit limit, XMLLimitAnalyzer limitAnalyzer) {

    /**
     * Check against cumulated value
     *
     * @param limit the type of the limit property
     * @param size the size (count or length) of the entity
     * @return true if the size is over the limit, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isOverLimit(int index, String entityName, int size,
            XMLLimitAnalyzer limitAnalyzer) {

    /**
     * Check if the value (length or count) of the specified limit property is
     * over the limit
     *
     * @param index the index of the limit property
     * @param entityName the name of the entity
     * @param size the size (count or length) of the entity
     * @return true if the size is over the limit, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isOverLimit(Limit limit, String entityName, int size,
            XMLLimitAnalyzer limitAnalyzer) {

    /**
     * Check if the size (length or count) of the specified limit property is
     * over the limit
     *
     * @param limit the type of the limit property
     * @param entityName the name of the entity
     * @param size the size (count or length) of the entity
     * @return true if the size is over the limit, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isNoLimit(int limit) {

    /**
     * Check if there's no limit defined by the Security Manager
     * @param limit
     * @return
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public int getIndex(String propertyName) {

    /**
     * Get the index by property name
     *
     * @param propertyName property name
     * @return the index of the property if found; return -1 if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public String getStateLiteral(Limit limit) {

    /**
     * Return the state of the limit property
     *
     * @param limit the limit
     * @return the state of the limit property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public State getState(Limit limit) {

    /**
     * Return the state of the limit property
     *
     * @param limit the limit
     * @return the state of the limit property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public String getLimitValueByIndex(int index) {

    /**
     * Return the value of a property by its ordinal
     *
     * @param index the index of a property
     * @return limit of a property as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public String getLimitValueAsString(Limit limit) {

    /**
     * Return the value of a property by its ordinal
     *
     * @param limit the property
     * @return value of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public int getLimit(Limit limit) {

    /**
     * Return the value of the specified property
     *
     * @param limit the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public String getLimitAsString(String propertyName) {

    /**
     * Return the value of the specified property
     *
     * @param propertyName the property name
     * @return the value of the property as a string. If a property is managed
     * by this manager, its value shall not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public void setLimit(int index, State state, int value) {

    /**
     * Set the value of a property by its index
     *
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public void setLimit(int index, State state, Object value) {

    /**
     * Set the value of a property by its index
     *
     * @param index the index of the property
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public void setLimit(Limit limit, State state, int value) {

    /**
     * Set the value for a specific limit.
     *
     * @param limit the limit
     * @param state the state of the property
     * @param value the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean setLimit(String propertyName, State state, Object value) {

    /**
     * Set limit by property name and state
     * @param propertyName property name
     * @param state the state of the property
     * @param value the value of the property
     * @return true if the property is managed by the security manager; false
     *              if otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public boolean isSecureProcessing() {

    /**
     * Return the state of secure processing
     * @return the state of secure processing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public void setSecureProcessing(boolean secure) {

    /**
     * Setting FEATURE_SECURE_PROCESSING explicitly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public XMLSecurityManager(boolean secureProcessing) {

    /**
     * Instantiate Security Manager in accordance with the status of
     * secure processing
     * @param secureProcessing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public XMLSecurityManager() {

    /**
     * Default constructor. Establishes default values for known security
     * vulnerabilities.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private final int indexEntityCountInfo = 10000;

    /**
     * Index of the special entityCountInfo property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private boolean[] isSet;

    /**
     * States that determine if properties are set explicitly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    boolean secureProcessing;

    /**
     * Flag indicating if secure processing is set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    private final int[] values;

    /**
     * Values of the properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public static enum NameMap {

    /**
     * Map old property names with the new ones
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public static enum Limit {

    /**
     * Limits managed by the security manager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
    public static enum State {

    /**
     * States of the settings of a property, in the order: default value, value
     * set by FEATURE_SECURE_PROCESSING, jaxp.properties file, jaxp system
     * properties, and jaxp api properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLSecurityManager.java
public final class XMLSecurityManager {

/**
 * This class manages standard and implementation-specific limitations.
 *
 */
