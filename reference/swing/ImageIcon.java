_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public int getAccessibleIconWidth() {

        /**
         * Gets the width of the icon.
         *
         * @return the width of the icon
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public int getAccessibleIconHeight() {

        /**
         * Gets the height of the icon.
         *
         * @return the height of the icon
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public void setAccessibleIconDescription(String description) {

        /**
         * Sets the description of the icon.  This is meant to be a brief
         * textual description of the object.  For example, it might be
         * presented to a blind user to give an indication of the purpose
         * of the icon.
         *
         * @param description the description of the icon
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public String getAccessibleIconDescription() {

        /**
         * Gets the description of the icon.  This is meant to be a brief
         * textual description of the object.  For example, it might be
         * presented to a blind user to give an indication of the purpose
         * of the icon.
         *
         * @return the description of the icon
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public Locale getLocale() throws IllegalComponentStateException {

        /**
         * Returns the locale of this object.
         *
         * @return the locale of this object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth Accessible child of the object.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement Accessible, than this
         * method should return the number of children of this object.
         *
         * @return the number of accessible children in the object.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public int getAccessibleIndexInParent() {

        /**
         * Gets the index of this object in its accessible parent.
         *
         * @return the index of this object in its parent; -1 if this
         * object does not have an accessible parent.
         * @see #getAccessibleParent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public Accessible getAccessibleParent() {

        /**
         * Gets the Accessible parent of this object.  If the parent of this
         * object implements Accessible, this method should simply return
         * getParent().
         *
         * @return the Accessible parent of this object -- can be null if this
         * object does not have an Accessible parent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public AccessibleStateSet getAccessibleStateSet() {

        /**
         * Gets the state of this object.
         *
         * @return an instance of AccessibleStateSet containing the current
         * state set of the object
         * @see AccessibleState
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    protected class AccessibleImageIcon extends AccessibleContext

    /**
     * This class implements accessibility support for the
     * <code>ImageIcon</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to image icon user-interface
     * elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the AccessibleContext associated with this ImageIcon.
     * For image icons, the AccessibleContext takes the form of an
     * AccessibleImageIcon.
     * A new AccessibleImageIcon instance is created if necessary.
     *
     * @return an AccessibleImageIcon that serves as the
     *         AccessibleContext of this ImageIcon
     * @beaninfo
     *       expert: true
     *  description: The AccessibleContext associated with this ImageIcon.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    private AccessibleImageIcon accessibleContext = null;

    /**
     * --- Accessibility Support ---
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public String toString() {

    /**
     * Returns a string representation of this image.
     *
     * @return a string representing this image
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    @Transient

    /**
     * Returns the image observer for the image.
     *
     * @return the image observer, which may be null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public void setImageObserver(ImageObserver observer) {

    /**
     * Sets the image observer for the image.  Set this
     * property if the ImageIcon contains an animated GIF, so
     * the observer is notified to update its display.
     * For example:
     * <pre>
     *     icon = new ImageIcon(...)
     *     button.setIcon(icon);
     *     icon.setImageObserver(button);
     * </pre>
     *
     * @param observer the image observer
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public int getIconHeight() {

    /**
     * Gets the height of the icon.
     *
     * @return the height in pixels of this icon
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public int getIconWidth() {

    /**
     * Gets the width of the icon.
     *
     * @return the width in pixels of this icon
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public synchronized void paintIcon(Component c, Graphics g, int x, int y) {

    /**
     * Paints the icon.
     * The top-left corner of the icon is drawn at
     * the point (<code>x</code>, <code>y</code>)
     * in the coordinate space of the graphics context <code>g</code>.
     * If this icon has no image observer,
     * this method uses the <code>c</code> component
     * as the observer.
     *
     * @param c the component to be used as the observer
     *          if this icon has no image observer
     * @param g the graphics context
     * @param x the X coordinate of the icon's top-left corner
     * @param y the Y coordinate of the icon's top-left corner
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public void setDescription(String description) {

    /**
     * Sets the description of the image.  This is meant to be a brief
     * textual description of the object.  For example, it might be
     * presented to a blind user to give an indication of the purpose
     * of the image.
     * @param description a brief textual description of the image
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public String getDescription() {

    /**
     * Gets the description of the image.  This is meant to be a brief
     * textual description of the object.  For example, it might be
     * presented to a blind user to give an indication of the purpose
     * of the image.
     * The description may be null.
     *
     * @return a brief textual description of the image
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public void setImage(Image image) {

    /**
     * Sets the image displayed by this icon.
     * @param image the image
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    @Transient

    /**
     * Returns this icon's <code>Image</code>.
     * @return the <code>Image</code> object for this <code>ImageIcon</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public int getImageLoadStatus() {

    /**
     * Returns the status of the image loading operation.
     * @return the loading status as defined by java.awt.MediaTracker
     * @see java.awt.MediaTracker#ABORTED
     * @see java.awt.MediaTracker#ERRORED
     * @see java.awt.MediaTracker#COMPLETE
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    private MediaTracker getTracker() {

    /**
     * Returns the MediaTracker for the current AppContext, creating a new
     * MediaTracker if necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    private int getNextID() {

    /**
     * Returns an ID to use with the MediaTracker in loading an image.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    protected void loadImage(Image image) {

    /**
     * Loads the image, returning only when the image is loaded.
     * @param image the image
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public ImageIcon() {

    /**
     * Creates an uninitialized image icon.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public ImageIcon (byte[] imageData) {

    /**
     * Creates an ImageIcon from an array of bytes which were
     * read from an image file containing a supported image format,
     * such as GIF, JPEG, or (as of 1.3) PNG.
     * Normally this array is created
     * by reading an image using Class.getResourceAsStream(), but
     * the byte array may also be statically stored in a class.
     * If the resulting image has a "comment" property that is a string,
     * then the string is used as the description of this icon.
     *
     * @param  imageData an array of pixels in an image format supported by
     *             the AWT Toolkit, such as GIF, JPEG, or (as of 1.3) PNG
     * @see    java.awt.Toolkit#createImage
     * @see #getDescription
     * @see java.awt.Image#getProperty
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public ImageIcon (byte[] imageData, String description) {

    /**
     * Creates an ImageIcon from an array of bytes which were
     * read from an image file containing a supported image format,
     * such as GIF, JPEG, or (as of 1.3) PNG.
     * Normally this array is created
     * by reading an image using Class.getResourceAsStream(), but
     * the byte array may also be statically stored in a class.
     *
     * @param  imageData an array of pixels in an image format supported
     *         by the AWT Toolkit, such as GIF, JPEG, or (as of 1.3) PNG
     * @param  description a brief textual description of the image
     * @see    java.awt.Toolkit#createImage
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public ImageIcon (Image image) {

    /**
     * Creates an ImageIcon from an image object.
     * If the image has a "comment" property that is a string,
     * then the string is used as the description of this icon.
     * @param image the image
     * @see #getDescription
     * @see java.awt.Image#getProperty
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public ImageIcon(Image image, String description) {

    /**
     * Creates an ImageIcon from the image.
     * @param image the image
     * @param description a brief textual description of the image
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public ImageIcon (URL location) {

    /**
     * Creates an ImageIcon from the specified URL. The image will
     * be preloaded by using MediaTracker to monitor the loaded state
     * of the image.
     * The icon's description is initialized to be
     * a string representation of the URL.
     * @param location the URL for the image
     * @see #getDescription
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public ImageIcon(URL location, String description) {

    /**
     * Creates an ImageIcon from the specified URL. The image will
     * be preloaded by using MediaTracker to monitor the loaded state
     * of the image.
     * @param location the URL for the image
     * @param description a brief textual description of the image
     * @see #ImageIcon(String)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    @ConstructorProperties({"description"})

    /**
     * Creates an ImageIcon from the specified file. The image will
     * be preloaded by using MediaTracker to monitor the loading state
     * of the image. The specified String can be a file name or a
     * file path. When specifying a path, use the Internet-standard
     * forward-slash ("/") as a separator.
     * (The string is converted to an URL, so the forward-slash works
     * on all systems.)
     * For example, specify:
     * <pre>
     *    new ImageIcon("images/myImage.gif") </pre>
     * The description is initialized to the <code>filename</code> string.
     *
     * @param filename a String specifying a filename or path
     * @see #getDescription
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    public ImageIcon(String filename, String description) {

    /**
     * Creates an ImageIcon from the specified file. The image will
     * be preloaded by using MediaTracker to monitor the loading state
     * of the image.
     * @param filename the name of the file containing the image
     * @param description a brief textual description of the image
     * @see #ImageIcon(String)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    private static int mediaTrackerID;

    /**
     * Id used in loading images from MediaTracker.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    @Deprecated

    /**
     * Do not use this shared media tracker, which is used to load images.
     * It is left for backward compatibility only.
     * @deprecated since 1.8
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
    @Deprecated

    /**
     * Do not use this shared component, which is used to track image loading.
     * It is left for backward compatibility only.
     * @deprecated since 1.8
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ImageIcon.java
public class ImageIcon implements Icon, Serializable, Accessible {

/**
 * An implementation of the Icon interface that paints Icons
 * from Images. Images that are created from a URL, filename or byte array
 * are preloaded using MediaTracker to monitor the loaded state
 * of the image.
 *
 * <p>
 * For further information and examples of using image icons, see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html">How to Use Icons</a>
 * in <em>The Java Tutorial.</em>
 *
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Jeff Dinkins
 * @author Lynn Monsanto
 */
