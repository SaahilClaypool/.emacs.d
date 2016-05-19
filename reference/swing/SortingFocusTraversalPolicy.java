_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    protected boolean accept(Component aComponent) {

    /**
     * Determines whether a Component is an acceptable choice as the new
     * focus owner. By default, this method will accept a Component if and
     * only if it is visible, displayable, enabled, and focusable.
     *
     * @param aComponent the Component whose fitness as a focus owner is to
     *        be tested
     * @return <code>true</code> if aComponent is visible, displayable,
     *         enabled, and focusable; <code>false</code> otherwise
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    protected Comparator<? super Component> getComparator() {

    /**
     * Returns the Comparator which will be used to sort the Components in a
     * focus traversal cycle.
     *
     * @return the Comparator which will be used for sorting
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    protected void setComparator(Comparator<? super Component> comparator) {

    /**
     * Sets the Comparator which will be used to sort the Components in a
     * focus traversal cycle.
     *
     * @param comparator the Comparator which will be used for sorting
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    public boolean getImplicitDownCycleTraversal() {

    /**
     * Returns whether this SortingFocusTraversalPolicy transfers focus down-
     * cycle implicitly. If <code>true</code>, during normal focus
     * traversal, the Component traversed after a focus cycle root will be the
     * focus-cycle-root's default Component to focus. If <code>false</code>,
     * the next Component in the focus traversal cycle rooted at the specified
     * focus cycle root will be traversed instead.
     *
     * @return whether this SortingFocusTraversalPolicy transfers focus down-
     *         cycle implicitly
     * @see #setImplicitDownCycleTraversal
     * @see #getFirstComponent
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    public void setImplicitDownCycleTraversal(boolean implicitDownCycleTraversal) {

    /**
     * Sets whether this SortingFocusTraversalPolicy transfers focus down-cycle
     * implicitly. If <code>true</code>, during normal focus traversal,
     * the Component traversed after a focus cycle root will be the focus-
     * cycle-root's default Component to focus. If <code>false</code>, the
     * next Component in the focus traversal cycle rooted at the specified
     * focus cycle root will be traversed instead. The default value for this
     * property is <code>true</code>.
     *
     * @param implicitDownCycleTraversal whether this
     *        SortingFocusTraversalPolicy transfers focus down-cycle implicitly
     * @see #getImplicitDownCycleTraversal
     * @see #getFirstComponent
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    public Component getDefaultComponent(Container aContainer) {

    /**
     * Returns the default Component to focus. This Component will be the first
     * to receive focus when traversing down into a new focus traversal cycle
     * rooted at aContainer. The default implementation of this method
     * returns the same Component as <code>getFirstComponent</code>.
     *
     * @param aContainer a focus cycle root of aComponent or a focus traversal policy provider whose
     *        default Component is to be returned
     * @return the default Component in the traversal cycle of aContainer,
     *         or null if no suitable Component can be found
     * @see #getFirstComponent
     * @throws IllegalArgumentException if aContainer is null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    public Component getLastComponent(Container aContainer) {

    /**
     * Returns the last Component in the traversal cycle. This method is used
     * to determine the next Component to focus when traversal wraps in the
     * reverse direction.
     *
     * @param aContainer a focus cycle root of aComponent or a focus traversal policy provider whose
     *        last Component is to be returned
     * @return the last Component in the traversal cycle of aContainer,
     *         or null if no suitable Component can be found
     * @throws IllegalArgumentException if aContainer is null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    public Component getFirstComponent(Container aContainer) {

    /**
     * Returns the first Component in the traversal cycle. This method is used
     * to determine the next Component to focus when traversal wraps in the
     * forward direction.
     *
     * @param aContainer a focus cycle root of aComponent or a focus traversal policy provider whose
     *        first Component is to be returned
     * @return the first Component in the traversal cycle of aContainer,
     *         or null if no suitable Component can be found
     * @throws IllegalArgumentException if aContainer is null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    public Component getComponentBefore(Container aContainer, Component aComponent) {

    /**
     * Returns the Component that should receive the focus before aComponent.
     * aContainer must be a focus cycle root of aComponent or a focus traversal policy provider.
     * <p>
     * By default, SortingFocusTraversalPolicy implicitly transfers focus down-
     * cycle. That is, during normal focus traversal, the Component
     * traversed after a focus cycle root will be the focus-cycle-root's
     * default Component to focus. This behavior can be disabled using the
     * <code>setImplicitDownCycleTraversal</code> method.
     * <p>
     * If aContainer is <a href="../../java/awt/doc-files/FocusSpec.html#FocusTraversalPolicyProviders">focus
     * traversal policy provider</a>, the focus is always transferred down-cycle.
     *
     * @param aContainer a focus cycle root of aComponent or a focus traversal policy provider
     * @param aComponent a (possibly indirect) child of aContainer, or
     *        aContainer itself
     * @return the Component that should receive the focus before aComponent,
     *         or null if no suitable Component can be found
     * @throws IllegalArgumentException if aContainer is not a focus cycle
     *         root of aComponent or a focus traversal policy provider, or if either aContainer or
     *         aComponent is null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    public Component getComponentAfter(Container aContainer, Component aComponent) {

    /**
     * Returns the Component that should receive the focus after aComponent.
     * aContainer must be a focus cycle root of aComponent or a focus traversal policy provider.
     * <p>
     * By default, SortingFocusTraversalPolicy implicitly transfers focus down-
     * cycle. That is, during normal focus traversal, the Component
     * traversed after a focus cycle root will be the focus-cycle-root's
     * default Component to focus. This behavior can be disabled using the
     * <code>setImplicitDownCycleTraversal</code> method.
     * <p>
     * If aContainer is <a href="../../java/awt/doc-files/FocusSpec.html#FocusTraversalPolicyProviders">focus
     * traversal policy provider</a>, the focus is always transferred down-cycle.
     *
     * @param aContainer a focus cycle root of aComponent or a focus traversal policy provider
     * @param aComponent a (possibly indirect) child of aContainer, or
     *        aContainer itself
     * @return the Component that should receive the focus after aComponent, or
     *         null if no suitable Component can be found
     * @throws IllegalArgumentException if aContainer is not a focus cycle
     *         root of aComponent or a focus traversal policy provider, or if either aContainer or
     *         aComponent is null
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    public SortingFocusTraversalPolicy(Comparator<? super Component> comparator) {

    /**
     * Constructs a SortingFocusTraversalPolicy with the specified Comparator.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    protected SortingFocusTraversalPolicy() {

    /**
     * Constructs a SortingFocusTraversalPolicy without a Comparator.
     * Subclasses must set the Comparator using <code>setComparator</code>
     * before installing this FocusTraversalPolicy on a focus cycle root or
     * KeyboardFocusManager.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
    transient private Container cachedRoot;

    /**
     * Used by getComponentAfter and getComponentBefore for efficiency. In
     * order to maintain compliance with the specification of
     * FocusTraversalPolicy, if traversal wraps, we should invoke
     * getFirstComponent or getLastComponent. These methods may be overriden in
     * subclasses to behave in a non-generic way. However, in the generic case,
     * these methods will simply return the first or last Components of the
     * sorted list, respectively. Since getComponentAfter and
     * getComponentBefore have already built the sorted list before determining
     * that they need to invoke getFirstComponent or getLastComponent, the
     * sorted list should be reused if possible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//SortingFocusTraversalPolicy.java
public class SortingFocusTraversalPolicy

/**
 * A FocusTraversalPolicy that determines traversal order by sorting the
 * Components of a focus traversal cycle based on a given Comparator. Portions
 * of the Component hierarchy that are not visible and displayable will not be
 * included.
 * <p>
 * By default, SortingFocusTraversalPolicy implicitly transfers focus down-
 * cycle. That is, during normal focus traversal, the Component
 * traversed after a focus cycle root will be the focus-cycle-root's default
 * Component to focus. This behavior can be disabled using the
 * <code>setImplicitDownCycleTraversal</code> method.
 * <p>
 * By default, methods of this class with return a Component only if it is
 * visible, displayable, enabled, and focusable. Subclasses can modify this
 * behavior by overriding the <code>accept</code> method.
 * <p>
 * This policy takes into account <a
 * href="../../java/awt/doc-files/FocusSpec.html#FocusTraversalPolicyProviders">focus traversal
 * policy providers</a>.  When searching for first/last/next/previous Component,
 * if a focus traversal policy provider is encountered, its focus traversal
 * policy is used to perform the search operation.
 *
 * @author David Mendenhall
 *
 * @see java.util.Comparator
 * @since 1.4
 */
