_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
    public int viewToModel(float fx, float fy, Shape a, Position.Bias[] bias) {

    /**
     * Provides a mapping from the view coordinate space to the logical
     * coordinate space of the model.
     *
     * @param fx the X coordinate &gt;= 0.0f
     * @param fy the Y coordinate &gt;= 0.0f
     * @param a the allocated region to render into
     * @return the location within the model that best represents the
     *  given point in the view
     * @see View#viewToModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
    public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

    /**
     * Provides a mapping from the document model coordinate space
     * to the coordinate space of the view mapped to it.
     *
     * @param pos the position to convert &gt;= 0
     * @param a the allocated region to render into
     * @return the bounding box of the given position
     * @exception BadLocationException  if the given position does not
     *   represent a valid location in the associated document
     * @see View#modelToView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
    public int getResizeWeight(int axis) {

    /**
     * Determines the resizability of the view along the
     * given axis.  A value of 0 or less is not resizable.
     *
     * @param axis View.X_AXIS or View.Y_AXIS
     * @return the weight -&gt; 1 for View.X_AXIS, else 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
    public float getPreferredSpan(int axis) {

    /**
     * Determines the preferred span for this view along an
     * axis.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @return   the span the view would like to be rendered into &gt;= 0.
     *           Typically the view is told to render into the span
     *           that is returned, although there is no guarantee.
     *           The parent may choose to resize or break the view.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
    Shape adjustPaintRegion(Shape a) {

    /**
     * Adjusts <code>a</code> based on the visible region and returns it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
    protected Shape adjustAllocation(Shape a) {

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
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
    protected FontMetrics getFontMetrics() {

    /**
     * Fetches the font metrics associated with the component hosting
     * this view.
     *
     * @return the metrics
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
    public FieldView(Element elem) {

    /**
     * Constructs a new FieldView wrapped on an element.
     *
     * @param elem the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/FieldView.java
public class FieldView extends PlainView {

/**
 * Extends the multi-line plain text view to be suitable
 * for a single-line editor view.  If the view is
 * allocated extra space, the field must adjust for it.
 * If the hosting component is a JTextField, this view
 * will manage the ranges of the associated BoundedRangeModel
 * and will adjust the horizontal allocation to match the
 * current visibility settings of the JTextField.
 *
 * @author  Timothy Prinzing
 * @see     View
 */
