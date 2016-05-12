_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    static class GTKLazyValue implements UIDefaults.LazyValue {

    /**
     * GTKLazyValue is a slimmed down version of <code>ProxyLaxyValue</code>.
     * The code is duplicate so that it can get at the package private
     * classes in gtk.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static class GTKStockIcon extends SynthIcon {

    /**
     * An Icon that is fetched using getStockIcon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
        public static int getIconType(String size) {

        /**
         * Return icon type (GtkIconSize value) given a symbolic name which can
         * occur in a theme file.
         *
         * @param size symbolic name, e.g. gtk-button
         * @return icon type. Valid types are 1 to 6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
        public static void setIconSize(int type, int w, int h) {

        /**
         * Change icon size in a type to size mapping. This is called by code
         * that parses the gtk-icon-sizes setting
         *
         * @param type icon type (GtkIconSize value)
         * @param w the new icon width
         * @param h the new icon height
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
        public static Dimension getIconSize(int type) {

        /**
         * Return the size of a particular icon type (logical size)
         *
         * @param type icon type (GtkIconSize value)
         * @return a Dimension object, or null if lsize is invalid
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    @Override

    /**
     * Returns the value to initialize the opacity property of the Component
     * to. A Style should NOT assume the opacity will remain this value, the
     * developer may reset it or override it.
     *
     * @param context SynthContext identifying requestor
     * @return opaque Whether or not the JComponent is opaque.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    boolean getClassSpecificBoolValue(SynthContext context, String key,
                                      boolean defaultValue)

    /**
     * Convenience method to get a class specific Boolean value.
     *
     * @param context SynthContext identifying requestor
     * @param key Key identifying class specific value
     * @param defaultValue Returned if there is no value for the specified
     *        type
     * @return Value, or defaultValue if <code>key</code> is not defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    Insets getClassSpecificInsetsValue(SynthContext context, String key,
                                       Insets defaultValue)

    /**
     * Convenience method to get a class specific Insets value.
     *
     * @param context SynthContext identifying requestor
     * @param key Key identifying class specific value
     * @param defaultValue Returned if there is no value for the specified
     *        type
     * @return Value, or defaultValue if <code>key</code> is not defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    int getClassSpecificIntValue(SynthContext context, String key,
                                 int defaultValue)

    /**
     * Convenience method to get a class specific integer value.
     *
     * @param context SynthContext identifying requestor
     * @param key Key identifying class specific value
     * @param defaultValue Returned if there is no value for the specified
     *        type
     * @return Value, or defaultValue if <code>key</code> is not defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    Object getClassSpecificValue(String key) {

    /**
     * Returns the value for a class specific property. A class specific value
     * is a value that will be picked up based on class hierarchy.
     *
     * @param key Key identifying class specific value
     * @return Value, or null if one has not been defined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static int getClassSpecificIntValue(WidgetType wt, String key,
                                                int defaultValue)

    /**
     * Convenience method to get a class specific integer value for
     * a particular WidgetType.
     *
     * @param wt WidgetType for which to fetch the value
     * @param key Key identifying class specific value
     * @param defaultValue Returned if there is no value for the specified
     *        type
     * @return Value, or defaultValue if <code>key</code> is not defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static Object getClassSpecificValue(WidgetType wt, String key) {

    /**
     * Returns the value for a class specific property for a particular
     * WidgetType.  This method is useful in those cases where we need to
     * fetch a value for a Region that is not associated with the component
     * currently in use (e.g. we need to figure out the insets for a
     * SCROLL_BAR, but certain values can only be extracted from a
     * SCROLL_PANE region).
     *
     * @param wt WidgetType for which to fetch the value
     * @param key Key identifying class specific value
     * @return Value, or null if one has not been defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    @Override

    /**
     * Returns the Insets. If <code>insets</code> is non-null the resulting
     * insets will be placed in it, otherwise a new Insets object will be
     * created and returned.
     *
     * @param context SynthContext identifying requestor
     * @param insets Where to place Insets
     * @return Insets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    int getYThickness() {

    /**
     * Returns the Y thickness to use for this GTKStyle.
     *
     * @return y thickness.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    int getXThickness() {

    /**
     * Returns the X thickness to use for this GTKStyle.
     *
     * @return x thickness.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    Color getGTKColor(SynthContext context, int state, ColorType type) {

    /**
     * Returns the color for the specified state.
     *
     * @param context SynthContext identifying requestor
     * @param state to get the color for
     * @param type of the color
     * @return Color to render with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private Color getStyleSpecificColor(SynthContext context, int state,
                                        ColorType type)

    /**
     * Returns color specific to the current style. This method is
     * invoked when other variants don't fit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    @Override

    /**
     * Returns a <code>SynthPainter</code> that will route the appropriate
     * calls to a <code>GTKEngine</code>.
     *
     * @param state SynthContext identifying requestor
     * @return SynthPainter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private final int xThickness, yThickness;

    /** The x/y thickness values for this particular style. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private final int widgetType;

    /** Widget type used when looking up class specific values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private final Font font;

    /**
     * The font used for this particular style, as determined at
     * construction time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static final Map<String,GTKStockIcon> ICONS_MAP;

    /**
     * Backing style properties that are used if the style does not
     * defined the property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static final Map<String,String> CLASS_SPECIFIC_MAP;

    /**
     * Maps from a key that is passed to Style.get to the equivalent class
     * specific key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
class GTKStyle extends SynthStyle implements GTKConstants {

/**
 *
 * @author Scott Violet
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    static class GTKLazyValue implements UIDefaults.LazyValue {

    /**
     * GTKLazyValue is a slimmed down version of <code>ProxyLaxyValue</code>.
     * The code is duplicate so that it can get at the package private
     * classes in gtk.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static class GTKStockIcon extends SynthIcon {

    /**
     * An Icon that is fetched using getStockIcon.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
        public static int getIconType(String size) {

        /**
         * Return icon type (GtkIconSize value) given a symbolic name which can
         * occur in a theme file.
         *
         * @param size symbolic name, e.g. gtk-button
         * @return icon type. Valid types are 1 to 6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
        public static void setIconSize(int type, int w, int h) {

        /**
         * Change icon size in a type to size mapping. This is called by code
         * that parses the gtk-icon-sizes setting
         *
         * @param type icon type (GtkIconSize value)
         * @param w the new icon width
         * @param h the new icon height
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
        public static Dimension getIconSize(int type) {

        /**
         * Return the size of a particular icon type (logical size)
         *
         * @param type icon type (GtkIconSize value)
         * @return a Dimension object, or null if lsize is invalid
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    @Override

    /**
     * Returns the value to initialize the opacity property of the Component
     * to. A Style should NOT assume the opacity will remain this value, the
     * developer may reset it or override it.
     *
     * @param context SynthContext identifying requestor
     * @return opaque Whether or not the JComponent is opaque.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    boolean getClassSpecificBoolValue(SynthContext context, String key,
                                      boolean defaultValue)

    /**
     * Convenience method to get a class specific Boolean value.
     *
     * @param context SynthContext identifying requestor
     * @param key Key identifying class specific value
     * @param defaultValue Returned if there is no value for the specified
     *        type
     * @return Value, or defaultValue if <code>key</code> is not defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    Insets getClassSpecificInsetsValue(SynthContext context, String key,
                                       Insets defaultValue)

    /**
     * Convenience method to get a class specific Insets value.
     *
     * @param context SynthContext identifying requestor
     * @param key Key identifying class specific value
     * @param defaultValue Returned if there is no value for the specified
     *        type
     * @return Value, or defaultValue if <code>key</code> is not defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    int getClassSpecificIntValue(SynthContext context, String key,
                                 int defaultValue)

    /**
     * Convenience method to get a class specific integer value.
     *
     * @param context SynthContext identifying requestor
     * @param key Key identifying class specific value
     * @param defaultValue Returned if there is no value for the specified
     *        type
     * @return Value, or defaultValue if <code>key</code> is not defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    Object getClassSpecificValue(String key) {

    /**
     * Returns the value for a class specific property. A class specific value
     * is a value that will be picked up based on class hierarchy.
     *
     * @param key Key identifying class specific value
     * @return Value, or null if one has not been defined.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static int getClassSpecificIntValue(WidgetType wt, String key,
                                                int defaultValue)

    /**
     * Convenience method to get a class specific integer value for
     * a particular WidgetType.
     *
     * @param wt WidgetType for which to fetch the value
     * @param key Key identifying class specific value
     * @param defaultValue Returned if there is no value for the specified
     *        type
     * @return Value, or defaultValue if <code>key</code> is not defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static Object getClassSpecificValue(WidgetType wt, String key) {

    /**
     * Returns the value for a class specific property for a particular
     * WidgetType.  This method is useful in those cases where we need to
     * fetch a value for a Region that is not associated with the component
     * currently in use (e.g. we need to figure out the insets for a
     * SCROLL_BAR, but certain values can only be extracted from a
     * SCROLL_PANE region).
     *
     * @param wt WidgetType for which to fetch the value
     * @param key Key identifying class specific value
     * @return Value, or null if one has not been defined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    @Override

    /**
     * Returns the Insets. If <code>insets</code> is non-null the resulting
     * insets will be placed in it, otherwise a new Insets object will be
     * created and returned.
     *
     * @param context SynthContext identifying requestor
     * @param insets Where to place Insets
     * @return Insets.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    int getYThickness() {

    /**
     * Returns the Y thickness to use for this GTKStyle.
     *
     * @return y thickness.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    int getXThickness() {

    /**
     * Returns the X thickness to use for this GTKStyle.
     *
     * @return x thickness.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    Color getGTKColor(SynthContext context, int state, ColorType type) {

    /**
     * Returns the color for the specified state.
     *
     * @param context SynthContext identifying requestor
     * @param state to get the color for
     * @param type of the color
     * @return Color to render with
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private Color getStyleSpecificColor(SynthContext context, int state,
                                        ColorType type)

    /**
     * Returns color specific to the current style. This method is
     * invoked when other variants don't fit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    @Override

    /**
     * Returns a <code>SynthPainter</code> that will route the appropriate
     * calls to a <code>GTKEngine</code>.
     *
     * @param state SynthContext identifying requestor
     * @return SynthPainter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private final int xThickness, yThickness;

    /** The x/y thickness values for this particular style. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private final int widgetType;

    /** Widget type used when looking up class specific values. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private final Font font;

    /**
     * The font used for this particular style, as determined at
     * construction time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static final Map<String,GTKStockIcon> ICONS_MAP;

    /**
     * Backing style properties that are used if the style does not
     * defined the property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
    private static final Map<String,String> CLASS_SPECIFIC_MAP;

    /**
     * Maps from a key that is passed to Style.get to the equivalent class
     * specific key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyle.java
class GTKStyle extends SynthStyle implements GTKConstants {

/**
 *
 * @author Scott Violet
 */
