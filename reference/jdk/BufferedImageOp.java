_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
    public RenderingHints getRenderingHints();

    /**
     * Returns the rendering hints for this operation.
     *
     * @return The <CODE>RenderingHints</CODE> object for this
     * <CODE>BufferedImageOp</CODE>.  Returns
     * null if no hints have been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
    public Point2D getPoint2D (Point2D srcPt, Point2D dstPt);

    /**
     * Returns the location of the corresponding destination point given a
     * point in the source image.  If <CODE>dstPt</CODE> is specified, it
     * is used to hold the return value.
     * @param srcPt the <code>Point2D</code> that represents the point in
     * the source image
     * @param dstPt The <CODE>Point2D</CODE> in which to store the result
     *
     * @return The <CODE>Point2D</CODE> in the destination image that
     * corresponds to the specified point in the source image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
    public BufferedImage createCompatibleDestImage (BufferedImage src,
                                                    ColorModel destCM);

    /**
     * Creates a zeroed destination image with the correct size and number of
     * bands.
     * An <CODE>IllegalArgumentException</CODE> may be thrown if the source
     * image is incompatible with the types of images allowed
     * by the class implementing this filter.
     *
     * @param src The <CODE>BufferedImage</CODE> to be filtered
     * @param destCM <CODE>ColorModel</CODE> of the destination.  If null,
     * the <CODE>ColorModel</CODE> of the source is used.
     *
     * @return The zeroed destination image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
    public Rectangle2D getBounds2D (BufferedImage src);

    /**
     * Returns the bounding box of the filtered destination image.
     * An <CODE>IllegalArgumentException</CODE> may be thrown if the source
     * image is incompatible with the types of images allowed
     * by the class implementing this filter.
     *
     * @param src The <CODE>BufferedImage</CODE> to be filtered
     *
     * @return The <CODE>Rectangle2D</CODE> representing the destination
     * image's bounding box.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
public interface BufferedImageOp {

/**
 * This interface describes single-input/single-output
 * operations performed on <CODE>BufferedImage</CODE> objects.
 * It is implemented by <CODE>AffineTransformOp</CODE>,
 * <CODE>ConvolveOp</CODE>, <CODE>ColorConvertOp</CODE>, <CODE>RescaleOp</CODE>,
 * and <CODE>LookupOp</CODE>.  These objects can be passed into
 * a <CODE>BufferedImageFilter</CODE> to operate on a
 * <CODE>BufferedImage</CODE> in the
 * ImageProducer-ImageFilter-ImageConsumer paradigm.
 * <p>
 * Classes that implement this
 * interface must specify whether or not they allow in-place filtering--
 * filter operations where the source object is equal to the destination
 * object.
 * <p>
 * This interface cannot be used to describe more sophisticated operations
 * such as those that take multiple sources. Note that this restriction also
 * means that the values of the destination pixels prior to the operation are
 * not used as input to the filter operation.

 * @see BufferedImage
 * @see BufferedImageFilter
 * @see AffineTransformOp
 * @see BandCombineOp
 * @see ColorConvertOp
 * @see ConvolveOp
 * @see LookupOp
 * @see RescaleOp
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
    public RenderingHints getRenderingHints();

    /**
     * Returns the rendering hints for this operation.
     *
     * @return The <CODE>RenderingHints</CODE> object for this
     * <CODE>BufferedImageOp</CODE>.  Returns
     * null if no hints have been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
    public Point2D getPoint2D (Point2D srcPt, Point2D dstPt);

    /**
     * Returns the location of the corresponding destination point given a
     * point in the source image.  If <CODE>dstPt</CODE> is specified, it
     * is used to hold the return value.
     * @param srcPt the <code>Point2D</code> that represents the point in
     * the source image
     * @param dstPt The <CODE>Point2D</CODE> in which to store the result
     *
     * @return The <CODE>Point2D</CODE> in the destination image that
     * corresponds to the specified point in the source image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
    public BufferedImage createCompatibleDestImage (BufferedImage src,
                                                    ColorModel destCM);

    /**
     * Creates a zeroed destination image with the correct size and number of
     * bands.
     * An <CODE>IllegalArgumentException</CODE> may be thrown if the source
     * image is incompatible with the types of images allowed
     * by the class implementing this filter.
     *
     * @param src The <CODE>BufferedImage</CODE> to be filtered
     * @param destCM <CODE>ColorModel</CODE> of the destination.  If null,
     * the <CODE>ColorModel</CODE> of the source is used.
     *
     * @return The zeroed destination image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
    public Rectangle2D getBounds2D (BufferedImage src);

    /**
     * Returns the bounding box of the filtered destination image.
     * An <CODE>IllegalArgumentException</CODE> may be thrown if the source
     * image is incompatible with the types of images allowed
     * by the class implementing this filter.
     *
     * @param src The <CODE>BufferedImage</CODE> to be filtered
     *
     * @return The <CODE>Rectangle2D</CODE> representing the destination
     * image's bounding box.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImageOp.java
public interface BufferedImageOp {

/**
 * This interface describes single-input/single-output
 * operations performed on <CODE>BufferedImage</CODE> objects.
 * It is implemented by <CODE>AffineTransformOp</CODE>,
 * <CODE>ConvolveOp</CODE>, <CODE>ColorConvertOp</CODE>, <CODE>RescaleOp</CODE>,
 * and <CODE>LookupOp</CODE>.  These objects can be passed into
 * a <CODE>BufferedImageFilter</CODE> to operate on a
 * <CODE>BufferedImage</CODE> in the
 * ImageProducer-ImageFilter-ImageConsumer paradigm.
 * <p>
 * Classes that implement this
 * interface must specify whether or not they allow in-place filtering--
 * filter operations where the source object is equal to the destination
 * object.
 * <p>
 * This interface cannot be used to describe more sophisticated operations
 * such as those that take multiple sources. Note that this restriction also
 * means that the values of the destination pixels prior to the operation are
 * not used as input to the filter operation.

 * @see BufferedImage
 * @see BufferedImageFilter
 * @see AffineTransformOp
 * @see BandCombineOp
 * @see ColorConvertOp
 * @see ConvolveOp
 * @see LookupOp
 * @see RescaleOp
 */
