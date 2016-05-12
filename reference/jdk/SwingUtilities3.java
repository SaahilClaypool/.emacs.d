_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
    public static RepaintManager getDelegateRepaintManager(Component
                                                            component) {

    /**
     * Returns delegate {@code RepaintManager} for {@code component} hierarchy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
    public static boolean isVsyncRequested(Container rootContainer) {

    /**
     * Checks if vsync painting is requested for {@code rootContainer}
     *
     * @param rootContainer topmost container. Should be either Window or Applet
     * @return {@code true} if vsync painting is requested for {@code rootContainer}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
    public static void setVsyncRequested(Container rootContainer,
                                         boolean isRequested) {

    /**
     * Sets vsyncRequested state for the {@code rootContainer}.  If
     * {@code isRequested} is {@code true} then vsynced
     * {@code BufferStrategy} is enabled for this {@code rootContainer}.
     *
     * Note: requesting vsynced painting does not guarantee one. The outcome
     * depends on current RepaintManager's RepaintManager.PaintManager
     * and on the capabilities of the graphics hardware/software and what not.
     *
     * @param rootContainer topmost container. Should be either {@code Window}
     *  or {@code Applet}
     * @param isRequested the value to set vsyncRequested state to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
    public static void setDelegateRepaintManager(JComponent component,
                                                RepaintManager repaintManager) {

    /**
      * Registers delegate RepaintManager for {@code JComponent}.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
public class SwingUtilities3 {

/**
 * A collection of utility methods for Swing.
 * <p>
 * <b>WARNING:</b> While this class is public, it should not be treated as
 * public API and its API may change in incompatable ways between dot dot
 * releases and even patch releases. You should not rely on this class even
 * existing.
 *
 * This is a second part of sun.swing.SwingUtilities2. It is required
 * to provide services for JavaFX applets.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
    public static RepaintManager getDelegateRepaintManager(Component
                                                            component) {

    /**
     * Returns delegate {@code RepaintManager} for {@code component} hierarchy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
    public static boolean isVsyncRequested(Container rootContainer) {

    /**
     * Checks if vsync painting is requested for {@code rootContainer}
     *
     * @param rootContainer topmost container. Should be either Window or Applet
     * @return {@code true} if vsync painting is requested for {@code rootContainer}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
    public static void setVsyncRequested(Container rootContainer,
                                         boolean isRequested) {

    /**
     * Sets vsyncRequested state for the {@code rootContainer}.  If
     * {@code isRequested} is {@code true} then vsynced
     * {@code BufferStrategy} is enabled for this {@code rootContainer}.
     *
     * Note: requesting vsynced painting does not guarantee one. The outcome
     * depends on current RepaintManager's RepaintManager.PaintManager
     * and on the capabilities of the graphics hardware/software and what not.
     *
     * @param rootContainer topmost container. Should be either {@code Window}
     *  or {@code Applet}
     * @param isRequested the value to set vsyncRequested state to
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
    public static void setDelegateRepaintManager(JComponent component,
                                                RepaintManager repaintManager) {

    /**
      * Registers delegate RepaintManager for {@code JComponent}.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/SwingUtilities3.java
public class SwingUtilities3 {

/**
 * A collection of utility methods for Swing.
 * <p>
 * <b>WARNING:</b> While this class is public, it should not be treated as
 * public API and its API may change in incompatable ways between dot dot
 * releases and even patch releases. You should not rely on this class even
 * existing.
 *
 * This is a second part of sun.swing.SwingUtilities2. It is required
 * to provide services for JavaFX applets.
 *
 */
