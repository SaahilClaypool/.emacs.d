_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/SoftBevelBorder.java
    public boolean isBorderOpaque() { return false; }

    /**
     * Returns whether or not the border is opaque.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/SoftBevelBorder.java
    public Insets getBorderInsets(Component c, Insets insets)       {

    /**
     * Reinitialize the insets parameter with this Border's current Insets.
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/SoftBevelBorder.java
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

    /**
     * Paints the border for the specified component with the specified
     * position and size.
     * @param c the component for which this border is being painted
     * @param g the paint graphics
     * @param x the x position of the painted border
     * @param y the y position of the painted border
     * @param width the width of the painted border
     * @param height the height of the painted border
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/SoftBevelBorder.java
    @ConstructorProperties({"bevelType", "highlightOuterColor", "highlightInnerColor", "shadowOuterColor", "shadowInnerColor"})

    /**
     * Creates a bevel border with the specified type, highlight
     * shadow colors.
     * @param bevelType the type of bevel for the border
     * @param highlightOuterColor the color to use for the bevel outer highlight
     * @param highlightInnerColor the color to use for the bevel inner highlight
     * @param shadowOuterColor the color to use for the bevel outer shadow
     * @param shadowInnerColor the color to use for the bevel inner shadow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/SoftBevelBorder.java
    public SoftBevelBorder(int bevelType, Color highlight, Color shadow) {

    /**
     * Creates a bevel border with the specified type, highlight and
     * shadow colors.
     * @param bevelType the type of bevel for the border
     * @param highlight the color to use for the bevel highlight
     * @param shadow the color to use for the bevel shadow
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/SoftBevelBorder.java
    public SoftBevelBorder(int bevelType) {

    /**
     * Creates a bevel border with the specified type and whose
     * colors will be derived from the background color of the
     * component passed into the paintBorder method.
     * @param bevelType the type of bevel for the border
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/border/SoftBevelBorder.java
public class SoftBevelBorder extends BevelBorder

/**
 * A class which implements a raised or lowered bevel with
 * softened corners.
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
 * @author Amy Fowler
 * @author Chester Rose
 */
