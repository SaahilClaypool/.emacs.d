_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    private void formatValue(int value, String format, StringBuilder buffer) {

    /**
     * Format a single value based on the appropriate formatting token.
     * This method is based on saxon (Michael Kay) and only implements
     * lang="en".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    protected String formatNumbers(int[] values) {

    /**
     * Format a sequence of values according to the format paramaters
     * set by calling setFormatting().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    protected String formatNumbers(int value) {

    /**
     * Format a single value according to the format parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public boolean matchesFrom(int node) {

    /**
     * Returns true if <tt>node</tt> matches the from pattern. By default,
     * no node matches the from pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public boolean matchesCount(int node) {

    /**
     * Returns true if <tt>node</tt> matches the count pattern. By
     * default a node matches the count patterns if it is of the
     * same type as the starting node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public String getCounter(String format, String lang, String letterValue,
                String groupSep, String groupSize) {

    /**
     * Returns the position of <tt>node</tt> according to the level and
     * the from and count patterns. This position is converted into a
     * string based on the arguments passed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    abstract public String getCounter();

    /**
     * Returns the position of <tt>node</tt> according to the level and
     * the from and count patterns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public NodeCounter setDefaultFormatting() {

    /**
     * Sets formatting fields to their default values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    private int parseStringToAnInt(String s) {

    /**
     * Effectively does the same thing as Integer.parseInt(String s) except
     * instead of throwing a NumberFormatException, it returns 0.  This method
     * is used instead of Integer.parseInt() since it does not incur the
     * overhead of throwing an Exception which is expensive.
     *
     * @param s  A String to be parsed into an int.
     * @return  Either an int represented by the incoming String s, or 0 if
     *          the parsing is not successful.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    protected void setFormatting(String format, String lang, String letterValue,
                 String groupSep, String groupSize) {

    /**
     * Sets formatting fields before calling formatNumbers().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public NodeCounter setValue(double value) {

    /**
     * If the user specified a value attribute, use this instead of
     * counting nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    abstract public NodeCounter setStartNode(int node);

    /**
     * Set the start node for this counter. The same <tt>NodeCounter</tt>
     * object can be used multiple times by resetting the starting node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    protected boolean _hasFrom;

    /**
     * Indicates if this instance of xsl:number has a from pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
public abstract class NodeCounter {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    private void formatValue(int value, String format, StringBuilder buffer) {

    /**
     * Format a single value based on the appropriate formatting token.
     * This method is based on saxon (Michael Kay) and only implements
     * lang="en".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    protected String formatNumbers(int[] values) {

    /**
     * Format a sequence of values according to the format paramaters
     * set by calling setFormatting().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    protected String formatNumbers(int value) {

    /**
     * Format a single value according to the format parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public boolean matchesFrom(int node) {

    /**
     * Returns true if <tt>node</tt> matches the from pattern. By default,
     * no node matches the from pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public boolean matchesCount(int node) {

    /**
     * Returns true if <tt>node</tt> matches the count pattern. By
     * default a node matches the count patterns if it is of the
     * same type as the starting node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public String getCounter(String format, String lang, String letterValue,
                String groupSep, String groupSize) {

    /**
     * Returns the position of <tt>node</tt> according to the level and
     * the from and count patterns. This position is converted into a
     * string based on the arguments passed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    abstract public String getCounter();

    /**
     * Returns the position of <tt>node</tt> according to the level and
     * the from and count patterns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public NodeCounter setDefaultFormatting() {

    /**
     * Sets formatting fields to their default values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    private int parseStringToAnInt(String s) {

    /**
     * Effectively does the same thing as Integer.parseInt(String s) except
     * instead of throwing a NumberFormatException, it returns 0.  This method
     * is used instead of Integer.parseInt() since it does not incur the
     * overhead of throwing an Exception which is expensive.
     *
     * @param s  A String to be parsed into an int.
     * @return  Either an int represented by the incoming String s, or 0 if
     *          the parsing is not successful.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    protected void setFormatting(String format, String lang, String letterValue,
                 String groupSep, String groupSize) {

    /**
     * Sets formatting fields before calling formatNumbers().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    public NodeCounter setValue(double value) {

    /**
     * If the user specified a value attribute, use this instead of
     * counting nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    abstract public NodeCounter setStartNode(int node);

    /**
     * Set the start node for this counter. The same <tt>NodeCounter</tt>
     * object can be used multiple times by resetting the starting node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
    protected boolean _hasFrom;

    /**
     * Indicates if this instance of xsl:number has a from pattern.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter.java
public abstract class NodeCounter {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
