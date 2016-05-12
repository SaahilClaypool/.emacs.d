_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    private static class SynthIconWrapper implements Icon {

    /**
     * Wraps a SynthIcon around the Icon interface, forwarding calls to
     * the SynthIcon with a given SynthContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    static Dimension getPreferredMenuItemSize(SynthContext context,
           SynthContext accContext, JComponent c,
           Icon checkIcon, Icon arrowIcon, int defaultTextIconGap,
           String acceleratorDelimiter, boolean useCheckAndArrow,
           String propertyPrefix) {

     /**
      * A quick note about how preferred sizes are calculated... Generally
      * speaking, SynthPopupMenuUI will run through the list of its children
      * (from top to bottom) and ask each for its preferred size.  Each menu
      * item will add up the max width of each element (icons, text,
      * accelerator spacing, accelerator text or arrow icon) encountered thus
      * far, so by the time all menu items have been calculated, we will
      * know the maximum (preferred) menu item size for that popup menu.
      * Later when it comes time to paint each menu item, we can use those
      * same accumulated max element sizes in order to layout the item.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public void paintText(SynthContext ss, Graphics g, String text,
                      Icon icon, int hAlign, int vAlign, int hTextPosition,
                      int vTextPosition, int iconTextGap, int mnemonicIndex,
                      int textOffset) {

    /**
     * Paints an icon and text. This will render the text as html, if
     * necessary, and offset the location by the insets of the component.
     *
     * @param ss SynthContext
     * @param g Graphics to render string and icon into
     * @param text Text to layout
     * @param icon Icon to layout
     * @param hAlign horizontal alignment
     * @param vAlign vertical alignment
     * @param hTextPosition horizontal text position
     * @param vTextPosition vertical text position
     * @param iconTextGap gap between icon and text
     * @param mnemonicIndex Index into text to render the mnemonic at, -1
     *        indicates no mnemonic.
     * @param textOffset Amount to offset the text when painting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public void paintText(SynthContext ss, Graphics g, String text,
                          int x, int y, int mnemonicIndex) {

    /**
     * Paints text at the specified location. This will not attempt to
     * render the text as html nor will it offset by the insets of the
     * component.
     *
     * @param ss SynthContext
     * @param g Graphics used to render string in.
     * @param text Text to render
     * @param x X location to draw text at.
     * @param y Upper left corner to draw text at.
     * @param mnemonicIndex Index to draw string at.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public void paintText(SynthContext ss, Graphics g, String text,
                          Rectangle bounds, int mnemonicIndex) {

    /**
     * Paints text at the specified location. This will not attempt to
     * render the text as html nor will it offset by the insets of the
     * component.
     *
     * @param ss SynthContext
     * @param g Graphics used to render string in.
     * @param text Text to render
     * @param bounds Bounds of the text to be drawn.
     * @param mnemonicIndex Index to draw string at.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public Dimension getPreferredSize(SynthContext ss, Font font, String text,
                      Icon icon, int hAlign, int vAlign, int hTextPosition,
                      int vTextPosition, int iconTextGap, int mnemonicIndex) {

    /**
     * Returns the preferred size needed to properly render an icon and text.
     *
     * @param ss SynthContext
     * @param font Font to use
     * @param text Text to layout
     * @param icon Icon to layout
     * @param hAlign horizontal alignment
     * @param vAlign vertical alignment
     * @param hTextPosition horizontal text position
     * @param vTextPosition vertical text position
     * @param iconTextGap gap between icon and text
     * @param mnemonicIndex Index into text to render the mnemonic at, -1
     *        indicates no mnemonic.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public int getMaximumCharHeight(SynthContext context) {

    /**
     * Returns the maximum height of the the Font from the passed in
     * SynthContext.
     *
     * @param context SynthContext used to determine font.
     * @return maximum height of the characters for the font from the passed
     *         in context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public Dimension getMaximumSize(SynthContext ss, Font font, String text,
                      Icon icon, int hAlign, int vAlign, int hTextPosition,
                      int vTextPosition, int iconTextGap, int mnemonicIndex) {

    /**
     * Returns the maximum size needed to properly render an icon and text.
     *
     * @param ss SynthContext
     * @param font Font to use
     * @param text Text to layout
     * @param icon Icon to layout
     * @param hAlign horizontal alignment
     * @param vAlign vertical alignment
     * @param hTextPosition horizontal text position
     * @param vTextPosition vertical text position
     * @param iconTextGap gap between icon and text
     * @param mnemonicIndex Index into text to render the mnemonic at, -1
     *        indicates no mnemonic.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public Dimension getMinimumSize(SynthContext ss, Font font, String text,
                      Icon icon, int hAlign, int vAlign, int hTextPosition,
                      int vTextPosition, int iconTextGap, int mnemonicIndex) {

    /**
     * Returns the minimum size needed to properly render an icon and text.
     *
     * @param ss SynthContext
     * @param font Font to use
     * @param text Text to layout
     * @param icon Icon to layout
     * @param hAlign horizontal alignment
     * @param vAlign vertical alignment
     * @param hTextPosition horizontal text position
     * @param vTextPosition vertical text position
     * @param iconTextGap gap between icon and text
     * @param mnemonicIndex Index into text to render the mnemonic at, -1
     *        indicates no mnemonic.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public int computeStringWidth(SynthContext ss, Font font,
                                  FontMetrics metrics, String text) {

    /**
     * Returns the size of the passed in string.
     *
     * @param ss SynthContext
     * @param font Font to use
     * @param metrics FontMetrics, may be ignored
     * @param text Text to get size of.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public String layoutText(SynthContext ss, FontMetrics fm,
                         String text, Icon icon, int hAlign,
                         int vAlign, int hTextPosition,
                         int vTextPosition, Rectangle viewR,
                         Rectangle iconR, Rectangle textR, int iconTextGap) {

    /**
     * Lays out text and an icon returning, by reference, the location to
     * place the icon and text.
     *
     * @param ss SynthContext
     * @param fm FontMetrics for the Font to use, this may be ignored
     * @param text Text to layout
     * @param icon Icon to layout
     * @param hAlign horizontal alignment
     * @param vAlign vertical alignment
     * @param hTextPosition horizontal text position
     * @param vTextPosition vertical text position
     * @param viewR Rectangle to layout text and icon in.
     * @param iconR Rectangle to place icon bounds in
     * @param textR Rectangle to place text in
     * @param iconTextGap gap between icon and text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public void drawLine(SynthContext context, Object paintKey,
                         Graphics g, int x1, int y1, int x2, int y2,
                         Object styleKey) {

    /**
     * Draws a line between the two end points.
     * <p>This implementation supports only one line style key,
     * <code>"dashed"</code>. The <code>"dashed"</code> line style is applied
     * only to vertical and horizontal lines.
     * <p>Specifying <code>null</code> or any key different from
     * <code>"dashed"</code> will draw solid lines.
     *
     * @param context identifies hosting region
     * @param paintKey identifies the portion of the component being asked
     *                 to paint, may be null
     * @param g Graphics object to paint to
     * @param x1 x origin
     * @param y1 y origin
     * @param x2 x destination
     * @param y2 y destination
     * @param styleKey identifies the requested style of the line (e.g. "dashed")
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public void drawLine(SynthContext context, Object paintKey,
                         Graphics g, int x1, int y1, int x2, int y2) {

    /**
     * Draws a line between the two end points.
     *
     * @param context Identifies hosting region.
     * @param paintKey Identifies the portion of the component being asked
     *                 to paint, may be null.
     * @param g Graphics object to paint to
     * @param x1 x origin
     * @param y1 y origin
     * @param x2 x destination
     * @param y2 y destination
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
    public SynthGraphicsUtils() {

    /**
     * Creates a <code>SynthGraphicsUtils</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthGraphicsUtils.java
public class SynthGraphicsUtils {

/**
 * Wrapper for primitive graphics calls.
 *
 * @since 1.5
 * @author Scott Violet
 */
