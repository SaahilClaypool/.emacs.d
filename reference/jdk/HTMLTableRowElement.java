_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
    public void deleteCell(int index)

    /**
     *  Delete a cell from the current row.
     * @param index  The index of the cell to delete, starting from 0.
     * @exception DOMException
     *    INDEX_SIZE_ERR: Raised if the specified <code>index</code> is
     *   greater than or equal to the number of cells or if the index is
     *   negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
    public HTMLElement insertCell(int index)

    /**
     *  Insert an empty <code>TD</code> cell into this row. If
     * <code>index</code> is equal to the number of cells, the new cell is
     * appended
     * @param index  The place to insert the cell, starting from 0.
     * @return  The newly created cell.
     * @exception DOMException
     *    INDEX_SIZE_ERR: Raised if the specified <code>index</code> is
     *   greater than the number of cells or if the index is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
    public String getVAlign();

    /**
     *  Vertical alignment of data within cells of this row. See the  valign
     * attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
    public String getChOff();

    /**
     *  Offset of alignment character. See the  charoff attribute definition
     * in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
    public String getCh();

    /**
     *  Alignment character for cells in a column. See the  char attribute
     * definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
    public String getBgColor();

    /**
     *  Background color for rows. See the  bgcolor attribute definition in
     * HTML 4.0. This attribute is deprecated in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
    public String getAlign();

    /**
     *  Horizontal alignment of data within cells of this row. See the  align
     * attribute definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
    public HTMLCollection getCells();

    /**
     *  The collection of cells in this row.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
    public int getSectionRowIndex();

    /**
     *  The index of this row, relative to the current section (
     * <code>THEAD</code> , <code>TFOOT</code> , or <code>TBODY</code> ),
     * starting from 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableRowElement.java
public interface HTMLTableRowElement extends HTMLElement {

/**
 *  A row in a table. See the  TR element definition in HTML 4.0.
 * <p>See also the <a href='http://www.w3.org/TR/2000/CR-DOM-Level-2-20000510'>Document Object Model (DOM) Level 2 Specification</a>.
 */
