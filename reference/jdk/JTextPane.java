_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JTextPane</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JTextPane</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public final void setEditorKit(EditorKit kit) {

    /**
     * Sets the currently installed kit for handling
     * content.  This is the bound property that
     * establishes the content type of the editor.
     *
     * @param kit the desired editor behavior
     * @exception IllegalArgumentException if kit is not a
     *          <code>StyledEditorKit</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    protected EditorKit createDefaultEditorKit() {

    /**
     * Creates the <code>EditorKit</code> to use by default.  This
     * is implemented to return <code>javax.swing.text.StyledEditorKit</code>.
     *
     * @return the editor kit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code> in
     * <code>JComponent</code> for more
     * information about serialization in Swing.
     *
     * @param s the output stream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    private static final String uiClassID = "TextPaneUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    protected final StyledEditorKit getStyledEditorKit() {

    /**
     * Gets the editor kit.
     *
     * @return the editor kit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public MutableAttributeSet getInputAttributes() {

    /**
     * Gets the input attributes for the pane.
     *
     * @return the attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public void setParagraphAttributes(AttributeSet attr, boolean replace) {

    /**
     * Applies the given attributes to paragraphs.  If
     * there is a selection, the attributes are applied
     * to the paragraphs that intersect the selection.
     * If there is no selection, the attributes are applied
     * to the paragraph at the current caret position.
     *
     * @param attr the non-<code>null</code> attributes
     * @param replace if true, replace the existing attributes first
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public AttributeSet getParagraphAttributes() {

    /**
     * Fetches the current paragraph attributes in effect
     * at the location of the caret, or <code>null</code> if none.
     *
     * @return the attributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public void setCharacterAttributes(AttributeSet attr, boolean replace) {

    /**
     * Applies the given attributes to character
     * content.  If there is a selection, the attributes
     * are applied to the selection range.  If there
     * is no selection, the attributes are applied to
     * the input attribute set which defines the attributes
     * for any new text that gets inserted.
     *
     * @param attr the attributes
     * @param replace if true, then replace the existing attributes first
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public AttributeSet getCharacterAttributes() {

    /**
     * Fetches the character attributes in effect at the
     * current location of the caret, or <code>null</code>.
     *
     * @return the attributes, or <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public Style getLogicalStyle() {

    /**
     * Fetches the logical style assigned to the paragraph represented
     * by the current position of the caret, or <code>null</code>.
     *
     * @return the <code>Style</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public void setLogicalStyle(Style s) {

    /**
     * Sets the logical style to use for the paragraph at the
     * current caret position.  If attributes aren't explicitly set
     * for character and paragraph attributes they will resolve
     * through the logical style assigned to the paragraph, which
     * in term may resolve through some hierarchy completely
     * independent of the element hierarchy in the document.
     *
     * @param s  the logical style to assign to the paragraph,
     *          or <code>null</code> for no style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public Style getStyle(String nm) {

    /**
     * Fetches a named non-<code>null</code> style previously added.
     *
     * @param nm  the name of the style
     * @return the <code>Style</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public void removeStyle(String nm) {

    /**
     * Removes a named non-<code>null</code> style previously added to
     * the document.
     *
     * @param nm  the name of the style to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public Style addStyle(String nm, Style parent) {

    /**
     * Adds a new style into the logical style hierarchy.  Style attributes
     * resolve from bottom up so an attribute specified in a child
     * will override an attribute specified in the parent.
     *
     * @param nm   the name of the style (must be unique within the
     *   collection of named styles).  The name may be <code>null</code>
     *   if the style is unnamed, but the caller is responsible
     *   for managing the reference returned as an unnamed style can't
     *   be fetched by name.  An unnamed style may be useful for things
     *   like character attribute overrides such as found in a style
     *   run.
     * @param parent the parent style.  This may be <code>null</code>
     *   if unspecified
     *   attributes need not be resolved in some other style.
     * @return the new <code>Style</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public void insertIcon(Icon g) {

    /**
     * Inserts an icon into the document as a replacement
     * for the currently selected content.  If there is no
     * selection the icon is effectively inserted at the
     * current position of the caret.  This is represented in
     * the associated document as an attribute of one character
     * of content.
     *
     * @param g    the icon to insert
     * @see Icon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public void insertComponent(Component c) {

    /**
     * Inserts a component into the document as a replacement
     * for the currently selected content.  If there is no
     * selection the component is effectively inserted at the
     * current position of the caret.  This is represented in
     * the associated document as an attribute of one character
     * of content.
     * <p>
     * The component given is the actual component used by the
     * JTextPane.  Since components cannot be a child of more than
     * one container, this method should not be used in situations
     * where the model is shared by text components.
     * <p>
     * The component is placed relative to the text baseline
     * according to the value returned by
     * <code>Component.getAlignmentY</code>.  For Swing components
     * this value can be conveniently set using the method
     * <code>JComponent.setAlignmentY</code>.  For example, setting
     * a value of <code>0.75</code> will cause 75 percent of the
     * component to be above the baseline, and 25 percent of the
     * component to be below the baseline.
     *
     * @param c    the component to insert
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    @Override

    /**
     * Replaces the currently selected content with new content
     * represented by the given string.  If there is no selection
     * this amounts to an insert of the given text.  If there
     * is no replacement text this amounts to a removal of the
     * current selection.  The replacement text will have the
     * attributes currently defined for input at the point of
     * insertion.  If the document is not editable, beep and return.
     *
     * @param content  the content to replace the selection with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public StyledDocument getStyledDocument() {

    /**
     * Fetches the model associated with the editor.
     *
     * @return the model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public void setStyledDocument(StyledDocument doc) {

    /**
     * Associates the editor with a text document.
     * The currently registered factory is used to build a view for
     * the document, which gets displayed by the editor.
     *
     * @param doc  the document to display/edit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public void setDocument(Document doc) {

    /**
     * Associates the editor with a text document.  This
     * must be a <code>StyledDocument</code>.
     *
     * @param doc  the document to display/edit
     * @exception IllegalArgumentException  if <code>doc</code> can't
     *   be narrowed to a <code>StyledDocument</code> which is the
     *   required type of model for this text component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public String getUIClassID() {

    /**
     * Returns the class ID for the UI.
     *
     * @return the string "TextPaneUI"
     *
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public JTextPane(StyledDocument doc) {

    /**
     * Creates a new <code>JTextPane</code>, with a specified document model.
     * A new instance of <code>javax.swing.text.StyledEditorKit</code>
     *  is created and set.
     *
     * @param doc the document model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
    public JTextPane() {

    /**
     * Creates a new <code>JTextPane</code>.  A new instance of
     * <code>StyledEditorKit</code> is
     * created and set, and the document model set to <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JTextPane.java
public class JTextPane extends JEditorPane {

/**
 * A text component that can be marked up with attributes that are
 * represented graphically.
 * You can find how-to information and examples of using text panes in
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/text.html">Using Text Components</a>,
 * a section in <em>The Java Tutorial.</em>
 *
 * <p>
 * This component models paragraphs
 * that are composed of runs of character level attributes.  Each
 * paragraph may have a logical style attached to it which contains
 * the default attributes to use if not overridden by attributes set
 * on the paragraph or character run.  Components and images may
 * be embedded in the flow of text.
 *
 * <dl>
 * <dt><b><font size=+1>Newlines</font></b>
 * <dd>
 * For a discussion on how newlines are handled, see
 * <a href="text/DefaultEditorKit.html">DefaultEditorKit</a>.
 * </dl>
 *
 * <p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
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
 * @beaninfo
 *   attribute: isContainer true
 * description: A text component that can be marked up with attributes that are graphically represented.
 *
 * @author  Timothy Prinzing
 * @see javax.swing.text.StyledEditorKit
 */
