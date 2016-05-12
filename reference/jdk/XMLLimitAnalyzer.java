_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public void reset(Limit limit) {

    /**
     * Resets the current value of the specified limit.
     * @param limit The limit to be reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public void endEntity(Limit limit, String name) {

    /**
     * Stop tracking the entity
     * @param limit the limit property
     * @param name the name of an entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public int getValueByIndex(int index) {

    /**
     * Return the current max value (count or length) by the index of a property
     * @param index the index of a property
     * @return count of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public int getTotalValue(Limit limit) {

    /**
     * Return the total value accumulated so far
     *
     * @param limit the property
     * @return the accumulated value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public int getValue(Limit limit) {

    /**
     * Return the value of the current max count for the specified property
     *
     * @param limit the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public void addValue(int index, String entityName, int value) {

    /**
     * Add the value to the current count by the index of the property
     * @param index the index of the property
     * @param entityName the name of the entity
     * @param value the value of the entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public void addValue(Limit limit, String entityName, int value) {

    /**
     * Add the value to the current max count for the specified property
     * To find the max value of all entities, set no limit
     *
     * @param limit the type of the property
     * @param entityName the name of the entity
     * @param value the value of the entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public XMLLimitAnalyzer() {

    /**
     * Default constructor. Establishes default values for known security
     * vulnerabilities.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    private final Map[] caches;

    /**
     * Maintain values of the top 10 elements in the process of parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    private final int[] totalValue;

    /**
     * Total value of accumulated entities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    private final int[] values;

    /**
     * Max value accumulated for each property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public static enum NameMap {

    /**
     * Map old property names with the new ones
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
public final class XMLLimitAnalyzer {

/**
 * A helper for analyzing entity expansion limits
 *
 * @author Joe Wang Oracle Corp.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public void reset(Limit limit) {

    /**
     * Resets the current value of the specified limit.
     * @param limit The limit to be reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public void endEntity(Limit limit, String name) {

    /**
     * Stop tracking the entity
     * @param limit the limit property
     * @param name the name of an entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public int getValueByIndex(int index) {

    /**
     * Return the current max value (count or length) by the index of a property
     * @param index the index of a property
     * @return count of a property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public int getTotalValue(Limit limit) {

    /**
     * Return the total value accumulated so far
     *
     * @param limit the property
     * @return the accumulated value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public int getValue(Limit limit) {

    /**
     * Return the value of the current max count for the specified property
     *
     * @param limit the property
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public void addValue(int index, String entityName, int value) {

    /**
     * Add the value to the current count by the index of the property
     * @param index the index of the property
     * @param entityName the name of the entity
     * @param value the value of the entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public void addValue(Limit limit, String entityName, int value) {

    /**
     * Add the value to the current max count for the specified property
     * To find the max value of all entities, set no limit
     *
     * @param limit the type of the property
     * @param entityName the name of the entity
     * @param value the value of the entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public XMLLimitAnalyzer() {

    /**
     * Default constructor. Establishes default values for known security
     * vulnerabilities.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    private final Map[] caches;

    /**
     * Maintain values of the top 10 elements in the process of parsing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    private final int[] totalValue;

    /**
     * Total value of accumulated entities
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    private final int[] values;

    /**
     * Max value accumulated for each property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
    public static enum NameMap {

    /**
     * Map old property names with the new ones
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/utils/XMLLimitAnalyzer.java
public final class XMLLimitAnalyzer {

/**
 * A helper for analyzing entity expansion limits
 *
 * @author Joe Wang Oracle Corp.
 *
 */
