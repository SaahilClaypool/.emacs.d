_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * This code generates a sequence of bytecodes that call the
     * addParameter() method in AbstractTranslet. The method call will add
     * (or update) the parameter frame with the new parameter value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void translateValue(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Compile the value of the parameter, which is either in an expression in
     * a 'select' attribute, or in the with-param element's body
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type-check either the select attribute or the element body, depending
     * on which is in use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void parseContents(Parser parser) {

    /**
     * The contents of a <xsl:with-param> elements are either in the element's
     * 'select' attribute (this has precedence) or in the element body.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void setDoParameterOptimization(boolean flag) {

    /**
     * Set the do parameter optimization flag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void setName(QName name) {

    /**
     * Set the name of the variable or paremeter. Escape all special chars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public QName getName() {

    /**
     * Return the name of this WithParam.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public String getEscapedName() {

    /**
     * Returns the escaped qname of the parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void display(int indent) {

    /**
     * Displays the contents of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    private boolean _doParameterOptimization = false;

    /**
     * %OPT% This is set to true when the WithParam is used in a CallTemplate
     * for a simple named template. If this is true, the parameters are
     * passed to the named template through method arguments rather than
     * using the expensive Translet.addParameter() call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    private Expression _select;

    /**
     * Parameter's default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    protected String _escapedName;

    /**
     * The escaped qname of the with-param.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    private QName _name;

    /**
     * Parameter's name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
final class WithParam extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author John Howard <JohnH@schemasoft.com>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void translate(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * This code generates a sequence of bytecodes that call the
     * addParameter() method in AbstractTranslet. The method call will add
     * (or update) the parameter frame with the new parameter value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void translateValue(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Compile the value of the parameter, which is either in an expression in
     * a 'select' attribute, or in the with-param element's body
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type-check either the select attribute or the element body, depending
     * on which is in use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void parseContents(Parser parser) {

    /**
     * The contents of a <xsl:with-param> elements are either in the element's
     * 'select' attribute (this has precedence) or in the element body.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void setDoParameterOptimization(boolean flag) {

    /**
     * Set the do parameter optimization flag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void setName(QName name) {

    /**
     * Set the name of the variable or paremeter. Escape all special chars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public QName getName() {

    /**
     * Return the name of this WithParam.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public String getEscapedName() {

    /**
     * Returns the escaped qname of the parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    public void display(int indent) {

    /**
     * Displays the contents of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    private boolean _doParameterOptimization = false;

    /**
     * %OPT% This is set to true when the WithParam is used in a CallTemplate
     * for a simple named template. If this is true, the parameters are
     * passed to the named template through method arguments rather than
     * using the expensive Translet.addParameter() call.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    private Expression _select;

    /**
     * Parameter's default value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    protected String _escapedName;

    /**
     * The escaped qname of the with-param.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
    private QName _name;

    /**
     * Parameter's name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/WithParam.java
final class WithParam extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author John Howard <JohnH@schemasoft.com>
 */
