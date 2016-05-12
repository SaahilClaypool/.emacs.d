_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array of all the objects chained as
     * <code><em>Foo</em>Listener</code>s by the specified
     * <code>java.util.EventListener</code>.
     * <code><em>Foo</em>Listener</code>s are chained by the
     * <code>AWTEventMulticaster</code> using the
     * <code>add<em>Foo</em>Listener</code> method.
     * If a <code>null</code> listener is specified, this method returns an
     * empty array. If the specified listener is not an instance of
     * <code>AWTEventMulticaster</code>, this method returns an array which
     * contains only the specified listener. If no such listeners are chained,
     * this method returns an empty array.
     *
     * @param l the specified <code>java.util.EventListener</code>
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects chained as
     *          <code><em>Foo</em>Listener</code>s by the specified multicast
     *          listener, or an empty array if no such listeners have been
     *          chained by the specified multicast listener
     * @exception NullPointerException if the specified
     *             {@code listenertype} parameter is {@code null}
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    protected static EventListener removeInternal(EventListener l, EventListener oldl) {

    /**
     * Returns the resulting multicast listener after removing the
     * old listener from listener-l.
     * If listener-l equals the old listener OR listener-l is null,
     * returns null.
     * Else if listener-l is an instance of AWTEventMulticaster,
     * then it removes the old listener from it.
     * Else, returns listener l.
     * @param l the listener being removed from
     * @param oldl the listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    protected static EventListener addInternal(EventListener a, EventListener b) {

    /**
     * Returns the resulting multicast listener from adding listener-a
     * and listener-b together.
     * If listener-a is null, it returns listener-b;
     * If listener-b is null, it returns listener-a
     * If neither are null, then it creates and returns
     * a new AWTEventMulticaster instance which chains a with b.
     * @param a event listener-a
     * @param b event listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseWheelListener remove(MouseWheelListener l,
                                            MouseWheelListener oldl) {

    /**
     * Removes the old mouse-wheel-listener from mouse-wheel-listener-l
     * and returns the resulting multicast listener.
     * @param l mouse-wheel-listener-l
     * @param oldl the mouse-wheel-listener being removed
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static HierarchyBoundsListener remove(HierarchyBoundsListener l, HierarchyBoundsListener oldl) {

    /**
     * Removes the old hierarchy-bounds-listener from
     * hierarchy-bounds-listener-l and returns the resulting multicast
     * listener.
     * @param l hierarchy-bounds-listener-l
     * @param oldl the hierarchy-bounds-listener being removed
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static HierarchyListener remove(HierarchyListener l, HierarchyListener oldl) {

    /**
     * Removes the old hierarchy-listener from hierarchy-listener-l and
     * returns the resulting multicast listener.
     * @param l hierarchy-listener-l
     * @param oldl the hierarchy-listener being removed
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static InputMethodListener remove(InputMethodListener l, InputMethodListener oldl) {

    /**
     * Removes the old input-method-listener from input-method-listener-l and
     * returns the resulting multicast listener.
     * @param l input-method-listener-l
     * @param oldl the input-method-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static AdjustmentListener remove(AdjustmentListener l, AdjustmentListener oldl) {

    /**
     * Removes the old adjustment-listener from adjustment-listener-l and
     * returns the resulting multicast listener.
     * @param l adjustment-listener-l
     * @param oldl the adjustment-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ItemListener remove(ItemListener l, ItemListener oldl) {

    /**
     * Removes the old item-listener from item-listener-l and
     * returns the resulting multicast listener.
     * @param l item-listener-l
     * @param oldl the item-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ActionListener remove(ActionListener l, ActionListener oldl) {

    /**
     * Removes the old action-listener from action-listener-l and
     * returns the resulting multicast listener.
     * @param l action-listener-l
     * @param oldl the action-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowFocusListener remove(WindowFocusListener l,
                                             WindowFocusListener oldl) {

    /**
     * Removes the old window-focus-listener from window-focus-listener-l
     * and returns the resulting multicast listener.
     * @param l window-focus-listener-l
     * @param oldl the window-focus-listener being removed
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowStateListener remove(WindowStateListener l,
                                             WindowStateListener oldl) {

    /**
     * Removes the old window-state-listener from window-state-listener-l
     * and returns the resulting multicast listener.
     * @param l window-state-listener-l
     * @param oldl the window-state-listener being removed
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowListener remove(WindowListener l, WindowListener oldl) {

    /**
     * Removes the old window-listener from window-listener-l and
     * returns the resulting multicast listener.
     * @param l window-listener-l
     * @param oldl the window-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseMotionListener remove(MouseMotionListener l, MouseMotionListener oldl) {

    /**
     * Removes the old mouse-motion-listener from mouse-motion-listener-l
     * and returns the resulting multicast listener.
     * @param l mouse-motion-listener-l
     * @param oldl the mouse-motion-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseListener remove(MouseListener l, MouseListener oldl) {

    /**
     * Removes the old mouse-listener from mouse-listener-l and
     * returns the resulting multicast listener.
     * @param l mouse-listener-l
     * @param oldl the mouse-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static KeyListener remove(KeyListener l, KeyListener oldl) {

    /**
     * Removes the old key-listener from key-listener-l and
     * returns the resulting multicast listener.
     * @param l key-listener-l
     * @param oldl the key-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static FocusListener remove(FocusListener l, FocusListener oldl) {

    /**
     * Removes the old focus-listener from focus-listener-l and
     * returns the resulting multicast listener.
     * @param l focus-listener-l
     * @param oldl the focus-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ContainerListener remove(ContainerListener l, ContainerListener oldl) {

    /**
     * Removes the old container-listener from container-listener-l and
     * returns the resulting multicast listener.
     * @param l container-listener-l
     * @param oldl the container-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ComponentListener remove(ComponentListener l, ComponentListener oldl) {

    /**
     * Removes the old component-listener from component-listener-l and
     * returns the resulting multicast listener.
     * @param l component-listener-l
     * @param oldl the component-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseWheelListener add(MouseWheelListener a,
                                         MouseWheelListener b) {

    /**
     * Adds mouse-wheel-listener-a with mouse-wheel-listener-b and
     * returns the resulting multicast listener.
     * @param a mouse-wheel-listener-a
     * @param b mouse-wheel-listener-b
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
     public static HierarchyBoundsListener add(HierarchyBoundsListener a, HierarchyBoundsListener b) {

    /**
     * Adds hierarchy-bounds-listener-a with hierarchy-bounds-listener-b and
     * returns the resulting multicast listener.
     * @param a hierarchy-bounds-listener-a
     * @param b hierarchy-bounds-listener-b
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
     public static HierarchyListener add(HierarchyListener a, HierarchyListener b) {

    /**
     * Adds hierarchy-listener-a with hierarchy-listener-b and
     * returns the resulting multicast listener.
     * @param a hierarchy-listener-a
     * @param b hierarchy-listener-b
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
     public static InputMethodListener add(InputMethodListener a, InputMethodListener b) {

    /**
     * Adds input-method-listener-a with input-method-listener-b and
     * returns the resulting multicast listener.
     * @param a input-method-listener-a
     * @param b input-method-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static AdjustmentListener add(AdjustmentListener a, AdjustmentListener b) {

    /**
     * Adds adjustment-listener-a with adjustment-listener-b and
     * returns the resulting multicast listener.
     * @param a adjustment-listener-a
     * @param b adjustment-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ItemListener add(ItemListener a, ItemListener b) {

    /**
     * Adds item-listener-a with item-listener-b and
     * returns the resulting multicast listener.
     * @param a item-listener-a
     * @param b item-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ActionListener add(ActionListener a, ActionListener b) {

    /**
     * Adds action-listener-a with action-listener-b and
     * returns the resulting multicast listener.
     * @param a action-listener-a
     * @param b action-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowFocusListener add(WindowFocusListener a,
                                          WindowFocusListener b) {

    /**
     * Adds window-focus-listener-a with window-focus-listener-b
     * and returns the resulting multicast listener.
     * @param a window-focus-listener-a
     * @param b window-focus-listener-b
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowStateListener add(WindowStateListener a,
                                          WindowStateListener b) {

    /**
     * Adds window-state-listener-a with window-state-listener-b
     * and returns the resulting multicast listener.
     * @param a window-state-listener-a
     * @param b window-state-listener-b
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowListener add(WindowListener a, WindowListener b) {

    /**
     * Adds window-listener-a with window-listener-b and
     * returns the resulting multicast listener.
     * @param a window-listener-a
     * @param b window-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseMotionListener add(MouseMotionListener a, MouseMotionListener b) {

    /**
     * Adds mouse-motion-listener-a with mouse-motion-listener-b and
     * returns the resulting multicast listener.
     * @param a mouse-motion-listener-a
     * @param b mouse-motion-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseListener add(MouseListener a, MouseListener b) {

    /**
     * Adds mouse-listener-a with mouse-listener-b and
     * returns the resulting multicast listener.
     * @param a mouse-listener-a
     * @param b mouse-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static KeyListener add(KeyListener a, KeyListener b) {

    /**
     * Adds key-listener-a with key-listener-b and
     * returns the resulting multicast listener.
     * @param a key-listener-a
     * @param b key-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static FocusListener add(FocusListener a, FocusListener b) {

    /**
     * Adds focus-listener-a with focus-listener-b and
     * returns the resulting multicast listener.
     * @param a focus-listener-a
     * @param b focus-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ContainerListener add(ContainerListener a, ContainerListener b) {

    /**
     * Adds container-listener-a with container-listener-b and
     * returns the resulting multicast listener.
     * @param a container-listener-a
     * @param b container-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ComponentListener add(ComponentListener a, ComponentListener b) {

    /**
     * Adds component-listener-a with component-listener-b and
     * returns the resulting multicast listener.
     * @param a component-listener-a
     * @param b component-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseWheelMoved(MouseWheelEvent e) {

    /**
     * Handles the mouseWheelMoved event by invoking the
     * mouseWheelMoved methods on listener-a and listener-b.
     * @param e the mouse event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void ancestorResized(HierarchyEvent e) {

    /**
     * Handles the ancestorResized event by invoking the
     * ancestorResized methods on listener-a and listener-b.
     * @param e the item event
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void ancestorMoved(HierarchyEvent e) {

    /**
     * Handles the ancestorMoved event by invoking the
     * ancestorMoved methods on listener-a and listener-b.
     * @param e the item event
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void hierarchyChanged(HierarchyEvent e) {

    /**
     * Handles the hierarchyChanged event by invoking the
     * hierarchyChanged methods on listener-a and listener-b.
     * @param e the item event
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void caretPositionChanged(InputMethodEvent e) {

    /**
     * Handles the caretPositionChanged event by invoking the
     * caretPositionChanged methods on listener-a and listener-b.
     * @param e the item event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void inputMethodTextChanged(InputMethodEvent e) {

    /**
     * Handles the inputMethodTextChanged event by invoking the
     * inputMethodTextChanged methods on listener-a and listener-b.
     * @param e the item event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void adjustmentValueChanged(AdjustmentEvent e) {

    /**
     * Handles the adjustmentValueChanged event by invoking the
     * adjustmentValueChanged methods on listener-a and listener-b.
     * @param e the adjustment event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void itemStateChanged(ItemEvent e) {

    /**
     * Handles the itemStateChanged event by invoking the
     * itemStateChanged methods on listener-a and listener-b.
     * @param e the item event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void actionPerformed(ActionEvent e) {

    /**
     * Handles the actionPerformed event by invoking the
     * actionPerformed methods on listener-a and listener-b.
     * @param e the action event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowLostFocus(WindowEvent e) {

    /**
     * Handles the windowLostFocus event by invoking the windowLostFocus
     * methods on listener-a and listener-b.
     * @param e the window event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowGainedFocus(WindowEvent e) {

    /**
     * Handles the windowGainedFocus event by invoking the windowGainedFocus
     * methods on listener-a and listener-b.
     * @param e the window event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowStateChanged(WindowEvent e) {

    /**
     * Handles the windowStateChanged event by invoking the
     * windowStateChanged methods on listener-a and listener-b.
     * @param e the window event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowDeactivated(WindowEvent e) {

    /**
     * Handles the windowDeactivated event by invoking the
     * windowDeactivated methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowActivated(WindowEvent e) {

    /**
     * Handles the windowActivated event by invoking the
     * windowActivated methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowDeiconified(WindowEvent e) {

    /**
     * Handles the windowDeiconfied event by invoking the
     * windowDeiconified methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowIconified(WindowEvent e) {

    /**
     * Handles the windowIconified event by invoking the
     * windowIconified methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowClosed(WindowEvent e) {

    /**
     * Handles the windowClosed event by invoking the
     * windowClosed methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowClosing(WindowEvent e) {

    /**
     * Handles the windowClosing event by invoking the
     * windowClosing methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowOpened(WindowEvent e) {

    /**
     * Handles the windowOpened event by invoking the
     * windowOpened methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseMoved(MouseEvent e) {

    /**
     * Handles the mouseMoved event by invoking the
     * mouseMoved methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseDragged(MouseEvent e) {

    /**
     * Handles the mouseDragged event by invoking the
     * mouseDragged methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseExited(MouseEvent e) {

    /**
     * Handles the mouseExited event by invoking the
     * mouseExited methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseEntered(MouseEvent e) {

    /**
     * Handles the mouseEntered event by invoking the
     * mouseEntered methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseReleased(MouseEvent e) {

    /**
     * Handles the mouseReleased event by invoking the
     * mouseReleased methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mousePressed(MouseEvent e) {

    /**
     * Handles the mousePressed event by invoking the
     * mousePressed methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseClicked(MouseEvent e) {

    /**
     * Handles the mouseClicked event by invoking the
     * mouseClicked methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void keyReleased(KeyEvent e) {

    /**
     * Handles the keyReleased event by invoking the
     * keyReleased methods on listener-a and listener-b.
     * @param e the key event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void keyPressed(KeyEvent e) {

    /**
     * Handles the keyPressed event by invoking the
     * keyPressed methods on listener-a and listener-b.
     * @param e the key event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void keyTyped(KeyEvent e) {

    /**
     * Handles the keyTyped event by invoking the
     * keyTyped methods on listener-a and listener-b.
     * @param e the key event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void focusLost(FocusEvent e) {

    /**
     * Handles the focusLost event by invoking the
     * focusLost methods on listener-a and listener-b.
     * @param e the focus event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void focusGained(FocusEvent e) {

    /**
     * Handles the focusGained event by invoking the
     * focusGained methods on listener-a and listener-b.
     * @param e the focus event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentRemoved(ContainerEvent e) {

    /**
     * Handles the componentRemoved container event by invoking the
     * componentRemoved methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentAdded(ContainerEvent e) {

    /**
     * Handles the componentAdded container event by invoking the
     * componentAdded methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentHidden(ComponentEvent e) {

    /**
     * Handles the componentHidden event by invoking the
     * componentHidden methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentShown(ComponentEvent e) {

    /**
     * Handles the componentShown event by invoking the
     * componentShown methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentMoved(ComponentEvent e) {

    /**
     * Handles the componentMoved event by invoking the
     * componentMoved methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentResized(ComponentEvent e) {

    /**
     * Handles the componentResized event by invoking the
     * componentResized methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    protected EventListener remove(EventListener oldl) {

    /**
     * Removes a listener from this multicaster.
     * <p>
     * The returned multicaster contains all the listeners in this
     * multicaster with the exception of all occurrences of {@code oldl}.
     * If the resulting multicaster contains only one regular listener
     * the regular listener may be returned.  If the resulting multicaster
     * is empty, then {@code null} may be returned instead.
     * <p>
     * No exception is thrown if {@code oldl} is {@code null}.
     *
     * @param oldl the listener to be removed
     * @return resulting listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    protected AWTEventMulticaster(EventListener a, EventListener b) {

    /**
     * Creates an event multicaster instance which chains listener-a
     * with listener-b. Input parameters <code>a</code> and <code>b</code>
     * should not be <code>null</code>, though implementations may vary in
     * choosing whether or not to throw <code>NullPointerException</code>
     * in that case.
     * @param a listener-a
     * @param b listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
public class AWTEventMulticaster implements

/**
 * {@code AWTEventMulticaster} implements efficient and thread-safe multi-cast
 * event dispatching for the AWT events defined in the {@code java.awt.event}
 * package.
 * <p>
 * The following example illustrates how to use this class:
 *
 * <pre><code>
 * public myComponent extends Component {
 *     ActionListener actionListener = null;
 *
 *     public synchronized void addActionListener(ActionListener l) {
 *         actionListener = AWTEventMulticaster.add(actionListener, l);
 *     }
 *     public synchronized void removeActionListener(ActionListener l) {
 *         actionListener = AWTEventMulticaster.remove(actionListener, l);
 *     }
 *     public void processEvent(AWTEvent e) {
 *         // when event occurs which causes "action" semantic
 *         ActionListener listener = actionListener;
 *         if (listener != null) {
 *             listener.actionPerformed(new ActionEvent());
 *         }
 *     }
 * }
 * </code></pre>
 * The important point to note is the first argument to the {@code
 * add} and {@code remove} methods is the field maintaining the
 * listeners. In addition you must assign the result of the {@code add}
 * and {@code remove} methods to the field maintaining the listeners.
 * <p>
 * {@code AWTEventMulticaster} is implemented as a pair of {@code
 * EventListeners} that are set at construction time. {@code
 * AWTEventMulticaster} is immutable. The {@code add} and {@code
 * remove} methods do not alter {@code AWTEventMulticaster} in
 * anyway. If necessary, a new {@code AWTEventMulticaster} is
 * created. In this way it is safe to add and remove listeners during
 * the process of an event dispatching.  However, event listeners
 * added during the process of an event dispatch operation are not
 * notified of the event currently being dispatched.
 * <p>
 * All of the {@code add} methods allow {@code null} arguments. If the
 * first argument is {@code null}, the second argument is returned. If
 * the first argument is not {@code null} and the second argument is
 * {@code null}, the first argument is returned. If both arguments are
 * {@code non-null}, a new {@code AWTEventMulticaster} is created using
 * the two arguments and returned.
 * <p>
 * For the {@code remove} methods that take two arguments, the following is
 * returned:
 * <ul>
 *   <li>{@code null}, if the first argument is {@code null}, or
 *       the arguments are equal, by way of {@code ==}.
 *   <li>the first argument, if the first argument is not an instance of
 *       {@code AWTEventMulticaster}.
 *   <li>result of invoking {@code remove(EventListener)} on the
 *       first argument, supplying the second argument to the
 *       {@code remove(EventListener)} method.
 * </ul>
 * <p>Swing makes use of
 * {@link javax.swing.event.EventListenerList EventListenerList} for
 * similar logic. Refer to it for details.
 *
 * @see javax.swing.event.EventListenerList
 *
 * @author      John Rose
 * @author      Amy Fowler
 * @since       1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    @SuppressWarnings("unchecked")

    /**
     * Returns an array of all the objects chained as
     * <code><em>Foo</em>Listener</code>s by the specified
     * <code>java.util.EventListener</code>.
     * <code><em>Foo</em>Listener</code>s are chained by the
     * <code>AWTEventMulticaster</code> using the
     * <code>add<em>Foo</em>Listener</code> method.
     * If a <code>null</code> listener is specified, this method returns an
     * empty array. If the specified listener is not an instance of
     * <code>AWTEventMulticaster</code>, this method returns an array which
     * contains only the specified listener. If no such listeners are chained,
     * this method returns an empty array.
     *
     * @param l the specified <code>java.util.EventListener</code>
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects chained as
     *          <code><em>Foo</em>Listener</code>s by the specified multicast
     *          listener, or an empty array if no such listeners have been
     *          chained by the specified multicast listener
     * @exception NullPointerException if the specified
     *             {@code listenertype} parameter is {@code null}
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    protected static EventListener removeInternal(EventListener l, EventListener oldl) {

    /**
     * Returns the resulting multicast listener after removing the
     * old listener from listener-l.
     * If listener-l equals the old listener OR listener-l is null,
     * returns null.
     * Else if listener-l is an instance of AWTEventMulticaster,
     * then it removes the old listener from it.
     * Else, returns listener l.
     * @param l the listener being removed from
     * @param oldl the listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    protected static EventListener addInternal(EventListener a, EventListener b) {

    /**
     * Returns the resulting multicast listener from adding listener-a
     * and listener-b together.
     * If listener-a is null, it returns listener-b;
     * If listener-b is null, it returns listener-a
     * If neither are null, then it creates and returns
     * a new AWTEventMulticaster instance which chains a with b.
     * @param a event listener-a
     * @param b event listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseWheelListener remove(MouseWheelListener l,
                                            MouseWheelListener oldl) {

    /**
     * Removes the old mouse-wheel-listener from mouse-wheel-listener-l
     * and returns the resulting multicast listener.
     * @param l mouse-wheel-listener-l
     * @param oldl the mouse-wheel-listener being removed
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static HierarchyBoundsListener remove(HierarchyBoundsListener l, HierarchyBoundsListener oldl) {

    /**
     * Removes the old hierarchy-bounds-listener from
     * hierarchy-bounds-listener-l and returns the resulting multicast
     * listener.
     * @param l hierarchy-bounds-listener-l
     * @param oldl the hierarchy-bounds-listener being removed
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static HierarchyListener remove(HierarchyListener l, HierarchyListener oldl) {

    /**
     * Removes the old hierarchy-listener from hierarchy-listener-l and
     * returns the resulting multicast listener.
     * @param l hierarchy-listener-l
     * @param oldl the hierarchy-listener being removed
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static InputMethodListener remove(InputMethodListener l, InputMethodListener oldl) {

    /**
     * Removes the old input-method-listener from input-method-listener-l and
     * returns the resulting multicast listener.
     * @param l input-method-listener-l
     * @param oldl the input-method-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static AdjustmentListener remove(AdjustmentListener l, AdjustmentListener oldl) {

    /**
     * Removes the old adjustment-listener from adjustment-listener-l and
     * returns the resulting multicast listener.
     * @param l adjustment-listener-l
     * @param oldl the adjustment-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ItemListener remove(ItemListener l, ItemListener oldl) {

    /**
     * Removes the old item-listener from item-listener-l and
     * returns the resulting multicast listener.
     * @param l item-listener-l
     * @param oldl the item-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ActionListener remove(ActionListener l, ActionListener oldl) {

    /**
     * Removes the old action-listener from action-listener-l and
     * returns the resulting multicast listener.
     * @param l action-listener-l
     * @param oldl the action-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowFocusListener remove(WindowFocusListener l,
                                             WindowFocusListener oldl) {

    /**
     * Removes the old window-focus-listener from window-focus-listener-l
     * and returns the resulting multicast listener.
     * @param l window-focus-listener-l
     * @param oldl the window-focus-listener being removed
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowStateListener remove(WindowStateListener l,
                                             WindowStateListener oldl) {

    /**
     * Removes the old window-state-listener from window-state-listener-l
     * and returns the resulting multicast listener.
     * @param l window-state-listener-l
     * @param oldl the window-state-listener being removed
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowListener remove(WindowListener l, WindowListener oldl) {

    /**
     * Removes the old window-listener from window-listener-l and
     * returns the resulting multicast listener.
     * @param l window-listener-l
     * @param oldl the window-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseMotionListener remove(MouseMotionListener l, MouseMotionListener oldl) {

    /**
     * Removes the old mouse-motion-listener from mouse-motion-listener-l
     * and returns the resulting multicast listener.
     * @param l mouse-motion-listener-l
     * @param oldl the mouse-motion-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseListener remove(MouseListener l, MouseListener oldl) {

    /**
     * Removes the old mouse-listener from mouse-listener-l and
     * returns the resulting multicast listener.
     * @param l mouse-listener-l
     * @param oldl the mouse-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static KeyListener remove(KeyListener l, KeyListener oldl) {

    /**
     * Removes the old key-listener from key-listener-l and
     * returns the resulting multicast listener.
     * @param l key-listener-l
     * @param oldl the key-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static FocusListener remove(FocusListener l, FocusListener oldl) {

    /**
     * Removes the old focus-listener from focus-listener-l and
     * returns the resulting multicast listener.
     * @param l focus-listener-l
     * @param oldl the focus-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ContainerListener remove(ContainerListener l, ContainerListener oldl) {

    /**
     * Removes the old container-listener from container-listener-l and
     * returns the resulting multicast listener.
     * @param l container-listener-l
     * @param oldl the container-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ComponentListener remove(ComponentListener l, ComponentListener oldl) {

    /**
     * Removes the old component-listener from component-listener-l and
     * returns the resulting multicast listener.
     * @param l component-listener-l
     * @param oldl the component-listener being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseWheelListener add(MouseWheelListener a,
                                         MouseWheelListener b) {

    /**
     * Adds mouse-wheel-listener-a with mouse-wheel-listener-b and
     * returns the resulting multicast listener.
     * @param a mouse-wheel-listener-a
     * @param b mouse-wheel-listener-b
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
     public static HierarchyBoundsListener add(HierarchyBoundsListener a, HierarchyBoundsListener b) {

    /**
     * Adds hierarchy-bounds-listener-a with hierarchy-bounds-listener-b and
     * returns the resulting multicast listener.
     * @param a hierarchy-bounds-listener-a
     * @param b hierarchy-bounds-listener-b
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
     public static HierarchyListener add(HierarchyListener a, HierarchyListener b) {

    /**
     * Adds hierarchy-listener-a with hierarchy-listener-b and
     * returns the resulting multicast listener.
     * @param a hierarchy-listener-a
     * @param b hierarchy-listener-b
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
     public static InputMethodListener add(InputMethodListener a, InputMethodListener b) {

    /**
     * Adds input-method-listener-a with input-method-listener-b and
     * returns the resulting multicast listener.
     * @param a input-method-listener-a
     * @param b input-method-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static AdjustmentListener add(AdjustmentListener a, AdjustmentListener b) {

    /**
     * Adds adjustment-listener-a with adjustment-listener-b and
     * returns the resulting multicast listener.
     * @param a adjustment-listener-a
     * @param b adjustment-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ItemListener add(ItemListener a, ItemListener b) {

    /**
     * Adds item-listener-a with item-listener-b and
     * returns the resulting multicast listener.
     * @param a item-listener-a
     * @param b item-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ActionListener add(ActionListener a, ActionListener b) {

    /**
     * Adds action-listener-a with action-listener-b and
     * returns the resulting multicast listener.
     * @param a action-listener-a
     * @param b action-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowFocusListener add(WindowFocusListener a,
                                          WindowFocusListener b) {

    /**
     * Adds window-focus-listener-a with window-focus-listener-b
     * and returns the resulting multicast listener.
     * @param a window-focus-listener-a
     * @param b window-focus-listener-b
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowStateListener add(WindowStateListener a,
                                          WindowStateListener b) {

    /**
     * Adds window-state-listener-a with window-state-listener-b
     * and returns the resulting multicast listener.
     * @param a window-state-listener-a
     * @param b window-state-listener-b
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static WindowListener add(WindowListener a, WindowListener b) {

    /**
     * Adds window-listener-a with window-listener-b and
     * returns the resulting multicast listener.
     * @param a window-listener-a
     * @param b window-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseMotionListener add(MouseMotionListener a, MouseMotionListener b) {

    /**
     * Adds mouse-motion-listener-a with mouse-motion-listener-b and
     * returns the resulting multicast listener.
     * @param a mouse-motion-listener-a
     * @param b mouse-motion-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static MouseListener add(MouseListener a, MouseListener b) {

    /**
     * Adds mouse-listener-a with mouse-listener-b and
     * returns the resulting multicast listener.
     * @param a mouse-listener-a
     * @param b mouse-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static KeyListener add(KeyListener a, KeyListener b) {

    /**
     * Adds key-listener-a with key-listener-b and
     * returns the resulting multicast listener.
     * @param a key-listener-a
     * @param b key-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static FocusListener add(FocusListener a, FocusListener b) {

    /**
     * Adds focus-listener-a with focus-listener-b and
     * returns the resulting multicast listener.
     * @param a focus-listener-a
     * @param b focus-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ContainerListener add(ContainerListener a, ContainerListener b) {

    /**
     * Adds container-listener-a with container-listener-b and
     * returns the resulting multicast listener.
     * @param a container-listener-a
     * @param b container-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public static ComponentListener add(ComponentListener a, ComponentListener b) {

    /**
     * Adds component-listener-a with component-listener-b and
     * returns the resulting multicast listener.
     * @param a component-listener-a
     * @param b component-listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseWheelMoved(MouseWheelEvent e) {

    /**
     * Handles the mouseWheelMoved event by invoking the
     * mouseWheelMoved methods on listener-a and listener-b.
     * @param e the mouse event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void ancestorResized(HierarchyEvent e) {

    /**
     * Handles the ancestorResized event by invoking the
     * ancestorResized methods on listener-a and listener-b.
     * @param e the item event
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void ancestorMoved(HierarchyEvent e) {

    /**
     * Handles the ancestorMoved event by invoking the
     * ancestorMoved methods on listener-a and listener-b.
     * @param e the item event
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void hierarchyChanged(HierarchyEvent e) {

    /**
     * Handles the hierarchyChanged event by invoking the
     * hierarchyChanged methods on listener-a and listener-b.
     * @param e the item event
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void caretPositionChanged(InputMethodEvent e) {

    /**
     * Handles the caretPositionChanged event by invoking the
     * caretPositionChanged methods on listener-a and listener-b.
     * @param e the item event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void inputMethodTextChanged(InputMethodEvent e) {

    /**
     * Handles the inputMethodTextChanged event by invoking the
     * inputMethodTextChanged methods on listener-a and listener-b.
     * @param e the item event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void adjustmentValueChanged(AdjustmentEvent e) {

    /**
     * Handles the adjustmentValueChanged event by invoking the
     * adjustmentValueChanged methods on listener-a and listener-b.
     * @param e the adjustment event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void itemStateChanged(ItemEvent e) {

    /**
     * Handles the itemStateChanged event by invoking the
     * itemStateChanged methods on listener-a and listener-b.
     * @param e the item event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void actionPerformed(ActionEvent e) {

    /**
     * Handles the actionPerformed event by invoking the
     * actionPerformed methods on listener-a and listener-b.
     * @param e the action event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowLostFocus(WindowEvent e) {

    /**
     * Handles the windowLostFocus event by invoking the windowLostFocus
     * methods on listener-a and listener-b.
     * @param e the window event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowGainedFocus(WindowEvent e) {

    /**
     * Handles the windowGainedFocus event by invoking the windowGainedFocus
     * methods on listener-a and listener-b.
     * @param e the window event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowStateChanged(WindowEvent e) {

    /**
     * Handles the windowStateChanged event by invoking the
     * windowStateChanged methods on listener-a and listener-b.
     * @param e the window event
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowDeactivated(WindowEvent e) {

    /**
     * Handles the windowDeactivated event by invoking the
     * windowDeactivated methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowActivated(WindowEvent e) {

    /**
     * Handles the windowActivated event by invoking the
     * windowActivated methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowDeiconified(WindowEvent e) {

    /**
     * Handles the windowDeiconfied event by invoking the
     * windowDeiconified methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowIconified(WindowEvent e) {

    /**
     * Handles the windowIconified event by invoking the
     * windowIconified methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowClosed(WindowEvent e) {

    /**
     * Handles the windowClosed event by invoking the
     * windowClosed methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowClosing(WindowEvent e) {

    /**
     * Handles the windowClosing event by invoking the
     * windowClosing methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void windowOpened(WindowEvent e) {

    /**
     * Handles the windowOpened event by invoking the
     * windowOpened methods on listener-a and listener-b.
     * @param e the window event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseMoved(MouseEvent e) {

    /**
     * Handles the mouseMoved event by invoking the
     * mouseMoved methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseDragged(MouseEvent e) {

    /**
     * Handles the mouseDragged event by invoking the
     * mouseDragged methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseExited(MouseEvent e) {

    /**
     * Handles the mouseExited event by invoking the
     * mouseExited methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseEntered(MouseEvent e) {

    /**
     * Handles the mouseEntered event by invoking the
     * mouseEntered methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseReleased(MouseEvent e) {

    /**
     * Handles the mouseReleased event by invoking the
     * mouseReleased methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mousePressed(MouseEvent e) {

    /**
     * Handles the mousePressed event by invoking the
     * mousePressed methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void mouseClicked(MouseEvent e) {

    /**
     * Handles the mouseClicked event by invoking the
     * mouseClicked methods on listener-a and listener-b.
     * @param e the mouse event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void keyReleased(KeyEvent e) {

    /**
     * Handles the keyReleased event by invoking the
     * keyReleased methods on listener-a and listener-b.
     * @param e the key event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void keyPressed(KeyEvent e) {

    /**
     * Handles the keyPressed event by invoking the
     * keyPressed methods on listener-a and listener-b.
     * @param e the key event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void keyTyped(KeyEvent e) {

    /**
     * Handles the keyTyped event by invoking the
     * keyTyped methods on listener-a and listener-b.
     * @param e the key event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void focusLost(FocusEvent e) {

    /**
     * Handles the focusLost event by invoking the
     * focusLost methods on listener-a and listener-b.
     * @param e the focus event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void focusGained(FocusEvent e) {

    /**
     * Handles the focusGained event by invoking the
     * focusGained methods on listener-a and listener-b.
     * @param e the focus event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentRemoved(ContainerEvent e) {

    /**
     * Handles the componentRemoved container event by invoking the
     * componentRemoved methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentAdded(ContainerEvent e) {

    /**
     * Handles the componentAdded container event by invoking the
     * componentAdded methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentHidden(ComponentEvent e) {

    /**
     * Handles the componentHidden event by invoking the
     * componentHidden methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentShown(ComponentEvent e) {

    /**
     * Handles the componentShown event by invoking the
     * componentShown methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentMoved(ComponentEvent e) {

    /**
     * Handles the componentMoved event by invoking the
     * componentMoved methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    public void componentResized(ComponentEvent e) {

    /**
     * Handles the componentResized event by invoking the
     * componentResized methods on listener-a and listener-b.
     * @param e the component event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    protected EventListener remove(EventListener oldl) {

    /**
     * Removes a listener from this multicaster.
     * <p>
     * The returned multicaster contains all the listeners in this
     * multicaster with the exception of all occurrences of {@code oldl}.
     * If the resulting multicaster contains only one regular listener
     * the regular listener may be returned.  If the resulting multicaster
     * is empty, then {@code null} may be returned instead.
     * <p>
     * No exception is thrown if {@code oldl} is {@code null}.
     *
     * @param oldl the listener to be removed
     * @return resulting listener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
    protected AWTEventMulticaster(EventListener a, EventListener b) {

    /**
     * Creates an event multicaster instance which chains listener-a
     * with listener-b. Input parameters <code>a</code> and <code>b</code>
     * should not be <code>null</code>, though implementations may vary in
     * choosing whether or not to throw <code>NullPointerException</code>
     * in that case.
     * @param a listener-a
     * @param b listener-b
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/AWTEventMulticaster.java
public class AWTEventMulticaster implements

/**
 * {@code AWTEventMulticaster} implements efficient and thread-safe multi-cast
 * event dispatching for the AWT events defined in the {@code java.awt.event}
 * package.
 * <p>
 * The following example illustrates how to use this class:
 *
 * <pre><code>
 * public myComponent extends Component {
 *     ActionListener actionListener = null;
 *
 *     public synchronized void addActionListener(ActionListener l) {
 *         actionListener = AWTEventMulticaster.add(actionListener, l);
 *     }
 *     public synchronized void removeActionListener(ActionListener l) {
 *         actionListener = AWTEventMulticaster.remove(actionListener, l);
 *     }
 *     public void processEvent(AWTEvent e) {
 *         // when event occurs which causes "action" semantic
 *         ActionListener listener = actionListener;
 *         if (listener != null) {
 *             listener.actionPerformed(new ActionEvent());
 *         }
 *     }
 * }
 * </code></pre>
 * The important point to note is the first argument to the {@code
 * add} and {@code remove} methods is the field maintaining the
 * listeners. In addition you must assign the result of the {@code add}
 * and {@code remove} methods to the field maintaining the listeners.
 * <p>
 * {@code AWTEventMulticaster} is implemented as a pair of {@code
 * EventListeners} that are set at construction time. {@code
 * AWTEventMulticaster} is immutable. The {@code add} and {@code
 * remove} methods do not alter {@code AWTEventMulticaster} in
 * anyway. If necessary, a new {@code AWTEventMulticaster} is
 * created. In this way it is safe to add and remove listeners during
 * the process of an event dispatching.  However, event listeners
 * added during the process of an event dispatch operation are not
 * notified of the event currently being dispatched.
 * <p>
 * All of the {@code add} methods allow {@code null} arguments. If the
 * first argument is {@code null}, the second argument is returned. If
 * the first argument is not {@code null} and the second argument is
 * {@code null}, the first argument is returned. If both arguments are
 * {@code non-null}, a new {@code AWTEventMulticaster} is created using
 * the two arguments and returned.
 * <p>
 * For the {@code remove} methods that take two arguments, the following is
 * returned:
 * <ul>
 *   <li>{@code null}, if the first argument is {@code null}, or
 *       the arguments are equal, by way of {@code ==}.
 *   <li>the first argument, if the first argument is not an instance of
 *       {@code AWTEventMulticaster}.
 *   <li>result of invoking {@code remove(EventListener)} on the
 *       first argument, supplying the second argument to the
 *       {@code remove(EventListener)} method.
 * </ul>
 * <p>Swing makes use of
 * {@link javax.swing.event.EventListenerList EventListenerList} for
 * similar logic. Refer to it for details.
 *
 * @see javax.swing.event.EventListenerList
 *
 * @author      John Rose
 * @author      Amy Fowler
 * @since       1.1
 */
