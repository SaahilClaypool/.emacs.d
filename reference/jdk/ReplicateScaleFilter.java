_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * Choose which rows and columns of the delivered int pixels are
     * needed for the destination scaled image and pass through just
     * those rows and columns that are needed, replicated as necessary.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * Choose which rows and columns of the delivered byte pixels are
     * needed for the destination scaled image and pass through just
     * those rows and columns that are needed, replicated as necessary.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public void setDimensions(int w, int h) {

    /**
     * Override the dimensions of the source image and pass the dimensions
     * of the new scaled size to the ImageConsumer.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public void setProperties(Hashtable<?,?> props) {

    /**
     * Passes along the properties from the source object after adding a
     * property indicating the scale applied.
     * This method invokes <code>super.setProperties</code>,
     * which might result in additional properties being added.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public ReplicateScaleFilter(int width, int height) {

    /**
     * Constructs a ReplicateScaleFilter that scales the pixels from
     * its source Image as specified by the width and height parameters.
     * @param width the target width to scale the image
     * @param height the target height to scale the image
     * @throws IllegalArgumentException if <code>width</code> equals
     *         zero or <code>height</code> equals zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected Object outpixbuf;

    /**
     * A <code>byte</code> array initialized with a size of
     * {@link #destWidth} and used to deliver a row of pixel
     * data to the {@link ImageConsumer}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int srccols[];

    /**
     * An <code>int</code> array containing information about a
     * column of pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int srcrows[];

    /**
     * An <code>int</code> array containing information about a
     * row of pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int destHeight;

    /**
     * The target height to scale the image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int destWidth;

    /**
     * The target width to scale the image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int srcHeight;

    /**
     * The height of the source image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int srcWidth;

    /**
     * The width of the source image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
public class ReplicateScaleFilter extends ImageFilter {

/**
 * An ImageFilter class for scaling images using the simplest algorithm.
 * This class extends the basic ImageFilter Class to scale an existing
 * image and provide a source for a new image containing the resampled
 * image.  The pixels in the source image are sampled to produce pixels
 * for an image of the specified size by replicating rows and columns of
 * pixels to scale up or omitting rows and columns of pixels to scale
 * down.
 * <p>It is meant to be used in conjunction with a FilteredImageSource
 * object to produce scaled versions of existing images.  Due to
 * implementation dependencies, there may be differences in pixel values
 * of an image filtered on different platforms.
 *
 * @see FilteredImageSource
 * @see ImageFilter
 *
 * @author      Jim Graham
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * Choose which rows and columns of the delivered int pixels are
     * needed for the destination scaled image and pass through just
     * those rows and columns that are needed, replicated as necessary.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * Choose which rows and columns of the delivered byte pixels are
     * needed for the destination scaled image and pass through just
     * those rows and columns that are needed, replicated as necessary.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public void setDimensions(int w, int h) {

    /**
     * Override the dimensions of the source image and pass the dimensions
     * of the new scaled size to the ImageConsumer.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public void setProperties(Hashtable<?,?> props) {

    /**
     * Passes along the properties from the source object after adding a
     * property indicating the scale applied.
     * This method invokes <code>super.setProperties</code>,
     * which might result in additional properties being added.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    public ReplicateScaleFilter(int width, int height) {

    /**
     * Constructs a ReplicateScaleFilter that scales the pixels from
     * its source Image as specified by the width and height parameters.
     * @param width the target width to scale the image
     * @param height the target height to scale the image
     * @throws IllegalArgumentException if <code>width</code> equals
     *         zero or <code>height</code> equals zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected Object outpixbuf;

    /**
     * A <code>byte</code> array initialized with a size of
     * {@link #destWidth} and used to deliver a row of pixel
     * data to the {@link ImageConsumer}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int srccols[];

    /**
     * An <code>int</code> array containing information about a
     * column of pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int srcrows[];

    /**
     * An <code>int</code> array containing information about a
     * row of pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int destHeight;

    /**
     * The target height to scale the image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int destWidth;

    /**
     * The target width to scale the image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int srcHeight;

    /**
     * The height of the source image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
    protected int srcWidth;

    /**
     * The width of the source image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ReplicateScaleFilter.java
public class ReplicateScaleFilter extends ImageFilter {

/**
 * An ImageFilter class for scaling images using the simplest algorithm.
 * This class extends the basic ImageFilter Class to scale an existing
 * image and provide a source for a new image containing the resampled
 * image.  The pixels in the source image are sampled to produce pixels
 * for an image of the specified size by replicating rows and columns of
 * pixels to scale up or omitting rows and columns of pixels to scale
 * down.
 * <p>It is meant to be used in conjunction with a FilteredImageSource
 * object to produce scaled versions of existing images.  Due to
 * implementation dependencies, there may be differences in pixel values
 * of an image filtered on different platforms.
 *
 * @see FilteredImageSource
 * @see ImageFilter
 *
 * @author      Jim Graham
 */
