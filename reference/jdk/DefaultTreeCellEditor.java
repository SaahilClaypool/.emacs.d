_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
        public Dimension getPreferredSize() {

        /**
         * Returns the preferred size for the <code>Container</code>.
         * This will be at least preferred size of the editor plus
         * <code>offset</code>.
         * @return a <code>Dimension</code> containing the preferred
         *   size for the <code>Container</code>; if
         *   <code>editingComponent</code> is <code>null</code> the
         *   <code>Dimension</code> returned is 0, 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
        private int calculateIconY(Icon icon) {

        /**
         * Calculate the y location for the icon.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
        public void doLayout() {

        /**
         * Lays out this <code>Container</code>.  If editing,
         * the editor will be placed at
         * <code>offset</code> in the x direction and 0 for y.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
        public void paint(Graphics g) {

        /**
         * Overrides <code>Container.paint</code> to paint the node's
         * icon and use the selection color for the background.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public class EditorContainer extends Container {

    /**
     * Container responsible for placing the <code>editingComponent</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
        public Dimension getPreferredSize() {

        /**
         * Overrides <code>JTextField.getPreferredSize</code> to
         * return the preferred size based on current font, if set,
         * or else use renderer's font.
         * @return a <code>Dimension</code> object containing
         *   the preferred size
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
        public Border getBorder() {

        /**
         * Overrides <code>JComponent.getBorder</code> to
         * returns the current border.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
        public void setBorder(Border border) {

        /**
         * Sets the border of this component.<p>
         * This is a bound property.
         *
         * @param border the border to be rendered for this component
         * @see Border
         * @see CompoundBorder
         * @beaninfo
         *        bound: true
         *    preferred: true
         *    attribute: visualUpdate true
         *  description: The component's border.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
        public DefaultTextField(Border border) {

        /**
         * Constructs a
         * <code>DefaultTreeCellEditor.DefaultTextField</code> object.
         *
         * @param border  a <code>Border</code> object
         * @since 1.4
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public class DefaultTextField extends JTextField {

    /**
     * <code>TextField</code> used when no editor is supplied.
     * This textfield locks into the border it is constructed with.
     * It also prefers its parents font over its font. And if the
     * renderer is not <code>null</code> and no font
     * has been specified the preferred height is that of the renderer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    private void cleanupAfterEditing() {

    /**
     * Cleans up any state after editing has completed. Removes the
     * <code>editingComponent</code> the <code>editingContainer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected TreeCellEditor createTreeCellEditor() {

    /**
     * This is invoked if a <code>TreeCellEditor</code>
     * is not supplied in the constructor.
     * It returns a <code>TextField</code> editor.
     * @return a new <code>TextField</code> editor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected Container createContainer() {

    /**
     * Creates the container to manage placement of
     * <code>editingComponent</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected void prepareForEditing() {

    /**
     * Invoked just before editing is to start. Will add the
     * <code>editingComponent</code> to the
     * <code>editingContainer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected boolean inHitRegion(int x, int y) {

    /**
     * Returns true if the passed in location is a valid mouse location
     * to start editing from. This is implemented to return false if
     * <code>x</code> is &lt;= the width of the icon and icon gap displayed
     * by the renderer. In other words this returns true if the user
     * clicks over the text part displayed by the renderer, and false
     * otherwise.
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the point
     * @return true if the passed in location is a valid mouse location
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected boolean canEditImmediately(EventObject event) {

    /**
     * Returns true if <code>event</code> is <code>null</code>,
     * or it is a <code>MouseEvent</code> with a click count &gt; 2
     * and <code>inHitRegion</code> returns true.
     * @param event the event being studied
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected void startEditingTimer() {

    /**
     * Starts the editing timer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected boolean shouldStartEditingTimer(EventObject event) {

    /**
     * Returns true if <code>event</code> is a <code>MouseEvent</code>
     * and the click count is 1.
     * @param event  the event being studied
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected void setTree(JTree newTree) {

    /**
     * Sets the tree currently editing for. This is needed to add
     * a selection listener.
     * @param newTree the new tree to be edited
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public void actionPerformed(ActionEvent e) {

    /**
     * Messaged when the timer fires, this will start the editing
     * session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public void valueChanged(TreeSelectionEvent e) {

    /**
     * Resets <code>lastPath</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public CellEditorListener[] getCellEditorListeners() {

    /**
     * Returns an array of all the <code>CellEditorListener</code>s added
     * to this DefaultTreeCellEditor with addCellEditorListener().
     *
     * @return all of the <code>CellEditorListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public void removeCellEditorListener(CellEditorListener l) {

    /**
      * Removes the previously added <code>CellEditorListener</code>.
      * @param l the listener to be removed
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public void addCellEditorListener(CellEditorListener l) {

    /**
     * Adds the <code>CellEditorListener</code>.
     * @param l the listener to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public void cancelCellEditing() {

    /**
     * Messages <code>cancelCellEditing</code> to the
     * <code>realEditor</code> and removes it from this instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public boolean stopCellEditing() {

    /**
     * If the <code>realEditor</code> will allow editing to stop,
     * the <code>realEditor</code> is removed and true is returned,
     * otherwise false is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public boolean shouldSelectCell(EventObject event) {

    /**
     * Messages the <code>realEditor</code> for the return value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public boolean isCellEditable(EventObject event) {

    /**
     * If the <code>realEditor</code> returns true to this
     * message, <code>prepareForEditing</code>
     * is messaged and true is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public Object getCellEditorValue() {

    /**
     * Returns the value currently being edited.
     * @return the value currently being edited
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public Component getTreeCellEditorComponent(JTree tree, Object value,
                                                boolean isSelected,
                                                boolean expanded,
                                                boolean leaf, int row) {

    /**
     * Configures the editor.  Passed onto the <code>realEditor</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public Font getFont() {

    /**
     * Gets the font used for editing.
     *
     * @return the editing <code>Font</code>
     * @see #setFont
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public void setFont(Font font) {

    /**
     * Sets the font to edit with. <code>null</code> indicates
     * the renderers font should be used. This will NOT
     * override any font you have set in the editor
     * the receiver was instantiated with. If <code>null</code>
     * for an editor was passed in a default editor will be
     * created that will pick up this font.
     *
     * @param font  the editing <code>Font</code>
     * @see #getFont
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public Color getBorderSelectionColor() {

    /**
      * Returns the color the border is drawn.
      * @return the border selection color
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public void setBorderSelectionColor(Color newColor) {

    /**
      * Sets the color to use for the border.
      * @param newColor the new border color
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public DefaultTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer,
                                 TreeCellEditor editor) {

    /**
     * Constructs a <code>DefaultTreeCellEditor</code>
     * object for a <code>JTree</code> using the
     * specified renderer and the specified editor. (Use this constructor
     * for specialized editing.)
     *
     * @param tree      a <code>JTree</code> object
     * @param renderer  a <code>DefaultTreeCellRenderer</code> object
     * @param editor    a <code>TreeCellEditor</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    public DefaultTreeCellEditor(JTree tree,
                                 DefaultTreeCellRenderer renderer) {

    /**
     * Constructs a <code>DefaultTreeCellEditor</code>
     * object for a JTree using the specified renderer and
     * a default editor. (Use this constructor for normal editing.)
     *
     * @param tree      a <code>JTree</code> object
     * @param renderer  a <code>DefaultTreeCellRenderer</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected Font                         font;

    /**
     * Font to paint with, <code>null</code> indicates
     * font of renderer is to be used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected transient Icon               editingIcon;

    /** Icon to use when editing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected Color                        borderSelectionColor;

    /** True if the border selection color should be drawn. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected transient int                lastRow;

    /**
     * Row that was last passed into
     * <code>getTreeCellEditorComponent</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected transient Timer              timer;

    /** Used before starting the editing session. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected transient TreePath           lastPath;

    /** Last path that was selected. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected transient JTree              tree;

    /** <code>JTree</code> instance listening too. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected transient int                offset;

    /**
     * Used in editing. Indicates x position to place
     * <code>editingComponent</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected boolean                      canEdit;

    /**
     * As of Java 2 platform v1.4 this field should no longer be used. If
     * you wish to provide similar behavior you should directly override
     * <code>isCellEditable</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    transient protected Component          editingComponent;

    /**
     * Component used in editing, obtained from the
     * <code>editingContainer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected Container                    editingContainer;

    /** Editing container, will contain the <code>editorComponent</code>. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected DefaultTreeCellRenderer      renderer;

    /** Renderer, used to get border and offsets from. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
    protected TreeCellEditor               realEditor;

    /** Editor handling the editing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/tree/DefaultTreeCellEditor.java
public class DefaultTreeCellEditor implements ActionListener, TreeCellEditor,

/**
 * A <code>TreeCellEditor</code>. You need to supply an
 * instance of <code>DefaultTreeCellRenderer</code>
 * so that the icons can be obtained. You can optionally supply
 * a <code>TreeCellEditor</code> that will be layed out according
 * to the icon in the <code>DefaultTreeCellRenderer</code>.
 * If you do not supply a <code>TreeCellEditor</code>,
 * a <code>TextField</code> will be used. Editing is started
 * on a triple mouse click, or after a click, pause, click and
 * a delay of 1200 milliseconds.
 *<p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @see javax.swing.JTree
 *
 * @author Scott Violet
 */
