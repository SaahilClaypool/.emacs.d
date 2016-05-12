_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FrameSetView.java
    private void spread(int targetSpan, int span[]) {

    /**
     * This method is responsible for returning in span[] the
     * span for each child view along the major axis.  it
     * computes this based on the information that extracted
     * from the value of the ROW/COL attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FrameSetView.java
    protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets,
                                   int[] spans) {

    /**
     * Perform layout for the major axis of the box (i.e. the
     * axis that it represents).  The results of the layout should
     * be placed in the given arrays which represent the allocations
     * to the children along the major axis.
     *
     * @param targetSpan the total span given to the view, which
     *  would be used to layout the children
     * @param axis the axis being layed out
     * @param offsets the offsets from the origin of the view for
     *  each of the child views; this is a return value and is
     *  filled in by the implementation of this method
     * @param spans the span of each child view; this is a return
     *  value and is filled in by the implementation of this method
     * @return the offset and span for each child view in the
     *  offsets and spans parameters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FrameSetView.java
    private void init() {

    /**
     * Initializes a number of internal state variables
     * that store information about space allocation
     * for the frames contained within the frameset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FrameSetView.java
    private String[] parseRowColSpec(HTML.Attribute key) {

    /**
     * Parses the ROW or COL attributes and returns
     * an array of strings that represent the space
     * distribution.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FrameSetView.java
    public FrameSetView(Element elem, int axis) {

    /**
     * Constructs a FrameSetView for the given element.
     *
     * @param elem the element that this view is responsible for
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/FrameSetView.java
class FrameSetView extends javax.swing.text.BoxView {

/**
 * Implements a FrameSetView, intended to support the HTML
 * &lt;FRAMESET&gt; tag.  Supports the ROWS and COLS attributes.
 *
 * @author  Sunita Mani
 *
 *          Credit also to the hotjava browser engineers that
 *          worked on making the allocation of space algorithms
 *          conform to the HTML 4.0 standard and also be netscape
 *          compatible.
 *
 */
