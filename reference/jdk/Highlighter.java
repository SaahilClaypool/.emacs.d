_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
        public HighlightPainter getPainter();

        /**
         * Gets the painter for the highlighter.
         *
         * @return the painter
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
        public int getEndOffset();

        /**
         * Gets the ending model offset for the highlight.
         *
         * @return the ending offset &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
        public int getStartOffset();

        /**
         * Gets the starting model offset for the highlight.
         *
         * @return the starting offset &gt;= 0
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
        public void paint(Graphics g, int p0, int p1, Shape bounds, JTextComponent c);

        /**
         * Renders the highlight.
         *
         * @param g the graphics context
         * @param p0 the starting offset in the model &gt;= 0
         * @param p1 the ending offset in the model &gt;= p0
         * @param bounds the bounding box for the highlight
         * @param c the editor
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
    public interface HighlightPainter {

    /**
     * Highlight renderer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
    public Highlight[] getHighlights();

    /**
     * Fetches the current list of highlights.
     *
     * @return the highlight list
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
    public void changeHighlight(Object tag, int p0, int p1) throws BadLocationException;

    /**
     * Changes the given highlight to span a different portion of
     * the document.  This may be more efficient than a remove/add
     * when a selection is expanding/shrinking (such as a sweep
     * with a mouse) by damaging only what changed.
     *
     * @param tag  which highlight to change
     * @param p0 the beginning of the range &gt;= 0
     * @param p1 the end of the range &gt;= p0
     * @exception BadLocationException for an invalid range specification
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
    public void removeAllHighlights();

    /**
     * Removes all highlights this highlighter is responsible for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
    public void removeHighlight(Object tag);

    /**
     * Removes a highlight from the view.
     *
     * @param tag  which highlight to remove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
    public Object addHighlight(int p0, int p1, HighlightPainter p) throws BadLocationException;

    /**
     * Adds a highlight to the view.  Returns a tag that can be used
     * to refer to the highlight.
     *
     * @param p0 the beginning of the range &gt;= 0
     * @param p1 the end of the range &gt;= p0
     * @param p the painter to use for the actual highlighting
     * @return an object that refers to the highlight
     * @exception BadLocationException for an invalid range specification
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
    public void paint(Graphics g);

    /**
     * Renders the highlights.
     *
     * @param g the graphics context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
    public void deinstall(JTextComponent c);

    /**
     * Called when the UI is being removed from the
     * interface of a JTextComponent.  This is used to
     * unregister any listeners that were attached.
     *
     * @param c the JTextComponent editor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
    public void install(JTextComponent c);

    /**
     * Called when the UI is being installed into the
     * interface of a JTextComponent.  This can be used
     * to gain access to the model that is being navigated
     * by the implementation of this interface.
     *
     * @param c the JTextComponent editor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Highlighter.java
public interface Highlighter {

/**
 * An interface for an object that allows one to mark up the background
 * with colored areas.
 *
 * @author  Timothy Prinzing
 */
