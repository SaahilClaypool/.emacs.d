_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/LoweredBorder.java
    public void paintBorder(Component c, Graphics g, int x, int y, int width,
                            int height) {

    /**
     * Paints the border for the specified component with the specified position
     * and size.
     *
     * @param c      the component for which this border is being painted
     * @param g      the paint graphics
     * @param x      the x position of the painted border
     * @param y      the y position of the painted border
     * @param width  the width of the painted border
     * @param height the height of the painted border
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/LoweredBorder.java
    public boolean isBorderOpaque() {

    /**
     * Returns whether or not the border is opaque.  If the border is opaque, it
     * is responsible for filling in it's own background when painting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/LoweredBorder.java
    public Insets getBorderInsets(Component c) {

    /**
     * Returns the insets of the border.
     *
     * @param c the component for which this border insets value applies
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/LoweredBorder.java
    protected PaintContext getPaintContext() {

    /**
     * <p>Gets the PaintContext for this painting operation. This method is
     * called on every paint, and so should be fast and produce no garbage. The
     * PaintContext contains information such as cache hints. It also contains
     * data necessary for decoding points at runtime, such as the stretching
     * insets, the canvas size at which the encoded points were defined, and
     * whether the stretching insets are inverted.</p>
     * <p/>
     * <p> This method allows for subclasses to package the painting of
     * different states with possibly different canvas sizes, etc, into one
     * AbstractRegionPainter implementation.</p>
     *
     * @return a PaintContext associated with this paint operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/LoweredBorder.java
    protected void doPaint(Graphics2D g, JComponent c, int width, int height,
            Object[] extendedCacheKeys) {

    /**
     * Actually performs the painting operation. Subclasses must implement this
     * method. The graphics object passed may represent the actual surface being
     * rendered to, or it may be an intermediate buffer. It has also been
     * pre-translated. Simply render the component as if it were located at 0, 0
     * and had a width of <code>width</code> and a height of
     * <code>height</code>. For performance reasons, you may want to read the
     * clip from the Graphics2D object and only render within that space.
     *
     * @param g      The Graphics2D surface to paint to
     * @param c      The JComponent related to the drawing event. For example,
     *               if the region being rendered is Button, then <code>c</code>
     *               will be a JButton. If the region being drawn is
     *               ScrollBarSlider, then the component will be JScrollBar.
     *               This value may be null.
     * @param width  The width of the region to paint. Note that in the case of
     *               painting the foreground, this value may differ from
     *               c.getWidth().
     * @param height The height of the region to paint. Note that in the case of
     *               painting the foreground, this value may differ from
     *               c.getHeight().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/LoweredBorder.java
class LoweredBorder extends AbstractRegionPainter implements Border {

/**
 * LoweredBorder - A recessed rounded inner shadowed border. Used as the
 * standard Nimbus TitledBorder. This class is both a painter and a swing
 * border.
 *
 * @author Jasper Potts
 */
