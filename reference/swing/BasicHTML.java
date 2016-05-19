_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public ViewFactory getViewFactory() {

        /**
         * Fetches the factory to be used for building the
         * various view fragments that make up the view that
         * represents the model.  This is what determines
         * how the model will be represented.  This is implemented
         * to fetch the factory provided by the associated
         * EditorKit.
         *
         * @return the factory
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public Container getContainer() {

        /**
         * Fetches the container hosting the view.  This is useful for
         * things like scheduling a repaint, finding out the host
         * components font, etc.  The default implementation
         * of this is to forward the query to the parent view.
         *
         * @return the container
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public void setSize(float width, float height) {

        /**
         * Sets the view size.
         *
         * @param width the width
         * @param height the height
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public Element getElement() {

        /**
         * Gets the element that this view is mapped to.
         *
         * @return the view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public int getEndOffset() {

        /**
         * Returns the ending offset into the model for this view.
         *
         * @return the ending offset
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public int getStartOffset() {

        /**
         * Returns the starting offset into the model for this view.
         *
         * @return the starting offset
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public Document getDocument() {

        /**
         * Returns the document model underlying the view.
         *
         * @return the model
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public int viewToModel(float x, float y, Shape a, Position.Bias[] bias) {

        /**
         * Provides a mapping from the view coordinate space to the logical
         * coordinate space of the model.
         *
         * @param x x coordinate of the view location to convert
         * @param y y coordinate of the view location to convert
         * @param a the allocated region to render into
         * @return the location within the model that best represents the
         *    given point in the view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public Shape modelToView(int p0, Position.Bias b0, int p1,
                                 Position.Bias b1, Shape a) throws BadLocationException {

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.
         *
         * @param p0 the position to convert >= 0
         * @param b0 the bias toward the previous character or the
         *  next character represented by p0, in case the
         *  position is a boundary of two views.
         * @param p1 the position to convert >= 0
         * @param b1 the bias toward the previous character or the
         *  next character represented by p1, in case the
         *  position is a boundary of two views.
         * @param a the allocated region to render into
         * @return the bounding box of the given position is returned
         * @exception BadLocationException  if the given position does
         *   not represent a valid location in the associated document
         * @exception IllegalArgumentException for an invalid bias argument
         * @see View#viewToModel
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {

        /**
         * Provides a mapping from the document model coordinate space
         * to the coordinate space of the view mapped to it.
         *
         * @param pos the position to convert
         * @param a the allocated region to render into
         * @return the bounding box of the given position
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public View getView(int n) {

        /**
         * Gets the n-th view in this container.
         *
         * @param n the number of the view to get
         * @return the view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public int getViewCount() {

        /**
         * Returns the number of views in this view.  Since
         * this view simply wraps the root of the view hierarchy
         * it has exactly one child.
         *
         * @return the number of views
         * @see #getView
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public void setParent(View parent) {

        /**
         * Sets the view parent.
         *
         * @param parent the parent view
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public void paint(Graphics g, Shape allocation) {

        /**
         * Renders the view.
         *
         * @param g the graphics context
         * @param allocation the region to render into
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public float getAlignment(int axis) {

        /**
         * Determines the desired alignment for this view along an axis.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return the desired alignment, where 0.0 indicates the origin
         *     and 1.0 the full span away from the origin
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public void preferenceChanged(View child, boolean width, boolean height) {

        /**
         * Specifies that a preference has changed.
         * Child views can call this on the parent to indicate that
         * the preference has changed.  The root view routes this to
         * invalidate on the hosting component.
         * <p>
         * This can be called on a different thread from the
         * event dispatching thread and is basically unsafe to
         * propagate into the component.  To make this safe,
         * the operation is transferred over to the event dispatching
         * thread for completion.  It is a design goal that all view
         * methods be safe to call without concern for concurrency,
         * and this behavior helps make that true.
         *
         * @param child the child view
         * @param width true if the width preference has changed
         * @param height true if the height preference has changed
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public float getMaximumSpan(int axis) {

        /**
         * Determines the maximum span for this view along an axis.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return the span the view would like to be rendered into.
         *         Typically the view is told to render into the span
         *         that is returned, although there is no guarantee.
         *         The parent may choose to resize or break the view.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public float getMinimumSpan(int axis) {

        /**
         * Determines the minimum span for this view along an axis.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return the span the view would like to be rendered into.
         *         Typically the view is told to render into the span
         *         that is returned, although there is no guarantee.
         *         The parent may choose to resize or break the view.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public float getPreferredSpan(int axis) {

        /**
         * Determines the preferred span for this view along an axis.
         *
         * @param axis may be either X_AXIS or Y_AXIS
         * @return the span the view would like to be rendered into.
         *         Typically the view is told to render into the span
         *         that is returned, although there is no guarantee.
         *         The parent may choose to resize or break the view.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public AttributeSet getAttributes() {

        /**
         * Fetches the attributes to use when rendering.  At the root
         * level there are no attributes.  If an attribute is resolved
         * up the view hierarchy this is the end of the line.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    static class Renderer extends View {

    /**
     * Root text view that acts as an HTML renderer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        private void setFontAndColor(Font font, Color fg) {

        /**
         * Sets the default font and default color. These are set by
         * adding a rule for the body that specifies the font and color.
         * This allows the html to override these should it wish to have
         * a custom font or color.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        // private JComponent host;

        /** The host, that is where we are rendering. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    static class BasicDocument extends HTMLDocument {

    /**
     * The subclass of HTMLDocument that is used as the model. getForeground
     * is overridden to return the foreground property from the Component this
     * was created for.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    static class BasicHTMLViewFactory extends HTMLEditorKit.HTMLFactory {

    /**
     * BasicHTMLViewFactory extends HTMLFactory to force images to be loaded
     * synchronously.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public ViewFactory getViewFactory() {

        /**
         * Returns the ViewFactory that is used to make sure the Views don't
         * load in the background.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public Document createDefaultDocument(Font defaultFont,
                                              Color foreground) {

        /**
         * Sets the async policy to flush everything in one chunk, and
         * to not display unknown tags.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        public StyleSheet getStyleSheet() {

        /**
         * Overriden to return our own slimmed down style sheet.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
        private static StyleSheet defaultStyles;

        /** Shared base style for all documents created by us use. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    static class BasicEditorKit extends HTMLEditorKit {

    /**
     * The views produced for the ComponentUI implementations aren't
     * going to be edited and don't need full html support.  This kit
     * alters the HTMLEditorKit to try and trim things down a bit.
     * It does the following:
     * <ul>
     * <li>It doesn't produce Views for things like comments,
     * head, title, unknown tags, etc.
     * <li>It installs a different set of css settings from the default
     * provided by HTMLEditorKit.
     * </ul>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    private static final String styleChanges =

    /**
     * Overrides to the default stylesheet.  Should consider
     * just creating a completely fresh stylesheet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    private static ViewFactory basicHTMLViewFactory;

    /**
     * Creates the Views that visually represent the model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    private static BasicEditorKit basicHTMLFactory;

    /**
     * The source of the html renderers
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    public static final String documentBaseKey = "html.base";

    /**
     * Key stored as a client property to indicate the base that relative
     * references are resolved against. For example, lets say you keep
     * your images in the directory resources relative to the code path,
     * you would use the following the set the base:
     * <pre>
     *   jComponent.putClientProperty(documentBaseKey,
     *                                xxx.class.getResource("resources/"));
     * </pre>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    public static final String propertyKey = "html";

    /**
     * Key to use for the html renderer when stored as a
     * client property of a JComponent.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    private static final String htmlDisable = "html.disable";

    /**
     * If this client property of a JComponent is set to Boolean.TRUE
     * the component's 'text' property is never treated as HTML.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    public static void updateRenderer(JComponent c, String text) {

    /**
     * Stash the HTML render for the given text into the client
     * properties of the given JComponent. If the given text is
     * <em>NOT HTML</em> the property will be cleared of any
     * renderer.
     * <p>
     * This method is useful for ComponentUI implementations
     * that are static (i.e. shared) and get their state
     * entirely from the JComponent.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    public static boolean isHTMLString(String s) {

    /**
     * Check the given string to see if it should trigger the
     * html rendering logic in a non-text component that supports
     * html rendering.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    static int getBaseline(View view, int w, int h) {

    /**
     * Gets the baseline for the specified View.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    static int getBaseline(JComponent c, int y, int ascent,
                                  int w, int h) {

    /**
     * Gets the baseline for the specified component.  This digs out
     * the View client property, and if non-null the baseline is calculated
     * from it.  Otherwise the baseline is the value <code>y + ascent</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    public static int getHTMLBaseline(View view, int w, int h) {

    /**
     * Returns the baseline for the html renderer.
     *
     * @param view the View to get the baseline for
     * @param w the width to get the baseline for
     * @param h the height to get the baseline for
     * @throws IllegalArgumentException if width or height is &lt; 0
     * @return baseline or a value &lt; 0 indicating there is no reasonable
     *                  baseline
     * @see java.awt.FontMetrics
     * @see javax.swing.JComponent#getBaseline(int,int)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
    public static View createHTMLView(JComponent c, String html) {

    /**
     * Create an html renderer for the given component and
     * string of html.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicHTML.java
public class BasicHTML {

/**
 * Support for providing html views for the swing components.
 * This translates a simple html string to a javax.swing.text.View
 * implementation that can render the html and provide the necessary
 * layout semantics.
 *
 * @author  Timothy Prinzing
 * @since 1.3
 */
