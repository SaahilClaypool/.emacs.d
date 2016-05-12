_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    String[] getCaseOrders() {

    /**
     * @return An array specifying the case ordering for each level of
     *         <code>xsl:sort</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    Collator[] getCollators() {

    /**
     * @return An array containing the Collator object in effect for each level
     *         of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    Locale[] getLocales() {

    /**
     * @return An array containing the Locale object in effect for each level
     *         of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    int[] getTypes() {

    /**
     * @return An array containing the type of comparison (text or number)
     *         to perform for each level of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    int[] getSortOrders() {

    /**
     * @return An array containing the sort order (ascending or descending)
     *         for each level of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    AbstractTranslet getTranslet() {

    /**
     * @return A reference to the translet object for the transformation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    SortSettings(AbstractTranslet translet, int[] sortOrders, int[] types,
                 Locale[] locales, Collator[] collators, String[] caseOrders) {

    /**
     * Create an instance of <code>SortSettings</code>.
     * @param translet {@link com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet}
     *                 object for the transformation
     * @param sortOrders an array specifying the sort order for each sort level
     * @param types an array specifying the type of comparison for each sort
     *              level (text or number)
     * @param locales an array specifying the Locale for each sort level
     * @param collators an array specifying the Collation in effect for each
     *                  sort level
     * @param caseOrders an array specifying whether upper-case, lower-case
     *                   or neither is to take precedence for each sort level.
     *                   The value of each element is equal to one of
     *                   <code>"upper-first", "lower-first", or ""</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private String[] _caseOrders;

    /**
     * Case ordering for each level of <code>xsl:sort</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private Collator[] _collators;

    /**
     * The Collator object in effect for each level of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private Locale[] _locales;

    /**
     * The Locale for each level of <code>xsl:sort</code>, based on any lang
     * attribute or the default Locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private int[] _types;

    /**
     * The type of comparison (text or number) for each level of
     * <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private int[] _sortOrders;

    /**
     * The sort order (ascending or descending) for each level of
     * <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
final class SortSettings {

/**
 * Class for carrying settings that are to be used for a particular set
 * of <code>xsl:sort</code> elements.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    String[] getCaseOrders() {

    /**
     * @return An array specifying the case ordering for each level of
     *         <code>xsl:sort</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    Collator[] getCollators() {

    /**
     * @return An array containing the Collator object in effect for each level
     *         of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    Locale[] getLocales() {

    /**
     * @return An array containing the Locale object in effect for each level
     *         of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    int[] getTypes() {

    /**
     * @return An array containing the type of comparison (text or number)
     *         to perform for each level of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    int[] getSortOrders() {

    /**
     * @return An array containing the sort order (ascending or descending)
     *         for each level of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    AbstractTranslet getTranslet() {

    /**
     * @return A reference to the translet object for the transformation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    SortSettings(AbstractTranslet translet, int[] sortOrders, int[] types,
                 Locale[] locales, Collator[] collators, String[] caseOrders) {

    /**
     * Create an instance of <code>SortSettings</code>.
     * @param translet {@link com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet}
     *                 object for the transformation
     * @param sortOrders an array specifying the sort order for each sort level
     * @param types an array specifying the type of comparison for each sort
     *              level (text or number)
     * @param locales an array specifying the Locale for each sort level
     * @param collators an array specifying the Collation in effect for each
     *                  sort level
     * @param caseOrders an array specifying whether upper-case, lower-case
     *                   or neither is to take precedence for each sort level.
     *                   The value of each element is equal to one of
     *                   <code>"upper-first", "lower-first", or ""</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private String[] _caseOrders;

    /**
     * Case ordering for each level of <code>xsl:sort</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private Collator[] _collators;

    /**
     * The Collator object in effect for each level of <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private Locale[] _locales;

    /**
     * The Locale for each level of <code>xsl:sort</code>, based on any lang
     * attribute or the default Locale.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private int[] _types;

    /**
     * The type of comparison (text or number) for each level of
     * <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
    private int[] _sortOrders;

    /**
     * The sort order (ascending or descending) for each level of
     * <code>xsl:sort</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SortSettings.java
final class SortSettings {

/**
 * Class for carrying settings that are to be used for a particular set
 * of <code>xsl:sort</code> elements.
 */
