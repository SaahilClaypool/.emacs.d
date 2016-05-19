_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public Color getShadowColor()   {

    /**
     * Returns the shadow color of the etched border.
     * Will return null if no shadow color was specified
     * at instantiation.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public Color getShadowColor(Component c)   {

    /**
     * Returns the shadow color of the etched border
     * when rendered on the specified component.  If no shadow
     * color was specified at instantiation, the shadow color
     * is derived from the specified component's background color.
     * @param c the component for which the shadow may be derived
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public Color getHighlightColor()   {

    /**
     * Returns the highlight color of the etched border.
     * Will return null if no highlight color was specified
     * at instantiation.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public Color getHighlightColor(Component c)   {

    /**
     * Returns the highlight color of the etched border
     * when rendered on the specified component.  If no highlight
     * color was specified at instantiation, the highlight color
     * is derived from the specified component's background color.
     * @param c the component for which the highlight may be derived
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public int getEtchType() {

    /**
     * Returns which etch-type is set on the etched border.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public boolean isBorderOpaque() { return true; }

    /**
     * Returns whether or not the border is opaque.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public Insets getBorderInsets(Component c, Insets insets) {

    /**
     * Reinitialize the insets parameter with this Border's current Insets.
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    @ConstructorProperties({"etchType", "highlightColor", "shadowColor"})

    /**
     * Creates an etched border with the specified etch-type,
     * highlight and shadow colors.
     * @param etchType the type of etch to be drawn by the border
     * @param highlight the color to use for the etched highlight
     * @param shadow the color to use for the etched shadow
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public EtchedBorder(Color highlight, Color shadow)    {

    /**
     * Creates a lowered etched border with the specified highlight and
     * shadow colors.
     * @param highlight the color to use for the etched highlight
     * @param shadow the color to use for the etched shadow
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public EtchedBorder(int etchType)    {

    /**
     * Creates an etched border with the specified etch-type
     * whose colors will be derived
     * from the background color of the component passed into
     * the paintBorder method.
     * @param etchType the type of etch to be drawn by the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public EtchedBorder()    {

    /**
     * Creates a lowered etched border whose colors will be derived
     * from the background color of the component passed into
     * the paintBorder method.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public static final int LOWERED = 1;

    /** Lowered etched type. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
    public static final int RAISED  = 0;

    /** Raised etched type. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/EtchedBorder.java
public class EtchedBorder extends AbstractBorder

/**
 * A class which implements a simple etched border which can
 * either be etched-in or etched-out.  If no highlight/shadow
 * colors are initialized when the border is created, then
 * these colors will be dynamically derived from the background
 * color of the component argument passed into the paintBorder()
 * method.
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
 * @author Amy Fowler
 */
