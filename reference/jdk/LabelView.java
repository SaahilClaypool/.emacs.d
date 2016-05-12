_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    public void changedUpdate(DocumentEvent e, Shape a, ViewFactory f) {

    /**
     * Gives notification from the document that attributes were changed
     * in a location that this view is responsible for.
     *
     * @param e the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#changedUpdate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    public boolean isSuperscript() {

    /**
     * Determines if the glyphs should be rendered as subscript.
     *
     * <p>When you request this property, <code>LabelView</code>
     * re-syncs its state with the properties of the
     * <code>Element</code>'s <code>AttributeSet</code>.
     * If <code>Element</code>'s <code>AttributeSet</code>
     * does not have this property set, it will revert to false.
     *
     * @return the value of the cached
     *     <code>superscript</code> property
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    public boolean isSubscript() {

    /**
     * Determines if the glyphs should be rendered as superscript.
     * @return the value of the cached subscript property
     *
     * <p>When you request this property, <code>LabelView</code>
     * re-syncs its state with the properties of the
     * <code>Element</code>'s <code>AttributeSet</code>.
     * If <code>Element</code>'s <code>AttributeSet</code>
     * does not have this property set, it will revert to false.
     *
     * @return the value of the cached
     *     <code>subscript</code> property
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    public boolean isStrikeThrough() {

    /**
     * Determines if the glyphs should have a strikethrough
     * line.  If true, a line should be drawn through the center
     * of the glyphs.  This is implemented to return the
     * cached <code>strikeThrough</code> property.
     *
     * <p>When you request this property, <code>LabelView</code>
     * re-syncs its state with the properties of the
     * <code>Element</code>'s <code>AttributeSet</code>.
     * If <code>Element</code>'s <code>AttributeSet</code>
     * does not have this property set, it will revert to false.
     *
     * @return the value of the cached
     *     <code>strikeThrough</code> property
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    public boolean isUnderline() {

    /**
     * Determines if the glyphs should be underlined.  If true,
     * an underline should be drawn through the baseline.  This
     * is implemented to return the cached underline property.
     *
     * <p>When you request this property, <code>LabelView</code>
     * re-syncs its state with the properties of the
     * <code>Element</code>'s <code>AttributeSet</code>.
     * If <code>Element</code>'s <code>AttributeSet</code>
     * does not have this property set, it will revert to false.
     *
     * @return the value of the cached
     *     <code>underline</code> property
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
     public Font getFont() {

    /**
     * Fetches the font that the glyphs should be based upon.
     * This is implemented to return a cached font.
     *
     * @return the cached font
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    public Color getForeground() {

    /**
     * Fetches the foreground color to use to render the glyphs.
     * This is implemented to return a cached foreground color,
     * which defaults to <code>null</code>.
     *
     * @return the cached foreground color
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    public Color getBackground() {

    /**
     * Fetches the background color to use to render the glyphs.
     * This is implemented to return a cached background color,
     * which defaults to <code>null</code>.
     *
     * @return the cached background color
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    @Deprecated

    /**
     * Fetches the <code>FontMetrics</code> used for this view.
     * @deprecated FontMetrics are not used for glyph rendering
     *  when running in the JDK.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    protected void setPropertiesFromAttributes() {

    /**
     * Sets the cached properties from the attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    protected void setBackground(Color bg) {

    /**
     * Sets the background color for the view. This method is typically
     * invoked as part of configuring this <code>View</code>. If you need
     * to customize the background color you should override
     * <code>setPropertiesFromAttributes</code> and invoke this method. A
     * value of null indicates no background should be rendered, so that the
     * background of the parent <code>View</code> will show through.
     *
     * @param bg background color, or null
     * @see #setPropertiesFromAttributes
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    protected void setSubscript(boolean s) {

    /**
     * Sets whether or not the view represents a
     * subscript.
     * Note that this setter is protected and is really
     * only meant if you need to update some additional
     * state when set.
     *
     * @param s true if the view represents a
     *          subscript, otherwise false
     * @see #isSubscript
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    protected void setSuperscript(boolean s) {

    /**
     * Sets whether or not the view represents a
     * superscript.
     * Note that this setter is protected and is really
     * only meant if you need to update some additional
     * state when set.
     *
     * @param s true if the view represents a
     *          superscript, otherwise false
     * @see #isSuperscript
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    protected void setStrikeThrough(boolean s) {

    /**
     * Sets whether or not the view has a strike/line
     * through it.
     * Note that this setter is protected and is really
     * only meant if you need to update some additional
     * state when set.
     *
     * @param s true if the view has a strike/line
     *          through it, otherwise false
     * @see #isStrikeThrough
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    protected void setUnderline(boolean u) {

    /**
     * Sets whether or not the view is underlined.
     * Note that this setter is protected and is really
     * only meant if you need to update some additional
     * state when set.
     *
     * @param u true if the view is underlined, otherwise
     *          false
     * @see #isUnderline
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    final void sync() {

    /**
     * Synchronize the view's cached values with the model.
     * This causes the font, metrics, color, etc to be
     * re-cached if the cache has been invalidated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
    public LabelView(Element elem) {

    /**
     * Constructs a new view wrapped on an element.
     *
     * @param elem the element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/LabelView.java
public class LabelView extends GlyphView implements TabableView {

/**
 * A <code>LabelView</code> is a styled chunk of text
 * that represents a view mapped over an element in the
 * text model.  It caches the character level attributes
 * used for rendering.
 *
 * @author Timothy Prinzing
 */
