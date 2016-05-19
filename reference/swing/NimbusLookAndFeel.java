_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
        @Override

        /**
         * Creates the value retrieved from the <code>UIDefaults</code> table.
         * The object is created each time it is accessed.
         *
         * @param table a <code>UIDefaults</code> table
         * @return the created <code>Object</code>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    private class NimbusProperty implements UIDefaults.ActiveValue, UIResource {

    /**
     * Nimbus Property that looks up Nimbus keys for standard key names. For
     * example "Button.background" --> "Button[Enabled].backgound"
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    private class LinkProperty implements UIDefaults.ActiveValue, UIResource{

    /**
     * Simple Symbolic Link style UIDefalts Property
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    static int deriveARGB(Color color1, Color color2, float midPoint) {

    /**
     * Derives the ARGB value for a color based on an offset between two
     * other colors.
     *
     * @param color1   The first color
     * @param color2   The second color
     * @param midPoint The offset between color 1 and color 2, a value of 0.0 is
     *                 color 1 and 1.0 is color 2;
     * @return the ARGB value for a new color based on this derivation
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    static Object resolveToolbarConstraint(JToolBar toolbar) {

    /**
     * Package private method which returns either BorderLayout.NORTH,
     * BorderLayout.SOUTH, BorderLayout.EAST, or BorderLayout.WEST depending
     * on the location of the toolbar in its parent. The toolbar might be
     * in PAGE_START, PAGE_END, CENTER, or some other position, but will be
     * resolved to either NORTH,SOUTH,EAST, or WEST based on where the toolbar
     * actually IS, with CENTER being NORTH.
     *
     * This code is used to determine where the border line should be drawn
     * by the custom toolbar states, and also used by NimbusIcon to determine
     * whether the handle icon needs to be shifted to look correct.
     *
     * Toollbars are unfortunately odd in the way these things are handled,
     * and so this code exists to unify the logic related to toolbars so it can
     * be shared among the static files such as NimbusIcon and generated files
     * such as the ToolBar state classes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    protected final Color getDerivedColor(Color color1, Color color2,
                                      float midPoint) {

    /**
     * Decodes and returns a color, which is derived from a offset between two
     * other colors.
     *
     * @param color1   The first color
     * @param color2   The second color
     * @param midPoint The offset between color 1 and color 2, a value of 0.0 is
     *                 color 1 and 1.0 is color 2;
     * @return The derived color, which will be a UIResource
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    protected final Color getDerivedColor(Color color1, Color color2,
                                      float midPoint, boolean uiResource) {

    /**
     * Decodes and returns a color, which is derived from an offset between two
     * other colors.
     *
     * @param color1   The first color
     * @param color2   The second color
     * @param midPoint The offset between color 1 and color 2, a value of 0.0 is
     *                 color 1 and 1.0 is color 2;
     * @param uiResource True if the derived color should be a UIResource
     * @return The derived color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    public Color getDerivedColor(String uiDefaultParentName,
                                 float hOffset, float sOffset,
                                 float bOffset, int aOffset,
                                 boolean uiResource) {

    /**
     * Get a derived color, derived colors are shared instances and is color
     * value will change when its parent UIDefault color changes.
     *
     * @param uiDefaultParentName The parent UIDefault key
     * @param hOffset             The hue offset
     * @param sOffset             The saturation offset
     * @param bOffset             The brightness offset
     * @param aOffset             The alpha offset
     * @param uiResource          True if the derived color should be a
     *                            UIResource, false if it should not be
     * @return The stored derived color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    private String getSystemProperty(String key) {

    /**
     * Simple utility method that reads system keys.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    public void register(Region region, String prefix) {

    /**
     * <p>Registers a third party component with the NimbusLookAndFeel.</p>
     *
     * <p>Regions represent Components and areas within Components that act as
     * independent painting areas. Once registered with the NimbusLookAndFeel,
     * NimbusStyles for these Regions can be retrieved via the
     * <code>getStyle</code> method.</p>
     *
     * <p>The NimbusLookAndFeel uses a standard naming scheme for entries in the
     * UIDefaults table. The key for each property, state, painter, and other
     * default registered in UIDefaults for a specific Region will begin with
     * the specified <code>prefix</code></p>
     *
     * <p>For example, suppose I had a component named JFoo. Suppose I then registered
     * this component with the NimbusLookAndFeel in this manner:</p>
     *
     * <pre><code>
     *     laf.register(NimbusFooUI.FOO_REGION, "Foo");
     * </code></pre>
     *
     * <p>In this case, I could then register properties for this component with
     * UIDefaults in the following manner:</p>
     *
     * <pre><code>
     *     UIManager.put("Foo.background", new ColorUIResource(Color.BLACK));
     *     UIManager.put("Foo.Enabled.backgroundPainter", new FooBackgroundPainter());
     * </code></pre>
     *
     * <p>It is also possible to register a named component with Nimbus.
     * For example, suppose you wanted to style the background of a JPanel
     * named "MyPanel" differently from other JPanels. You could accomplish this
     * by doing the following:</p>
     *
     * <pre><code>
     *     laf.register(Region.PANEL, "\"MyPanel\"");
     *     UIManager.put("\"MyPanel\".background", new ColorUIResource(Color.RED));
     * </code></pre>
     *
     * @param region The Synth Region that is being registered. Such as Button, or
     *        ScrollBarThumb, or NimbusFooUI.FOO_REGION.
     * @param prefix The UIDefault prefix. For example, could be ComboBox, or if
     *        a named components, "MyComboBox", or even something like
     *        ToolBar."MyComboBox"."ComboBox.arrowButton"
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    @Override

    /**
     * {@inheritDoc}
     *
     * <p>Overridden to return {@code true} when one of the following
     * properties change:
     * <ul>
     *   <li>{@code "Nimbus.Overrides"}
     *   <li>{@code "Nimbus.Overrides.InheritDefaults"}
     *   <li>{@code "JComponent.sizeVariant"}
     * </ul>
     *
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    @Override public boolean shouldUpdateStyleOnAncestorChanged() {

    /**
     * {@inheritDoc}
     * @return {@code true}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    @Override public String getDescription() {

    /**
     * Returns a textual description of this look and feel.
     *
     * @return textual description of this look and feel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    @Override public String getID() {

    /**
     * Return a string that identifies this look and feel. This String will
     * be the unquoted String "Nimbus".
     *
     * @return a short string identifying this look and feel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    @Override public String getName() {

    /**
     * Return a short string that identifies this look and feel. This
     * String will be the unquoted String "Nimbus".
     *
     * @return a short string identifying this look and feel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    public static NimbusStyle getStyle(JComponent c, Region r) {

    /**
     * Gets the style associated with the given component and region. This
     * will never return null. If an appropriate component and region cannot
     * be determined, then a default style is returned.
     *
     * @param c a non-null reference to a JComponent
     * @param r a non-null reference to the region of the component c
     * @return a non-null reference to a NimbusStyle.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    @Override public UIDefaults getDefaults() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    @Override public void uninitialize() {

    /** Called by UIManager when this look and feel is uninstalled. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    @Override public void initialize() {

    /** Called by UIManager when this look and feel is installed. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    public NimbusLookAndFeel() {

    /**
     * Create a new NimbusLookAndFeel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    private UIDefaults uiDefaults;

    /**
     * Reference to populated LAD uidefaults
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    private NimbusDefaults defaults;

    /**
     * A reference to the auto-generated file NimbusDefaults. This file contains
     * the default mappings and values for the look and feel as specified in the
     * visual designer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
    private static final String[] COMPONENT_KEYS = new String[]{"ArrowButton", "Button",

    /** Set of standard region names for UIDefaults Keys */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusLookAndFeel.java
public class NimbusLookAndFeel extends SynthLookAndFeel {

/**
 * <p>The NimbusLookAndFeel class.</p>
 *
 * @author Jasper Potts
 * @author Richard Bair
 */
