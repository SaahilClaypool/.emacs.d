_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    WritableRaster copyData(WritableRaster raster);

    /**
     * Computes an arbitrary rectangular region of the RenderedImage
     * and copies it into a caller-supplied WritableRaster.  The region
     * to be computed is determined from the bounds of the supplied
     * WritableRaster.  The supplied WritableRaster must have a
     * SampleModel that is compatible with this image.  If raster is null,
     * an appropriate WritableRaster is created.
     * @param raster a WritableRaster to hold the returned portion of the
     *               image, or null.
     * @return a reference to the supplied or created WritableRaster.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    Raster getData(Rectangle rect);

    /**
     * Computes and returns an arbitrary region of the RenderedImage.
     * The Raster returned is a copy of the image data and will not
     * be updated if the image is changed.
     * @param rect the region of the RenderedImage to be returned.
     * @return the region of the <code>RenderedImage</code>
     * indicated by the specified <code>Rectangle</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    Raster getData();

    /**
     * Returns the image as one large tile (for tile based
     * images this will require fetching the whole image
     * and copying the image data over).  The Raster returned is
     * a copy of the image data and will not be updated if the image
     * is changed.
     * @return the image as one large tile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
   Raster getTile(int tileX, int tileY);

    /**
     * Returns tile (tileX, tileY).  Note that tileX and tileY are indices
     * into the tile array, not pixel locations.  The Raster that is returned
     * is live and will be updated if the image is changed.
     * @param tileX the X index of the requested tile in the tile array
     * @param tileY the Y index of the requested tile in the tile array
     * @return the tile given the specified indices.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getTileGridYOffset();

    /**
     * Returns the Y offset of the tile grid relative to the origin,
     * i.e., the Y coordinate of the upper-left pixel of tile (0, 0).
     * (Note that tile (0, 0) may not actually exist.)
     * @return the Y offset of the tile grid relative to the origin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getTileGridXOffset();

    /**
     * Returns the X offset of the tile grid relative to the origin,
     * i.e., the X coordinate of the upper-left pixel of tile (0, 0).
     * (Note that tile (0, 0) may not actually exist.)
     * @return the X offset of the tile grid relative to the origin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getTileHeight();

    /**
     *  Returns the tile height in pixels.  All tiles must have the same
     *  height.
     *  @return the tile height in pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getTileWidth();

    /**
     *  Returns the tile width in pixels.  All tiles must have the same
     *  width.
     *  @return the tile width in pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getMinTileY();

    /**
     *  Returns the minimum tile index in the Y direction.
     *  @return the minimum tile index in the X direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getMinTileX();

    /**
     *  Returns the minimum tile index in the X direction.
     *  @return the minimum tile index in the X direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getNumYTiles();

    /**
     * Returns the number of tiles in the Y direction.
     * @return the number of tiles in the Y direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getNumXTiles();

    /**
     * Returns the number of tiles in the X direction.
     * @return the number of tiles in the X direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getMinY();

    /**
     * Returns the minimum Y coordinate (inclusive) of the RenderedImage.
     * @return the Y coordinate of this <code>RenderedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getMinX();

    /**
     * Returns the minimum X coordinate (inclusive) of the RenderedImage.
     * @return the X coordinate of this <code>RenderedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getHeight();

    /**
     * Returns the height of the RenderedImage.
     * @return the height of this <code>RenderedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getWidth();

    /**
     * Returns the width of the RenderedImage.
     * @return the width of this <code>RenderedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    SampleModel getSampleModel();

    /**
     * Returns the SampleModel associated with this image.  All Rasters
     * returned from this image will have this as their SampleModel.
     * @return the <code>SampleModel</code> of this image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    ColorModel getColorModel();

    /**
     * Returns the ColorModel associated with this image.  All Rasters
     * returned from this image will have this as their ColorModel.  This
     * can return null.
     * @return the <code>ColorModel</code> of this image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    String[] getPropertyNames();

    /**
      * Returns an array of names recognized by
      * {@link #getProperty(String) getProperty(String)}
      * or <code>null</code>, if no property names are recognized.
      * @return a <code>String</code> array containing all of the
      * property names that <code>getProperty(String)</code> recognizes;
      * or <code>null</code> if no property names are recognized.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    Object getProperty(String name);

    /**
     * Gets a property from the property set of this image.  The set of
     * properties and whether it is immutable is determined by the
     * implementing class.  This method returns
     * java.awt.Image.UndefinedProperty if the specified property is
     * not defined for this RenderedImage.
     * @param name the name of the property
     * @return the property indicated by the specified name.
     * @see java.awt.Image#UndefinedProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    Vector<RenderedImage> getSources();

    /**
     * Returns a vector of RenderedImages that are the immediate sources of
     * image data for this RenderedImage.  This method returns null if
     * the RenderedImage object has no information about its immediate
     * sources.  It returns an empty Vector if the RenderedImage object has
     * no immediate sources.
     * @return a Vector of <code>RenderedImage</code> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
public interface RenderedImage {

/**
 * RenderedImage is a common interface for objects which contain
 * or can produce image data in the form of Rasters.  The image
 * data may be stored/produced as a single tile or a regular array
 * of tiles.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    WritableRaster copyData(WritableRaster raster);

    /**
     * Computes an arbitrary rectangular region of the RenderedImage
     * and copies it into a caller-supplied WritableRaster.  The region
     * to be computed is determined from the bounds of the supplied
     * WritableRaster.  The supplied WritableRaster must have a
     * SampleModel that is compatible with this image.  If raster is null,
     * an appropriate WritableRaster is created.
     * @param raster a WritableRaster to hold the returned portion of the
     *               image, or null.
     * @return a reference to the supplied or created WritableRaster.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    Raster getData(Rectangle rect);

    /**
     * Computes and returns an arbitrary region of the RenderedImage.
     * The Raster returned is a copy of the image data and will not
     * be updated if the image is changed.
     * @param rect the region of the RenderedImage to be returned.
     * @return the region of the <code>RenderedImage</code>
     * indicated by the specified <code>Rectangle</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    Raster getData();

    /**
     * Returns the image as one large tile (for tile based
     * images this will require fetching the whole image
     * and copying the image data over).  The Raster returned is
     * a copy of the image data and will not be updated if the image
     * is changed.
     * @return the image as one large tile.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
   Raster getTile(int tileX, int tileY);

    /**
     * Returns tile (tileX, tileY).  Note that tileX and tileY are indices
     * into the tile array, not pixel locations.  The Raster that is returned
     * is live and will be updated if the image is changed.
     * @param tileX the X index of the requested tile in the tile array
     * @param tileY the Y index of the requested tile in the tile array
     * @return the tile given the specified indices.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getTileGridYOffset();

    /**
     * Returns the Y offset of the tile grid relative to the origin,
     * i.e., the Y coordinate of the upper-left pixel of tile (0, 0).
     * (Note that tile (0, 0) may not actually exist.)
     * @return the Y offset of the tile grid relative to the origin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getTileGridXOffset();

    /**
     * Returns the X offset of the tile grid relative to the origin,
     * i.e., the X coordinate of the upper-left pixel of tile (0, 0).
     * (Note that tile (0, 0) may not actually exist.)
     * @return the X offset of the tile grid relative to the origin.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getTileHeight();

    /**
     *  Returns the tile height in pixels.  All tiles must have the same
     *  height.
     *  @return the tile height in pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getTileWidth();

    /**
     *  Returns the tile width in pixels.  All tiles must have the same
     *  width.
     *  @return the tile width in pixels.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getMinTileY();

    /**
     *  Returns the minimum tile index in the Y direction.
     *  @return the minimum tile index in the X direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getMinTileX();

    /**
     *  Returns the minimum tile index in the X direction.
     *  @return the minimum tile index in the X direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getNumYTiles();

    /**
     * Returns the number of tiles in the Y direction.
     * @return the number of tiles in the Y direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getNumXTiles();

    /**
     * Returns the number of tiles in the X direction.
     * @return the number of tiles in the X direction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getMinY();

    /**
     * Returns the minimum Y coordinate (inclusive) of the RenderedImage.
     * @return the Y coordinate of this <code>RenderedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getMinX();

    /**
     * Returns the minimum X coordinate (inclusive) of the RenderedImage.
     * @return the X coordinate of this <code>RenderedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getHeight();

    /**
     * Returns the height of the RenderedImage.
     * @return the height of this <code>RenderedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    int getWidth();

    /**
     * Returns the width of the RenderedImage.
     * @return the width of this <code>RenderedImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    SampleModel getSampleModel();

    /**
     * Returns the SampleModel associated with this image.  All Rasters
     * returned from this image will have this as their SampleModel.
     * @return the <code>SampleModel</code> of this image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    ColorModel getColorModel();

    /**
     * Returns the ColorModel associated with this image.  All Rasters
     * returned from this image will have this as their ColorModel.  This
     * can return null.
     * @return the <code>ColorModel</code> of this image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    String[] getPropertyNames();

    /**
      * Returns an array of names recognized by
      * {@link #getProperty(String) getProperty(String)}
      * or <code>null</code>, if no property names are recognized.
      * @return a <code>String</code> array containing all of the
      * property names that <code>getProperty(String)</code> recognizes;
      * or <code>null</code> if no property names are recognized.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    Object getProperty(String name);

    /**
     * Gets a property from the property set of this image.  The set of
     * properties and whether it is immutable is determined by the
     * implementing class.  This method returns
     * java.awt.Image.UndefinedProperty if the specified property is
     * not defined for this RenderedImage.
     * @param name the name of the property
     * @return the property indicated by the specified name.
     * @see java.awt.Image#UndefinedProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
    Vector<RenderedImage> getSources();

    /**
     * Returns a vector of RenderedImages that are the immediate sources of
     * image data for this RenderedImage.  This method returns null if
     * the RenderedImage object has no information about its immediate
     * sources.  It returns an empty Vector if the RenderedImage object has
     * no immediate sources.
     * @return a Vector of <code>RenderedImage</code> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/RenderedImage.java
public interface RenderedImage {

/**
 * RenderedImage is a common interface for objects which contain
 * or can produce image data in the form of Rasters.  The image
 * data may be stored/produced as a single tile or a regular array
 * of tiles.
 */
