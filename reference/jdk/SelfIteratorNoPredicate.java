_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the index of the last node that can be itterated to.
   * This probably will need to be overridded by derived classes.
   *
   * @param xctxt XPath runtime context.
   *
   * @return the index of the last node that can be itterated to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
  public int asNode(XPathContext xctxt)

  /**
   * Return the first node out of the nodeset, if this expression is
   * a nodeset expression.  This is the default implementation for
   * nodesets.  Derived classes should try and override this and return a
   * value without having to do a clone operation.
   * @param xctxt The XPath runtime context.
   * @return the first node out of the nodeset, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
  public SelfIteratorNoPredicate()

  /**
   * Create a SelfIteratorNoPredicate object.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
  SelfIteratorNoPredicate(Compiler compiler, int opPos, int analysis)

  /**
   * Create a SelfIteratorNoPredicate object.
   *
   * @param compiler A reference to the Compiler that contains the op map.
   * @param opPos The position within the op map, which contains the
   * location path expression for this itterator.
   * @param analysis Analysis bits.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
public class SelfIteratorNoPredicate extends LocPathIterator

/**
 * This class implements an optimized iterator for
 * "." patterns, that is, the self axes without any predicates.
 * @see com.sun.org.apache.xpath.internal.axes.LocPathIterator
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
  public int getLastPos(XPathContext xctxt)

  /**
   * Get the index of the last node that can be itterated to.
   * This probably will need to be overridded by derived classes.
   *
   * @param xctxt XPath runtime context.
   *
   * @return the index of the last node that can be itterated to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
  public int asNode(XPathContext xctxt)

  /**
   * Return the first node out of the nodeset, if this expression is
   * a nodeset expression.  This is the default implementation for
   * nodesets.  Derived classes should try and override this and return a
   * value without having to do a clone operation.
   * @param xctxt The XPath runtime context.
   * @return the first node out of the nodeset, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
  public SelfIteratorNoPredicate()

  /**
   * Create a SelfIteratorNoPredicate object.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
  SelfIteratorNoPredicate(Compiler compiler, int opPos, int analysis)

  /**
   * Create a SelfIteratorNoPredicate object.
   *
   * @param compiler A reference to the Compiler that contains the op map.
   * @param opPos The position within the op map, which contains the
   * location path expression for this itterator.
   * @param analysis Analysis bits.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/SelfIteratorNoPredicate.java
public class SelfIteratorNoPredicate extends LocPathIterator

/**
 * This class implements an optimized iterator for
 * "." patterns, that is, the self axes without any predicates.
 * @see com.sun.org.apache.xpath.internal.axes.LocPathIterator
 * @xsl.usage advanced
 */
