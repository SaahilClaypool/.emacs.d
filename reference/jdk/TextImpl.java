_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public String removeData (){

    /**
     * NON-DOM (used by DOMParser: Sets data to empty string.
     *  Returns the value the data was set to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public void replaceData (String value){

    /**
     * NON-DOM (used by DOMParser): Reset data for the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public Text splitText(int offset)

    /**
     * Break a text node into two sibling nodes. (Note that if the current node
     * has no parent, they won't wind up as "siblings" -- they'll both be
     * orphans.)
     *
     * @param offset
     *            The offset at which to split. If offset is at the end of the
     *            available data, the second node will be empty.
     *
     * @return A reference to the new node (containing data after the offset
     *         point). The original node will contain data up to that point.
     *
     * @throws DOMException(INDEX_SIZE_ERR)
     *             if offset is <0 or >length.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR)
     *             if node is read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public boolean isIgnorableWhitespace() {

    /**
     * NON-DOM: Returns whether this Text is ignorable whitespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean hasTextOnlyChildren(Node node) {

    /**
     * Check if an EntityReference node has Text Only child nodes
     *
     * @param node
     * @return true - Contains text only children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean canModifyNext(Node node) {

    /**
     * If any EntityReference to be removed has descendants that are not
     * EntityReference, Text, or CDATASection nodes, the replaceWholeText method
     * must fail before performing any modification of the document, raising a
     * DOMException with the code NO_MODIFICATION_ALLOWED_ERR. Traverse previous
     * siblings of the node to be replaced. If a previous sibling is an
     * EntityReference node, get it's last child. If the first child was a Text
     * or CDATASection node and its next siblings are neither a replaceable
     * EntityReference or Text or CDATASection nodes, return false. IF the first
     * child was neither Text nor CDATASection nor a replaceable EntityReference
     * Node, then return true. If the first child was a Text or CDATASection
     * node any its next sibling was not or was an EntityReference that did not
     * contain only Text or CDATASection nodes, return false. Check this
     * recursively for EntityReference nodes.
     *
     * @param node
     * @return true - can replace text false - can't replace exception must be
     *         raised
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean canModifyPrev(Node node) {

    /**
     * If any EntityReference to be removed has descendants that are not
     * EntityReference, Text, or CDATASection nodes, the replaceWholeText method
     * must fail before performing any modification of the document, raising a
     * DOMException with the code NO_MODIFICATION_ALLOWED_ERR. Traverse previous
     * siblings of the node to be replaced. If a previous sibling is an
     * EntityReference node, get it's last child. If the last child was a Text
     * or CDATASection node and its previous siblings are neither a replaceable
     * EntityReference or Text or CDATASection nodes, return false. IF the last
     * child was neither Text nor CDATASection nor a replaceable EntityReference
     * Node, then return true. If the last child was a Text or CDATASection node
     * any its previous sibling was not or was an EntityReference that did not
     * contain only Text or CDATASection nodes, return false. Check this
     * recursively for EntityReference nodes.
     *
     * @param node
     * @return true - can replace text false - can't replace exception must be
     *         raised
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public Text replaceWholeText(String content) throws DOMException {

    /**
     * Replaces the text of the current node and all logically-adjacent text
     * nodes with the specified text. All logically-adjacent text nodes are
     * removed including the current node unless it was the recipient of the
     * replacement text.
     *
     * @param content
     *            The content of the replacing Text node.
     * @return text - The Text node created with the specified content.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean getWholeTextBackward(Node node, StringBuffer buffer, Node parent){

    /**
     * Concatenates the text of all logically-adjacent text nodes to the left of
     * the node
     * @param node
     * @param buffer
     * @param parent
     * @return true - if execution was stopped because the type of node
     *         other than EntityRef, Text, CDATA is encountered, otherwise
     *         return false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean getWholeTextForward(Node node, StringBuffer buffer, Node parent){

    /**
     * Concatenates the text of all logically-adjacent text nodes to the
     * right of this node
     * @param node
     * @param buffer
     * @param parent
     * @return true - if execution was stopped because the type of node
     *         other than EntityRef, Text, CDATA is encountered, otherwise
     *         return false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    protected void insertTextContent(StringBuffer buf) throws DOMException {

    /**
     * internal method taking a StringBuffer in parameter and inserts the
     * text content at the start of the buffer
     *
     * @param buf
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public String getWholeText(){

    /**
     * DOM Level 3 WD - Experimental.
     * Returns all text of <code>Text</code> nodes logically-adjacent text
     * nodes to this node, concatenated in document order.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public boolean isElementContentWhitespace() {

    /**
     * DOM L3 Core CR - Experimental
     *
     * Returns whether this text node contains
     * element content whitespace</a>, often abusively called "ignorable whitespace".
     * The text node is determined to contain whitespace in element content
     * during the load of the document or if validation occurs while using
     * <code>Document.normalizeDocument()</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public void setIgnorableWhitespace(boolean ignore) {

    /**
     * NON-DOM: Set whether this Text is ignorable whitespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public String getNodeName() {

    /** Returns the node name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public void setValues(CoreDocumentImpl ownerDoc, String data){

    /**
     * NON-DOM: resets node and sets specified values for the current node
     *
     * @param ownerDoc
     * @param data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public TextImpl(CoreDocumentImpl ownerDoc, String data) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public TextImpl(){}

    /** Default constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    static final long serialVersionUID = -5294980852957403469L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
public class TextImpl

/**
 * Text nodes hold the non-markup, non-Entity content of
 * an Element or Attribute.
 * <P>
 * When a document is first made available to the DOM, there is only
 * one Text object for each block of adjacent plain-text. Users (ie,
 * applications) may create multiple adjacent Texts during editing --
 * see {@link org.w3c.dom.Element#normalize} for discussion.
 * <P>
 * Note that CDATASection is a subclass of Text. This is conceptually
 * valid, since they're really just two different ways of quoting
 * characters when they're written out as part of an XML stream.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/TextImpl.java
    public String substringData(int offset,
                                int count)

    /**
     * Extracts a range of data from the node.
     * @param offset Start offset of substring to extract.
     * @param count The number of 16-bit units to extract.
     * @return The specified substring. If the sum of <code>offset</code> and
     *   <code>count</code> exceeds the <code>length</code>, then all 16-bit
     *   units to the end of the data are returned.
     * @exception DOMException
     *   INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is
     *   negative or greater than the number of 16-bit units in
     *   <code>data</code>, or if the specified <code>count</code> is
     *   negative.
     *   <br>DOMSTRING_SIZE_ERR: Raised if the specified range of text does
     *   not fit into a <code>DOMString</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/TextImpl.java
    public int getLength() {

    /**
     * The number of 16-bit units that are available through <code>data</code>
     * and the <code>substringData</code> method below. This may have the
     * value zero, i.e., <code>CharacterData</code> nodes may be empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/TextImpl.java
    public String getData()

    /**
     * The character data of the node that implements this interface. The DOM
     * implementation may not put arbitrary limits on the amount of data
     * that may be stored in a <code>CharacterData</code> node. However,
     * implementation limits may mean that the entirety of a node's data may
     * not fit into a single <code>DOMString</code>. In such cases, the user
     * may call <code>substringData</code> to retrieve the data in
     * appropriately sized pieces.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/TextImpl.java
public class TextImpl extends DefaultText {

/**
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public String removeData (){

    /**
     * NON-DOM (used by DOMParser: Sets data to empty string.
     *  Returns the value the data was set to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public void replaceData (String value){

    /**
     * NON-DOM (used by DOMParser): Reset data for the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public Text splitText(int offset)

    /**
     * Break a text node into two sibling nodes. (Note that if the current node
     * has no parent, they won't wind up as "siblings" -- they'll both be
     * orphans.)
     *
     * @param offset
     *            The offset at which to split. If offset is at the end of the
     *            available data, the second node will be empty.
     *
     * @return A reference to the new node (containing data after the offset
     *         point). The original node will contain data up to that point.
     *
     * @throws DOMException(INDEX_SIZE_ERR)
     *             if offset is <0 or >length.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR)
     *             if node is read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public boolean isIgnorableWhitespace() {

    /**
     * NON-DOM: Returns whether this Text is ignorable whitespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean hasTextOnlyChildren(Node node) {

    /**
     * Check if an EntityReference node has Text Only child nodes
     *
     * @param node
     * @return true - Contains text only children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean canModifyNext(Node node) {

    /**
     * If any EntityReference to be removed has descendants that are not
     * EntityReference, Text, or CDATASection nodes, the replaceWholeText method
     * must fail before performing any modification of the document, raising a
     * DOMException with the code NO_MODIFICATION_ALLOWED_ERR. Traverse previous
     * siblings of the node to be replaced. If a previous sibling is an
     * EntityReference node, get it's last child. If the first child was a Text
     * or CDATASection node and its next siblings are neither a replaceable
     * EntityReference or Text or CDATASection nodes, return false. IF the first
     * child was neither Text nor CDATASection nor a replaceable EntityReference
     * Node, then return true. If the first child was a Text or CDATASection
     * node any its next sibling was not or was an EntityReference that did not
     * contain only Text or CDATASection nodes, return false. Check this
     * recursively for EntityReference nodes.
     *
     * @param node
     * @return true - can replace text false - can't replace exception must be
     *         raised
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean canModifyPrev(Node node) {

    /**
     * If any EntityReference to be removed has descendants that are not
     * EntityReference, Text, or CDATASection nodes, the replaceWholeText method
     * must fail before performing any modification of the document, raising a
     * DOMException with the code NO_MODIFICATION_ALLOWED_ERR. Traverse previous
     * siblings of the node to be replaced. If a previous sibling is an
     * EntityReference node, get it's last child. If the last child was a Text
     * or CDATASection node and its previous siblings are neither a replaceable
     * EntityReference or Text or CDATASection nodes, return false. IF the last
     * child was neither Text nor CDATASection nor a replaceable EntityReference
     * Node, then return true. If the last child was a Text or CDATASection node
     * any its previous sibling was not or was an EntityReference that did not
     * contain only Text or CDATASection nodes, return false. Check this
     * recursively for EntityReference nodes.
     *
     * @param node
     * @return true - can replace text false - can't replace exception must be
     *         raised
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public Text replaceWholeText(String content) throws DOMException {

    /**
     * Replaces the text of the current node and all logically-adjacent text
     * nodes with the specified text. All logically-adjacent text nodes are
     * removed including the current node unless it was the recipient of the
     * replacement text.
     *
     * @param content
     *            The content of the replacing Text node.
     * @return text - The Text node created with the specified content.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean getWholeTextBackward(Node node, StringBuffer buffer, Node parent){

    /**
     * Concatenates the text of all logically-adjacent text nodes to the left of
     * the node
     * @param node
     * @param buffer
     * @param parent
     * @return true - if execution was stopped because the type of node
     *         other than EntityRef, Text, CDATA is encountered, otherwise
     *         return false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    private boolean getWholeTextForward(Node node, StringBuffer buffer, Node parent){

    /**
     * Concatenates the text of all logically-adjacent text nodes to the
     * right of this node
     * @param node
     * @param buffer
     * @param parent
     * @return true - if execution was stopped because the type of node
     *         other than EntityRef, Text, CDATA is encountered, otherwise
     *         return false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    protected void insertTextContent(StringBuffer buf) throws DOMException {

    /**
     * internal method taking a StringBuffer in parameter and inserts the
     * text content at the start of the buffer
     *
     * @param buf
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public String getWholeText(){

    /**
     * DOM Level 3 WD - Experimental.
     * Returns all text of <code>Text</code> nodes logically-adjacent text
     * nodes to this node, concatenated in document order.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public boolean isElementContentWhitespace() {

    /**
     * DOM L3 Core CR - Experimental
     *
     * Returns whether this text node contains
     * element content whitespace</a>, often abusively called "ignorable whitespace".
     * The text node is determined to contain whitespace in element content
     * during the load of the document or if validation occurs while using
     * <code>Document.normalizeDocument()</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public void setIgnorableWhitespace(boolean ignore) {

    /**
     * NON-DOM: Set whether this Text is ignorable whitespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public String getNodeName() {

    /** Returns the node name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public void setValues(CoreDocumentImpl ownerDoc, String data){

    /**
     * NON-DOM: resets node and sets specified values for the current node
     *
     * @param ownerDoc
     * @param data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public TextImpl(CoreDocumentImpl ownerDoc, String data) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    public TextImpl(){}

    /** Default constructor */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
    static final long serialVersionUID = -5294980852957403469L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/TextImpl.java
public class TextImpl

/**
 * Text nodes hold the non-markup, non-Entity content of
 * an Element or Attribute.
 * <P>
 * When a document is first made available to the DOM, there is only
 * one Text object for each block of adjacent plain-text. Users (ie,
 * applications) may create multiple adjacent Texts during editing --
 * see {@link org.w3c.dom.Element#normalize} for discussion.
 * <P>
 * Note that CDATASection is a subclass of Text. This is conceptually
 * valid, since they're really just two different ways of quoting
 * characters when they're written out as part of an XML stream.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/TextImpl.java
    public String substringData(int offset,
                                int count)

    /**
     * Extracts a range of data from the node.
     * @param offset Start offset of substring to extract.
     * @param count The number of 16-bit units to extract.
     * @return The specified substring. If the sum of <code>offset</code> and
     *   <code>count</code> exceeds the <code>length</code>, then all 16-bit
     *   units to the end of the data are returned.
     * @exception DOMException
     *   INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is
     *   negative or greater than the number of 16-bit units in
     *   <code>data</code>, or if the specified <code>count</code> is
     *   negative.
     *   <br>DOMSTRING_SIZE_ERR: Raised if the specified range of text does
     *   not fit into a <code>DOMString</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/TextImpl.java
    public int getLength() {

    /**
     * The number of 16-bit units that are available through <code>data</code>
     * and the <code>substringData</code> method below. This may have the
     * value zero, i.e., <code>CharacterData</code> nodes may be empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/TextImpl.java
    public String getData()

    /**
     * The character data of the node that implements this interface. The DOM
     * implementation may not put arbitrary limits on the amount of data
     * that may be stored in a <code>CharacterData</code> node. However,
     * implementation limits may mean that the entirety of a node's data may
     * not fit into a single <code>DOMString</code>. In such cases, the user
     * may call <code>substringData</code> to retrieve the data in
     * appropriately sized pieces.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     * @exception DOMException
     *   DOMSTRING_SIZE_ERR: Raised when it would return more characters than
     *   fit in a <code>DOMString</code> variable on the implementation
     *   platform.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/opti/TextImpl.java
public class TextImpl extends DefaultText {

/**
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 */
