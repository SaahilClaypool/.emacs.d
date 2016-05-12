_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public void run() {

    /**
     * The runnable method for this class. This will produce an image using
     * the current RenderableImage and RenderContext and send it to all the
     * ImageConsumer currently registered with this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public void requestTopDownLeftRightResend(ImageConsumer ic) {

    /**
     * Requests that a given ImageConsumer have the image data delivered
     * one more time in top-down, left-right order.
     *
     * @param ic the ImageConsumer requesting the resend.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized void startProduction(ImageConsumer ic) {

    /**
     * Adds an ImageConsumer to the list of consumers interested in
     * data for this image, and immediately starts delivery of the
     * image data through the ImageConsumer interface.
     *
     * @param ic the ImageConsumer to be added to the list of consumers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized void removeConsumer(ImageConsumer ic) {

    /**
     * Remove an ImageConsumer from the list of consumers interested in
     * data for this image.
     *
     * @param ic the ImageConsumer to be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized boolean isConsumer(ImageConsumer ic) {

    /**
     * Determine if an ImageConsumer is on the list of consumers
     * currently interested in data for this image.
     *
     * @param ic the ImageConsumer to be checked.
     * @return true if the ImageConsumer is on the list; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized void addConsumer(ImageConsumer ic) {

   /**
     * Adds an ImageConsumer to the list of consumers interested in
     * data for this image.
     *
     * @param ic an ImageConsumer to be added to the interest list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized void setRenderContext(RenderContext rc) {

    /**
     * Sets a new RenderContext to use for the next startProduction() call.
     *
     * @param rc the new RenderContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public RenderableImageProducer(RenderableImage rdblImage,
                                   RenderContext rc) {

    /**
     * Constructs a new RenderableImageProducer from a RenderableImage
     * and a RenderContext.
     *
     * @param rdblImage the RenderableImage to be rendered.
     * @param rc the RenderContext to use for producing the pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    Vector ics = new Vector();

    /** A Vector of image consumers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    RenderContext rc;

    /** The RenderContext to use for producing the image. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    RenderableImage rdblImage;

    /** The RenderableImage source for the producer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
public class RenderableImageProducer implements ImageProducer, Runnable {

/**
 * An adapter class that implements ImageProducer to allow the
 * asynchronous production of a RenderableImage.  The size of the
 * ImageConsumer is determined by the scale factor of the usr2dev
 * transform in the RenderContext.  If the RenderContext is null, the
 * default rendering of the RenderableImage is used.  This class
 * implements an asynchronous production that produces the image in
 * one thread at one resolution.  This class may be subclassed to
 * implement versions that will render the image using several
 * threads.  These threads could render either the same image at
 * progressively better quality, or different sections of the image at
 * a single resolution.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public void run() {

    /**
     * The runnable method for this class. This will produce an image using
     * the current RenderableImage and RenderContext and send it to all the
     * ImageConsumer currently registered with this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public void requestTopDownLeftRightResend(ImageConsumer ic) {

    /**
     * Requests that a given ImageConsumer have the image data delivered
     * one more time in top-down, left-right order.
     *
     * @param ic the ImageConsumer requesting the resend.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized void startProduction(ImageConsumer ic) {

    /**
     * Adds an ImageConsumer to the list of consumers interested in
     * data for this image, and immediately starts delivery of the
     * image data through the ImageConsumer interface.
     *
     * @param ic the ImageConsumer to be added to the list of consumers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized void removeConsumer(ImageConsumer ic) {

    /**
     * Remove an ImageConsumer from the list of consumers interested in
     * data for this image.
     *
     * @param ic the ImageConsumer to be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized boolean isConsumer(ImageConsumer ic) {

    /**
     * Determine if an ImageConsumer is on the list of consumers
     * currently interested in data for this image.
     *
     * @param ic the ImageConsumer to be checked.
     * @return true if the ImageConsumer is on the list; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized void addConsumer(ImageConsumer ic) {

   /**
     * Adds an ImageConsumer to the list of consumers interested in
     * data for this image.
     *
     * @param ic an ImageConsumer to be added to the interest list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public synchronized void setRenderContext(RenderContext rc) {

    /**
     * Sets a new RenderContext to use for the next startProduction() call.
     *
     * @param rc the new RenderContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    public RenderableImageProducer(RenderableImage rdblImage,
                                   RenderContext rc) {

    /**
     * Constructs a new RenderableImageProducer from a RenderableImage
     * and a RenderContext.
     *
     * @param rdblImage the RenderableImage to be rendered.
     * @param rc the RenderContext to use for producing the pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    Vector ics = new Vector();

    /** A Vector of image consumers. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    RenderContext rc;

    /** The RenderContext to use for producing the image. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
    RenderableImage rdblImage;

    /** The RenderableImage source for the producer. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/renderable/RenderableImageProducer.java
public class RenderableImageProducer implements ImageProducer, Runnable {

/**
 * An adapter class that implements ImageProducer to allow the
 * asynchronous production of a RenderableImage.  The size of the
 * ImageConsumer is determined by the scale factor of the usr2dev
 * transform in the RenderContext.  If the RenderContext is null, the
 * default rendering of the RenderableImage is used.  This class
 * implements an asynchronous production that produces the image in
 * one thread at one resolution.  This class may be subclassed to
 * implement versions that will render the image using several
 * threads.  These threads could render either the same image at
 * progressively better quality, or different sections of the image at
 * a single resolution.
 */
