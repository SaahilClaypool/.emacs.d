_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
            public Number getMaximumAccessibleValue() {

            /**
             * Gets the maximum value of this object as a <code>Number</code>.
             *
             * @return maximum value of the object; <code>null</code> if this object does not
             * have a maximum value
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
            public Number getMinimumAccessibleValue() {

            /**
             * Gets the minimum value of this object as a <code>Number</code>.
             *
             * @return minimum value of the object; <code>null</code> if this object does not
             * have a minimum value
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
            public boolean setCurrentAccessibleValue(Number n) {

            /**
             * Sets the value of this object as a <code>Number</code>.
             *
             * @return <code>true</code> if the value was set
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
            public Number getCurrentAccessibleValue() {

            /**
             * Gets the value of this object as a <code>Number</code>.
             *
             * @return value of the object -- can be <code>null</code> if this object does not
             * have a value
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
            public AccessibleValue getAccessibleValue() {

            /**
             * Gets the AccessibleValue associated with this object.  In the
             * implementation of the Java Accessibility API for this class,
             * returns this object, which is responsible for implementing the
             * <code>AccessibleValue</code> interface on behalf of itself.
             *
             * @return this object
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
            public AccessibleRole getAccessibleRole() {

            /**
             * Gets the role of this object.
             *
             * @return an instance of AccessibleRole describing the role of the
             * object
             * @see AccessibleRole
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        protected class AccessibleJDesktopIcon extends AccessibleJComponent

        /**
         * This class implements accessibility support for the
         * <code>JInternalFrame.JDesktopIcon</code> class.  It provides an
         * implementation of the Java Accessibility API appropriate to
         * desktop icon user-interface elements.
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public AccessibleContext getAccessibleContext() {

        /**
         * Gets the AccessibleContext associated with this JDesktopIcon.
         * For desktop icons, the AccessibleContext takes the form of an
         * AccessibleJDesktopIcon.
         * A new AccessibleJDesktopIcon instance is created if necessary.
         *
         * @return an AccessibleJDesktopIcon that serves as the
         *         AccessibleContext of this JDesktopIcon
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
       // Accessibility support

       /////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        // Serialization support

        ////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public String getUIClassID() {

        /**
         * Returns the name of the look-and-feel
         * class that renders this component.
         *
         * @return the string "DesktopIconUI"
         * @see JComponent#getUIClassID
         * @see UIDefaults#getUI
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public void updateUI() {

        /**
         * Notification from the <code>UIManager</code> that the look and feel
         * has changed.
         * Replaces the current UI object with the latest version from the
         * <code>UIManager</code>.
         *
         * @see JComponent#updateUI
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public JDesktopPane getDesktopPane() {

        /**
         * Convenience method to ask the icon for the <code>Desktop</code>
         * object it belongs to.
         *
         * @return the <code>JDesktopPane</code> that contains this
         *           icon's internal frame, or <code>null</code> if none found
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public void setInternalFrame(JInternalFrame f) {

        /**
         * Sets the <code>JInternalFrame</code> with which this
         * <code>DesktopIcon</code> is associated.
         *
         * @param f  the <code>JInternalFrame</code> with which this icon
         *              is associated
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public JInternalFrame getInternalFrame() {

        /**
         * Returns the <code>JInternalFrame</code> that this
         * <code>DesktopIcon</code> is associated with.
         *
         * @return the <code>JInternalFrame</code> with which this icon
         *              is associated
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public void setUI(DesktopIconUI ui) {

        /**
         * Sets the look-and-feel object that renders this component.
         *
         * @param ui  the <code>DesktopIconUI</code> look-and-feel object
         * @see UIDefaults#getUI
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public DesktopIconUI getUI() {

        /**
         * Returns the look-and-feel object that renders this component.
         *
         * @return the <code>DesktopIconUI</code> object that renders
         *              this component
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public JDesktopIcon(JInternalFrame f) {

        /**
         * Creates an icon for an internal frame.
         *
         * @param f  the <code>JInternalFrame</code>
         *              for which the icon is created
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    static public class JDesktopIcon extends JComponent implements Accessible

    /**
     * This component represents an iconified version of a
     * <code>JInternalFrame</code>.
     * This API should NOT BE USED by Swing applications, as it will go
     * away in future versions of Swing as its functionality is moved into
     * <code>JInternalFrame</code>.  This class is public only so that
     * UI objects can display a desktop icon.  If an application
     * wants to display a desktop icon, it should create a
     * <code>JInternalFrame</code> instance and iconify it.
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
     * @author David Kloba
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public Number getMaximumAccessibleValue() {

        /**
         * Get the maximum value of this object as a Number.
         *
         * @return Maximum value of the object; <code>null</code> if this object does not
         * have a maximum value
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public Number getMinimumAccessibleValue() {

        /**
         * Get the minimum value of this object as a Number.
         *
         * @return Minimum value of the object; <code>null</code> if this object does not
         * have a minimum value
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public boolean setCurrentAccessibleValue(Number n) {

        /**
         * Set the value of this object as a Number.
         *
         * @return <code>true</code> if the value was set
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public Number getCurrentAccessibleValue() {

        /**
         * Get the value of this object as a Number.
         *
         * @return value of the object -- can be <code>null</code> if this object does not
         * have a value
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public AccessibleValue getAccessibleValue() {

        /**
         * Gets the AccessibleValue associated with this object.  In the
         * implementation of the Java Accessibility API for this class,
         * returns this object, which is responsible for implementing the
         * <code>AccessibleValue</code> interface on behalf of itself.
         *
         * @return this object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of the
         * object
         * @see AccessibleRole
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
        public String getAccessibleName() {

        /**
         * Get the accessible name of this object.
         *
         * @return the localized name of the object -- can be <code>null</code> if this
         * object does not have a name
         * @see #setAccessibleName
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected class AccessibleJInternalFrame extends AccessibleJComponent

    /**
     * This class implements accessibility support for the
     * <code>JInternalFrame</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to internal frame user-interface
     * elements.
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public AccessibleContext getAccessibleContext() {

    /**
     * Gets the <code>AccessibleContext</code> associated with this
     * <code>JInternalFrame</code>.
     * For internal frames, the <code>AccessibleContext</code>
     * takes the form of an
     * <code>AccessibleJInternalFrame</code> object.
     * A new <code>AccessibleJInternalFrame</code> instance is created if necessary.
     *
     * @return an <code>AccessibleJInternalFrame</code> that serves as the
     *         <code>AccessibleContext</code> of this
     *         <code>JInternalFrame</code>
     * @see AccessibleJInternalFrame
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
// Accessibility support

/////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected void paintComponent(Graphics g) {

    /**
     * Overridden to allow optimized painting when the
     * internal frame is being dragged.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JInternalFrame</code>.
     * This method
     * is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JInternalFrame</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * See <code>readObject</code> and <code>writeObject</code>
     * in <code>JComponent</code> for more
     * information about serialization in Swing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final String getWarningString() {

    /**
     * Gets the warning string that is displayed with this internal frame.
     * Since an internal frame is always secure (since it's fully
     * contained within a window that might need a warning string)
     * this method always returns <code>null</code>.
     * @return    <code>null</code>
     * @see       java.awt.Window#getWarningString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final Container getFocusCycleRootAncestor() {

    /**
     * Always returns <code>null</code> because <code>JInternalFrame</code>s
     * must always be roots of a focus
     * traversal cycle.
     *
     * @return <code>null</code>
     * @see java.awt.Container#isFocusCycleRoot()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final boolean isFocusCycleRoot() {

    /**
     * Always returns <code>true</code> because all <code>JInternalFrame</code>s must be
     * roots of a focus traversal cycle.
     *
     * @return <code>true</code>
     * @see #setFocusCycleRoot
     * @see java.awt.Container#setFocusTraversalPolicy
     * @see java.awt.Container#getFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final void setFocusCycleRoot(boolean focusCycleRoot) {

    /**
     * Does nothing because <code>JInternalFrame</code>s must always be roots of a focus
     * traversal cycle.
     *
     * @param focusCycleRoot this value is ignored
     * @see #isFocusCycleRoot
     * @see java.awt.Container#setFocusTraversalPolicy
     * @see java.awt.Container#getFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void toBack() {

    /**
     * Sends this internal frame to the back.
     * Places this internal frame at the bottom of the stacking order
     * and makes the corresponding adjustment to other visible
     * internal frames.
     *
     * @see       java.awt.Window#toBack
     * @see       #moveToBack
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void toFront() {

    /**
     * Brings this internal frame to the front.
     * Places this internal frame  at the top of the stacking order
     * and makes the corresponding adjustment to other visible internal
     * frames.
     *
     * @see       java.awt.Window#toFront
     * @see       #moveToFront
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void dispose() {

    /**
     * Makes this internal frame
     * invisible, unselected, and closed.
     * If the frame is not already closed,
     * this method fires an
     * <code>INTERNAL_FRAME_CLOSED</code> event.
     * The results of invoking this method are similar to
     * <code>setClosed(true)</code>,
     * but <code>dispose</code> always succeeds in closing
     * the internal frame and does not fire
     * an <code>INTERNAL_FRAME_CLOSING</code> event.
     *
     * @see javax.swing.event.InternalFrameEvent#INTERNAL_FRAME_CLOSED
     * @see #setVisible
     * @see #setSelected
     * @see #setClosed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void show() {

    /**
     * If the internal frame is not visible,
     * brings the internal frame to the front,
     * makes it visible,
     * and attempts to select it.
     * The first time the internal frame is made visible,
     * this method also fires an <code>INTERNAL_FRAME_OPENED</code> event.
     * This method does nothing if the internal frame is already visible.
     * Invoking this method
     * has the same result as invoking
     * <code>setVisible(true)</code>.
     *
     * @see #moveToFront
     * @see #setSelected
     * @see InternalFrameEvent#INTERNAL_FRAME_OPENED
     * @see #setVisible
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void pack() {

    /**
     * Causes subcomponents of this <code>JInternalFrame</code>
     * to be laid out at their preferred size.  Internal frames that are
     * iconized or maximized are first restored and then packed.  If the
     * internal frame is unable to be restored its state is not changed
     * and will not be packed.
     *
     * @see       java.awt.Window#pack
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public int getDefaultCloseOperation() {

   /**
    * Returns the default operation that occurs when the user
    * initiates a "close" on this internal frame.
    * @return the operation that will occur when the user closes the internal
    *         frame
    * @see #setDefaultCloseOperation
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setDefaultCloseOperation(int operation) {

    /**
     * Sets the operation that will happen by default when
     * the user initiates a "close" on this internal frame.
     * The possible choices are:
     * <br><br>
     * <dl>
     * <dt><code>DO_NOTHING_ON_CLOSE</code>
     * <dd> Do nothing.
     *      This requires the program to handle the operation
     *      in the <code>internalFrameClosing</code> method
     *      of a registered <code>InternalFrameListener</code> object.
     * <dt><code>HIDE_ON_CLOSE</code>
     * <dd> Automatically make the internal frame invisible.
     * <dt><code>DISPOSE_ON_CLOSE</code>
     * <dd> Automatically dispose of the internal frame.
     * </dl>
     * <p>
     * The default value is <code>DISPOSE_ON_CLOSE</code>.
     * Before performing the specified close operation,
     * the internal frame fires
     * an <code>INTERNAL_FRAME_CLOSING</code> event.
     *
     * @param operation one of the following constants defined in
     *                  <code>javax.swing.WindowConstants</code>
     *                  (an interface implemented by
     *                  <code>JInternalFrame</code>):
     *                  <code>DO_NOTHING_ON_CLOSE</code>,
     *                  <code>HIDE_ON_CLOSE</code>, or
     *                  <code>DISPOSE_ON_CLOSE</code>
     *
     * @see #addInternalFrameListener
     * @see #getDefaultCloseOperation
     * @see #setVisible
     * @see #dispose
     * @see InternalFrameEvent#INTERNAL_FRAME_CLOSING
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void doDefaultCloseAction() {

    /**
     * Fires an
     * <code>INTERNAL_FRAME_CLOSING</code> event
     * and then performs the action specified by
     * the internal frame's default close operation.
     * This method is typically invoked by the
     * look-and-feel-implemented action handler
     * for the internal frame's close button.
     *
     * @since 1.3
     * @see #setDefaultCloseOperation
     * @see javax.swing.event.InternalFrameEvent#INTERNAL_FRAME_CLOSING
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected void fireInternalFrameEvent(int id){

    /**
     * Fires an internal frame event.
     *
     * @param id  the type of the event being fired; one of the following:
     * <ul>
     * <li><code>InternalFrameEvent.INTERNAL_FRAME_OPENED</code>
     * <li><code>InternalFrameEvent.INTERNAL_FRAME_CLOSING</code>
     * <li><code>InternalFrameEvent.INTERNAL_FRAME_CLOSED</code>
     * <li><code>InternalFrameEvent.INTERNAL_FRAME_ICONIFIED</code>
     * <li><code>InternalFrameEvent.INTERNAL_FRAME_DEICONIFIED</code>
     * <li><code>InternalFrameEvent.INTERNAL_FRAME_ACTIVATED</code>
     * <li><code>InternalFrameEvent.INTERNAL_FRAME_DEACTIVATED</code>
     * </ul>
     * If the event type is not one of the above, nothing happens.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public InternalFrameListener[] getInternalFrameListeners() {

    /**
     * Returns an array of all the <code>InternalFrameListener</code>s added
     * to this <code>JInternalFrame</code> with
     * <code>addInternalFrameListener</code>.
     *
     * @return all of the <code>InternalFrameListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     *
     * @see #addInternalFrameListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void removeInternalFrameListener(InternalFrameListener l) {  // remind: sync??

    /**
     * Removes the specified internal frame listener so that it no longer
     * receives internal frame events from this internal frame.
     *
     * @param l the internal frame listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void addInternalFrameListener(InternalFrameListener l) {  // remind: sync ??

    /**
     * Adds the specified listener to receive internal
     * frame events from this internal frame.
     *
     * @param l the internal frame listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
// Frame/Window equivalents

///////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void reshape(int x, int y, int width, int height) {

    /**
     * Moves and resizes this component.  Unlike other components,
     * this implementation also forces re-layout, so that frame
     * decorations such as the title bar are always redisplayed.
     *
     * @param x  an integer giving the component's new horizontal position
     *           measured in pixels from the left of its container
     * @param y  an integer giving the component's new vertical position,
     *           measured in pixels from the bottom of its container
     * @param width  an integer giving the component's new width in pixels
     * @param height an integer giving the component's new height in pixels
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void restoreSubcomponentFocus() {

    /**
     * Requests the internal frame to restore focus to the
     * last subcomponent that had focus. This is used by the UI when
     * the user selected this internal frame --
     * for example, by clicking on the title bar.
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public Component getMostRecentFocusOwner() {

    /**
     * Returns the child component of this <code>JInternalFrame</code>
     * that will receive the
     * focus when this <code>JInternalFrame</code> is selected.
     * If this <code>JInternalFrame</code> is
     * currently selected, this method returns the same component as
     * the <code>getFocusOwner</code> method.
     * If this <code>JInternalFrame</code> is not selected,
     * then the child component that most recently requested focus will be
     * returned. If no child component has ever requested focus, then this
     * <code>JInternalFrame</code>'s initial focusable component is returned.
     * If no such
     * child exists, then this <code>JInternalFrame</code>'s default component
     * to focus is returned.
     *
     * @return the child component that will receive focus when this
     *         <code>JInternalFrame</code> is selected
     * @see #getFocusOwner
     * @see #isSelected
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public Component getFocusOwner() {

    /**
     * If this <code>JInternalFrame</code> is active,
     * returns the child that has focus.
     * Otherwise, returns <code>null</code>.
     *
     * @return the component with focus, or <code>null</code> if no children have focus
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setNormalBounds(Rectangle r) {

    /**
     * Sets the normal bounds for this internal frame, the bounds that
     * this internal frame would be restored to from its maximized state.
     * This method is intended for use only by desktop managers.
     *
     * @param r the bounds that this internal frame should be restored to
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public Rectangle getNormalBounds() {

    /**
     * If the <code>JInternalFrame</code> is not in maximized state, returns
     * <code>getBounds()</code>; otherwise, returns the bounds that the
     * <code>JInternalFrame</code> would be restored to.
     *
     * @return a <code>Rectangle</code> containing the bounds of this
     *          frame when in the normal state
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JDesktopIcon getDesktopIcon() {

    /**
     * Returns the <code>JDesktopIcon</code> used when this
     * <code>JInternalFrame</code> is iconified.
     *
     * @return the <code>JDesktopIcon</code> displayed on the desktop
     * @see #setDesktopIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setDesktopIcon(JDesktopIcon d) {

    /**
     * Sets the <code>JDesktopIcon</code> associated with this
     * <code>JInternalFrame</code>.
     *
     * @param d the <code>JDesktopIcon</code> to display on the desktop
     * @see #getDesktopIcon
     * @beaninfo
     *           bound: true
     *     description: The icon shown when this internal frame is minimized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JDesktopPane getDesktopPane() {

    /**
      * Convenience method that searches the ancestor hierarchy for a
      * <code>JDesktop</code> instance. If <code>JInternalFrame</code>
      * finds none, the <code>desktopIcon</code> tree is searched.
      *
      * @return the <code>JDesktopPane</code> this internal frame belongs to,
      *         or <code>null</code> if none is found
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public int getLayer() {

    /**
     * Convenience method for getting the layer attribute of this component.
     *
     * @return  an <code>Integer</code> object specifying this
     *          frame's desktop layer
     * @see JLayeredPane
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setLayer(int layer) {

    /**
     * Convenience method for setting the layer attribute of this component.
     * The method <code>setLayer(Integer)</code> should be used for
     * layer values predefined in <code>JLayeredPane</code>.
     * When using <code>setLayer(int)</code>, care must be taken not to
     * accidentally clash with those values.
     *
     * @param layer  an integer specifying this internal frame's desktop layer
     *
     * @since 1.3
     *
     * @see #setLayer(Integer)
     * @see JLayeredPane
     * @beaninfo
     *     expert: true
     *     description: Specifies what desktop layer is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setLayer(Integer layer) {

    /**
     * Convenience method for setting the layer attribute of this component.
     *
     * @param layer  an <code>Integer</code> object specifying this
     *          frame's desktop layer
     * @see JLayeredPane
     * @beaninfo
     *     expert: true
     *     description: Specifies what desktop layer is used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setCursor(Cursor cursor) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public Cursor getLastCursor() {

    /**
     * Returns the last <code>Cursor</code> that was set by the
     * <code>setCursor</code> method that is not a resizable
     * <code>Cursor</code>.
     *
     * @return the last non-resizable <code>Cursor</code>
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void moveToBack() {

    /**
      * Convenience method that moves this component to position -1 if its
      * parent is a <code>JLayeredPane</code>.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void moveToFront() {

    /**
      * Convenience method that moves this component to position 0 if its
      * parent is a <code>JLayeredPane</code>.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public Icon getFrameIcon()  {

    /**
     * Returns the image displayed in the title bar of this internal frame (usually
     * in the top-left corner).
     *
     * @return the <code>Icon</code> displayed in the title bar
     * @see #setFrameIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
  public void setFrameIcon(Icon icon) {

    /**
     * Sets an image to be displayed in the titlebar of this internal frame (usually
     * in the top-left corner).
     * This image is not the <code>desktopIcon</code> object, which
     * is the image displayed in the <code>JDesktop</code> when
     * this internal frame is iconified.
     *
     * Passing <code>null</code> to this function is valid,
     * but the look and feel
     * can choose the
     * appropriate behavior for that situation, such as displaying no icon
     * or a default icon for the look and feel.
     *
     * @param icon the <code>Icon</code> to display in the title bar
     * @see #getFrameIcon
     * @beaninfo
     *           bound: true
     *     description: The icon shown in the top-left corner of this internal frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public boolean isSelected() {

    /**
     * Returns whether the <code>JInternalFrame</code> is the
     * currently "selected" or active frame.
     *
     * @return <code>true</code> if this internal frame is currently selected (active)
     * @see #setSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setSelected(boolean selected) throws PropertyVetoException {

    /**
     * Selects or deselects the internal frame
     * if it's showing.
     * A <code>JInternalFrame</code> normally draws its title bar
     * differently if it is
     * the selected frame, which indicates to the user that this
     * internal frame has the focus.
     * When this method changes the state of the internal frame
     * from deselected to selected, it fires an
     * <code>InternalFrameEvent.INTERNAL_FRAME_ACTIVATED</code> event.
     * If the change is from selected to deselected,
     * an <code>InternalFrameEvent.INTERNAL_FRAME_DEACTIVATED</code> event
     * is fired.
     *
     * @param selected  a boolean, where <code>true</code> means this internal frame
     *                  should become selected (currently active)
     *                  and <code>false</code> means it should become deselected
     * @exception PropertyVetoException when the attempt to set the
     *            property is vetoed by the <code>JInternalFrame</code>
     *
     * @see #isShowing
     * @see InternalFrameEvent#INTERNAL_FRAME_ACTIVATED
     * @see InternalFrameEvent#INTERNAL_FRAME_DEACTIVATED
     *
     * @beaninfo
     *     constrained: true
     *           bound: true
     *     description: Indicates whether this internal frame is currently
     *                  the active frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setTitle(String title) {

    /**
     * Sets the <code>JInternalFrame</code> title. <code>title</code>
     * may have a <code>null</code> value.
     * @see #getTitle
     *
     * @param title  the <code>String</code> to display in the title bar
     * @beaninfo
     *     preferred: true
     *     bound: true
     *     description: The text displayed in the title bar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public String getTitle() {

    /**
     * Returns the title of the <code>JInternalFrame</code>.
     *
     * @return a <code>String</code> containing this internal frame's title
     * @see #setTitle
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setMaximum(boolean b) throws PropertyVetoException {

    /**
     * Maximizes and restores this internal frame.  A maximized frame is resized to
     * fully fit the <code>JDesktopPane</code> area associated with the
     * <code>JInternalFrame</code>.
     * A restored frame's size is set to the <code>JInternalFrame</code>'s
     * actual size.
     *
     * @param b  a boolean, where <code>true</code> maximizes this internal frame and <code>false</code>
     *           restores it
     * @exception PropertyVetoException when the attempt to set the
     *            property is vetoed by the <code>JInternalFrame</code>
     * @beaninfo
     *     bound: true
     *     constrained: true
     *     description: Indicates whether this internal frame is maximized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public boolean isMaximum() {

    /**
     * Returns whether the <code>JInternalFrame</code> is currently maximized.
     *
     * @return <code>true</code> if this internal frame is maximized, <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public boolean isMaximizable() {

    /**
     * Gets the value of the <code>maximizable</code> property.
     *
     * @return the value of the <code>maximizable</code> property
     * @see #setMaximizable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setMaximizable(boolean b) {

    /**
     * Sets the <code>maximizable</code> property,
     * which determines whether the <code>JInternalFrame</code>
     * can be maximized by
     * some user action.
     * Some look and feels might not support maximizing internal frames;
     * they will ignore this property.
     *
     * @param b <code>true</code> to specify that this internal frame should be maximizable; <code>false</code> to specify that it should not be
     * @beaninfo
     *         bound: true
     *     preferred: true
     *     description: Determines whether this internal frame can be maximized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setIcon(boolean b) throws PropertyVetoException {

    /**
     * Iconifies or de-iconifies this internal frame,
     * if the look and feel supports iconification.
     * If the internal frame's state changes to iconified,
     * this method fires an <code>INTERNAL_FRAME_ICONIFIED</code> event.
     * If the state changes to de-iconified,
     * an <code>INTERNAL_FRAME_DEICONIFIED</code> event is fired.
     *
     * @param b a boolean, where <code>true</code> means to iconify this internal frame and
     *          <code>false</code> means to de-iconify it
     * @exception PropertyVetoException when the attempt to set the
     *            property is vetoed by the <code>JInternalFrame</code>
     *
     * @see InternalFrameEvent#INTERNAL_FRAME_ICONIFIED
     * @see InternalFrameEvent#INTERNAL_FRAME_DEICONIFIED
     *
     * @beaninfo
     *           bound: true
     *     constrained: true
     *     description: The image displayed when this internal frame is minimized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public boolean isIcon() {

    /**
     * Returns whether the <code>JInternalFrame</code> is currently iconified.
     *
     * @return <code>true</code> if this internal frame is iconified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public boolean isIconifiable() {

    /**
     * Gets the <code>iconable</code> property,
     * which by default is <code>false</code>.
     *
     * @return the value of the <code>iconable</code> property.
     *
     * @see #setIconifiable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setIconifiable(boolean b) {

    /**
     * Sets the <code>iconable</code> property,
     * which must be <code>true</code>
     * for the user to be able to
     * make the <code>JInternalFrame</code> an icon.
     * Some look and feels might not implement iconification;
     * they will ignore this property.
     *
     * @param b  a boolean, where <code>true</code> means this internal frame can be iconified
     * @beaninfo
     *     preferred: true
               bound: true
     *     description: Determines whether this internal frame can be iconified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public boolean isResizable() {

    /**
     * Returns whether the <code>JInternalFrame</code> can be resized
     * by some user action.
     *
     * @return <code>true</code> if this internal frame can be resized, <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setResizable(boolean b) {

    /**
     * Sets whether the <code>JInternalFrame</code> can be resized by some
     * user action.
     *
     * @param b  a boolean, where <code>true</code> means this internal frame can be resized
     * @beaninfo
     *     preferred: true
     *           bound: true
     *     description: Determines whether this internal frame can be resized
     *                  by the user.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setClosed(boolean b) throws PropertyVetoException {

    /**
     * Closes this internal frame if the argument is <code>true</code>.
     * Do not invoke this method with a <code>false</code> argument;
     * the result of invoking <code>setClosed(false)</code>
     * is unspecified.
     *
     * <p>
     *
     * If the internal frame is already closed,
     * this method does nothing and returns immediately.
     * Otherwise,
     * this method begins by firing
     * an <code>INTERNAL_FRAME_CLOSING</code> event.
     * Then this method sets the <code>closed</code> property to <code>true</code>
     * unless a listener vetoes the property change.
     * This method finishes by making the internal frame
     * invisible and unselected,
     * and then firing an <code>INTERNAL_FRAME_CLOSED</code> event.
     *
     * <p>
     *
     * <b>Note:</b>
     * To reuse an internal frame that has been closed,
     * you must add it to a container
     * (even if you never removed it from its previous container).
     * Typically, this container will be the <code>JDesktopPane</code>
     * that previously contained the internal frame.
     *
     * @param b must be <code>true</code>
     *
     * @exception PropertyVetoException when the attempt to set the
     *            property is vetoed by the <code>JInternalFrame</code>
     *
     * @see #isClosed()
     * @see #setDefaultCloseOperation
     * @see #dispose
     * @see javax.swing.event.InternalFrameEvent#INTERNAL_FRAME_CLOSING
     *
     * @beaninfo
     *           bound: true
     *     constrained: true
     *     description: Indicates whether this internal frame has been closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public boolean isClosed() {

    /**
     * Returns whether this <code>JInternalFrame</code> is currently closed.
     * @return <code>true</code> if this internal frame is closed, <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public boolean isClosable() {

    /**
     * Returns whether this <code>JInternalFrame</code> can be closed by
     * some user action.
     * @return <code>true</code> if this internal frame can be closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setClosable(boolean b) {

    /**
     * Sets whether this <code>JInternalFrame</code> can be closed by
     * some user action.
     * @param b a boolean value, where <code>true</code> means this internal frame can be closed
     * @beaninfo
     *     preferred: true
     *           bound: true
     *     description: Indicates whether this internal frame can be closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected void setRootPane(JRootPane root) {

    /**
     * Sets the <code>rootPane</code> property
     * for this <code>JInternalFrame</code>.
     * This method is called by the constructor.
     *
     * @param root  the new <code>JRootPane</code> object
     * @beaninfo
     *     bound: true
     *     hidden: true
     *     description: The root pane used by this internal frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JRootPane getRootPane() {

    /**
     * Returns the <code>rootPane</code> object for this internal frame.
     *
     * @return the <code>rootPane</code> property
     * @see RootPaneContainer#getRootPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setGlassPane(Component glass) {

    /**
     * Sets this <code>JInternalFrame</code>'s
     * <code>glassPane</code> property.
     *
     * @param glass the glass pane for this internal frame
     * @see RootPaneContainer#getGlassPane
     * @beaninfo
     *     bound: true
     *     hidden: true
     *     description: A transparent pane used for menu rendering.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public Component getGlassPane() {

    /**
     * Returns the glass pane for this internal frame.
     *
     * @return the glass pane
     * @see RootPaneContainer#setGlassPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setLayeredPane(JLayeredPane layered) {

    /**
     * Sets this <code>JInternalFrame</code>'s
     * <code>layeredPane</code> property.
     *
     * @param layered the <code>JLayeredPane</code> for this internal frame
     *
     * @exception java.awt.IllegalComponentStateException (a runtime
     *           exception) if the layered pane parameter is <code>null</code>
     * @see RootPaneContainer#setLayeredPane
     * @beaninfo
     *     hidden: true
     *     bound: true
     *     description: The pane which holds the various desktop layers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JLayeredPane getLayeredPane() {

    /**
     * Returns the layered pane for this internal frame.
     *
     * @return a <code>JLayeredPane</code> object
     * @see RootPaneContainer#setLayeredPane
     * @see RootPaneContainer#getLayeredPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setContentPane(Container c) {

    /**
     * Sets this <code>JInternalFrame</code>'s <code>contentPane</code>
     * property.
     *
     * @param c  the content pane for this internal frame
     *
     * @exception java.awt.IllegalComponentStateException (a runtime
     *           exception) if the content pane parameter is <code>null</code>
     * @see RootPaneContainer#getContentPane
     * @beaninfo
     *     bound: true
     *     hidden: true
     *     description: The client area of the internal frame where child
     *                  components are normally inserted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public Container getContentPane() {

    /**
     * Returns the content pane for this internal frame.
     * @return the content pane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setJMenuBar(JMenuBar m){

    /**
     * Sets the <code>menuBar</code> property for this <code>JInternalFrame</code>.
     *
     * @param m  the <code>JMenuBar</code> to use in this internal frame
     * @see #getJMenuBar
     * @beaninfo
     *     bound: true
     *     preferred: true
     *     description: The menu bar for accessing pulldown menus
     *                  from this internal frame.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    @Deprecated

    /**
     * Sets the <code>menuBar</code> property for this <code>JInternalFrame</code>.
     *
     * @param m  the <code>JMenuBar</code> to use in this internal frame
     * @see #getJMenuBar
     * @deprecated As of Swing version 1.0.3
     *  replaced by <code>setJMenuBar(JMenuBar m)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JMenuBar getJMenuBar() {

    /**
     * Returns the current <code>JMenuBar</code> for this
     * <code>JInternalFrame</code>, or <code>null</code>
     * if no menu bar has been set.
     *
     * @return  the <code>JMenuBar</code> used by this internal frame
     * @see #setJMenuBar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    /**

//////////////////////////////////////////////////////////////////////////
/// Property Methods
//////////////////////////////////////////////////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setLayout(LayoutManager manager) {

    /**
     * Ensures that, by default, the layout of this component cannot be set.
     * Overridden to conditionally forward the call to the
     * <code>contentPane</code>.
     * Refer to {@link javax.swing.RootPaneContainer} for
     * more information.
     *
     * @param manager the <code>LayoutManager</code>
     * @see #setRootPaneCheckingEnabled
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void remove(Component comp) {

    /**
     * Removes the specified component from the container. If
     * <code>comp</code> is not a child of the <code>JInternalFrame</code>
     * this will forward the call to the <code>contentPane</code>.
     *
     * @param comp the component to be removed
     * @throws NullPointerException if <code>comp</code> is null
     * @see #add
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected void addImpl(Component comp, Object constraints, int index) {

    /**
     * Adds the specified child <code>Component</code>.
     * This method is overridden to conditionally forward calls to the
     * <code>contentPane</code>.
     * By default, children are added to the <code>contentPane</code> instead
     * of the frame, refer to {@link javax.swing.RootPaneContainer} for
     * details.
     *
     * @param comp the component to be enhanced
     * @param constraints the constraints to be respected
     * @param index the index
     * @exception IllegalArgumentException if <code>index</code> is invalid
     * @exception IllegalArgumentException if adding the container's parent
     *                  to itself
     * @exception IllegalArgumentException if adding a window to a container
     *
     * @see #setRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected void setRootPaneCheckingEnabled(boolean enabled) {

    /**
     * Sets whether calls to <code>add</code> and
     * <code>setLayout</code> are forwarded to the <code>contentPane</code>.
     *
     * @param enabled  true if <code>add</code> and <code>setLayout</code>
     *        are forwarded, false if they should operate directly on the
     *        <code>JInternalFrame</code>.
     *
     * @see #addImpl
     * @see #setLayout
     * @see #isRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     * @beaninfo
     *      hidden: true
     * description: Whether the add and setLayout methods are forwarded
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected boolean isRootPaneCheckingEnabled() {

    /**
     * Returns whether calls to <code>add</code> and
     * <code>setLayout</code> are forwarded to the <code>contentPane</code>.
     *
     * @return true if <code>add</code> and <code>setLayout</code>
     *         are forwarded; false otherwise
     *
     * @see #addImpl
     * @see #setLayout
     * @see #setRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public String getUIClassID() {

    /**
     * Returns the name of the look-and-feel
     * class that renders this component.
     *
     * @return the string "InternalFrameUI"
     *
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     *
     * @beaninfo
     *     description: UIClassID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void updateUI() {

    /**
     * Notification from the <code>UIManager</code> that the look and feel
     * has changed.
     * Replaces the current UI object with the latest version from the
     * <code>UIManager</code>.
     *
     * @see JComponent#updateUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public void setUI(InternalFrameUI ui) {

    /**
     * Sets the UI delegate for this <code>JInternalFrame</code>.
     * @param ui  the UI delegate
     * @beaninfo
     *        bound: true
     *       hidden: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public InternalFrameUI getUI() {

    /**
     * Returns the look-and-feel object that renders this component.
     *
     * @return the <code>InternalFrameUI</code> object that renders
     *          this component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected JRootPane createRootPane() {

    /**
     * Called by the constructor to set up the <code>JRootPane</code>.
     * @return  a new <code>JRootPane</code>
     * @see JRootPane
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JInternalFrame(String title, boolean resizable, boolean closable,
                                boolean maximizable, boolean iconifiable) {

    /**
     * Creates a <code>JInternalFrame</code> with the specified title,
     * resizability, closability, maximizability, and iconifiability.
     * All <code>JInternalFrame</code> constructors use this one.
     *
     * @param title       the <code>String</code> to display in the title bar
     * @param resizable   if <code>true</code>, the internal frame can be resized
     * @param closable    if <code>true</code>, the internal frame can be closed
     * @param maximizable if <code>true</code>, the internal frame can be maximized
     * @param iconifiable if <code>true</code>, the internal frame can be iconified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JInternalFrame(String title, boolean resizable, boolean closable,
                          boolean maximizable) {

    /**
     * Creates a non-iconifiable <code>JInternalFrame</code>
     * with the specified title,
     * resizability, closability, and maximizability.
     *
     * @param title       the <code>String</code> to display in the title bar
     * @param resizable   if <code>true</code>, the internal frame can be resized
     * @param closable    if <code>true</code>, the internal frame can be closed
     * @param maximizable if <code>true</code>, the internal frame can be maximized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JInternalFrame(String title, boolean resizable, boolean closable) {

    /**
     * Creates a non-maximizable, non-iconifiable <code>JInternalFrame</code>
     * with the specified title, resizability, and
     * closability.
     *
     * @param title      the <code>String</code> to display in the title bar
     * @param resizable  if <code>true</code>, the internal frame can be resized
     * @param closable   if <code>true</code>, the internal frame can be closed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JInternalFrame(String title, boolean resizable) {

    /**
     * Creates a non-closable, non-maximizable, non-iconifiable
     * <code>JInternalFrame</code> with the specified title
     * and resizability.
     *
     * @param title      the <code>String</code> to display in the title bar
     * @param resizable  if <code>true</code>, the internal frame can be resized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JInternalFrame(String title) {

    /**
     * Creates a non-resizable, non-closable, non-maximizable,
     * non-iconifiable <code>JInternalFrame</code> with the specified title.
     * Note that passing in a <code>null</code> <code>title</code> results in
     * unspecified behavior and possibly an exception.
     *
     * @param title  the non-<code>null</code> <code>String</code>
     *     to display in the title bar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public JInternalFrame() {

    /**
     * Creates a non-resizable, non-closable, non-maximizable,
     * non-iconifiable <code>JInternalFrame</code> with no title.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final static String IS_MAXIMUM_PROPERTY = "maximum";

    /** Constrained property name indicating that the internal frame is maximized. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final static String IS_SELECTED_PROPERTY = "selected";

    /**
     * Constrained property name indicated that this frame has
     * selected status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final static String FRAME_ICON_PROPERTY = "frameIcon";

    /** Bound property name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final static String ROOT_PANE_PROPERTY = "rootPane";

    /** Bound property name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final static String TITLE_PROPERTY = "title";

    /** Bound property name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    public final static String CONTENT_PANE_PROPERTY = "contentPane";

    /** Bound property name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    private Component lastFocusOwner;

    /**
     * Contains the Component that focus is to go when
     * <code>restoreSubcomponentFocus</code> is invoked, that is,
     * <code>restoreSubcomponentFocus</code> sets this to the value returned
     * from <code>getMostRecentFocusOwner</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected JDesktopIcon desktopIcon;

    /**
     * The icon that is displayed when this internal frame is iconified.
     * @see #iconable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected Icon frameIcon;

    /** The icon shown in the top-left corner of this internal frame. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected boolean resizable;

    /** The frame's size can be changed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected boolean iconable;

    /**
     * The frame can "iconified" (shrunk down and displayed as
     * an icon-image).
     * @see JInternalFrame.JDesktopIcon
     * @see #setIconifiable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected boolean maximizable;

    /** The frame can be expanded to the size of the desktop pane. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected boolean closable;

    /** The frame can be closed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected boolean rootPaneCheckingEnabled = false;

    /**
     * If true then calls to <code>add</code> and <code>setLayout</code>
     * will be forwarded to the <code>contentPane</code>. This is initially
     * false, but is set to true when the <code>JInternalFrame</code> is
     * constructed.
     *
     * @see #isRootPaneCheckingEnabled
     * @see #setRootPaneCheckingEnabled
     * @see javax.swing.RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    protected JRootPane rootPane;

    /**
     * The <code>JRootPane</code> instance that manages the
     * content pane
     * and optional menu bar for this internal frame, as well as the
     * glass pane.
     *
     * @see JRootPane
     * @see RootPaneContainer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
    private static final String uiClassID = "InternalFrameUI";

    /**
     * @see #getUIClassID
     * @see #readObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/JInternalFrame.java
public class JInternalFrame extends JComponent implements

/**
 * A lightweight object that provides many of the features of
 * a native frame, including dragging, closing, becoming an icon,
 * resizing, title display, and support for a menu bar.
 * For task-oriented documentation and examples of using internal frames,
 * see <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/internalframe.html" target="_top">How to Use Internal Frames</a>,
 * a section in <em>The Java Tutorial</em>.
 *
 * <p>
 *
 * Generally,
 * you add <code>JInternalFrame</code>s to a <code>JDesktopPane</code>. The UI
 * delegates the look-and-feel-specific actions to the
 * <code>DesktopManager</code>
 * object maintained by the <code>JDesktopPane</code>.
 * <p>
 * The <code>JInternalFrame</code> content pane
 * is where you add child components.
 * As a convenience, the {@code add}, {@code remove}, and {@code setLayout}
 * methods of this class are overridden, so that they delegate calls
 * to the corresponding methods of the {@code ContentPane}.
 * For example, you can add a child component to an internal frame as follows:
 * <pre>
 *       internalFrame.add(child);
 * </pre>
 * And the child will be added to the contentPane.
 * The content pane is actually managed by an instance of
 * <code>JRootPane</code>,
 * which also manages a layout pane, glass pane, and
 * optional menu bar for the internal frame. Please see the
 * <code>JRootPane</code>
 * documentation for a complete description of these components.
 * Refer to {@link javax.swing.RootPaneContainer}
 * for details on adding, removing and setting the <code>LayoutManager</code>
 * of a <code>JInternalFrame</code>.
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
 * @see InternalFrameEvent
 * @see JDesktopPane
 * @see DesktopManager
 * @see JInternalFrame.JDesktopIcon
 * @see JRootPane
 * @see javax.swing.RootPaneContainer
 *
 * @author David Kloba
 * @author Rich Schiavi
 * @beaninfo
 *      attribute: isContainer true
 *      attribute: containerDelegate getContentPane
 *      description: A frame container which is contained within
 *                   another window.
 */
