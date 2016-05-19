_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private VolatileImage getImage(GraphicsConfiguration config, JComponent c,
                                   int w, int h, Object[] extendedCacheKeys) {

    /** Gets the rendered image for this painter at the requested size, either from cache or create a new one */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
        public PaintContext(Insets insets, Dimension canvasSize, boolean inverted,
                            CacheMode cacheMode, double maxH, double maxV) {

        /**
         * Creates a new PaintContext.
         *
         * @param insets The stretching insets. May be null. If null, then assumed to be 0, 0, 0, 0.
         * @param canvasSize The size of the canvas used when encoding the various x/y values. May be null.
         *                   If null, then it is assumed that there are no encoded values, and any calls
         *                   to one of the "decode" methods will return the passed in value.
         * @param inverted Whether to "invert" the meaning of the 9-square grid and stretching insets
         * @param cacheMode A hint as to which caching mode to use. If null, then set to no caching.
         * @param maxH The maximum scale in the horizontal direction to use before punting and redrawing from scratch.
         *             For example, if maxH is 2, then we will attempt to scale any cached images up to 2x the canvas
         *             width before redrawing from scratch. Reasonable maxH values may improve painting performance.
         *             If set too high, then you may get poor looking graphics at higher zoom levels. Must be &gt;= 1.
         * @param maxV The maximum scale in the vertical direction to use before punting and redrawing from scratch.
         *             For example, if maxV is 2, then we will attempt to scale any cached images up to 2x the canvas
         *             height before redrawing from scratch. Reasonable maxV values may improve painting performance.
         *             If set too high, then you may get poor looking graphics at higher zoom levels. Must be &gt;= 1.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
        public PaintContext(Insets insets, Dimension canvasSize, boolean inverted) {

        /**
         * Creates a new PaintContext which does not attempt to cache or scale any cached
         * images.
         *
         * @param insets The stretching insets. May be null. If null, then assumed to be 0, 0, 0, 0.
         * @param canvasSize The size of the canvas used when encoding the various x/y values. May be null.
         *                   If null, then it is assumed that there are no encoded values, and any calls
         *                   to one of the "decode" methods will return the passed in value.
         * @param inverted Whether to "invert" the meaning of the 9-square grid and stretching insets
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected static class PaintContext {

    /**
     * A class encapsulating state useful when painting. Generally, instances of this
     * class are created once, and reused for each paint request without modification.
     * This class contains values useful when hinting the cache engine, and when decoding
     * control points and bezier curve anchors.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected final Color getComponentColor(JComponent c, String property,
                                            Color defaultColor,
                                            float saturationOffset,
                                            float brightnessOffset,
                                            int alphaOffset) {

    /**
     * Get a color property from the given JComponent. First checks for a
     * <code>getXXX()</code> method and if that fails checks for a client
     * property with key <code>property</code>. If that still fails to return
     * a Color then <code>defaultColor</code> is returned.
     *
     * @param c The component to get the color property from
     * @param property The name of a bean style property or client property
     * @param defaultColor The color to return if no color was obtained from
     *        the component.
     * @return The color that was obtained from the component or defaultColor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected final RadialGradientPaint decodeRadialGradient(float x, float y, float r, float[] midpoints, Color[] colors) {

    /**
     * Given parameters for creating a RadialGradientPaint, this method will
     * create and return a radial gradient paint. One primary purpose for this
     * method is to avoid creating a RadialGradientPaint where the radius
     * is non-positive. In such a case, the radius is just slightly
     * increased to avoid 0.
     *
     * @param x
     * @param y
     * @param r
     * @param midpoints
     * @param colors
     * @return a valid RadialGradientPaint. This method never returns null.
     * @throws NullPointerException
     *      if {@code midpoints} array is null,
     *      or {@code colors} array is null
     * @throws IllegalArgumentException
     *      if {@code r} is non-positive,
     *      or {@code midpoints.length != colors.length},
     *      or {@code colors} is less than 2 in size,
     *      or a {@code midpoints} value is less than 0.0 or greater than 1.0,
     *      or the {@code midpoints} are not provided in strictly increasing order
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected final LinearGradientPaint decodeGradient(float x1, float y1, float x2, float y2, float[] midpoints, Color[] colors) {

    /**
     * Given parameters for creating a LinearGradientPaint, this method will
     * create and return a linear gradient paint. One primary purpose for this
     * method is to avoid creating a LinearGradientPaint where the start and
     * end points are equal. In such a case, the end y point is slightly
     * increased to avoid the overlap.
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param midpoints
     * @param colors
     * @return a valid LinearGradientPaint. This method never returns null.
     * @throws NullPointerException
     *      if {@code midpoints} array is null,
     *      or {@code colors} array is null,
     * @throws IllegalArgumentException
     *      if start and end points are the same points,
     *      or {@code midpoints.length != colors.length},
     *      or {@code colors} is less than 2 in size,
     *      or a {@code midpoints} value is less than 0.0 or greater than 1.0,
     *      or the {@code midpoints} are not provided in strictly increasing order
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected final Color decodeColor(Color color1, Color color2,
                                      float midPoint) {

    /**
     * Decodes and returns a color, which is derived from a offset between two
     * other colors.
     *
     * @param color1   The first color
     * @param color2   The second color
     * @param midPoint The offset between color 1 and color 2, a value of 0.0 is
     *                 color 1 and 1.0 is color 2;
     * @return The derived color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected final Color decodeColor(String key, float hOffset, float sOffset,
                                      float bOffset, int aOffset) {

    /**
     * Decodes and returns a color, which is derived from a base color in UI
     * defaults.
     *
     * @param key     A key corresponding to the value in the UI Defaults table
     *                of UIManager where the base color is defined
     * @param hOffset The hue offset used for derivation.
     * @param sOffset The saturation offset used for derivation.
     * @param bOffset The brightness offset used for derivation.
     * @param aOffset The alpha offset used for derivation. Between 0...255
     * @return The derived color, whose color value will change if the parent
     *         uiDefault color changes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected final float decodeAnchorY(float y, float dy) {

    /**
     * Decodes and returns a float value representing the actual pixel location for
     * the anchor point given the encoded Y value of the control point, and the offset
     * distance to the anchor from that control point.
     *
     * @param y an encoded y value of the bezier control point (0...1, or 1...2, or 2...3)
     * @param dy the offset distance to the anchor from the control point y
     * @return the decoded y position of the control point
     * @throws IllegalArgumentException
     *      if {@code y < 0} or {@code y > 3}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected final float decodeAnchorX(float x, float dx) {

    /**
     * Decodes and returns a float value representing the actual pixel location for
     * the anchor point given the encoded X value of the control point, and the offset
     * distance to the anchor from that control point.
     *
     * @param x an encoded x value of the bezier control point (0...1, or 1...2, or 2...3)
     * @param dx the offset distance to the anchor from the control point x
     * @return the decoded x location of the control point
     * @throws IllegalArgumentException
     *      if {@code x < 0} or {@code x > 3}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected final float decodeY(float y) {

    /**
     * Decodes and returns a float value representing the actual pixel location for
     * the given encoded y value.
     *
     * @param y an encoded y value (0...1, or 1...2, or 2...3)
     * @return the decoded y value
     * @throws IllegalArgumentException
     *      if {@code y < 0} or {@code y > 3}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected final float decodeX(float x) {

    /**
     * Decodes and returns a float value representing the actual pixel location for
     * the given encoded X value.
     *
     * @param x an encoded x value (0...1, or 1...2, or 2...3)
     * @return the decoded x value
     * @throws IllegalArgumentException
     *      if {@code x < 0} or {@code x > 3}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected abstract void doPaint(Graphics2D g, JComponent c, int width,
                                    int height, Object[] extendedCacheKeys);

    /**
     * Actually performs the painting operation. Subclasses must implement this method.
     * The graphics object passed may represent the actual surface being rendered to,
     * or it may be an intermediate buffer. It has also been pre-translated. Simply render
     * the component as if it were located at 0, 0 and had a width of <code>width</code>
     * and a height of <code>height</code>. For performance reasons, you may want to read
     * the clip from the Graphics2D object and only render within that space.
     *
     * @param g The Graphics2D surface to paint to
     * @param c The JComponent related to the drawing event. For example, if the
     *          region being rendered is Button, then <code>c</code> will be a
     *          JButton. If the region being drawn is ScrollBarSlider, then the
     *          component will be JScrollBar. This value may be null.
     * @param width The width of the region to paint. Note that in the case of
     *              painting the foreground, this value may differ from c.getWidth().
     * @param height The height of the region to paint. Note that in the case of
     *               painting the foreground, this value may differ from c.getHeight().
     * @param extendedCacheKeys The result of the call to getExtendedCacheKeys()
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected void configureGraphics(Graphics2D g) {

    /**
     * <p>Configures the given Graphics2D. Often, rendering hints or compositing rules are
     * applied to a Graphics2D object prior to painting, which should affect all of the
     * subsequent painting operations. This method provides a convenient hook for configuring
     * the Graphics object prior to rendering, regardless of whether the render operation is
     * performed to an intermediate buffer or directly to the display.</p>
     *
     * @param g The Graphics2D object to configure. Will not be null.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected abstract PaintContext getPaintContext();

    /**
     * <p>Gets the PaintContext for this painting operation. This method is called on every
     * paint, and so should be fast and produce no garbage. The PaintContext contains
     * information such as cache hints. It also contains data necessary for decoding
     * points at runtime, such as the stretching insets, the canvas size at which the
     * encoded points were defined, and whether the stretching insets are inverted.</p>
     *
     * <p> This method allows for subclasses to package the painting of different states
     * with possibly different canvas sizes, etc, into one AbstractRegionPainter implementation.</p>
     *
     * @return a PaintContext associated with this paint operation.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected Object[] getExtendedCacheKeys(JComponent c) {

    /**
     * Get any extra attributes which the painter implementation would like
     * to include in the image cache lookups. This is checked for every call
     * of the paint(g, c, w, h) method.
     *
     * @param c The component on the current paint call
     * @return Array of extra objects to be included in the cache key
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    @Override

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    protected AbstractRegionPainter() { }

    /**
     * Create a new AbstractRegionPainter
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float bottomScale;

    /**
     * The scaling factor to use for the bottom section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float rightScale;

    /**
     * The scaling factor to use for the right section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float centerVScale;

    /**
     * The scaling factor to use for the center section, in the vertical
     * direction. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float centerHScale;

    /**
     * The scaling factor to use for the center section, in the horizontal
     * direction. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float topScale;

    /**
     * The scaling factor to use for the top section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float leftScale;

    /**
     * The scaling factor to use for the left section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float bottomHeight;

    /**
     * The height of the bottom section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float rightWidth;

    /**
     * The width of the right section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float centerHeight;

    /**
     * The height of the center section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float centerWidth;

    /**
     * The width of the center section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float topHeight;

    /**
     * The height of the top section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float leftWidth;

    /**
     * The width of the left section. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private float f;

    /**
     * The scaling factor. Recomputed on each call to paint.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
    private PaintContext ctx;

    /**
     * PaintContext, which holds a lot of the state needed for cache hinting and x/y value decoding
     * The data contained within the context is typically only computed once and reused over
     * multiple paint calls, whereas the other values (w, h, f, leftWidth, etc) are recomputed
     * for each call to paint.
     *
     * This field is retrieved from subclasses on each paint operation. It is up
     * to the subclass to compute and cache the PaintContext over multiple calls.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/AbstractRegionPainter.java
public abstract class AbstractRegionPainter implements Painter<JComponent> {

/**
 * Convenient base class for defining Painter instances for rendering a
 * region or component in Nimbus.
 *
 * @author Jasper Potts
 * @author Richard Bair
 */
