_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageScalingHelper.java
    private static void drawChunk(Image image, Graphics g, boolean stretch,
                           int dx1, int dy1, int dx2, int dy2, int sx1,
                           int sy1, int sx2, int sy2,
                           boolean xDirection) {

    /**
     * Draws a portion of an image, stretched or tiled.
     *
     * @param image Image to render.
     * @param g Graphics to render to
     * @param stretch Whether the image should be stretched or timed in the
     *                provided space.
     * @param dx1 X origin to draw to
     * @param dy1 Y origin to draw to
     * @param dx2 End x location to draw to
     * @param dy2 End y location to draw to
     * @param sx1 X origin to draw from
     * @param sy1 Y origin to draw from
     * @param sx2 Max x location to draw from
     * @param sy2 Max y location to draw from
     * @param xDirection Used if the image is not stretched. If true it
     *        indicates the image should be tiled along the x axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageScalingHelper.java
    public static void paint(Graphics g, int x, int y, int w, int h,
                      Image image, Insets sInsets,
                      Insets dInsets, PaintType paintType, int mask) {

    /**
     * Paints using the algorightm specified by <code>paintType</code>.
     *
     * @param g         Graphics to render to
     * @param x         X-coordinate
     * @param y         Y-coordinate
     * @param w         Width to render to
     * @param h         Height to render to
     * @param image     Image to render from, if <code>null</code> this method will do nothing
     * @param sInsets   Insets specifying the portion of the image that will be stretched or tiled, if <code>null</code>
     *                  empty <code>Insets</code> will be used.
     * @param dInsets   Destination insets specifying the portion of the image will be stretched or tiled, if
     *                  <code>null</code> empty <code>Insets</code> will be used.
     * @param paintType Specifies what type of algorithm to use in painting
     * @param mask      Specifies portion of image to render, if <code>PAINT_ALL</code> is specified, any other regions
     *                  specified will not be painted, for example PAINT_ALL | PAINT_CENTER paints everything but the
     *                  center.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageScalingHelper.java
    static final int PAINT_ALL = 512;

    /**
     * Specifies that all regions should be painted.  If this is set any other regions specified will not be painted.
     * For example PAINT_ALL | PAINT_CENTER will paint all but the center.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageScalingHelper.java
        PAINT9_TILE

        /**
         * Painting type indicating the image should be split into nine regions with the top, left, bottom and right
         * areas tiled.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageScalingHelper.java
        PAINT9_STRETCH,

        /**
         * Painting type indicating the image should be split into nine regions with the top, left, bottom and right
         * areas stretched.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageScalingHelper.java
        TILE,

        /**
         * Painting type indicating the image should be tiled across the specified width and height.  When used the
         * <code>mask</code> is ignored.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageScalingHelper.java
    enum PaintType {

    /** Enumeration for the types of painting this class can handle. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/ImageScalingHelper.java
class ImageScalingHelper {

/**
 * ImageScalingHelper
 *
 * @author Created by Jasper Potts (Aug 8, 2007)
 */
