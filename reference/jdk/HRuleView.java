_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    private AttributeSet attr;

    /** View Attributes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    public AttributeSet getAttributes() {

    /**
     * Fetches the attributes to use when rendering.  This is
     * implemented to multiplex the attributes specified in the
     * model with a StyleSheet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    public int viewToModel(float x, float y, Shape a, Position.Bias[] bias) {

    /**
     * Provides a mapping from the view coordinate space to the logical
     * coordinate space of the model.
     *
     * @param x the X coordinate
     * @param y the Y coordinate
     * @param a the allocated region to render into
     * @return the location within the model that best represents the
     *  given point of view
     * @see View#viewToModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

    /**
     * Provides a mapping from the document model coordinate space
     * to the coordinate space of the view mapped to it.
     *
     * @param pos the position to convert
     * @param a the allocated region to render into
     * @return the bounding box of the given position
     * @exception BadLocationException  if the given position does not
     * represent a valid location in the associated document
     * @see View#modelToView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    public int getBreakWeight(int axis, float pos, float len) {

    /**
     * Determines how attractive a break opportunity in
     * this view is.  This is implemented to request a forced break.
     *
     * @param axis may be either View.X_AXIS or View.Y_AXIS
     * @param pos the potential location of the start of the
     *   broken view (greater than or equal to zero).
     *   This may be useful for calculating tab
     *   positions.
     * @param len specifies the relative length from <em>pos</em>
     *   where a potential break is desired. The value must be greater
     *   than or equal to zero.
     * @return the weight, which should be a value between
     *   ForcedBreakWeight and BadBreakWeight.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    public int getResizeWeight(int axis) {

    /**
     * Gets the resize weight for the axis.
     * The rule is: rigid vertically and flexible horizontally.
     *
     * @param axis may be either X_AXIS or Y_AXIS
     * @return the weight
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    public float getPreferredSpan(int axis) {

    /**
     * Calculates the desired shape of the rule... this is
     * basically the preferred size of the border.
     *
     * @param axis may be either X_AXIS or Y_AXIS
     * @return the desired span
     * @see View#getPreferredSpan
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    public void paint(Graphics g, Shape a) {

    /**
     * Paints the view.
     *
     * @param g the graphics context
     * @param a the allocation region for the view
     * @see View#paint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    protected void setPropertiesFromAttributes() {

    /**
     * Update any cached values that come from attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
    public HRuleView(Element elem) {

    /**
     * Creates a new view that represents an &lt;hr&gt; element.
     *
     * @param elem the element to create a view for
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HRuleView.java
class HRuleView extends View  {

/**
 * A view implementation to display an html horizontal
 * rule.
 *
 * @author  Timothy Prinzing
 * @author  Sara Swanson
 */
