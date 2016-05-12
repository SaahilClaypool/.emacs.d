_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        private void ensureCapacity(int newsize) {

        /** Makes sure that there is enough storage. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public void removeAllElements() {

        /** Clears the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public void addElement(int element) {

        /** Appends an element to the end of the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public int elementAt(int index) {

        /** Returns the element at the specified index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public int size() {

        /** Returns the length of this vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        private int size;

        /** Size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        private int data[];

        /** Data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    static final class IntVector {

    /**
     * A simple integer vector.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private static void print(int values[], int start, int end,
                              int middle, int target) {

    /** Prints the ID array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final void putIdentifier0(String idName, Element element) {

    /**
     * This version of putIdentifier is needed to avoid fluffing
     * all of the paths to ID attributes when a node object is
     * created that contains an ID attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final int clearChunkIndex(int data[][], int chunk, int index) {

    /**
     * Clears the specified value in the given data at the chunk and index.
     * Note that this method will clear the given chunk if the reference
     * count becomes zero.
     *
     * @return Returns the old value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final int getChunkIndex(int data[][], int chunk, int index) {

    /**
     * Returns the specified value in the given data at the chunk and index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final int setChunkIndex(int data[][], int value,
                                    int chunk, int index) {

    /**
     * Sets the specified value in the given of data at the chunk and index.
     *
     * @return Returns the old value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final void createChunk(int data[][], int chunk) {

    /** Creates the specified chunk in the given array of chunks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static int binarySearch(final int values[],
                                      int start, int end, int target) {

    /**
     * Performs a binary search for a target value in an array of
     * values. The array of values must be in ascending sorted order
     * before calling this method and all array values must be
     * non-negative.
     *
     * @param values  The array of values to search.
     * @param start   The starting offset of the search.
     * @param end     The ending offset of the search.
     * @param target  The target value.
     *
     * @return This function will return the <i>first</i> occurrence
     *         of the target value, or -1 if the target value cannot
     *         be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected int createNode(short nodeType) {

    /** Creates a node of the specified type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected void ensureCapacity(int chunk) {

    /** Ensures that the internal tables are large enough. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected final void synchronizeChildren(ParentNode p, int nodeIndex) {

    /**
     * Synchronizes the node's children with the internal structure.
     * Fluffing the children at once solves a lot of work to keep
     * the two structures in sync. The problem gets worse when
     * editing the tree -- this makes it a lot easier.
     * This is not directly used in this class but this method is
     * here so that it can be shared by all deferred subclasses of ParentNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected final void synchronizeChildren(AttrImpl a, int nodeIndex) {

    /**
     * Synchronizes the node's children with the internal structure.
     * Fluffing the children at once solves a lot of work to keep
     * the two structures in sync. The problem gets worse when
     * editing the tree -- this makes it a lot easier.
     * This is not directly used in this class but this method is
     * here so that it can be shared by all deferred subclasses of AttrImpl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected void synchronizeChildren() {

    /**
     * Synchronizes the node's children with the internal structure.
     * Fluffing the children at once solves a lot of work to keep
     * the two structures in sync. The problem gets worse when
     * editing the tree -- this makes it a lot easier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected void synchronizeData() {

    /** Synchronizes the node's data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void print() {

    /** Prints out the tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void putIdentifier(String name, int elementNodeIndex) {

    /** Registers an identifier name with a specified element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeURI(int nodeIndex, boolean free) {

    /**
     * Returns the URI of the given node.
     * @param free True to free URI index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeURI(int nodeIndex) {

    /** Returns the URI of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getAttribute(int elemIndex, String name) {

    /** Returns the attribute value of the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public short getNodeType(int nodeIndex, boolean free) {

    /**
     * Returns the type of the given node.
     * @param free True to free type index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public short getNodeType(int nodeIndex) {

    /** Returns the type of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getNodeExtra(int nodeIndex, boolean free) {

    /**
     * Returns the extra info of the given node.
     * @param free True to free the value index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getNodeExtra(int nodeIndex) {

    /**
     * Returns the extra info of the given node.
     * Used by AttrImpl to store specified value (1 == true).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeValue(int nodeIndex, boolean free) {

    /**
     * Returns the value of the given node.
     * @param free True to free the value index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public Object getTypeInfo(int nodeIndex) {

        /**
         * Clears the type info that is stored in the fNodeValue array
         * @param nodeIndex
         * @return Object - type information for the attribute/element node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeValue(int nodeIndex) {

    /**
     * Returns the value of the given node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeValueString(int nodeIndex, boolean free) {

    /**
     * Returns the real value of the given node.
     * @param free True to free the string index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeValueString(int nodeIndex) {

    /** Returns the real value of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeName(int nodeIndex, boolean free) {

    /**
     * Returns the name of the given node.
     * @param free True to free the string index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeName(int nodeIndex) {

    /** Returns the name of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DeferredNode getNodeObject(int nodeIndex) {

    /** Instantiates the requested node object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int lookupElementDefinition(String elementName) {

    /**
     * Returns the index of the element definition in the table
     * with the specified name index, or -1 if no such definition
     * exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getRealPrevSibling(int nodeIndex, boolean free) {

    /**
     * Returns the <i>real</i> prev sibling of the given node.
     * @param free True to free sibling index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getRealPrevSibling(int nodeIndex) {

    /**
     * Returns the <i>real</i> prev sibling of the given node,
     * directly from the data structures. Used by TextImpl#getNodeValue()
     * to normalize values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getPrevSibling(int nodeIndex, boolean free) {

    /**
     * Returns the prev sibling of the given node.
     * @param free True to free sibling index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getPrevSibling(int nodeIndex) {

    /**
     * Returns the prev sibling of the given node.
     * This is post-normalization of Text Nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getLastChild(int nodeIndex, boolean free) {

    /**
     * Returns the last child of the given node.
     * @param free True to free child index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getLastChild(int nodeIndex) {

    /** Returns the last child of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getParentNode(int nodeIndex, boolean free) {

    /**
     * Returns the parent node of the given node.
     * @param free True to free parent node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getParentNode(int nodeIndex) {

    /**
     * Returns the parent node of the given node.
     * <em>Calling this method does not free the parent index.</em>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void setAsLastChild(int parentIndex, int childIndex) {

    /** Sets the last child of the parentIndex to childIndex. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int insertBefore(int parentIndex, int newChildIndex, int refChildIndex) {

    /** Inserts a child before the specified node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void setIdAttribute(int attrIndex) {

    /** Sets type of attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void setIdAttributeNode(int elemIndex, int attrIndex) {

    /** Adds an attribute node to the specified element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int setAttributeNode(int elemIndex, int attrIndex) {

    /** Adds an attribute node to the specified element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void appendChild(int parentIndex, int childIndex) {

    /** Appends a child to the specified parent in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int cloneNode(int nodeIndex, boolean deep) {

    /** Creates a clone of the specified node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredComment(String data) {

    /** Creates a comment node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredProcessingInstruction(String target,
                                                   String data) {

    /** Creates a processing instruction node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredCDATASection(String data) {

    /** Creates a CDATA section node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredTextNode(String data,
                                      boolean ignorableWhitespace) {

    /** Creates a text node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredElementDefinition(String elementName) {

    /** Creates an element definition in the table.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredAttribute(String attrName, String attrURI,
                                       String attrValue, boolean specified) {

    /** Creates an attribute with a URI in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredAttribute(String attrName, String attrValue,
                                       boolean specified) {

    /** Creates an attribute in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int setDeferredAttribute(int elementNodeIndex,
                                    String attrName, String attrURI,
                                    String attrValue, boolean specified) {

    /**
     * Sets an attribute on an element node.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public int setDeferredAttribute(int elementNodeIndex,
                                        String attrName,
                                        String attrURI,
                                        String attrValue,
                                        boolean specified,
                                        boolean id,
                                        Object type) {

        /**
         * This method is used by the DOMParser to create attributes.
         * @param elementNodeIndex
         * @param attrName
         * @param attrURI
         * @param attrValue
         * @param specified
         * @param id
         * @param type
         * @return int
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredElement(String elementURI, String elementName) {

    /**
     * Creates an element node with a URI in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredElement(String elementName) {

    /**
     * Creates an element node in the table.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredElement(String elementURI, String elementName,
                                      Object type) {

    /**
     * Creates an element node with a URI in the table and type information.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredEntityReference(String name, String baseURI) {

    /** Creates an entity reference node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void setInputEncoding(int currentEntityDecl, String value){

    /**
     * DOM Internal
     *
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredEntity(String entityName, String publicId,
                                    String systemId, String notationName,
                                    String baseURI) {

    /** Creates an entity in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredNotation(String notationName,
                                      String publicId, String systemId, String baseURI) {

    /** Creates a notation in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredDocumentType(String rootElementName,
                                          String publicId, String systemId) {

    /** Creates a doctype. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredDocument() {

    /** Creates a document node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    boolean getNamespacesEnabled() {

    /** Returns the cached parser.getNamespaces() value.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DOMImplementation getImplementation() {

    /**
     * Retrieve information describing the abilities of this particular
     * DOM implementation. Intended to support applications that may be
     * using DOMs retrieved from several different sources, potentially
     * with different underlying representations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DeferredDocumentImpl(boolean namespaces, boolean grammarAccess) {

    /** Experimental constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DeferredDocumentImpl(boolean namespacesEnabled) {

    /**
     * NON-DOM: Actually creating a Document is outside the DOM's spec,
     * since it has to operate in terms of a particular implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DeferredDocumentImpl() {

    /**
     * NON-DOM: Actually creating a Document is outside the DOM's spec,
     * since it has to operate in terms of a particular implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    // Implementation Note: The deferred element and attribute must know how to

    /** DOM2: For namespace support in the deferred case.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fIdElement[];

    /** Identifier element indexes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient String fIdName[];

    /** Identifier name indexes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fIdCount;

    /** Identifier count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeExtra[][];

    /** Extra data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient Object fNodeURI[][];

    /** Node namespace URI. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodePrevSib[][];

    /** Node prev siblings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeLastChild[][];

    /** Node first children. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeParent[][];

    /** Node parents. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient Object fNodeValue[][];

    /** Node values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient Object fNodeName[][];

    /** Node names. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeType[][];

    /** Node types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeCount = 0;

    /** Node count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static final int INITIAL_CHUNK_COUNT = (1 << (13 - CHUNK_SHIFT));   // 32

    /** Initial chunk size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static final int CHUNK_SIZE = (1 << CHUNK_SHIFT);

    /** Chunk size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static final int CHUNK_SHIFT = 8;           // 2^8 = 256

    /** Chunk shift. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private static final boolean DEBUG_IDS = false;

    /** To debug identifiers set to true and recompile. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private static final boolean DEBUG_PRINT_TABLES = false;

    /** To include code for printing the internal tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private static final boolean DEBUG_PRINT_REF_COUNTS = false;

    /** To include code for printing the ref count tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    static final long serialVersionUID = 5186323580749626857L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
public class DeferredDocumentImpl

/**
 * The Document interface represents the entire HTML or XML document.
 * Conceptually, it is the root of the document tree, and provides the
 * primary access to the document's data.
 * <P>
 * Since elements, text nodes, comments, processing instructions,
 * etc. cannot exist outside the context of a Document, the Document
 * interface also contains the factory methods needed to create these
 * objects. The Node objects created have a ownerDocument attribute
 * which associates them with the Document within whose context they
 * were created.
 *
 * @xerces.internal
 *
 * @version $Id: DeferredDocumentImpl.java,v 1.11 2010-11-01 04:39:38 joehw Exp $
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        private void ensureCapacity(int newsize) {

        /** Makes sure that there is enough storage. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public void removeAllElements() {

        /** Clears the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public void addElement(int element) {

        /** Appends an element to the end of the vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public int elementAt(int index) {

        /** Returns the element at the specified index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public int size() {

        /** Returns the length of this vector. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        private int size;

        /** Size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        private int data[];

        /** Data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    static final class IntVector {

    /**
     * A simple integer vector.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private static void print(int values[], int start, int end,
                              int middle, int target) {

    /** Prints the ID array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final void putIdentifier0(String idName, Element element) {

    /**
     * This version of putIdentifier is needed to avoid fluffing
     * all of the paths to ID attributes when a node object is
     * created that contains an ID attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final int clearChunkIndex(int data[][], int chunk, int index) {

    /**
     * Clears the specified value in the given data at the chunk and index.
     * Note that this method will clear the given chunk if the reference
     * count becomes zero.
     *
     * @return Returns the old value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final int getChunkIndex(int data[][], int chunk, int index) {

    /**
     * Returns the specified value in the given data at the chunk and index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final int setChunkIndex(int data[][], int value,
                                    int chunk, int index) {

    /**
     * Sets the specified value in the given of data at the chunk and index.
     *
     * @return Returns the old value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private final void createChunk(int data[][], int chunk) {

    /** Creates the specified chunk in the given array of chunks. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static int binarySearch(final int values[],
                                      int start, int end, int target) {

    /**
     * Performs a binary search for a target value in an array of
     * values. The array of values must be in ascending sorted order
     * before calling this method and all array values must be
     * non-negative.
     *
     * @param values  The array of values to search.
     * @param start   The starting offset of the search.
     * @param end     The ending offset of the search.
     * @param target  The target value.
     *
     * @return This function will return the <i>first</i> occurrence
     *         of the target value, or -1 if the target value cannot
     *         be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected int createNode(short nodeType) {

    /** Creates a node of the specified type. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected void ensureCapacity(int chunk) {

    /** Ensures that the internal tables are large enough. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected final void synchronizeChildren(ParentNode p, int nodeIndex) {

    /**
     * Synchronizes the node's children with the internal structure.
     * Fluffing the children at once solves a lot of work to keep
     * the two structures in sync. The problem gets worse when
     * editing the tree -- this makes it a lot easier.
     * This is not directly used in this class but this method is
     * here so that it can be shared by all deferred subclasses of ParentNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected final void synchronizeChildren(AttrImpl a, int nodeIndex) {

    /**
     * Synchronizes the node's children with the internal structure.
     * Fluffing the children at once solves a lot of work to keep
     * the two structures in sync. The problem gets worse when
     * editing the tree -- this makes it a lot easier.
     * This is not directly used in this class but this method is
     * here so that it can be shared by all deferred subclasses of AttrImpl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected void synchronizeChildren() {

    /**
     * Synchronizes the node's children with the internal structure.
     * Fluffing the children at once solves a lot of work to keep
     * the two structures in sync. The problem gets worse when
     * editing the tree -- this makes it a lot easier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected void synchronizeData() {

    /** Synchronizes the node's data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getNodeIndex() {

    /** Returns the node index. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void print() {

    /** Prints out the tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void putIdentifier(String name, int elementNodeIndex) {

    /** Registers an identifier name with a specified element node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeURI(int nodeIndex, boolean free) {

    /**
     * Returns the URI of the given node.
     * @param free True to free URI index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeURI(int nodeIndex) {

    /** Returns the URI of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getAttribute(int elemIndex, String name) {

    /** Returns the attribute value of the given name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public short getNodeType(int nodeIndex, boolean free) {

    /**
     * Returns the type of the given node.
     * @param free True to free type index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public short getNodeType(int nodeIndex) {

    /** Returns the type of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getNodeExtra(int nodeIndex, boolean free) {

    /**
     * Returns the extra info of the given node.
     * @param free True to free the value index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getNodeExtra(int nodeIndex) {

    /**
     * Returns the extra info of the given node.
     * Used by AttrImpl to store specified value (1 == true).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeValue(int nodeIndex, boolean free) {

    /**
     * Returns the value of the given node.
     * @param free True to free the value index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public Object getTypeInfo(int nodeIndex) {

        /**
         * Clears the type info that is stored in the fNodeValue array
         * @param nodeIndex
         * @return Object - type information for the attribute/element node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeValue(int nodeIndex) {

    /**
     * Returns the value of the given node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeValueString(int nodeIndex, boolean free) {

    /**
     * Returns the real value of the given node.
     * @param free True to free the string index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeValueString(int nodeIndex) {

    /** Returns the real value of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeName(int nodeIndex, boolean free) {

    /**
     * Returns the name of the given node.
     * @param free True to free the string index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public String getNodeName(int nodeIndex) {

    /** Returns the name of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DeferredNode getNodeObject(int nodeIndex) {

    /** Instantiates the requested node object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int lookupElementDefinition(String elementName) {

    /**
     * Returns the index of the element definition in the table
     * with the specified name index, or -1 if no such definition
     * exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getRealPrevSibling(int nodeIndex, boolean free) {

    /**
     * Returns the <i>real</i> prev sibling of the given node.
     * @param free True to free sibling index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getRealPrevSibling(int nodeIndex) {

    /**
     * Returns the <i>real</i> prev sibling of the given node,
     * directly from the data structures. Used by TextImpl#getNodeValue()
     * to normalize values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getPrevSibling(int nodeIndex, boolean free) {

    /**
     * Returns the prev sibling of the given node.
     * @param free True to free sibling index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getPrevSibling(int nodeIndex) {

    /**
     * Returns the prev sibling of the given node.
     * This is post-normalization of Text Nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getLastChild(int nodeIndex, boolean free) {

    /**
     * Returns the last child of the given node.
     * @param free True to free child index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getLastChild(int nodeIndex) {

    /** Returns the last child of the given node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getParentNode(int nodeIndex, boolean free) {

    /**
     * Returns the parent node of the given node.
     * @param free True to free parent node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int getParentNode(int nodeIndex) {

    /**
     * Returns the parent node of the given node.
     * <em>Calling this method does not free the parent index.</em>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void setAsLastChild(int parentIndex, int childIndex) {

    /** Sets the last child of the parentIndex to childIndex. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int insertBefore(int parentIndex, int newChildIndex, int refChildIndex) {

    /** Inserts a child before the specified node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void setIdAttribute(int attrIndex) {

    /** Sets type of attribute */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void setIdAttributeNode(int elemIndex, int attrIndex) {

    /** Adds an attribute node to the specified element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int setAttributeNode(int elemIndex, int attrIndex) {

    /** Adds an attribute node to the specified element. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void appendChild(int parentIndex, int childIndex) {

    /** Appends a child to the specified parent in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int cloneNode(int nodeIndex, boolean deep) {

    /** Creates a clone of the specified node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredComment(String data) {

    /** Creates a comment node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredProcessingInstruction(String target,
                                                   String data) {

    /** Creates a processing instruction node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredCDATASection(String data) {

    /** Creates a CDATA section node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredTextNode(String data,
                                      boolean ignorableWhitespace) {

    /** Creates a text node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredElementDefinition(String elementName) {

    /** Creates an element definition in the table.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredAttribute(String attrName, String attrURI,
                                       String attrValue, boolean specified) {

    /** Creates an attribute with a URI in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredAttribute(String attrName, String attrValue,
                                       boolean specified) {

    /** Creates an attribute in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int setDeferredAttribute(int elementNodeIndex,
                                    String attrName, String attrURI,
                                    String attrValue, boolean specified) {

    /**
     * Sets an attribute on an element node.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
        public int setDeferredAttribute(int elementNodeIndex,
                                        String attrName,
                                        String attrURI,
                                        String attrValue,
                                        boolean specified,
                                        boolean id,
                                        Object type) {

        /**
         * This method is used by the DOMParser to create attributes.
         * @param elementNodeIndex
         * @param attrName
         * @param attrURI
         * @param attrValue
         * @param specified
         * @param id
         * @param type
         * @return int
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredElement(String elementURI, String elementName) {

    /**
     * Creates an element node with a URI in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredElement(String elementName) {

    /**
     * Creates an element node in the table.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredElement(String elementURI, String elementName,
                                      Object type) {

    /**
     * Creates an element node with a URI in the table and type information.
     * @deprecated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredEntityReference(String name, String baseURI) {

    /** Creates an entity reference node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public void setInputEncoding(int currentEntityDecl, String value){

    /**
     * DOM Internal
     *
     * An attribute specifying the actual encoding of this document. This is
     * <code>null</code> otherwise.
     * <br> This attribute represents the property [character encoding scheme]
     * defined in .
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredEntity(String entityName, String publicId,
                                    String systemId, String notationName,
                                    String baseURI) {

    /** Creates an entity in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredNotation(String notationName,
                                      String publicId, String systemId, String baseURI) {

    /** Creates a notation in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredDocumentType(String rootElementName,
                                          String publicId, String systemId) {

    /** Creates a doctype. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public int createDeferredDocument() {

    /** Creates a document node in the table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    boolean getNamespacesEnabled() {

    /** Returns the cached parser.getNamespaces() value.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DOMImplementation getImplementation() {

    /**
     * Retrieve information describing the abilities of this particular
     * DOM implementation. Intended to support applications that may be
     * using DOMs retrieved from several different sources, potentially
     * with different underlying representations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DeferredDocumentImpl(boolean namespaces, boolean grammarAccess) {

    /** Experimental constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DeferredDocumentImpl(boolean namespacesEnabled) {

    /**
     * NON-DOM: Actually creating a Document is outside the DOM's spec,
     * since it has to operate in terms of a particular implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    public DeferredDocumentImpl() {

    /**
     * NON-DOM: Actually creating a Document is outside the DOM's spec,
     * since it has to operate in terms of a particular implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    // Implementation Note: The deferred element and attribute must know how to

    /** DOM2: For namespace support in the deferred case.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fIdElement[];

    /** Identifier element indexes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient String fIdName[];

    /** Identifier name indexes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fIdCount;

    /** Identifier count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeExtra[][];

    /** Extra data. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient Object fNodeURI[][];

    /** Node namespace URI. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodePrevSib[][];

    /** Node prev siblings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeLastChild[][];

    /** Node first children. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeParent[][];

    /** Node parents. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient Object fNodeValue[][];

    /** Node values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient Object fNodeName[][];

    /** Node names. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeType[][];

    /** Node types. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected transient int fNodeCount = 0;

    /** Node count. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static final int INITIAL_CHUNK_COUNT = (1 << (13 - CHUNK_SHIFT));   // 32

    /** Initial chunk size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static final int CHUNK_SIZE = (1 << CHUNK_SHIFT);

    /** Chunk size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    protected static final int CHUNK_SHIFT = 8;           // 2^8 = 256

    /** Chunk shift. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private static final boolean DEBUG_IDS = false;

    /** To debug identifiers set to true and recompile. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private static final boolean DEBUG_PRINT_TABLES = false;

    /** To include code for printing the internal tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    private static final boolean DEBUG_PRINT_REF_COUNTS = false;

    /** To include code for printing the ref count tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
    static final long serialVersionUID = 5186323580749626857L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DeferredDocumentImpl.java
public class DeferredDocumentImpl

/**
 * The Document interface represents the entire HTML or XML document.
 * Conceptually, it is the root of the document tree, and provides the
 * primary access to the document's data.
 * <P>
 * Since elements, text nodes, comments, processing instructions,
 * etc. cannot exist outside the context of a Document, the Document
 * interface also contains the factory methods needed to create these
 * objects. The Node objects created have a ownerDocument attribute
 * which associates them with the Document within whose context they
 * were created.
 *
 * @xerces.internal
 *
 * @version $Id: DeferredDocumentImpl.java,v 1.11 2010-11-01 04:39:38 joehw Exp $
 * @since  PR-DOM-Level-1-19980818.
 */
