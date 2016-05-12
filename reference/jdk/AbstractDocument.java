_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void undo() throws CannotUndoException {

        /**
         * Undoes a change.
         *
         * @exception CannotUndoException if the change cannot be undone
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void redo() throws CannotRedoException {

        /**
         * Redoes a change.
         *
         * @exception CannotRedoException if the change cannot be redone
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Element[] getChildrenAdded() {

        /**
         * Gets a list of children that were added.
         *
         * @return the list
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Element[] getChildrenRemoved() {

        /**
         * Gets a list of children that were removed.
         *
         * @return the list
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getIndex() {

        /**
         * Returns the index into the list of elements.
         *
         * @return the index &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Element getElement() {

        /**
         * Returns the underlying element.
         *
         * @return the element
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public ElementEdit(Element e, int index, Element[] removed, Element[] added) {

        /**
         * Constructs an edit record.  This does not modify the element
         * so it can safely be used to <em>catch up</em> a view to the
         * current model state for views that just attached to a model.
         *
         * @param e the element
         * @param index the index into the model &gt;= 0
         * @param removed a set of elements that were removed
         * @param added a set of elements that were added
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public static class ElementEdit extends AbstractUndoableEdit implements DocumentEvent.ElementChange {

    /**
     * An implementation of ElementChange that can be added to the document
     * event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    class UndoRedoDocumentEvent implements DocumentEvent {

    /**
     * This event used when firing document changes while Undo/Redo
     * operations. It just wraps DefaultDocumentEvent and delegates
     * all calls to it except getType() which depends on operation
     * (Undo or Redo).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public DocumentEvent.ElementChange getChange(Element elem) {

        /**
         * Gets the changes for an element.
         *
         * @param elem the element
         * @return the changes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Document getDocument() {

        /**
         * Gets the document that sourced the change event.
         *
         * @return the document
         * @see DocumentEvent#getDocument
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getLength() {

        /**
         * Returns the length of the change.
         *
         * @return the length &gt;= 0
         * @see DocumentEvent#getLength
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getOffset() {

        /**
         * Returns the offset within the document of the start of the change.
         *
         * @return the offset &gt;= 0
         * @see DocumentEvent#getOffset
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public DocumentEvent.EventType getType() {

        /**
         * Returns the type of event.
         *
         * @return the event type as a DocumentEvent.EventType
         * @see DocumentEvent#getType
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String getRedoPresentationName() {

        /**
         * Provides a localized, human readable description of the redoable
         * form of this edit, e.g. for use as a Redo menu item. Typically
         * derived from getPresentationName();
         *
         * @return the description
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String getUndoPresentationName() {

        /**
         * Provides a localized, human readable description of the undoable
         * form of this edit, e.g. for use as an Undo menu item. Typically
         * derived from getDescription();
         *
         * @return the description
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String getPresentationName() {

        /**
         * Provides a localized, human readable description of this edit
         * suitable for use in, say, a change log.
         *
         * @return the description
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean isSignificant() {

        /**
         * DefaultDocument events are significant.  If you wish to aggregate
         * DefaultDocumentEvents to present them as a single edit to the user
         * place them into a CompoundEdit.
         *
         * @return whether the event is significant for edit undo purposes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void undo() throws CannotUndoException {

        /**
         * Undoes a change.
         *
         * @exception CannotUndoException if the change cannot be undone
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void redo() throws CannotRedoException {

        /**
         * Redoes a change.
         *
         * @exception CannotRedoException if the change cannot be redone
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean addEdit(UndoableEdit anEdit) {

        /**
         * Adds a document edit.  If the number of edits crosses
         * a threshold, this switches on a hashtable lookup for
         * ElementChange implementations since access of these
         * needs to be relatively quick.
         *
         * @param anEdit a document edit record
         * @return true if the edit was added
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String toString() {

        /**
         * Returns a string description of the change event.
         *
         * @return a string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public DefaultDocumentEvent(int offs, int len, DocumentEvent.EventType type) {

        /**
         * Constructs a change record.
         *
         * @param offs the offset into the document of the change &gt;= 0
         * @param len  the length of the change &gt;= 0
         * @param type the type of event (DocumentEvent.EventType)
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public class DefaultDocumentEvent extends CompoundEdit implements DocumentEvent {

    /**
     * Stores document changes as the document is being
     * modified.  Can subsequently be used for change notification
     * when done with the document modification transaction.
     * This is used by the AbstractDocument class and its extensions
     * for broadcasting change information to the document listeners.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String getName() {

        /**
         * Gets the name of the element.
         * @return the name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        BidiElement(Element parent, int start, int end, int level) {

        /**
         * Creates a new BidiElement.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    class BidiElement extends LeafElement {

    /**
     * Represents an element of the bidirectional element structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String getName() {

        /**
         * Gets the name of the element.
         * @return the name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    class BidiRootElement extends BranchElement {

    /**
     * Represents the root element of the bidirectional element structure.
     * The root element is the only element in the bidi element structure
     * which contains children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Enumeration children() {

        /**
         * Returns the children of the receiver as an
         * <code>Enumeration</code>.
         * @return the children of the receiver
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean getAllowsChildren() {

        /**
         * Returns true if the receiver allows children.
         * @return true if the receiver allows children, otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean isLeaf() {

        /**
         * Checks whether the element is a leaf.
         *
         * @return true if a leaf
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getElementCount()  {

        /**
         * Returns the number of child elements.
         *
         * @return the number of children &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Element getElement(int index) {

        /**
         * Gets a child element.
         *
         * @param index the child index, &gt;= 0 &amp;&amp; &lt; getElementCount()
         * @return the child element
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getElementIndex(int pos) {

        /**
         * Gets the child element index closest to the given model offset.
         *
         * @param pos the offset &gt;= 0
         * @return the element index &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String getName() {

        /**
         * Gets the element name.
         *
         * @return the name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getEndOffset() {

        /**
         * Gets the ending offset in the model for the element.
         *
         * @return the offset &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getStartOffset() {

        /**
         * Gets the starting offset in the model for the element.
         *
         * @return the offset &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String toString() {

        /**
         * Converts the element to a string.
         *
         * @return the string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public LeafElement(Element parent, AttributeSet a, int offs0, int offs1) {

        /**
         * Constructs an element that represents content within the
         * document (has no children).
         *
         * @param parent  The parent element
         * @param a       The element attributes
         * @param offs0   The start offset &gt;= 0
         * @param offs1   The end offset &gt;= offs0
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public class LeafElement extends AbstractElement {

    /**
     * Implements an element that directly represents content of
     * some kind.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     *
     * @see     Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Enumeration children() {

        /**
         * Returns the children of the receiver as an
         * <code>Enumeration</code>.
         * @return the children of the receiver
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean getAllowsChildren() {

        /**
         * Returns true if the receiver allows children.
         * @return true if the receiver allows children, otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean isLeaf() {

        /**
         * Checks whether the element is a leaf.
         *
         * @return true if a leaf
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getElementIndex(int offset) {

        /**
         * Gets the child element index closest to the given model offset.
         *
         * @param offset the offset &gt;= 0
         * @return the element index &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getElementCount()  {

        /**
         * Gets the number of children for the element.
         *
         * @return the number of children &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Element getElement(int index) {

        /**
         * Gets a child element.
         *
         * @param index the child index, &gt;= 0 &amp;&amp; &lt; getElementCount()
         * @return the child element, null if none
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getEndOffset() {

        /**
         * Gets the ending offset in the model for the element.
         * @throws NullPointerException if this element has no children
         *
         * @return the offset &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getStartOffset() {

        /**
         * Gets the starting offset in the model for the element.
         *
         * @return the offset &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String getName() {

        /**
         * Gets the element name.
         *
         * @return the element name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String toString() {

        /**
         * Converts the element to a string.
         *
         * @return the string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void replace(int offset, int length, Element[] elems) {

        /**
         * Replaces content with a new set of elements.
         *
         * @param offset the starting offset &gt;= 0
         * @param length the length to replace &gt;= 0
         * @param elems the new elements
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Element positionToElement(int pos) {

        /**
         * Gets the child element that contains
         * the given model position.
         *
         * @param pos the position &gt;= 0
         * @return the element, null if none
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public BranchElement(Element parent, AttributeSet a) {

        /**
         * Constructs a composite element that initially contains
         * no children.
         *
         * @param parent  The parent element
         * @param a the attributes for the element
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public class BranchElement extends AbstractElement {

    /**
     * Implements a composite element that contains other elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public abstract Enumeration children();

        /**
         * Returns the children of the receiver as an
         * <code>Enumeration</code>.
         * @return the children of the receiver as an <code>Enumeration</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public abstract boolean getAllowsChildren();

        /**
         * Returns true if the receiver allows children.
         * @return true if the receiver allows children, otherwise false
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getIndex(TreeNode node) {

        /**
         * Returns the index of <code>node</code> in the receivers children.
         * If the receiver does not contain <code>node</code>, -1 will be
         * returned.
         * @param node the location of interest
         * @return the index of <code>node</code> in the receiver's
         * children, or -1 if absent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public TreeNode getParent() {

        /**
         * Returns the parent <code>TreeNode</code> of the receiver.
         * @return the parent <code>TreeNode</code> of the receiver
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getChildCount() {

        /**
         * Returns the number of children <code>TreeNode</code>'s
         * receiver contains.
         * @return the number of children <code>TreeNodews</code>'s
         * receiver contains
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public TreeNode getChildAt(int childIndex) {

        /**
         * Returns the child <code>TreeNode</code> at index
         * <code>childIndex</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public abstract boolean isLeaf();

        /**
         * Checks whether the element is a leaf.
         *
         * @return true if a leaf
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public abstract int getElementIndex(int offset);

        /**
         * Gets the child element index closest to the given model offset.
         *
         * @param offset the offset &gt;= 0
         * @return the element index &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public abstract int getElementCount();

        /**
         * Gets the number of children for the element.
         *
         * @return the number of children &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public abstract Element getElement(int index);

        /**
         * Gets a child element.
         *
         * @param index the child index, &gt;= 0 &amp;&amp; &lt; getElementCount()
         * @return the child element
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public abstract int getEndOffset();

        /**
         * Gets the ending offset in the model for the element.
         *
         * @return the offset &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public abstract int getStartOffset();

        /**
         * Gets the starting offset in the model for the element.
         *
         * @return the offset &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String getName() {

        /**
         * Gets the name of the element.
         *
         * @return the name, null if none
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AttributeSet getAttributes() {

        /**
         * Gets the attributes for the element.
         *
         * @return the attribute set
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Element getParentElement() {

        /**
         * Gets the parent of the element.
         *
         * @return the parent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Document getDocument() {

        /**
         * Retrieves the underlying model.
         *
         * @return the model
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void setResolveParent(AttributeSet parent) {

        /**
         * Sets the resolving parent.
         *
         * @param parent the parent, null if none
         * @see MutableAttributeSet#setResolveParent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void removeAttributes(AttributeSet attrs) {

        /**
         * Removes a set of attributes for the element.
         *
         * @param attrs the attributes
         * @see MutableAttributeSet#removeAttributes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void removeAttributes(Enumeration<?> names) {

        /**
         * Removes a set of attributes for the element.
         *
         * @param names the attribute names
         * @see MutableAttributeSet#removeAttributes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void removeAttribute(Object name) {

        /**
         * Removes an attribute from the set.
         *
         * @param name the non-null attribute name
         * @see MutableAttributeSet#removeAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void addAttributes(AttributeSet attr) {

        /**
         * Adds a set of attributes to the element.
         *
         * @param attr the attributes to add
         * @see MutableAttributeSet#addAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void addAttribute(Object name, Object value) {

        /**
         * Adds an attribute to the element.
         *
         * @param name the non-null attribute name
         * @param value the attribute value
         * @see MutableAttributeSet#addAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AttributeSet getResolveParent() {

        /**
         * Gets the resolving parent.
         * If not overridden, the resolving parent defaults to
         * the parent element.
         *
         * @return the attributes from the parent, <code>null</code> if none
         * @see AttributeSet#getResolveParent
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean containsAttributes(AttributeSet attrs) {

        /**
         * Checks whether the element contains all the attributes.
         *
         * @param attrs the attributes to check
         * @return true if the element contains all the attributes
         * @see AttributeSet#containsAttributes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean containsAttribute(Object name, Object value) {

        /**
         * Checks whether a given attribute name/value is defined.
         *
         * @param name the non-null attribute name
         * @param value the attribute value
         * @return true if the name/value is defined
         * @see AttributeSet#containsAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Enumeration<?> getAttributeNames() {

        /**
         * Gets the names of all attributes.
         *
         * @return the attribute names as an enumeration
         * @see AttributeSet#getAttributeNames
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Object getAttribute(Object attrName) {

        /**
         * Gets the value of an attribute.
         *
         * @param attrName the non-null attribute name
         * @return the attribute value
         * @see AttributeSet#getAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AttributeSet copyAttributes() {

        /**
         * Copies a set of attributes.
         *
         * @return the copy
         * @see AttributeSet#copyAttributes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean isEqual(AttributeSet attr) {

        /**
         * Checks whether two attribute sets are equal.
         *
         * @param attr the attribute set to check against
         * @return true if the same
         * @see AttributeSet#isEqual
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public boolean isDefined(Object attrName) {

        /**
         * Checks whether a given attribute is defined.
         *
         * @param attrName the non-null attribute name
         * @return true if the attribute is defined
         * @see AttributeSet#isDefined
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int getAttributeCount() {

        /**
         * Gets the number of attributes that are defined.
         *
         * @return the number of attributes &gt;= 0
         * @see AttributeSet#getAttributeCount
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void dump(PrintStream psOut, int indentAmount) {

        /**
         * Dumps a debugging representation of the element hierarchy.
         *
         * @param psOut the output stream
         * @param indentAmount the indentation level &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AbstractElement(Element parent, AttributeSet a) {

        /**
         * Creates a new AbstractElement.
         *
         * @param parent the parent element
         * @param a the attributes for the element
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public abstract class AbstractElement implements Element, MutableAttributeSet, Serializable, TreeNode {

    /**
     * Implements the abstract part of an element.  By default elements
     * support attributes by having a field that represents the immutable
     * part of the current attribute set for the element.  The element itself
     * implements MutableAttributeSet which can be used to modify the set
     * by fetching a new immutable set.  The immutable sets are provided
     * by the AttributeContext associated with the document.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void reclaim(AttributeSet a);

        /**
         * Reclaims an attribute set.
         * This is a way for a MutableAttributeSet to mark that it no
         * longer need a particular immutable set.  This is only necessary
         * in 1.1 where there are no weak references.  A 1.1 implementation
         * would call this in its finalize method.
         *
         * @param a the attribute set to reclaim
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AttributeSet getEmptySet();

        /**
         * Fetches an empty AttributeSet.
         *
         * @return the attribute set
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AttributeSet removeAttributes(AttributeSet old, AttributeSet attrs);

        /**
         * Removes a set of attributes for the element.
         *
         * @param old the old attribute set
         * @param attrs the attributes
         * @return the updated attribute set
         * @see MutableAttributeSet#removeAttributes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AttributeSet removeAttributes(AttributeSet old, Enumeration<?> names);

        /**
         * Removes a set of attributes for the element.
         *
         * @param old the old attribute set
         * @param names the attribute names
         * @return the updated attribute set
         * @see MutableAttributeSet#removeAttributes
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AttributeSet removeAttribute(AttributeSet old, Object name);

        /**
         * Removes an attribute from the set.
         *
         * @param old the old attribute set
         * @param name the non-null attribute name
         * @return the updated attribute set
         * @see MutableAttributeSet#removeAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AttributeSet addAttributes(AttributeSet old, AttributeSet attr);

        /**
         * Adds a set of attributes to the element.
         *
         * @param old the old attribute set
         * @param attr the attributes to add
         * @return the updated attribute set
         * @see MutableAttributeSet#addAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public AttributeSet addAttribute(AttributeSet old, Object name, Object value);

        /**
         * Adds an attribute to the given set, and returns
         * the new representative set.
         *
         * @param old the old attribute set
         * @param name the non-null attribute name
         * @param value the attribute value
         * @return the updated attribute set
         * @see MutableAttributeSet#addAttribute
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public interface AttributeContext {

    /**
     * An interface that can be used to allow MutableAttributeSet
     * implementations to use pluggable attribute compression
     * techniques.  Each mutation of the attribute set can be
     * used to exchange a previous AttributeSet instance with
     * another, preserving the possibility of the AttributeSet
     * remaining immutable.  An implementation is provided by
     * the StyleContext class.
     *
     * The Element implementations provided by this class use
     * this interface to provide their MutableAttributeSet
     * implementations, so that different AttributeSet compression
     * techniques can be employed.  The method
     * <code>getAttributeContext</code> should be implemented to
     * return the object responsible for implementing the desired
     * compression technique.
     *
     * @see StyleContext
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public void getChars(int where, int len, Segment txt) throws BadLocationException;

        /**
         * Gets a sequence of characters and copies them into a Segment.
         *
         * @param where the starting offset &gt;= 0
         * @param len the number of characters &gt;= 0
         * @param txt the target location to copy into
         * @exception BadLocationException  Thrown if the area covered by
         *   the arguments is not contained in the character sequence.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public String getString(int where, int len) throws BadLocationException;

        /**
         * Fetches a string of characters contained in the sequence.
         *
         * @param where   Offset into the sequence to fetch &gt;= 0.
         * @param len     number of characters to copy &gt;= 0.
         * @return the string
         * @exception BadLocationException  Thrown if the area covered by
         *   the arguments is not contained in the character sequence.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public UndoableEdit remove(int where, int nitems) throws BadLocationException;

        /**
         * Removes some portion of the sequence.
         *
         * @param where   The offset into the sequence to make the
         *   insertion &gt;= 0.
         * @param nitems  The number of items in the sequence to remove &gt;= 0.
         * @return  If the implementation supports a history mechanism,
         *    a reference to an Edit implementation will be returned,
         *    otherwise null.
         * @exception BadLocationException  Thrown if the area covered by
         *   the arguments is not contained in the character sequence.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public UndoableEdit insertString(int where, String str) throws BadLocationException;

        /**
         * Inserts a string of characters into the sequence.
         *
         * @param where   offset into the sequence to make the insertion &gt;= 0
         * @param str     string to insert
         * @return  if the implementation supports a history mechanism,
         *    a reference to an <code>Edit</code> implementation will be returned,
         *    otherwise returns <code>null</code>
         * @exception BadLocationException  thrown if the area covered by
         *   the arguments is not contained in the character sequence
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public int length();

        /**
         * Current length of the sequence of character content.
         *
         * @return the length &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
        public Position createPosition(int offset) throws BadLocationException;

        /**
         * Creates a position within the content that will
         * track change as the content is mutated.
         *
         * @param offset the offset in the content &gt;= 0
         * @return a Position
         * @exception BadLocationException for an invalid offset
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public interface Content {

    /**
     * Interface to describe a sequence of character content that
     * can be edited.  Implementations may or may not support a
     * history mechanism which will be reflected by whether or not
     * mutations return an UndoableEdit implementation.
     * @see AbstractDocument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    static final String AsyncLoadPriority = "load priority";

    /**
     * Document property that indicates asynchronous loading is
     * desired, with the thread priority given as the value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    static final Object MultiByteProperty = "multiByte";

    /**
     * Document property that indicates if a character has been inserted
     * into the document that is more than one byte long.  GlyphView uses
     * this to determine if it should use BreakIterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    static final String I18NProperty = "i18n";

    /**
     * Document property that indicates whether internationalization
     * functions such as text reordering or reshaping should be
     * performed. This property should not be publicly exposed,
     * since it is used for implementation convenience only.  As a
     * side effect, copies of this property may be in its subclasses
     * that live in different packages (e.g. HTMLDocument as of now),
     * so those copies should also be taken care of when this property
     * needs to be modified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public static final String ElementNameAttribute = "$ename";

    /**
     * Name of the attribute used to specify element
     * names.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public static final String BidiElementName = "bidi level";

    /**
     * Name of elements used to hold a unidirectional run
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public static final String SectionElementName = "section";

    /**
     * Name of elements used to hold sections (lines/paragraphs).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public static final String ContentElementName = "content";

    /**
     * Name of elements used to represent content
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public static final String ParagraphElementName = "paragraph";

    /**
     * Name of elements used to represent paragraphs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected static final String BAD_LOCATION = "document location failure";

    /**
     * Error message to indicate a bad location.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private transient DocumentFilter.FilterBypass filterBypass;

    /**
     * Used by DocumentFilter to do actual insert/remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private DocumentFilter documentFilter;

    /**
     * Filter for inserting/removing of text.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private transient BranchElement bidiRoot;

    /**
     * The root of the bidirectional structure for this document.  Its children
     * represent character runs with the same Unicode bidi level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private AttributeContext context;

    /**
     * Factory for the attributes.  This is the strategy for
     * attribute compression and control of the lifetime of
     * a set of attributes as a collection.  This may be shared
     * with other documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private Content data;

    /**
     * Where the text is actually stored, and a set of marks
     * that track change as the document is edited are managed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected EventListenerList listenerList = new EventListenerList();

    /**
     * The event listener list for the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private Dictionary<Object,Object> documentProperties = null;

    /**
     * Storage for document-wide properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private transient int numWriters;

    /**
     * The number of writers, all obtained from <code>currWriter</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public synchronized final void readUnlock() {

    /**
     * Does a read unlock.  This signals that one
     * of the readers is done.  If there are no more readers
     * then writing can begin again.  This should be balanced
     * with a readLock, and should occur in a finally statement
     * so that the balance is guaranteed.  The following is an
     * example.
     * <pre><code>
     * &nbsp;   readLock();
     * &nbsp;   try {
     * &nbsp;       // do something
     * &nbsp;   } finally {
     * &nbsp;       readUnlock();
     * &nbsp;   }
     * </code></pre>
     *
     * @see #readLock
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public synchronized final void readLock() {

    /**
     * Acquires a lock to begin reading some state from the
     * document.  There can be multiple readers at the same time.
     * Writing blocks the readers until notification of the change
     * to the listeners has been completed.  This method should
     * be used very carefully to avoid unintended compromise
     * of the document.  It should always be balanced with a
     * <code>readUnlock</code>.
     *
     * @see #readUnlock
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected synchronized final void writeUnlock() {

    /**
     * Releases a write lock previously obtained via <code>writeLock</code>.
     * After decrementing the lock count if there are no outstanding locks
     * this will allow a new writer, or readers.
     *
     * @see #writeLock
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected synchronized final void writeLock() {

    /**
     * Acquires a lock to begin mutating the document this lock
     * protects.  There can be no writing, notification of changes, or
     * reading going on in order to gain the lock.  Additionally a thread is
     * allowed to gain more than one <code>writeLock</code>,
     * as long as it doesn't attempt to gain additional <code>writeLock</code>s
     * from within document notification.  Attempting to gain a
     * <code>writeLock</code> from within a DocumentListener notification will
     * result in an <code>IllegalStateException</code>.  The ability
     * to obtain more than one <code>writeLock</code> per thread allows
     * subclasses to gain a writeLock, perform a number of operations, then
     * release the lock.
     * <p>
     * Calls to <code>writeLock</code>
     * must be balanced with calls to <code>writeUnlock</code>, else the
     * <code>Document</code> will be left in a locked state so that no
     * reading or writing can be done.
     *
     * @exception IllegalStateException thrown on illegal lock
     *  attempt.  If the document is implemented properly, this can
     *  only happen if a document listener attempts to mutate the
     *  document.  This situation violates the bean event model
     *  where order of delivery is not guaranteed and all listeners
     *  should be notified before further mutations are allowed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected synchronized final Thread getCurrentWriter() {

    /**
     * Fetches the current writing thread if there is one.
     * This can be used to distinguish whether a method is
     * being called as part of an existing modification or
     * if a lock needs to be acquired and a new transaction
     * started.
     *
     * @return the thread actively modifying the document
     *  or <code>null</code> if there are no modifications in progress
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected Element createBranchElement(Element parent, AttributeSet a) {

    /**
     * Creates a document branch element, that can contain other elements.
     *
     * @param parent the parent element
     * @param a the attributes
     * @return the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected Element createLeafElement(Element parent, AttributeSet a, int p0, int p1) {

    /**
     * Creates a document leaf element.
     * Hook through which elements are created to represent the
     * document structure.  Because this implementation keeps
     * structure and content separate, elements grow automatically
     * when content is extended so splits of existing elements
     * follow.  The document itself gets to decide how to generate
     * elements to give flexibility in the type of elements used.
     *
     * @param parent the parent element
     * @param a the attributes for the element
     * @param p0 the beginning of the range &gt;= 0
     * @param p1 the end of the range &gt;= p0
     * @return the new element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected final Content getContent() {

    /**
     * Gets the content for the document.
     *
     * @return the content
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void dump(PrintStream out) {

    /**
     * Gives a diagnostic dump.
     *
     * @param out the output stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private byte[] calculateBidiLevels( int firstPStart, int lastPEnd ) {

    /**
     * Calculate the levels array for a range of paragraphs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    void updateBidi( DefaultDocumentEvent chng ) {

    /**
     * Update the bidi element structure as a result of the given change
     * to the document.  The given change will be updated to reflect the
     * changes made to the bidi structure.
     *
     * This method assumes that every offset in the model is contained in
     * exactly one paragraph.  This method also assumes that it is called
     * after the change is made to the default element structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected void postRemoveUpdate(DefaultDocumentEvent chng) {

    /**
     * Updates any document structure as a result of text removal.  This
     * method is called after the text has been removed from the Content.
     * This will happen within a write lock. If a subclass
     * of this class reimplements this method, it should delegate to the
     * superclass as well.
     *
     * @param chng a description of the change
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected void removeUpdate(DefaultDocumentEvent chng) {

    /**
     * Updates any document structure as a result of text removal.  This
     * method is called before the text is actually removed from the Content.
     * This will happen within a write lock. If a subclass
     * of this class reimplements this method, it should delegate to the
     * superclass as well.
     *
     * @param chng a description of the change
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected void insertUpdate(DefaultDocumentEvent chng, AttributeSet attr) {

    /**
     * Updates document structure as a result of text insertion.  This
     * will happen within a write lock.  If a subclass of
     * this class reimplements this method, it should delegate to the
     * superclass as well.
     *
     * @param chng a description of the change
     * @param attr the attributes for the change
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected final AttributeContext getAttributeContext() {

    /**
     * Fetches the context for managing attributes.  This
     * method effectively establishes the strategy used
     * for compressing AttributeSet information.
     *
     * @return the context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public abstract Element getParagraphElement(int pos);

    /**
     * Get the paragraph element containing the given position.  Sub-classes
     * must define for themselves what exactly constitutes a paragraph.  They
     * should keep in mind however that a paragraph should at least be the
     * unit of text over which to run the Unicode bidirectional algorithm.
     *
     * @param pos the starting offset &gt;= 0
     * @return the element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    static boolean isLeftToRight(Document doc, int p0, int p1) {

    /**
     * Returns true if the text in the range <code>p0</code> to
     * <code>p1</code> is left to right.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public Element getBidiRootElement() {

    /**
     * Returns the root element of the bidirectional structure for this
     * document.  Its children represent character runs with a given
     * Unicode bidi level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private DocumentFilter.FilterBypass getFilterBypass() {

    /**
     * Returns the <code>FilterBypass</code>. This will create one if one
     * does not yet exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public abstract Element getDefaultRootElement();

    /**
     * Returns the root element that views should be based upon
     * unless some other mechanism for assigning views to element
     * structures is provided.
     *
     * @return the root element
     * @see Document#getDefaultRootElement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public Element[] getRootElements() {

    /**
     * Gets all root elements defined.  Typically, there
     * will only be one so the default implementation
     * is to return the default root element.
     *
     * @return the root element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public final Position getEndPosition() {

    /**
     * Returns a position that represents the end of the document.  The
     * position returned can be counted on to track change and stay
     * located at the end of the document.
     *
     * @return the position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public final Position getStartPosition() {

    /**
     * Returns a position that represents the start of the document.  The
     * position returned can be counted on to track change and stay
     * located at the beginning of the document.
     *
     * @return the position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public synchronized Position createPosition(int offs) throws BadLocationException {

    /**
     * Returns a position that will track change as the document
     * is altered.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param offs the position in the model &gt;= 0
     * @return the position
     * @exception BadLocationException  if the given position does not
     *   represent a valid location in the associated document
     * @see Document#createPosition
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void getText(int offset, int length, Segment txt) throws BadLocationException {

    /**
     * Fetches the text contained within the given portion
     * of the document.
     * <p>
     * If the partialReturn property on the txt parameter is false, the
     * data returned in the Segment will be the entire length requested and
     * may or may not be a copy depending upon how the data was stored.
     * If the partialReturn property is true, only the amount of text that
     * can be returned without creating a copy is returned.  Using partial
     * returns will give better performance for situations where large
     * parts of the document are being scanned.  The following is an example
     * of using the partial return to access the entire document:
     *
     * <pre>
     * &nbsp; int nleft = doc.getDocumentLength();
     * &nbsp; Segment text = new Segment();
     * &nbsp; int offs = 0;
     * &nbsp; text.setPartialReturn(true);
     * &nbsp; while (nleft &gt; 0) {
     * &nbsp;     doc.getText(offs, nleft, text);
     * &nbsp;     // do something with text
     * &nbsp;     nleft -= text.count;
     * &nbsp;     offs += text.count;
     * &nbsp; }
     * </pre>
     *
     * @param offset the starting offset &gt;= 0
     * @param length the number of characters to retrieve &gt;= 0
     * @param txt the Segment object to retrieve the text into
     * @exception BadLocationException  the range given includes a position
     *   that is not a valid position within the document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public String getText(int offset, int length) throws BadLocationException {

    /**
     * Gets a sequence of text from the document.
     *
     * @param offset the starting offset &gt;= 0
     * @param length the number of characters to retrieve &gt;= 0
     * @return the text
     * @exception BadLocationException  the range given includes a position
     *   that is not a valid position within the document
     * @see Document#getText
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    private void handleInsertString(int offs, String str, AttributeSet a)

    /**
     * Performs the actual work of inserting the text; it is assumed the
     * caller has obtained a write lock before invoking this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

    /**
     * Inserts some content into the document.
     * Inserting content causes a write lock to be held while the
     * actual changes are taking place, followed by notification
     * to the observers on the thread that grabbed the write lock.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param offs the starting offset &gt;= 0
     * @param str the string to insert; does nothing with null/empty strings
     * @param a the attributes for the inserted content
     * @exception BadLocationException  the given insert position is not a valid
     *   position within the document
     * @see Document#insertString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void replace(int offset, int length, String text,
                        AttributeSet attrs) throws BadLocationException {

    /**
     * Deletes the region of text from <code>offset</code> to
     * <code>offset + length</code>, and replaces it with <code>text</code>.
     * It is up to the implementation as to how this is implemented, some
     * implementations may treat this as two distinct operations: a remove
     * followed by an insert, others may treat the replace as one atomic
     * operation.
     *
     * @param offset index of child element
     * @param length length of text to delete, may be 0 indicating don't
     *               delete anything
     * @param text text to insert, <code>null</code> indicates no text to insert
     * @param attrs AttributeSet indicating attributes of inserted text,
     *              <code>null</code>
     *              is legal, and typically treated as an empty attributeset,
     *              but exact interpretation is left to the subclass
     * @exception BadLocationException the given position is not a valid
     *            position within the document
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    void handleRemove(int offs, int len) throws BadLocationException {

    /**
     * Performs the actual work of the remove. It is assumed the caller
     * will have obtained a <code>writeLock</code> before invoking this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void remove(int offs, int len) throws BadLocationException {

    /**
     * Removes some content from the document.
     * Removing content causes a write lock to be held while the
     * actual changes are taking place.  Observers are notified
     * of the change on the thread that called this method.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param offs the starting offset &gt;= 0
     * @param len the number of characters to remove &gt;= 0
     * @exception BadLocationException  the given remove position is not a valid
     *   position within the document
     * @see Document#remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public final void putProperty(Object key, Object value) {

    /**
     * A convenience method for storing up a property value.  It is
     * equivalent to:
     * <pre>
     * getDocumentProperties().put(key, value);
     * </pre>
     * If <code>value</code> is <code>null</code> this method will
     * remove the property.
     *
     * @param key the non-<code>null</code> key
     * @param value the property value
     * @see #getDocumentProperties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public final Object getProperty(Object key) {

    /**
     * A convenience method for looking up a property value. It is
     * equivalent to:
     * <pre>
     * getDocumentProperties().get(key);
     * </pre>
     *
     * @param key the non-<code>null</code> property key
     * @return the value of this property or <code>null</code>
     * @see #getDocumentProperties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public UndoableEditListener[] getUndoableEditListeners() {

    /**
     * Returns an array of all the undoable edit listeners
     * registered on this document.
     *
     * @return all of this document's <code>UndoableEditListener</code>s
     *         or an empty array if no undoable edit listeners are
     *         currently registered
     *
     * @see #addUndoableEditListener
     * @see #removeUndoableEditListener
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void removeUndoableEditListener(UndoableEditListener listener) {

    /**
     * Removes an undo listener.
     *
     * @param listener the <code>UndoableEditListener</code> to remove
     * @see Document#removeDocumentListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void addUndoableEditListener(UndoableEditListener listener) {

    /**
     * Adds an undo listener for notification of any changes.
     * Undo/Redo operations performed on the <code>UndoableEdit</code>
     * will cause the appropriate DocumentEvent to be fired to keep
     * the view(s) in sync with the model.
     *
     * @param listener the <code>UndoableEditListener</code> to add
     * @see Document#addUndoableEditListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public DocumentListener[] getDocumentListeners() {

    /**
     * Returns an array of all the document listeners
     * registered on this document.
     *
     * @return all of this document's <code>DocumentListener</code>s
     *         or an empty array if no document listeners are
     *         currently registered
     *
     * @see #addDocumentListener
     * @see #removeDocumentListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void removeDocumentListener(DocumentListener listener) {

    /**
     * Removes a document listener.
     *
     * @param listener the <code>DocumentListener</code> to remove
     * @see Document#removeDocumentListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void addDocumentListener(DocumentListener listener) {

    /**
     * Adds a document listener for notification of any changes.
     *
     * @param listener the <code>DocumentListener</code> to add
     * @see Document#addDocumentListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public int getLength() {

    /**
     * Returns the length of the data.  This is the number of
     * characters of content that represents the users data.
     *
     * @return the length &gt;= 0
     * @see Document#getLength
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void render(Runnable r) {

    /**
     * This allows the model to be safely rendered in the presence
     * of currency, if the model supports being updated asynchronously.
     * The given runnable will be executed in a way that allows it
     * to safely read the model with no changes while the runnable
     * is being executed.  The runnable itself may <em>not</em>
     * make any mutations.
     * <p>
     * This is implemented to acquire a read lock for the duration
     * of the runnables execution.  There may be multiple runnables
     * executing at the same time, and all writers will be blocked
     * while there are active rendering runnables.  If the runnable
     * throws an exception, its lock will be safely released.
     * There is no protection against a runnable that never exits,
     * which will effectively leave the document locked for it's
     * lifetime.
     * <p>
     * If the given runnable attempts to make any mutations in
     * this implementation, a deadlock will occur.  There is
     * no tracking of individual rendering threads to enable
     * detecting this situation, but a subclass could incur
     * the overhead of tracking them and throwing an error.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param r the renderer to execute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public DocumentFilter getDocumentFilter() {

    /**
     * Returns the <code>DocumentFilter</code> that is responsible for
     * filtering of insertion/removal. A <code>null</code> return value
     * implies no filtering is to occur.
     *
     * @since 1.4
     * @see #setDocumentFilter
     * @return the DocumentFilter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void setDocumentFilter(DocumentFilter filter) {

    /**
     * Sets the <code>DocumentFilter</code>. The <code>DocumentFilter</code>
     * is passed <code>insert</code> and <code>remove</code> to conditionally
     * allow inserting/deleting of the text.  A <code>null</code> value
     * indicates that no filtering will occur.
     *
     * @param filter the <code>DocumentFilter</code> used to constrain text
     * @see #getDocumentFilter
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void setAsynchronousLoadPriority(int p) {

    /**
     * Sets the asynchronous loading priority.
     * @param p the new asynchronous loading priority; a value
     *   less than zero indicates that the document should not be
     *   loaded asynchronously
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public int getAsynchronousLoadPriority() {

    /**
     * Gets the asynchronous loading priority.  If less than zero,
     * the document should not be loaded asynchronously.
     *
     * @return the asynchronous loading priority, or <code>-1</code>
     *   if the document should not be loaded asynchronously
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this document.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * document <code>d</code>
     * for its document listeners with the following code:
     *
     * <pre>DocumentListener[] mls = (DocumentListener[])(d.getListeners(DocumentListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this component,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getDocumentListeners
     * @see #getUndoableEditListeners
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected void fireUndoableEditUpdate(UndoableEditEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     *
     * @param e the event
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected void fireRemoveUpdate(DocumentEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     *
     * @param e the event
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected void fireChangedUpdate(DocumentEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     *
     * @param e the event
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected void fireInsertUpdate(DocumentEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the parameters passed into
     * the fire method.
     *
     * @param e the event
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public void setDocumentProperties(Dictionary<Object,Object> x) {

    /**
     * Replaces the document properties dictionary for this document.
     *
     * @param x the new dictionary
     * @see #getDocumentProperties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    public Dictionary<Object,Object> getDocumentProperties() {

    /**
     * Supports managing a set of properties. Callers
     * can use the <code>documentProperties</code> dictionary
     * to annotate the document with document-wide properties.
     *
     * @return a non-<code>null</code> <code>Dictionary</code>
     * @see #setDocumentProperties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected AbstractDocument(Content data, AttributeContext context) {

    /**
     * Constructs a new <code>AbstractDocument</code>, wrapped around some
     * specified content storage mechanism.
     *
     * @param data the content
     * @param context the attribute context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
    protected AbstractDocument(Content data) {

    /**
     * Constructs a new <code>AbstractDocument</code>, wrapped around some
     * specified content storage mechanism.
     *
     * @param data the content
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/AbstractDocument.java
public abstract class AbstractDocument implements Document, Serializable {

/**
 * An implementation of the document interface to serve as a
 * basis for implementing various kinds of documents.  At this
 * level there is very little policy, so there is a corresponding
 * increase in difficulty of use.
 * <p>
 * This class implements a locking mechanism for the document.  It
 * allows multiple readers or one writer, and writers must wait until
 * all observers of the document have been notified of a previous
 * change before beginning another mutation to the document.  The
 * read lock is acquired and released using the <code>render</code>
 * method.  A write lock is acquired by the methods that mutate the
 * document, and are held for the duration of the method call.
 * Notification is done on the thread that produced the mutation,
 * and the thread has full read access to the document for the
 * duration of the notification, but other readers are kept out
 * until the notification has finished.  The notification is a
 * beans event notification which does not allow any further
 * mutations until all listeners have been notified.
 * <p>
 * Any models subclassed from this class and used in conjunction
 * with a text component that has a look and feel implementation
 * that is derived from BasicTextUI may be safely updated
 * asynchronously, because all access to the View hierarchy
 * is serialized by BasicTextUI if the document is of type
 * <code>AbstractDocument</code>.  The locking assumes that an
 * independent thread will access the View hierarchy only from
 * the DocumentListener methods, and that there will be only
 * one event thread active at a time.
 * <p>
 * If concurrency support is desired, there are the following
 * additional implications.  The code path for any DocumentListener
 * implementation and any UndoListener implementation must be threadsafe,
 * and not access the component lock if trying to be safe from deadlocks.
 * The <code>repaint</code> and <code>revalidate</code> methods
 * on JComponent are safe.
 * <p>
 * AbstractDocument models an implied break at the end of the document.
 * Among other things this allows you to position the caret after the last
 * character. As a result of this, <code>getLength</code> returns one less
 * than the length of the Content. If you create your own Content, be
 * sure and initialize it to have an additional character. Refer to
 * StringContent and GapContent for examples of this. Another implication
 * of this is that Elements that model the implied end character will have
 * an endOffset == (getLength() + 1). For example, in DefaultStyledDocument
 * <code>getParagraphElement(getLength()).getEndOffset() == getLength() + 1
 * </code>.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author  Timothy Prinzing
 */
