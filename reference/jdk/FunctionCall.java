_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    private void translateUnallowedExtension(ConstantPoolGen cpg,
                                             InstructionList il) {

    /**
     * Translate code to call the BasisLibrary.unallowed_extensionF(String)
     * method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    protected static String replaceDash(String name)

    /**
     * To support EXSLT extensions, convert names with dash to allowable Java names:
     * e.g., convert abc-xyz to abcXyz.
     * Note: dashes only appear in middle of an EXSLT function or element name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    private String getMethodSignature(Vector argsType) {

    /**
     * Return the signature of the current method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static final String getSignature(Constructor cons) {

    /**
     * Compute the JVM constructor descriptor for the constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static final String getSignature(Method meth) {

    /**
     * Compute the JVM method descriptor for the method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static final String getSignature(Class clazz) {

    /**
     * Compute the JVM signature for the class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    private Vector findConstructors() {

    /**
     * Returns a vector with all constructors named <code>_fname</code>
     * after stripping its namespace or <code>null</code>
     * if no such methods exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    private Vector findMethods() {

    /**
     * Returns a vector with all methods named <code>_fname</code>
     * after stripping its namespace or <code>null</code>
     * if no such methods exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    @Override

    /**
     * Translate a function call. The compiled code will leave the function's
     * return value on the JVM's stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    @Override

    /**
     * Compile the function call and treat as an expression
     * Update true/false-lists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    public Vector typeCheckArgs(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check the actual arguments of this function call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    public Type typeCheckExternal(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check a call to an external (Java) method.
     * The method must be static an public, and a legal type conversion
     * must exist for all its arguments and its return type.
     * Every method of name <code>_fname</code> is inspected
     * as a possible candidate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    public Type typeCheckStandard(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check a call to a standard function. Insert CastExprs when needed.
     * If as a result of the insertion of a CastExpr a type check error is
     * thrown, then catch it and re-throw it with a new "this".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    @Override

    /**
     * Type check a function call. Since different type conversions apply,
     * type checking is different for standard and external (Java) functions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static {

    /**
     * Defines 2 conversion tables:
     * 1. From internal types to Java types and
     * 2. From Java types to internal types.
     * These two tables are used when calling external (Java) functions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static class JavaType {

    /**
     * inner class to used in internal2Java mappings, contains
     * the Java type and the distance between the internal type and
     * the Java type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    Expression _thisArgument = null;

    /**
     * Stores reference to object for non-static Java calls
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
class FunctionCall extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author Todd Miller
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    private void translateUnallowedExtension(ConstantPoolGen cpg,
                                             InstructionList il) {

    /**
     * Translate code to call the BasisLibrary.unallowed_extensionF(String)
     * method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    protected static String replaceDash(String name)

    /**
     * To support EXSLT extensions, convert names with dash to allowable Java names:
     * e.g., convert abc-xyz to abcXyz.
     * Note: dashes only appear in middle of an EXSLT function or element name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    private String getMethodSignature(Vector argsType) {

    /**
     * Return the signature of the current method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static final String getSignature(Constructor cons) {

    /**
     * Compute the JVM constructor descriptor for the constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static final String getSignature(Method meth) {

    /**
     * Compute the JVM method descriptor for the method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static final String getSignature(Class clazz) {

    /**
     * Compute the JVM signature for the class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    private Vector findConstructors() {

    /**
     * Returns a vector with all constructors named <code>_fname</code>
     * after stripping its namespace or <code>null</code>
     * if no such methods exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    private Vector findMethods() {

    /**
     * Returns a vector with all methods named <code>_fname</code>
     * after stripping its namespace or <code>null</code>
     * if no such methods exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    @Override

    /**
     * Translate a function call. The compiled code will leave the function's
     * return value on the JVM's stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    @Override

    /**
     * Compile the function call and treat as an expression
     * Update true/false-lists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    public Vector typeCheckArgs(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check the actual arguments of this function call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    public Type typeCheckExternal(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check a call to an external (Java) method.
     * The method must be static an public, and a legal type conversion
     * must exist for all its arguments and its return type.
     * Every method of name <code>_fname</code> is inspected
     * as a possible candidate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    public Type typeCheckStandard(SymbolTable stable) throws TypeCheckError {

    /**
     * Type check a call to a standard function. Insert CastExprs when needed.
     * If as a result of the insertion of a CastExpr a type check error is
     * thrown, then catch it and re-throw it with a new "this".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    @Override

    /**
     * Type check a function call. Since different type conversions apply,
     * type checking is different for standard and external (Java) functions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static {

    /**
     * Defines 2 conversion tables:
     * 1. From internal types to Java types and
     * 2. From Java types to internal types.
     * These two tables are used when calling external (Java) functions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    static class JavaType {

    /**
     * inner class to used in internal2Java mappings, contains
     * the Java type and the distance between the internal type and
     * the Java type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
    Expression _thisArgument = null;

    /**
     * Stores reference to object for non-static Java calls
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/FunctionCall.java
class FunctionCall extends Expression {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author Todd Miller
 */
