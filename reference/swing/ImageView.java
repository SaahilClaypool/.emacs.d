_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private class ImageLabelView extends InlineView {

    /**
     * ImageLabelView is used if the image can't be loaded, and
     * the attribute specified an alt attribute. It overriden a handle of
     * methods as the text is hardcoded and does not come from the document.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private class ImageHandler implements ImageObserver {

    /**
     * ImageHandler implements the ImageObserver to correctly update the
     * display as new parts of the image become available.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private void safePreferenceChanged() {

    /**
     * Invokes <code>preferenceChanged</code> on the event displatching
     * thread.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private View getAltView() {

    /**
     * Returns the view to use for alternate text. This may be null.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private void updateAltTextView() {

    /**
     * Updates the view representing the alt text.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private void updateImageSize() {

    /**
     * Recreates and reloads the image.  This should
     * only be invoked from <code>refreshImage</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private void loadImage() {

    /**
     * Loads the image from the URL <code>getImageURL</code>. This should
     * only be invoked from <code>refreshImage</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private void refreshImage() {

    /**
     * Loads the image and updates the size accordingly. This should be
     * invoked instead of invoking <code>loadImage</code> or
     * <code>updateImageSize</code> directly.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private void sync() {

    /**
     * Makes sure the necessary properties and image is loaded.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private int getIntAttr(HTML.Attribute name, int deflt) {

    /**
     * Convenience method for getting an integer attribute from the elements
     * AttributeSet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private void repaint(long delay) {

    /**
     * Request that this view be repainted.
     * Assumes the view is still at its last-drawn location.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private float getPreferredSpanFromAltView(int axis) {

    /**
     * Returns the preferred span of the View used to display the alt text,
     * or 0 if the view does not exist.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private boolean hasPixels(Image image) {

    /**
     * Returns true if the passed in image has a non-zero width and height.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private boolean isLink() {

    /**
     * Returns true if this image within a link?
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public void setSize(float width, float height) {

    /**
     * Sets the size of the view.  This should cause
     * layout of the view if it has any layout duties.
     *
     * @param width the width &gt;= 0
     * @param height the height &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
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
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

    /**
     * Provides a mapping from the document model coordinate space
     * to the coordinate space of the view mapped to it.
     *
     * @param pos the position to convert
     * @param a the allocated region to render into
     * @return the bounding box of the given position
     * @exception BadLocationException  if the given position does not represent a
     *   valid location in the associated document
     * @see View#modelToView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public float getAlignment(int axis) {

    /**
     * Determines the desired alignment for this view along an
     * axis.  This is implemented to give the alignment to the
     * bottom of the icon along the y axis, and the default
     * along the x axis.
     *
     * @param axis may be either X_AXIS or Y_AXIS
     * @return the desired alignment; this should be a value
     *   between 0.0 and 1.0 where 0 indicates alignment at the
     *   origin and 1.0 indicates alignment to the full span
     *   away from the origin; an alignment of 0.5 would be the
     *   center of the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public float getPreferredSpan(int axis) {

    /**
     * Determines the preferred span for this view along an
     * axis.
     *
     * @param axis may be either X_AXIS or Y_AXIS
     * @return   the span the view would like to be rendered into;
     *           typically the view is told to render into the span
     *           that is returned, although there is no guarantee;
     *           the parent may choose to resize or break the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public void paint(Graphics g, Shape a) {

    /**
     * Paints the View.
     *
     * @param g the rendering surface to use
     * @param a the allocated region to render into
     * @see View#paint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public void changedUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Invoked when the Elements attributes have changed. Recreates the image.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public void setParent(View parent) {

    /**
     * Establishes the parent view for this view.
     * Seize this moment to cache the AWT Container I'm in.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    protected void setPropertiesFromAttributes() {

    /**
     * Update any cached values that come from attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public String getToolTipText(float x, float y, Shape allocation) {

    /**
     * For images the tooltip text comes from text specified with the
     * <code>ALT</code> attribute. This is overriden to return
     * <code>getAltText</code>.
     *
     * @see JTextComponent#getToolTipText
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public AttributeSet getAttributes() {

    /**
     * Fetches the attributes to use when rendering.  This is
     * implemented to multiplex the attributes specified in the
     * model with a StyleSheet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    protected StyleSheet getStyleSheet() {

    /**
     * Convenience method to get the StyleSheet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public boolean getLoadsSynchronously() {

    /**
     * Returns true if the image should be loaded when first asked for.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public void setLoadsSynchronously(boolean newValue) {

    /**
     * Sets how the image is loaded. If <code>newValue</code> is true,
     * the image we be loaded when first asked for, otherwise it will
     * be loaded asynchronously. The default is to not load synchronously,
     * that is to load the image asynchronously.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public Image getImage() {

    /**
     * Returns the image to render.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public Icon getLoadingImageIcon() {

    /**
     * Returns the icon to use while in the process of loading the image.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public Icon getNoImageIcon() {

    /**
     * Returns the icon to use if the image couldn't be found.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public URL getImageURL() {

    /**
     * Return a URL for the image source,
     * or null if it could not be determined.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public String getAltText() {

    /**
     * Returns the text to display if the image can't be loaded. This is
     * obtained from the Elements attribute set with the attribute name
     * <code>HTML.Attribute.ALT</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    public ImageView(Element elem) {

    /**
     * Creates a new view that represents an IMG element.
     *
     * @param elem the element to create a view for
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private float vAlign;

    /** Alignment along the vertical (Y) axis. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private View altView;

    /**
     * Used for alt text. Will be non-null if the image couldn't be found,
     * and there is valid alt text.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private ImageObserver imageObserver;

    /**
     * We don't directly implement ImageObserver, instead we use an instance
     * that calls back to us.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private int state;

    /** Bitmask containing some of the above bitmask values. Because the
     * image loading notification can happen on another thread access to
     * this is synchronized (at least for modifying it). */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private static final int DEFAULT_BORDER = 2;

    /**
     * Default border to use if one is not specified.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private static final String IMAGE_CACHE_PROPERTY = "imageCache";

    /**
     * Document property for image cache.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private static final String MISSING_IMAGE = "html.missingImage";

    /**
     * Property name for missing image icon
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private static final String PENDING_IMAGE = "html.pendingImage";

    /**
     * Property name for pending image icon
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private static int sIncRate = 100;

    /**
     * Repaint delay when some of the bits are available.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
    private static boolean sIsInc = false;

    /**
     * If true, when some of the bits are available a repaint is done.
     * <p>
     * This is set to false as swing does not offer a repaint that takes a
     * delay. If this were true, a bunch of immediate repaints would get
     * generated that end up significantly delaying the loading of the image
     * (or anything else going on for that matter).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/ImageView.java
public class ImageView extends View {

/**
 * View of an Image, intended to support the HTML &lt;IMG&gt; tag.
 * Supports scaling via the HEIGHT and WIDTH attributes of the tag.
 * If the image is unable to be loaded any text specified via the
 * <code>ALT</code> attribute will be rendered.
 * <p>
 * While this class has been part of swing for a while now, it is public
 * as of 1.4.
 *
 * @author  Scott Violet
 * @see IconView
 * @since 1.4
 */
