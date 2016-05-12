_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
    public void requestTopDownLeftRightResend(ImageConsumer ic);

    /**
     * Requests, on behalf of the <code>ImageConsumer</code>,
     * that the <code>ImageProducer</code> attempt to resend
     * the image data one more time in TOPDOWNLEFTRIGHT order
     * so that higher quality conversion algorithms which
     * depend on receiving pixels in order can be used to
     * produce a better output version of the image.  The
     * <code>ImageProducer</code> is free to
     * ignore this call if it cannot resend the data in that
     * order.  If the data can be resent, the
     * <code>ImageProducer</code> should respond by executing
     * the following minimum set of <code>ImageConsumer</code>
     * method calls:
     * <pre>{@code
     *  ic.setHints(TOPDOWNLEFTRIGHT | < otherhints >);
     *  ic.setPixels(...);      // As many times as needed
     *  ic.imageComplete();
     * }</pre>
     * @param ic the specified <code>ImageConsumer</code>
     * @see ImageConsumer#setHints
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
    public void startProduction(ImageConsumer ic);

    /**
     * Registers the specified <code>ImageConsumer</code> object
     * as a consumer and starts an immediate reconstruction of
     * the image data which will then be delivered to this
     * consumer and any other consumer which might have already
     * been registered with the producer.  This method differs
     * from the addConsumer method in that a reproduction of
     * the image data should be triggered as soon as possible.
     * @param ic the specified <code>ImageConsumer</code>
     * @see #addConsumer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
    public void removeConsumer(ImageConsumer ic);

    /**
     * Removes the specified <code>ImageConsumer</code> object
     * from the list of consumers currently registered to
     * receive image data.  It is not considered an error
     * to remove a consumer that is not currently registered.
     * The <code>ImageProducer</code> should stop sending data
     * to this consumer as soon as is feasible.
     * @param ic the specified <code>ImageConsumer</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
    public boolean isConsumer(ImageConsumer ic);

    /**
     * Determines if a specified <code>ImageConsumer</code>
     * object is currently registered with this
     * <code>ImageProducer</code> as one of its consumers.
     * @param ic the specified <code>ImageConsumer</code>
     * @return <code>true</code> if the specified
     *         <code>ImageConsumer</code> is registered with
     *         this <code>ImageProducer</code>;
     *         <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
public interface ImageProducer {

/**
 * The interface for objects which can produce the image data for Images.
 * Each image contains an ImageProducer which is used to reconstruct
 * the image whenever it is needed, for example, when a new size of the
 * Image is scaled, or when the width or height of the Image is being
 * requested.
 *
 * @see ImageConsumer
 *
 * @author      Jim Graham
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
    public void requestTopDownLeftRightResend(ImageConsumer ic);

    /**
     * Requests, on behalf of the <code>ImageConsumer</code>,
     * that the <code>ImageProducer</code> attempt to resend
     * the image data one more time in TOPDOWNLEFTRIGHT order
     * so that higher quality conversion algorithms which
     * depend on receiving pixels in order can be used to
     * produce a better output version of the image.  The
     * <code>ImageProducer</code> is free to
     * ignore this call if it cannot resend the data in that
     * order.  If the data can be resent, the
     * <code>ImageProducer</code> should respond by executing
     * the following minimum set of <code>ImageConsumer</code>
     * method calls:
     * <pre>{@code
     *  ic.setHints(TOPDOWNLEFTRIGHT | < otherhints >);
     *  ic.setPixels(...);      // As many times as needed
     *  ic.imageComplete();
     * }</pre>
     * @param ic the specified <code>ImageConsumer</code>
     * @see ImageConsumer#setHints
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
    public void startProduction(ImageConsumer ic);

    /**
     * Registers the specified <code>ImageConsumer</code> object
     * as a consumer and starts an immediate reconstruction of
     * the image data which will then be delivered to this
     * consumer and any other consumer which might have already
     * been registered with the producer.  This method differs
     * from the addConsumer method in that a reproduction of
     * the image data should be triggered as soon as possible.
     * @param ic the specified <code>ImageConsumer</code>
     * @see #addConsumer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
    public void removeConsumer(ImageConsumer ic);

    /**
     * Removes the specified <code>ImageConsumer</code> object
     * from the list of consumers currently registered to
     * receive image data.  It is not considered an error
     * to remove a consumer that is not currently registered.
     * The <code>ImageProducer</code> should stop sending data
     * to this consumer as soon as is feasible.
     * @param ic the specified <code>ImageConsumer</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
    public boolean isConsumer(ImageConsumer ic);

    /**
     * Determines if a specified <code>ImageConsumer</code>
     * object is currently registered with this
     * <code>ImageProducer</code> as one of its consumers.
     * @param ic the specified <code>ImageConsumer</code>
     * @return <code>true</code> if the specified
     *         <code>ImageConsumer</code> is registered with
     *         this <code>ImageProducer</code>;
     *         <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageProducer.java
public interface ImageProducer {

/**
 * The interface for objects which can produce the image data for Images.
 * Each image contains an ImageProducer which is used to reconstruct
 * the image whenever it is needed, for example, when a new size of the
 * Image is scaled, or when the width or height of the Image is being
 * requested.
 *
 * @see ImageConsumer
 *
 * @author      Jim Graham
 */
