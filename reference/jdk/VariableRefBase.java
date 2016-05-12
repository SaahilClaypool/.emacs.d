_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    @Override

    /**
     * Returns a string representation of this variable reference on the
     * format 'variable-ref(<var-name>)'.
     * @return Variable reference description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    @Override

    /**
     * Two variable references are deemed equal if they refer to the
     * same variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    public void addParentDependency() {

    /**
     * If this variable reference is in a top-level element like
     * another variable, param or key, add a dependency between
     * that top-level element and the referenced variable. For
     * example,
     *
     *   <xsl:variable name="x" .../>
     *   <xsl:variable name="y" select="$x + 1"/>
     *
     * and assuming this class represents "$x", add a reference
     * between variable y and variable x.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    public VariableBase getVariable() {

    /**
     * Returns a reference to the associated variable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    protected Closure _closure = null;

    /**
     * A reference to the enclosing expression/instruction for which a
     * closure is needed (Predicate, Number or Sort).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    protected VariableBase _variable;

    /**
     * A reference to the associated variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
class VariableRefBase extends Expression {

/**
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    @Override

    /**
     * Returns a string representation of this variable reference on the
     * format 'variable-ref(<var-name>)'.
     * @return Variable reference description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    @Override

    /**
     * Two variable references are deemed equal if they refer to the
     * same variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    public void addParentDependency() {

    /**
     * If this variable reference is in a top-level element like
     * another variable, param or key, add a dependency between
     * that top-level element and the referenced variable. For
     * example,
     *
     *   <xsl:variable name="x" .../>
     *   <xsl:variable name="y" select="$x + 1"/>
     *
     * and assuming this class represents "$x", add a reference
     * between variable y and variable x.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    public VariableBase getVariable() {

    /**
     * Returns a reference to the associated variable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    protected Closure _closure = null;

    /**
     * A reference to the enclosing expression/instruction for which a
     * closure is needed (Predicate, Number or Sort).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
    protected VariableBase _variable;

    /**
     * A reference to the associated variable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/VariableRefBase.java
class VariableRefBase extends Expression {

/**
 * @author Morten Jorgensen
 * @author Santiago Pericas-Geertsen
 */
