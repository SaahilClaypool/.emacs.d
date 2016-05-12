_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public String substringData(int offset, int count)

    /**
     * Substring is more than a convenience function. In some
     * implementations of the DOM, where the stored data may exceed the
     * length that can be returned in a single string, the only way to
     * read it all is to extract it in chunks via this method.
     *
     * @param offset        Zero-based offset of first character to retrieve.
     * @param count Number of characters to retrieve.
     *
     * If the sum of offset and count exceeds the length, all characters
     * to end of data are returned.
     *
     * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or
     * greater than length, or if count is negative.
     *
     * @throws DOMException(WSTRING_SIZE_ERR) In some implementations,
     * count may exceed the permitted length of strings. If so,
     * substring() will throw this DOMException advising the user to
     * instead retrieve the data in smaller chunks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void setData(String value)

    /**
     * Store character data into this node.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void replaceData(int offset, int count, String data)

    /**
     * Replace a series of characters at the specified (zero-based)
     * offset with a new string, NOT necessarily of the same
     * length. Convenience method, equivalent to a delete followed by an
     * insert. Throws a DOMException if the specified offset is beyond
     * the end of the existing data.
     *
     * @param offset       The offset at which to begin replacing.
     *
     * @param count        The number of characters to remove,
     * interpreted as in the delete() method.
     *
     * @param data         The new string to be inserted at offset in place of
     * the removed data. Note that the entire string will
     * be inserted -- the count parameter does not affect
     * insertion, and the new data may be longer or shorter
     * than the substring it replaces.
     *
     * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or
     * greater than length, or if count is negative.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    void internalInsertData (int offset, String data, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions, we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * insertData operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void insertData(int offset, String data)

    /**
     * Insert additional characters into the data stored in this node,
     * at the offset specified.
     *
     * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or
     * greater than length.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    void internalDeleteData (int offset, int count, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions, we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * deleteData operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void deleteData(int offset, int count)

    /**
     * Remove a range of characters from the node's value. Throws a
     * DOMException if the offset is beyond the end of the
     * string. However, a deletion _count_ that exceeds the available
     * data is accepted as a delete-to-end request.
     *
     * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or
     * greater than length, or if count is negative.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void appendData(String data) {

    /**
     * Concatenate additional characters onto the end of the data
     * stored in this node. Note that this, and insert(), are the paths
     * by which a DOM could wind up accumulating more data than the
     * language's strings can easily handle. (See above discussion.)
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public int getLength() {

    /**
     * Report number of characters currently stored in this node's
     * data. It may be 0, meaning that the value is an empty string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public String getData() {

    /**
     * Retrieve character data currently stored in this node.
     *
     * @throws DOMExcpetion(DOMSTRING_SIZE_ERR) In some implementations,
     * the stored data may exceed the permitted length of strings. If so,
     * getData() will throw this DOMException advising the user to
     * instead retrieve the data in chunks via the substring() operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void setNodeValue(String value) {

    /**
     * Sets the content, possibly firing related events,
     * and updating ranges (via notification to the document)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    protected void setNodeValueInternal(String value, boolean replace) {

    /** This function added so that we can distinguish whether
     *  setNodeValue has been called from some other DOM functions.
     *  or by the client.<p>
     *  This is important, because we do one type of Range fix-up,
     *  from the high-level functions in CharacterData, and another
     *  type if the client simply calls setNodeValue(value).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    protected void setNodeValueInternal (String value) {

   /** Convenience wrapper for calling setNodeValueInternal when
     * we are not performing a replacement operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public NodeList getChildNodes() {

    /** Returns an empty node list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    protected CharacterDataImpl(CoreDocumentImpl ownerDocument, String data) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    private static transient NodeList singletonNodeList = new NodeList() {

    /** Empty child nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    static final long serialVersionUID = 7931170150428474230L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
public abstract class CharacterDataImpl

/**
 * CharacterData is an abstract Node that can carry character data as its
 * Value.  It provides shared behavior for Text, CData, and
 * possibly other node types. All offsets are 0-based.
 * <p>
 * Since ProcessingInstructionImpl inherits from this class to reuse the
 * setNodeValue method, this class isn't declared as implementing the interface
 * CharacterData. This is done by relevant subclasses (TexImpl, CommentImpl).
 * <p>
 * This class doesn't directly support mutation events, however, it notifies
 * the document when mutations are performed so that the document class do so.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public String substringData(int offset, int count)

    /**
     * Substring is more than a convenience function. In some
     * implementations of the DOM, where the stored data may exceed the
     * length that can be returned in a single string, the only way to
     * read it all is to extract it in chunks via this method.
     *
     * @param offset        Zero-based offset of first character to retrieve.
     * @param count Number of characters to retrieve.
     *
     * If the sum of offset and count exceeds the length, all characters
     * to end of data are returned.
     *
     * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or
     * greater than length, or if count is negative.
     *
     * @throws DOMException(WSTRING_SIZE_ERR) In some implementations,
     * count may exceed the permitted length of strings. If so,
     * substring() will throw this DOMException advising the user to
     * instead retrieve the data in smaller chunks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void setData(String value)

    /**
     * Store character data into this node.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void replaceData(int offset, int count, String data)

    /**
     * Replace a series of characters at the specified (zero-based)
     * offset with a new string, NOT necessarily of the same
     * length. Convenience method, equivalent to a delete followed by an
     * insert. Throws a DOMException if the specified offset is beyond
     * the end of the existing data.
     *
     * @param offset       The offset at which to begin replacing.
     *
     * @param count        The number of characters to remove,
     * interpreted as in the delete() method.
     *
     * @param data         The new string to be inserted at offset in place of
     * the removed data. Note that the entire string will
     * be inserted -- the count parameter does not affect
     * insertion, and the new data may be longer or shorter
     * than the substring it replaces.
     *
     * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or
     * greater than length, or if count is negative.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    void internalInsertData (int offset, String data, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions, we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * insertData operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void insertData(int offset, String data)

    /**
     * Insert additional characters into the data stored in this node,
     * at the offset specified.
     *
     * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or
     * greater than length.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    void internalDeleteData (int offset, int count, boolean replace)

    /** NON-DOM INTERNAL: Within DOM actions, we sometimes need to be able
     * to control which mutation events are spawned. This version of the
     * deleteData operation allows us to do so. It is not intended
     * for use by application programs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void deleteData(int offset, int count)

    /**
     * Remove a range of characters from the node's value. Throws a
     * DOMException if the offset is beyond the end of the
     * string. However, a deletion _count_ that exceeds the available
     * data is accepted as a delete-to-end request.
     *
     * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or
     * greater than length, or if count is negative.
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is
     * readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void appendData(String data) {

    /**
     * Concatenate additional characters onto the end of the data
     * stored in this node. Note that this, and insert(), are the paths
     * by which a DOM could wind up accumulating more data than the
     * language's strings can easily handle. (See above discussion.)
     *
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public int getLength() {

    /**
     * Report number of characters currently stored in this node's
     * data. It may be 0, meaning that the value is an empty string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public String getData() {

    /**
     * Retrieve character data currently stored in this node.
     *
     * @throws DOMExcpetion(DOMSTRING_SIZE_ERR) In some implementations,
     * the stored data may exceed the permitted length of strings. If so,
     * getData() will throw this DOMException advising the user to
     * instead retrieve the data in chunks via the substring() operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public void setNodeValue(String value) {

    /**
     * Sets the content, possibly firing related events,
     * and updating ranges (via notification to the document)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    protected void setNodeValueInternal(String value, boolean replace) {

    /** This function added so that we can distinguish whether
     *  setNodeValue has been called from some other DOM functions.
     *  or by the client.<p>
     *  This is important, because we do one type of Range fix-up,
     *  from the high-level functions in CharacterData, and another
     *  type if the client simply calls setNodeValue(value).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    protected void setNodeValueInternal (String value) {

   /** Convenience wrapper for calling setNodeValueInternal when
     * we are not performing a replacement operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    public NodeList getChildNodes() {

    /** Returns an empty node list. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    protected CharacterDataImpl(CoreDocumentImpl ownerDocument, String data) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    private static transient NodeList singletonNodeList = new NodeList() {

    /** Empty child nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
    static final long serialVersionUID = 7931170150428474230L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/CharacterDataImpl.java
public abstract class CharacterDataImpl

/**
 * CharacterData is an abstract Node that can carry character data as its
 * Value.  It provides shared behavior for Text, CData, and
 * possibly other node types. All offsets are 0-based.
 * <p>
 * Since ProcessingInstructionImpl inherits from this class to reuse the
 * setNodeValue method, this class isn't declared as implementing the interface
 * CharacterData. This is done by relevant subclasses (TexImpl, CommentImpl).
 * <p>
 * This class doesn't directly support mutation events, however, it notifies
 * the document when mutations are performed so that the document class do so.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
