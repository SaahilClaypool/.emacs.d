_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    static class StyledInsertBreakAction extends StyledTextAction {

    /**
     * StyledInsertBreakAction has similar behavior to that of
     * <code>DefaultEditorKit.InsertBreakAction</code>. That is when
     * its <code>actionPerformed</code> method is invoked, a newline
     * is inserted. Beyond that, this will reset the input attributes to
     * what they were before the newline was inserted.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public void actionPerformed(ActionEvent e) {

        /**
         * Toggles the Underline attribute.
         *
         * @param e the action event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public UnderlineAction() {

        /**
         * Constructs a new UnderlineAction.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public static class UnderlineAction extends StyledTextAction {

    /**
     * An action to toggle the underline attribute.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public void actionPerformed(ActionEvent e) {

        /**
         * Toggles the italic attribute.
         *
         * @param e the action event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public ItalicAction() {

        /**
         * Constructs a new ItalicAction.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public static class ItalicAction extends StyledTextAction {

    /**
     * An action to toggle the italic attribute.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public void actionPerformed(ActionEvent e) {

        /**
         * Toggles the bold attribute.
         *
         * @param e the action event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public BoldAction() {

        /**
         * Constructs a new BoldAction.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public static class BoldAction extends StyledTextAction {

    /**
     * An action to toggle the bold attribute.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public void actionPerformed(ActionEvent e) {

        /**
         * Sets the alignment.
         *
         * @param e the action event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public AlignmentAction(String nm, int a) {

        /**
         * Creates a new AlignmentAction.
         *
         * @param nm the action name
         * @param a the alignment &gt;= 0
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public static class AlignmentAction extends StyledTextAction {

    /**
     * An action to set paragraph alignment.  This sets the
     * <code>StyleConstants.Alignment</code> attribute for the
     * currently selected range of the target JEditorPane.
     * This is done by calling
     * <code>StyledDocument.setParagraphAttributes</code>
     * on the styled document associated with the target
     * JEditorPane.
     * <p>
     * If the target text component is specified as the
     * source of the ActionEvent and there is a command string,
     * the command string will be interpreted as an integer
     * that should be one of the legal values for the
     * <code>StyleConstants.Alignment</code> attribute.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public void actionPerformed(ActionEvent e) {

        /**
         * Sets the foreground color.
         *
         * @param e the action event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public ForegroundAction(String nm, Color fg) {

        /**
         * Creates a new ForegroundAction.
         *
         * @param nm the action name
         * @param fg the foreground color
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public static class ForegroundAction extends StyledTextAction {

    /**
     * An action to set foreground color.  This sets the
     * <code>StyleConstants.Foreground</code> attribute for the
     * currently selected range of the target JEditorPane.
     * This is done by calling
     * <code>StyledDocument.setCharacterAttributes</code>
     * on the styled document associated with the target
     * JEditorPane.
     * <p>
     * If the target text component is specified as the
     * source of the ActionEvent and there is a command string,
     * the command string will be interpreted as the foreground
     * color.  It will be interpreted by called
     * <code>Color.decode</code>, and should therefore be
     * legal input for that method.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public void actionPerformed(ActionEvent e) {

        /**
         * Sets the font size.
         *
         * @param e the action event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public FontSizeAction(String nm, int size) {

        /**
         * Creates a new FontSizeAction.
         *
         * @param nm the action name
         * @param size the font size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public static class FontSizeAction extends StyledTextAction {

    /**
     * An action to set the font size in the associated
     * JEditorPane.  This will use the size specified as
     * the command string on the ActionEvent if there is one,
     * otherwise the size that was initialized with will be used.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public void actionPerformed(ActionEvent e) {

        /**
         * Sets the font family.
         *
         * @param e the event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public FontFamilyAction(String nm, String family) {

        /**
         * Creates a new FontFamilyAction.
         *
         * @param nm the action name
         * @param family the font family
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public static class FontFamilyAction extends StyledTextAction {

    /**
     * An action to set the font family in the associated
     * JEditorPane.  This will use the family specified as
     * the command string on the ActionEvent if there is one,
     * otherwise the family that was initialized with will be used.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        protected final void setParagraphAttributes(JEditorPane editor,
                                           AttributeSet attr, boolean replace) {

        /**
         * Applies the given attributes to paragraphs.  If
         * there is a selection, the attributes are applied
         * to the paragraphs that intersect the selection.
         * if there is no selection, the attributes are applied
         * to the paragraph at the current caret position.
         *
         * @param editor the editor
         * @param attr the attributes
         * @param replace   if true, replace the existing attributes first
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        protected final void setCharacterAttributes(JEditorPane editor,
                                              AttributeSet attr, boolean replace) {

        /**
         * Applies the given attributes to character
         * content.  If there is a selection, the attributes
         * are applied to the selection range.  If there
         * is no selection, the attributes are applied to
         * the input attribute set which defines the attributes
         * for any new text that gets inserted.
         *
         * @param editor the editor
         * @param attr the attributes
         * @param replace   if true, then replace the existing attributes first
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        protected final StyledEditorKit getStyledEditorKit(JEditorPane e) {

        /**
         * Gets the editor kit associated with an editor pane.
         *
         * @param e the editor pane
         * @return the kit
         * @exception IllegalArgumentException for the wrong document type
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        protected final StyledDocument getStyledDocument(JEditorPane e) {

        /**
         * Gets the document associated with an editor pane.
         *
         * @param e the editor
         * @return the document
         * @exception IllegalArgumentException for the wrong document type
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        protected final JEditorPane getEditor(ActionEvent e) {

        /**
         * Gets the target editor for an action.
         *
         * @param e the action event
         * @return the editor
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        public StyledTextAction(String nm) {

        /**
         * Creates a new StyledTextAction from a string action name.
         *
         * @param nm the name of the action
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public abstract static class StyledTextAction extends TextAction {

    /**
     * An action that assumes it's being fired on a JEditorPane
     * with a StyledEditorKit (or subclass) installed.  This has
     * some convenience methods for causing character or paragraph
     * level attribute changes.  The convenience methods will
     * throw an IllegalArgumentException if the assumption of
     * a StyledDocument, a JEditorPane, or a StyledEditorKit
     * fail to be true.
     * <p>
     * The component that gets acted upon by the action
     * will be the source of the ActionEvent if the source
     * can be narrowed to a JEditorPane type.  If the source
     * can't be narrowed, the most recently focused text
     * component is changed.  If neither of these are the
     * case, the action cannot be performed.
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    protected void createInputAttributes(Element element,
                                         MutableAttributeSet set) {

    /**
     * Copies the key/values in <code>element</code>s AttributeSet into
     * <code>set</code>. This does not copy component, icon, or element
     * names attributes. Subclasses may wish to refine what is and what
     * isn't copied here. But be sure to first remove all the attributes that
     * are in <code>set</code>.<p>
     * This is called anytime the caret moves over a different location.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
        void updateInputAttributes(int dot, int mark, JTextComponent c) {

        /**
         * Updates the attributes. <code>dot</code> and <code>mark</code>
         * mark give the positions of the selection in <code>c</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    class AttributeTracker implements CaretListener, PropertyChangeListener, Serializable {

    /**
     * Tracks caret movement and keeps the input attributes set
     * to reflect the current set of attribute definitions at the
     * caret position.
     * <p>This implements PropertyChangeListener to update the
     * input attributes when the Document changes, as if the Document
     * changes the attributes will almost certainly change.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    private AttributeTracker inputAttributeUpdater;

    /**
     * This listener will be attached to the caret of
     * the text component that the EditorKit gets installed
     * into.  This should keep the input attributes updated
     * for use by the styled actions.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    MutableAttributeSet inputAttributes;

    /**
     * This is the set of attributes used to store the
     * input attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    private void createInputAttributeUpdated() {

    /**
     * Creates a new <code>AttributeTracker</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    private void createInputAttributes() {

    /**
     * Creates the AttributeSet used for the selection.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public Object clone() {

    /**
     * Creates a copy of the editor kit.
     *
     * @return the copy
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public ViewFactory getViewFactory() {

   /**
     * Fetches a factory that is suitable for producing
     * views of any models that are produced by this
     * kit.  This is implemented to return View implementations
     * for the following kinds of elements:
     * <ul>
     * <li>AbstractDocument.ContentElementName
     * <li>AbstractDocument.ParagraphElementName
     * <li>AbstractDocument.SectionElementName
     * <li>StyleConstants.ComponentElementName
     * <li>StyleConstants.IconElementName
     * </ul>
     *
     * @return the factory
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public void deinstall(JEditorPane c) {

    /**
     * Called when the kit is being removed from the
     * JEditorPane.  This is used to unregister any
     * listeners that were attached.
     *
     * @param c the JEditorPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public void install(JEditorPane c) {

    /**
     * Called when the kit is being installed into
     * a JEditorPane.
     *
     * @param c the JEditorPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public Document createDefaultDocument() {

    /**
     * Creates an uninitialized text storage model
     * that is appropriate for this type of editor.
     *
     * @return the model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public Action[] getActions() {

    /**
     * Fetches the command list for the editor.  This is
     * the list of commands supported by the superclass
     * augmented by the collection of commands defined
     * locally for style operations.
     *
     * @return the command list
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public Element getCharacterAttributeRun() {

    /**
     * Fetches the element representing the current
     * run of character attributes for the caret.
     *
     * @return the element
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public MutableAttributeSet getInputAttributes() {

    /**
     * Gets the input attributes for the pane.  When
     * the caret moves and there is no selection, the
     * input attributes are automatically mutated to
     * reflect the character attributes of the current
     * caret location.  The styled editing actions
     * use the input attributes to carry out their
     * actions.
     *
     * @return the attribute set
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
    public StyledEditorKit() {

    /**
     * Creates a new EditorKit used for styled documents.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyledEditorKit.java
public class StyledEditorKit extends DefaultEditorKit {

/**
 * This is the set of things needed by a text component
 * to be a reasonably functioning editor for some <em>type</em>
 * of text document.  This implementation provides a default
 * implementation which treats text as styled text and
 * provides a minimal set of actions for editing styled text.
 *
 * @author  Timothy Prinzing
 */
