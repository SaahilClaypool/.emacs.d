_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleExtendedTable.java
     public int getAccessibleIndex(int r, int c);

    /**
      * Returns the index at a row and column in the table.
      *
      * @param r zero-based row of the table
      * @param c zero-based column of the table
      * @return the zero-based index in the table if one exists;
      * otherwise -1.  The index is  the table cell offset from
      * row == 0 and column == 0.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleExtendedTable.java
     public int getAccessibleColumn(int index);

     /**
      * Returns the column number of an index in the table.
      *
      * @param index the zero-based index in the table.  The index is
      * the table cell offset from row == 0 and column == 0.
      * @return the zero-based column of the table if one exists;
      * otherwise -1.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleExtendedTable.java
     public int getAccessibleRow(int index);

     /**
      * Returns the row number of an index in the table.
      *
      * @param index the zero-based index in the table.  The index is
      * the table cell offset from row == 0 and column == 0.
      * @return the zero-based row of the table if one exists;
      * otherwise -1.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleExtendedTable.java
public interface AccessibleExtendedTable extends AccessibleTable {

/**
  * Class AccessibleExtendedTable provides extended information about
  * a user-interface component that presents data in a two-dimensional
  * table format.
  * Applications can determine if an object supports the
  * AccessibleExtendedTable interface by first obtaining its
  * AccessibleContext and then calling the
  * {@link AccessibleContext#getAccessibleTable} method.
  * If the return value is not null and the type of the return value is
  * AccessibleExtendedTable, the object supports this interface.
  *
  * @author      Lynn Monsanto
  * @since 1.4
  */
