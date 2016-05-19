_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/DerivedColor.java
    @Override

    /**
     * Returns a string representation of this <code>Color</code>. This method
     * is intended to be used only for debugging purposes. The content and
     * format of the returned string might vary between implementations. The
     * returned string might be empty but cannot be <code>null</code>.
     *
     * @return a String representation of this <code>Color</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/DerivedColor.java
    @Override public int getRGB() {

    /**
     * Returns the RGB value representing the color in the default sRGB {@link java.awt.image.ColorModel}. (Bits 24-31
     * are alpha, 16-23 are red, 8-15 are green, 0-7 are blue).
     *
     * @return the RGB value of the color in the default sRGB <code>ColorModel</code>.
     * @see java.awt.image.ColorModel#getRGBdefault
     * @see #getRed
     * @see #getGreen
     * @see #getBlue
     * @since JDK1.0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/DerivedColor.java
    public void rederiveColor() {

    /**
     * Recalculate the derived color from the UIManager parent color and offsets
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/DerivedColor.java
class DerivedColor extends Color {

/**
 * DerivedColor - A color implementation that is derived from a UIManager
 * defaults table color and a set of offsets. It can be rederived at any point
 * by calling rederiveColor(). For example when its parent color changes and it
 * value will update to reflect the new derived color. Property change events
 * are fired for the "rgb" property when the derived color changes.
 *
 * @author Jasper Potts
 */
