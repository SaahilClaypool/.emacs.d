_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
  public short acceptNode(int n)

  /**
   * Test whether a specified node is visible in the logical view of a
   * TreeWalker or NodeIterator. This function will be called by the
   * implementation of TreeWalker and NodeIterator; it is not intended to
   * be called directly from user code.
   * @param n  The node to check to see if it passes the filter or not.
   * @return  a constant to determine whether the node is accepted,
   *   rejected, or skipped, as defined  above .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
  public void addNodeTest(PredicatedNodeTest test)

  /**
   * Add a node test to the union list.
   *
   * @param test reference to a NodeTest, which will be added
   * directly to the list of node tests (in other words, it will
   * not be cloned).  The parent of this test will be set to
   * this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
  public UnionChildIterator()

  /**
   * Constructor for UnionChildIterator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
  private PredicatedNodeTest[] m_nodeTests = null;

  /**
   * Even though these may hold full LocPathIterators, this array does
   * not have to be cloned, since only the node test and predicate
   * portion are used, and these only need static information.  However,
   * also note that index predicates can not be used!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
public class UnionChildIterator extends ChildTestIterator

/**
 * This class defines a simplified type of union iterator that only
 * tests along the child axes.  If the conditions are right, it is
 * much faster than using a UnionPathIterator.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
  public short acceptNode(int n)

  /**
   * Test whether a specified node is visible in the logical view of a
   * TreeWalker or NodeIterator. This function will be called by the
   * implementation of TreeWalker and NodeIterator; it is not intended to
   * be called directly from user code.
   * @param n  The node to check to see if it passes the filter or not.
   * @return  a constant to determine whether the node is accepted,
   *   rejected, or skipped, as defined  above .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
  public void addNodeTest(PredicatedNodeTest test)

  /**
   * Add a node test to the union list.
   *
   * @param test reference to a NodeTest, which will be added
   * directly to the list of node tests (in other words, it will
   * not be cloned).  The parent of this test will be set to
   * this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
  public UnionChildIterator()

  /**
   * Constructor for UnionChildIterator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
  private PredicatedNodeTest[] m_nodeTests = null;

  /**
   * Even though these may hold full LocPathIterators, this array does
   * not have to be cloned, since only the node test and predicate
   * portion are used, and these only need static information.  However,
   * also note that index predicates can not be used!
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/UnionChildIterator.java
public class UnionChildIterator extends ChildTestIterator

/**
 * This class defines a simplified type of union iterator that only
 * tests along the child axes.  If the conditions are right, it is
 * much faster than using a UnionPathIterator.
 */
