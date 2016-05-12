_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
        private void repaintIfBackgroundsDiffer(JComponent comp) {

        /**
         * This is a support method that will check if the background colors of
         * the specified component differ between focused and unfocused states.
         * If the color differ the component will then repaint itself.
         *
         * @comp the component to check
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
        private static synchronized boolean isUpdatePending() {

        /**
         * Returns true if a UI update is pending.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
        private static synchronized void setUpdatePending(boolean update) {

        /**
         * Sets whether or not an updateUI call is pending.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
        private static boolean updatePending;

        /**
         * Indicates if an updateUI call is pending.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
        private static void updateAllUIs() {

        /**
         * Updates the UIs of all the known Frames.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
        private static void updateWindowUI(Window window) {

        /**
         * Updates the UI of the passed in window and all its children.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    private static Object getAATextInfo() {

    /**
     * Returns the antialiasing information as specified by the host desktop.
     * Antialiasing might be forced off if the desktop is GNOME and the user
     * has set his locale to Chinese, Japanese or Korean. This is consistent
     * with what GTK does. See com.sun.java.swing.plaf.gtk.GtkLookAndFeel
     * for more information about CJK and antialiased fonts.
     *
     * @return the text antialiasing information associated to the desktop
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    protected boolean shouldUpdateStyleOnEvent(PropertyChangeEvent ev) {

    /**
     * Returns whether or not the UIs should update their styles when a
     * particular event occurs.
     *
     * @param ev a {@code PropertyChangeEvent}
     * @return whether or not the UIs should update their styles
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public boolean shouldUpdateStyleOnAncestorChanged() {

    /**
     * Returns whether or not the UIs should update their
     * <code>SynthStyles</code> from the <code>SynthStyleFactory</code>
     * when the ancestor of the <code>JComponent</code> changes. A subclass
     * that provided a <code>SynthStyleFactory</code> that based the
     * return value from <code>getStyle</code> off the containment hierarchy
     * would override this method to return true.
     *
     * @return whether or not the UIs should update their
     * <code>SynthStyles</code> from the <code>SynthStyleFactory</code>
     * when the ancestor changed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    @Override

    /**
     * Return a string that identifies this look and feel.
     *
     * @return a short string identifying this look and feel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    @Override

    /**
     * Return a short string that identifies this look and feel.
     *
     * @return a short string identifying this look and feel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    @Override

    /**
     * Returns a textual description of SynthLookAndFeel.
     *
     * @return textual description of synth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    @Override

    /**
     * Returns false, SynthLookAndFeel is not a native look and feel.
     *
     * @return false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    @Override

    /**
     * Returns true, SynthLookAndFeel is always supported.
     *
     * @return true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    @Override

    /**
     * Returns the defaults for this SynthLookAndFeel.
     *
     * @return Defaults table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    @Override

    /**
     * Called by UIManager when this look and feel is uninstalled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    @Override

    /**
     * Called by UIManager when this look and feel is installed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public void load(URL url) throws ParseException, IOException {

    /**
     * Loads the set of <code>SynthStyle</code>s that will be used by
     * this <code>SynthLookAndFeel</code>. Path based resources are resolved
     * relatively to the specified <code>URL</code> of the style. For example
     * an <code>Image</code> would be resolved by
     * <code>new URL(synthFile, path)</code>. Refer to
     * <a href="doc-files/synthFileFormat.html">Synth File Format</a> for more
     * information.
     *
     * @param url the <code>URL</code> to load the set of
     *     <code>SynthStyle</code> from
     * @throws ParseException if there is an error in parsing
     * @throws IllegalArgumentException if synthSet is <code>null</code>
     * @throws IOException if synthSet cannot be opened as an <code>InputStream</code>
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public void load(InputStream input, Class<?> resourceBase) throws

    /**
     * Loads the set of <code>SynthStyle</code>s that will be used by
     * this <code>SynthLookAndFeel</code>. <code>resourceBase</code> is
     * used to resolve any path based resources, for example an
     * <code>Image</code> would be resolved by
     * <code>resourceBase.getResource(path)</code>. Refer to
     * <a href="doc-files/synthFileFormat.html">Synth File Format</a>
     * for more information.
     *
     * @param input InputStream to load from
     * @param resourceBase used to resolve any images or other resources
     * @throws ParseException if there is an error in parsing
     * @throws IllegalArgumentException if input or resourceBase is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public SynthLookAndFeel() {

    /**
     * Creates a SynthLookAndFeel.
     * <p>
     * For the returned <code>SynthLookAndFeel</code> to be useful you need to
     * invoke <code>load</code> to specify the set of
     * <code>SynthStyle</code>s, or invoke <code>setStyleFactory</code>.
     *
     * @see #load
     * @see #setStyleFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public static ComponentUI createUI(JComponent c) {

    /**
     * Creates the Synth look and feel <code>ComponentUI</code> for
     * the passed in <code>JComponent</code>.
     *
     * @param c JComponent to create the <code>ComponentUI</code> for
     * @return ComponentUI to use for <code>c</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    static Object getUIOfType(ComponentUI ui, Class klass) {

    /**
     * Returns the ui that is of type <code>klass</code>, or null if
     * one can not be found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    static void updateSubregion(SynthContext state, Graphics g,
                                Rectangle bounds) {

    /**
     * A convenience method that handles painting of the background for
     * subregions. All SynthUI's that have subregions should invoke
     * this method, than paint the foreground.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    static void update(SynthContext state, Graphics g) {

    /**
     * A convenience method that handles painting of the background.
     * All SynthUI implementations should override update and invoke
     * this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    static Insets getPaintingInsets(SynthContext state, Insets insets) {

    /**
     * A convenience method to return where the foreground should be
     * painted for the Component identified by the passed in
     * AbstractSynthContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public static Region getRegion(JComponent c) {

    /**
     * Returns the Region for the JComponent <code>c</code>.
     *
     * @param c JComponent to fetch the Region for
     * @return Region corresponding to <code>c</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public static void updateStyles(Component c) {

    /**
     * Updates the style associated with <code>c</code>, and all its children.
     * This is a lighter version of
     * <code>SwingUtilities.updateComponentTreeUI</code>.
     *
     * @param c Component to update style for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    static SynthStyle updateStyle(SynthContext context, SynthUI ui) {

    /**
     * A convience method that will reset the Style of StyleContext if
     * necessary.
     *
     * @return newStyle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    static boolean shouldUpdateStyle(PropertyChangeEvent event) {

    /**
     * Returns true if the Style should be updated in response to the
     * specified PropertyChangeEvent. This forwards to
     * <code>shouldUpdateStyleOnAncestorChanged</code> as necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public static SynthStyle getStyle(JComponent c, Region region) {

    /**
     * Gets a SynthStyle for the specified region of the specified component.
     * This is not for general consumption, only custom UIs should call this
     * method.
     *
     * @param c JComponent to get the SynthStyle for
     * @param region Identifies the region of the specified component
     * @return SynthStyle to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    static int getComponentState(Component c) {

    /**
     * Returns the component state for the specified component. This should
     * only be used for Components that don't have any special state beyond
     * that of ENABLED, DISABLED or FOCUSED. For example, buttons shouldn't
     * call into this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public static SynthStyleFactory getStyleFactory() {

    /**
     * Returns the current SynthStyleFactory.
     *
     * @return SynthStyleFactory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    public static void setStyleFactory(SynthStyleFactory cache) {

    /**
     * Sets the SynthStyleFactory that the UI classes provided by
     * synth will use to obtain a SynthStyle.
     *
     * @param cache SynthStyleFactory the UIs should use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    static void resetSelectedUI() {

    /**
     * Clears out the selected UI that was last set in setSelectedUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    static void setSelectedUI(ComponentUI uix, boolean selected,
                              boolean focused, boolean enabled,
                              boolean rollover) {

    /**
     * Used by the renderers. For the most part the renderers are implemented
     * as Labels, which is problematic in so far as they are never selected.
     * To accommodate this SynthLabelUI checks if the current
     * UI matches that of <code>selectedUI</code> (which this methods sets), if
     * it does, then a state as set by this method is returned. This provides
     * a way for labels to have a state other than selected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    private Map<String, Object> defaultsMap;

    /**
     * Map of defaults table entries. This is populated via the load
     * method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    private SynthStyleFactory factory;

    /**
     * SynthStyleFactory for the this SynthLookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    private static SynthStyleFactory lastFactory;

    /**
     * The last SynthStyleFactory that was asked for from AppContext
     * <code>lastContext</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    private static final Object SELECTED_UI_STATE_KEY = new StringBuilder("selectedUIState");

    /**
     * AppContext key to get selectedUIState.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    private static final Object SELECTED_UI_KEY = new StringBuilder("selectedUI");

    /**
     * AppContext key to get selectedUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
    private static final Object STYLE_FACTORY_KEY =

    /**
     * AppContext key to get the current SynthStyleFactory.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthLookAndFeel.java
public class SynthLookAndFeel extends BasicLookAndFeel {

/**
 * SynthLookAndFeel provides the basis for creating a customized look and
 * feel. SynthLookAndFeel does not directly provide a look, all painting is
 * delegated.
 * You need to either provide a configuration file, by way of the
 * {@link #load} method, or provide your own {@link SynthStyleFactory}
 * to {@link #setStyleFactory}. Refer to the
 * <a href="package-summary.html">package summary</a> for an example of
 * loading a file, and {@link javax.swing.plaf.synth.SynthStyleFactory} for
 * an example of providing your own <code>SynthStyleFactory</code> to
 * <code>setStyleFactory</code>.
 * <p>
 * <strong>Warning:</strong>
 * This class implements {@link Serializable} as a side effect of it
 * extending {@link BasicLookAndFeel}. It is not intended to be serialized.
 * An attempt to serialize it will
 * result in {@link NotSerializableException}.
 *
 * @serial exclude
 * @since 1.5
 * @author Scott Violet
 */
