_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    private void constrainSize(int axis, SizeRequirements want,
                               SizeRequirements min) {

    /**
     * Constrains <code>want</code> to fit in the minimum size specified
     * by <code>min</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    protected void setPropertiesFromAttributes() {

    /**
     * Update any cached values that come from attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    public float getMaximumSpan(int axis) {

    /**
     * Determines the maximum span for this view along an
     * axis.
     *
     * @param axis may be either <code>View.X_AXIS</code>
     *           or <code>View.Y_AXIS</code>
     * @return   the span the view would like to be rendered into &gt;= 0;
     *           typically the view is told to render into the span
     *           that is returned, although there is no guarantee;
     *           the parent may choose to resize or break the view
     * @exception IllegalArgumentException for an invalid axis type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    public float getMinimumSpan(int axis) {

    /**
     * Determines the minimum span for this view along an
     * axis.
     *
     * @param axis may be either <code>View.X_AXIS</code>
     *           or <code>View.Y_AXIS</code>
     * @return  the span the view would like to be rendered into &gt;= 0;
     *           typically the view is told to render into the span
     *           that is returned, although there is no guarantee;
     *           the parent may choose to resize or break the view
     * @exception IllegalArgumentException for an invalid axis type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    public float getPreferredSpan(int axis) {

    /**
     * Determines the preferred span for this view along an
     * axis.
     *
     * @param axis may be either <code>View.X_AXIS</code>
     *           or <code>View.Y_AXIS</code>
     * @return   the span the view would like to be rendered into &gt;= 0;
     *           typically the view is told to render into the span
     *           that is returned, although there is no guarantee;
     *           the parent may choose to resize or break the view
     * @exception IllegalArgumentException for an invalid axis type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    public float getAlignment(int axis) {

    /**
     * Gets the alignment.
     *
     * @param axis may be either X_AXIS or Y_AXIS
     * @return the alignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    public int getResizeWeight(int axis) {

    /**
     * Gets the resize weight.
     *
     * @param axis may be either X_AXIS or Y_AXIS
     * @return the weight
     * @exception IllegalArgumentException for an invalid axis
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    public AttributeSet getAttributes() {

    /**
     * Fetches the attributes to use when rendering.  This is
     * implemented to multiplex the attributes specified in the
     * model with a StyleSheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    public void paint(Graphics g, Shape allocation) {

    /**
     * Renders using the given rendering surface and area on that
     * surface.  This is implemented to delegate to the css box
     * painter to paint the border and background prior to the
     * interior.
     *
     * @param g the rendering surface to use
     * @param allocation the allocated region to render into
     * @see View#paint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    protected void layoutMinorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

    /**
     * Performs layout for the minor axis of the box (i.e. the
     * axis orthogonal to the axis that it represents). The results
     * of the layout (the offset and span for each children) are
     * placed in the given arrays which represent the allocations to
     * the children along the minor axis.
     *
     * @param targetSpan the total span given to the view, which
     *  would be used to layout the children.
     * @param axis the axis being layed out
     * @param offsets the offsets from the origin of the view for
     *  each of the child views; this is a return value and is
     *  filled in by the implementation of this method
     * @param spans the span of each child view; this is a return
     *  value and is filled in by the implementation of this method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    static boolean spanSetFromAttributes(int axis, SizeRequirements r,
                                         CSS.LengthValue cssWidth,
                                         CSS.LengthValue cssHeight) {

    /**
     * Adjust the given requirements to the CSS width or height if
     * it is specified along the applicable axis.  Return true if the
     * size is exactly specified, false if the span is not specified
     * in an attribute or the size specified is a percentage.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {

    /**
     * Calculate the requirements of the block along the minor
     * axis (i.e. the axis orthogonal to the axis along with it tiles).
     * This is implemented
     * to provide the superclass behavior and then adjust it if the
     * CSS width or height attribute is specified and applicable to
     * the axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    protected SizeRequirements calculateMajorAxisRequirements(int axis, SizeRequirements r) {

    /**
     * Calculate the requirements of the block along the major
     * axis (i.e. the axis along with it tiles).  This is implemented
     * to provide the superclass behavior and then adjust it if the
     * CSS width or height attribute is specified and applicable to
     * the axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    public void setParent(View parent) {

    /**
     * Establishes the parent view for this view.  This is
     * guaranteed to be called before any other methods if the
     * parent view is functioning properly.
     * <p>
     * This is implemented
     * to forward to the superclass as well as call the
     * {@link #setPropertiesFromAttributes()}
     * method to set the paragraph properties from the css
     * attributes.  The call is made at this time to ensure
     * the ability to resolve upward through the parents
     * view attributes.
     *
     * @param parent the new parent, or null if the view is
     *  being removed from a parent it was previously added
     *  to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
    public BlockView(Element elem, int axis) {

    /**
     * Creates a new view that represents an
     * html box.  This can be used for a number
     * of elements.
     *
     * @param elem the element to create a view for
     * @param axis either View.X_AXIS or View.Y_AXIS
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/BlockView.java
public class BlockView extends BoxView  {

/**
 * A view implementation to display a block (as a box)
 * with CSS specifications.
 *
 * @author  Timothy Prinzing
 */
