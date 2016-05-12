_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    class ChangeUpdateRunnable implements Runnable {

    /**
     * When run this creates a change event for the complete document
     * and fires it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    static class StyleContextChangeHandler extends AbstractChangeHandler {

    /**
     * Added to the StyleContext. When the StyleContext changes, this invokes
     * <code>updateStylesListeningTo</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    static class StyleChangeHandler extends AbstractChangeHandler {

    /**
     * Added to all the Styles. When instances of this receive a
     * stateChanged method, styleChanged is invoked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        abstract void fireStateChanged(DefaultStyledDocument d, ChangeEvent e);

        /** Run the actual class-specific stateChanged() method.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void stateChanged(ChangeEvent e) {

        /**
         * The ChangeListener wrapper which guards against dead documents.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        static List<ChangeListener> getStaleListeners(ChangeListener l) {

        /**
         * Return a list of stale change listeners.
         *
         * A change listener becomes "stale" when its document is cleaned by GC.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        private DocReference doc;

        /** A weak reference to the document object.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        private final static Map<Class, ReferenceQueue<DefaultStyledDocument>> queueMap

        /** Class-specific reference queues.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
            ChangeListener getListener() {

            /**
             * Return a reference to the style change handler object.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    abstract static class AbstractChangeHandler implements ChangeListener {

    /**
     * Base class for style change handlers with support for stale objects detection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        protected AttributeSet oldStyle;

        /** Old style, before setting newStyle. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        protected AbstractElement element;

        /** Element to change resolve parent of. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void undo() throws CannotUndoException {

        /**
         * Undoes a change.
         *
         * @exception CannotUndoException if the change cannot be undone
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void redo() throws CannotRedoException {

        /**
         * Redoes a change.
         *
         * @exception CannotRedoException if the change cannot be redone
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    static class StyleChangeUndoableEdit extends AbstractUndoableEdit {

    /**
     * UndoableEdit for changing the resolve parent of an Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void undo() throws CannotUndoException {

        /**
         * Undoes a change.
         *
         * @exception CannotUndoException if the change cannot be undone
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void redo() throws CannotRedoException {

        /**
         * Redoes a change.
         *
         * @exception CannotRedoException if the change cannot be redone
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public static class AttributeUndoableEdit extends AbstractUndoableEdit {

    /**
     * An UndoableEdit used to remember AttributeSet changes to an
     * Element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        transient boolean offsetLastIndex;

        /** Used to indicate when fracturing that the last leaf should be
         * skipped. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        transient Element fracturedParent;

        /** Parent that contains the fractured child. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        transient ElemChanges[] insertPath;

        /** For insert, path to inserted elements. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        void insertFirstContent(ElementSpec[] specs) {

        /**
         * Inserts the first content. This needs to be separate to handle
         * joining.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        void fractureDeepestLeaf(ElementSpec[] specs) {

        /**
         * Splits the bottommost leaf in <code>path</code>.
         * This is called from insert when the first element is NOT content.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        Element recreateFracturedElement(Element parent, Element toDuplicate) {

        /**
         * Recreates <code>toDuplicate</code>. This is called when an
         * element needs to be created as the result of an insertion. This
         * will recurse and create all the children. This is similar to
         * <code>clone</code>, but deteremines the offsets differently.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        void fractureFrom(ElemChanges[] changed, int startIndex,
                          int endFractureIndex) {

        /**
         * Recreates the elements to the right of the insertion point.
         * This starts at <code>startIndex</code> in <code>changed</code>,
         * and calls duplicate to duplicate existing elements.
         * This will also duplicate the elements along the insertion
         * point, until a depth of <code>endFractureIndex</code> is
         * reached, at which point only the elements to the right of
         * the insertion point are duplicated.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        void fracture(int depth) {

        /**
         * Determines if a fracture needs to be performed. A fracture
         * can be thought of as moving the right part of a tree to a
         * new location, where the right part is determined by what has
         * been inserted. <code>depth</code> is used to indicate a
         * JoinToFracture is needed to an element at a depth
         * of <code>depth</code>. Where the root is 0, 1 is the children
         * of the root...
         * <p>This will invoke <code>fractureFrom</code> if it is determined
         * a fracture needs to happen.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        Element cloneAsNecessary(Element parent, Element clonee, int rmOffs0, int rmOffs1) {

        /**
         * Creates a copy of this element, with a different
         * parent. Children of this element included in the
         * removal range will be discarded.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public Element clone(Element parent, Element clonee) {

        /**
         * Creates a copy of this element, with a different
         * parent.
         *
         * @param parent the parent element
         * @param clonee the element to be cloned
         * @return the copy
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        Element join(Element p, Element left, Element right, int rmOffs0, int rmOffs1) {

        /**
         * Joins the two elements carving out a hole for the
         * given removed range.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        boolean canJoin(Element e0, Element e1) {

        /**
         * Can the two given elements be coelesced together
         * into one element?
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        boolean removeElements(Element elem, int rmOffs0, int rmOffs1) {

        /**
         * Remove the elements from <code>elem</code> in range
         * <code>rmOffs0</code>, <code>rmOffs1</code>. This uses
         * <code>canJoin</code> and <code>join</code> to handle joining
         * the endpoints of the insertion.
         *
         * @return true if elem will no longer have any elements.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        void advance(int n) {

        /**
         * move the current offset forward by n.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        void push(Element e, int index, boolean isFracture) {

        /**
         * Pushes a new element onto the stack that represents
         * the current path.
         * @param record Whether or not the push should be
         *  recorded as an element change or not.
         * @param isFracture true if pushing on an element that was created
         * as the result of a fracture.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        void beginEdits(int offset, int length) {

        /**
         * Initialize the buffer
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        void endEdits(DefaultDocumentEvent de) {

        /**
         * Creates the UndoableEdit record for the edits made
         * in the buffer.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        protected void changeUpdate() {

        /**
         * Updates the element structure in response to a change in the
         * document.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        protected void removeUpdate() {

        /**
         * Updates the element structure in response to a removal from the
         * associated sequence in the document.  Any elements consumed by the
         * span of the removal are removed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        protected void insertUpdate(ElementSpec[] data) {

        /**
         * Inserts an update into the document.
         *
         * @param data the elements to insert
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void change(int offset, int length, DefaultDocumentEvent de) {

        /**
         * Changes content.
         *
         * @param offset the starting offset &gt;= 0
         * @param length the length &gt;= 0
         * @param de the event capturing this edit
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void remove(int offset, int length, DefaultDocumentEvent de) {

        /**
         * Removes content.
         *
         * @param offset the starting offset &gt;= 0
         * @param length the length &gt;= 0
         * @param de the event capturing this edit
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void insert(int offset, int length, ElementSpec[] data,
                                 DefaultDocumentEvent de) {

        /**
         * Inserts new content.
         *
         * @param offset the starting offset &gt;= 0
         * @param length the length &gt;= 0
         * @param data the data to insert
         * @param de the event capturing this edit
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public Element getRootElement() {

        /**
         * Gets the root element.
         *
         * @return the root element
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public ElementBuffer(Element root) {

        /**
         * Creates a new ElementBuffer.
         *
         * @param root the root element
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public class ElementBuffer implements Serializable {

    /**
     * Class to manage changes to the element
     * hierarchy.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public String toString() {

        /**
         * Converts the element to a string.
         *
         * @return the string
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public int getLength() {

        /**
         * Gets the length.
         *
         * @return the length &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public int getOffset() {

        /**
         * Gets the starting offset.
         *
         * @return the offset &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public char[] getArray() {

        /**
         * Gets the array of characters.
         *
         * @return the array
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public AttributeSet getAttributes() {

        /**
         * Gets the element attributes.
         *
         * @return the attribute set
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public short getDirection() {

        /**
         * Gets the direction.
         *
         * @return the direction (JoinPreviousDirection, JoinNextDirection)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void setDirection(short direction) {

        /**
         * Sets the direction.
         *
         * @param direction the direction (JoinPreviousDirection,
         *   JoinNextDirection)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public short getType() {

        /**
         * Gets the element type.
         *
         * @return  the type of the element (StartTagType, EndTagType,
         *  ContentType)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public void setType(short type) {

        /**
         * Sets the element type.
         *
         * @param type the type of the element (StartTagType, EndTagType,
         *  ContentType)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public ElementSpec(AttributeSet a, short type, char[] txt,
                                  int offs, int len) {

        /**
         * Constructor for creating a spec externally for batch
         * input of content and markup into the document.
         *
         * @param a the attributes for the element
         * @param type the type of the element (StartTagType, EndTagType,
         *  ContentType)
         * @param txt the text for the element
         * @param offs the offset into the text &gt;= 0
         * @param len the length of the text &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public ElementSpec(AttributeSet a, short type, int len) {

        /**
         * Constructor for parsing inside the document when
         * the data has already been added, but len information
         * is needed.
         *
         * @param a the attributes for the element
         * @param type the type of the element (StartTagType, EndTagType,
         *  ContentType)
         * @param len the length &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public ElementSpec(AttributeSet a, short type) {

        /**
         * Constructor useful for markup when the markup will not
         * be stored in the document.
         *
         * @param a the attributes for the element
         * @param type the type of the element (StartTagType, EndTagType,
         *  ContentType)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public static final short JoinFractureDirection = 7;

        /**
         * A possible value for getDirection.  This specifies
         * that the data associated with this record should
         * be joined to the fractured element.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public static final short OriginateDirection = 6;

        /**
         * A possible value for getDirection.  This specifies
         * that the data associated with this record should
         * be used to originate a new element.  This would be
         * the normal value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public static final short JoinNextDirection = 5;

        /**
         * A possible value for getDirection.  This specifies
         * that the data associated with this record should
         * be joined to what follows it.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public static final short JoinPreviousDirection = 4;

        /**
         * A possible value for getDirection.  This specifies
         * that the data associated with this record should
         * be joined to what precedes it.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public static final short ContentType = 3;

        /**
         * A possible value for getType.  This specifies
         * that this record type represents content.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public static final short EndTagType = 2;

        /**
         * A possible value for getType.  This specifies
         * that this record type is a end tag and
         * represents markup that specifies the end
         * of an element.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public static final short StartTagType = 1;

        /**
         * A possible value for getType.  This specifies
         * that this record type is a start tag and
         * represents markup that specifies the start
         * of an element.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public static class ElementSpec {

    /**
     * Specification for building elements.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public String getName() {

        /**
         * Gets the name of the element.
         *
         * @return the name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
        public SectionElement() {

        /**
         * Creates a new SectionElement.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    protected class SectionElement extends BranchElement {

    /**
     * Default root element for a document... maps out the
     * paragraphs/lines contained.
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    private transient ChangeUpdateRunnable updateRunnable;

    /** Run to create a change event for the document */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    private transient ChangeListener styleContextChangeListener;

    /** Listens to Styles. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    private transient ChangeListener styleChangeListener;

    /** Listens to Styles. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    private transient Vector<Style> listeningStyles;

    /** Styles listening to. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public static final int BUFFER_SIZE_DEFAULT = 4096;

    /**
     * The default size of the initial content buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    void updateStylesListeningTo() {

    /**
     * Adds a ChangeListener to new styles, and removes ChangeListener from
     * old styles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    ChangeListener createStyleContextChangeListener() {

    /**
     * Returns a new instance of StyleContextChangeHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    ChangeListener createStyleChangeListener() {

    /**
     * Returns a new instance of StyleChangeHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public void removeDocumentListener(DocumentListener listener) {

    /**
     * Removes a document listener.
     *
     * @param listener the listener
     * @see Document#removeDocumentListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public void addDocumentListener(DocumentListener listener) {

    /**
     * Adds a document listener for notification of any changes.
     *
     * @param listener the listener
     * @see Document#addDocumentListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    protected void styleChanged(Style style) {

    /**
     * Called when any of this document's styles have changed.
     * Subclasses may wish to be intelligent about what gets damaged.
     *
     * @param style The Style that has changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Font getFont(AttributeSet attr) {

    /**
     * Gets the font from an attribute set.
     *
     * @param attr the attribute set
     * @return the font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Color getBackground(AttributeSet attr) {

    /**
     * Gets the background color from an attribute set.
     *
     * @param attr the attribute set
     * @return the color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Color getForeground(AttributeSet attr) {

    /**
     * Gets the foreground color from an attribute set.
     *
     * @param attr the attribute set
     * @return the color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    protected AbstractElement createDefaultRoot() {

    /**
     * Creates the root element to be used to represent the
     * default document structure.
     *
     * @return the element base
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    protected void removeUpdate(DefaultDocumentEvent chng) {

    /**
     * Updates document structure as a result of text removal.
     *
     * @param chng a description of the document change
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    short createSpecsForInsertAfterNewline(Element paragraph,
            Element pParagraph, AttributeSet pattr, Vector<ElementSpec> parseBuffer,
                                                 int offset, int endOffset) {

    /**
     * This is called by insertUpdate when inserting after a new line.
     * It generates, in <code>parseBuffer</code>, ElementSpecs that will
     * position the stack in <code>paragraph</code>.<p>
     * It returns the direction the last StartSpec should have (this don't
     * necessarily create the last start spec).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    protected void insertUpdate(DefaultDocumentEvent chng, AttributeSet attr) {

    /**
     * Updates document structure as a result of text insertion.  This
     * will happen within a write lock.  This implementation simply
     * parses the inserted content for line breaks and builds up a set
     * of instructions for the element buffer.
     *
     * @param chng a description of the document change
     * @param attr the attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Element getCharacterElement(int pos) {

    /**
     * Gets a character element based on a position.
     *
     * @param pos the position in the document &gt;= 0
     * @return the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Element getParagraphElement(int pos) {

    /**
     * Gets the paragraph element at the offset <code>pos</code>.
     * A paragraph consists of at least one child Element, which is usually
     * a leaf.
     *
     * @param pos the starting offset &gt;= 0
     * @return the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public void setParagraphAttributes(int offset, int length, AttributeSet s,
                                       boolean replace) {

    /**
     * Sets attributes for a paragraph.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param offset the offset into the paragraph &gt;= 0
     * @param length the number of characters affected &gt;= 0
     * @param s the attributes
     * @param replace whether to replace existing attributes, or merge them
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public void setCharacterAttributes(int offset, int length, AttributeSet s, boolean replace) {

    /**
     * Sets attributes for some part of the document.
     * A write lock is held by this operation while changes
     * are being made, and a DocumentEvent is sent to the listeners
     * after the change has been successfully completed.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param offset the offset in the document &gt;= 0
     * @param length the length &gt;= 0
     * @param s the attributes
     * @param replace true if the previous attributes should be replaced
     *  before setting the new attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Style getLogicalStyle(int p) {

    /**
     * Fetches the logical style assigned to the paragraph
     * represented by the given position.
     *
     * @param p the location to translate to a paragraph
     *  and determine the logical style assigned &gt;= 0.  This
     *  is an offset from the start of the document.
     * @return the style, null if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public void setLogicalStyle(int pos, Style s) {

    /**
     * Sets the logical style to use for the paragraph at the
     * given position.  If attributes aren't explicitly set
     * for character and paragraph attributes they will resolve
     * through the logical style assigned to the paragraph, which
     * in turn may resolve through some hierarchy completely
     * independent of the element hierarchy in the document.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param pos the offset from the start of the document &gt;= 0
     * @param s  the logical style to assign to the paragraph, null if none
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Enumeration<?> getStyleNames() {

    /**
     * Fetches the list of of style names.
     *
     * @return all the style names
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Style getStyle(String nm) {

    /**
     * Fetches a named style previously added.
     *
     * @param nm  the name of the style
     * @return the style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public void removeStyle(String nm) {

    /**
     * Removes a named style previously added to the document.
     *
     * @param nm  the name of the style to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Style addStyle(String nm, Style parent) {

    /**
     * Adds a new style into the logical style hierarchy.  Style attributes
     * resolve from bottom up so an attribute specified in a child
     * will override an attribute specified in the parent.
     *
     * @param nm   the name of the style (must be unique within the
     *   collection of named styles).  The name may be null if the style
     *   is unnamed, but the caller is responsible
     *   for managing the reference returned as an unnamed style can't
     *   be fetched by name.  An unnamed style may be useful for things
     *   like character attribute overrides such as found in a style
     *   run.
     * @param parent the parent style.  This may be null if unspecified
     *   attributes need not be resolved in some other style.
     * @return the style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public void removeElement(Element elem) {

    /**
     * Removes an element from this document.
     *
     * <p>The element is removed from its parent element, as well as
     * the text in the range identified by the element.  If the
     * element isn't associated with the document, {@code
     * IllegalArgumentException} is thrown.</p>
     *
     * <p>As empty branch elements are not allowed in the document, if the
     * element is the sole child, its parent element is removed as well,
     * recursively.  This means that when replacing all the children of a
     * particular element, new children should be added <em>before</em>
     * removing old children.
     *
     * <p>Element removal results in two events being fired, the
     * {@code DocumentEvent} for changes in element structure and {@code
     * UndoableEditEvent} for changes in document content.</p>
     *
     * <p>If the element contains end-of-content mark (the last {@code
     * "\n"} character in document), this character is not removed;
     * instead, preceding leaf element is extended to cover the
     * character.  If the last leaf already ends with {@code "\n",} it is
     * included in content removal.</p>
     *
     * <p>If the element is {@code null,} {@code NullPointerException} is
     * thrown.  If the element structure would become invalid after the removal,
     * for example if the element is the document root element, {@code
     * IllegalArgumentException} is thrown.  If the current element structure is
     * invalid, {@code IllegalStateException} is thrown.</p>
     *
     * @param  elem                      the element to remove
     * @throws NullPointerException      if the element is {@code null}
     * @throws IllegalArgumentException  if the element could not be removed
     * @throws IllegalStateException     if the element structure is invalid
     *
     * @since  1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    protected void insert(int offset, ElementSpec[] data) throws BadLocationException {

    /**
     * Inserts new elements in bulk.  This is useful to allow
     * parsing with the document in an unlocked state and
     * prepare an element structure modification.  This method
     * takes an array of tokens that describe how to update an
     * element structure so the time within a write lock can
     * be greatly reduced in an asynchronous update situation.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param offset the starting offset &gt;= 0
     * @param data the element data
     * @exception BadLocationException for an invalid starting offset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    protected void create(ElementSpec[] data) {

    /**
     * Initialize the document to reflect the given element
     * structure (i.e. the structure reported by the
     * <code>getDefaultRootElement</code> method.  If the
     * document contained any data it will first be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public Element getDefaultRootElement() {

    /**
     * Gets the default root element.
     *
     * @return the root
     * @see Document#getDefaultRootElement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public DefaultStyledDocument() {

    /**
     * Constructs a default styled document.  This buffers
     * input content by a size of <em>BUFFER_SIZE_DEFAULT</em>
     * and has a style context that is scoped by the lifetime
     * of the document and is not shared with other documents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public DefaultStyledDocument(StyleContext styles) {

    /**
     * Constructs a styled document with the default content
     * storage implementation and a shared set of styles.
     *
     * @param styles the styles
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
    public DefaultStyledDocument(Content c, StyleContext styles) {

    /**
     * Constructs a styled document.
     *
     * @param c  the container for the content
     * @param styles resources and style definitions which may
     *  be shared across documents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/DefaultStyledDocument.java
public class DefaultStyledDocument extends AbstractDocument implements StyledDocument {

/**
 * A document that can be marked up with character and paragraph
 * styles in a manner similar to the Rich Text Format.  The element
 * structure for this document represents style crossings for
 * style runs.  These style runs are mapped into a paragraph element
 * structure (which may reside in some other structure).  The
 * style runs break at paragraph boundaries since logical styles are
 * assigned to paragraph boundaries.
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
 * @see     Document
 * @see     AbstractDocument
 */
