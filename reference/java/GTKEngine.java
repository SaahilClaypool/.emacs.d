_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
    void setRangeValue(SynthContext context, Region id,
                       double value, double min, double max, double visible) {

    /**
     * Sets up the GtkAdjustment values for the native GtkRange widget
     * associated with the given region (e.g. SLIDER, SCROLL_BAR).
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
    public void themeChanged() {

    /**
     * Notify native layer of theme change, and flush cache
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
    public void finishPainting(boolean useCache) {

    /**
     * Called to indicate that painting is finished. We create a new
     * BufferedImage from the offscreen buffer, (optionally) cache it,
     * and paint it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
    public void finishPainting() {

    /**
     * Convenience method that delegates to finishPainting() with
     * caching enabled.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
    public boolean paintCachedImage(Graphics g,
            int x, int y, int w, int h, Object... args) {

    /**
     * Paint a cached image identified by its size and a set of additional
     * arguments, if there's one.
     *
     * @return true if a cached image has been painted, false otherwise
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
    static WidgetType getWidgetType(JComponent c, Region id) {

    /** Translate Region and JComponent into WidgetType ordinals */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
    static enum Settings {

    /**
     * Representation of GtkSettings properties.
     * When we need more settings we can add them here and
     * to all implementations of getGTKSetting().
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
    static enum WidgetType {

    /** This enum mirrors that in gtk2_interface.h */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
    private static final int CACHE_SIZE = 50;

    /** Size of the image cache */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/gtk/GTKEngine.java
class GTKEngine {

/**
 * GTKEngine delegates all painting job to native GTK libraries.
 *
 * Painting with GTKEngine looks like this:
 * First, startPainting() is called. It prepares an offscreen buffer of the
 *   required size.
 * Then, any number of paintXXX() methods can be called. They effectively ignore
 *   the Graphics parameter and draw to the offscreen buffer.
 * Finally, finishPainting() should be called. It fills the data buffer passed
 *   in with the image data.
 *
 * @author Josh Outwater
 */
