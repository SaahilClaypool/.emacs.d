_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableSectionElement.java
    public void deleteRow(int index)

    /**
     *  Delete a row from this section.
     * @param index  The index of the row to be deleted. This index starts
     *   from 0 and is relative only to the rows contained inside this
     *   section, not all the rows in the table.
     * @exception DOMException
     *    INDEX_SIZE_ERR: Raised if the specified index is greater than or
     *   equal to the number of rows or if the index is negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableSectionElement.java
    public HTMLElement insertRow(int index)

    /**
     *  Insert a row into this section. The new row is inserted immediately
     * before the current <code>index</code> th row in this section. If
     * <code>index</code> is equal to the number of rows in this section, the
     * new row is appended.
     * @param index  The row number where to insert a new row. This index
     *   starts from 0 and is relative only to the rows contained inside this
     *   section, not all the rows in the table.
     * @return  The newly created row.
     * @exception DOMException
     *    INDEX_SIZE_ERR: Raised if the specified index is greater than the
     *   number of rows of if the index is neagative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableSectionElement.java
    public HTMLCollection getRows();

    /**
     *  The collection of rows in this table section.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableSectionElement.java
    public String getVAlign();

    /**
     *  Vertical alignment of data in cells. See the <code>valign</code>
     * attribute for HTMLTheadElement for details.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableSectionElement.java
    public String getChOff();

    /**
     *  Offset of alignment character. See the  charoff attribute definition
     * in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableSectionElement.java
    public String getCh();

    /**
     *  Alignment character for cells in a column. See the  char attribute
     * definition in HTML 4.0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/html/HTMLTableSectionElement.java
public interface HTMLTableSectionElement extends HTMLElement {

/**
 *  The <code>THEAD</code> , <code>TFOOT</code> , and <code>TBODY</code>
 * elements.
 * <p>See also the <a href='http://www.w3.org/TR/2000/CR-DOM-Level-2-20000510'>Document Object Model (DOM) Level 2 Specification</a>.
 */
