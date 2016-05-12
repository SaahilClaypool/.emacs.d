_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private void cyclicCircularGradientFillRaster(int pixels[], int off,
                                                  int adjust,
                                                  int x, int y,
                                                  int w, int h)

    /**
     * Fill the raster, cycling the gradient colors when a point falls outside
     * of the perimeter of the 100% stop circle.
     *
     * This calculation first computes the intersection point of the line
     * from the focus through the current point in the raster, and the
     * perimeter of the gradient circle.
     *
     * Then it determines the percentage distance of the current point along
     * that line (focus is 0%, perimeter is 100%).
     *
     * Equation of a circle centered at (a,b) with radius r:
     *     (x-a)^2 + (y-b)^2 = r^2
     * Equation of a line with slope m and y-intercept b:
     *     y = mx + b
     * Replacing y in the circle equation and solving using the quadratic
     * formula produces the following set of equations.  Constant factors have
     * been extracted out of the inner loop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private void simpleNonCyclicFillRaster(int pixels[], int off, int adjust,
                                           int x, int y, int w, int h)

    /**
     * This code works in the simplest of cases, where the focus == center
     * point, the gradient is noncyclic, and the gradient lookup method is
     * fast (single array index, no conversion necessary).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    protected void fillRaster(int pixels[], int off, int adjust,
                              int x, int y, int w, int h)

    /**
     * Return a Raster containing the colors generated for the graphics
     * operation.
     *
     * @param x,y,w,h the area in device space for which colors are
     * generated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    RadialGradientPaintContext(RadialGradientPaint paint,
                               ColorModel cm,
                               Rectangle deviceBounds,
                               Rectangle2D userBounds,
                               AffineTransform t,
                               RenderingHints hints,
                               float cx, float cy,
                               float r,
                               float fx, float fy,
                               float[] fractions,
                               Color[] colors,
                               CycleMethod cycleMethod,
                               ColorSpaceType colorSpace)

    /**
     * Constructor for RadialGradientPaintContext.
     *
     * @param paint the {@code RadialGradientPaint} from which this context
     *              is created
     * @param cm the {@code ColorModel} that receives
     *           the {@code Paint} data (this is used only as a hint)
     * @param deviceBounds the device space bounding box of the
     *                     graphics primitive being rendered
     * @param userBounds the user space bounding box of the
     *                   graphics primitive being rendered
     * @param t the {@code AffineTransform} from user
     *          space into device space (gradientTransform should be
     *          concatenated with this)
     * @param hints the hints that the context object uses to choose
     *              between rendering alternatives
     * @param cx the center X coordinate in user space of the circle defining
     *           the gradient.  The last color of the gradient is mapped to
     *           the perimeter of this circle.
     * @param cy the center Y coordinate in user space of the circle defining
     *           the gradient.  The last color of the gradient is mapped to
     *           the perimeter of this circle.
     * @param r the radius of the circle defining the extents of the
     *          color gradient
     * @param fx the X coordinate in user space to which the first color
     *           is mapped
     * @param fy the Y coordinate in user space to which the first color
     *           is mapped
     * @param fractions the fractions specifying the gradient distribution
     * @param colors the gradient colors
     * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT
     * @param colorSpace which colorspace to use for interpolation,
     *                   either SRGB or LINEAR_RGB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private static final float SCALEBACK = .99f;

    /** Amount for offset when clamping focus. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float trivial;

    /**
     * This value represents the solution when focusX == X.  It is called
     * trivial because it is easier to calculate than the general case.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float gDeltaDelta;

    /** Constant second order delta for simple loop. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float constA, constB;

    /** Constant part of X, Y user space coordinates. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float radiusSq;

    /** Radius of the gradient circle squared. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float centerX, centerY, focusX, focusY;

    /** Variables representing center and focus points. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float radius;

    /** Radius of the outermost circle defining the 100% gradient stop. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private boolean isNonCyclic = false;

    /** True when (cycleMethod == NO_CYCLE). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private boolean isSimpleFocus = false;

    /** True when (focus == center).  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
final class RadialGradientPaintContext extends MultipleGradientPaintContext {

/**
 * Provides the actual implementation for the RadialGradientPaint.
 * This is where the pixel processing is done.  A RadialGradienPaint
 * only supports circular gradients, but it should be possible to scale
 * the circle to look approximately elliptical, by means of a
 * gradient transform passed into the RadialGradientPaint constructor.
 *
 * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private void cyclicCircularGradientFillRaster(int pixels[], int off,
                                                  int adjust,
                                                  int x, int y,
                                                  int w, int h)

    /**
     * Fill the raster, cycling the gradient colors when a point falls outside
     * of the perimeter of the 100% stop circle.
     *
     * This calculation first computes the intersection point of the line
     * from the focus through the current point in the raster, and the
     * perimeter of the gradient circle.
     *
     * Then it determines the percentage distance of the current point along
     * that line (focus is 0%, perimeter is 100%).
     *
     * Equation of a circle centered at (a,b) with radius r:
     *     (x-a)^2 + (y-b)^2 = r^2
     * Equation of a line with slope m and y-intercept b:
     *     y = mx + b
     * Replacing y in the circle equation and solving using the quadratic
     * formula produces the following set of equations.  Constant factors have
     * been extracted out of the inner loop.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private void simpleNonCyclicFillRaster(int pixels[], int off, int adjust,
                                           int x, int y, int w, int h)

    /**
     * This code works in the simplest of cases, where the focus == center
     * point, the gradient is noncyclic, and the gradient lookup method is
     * fast (single array index, no conversion necessary).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    protected void fillRaster(int pixels[], int off, int adjust,
                              int x, int y, int w, int h)

    /**
     * Return a Raster containing the colors generated for the graphics
     * operation.
     *
     * @param x,y,w,h the area in device space for which colors are
     * generated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    RadialGradientPaintContext(RadialGradientPaint paint,
                               ColorModel cm,
                               Rectangle deviceBounds,
                               Rectangle2D userBounds,
                               AffineTransform t,
                               RenderingHints hints,
                               float cx, float cy,
                               float r,
                               float fx, float fy,
                               float[] fractions,
                               Color[] colors,
                               CycleMethod cycleMethod,
                               ColorSpaceType colorSpace)

    /**
     * Constructor for RadialGradientPaintContext.
     *
     * @param paint the {@code RadialGradientPaint} from which this context
     *              is created
     * @param cm the {@code ColorModel} that receives
     *           the {@code Paint} data (this is used only as a hint)
     * @param deviceBounds the device space bounding box of the
     *                     graphics primitive being rendered
     * @param userBounds the user space bounding box of the
     *                   graphics primitive being rendered
     * @param t the {@code AffineTransform} from user
     *          space into device space (gradientTransform should be
     *          concatenated with this)
     * @param hints the hints that the context object uses to choose
     *              between rendering alternatives
     * @param cx the center X coordinate in user space of the circle defining
     *           the gradient.  The last color of the gradient is mapped to
     *           the perimeter of this circle.
     * @param cy the center Y coordinate in user space of the circle defining
     *           the gradient.  The last color of the gradient is mapped to
     *           the perimeter of this circle.
     * @param r the radius of the circle defining the extents of the
     *          color gradient
     * @param fx the X coordinate in user space to which the first color
     *           is mapped
     * @param fy the Y coordinate in user space to which the first color
     *           is mapped
     * @param fractions the fractions specifying the gradient distribution
     * @param colors the gradient colors
     * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT
     * @param colorSpace which colorspace to use for interpolation,
     *                   either SRGB or LINEAR_RGB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private static final float SCALEBACK = .99f;

    /** Amount for offset when clamping focus. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float trivial;

    /**
     * This value represents the solution when focusX == X.  It is called
     * trivial because it is easier to calculate than the general case.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float gDeltaDelta;

    /** Constant second order delta for simple loop. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float constA, constB;

    /** Constant part of X, Y user space coordinates. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float radiusSq;

    /** Radius of the gradient circle squared. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float centerX, centerY, focusX, focusY;

    /** Variables representing center and focus points. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private float radius;

    /** Radius of the outermost circle defining the 100% gradient stop. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private boolean isNonCyclic = false;

    /** True when (cycleMethod == NO_CYCLE). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
    private boolean isSimpleFocus = false;

    /** True when (focus == center).  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/RadialGradientPaintContext.java
final class RadialGradientPaintContext extends MultipleGradientPaintContext {

/**
 * Provides the actual implementation for the RadialGradientPaint.
 * This is where the pixel processing is done.  A RadialGradienPaint
 * only supports circular gradients, but it should be possible to scale
 * the circle to look approximately elliptical, by means of a
 * gradient transform passed into the RadialGradientPaint constructor.
 *
 * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans
 */
