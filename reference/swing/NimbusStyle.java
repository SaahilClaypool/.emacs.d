_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private static final class CacheKey {

    /**
     * This implementation presupposes that key is never null and that
     * the two keys being checked for equality are never null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
        Map<CacheKey,Object> cache = new HashMap<CacheKey,Object>();

        /**
         * Simple cache. After a value has been looked up, it is stored
         * in this cache for later retrieval. The key is a concatenation of
         * the property being looked up, two dollar signs, and the extended
         * state. So for example:
         *
         * foo.bar$$2353
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
        UIDefaults defaults = new UIDefaults(10, .7f);

        /**
         * Defaults on the region/component level.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
        Insets contentMargins;

        /**
         * The content margins for this region.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
        RuntimeState[] states = null;

        /**
         * The list of actual runtime state representations. These can represent things such
         * as Enabled + Focused. Thus, they differ from States in that they contain
         * several states together, and have associated properties, data, etc.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
        State[] stateTypes = null;

        /**
         * The list of State types. A State represents a type of state, such
         * as Enabled, Default, WindowFocused, etc. These can be custom states.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private static final class Values {

    /**
     * Essentially a struct of data for a style. A default instance of this
     * class is used by NimbusStyle. Additional instances exist for each
     * component that has overrides.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private final class RuntimeState implements Cloneable {

    /**
     * Contains values such as the UIDefaults and painters associated with
     * a state. Whereas <code>State</code> represents a distinct state that a
     * component can be in (such as Enabled), this class represents the colors,
     * fonts, painters, etc associated with some state for this
     * style.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private RuntimeState getNextState(RuntimeState[] states,
                                      int[] lastState,
                                      int xstate) {

    /**
     * <p>Gets the RuntimeState that most closely matches the state in the given
     * context, but is less specific than the given "lastState". Essentially,
     * this allows you to search for the next best state.</p>
     *
     * <p>For example, if you had the following three states:
     * <pre>
     * Enabled
     * Enabled+Pressed
     * Disabled
     * </pre>
     * And you wanted to find the state that best represented
     * ENABLED+PRESSED+FOCUSED and <code>lastState</code> was null (or an
     * empty array, or an array with a single int with index == -1), then
     * Enabled+Pressed would be returned. If you then call this method again but
     * pass the index of Enabled+Pressed as the "lastState", then
     * Enabled would be returned. If you call this method a third time and pass
     * the index of Enabled in as the <code>lastState</code>, then null would be
     * returned.</p>
     *
     * <p>The actual code path for determining the proper state is the same as
     * in Synth.</p>
     *
     * @param ctx
     * @param lastState a 1 element array, allowing me to do pass-by-reference.
     * @return
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private int getExtendedState(SynthContext ctx, Values v) {

    /**
     * <p>Gets the extended state for a given synth context. Nimbus supports the
     * ability to define custom states. The algorithm used for choosing what
     * style information to use for a given state requires a single integer
     * bit string where each bit in the integer represents a different state
     * that the component is in. This method uses the componentState as
     * reported in the SynthContext, in addition to custom states, to determine
     * what this extended state is.</p>
     *
     * <p>In addition, this method checks the component in the given context
     * for a client property called "Nimbus.State". If one exists, then it will
     * decompose the String associated with that property to determine what
     * state to return. In this way, the developer can force a component to be
     * in a specific state, regardless of what the "real" state of the component
     * is.</p>
     *
     * <p>The string associated with "Nimbus.State" would be of the form:
     * <pre>Enabled+CustomState+MouseOver</pre></p>
     *
     * @param ctx
     * @param v
     * @return
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private boolean contains(String[] names, String name) {

    /**
     * Simple utility method that searches the given array of Strings for the
     * given string. This method is only called from getExtendedState if
     * the developer has specified a specific state for the component to be
     * in (ie, has "wedged" the component in that state) by specifying
     * they client property "Nimbus.State".
     *
     * @param names a non-null array of strings
     * @param name the name to look for in the array
     * @return true or false based on whether the given name is in the array
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private Values getValues(SynthContext ctx) {

    /**
     * Utility method which returns the proper Values based on the given
     * SynthContext. Ensures that parsing of the values has occurred, or
     * reoccurs as necessary.
     *
     * @param ctx The SynthContext
     * @return a non-null values reference
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    public Painter getBorderPainter(SynthContext ctx) {

    /**
     * Gets the appropriate border Painter, if there is one, for the state
     * specified in the given SynthContext. This method does appropriate
     * fallback searching, as described in #get.
     *
     * @param ctx The SynthContext. Must not be null.
     * @return The border painter associated for the given state, or null if
     * none could be found.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    public Painter getForegroundPainter(SynthContext ctx) {

    /**
     * Gets the appropriate foreground Painter, if there is one, for the state
     * specified in the given SynthContext. This method does appropriate
     * fallback searching, as described in #get.
     *
     * @param ctx The SynthContext. Must not be null.
     * @return The foreground painter associated for the given state, or null if
     * none could be found.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    public Painter getBackgroundPainter(SynthContext ctx) {

    /**
     * Gets the appropriate background Painter, if there is one, for the state
     * specified in the given SynthContext. This method does appropriate
     * fallback searching, as described in #get.
     *
     * @param ctx The SynthContext. Must not be null.
     * @return The background painter associated for the given state, or null if
     * none could be found.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    @Override public Object get(SynthContext ctx, Object key) {

    /**
     * {@inheritDoc}
     *
     * <p>Overridden to cause this style to populate itself with data from
     * UIDefaults, if necessary.</p>
     *
     * <p>Properties in UIDefaults may be specified in a chained manner. For
     * example:
     * <pre>
     * background
     * Button.opacity
     * Button.Enabled.foreground
     * Button.Enabled+Selected.background
     * </pre>
     *
     * <p>In this example, suppose you were in the Enabled+Selected state and
     * searched for "foreground". In this case, we first check for
     * Button.Enabled+Selected.foreground, but no such color exists. We then
     * fall back to the next valid state, in this case,
     * Button.Enabled.foreground, and have a match. So we return it.</p>
     *
     * <p>Again, if we were in the state Enabled and looked for "background", we
     * wouldn't find it in Button.Enabled, or in Button, but would at the top
     * level in UIManager. So we return that value.</p>
     *
     * <p>One special note: the "key" passed to this method could be of the form
     * "background" or "Button.background" where "Button" equals the prefix
     * passed to the NimbusStyle constructor. In either case, it looks for
     * "background".</p>
     *
     * @param ctx
     * @param key must not be null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    @Override public boolean isOpaque(SynthContext ctx) {

    /**
     * {@inheritDoc}
     *
     * Overridden to cause this style to populate itself with data from
     * UIDefaults, if necessary. If opacity is not specified in UI defaults,
     * then it defaults to being non-opaque.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    @Override public SynthPainter getPainter(SynthContext ctx) {

    /**
     * {@inheritDoc}
     *
     * Returns the SynthPainter for this style, which ends up delegating to
     * the Painters installed in this style.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    @Override protected Font getFontForState(SynthContext ctx) {

    /**
     * {@inheritDoc}
     *
     * Overridden to cause this style to populate itself with data from
     * UIDefaults, if necessary. If a value named "font" is not found in
     * UIDefaults, then the "defaultFont" font in UIDefaults will be returned
     * instead.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    @Override protected Color getColorForState(SynthContext ctx, ColorType type) {

    /**
     * {@inheritDoc}
     *
     * <p>Overridden to cause this style to populate itself with data from
     * UIDefaults, if necessary.</p>
     *
     * <p>In addition, NimbusStyle handles ColorTypes slightly differently from
     * Synth.</p>
     * <ul>
     *  <li>ColorType.BACKGROUND will equate to the color stored in UIDefaults
     *      named "background".</li>
     *  <li>ColorType.TEXT_BACKGROUND will equate to the color stored in
     *      UIDefaults named "textBackground".</li>
     *  <li>ColorType.FOREGROUND will equate to the color stored in UIDefaults
     *      named "textForeground".</li>
     *  <li>ColorType.TEXT_FOREGROUND will equate to the color stored in
     *      UIDefaults named "textForeground".</li>
     * </ul>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    @Override public Insets getInsets(SynthContext ctx, Insets in) {

    /**
     * {@inheritDoc}
     *
     * Overridden to cause this style to populate itself with data from
     * UIDefaults, if necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private void validate() {

    /**
     * Pulls data out of UIDefaults, if it has not done so already, and sets
     * up the internal state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    @Override public void installDefaults(SynthContext ctx) {

    /**
     * {@inheritDoc}
     *
     * Overridden to cause this style to populate itself with data from
     * UIDefaults, if necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    NimbusStyle(String prefix, JComponent c) {

    /**
     * Create a new NimbusStyle. Only the prefix must be supplied. At the
     * appropriate time, installDefaults will be called. At that point, all of
     * the state information will be pulled from UIManager and stored locally
     * within this style.
     *
     * @param prefix Something like Button or Slider.Thumb or
     *        org.jdesktop.swingx.JXStatusBar or ComboBox."ComboBox.arrowButton"
     * @param c an optional reference to a component that this NimbusStyle
     *        should be associated with. This is only used when the component
     *        has Nimbus overrides registered in its client properties and
     *        should be null otherwise.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private WeakReference<JComponent> component;

    /**
     * Some NimbusStyles are created for a specific component only. In Nimbus,
     * this happens whenever the component has as a client property a
     * UIDefaults which overrides (or supplements) those defaults found in
     * UIManager.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private CacheKey tmpKey = new CacheKey("", 0);

    /**
     * A temporary CacheKey used to perform lookups. This pattern avoids
     * creating useless garbage keys, or concatenating strings, etc.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private Values values;

    /**
     * Data structure containing all of the defaults, insets, states, and other
     * values associated with this style. This instance refers to default
     * values, and are used when no overrides are discovered in the client
     * properties of a component. These values are lazily created on first
     * access.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private SynthPainter painter;

    /**
     * The SynthPainter that will be returned from this NimbusStyle. The
     * SynthPainter returned will be a SynthPainterImpl, which will in turn
     * delegate back to this NimbusStyle for the proper Painter (not
     * SynthPainter) to use for painting the foreground, background, or border.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private String prefix;

    /**
     * The prefix for the component or region that this NimbusStyle
     * represents. This prefix is used to lookup state in the UIManager.
     * It should be something like Button or Slider.Thumb or "MyButton" or
     * ComboBox."ComboBox.arrowButton" or "MyComboBox"."ComboBox.arrowButton"
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private static final Comparator<RuntimeState> STATE_COMPARATOR =

    /**
     * Simple Comparator for ordering the RuntimeStates according to their
     * rank.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private static final Color DEFAULT_COLOR = new ColorUIResource(Color.BLACK);

    /**
     * <p>The Color to return from getColorForState if it would otherwise have
     * returned null.</p>
     *
     * <p>Returning null from getColorForState is a very bad thing, as it causes
     * the AWT peer for the component to install a SystemColor, which is not a
     * UIResource. As a result, if <code>null</code> is returned from
     * getColorForState, then thereafter the color is not updated for other
     * states or on LAF changes or updates. This DEFAULT_COLOR is used to
     * ensure that a ColorUIResource is always returned from
     * getColorForState.</p>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
    private static final Object NULL = '\0';

    /**
     * Special constant used for performance reasons during the get() method.
     * If get() runs through all of the search locations and determines that
     * there is no value, then NULL will be placed into the values map. This way
     * on subsequent lookups it will simply extract NULL, see it, and return
     * null rather than continuing the lookup procedure.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/nimbus/NimbusStyle.java
public final class NimbusStyle extends SynthStyle {

/**
 * <p>A SynthStyle implementation used by Nimbus. Each Region that has been
 * registered with the NimbusLookAndFeel will have an associated NimbusStyle.
 * Third party components that are registered with the NimbusLookAndFeel will
 * therefore be handed a NimbusStyle from the look and feel from the
 * #getStyle(JComponent, Region) method.</p>
 *
 * <p>This class properly reads and retrieves values placed in the UIDefaults
 * according to the standard Nimbus naming conventions. It will create and
 * retrieve painters, fonts, colors, and other data stored there.</p>
 *
 * <p>NimbusStyle also supports the ability to override settings on a per
 * component basis. NimbusStyle checks the component's client property map for
 * "Nimbus.Overrides". If the value associated with this key is an instance of
 * UIDefaults, then the values in that defaults table will override the standard
 * Nimbus defaults in UIManager, but for that component instance only.</p>
 *
 * <p>Optionally, you may specify the client property
 * "Nimbus.Overrides.InheritDefaults". If true, this client property indicates
 * that the defaults located in UIManager should first be read, and then
 * replaced with defaults located in the component client properties. If false,
 * then only the defaults located in the component client property map will
 * be used. If not specified, it is assumed to be true.</p>
 *
 * <p>You must specify "Nimbus.Overrides" for "Nimbus.Overrides.InheritDefaults"
 * to have any effect. "Nimbus.Overrides" indicates whether there are any
 * overrides, while "Nimbus.Overrides.InheritDefaults" indicates whether those
 * overrides should first be initialized with the defaults from UIManager.</p>
 *
 * <p>The NimbusStyle is reloaded whenever a property change event is fired
 * for a component for "Nimbus.Overrides" or "Nimbus.Overrides.InheritDefaults".
 * So for example, setting a new UIDefaults on a component would cause the
 * style to be reloaded.</p>
 *
 * <p>The values are only read out of UIManager once, and then cached. If
 * you need to read the values again (for example, if the UI is being reloaded),
 * then discard this NimbusStyle and read a new one from NimbusLookAndFeel
 * using NimbusLookAndFeel.getStyle.</p>
 *
 * <p>The primary API of interest in this class for 3rd party component authors
 * are the three methods which retrieve painters: #getBackgroundPainter,
 * #getForegroundPainter, and #getBorderPainter.</p>
 *
 * <p>NimbusStyle allows you to specify custom states, or modify the order of
 * states. Synth (and thus Nimbus) has the concept of a "state". For example,
 * a JButton might be in the "MOUSE_OVER" state, or the "ENABLED" state, or the
 * "DISABLED" state. These are all "standard" states which are defined in synth,
 * and which apply to all synth Regions.</p>
 *
 * <p>Sometimes, however, you need to have a custom state. For example, you
 * want JButton to render differently if it's parent is a JToolbar. In Nimbus,
 * you specify these custom states by including a special key in UIDefaults.
 * The following UIDefaults entries define three states for this button:</p>
 *
 * <pre><code>
 *     JButton.States = Enabled, Disabled, Toolbar
 *     JButton[Enabled].backgroundPainter = somePainter
 *     JButton[Disabled].background = BLUE
 *     JButton[Toolbar].backgroundPainter = someOtherPaint
 * </code></pre>
 *
 * <p>As you can see, the <code>JButton.States</code> entry lists the states
 * that the JButton style will support. You then specify the settings for
 * each state. If you do not specify the <code>JButton.States</code> entry,
 * then the standard Synth states will be assumed. If you specify the entry
 * but the list of states is empty or null, then the standard synth states
 * will be assumed.</p>
 *
 * @author Richard Bair
 * @author Jasper Potts
 */
