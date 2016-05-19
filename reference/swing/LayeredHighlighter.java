_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayeredHighlighter.java
    static public abstract class LayerPainter implements Highlighter.HighlightPainter {

    /**
     * Layered highlight renderer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayeredHighlighter.java
    public abstract void paintLayeredHighlights(Graphics g, int p0, int p1,
                                                Shape viewBounds,
                                                JTextComponent editor,
                                                View view);

    /**
     * When leaf Views (such as LabelView) are rendering they should
     * call into this method. If a highlight is in the given region it will
     * be drawn immediately.
     *
     * @param g Graphics used to draw
     * @param p0 starting offset of view
     * @param p1 ending offset of view
     * @param viewBounds Bounds of View
     * @param editor JTextComponent
     * @param view View instance being rendered
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayeredHighlighter.java
public abstract class LayeredHighlighter implements Highlighter {

/**
 *
 * @author  Scott Violet
 * @author  Timothy Prinzing
 * @see     Highlighter
 */
