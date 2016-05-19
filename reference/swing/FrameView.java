_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    class FrameEditorPane extends JEditorPane implements FrameEditorPaneTag {

    /** Editor pane rendering frame of HTML document
     *  It uses the same editor kits classes as outermost JEditorPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    public float getMaximumSpan(int axis) {

    /**
     * Determines the maximum span for this view along an
     * axis.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *  <code>View.Y_AXIS</code>
     * @return the preferred span; given that we do not
     * support resizing of frames, the maximum span returned
     * is the same as the preferred span
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    public float getMinimumSpan(int axis) {

    /**
     * Determines the minimum span for this view along an
     * axis.
     *
     * @param axis may be either <code>View.X_AXIS</code> or
     *  <code>View.Y_AXIS</code>
     * @return the preferred span; given that we do not
     * support resizing of frames, the minimum span returned
     * is the same as the preferred span
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    private Object movePostData(JEditorPane targetPane, String frameName) {

    /**
     * Move POST data from temporary storage into the target document property.
     *
     * @return the POST data or null if no data found
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    public void changedUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification from the document that attributes were changed
     * in a location that this view is responsible for.  Currently this view
     * handles changes to its SRC attribute.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    public void hyperlinkUpdate(HyperlinkEvent evt) {

    /**
     * Notification of a change relative to a
     * hyperlink. This method searches for the outermost
     * JEditorPane, and then fires an HTMLFrameHyperlinkEvent
     * to that frame.  In addition, if the target is _parent,
     * and there is not nested framesets then the target is
     * reset to _top.  If the target is _top, in addition to
     * firing the event to the outermost JEditorPane, this
     * method also invokes the setPage() method and explicitly
     * replaces the current document with the destination url.
     *
     * @param HyperlinkEvent
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    private boolean inNestedFrameSet() {

    /**
     * Returns true if this frame is contained within
     * a nested frameset.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    JEditorPane getOutermostJEditorPane() {

    /**
     * Finds the outermost FrameSetView.  It then
     * returns that FrameSetView's container.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    private void createScrollPane() {

    /**
     * This method creates the JScrollPane.  The scrollbar policy is determined by
     * the scrolling attribute.  If not defined, the default is "auto" which
     * maps to the scrollbar's being displayed as needed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    private void setBorder() {

    /**
     * If the frameborder attribute has been specified, either in the frame,
     * or by the frames enclosing frameset, the JScrollPane's setBorder()
     * method is invoked to achieve the desired look.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    private void setMargin() {

    /**
     * If the marginwidth or marginheight attributes have been specified,
     * then the JEditorPane's margin's are set to the new values.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    public void paint(Graphics g, Shape allocation) {

    /**
     * Also determines if the FrameView should be editable
     * or not based on whether the JTextComponent that
     * contains it is editable. And then proceeds to call
     * the superclass to do the paint().
     *
     * @param parent View
     * @see text.ComponentView#paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    public void setParent(View parent) {

    /**
     * Sets the parent view for the FrameView.
     * Also determines if the FrameView should be editable
     * or not based on whether the JTextComponent that
     * contains it is editable.
     *
     * @param parent View
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    public FrameView(Element elem) {

    /**
     * Creates a new Frame.
     *
     * @param elem the element to represent.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
    private boolean createdComponent;

    /** Set to true when the component has been created. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/FrameView.java
class FrameView extends ComponentView implements HyperlinkListener {

/**
 * Implements a FrameView, intended to support the HTML
 * &lt;FRAME&gt; tag.  Supports the frameborder, scrolling,
 * marginwidth and marginheight attributes.
 *
 * @author    Sunita Mani
 */
