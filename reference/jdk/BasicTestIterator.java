_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  public DTMIterator cloneWithReset() throws CloneNotSupportedException

  /**
   *  Get a cloned Iterator that is reset to the beginning
   *  of the query.
   *
   *  @return A cloned NodeIterator set of the start of the query.
   *
   *  @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  public int nextNode()

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   *
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected abstract int getNextNode();

  /**
   * Get the next node via getNextXXX.  Bottlenecked for derived class override.
   * @return The next node on the axis, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected BasicTestIterator(
          Compiler compiler, int opPos, int analysis, boolean shouldLoadWalkers)

  /**
   * Create a LocPathIterator object, including creation
   * of step walkers from the opcode list, and call back
   * into the Compiler to create predicate expressions.
   *
   * @param compiler The Compiler which is creating
   * this expression.
   * @param opPos The position of this iterator in the
   * opcode list from the compiler.
   * @param shouldLoadWalkers True if walkers should be
   * loaded, or false if this is a derived iterator and
   * it doesn't wish to load child walkers.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected BasicTestIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a LocPathIterator object, including creation
   * of step walkers from the opcode list, and call back
   * into the Compiler to create predicate expressions.
   *
   * @param compiler The Compiler which is creating
   * this expression.
   * @param opPos The position of this iterator in the
   * opcode list from the compiler.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected BasicTestIterator(PrefixResolver nscontext)

  /**
   * Create a LocPathIterator object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected BasicTestIterator()

  /**
   * Create a LocPathIterator object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
public abstract class BasicTestIterator extends LocPathIterator

/**
 * Base for iterators that handle predicates.  Does the basic next
 * node logic, so all the derived iterator has to do is get the
 * next node.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  public DTMIterator cloneWithReset() throws CloneNotSupportedException

  /**
   *  Get a cloned Iterator that is reset to the beginning
   *  of the query.
   *
   *  @return A cloned NodeIterator set of the start of the query.
   *
   *  @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  public int nextNode()

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   *
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected abstract int getNextNode();

  /**
   * Get the next node via getNextXXX.  Bottlenecked for derived class override.
   * @return The next node on the axis, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected BasicTestIterator(
          Compiler compiler, int opPos, int analysis, boolean shouldLoadWalkers)

  /**
   * Create a LocPathIterator object, including creation
   * of step walkers from the opcode list, and call back
   * into the Compiler to create predicate expressions.
   *
   * @param compiler The Compiler which is creating
   * this expression.
   * @param opPos The position of this iterator in the
   * opcode list from the compiler.
   * @param shouldLoadWalkers True if walkers should be
   * loaded, or false if this is a derived iterator and
   * it doesn't wish to load child walkers.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected BasicTestIterator(Compiler compiler, int opPos, int analysis)

  /**
   * Create a LocPathIterator object, including creation
   * of step walkers from the opcode list, and call back
   * into the Compiler to create predicate expressions.
   *
   * @param compiler The Compiler which is creating
   * this expression.
   * @param opPos The position of this iterator in the
   * opcode list from the compiler.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected BasicTestIterator(PrefixResolver nscontext)

  /**
   * Create a LocPathIterator object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
  protected BasicTestIterator()

  /**
   * Create a LocPathIterator object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/BasicTestIterator.java
public abstract class BasicTestIterator extends LocPathIterator

/**
 * Base for iterators that handle predicates.  Does the basic next
 * node logic, so all the derived iterator has to do is get the
 * next node.
 */
