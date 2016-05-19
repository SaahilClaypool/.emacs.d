_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
    protected void removeUpdate(DefaultDocumentEvent chng) {

    /**
     * Updates any document structure as a result of text removal.
     * This will happen within a write lock. Since the structure
     * represents a line map, this just checks to see if the
     * removal spans lines.  If it does, the two lines outside
     * of the removal area are joined together.
     *
     * @param chng the change event describing the edit
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
    protected void insertUpdate(DefaultDocumentEvent chng, AttributeSet attr) {

    /**
     * Updates document structure as a result of text insertion.  This
     * will happen within a write lock.  Since this document simply
     * maps out lines, we refresh the line map.
     *
     * @param chng the change event describing the dit
     * @param attr the set of attributes for the inserted text
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
    public Element getParagraphElement(int pos){

    /**
     * Get the paragraph element containing the given position.  Since this
     * document only models lines, it returns the line instead.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
    protected AbstractElement createDefaultRoot() {

    /**
     * Creates the root element to be used to represent the
     * default document structure.
     *
     * @return the element base
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
    public Element getDefaultRootElement() {

    /**
     * Gets the default root element for the document model.
     *
     * @return the root
     * @see Document#getDefaultRootElement
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
    public PlainDocument(Content c) {

    /**
     * Constructs a plain text document.  A default root element is created,
     * and the tab size set to 8.
     *
     * @param c  the container for the content
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
    public PlainDocument() {

    /**
     * Constructs a plain text document.  A default model using
     * <code>GapContent</code> is constructed and set.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
    public static final String lineLimitAttribute = "lineLimit";

    /**
     * Name of the attribute that specifies the maximum
     * length of a line, if there is a maximum length.
     * The type for the value is Integer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
    public static final String tabSizeAttribute = "tabSize";

    /**
     * Name of the attribute that specifies the tab
     * size for tabs contained in the content.  The
     * type for the value is Integer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/PlainDocument.java
public class PlainDocument extends AbstractDocument {

/**
 * A plain document that maintains no character attributes.  The
 * default element structure for this document is a map of the lines in
 * the text.  The Element returned by getDefaultRootElement is
 * a map of the lines, and each child element represents a line.
 * This model does not maintain any character level attributes,
 * but each line can be tagged with an arbitrary set of attributes.
 * Line to offset, and offset to line translations can be quickly
 * performed using the default root element.  The structure information
 * of the DocumentEvent's fired by edits will indicate the line
 * structure changes.
 * <p>
 * The default content storage management is performed by a
 * gapped buffer implementation (GapContent).  It supports
 * editing reasonably large documents with good efficiency when
 * the edits are contiguous or clustered, as is typical.
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
