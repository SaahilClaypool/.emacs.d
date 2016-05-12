_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
        PageFormat getPageFormat() {

        /**
         * Return the format of the page.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
        Printable getPrintable() {

        /**
         * Return the instance that paints the
         * page.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
        BookPage(Printable painter, PageFormat format) {

        /**
         * A new instance where 'format' describes the page's
         * size and orientation and 'painter' is the instance
         * that will draw the page's graphics.
         * @throws  NullPointerException
         *          If the <code>painter</code> or <code>format</code>
         *          argument is <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
        private Printable mPainter;

        /**
         * The instance that will draw the page.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    private class BookPage {

    /**
     * The BookPage inner class describes an individual
     * page in a Book through a PageFormat-Printable pair.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    private BookPage getPage(int pageIndex)

    /**
     * Return the BookPage for the page specified by 'pageIndex'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public void append(Printable painter, PageFormat page, int numPages) {

    /**
     * Appends <code>numPages</code> pages to the end of this
     * <code>Book</code>.  Each of the pages is associated with
     * <code>page</code>.
     * @param painter   the <code>Printable</code> instance that renders
     *                  the page
     * @param page      the size and orientation of the page
     * @param numPages  the number of pages to be added to the
     *                  this <code>Book</code>.
     * @throws NullPointerException
     *          If the <code>painter</code> or <code>page</code>
     *          argument is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public void append(Printable painter, PageFormat page) {

    /**
     * Appends a single page to the end of this <code>Book</code>.
     * @param painter   the <code>Printable</code> instance that
     *                  renders the page
     * @param page      the size and orientation of the page
     * @throws NullPointerException
     *          If the <code>painter</code> or <code>page</code>
     *          argument is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public void setPage(int pageIndex, Printable painter, PageFormat page)

    /**
     * Sets the <code>PageFormat</code> and the <code>Painter</code> for a
     * specified page number.
     * @param pageIndex the zero based index of the page whose
     *                  painter and format is altered
     * @param painter   the <code>Printable</code> instance that
     *                  renders the page
     * @param page      the size and orientation of the page
     * @throws IndexOutOfBoundsException if the specified
     *          page is not already in this <code>Book</code>
     * @throws NullPointerException if the <code>painter</code> or
     *          <code>page</code> argument is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public Printable getPrintable(int pageIndex)

    /**
     * Returns the {@link Printable} instance responsible for rendering
     * the page specified by <code>pageIndex</code>.
     * @param pageIndex the zero based index of the page whose
     *                  <code>Printable</code> is being requested
     * @return the <code>Printable</code> that renders the page.
     * @throws IndexOutOfBoundsException if the <code>Pageable</code>
     *            does not contain the requested page
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public PageFormat getPageFormat(int pageIndex)

    /**
     * Returns the {@link PageFormat} of the page specified by
     * <code>pageIndex</code>.
     * @param pageIndex the zero based index of the page whose
     *            <code>PageFormat</code> is being requested
     * @return the <code>PageFormat</code> describing the size and
     *          orientation of the page.
     * @throws IndexOutOfBoundsException if the <code>Pageable</code>
     *          does not contain the requested page
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public int getNumberOfPages(){

    /**
     * Returns the number of pages in this <code>Book</code>.
     * @return the number of pages this <code>Book</code> contains.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public Book() {

    /**
     *  Creates a new, empty <code>Book</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    private Vector mPages;

    /**
     * The set of pages that make up the Book.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
public class Book implements Pageable {

/**
 * The <code>Book</code> class provides a representation of a document in
 * which pages may have different page formats and page painters. This
 * class uses the {@link Pageable} interface to interact with a
 * {@link PrinterJob}.
 * @see Pageable
 * @see PrinterJob
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
        PageFormat getPageFormat() {

        /**
         * Return the format of the page.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
        Printable getPrintable() {

        /**
         * Return the instance that paints the
         * page.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
        BookPage(Printable painter, PageFormat format) {

        /**
         * A new instance where 'format' describes the page's
         * size and orientation and 'painter' is the instance
         * that will draw the page's graphics.
         * @throws  NullPointerException
         *          If the <code>painter</code> or <code>format</code>
         *          argument is <code>null</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
        private Printable mPainter;

        /**
         * The instance that will draw the page.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    private class BookPage {

    /**
     * The BookPage inner class describes an individual
     * page in a Book through a PageFormat-Printable pair.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    private BookPage getPage(int pageIndex)

    /**
     * Return the BookPage for the page specified by 'pageIndex'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public void append(Printable painter, PageFormat page, int numPages) {

    /**
     * Appends <code>numPages</code> pages to the end of this
     * <code>Book</code>.  Each of the pages is associated with
     * <code>page</code>.
     * @param painter   the <code>Printable</code> instance that renders
     *                  the page
     * @param page      the size and orientation of the page
     * @param numPages  the number of pages to be added to the
     *                  this <code>Book</code>.
     * @throws NullPointerException
     *          If the <code>painter</code> or <code>page</code>
     *          argument is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public void append(Printable painter, PageFormat page) {

    /**
     * Appends a single page to the end of this <code>Book</code>.
     * @param painter   the <code>Printable</code> instance that
     *                  renders the page
     * @param page      the size and orientation of the page
     * @throws NullPointerException
     *          If the <code>painter</code> or <code>page</code>
     *          argument is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public void setPage(int pageIndex, Printable painter, PageFormat page)

    /**
     * Sets the <code>PageFormat</code> and the <code>Painter</code> for a
     * specified page number.
     * @param pageIndex the zero based index of the page whose
     *                  painter and format is altered
     * @param painter   the <code>Printable</code> instance that
     *                  renders the page
     * @param page      the size and orientation of the page
     * @throws IndexOutOfBoundsException if the specified
     *          page is not already in this <code>Book</code>
     * @throws NullPointerException if the <code>painter</code> or
     *          <code>page</code> argument is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public Printable getPrintable(int pageIndex)

    /**
     * Returns the {@link Printable} instance responsible for rendering
     * the page specified by <code>pageIndex</code>.
     * @param pageIndex the zero based index of the page whose
     *                  <code>Printable</code> is being requested
     * @return the <code>Printable</code> that renders the page.
     * @throws IndexOutOfBoundsException if the <code>Pageable</code>
     *            does not contain the requested page
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public PageFormat getPageFormat(int pageIndex)

    /**
     * Returns the {@link PageFormat} of the page specified by
     * <code>pageIndex</code>.
     * @param pageIndex the zero based index of the page whose
     *            <code>PageFormat</code> is being requested
     * @return the <code>PageFormat</code> describing the size and
     *          orientation of the page.
     * @throws IndexOutOfBoundsException if the <code>Pageable</code>
     *          does not contain the requested page
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public int getNumberOfPages(){

    /**
     * Returns the number of pages in this <code>Book</code>.
     * @return the number of pages this <code>Book</code> contains.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    public Book() {

    /**
     *  Creates a new, empty <code>Book</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
    private Vector mPages;

    /**
     * The set of pages that make up the Book.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Book.java
public class Book implements Pageable {

/**
 * The <code>Book</code> class provides a representation of a document in
 * which pages may have different page formats and page painters. This
 * class uses the {@link Pageable} interface to interact with a
 * {@link PrinterJob}.
 * @see Pageable
 * @see PrinterJob
*/
