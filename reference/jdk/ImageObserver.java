_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int ABORT = 128;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * an image which was being tracked asynchronously was aborted before
     * production was complete.  No more information will become available
     * without further action to trigger another image production sequence.
     * If the ERROR flag was not also set in this image update, then
     * accessing any of the data in the image will restart the production
     * again, probably from the beginning.
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int ERROR = 64;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * an image which was being tracked asynchronously has encountered
     * an error.  No further information will become available and
     * drawing the image will fail.
     * As a convenience, the ABORT flag will be indicated at the same
     * time to indicate that the image production was aborted.
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int ALLBITS = 32;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * a static image which was previously drawn is now complete and can
     * be drawn again in its final form.  The x, y, width, and height
     * arguments to the imageUpdate callback method should be ignored.
     * @see java.awt.Graphics#drawImage
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int FRAMEBITS = 16;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * another complete frame of a multi-frame image which was previously
     * drawn is now available to be drawn again.  The x, y, width, and height
     * arguments to the imageUpdate callback method should be ignored.
     * @see java.awt.Graphics#drawImage
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int SOMEBITS = 8;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * more pixels needed for drawing a scaled variation of the image
     * are available.  The bounding box of the new pixels can be taken
     * from the x, y, width, and height arguments to the imageUpdate
     * callback method.
     * @see java.awt.Graphics#drawImage
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int PROPERTIES = 4;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * the properties of the image are now available.
     * @see Image#getProperty
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int HEIGHT = 2;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * the height of the base image is now available and can be taken
     * from the height argument to the imageUpdate callback method.
     * @see Image#getHeight
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int WIDTH = 1;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * the width of the base image is now available and can be taken
     * from the width argument to the imageUpdate callback method.
     * @see Image#getWidth
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
public interface ImageObserver {

/**
 * An asynchronous update interface for receiving notifications about
 * Image information as the Image is constructed.
 *
 * @author      Jim Graham
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int ABORT = 128;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * an image which was being tracked asynchronously was aborted before
     * production was complete.  No more information will become available
     * without further action to trigger another image production sequence.
     * If the ERROR flag was not also set in this image update, then
     * accessing any of the data in the image will restart the production
     * again, probably from the beginning.
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int ERROR = 64;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * an image which was being tracked asynchronously has encountered
     * an error.  No further information will become available and
     * drawing the image will fail.
     * As a convenience, the ABORT flag will be indicated at the same
     * time to indicate that the image production was aborted.
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int ALLBITS = 32;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * a static image which was previously drawn is now complete and can
     * be drawn again in its final form.  The x, y, width, and height
     * arguments to the imageUpdate callback method should be ignored.
     * @see java.awt.Graphics#drawImage
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int FRAMEBITS = 16;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * another complete frame of a multi-frame image which was previously
     * drawn is now available to be drawn again.  The x, y, width, and height
     * arguments to the imageUpdate callback method should be ignored.
     * @see java.awt.Graphics#drawImage
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int SOMEBITS = 8;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * more pixels needed for drawing a scaled variation of the image
     * are available.  The bounding box of the new pixels can be taken
     * from the x, y, width, and height arguments to the imageUpdate
     * callback method.
     * @see java.awt.Graphics#drawImage
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int PROPERTIES = 4;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * the properties of the image are now available.
     * @see Image#getProperty
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int HEIGHT = 2;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * the height of the base image is now available and can be taken
     * from the height argument to the imageUpdate callback method.
     * @see Image#getHeight
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
    public static final int WIDTH = 1;

    /**
     * This flag in the infoflags argument to imageUpdate indicates that
     * the width of the base image is now available and can be taken
     * from the width argument to the imageUpdate callback method.
     * @see Image#getWidth
     * @see #imageUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/ImageObserver.java
public interface ImageObserver {

/**
 * An asynchronous update interface for receiving notifications about
 * Image information as the Image is constructed.
 *
 * @author      Jim Graham
 */
