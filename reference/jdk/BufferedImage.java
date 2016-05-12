_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTransparency() {

    /**
     * Returns the transparency.  Returns either OPAQUE, BITMASK,
     * or TRANSLUCENT.
     * @return the transparency of this <code>BufferedImage</code>.
     * @see Transparency#OPAQUE
     * @see Transparency#BITMASK
     * @see Transparency#TRANSLUCENT
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void releaseWritableTile (int tileX, int tileY) {

  /**
   * Relinquishes permission to write to a tile.  If the caller
   * continues to write to the tile, the results are undefined.
   * Calls to this method should only appear in matching pairs
   * with calls to {@link #getWritableTile(int, int) getWritableTile(int, int)}.  Any other leads
   * to undefined results.  All registered <code>TileObservers</code>
   * are notified when a tile goes from having one writer to having no
   * writers.
   * @param tileX the x index of the tile
   * @param tileY the y index of the tile
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public WritableRaster getWritableTile (int tileX, int tileY) {

  /**
   * Checks out a tile for writing.  All registered
   * <code>TileObservers</code> are notified when a tile goes from having
   * no writers to having one writer.
   * @param tileX the x index of the tile
   * @param tileY the y index of the tile
   * @return a <code>WritableRaster</code> that is the tile, indicated by
   *            the specified indices, to be checked out for writing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public boolean hasTileWriters () {

    /**
     * Returns whether or not any tile is checked out for writing.
     * Semantically equivalent to
     * <pre>
     * (getWritableTileIndices() != null).
     * </pre>
     * @return <code>true</code> if any tile is checked out for writing;
     *          <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Point[] getWritableTileIndices() {

    /**
     * Returns an array of {@link Point} objects indicating which tiles
     * are checked out for writing.  Returns <code>null</code> if none are
     * checked out.
     * @return a <code>Point</code> array that indicates the tiles that
     *          are checked out for writing, or <code>null</code> if no
     *          tiles are checked out for writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public boolean isTileWritable (int tileX, int tileY) {

    /**
     * Returns whether or not a tile is currently checked out for writing.
     * @param tileX the x index of the tile.
     * @param tileY the y index of the tile.
     * @return <code>true</code> if the tile specified by the specified
     *          indices is checked out for writing; <code>false</code>
     *          otherwise.
     * @exception ArrayIndexOutOfBoundsException if both
     *          <code>tileX</code> and <code>tileY</code> are not equal
     *          to 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void removeTileObserver (TileObserver to) {

  /**
   * Removes a tile observer.  If the observer was not registered,
   * nothing happens.  If the observer was registered for multiple
   * notifications, it is now registered for one fewer notification.
   * @param to the specified <code>TileObserver</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void addTileObserver (TileObserver to) {

  /**
   * Adds a tile observer.  If the observer is already present,
   * it receives multiple notifications.
   * @param to the specified {@link TileObserver}
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void setData(Raster r) {

  /**
     * Sets a rectangular region of the image to the contents of the
     * specified <code>Raster</code> <code>r</code>, which is
     * assumed to be in the same coordinate space as the
     * <code>BufferedImage</code>. The operation is clipped to the bounds
     * of the <code>BufferedImage</code>.
     * @param r the specified <code>Raster</code>
     * @see #getData
     * @see #getData(Rectangle)
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public WritableRaster copyData(WritableRaster outRaster) {

    /**
     * Computes an arbitrary rectangular region of the
     * <code>BufferedImage</code> and copies it into a specified
     * <code>WritableRaster</code>.  The region to be computed is
     * determined from the bounds of the specified
     * <code>WritableRaster</code>.  The specified
     * <code>WritableRaster</code> must have a
     * <code>SampleModel</code> that is compatible with this image.  If
     * <code>outRaster</code> is <code>null</code>,
     * an appropriate <code>WritableRaster</code> is created.
     * @param outRaster a <code>WritableRaster</code> to hold the returned
     *          part of the image, or <code>null</code>
     * @return a reference to the supplied or created
     *          <code>WritableRaster</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Raster getData(Rectangle rect) {

    /**
     * Computes and returns an arbitrary region of the
     * <code>BufferedImage</code>.  The <code>Raster</code> returned is a
     * copy of the image data and is not updated if the image is
     * changed.
     * @param rect the region of the <code>BufferedImage</code> to be
     * returned.
     * @return a <code>Raster</code> that is a copy of the image data of
     *          the specified region of the <code>BufferedImage</code>
     * @see #setData(Raster)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Raster getData() {

    /**
     * Returns the image as one large tile.  The <code>Raster</code>
     * returned is a copy of the image data is not updated if the
     * image is changed.
     * @return a <code>Raster</code> that is a copy of the image data.
     * @see #setData(Raster)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Raster getTile(int tileX, int tileY) {

    /**
     * Returns tile (<code>tileX</code>,&nbsp;<code>tileY</code>).  Note
     * that <code>tileX</code> and <code>tileY</code> are indices
     * into the tile array, not pixel locations.  The <code>Raster</code>
     * that is returned is live, which means that it is updated if the
     * image is changed.
     * @param tileX the x index of the requested tile in the tile array
     * @param tileY the y index of the requested tile in the tile array
     * @return a <code>Raster</code> that is the tile defined by the
     *          arguments <code>tileX</code> and <code>tileY</code>.
     * @exception ArrayIndexOutOfBoundsException if both
     *          <code>tileX</code> and <code>tileY</code> are not
     *          equal to 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTileGridYOffset() {

    /**
     * Returns the y offset of the tile grid relative to the origin,
     * For example, the y coordinate of the location of tile
     * (0,&nbsp;0).  This is always zero.
     * @return the y offset of the tile grid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTileGridXOffset() {

    /**
     * Returns the x offset of the tile grid relative to the origin,
     * For example, the x coordinate of the location of tile
     * (0,&nbsp;0).  This is always zero.
     * @return the x offset of the tile grid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTileHeight() {

    /**
     * Returns the tile height in pixels.
     * @return the tile height in pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTileWidth() {

    /**
     * Returns the tile width in pixels.
     * @return the tile width in pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getMinTileY() {

    /**
     * Returns the minimum tile index in the y direction.
     * This is always zero.
     * @return the minimum tile index in the y direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getMinTileX() {

    /**
     * Returns the minimum tile index in the x direction.
     * This is always zero.
     * @return the minimum tile index in the x direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getNumYTiles() {

    /**
     * Returns the number of tiles in the y direction.
     * This is always one.
     * @return the number of tiles in the y direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getNumXTiles() {

    /**
     * Returns the number of tiles in the x direction.
     * This is always one.
     * @return the number of tiles in the x direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public SampleModel getSampleModel() {

    /**
     * Returns the <code>SampleModel</code> associated with this
     * <code>BufferedImage</code>.
     * @return the <code>SampleModel</code> of this
     *          <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getMinY() {

    /**
     * Returns the minimum y coordinate of this
     * <code>BufferedImage</code>.  This is always zero.
     * @return the minimum y coordinate of this
     *          <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getMinX() {

    /**
     * Returns the minimum x coordinate of this
     * <code>BufferedImage</code>.  This is always zero.
     * @return the minimum x coordinate of this
     *          <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public String[] getPropertyNames() {

    /**
     * Returns an array of names recognized by
     * {@link #getProperty(String) getProperty(String)}
     * or <code>null</code>, if no property names are recognized.
     * @return a <code>String</code> array containing all of the property
     *          names that <code>getProperty(String)</code> recognizes;
     *          or <code>null</code> if no property names are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Vector<RenderedImage> getSources() {

    /**
     * Returns a {@link Vector} of {@link RenderedImage} objects that are
     * the immediate sources, not the sources of these immediate sources,
     * of image data for this <code>BufferedImage</code>.  This
     * method returns <code>null</code> if the <code>BufferedImage</code>
     * has no information about its immediate sources.  It returns an
     * empty <code>Vector</code> if the <code>BufferedImage</code> has no
     * immediate sources.
     * @return a <code>Vector</code> containing immediate sources of
     *          this <code>BufferedImage</code> object's image date, or
     *          <code>null</code> if this <code>BufferedImage</code> has
     *          no information about its immediate sources, or an empty
     *          <code>Vector</code> if this <code>BufferedImage</code>
     *          has no immediate sources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public String toString() {

    /**
     * Returns a <code>String</code> representation of this
     * <code>BufferedImage</code> object and its values.
     * @return a <code>String</code> representing this
     *          <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void coerceData (boolean isAlphaPremultiplied) {

    /**
     * Forces the data to match the state specified in the
     * <code>isAlphaPremultiplied</code> variable.  It may multiply or
     * divide the color raster data by alpha, or do nothing if the data is
     * in the correct state.
     * @param isAlphaPremultiplied <code>true</code> if the alpha has been
     *          premultiplied; <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public boolean isAlphaPremultiplied() {

    /**
     * Returns whether or not the alpha has been premultiplied.  It
     * returns <code>false</code> if there is no alpha.
     * @return <code>true</code> if the alpha has been premultiplied;
     *          <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public BufferedImage getSubimage (int x, int y, int w, int h) {

    /**
     * Returns a subimage defined by a specified rectangular region.
     * The returned <code>BufferedImage</code> shares the same
     * data array as the original image.
     * @param x the X coordinate of the upper-left corner of the
     *          specified rectangular region
     * @param y the Y coordinate of the upper-left corner of the
     *          specified rectangular region
     * @param w the width of the specified rectangular region
     * @param h the height of the specified rectangular region
     * @return a <code>BufferedImage</code> that is the subimage of this
     *          <code>BufferedImage</code>.
     * @exception RasterFormatException if the specified
     * area is not contained within this <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Graphics2D createGraphics() {

    /**
     * Creates a <code>Graphics2D</code>, which can be used to draw into
     * this <code>BufferedImage</code>.
     * @return a <code>Graphics2D</code>, used for drawing into this
     *          image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public java.awt.Graphics getGraphics() {

    /**
     * This method returns a {@link Graphics2D}, but is here
     * for backwards compatibility.  {@link #createGraphics() createGraphics} is more
     * convenient, since it is declared to return a
     * <code>Graphics2D</code>.
     * @return a <code>Graphics2D</code>, which can be used to draw into
     *          this image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Object getProperty(String name) {

    /**
     * Returns a property of the image by name.
     * @param name the property name
     * @return an <code>Object</code> that is the property referred to by
     *          the specified <code>name</code>.
     * @throws NullPointerException if the property name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Object getProperty(String name, ImageObserver observer) {

    /**
     * Returns a property of the image by name.  Individual property names
     * are defined by the various image formats.  If a property is not
     * defined for a particular image, this method returns the
     * <code>UndefinedProperty</code> field.  If the properties
     * for this image are not yet known, then this method returns
     * <code>null</code> and the <code>ImageObserver</code> object is
     * notified later.  The property name "comment" should be used to
     * store an optional comment that can be presented to the user as a
     * description of the image, its source, or its author.
     * @param name the property name
     * @param observer the <code>ImageObserver</code> that receives
     *  notification regarding image information
     * @return an {@link Object} that is the property referred to by the
     *          specified <code>name</code> or <code>null</code> if the
     *          properties of this image are not yet known.
     * @throws NullPointerException if the property name is null.
     * @see ImageObserver
     * @see java.awt.Image#UndefinedProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public ImageProducer getSource() {

    /**
     * Returns the object that produces the pixels for the image.
     * @return the {@link ImageProducer} that is used to produce the
     * pixels for this image.
     * @see ImageProducer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getHeight(ImageObserver observer) {

    /**
     * Returns the height of the <code>BufferedImage</code>.
     * @param observer ignored
     * @return the height of this <code>BufferedImage</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getWidth(ImageObserver observer) {

    /**
     * Returns the width of the <code>BufferedImage</code>.
     * @param observer ignored
     * @return the width of this <code>BufferedImage</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getHeight() {

    /**
     * Returns the height of the <code>BufferedImage</code>.
     * @return the height of this <code>BufferedImage</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getWidth() {

    /**
     * Returns the width of the <code>BufferedImage</code>.
     * @return the width of this <code>BufferedImage</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void setRGB(int startX, int startY, int w, int h,
                        int[] rgbArray, int offset, int scansize) {

    /**
     * Sets an array of integer pixels in the default RGB color model
     * (TYPE_INT_ARGB) and default sRGB color space,
     * into a portion of the image data.  Color conversion takes place
     * if the default model does not match the image
     * <code>ColorModel</code>.  There are only 8-bits of precision for
     * each color component in the returned data when
     * using this method.  With a specified coordinate (x,&nbsp;y) in the
     * this image, the ARGB pixel can be accessed in this way:
     * <pre>
     *    pixel   = rgbArray[offset + (y-startY)*scansize + (x-startX)];
     * </pre>
     * WARNING: No dithering takes place.
     *
     * <p>
     *
     * An <code>ArrayOutOfBoundsException</code> may be thrown
     * if the region is not in bounds.
     * However, explicit bounds checking is not guaranteed.
     *
     * @param startX      the starting X coordinate
     * @param startY      the starting Y coordinate
     * @param w           width of the region
     * @param h           height of the region
     * @param rgbArray    the rgb pixels
     * @param offset      offset into the <code>rgbArray</code>
     * @param scansize    scanline stride for the <code>rgbArray</code>
     * @see #getRGB(int, int)
     * @see #getRGB(int, int, int, int, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public synchronized void setRGB(int x, int y, int rgb) {

    /**
     * Sets a pixel in this <code>BufferedImage</code> to the specified
     * RGB value. The pixel is assumed to be in the default RGB color
     * model, TYPE_INT_ARGB, and default sRGB color space.  For images
     * with an <code>IndexColorModel</code>, the index with the nearest
     * color is chosen.
     *
     * <p>
     *
     * An <code>ArrayOutOfBoundsException</code> may be thrown
     * if the coordinates are not in bounds.
     * However, explicit bounds checking is not guaranteed.
     *
     * @param x the X coordinate of the pixel to set
     * @param y the Y coordinate of the pixel to set
     * @param rgb the RGB value
     * @see #getRGB(int, int)
     * @see #getRGB(int, int, int, int, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int[] getRGB(int startX, int startY, int w, int h,
                        int[] rgbArray, int offset, int scansize) {

    /**
     * Returns an array of integer pixels in the default RGB color model
     * (TYPE_INT_ARGB) and default sRGB color space,
     * from a portion of the image data.  Color conversion takes
     * place if the default model does not match the image
     * <code>ColorModel</code>.  There are only 8-bits of precision for
     * each color component in the returned data when
     * using this method.  With a specified coordinate (x,&nbsp;y) in the
     * image, the ARGB pixel can be accessed in this way:
     *
     * <pre>
     *    pixel   = rgbArray[offset + (y-startY)*scansize + (x-startX)]; </pre>
     *
     * <p>
     *
     * An <code>ArrayOutOfBoundsException</code> may be thrown
     * if the region is not in bounds.
     * However, explicit bounds checking is not guaranteed.
     *
     * @param startX      the starting X coordinate
     * @param startY      the starting Y coordinate
     * @param w           width of region
     * @param h           height of region
     * @param rgbArray    if not <code>null</code>, the rgb pixels are
     *          written here
     * @param offset      offset into the <code>rgbArray</code>
     * @param scansize    scanline stride for the <code>rgbArray</code>
     * @return            array of RGB pixels.
     * @see #setRGB(int, int, int)
     * @see #setRGB(int, int, int, int, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getRGB(int x, int y) {

    /**
     * Returns an integer pixel in the default RGB color model
     * (TYPE_INT_ARGB) and default sRGB colorspace.  Color
     * conversion takes place if this default model does not match
     * the image <code>ColorModel</code>.  There are only 8-bits of
     * precision for each color component in the returned data when using
     * this method.
     *
     * <p>
     *
     * An <code>ArrayOutOfBoundsException</code> may be thrown
     * if the coordinates are not in bounds.
     * However, explicit bounds checking is not guaranteed.
     *
     * @param x the X coordinate of the pixel from which to get
     *          the pixel in the default RGB color model and sRGB
     *          color space
     * @param y the Y coordinate of the pixel from which to get
     *          the pixel in the default RGB color model and sRGB
     *          color space
     * @return an integer pixel in the default RGB color model and
     *          default sRGB colorspace.
     * @see #setRGB(int, int, int)
     * @see #setRGB(int, int, int, int, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public WritableRaster getAlphaRaster() {

    /**
     * Returns a <code>WritableRaster</code> representing the alpha
     * channel for <code>BufferedImage</code> objects
     * with <code>ColorModel</code> objects that support a separate
     * spatial alpha channel, such as <code>ComponentColorModel</code> and
     * <code>DirectColorModel</code>.  Returns <code>null</code> if there
     * is no alpha channel associated with the <code>ColorModel</code> in
     * this image.  This method assumes that for all
     * <code>ColorModel</code> objects other than
     * <code>IndexColorModel</code>, if the <code>ColorModel</code>
     * supports alpha, there is a separate alpha channel
     * which is stored as the last band of image data.
     * If the image uses an <code>IndexColorModel</code> that
     * has alpha in the lookup table, this method returns
     * <code>null</code> since there is no spatially discrete alpha
     * channel.  This method creates a new
     * <code>WritableRaster</code>, but shares the data array.
     * @return a <code>WritableRaster</code> or <code>null</code> if this
     *          <code>BufferedImage</code> has no alpha channel associated
     *          with its <code>ColorModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public WritableRaster getRaster() {

    /**
     * Returns the {@link WritableRaster}.
     * @return the <code>WriteableRaster</code> of this
     *  <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public ColorModel getColorModel() {

    /**
     * Returns the <code>ColorModel</code>.
     * @return the <code>ColorModel</code> of this
     *  <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getType() {

    /**
     * Returns the image type.  If it is not one of the known types,
     * TYPE_CUSTOM is returned.
     * @return the image type of this <code>BufferedImage</code>.
     * @see #TYPE_INT_RGB
     * @see #TYPE_INT_ARGB
     * @see #TYPE_INT_ARGB_PRE
     * @see #TYPE_INT_BGR
     * @see #TYPE_3BYTE_BGR
     * @see #TYPE_4BYTE_ABGR
     * @see #TYPE_4BYTE_ABGR_PRE
     * @see #TYPE_BYTE_GRAY
     * @see #TYPE_BYTE_BINARY
     * @see #TYPE_BYTE_INDEXED
     * @see #TYPE_USHORT_GRAY
     * @see #TYPE_USHORT_565_RGB
     * @see #TYPE_USHORT_555_RGB
     * @see #TYPE_CUSTOM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
/*

    /**
     * Constructs a new <code>BufferedImage</code> with a specified
     * <code>ColorModel</code> and <code>Raster</code>.  If the number and
     * types of bands in the <code>SampleModel</code> of the
     * <code>Raster</code> do not match the number and types required by
     * the <code>ColorModel</code> to represent its color and alpha
     * components, a {@link RasterFormatException} is thrown.  This
     * method can multiply or divide the color <code>Raster</code> data by
     * alpha to match the <code>alphaPremultiplied</code> state
     * in the <code>ColorModel</code>.  Properties for this
     * <code>BufferedImage</code> can be established by passing
     * in a {@link Hashtable} of <code>String</code>/<code>Object</code>
     * pairs.
     * @param cm <code>ColorModel</code> for the new image
     * @param raster     <code>Raster</code> for the image data
     * @param isRasterPremultiplied   if <code>true</code>, the data in
     *                  the raster has been premultiplied with alpha.
     * @param properties <code>Hashtable</code> of
     *                  <code>String</code>/<code>Object</code> pairs.
     * @exception RasterFormatException if the number and
     * types of bands in the <code>SampleModel</code> of the
     * <code>Raster</code> do not match the number and types required by
     * the <code>ColorModel</code> to represent its color and alpha
     * components.
     * @exception IllegalArgumentException if
     *          <code>raster</code> is incompatible with <code>cm</code>
     * @see ColorModel
     * @see Raster
     * @see WritableRaster
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public BufferedImage (int width,
                          int height,
                          int imageType,
                          IndexColorModel cm) {

    /**
     * Constructs a <code>BufferedImage</code> of one of the predefined
     * image types:
     * TYPE_BYTE_BINARY or TYPE_BYTE_INDEXED.
     *
     * <p> If the image type is TYPE_BYTE_BINARY, the number of
     * entries in the color model is used to determine whether the
     * image should have 1, 2, or 4 bits per pixel.  If the color model
     * has 1 or 2 entries, the image will have 1 bit per pixel.  If it
     * has 3 or 4 entries, the image with have 2 bits per pixel.  If
     * it has between 5 and 16 entries, the image will have 4 bits per
     * pixel.  Otherwise, an IllegalArgumentException will be thrown.
     *
     * @param width     width of the created image
     * @param height    height of the created image
     * @param imageType type of the created image
     * @param cm        <code>IndexColorModel</code> of the created image
     * @throws IllegalArgumentException   if the imageType is not
     * TYPE_BYTE_BINARY or TYPE_BYTE_INDEXED or if the imageType is
     * TYPE_BYTE_BINARY and the color map has more than 16 entries.
     * @see #TYPE_BYTE_BINARY
     * @see #TYPE_BYTE_INDEXED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public BufferedImage(int width,
                         int height,
                         int imageType) {

    /**
     * Constructs a <code>BufferedImage</code> of one of the predefined
     * image types.  The <code>ColorSpace</code> for the image is the
     * default sRGB space.
     * @param width     width of the created image
     * @param height    height of the created image
     * @param imageType type of the created image
     * @see ColorSpace
     * @see #TYPE_INT_RGB
     * @see #TYPE_INT_ARGB
     * @see #TYPE_INT_ARGB_PRE
     * @see #TYPE_INT_BGR
     * @see #TYPE_3BYTE_BGR
     * @see #TYPE_4BYTE_ABGR
     * @see #TYPE_4BYTE_ABGR_PRE
     * @see #TYPE_BYTE_GRAY
     * @see #TYPE_USHORT_GRAY
     * @see #TYPE_BYTE_BINARY
     * @see #TYPE_BYTE_INDEXED
     * @see #TYPE_USHORT_565_RGB
     * @see #TYPE_USHORT_555_RGB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_BYTE_INDEXED = 13;

    /**
     * Represents an indexed byte image.  When this type is used as the
     * <code>imageType</code> argument to the <code>BufferedImage</code>
     * constructor that takes an <code>imageType</code> argument
     * but no <code>ColorModel</code> argument, an
     * <code>IndexColorModel</code> is created with
     * a 256-color 6/6/6 color cube palette with the rest of the colors
     * from 216-255 populated by grayscale values in the
     * default sRGB ColorSpace.
     *
     * <p> When color data is stored in an image of this type,
     * the closest color in the colormap is determined
     * by the <code>IndexColorModel</code> and the resulting index is stored.
     * Approximation and loss of alpha or color components
     * can result, depending on the colors in the
     * <code>IndexColorModel</code> colormap.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_BYTE_BINARY = 12;

    /**
     * Represents an opaque byte-packed 1, 2, or 4 bit image.  The
     * image has an {@link IndexColorModel} without alpha.  When this
     * type is used as the <code>imageType</code> argument to the
     * <code>BufferedImage</code> constructor that takes an
     * <code>imageType</code> argument but no <code>ColorModel</code>
     * argument, a 1-bit image is created with an
     * <code>IndexColorModel</code> with two colors in the default
     * sRGB <code>ColorSpace</code>: {0,&nbsp;0,&nbsp;0} and
     * {255,&nbsp;255,&nbsp;255}.
     *
     * <p> Images with 2 or 4 bits per pixel may be constructed via
     * the <code>BufferedImage</code> constructor that takes a
     * <code>ColorModel</code> argument by supplying a
     * <code>ColorModel</code> with an appropriate map size.
     *
     * <p> Images with 8 bits per pixel should use the image types
     * <code>TYPE_BYTE_INDEXED</code> or <code>TYPE_BYTE_GRAY</code>
     * depending on their <code>ColorModel</code>.

     * <p> When color data is stored in an image of this type,
     * the closest color in the colormap is determined
     * by the <code>IndexColorModel</code> and the resulting index is stored.
     * Approximation and loss of alpha or color components
     * can result, depending on the colors in the
     * <code>IndexColorModel</code> colormap.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_USHORT_GRAY = 11;

    /**
     * Represents an unsigned short grayscale image, non-indexed).  This
     * image has a <code>ComponentColorModel</code> with a CS_GRAY
     * <code>ColorSpace</code>.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_BYTE_GRAY = 10;

    /**
     * Represents a unsigned byte grayscale image, non-indexed.  This
     * image has a <code>ComponentColorModel</code> with a CS_GRAY
     * {@link ColorSpace}.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_USHORT_555_RGB = 9;

    /**
     * Represents an image with 5-5-5 RGB color components (5-bits red,
     * 5-bits green, 5-bits blue) with no alpha.  This image has
     * a <code>DirectColorModel</code>.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_USHORT_565_RGB = 8;

    /**
     * Represents an image with 5-6-5 RGB color components (5-bits red,
     * 6-bits green, 5-bits blue) with no alpha.  This image has
     * a <code>DirectColorModel</code>.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_4BYTE_ABGR_PRE = 7;

    /**
     * Represents an image with 8-bit RGBA color components with the colors
     * Blue, Green, and Red stored in 3 bytes and 1 byte of alpha.  The
     * image has a <code>ComponentColorModel</code> with alpha. The color
     * data in this image is considered to be premultiplied with alpha.
     * The byte data is interleaved in a single byte array in the order
     * A, B, G, R from lower to higher byte addresses within each pixel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_4BYTE_ABGR = 6;

    /**
     * Represents an image with 8-bit RGBA color components with the colors
     * Blue, Green, and Red stored in 3 bytes and 1 byte of alpha.  The
     * image has a <code>ComponentColorModel</code> with alpha.  The
     * color data in this image is considered not to be premultiplied with
     * alpha.  The byte data is interleaved in a single
     * byte array in the order A, B, G, R
     * from lower to higher byte addresses within each pixel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_3BYTE_BGR = 5;

    /**
     * Represents an image with 8-bit RGB color components, corresponding
     * to a Windows-style BGR color model) with the colors Blue, Green,
     * and Red stored in 3 bytes.  There is no alpha.  The image has a
     * <code>ComponentColorModel</code>.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_INT_BGR = 4;

    /**
     * Represents an image with 8-bit RGB color components, corresponding
     * to a Windows- or Solaris- style BGR color model, with the colors
     * Blue, Green, and Red packed into integer pixels.  There is no alpha.
     * The image has a {@link DirectColorModel}.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_INT_ARGB_PRE = 3;

    /**
     * Represents an image with 8-bit RGBA color components packed into
     * integer pixels.  The image has a <code>DirectColorModel</code>
     * with alpha.  The color data in this image is considered to be
     * premultiplied with alpha.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_INT_ARGB = 2;

    /**
     * Represents an image with 8-bit RGBA color components packed into
     * integer pixels.  The image has a <code>DirectColorModel</code>
     * with alpha. The color data in this image is considered not to be
     * premultiplied with alpha.  When this type is used as the
     * <code>imageType</code> argument to a <code>BufferedImage</code>
     * constructor, the created image is consistent with images
     * created in the JDK1.1 and earlier releases.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_INT_RGB = 1;

    /**
     * Represents an image with 8-bit RGB color components packed into
     * integer pixels.  The image has a {@link DirectColorModel} without
     * alpha.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    /**

    /**
     * Image Type Constants
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
public class BufferedImage extends java.awt.Image

/**
 *
 * The <code>BufferedImage</code> subclass describes an {@link
 * java.awt.Image Image} with an accessible buffer of image data.
 * A <code>BufferedImage</code> is comprised of a {@link ColorModel} and a
 * {@link Raster} of image data.
 * The number and types of bands in the {@link SampleModel} of the
 * <code>Raster</code> must match the number and types required by the
 * <code>ColorModel</code> to represent its color and alpha components.
 * All <code>BufferedImage</code> objects have an upper left corner
 * coordinate of (0,&nbsp;0).  Any <code>Raster</code> used to construct a
 * <code>BufferedImage</code> must therefore have minX=0 and minY=0.
 *
 * <p>
 * This class relies on the data fetching and setting methods
 * of <code>Raster</code>,
 * and on the color characterization methods of <code>ColorModel</code>.
 *
 * @see ColorModel
 * @see Raster
 * @see WritableRaster
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTransparency() {

    /**
     * Returns the transparency.  Returns either OPAQUE, BITMASK,
     * or TRANSLUCENT.
     * @return the transparency of this <code>BufferedImage</code>.
     * @see Transparency#OPAQUE
     * @see Transparency#BITMASK
     * @see Transparency#TRANSLUCENT
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void releaseWritableTile (int tileX, int tileY) {

  /**
   * Relinquishes permission to write to a tile.  If the caller
   * continues to write to the tile, the results are undefined.
   * Calls to this method should only appear in matching pairs
   * with calls to {@link #getWritableTile(int, int) getWritableTile(int, int)}.  Any other leads
   * to undefined results.  All registered <code>TileObservers</code>
   * are notified when a tile goes from having one writer to having no
   * writers.
   * @param tileX the x index of the tile
   * @param tileY the y index of the tile
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public WritableRaster getWritableTile (int tileX, int tileY) {

  /**
   * Checks out a tile for writing.  All registered
   * <code>TileObservers</code> are notified when a tile goes from having
   * no writers to having one writer.
   * @param tileX the x index of the tile
   * @param tileY the y index of the tile
   * @return a <code>WritableRaster</code> that is the tile, indicated by
   *            the specified indices, to be checked out for writing.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public boolean hasTileWriters () {

    /**
     * Returns whether or not any tile is checked out for writing.
     * Semantically equivalent to
     * <pre>
     * (getWritableTileIndices() != null).
     * </pre>
     * @return <code>true</code> if any tile is checked out for writing;
     *          <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Point[] getWritableTileIndices() {

    /**
     * Returns an array of {@link Point} objects indicating which tiles
     * are checked out for writing.  Returns <code>null</code> if none are
     * checked out.
     * @return a <code>Point</code> array that indicates the tiles that
     *          are checked out for writing, or <code>null</code> if no
     *          tiles are checked out for writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public boolean isTileWritable (int tileX, int tileY) {

    /**
     * Returns whether or not a tile is currently checked out for writing.
     * @param tileX the x index of the tile.
     * @param tileY the y index of the tile.
     * @return <code>true</code> if the tile specified by the specified
     *          indices is checked out for writing; <code>false</code>
     *          otherwise.
     * @exception ArrayIndexOutOfBoundsException if both
     *          <code>tileX</code> and <code>tileY</code> are not equal
     *          to 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void removeTileObserver (TileObserver to) {

  /**
   * Removes a tile observer.  If the observer was not registered,
   * nothing happens.  If the observer was registered for multiple
   * notifications, it is now registered for one fewer notification.
   * @param to the specified <code>TileObserver</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void addTileObserver (TileObserver to) {

  /**
   * Adds a tile observer.  If the observer is already present,
   * it receives multiple notifications.
   * @param to the specified {@link TileObserver}
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void setData(Raster r) {

  /**
     * Sets a rectangular region of the image to the contents of the
     * specified <code>Raster</code> <code>r</code>, which is
     * assumed to be in the same coordinate space as the
     * <code>BufferedImage</code>. The operation is clipped to the bounds
     * of the <code>BufferedImage</code>.
     * @param r the specified <code>Raster</code>
     * @see #getData
     * @see #getData(Rectangle)
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public WritableRaster copyData(WritableRaster outRaster) {

    /**
     * Computes an arbitrary rectangular region of the
     * <code>BufferedImage</code> and copies it into a specified
     * <code>WritableRaster</code>.  The region to be computed is
     * determined from the bounds of the specified
     * <code>WritableRaster</code>.  The specified
     * <code>WritableRaster</code> must have a
     * <code>SampleModel</code> that is compatible with this image.  If
     * <code>outRaster</code> is <code>null</code>,
     * an appropriate <code>WritableRaster</code> is created.
     * @param outRaster a <code>WritableRaster</code> to hold the returned
     *          part of the image, or <code>null</code>
     * @return a reference to the supplied or created
     *          <code>WritableRaster</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Raster getData(Rectangle rect) {

    /**
     * Computes and returns an arbitrary region of the
     * <code>BufferedImage</code>.  The <code>Raster</code> returned is a
     * copy of the image data and is not updated if the image is
     * changed.
     * @param rect the region of the <code>BufferedImage</code> to be
     * returned.
     * @return a <code>Raster</code> that is a copy of the image data of
     *          the specified region of the <code>BufferedImage</code>
     * @see #setData(Raster)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Raster getData() {

    /**
     * Returns the image as one large tile.  The <code>Raster</code>
     * returned is a copy of the image data is not updated if the
     * image is changed.
     * @return a <code>Raster</code> that is a copy of the image data.
     * @see #setData(Raster)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Raster getTile(int tileX, int tileY) {

    /**
     * Returns tile (<code>tileX</code>,&nbsp;<code>tileY</code>).  Note
     * that <code>tileX</code> and <code>tileY</code> are indices
     * into the tile array, not pixel locations.  The <code>Raster</code>
     * that is returned is live, which means that it is updated if the
     * image is changed.
     * @param tileX the x index of the requested tile in the tile array
     * @param tileY the y index of the requested tile in the tile array
     * @return a <code>Raster</code> that is the tile defined by the
     *          arguments <code>tileX</code> and <code>tileY</code>.
     * @exception ArrayIndexOutOfBoundsException if both
     *          <code>tileX</code> and <code>tileY</code> are not
     *          equal to 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTileGridYOffset() {

    /**
     * Returns the y offset of the tile grid relative to the origin,
     * For example, the y coordinate of the location of tile
     * (0,&nbsp;0).  This is always zero.
     * @return the y offset of the tile grid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTileGridXOffset() {

    /**
     * Returns the x offset of the tile grid relative to the origin,
     * For example, the x coordinate of the location of tile
     * (0,&nbsp;0).  This is always zero.
     * @return the x offset of the tile grid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTileHeight() {

    /**
     * Returns the tile height in pixels.
     * @return the tile height in pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getTileWidth() {

    /**
     * Returns the tile width in pixels.
     * @return the tile width in pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getMinTileY() {

    /**
     * Returns the minimum tile index in the y direction.
     * This is always zero.
     * @return the minimum tile index in the y direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getMinTileX() {

    /**
     * Returns the minimum tile index in the x direction.
     * This is always zero.
     * @return the minimum tile index in the x direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getNumYTiles() {

    /**
     * Returns the number of tiles in the y direction.
     * This is always one.
     * @return the number of tiles in the y direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getNumXTiles() {

    /**
     * Returns the number of tiles in the x direction.
     * This is always one.
     * @return the number of tiles in the x direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public SampleModel getSampleModel() {

    /**
     * Returns the <code>SampleModel</code> associated with this
     * <code>BufferedImage</code>.
     * @return the <code>SampleModel</code> of this
     *          <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getMinY() {

    /**
     * Returns the minimum y coordinate of this
     * <code>BufferedImage</code>.  This is always zero.
     * @return the minimum y coordinate of this
     *          <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getMinX() {

    /**
     * Returns the minimum x coordinate of this
     * <code>BufferedImage</code>.  This is always zero.
     * @return the minimum x coordinate of this
     *          <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public String[] getPropertyNames() {

    /**
     * Returns an array of names recognized by
     * {@link #getProperty(String) getProperty(String)}
     * or <code>null</code>, if no property names are recognized.
     * @return a <code>String</code> array containing all of the property
     *          names that <code>getProperty(String)</code> recognizes;
     *          or <code>null</code> if no property names are recognized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Vector<RenderedImage> getSources() {

    /**
     * Returns a {@link Vector} of {@link RenderedImage} objects that are
     * the immediate sources, not the sources of these immediate sources,
     * of image data for this <code>BufferedImage</code>.  This
     * method returns <code>null</code> if the <code>BufferedImage</code>
     * has no information about its immediate sources.  It returns an
     * empty <code>Vector</code> if the <code>BufferedImage</code> has no
     * immediate sources.
     * @return a <code>Vector</code> containing immediate sources of
     *          this <code>BufferedImage</code> object's image date, or
     *          <code>null</code> if this <code>BufferedImage</code> has
     *          no information about its immediate sources, or an empty
     *          <code>Vector</code> if this <code>BufferedImage</code>
     *          has no immediate sources.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public String toString() {

    /**
     * Returns a <code>String</code> representation of this
     * <code>BufferedImage</code> object and its values.
     * @return a <code>String</code> representing this
     *          <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void coerceData (boolean isAlphaPremultiplied) {

    /**
     * Forces the data to match the state specified in the
     * <code>isAlphaPremultiplied</code> variable.  It may multiply or
     * divide the color raster data by alpha, or do nothing if the data is
     * in the correct state.
     * @param isAlphaPremultiplied <code>true</code> if the alpha has been
     *          premultiplied; <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public boolean isAlphaPremultiplied() {

    /**
     * Returns whether or not the alpha has been premultiplied.  It
     * returns <code>false</code> if there is no alpha.
     * @return <code>true</code> if the alpha has been premultiplied;
     *          <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public BufferedImage getSubimage (int x, int y, int w, int h) {

    /**
     * Returns a subimage defined by a specified rectangular region.
     * The returned <code>BufferedImage</code> shares the same
     * data array as the original image.
     * @param x the X coordinate of the upper-left corner of the
     *          specified rectangular region
     * @param y the Y coordinate of the upper-left corner of the
     *          specified rectangular region
     * @param w the width of the specified rectangular region
     * @param h the height of the specified rectangular region
     * @return a <code>BufferedImage</code> that is the subimage of this
     *          <code>BufferedImage</code>.
     * @exception RasterFormatException if the specified
     * area is not contained within this <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Graphics2D createGraphics() {

    /**
     * Creates a <code>Graphics2D</code>, which can be used to draw into
     * this <code>BufferedImage</code>.
     * @return a <code>Graphics2D</code>, used for drawing into this
     *          image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public java.awt.Graphics getGraphics() {

    /**
     * This method returns a {@link Graphics2D}, but is here
     * for backwards compatibility.  {@link #createGraphics() createGraphics} is more
     * convenient, since it is declared to return a
     * <code>Graphics2D</code>.
     * @return a <code>Graphics2D</code>, which can be used to draw into
     *          this image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Object getProperty(String name) {

    /**
     * Returns a property of the image by name.
     * @param name the property name
     * @return an <code>Object</code> that is the property referred to by
     *          the specified <code>name</code>.
     * @throws NullPointerException if the property name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public Object getProperty(String name, ImageObserver observer) {

    /**
     * Returns a property of the image by name.  Individual property names
     * are defined by the various image formats.  If a property is not
     * defined for a particular image, this method returns the
     * <code>UndefinedProperty</code> field.  If the properties
     * for this image are not yet known, then this method returns
     * <code>null</code> and the <code>ImageObserver</code> object is
     * notified later.  The property name "comment" should be used to
     * store an optional comment that can be presented to the user as a
     * description of the image, its source, or its author.
     * @param name the property name
     * @param observer the <code>ImageObserver</code> that receives
     *  notification regarding image information
     * @return an {@link Object} that is the property referred to by the
     *          specified <code>name</code> or <code>null</code> if the
     *          properties of this image are not yet known.
     * @throws NullPointerException if the property name is null.
     * @see ImageObserver
     * @see java.awt.Image#UndefinedProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public ImageProducer getSource() {

    /**
     * Returns the object that produces the pixels for the image.
     * @return the {@link ImageProducer} that is used to produce the
     * pixels for this image.
     * @see ImageProducer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getHeight(ImageObserver observer) {

    /**
     * Returns the height of the <code>BufferedImage</code>.
     * @param observer ignored
     * @return the height of this <code>BufferedImage</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getWidth(ImageObserver observer) {

    /**
     * Returns the width of the <code>BufferedImage</code>.
     * @param observer ignored
     * @return the width of this <code>BufferedImage</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getHeight() {

    /**
     * Returns the height of the <code>BufferedImage</code>.
     * @return the height of this <code>BufferedImage</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getWidth() {

    /**
     * Returns the width of the <code>BufferedImage</code>.
     * @return the width of this <code>BufferedImage</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public void setRGB(int startX, int startY, int w, int h,
                        int[] rgbArray, int offset, int scansize) {

    /**
     * Sets an array of integer pixels in the default RGB color model
     * (TYPE_INT_ARGB) and default sRGB color space,
     * into a portion of the image data.  Color conversion takes place
     * if the default model does not match the image
     * <code>ColorModel</code>.  There are only 8-bits of precision for
     * each color component in the returned data when
     * using this method.  With a specified coordinate (x,&nbsp;y) in the
     * this image, the ARGB pixel can be accessed in this way:
     * <pre>
     *    pixel   = rgbArray[offset + (y-startY)*scansize + (x-startX)];
     * </pre>
     * WARNING: No dithering takes place.
     *
     * <p>
     *
     * An <code>ArrayOutOfBoundsException</code> may be thrown
     * if the region is not in bounds.
     * However, explicit bounds checking is not guaranteed.
     *
     * @param startX      the starting X coordinate
     * @param startY      the starting Y coordinate
     * @param w           width of the region
     * @param h           height of the region
     * @param rgbArray    the rgb pixels
     * @param offset      offset into the <code>rgbArray</code>
     * @param scansize    scanline stride for the <code>rgbArray</code>
     * @see #getRGB(int, int)
     * @see #getRGB(int, int, int, int, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public synchronized void setRGB(int x, int y, int rgb) {

    /**
     * Sets a pixel in this <code>BufferedImage</code> to the specified
     * RGB value. The pixel is assumed to be in the default RGB color
     * model, TYPE_INT_ARGB, and default sRGB color space.  For images
     * with an <code>IndexColorModel</code>, the index with the nearest
     * color is chosen.
     *
     * <p>
     *
     * An <code>ArrayOutOfBoundsException</code> may be thrown
     * if the coordinates are not in bounds.
     * However, explicit bounds checking is not guaranteed.
     *
     * @param x the X coordinate of the pixel to set
     * @param y the Y coordinate of the pixel to set
     * @param rgb the RGB value
     * @see #getRGB(int, int)
     * @see #getRGB(int, int, int, int, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int[] getRGB(int startX, int startY, int w, int h,
                        int[] rgbArray, int offset, int scansize) {

    /**
     * Returns an array of integer pixels in the default RGB color model
     * (TYPE_INT_ARGB) and default sRGB color space,
     * from a portion of the image data.  Color conversion takes
     * place if the default model does not match the image
     * <code>ColorModel</code>.  There are only 8-bits of precision for
     * each color component in the returned data when
     * using this method.  With a specified coordinate (x,&nbsp;y) in the
     * image, the ARGB pixel can be accessed in this way:
     *
     * <pre>
     *    pixel   = rgbArray[offset + (y-startY)*scansize + (x-startX)]; </pre>
     *
     * <p>
     *
     * An <code>ArrayOutOfBoundsException</code> may be thrown
     * if the region is not in bounds.
     * However, explicit bounds checking is not guaranteed.
     *
     * @param startX      the starting X coordinate
     * @param startY      the starting Y coordinate
     * @param w           width of region
     * @param h           height of region
     * @param rgbArray    if not <code>null</code>, the rgb pixels are
     *          written here
     * @param offset      offset into the <code>rgbArray</code>
     * @param scansize    scanline stride for the <code>rgbArray</code>
     * @return            array of RGB pixels.
     * @see #setRGB(int, int, int)
     * @see #setRGB(int, int, int, int, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getRGB(int x, int y) {

    /**
     * Returns an integer pixel in the default RGB color model
     * (TYPE_INT_ARGB) and default sRGB colorspace.  Color
     * conversion takes place if this default model does not match
     * the image <code>ColorModel</code>.  There are only 8-bits of
     * precision for each color component in the returned data when using
     * this method.
     *
     * <p>
     *
     * An <code>ArrayOutOfBoundsException</code> may be thrown
     * if the coordinates are not in bounds.
     * However, explicit bounds checking is not guaranteed.
     *
     * @param x the X coordinate of the pixel from which to get
     *          the pixel in the default RGB color model and sRGB
     *          color space
     * @param y the Y coordinate of the pixel from which to get
     *          the pixel in the default RGB color model and sRGB
     *          color space
     * @return an integer pixel in the default RGB color model and
     *          default sRGB colorspace.
     * @see #setRGB(int, int, int)
     * @see #setRGB(int, int, int, int, int[], int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public WritableRaster getAlphaRaster() {

    /**
     * Returns a <code>WritableRaster</code> representing the alpha
     * channel for <code>BufferedImage</code> objects
     * with <code>ColorModel</code> objects that support a separate
     * spatial alpha channel, such as <code>ComponentColorModel</code> and
     * <code>DirectColorModel</code>.  Returns <code>null</code> if there
     * is no alpha channel associated with the <code>ColorModel</code> in
     * this image.  This method assumes that for all
     * <code>ColorModel</code> objects other than
     * <code>IndexColorModel</code>, if the <code>ColorModel</code>
     * supports alpha, there is a separate alpha channel
     * which is stored as the last band of image data.
     * If the image uses an <code>IndexColorModel</code> that
     * has alpha in the lookup table, this method returns
     * <code>null</code> since there is no spatially discrete alpha
     * channel.  This method creates a new
     * <code>WritableRaster</code>, but shares the data array.
     * @return a <code>WritableRaster</code> or <code>null</code> if this
     *          <code>BufferedImage</code> has no alpha channel associated
     *          with its <code>ColorModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public WritableRaster getRaster() {

    /**
     * Returns the {@link WritableRaster}.
     * @return the <code>WriteableRaster</code> of this
     *  <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public ColorModel getColorModel() {

    /**
     * Returns the <code>ColorModel</code>.
     * @return the <code>ColorModel</code> of this
     *  <code>BufferedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public int getType() {

    /**
     * Returns the image type.  If it is not one of the known types,
     * TYPE_CUSTOM is returned.
     * @return the image type of this <code>BufferedImage</code>.
     * @see #TYPE_INT_RGB
     * @see #TYPE_INT_ARGB
     * @see #TYPE_INT_ARGB_PRE
     * @see #TYPE_INT_BGR
     * @see #TYPE_3BYTE_BGR
     * @see #TYPE_4BYTE_ABGR
     * @see #TYPE_4BYTE_ABGR_PRE
     * @see #TYPE_BYTE_GRAY
     * @see #TYPE_BYTE_BINARY
     * @see #TYPE_BYTE_INDEXED
     * @see #TYPE_USHORT_GRAY
     * @see #TYPE_USHORT_565_RGB
     * @see #TYPE_USHORT_555_RGB
     * @see #TYPE_CUSTOM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
/*

    /**
     * Constructs a new <code>BufferedImage</code> with a specified
     * <code>ColorModel</code> and <code>Raster</code>.  If the number and
     * types of bands in the <code>SampleModel</code> of the
     * <code>Raster</code> do not match the number and types required by
     * the <code>ColorModel</code> to represent its color and alpha
     * components, a {@link RasterFormatException} is thrown.  This
     * method can multiply or divide the color <code>Raster</code> data by
     * alpha to match the <code>alphaPremultiplied</code> state
     * in the <code>ColorModel</code>.  Properties for this
     * <code>BufferedImage</code> can be established by passing
     * in a {@link Hashtable} of <code>String</code>/<code>Object</code>
     * pairs.
     * @param cm <code>ColorModel</code> for the new image
     * @param raster     <code>Raster</code> for the image data
     * @param isRasterPremultiplied   if <code>true</code>, the data in
     *                  the raster has been premultiplied with alpha.
     * @param properties <code>Hashtable</code> of
     *                  <code>String</code>/<code>Object</code> pairs.
     * @exception RasterFormatException if the number and
     * types of bands in the <code>SampleModel</code> of the
     * <code>Raster</code> do not match the number and types required by
     * the <code>ColorModel</code> to represent its color and alpha
     * components.
     * @exception IllegalArgumentException if
     *          <code>raster</code> is incompatible with <code>cm</code>
     * @see ColorModel
     * @see Raster
     * @see WritableRaster
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public BufferedImage (int width,
                          int height,
                          int imageType,
                          IndexColorModel cm) {

    /**
     * Constructs a <code>BufferedImage</code> of one of the predefined
     * image types:
     * TYPE_BYTE_BINARY or TYPE_BYTE_INDEXED.
     *
     * <p> If the image type is TYPE_BYTE_BINARY, the number of
     * entries in the color model is used to determine whether the
     * image should have 1, 2, or 4 bits per pixel.  If the color model
     * has 1 or 2 entries, the image will have 1 bit per pixel.  If it
     * has 3 or 4 entries, the image with have 2 bits per pixel.  If
     * it has between 5 and 16 entries, the image will have 4 bits per
     * pixel.  Otherwise, an IllegalArgumentException will be thrown.
     *
     * @param width     width of the created image
     * @param height    height of the created image
     * @param imageType type of the created image
     * @param cm        <code>IndexColorModel</code> of the created image
     * @throws IllegalArgumentException   if the imageType is not
     * TYPE_BYTE_BINARY or TYPE_BYTE_INDEXED or if the imageType is
     * TYPE_BYTE_BINARY and the color map has more than 16 entries.
     * @see #TYPE_BYTE_BINARY
     * @see #TYPE_BYTE_INDEXED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public BufferedImage(int width,
                         int height,
                         int imageType) {

    /**
     * Constructs a <code>BufferedImage</code> of one of the predefined
     * image types.  The <code>ColorSpace</code> for the image is the
     * default sRGB space.
     * @param width     width of the created image
     * @param height    height of the created image
     * @param imageType type of the created image
     * @see ColorSpace
     * @see #TYPE_INT_RGB
     * @see #TYPE_INT_ARGB
     * @see #TYPE_INT_ARGB_PRE
     * @see #TYPE_INT_BGR
     * @see #TYPE_3BYTE_BGR
     * @see #TYPE_4BYTE_ABGR
     * @see #TYPE_4BYTE_ABGR_PRE
     * @see #TYPE_BYTE_GRAY
     * @see #TYPE_USHORT_GRAY
     * @see #TYPE_BYTE_BINARY
     * @see #TYPE_BYTE_INDEXED
     * @see #TYPE_USHORT_565_RGB
     * @see #TYPE_USHORT_555_RGB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_BYTE_INDEXED = 13;

    /**
     * Represents an indexed byte image.  When this type is used as the
     * <code>imageType</code> argument to the <code>BufferedImage</code>
     * constructor that takes an <code>imageType</code> argument
     * but no <code>ColorModel</code> argument, an
     * <code>IndexColorModel</code> is created with
     * a 256-color 6/6/6 color cube palette with the rest of the colors
     * from 216-255 populated by grayscale values in the
     * default sRGB ColorSpace.
     *
     * <p> When color data is stored in an image of this type,
     * the closest color in the colormap is determined
     * by the <code>IndexColorModel</code> and the resulting index is stored.
     * Approximation and loss of alpha or color components
     * can result, depending on the colors in the
     * <code>IndexColorModel</code> colormap.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_BYTE_BINARY = 12;

    /**
     * Represents an opaque byte-packed 1, 2, or 4 bit image.  The
     * image has an {@link IndexColorModel} without alpha.  When this
     * type is used as the <code>imageType</code> argument to the
     * <code>BufferedImage</code> constructor that takes an
     * <code>imageType</code> argument but no <code>ColorModel</code>
     * argument, a 1-bit image is created with an
     * <code>IndexColorModel</code> with two colors in the default
     * sRGB <code>ColorSpace</code>: {0,&nbsp;0,&nbsp;0} and
     * {255,&nbsp;255,&nbsp;255}.
     *
     * <p> Images with 2 or 4 bits per pixel may be constructed via
     * the <code>BufferedImage</code> constructor that takes a
     * <code>ColorModel</code> argument by supplying a
     * <code>ColorModel</code> with an appropriate map size.
     *
     * <p> Images with 8 bits per pixel should use the image types
     * <code>TYPE_BYTE_INDEXED</code> or <code>TYPE_BYTE_GRAY</code>
     * depending on their <code>ColorModel</code>.

     * <p> When color data is stored in an image of this type,
     * the closest color in the colormap is determined
     * by the <code>IndexColorModel</code> and the resulting index is stored.
     * Approximation and loss of alpha or color components
     * can result, depending on the colors in the
     * <code>IndexColorModel</code> colormap.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_USHORT_GRAY = 11;

    /**
     * Represents an unsigned short grayscale image, non-indexed).  This
     * image has a <code>ComponentColorModel</code> with a CS_GRAY
     * <code>ColorSpace</code>.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_BYTE_GRAY = 10;

    /**
     * Represents a unsigned byte grayscale image, non-indexed.  This
     * image has a <code>ComponentColorModel</code> with a CS_GRAY
     * {@link ColorSpace}.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_USHORT_555_RGB = 9;

    /**
     * Represents an image with 5-5-5 RGB color components (5-bits red,
     * 5-bits green, 5-bits blue) with no alpha.  This image has
     * a <code>DirectColorModel</code>.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_USHORT_565_RGB = 8;

    /**
     * Represents an image with 5-6-5 RGB color components (5-bits red,
     * 6-bits green, 5-bits blue) with no alpha.  This image has
     * a <code>DirectColorModel</code>.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_4BYTE_ABGR_PRE = 7;

    /**
     * Represents an image with 8-bit RGBA color components with the colors
     * Blue, Green, and Red stored in 3 bytes and 1 byte of alpha.  The
     * image has a <code>ComponentColorModel</code> with alpha. The color
     * data in this image is considered to be premultiplied with alpha.
     * The byte data is interleaved in a single byte array in the order
     * A, B, G, R from lower to higher byte addresses within each pixel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_4BYTE_ABGR = 6;

    /**
     * Represents an image with 8-bit RGBA color components with the colors
     * Blue, Green, and Red stored in 3 bytes and 1 byte of alpha.  The
     * image has a <code>ComponentColorModel</code> with alpha.  The
     * color data in this image is considered not to be premultiplied with
     * alpha.  The byte data is interleaved in a single
     * byte array in the order A, B, G, R
     * from lower to higher byte addresses within each pixel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_3BYTE_BGR = 5;

    /**
     * Represents an image with 8-bit RGB color components, corresponding
     * to a Windows-style BGR color model) with the colors Blue, Green,
     * and Red stored in 3 bytes.  There is no alpha.  The image has a
     * <code>ComponentColorModel</code>.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_INT_BGR = 4;

    /**
     * Represents an image with 8-bit RGB color components, corresponding
     * to a Windows- or Solaris- style BGR color model, with the colors
     * Blue, Green, and Red packed into integer pixels.  There is no alpha.
     * The image has a {@link DirectColorModel}.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_INT_ARGB_PRE = 3;

    /**
     * Represents an image with 8-bit RGBA color components packed into
     * integer pixels.  The image has a <code>DirectColorModel</code>
     * with alpha.  The color data in this image is considered to be
     * premultiplied with alpha.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_INT_ARGB = 2;

    /**
     * Represents an image with 8-bit RGBA color components packed into
     * integer pixels.  The image has a <code>DirectColorModel</code>
     * with alpha. The color data in this image is considered not to be
     * premultiplied with alpha.  When this type is used as the
     * <code>imageType</code> argument to a <code>BufferedImage</code>
     * constructor, the created image is consistent with images
     * created in the JDK1.1 and earlier releases.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    public static final int TYPE_INT_RGB = 1;

    /**
     * Represents an image with 8-bit RGB color components packed into
     * integer pixels.  The image has a {@link DirectColorModel} without
     * alpha.
     * When data with non-opaque alpha is stored
     * in an image of this type,
     * the color data must be adjusted to a non-premultiplied form
     * and the alpha discarded,
     * as described in the
     * {@link java.awt.AlphaComposite} documentation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
    /**

    /**
     * Image Type Constants
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BufferedImage.java
public class BufferedImage extends java.awt.Image

/**
 *
 * The <code>BufferedImage</code> subclass describes an {@link
 * java.awt.Image Image} with an accessible buffer of image data.
 * A <code>BufferedImage</code> is comprised of a {@link ColorModel} and a
 * {@link Raster} of image data.
 * The number and types of bands in the {@link SampleModel} of the
 * <code>Raster</code> must match the number and types required by the
 * <code>ColorModel</code> to represent its color and alpha components.
 * All <code>BufferedImage</code> objects have an upper left corner
 * coordinate of (0,&nbsp;0).  Any <code>Raster</code> used to construct a
 * <code>BufferedImage</code> must therefore have minX=0 and minY=0.
 *
 * <p>
 * This class relies on the data fetching and setting methods
 * of <code>Raster</code>,
 * and on the color characterization methods of <code>ColorModel</code>.
 *
 * @see ColorModel
 * @see Raster
 * @see WritableRaster
 */
