_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/MutableTreeNode.java
    void setParent(MutableTreeNode newParent);

    /**
     * Sets the parent of the receiver to <code>newParent</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/MutableTreeNode.java
    void removeFromParent();

    /**
     * Removes the receiver from its parent.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/MutableTreeNode.java
    void setUserObject(Object object);

    /**
     * Resets the user object of the receiver to <code>object</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/MutableTreeNode.java
    void remove(MutableTreeNode node);

    /**
     * Removes <code>node</code> from the receiver. <code>setParent</code>
     * will be messaged on <code>node</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/MutableTreeNode.java
    void remove(int index);

    /**
     * Removes the child at <code>index</code> from the receiver.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/MutableTreeNode.java
    void insert(MutableTreeNode child, int index);

    /**
     * Adds <code>child</code> to the receiver at <code>index</code>.
     * <code>child</code> will be messaged with <code>setParent</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//tree/MutableTreeNode.java
public interface MutableTreeNode extends TreeNode

/**
 * Defines the requirements for a tree node object that can change --
 * by adding or removing child nodes, or by changing the contents
 * of a user object stored in the node.
 *
 * @see DefaultMutableTreeNode
 * @see javax.swing.JTree
 *
 * @author Rob Davis
 * @author Scott Violet
 */
