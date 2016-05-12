_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    static DebugGraphicsInfo info() {

    /** Returns DebugGraphicsInfo, or creates one if none exists.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    private Graphics debugGraphics() {

    /** Returns a DebugGraphics for use in buffering window.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    static int debugComponentCount() {

    /** Returns the number of JComponents that have debugging options turned
      * on.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    static int shouldComponentDebug(JComponent component) {

    /** Returns non-zero if <b>component</b> should display with DebugGraphics,
      * zero otherwise. Walks the JComponent's parent tree to determine if
      * any debugging options have been set.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    static int getDebugOptions(JComponent component) {

    /** Static wrapper method for DebugGraphicsInfo.getDebugOptions().
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    static void setDebugOptions(JComponent component, int options) {

    /** Static wrapper method for DebugGraphicsInfo.setDebugOptions(). Stores
      * options on a per component basis.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public int getDebugOptions() {

    /** Returns the current debugging options for this DebugGraphics.
      * @see #setDebugOptions
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void setDebugOptions(int options) {

    /** Enables/disables diagnostic information about every graphics
      * operation. The value of <b>options</b> indicates how this information
      * should be displayed. LOG_OPTION causes a text message to be printed.
      * FLASH_OPTION causes the drawing to flash several times. BUFFERED_OPTION
      * creates a new Frame that shows each operation on an
      * offscreen buffer. The value of <b>options</b> is bitwise OR'd into
      * the current value. To disable debugging use NONE_OPTION.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public boolean isDrawingBuffer() {

    /**
     * Returns the drawingBuffer value.
     *
     * @return true if this object is drawing from a Buffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void dispose() {

    /**
     * Overrides <code>Graphics.dispose</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void copyArea(int x, int y, int width, int height,
                         int destX, int destY) {

    /**
     * Overrides <code>Graphics.copyArea</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public boolean drawImage(Image img,
                             int dx1, int dy1, int dx2, int dy2,
                             int sx1, int sy1, int sx2, int sy2,
                             Color bgcolor,
                             ImageObserver observer) {

    /**
     * Overrides <code>Graphics.drawImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public boolean drawImage(Image img,
                             int dx1, int dy1, int dx2, int dy2,
                             int sx1, int sy1, int sx2, int sy2,
                             ImageObserver observer) {

    /**
     * Overrides <code>Graphics.drawImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public boolean drawImage(Image img, int x, int y,int width, int height,
                             Color bgcolor,
                             ImageObserver observer) {

    /**
     * Overrides <code>Graphics.drawImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public boolean drawImage(Image img, int x, int y,
                             Color bgcolor,
                             ImageObserver observer) {

    /**
     * Overrides <code>Graphics.drawImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public boolean drawImage(Image img, int x, int y, int width, int height,
                             ImageObserver observer) {

    /**
     * Overrides <code>Graphics.drawImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public boolean drawImage(Image img, int x, int y,
                             ImageObserver observer) {

    /**
     * Overrides <code>Graphics.drawImage</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawChars(char data[], int offset, int length, int x, int y) {

    /**
     * Overrides <code>Graphics.drawChars</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawBytes(byte data[], int offset, int length, int x, int y) {

    /**
     * Overrides <code>Graphics.drawBytes</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawString(AttributedCharacterIterator iterator, int x, int y) {

    /**
     * Overrides <code>Graphics.drawString</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawString(String aString, int x, int y) {

    /**
     * Overrides <code>Graphics.drawString</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void fillPolygon(int xPoints[], int yPoints[], int nPoints) {

    /**
     * Overrides <code>Graphics.fillPolygon</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawPolygon(int xPoints[], int yPoints[], int nPoints) {

    /**
     * Overrides <code>Graphics.drawPolygon</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawPolyline(int xPoints[], int yPoints[], int nPoints) {

    /**
     * Overrides <code>Graphics.drawPolyline</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void fillArc(int x, int y, int width, int height,
                        int startAngle, int arcAngle) {

    /**
     * Overrides <code>Graphics.fillArc</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawArc(int x, int y, int width, int height,
                        int startAngle, int arcAngle) {

    /**
     * Overrides <code>Graphics.drawArc</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void fillOval(int x, int y, int width, int height) {

    /**
     * Overrides <code>Graphics.fillOval</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawOval(int x, int y, int width, int height) {

    /**
     * Overrides <code>Graphics.drawOval</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void fill3DRect(int x, int y, int width, int height,
                           boolean raised) {

    /**
     * Overrides <code>Graphics.fill3DRect</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void draw3DRect(int x, int y, int width, int height,
                           boolean raised) {

    /**
     * Overrides <code>Graphics.draw3DRect</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawLine(int x1, int y1, int x2, int y2) {

    /**
     * Overrides <code>Graphics.drawLine</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void fillRoundRect(int x, int y, int width, int height,
                              int arcWidth, int arcHeight) {

    /**
     * Overrides <code>Graphics.fillRoundRect</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawRoundRect(int x, int y, int width, int height,
                              int arcWidth, int arcHeight) {

    /**
     * Overrides <code>Graphics.drawRoundRect</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void clearRect(int x, int y, int width, int height) {

    /**
     * Overrides <code>Graphics.clearRect</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void fillRect(int x, int y, int width, int height) {

    /**
     * Overrides <code>Graphics.fillRect</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void drawRect(int x, int y, int width, int height) {

    /**
     * Overrides <code>Graphics.drawRect</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void setClip(Shape clip) {

    /**
     * Overrides <code>Graphics.setClip</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public Shape getClip() {

    /**
     * Overrides <code>Graphics.getClip</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void setClip(int x, int y, int width, int height) {

    /**
     * Overrides <code>Graphics.setClip</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void clipRect(int x, int y, int width, int height) {

    /**
     * Overrides <code>Graphics.clipRect</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public Rectangle getClipBounds() {

    /**
     * Overrides <code>Graphics.getClipBounds</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void setXORMode(Color aColor) {

    /**
     * Overrides <code>Graphics.setXORMode</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void setPaintMode() {

    /**
     * Overrides <code>Graphics.setPaintMode</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void translate(int x, int y) {

    /**
     * Overrides <code>Graphics.translate</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public FontMetrics getFontMetrics(Font f) {

    /**
     * Overrides <code>Graphics.getFontMetrics</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public FontMetrics getFontMetrics() {

    /**
     * Overrides <code>Graphics.getFontMetrics</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public Color getColor() {

    /** Returns the Color used for text drawing operations.
      * @see #setColor
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void setColor(Color aColor) {

    /** Sets the color to be used for drawing and filling lines and shapes.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public Font getFont() {

    /** Returns the Font used for text drawing operations.
      * @see #setFont
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public void setFont(Font aFont) {

    /** Sets the Font used for text drawing operations.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static java.io.PrintStream logStream() {

    /** Returns the stream to which the DebugGraphics logs drawing operations.
      * @see #setLogStream
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static void setLogStream(java.io.PrintStream stream) {

    /** Sets the stream to which the DebugGraphics logs drawing operations.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static int flashCount() {

    /** Returns the number of times that drawing operations will flash.
      * @see #setFlashCount
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static void setFlashCount(int flashCount) {

    /**
     * Sets the number of times that drawing operations will flash.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static int flashTime() {

    /**
     * Returns the time delay of drawing operation flashing.
     * @see #setFlashTime
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static void setFlashTime(int flashTime) {

    /**
     * Sets the time delay of drawing operation flashing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static Color flashColor() {

    /**
     * Returns the Color used to flash drawing operations.
     * @see #setFlashColor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static void setFlashColor(Color flashColor) {

    /**
     * Sets the Color used to flash drawing operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public Graphics create(int x, int y, int width, int height) {

    /**
     * Overrides <code>Graphics.create</code> to return a DebugGraphics object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public Graphics create() {

    /**
     * Overrides <code>Graphics.create</code> to return a DebugGraphics object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public DebugGraphics(Graphics graphics) {

    /**
     * Constructs a debug graphics context from an existing graphics
     * context that supports slowed down drawing.
     *
     * @param graphics  the Graphics context to slow down
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public DebugGraphics(Graphics graphics, JComponent component) {

    /**
     * Constructs a debug graphics context from an existing graphics
     * context that slows down drawing for the specified component.
     *
     * @param graphics  the Graphics context to slow down
     * @param component the JComponent to draw slowly
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public DebugGraphics() {

    /**
     * Constructs a new debug graphics context that supports slowed
     * down drawing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static final int     BUFFERED_OPTION = 1 << 2;

    /** Show buffered operations in a separate <code>Frame</code>. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
    public static final int     LOG_OPTION   = 1 << 0;

    /** Log graphics operations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DebugGraphics.java
public class DebugGraphics extends Graphics {

/**
 * Graphics subclass supporting graphics debugging. Overrides most methods
 * from Graphics.  DebugGraphics objects are rarely created by hand.  They
 * are most frequently created automatically when a JComponent's
 * debugGraphicsOptions are changed using the setDebugGraphicsOptions()
 * method.
 * <p>
 * NOTE: You must turn off double buffering to use DebugGraphics:
 *       RepaintManager repaintManager = RepaintManager.currentManager(component);
 *       repaintManager.setDoubleBufferingEnabled(false);
 *
 * @see JComponent#setDebugGraphicsOptions
 * @see RepaintManager#currentManager
 * @see RepaintManager#setDoubleBufferingEnabled
 *
 * @author Dave Karlton
 */
