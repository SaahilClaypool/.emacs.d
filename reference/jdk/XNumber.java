_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public boolean equals(XObject obj2)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return true if the two objects are equal
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public Object object()

  /**
   * Return a java object that's closest to the representation
   * that should be handed to an extension.
   *
   * @return The value of this XNumber as a Double object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  static private String zeros(int n)

  /**
   * Return a string of '0' of the given length
   *
   *
   * @param n Length of the string to be returned
   *
   * @return a string of '0' with the given length
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return "NaN" if the number is NaN, Infinity or -Infinity if
   * the number is infinite or the string value of the number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
//  private static final int PRECISION = 16;

//  /**
//   * Cast result object to a string.
//   *
//   * @return "NaN" if the number is NaN, Infinity or -Infinity if
//   * the number is infinite or the string value of the number.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public boolean bool()

  /**
   * Cast result object to a boolean.
   *
   * @return false if the value is NaN or equal to 0.0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public double num(XPathContext xctxt)

  /**
   * Evaluate expression to a number.
   *
   * @return 0.0
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public double num()

  /**
   * Cast result object to a number.
   *
   * @return the value of the XNumber object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public String getTypeString()

  /**
   * Given a request type, return the equivalent string.
   * For diagnostic purposes.
   *
   * @return type string "#NUMBER"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public int getType()

  /**
   * Tell that this is a CLASS_NUMBER.
   *
   * @return node type CLASS_NUMBER
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public XNumber(Number num)

  /**
   * Construct a XNodeSet object.
   *
   * @param num Value of the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public XNumber(double d)

  /**
   * Construct a XNodeSet object.
   *
   * @param d Value of the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  double m_val;

  /** Value of the XNumber object.
   *  @serial         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
public class XNumber extends XObject

/**
 * This class represents an XPath number, and is capable of
 * converting the number to other types, such as a string.
 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public boolean equals(XObject obj2)

  /**
   * Tell if two objects are functionally equal.
   *
   * @param obj2 Object to compare this to
   *
   * @return true if the two objects are equal
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public Object object()

  /**
   * Return a java object that's closest to the representation
   * that should be handed to an extension.
   *
   * @return The value of this XNumber as a Double object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  static private String zeros(int n)

  /**
   * Return a string of '0' of the given length
   *
   *
   * @param n Length of the string to be returned
   *
   * @return a string of '0' with the given length
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return "NaN" if the number is NaN, Infinity or -Infinity if
   * the number is infinite or the string value of the number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
//  private static final int PRECISION = 16;

//  /**
//   * Cast result object to a string.
//   *
//   * @return "NaN" if the number is NaN, Infinity or -Infinity if
//   * the number is infinite or the string value of the number.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public boolean bool()

  /**
   * Cast result object to a boolean.
   *
   * @return false if the value is NaN or equal to 0.0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public double num(XPathContext xctxt)

  /**
   * Evaluate expression to a number.
   *
   * @return 0.0
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public double num()

  /**
   * Cast result object to a number.
   *
   * @return the value of the XNumber object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public String getTypeString()

  /**
   * Given a request type, return the equivalent string.
   * For diagnostic purposes.
   *
   * @return type string "#NUMBER"
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public int getType()

  /**
   * Tell that this is a CLASS_NUMBER.
   *
   * @return node type CLASS_NUMBER
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public XNumber(Number num)

  /**
   * Construct a XNodeSet object.
   *
   * @param num Value of the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  public XNumber(double d)

  /**
   * Construct a XNodeSet object.
   *
   * @param d Value of the object
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
  double m_val;

  /** Value of the XNumber object.
   *  @serial         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XNumber.java
public class XNumber extends XObject

/**
 * This class represents an XPath number, and is capable of
 * converting the number to other types, such as a string.
 * @xsl.usage general
 */
