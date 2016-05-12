_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * Determine if the delivered int pixels intersect the region to
     * be extracted and pass through only that subset of pixels that
     * appear in the output region.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose
     * pixels are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * Determine whether the delivered byte pixels intersect the region to
     * be extracted and passes through only that subset of pixels that
     * appear in the output region.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose
     * pixels are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public void setDimensions(int w, int h) {

    /**
     * Override the source image's dimensions and pass the dimensions
     * of the rectangular cropped region to the ImageConsumer.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose
     * pixels are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public void setProperties(Hashtable<?,?> props) {

    /**
     * Passes along  the properties from the source object after adding a
     * property indicating the cropped region.
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public CropImageFilter(int x, int y, int w, int h) {

    /**
     * Constructs a CropImageFilter that extracts the absolute rectangular
     * region of pixels from its source Image as specified by the x, y,
     * w, and h parameters.
     * @param x the x location of the top of the rectangle to be extracted
     * @param y the y location of the top of the rectangle to be extracted
     * @param w the width of the rectangle to be extracted
     * @param h the height of the rectangle to be extracted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
public class CropImageFilter extends ImageFilter {

/**
 * An ImageFilter class for cropping images.
 * This class extends the basic ImageFilter Class to extract a given
 * rectangular region of an existing Image and provide a source for a
 * new image containing just the extracted region.  It is meant to
 * be used in conjunction with a FilteredImageSource object to produce
 * cropped versions of existing images.
 *
 * @see FilteredImageSource
 * @see ImageFilter
 *
 * @author      Jim Graham
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * Determine if the delivered int pixels intersect the region to
     * be extracted and pass through only that subset of pixels that
     * appear in the output region.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose
     * pixels are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * Determine whether the delivered byte pixels intersect the region to
     * be extracted and passes through only that subset of pixels that
     * appear in the output region.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose
     * pixels are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public void setDimensions(int w, int h) {

    /**
     * Override the source image's dimensions and pass the dimensions
     * of the rectangular cropped region to the ImageConsumer.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose
     * pixels are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public void setProperties(Hashtable<?,?> props) {

    /**
     * Passes along  the properties from the source object after adding a
     * property indicating the cropped region.
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
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
    public CropImageFilter(int x, int y, int w, int h) {

    /**
     * Constructs a CropImageFilter that extracts the absolute rectangular
     * region of pixels from its source Image as specified by the x, y,
     * w, and h parameters.
     * @param x the x location of the top of the rectangle to be extracted
     * @param y the y location of the top of the rectangle to be extracted
     * @param w the width of the rectangle to be extracted
     * @param h the height of the rectangle to be extracted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/CropImageFilter.java
public class CropImageFilter extends ImageFilter {

/**
 * An ImageFilter class for cropping images.
 * This class extends the basic ImageFilter Class to extract a given
 * rectangular region of an existing Image and provide a source for a
 * new image containing just the extracted region.  It is meant to
 * be used in conjunction with a FilteredImageSource object to produce
 * cropped versions of existing images.
 *
 * @see FilteredImageSource
 * @see ImageFilter
 *
 * @author      Jim Graham
 */
