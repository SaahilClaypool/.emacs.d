_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * This function is used to perform some extra analysis of the iterator.
   *
   * @param vars List of QNames that correspond to variables.  This list
   * should be searched backwards for the first qualified name that
   * corresponds to the variable reference qname.  The position of the
   * QName in the vector from the start of the vector will be its position
   * in the stack frame (but variables above the globalsTop value will need
   * to be offset to the current stack frame).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
//  boolean canBeWalkedInNaturalDocOrder()

//  /**
//   * NEEDSDOC Method canBeWalkedInNaturalDocOrder
//   *
//   *
//   * NEEDSDOC (canBeWalkedInNaturalDocOrder) @return
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  boolean canBeWalkedInNaturalDocOrderStatic()

  /**
   * Tell if the nodeset can be walked in doc order, via static analysis.
   *
   *
   * @return true if the nodeset can be walked in doc order, without sorting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  WalkingIteratorSorted(
          Compiler compiler, int opPos, int analysis, boolean shouldLoadWalkers)

  /**
   * Create a WalkingIterator iterator, including creation
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  public WalkingIteratorSorted(PrefixResolver nscontext)

  /**
   * Create a WalkingIteratorSorted object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  protected boolean m_inNaturalOrderStatic = false;

  /** True if the nodes will be found in document order, and this can
   * be determined statically. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
//  protected boolean m_inNaturalOrder = false;

//  /** True if the nodes will be found in document order */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
public class WalkingIteratorSorted extends WalkingIterator

/**
 * This class iterates over set of nodes that needs to be sorted.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  public void fixupVariables(java.util.Vector vars, int globalsSize)

  /**
   * This function is used to perform some extra analysis of the iterator.
   *
   * @param vars List of QNames that correspond to variables.  This list
   * should be searched backwards for the first qualified name that
   * corresponds to the variable reference qname.  The position of the
   * QName in the vector from the start of the vector will be its position
   * in the stack frame (but variables above the globalsTop value will need
   * to be offset to the current stack frame).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
//  boolean canBeWalkedInNaturalDocOrder()

//  /**
//   * NEEDSDOC Method canBeWalkedInNaturalDocOrder
//   *
//   *
//   * NEEDSDOC (canBeWalkedInNaturalDocOrder) @return
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  boolean canBeWalkedInNaturalDocOrderStatic()

  /**
   * Tell if the nodeset can be walked in doc order, via static analysis.
   *
   *
   * @return true if the nodeset can be walked in doc order, without sorting.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  WalkingIteratorSorted(
          Compiler compiler, int opPos, int analysis, boolean shouldLoadWalkers)

  /**
   * Create a WalkingIterator iterator, including creation
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  public WalkingIteratorSorted(PrefixResolver nscontext)

  /**
   * Create a WalkingIteratorSorted object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
  protected boolean m_inNaturalOrderStatic = false;

  /** True if the nodes will be found in document order, and this can
   * be determined statically. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
//  protected boolean m_inNaturalOrder = false;

//  /** True if the nodes will be found in document order */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/WalkingIteratorSorted.java
public class WalkingIteratorSorted extends WalkingIterator

/**
 * This class iterates over set of nodes that needs to be sorted.
 * @xsl.usage internal
 */
