_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    public final ColorModel getColorModel() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    public final void dispose() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static synchronized void putCachedRaster(ColorModel cm,
                                                     Raster ras)

    /**
     * Took this cacheRaster code from GradientPaint. It appears to recycle
     * rasters for use by any other instance, as long as they are sufficiently
     * large.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static synchronized Raster getCachedRaster(ColorModel cm,
                                                       int w, int h)

    /**
     * Took this cacheRaster code from GradientPaint. It appears to recycle
     * rasters for use by any other instance, as long as they are sufficiently
     * large.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    public final Raster getRaster(int x, int y, int w, int h) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static int convertLinearRGBtoSRGB(int color) {

    /**
     * Helper function to convert a color component in linear RGB space to
     * SRGB space.  Used to build a static lookup table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static int convertSRGBtoLinearRGB(int color) {

    /**
     * Helper function to convert a color component in sRGB space to linear
     * RGB space.  Used to build a static lookup table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected final int indexIntoGradientsArrays(float position) {

    /**
     * Helper function to index into the gradients array.  This is necessary
     * because each interval has an array of colors with uniform size 255.
     * However, the color intervals are not necessarily of uniform length, so
     * a conversion is required.
     *
     * @param position the unmanipulated position, which will be mapped
     *                 into the range 0 to 1
     * @returns integer color to display
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private int convertEntireColorLinearRGBtoSRGB(int rgb) {

    /**
     * Yet another helper function.  This one extracts the color components
     * of an integer RGB triple, converts them from LinearRGB to SRGB, then
     * recompacts them into an int.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private void interpolate(int rgb1, int rgb2, int[] output) {

    /**
     * Yet another helper function.  This one linearly interpolates between
     * 2 colors, filling up the output array.
     *
     * @param rgb1 the start color
     * @param rgb2 the end color
     * @param output the output array of colors; must not be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private void calculateMultipleArrayGradient(Color[] colors) {

    /**
     * SLOW LOOKUP METHOD
     *
     * This method calculates the gradient color values for each interval and
     * places each into its own 255 size array.  The arrays are stored in
     * gradients[][].  (255 is used because this is the maximum number of
     * unique colors between 2 arbitrary colors in a 24 bit color system.)
     *
     * This method uses the minimum amount of space (only 255 * number of
     * intervals), but it aggravates the lookup procedure, because now we
     * have to find out which interval to select, then calculate the index
     * within that interval.  This causes a significant performance hit,
     * because it requires this calculation be done for every point in
     * the rendering loop.
     *
     * For those of you who are interested, this is a classic example of the
     * time-space tradeoff.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private void calculateSingleArrayGradient(Color[] colors, float Imin) {

    /**
     * FAST LOOKUP METHOD
     *
     * This method calculates the gradient color values and places them in a
     * single int array, gradient[].  It does this by allocating space for
     * each interval based on its size relative to the smallest interval in
     * the array.  The smallest interval is allocated 255 interpolated values
     * (the maximum number of unique in-between colors in a 24 bit color
     * system), and all other intervals are allocated
     * size = (255 * the ratio of their size to the smallest interval).
     *
     * This scheme expedites a speedy retrieval because the colors are
     * distributed along the array according to their user-specified
     * distribution.  All that is needed is a relative index from 0 to 1.
     *
     * The only problem with this method is that the possibility exists for
     * the array size to balloon in the case where there is a
     * disproportionately small gradient interval.  In this case the other
     * intervals will be allocated huge space, but much of that data is
     * redundant.  We thus need to use the space conserving scheme below.
     *
     * @param Imin the size of the smallest interval
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private void calculateLookupData(Color[] colors) {

    /**
     * This function is the meat of this class.  It calculates an array of
     * gradient colors based on an array of fractions and color values at
     * those fractions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected MultipleGradientPaintContext(MultipleGradientPaint mgp,
                                           ColorModel cm,
                                           Rectangle deviceBounds,
                                           Rectangle2D userBounds,
                                           AffineTransform t,
                                           RenderingHints hints,
                                           float[] fractions,
                                           Color[] colors,
                                           CycleMethod cycleMethod,
                                           ColorSpaceType colorSpace)

    /**
     * Constructor for MultipleGradientPaintContext superclass.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static final int MAX_GRADIENT_ARRAY_SIZE = 5000;

    /**
     * Maximum length of the fast single-array.  If the estimated array size
     * is greater than this, switch over to the slow lookup method.
     * No particular reason for choosing this number, but it seems to provide
     * satisfactory performance for the common case (fast lookup).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected static final int GRADIENT_SIZE = 256;

    /**
     * Constant number of max colors between any 2 arbitrary colors.
     * Used for creating and indexing gradients arrays.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static final int SRGBtoLinearRGB[] = new int[256];

    /** Color space conversion lookup tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private int transparencyTest;

    /** Used to determine if gradient colors are all opaque. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private float[] fractions;

    /** Fractions array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private float[] normalizedIntervals;

    /** Normalized intervals array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private int[][] gradients;

    /**
     * Array of gradient arrays, one array for each interval.  Used by
     * calculateMultipleArrayGradient().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected int[] gradient;

    /**
     * Array which contains the interpolated color values for each interval,
     * used by calculateSingleArrayGradient().  It is protected for possible
     * direct access by subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected int fastGradientArraySize;

    /**
     * Size of gradients array for scaling the 0-1 index when looking up
     * colors the fast way.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected boolean isSimpleLookup;

    /**
     * This boolean specifies whether we are in simple lookup mode, where an
     * input value between 0 and 1 may be used to directly index into a single
     * array of gradient colors.  If this boolean value is false, then we have
     * to use a 2-step process where we have to determine which gradient array
     * we fall into, then determine the index into that array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected float a00, a01, a10, a11, a02, a12;

    /** Elements of the inverse transform matrix. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected ColorSpaceType colorSpace;

    /** The ColorSpace in which to perform the interpolation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected CycleMethod cycleMethod;

    /** The method to use when painting out of the gradient bounds. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected Raster saved;

    /** Raster is reused whenever possible. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected static WeakReference<Raster> cached;

    /** The cached raster, which is reusable among instances. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected static ColorModel cachedModel;

    /** The cached ColorModel. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static ColorModel xrgbmodel =

    /** Color model used if gradient colors are all opaque. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected ColorModel model;

    /**
     * The PaintContext's ColorModel.  This is ARGB if colors are not all
     * opaque, otherwise it is RGB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
abstract class MultipleGradientPaintContext implements PaintContext {

/**
 * This is the superclass for all PaintContexts which use a multiple color
 * gradient to fill in their raster.  It provides the actual color
 * interpolation functionality.  Subclasses only have to deal with using
 * the gradient to fill pixels in a raster.
 *
 * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    public final ColorModel getColorModel() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    public final void dispose() {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static synchronized void putCachedRaster(ColorModel cm,
                                                     Raster ras)

    /**
     * Took this cacheRaster code from GradientPaint. It appears to recycle
     * rasters for use by any other instance, as long as they are sufficiently
     * large.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static synchronized Raster getCachedRaster(ColorModel cm,
                                                       int w, int h)

    /**
     * Took this cacheRaster code from GradientPaint. It appears to recycle
     * rasters for use by any other instance, as long as they are sufficiently
     * large.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    public final Raster getRaster(int x, int y, int w, int h) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static int convertLinearRGBtoSRGB(int color) {

    /**
     * Helper function to convert a color component in linear RGB space to
     * SRGB space.  Used to build a static lookup table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static int convertSRGBtoLinearRGB(int color) {

    /**
     * Helper function to convert a color component in sRGB space to linear
     * RGB space.  Used to build a static lookup table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected final int indexIntoGradientsArrays(float position) {

    /**
     * Helper function to index into the gradients array.  This is necessary
     * because each interval has an array of colors with uniform size 255.
     * However, the color intervals are not necessarily of uniform length, so
     * a conversion is required.
     *
     * @param position the unmanipulated position, which will be mapped
     *                 into the range 0 to 1
     * @returns integer color to display
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private int convertEntireColorLinearRGBtoSRGB(int rgb) {

    /**
     * Yet another helper function.  This one extracts the color components
     * of an integer RGB triple, converts them from LinearRGB to SRGB, then
     * recompacts them into an int.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private void interpolate(int rgb1, int rgb2, int[] output) {

    /**
     * Yet another helper function.  This one linearly interpolates between
     * 2 colors, filling up the output array.
     *
     * @param rgb1 the start color
     * @param rgb2 the end color
     * @param output the output array of colors; must not be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private void calculateMultipleArrayGradient(Color[] colors) {

    /**
     * SLOW LOOKUP METHOD
     *
     * This method calculates the gradient color values for each interval and
     * places each into its own 255 size array.  The arrays are stored in
     * gradients[][].  (255 is used because this is the maximum number of
     * unique colors between 2 arbitrary colors in a 24 bit color system.)
     *
     * This method uses the minimum amount of space (only 255 * number of
     * intervals), but it aggravates the lookup procedure, because now we
     * have to find out which interval to select, then calculate the index
     * within that interval.  This causes a significant performance hit,
     * because it requires this calculation be done for every point in
     * the rendering loop.
     *
     * For those of you who are interested, this is a classic example of the
     * time-space tradeoff.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private void calculateSingleArrayGradient(Color[] colors, float Imin) {

    /**
     * FAST LOOKUP METHOD
     *
     * This method calculates the gradient color values and places them in a
     * single int array, gradient[].  It does this by allocating space for
     * each interval based on its size relative to the smallest interval in
     * the array.  The smallest interval is allocated 255 interpolated values
     * (the maximum number of unique in-between colors in a 24 bit color
     * system), and all other intervals are allocated
     * size = (255 * the ratio of their size to the smallest interval).
     *
     * This scheme expedites a speedy retrieval because the colors are
     * distributed along the array according to their user-specified
     * distribution.  All that is needed is a relative index from 0 to 1.
     *
     * The only problem with this method is that the possibility exists for
     * the array size to balloon in the case where there is a
     * disproportionately small gradient interval.  In this case the other
     * intervals will be allocated huge space, but much of that data is
     * redundant.  We thus need to use the space conserving scheme below.
     *
     * @param Imin the size of the smallest interval
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private void calculateLookupData(Color[] colors) {

    /**
     * This function is the meat of this class.  It calculates an array of
     * gradient colors based on an array of fractions and color values at
     * those fractions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected MultipleGradientPaintContext(MultipleGradientPaint mgp,
                                           ColorModel cm,
                                           Rectangle deviceBounds,
                                           Rectangle2D userBounds,
                                           AffineTransform t,
                                           RenderingHints hints,
                                           float[] fractions,
                                           Color[] colors,
                                           CycleMethod cycleMethod,
                                           ColorSpaceType colorSpace)

    /**
     * Constructor for MultipleGradientPaintContext superclass.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static final int MAX_GRADIENT_ARRAY_SIZE = 5000;

    /**
     * Maximum length of the fast single-array.  If the estimated array size
     * is greater than this, switch over to the slow lookup method.
     * No particular reason for choosing this number, but it seems to provide
     * satisfactory performance for the common case (fast lookup).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected static final int GRADIENT_SIZE = 256;

    /**
     * Constant number of max colors between any 2 arbitrary colors.
     * Used for creating and indexing gradients arrays.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static final int SRGBtoLinearRGB[] = new int[256];

    /** Color space conversion lookup tables. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private int transparencyTest;

    /** Used to determine if gradient colors are all opaque. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private float[] fractions;

    /** Fractions array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private float[] normalizedIntervals;

    /** Normalized intervals array. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private int[][] gradients;

    /**
     * Array of gradient arrays, one array for each interval.  Used by
     * calculateMultipleArrayGradient().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected int[] gradient;

    /**
     * Array which contains the interpolated color values for each interval,
     * used by calculateSingleArrayGradient().  It is protected for possible
     * direct access by subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected int fastGradientArraySize;

    /**
     * Size of gradients array for scaling the 0-1 index when looking up
     * colors the fast way.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected boolean isSimpleLookup;

    /**
     * This boolean specifies whether we are in simple lookup mode, where an
     * input value between 0 and 1 may be used to directly index into a single
     * array of gradient colors.  If this boolean value is false, then we have
     * to use a 2-step process where we have to determine which gradient array
     * we fall into, then determine the index into that array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected float a00, a01, a10, a11, a02, a12;

    /** Elements of the inverse transform matrix. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected ColorSpaceType colorSpace;

    /** The ColorSpace in which to perform the interpolation */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected CycleMethod cycleMethod;

    /** The method to use when painting out of the gradient bounds. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected Raster saved;

    /** Raster is reused whenever possible. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected static WeakReference<Raster> cached;

    /** The cached raster, which is reusable among instances. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected static ColorModel cachedModel;

    /** The cached ColorModel. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    private static ColorModel xrgbmodel =

    /** Color model used if gradient colors are all opaque. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
    protected ColorModel model;

    /**
     * The PaintContext's ColorModel.  This is ARGB if colors are not all
     * opaque, otherwise it is RGB.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaintContext.java
abstract class MultipleGradientPaintContext implements PaintContext {

/**
 * This is the superclass for all PaintContexts which use a multiple color
 * gradient to fill in their raster.  It provides the actual color
 * interpolation functionality.  Subclasses only have to deal with using
 * the gradient to fill pixels in a raster.
 *
 * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans
 */
