_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type-checks the parameter. The parameter type is determined by the
     * 'select' expression (if present) or is a result tree if the parameter
     * element has a body and no 'select' expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of the <xsl:param> element. This method must read
     * the 'name' (required) and 'select' (optional) attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public void display(int indent) {

    /**
     * Display variable in a full AST dump
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public Instruction setStoreInstruction(Instruction instruction) {

    /**
     * Set the instruction for storing a value from the stack into this
     * variable and returns the old instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public Instruction setLoadInstruction(Instruction instruction) {

    /**
     * Set the instruction for loading the value of this variable onto the
     * JVM stack and returns the old instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public String toString() {

    /**
     * Display variable as single string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    private boolean _isInSimpleNamedTemplate = false;

    /**
     * True if this Param is declared in a simple named template.
     * This is used to optimize codegen for parameter passing
     * in named templates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
final class Param extends VariableBase {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author John Howard <JohnH@schemasoft.com>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Type-checks the parameter. The parameter type is determined by the
     * 'select' expression (if present) or is a result tree if the parameter
     * element has a body and no 'select' expression.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of the <xsl:param> element. This method must read
     * the 'name' (required) and 'select' (optional) attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public void display(int indent) {

    /**
     * Display variable in a full AST dump
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public Instruction setStoreInstruction(Instruction instruction) {

    /**
     * Set the instruction for storing a value from the stack into this
     * variable and returns the old instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public Instruction setLoadInstruction(Instruction instruction) {

    /**
     * Set the instruction for loading the value of this variable onto the
     * JVM stack and returns the old instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    public String toString() {

    /**
     * Display variable as single string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
    private boolean _isInSimpleNamedTemplate = false;

    /**
     * True if this Param is declared in a simple named template.
     * This is used to optimize codegen for parameter passing
     * in named templates.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Param.java
final class Param extends VariableBase {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author John Howard <JohnH@schemasoft.com>
 */
