_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getUnparsedEntityURI(String name)

    /**
     * The getUnparsedEntityURI function returns the URI of the unparsed
     * entity with the specified name in the same document as the context
     * node (see [3.3 Unparsed Entities]). It returns the empty string if
     * there is no such entity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public Map<String, Integer> getElementsWithIDs() {

    /**
     * Return the attributes map.
     * @return the attributes map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DOM getResultTreeFrag(int initSize, int rtfType, boolean addToManager)

    /**
     * Return a instance of a DOM class to be used as an RTF
     *
     * @param initSize The initial size of the DOM.
     * @param rtfType The type of the RTF
     * @param addToManager true if the RTF should be registered with the DTMManager.
     * @return The DOM object which represents the RTF.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DOM getResultTreeFrag(int initSize, int rtfType)

    /**
     * Return a instance of a DOM class to be used as an RTF
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public SerializationHandler getOutputDomBuilder()

    /**
     * Return a SerializationHandler for output handling.
     * This method is used by Result Tree Fragments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DOMBuilder getBuilder()

    /**
     * Returns an instance of the DOMBuilder inner class
     * This class will consume the input document through a SAX2
     * interface and populate the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getLanguage(int node)

    /**
     * Returns a node' defined language for a node (if any)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String shallowCopy(final int node, SerializationHandler handler)

    /**
     * Performs a shallow copy (ref. XSLs copy())
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private void copyPI(final int node, SerializationHandler handler)

    /**
     * Copies a processing instruction node to an output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void copy(final int node, SerializationHandler handler)

    /**
     * Performs a deep copy (ref. XSLs copy-of())
     *
     * TODO: Copy namespace declarations. Can't be done until we
     *       add namespace nodes and keep track of NS prefixes
     * TODO: Copy comment nodes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void copy(SerializationHandler handler) throws TransletException

    /**
     * Copy the whole tree to an output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void copy(DTMAxisIterator nodes, SerializationHandler handler)

    /**
     * Copy a node-set to an output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void characters(final int node, SerializationHandler handler)

    /**
     * Copy the string value of a node directly to an output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getNthDescendant(int type, int n, boolean includeself)

    /**
     * Returns the nth descendant of a node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getTypedDescendantIterator(int type)

    /**
     * Returns an iterator with all descendants of a node that are of
     * a given type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public int next() {

        /**
         * Get the next node in the iteration.
         *
         * @return The next node handle in the iteration, or END.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public DTMAxisIterator setStartNode(int node) {

        /**
         * Set start to END should 'close' the iterator,
         * i.e. subsequent call to next() should return END.
         *
         * @param node Sets the root of the iteration.
         *
         * @return A DTMAxisIterator set to the start of the iteration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public NamespaceAttributeIterator(int nsType) {

        /**
         * Constructor NamespaceAttributeIterator
         *
         *
         * @param nsType The extended type ID being requested.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        private final int _nsType;

        /** The extended type ID being requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public final class NamespaceAttributeIterator

    /**
     * Iterator that returns attributes within a given namespace for a node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public int next() {

        /**
         * Get the next node in the iteration.
         *
         * @return The next node handle in the iteration, or END.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public DTMAxisIterator setStartNode(int node) {

        /**
         * Set start to END should 'close' the iterator,
         * i.e. subsequent call to next() should return END.
         *
         * @param node Sets the root of the iteration.
         *
         * @return A DTMAxisIterator set to the start of the iteration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public NamespaceChildrenIterator(final int type) {

        /**
         * Constructor NamespaceChildrenIterator
         *
         *
         * @param type The extended type ID being requested.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        private final int _nsType;

        /** The extended type ID being requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public final class NamespaceChildrenIterator

    /**
     * Iterator that returns children within a given namespace for a
     * given node. The functionality chould be achieved by putting a
     * filter on top of a basic child iterator, but a specialised
     * iterator is used for efficiency (both speed and size of translet).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public boolean isReverse() {

        /**
         * True if this iterator has a reversed axis.
         *
         * @return <code>true</code> if this iterator is a reversed axis.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public DTMAxisIterator cloneIterator() {

        /**
         * Returns a deep copy of this iterator.  The cloned iterator is not
         * reset.
         *
         * @return a deep copy of this iterator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public int next() {

        /**
         * Get the next node in the iteration.
         *
         * @return The next node handle in the iteration, or END.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public DTMAxisIterator setStartNode(int node) {

        /**
         * Set start to END should 'close' the iterator,
         * i.e. subsequent call to next() should return END.
         *
         * @param node Sets the root of the iteration.
         *
         * @return A DTMAxisIterator set to the start of the iteration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public NamespaceWildcardIterator(int axis, int nsType) {

        /**
         * Constructor NamespaceWildcard
         *
         * @param axis The axis that this iterator will traverse
         * @param nsType The namespace type index
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        protected DTMAxisIterator m_baseIterator;

        /**
         * A nested typed axis iterator that retrieves nodes of the principal
         * node kind for that axis.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        protected int m_nsType;

        /**
         * The namespace type index.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public final class NamespaceWildcardIterator

    /**
     * Iterator that handles node tests that test for a namespace, but have
     * a wild card for the local name of the node, i.e., node tests of the
     * form <axis>::<prefix>:*
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getNamespaceAxisIterator(int axis, int ns)

    /**
     * Do not think that this returns an iterator for the namespace axis.
     * It returns an iterator with nodes that belong in a certain namespace,
     * such as with <xsl:apply-templates select="blob/foo:*"/>
     * The 'axis' specifies the axis for the base iterator from which the
     * nodes are taken, while 'ns' specifies the namespace URI type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getTypedAxisIterator(int axis, int type)

    /**
     * Similar to getAxisIterator, but this one returns an iterator
     * containing nodes of a typed axis (ex.: child::foo)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getAxisIterator(final int axis)

    /**
     * This is a shortcut to the iterators that implement the
     * supported XPath axes (only namespace::) is not supported.
     * Returns a bare-bones iterator that must be initialized
     * with a start node (using iterator.setStartNode()).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getTypedChildren(final int type)

    /**
     * Returns an iterator with all children of a specific type
     * for a given node (element)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getChildren(final int node)

    /**
     * Returns an iterator with all the children of a given node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getAttributeValue(final String name, final int element)

    /**
     * This method is for testing/debugging only
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getAttributeValue(final int type, final int element)

    /**
     * Returns the value of a given attribute type of a given element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getAttributeNode(final int type, final int element)

    /**
     * Returns the attribute node of a given type (if any) for an element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getNamespaceName(final int node)

    /**
     * Returns the namespace URI to which a node belongs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getNodeName(final int node)

    /**
     * Returns the name of a node (attribute or element).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void print(int node, int level)

    /**
     * Prints the whole tree to standard output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void comment(char[] ch, int start, int length)

    /**
     * SAX2: Report an XML comment anywhere in the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void startPrefixMapping(String prefix, String uri)

    /**
     * SAX2: Begin the scope of a prefix-URI Namespace mapping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void ignorableWhitespace(char[] ch, int start, int length)

    /**
     * SAX2: Receive notification of ignorable whitespace in element
     * content. Similar to characters(char[], int, int).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void processingInstruction(String target, String data)

    /**
     * SAX2: Receive notification of a processing instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void endElement(String namespaceURI, String localName, String qname)

    /**
     * SAX2: Receive notification of the end of an element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void startElement(String uri, String localName,
                 String qname, Attributes attributes)

    /**
     * SAX2: Receive notification of the beginning of an element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void startElement(String uri, String localName,
                             String qname, Attributes attributes,
                             Node node)

    /**
     * Specialized interface used by DOM2SAX. This one has an extra Node
     * parameter to build the Node -> id map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void endDocument() throws SAXException

    /**
     * SAX2: Receive notification of the end of a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void startDocument() throws SAXException

    /**
     * SAX2: Receive notification of the beginning of a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void characters(char[] ch, int start, int length) throws SAXException

    /**
     * SAX2: Receive notification of character data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    /*               SAX Interface Starts Here                      */

    /****************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private void handleTextEscaping() {

    /**
     * Creates a text-node and checks if it is a whitespace node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    protected boolean getShouldStripWhitespace()

    /**
     * Find out whether or not to strip whitespace nodes.
     *
     *
     * @return whether or not to strip whitespace nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private void xmlSpaceRevert(final int node)

    /**
     * Call this from endElement() to revert strip/preserve setting
     * to whatever it was before the corresponding startElement().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private void xmlSpaceDefine(String val, final int node)

    /**
     * Call this when an xml:space attribute is encountered to
     * define the whitespace strip/preserve settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public boolean hasDOMSource()

    /**
     * Return true if the input source is DOMSource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getElementById(String idString)

    /**
     * Return the node identity for a given id String
     *
     * @param idString The id String
     * @return The identity of the node whose id is the given String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void migrateTo(DTMManager manager) {

    /**
    * Migrate a DTM built with an old DTMManager to a new DTMManager.
    * After the migration, the new DTMManager will treat the DTM as
    * one that is built by itself.
    * This is used to support DTM sharing between multiple transformations.
    * @param manager the DTMManager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public SAXImpl(XSLTCDTMManager mgr, Source source,
                   int dtmIdentity, DTMWSFilter whiteSpaceFilter,
                   XMLStringFactory xstringfactory,
                   boolean doIndexing, int blocksize,
                   boolean buildIdIndex,
                   boolean newNameTable)

    /**
     * Construct a SAXImpl object using the given block size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public SAXImpl(XSLTCDTMManager mgr, Source source,
                   int dtmIdentity, DTMWSFilter whiteSpaceFilter,
                   XMLStringFactory xstringfactory,
                   boolean doIndexing, boolean buildIdIndex)

    /**
     * Construct a SAXImpl object using the default block size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public short[] getReverseNamespaceMapping(String[] namespaces)

    /**
     * Get mapping from external namespace types to DOM namespace types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public short[] getNamespaceMapping(String[] namespaces)

    /**
     * Get mapping from DOM namespace types to external namespace types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private short[] getMapping2(String[] names, String[] uris, int[] types)

    /**
     * Get mapping from DOM element/attribute types to external types.
     * This method is used when the document is not fully built.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int[] getReverseMapping(String[] names, String[] uris, int[] types)

    /**
     * Get mapping from external element/attribute types to DOM types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public short[] getMapping(String[] names, String[] uris, int[] types)

    /**
     * Get mapping from DOM element/attribute types to external types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getGeneralizedType(final String name, boolean searchOnly) {

    /**
     * Returns the internal type associated with an expanded QName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getGeneralizedType(final String name) {

    /**
     * Returns the internal type associated with an expanded QName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private int[] setupMapping(String[] names, String[] uris, int[] types, int nNames) {

    /**
     * Sets up a translet-to-dom type mapping table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getNamespaceType(final int node)

    /**
     * Returns the namespace type of a specific node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getNSType(int node)

     /**
     * Get mapping from DOM namespace types to external namespace types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getIterator()

    /**
     * Returns singleton iterator containg the document root
     * Works for them main document (mark == 0).  It cannot be made
     * to point to any other node through setStartNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator orderNodes(DTMAxisIterator source, int node)

    /**
     * Encapsulates an iterator in an OrderedIterator to ensure node order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private final class NodeValueIterator extends InternalAxisIteratorBase

    /**************************************************************
     * This is a specialised iterator for predicates comparing node or
     * attribute values to variable or parameter values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public int next() {

       /**
        * Get the next node in the iteration.
        *
        * @return The next node handle in the iteration, or END.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public TypedNamespaceIterator(int nodeType) {

        /**
         * Constructor TypedChildrenIterator
         *
         *
         * @param nodeType The extended type ID being requested.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public class TypedNamespaceIterator extends NamespaceIterator {

    /**
     * Iterator that returns the namespace nodes as defined by the XPath data
     * model for a given node, filtered by extended type ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public NodeList makeNodeList(DTMAxisIterator iter) {

    /**
     * Create an org.w3c.dom.NodeList from a node iterator
     * The iterator most be started before this method is called
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public NodeList makeNodeList(int index) {

    /**
     * Create an org.w3c.dom.NodeList from a node in the tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public Node makeNode(DTMAxisIterator iter) {

    /**
     * Create an org.w3c.dom.Node from a node in an iterator
     * The iterator most be started before this method is called
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public Node makeNode(int index) {

    /**
     * Create an org.w3c.dom.Node from a node in the tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public boolean lessThan(int node1, int node2) {

    /**
     * Returns true if node1 comes before node2 in document order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void setFilter(StripFilter filter) {

    /**
     * Part of the DOM interface - no function here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getSize() {

    /**
     * Returns the number of nodes in the tree (used for indexing)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public boolean isAttribute(final int node) {

    /**
     * Returns 'true' if a specific node is an attribute (of any type)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public boolean isElement(final int node) {

    /**
     * Returns 'true' if a specific node is an element (of any type)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String lookupNamespace(int node, String prefix)

    /**
     * Lookup a namespace URI from a prefix starting at node. This method
     * is used in the execution of xsl:element when the prefix is not known
     * at compile time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getDocumentURI() {

    /**
     * Returns the origin of the document from which the tree was built
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void setDocumentURI(String uri) {

    /**
     * Define the origin of the document from which the tree was built
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
public final class SAXImpl extends SAX2DTM2

/**
 * SAXImpl is the core model for SAX input source. SAXImpl objects are
 * usually created from an XSLTCDTMManager.
 *
 * <p>DOMSource inputs are handled using DOM2SAX + SAXImpl. SAXImpl has a
 * few specific fields (e.g. _node2Ids, _document) to keep DOM-related
 * information. They are used when the processing behavior between DOM and
 * SAX has to be different. Examples of these include id function and
 * unparsed entity.
 *
 * <p>SAXImpl extends SAX2DTM2 instead of SAX2DTM for better performance.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Douglas Sellers <douglasjsellers@hotmail.com>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getUnparsedEntityURI(String name)

    /**
     * The getUnparsedEntityURI function returns the URI of the unparsed
     * entity with the specified name in the same document as the context
     * node (see [3.3 Unparsed Entities]). It returns the empty string if
     * there is no such entity.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public Map<String, Integer> getElementsWithIDs() {

    /**
     * Return the attributes map.
     * @return the attributes map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DOM getResultTreeFrag(int initSize, int rtfType, boolean addToManager)

    /**
     * Return a instance of a DOM class to be used as an RTF
     *
     * @param initSize The initial size of the DOM.
     * @param rtfType The type of the RTF
     * @param addToManager true if the RTF should be registered with the DTMManager.
     * @return The DOM object which represents the RTF.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DOM getResultTreeFrag(int initSize, int rtfType)

    /**
     * Return a instance of a DOM class to be used as an RTF
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public SerializationHandler getOutputDomBuilder()

    /**
     * Return a SerializationHandler for output handling.
     * This method is used by Result Tree Fragments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DOMBuilder getBuilder()

    /**
     * Returns an instance of the DOMBuilder inner class
     * This class will consume the input document through a SAX2
     * interface and populate the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getLanguage(int node)

    /**
     * Returns a node' defined language for a node (if any)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String shallowCopy(final int node, SerializationHandler handler)

    /**
     * Performs a shallow copy (ref. XSLs copy())
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private void copyPI(final int node, SerializationHandler handler)

    /**
     * Copies a processing instruction node to an output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void copy(final int node, SerializationHandler handler)

    /**
     * Performs a deep copy (ref. XSLs copy-of())
     *
     * TODO: Copy namespace declarations. Can't be done until we
     *       add namespace nodes and keep track of NS prefixes
     * TODO: Copy comment nodes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void copy(SerializationHandler handler) throws TransletException

    /**
     * Copy the whole tree to an output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void copy(DTMAxisIterator nodes, SerializationHandler handler)

    /**
     * Copy a node-set to an output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void characters(final int node, SerializationHandler handler)

    /**
     * Copy the string value of a node directly to an output handler
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getNthDescendant(int type, int n, boolean includeself)

    /**
     * Returns the nth descendant of a node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getTypedDescendantIterator(int type)

    /**
     * Returns an iterator with all descendants of a node that are of
     * a given type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public int next() {

        /**
         * Get the next node in the iteration.
         *
         * @return The next node handle in the iteration, or END.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public DTMAxisIterator setStartNode(int node) {

        /**
         * Set start to END should 'close' the iterator,
         * i.e. subsequent call to next() should return END.
         *
         * @param node Sets the root of the iteration.
         *
         * @return A DTMAxisIterator set to the start of the iteration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public NamespaceAttributeIterator(int nsType) {

        /**
         * Constructor NamespaceAttributeIterator
         *
         *
         * @param nsType The extended type ID being requested.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        private final int _nsType;

        /** The extended type ID being requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public final class NamespaceAttributeIterator

    /**
     * Iterator that returns attributes within a given namespace for a node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public int next() {

        /**
         * Get the next node in the iteration.
         *
         * @return The next node handle in the iteration, or END.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public DTMAxisIterator setStartNode(int node) {

        /**
         * Set start to END should 'close' the iterator,
         * i.e. subsequent call to next() should return END.
         *
         * @param node Sets the root of the iteration.
         *
         * @return A DTMAxisIterator set to the start of the iteration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public NamespaceChildrenIterator(final int type) {

        /**
         * Constructor NamespaceChildrenIterator
         *
         *
         * @param type The extended type ID being requested.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        private final int _nsType;

        /** The extended type ID being requested. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public final class NamespaceChildrenIterator

    /**
     * Iterator that returns children within a given namespace for a
     * given node. The functionality chould be achieved by putting a
     * filter on top of a basic child iterator, but a specialised
     * iterator is used for efficiency (both speed and size of translet).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public boolean isReverse() {

        /**
         * True if this iterator has a reversed axis.
         *
         * @return <code>true</code> if this iterator is a reversed axis.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public DTMAxisIterator cloneIterator() {

        /**
         * Returns a deep copy of this iterator.  The cloned iterator is not
         * reset.
         *
         * @return a deep copy of this iterator.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public int next() {

        /**
         * Get the next node in the iteration.
         *
         * @return The next node handle in the iteration, or END.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public DTMAxisIterator setStartNode(int node) {

        /**
         * Set start to END should 'close' the iterator,
         * i.e. subsequent call to next() should return END.
         *
         * @param node Sets the root of the iteration.
         *
         * @return A DTMAxisIterator set to the start of the iteration.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public NamespaceWildcardIterator(int axis, int nsType) {

        /**
         * Constructor NamespaceWildcard
         *
         * @param axis The axis that this iterator will traverse
         * @param nsType The namespace type index
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        protected DTMAxisIterator m_baseIterator;

        /**
         * A nested typed axis iterator that retrieves nodes of the principal
         * node kind for that axis.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        protected int m_nsType;

        /**
         * The namespace type index.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public final class NamespaceWildcardIterator

    /**
     * Iterator that handles node tests that test for a namespace, but have
     * a wild card for the local name of the node, i.e., node tests of the
     * form <axis>::<prefix>:*
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getNamespaceAxisIterator(int axis, int ns)

    /**
     * Do not think that this returns an iterator for the namespace axis.
     * It returns an iterator with nodes that belong in a certain namespace,
     * such as with <xsl:apply-templates select="blob/foo:*"/>
     * The 'axis' specifies the axis for the base iterator from which the
     * nodes are taken, while 'ns' specifies the namespace URI type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getTypedAxisIterator(int axis, int type)

    /**
     * Similar to getAxisIterator, but this one returns an iterator
     * containing nodes of a typed axis (ex.: child::foo)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getAxisIterator(final int axis)

    /**
     * This is a shortcut to the iterators that implement the
     * supported XPath axes (only namespace::) is not supported.
     * Returns a bare-bones iterator that must be initialized
     * with a start node (using iterator.setStartNode()).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getTypedChildren(final int type)

    /**
     * Returns an iterator with all children of a specific type
     * for a given node (element)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getChildren(final int node)

    /**
     * Returns an iterator with all the children of a given node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getAttributeValue(final String name, final int element)

    /**
     * This method is for testing/debugging only
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getAttributeValue(final int type, final int element)

    /**
     * Returns the value of a given attribute type of a given element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getAttributeNode(final int type, final int element)

    /**
     * Returns the attribute node of a given type (if any) for an element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getNamespaceName(final int node)

    /**
     * Returns the namespace URI to which a node belongs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getNodeName(final int node)

    /**
     * Returns the name of a node (attribute or element).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void print(int node, int level)

    /**
     * Prints the whole tree to standard output
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void comment(char[] ch, int start, int length)

    /**
     * SAX2: Report an XML comment anywhere in the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void startPrefixMapping(String prefix, String uri)

    /**
     * SAX2: Begin the scope of a prefix-URI Namespace mapping.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void ignorableWhitespace(char[] ch, int start, int length)

    /**
     * SAX2: Receive notification of ignorable whitespace in element
     * content. Similar to characters(char[], int, int).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void processingInstruction(String target, String data)

    /**
     * SAX2: Receive notification of a processing instruction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void endElement(String namespaceURI, String localName, String qname)

    /**
     * SAX2: Receive notification of the end of an element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void startElement(String uri, String localName,
                 String qname, Attributes attributes)

    /**
     * SAX2: Receive notification of the beginning of an element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void startElement(String uri, String localName,
                             String qname, Attributes attributes,
                             Node node)

    /**
     * Specialized interface used by DOM2SAX. This one has an extra Node
     * parameter to build the Node -> id map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void endDocument() throws SAXException

    /**
     * SAX2: Receive notification of the end of a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void startDocument() throws SAXException

    /**
     * SAX2: Receive notification of the beginning of a document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void characters(char[] ch, int start, int length) throws SAXException

    /**
     * SAX2: Receive notification of character data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    /*               SAX Interface Starts Here                      */

    /****************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private void handleTextEscaping() {

    /**
     * Creates a text-node and checks if it is a whitespace node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    protected boolean getShouldStripWhitespace()

    /**
     * Find out whether or not to strip whitespace nodes.
     *
     *
     * @return whether or not to strip whitespace nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private void xmlSpaceRevert(final int node)

    /**
     * Call this from endElement() to revert strip/preserve setting
     * to whatever it was before the corresponding startElement().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private void xmlSpaceDefine(String val, final int node)

    /**
     * Call this when an xml:space attribute is encountered to
     * define the whitespace strip/preserve settings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public boolean hasDOMSource()

    /**
     * Return true if the input source is DOMSource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getElementById(String idString)

    /**
     * Return the node identity for a given id String
     *
     * @param idString The id String
     * @return The identity of the node whose id is the given String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void migrateTo(DTMManager manager) {

    /**
    * Migrate a DTM built with an old DTMManager to a new DTMManager.
    * After the migration, the new DTMManager will treat the DTM as
    * one that is built by itself.
    * This is used to support DTM sharing between multiple transformations.
    * @param manager the DTMManager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public SAXImpl(XSLTCDTMManager mgr, Source source,
                   int dtmIdentity, DTMWSFilter whiteSpaceFilter,
                   XMLStringFactory xstringfactory,
                   boolean doIndexing, int blocksize,
                   boolean buildIdIndex,
                   boolean newNameTable)

    /**
     * Construct a SAXImpl object using the given block size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public SAXImpl(XSLTCDTMManager mgr, Source source,
                   int dtmIdentity, DTMWSFilter whiteSpaceFilter,
                   XMLStringFactory xstringfactory,
                   boolean doIndexing, boolean buildIdIndex)

    /**
     * Construct a SAXImpl object using the default block size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public short[] getReverseNamespaceMapping(String[] namespaces)

    /**
     * Get mapping from external namespace types to DOM namespace types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public short[] getNamespaceMapping(String[] namespaces)

    /**
     * Get mapping from DOM namespace types to external namespace types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private short[] getMapping2(String[] names, String[] uris, int[] types)

    /**
     * Get mapping from DOM element/attribute types to external types.
     * This method is used when the document is not fully built.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int[] getReverseMapping(String[] names, String[] uris, int[] types)

    /**
     * Get mapping from external element/attribute types to DOM types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public short[] getMapping(String[] names, String[] uris, int[] types)

    /**
     * Get mapping from DOM element/attribute types to external types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getGeneralizedType(final String name, boolean searchOnly) {

    /**
     * Returns the internal type associated with an expanded QName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getGeneralizedType(final String name) {

    /**
     * Returns the internal type associated with an expanded QName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private int[] setupMapping(String[] names, String[] uris, int[] types, int nNames) {

    /**
     * Sets up a translet-to-dom type mapping table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getNamespaceType(final int node)

    /**
     * Returns the namespace type of a specific node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getNSType(int node)

     /**
     * Get mapping from DOM namespace types to external namespace types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator getIterator()

    /**
     * Returns singleton iterator containg the document root
     * Works for them main document (mark == 0).  It cannot be made
     * to point to any other node through setStartNode().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public DTMAxisIterator orderNodes(DTMAxisIterator source, int node)

    /**
     * Encapsulates an iterator in an OrderedIterator to ensure node order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    private final class NodeValueIterator extends InternalAxisIteratorBase

    /**************************************************************
     * This is a specialised iterator for predicates comparing node or
     * attribute values to variable or parameter values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public int next() {

       /**
        * Get the next node in the iteration.
        *
        * @return The next node handle in the iteration, or END.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
        public TypedNamespaceIterator(int nodeType) {

        /**
         * Constructor TypedChildrenIterator
         *
         *
         * @param nodeType The extended type ID being requested.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public class TypedNamespaceIterator extends NamespaceIterator {

    /**
     * Iterator that returns the namespace nodes as defined by the XPath data
     * model for a given node, filtered by extended type ID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public NodeList makeNodeList(DTMAxisIterator iter) {

    /**
     * Create an org.w3c.dom.NodeList from a node iterator
     * The iterator most be started before this method is called
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public NodeList makeNodeList(int index) {

    /**
     * Create an org.w3c.dom.NodeList from a node in the tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public Node makeNode(DTMAxisIterator iter) {

    /**
     * Create an org.w3c.dom.Node from a node in an iterator
     * The iterator most be started before this method is called
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public Node makeNode(int index) {

    /**
     * Create an org.w3c.dom.Node from a node in the tree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public boolean lessThan(int node1, int node2) {

    /**
     * Returns true if node1 comes before node2 in document order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void setFilter(StripFilter filter) {

    /**
     * Part of the DOM interface - no function here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public int getSize() {

    /**
     * Returns the number of nodes in the tree (used for indexing)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public boolean isAttribute(final int node) {

    /**
     * Returns 'true' if a specific node is an attribute (of any type)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public boolean isElement(final int node) {

    /**
     * Returns 'true' if a specific node is an element (of any type)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String lookupNamespace(int node, String prefix)

    /**
     * Lookup a namespace URI from a prefix starting at node. This method
     * is used in the execution of xsl:element when the prefix is not known
     * at compile time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public String getDocumentURI() {

    /**
     * Returns the origin of the document from which the tree was built
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
    public void setDocumentURI(String uri) {

    /**
     * Define the origin of the document from which the tree was built
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl.java
public final class SAXImpl extends SAX2DTM2

/**
 * SAXImpl is the core model for SAX input source. SAXImpl objects are
 * usually created from an XSLTCDTMManager.
 *
 * <p>DOMSource inputs are handled using DOM2SAX + SAXImpl. SAXImpl has a
 * few specific fields (e.g. _node2Ids, _document) to keep DOM-related
 * information. They are used when the processing behavior between DOM and
 * SAX has to be different. Examples of these include id function and
 * unparsed entity.
 *
 * <p>SAXImpl extends SAX2DTM2 instead of SAX2DTM for better performance.
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Douglas Sellers <douglasjsellers@hotmail.com>
 */
