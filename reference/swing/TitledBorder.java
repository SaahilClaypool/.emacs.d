_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public Component.BaselineResizeBehavior getBaselineResizeBehavior(
            Component c) {

    /**
     * Returns an enum indicating how the baseline of the border
     * changes as the size changes.
     *
     * @throws NullPointerException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public int getBaseline(Component c, int width, int height) {

    /**
     * Returns the baseline.
     *
     * @throws NullPointerException {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     * @see javax.swing.JComponent#getBaseline(int, int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public Dimension getMinimumSize(Component c) {

    /**
     * Returns the minimum dimensions this border requires
     * in order to fully display the border and title.
     * @param c the component where this border will be drawn
     * @return the {@code Dimension} object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public void setTitleColor(Color titleColor) {

    /**
     * Sets the title-color of the titled border.
     * @param titleColor the color for the border title
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public void setTitleFont(Font titleFont) {

    /**
     * Sets the title-font of the titled border.
     * @param titleFont the font for the border title
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public void setTitleJustification(int titleJustification) {

    /**
     * Sets the title-justification of the titled border.
     * @param titleJustification the justification for the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public void setTitlePosition(int titlePosition) {

    /**
     * Sets the title-position of the titled border.
     * @param titlePosition the position for the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public void setBorder(Border border) {

    /**
     * Sets the border of the titled border.
     * @param border the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public void setTitle(String title) {

    /**
     * Sets the title of the titled border.
     * @param title  the title for the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public Color getTitleColor() {

    /**
     * Returns the title-color of the titled border.
     *
     * @return the title-color of the titled border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public Font getTitleFont() {

    /**
     * Returns the title-font of the titled border.
     *
     * @return the title-font of the titled border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public int getTitleJustification() {

    /**
     * Returns the title-justification of the titled border.
     *
     * @return the title-justification of the titled border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public int getTitlePosition() {

    /**
     * Returns the title-position of the titled border.
     *
     * @return the title-position of the titled border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public Border getBorder() {

    /**
     * Returns the border of the titled border.
     *
     * @return the border of the titled border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public String getTitle() {

    /**
     * Returns the title of the titled border.
     *
     * @return the title of the titled border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public boolean isBorderOpaque() {

    /**
     * Returns whether or not the border is opaque.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public Insets getBorderInsets(Component c, Insets insets) {

    /**
     * Reinitialize the insets parameter with this Border's current Insets.
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    @ConstructorProperties({"border", "title", "titleJustification", "titlePosition", "titleFont", "titleColor"})

    /**
     * Creates a TitledBorder instance with the specified border,
     * title, title-justification, title-position, title-font, and
     * title-color.
     *
     * @param border  the border
     * @param title  the title the border should display
     * @param titleJustification the justification for the title
     * @param titlePosition the position for the title
     * @param titleFont the font of the title
     * @param titleColor the color of the title
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public TitledBorder(Border border,
                        String title,
                        int titleJustification,
                        int titlePosition,
                        Font titleFont) {

    /**
     * Creates a TitledBorder instance with the specified border,
     * title, title-justification, title-position, and title-font.
     *
     * @param border  the border
     * @param title  the title the border should display
     * @param titleJustification the justification for the title
     * @param titlePosition the position for the title
     * @param titleFont the font for rendering the title
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public TitledBorder(Border border,
                        String title,
                        int titleJustification,
                        int titlePosition) {

    /**
     * Creates a TitledBorder instance with the specified border,
     * title, title-justification, and title-position.
     *
     * @param border  the border
     * @param title  the title the border should display
     * @param titleJustification the justification for the title
     * @param titlePosition the position for the title
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public TitledBorder(Border border, String title) {

    /**
     * Creates a TitledBorder instance with the specified border
     * and title.
     *
     * @param border  the border
     * @param title  the title the border should display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public TitledBorder(Border border) {

    /**
     * Creates a TitledBorder instance with the specified border
     * and an empty title.
     *
     * @param border  the border
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    public TitledBorder(String title) {

    /**
     * Creates a TitledBorder instance.
     *
     * @param title  the title the border should display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     TRAILING = 5;

    /** Position title text at the right side of the border line
     *  for left to right orientation, at the left side of the
     *  border line for right to left orientation.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     LEADING = 4;

    /** Position title text at the left side of the border line
     *  for left to right orientation, at the right side of the
     *  border line for right to left orientation.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     RIGHT                   = 3;

    /** Position title text at the right side of the border line. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     CENTER                  = 2;

    /** Position title text in the center of the border line. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     LEFT                    = 1;

    /** Position title text at the left side of the border line. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     DEFAULT_JUSTIFICATION   = 0;

    /**
     * Use the default justification for the title text.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     BELOW_BOTTOM            = 6;

    /** Position the title below the border's bottom line. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     BOTTOM                  = 5;

    /** Position the title in the middle of the border's bottom line. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     ABOVE_BOTTOM            = 4;

    /** Position the title above the border's bottom line. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     BELOW_TOP               = 3;

    /** Position the title below the border's top line. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     TOP                     = 2;

    /** Position the title in the middle of the border's top line. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     ABOVE_TOP               = 1;

    /** Position the title above the border's top line. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
    static public final int     DEFAULT_POSITION        = 0;

    /**
     * Use the default vertical orientation for the title text.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//border/TitledBorder.java
@SuppressWarnings("serial")

/**
 * A class which implements an arbitrary border
 * with the addition of a String title in a
 * specified position and justification.
 * <p>
 * If the border, font, or color property values are not
 * specified in the constructor or by invoking the appropriate
 * set methods, the property values will be defined by the current
 * look and feel, using the following property names in the
 * Defaults Table:
 * <ul>
 * <li>&quot;TitledBorder.border&quot;
 * <li>&quot;TitledBorder.font&quot;
 * <li>&quot;TitledBorder.titleColor&quot;
 * </ul>
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
