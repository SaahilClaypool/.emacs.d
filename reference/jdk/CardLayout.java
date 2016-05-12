_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes serializable fields to stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads serializable fields from stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public String toString() {

    /**
     * Returns a string representation of the state of this card layout.
     * @return    a string representation of this card layout.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void show(Container parent, String name) {

    /**
     * Flips to the component that was added to this layout with the
     * specified <code>name</code>, using <code>addLayoutComponent</code>.
     * If no such component exists, then nothing happens.
     * @param     parent   the parent container in which to do the layout
     * @param     name     the component name
     * @see       java.awt.CardLayout#addLayoutComponent(java.awt.Component, java.lang.Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void last(Container parent) {

    /**
     * Flips to the last card of the container.
     * @param     parent   the parent container in which to do the layout
     * @see       java.awt.CardLayout#first
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void previous(Container parent) {

    /**
     * Flips to the previous card of the specified container. If the
     * currently visible card is the first one, this method flips to the
     * last card in the layout.
     * @param     parent   the parent container in which to do the layout
     * @see       java.awt.CardLayout#next
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void next(Container parent) {

    /**
     * Flips to the next card of the specified container. If the
     * currently visible card is the last one, this method flips to the
     * first card in the layout.
     * @param     parent   the parent container in which to do the layout
     * @see       java.awt.CardLayout#previous
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void first(Container parent) {

    /**
     * Flips to the first card of the container.
     * @param     parent   the parent container in which to do the layout
     * @see       java.awt.CardLayout#last
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    void checkLayout(Container parent) {

    /**
     * Make sure that the Container really has a CardLayout installed.
     * Otherwise havoc can ensue!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void layoutContainer(Container parent) {

    /**
     * Lays out the specified container using this card layout.
     * <p>
     * Each component in the <code>parent</code> container is reshaped
     * to be the size of the container, minus space for surrounding
     * insets, horizontal gaps, and vertical gaps.
     *
     * @param     parent the parent container in which to do the layout
     * @see       java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void invalidateLayout(Container target) {

    /**
     * Invalidates the layout, indicating that if the layout manager
     * has cached information it should be discarded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public float getLayoutAlignmentY(Container parent) {

    /**
     * Returns the alignment along the y axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public float getLayoutAlignmentX(Container parent) {

    /**
     * Returns the alignment along the x axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public Dimension maximumLayoutSize(Container target) {

    /**
     * Returns the maximum dimensions for this layout given the components
     * in the specified target container.
     * @param target the component which needs to be laid out
     * @see Container
     * @see #minimumLayoutSize
     * @see #preferredLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public Dimension minimumLayoutSize(Container parent) {

    /**
     * Calculates the minimum size for the specified panel.
     * @param     parent the parent container in which to do the layout
     * @return    the minimum dimensions required to lay out the
     *                subcomponents of the specified container
     * @see       java.awt.Container#doLayout
     * @see       java.awt.CardLayout#preferredLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public Dimension preferredLayoutSize(Container parent) {

    /**
     * Determines the preferred size of the container argument using
     * this card layout.
     * @param   parent the parent container in which to do the layout
     * @return  the preferred dimensions to lay out the subcomponents
     *                of the specified container
     * @see     java.awt.Container#getPreferredSize
     * @see     java.awt.CardLayout#minimumLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void removeLayoutComponent(Component comp) {

    /**
     * Removes the specified component from the layout.
     * If the card was visible on top, the next card underneath it is shown.
     * @param   comp   the component to be removed.
     * @see     java.awt.Container#remove(java.awt.Component)
     * @see     java.awt.Container#removeAll()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    @Deprecated

    /**
     * @deprecated   replaced by
     *      <code>addLayoutComponent(Component, Object)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void addLayoutComponent(Component comp, Object constraints) {

    /**
     * Adds the specified component to this card layout's internal
     * table of names. The object specified by <code>constraints</code>
     * must be a string. The card layout stores this string as a key-value
     * pair that can be used for random access to a particular card.
     * By calling the <code>show</code> method, an application can
     * display the component with the specified name.
     * @param     comp          the component to be added.
     * @param     constraints   a tag that identifies a particular
     *                                        card in the layout.
     * @see       java.awt.CardLayout#show(java.awt.Container, java.lang.String)
     * @exception  IllegalArgumentException  if the constraint is not a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void setVgap(int vgap) {

    /**
     * Sets the vertical gap between components.
     * @param     vgap the vertical gap between components.
     * @see       java.awt.CardLayout#getVgap()
     * @see       java.awt.CardLayout#setHgap(int)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public int getVgap() {

    /**
     * Gets the vertical gap between components.
     * @return the vertical gap between components.
     * @see       java.awt.CardLayout#setVgap(int)
     * @see       java.awt.CardLayout#getHgap()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void setHgap(int hgap) {

    /**
     * Sets the horizontal gap between components.
     * @param hgap the horizontal gap between components.
     * @see       java.awt.CardLayout#getHgap()
     * @see       java.awt.CardLayout#setVgap(int)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public int getHgap() {

    /**
     * Gets the horizontal gap between components.
     * @return    the horizontal gap between components.
     * @see       java.awt.CardLayout#setHgap(int)
     * @see       java.awt.CardLayout#getVgap()
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public CardLayout(int hgap, int vgap) {

    /**
     * Creates a new card layout with the specified horizontal and
     * vertical gaps. The horizontal gaps are placed at the left and
     * right edges. The vertical gaps are placed at the top and bottom
     * edges.
     * @param     hgap   the horizontal gap.
     * @param     vgap   the vertical gap.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public CardLayout() {

    /**
     * Creates a new card layout with gaps of size zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField tab         Hashtable
     *      deprectated, for forward compatibility only
     * @serialField hgap        int
     * @serialField vgap        int
     * @serialField vector      Vector
     * @serialField currentCard int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
public class CardLayout implements LayoutManager2,

/**
 * A <code>CardLayout</code> object is a layout manager for a
 * container. It treats each component in the container as a card.
 * Only one card is visible at a time, and the container acts as
 * a stack of cards. The first component added to a
 * <code>CardLayout</code> object is the visible component when the
 * container is first displayed.
 * <p>
 * The ordering of cards is determined by the container's own internal
 * ordering of its component objects. <code>CardLayout</code>
 * defines a set of methods that allow an application to flip
 * through these cards sequentially, or to show a specified card.
 * The {@link CardLayout#addLayoutComponent}
 * method can be used to associate a string identifier with a given card
 * for fast random access.
 *
 * @author      Arthur van Hoff
 * @see         java.awt.Container
 * @since       JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    private void writeObject(ObjectOutputStream s)

    /**
     * Writes serializable fields to stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    private void readObject(ObjectInputStream s)

    /**
     * Reads serializable fields from stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public String toString() {

    /**
     * Returns a string representation of the state of this card layout.
     * @return    a string representation of this card layout.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void show(Container parent, String name) {

    /**
     * Flips to the component that was added to this layout with the
     * specified <code>name</code>, using <code>addLayoutComponent</code>.
     * If no such component exists, then nothing happens.
     * @param     parent   the parent container in which to do the layout
     * @param     name     the component name
     * @see       java.awt.CardLayout#addLayoutComponent(java.awt.Component, java.lang.Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void last(Container parent) {

    /**
     * Flips to the last card of the container.
     * @param     parent   the parent container in which to do the layout
     * @see       java.awt.CardLayout#first
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void previous(Container parent) {

    /**
     * Flips to the previous card of the specified container. If the
     * currently visible card is the first one, this method flips to the
     * last card in the layout.
     * @param     parent   the parent container in which to do the layout
     * @see       java.awt.CardLayout#next
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void next(Container parent) {

    /**
     * Flips to the next card of the specified container. If the
     * currently visible card is the last one, this method flips to the
     * first card in the layout.
     * @param     parent   the parent container in which to do the layout
     * @see       java.awt.CardLayout#previous
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void first(Container parent) {

    /**
     * Flips to the first card of the container.
     * @param     parent   the parent container in which to do the layout
     * @see       java.awt.CardLayout#last
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    void checkLayout(Container parent) {

    /**
     * Make sure that the Container really has a CardLayout installed.
     * Otherwise havoc can ensue!
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void layoutContainer(Container parent) {

    /**
     * Lays out the specified container using this card layout.
     * <p>
     * Each component in the <code>parent</code> container is reshaped
     * to be the size of the container, minus space for surrounding
     * insets, horizontal gaps, and vertical gaps.
     *
     * @param     parent the parent container in which to do the layout
     * @see       java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void invalidateLayout(Container target) {

    /**
     * Invalidates the layout, indicating that if the layout manager
     * has cached information it should be discarded.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public float getLayoutAlignmentY(Container parent) {

    /**
     * Returns the alignment along the y axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public float getLayoutAlignmentX(Container parent) {

    /**
     * Returns the alignment along the x axis.  This specifies how
     * the component would like to be aligned relative to other
     * components.  The value should be a number between 0 and 1
     * where 0 represents alignment along the origin, 1 is aligned
     * the furthest away from the origin, 0.5 is centered, etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public Dimension maximumLayoutSize(Container target) {

    /**
     * Returns the maximum dimensions for this layout given the components
     * in the specified target container.
     * @param target the component which needs to be laid out
     * @see Container
     * @see #minimumLayoutSize
     * @see #preferredLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public Dimension minimumLayoutSize(Container parent) {

    /**
     * Calculates the minimum size for the specified panel.
     * @param     parent the parent container in which to do the layout
     * @return    the minimum dimensions required to lay out the
     *                subcomponents of the specified container
     * @see       java.awt.Container#doLayout
     * @see       java.awt.CardLayout#preferredLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public Dimension preferredLayoutSize(Container parent) {

    /**
     * Determines the preferred size of the container argument using
     * this card layout.
     * @param   parent the parent container in which to do the layout
     * @return  the preferred dimensions to lay out the subcomponents
     *                of the specified container
     * @see     java.awt.Container#getPreferredSize
     * @see     java.awt.CardLayout#minimumLayoutSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void removeLayoutComponent(Component comp) {

    /**
     * Removes the specified component from the layout.
     * If the card was visible on top, the next card underneath it is shown.
     * @param   comp   the component to be removed.
     * @see     java.awt.Container#remove(java.awt.Component)
     * @see     java.awt.Container#removeAll()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    @Deprecated

    /**
     * @deprecated   replaced by
     *      <code>addLayoutComponent(Component, Object)</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void addLayoutComponent(Component comp, Object constraints) {

    /**
     * Adds the specified component to this card layout's internal
     * table of names. The object specified by <code>constraints</code>
     * must be a string. The card layout stores this string as a key-value
     * pair that can be used for random access to a particular card.
     * By calling the <code>show</code> method, an application can
     * display the component with the specified name.
     * @param     comp          the component to be added.
     * @param     constraints   a tag that identifies a particular
     *                                        card in the layout.
     * @see       java.awt.CardLayout#show(java.awt.Container, java.lang.String)
     * @exception  IllegalArgumentException  if the constraint is not a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void setVgap(int vgap) {

    /**
     * Sets the vertical gap between components.
     * @param     vgap the vertical gap between components.
     * @see       java.awt.CardLayout#getVgap()
     * @see       java.awt.CardLayout#setHgap(int)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public int getVgap() {

    /**
     * Gets the vertical gap between components.
     * @return the vertical gap between components.
     * @see       java.awt.CardLayout#setVgap(int)
     * @see       java.awt.CardLayout#getHgap()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public void setHgap(int hgap) {

    /**
     * Sets the horizontal gap between components.
     * @param hgap the horizontal gap between components.
     * @see       java.awt.CardLayout#getHgap()
     * @see       java.awt.CardLayout#setVgap(int)
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public int getHgap() {

    /**
     * Gets the horizontal gap between components.
     * @return    the horizontal gap between components.
     * @see       java.awt.CardLayout#setHgap(int)
     * @see       java.awt.CardLayout#getVgap()
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public CardLayout(int hgap, int vgap) {

    /**
     * Creates a new card layout with the specified horizontal and
     * vertical gaps. The horizontal gaps are placed at the left and
     * right edges. The vertical gaps are placed at the top and bottom
     * edges.
     * @param     hgap   the horizontal gap.
     * @param     vgap   the vertical gap.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    public CardLayout() {

    /**
     * Creates a new card layout with gaps of size zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
    private static final ObjectStreamField[] serialPersistentFields = {

    /**
     * @serialField tab         Hashtable
     *      deprectated, for forward compatibility only
     * @serialField hgap        int
     * @serialField vgap        int
     * @serialField vector      Vector
     * @serialField currentCard int
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/CardLayout.java
public class CardLayout implements LayoutManager2,

/**
 * A <code>CardLayout</code> object is a layout manager for a
 * container. It treats each component in the container as a card.
 * Only one card is visible at a time, and the container acts as
 * a stack of cards. The first component added to a
 * <code>CardLayout</code> object is the visible component when the
 * container is first displayed.
 * <p>
 * The ordering of cards is determined by the container's own internal
 * ordering of its component objects. <code>CardLayout</code>
 * defines a set of methods that allow an application to flip
 * through these cards sequentially, or to show a specified card.
 * The {@link CardLayout#addLayoutComponent}
 * method can be used to associate a string identifier with a given card
 * for fast random access.
 *
 * @author      Arthur van Hoff
 * @see         java.awt.Container
 * @since       JDK1.0
 */
