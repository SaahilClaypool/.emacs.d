_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    private class DefaultsListener implements PropertyChangeListener {

    /**
     * Listener to update derived colors on UIManager Defaults changes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
            colorTree.addColor(uin, color);

            color.rederiveColor(); /// move to ARP.decodeColor() ?
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    public DerivedColor getDerivedColor(String parentUin,
                                        float hOffset, float sOffset,
                                        float bOffset, int aOffset,
                                        boolean uiResource){

    /**
     * Get a derived color, derived colors are shared instances and will be
     * updated when its parent UIDefault color changes.
     *
     * @param uiDefaultParentName The parent UIDefault key
     * @param hOffset The hue offset
     * @param sOffset The saturation offset
     * @param bOffset The brightness offset
     * @param aOffset The alpha offset
     * @param uiResource True if the derived color should be a UIResource,
     *        false if it should not be a UIResource
     * @return The stored derived color
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
        private List<String> split(String prefix) {

        /**
         * Given some dot separated prefix, split on the colons that are
         * not within quotes, and not within brackets.
         *
         * @param prefix
         * @return
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
        boolean matches(JComponent c) {

        /**
         * This LazyStyle is a match for the given component if, and only if,
         * for each part of the prefix the component hierarchy matches exactly.
         * That is, if given "a":something:"b", then:
         * c.getName() must equals "b"
         * c.getParent() can be anything
         * c.getParent().getParent().getName() must equal "a".
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
        SynthStyle getStyle(JComponent c, Region r) {

        /**
         * Gets the style. Creates it if necessary.
         * @return the style
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
        private LazyStyle(String prefix) {

        /**
         * Create a new LazyStyle.
         *
         * @param prefix The prefix associated with this style. Cannot be null.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
        private NimbusStyle style;

        /**
         * Cached shared style.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
        private boolean simple = true;

        /**
         * Whether or not this LazyStyle represents an unnamed component
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    private final class LazyStyle {

    /**
     * A class which creates the NimbusStyle associated with it lazily, but also
     * manages a lot more information about the style. It is less of a LazyValue
     * type of class, and more of an Entry or Item type of class, as it
     * represents an entry in the list of LazyStyles in the map m.
     *
     * The primary responsibilities of this class include:
     * <ul>
     *   <li>Determining whether a given component/region pair matches this
     *       style</li>
     *   <li>Splitting the prefix specified in the constructor into its
     *       constituent parts to facilitate quicker matching</li>
     *   <li>Creating and vending a NimbusStyle lazily.</li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    private static final class LazyPainter implements UIDefaults.LazyValue {

    /**
     * This class is private because it relies on the constructor of the
     * auto-generated AbstractRegionPainter subclasses. Hence, it is not
     * generally useful, and is private.
     * <p/>
     * LazyPainter is a LazyValue class. It will create the
     * AbstractRegionPainter lazily, when asked. It uses reflection to load the
     * proper class and invoke its constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
        @Override

        /**
         * @inheritDoc
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
        public DerivedFont(String key, float sizeOffset, Boolean bold,
                           Boolean italic) {

        /**
         * Create a new DerivedFont.
         *
         * @param key The UIDefault key associated with this derived font's
         *            parent or source. If this key leads to a null value, or a
         *            value that is not a font, then null will be returned as
         *            the derived font. The key must not be null.
         * @param sizeOffset The size offset, as a percentage, to use. For
         *                   example, if the source font was a 12pt font and the
         *                   sizeOffset were specified as .9, then the new font
         *                   will be 90% of what the source font was, or, 10.8
         *                   pts which is rounded to 11pts. This fractional
         *                   based offset allows for proper font scaling in high
         *                   DPI or large system font scenarios.
         * @param bold Whether the new font should be bold. If null, then this
         *             new font will inherit the bold setting of the source
         *             font.
         * @param italic Whether the new font should be italicized. If null,
         *               then this new font will inherit the italic setting of
         *               the source font.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    static final class DerivedFont implements UIDefaults.ActiveValue {

    /**
     * <p>Derives its font value based on a parent font and a set of offsets and
     * attributes. This class is an ActiveValue, meaning that it will recompute
     * its value each time it is requested from UIDefaults. It is therefore
     * recommended to read this value once and cache it in the UI delegate class
     * until asked to reinitialize.</p>
     *
     * <p>To use this class, create an instance with the key of the font in the
     * UI defaults table from which to derive this font, along with a size
     * offset (if any), and whether it is to be bold, italic, or left in its
     * default form.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    SynthStyle getStyle(JComponent comp, Region r) {

    /**
     * <p>Locate the style associated with the given region, and component.
     * This is called from NimbusLookAndFeel in the SynthStyleFactory
     * implementation.</p>
     *
     * <p>Lookup occurs as follows:<br/>
     * Check the map of styles <code>m</code>. If the map contains no styles at
     * all, then simply return the defaultStyle. If the map contains styles,
     * then iterate over all of the styles for the Region <code>r</code> looking
     * for the best match, based on prefix. If a match was made, then return
     * that SynthStyle. Otherwise, return the defaultStyle.</p>
     *
     * @param comp The component associated with this region. For example, if
     *        the Region is Region.Button then the component will be a JButton.
     *        If the Region is a subregion, such as ScrollBarThumb, then the
     *        associated component will be the component that subregion belongs
     *        to, such as JScrollBar. The JComponent may be named. It may not be
     *        null.
     * @param r The region we are looking for a style for. May not be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    void register(Region region, String prefix) {

    /**
     * <p>Registers the given region and prefix. The prefix, if it contains
     * quoted sections, refers to certain named components. If there are not
     * quoted sections, then the prefix refers to a generic component type.</p>
     *
     * <p>If the given region/prefix combo has already been registered, then
     * it will not be registered twice. The second registration attempt will
     * fail silently.</p>
     *
     * @param region The Synth Region that is being registered. Such as Button,
     *        or ScrollBarThumb.
     * @param prefix The UIDefault prefix. For example, could be ComboBox, or if
     *        a named components, "MyComboBox", or even something like
     *        ToolBar:"MyComboBox":"ComboBox.arrowButton"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    void initializeDefaults(UIDefaults d) {

    /**
     * Called from NimbusLookAndFeel to initialize the UIDefaults.
     *
     * @param d UIDefaults table to initialize. This will never be null.
     *          If listeners are attached to <code>d</code>, then you will
     *          only receive notification of LookAndFeel level defaults, not
     *          all defaults on the UIManager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    NimbusDefaults() {

    /**
     * Create a new NimbusDefaults. This constructor is only called from
     * within NimbusLookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    void uninitialize() {

    /** Called by UIManager when this look and feel is uninstalled. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    void initialize() {

    /** Called by UIManager when this look and feel is installed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    private DefaultsListener defaultsListener = new DefaultsListener();

    /** Listener for changes to user defaults table */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    private DefaultSynthStyle defaultStyle;

    /**
     * Our fallback style to avoid NPEs if the proper style cannot be found in
     * this class. Not sure if relying on DefaultSynthStyle is the best choice.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
    private Map<String, Region> registeredRegions =

    /**
     * A map of regions which have been registered.
     * This mapping is maintained so that the Region can be found based on
     * prefix in a very fast manner. This is used in the "matches" method of
     * LazyStyle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/NimbusDefaults.java
final class NimbusDefaults {

/**
 * This class contains all the implementation details related to
 * Nimbus. It contains all the code for initializing the UIDefaults table,
 * as well as for selecting
 * a SynthStyle based on a JComponent/Region pair.
 *
 * @author Richard Bair
 */
