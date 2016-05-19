_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private void findNextClip(int pw, int ph) {

    /**
     * Calculate the area of the table to be printed for
     * the next page. This should only be called if there
     * are rows and columns left to print.
     *
     * To avoid an infinite loop in printing, this will
     * always put at least one cell on each page.
     *
     * @param  pw  the width of the area to print in
     * @param  ph  the height of the area to print in
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private void printText(Graphics2D g2d,
                           String text,
                           Rectangle2D rect,
                           Font font,
                           int imgWidth) {

    /**
     * A helper method that encapsulates common code for rendering the
     * header and footer text.
     *
     * @param  g2d       the graphics to draw into
     * @param  text      the text to draw, non null
     * @param  rect      the bounding rectangle for this text,
     *                   as calculated at the given font, non null
     * @param  font      the font to draw the text in, non null
     * @param  imgWidth  the width of the area to draw into
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)

    /**
     * Prints the specified page of the table into the given {@link Graphics}
     * context, in the specified format.
     *
     * @param   graphics    the context into which the page is drawn
     * @param   pageFormat  the size and orientation of the page being drawn
     * @param   pageIndex   the zero based index of the page to be drawn
     * @return  PAGE_EXISTS if the page is rendered successfully, or
     *          NO_SUCH_PAGE if a non-existent page index is specified
     * @throws  PrinterException if an error causes printing to be aborted
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    public TablePrintable(JTable table,
                          JTable.PrintMode printMode,
                          MessageFormat headerFormat,
                          MessageFormat footerFormat) {

    /**
     * Create a new <code>TablePrintable</code> for the given
     * <code>JTable</code>. Header and footer text can be specified using the
     * two <code>MessageFormat</code> parameters. When called upon to provide
     * a String, each format is given the current page number.
     *
     * @param  table         the table to print
     * @param  printMode     the printing mode for this printable
     * @param  headerFormat  a <code>MessageFormat</code> specifying the text to
     *                       be used in printing a header, or null for none
     * @param  footerFormat  a <code>MessageFormat</code> specifying the text to
     *                       be used in printing a footer, or null for none
     * @throws IllegalArgumentException if passed an invalid print mode
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private Font footerFont;

    /** The font to use in rendering footer text. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private Font headerFont;

    /** The font to use in rendering header text. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private static final float FOOTER_FONT_SIZE = 12.0f;

    /** Font size for the footer text. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private static final float HEADER_FONT_SIZE = 18.0f;

    /** Font size for the header text. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private static final int H_F_SPACE = 8;

    /** Vertical space to leave between table and header/footer text. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private final Rectangle tempRect = new Rectangle(0, 0, 0, 0);

    /** Saves the creation of multiple rectangles. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private final Rectangle hclip = new Rectangle(0, 0, 0, 0);

    /** Used to store an area of the table's header to be printed. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private final Rectangle clip = new Rectangle(0, 0, 0, 0);

    /** Used to store an area of the table to be printed. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private int col = 0;

    /** The next column to print. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private int row = 0;

    /** The next row to print. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private int last = -1;

    /** The most recent page index asked to print. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private MessageFormat footerFormat;

    /** Provides the footer text for the table. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private MessageFormat headerFormat;

    /** Provides the header text for the table. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private JTable.PrintMode printMode;

    /** The printing mode of this printable. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private int totalColWidth;

    /** To save multiple calculations of total column width. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private TableColumnModel colModel;

    /** For quick reference to the table's column model. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private JTableHeader header;

    /** For quick reference to the table's header. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
    private JTable table;

    /** The table to print. */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//TablePrintable.java
class TablePrintable implements Printable {

/**
 * An implementation of <code>Printable</code> for printing
 * <code>JTable</code>s.
 * <p>
 * This implementation spreads table rows naturally in sequence
 * across multiple pages, fitting as many rows as possible per page.
 * The distribution of columns, on the other hand, is controlled by a
 * printing mode parameter passed to the constructor. When
 * <code>JTable.PrintMode.NORMAL</code> is used, the implementation
 * handles columns in a similar manner to how it handles rows, spreading them
 * across multiple pages (in an order consistent with the table's
 * <code>ComponentOrientation</code>).
 * When <code>JTable.PrintMode.FIT_WIDTH</code> is given, the implementation
 * scales the output smaller if necessary, to ensure that all columns fit on
 * the page. (Note that width and height are scaled equally, ensuring that the
 * aspect ratio remains the same).
 * <p>
 * The portion of table printed on each page is headed by the
 * appropriate section of the table's <code>JTableHeader</code>.
 * <p>
 * Header and footer text can be added to the output by providing
 * <code>MessageFormat</code> instances to the constructor. The
 * printing code requests Strings from the formats by calling
 * their <code>format</code> method with a single parameter:
 * an <code>Object</code> array containing a single element of type
 * <code>Integer</code>, representing the current page number.
 * <p>
 * There are certain circumstances where this <code>Printable</code>
 * cannot fit items appropriately, resulting in clipped output.
 * These are:
 * <ul>
 *   <li>In any mode, when the header or footer text is too wide to
 *       fit completely in the printable area. The implementation
 *       prints as much of the text as possible starting from the beginning,
 *       as determined by the table's <code>ComponentOrientation</code>.
 *   <li>In any mode, when a row is too tall to fit in the
 *       printable area. The upper most portion of the row
 *       is printed and no lower border is shown.
 *   <li>In <code>JTable.PrintMode.NORMAL</code> when a column
 *       is too wide to fit in the printable area. The center of the
 *       column is printed and no left and right borders are shown.
 * </ul>
 * <p>
 * It is entirely valid for a developer to wrap this <code>Printable</code>
 * inside another in order to create complex reports and documents. They may
 * even request that different pages be rendered into different sized
 * printable areas. The implementation was designed to handle this by
 * performing most of its calculations on the fly. However, providing different
 * sizes works best when <code>JTable.PrintMode.FIT_WIDTH</code> is used, or
 * when only the printable width is changed between pages. This is because when
 * it is printing a set of rows in <code>JTable.PrintMode.NORMAL</code> and the
 * implementation determines a need to distribute columns across pages,
 * it assumes that all of those rows will fit on each subsequent page needed
 * to fit the columns.
 * <p>
 * It is the responsibility of the developer to ensure that the table is not
 * modified in any way after this <code>Printable</code> is created (invalid
 * modifications include changes in: size, renderers, or underlying data).
 * The behavior of this <code>Printable</code> is undefined if the table is
 * changed at any time after creation.
 *
 * @author  Shannon Hickey
 */
