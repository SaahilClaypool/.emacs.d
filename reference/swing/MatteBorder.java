_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public boolean isBorderOpaque() {

    /**
     * Returns whether or not the border is opaque.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public Icon getTileIcon() {

   /**
     * Returns the icon used for tiling the border or null
     * if a solid color is being used.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public Color getMatteColor() {

    /**
     * Returns the color used for tiling the border or null
     * if a tile icon is being used.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public Insets getBorderInsets() {

    /**
     * Returns the insets of the border.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public Insets getBorderInsets(Component c, Insets insets) {

    /**
     * Reinitialize the insets parameter with this Border's current Insets.
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

    /**
     * Paints the matte border.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public MatteBorder(Icon tileIcon)   {

    /**
     * Creates a matte border with the specified tile icon.  The
     * insets will be calculated dynamically based on the size of
     * the tile icon, where the top and bottom will be equal to the
     * tile icon's height, and the left and right will be equal to
     * the tile icon's width.
     * @param tileIcon the icon to be used for tiling the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public MatteBorder(Insets borderInsets, Icon tileIcon)   {

    /**
     * Creates a matte border with the specified insets and tile icon.
     * @param borderInsets the insets of the border
     * @param tileIcon the icon to be used for tiling the border
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public MatteBorder(int top, int left, int bottom, int right, Icon tileIcon)   {

    /**
     * Creates a matte border with the specified insets and tile icon.
     * @param top the top inset of the border
     * @param left the left inset of the border
     * @param bottom the bottom inset of the border
     * @param right the right inset of the border
     * @param tileIcon the icon to be used for tiling the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public MatteBorder(Insets borderInsets, Color matteColor)   {

    /**
     * Creates a matte border with the specified insets and color.
     * @param borderInsets the insets of the border
     * @param matteColor the color rendered for the border
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
    public MatteBorder(int top, int left, int bottom, int right, Color matteColor)   {

    /**
     * Creates a matte border with the specified insets and color.
     * @param top the top inset of the border
     * @param left the left inset of the border
     * @param bottom the bottom inset of the border
     * @param right the right inset of the border
     * @param matteColor the color rendered for the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/MatteBorder.java
@SuppressWarnings("serial")

/**
 * A class which provides a matte-like border of either a solid color
 * or a tiled icon.
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
 */
