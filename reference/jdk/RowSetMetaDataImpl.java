_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public boolean writable = true;

        /**
         * The field that hold the writable boolean per column of a RowSet
         *
         *@serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public boolean readOnly = false;

        /**
         * The field that holds the updatability boolean per column of a RowSet
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public String colTypeName;

        /**
         * The field that holds the type name used by this particular data source
         * for the value stored in this column.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public int colType;

        /**
         * The field that holds the type code from the class <code>java.sql.Types</code>
         * indicating the type of the value in this column.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public String catName;

        /**
         * The field that holds the catalog name for the table from which this column
         * was derived.  If the DBMS does not support catalogs, the value may be the
         * empty string.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public String tableName ="";

        /**
         * The field that holds the name of the table from which this column
         * was derived.  This value may be the empty string if there is no
         * table name, such as when this column is produced by a join.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public int colScale;

        /**
         * The field that holds the scale (number of digits to the right of the decimal
         * point) of the value in this column.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public int colPrecision;

        /**
         * The field that holds the precision of the value in this column.  For number
         * types, the precision is the total number of decimal digits; for character types,
         * it is the maximum number of characters; for binary types, it is the maximum
         * length in bytes.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public String schemaName;

        /**
         * The field that holds the schema name for the table from which this column
         * was derived.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public  String columnName;

        /**
         * The field that holds the name of this column.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public String columnLabel;

        /**
         * The field that holds the suggested column title for this column, to be
         * used in printing and displays.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public int columnDisplaySize;

        /**
         * The field that indicates the normal maximum width in characters for
         * this column.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public boolean searchable;

        /**
         * The field that indicates whether the value in this column can be used in
         * a <code>WHERE</code> clause.
         * <code>true</code> means that it can; <code>false</code> that it cannot.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public boolean signed;

        /**
         * The field that indicates whether the value in this column is a signed number.
         * <code>true</code> means that it is; <code>false</code> that it is not.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public int nullable;

        /**
         * The field that indicates whether the value in this column is nullable.
         * The possible values are the <code>ResultSet</code> constants
         * <code>columnNoNulls</code>, <code>columnNullable</code>, and
         * <code>columnNullableUnknown</code>.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public boolean currency;

        /**
         * The field that indicates whether the value in this column is a cash value
         * <code>true</code> means that it is; <code>false</code> that it is not.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public boolean caseSensitive;

        /**
         * The field that indicates whether the value in this column is case sensitive.
         * <code>true</code> means that it is; <code>false</code> that it is not.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
        public boolean autoIncrement;

        /**
         * The field that indicates whether the value in this column is a number
         * that is incremented automatically, which makes the value read-only.
         * <code>true</code> means that the value in this column
         * is automatically numbered; <code>false</code> means that it is not.
         *
         * @serial
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public boolean isWrapperFor(Class<?> interfaces) throws SQLException {

    /**
     * Returns true if this either implements the interface argument or is directly or indirectly a wrapper
     * for an object that does. Returns false otherwise. If this implements the interface then return true,
     * else if this is a wrapper then return the result of recursively calling <code>isWrapperFor</code> on the wrapped
     * object. If this does not implement the interface and is not a wrapper, return false.
     * This method should be implemented as a low-cost operation compared to <code>unwrap</code> so that
     * callers can use this method to avoid expensive <code>unwrap</code> calls that may fail. If this method
     * returns true then calling <code>unwrap</code> with the same argument should succeed.
     *
     * @param interfaces a Class defining an interface.
     * @return true if this implements the interface or directly or indirectly wraps an object that does.
     * @throws java.sql.SQLException  if an error occurs while determining whether this is a wrapper
     * for an object with the given interface.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public <T> T unwrap(java.lang.Class<T> iface) throws java.sql.SQLException {

    /**
     * Returns an object that implements the given interface to allow access to non-standard methods,
     * or standard methods not exposed by the proxy.
     * The result may be either the object found to implement the interface or a proxy for that object.
     * If the receiver implements the interface then that is the object. If the receiver is a wrapper
     * and the wrapped object implements the interface then that is the object. Otherwise the object is
     *  the result of calling <code>unwrap</code> recursively on the wrapped object. If the receiver is not a
     * wrapper and does not implement the interface, then an <code>SQLException</code> is thrown.
     *
     * @param iface A Class defining an interface that the result must implement.
     * @return an object that implements the interface. May be a proxy for the actual implementing object.
     * @throws java.sql.SQLException If no object found that implements the interface
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public String getColumnClassName(int columnIndex) throws SQLException {

    /**
     * Retrieves the fully-qualified name of the class in the Java
     * programming language to which a value in the designated column
     * will be mapped.  For example, if the value is an <code>int</code>,
     * the class name returned by this method will be
     * <code>java.lang.Integer</code>.
     * <P>
     * If the value in the designated column has a custom mapping,
     * this method returns the name of the class that implements
     * <code>SQLData</code>. When the method <code>ResultSet.getObject</code>
     * is called to retrieve a value from the designated column, it will
     * create an instance of this class or one of its subclasses.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @return the fully-qualified name of the class in the Java programming
     *        language that would be used by the method <code>RowSet.getObject</code> to
     *        retrieve the value in the specified column. This is the class
     *        name used for custom mapping when there is a custom mapping.
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public  boolean isDefinitelyWritable(int columnIndex) throws SQLException {

    /**
     * Indicates whether a write operation on the designated column
     * will definitely succeed.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return <code>true</code> if a write operation on the designated column will
     *         definitely succeed; <code>false</code> otherwise
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public boolean isWritable(int columnIndex) throws SQLException {

    /**
     * Indicates whether it is possible for a write operation on
     * the designated column to succeed. A return value of
     * <code>true</code> means that a write operation may or may
     * not succeed.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *         must be between <code>1</code> and the number of columns, inclusive
     * @return <code>true</code> if a write operation on the designated column may
     *          will succeed; <code>false</code> otherwise
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public boolean isReadOnly(int columnIndex) throws SQLException {

    /**
     * Indicates whether the designated column is definitely
     * not writable, thus readonly.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return <code>true</code> if this <code>RowSet</code> object is read-Only
     * and thus not updatable; <code>false</code> otherwise
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public String getColumnTypeName(int columnIndex) throws SQLException {

    /**
     * Retrieves the DBMS-specific type name for values stored in the
     * designated column.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return the type name used by the data source
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public int getColumnType(int columnIndex) throws SQLException {

    /**
     * Retrieves the type code (one of the <code>java.sql.Types</code>
     * constants) for the SQL type of the value stored in the
     * designated column.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return an <code>int</code> representing the SQL type of values
     * stored in the designated column
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     * @see java.sql.Types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public String getCatalogName(int columnIndex) throws SQLException {

    /**
     * Retrieves the catalog name of the table from which the value
     * in the designated column was derived.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return the catalog name of the column's table or an empty
     *         <code>String</code> if no catalog name is available
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public String getTableName(int columnIndex) throws SQLException {

    /**
     * Retrieves the name of the table from which the value
     * in the designated column was derived.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return the table name or an empty <code>String</code> if no table name
     *         is available
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public int getScale(int columnIndex) throws SQLException {

    /**
     * Retrieves the number of digits to the right of the decimal point
     * for values stored in the designated column.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return the scale for values stored in the designated column
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public int getPrecision(int columnIndex) throws SQLException {

    /**
     * Retrieves the total number of digits for values stored in
     * the designated column.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return the precision for values stored in the designated column
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public String getSchemaName(int columnIndex) throws SQLException {

    /**
     * Retrieves the schema name of the table from which the value
     * in the designated column was derived.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *         must be between <code>1</code> and the number of columns,
     *         inclusive
     * @return the schema name or an empty <code>String</code> if no schema
     *         name is available
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public String getColumnName(int columnIndex) throws SQLException {

    /**
     * Retrieves the name of the designated column.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return the column name of the designated column
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public String getColumnLabel(int columnIndex) throws SQLException {

    /**
     * Retrieves the suggested column title for the designated
     * column for use in printouts and displays.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @return the suggested column name to use in printouts and displays
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public int getColumnDisplaySize(int columnIndex) throws SQLException {

    /**
     * Retrieves the normal maximum width in chars of the designated column.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @return the maximum number of chars that can be displayed in the designated
     *         column
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public boolean isSigned(int columnIndex) throws SQLException {

    /**
     * Indicates whether a value stored in the designated column is
     * a signed number.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @return <code>true</code> if a value in the designated column is a signed
     *         number; <code>false</code> otherwise
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public int isNullable(int columnIndex) throws SQLException {

    /**
     * Retrieves a constant indicating whether it is possible
     * to store a <code>NULL</code> value in the designated column.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @return a constant from the <code>ResultSetMetaData</code> interface;
     *         either <code>columnNoNulls</code>,
     *         <code>columnNullable</code>, or
     *         <code>columnNullableUnknown</code>
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public boolean isCurrency(int columnIndex) throws SQLException {

    /**
     * Indicates whether a value stored in the designated column
     * is a cash value.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @return <code>true</code> if a value in the designated column is a cash value;
     *         <code>false</code> otherwise
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public boolean isSearchable(int columnIndex) throws SQLException {

    /**
     * Indicates whether a value stored in the designated column
     * can be used in a <code>WHERE</code> clause.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @return <code>true</code> if a value in the designated column can be used in a
     *         <code>WHERE</code> clause; <code>false</code> otherwise
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public boolean isCaseSensitive(int columnIndex) throws SQLException {

    /**
     * Indicates whether the case of the designated column's name
     * matters.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @return <code>true</code> if the column name is case sensitive;
     *          <code>false</code> otherwise
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public boolean isAutoIncrement(int columnIndex) throws SQLException {

    /**
     * Retrieves whether a value stored in the designated column is
     * automatically numbered, and thus readonly.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *         must be between <code>1</code> and the number of columns, inclusive
     * @return <code>true</code> if the column is automatically numbered;
     *         <code>false</code> otherwise
     * @throws SQLException if a database access error occurs
     * or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public int getColumnCount() throws SQLException {

    /**
     * Retrieves the number of columns in the <code>RowSet</code> object
     * for which this <code>RowSetMetaDataImpl</code> object was created.
     *
     * @return the number of columns
     * @throws SQLException if an error occurs determining the column count
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setColumnTypeName(int columnIndex, String typeName)

    /**
     * Sets the type name used by the data source for values stored in the
     * designated column to the given type name.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns, inclusive
     * @param typeName the data source-specific type name; if <i>typeName</i> is
     *        <code>null</code>, an empty <code>String</code> is set
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setColumnType(int columnIndex, int SQLType) throws SQLException {

    /**
     * Sets the SQL type code for values stored in the designated column
     * to the given type code from the class <code>java.sql.Types</code>.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param SQLType the designated column's SQL type, which must be one of the
     *                constants in the class <code>java.sql.Types</code>
     * @throws SQLException if a database access error occurs,
     *         the given column number is out of bounds, or the column type
     *         specified is not one of the constants in
     *         <code>java.sql.Types</code>
     * @see java.sql.Types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setCatalogName(int columnIndex, String catalogName) throws SQLException {

    /**
     * Sets the catalog name of the table from which the designated
     * column was derived to <i>catalogName</i>. If <i>catalogName</i>
     * is <code>null</code>, the catalog name is set to an empty string.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param catalogName the column's table's catalog name; if the catalogName
     *        is <code>null</code>, an empty <code>String</code> is set
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setTableName(int columnIndex, String tableName) throws SQLException {

    /**
     * Sets the name of the table from which the designated column
     * was derived to the given table name.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param tableName the column's table name; may be <code>null</code> or an
     *        empty string
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setScale(int columnIndex, int scale) throws SQLException {

    /**
     * Sets the number of digits to the right of the decimal point in a value
     * stored in the designated column to the given number.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param scale the number of digits to the right of the decimal point; must be
     *        zero or greater
     * @throws SQLException if a database access error occurs,
     *         <i>columnIndex</i> is out of bounds, or <i>scale</i>
     *         is less than <code>0</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setPrecision(int columnIndex, int precision) throws SQLException {

    /**
     * Sets the total number of decimal digits in a value stored in the
     * designated column to the given number.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param precision the total number of decimal digits; must be <code>0</code>
     *        or more
     * @throws SQLException if a database access error occurs,
     *         <i>columnIndex</i> is out of bounds, or <i>precision</i>
     *         is less than <code>0</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setSchemaName(int columnIndex, String schemaName) throws SQLException {

    /**
     * Sets the designated column's table's schema name, if any, to
     * <i>schemaName</i>. If <i>schemaName</i> is <code>null</code>,
     * the schema name is set to an empty string ("").
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param schemaName the schema name for the table from which a value in the
     *        designated column was derived; may be an empty <code>String</code>
     *        or <code>null</code>
     * @throws SQLException if a database access error occurs
     *        or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setColumnName(int columnIndex, String columnName) throws SQLException {

    /**
     * Sets the column name of the designated column to the given name.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *      must be between <code>1</code> and the number of columns, inclusive
     * @param columnName a <code>String</code> object indicating the column name;
     *      if the given name is <code>null</code>, an empty <code>String</code>
     *      is set
     * @throws SQLException if a database access error occurs or the given column
     *      index is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setColumnLabel(int columnIndex, String label) throws SQLException {

    /**
     * Sets the suggested column label for use in printouts and
     * displays, if any, to <i>label</i>. If <i>label</i> is
     * <code>null</code>, the column label is set to an empty string
     * ("").
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param label the column label to be used in printouts and displays; if the
     *        column label is <code>null</code>, an empty <code>String</code> is
     *        set
     * @throws SQLException if a database access error occurs
     *         or the given column index is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setColumnDisplaySize(int columnIndex, int size) throws SQLException {

    /**
     * Sets the normal maximum number of chars in the designated column
     * to the given number.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param size the maximum size of the column in chars; must be
     *        <code>0</code> or more
     * @throws SQLException if a database access error occurs,
     *        the given column number is out of bounds, or <i>size</i> is
     *        less than <code>0</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setSigned(int columnIndex, boolean property) throws SQLException {

    /**
     * Sets whether a value stored in the designated column is a signed
     * number to the given <code>boolean</code>.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param property <code>true</code> to indicate that a column
     *                 value is a signed number;
     *                 <code>false</code> to indicate that it is not
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setNullable(int columnIndex, int property) throws SQLException {

    /**
     * Sets whether a value stored in the designated column can be set
     * to <code>NULL</code> to the given constant from the interface
     * <code>ResultSetMetaData</code>.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns, inclusive
     * @param property one of the following <code>ResultSetMetaData</code> constants:
     *                 <code>columnNoNulls</code>,
     *                 <code>columnNullable</code>, or
     *                 <code>columnNullableUnknown</code>
     *
     * @throws SQLException if a database access error occurs,
     *         the given column number is out of bounds, or the value supplied
     *         for the <i>property</i> parameter is not one of the following
     *         constants:
     *           <code>ResultSetMetaData.columnNoNulls</code>,
     *           <code>ResultSetMetaData.columnNullable</code>, or
     *           <code>ResultSetMetaData.columnNullableUnknown</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setCurrency(int columnIndex, boolean property)

    /**
     * Sets whether a value stored in the designated column is a cash
     * value to the given <code>boolean</code>.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     * must be between <code>1</code> and the number of columns,
     * inclusive between <code>1</code> and the number of columns, inclusive
     * @param property true if the value is a cash value; false otherwise.
     * @throws SQLException if a database access error occurs
     *         or the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setSearchable(int columnIndex, boolean property)

    /**
     * Sets whether a value stored in the designated column can be used
     * in a <code>WHERE</code> clause to the given <code>boolean</code> value.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *                    must be between <code>1</code> and the number
     *                    of columns in the rowset, inclusive
     * @param property <code>true</code> to indicate that a column
     *                 value can be used in a <code>WHERE</code> clause;
     *                 <code>false</code> otherwise
     *
     * @throws SQLException if a database access error occurs or
     *         the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setCaseSensitive(int columnIndex, boolean property) throws SQLException {

    /**
     * Sets whether the name of the designated column is case sensitive to
     * the given <code>boolean</code>.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns
     *        in the rowset, inclusive
     * @param property <code>true</code> to indicate that the column
     *                 name is case sensitive; <code>false</code> otherwise
     * @throws SQLException if a database access error occurs or
     *         the given column number is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setAutoIncrement(int columnIndex, boolean property) throws SQLException {

    /**
     * Sets whether the designated column is automatically
     * numbered, thus read-only, to the given <code>boolean</code>
     * value.
     *
     * @param columnIndex the first column is 1, the second is 2, and so on;
     *        must be between <code>1</code> and the number of columns
     *        in the rowset, inclusive
     * @param property <code>true</code> if the given column is
     *                 automatically incremented; <code>false</code>
     *                 otherwise
     * @throws SQLException if a database access error occurs or
     *         the given index is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    public void setColumnCount(int columnCount) throws SQLException {

    /**
     * Sets to the given number the number of columns in the <code>RowSet</code>
     * object for which this <code>RowSetMetaDataImpl</code> object was created.
     *
     * @param columnCount an <code>int</code> giving the number of columns in the
     *        <code>RowSet</code> object
     * @throws SQLException if the given number is equal to or less than zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    private void checkColType(int SQLType) throws SQLException {

    /**
     * Checks to see that the given SQL type is a valid column type and throws an
     * <code>SQLException</code> object if it is not.
     * To be valid, a SQL type must be one of the constant values
     * in the <code><a href="../../sql/Types.html">java.sql.Types</a></code>
     * class.
     *
     * @param SQLType an <code>int</code> defined in the class <code>java.sql.Types</code>
     * @throws SQLException if the given <code>int</code> is not a constant defined in the
     *         class <code>java.sql.Types</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    private void checkColRange(int col) throws SQLException {

    /**
     * Checks to see that the designated column is a valid column number for
     * the <code>RowSet</code> object for which this <code>RowSetMetaDataImpl</code>
     * was created. To be valid, a column number must be greater than
     * <code>0</code> and less than or equal to the number of columns in a row.
     * @throws <code>SQLException</code> with the message "Invalid column index"
     *        if the given column number is out of the range of valid column
     *        numbers for the <code>RowSet</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    private ColInfo[] colInfo;

    /**
     * An array of <code>ColInfo</code> objects used to store information
     * about each column in the <code>RowSet</code> object for which
     * this <code>RowSetMetaDataImpl</code> object was created. The first
     * <code>ColInfo</code> object in this array contains information about
     * the first column in the <code>RowSet</code> object, the second element
     * contains information about the second column, and so on.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
    private int colCount;

    /**
     * The number of columns in the <code>RowSet</code> object that created
     * this <code>RowSetMetaDataImpl</code> object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetMetaDataImpl.java
public class RowSetMetaDataImpl implements RowSetMetaData,  Serializable {

/**
 * Provides implementations for the methods that set and get
 * metadata information about a <code>RowSet</code> object's columns.
 * A <code>RowSetMetaDataImpl</code> object keeps track of the
 * number of columns in the rowset and maintains an internal array
 * of column attributes for each column.
 * <P>
 * A <code>RowSet</code> object creates a <code>RowSetMetaDataImpl</code>
 * object internally in order to set and retrieve information about
 * its columns.
 * <P>
 * NOTE: All metadata in a <code>RowSetMetaDataImpl</code> object
 * should be considered as unavailable until the <code>RowSet</code> object
 * that it describes is populated.
 * Therefore, any <code>RowSetMetaDataImpl</code> method that retrieves information
 * is defined as having unspecified behavior when it is called
 * before the <code>RowSet</code> object contains data.
 *
 * @since 1.5
 */
