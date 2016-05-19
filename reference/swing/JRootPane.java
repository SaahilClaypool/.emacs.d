_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the specified Accessible child of the object.  The Accessible
         * children of an Accessible object are zero-based, so the first child
         * of an Accessible child is at index 0, the second child is at index 1,
         * and so on.
         *
         * @param i zero-based index of child
         * @return the Accessible child of the object
         * @see #getAccessibleChildrenCount
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children of the object.
         *
         * @return the number of accessible children of the object.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
        public AccessibleRole getAccessibleRole() {

        /**
         * Get the role of this object.
         *
         * @return an instance of AccessibleRole describing the role of
         * the object
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    @SuppressWarnings("serial")

    /**
     * This class implements accessibility support for the
     * <code>JRootPane</code> class.  It provides an implementation of the
     * Java Accessibility API appropriate to root pane user-interface elements.
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    /**

////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
// Accessibility support

/////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected String paramString() {

    /**
     * Returns a string representation of this <code>JRootPane</code>.
     * This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not
     * be <code>null</code>.
     *
     * @return  a string representation of this <code>JRootPane</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
        public void layoutContainer(Container parent) {

        /**
         * Instructs the layout manager to perform the layout for the specified
         * container.
         *
         * @param parent the Container for which this layout manager
         * is being used
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
        public Dimension maximumLayoutSize(Container target) {

        /**
         * Returns the maximum amount of space the layout can use.
         *
         * @param target the Container for which this layout manager
         * is being used
         * @return a Dimension object containing the layout's maximum size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
        public Dimension minimumLayoutSize(Container parent) {

        /**
         * Returns the minimum amount of space the layout needs.
         *
         * @param parent the Container for which this layout manager
         * is being used
         * @return a Dimension object containing the layout's minimum size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
        public Dimension preferredLayoutSize(Container parent) {

        /**
         * Returns the amount of space the layout would like to have.
         *
         * @param parent the Container for which this layout manager
         * is being used
         * @return a Dimension object containing the layout's preferred size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    /**

///////////////////////////////////////////////////////////////////////////////
//// Begin Inner Classes
///////////////////////////////////////////////////////////////////////////////
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
        if(glassPane != null
            && glassPane.getParent() == this

        /// We are making sure the glassPane is on top.
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected void addImpl(Component comp, Object constraints, int index) {

    /**
     * Overridden to enforce the position of the glass component as
     * the zero child.
     *
     * @param comp the component to be enhanced
     * @param constraints the constraints to be respected
     * @param index the index
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public JButton getDefaultButton() {

    /**
     * Returns the value of the <code>defaultButton</code> property.
     * @return the <code>JButton</code> which is currently the default button
     * @see #setDefaultButton
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void setDefaultButton(JButton defaultButton) {

    /**
     * Sets the <code>defaultButton</code> property,
     * which determines the current default button for this <code>JRootPane</code>.
     * The default button is the button which will be activated
     * when a UI-defined activation event (typically the <b>Enter</b> key)
     * occurs in the root pane regardless of whether or not the button
     * has keyboard focus (unless there is another component within
     * the root pane which consumes the activation event,
     * such as a <code>JTextPane</code>).
     * For default activation to work, the button must be an enabled
     * descendent of the root pane when activation occurs.
     * To remove a default button from this root pane, set this
     * property to <code>null</code>.
     *
     * @see JButton#isDefaultButton
     * @param defaultButton the <code>JButton</code> which is to be the default button
     *
     * @beaninfo
     *  description: The button activated by default in this root pane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void removeNotify() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void addNotify() {

    /**
     * {@inheritDoc}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public boolean isOptimizedDrawingEnabled() {

    /**
     * The <code>glassPane</code> and <code>contentPane</code>
     * have the same bounds, which means <code>JRootPane</code>
     * does not tiles its children and this should return false.
     * On the other hand, the <code>glassPane</code>
     * is normally not visible, and so this can return true if the
     * <code>glassPane</code> isn't visible. Therefore, the
     * return value here depends upon the visibility of the
     * <code>glassPane</code>.
     *
     * @return true if this component's children don't overlap
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    @Override

    /**
     * If a descendant of this <code>JRootPane</code> calls
     * <code>revalidate</code>, validate from here on down.
     *<p>
     * Deferred requests to layout a component and its descendents again.
     * For example, calls to <code>revalidate</code>, are pushed upwards to
     * either a <code>JRootPane</code> or a <code>JScrollPane</code>
     * because both classes override <code>isValidateRoot</code> to return true.
     *
     * @see JComponent#isValidateRoot
     * @see java.awt.Container#isValidateRoot
     * @return true
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public Component getGlassPane() {

    /**
     * Returns the current glass pane for this <code>JRootPane</code>.
     * @return the current glass pane
     * @see #setGlassPane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void setGlassPane(Component glass) {

    /**
     * Sets a specified <code>Component</code> to be the glass pane for this
     * root pane.  The glass pane should normally be a lightweight,
     * transparent component, because it will be made visible when
     * ever the root pane needs to grab input events.
     * <p>
     * The new glass pane's visibility is changed to match that of
     * the current glass pane.  An implication of this is that care
     * must be taken when you want to replace the glass pane and
     * make it visible.  Either of the following will work:
     * <pre>
     *   root.setGlassPane(newGlassPane);
     *   newGlassPane.setVisible(true);
     * </pre>
     * or:
     * <pre>
     *   root.getGlassPane().setVisible(true);
     *   root.setGlassPane(newGlassPane);
     * </pre>
     *
     * @param glass the <code>Component</code> to use as the glass pane
     *              for this <code>JRootPane</code>
     * @exception NullPointerException if the <code>glass</code> parameter is
     *          <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public JLayeredPane getLayeredPane() { return layeredPane; }

    /**
     * Gets the layered pane used by the root pane. The layered pane
     * typically holds a content pane and an optional <code>JMenuBar</code>.
     *
     * @return the <code>JLayeredPane</code> currently in use
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void setLayeredPane(JLayeredPane layered) {

    /**
     * Sets the layered pane for the root pane. The layered pane
     * typically holds a content pane and an optional <code>JMenuBar</code>.
     *
     * @param layered  the <code>JLayeredPane</code> to use
     * @exception java.awt.IllegalComponentStateException (a runtime
     *            exception) if the layered pane parameter is <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public Container getContentPane() { return contentPane; }

    /**
     * Returns the content pane -- the container that holds the components
     * parented by the root pane.
     *
     * @return the <code>Container</code> that holds the component-contents
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void setContentPane(Container content) {

    /**
     * Sets the content pane -- the container that holds the components
     * parented by the root pane.
     * <p>
     * Swing's painting architecture requires an opaque <code>JComponent</code>
     * in the containment hierarchy. This is typically provided by the
     * content pane. If you replace the content pane it is recommended you
     * replace it with an opaque <code>JComponent</code>.
     *
     * @param content the <code>Container</code> to use for component-contents
     * @exception java.awt.IllegalComponentStateException (a runtime
     *            exception) if the content pane parameter is <code>null</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    @Deprecated

    /**
     * Returns the menu bar value.
     * @deprecated As of Swing version 1.0.3
     *  replaced by <code>getJMenuBar()</code>.
     * @return the <code>JMenuBar</code> used in the pane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public JMenuBar getJMenuBar() { return menuBar; }

    /**
     * Returns the menu bar from the layered pane.
     * @return the <code>JMenuBar</code> used in the pane
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    @Deprecated

    /**
     * Specifies the menu bar value.
     * @deprecated As of Swing version 1.0.3
     *  replaced by <code>setJMenuBar(JMenuBar menu)</code>.
     * @param menu the <code>JMenuBar</code> to add.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void setJMenuBar(JMenuBar menu) {

    /**
     * Adds or changes the menu bar used in the layered pane.
     * @param menu the <code>JMenuBar</code> to add
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected LayoutManager createRootLayout() {

    /**
     * Called by the constructor methods to create the default
     * <code>layoutManager</code>.
     * @return the default <code>layoutManager</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected Component createGlassPane() {

    /**
      * Called by the constructor methods to create the default
      * <code>glassPane</code>.
      * By default this method creates a new <code>JComponent</code>
      * with visibility set to false.
      * @return the default <code>glassPane</code>
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected Container createContentPane() {

    /**
     * Called by the constructor methods to create the default
     * <code>contentPane</code>.
     * By default this method creates a new <code>JComponent</code> add sets a
     * <code>BorderLayout</code> as its <code>LayoutManager</code>.
     * @return the default <code>contentPane</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected JLayeredPane createLayeredPane() {

    /**
      * Called by the constructor methods to create the default
      * <code>layeredPane</code>.
      * Bt default it creates a new <code>JLayeredPane</code>.
      * @return the default <code>layeredPane</code>
      */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public String getUIClassID() {

    /**
     * Returns a string that specifies the name of the L&amp;F class
     * that renders this component.
     *
     * @return the string "RootPaneUI"
     *
     * @see JComponent#getUIClassID
     * @see UIDefaults#getUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void updateUI() {

    /**
     * Resets the UI property to a value from the current look and feel.
     *
     * @see JComponent#updateUI
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void setUI(RootPaneUI ui) {

    /**
     * Sets the L&amp;F object that renders this component.
     *
     * @param ui  the <code>LabelUI</code> L&amp;F object
     * @see UIDefaults#getUI
     * @beaninfo
     *        bound: true
     *       hidden: true
     *      expert: true
     *    attribute: visualUpdate true
     *  description: The UI object that implements the Component's LookAndFeel.
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public RootPaneUI getUI() {

    /**
     * Returns the L&amp;F object that renders this component.
     *
     * @return <code>LabelUI</code> object
     * @since 1.3
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void setWindowDecorationStyle(int windowDecorationStyle) {

    /**
     * Sets the type of Window decorations (such as borders, widgets for
     * closing a Window, title ...) the <code>JRootPane</code> should
     * provide. The default is to provide no Window decorations
     * (<code>NONE</code>).
     * <p>
     * This is only a hint, and some look and feels may not support
     * this.
     * This is a bound property.
     *
     * @param windowDecorationStyle Constant identifying Window decorations
     *        to provide.
     * @see JDialog#setDefaultLookAndFeelDecorated
     * @see JFrame#setDefaultLookAndFeelDecorated
     * @see LookAndFeel#getSupportsWindowDecorations
     * @throws IllegalArgumentException if <code>style</code> is
     *        not one of: <code>NONE</code>, <code>FRAME</code>,
     *        <code>PLAIN_DIALOG</code>, <code>INFORMATION_DIALOG</code>,
     *        <code>ERROR_DIALOG</code>, <code>COLOR_CHOOSER_DIALOG</code>,
     *        <code>FILE_CHOOSER_DIALOG</code>, <code>QUESTION_DIALOG</code>, or
     *        <code>WARNING_DIALOG</code>.
     * @since 1.4
     * @beaninfo
     *        bound: true
     *         enum: NONE                   JRootPane.NONE
     *               FRAME                  JRootPane.FRAME
     *               PLAIN_DIALOG           JRootPane.PLAIN_DIALOG
     *               INFORMATION_DIALOG     JRootPane.INFORMATION_DIALOG
     *               ERROR_DIALOG           JRootPane.ERROR_DIALOG
     *               COLOR_CHOOSER_DIALOG   JRootPane.COLOR_CHOOSER_DIALOG
     *               FILE_CHOOSER_DIALOG    JRootPane.FILE_CHOOSER_DIALOG
     *               QUESTION_DIALOG        JRootPane.QUESTION_DIALOG
     *               WARNING_DIALOG         JRootPane.WARNING_DIALOG
     *       expert: true
     *    attribute: visualUpdate true
     *  description: Identifies the type of Window decorations to provide
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public int getWindowDecorationStyle() {

    /**
     * Returns a constant identifying the type of Window decorations the
     * <code>JRootPane</code> is providing.
     *
     * @return One of <code>NONE</code>, <code>FRAME</code>,
     *        <code>PLAIN_DIALOG</code>, <code>INFORMATION_DIALOG</code>,
     *        <code>ERROR_DIALOG</code>, <code>COLOR_CHOOSER_DIALOG</code>,
     *        <code>FILE_CHOOSER_DIALOG</code>, <code>QUESTION_DIALOG</code> or
     *        <code>WARNING_DIALOG</code>.
     * @see #setWindowDecorationStyle
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public void setDoubleBuffered(boolean aFlag) {

    /**
     * {@inheritDoc}
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public JRootPane() {

    /**
     * Creates a <code>JRootPane</code>, setting up its
     * <code>glassPane</code>, <code>layeredPane</code>,
     * and <code>contentPane</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    boolean useTrueDoubleBuffering = true;

    /**
     * Whether or not true double buffering should be used.  This is typically
     * true, but may be set to false in special situations.  For example,
     * heavy weight popups (backed by a window) set this to false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this unusable field is no longer used.
     * To override the default button you should replace the <code>Action</code>
     * in the <code>JRootPane</code>'s <code>ActionMap</code>. Please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     *  @see #defaultButton
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this unusable field is no longer used.
     * To override the default button you should replace the <code>Action</code>
     * in the <code>JRootPane</code>'s <code>ActionMap</code>. Please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     *  @see #defaultButton
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected JButton defaultButton;

    /**
     * The button that gets activated when the pane has the focus and
     * a UI-specific action like pressing the <b>Enter</b> key occurs.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected Component glassPane;

    /**
     * The glass pane that overlays the menu bar and content pane,
     *  so it can intercept mouse movements and such.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected JLayeredPane layeredPane;

    /** The layered pane that manages the menu bar and content pane. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected Container contentPane;

    /** The content pane. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    protected JMenuBar menuBar;

    /** The menu bar. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public static final int WARNING_DIALOG = 8;

    /**
     * Constant used for the windowDecorationStyle property. Indicates that
     * the <code>JRootPane</code> should provide decorations appropriate for
     * a Dialog used to display a warning message.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public static final int QUESTION_DIALOG = 7;

    /**
     * Constant used for the windowDecorationStyle property. Indicates that
     * the <code>JRootPane</code> should provide decorations appropriate for
     * a Dialog used to present a question to the user.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public static final int FILE_CHOOSER_DIALOG = 6;

    /**
     * Constant used for the windowDecorationStyle property. Indicates that
     * the <code>JRootPane</code> should provide decorations appropriate for
     * a Dialog used to display a <code>JFileChooser</code>.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public static final int COLOR_CHOOSER_DIALOG = 5;

    /**
     * Constant used for the windowDecorationStyle property. Indicates that
     * the <code>JRootPane</code> should provide decorations appropriate for
     * a Dialog used to display a <code>JColorChooser</code>.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public static final int ERROR_DIALOG = 4;

    /**
     * Constant used for the windowDecorationStyle property. Indicates that
     * the <code>JRootPane</code> should provide decorations appropriate for
     * a Dialog used to display an error message.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public static final int INFORMATION_DIALOG = 3;

    /**
     * Constant used for the windowDecorationStyle property. Indicates that
     * the <code>JRootPane</code> should provide decorations appropriate for
     * a Dialog used to display an informational message.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public static final int PLAIN_DIALOG = 2;

    /**
     * Constant used for the windowDecorationStyle property. Indicates that
     * the <code>JRootPane</code> should provide decorations appropriate for
     * a Dialog.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public static final int FRAME = 1;

    /**
     * Constant used for the windowDecorationStyle property. Indicates that
     * the <code>JRootPane</code> should provide decorations appropriate for
     * a Frame.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    public static final int NONE = 0;

    /**
     * Constant used for the windowDecorationStyle property. Indicates that
     * the <code>JRootPane</code> should not provide any sort of
     * Window decorations.
     *
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    private static final boolean IGNORE_DISABLE_TRUE_DOUBLE_BUFFERING;

    /**
     * Whether or not we should ignore requests to disable true double
     * buffering. Default is false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
    private static final boolean LOG_DISABLE_TRUE_DOUBLE_BUFFERING;

    /**
     * Whether or not we should dump the stack when true double buffering
     * is disabled. Default is false.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//JRootPane.java
/// PENDING(klobad) Who should be opaque in this component?

/**
 * A lightweight container used behind the scenes by
 * <code>JFrame</code>, <code>JDialog</code>, <code>JWindow</code>,
 * <code>JApplet</code>, and <code>JInternalFrame</code>.
 * For task-oriented information on functionality provided by root panes
 * see <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html">How to Use Root Panes</a>,
 * a section in <em>The Java Tutorial</em>.
 *
 * <p>
 * The following image shows the relationships between
 * the classes that use root panes.
 * <p style="text-align:center"><img src="doc-files/JRootPane-1.gif"
 * alt="The following text describes this graphic."
 * HEIGHT=484 WIDTH=629></p>
 * The &quot;heavyweight&quot; components (those that delegate to a peer, or native
 * component on the host system) are shown with a darker, heavier box. The four
 * heavyweight JFC/Swing containers (<code>JFrame</code>, <code>JDialog</code>,
 * <code>JWindow</code>, and <code>JApplet</code>) are
 * shown in relation to the AWT classes they extend.
 * These four components are the
 * only heavyweight containers in the Swing library. The lightweight container
 * <code>JInternalFrame</code> is also shown.
 * All five of these JFC/Swing containers implement the
 * <code>RootPaneContainer</code> interface,
 * and they all delegate their operations to a
 * <code>JRootPane</code> (shown with a little "handle" on top).
 * <blockquote>
 * <b>Note:</b> The <code>JComponent</code> method <code>getRootPane</code>
 * can be used to obtain the <code>JRootPane</code> that contains
 * a given component.
 * </blockquote>
 * <table style="float:right" border="0" summary="layout">
 * <tr>
 * <td align="center">
 * <img src="doc-files/JRootPane-2.gif"
 * alt="The following text describes this graphic." HEIGHT=386 WIDTH=349>
 * </td>
 * </tr>
 * </table>
 * The diagram at right shows the structure of a <code>JRootPane</code>.
 * A <code>JRootpane</code> is made up of a <code>glassPane</code>,
 * an optional <code>menuBar</code>, and a <code>contentPane</code>.
 * (The <code>JLayeredPane</code> manages the <code>menuBar</code>
 * and the <code>contentPane</code>.)
 * The <code>glassPane</code> sits over the top of everything,
 * where it is in a position to intercept mouse movements.
 * Since the <code>glassPane</code> (like the <code>contentPane</code>)
 * can be an arbitrary component, it is also possible to set up the
 * <code>glassPane</code> for drawing. Lines and images on the
 * <code>glassPane</code> can then range
 * over the frames underneath without being limited by their boundaries.
 * <p>
 * Although the <code>menuBar</code> component is optional,
 * the <code>layeredPane</code>, <code>contentPane</code>,
 * and <code>glassPane</code> always exist.
 * Attempting to set them to <code>null</code> generates an exception.
 * <p>
 * To add components to the <code>JRootPane</code> (other than the
 * optional menu bar), you add the object to the <code>contentPane</code>
 * of the <code>JRootPane</code>, like this:
 * <pre>
 *       rootPane.getContentPane().add(child);
 * </pre>
 * The same principle holds true for setting layout managers, removing
 * components, listing children, etc. All these methods are invoked on
 * the <code>contentPane</code> instead of on the <code>JRootPane</code>.
 * <blockquote>
 * <b>Note:</b> The default layout manager for the <code>contentPane</code> is
 *  a <code>BorderLayout</code> manager. However, the <code>JRootPane</code>
 *  uses a custom <code>LayoutManager</code>.
 *  So, when you want to change the layout manager for the components you added
 *  to a <code>JRootPane</code>, be sure to use code like this:
 * <pre>
 *    rootPane.getContentPane().setLayout(new BoxLayout());
 * </pre></blockquote>
 * If a <code>JMenuBar</code> component is set on the <code>JRootPane</code>,
 * it is positioned along the upper edge of the frame.
 * The <code>contentPane</code> is adjusted in location and size to
 * fill the remaining area.
 * (The <code>JMenuBar</code> and the <code>contentPane</code> are added to the
 * <code>layeredPane</code> component at the
 * <code>JLayeredPane.FRAME_CONTENT_LAYER</code> layer.)
 * <p>
 * The <code>layeredPane</code> is the parent of all children in the
 * <code>JRootPane</code> -- both as the direct parent of the menu and
 * the grandparent of all components added to the <code>contentPane</code>.
 * It is an instance of <code>JLayeredPane</code>,
 * which provides the ability to add components at several layers.
 * This capability is very useful when working with menu popups,
 * dialog boxes, and dragging -- situations in which you need to place
 * a component on top of all other components in the pane.
 * <p>
 * The <code>glassPane</code> sits on top of all other components in the
 * <code>JRootPane</code>.
 * That provides a convenient place to draw above all other components,
 * and makes it possible to intercept mouse events,
 * which is useful both for dragging and for drawing.
 * Developers can use <code>setVisible</code> on the <code>glassPane</code>
 * to control when the <code>glassPane</code> displays over the other children.
 * By default the <code>glassPane</code> is not visible.
 * <p>
 * The custom <code>LayoutManager</code> used by <code>JRootPane</code>
 * ensures that:
 * <OL>
 * <LI>The <code>glassPane</code> fills the entire viewable
 *     area of the <code>JRootPane</code> (bounds - insets).
 * <LI>The <code>layeredPane</code> fills the entire viewable area of the
 *     <code>JRootPane</code>. (bounds - insets)
 * <LI>The <code>menuBar</code> is positioned at the upper edge of the
 *     <code>layeredPane</code>.
 * <LI>The <code>contentPane</code> fills the entire viewable area,
 *     minus the <code>menuBar</code>, if present.
 * </OL>
 * Any other views in the <code>JRootPane</code> view hierarchy are ignored.
 * <p>
 * If you replace the <code>LayoutManager</code> of the <code>JRootPane</code>,
 * you are responsible for managing all of these views.
 * So ordinarily you will want to be sure that you
 * change the layout manager for the <code>contentPane</code> rather than
 * for the <code>JRootPane</code> itself!
 * <p>
 * The painting architecture of Swing requires an opaque
 * <code>JComponent</code>
 * to exist in the containment hierarchy above all other components. This is
 * typically provided by way of the content pane. If you replace the content
 * pane, it is recommended that you make the content pane opaque
 * by way of <code>setOpaque(true)</code>. Additionally, if the content pane
 * overrides <code>paintComponent</code>, it
 * will need to completely fill in the background in an opaque color in
 * <code>paintComponent</code>.
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
 * @see JLayeredPane
 * @see JMenuBar
 * @see JWindow
 * @see JFrame
 * @see JDialog
 * @see JApplet
 * @see JInternalFrame
 * @see JComponent
 * @see BoxLayout
 *
 * @see <a href="http://java.sun.com/products/jfc/tsc/articles/mixing/">
 * Mixing Heavy and Light Components</a>
 *
 * @author David Kloba
 */
