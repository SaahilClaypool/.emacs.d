_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public Arg(QName qname, XObject val, boolean isFromWithParam)

  /**
   * Construct a parameter argument.
   *
   * @param qname Name of the argument, expressed as a QName object.
   * @param val Value of the argument, expressed as an XObject
   * @param isFromWithParam True if this is a parameter variable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  @Override

  /**
   * Equality function specialized for the variable name.  If the argument
   * is not a qname, it will deligate to the super class.
   *
   * @param   obj   the reference object with which to compare.
   * @return  <code>true</code> if this object is the same as the obj
   *          argument; <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public Arg(QName qname, XObject val)

  /**
   * Construct a parameter argument which has an XObject value.
   * isVisible defaults to true.
   *
   * @param qname Name of the argument, expressed as a QName object.
   * @param val Value of the argument, expressed as an XObject
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public Arg(QName qname, String expression, boolean isFromWithParam)

  /**
   * Construct a parameter argument that contains an expression.
   *
   * @param qname Name of the argument, expressed as a QName object.
   * @param expression String to be stored as this argument's value expression.
   * @param isFromWithParam True if this is a parameter variable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public Arg()

  /**
   * Construct a dummy parameter argument, with no QName and no
   * value (either expression string or value XObject). isVisible
   * defaults to true.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
   public void setIsVisible(boolean b)

  /**
   * Update visibility status of this variable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
   public boolean isVisible()

  /**
   * Tell if this variable is currently visible.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private boolean m_isVisible;

  /**
   * True if this variable is currently visible.  To be visible,
   * a variable needs to come either from xsl:variable or be
   * a "received" parameter, ie one for which an xsl:param has
   * been encountered.
   * Set at the time the object is constructed and updated as needed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
   public boolean isFromWithParam()

  /**
   * Tell if this variable is a parameter passed with a with-param or as
   * a top-level parameter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private boolean m_isFromWithParam;

  /**
   * True if this variable was added with an xsl:with-param or
   * is added via setParameter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public void setExpression(String expr)

  /**
   * Set the value expression for this argument.
   *
   * @param expr String containing the expression to be stored as this
   * argument's value.
   * @see #getExpression
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public String getExpression()

  /**
   * Get the value expression for this argument.
   *
   * @return String containing the expression previously stored into this
   * argument
   * @see #setExpression
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private String m_expression;

  /** Field m_expression: Stored expression value of this argument.
   * @see #setExpression
   * @see #getExpression
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public void detach()

  /**
   * Have the object release it's resources.
   * Call only when the variable or argument is going out of scope.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public final void setVal(XObject val)

  /**
   * Set the value of this argument.
   *
   * @param val an XObject representing the arguments's value.
   * @see #getVal()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public final XObject getVal()

  /**
   * Get the value for this argument.
   *
   * @return the argument's stored XObject value.
   * @see #setVal(XObject)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private XObject m_val;

  /** Field m_val: Stored XObject value of this argument
   * @see #getVal()
   * @see #setVal()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public final void setQName(QName name)

  /**
   * Set the qualified name for this argument.
   *
   * @param name QName object representing the new Qualified Name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public final QName getQName()

  /**
   * Get the qualified name for this argument.
   *
   * @return QName object containing the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private QName m_qname;

  /** Field m_qname: The name of this argument, expressed as a QName
   * (Qualified Name) object.
   * @see getQName
   * @see setQName
   *  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
public class Arg

/**
 * This class holds an instance of an argument on
 * the stack. The value of the argument can be either an
 * XObject or a String containing an expression.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public Arg(QName qname, XObject val, boolean isFromWithParam)

  /**
   * Construct a parameter argument.
   *
   * @param qname Name of the argument, expressed as a QName object.
   * @param val Value of the argument, expressed as an XObject
   * @param isFromWithParam True if this is a parameter variable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  @Override

  /**
   * Equality function specialized for the variable name.  If the argument
   * is not a qname, it will deligate to the super class.
   *
   * @param   obj   the reference object with which to compare.
   * @return  <code>true</code> if this object is the same as the obj
   *          argument; <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public Arg(QName qname, XObject val)

  /**
   * Construct a parameter argument which has an XObject value.
   * isVisible defaults to true.
   *
   * @param qname Name of the argument, expressed as a QName object.
   * @param val Value of the argument, expressed as an XObject
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public Arg(QName qname, String expression, boolean isFromWithParam)

  /**
   * Construct a parameter argument that contains an expression.
   *
   * @param qname Name of the argument, expressed as a QName object.
   * @param expression String to be stored as this argument's value expression.
   * @param isFromWithParam True if this is a parameter variable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public Arg()

  /**
   * Construct a dummy parameter argument, with no QName and no
   * value (either expression string or value XObject). isVisible
   * defaults to true.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
   public void setIsVisible(boolean b)

  /**
   * Update visibility status of this variable.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
   public boolean isVisible()

  /**
   * Tell if this variable is currently visible.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private boolean m_isVisible;

  /**
   * True if this variable is currently visible.  To be visible,
   * a variable needs to come either from xsl:variable or be
   * a "received" parameter, ie one for which an xsl:param has
   * been encountered.
   * Set at the time the object is constructed and updated as needed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
   public boolean isFromWithParam()

  /**
   * Tell if this variable is a parameter passed with a with-param or as
   * a top-level parameter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private boolean m_isFromWithParam;

  /**
   * True if this variable was added with an xsl:with-param or
   * is added via setParameter.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public void setExpression(String expr)

  /**
   * Set the value expression for this argument.
   *
   * @param expr String containing the expression to be stored as this
   * argument's value.
   * @see #getExpression
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public String getExpression()

  /**
   * Get the value expression for this argument.
   *
   * @return String containing the expression previously stored into this
   * argument
   * @see #setExpression
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private String m_expression;

  /** Field m_expression: Stored expression value of this argument.
   * @see #setExpression
   * @see #getExpression
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public void detach()

  /**
   * Have the object release it's resources.
   * Call only when the variable or argument is going out of scope.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public final void setVal(XObject val)

  /**
   * Set the value of this argument.
   *
   * @param val an XObject representing the arguments's value.
   * @see #getVal()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public final XObject getVal()

  /**
   * Get the value for this argument.
   *
   * @return the argument's stored XObject value.
   * @see #setVal(XObject)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private XObject m_val;

  /** Field m_val: Stored XObject value of this argument
   * @see #getVal()
   * @see #setVal()
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public final void setQName(QName name)

  /**
   * Set the qualified name for this argument.
   *
   * @param name QName object representing the new Qualified Name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  public final QName getQName()

  /**
   * Get the qualified name for this argument.
   *
   * @return QName object containing the qualified name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
  private QName m_qname;

  /** Field m_qname: The name of this argument, expressed as a QName
   * (Qualified Name) object.
   * @see getQName
   * @see setQName
   *  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/Arg.java
public class Arg

/**
 * This class holds an instance of an argument on
 * the stack. The value of the argument can be either an
 * XObject or a String containing an expression.
 * @xsl.usage internal
 */
