_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void translateValue(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Compile the value of the variable, which is either in an expression in
     * a 'select' attribute, or in the variable elements body
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of the <xsl:decimal-format> element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public boolean isLocal() {

    /**
     * Returns the true if the variable is local
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void setName(QName name) {

    /**
     * Set the name of the variable or paremeter. Escape all special chars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public String getEscapedName() {

    /**
     * Returns the escaped qname of the variable or parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public QName getName() {

    /**
     * Returns the name of the variable or parameter as it will occur in the
     * compiled translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public Type getType() {

    /**
     * Returns the type of the variable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void display(int indent) {

    /**
     * Display variable in a full AST dump
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public String toString() {

    /**
     * Display variable as single string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public Expression getExpression() {

    /**
     * Returns the expression from this variable's select attribute (if any)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public Instruction storeInstruction() {

    /**
     * Returns an instruction for storing a value from the JVM stack
     * into this variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public Instruction loadInstruction() {

    /**
     * Returns an instruction for loading the value of this variable onto
     * the JVM stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void unmapRegister(MethodGenerator methodGen) {

    /**
     * Remove the mapping of this variable to a register.
     * Called when we leave the AST scope of the variable's declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void mapRegister(MethodGenerator methodGen) {

    /**
     * Map this variable to a register
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void copyReferences(VariableBase var) {

    /**
     * When a variable is overriden by another, e.g. via xsl:import,
     * its references need to be copied or otherwise it may be
     * compiled away as dead code. This method can be used for that
     * purpose.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void addReference(VariableRefBase vref) {

    /**
     * Add a reference to this variable. Called by VariableRef when an
     * expression contains a reference to this variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void disable() {

    /**
     * Disable this variable/parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
class VariableBase extends TopLevelElement {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author John Howard <JohnH@schemasoft.com>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void translateValue(ClassGenerator classGen,
                               MethodGenerator methodGen) {

    /**
     * Compile the value of the variable, which is either in an expression in
     * a 'select' attribute, or in the variable elements body
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of the <xsl:decimal-format> element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public boolean isLocal() {

    /**
     * Returns the true if the variable is local
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void setName(QName name) {

    /**
     * Set the name of the variable or paremeter. Escape all special chars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public String getEscapedName() {

    /**
     * Returns the escaped qname of the variable or parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public QName getName() {

    /**
     * Returns the name of the variable or parameter as it will occur in the
     * compiled translet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public Type getType() {

    /**
     * Returns the type of the variable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void display(int indent) {

    /**
     * Display variable in a full AST dump
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public String toString() {

    /**
     * Display variable as single string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public Expression getExpression() {

    /**
     * Returns the expression from this variable's select attribute (if any)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public Instruction storeInstruction() {

    /**
     * Returns an instruction for storing a value from the JVM stack
     * into this variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public Instruction loadInstruction() {

    /**
     * Returns an instruction for loading the value of this variable onto
     * the JVM stack.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void unmapRegister(MethodGenerator methodGen) {

    /**
     * Remove the mapping of this variable to a register.
     * Called when we leave the AST scope of the variable's declaration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void mapRegister(MethodGenerator methodGen) {

    /**
     * Map this variable to a register
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void copyReferences(VariableBase var) {

    /**
     * When a variable is overriden by another, e.g. via xsl:import,
     * its references need to be copied or otherwise it may be
     * compiled away as dead code. This method can be used for that
     * purpose.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void addReference(VariableRefBase vref) {

    /**
     * Add a reference to this variable. Called by VariableRef when an
     * expression contains a reference to this variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
    public void disable() {

    /**
     * Disable this variable/parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableBase.java
class VariableBase extends TopLevelElement {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 * @author John Howard <JohnH@schemasoft.com>
 */
