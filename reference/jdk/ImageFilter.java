_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public Object clone() {

    /**
     * Clones this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void resendTopDownLeftRight(ImageProducer ip) {

    /**
     * Responds to a request for a TopDownLeftRight (TDLR) ordered resend
     * of the pixel data from an <code>ImageConsumer</code>.
     * When an <code>ImageConsumer</code> being fed
     * by an instance of this <code>ImageFilter</code>
     * requests a resend of the data in TDLR order,
     * the <code>FilteredImageSource</code>
     * invokes this method of the <code>ImageFilter</code>.
     *
     * <p>
     *
     * An <code>ImageFilter</code> subclass might override this method or not,
     * depending on if and how it can send data in TDLR order.
     * Three possibilities exist:
     *
     * <ul>
     * <li>
     * Do not override this method.
     * This makes the subclass use the default implementation,
     * which is to
     * forward the request
     * to the indicated <code>ImageProducer</code>
     * using this filter as the requesting <code>ImageConsumer</code>.
     * This behavior
     * is appropriate if the filter can determine
     * that it will forward the pixels
     * in TDLR order if its upstream producer object
     * sends them in TDLR order.
     *
     * <li>
     * Override the method to simply send the data.
     * This is appropriate if the filter can handle the request itself &#151;
     * for example,
     * if the generated pixels have been saved in some sort of buffer.
     *
     * <li>
     * Override the method to do nothing.
     * This is appropriate
     * if the filter cannot produce filtered data in TDLR order.
     * </ul>
     *
     * @see ImageProducer#requestTopDownLeftRightResend
     * @param ip the ImageProducer that is feeding this instance of
     * the filter - also the ImageProducer that the request should be
     * forwarded to if necessary
     * @exception NullPointerException if <code>ip</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void imageComplete(int status) {

    /**
     * Filters the information provided in the imageComplete method of
     * the ImageConsumer interface.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#imageComplete
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * Filters the information provided in the setPixels method of the
     * ImageConsumer interface which takes an array of integers.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * Filters the information provided in the setPixels method of the
     * ImageConsumer interface which takes an array of bytes.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setHints(int hints) {

    /**
     * Filters the information provided in the setHints method
     * of the ImageConsumer interface.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setHints
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setColorModel(ColorModel model) {

    /**
     * Filter the information provided in the setColorModel method
     * of the ImageConsumer interface.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setProperties(Hashtable<?,?> props) {

    /**
     * Passes the properties from the source object along after adding a
     * property indicating the stream of filters it has been run through.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     *
     * @param props the properties from the source object
     * @exception NullPointerException if <code>props</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setDimensions(int width, int height) {

    /**
     * Filters the information provided in the setDimensions method
     * of the ImageConsumer interface.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setDimensions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public ImageFilter getFilterInstance(ImageConsumer ic) {

    /**
     * Returns a unique instance of an ImageFilter object which will
     * actually perform the filtering for the specified ImageConsumer.
     * The default implementation just clones this object.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @param ic the specified <code>ImageConsumer</code>
     * @return an <code>ImageFilter</code> used to perform the
     *         filtering for the specified <code>ImageConsumer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
public class ImageFilter implements ImageConsumer, Cloneable {

/**
 * This class implements a filter for the set of interface methods that
 * are used to deliver data from an ImageProducer to an ImageConsumer.
 * It is meant to be used in conjunction with a FilteredImageSource
 * object to produce filtered versions of existing images.  It is a
 * base class that provides the calls needed to implement a "Null filter"
 * which has no effect on the data being passed through.  Filters should
 * subclass this class and override the methods which deal with the
 * data that needs to be filtered and modify it as necessary.
 *
 * @see FilteredImageSource
 * @see ImageConsumer
 *
 * @author      Jim Graham
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public Object clone() {

    /**
     * Clones this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void resendTopDownLeftRight(ImageProducer ip) {

    /**
     * Responds to a request for a TopDownLeftRight (TDLR) ordered resend
     * of the pixel data from an <code>ImageConsumer</code>.
     * When an <code>ImageConsumer</code> being fed
     * by an instance of this <code>ImageFilter</code>
     * requests a resend of the data in TDLR order,
     * the <code>FilteredImageSource</code>
     * invokes this method of the <code>ImageFilter</code>.
     *
     * <p>
     *
     * An <code>ImageFilter</code> subclass might override this method or not,
     * depending on if and how it can send data in TDLR order.
     * Three possibilities exist:
     *
     * <ul>
     * <li>
     * Do not override this method.
     * This makes the subclass use the default implementation,
     * which is to
     * forward the request
     * to the indicated <code>ImageProducer</code>
     * using this filter as the requesting <code>ImageConsumer</code>.
     * This behavior
     * is appropriate if the filter can determine
     * that it will forward the pixels
     * in TDLR order if its upstream producer object
     * sends them in TDLR order.
     *
     * <li>
     * Override the method to simply send the data.
     * This is appropriate if the filter can handle the request itself &#151;
     * for example,
     * if the generated pixels have been saved in some sort of buffer.
     *
     * <li>
     * Override the method to do nothing.
     * This is appropriate
     * if the filter cannot produce filtered data in TDLR order.
     * </ul>
     *
     * @see ImageProducer#requestTopDownLeftRightResend
     * @param ip the ImageProducer that is feeding this instance of
     * the filter - also the ImageProducer that the request should be
     * forwarded to if necessary
     * @exception NullPointerException if <code>ip</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void imageComplete(int status) {

    /**
     * Filters the information provided in the imageComplete method of
     * the ImageConsumer interface.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#imageComplete
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, int pixels[], int off,
                          int scansize) {

    /**
     * Filters the information provided in the setPixels method of the
     * ImageConsumer interface which takes an array of integers.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setPixels(int x, int y, int w, int h,
                          ColorModel model, byte pixels[], int off,
                          int scansize) {

    /**
     * Filters the information provided in the setPixels method of the
     * ImageConsumer interface which takes an array of bytes.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setPixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setHints(int hints) {

    /**
     * Filters the information provided in the setHints method
     * of the ImageConsumer interface.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setHints
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setColorModel(ColorModel model) {

    /**
     * Filter the information provided in the setColorModel method
     * of the ImageConsumer interface.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setColorModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setProperties(Hashtable<?,?> props) {

    /**
     * Passes the properties from the source object along after adding a
     * property indicating the stream of filters it has been run through.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     *
     * @param props the properties from the source object
     * @exception NullPointerException if <code>props</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public void setDimensions(int width, int height) {

    /**
     * Filters the information provided in the setDimensions method
     * of the ImageConsumer interface.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @see ImageConsumer#setDimensions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
    public ImageFilter getFilterInstance(ImageConsumer ic) {

    /**
     * Returns a unique instance of an ImageFilter object which will
     * actually perform the filtering for the specified ImageConsumer.
     * The default implementation just clones this object.
     * <p>
     * Note: This method is intended to be called by the ImageProducer
     * of the Image whose pixels are being filtered.  Developers using
     * this class to filter pixels from an image should avoid calling
     * this method directly since that operation could interfere
     * with the filtering operation.
     * @param ic the specified <code>ImageConsumer</code>
     * @return an <code>ImageFilter</code> used to perform the
     *         filtering for the specified <code>ImageConsumer</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageFilter.java
public class ImageFilter implements ImageConsumer, Cloneable {

/**
 * This class implements a filter for the set of interface methods that
 * are used to deliver data from an ImageProducer to an ImageConsumer.
 * It is meant to be used in conjunction with a FilteredImageSource
 * object to produce filtered versions of existing images.  It is a
 * base class that provides the calls needed to implement a "Null filter"
 * which has no effect on the data being passed through.  Filters should
 * subclass this class and override the methods which deal with the
 * data that needs to be filtered and modify it as necessary.
 *
 * @see FilteredImageSource
 * @see ImageConsumer
 *
 * @author      Jim Graham
 */
