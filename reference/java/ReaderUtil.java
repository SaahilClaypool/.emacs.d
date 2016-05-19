_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ReaderUtil.java
    public static int[] computeUpdatedPixels(Rectangle sourceRegion,
                                             Point destinationOffset,
                                             int dstMinX,
                                             int dstMinY,
                                             int dstMaxX,
                                             int dstMaxY,
                                             int sourceXSubsampling,
                                             int sourceYSubsampling,
                                             int passXStart,
                                             int passYStart,
                                             int passWidth,
                                             int passHeight,
                                             int passPeriodX,
                                             int passPeriodY)

    /**
     * A utility method that computes the exact set of destination
     * pixels that will be written during a particular decoding pass.
     * The intent is to simplify the work done by readers in combining
     * the source region, source subsampling, and destination offset
     * information obtained from the <code>ImageReadParam</code> with
     * the offsets and periods of a progressive or interlaced decoding
     * pass.
     *
     * @param sourceRegion a <code>Rectangle</code> containing the
     * source region being read, offset by the source subsampling
     * offsets, and clipped against the source bounds, as returned by
     * the <code>getSourceRegion</code> method.
     * @param destinationOffset a <code>Point</code> containing the
     * coordinates of the upper-left pixel to be written in the
     * destination.
     * @param dstMinX the smallest X coordinate (inclusive) of the
     * destination <code>Raster</code>.
     * @param dstMinY the smallest Y coordinate (inclusive) of the
     * destination <code>Raster</code>.
     * @param dstMaxX the largest X coordinate (inclusive) of the destination
     * <code>Raster</code>.
     * @param dstMaxY the largest Y coordinate (inclusive) of the destination
     * <code>Raster</code>.
     * @param sourceXSubsampling the X subsampling factor.
     * @param sourceYSubsampling the Y subsampling factor.
     * @param passXStart the smallest source X coordinate (inclusive)
     * of the current progressive pass.
     * @param passYStart the smallest source Y coordinate (inclusive)
     * of the current progressive pass.
     * @param passWidth the width in pixels of the current progressive
     * pass.
     * @param passHeight the height in pixels of the current progressive
     * pass.
     * @param passPeriodX the X period (horizontal spacing between
     * pixels) of the current progressive pass.
     * @param passPeriodY the Y period (vertical spacing between
     * pixels) of the current progressive pass.
     *
     * @return an array of 6 <code>int</code>s containing the
     * destination min X, min Y, width, height, X period and Y period
     * of the region that will be updated.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ReaderUtil.java
public class ReaderUtil {

/**
 * This class contains utility methods that may be useful to ImageReader
 * plugins.  Ideally these methods would be in the ImageReader base class
 * so that all subclasses could benefit from them, but that would be an
 * addition to the existing API, and it is not yet clear whether these methods
 * are universally useful, so for now we will leave them here.
 */
