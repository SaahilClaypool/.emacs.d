_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final int getTransparency() {

    /**
     * Returns the transparency mode for this {@code Paint} object.
     *
     * @return {@code OPAQUE} if all colors used by this
     *         {@code Paint} object are opaque,
     *         {@code TRANSLUCENT} if at least one of the
     *         colors used by this {@code Paint} object is not opaque.
     * @see java.awt.Transparency
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final AffineTransform getTransform() {

    /**
     * Returns a copy of the transform applied to the gradient.
     *
     * <p>
     * Note that if no transform is applied to the gradient
     * when it is created, the identity transform is used.
     *
     * @return a copy of the transform applied to the gradient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final ColorSpaceType getColorSpace() {

    /**
     * Returns the enumerated type which specifies color space for
     * interpolation.
     *
     * @return the enumerated type which specifies color space for
     * interpolation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final CycleMethod getCycleMethod() {

    /**
     * Returns the enumerated type which specifies cycling behavior.
     *
     * @return the enumerated type which specifies cycling behavior
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final Color[] getColors() {

    /**
     * Returns a copy of the array of colors used by this gradient.
     * The first color maps to the first value in the fractions array,
     * and the last color maps to the last value in the fractions array.
     *
     * @return a copy of the array of colors used by this gradient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final float[] getFractions() {

    /**
     * Returns a copy of the array of floats used by this gradient
     * to calculate color distribution.
     * The returned array always has 0 as its first value and 1 as its
     * last value, with increasing values in between.
     *
     * @return a copy of the array of floats used by this gradient to
     * calculate color distribution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    MultipleGradientPaint(float[] fractions,
                          Color[] colors,
                          CycleMethod cycleMethod,
                          ColorSpaceType colorSpace,
                          AffineTransform gradientTransform)

    /**
     * Package-private constructor.
     *
     * @param fractions numbers ranging from 0.0 to 1.0 specifying the
     *                  distribution of colors along the gradient
     * @param colors array of colors corresponding to each fractional value
     * @param cycleMethod either {@code NO_CYCLE}, {@code REFLECT},
     *                    or {@code REPEAT}
     * @param colorSpace which color space to use for interpolation,
     *                   either {@code SRGB} or {@code LINEAR_RGB}
     * @param gradientTransform transform to apply to the gradient
     *
     * @throws NullPointerException
     * if {@code fractions} array is null,
     * or {@code colors} array is null,
     * or {@code gradientTransform} is null,
     * or {@code cycleMethod} is null,
     * or {@code colorSpace} is null
     * @throws IllegalArgumentException
     * if {@code fractions.length != colors.length},
     * or {@code colors} is less than 2 in size,
     * or a {@code fractions} value is less than 0.0 or greater than 1.0,
     * or the {@code fractions} are not provided in strictly increasing order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    ColorModel model;

    /**
     * The following fields are used only by MultipleGradientPaintContext
     * to cache certain values that remain constant and do not need to be
     * recalculated for each context created from this paint instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final ColorSpaceType colorSpace;

    /** The color space in which to perform the gradient interpolation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final CycleMethod cycleMethod;

    /** The method to use when painting outside the gradient bounds. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final AffineTransform gradientTransform;

    /** Transform to apply to gradient. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final Color[] colors;

    /** Gradient colors. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final float[] fractions;

    /** Gradient keyframe values in the range 0 to 1. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final int transparency;

    /** The transparency of this paint object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
        LINEAR_RGB

        /**
         * Indicates that the color interpolation should occur in linearized
         * RGB space.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public static enum ColorSpaceType {

    /** The color space in which to perform the gradient interpolation.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
        REPEAT

        /**
         * Cycle the gradient colors start-to-end, start-to-end
         * to fill the remaining area.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
        REFLECT,

        /**
         * Cycle the gradient colors start-to-end, end-to-start
         * to fill the remaining area.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public static enum CycleMethod {

    /** The method to use when painting outside the gradient bounds.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
public abstract class MultipleGradientPaint implements Paint {

/**
 * This is the superclass for Paints which use a multiple color
 * gradient to fill in their raster.  It provides storage for variables and
 * enumerated values common to
 * {@code LinearGradientPaint} and {@code RadialGradientPaint}.
 *
 * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final int getTransparency() {

    /**
     * Returns the transparency mode for this {@code Paint} object.
     *
     * @return {@code OPAQUE} if all colors used by this
     *         {@code Paint} object are opaque,
     *         {@code TRANSLUCENT} if at least one of the
     *         colors used by this {@code Paint} object is not opaque.
     * @see java.awt.Transparency
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final AffineTransform getTransform() {

    /**
     * Returns a copy of the transform applied to the gradient.
     *
     * <p>
     * Note that if no transform is applied to the gradient
     * when it is created, the identity transform is used.
     *
     * @return a copy of the transform applied to the gradient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final ColorSpaceType getColorSpace() {

    /**
     * Returns the enumerated type which specifies color space for
     * interpolation.
     *
     * @return the enumerated type which specifies color space for
     * interpolation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final CycleMethod getCycleMethod() {

    /**
     * Returns the enumerated type which specifies cycling behavior.
     *
     * @return the enumerated type which specifies cycling behavior
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final Color[] getColors() {

    /**
     * Returns a copy of the array of colors used by this gradient.
     * The first color maps to the first value in the fractions array,
     * and the last color maps to the last value in the fractions array.
     *
     * @return a copy of the array of colors used by this gradient
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public final float[] getFractions() {

    /**
     * Returns a copy of the array of floats used by this gradient
     * to calculate color distribution.
     * The returned array always has 0 as its first value and 1 as its
     * last value, with increasing values in between.
     *
     * @return a copy of the array of floats used by this gradient to
     * calculate color distribution
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    MultipleGradientPaint(float[] fractions,
                          Color[] colors,
                          CycleMethod cycleMethod,
                          ColorSpaceType colorSpace,
                          AffineTransform gradientTransform)

    /**
     * Package-private constructor.
     *
     * @param fractions numbers ranging from 0.0 to 1.0 specifying the
     *                  distribution of colors along the gradient
     * @param colors array of colors corresponding to each fractional value
     * @param cycleMethod either {@code NO_CYCLE}, {@code REFLECT},
     *                    or {@code REPEAT}
     * @param colorSpace which color space to use for interpolation,
     *                   either {@code SRGB} or {@code LINEAR_RGB}
     * @param gradientTransform transform to apply to the gradient
     *
     * @throws NullPointerException
     * if {@code fractions} array is null,
     * or {@code colors} array is null,
     * or {@code gradientTransform} is null,
     * or {@code cycleMethod} is null,
     * or {@code colorSpace} is null
     * @throws IllegalArgumentException
     * if {@code fractions.length != colors.length},
     * or {@code colors} is less than 2 in size,
     * or a {@code fractions} value is less than 0.0 or greater than 1.0,
     * or the {@code fractions} are not provided in strictly increasing order
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    ColorModel model;

    /**
     * The following fields are used only by MultipleGradientPaintContext
     * to cache certain values that remain constant and do not need to be
     * recalculated for each context created from this paint instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final ColorSpaceType colorSpace;

    /** The color space in which to perform the gradient interpolation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final CycleMethod cycleMethod;

    /** The method to use when painting outside the gradient bounds. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final AffineTransform gradientTransform;

    /** Transform to apply to gradient. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final Color[] colors;

    /** Gradient colors. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final float[] fractions;

    /** Gradient keyframe values in the range 0 to 1. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    final int transparency;

    /** The transparency of this paint object. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
        LINEAR_RGB

        /**
         * Indicates that the color interpolation should occur in linearized
         * RGB space.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public static enum ColorSpaceType {

    /** The color space in which to perform the gradient interpolation.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
        REPEAT

        /**
         * Cycle the gradient colors start-to-end, start-to-end
         * to fill the remaining area.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
        REFLECT,

        /**
         * Cycle the gradient colors start-to-end, end-to-start
         * to fill the remaining area.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
    public static enum CycleMethod {

    /** The method to use when painting outside the gradient bounds.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/MultipleGradientPaint.java
public abstract class MultipleGradientPaint implements Paint {

/**
 * This is the superclass for Paints which use a multiple color
 * gradient to fill in their raster.  It provides storage for variables and
 * enumerated values common to
 * {@code LinearGradientPaint} and {@code RadialGradientPaint}.
 *
 * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans
 * @since 1.6
 */
