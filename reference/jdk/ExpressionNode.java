_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
  public int exprGetNumChildren();

  /** Return the number of children the node has. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
  public ExpressionNode exprGetChild(int i);

  /** This method returns a child node.  The children are numbered
     from zero, left to right. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
  public void exprAddChild(ExpressionNode n, int i);

  /** This method tells the node to add its argument to the node's
    list of children.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
  public void exprSetParent(ExpressionNode n);

  /** This pair of methods are used to inform the node of its
    parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
public interface ExpressionNode extends SourceLocator

/**
 * A class that implements this interface can construct expressions,
 * give information about child and parent expressions,
 * and give the originating source information.  A class that implements
 * this interface does not lay any claim to being directly executable.
 *
 * <p>Note: This interface should not be considered stable.  Only exprSetParent
 * and exprGetParent can be counted on to work reliably.  Work in progress.</p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
  public int exprGetNumChildren();

  /** Return the number of children the node has. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
  public ExpressionNode exprGetChild(int i);

  /** This method returns a child node.  The children are numbered
     from zero, left to right. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
  public void exprAddChild(ExpressionNode n, int i);

  /** This method tells the node to add its argument to the node's
    list of children.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
  public void exprSetParent(ExpressionNode n);

  /** This pair of methods are used to inform the node of its
    parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/ExpressionNode.java
public interface ExpressionNode extends SourceLocator

/**
 * A class that implements this interface can construct expressions,
 * give information about child and parent expressions,
 * and give the originating source information.  A class that implements
 * this interface does not lay any claim to being directly executable.
 *
 * <p>Note: This interface should not be considered stable.  Only exprSetParent
 * and exprGetParent can be counted on to work reliably.  Work in progress.</p>
 */
