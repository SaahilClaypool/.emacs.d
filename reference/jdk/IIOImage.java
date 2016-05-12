_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public void setMetadata(IIOMetadata metadata) {

    /**
     * Sets the <code>IIOMetadata</code> to a new object, or
     * <code>null</code>.
     *
     * @param metadata an <code>IIOMetadata</code> object, or
     * <code>null</code>.
     *
     * @see #getMetadata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public IIOMetadata getMetadata() {

    /**
     * Returns a reference to the current <code>IIOMetadata</code>
     * object, or <code>null</code> is none is set.
     *
     * @return an <code>IIOMetadata</code> object, or <code>null</code>.
     *
     * @see #setMetadata
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public void setThumbnails(List<? extends BufferedImage> thumbnails) {

    /**
     * Sets the list of thumbnails to a new <code>List</code> of
     * <code>BufferedImage</code>s, or to <code>null</code>.  The
     * reference to the previous <code>List</code> is discarded.
     *
     * <p> The <code>thumbnails</code> argument must either be
     * <code>null</code> or contain only <code>BufferedImage</code>
     * objects.
     *
     * @param thumbnails a <code>List</code> of
     * <code>BufferedImage</code> thumbnails, or <code>null</code>.
     *
     * @see #getThumbnail(int)
     * @see #getThumbnails
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public List<? extends BufferedImage> getThumbnails() {

    /**
     * Returns the current <code>List</code> of thumbnail
     * <code>BufferedImage</code>s, or <code>null</code> if none is
     * set.  A live reference is returned.
     *
     * @return the current <code>List</code> of
     * <code>BufferedImage</code> thumbnails, or <code>null</code>.
     *
     * @see #getThumbnail(int)
     * @see #setThumbnails
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public BufferedImage getThumbnail(int index) {

    /**
     * Returns a thumbnail associated with the main image.
     *
     * @param index the index of the desired thumbnail image.
     *
     * @return a thumbnail image, as a <code>BufferedImage</code>.
     *
     * @exception IndexOutOfBoundsException if the supplied index is
     * negative or larger than the largest valid index.
     * @exception ClassCastException if a
     * non-<code>BufferedImage</code> object is encountered in the
     * list of thumbnails at the given index.
     *
     * @see #getThumbnails
     * @see #setThumbnails
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public int getNumThumbnails() {

    /**
     * Returns the number of thumbnails stored in this
     * <code>IIOImage</code>.
     *
     * @return the number of thumbnails, as an <code>int</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public void setRaster(Raster raster) {

    /**
     * Sets the current <code>Raster</code>.  The value is
     * stored by reference.  Any existing <code>RenderedImage</code> is
     * discarded.
     *
     * @param raster a <code>Raster</code>.
     *
     * @exception IllegalArgumentException if <code>raster</code> is
     * <code>null</code>.
     *
     * @see #getRaster
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public Raster getRaster() {

    /**
     * Returns the currently set <code>Raster</code>, or
     * <code>null</code> if only a <code>RenderedImage</code> is
     * available.
     *
     * @return a <code>Raster</code>, or <code>null</code>.
     *
     * @see #setRaster
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public boolean hasRaster() {

    /**
     * Returns <code>true</code> if this <code>IIOImage</code> stores
     * a <code>Raster</code> rather than a <code>RenderedImage</code>.
     *
     * @return <code>true</code> if a <code>Raster</code> is
     * available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public void setRenderedImage(RenderedImage image) {

    /**
     * Sets the current <code>RenderedImage</code>.  The value is
     * stored by reference.  Any existing <code>Raster</code> is
     * discarded.
     *
     * @param image a <code>RenderedImage</code>.
     *
     * @exception IllegalArgumentException if <code>image</code> is
     * <code>null</code>.
     *
     * @see #getRenderedImage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public RenderedImage getRenderedImage() {

    /**
     * Returns the currently set <code>RenderedImage</code>, or
     * <code>null</code> if only a <code>Raster</code> is available.
     *
     * @return a <code>RenderedImage</code>, or <code>null</code>.
     *
     * @see #setRenderedImage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public IIOImage(Raster raster,
                    List<? extends BufferedImage> thumbnails,
                    IIOMetadata metadata) {

    /**
     * Constructs an <code>IIOImage</code> containing a
     * <code>Raster</code>, and thumbnails and metadata
     * associated with it.
     *
     * <p> All parameters are stored by reference.
     *
     * @param raster a <code>Raster</code>.
     * @param thumbnails a <code>List</code> of <code>BufferedImage</code>s,
     * or <code>null</code>.
     * @param metadata an <code>IIOMetadata</code> object, or
     * <code>null</code>.
     *
     * @exception IllegalArgumentException if <code>raster</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    public IIOImage(RenderedImage image,
                    List<? extends BufferedImage> thumbnails,
                    IIOMetadata metadata) {

    /**
     * Constructs an <code>IIOImage</code> containing a
     * <code>RenderedImage</code>, and thumbnails and metadata
     * associated with it.
     *
     * <p> All parameters are stored by reference.
     *
     * <p> The <code>thumbnails</code> argument must either be
     * <code>null</code> or contain only <code>BufferedImage</code>
     * objects.
     *
     * @param image a <code>RenderedImage</code>.
     * @param thumbnails a <code>List</code> of <code>BufferedImage</code>s,
     * or <code>null</code>.
     * @param metadata an <code>IIOMetadata</code> object, or
     * <code>null</code>.
     *
     * @exception IllegalArgumentException if <code>image</code> is
     * <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    protected IIOMetadata metadata;

    /**
     * An <code>IIOMetadata</code> object containing metadata
     * associated with the image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    protected List<? extends BufferedImage> thumbnails = null;

    /**
     * A <code>List</code> of <code>BufferedImage</code> thumbnails,
     * or <code>null</code>.  Non-<code>BufferedImage</code> objects
     * must not be stored in this <code>List</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    protected Raster raster;

    /**
     * The <code>Raster</code> being referenced.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
    protected RenderedImage image;

    /**
     * The <code>RenderedImage</code> being referenced.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/IIOImage.java
public class IIOImage {

/**
 * A simple container class to aggregate an image, a set of
 * thumbnail (preview) images, and an object representing metadata
 * associated with the image.
 *
 * <p> The image data may take the form of either a
 * <code>RenderedImage</code>, or a <code>Raster</code>.  Reader
 * methods that return an <code>IIOImage</code> will always return a
 * <code>BufferedImage</code> using the <code>RenderedImage</code>
 * reference.  Writer methods that accept an <code>IIOImage</code>
 * will always accept a <code>RenderedImage</code>, and may optionally
 * accept a <code>Raster</code>.
 *
 * <p> Exactly one of <code>getRenderedImage</code> and
 * <code>getRaster</code> will return a non-<code>null</code> value.
 * Subclasses are responsible for ensuring this behavior.
 *
 * @see ImageReader#readAll(int, ImageReadParam)
 * @see ImageReader#readAll(java.util.Iterator)
 * @see ImageWriter#write(javax.imageio.metadata.IIOMetadata,
 *                        IIOImage, ImageWriteParam)
 * @see ImageWriter#write(IIOImage)
 * @see ImageWriter#writeToSequence(IIOImage, ImageWriteParam)
 * @see ImageWriter#writeInsert(int, IIOImage, ImageWriteParam)
 *
 */
