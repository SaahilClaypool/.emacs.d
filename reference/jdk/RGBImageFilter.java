_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public abstract int filterRGB(int x, int y, int rgb);

    /**
     * Subclasses must specify a method to convert a single input pixel
     * in the default RGB ColorModel to a single output pixel.
     * @param x the X coordinate of the pixel
     * @param y the Y coordinate of the pixel
     * @param rgb the integer pixel representation in the default RGB
     *            color model
     * @return a filtered pixel in the default RGB color model.
     * @see ColorModel#getRGBdefault
     * @see #filterRGBPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * If the ColorModel object is the same one that has already
     * been converted, then simply passes the pixels through with the
     * converted ColorModel, otherwise converts the buffer of integer
     * pixels to the default RGB ColorModel and passes the converted
     * buffer to the filterRGBPixels method to be converted one by one.
     * Converts a buffer of integer pixels to the default RGB ColorModel
     * and passes the converted buffer to the filterRGBPixels method.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ColorModel#getRGBdefault
     * @see #filterRGBPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * If the ColorModel object is the same one that has already
     * been converted, then simply passes the pixels through with the
     * converted ColorModel. Otherwise converts the buffer of byte
     * pixels to the default RGB ColorModel and passes the converted
     * buffer to the filterRGBPixels method to be converted one by one.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ColorModel#getRGBdefault
     * @see #filterRGBPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void filterRGBPixels(int x, int y, int w, int h,
                                int pixels[], int off, int scansize) {

    /**
     * Filters a buffer of pixels in the default RGB ColorModel by passing
     * them one by one through the filterRGB method.
     * @param x the X coordinate of the upper-left corner of the region
     *          of pixels
     * @param y the Y coordinate of the upper-left corner of the region
     *          of pixels
     * @param w the width of the region of pixels
     * @param h the height of the region of pixels
     * @param pixels the array of pixels
     * @param off the offset into the <code>pixels</code> array
     * @param scansize the distance from one row of pixels to the next
     *        in the array
     * @see ColorModel#getRGBdefault
     * @see #filterRGB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public IndexColorModel filterIndexColorModel(IndexColorModel icm) {

    /**
     * Filters an IndexColorModel object by running each entry in its
     * color tables through the filterRGB function that RGBImageFilter
     * subclasses must provide.  Uses coordinates of -1 to indicate that
     * a color table entry is being filtered rather than an actual
     * pixel value.
     * @param icm the IndexColorModel object to be filtered
     * @exception NullPointerException if <code>icm</code> is null
     * @return a new IndexColorModel representing the filtered colors
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void substituteColorModel(ColorModel oldcm, ColorModel newcm) {

    /**
     * Registers two ColorModel objects for substitution.  If the oldcm
     * is encountered during any of the setPixels methods, the newcm
     * is substituted and the pixels passed through
     * untouched (but with the new ColorModel object).
     * @param oldcm the ColorModel object to be replaced on the fly
     * @param newcm the ColorModel object to replace oldcm on the fly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void setColorModel(ColorModel model) {

    /**
     * If the ColorModel is an IndexColorModel and the subclass has
     * set the canFilterIndexColorModel flag to true, we substitute
     * a filtered version of the color model here and wherever
     * that original ColorModel object appears in the setPixels methods.
     * If the ColorModel is not an IndexColorModel or is null, this method
     * overrides the default ColorModel used by the ImageProducer and
     * specifies the default RGB ColorModel instead.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer
     * @see ColorModel#getRGBdefault
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    protected boolean canFilterIndexColorModel;

    /**
     * This boolean indicates whether or not it is acceptable to apply
     * the color filtering of the filterRGB method to the color table
     * entries of an IndexColorModel object in lieu of pixel by pixel
     * filtering.  Subclasses should set this variable to true in their
     * constructor if their filterRGB method does not depend on the
     * coordinate of the pixel being filtered.
     * @see #substituteColorModel
     * @see #filterRGB
     * @see IndexColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    protected ColorModel newmodel;

    /**
     * The <code>ColorModel</code> with which to
     * replace <code>origmodel</code> when the user calls
     * <code>substituteColorModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    protected ColorModel origmodel;

    /**
     * The <code>ColorModel</code> to be replaced by
     * <code>newmodel</code> when the user calls
     * {@link #substituteColorModel(ColorModel, ColorModel) substituteColorModel}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
public abstract class RGBImageFilter extends ImageFilter {

/**
 * This class provides an easy way to create an ImageFilter which modifies
 * the pixels of an image in the default RGB ColorModel.  It is meant to
 * be used in conjunction with a FilteredImageSource object to produce
 * filtered versions of existing images.  It is an abstract class that
 * provides the calls needed to channel all of the pixel data through a
 * single method which converts pixels one at a time in the default RGB
 * ColorModel regardless of the ColorModel being used by the ImageProducer.
 * The only method which needs to be defined to create a useable image
 * filter is the filterRGB method.  Here is an example of a definition
 * of a filter which swaps the red and blue components of an image:
 * <pre>{@code
 *
 *      class RedBlueSwapFilter extends RGBImageFilter {
 *          public RedBlueSwapFilter() {
 *              // The filter's operation does not depend on the
 *              // pixel's location, so IndexColorModels can be
 *              // filtered directly.
 *              canFilterIndexColorModel = true;
 *          }
 *
 *          public int filterRGB(int x, int y, int rgb) {
 *              return ((rgb & 0xff00ff00)
 *                      | ((rgb & 0xff0000) >> 16)
 *                      | ((rgb & 0xff) << 16));
 *          }
 *      }
 *
 * }</pre>
 *
 * @see FilteredImageSource
 * @see ImageFilter
 * @see ColorModel#getRGBdefault
 *
 * @author      Jim Graham
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public abstract int filterRGB(int x, int y, int rgb);

    /**
     * Subclasses must specify a method to convert a single input pixel
     * in the default RGB ColorModel to a single output pixel.
     * @param x the X coordinate of the pixel
     * @param y the Y coordinate of the pixel
     * @param rgb the integer pixel representation in the default RGB
     *            color model
     * @return a filtered pixel in the default RGB color model.
     * @see ColorModel#getRGBdefault
     * @see #filterRGBPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * If the ColorModel object is the same one that has already
     * been converted, then simply passes the pixels through with the
     * converted ColorModel, otherwise converts the buffer of integer
     * pixels to the default RGB ColorModel and passes the converted
     * buffer to the filterRGBPixels method to be converted one by one.
     * Converts a buffer of integer pixels to the default RGB ColorModel
     * and passes the converted buffer to the filterRGBPixels method.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ColorModel#getRGBdefault
     * @see #filterRGBPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * If the ColorModel object is the same one that has already
     * been converted, then simply passes the pixels through with the
     * converted ColorModel. Otherwise converts the buffer of byte
     * pixels to the default RGB ColorModel and passes the converted
     * buffer to the filterRGBPixels method to be converted one by one.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ColorModel#getRGBdefault
     * @see #filterRGBPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void filterRGBPixels(int x, int y, int w, int h,
                                int pixels[], int off, int scansize) {

    /**
     * Filters a buffer of pixels in the default RGB ColorModel by passing
     * them one by one through the filterRGB method.
     * @param x the X coordinate of the upper-left corner of the region
     *          of pixels
     * @param y the Y coordinate of the upper-left corner of the region
     *          of pixels
     * @param w the width of the region of pixels
     * @param h the height of the region of pixels
     * @param pixels the array of pixels
     * @param off the offset into the <code>pixels</code> array
     * @param scansize the distance from one row of pixels to the next
     *        in the array
     * @see ColorModel#getRGBdefault
     * @see #filterRGB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public IndexColorModel filterIndexColorModel(IndexColorModel icm) {

    /**
     * Filters an IndexColorModel object by running each entry in its
     * color tables through the filterRGB function that RGBImageFilter
     * subclasses must provide.  Uses coordinates of -1 to indicate that
     * a color table entry is being filtered rather than an actual
     * pixel value.
     * @param icm the IndexColorModel object to be filtered
     * @exception NullPointerException if <code>icm</code> is null
     * @return a new IndexColorModel representing the filtered colors
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void substituteColorModel(ColorModel oldcm, ColorModel newcm) {

    /**
     * Registers two ColorModel objects for substitution.  If the oldcm
     * is encountered during any of the setPixels methods, the newcm
     * is substituted and the pixels passed through
     * untouched (but with the new ColorModel object).
     * @param oldcm the ColorModel object to be replaced on the fly
     * @param newcm the ColorModel object to replace oldcm on the fly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    public void setColorModel(ColorModel model) {

    /**
     * If the ColorModel is an IndexColorModel and the subclass has
     * set the canFilterIndexColorModel flag to true, we substitute
     * a filtered version of the color model here and wherever
     * that original ColorModel object appears in the setPixels methods.
     * If the ColorModel is not an IndexColorModel or is null, this method
     * overrides the default ColorModel used by the ImageProducer and
     * specifies the default RGB ColorModel instead.
     * <p>
     * Note: This method is intended to be called by the
     * <code>ImageProducer</code> of the <code>Image</code> whose pixels
     * are being filtered. Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer
     * @see ColorModel#getRGBdefault
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    protected boolean canFilterIndexColorModel;

    /**
     * This boolean indicates whether or not it is acceptable to apply
     * the color filtering of the filterRGB method to the color table
     * entries of an IndexColorModel object in lieu of pixel by pixel
     * filtering.  Subclasses should set this variable to true in their
     * constructor if their filterRGB method does not depend on the
     * coordinate of the pixel being filtered.
     * @see #substituteColorModel
     * @see #filterRGB
     * @see IndexColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    protected ColorModel newmodel;

    /**
     * The <code>ColorModel</code> with which to
     * replace <code>origmodel</code> when the user calls
     * <code>substituteColorModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
    protected ColorModel origmodel;

    /**
     * The <code>ColorModel</code> to be replaced by
     * <code>newmodel</code> when the user calls
     * {@link #substituteColorModel(ColorModel, ColorModel) substituteColorModel}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RGBImageFilter.java
public abstract class RGBImageFilter extends ImageFilter {

/**
 * This class provides an easy way to create an ImageFilter which modifies
 * the pixels of an image in the default RGB ColorModel.  It is meant to
 * be used in conjunction with a FilteredImageSource object to produce
 * filtered versions of existing images.  It is an abstract class that
 * provides the calls needed to channel all of the pixel data through a
 * single method which converts pixels one at a time in the default RGB
 * ColorModel regardless of the ColorModel being used by the ImageProducer.
 * The only method which needs to be defined to create a useable image
 * filter is the filterRGB method.  Here is an example of a definition
 * of a filter which swaps the red and blue components of an image:
 * <pre>{@code
 *
 *      class RedBlueSwapFilter extends RGBImageFilter {
 *          public RedBlueSwapFilter() {
 *              // The filter's operation does not depend on the
 *              // pixel's location, so IndexColorModels can be
 *              // filtered directly.
 *              canFilterIndexColorModel = true;
 *          }
 *
 *          public int filterRGB(int x, int y, int rgb) {
 *              return ((rgb & 0xff00ff00)
 *                      | ((rgb & 0xff0000) >> 16)
 *                      | ((rgb & 0xff) << 16));
 *          }
 *      }
 *
 * }</pre>
 *
 * @see FilteredImageSource
 * @see ImageFilter
 * @see ColorModel#getRGBdefault
 *
 * @author      Jim Graham
 */
