_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate a predicate expression. If non of the optimizations apply
     * then this translation pushes two references on the stack: a reference
     * to a newly created filter object and a reference to the predicate's
     * closure. See class <code>Step</code> for further details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void translateFilter(ClassGenerator classGen,
                                MethodGenerator methodGen)

    /**
     * Translate a predicate expression. This translation pushes
     * two references on the stack: a reference to a newly created
     * filter object and a reference to the predicate's closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Expression getCompareValue() {

    /**
     * Returns the value in an expression of the form 'step = value'.
     * A value may be either a literal string or a variable whose
     * type is string. Optimization if off if null is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Step getStep() {

   /**
     * Returns the step in an expression of the form 'step = value'.
     * Null is returned if the expression is not of the right form.
     * Optimization if off if null is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean isNodeValueTest() {

    /**
     * Method to see if we can optimise the predicate by using a specialised
     * iterator for expressions like '/foo/bar[@attr = $var]', which are
     * very common in many stylesheets
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean isBooleanTest() {

    /**
     * Returns true if the predicate is a test for the existance of an
     * element or attribute. All we have to do is to get the first node
     * from the step, check if it is there, and then return true/false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private void compileFilter(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Create a new "Filter" class implementing
     * <code>CurrentNodeListFilter</code>. Allocate registers for local
     * variables and local parameters passed in the closure to test().
     * Notice that local variables need to be "unboxed".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check a predicate expression. If the type of the expression is
     * number convert it to boolean by adding a comparison with position().
     * Note that if the expression is a parameter, we cannot distinguish
     * at compile time if its type is number or not. Hence, expressions of
     * reference type are always converted to booleans.
     *
     * This method may be called twice, before and after calling
     * <code>dontOptimize()</code>. If so, the second time it should honor
     * the new value of <code>_canOptimize</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public int getPosType() {

    /**
     * Returns the node type of the expression owning this predicate. The
     * return value is cached in <code>_ptype</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void addVariable(VariableRefBase variableRef) {

    /**
     * Add new variable to the closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public String getInnerClassName() {

    /**
     * Returns the name of the auxiliary class or null if this predicate
     * is compiled inside the Translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Closure getParentClosure() {

    /**
     * Returns a reference to its parent closure or null if outermost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean inInnerClass() {

    /**
     * Returns true if this closure is compiled in an inner class (i.e.
     * if this is a real closure).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean hasLastCall() {

    /**
     * Returns true if the expression in this predicate contains a call
     * to last().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean hasPositionCall() {

    /**
     * Returns true if the expression in this predicate contains a call
     * to position().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void dontOptimize() {

    /**
     * Turns off all optimizations for this predicate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean isNthDescendant() {

    /**
     * Returns a boolean value indicating if the nth descendant optimization
     * is on. Must be call after type checking!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean isNthPositionFilter() {

    /**
     * Returns a boolean value indicating if the nth position optimization
     * is on. Must be call after type checking!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void setParser(Parser parser) {

    /**
     * Set the parser for this expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Predicate(Expression exp) {

    /**
     * Initializes a predicate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private Step _step = null;

    /**
     * Cached value of method <code>getCompareValue()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private Expression _value = null;

    /**
     * Cached value of method <code>getCompareValue()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private Closure _parentClosure = null;

    /**
     * Reference to parent closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private ArrayList _closureVars = null;

    /**
     * List of variables in closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private String _className = null;

    /**
     * Name of the inner class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    int _ptype = -1;

    /**
     * Cached node type of the expression that owns this predicate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private boolean _nthDescendant = false;

    /**
     * Flag indicatig if the nth position descendant is on. It
     * is set in <code>typeCheck()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private boolean _nthPositionFilter = false;

    /**
     * Flag indicatig if the nth position optimization is on. It
     * is set in <code>typeCheck()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private boolean _canOptimize = true;

    /**
     * This flag indicates if optimizations are turned on. The
     * method <code>dontOptimize()</code> can be called to turn
     * optimizations off.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private Expression _exp = null;

    /**
     * The predicate's expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
final class Predicate extends Expression implements Closure {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate a predicate expression. If non of the optimizations apply
     * then this translation pushes two references on the stack: a reference
     * to a newly created filter object and a reference to the predicate's
     * closure. See class <code>Step</code> for further details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void translateFilter(ClassGenerator classGen,
                                MethodGenerator methodGen)

    /**
     * Translate a predicate expression. This translation pushes
     * two references on the stack: a reference to a newly created
     * filter object and a reference to the predicate's closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Expression getCompareValue() {

    /**
     * Returns the value in an expression of the form 'step = value'.
     * A value may be either a literal string or a variable whose
     * type is string. Optimization if off if null is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Step getStep() {

   /**
     * Returns the step in an expression of the form 'step = value'.
     * Null is returned if the expression is not of the right form.
     * Optimization if off if null is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean isNodeValueTest() {

    /**
     * Method to see if we can optimise the predicate by using a specialised
     * iterator for expressions like '/foo/bar[@attr = $var]', which are
     * very common in many stylesheets
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean isBooleanTest() {

    /**
     * Returns true if the predicate is a test for the existance of an
     * element or attribute. All we have to do is to get the first node
     * from the step, check if it is there, and then return true/false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private void compileFilter(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Create a new "Filter" class implementing
     * <code>CurrentNodeListFilter</code>. Allocate registers for local
     * variables and local parameters passed in the closure to test().
     * Notice that local variables need to be "unboxed".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check a predicate expression. If the type of the expression is
     * number convert it to boolean by adding a comparison with position().
     * Note that if the expression is a parameter, we cannot distinguish
     * at compile time if its type is number or not. Hence, expressions of
     * reference type are always converted to booleans.
     *
     * This method may be called twice, before and after calling
     * <code>dontOptimize()</code>. If so, the second time it should honor
     * the new value of <code>_canOptimize</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public int getPosType() {

    /**
     * Returns the node type of the expression owning this predicate. The
     * return value is cached in <code>_ptype</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void addVariable(VariableRefBase variableRef) {

    /**
     * Add new variable to the closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public String getInnerClassName() {

    /**
     * Returns the name of the auxiliary class or null if this predicate
     * is compiled inside the Translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Closure getParentClosure() {

    /**
     * Returns a reference to its parent closure or null if outermost.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean inInnerClass() {

    /**
     * Returns true if this closure is compiled in an inner class (i.e.
     * if this is a real closure).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean hasLastCall() {

    /**
     * Returns true if the expression in this predicate contains a call
     * to last().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean hasPositionCall() {

    /**
     * Returns true if the expression in this predicate contains a call
     * to position().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void dontOptimize() {

    /**
     * Turns off all optimizations for this predicate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean isNthDescendant() {

    /**
     * Returns a boolean value indicating if the nth descendant optimization
     * is on. Must be call after type checking!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public boolean isNthPositionFilter() {

    /**
     * Returns a boolean value indicating if the nth position optimization
     * is on. Must be call after type checking!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public void setParser(Parser parser) {

    /**
     * Set the parser for this expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    public Predicate(Expression exp) {

    /**
     * Initializes a predicate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private Step _step = null;

    /**
     * Cached value of method <code>getCompareValue()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private Expression _value = null;

    /**
     * Cached value of method <code>getCompareValue()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private Closure _parentClosure = null;

    /**
     * Reference to parent closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private ArrayList _closureVars = null;

    /**
     * List of variables in closure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private String _className = null;

    /**
     * Name of the inner class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    int _ptype = -1;

    /**
     * Cached node type of the expression that owns this predicate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private boolean _nthDescendant = false;

    /**
     * Flag indicatig if the nth position descendant is on. It
     * is set in <code>typeCheck()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private boolean _nthPositionFilter = false;

    /**
     * Flag indicatig if the nth position optimization is on. It
     * is set in <code>typeCheck()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private boolean _canOptimize = true;

    /**
     * This flag indicates if optimizations are turned on. The
     * method <code>dontOptimize()</code> can be called to turn
     * optimizations off.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
    private Expression _exp = null;

    /**
     * The predicate's expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Predicate.java
final class Predicate extends Expression implements Closure {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Predicate.java
    static <T> Predicate<T> isEqual(Object targetRef) {

    /**
     * Returns a predicate that tests if two arguments are equal according
     * to {@link Objects#equals(Object, Object)}.
     *
     * @param <T> the type of arguments to the predicate
     * @param targetRef the object reference with which to compare for equality,
     *               which may be {@code null}
     * @return a predicate that tests if two arguments are equal according
     * to {@link Objects#equals(Object, Object)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Predicate.java
    default Predicate<T> or(Predicate<? super T> other) {

    /**
     * Returns a composed predicate that represents a short-circuiting logical
     * OR of this predicate and another.  When evaluating the composed
     * predicate, if this predicate is {@code true}, then the {@code other}
     * predicate is not evaluated.
     *
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the
     * {@code other} predicate will not be evaluated.
     *
     * @param other a predicate that will be logically-ORed with this
     *              predicate
     * @return a composed predicate that represents the short-circuiting logical
     * OR of this predicate and the {@code other} predicate
     * @throws NullPointerException if other is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Predicate.java
    default Predicate<T> negate() {

    /**
     * Returns a predicate that represents the logical negation of this
     * predicate.
     *
     * @return a predicate that represents the logical negation of this
     * predicate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Predicate.java
    default Predicate<T> and(Predicate<? super T> other) {

    /**
     * Returns a composed predicate that represents a short-circuiting logical
     * AND of this predicate and another.  When evaluating the composed
     * predicate, if this predicate is {@code false}, then the {@code other}
     * predicate is not evaluated.
     *
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the
     * {@code other} predicate will not be evaluated.
     *
     * @param other a predicate that will be logically-ANDed with this
     *              predicate
     * @return a composed predicate that represents the short-circuiting logical
     * AND of this predicate and the {@code other} predicate
     * @throws NullPointerException if other is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Predicate.java
    boolean test(T t);

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param t the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/function/Predicate.java
@FunctionalInterface

/**
 * Represents a predicate (boolean-valued function) of one argument.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(Object)}.
 *
 * @param <T> the type of the input to the predicate
 *
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/Predicate.java
    public boolean evaluate(Object value, String columnName) throws SQLException;

    /**
     * This method is called by the <code>FilteredRowSet</code> object
     * to check whether the value lies between the filtering criteria set
     * using the setFilter method.
     * <P>
     * The <code>FilteredRowSet</code> object will use this method internally
     * while inserting new rows to a <code>FilteredRowSet</code> instance.
     *
     * @param value An <code>Object</code> value which needs to be checked,
     * whether it can be part of this <code>FilterRowSet</code>.
     *
     * @param columnName a <code>String</code> object that must match the
     *        SQL name of a column in this <code>RowSet</code>, ignoring case. This must
     *        have been passed to <code>Predicate</code> as one of the columns for filtering
     *        while initializing a <code>Predicate</code>
     *
     * @return <code>true</code> if value lies within the filter; <code>false</code> otherwise
     *
     * @throws SQLException if the column is not part of filtering criteria
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/Predicate.java
    public boolean evaluate(Object value, int column) throws SQLException;

    /**
     * This method is called by a <code>FilteredRowSet</code> object
     * to check whether the value lies between the filtering criterion (or criteria
     * if multiple constraints exist) set using the <code>setFilter()</code> method.
     * <P>
     * The <code>FilteredRowSet</code> object will use this method internally
     * while inserting new rows to a <code>FilteredRowSet</code> instance.
     *
     * @param value An <code>Object</code> value which needs to be checked,
     *        whether it can be part of this <code>FilterRowSet</code> object.
     * @param column a <code>int</code> object that must match the
     *        SQL index of a column in this <code>RowSet</code> object. This must
     *        have been passed to <code>Predicate</code> as one of the columns
     *        for filtering while initializing a <code>Predicate</code>
     * @return <code>true</code> if row value lies within the filter;
     *     <code>false</code> otherwise
     * @throws SQLException if the column is not part of filtering criteria
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/Predicate.java
    public boolean evaluate(RowSet rs);

    /**
     * This method is typically called a <code>FilteredRowSet</code> object
     * internal methods (not public) that control the <code>RowSet</code> object's
     * cursor moving  from row to the next. In addition, if this internal method
     * moves the cursor onto a row that has been deleted, the internal method will
     * continue to ove the cursor until a valid row is found.
     * @param rs The {@code RowSet} to be evaluated
     * @return <code>true</code> if there are more rows in the filter;
     *     <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/Predicate.java
 // <h3>3.0 FilteredRowSet Internals</h3>

/**
 * The standard interface that provides the framework for all
 * <code>FilteredRowSet</code> objects to describe their filters.
 *
 * <h3>1.0 Background</h3>
 * The <code>Predicate</code> interface is a standard interface that
 * applications can implement to define the filter they wish to apply to a
 * a <code>FilteredRowSet</code> object. A <code>FilteredRowSet</code>
 * object consumes implementations of this interface and enforces the
 * constraints defined in the implementation of the method <code>evaluate</code>.
 * A <code>FilteredRowSet</code> object enforces the filter constraints in a
 * bi-directional manner: It outputs only rows that are within
 * the constraints of the filter; and conversely, it inserts, modifies, or updates
 * only rows that are within the constraints of the filter.
 *
 * <h3>2.0 Implementation Guidelines</h3>
 * In order to supply a predicate for the <code>FilteredRowSet</code>.
 * this interface must be implemented.  At this time, the JDBC RowSet
 * Implementations (JSR-114) does not specify any standard filters definitions.
 * By specifying a standard means and mechanism for a range of filters to be
 * defined and deployed with both the reference and vendor implementations
 * of the <code>FilteredRowSet</code> interface, this allows for a flexible
 * and application motivated implementations of <code>Predicate</code> to emerge.
 * <p>
 * A sample implementation would look something like this:
 * <pre>{@code
 *    public class Range implements Predicate {
 *
 *       private int[] lo;
 *       private int[] hi;
 *       private int[] idx;
 *
 *       public Range(int[] lo, int[] hi, int[] idx) {
 *          this.lo = lo;
 *          this.hi = hi;
 *          this.idx = idx;
 *       }
 *
 *      public boolean evaluate(RowSet rs) {
 *
 *          // Check the present row determine if it lies
 *          // within the filtering criteria.
 *
 *          for (int i = 0; i < idx.length; i++) {
 *             int value;
 *             try {
 *                 value = (Integer) rs.getObject(idx[i]);
 *             } catch (SQLException ex) {
 *                 Logger.getLogger(Range.class.getName()).log(Level.SEVERE, null, ex);
 *                 return false;
 *             }
 *
 *             if (value < lo[i] && value > hi[i]) {
 *                 // outside of filter constraints
 *                 return false;
 *             }
 *         }
 *         // Within filter constraints
 *        return true;
 *      }
 *   }
 * }</pre>
 * <P>
 * The example above implements a simple range predicate. Note, that
 * implementations should but are not required to provide <code>String</code>
 * and integer index based constructors to provide for JDBC RowSet Implementation
 * applications that use both column identification conventions.
 *
 * @author Jonathan Bruce, Amit Handa
 *
 */
