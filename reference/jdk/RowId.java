_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowId.java
     int hashCode();

     /**
      * Returns a hash code value of this <code>RowId</code> object.
      *
      * @return a hash code for the <code>RowId</code>
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowId.java
     String toString();

     /**
      * Returns a String representing the value of the SQL ROWID designated by this
      * <code>java.sql.RowId</code> object.
      * <p>
      *Like <code>java.sql.Date.toString()</code>
      * returns the contents of its DATE as the <code>String</code> "2004-03-17"
      * rather than as  DATE literal in SQL (which would have been the <code>String</code>
      * DATE "2004-03-17"), toString()
      * returns the contents of its ROWID in a form specific to the driver supplying
      * the connection, and possibly not as a <code>ROWID</code> literal.
      *
      * @return a String whose format is determined by the driver supplying the
      *     connection, representing the value of the <code>ROWID</code> designated
      *     by this <code>java.sql.RowId</code>  object.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowId.java
     byte[] getBytes();

    /**
     * Returns an array of bytes representing the value of the SQL <code>ROWID</code>
     * designated by this <code>java.sql.RowId</code> object.
     *
     * @return an array of bytes, whose length is determined by the driver supplying
     *     the connection, representing the value of the ROWID designated by this
     *     java.sql.RowId object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowId.java
public interface RowId {

/**
 *
 * The representation (mapping) in the Java programming language of an SQL ROWID
 * value. An SQL ROWID is a built-in type, a value of which can be thought of as
 * an address  for its identified row in a database table. Whether that address
 * is logical or, in any  respects, physical is determined by its originating data
 * source.
 * <p>
 * Methods in the interfaces <code>ResultSet</code>, <code>CallableStatement</code>,
 * and <code>PreparedStatement</code>, such as <code>getRowId</code> and <code>setRowId</code>
 * allow a programmer to access a SQL <code>ROWID</code>  value. The <code>RowId</code>
 * interface provides a method
 * for representing the value of the <code>ROWID</code> as a byte array or as a
 * <code>String</code>.
 * <p>
 * The method <code>getRowIdLifetime</code> in the interface <code>DatabaseMetaData</code>,
 * can be used
 * to determine if a <code>RowId</code> object remains valid for the duration of the transaction in
 * which  the <code>RowId</code> was created, the duration of the session in which
 * the <code>RowId</code> was created,
 * or, effectively, for as long as its identified row is not deleted. In addition
 * to specifying the duration of its valid lifetime outside its originating data
 * source, <code>getRowIdLifetime</code> specifies the duration of a <code>ROWID</code>
 * value's valid lifetime
 * within its originating data source. In this, it differs from a large object,
 * because there is no limit on the valid lifetime of a large  object within its
 * originating data source.
 * <p>
 * All methods on the <code>RowId</code> interface must be fully implemented if the
 * JDBC driver supports the data type.
 *
 * @see java.sql.DatabaseMetaData
 * @since 1.6
 */
