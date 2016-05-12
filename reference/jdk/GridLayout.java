_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public String toString() {

    /**
     * Returns the string representation of this grid layout's values.
     * @return     a string representation of this grid layout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void layoutContainer(Container parent) {

    /**
     * Lays out the specified container using this layout.
     * <p>
     * This method reshapes the components in the specified target
     * container in order to satisfy the constraints of the
     * <code>GridLayout</code> object.
     * <p>
     * The grid layout manager determines the size of individual
     * components by dividing the free space in the container into
     * equal-sized portions according to the number of rows and columns
     * in the layout. The container's free space equals the container's
     * size minus any insets and any specified horizontal or vertical
     * gap. All components in a grid layout are given the same size.
     *
     * @param      parent   the container in which to do the layout
     * @see        java.awt.Container
     * @see        java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public Dimension minimumLayoutSize(Container parent) {

    /**
     * Determines the minimum size of the container argument using this
     * grid layout.
     * <p>
     * The minimum width of a grid layout is the largest minimum width
     * of all of the components in the container times the number of columns,
     * plus the horizontal padding times the number of columns minus one,
     * plus the left and right insets of the target container.
     * <p>
     * The minimum height of a grid layout is the largest minimum height
     * of all of the components in the container times the number of rows,
     * plus the vertical padding times the number of rows minus one, plus
     * the top and bottom insets of the target container.
     *
     * @param       parent   the container in which to do the layout
     * @return      the minimum dimensions needed to lay out the
     *                      subcomponents of the specified container
     * @see         java.awt.GridLayout#preferredLayoutSize
     * @see         java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public Dimension preferredLayoutSize(Container parent) {

    /**
     * Determines the preferred size of the container argument using
     * this grid layout.
     * <p>
     * The preferred width of a grid layout is the largest preferred
     * width of all of the components in the container times the number of
     * columns, plus the horizontal padding times the number of columns
     * minus one, plus the left and right insets of the target container.
     * <p>
     * The preferred height of a grid layout is the largest preferred
     * height of all of the components in the container times the number of
     * rows, plus the vertical padding times the number of rows minus one,
     * plus the top and bottom insets of the target container.
     *
     * @param     parent   the container in which to do the layout
     * @return    the preferred dimensions to lay out the
     *                      subcomponents of the specified container
     * @see       java.awt.GridLayout#minimumLayoutSize
     * @see       java.awt.Container#getPreferredSize()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void removeLayoutComponent(Component comp) {

    /**
     * Removes the specified component from the layout.
     * @param comp the component to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void addLayoutComponent(String name, Component comp) {

    /**
     * Adds the specified component with the specified name to the layout.
     * @param name the name of the component
     * @param comp the component to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void setVgap(int vgap) {

    /**
     * Sets the vertical gap between components to the specified value.
     * @param         vgap  the vertical gap between components
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public int getVgap() {

    /**
     * Gets the vertical gap between components.
     * @return       the vertical gap between components
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void setHgap(int hgap) {

    /**
     * Sets the horizontal gap between components to the specified value.
     * @param        hgap   the horizontal gap between components
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public int getHgap() {

    /**
     * Gets the horizontal gap between components.
     * @return       the horizontal gap between components
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void setColumns(int cols) {

    /**
     * Sets the number of columns in this layout to the specified value.
     * Setting the number of columns has no affect on the layout
     * if the number of rows specified by a constructor or by
     * the <tt>setRows</tt> method is non-zero. In that case, the number
     * of columns displayed in the layout is determined by the total
     * number of components and the number of rows specified.
     * @param        cols   the number of columns in this layout
     * @exception    IllegalArgumentException  if the value of both
     *               <code>rows</code> and <code>cols</code> is set to zero
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public int getColumns() {

    /**
     * Gets the number of columns in this layout.
     * @return     the number of columns in this layout
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void setRows(int rows) {

    /**
     * Sets the number of rows in this layout to the specified value.
     * @param        rows   the number of rows in this layout
     * @exception    IllegalArgumentException  if the value of both
     *               <code>rows</code> and <code>cols</code> is set to zero
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public int getRows() {

    /**
     * Gets the number of rows in this layout.
     * @return    the number of rows in this layout
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public GridLayout(int rows, int cols, int hgap, int vgap) {

    /**
     * Creates a grid layout with the specified number of rows and
     * columns. All components in the layout are given equal size.
     * <p>
     * In addition, the horizontal and vertical gaps are set to the
     * specified values. Horizontal gaps are placed between each
     * of the columns. Vertical gaps are placed between each of
     * the rows.
     * <p>
     * One, but not both, of <code>rows</code> and <code>cols</code> can
     * be zero, which means that any number of objects can be placed in a
     * row or in a column.
     * <p>
     * All <code>GridLayout</code> constructors defer to this one.
     * @param     rows   the rows, with the value zero meaning
     *                   any number of rows
     * @param     cols   the columns, with the value zero meaning
     *                   any number of columns
     * @param     hgap   the horizontal gap
     * @param     vgap   the vertical gap
     * @exception   IllegalArgumentException  if the value of both
     *                  <code>rows</code> and <code>cols</code> is
     *                  set to zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public GridLayout(int rows, int cols) {

    /**
     * Creates a grid layout with the specified number of rows and
     * columns. All components in the layout are given equal size.
     * <p>
     * One, but not both, of <code>rows</code> and <code>cols</code> can
     * be zero, which means that any number of objects can be placed in a
     * row or in a column.
     * @param     rows   the rows, with the value zero meaning
     *                   any number of rows.
     * @param     cols   the columns, with the value zero meaning
     *                   any number of columns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public GridLayout() {

    /**
     * Creates a grid layout with a default of one column per component,
     * in a single row.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    int rows;

    /**
     * This is the number of rows specified for the grid.  The number
     * of rows can be changed at any time.
     * This should be a non negative integer, where '0' means
     * 'any number' meaning that the number of Rows in that
     * dimension depends on the other dimension.
     *
     * @serial
     * @see #getRows()
     * @see #setRows(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    int hgap;

    /**
     * This is the horizontal gap (in pixels) which specifies the space
     * between columns.  They can be changed at any time.
     * This should be a non-negative integer.
     *
     * @serial
     * @see #getHgap()
     * @see #setHgap(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
public class GridLayout implements LayoutManager, java.io.Serializable {

/**
 * The <code>GridLayout</code> class is a layout manager that
 * lays out a container's components in a rectangular grid.
 * The container is divided into equal-sized rectangles,
 * and one component is placed in each rectangle.
 * For example, the following is an applet that lays out six buttons
 * into three rows and two columns:
 *
 * <hr><blockquote>
 * <pre>
 * import java.awt.*;
 * import java.applet.Applet;
 * public class ButtonGrid extends Applet {
 *     public void init() {
 *         setLayout(new GridLayout(3,2));
 *         add(new Button("1"));
 *         add(new Button("2"));
 *         add(new Button("3"));
 *         add(new Button("4"));
 *         add(new Button("5"));
 *         add(new Button("6"));
 *     }
 * }
 * </pre></blockquote><hr>
 * <p>
 * If the container's <code>ComponentOrientation</code> property is horizontal
 * and left-to-right, the above example produces the output shown in Figure 1.
 * If the container's <code>ComponentOrientation</code> property is horizontal
 * and right-to-left, the example produces the output shown in Figure 2.
 *
 * <table style="float:center" WIDTH=600 summary="layout">
 * <tr ALIGN=CENTER>
 * <td><img SRC="doc-files/GridLayout-1.gif"
 *      alt="Shows 6 buttons in rows of 2. Row 1 shows buttons 1 then 2.
 * Row 2 shows buttons 3 then 4. Row 3 shows buttons 5 then 6.">
 * </td>
 *
 * <td ALIGN=CENTER><img SRC="doc-files/GridLayout-2.gif"
 *                   alt="Shows 6 buttons in rows of 2. Row 1 shows buttons 2 then 1.
 * Row 2 shows buttons 4 then 3. Row 3 shows buttons 6 then 5.">
 * </td>
 * </tr>
 *
 * <tr ALIGN=CENTER>
 * <td>Figure 1: Horizontal, Left-to-Right</td>
 *
 * <td>Figure 2: Horizontal, Right-to-Left</td>
 * </tr>
 * </table>
 * <p>
 * When both the number of rows and the number of columns have
 * been set to non-zero values, either by a constructor or
 * by the <tt>setRows</tt> and <tt>setColumns</tt> methods, the number of
 * columns specified is ignored.  Instead, the number of
 * columns is determined from the specified number of rows
 * and the total number of components in the layout. So, for
 * example, if three rows and two columns have been specified
 * and nine components are added to the layout, they will
 * be displayed as three rows of three columns.  Specifying
 * the number of columns affects the layout only when the
 * number of rows is set to zero.
 *
 * @author  Arthur van Hoff
 * @since   JDK1.0
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public String toString() {

    /**
     * Returns the string representation of this grid layout's values.
     * @return     a string representation of this grid layout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void layoutContainer(Container parent) {

    /**
     * Lays out the specified container using this layout.
     * <p>
     * This method reshapes the components in the specified target
     * container in order to satisfy the constraints of the
     * <code>GridLayout</code> object.
     * <p>
     * The grid layout manager determines the size of individual
     * components by dividing the free space in the container into
     * equal-sized portions according to the number of rows and columns
     * in the layout. The container's free space equals the container's
     * size minus any insets and any specified horizontal or vertical
     * gap. All components in a grid layout are given the same size.
     *
     * @param      parent   the container in which to do the layout
     * @see        java.awt.Container
     * @see        java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public Dimension minimumLayoutSize(Container parent) {

    /**
     * Determines the minimum size of the container argument using this
     * grid layout.
     * <p>
     * The minimum width of a grid layout is the largest minimum width
     * of all of the components in the container times the number of columns,
     * plus the horizontal padding times the number of columns minus one,
     * plus the left and right insets of the target container.
     * <p>
     * The minimum height of a grid layout is the largest minimum height
     * of all of the components in the container times the number of rows,
     * plus the vertical padding times the number of rows minus one, plus
     * the top and bottom insets of the target container.
     *
     * @param       parent   the container in which to do the layout
     * @return      the minimum dimensions needed to lay out the
     *                      subcomponents of the specified container
     * @see         java.awt.GridLayout#preferredLayoutSize
     * @see         java.awt.Container#doLayout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public Dimension preferredLayoutSize(Container parent) {

    /**
     * Determines the preferred size of the container argument using
     * this grid layout.
     * <p>
     * The preferred width of a grid layout is the largest preferred
     * width of all of the components in the container times the number of
     * columns, plus the horizontal padding times the number of columns
     * minus one, plus the left and right insets of the target container.
     * <p>
     * The preferred height of a grid layout is the largest preferred
     * height of all of the components in the container times the number of
     * rows, plus the vertical padding times the number of rows minus one,
     * plus the top and bottom insets of the target container.
     *
     * @param     parent   the container in which to do the layout
     * @return    the preferred dimensions to lay out the
     *                      subcomponents of the specified container
     * @see       java.awt.GridLayout#minimumLayoutSize
     * @see       java.awt.Container#getPreferredSize()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void removeLayoutComponent(Component comp) {

    /**
     * Removes the specified component from the layout.
     * @param comp the component to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void addLayoutComponent(String name, Component comp) {

    /**
     * Adds the specified component with the specified name to the layout.
     * @param name the name of the component
     * @param comp the component to be added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void setVgap(int vgap) {

    /**
     * Sets the vertical gap between components to the specified value.
     * @param         vgap  the vertical gap between components
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public int getVgap() {

    /**
     * Gets the vertical gap between components.
     * @return       the vertical gap between components
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void setHgap(int hgap) {

    /**
     * Sets the horizontal gap between components to the specified value.
     * @param        hgap   the horizontal gap between components
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public int getHgap() {

    /**
     * Gets the horizontal gap between components.
     * @return       the horizontal gap between components
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void setColumns(int cols) {

    /**
     * Sets the number of columns in this layout to the specified value.
     * Setting the number of columns has no affect on the layout
     * if the number of rows specified by a constructor or by
     * the <tt>setRows</tt> method is non-zero. In that case, the number
     * of columns displayed in the layout is determined by the total
     * number of components and the number of rows specified.
     * @param        cols   the number of columns in this layout
     * @exception    IllegalArgumentException  if the value of both
     *               <code>rows</code> and <code>cols</code> is set to zero
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public int getColumns() {

    /**
     * Gets the number of columns in this layout.
     * @return     the number of columns in this layout
     * @since      JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public void setRows(int rows) {

    /**
     * Sets the number of rows in this layout to the specified value.
     * @param        rows   the number of rows in this layout
     * @exception    IllegalArgumentException  if the value of both
     *               <code>rows</code> and <code>cols</code> is set to zero
     * @since        JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public int getRows() {

    /**
     * Gets the number of rows in this layout.
     * @return    the number of rows in this layout
     * @since     JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public GridLayout(int rows, int cols, int hgap, int vgap) {

    /**
     * Creates a grid layout with the specified number of rows and
     * columns. All components in the layout are given equal size.
     * <p>
     * In addition, the horizontal and vertical gaps are set to the
     * specified values. Horizontal gaps are placed between each
     * of the columns. Vertical gaps are placed between each of
     * the rows.
     * <p>
     * One, but not both, of <code>rows</code> and <code>cols</code> can
     * be zero, which means that any number of objects can be placed in a
     * row or in a column.
     * <p>
     * All <code>GridLayout</code> constructors defer to this one.
     * @param     rows   the rows, with the value zero meaning
     *                   any number of rows
     * @param     cols   the columns, with the value zero meaning
     *                   any number of columns
     * @param     hgap   the horizontal gap
     * @param     vgap   the vertical gap
     * @exception   IllegalArgumentException  if the value of both
     *                  <code>rows</code> and <code>cols</code> is
     *                  set to zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public GridLayout(int rows, int cols) {

    /**
     * Creates a grid layout with the specified number of rows and
     * columns. All components in the layout are given equal size.
     * <p>
     * One, but not both, of <code>rows</code> and <code>cols</code> can
     * be zero, which means that any number of objects can be placed in a
     * row or in a column.
     * @param     rows   the rows, with the value zero meaning
     *                   any number of rows.
     * @param     cols   the columns, with the value zero meaning
     *                   any number of columns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    public GridLayout() {

    /**
     * Creates a grid layout with a default of one column per component,
     * in a single row.
     * @since JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    int rows;

    /**
     * This is the number of rows specified for the grid.  The number
     * of rows can be changed at any time.
     * This should be a non negative integer, where '0' means
     * 'any number' meaning that the number of Rows in that
     * dimension depends on the other dimension.
     *
     * @serial
     * @see #getRows()
     * @see #setRows(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
    int hgap;

    /**
     * This is the horizontal gap (in pixels) which specifies the space
     * between columns.  They can be changed at any time.
     * This should be a non-negative integer.
     *
     * @serial
     * @see #getHgap()
     * @see #setHgap(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/GridLayout.java
public class GridLayout implements LayoutManager, java.io.Serializable {

/**
 * The <code>GridLayout</code> class is a layout manager that
 * lays out a container's components in a rectangular grid.
 * The container is divided into equal-sized rectangles,
 * and one component is placed in each rectangle.
 * For example, the following is an applet that lays out six buttons
 * into three rows and two columns:
 *
 * <hr><blockquote>
 * <pre>
 * import java.awt.*;
 * import java.applet.Applet;
 * public class ButtonGrid extends Applet {
 *     public void init() {
 *         setLayout(new GridLayout(3,2));
 *         add(new Button("1"));
 *         add(new Button("2"));
 *         add(new Button("3"));
 *         add(new Button("4"));
 *         add(new Button("5"));
 *         add(new Button("6"));
 *     }
 * }
 * </pre></blockquote><hr>
 * <p>
 * If the container's <code>ComponentOrientation</code> property is horizontal
 * and left-to-right, the above example produces the output shown in Figure 1.
 * If the container's <code>ComponentOrientation</code> property is horizontal
 * and right-to-left, the example produces the output shown in Figure 2.
 *
 * <table style="float:center" WIDTH=600 summary="layout">
 * <tr ALIGN=CENTER>
 * <td><img SRC="doc-files/GridLayout-1.gif"
 *      alt="Shows 6 buttons in rows of 2. Row 1 shows buttons 1 then 2.
 * Row 2 shows buttons 3 then 4. Row 3 shows buttons 5 then 6.">
 * </td>
 *
 * <td ALIGN=CENTER><img SRC="doc-files/GridLayout-2.gif"
 *                   alt="Shows 6 buttons in rows of 2. Row 1 shows buttons 2 then 1.
 * Row 2 shows buttons 4 then 3. Row 3 shows buttons 6 then 5.">
 * </td>
 * </tr>
 *
 * <tr ALIGN=CENTER>
 * <td>Figure 1: Horizontal, Left-to-Right</td>
 *
 * <td>Figure 2: Horizontal, Right-to-Left</td>
 * </tr>
 * </table>
 * <p>
 * When both the number of rows and the number of columns have
 * been set to non-zero values, either by a constructor or
 * by the <tt>setRows</tt> and <tt>setColumns</tt> methods, the number of
 * columns specified is ignored.  Instead, the number of
 * columns is determined from the specified number of rows
 * and the total number of components in the layout. So, for
 * example, if three rows and two columns have been specified
 * and nine components are added to the layout, they will
 * be displayed as three rows of three columns.  Specifying
 * the number of columns affects the layout only when the
 * number of rows is set to zero.
 *
 * @author  Arthur van Hoff
 * @since   JDK1.0
 */
