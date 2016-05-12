_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Calls to 'function-available' are resolved at compile time since
     * the namespaces declared in the stylsheet are not available at run
     * time. Consequently, arguments to this function must be literals.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    private boolean isInternalNamespace() {

    /**
     * Return true if the namespace uri is null or it is the XSLTC translet uri.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public boolean getResult() {

    /**
     * Reports on whether the function specified in the argument to
     * xslt function 'function-available' was found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    private boolean hasMethods() {

    /**
     * for external java functions only: reports on whether or not
     * the specified method is found in the specifed class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public Object evaluateAtCompileTime() {

    /**
     * Returns an object representing the compile-time evaluation
     * of an expression. We are only using this for function-available
     * and element-available at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Argument of function-available call must be literal, typecheck
     * returns the type of function-available to be boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public FunctionAvailableCall(QName fname, Vector arguments) {

    /**
     * Constructs a FunctionAvailableCall FunctionCall. Takes the
     * function name qname, for example, 'function-available', and
     * a list of arguments where the arguments must be instances of
     * LiteralExpression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
final class FunctionAvailableCall extends FunctionCall {

/**
 * @author G. Todd Miller
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * Calls to 'function-available' are resolved at compile time since
     * the namespaces declared in the stylsheet are not available at run
     * time. Consequently, arguments to this function must be literals.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    private boolean isInternalNamespace() {

    /**
     * Return true if the namespace uri is null or it is the XSLTC translet uri.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public boolean getResult() {

    /**
     * Reports on whether the function specified in the argument to
     * xslt function 'function-available' was found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    private boolean hasMethods() {

    /**
     * for external java functions only: reports on whether or not
     * the specified method is found in the specifed class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public Object evaluateAtCompileTime() {

    /**
     * Returns an object representing the compile-time evaluation
     * of an expression. We are only using this for function-available
     * and element-available at this time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Argument of function-available call must be literal, typecheck
     * returns the type of function-available to be boolean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
    public FunctionAvailableCall(QName fname, Vector arguments) {

    /**
     * Constructs a FunctionAvailableCall FunctionCall. Takes the
     * function name qname, for example, 'function-available', and
     * a list of arguments where the arguments must be instances of
     * LiteralExpression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionAvailableCall.java
final class FunctionAvailableCall extends FunctionCall {

/**
 * @author G. Todd Miller
 * @author Santiago Pericas-Geertsen
 */
