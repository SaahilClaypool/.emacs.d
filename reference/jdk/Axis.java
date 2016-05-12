_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
    private static final String[] names =

    /** The names of the axes for diagnostic purposes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  private static final boolean[] isReverse = {

  /**
   * A table to identify whether an axis is a reverse axis;
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int FILTEREDLIST = 20;

  /**
   * A non-xpath axis, for functions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ROOT = 19;

  /**
   * A non-xpath axis, returns root only.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int DESCENDANTSORSELFFROMROOT = 18;

  /**
   * A non-xpath axis, returns all nodes that aren't namespaces or attributes,
   * from and including the root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int DESCENDANTSFROMROOT = 17;

  /**
   * A non-xpath axis, returns all nodes that aren't namespaces or attributes,
   * from and including the root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ALL = 16;

  /**
   * A non-xpath axis, returns all nodes in the tree from and including the
   * root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int PRECEDINGANDANCESTOR = 15;

  /**
   * A non-xpath axis, traversing the the preceding and the ancestor nodes,
   * needed for inverseing select patterns to match patterns.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ALLFROMNODE = 14;

  /**
   * A non-xpath axis, traversing the subtree including the subtree
   *  root, descendants, attributes, and namespace node decls.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int SELF = 13;

  /** The self axis contains just the context node itself. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int PRECEDINGSIBLING = 12;

  /**
   * The preceding-sibling axis contains all the preceding siblings of the
   *  context node; if the context node is an attribute node or namespace node,
   *  the preceding-sibling axis is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int PRECEDING = 11;

  /**
   * The preceding axis contains all nodes in the same document as the context
   *  node that are before the context node in document order, excluding any
   *  ancestors and excluding attribute nodes and namespace nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int PARENT = 10;

  /**
   * The parent axis contains the parent of the context node,
   *  if there is one.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int NAMESPACE = 9;

  /**
   * The namespace axis contains the namespace nodes of the context node; the
   *  axis will be empty unless the context node is an element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int NAMESPACEDECLS = 8;

  /**
   * The namespace axis contains the namespace nodes of the context node; the
   *  axis will be empty unless the context node is an element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int FOLLOWINGSIBLING = 7;

  /**
   * The following-sibling axis contains all the following siblings of the
   *  context node; if the context node is an attribute node or namespace node,
   *  the following-sibling axis is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int FOLLOWING = 6;

  /**
   * the following axis contains all nodes in the same document as the
   *  context node that are after the context node in document order, excluding
   *  any descendants and excluding attribute nodes and namespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int DESCENDANTORSELF = 5;

  /**
   * The descendant-or-self axis contains the context node and the
   *  descendants of the context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int DESCENDANT = 4;

  /**
   * The descendant axis contains the descendants of the context node;
   *  a descendant is a child or a child of a child and so on; thus the
   *  descendant axis never contains attribute or namespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int CHILD = 3;

  /** The child axis contains the children of the context node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ATTRIBUTE = 2;

  /**
   * the attribute axis contains the attributes of the context node; the axis
   *  will be empty unless the context node is an element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ANCESTORORSELF = 1;

  /**
   * the ancestor-or-self axis contains the context node and the ancestors of
   *  the context node; thus, the ancestor axis will always include the
   *  root node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ANCESTOR = 0;

  /**
   * The ancestor axis contains the ancestors of the context node;
   *  the ancestors of the context node consist of the parent of context
   *  node and the parent's parent and so on; thus, the ancestor axis will
   *  always include the root node, unless the context node is the root node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
public final class Axis

/**
 * Specifies values related to XPath Axes.
 * <p>The ancestor, descendant, following, preceding and self axes partition a
 * document (ignoring attribute and namespace nodes): they do not overlap
 * and together they contain all the nodes in the document.</p>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
    private static final String[] names =

    /** The names of the axes for diagnostic purposes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  private static final boolean[] isReverse = {

  /**
   * A table to identify whether an axis is a reverse axis;
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int FILTEREDLIST = 20;

  /**
   * A non-xpath axis, for functions.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ROOT = 19;

  /**
   * A non-xpath axis, returns root only.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int DESCENDANTSORSELFFROMROOT = 18;

  /**
   * A non-xpath axis, returns all nodes that aren't namespaces or attributes,
   * from and including the root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int DESCENDANTSFROMROOT = 17;

  /**
   * A non-xpath axis, returns all nodes that aren't namespaces or attributes,
   * from and including the root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ALL = 16;

  /**
   * A non-xpath axis, returns all nodes in the tree from and including the
   * root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int PRECEDINGANDANCESTOR = 15;

  /**
   * A non-xpath axis, traversing the the preceding and the ancestor nodes,
   * needed for inverseing select patterns to match patterns.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ALLFROMNODE = 14;

  /**
   * A non-xpath axis, traversing the subtree including the subtree
   *  root, descendants, attributes, and namespace node decls.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int SELF = 13;

  /** The self axis contains just the context node itself. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int PRECEDINGSIBLING = 12;

  /**
   * The preceding-sibling axis contains all the preceding siblings of the
   *  context node; if the context node is an attribute node or namespace node,
   *  the preceding-sibling axis is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int PRECEDING = 11;

  /**
   * The preceding axis contains all nodes in the same document as the context
   *  node that are before the context node in document order, excluding any
   *  ancestors and excluding attribute nodes and namespace nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int PARENT = 10;

  /**
   * The parent axis contains the parent of the context node,
   *  if there is one.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int NAMESPACE = 9;

  /**
   * The namespace axis contains the namespace nodes of the context node; the
   *  axis will be empty unless the context node is an element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int NAMESPACEDECLS = 8;

  /**
   * The namespace axis contains the namespace nodes of the context node; the
   *  axis will be empty unless the context node is an element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int FOLLOWINGSIBLING = 7;

  /**
   * The following-sibling axis contains all the following siblings of the
   *  context node; if the context node is an attribute node or namespace node,
   *  the following-sibling axis is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int FOLLOWING = 6;

  /**
   * the following axis contains all nodes in the same document as the
   *  context node that are after the context node in document order, excluding
   *  any descendants and excluding attribute nodes and namespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int DESCENDANTORSELF = 5;

  /**
   * The descendant-or-self axis contains the context node and the
   *  descendants of the context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int DESCENDANT = 4;

  /**
   * The descendant axis contains the descendants of the context node;
   *  a descendant is a child or a child of a child and so on; thus the
   *  descendant axis never contains attribute or namespace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int CHILD = 3;

  /** The child axis contains the children of the context node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ATTRIBUTE = 2;

  /**
   * the attribute axis contains the attributes of the context node; the axis
   *  will be empty unless the context node is an element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ANCESTORORSELF = 1;

  /**
   * the ancestor-or-self axis contains the context node and the ancestors of
   *  the context node; thus, the ancestor axis will always include the
   *  root node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
  public static final int ANCESTOR = 0;

  /**
   * The ancestor axis contains the ancestors of the context node;
   *  the ancestors of the context node consist of the parent of context
   *  node and the parent's parent and so on; thus, the ancestor axis will
   *  always include the root node, unless the context node is the root node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/Axis.java
public final class Axis

/**
 * Specifies values related to XPath Axes.
 * <p>The ancestor, descendant, following, preceding and self axes partition a
 * document (ignoring attribute and namespace nodes): they do not overlap
 * and together they contain all the nodes in the document.</p>
 *
 */
