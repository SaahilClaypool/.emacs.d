_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    public void translate(ClassGenerator classGen,
                          MethodGenerator methodGen) {

    /**
     * This method is called when the constructor is compiled in
     * Stylesheet.compileConstructor() and not as the syntax tree is traversed.
     * <p>This method will generate byte code that produces an iterator
     * for the nodes in the node set for the key or id function call.
     * @param classGen The Java class generator
     * @param methodGen The method generator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

   /**
     * Type check the parameters for the id() or key() function.
     * The index name (for key() call only) must be a string or convertable
     * to a string, and the lookup-value must be a string or a node-set.
     * @param stable The parser's symbol table
     * @throws TypeCheckError When the parameters have illegal type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    public void addParentDependency() {

     /**
     * If this call to key() is in a top-level element like  another variable
     * or param, add a dependency between that top-level element and the
     * referenced key. For example,
     *
     *   <xsl:key name="x" .../>
     *   <xsl:variable name="y" select="key('x', 1)"/>
     *
     * and assuming this class represents "key('x', 1)", add a reference
     * between variable y and key x. Note that if 'x' is unknown statically
     * in key('x', 1), there's nothing we can do at this point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    public KeyCall(QName fname, Vector arguments) {

    /**
     * Get the parameters passed to function:
     *   key(String name, String value)
     *   key(String name, NodeSet value)
     * The 'arguments' vector should contain two parameters for key() calls,
     * one holding the key name and one holding the value(s) to look up. The
     * vector has only one parameter for id() calls (the key name is always
     * "##id" for id() calls).
     *
     * @param fname The function name (should be 'key' or 'id')
     * @param arguments A vector containing the arguments the the function
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    private QName _resolvedQName = null;

    /**
     * Expanded qname when name is literal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    private Type _valueType; // The value's data type

    /**
     * The value's data type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    private Expression _value;

    /**
     * The value to look up in the key/index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    private Expression _name;

    /**
     * The name of the key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
final class KeyCall extends FunctionCall {

/**
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    public void translate(ClassGenerator classGen,
                          MethodGenerator methodGen) {

    /**
     * This method is called when the constructor is compiled in
     * Stylesheet.compileConstructor() and not as the syntax tree is traversed.
     * <p>This method will generate byte code that produces an iterator
     * for the nodes in the node set for the key or id function call.
     * @param classGen The Java class generator
     * @param methodGen The method generator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

   /**
     * Type check the parameters for the id() or key() function.
     * The index name (for key() call only) must be a string or convertable
     * to a string, and the lookup-value must be a string or a node-set.
     * @param stable The parser's symbol table
     * @throws TypeCheckError When the parameters have illegal type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    public void addParentDependency() {

     /**
     * If this call to key() is in a top-level element like  another variable
     * or param, add a dependency between that top-level element and the
     * referenced key. For example,
     *
     *   <xsl:key name="x" .../>
     *   <xsl:variable name="y" select="key('x', 1)"/>
     *
     * and assuming this class represents "key('x', 1)", add a reference
     * between variable y and key x. Note that if 'x' is unknown statically
     * in key('x', 1), there's nothing we can do at this point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    public KeyCall(QName fname, Vector arguments) {

    /**
     * Get the parameters passed to function:
     *   key(String name, String value)
     *   key(String name, NodeSet value)
     * The 'arguments' vector should contain two parameters for key() calls,
     * one holding the key name and one holding the value(s) to look up. The
     * vector has only one parameter for id() calls (the key name is always
     * "##id" for id() calls).
     *
     * @param fname The function name (should be 'key' or 'id')
     * @param arguments A vector containing the arguments the the function
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    private QName _resolvedQName = null;

    /**
     * Expanded qname when name is literal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    private Type _valueType; // The value's data type

    /**
     * The value's data type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    private Expression _value;

    /**
     * The value to look up in the key/index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
    private Expression _name;

    /**
     * The name of the key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/KeyCall.java
final class KeyCall extends FunctionCall {

/**
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
