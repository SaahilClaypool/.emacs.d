_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void removeFocusListener(FocusListener l) {

            /**
             * Removes the specified focus listener so it no longer receives focus
             * events from this component.
             *
             * @param l the focus listener
             * @see #addFocusListener
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void addFocusListener(FocusListener l) {

            /**
             * Adds the specified focus listener to receive focus events from this
             * component.
             *
             * @param l the focus listener
             * @see #removeFocusListener
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void requestFocus() {

            /**
             * Requests focus for this object.  If this object cannot accept focus,
             * nothing will happen.  Otherwise, the object will attempt to take
             * focus.
             * @see #isFocusTraversable
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isFocusTraversable() {

            /**
             * Returns whether this object can accept focus or not.   Objects that
             * can accept focus will also have the AccessibleState.FOCUSABLE state
             * set in their AccessibleStateSets.
             *
             * @return true if object can accept focus; otherwise false
             * @see AccessibleContext#getAccessibleStateSet
             * @see AccessibleState#FOCUSABLE
             * @see AccessibleState#FOCUSED
             * @see AccessibleStateSet
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleAt(Point p) {

            /**
             * Returns the Accessible child, if one exists, contained at the local
             * coordinate Point.
             *
             * @param p The point relative to the coordinate system of this object.
             * @return the Accessible, if it exists, at the specified location;
             * otherwise null
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setSize (Dimension d) {

            /**
             * Resizes this object so that it has width and height.
             *
             * @param d The dimension specifying the new size of the object.
             * @see #getSize
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Dimension getSize() {

            /**
             * Returns the size of this object in the form of a Dimension object.
             * The height field of the Dimension object contains this object's
             * height, and the width field of the Dimension object contains this
             * object's width.
             *
             * @return A Dimension object that indicates the size of this component;
             * null if this object is not on the screen
             * @see #setSize
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setBounds(Rectangle r) {

            /**
             * Sets the bounds of this object in the form of a Rectangle object.
             * The bounds specify this object's width, height, and location
             * relative to its parent.
             *
             * @param r rectangle indicating this component's bounds
             * @see #getBounds
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Rectangle getBounds() {

            /**
             * Gets the bounds of this object in the form of a Rectangle object.
             * The bounds specify this object's width, height, and location
             * relative to its parent.
             *
             * @return A rectangle indicating this component's bounds; null if
             * this object is not on the screen.
             * @see #contains
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setLocation(Point p) {

            /**
             * Sets the location of the object relative to the parent.
             * @param p the new position for the top-left corner
             * @see #getLocation
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Point getLocation() {

            /**
             * Gets the location of the object relative to the parent
             * in the form of a point specifying the object's
             * top-left corner in the screen's coordinate space.
             *
             * @return an instance of <code>Point</code> representing
             *    the top-left corner of the object's bounds in the
             *    coordinate space of the screen; <code>null</code> if
             *    this object or its parent are not on the screen
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Point getLocationOnScreen() {

            /**
             * Returns the location of the object on the screen.
             *
             * @return location of object on screen -- can be
             *    <code>null</code> if this object is not on the screen
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean contains(Point p) {

            /**
             * Checks whether the specified point is within this
             * object's bounds, where the point's x and y coordinates
             * are defined to be relative to the coordinate system of
             * the object.
             *
             * @param p the <code>Point</code> relative to the
             *    coordinate system of the object
             * @return true if object contains <code>Point</code>;
             *    otherwise false
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isShowing() {

            /**
             * Determines if the object is showing.  This is determined
             * by checking the visibility of the object and ancestors
             * of the object.  Note: this will return true even if the
             * object is obscured by another (for example,
             * it happens to be underneath a menu that was pulled down).
             *
             * @return true if the object is showing; otherwise, false
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setVisible(boolean b) {

            /**
             * Sets the visible state of the object.
             *
             * @param b if true, shows this object; otherwise, hides it
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isVisible() {

            /**
             * Determines if this object is visible.  Note: this means that the
             * object intends to be visible; however, it may not in fact be
             * showing on the screen because one of the objects that this object
             * is contained by is not visible.  To determine if an object is
             * showing on the screen, use <code>isShowing</code>.
             *
             * @return true if object is visible; otherwise, false
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setEnabled(boolean b) {

            /**
             * Sets the enabled state of the object.
             *
             * @param b if true, enables this object; otherwise, disables it
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isEnabled() {

            /**
             * Determines if the object is enabled.
             *
             * @return true if object is enabled; otherwise, false
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public FontMetrics getFontMetrics(Font f) {

            /**
             * Gets the <code>FontMetrics</code> of this object.
             *
             * @param f the <code>Font</code>
             * @return the <code>FontMetrics</code> object, if supported;
             *    otherwise <code>null</code>
             * @see #getFont
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setFont(Font f) {

            /**
             * Sets the <code>Font</code> of this object.
             *
             * @param f the new <code>Font</code> for the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Font getFont() {

            /**
             * Gets the <code>Font</code> of this object.
             *
             * @return the <code>Font</code>,if supported,
             *   for the object; otherwise, <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setCursor(Cursor c) {

            /**
             * Sets the <code>Cursor</code> of this object.
             *
             * @param c the new <code>Cursor</code> for the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Cursor getCursor() {

            /**
             * Gets the <code>Cursor</code> of this object.
             *
             * @return the <code>Cursor</code>, if supported,
             *    of the object; otherwise, <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setForeground(Color c) {

            /**
             * Sets the foreground color of this object.
             *
             * @param c the new <code>Color</code> for the foreground
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Color getForeground() {

            /**
             * Gets the foreground color of this object.
             *
             * @return the foreground color, if supported, of the object;
             *     otherwise, <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setBackground(Color c) {

            /**
             * Sets the background color of this object.
             *
             * @param c the new <code>Color</code> for the background
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Color getBackground() {

            /**
             * Gets the background color of this object.
             *
             * @return the background color, if supported, of the object;
             *     otherwise, <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleValue getAccessibleValue() {

            /**
             * Gets the <code>AccessibleValue</code> associated with
             * this object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleValue</code>, or <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleText getAccessibleText() {

            /**
             * Gets the <code>AccessibleText</code> associated with this
             * object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleText</code>, or <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleSelection getAccessibleSelection() {

            /**
             * Gets the <code>AccessibleSelection</code> associated with
             * this object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleSelection</code>, or
             *    <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleComponent getAccessibleComponent() {

            /**
             * Gets the <code>AccessibleComponent</code> associated with
             * this object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleComponent</code>, or
             *    <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleAction getAccessibleAction() {

            /**
             * Gets the <code>AccessibleAction</code> associated with this
             * object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleAction</code>, or <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void removePropertyChangeListener(PropertyChangeListener l) {

            /**
             * Removes a <code>PropertyChangeListener</code> from the
             * listener list. This removes a <code>PropertyChangeListener</code>
             * that was registered for all properties.
             *
             * @param l  the <code>PropertyChangeListener</code>
             *    to be removed
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void addPropertyChangeListener(PropertyChangeListener l) {

            /**
             * Adds a <code>PropertyChangeListener</code> to the listener list.
             * The listener is registered for all properties.
             *
             * @param l  the <code>PropertyChangeListener</code>
             *     to be added
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Locale getLocale() {

            /**
             * Gets the locale of the component. If the component
             * does not have a locale, then the locale of its parent
             * is returned.
             *
             * @return this component's locale; if this component does
             *    not have a locale, the locale of its parent is returned
             * @exception IllegalComponentStateException if the
             *    <code>Component</code> does not have its own locale
             *    and has not yet been added to a containment hierarchy
             *    such that the locale can be determined from the
             *    containing parent
             * @see #setLocale
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleChild(int i) {

            /**
             * Returns the specified <code>Accessible</code> child of the
             * object.
             *
             * @param i zero-based index of child
             * @return the <code>Accessible</code> child of the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int getAccessibleChildrenCount() {

            /**
             * Returns the number of accessible children in the object.
             *
             * @return the number of accessible children in the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int getAccessibleIndexInParent() {

            /**
             * Gets the index of this object in its accessible parent.
             *
             * @return the index of this object in its parent; -1 if this
             *     object does not have an accessible parent
             * @see #getAccessibleParent
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleParent() {

            /**
             * Gets the <code>Accessible</code> parent of this object.
             *
             * @return the Accessible parent of this object;
             *     <code>null</code> if this object does not
             *     have an <code>Accessible</code> parent
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleStateSet getAccessibleStateSet() {

            /**
             * Gets the state set of this object.
             *
             * @return an instance of <code>AccessibleStateSet</code>
             *     containing the current state set of the object
             * @see AccessibleState
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Gets the role of this object.
             *
             * @return an instance of <code>AccessibleRole</code>
             *      describing the role of the object
             * @see AccessibleRole
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleDescription(String s) {

            /**
             * Sets the accessible description of this object.
             *
             * @param s the new localized description of the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public String getAccessibleDescription() {

            /**
             * Gets the accessible description of this object.
             *
             * @return the localized description of the object;
             *     <code>null</code> if this object does not have
             *     a description
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleName(String s) {

            /**
             * Sets the localized accessible name of this object.
             *
             * @param s the new localized name of the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public String getAccessibleName() {

            /**
             * Gets the accessible name of this object.
             *
             * @return the localized name of the object; <code>null</code>
             *     if this object does not have a name
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleContext getAccessibleContext() {

            /**
             * Gets the <code>AccessibleContext</code> associated with this
             * component. In the implementation of the Java Accessibility
             * API for this class, return this object, which is its own
             * <code>AccessibleContext</code>.
             *
             * @return this object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleJTableHeaderCell(int row, int column,
                                              JTableHeader parent,
                                              Component rendererComponent) {

            /**
             * Constructs an <code>AccessibleJTableHeaderEntry</code> instance.
             *
             * @param row header cell row index
             * @param column header cell column index
             * @param parent header cell parent
             * @param rendererComponent component that renders the header cell
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        private class AccessibleJTableHeaderCell extends AccessibleContext

        /**
         * This class implements accessibility for JTable header cells.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setLocation(Point p) {

            /**
             * Sets the location of the object relative to the parent.
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Point getLocation() {

            /**
             * Gets the location of the object relative to the parent
             * in the form of a point specifying the object's
             * top-left corner in the screen's coordinate space.
             *
             * @return an instance of <code>Point</code> representing
             *    the top-left corner of the object's bounds in the
             *    coordinate space of the screen; <code>null</code> if
             *    this object or its parent are not on the screen
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Point getLocationOnScreen() {

            /**
             * Returns the location of the object on the screen.
             *
             * @return location of object on screen -- can be
             *    <code>null</code> if this object is not on the screen
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean contains(Point p) {

            /**
             * Checks whether the specified point is within this
             * object's bounds, where the point's x and y coordinates
             * are defined to be relative to the coordinate system of
             * the object.
             *
             * @param p the <code>Point</code> relative to the
             *    coordinate system of the object
             * @return true if object contains <code>Point</code>;
             *    otherwise false
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isShowing() {

            /**
             * Determines if the object is showing.  This is determined
             * by checking the visibility of the object and ancestors
             * of the object.  Note: this will return true even if the
             * object is obscured by another (for example,
             * it happens to be underneath a menu that was pulled down).
             *
             * @return true if the object is showing; otherwise, false
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setVisible(boolean b) {

            /**
             * Sets the visible state of the object.
             *
             * @param b if true, shows this object; otherwise, hides it
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isVisible() {

            /**
             * Determines if this object is visible.  Note: this means that the
             * object intends to be visible; however, it may not in fact be
             * showing on the screen because one of the objects that this object
             * is contained by is not visible.  To determine if an object is
             * showing on the screen, use <code>isShowing</code>.
             *
             * @return true if object is visible; otherwise, false
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setEnabled(boolean b) {

            /**
             * Sets the enabled state of the object.
             *
             * @param b if true, enables this object; otherwise, disables it
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isEnabled() {

            /**
             * Determines if the object is enabled.
             *
             * @return true if object is enabled; otherwise, false
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public FontMetrics getFontMetrics(Font f) {

            /**
             * Gets the <code>FontMetrics</code> of this object.
             *
             * @param f the <code>Font</code>
             * @return the <code>FontMetrics</code> object, if supported;
             *    otherwise <code>null</code>
             * @see #getFont
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setFont(Font f) {

            /**
             * Sets the <code>Font</code> of this object.
             *
             * @param f the new <code>Font</code> for the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Font getFont() {

            /**
             * Gets the <code>Font</code> of this object.
             *
             * @return the <code>Font</code>,if supported,
             *   for the object; otherwise, <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setCursor(Cursor c) {

            /**
             * Sets the <code>Cursor</code> of this object.
             *
             * @param c the new <code>Cursor</code> for the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Cursor getCursor() {

            /**
             * Gets the <code>Cursor</code> of this object.
             *
             * @return the <code>Cursor</code>, if supported,
             *    of the object; otherwise, <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setForeground(Color c) {

            /**
             * Sets the foreground color of this object.
             *
             * @param c the new <code>Color</code> for the foreground
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Color getForeground() {

            /**
             * Gets the foreground color of this object.
             *
             * @return the foreground color, if supported, of the object;
             *     otherwise, <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setBackground(Color c) {

            /**
             * Sets the background color of this object.
             *
             * @param c the new <code>Color</code> for the background
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Color getBackground() {

            /**
             * Gets the background color of this object.
             *
             * @return the background color, if supported, of the object;
             *     otherwise, <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleValue getAccessibleValue() {

            /**
             * Gets the <code>AccessibleValue</code> associated with
             * this object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleValue</code>, or <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleText getAccessibleText() {

            /**
             * Gets the <code>AccessibleText</code> associated with this
             * object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleText</code>, or <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleSelection getAccessibleSelection() {

            /**
             * Gets the <code>AccessibleSelection</code> associated with
             * this object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleSelection</code>, or
             *    <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleComponent getAccessibleComponent() {

            /**
             * Gets the <code>AccessibleComponent</code> associated with
             * this object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleComponent</code>, or
             *    <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleAction getAccessibleAction() {

            /**
             * Gets the <code>AccessibleAction</code> associated with this
             * object if one exists.  Otherwise returns <code>null</code>.
             *
             * @return the <code>AccessibleAction</code>, or <code>null</code>
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void removePropertyChangeListener(PropertyChangeListener l) {

            /**
             * Removes a <code>PropertyChangeListener</code> from the
             * listener list. This removes a <code>PropertyChangeListener</code>
             * that was registered for all properties.
             *
             * @param l  the <code>PropertyChangeListener</code>
             *    to be removed
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void addPropertyChangeListener(PropertyChangeListener l) {

            /**
             * Adds a <code>PropertyChangeListener</code> to the listener list.
             * The listener is registered for all properties.
             *
             * @param l  the <code>PropertyChangeListener</code>
             *     to be added
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Locale getLocale() {

            /**
             * Gets the locale of the component. If the component
             * does not have a locale, then the locale of its parent
             * is returned.
             *
             * @return this component's locale; if this component does
             *    not have a locale, the locale of its parent is returned
             * @exception IllegalComponentStateException if the
             *    <code>Component</code> does not have its own locale
             *    and has not yet been added to a containment hierarchy
             *    such that the locale can be determined from the
             *    containing parent
             * @see #setLocale
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleChild(int i) {

            /**
             * Returns the specified <code>Accessible</code> child of the
             * object.
             *
             * @param i zero-based index of child
             * @return the <code>Accessible</code> child of the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int getAccessibleChildrenCount() {

            /**
             * Returns the number of accessible children in the object.
             *
             * @return the number of accessible children in the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int getAccessibleIndexInParent() {

            /**
             * Gets the index of this object in its accessible parent.
             *
             * @return the index of this object in its parent; -1 if this
             *     object does not have an accessible parent
             * @see #getAccessibleParent
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleParent() {

            /**
             * Gets the <code>Accessible</code> parent of this object.
             *
             * @return the Accessible parent of this object;
             *     <code>null</code> if this object does not
             *     have an <code>Accessible</code> parent
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleStateSet getAccessibleStateSet() {

            /**
             * Gets the state set of this object.
             *
             * @return an instance of <code>AccessibleStateSet</code>
             *     containing the current state set of the object
             * @see AccessibleState
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Gets the role of this object.
             *
             * @return an instance of <code>AccessibleRole</code>
             *      describing the role of the object
             * @see AccessibleRole
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleDescription(String s) {

            /**
             * Sets the accessible description of this object.
             *
             * @param s the new localized description of the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public String getAccessibleDescription() {

            /**
             * Gets the accessible description of this object.
             *
             * @return the localized description of the object;
             *     <code>null</code> if this object does not have
             *     a description
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleName(String s) {

            /**
             * Sets the localized accessible name of this object.
             *
             * @param s the new localized name of the object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public String getAccessibleName() {

            /**
             * Gets the accessible name of this object.
             *
             * @return the localized name of the object; <code>null</code>
             *     if this object does not have a name
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            protected Component getCurrentComponent() {

            /**
             * Gets the table cell renderer component.
             *
             * @return the table cell renderer component if one exists;
             * otherwise, returns <code>null</code>.
             * @since 1.6
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            protected AccessibleContext getCurrentAccessibleContext() {

            /**
             * Gets the AccessibleContext for the table cell renderer.
             *
             * @return the <code>AccessibleContext</code> for the table
             * cell renderer if one exists;
             * otherwise, returns <code>null</code>.
             * @since 1.6
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleContext getAccessibleContext() {

            /**
             * Gets the <code>AccessibleContext</code> associated with this
             * component. In the implementation of the Java Accessibility
             * API for this class, return this object, which is its own
             * <code>AccessibleContext</code>.
             *
             * @return this object
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleJTableCell(JTable t, int r, int c, int i) {

            /**
             *  Constructs an <code>AccessibleJTableHeaderEntry</code>.
             * @since 1.4
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        protected class AccessibleJTableCell extends AccessibleContext

        /**
         * The class provides an implementation of the Java Accessibility
         * API appropriate to table cells.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleIndexAt(int r, int c) {

        /**
         * Returns the index at a given (row, column) in the table.
         *
         * @param r zero-based row of the table
         * @param c zero-based column of the table
         * @return the index into the table
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleColumnAtIndex(int i) {

        /**
         * Returns the column at a given index into the table.
         *
         * @param i zero-based index into the table
         * @return the column at a given index
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleRowAtIndex(int i) {

        /**
         * Returns the row at a given index into the table.
         *
         * @param i zero-based index into the table
         * @return the row at a given index
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int [] getSelectedAccessibleColumns() {

        /**
         * Returns the selected columns in a table.
         *
         * @return an array of selected columns where each element is a
         *     zero-based column of the table
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int [] getSelectedAccessibleRows() {

        /**
         * Returns the selected rows in a table.
         *
         * @return an array of selected rows where each element is a
         *     zero-based row of the table
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public boolean isAccessibleColumnSelected(int c) {

        /**
         * Returns a boolean value indicating whether the specified column
         * is selected.
         *
         * @param c zero-based column of the table
         * @return the boolean value true if the specified column is selected;
         *     otherwise, false
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public boolean isAccessibleRowSelected(int r) {

        /**
         * Returns a boolean value indicating whether the specified row
         * is selected.
         *
         * @param r zero-based row of the table
         * @return the boolean value true if the specified row is selected;
         *     otherwise, false
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public boolean isAccessibleSelected(int r, int c) {

        /**
         * Returns a boolean value indicating whether the accessible at a
         * given (row, column) is selected.
         *
         * @param r zero-based row of the table
         * @param c zero-based column of the table
         * @return the boolean value true if the accessible at (row, column)
         *     is selected; otherwise, the boolean value false
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void setAccessibleColumnDescription(int c, Accessible a) {

        /**
         * Sets the description text of the specified column of the table.
         *
         * @param c zero-based column of the table
         * @param a the description of the column
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public Accessible getAccessibleColumnDescription(int c) {

        /**
         * Returns the description of the specified column in the table.
         *
         * @param c zero-based column of the table
         * @return the description of the column
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void setAccessibleRowDescription(int r, Accessible a) {

        /**
         * Sets the description text of the specified row of the table.
         *
         * @param r zero-based row of the table
         * @param a the description of the row
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public Accessible getAccessibleRowDescription(int r) {

        /**
         * Returns the description of the specified row in the table.
         *
         * @param r zero-based row of the table
         * @return the description of the row
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void setAccessibleColumnHeader(AccessibleTable a) {

        /**
         * Sets the column headers as an <code>AccessibleTable</code>.
         *
         * @param a an <code>AccessibleTable</code> representing the
         * column headers
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int [] getSelectedAccessibleColumns() { return new int[0]; }

            /**
             * Returns the selected columns in a table.
             *
             * @return an array of selected columns where each element is a
             * zero-based column of the table
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int [] getSelectedAccessibleRows() { return new int[0]; }

            /**
             * Returns the selected rows in a table.
             *
             * @return an array of selected rows where each element is a
             * zero-based row of the table
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isAccessibleColumnSelected(int c) { return false; }

            /**
             * Returns a boolean value indicating whether the specified column
             * is selected.
             *
             * @param c zero-based column of the table
             * @return the boolean value true if the specified column is selected.
             * Otherwise, false.
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isAccessibleRowSelected(int r) { return false; }

            /**
             * Returns a boolean value indicating whether the specified row
             * is selected.
             *
             * @param r zero-based row of the table
             * @return the boolean value true if the specified row is selected.
             * Otherwise, false.
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public boolean isAccessibleSelected(int r, int c) { return false; }

            /**
             * Returns a boolean value indicating whether the accessible at
             * a specified row and column is selected.
             *
             * @param r zero-based row of the table
             * @param c zero-based column of the table
             * @return the boolean value true if the accessible at the
             * row and column is selected. Otherwise, the boolean value
             * false
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleColumnDescription(int c, Accessible a) {}

            /**
             * Sets the description text of the specified column in the table.
             *
             * @param c zero-based column of the table
             * @param a the text description of the column
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleColumnDescription(int c) { return null; }

            /**
             * Returns the description text of the specified column in the table.
             *
             * @param c zero-based column of the table
             * @return the text description of the column
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleRowDescription(int r, Accessible a) {}

            /**
             * Sets the description text of the specified row of the table.
             *
             * @param r zero-based row of the table
             * @param a the description of the row
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleRowDescription(int r) { return null; }

            /**
             * Returns the description of the specified row in the table.
             *
             * @param r zero-based row of the table
             * @return the description of the row
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleColumnHeader(AccessibleTable table) {}

            /**
             * Sets the column headers.
             *
             * @param table an AccessibleTable representing the
             * column headers
             * @since 1.3
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleTable getAccessibleColumnHeader() { return null; }

            /**
             * Returns the column headers as an AccessibleTable.
             *
             * @return an AccessibleTable representing the column
             * headers
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleRowHeader(AccessibleTable table) {}

            /**
             * Sets the row headers.
             *
             * @param table an AccessibleTable representing the
             * row headers
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public AccessibleTable getAccessibleRowHeader() { return null; }

            /**
             * Returns the row headers as an AccessibleTable.
             *
             * @return an AccessibleTable representing the row
             * headers
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int getAccessibleColumnExtentAt(int r, int c) { return 1; }

            /**
             * Returns the number of columns occupied by the Accessible at
             * a specified row and column in the table.
             *
             * @return the number of columns occupied by the Accessible at a
             * given specified row and column
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int getAccessibleRowExtentAt(int r, int c) { return 1; }

            /**
             * Returns the number of rows occupied by the Accessible at
             * a specified row and column in the table.
             *
             * @return the number of rows occupied by the Accessible at a
             * given specified (row, column)
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleAt(int row, int column) {

            /**
             * Returns the Accessible at a specified row and column
             * in the table.
             *
             * @param row zero-based row of the table
             * @param column zero-based column of the table
             * @return the Accessible at the specified row and column
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int getAccessibleColumnCount() {

            /**
             * Returns the number of columns in the table.
             *
             * @return the number of columns in the table
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public int getAccessibleRowCount() { return 1; }

            /**
             * Returns the number of rows in the table.
             *
             * @return the number of rows in the table
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleSummary(Accessible a) {}

            /**
             * Sets the summary description of the table
             *
             * @param a the summary description of the table
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleSummary() { return null; }

            /**
             * Returns the summary description of the table.
             *
             * @return the summary description of the table
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public void setAccessibleCaption(Accessible a) {}

            /**
             * Sets the caption for the table.
             *
             * @param a the caption for the table
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
            public Accessible getAccessibleCaption() { return null; }

            /**
             * Returns the caption for the table.
             *
             * @return the caption for the table
             */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public AccessibleTable getAccessibleColumnHeader() {

        /**
         * Returns the column headers as an <code>AccessibleTable</code>.
         *
         *  @return an <code>AccessibleTable</code> representing the column
         *          headers, or <code>null</code> if the table header is
         *          <code>null</code>
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void setAccessibleRowHeader(AccessibleTable a) {

        /**
         * Sets the row headers as an <code>AccessibleTable</code>.
         *
         * @param a an <code>AccessibleTable</code> representing the row
         *  headers
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public AccessibleTable getAccessibleRowHeader() {

        /**
         * Returns the row headers as an <code>AccessibleTable</code>.
         *
         * @return an <code>AccessibleTable</code> representing the row
         * headers
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleColumnExtentAt(int r, int c) {

        /**
         * Returns the number of columns occupied by the
         * <code>Accessible</code> at a given (row, column).
         *
         * @return the number of columns occupied by the <code>Accessible</code>
         *     at a specified row and column in the table
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleRowExtentAt(int r, int c) {

        /**
         * Returns the number of rows occupied by the <code>Accessible</code>
         * at a specified row and column in the table.
         *
         * @return the number of rows occupied by the <code>Accessible</code>
         *     at a specified row and column in the table
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void setAccessibleSummary(Accessible a) {

        /**
         * Sets the summary description of the table.
         *
         * @param a the summary description of the table
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public Accessible getAccessibleSummary() {

        /**
         * Returns the summary description of the table.
         *
         * @return the summary description of the table
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void setAccessibleCaption(Accessible a) {

        /**
         * Sets the caption for the table.
         *
         * @param a the caption for the table
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public Accessible getAccessibleCaption() {

        /**
         * Returns the caption for the table.
         *
         * @return the caption for the table
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public AccessibleTable getAccessibleTable() {

        /**
         * Gets the <code>AccessibleTable</code> associated with this
         * object.  In the implementation of the Java Accessibility
         * API for this class, return this object, which is responsible
         * for implementing the <code>AccessibleTables</code> interface
         * on behalf of itself.
         *
         * @return this object
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleIndex(int r, int c) {

        /**
         * Returns the index at a row and column in the table.
         *
         * @param r zero-based row of the table
         * @param c zero-based column of the table
         * @return the zero-based index in the table if one exists;
         * otherwise -1.
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleColumn(int index) {

        /**
         * Returns the column number of an index in the table.
         *
         * @param index the zero-based index in the table
         * @return the zero-based column of the table if one exists;
         * otherwise -1.
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleRow(int index) {

        /**
         * Returns the row number of an index in the table.
         *
         * @param index the zero-based index in the table
         * @return the zero-based row of the table if one exists;
         * otherwise -1.
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void selectAllAccessibleSelection() {

        /**
         * Causes every child of the object to be selected, but only
         * if the <code>JTable</code> supports multiple selections,
         * and if individual cell selection is enabled.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void clearAccessibleSelection() {

        /**
         * Clears the selection in the object, so that no children in the
         * object are selected.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void removeAccessibleSelection(int i) {

        /**
         * Removes the specified child of the object from the object's
         * selection.  If the specified item isn't currently selected, this
         * method has no effect.
         * <p>
         * This method only works on <code>JTables</code> which have
         * individual cell selection enabled.
         *
         * @param i the zero-based index of the child
         * @see AccessibleContext#getAccessibleChild
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void addAccessibleSelection(int i) {

        /**
         * Adds the specified <code>Accessible</code> child of the
         * object to the object's selection.  If the object supports
         * multiple selections, the specified child is added to
         * any existing selection, otherwise
         * it replaces any existing selection in the object.  If the
         * specified child is already selected, this method has no effect.
         * <p>
         * This method only works on <code>JTable</code>s which have
         * individual cell selection enabled.
         *
         * @param i the zero-based index of the child
         * @see AccessibleContext#getAccessibleChild
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public boolean isAccessibleChildSelected(int i) {

        /**
         * Determines if the current child of this object is selected.
         *
         * @param i the zero-based index of the child in this
         *    <code>Accessible</code> object
         * @return true if the current child of this object is selected
         * @see AccessibleContext#getAccessibleChild
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public Accessible getAccessibleSelection(int i) {

        /**
         * Returns an <code>Accessible</code> representing the
         * specified selected child in the object.  If there
         * isn't a selection, or there are fewer children selected
         * than the integer passed in, the return
         * value will be <code>null</code>.
         * <p>Note that the index represents the i-th selected child, which
         * is different from the i-th child.
         *
         * @param i the zero-based index of selected children
         * @return the i-th selected child
         * @see #getAccessibleSelectionCount
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleSelectionCount() {

        /**
         * Returns the number of <code>Accessible</code> children
         * currently selected.
         * If no children are selected, the return value will be 0.
         *
         * @return the number of items currently selected
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth <code>Accessible</code> child of the object.
         *
         * @param i zero-based index of child
         * @return the nth Accessible child of the object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement <code>Accessible</code>,
         * then this method should return the number of children of this object.
         *
         * @return the number of accessible children in the object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public Accessible getAccessibleAt(Point p) {

        /**
         * Returns the <code>Accessible</code> child, if one exists,
         * contained at the local coordinate <code>Point</code>.
         *
         * @param p the point defining the top-left corner of the
         *    <code>Accessible</code>, given in the coordinate space
         *    of the object's parent
         * @return the <code>Accessible</code>, if it exists,
         *    at the specified location; else <code>null</code>
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Gets the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void valueChanged(ListSelectionEvent e) {

        /**
         * Track changes to table cell selections
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void editingCanceled(ChangeEvent e) {

        /**
         * Invoked when editing is canceled. The editor object is discarded
         * and the cell is rendered once again.
         *
         * @see CellEditorListener
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void editingStopped(ChangeEvent e) {

        /**
         * Track changes to a cell's contents.
         *
         * Invoked when editing is finished. The changes are saved, the
         * editor object is discarded, and the cell is rendered once again.
         *
         * @see CellEditorListener
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void columnSelectionChanged(ListSelectionEvent e) {

        /**
         * Track that the selection model of the TableColumnModel changed.
         *
         * @see TableColumnModelListener
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void columnMarginChanged(ChangeEvent e) {

        /**
         * Track changes of a column moving due to margin changes.
         *
         * @see TableColumnModelListener
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void columnMoved(TableColumnModelEvent e) {

        /**
         * Track changes of a column repositioning.
         *
         * @see TableColumnModelListener
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void columnRemoved(TableColumnModelEvent e) {

        /**
         * Track changes to the table contents (column deletions)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void columnAdded(TableColumnModelEvent e) {

        /**
         * Track changes to the table contents (column insertions)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void tableRowsDeleted(TableModelEvent e) {

        /**
         * Track changes to the table contents (row deletions)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void tableRowsInserted(TableModelEvent e) {

        /**
         * Track changes to the table contents (row insertions)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void tableChanged(TableModelEvent e) {

        /**
         * Track changes to the table contents
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void propertyChange(PropertyChangeEvent e) {

        /**
         * Track changes to selection model, column model, etc. so as to
         * be able to re-place listeners on those in order to pass on
         * information to the Accessibility PropertyChange mechanism
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        protected AccessibleJTable() {

        /**
         * AccessibleJTable constructor
         *
         * @since 1.5
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected class AccessibleJTable extends AccessibleJComponent

    /**
     * This class implements accessibility support for the
     * <code>JTable</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to table user-interface elements.
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int print(final Graphics graphics,
                         final PageFormat pageFormat,
                         final int pageIndex) throws PrinterException {

        /**
         * Prints the specified page into the given {@link Graphics}
         * context, in the specified format.
         * <p>
         * Regardless of what thread this method is called on, all calls into
         * the delegate will be done on the event-dispatch thread.
         *
         * @param   graphics    the context into which the page is drawn
         * @param   pageFormat  the size and orientation of the page being drawn
         * @param   pageIndex   the zero based index of the page to be drawn
         * @return  PAGE_EXISTS if the page is rendered successfully, or
         *          NO_SUCH_PAGE if a non-existent page index is specified
         * @throws  PrinterException if an error causes printing to be aborted
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public ThreadSafePrintable(Printable printDelegate) {

        /**
         * Construct a <code>ThreadSafePrintable</code> around the given
         * delegate.
         *
         * @param printDelegate the <code>Printable</code> to delegate to
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        private Throwable retThrowable;

        /**
         * To communicate any <code>Throwable</code> when delegating.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        private int retVal;

        /**
         * To communicate any return value when delegating.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        private Printable printDelegate;

        /** The delegate <code>Printable</code>. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private class ThreadSafePrintable implements Printable {

    /**
     * A <code>Printable</code> implementation that wraps another
     * <code>Printable</code>, making it safe for printing on another thread.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Printable getPrintable(PrintMode printMode,
                                  MessageFormat headerFormat,
                                  MessageFormat footerFormat) {

    /**
     * Return a <code>Printable</code> for use in printing this JTable.
     * <p>
     * This method is meant for those wishing to customize the default
     * <code>Printable</code> implementation used by <code>JTable</code>'s
     * <code>print</code> methods. Developers wanting simply to print the table
     * should use one of those methods directly.
     * <p>
     * The <code>Printable</code> can be requested in one of two printing modes.
     * In both modes, it spreads table rows naturally in sequence across
     * multiple pages, fitting as many rows as possible per page.
     * <code>PrintMode.NORMAL</code> specifies that the table be
     * printed at its current size. In this mode, there may be a need to spread
     * columns across pages in a similar manner to that of the rows. When the
     * need arises, columns are distributed in an order consistent with the
     * table's <code>ComponentOrientation</code>.
     * <code>PrintMode.FIT_WIDTH</code> specifies that the output be
     * scaled smaller, if necessary, to fit the table's entire width
     * (and thereby all columns) on each page. Width and height are scaled
     * equally, maintaining the aspect ratio of the output.
     * <p>
     * The <code>Printable</code> heads the portion of table on each page
     * with the appropriate section from the table's <code>JTableHeader</code>,
     * if it has one.
     * <p>
     * Header and footer text can be added to the output by providing
     * <code>MessageFormat</code> arguments. The printing code requests
     * Strings from the formats, providing a single item which may be included
     * in the formatted string: an <code>Integer</code> representing the current
     * page number.
     * <p>
     * You are encouraged to read the documentation for
     * <code>MessageFormat</code> as some characters, such as single-quote,
     * are special and need to be escaped.
     * <p>
     * Here's an example of creating a <code>MessageFormat</code> that can be
     * used to print "Duke's Table: Page - " and the current page number:
     *
     * <pre>
     *     // notice the escaping of the single quote
     *     // notice how the page number is included with "{0}"
     *     MessageFormat format = new MessageFormat("Duke''s Table: Page - {0}");
     * </pre>
     * <p>
     * The <code>Printable</code> constrains what it draws to the printable
     * area of each page that it prints. Under certain circumstances, it may
     * find it impossible to fit all of a page's content into that area. In
     * these cases the output may be clipped, but the implementation
     * makes an effort to do something reasonable. Here are a few situations
     * where this is known to occur, and how they may be handled by this
     * particular implementation:
     * <ul>
     *   <li>In any mode, when the header or footer text is too wide to fit
     *       completely in the printable area -- print as much of the text as
     *       possible starting from the beginning, as determined by the table's
     *       <code>ComponentOrientation</code>.
     *   <li>In any mode, when a row is too tall to fit in the
     *       printable area -- print the upper-most portion of the row
     *       and paint no lower border on the table.
     *   <li>In <code>PrintMode.NORMAL</code> when a column
     *       is too wide to fit in the printable area -- print the center
     *       portion of the column and leave the left and right borders
     *       off the table.
     * </ul>
     * <p>
     * It is entirely valid for this <code>Printable</code> to be wrapped
     * inside another in order to create complex reports and documents. You may
     * even request that different pages be rendered into different sized
     * printable areas. The implementation must be prepared to handle this
     * (possibly by doing its layout calculations on the fly). However,
     * providing different heights to each page will likely not work well
     * with <code>PrintMode.NORMAL</code> when it has to spread columns
     * across pages.
     * <p>
     * As far as customizing how the table looks in the printed result,
     * <code>JTable</code> itself will take care of hiding the selection
     * and focus during printing. For additional customizations, your
     * renderers or painting code can customize the look based on the value
     * of {@link javax.swing.JComponent#isPaintingForPrint()}
     * <p>
     * Also, <i>before</i> calling this method you may wish to <i>first</i>
     * modify the state of the table, such as to cancel cell editing or
     * have the user size the table appropriately. However, you must not
     * modify the state of the table <i>after</i> this <code>Printable</code>
     * has been fetched (invalid modifications include changes in size or
     * underlying data). The behavior of the returned <code>Printable</code>
     * is undefined once the table has been changed.
     *
     * @param  printMode     the printing mode that the printable should use
     * @param  headerFormat  a <code>MessageFormat</code> specifying the text to
     *                       be used in printing a header, or null for none
     * @param  footerFormat  a <code>MessageFormat</code> specifying the text to
     *                       be used in printing a footer, or null for none
     * @return a <code>Printable</code> for printing this JTable
     * @see #print(JTable.PrintMode, MessageFormat, MessageFormat,
     *             boolean, PrintRequestAttributeSet, boolean)
     * @see Printable
     * @see PrinterJob
     *
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean print(PrintMode printMode,
                         MessageFormat headerFormat,
                         MessageFormat footerFormat,
                         boolean showPrintDialog,
                         PrintRequestAttributeSet attr,
                         boolean interactive,
                         PrintService service) throws PrinterException,

    /**
     * Prints this <code>JTable</code>. Takes steps that the majority of
     * developers would take in order to print a <code>JTable</code>.
     * In short, it prepares the table, calls <code>getPrintable</code> to
     * fetch an appropriate <code>Printable</code>, and then sends it to the
     * printer.
     * <p>
     * A <code>boolean</code> parameter allows you to specify whether or not
     * a printing dialog is displayed to the user. When it is, the user may
     * use the dialog to change the destination printer or printing attributes,
     * or even to cancel the print. Another two parameters allow for a
     * <code>PrintService</code> and printing attributes to be specified.
     * These parameters can be used either to provide initial values for the
     * print dialog, or to specify values when the dialog is not shown.
     * <p>
     * A second <code>boolean</code> parameter allows you to specify whether
     * or not to perform printing in an interactive mode. If <code>true</code>,
     * a modal progress dialog, with an abort option, is displayed for the
     * duration of printing . This dialog also prevents any user action which
     * may affect the table. However, it can not prevent the table from being
     * modified by code (for example, another thread that posts updates using
     * <code>SwingUtilities.invokeLater</code>). It is therefore the
     * responsibility of the developer to ensure that no other code modifies
     * the table in any way during printing (invalid modifications include
     * changes in: size, renderers, or underlying data). Printing behavior is
     * undefined when the table is changed during printing.
     * <p>
     * If <code>false</code> is specified for this parameter, no dialog will
     * be displayed and printing will begin immediately on the event-dispatch
     * thread. This blocks any other events, including repaints, from being
     * processed until printing is complete. Although this effectively prevents
     * the table from being changed, it doesn't provide a good user experience.
     * For this reason, specifying <code>false</code> is only recommended when
     * printing from an application with no visible GUI.
     * <p>
     * Note: Attempting to show the printing dialog or run interactively, while
     * in headless mode, will result in a <code>HeadlessException</code>.
     * <p>
     * Before fetching the printable, this method will gracefully terminate
     * editing, if necessary, to prevent an editor from showing in the printed
     * result. Additionally, <code>JTable</code> will prepare its renderers
     * during printing such that selection and focus are not indicated.
     * As far as customizing further how the table looks in the printout,
     * developers can provide custom renderers or paint code that conditionalize
     * on the value of {@link javax.swing.JComponent#isPaintingForPrint()}.
     * <p>
     * See {@link #getPrintable} for more description on how the table is
     * printed.
     *
     * @param  printMode        the printing mode that the printable should use
     * @param  headerFormat     a <code>MessageFormat</code> specifying the text
     *                          to be used in printing a header,
     *                          or <code>null</code> for none
     * @param  footerFormat     a <code>MessageFormat</code> specifying the text
     *                          to be used in printing a footer,
     *                          or <code>null</code> for none
     * @param  showPrintDialog  whether or not to display a print dialog
     * @param  attr             a <code>PrintRequestAttributeSet</code>
     *                          specifying any printing attributes,
     *                          or <code>null</code> for none
     * @param  interactive      whether or not to print in an interactive mode
     * @param  service          the destination <code>PrintService</code>,
     *                          or <code>null</code> to use the default printer
     * @return true, unless printing is cancelled by the user
     * @throws HeadlessException if the method is asked to show a printing
     *                           dialog or run interactively, and
     *                           <code>GraphicsEnvironment.isHeadless</code>
     *                           returns <code>true</code>
     * @throws  SecurityException if a security manager exists and its
     *          {@link java.lang.SecurityManager#checkPrintJobAccess}
     *          method disallows this thread from creating a print job request
     * @throws PrinterException if an error in the print system causes the job
     *                          to be aborted
     * @see #getPrintable
     * @see java.awt.GraphicsEnvironment#isHeadless
     *
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean print(PrintMode printMode,
                         MessageFormat headerFormat,
                         MessageFormat footerFormat,
                         boolean showPrintDialog,
                         PrintRequestAttributeSet attr,
                         boolean interactive) throws PrinterException,

    /**
     * Prints this table, as specified by the fully featured
     * {@link #print(JTable.PrintMode, MessageFormat, MessageFormat,
     * boolean, PrintRequestAttributeSet, boolean, PrintService) print}
     * method, with the default printer specified as the print service.
     *
     * @param  printMode        the printing mode that the printable should use
     * @param  headerFormat     a <code>MessageFormat</code> specifying the text
     *                          to be used in printing a header,
     *                          or <code>null</code> for none
     * @param  footerFormat     a <code>MessageFormat</code> specifying the text
     *                          to be used in printing a footer,
     *                          or <code>null</code> for none
     * @param  showPrintDialog  whether or not to display a print dialog
     * @param  attr             a <code>PrintRequestAttributeSet</code>
     *                          specifying any printing attributes,
     *                          or <code>null</code> for none
     * @param  interactive      whether or not to print in an interactive mode
     * @return true, unless printing is cancelled by the user
     * @throws HeadlessException if the method is asked to show a printing
     *                           dialog or run interactively, and
     *                           <code>GraphicsEnvironment.isHeadless</code>
     *                           returns <code>true</code>
     * @throws SecurityException if this thread is not allowed to
     *                           initiate a print job request
     * @throws PrinterException if an error in the print system causes the job
     *                          to be aborted
     * @see #print(JTable.PrintMode, MessageFormat, MessageFormat,
     *             boolean, PrintRequestAttributeSet, boolean, PrintService)
     * @see #getPrintable
     *
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean print(PrintMode printMode,
                         MessageFormat headerFormat,
                         MessageFormat footerFormat) throws PrinterException {

    /**
     * A convenience method that displays a printing dialog, and then prints
     * this <code>JTable</code> in the given printing mode,
     * with the specified header and footer text. A modal progress dialog,
     * with an abort option, will be shown for the duration of printing.
     * <p>
     * Note: In headless mode, no dialogs are shown and printing
     * occurs on the default printer.
     *
     * @param  printMode        the printing mode that the printable should use
     * @param  headerFormat     a <code>MessageFormat</code> specifying the text
     *                          to be used in printing a header,
     *                          or null for none
     * @param  footerFormat     a <code>MessageFormat</code> specifying the text
     *                          to be used in printing a footer,
     *                          or null for none
     * @return true, unless printing is cancelled by the user
     * @throws SecurityException if this thread is not allowed to
     *                           initiate a print job request
     * @throws PrinterException if an error in the print system causes the job
     *                          to be aborted
     * @see #print(JTable.PrintMode, MessageFormat, MessageFormat,
     *             boolean, PrintRequestAttributeSet, boolean, PrintService)
     * @see #getPrintable
     *
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean print(PrintMode printMode) throws PrinterException {

    /**
     * A convenience method that displays a printing dialog, and then prints
     * this <code>JTable</code> in the given printing mode,
     * with no header or footer text. A modal progress dialog, with an abort
     * option, will be shown for the duration of printing.
     * <p>
     * Note: In headless mode, no dialogs are shown and printing
     * occurs on the default printer.
     *
     * @param  printMode        the printing mode that the printable should use
     * @return true, unless printing is cancelled by the user
     * @throws SecurityException if this thread is not allowed to
     *                           initiate a print job request
     * @throws PrinterException if an error in the print system causes the job
     *                          to be aborted
     * @see #print(JTable.PrintMode, MessageFormat, MessageFormat,
     *             boolean, PrintRequestAttributeSet, boolean, PrintService)
     * @see #getPrintable
     *
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    /**

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
// Printing Support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected String paramString() {

    /**
     * Returns a string representation of this table. This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this table
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See readObject() and writeObject() in JComponent for more
     * information about serialization in Swing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void removeEditor() {

    /**
     * Discards the editor object and frees the real estate it used for
     * cell rendering.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Component prepareEditor(TableCellEditor editor, int row, int column) {

    /**
     * Prepares the editor by querying the data model for the value and
     * selection state of the cell at <code>row</code>, <code>column</code>.
     * <p>
     * <b>Note:</b>
     * Throughout the table package, the internal implementations always
     * use this method to prepare editors so that this default behavior
     * can be safely overridden by a subclass.
     *
     * @param editor  the <code>TableCellEditor</code> to set up
     * @param row     the row of the cell to edit,
     *                where 0 is the first row
     * @param column  the column of the cell to edit,
     *                where 0 is the first column
     * @return the <code>Component</code> being edited
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public TableCellEditor getCellEditor(int row, int column) {

    /**
     * Returns an appropriate editor for the cell specified by
     * <code>row</code> and <code>column</code>. If the
     * <code>TableColumn</code> for this column has a non-null editor,
     * returns that.  If not, finds the class of the data in this
     * column (using <code>getColumnClass</code>)
     * and returns the default editor for this type of data.
     * <p>
     * <b>Note:</b>
     * Throughout the table package, the internal implementations always
     * use this method to provide editors so that this default behavior
     * can be safely overridden by a subclass.
     *
     * @param row       the row of the cell to edit, where 0 is the first row
     * @param column    the column of the cell to edit,
     *                  where 0 is the first column
     * @return          the editor for this cell;
     *                  if <code>null</code> return the default editor for
     *                  this type of cell
     * @see DefaultCellEditor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {

    /**
     * Prepares the renderer by querying the data model for the
     * value and selection state
     * of the cell at <code>row</code>, <code>column</code>.
     * Returns the component (may be a <code>Component</code>
     * or a <code>JComponent</code>) under the event location.
     * <p>
     * During a printing operation, this method will configure the
     * renderer without indicating selection or focus, to prevent
     * them from appearing in the printed output. To do other
     * customizations based on whether or not the table is being
     * printed, you can check the value of
     * {@link javax.swing.JComponent#isPaintingForPrint()}, either here
     * or within custom renderers.
     * <p>
     * <b>Note:</b>
     * Throughout the table package, the internal implementations always
     * use this method to prepare renderers so that this default behavior
     * can be safely overridden by a subclass.
     *
     * @param renderer  the <code>TableCellRenderer</code> to prepare
     * @param row       the row of the cell to render, where 0 is the first row
     * @param column    the column of the cell to render,
     *                  where 0 is the first column
     * @return          the <code>Component</code> under the event location
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public TableCellRenderer getCellRenderer(int row, int column) {

    /**
     * Returns an appropriate renderer for the cell specified by this row and
     * column. If the <code>TableColumn</code> for this column has a non-null
     * renderer, returns that.  If not, finds the class of the data in
     * this column (using <code>getColumnClass</code>)
     * and returns the default renderer for this type of data.
     * <p>
     * <b>Note:</b>
     * Throughout the table package, the internal implementations always
     * use this method to provide renderers so that this default behavior
     * can be safely overridden by a subclass.
     *
     * @param row       the row of the cell to render, where 0 is the first row
     * @param column    the column of the cell to render,
     *                  where 0 is the first column
     * @return the assigned renderer; if <code>null</code>
     *                  returns the default renderer
     *                  for this type of object
     * @see javax.swing.table.DefaultTableCellRenderer
     * @see javax.swing.table.TableColumn#setCellRenderer
     * @see #setDefaultRenderer
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setEditingRow(int aRow) {

    /**
     * Sets the <code>editingRow</code> variable.
     * @param aRow  the row of the cell to be edited
     *
     * @see #editingRow
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setEditingColumn(int aColumn) {

    /**
     * Sets the <code>editingColumn</code> variable.
     * @param aColumn  the column of the cell to be edited
     *
     * @see #editingColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setCellEditor(TableCellEditor anEditor) {

    /**
     * Sets the active cell editor.
     *
     * @param anEditor the active cell editor
     * @see #cellEditor
     * @beaninfo
     *  bound: true
     *  description: The table's active cell editor.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public TableCellEditor getCellEditor() {

    /**
     * Returns the active cell editor, which is {@code null} if the table
     * is not currently editing.
     *
     * @return the {@code TableCellEditor} that does the editing,
     *         or {@code null} if the table is not currently editing.
     * @see #cellEditor
     * @see #getCellEditor(int, int)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected void resizeAndRepaint() {

    /**
     * Equivalent to <code>revalidate</code> followed by <code>repaint</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected JTableHeader createDefaultTableHeader() {

    /**
     * Returns the default table header object, which is
     * a <code>JTableHeader</code>.  A subclass can override this
     * method to return a different table header object.
     *
     * @return the default table header object
     * @see javax.swing.table.JTableHeader
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected ListSelectionModel createDefaultSelectionModel() {

    /**
     * Returns the default selection model object, which is
     * a <code>DefaultListSelectionModel</code>.  A subclass can override this
     * method to return a different selection model object.
     *
     * @return the default selection model object
     * @see javax.swing.DefaultListSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected TableColumnModel createDefaultColumnModel() {

    /**
     * Returns the default column model object, which is
     * a <code>DefaultTableColumnModel</code>.  A subclass can override this
     * method to return a different column model object.
     *
     * @return the default column model object
     * @see javax.swing.table.DefaultTableColumnModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected TableModel createDefaultDataModel() {

    /**
     * Returns the default table model object, which is
     * a <code>DefaultTableModel</code>.  A subclass can override this
     * method to return a different table model object.
     *
     * @return the default table model object
     * @see javax.swing.table.DefaultTableModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected void initializeLocalVars() {

    /**
     * Initializes table properties to their default values.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    static class GenericEditor extends DefaultCellEditor {

    /**
     * Default Editors
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected void createDefaultEditors() {

    /**
     * Creates default cell editors for objects, numbers, and boolean values.
     * @see DefaultCellEditor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    static class NumberRenderer extends DefaultTableCellRenderer.UIResource {

    /**
     * Default Renderers
     **/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected void createDefaultRenderers() {

    /**
     * Creates default cell renderers for objects, numbers, doubles, dates,
     * booleans, and icons.
     * @see javax.swing.table.DefaultTableCellRenderer
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getFillsViewportHeight() {

    /**
     * Returns whether or not this table is always made large enough
     * to fill the height of an enclosing viewport.
     *
     * @return whether or not this table is always made large enough
     *         to fill the height of an enclosing viewport
     * @see #setFillsViewportHeight
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setFillsViewportHeight(boolean fillsViewportHeight) {

    /**
     * Sets whether or not this table is always made large enough
     * to fill the height of an enclosing viewport. If the preferred
     * height of the table is smaller than the viewport, then the table
     * will be stretched to fill the viewport. In other words, this
     * ensures the table is never smaller than the viewport.
     * The default for this property is {@code false}.
     *
     * @param fillsViewportHeight whether or not this table is always
     *        made large enough to fill the height of an enclosing
     *        viewport
     * @see #getFillsViewportHeight
     * @see #getScrollableTracksViewportHeight
     * @since 1.6
     * @beaninfo
     *      bound: true
     *      description: Whether or not this table is always made large enough
     *                   to fill the height of an enclosing viewport
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getScrollableTracksViewportHeight() {

    /**
     * Returns {@code false} to indicate that the height of the viewport does
     * not determine the height of the table, unless
     * {@code getFillsViewportHeight} is {@code true} and the preferred height
     * of the table is smaller than the viewport's height.
     *
     * @return {@code false} unless {@code getFillsViewportHeight} is
     *         {@code true} and the table needs to be stretched to fill
     *         the viewport
     * @see Scrollable#getScrollableTracksViewportHeight
     * @see #setFillsViewportHeight
     * @see #getFillsViewportHeight
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getScrollableTracksViewportWidth() {

    /**
     * Returns false if <code>autoResizeMode</code> is set to
     * <code>AUTO_RESIZE_OFF</code>, which indicates that the
     * width of the viewport does not determine the width
     * of the table.  Otherwise returns true.
     *
     * @return false if <code>autoResizeMode</code> is set
     *   to <code>AUTO_RESIZE_OFF</code>, otherwise returns true
     * @see Scrollable#getScrollableTracksViewportWidth
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private int getNextBlockIncrement(Rectangle visibleRect,
                                      int orientation) {

    /**
     * Called to get the block increment for downward scrolling in cases of
     * horizontal scrolling, or for vertical scrolling of a table with
     * variable row heights.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private int getPreviousBlockIncrement(Rectangle visibleRect,
                                          int orientation) {

    /**
     * Called to get the block increment for upward scrolling in cases of
     * horizontal scrolling, or for vertical scrolling of a table with
     * variable row heights.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getScrollableBlockIncrement(Rectangle visibleRect,
            int orientation, int direction) {

    /**
     * Returns <code>visibleRect.height</code> or
     * <code>visibleRect.width</code>,
     * depending on this table's orientation.  Note that as of Swing 1.1.1
     * (Java 2 v 1.2.2) the value
     * returned will ensure that the viewport is cleanly aligned on
     * a row boundary.
     *
     * @return <code>visibleRect.height</code> or
     *                                  <code>visibleRect.width</code>
     *                                  per the orientation
     * @see Scrollable#getScrollableBlockIncrement
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getScrollableUnitIncrement(Rectangle visibleRect,
                                          int orientation,
                                          int direction) {

    /**
     * Returns the scroll increment (in pixels) that completely exposes one new
     * row or column (depending on the orientation).
     * <p>
     * This method is called each time the user requests a unit scroll.
     *
     * @param visibleRect the view area visible within the viewport
     * @param orientation either <code>SwingConstants.VERTICAL</code>
     *                  or <code>SwingConstants.HORIZONTAL</code>
     * @param direction less than zero to scroll up/left,
     *                  greater than zero for down/right
     * @return the "unit" increment for scrolling in the specified direction
     * @see Scrollable#getScrollableUnitIncrement
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Dimension getPreferredScrollableViewportSize() {

    /**
     * Returns the preferred size of the viewport for this table.
     *
     * @return a <code>Dimension</code> object containing the <code>preferredSize</code> of the <code>JViewport</code>
     *         which displays this table
     * @see Scrollable#getPreferredScrollableViewportSize
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setPreferredScrollableViewportSize(Dimension size) {

    /**
     * Sets the preferred size of the viewport for this table.
     *
     * @param size  a <code>Dimension</code> object specifying the <code>preferredSize</code> of a
     *              <code>JViewport</code> whose view is this table
     * @see Scrollable#getPreferredScrollableViewportSize
     * @beaninfo
     * description: The preferred size of the viewport.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void editingCanceled(ChangeEvent e) {

    /**
     * Invoked when editing is canceled. The editor object is discarded
     * and the cell is rendered once again.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by JTable.
     *
     * @param  e  the event received
     * @see CellEditorListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void editingStopped(ChangeEvent e) {

    /**
     * Invoked when editing is finished. The changes are saved and the
     * editor is discarded.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by JTable.
     *
     * @param  e  the event received
     * @see CellEditorListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void valueChanged(ListSelectionEvent e) {

    /**
     * Invoked when the row selection changes -- repaints to show the new
     * selection.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by JTable.
     *
     * @param e   the event received
     * @see ListSelectionListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void columnSelectionChanged(ListSelectionEvent e) {

    /**
     * Invoked when the selection model of the <code>TableColumnModel</code>
     * is changed.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by JTable.
     *
     * @param  e  the event received
     * @see TableColumnModelListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void columnMarginChanged(ChangeEvent e) {

    /**
     * Invoked when a column is moved due to a margin change.
     * If a cell is being edited, then editing is stopped and the cell
     * is redrawn.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by JTable.
     *
     * @param  e    the event received
     * @see TableColumnModelListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void columnMoved(TableColumnModelEvent e) {

    /**
     * Invoked when a column is repositioned. If a cell is being
     * edited, then editing is stopped and the cell is redrawn.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by JTable.
     *
     * @param e   the event received
     * @see TableColumnModelListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void columnRemoved(TableColumnModelEvent e) {

    /**
     * Invoked when a column is removed from the table column model.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by JTable.
     *
     * @see TableColumnModelListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void columnAdded(TableColumnModelEvent e) {

    /**
     * Invoked when a column is added to the table column model.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by JTable.
     *
     * @see TableColumnModelListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void tableChanged(TableModelEvent e) {

    /**
     * Invoked when this table's <code>TableModel</code> generates
     * a <code>TableModelEvent</code>.
     * The <code>TableModelEvent</code> should be constructed in the
     * coordinate system of the model; the appropriate mapping to the
     * view coordinate system is performed by this <code>JTable</code>
     * when it receives the event.
     * <p>
     * Application code will not use these methods explicitly, they
     * are used internally by <code>JTable</code>.
     * <p>
     * Note that as of 1.3, this method clears the selection, if any.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private int[] convertSelectionToModel(RowSorterEvent e) {

    /**
     * Converts the selection to model coordinates.  This is used when
     * the model changes or the sorter changes.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private int convertRowIndexToView(int modelIndex, ModelChange change) {

    /**
     * Converts a model index to view index.  This is called when the
     * sorter or model changes and sorting is enabled.
     *
     * @param change describes the TableModelEvent that initiated the change;
     *        will be null if called as the result of a sort
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private void notifySorter(ModelChange change) {

    /**
     * Notifies the sorter of a change in the underlying model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private void restoreSortingEditingRow(int editingRow) {

    /**
     * Restores the editing row after a model event/sort order change.
     *
     * @param editingRow new index of the editingRow, in terms of the view
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private void restoreSortingSelection(int[] selection, int lead,
            ModelChange change) {

    /**
     * Restores the selection after a model event/sort order changes.
     * All coordinates are in terms of the model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private void repaintSortedRows(ModelChange change) {

    /**
     * Repaints the sort of sorted rows in response to a TableModelEvent.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private void sortedTableChanged(RowSorterEvent sortedEvent,
                                    TableModelEvent e) {

    /**
     * Invoked when <code>sorterChanged</code> is invoked, or
     * when <code>tableChanged</code> is invoked and sorting is enabled.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private final class ModelChange {

    /**
     * ModelChange is used when sorting to restore state, it corresponds
     * to data from a TableModelEvent.  The values are precalculated as
     * they are used extensively.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        private void restoreSelection(ModelChange change) {

        /**
         * Restores the selection from that in terms of the model.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        private void setViewRowHeightsFromModel() {

        /**
         * Resets the variable row heights in terms of the view from
         * that of the variable row heights in terms of the model.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void processChange(RowSorterEvent sortEvent,
                                  ModelChange change,
                                  boolean sorterChanged) {

        /**
         * Inovked when either the table has changed or the sorter has changed
         * and after the sorter has been notified. If necessary this will
         * reapply the selection and variable row heights.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        private void cacheSelection(RowSorterEvent sortEvent,
                                    ModelChange change) {

        /**
         * Updates the internal cache of the selection based on the change.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void prepareForChange(RowSorterEvent sortEvent,
                                     ModelChange change) {

        /**
         * Invoked when either the table model has changed, or the RowSorter
         * has changed. This is invoked prior to notifying the sorter of the
         * change.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void viewSelectionChanged(ListSelectionEvent e) {

        /**
         * Invoked when the selection, on the view, has changed.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void allChanged() {

        /**
         * Invoked when the underlying model has completely changed.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void setViewRowHeight(int viewIndex, int rowHeight) {

        /**
         * Sets the height for a row at a specified index.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public void dispose() {

        /**
         * Disposes any resources used by this SortManager.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private final class SortManager {

    /**
     * SortManager provides support for managing the selection and variable
     * row heights when sorting is enabled. This information is encapsulated
     * into a class to avoid bulking up JTable.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void sorterChanged(RowSorterEvent e) {

    /**
     * <code>RowSorterListener</code> notification that the
     * <code>RowSorter</code> has changed in some way.
     *
     * @param e the <code>RowSorterEvent</code> describing the change
     * @throws NullPointerException if <code>e</code> is <code>null</code>
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public ListSelectionModel getSelectionModel() {

    /**
     * Returns the <code>ListSelectionModel</code> that is used to maintain row
     * selection state.
     *
     * @return  the object that provides row selection state, <code>null</code>
     *          if row selection is not allowed
     * @see     #setSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setSelectionModel(ListSelectionModel newModel) {

    /**
     * Sets the row selection model for this table to <code>newModel</code>
     * and registers for listener notifications from the new selection model.
     *
     * @param   newModel        the new selection model
     * @exception IllegalArgumentException      if <code>newModel</code> is <code>null</code>
     * @see     #getSelectionModel
     * @beaninfo
     *      bound: true
     *      description: The selection model for rows.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public TableColumnModel getColumnModel() {

    /**
     * Returns the <code>TableColumnModel</code> that contains all column information
     * of this table.
     *
     * @return  the object that provides the column state of the table
     * @see     #setColumnModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setColumnModel(TableColumnModel columnModel) {

    /**
     * Sets the column model for this table to <code>newModel</code> and registers
     * for listener notifications from the new column model. Also sets
     * the column model of the <code>JTableHeader</code> to <code>columnModel</code>.
     *
     * @param   columnModel        the new data source for this table
     * @exception IllegalArgumentException      if <code>columnModel</code> is <code>null</code>
     * @see     #getColumnModel
     * @beaninfo
     *  bound: true
     *  description: The object governing the way columns appear in the view.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public TableModel getModel() {

    /**
     * Returns the <code>TableModel</code> that provides the data displayed by this
     * <code>JTable</code>.
     *
     * @return  the <code>TableModel</code> that provides the data displayed by this <code>JTable</code>
     * @see     #setModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setModel(TableModel dataModel) {

    /**
     * Sets the data model for this table to <code>newModel</code> and registers
     * with it for listener notifications from the new data model.
     *
     * @param   dataModel        the new data source for this table
     * @exception IllegalArgumentException      if <code>newModel</code> is <code>null</code>
     * @see     #getModel
     * @beaninfo
     *  bound: true
     *  description: The model that is the source of the data for this view.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public String getUIClassID() {

    /**
     * Returns the suffix used to construct the name of the L&amp;F class used to
     * render this component.
     *
     * @return the string "TableUI"
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setUI(TableUI ui) {

    /**
     * Sets the L&amp;F object that renders this component and repaints.
     *
     * @param ui  the TableUI L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public TableUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return the <code>TableUI</code> object that renders this component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getEditingRow() {

    /**
     * Returns the index of the row that contains the cell currently
     * being edited.  If nothing is being edited, returns -1.
     *
     * @return  the index of the row that contains the cell currently
     *          being edited; returns -1 if nothing being edited
     * @see #editingColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getEditingColumn() {

    /**
     * Returns the index of the column that contains the cell currently
     * being edited.  If nothing is being edited, returns -1.
     *
     * @return  the index of the column that contains the cell currently
     *          being edited; returns -1 if nothing being edited
     * @see #editingRow
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Component getEditorComponent() {

    /**
     * Returns the component that is handling the editing session.
     * If nothing is being edited, returns null.
     *
     * @return  Component handling editing session
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean isEditing() {

    /**
     * Returns true if a cell is being edited.
     *
     * @return  true if the table is editing a cell
     * @see     #editingColumn
     * @see     #editingRow
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean editCellAt(int row, int column, EventObject e){

    /**
     * Programmatically starts editing the cell at <code>row</code> and
     * <code>column</code>, if those indices are in the valid range, and
     * the cell at those indices is editable.
     * To prevent the <code>JTable</code> from
     * editing a particular table, column or cell value, return false from
     * the <code>isCellEditable</code> method in the <code>TableModel</code>
     * interface.
     *
     * @param   row     the row to be edited
     * @param   column  the column to be edited
     * @param   e       event to pass into <code>shouldSelectCell</code>;
     *                  note that as of Java 2 platform v1.2, the call to
     *                  <code>shouldSelectCell</code> is no longer made
     * @return  false if for any reason the cell cannot be edited,
     *                or if the indices are invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean editCellAt(int row, int column) {

    /**
     * Programmatically starts editing the cell at <code>row</code> and
     * <code>column</code>, if those indices are in the valid range, and
     * the cell at those indices is editable.
     * Note that this is a convenience method for
     * <code>editCellAt(int, int, null)</code>.
     *
     * @param   row                             the row to be edited
     * @param   column                          the column to be edited
     * @return  false if for any reason the cell cannot be edited,
     *                or if the indices are invalid
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getSurrendersFocusOnKeystroke() {

    /**
     * Returns true if the editor should get the focus
     * when keystrokes cause the editor to be activated
     *
     * @return  true if the editor should get the focus
     *          when keystrokes cause the editor to be
     *          activated
     *
     * @see #setSurrendersFocusOnKeystroke
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setSurrendersFocusOnKeystroke(boolean surrendersFocusOnKeystroke) {

    /**
     * Sets whether editors in this JTable get the keyboard focus
     * when an editor is activated as a result of the JTable
     * forwarding keyboard events for a cell.
     * By default, this property is false, and the JTable
     * retains the focus unless the cell is clicked.
     *
     * @param surrendersFocusOnKeystroke true if the editor should get the focus
     *          when keystrokes cause the editor to be
     *          activated
     *
     *
     * @see #getSurrendersFocusOnKeystroke
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public String getToolTipText(MouseEvent event) {

    /**
     * Overrides <code>JComponent</code>'s <code>getToolTipText</code>
     * method in order to allow the renderer's tips to be used
     * if it has text set.
     * <p>
     * <b>Note:</b> For <code>JTable</code> to properly display
     * tooltips of its renderers
     * <code>JTable</code> must be a registered component with the
     * <code>ToolTipManager</code>.
     * This is done automatically in <code>initializeLocalVars</code>,
     * but if at a later point <code>JTable</code> is told
     * <code>setToolTipText(null)</code> it will unregister the table
     * component, and no tips from renderers will display anymore.
     *
     * @see JComponent#getToolTipText
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void sizeColumnsToFit(int resizingColumn) {

    /**
     * Obsolete as of Java 2 platform v1.4.  Please use the
     * <code>doLayout()</code> method instead.
     * @param resizingColumn    the column whose resizing made this adjustment
     *                          necessary or -1 if there is no such column
     * @see  #doLayout
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    @Deprecated

    /**
     * Sizes the table columns to fit the available space.
     * @deprecated As of Swing version 1.0.3,
     * replaced by <code>doLayout()</code>.
     * @see #doLayout
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void doLayout() {

    /**
     * Causes this table to lay out its rows and columns.  Overridden so
     * that columns can be resized to accommodate a change in the size of
     * a containing parent.
     * Resizes one or more of the columns in the table
     * so that the total width of all of this <code>JTable</code>'s
     * columns is equal to the width of the table.
     * <p>
     * Before the layout begins the method gets the
     * <code>resizingColumn</code> of the <code>tableHeader</code>.
     * When the method is called as a result of the resizing of an enclosing window,
     * the <code>resizingColumn</code> is <code>null</code>. This means that resizing
     * has taken place "outside" the <code>JTable</code> and the change -
     * or "delta" - should be distributed to all of the columns regardless
     * of this <code>JTable</code>'s automatic resize mode.
     * <p>
     * If the <code>resizingColumn</code> is not <code>null</code>, it is one of
     * the columns in the table that has changed size rather than
     * the table itself. In this case the auto-resize modes govern
     * the way the extra (or deficit) space is distributed
     * amongst the available columns.
     * <p>
     * The modes are:
     * <ul>
     * <li>  AUTO_RESIZE_OFF: Don't automatically adjust the column's
     * widths at all. Use a horizontal scrollbar to accommodate the
     * columns when their sum exceeds the width of the
     * <code>Viewport</code>.  If the <code>JTable</code> is not
     * enclosed in a <code>JScrollPane</code> this may
     * leave parts of the table invisible.
     * <li>  AUTO_RESIZE_NEXT_COLUMN: Use just the column after the
     * resizing column. This results in the "boundary" or divider
     * between adjacent cells being independently adjustable.
     * <li>  AUTO_RESIZE_SUBSEQUENT_COLUMNS: Use all columns after the
     * one being adjusted to absorb the changes.  This is the
     * default behavior.
     * <li>  AUTO_RESIZE_LAST_COLUMN: Automatically adjust the
     * size of the last column only. If the bounds of the last column
     * prevent the desired size from being allocated, set the
     * width of the last column to the appropriate limit and make
     * no further adjustments.
     * <li>  AUTO_RESIZE_ALL_COLUMNS: Spread the delta amongst all the columns
     * in the <code>JTable</code>, including the one that is being
     * adjusted.
     * </ul>
     * <p>
     * <b>Note:</b> When a <code>JTable</code> makes adjustments
     *   to the widths of the columns it respects their minimum and
     *   maximum values absolutely.  It is therefore possible that,
     *   even after this method is called, the total width of the columns
     *   is still not equal to the width of the table. When this happens
     *   the <code>JTable</code> does not put itself
     *   in AUTO_RESIZE_OFF mode to bring up a scroll bar, or break other
     *   commitments of its current auto-resize mode -- instead it
     *   allows its bounds to be set larger (or smaller) than the total of the
     *   column minimum or maximum, meaning, either that there
     *   will not be enough room to display all of the columns, or that the
     *   columns will not fill the <code>JTable</code>'s bounds.
     *   These respectively, result in the clipping of some columns
     *   or an area being painted in the <code>JTable</code>'s
     *   background color during painting.
     * <p>
     *   The mechanism for distributing the delta amongst the available
     *   columns is provided in a private method in the <code>JTable</code>
     *   class:
     * <pre>
     *   adjustSizes(long targetSize, final Resizable3 r, boolean inverse)
     * </pre>
     *   an explanation of which is provided in the following section.
     *   <code>Resizable3</code> is a private
     *   interface that allows any data structure containing a collection
     *   of elements with a size, preferred size, maximum size and minimum size
     *   to have its elements manipulated by the algorithm.
     *
     * <H3> Distributing the delta </H3>
     *
     * <H4> Overview </H4>
     * <P>
     * Call "DELTA" the difference between the target size and the
     * sum of the preferred sizes of the elements in r. The individual
     * sizes are calculated by taking the original preferred
     * sizes and adding a share of the DELTA - that share being based on
     * how far each preferred size is from its limiting bound (minimum or
     * maximum).
     *
     * <H4>Definition</H4>
     * <P>
     * Call the individual constraints min[i], max[i], and pref[i].
     * <p>
     * Call their respective sums: MIN, MAX, and PREF.
     * <p>
     * Each new size will be calculated using:
     *
     * <pre>
     *          size[i] = pref[i] + delta[i]
     * </pre>
     * where each individual delta[i] is calculated according to:
     * <p>
     * If (DELTA &lt; 0) we are in shrink mode where:
     *
     * <PRE>
     *                        DELTA
     *          delta[i] = ------------ * (pref[i] - min[i])
     *                     (PREF - MIN)
     * </PRE>
     * If (DELTA &gt; 0) we are in expand mode where:
     *
     * <PRE>
     *                        DELTA
     *          delta[i] = ------------ * (max[i] - pref[i])
     *                      (MAX - PREF)
     * </PRE>
     * <P>
     * The overall effect is that the total size moves that same percentage,
     * k, towards the total minimum or maximum and that percentage guarantees
     * accommodation of the required space, DELTA.
     *
     * <H4>Details</H4>
     * <P>
     * Naive evaluation of the formulae presented here would be subject to
     * the aggregated rounding errors caused by doing this operation in finite
     * precision (using ints). To deal with this, the multiplying factor above,
     * is constantly recalculated and this takes account of the rounding
     * errors in the previous iterations. The result is an algorithm that
     * produces a set of integers whose values exactly sum to the supplied
     * <code>targetSize</code>, and does so by spreading the rounding
     * errors evenly over the given elements.
     *
     * <H4>When the MAX and MIN bounds are hit</H4>
     * <P>
     * When <code>targetSize</code> is outside the [MIN, MAX] range,
     * the algorithm sets all sizes to their appropriate limiting value
     * (maximum or minimum).
     *
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Rectangle getCellRect(int row, int column, boolean includeSpacing) {

    /**
     * Returns a rectangle for the cell that lies at the intersection of
     * <code>row</code> and <code>column</code>.
     * If <code>includeSpacing</code> is true then the value returned
     * has the full height and width of the row and column
     * specified. If it is false, the returned rectangle is inset by the
     * intercell spacing to return the true bounds of the rendering or
     * editing component as it will be set during rendering.
     * <p>
     * If the column index is valid but the row index is less
     * than zero the method returns a rectangle with the
     * <code>y</code> and <code>height</code> values set appropriately
     * and the <code>x</code> and <code>width</code> values both set
     * to zero. In general, when either the row or column indices indicate a
     * cell outside the appropriate range, the method returns a rectangle
     * depicting the closest edge of the closest cell that is within
     * the table's range. When both row and column indices are out
     * of range the returned rectangle covers the closest
     * point of the closest cell.
     * <p>
     * In all cases, calculations that use this method to calculate
     * results along one axis will not fail because of anomalies in
     * calculations along the other axis. When the cell is not valid
     * the <code>includeSpacing</code> parameter is ignored.
     *
     * @param   row                   the row index where the desired cell
     *                                is located
     * @param   column                the column index where the desired cell
     *                                is located in the display; this is not
     *                                necessarily the same as the column index
     *                                in the data model for the table; the
     *                                {@link #convertColumnIndexToView(int)}
     *                                method may be used to convert a data
     *                                model column index to a display
     *                                column index
     * @param   includeSpacing        if false, return the true cell bounds -
     *                                computed by subtracting the intercell
     *                                spacing from the height and widths of
     *                                the column and row models
     *
     * @return  the rectangle containing the cell at location
     *          <code>row</code>,<code>column</code>
     * @see #getIntercellSpacing
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int rowAtPoint(Point point) {

    /**
     * Returns the index of the row that <code>point</code> lies in,
     * or -1 if the result is not in the range
     * [0, <code>getRowCount()</code>-1].
     *
     * @param   point   the location of interest
     * @return  the index of the row that <code>point</code> lies in,
     *          or -1 if the result is not in the range
     *          [0, <code>getRowCount()</code>-1]
     * @see     #columnAtPoint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int columnAtPoint(Point point) {

    /**
     * Returns the index of the column that <code>point</code> lies in,
     * or -1 if the result is not in the range
     * [0, <code>getColumnCount()</code>-1].
     *
     * @param   point   the location of interest
     * @return  the index of the column that <code>point</code> lies in,
     *          or -1 if the result is not in the range
     *          [0, <code>getColumnCount()</code>-1]
     * @see     #rowAtPoint
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void moveColumn(int column, int targetColumn) {

    /**
     * Moves the column <code>column</code> to the position currently
     * occupied by the column <code>targetColumn</code> in the view.
     * The old column at <code>targetColumn</code> is
     * shifted left or right to make room.
     *
     * @param   column                  the index of column to be moved
     * @param   targetColumn            the new index of the column
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void removeColumn(TableColumn aColumn) {

    /**
     *  Removes <code>aColumn</code> from this <code>JTable</code>'s
     *  array of columns.  Note: this method does not remove the column
     *  of data from the model; it just removes the <code>TableColumn</code>
     *  that was responsible for displaying it.
     *
     *  @param  aColumn         the <code>TableColumn</code> to be removed
     *  @see    #addColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void addColumn(TableColumn aColumn) {

    /**
     *  Appends <code>aColumn</code> to the end of the array of columns held by
     *  this <code>JTable</code>'s column model.
     *  If the column name of <code>aColumn</code> is <code>null</code>,
     *  sets the column name of <code>aColumn</code> to the name
     *  returned by <code>getModel().getColumnName()</code>.
     *  <p>
     *  To add a column to this <code>JTable</code> to display the
     *  <code>modelColumn</code>'th column of data in the model with a
     *  given <code>width</code>, <code>cellRenderer</code>,
     *  and <code>cellEditor</code> you can use:
     *  <pre>
     *
     *      addColumn(new TableColumn(modelColumn, width, cellRenderer, cellEditor));
     *
     *  </pre>
     *  [Any of the <code>TableColumn</code> constructors can be used
     *  instead of this one.]
     *  The model column number is stored inside the <code>TableColumn</code>
     *  and is used during rendering and editing to locate the appropriates
     *  data values in the model. The model column number does not change
     *  when columns are reordered in the view.
     *
     *  @param  aColumn         the <code>TableColumn</code> to be added
     *  @see    #removeColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean isCellEditable(int row, int column) {

    /**
     * Returns true if the cell at <code>row</code> and <code>column</code>
     * is editable.  Otherwise, invoking <code>setValueAt</code> on the cell
     * will have no effect.
     * <p>
     * <b>Note</b>: The column is specified in the table view's display
     *              order, and not in the <code>TableModel</code>'s column
     *              order.  This is an important distinction because as the
     *              user rearranges the columns in the table,
     *              the column at a given index in the view will change.
     *              Meanwhile the user's actions never affect the model's
     *              column ordering.
     *
     *
     * @param   row      the row whose value is to be queried
     * @param   column   the column whose value is to be queried
     * @return  true if the cell is editable
     * @see #setValueAt
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setValueAt(Object aValue, int row, int column) {

    /**
     * Sets the value for the cell in the table model at <code>row</code>
     * and <code>column</code>.
     * <p>
     * <b>Note</b>: The column is specified in the table view's display
     *              order, and not in the <code>TableModel</code>'s column
     *              order.  This is an important distinction because as the
     *              user rearranges the columns in the table,
     *              the column at a given index in the view will change.
     *              Meanwhile the user's actions never affect the model's
     *              column ordering.
     *
     * <code>aValue</code> is the new value.
     *
     * @param   aValue          the new value
     * @param   row             the row of the cell to be changed
     * @param   column          the column of the cell to be changed
     * @see #getValueAt
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Object getValueAt(int row, int column) {

    /**
     * Returns the cell value at <code>row</code> and <code>column</code>.
     * <p>
     * <b>Note</b>: The column is specified in the table view's display
     *              order, and not in the <code>TableModel</code>'s column
     *              order.  This is an important distinction because as the
     *              user rearranges the columns in the table,
     *              the column at a given index in the view will change.
     *              Meanwhile the user's actions never affect the model's
     *              column ordering.
     *
     * @param   row             the row whose value is to be queried
     * @param   column          the column whose value is to be queried
     * @return  the Object at the specified cell
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Class<?> getColumnClass(int column) {

    /**
     * Returns the type of the column appearing in the view at
     * column position <code>column</code>.
     *
     * @param   column   the column in the view being queried
     * @return the type of the column at position <code>column</code>
     *          in the view where the first column is column 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public String getColumnName(int column) {

    /**
     * Returns the name of the column appearing in the view at
     * column position <code>column</code>.
     *
     * @param  column    the column in the view being queried
     * @return the name of the column at position <code>column</code>
                        in the view where the first column is column 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getColumnCount() {

    /**
     * Returns the number of columns in the column model. Note that this may
     * be different from the number of columns in the table model.
     *
     * @return  the number of columns in the table
     * @see #getRowCount
     * @see #removeColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getRowCount() {

    /**
     * Returns the number of rows that can be shown in the
     * <code>JTable</code>, given unlimited space.  If a
     * <code>RowSorter</code> with a filter has been specified, the
     * number of rows returned may differ from that of the underlying
     * <code>TableModel</code>.
     *
     * @return the number of rows shown in the <code>JTable</code>
     * @see #getColumnCount
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int convertRowIndexToModel(int viewRowIndex) {

    /**
     * Maps the index of the row in terms of the view to the
     * underlying <code>TableModel</code>.  If the contents of the
     * model are not sorted the model and view indices are the same.
     *
     * @param viewRowIndex the index of the row in the view
     * @return the index of the corresponding row in the model
     * @throws IndexOutOfBoundsException if sorting is enabled and passed an
     *         index outside the range of the <code>JTable</code> as
     *         determined by the method <code>getRowCount</code>
     * @see javax.swing.table.TableRowSorter
     * @see #getRowCount
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int convertRowIndexToView(int modelRowIndex) {

    /**
     * Maps the index of the row in terms of the
     * <code>TableModel</code> to the view.  If the contents of the
     * model are not sorted the model and view indices are the same.
     *
     * @param modelRowIndex the index of the row in terms of the model
     * @return the index of the corresponding row in the view, or -1 if
     *         the row isn't visible
     * @throws IndexOutOfBoundsException if sorting is enabled and passed an
     *         index outside the number of rows of the <code>TableModel</code>
     * @see javax.swing.table.TableRowSorter
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int convertColumnIndexToView(int modelColumnIndex) {

    /**
     * Maps the index of the column in the table model at
     * <code>modelColumnIndex</code> to the index of the column
     * in the view.  Returns the index of the
     * corresponding column in the view; returns -1 if this column is not
     * being displayed.  If <code>modelColumnIndex</code> is less than zero,
     * returns <code>modelColumnIndex</code>.
     *
     * @param   modelColumnIndex     the index of the column in the model
     * @return   the index of the corresponding column in the view
     *
     * @see #convertColumnIndexToModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int convertColumnIndexToModel(int viewColumnIndex) {

    /**
     * Maps the index of the column in the view at
     * <code>viewColumnIndex</code> to the index of the column
     * in the table model.  Returns the index of the corresponding
     * column in the model.  If <code>viewColumnIndex</code>
     * is less than zero, returns <code>viewColumnIndex</code>.
     *
     * @param   viewColumnIndex     the index of the column in the view
     * @return  the index of the corresponding column in the model
     *
     * @see #convertColumnIndexToView
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public TableColumn getColumn(Object identifier) {

    /**
     * Returns the <code>TableColumn</code> object for the column in the table
     * whose identifier is equal to <code>identifier</code>, when compared using
     * <code>equals</code>.
     *
     * @return  the <code>TableColumn</code> object that matches the identifier
     * @exception IllegalArgumentException      if <code>identifier</code> is <code>null</code> or no <code>TableColumn</code> has this identifier
     *
     * @param   identifier                      the identifier object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setSelectionBackground(Color selectionBackground) {

    /**
     * Sets the background color for selected cells.  Cell renderers
     * can use this color to the fill selected cells.
     * <p>
     * The default value of this property is defined by the look
     * and feel implementation.
     * <p>
     * This is a <a href="https://docs.oracle.com/javase/tutorial/javabeans/writing/properties.html">JavaBeans</a> bound property.
     *
     * @param selectionBackground  the <code>Color</code> to use for the background
     *                             of selected cells
     * @see #getSelectionBackground
     * @see #setSelectionForeground
     * @see #setForeground
     * @see #setBackground
     * @see #setFont
     * @beaninfo
     *       bound: true
     * description: A default background color for selected cells.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Color getSelectionBackground() {

    /**
     * Returns the background color for selected cells.
     *
     * @return the <code>Color</code> used for the background of selected list items
     * @see #setSelectionBackground
     * @see #setSelectionForeground
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setSelectionForeground(Color selectionForeground) {

    /**
     * Sets the foreground color for selected cells.  Cell renderers
     * can use this color to render text and graphics for selected
     * cells.
     * <p>
     * The default value of this property is defined by the look
     * and feel implementation.
     * <p>
     * This is a <a href="https://docs.oracle.com/javase/tutorial/javabeans/writing/properties.html">JavaBeans</a> bound property.
     *
     * @param selectionForeground  the <code>Color</code> to use in the foreground
     *                             for selected list items
     * @see #getSelectionForeground
     * @see #setSelectionBackground
     * @see #setForeground
     * @see #setBackground
     * @see #setFont
     * @beaninfo
     *       bound: true
     * description: A default foreground color for selected cells.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Color getSelectionForeground() {

    /**
     * Returns the foreground color for selected cells.
     *
     * @return the <code>Color</code> object for the foreground property
     * @see #setSelectionForeground
     * @see #setSelectionBackground
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend) {

    /**
     * Updates the selection models of the table, depending on the state of the
     * two flags: <code>toggle</code> and <code>extend</code>. Most changes
     * to the selection that are the result of keyboard or mouse events received
     * by the UI are channeled through this method so that the behavior may be
     * overridden by a subclass. Some UIs may need more functionality than
     * this method provides, such as when manipulating the lead for discontiguous
     * selection, and may not call into this method for some selection changes.
     * <p>
     * This implementation uses the following conventions:
     * <ul>
     * <li> <code>toggle</code>: <em>false</em>, <code>extend</code>: <em>false</em>.
     *      Clear the previous selection and ensure the new cell is selected.
     * <li> <code>toggle</code>: <em>false</em>, <code>extend</code>: <em>true</em>.
     *      Extend the previous selection from the anchor to the specified cell,
     *      clearing all other selections.
     * <li> <code>toggle</code>: <em>true</em>, <code>extend</code>: <em>false</em>.
     *      If the specified cell is selected, deselect it. If it is not selected, select it.
     * <li> <code>toggle</code>: <em>true</em>, <code>extend</code>: <em>true</em>.
     *      Apply the selection state of the anchor to all cells between it and the
     *      specified cell.
     * </ul>
     * @param  rowIndex   affects the selection at <code>row</code>
     * @param  columnIndex  affects the selection at <code>column</code>
     * @param  toggle  see description above
     * @param  extend  if true, extend the current selection
     *
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean isCellSelected(int row, int column) {

    /**
     * Returns true if the specified indices are in the valid range of rows
     * and columns and the cell at the specified position is selected.
     * @param row   the row being queried
     * @param column  the column being queried
     *
     * @return true if <code>row</code> and <code>column</code> are valid indices
     *              and the cell at index <code>(row, column)</code> is selected,
     *              where the first row and first column are at index 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean isColumnSelected(int column) {

    /**
     * Returns true if the specified index is in the valid range of columns,
     * and the column at that index is selected.
     *
     * @param   column   the column in the column model
     * @return true if <code>column</code> is a valid index and the column at
     *              that index is selected (where 0 is the first column)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean isRowSelected(int row) {

    /**
     * Returns true if the specified index is in the valid range of rows,
     * and the row at that index is selected.
     *
     * @return true if <code>row</code> is a valid index and the row at
     *              that index is selected (where 0 is the first row)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getSelectedColumnCount() {

    /**
     * Returns the number of selected columns.
     *
     * @return the number of selected columns, 0 if no columns are selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getSelectedRowCount() {

    /**
     * Returns the number of selected rows.
     *
     * @return the number of selected rows, 0 if no rows are selected
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int[] getSelectedColumns() {

    /**
     * Returns the indices of all selected columns.
     *
     * @return an array of integers containing the indices of all selected columns,
     *         or an empty array if no column is selected
     * @see #getSelectedColumn
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int[] getSelectedRows() {

    /**
     * Returns the indices of all selected rows.
     *
     * @return an array of integers containing the indices of all selected rows,
     *         or an empty array if no row is selected
     * @see #getSelectedRow
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getSelectedColumn() {

    /**
     * Returns the index of the first selected column,
     * -1 if no column is selected.
     * @return the index of the first selected column
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getSelectedRow() {

    /**
     * Returns the index of the first selected row, -1 if no row is selected.
     * @return the index of the first selected row
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void removeColumnSelectionInterval(int index0, int index1) {

    /**
     * Deselects the columns from <code>index0</code> to <code>index1</code>, inclusive.
     *
     * @exception IllegalArgumentException      if <code>index0</code> or
     *                                          <code>index1</code> lie outside
     *                                          [0, <code>getColumnCount()</code>-1]
     * @param   index0 one end of the interval
     * @param   index1 the other end of the interval
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void removeRowSelectionInterval(int index0, int index1) {

    /**
     * Deselects the rows from <code>index0</code> to <code>index1</code>, inclusive.
     *
     * @exception IllegalArgumentException      if <code>index0</code> or
     *                                          <code>index1</code> lie outside
     *                                          [0, <code>getRowCount()</code>-1]
     * @param   index0 one end of the interval
     * @param   index1 the other end of the interval
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void addColumnSelectionInterval(int index0, int index1) {

    /**
     * Adds the columns from <code>index0</code> to <code>index1</code>,
     * inclusive, to the current selection.
     *
     * @exception IllegalArgumentException      if <code>index0</code> or
     *                                          <code>index1</code> lie outside
     *                                          [0, <code>getColumnCount()</code>-1]
     * @param   index0 one end of the interval
     * @param   index1 the other end of the interval
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void addRowSelectionInterval(int index0, int index1) {

    /**
     * Adds the rows from <code>index0</code> to <code>index1</code>, inclusive, to
     * the current selection.
     *
     * @exception IllegalArgumentException      if <code>index0</code> or <code>index1</code>
     *                                          lie outside [0, <code>getRowCount()</code>-1]
     * @param   index0 one end of the interval
     * @param   index1 the other end of the interval
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setColumnSelectionInterval(int index0, int index1) {

    /**
     * Selects the columns from <code>index0</code> to <code>index1</code>,
     * inclusive.
     *
     * @exception IllegalArgumentException      if <code>index0</code> or
     *                                          <code>index1</code> lie outside
     *                                          [0, <code>getColumnCount()</code>-1]
     * @param   index0 one end of the interval
     * @param   index1 the other end of the interval
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setRowSelectionInterval(int index0, int index1) {

    /**
     * Selects the rows from <code>index0</code> to <code>index1</code>,
     * inclusive.
     *
     * @exception IllegalArgumentException      if <code>index0</code> or
     *                                          <code>index1</code> lie outside
     *                                          [0, <code>getRowCount()</code>-1]
     * @param   index0 one end of the interval
     * @param   index1 the other end of the interval
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void clearSelection() {

    /**
     * Deselects all selected columns and rows.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void selectAll() {

    /**
     *  Selects all rows, columns, and cells in the table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getCellSelectionEnabled() {

    /**
     * Returns true if both row and column selection models are enabled.
     * Equivalent to <code>getRowSelectionAllowed() &amp;&amp;
     * getColumnSelectionAllowed()</code>.
     *
     * @return true if both row and column selection models are enabled
     *
     * @see #setCellSelectionEnabled
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setCellSelectionEnabled(boolean cellSelectionEnabled) {

    /**
     * Sets whether this table allows both a column selection and a
     * row selection to exist simultaneously. When set,
     * the table treats the intersection of the row and column selection
     * models as the selected cells. Override <code>isCellSelected</code> to
     * change this default behavior. This method is equivalent to setting
     * both the <code>rowSelectionAllowed</code> property and
     * <code>columnSelectionAllowed</code> property of the
     * <code>columnModel</code> to the supplied value.
     *
     * @param  cellSelectionEnabled     true if simultaneous row and column
     *                                  selection is allowed
     * @see #getCellSelectionEnabled
     * @see #isCellSelected
     * @beaninfo
     *  bound: true
     *    attribute: visualUpdate true
     *  description: Select a rectangular region of cells rather than
     *               rows or columns.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getColumnSelectionAllowed() {

    /**
     * Returns true if columns can be selected.
     *
     * @return true if columns can be selected, otherwise false
     * @see #setColumnSelectionAllowed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setColumnSelectionAllowed(boolean columnSelectionAllowed) {

    /**
     * Sets whether the columns in this model can be selected.
     *
     * @param columnSelectionAllowed   true if this model will allow column selection
     * @see #getColumnSelectionAllowed
     * @beaninfo
     *  bound: true
     *    attribute: visualUpdate true
     *  description: If true, an entire column is selected for each selected cell.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getRowSelectionAllowed() {

    /**
     * Returns true if rows can be selected.
     *
     * @return true if rows can be selected, otherwise false
     * @see #setRowSelectionAllowed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setRowSelectionAllowed(boolean rowSelectionAllowed) {

    /**
     * Sets whether the rows in this model can be selected.
     *
     * @param rowSelectionAllowed   true if this model will allow row selection
     * @see #getRowSelectionAllowed
     * @beaninfo
     *  bound: true
     *    attribute: visualUpdate true
     *  description: If true, an entire row is selected for each selected cell.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setSelectionMode(int selectionMode) {

    /**
     * Sets the table's selection mode to allow only single selections, a single
     * contiguous interval, or multiple intervals.
     * <P>
     * <b>Note:</b>
     * <code>JTable</code> provides all the methods for handling
     * column and row selection.  When setting states,
     * such as <code>setSelectionMode</code>, it not only
     * updates the mode for the row selection model but also sets similar
     * values in the selection model of the <code>columnModel</code>.
     * If you want to have the row and column selection models operating
     * in different modes, set them both directly.
     * <p>
     * Both the row and column selection models for <code>JTable</code>
     * default to using a <code>DefaultListSelectionModel</code>
     * so that <code>JTable</code> works the same way as the
     * <code>JList</code>. See the <code>setSelectionMode</code> method
     * in <code>JList</code> for details about the modes.
     *
     * @see JList#setSelectionMode
     * @beaninfo
     * description: The selection mode used by the row and column selection models.
     *        enum: SINGLE_SELECTION            ListSelectionModel.SINGLE_SELECTION
     *              SINGLE_INTERVAL_SELECTION   ListSelectionModel.SINGLE_INTERVAL_SELECTION
     *              MULTIPLE_INTERVAL_SELECTION ListSelectionModel.MULTIPLE_INTERVAL_SELECTION
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public RowSorter<? extends TableModel> getRowSorter() {

    /**
     * Returns the object responsible for sorting.
     *
     * @return the object responsible for sorting
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setRowSorter(RowSorter<? extends TableModel> sorter) {

    /**
     * Sets the <code>RowSorter</code>.  <code>RowSorter</code> is used
     * to provide sorting and filtering to a <code>JTable</code>.
     * <p>
     * This method clears the selection and resets any variable row heights.
     * <p>
     * This method fires a <code>PropertyChangeEvent</code> when appropriate,
     * with the property name <code>"rowSorter"</code>.  For
     * backward-compatibility, this method fires an additional event with the
     * property name <code>"sorter"</code>.
     * <p>
     * If the underlying model of the <code>RowSorter</code> differs from
     * that of this <code>JTable</code> undefined behavior will result.
     *
     * @param sorter the <code>RowSorter</code>; <code>null</code> turns
     *        sorting off
     * @see javax.swing.table.TableRowSorter
     * @beaninfo
     *        bound: true
     *  description: The table's RowSorter
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getUpdateSelectionOnSort() {

    /**
     * Returns true if the selection should be updated after sorting.
     *
     * @return whether to update the selection on a sort
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setUpdateSelectionOnSort(boolean update) {

    /**
     * Specifies whether the selection should be updated after sorting.
     * If true, on sorting the selection is reset such that
     * the same rows, in terms of the model, remain selected.  The default
     * is true.
     *
     * @param update whether or not to update the selection on sorting
     * @beaninfo
     *        bound: true
     *       expert: true
     *  description: Whether or not to update the selection on sorting
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getAutoCreateRowSorter() {

    /**
     * Returns {@code true} if whenever the model changes, a new
     * {@code RowSorter} should be created and installed
     * as the table's sorter; otherwise, returns {@code false}.
     *
     * @return true if a {@code RowSorter} should be created when
     *         the model changes
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setAutoCreateRowSorter(boolean autoCreateRowSorter) {

    /**
     * Specifies whether a {@code RowSorter} should be created for the
     * table whenever its model changes.
     * <p>
     * When {@code setAutoCreateRowSorter(true)} is invoked, a {@code
     * TableRowSorter} is immediately created and installed on the
     * table.  While the {@code autoCreateRowSorter} property remains
     * {@code true}, every time the model is changed, a new {@code
     * TableRowSorter} is created and set as the table's row sorter.
     * The default value for the {@code autoCreateRowSorter}
     * property is {@code false}.
     *
     * @param autoCreateRowSorter whether or not a {@code RowSorter}
     *        should be automatically created
     * @see javax.swing.table.TableRowSorter
     * @beaninfo
     *        bound: true
     *    preferred: true
     *  description: Whether or not to turn on sorting by default.
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public final void setDropMode(DropMode dropMode) {

    /**
     * Sets the drop mode for this component. For backward compatibility,
     * the default for this property is <code>DropMode.USE_SELECTION</code>.
     * Usage of one of the other modes is recommended, however, for an
     * improved user experience. <code>DropMode.ON</code>, for instance,
     * offers similar behavior of showing items as selected, but does so without
     * affecting the actual selection in the table.
     * <p>
     * <code>JTable</code> supports the following drop modes:
     * <ul>
     *    <li><code>DropMode.USE_SELECTION</code></li>
     *    <li><code>DropMode.ON</code></li>
     *    <li><code>DropMode.INSERT</code></li>
     *    <li><code>DropMode.INSERT_ROWS</code></li>
     *    <li><code>DropMode.INSERT_COLS</code></li>
     *    <li><code>DropMode.ON_OR_INSERT</code></li>
     *    <li><code>DropMode.ON_OR_INSERT_ROWS</code></li>
     *    <li><code>DropMode.ON_OR_INSERT_COLS</code></li>
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setDragEnabled(boolean b) {

    /**
     * Turns on or off automatic drag handling. In order to enable automatic
     * drag handling, this property should be set to {@code true}, and the
     * table's {@code TransferHandler} needs to be {@code non-null}.
     * The default value of the {@code dragEnabled} property is {@code false}.
     * <p>
     * The job of honoring this property, and recognizing a user drag gesture,
     * lies with the look and feel implementation, and in particular, the table's
     * {@code TableUI}. When automatic drag handling is enabled, most look and
     * feels (including those that subclass {@code BasicLookAndFeel}) begin a
     * drag and drop operation whenever the user presses the mouse button over
     * an item (in single selection mode) or a selection (in other selection
     * modes) and then moves the mouse a few pixels. Setting this property to
     * {@code true} can therefore have a subtle effect on how selections behave.
     * <p>
     * If a look and feel is used that ignores this property, you can still
     * begin a drag and drop operation by calling {@code exportAsDrag} on the
     * table's {@code TransferHandler}.
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public TableCellEditor getDefaultEditor(Class<?> columnClass) {

    /**
     * Returns the editor to be used when no editor has been set in
     * a <code>TableColumn</code>. During the editing of cells the editor is fetched from
     * a <code>Hashtable</code> of entries according to the class of the cells in the column. If
     * there is no entry for this <code>columnClass</code> the method returns
     * the entry for the most specific superclass. The <code>JTable</code> installs entries
     * for <code>Object</code>, <code>Number</code>, and <code>Boolean</code>, all of which can be modified
     * or replaced.
     *
     * @param   columnClass  return the default cell editor for this columnClass
     * @return the default cell editor to be used for this columnClass
     * @see     #setDefaultEditor
     * @see     #getColumnClass
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setDefaultEditor(Class<?> columnClass, TableCellEditor editor) {

    /**
     * Sets a default cell editor to be used if no editor has been set in
     * a <code>TableColumn</code>. If no editing is required in a table, or a
     * particular column in a table, uses the <code>isCellEditable</code>
     * method in the <code>TableModel</code> interface to ensure that this
     * <code>JTable</code> will not start an editor in these columns.
     * If editor is <code>null</code>, removes the default editor for this
     * column class.
     *
     * @param  columnClass  set the default cell editor for this columnClass
     * @param  editor   default cell editor to be used for this columnClass
     * @see     TableModel#isCellEditable
     * @see     #getDefaultEditor
     * @see     #setDefaultRenderer
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public TableCellRenderer getDefaultRenderer(Class<?> columnClass) {

    /**
     * Returns the cell renderer to be used when no renderer has been set in
     * a <code>TableColumn</code>. During the rendering of cells the renderer is fetched from
     * a <code>Hashtable</code> of entries according to the class of the cells in the column. If
     * there is no entry for this <code>columnClass</code> the method returns
     * the entry for the most specific superclass. The <code>JTable</code> installs entries
     * for <code>Object</code>, <code>Number</code>, and <code>Boolean</code>, all of which can be modified
     * or replaced.
     *
     * @param   columnClass   return the default cell renderer
     *                        for this columnClass
     * @return  the renderer for this columnClass
     * @see     #setDefaultRenderer
     * @see     #getColumnClass
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setDefaultRenderer(Class<?> columnClass, TableCellRenderer renderer) {

    /**
     * Sets a default cell renderer to be used if no renderer has been set in
     * a <code>TableColumn</code>. If renderer is <code>null</code>,
     * removes the default renderer for this column class.
     *
     * @param  columnClass     set the default cell renderer for this columnClass
     * @param  renderer        default cell renderer to be used for this
     *                         columnClass
     * @see     #getDefaultRenderer
     * @see     #setDefaultEditor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void createDefaultColumnsFromModel() {

    /**
     * Creates default columns for the table from
     * the data model using the <code>getColumnCount</code> method
     * defined in the <code>TableModel</code> interface.
     * <p>
     * Clears any existing columns before creating the
     * new columns based on information from the model.
     *
     * @see     #getAutoCreateColumnsFromModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getAutoCreateColumnsFromModel() {

    /**
     * Determines whether the table will create default columns from the model.
     * If true, <code>setModel</code> will clear any existing columns and
     * create new columns from the new model.  Also, if the event in
     * the <code>tableChanged</code> notification specifies that the
     * entire table changed, then the columns will be rebuilt.
     * The default is true.
     *
     * @return  the autoCreateColumnsFromModel of the table
     * @see     #setAutoCreateColumnsFromModel
     * @see     #createDefaultColumnsFromModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setAutoCreateColumnsFromModel(boolean autoCreateColumnsFromModel) {

    /**
     * Sets this table's <code>autoCreateColumnsFromModel</code> flag.
     * This method calls <code>createDefaultColumnsFromModel</code> if
     * <code>autoCreateColumnsFromModel</code> changes from false to true.
     *
     * @param   autoCreateColumnsFromModel   true if <code>JTable</code> should automatically create columns
     * @see     #getAutoCreateColumnsFromModel
     * @see     #createDefaultColumnsFromModel
     * @beaninfo
     *  bound: true
     *  description: Automatically populates the columnModel when a new TableModel is submitted.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getAutoResizeMode() {

    /**
     * Returns the auto resize mode of the table.  The default mode
     * is AUTO_RESIZE_SUBSEQUENT_COLUMNS.
     *
     * @return  the autoResizeMode of the table
     *
     * @see     #setAutoResizeMode
     * @see     #doLayout
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setAutoResizeMode(int mode) {

    /**
     * Sets the table's auto resize mode when the table is resized.  For further
     * information on how the different resize modes work, see
     * {@link #doLayout}.
     *
     * @param   mode One of 5 legal values:
     *                   AUTO_RESIZE_OFF,
     *                   AUTO_RESIZE_NEXT_COLUMN,
     *                   AUTO_RESIZE_SUBSEQUENT_COLUMNS,
     *                   AUTO_RESIZE_LAST_COLUMN,
     *                   AUTO_RESIZE_ALL_COLUMNS
     *
     * @see     #getAutoResizeMode
     * @see     #doLayout
     * @beaninfo
     *  bound: true
     *  description: Whether the columns should adjust themselves automatically.
     *        enum: AUTO_RESIZE_OFF                JTable.AUTO_RESIZE_OFF
     *              AUTO_RESIZE_NEXT_COLUMN        JTable.AUTO_RESIZE_NEXT_COLUMN
     *              AUTO_RESIZE_SUBSEQUENT_COLUMNS JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS
     *              AUTO_RESIZE_LAST_COLUMN        JTable.AUTO_RESIZE_LAST_COLUMN
     *              AUTO_RESIZE_ALL_COLUMNS        JTable.AUTO_RESIZE_ALL_COLUMNS
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getShowVerticalLines() {

    /**
     * Returns true if the table draws vertical lines between cells, false if it
     * doesn't. The default value is look and feel dependent.
     *
     * @return  true if the table draws vertical lines between cells, false if it
     *          doesn't
     * @see     #setShowVerticalLines
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public boolean getShowHorizontalLines() {

    /**
     * Returns true if the table draws horizontal lines between cells, false if it
     * doesn't. The default value is look and feel dependent.
     *
     * @return  true if the table draws horizontal lines between cells, false if it
     *          doesn't
     * @see     #setShowHorizontalLines
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setShowVerticalLines(boolean showVerticalLines) {

    /**
     *  Sets whether the table draws vertical lines between cells.
     *  If <code>showVerticalLines</code> is true it does; if it is false it doesn't.
     *
     * @param   showVerticalLines              true if table view should draw vertical lines
     * @see     #getShowVerticalLines
     * @see     #setShowGrid
     * @see     #setShowHorizontalLines
     * @beaninfo
     *  bound: true
     *  description: Whether vertical lines should be drawn in between the cells.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setShowHorizontalLines(boolean showHorizontalLines) {

    /**
     *  Sets whether the table draws horizontal lines between cells.
     *  If <code>showHorizontalLines</code> is true it does; if it is false it doesn't.
     *
     * @param   showHorizontalLines      true if table view should draw horizontal lines
     * @see     #getShowHorizontalLines
     * @see     #setShowGrid
     * @see     #setShowVerticalLines
     * @beaninfo
     *  bound: true
     *  description: Whether horizontal lines should be drawn in between the cells.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setShowGrid(boolean showGrid) {

    /**
     *  Sets whether the table draws grid lines around cells.
     *  If <code>showGrid</code> is true it does; if it is false it doesn't.
     *  There is no <code>getShowGrid</code> method as this state is held
     *  in two variables -- <code>showHorizontalLines</code> and <code>showVerticalLines</code> --
     *  each of which can be queried independently.
     *
     * @param   showGrid                 true if table view should draw grid lines
     *
     * @see     #setShowVerticalLines
     * @see     #setShowHorizontalLines
     * @beaninfo
     *  description: The color used to draw the grid lines.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Color getGridColor() {

    /**
     * Returns the color used to draw grid lines.
     * The default color is look and feel dependent.
     *
     * @return  the color used to draw grid lines
     * @see     #setGridColor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setGridColor(Color gridColor) {

    /**
     * Sets the color used to draw grid lines to <code>gridColor</code> and redisplays.
     * The default color is look and feel dependent.
     *
     * @param   gridColor                       the new color of the grid lines
     * @exception IllegalArgumentException      if <code>gridColor</code> is <code>null</code>
     * @see     #getGridColor
     * @beaninfo
     *  bound: true
     *  description: The grid color.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public Dimension getIntercellSpacing() {

    /**
     * Returns the horizontal and vertical space between cells.
     * The default spacing is look and feel dependent.
     *
     * @return  the horizontal and vertical spacing between cells
     * @see     #setIntercellSpacing
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setIntercellSpacing(Dimension intercellSpacing) {

    /**
     * Sets the <code>rowMargin</code> and the <code>columnMargin</code> --
     * the height and width of the space between cells -- to
     * <code>intercellSpacing</code>.
     *
     * @param   intercellSpacing        a <code>Dimension</code>
     *                                  specifying the new width
     *                                  and height between cells
     * @see     #getIntercellSpacing
     * @beaninfo
     *  description: The spacing between the cells,
     *               drawn in the background color of the JTable.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getRowMargin() {

    /**
     * Gets the amount of empty space, in pixels, between cells. Equivalent to:
     * <code>getIntercellSpacing().height</code>.
     * @return the number of pixels between cells in a row
     *
     * @see     #setRowMargin
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setRowMargin(int rowMargin) {

    /**
     * Sets the amount of empty space between cells in adjacent rows.
     *
     * @param  rowMargin  the number of pixels between cells in a row
     * @see     #getRowMargin
     * @beaninfo
     *  bound: true
     *  description: The amount of space between cells.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getRowHeight(int row) {

    /**
     * Returns the height, in pixels, of the cells in <code>row</code>.
     * @param   row              the row whose height is to be returned
     * @return the height, in pixels, of the cells in the row
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setRowHeight(int row, int rowHeight) {

    /**
     * Sets the height for <code>row</code> to <code>rowHeight</code>,
     * revalidates, and repaints. The height of the cells in this row
     * will be equal to the row height minus the row margin.
     *
     * @param   row                             the row whose height is being
                                                changed
     * @param   rowHeight                       new row height, in pixels
     * @exception IllegalArgumentException      if <code>rowHeight</code> is
     *                                          less than 1
     * @beaninfo
     *  bound: true
     *  description: The height in pixels of the cells in <code>row</code>
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public int getRowHeight() {

    /**
     * Returns the height of a table row, in pixels.
     *
     * @return  the height in pixels of a table row
     * @see     #setRowHeight
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setRowHeight(int rowHeight) {

    /**
     * Sets the height, in pixels, of all cells to <code>rowHeight</code>,
     * revalidates, and repaints.
     * The height of the cells will be equal to the row height minus
     * the row margin.
     *
     * @param   rowHeight                       new row height
     * @exception IllegalArgumentException      if <code>rowHeight</code> is
     *                                          less than 1
     * @see     #getRowHeight
     * @beaninfo
     *  bound: true
     *  description: The height of the specified row.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public JTableHeader getTableHeader() {

    /**
     * Returns the <code>tableHeader</code> used by this <code>JTable</code>.
     *
     * @return  the <code>tableHeader</code> used by this table
     * @see     #setTableHeader
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void setTableHeader(JTableHeader tableHeader) {

    /**
     * Sets the <code>tableHeader</code> working with this <code>JTable</code> to <code>newHeader</code>.
     * It is legal to have a <code>null</code> <code>tableHeader</code>.
     *
     * @param   tableHeader                       new tableHeader
     * @see     #getTableHeader
     * @beaninfo
     *  bound: true
     *  description: The JTableHeader instance which renders the column headers.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    @Deprecated

    /**
     * Equivalent to <code>new JScrollPane(aTable)</code>.
     *
     * @deprecated As of Swing version 1.0.2,
     * replaced by <code>new JScrollPane(aTable)</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected void unconfigureEnclosingScrollPane() {

    /**
     * Reverses the effect of <code>configureEnclosingScrollPane</code>
     * by replacing the <code>columnHeaderView</code> of the enclosing
     * scroll pane with <code>null</code>. <code>JTable</code>'s
     * <code>removeNotify</code> method calls
     * this method, which is protected so that this default uninstallation
     * procedure can be overridden by a subclass.
     *
     * @see #removeNotify
     * @see #configureEnclosingScrollPane
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void removeNotify() {

    /**
     * Calls the <code>unconfigureEnclosingScrollPane</code> method.
     *
     * @see #unconfigureEnclosingScrollPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private void configureEnclosingScrollPaneUI() {

    /**
     * This is a sub-part of configureEnclosingScrollPane() that configures
     * anything on the scrollpane that may change when the look and feel
     * changes. It needed to be split out from configureEnclosingScrollPane() so
     * that it can be called from updateUI() when the LAF changes without
     * causing the regression found in bug 6687962. This was because updateUI()
     * is called from the constructor which then caused
     * configureEnclosingScrollPane() to be called by the constructor which
     * changes its contract for any subclass that overrides it. So by splitting
     * it out in this way configureEnclosingScrollPaneUI() can be called both
     * from configureEnclosingScrollPane() and updateUI() in a safe manor.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected void configureEnclosingScrollPane() {

    /**
     * If this <code>JTable</code> is the <code>viewportView</code> of an enclosing <code>JScrollPane</code>
     * (the usual situation), configure this <code>ScrollPane</code> by, amongst other things,
     * installing the table's <code>tableHeader</code> as the <code>columnHeaderView</code> of the scroll pane.
     * When a <code>JTable</code> is added to a <code>JScrollPane</code> in the usual way,
     * using <code>new JScrollPane(myTable)</code>, <code>addNotify</code> is
     * called in the <code>JTable</code> (when the table is added to the viewport).
     * <code>JTable</code>'s <code>addNotify</code> method in turn calls this method,
     * which is protected so that this default installation procedure can
     * be overridden by a subclass.
     *
     * @see #addNotify
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public void addNotify() {

    /**
     * Calls the <code>configureEnclosingScrollPane</code> method.
     *
     * @see #configureEnclosingScrollPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public JTable(final Object[][] rowData, final Object[] columnNames) {

    /**
     * Constructs a <code>JTable</code> to display the values in the two dimensional array,
     * <code>rowData</code>, with column names, <code>columnNames</code>.
     * <code>rowData</code> is an array of rows, so the value of the cell at row 1,
     * column 5 can be obtained with the following code:
     *
     * <pre> rowData[1][5]; </pre>
     * <p>
     * All rows must be of the same length as <code>columnNames</code>.
     * <p>
     * @param rowData           the data for the new table
     * @param columnNames       names of each column
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public JTable(Vector rowData, Vector columnNames) {

    /**
     * Constructs a <code>JTable</code> to display the values in the
     * <code>Vector</code> of <code>Vectors</code>, <code>rowData</code>,
     * with column names, <code>columnNames</code>.  The
     * <code>Vectors</code> contained in <code>rowData</code>
     * should contain the values for that row. In other words,
     * the value of the cell at row 1, column 5 can be obtained
     * with the following code:
     *
     * <pre>((Vector)rowData.elementAt(1)).elementAt(5);</pre>
     * <p>
     * @param rowData           the data for the new table
     * @param columnNames       names of each column
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public JTable(int numRows, int numColumns) {

    /**
     * Constructs a <code>JTable</code> with <code>numRows</code>
     * and <code>numColumns</code> of empty cells using
     * <code>DefaultTableModel</code>.  The columns will have
     * names of the form "A", "B", "C", etc.
     *
     * @param numRows           the number of rows the table holds
     * @param numColumns        the number of columns the table holds
     * @see javax.swing.table.DefaultTableModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public JTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm) {

    /**
     * Constructs a <code>JTable</code> that is initialized with
     * <code>dm</code> as the data model, <code>cm</code> as the
     * column model, and <code>sm</code> as the selection model.
     * If any of the parameters are <code>null</code> this method
     * will initialize the table with the corresponding default model.
     * The <code>autoCreateColumnsFromModel</code> flag is set to false
     * if <code>cm</code> is non-null, otherwise it is set to true
     * and the column model is populated with suitable
     * <code>TableColumns</code> for the columns in <code>dm</code>.
     *
     * @param dm        the data model for the table
     * @param cm        the column model for the table
     * @param sm        the row selection model for the table
     * @see #createDefaultDataModel
     * @see #createDefaultColumnModel
     * @see #createDefaultSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public JTable(TableModel dm, TableColumnModel cm) {

    /**
     * Constructs a <code>JTable</code> that is initialized with
     * <code>dm</code> as the data model, <code>cm</code>
     * as the column model, and a default selection model.
     *
     * @param dm        the data model for the table
     * @param cm        the column model for the table
     * @see #createDefaultSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public JTable(TableModel dm) {

    /**
     * Constructs a <code>JTable</code> that is initialized with
     * <code>dm</code> as the data model, a default column model,
     * and a default selection model.
     *
     * @param dm        the data model for the table
     * @see #createDefaultColumnModel
     * @see #createDefaultSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public JTable() {

    /**
     * Constructs a default <code>JTable</code> that is initialized with a default
     * data model, a default column model, and a default selection
     * model.
     *
     * @see #createDefaultDataModel
     * @see #createDefaultColumnModel
     * @see #createDefaultSelectionModel
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public boolean isInsertColumn() {

        /**
         * Returns whether or not this location represents an insert
         * of a column.
         *
         * @return whether or not this is an insert column
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public boolean isInsertRow() {

        /**
         * Returns whether or not this location represents an insert
         * of a row.
         *
         * @return whether or not this is an insert row
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getColumn() {

        /**
         * Returns the column index where a dropped item should be placed in the
         * table. Interpretation of the value depends on the return of
         * <code>isInsertColumn()</code>. If that method returns
         * <code>true</code> this value indicates the index where a new
         * column should be inserted. Otherwise, it represents the value
         * of an existing column on which the data was dropped. This index is
         * in terms of the view.
         * <p>
         * <code>-1</code> indicates that the drop occurred over empty space,
         * and no column could be calculated.
         *
         * @return the drop row
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        public int getRow() {

        /**
         * Returns the row index where a dropped item should be placed in the
         * table. Interpretation of the value depends on the return of
         * <code>isInsertRow()</code>. If that method returns
         * <code>true</code> this value indicates the index where a new
         * row should be inserted. Otherwise, it represents the value
         * of an existing row on which the data was dropped. This index is
         * in terms of the view.
         * <p>
         * <code>-1</code> indicates that the drop occurred over empty space,
         * and no row could be calculated.
         *
         * @return the drop row
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public static final class DropLocation extends TransferHandler.DropLocation {

    /**
     * A subclass of <code>TransferHandler.DropLocation</code> representing
     * a drop location for a <code>JTable</code>.
     *
     * @see #getDropLocation
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private transient DropLocation dropLocation;

    /**
     * The drop location.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private DropMode dropMode = DropMode.USE_SELECTION;

    /**
     * The drop mode for this component.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private boolean fillsViewportHeight;

    /**
     * Whether or not the table always fills the viewport height.
     * @see #setFillsViewportHeight
     * @see #getScrollableTracksViewportHeight
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private boolean autoCreateRowSorter;

    /**
     * If true, any time the model changes a new RowSorter is set.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private boolean sorterChanged;

    /**
     * Whether or not sorterChanged has been invoked.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private boolean ignoreSortChange;

    /**
     * If true, when sorterChanged is invoked it's value is ignored.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private transient SortManager sortManager;

    /**
     * Information used in sorting.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private boolean updateSelectionOnSort;

    /**
     * If true, on a sort the selection is reset.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private boolean isRowHeightSet;

    /**
     * True when setRowHeight(int) has been invoked.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private Throwable printError;

    /**
     * To communicate errors between threads during printing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private boolean rowSelectionAdjusting;

    /**
     * The last value of getValueIsAdjusting from the row selection models
     * valueChanged notification. Used to test if a repaint is needed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private boolean columnSelectionAdjusting;

    /**
     * The last value of getValueIsAdjusting from the column selection models
     * columnSelectionChanged notification. Used to test if a repaint is
     * needed.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected Color selectionBackground;

    /** The background color of selected cells. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected Color selectionForeground;

    /** The foreground color of selected cells. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    transient protected Hashtable defaultEditorsByColumnClass;

    /**
     * A table of objects that display and edit the contents of a cell,
     * indexed by class as declared in <code>getColumnClass</code>
     * in the <code>TableModel</code> interface.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    transient protected Hashtable defaultRenderersByColumnClass;

    /**
     * A table of objects that display the contents of a cell,
     * indexed by class as declared in <code>getColumnClass</code>
     * in the <code>TableModel</code> interface.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    transient protected int             editingRow;

    /** Identifies the row of the cell being edited. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    transient protected int             editingColumn;

    /** Identifies the column of the cell being edited. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    transient protected TableCellEditor cellEditor;

    /**
     * The active cell editor object, that overwrites the screen real estate
     * occupied by the current cell and allows the user to change its contents.
     * {@code null} if the table isn't currently editing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    transient protected Component       editorComp;

    /** If editing, the <code>Component</code> that is handling the editing. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    /*

    /**
     * Obsolete as of Java 2 platform v1.3.  Please use the
     * <code>rowSelectionAllowed</code> property and the
     * <code>columnSelectionAllowed</code> property of the
     * <code>columnModel</code> instead. Or use the
     * method <code>getCellSelectionEnabled</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected boolean           rowSelectionAllowed;

    /** True if row selection is allowed in this table. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected Dimension         preferredViewportSize;

    /** Used by the <code>Scrollable</code> interface to determine the initial visible area. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected boolean           autoCreateColumnsFromModel;

    /**
     *  The table will query the <code>TableModel</code> to build the default
     *  set of columns if this is true.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected int               autoResizeMode;

    /**
     *  Determines if the table automatically resizes the
     *  width of the table's columns to take up the entire width of the
     *  table, and how it does the resizing.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected boolean           showVerticalLines;

    /** The table draws vertical lines between cells if <code>showVerticalLines</code> is true. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected boolean           showHorizontalLines;

    /** The table draws horizontal lines between cells if <code>showHorizontalLines</code> is true. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected Color             gridColor;

    /** The color of the grid. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected int               rowMargin;

    /** The height in pixels of the margin between the cells in each row. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected int               rowHeight;

    /** The height in pixels of each row in the table. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected JTableHeader      tableHeader;

    /** The <code>TableHeader</code> working with the table. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected ListSelectionModel selectionModel;

    /** The <code>ListSelectionModel</code> of the table, used to keep track of row selections. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected TableColumnModel  columnModel;

    /** The <code>TableColumnModel</code> of the table. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    protected TableModel        dataModel;

    /** The <code>TableModel</code> of the table. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        FIT_WIDTH

        /**
         * Printing mode that scales the output smaller, if necessary,
         * to fit the table's entire width (and thereby all columns) on each page;
         * Rows are spread across multiple pages as necessary.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
        NORMAL,

        /**
         * Printing mode that prints the table at its current size,
         * spreading both columns and rows across multiple pages if necessary.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public enum PrintMode {

    /**
     * Printing modes, used in printing <code>JTable</code>s.
     *
     * @see #print(JTable.PrintMode, MessageFormat, MessageFormat,
     *             boolean, PrintRequestAttributeSet, boolean)
     * @see #getPrintable
     * @since 1.5
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public static final int     AUTO_RESIZE_ALL_COLUMNS = 4;

    /** During all resize operations, proportionately resize all columns. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public static final int     AUTO_RESIZE_LAST_COLUMN = 3;

    /** During all resize operations, apply adjustments to the last column only. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public static final int     AUTO_RESIZE_SUBSEQUENT_COLUMNS = 2;

    /** During UI adjustment, change subsequent columns to preserve the total width;
      * this is the default behavior. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public static final int     AUTO_RESIZE_NEXT_COLUMN = 1;

    /** When a column is adjusted in the UI, adjust the next column the opposite way. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    public static final int     AUTO_RESIZE_OFF = 0;

    /** Do not adjust column widths automatically; use a horizontal scrollbar instead. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
    private static final String uiClassID = "TableUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JTable.java
/* The first versions of the JTable, contained in Swing-0.1 through

/**
 * The <code>JTable</code> is used to display and edit regular two-dimensional tables
 * of cells.
 * See <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/table.html">How to Use Tables</a>
 * in <em>The Java Tutorial</em>
 * for task-oriented documentation and examples of using <code>JTable</code>.
 *
 * <p>
 * The <code>JTable</code> has many
 * facilities that make it possible to customize its rendering and editing
 * but provides defaults for these features so that simple tables can be
 * set up easily.  For example, to set up a table with 10 rows and 10
 * columns of numbers:
 *
 * <pre>
 *      TableModel dataModel = new AbstractTableModel() {
 *          public int getColumnCount() { return 10; }
 *          public int getRowCount() { return 10;}
 *          public Object getValueAt(int row, int col) { return new Integer(row*col); }
 *      };
 *      JTable table = new JTable(dataModel);
 *      JScrollPane scrollpane = new JScrollPane(table);
 * </pre>
 * <p>
 * {@code JTable}s are typically placed inside of a {@code JScrollPane}.  By
 * default, a {@code JTable} will adjust its width such that
 * a horizontal scrollbar is unnecessary.  To allow for a horizontal scrollbar,
 * invoke {@link #setAutoResizeMode} with {@code AUTO_RESIZE_OFF}.
 * Note that if you wish to use a <code>JTable</code> in a standalone
 * view (outside of a <code>JScrollPane</code>) and want the header
 * displayed, you can get it using {@link #getTableHeader} and
 * display it separately.
 * <p>
 * To enable sorting and filtering of rows, use a
 * {@code RowSorter}.
 * You can set up a row sorter in either of two ways:
 * <ul>
 *   <li>Directly set the {@code RowSorter}. For example:
 *        {@code table.setRowSorter(new TableRowSorter(model))}.
 *   <li>Set the {@code autoCreateRowSorter}
 *       property to {@code true}, so that the {@code JTable}
 *       creates a {@code RowSorter} for
 *       you. For example: {@code setAutoCreateRowSorter(true)}.
 * </ul>
 * <p>
 * When designing applications that use the <code>JTable</code> it is worth paying
 * close attention to the data structures that will represent the table's data.
 * The <code>DefaultTableModel</code> is a model implementation that
 * uses a <code>Vector</code> of <code>Vector</code>s of <code>Object</code>s to
 * store the cell values. As well as copying the data from an
 * application into the <code>DefaultTableModel</code>,
 * it is also possible to wrap the data in the methods of the
 * <code>TableModel</code> interface so that the data can be passed to the
 * <code>JTable</code> directly, as in the example above. This often results
 * in more efficient applications because the model is free to choose the
 * internal representation that best suits the data.
 * A good rule of thumb for deciding whether to use the <code>AbstractTableModel</code>
 * or the <code>DefaultTableModel</code> is to use the <code>AbstractTableModel</code>
 * as the base class for creating subclasses and the <code>DefaultTableModel</code>
 * when subclassing is not required.
 * <p>
 * The "TableExample" directory in the demo area of the source distribution
 * gives a number of complete examples of <code>JTable</code> usage,
 * covering how the <code>JTable</code> can be used to provide an
 * editable view of data taken from a database and how to modify
 * the columns in the display to use specialized renderers and editors.
 * <p>
 * The <code>JTable</code> uses integers exclusively to refer to both the rows and the columns
 * of the model that it displays. The <code>JTable</code> simply takes a tabular range of cells
 * and uses <code>getValueAt(int, int)</code> to retrieve the
 * values from the model during painting.  It is important to remember that
 * the column and row indexes returned by various <code>JTable</code> methods
 * are in terms of the <code>JTable</code> (the view) and are not
 * necessarily the same indexes used by the model.
 * <p>
 * By default, columns may be rearranged in the <code>JTable</code> so that the
 * view's columns appear in a different order to the columns in the model.
 * This does not affect the implementation of the model at all: when the
 * columns are reordered, the <code>JTable</code> maintains the new order of the columns
 * internally and converts its column indices before querying the model.
 * <p>
 * So, when writing a <code>TableModel</code>, it is not necessary to listen for column
 * reordering events as the model will be queried in its own coordinate
 * system regardless of what is happening in the view.
 * In the examples area there is a demonstration of a sorting algorithm making
 * use of exactly this technique to interpose yet another coordinate system
 * where the order of the rows is changed, rather than the order of the columns.
 * <p>
 * Similarly when using the sorting and filtering functionality
 * provided by <code>RowSorter</code> the underlying
 * <code>TableModel</code> does not need to know how to do sorting,
 * rather <code>RowSorter</code> will handle it.  Coordinate
 * conversions will be necessary when using the row based methods of
 * <code>JTable</code> with the underlying <code>TableModel</code>.
 * All of <code>JTable</code>s row based methods are in terms of the
 * <code>RowSorter</code>, which is not necessarily the same as that
 * of the underlying <code>TableModel</code>.  For example, the
 * selection is always in terms of <code>JTable</code> so that when
 * using <code>RowSorter</code> you will need to convert using
 * <code>convertRowIndexToView</code> or
 * <code>convertRowIndexToModel</code>.  The following shows how to
 * convert coordinates from <code>JTable</code> to that of the
 * underlying model:
 * <pre>
 *   int[] selection = table.getSelectedRows();
 *   for (int i = 0; i &lt; selection.length; i++) {
 *     selection[i] = table.convertRowIndexToModel(selection[i]);
 *   }
 *   // selection is now in terms of the underlying TableModel
 * </pre>
 * <p>
 * By default if sorting is enabled <code>JTable</code> will persist the
 * selection and variable row heights in terms of the model on
 * sorting.  For example if row 0, in terms of the underlying model,
 * is currently selected, after the sort row 0, in terms of the
 * underlying model will be selected.  Visually the selection may
 * change, but in terms of the underlying model it will remain the
 * same.  The one exception to that is if the model index is no longer
 * visible or was removed.  For example, if row 0 in terms of model
 * was filtered out the selection will be empty after the sort.
 * <p>
 * J2SE 5 adds methods to <code>JTable</code> to provide convenient access to some
 * common printing needs. Simple new {@link #print()} methods allow for quick
 * and easy addition of printing support to your application. In addition, a new
 * {@link #getPrintable} method is available for more advanced printing needs.
 * <p>
 * As for all <code>JComponent</code> classes, you can use
 * {@link InputMap} and {@link ActionMap} to associate an
 * {@link Action} object with a {@link KeyStroke} and execute the
 * action under specified conditions.
 * <p>
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
 *
 *
 * @beaninfo
 *   attribute: isContainer false
 * description: A component which displays data in a two dimensional grid.
 *
 * @author Philip Milne
 * @author Shannon Hickey (printing support)
 * @see javax.swing.table.DefaultTableModel
 * @see javax.swing.table.TableRowSorter
 */
