_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Variable.java
    public void initialize(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * This method is part of a little trick that is needed to use local
     * variables inside nested for-each loops. See the initializeVariables()
     * method in the ForEach class for an explanation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Variable.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Runs a type check on either the variable element body or the
     * expression in the 'select' attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Variable.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of the variable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public boolean isPsuedoVarRef()

  /**
   * Tell if this is a psuedo variable reference, declared by Xalan instead
   * of by the user.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public boolean isStableNumber()

  /**
   * Tell if this expression returns a stable number that will not change during
   * iterations within the expression.  This is used to determine if a proximity
   * position predicate can indicate that no more searching has to occur.
   *
   *
   * @return true if the expression represents a stable number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  // J2SE does not support Xalan interpretive

  /**
   * Get the XSLT ElemVariable that this sub-expression references.  In order for
   * this to work, the SourceLocator must be the owning ElemTemplateElement.
   * @return The dereference to the ElemVariable, or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public XObject execute(XPathContext xctxt, boolean destructiveOK) throws javax.xml.transform.TransformerException

  /**
   * Dereference the variable, and return the reference value.  Note that lazy
   * evaluation will occur.  If a variable within scope is not found, a warning
   * will be sent to the error listener, and an empty nodeset will be returned.
   *
   *
   * @param xctxt The runtime execution context.
   *
   * @return The evaluated variable, or an empty nodeset if not found.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public QName getQName()

  /**
   * Get the qualified name of the variable.
   *
   * @return A non-null reference to a qualified name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void setQName(QName qname)

  /**
   * Set the qualified name of the variable.
   *
   * @param qname Must be a non-null reference to a qualified name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * This function is used to fixup variables from QNames to stack frame
   * indexes at stylesheet build time.
   * @param vars List of QNames that correspond to variables.  This list
   * should be searched backwards for the first qualified name that
   * corresponds to the variable reference qname.  The position of the
   * QName in the vector from the start of the vector will be its position
   * in the stack frame (but variables above the globalsTop value will need
   * to be offset to the current stack frame).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public boolean getGlobal()

  /**
   * Set the index for the variable into the stack.  For advanced use only.
   *
   * @return true if this should be a global variable reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void setIsGlobal(boolean isGlobal)

  /**
   * Set whether or not this is a global reference.  For advanced use only.
   *
   * @param isGlobal true if this should be a global variable reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public int getIndex()

  /**
   * Set the index for the variable into the stack.  For advanced use only.
   *
   * @return index a global or local index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void setIndex(int index)

  /**
   * Set the index for the variable into the stack.  For advanced use only. You
   * must know what you are doing to use this.
   *
   * @param index a global or local index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  protected int m_index;

  /**
   * The index of the variable, which is either an absolute index to a
   * global, or, if higher than the globals area, must be adjusted by adding
   * the offset to the current stack frame.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  protected QName m_qname;

  /** The qualified name of the variable.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  private boolean m_fixUpWasCalled = false;

  /** Tell if fixupVariables was called.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
public class Variable extends Expression implements PathComponent

/**
 * The variable reference expression executer.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Variable.java
    public void initialize(ClassGenerator classGen, MethodGenerator methodGen) {

    /**
     * This method is part of a little trick that is needed to use local
     * variables inside nested for-each loops. See the initializeVariables()
     * method in the ForEach class for an explanation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Variable.java
    public Type typeCheck(SymbolTable stable) throws TypeCheckError {

    /**
     * Runs a type check on either the variable element body or the
     * expression in the 'select' attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Variable.java
    public void parseContents(Parser parser) {

    /**
     * Parse the contents of the variable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public boolean isPsuedoVarRef()

  /**
   * Tell if this is a psuedo variable reference, declared by Xalan instead
   * of by the user.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public boolean deepEquals(Expression expr)

  /**
   * @see Expression#deepEquals(Expression)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public boolean isStableNumber()

  /**
   * Tell if this expression returns a stable number that will not change during
   * iterations within the expression.  This is used to determine if a proximity
   * position predicate can indicate that no more searching has to occur.
   *
   *
   * @return true if the expression represents a stable number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  // J2SE does not support Xalan interpretive

  /**
   * Get the XSLT ElemVariable that this sub-expression references.  In order for
   * this to work, the SourceLocator must be the owning ElemTemplateElement.
   * @return The dereference to the ElemVariable, or null if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public XObject execute(XPathContext xctxt, boolean destructiveOK) throws javax.xml.transform.TransformerException

  /**
   * Dereference the variable, and return the reference value.  Note that lazy
   * evaluation will occur.  If a variable within scope is not found, a warning
   * will be sent to the error listener, and an empty nodeset will be returned.
   *
   *
   * @param xctxt The runtime execution context.
   *
   * @return The evaluated variable, or an empty nodeset if not found.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public QName getQName()

  /**
   * Get the qualified name of the variable.
   *
   * @return A non-null reference to a qualified name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void setQName(QName qname)

  /**
   * Set the qualified name of the variable.
   *
   * @param qname Must be a non-null reference to a qualified name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * This function is used to fixup variables from QNames to stack frame
   * indexes at stylesheet build time.
   * @param vars List of QNames that correspond to variables.  This list
   * should be searched backwards for the first qualified name that
   * corresponds to the variable reference qname.  The position of the
   * QName in the vector from the start of the vector will be its position
   * in the stack frame (but variables above the globalsTop value will need
   * to be offset to the current stack frame).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public boolean getGlobal()

  /**
   * Set the index for the variable into the stack.  For advanced use only.
   *
   * @return true if this should be a global variable reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void setIsGlobal(boolean isGlobal)

  /**
   * Set whether or not this is a global reference.  For advanced use only.
   *
   * @param isGlobal true if this should be a global variable reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public int getIndex()

  /**
   * Set the index for the variable into the stack.  For advanced use only.
   *
   * @return index a global or local index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  public void setIndex(int index)

  /**
   * Set the index for the variable into the stack.  For advanced use only. You
   * must know what you are doing to use this.
   *
   * @param index a global or local index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  protected int m_index;

  /**
   * The index of the variable, which is either an absolute index to a
   * global, or, if higher than the globals area, must be adjusted by adding
   * the offset to the current stack frame.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  protected QName m_qname;

  /** The qualified name of the variable.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
  private boolean m_fixUpWasCalled = false;

  /** Tell if fixupVariables was called.
   *  @serial   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/Variable.java
public class Variable extends Expression implements PathComponent

/**
 * The variable reference expression executer.
 */
