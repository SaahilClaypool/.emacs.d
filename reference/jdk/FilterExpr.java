_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    public void translatePredicates(ClassGenerator classGen,
                                    MethodGenerator methodGen,
                                    int predicateIndex) {

    /**
     * Translate a sequence of predicates. Each predicate is translated
     * by constructing an instance of <code>CurrentNodeListIterator</code>
     * which is initialized from another iterator (recursive call), a
     * filter and a closure (call to translate on the predicate) and "this".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate a filter expression by pushing the appropriate iterator
     * onto the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check a FilterParentPath. If the filter is not a node-set add a
     * cast to node-set only if it is of reference type. This type coercion
     * is needed for expressions like $x where $x is a parameter reference.
     * All optimizations are turned off before type checking underlying
     * predicates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    private final Vector _predicates;

    /**
     * Array of predicates in '(e)[p1]...[pn]'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    private Expression   _primary;

    /**
     * Primary expression of this filter. I.e., 'e' in '(e)[p1]...[pn]'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
class FilterExpr extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    public void translatePredicates(ClassGenerator classGen,
                                    MethodGenerator methodGen,
                                    int predicateIndex) {

    /**
     * Translate a sequence of predicates. Each predicate is translated
     * by constructing an instance of <code>CurrentNodeListIterator</code>
     * which is initialized from another iterator (recursive call), a
     * filter and a closure (call to translate on the predicate) and "this".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Translate a filter expression by pushing the appropriate iterator
     * onto the stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check a FilterParentPath. If the filter is not a node-set add a
     * cast to node-set only if it is of reference type. This type coercion
     * is needed for expressions like $x where $x is a parameter reference.
     * All optimizations are turned off before type checking underlying
     * predicates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    private final Vector _predicates;

    /**
     * Array of predicates in '(e)[p1]...[pn]'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
    private Expression   _primary;

    /**
     * Primary expression of this filter. I.e., 'e' in '(e)[p1]...[pn]'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FilterExpr.java
class FilterExpr extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
