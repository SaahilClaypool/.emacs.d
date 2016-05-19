_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public boolean isLinked(int axis) {

        /**
         * Returns true if this component has its size linked to
         * other components.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        boolean updateVisibility() {

        /**
         * Updates the cached visibility.
         *
         * @return true if the visibility changed
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private class ComponentInfo {

    /**
     * Tracks the horizontal/vertical Springs for a Component.
     * This class is also used to handle Springs that have their sizes
     * linked.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private class ContainerAutoPreferredGapSpring extends

    /**
     * An extension of AutopaddingSpring used for container level padding.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private final static class AutoPreferredGapMatch {

    /**
     * Represents two springs that should have autopadding inserted between
     * them.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private class AutoPreferredGapSpring extends Spring {

    /**
     * Spring reprensenting the distance between any number of sources and
     * targets.  The targets and sources are computed during layout.  An
     * instance of this can either be dynamically created when
     * autocreatePadding is true, or explicitly created by the developer.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private class GapSpring extends Spring {

    /**
     * Spring represented a certain amount of space.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private class PreferredGapSpring extends Spring {

    /**
     * Spring representing the preferred distance between two components.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        private void baselineLayout(int origin, int size) {

        /**
         * Lays out springs that have a baseline along the baseline.  All
         * others are centered.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private class BaselineGroup extends ParallelGroup {

    /**
     * An extension of {@code ParallelGroup} that aligns its
     * constituent {@code Spring}s along the baseline.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public ParallelGroup addComponent(Component component,
                Alignment alignment, int min, int pref, int max) {

        /**
         * Adds a {@code Component} to this {@code ParallelGroup} with the
         * specified alignment and size.
         *
         * @param alignment the alignment
         * @param component the {@code Component} to add
         * @param min the minimum size
         * @param pref the preferred size
         * @param max the maximum size
         * @throws IllegalArgumentException if {@code alignment} is
         *         {@code null}
         * @return this {@code Group}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public ParallelGroup addComponent(Component component,
                Alignment alignment) {

        /**
         * Adds a {@code Component} to this {@code ParallelGroup} with
         * the specified alignment.
         *
         * @param alignment the alignment
         * @param component the {@code Component} to add
         * @return this {@code Group}
         * @throws IllegalArgumentException if {@code alignment} is
         *         {@code null}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public ParallelGroup addGroup(Alignment alignment, Group group) {

        /**
         * Adds a {@code Group} to this {@code ParallelGroup} with the
         * specified alignment. If the child is smaller than the
         * {@code Group} it is aligned based on the specified
         * alignment.
         *
         * @param alignment the alignment
         * @param group the {@code Group} to add
         * @return this {@code ParallelGroup}
         * @throws IllegalArgumentException if {@code alignment} is
         *         {@code null}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public ParallelGroup addGap(int min, int pref, int max) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public ParallelGroup addGap(int pref) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public ParallelGroup addComponent(Component component, int min, int pref,
                int max) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public ParallelGroup addComponent(Component component) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public ParallelGroup addGroup(Group group) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public class ParallelGroup extends Group {

    /**
     * A {@code Group} that aligns and sizes it's children.
     * {@code ParallelGroup} aligns it's children in
     * four possible ways: along the baseline, centered, anchored to the
     * leading edge, or anchored to the trailing edge.
     * <h3>Baseline</h3>
     * A {@code ParallelGroup} that aligns it's children along the
     * baseline must first decide where the baseline is
     * anchored. The baseline can either be anchored to the top, or
     * anchored to the bottom of the group. That is, the distance between the
     * baseline and the beginning of the group can be a constant
     * distance, or the distance between the end of the group and the
     * baseline can be a constant distance. The possible choices
     * correspond to the {@code BaselineResizeBehavior} constants
     * {@link
     * java.awt.Component.BaselineResizeBehavior#CONSTANT_ASCENT CONSTANT_ASCENT} and
     * {@link
     * java.awt.Component.BaselineResizeBehavior#CONSTANT_DESCENT CONSTANT_DESCENT}.
     * <p>
     * The baseline anchor may be explicitly specified by the
     * {@code createBaselineGroup} method, or determined based on the elements.
     * If not explicitly specified, the baseline will be anchored to
     * the bottom if all the elements with a baseline, and that are
     * aligned to the baseline, have a baseline resize behavior of
     * {@code CONSTANT_DESCENT}; otherwise the baseline is anchored to the top
     * of the group.
     * <p>
     * Elements aligned to the baseline are resizable if they have have
     * a baseline resize behavior of {@code CONSTANT_ASCENT} or
     * {@code CONSTANT_DESCENT}. Elements with a baseline resize
     * behavior of {@code OTHER} or {@code CENTER_OFFSET} are not resizable.
     * <p>
     * The baseline is calculated based on the preferred height of each
     * of the elements that have a baseline. The baseline is
     * calculated using the following algorithm:
     * {@code max(maxNonBaselineHeight, maxAscent + maxDescent)}, where the
     * {@code maxNonBaselineHeight} is the maximum height of all elements
     * that do not have a baseline, or are not aligned along the baseline.
     * {@code maxAscent} is the maximum ascent (baseline) of all elements that
     * have a baseline and are aligned along the baseline.
     * {@code maxDescent} is the maximum descent (preferred height - baseline)
     * of all elements that have a baseline and are aligned along the baseline.
     * <p>
     * A {@code ParallelGroup} that aligns it's elements along the baseline
     * is only useful along the vertical axis. If you create a
     * baseline group and use it along the horizontal axis an
     * {@code IllegalStateException} is thrown when you ask
     * {@code GroupLayout} for the minimum, preferred or maximum size or
     * attempt to layout the components.
     * <p>
     * Elements that are not aligned to the baseline and smaller than the size
     * of the {@code ParallelGroup} are positioned in one of three
     * ways: centered, anchored to the leading edge, or anchored to the
     * trailing edge.
     *
     * <h3>Non-baseline {@code ParallelGroup}</h3>
     * {@code ParallelGroup}s created with an alignment other than
     * {@code BASELINE} align elements that are smaller than the size
     * of the group in one of three ways: centered, anchored to the
     * leading edge, or anchored to the trailing edge.
     * <p>
     * The leading edge is based on the axis and {@code
     * ComponentOrientation}.  For the vertical axis the top edge is
     * always the leading edge, and the bottom edge is always the
     * trailing edge. When the {@code ComponentOrientation} is {@code
     * LEFT_TO_RIGHT}, the leading edge is the left edge and the
     * trailing edge the right edge. A {@code ComponentOrientation} of
     * {@code RIGHT_TO_LEFT} flips the left and right edges. Child
     * elements are aligned based on the specified alignment the
     * element was added with. If you do not specify an alignment, the
     * alignment specified for the {@code ParallelGroup} is used.
     * <p>
     * To align elements along the baseline you {@code createBaselineGroup},
     * or {@code createParallelGroup} with an alignment of {@code BASELINE}.
     * If the group was not created with a baseline alignment, and you attempt
     * to add an element specifying a baseline alignment, an
     * {@code IllegalArgumentException} is thrown.
     *
     * @see #createParallelGroup()
     * @see #createBaselineGroup(boolean,boolean)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private static final class SpringDelta implements Comparable<SpringDelta> {

    /**
     * Used by SequentialGroup in calculating resizability of springs.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        private List<SpringDelta> buildResizableList(int axis,
                boolean useMin) {

        /**
         * Returns the sorted list of SpringDelta's for the current set of
         * Springs. The list is ordered based on the amount of flexibility of
         * the springs.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addContainerGap(int pref, int max) {

        /**
         * Adds an element representing the preferred gap between one
         * edge of the container and the next or previous {@code
         * Component} with the specified size. This has no
         * effect if the next or previous element is not a {@code
         * Component} and does not touch one edge of the parent
         * container.
         *
         * @param pref the preferred size; one of {@code DEFAULT_SIZE} or a
         *              value &gt;= 0
         * @param max the maximum size; one of {@code DEFAULT_SIZE},
         *        {@code PREFERRED_SIZE} or a value &gt;= 0
         * @return this {@code SequentialGroup}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addContainerGap() {

        /**
         * Adds an element representing the preferred gap between an edge
         * the container and components that touch the border of the
         * container. This has no effect if the added gap does not
         * touch an edge of the parent container.
         * <p>
         * The element created to represent the gap is not
         * resizable.
         *
         * @return this {@code SequentialGroup}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addPreferredGap(ComponentPlacement type,
                int pref, int max) {

        /**
         * Adds an element representing the preferred gap between the
         * nearest components.  During layout, neighboring
         * components are found, and the minimum of this
         * gap is set based on the size of the preferred gap between the
         * neighboring components.  If no neighboring components are found the
         * minimum size is set to 0.
         *
         * @param type the type of gap; one of
         *        {@code LayoutStyle.ComponentPlacement.RELATED} or
         *        {@code LayoutStyle.ComponentPlacement.UNRELATED}
         * @param pref the preferred size of the grap; one of
         *        {@code DEFAULT_SIZE} or a value &gt;= 0
         * @param max the maximum size of the gap; one of
         *        {@code DEFAULT_SIZE}, {@code PREFERRED_SIZE}
         *        or a value &gt;= 0
         * @return this {@code SequentialGroup}
         * @throws IllegalArgumentException if {@code type} is not one of
         *         {@code LayoutStyle.ComponentPlacement.RELATED} or
         *         {@code LayoutStyle.ComponentPlacement.UNRELATED}
         * @see LayoutStyle
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addPreferredGap(ComponentPlacement type) {

        /**
         * Adds an element representing the preferred gap between the
         * nearest components.  During layout, neighboring
         * components are found, and the size of the added gap is set
         * based on the preferred gap between the components.  If no
         * neighboring components are found the gap has a size of {@code 0}.
         * <p>
         * The element created to represent the gap is not
         * resizable.
         *
         * @param type the type of gap; one of
         *        {@code LayoutStyle.ComponentPlacement.RELATED} or
         *        {@code LayoutStyle.ComponentPlacement.UNRELATED}
         * @return this {@code SequentialGroup}
         * @see LayoutStyle
         * @throws IllegalArgumentException if {@code type} is not one of
         *         {@code LayoutStyle.ComponentPlacement.RELATED} or
         *         {@code LayoutStyle.ComponentPlacement.UNRELATED}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addPreferredGap(JComponent comp1,
                JComponent comp2, ComponentPlacement type, int pref,
                int max) {

        /**
         * Adds an element representing the preferred gap between two
         * components.
         *
         * @param comp1 the first component
         * @param comp2 the second component
         * @param type the type of gap
         * @param pref the preferred size of the grap; one of
         *        {@code DEFAULT_SIZE} or a value &gt;= 0
         * @param max the maximum size of the gap; one of
         *        {@code DEFAULT_SIZE}, {@code PREFERRED_SIZE}
         *        or a value &gt;= 0
         * @return this {@code SequentialGroup}
         * @throws IllegalArgumentException if {@code type}, {@code comp1} or
         *         {@code comp2} is {@code null}
         * @see LayoutStyle
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addPreferredGap(JComponent comp1,
                JComponent comp2, ComponentPlacement type) {

        /**
         * Adds an element representing the preferred gap between two
         * components. The element created to represent the gap is not
         * resizable.
         *
         * @param comp1 the first component
         * @param comp2 the second component
         * @param type the type of gap; one of the constants defined by
         *        {@code LayoutStyle}
         * @return this {@code SequentialGroup}
         * @throws IllegalArgumentException if {@code type}, {@code comp1} or
         *         {@code comp2} is {@code null}
         * @see LayoutStyle
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addGap(int min, int pref, int max) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addGap(int size) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addComponent(boolean useAsBaseline,
                Component component, int min, int pref, int max) {

        /**
         * Adds a {@code Component} to this {@code Group}
         * with the specified size.
         *
         * @param useAsBaseline whether the specified {@code Component} should
         *        be used to calculate the baseline for this {@code Group}
         * @param component the {@code Component} to add
         * @param min the minimum size or one of {@code DEFAULT_SIZE} or
         *            {@code PREFERRED_SIZE}
         * @param pref the preferred size or one of {@code DEFAULT_SIZE} or
         *            {@code PREFERRED_SIZE}
         * @param max the maximum size or one of {@code DEFAULT_SIZE} or
         *            {@code PREFERRED_SIZE}
         * @return this {@code Group}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addComponent(Component component, int min,
                int pref, int max) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addComponent(boolean useAsBaseline,
                Component component) {

        /**
         * Adds a {@code Component} to this {@code Group}.
         *
         * @param useAsBaseline whether the specified {@code Component} should
         *        be used to calculate the baseline for this {@code Group}
         * @param component the {@code Component} to add
         * @return this {@code Group}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addComponent(Component component) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addGroup(boolean useAsBaseline, Group group) {

        /**
         * Adds a {@code Group} to this {@code Group}.
         *
         * @param group the {@code Group} to add
         * @param useAsBaseline whether the specified {@code Group} should
         *        be used to calculate the baseline for this {@code Group}
         * @return this {@code Group}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public SequentialGroup addGroup(Group group) {

        /**
         * {@inheritDoc}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public class SequentialGroup extends Group {

    /**
     * A {@code Group} that positions and sizes its elements
     * sequentially, one after another.  This class has no public
     * constructor, use the {@code createSequentialGroup} method
     * to create one.
     * <p>
     * In order to align a {@code SequentialGroup} along the baseline
     * of a baseline aligned {@code ParallelGroup} you need to specify
     * which of the elements of the {@code SequentialGroup} is used to
     * determine the baseline.  The element used to calculate the
     * baseline is specified using one of the {@code add} methods that
     * take a {@code boolean}. The last element added with a value of
     * {@code true} for {@code useAsBaseline} is used to calculate the
     * baseline.
     *
     * @see #createSequentialGroup
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        void removeAutopadding() {

        /**
         * Removes any AutopaddingSprings for this Group and its children.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        abstract void insertAutopadding(int axis,
                List<AutoPreferredGapSpring> leadingPadding,
                List<AutoPreferredGapSpring> trailingPadding,
                List<ComponentSpring> leading, List<ComponentSpring> trailing,
                boolean insert);

        /**
         * Adjusts the autopadding springs in this group and its children.
         * If {@code insert} is true this will insert auto padding
         * springs, otherwise this will only adjust the springs that
         * comprise auto preferred padding springs.
         *
         * @param axis the axis of the springs; HORIZONTAL or VERTICAL
         * @param leadingPadding List of AutopaddingSprings that occur before
         *                       this Group
         * @param trailingPadding any trailing autopadding springs are added
         *                        to this on exit
         * @param leading List of ComponentSprings that occur before this Group
         * @param trailing any trailing ComponentSpring are added to this
         *                 List
         * @param insert Whether or not to insert AutopaddingSprings or just
         *               adjust any existing AutopaddingSprings.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        abstract int operator(int a, int b);

        /**
         * Used to compute how the two values representing two springs
         * will be combined.  For example, a group that layed things out
         * one after the next would return {@code a + b}.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        int calculateSize(int axis, int type) {

        /**
         * Calculates the specified size.  This is called from
         * one of the {@code getMinimumSize0},
         * {@code getPreferredSize0} or
         * {@code getMaximumSize0} methods.  This will invoke
         * to {@code operator} to combine the values.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        abstract void setValidSize(int axis, int origin, int size);

        /**
         * This is invoked from {@code setSize} if passed a value
         * other than UNSET.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        Group addSpring(Spring spring) {

        /**
         * Adds the Spring to the list of {@code Spring}s and returns
         * the receiver.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public Group addGap(int min, int pref, int max) {

        /**
         * Adds a gap to this {@code Group} with the specified size.
         *
         * @param min the minimum size of the gap
         * @param pref the preferred size of the gap
         * @param max the maximum size of the gap
         * @throws IllegalArgumentException if any of the values are
         *         less than {@code 0}
         * @return this {@code Group}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public Group addGap(int size) {

        /**
         * Adds a rigid gap to this {@code Group}.
         *
         * @param size the size of the gap
         * @return this {@code Group}
         * @throws IllegalArgumentException if {@code size} is less than
         *         {@code 0}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public Group addComponent(Component component, int min, int pref,
                int max) {

        /**
         * Adds a {@code Component} to this {@code Group}
         * with the specified size.
         *
         * @param component the {@code Component} to add
         * @param min the minimum size or one of {@code DEFAULT_SIZE} or
         *            {@code PREFERRED_SIZE}
         * @param pref the preferred size or one of {@code DEFAULT_SIZE} or
         *            {@code PREFERRED_SIZE}
         * @param max the maximum size or one of {@code DEFAULT_SIZE} or
         *            {@code PREFERRED_SIZE}
         * @return this {@code Group}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public Group addComponent(Component component) {

        /**
         * Adds a {@code Component} to this {@code Group}.
         *
         * @param component the {@code Component} to add
         * @return this {@code Group}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        public Group addGroup(Group group) {

        /**
         * Adds a {@code Group} to this {@code Group}.
         *
         * @param group the {@code Group} to add
         * @return this {@code Group}
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public abstract class Group extends Spring {

    /**
     * {@code Group} provides the basis for the two types of
     * operations supported by {@code GroupLayout}: laying out
     * components one after another ({@link SequentialGroup SequentialGroup})
     * or aligned ({@link ParallelGroup ParallelGroup}). {@code Group} and
     * its subclasses have no public constructor; to create one use
     * one of {@code createSequentialGroup} or
     * {@code createParallelGroup}. Additionally, taking a {@code Group}
     * created from one {@code GroupLayout} and using it with another
     * will produce undefined results.
     * <p>
     * Various methods in {@code Group} and its subclasses allow you
     * to explicitly specify the range. The arguments to these methods
     * can take two forms, either a value greater than or equal to 0,
     * or one of {@code DEFAULT_SIZE} or {@code PREFERRED_SIZE}. A
     * value greater than or equal to {@code 0} indicates a specific
     * size. {@code DEFAULT_SIZE} indicates the corresponding size
     * from the component should be used.  For example, if {@code
     * DEFAULT_SIZE} is passed as the minimum size argument, the
     * minimum size is obtained from invoking {@code getMinimumSize}
     * on the component. Likewise, {@code PREFERRED_SIZE} indicates
     * the value from {@code getPreferredSize} should be used.
     * The following example adds {@code myComponent} to {@code group}
     * with specific values for the range. That is, the minimum is
     * explicitly specified as 100, preferred as 200, and maximum as
     * 300.
     * <pre>
     *   group.addComponent(myComponent, 100, 200, 300);
     * </pre>
     * The following example adds {@code myComponent} to {@code group} using
     * a combination of the forms. The minimum size is forced to be the
     * same as the preferred size, the preferred size is determined by
     * using {@code myComponent.getPreferredSize} and the maximum is
     * determined by invoking {@code getMaximumSize} on the component.
     * <pre>
     *   group.addComponent(myComponent, GroupLayout.PREFERRED_SIZE,
     *             GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE);
     * </pre>
     * <p>
     * Unless otherwise specified all the methods of {@code Group} and
     * its subclasses that allow you to specify a range throw an
     * {@code IllegalArgumentException} if passed an invalid range. An
     * invalid range is one in which any of the values are &lt; 0 and
     * not one of {@code PREFERRED_SIZE} or {@code DEFAULT_SIZE}, or
     * the following is not met (for specific values): {@code min}
     * &lt;= {@code pref} &lt;= {@code max}.
     * <p>
     * Similarly any methods that take a {@code Component} throw a
     * {@code IllegalArgumentException} if passed {@code null} and any methods
     * that take a {@code Group} throw an {@code NullPointerException} if
     * passed {@code null}.
     *
     * @see #createSequentialGroup
     * @see #createParallelGroup
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        abstract boolean willHaveZeroSize(boolean treatAutopaddingAsZeroSized);

        /**
         * Returns {@code true} if this spring will ALWAYS have a zero
         * size. This should NOT check the current size, rather it's
         * meant to quickly test if this Spring will always have a
         * zero size.
         *
         * @param treatAutopaddingAsZeroSized if {@code true}, auto padding
         *        springs should be treated as having a size of {@code 0}
         * @return {@code true} if this spring will have a zero size,
         *         {@code false} otherwise
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        int getSize() {

        /**
         * Returns the current size.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        void unset() {

        /**
         * Resets the cached min/max/pref.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        void setSize(int axis, int origin, int size) {

        /**
         * Sets the value and location of the spring.  Subclasses
         * will want to invoke super, then do any additional sizing.
         *
         * @param axis HORIZONTAL or VERTICAL
         * @param origin of this Spring
         * @param size of the Spring.  If size is UNSET, this invokes
         *        clear.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        final int getMaximumSize(int axis) {

        /**
         * Returns the maximum size.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        final int getPreferredSize(int axis) {

        /**
         * Returns the preferred size.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        final int getMinimumSize(int axis) {

        /**
         * Returns the minimum size.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        Alignment getAlignment() {

        /**
         * Alignment for this Spring, this may be null.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        Spring getParent() {

        /**
         * Returns the parent of this spring.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        void setParent(Spring parent) {

        /**
         * Sets the parent of this Spring.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        abstract int calculateMaximumSize(int axis);

        /**
         * Calculates and returns the minimum size.
         *
         * @param axis the axis of layout; one of HORIZONTAL or VERTICAL
         * @return the minimum size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        abstract int calculatePreferredSize(int axis);

        /**
         * Calculates and returns the preferred size.
         *
         * @param axis the axis of layout; one of HORIZONTAL or VERTICAL
         * @return the preferred size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        abstract int calculateMinimumSize(int axis);

        /**
         * Calculates and returns the minimum size.
         *
         * @param axis the axis of layout; one of HORIZONTAL or VERTICAL
         * @return the minimum size
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private abstract class Spring {

    /**
     * Spring consists of a range: min, pref and max, a value some where in
     * the middle of that, and a location. Spring caches the
     * min/max/pref.  If the min/pref/max has internally changes, or needs
     * to be updated you must invoke clear.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public String toString() {

    /**
     * Returns a string representation of this {@code GroupLayout}.
     * This method is intended to be used for debugging purposes,
     * and the content and format of the returned string may vary
     * between implementations.
     *
     * @return a string representation of this {@code GroupLayout}
     **/
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private boolean areParallelSiblings(Component source, Component target,
            int axis) {

    /**
     * Returns {@code true} if the two Components have a common ParallelGroup
     * ancestor along the particular axis.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private void insertAutopadding(boolean insert) {

    /**
     * Adjusts the autopadding springs for the horizontal and vertical
     * groups.  If {@code insert} is {@code true} this will insert auto padding
     * springs, otherwise this will only adjust the springs that
     * comprise auto preferred padding springs.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private ComponentInfo getComponentInfo(Component component) {

    /**
     * Returns the {@code ComponentInfo} for the specified Component,
     * creating one if necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void invalidateLayout(Container parent) {

    /**
     * Invalidates the layout, indicating that if the layout manager
     * has cached information it should be discarded.
     *
     * @param parent the {@code Container} hosting this LayoutManager
     * @throws IllegalArgumentException if {@code parent} is not
     *         the same {@code Container} that this was created with
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public float getLayoutAlignmentY(Container parent) {

    /**
     * Returns the alignment along the y axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     *
     * @param parent the {@code Container} hosting this {@code LayoutManager}
     * @throws IllegalArgumentException if {@code parent} is not
     *         the same {@code Container} that this was created with
     * @return alignment; this implementation returns {@code .5}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public float getLayoutAlignmentX(Container parent) {

    /**
     * Returns the alignment along the x axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     *
     * @param parent the {@code Container} hosting this {@code LayoutManager}
     * @throws IllegalArgumentException if {@code parent} is not
     *         the same {@code Container} that this was created with
     * @return the alignment; this implementation returns {@code .5}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public Dimension maximumLayoutSize(Container parent) {

    /**
     * Returns the maximum size for the specified container.
     *
     * @param parent the container to return the size for
     * @return the maximum size for {@code parent}
     * @throws IllegalArgumentException if {@code parent} is not
     *         the same {@code Container} that this was created with
     * @throws IllegalStateException if any of the components added to
     *         this layout are not in both a horizontal and vertical group
     * @see java.awt.Container#getMaximumSize
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void addLayoutComponent(Component component, Object constraints) {

    /**
     * Notification that a {@code Component} has been added to
     * the parent container.  You should not invoke this method
     * directly, instead you should use one of the {@code Group}
     * methods to add a {@code Component}.
     *
     * @param component the component added
     * @param constraints description of where to place the component
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void layoutContainer(Container parent) {

    /**
     * Lays out the specified container.
     *
     * @param parent the container to be laid out
     * @throws IllegalStateException if any of the components added to
     *         this layout are not in both a horizontal and vertical group
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public Dimension minimumLayoutSize(Container parent) {

    /**
     * Returns the minimum size for the specified container.
     *
     * @param parent the container to return the size for
     * @return the minimum size for {@code parent}
     * @throws IllegalArgumentException if {@code parent} is not
     *         the same {@code Container} that this was created with
     * @throws IllegalStateException if any of the components added to
     *         this layout are not in both a horizontal and vertical group
     * @see java.awt.Container#getMinimumSize
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public Dimension preferredLayoutSize(Container parent) {

    /**
     * Returns the preferred size for the specified container.
     *
     * @param parent the container to return the preferred size for
     * @return the preferred size for {@code parent}
     * @throws IllegalArgumentException if {@code parent} is not
     *         the same {@code Container} this was created with
     * @throws IllegalStateException if any of the components added to
     *         this layout are not in both a horizontal and vertical group
     * @see java.awt.Container#getPreferredSize
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void removeLayoutComponent(Component component) {

    /**
     * Notification that a {@code Component} has been removed from
     * the parent container.  You should not invoke this method
     * directly, instead invoke {@code remove} on the parent
     * {@code Container}.
     *
     * @param component the component to be removed
     * @see java.awt.Component#remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void addLayoutComponent(String name, Component component) {

    /**
     * Notification that a {@code Component} has been added to
     * the parent container.  You should not invoke this method
     * directly, instead you should use one of the {@code Group}
     * methods to add a {@code Component}.
     *
     * @param name the string to be associated with the component
     * @param component the {@code Component} to be added
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public LayoutStyle getLayoutStyle() {

    /**
     * Returns the {@code LayoutStyle} used for calculating the preferred
     * gap between components. This returns the value specified to
     * {@code setLayoutStyle}, which may be {@code null}.
     *
     * @return the {@code LayoutStyle} used for calculating the preferred
     *         gap between components
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void setLayoutStyle(LayoutStyle layoutStyle) {

    /**
     * Sets the {@code LayoutStyle} used to calculate the preferred
     * gaps between components. A value of {@code null} indicates the
     * shared instance of {@code LayoutStyle} should be used.
     *
     * @param layoutStyle the {@code LayoutStyle} to use
     * @see LayoutStyle
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void replace(Component existingComponent, Component newComponent) {

    /**
     * Replaces an existing component with a new one.
     *
     * @param existingComponent the component that should be removed
     *        and replaced with {@code newComponent}
     * @param newComponent the component to put in
     *        {@code existingComponent}'s place
     * @throws IllegalArgumentException if either of the components are
     *         {@code null} or {@code existingComponent} is not being managed
     *         by this layout manager
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void linkSize(int axis, Component... components) {

    /**
     * Forces the specified components to have the same size along the
     * specified axis regardless of their preferred, minimum or
     * maximum sizes. Components that are linked are given the maximum
     * of the preferred size of each of the linked components. For
     * example, if you link two components along the horizontal axis
     * and the preferred width is 10 and 20, both components are given
     * a width of 20.
     * <p>
     * This can be used multiple times to force any number of
     * components to share the same size.
     * <p>
     * Linked {@code Component}s are not be resizable.
     *
     * @param components the {@code Component}s that are to have the same size
     * @param axis the axis to link the size along; one of
     *             {@code SwingConstants.HORIZONTAL} or
     *             {@code SwingConstans.VERTICAL}
     * @throws IllegalArgumentException if {@code components} is
     *         {@code null}, or contains {@code null}; or {@code axis}
     *          is not {@code SwingConstants.HORIZONTAL} or
     *          {@code SwingConstants.VERTICAL}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void linkSize(Component... components) {

    /**
     * Forces the specified components to have the same size
     * regardless of their preferred, minimum or maximum sizes. Components that
     * are linked are given the maximum of the preferred size of each of
     * the linked components. For example, if you link two components with
     * a preferred width of 10 and 20, both components are given a width of 20.
     * <p>
     * This can be used multiple times to force any number of
     * components to share the same size.
     * <p>
     * Linked Components are not be resizable.
     *
     * @param components the {@code Component}s that are to have the same size
     * @throws IllegalArgumentException if {@code components} is
     *         {@code null}, or contains {@code null}
     * @see #linkSize(int,Component[])
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public ParallelGroup createBaselineGroup(boolean resizable,
            boolean anchorBaselineToTop) {

    /**
     * Creates and returns a {@code ParallelGroup} that aligns it's
     * elements along the baseline.
     *
     * @param resizable whether the group is resizable
     * @param anchorBaselineToTop whether the baseline is anchored to
     *        the top or bottom of the group
     * @see #createBaselineGroup
     * @see ParallelGroup
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public ParallelGroup createParallelGroup(Alignment alignment,
            boolean resizable){

    /**
     * Creates and returns a {@code ParallelGroup} with the specified
     * alignment and resize behavior. The {@code
     * alignment} argument specifies how children elements are
     * positioned that do not fill the group. For example, if a {@code
     * ParallelGroup} with an alignment of {@code TRAILING} is given
     * 100 and a child only needs 50, the child is
     * positioned at the position 50 (with a component orientation of
     * left-to-right).
     * <p>
     * Baseline alignment is only useful when used along the vertical
     * axis. A {@code ParallelGroup} created with a baseline alignment
     * along the horizontal axis is treated as {@code LEADING}.
     * <p>
     * Refer to {@link GroupLayout.ParallelGroup ParallelGroup} for details on
     * the behavior of baseline groups.
     *
     * @param alignment the alignment for the elements of the group
     * @param resizable {@code true} if the group is resizable; if the group
     *        is not resizable the preferred size is used for the
     *        minimum and maximum size of the group
     * @throws IllegalArgumentException if {@code alignment} is {@code null}
     * @return a new {@code ParallelGroup}
     * @see #createBaselineGroup
     * @see GroupLayout.ParallelGroup
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public ParallelGroup createParallelGroup(Alignment alignment) {

    /**
     * Creates and returns a {@code ParallelGroup} with the specified
     * alignment.  This is a cover method for the more general {@code
     * createParallelGroup(Alignment,boolean)} method with {@code true}
     * supplied for the second argument.
     *
     * @param alignment the alignment for the elements of the group
     * @throws IllegalArgumentException if {@code alignment} is {@code null}
     * @return a new {@code ParallelGroup}
     * @see #createBaselineGroup
     * @see ParallelGroup
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public ParallelGroup createParallelGroup() {

    /**
     * Creates and returns a {@code ParallelGroup} with an alignment of
     * {@code Alignment.LEADING}.  This is a cover method for the more
     * general {@code createParallelGroup(Alignment)} method.
     *
     * @return a new {@code ParallelGroup}
     * @see #createParallelGroup(Alignment)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public SequentialGroup createSequentialGroup() {

    /**
     * Creates and returns a {@code SequentialGroup}.
     *
     * @return a new {@code SequentialGroup}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private Group createTopLevelGroup(Group specifiedGroup) {

    /**
     * Wraps the user specified group in a sequential group.  If
     * container gaps should be generated the necessary springs are
     * added.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private Group getVerticalGroup() {

    /**
     * Returns the {@code Group} that positions and sizes components
     * along the vertical axis.
     *
     * @return the {@code Group} responsible for positioning and
     *         sizing component along the vertical axis
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void setVerticalGroup(Group group) {

    /**
     * Sets the {@code Group} that positions and sizes
     * components along the vertical axis.
     *
     * @param group the {@code Group} that positions and sizes
     *        components along the vertical axis
     * @throws IllegalArgumentException if group is {@code null}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private Group getHorizontalGroup() {

    /**
     * Returns the {@code Group} that positions and sizes components
     * along the horizontal axis.
     *
     * @return the {@code Group} responsible for positioning and
     *         sizing component along the horizontal axis
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void setHorizontalGroup(Group group) {

    /**
     * Sets the {@code Group} that positions and sizes
     * components along the horizontal axis.
     *
     * @param group the {@code Group} that positions and sizes
     *        components along the horizontal axis
     * @throws IllegalArgumentException if group is {@code null}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public boolean getAutoCreateContainerGaps() {

    /**
     * Returns {@code true} if gaps between the container and components that
     * border the container are automatically created.
     *
     * @return {@code true} if gaps between the container and components that
     *         border the container are automatically created
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void setAutoCreateContainerGaps(boolean autoCreateContainerPadding){

    /**
     * Sets whether a gap between the container and components that
     * touch the border of the container should automatically be
     * created. The default is {@code false}.
     *
     * @param autoCreateContainerPadding whether a gap between the container and
     *        components that touch the border of the container should
     *        automatically be created
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public boolean getAutoCreateGaps() {

    /**
     * Returns {@code true} if gaps between components are automatically
     * created.
     *
     * @return {@code true} if gaps between components are automatically
     *         created
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void setAutoCreateGaps(boolean autoCreatePadding) {

    /**
     * Sets whether a gap between components should automatically be
     * created.  For example, if this is {@code true} and you add two
     * components to a {@code SequentialGroup} a gap between the
     * two components is automatically be created.  The default is
     * {@code false}.
     *
     * @param autoCreatePadding whether a gap between components is
     *        automatically created
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void setHonorsVisibility(Component component,
            Boolean honorsVisibility) {

    /**
     * Sets whether the component's visibility is considered for
     * sizing and positioning. A value of {@code Boolean.TRUE}
     * indicates that if {@code component} is not visible it should
     * not be treated as part of the layout. A value of {@code false}
     * indicates that {@code component} is positioned and sized
     * regardless of it's visibility.  A value of {@code null}
     * indicates the value specified by the single argument method {@code
     * setHonorsVisibility} should be used.
     * <p>
     * If {@code component} is not a child of the {@code Container} this
     * {@code GroupLayout} is managing, it will be added to the
     * {@code Container}.
     *
     * @param component the component
     * @param honorsVisibility whether visibility of this {@code component} should be
     *              considered for sizing and positioning
     * @throws IllegalArgumentException if {@code component} is {@code null}
     * @see #setHonorsVisibility(Component,Boolean)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public boolean getHonorsVisibility() {

    /**
     * Returns whether component visibility is considered when sizing and
     * positioning components.
     *
     * @return whether component visibility is considered when sizing and
     *         positioning components
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public void setHonorsVisibility(boolean honorsVisibility) {

    /**
     * Sets whether component visibility is considered when sizing and
     * positioning components. A value of {@code true} indicates that
     * non-visible components should not be treated as part of the
     * layout. A value of {@code false} indicates that components should be
     * positioned and sized regardless of visibility.
     * <p>
     * A value of {@code false} is useful when the visibility of components
     * is dynamically adjusted and you don't want surrounding components and
     * the sizing to change.
     * <p>
     * The specified value is used for components that do not have an
     * explicit visibility specified.
     * <p>
     * The default is {@code true}.
     *
     * @param honorsVisibility whether component visibility is considered when
     *                         sizing and positioning components
     * @see #setHonorsVisibility(Component,Boolean)
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public GroupLayout(Container host) {

    /**
     * Creates a {@code GroupLayout} for the specified {@code Container}.
     *
     * @param host the {@code Container} the {@code GroupLayout} is
     *        the {@code LayoutManager} for
     * @throws IllegalArgumentException if host is {@code null}
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        BASELINE

        /**
         * Indicates the elements should be aligned along
         * their baseline.
         *
         * @see #createParallelGroup(Alignment)
         * @see #createBaselineGroup(boolean,boolean)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        CENTER,

        /**
         * Indicates the elements should be centered in
         * the region.
         *
         * @see #createParallelGroup(Alignment)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        TRAILING,

        /**
         * Indicates the elements should be aligned to the end of the
         * region.  For the horizontal axis with a left to right
         * orientation this means aligned to the right edge. For the
         * vertical axis trailing means aligned to the bottom edge.
         *
         * @see #createParallelGroup(Alignment)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
        LEADING,

        /**
         * Indicates the elements should be
         * aligned to the origin.  For the horizontal axis with a left to
         * right orientation this means aligned to the left edge. For the
         * vertical axis leading means aligned to the top edge.
         *
         * @see #createParallelGroup(Alignment)
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public enum Alignment {

    /**
     * Enumeration of the possible ways {@code ParallelGroup} can align
     * its children.
     *
     * @see #createParallelGroup(Alignment)
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private boolean honorsVisibility;

    /**
     * If true, components that are not visible are treated as though they
     * aren't there.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private LayoutStyle layoutStyle;

    /**
     * The LayoutStyle instance to use, if null the sharedInstance is used.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private Group verticalGroup;

    /**
     * Group responsible for layout along the vertical axis.  This is NOT
     * the user specified group, use getVerticalGroup to dig that out.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    private Group horizontalGroup;

    /**
     * Group responsible for layout along the horizontal axis.  This is NOT
     * the user specified group, use getHorizontalGroup to dig that out.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public static final int PREFERRED_SIZE = -2;

    /**
     * Indicates the preferred size from the component or gap should
     * be used for a particular range value.
     *
     * @see Group
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
    public static final int DEFAULT_SIZE = -1;

    /**
     * Indicates the size from the component or gap should be used for a
     * particular range value.
     *
     * @see Group
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//GroupLayout.java
public class GroupLayout implements LayoutManager2 {

/**
 * {@code GroupLayout} is a {@code LayoutManager} that hierarchically
 * groups components in order to position them in a {@code Container}.
 * {@code GroupLayout} is intended for use by builders, but may be
 * hand-coded as well.
 * Grouping is done by instances of the {@link Group Group} class. {@code
 * GroupLayout} supports two types of groups. A sequential group
 * positions its child elements sequentially, one after another. A
 * parallel group aligns its child elements in one of four ways.
 * <p>
 * Each group may contain any number of elements, where an element is
 * a {@code Group}, {@code Component}, or gap. A gap can be thought
 * of as an invisible component with a minimum, preferred and maximum
 * size. In addition {@code GroupLayout} supports a preferred gap,
 * whose value comes from {@code LayoutStyle}.
 * <p>
 * Elements are similar to a spring. Each element has a range as
 * specified by a minimum, preferred and maximum.  Gaps have either a
 * developer-specified range, or a range determined by {@code
 * LayoutStyle}. The range for {@code Component}s is determined from
 * the {@code Component}'s {@code getMinimumSize}, {@code
 * getPreferredSize} and {@code getMaximumSize} methods. In addition,
 * when adding {@code Component}s you may specify a particular range
 * to use instead of that from the component. The range for a {@code
 * Group} is determined by the type of group. A {@code ParallelGroup}'s
 * range is the maximum of the ranges of its elements. A {@code
 * SequentialGroup}'s range is the sum of the ranges of its elements.
 * <p>
 * {@code GroupLayout} treats each axis independently.  That is, there
 * is a group representing the horizontal axis, and a group
 * representing the vertical axis.  The horizontal group is
 * responsible for determining the minimum, preferred and maximum size
 * along the horizontal axis as well as setting the x and width of the
 * components contained in it. The vertical group is responsible for
 * determining the minimum, preferred and maximum size along the
 * vertical axis as well as setting the y and height of the
 * components contained in it. Each {@code Component} must exist in both
 * a horizontal and vertical group, otherwise an {@code IllegalStateException}
 * is thrown during layout, or when the minimum, preferred or
 * maximum size is requested.
 * <p>
 * The following diagram shows a sequential group along the horizontal
 * axis. The sequential group contains three components. A parallel group
 * was used along the vertical axis.
 * <p style="text-align:center">
 * <img src="doc-files/groupLayout.1.gif" alt="Sequential group along the horizontal axis in three components">
 * <p>
 * To reinforce that each axis is treated independently the diagram shows
 * the range of each group and element along each axis. The
 * range of each component has been projected onto the axes,
 * and the groups are rendered in blue (horizontal) and red (vertical).
 * For readability there is a gap between each of the elements in the
 * sequential group.
 * <p>
 * The sequential group along the horizontal axis is rendered as a solid
 * blue line. Notice the sequential group is the sum of the children elements
 * it contains.
 * <p>
 * Along the vertical axis the parallel group is the maximum of the height
 * of each of the components. As all three components have the same height,
 * the parallel group has the same height.
 * <p>
 * The following diagram shows the same three components, but with the
 * parallel group along the horizontal axis and the sequential group along
 * the vertical axis.
 *
 * <p style="text-align:center">
 * <img src="doc-files/groupLayout.2.gif" alt="Sequential group along the vertical axis in three components">
 * <p>
 * As {@code c1} is the largest of the three components, the parallel
 * group is sized to {@code c1}. As {@code c2} and {@code c3} are smaller
 * than {@code c1} they are aligned based on the alignment specified
 * for the component (if specified) or the default alignment of the
 * parallel group. In the diagram {@code c2} and {@code c3} were created
 * with an alignment of {@code LEADING}. If the component orientation were
 * right-to-left then {@code c2} and {@code c3} would be positioned on
 * the opposite side.
 * <p>
 * The following diagram shows a sequential group along both the horizontal
 * and vertical axis.
 * <p style="text-align:center">
 * <img src="doc-files/groupLayout.3.gif" alt="Sequential group along both the horizontal and vertical axis in three components">
 * <p>
 * {@code GroupLayout} provides the ability to insert gaps between
 * {@code Component}s. The size of the gap is determined by an
 * instance of {@code LayoutStyle}. This may be turned on using the
 * {@code setAutoCreateGaps} method.  Similarly, you may use
 * the {@code setAutoCreateContainerGaps} method to insert gaps
 * between components that touch the edge of the parent container and the
 * container.
 * <p>
 * The following builds a panel consisting of two labels in
 * one column, followed by two textfields in the next column:
 * <pre>
 *   JComponent panel = ...;
 *   GroupLayout layout = new GroupLayout(panel);
 *   panel.setLayout(layout);
 *
 *   // Turn on automatically adding gaps between components
 *   layout.setAutoCreateGaps(true);
 *
 *   // Turn on automatically creating gaps between components that touch
 *   // the edge of the container and the container.
 *   layout.setAutoCreateContainerGaps(true);
 *
 *   // Create a sequential group for the horizontal axis.
 *
 *   GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
 *
 *   // The sequential group in turn contains two parallel groups.
 *   // One parallel group contains the labels, the other the text fields.
 *   // Putting the labels in a parallel group along the horizontal axis
 *   // positions them at the same x location.
 *   //
 *   // Variable indentation is used to reinforce the level of grouping.
 *   hGroup.addGroup(layout.createParallelGroup().
 *            addComponent(label1).addComponent(label2));
 *   hGroup.addGroup(layout.createParallelGroup().
 *            addComponent(tf1).addComponent(tf2));
 *   layout.setHorizontalGroup(hGroup);
 *
 *   // Create a sequential group for the vertical axis.
 *   GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
 *
 *   // The sequential group contains two parallel groups that align
 *   // the contents along the baseline. The first parallel group contains
 *   // the first label and text field, and the second parallel group contains
 *   // the second label and text field. By using a sequential group
 *   // the labels and text fields are positioned vertically after one another.
 *   vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
 *            addComponent(label1).addComponent(tf1));
 *   vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).
 *            addComponent(label2).addComponent(tf2));
 *   layout.setVerticalGroup(vGroup);
 * </pre>
 * <p>
 * When run the following is produced.
 * <p style="text-align:center">
 * <img src="doc-files/groupLayout.example.png" alt="Produced horizontal/vertical form">
 * <p>
 * This layout consists of the following.
 * <ul><li>The horizontal axis consists of a sequential group containing two
 *         parallel groups.  The first parallel group contains the labels,
 *         and the second parallel group contains the text fields.
 *     <li>The vertical axis consists of a sequential group
 *         containing two parallel groups.  The parallel groups are configured
 *         to align their components along the baseline. The first parallel
 *         group contains the first label and first text field, and
 *         the second group consists of the second label and second
 *         text field.
 * </ul>
 * There are a couple of things to notice in this code:
 * <ul>
 *   <li>You need not explicitly add the components to the container; this
 *       is indirectly done by using one of the {@code add} methods of
 *       {@code Group}.
 *   <li>The various {@code add} methods return
 *       the caller.  This allows for easy chaining of invocations.  For
 *       example, {@code group.addComponent(label1).addComponent(label2);} is
 *       equivalent to
 *       {@code group.addComponent(label1); group.addComponent(label2);}.
 *   <li>There are no public constructors for {@code Group}s; instead
 *       use the create methods of {@code GroupLayout}.
 * </ul>
 *
 * @author Tomas Pavek
 * @author Jan Stola
 * @author Scott Violet
 * @since 1.6
 */
