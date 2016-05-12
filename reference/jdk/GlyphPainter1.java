_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphPainter1.java
    private int[] getJustificationData(GlyphView v) {

    /**
     * @return justificationData from the ParagraphRow this GlyphView
     * is in or {@code null} if no justification is needed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphPainter1.java
    public int getBoundedPosition(GlyphView v, int p0, float x, float len) {

    /**
     * Determines the best location (in the model) to break
     * the given view.
     * This method attempts to break on a whitespace
     * location.  If a whitespace location can't be found, the
     * nearest character location is returned.
     *
     * @param v the view
     * @param p0 the location in the model where the
     *  fragment should start its representation >= 0
     * @param pos the graphic location along the axis that the
     *  broken view would occupy >= 0; this may be useful for
     *  things like tab calculations
     * @param len specifies the distance into the view
     *  where a potential break is desired >= 0
     * @return the model location desired for a break
     * @see View#breakView
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphPainter1.java
    public int viewToModel(GlyphView v, float x, float y, Shape a,
                           Position.Bias[] biasReturn) {

    /**
     * Provides a mapping from the view coordinate space to the logical
     * coordinate space of the model.
     *
     * @param v the view containing the view coordinates
     * @param x the X coordinate
     * @param y the Y coordinate
     * @param a the allocated region to render into
     * @param biasReturn always returns <code>Position.Bias.Forward</code>
     *   as the zero-th element of this array
     * @return the location within the model that best represents the
     *  given point in the view
     * @see View#viewToModel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphPainter1.java
    public void paint(GlyphView v, Graphics g, Shape a, int p0, int p1) {

    /**
     * Paints the glyphs representing the given range.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphPainter1.java
    public float getDescent(GlyphView v) {

    /**
     * Fetches the descent below the baseline for the glyphs
     * corresponding to the given range in the model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphPainter1.java
    public float getAscent(GlyphView v) {

    /**
     * Fetches the ascent above the baseline for the glyphs
     * corresponding to the given range in the model.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphPainter1.java
    public float getSpan(GlyphView v, int p0, int p1,
                         TabExpander e, float x) {

    /**
     * Determine the span the glyphs given a start location
     * (for tab expansion).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/GlyphPainter1.java
class GlyphPainter1 extends GlyphView.GlyphPainter {

/**
 * A class to perform rendering of the glyphs.
 * This can be implemented to be stateless, or
 * to hold some information as a cache to
 * facilitate faster rendering and model/view
 * translation.  At a minimum, the GlyphPainter
 * allows a View implementation to perform its
 * duties independent of a particular version
 * of JVM and selection of capabilities (i.e.
 * shaping for i18n, etc).
 * <p>
 * This implementation is intended for operation
 * under the JDK1.1 API of the Java Platform.
 * Since the JDK is backward compatible with
 * JDK1.1 API, this class will also function on
 * Java 2.  The JDK introduces improved
 * API for rendering text however, so the GlyphPainter2
 * is recommended for the DK.
 *
 * @author  Timothy Prinzing
 * @see GlyphView
 */
