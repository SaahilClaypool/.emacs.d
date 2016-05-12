_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static boolean hasSameNode(NodeList nl1, NodeList nl2)

  /**
   * The set:has-same-node function returns true if the node set passed as the first argument shares
   * any nodes with the node set passed as the second argument. If there are no nodes that are in both
   * node sets, then it returns false.
   *
   * The Xalan extensions MethodResolver converts 'has-same-node' to 'hasSameNode'.
   *
   * Note: Not to be confused with hasSameNodes in the Xalan namespace, which returns true if
   * the two node sets contain the exactly the same nodes (perhaps in a different order),
   * otherwise false.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList distinct(NodeList nl)

  /**
   * The set:distinct function returns a subset of the nodes contained in the node-set NS passed
   * as the first argument. Specifically, it selects a node N if there is no node in NS that has
   * the same string value as N, and that precedes N in document order.
   *
   * @param nl NodeList for the node-set.
   * @return a NodeList with nodes from nl containing distinct string values.
   * In other words, if more than one node in nl contains the same string value,
   * only include the first such node found.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList difference(NodeList nl1, NodeList nl2)

  /**
   * The set:difference function returns the difference between two node sets - those nodes that
   * are in the node set passed as the first argument that are not in the node set passed as the
   * second argument.
   *
   * @param nl1 NodeList for first node-set.
   * @param nl2 NodeList for second node-set.
   * @return a NodeList containing the nodes in nl1 that are not in nl2.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList intersection(NodeList nl1, NodeList nl2)

  /**
   * The set:intersection function returns a node set comprising the nodes that are within
   * both the node sets passed as arguments to it.
   *
   * @param nl1 NodeList for first node-set.
   * @param nl2 NodeList for second node-set.
   * @return a NodeList containing the nodes in nl1 that are also
   * in nl2.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList trailing (NodeList nl1, NodeList nl2)

  /**
   * The set:trailing function returns the nodes in the node set passed as the first argument that
   * follow, in document order, the first node in the node set passed as the second argument. If
   * the first node in the second node set is not contained in the first node set, then an empty
   * node set is returned. If the second node set is empty, then the first node set is returned.
   *
   * @param nl1 NodeList for first node-set.
   * @param nl2 NodeList for second node-set.
   * @return a NodeList containing the nodes in nl1 that follow in document order the first
   * node in nl2; an empty node-set if the first node in nl2 is not in nl1; all of nl1 if nl2
   * is empty.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList leading (NodeList nl1, NodeList nl2)

  /**
   * The set:leading function returns the nodes in the node set passed as the first argument that
   * precede, in document order, the first node in the node set passed as the second argument. If
   * the first node in the second node set is not contained in the first node set, then an empty
   * node set is returned. If the second node set is empty, then the first node set is returned.
   *
   * @param nl1 NodeList for first node-set.
   * @param nl2 NodeList for second node-set.
   * @return a NodeList containing the nodes in nl1 that precede in document order the first
   * node in nl2; an empty node-set if the first node in nl2 is not in nl1; all of nl1 if nl2
   * is empty.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
public class ExsltSets extends ExsltBase

/**
 * This class contains EXSLT set extension functions.
 * It is accessed by specifying a namespace URI as follows:
 * <pre>
 *    xmlns:set="http://exslt.org/sets"
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static boolean hasSameNode(NodeList nl1, NodeList nl2)

  /**
   * The set:has-same-node function returns true if the node set passed as the first argument shares
   * any nodes with the node set passed as the second argument. If there are no nodes that are in both
   * node sets, then it returns false.
   *
   * The Xalan extensions MethodResolver converts 'has-same-node' to 'hasSameNode'.
   *
   * Note: Not to be confused with hasSameNodes in the Xalan namespace, which returns true if
   * the two node sets contain the exactly the same nodes (perhaps in a different order),
   * otherwise false.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList distinct(NodeList nl)

  /**
   * The set:distinct function returns a subset of the nodes contained in the node-set NS passed
   * as the first argument. Specifically, it selects a node N if there is no node in NS that has
   * the same string value as N, and that precedes N in document order.
   *
   * @param nl NodeList for the node-set.
   * @return a NodeList with nodes from nl containing distinct string values.
   * In other words, if more than one node in nl contains the same string value,
   * only include the first such node found.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList difference(NodeList nl1, NodeList nl2)

  /**
   * The set:difference function returns the difference between two node sets - those nodes that
   * are in the node set passed as the first argument that are not in the node set passed as the
   * second argument.
   *
   * @param nl1 NodeList for first node-set.
   * @param nl2 NodeList for second node-set.
   * @return a NodeList containing the nodes in nl1 that are not in nl2.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList intersection(NodeList nl1, NodeList nl2)

  /**
   * The set:intersection function returns a node set comprising the nodes that are within
   * both the node sets passed as arguments to it.
   *
   * @param nl1 NodeList for first node-set.
   * @param nl2 NodeList for second node-set.
   * @return a NodeList containing the nodes in nl1 that are also
   * in nl2.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList trailing (NodeList nl1, NodeList nl2)

  /**
   * The set:trailing function returns the nodes in the node set passed as the first argument that
   * follow, in document order, the first node in the node set passed as the second argument. If
   * the first node in the second node set is not contained in the first node set, then an empty
   * node set is returned. If the second node set is empty, then the first node set is returned.
   *
   * @param nl1 NodeList for first node-set.
   * @param nl2 NodeList for second node-set.
   * @return a NodeList containing the nodes in nl1 that follow in document order the first
   * node in nl2; an empty node-set if the first node in nl2 is not in nl1; all of nl1 if nl2
   * is empty.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
  public static NodeList leading (NodeList nl1, NodeList nl2)

  /**
   * The set:leading function returns the nodes in the node set passed as the first argument that
   * precede, in document order, the first node in the node set passed as the second argument. If
   * the first node in the second node set is not contained in the first node set, then an empty
   * node set is returned. If the second node set is empty, then the first node set is returned.
   *
   * @param nl1 NodeList for first node-set.
   * @param nl2 NodeList for second node-set.
   * @return a NodeList containing the nodes in nl1 that precede in document order the first
   * node in nl2; an empty node-set if the first node in nl2 is not in nl1; all of nl1 if nl2
   * is empty.
   *
   * @see <a href="http://www.exslt.org/">EXSLT</a>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/lib/ExsltSets.java
public class ExsltSets extends ExsltBase

/**
 * This class contains EXSLT set extension functions.
 * It is accessed by specifying a namespace URI as follows:
 * <pre>
 *    xmlns:set="http://exslt.org/sets"
 * </pre>
 *
 * The documentation for each function has been copied from the relevant
 * EXSLT Implementer page.
 *
 * @see <a href="http://www.exslt.org/">EXSLT</a>
 * @xsl.usage general
 */
