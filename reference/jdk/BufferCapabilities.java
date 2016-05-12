_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
        public static final FlipContents COPIED =

        /**
         * When flip contents are <code>COPIED</code>, the
         * contents of the back buffer are copied to the front buffer when
         * flipping.
         * @see #isPageFlipping
         * @see #getFlipContents
         * @see #UNDEFINED
         * @see #BACKGROUND
         * @see #PRIOR
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
        public static final FlipContents PRIOR =

        /**
         * When flip contents are <code>PRIOR</code>, the
         * contents of the back buffer are the prior contents of the front buffer
         * (a true page flip).
         * @see #isPageFlipping
         * @see #getFlipContents
         * @see #UNDEFINED
         * @see #BACKGROUND
         * @see #COPIED
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
        public static final FlipContents BACKGROUND =

        /**
         * When flip contents are <code>BACKGROUND</code>, the
         * contents of the back buffer are cleared with the background color after
         * flipping.
         * @see #isPageFlipping
         * @see #getFlipContents
         * @see #UNDEFINED
         * @see #PRIOR
         * @see #COPIED
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
        public static final FlipContents UNDEFINED =

        /**
         * When flip contents are <code>UNDEFINED</code>, the
         * contents of the back buffer are undefined after flipping.
         * @see #isPageFlipping
         * @see #getFlipContents
         * @see #BACKGROUND
         * @see #PRIOR
         * @see #COPIED
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public static final class FlipContents extends AttributeValue {

    /**
     * A type-safe enumeration of the possible back buffer contents after
     * page-flipping
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public Object clone() {

    /**
     * @return a copy of this BufferCapabilities object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public boolean isMultiBufferAvailable() {

    /**
     * @return whether or not
     * page flipping can be performed using more than two buffers (one or more
     * intermediate buffers as well as the front and back buffer).
     * @see #isPageFlipping
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public boolean isFullScreenRequired() {

    /**
     * @return whether page flipping is only available in full-screen mode.  If this
     * is <code>true</code>, full-screen exclusive mode is required for
     * page-flipping.
     * @see #isPageFlipping
     * @see GraphicsDevice#setFullScreenWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public FlipContents getFlipContents() {

    /**
     * @return the resulting contents of the back buffer after page-flipping.
     * This value is <code>null</code> when the <code>isPageFlipping</code>
     * returns <code>false</code>, implying blitting.  It can be one of
     * <code>FlipContents.UNDEFINED</code>
     * (the assumed default), <code>FlipContents.BACKGROUND</code>,
     * <code>FlipContents.PRIOR</code>, or
     * <code>FlipContents.COPIED</code>.
     * @see #isPageFlipping
     * @see FlipContents#UNDEFINED
     * @see FlipContents#BACKGROUND
     * @see FlipContents#PRIOR
     * @see FlipContents#COPIED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public boolean isPageFlipping() {

    /**
     * @return whether or not the buffer strategy uses page flipping; a set of
     * buffers that uses page flipping
     * can swap the contents internally between the front buffer and one or
     * more back buffers by switching the video pointer (or by copying memory
     * internally).  A non-flipping set of
     * buffers uses blitting to copy the contents from one buffer to
     * another; when this is the case, <code>getFlipContents</code> returns
     * <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public ImageCapabilities getBackBufferCapabilities() {

    /**
     * @return the image capabilities of all back buffers (intermediate buffers
     * are considered back buffers)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public ImageCapabilities getFrontBufferCapabilities() {

    /**
     * @return the image capabilities of the front (displayed) buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public BufferCapabilities(ImageCapabilities frontCaps,
        ImageCapabilities backCaps, FlipContents flipContents) {

    /**
     * Creates a new object for specifying buffering capabilities
     * @param frontCaps the capabilities of the front buffer; cannot be
     * <code>null</code>
     * @param backCaps the capabilities of the back and intermediate buffers;
     * cannot be <code>null</code>
     * @param flipContents the contents of the back buffer after page-flipping,
     * <code>null</code> if page flipping is not used (implies blitting)
     * @exception IllegalArgumentException if frontCaps or backCaps are
     * <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
public class BufferCapabilities implements Cloneable {

/**
 * Capabilities and properties of buffers.
 *
 * @see java.awt.image.BufferStrategy#getCapabilities()
 * @see GraphicsConfiguration#getBufferCapabilities
 * @author Michael Martak
 * @since 1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
        public static final FlipContents COPIED =

        /**
         * When flip contents are <code>COPIED</code>, the
         * contents of the back buffer are copied to the front buffer when
         * flipping.
         * @see #isPageFlipping
         * @see #getFlipContents
         * @see #UNDEFINED
         * @see #BACKGROUND
         * @see #PRIOR
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
        public static final FlipContents PRIOR =

        /**
         * When flip contents are <code>PRIOR</code>, the
         * contents of the back buffer are the prior contents of the front buffer
         * (a true page flip).
         * @see #isPageFlipping
         * @see #getFlipContents
         * @see #UNDEFINED
         * @see #BACKGROUND
         * @see #COPIED
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
        public static final FlipContents BACKGROUND =

        /**
         * When flip contents are <code>BACKGROUND</code>, the
         * contents of the back buffer are cleared with the background color after
         * flipping.
         * @see #isPageFlipping
         * @see #getFlipContents
         * @see #UNDEFINED
         * @see #PRIOR
         * @see #COPIED
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
        public static final FlipContents UNDEFINED =

        /**
         * When flip contents are <code>UNDEFINED</code>, the
         * contents of the back buffer are undefined after flipping.
         * @see #isPageFlipping
         * @see #getFlipContents
         * @see #BACKGROUND
         * @see #PRIOR
         * @see #COPIED
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public static final class FlipContents extends AttributeValue {

    /**
     * A type-safe enumeration of the possible back buffer contents after
     * page-flipping
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public Object clone() {

    /**
     * @return a copy of this BufferCapabilities object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public boolean isMultiBufferAvailable() {

    /**
     * @return whether or not
     * page flipping can be performed using more than two buffers (one or more
     * intermediate buffers as well as the front and back buffer).
     * @see #isPageFlipping
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public boolean isFullScreenRequired() {

    /**
     * @return whether page flipping is only available in full-screen mode.  If this
     * is <code>true</code>, full-screen exclusive mode is required for
     * page-flipping.
     * @see #isPageFlipping
     * @see GraphicsDevice#setFullScreenWindow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public FlipContents getFlipContents() {

    /**
     * @return the resulting contents of the back buffer after page-flipping.
     * This value is <code>null</code> when the <code>isPageFlipping</code>
     * returns <code>false</code>, implying blitting.  It can be one of
     * <code>FlipContents.UNDEFINED</code>
     * (the assumed default), <code>FlipContents.BACKGROUND</code>,
     * <code>FlipContents.PRIOR</code>, or
     * <code>FlipContents.COPIED</code>.
     * @see #isPageFlipping
     * @see FlipContents#UNDEFINED
     * @see FlipContents#BACKGROUND
     * @see FlipContents#PRIOR
     * @see FlipContents#COPIED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public boolean isPageFlipping() {

    /**
     * @return whether or not the buffer strategy uses page flipping; a set of
     * buffers that uses page flipping
     * can swap the contents internally between the front buffer and one or
     * more back buffers by switching the video pointer (or by copying memory
     * internally).  A non-flipping set of
     * buffers uses blitting to copy the contents from one buffer to
     * another; when this is the case, <code>getFlipContents</code> returns
     * <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public ImageCapabilities getBackBufferCapabilities() {

    /**
     * @return the image capabilities of all back buffers (intermediate buffers
     * are considered back buffers)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public ImageCapabilities getFrontBufferCapabilities() {

    /**
     * @return the image capabilities of the front (displayed) buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
    public BufferCapabilities(ImageCapabilities frontCaps,
        ImageCapabilities backCaps, FlipContents flipContents) {

    /**
     * Creates a new object for specifying buffering capabilities
     * @param frontCaps the capabilities of the front buffer; cannot be
     * <code>null</code>
     * @param backCaps the capabilities of the back and intermediate buffers;
     * cannot be <code>null</code>
     * @param flipContents the contents of the back buffer after page-flipping,
     * <code>null</code> if page flipping is not used (implies blitting)
     * @exception IllegalArgumentException if frontCaps or backCaps are
     * <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/BufferCapabilities.java
public class BufferCapabilities implements Cloneable {

/**
 * Capabilities and properties of buffers.
 *
 * @see java.awt.image.BufferStrategy#getCapabilities()
 * @see GraphicsConfiguration#getBufferCapabilities
 * @author Michael Martak
 * @since 1.4
 */
