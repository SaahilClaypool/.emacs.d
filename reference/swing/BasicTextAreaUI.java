_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
            protected void forwardUpdateToView(View v, DocumentEvent e,
                                               Shape a, ViewFactory f) {

            /**
             * Forward the DocumentEvent to the given child view.  This
             * is implemented to reparent the child to the logical view
             * (the children may have been parented by a row in the flow
             * if they fit without breaking) and then execute the superclass
             * behavior.
             *
             * @param v the child view to forward the event to.
             * @param e the change information from the associated document
             * @param a the current allocation of the view
             * @param f the factory to use to rebuild if the view has children
             * @see #forwardUpdate
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
        static class LogicalView extends CompositeView {

        /**
         * This class can be used to represent a logical view for
         * a flow.  It keeps the children updated to reflect the state
         * of the model, gives the logical child views access to the
         * view hierarchy, and calculates a preferred span.  It doesn't
         * do any rendering, layout, or model/view translation.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
        public void setSize(float width, float height) {

        /**
         * Sets the size of the view.  If the size has changed, layout
         * is redone.  The size is the full size of the view including
         * the inset areas.
         *
         * @param width the width >= 0
         * @param height the height >= 0
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
        public int getFlowSpan(int index) {

        /**
         * Fetch the constraining span to flow against for
         * the given child index.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    static class PlainParagraph extends ParagraphView {

    /**
     * Paragraph for representing plain-text lines that support
     * bidirectional text.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    public Component.BaselineResizeBehavior getBaselineResizeBehavior(
            JComponent c) {

    /**
     * Returns an enum indicating how the baseline of the component
     * changes as the size changes.
     *
     * @throws NullPointerException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    public int getBaseline(JComponent c, int width, int height) {

    /**
     * Returns the baseline.
     *
     * @throws NullPointerException {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    public View create(Element elem) {

    /**
     * Creates the view for an element.  Returns a WrappedPlainView or
     * PlainView.
     *
     * @param elem the element
     * @return the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    public Dimension getMinimumSize(JComponent c) {

    /**
     * The method is overridden to take into account caret width.
     *
     * @param c the editor component
     * @return the minimum size
     * @throws IllegalArgumentException if invalid value is passed
     *
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    public Dimension getPreferredSize(JComponent c) {

    /**
     * The method is overridden to take into account caret width.
     *
     * @param c the editor component
     * @return the preferred size
     * @throws IllegalArgumentException if invalid value is passed
     *
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    protected void propertyChange(PropertyChangeEvent evt) {

    /**
     * This method gets called when a bound property is changed
     * on the associated JTextComponent.  This is a hook
     * which UI implementations may change to reflect how the
     * UI displays bound properties of JTextComponent subclasses.
     * This is implemented to rebuild the View when the
     * <em>WrapLine</em> or the <em>WrapStyleWord</em> property changes.
     *
     * @param evt the property change event
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    protected String getPropertyPrefix() {

    /**
     * Fetches the name used as a key to look up properties through the
     * UIManager.  This is used as a prefix to all the standard
     * text properties.
     *
     * @return the name ("TextArea")
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    public BasicTextAreaUI() {

    /**
     * Constructs a new BasicTextAreaUI object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
    public static ComponentUI createUI(JComponent ta) {

    /**
     * Creates a UI for a JTextArea.
     *
     * @param ta a text area
     * @return the UI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTextAreaUI.java
public class BasicTextAreaUI extends BasicTextUI {

/**
 * Provides the look and feel for a plain text editor.  In this
 * implementation the default UI is extended to act as a simple
 * view factory.
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
