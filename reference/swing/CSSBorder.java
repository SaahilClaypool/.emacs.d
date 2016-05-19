_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    static Map<Value, BorderPainter> borderPainters =

    /** Map the border style values to the border painter objects.  */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    static void registerBorderPainter(Value style, BorderPainter painter) {

    /**
     * Add the specified painter to the painters map.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    static class InsetOutsetPainter extends ShadowLightPainter {

    /**
     * Painter for the "inset" and "outset" CSS border styles.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    static class GrooveRidgePainter extends ShadowLightPainter {

    /**
     * Painter for the "groove" and "ridge" CSS border styles.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
        static Color getLightColor(Color c) {

        /**
         * Return the "light" border side color.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
        static Color getShadowColor(Color c) {

        /**
         * Return the "shadow" border side color.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    abstract static class ShadowLightPainter extends StrokePainter {

    /**
     * Painter that defines colors for "shadow" and "light" border sides.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    static class DottedDashedPainter extends StrokePainter {

    /**
     * Painter for the "dotted" and "dashed" CSS border styles.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    static class DoublePainter extends StrokePainter {

    /**
     * Painter for the "double" CSS border style.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
        void paintStrokes(Rectangle r, Graphics g, int axis,
                                int[] lengthPattern, Color[] colorPattern) {

        /**
         * Paint strokes repeatedly using the given length and color patterns.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    abstract static class StrokePainter implements BorderPainter {

    /**
     * Defines a method for painting strokes in the specified direction using
     * the given length and color patterns.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    static class SolidPainter implements BorderPainter {

    /**
     * Painter for the "solid" CSS border style.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    static class NullPainter implements BorderPainter {

    /**
     * Painter for the "none" and "hidden" CSS border styles.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
        void paint(Polygon shape, Graphics g, Color color, int side);

        /**
         * The painter should paint the border as if it were at the top and the
         * coordinates of the NW corner of the interior area is (0, 0).  The
         * caller is responsible for the appropriate affine transformations.
         *
         * Clip is set by the caller to the exact border shape so it's safe to
         * simply draw into the shape's bounding rectangle.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    static Color getAdjustedColor(Color c, double factor) {

    /**
     * Return the color with brightness adjusted by the specified factor.
     *
     * The factor values are between 0.0 (no change) and 1.0 (turn into white).
     * Negative factor values decrease brigthness (ie, 1.0 turns into black).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    private BorderPainter getBorderPainter(int side) {

    /**
     * Return the border painter appropriate for the given side.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    private Polygon getBorderShape(int side) {

    /**
     * Return border shape for {@code side} as if the border has zero interior
     * length.  Shape start is at (0,0); points are added clockwise.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    private Value getBorderStyle(int side) {

    /**
     * Return the border style for the given side.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    private int[] getWidths() {

    /**
     * Return an array of border widths in the TOP, RIGHT, BOTTOM, LEFT order.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    private int getBorderWidth(int side) {

    /**
     * Return the border width for the given side.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    private Color getBorderColor(int side) {

    /**
     * Return the border color for the given side.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    CSSBorder(AttributeSet attrs) {

    /**
     * Initialize the attribute set.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    final AttributeSet attrs;

    /** Attribute set containing border properties.  */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    final static Object[] DEFAULTS = {

    /** Default values for the border properties.  */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    final static CssValue PARSERS[] = {

    /** Parsers for the border properties.  */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    final static Attribute[][] ATTRIBUTES = {

    /** The attribute groups.  */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    final static int TOP = 0, RIGHT = 1, BOTTOM = 2, LEFT = 3;

    /** Indices for the box sides within the attribute group.  */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
    final static int COLOR = 0, STYLE = 1, WIDTH = 2;

    /** Indices for the attribute groups.  */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSSBorder.java
class CSSBorder extends AbstractBorder {

/**
 * CSS-style borders for HTML elements.
 *
 * @author Sergey Groznyh
 */
