_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTableModelChange.java
    public int getLastColumn();

    /**
     * Returns the last column that changed.
     * @return the last column that changed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTableModelChange.java
    public int getFirstColumn();

    /**
     * Returns the first column that changed.
     * @return the first column that changed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTableModelChange.java
    public int getLastRow();

    /**
     * Returns the last row that changed.
     * @return the last row that changed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTableModelChange.java
    public int getFirstRow();

    /**
     * Returns the first row that changed.
     * @return the first row that changed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTableModelChange.java
    public int getType();

    /**
     *  Returns the type of event.
     *  @return the type of event
     *  @see #INSERT
     *  @see #UPDATE
     *  @see #DELETE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTableModelChange.java
    public static final int DELETE = -1;

    /**
     * Identifies the deletion of rows and/or columns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTableModelChange.java
    public static final int UPDATE =  0;

    /**
     * Identifies a change to existing data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTableModelChange.java
    public static final int INSERT =  1;

    /**
     * Identifies the insertion of new rows and/or columns.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleTableModelChange.java
public interface AccessibleTableModelChange {

/**
 * The AccessibleTableModelChange interface describes a change to
 * the table model.  The attributes of the model change can be
 * obtained by the following methods:
 * <ul>
 * <li> public int getType()
 * <li> public int getFirstRow();
 * <li> public int getLastRow();
 * <li> public int getFirstColumn();
 * <li> public int getLastColumn();
 * </ul>
 * The model change type returned by getType() will be one of:
 * <ul>
 * <li> INSERT - one or more rows and/or columns have been inserted
 * <li> UPDATE - some of the table data has changed
 * <li> DELETE - one or more rows and/or columns have been deleted
 * </ul>
 * The affected area of the table can be determined by the other
 * four methods which specify ranges of rows and columns
 *
 * @see Accessible
 * @see Accessible#getAccessibleContext
 * @see AccessibleContext
 * @see AccessibleContext#getAccessibleTable
 *
 * @author      Lynn Monsanto
 * @since 1.3
 */
