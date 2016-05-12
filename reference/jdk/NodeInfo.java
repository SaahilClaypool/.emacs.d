_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static int columnNumber(NodeList nodeList)

  /**
   * <code>columnNumber</code> returns the column number of the node
   * passed as argument. If a node set is passed as argument, the line
   * number of the first node in the set is returned.
   *
   * NOTE: Xalan does not normally record location information for each node.
   * To obtain it, you must set the custom TrAX attribute
   * "http://xml.apache.org/xalan/features/source_location"
   * true in the TransformerFactory before generating the Transformer and executing
   * the stylesheet. Storage cost per node will be noticably increased in this mode.
   *
   * @param nodeList a <code>NodeList</code> value
   * @return an <code>int</code> value. This may be -1 to indicate that the
   * column number is not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static int columnNumber(ExpressionContext context)

  /**
   * <code>columnNumber</code> returns the column number of the
   * current context node.
   *
   * NOTE: Xalan does not normally record location information for each node.
   * To obtain it, you must set the custom TrAX attribute
   * "http://xml.apache.org/xalan/features/source_location"
   * true in the TransformerFactory before generating the Transformer and executing
   * the stylesheet. Storage cost per node will be noticably increased in this mode.
   *
   * @param context an <code>ExpressionContext</code> value
   * @return an <code>int</code> value. This may be -1 to indicate that the
   * column number is not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static int lineNumber(NodeList nodeList)

  /**
   * <code>lineNumber</code> returns the line number of the node
   * passed as argument. If a node set is passed as argument, the line
   * number of the first node in the set is returned.
   *
   * NOTE: Xalan does not normally record location information for each node.
   * To obtain it, you must set the custom TrAX attribute
   * "http://xml.apache.org/xalan/features/source_location"
   * true in the TransformerFactory before generating the Transformer and executing
   * the stylesheet. Storage cost per node will be noticably increased in this mode.
   *
   * @param nodeList a <code>NodeList</code> value
   * @return an <code>int</code> value. This may be -1 to indicate that the
   * line number is not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static int lineNumber(ExpressionContext context)

  /**
   * <code>lineNumber</code> returns the line number of the current
   * context node.
   *
   * NOTE: Xalan does not normally record location information for each node.
   * To obtain it, you must set the custom TrAX attribute
   * "http://xml.apache.org/xalan/features/source_location"
   * true in the TransformerFactory before generating the Transformer and executing
   * the stylesheet. Storage cost per node will be noticably increased in this mode.
   *
   * @param context an <code>ExpressionContext</code> value
   * @return an <code>int</code> value. This may be -1 to indicate that the
   * line number is not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static String publicId(NodeList nodeList)

  /**
   * <code>publicId</code> returns the public identifier of the node passed as
   * argument. If a node set is passed as argument, the public identifier of
   * the first node in the set is returned.
   *
   * Xalan does not currently record this value, and will return null.
   *
   * @param nodeList a <code>NodeList</code> value
   * @return a <code>String</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static String publicId(ExpressionContext context)

  /**
   * <code>publicId</code> returns the public identifier of the current
   * context node.
   *
   * Xalan does not currently record this value, and will return null.
   *
   * @param context an <code>ExpressionContext</code> value
   * @return a <code>String</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static String systemId(NodeList nodeList)

  /**
   * <code>systemId</code> returns the system id of the node passed as
   * argument. If a node set is passed as argument, the system id of
   * the first node in the set is returned.
   *
   * @param nodeList a <code>NodeList</code> value
   * @return a <code>String</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static String systemId(ExpressionContext context)

  /**
   * <code>systemId</code> returns the system id of the current
   * context node.
   *
   * @param context an <code>ExpressionContext</code> value
   * @return a <code>String</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
public class NodeInfo

/**
 * <code>NodeInfo</code> defines a set of XSLT extension functions to be
 * used from stylesheets.
 *
 * @author <a href="mailto:ovidiu@cup.hp.com">Ovidiu Predescu</a>
 * @since May 24, 2001
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static int columnNumber(NodeList nodeList)

  /**
   * <code>columnNumber</code> returns the column number of the node
   * passed as argument. If a node set is passed as argument, the line
   * number of the first node in the set is returned.
   *
   * NOTE: Xalan does not normally record location information for each node.
   * To obtain it, you must set the custom TrAX attribute
   * "http://xml.apache.org/xalan/features/source_location"
   * true in the TransformerFactory before generating the Transformer and executing
   * the stylesheet. Storage cost per node will be noticably increased in this mode.
   *
   * @param nodeList a <code>NodeList</code> value
   * @return an <code>int</code> value. This may be -1 to indicate that the
   * column number is not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static int columnNumber(ExpressionContext context)

  /**
   * <code>columnNumber</code> returns the column number of the
   * current context node.
   *
   * NOTE: Xalan does not normally record location information for each node.
   * To obtain it, you must set the custom TrAX attribute
   * "http://xml.apache.org/xalan/features/source_location"
   * true in the TransformerFactory before generating the Transformer and executing
   * the stylesheet. Storage cost per node will be noticably increased in this mode.
   *
   * @param context an <code>ExpressionContext</code> value
   * @return an <code>int</code> value. This may be -1 to indicate that the
   * column number is not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static int lineNumber(NodeList nodeList)

  /**
   * <code>lineNumber</code> returns the line number of the node
   * passed as argument. If a node set is passed as argument, the line
   * number of the first node in the set is returned.
   *
   * NOTE: Xalan does not normally record location information for each node.
   * To obtain it, you must set the custom TrAX attribute
   * "http://xml.apache.org/xalan/features/source_location"
   * true in the TransformerFactory before generating the Transformer and executing
   * the stylesheet. Storage cost per node will be noticably increased in this mode.
   *
   * @param nodeList a <code>NodeList</code> value
   * @return an <code>int</code> value. This may be -1 to indicate that the
   * line number is not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static int lineNumber(ExpressionContext context)

  /**
   * <code>lineNumber</code> returns the line number of the current
   * context node.
   *
   * NOTE: Xalan does not normally record location information for each node.
   * To obtain it, you must set the custom TrAX attribute
   * "http://xml.apache.org/xalan/features/source_location"
   * true in the TransformerFactory before generating the Transformer and executing
   * the stylesheet. Storage cost per node will be noticably increased in this mode.
   *
   * @param context an <code>ExpressionContext</code> value
   * @return an <code>int</code> value. This may be -1 to indicate that the
   * line number is not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static String publicId(NodeList nodeList)

  /**
   * <code>publicId</code> returns the public identifier of the node passed as
   * argument. If a node set is passed as argument, the public identifier of
   * the first node in the set is returned.
   *
   * Xalan does not currently record this value, and will return null.
   *
   * @param nodeList a <code>NodeList</code> value
   * @return a <code>String</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static String publicId(ExpressionContext context)

  /**
   * <code>publicId</code> returns the public identifier of the current
   * context node.
   *
   * Xalan does not currently record this value, and will return null.
   *
   * @param context an <code>ExpressionContext</code> value
   * @return a <code>String</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static String systemId(NodeList nodeList)

  /**
   * <code>systemId</code> returns the system id of the node passed as
   * argument. If a node set is passed as argument, the system id of
   * the first node in the set is returned.
   *
   * @param nodeList a <code>NodeList</code> value
   * @return a <code>String</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
  public static String systemId(ExpressionContext context)

  /**
   * <code>systemId</code> returns the system id of the current
   * context node.
   *
   * @param context an <code>ExpressionContext</code> value
   * @return a <code>String</code> value
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/NodeInfo.java
public class NodeInfo

/**
 * <code>NodeInfo</code> defines a set of XSLT extension functions to be
 * used from stylesheets.
 *
 * @author <a href="mailto:ovidiu@cup.hp.com">Ovidiu Predescu</a>
 * @since May 24, 2001
 */
