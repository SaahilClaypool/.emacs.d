_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageCache.java
    private static class PixelCountSoftReference extends SoftReference<Image> {

    /** Extended SoftReference that stores the pixel count even after the image is lost */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageCache.java
    private int hash(GraphicsConfiguration config, int w, int h, Object ... args) {

    /** Create a unique hash from all the input */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageCache.java
    public boolean setImage(Image image, GraphicsConfiguration config, int w, int h, Object... args) {

    /**
     * Sets the cached image for the specified constraints.
     *
     * @param image  The image to store in cache
     * @param config The graphics configuration, needed if cached image is a Volatile Image. Used as part of cache key
     * @param w      The image width, used as part of cache key
     * @param h      The image height, used as part of cache key
     * @param args   Other arguments to use as part of the cache key
     * @return true if the image could be cached or false if the image is too big
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageCache.java
    public Image getImage(GraphicsConfiguration config, int w, int h, Object... args) {

    /**
     * Get the cached image for given keys
     *
     * @param config The graphics configuration, needed if cached image is a Volatile Image. Used as part of cache key
     * @param w      The image width, used as part of cache key
     * @param h      The image height, used as part of cache key
     * @param args   Other arguments to use as part of the cache key
     * @return Returns the cached Image, or null there is no cached image for key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageCache.java
    public boolean isImageCachable(int w, int h) {

    /**
     * Check if the image size is to big to be stored in the cache
     *
     * @param w The image width
     * @param h The image height
     * @return True if the image size is less than max
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageCache.java
    public void flush() {

    /** Clear the cache */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageCache.java
    static ImageCache getInstance() {

    /** Get static singleton instance */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageCache.java
class ImageCache {

/**
 * ImageCache - A fixed pixel count sized cache of Images keyed by arbitrary set of arguments. All images are held with
 * SoftReferences so they will be dropped by the GC if heap memory gets tight. When our size hits max pixel count least
 * recently requested images are removed first.
 *
 * @author Created by Jasper Potts (Aug 7, 2007)
 */
