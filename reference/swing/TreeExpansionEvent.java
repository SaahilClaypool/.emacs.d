_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TreeExpansionEvent.java
    public TreePath getPath() { return path; }

    /**
      * Returns the path to the value that has been expanded/collapsed.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TreeExpansionEvent.java
    public TreeExpansionEvent(Object source, TreePath path) {

    /**
     * Constructs a TreeExpansionEvent object.
     *
     * @param source  the Object that originated the event
     *                (typically <code>this</code>)
     * @param path    a TreePath object identifying the newly expanded
     *                node
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TreeExpansionEvent.java
    protected TreePath              path;

    /**
      * Path to the value this event represents.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/TreeExpansionEvent.java
public class TreeExpansionEvent extends EventObject

/**
 * An event used to identify a single path in a tree.  The source
 * returned by <b>getSource</b> will be an instance of JTree.
 * <p>
 * For further documentation and examples see
 * the following sections in <em>The Java Tutorial</em>:
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/treeexpansionlistener.html">How to Write a Tree Expansion Listener</a> and
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/treewillexpandlistener.html">How to Write a Tree-Will-Expand Listener</a>.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author Scott Violet
 */
