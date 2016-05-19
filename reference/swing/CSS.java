_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private int baseFontSize;

    /** Size used for relative units. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private transient Hashtable<Object, Object> valueConvertor;

    /** Maps from CSS key to CssValue. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    interface LayoutIterator {

    /**
     * An iterator to express the requirements to use when computing
     * layout.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static void calculateTiledLayout(LayoutIterator iter, int targetSpan) {

    /**
     * Calculate a tiled layout for the given iterator.
     * This should be done collapsing the neighboring
     * margins to be a total of the maximum of the two
     * neighboring margin areas as described in the CSS spec.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static SizeRequirements calculateTiledRequirements(LayoutIterator iter, SizeRequirements r) {

    /**
     * Calculate the requirements needed to tile the requirements
     * given by the iterator that would be tiled.  The calculation
     * takes into consideration margin and border spacing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        static void parseShorthandMargin(CSS css, String value,
                                         MutableAttributeSet attr,
                                         CSS.Attribute[] names) {

        /**
         * Parses the shorthand margin/padding/border string
         * <code>value</code>, placing the result in <code>attr</code>.
         * <code>names</code> give the 4 instrinsic property names.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class ShorthandMarginParser {

    /**
     * Used to parser margin and padding.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        static void parseShorthandBackground(CSS css, String value,
                                             MutableAttributeSet attr) {

        /**
         * Parses the shorthand font string <code>value</code>, placing the
         * result in <code>attr</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class ShorthandBackgroundParser {

    /**
     * Parses the background property into its intrinsic values.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        static void parseShorthandFont(CSS css, String value,
                                       MutableAttributeSet attr) {

        /**
         * Parses the shorthand font string <code>value</code>, placing the
         * result in <code>attr</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class ShorthandFontParser {

    /**
     * Class used to parse font property. The font property is shorthand
     * for the other font properties. This expands the properties, placing
     * them in the attributeset.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class LengthUnit implements Serializable {

    /**
     * Parses a length value, this is used internally, and never added
     * to an AttributeSet or returned to the developer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class BackgroundImage extends CssValue {

    /**
     * Used for BackgroundImages.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class BackgroundPosition extends CssValue {

    /**
     * Used for background images, to represent the position.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class CssValueMapper extends CssValue {

    /**
     * Handles uniquing of CSS values, like lists, and background image
     * repeating.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        private static final float[] values = { 1, 2, 4 };

        /** Values used to represent border width. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class BorderWidthValue extends LengthValue {

    /**
     * BorderWidthValue is used to model BORDER_XXX_WIDTH and adds support
     * for the thin/medium/thick values.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        float span;

        /** Either the absolute value (percentage == false) or
         * a percentage value. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        boolean percentage;

        /** If true, span is a percentage value, and that to determine
         * the length another value needs to be passed in. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object toStyleConstants(StyleConstants key, View v) {

        /**
         * Converts a CSS attribute value to a <code>StyleConstants</code>
         * value.  If there is no conversion, returns <code>null</code>.
         * By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @return the <code>StyleConstants</code> attribute value that
         *   represents the CSS attribute value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object fromStyleConstants(StyleConstants key, Object value) {

        /**
         * Converts a <code>StyleConstants</code> attribute value to
         * a CSS attribute value.  If there is no conversion,
         * returns <code>null</code>.  By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @param value the value of a <code>StyleConstants</code>
         *   attribute to be converted
         * @return the CSS value that represents the
         *   <code>StyleConstants</code> value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        boolean isPercentage() {

        /**
         * Returns true if the length represents a percentage of the
         * containing box.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        float getValue(float currentValue) {

        /**
         * Returns the length (span) to use. If the value represents
         * a percentage, it is scaled based on <code>currentValue</code>.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        float getValue() {

        /**
         * Returns the length (span) to use.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        boolean mayBeNegative;

        /**
         * if this length value may be negative.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object toStyleConstants(StyleConstants key, View v) {

        /**
         * Converts a CSS attribute value to a <code>StyleConstants</code>
         * value.  If there is no conversion, returns <code>null</code>.
         * By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @return the <code>StyleConstants</code> attribute value that
         *   represents the CSS attribute value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object fromStyleConstants(StyleConstants key, Object value) {

        /**
         * Converts a <code>StyleConstants</code> attribute value to
         * a CSS attribute value.  If there is no conversion
         * returns <code>null</code>.  By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @param value the value of a <code>StyleConstants</code>
         *   attribute to be converted
         * @return the CSS value that represents the
         *   <code>StyleConstants</code> value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Color getValue() {

        /**
         * Returns the color to use.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object toStyleConstants(StyleConstants key, View v) {

        /**
         * Converts a CSS attribute value to a <code>StyleConstants</code>
         * value.  If there is no conversion, returns <code>null</code>.
         * By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @return the <code>StyleConstants</code> attribute value that
         *   represents the CSS attribute value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object fromStyleConstants(StyleConstants key, Object value) {

        /**
         * Converts a <code>StyleConstants</code> attribute value to
         * a CSS attribute value.  If there is no conversion
         * returns <code>null</code>.  By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @param value the value of a <code>StyleConstants</code>
         *   attribute to be converted
         * @return the CSS value that represents the
         *   <code>StyleConstants</code> value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object toStyleConstants(StyleConstants key, View v) {

        /**
         * Converts a CSS attribute value to a <code>StyleConstants</code>
         * value.  If there is no conversion, returns <code>null</code>.
         * By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @return the <code>StyleConstants</code> attribute value that
         *   represents the CSS attribute value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object fromStyleConstants(StyleConstants key, Object value) {

        /**
         * Converts a <code>StyleConstants</code> attribute value to
         * a CSS attribute value.  If there is no conversion
         * returns <code>null</code>.  By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @param value the value of a <code>StyleConstants</code>
         *   attribute to be converted
         * @return the CSS value that represents the
         *   <code>StyleConstants</code> value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        String getValue() {

        /**
         * Returns the font family to use.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object toStyleConstants(StyleConstants key, View v) {

        /**
         * Converts a CSS attribute value to a <code>StyleConstants</code>
         * value.  If there is no conversion, returns <code>null</code>.
         * By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @return the <code>StyleConstants</code> attribute value that
         *   represents the CSS attribute value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object fromStyleConstants(StyleConstants key, Object value) {

        /**
         * Converts a <code>StyleConstants</code> attribute value to
         * a CSS attribute value.  If there is no conversion
         * returns <code>null</code>.  By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @param value the value of a <code>StyleConstants</code>
         *   attribute to be converted
         * @return the CSS value that represents the
         *   <code>StyleConstants</code> value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        int getValue(AttributeSet a, StyleSheet ss) {

        /**
         * Returns the size in points.  This is ultimately
         * what we need for the purpose of creating/fetching
         * a Font object.
         *
         * @param a the attribute set the value is being
         *  requested from.  We may need to walk up the
         *  resolve hierarchy if it's relative.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    class FontSize extends CssValue {

    /**
     * Represents a value for the CSS.FONT_SIZE attribute.
     * The binary format of the value can be one of several
     * types.  If the type is Float,
     * the value is specified in terms of point or
     * percentage, depending upon the ending of the
     * associated string.
     * If the type is Integer, the value is specified
     * in terms of a size index.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object toStyleConstants(StyleConstants key, View v) {

        /**
         * Converts a CSS attribute value to a
         * <code>StyleConstants</code> value.
         * If there is no conversion, returns <code>null</code>.
         * By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @return the <code>StyleConstants</code> attribute value that
         *   represents the CSS attribute value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object fromStyleConstants(StyleConstants key, Object value) {

        /**
         * Converts a <code>StyleConstants</code> attribute value to
         * a CSS attribute value.  If there is no conversion
         * returns <code>null</code>.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @param value the value of a <code>StyleConstants</code>
         *   attribute to be converted
         * @return the CSS value that represents the
         *   <code>StyleConstants</code> value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object parseCssValue(String value) {

        /**
         * Convert a CSS value string to the internal format
         * (for fast processing) used in the attribute sets.
         * This produces a StringValue, so that it can be
         * used to convert from CSS to StyleConstants values.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class StringValue extends CssValue {

    /**
     * By default CSS attributes are represented as simple
     * strings.  They also have no conversion to/from
     * StyleConstants by default. This class represents the
     * value as a string (via the superclass), but
     * provides StyleConstants conversion support for the
     * CSS attributes that are held as strings.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        String svalue;

        /**
         * The value as a string... before conversion to a
         * binary format.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        public String toString() {

        /**
         * Return the CSS format of the value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object toStyleConstants(StyleConstants key, View v) {

        /**
         * Converts a CSS attribute value to a
         * <code>StyleConstants</code>
         * value.  If there is no conversion, returns
         * <code>null</code>.
         * By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @param v the view containing <code>AttributeSet</code>
         * @return the <code>StyleConstants</code> attribute value that
         *   represents the CSS attribute value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object fromStyleConstants(StyleConstants key, Object value) {

        /**
         * Converts a <code>StyleConstants</code> attribute value to
         * a CSS attribute value.  If there is no conversion,
         * returns <code>null</code>.  By default, there is no conversion.
         *
         * @param key the <code>StyleConstants</code> attribute
         * @param value the value of a <code>StyleConstants</code>
         *   attribute to be converted
         * @return the CSS value that represents the
         *   <code>StyleConstants</code> value
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object parseHtmlValue(String value) {

        /**
         * Convert an HTML attribute value to a CSS attribute
         * value.  If there is no conversion, return null.
         * This is implemented to simply forward to the CSS
         * parsing by default (since some of the attribute
         * values are the same).  If the attribute value
         * isn't recognized as a CSS value it is generally
         * returned as null.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        Object parseCssValue(String value) {

        /**
         * Convert a CSS value string to the internal format
         * (for fast processing) used in the attribute sets.
         * The fallback storage for any value that we don't
         * have a special binary format for is a String.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static class CssValue implements Serializable {

    /**
     * Base class to CSS values in the attribute sets.  This
     * is intended to act as a convertor to/from other attribute
     * formats.
     * <p>
     * The CSS parser uses the parseCssValue method to convert
     * a string to whatever format is appropriate a given key
     * (i.e. these convertors are stored in a map using the
     * CSS.Attribute as a key and the CssValue as the value).
     * <p>
     * The HTML to CSS conversion process first converts the
     * HTML.Attribute to a CSS.Attribute, and then calls
     * the parseHtmlValue method on the value of the HTML
     * attribute to produce the corresponding CSS value.
     * <p>
     * The StyleConstants to CSS conversion process first
     * converts the StyleConstants attribute to a
     * CSS.Attribute, and then calls the fromStyleConstants
     * method to convert the StyleConstants value to a
     * CSS value.
     * <p>
     * The CSS to StyleConstants conversion process first
     * converts the StyleConstants attribute to a
     * CSS.Attribute, and then calls the toStyleConstants
     * method to convert the CSS value to a StyleConstants
     * value.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private HTML.Tag getHTMLTag(AttributeSet htmlAttrSet) {

    /**
     * Fetches the tag associated with the HTML AttributeSet.
     *
     * @param  AttributeSet containing the HTML attributes.
     * @return HTML.Tag
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private CSS.Attribute getCssAlignAttribute(HTML.Tag tag,
                                                   AttributeSet htmlAttrSet) {

    /**
     * Maps HTML.Attribute.ALIGN to either:
     *     CSS.Attribute.TEXT_ALIGN
     *     CSS.Attribute.FLOAT
     *     CSS.Attribute.VERTICAL_ALIGN
     * based on the tag associated with the attribute and the
     * value of the attribute.
     *
     * @param AttributeSet containing HTML attributes.
     * @return CSS.Attribute mapping for HTML.Attribute.ALIGN.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private CSS.Attribute[] getCssAttribute(HTML.Attribute hAttr) {

    /**
     * Maps an HTML.Attribute object to its appropriate CSS.Attributes.
     *
     * @param HTML.Attribute
     * @return CSS.Attribute[]
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    Object getCssValue(CSS.Attribute cssAttr, String htmlAttrValue) {

    /**
     * Given a CSS.Attribute object and its corresponding HTML.Attribute's
     * value, this method returns a CssValue object to associate with the
     * CSS attribute.
     *
     * @param the CSS.Attribute
     * @param a String containing the value associated HTML.Attribtue.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    float getPointSize(int index, StyleSheet ss) {

    /**
     * Return the point size, given a size index. Legal HTML index sizes
     * are 1-7.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static String[] parseStrings(String value) {

    /**
     * @return an array of all the strings in <code>value</code>
     *         that are separated by whitespace.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private static int getColorComponent(String string, int[] index) {

    /**
     * Returns the next integer value from <code>string</code> starting
     * at <code>index[0]</code>. The value can either can an integer, or
     * a percentage (floating number ending with %), in which case it is
     * multiplied by 255.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private static Color parseRGB(String string) {

    /**
     * Parses a String in the format <code>rgb(r, g, b)</code> where
     * each of the Color components is either an integer, or a floating number
     * with a % after indicating a percentage value of 255. Values are
     * constrained to fit with 0-255. The resulting Color is returned.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static Color stringToColor(String str) {

    /**
     * Convert a color string such as "RED" or "#NNNNNN" or "rgb(r, g, b)"
     * to a Color.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static final Color hexToColor(String value) {

     /**
      * Convert a "#FFFFFF" hex string to a Color.
      * If the color specification is bad, an attempt
      * will be made to fix it up.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static String colorToHex(Color color) {

    /**
     * Converts a type Color to a hex string
     * in the format "#RRGGBB"
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static URL getURL(URL base, String cssString) {

    /**
     * Returns a URL for the given CSS url string. If relative,
     * <code>base</code> is used as the parent. If a valid URL can not
     * be found, this will not throw a MalformedURLException, instead
     * null will be returned.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    static final Value getValue(String name) {

    /**
     * Translates a string to a <code>CSS.Value</code> object.
     * This will return <code>null</code> if there is no value
     * by the given name.
     *
     * @param name the name of the CSS value to fetch the
     *  typesafe enumeration for
     * @return the <code>CSS.Value</code> object,
     *  or <code>null</code> if the string
     *  doesn't represent a valid CSS value name; this does
     *  not mean that it doesn't represent a valid CSS value
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    public static final Attribute getAttribute(String name) {

    /**
     * Translates a string to a <code>CSS.Attribute</code> object.
     * This will return <code>null</code> if there is no attribute
     * by the given name.
     *
     * @param name the name of the CSS attribute to fetch the
     *  typesafe enumeration for
     * @return the <code>CSS.Attribute</code> object,
     *  or <code>null</code> if the string
     *  doesn't represent a valid attribute key
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    public static Attribute[] getAllAttributeKeys() {

    /**
     * Return the set of all possible CSS attribute keys.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private static final Hashtable<String, CSS.Value> cssValueToInternalValueMap = new Hashtable<String, CSS.Value>(13);

    /** Maps from CSS value (string) to internal value. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private static final Hashtable<String, CSS.Value> htmlValueToCssValueMap = new Hashtable<String, CSS.Value>(8);

    /** Maps from HTML value to a CSS value. Used in internal mapping. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private static final Hashtable<Object, Attribute> styleConstantToCssMap = new Hashtable<Object, Attribute>(17);

    /**
     * The hashtable and static initialization that follows sets
     * up a translation from StyleConstants (i.e. the <em>well known</em>
     * attributes) to the associated CSS attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    private static final Hashtable<HTML.Attribute, CSS.Attribute[]> htmlAttrToCssAttrMap = new Hashtable<HTML.Attribute, CSS.Attribute[]>(20);

    /**
     * The hashtable and the static initalization block below,
     * set up a mapping from well-known HTML attributes to
     * CSS attributes.  For the most part, there is a 1-1 mapping
     * between the two.  However in the case of certain HTML
     * attributes for example HTML.Attribute.VSPACE or
     * HTML.Attribute.HSPACE, end up mapping to two CSS.Attribute's.
     * Therefore, the value associated with each HTML.Attribute.
     * key ends up being an array of CSS.Attribute.* objects.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    AttributeSet translateHTMLToCSS(AttributeSet htmlAttrSet) {

    /**
     * Convert a set of HTML attributes to an equivalent
     * set of CSS attributes.
     *
     * @param htmlAttrSet AttributeSet containing the HTML attributes.
     * @return AttributeSet containing the corresponding CSS attributes.
     *        The AttributeSet will be empty if there are no mapping
     *        CSS attributes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    float getLength(AttributeSet a, CSS.Attribute key, StyleSheet ss) {

    /**
     * Returns the length of the attribute in <code>a</code> with
     * key <code>key</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    float getPointSize(String size, StyleSheet ss) {

    /**
     * Returns the size of a font from the passed in string.
     *
     * @param size CSS string describing font size
     * @param baseFontSize size to use for relative units.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    Color getColor(AttributeSet a, CSS.Attribute key) {

    /**
     * Takes a set of attributes and turn it into a color
     * specification.  This might be used to specify things
     * like brighter, more hue, etc.
     * This will return null if there is no value for <code>key</code>.
     *
     * @param key CSS.Attribute identifying where color is stored.
     * @param a the set of attributes
     * @return the color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    Font getFont(StyleContext sc, AttributeSet a, int defaultSize, StyleSheet ss) {

    /**
     * Returns the font for the values in the passed in AttributeSet.
     * It is assumed the keys will be CSS.Attribute keys.
     * <code>sc</code> is the StyleContext that will be messaged to get
     * the font once the size, name and style have been determined.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    Object cssValueToStyleConstantsValue(StyleConstants key, Object value) {

    /**
     * Converts the passed in CSS value to a StyleConstants value.
     * <code>key</code> identifies the CSS attribute being mapped.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    Object styleConstantsValueToCSSValue(StyleConstants sc,
                                         Object styleValue) {

    /**
     * Maps from a StyleConstants value to a CSS value.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    Attribute styleConstantsKeyToCSSKey(StyleConstants sc) {

    /**
     * Maps from a StyleConstants to a CSS Attribute.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    Object getInternalCSSValue(CSS.Attribute key, String value) {

    /**
     * Gets the internal CSS representation of <code>value</code> which is
     * a CSS value of the CSS attribute named <code>key</code>. The receiver
     * should not modify <code>value</code>, and the first <code>count</code>
     * strings are valid.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    void addInternalCSSValue(MutableAttributeSet attr,
                             CSS.Attribute key, String value) {

    /**
     * Parses the CSS property <code>key</code> with value
     * <code>value</code> placing the result in <code>att</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    int getBaseFontSize() {

    /**
     * Returns the base font size.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    void setBaseFontSize(String size) {

    /**
     * Sets the base font size from the passed in string.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    void setBaseFontSize(int sz) {

    /**
     * Sets the base font size. <code>sz</code> is a CSS value, and is
     * not necessarily the point size. Use getPointSize to determine the
     * point size corresponding to <code>sz</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        public String toString() {

        /**
         * The string representation of the attribute.  This
         * should exactly match the string specified in the
         * CSS specification.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        public boolean isInherited() {

        /**
         * Indicates if the attribute should be inherited
         * from the parent or not.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        public String getDefaultValue() {

        /**
         * Fetch the default value for the attribute.
         * If there is no default value (such as for
         * composite attributes), null will be returned.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
        public String toString() {

        /**
         * The string representation of the attribute.  This
         * should exactly match the string specified in the
         * CSS specification.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
    public static final class Attribute {

    /**
     * Definitions to be used as a key on AttributeSet's
     * that might hold CSS attributes.  Since this is a
     * closed set (i.e. defined exactly by the specification),
     * it is final and cannot be extended.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/CSS.java
public class CSS implements Serializable {

/**
 * Defines a set of
 * <a href="http://www.w3.org/TR/REC-CSS1">CSS attributes</a>
 * as a typesafe enumeration.  The HTML View implementations use
 * CSS attributes to determine how they will render. This also defines
 * methods to map between CSS/HTML/StyleConstants. Any shorthand
 * properties, such as font, are mapped to the intrinsic properties.
 * <p>The following describes the CSS properties that are supported by the
 * rendering engine:
 * <ul><li>font-family
 *   <li>font-style
 *   <li>font-size (supports relative units)
 *   <li>font-weight
 *   <li>font
 *   <li>color
 *   <li>background-color (with the exception of transparent)
 *   <li>background-image
 *   <li>background-repeat
 *   <li>background-position
 *   <li>background
 *   <li>text-decoration (with the exception of blink and overline)
 *   <li>vertical-align (only sup and super)
 *   <li>text-align (justify is treated as center)
 *   <li>margin-top
 *   <li>margin-right
 *   <li>margin-bottom
 *   <li>margin-left
 *   <li>margin
 *   <li>padding-top
 *   <li>padding-right
 *   <li>padding-bottom
 *   <li>padding-left
 *   <li>padding
 *   <li>border-top-style
 *   <li>border-right-style
 *   <li>border-bottom-style
 *   <li>border-left-style
 *   <li>border-style (only supports inset, outset and none)
 *   <li>border-top-color
 *   <li>border-right-color
 *   <li>border-bottom-color
 *   <li>border-left-color
 *   <li>border-color
 *   <li>list-style-image
 *   <li>list-style-type
 *   <li>list-style-position
 * </ul>
 * The following are modeled, but currently not rendered.
 * <ul><li>font-variant
 *   <li>background-attachment (background always treated as scroll)
 *   <li>word-spacing
 *   <li>letter-spacing
 *   <li>text-indent
 *   <li>text-transform
 *   <li>line-height
 *   <li>border-top-width (this is used to indicate if a border should be used)
 *   <li>border-right-width
 *   <li>border-bottom-width
 *   <li>border-left-width
 *   <li>border-width
 *   <li>border-top
 *   <li>border-right
 *   <li>border-bottom
 *   <li>border-left
 *   <li>border
 *   <li>width
 *   <li>height
 *   <li>float
 *   <li>clear
 *   <li>display
 *   <li>white-space
 *   <li>list-style
 * </ul>
 * <p><b>Note: for the time being we do not fully support relative units,
 * unless noted, so that
 * p { margin-top: 10% } will be treated as if no margin-top was specified.</b>
 *
 * @author  Timothy Prinzing
 * @author  Scott Violet
 * @see StyleSheet
 */
