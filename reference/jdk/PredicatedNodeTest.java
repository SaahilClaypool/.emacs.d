_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  static final boolean DEBUG_PREDICATECOUNTING = false;

  /** If true, diagnostic messages about predicate execution will be posted.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  transient protected int[] m_proximityPositions;

  /**
   * An array of counts that correspond to the number
   * of predicates the step contains.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  private Expression[] m_predicates;

  /** The list of predicate expressions. Is static and does not need
   *  to be deep cloned.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  transient int m_predicateIndex = -1;

  /**
   * Which predicate we are executing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected LocPathIterator m_lpi;

  /** The owning location path iterator.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  transient protected boolean m_foundLast = false;

  /** This is true if nextNode returns null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
        public void callPredicateVisitors(XPathVisitor visitor)

        /**
         * This will traverse the heararchy, calling the visitor for
         * each member.  If the called visitor method returns
         * false, the subtree should not be called.
         *
         * @param visitor The visitor whose appropriate method will be called.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
   public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public void setLocPathIterator(LocPathIterator li)

  /**
   * Set the location path iterator owner for this walker.  Besides
   * initialization, this function is called during cloning operations.
   *
   * @param li non-null reference to the owning location path iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public LocPathIterator getLocPathIterator()

  /**
   * Get the owning location path iterator.
   *
   * @return the owning location path iterator, which should not be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public short acceptNode(int n)

  /**
   *  Test whether a specified node is visible in the logical view of a
   * TreeWalker or NodeIterator. This function will be called by the
   * implementation of TreeWalker and NodeIterator; it is not intended to
   * be called directly from user code.
   * @param n  The node to check to see if it passes the filter or not.
   * @return  a constant to determine whether the node is accepted,
   *   rejected, or skipped, as defined  above .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected String nodeToString(int n)

  /**
   * Diagnostics.
   *
   * @param n Node to give diagnostic information about, or null.
   *
   * @return Informative string about the argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  boolean executePredicates(int context, XPathContext xctxt)

  /**
   * Process the predicates.
   *
   * @param context The current context node.
   * @param xctxt The XPath runtime context.
   *
   * @return the result of executing the predicate expressions.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public int getPredicateIndex()

  /**
   * Get which predicate is executing.
   *
   * @return The current predicate index, or -1 if no predicate is executing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public boolean isReverseAxes()

  /**
   * Tells if this is a reverse axes.
   *
   * @return false, unless a derived class overrides.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected void countProximityPosition(int i)

  /**
   * Count forward one proximity position.
   *
   * @param i The index into the m_proximityPositions array, where the increment
   *          will occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public void initProximityPosition(int i) throws javax.xml.transform.TransformerException

  /**
   * Init the proximity position to zero for a forward axes.
   *
   * @param i The index into the m_proximityPositions array.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public void resetProximityPositions()

  /**
   * Reset the proximity positions counts.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected int getProximityPosition(int predicateIndex)

  /**
   * Get the current sub-context position.
   *
   * @param predicateIndex The index of the predicate where the proximity
   *                       should be taken from.
   *
   * @return The node position of this walker in the sub-context node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public abstract int getLastPos(XPathContext xctxt);

  /**
   * Get the index of the last node that can be itterated to.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the index of the last node that can be itterated to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public int getProximityPosition(XPathContext xctxt)

  /**
   * Get the current sub-context position.
   *
   * @param xctxt The XPath runtime context.
   *
   * @return The node position of this walker in the sub-context node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public int getProximityPosition()

  /**
   * Get the current sub-context position.
   *
   * @return The node position of this walker in the sub-context node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public Expression getPredicate(int index)

  /**
   * Get a predicate expression at the given index.
   *
   *
   * @param index Index of the predicate.
   *
   * @return A predicate expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected void initPredicateInfo(Compiler compiler, int opPos)

  /**
   * Init predicate info.
   *
   * @param compiler The Compiler object that has information about this
   *                 walker in the op map.
   * @param opPos The op code position of this location step.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public void setPredicateCount(int count)

  /**
   * Set the number of predicates that this walker has.  This does more
   * that one would think, as it creates a new predicate array of the
   * size of the count argument, and copies count predicates into the new
   * one from the old, and then reassigns the predicates value.  All this
   * to keep from having to have a predicate count value.
   *
   * @param count The number of predicates, which must be equal or less
   *               than the existing count.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public int getPredicateCount()

  /**
   * Get the number of predicates that this walker has.
   *
   * @return the number of predicates that this walker has.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned PrdicatedNodeTest.
   *
   * @return A new PredicatedNodeTest that can be used without mutating this one.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  private void readObject(java.io.ObjectInputStream stream)

  /**
   * Read the object from a serialization stream.
   *
   * @param stream Input stream to read from
   *
   * @throws java.io.IOException
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  PredicatedNodeTest()

  /**
   * Construct an AxesWalker.  The location path iterator will have to be set
   * before use.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  PredicatedNodeTest(LocPathIterator locPathIterator)

  /**
   * Construct an AxesWalker using a LocPathIterator.
   *
   * @param locPathIterator non-null reference to the parent iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
    public void setExpression(Expression exp)

    /**
     * @see ExpressionOwner#setExpression(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
    public Expression getExpression()

    /**
     * @see ExpressionOwner#getExpression()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  static final boolean DEBUG_PREDICATECOUNTING = false;

  /** If true, diagnostic messages about predicate execution will be posted.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  transient protected int[] m_proximityPositions;

  /**
   * An array of counts that correspond to the number
   * of predicates the step contains.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  private Expression[] m_predicates;

  /** The list of predicate expressions. Is static and does not need
   *  to be deep cloned.
   *  @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  transient int m_predicateIndex = -1;

  /**
   * Which predicate we are executing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected LocPathIterator m_lpi;

  /** The owning location path iterator.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  transient protected boolean m_foundLast = false;

  /** This is true if nextNode returns null. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
    public boolean deepEquals(Expression expr)

    /**
     * @see Expression#deepEquals(Expression)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
        public void callPredicateVisitors(XPathVisitor visitor)

        /**
         * This will traverse the heararchy, calling the visitor for
         * each member.  If the called visitor method returns
         * false, the subtree should not be called.
         *
         * @param visitor The visitor whose appropriate method will be called.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
   public boolean canTraverseOutsideSubtree()

  /**
   * Tell if this expression or it's subexpressions can traverse outside
   * the current subtree.
   *
   * @return true if traversal outside the context node's subtree can occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public void setLocPathIterator(LocPathIterator li)

  /**
   * Set the location path iterator owner for this walker.  Besides
   * initialization, this function is called during cloning operations.
   *
   * @param li non-null reference to the owning location path iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public LocPathIterator getLocPathIterator()

  /**
   * Get the owning location path iterator.
   *
   * @return the owning location path iterator, which should not be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public short acceptNode(int n)

  /**
   *  Test whether a specified node is visible in the logical view of a
   * TreeWalker or NodeIterator. This function will be called by the
   * implementation of TreeWalker and NodeIterator; it is not intended to
   * be called directly from user code.
   * @param n  The node to check to see if it passes the filter or not.
   * @return  a constant to determine whether the node is accepted,
   *   rejected, or skipped, as defined  above .
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected String nodeToString(int n)

  /**
   * Diagnostics.
   *
   * @param n Node to give diagnostic information about, or null.
   *
   * @return Informative string about the argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  boolean executePredicates(int context, XPathContext xctxt)

  /**
   * Process the predicates.
   *
   * @param context The current context node.
   * @param xctxt The XPath runtime context.
   *
   * @return the result of executing the predicate expressions.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public int getPredicateIndex()

  /**
   * Get which predicate is executing.
   *
   * @return The current predicate index, or -1 if no predicate is executing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public boolean isReverseAxes()

  /**
   * Tells if this is a reverse axes.
   *
   * @return false, unless a derived class overrides.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected void countProximityPosition(int i)

  /**
   * Count forward one proximity position.
   *
   * @param i The index into the m_proximityPositions array, where the increment
   *          will occur.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public void initProximityPosition(int i) throws javax.xml.transform.TransformerException

  /**
   * Init the proximity position to zero for a forward axes.
   *
   * @param i The index into the m_proximityPositions array.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public void resetProximityPositions()

  /**
   * Reset the proximity positions counts.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected int getProximityPosition(int predicateIndex)

  /**
   * Get the current sub-context position.
   *
   * @param predicateIndex The index of the predicate where the proximity
   *                       should be taken from.
   *
   * @return The node position of this walker in the sub-context node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public abstract int getLastPos(XPathContext xctxt);

  /**
   * Get the index of the last node that can be itterated to.
   *
   *
   * @param xctxt XPath runtime context.
   *
   * @return the index of the last node that can be itterated to.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public int getProximityPosition(XPathContext xctxt)

  /**
   * Get the current sub-context position.
   *
   * @param xctxt The XPath runtime context.
   *
   * @return The node position of this walker in the sub-context node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public int getProximityPosition()

  /**
   * Get the current sub-context position.
   *
   * @return The node position of this walker in the sub-context node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public Expression getPredicate(int index)

  /**
   * Get a predicate expression at the given index.
   *
   *
   * @param index Index of the predicate.
   *
   * @return A predicate expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  protected void initPredicateInfo(Compiler compiler, int opPos)

  /**
   * Init predicate info.
   *
   * @param compiler The Compiler object that has information about this
   *                 walker in the op map.
   * @param opPos The op code position of this location step.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public void setPredicateCount(int count)

  /**
   * Set the number of predicates that this walker has.  This does more
   * that one would think, as it creates a new predicate array of the
   * size of the count argument, and copies count predicates into the new
   * one from the old, and then reassigns the predicates value.  All this
   * to keep from having to have a predicate count value.
   *
   * @param count The number of predicates, which must be equal or less
   *               than the existing count.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public int getPredicateCount()

  /**
   * Get the number of predicates that this walker has.
   *
   * @return the number of predicates that this walker has.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  public Object clone() throws CloneNotSupportedException

  /**
   * Get a cloned PrdicatedNodeTest.
   *
   * @return A new PredicatedNodeTest that can be used without mutating this one.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  private void readObject(java.io.ObjectInputStream stream)

  /**
   * Read the object from a serialization stream.
   *
   * @param stream Input stream to read from
   *
   * @throws java.io.IOException
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  PredicatedNodeTest()

  /**
   * Construct an AxesWalker.  The location path iterator will have to be set
   * before use.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/PredicatedNodeTest.java
  PredicatedNodeTest(LocPathIterator locPathIterator)

  /**
   * Construct an AxesWalker using a LocPathIterator.
   *
   * @param locPathIterator non-null reference to the parent iterator.
   */
