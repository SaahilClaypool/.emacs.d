_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public boolean isBorderOpaque() {

    /**
     * Returns whether or not the border is opaque.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public boolean getRoundedCorners() {

    /**
     * Returns whether this border will be drawn with rounded corners.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public int getThickness()       {

    /**
     * Returns the thickness of the border.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public Color getLineColor()     {

    /**
     * Returns the color of the border.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public Insets getBorderInsets(Component c, Insets insets) {

    /**
     * Reinitialize the insets parameter with this Border's current Insets.
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

    /**
     * Paints the border for the specified component with the
     * specified position and size.
     * @param c the component for which this border is being painted
     * @param g the paint graphics
     * @param x the x position of the painted border
     * @param y the y position of the painted border
     * @param width the width of the painted border
     * @param height the height of the painted border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    @ConstructorProperties({"lineColor", "thickness", "roundedCorners"})

    /**
     * Creates a line border with the specified color, thickness,
     * and corner shape.
     * @param color the color of the border
     * @param thickness the thickness of the border
     * @param roundedCorners whether or not border corners should be round
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public LineBorder(Color color, int thickness)  {

    /**
     * Creates a line border with the specified color and thickness.
     * @param color the color of the border
     * @param thickness the thickness of the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public LineBorder(Color color) {

    /**
     * Creates a line border with the specified color and a
     * thickness = 1.
     * @param color the color for the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public static Border createGrayLineBorder() {

    /** Convenience method for getting the Color.gray LineBorder of thickness 1.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
    public static Border createBlackLineBorder() {

    /** Convenience method for getting the Color.black LineBorder of thickness 1.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/LineBorder.java
public class LineBorder extends AbstractBorder

/**
 * A class which implements a line border of arbitrary thickness
 * and of a single color.
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
 * @author David Kloba
 */
