_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
    Printable getPrintable(int pageIndex)

    /**
     * Returns the <code>Printable</code> instance responsible for
     * rendering the page specified by <code>pageIndex</code>.
     * @param pageIndex the zero based index of the page whose
     *            <code>Printable</code> is being requested
     * @return the <code>Printable</code> that renders the page.
     * @throws IndexOutOfBoundsException if
     *            the <code>Pageable</code> does not contain the requested
     *            page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
    PageFormat getPageFormat(int pageIndex)

    /**
     * Returns the <code>PageFormat</code> of the page specified by
     * <code>pageIndex</code>.
     * @param pageIndex the zero based index of the page whose
     *            <code>PageFormat</code> is being requested
     * @return the <code>PageFormat</code> describing the size and
     *          orientation.
     * @throws IndexOutOfBoundsException if
     *          the <code>Pageable</code> does not contain the requested
     *          page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
    int getNumberOfPages();

    /**
     * Returns the number of pages in the set.
     * To enable advanced printing features,
     * it is recommended that <code>Pageable</code>
     * implementations return the true number of pages
     * rather than the
     * UNKNOWN_NUMBER_OF_PAGES constant.
     * @return the number of pages in this <code>Pageable</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
    @Native int UNKNOWN_NUMBER_OF_PAGES = -1;

    /**
     * This constant is returned from the
     * {@link #getNumberOfPages() getNumberOfPages}
     * method if a <code>Pageable</code> implementation does not know
     * the number of pages in its set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
public interface Pageable {

/**
 * The <code>Pageable</code> implementation represents a set of
 * pages to be printed. The <code>Pageable</code> object returns
 * the total number of pages in the set as well as the
 * {@link PageFormat} and {@link Printable} for a specified page.
 * @see java.awt.print.PageFormat
 * @see java.awt.print.Printable
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
    Printable getPrintable(int pageIndex)

    /**
     * Returns the <code>Printable</code> instance responsible for
     * rendering the page specified by <code>pageIndex</code>.
     * @param pageIndex the zero based index of the page whose
     *            <code>Printable</code> is being requested
     * @return the <code>Printable</code> that renders the page.
     * @throws IndexOutOfBoundsException if
     *            the <code>Pageable</code> does not contain the requested
     *            page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
    PageFormat getPageFormat(int pageIndex)

    /**
     * Returns the <code>PageFormat</code> of the page specified by
     * <code>pageIndex</code>.
     * @param pageIndex the zero based index of the page whose
     *            <code>PageFormat</code> is being requested
     * @return the <code>PageFormat</code> describing the size and
     *          orientation.
     * @throws IndexOutOfBoundsException if
     *          the <code>Pageable</code> does not contain the requested
     *          page.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
    int getNumberOfPages();

    /**
     * Returns the number of pages in the set.
     * To enable advanced printing features,
     * it is recommended that <code>Pageable</code>
     * implementations return the true number of pages
     * rather than the
     * UNKNOWN_NUMBER_OF_PAGES constant.
     * @return the number of pages in this <code>Pageable</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
    @Native int UNKNOWN_NUMBER_OF_PAGES = -1;

    /**
     * This constant is returned from the
     * {@link #getNumberOfPages() getNumberOfPages}
     * method if a <code>Pageable</code> implementation does not know
     * the number of pages in its set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/print/Pageable.java
public interface Pageable {

/**
 * The <code>Pageable</code> implementation represents a set of
 * pages to be printed. The <code>Pageable</code> object returns
 * the total number of pages in the set as well as the
 * {@link PageFormat} and {@link Printable} for a specified page.
 * @see java.awt.print.PageFormat
 * @see java.awt.print.Printable
 */
