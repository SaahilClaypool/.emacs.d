_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void imageComplete(int status) {

    /**
     * Filters the information provided in the <code>imageComplete</code>
     * method of the <code>ImageConsumer</code> interface.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param status the status of image loading
     * @throws ImagingOpException if there was a problem calling the filter
     * method of the <code>BufferedImageOp</code> associated with this
     * instance.
     * @see ImageConsumer#imageComplete
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * Filters the information provided in the <code>setPixels</code>
     * method of the <code>ImageConsumer</code> interface which takes
     * an array of integers.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose
     * pixels are being filtered.  Developers using this class to
     * retrieve pixels from an image should avoid calling this method
     * directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @throws IllegalArgumentException if width or height are less than
     * zero.
     * @see ImageConsumer#setPixels(int, int, int, int, ColorModel, int[],
                                    int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * Filters the information provided in the <code>setPixels</code>
     * method of the <code>ImageConsumer</code> interface which takes
     * an array of bytes.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @throws IllegalArgumentException if width or height are less than
     * zero.
     * @see ImageConsumer#setPixels(int, int, int, int, ColorModel, byte[],
                                    int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void setColorModel(ColorModel model) {

    /**
     * Filters the information provided in the
     * {@link ImageConsumer#setColorModel(ColorModel) setColorModel} method
     * of the <code>ImageConsumer</code> interface.
     * <p>
     * If <code>model</code> is <code>null</code>, this
     * method clears the current <code>ColorModel</code> of this
     * <code>BufferedImageFilter</code>.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code>
     * whose pixels are being filtered.  Developers using this
     * class to retrieve pixels from an image
     * should avoid calling this method directly since that
     * operation could result in problems with retrieving the
     * requested pixels.
     * @param model the {@link ColorModel} to which to set the
     *        <code>ColorModel</code> of this <code>BufferedImageFilter</code>
     * @see ImageConsumer#setColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void setDimensions(int width, int height) {

    /**
     * Filters the information provided in the
     * {@link ImageConsumer#setDimensions(int, int) setDimensions } method
     * of the {@link ImageConsumer} interface.
     * <p>
     * Note: This method is intended to be called by the
     * {@link ImageProducer} of the <code>Image</code> whose pixels are
     * being filtered. Developers using this class to retrieve pixels from
     * an image should avoid calling this method directly since that
     * operation could result in problems with retrieving the requested
     * pixels.
     * <p>
     * @param width the width to which to set the width of this
     *        <code>BufferedImageFilter</code>
     * @param height the height to which to set the height of this
     *        <code>BufferedImageFilter</code>
     * @see ImageConsumer#setDimensions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public BufferedImageOp getBufferedImageOp() {

    /**
     * Returns the <code>BufferedImageOp</code>.
     * @return the operator of this <code>BufferedImageFilter</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public BufferedImageFilter (BufferedImageOp op) {

    /**
     * Constructs a <code>BufferedImageFilter</code> with the
     * specified single-source/single-destination operator.
     * @param op the specified <code>BufferedImageOp</code> to
     *           use to filter a <code>BufferedImage</code>
     * @throws NullPointerException if op is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
public class BufferedImageFilter extends ImageFilter implements Cloneable {

/**
 * The <code>BufferedImageFilter</code> class subclasses an
 * <code>ImageFilter</code> to provide a simple means of
 * using a single-source/single-destination image operator
 * ({@link BufferedImageOp}) to filter a <code>BufferedImage</code>
 * in the Image Producer/Consumer/Observer
 * paradigm. Examples of these image operators are: {@link ConvolveOp},
 * {@link AffineTransformOp} and {@link LookupOp}.
 *
 * @see ImageFilter
 * @see BufferedImage
 * @see BufferedImageOp
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void imageComplete(int status) {

    /**
     * Filters the information provided in the <code>imageComplete</code>
     * method of the <code>ImageConsumer</code> interface.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @param status the status of image loading
     * @throws ImagingOpException if there was a problem calling the filter
     * method of the <code>BufferedImageOp</code> associated with this
     * instance.
     * @see ImageConsumer#imageComplete
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * Filters the information provided in the <code>setPixels</code>
     * method of the <code>ImageConsumer</code> interface which takes
     * an array of integers.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose
     * pixels are being filtered.  Developers using this class to
     * retrieve pixels from an image should avoid calling this method
     * directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @throws IllegalArgumentException if width or height are less than
     * zero.
     * @see ImageConsumer#setPixels(int, int, int, int, ColorModel, int[],
                                    int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * Filters the information provided in the <code>setPixels</code>
     * method of the <code>ImageConsumer</code> interface which takes
     * an array of bytes.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered.  Developers using
     * this class to retrieve pixels from an image should avoid calling
     * this method directly since that operation could result in problems
     * with retrieving the requested pixels.
     * @throws IllegalArgumentException if width or height are less than
     * zero.
     * @see ImageConsumer#setPixels(int, int, int, int, ColorModel, byte[],
                                    int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void setColorModel(ColorModel model) {

    /**
     * Filters the information provided in the
     * {@link ImageConsumer#setColorModel(ColorModel) setColorModel} method
     * of the <code>ImageConsumer</code> interface.
     * <p>
     * If <code>model</code> is <code>null</code>, this
     * method clears the current <code>ColorModel</code> of this
     * <code>BufferedImageFilter</code>.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code>
     * whose pixels are being filtered.  Developers using this
     * class to retrieve pixels from an image
     * should avoid calling this method directly since that
     * operation could result in problems with retrieving the
     * requested pixels.
     * @param model the {@link ColorModel} to which to set the
     *        <code>ColorModel</code> of this <code>BufferedImageFilter</code>
     * @see ImageConsumer#setColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public void setDimensions(int width, int height) {

    /**
     * Filters the information provided in the
     * {@link ImageConsumer#setDimensions(int, int) setDimensions } method
     * of the {@link ImageConsumer} interface.
     * <p>
     * Note: This method is intended to be called by the
     * {@link ImageProducer} of the <code>Image</code> whose pixels are
     * being filtered. Developers using this class to retrieve pixels from
     * an image should avoid calling this method directly since that
     * operation could result in problems with retrieving the requested
     * pixels.
     * <p>
     * @param width the width to which to set the width of this
     *        <code>BufferedImageFilter</code>
     * @param height the height to which to set the height of this
     *        <code>BufferedImageFilter</code>
     * @see ImageConsumer#setDimensions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public BufferedImageOp getBufferedImageOp() {

    /**
     * Returns the <code>BufferedImageOp</code>.
     * @return the operator of this <code>BufferedImageFilter</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
    public BufferedImageFilter (BufferedImageOp op) {

    /**
     * Constructs a <code>BufferedImageFilter</code> with the
     * specified single-source/single-destination operator.
     * @param op the specified <code>BufferedImageOp</code> to
     *           use to filter a <code>BufferedImage</code>
     * @throws NullPointerException if op is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageFilter.java
public class BufferedImageFilter extends ImageFilter implements Cloneable {

/**
 * The <code>BufferedImageFilter</code> class subclasses an
 * <code>ImageFilter</code> to provide a simple means of
 * using a single-source/single-destination image operator
 * ({@link BufferedImageOp}) to filter a <code>BufferedImage</code>
 * in the Image Producer/Consumer/Observer
 * paradigm. Examples of these image operators are: {@link ConvolveOp},
 * {@link AffineTransformOp} and {@link LookupOp}.
 *
 * @see ImageFilter
 * @see BufferedImage
 * @see BufferedImageOp
 */
