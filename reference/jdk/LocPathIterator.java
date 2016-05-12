_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  protected int m_analysis = 0x00000000;

//  /**
//   * The analysis pattern built by the WalkerFactory.
//   * TODO: Move to LocPathIterator.
//   * @see com.sun.org.apache.xpath.internal.axes.WalkerFactory
//   * @serial
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected XPathContext m_execContext;

  /**
   * The XPathContext reference, needed for execution of many
   * operations.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  private PrefixResolver m_prefixResolver;

  /**
   * Fast access to the current prefix resolver.  It isn't really
   * clear that this is needed.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected int m_pos = 0;

  /**
   * The current position of the context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected int m_currentContextNode = DTM.NULL;

  /**
   * The node context from where the expression is being
   * executed from (i.e. for current() support).  Different
   * from m_context in that this is the context for the entire
   * expression, rather than the context for the subexpression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected int m_context = DTM.NULL;

  /**
   * The context node for this iterator, which doesn't change through
   * the course of the iteration.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient public int m_lastFetched = DTM.NULL;

  /** The last node that was fetched, usually by nextNode. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  private boolean m_isTopLevel = false;

  /**
   * Value determined at compile time, indicates that this is an
   * iterator at the top level of the expression, rather than inside
   * a predicate.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient int m_stackFrame = -1;

  /**
   * The stack frame index for this iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected DTM m_cdtm;

  /**
   * The dtm of the context node.  Careful about using this... it may not
   * be the dtm of the current node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected IteratorPool m_clones = new IteratorPool(this);

  /**
   * The pool for cloned iterators.  Iterators need to be cloned
   * because the hold running state, and thus the original iterator
   * expression from the stylesheet pool can not be used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  void setAnalysis(int a)

//  /**
//   * Set the analysis pattern built by the WalkerFactory.
//   *
//   * @param a The analysis pattern built by the WalkerFactory.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  int getAnalysis()

//  /**
//   * Get the analysis pattern built by the WalkerFactory.
//   *
//   * @return The analysis pattern built by the WalkerFactory.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final PrefixResolver getPrefixResolver()

  /**
   * Return the saved reference to the prefix resolver that
   * was in effect when this iterator was created.
   *
   * @return The prefix resolver or this iterator, which may be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  public void setRoot(int n)

//  /**
//   * Set the current context node for this iterator.
//   *
//   * @param n Must be a non-null reference to the node context.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final void setCurrentContextNode(int n)

  /**
   * Set the current context node for this iterator.
   *
   * @param n Must be a non-null reference to the node context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final int getCurrentContextNode()

  /**
   * The node context from where the expression is being
   * executed from (i.e. for current() support).
   *
   * @return The top-level node context of the entire expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final int getContext()

  /**
   * The node context for the iterator.
   *
   * @return The node context, same as getRoot().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final XPathContext getXPathContext()

  /**
   * The XPath execution context we are operating on.
   *
   * @return XPath execution context this iterator is operating on,
   * or null if setRoot has not been called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final boolean getFoundLast()

  /**
   * Tells if we've found the last node yet.
   *
   * @return true if the last nextNode returned null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void runTo(int index)

  /**
   * If an index is requested, NodeSetDTM will call this method
   * to run the iterator to the index.  By default this sets
   * m_next to the index.  If the index argument is -1, this
   * signals that the iterator should be run to the end.
   *
   * @param index The index to run to, or -1 if the iterator
   * should run to the end.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getCurrentNode()

  /**
   * Return the last fetched node.  Needed to support the UnionPathIterator.
   *
   * @return The last fetched node, or null if the last fetch was null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected int returnNextNode(int nextNode)

  /**
   * Bottleneck the return of a next node, to make returns
   * easier from nextNode().
   *
   * @param nextNode The next node found, may be null.
   *
   * @return The same node that was passed as an argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public abstract int nextNode();

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  public Object clone() throws CloneNotSupportedException

//  /**
//   * Get a cloned LocPathIterator that holds the same
//   * position as this iterator.
//   *
//   * @return A clone of this iterator that holds the same node position.
//   *
//   * @throws CloneNotSupportedException
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTMIterator cloneWithReset() throws CloneNotSupportedException

  /**
   * Get a cloned Iterator that is reset to the beginning
   * of the query.
   *
   * @return A cloned NodeIterator set of the start of the query.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void reset()

  /**
   * Reset the iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void detach()

  /**
   *  Detaches the iterator from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state. After<code>detach</code> has been invoked, calls to
   * <code>nextNode</code> or<code>previousNode</code> will raise the
   * exception INVALID_STATE_ERR.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void allowDetachToRelease(boolean allowRelease)

  /**
   * Specify if it's OK for detach to release the iterator for reuse.
   *
   * @param allowRelease true if it is OK for detach to release this iterator
   * for pooling.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected boolean m_allowDetach = true;

  /** Control over whether it is OK for detach to reset the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean getExpandEntityReferences()

  /**
   *  The value of this flag determines whether the children of entity
   * reference nodes are visible to the iterator. If false, they will be
   * skipped over.
   * <br> To produce a view of the document that has entity references
   * expanded and does not expose the entity reference node itself, use the
   * whatToShow flags to hide the entity reference node and set
   * expandEntityReferences to true when creating the iterator. To produce
   * a view of the document that has entity reference nodes but no entity
   * expansion, use the whatToShow flags to show the entity reference node
   * and set expandEntityReferences to false.
   *
   * @return Always true, since entity reference nodes are not
   * visible in the XPath model.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getRoot()

  /**
   * The root node of the Iterator, as specified when it was created.
   *
   * @return The "root" of this iterator, which, in XPath terms,
   * is the node context for this iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTMFilter getFilter()

  /**
   *  The filter used to screen nodes.  Not used at this time,
   * this is here only to fullfill the DOM NodeIterator
   * interface.
   *
   * @return Always null.
   * @see org.w3c.dom.traversal.NodeIterator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getWhatToShow()

  /**
   * This attribute determines which node types are presented via the
   * iterator. The available set of constants is defined in the
   * <code>NodeFilter</code> interface.
   *
   * <p>This is somewhat useless at this time, since it doesn't
   * really return information that tells what this iterator will
   * show.  It is here only to fullfill the DOM NodeIterator
   * interface.</p>
   *
   * @return For now, always NodeFilter.SHOW_ALL & ~NodeFilter.SHOW_ENTITY_REFERENCE.
   * @see org.w3c.dom.traversal.NodeIterator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int previousNode()

  /**
   *  Returns the previous node in the set and moves the position of the
   * iterator backwards in the set.
   * @return  The previous <code>Node</code> in the set being iterated over,
   *   or<code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean isFresh()

  /**
   * Tells if this NodeSetDTM is "fresh", in other words, if
   * the first nextNode() that is called will return the
   * first node in the set.
   *
   * @return true of nextNode has not been called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getLength()

  /**
   *  The number of nodes in the list. The range of valid child node indices
   * is 0 to <code>length-1</code> inclusive.
   *
   * @return The number of nodes in the list, always greater or equal to zero.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setItem(int node, int index)

  /**
   * Sets the node at the specified index of this vector to be the
   * specified node. The previous component at that position is discarded.
   *
   * <p>The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   * The iterator must be in cached mode.</p>
   *
   * <p>Meant to be used for sorted iterators.</p>
   *
   * @param node Node to set
   * @param index Index of where to set the node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int item(int index)

  /**
   *  Returns the <code>index</code> th item in the collection. If
   * <code>index</code> is greater than or equal to the number of nodes in
   * the list, this returns <code>null</code> .
   * @param index  Index into the collection.
   * @return  The node at the <code>index</code> th position in the
   *   <code>NodeList</code> , or <code>null</code> if that is not a valid
   *   index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int size()

  /**
   * Get the length of the cached nodes.
   *
   * <p>Note: for the moment at least, this only returns
   * the size of the nodes that have been fetched to date,
   * it doesn't attempt to run to the end to make sure we
   * have found everything.  This should be reviewed.</p>
   *
   * @return The size of the current cache list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void incrementCurrentPos()

  /**
   * Increment the current position in the node set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setCurrentPos(int i)

  /**
   * Set the current position in the node set.
   *
   * @param i Must be a valid index greater
   * than or equal to zero and less than m_cachedNodes.size().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean isMutable()

  /**
   * Tells if this iterator can have nodes added to it or set via
   * the <code>setItem(int node, int index)</code> method.
   *
   * @return True if the nodelist can be mutated.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setShouldCacheNodes(boolean b)

  /**
   * If setShouldCacheNodes(true) is called, then nodes will
   * be cached.  They are not cached by default.
   *
   * @param b True if this iterator should cache nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final int getCurrentPos()

  /**
   * Get the current position, which is one less than
   * the next nextNode() call will retrieve.  i.e. if
   * you call getCurrentPos() and the return is 0, the next
   * fetch will take place at index 1.
   *
   * @return A value greater than or equal to zero that indicates the next
   * node position to fetch.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected void setNextPosition(int next)

  /**
   * Set the next position index of this iterator.
   *
   * @param next A value greater than or equal to zero that indicates the next
   * node position to fetch.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setRoot(int context, Object environment)

  /**
   * Initialize the context values for this expression
   * after it is cloned.
   *
   * @param context The XPath runtime context for this
   * transformation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean getIsTopLevel()

  /**
   * Get if this is an iterator at the upper level of
   * the XPath.
   *
   * @return true if this location path is at the top level of the
   *          expression.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setIsTopLevel(boolean b)

  /**
   * Set if this is an iterator at the upper level of
   * the XPath.
   *
   * @param b true if this location path is at the top level of the
   *          expression.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean bool(XPathContext xctxt)

  /**
   * Evaluate this operation directly to a boolean.
   *
   * @param xctxt The runtime execution context.
   *
   * @return The result of the operation as a boolean.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean isNodesetExpr()

  /**
   * Tell if the expression is a nodeset expression.
   *
   * @return true if the expression can be represented as a nodeset.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTMIterator asIterator(
          XPathContext xctxt, int contextNode)

  /**
   * Given an select expression and a context, evaluate the XPath
   * and return the resulting iterator.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void executeCharsToContentHandler(
          XPathContext xctxt, org.xml.sax.ContentHandler handler)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   * @param handler The target content handler.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute this iterator, meaning create a clone that can
   * store state, and initialize it for fast execution from
   * the current runtime state.  When this is called, no actual
   * query from the current context node is performed.
   *
   * @param xctxt The XPath execution context.
   *
   * @return An XNodeSet reference that holds this iterator.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTMManager getDTMManager()

  /**
   * Get an instance of the DTMManager.  Since a node
   * iterator may be passed without a DTMManager, this allows the
   * caller to easily get the DTMManager using just the iterator.
   *
   * @return a non-null DTMManager reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTM getDTM(int nodeHandle)

  /**
   * Get an instance of a DTM that "owns" a node handle.  Since a node
   * iterator may be passed without a DTMManager, this allows the
   * caller to easily get the DTM using just the iterator.
   *
   * @param nodeHandle the nodeHandle.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setEnvironment(Object environment)

  /**
   * Set the environment in which this iterator operates, which should provide:
   * a node (the context node... same value as "root" defined below)
   * a pair of non-zero positive integers (the context position and the context size)
   * a set of variable bindings
   * a function library
   * the set of namespace declarations in scope for the expression.
   *
   * <p>At this time the exact implementation of this environment is application
   * dependent.  Probably a proper interface will be created fairly soon.</p>
   *
   * @param environment The environment object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected LocPathIterator(
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected LocPathIterator(Compiler compiler, int opPos, int analysis)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected LocPathIterator(PrefixResolver nscontext)

  /**
   * Create a LocPathIterator object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected LocPathIterator()

  /**
   * Create a LocPathIterator object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
public abstract class LocPathIterator extends PredicatedNodeTest

/**
 * This class extends NodeSetDTM, which implements NodeIterator,
 * and fetches nodes one at a time in document order based on a XPath
 * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a>.
 *
 * <p>If setShouldCacheNodes(true) is called,
 * as each node is iterated via nextNode(), the node is also stored
 * in the NodeVector, so that previousNode() can easily be done, except in
 * the case where the LocPathIterator is "owned" by a UnionPathIterator,
 * in which case the UnionPathIterator will cache the nodes.</p>
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  protected int m_analysis = 0x00000000;

//  /**
//   * The analysis pattern built by the WalkerFactory.
//   * TODO: Move to LocPathIterator.
//   * @see com.sun.org.apache.xpath.internal.axes.WalkerFactory
//   * @serial
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getAxis()

  /**
   * Returns the axis being iterated, if it is known.
   *
   * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple
   * types.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean isDocOrdered()

  /**
   * Returns true if all the nodes in the iteration well be returned in document
   * order.
   *
   * @return true as a default.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected XPathContext m_execContext;

  /**
   * The XPathContext reference, needed for execution of many
   * operations.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  private PrefixResolver m_prefixResolver;

  /**
   * Fast access to the current prefix resolver.  It isn't really
   * clear that this is needed.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected int m_pos = 0;

  /**
   * The current position of the context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected int m_currentContextNode = DTM.NULL;

  /**
   * The node context from where the expression is being
   * executed from (i.e. for current() support).  Different
   * from m_context in that this is the context for the entire
   * expression, rather than the context for the subexpression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected int m_context = DTM.NULL;

  /**
   * The context node for this iterator, which doesn't change through
   * the course of the iteration.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient public int m_lastFetched = DTM.NULL;

  /** The last node that was fetched, usually by nextNode. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  private boolean m_isTopLevel = false;

  /**
   * Value determined at compile time, indicates that this is an
   * iterator at the top level of the expression, rather than inside
   * a predicate.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient int m_stackFrame = -1;

  /**
   * The stack frame index for this iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected DTM m_cdtm;

  /**
   * The dtm of the context node.  Careful about using this... it may not
   * be the dtm of the current node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  transient protected IteratorPool m_clones = new IteratorPool(this);

  /**
   * The pool for cloned iterators.  Iterators need to be cloned
   * because the hold running state, and thus the original iterator
   * expression from the stylesheet pool can not be used.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void callVisitors(ExpressionOwner owner, XPathVisitor visitor)

  /**
   * @see com.sun.org.apache.xpath.internal.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  void setAnalysis(int a)

//  /**
//   * Set the analysis pattern built by the WalkerFactory.
//   *
//   * @param a The analysis pattern built by the WalkerFactory.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  int getAnalysis()

//  /**
//   * Get the analysis pattern built by the WalkerFactory.
//   *
//   * @return The analysis pattern built by the WalkerFactory.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final PrefixResolver getPrefixResolver()

  /**
   * Return the saved reference to the prefix resolver that
   * was in effect when this iterator was created.
   *
   * @return The prefix resolver or this iterator, which may be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  public void setRoot(int n)

//  /**
//   * Set the current context node for this iterator.
//   *
//   * @param n Must be a non-null reference to the node context.
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final void setCurrentContextNode(int n)

  /**
   * Set the current context node for this iterator.
   *
   * @param n Must be a non-null reference to the node context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final int getCurrentContextNode()

  /**
   * The node context from where the expression is being
   * executed from (i.e. for current() support).
   *
   * @return The top-level node context of the entire expression.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final int getContext()

  /**
   * The node context for the iterator.
   *
   * @return The node context, same as getRoot().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final XPathContext getXPathContext()

  /**
   * The XPath execution context we are operating on.
   *
   * @return XPath execution context this iterator is operating on,
   * or null if setRoot has not been called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final boolean getFoundLast()

  /**
   * Tells if we've found the last node yet.
   *
   * @return true if the last nextNode returned null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void runTo(int index)

  /**
   * If an index is requested, NodeSetDTM will call this method
   * to run the iterator to the index.  By default this sets
   * m_next to the index.  If the index argument is -1, this
   * signals that the iterator should be run to the end.
   *
   * @param index The index to run to, or -1 if the iterator
   * should run to the end.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getCurrentNode()

  /**
   * Return the last fetched node.  Needed to support the UnionPathIterator.
   *
   * @return The last fetched node, or null if the last fetch was null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected int returnNextNode(int nextNode)

  /**
   * Bottleneck the return of a next node, to make returns
   * easier from nextNode().
   *
   * @param nextNode The next node found, may be null.
   *
   * @return The same node that was passed as an argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public abstract int nextNode();

  /**
   *  Returns the next node in the set and advances the position of the
   * iterator in the set. After a NodeIterator is created, the first call
   * to nextNode() returns the first node in the set.
   * @return  The next <code>Node</code> in the set being iterated over, or
   *   <code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
//  public Object clone() throws CloneNotSupportedException

//  /**
//   * Get a cloned LocPathIterator that holds the same
//   * position as this iterator.
//   *
//   * @return A clone of this iterator that holds the same node position.
//   *
//   * @throws CloneNotSupportedException
//   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTMIterator cloneWithReset() throws CloneNotSupportedException

  /**
   * Get a cloned Iterator that is reset to the beginning
   * of the query.
   *
   * @return A cloned NodeIterator set of the start of the query.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void reset()

  /**
   * Reset the iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void detach()

  /**
   *  Detaches the iterator from the set which it iterated over, releasing
   * any computational resources and placing the iterator in the INVALID
   * state. After<code>detach</code> has been invoked, calls to
   * <code>nextNode</code> or<code>previousNode</code> will raise the
   * exception INVALID_STATE_ERR.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void allowDetachToRelease(boolean allowRelease)

  /**
   * Specify if it's OK for detach to release the iterator for reuse.
   *
   * @param allowRelease true if it is OK for detach to release this iterator
   * for pooling.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected boolean m_allowDetach = true;

  /** Control over whether it is OK for detach to reset the iterator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean getExpandEntityReferences()

  /**
   *  The value of this flag determines whether the children of entity
   * reference nodes are visible to the iterator. If false, they will be
   * skipped over.
   * <br> To produce a view of the document that has entity references
   * expanded and does not expose the entity reference node itself, use the
   * whatToShow flags to hide the entity reference node and set
   * expandEntityReferences to true when creating the iterator. To produce
   * a view of the document that has entity reference nodes but no entity
   * expansion, use the whatToShow flags to show the entity reference node
   * and set expandEntityReferences to false.
   *
   * @return Always true, since entity reference nodes are not
   * visible in the XPath model.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getRoot()

  /**
   * The root node of the Iterator, as specified when it was created.
   *
   * @return The "root" of this iterator, which, in XPath terms,
   * is the node context for this iterator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTMFilter getFilter()

  /**
   *  The filter used to screen nodes.  Not used at this time,
   * this is here only to fullfill the DOM NodeIterator
   * interface.
   *
   * @return Always null.
   * @see org.w3c.dom.traversal.NodeIterator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getWhatToShow()

  /**
   * This attribute determines which node types are presented via the
   * iterator. The available set of constants is defined in the
   * <code>NodeFilter</code> interface.
   *
   * <p>This is somewhat useless at this time, since it doesn't
   * really return information that tells what this iterator will
   * show.  It is here only to fullfill the DOM NodeIterator
   * interface.</p>
   *
   * @return For now, always NodeFilter.SHOW_ALL & ~NodeFilter.SHOW_ENTITY_REFERENCE.
   * @see org.w3c.dom.traversal.NodeIterator
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int previousNode()

  /**
   *  Returns the previous node in the set and moves the position of the
   * iterator backwards in the set.
   * @return  The previous <code>Node</code> in the set being iterated over,
   *   or<code>null</code> if there are no more members in that set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean isFresh()

  /**
   * Tells if this NodeSetDTM is "fresh", in other words, if
   * the first nextNode() that is called will return the
   * first node in the set.
   *
   * @return true of nextNode has not been called.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getLength()

  /**
   *  The number of nodes in the list. The range of valid child node indices
   * is 0 to <code>length-1</code> inclusive.
   *
   * @return The number of nodes in the list, always greater or equal to zero.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setItem(int node, int index)

  /**
   * Sets the node at the specified index of this vector to be the
   * specified node. The previous component at that position is discarded.
   *
   * <p>The index must be a value greater than or equal to 0 and less
   * than the current size of the vector.
   * The iterator must be in cached mode.</p>
   *
   * <p>Meant to be used for sorted iterators.</p>
   *
   * @param node Node to set
   * @param index Index of where to set the node
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int item(int index)

  /**
   *  Returns the <code>index</code> th item in the collection. If
   * <code>index</code> is greater than or equal to the number of nodes in
   * the list, this returns <code>null</code> .
   * @param index  Index into the collection.
   * @return  The node at the <code>index</code> th position in the
   *   <code>NodeList</code> , or <code>null</code> if that is not a valid
   *   index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int size()

  /**
   * Get the length of the cached nodes.
   *
   * <p>Note: for the moment at least, this only returns
   * the size of the nodes that have been fetched to date,
   * it doesn't attempt to run to the end to make sure we
   * have found everything.  This should be reviewed.</p>
   *
   * @return The size of the current cache list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void incrementCurrentPos()

  /**
   * Increment the current position in the node set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setCurrentPos(int i)

  /**
   * Set the current position in the node set.
   *
   * @param i Must be a valid index greater
   * than or equal to zero and less than m_cachedNodes.size().
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean isMutable()

  /**
   * Tells if this iterator can have nodes added to it or set via
   * the <code>setItem(int node, int index)</code> method.
   *
   * @return True if the nodelist can be mutated.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setShouldCacheNodes(boolean b)

  /**
   * If setShouldCacheNodes(true) is called, then nodes will
   * be cached.  They are not cached by default.
   *
   * @param b True if this iterator should cache nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public final int getCurrentPos()

  /**
   * Get the current position, which is one less than
   * the next nextNode() call will retrieve.  i.e. if
   * you call getCurrentPos() and the return is 0, the next
   * fetch will take place at index 1.
   *
   * @return A value greater than or equal to zero that indicates the next
   * node position to fetch.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected void setNextPosition(int next)

  /**
   * Set the next position index of this iterator.
   *
   * @param next A value greater than or equal to zero that indicates the next
   * node position to fetch.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setRoot(int context, Object environment)

  /**
   * Initialize the context values for this expression
   * after it is cloned.
   *
   * @param context The XPath runtime context for this
   * transformation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean getIsTopLevel()

  /**
   * Get if this is an iterator at the upper level of
   * the XPath.
   *
   * @return true if this location path is at the top level of the
   *          expression.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setIsTopLevel(boolean b)

  /**
   * Set if this is an iterator at the upper level of
   * the XPath.
   *
   * @param b true if this location path is at the top level of the
   *          expression.
   * @xsl.usage advanced
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean bool(XPathContext xctxt)

  /**
   * Evaluate this operation directly to a boolean.
   *
   * @param xctxt The runtime execution context.
   *
   * @return The result of the operation as a boolean.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public boolean isNodesetExpr()

  /**
   * Tell if the expression is a nodeset expression.
   *
   * @return true if the expression can be represented as a nodeset.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTMIterator asIterator(
          XPathContext xctxt, int contextNode)

  /**
   * Given an select expression and a context, evaluate the XPath
   * and return the resulting iterator.
   *
   * @param xctxt The execution context.
   * @param contextNode The node that "." expresses.
   * @throws TransformerException thrown if the active ProblemListener decides
   * the error condition is severe enough to halt processing.
   *
   * @throws javax.xml.transform.TransformerException
   * @xsl.usage experimental
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void executeCharsToContentHandler(
          XPathContext xctxt, org.xml.sax.ContentHandler handler)

  /**
   * Execute an expression in the XPath runtime context, and return the
   * result of the expression.
   *
   *
   * @param xctxt The XPath runtime context.
   * @param handler The target content handler.
   *
   * @return The result of the expression in the form of a <code>XObject</code>.
   *
   * @throws javax.xml.transform.TransformerException if a runtime exception
   *         occurs.
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public XObject execute(XPathContext xctxt)

  /**
   * Execute this iterator, meaning create a clone that can
   * store state, and initialize it for fast execution from
   * the current runtime state.  When this is called, no actual
   * query from the current context node is performed.
   *
   * @param xctxt The XPath execution context.
   *
   * @return An XNodeSet reference that holds this iterator.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTMManager getDTMManager()

  /**
   * Get an instance of the DTMManager.  Since a node
   * iterator may be passed without a DTMManager, this allows the
   * caller to easily get the DTMManager using just the iterator.
   *
   * @return a non-null DTMManager reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public DTM getDTM(int nodeHandle)

  /**
   * Get an instance of a DTM that "owns" a node handle.  Since a node
   * iterator may be passed without a DTMManager, this allows the
   * caller to easily get the DTM using just the iterator.
   *
   * @param nodeHandle the nodeHandle.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public void setEnvironment(Object environment)

  /**
   * Set the environment in which this iterator operates, which should provide:
   * a node (the context node... same value as "root" defined below)
   * a pair of non-zero positive integers (the context position and the context size)
   * a set of variable bindings
   * a function library
   * the set of namespace declarations in scope for the expression.
   *
   * <p>At this time the exact implementation of this environment is application
   * dependent.  Probably a proper interface will be created fairly soon.</p>
   *
   * @param environment The environment object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  public int getAnalysisBits()

  /**
   * Get the analysis bits for this walker, as defined in the WalkerFactory.
   * @return One of WalkerFactory#BIT_DESCENDANT, etc.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected LocPathIterator(
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected LocPathIterator(Compiler compiler, int opPos, int analysis)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected LocPathIterator(PrefixResolver nscontext)

  /**
   * Create a LocPathIterator object.
   *
   * @param nscontext The namespace context for this iterator,
   * should be OK if null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
  protected LocPathIterator()

  /**
   * Create a LocPathIterator object.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/LocPathIterator.java
public abstract class LocPathIterator extends PredicatedNodeTest

/**
 * This class extends NodeSetDTM, which implements NodeIterator,
 * and fetches nodes one at a time in document order based on a XPath
 * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a>.
 *
 * <p>If setShouldCacheNodes(true) is called,
 * as each node is iterated via nextNode(), the node is also stored
 * in the NodeVector, so that previousNode() can easily be done, except in
 * the case where the LocPathIterator is "owned" by a UnionPathIterator,
 * in which case the UnionPathIterator will cache the nodes.</p>
 * @xsl.usage advanced
 */
