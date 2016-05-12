_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public void propertyChange(PropertyChangeEvent e) {

        /**
         * Messaged from the <code>JSplitPane</code> the receiver is
         * contained in.  May potentially reset the layout manager and cause a
         * <code>validate</code> to be sent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public class BasicVerticalLayoutManager extends

    /**
     * LayoutManager used for JSplitPanes with an orientation of
     * VERTICAL_SPLIT.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        void distributeSpace(int space, boolean keepHidden) {

        /**
         * Distributes <code>space</code> between the two components
         * (divider won't get any extra space) based on the weighting. This
         * attempts to honor the min size of the components.
         *
         * @param keepHidden if true and one of the components is 0x0
         *                   it gets none of the extra space
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        void resetToPreferredSizes(int availableSize) {

        /**
         * Resets the components to their preferred sizes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        int[] getMinimumSizes() {

        /**
         * Returns an array of the minimum sizes of the components.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        int[] getPreferredSizes() {

        /**
         * Returns an array of the minimum sizes of the components.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        void setDividerLocation(int leftSize, int availableSize) {

        /**
         * Resets the size of the first component to <code>leftSize</code>,
         * and the right component to the remainder of the space.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        protected void updateComponents() {

        /**
         * Determines the components. This should be called whenever
         * a new instance of this is installed into an existing
         * SplitPane.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        int getSizeForSecondaryAxis(Insets insets, boolean isTop) {

        /**
         * Returns a particular value of the inset identified by the
         * axis and <code>isTop</code><p>
         *   axis isTop
         *    0    true    - left
         *    0    false   - right
         *    1    true    - top
         *    1    false   - bottom
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        int getSizeForPrimaryAxis(Insets insets, boolean isTop) {

        /**
         * Returns a particular value of the inset identified by the
         * axis and <code>isTop</code><p>
         *   axis isTop
         *    0    true    - left
         *    0    false   - right
         *    1    true    - top
         *    1    false   - bottom
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        int getSizeForSecondaryAxis(Dimension size) {

        /**
         * If the axis == 0, the width is returned, otherwise the height.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        int getSizeForPrimaryAxis(Dimension size) {

        /**
         * If the axis == 0, the width is returned, otherwise the height.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        protected void setComponentToSize(Component c, int size,
                                          int location, Insets insets,
                                          Dimension containerSize) {

        /**
         * Sets the width of the component c to be size, placing its
         * x location at location, y to the insets.top and height
         * to the containersize.height less the top and bottom insets.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        protected int getInitialLocation(Insets insets) {

        /**
         * Returns the left inset, unless the Insets are null in which case
         * 0 is returned.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        protected int getAvailableSize(Dimension containerSize,
                                       Insets insets) {

        /**
         * Returns the available width based on the container size and
         * Insets.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        protected int getSizeOfComponent(Component c) {

        /**
         * Returns the width of the passed in component.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        int getMinimumSizeOfComponent(Component c) {

        /**
         * Returns the width of the passed in Components minimum size.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        protected int getPreferredSizeOfComponent(Component c) {

        /**
         * Returns the width of the passed in Components preferred size.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        protected int[] getSizes() {

        /**
         * Returns the sizes of the components.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        protected void setSizes(int[] newSizes) {

        /**
         * Sets the sizes to <code>newSizes</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        protected void resetSizeAt(int index) {

        /**
         * Resets the size of the Component at the passed in location.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public void resetToPreferredSizes() {

        /**
         * Marks the receiver so that the next time this instance is
         * laid out it'll ask for the preferred sizes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public Dimension maximumLayoutSize(Container target) {

        /**
         * Returns the maximum layout size, which is Integer.MAX_VALUE
         * in both directions.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public void invalidateLayout(Container c) {

        /**
         * Does nothing. If the developer really wants to change the
         * size of one of the views JSplitPane.resetToPreferredSizes should
         * be messaged.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public float getLayoutAlignmentY(Container target) {

        /**
         * Returns the alignment along the y axis.  This specifies how
         * the component would like to be aligned relative to other
         * components.  The value should be a number between 0 and 1
         * where 0 represents alignment along the origin, 1 is aligned
         * the furthest away from the origin, 0.5 is centered, etc.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public float getLayoutAlignmentX(Container target) {

        /**
         * Returns the alignment along the x axis.  This specifies how
         * the component would like to be aligned relative to other
         * components.  The value should be a number between 0 and 1
         * where 0 represents alignment along the origin, 1 is aligned
         * the furthest away from the origin, 0.5 is centered, etc.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public void addLayoutComponent(Component comp, Object constraints) {

        /**
         * Adds the specified component to the layout, using the specified
         * constraint object.
         * @param comp the component to be added
         * @param constraints  where/how the component is added to the layout.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public void removeLayoutComponent(Component component) {

        /**
         * Removes the specified component from our knowledge.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public Dimension preferredLayoutSize(Container container) {

        /**
         * Returns the preferred size needed to contain the children.
         * The width is the sum of all the preferred widths of the children and
         * the height is the largest preferred height of the children.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public Dimension minimumLayoutSize(Container container) {

        /**
         * Returns the minimum size needed to contain the children.
         * The width is the sum of all the children's min widths and
         * the height is the largest of the children's minimum heights.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public void addLayoutComponent(String place, Component component) {

        /**
         * Adds the component at place.  Place must be one of
         * JSplitPane.LEFT, RIGHT, TOP, BOTTOM, or null (for the
         * divider).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public void layoutContainer(Container container) {

        /**
         * Does the actual layout.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        private int             axis;

        /** Axis, 0 for horizontal, or 1 for veritcal. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        private int             lastSplitPaneSize;

        /** Size of the splitpane the last time laid out. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public class BasicHorizontalLayoutManager implements LayoutManager2

    /**
     * LayoutManager for JSplitPanes that have an orientation of
     * HORIZONTAL_SPLIT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this method is no longer used. Instead
     * you should set the border on the divider.
     * <p>
     * Returns the width of one side of the divider border.
     *
     * @deprecated As of Java 2 platform v1.3, instead set the border on the
     * divider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void finishDraggingTo(int location) {

    /**
     * Messaged to finish the dragging session. If not continuous display
     * the dividers location will be reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void dragDividerTo(int location) {

    /**
     * Messaged during a dragging session to move the divider to the
     * passed in location. If continuousLayout is true the location is
     * reset and the splitPane validated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void startDragging() {

    /**
     * Should be messaged before the dragging session starts, resets
     * lastDragLocation and dividerSize.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    private boolean getKeepHidden() {

    /**
     * The value returned indicates if one of the splitpane sides is expanded.
     * @return true if one of the splitpane sides is expanded, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    void setKeepHidden(boolean keepHidden) {

    /**
     * Set the value to indicate if one of the splitpane sides is expanded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void resetLayoutManager() {

    /**
     * Resets the layout manager based on orientation and messages it
     * with invalidateLayout to pull in appropriate Components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public Insets getInsets(JComponent jc) {

    /**
     * Returns the insets. The insets are returned from the border insets
     * of the current border.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public Dimension getMaximumSize(JComponent jc) {

    /**
     * Returns the maximum size for the passed in component,
     * This is passed off to the current layout manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public Dimension getMinimumSize(JComponent jc) {

    /**
     * Returns the minimum size for the passed in component,
     * This is passed off to the current layout manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public Dimension getPreferredSize(JComponent jc) {

    /**
     * Returns the preferred size for the passed in component,
     * This is passed off to the current layout manager.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public void paint(Graphics g, JComponent jc) {

    /**
     * {@inheritDoc}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public void finishedPaintingChildren(JSplitPane sp, Graphics g) {

    /**
     * Called when the specified split pane has finished painting
     * its children.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public int getMaximumDividerLocation(JSplitPane jc) {

    /**
     * Gets the maximum location of the divider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public int getMinimumDividerLocation(JSplitPane jc) {

    /**
     * Gets the minimum location of the divider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public int getDividerLocation(JSplitPane jc) {

    /**
     * Returns the location of the divider, which may differ from what
     * the splitpane thinks the location of the divider is.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public void setDividerLocation(JSplitPane jc, int location) {

    /**
     * Sets the location of the divider to location.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public void resetToPreferredSizes(JSplitPane jc) {

    /**
     * Messaged to reset the preferred sizes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public BasicSplitPaneDivider createDefaultDivider() {

    /**
     * Creates the default divider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public JSplitPane getSplitPane() {

    /**
     * Returns the splitpane this instance is currently contained
     * in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public Component getNonContinuousLayoutDivider() {

    /**
     * Returns the divider to use when the splitPane is configured to
     * not continuously layout. This divider will only be used during a
     * dragging session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void setNonContinuousLayoutDivider(Component newDivider,
        boolean rememberSizes) {

    /**
     * Sets the divider to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void setNonContinuousLayoutDivider(Component newDivider) {

    /**
     * Sets the divider to use when the splitPane is configured to
     * not continuously layout. This divider will only be used during a
     * dragging session. It is recommended that the passed in component
     * be a heavy weight.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected Component createDefaultNonContinuousLayoutDivider() {

    /**
     * Returns the default non continuous layout divider, which is an
     * instance of {@code Canvas} that fills in the background with dark gray.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public BasicSplitPaneDivider getDivider() {

    /**
     * Returns the divider between the top Components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public class KeyboardResizeToggleHandler implements ActionListener

    /**
     * Implementation of an ActionListener that the JSplitPane UI uses for
     * handling specific key presses.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicSplitPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public class KeyboardEndHandler implements ActionListener

    /**
     * Implementation of an ActionListener that the JSplitPane UI uses for
     * handling specific key presses.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicSplitPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public class KeyboardHomeHandler implements ActionListener

    /**
     * Implementation of an ActionListener that the JSplitPane UI uses for
     * handling specific key presses.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicSplitPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public class KeyboardDownRightHandler implements ActionListener

    /**
     * Implementation of an ActionListener that the JSplitPane UI uses for
     * handling specific key presses.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicSplitPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public class KeyboardUpLeftHandler implements ActionListener

    /**
     * Implementation of an ActionListener that the JSplitPane UI uses for
     * handling specific key presses.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicSplitPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public class FocusHandler extends FocusAdapter

    /**
     * Implementation of the FocusListener that the JSplitPane UI uses.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicSplitPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
        public void propertyChange(PropertyChangeEvent e) {

        /**
         * Messaged from the <code>JSplitPane</code> the receiver is
         * contained in.  May potentially reset the layout manager and cause a
         * <code>validate</code> to be sent.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public class PropertyHandler implements PropertyChangeListener

    /**
     * Implementation of the PropertyChangeListener
     * that the JSplitPane UI uses.
     * <p>
     * This class should be treated as a &quot;protected&quot; inner class.
     * Instantiate it only within subclasses of BasicSplitPaneUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    int getKeyboardMoveIncrement() {

    /**
     * @return increment via keyboard methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public void setLastDragLocation(int l) {

    /**
     * Set the last drag location of the JSplitPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public int getLastDragLocation() {

    /**
     * Returns the last drag location of the JSplitPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public void setContinuousLayout(boolean b) {

    /**
     * Turn continuous layout on/off.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public boolean isContinuousLayout() {

    /**
     * Determines whether the JSplitPane is set to use a continuous layout.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public void setOrientation(int orientation) {

    /**
     * Set the orientation for the JSplitPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public int getOrientation() {

    /**
     * Returns the orientation for the JSplitPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this method is no
     * longer used. Subclassers previously using this method should
     * instead create an Action wrapping the ActionListener, and register
     * that Action by overriding <code>installKeyboardActions</code> and
     * placing the Action in the SplitPane's ActionMap. Please refer to
     * the key bindings specification for further details.
     * <p>
     * Creates a ActionListener for the JSplitPane UI that listens for
     * specific key presses.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this method is no
     * longer used. Subclassers previously using this method should
     * instead create an Action wrapping the ActionListener, and register
     * that Action by overriding <code>installKeyboardActions</code> and
     * placing the Action in the SplitPane's ActionMap. Please refer to
     * the key bindings specification for further details.
     * <p>
     * Creates a ActionListener for the JSplitPane UI that listens for
     * specific key presses.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this method is no
     * longer used. Subclassers previously using this method should
     * instead create an Action wrapping the ActionListener, and register
     * that Action by overriding <code>installKeyboardActions</code> and
     * placing the Action in the SplitPane's ActionMap. Please refer to
     * the key bindings specification for further details.
     * <p>
     * Creates a ActionListener for the JSplitPane UI that listens for
     * specific key presses.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this method is no
     * longer used. Subclassers previously using this method should
     * instead create an Action wrapping the ActionListener, and register
     * that Action by overriding <code>installKeyboardActions</code> and
     * placing the Action in the SplitPane's ActionMap. Please refer to
     * the key bindings specification for further details.
     * <p>
     * Creates a ActionListener for the JSplitPane UI that listens for
     * specific key presses.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this method is no
     * longer used. Subclassers previously using this method should
     * instead create an Action wrapping the ActionListener, and register
     * that Action by overriding <code>installKeyboardActions</code> and
     * placing the Action in the SplitPane's ActionMap. Please refer to
     * the key bindings specification for further details.
     * <p>
     * Creates a ActionListener for the JSplitPane UI that listens for
     * specific key presses.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected FocusListener createFocusListener() {

    /**
     * Creates a FocusListener for the JSplitPane UI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected PropertyChangeListener createPropertyChangeListener() {

    /**
     * Creates a PropertyChangeListener for the JSplitPane UI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void uninstallKeyboardActions() {

    /**
     * Uninstalls the keyboard actions for the UI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void uninstallListeners() {

    /**
     * Uninstalls the event listeners for the UI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void uninstallDefaults() {

    /**
     * Uninstalls the UI defaults.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public void uninstallUI(JComponent c) {

    /**
     * Uninstalls the UI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void installKeyboardActions() {

    /**
     * Installs the keyboard actions for the UI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void installListeners() {

    /**
     * Installs the event listeners for the UI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected void installDefaults(){

    /**
     * Installs the UI defaults.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public void installUI(JComponent c) {

    /**
     * Installs the UI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    public static ComponentUI createUI(JComponent x) {

    /**
     * Creates a new BasicSplitPaneUI instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    boolean             ignoreDividerLocationChange;

    /** If true, setDividerLocation does nothing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    // This is used by the LayoutManager to determine when it should use

    /** Indicates that we have painted once. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    @Deprecated

    /**
     * As of Java 2 platform v1.3 this previously undocumented field is no
     * longer used.
     * Key bindings are now defined by the LookAndFeel, please refer to
     * the key bindings specification for further details.
     *
     * @deprecated As of Java 2 platform v1.3.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected int beginDragDividerLocation;

    /**
     * Location of the divider when the dragging session began.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected boolean draggingHW;

    /**
     * Set to true in startDragging if any of the children
     * (not including the nonContinuousLayoutDivider) are heavy weights.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected Component nonContinuousLayoutDivider;

    /**
     * Instance for the shadow of the divider when non continuous layout
     * is being used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected int dividerSize;

    /**
     * The size of the divider while the dragging session is valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    private Set<KeyStroke> managingFocusBackwardTraversalKeys;

    /**
     * Keys to use for backward focus traversal when the JComponent is
     * managing focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    private Set<KeyStroke> managingFocusForwardTraversalKeys;

    /**
     * Keys to use for forward focus traversal when the JComponent is
     * managing focus.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected FocusListener focusListener;

    /**
     * Instance of the FocusListener for this JSplitPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected PropertyChangeListener propertyChangeListener;

    /**
     * Instance of the PropertyChangeListener for this JSplitPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected BasicSplitPaneDivider divider;

    /**
     * Instance of the divider for this JSplitPane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected BasicHorizontalLayoutManager layoutManager;

    /**
     * LayoutManager that is created and placed into the split pane.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected JSplitPane splitPane;

    /**
     * JSplitPane instance this instance is providing
     * the look and feel for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected static int KEYBOARD_DIVIDER_MOVE_OFFSET = 3;

    /**
     * How far (relative) the divider does move when it is moved around by
     * the cursor keys on the keyboard.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
    protected static final String NON_CONTINUOUS_DIVIDER =

    /**
     * The divider used for non-continuous layout is added to the split pane
     * with this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/BasicSplitPaneUI.java
public class BasicSplitPaneUI extends SplitPaneUI

/**
 * A Basic L&amp;F implementation of the SplitPaneUI.
 *
 * @author Scott Violet
 * @author Steve Wilson
 * @author Ralph Kar
 */
