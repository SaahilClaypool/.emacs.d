_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static final long PROXY_EVENT_MASK =

    /**
     * The kind of events routed to lightweight components from windowed
     * hosts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private long eventMask;

    /**
     * The event mask for contained lightweight components.  Lightweight
     * components need a windowed container to host window-related
     * events.  This separate mask indicates events that have been
     * requested by contained lightweight components without effecting
     * the mask of the windowed component itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Cursor nativeCursor;

    /**
     * This variable is not used, but kept for serialization compatibility
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient boolean isMouseDTInNativeContainer = false;

    /**
     * Is DnD over the native container.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient boolean isMouseInNativeContainer = false;

    /**
     * Is the mouse over the native container.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient  WeakReference<Component> targetLastEnteredDT;

    /**
     * The last component entered by the {@code SunDropTargetEvent}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient  WeakReference<Component> targetLastEntered;

    /**
     * The last component entered by the {@code MouseEvent}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient WeakReference<Component> mouseEventTarget;

    /**
     * The current subcomponent being hosted by this windowed
     * component that has events being forwarded to it.  If this
     * is null, there are currently no events being forwarded to
     * a subcomponent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Component focus;

    /**
     * This variable is not used, but kept for serialization compatibility
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Container nativeContainer;

    /**
     * The windowed container that might be hosting events for
     * subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void retargetMouseEvent(Component target, int id, MouseEvent e) {

    /**
     * Sends a mouse event to the current mouse event recipient using
     * the given event (sent to the windowed host) as a srcEvent.  If
     * the mouse event target is still in the component tree, the
     * coordinates of the event are translated to those of the target.
     * If the target has been removed, we don't bother to send the
     * message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean processMouseEvent(MouseEvent e) {

    /**
     * This method attempts to distribute a mouse event to a lightweight
     * component.  It tries to avoid doing any unnecessary probes down
     * into the component tree to minimize the overhead of determining
     * where to route the event, since mouse movement events tend to
     * come in large and frequent amounts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    boolean dispatchEvent(AWTEvent e) {

    /**
     * Dispatches an event to a sub-component if necessary, and
     * returns whether or not the event was forwarded to a
     * sub-component.
     *
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void enableEvents(long events) {

    /**
     * Enables events to subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
class LightweightDispatcher implements java.io.Serializable, AWTEventListener {

/**
 * Class to manage the dispatching of MouseEvents to the lightweight descendants
 * and SunDropTargetEvents to both lightweight and heavyweight descendants
 * contained by a native container.
 *
 * NOTE: the class name is not appropriate anymore, but we cannot change it
 * because we must keep serialization compatibility.
 *
 * @author Timothy Prinzing
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final boolean isRecursivelyVisibleUpToHeavyweightContainer() {

    /**
     * Checks if the container and its direct lightweight containers are
     * visible.
     *
     * Consider the heavyweight container hides or shows the HW descendants
     * automatically. Therefore we care of LW containers' visibility only.
     *
     * This method MUST be invoked under the TreeLock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Accessible getAccessibleChild(int i) {

    /**
     * Returns the nth <code>Accessible</code> child of the object.
     *
     * @param i zero-based index of child
     * @return the nth <code>Accessible</code> child of the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    int getAccessibleChildrenCount() {

    /**
     * Returns the number of accessible children in the object.  If all
     * of the children of this object implement <code>Accessible</code>,
     * then this method should return the number of children of this object.
     *
     * @return the number of accessible children in the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Accessible getAccessibleAt(Point p) {

    /**
     * Returns the <code>Accessible</code> child contained at the local
     * coordinate <code>Point</code>, if one exists.  Otherwise
     * returns <code>null</code>.
     *
     * @param p the point defining the top-left corner of the
     *    <code>Accessible</code>, given in the coordinate space
     *    of the object's parent
     * @return the <code>Accessible</code> at the specified location,
     *    if it exists; otherwise <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        public void removePropertyChangeListener(PropertyChangeListener listener) {

        /**
         * Remove a PropertyChangeListener from the listener list.
         * This removes a PropertyChangeListener that was registered
         * for all properties.
         *
         * @param listener the PropertyChangeListener to be removed
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        public void addPropertyChangeListener(PropertyChangeListener listener) {

        /**
         * Adds a PropertyChangeListener to the listener list.
         *
         * @param listener  the PropertyChangeListener to be added
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        protected class AccessibleContainerHandler

        /**
         * Fire <code>PropertyChange</code> listener, if one is registered,
         * when children are added or removed.
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        private volatile transient int propertyListenersCount = 0;

        /**
         * Number of PropertyChangeListener objects registered. It's used
         * to add/remove ContainerListener to track target Container's state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth <code>Accessible</code> child of the object.
         *
         * @param i zero-based index of child
         * @return the nth <code>Accessible</code> child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement <code>Accessible</code>,
         * then this method should return the number of children of this object.
         *
         * @return the number of accessible children in the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        private static final long serialVersionUID = 5081320404842566097L;

        /**
         * JDK1.3 serialVersionUID
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected class AccessibleAWTContainer extends AccessibleAWTComponent {

    /**
     * Inner class of Container used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by container developers.
     * <p>
     * The class used to obtain the accessible role for this object,
     * as well as implementing many of the methods in the
     * AccessibleContainer interface.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void readObject(ObjectInputStream s)

    /**
     * Deserializes this <code>Container</code> from the specified
     * <code>ObjectInputStream</code>.
     * <ul>
     *    <li>Reads default serializable fields from the stream.</li>
     *    <li>Reads a list of serializable ContainerListener(s) as optional
     *        data. If the list is null, no Listeners are installed.</li>
     *    <li>Reads this Container's FocusTraversalPolicy, which may be null,
     *        as optional data.</li>
     * </ul>
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @serial
     * @see #addContainerListener
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Serializes this <code>Container</code> to the specified
     * <code>ObjectOutputStream</code>.
     * <ul>
     *    <li>Writes default serializable fields to the stream.</li>
     *    <li>Writes a list of serializable ContainerListener(s) as optional
     *        data. The non-serializable ContainerListner(s) are detected and
     *        no attempt is made to serialize them.</li>
     *    <li>Write this Container's FocusTraversalPolicy if and only if it
     *        is Serializable; otherwise, <code>null</code> is written.</li>
     * </ul>
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData <code>null</code> terminated sequence of 0 or more pairs;
     *   the pair consists of a <code>String</code> and <code>Object</code>;
     *   the <code>String</code> indicates the type of object and
     *   is one of the following:
     *   <code>containerListenerK</code> indicating an
     *     <code>ContainerListener</code> object;
     *   the <code>Container</code>'s <code>FocusTraversalPolicy</code>,
     *     or <code>null</code>
     *
     * @see AWTEventMulticaster#save(java.io.ObjectOutputStream, java.lang.String, java.util.EventListener)
     * @see Container#containerListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private int containerSerializedDataVersion = 1;

    /**
     * Container Serial Data Version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void addPropertyChangeListener(String propertyName,
                                          PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following defaults:
     * <ul>
     *    <li>this Container's font ("font")</li>
     *    <li>this Container's background color ("background")</li>
     *    <li>this Container's foreground color ("foreground")</li>
     *    <li>this Container's focusability ("focusable")</li>
     *    <li>this Container's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Container's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Container's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Container's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Container's Set of DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleFocusTraversalKeys")</li>
     *    <li>this Container's focus traversal policy ("focusTraversalPolicy")
     *        </li>
     *    <li>this Container's focus-cycle-root state ("focusCycleRoot")</li>
     *    <li>this Container's focus-traversal-policy-provider state("focusTraversalPolicyProvider")</li>
     *    <li>this Container's focus-traversal-policy-provider state("focusTraversalPolicyProvider")</li>
     * </ul>
     * Note that if this Container is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName one of the property names listed above
     * @param listener the PropertyChangeListener to be added
     *
     * @see #addPropertyChangeListener(java.beans.PropertyChangeListener)
     * @see Component#removePropertyChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list. The listener is
     * registered for all bound properties of this class, including the
     * following:
     * <ul>
     *    <li>this Container's font ("font")</li>
     *    <li>this Container's background color ("background")</li>
     *    <li>this Container's foreground color ("foreground")</li>
     *    <li>this Container's focusability ("focusable")</li>
     *    <li>this Container's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Container's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Container's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Container's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Container's Set of DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleFocusTraversalKeys")</li>
     *    <li>this Container's focus traversal policy ("focusTraversalPolicy")
     *        </li>
     *    <li>this Container's focus-cycle-root state ("focusCycleRoot")</li>
     * </ul>
     * Note that if this Container is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param    listener  the PropertyChangeListener to be added
     *
     * @see Component#removePropertyChangeListener
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void applyComponentOrientation(ComponentOrientation o) {

    /**
     * Sets the <code>ComponentOrientation</code> property of this container
     * and all components contained within it.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param o the new component orientation of this container and
     *        the components contained within it.
     * @exception NullPointerException if <code>orientation</code> is null.
     * @see Component#setComponentOrientation
     * @see Component#getComponentOrientation
     * @see #invalidate
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void transferFocusDownCycle() {

    /**
     * Transfers the focus down one focus traversal cycle. If this Container is
     * a focus cycle root, then the focus owner is set to this Container's
     * default Component to focus, and the current focus cycle root is set to
     * this Container. If this Container is not a focus cycle root, then no
     * focus traversal operation occurs.
     *
     * @see       Component#requestFocus()
     * @see       #isFocusCycleRoot
     * @see       #setFocusCycleRoot
     * @since     1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public final boolean isFocusTraversalPolicyProvider() {

    /**
     * Returns whether this container provides focus traversal
     * policy. If this property is set to <code>true</code> then when
     * keyboard focus manager searches container hierarchy for focus
     * traversal policy and encounters this container before any other
     * container with this property as true or focus cycle roots then
     * its focus traversal policy will be used instead of focus cycle
     * root's policy.
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @see #setFocusCycleRoot
     * @see #setFocusTraversalPolicyProvider
     * @return <code>true</code> if this container provides focus traversal
     *         policy, <code>false</code> otherwise
     * @since 1.5
     * @beaninfo
     *        bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public final void setFocusTraversalPolicyProvider(boolean provider) {

    /**
     * Sets whether this container will be used to provide focus
     * traversal policy. Container with this property as
     * <code>true</code> will be used to acquire focus traversal policy
     * instead of closest focus cycle root ancestor.
     * @param provider indicates whether this container will be used to
     *                provide focus traversal policy
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @see #isFocusTraversalPolicyProvider
     * @since 1.5
     * @beaninfo
     *        bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isFocusCycleRoot() {

    /**
     * Returns whether this Container is the root of a focus traversal cycle.
     * Once focus enters a traversal cycle, typically it cannot leave it via
     * focus traversal unless one of the up- or down-cycle keys is pressed.
     * Normal traversal is limited to this Container, and all of this
     * Container's descendants that are not descendants of inferior focus
     * cycle roots. Note that a FocusTraversalPolicy may bend these
     * restrictions, however. For example, ContainerOrderFocusTraversalPolicy
     * supports implicit down-cycle traversal.
     *
     * @return whether this Container is the root of a focus traversal cycle
     * @see #setFocusCycleRoot
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @see ContainerOrderFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setFocusCycleRoot(boolean focusCycleRoot) {

    /**
     * Sets whether this Container is the root of a focus traversal cycle. Once
     * focus enters a traversal cycle, typically it cannot leave it via focus
     * traversal unless one of the up- or down-cycle keys is pressed. Normal
     * traversal is limited to this Container, and all of this Container's
     * descendants that are not descendants of inferior focus cycle roots. Note
     * that a FocusTraversalPolicy may bend these restrictions, however. For
     * example, ContainerOrderFocusTraversalPolicy supports implicit down-cycle
     * traversal.
     * <p>
     * The alternative way to specify the traversal order of this Container's
     * children is to make this Container a
     * <a href="doc-files/FocusSpec.html#FocusTraversalPolicyProviders">focus traversal policy provider</a>.
     *
     * @param focusCycleRoot indicates whether this Container is the root of a
     *        focus traversal cycle
     * @see #isFocusCycleRoot()
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @see ContainerOrderFocusTraversalPolicy
     * @see #setFocusTraversalPolicyProvider
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isFocusTraversalPolicySet() {

    /**
     * Returns whether the focus traversal policy has been explicitly set for
     * this Container. If this method returns <code>false</code>, this
     * Container will inherit its focus traversal policy from an ancestor.
     *
     * @return <code>true</code> if the focus traversal policy has been
     *         explicitly set for this Container; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public FocusTraversalPolicy getFocusTraversalPolicy() {

    /**
     * Returns the focus traversal policy that will manage keyboard traversal
     * of this Container's children, or null if this Container is not a focus
     * cycle root. If no traversal policy has been explicitly set for this
     * Container, then this Container's focus-cycle-root ancestor's policy is
     * returned.
     *
     * @return this Container's focus traversal policy, or null if this
     *         Container is not a focus cycle root.
     * @see #setFocusTraversalPolicy
     * @see #setFocusCycleRoot
     * @see #isFocusCycleRoot
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setFocusTraversalPolicy(FocusTraversalPolicy policy) {

    /**
     * Sets the focus traversal policy that will manage keyboard traversal of
     * this Container's children, if this Container is a focus cycle root. If
     * the argument is null, this Container inherits its policy from its focus-
     * cycle-root ancestor. If the argument is non-null, this policy will be
     * inherited by all focus-cycle-root children that have no keyboard-
     * traversal policy of their own (as will, recursively, their focus-cycle-
     * root children).
     * <p>
     * If this Container is not a focus cycle root, the policy will be
     * remembered, but will not be used or inherited by this or any other
     * Containers until this Container is made a focus cycle root.
     *
     * @param policy the new focus traversal policy for this Container
     * @see #getFocusTraversalPolicy
     * @see #setFocusCycleRoot
     * @see #isFocusCycleRoot
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean isParentOf(Component comp) {

    /**
     * Check if this component is the child of this container or its children.
     * Note: this function acquires treeLock
     * Note: this function traverses children tree only in one Window.
     * @param comp a component in test, must not be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isFocusCycleRoot(Container container) {

    /**
     * Returns whether the specified Container is the focus cycle root of this
     * Container's focus traversal cycle. Each focus traversal cycle has only
     * a single focus cycle root and each Container which is not a focus cycle
     * root belongs to only a single focus traversal cycle. Containers which
     * are focus cycle roots belong to two cycles: one rooted at the Container
     * itself, and one rooted at the Container's nearest focus-cycle-root
     * ancestor. This method will return <code>true</code> for both such
     * Containers in this case.
     *
     * @param container the Container to be tested
     * @return <code>true</code> if the specified Container is a focus-cycle-
     *         root of this Container; <code>false</code> otherwise
     * @see #isFocusCycleRoot()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean areFocusTraversalKeysSet(int id) {

    /**
     * Returns whether the Set of focus traversal keys for the given focus
     * traversal operation has been explicitly defined for this Container. If
     * this method returns <code>false</code>, this Container is inheriting the
     * Set from an ancestor, or from the current KeyboardFocusManager.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @return <code>true</code> if the the Set of focus traversal keys for the
     *         given focus traversal operation has been explicitly defined for
     *         this Component; <code>false</code> otherwise.
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Set<AWTKeyStroke> getFocusTraversalKeys(int id) {

    /**
     * Returns the Set of focus traversal keys for a given traversal operation
     * for this Container. (See
     * <code>setFocusTraversalKeys</code> for a full description of each key.)
     * <p>
     * If a Set of traversal keys has not been explicitly defined for this
     * Container, then this Container's parent's Set is returned. If no Set
     * has been explicitly defined for any of this Container's ancestors, then
     * the current KeyboardFocusManager's default Set is returned.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @return the Set of AWTKeyStrokes for the specified operation. The Set
     *         will be unmodifiable, and may be empty. null will never be
     *         returned.
     * @see #setFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#DOWN_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setFocusTraversalKeys(int id,
                                      Set<? extends AWTKeyStroke> keystrokes)

    /**
     * Sets the focus traversal keys for a given traversal operation for this
     * Container.
     * <p>
     * The default values for a Container's focus traversal keys are
     * implementation-dependent. Sun recommends that all implementations for a
     * particular native platform use the same default values. The
     * recommendations for Windows and Unix are listed below. These
     * recommendations are used in the Sun AWT implementations.
     *
     * <table border=1 summary="Recommended default values for a Container's focus traversal keys">
     * <tr>
     *    <th>Identifier</th>
     *    <th>Meaning</th>
     *    <th>Default</th>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS</td>
     *    <td>Normal forward keyboard traversal</td>
     *    <td>TAB on KEY_PRESSED, CTRL-TAB on KEY_PRESSED</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS</td>
     *    <td>Normal reverse keyboard traversal</td>
     *    <td>SHIFT-TAB on KEY_PRESSED, CTRL-SHIFT-TAB on KEY_PRESSED</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS</td>
     *    <td>Go up one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS<td>
     *    <td>Go down one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * </table>
     *
     * To disable a traversal key, use an empty Set; Collections.EMPTY_SET is
     * recommended.
     * <p>
     * Using the AWTKeyStroke API, client code can specify on which of two
     * specific KeyEvents, KEY_PRESSED or KEY_RELEASED, the focus traversal
     * operation will occur. Regardless of which KeyEvent is specified,
     * however, all KeyEvents related to the focus traversal key, including the
     * associated KEY_TYPED event, will be consumed, and will not be dispatched
     * to any Container. It is a runtime error to specify a KEY_TYPED event as
     * mapping to a focus traversal operation, or to map the same event to
     * multiple default focus traversal operations.
     * <p>
     * If a value of null is specified for the Set, this Container inherits the
     * Set from its parent. If all ancestors of this Container have null
     * specified for the Set, then the current KeyboardFocusManager's default
     * Set is used.
     * <p>
     * This method may throw a {@code ClassCastException} if any {@code Object}
     * in {@code keystrokes} is not an {@code AWTKeyStroke}.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @param keystrokes the Set of AWTKeyStroke for the specified operation
     * @see #getFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#DOWN_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS, or if keystrokes
     *         contains null, or if any keystroke represents a KEY_TYPED event,
     *         or if any keystroke already maps to another focus traversal
     *         operation for this Container
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void list(PrintWriter out, int indent) {

    /**
     * Prints out a list, starting at the specified indentation,
     * to the specified print writer.
     * <p>
     * The immediate children of the container are printed with
     * an indentation of <code>indent+1</code>.  The children
     * of those children are printed at <code>indent+2</code>
     * and so on.
     *
     * @param    out      a print writer
     * @param    indent   the number of spaces to indent
     * @throws   NullPointerException if {@code out} is {@code null}
     * @see      Component#list(java.io.PrintWriter, int)
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void list(PrintStream out, int indent) {

    /**
     * Prints a listing of this container to the specified output
     * stream. The listing starts at the specified indentation.
     * <p>
     * The immediate children of the container are printed with
     * an indentation of <code>indent+1</code>.  The children
     * of those children are printed at <code>indent+2</code>
     * and so on.
     *
     * @param    out      a print stream
     * @param    indent   the number of spaces to indent
     * @throws   NullPointerException if {@code out} is {@code null}
     * @see      Component#list(java.io.PrintStream, int)
     * @since    JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Container</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return    the parameter string of this container
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isAncestorOf(Component c) {

    /**
     * Checks if the component is contained in the component hierarchy of
     * this container.
     * @param c the component
     * @return     <code>true</code> if it is an ancestor;
     *             <code>false</code> otherwise.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void removeNotify() {

    /**
     * Makes this Container undisplayable by removing its connection
     * to its native screen resource.  Making a container undisplayable
     * will cause all of its children to be made undisplayable.
     * This method is called by the toolkit internally and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #addNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void addNotify() {

    /**
     * Makes this Container displayable by connecting it to
     * a native screen resource.  Making a container displayable will
     * cause all of its children to be made displayable.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component findComponentAt(Point p) {

    /**
     * Locates the visible child component that contains the specified
     * point.  The top-most child component is returned in the case
     * where there is overlap in the components.  If the containing child
     * component is a Container, this method will continue searching for
     * the deepest nested child component.  Components which are not
     * visible are ignored during the search.<p>
     *
     * The findComponentAt method is different from getComponentAt in
     * that getComponentAt only searches the Container's immediate
     * children; if the containing component is a Container,
     * findComponentAt will search that child to find a nested component.
     *
     * @param      p   the point.
     * @return null if the component does not contain the position.
     * If there is no child component at the requested point and the
     * point is within the bounds of the container the container itself
     * is returned.
     * @throws NullPointerException if {@code p} is {@code null}
     * @see Component#contains
     * @see #getComponentAt
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static Component getChildAt(Component comp, int x, int y,
                                        boolean ignoreEnabled) {

    /**
     * Helper method for findComponentAtImpl. Finds a child component using
     * findComponentAtImpl for Container and getComponentAt for Component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final Component findComponentAt(int x, int y, boolean ignoreEnabled) {

    /**
     * Private version of findComponentAt which has a controllable
     * behavior. Setting 'ignoreEnabled' to 'false' bypasses disabled
     * Components during the search. This behavior is used by the
     * lightweight cursor support in sun.awt.GlobalCursorManager.
     *
     * The addition of this feature is temporary, pending the
     * adoption of new, public API which exports this feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component findComponentAt(int x, int y) {

    /**
     * Locates the visible child component that contains the specified
     * position.  The top-most child component is returned in the case
     * where there is overlap in the components.  If the containing child
     * component is a Container, this method will continue searching for
     * the deepest nested child component.  Components which are not
     * visible are ignored during the search.<p>
     *
     * The findComponentAt method is different from getComponentAt in
     * that getComponentAt only searches the Container's immediate
     * children; if the containing component is a Container,
     * findComponentAt will search that child to find a nested component.
     *
     * @param x the <i>x</i> coordinate
     * @param y the <i>y</i> coordinate
     * @return null if the component does not contain the position.
     * If there is no child component at the requested point and the
     * point is within the bounds of the container the container itself
     * is returned.
     * @see Component#contains
     * @see #getComponentAt
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Point getMousePosition(boolean allowChildren) throws HeadlessException {

    /**
     * Returns the position of the mouse pointer in this <code>Container</code>'s
     * coordinate space if the <code>Container</code> is under the mouse pointer,
     * otherwise returns <code>null</code>.
     * This method is similar to {@link Component#getMousePosition()} with the exception
     * that it can take the <code>Container</code>'s children into account.
     * If <code>allowChildren</code> is <code>false</code>, this method will return
     * a non-null value only if the mouse pointer is above the <code>Container</code>
     * directly, not above the part obscured by children.
     * If <code>allowChildren</code> is <code>true</code>, this method returns
     * a non-null value if the mouse pointer is above <code>Container</code> or any
     * of its descendants.
     *
     * @exception HeadlessException if GraphicsEnvironment.isHeadless() returns true
     * @param     allowChildren true if children should be taken into account
     * @see       Component#getMousePosition
     * @return    mouse coordinates relative to this <code>Component</code>, or null
     * @since     1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component getComponentAt(Point p) {

    /**
     * Gets the component that contains the specified point.
     * @param      p   the point.
     * @return     returns the component that contains the point,
     *                 or <code>null</code> if the component does
     *                 not contain the point.
     * @see        Component#contains
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getComponentAt(int, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component getComponentAt(int x, int y) {

    /**
     * Locates the component that contains the x,y position.  The
     * top-most child component is returned in the case where there
     * is overlap in the components.  This is determined by finding
     * the component closest to the index 0 that claims to contain
     * the given point via Component.contains(), except that Components
     * which have native peers take precedence over those which do not
     * (i.e., lightweight Components).
     *
     * @param x the <i>x</i> coordinate
     * @param y the <i>y</i> coordinate
     * @return null if the component does not contain the position.
     * If there is no child component at the requested point and the
     * point is within the bounds of the container the container itself
     * is returned; otherwise the top-most child is returned.
     * @see Component#contains
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>dispatchEvent(AWTEvent e)</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void proxyEnableEvents(long events) {

    /**
     * This is called by lightweight components that want the containing
     * windowed parent to enable some kind of events on their behalf.
     * This is needed for events that are normally only dispatched to
     * windows to be accepted so that they can be forwarded downward to
     * the lightweight component that has enabled them.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Component getMouseEventTargetImpl(int x, int y, boolean includeSelf,
                                         EventTargetFilter filter,
                                         boolean searchHeavyweightChildren,
                                         boolean searchHeavyweightDescendants) {

    /**
     * A private version of getMouseEventTarget which has three additional
     * controllable behaviors. This method searches for the top-most
     * descendant of this container that contains the given coordinates
     * and is accepted by the given filter. The search will be constrained to
     * descendants of only lightweight children or only heavyweight children
     * of this container depending on searchHeavyweightChildren. The search will
     * be constrained to only lightweight descendants of the searched children
     * of this container if searchHeavyweightDescendants is <code>false</code>.
     *
     * @param filter EventTargetFilter instance to determine whether the
     *        selected component is a valid target for this event.
     * @param searchHeavyweightChildren if <code>true</code>, the method
     *        will bypass immediate lightweight children during the search.
     *        If <code>false</code>, the methods will bypass immediate
     *        heavyweight children during the search.
     * @param searchHeavyweightDescendants if <code>false</code>, the method
     *        will bypass heavyweight descendants which are not immediate
     *        children during the search. If <code>true</code>, the method
     *        will traverse both lightweight and heavyweight descendants during
     *        the search.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Component getMouseEventTarget(int x, int y, boolean includeSelf,
                                          EventTargetFilter filter,
                                          boolean searchHeavyweights) {

    /**
     * A private version of getMouseEventTarget which has two additional
     * controllable behaviors. This method searches for the top-most
     * descendant of this container that contains the given coordinates
     * and is accepted by the given filter. The search will be constrained to
     * lightweight descendants if the last argument is <code>false</code>.
     *
     * @param filter EventTargetFilter instance to determine whether the
     *        given component is a valid target for this event.
     * @param searchHeavyweights if <code>false</code>, the method
     *        will bypass heavyweight components during the search.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Component getDropTargetEventTarget(int x, int y, boolean includeSelf) {

    /**
     * Fetches the top-most (deepest) component to receive SunDropTargetEvents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Component getMouseEventTarget(int x, int y, boolean includeSelf) {

    /**
     * Fetchs the top-most (deepest) lightweight component that is interested
     * in receiving mouse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected void processContainerEvent(ContainerEvent e) {

    /**
     * Processes container events occurring on this container by
     * dispatching them to any registered ContainerListener objects.
     * NOTE: This method will not be called unless container events
     * are enabled for this component; this happens when one of the
     * following occurs:
     * <ul>
     * <li>A ContainerListener object is registered via
     *     <code>addContainerListener</code>
     * <li>Container events are enabled via <code>enableEvents</code>
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the container event
     * @see Component#enableEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this container. If the event is a
     * <code>ContainerEvent</code>, it invokes the
     * <code>processContainerEvent</code> method, else it invokes
     * its superclass's <code>processEvent</code>.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>Container</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>Container</code> <code>c</code>
     * for its container listeners with the following code:
     *
     * <pre>ContainerListener[] cls = (ContainerListener[])(c.getListeners(ContainerListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this container,
     *          or an empty array if no such listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     * @exception NullPointerException if {@code listenerType} is {@code null}
     *
     * @see #getContainerListeners
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public synchronized ContainerListener[] getContainerListeners() {

    /**
     * Returns an array of all the container listeners
     * registered on this container.
     *
     * @return all of this container's <code>ContainerListener</code>s
     *         or an empty array if no container
     *         listeners are currently registered
     *
     * @see #addContainerListener
     * @see #removeContainerListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public synchronized void removeContainerListener(ContainerListener l) {

    /**
     * Removes the specified container listener so it no longer receives
     * container events from this container.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the container listener
     *
     * @see #addContainerListener
     * @see #getContainerListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public synchronized void addContainerListener(ContainerListener l) {

    /**
     * Adds the specified container listener to receive container events
     * from this container.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l the container listener
     *
     * @see #removeContainerListener
     * @see #getContainerListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void printHeavyweightComponents(Graphics g) {

    /**
     * Prints all the heavyweight subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void lightweightPrint(Graphics g) {

    /**
     * Simulates the peer callbacks into java.awt for printing of
     * lightweight Containers.
     * @param     g   the graphics context to use for printing.
     * @see       Component#printAll
     * @see       #printComponents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void printComponents(Graphics g) {

    /**
     * Prints each of the components in this container.
     * @param     g   the graphics context.
     * @see       Component#print
     * @see       Component#printAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void paintHeavyweightComponents(Graphics g) {

    /**
     * Prints all the heavyweight subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void lightweightPaint(Graphics g) {

    /**
     * Simulates the peer callbacks into java.awt for printing of
     * lightweight Containers.
     * @param     g   the graphics context to use for printing.
     * @see       Component#printAll
     * @see       #printComponents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void paintComponents(Graphics g) {

    /**
     * Paints each of the components in this container.
     * @param     g   the graphics context.
     * @see       Component#paint
     * @see       Component#paintAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void print(Graphics g) {

    /**
     * Prints the container. This forwards the print to any lightweight
     * components that are children of this container. If this method is
     * reimplemented, super.print(g) should be called so that lightweight
     * components are properly rendered. If a child component is entirely
     * clipped by the current clipping setting in g, print() will not be
     * forwarded to that child.
     *
     * @param g the specified Graphics window
     * @see   Component#update(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void update(Graphics g) {

    /**
     * Updates the container.  This forwards the update to any lightweight
     * components that are children of this container.  If this method is
     * reimplemented, super.update(g) should be called so that lightweight
     * components are properly rendered.  If a child component is entirely
     * clipped by the current clipping setting in g, update() will not be
     * forwarded to that child.
     *
     * @param g the specified Graphics window
     * @see   Component#update(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void paint(Graphics g) {

    /**
     * Paints the container. This forwards the paint to any lightweight
     * components that are children of this container. If this method is
     * reimplemented, super.paint(g) should be called so that lightweight
     * components are properly rendered. If a child component is entirely
     * clipped by the current clipping setting in g, paint() will not be
     * forwarded to that child.
     *
     * @param g the specified Graphics window
     * @see   Component#update(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public float getAlignmentY() {

    /**
     * Returns the alignment along the y axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public float getAlignmentX() {

    /**
     * Returns the alignment along the x axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Dimension getMaximumSize() {

    /**
     * Returns the maximum size of this container.  If the maximum size has
     * not been set explicitly by {@link Component#setMaximumSize(Dimension)}
     * and the {@link LayoutManager} installed on this {@code Container}
     * is an instance of {@link LayoutManager2}, then
     * {@link LayoutManager2#maximumLayoutSize(Container)}
     * is used to calculate the maximum size.
     *
     * <p>Note: some implementations may cache the value returned from the
     * {@code LayoutManager2}.  Implementations that cache need not invoke
     * {@code maximumLayoutSize} on the {@code LayoutManager2} every time
     * this method is invoked, rather the {@code LayoutManager2} will only
     * be queried after the {@code Container} becomes invalid.
     *
     * @return    an instance of <code>Dimension</code> that represents
     *                the maximum size of this container.
     * @see       #getPreferredSize
     * @see       #getMinimumSize
     * @see       #getLayout
     * @see       LayoutManager2#maximumLayoutSize(Container)
     * @see       Component#getMaximumSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Dimension getMinimumSize() {

    /**
     * Returns the minimum size of this container.  If the minimum size has
     * not been set explicitly by {@link Component#setMinimumSize(Dimension)}
     * and this {@code Container} has a {@code non-null} {@link LayoutManager},
     * then {@link LayoutManager#minimumLayoutSize(Container)}
     * is used to calculate the minimum size.
     *
     * <p>Note: some implementations may cache the value returned from the
     * {@code LayoutManager}.  Implementations that cache need not invoke
     * {@code minimumLayoutSize} on the {@code LayoutManager} every time
     * this method is invoked, rather the {@code LayoutManager} will only
     * be queried after the {@code Container} becomes invalid.
     *
     * @return    an instance of <code>Dimension</code> that represents
     *                the minimum size of this container.
     * @see       #getPreferredSize
     * @see       #getMaximumSize
     * @see       #getLayout
     * @see       LayoutManager#minimumLayoutSize(Container)
     * @see       Component#getMinimumSize
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Dimension getPreferredSize() {

    /**
     * Returns the preferred size of this container.  If the preferred size has
     * not been set explicitly by {@link Component#setPreferredSize(Dimension)}
     * and this {@code Container} has a {@code non-null} {@link LayoutManager},
     * then {@link LayoutManager#preferredLayoutSize(Container)}
     * is used to calculate the preferred size.
     *
     * <p>Note: some implementations may cache the value returned from the
     * {@code LayoutManager}.  Implementations that cache need not invoke
     * {@code preferredLayoutSize} on the {@code LayoutManager} every time
     * this method is invoked, rather the {@code LayoutManager} will only
     * be queried after the {@code Container} becomes invalid.
     *
     * @return    an instance of <code>Dimension</code> that represents
     *                the preferred size of this container.
     * @see       #getMinimumSize
     * @see       #getMaximumSize
     * @see       #getLayout
     * @see       LayoutManager#preferredLayoutSize(Container)
     * @see       Component#getPreferredSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setFont(Font f) {

    /**
     * Sets the font of this container.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param f The font to become this container's font.
     * @see Component#getFont
     * @see #invalidate
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void invalidateTree() {

    /**
     * Recursively descends the container tree and invalidates all
     * contained components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected void validateTree() {

    /**
     * Recursively descends the container tree and recomputes the
     * layout for any subtrees marked as needing it (those marked as
     * invalid).  Synchronization should be provided by the method
     * that calls this one:  <code>validate</code>.
     *
     * @see #doLayout
     * @see #validate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final void validateUnconditionally() {

    /**
     * Unconditionally validate the component hierarchy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static boolean descendUnconditionallyWhenValidating = false;

    /**
     * Indicates whether valid containers should also traverse their
     * children and call the validateTree() method on them.
     *
     * Synchronization: TreeLock.
     *
     * The field is allowed to be static as long as the TreeLock itself is
     * static.
     *
     * @see #validateUnconditionally()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void validate() {

    /**
     * Validates this container and all of its subcomponents.
     * <p>
     * Validating a container means laying out its subcomponents.
     * Layout-related changes, such as setting the bounds of a component, or
     * adding a component to the container, invalidate the container
     * automatically.  Note that the ancestors of the container may be
     * invalidated also (see {@link Component#invalidate} for details.)
     * Therefore, to restore the validity of the hierarchy, the {@code
     * validate()} method should be invoked on the top-most invalid
     * container of the hierarchy.
     * <p>
     * Validating the container may be a quite time-consuming operation. For
     * performance reasons a developer may postpone the validation of the
     * hierarchy till a set of layout-related operations completes, e.g. after
     * adding all the children to the container.
     * <p>
     * If this {@code Container} is not valid, this method invokes
     * the {@code validateTree} method and marks this {@code Container}
     * as valid. Otherwise, no action is performed.
     *
     * @see #add(java.awt.Component)
     * @see #invalidate
     * @see Container#isValidateRoot
     * @see javax.swing.JComponent#revalidate()
     * @see #validateTree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Override

    /**
     * Invalidates the container.
     * <p>
     * If the {@code LayoutManager} installed on this container is an instance
     * of the {@code LayoutManager2} interface, then
     * the {@link LayoutManager2#invalidateLayout(Container)} method is invoked
     * on it supplying this {@code Container} as the argument.
     * <p>
     * Afterwards this method marks this container invalid, and invalidates its
     * ancestors. See the {@link Component#invalidate} method for more details.
     *
     * @see #validate
     * @see #layout
     * @see LayoutManager2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Override

    /**
     * Invalidates the parent of the container unless the container
     * is a validate root.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isValidateRoot() {

    /**
     * Indicates if this container is a <i>validate root</i>.
     * <p>
     * Layout-related changes, such as bounds of the validate root descendants,
     * do not affect the layout of the validate root parent. This peculiarity
     * enables the {@code invalidate()} method to stop invalidating the
     * component hierarchy when the method encounters a validate root. However,
     * to preserve backward compatibility this new optimized behavior is
     * enabled only when the {@code java.awt.smartInvalidate} system property
     * value is set to {@code true}.
     * <p>
     * If a component hierarchy contains validate roots and the new optimized
     * {@code invalidate()} behavior is enabled, the {@code validate()} method
     * must be invoked on the validate root of a previously invalidated
     * component to restore the validity of the hierarchy later. Otherwise,
     * calling the {@code validate()} method on the top-level container (such
     * as a {@code Frame} object) should be used to restore the validity of the
     * component hierarchy.
     * <p>
     * The {@code Window} class and the {@code Applet} class are the validate
     * roots in AWT.  Swing introduces more validate roots.
     *
     * @return whether this container is a validate root
     * @see #invalidate
     * @see java.awt.Component#invalidate
     * @see javax.swing.JComponent#isValidateRoot
     * @see javax.swing.JComponent#revalidate
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>doLayout()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void doLayout() {

    /**
     * Causes this container to lay out its components.  Most programs
     * should not call this method directly, but should invoke
     * the <code>validate</code> method instead.
     * @see LayoutManager#layoutContainer
     * @see #setLayout
     * @see #validate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setLayout(LayoutManager mgr) {

    /**
     * Sets the layout manager for this container.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param mgr the specified layout manager
     * @see #doLayout
     * @see #getLayout
     * @see #invalidate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public LayoutManager getLayout() {

    /**
     * Gets the layout manager for this container.
     * @see #doLayout
     * @see #setLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void removeAll() {

    /**
     * Removes all the components from this container.
     * This method also notifies the layout manager to remove the
     * components from this container's layout via the
     * <code>removeLayoutComponent</code> method.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * reflect the changes.
     *
     * @see #add
     * @see #remove
     * @see #invalidate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void remove(Component comp) {

    /**
     * Removes the specified component from this container.
     * This method also notifies the layout manager to remove the
     * component from this container's layout via the
     * <code>removeLayoutComponent</code> method.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * reflect the changes.
     *
     * @param comp the component to be removed
     * @throws NullPointerException if {@code comp} is {@code null}
     * @see #add
     * @see #invalidate
     * @see #validate
     * @see #remove(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void remove(int index) {

    /**
     * Removes the component, specified by <code>index</code>,
     * from this container.
     * This method also notifies the layout manager to remove the
     * component from this container's layout via the
     * <code>removeLayoutComponent</code> method.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * reflect the changes.
     *
     *
     * @param     index   the index of the component to be removed
     * @throws ArrayIndexOutOfBoundsException if {@code index} is not in
     *         range {@code [0, getComponentCount()-1]}
     * @see #add
     * @see #invalidate
     * @see #validate
     * @see #getComponentCount
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void checkGD(String stringID) {

    /**
     * Checks that all Components that this Container contains are on
     * the same GraphicsDevice as this Container.  If not, throws an
     * IllegalArgumentException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected void addImpl(Component comp, Object constraints, int index) {

    /**
     * Adds the specified component to this container at the specified
     * index. This method also notifies the layout manager to add
     * the component to this container's layout using the specified
     * constraints object via the <code>addLayoutComponent</code>
     * method.
     * <p>
     * The constraints are
     * defined by the particular layout manager being used.  For
     * example, the <code>BorderLayout</code> class defines five
     * constraints: <code>BorderLayout.NORTH</code>,
     * <code>BorderLayout.SOUTH</code>, <code>BorderLayout.EAST</code>,
     * <code>BorderLayout.WEST</code>, and <code>BorderLayout.CENTER</code>.
     * <p>
     * The <code>GridBagLayout</code> class requires a
     * <code>GridBagConstraints</code> object.  Failure to pass
     * the correct type of constraints object results in an
     * <code>IllegalArgumentException</code>.
     * <p>
     * If the current layout manager implements {@code LayoutManager2}, then
     * {@link LayoutManager2#addLayoutComponent(Component,Object)} is invoked on
     * it. If the current layout manager does not implement
     * {@code LayoutManager2}, and constraints is a {@code String}, then
     * {@link LayoutManager#addLayoutComponent(String,Component)} is invoked on it.
     * <p>
     * If the component is not an ancestor of this container and has a non-null
     * parent, it is removed from its current parent before it is added to this
     * container.
     * <p>
     * This is the method to override if a program needs to track
     * every add request to a container as all other add methods defer
     * to this one. An overriding method should
     * usually include a call to the superclass's version of the method:
     *
     * <blockquote>
     * <code>super.addImpl(comp, constraints, index)</code>
     * </blockquote>
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     * @param     comp       the component to be added
     * @param     constraints an object expressing layout constraints
     *                 for this component
     * @param     index the position in the container's list at which to
     *                 insert the component, where <code>-1</code>
     *                 means append to the end
     * @exception IllegalArgumentException if {@code index} is invalid;
     *            if {@code comp} is a child of this container, the valid
     *            range is {@code [-1, getComponentCount()-1]}; if component is
     *            not a child of this container, the valid range is
     *            {@code [-1, getComponentCount()]}
     *
     * @exception IllegalArgumentException if {@code comp} is an ancestor of
     *                                     this container
     * @exception IllegalArgumentException if adding a window to a container
     * @exception NullPointerException if {@code comp} is {@code null}
     * @see       #add(Component)
     * @see       #add(Component, int)
     * @see       #add(Component, java.lang.Object)
     * @see #invalidate
     * @see       LayoutManager
     * @see       LayoutManager2
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void add(Component comp, Object constraints, int index) {

    /**
     * Adds the specified component to this container with the specified
     * constraints at the specified index.  Also notifies the layout
     * manager to add the component to the this container's layout using
     * the specified constraints object.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     *
     * @param comp the component to be added
     * @param constraints an object expressing layout constraints for this
     * @param index the position in the container's list at which to insert
     * the component; <code>-1</code> means insert at the end
     * component
     * @exception NullPointerException if {@code comp} is {@code null}
     * @exception IllegalArgumentException if {@code index} is invalid (see
     *            {@link #addImpl} for details)
     * @see #addImpl
     * @see #invalidate
     * @see #validate
     * @see javax.swing.JComponent#revalidate()
     * @see #remove
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void add(Component comp, Object constraints) {

    /**
     * Adds the specified component to the end of this container.
     * Also notifies the layout manager to add the component to
     * this container's layout using the specified constraints object.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     *
     * @param     comp the component to be added
     * @param     constraints an object expressing
     *                  layout constraints for this component
     * @exception NullPointerException if {@code comp} is {@code null}
     * @see #addImpl
     * @see #invalidate
     * @see #validate
     * @see javax.swing.JComponent#revalidate()
     * @see       LayoutManager
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public int getComponentZOrder(Component comp) {

    /**
     * Returns the z-order index of the component inside the container.
     * The higher a component is in the z-order hierarchy, the lower
     * its index.  The component with the lowest z-order index is
     * painted last, above all other child components.
     *
     * @param comp the component being queried
     * @return  the z-order index of the component; otherwise
     *          returns -1 if the component is <code>null</code>
     *          or doesn't belong to the container
     * @see #setComponentZOrder(java.awt.Component, int)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void addDelicately(Component comp, Container curParent, int index) {

    /**
     * Adds component to this container. Tries to minimize side effects of this adding -
     * doesn't call remove notify if it is not required.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void reparentChild(Component comp) {

    /**
     * Reparents child component peer to this container peer.
     * Container must be heavyweight.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void reparentTraverse(ContainerPeer parentPeer, Container child) {

    /**
     * Traverses the tree of components and reparents children heavyweight component
     * to new heavyweight parent.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setComponentZOrder(Component comp, int index) {

    /**
     * Moves the specified component to the specified z-order index in
     * the container. The z-order determines the order that components
     * are painted; the component with the highest z-order paints first
     * and the component with the lowest z-order paints last.
     * Where components overlap, the component with the lower
     * z-order paints over the component with the higher z-order.
     * <p>
     * If the component is a child of some other container, it is
     * removed from that container before being added to this container.
     * The important difference between this method and
     * <code>java.awt.Container.add(Component, int)</code> is that this method
     * doesn't call <code>removeNotify</code> on the component while
     * removing it from its previous container unless necessary and when
     * allowed by the underlying native windowing system. This way, if the
     * component has the keyboard focus, it maintains the focus when
     * moved to the new position.
     * <p>
     * This property is guaranteed to apply only to lightweight
     * non-<code>Container</code> components.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     * <p>
     * <b>Note</b>: Not all platforms support changing the z-order of
     * heavyweight components from one container into another without
     * the call to <code>removeNotify</code>. There is no way to detect
     * whether a platform supports this, so developers shouldn't make
     * any assumptions.
     *
     * @param     comp the component to be moved
     * @param     index the position in the container's list to
     *            insert the component, where <code>getComponentCount()</code>
     *            appends to the end
     * @exception NullPointerException if <code>comp</code> is
     *            <code>null</code>
     * @exception IllegalArgumentException if <code>comp</code> is one of the
     *            container's parents
     * @exception IllegalArgumentException if <code>index</code> is not in
     *            the range <code>[0, getComponentCount()]</code> for moving
     *            between containers, or not in the range
     *            <code>[0, getComponentCount()-1]</code> for moving inside
     *            a container
     * @exception IllegalArgumentException if adding a container to itself
     * @exception IllegalArgumentException if adding a <code>Window</code>
     *            to a container
     * @see #getComponentZOrder(java.awt.Component)
     * @see #invalidate
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static boolean isRemoveNotifyNeeded(Component comp, Container oldContainer, Container newContainer) {

    /**
     * Detects whether or not remove from current parent and adding to new parent requires call of
     * removeNotify on the component. Since removeNotify destroys native window this might (not)
     * be required. For example, if new container and old containers are the same we don't need to
     * destroy native window.
     * @since: 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Container getHeavyweightContainer() {

    /**
     * Returns closest heavyweight component to this container. If this container is heavyweight
     * returns this.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final boolean hasLightweightDescendants() {

    /**
     * Checks whether or not this container has lightweight children.
     * Note: Should be called while holding tree lock
     * @return true if there is at least one lightweight children in a container, false otherwise
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final boolean hasHeavyweightDescendants() {

    /**
     * Checks whether or not this container has heavyweight children.
     * Note: Should be called while holding tree lock
     * @return true if there is at least one heavyweight children in a container, false otherwise
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    boolean canContainFocusOwner(Component focusOwnerCandidate) {

    /**
     * Checks whether this container can contain component which is focus owner.
     * Verifies that container is enable and showing, and if it is focus cycle root
     * its FTP allows component to be focus owner
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean removeDelicately(Component comp, Container newParent, int newIndex) {

    /**
     * Removes component comp from this container without making unneccessary changes
     * and generating unneccessary events. This function intended to perform optimized
     * remove, for example, if newParent and current parent are the same it just changes
     * index without calling removeNotify.
     * Note: Should be called while holding treeLock
     * Returns whether removeNotify was invoked
     * @since: 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void checkAdding(Component comp, int index) {

    /**
     * Checks that the component comp can be added to this container
     * Checks :  index in bounds of container's size,
     * comp is not one of this container's parents,
     * and comp is not a window.
     * Comp and container must be on the same GraphicsDevice.
     * if comp is container, all sub-components must be on
     * same GraphicsDevice.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void checkNotAWindow(Component comp){

    /**
     * Checks that the component is not a Window instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void checkAddToSelf(Component comp){

    /**
     * Checks that the component
     * isn't supposed to be added into itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component add(Component comp, int index) {

    /**
     * Adds the specified component to this container at the given
     * position.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     *
     * @param     comp   the component to be added
     * @param     index    the position at which to insert the component,
     *                   or <code>-1</code> to append the component to the end
     * @exception NullPointerException if {@code comp} is {@code null}
     * @exception IllegalArgumentException if {@code index} is invalid (see
     *            {@link #addImpl} for details)
     * @return    the component <code>comp</code>
     * @see #addImpl
     * @see #remove
     * @see #invalidate
     * @see #validate
     * @see javax.swing.JComponent#revalidate()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component add(String name, Component comp) {

    /**
     * Adds the specified component to this container.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method is obsolete as of 1.1.  Please use the
     * method <code>add(Component, Object)</code> instead.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     * @exception NullPointerException if {@code comp} is {@code null}
     * @see #add(Component, Object)
     * @see #invalidate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component add(Component comp) {

    /**
     * Appends the specified component to the end of this container.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     * @param     comp   the component to be added
     * @exception NullPointerException if {@code comp} is {@code null}
     * @see #addImpl
     * @see #invalidate
     * @see #validate
     * @see javax.swing.JComponent#revalidate()
     * @return    the component argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getInsets()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Insets getInsets() {

    /**
     * Determines the insets of this container, which indicate the size
     * of the container's border.
     * <p>
     * A <code>Frame</code> object, for example, has a top inset that
     * corresponds to the height of the frame's title bar.
     * @return    the insets of this container.
     * @see       Insets
     * @see       LayoutManager
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component[] getComponents() {

    /**
     * Gets all the components in this container.
     * <p>
     * Note: This method should be called under AWT tree lock.
     *
     * @return    an array of all the components in this container.
     * @see Component#getTreeLock()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component getComponent(int n) {

    /**
     * Gets the nth component in this container.
     * <p>
     * Note: This method should be called under AWT tree lock.
     *
     * @param      n   the index of the component to get.
     * @return     the n<sup>th</sup> component in this container.
     * @exception  ArrayIndexOutOfBoundsException
     *                 if the n<sup>th</sup> value does not exist.
     * @see Component#getTreeLock()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by getComponentCount().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public int getComponentCount() {

    /**
     * Gets the number of components in this panel.
     * <p>
     * Note: This method should be called under AWT tree lock.
     *
     * @return    the number of components in this panel.
     * @see       #getComponent
     * @since     JDK1.1
     * @see Component#getTreeLock()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Container() {

    /**
     * Constructs a new Container. Containers can be extended directly,
     * but are lightweight in this case and must be contained by a parent
     * somewhere higher up in the component tree that is native.
     * (such as Frame for example).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
       called from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField ncomponents                     int
     *       The number of components in this container.
     *       This value can be null.
     * @serialField component                       Component[]
     *       The components in this container.
     * @serialField layoutMgr                       LayoutManager
     *       Layout manager for this container.
     * @serialField dispatcher                      LightweightDispatcher
     *       Event router for lightweight components.  If this container
     *       is native, this dispatcher takes care of forwarding and
     *       retargeting the events to lightweight components contained
     *       (if any).
     * @serialField maxSize                         Dimension
     *       Maximum size of this Container.
     * @serialField focusCycleRoot                  boolean
     *       Indicates whether this Component is the root of a focus traversal cycle.
     *       Once focus enters a traversal cycle, typically it cannot leave it via
     *       focus traversal unless one of the up- or down-cycle keys is pressed.
     *       Normal traversal is limited to this Container, and all of this
     *       Container's descendants that are not descendants of inferior focus cycle
     *       roots.
     * @serialField containerSerializedDataVersion  int
     *       Container Serial Data Version.
     * @serialField focusTraversalPolicyProvider    boolean
     *       Stores the value of focusTraversalPolicyProvider property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    static final boolean SEARCH_HEAVYWEIGHTS = true;

    /**
     * A constant which toggles one of the controllable behaviors
     * of <code>getMouseEventTarget</code>. It is used to specify whether
     * the method should search only lightweight components.
     *
     * @see #getMouseEventTarget(int, int, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    static final boolean INCLUDE_SELF = true;

    /**
     * A constant which toggles one of the controllable behaviors
     * of <code>getMouseEventTarget</code>. It is used to specify whether
     * the method can return the Container on which it is originally called
     * in case if none of its children are the current mouse event targets.
     *
     * @see #getMouseEventTarget(int, int, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static final long serialVersionUID = 4613797578919906343L;

    /**
     * JDK 1.1 serialVersionUID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean focusTraversalPolicyProvider;

    /**
     * Stores the value of focusTraversalPolicyProvider property.
     * @since 1.5
     * @see #setFocusTraversalPolicyProvider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean focusCycleRoot = false;

    /**
     * Indicates whether this Component is the root of a focus traversal cycle.
     * Once focus enters a traversal cycle, typically it cannot leave it via
     * focus traversal unless one of the up- or down-cycle keys is pressed.
     * Normal traversal is limited to this Container, and all of this
     * Container's descendants that are not descendants of inferior focus cycle
     * roots.
     *
     * @see #setFocusCycleRoot
     * @see #isFocusCycleRoot
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient FocusTraversalPolicy focusTraversalPolicy;

    /**
     * The focus traversal policy that will manage keyboard traversal of this
     * Container's children, if this Container is a focus cycle root. If the
     * value is null, this Container inherits its policy from its focus-cycle-
     * root ancestor. If all such ancestors of this Container have null
     * policies, then the current KeyboardFocusManager's default policy is
     * used. If the value is non-null, this policy will be inherited by all
     * focus-cycle-root children that have no keyboard-traversal policy of
     * their own (as will, recursively, their focus-cycle-root children).
     * <p>
     * If this Container is not a focus cycle root, the value will be
     * remembered, but will not be used or inherited by this or any other
     * Containers until this Container is made a focus cycle root.
     *
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private LightweightDispatcher dispatcher;

    /**
     * Event router for lightweight components.  If this container
     * is native, this dispatcher takes care of forwarding and
     * retargeting the events to lightweight components contained
     * (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    LayoutManager layoutMgr;

    /**
     * Layout manager for this container.
     * @see #doLayout
     * @see #setLayout
     * @see #getLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private java.util.List<Component> component = new ArrayList<>();

    /**
     * The components in this container.
     * @see #add
     * @see #getComponents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
public class Container extends Component {

/**
 * A generic Abstract Window Toolkit(AWT) container object is a component
 * that can contain other AWT components.
 * <p>
 * Components added to a container are tracked in a list.  The order
 * of the list will define the components' front-to-back stacking order
 * within the container.  If no index is specified when adding a
 * component to a container, it will be added to the end of the list
 * (and hence to the bottom of the stacking order).
 * <p>
 * <b>Note</b>: For details on the focus subsystem, see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/misc/focus.html">
 * How to Use the Focus Subsystem</a>,
 * a section in <em>The Java Tutorial</em>, and the
 * <a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
 * for more information.
 *
 * @author      Arthur van Hoff
 * @author      Sami Shaio
 * @see       #add(java.awt.Component, int)
 * @see       #getComponent(int)
 * @see       LayoutManager
 * @since     JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static final long PROXY_EVENT_MASK =

    /**
     * The kind of events routed to lightweight components from windowed
     * hosts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private long eventMask;

    /**
     * The event mask for contained lightweight components.  Lightweight
     * components need a windowed container to host window-related
     * events.  This separate mask indicates events that have been
     * requested by contained lightweight components without effecting
     * the mask of the windowed component itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Cursor nativeCursor;

    /**
     * This variable is not used, but kept for serialization compatibility
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient boolean isMouseDTInNativeContainer = false;

    /**
     * Is DnD over the native container.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient boolean isMouseInNativeContainer = false;

    /**
     * Is the mouse over the native container.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient  WeakReference<Component> targetLastEnteredDT;

    /**
     * The last component entered by the {@code SunDropTargetEvent}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient  WeakReference<Component> targetLastEntered;

    /**
     * The last component entered by the {@code MouseEvent}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient WeakReference<Component> mouseEventTarget;

    /**
     * The current subcomponent being hosted by this windowed
     * component that has events being forwarded to it.  If this
     * is null, there are currently no events being forwarded to
     * a subcomponent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Component focus;

    /**
     * This variable is not used, but kept for serialization compatibility
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Container nativeContainer;

    /**
     * The windowed container that might be hosting events for
     * subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void retargetMouseEvent(Component target, int id, MouseEvent e) {

    /**
     * Sends a mouse event to the current mouse event recipient using
     * the given event (sent to the windowed host) as a srcEvent.  If
     * the mouse event target is still in the component tree, the
     * coordinates of the event are translated to those of the target.
     * If the target has been removed, we don't bother to send the
     * message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean processMouseEvent(MouseEvent e) {

    /**
     * This method attempts to distribute a mouse event to a lightweight
     * component.  It tries to avoid doing any unnecessary probes down
     * into the component tree to minimize the overhead of determining
     * where to route the event, since mouse movement events tend to
     * come in large and frequent amounts.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    boolean dispatchEvent(AWTEvent e) {

    /**
     * Dispatches an event to a sub-component if necessary, and
     * returns whether or not the event was forwarded to a
     * sub-component.
     *
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void enableEvents(long events) {

    /**
     * Enables events to subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
class LightweightDispatcher implements java.io.Serializable, AWTEventListener {

/**
 * Class to manage the dispatching of MouseEvents to the lightweight descendants
 * and SunDropTargetEvents to both lightweight and heavyweight descendants
 * contained by a native container.
 *
 * NOTE: the class name is not appropriate anymore, but we cannot change it
 * because we must keep serialization compatibility.
 *
 * @author Timothy Prinzing
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final boolean isRecursivelyVisibleUpToHeavyweightContainer() {

    /**
     * Checks if the container and its direct lightweight containers are
     * visible.
     *
     * Consider the heavyweight container hides or shows the HW descendants
     * automatically. Therefore we care of LW containers' visibility only.
     *
     * This method MUST be invoked under the TreeLock.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Accessible getAccessibleChild(int i) {

    /**
     * Returns the nth <code>Accessible</code> child of the object.
     *
     * @param i zero-based index of child
     * @return the nth <code>Accessible</code> child of the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    int getAccessibleChildrenCount() {

    /**
     * Returns the number of accessible children in the object.  If all
     * of the children of this object implement <code>Accessible</code>,
     * then this method should return the number of children of this object.
     *
     * @return the number of accessible children in the object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Accessible getAccessibleAt(Point p) {

    /**
     * Returns the <code>Accessible</code> child contained at the local
     * coordinate <code>Point</code>, if one exists.  Otherwise
     * returns <code>null</code>.
     *
     * @param p the point defining the top-left corner of the
     *    <code>Accessible</code>, given in the coordinate space
     *    of the object's parent
     * @return the <code>Accessible</code> at the specified location,
     *    if it exists; otherwise <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        public void removePropertyChangeListener(PropertyChangeListener listener) {

        /**
         * Remove a PropertyChangeListener from the listener list.
         * This removes a PropertyChangeListener that was registered
         * for all properties.
         *
         * @param listener the PropertyChangeListener to be removed
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        public void addPropertyChangeListener(PropertyChangeListener listener) {

        /**
         * Adds a PropertyChangeListener to the listener list.
         *
         * @param listener  the PropertyChangeListener to be added
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        protected class AccessibleContainerHandler

        /**
         * Fire <code>PropertyChange</code> listener, if one is registered,
         * when children are added or removed.
         * @since 1.3
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        private volatile transient int propertyListenersCount = 0;

        /**
         * Number of PropertyChangeListener objects registered. It's used
         * to add/remove ContainerListener to track target Container's state.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        public Accessible getAccessibleChild(int i) {

        /**
         * Returns the nth <code>Accessible</code> child of the object.
         *
         * @param i zero-based index of child
         * @return the nth <code>Accessible</code> child of the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        public int getAccessibleChildrenCount() {

        /**
         * Returns the number of accessible children in the object.  If all
         * of the children of this object implement <code>Accessible</code>,
         * then this method should return the number of children of this object.
         *
         * @return the number of accessible children in the object
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
        private static final long serialVersionUID = 5081320404842566097L;

        /**
         * JDK1.3 serialVersionUID
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected class AccessibleAWTContainer extends AccessibleAWTComponent {

    /**
     * Inner class of Container used to provide default support for
     * accessibility.  This class is not meant to be used directly by
     * application developers, but is instead meant only to be
     * subclassed by container developers.
     * <p>
     * The class used to obtain the accessible role for this object,
     * as well as implementing many of the methods in the
     * AccessibleContainer interface.
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void readObject(ObjectInputStream s)

    /**
     * Deserializes this <code>Container</code> from the specified
     * <code>ObjectInputStream</code>.
     * <ul>
     *    <li>Reads default serializable fields from the stream.</li>
     *    <li>Reads a list of serializable ContainerListener(s) as optional
     *        data. If the list is null, no Listeners are installed.</li>
     *    <li>Reads this Container's FocusTraversalPolicy, which may be null,
     *        as optional data.</li>
     * </ul>
     *
     * @param s the <code>ObjectInputStream</code> to read
     * @serial
     * @see #addContainerListener
     * @see #writeObject(ObjectOutputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void writeObject(ObjectOutputStream s) throws IOException {

    /**
     * Serializes this <code>Container</code> to the specified
     * <code>ObjectOutputStream</code>.
     * <ul>
     *    <li>Writes default serializable fields to the stream.</li>
     *    <li>Writes a list of serializable ContainerListener(s) as optional
     *        data. The non-serializable ContainerListner(s) are detected and
     *        no attempt is made to serialize them.</li>
     *    <li>Write this Container's FocusTraversalPolicy if and only if it
     *        is Serializable; otherwise, <code>null</code> is written.</li>
     * </ul>
     *
     * @param s the <code>ObjectOutputStream</code> to write
     * @serialData <code>null</code> terminated sequence of 0 or more pairs;
     *   the pair consists of a <code>String</code> and <code>Object</code>;
     *   the <code>String</code> indicates the type of object and
     *   is one of the following:
     *   <code>containerListenerK</code> indicating an
     *     <code>ContainerListener</code> object;
     *   the <code>Container</code>'s <code>FocusTraversalPolicy</code>,
     *     or <code>null</code>
     *
     * @see AWTEventMulticaster#save(java.io.ObjectOutputStream, java.lang.String, java.util.EventListener)
     * @see Container#containerListenerK
     * @see #readObject(ObjectInputStream)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private int containerSerializedDataVersion = 1;

    /**
     * Container Serial Data Version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void addPropertyChangeListener(String propertyName,
                                          PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list for a specific
     * property. The specified property may be user-defined, or one of the
     * following defaults:
     * <ul>
     *    <li>this Container's font ("font")</li>
     *    <li>this Container's background color ("background")</li>
     *    <li>this Container's foreground color ("foreground")</li>
     *    <li>this Container's focusability ("focusable")</li>
     *    <li>this Container's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Container's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Container's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Container's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Container's Set of DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleFocusTraversalKeys")</li>
     *    <li>this Container's focus traversal policy ("focusTraversalPolicy")
     *        </li>
     *    <li>this Container's focus-cycle-root state ("focusCycleRoot")</li>
     *    <li>this Container's focus-traversal-policy-provider state("focusTraversalPolicyProvider")</li>
     *    <li>this Container's focus-traversal-policy-provider state("focusTraversalPolicyProvider")</li>
     * </ul>
     * Note that if this Container is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param propertyName one of the property names listed above
     * @param listener the PropertyChangeListener to be added
     *
     * @see #addPropertyChangeListener(java.beans.PropertyChangeListener)
     * @see Component#removePropertyChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list. The listener is
     * registered for all bound properties of this class, including the
     * following:
     * <ul>
     *    <li>this Container's font ("font")</li>
     *    <li>this Container's background color ("background")</li>
     *    <li>this Container's foreground color ("foreground")</li>
     *    <li>this Container's focusability ("focusable")</li>
     *    <li>this Container's focus traversal keys enabled state
     *        ("focusTraversalKeysEnabled")</li>
     *    <li>this Container's Set of FORWARD_TRAVERSAL_KEYS
     *        ("forwardFocusTraversalKeys")</li>
     *    <li>this Container's Set of BACKWARD_TRAVERSAL_KEYS
     *        ("backwardFocusTraversalKeys")</li>
     *    <li>this Container's Set of UP_CYCLE_TRAVERSAL_KEYS
     *        ("upCycleFocusTraversalKeys")</li>
     *    <li>this Container's Set of DOWN_CYCLE_TRAVERSAL_KEYS
     *        ("downCycleFocusTraversalKeys")</li>
     *    <li>this Container's focus traversal policy ("focusTraversalPolicy")
     *        </li>
     *    <li>this Container's focus-cycle-root state ("focusCycleRoot")</li>
     * </ul>
     * Note that if this Container is inheriting a bound property, then no
     * event will be fired in response to a change in the inherited property.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param    listener  the PropertyChangeListener to be added
     *
     * @see Component#removePropertyChangeListener
     * @see #addPropertyChangeListener(java.lang.String,java.beans.PropertyChangeListener)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void applyComponentOrientation(ComponentOrientation o) {

    /**
     * Sets the <code>ComponentOrientation</code> property of this container
     * and all components contained within it.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param o the new component orientation of this container and
     *        the components contained within it.
     * @exception NullPointerException if <code>orientation</code> is null.
     * @see Component#setComponentOrientation
     * @see Component#getComponentOrientation
     * @see #invalidate
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void transferFocusDownCycle() {

    /**
     * Transfers the focus down one focus traversal cycle. If this Container is
     * a focus cycle root, then the focus owner is set to this Container's
     * default Component to focus, and the current focus cycle root is set to
     * this Container. If this Container is not a focus cycle root, then no
     * focus traversal operation occurs.
     *
     * @see       Component#requestFocus()
     * @see       #isFocusCycleRoot
     * @see       #setFocusCycleRoot
     * @since     1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public final boolean isFocusTraversalPolicyProvider() {

    /**
     * Returns whether this container provides focus traversal
     * policy. If this property is set to <code>true</code> then when
     * keyboard focus manager searches container hierarchy for focus
     * traversal policy and encounters this container before any other
     * container with this property as true or focus cycle roots then
     * its focus traversal policy will be used instead of focus cycle
     * root's policy.
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @see #setFocusCycleRoot
     * @see #setFocusTraversalPolicyProvider
     * @return <code>true</code> if this container provides focus traversal
     *         policy, <code>false</code> otherwise
     * @since 1.5
     * @beaninfo
     *        bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public final void setFocusTraversalPolicyProvider(boolean provider) {

    /**
     * Sets whether this container will be used to provide focus
     * traversal policy. Container with this property as
     * <code>true</code> will be used to acquire focus traversal policy
     * instead of closest focus cycle root ancestor.
     * @param provider indicates whether this container will be used to
     *                provide focus traversal policy
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @see #isFocusTraversalPolicyProvider
     * @since 1.5
     * @beaninfo
     *        bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isFocusCycleRoot() {

    /**
     * Returns whether this Container is the root of a focus traversal cycle.
     * Once focus enters a traversal cycle, typically it cannot leave it via
     * focus traversal unless one of the up- or down-cycle keys is pressed.
     * Normal traversal is limited to this Container, and all of this
     * Container's descendants that are not descendants of inferior focus
     * cycle roots. Note that a FocusTraversalPolicy may bend these
     * restrictions, however. For example, ContainerOrderFocusTraversalPolicy
     * supports implicit down-cycle traversal.
     *
     * @return whether this Container is the root of a focus traversal cycle
     * @see #setFocusCycleRoot
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @see ContainerOrderFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setFocusCycleRoot(boolean focusCycleRoot) {

    /**
     * Sets whether this Container is the root of a focus traversal cycle. Once
     * focus enters a traversal cycle, typically it cannot leave it via focus
     * traversal unless one of the up- or down-cycle keys is pressed. Normal
     * traversal is limited to this Container, and all of this Container's
     * descendants that are not descendants of inferior focus cycle roots. Note
     * that a FocusTraversalPolicy may bend these restrictions, however. For
     * example, ContainerOrderFocusTraversalPolicy supports implicit down-cycle
     * traversal.
     * <p>
     * The alternative way to specify the traversal order of this Container's
     * children is to make this Container a
     * <a href="doc-files/FocusSpec.html#FocusTraversalPolicyProviders">focus traversal policy provider</a>.
     *
     * @param focusCycleRoot indicates whether this Container is the root of a
     *        focus traversal cycle
     * @see #isFocusCycleRoot()
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @see ContainerOrderFocusTraversalPolicy
     * @see #setFocusTraversalPolicyProvider
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isFocusTraversalPolicySet() {

    /**
     * Returns whether the focus traversal policy has been explicitly set for
     * this Container. If this method returns <code>false</code>, this
     * Container will inherit its focus traversal policy from an ancestor.
     *
     * @return <code>true</code> if the focus traversal policy has been
     *         explicitly set for this Container; <code>false</code> otherwise.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public FocusTraversalPolicy getFocusTraversalPolicy() {

    /**
     * Returns the focus traversal policy that will manage keyboard traversal
     * of this Container's children, or null if this Container is not a focus
     * cycle root. If no traversal policy has been explicitly set for this
     * Container, then this Container's focus-cycle-root ancestor's policy is
     * returned.
     *
     * @return this Container's focus traversal policy, or null if this
     *         Container is not a focus cycle root.
     * @see #setFocusTraversalPolicy
     * @see #setFocusCycleRoot
     * @see #isFocusCycleRoot
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setFocusTraversalPolicy(FocusTraversalPolicy policy) {

    /**
     * Sets the focus traversal policy that will manage keyboard traversal of
     * this Container's children, if this Container is a focus cycle root. If
     * the argument is null, this Container inherits its policy from its focus-
     * cycle-root ancestor. If the argument is non-null, this policy will be
     * inherited by all focus-cycle-root children that have no keyboard-
     * traversal policy of their own (as will, recursively, their focus-cycle-
     * root children).
     * <p>
     * If this Container is not a focus cycle root, the policy will be
     * remembered, but will not be used or inherited by this or any other
     * Containers until this Container is made a focus cycle root.
     *
     * @param policy the new focus traversal policy for this Container
     * @see #getFocusTraversalPolicy
     * @see #setFocusCycleRoot
     * @see #isFocusCycleRoot
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean isParentOf(Component comp) {

    /**
     * Check if this component is the child of this container or its children.
     * Note: this function acquires treeLock
     * Note: this function traverses children tree only in one Window.
     * @param comp a component in test, must not be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isFocusCycleRoot(Container container) {

    /**
     * Returns whether the specified Container is the focus cycle root of this
     * Container's focus traversal cycle. Each focus traversal cycle has only
     * a single focus cycle root and each Container which is not a focus cycle
     * root belongs to only a single focus traversal cycle. Containers which
     * are focus cycle roots belong to two cycles: one rooted at the Container
     * itself, and one rooted at the Container's nearest focus-cycle-root
     * ancestor. This method will return <code>true</code> for both such
     * Containers in this case.
     *
     * @param container the Container to be tested
     * @return <code>true</code> if the specified Container is a focus-cycle-
     *         root of this Container; <code>false</code> otherwise
     * @see #isFocusCycleRoot()
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean areFocusTraversalKeysSet(int id) {

    /**
     * Returns whether the Set of focus traversal keys for the given focus
     * traversal operation has been explicitly defined for this Container. If
     * this method returns <code>false</code>, this Container is inheriting the
     * Set from an ancestor, or from the current KeyboardFocusManager.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @return <code>true</code> if the the Set of focus traversal keys for the
     *         given focus traversal operation has been explicitly defined for
     *         this Component; <code>false</code> otherwise.
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Set<AWTKeyStroke> getFocusTraversalKeys(int id) {

    /**
     * Returns the Set of focus traversal keys for a given traversal operation
     * for this Container. (See
     * <code>setFocusTraversalKeys</code> for a full description of each key.)
     * <p>
     * If a Set of traversal keys has not been explicitly defined for this
     * Container, then this Container's parent's Set is returned. If no Set
     * has been explicitly defined for any of this Container's ancestors, then
     * the current KeyboardFocusManager's default Set is returned.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @return the Set of AWTKeyStrokes for the specified operation. The Set
     *         will be unmodifiable, and may be empty. null will never be
     *         returned.
     * @see #setFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#DOWN_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setFocusTraversalKeys(int id,
                                      Set<? extends AWTKeyStroke> keystrokes)

    /**
     * Sets the focus traversal keys for a given traversal operation for this
     * Container.
     * <p>
     * The default values for a Container's focus traversal keys are
     * implementation-dependent. Sun recommends that all implementations for a
     * particular native platform use the same default values. The
     * recommendations for Windows and Unix are listed below. These
     * recommendations are used in the Sun AWT implementations.
     *
     * <table border=1 summary="Recommended default values for a Container's focus traversal keys">
     * <tr>
     *    <th>Identifier</th>
     *    <th>Meaning</th>
     *    <th>Default</th>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS</td>
     *    <td>Normal forward keyboard traversal</td>
     *    <td>TAB on KEY_PRESSED, CTRL-TAB on KEY_PRESSED</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS</td>
     *    <td>Normal reverse keyboard traversal</td>
     *    <td>SHIFT-TAB on KEY_PRESSED, CTRL-SHIFT-TAB on KEY_PRESSED</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS</td>
     *    <td>Go up one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * <tr>
     *    <td>KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS<td>
     *    <td>Go down one focus traversal cycle</td>
     *    <td>none</td>
     * </tr>
     * </table>
     *
     * To disable a traversal key, use an empty Set; Collections.EMPTY_SET is
     * recommended.
     * <p>
     * Using the AWTKeyStroke API, client code can specify on which of two
     * specific KeyEvents, KEY_PRESSED or KEY_RELEASED, the focus traversal
     * operation will occur. Regardless of which KeyEvent is specified,
     * however, all KeyEvents related to the focus traversal key, including the
     * associated KEY_TYPED event, will be consumed, and will not be dispatched
     * to any Container. It is a runtime error to specify a KEY_TYPED event as
     * mapping to a focus traversal operation, or to map the same event to
     * multiple default focus traversal operations.
     * <p>
     * If a value of null is specified for the Set, this Container inherits the
     * Set from its parent. If all ancestors of this Container have null
     * specified for the Set, then the current KeyboardFocusManager's default
     * Set is used.
     * <p>
     * This method may throw a {@code ClassCastException} if any {@code Object}
     * in {@code keystrokes} is not an {@code AWTKeyStroke}.
     *
     * @param id one of KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *        KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *        KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS
     * @param keystrokes the Set of AWTKeyStroke for the specified operation
     * @see #getFocusTraversalKeys
     * @see KeyboardFocusManager#FORWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#BACKWARD_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#UP_CYCLE_TRAVERSAL_KEYS
     * @see KeyboardFocusManager#DOWN_CYCLE_TRAVERSAL_KEYS
     * @throws IllegalArgumentException if id is not one of
     *         KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
     *         KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, or
     *         KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS, or if keystrokes
     *         contains null, or if any keystroke represents a KEY_TYPED event,
     *         or if any keystroke already maps to another focus traversal
     *         operation for this Container
     * @since 1.4
     * @beaninfo
     *       bound: true
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void list(PrintWriter out, int indent) {

    /**
     * Prints out a list, starting at the specified indentation,
     * to the specified print writer.
     * <p>
     * The immediate children of the container are printed with
     * an indentation of <code>indent+1</code>.  The children
     * of those children are printed at <code>indent+2</code>
     * and so on.
     *
     * @param    out      a print writer
     * @param    indent   the number of spaces to indent
     * @throws   NullPointerException if {@code out} is {@code null}
     * @see      Component#list(java.io.PrintWriter, int)
     * @since    JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void list(PrintStream out, int indent) {

    /**
     * Prints a listing of this container to the specified output
     * stream. The listing starts at the specified indentation.
     * <p>
     * The immediate children of the container are printed with
     * an indentation of <code>indent+1</code>.  The children
     * of those children are printed at <code>indent+2</code>
     * and so on.
     *
     * @param    out      a print stream
     * @param    indent   the number of spaces to indent
     * @throws   NullPointerException if {@code out} is {@code null}
     * @see      Component#list(java.io.PrintStream, int)
     * @since    JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected String paramString() {

    /**
     * Returns a string representing the state of this <code>Container</code>.
     * This method is intended to be used only for debugging purposes, and the
     * content and format of the returned string may vary between
     * implementations. The returned string may be empty but may not be
     * <code>null</code>.
     *
     * @return    the parameter string of this container
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isAncestorOf(Component c) {

    /**
     * Checks if the component is contained in the component hierarchy of
     * this container.
     * @param c the component
     * @return     <code>true</code> if it is an ancestor;
     *             <code>false</code> otherwise.
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void removeNotify() {

    /**
     * Makes this Container undisplayable by removing its connection
     * to its native screen resource.  Making a container undisplayable
     * will cause all of its children to be made undisplayable.
     * This method is called by the toolkit internally and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #addNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void addNotify() {

    /**
     * Makes this Container displayable by connecting it to
     * a native screen resource.  Making a container displayable will
     * cause all of its children to be made displayable.
     * This method is called internally by the toolkit and should
     * not be called directly by programs.
     * @see Component#isDisplayable
     * @see #removeNotify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component findComponentAt(Point p) {

    /**
     * Locates the visible child component that contains the specified
     * point.  The top-most child component is returned in the case
     * where there is overlap in the components.  If the containing child
     * component is a Container, this method will continue searching for
     * the deepest nested child component.  Components which are not
     * visible are ignored during the search.<p>
     *
     * The findComponentAt method is different from getComponentAt in
     * that getComponentAt only searches the Container's immediate
     * children; if the containing component is a Container,
     * findComponentAt will search that child to find a nested component.
     *
     * @param      p   the point.
     * @return null if the component does not contain the position.
     * If there is no child component at the requested point and the
     * point is within the bounds of the container the container itself
     * is returned.
     * @throws NullPointerException if {@code p} is {@code null}
     * @see Component#contains
     * @see #getComponentAt
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static Component getChildAt(Component comp, int x, int y,
                                        boolean ignoreEnabled) {

    /**
     * Helper method for findComponentAtImpl. Finds a child component using
     * findComponentAtImpl for Container and getComponentAt for Component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final Component findComponentAt(int x, int y, boolean ignoreEnabled) {

    /**
     * Private version of findComponentAt which has a controllable
     * behavior. Setting 'ignoreEnabled' to 'false' bypasses disabled
     * Components during the search. This behavior is used by the
     * lightweight cursor support in sun.awt.GlobalCursorManager.
     *
     * The addition of this feature is temporary, pending the
     * adoption of new, public API which exports this feature.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component findComponentAt(int x, int y) {

    /**
     * Locates the visible child component that contains the specified
     * position.  The top-most child component is returned in the case
     * where there is overlap in the components.  If the containing child
     * component is a Container, this method will continue searching for
     * the deepest nested child component.  Components which are not
     * visible are ignored during the search.<p>
     *
     * The findComponentAt method is different from getComponentAt in
     * that getComponentAt only searches the Container's immediate
     * children; if the containing component is a Container,
     * findComponentAt will search that child to find a nested component.
     *
     * @param x the <i>x</i> coordinate
     * @param y the <i>y</i> coordinate
     * @return null if the component does not contain the position.
     * If there is no child component at the requested point and the
     * point is within the bounds of the container the container itself
     * is returned.
     * @see Component#contains
     * @see #getComponentAt
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Point getMousePosition(boolean allowChildren) throws HeadlessException {

    /**
     * Returns the position of the mouse pointer in this <code>Container</code>'s
     * coordinate space if the <code>Container</code> is under the mouse pointer,
     * otherwise returns <code>null</code>.
     * This method is similar to {@link Component#getMousePosition()} with the exception
     * that it can take the <code>Container</code>'s children into account.
     * If <code>allowChildren</code> is <code>false</code>, this method will return
     * a non-null value only if the mouse pointer is above the <code>Container</code>
     * directly, not above the part obscured by children.
     * If <code>allowChildren</code> is <code>true</code>, this method returns
     * a non-null value if the mouse pointer is above <code>Container</code> or any
     * of its descendants.
     *
     * @exception HeadlessException if GraphicsEnvironment.isHeadless() returns true
     * @param     allowChildren true if children should be taken into account
     * @see       Component#getMousePosition
     * @return    mouse coordinates relative to this <code>Component</code>, or null
     * @since     1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component getComponentAt(Point p) {

    /**
     * Gets the component that contains the specified point.
     * @param      p   the point.
     * @return     returns the component that contains the point,
     *                 or <code>null</code> if the component does
     *                 not contain the point.
     * @see        Component#contains
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getComponentAt(int, int)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component getComponentAt(int x, int y) {

    /**
     * Locates the component that contains the x,y position.  The
     * top-most child component is returned in the case where there
     * is overlap in the components.  This is determined by finding
     * the component closest to the index 0 that claims to contain
     * the given point via Component.contains(), except that Components
     * which have native peers take precedence over those which do not
     * (i.e., lightweight Components).
     *
     * @param x the <i>x</i> coordinate
     * @param y the <i>y</i> coordinate
     * @return null if the component does not contain the position.
     * If there is no child component at the requested point and the
     * point is within the bounds of the container the container itself
     * is returned; otherwise the top-most child is returned.
     * @see Component#contains
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>dispatchEvent(AWTEvent e)</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void proxyEnableEvents(long events) {

    /**
     * This is called by lightweight components that want the containing
     * windowed parent to enable some kind of events on their behalf.
     * This is needed for events that are normally only dispatched to
     * windows to be accepted so that they can be forwarded downward to
     * the lightweight component that has enabled them.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Component getMouseEventTargetImpl(int x, int y, boolean includeSelf,
                                         EventTargetFilter filter,
                                         boolean searchHeavyweightChildren,
                                         boolean searchHeavyweightDescendants) {

    /**
     * A private version of getMouseEventTarget which has three additional
     * controllable behaviors. This method searches for the top-most
     * descendant of this container that contains the given coordinates
     * and is accepted by the given filter. The search will be constrained to
     * descendants of only lightweight children or only heavyweight children
     * of this container depending on searchHeavyweightChildren. The search will
     * be constrained to only lightweight descendants of the searched children
     * of this container if searchHeavyweightDescendants is <code>false</code>.
     *
     * @param filter EventTargetFilter instance to determine whether the
     *        selected component is a valid target for this event.
     * @param searchHeavyweightChildren if <code>true</code>, the method
     *        will bypass immediate lightweight children during the search.
     *        If <code>false</code>, the methods will bypass immediate
     *        heavyweight children during the search.
     * @param searchHeavyweightDescendants if <code>false</code>, the method
     *        will bypass heavyweight descendants which are not immediate
     *        children during the search. If <code>true</code>, the method
     *        will traverse both lightweight and heavyweight descendants during
     *        the search.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private Component getMouseEventTarget(int x, int y, boolean includeSelf,
                                          EventTargetFilter filter,
                                          boolean searchHeavyweights) {

    /**
     * A private version of getMouseEventTarget which has two additional
     * controllable behaviors. This method searches for the top-most
     * descendant of this container that contains the given coordinates
     * and is accepted by the given filter. The search will be constrained to
     * lightweight descendants if the last argument is <code>false</code>.
     *
     * @param filter EventTargetFilter instance to determine whether the
     *        given component is a valid target for this event.
     * @param searchHeavyweights if <code>false</code>, the method
     *        will bypass heavyweight components during the search.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Component getDropTargetEventTarget(int x, int y, boolean includeSelf) {

    /**
     * Fetches the top-most (deepest) component to receive SunDropTargetEvents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Component getMouseEventTarget(int x, int y, boolean includeSelf) {

    /**
     * Fetchs the top-most (deepest) lightweight component that is interested
     * in receiving mouse events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected void processContainerEvent(ContainerEvent e) {

    /**
     * Processes container events occurring on this container by
     * dispatching them to any registered ContainerListener objects.
     * NOTE: This method will not be called unless container events
     * are enabled for this component; this happens when one of the
     * following occurs:
     * <ul>
     * <li>A ContainerListener object is registered via
     *     <code>addContainerListener</code>
     * <li>Container events are enabled via <code>enableEvents</code>
     * </ul>
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the container event
     * @see Component#enableEvents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected void processEvent(AWTEvent e) {

    /**
     * Processes events on this container. If the event is a
     * <code>ContainerEvent</code>, it invokes the
     * <code>processContainerEvent</code> method, else it invokes
     * its superclass's <code>processEvent</code>.
     * <p>Note that if the event parameter is <code>null</code>
     * the behavior is unspecified and may result in an
     * exception.
     *
     * @param e the event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered
     * as <code><em>Foo</em>Listener</code>s
     * upon this <code>Container</code>.
     * <code><em>Foo</em>Listener</code>s are registered using the
     * <code>add<em>Foo</em>Listener</code> method.
     *
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as
     * <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a
     * <code>Container</code> <code>c</code>
     * for its container listeners with the following code:
     *
     * <pre>ContainerListener[] cls = (ContainerListener[])(c.getListeners(ContainerListener.class));</pre>
     *
     * If no such listeners exist, this method returns an empty array.
     *
     * @param listenerType the type of listeners requested; this parameter
     *          should specify an interface that descends from
     *          <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s on this container,
     *          or an empty array if no such listeners have been added
     * @exception ClassCastException if <code>listenerType</code>
     *          doesn't specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     * @exception NullPointerException if {@code listenerType} is {@code null}
     *
     * @see #getContainerListeners
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public synchronized ContainerListener[] getContainerListeners() {

    /**
     * Returns an array of all the container listeners
     * registered on this container.
     *
     * @return all of this container's <code>ContainerListener</code>s
     *         or an empty array if no container
     *         listeners are currently registered
     *
     * @see #addContainerListener
     * @see #removeContainerListener
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public synchronized void removeContainerListener(ContainerListener l) {

    /**
     * Removes the specified container listener so it no longer receives
     * container events from this container.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param   l the container listener
     *
     * @see #addContainerListener
     * @see #getContainerListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public synchronized void addContainerListener(ContainerListener l) {

    /**
     * Adds the specified container listener to receive container events
     * from this container.
     * If l is null, no exception is thrown and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l the container listener
     *
     * @see #removeContainerListener
     * @see #getContainerListeners
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void printHeavyweightComponents(Graphics g) {

    /**
     * Prints all the heavyweight subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void lightweightPrint(Graphics g) {

    /**
     * Simulates the peer callbacks into java.awt for printing of
     * lightweight Containers.
     * @param     g   the graphics context to use for printing.
     * @see       Component#printAll
     * @see       #printComponents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void printComponents(Graphics g) {

    /**
     * Prints each of the components in this container.
     * @param     g   the graphics context.
     * @see       Component#print
     * @see       Component#printAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void paintHeavyweightComponents(Graphics g) {

    /**
     * Prints all the heavyweight subcomponents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void lightweightPaint(Graphics g) {

    /**
     * Simulates the peer callbacks into java.awt for printing of
     * lightweight Containers.
     * @param     g   the graphics context to use for printing.
     * @see       Component#printAll
     * @see       #printComponents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void paintComponents(Graphics g) {

    /**
     * Paints each of the components in this container.
     * @param     g   the graphics context.
     * @see       Component#paint
     * @see       Component#paintAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void print(Graphics g) {

    /**
     * Prints the container. This forwards the print to any lightweight
     * components that are children of this container. If this method is
     * reimplemented, super.print(g) should be called so that lightweight
     * components are properly rendered. If a child component is entirely
     * clipped by the current clipping setting in g, print() will not be
     * forwarded to that child.
     *
     * @param g the specified Graphics window
     * @see   Component#update(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void update(Graphics g) {

    /**
     * Updates the container.  This forwards the update to any lightweight
     * components that are children of this container.  If this method is
     * reimplemented, super.update(g) should be called so that lightweight
     * components are properly rendered.  If a child component is entirely
     * clipped by the current clipping setting in g, update() will not be
     * forwarded to that child.
     *
     * @param g the specified Graphics window
     * @see   Component#update(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void paint(Graphics g) {

    /**
     * Paints the container. This forwards the paint to any lightweight
     * components that are children of this container. If this method is
     * reimplemented, super.paint(g) should be called so that lightweight
     * components are properly rendered. If a child component is entirely
     * clipped by the current clipping setting in g, paint() will not be
     * forwarded to that child.
     *
     * @param g the specified Graphics window
     * @see   Component#update(Graphics)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public float getAlignmentY() {

    /**
     * Returns the alignment along the y axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public float getAlignmentX() {

    /**
     * Returns the alignment along the x axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Dimension getMaximumSize() {

    /**
     * Returns the maximum size of this container.  If the maximum size has
     * not been set explicitly by {@link Component#setMaximumSize(Dimension)}
     * and the {@link LayoutManager} installed on this {@code Container}
     * is an instance of {@link LayoutManager2}, then
     * {@link LayoutManager2#maximumLayoutSize(Container)}
     * is used to calculate the maximum size.
     *
     * <p>Note: some implementations may cache the value returned from the
     * {@code LayoutManager2}.  Implementations that cache need not invoke
     * {@code maximumLayoutSize} on the {@code LayoutManager2} every time
     * this method is invoked, rather the {@code LayoutManager2} will only
     * be queried after the {@code Container} becomes invalid.
     *
     * @return    an instance of <code>Dimension</code> that represents
     *                the maximum size of this container.
     * @see       #getPreferredSize
     * @see       #getMinimumSize
     * @see       #getLayout
     * @see       LayoutManager2#maximumLayoutSize(Container)
     * @see       Component#getMaximumSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getMinimumSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Dimension getMinimumSize() {

    /**
     * Returns the minimum size of this container.  If the minimum size has
     * not been set explicitly by {@link Component#setMinimumSize(Dimension)}
     * and this {@code Container} has a {@code non-null} {@link LayoutManager},
     * then {@link LayoutManager#minimumLayoutSize(Container)}
     * is used to calculate the minimum size.
     *
     * <p>Note: some implementations may cache the value returned from the
     * {@code LayoutManager}.  Implementations that cache need not invoke
     * {@code minimumLayoutSize} on the {@code LayoutManager} every time
     * this method is invoked, rather the {@code LayoutManager} will only
     * be queried after the {@code Container} becomes invalid.
     *
     * @return    an instance of <code>Dimension</code> that represents
     *                the minimum size of this container.
     * @see       #getPreferredSize
     * @see       #getMaximumSize
     * @see       #getLayout
     * @see       LayoutManager#minimumLayoutSize(Container)
     * @see       Component#getMinimumSize
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getPreferredSize()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Dimension getPreferredSize() {

    /**
     * Returns the preferred size of this container.  If the preferred size has
     * not been set explicitly by {@link Component#setPreferredSize(Dimension)}
     * and this {@code Container} has a {@code non-null} {@link LayoutManager},
     * then {@link LayoutManager#preferredLayoutSize(Container)}
     * is used to calculate the preferred size.
     *
     * <p>Note: some implementations may cache the value returned from the
     * {@code LayoutManager}.  Implementations that cache need not invoke
     * {@code preferredLayoutSize} on the {@code LayoutManager} every time
     * this method is invoked, rather the {@code LayoutManager} will only
     * be queried after the {@code Container} becomes invalid.
     *
     * @return    an instance of <code>Dimension</code> that represents
     *                the preferred size of this container.
     * @see       #getMinimumSize
     * @see       #getMaximumSize
     * @see       #getLayout
     * @see       LayoutManager#preferredLayoutSize(Container)
     * @see       Component#getPreferredSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setFont(Font f) {

    /**
     * Sets the font of this container.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param f The font to become this container's font.
     * @see Component#getFont
     * @see #invalidate
     * @since JDK1.0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void invalidateTree() {

    /**
     * Recursively descends the container tree and invalidates all
     * contained components.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected void validateTree() {

    /**
     * Recursively descends the container tree and recomputes the
     * layout for any subtrees marked as needing it (those marked as
     * invalid).  Synchronization should be provided by the method
     * that calls this one:  <code>validate</code>.
     *
     * @see #doLayout
     * @see #validate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final void validateUnconditionally() {

    /**
     * Unconditionally validate the component hierarchy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static boolean descendUnconditionallyWhenValidating = false;

    /**
     * Indicates whether valid containers should also traverse their
     * children and call the validateTree() method on them.
     *
     * Synchronization: TreeLock.
     *
     * The field is allowed to be static as long as the TreeLock itself is
     * static.
     *
     * @see #validateUnconditionally()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void validate() {

    /**
     * Validates this container and all of its subcomponents.
     * <p>
     * Validating a container means laying out its subcomponents.
     * Layout-related changes, such as setting the bounds of a component, or
     * adding a component to the container, invalidate the container
     * automatically.  Note that the ancestors of the container may be
     * invalidated also (see {@link Component#invalidate} for details.)
     * Therefore, to restore the validity of the hierarchy, the {@code
     * validate()} method should be invoked on the top-most invalid
     * container of the hierarchy.
     * <p>
     * Validating the container may be a quite time-consuming operation. For
     * performance reasons a developer may postpone the validation of the
     * hierarchy till a set of layout-related operations completes, e.g. after
     * adding all the children to the container.
     * <p>
     * If this {@code Container} is not valid, this method invokes
     * the {@code validateTree} method and marks this {@code Container}
     * as valid. Otherwise, no action is performed.
     *
     * @see #add(java.awt.Component)
     * @see #invalidate
     * @see Container#isValidateRoot
     * @see javax.swing.JComponent#revalidate()
     * @see #validateTree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Override

    /**
     * Invalidates the container.
     * <p>
     * If the {@code LayoutManager} installed on this container is an instance
     * of the {@code LayoutManager2} interface, then
     * the {@link LayoutManager2#invalidateLayout(Container)} method is invoked
     * on it supplying this {@code Container} as the argument.
     * <p>
     * Afterwards this method marks this container invalid, and invalidates its
     * ancestors. See the {@link Component#invalidate} method for more details.
     *
     * @see #validate
     * @see #layout
     * @see LayoutManager2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Override

    /**
     * Invalidates the parent of the container unless the container
     * is a validate root.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public boolean isValidateRoot() {

    /**
     * Indicates if this container is a <i>validate root</i>.
     * <p>
     * Layout-related changes, such as bounds of the validate root descendants,
     * do not affect the layout of the validate root parent. This peculiarity
     * enables the {@code invalidate()} method to stop invalidating the
     * component hierarchy when the method encounters a validate root. However,
     * to preserve backward compatibility this new optimized behavior is
     * enabled only when the {@code java.awt.smartInvalidate} system property
     * value is set to {@code true}.
     * <p>
     * If a component hierarchy contains validate roots and the new optimized
     * {@code invalidate()} behavior is enabled, the {@code validate()} method
     * must be invoked on the validate root of a previously invalidated
     * component to restore the validity of the hierarchy later. Otherwise,
     * calling the {@code validate()} method on the top-level container (such
     * as a {@code Frame} object) should be used to restore the validity of the
     * component hierarchy.
     * <p>
     * The {@code Window} class and the {@code Applet} class are the validate
     * roots in AWT.  Swing introduces more validate roots.
     *
     * @return whether this container is a validate root
     * @see #invalidate
     * @see java.awt.Component#invalidate
     * @see javax.swing.JComponent#isValidateRoot
     * @see javax.swing.JComponent#revalidate
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>doLayout()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void doLayout() {

    /**
     * Causes this container to lay out its components.  Most programs
     * should not call this method directly, but should invoke
     * the <code>validate</code> method instead.
     * @see LayoutManager#layoutContainer
     * @see #setLayout
     * @see #validate
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setLayout(LayoutManager mgr) {

    /**
     * Sets the layout manager for this container.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     *
     * @param mgr the specified layout manager
     * @see #doLayout
     * @see #getLayout
     * @see #invalidate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public LayoutManager getLayout() {

    /**
     * Gets the layout manager for this container.
     * @see #doLayout
     * @see #setLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void removeAll() {

    /**
     * Removes all the components from this container.
     * This method also notifies the layout manager to remove the
     * components from this container's layout via the
     * <code>removeLayoutComponent</code> method.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * reflect the changes.
     *
     * @see #add
     * @see #remove
     * @see #invalidate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void remove(Component comp) {

    /**
     * Removes the specified component from this container.
     * This method also notifies the layout manager to remove the
     * component from this container's layout via the
     * <code>removeLayoutComponent</code> method.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * reflect the changes.
     *
     * @param comp the component to be removed
     * @throws NullPointerException if {@code comp} is {@code null}
     * @see #add
     * @see #invalidate
     * @see #validate
     * @see #remove(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void remove(int index) {

    /**
     * Removes the component, specified by <code>index</code>,
     * from this container.
     * This method also notifies the layout manager to remove the
     * component from this container's layout via the
     * <code>removeLayoutComponent</code> method.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * reflect the changes.
     *
     *
     * @param     index   the index of the component to be removed
     * @throws ArrayIndexOutOfBoundsException if {@code index} is not in
     *         range {@code [0, getComponentCount()-1]}
     * @see #add
     * @see #invalidate
     * @see #validate
     * @see #getComponentCount
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    void checkGD(String stringID) {

    /**
     * Checks that all Components that this Container contains are on
     * the same GraphicsDevice as this Container.  If not, throws an
     * IllegalArgumentException.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    protected void addImpl(Component comp, Object constraints, int index) {

    /**
     * Adds the specified component to this container at the specified
     * index. This method also notifies the layout manager to add
     * the component to this container's layout using the specified
     * constraints object via the <code>addLayoutComponent</code>
     * method.
     * <p>
     * The constraints are
     * defined by the particular layout manager being used.  For
     * example, the <code>BorderLayout</code> class defines five
     * constraints: <code>BorderLayout.NORTH</code>,
     * <code>BorderLayout.SOUTH</code>, <code>BorderLayout.EAST</code>,
     * <code>BorderLayout.WEST</code>, and <code>BorderLayout.CENTER</code>.
     * <p>
     * The <code>GridBagLayout</code> class requires a
     * <code>GridBagConstraints</code> object.  Failure to pass
     * the correct type of constraints object results in an
     * <code>IllegalArgumentException</code>.
     * <p>
     * If the current layout manager implements {@code LayoutManager2}, then
     * {@link LayoutManager2#addLayoutComponent(Component,Object)} is invoked on
     * it. If the current layout manager does not implement
     * {@code LayoutManager2}, and constraints is a {@code String}, then
     * {@link LayoutManager#addLayoutComponent(String,Component)} is invoked on it.
     * <p>
     * If the component is not an ancestor of this container and has a non-null
     * parent, it is removed from its current parent before it is added to this
     * container.
     * <p>
     * This is the method to override if a program needs to track
     * every add request to a container as all other add methods defer
     * to this one. An overriding method should
     * usually include a call to the superclass's version of the method:
     *
     * <blockquote>
     * <code>super.addImpl(comp, constraints, index)</code>
     * </blockquote>
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     * @param     comp       the component to be added
     * @param     constraints an object expressing layout constraints
     *                 for this component
     * @param     index the position in the container's list at which to
     *                 insert the component, where <code>-1</code>
     *                 means append to the end
     * @exception IllegalArgumentException if {@code index} is invalid;
     *            if {@code comp} is a child of this container, the valid
     *            range is {@code [-1, getComponentCount()-1]}; if component is
     *            not a child of this container, the valid range is
     *            {@code [-1, getComponentCount()]}
     *
     * @exception IllegalArgumentException if {@code comp} is an ancestor of
     *                                     this container
     * @exception IllegalArgumentException if adding a window to a container
     * @exception NullPointerException if {@code comp} is {@code null}
     * @see       #add(Component)
     * @see       #add(Component, int)
     * @see       #add(Component, java.lang.Object)
     * @see #invalidate
     * @see       LayoutManager
     * @see       LayoutManager2
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void add(Component comp, Object constraints, int index) {

    /**
     * Adds the specified component to this container with the specified
     * constraints at the specified index.  Also notifies the layout
     * manager to add the component to the this container's layout using
     * the specified constraints object.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     *
     * @param comp the component to be added
     * @param constraints an object expressing layout constraints for this
     * @param index the position in the container's list at which to insert
     * the component; <code>-1</code> means insert at the end
     * component
     * @exception NullPointerException if {@code comp} is {@code null}
     * @exception IllegalArgumentException if {@code index} is invalid (see
     *            {@link #addImpl} for details)
     * @see #addImpl
     * @see #invalidate
     * @see #validate
     * @see javax.swing.JComponent#revalidate()
     * @see #remove
     * @see LayoutManager
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void add(Component comp, Object constraints) {

    /**
     * Adds the specified component to the end of this container.
     * Also notifies the layout manager to add the component to
     * this container's layout using the specified constraints object.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     *
     * @param     comp the component to be added
     * @param     constraints an object expressing
     *                  layout constraints for this component
     * @exception NullPointerException if {@code comp} is {@code null}
     * @see #addImpl
     * @see #invalidate
     * @see #validate
     * @see javax.swing.JComponent#revalidate()
     * @see       LayoutManager
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public int getComponentZOrder(Component comp) {

    /**
     * Returns the z-order index of the component inside the container.
     * The higher a component is in the z-order hierarchy, the lower
     * its index.  The component with the lowest z-order index is
     * painted last, above all other child components.
     *
     * @param comp the component being queried
     * @return  the z-order index of the component; otherwise
     *          returns -1 if the component is <code>null</code>
     *          or doesn't belong to the container
     * @see #setComponentZOrder(java.awt.Component, int)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void addDelicately(Component comp, Container curParent, int index) {

    /**
     * Adds component to this container. Tries to minimize side effects of this adding -
     * doesn't call remove notify if it is not required.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void reparentChild(Component comp) {

    /**
     * Reparents child component peer to this container peer.
     * Container must be heavyweight.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void reparentTraverse(ContainerPeer parentPeer, Container child) {

    /**
     * Traverses the tree of components and reparents children heavyweight component
     * to new heavyweight parent.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public void setComponentZOrder(Component comp, int index) {

    /**
     * Moves the specified component to the specified z-order index in
     * the container. The z-order determines the order that components
     * are painted; the component with the highest z-order paints first
     * and the component with the lowest z-order paints last.
     * Where components overlap, the component with the lower
     * z-order paints over the component with the higher z-order.
     * <p>
     * If the component is a child of some other container, it is
     * removed from that container before being added to this container.
     * The important difference between this method and
     * <code>java.awt.Container.add(Component, int)</code> is that this method
     * doesn't call <code>removeNotify</code> on the component while
     * removing it from its previous container unless necessary and when
     * allowed by the underlying native windowing system. This way, if the
     * component has the keyboard focus, it maintains the focus when
     * moved to the new position.
     * <p>
     * This property is guaranteed to apply only to lightweight
     * non-<code>Container</code> components.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy.
     * <p>
     * <b>Note</b>: Not all platforms support changing the z-order of
     * heavyweight components from one container into another without
     * the call to <code>removeNotify</code>. There is no way to detect
     * whether a platform supports this, so developers shouldn't make
     * any assumptions.
     *
     * @param     comp the component to be moved
     * @param     index the position in the container's list to
     *            insert the component, where <code>getComponentCount()</code>
     *            appends to the end
     * @exception NullPointerException if <code>comp</code> is
     *            <code>null</code>
     * @exception IllegalArgumentException if <code>comp</code> is one of the
     *            container's parents
     * @exception IllegalArgumentException if <code>index</code> is not in
     *            the range <code>[0, getComponentCount()]</code> for moving
     *            between containers, or not in the range
     *            <code>[0, getComponentCount()-1]</code> for moving inside
     *            a container
     * @exception IllegalArgumentException if adding a container to itself
     * @exception IllegalArgumentException if adding a <code>Window</code>
     *            to a container
     * @see #getComponentZOrder(java.awt.Component)
     * @see #invalidate
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static boolean isRemoveNotifyNeeded(Component comp, Container oldContainer, Container newContainer) {

    /**
     * Detects whether or not remove from current parent and adding to new parent requires call of
     * removeNotify on the component. Since removeNotify destroys native window this might (not)
     * be required. For example, if new container and old containers are the same we don't need to
     * destroy native window.
     * @since: 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    Container getHeavyweightContainer() {

    /**
     * Returns closest heavyweight component to this container. If this container is heavyweight
     * returns this.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final boolean hasLightweightDescendants() {

    /**
     * Checks whether or not this container has lightweight children.
     * Note: Should be called while holding tree lock
     * @return true if there is at least one lightweight children in a container, false otherwise
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    final boolean hasHeavyweightDescendants() {

    /**
     * Checks whether or not this container has heavyweight children.
     * Note: Should be called while holding tree lock
     * @return true if there is at least one heavyweight children in a container, false otherwise
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    boolean canContainFocusOwner(Component focusOwnerCandidate) {

    /**
     * Checks whether this container can contain component which is focus owner.
     * Verifies that container is enable and showing, and if it is focus cycle root
     * its FTP allows component to be focus owner
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean removeDelicately(Component comp, Container newParent, int newIndex) {

    /**
     * Removes component comp from this container without making unneccessary changes
     * and generating unneccessary events. This function intended to perform optimized
     * remove, for example, if newParent and current parent are the same it just changes
     * index without calling removeNotify.
     * Note: Should be called while holding treeLock
     * Returns whether removeNotify was invoked
     * @since: 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void checkAdding(Component comp, int index) {

    /**
     * Checks that the component comp can be added to this container
     * Checks :  index in bounds of container's size,
     * comp is not one of this container's parents,
     * and comp is not a window.
     * Comp and container must be on the same GraphicsDevice.
     * if comp is container, all sub-components must be on
     * same GraphicsDevice.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void checkNotAWindow(Component comp){

    /**
     * Checks that the component is not a Window instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private void checkAddToSelf(Component comp){

    /**
     * Checks that the component
     * isn't supposed to be added into itself.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component add(Component comp, int index) {

    /**
     * Adds the specified component to this container at the given
     * position.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     *
     * @param     comp   the component to be added
     * @param     index    the position at which to insert the component,
     *                   or <code>-1</code> to append the component to the end
     * @exception NullPointerException if {@code comp} is {@code null}
     * @exception IllegalArgumentException if {@code index} is invalid (see
     *            {@link #addImpl} for details)
     * @return    the component <code>comp</code>
     * @see #addImpl
     * @see #remove
     * @see #invalidate
     * @see #validate
     * @see javax.swing.JComponent#revalidate()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component add(String name, Component comp) {

    /**
     * Adds the specified component to this container.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method is obsolete as of 1.1.  Please use the
     * method <code>add(Component, Object)</code> instead.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     * @exception NullPointerException if {@code comp} is {@code null}
     * @see #add(Component, Object)
     * @see #invalidate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component add(Component comp) {

    /**
     * Appends the specified component to the end of this container.
     * This is a convenience method for {@link #addImpl}.
     * <p>
     * This method changes layout-related information, and therefore,
     * invalidates the component hierarchy. If the container has already been
     * displayed, the hierarchy must be validated thereafter in order to
     * display the added component.
     *
     * @param     comp   the component to be added
     * @exception NullPointerException if {@code comp} is {@code null}
     * @see #addImpl
     * @see #invalidate
     * @see #validate
     * @see javax.swing.JComponent#revalidate()
     * @return    the component argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by <code>getInsets()</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Insets getInsets() {

    /**
     * Determines the insets of this container, which indicate the size
     * of the container's border.
     * <p>
     * A <code>Frame</code> object, for example, has a top inset that
     * corresponds to the height of the frame's title bar.
     * @return    the insets of this container.
     * @see       Insets
     * @see       LayoutManager
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component[] getComponents() {

    /**
     * Gets all the components in this container.
     * <p>
     * Note: This method should be called under AWT tree lock.
     *
     * @return    an array of all the components in this container.
     * @see Component#getTreeLock()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Component getComponent(int n) {

    /**
     * Gets the nth component in this container.
     * <p>
     * Note: This method should be called under AWT tree lock.
     *
     * @param      n   the index of the component to get.
     * @return     the n<sup>th</sup> component in this container.
     * @exception  ArrayIndexOutOfBoundsException
     *                 if the n<sup>th</sup> value does not exist.
     * @see Component#getTreeLock()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    @Deprecated

    /**
     * @deprecated As of JDK version 1.1,
     * replaced by getComponentCount().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public int getComponentCount() {

    /**
     * Gets the number of components in this panel.
     * <p>
     * Note: This method should be called under AWT tree lock.
     *
     * @return    the number of components in this panel.
     * @see       #getComponent
     * @since     JDK1.1
     * @see Component#getTreeLock()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    public Container() {

    /**
     * Constructs a new Container. Containers can be extended directly,
     * but are lightweight in this case and must be contained by a parent
     * somewhere higher up in the component tree that is native.
     * (such as Frame for example).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method IDs for fields that may be
       called from C.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField ncomponents                     int
     *       The number of components in this container.
     *       This value can be null.
     * @serialField component                       Component[]
     *       The components in this container.
     * @serialField layoutMgr                       LayoutManager
     *       Layout manager for this container.
     * @serialField dispatcher                      LightweightDispatcher
     *       Event router for lightweight components.  If this container
     *       is native, this dispatcher takes care of forwarding and
     *       retargeting the events to lightweight components contained
     *       (if any).
     * @serialField maxSize                         Dimension
     *       Maximum size of this Container.
     * @serialField focusCycleRoot                  boolean
     *       Indicates whether this Component is the root of a focus traversal cycle.
     *       Once focus enters a traversal cycle, typically it cannot leave it via
     *       focus traversal unless one of the up- or down-cycle keys is pressed.
     *       Normal traversal is limited to this Container, and all of this
     *       Container's descendants that are not descendants of inferior focus cycle
     *       roots.
     * @serialField containerSerializedDataVersion  int
     *       Container Serial Data Version.
     * @serialField focusTraversalPolicyProvider    boolean
     *       Stores the value of focusTraversalPolicyProvider property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    static final boolean SEARCH_HEAVYWEIGHTS = true;

    /**
     * A constant which toggles one of the controllable behaviors
     * of <code>getMouseEventTarget</code>. It is used to specify whether
     * the method should search only lightweight components.
     *
     * @see #getMouseEventTarget(int, int, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    static final boolean INCLUDE_SELF = true;

    /**
     * A constant which toggles one of the controllable behaviors
     * of <code>getMouseEventTarget</code>. It is used to specify whether
     * the method can return the Container on which it is originally called
     * in case if none of its children are the current mouse event targets.
     *
     * @see #getMouseEventTarget(int, int, boolean)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private static final long serialVersionUID = 4613797578919906343L;

    /**
     * JDK 1.1 serialVersionUID
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean focusTraversalPolicyProvider;

    /**
     * Stores the value of focusTraversalPolicyProvider property.
     * @since 1.5
     * @see #setFocusTraversalPolicyProvider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private boolean focusCycleRoot = false;

    /**
     * Indicates whether this Component is the root of a focus traversal cycle.
     * Once focus enters a traversal cycle, typically it cannot leave it via
     * focus traversal unless one of the up- or down-cycle keys is pressed.
     * Normal traversal is limited to this Container, and all of this
     * Container's descendants that are not descendants of inferior focus cycle
     * roots.
     *
     * @see #setFocusCycleRoot
     * @see #isFocusCycleRoot
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private transient FocusTraversalPolicy focusTraversalPolicy;

    /**
     * The focus traversal policy that will manage keyboard traversal of this
     * Container's children, if this Container is a focus cycle root. If the
     * value is null, this Container inherits its policy from its focus-cycle-
     * root ancestor. If all such ancestors of this Container have null
     * policies, then the current KeyboardFocusManager's default policy is
     * used. If the value is non-null, this policy will be inherited by all
     * focus-cycle-root children that have no keyboard-traversal policy of
     * their own (as will, recursively, their focus-cycle-root children).
     * <p>
     * If this Container is not a focus cycle root, the value will be
     * remembered, but will not be used or inherited by this or any other
     * Containers until this Container is made a focus cycle root.
     *
     * @see #setFocusTraversalPolicy
     * @see #getFocusTraversalPolicy
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private LightweightDispatcher dispatcher;

    /**
     * Event router for lightweight components.  If this container
     * is native, this dispatcher takes care of forwarding and
     * retargeting the events to lightweight components contained
     * (if any).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    LayoutManager layoutMgr;

    /**
     * Layout manager for this container.
     * @see #doLayout
     * @see #setLayout
     * @see #getLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
    private java.util.List<Component> component = new ArrayList<>();

    /**
     * The components in this container.
     * @see #add
     * @see #getComponents
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/Container.java
public class Container extends Component {

/**
 * A generic Abstract Window Toolkit(AWT) container object is a component
 * that can contain other AWT components.
 * <p>
 * Components added to a container are tracked in a list.  The order
 * of the list will define the components' front-to-back stacking order
 * within the container.  If no index is specified when adding a
 * component to a container, it will be added to the end of the list
 * (and hence to the bottom of the stacking order).
 * <p>
 * <b>Note</b>: For details on the focus subsystem, see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/misc/focus.html">
 * How to Use the Focus Subsystem</a>,
 * a section in <em>The Java Tutorial</em>, and the
 * <a href="../../java/awt/doc-files/FocusSpec.html">Focus Specification</a>
 * for more information.
 *
 * @author      Arthur van Hoff
 * @author      Sami Shaio
 * @see       #add(java.awt.Component, int)
 * @see       #getComponent(int)
 * @see       LayoutManager
 * @since     JDK1.0
 */
