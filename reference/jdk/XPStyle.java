_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkin(Graphics g, int dx, int dy, int dw, int dh, State state,
                boolean borderFill) {

        /** Paint a skin at a defined position and size
         *
         * @param g   the graphics context to use for painting
         * @param dx  the destination <i>x</i> coordinate
         * @param dy  the destination <i>y</i> coordinate
         * @param dw  the width of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param dh  the height of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param state which state to paint
         * @param borderFill should test if the component uses a border fill
                            and skip painting if it is
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkinRaw(Graphics g, int dx, int dy, int dw, int dh, State state) {

        /** Paint a skin at a defined position and size. This method
         *  does not trigger animation. It is needed for the animation
         *  support.
         *
         * @param g   the graphics context to use for painting
         * @param dx  the destination <i>x</i> coordinate.
         * @param dy  the destination <i>y</i> coordinate.
         * @param dw  the width of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param dh  the height of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param state which state to paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkin(Graphics g, int dx, int dy, int dw, int dh, State state) {

        /** Paint a skin at a defined position and size
         *  This method supports animation.
         *
         * @param g   the graphics context to use for painting
         * @param dx  the destination <i>x</i> coordinate
         * @param dy  the destination <i>y</i> coordinate
         * @param dw  the width of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param dh  the height of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param state which state to paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkin(Graphics g, Rectangle r, State state) {

        /** Paint a skin in an area defined by a rectangle.
         *
         * @param g the graphics context to use for painting
         * @param r     a <code>Rectangle</code> defining the area to fill,
         *                     may cause the image to be stretched or tiled
         * @param state which state to paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkin(Graphics g, int dx, int dy, State state) {

        /** Paint a skin at x, y.
         *
         * @param g   the graphics context to use for painting
         * @param dx  the destination <i>x</i> coordinate
         * @param dy  the destination <i>y</i> coordinate
         * @param state which state to paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    static class Skin {

    /** A class which encapsulates attributes for a given part
     * (component type) and which provides methods for painting backgrounds
     * and glyphs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    synchronized Skin getSkin(Component c, Part part) {

    /** Get a <code>Skin</code> object from the current style
     * for a named part (component type)
     *
     * @param part a <code>Part</code>
     * @return a <code>Skin</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    synchronized Border getBorder(Component c, Part part) {

    /** Get a named <code>Border</code> value from the current style
     *
     * @param part a <code>Part</code>
     * @return a <code>Border</code> or null if key is not found
     *    in the current style or if the style for the particular
     *    part is not defined as "borderfill".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    synchronized Color getColor(Skin skin, Prop prop, Color fallback) {

    /** Get a named <code>Color</code> value from the current style
     *
     * @param part a <code>Part</code>
     * @return a <code>Color</code> or null if key is not found
     *    in the current style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    Insets getMargin(Component c, Part part, State state, Prop prop) {

    /** Get a named <code>Insets</code> value from the current style
     *
     * @param key a <code>String</code>
     * @return an <code>Insets</code> object or null if key is not found
     *    in the current style
     *
     * This is currently only used to create borders and by
     * WindowsInternalFrameTitlePane for painting title foregound.
     * The return value is already cached in those places.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    Point getPoint(Component c, Part part, State state, Prop prop) {

    /** Get a named <code>Point</code> (e.g. a location or an offset) value
     *  from the current style
     *
     * @param key a <code>String</code>
     * @return a <code>Point</code> or null if key is not found
     *    in the current style
     *
     * This is currently only used by WindowsInternalFrameTitlePane for painting
     * title foregound and can be removed when no longer needed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    Dimension getDimension(Component c, Part part, State state, Prop prop) {

    /** Get a named <code>Dimension</code> value from the current style
     *
     * @param key a <code>String</code>
     * @return a <code>Dimension</code> or null if key is not found
     *    in the current style
     *
     * This is currently only used by WindowsProgressBarUI and the value
     * should probably be cached there instead of here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    int getInt(Component c, Part part, State state, Prop prop, int fallback) {

    /** Get a named <code>int</code> value from the current style
     *
     * @param part a <code>Part</code>
     * @return an <code>int</code> or null if key is not found
     *    in the current style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    String getString(Component c, Part part, State state, Prop prop) {

    /** Get a named <code>String</code> value from the current style
     *
     * @param part a <code>Part</code>
     * @param state a <code>String</code>
     * @param attributeKey a <code>String</code>
     * @return a <code>String</code> or null if key is not found
     *    in the current style
     *
     * This is currently only used by WindowsInternalFrameTitlePane for painting
     * title foregound and can be removed when no longer needed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    static synchronized XPStyle getXP() {

    /** Get the singleton instance of this class
     *
     * @return the singleton instance of this class or null if XP styles
     * are not active or if this is not Windows XP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    static synchronized void invalidateStyle() {

    /** Static method for clearing the hashmap and loading the
     * current XP style and theme
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
class XPStyle {

/**
 * Implements Windows XP Styles for the Windows Look and Feel.
 *
 * @author Leif Samuelsson
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkin(Graphics g, int dx, int dy, int dw, int dh, State state,
                boolean borderFill) {

        /** Paint a skin at a defined position and size
         *
         * @param g   the graphics context to use for painting
         * @param dx  the destination <i>x</i> coordinate
         * @param dy  the destination <i>y</i> coordinate
         * @param dw  the width of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param dh  the height of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param state which state to paint
         * @param borderFill should test if the component uses a border fill
                            and skip painting if it is
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkinRaw(Graphics g, int dx, int dy, int dw, int dh, State state) {

        /** Paint a skin at a defined position and size. This method
         *  does not trigger animation. It is needed for the animation
         *  support.
         *
         * @param g   the graphics context to use for painting
         * @param dx  the destination <i>x</i> coordinate.
         * @param dy  the destination <i>y</i> coordinate.
         * @param dw  the width of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param dh  the height of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param state which state to paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkin(Graphics g, int dx, int dy, int dw, int dh, State state) {

        /** Paint a skin at a defined position and size
         *  This method supports animation.
         *
         * @param g   the graphics context to use for painting
         * @param dx  the destination <i>x</i> coordinate
         * @param dy  the destination <i>y</i> coordinate
         * @param dw  the width of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param dh  the height of the area to fill, may cause
         *                  the image to be stretched or tiled
         * @param state which state to paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkin(Graphics g, Rectangle r, State state) {

        /** Paint a skin in an area defined by a rectangle.
         *
         * @param g the graphics context to use for painting
         * @param r     a <code>Rectangle</code> defining the area to fill,
         *                     may cause the image to be stretched or tiled
         * @param state which state to paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
        void paintSkin(Graphics g, int dx, int dy, State state) {

        /** Paint a skin at x, y.
         *
         * @param g   the graphics context to use for painting
         * @param dx  the destination <i>x</i> coordinate
         * @param dy  the destination <i>y</i> coordinate
         * @param state which state to paint
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    static class Skin {

    /** A class which encapsulates attributes for a given part
     * (component type) and which provides methods for painting backgrounds
     * and glyphs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    synchronized Skin getSkin(Component c, Part part) {

    /** Get a <code>Skin</code> object from the current style
     * for a named part (component type)
     *
     * @param part a <code>Part</code>
     * @return a <code>Skin</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    synchronized Border getBorder(Component c, Part part) {

    /** Get a named <code>Border</code> value from the current style
     *
     * @param part a <code>Part</code>
     * @return a <code>Border</code> or null if key is not found
     *    in the current style or if the style for the particular
     *    part is not defined as "borderfill".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    synchronized Color getColor(Skin skin, Prop prop, Color fallback) {

    /** Get a named <code>Color</code> value from the current style
     *
     * @param part a <code>Part</code>
     * @return a <code>Color</code> or null if key is not found
     *    in the current style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    Insets getMargin(Component c, Part part, State state, Prop prop) {

    /** Get a named <code>Insets</code> value from the current style
     *
     * @param key a <code>String</code>
     * @return an <code>Insets</code> object or null if key is not found
     *    in the current style
     *
     * This is currently only used to create borders and by
     * WindowsInternalFrameTitlePane for painting title foregound.
     * The return value is already cached in those places.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    Point getPoint(Component c, Part part, State state, Prop prop) {

    /** Get a named <code>Point</code> (e.g. a location or an offset) value
     *  from the current style
     *
     * @param key a <code>String</code>
     * @return a <code>Point</code> or null if key is not found
     *    in the current style
     *
     * This is currently only used by WindowsInternalFrameTitlePane for painting
     * title foregound and can be removed when no longer needed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    Dimension getDimension(Component c, Part part, State state, Prop prop) {

    /** Get a named <code>Dimension</code> value from the current style
     *
     * @param key a <code>String</code>
     * @return a <code>Dimension</code> or null if key is not found
     *    in the current style
     *
     * This is currently only used by WindowsProgressBarUI and the value
     * should probably be cached there instead of here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    int getInt(Component c, Part part, State state, Prop prop, int fallback) {

    /** Get a named <code>int</code> value from the current style
     *
     * @param part a <code>Part</code>
     * @return an <code>int</code> or null if key is not found
     *    in the current style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    String getString(Component c, Part part, State state, Prop prop) {

    /** Get a named <code>String</code> value from the current style
     *
     * @param part a <code>Part</code>
     * @param state a <code>String</code>
     * @param attributeKey a <code>String</code>
     * @return a <code>String</code> or null if key is not found
     *    in the current style
     *
     * This is currently only used by WindowsInternalFrameTitlePane for painting
     * title foregound and can be removed when no longer needed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    static synchronized XPStyle getXP() {

    /** Get the singleton instance of this class
     *
     * @return the singleton instance of this class or null if XP styles
     * are not active or if this is not Windows XP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
    static synchronized void invalidateStyle() {

    /** Static method for clearing the hashmap and loading the
     * current XP style and theme
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/windows/XPStyle.java
class XPStyle {

/**
 * Implements Windows XP Styles for the Windows Look and Feel.
 *
 * @author Leif Samuelsson
 */
