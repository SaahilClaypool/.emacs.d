_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
private void removeEventListener(){

/**
 * Remove m_contextNode to Event Listner to listen for Mutations Events
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
  private void addEventListener(){

/**
 * Add m_contextNode to Event Listner to listen for Mutations Events
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
  private boolean isNamespaceNode(Node node) {

/**
 * Given a node, determine if it is a namespace node.
 *
 * @param node
 *
 * @return boolean Returns true if this is a namespace node; otherwise, returns false.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
  private short getTypeFromXObject(XObject object) {

  /**
   * Given an XObject, determine the corresponding DOM XPath type
   *
   * @return type string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
  private String getTypeString(int type)

  /**
   * Given a request type, return the equivalent string.
   * For diagnostic purposes.
   *
   * @return type string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public void handleEvent(Event event) {

        /**
         * @see org.w3c.dom.events.EventListener#handleEvent(Event)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        static boolean isValidType( short type ) {

        /**
         * Check if the specified type is one of the supported types.
         * @param type The specified type
         *
         * @return true If the specified type is supported; otherwise, returns false.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public Node snapshotItem(int index) throws XPathException {

    /**
     * Returns the <code>index</code>th item in the snapshot collection. If
     * <code>index</code> is greater than or equal to the number of nodes in
     * the list, this method returns <code>null</code>. Unlike the iterator
     * result, the snapshot does not become invalid, but may not correspond
     * to the current document if it is mutated.
     * @param index Index into the snapshot collection.
     * @return The node at the <code>index</code>th position in the
     *   <code>NodeList</code>, or <code>null</code> if that is not a valid
     *   index.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>UNORDERED_NODE_SNAPSHOT_TYPE</code> or
     *   <code>ORDERED_NODE_SNAPSHOT_TYPE</code>.
     *
         * @see org.w3c.dom.xpath.XPathResult#snapshotItem(int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public Node iterateNext() throws XPathException, DOMException {

        /**
         * Iterates and returns the next node from the node set or
     * <code>null</code>if there are no more nodes.
     * @return Returns the next node.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>UNORDERED_NODE_ITERATOR_TYPE</code> or
     *   <code>ORDERED_NODE_ITERATOR_TYPE</code>.
     * @exception DOMException
     *   INVALID_STATE_ERR: The document has been mutated since the result was
     *   returned.
         * @see org.w3c.dom.xpath.XPathResult#iterateNext()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public int getSnapshotLength() throws XPathException {

        /**
         * The number of nodes in the result snapshot. Valid values for
     * snapshotItem indices are <code>0</code> to
     * <code>snapshotLength-1</code> inclusive.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>UNORDERED_NODE_SNAPSHOT_TYPE</code> or
     *   <code>ORDERED_NODE_SNAPSHOT_TYPE</code>.
     *
         * @see org.w3c.dom.xpath.XPathResult#getSnapshotLength()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public boolean getInvalidIteratorState() {

        /**
         * @see org.w3c.dom.xpath.XPathResult#getInvalidIteratorState()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public Node getSingleNodeValue() throws XPathException {

        /**
         * The value of this single node result, which may be <code>null</code>.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>ANY_UNORDERED_NODE_TYPE</code> or
     *   <code>FIRST_ORDERED_NODE_TYPE</code>.
     *
         * @see org.w3c.dom.xpath.XPathResult#getSingleNodeValue()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public boolean getBooleanValue() throws XPathException {

        /**
         * @see org.w3c.dom.xpath.XPathResult#getBooleanValue()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public String getStringValue() throws XPathException {

        /**
         * The value of this string result.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>STRING_TYPE</code>.
     *
         * @see org.w3c.dom.xpath.XPathResult#getStringValue()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public double getNumberValue() throws XPathException {

        /**
         *  The value of this number result.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>NUMBER_TYPE</code>.
         * @see org.w3c.dom.xpath.XPathResult#getNumberValue()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public short getResultType() {

        /**
         * @see org.w3c.dom.xpath.XPathResult#getResultType()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
         XPathResultImpl(short type, XObject result, Node contextNode, XPath xpath) {

        /**
         * Constructor for XPathResultImpl.
     *
     * For internal use only.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        private NodeList m_list = null;

        /**
     *  The list, if this is a snapshot type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        private NodeIterator m_iterator = null;;

        /**
     *  The iterator, if this is an iterator type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        final private Node m_contextNode;

    /**
     * Only used to attach a mutation event handler when specified
     * type is an iterator type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        final private short m_resultType;

        /**
     *  This the type specified by the user during construction.  Typically
         *  the constructor will be called by com.sun.org.apache.xpath.internal.XPath.evaluate().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        final private XPath m_xpath;

        /**
         * The xpath object that wraps the expression used for this result.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        final private XObject m_resultObj;

        /**
     *  The wrapped XObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
class XPathResultImpl implements XPathResult, EventListener {

/**
 *
 * The class provides an implementation XPathResult according
 * to the DOM L3 XPath Specification, Working Group Note 26 February 2004.
 *
 * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p>
 *
 * <p>The <code>XPathResult</code> interface represents the result of the
 * evaluation of an XPath expression within the context of a particular
 * node. Since evaluation of an XPath expression can result in various
 * result types, this object makes it possible to discover and manipulate
 * the type and value of the result.</p>
 *
 * <p>This implementation wraps an <code>XObject</code>.
 *
 * @see com.sun.org.apache.xpath.internal.objects.XObject
 * @see org.w3c.dom.xpath.XPathResult
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
private void removeEventListener(){

/**
 * Remove m_contextNode to Event Listner to listen for Mutations Events
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
  private void addEventListener(){

/**
 * Add m_contextNode to Event Listner to listen for Mutations Events
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
  private boolean isNamespaceNode(Node node) {

/**
 * Given a node, determine if it is a namespace node.
 *
 * @param node
 *
 * @return boolean Returns true if this is a namespace node; otherwise, returns false.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
  private short getTypeFromXObject(XObject object) {

  /**
   * Given an XObject, determine the corresponding DOM XPath type
   *
   * @return type string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
  private String getTypeString(int type)

  /**
   * Given a request type, return the equivalent string.
   * For diagnostic purposes.
   *
   * @return type string
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public void handleEvent(Event event) {

        /**
         * @see org.w3c.dom.events.EventListener#handleEvent(Event)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        static boolean isValidType( short type ) {

        /**
         * Check if the specified type is one of the supported types.
         * @param type The specified type
         *
         * @return true If the specified type is supported; otherwise, returns false.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public Node snapshotItem(int index) throws XPathException {

    /**
     * Returns the <code>index</code>th item in the snapshot collection. If
     * <code>index</code> is greater than or equal to the number of nodes in
     * the list, this method returns <code>null</code>. Unlike the iterator
     * result, the snapshot does not become invalid, but may not correspond
     * to the current document if it is mutated.
     * @param index Index into the snapshot collection.
     * @return The node at the <code>index</code>th position in the
     *   <code>NodeList</code>, or <code>null</code> if that is not a valid
     *   index.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>UNORDERED_NODE_SNAPSHOT_TYPE</code> or
     *   <code>ORDERED_NODE_SNAPSHOT_TYPE</code>.
     *
         * @see org.w3c.dom.xpath.XPathResult#snapshotItem(int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public Node iterateNext() throws XPathException, DOMException {

        /**
         * Iterates and returns the next node from the node set or
     * <code>null</code>if there are no more nodes.
     * @return Returns the next node.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>UNORDERED_NODE_ITERATOR_TYPE</code> or
     *   <code>ORDERED_NODE_ITERATOR_TYPE</code>.
     * @exception DOMException
     *   INVALID_STATE_ERR: The document has been mutated since the result was
     *   returned.
         * @see org.w3c.dom.xpath.XPathResult#iterateNext()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public int getSnapshotLength() throws XPathException {

        /**
         * The number of nodes in the result snapshot. Valid values for
     * snapshotItem indices are <code>0</code> to
     * <code>snapshotLength-1</code> inclusive.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>UNORDERED_NODE_SNAPSHOT_TYPE</code> or
     *   <code>ORDERED_NODE_SNAPSHOT_TYPE</code>.
     *
         * @see org.w3c.dom.xpath.XPathResult#getSnapshotLength()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public boolean getInvalidIteratorState() {

        /**
         * @see org.w3c.dom.xpath.XPathResult#getInvalidIteratorState()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public Node getSingleNodeValue() throws XPathException {

        /**
         * The value of this single node result, which may be <code>null</code>.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>ANY_UNORDERED_NODE_TYPE</code> or
     *   <code>FIRST_ORDERED_NODE_TYPE</code>.
     *
         * @see org.w3c.dom.xpath.XPathResult#getSingleNodeValue()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public boolean getBooleanValue() throws XPathException {

        /**
         * @see org.w3c.dom.xpath.XPathResult#getBooleanValue()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public String getStringValue() throws XPathException {

        /**
         * The value of this string result.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>STRING_TYPE</code>.
     *
         * @see org.w3c.dom.xpath.XPathResult#getStringValue()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public double getNumberValue() throws XPathException {

        /**
         *  The value of this number result.
     * @exception XPathException
     *   TYPE_ERR: raised if <code>resultType</code> is not
     *   <code>NUMBER_TYPE</code>.
         * @see org.w3c.dom.xpath.XPathResult#getNumberValue()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        public short getResultType() {

        /**
         * @see org.w3c.dom.xpath.XPathResult#getResultType()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
         XPathResultImpl(short type, XObject result, Node contextNode, XPath xpath) {

        /**
         * Constructor for XPathResultImpl.
     *
     * For internal use only.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        private NodeList m_list = null;

        /**
     *  The list, if this is a snapshot type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        private NodeIterator m_iterator = null;;

        /**
     *  The iterator, if this is an iterator type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        final private Node m_contextNode;

    /**
     * Only used to attach a mutation event handler when specified
     * type is an iterator type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        final private short m_resultType;

        /**
     *  This the type specified by the user during construction.  Typically
         *  the constructor will be called by com.sun.org.apache.xpath.internal.XPath.evaluate().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        final private XPath m_xpath;

        /**
         * The xpath object that wraps the expression used for this result.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
        final private XObject m_resultObj;

        /**
     *  The wrapped XObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/domapi/XPathResultImpl.java
class XPathResultImpl implements XPathResult, EventListener {

/**
 *
 * The class provides an implementation XPathResult according
 * to the DOM L3 XPath Specification, Working Group Note 26 February 2004.
 *
 * <p>See also the <a href='http://www.w3.org/TR/2004/NOTE-DOM-Level-3-XPath-20040226'>Document Object Model (DOM) Level 3 XPath Specification</a>.</p>
 *
 * <p>The <code>XPathResult</code> interface represents the result of the
 * evaluation of an XPath expression within the context of a particular
 * node. Since evaluation of an XPath expression can result in various
 * result types, this object makes it possible to discover and manipulate
 * the type and value of the result.</p>
 *
 * <p>This implementation wraps an <code>XObject</code>.
 *
 * @see com.sun.org.apache.xpath.internal.objects.XObject
 * @see org.w3c.dom.xpath.XPathResult
 *
 * @xsl.usage internal
 */
