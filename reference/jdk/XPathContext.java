_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private final void releaseDTMXRTreeFrags(){

  /**
   * Cleans DTMXRTreeFrag objects by removing references
   * to DTM and XPathContext objects.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMXRTreeFrag getDTMXRTreeFrag(int dtmIdentity){

  /**
   * Gets DTMXRTreeFrag object if one has already been created.
   * Creates new DTMXRTreeFrag object and adds to m_DTMXRTreeFrags  HashMap,
   * otherwise.
   * @param dtmIdentity
   * @return DTMXRTreeFrag
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void popRTFContext()

  /** Pop the RTFDTM's context mark. This discards any RTFs added after the last
   * mark was set.
   *
   * If there is no RTF DTM, there's nothing to pop so this
   * becomes a no-op. If pushes were issued before this was called, we count on
   * the fact that popRewindMark is defined such that overpopping just resets
   * to empty.
   *
   * Complicating factor: We need to handle the case of popping back to a previous
   * RTF DTM, if one of the weird produce-an-RTF-to-build-an-RTF cases arose.
   * Basically: If pop says this DTM is now empty, then return to the previous
   * if one exists, in whatever state we left it in. UGLY, but hopefully the
   * situation which forces us to consider this will arise exceedingly rarely.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void pushRTFContext()

  /** Push the RTFDTM's context mark, to allows discarding RTFs added after this
   * point. (If it doesn't exist we don't push, since we might still be able to
   * get away with not creating it. That requires that excessive pops be harmless.)
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM getRTFDTM()

  /**
   * Get a DTM to be used as a container for a dynamic Result Tree
   * Fragment. This will always be an instance of (derived from? equivalent to?)
   * SAX2DTM, since each RTF is constructed by temporarily redirecting our SAX
   * output to it. It may be a single DTM containing for multiple fragments,
   * if the implementation supports that.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM getGlobalRTFDTM()

 /**
   * Get a DTM to be used as a container for a global Result Tree
   * Fragment. This will always be an instance of (derived from? equivalent to?)
   * SAX2DTM, since each RTF is constructed by temporarily redirecting our SAX
   * output to it. It may be a single DTM containing for multiple fragments,
   * if the implementation supports that.
   *
   * Note: The distinction between this method and getRTFDTM() is that the latter
   * allocates space from the dynamic variable stack (m_rtfdtm_stack), which may
   * be pruned away again as the templates which defined those variables are exited.
   * Global variables may be bound late (see XUnresolvedVariable), and never want to
   * be discarded, hence we need to allocate them separately and don't actually need
   * a stack to track them.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public final XObject getVariableOrParam(com.sun.org.apache.xml.internal.utils.QName qname)

    /**
     * Get a variable based on it's qualified name.
     * @param qname The qualified name of the variable.
     * @return The evaluated value of the variable.
     * @throws javax.xml.transform.TransformerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public String toString(org.w3c.dom.Node n)

    /**
     * Get the value of a node as a string.
     * @param n Node to be converted to a string.  May be null.
     * @return value of n as a string, or an empty string if n is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public double toNumber(org.w3c.dom.Node n)

    /**
     * Get the value of a node as a number.
     * @param n Node to be converted to a number.  May be null.
     * @return value of n as a number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public ErrorListener getErrorListener()

    /**
     * Get the error listener.
     * @return The registered error listener.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public org.w3c.dom.traversal.NodeIterator getContextNodes()

    /**
     * Get the current context node list.
     * @return An iterator for the current context list, as
     * defined in XSLT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public org.w3c.dom.Node getContextNode()

    /**
     * Get the current context node.
     * @return The current context node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
     public DTMManager getDTMManager()

    /**
     * Return the DTMManager object.  Though XPathContext context extends
     * the DTMManager, it really is a proxy for the real DTMManager.  If a
     * caller needs to make a lot of calls to the DTMManager, it is faster
     * if it gets the real one from this function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
     public XPathContext getXPathContext()

    /**
     * Return the XPathContext associated with this XPathExpressionContext.
     * Extensions should use this judiciously and only when special processing
     * requirements cannot be met another way.  Consider requesting an enhancement
     * to the ExpressionContext interface to avoid having to call this method.
     * @return the XPathContext associated with this XPathExpressionContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public ExpressionContext getExpressionContext()

  /**
   * The the expression context for extensions for this context.
   *
   * @return An object that implements the ExpressionContext.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final DTMIterator getContextNodes()

  /**
   * Get the current context node list.
   * @return An iterator for the current context list, as
   * defined in XSLT.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getContextNode()

  /**
   * Get the current context node.
   * @return The current context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public com.sun.org.apache.xpath.internal.axes.SubContextList getCurrentNodeList()

  /**
   * Get the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>
   * as defined by the XSLT spec.
   *
   * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public SubContextList getSubContextList()

  /**
   * Get the current axes iterator, or return null if none.
   *
   * @return the sub-context node list.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popSubContextList()

  /**
   * Pop the last pushed axes iterator.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushSubContextList(SubContextList iter)

  /**
   * Push a TreeWalker on the stack.
   *
   * @param iter A sub-context AxesWalker.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Stack m_axesIteratorStack = new Stack();

  /**
   * Stack of AxesIterators.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popNamespaceContext()

  /**
   * Pop the current namespace context for the xpath.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushNamespaceContextNull()

  /**
   * Just increment the namespace contest stack, so that setNamespaceContext
   * can be used on the slot.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushNamespaceContext(PrefixResolver pr)

  /**
   * Push a current namespace context for the xpath.
   *
   * @param pr the prefix resolver to be used for resolving prefixes to
   *         namespace URLs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void setNamespaceContext(PrefixResolver pr)

  /**
   * Get the current namespace context for the xpath.
   *
   * @param pr the prefix resolver to be used for resolving prefixes to
   *         namespace URLs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final PrefixResolver getNamespaceContext()

  /**
   * Get the current namespace context for the xpath.
   *
   * @return the current prefix resolver for resolving prefixes to
   *         namespace URLs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popCurrentExpressionNode()

  /**
   * Pop the current node that is the expression's context
   * (i.e. for current() support).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushCurrentExpressionNode(int n)

  /**
   * Set the current node that is the expression's context (i.e. for current() support).
   *
   * @param n The sub-expression node to be current.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getCurrentExpressionNode()

  /**
   * Get the current node that is the expression's context (i.e. for current() support).
   *
   * @return The current sub-expression node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private IntStack m_currentExpressionNodes = new IntStack(RECURSIONLIMIT);

  /** A stack of the current sub-expression nodes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private NodeVector m_predicateRoots = new NodeVector();

  /** A stack of the current sub-expression nodes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private NodeVector m_iteratorRoots = new NodeVector();

  /** A stack of the current sub-expression nodes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getIteratorRoot()

  /**
   * Get the current location path iterator root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popIteratorRoot()

  /**
   * Pop the current location path iterator root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushIteratorRoot(int n)

  /**
   * Set the current location path iterator root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getPredicateRoot()

  /**
   * Get the current predicate root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popPredicateRoot()

  /**
   * Pop the current predicate root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushPredicateRoot(int n)

  /**
   * Set the current predicate root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popCurrentNode()

  /**
   * Pop the current context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushCurrentNode(int n)

  /**
   * Set the current context node.
   *
   * @param n the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popExpressionState()

  /**
   * Pop the current context node, expression node, and prefix resolver.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushExpressionState(int cn, int en, PrefixResolver nc)

  /**
   * Push the current context node, expression node, and prefix resolver.
   *
   * @param cn the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   * @param en the sub-expression context node.
   * @param nc the namespace context (prefix resolver.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popCurrentNodeAndExpression()

  /**
   * Set the current context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushCurrentNodeAndExpression(int cn, int en)

  /**
   * Set the current context node and expression node.
   *
   * @param cn the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   * @param en the sub-expression context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getCurrentNode()

  /**
   * Get the current context node.
   *
   * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private IntStack m_currentNodes = new IntStack(RECURSIONLIMIT);

  /** The stack of <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a> objects.
   *  Not to be confused with the current node list.  %REVIEW% Note that there
   *  are no bounds check and resize for this stack, so if it is blown, it's all
   *  over.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public static final int RECURSIONLIMIT = (1024*4);

  /**
   * The amount to use for stacks that record information during the
   * recursive execution.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popContextNodeList()

  /**
   * Pop the current context node list.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushContextNodeList(DTMIterator nl)

  /**
   * Set the current context node list.
   *
   * @param nl the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>,
   * also referred to here as a <term>context node list</term>.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final DTMIterator getContextNodeList()

  /**
   * Get the current context node list.
   *
   * @return  the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>,
   * also referred to here as a <term>context node list</term>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Stack m_contextNodeLists = new Stack();

  /**
   * The current context node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  // private static XSLMessages m_XSLMessages = new XSLMessages();

  /** Misnamed string manager for XPath messages.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setPrimaryReader(XMLReader reader)

  /**
   * Set primary XMLReader associated with this execution context.
   *
   * @param reader The reader of the primary source tree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final XMLReader getPrimaryReader()

  /**
   * Get primary XMLReader associated with this execution context.
   *
   * @return The reader of the primary source tree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public XMLReader m_primaryReader;

  /** The reader of the primary source tree.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setURIResolver(URIResolver resolver)

  /**
   * Set the URIResolver associated with this execution context.
   *
   * @param resolver the URIResolver to be associated with this
   *        execution context, may be null to clear an already set resolver.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final URIResolver getURIResolver()

  /**
   * Get the URIResolver associated with this execution context.
   *
   * @return a URI resolver, which may be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private URIResolver m_uriResolver;

  /** The TrAX URI Resolver for resolving URIs from the document(...)
   *  function to source tree nodes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setErrorListener(ErrorListener listener) throws IllegalArgumentException

  /**
   * Set the ErrorListener where errors and warnings are to be reported.
   *
   * @param listener A non-null ErrorListener reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final ErrorListener getErrorListener()

  /**
   * Get the ErrorListener where errors and warnings are to be reported.
   *
   * @return A non-null ErrorListener reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private ErrorListener m_defaultErrorListener;

  /** A default ErrorListener in case our m_errorListener was not specified and our
   *  owner either does not have an ErrorListener or has a null one.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private ErrorListener m_errorListener;

  /** The ErrorListener where errors and warnings are to be reported.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setSourceTreeManager(SourceTreeManager mgr)

  /**
   * Set the SourceTreeManager associated with this execution context.
   *
   * @param mgr the SourceTreeManager to be associated with this
   *        execution context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final SourceTreeManager getSourceTreeManager()

  /**
   * Get the SourceTreeManager associated with this execution context.
   *
   * @return the SourceTreeManager associated with this execution context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private SourceTreeManager m_sourceTreeManager = new SourceTreeManager();

  /** The source tree manager, which associates Source objects to source
   *  tree nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void setVarStack(VariableStack varStack)

  /**
   * Get the variable stack, which is in charge of variables and
   * parameters.
   *
   * @param varStack non-null reference to the variable stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final VariableStack getVarStack()

  /**
   * Get the variable stack, which is in charge of variables and
   * parameters.
   *
   * @return the variable stack, which should not be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private VariableStack m_variableStacks = new VariableStack();

  /**
   * The stack of Variable stacks.  A VariableStack will be
   * pushed onto this stack for each template invocation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public Object getOwnerObject()

  /**
   * Get the "owner" context of this context, which should be,
   * in the case of XSLT, the Transformer object.  This is needed
   * so that XSLT functions can get the Transformer.
   * @return The owner object passed into the constructor, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Method m_ownerGetErrorListener;

  /** The owner context of this XPathContext.  In the case of XSLT, this will be a
   *  Transformer object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Object m_owner;

  /** The owner context of this XPathContext.  In the case of XSLT, this will be a
   *  Transformer object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public SourceLocator getSAXLocator()

  /**
   * Get the current locater in the stylesheet.
   *
   * @return The location within the stylesheet, or null if not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void popSAXLocator()

  /**
   * Pop the current locater.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void pushSAXLocatorNull()

  /**
   * Push a slot on the locations stack so that setSAXLocator can be
   * repeatedly called.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void pushSAXLocator(SourceLocator location)

  /**
   * Set the current locater in the stylesheet.
   *
   * @param location The location within the stylesheet.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setSAXLocator(SourceLocator location)

  /**
   * Set the current locater in the stylesheet.
   *
   * @param location The location within the stylesheet.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  ObjectStack m_saxLocations = new ObjectStack(RECURSIONLIMIT);

  /** The current stylesheet locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void reset()

  /**
   * Reset for new run.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public XPathContext(Object owner)

  /**
   **This constructor doesn't seem to be used anywhere -- huizhe wang**
   * Create an XPathContext instance.
   * @param owner Value that can be retrieved via the getOwnerObject() method.
   * @see #getOwnerObject
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public XPathContext()

  /**
   * Create an XPathContext instance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMIterator createDTMIterator(int node)

  /**
   * Create a new <code>DTMIterator</code> that holds exactly one node.
   *
   * @param node The node handle that the DTMIterator will iterate to.
   *
   * @return The newly created <code>DTMIterator</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMIterator createDTMIterator(int whatToShow,
          DTMFilter filter, boolean entityReferenceExpansion)

  /**
   * Create a new <code>DTMIterator</code> based only on a whatToShow and
   * a DTMFilter.  The traversal semantics are defined as the descendant
   * access.
   *
   * @param whatToShow This flag specifies which node types may appear in
   *   the logical view of the tree presented by the iterator. See the
   *   description of <code>NodeFilter</code> for the set of possible
   *   <code>SHOW_</code> values.These flags can be combined using
   *   <code>OR</code>.
   * @param filter The <code>NodeFilter</code> to be used with this
   *   <code>TreeWalker</code>, or <code>null</code> to indicate no filter.
   * @param entityReferenceExpansion The value of this flag determines
   *   whether entity reference nodes are expanded.
   *
   * @return The newly created <code>NodeIterator</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMIterator createDTMIterator(String xpathString,
          PrefixResolver presolver)

  /**
   * Create a new <code>DTMIterator</code> based on an XPath
   * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or
   * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>.
   *
   * @param xpathString Must be a valid string expressing a
   * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or
   * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>.
   *
   * @param presolver An object that can resolve prefixes to namespace URLs.
   *
   * @return The newly created <code>DTMIterator</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMIterator createDTMIterator(Object xpathCompiler, int pos)

  /**
   * Create a new <code>DTMIterator</code> based on an XPath
   * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or
   * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>.
   *
   * @param xpathCompiler ??? Somehow we need to pass in a subpart of the
   * expression.  I hate to do this with strings, since the larger expression
   * has already been parsed.
   *
   * @param pos The position in the expression.
   * @return The newly created <code>DTMIterator</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public boolean release(DTM dtm, boolean shouldHardDelete)

  /**
   * Release a DTM either to a lru pool, or completely remove reference.
   * DTMs without system IDs are always hard deleted.
   * State: experimental.
   *
   * @param dtm The DTM to be released.
   * @param shouldHardDelete True if the DTM should be removed no matter what.
   * @return true if the DTM was removed, false if it was put back in a lru pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM createDocumentFragment()

  /**
   * Creates an empty <code>DocumentFragment</code> object.
   * @return A new <code>DocumentFragment handle</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public int getDTMIdentity(DTM dtm)

  /**
   * %TBD% Doc
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public int getDTMHandleFromNode(org.w3c.dom.Node node)

  /**
   * Given a W3C DOM node, try and return a DTM handle.
   * Note: calling this may be non-optimal.
   *
   * @param node Non-null reference to a DOM node.
   *
   * @return a valid DTM handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM getDTM(int nodeHandle)

  /**
   * Get an instance of a DTM that "owns" a node handle.
   *
   * @param nodeHandle the nodeHandle.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM getDTM(javax.xml.transform.Source source, boolean unique,
                    DTMWSFilter wsfilter,
                    boolean incremental,
                    boolean doIndexing)

  /**
   * Get an instance of a DTM, loaded with the content from the
   * specified source.  If the unique flag is true, a new instance will
   * always be returned.  Otherwise it is up to the DTMManager to return a
   * new instance or an instance that it already created and may be being used
   * by someone else.
   * (I think more parameters will need to be added for error handling, and entity
   * resolution).
   *
   * @param source the specification of the source object, which may be null,
   *               in which case it is assumed that node construction will take
   *               by some other means.
   * @param unique true if the returned DTM must be unique, probably because it
   * is going to be mutated.
   * @param wsfilter Enables filtering of whitespace nodes, and may be null.
   * @param incremental true if the construction should try and be incremental.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public boolean isSecureProcessing()

  /**
   * Return the state of the secure processing feature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setSecureProcessing(boolean flag)

  /**
   * Set the state of the secure processing feature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
   public DTMManager getDTMManager()

  /**
   * Return the DTMManager object.  Though XPathContext context extends
   * the DTMManager, it really is a proxy for the real DTMManager.  If a
   * caller needs to make a lot of calls to the DTMManager, it is faster
   * if it gets the real one from this function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  protected DTMManager m_dtmManager = null;

  /**
   * Though XPathContext context extends
   * the DTMManager, it really is a proxy for this object, which
   * is the real DTMManager.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private boolean m_isSecureProcessing = false;

  /**
   * state of the secure processing feature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private HashMap m_DTMXRTreeFrags = null;

  /**
   * HashMap of cached the DTMXRTreeFrag objects, which are identified by DTM IDs.
   * The object are just wrappers for DTMs which are used in  XRTreeFrag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private SAX2RTFDTM m_global_rtfdtm=null;

 /**
   * Most recent "reusable" DTM for Global Result Tree Fragments. No stack is
   * required since we're never going to pop these.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Vector m_rtfdtm_stack=null;

  /**
   * Stack of cached "reusable" DTMs for Result Tree Fragments.
   * This is a kluge to handle the problem of starting an RTF before
   * the old one is complete.
   *
   * %REVIEW% I'm using a Vector rather than Stack so we can reuse
   * the DTMs if the problem occurs multiple times. I'm not sure that's
   * really a net win versus discarding the DTM and starting a new one...
   * but the retained RTF DTM will have been tail-pruned so should be small.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
public class XPathContext extends DTMManager // implements ExpressionContext

/**
 * Default class for the runtime execution context for XPath.
 *
 * <p>This class extends DTMManager but does not directly implement it.</p>
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private final void releaseDTMXRTreeFrags(){

  /**
   * Cleans DTMXRTreeFrag objects by removing references
   * to DTM and XPathContext objects.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMXRTreeFrag getDTMXRTreeFrag(int dtmIdentity){

  /**
   * Gets DTMXRTreeFrag object if one has already been created.
   * Creates new DTMXRTreeFrag object and adds to m_DTMXRTreeFrags  HashMap,
   * otherwise.
   * @param dtmIdentity
   * @return DTMXRTreeFrag
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void popRTFContext()

  /** Pop the RTFDTM's context mark. This discards any RTFs added after the last
   * mark was set.
   *
   * If there is no RTF DTM, there's nothing to pop so this
   * becomes a no-op. If pushes were issued before this was called, we count on
   * the fact that popRewindMark is defined such that overpopping just resets
   * to empty.
   *
   * Complicating factor: We need to handle the case of popping back to a previous
   * RTF DTM, if one of the weird produce-an-RTF-to-build-an-RTF cases arose.
   * Basically: If pop says this DTM is now empty, then return to the previous
   * if one exists, in whatever state we left it in. UGLY, but hopefully the
   * situation which forces us to consider this will arise exceedingly rarely.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void pushRTFContext()

  /** Push the RTFDTM's context mark, to allows discarding RTFs added after this
   * point. (If it doesn't exist we don't push, since we might still be able to
   * get away with not creating it. That requires that excessive pops be harmless.)
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM getRTFDTM()

  /**
   * Get a DTM to be used as a container for a dynamic Result Tree
   * Fragment. This will always be an instance of (derived from? equivalent to?)
   * SAX2DTM, since each RTF is constructed by temporarily redirecting our SAX
   * output to it. It may be a single DTM containing for multiple fragments,
   * if the implementation supports that.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM getGlobalRTFDTM()

 /**
   * Get a DTM to be used as a container for a global Result Tree
   * Fragment. This will always be an instance of (derived from? equivalent to?)
   * SAX2DTM, since each RTF is constructed by temporarily redirecting our SAX
   * output to it. It may be a single DTM containing for multiple fragments,
   * if the implementation supports that.
   *
   * Note: The distinction between this method and getRTFDTM() is that the latter
   * allocates space from the dynamic variable stack (m_rtfdtm_stack), which may
   * be pruned away again as the templates which defined those variables are exited.
   * Global variables may be bound late (see XUnresolvedVariable), and never want to
   * be discarded, hence we need to allocate them separately and don't actually need
   * a stack to track them.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public final XObject getVariableOrParam(com.sun.org.apache.xml.internal.utils.QName qname)

    /**
     * Get a variable based on it's qualified name.
     * @param qname The qualified name of the variable.
     * @return The evaluated value of the variable.
     * @throws javax.xml.transform.TransformerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public String toString(org.w3c.dom.Node n)

    /**
     * Get the value of a node as a string.
     * @param n Node to be converted to a string.  May be null.
     * @return value of n as a string, or an empty string if n is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public double toNumber(org.w3c.dom.Node n)

    /**
     * Get the value of a node as a number.
     * @param n Node to be converted to a number.  May be null.
     * @return value of n as a number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public void setServicesMechnism(boolean flag) {

    /**
     * Set the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public boolean useServicesMechnism() {

    /**
     * Return the state of the services mechanism feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public ErrorListener getErrorListener()

    /**
     * Get the error listener.
     * @return The registered error listener.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public org.w3c.dom.traversal.NodeIterator getContextNodes()

    /**
     * Get the current context node list.
     * @return An iterator for the current context list, as
     * defined in XSLT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
    public org.w3c.dom.Node getContextNode()

    /**
     * Get the current context node.
     * @return The current context node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
     public DTMManager getDTMManager()

    /**
     * Return the DTMManager object.  Though XPathContext context extends
     * the DTMManager, it really is a proxy for the real DTMManager.  If a
     * caller needs to make a lot of calls to the DTMManager, it is faster
     * if it gets the real one from this function.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
     public XPathContext getXPathContext()

    /**
     * Return the XPathContext associated with this XPathExpressionContext.
     * Extensions should use this judiciously and only when special processing
     * requirements cannot be met another way.  Consider requesting an enhancement
     * to the ExpressionContext interface to avoid having to call this method.
     * @return the XPathContext associated with this XPathExpressionContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public ExpressionContext getExpressionContext()

  /**
   * The the expression context for extensions for this context.
   *
   * @return An object that implements the ExpressionContext.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final DTMIterator getContextNodes()

  /**
   * Get the current context node list.
   * @return An iterator for the current context list, as
   * defined in XSLT.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getContextNode()

  /**
   * Get the current context node.
   * @return The current context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public com.sun.org.apache.xpath.internal.axes.SubContextList getCurrentNodeList()

  /**
   * Get the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>
   * as defined by the XSLT spec.
   *
   * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public SubContextList getSubContextList()

  /**
   * Get the current axes iterator, or return null if none.
   *
   * @return the sub-context node list.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popSubContextList()

  /**
   * Pop the last pushed axes iterator.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushSubContextList(SubContextList iter)

  /**
   * Push a TreeWalker on the stack.
   *
   * @param iter A sub-context AxesWalker.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Stack m_axesIteratorStack = new Stack();

  /**
   * Stack of AxesIterators.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popNamespaceContext()

  /**
   * Pop the current namespace context for the xpath.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushNamespaceContextNull()

  /**
   * Just increment the namespace contest stack, so that setNamespaceContext
   * can be used on the slot.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushNamespaceContext(PrefixResolver pr)

  /**
   * Push a current namespace context for the xpath.
   *
   * @param pr the prefix resolver to be used for resolving prefixes to
   *         namespace URLs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void setNamespaceContext(PrefixResolver pr)

  /**
   * Get the current namespace context for the xpath.
   *
   * @param pr the prefix resolver to be used for resolving prefixes to
   *         namespace URLs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final PrefixResolver getNamespaceContext()

  /**
   * Get the current namespace context for the xpath.
   *
   * @return the current prefix resolver for resolving prefixes to
   *         namespace URLs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popCurrentExpressionNode()

  /**
   * Pop the current node that is the expression's context
   * (i.e. for current() support).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushCurrentExpressionNode(int n)

  /**
   * Set the current node that is the expression's context (i.e. for current() support).
   *
   * @param n The sub-expression node to be current.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getCurrentExpressionNode()

  /**
   * Get the current node that is the expression's context (i.e. for current() support).
   *
   * @return The current sub-expression node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private IntStack m_currentExpressionNodes = new IntStack(RECURSIONLIMIT);

  /** A stack of the current sub-expression nodes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private NodeVector m_predicateRoots = new NodeVector();

  /** A stack of the current sub-expression nodes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private NodeVector m_iteratorRoots = new NodeVector();

  /** A stack of the current sub-expression nodes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getIteratorRoot()

  /**
   * Get the current location path iterator root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popIteratorRoot()

  /**
   * Pop the current location path iterator root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushIteratorRoot(int n)

  /**
   * Set the current location path iterator root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getPredicateRoot()

  /**
   * Get the current predicate root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popPredicateRoot()

  /**
   * Pop the current predicate root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushPredicateRoot(int n)

  /**
   * Set the current predicate root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popCurrentNode()

  /**
   * Pop the current context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushCurrentNode(int n)

  /**
   * Set the current context node.
   *
   * @param n the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popExpressionState()

  /**
   * Pop the current context node, expression node, and prefix resolver.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushExpressionState(int cn, int en, PrefixResolver nc)

  /**
   * Push the current context node, expression node, and prefix resolver.
   *
   * @param cn the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   * @param en the sub-expression context node.
   * @param nc the namespace context (prefix resolver.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popCurrentNodeAndExpression()

  /**
   * Set the current context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushCurrentNodeAndExpression(int cn, int en)

  /**
   * Set the current context node and expression node.
   *
   * @param cn the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   * @param en the sub-expression context node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final int getCurrentNode()

  /**
   * Get the current context node.
   *
   * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private IntStack m_currentNodes = new IntStack(RECURSIONLIMIT);

  /** The stack of <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a> objects.
   *  Not to be confused with the current node list.  %REVIEW% Note that there
   *  are no bounds check and resize for this stack, so if it is blown, it's all
   *  over.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public static final int RECURSIONLIMIT = (1024*4);

  /**
   * The amount to use for stacks that record information during the
   * recursive execution.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void popContextNodeList()

  /**
   * Pop the current context node list.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void pushContextNodeList(DTMIterator nl)

  /**
   * Set the current context node list.
   *
   * @param nl the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>,
   * also referred to here as a <term>context node list</term>.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final DTMIterator getContextNodeList()

  /**
   * Get the current context node list.
   *
   * @return  the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>,
   * also referred to here as a <term>context node list</term>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Stack m_contextNodeLists = new Stack();

  /**
   * The current context node list.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  // private static XSLMessages m_XSLMessages = new XSLMessages();

  /** Misnamed string manager for XPath messages.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setPrimaryReader(XMLReader reader)

  /**
   * Set primary XMLReader associated with this execution context.
   *
   * @param reader The reader of the primary source tree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final XMLReader getPrimaryReader()

  /**
   * Get primary XMLReader associated with this execution context.
   *
   * @return The reader of the primary source tree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public XMLReader m_primaryReader;

  /** The reader of the primary source tree.    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setURIResolver(URIResolver resolver)

  /**
   * Set the URIResolver associated with this execution context.
   *
   * @param resolver the URIResolver to be associated with this
   *        execution context, may be null to clear an already set resolver.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final URIResolver getURIResolver()

  /**
   * Get the URIResolver associated with this execution context.
   *
   * @return a URI resolver, which may be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private URIResolver m_uriResolver;

  /** The TrAX URI Resolver for resolving URIs from the document(...)
   *  function to source tree nodes.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setErrorListener(ErrorListener listener) throws IllegalArgumentException

  /**
   * Set the ErrorListener where errors and warnings are to be reported.
   *
   * @param listener A non-null ErrorListener reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final ErrorListener getErrorListener()

  /**
   * Get the ErrorListener where errors and warnings are to be reported.
   *
   * @return A non-null ErrorListener reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private ErrorListener m_defaultErrorListener;

  /** A default ErrorListener in case our m_errorListener was not specified and our
   *  owner either does not have an ErrorListener or has a null one.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private ErrorListener m_errorListener;

  /** The ErrorListener where errors and warnings are to be reported.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setSourceTreeManager(SourceTreeManager mgr)

  /**
   * Set the SourceTreeManager associated with this execution context.
   *
   * @param mgr the SourceTreeManager to be associated with this
   *        execution context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final SourceTreeManager getSourceTreeManager()

  /**
   * Get the SourceTreeManager associated with this execution context.
   *
   * @return the SourceTreeManager associated with this execution context.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private SourceTreeManager m_sourceTreeManager = new SourceTreeManager();

  /** The source tree manager, which associates Source objects to source
   *  tree nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final void setVarStack(VariableStack varStack)

  /**
   * Get the variable stack, which is in charge of variables and
   * parameters.
   *
   * @param varStack non-null reference to the variable stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public final VariableStack getVarStack()

  /**
   * Get the variable stack, which is in charge of variables and
   * parameters.
   *
   * @return the variable stack, which should not be null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private VariableStack m_variableStacks = new VariableStack();

  /**
   * The stack of Variable stacks.  A VariableStack will be
   * pushed onto this stack for each template invocation.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public Object getOwnerObject()

  /**
   * Get the "owner" context of this context, which should be,
   * in the case of XSLT, the Transformer object.  This is needed
   * so that XSLT functions can get the Transformer.
   * @return The owner object passed into the constructor, or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Method m_ownerGetErrorListener;

  /** The owner context of this XPathContext.  In the case of XSLT, this will be a
   *  Transformer object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Object m_owner;

  /** The owner context of this XPathContext.  In the case of XSLT, this will be a
   *  Transformer object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public SourceLocator getSAXLocator()

  /**
   * Get the current locater in the stylesheet.
   *
   * @return The location within the stylesheet, or null if not known.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void popSAXLocator()

  /**
   * Pop the current locater.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void pushSAXLocatorNull()

  /**
   * Push a slot on the locations stack so that setSAXLocator can be
   * repeatedly called.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void pushSAXLocator(SourceLocator location)

  /**
   * Set the current locater in the stylesheet.
   *
   * @param location The location within the stylesheet.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setSAXLocator(SourceLocator location)

  /**
   * Set the current locater in the stylesheet.
   *
   * @param location The location within the stylesheet.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  ObjectStack m_saxLocations = new ObjectStack(RECURSIONLIMIT);

  /** The current stylesheet locator. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void reset()

  /**
   * Reset for new run.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public XPathContext(Object owner)

  /**
   **This constructor doesn't seem to be used anywhere -- huizhe wang**
   * Create an XPathContext instance.
   * @param owner Value that can be retrieved via the getOwnerObject() method.
   * @see #getOwnerObject
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public XPathContext()

  /**
   * Create an XPathContext instance.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMIterator createDTMIterator(int node)

  /**
   * Create a new <code>DTMIterator</code> that holds exactly one node.
   *
   * @param node The node handle that the DTMIterator will iterate to.
   *
   * @return The newly created <code>DTMIterator</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMIterator createDTMIterator(int whatToShow,
          DTMFilter filter, boolean entityReferenceExpansion)

  /**
   * Create a new <code>DTMIterator</code> based only on a whatToShow and
   * a DTMFilter.  The traversal semantics are defined as the descendant
   * access.
   *
   * @param whatToShow This flag specifies which node types may appear in
   *   the logical view of the tree presented by the iterator. See the
   *   description of <code>NodeFilter</code> for the set of possible
   *   <code>SHOW_</code> values.These flags can be combined using
   *   <code>OR</code>.
   * @param filter The <code>NodeFilter</code> to be used with this
   *   <code>TreeWalker</code>, or <code>null</code> to indicate no filter.
   * @param entityReferenceExpansion The value of this flag determines
   *   whether entity reference nodes are expanded.
   *
   * @return The newly created <code>NodeIterator</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMIterator createDTMIterator(String xpathString,
          PrefixResolver presolver)

  /**
   * Create a new <code>DTMIterator</code> based on an XPath
   * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or
   * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>.
   *
   * @param xpathString Must be a valid string expressing a
   * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or
   * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>.
   *
   * @param presolver An object that can resolve prefixes to namespace URLs.
   *
   * @return The newly created <code>DTMIterator</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTMIterator createDTMIterator(Object xpathCompiler, int pos)

  /**
   * Create a new <code>DTMIterator</code> based on an XPath
   * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or
   * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>.
   *
   * @param xpathCompiler ??? Somehow we need to pass in a subpart of the
   * expression.  I hate to do this with strings, since the larger expression
   * has already been parsed.
   *
   * @param pos The position in the expression.
   * @return The newly created <code>DTMIterator</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public boolean release(DTM dtm, boolean shouldHardDelete)

  /**
   * Release a DTM either to a lru pool, or completely remove reference.
   * DTMs without system IDs are always hard deleted.
   * State: experimental.
   *
   * @param dtm The DTM to be released.
   * @param shouldHardDelete True if the DTM should be removed no matter what.
   * @return true if the DTM was removed, false if it was put back in a lru pool.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM createDocumentFragment()

  /**
   * Creates an empty <code>DocumentFragment</code> object.
   * @return A new <code>DocumentFragment handle</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public int getDTMIdentity(DTM dtm)

  /**
   * %TBD% Doc
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public int getDTMHandleFromNode(org.w3c.dom.Node node)

  /**
   * Given a W3C DOM node, try and return a DTM handle.
   * Note: calling this may be non-optimal.
   *
   * @param node Non-null reference to a DOM node.
   *
   * @return a valid DTM handle.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM getDTM(int nodeHandle)

  /**
   * Get an instance of a DTM that "owns" a node handle.
   *
   * @param nodeHandle the nodeHandle.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public DTM getDTM(javax.xml.transform.Source source, boolean unique,
                    DTMWSFilter wsfilter,
                    boolean incremental,
                    boolean doIndexing)

  /**
   * Get an instance of a DTM, loaded with the content from the
   * specified source.  If the unique flag is true, a new instance will
   * always be returned.  Otherwise it is up to the DTMManager to return a
   * new instance or an instance that it already created and may be being used
   * by someone else.
   * (I think more parameters will need to be added for error handling, and entity
   * resolution).
   *
   * @param source the specification of the source object, which may be null,
   *               in which case it is assumed that node construction will take
   *               by some other means.
   * @param unique true if the returned DTM must be unique, probably because it
   * is going to be mutated.
   * @param wsfilter Enables filtering of whitespace nodes, and may be null.
   * @param incremental true if the construction should try and be incremental.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   *
   * @return a non-null DTM reference.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public boolean isSecureProcessing()

  /**
   * Return the state of the secure processing feature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  public void setSecureProcessing(boolean flag)

  /**
   * Set the state of the secure processing feature
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
   public DTMManager getDTMManager()

  /**
   * Return the DTMManager object.  Though XPathContext context extends
   * the DTMManager, it really is a proxy for the real DTMManager.  If a
   * caller needs to make a lot of calls to the DTMManager, it is faster
   * if it gets the real one from this function.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  protected DTMManager m_dtmManager = null;

  /**
   * Though XPathContext context extends
   * the DTMManager, it really is a proxy for this object, which
   * is the real DTMManager.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private boolean m_isSecureProcessing = false;

  /**
   * state of the secure processing feature.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private HashMap m_DTMXRTreeFrags = null;

  /**
   * HashMap of cached the DTMXRTreeFrag objects, which are identified by DTM IDs.
   * The object are just wrappers for DTMs which are used in  XRTreeFrag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private SAX2RTFDTM m_global_rtfdtm=null;

 /**
   * Most recent "reusable" DTM for Global Result Tree Fragments. No stack is
   * required since we're never going to pop these.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
  private Vector m_rtfdtm_stack=null;

  /**
   * Stack of cached "reusable" DTMs for Result Tree Fragments.
   * This is a kluge to handle the problem of starting an RTF before
   * the old one is complete.
   *
   * %REVIEW% I'm using a Vector rather than Stack so we can reuse
   * the DTMs if the problem occurs multiple times. I'm not sure that's
   * really a net win versus discarding the DTM and starting a new one...
   * but the retained RTF DTM will have been tail-pruned so should be small.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathContext.java
public class XPathContext extends DTMManager // implements ExpressionContext

/**
 * Default class for the runtime execution context for XPath.
 *
 * <p>This class extends DTMManager but does not directly implement it.</p>
 * @xsl.usage advanced
 */
