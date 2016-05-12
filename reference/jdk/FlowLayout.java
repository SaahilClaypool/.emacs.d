_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public String toString() {

    /**
     * Returns a string representation of this <code>FlowLayout</code>
     * object and its values.
     * @return     a string representation of this layout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    private void readObject(ObjectInputStream stream)

    /**
     * Reads this object out of a serialization stream, handling
     * objects written by older versions of the class that didn't contain all
     * of the fields we use now..
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    private int serialVersionOnStream = currentSerialVersion;

    /**
     * This represent the <code>currentSerialVersion</code>
     * which is bein used.  It will be one of two values :
     * <code>0</code> versions before Java 2 platform v1.2..
     * <code>1</code> versions after  Java 2 platform v1.2..
     *
     * @serial
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void layoutContainer(Container target) {

    /**
     * Lays out the container. This method lets each
     * <i>visible</i> component take
     * its preferred size by reshaping the components in the
     * target container in order to satisfy the alignment of
     * this <code>FlowLayout</code> object.
     *
     * @param target the specified component being laid out
     * @see Container
     * @see       java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    private int moveComponents(Container target, int x, int y, int width, int height,
                                int rowStart, int rowEnd, boolean ltr,
                                boolean useBaseline, int[] ascent,
                                int[] descent) {

    /**
     * Centers the elements in the specified row, if there is any slack.
     * @param target the component which needs to be moved
     * @param x the x coordinate
     * @param y the y coordinate
     * @param width the width dimensions
     * @param height the height dimensions
     * @param rowStart the beginning of the row
     * @param rowEnd the the ending of the row
     * @param useBaseline Whether or not to align on baseline.
     * @param ascent Ascent for the components. This is only valid if
     *               useBaseline is true.
     * @param descent Ascent for the components. This is only valid if
     *               useBaseline is true.
     * @return actual row height
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public Dimension minimumLayoutSize(Container target) {

    /**
     * Returns the minimum dimensions needed to layout the <i>visible</i>
     * components contained in the specified target container.
     * @param target the container that needs to be laid out
     * @return    the minimum dimensions to lay out the
     *            subcomponents of the specified container
     * @see #preferredLayoutSize
     * @see       java.awt.Container
     * @see       java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public Dimension preferredLayoutSize(Container target) {

    /**
     * Returns the preferred dimensions for this layout given the
     * <i>visible</i> components in the specified target container.
     *
     * @param target the container that needs to be laid out
     * @return    the preferred dimensions to lay out the
     *            subcomponents of the specified container
     * @see Container
     * @see #minimumLayoutSize
     * @see       java.awt.Container#getPreferredSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void removeLayoutComponent(Component comp) {

    /**
     * Removes the specified component from the layout.
     * Not used by this class.
     * @param comp the component to remove
     * @see       java.awt.Container#removeAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void addLayoutComponent(String name, Component comp) {

    /**
     * Adds the specified component to the layout.
     * Not used by this class.
     * @param name the name of the component
     * @param comp the component to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public boolean getAlignOnBaseline() {

    /**
     * Returns true if components are to be vertically aligned along
     * their baseline.  The default is false.
     *
     * @return true if components are to be vertically aligned along
     *              their baseline
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void setAlignOnBaseline(boolean alignOnBaseline) {

    /**
     * Sets whether or not components should be vertically aligned along their
     * baseline.  Components that do not have a baseline will be centered.
     * The default is false.
     *
     * @param alignOnBaseline whether or not components should be
     *                        vertically aligned on their baseline
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void setVgap(int vgap) {

    /**
     * Sets the vertical gap between components and between
     * the components and the borders of the <code>Container</code>.
     *
     * @param vgap the vertical gap between components
     *             and between the components and the borders
     *             of the <code>Container</code>
     * @see        java.awt.FlowLayout#getVgap
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public int getVgap() {

    /**
     * Gets the vertical gap between components and
     * between the components and the borders of the
     * <code>Container</code>.
     *
     * @return     the vertical gap between components
     *             and between the components and the borders
     *             of the <code>Container</code>
     * @see        java.awt.FlowLayout#setVgap
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void setHgap(int hgap) {

    /**
     * Sets the horizontal gap between components and
     * between the components and the borders of the
     * <code>Container</code>.
     *
     * @param hgap the horizontal gap between components
     *             and between the components and the borders
     *             of the <code>Container</code>
     * @see        java.awt.FlowLayout#getHgap
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public int getHgap() {

    /**
     * Gets the horizontal gap between components
     * and between the components and the borders
     * of the <code>Container</code>
     *
     * @return     the horizontal gap between components
     *             and between the components and the borders
     *             of the <code>Container</code>
     * @see        java.awt.FlowLayout#setHgap
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void setAlignment(int align) {

    /**
     * Sets the alignment for this layout.
     * Possible values are
     * <ul>
     * <li><code>FlowLayout.LEFT</code>
     * <li><code>FlowLayout.RIGHT</code>
     * <li><code>FlowLayout.CENTER</code>
     * <li><code>FlowLayout.LEADING</code>
     * <li><code>FlowLayout.TRAILING</code>
     * </ul>
     * @param      align one of the alignment values shown above
     * @see        #getAlignment()
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public int getAlignment() {

    /**
     * Gets the alignment for this layout.
     * Possible values are <code>FlowLayout.LEFT</code>,
     * <code>FlowLayout.RIGHT</code>, <code>FlowLayout.CENTER</code>,
     * <code>FlowLayout.LEADING</code>,
     * or <code>FlowLayout.TRAILING</code>.
     * @return     the alignment value for this layout
     * @see        java.awt.FlowLayout#setAlignment
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public FlowLayout(int align, int hgap, int vgap) {

    /**
     * Creates a new flow layout manager with the indicated alignment
     * and the indicated horizontal and vertical gaps.
     * <p>
     * The value of the alignment argument must be one of
     * <code>FlowLayout.LEFT</code>, <code>FlowLayout.RIGHT</code>,
     * <code>FlowLayout.CENTER</code>, <code>FlowLayout.LEADING</code>,
     * or <code>FlowLayout.TRAILING</code>.
     * @param      align   the alignment value
     * @param      hgap    the horizontal gap between components
     *                     and between the components and the
     *                     borders of the <code>Container</code>
     * @param      vgap    the vertical gap between components
     *                     and between the components and the
     *                     borders of the <code>Container</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public FlowLayout(int align) {

    /**
     * Constructs a new <code>FlowLayout</code> with the specified
     * alignment and a default 5-unit horizontal and vertical gap.
     * The value of the alignment argument must be one of
     * <code>FlowLayout.LEFT</code>, <code>FlowLayout.RIGHT</code>,
     * <code>FlowLayout.CENTER</code>, <code>FlowLayout.LEADING</code>,
     * or <code>FlowLayout.TRAILING</code>.
     * @param align the alignment value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public FlowLayout() {

    /**
     * Constructs a new <code>FlowLayout</code> with a centered alignment and a
     * default 5-unit horizontal and vertical gap.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    private boolean alignOnBaseline;

    /**
     * If true, components will be aligned on their baseline.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    int vgap;

    /**
     * The flow layout manager allows a seperation of
     * components with gaps.  The vertical gap will
     * specify the space between rows and between the
     * the rows and the borders of the <code>Container</code>.
     *
     * @serial
     * @see #getHgap()
     * @see #setHgap(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    int hgap;

    /**
     * The flow layout manager allows a seperation of
     * components with gaps.  The horizontal gap will
     * specify the space between components and between
     * the components and the borders of the
     * <code>Container</code>.
     *
     * @serial
     * @see #getHgap()
     * @see #setHgap(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    int newAlign;       // This is the one we actually use

    /**
     * <code>newAlign</code> is the property that determines
     * how each row distributes empty space for the Java 2 platform,
     * v1.2 and greater.
     * It can be one of the following three values:
     * <ul>
     * <li><code>LEFT</code>
     * <li><code>RIGHT</code>
     * <li><code>CENTER</code>
     * <li><code>LEADING</code>
     * <li><code>TRAILING</code>
     * </ul>
     *
     * @serial
     * @since 1.2
     * @see #getAlignment
     * @see #setAlignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    int align;          // This is for 1.1 serialization compatibility

    /**
     * <code>align</code> is the property that determines
     * how each row distributes empty space.
     * It can be one of the following values:
     * <ul>
     * <li><code>LEFT</code>
     * <li><code>RIGHT</code>
     * <li><code>CENTER</code>
     * </ul>
     *
     * @serial
     * @see #getAlignment
     * @see #setAlignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int TRAILING = 4;

    /**
     * This value indicates that each row of components
     * should be justified to the trailing edge of the container's
     * orientation, for example, to the right in left-to-right orientations.
     *
     * @see     java.awt.Component#getComponentOrientation
     * @see     java.awt.ComponentOrientation
     * @since   1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int LEADING     = 3;

    /**
     * This value indicates that each row of components
     * should be justified to the leading edge of the container's
     * orientation, for example, to the left in left-to-right orientations.
     *
     * @see     java.awt.Component#getComponentOrientation
     * @see     java.awt.ComponentOrientation
     * @since   1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int RIGHT       = 2;

    /**
     * This value indicates that each row of components
     * should be right-justified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int CENTER      = 1;

    /**
     * This value indicates that each row of components
     * should be centered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int LEFT        = 0;

    /**
     * This value indicates that each row of components
     * should be left-justified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
public class FlowLayout implements LayoutManager, java.io.Serializable {

/**
 * A flow layout arranges components in a directional flow, much
 * like lines of text in a paragraph. The flow direction is
 * determined by the container's <code>componentOrientation</code>
 * property and may be one of two values:
 * <ul>
 * <li><code>ComponentOrientation.LEFT_TO_RIGHT</code>
 * <li><code>ComponentOrientation.RIGHT_TO_LEFT</code>
 * </ul>
 * Flow layouts are typically used
 * to arrange buttons in a panel. It arranges buttons
 * horizontally until no more buttons fit on the same line.
 * The line alignment is determined by the <code>align</code>
 * property. The possible values are:
 * <ul>
 * <li>{@link #LEFT LEFT}
 * <li>{@link #RIGHT RIGHT}
 * <li>{@link #CENTER CENTER}
 * <li>{@link #LEADING LEADING}
 * <li>{@link #TRAILING TRAILING}
 * </ul>
 * <p>
 * For example, the following picture shows an applet using the flow
 * layout manager (its default layout manager) to position three buttons:
 * <p>
 * <img src="doc-files/FlowLayout-1.gif"
 * ALT="Graphic of Layout for Three Buttons"
 * style="float:center; margin: 7px 10px;">
 * <p>
 * Here is the code for this applet:
 *
 * <hr><blockquote><pre>
 * import java.awt.*;
 * import java.applet.Applet;
 *
 * public class myButtons extends Applet {
 *     Button button1, button2, button3;
 *     public void init() {
 *         button1 = new Button("Ok");
 *         button2 = new Button("Open");
 *         button3 = new Button("Close");
 *         add(button1);
 *         add(button2);
 *         add(button3);
 *     }
 * }
 * </pre></blockquote><hr>
 * <p>
 * A flow layout lets each component assume its natural (preferred) size.
 *
 * @author      Arthur van Hoff
 * @author      Sami Shaio
 * @since       JDK1.0
 * @see ComponentOrientation
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public String toString() {

    /**
     * Returns a string representation of this <code>FlowLayout</code>
     * object and its values.
     * @return     a string representation of this layout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    private void readObject(ObjectInputStream stream)

    /**
     * Reads this object out of a serialization stream, handling
     * objects written by older versions of the class that didn't contain all
     * of the fields we use now..
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    private int serialVersionOnStream = currentSerialVersion;

    /**
     * This represent the <code>currentSerialVersion</code>
     * which is bein used.  It will be one of two values :
     * <code>0</code> versions before Java 2 platform v1.2..
     * <code>1</code> versions after  Java 2 platform v1.2..
     *
     * @serial
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void layoutContainer(Container target) {

    /**
     * Lays out the container. This method lets each
     * <i>visible</i> component take
     * its preferred size by reshaping the components in the
     * target container in order to satisfy the alignment of
     * this <code>FlowLayout</code> object.
     *
     * @param target the specified component being laid out
     * @see Container
     * @see       java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    private int moveComponents(Container target, int x, int y, int width, int height,
                                int rowStart, int rowEnd, boolean ltr,
                                boolean useBaseline, int[] ascent,
                                int[] descent) {

    /**
     * Centers the elements in the specified row, if there is any slack.
     * @param target the component which needs to be moved
     * @param x the x coordinate
     * @param y the y coordinate
     * @param width the width dimensions
     * @param height the height dimensions
     * @param rowStart the beginning of the row
     * @param rowEnd the the ending of the row
     * @param useBaseline Whether or not to align on baseline.
     * @param ascent Ascent for the components. This is only valid if
     *               useBaseline is true.
     * @param descent Ascent for the components. This is only valid if
     *               useBaseline is true.
     * @return actual row height
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public Dimension minimumLayoutSize(Container target) {

    /**
     * Returns the minimum dimensions needed to layout the <i>visible</i>
     * components contained in the specified target container.
     * @param target the container that needs to be laid out
     * @return    the minimum dimensions to lay out the
     *            subcomponents of the specified container
     * @see #preferredLayoutSize
     * @see       java.awt.Container
     * @see       java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public Dimension preferredLayoutSize(Container target) {

    /**
     * Returns the preferred dimensions for this layout given the
     * <i>visible</i> components in the specified target container.
     *
     * @param target the container that needs to be laid out
     * @return    the preferred dimensions to lay out the
     *            subcomponents of the specified container
     * @see Container
     * @see #minimumLayoutSize
     * @see       java.awt.Container#getPreferredSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void removeLayoutComponent(Component comp) {

    /**
     * Removes the specified component from the layout.
     * Not used by this class.
     * @param comp the component to remove
     * @see       java.awt.Container#removeAll
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void addLayoutComponent(String name, Component comp) {

    /**
     * Adds the specified component to the layout.
     * Not used by this class.
     * @param name the name of the component
     * @param comp the component to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public boolean getAlignOnBaseline() {

    /**
     * Returns true if components are to be vertically aligned along
     * their baseline.  The default is false.
     *
     * @return true if components are to be vertically aligned along
     *              their baseline
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void setAlignOnBaseline(boolean alignOnBaseline) {

    /**
     * Sets whether or not components should be vertically aligned along their
     * baseline.  Components that do not have a baseline will be centered.
     * The default is false.
     *
     * @param alignOnBaseline whether or not components should be
     *                        vertically aligned on their baseline
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void setVgap(int vgap) {

    /**
     * Sets the vertical gap between components and between
     * the components and the borders of the <code>Container</code>.
     *
     * @param vgap the vertical gap between components
     *             and between the components and the borders
     *             of the <code>Container</code>
     * @see        java.awt.FlowLayout#getVgap
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public int getVgap() {

    /**
     * Gets the vertical gap between components and
     * between the components and the borders of the
     * <code>Container</code>.
     *
     * @return     the vertical gap between components
     *             and between the components and the borders
     *             of the <code>Container</code>
     * @see        java.awt.FlowLayout#setVgap
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void setHgap(int hgap) {

    /**
     * Sets the horizontal gap between components and
     * between the components and the borders of the
     * <code>Container</code>.
     *
     * @param hgap the horizontal gap between components
     *             and between the components and the borders
     *             of the <code>Container</code>
     * @see        java.awt.FlowLayout#getHgap
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public int getHgap() {

    /**
     * Gets the horizontal gap between components
     * and between the components and the borders
     * of the <code>Container</code>
     *
     * @return     the horizontal gap between components
     *             and between the components and the borders
     *             of the <code>Container</code>
     * @see        java.awt.FlowLayout#setHgap
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public void setAlignment(int align) {

    /**
     * Sets the alignment for this layout.
     * Possible values are
     * <ul>
     * <li><code>FlowLayout.LEFT</code>
     * <li><code>FlowLayout.RIGHT</code>
     * <li><code>FlowLayout.CENTER</code>
     * <li><code>FlowLayout.LEADING</code>
     * <li><code>FlowLayout.TRAILING</code>
     * </ul>
     * @param      align one of the alignment values shown above
     * @see        #getAlignment()
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public int getAlignment() {

    /**
     * Gets the alignment for this layout.
     * Possible values are <code>FlowLayout.LEFT</code>,
     * <code>FlowLayout.RIGHT</code>, <code>FlowLayout.CENTER</code>,
     * <code>FlowLayout.LEADING</code>,
     * or <code>FlowLayout.TRAILING</code>.
     * @return     the alignment value for this layout
     * @see        java.awt.FlowLayout#setAlignment
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public FlowLayout(int align, int hgap, int vgap) {

    /**
     * Creates a new flow layout manager with the indicated alignment
     * and the indicated horizontal and vertical gaps.
     * <p>
     * The value of the alignment argument must be one of
     * <code>FlowLayout.LEFT</code>, <code>FlowLayout.RIGHT</code>,
     * <code>FlowLayout.CENTER</code>, <code>FlowLayout.LEADING</code>,
     * or <code>FlowLayout.TRAILING</code>.
     * @param      align   the alignment value
     * @param      hgap    the horizontal gap between components
     *                     and between the components and the
     *                     borders of the <code>Container</code>
     * @param      vgap    the vertical gap between components
     *                     and between the components and the
     *                     borders of the <code>Container</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public FlowLayout(int align) {

    /**
     * Constructs a new <code>FlowLayout</code> with the specified
     * alignment and a default 5-unit horizontal and vertical gap.
     * The value of the alignment argument must be one of
     * <code>FlowLayout.LEFT</code>, <code>FlowLayout.RIGHT</code>,
     * <code>FlowLayout.CENTER</code>, <code>FlowLayout.LEADING</code>,
     * or <code>FlowLayout.TRAILING</code>.
     * @param align the alignment value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public FlowLayout() {

    /**
     * Constructs a new <code>FlowLayout</code> with a centered alignment and a
     * default 5-unit horizontal and vertical gap.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    private boolean alignOnBaseline;

    /**
     * If true, components will be aligned on their baseline.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    int vgap;

    /**
     * The flow layout manager allows a seperation of
     * components with gaps.  The vertical gap will
     * specify the space between rows and between the
     * the rows and the borders of the <code>Container</code>.
     *
     * @serial
     * @see #getHgap()
     * @see #setHgap(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    int hgap;

    /**
     * The flow layout manager allows a seperation of
     * components with gaps.  The horizontal gap will
     * specify the space between components and between
     * the components and the borders of the
     * <code>Container</code>.
     *
     * @serial
     * @see #getHgap()
     * @see #setHgap(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    int newAlign;       // This is the one we actually use

    /**
     * <code>newAlign</code> is the property that determines
     * how each row distributes empty space for the Java 2 platform,
     * v1.2 and greater.
     * It can be one of the following three values:
     * <ul>
     * <li><code>LEFT</code>
     * <li><code>RIGHT</code>
     * <li><code>CENTER</code>
     * <li><code>LEADING</code>
     * <li><code>TRAILING</code>
     * </ul>
     *
     * @serial
     * @since 1.2
     * @see #getAlignment
     * @see #setAlignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    int align;          // This is for 1.1 serialization compatibility

    /**
     * <code>align</code> is the property that determines
     * how each row distributes empty space.
     * It can be one of the following values:
     * <ul>
     * <li><code>LEFT</code>
     * <li><code>RIGHT</code>
     * <li><code>CENTER</code>
     * </ul>
     *
     * @serial
     * @see #getAlignment
     * @see #setAlignment
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int TRAILING = 4;

    /**
     * This value indicates that each row of components
     * should be justified to the trailing edge of the container's
     * orientation, for example, to the right in left-to-right orientations.
     *
     * @see     java.awt.Component#getComponentOrientation
     * @see     java.awt.ComponentOrientation
     * @since   1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int LEADING     = 3;

    /**
     * This value indicates that each row of components
     * should be justified to the leading edge of the container's
     * orientation, for example, to the left in left-to-right orientations.
     *
     * @see     java.awt.Component#getComponentOrientation
     * @see     java.awt.ComponentOrientation
     * @since   1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int RIGHT       = 2;

    /**
     * This value indicates that each row of components
     * should be right-justified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int CENTER      = 1;

    /**
     * This value indicates that each row of components
     * should be centered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
    public static final int LEFT        = 0;

    /**
     * This value indicates that each row of components
     * should be left-justified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/FlowLayout.java
public class FlowLayout implements LayoutManager, java.io.Serializable {

/**
 * A flow layout arranges components in a directional flow, much
 * like lines of text in a paragraph. The flow direction is
 * determined by the container's <code>componentOrientation</code>
 * property and may be one of two values:
 * <ul>
 * <li><code>ComponentOrientation.LEFT_TO_RIGHT</code>
 * <li><code>ComponentOrientation.RIGHT_TO_LEFT</code>
 * </ul>
 * Flow layouts are typically used
 * to arrange buttons in a panel. It arranges buttons
 * horizontally until no more buttons fit on the same line.
 * The line alignment is determined by the <code>align</code>
 * property. The possible values are:
 * <ul>
 * <li>{@link #LEFT LEFT}
 * <li>{@link #RIGHT RIGHT}
 * <li>{@link #CENTER CENTER}
 * <li>{@link #LEADING LEADING}
 * <li>{@link #TRAILING TRAILING}
 * </ul>
 * <p>
 * For example, the following picture shows an applet using the flow
 * layout manager (its default layout manager) to position three buttons:
 * <p>
 * <img src="doc-files/FlowLayout-1.gif"
 * ALT="Graphic of Layout for Three Buttons"
 * style="float:center; margin: 7px 10px;">
 * <p>
 * Here is the code for this applet:
 *
 * <hr><blockquote><pre>
 * import java.awt.*;
 * import java.applet.Applet;
 *
 * public class myButtons extends Applet {
 *     Button button1, button2, button3;
 *     public void init() {
 *         button1 = new Button("Ok");
 *         button2 = new Button("Open");
 *         button3 = new Button("Close");
 *         add(button1);
 *         add(button2);
 *         add(button3);
 *     }
 * }
 * </pre></blockquote><hr>
 * <p>
 * A flow layout lets each component assume its natural (preferred) size.
 *
 * @author      Arthur van Hoff
 * @author      Sami Shaio
 * @since       JDK1.0
 * @see ComponentOrientation
 */
