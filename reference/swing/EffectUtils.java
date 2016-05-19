_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    public static BufferedImage createCompatibleTranslucentImage(int width,
                                                                 int height) {

    /**
     * <p>Returns a new translucent compatible image of the specified width and
     * height. That is, the returned <code>BufferedImage</code> is compatible with
     * the graphics hardware. If the method is called in a headless
     * environment, then the returned BufferedImage will be compatible with
     * the source image.</p>
     *
     * @param width the width of the new image
     * @param height the height of the new image
     * @return a new translucent compatible <code>BufferedImage</code> of the
     *   specified width and height
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    public static BufferedImage createColorModelCompatibleImage(BufferedImage image) {

    /**
     * <p>Returns a new <code>BufferedImage</code> using the same color model
     * as the image passed as a parameter. The returned image is only compatible
     * with the image passed as a parameter. This does not mean the returned
     * image is compatible with the hardware.</p>
     *
     * @param image the reference image from which the color model of the new
     *   image is obtained
     * @return a new <code>BufferedImage</code>, compatible with the color model
     *   of <code>image</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    public static void setPixels(BufferedImage img,
                                 int x, int y, int w, int h, int[] pixels) {

    /**
     * <p>Writes a rectangular area of pixels in the destination
     * <code>BufferedImage</code>. Calling this method on
     * an image of type different from <code>BufferedImage.TYPE_INT_ARGB</code>
     * and <code>BufferedImage.TYPE_INT_RGB</code> will unmanage the image.</p>
     *
     * @param img the destination image
     * @param x the x location at which to start storing pixels
     * @param y the y location at which to start storing pixels
     * @param w the width of the rectangle of pixels to store
     * @param h the height of the rectangle of pixels to store
     * @param pixels an array of pixels, stored as integers
     * @throws IllegalArgumentException is <code>pixels</code> is non-null and
     *   of length &lt; w*h
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    public static int[] getPixels(BufferedImage img,
                                  int x, int y, int w, int h, int[] pixels) {

    /**
     * <p>Returns an array of pixels, stored as integers, from a
     * <code>BufferedImage</code>. The pixels are grabbed from a rectangular
     * area defined by a location and two dimensions. Calling this method on
     * an image of type different from <code>BufferedImage.TYPE_INT_ARGB</code>
     * and <code>BufferedImage.TYPE_INT_RGB</code> will unmanage the image.</p>
     *
     * @param img the source image
     * @param x the x location at which to start grabbing pixels
     * @param y the y location at which to start grabbing pixels
     * @param w the width of the rectangle of pixels to grab
     * @param h the height of the rectangle of pixels to grab
     * @param pixels a pre-allocated array of pixels of size w*h; can be null
     * @return <code>pixels</code> if non-null, a new array of integers
     *   otherwise
     * @throws IllegalArgumentException is <code>pixels</code> is non-null and
     *   of length &lt; w*h
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    static void setPixels(BufferedImage img,
                                 int x, int y, int w, int h, byte[] pixels) {

    /**
     * <p>Writes a rectangular area of pixels in the destination <code>BufferedImage</code>. Calling this method on an
     * image of type different from <code>BufferedImage.TYPE_INT_ARGB</code> and <code>BufferedImage.TYPE_INT_RGB</code>
     * will unmanage the image.</p>
     *
     * @param img    the destination image
     * @param x      the x location at which to start storing pixels
     * @param y      the y location at which to start storing pixels
     * @param w      the width of the rectangle of pixels to store
     * @param h      the height of the rectangle of pixels to store
     * @param pixels an array of pixels, stored as integers
     * @throws IllegalArgumentException is <code>pixels</code> is non-null and of length &lt; w*h
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    static byte[] getPixels(BufferedImage img,
                                   int x, int y, int w, int h, byte[] pixels) {

    /**
     * <p>Returns an array of pixels, stored as integers, from a <code>BufferedImage</code>. The pixels are grabbed from
     * a rectangular area defined by a location and two dimensions. Calling this method on an image of type different
     * from <code>BufferedImage.TYPE_INT_ARGB</code> and <code>BufferedImage.TYPE_INT_RGB</code> will unmanage the
     * image.</p>
     *
     * @param img    the source image
     * @param x      the x location at which to start grabbing pixels
     * @param y      the y location at which to start grabbing pixels
     * @param w      the width of the rectangle of pixels to grab
     * @param h      the height of the rectangle of pixels to grab
     * @param pixels a pre-allocated array of pixels of size w*h; can be null
     * @return <code>pixels</code> if non-null, a new array of integers otherwise
     * @throws IllegalArgumentException is <code>pixels</code> is non-null and of length &lt; w*h
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    static void blur(byte[] srcPixels, byte[] dstPixels,
                            int width, int height,
                            float[] kernel, int radius) {

    /**
     * <p>Blurs the source pixels into the destination pixels. The force of the blur is specified by the radius which
     * must be greater than 0.</p> <p>The source and destination pixels arrays are expected to be in the BYTE_GREY
     * format.</p> <p>After this method is executed, dstPixels contains a transposed and filtered copy of
     * srcPixels.</p>
     *
     * @param srcPixels the source pixels
     * @param dstPixels the destination pixels
     * @param width     the width of the source picture
     * @param height    the height of the source picture
     * @param kernel    the kernel of the blur effect
     * @param radius    the radius of the blur effect
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    private static void blur(int[] srcPixels, int[] dstPixels,
                             int width, int height,
                             float[] kernel, int radius) {

    /**
     * <p>Blurs the source pixels into the destination pixels. The force of the blur is specified by the radius which
     * must be greater than 0.</p> <p>The source and destination pixels arrays are expected to be in the INT_ARGB
     * format.</p> <p>After this method is executed, dstPixels contains a transposed and filtered copy of
     * srcPixels.</p>
     *
     * @param srcPixels the source pixels
     * @param dstPixels the destination pixels
     * @param width     the width of the source picture
     * @param height    the height of the source picture
     * @param kernel    the kernel of the blur effect
     * @param radius    the radius of the blur effect
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    static BufferedImage gaussianBlur(BufferedImage src, BufferedImage dst, int radius) {

    /**
     * Apply Gaussian Blur to Image
     *
     * @param src    The image tp
     * @param dst    The destination image to draw blured src image into, null if you want a new one created
     * @param radius The blur kernel radius
     * @return The blured image
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
    static void clearImage(BufferedImage img) {

    /**
     * Clear a transparent image to 100% transparent
     *
     * @param img The image to clear
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/EffectUtils.java
class EffectUtils {

/**
 * EffectUtils
 *
 * @author Created by Jasper Potts (Jun 18, 2007)
 */
