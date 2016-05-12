_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    private SynthStyle mergeStyles(List styles) {

    /**
     * Creates a single Style from the passed in styles. The passed in List
     * is reverse sorted, that is the most recently added style found to
     * match will be first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    private SynthStyle getCachedStyle(List styles) {

    /**
     * Returns the cached style from the passed in arguments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    private void cacheStyle(List styles, SynthStyle style) {

    /**
     * Caches the specified style.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    private void getMatchingStyles(List matches, JComponent c,
                                   Region id) {

    /**
     * Fetches any styles that match the passed into arguments into
     * <code>matches</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    private SynthStyle getDefaultStyle() {

    /**
     * Returns the style to use if there are no matching styles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    public synchronized SynthStyle getStyle(JComponent c, Region id) {

    /**
     * Returns the style for the specified Component.
     *
     * @param c Component asking for
     * @param id ID of the Component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    private SynthStyle _defaultStyle;

    /**
     * Used if there are no styles matching a widget.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    private Map<BakedArrayList, SynthStyle> _resolvedStyles;

    /**
     * Maps from a List (BakedArrayList to be precise) to the merged style.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    private List<StyleAssociation> _styles;

    /**
     * List containing set of StyleAssociations used in determining matching
     * styles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
    public static final int REGION = 1;

    /**
     * Used to indicate the lookup should be done based on region.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/DefaultSynthStyleFactory.java
class DefaultSynthStyleFactory extends SynthStyleFactory {

/**
 * Factory used for obtaining styles. Supports associating a style based on
 * the name of the component as returned by <code>Component.getName()</code>,
 * and the <code>Region</code> associated with the <code>JComponent</code>.
 * Lookup is done using regular expressions.
 *
 * @author Scott Violet
 */
