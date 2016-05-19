_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/TreeNode.java
    Enumeration children();

    /**
     * Returns the children of the receiver as an <code>Enumeration</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/TreeNode.java
    boolean isLeaf();

    /**
     * Returns true if the receiver is a leaf.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/TreeNode.java
    boolean getAllowsChildren();

    /**
     * Returns true if the receiver allows children.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/TreeNode.java
    int getIndex(TreeNode node);

    /**
     * Returns the index of <code>node</code> in the receivers children.
     * If the receiver does not contain <code>node</code>, -1 will be
     * returned.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/TreeNode.java
    TreeNode getParent();

    /**
     * Returns the parent <code>TreeNode</code> of the receiver.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/TreeNode.java
    int getChildCount();

    /**
     * Returns the number of children <code>TreeNode</code>s the receiver
     * contains.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/TreeNode.java
    TreeNode getChildAt(int childIndex);

    /**
     * Returns the child <code>TreeNode</code> at index
     * <code>childIndex</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/TreeNode.java
public interface TreeNode

/**
 * Defines the requirements for an object that can be used as a
 * tree node in a JTree.
 * <p>
 * Implementations of <code>TreeNode</code> that override <code>equals</code>
 * will typically need to override <code>hashCode</code> as well.  Refer
 * to {@link javax.swing.tree.TreeModel} for more information.
 *
 * For further information and examples of using tree nodes,
 * see <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/tree.html">How to Use Tree Nodes</a>
 * in <em>The Java Tutorial.</em>
 *
 * @author Rob Davis
 * @author Scott Violet
 */
