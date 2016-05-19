_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public boolean doAccessibleAction(int i) {

            /**
             * Perform the specified Action on the tree node.  If this node
             * is not a leaf, there is at least one action which can be
             * done (toggle expand), in addition to any available on the
             * object behind the TreeCellRenderer.
             *
             * @param i zero-based index of actions
             * @return true if the the action was performed; else false.
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public String getAccessibleActionDescription(int i) {

            /**
             * Return a description of the specified action of the tree node.
             * If this node is not a leaf, there is at least one action
             * description (toggle expand), in addition to any available
             * on the object behind the TreeCellRenderer.
             *
             * @param i zero-based index of the actions
             * @return a description of the action
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public int getAccessibleActionCount() {

            /**
             * Returns the number of accessible actions available in this
             * tree node.  If this node is not a leaf, there is at least
             * one action (toggle expand), in addition to any available
             * on the object behind the TreeCellRenderer.
             *
             * @return the number of Actions in this object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public void selectAllAccessibleSelection() {

            /**
             * Causes every selected item in the object to be selected
             * if the object supports multiple selections.
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public void clearAccessibleSelection() {

            /**
             * Clears the selection in the object, so that nothing in the
             * object is selected.
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public void removeAccessibleSelection(int i) {

            /**
             * Removes the specified selected item in the object from the
             * object's
             * selection.  If the specified item isn't currently selected, this
             * method has no effect.
             *
             * @param i the zero-based index of selectable items
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public void addAccessibleSelection(int i) {

            /**
             * Adds the specified selected item in the object to the object's
             * selection.  If the object supports multiple selections,
             * the specified item is added to any existing selection, otherwise
             * it replaces any existing selection in the object.  If the
             * specified item is already selected, this method has no effect.
             *
             * @param i the zero-based index of selectable items
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public boolean isAccessibleChildSelected(int i) {

            /**
             * Returns true if the current child of this object is selected.
             *
             * @param i the zero-based index of the child in this Accessible
             * object.
             * @see AccessibleContext#getAccessibleChild
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public Accessible getAccessibleSelection(int i) {

            /**
             * Returns an Accessible representing the specified selected item
             * in the object.  If there isn't a selection, or there are
             * fewer items selected than the integer passed in, the return
             * value will be null.
             *
             * @param i the zero-based index of selected items
             * @return an Accessible containing the selected item
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public int getAccessibleSelectionCount() {

            /**
             * Returns the number of items currently selected.
             * If no items are selected, the return value will be 0.
             *
             * @return the number of items currently selected.
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public Accessible getAccessibleAt(Point p) {

            /**
             * Returns the <code>Accessible</code> child, if one exists,
             * contained at the local coordinate <code>Point</code>.
             * Otherwise returns <code>null</code>.
             *
             * @param p point in local coordinates of this
             *    <code>Accessible</code>
             * @return the <code>Accessible</code>, if it exists,
             *    at the specified location; else <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public Color getForeground() {

            /**
             * Get the foreground color of this object.
             *
             * @return the foreground color, if supported, of the object;
             * otherwise, null
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public void setBackground(Color c) {

            /**
             * Set the background color of this object.
             *
             * @param c the new Color for the background
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public Color getBackground() {

            /**
             * Get the background color of this object.
             *
             * @return the background color, if supported, of the object;
             * otherwise, null
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public AccessibleValue getAccessibleValue() {

            /**
             * Get the AccessibleValue associated with this object if one
             * exists.  Otherwise return null.
             *
             * @return the AccessibleValue, or null
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public AccessibleText getAccessibleText() {

            /**
             * Get the AccessibleText associated with this object if one
             * exists.  Otherwise return null.
             *
             * @return the AccessibleText, or null
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public AccessibleSelection getAccessibleSelection() {

            /**
             * Get the AccessibleSelection associated with this object if one
             * exists.  Otherwise return null.
             *
             * @return the AccessibleSelection, or null
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public AccessibleComponent getAccessibleComponent() {

            /**
             * Get the AccessibleComponent associated with this object.  In the
             * implementation of the Java Accessibility API for this class,
             * return this object, which is responsible for implementing the
             * AccessibleComponent interface on behalf of itself.
             *
             * @return this object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public AccessibleAction getAccessibleAction() {

            /**
             * Get the AccessibleAction associated with this object.  In the
             * implementation of the Java Accessibility API for this class,
             * return this object, which is responsible for implementing the
             * AccessibleAction interface on behalf of itself.
             *
             * @return this object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public void removePropertyChangeListener(PropertyChangeListener l) {

            /**
             * Remove a PropertyChangeListener from the listener list.
             * This removes a PropertyChangeListener that was registered
             * for all properties.
             *
             * @param l  The PropertyChangeListener to be removed
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public void addPropertyChangeListener(PropertyChangeListener l) {

            /**
             * Add a PropertyChangeListener to the listener list.
             * The listener is registered for all properties.
             *
             * @param l  The PropertyChangeListener to be added
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public Locale getLocale() {

            /**
             * Gets the locale of the component. If the component does not have
             * a locale, then the locale of its parent is returned.
             *
             * @return This component's locale. If this component does not have
             * a locale, the locale of its parent is returned.
             * @exception IllegalComponentStateException
             * If the Component does not have its own locale and has not yet
             * been added to a containment hierarchy such that the locale can be
             * determined from the containing parent.
             * @see #setLocale
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public Accessible getAccessibleChild(int i) {

            /**
             * Return the specified Accessible child of the object.
             *
             * @param i zero-based index of child
             * @return the Accessible child of the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public int getAccessibleChildrenCount() {

            /**
             * Returns the number of accessible children in the object.
             *
             * @return the number of accessible children in the object.
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public int getAccessibleIndexInParent() {

            /**
             * Get the index of this object in its accessible parent.
             *
             * @return the index of this object in its parent; -1 if this
             * object does not have an accessible parent.
             * @see #getAccessibleParent
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public Accessible getAccessibleParent() {

            /**
             * Get the Accessible parent of this object.
             *
             * @return the Accessible parent of this object; null if this
             * object does not have an Accessible parent
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public AccessibleStateSet getAccessibleStateSet() {

            /**
             * Get the state set of this object.
             *
             * @return an instance of AccessibleStateSet containing the
             * current state set of the object
             * @see AccessibleState
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Get the role of this object.
             *
             * @return an instance of AccessibleRole describing the role of the object
             * @see AccessibleRole
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public void setAccessibleDescription(String s) {

            /**
             * Set the accessible description of this object.
             *
             * @param s the new localized description of the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public String getAccessibleDescription() {

            /**
             * Get the accessible description of this object.
             *
             * @return the localized description of the object; null if
             * this object does not have a description
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public void setAccessibleName(String s) {

            /**
             * Set the localized accessible name of this object.
             *
             * @param s the new localized name of the object.
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
             public String getAccessibleName() {

             /**
              * Get the accessible name of this object.
              *
              * @return the localized name of the object; null if this
              * object does not have a name
              */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public AccessibleContext getAccessibleContext() {

            /**
             * Get the AccessibleContext associated with this tree node.
             * In the implementation of the Java Accessibility API for
             * this class, return this object, which is its own
             * AccessibleContext.
             *
             * @return this object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
            public AccessibleJTreeNode(JTree t, TreePath p, Accessible ap) {

            /**
             *  Constructs an AccessibleJTreeNode
             * @since 1.4
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        protected class AccessibleJTreeNode extends AccessibleContext

        /**
         * This class implements accessibility support for the
         * <code>JTree</code> child.  It provides an implementation of the
         * Java Accessibility API appropriate to tree nodes.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void selectAllAccessibleSelection() {

        /**
         * Causes every selected item in the object to be selected
         * if the object supports multiple selections.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void clearAccessibleSelection() {

        /**
         * Clears the selection in the object, so that nothing in the
         * object is selected.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void removeAccessibleSelection(int i) {

        /**
         * Removes the specified selected item in the object from the object's
         * selection.  If the specified item isn't currently selected, this
         * method has no effect.
         *
         * @param i the zero-based index of selectable items
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void addAccessibleSelection(int i) {

        /**
         * Adds the specified selected item in the object to the object's
         * selection.  If the object supports multiple selections,
         * the specified item is added to any existing selection, otherwise
         * it replaces any existing selection in the object.  If the
         * specified item is already selected, this method has no effect.
         *
         * @param i the zero-based index of selectable items
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public boolean isAccessibleChildSelected(int i) {

        /**
         * Returns true if the current child of this object is selected.
         *
         * @param i the zero-based index of the child in this Accessible object.
         * @see AccessibleContext#getAccessibleChild
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public Accessible getAccessibleSelection(int i) {

        /**
         * Returns an Accessible representing the specified selected item
         * in the object.  If there isn't a selection, or there are
         * fewer items selected than the integer passed in, the return
         * value will be null.
         *
         * @param i the zero-based index of selected items
         * @return an Accessible containing the selected item
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public int getAccessibleSelectionCount() {

        /**
         * Returns the number of items currently selected.
         * If no items are selected, the return value will be 0.
         *
         * @return the number of items currently selected.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public AccessibleSelection getAccessibleSelection() {

        /**
         * Get the AccessibleSelection associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * return this object, which is responsible for implementing the
         * AccessibleSelection interface on behalf of itself.
         *
         * @return this object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public int getAccessibleIndexInParent() {

        /**
         * Get the index of this object in its accessible parent.
         *
         * @return the index of this object in its parent.  Since a JTree
         * top-level object does not have an accessible parent.
         * @see #getAccessibleParent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Return the nth Accessible child of the object.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of top-level children nodes of this
         * JTree.  Each of these nodes may in turn have children nodes.
         *
         * @return the number of accessible children nodes in the tree.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the <code>Accessible</code> child, if one exists,
         * contained at the local coordinate <code>Point</code>.
         * Otherwise returns <code>null</code>.
         *
         * @param p point in local coordinates of this <code>Accessible</code>
         * @return the <code>Accessible</code>, if it exists,
         *    at the specified location; else <code>null</code>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        void fireActiveDescendantPropertyChange(TreePath oldPath, TreePath newPath){

        /**
        *  Fire an active descendant property change notification.
        *  The active descendant is used for objects such as list,
        *  tree, and table, which may have transient children.
        *  It notifies screen readers the active child of the component
        *  has been changed so user can be notified from there.
        *
        * @param oldPath - lead path of previous active child
        * @param newPath - lead path of current active child
        *
        */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public  void treeExpanded(TreeExpansionEvent e) {

        /**
         * Tree Model Expansion notification.
         *
         * @param e  a Tree node insertion event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public  void treeCollapsed(TreeExpansionEvent e) {

        /**
         * Tree Collapsed notification.
         *
         * @param e  a TreeExpansionEvent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public  void treeStructureChanged(TreeModelEvent e) {

        /**
         * Tree Model structure change change notification.
         *
         * @param e  a Tree Model event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public  void treeNodesRemoved(TreeModelEvent e) {

        /**
         * Tree Model Node change notification.
         *
         * @param e  a Tree node(s) removal event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void treeNodesInserted(TreeModelEvent e) {

        /**
         * Tree Model Node change notification.
         *
         * @param e  a Tree node insertion event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void treeNodesChanged(TreeModelEvent e) {

        /**
         * Tree Model Node change notification.
         *
         * @param e  a Tree Model event
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void fireVisibleDataPropertyChange() {

        /**
         * Fire a visible data property change notification.
         * A 'visible' data property is one that represents
         * something about the way the component appears on the
         * display, where that appearance isn't bound to any other
         * property. It notifies screen readers  that the visual
         * appearance of the component has changed, so they can
         * notify the user.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void valueChanged(TreeSelectionEvent e) {

        /**
         * Tree Selection Listener value change method. Used to fire the
         * property change
         *
         * @param e ListSelectionEvent
         *
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JTree</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to tree user-interface elements.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JTree</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JTree</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public Enumeration children() {

        /**
         * Subclassed to load the children, if necessary.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public TreeNode getChildAt(int index) {

        /**
         * Subclassed to load the children, if necessary.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        protected void loadChildren() {

        /**
         * Loads the children based on <code>childValue</code>.
         * If <code>childValue</code> is a <code>Vector</code>
         * or array each element is added as a child,
         * if <code>childValue</code> is a <code>Hashtable</code>
         * each key/value pair is added in the order that
         * <code>Enumeration</code> returns the keys.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public int getChildCount() {

        /**
         * Returns the number of child nodes.
         *
         * @return the number of child nodes
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public boolean isLeaf() {

        /**
         * Returns true if this node allows children. Whether the node
         * allows children depends on how it was created.
         *
         * @return true if this node allows children, false otherwise
         * @see JTree.DynamicUtilTreeNode
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public DynamicUtilTreeNode(Object value, Object children) {

        /**
         * Creates a node with the specified object as its value and
         * with the specified children. For the node to allow children,
         * the children-object must be an array of objects, a
         * <code>Vector</code>, or a <code>Hashtable</code> -- even
         * if empty. Otherwise, the node is not
         * allowed to have children.
         *
         * @param value  the <code>Object</code> that is the value for the
         *              new node
         * @param children an array of <code>Object</code>s, a
         *              <code>Vector</code>, or a <code>Hashtable</code>
         *              used to create the child nodes; if any other
         *              object is specified, or if the value is
         *              <code>null</code>,
         *              then the node is not allowed to have children
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public static void createChildren(DefaultMutableTreeNode parent,
                                          Object children) {

        /**
         * Adds to parent all the children in <code>children</code>.
         * If <code>children</code> is an array or vector all of its
         * elements are added is children, otherwise if <code>children</code>
         * is a hashtable all the key/value pairs are added in the order
         * <code>Enumeration</code> returns them.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        protected boolean            loadedChildren;

        /** Have the children been loaded yet? */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        protected Object             childValue;

        /** Value to create children with. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        protected boolean            hasChildren;

        /**
         * Does the this <code>JTree</code> have children?
         * This property is currently not implemented.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    @SuppressWarnings("serial")

    /**
     * <code>DynamicUtilTreeNode</code> can wrap
     * vectors/hashtables/arrays/strings and
     * create the appropriate children tree nodes as necessary. It is
     * dynamic in that it will only create the children as necessary.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected class TreeModelHandler implements TreeModelListener {

     /**
      * Listens to the model and updates the <code>expandedState</code>
      * accordingly when nodes are removed, or changed.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    void removeDescendantSelectedPaths(TreeModelEvent e) {

    /**
     * Removes any paths from the selection model that are descendants of
     * the nodes identified by in <code>e</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private TreePath[] getDescendantSelectedPaths(TreePath path,
                                                  boolean includePath) {

    /**
     * Returns an array of paths in the selection that are descendants of
     * <code>path</code>. The returned array may contain <code>null</code>s.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected boolean removeDescendantSelectedPaths(TreePath path,
                                                    boolean includePath) {

    /**
     * Removes any paths in the selection that are descendants of
     * <code>path</code>. If <code>includePath</code> is true and
     * <code>path</code> is selected, it will be removed from the selection.
     *
     * @return true if a descendant was selected
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
     protected TreeModelListener createTreeModelListener() {

     /**
      * Creates and returns an instance of <code>TreeModelHandler</code>.
      * The returned
      * object is responsible for updating the expanded state when the
      * <code>TreeModel</code> changes.
      * <p>
      * For more information on what expanded state means, see the
      * <a href=#jtree_description>JTree description</a> above.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
     protected void clearToggledPaths() {

     /**
      * Clears the cache of toggled tree paths. This does NOT send out
      * any <code>TreeExpansionListener</code> events.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
     protected void

    /**
     * Removes any descendants of the <code>TreePaths</code> in
     * <code>toRemove</code>
     * that have been expanded.
     *
     * @param toRemove an enumeration of the paths to remove; a value of
     *        {@code null} is ignored
     * @throws ClassCastException if {@code toRemove} contains an
     *         element that is not a {@code TreePath}; {@code null}
     *         values are ignored
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected Enumeration<TreePath>

    /**
     * Returns an <code>Enumeration</code> of <code>TreePaths</code>
     * that have been expanded that
     * are descendants of <code>parent</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected void setExpandedState(TreePath path, boolean state) {

    /**
     * Sets the expanded state of this <code>JTree</code>.
     * If <code>state</code> is
     * true, all parents of <code>path</code> and path are marked as
     * expanded. If <code>state</code> is false, all parents of
     * <code>path</code> are marked EXPANDED, but <code>path</code> itself
     * is marked collapsed.<p>
     * This will fail if a <code>TreeWillExpandListener</code> vetos it.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean getScrollableTracksViewportHeight() {

    /**
     * Returns false to indicate that the height of the viewport does not
     * determine the height of the table, unless the preferred height
     * of the tree is smaller than the viewports height.  In other words:
     * ensure that the tree is never smaller than its viewport.
     *
     * @return whether the tree should track the height of the viewport
     * @see Scrollable#getScrollableTracksViewportHeight
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean getScrollableTracksViewportWidth() {

    /**
     * Returns false to indicate that the width of the viewport does not
     * determine the width of the table, unless the preferred width of
     * the tree is smaller than the viewports width.  In other words:
     * ensure that the tree is never smaller than its viewport.
     *
     * @return whether the tree should track the width of the viewport
     * @see Scrollable#getScrollableTracksViewportWidth
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getScrollableBlockIncrement(Rectangle visibleRect,
                                           int orientation, int direction) {

    /**
     * Returns the amount for a block increment, which is the height or
     * width of <code>visibleRect</code>, based on <code>orientation</code>.
     *
     * @param visibleRect the view area visible within the viewport
     * @param orientation either <code>SwingConstants.VERTICAL</code>
     *          or <code>SwingConstants.HORIZONTAL</code>
     * @param direction less than zero to scroll up/left,
     *          greater than zero for down/right.
     * @return the "block" increment for scrolling in the specified direction
     * @see JScrollBar#setBlockIncrement(int)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getScrollableUnitIncrement(Rectangle visibleRect,
                                          int orientation, int direction) {

    /**
     * Returns the amount to increment when scrolling. The amount is
     * the height of the first displayed row that isn't completely in view
     * or, if it is totally displayed, the height of the next row in the
     * scrolling direction.
     *
     * @param visibleRect the view area visible within the viewport
     * @param orientation either <code>SwingConstants.VERTICAL</code>
     *          or <code>SwingConstants.HORIZONTAL</code>
     * @param direction less than zero to scroll up/left,
     *          greater than zero for down/right
     * @return the "unit" increment for scrolling in the specified direction
     * @see JScrollBar#setUnitIncrement(int)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public Dimension getPreferredScrollableViewportSize() {

    /**
     * Returns the preferred display size of a <code>JTree</code>. The height is
     * determined from <code>getVisibleRowCount</code> and the width
     * is the current preferred width.
     *
     * @return a <code>Dimension</code> object containing the preferred size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void valueChanged(TreeSelectionEvent e) {

        /**
         * Invoked by the <code>TreeSelectionModel</code> when the
         * selection changes.
         *
         * @param e the <code>TreeSelectionEvent</code> generated by the
         *              <code>TreeSelectionModel</code>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    @SuppressWarnings("serial")

    /**
     * Handles creating a new <code>TreeSelectionEvent</code> with the
     * <code>JTree</code> as the
     * source and passing it off to all the listeners.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void removePropertyChangeListener(
                                PropertyChangeListener listener) {

        /**
         * This is overriden to do nothing; {@code EmptySelectionModel}
         * does not allow a selection.
         *
         * @param listener the listener to remove; this is ignored
         * @since 1.7
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void addPropertyChangeListener(
                                PropertyChangeListener listener) {

        /**
         * This is overriden to do nothing; {@code EmptySelectionModel}
         * does not allow a selection.
         *
         * @param listener the listener to add; this is ignored
         * @since 1.7
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void removeTreeSelectionListener(
                TreeSelectionListener listener) {

        /**
         * This is overriden to do nothing; {@code EmptySelectionModel}
         * does not allow a selection.
         *
         * @param listener the listener to remove; this is ignored
         * @since 1.7
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void addTreeSelectionListener(TreeSelectionListener listener) {

        /**
         * This is overriden to do nothing; {@code EmptySelectionModel}
         * does not allow a selection.
         *
         * @param listener the listener to add; this is ignored
         * @since 1.7
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void setRowMapper(RowMapper mapper) {

        /**
         * This is overriden to do nothing; {@code EmptySelectionModel}
         * does not allow a selection.
         *
         * @param mapper the {@code RowMapper} instance; this is ignored
         * @since 1.7
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void setSelectionMode(int mode) {

        /**
         * This is overriden to do nothing; {@code EmptySelectionModel}
         * does not allow a selection.
         *
         * @param mode the selection mode; this is ignored
         * @since 1.7
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void removeSelectionPaths(TreePath[] paths) {}

        /**
         * This is overriden to do nothing; {@code EmptySelectionModel}
         * does not allow a selection.
         *
         * @param paths the paths to remove; this is ignored
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void addSelectionPaths(TreePath[] paths) {}

        /**
         * This is overriden to do nothing; {@code EmptySelectionModel}
         * does not allow a selection.
         *
         * @param paths the paths to add to the selection; this is ignored
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public void setSelectionPaths(TreePath[] paths) {}

        /**
         * This is overriden to do nothing; {@code EmptySelectionModel}
         * does not allow a selection.
         *
         * @param paths the paths to select; this is ignored
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        static public EmptySelectionModel sharedInstance() {

        /**
         * Returns the single instance of {@code EmptySelectionModel}.
         *
         * @return single instance of {@code EmptySelectionModel}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        protected static final EmptySelectionModel sharedInstance =

        /**
         * The single instance of {@code EmptySelectionModel}.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    @SuppressWarnings("serial")

    /**
     * <code>EmptySelectionModel</code> is a <code>TreeSelectionModel</code>
     * that does not allow anything to be selected.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private TreePath getPathForIndexs(int[] indexs) {

    /**
     * Returns a <code>TreePath</code> created by obtaining the children
     * for each of the indices in <code>indexs</code>. If <code>indexs</code>
     * or the <code>TreeModel</code> is <code>null</code>, it will return
     * <code>null</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private int[] getModelIndexsForPath(TreePath path) {

    /**
     * Returns an array of integers specifying the indexs of the
     * components in the <code>path</code>. If <code>path</code> is
     * the root, this will return an empty array.  If <code>path</code>
     * is <code>null</code>, <code>null</code> will be returned.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private void unarchiveExpandedState(Object state) {

    /**
     * Updates the expanded state of nodes in the tree based on the
     * previously archived state <code>state</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private Object getArchivableExpandedState() {

    /**
     * Returns an object that can be archived indicating what nodes are
     * expanded and what aren't. The objects from the model are NOT
     * written out.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreePath getNextMatch(String prefix, int startingRow,
                                 Position.Bias bias) {

    /**
     * Returns the TreePath to the next tree element that
     * begins with a prefix. To handle the conversion of a
     * <code>TreePath</code> into a String, <code>convertValueToText</code>
     * is used.
     *
     * @param prefix the string to test for a match
     * @param startingRow the row for starting the search
     * @param bias the search direction, either
     * Position.Bias.Forward or Position.Bias.Backward.
     * @return the TreePath of the next tree element that
     * starts with the prefix; otherwise null
     * @exception IllegalArgumentException if prefix is null
     * or startingRow is out of bounds
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private void expandRoot() {

    /**
     * Expands the root path, assuming the current TreeModel has been set.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getVisibleRowCount() {

    /**
     * Returns the number of rows that are displayed in the display area.
     *
     * @return the number of rows displayed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setVisibleRowCount(int newCount) {

    /**
     * Sets the number of rows that are to be displayed.
     * This will only work if the tree is contained in a
     * <code>JScrollPane</code>,
     * and will adjust the preferred size and size of that scrollpane.
     * <p>
     * This is a bound property.
     *
     * @param newCount the number of rows to display
     * @beaninfo
     *        bound: true
     *  description: The number of rows that are to be displayed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void treeDidChange() {

    /**
     * Sent when the tree has changed enough that we need to resize
     * the bounds, but not enough that we need to remove the
     * expanded node set (e.g nodes were expanded or collapsed, or
     * nodes were inserted into the tree). You should never have to
     * invoke this, the UI will invoke this as it needs to.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected void fireValueChanged(TreeSelectionEvent e) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.
     *
     * @param e the <code>TreeSelectionEvent</code> to be fired;
     *          generated by the
     *          <code>TreeSelectionModel</code>
     *          when a node is selected or deselected
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreeSelectionListener[] getTreeSelectionListeners() {

    /**
     * Returns an array of all the <code>TreeSelectionListener</code>s added
     * to this JTree with addTreeSelectionListener().
     *
     * @return all of the <code>TreeSelectionListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void removeTreeSelectionListener(TreeSelectionListener tsl) {

    /**
     * Removes a <code>TreeSelection</code> listener.
     *
     * @param tsl the <code>TreeSelectionListener</code> to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void addTreeSelectionListener(TreeSelectionListener tsl) {

    /**
     * Adds a listener for <code>TreeSelection</code> events.
     *
     * @param tsl the <code>TreeSelectionListener</code> that will be notified
     *            when a node is selected or deselected (a "negative
     *            selection")
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
     public void fireTreeWillCollapse(TreePath path) throws ExpandVetoException {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the <code>path</code> parameter.
     *
     * @param path the <code>TreePath</code> indicating the node that was
     *          expanded
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
     public void fireTreeWillExpand(TreePath path) throws ExpandVetoException {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the <code>path</code> parameter.
     *
     * @param path the <code>TreePath</code> indicating the node that was
     *          expanded
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void fireTreeCollapsed(TreePath path) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the <code>path</code> parameter.
     *
     * @param path the <code>TreePath</code> indicating the node that was
     *          collapsed
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
     public void fireTreeExpanded(TreePath path) {

    /**
     * Notifies all listeners that have registered interest for
     * notification on this event type.  The event instance
     * is lazily created using the <code>path</code> parameter.
     *
     * @param path the <code>TreePath</code> indicating the node that was
     *          expanded
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreeWillExpandListener[] getTreeWillExpandListeners() {

    /**
     * Returns an array of all the <code>TreeWillExpandListener</code>s added
     * to this JTree with addTreeWillExpandListener().
     *
     * @return all of the <code>TreeWillExpandListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void removeTreeWillExpandListener(TreeWillExpandListener tel) {

    /**
     * Removes a listener for <code>TreeWillExpand</code> events.
     *
     * @param tel the <code>TreeWillExpandListener</code> to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void addTreeWillExpandListener(TreeWillExpandListener tel) {

    /**
     * Adds a listener for <code>TreeWillExpand</code> events.
     *
     * @param tel a <code>TreeWillExpandListener</code> that will be notified
     *            when a tree node will be expanded or collapsed (a "negative
     *            expansion")
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreeExpansionListener[] getTreeExpansionListeners() {

    /**
     * Returns an array of all the <code>TreeExpansionListener</code>s added
     * to this JTree with addTreeExpansionListener().
     *
     * @return all of the <code>TreeExpansionListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void removeTreeExpansionListener(TreeExpansionListener tel) {

    /**
     * Removes a listener for <code>TreeExpansion</code> events.
     *
     * @param tel the <code>TreeExpansionListener</code> to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void addTreeExpansionListener(TreeExpansionListener tel) {

    /**
     * Adds a listener for <code>TreeExpansion</code> events.
     *
     * @param tel a TreeExpansionListener that will be notified when
     *            a tree node is expanded or collapsed (a "negative
     *            expansion")
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isSelectionEmpty() {

    /**
     * Returns true if the selection is currently empty.
     *
     * @return true if the selection is currently empty
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void clearSelection() {

    /**
     * Clears the selection.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void removeSelectionRows(int[] rows) {

    /**
     * Removes the rows that are selected at each of the specified
     * rows.
     *
     * @param rows  an array of ints specifying display rows, where 0 is
     *             the first row in the display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void removeSelectionRow(int row) {

    /**
     * Removes the row at the index <code>row</code> from the current
     * selection.
     *
     * @param row  the row to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void removeSelectionPaths(TreePath[] paths) {

    /**
     * Removes the nodes identified by the specified paths from the
     * current selection.
     *
     * @param paths an array of <code>TreePath</code> objects that
     *              specifies the nodes to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void removeSelectionPath(TreePath path) {

    /**
     * Removes the node identified by the specified path from the current
     * selection.
     *
     * @param path  the <code>TreePath</code> identifying a node
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void removeSelectionInterval(int index0, int index1) {

    /**
     * Removes the specified rows (inclusive) from the selection. If
     * the specified indices are within the viewable set of rows, or bound
     * the viewable set of rows, then the specified indices are constrained by
     * the viewable set of rows. If the specified indices are not within the
     * viewable set of rows, or do not bound the viewable set of rows, then
     * the selection is unchanged. For example, if the row count is {@code
     * 10}, and this method is invoked with {@code -1, 20}, then the
     * specified range bounds the viewable range, and this is treated as
     * if invoked with {@code 0, 9}. On the other hand, if this were
     * invoked with {@code -10, -1}, then the specified range does not
     * bound the viewable set of rows, and the selection is unchanged.
     * <p>
     * The parameters are not order dependent. That is, {@code
     * removeSelectionInterval(x, y)} is equivalent to
     * {@code removeSelectionInterval(y, x)}.
     *
     * @param index0 the first row to remove from the selection
     * @param index1 the last row to remove from the selection
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void addSelectionInterval(int index0, int index1) {

    /**
     * Adds the specified rows (inclusive) to the selection. If the
     * specified indices are within the viewable set of rows, or bound
     * the viewable set of rows, then the specified indices are
     * constrained by the viewable set of rows. If the indices are not
     * within the viewable set of rows, or do not bound the viewable
     * set of rows, then the selection is unchanged. For example, if
     * the row count is {@code 10}, and this method is invoked with
     * {@code -1, 20}, then the specified indices bounds the viewable
     * range, and this is treated as if invoked with {@code 0, 9}. On
     * the other hand, if this were invoked with {@code -10, -1}, then
     * the specified indices do not bound the viewable set of rows,
     * and the selection is unchanged.
     * <p>
     * The parameters are not order dependent. That is, {@code
     * addSelectionInterval(x, y)} is equivalent to
     * {@code addSelectionInterval(y, x)}.
     *
     * @param index0 the first index in the range to add to the selection
     * @param index1 the last index in the range to add to the selection
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setSelectionInterval(int index0, int index1) {

    /**
     * Selects the rows in the specified interval (inclusive). If
     * the specified indices are within the viewable set of rows, or bound
     * the viewable set of rows, then the specified rows are constrained by
     * the viewable set of rows. If the specified indices are not within the
     * viewable set of rows, or do not bound the viewable set of rows, then
     * the selection is cleared. For example, if the row count is {@code
     * 10}, and this method is invoked with {@code -1, 20}, then the
     * specified indices bounds the viewable range, and this is treated as
     * if invoked with {@code 0, 9}. On the other hand, if this were
     * invoked with {@code -10, -1}, then the specified indices do not
     * bound the viewable set of rows, and the selection is cleared.
     * <p>
     * The parameters are not order dependent. That is, {@code
     * setSelectionInterval(x, y)} is equivalent to
     * {@code setSelectionInterval(y, x)}.
     *
     * @param index0 the first index in the range to select
     * @param index1 the last index in the range to select
    */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected TreePath[] getPathBetweenRows(int index0, int index1) {

    /**
     * Returns the paths (inclusive) between the specified rows. If
     * the specified indices are within the viewable set of rows, or
     * bound the viewable set of rows, then the indices are
     * constrained by the viewable set of rows. If the specified
     * indices are not within the viewable set of rows, or do not
     * bound the viewable set of rows, then an empty array is
     * returned. For example, if the row count is {@code 10}, and this
     * method is invoked with {@code -1, 20}, then the specified
     * indices are constrained to the viewable set of rows, and this is
     * treated as if invoked with {@code 0, 9}. On the other hand, if
     * this were invoked with {@code -10, -1}, then the specified
     * indices do not bound the viewable set of rows, and an empty
     * array is returned.
     * <p>
     * The parameters are not order dependent. That is, {@code
     * getPathBetweenRows(x, y)} is equivalent to
     * {@code getPathBetweenRows(y, x)}.
     * <p>
     * An empty array is returned if the row count is {@code 0}, or
     * the specified indices do not bound the viewable set of rows.
     *
     * @param index0 the first index in the range
     * @param index1 the last index in the range
     * @return the paths (inclusive) between the specified row indices
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreeSelectionModel getSelectionModel() {

    /**
     * Returns the model for selections. This should always return a
     * non-<code>null</code> value. If you don't want to allow anything
     * to be selected
     * set the selection model to <code>null</code>, which forces an empty
     * selection model to be used.
     *
     * @see #setSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setSelectionModel(TreeSelectionModel selectionModel) {

    /**
     * Sets the tree's selection model. When a <code>null</code> value is
     * specified an empty
     * <code>selectionModel</code> is used, which does not allow selections.
     * <p>
     * This is a bound property.
     *
     * @param selectionModel the <code>TreeSelectionModel</code> to use,
     *          or <code>null</code> to disable selections
     * @see TreeSelectionModel
     * @beaninfo
     *        bound: true
     *  description: The tree's selection model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreePath getEditingPath() {

    /**
     * Returns the path to the element that is currently being edited.
     *
     * @return  the <code>TreePath</code> for the node being edited
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void startEditingAtPath(TreePath path) {

    /**
     * Selects the node identified by the specified path and initiates
     * editing.  The edit-attempt fails if the <code>CellEditor</code>
     * does not allow
     * editing for the specified item.
     *
     * @param path  the <code>TreePath</code> identifying a node
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void  cancelEditing() {

    /**
     * Cancels the current editing session. Has no effect if the
     * tree isn't being edited.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean stopEditing() {

    /**
     * Ends the current editing session.
     * (The <code>DefaultTreeCellEditor</code>
     * object saves any edits that are currently in progress on a cell.
     * Other implementations may operate differently.)
     * Has no effect if the tree isn't being edited.
     * <blockquote>
     * <b>Note:</b><br>
     * To make edit-saves automatic whenever the user changes
     * their position in the tree, use {@link #setInvokesStopCellEditing}.
     * </blockquote>
     *
     * @return true if editing was in progress and is now stopped,
     *              false if editing was not in progress
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isEditing() {

    /**
     * Returns true if the tree is being edited. The item that is being
     * edited can be obtained using <code>getSelectionPath</code>.
     *
     * @return true if the user is currently editing a node
     * @see #getSelectionPath
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getClosestRowForLocation(int x, int y) {

    /**
     * Returns the row to the node that is closest to x,y.  If no nodes
     * are viewable or there is no model, returns -1. Otherwise,
     * it always returns a valid row.  To test if the returned object is
     * exactly at x, y, get the bounds for the node at the returned
     * row and test x, y against that.
     *
     * @param x an integer giving the number of pixels horizontally from
     *          the left edge of the display area, minus any left margin
     * @param y an integer giving the number of pixels vertically from
     *          the top of the display area, minus any top margin
     * @return the row closest to the location, -1 if nothing is
     *         viewable or there is no model
     *
     * @see #getRowForLocation
     * @see #getRowBounds
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreePath getClosestPathForLocation(int x, int y) {

    /**
     * Returns the path to the node that is closest to x,y.  If
     * no nodes are currently viewable, or there is no model, returns
     * <code>null</code>, otherwise it always returns a valid path.  To test if
     * the node is exactly at x, y, get the node's bounds and
     * test x, y against that.
     *
     * @param x an integer giving the number of pixels horizontally from
     *          the left edge of the display area, minus any left margin
     * @param y an integer giving the number of pixels vertically from
     *          the top of the display area, minus any top margin
     * @return  the <code>TreePath</code> for the node closest to that location,
     *          <code>null</code> if nothing is viewable or there is no model
     *
     * @see #getPathForLocation
     * @see #getPathBounds
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getRowForLocation(int x, int y) {

    /**
     * Returns the row for the specified location.
     *
     * @param x an integer giving the number of pixels horizontally from
     *          the left edge of the display area, minus any left margin
     * @param y an integer giving the number of pixels vertically from
     *          the top of the display area, minus any top margin
     * @return the row corresponding to the location, or -1 if the
     *         location is not within the bounds of a displayed cell
     * @see #getClosestRowForLocation
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreePath getPathForLocation(int x, int y) {

    /**
     * Returns the path for the node at the specified location.
     *
     * @param x an integer giving the number of pixels horizontally from
     *          the left edge of the display area, minus any left margin
     * @param y an integer giving the number of pixels vertically from
     *          the top of the display area, minus any top margin
     * @return  the <code>TreePath</code> for the node at that location
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void collapseRow(int row) {

    /**
     * Ensures that the node in the specified row is collapsed.
     * <p>
     * If <code>row</code> is &lt; 0 or &gt;= <code>getRowCount</code> this
     * will have no effect.
     *
     * @param row  an integer specifying a display row, where 0 is the
     *             first row in the display
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void collapsePath(TreePath path) {

    /**
     * Ensures that the node identified by the specified path is
     * collapsed and viewable.
     *
     * @param path  the <code>TreePath</code> identifying a node
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void expandRow(int row) {

    /**
     * Ensures that the node in the specified row is expanded and
     * viewable.
     * <p>
     * If <code>row</code> is &lt; 0 or &gt;= <code>getRowCount</code> this
     * will have no effect.
     *
     * @param row  an integer specifying a display row, where 0 is the
     *             first row in the display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void expandPath(TreePath path) {

    /**
     * Ensures that the node identified by the specified path is
     * expanded and viewable. If the last item in the path is a
     * leaf, this will have no effect.
     *
     * @param path  the <code>TreePath</code> identifying a node
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getRowForPath(TreePath path) {

    /**
     * Returns the row that displays the node identified by the specified
     * path.
     *
     * @param path  the <code>TreePath</code> identifying a node
     * @return an integer specifying the display row, where 0 is the first
     *         row in the display, or -1 if any of the elements in path
     *         are hidden under a collapsed parent.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreePath getPathForRow(int row) {

    /**
     * Returns the path for the specified row.  If <code>row</code> is
     * not visible, or a {@code TreeUI} has not been set, <code>null</code>
     * is returned.
     *
     * @param row  an integer specifying a row
     * @return the <code>TreePath</code> to the specified node,
     *          <code>null</code> if <code>row &lt; 0</code>
     *          or <code>row &gt;= getRowCount()</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void scrollRowToVisible(int row) {

    /**
     * Scrolls the item identified by row until it is displayed. The minimum
     * of amount of scrolling necessary to bring the row into view
     * is performed. Only works when this <code>JTree</code> is contained in a
     * <code>JScrollPane</code>.
     *
     * @param row  an integer specifying the row to scroll, where 0 is the
     *             first row in the display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void scrollPathToVisible(TreePath path) {

    /**
     * Makes sure all the path components in path are expanded (except
     * for the last path component) and scrolls so that the
     * node identified by the path is displayed. Only works when this
     * <code>JTree</code> is contained in a <code>JScrollPane</code>.
     *
     * @param path  the <code>TreePath</code> identifying the node to
     *          bring into view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public Rectangle getRowBounds(int row) {

    /**
     * Returns the <code>Rectangle</code> that the node at the specified row is
     * drawn in.
     *
     * @param row  the row to be drawn, where 0 is the first row in the
     *             display
     * @return the <code>Rectangle</code> the node is drawn in
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public Rectangle getPathBounds(TreePath path) {

    /**
     * Returns the <code>Rectangle</code> that the specified node will be drawn
     * into. Returns <code>null</code> if any component in the path is hidden
     * (under a collapsed parent).
     * <p>
     * Note:<br>
     * This method returns a valid rectangle, even if the specified
     * node is not currently displayed.
     *
     * @param path the <code>TreePath</code> identifying the node
     * @return the <code>Rectangle</code> the node is drawn in,
     *          or <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isVisible(TreePath path) {

    /**
     * Returns true if the value identified by path is currently viewable,
     * which means it is either the root or all of its parents are expanded.
     * Otherwise, this method returns false.
     *
     * @return true if the node is viewable, otherwise false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void makeVisible(TreePath path) {

    /**
     * Ensures that the node identified by path is currently viewable.
     *
     * @param path  the <code>TreePath</code> to make visible
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isCollapsed(int row) {

    /**
     * Returns true if the node at the specified display row is collapsed.
     *
     * @param row  the row to check, where 0 is the first row in the
     *             display
     * @return true if the node is currently collapsed, otherwise false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isCollapsed(TreePath path) {

    /**
     * Returns true if the value identified by path is currently collapsed,
     * this will return false if any of the values in path are currently
     * not being displayed.
     *
     * @param path  the <code>TreePath</code> to check
     * @return true if any of the nodes in the node's path are collapsed,
     *               false if all nodes in the path are expanded
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isExpanded(int row) {

    /**
     * Returns true if the node at the specified display row is currently
     * expanded.
     *
     * @param row  the row to check, where 0 is the first row in the
     *             display
     * @return true if the node is currently expanded, otherwise false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isExpanded(TreePath path) {

    /**
     * Returns true if the node identified by the path is currently expanded,
     *
     * @param path  the <code>TreePath</code> specifying the node to check
     * @return false if any of the nodes in the node's path are collapsed,
     *               true if all nodes in the path are expanded
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean hasBeenExpanded(TreePath path) {

    /**
     * Returns true if the node identified by the path has ever been
     * expanded.
     * @return true if the <code>path</code> has ever been expanded
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public Enumeration<TreePath> getExpandedDescendants(TreePath parent) {

    /**
     * Returns an <code>Enumeration</code> of the descendants of the
     * path <code>parent</code> that
     * are currently expanded. If <code>parent</code> is not currently
     * expanded, this will return <code>null</code>.
     * If you expand/collapse nodes while
     * iterating over the returned <code>Enumeration</code>
     * this may not return all
     * the expanded paths, or may return paths that are no longer expanded.
     *
     * @param parent  the path which is to be examined
     * @return an <code>Enumeration</code> of the descendents of
     *          <code>parent</code>, or <code>null</code> if
     *          <code>parent</code> is not currently expanded
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isRowSelected(int row) {

    /**
     * Returns true if the node identified by row is selected.
     *
     * @param row  an integer specifying a display row, where 0 is the first
     *             row in the display
     * @return true if the node is selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isPathSelected(TreePath path) {

    /**
     * Returns true if the item identified by the path is currently selected.
     *
     * @param path a <code>TreePath</code> identifying a node
     * @return true if the node is selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getLeadSelectionRow() {

    /**
     * Returns the row index corresponding to the lead path.
     *
     * @return an integer giving the row index of the lead path,
     *          where 0 is the first row in the display; or -1
     *          if <code>leadPath</code> is <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getMaxSelectionRow() {

    /**
     * Returns the largest selected row. If the selection is empty, or
     * none of the selected paths are viewable, {@code -1} is returned.
     *
     * @return the largest selected row
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getMinSelectionRow() {

    /**
     * Returns the smallest selected row. If the selection is empty, or
     * none of the selected paths are viewable, {@code -1} is returned.
     *
     * @return the smallest selected row
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getSelectionCount() {

    /**
     * Returns the number of nodes selected.
     *
     * @return the number of nodes selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int[] getSelectionRows() {

    /**
     * Returns all of the currently selected rows. This method is simply
     * forwarded to the <code>TreeSelectionModel</code>.
     * If nothing is selected <code>null</code> or an empty array will
     * be returned, based on the <code>TreeSelectionModel</code>
     * implementation.
     *
     * @return an array of integers that identifies all currently selected rows
     *         where 0 is the first row in the display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreePath[] getSelectionPaths() {

    /**
     * Returns the paths of all selected values.
     *
     * @return an array of <code>TreePath</code> objects indicating the selected
     *         nodes, or <code>null</code> if nothing is currently selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreePath getSelectionPath() {

    /**
     * Returns the path to the first selected node.
     *
     * @return the <code>TreePath</code> for the first selected node,
     *          or <code>null</code> if nothing is currently selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreePath getAnchorSelectionPath() {

    /**
     * Returns the path identified as the anchor.
     * @return path identified as the anchor
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreePath getLeadSelectionPath() {

    /**
     * Returns the path identified as the lead.
     * @return path identified as the lead
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public Object getLastSelectedPathComponent() {

    /**
     * Returns the last path component of the selected path. This is
     * a convenience method for
     * {@code getSelectionModel().getSelectionPath().getLastPathComponent()}.
     * This is typically only useful if the selection has one path.
     *
     * @return the last path component of the selected path, or
     *         <code>null</code> if nothing is selected
     * @see TreePath#getLastPathComponent
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void addSelectionRows(int[] rows) {

    /**
     * Adds the paths at each of the specified rows to the current selection.
     *
     * @param rows  an array of ints specifying the rows to add,
     *              where 0 indicates the first row in the display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void addSelectionRow(int row) {

    /**
     * Adds the path at the specified row to the current selection.
     *
     * @param row  an integer specifying the row of the node to add,
     *             where 0 is the first row in the display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void addSelectionPaths(TreePath[] paths) {

    /**
     * Adds each path in the array of paths to the current selection. If
     * any component of any of the paths isn't viewable and
     * <code>getExpandsSelectedPaths</code> is true, it is
     * made viewable.
     * <p>
     * Note that <code>JTree</code> does not allow duplicate nodes to
     * exist as children under the same parent -- each sibling must be
     * a unique object.
     *
     * @param paths an array of <code>TreePath</code> objects that specifies
     *          the nodes to add
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void addSelectionPath(TreePath path) {

    /**
     * Adds the node identified by the specified <code>TreePath</code>
     * to the current selection. If any component of the path isn't
     * viewable, and <code>getExpandsSelectedPaths</code> is true it is
     * made viewable.
     * <p>
     * Note that <code>JTree</code> does not allow duplicate nodes to
     * exist as children under the same parent -- each sibling must be
     * a unique object.
     *
     * @param path the <code>TreePath</code> to add
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setSelectionRows(int[] rows) {

    /**
     * Selects the nodes corresponding to each of the specified rows
     * in the display. If a particular element of <code>rows</code> is
     * &lt; 0 or &gt;= <code>getRowCount</code>, it will be ignored.
     * If none of the elements
     * in <code>rows</code> are valid rows, the selection will
     * be cleared. That is it will be as if <code>clearSelection</code>
     * was invoked.
     *
     * @param rows  an array of ints specifying the rows to select,
     *              where 0 indicates the first row in the display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setSelectionRow(int row) {

    /**
     * Selects the node at the specified row in the display.
     *
     * @param row  the row to select, where 0 is the first row in
     *             the display
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setAnchorSelectionPath(TreePath newPath) {

    /**
     * Sets the path identified as the anchor.
     * The anchor is not maintained by <code>JTree</code>, rather the UI will
     * update it.
     * <p>
     * This is a bound property.
     *
     * @param newPath  the new anchor path
     * @since 1.3
     * @beaninfo
     *        bound: true
     *  description: Anchor selection path
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setLeadSelectionPath(TreePath newPath) {

    /**
     * Sets the path identifies as the lead. The lead may not be selected.
     * The lead is not maintained by <code>JTree</code>,
     * rather the UI will update it.
     * <p>
     * This is a bound property.
     *
     * @param newPath  the new lead path
     * @since 1.3
     * @beaninfo
     *        bound: true
     *  description: Lead selection path
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setSelectionPaths(TreePath[] paths) {

    /**
     * Selects the nodes identified by the specified array of paths.
     * If any component in any of the paths is hidden (under a collapsed
     * node), and <code>getExpandsSelectedPaths</code> is true
     * it is exposed (made viewable).
     *
     * @param paths an array of <code>TreePath</code> objects that specifies
     *          the nodes to select
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setSelectionPath(TreePath path) {

    /**
     * Selects the node identified by the specified path. If any
     * component of the path is hidden (under a collapsed node), and
     * <code>getExpandsSelectedPaths</code> is true it is
     * exposed (made viewable).
     *
     * @param path the <code>TreePath</code> specifying the node to select
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getRowCount() {

    /**
     * Returns the number of viewable nodes. A node is viewable if all of its
     * parents are expanded. The root is only included in this count if
     * {@code isRootVisible()} is {@code true}. This returns {@code 0} if
     * the UI has not been set.
     *
     * @return the number of viewable nodes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public String convertValueToText(Object value, boolean selected,
                                     boolean expanded, boolean leaf, int row,
                                     boolean hasFocus) {

    /**
     * Called by the renderers to convert the specified value to
     * text. This implementation returns <code>value.toString</code>, ignoring
     * all other arguments. To control the conversion, subclass this
     * method and use any of the arguments you need.
     *
     * @param value the <code>Object</code> to convert to text
     * @param selected true if the node is selected
     * @param expanded true if the node is expanded
     * @param leaf  true if the node is a leaf node
     * @param row  an integer specifying the node's display row, where 0 is
     *             the first row in the display
     * @param hasFocus true if the node has the focus
     * @return the <code>String</code> representation of the node's value
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public String getToolTipText(MouseEvent event) {

    /**
     * Overrides <code>JComponent</code>'s <code>getToolTipText</code>
     * method in order to allow
     * renderer's tips to be used if it has text set.
     * <p>
     * NOTE: For <code>JTree</code> to properly display tooltips of its
     * renderers, <code>JTree</code> must be a registered component with the
     * <code>ToolTipManager</code>.  This can be done by invoking
     * <code>ToolTipManager.sharedInstance().registerComponent(tree)</code>.
     * This is not done automatically!
     *
     * @param event the <code>MouseEvent</code> that initiated the
     *          <code>ToolTip</code> display
     * @return a string containing the  tooltip or <code>null</code>
     *          if <code>event</code> is null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isPathEditable(TreePath path) {

    /**
     * Returns <code>isEditable</code>. This is invoked from the UI before
     * editing begins to insure that the given path can be edited. This
     * is provided as an entry point for subclassers to add filtered
     * editing without having to resort to creating a new editor.
     *
     * @return true if every parent node and the node itself is editable
     * @see #isEditable
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final DropLocation getDropLocation() {

    /**
     * Returns the location that this component should visually indicate
     * as the drop location during a DnD operation over the component,
     * or {@code null} if no location is to currently be shown.
     * <p>
     * This method is not meant for querying the drop location
     * from a {@code TransferHandler}, as the drop location is only
     * set after the {@code TransferHandler}'s <code>canImport</code>
     * has returned and has allowed for the location to be shown.
     * <p>
     * When this property changes, a property change event with
     * name "dropLocation" is fired by the component.
     *
     * @return the drop location
     * @see #setDropMode
     * @see TransferHandler#canImport(TransferHandler.TransferSupport)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    void dndDone() {

    /**
     * Called to indicate to this component that DnD is done.
     * Allows for us to cancel the expand timer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    Object setDropLocation(TransferHandler.DropLocation location,
                           Object state,
                           boolean forDrop) {

    /**
     * Called to set or clear the drop location during a DnD operation.
     * In some cases, the component may need to use it's internal selection
     * temporarily to indicate the drop location. To help facilitate this,
     * this method returns and accepts as a parameter a state object.
     * This state object can be used to store, and later restore, the selection
     * state. Whatever this method returns will be passed back to it in
     * future calls, as the state parameter. If it wants the DnD system to
     * continue storing the same state, it must pass it back every time.
     * Here's how this is used:
     * <p>
     * Let's say that on the first call to this method the component decides
     * to save some state (because it is about to use the selection to show
     * a drop index). It can return a state object to the caller encapsulating
     * any saved selection state. On a second call, let's say the drop location
     * is being changed to something else. The component doesn't need to
     * restore anything yet, so it simply passes back the same state object
     * to have the DnD system continue storing it. Finally, let's say this
     * method is messaged with <code>null</code>. This means DnD
     * is finished with this component for now, meaning it should restore
     * state. At this point, it can use the state parameter to restore
     * said state, and of course return <code>null</code> since there's
     * no longer anything to store.
     *
     * @param location the drop location (as calculated by
     *        <code>dropLocationForPoint</code>) or <code>null</code>
     *        if there's no longer a valid drop location
     * @param state the state object saved earlier for this component,
     *        or <code>null</code>
     * @param forDrop whether or not the method is being called because an
     *        actual drop occurred
     * @return any saved state for this component, or <code>null</code> if none
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    DropLocation dropLocationForPoint(Point p) {

    /**
     * Calculates a drop location in this component, representing where a
     * drop at the given point should insert data.
     *
     * @param p the point to calculate a drop location for
     * @return the drop location, or <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final DropMode getDropMode() {

    /**
     * Returns the drop mode for this component.
     *
     * @return the drop mode for this component
     * @see #setDropMode
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final void setDropMode(DropMode dropMode) {

    /**
     * Sets the drop mode for this component. For backward compatibility,
     * the default for this property is <code>DropMode.USE_SELECTION</code>.
     * Usage of one of the other modes is recommended, however, for an
     * improved user experience. <code>DropMode.ON</code>, for instance,
     * offers similar behavior of showing items as selected, but does so without
     * affecting the actual selection in the tree.
     * <p>
     * <code>JTree</code> supports the following drop modes:
     * <ul>
     *    <li><code>DropMode.USE_SELECTION</code></li>
     *    <li><code>DropMode.ON</code></li>
     *    <li><code>DropMode.INSERT</code></li>
     *    <li><code>DropMode.ON_OR_INSERT</code></li>
     * </ul>
     * <p>
     * The drop mode is only meaningful if this component has a
     * <code>TransferHandler</code> that accepts drops.
     *
     * @param dropMode the drop mode to use
     * @throws IllegalArgumentException if the drop mode is unsupported
     *         or <code>null</code>
     * @see #getDropMode
     * @see #getDropLocation
     * @see #setTransferHandler
     * @see TransferHandler
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean getDragEnabled() {

    /**
     * Returns whether or not automatic drag handling is enabled.
     *
     * @return the value of the {@code dragEnabled} property
     * @see #setDragEnabled
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setDragEnabled(boolean b) {

    /**
     * Turns on or off automatic drag handling. In order to enable automatic
     * drag handling, this property should be set to {@code true}, and the
     * tree's {@code TransferHandler} needs to be {@code non-null}.
     * The default value of the {@code dragEnabled} property is {@code false}.
     * <p>
     * The job of honoring this property, and recognizing a user drag gesture,
     * lies with the look and feel implementation, and in particular, the tree's
     * {@code TreeUI}. When automatic drag handling is enabled, most look and
     * feels (including those that subclass {@code BasicLookAndFeel}) begin a
     * drag and drop operation whenever the user presses the mouse button over
     * an item and then moves the mouse a few pixels. Setting this property to
     * {@code true} can therefore have a subtle effect on how selections behave.
     * <p>
     * If a look and feel is used that ignores this property, you can still
     * begin a drag and drop operation by calling {@code exportAsDrag} on the
     * tree's {@code TransferHandler}.
     *
     * @param b whether or not to enable automatic drag handling
     * @exception HeadlessException if
     *            <code>b</code> is <code>true</code> and
     *            <code>GraphicsEnvironment.isHeadless()</code>
     *            returns <code>true</code>
     * @see java.awt.GraphicsEnvironment#isHeadless
     * @see #getDragEnabled
     * @see #setTransferHandler
     * @see TransferHandler
     * @since 1.4
     *
     * @beaninfo
     *  description: determines whether automatic drag handling is enabled
     *        bound: false
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean getExpandsSelectedPaths() {

    /**
     * Returns the <code>expandsSelectedPaths</code> property.
     * @return true if selection changes result in the parent path being
     *         expanded
     * @since 1.3
     * @see #setExpandsSelectedPaths
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setExpandsSelectedPaths(boolean newValue) {

    /**
     * Configures the <code>expandsSelectedPaths</code> property. If
     * true, any time the selection is changed, either via the
     * <code>TreeSelectionModel</code>, or the cover methods provided by
     * <code>JTree</code>, the <code>TreePath</code>s parents will be
     * expanded to make them visible (visible meaning the parent path is
     * expanded, not necessarily in the visible rectangle of the
     * <code>JTree</code>). If false, when the selection
     * changes the nodes parent is not made visible (all its parents expanded).
     * This is useful if you wish to have your selection model maintain paths
     * that are not always visible (all parents expanded).
     * <p>
     * This is a bound property.
     *
     * @param newValue the new value for <code>expandsSelectedPaths</code>
     *
     * @since 1.3
     * @beaninfo
     *        bound: true
     *  description: Indicates whether changes to the selection should make
     *               the parent of the path visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getToggleClickCount() {

    /**
     * Returns the number of mouse clicks needed to expand or close a node.
     *
     * @return number of mouse clicks before node is expanded
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setToggleClickCount(int clickCount) {

    /**
     * Sets the number of mouse clicks before a node will expand or close.
     * The default is two.
     * <p>
     * This is a bound property.
     *
     * @since 1.3
     * @beaninfo
     *        bound: true
     *  description: Number of clicks before a node will expand/collapse.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean getScrollsOnExpand() {

    /**
     * Returns the value of the <code>scrollsOnExpand</code> property.
     *
     * @return the value of the <code>scrollsOnExpand</code> property
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setScrollsOnExpand(boolean newValue) {

    /**
     * Sets the <code>scrollsOnExpand</code> property,
     * which determines whether the
     * tree might scroll to show previously hidden children.
     * If this property is <code>true</code> (the default),
     * when a node expands
     * the tree can use scrolling to make
     * the maximum possible number of the node's descendants visible.
     * In some look and feels, trees might not need to scroll when expanded;
     * those look and feels will ignore this property.
     * <p>
     * This is a bound property.
     *
     * @param newValue <code>false</code> to disable scrolling on expansion;
     *                 <code>true</code> to enable it
     * @see #getScrollsOnExpand
     *
     * @beaninfo
     *        bound: true
     *  description: Indicates if a node descendant should be scrolled when expanded.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean getInvokesStopCellEditing() {

    /**
     * Returns the indicator that tells what happens when editing is
     * interrupted.
     *
     * @return the indicator that tells what happens when editing is
     *         interrupted
     * @see #setInvokesStopCellEditing
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setInvokesStopCellEditing(boolean newValue) {

    /**
     * Determines what happens when editing is interrupted by selecting
     * another node in the tree, a change in the tree's data, or by some
     * other means. Setting this property to <code>true</code> causes the
     * changes to be automatically saved when editing is interrupted.
     * <p>
     * Fires a property change for the INVOKES_STOP_CELL_EDITING_PROPERTY.
     *
     * @param newValue true means that <code>stopCellEditing</code> is invoked
     *        when editing is interrupted, and data is saved; false means that
     *        <code>cancelCellEditing</code> is invoked, and changes are lost
     * @beaninfo
     *        bound: true
     *  description: Determines what happens when editing is interrupted,
     *               selecting another node in the tree, a change in the
     *               tree's data, or some other means.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isLargeModel() {

    /**
     * Returns true if the tree is configured for a large model.
     *
     * @return true if a large model is suggested
     * @see #largeModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setLargeModel(boolean newValue) {

    /**
     * Specifies whether the UI should use a large model.
     * (Not all UIs will implement this.) Fires a property change
     * for the LARGE_MODEL_PROPERTY.
     * <p>
     * This is a bound property.
     *
     * @param newValue true to suggest a large model to the UI
     * @see #largeModel
     * @beaninfo
     *        bound: true
     *  description: Whether the UI should use a
     *               large model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isFixedRowHeight()

    /**
     * Returns true if the height of each display row is a fixed size.
     *
     * @return true if the height of each row is a fixed size
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public int getRowHeight()

    /**
     * Returns the height of each row.  If the returned value is less than
     * or equal to 0 the height for each row is determined by the
     * renderer.
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setRowHeight(int rowHeight)

    /**
     * Sets the height of each cell, in pixels.  If the specified value
     * is less than or equal to zero the current cell renderer is
     * queried for each row's height.
     * <p>
     * This is a bound property.
     *
     * @param rowHeight the height of each cell, in pixels
     * @beaninfo
     *        bound: true
     *  description: The height of each cell.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean getShowsRootHandles()

    /**
     * Returns the value of the <code>showsRootHandles</code> property.
     *
     * @return the value of the <code>showsRootHandles</code> property
     * @see #showsRootHandles
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setShowsRootHandles(boolean newValue) {

    /**
     * Sets the value of the <code>showsRootHandles</code> property,
     * which specifies whether the node handles should be displayed.
     * The default value of this property depends on the constructor
     * used to create the <code>JTree</code>.
     * Some look and feels might not support handles;
     * they will ignore this property.
     * <p>
     * This is a bound property.
     *
     * @param newValue <code>true</code> if root handles should be displayed;
     *                 otherwise, <code>false</code>
     * @see #showsRootHandles
     * @see #getShowsRootHandles
     * @beaninfo
     *        bound: true
     *  description: Whether the node handles are to be
     *               displayed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setRootVisible(boolean rootVisible) {

    /**
     * Determines whether or not the root node from
     * the <code>TreeModel</code> is visible.
     * <p>
     * This is a bound property.
     *
     * @param rootVisible true if the root node of the tree is to be displayed
     * @see #rootVisible
     * @beaninfo
     *        bound: true
     *  description: Whether or not the root node
     *               from the TreeModel is visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isRootVisible() {

    /**
     * Returns true if the root node of the tree is displayed.
     *
     * @return true if the root node of the tree is displayed
     * @see #rootVisible
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setModel(TreeModel newModel) {

    /**
     * Sets the <code>TreeModel</code> that will provide the data.
     * <p>
     * This is a bound property.
     *
     * @param newModel the <code>TreeModel</code> that is to provide the data
     * @beaninfo
     *        bound: true
     *  description: The TreeModel that will provide the data.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreeModel getModel() {

    /**
     * Returns the <code>TreeModel</code> that is providing the data.
     *
     * @return the <code>TreeModel</code> that is providing the data
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreeCellEditor getCellEditor() {

    /**
     * Returns the editor used to edit entries in the tree.
     *
     * @return the <code>TreeCellEditor</code> in use,
     *          or <code>null</code> if the tree cannot be edited
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setCellEditor(TreeCellEditor cellEditor) {

    /**
     * Sets the cell editor.  A <code>null</code> value implies that the
     * tree cannot be edited.  If this represents a change in the
     * <code>cellEditor</code>, the <code>propertyChange</code>
     * method is invoked on all listeners.
     * <p>
     * This is a bound property.
     *
     * @param cellEditor the <code>TreeCellEditor</code> to use
     * @beaninfo
     *        bound: true
     *  description: The cell editor. A null value implies the tree
     *               cannot be edited.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public boolean isEditable() {

    /**
     * Returns true if the tree is editable.
     *
     * @return true if the tree is editable
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setEditable(boolean flag) {

    /**
      * Determines whether the tree is editable. Fires a property
      * change event if the new setting is different from the existing
      * setting.
     * <p>
     * This is a bound property.
      *
      * @param flag  a boolean value, true if the tree is editable
      * @beaninfo
      *        bound: true
      *  description: Whether the tree is editable.
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setCellRenderer(TreeCellRenderer x) {

    /**
     * Sets the <code>TreeCellRenderer</code> that will be used to
     * draw each cell.
     * <p>
     * This is a bound property.
     *
     * @param x  the <code>TreeCellRenderer</code> that is to render each cell
     * @beaninfo
     *        bound: true
     *  description: The TreeCellRenderer that will be used to draw
     *               each cell.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreeCellRenderer getCellRenderer() {

    /**
     * Returns the current <code>TreeCellRenderer</code>
     *  that is rendering each cell.
     *
     * @return the <code>TreeCellRenderer</code> that is rendering each cell
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public String getUIClassID() {

    /**
     * Returns the name of the L&amp;F class that renders this component.
     *
     * @return the string "TreeUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void updateUI() {

    /**
     * Notification from the <code>UIManager</code> that the L&amp;F has changed.
     * Replaces the current UI object with the latest version from the
     * <code>UIManager</code>.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public void setUI(TreeUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     * <p>
     * This is a bound property.
     *
     * @param ui  the <code>TreeUI</code> L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public TreeUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return the <code>TreeUI</code> object that renders this component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    @ConstructorProperties({"model"})

    /**
     * Returns an instance of <code>JTree</code> which displays the root node
     * -- the tree is created using the specified data model.
     *
     * @param newModel  the <code>TreeModel</code> to use as the data model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public JTree(TreeNode root, boolean asksAllowsChildren) {

    /**
     * Returns a <code>JTree</code> with the specified <code>TreeNode</code>
     * as its root, which
     * displays the root node and which decides whether a node is a
     * leaf node in the specified manner.
     *
     * @param root  a <code>TreeNode</code> object
     * @param asksAllowsChildren  if false, any node without children is a
     *              leaf node; if true, only nodes that do not allow
     *              children are leaf nodes
     * @see DefaultTreeModel#asksAllowsChildren
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public JTree(TreeNode root) {

    /**
     * Returns a <code>JTree</code> with the specified
     * <code>TreeNode</code> as its root,
     * which displays the root node.
     * By default, the tree defines a leaf node as any node without children.
     *
     * @param root  a <code>TreeNode</code> object
     * @see DefaultTreeModel#asksAllowsChildren
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public JTree(Hashtable<?,?> value) {

    /**
     * Returns a <code>JTree</code> created from a <code>Hashtable</code>
     * which does not display with root.
     * Each value-half of the key/value pairs in the <code>HashTable</code>
     * becomes a child of the new root node. By default, the tree defines
     * a leaf node as any node without children.
     *
     * @param value  a <code>Hashtable</code>
     * @see DefaultTreeModel#asksAllowsChildren
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public JTree(Vector<?> value) {

    /**
     * Returns a <code>JTree</code> with each element of the specified
     * <code>Vector</code> as the
     * child of a new root node which is not displayed. By default, the
     * tree defines a leaf node as any node without children.
     *
     * @param value  a <code>Vector</code>
     * @see DefaultTreeModel#asksAllowsChildren
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public JTree(Object[] value) {

    /**
     * Returns a <code>JTree</code> with each element of the
     * specified array as the
     * child of a new root node which is not displayed.
     * By default, the tree defines a leaf node as any node without
     * children.
     *
     * @param value  an array of <code>Object</code>s
     * @see DefaultTreeModel#asksAllowsChildren
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public JTree() {

    /**
     * Returns a <code>JTree</code> with a sample model.
     * The default model used by the tree defines a leaf node as any node
     * without children.
     *
     * @see DefaultTreeModel#asksAllowsChildren
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected static TreeModel createTreeModel(Object value) {

    /**
     * Returns a <code>TreeModel</code> wrapping the specified object.
     * If the object is:<ul>
     * <li>an array of <code>Object</code>s,
     * <li>a <code>Hashtable</code>, or
     * <li>a <code>Vector</code>
     * </ul>then a new root node is created with each of the incoming
     * objects as children. Otherwise, a new root is created with
     * a value of {@code "root"}.
     *
     * @param value  the <code>Object</code> used as the foundation for
     *          the <code>TreeModel</code>
     * @return a <code>TreeModel</code> wrapping the specified object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected static TreeModel getDefaultTreeModel() {

    /**
     * Creates and returns a sample <code>TreeModel</code>.
     * Used primarily for beanbuilders to show something interesting.
     *
     * @return the default <code>TreeModel</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        EXPANDS_SELECTED_PATHS_PROPERTY = "expandsSelectedPaths";

    /** Bound property name for expands selected paths property
     * @since 1.3 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        ANCHOR_SELECTION_PATH_PROPERTY = "anchorSelectionPath";

    /** Bound property name for anchor selection path.
     * @since 1.3 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        LEAD_SELECTION_PATH_PROPERTY = "leadSelectionPath";

    /** Bound property name for <code>leadSelectionPath</code>.
     * @since 1.3 */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        TOGGLE_CLICK_COUNT_PROPERTY = "toggleClickCount";

    /** Bound property name for <code>toggleClickCount</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        SCROLLS_ON_EXPAND_PROPERTY = "scrollsOnExpand";

    /** Bound property name for <code>scrollsOnExpand</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        INVOKES_STOP_CELL_EDITING_PROPERTY = "invokesStopCellEditing";

    /** Bound property name for <code>messagesStopCellEditing</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        VISIBLE_ROW_COUNT_PROPERTY = "visibleRowCount";

    /** Bound property name for <code>visibleRowCount</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        SELECTION_MODEL_PROPERTY = "selectionModel";

    /** Bound property name for selectionModel. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        LARGE_MODEL_PROPERTY = "largeModel";

    /** Bound property name for <code>largeModel</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        EDITABLE_PROPERTY = "editable";

    /** Bound property name for <code>editable</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        CELL_EDITOR_PROPERTY = "cellEditor";

    /** Bound property name for <code>cellEditor</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        ROW_HEIGHT_PROPERTY = "rowHeight";

    /** Bound property name for <code>rowHeight</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        SHOWS_ROOT_HANDLES_PROPERTY = "showsRootHandles";

    /** Bound property name for <code>showsRootHandles</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        ROOT_VISIBLE_PROPERTY = "rootVisible";

    /** Bound property name for <code>rootVisible</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        TREE_MODEL_PROPERTY = "model";

    /** Bound property name for <code>treeModel</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public final static String        CELL_RENDERER_PROPERTY = "cellRenderer";

    /** Bound property name for <code>cellRenderer</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private static int                TEMP_STACK_SIZE = 11;

    /**
     * Max number of stacks to keep around.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private transient TreeExpansionListener     uiTreeExpansionListener;

    /**
     * When <code>addTreeExpansionListener</code> is invoked,
     * and <code>settingUI</code> is true, this ivar gets set to the passed in
     * <code>Listener</code>. This listener is then notified first in
     * <code>fireTreeCollapsed</code> and <code>fireTreeExpanded</code>.
     * <p>This is an ugly workaround for a way to have the UI listener
     * get notified before other listeners.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private TreeTimer dropTimer;

    /**
     * A timer to expand nodes during drop.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private int expandRow = -1;

    /**
     * The row to expand during DnD.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public String toString() {

        /**
         * Returns a string representation of this drop location.
         * This method is intended to be used for debugging purposes,
         * and the content and format of the returned string may vary
         * between implementations.
         *
         * @return a string representation of this drop location
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public TreePath getPath() {

        /**
         * Returns the path where dropped data should be placed in the
         * tree.
         * <p>
         * Interpretation of this value depends on the drop mode set on the
         * component. If the drop mode is <code>DropMode.USE_SELECTION</code>
         * or <code>DropMode.ON</code>, the return value is the path in the
         * tree over which the data has been (or will be) dropped.
         * <code>null</code> indicates that the drop is over empty space,
         * not associated with a particular path.
         * <p>
         * If the drop mode is <code>DropMode.INSERT</code>, the return value
         * refers to the path that should become the parent of the new data,
         * in which case <code>getChildIndex()</code> indicates where the
         * new item should be inserted into this parent path. A
         * <code>null</code> path indicates that no parent path has been
         * determined, which can happen for multiple reasons:
         * <ul>
         *    <li>The tree has no model
         *    <li>There is no root in the tree
         *    <li>The root is collapsed
         *    <li>The root is a leaf node
         * </ul>
         * It is up to the developer to decide if and how they wish to handle
         * the <code>null</code> case.
         * <p>
         * If the drop mode is <code>DropMode.ON_OR_INSERT</code>,
         * <code>getChildIndex</code> can be used to determine whether the
         * drop is on top of the path itself (<code>-1</code>) or the index
         * at which it should be inserted into the path (values other than
         * <code>-1</code>).
         *
         * @return the drop path
         * @see #getChildIndex
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
        public int getChildIndex() {

        /**
         * Returns the index where the dropped data should be inserted
         * with respect to the path returned by <code>getPath()</code>.
         * <p>
         * For drop modes <code>DropMode.USE_SELECTION</code> and
         * <code>DropMode.ON</code>, this index is unimportant (and it will
         * always be <code>-1</code>) as the only interesting data is the
         * path over which the drop operation occurred.
         * <p>
         * For drop mode <code>DropMode.INSERT</code>, this index
         * indicates the index at which the data should be inserted into
         * the parent path represented by <code>getPath()</code>.
         * <code>-1</code> indicates that the drop occurred over the
         * parent itself, and in most cases should be treated as inserting
         * into either the beginning or the end of the parent's list of
         * children.
         * <p>
         * For <code>DropMode.ON_OR_INSERT</code>, this value will be
         * an insert index, as described above, or <code>-1</code> if
         * the drop occurred over the path itself.
         *
         * @return the child index
         * @see #getPath
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    public static final class DropLocation extends TransferHandler.DropLocation {

    /**
     * A subclass of <code>TransferHandler.DropLocation</code> representing
     * a drop location for a <code>JTree</code>.
     *
     * @see #getDropLocation
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private transient DropLocation dropLocation;

    /**
     * The drop location.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private DropMode dropMode = DropMode.USE_SELECTION;

    /**
     * The drop mode for this component.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private boolean dragEnabled;

    /** If true, mouse presses on selections initiate a drag operation. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private boolean                   settingUI;

    /**
     * This is set to true for the life of the <code>setUI</code> call.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private boolean                   expandsSelectedPaths;

    /**
     * True if paths in the selection should be expanded.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private TreePath                  anchorPath;

    /**
     * Anchor path.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private TreePath                  leadPath;

    /**
     * Lead selection path, may not be <code>null</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    transient private Stack<Stack<TreePath>> expandedStack;

    /**
     * Used when <code>setExpandedState</code> is invoked,
     * will be a <code>Stack</code> of <code>Stack</code>s.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    transient protected TreeModelListener       treeModelListener;

    /**
     * Updates the <code>expandedState</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected int                     toggleClickCount;

    /**
     * Number of mouse clicks before a node is expanded.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected boolean                 scrollsOnExpand;

    /**
     * If true, when a node is expanded, as many of the descendants are
     * scrolled to be visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected boolean                 invokesStopCellEditing;

    /**
     * If true, when editing is to be stopped by way of selection changing,
     * data in tree changing or other means <code>stopCellEditing</code>
     * is invoked, and changes are saved. If false,
     * <code>cancelCellEditing</code> is invoked, and changes
     * are discarded. Default is false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected int                     visibleRowCount;

    /**
     * Number of rows to make visible at one time. This value is used for
     * the <code>Scrollable</code> interface. It determines the preferred
     * size of the display area.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected boolean                 largeModel;

    /**
     * Is this tree a large model? This is a code-optimization setting.
     * A large model can be used when the cell height is the same for all
     * nodes. The UI will then cache very little information and instead
     * continually message the model. Without a large model the UI caches
     * most of the information, resulting in fewer method calls to the model.
     * <p>
     * This value is only a suggestion to the UI. Not all UIs will
     * take advantage of it. Default value is false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected boolean                 editable;

    /**
     * Is the tree editable? Default is false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    transient protected TreeCellEditor          cellEditor;

    /**
     * Editor for the entries.  Default is <code>null</code>
     * (tree is not editable).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected transient TreeSelectionRedirector selectionRedirector;

    /**
     * Creates a new event and passed it off the
     * <code>selectionListeners</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected boolean           showsRootHandles;

    /**
     * True if handles are displayed at the topmost level of the tree.
     * <p>
     * A handle is a small icon that displays adjacent to the node which
     * allows the user to click once to expand or collapse the node. A
     * common interface shows a plus sign (+) for a node which can be
     * expanded and a minus sign (-) for a node which can be collapsed.
     * Handles are always shown for nodes below the topmost level.
     * <p>
     * If the <code>rootVisible</code> setting specifies that the root
     * node is to be displayed, then that is the only node at the topmost
     * level. If the root node is not displayed, then all of its
     * children are at the topmost level of the tree. Handles are
     * always displayed for nodes other than the topmost.
     * <p>
     * If the root node isn't visible, it is generally a good to make
     * this value true. Otherwise, the tree looks exactly like a list,
     * and users may not know that the "list entries" are actually
     * tree nodes.
     *
     * @see #rootVisible
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    transient private Hashtable<TreePath, Boolean> expandedState;

    /**
     * Maps from <code>TreePath</code> to <code>Boolean</code>
     * indicating whether or not the
     * particular path is expanded. This ONLY indicates whether a
     * given path is expanded, and NOT if it is visible or not. That
     * information must be determined by visiting all the parent
     * paths and seeing if they are visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected int                         rowHeight;

    /**
     * Height to use for each display row. If this is &lt;= 0 the renderer
     * determines the height for each row.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    transient protected TreeCellRenderer  cellRenderer;

    /**
     * The cell used to draw nodes. If <code>null</code>, the UI uses a default
     * <code>cellRenderer</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    protected boolean                    rootVisible;

    /**
     * True if the root node is displayed, false if its children are
     * the highest visible nodes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    transient protected TreeSelectionModel selectionModel;

    /**
     * Models the set of selected nodes in this tree.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    transient protected TreeModel        treeModel;

    /**
     * The model that defines the tree displayed by this object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
    private static final String uiClassID = "TreeUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTree.java
@SuppressWarnings("serial")

/**
 * <a name="jtree_description"></a>
 * A control that displays a set of hierarchical data as an outline.
 * You can find task-oriented documentation and examples of using trees in
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/tree.html">How to Use Trees</a>,
 * a section in <em>The Java Tutorial.</em>
 * <p>
 * A specific node in a tree can be identified either by a
 * <code>TreePath</code> (an object
 * that encapsulates a node and all of its ancestors), or by its
 * display row, where each row in the display area displays one node.
 * An <i>expanded</i> node is a non-leaf node (as identified by
 * <code>TreeModel.isLeaf(node)</code> returning false) that will displays
 * its children when all its ancestors are <i>expanded</i>.
 * A <i>collapsed</i>
 * node is one which hides them. A <i>hidden</i> node is one which is
 * under a collapsed ancestor. All of a <i>viewable</i> nodes parents
 * are expanded, but may or may not be displayed. A <i>displayed</i> node
 * is both viewable and in the display area, where it can be seen.
 * </p>
 * The following <code>JTree</code> methods use "visible" to mean "displayed":
 * <ul>
 * <li><code>isRootVisible()</code>
 * <li><code>setRootVisible()</code>
 * <li><code>scrollPathToVisible()</code>
 * <li><code>scrollRowToVisible()</code>
 * <li><code>getVisibleRowCount()</code>
 * <li><code>setVisibleRowCount()</code>
 * </ul>
 * The next group of <code>JTree</code> methods use "visible" to mean
 * "viewable" (under an expanded parent):
 * <ul>
 * <li><code>isVisible()</code>
 * <li><code>makeVisible()</code>
 * </ul>
 * If you are interested in knowing when the selection changes implement
 * the <code>TreeSelectionListener</code> interface and add the instance
 * using the method <code>addTreeSelectionListener</code>.
 * <code>valueChanged</code> will be invoked when the
 * selection changes, that is if the user clicks twice on the same
 * node <code>valueChanged</code> will only be invoked once.
 * <p>
 * If you are interested in detecting either double-click events or when
 * a user clicks on a node, regardless of whether or not it was selected,
 * we recommend you do the following:
 * </p>
 * <pre>
 * final JTree tree = ...;
 *
 * MouseListener ml = new MouseAdapter() {
 *     public void <b>mousePressed</b>(MouseEvent e) {
 *         int selRow = tree.getRowForLocation(e.getX(), e.getY());
 *         TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
 *         if(selRow != -1) {
 *             if(e.getClickCount() == 1) {
 *                 mySingleClick(selRow, selPath);
 *             }
 *             else if(e.getClickCount() == 2) {
 *                 myDoubleClick(selRow, selPath);
 *             }
 *         }
 *     }
 * };
 * tree.addMouseListener(ml);
 * </pre>
 * NOTE: This example obtains both the path and row, but you only need to
 * get the one you're interested in.
 * <p>
 * To use <code>JTree</code> to display compound nodes
 * (for example, nodes containing both
 * a graphic icon and text), subclass {@link TreeCellRenderer} and use
 * {@link #setCellRenderer} to tell the tree to use it. To edit such nodes,
 * subclass {@link TreeCellEditor} and use {@link #setCellEditor}.
 * </p>
 * <p>
 * Like all <code>JComponent</code> classes, you can use {@link InputMap} and
 * {@link ActionMap}
 * to associate an {@link Action} object with a {@link KeyStroke}
 * and execute the action under specified conditions.
 * </p>
 * <strong>Warning:</strong> Swing is not thread safe. For more
 * information see <a
 * href="package-summary.html#threading">Swing's Threading
 * Policy</a>.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *</p>
 * @beaninfo
 *   attribute: isContainer false
 * description: A component that displays a set of hierarchical data as an outline.
 *
 * @author Rob Davis
 * @author Ray Ryan
 * @author Scott Violet
 */
