_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double constant(String name, double precision)

  /**
   * The math:constant function returns the specified constant to a set precision.
   * The possible constants are:
   * <pre>
   *  PI
   *  E
   *  SQRRT2
   *  LN2
   *  LN10
   *  LOG2E
   *  SQRT1_2
   * </pre>
   * @param name The name of the constant
   * @param precision The precision
   * @return The value of the specified constant to the given precision
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double tan(double num)

  /**
   * The math:tan function returns the tangent of the number passed as an argument.
   *
   * @param num A number
   * @return The tangent value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double sqrt(double num)

  /**
   * The math:sqrt function returns the square root of a number.
   *
   * @param num A number
   * @return The square root of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double sin(double num)

  /**
   * The math:sin function returns the sine of the number.
   *
   * @param num A number
   * @return The sine value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double random()

  /**
   * The math:random function returns a random number from 0 to 1.
   *
   * @return A random double from 0 to 1
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double power(double num1, double num2)

  /**
   * The math:power function returns the value of a base expression taken to a specified power.
   *
   * @param num1 The base
   * @param num2 The power
   * @return The value of the base expression taken to the specified power
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double log(double num)

  /**
   * The math:log function returns the natural logarithm of a number.
   *
   * @param num A number
   * @return The natural logarithm of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double exp(double num)

  /**
   * The math:exp function returns e (the base of natural logarithms) raised to a power.
   *
   * @param num A number
   * @return The value of e raised to the given power
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double cos(double num)

  /**
   * The math:cos function returns cosine of the passed argument.
   *
   * @param num A number
   * @return The cosine value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double atan2(double num1, double num2)

  /**
   * The math:atan2 function returns the angle ( in radians ) from the X axis to a point (y,x).
   *
   * @param num1 The X axis value
   * @param num2 The Y axis value
   * @return The angle (in radians) from the X axis to a point (y,x)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double atan(double num)

  /**
   * The math:atan function returns the arctangent value of a number.
   *
   * @param num A number
   * @return The arctangent value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double asin(double num)

  /**
   * The math:asin function returns the arcsine value of a number.
   *
   * @param num A number
   * @return The arcsine value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double acos(double num)

  /**
   * The math:acos function returns the arccosine value of a number.
   *
   * @param num A number
   * @return The arccosine value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double abs(double num)

  /**
   * The math:abs function returns the absolute value of a number.
   *
   * @param num A number
   * @return The absolute value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
  public static NodeList lowest (NodeList nl)

  /**
   * The math:lowest function returns the nodes in the node set whose value is the minimum value
   * for the node set. The minimum value for the node set is the same as the value as calculated
   * by math:min. A node has this minimum value if the result of converting its string value to
   * a number as if by the number function is equal to the minimum value, where the equality
   * comparison is defined as a numerical comparison using the = operator.
   * <p>
   * If any of the nodes in the node set has a non-numeric value, the math:min function will return
   * NaN. The definition numeric comparisons entails that NaN != NaN. Therefore if any of the nodes
   * in the node set has a non-numeric value, math:lowest will return an empty node set.
   *
   * @param nl The NodeList for the node-set to be evaluated.
   *
   * @return node-set with nodes containing the minimum value found, an empty node-set
   * if any node cannot be converted to a number.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
  public static NodeList highest (NodeList nl)

  /**
   * The math:highest function returns the nodes in the node set whose value is the maximum
   * value for the node set. The maximum value for the node set is the same as the value as
   * calculated by math:max. A node has this maximum value if the result of converting its
   * string value to a number as if by the number function is equal to the maximum value,
   * where the equality comparison is defined as a numerical comparison using the = operator.
   * <p>
   * If any of the nodes in the node set has a non-numeric value, the math:max function will
   * return NaN. The definition numeric comparisons entails that NaN != NaN. Therefore if any
   * of the nodes in the node set has a non-numeric value, math:highest will return an empty
   * node set.
   *
   * @param nl The NodeList for the node-set to be evaluated.
   *
   * @return node-set with nodes containing the maximum value found, an empty node-set
   * if any node cannot be converted to a number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
  public static double min (NodeList nl)

  /**
   * The math:min function returns the minimum value of the nodes passed as the argument.
   * The minimum value is defined as follows. The node set passed as an argument is sorted
   * in ascending order as it would be by xsl:sort with a data type of number. The minimum
   * is the result of converting the string value of the first node in this sorted list to
   * a number using the number function.
   * <p>
   * If the node set is empty, or if the result of converting the string values of any of
   * the nodes to a number is NaN, then NaN is returned.
   *
   * @param nl The NodeList for the node-set to be evaluated.
   *
   * @return the minimum value found, NaN if any node cannot be converted to a number.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
  public static double max (NodeList nl)

  /**
   * The math:max function returns the maximum value of the nodes passed as the argument.
   * The maximum value is defined as follows. The node set passed as an argument is sorted
   * in descending order as it would be by xsl:sort with a data type of number. The maximum
   * is the result of converting the string value of the first node in this sorted list to
   * a number using the number function.
   * <p>
   * If the node set is empty, or if the result of converting the string values of any of the
   * nodes to a number is NaN, then NaN is returned.
   *
   * @param nl The NodeList for the node-set to be evaluated.
   *
   * @return the maximum value found, NaN if any node cannot be converted to a number.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
public class ExsltMath extends ExsltBase

/**
 * This class contains EXSLT math extension functions.
 * It is accessed by specifying a namespace URI as follows:
 * <pre>
 *    xmlns:math="http://exslt.org/math"
 * </pre>
 *
 * The documentation for each function has been copied from the relevant
 * EXSLT Implementer page.
 *
 * @see <a href="http://www.exslt.org/">EXSLT</a>

 * @xsl.usage general
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double constant(String name, double precision)

  /**
   * The math:constant function returns the specified constant to a set precision.
   * The possible constants are:
   * <pre>
   *  PI
   *  E
   *  SQRRT2
   *  LN2
   *  LN10
   *  LOG2E
   *  SQRT1_2
   * </pre>
   * @param name The name of the constant
   * @param precision The precision
   * @return The value of the specified constant to the given precision
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double tan(double num)

  /**
   * The math:tan function returns the tangent of the number passed as an argument.
   *
   * @param num A number
   * @return The tangent value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double sqrt(double num)

  /**
   * The math:sqrt function returns the square root of a number.
   *
   * @param num A number
   * @return The square root of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double sin(double num)

  /**
   * The math:sin function returns the sine of the number.
   *
   * @param num A number
   * @return The sine value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double random()

  /**
   * The math:random function returns a random number from 0 to 1.
   *
   * @return A random double from 0 to 1
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double power(double num1, double num2)

  /**
   * The math:power function returns the value of a base expression taken to a specified power.
   *
   * @param num1 The base
   * @param num2 The power
   * @return The value of the base expression taken to the specified power
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double log(double num)

  /**
   * The math:log function returns the natural logarithm of a number.
   *
   * @param num A number
   * @return The natural logarithm of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double exp(double num)

  /**
   * The math:exp function returns e (the base of natural logarithms) raised to a power.
   *
   * @param num A number
   * @return The value of e raised to the given power
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double cos(double num)

  /**
   * The math:cos function returns cosine of the passed argument.
   *
   * @param num A number
   * @return The cosine value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double atan2(double num1, double num2)

  /**
   * The math:atan2 function returns the angle ( in radians ) from the X axis to a point (y,x).
   *
   * @param num1 The X axis value
   * @param num2 The Y axis value
   * @return The angle (in radians) from the X axis to a point (y,x)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double atan(double num)

  /**
   * The math:atan function returns the arctangent value of a number.
   *
   * @param num A number
   * @return The arctangent value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double asin(double num)

  /**
   * The math:asin function returns the arcsine value of a number.
   *
   * @param num A number
   * @return The arcsine value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double acos(double num)

  /**
   * The math:acos function returns the arccosine value of a number.
   *
   * @param num A number
   * @return The arccosine value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
   public static double abs(double num)

  /**
   * The math:abs function returns the absolute value of a number.
   *
   * @param num A number
   * @return The absolute value of the number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
  public static NodeList lowest (NodeList nl)

  /**
   * The math:lowest function returns the nodes in the node set whose value is the minimum value
   * for the node set. The minimum value for the node set is the same as the value as calculated
   * by math:min. A node has this minimum value if the result of converting its string value to
   * a number as if by the number function is equal to the minimum value, where the equality
   * comparison is defined as a numerical comparison using the = operator.
   * <p>
   * If any of the nodes in the node set has a non-numeric value, the math:min function will return
   * NaN. The definition numeric comparisons entails that NaN != NaN. Therefore if any of the nodes
   * in the node set has a non-numeric value, math:lowest will return an empty node set.
   *
   * @param nl The NodeList for the node-set to be evaluated.
   *
   * @return node-set with nodes containing the minimum value found, an empty node-set
   * if any node cannot be converted to a number.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
  public static NodeList highest (NodeList nl)

  /**
   * The math:highest function returns the nodes in the node set whose value is the maximum
   * value for the node set. The maximum value for the node set is the same as the value as
   * calculated by math:max. A node has this maximum value if the result of converting its
   * string value to a number as if by the number function is equal to the maximum value,
   * where the equality comparison is defined as a numerical comparison using the = operator.
   * <p>
   * If any of the nodes in the node set has a non-numeric value, the math:max function will
   * return NaN. The definition numeric comparisons entails that NaN != NaN. Therefore if any
   * of the nodes in the node set has a non-numeric value, math:highest will return an empty
   * node set.
   *
   * @param nl The NodeList for the node-set to be evaluated.
   *
   * @return node-set with nodes containing the maximum value found, an empty node-set
   * if any node cannot be converted to a number.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
  public static double min (NodeList nl)

  /**
   * The math:min function returns the minimum value of the nodes passed as the argument.
   * The minimum value is defined as follows. The node set passed as an argument is sorted
   * in ascending order as it would be by xsl:sort with a data type of number. The minimum
   * is the result of converting the string value of the first node in this sorted list to
   * a number using the number function.
   * <p>
   * If the node set is empty, or if the result of converting the string values of any of
   * the nodes to a number is NaN, then NaN is returned.
   *
   * @param nl The NodeList for the node-set to be evaluated.
   *
   * @return the minimum value found, NaN if any node cannot be converted to a number.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
  public static double max (NodeList nl)

  /**
   * The math:max function returns the maximum value of the nodes passed as the argument.
   * The maximum value is defined as follows. The node set passed as an argument is sorted
   * in descending order as it would be by xsl:sort with a data type of number. The maximum
   * is the result of converting the string value of the first node in this sorted list to
   * a number using the number function.
   * <p>
   * If the node set is empty, or if the result of converting the string values of any of the
   * nodes to a number is NaN, then NaN is returned.
   *
   * @param nl The NodeList for the node-set to be evaluated.
   *
   * @return the maximum value found, NaN if any node cannot be converted to a number.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltMath.java
public class ExsltMath extends ExsltBase

/**
 * This class contains EXSLT math extension functions.
 * It is accessed by specifying a namespace URI as follows:
 * <pre>
 *    xmlns:math="http://exslt.org/math"
 * </pre>
 *
 * The documentation for each function has been copied from the relevant
 * EXSLT Implementer page.
 *
 * @see <a href="http://www.exslt.org/">EXSLT</a>

 * @xsl.usage general
 */
