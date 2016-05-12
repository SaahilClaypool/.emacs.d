_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public void translateDesynthesized(ClassGenerator classGen,
                                       MethodGenerator methodGen) {

    /**
     * Compile expression and update true/false-lists
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Compile the expression - leave boolean expression on stack
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type-check this expression, and possibly child expressions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public String toString() {

    /**
     * Returns a string describing this expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public void setParser(Parser parser) {

    /**
     * Override the SyntaxTreeNode.setParser() method to make sure that the
     * parser is set for sub-expressions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public int getOp() {

    /**
     * Returns this logical expression's operator - OR or AND represented
     * by 0 and 1 respectively.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public Object evaluateAtCompileTime() {

    /**
     * Returns an object representing the compile-time evaluation
     * of an expression. We are only using this for function-available
     * and element-available at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public boolean hasLastCall() {

    /**
     * Returns true if this expressions contains a call to last()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public boolean hasPositionCall() {

    /**
     * Returns true if this expressions contains a call to position(). This is
     * needed for context changes in node steps containing multiple predicates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public LogicalExpr(int op, Expression left, Expression right) {

    /**
     * Creates a new logical expression - either OR or AND. Note that the
     * left- and right-hand side expressions can also be logical expressions,
     * thus creating logical trees representing structures such as
     * (a and (b or c) and d), etc...
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
final class LogicalExpr extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public void translateDesynthesized(ClassGenerator classGen,
                                       MethodGenerator methodGen) {

    /**
     * Compile expression and update true/false-lists
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Compile the expression - leave boolean expression on stack
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type-check this expression, and possibly child expressions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public String toString() {

    /**
     * Returns a string describing this expression
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public void setParser(Parser parser) {

    /**
     * Override the SyntaxTreeNode.setParser() method to make sure that the
     * parser is set for sub-expressions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public int getOp() {

    /**
     * Returns this logical expression's operator - OR or AND represented
     * by 0 and 1 respectively.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public Object evaluateAtCompileTime() {

    /**
     * Returns an object representing the compile-time evaluation
     * of an expression. We are only using this for function-available
     * and element-available at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public boolean hasLastCall() {

    /**
     * Returns true if this expressions contains a call to last()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public boolean hasPositionCall() {

    /**
     * Returns true if this expressions contains a call to position(). This is
     * needed for context changes in node steps containing multiple predicates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
    public LogicalExpr(int op, Expression left, Expression right) {

    /**
     * Creates a new logical expression - either OR or AND. Note that the
     * left- and right-hand side expressions can also be logical expressions,
     * thus creating logical trees representing structures such as
     * (a and (b or c) and d), etc...
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/LogicalExpr.java
final class LogicalExpr extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
