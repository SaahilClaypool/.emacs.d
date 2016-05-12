_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        public void removeUpdate(DocumentEvent changes, Shape a, ViewFactory f) {

        /**
         * Gives notification that something was removed from the document
         * in a location that this view is responsible for.
         *
         * @param changes the change information from the associated document
         * @param a the current allocation of the view
         * @param f the factory to use to rebuild if the view has children
         * @see View#removeUpdate
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        public void insertUpdate(DocumentEvent changes, Shape a, ViewFactory f) {

        /**
         * Gives notification that something was inserted into the document
         * in a location that this view is responsible for.
         *
         * @param changes the change information from the associated document
         * @param a the current allocation of the view
         * @param f the factory to use to rebuild if the view has children
         * @see View#insertUpdate
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        public int viewToModel(float fx, float fy, Shape a, Position.Bias[] bias) {

        /**
         * Provides a mapping from the view coordinate space to the logical
         * coordinate space of the model.
         *
         * @param fx the X coordinate >= 0.0f
         * @param fy the Y coordinate >= 0.0f
         * @param a the allocated region to render into
         * @return the location within the model that best represents the
         *  given point in the view
         * @see View#viewToModel
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        public Shape modelToView(int p0, Position.Bias b0,
                                 int p1, Position.Bias b1, Shape a)

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.
         *
         * @param p0 the position to convert >= 0
         * @param b0 the bias toward the previous character or the
         *  next character represented by p0, in case the
         *  position is a boundary of two views.
         * @param p1 the position to convert >= 0
         * @param b1 the bias toward the previous character or the
         *  next character represented by p1, in case the
         *  position is a boundary of two views.
         * @param a the allocated region to render into
         * @return the bounding box of the given position is returned
         * @exception BadLocationException  if the given position does
         *   not represent a valid location in the associated document
         * @exception IllegalArgumentException for an invalid bias argument
         * @see View#viewToModel
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.
         *
         * @param pos the position to convert >= 0
         * @param a the allocated region to render into
         * @return the bounding box of the given position
         * @exception BadLocationException  if the given position does not
         *   represent a valid location in the associated document
         * @see View#modelToView
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        public int getResizeWeight(int axis) {

        /**
         * Determines the resizability of the view along the
         * given axis.  A value of 0 or less is not resizable.
         *
         * @param axis View.X_AXIS or View.Y_AXIS
         * @return the weight -> 1 for View.X_AXIS, else 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        public void paint(Graphics g, Shape a) {

        /**
         * Renders using the given rendering surface and area on that surface.
         * The view may need to do layout and create child views to enable
         * itself to render into the given allocation.
         *
         * @param g the rendering surface to use
         * @param a the allocated region to render into
         *
         * @see View#paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        void updateVisibilityModel() {

        /**
         * Update the visibility model with the associated JTextField
         * (if there is one) to reflect the current visibility as a
         * result of changes to the document model.  The bounded
         * range properties are updated.  If the view hasn't yet been
         * shown the extent will be zero and we just set it to be full
         * until determined otherwise.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        Shape adjustAllocation(Shape a) {

        /**
         * Adjusts the allocation given to the view
         * to be a suitable allocation for a text field.
         * If the view has been allocated more than the
         * preferred span vertically, the allocation is
         * changed to be centered vertically.  Horizontally
         * the view is adjusted according to the horizontal
         * alignment property set on the associated JTextField
         * (if that is the type of the hosting component).
         *
         * @param a the allocation given to the view, which may need
         *  to be adjusted.
         * @return the allocation that the superclass should use.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
        public int getFlowSpan(int index) {

        /**
         * Fetch the constraining span to flow against for
         * the given child index.  There is no limit for
         * a field since it scrolls, so this is implemented to
         * return <code>Integer.MAX_VALUE</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
    static class I18nFieldView extends ParagraphView {

    /**
     * A field view that support bidirectional text via the
     * support provided by ParagraphView.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
    public View create(Element elem) {

    /**
     * Creates a view (FieldView) based on an element.
     *
     * @param elem the element
     * @return the view
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
    protected String getPropertyPrefix() {

    /**
     * Fetches the name used as a key to lookup properties through the
     * UIManager.  This is used as a prefix to all the standard
     * text properties.
     *
     * @return the name ("TextField")
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
    public BasicTextFieldUI() {

    /**
     * Creates a new BasicTextFieldUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates a UI for a JTextField.
     *
     * @param c the text field
     * @return the UI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicTextFieldUI.java
public class BasicTextFieldUI extends BasicTextUI {

/**
 * Basis of a look and feel for a JTextField.
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
