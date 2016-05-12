_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public final RenderingHints getRenderingHints() {

    /**
     * Returns the rendering hints for this operation.
     *
     * @return The <CODE>RenderingHints</CODE> object associated with this
     * operation.  Returns null if no hints have been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public final Point2D getPoint2D (Point2D srcPt, Point2D dstPt) {

    /**
     * Returns the location of the corresponding destination point given a
     * point in the source <CODE>Raster</CODE>.  If <CODE>dstPt</CODE> is
     * specified, it is used to hold the return value.
     * Since this is not a geometric operation, the point returned
     * is the same as the specified <CODE>srcPt</CODE>.
     *
     * @param srcPt The <code>Point2D</code> that represents the point in
     *              the source <code>Raster</code>
     * @param dstPt The <CODE>Point2D</CODE> in which to store the result.
     *
     * @return The <CODE>Point2D</CODE> in the destination image that
     * corresponds to the specified point in the source image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public WritableRaster createCompatibleDestRaster (Raster src) {

    /**
     * Creates a zeroed destination <CODE>Raster</CODE> with the correct size
     * and number of bands.
     * An <CODE>IllegalArgumentException</CODE> may be thrown if the number of
     * bands in the source is incompatible with the matrix.  See
     * the class comments for more details.
     *
     * @param src The <CODE>Raster</CODE> to be filtered.
     *
     * @return The zeroed destination <CODE>Raster</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public final Rectangle2D getBounds2D (Raster src) {

    /**
     * Returns the bounding box of the transformed destination.  Since
     * this is not a geometric operation, the bounding box is the same for
     * the source and destination.
     * An <CODE>IllegalArgumentException</CODE> may be thrown if the number of
     * bands in the source is incompatible with the matrix.  See
     * the class comments for more details.
     *
     * @param src The <CODE>Raster</CODE> to be filtered.
     *
     * @return The <CODE>Rectangle2D</CODE> representing the destination
     * image's bounding box.
     *
     * @throws IllegalArgumentException If the number of bands in the source
     * is incompatible with the matrix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public WritableRaster filter(Raster src, WritableRaster dst) {

    /**
     * Transforms the <CODE>Raster</CODE> using the matrix specified in the
     * constructor. An <CODE>IllegalArgumentException</CODE> may be thrown if
     * the number of bands in the source or destination is incompatible with
     * the matrix.  See the class comments for more details.
     * <p>
     * If the destination is null, it will be created with a number of bands
     * equalling the number of rows in the matrix. No exception is thrown
     * if the operation causes a data overflow.
     *
     * @param src The <CODE>Raster</CODE> to be filtered.
     * @param dst The <CODE>Raster</CODE> in which to store the results
     * of the filter operation.
     *
     * @return The filtered <CODE>Raster</CODE>.
     *
     * @throws IllegalArgumentException If the number of bands in the
     * source or destination is incompatible with the matrix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public final float[][] getMatrix() {

    /**
     * Returns a copy of the linear combination matrix.
     *
     * @return The matrix associated with this band combine operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public BandCombineOp (float[][] matrix, RenderingHints hints) {

    /**
     * Constructs a <CODE>BandCombineOp</CODE> with the specified matrix.
     * The width of the matrix must be equal to the number of bands in
     * the source <CODE>Raster</CODE>, optionally plus one.  If there is one
     * more column in the matrix than the number of bands, there is an implied
     * 1 at the end of the vector of band samples representing a pixel.  The
     * height of the matrix must be equal to the number of bands in the
     * destination.
     * <p>
     * The first subscript is the row index and the second
     * is the column index.  This operation uses none of the currently
     * defined rendering hints; the <CODE>RenderingHints</CODE> argument can be
     * null.
     *
     * @param matrix The matrix to use for the band combine operation.
     * @param hints The <CODE>RenderingHints</CODE> object for this operation.
     * Not currently used so it can be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
public class BandCombineOp implements  RasterOp {

/**
 * This class performs an arbitrary linear combination of the bands
 * in a <CODE>Raster</CODE>, using a specified matrix.
 * <p>
 * The width of the matrix must be equal to the number of bands in the
 * source <CODE>Raster</CODE>, optionally plus one.  If there is one more
 * column in the matrix than the number of bands, there is an implied 1 at the
 * end of the vector of band samples representing a pixel.  The height
 * of the matrix must be equal to the number of bands in the destination.
 * <p>
 * For example, a 3-banded <CODE>Raster</CODE> might have the following
 * transformation applied to each pixel in order to invert the second band of
 * the <CODE>Raster</CODE>.
 * <pre>
 *   [ 1.0   0.0   0.0    0.0  ]     [ b1 ]
 *   [ 0.0  -1.0   0.0  255.0  ]  x  [ b2 ]
 *   [ 0.0   0.0   1.0    0.0  ]     [ b3 ]
 *                                   [ 1 ]
 * </pre>
 *
 * <p>
 * Note that the source and destination can be the same object.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public final RenderingHints getRenderingHints() {

    /**
     * Returns the rendering hints for this operation.
     *
     * @return The <CODE>RenderingHints</CODE> object associated with this
     * operation.  Returns null if no hints have been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public final Point2D getPoint2D (Point2D srcPt, Point2D dstPt) {

    /**
     * Returns the location of the corresponding destination point given a
     * point in the source <CODE>Raster</CODE>.  If <CODE>dstPt</CODE> is
     * specified, it is used to hold the return value.
     * Since this is not a geometric operation, the point returned
     * is the same as the specified <CODE>srcPt</CODE>.
     *
     * @param srcPt The <code>Point2D</code> that represents the point in
     *              the source <code>Raster</code>
     * @param dstPt The <CODE>Point2D</CODE> in which to store the result.
     *
     * @return The <CODE>Point2D</CODE> in the destination image that
     * corresponds to the specified point in the source image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public WritableRaster createCompatibleDestRaster (Raster src) {

    /**
     * Creates a zeroed destination <CODE>Raster</CODE> with the correct size
     * and number of bands.
     * An <CODE>IllegalArgumentException</CODE> may be thrown if the number of
     * bands in the source is incompatible with the matrix.  See
     * the class comments for more details.
     *
     * @param src The <CODE>Raster</CODE> to be filtered.
     *
     * @return The zeroed destination <CODE>Raster</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public final Rectangle2D getBounds2D (Raster src) {

    /**
     * Returns the bounding box of the transformed destination.  Since
     * this is not a geometric operation, the bounding box is the same for
     * the source and destination.
     * An <CODE>IllegalArgumentException</CODE> may be thrown if the number of
     * bands in the source is incompatible with the matrix.  See
     * the class comments for more details.
     *
     * @param src The <CODE>Raster</CODE> to be filtered.
     *
     * @return The <CODE>Rectangle2D</CODE> representing the destination
     * image's bounding box.
     *
     * @throws IllegalArgumentException If the number of bands in the source
     * is incompatible with the matrix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public WritableRaster filter(Raster src, WritableRaster dst) {

    /**
     * Transforms the <CODE>Raster</CODE> using the matrix specified in the
     * constructor. An <CODE>IllegalArgumentException</CODE> may be thrown if
     * the number of bands in the source or destination is incompatible with
     * the matrix.  See the class comments for more details.
     * <p>
     * If the destination is null, it will be created with a number of bands
     * equalling the number of rows in the matrix. No exception is thrown
     * if the operation causes a data overflow.
     *
     * @param src The <CODE>Raster</CODE> to be filtered.
     * @param dst The <CODE>Raster</CODE> in which to store the results
     * of the filter operation.
     *
     * @return The filtered <CODE>Raster</CODE>.
     *
     * @throws IllegalArgumentException If the number of bands in the
     * source or destination is incompatible with the matrix.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public final float[][] getMatrix() {

    /**
     * Returns a copy of the linear combination matrix.
     *
     * @return The matrix associated with this band combine operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
    public BandCombineOp (float[][] matrix, RenderingHints hints) {

    /**
     * Constructs a <CODE>BandCombineOp</CODE> with the specified matrix.
     * The width of the matrix must be equal to the number of bands in
     * the source <CODE>Raster</CODE>, optionally plus one.  If there is one
     * more column in the matrix than the number of bands, there is an implied
     * 1 at the end of the vector of band samples representing a pixel.  The
     * height of the matrix must be equal to the number of bands in the
     * destination.
     * <p>
     * The first subscript is the row index and the second
     * is the column index.  This operation uses none of the currently
     * defined rendering hints; the <CODE>RenderingHints</CODE> argument can be
     * null.
     *
     * @param matrix The matrix to use for the band combine operation.
     * @param hints The <CODE>RenderingHints</CODE> object for this operation.
     * Not currently used so it can be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/image/BandCombineOp.java
public class BandCombineOp implements  RasterOp {

/**
 * This class performs an arbitrary linear combination of the bands
 * in a <CODE>Raster</CODE>, using a specified matrix.
 * <p>
 * The width of the matrix must be equal to the number of bands in the
 * source <CODE>Raster</CODE>, optionally plus one.  If there is one more
 * column in the matrix than the number of bands, there is an implied 1 at the
 * end of the vector of band samples representing a pixel.  The height
 * of the matrix must be equal to the number of bands in the destination.
 * <p>
 * For example, a 3-banded <CODE>Raster</CODE> might have the following
 * transformation applied to each pixel in order to invert the second band of
 * the <CODE>Raster</CODE>.
 * <pre>
 *   [ 1.0   0.0   0.0    0.0  ]     [ b1 ]
 *   [ 0.0  -1.0   0.0  255.0  ]  x  [ b2 ]
 *   [ 0.0   0.0   1.0    0.0  ]     [ b3 ]
 *                                   [ 1 ]
 * </pre>
 *
 * <p>
 * Note that the source and destination can be the same object.
 */
