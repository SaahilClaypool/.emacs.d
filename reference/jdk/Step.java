_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public String toString() {

    /**
     * Returns a string representation of this step.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void translatePredicates(ClassGenerator classGen,
                                    MethodGenerator methodGen,
                                    int predicateIndex) {

    /**
     * Translate a sequence of predicates. Each predicate is translated
     * by constructing an instance of <code>CurrentNodeListIterator</code>
     * which is initialized from another iterator (recursive call),
     * a filter and a closure (call to translate on the predicate) and "this".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate a step by pushing the appropriate iterator onto the stack.
     * The abbreviated steps '.' and '@attr' do not create new iterators
     * if they are not part of a LocationPath and have no filters.
     * In these cases a node index instead of an iterator is pushed
     * onto the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check this step. The abbreviated steps '.' and '@attr' are
     * assigned type node if they have no predicates. All other steps
     * have type node-set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public boolean isAbbreviatedDDot() {

    /**
     * True if this step is the abbreviated step '..'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public boolean isAbbreviatedDot() {

    /**
     * True if this step is the abbreviated step '.'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean isPredicate() {

    /**
     * Returns 'true' if this step is used within a predicate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean hasPredicates() {

    /**
     * Returns 'true' if this step has any predicates
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean hasParentLocationPath() {

    /**
     * Returns 'true' if this step has a parent location path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean hasParentPattern() {

    /**
     * Returns 'true' if this step has a parent pattern.
     * This method will return 'false' if this step occurs on its own under
     * an element like <xsl:for-each> or <xsl:apply-templates>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void addPredicates(Vector predicates) {

    /**
     * Returns the vector containing all predicates for this step.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public Vector getPredicates() {

    /**
     * Returns the vector containing all predicates for this step.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public int getNodeType() {

    /**
     * Returns the node-type for this step
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void setAxis(int axis) {

    /**
     * Get the axis (defined in Axis class) for this step
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public int getAxis() {

    /**
     * Define the axis (defined in Axis class) for this step
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void setParser(Parser parser) {

    /**
     * Set the parser for this element and all child predicates
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private int _nodeType;

    /**
     * Type of the node test.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean _hadPredicates = false;

    /**
     * Some simple predicates can be handled by this class (and not by the
     * Predicate class) and will be removed from the above vector as they are
     * handled. We use this boolean to remember if we did have any predicates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private Vector _predicates;

    /**
     * A vector of predicates (filters) defined on this step - may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private int _axis;

    /**
     * This step's axis as defined in class Axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
final class Step extends RelativeLocationPath {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public String toString() {

    /**
     * Returns a string representation of this step.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void translatePredicates(ClassGenerator classGen,
                                    MethodGenerator methodGen,
                                    int predicateIndex) {

    /**
     * Translate a sequence of predicates. Each predicate is translated
     * by constructing an instance of <code>CurrentNodeListIterator</code>
     * which is initialized from another iterator (recursive call),
     * a filter and a closure (call to translate on the predicate) and "this".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate a step by pushing the appropriate iterator onto the stack.
     * The abbreviated steps '.' and '@attr' do not create new iterators
     * if they are not part of a LocationPath and have no filters.
     * In these cases a node index instead of an iterator is pushed
     * onto the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check this step. The abbreviated steps '.' and '@attr' are
     * assigned type node if they have no predicates. All other steps
     * have type node-set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public boolean isAbbreviatedDDot() {

    /**
     * True if this step is the abbreviated step '..'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public boolean isAbbreviatedDot() {

    /**
     * True if this step is the abbreviated step '.'
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean isPredicate() {

    /**
     * Returns 'true' if this step is used within a predicate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean hasPredicates() {

    /**
     * Returns 'true' if this step has any predicates
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean hasParentLocationPath() {

    /**
     * Returns 'true' if this step has a parent location path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean hasParentPattern() {

    /**
     * Returns 'true' if this step has a parent pattern.
     * This method will return 'false' if this step occurs on its own under
     * an element like <xsl:for-each> or <xsl:apply-templates>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void addPredicates(Vector predicates) {

    /**
     * Returns the vector containing all predicates for this step.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public Vector getPredicates() {

    /**
     * Returns the vector containing all predicates for this step.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public int getNodeType() {

    /**
     * Returns the node-type for this step
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void setAxis(int axis) {

    /**
     * Get the axis (defined in Axis class) for this step
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public int getAxis() {

    /**
     * Define the axis (defined in Axis class) for this step
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    public void setParser(Parser parser) {

    /**
     * Set the parser for this element and all child predicates
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private int _nodeType;

    /**
     * Type of the node test.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private boolean _hadPredicates = false;

    /**
     * Some simple predicates can be handled by this class (and not by the
     * Predicate class) and will be removed from the above vector as they are
     * handled. We use this boolean to remember if we did have any predicates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private Vector _predicates;

    /**
     * A vector of predicates (filters) defined on this step - may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
    private int _axis;

    /**
     * This step's axis as defined in class Axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Step.java
final class Step extends RelativeLocationPath {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
