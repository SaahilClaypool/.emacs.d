_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
    private static class OceanToolBarImageFilter extends RGBImageFilter {

    /**
     * Used to create the rollover icons with the ocean look.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
    private static class OceanDisabledButtonImageFilter extends RGBImageFilter{

    /**
     * Used to create a disabled Icon with the ocean look.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
    static boolean isToolBarButton(JComponent c) {

    /**
     * Returns true if the specified widget is in a toolbar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
        private int w;

        /**
         * This is the actual width we're painting in, or last painted to.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
        public static final GradientPainter INSTANCE = new GradientPainter(8);

        /**
         * Instance used for painting.  This is the only instance that is
         * ever created.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
    static boolean drawGradient(Component c, Graphics g, String key,
                                int x, int y, int w, int h, boolean vertical) {

    /**
     * Draws a radial type gradient. The gradient will be drawn vertically if
     * <code>vertical</code> is true, otherwise horizontally.
     * The UIManager key consists of five values:
     * r1 r2 c1 c2 c3. The gradient is broken down into four chunks drawn
     * in order from the origin.
     * <ol>
     * <li>Gradient r1 % of the size from c1 to c2
     * <li>Rectangle r2 % of the size in c2.
     * <li>Gradient r1 % of the size from c2 to c1
     * <li>The remaining size will be filled with a gradient from c1 to c3.
     * </ol>
     *
     * @param c Component rendering to
     * @param g Graphics to draw to.
     * @param key UIManager key used to look up gradient values.
     * @param x X coordinate to draw from
     * @param y Y coordinate to draw from
     * @param w Width to draw to
     * @param h Height to draw to
     * @param vertical Direction of the gradient
     * @return true if <code>key</code> exists, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
    static void drawDark3DBorder(Graphics g, int x, int y, int w, int h) {

    /**
      * This draws a variant "Flush 3D Border"
      * It is used for things like active toggle buttons.
      * This is used rarely.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
    static void drawDark3DBorder(Graphics g, Rectangle r) {

    /**
      * This draws a variant "Flush 3D Border"
      * It is used for things like active toggle buttons.
      * This is used rarely.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
    static void drawPressed3DBorder(Graphics g, int x, int y, int w, int h) {

    /**
      * This draws a variant "Flush 3D Border"
      * It is used for things like pressed buttons.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
    static void drawPressed3DBorder(Graphics g, Rectangle r) {

    /**
      * This draws a variant "Flush 3D Border"
      * It is used for things like pressed buttons.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
    static void drawFlush3DBorder(Graphics g, int x, int y, int w, int h) {

    /**
      * This draws the "Flush 3D Border" which is used throughout the Metal L&F
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/metal/MetalUtils.java
class MetalUtils {

/**
 * This is a dumping ground for random stuff we want to use in several places.
 *
 * @author Steve Wilson
 */
