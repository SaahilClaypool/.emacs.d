_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public int [] getSelectedAccessibleColumns();

    /**
     * Returns the selected columns in a table.
     *
     * @return an array of selected columns where each element is a
     * zero-based column of the table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public int [] getSelectedAccessibleRows();

    /**
     * Returns the selected rows in a table.
     *
     * @return an array of selected rows where each element is a
     * zero-based row of the table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public boolean isAccessibleColumnSelected(int c);

    /**
     * Returns a boolean value indicating whether the specified column
     * is selected.
     *
     * @param c zero-based column of the table
     * @return the boolean value true if the specified column is selected.
     * Otherwise, false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public boolean isAccessibleRowSelected(int r);

    /**
     * Returns a boolean value indicating whether the specified row
     * is selected.
     *
     * @param r zero-based row of the table
     * @return the boolean value true if the specified row is selected.
     * Otherwise, false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public boolean isAccessibleSelected(int r, int c);

    /**
     * Returns a boolean value indicating whether the accessible at
     * a specified row and column is selected.
     *
     * @param r zero-based row of the table
     * @param c zero-based column of the table
     * @return the boolean value true if the accessible at the
     * row and column is selected. Otherwise, the boolean value
     * false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public void setAccessibleColumnDescription(int c, Accessible a);

    /**
     * Sets the description text of the specified column in the table.
     *
     * @param c zero-based column of the table
     * @param a the text description of the column
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public Accessible getAccessibleColumnDescription(int c);

    /**
     * Returns the description text of the specified column in the table.
     *
     * @param c zero-based column of the table
     * @return the text description of the column
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public void setAccessibleRowDescription(int r, Accessible a);

    /**
     * Sets the description text of the specified row of the table.
     *
     * @param r zero-based row of the table
     * @param a the description of the row
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public Accessible getAccessibleRowDescription(int r);

    /**
     * Returns the description of the specified row in the table.
     *
     * @param r zero-based row of the table
     * @return the description of the row
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public void setAccessibleColumnHeader(AccessibleTable table);

    /**
     * Sets the column headers.
     *
     * @param table an AccessibleTable representing the
     * column headers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public AccessibleTable getAccessibleColumnHeader();

    /**
     * Returns the column headers as an AccessibleTable.
     *
     * @return an AccessibleTable representing the column
     * headers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public void setAccessibleRowHeader(AccessibleTable table);

    /**
     * Sets the row headers.
     *
     * @param table an AccessibleTable representing the
     * row headers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public AccessibleTable getAccessibleRowHeader();

    /**
     * Returns the row headers as an AccessibleTable.
     *
     * @return an AccessibleTable representing the row
     * headers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public int getAccessibleColumnExtentAt(int r, int c);

    /**
     * Returns the number of columns occupied by the Accessible at
     * a specified row and column in the table.
     *
     * @param r zero-based row of the table
     * @param c zero-based column of the table
     * @return the number of columns occupied by the Accessible at a
     * given specified row and column
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public int getAccessibleRowExtentAt(int r, int c);

    /**
     * Returns the number of rows occupied by the Accessible at
     * a specified row and column in the table.
     *
     * @param r zero-based row of the table
     * @param c zero-based column of the table
     * @return the number of rows occupied by the Accessible at a
     * given specified (row, column)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public Accessible getAccessibleAt(int r, int c);

    /**
     * Returns the Accessible at a specified row and column
     * in the table.
     *
     * @param r zero-based row of the table
     * @param c zero-based column of the table
     * @return the Accessible at the specified row and column
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public int getAccessibleColumnCount();

    /**
     * Returns the number of columns in the table.
     *
     * @return the number of columns in the table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public int getAccessibleRowCount();

    /**
     * Returns the number of rows in the table.
     *
     * @return the number of rows in the table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public void setAccessibleSummary(Accessible a);

    /**
     * Sets the summary description of the table
     *
     * @param a the summary description of the table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public Accessible getAccessibleSummary();

    /**
     * Returns the summary description of the table.
     *
     * @return the summary description of the table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public void setAccessibleCaption(Accessible a);

    /**
     * Sets the caption for the table.
     *
     * @param a the caption for the table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
    public Accessible getAccessibleCaption();

    /**
     * Returns the caption for the table.
     *
     * @return the caption for the table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTable.java
public interface AccessibleTable {

/**
 * Class AccessibleTable describes a user-interface component that
 * presents data in a two-dimensional table format.
 *
 * @author      Lynn Monsanto
 * @since 1.3
 */
