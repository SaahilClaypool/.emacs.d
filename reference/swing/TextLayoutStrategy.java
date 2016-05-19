_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        public Set<Attribute> getAllAttributeKeys() {

        /**
         * Returns the keys of all attributes defined on the
         * iterator's text range. The set is empty if no
         * attributes are defined.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        public Object getAttribute(AttributedCharacterIterator.Attribute attribute) {

        /**
         * Returns the value of the named attribute for the current character.
         * Returns null if the attribute is not defined.
         * @param attribute the key of the attribute whose value is requested.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        public Map<Attribute, Object> getAttributes() {

        /**
         * Returns a map with the attributes defined on the current
         * character.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        public int getRunLimit(Set<? extends Attribute> attributes) {

        /**
         * Returns the index of the first character following the run
         * with respect to the given attributes containing the current character.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        public int getRunLimit(AttributedCharacterIterator.Attribute attribute) {

        /**
         * Returns the index of the first character following the run
         * with respect to the given attribute containing the current character.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        public int getRunLimit() {

        /**
         * Returns the index of the first character following the run
         * with respect to all attributes containing the current character.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        public int getRunStart(Set<? extends Attribute> attributes) {

        /**
         * Returns the index of the first character of the run
         * with respect to the given attributes containing the current character.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        public int getRunStart(AttributedCharacterIterator.Attribute attribute) {

        /**
         * Returns the index of the first character of the run
         * with respect to the given attribute containing the current character.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        public int getRunStart() {

        /**
         * Returns the index of the first character of the run
         * with respect to all attributes containing the current character.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        Font getFont(int childIndex) {

        /**
         * Get the font at the given child index.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
        int getFontBoundary(int childIndex, int dir) {

        /**
         * Get a boundary position for the font.
         * This is implemented to assume that two fonts are
         * equal if their references are equal (i.e. that the
         * font came from a cache).
         *
         * @return the location in model coordinates.  This is
         *  not the same as the Segment coordinates.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    static class AttributedSegment extends Segment implements AttributedCharacterIterator {

    /**
     * Implementation of AttributedCharacterIterator that supports
     * the GlyphView attributes for rendering the glyphs through a
     * TextLayout.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    void sync(FlowView fv) {

    /**
     * Synchronize the strategy with its FlowView.  Allows the strategy
     * to update its state to account for changes in that portion of the
     * model represented by the FlowView.  Also allows the strategy
     * to update the FlowView in response to these changes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    int getLimitingOffset(View v, int startOffset, int spanLeft, boolean requireNextWord) {

    /**
     * Calculate the limiting offset for the next view fragment.
     * At most this would be the entire view (i.e. the limiting
     * offset would be the end offset in that case).  If the range
     * contains a tab or a direction change, that will limit the
     * offset to something less.  This value is then fed to the
     * LineBreakMeasurer as a limit to consider in addition to the
     * remaining span.
     *
     * @param v the logical view representing the starting offset.
     * @param startOffset the model location to start at.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    protected View createView(FlowView fv, int startOffset, int spanLeft, int rowIndex) {

    /**
     * Creates a unidirectional view that can be used to represent the
     * current chunk.  This can be either an entire view from the
     * logical view, or a fragment of the view.
     *
     * @param fv the view holding the flow
     * @param startOffset the start location for the view being created
     * @param spanLeft the about of span left to fill in the row
     * @param rowIndex the row the view will be placed into
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    protected void adjustRow(FlowView fv, int rowIndex, int desiredSpan, int x) {

    /**
     * Adjusts the given row if possible to fit within the
     * layout span.  Since all adjustments were already
     * calculated by the LineBreakMeasurer, this is implemented
     * to do nothing.
     *
     * @param r the row to adjust to the current layout
     *  span.
     * @param desiredSpan the current layout span >= 0
     * @param x the location r starts at.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    protected int layoutRow(FlowView fv, int rowIndex, int p0) {

    /**
     * Creates a row of views that will fit within the
     * layout span of the row.  This is implemented to execute the
     * superclass functionality (which fills the row with child
     * views or view fragments) and follow that with bidi reordering
     * of the unidirectional view fragments.
     *
     * @param row the row to fill in with views.  This is assumed
     *   to be empty on entry.
     * @param pos  The current position in the children of
     *   this views element from which to start.
     * @return the position to start the next row
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    public void layout(FlowView fv) {

    /**
     * Does a a full layout on the given View.  This causes all of
     * the rows (child views) to be rebuilt to match the given
     * constraints for each row.  This is called by a FlowView.layout
     * to update the child views in the flow.
     *
     * @param fv the view to reflow
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    public void changedUpdate(FlowView fv, DocumentEvent e, Rectangle alloc) {

    /**
     * Gives notification from the document that attributes were changed
     * in a location that this view is responsible for.
     *
     * @param changes the change information from the associated document
     * @param a the current allocation of the view
     * @param f the factory to use to rebuild if the view has children
     * @see View#changedUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    public void removeUpdate(FlowView fv, DocumentEvent e, Rectangle alloc) {

    /**
     * Gives notification that something was removed from the document
     * in a location that the given flow view is responsible for.
     *
     * @param e the change information from the associated document
     * @param alloc the current allocation of the view inside of the insets.
     * @see View#removeUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    public void insertUpdate(FlowView fv, DocumentEvent e, Rectangle alloc) {

    /**
     * Gives notification that something was inserted into the document
     * in a location that the given flow view is responsible for.  The
     * strategy should update the appropriate changed region (which
     * depends upon the strategy used for repair).
     *
     * @param e the change information from the associated document
     * @param alloc the current allocation of the view inside of the insets.
     *   This value will be null if the view has not yet been displayed.
     * @see View#insertUpdate
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
    public TextLayoutStrategy() {

    /**
     * Constructs a layout strategy for paragraphs based
     * upon java.awt.font.LineBreakMeasurer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/TextLayoutStrategy.java
class TextLayoutStrategy extends FlowView.FlowStrategy {

/**
 * A flow strategy that uses java.awt.font.LineBreakMeasureer to
 * produce java.awt.font.TextLayout for i18n capable rendering.
 * If the child view being placed into the flow is of type
 * GlyphView and can be rendered by TextLayout, a GlyphPainter
 * that uses TextLayout is plugged into the GlyphView.
 *
 * @author  Timothy Prinzing
 */
