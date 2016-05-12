_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public abstract String extractValueFromDOM(DOM dom, int current, int level,
                                               AbstractTranslet translet,
                                               int last);

    /**
     * Extract the sort value for a level of this key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public Collator[] getCollator() {

    /**
     * Returns the array of Collators used for text comparisons in this object.
     * May be overridden by inheriting classes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public int compareTo(NodeSortRecord other) {

    /**
     * Compare this sort element to another. The first level is checked first,
     * and we proceed to the next level only if the first level keys are
     * identical (and so the key values may not even be extracted from the DOM)
     *
     * !!!!MUST OPTIMISE - THIS IS REALLY, REALLY SLOW!!!!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    private final Comparable stringValue(int level) {

    /**
     * Get the string or numeric value of a specific level key for this sort
     * element. The value is extracted from the DOM if it is not already in
     * our sort key vector.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public final int compareDocOrder(NodeSortRecord other) {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public final int getNode() {

    /**
     * Returns the node for this sort object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public final void initialize(int node, int last, DOM dom,
         SortSettings settings)

    /**
     * This method allows the caller to set the values that could not be passed
     * to the default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public NodeSortRecord(int node) {

    /**
     * This constructor is run by a call to ClassLoader in the
     * makeNodeSortRecord method in the NodeSortRecordFactory class. Since we
     * cannot pass any parameters to the constructor in that case we just set
     * the default values here and wait for new values through initialize().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    protected Locale _locale;

    /**
     * A locale field that might be set by an instance of a subclass.
     * @deprecated This field continues to exist for binary compatibility.
     *             New code should not refer to it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    protected Collator _collator = DEFAULT_COLLATOR;

    /**
     * A reference to the first Collator
     * @deprecated This field continues to exist for binary compatibility.
     *             New code should not refer to it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    private static final Collator DEFAULT_COLLATOR = Collator.getInstance();

    /**
     * A reference to a collator. May be updated by subclass if the stylesheet
     * specifies a different language (will be updated iff _locale is updated).
     * @deprecated This field continues to exist for binary compatibility.
     *             New code should not refer to it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
public abstract class NodeSortRecord {

/**
 * Base class for sort records containing application specific sort keys
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public abstract String extractValueFromDOM(DOM dom, int current, int level,
                                               AbstractTranslet translet,
                                               int last);

    /**
     * Extract the sort value for a level of this key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public Collator[] getCollator() {

    /**
     * Returns the array of Collators used for text comparisons in this object.
     * May be overridden by inheriting classes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public int compareTo(NodeSortRecord other) {

    /**
     * Compare this sort element to another. The first level is checked first,
     * and we proceed to the next level only if the first level keys are
     * identical (and so the key values may not even be extracted from the DOM)
     *
     * !!!!MUST OPTIMISE - THIS IS REALLY, REALLY SLOW!!!!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    private final Comparable stringValue(int level) {

    /**
     * Get the string or numeric value of a specific level key for this sort
     * element. The value is extracted from the DOM if it is not already in
     * our sort key vector.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public final int compareDocOrder(NodeSortRecord other) {

    /**
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public final int getNode() {

    /**
     * Returns the node for this sort object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public final void initialize(int node, int last, DOM dom,
         SortSettings settings)

    /**
     * This method allows the caller to set the values that could not be passed
     * to the default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    public NodeSortRecord(int node) {

    /**
     * This constructor is run by a call to ClassLoader in the
     * makeNodeSortRecord method in the NodeSortRecordFactory class. Since we
     * cannot pass any parameters to the constructor in that case we just set
     * the default values here and wait for new values through initialize().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    protected Locale _locale;

    /**
     * A locale field that might be set by an instance of a subclass.
     * @deprecated This field continues to exist for binary compatibility.
     *             New code should not refer to it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    protected Collator _collator = DEFAULT_COLLATOR;

    /**
     * A reference to the first Collator
     * @deprecated This field continues to exist for binary compatibility.
     *             New code should not refer to it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
    private static final Collator DEFAULT_COLLATOR = Collator.getInstance();

    /**
     * A reference to a collator. May be updated by subclass if the stylesheet
     * specifies a different language (will be updated iff _locale is updated).
     * @deprecated This field continues to exist for binary compatibility.
     *             New code should not refer to it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord.java
public abstract class NodeSortRecord {

/**
 * Base class for sort records containing application specific sort keys
 */
