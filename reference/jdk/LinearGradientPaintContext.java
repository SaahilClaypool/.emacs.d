_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LinearGradientPaintContext.java
    protected void fillRaster(int[] pixels, int off, int adjust,
                              int x, int y, int w, int h)

    /**
     * Return a Raster containing the colors generated for the graphics
     * operation.  This is where the area is filled with colors distributed
     * linearly.
     *
     * @param x,y,w,h the area in device space for which colors are
     * generated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LinearGradientPaintContext.java
    LinearGradientPaintContext(LinearGradientPaint paint,
                               ColorModel cm,
                               Rectangle deviceBounds,
                               Rectangle2D userBounds,
                               AffineTransform t,
                               RenderingHints hints,
                               Point2D start,
                               Point2D end,
                               float[] fractions,
                               Color[] colors,
                               CycleMethod cycleMethod,
                               ColorSpaceType colorSpace)

    /**
     * Constructor for LinearGradientPaintContext.
     *
     * @param paint the {@code LinearGradientPaint} from which this context
     *              is created
     * @param cm {@code ColorModel} that receives
     *           the <code>Paint</code> data. This is used only as a hint.
     * @param deviceBounds the device space bounding box of the
     *                     graphics primitive being rendered
     * @param userBounds the user space bounding box of the
     *                   graphics primitive being rendered
     * @param t the {@code AffineTransform} from user
     *          space into device space (gradientTransform should be
     *          concatenated with this)
     * @param hints the hints that the context object uses to choose
     *              between rendering alternatives
     * @param start gradient start point, in user space
     * @param end gradient end point, in user space
     * @param fractions the fractions specifying the gradient distribution
     * @param colors the gradient colors
     * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT
     * @param colorSpace which colorspace to use for interpolation,
     *                   either SRGB or LINEAR_RGB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LinearGradientPaintContext.java
    private float dgdX, dgdY, gc;

    /**
     * The following invariants are used to process the gradient value from
     * a device space coordinate, (X, Y):
     *     g(X, Y) = dgdX*X + dgdY*Y + gc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LinearGradientPaintContext.java
final class LinearGradientPaintContext extends MultipleGradientPaintContext {

/**
 * Provides the actual implementation for the LinearGradientPaint.
 * This is where the pixel processing is done.
 *
 * @see java.awt.LinearGradientPaint
 * @see java.awt.PaintContext
 * @see java.awt.Paint
 * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LinearGradientPaintContext.java
    protected void fillRaster(int[] pixels, int off, int adjust,
                              int x, int y, int w, int h)

    /**
     * Return a Raster containing the colors generated for the graphics
     * operation.  This is where the area is filled with colors distributed
     * linearly.
     *
     * @param x,y,w,h the area in device space for which colors are
     * generated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LinearGradientPaintContext.java
    LinearGradientPaintContext(LinearGradientPaint paint,
                               ColorModel cm,
                               Rectangle deviceBounds,
                               Rectangle2D userBounds,
                               AffineTransform t,
                               RenderingHints hints,
                               Point2D start,
                               Point2D end,
                               float[] fractions,
                               Color[] colors,
                               CycleMethod cycleMethod,
                               ColorSpaceType colorSpace)

    /**
     * Constructor for LinearGradientPaintContext.
     *
     * @param paint the {@code LinearGradientPaint} from which this context
     *              is created
     * @param cm {@code ColorModel} that receives
     *           the <code>Paint</code> data. This is used only as a hint.
     * @param deviceBounds the device space bounding box of the
     *                     graphics primitive being rendered
     * @param userBounds the user space bounding box of the
     *                   graphics primitive being rendered
     * @param t the {@code AffineTransform} from user
     *          space into device space (gradientTransform should be
     *          concatenated with this)
     * @param hints the hints that the context object uses to choose
     *              between rendering alternatives
     * @param start gradient start point, in user space
     * @param end gradient end point, in user space
     * @param fractions the fractions specifying the gradient distribution
     * @param colors the gradient colors
     * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT
     * @param colorSpace which colorspace to use for interpolation,
     *                   either SRGB or LINEAR_RGB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LinearGradientPaintContext.java
    private float dgdX, dgdY, gc;

    /**
     * The following invariants are used to process the gradient value from
     * a device space coordinate, (X, Y):
     *     g(X, Y) = dgdX*X + dgdY*Y + gc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/LinearGradientPaintContext.java
final class LinearGradientPaintContext extends MultipleGradientPaintContext {

/**
 * Provides the actual implementation for the LinearGradientPaint.
 * This is where the pixel processing is done.
 *
 * @see java.awt.LinearGradientPaint
 * @see java.awt.PaintContext
 * @see java.awt.Paint
 * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans
 */
