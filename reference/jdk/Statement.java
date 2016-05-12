_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public String toString() {

    /**
     * Prints the value of this statement using a Java-style syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public void execute() throws Exception {

    /**
     * The {@code execute} method finds a method whose name is the same
     * as the {@code methodName} property, and invokes the method on
     * the target.
     *
     * When the target's class defines many methods with the given name
     * the implementation should choose the most specific method using
     * the algorithm specified in the Java Language Specification
     * (15.11). The dynamic class of the target and arguments are used
     * in place of the compile-time type information and, like the
     * {@link java.lang.reflect.Method} class itself, conversion between
     * primitive values and their associated wrapper classes is handled
     * internally.
     * <p>
     * The following method types are handled as special cases:
     * <ul>
     * <li>
     * Static methods may be called by using a class object as the target.
     * <li>
     * The reserved method name "new" may be used to call a class's constructor
     * as if all classes defined static "new" methods. Constructor invocations
     * are typically considered {@code Expression}s rather than {@code Statement}s
     * as they return a value.
     * <li>
     * The method names "get" and "set" defined in the {@link java.util.List}
     * interface may also be applied to array instances, mapping to
     * the static methods of the same name in the {@code Array} class.
     * </ul>
     *
     * @throws NullPointerException if the value of the {@code target} or
     *                              {@code methodName} property is {@code null}
     * @throws NoSuchMethodException if a matching method is not found
     * @throws SecurityException if a security manager exists and
     *                           it denies the method invocation
     * @throws Exception that is thrown by the invoked method
     *
     * @see java.lang.reflect.Method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public Object[] getArguments() {

    /**
     * Returns the arguments for the method to invoke.
     * The number of arguments and their types
     * must match the method being  called.
     * {@code null} can be used as a synonym of an empty array.
     *
     * @return the array of arguments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public String getMethodName() {

    /**
     * Returns the name of the method to invoke.
     * If this method returns {@code null},
     * the {@link #execute} method
     * throws a {@code NullPointerException}.
     *
     * @return the name of the method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public Object getTarget() {

    /**
     * Returns the target object of this statement.
     * If this method returns {@code null},
     * the {@link #execute} method
     * throws a {@code NullPointerException}.
     *
     * @return the target object of this statement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    @ConstructorProperties({"target", "methodName", "arguments"})

    /**
     * Creates a new {@link Statement} object
     * for the specified target object to invoke the method
     * specified by the name and by the array of arguments.
     * <p>
     * The {@code target} and the {@code methodName} values should not be {@code null}.
     * Otherwise an attempt to execute this {@code Expression}
     * will result in a {@code NullPointerException}.
     * If the {@code arguments} value is {@code null},
     * an empty array is used as the value of the {@code arguments} property.
     *
     * @param target  the target object of this statement
     * @param methodName  the name of the method to invoke on the specified target
     * @param arguments  the array of arguments to invoke the specified method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
public class Statement {

/**
 * A <code>Statement</code> object represents a primitive statement
 * in which a single method is applied to a target and
 * a set of arguments - as in <code>"a.setFoo(b)"</code>.
 * Note that where this example uses names
 * to denote the target and its argument, a statement
 * object does not require a name space and is constructed with
 * the values themselves.
 * The statement object associates the named method
 * with its environment as a simple set of values:
 * the target and an array of argument values.
 *
 * @since 1.4
 *
 * @author Philip Milne
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public String toString() {

    /**
     * Prints the value of this statement using a Java-style syntax.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public void execute() throws Exception {

    /**
     * The {@code execute} method finds a method whose name is the same
     * as the {@code methodName} property, and invokes the method on
     * the target.
     *
     * When the target's class defines many methods with the given name
     * the implementation should choose the most specific method using
     * the algorithm specified in the Java Language Specification
     * (15.11). The dynamic class of the target and arguments are used
     * in place of the compile-time type information and, like the
     * {@link java.lang.reflect.Method} class itself, conversion between
     * primitive values and their associated wrapper classes is handled
     * internally.
     * <p>
     * The following method types are handled as special cases:
     * <ul>
     * <li>
     * Static methods may be called by using a class object as the target.
     * <li>
     * The reserved method name "new" may be used to call a class's constructor
     * as if all classes defined static "new" methods. Constructor invocations
     * are typically considered {@code Expression}s rather than {@code Statement}s
     * as they return a value.
     * <li>
     * The method names "get" and "set" defined in the {@link java.util.List}
     * interface may also be applied to array instances, mapping to
     * the static methods of the same name in the {@code Array} class.
     * </ul>
     *
     * @throws NullPointerException if the value of the {@code target} or
     *                              {@code methodName} property is {@code null}
     * @throws NoSuchMethodException if a matching method is not found
     * @throws SecurityException if a security manager exists and
     *                           it denies the method invocation
     * @throws Exception that is thrown by the invoked method
     *
     * @see java.lang.reflect.Method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public Object[] getArguments() {

    /**
     * Returns the arguments for the method to invoke.
     * The number of arguments and their types
     * must match the method being  called.
     * {@code null} can be used as a synonym of an empty array.
     *
     * @return the array of arguments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public String getMethodName() {

    /**
     * Returns the name of the method to invoke.
     * If this method returns {@code null},
     * the {@link #execute} method
     * throws a {@code NullPointerException}.
     *
     * @return the name of the method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    public Object getTarget() {

    /**
     * Returns the target object of this statement.
     * If this method returns {@code null},
     * the {@link #execute} method
     * throws a {@code NullPointerException}.
     *
     * @return the target object of this statement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
    @ConstructorProperties({"target", "methodName", "arguments"})

    /**
     * Creates a new {@link Statement} object
     * for the specified target object to invoke the method
     * specified by the name and by the array of arguments.
     * <p>
     * The {@code target} and the {@code methodName} values should not be {@code null}.
     * Otherwise an attempt to execute this {@code Expression}
     * will result in a {@code NullPointerException}.
     * If the {@code arguments} value is {@code null},
     * an empty array is used as the value of the {@code arguments} property.
     *
     * @param target  the target object of this statement
     * @param methodName  the name of the method to invoke on the specified target
     * @param arguments  the array of arguments to invoke the specified method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/Statement.java
public class Statement {

/**
 * A <code>Statement</code> object represents a primitive statement
 * in which a single method is applied to a target and
 * a set of arguments - as in <code>"a.setFoo(b)"</code>.
 * Note that where this example uses names
 * to denote the target and its argument, a statement
 * object does not require a name space and is constructed with
 * the values themselves.
 * The statement object associates the named method
 * with its environment as a simple set of values:
 * the target and an array of argument values.
 *
 * @since 1.4
 *
 * @author Philip Milne
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    default long executeLargeUpdate(String sql, String columnNames[])

    /**
     * Executes the given SQL statement and signals the driver that the
     * auto-generated keys indicated in the given array should be made available
     * for retrieval.   This array contains the names of the columns in the
     * target table that contain the auto-generated keys that should be made
     * available. The driver will ignore the array if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     * <p>
     * This method should be used when the returned row count may exceed
     * {@link Integer#MAX_VALUE}.
     * <p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     *<p>
     * The default implementation will throw {@code SQLFeatureNotSupportedException}
     *
     * @param sql an SQL Data Manipulation Language (DML) statement,
     * such as <code>INSERT</code>, <code>UPDATE</code> or
     * <code>DELETE</code>; or an SQL statement that returns nothing,
     * such as a DDL statement.
     * @param columnNames an array of the names of the columns that should be
     *        returned from the inserted row
     * @return either the row count for <code>INSERT</code>, <code>UPDATE</code>,
     *         or <code>DELETE</code> statements, or 0 for SQL statements
     *         that return nothing
     * @exception SQLException if a database access error occurs,
     *  this method is called on a closed <code>Statement</code>, the SQL
     *            statement returns a <code>ResultSet</code> object, the
     *            second argument supplied to this method is not a <code>String</code> array
     *            whose elements are valid column names, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this method
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    default long executeLargeUpdate(String sql, int columnIndexes[]) throws SQLException {

    /**
     * Executes the given SQL statement and signals the driver that the
     * auto-generated keys indicated in the given array should be made available
     * for retrieval.   This array contains the indexes of the columns in the
     * target table that contain the auto-generated keys that should be made
     * available. The driver will ignore the array if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     * <p>
     * This method should be used when the returned row count may exceed
     * {@link Integer#MAX_VALUE}.
     * <p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     *<p>
     * The default implementation will throw {@code SQLFeatureNotSupportedException}
     *
     * @param sql an SQL Data Manipulation Language (DML) statement,
     * such as <code>INSERT</code>, <code>UPDATE</code> or
     * <code>DELETE</code>; or an SQL statement that returns nothing,
     * such as a DDL statement.
     *
     * @param columnIndexes an array of column indexes indicating the columns
     *        that should be returned from the inserted row
     * @return either (1) the row count for SQL Data Manipulation Language (DML) statements
     *         or (2) 0 for SQL statements that return nothing
     *
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>, the SQL
     * statement returns a <code>ResultSet</code> object,the second argument
     * supplied to this method is not an
     * <code>int</code> array whose elements are valid column indexes, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this method
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    default long executeLargeUpdate(String sql, int autoGeneratedKeys)

    /**
     * Executes the given SQL statement and signals the driver with the
     * given flag about whether the
     * auto-generated keys produced by this <code>Statement</code> object
     * should be made available for retrieval.  The driver will ignore the
     * flag if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     * <p>
     * This method should be used when the returned row count may exceed
     * {@link Integer#MAX_VALUE}.
     * <p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     *<p>
     * The default implementation will throw {@code SQLFeatureNotSupportedException}
     *
     * @param sql an SQL Data Manipulation Language (DML) statement,
     * such as <code>INSERT</code>, <code>UPDATE</code> or
     * <code>DELETE</code>; or an SQL statement that returns nothing,
     * such as a DDL statement.
     *
     * @param autoGeneratedKeys a flag indicating whether auto-generated keys
     *        should be made available for retrieval;
     *         one of the following constants:
     *         <code>Statement.RETURN_GENERATED_KEYS</code>
     *         <code>Statement.NO_GENERATED_KEYS</code>
     * @return either (1) the row count for SQL Data Manipulation Language (DML) statements
     *         or (2) 0 for SQL statements that return nothing
     *
     * @exception SQLException if a database access error occurs,
     *  this method is called on a closed <code>Statement</code>, the given
     *            SQL statement returns a <code>ResultSet</code> object,
     *            the given constant is not one of those allowed, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method with a constant of Statement.RETURN_GENERATED_KEYS
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    default long executeLargeUpdate(String sql) throws SQLException {

    /**
     * Executes the given SQL statement, which may be an <code>INSERT</code>,
     * <code>UPDATE</code>, or <code>DELETE</code> statement or an
     * SQL statement that returns nothing, such as an SQL DDL statement.
     * <p>
     * This method should be used when the returned row count may exceed
     * {@link Integer#MAX_VALUE}.
     * <p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     *<p>
     * The default implementation will throw {@code UnsupportedOperationException}
     *
     * @param sql an SQL Data Manipulation Language (DML) statement,
     * such as <code>INSERT</code>, <code>UPDATE</code> or
     * <code>DELETE</code>; or an SQL statement that returns nothing,
     * such as a DDL statement.
     *
     * @return either (1) the row count for SQL Data Manipulation Language
     * (DML) statements or (2) 0 for SQL statements that return nothing
     *
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>, the given
     * SQL statement produces a <code>ResultSet</code> object, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    default long[] executeLargeBatch() throws SQLException {

    /**
     * Submits a batch of commands to the database for execution and
     * if all commands execute successfully, returns an array of update counts.
     * The <code>long</code> elements of the array that is returned are ordered
     * to correspond to the commands in the batch, which are ordered
     * according to the order in which they were added to the batch.
     * The elements in the array returned by the method {@code executeLargeBatch}
     * may be one of the following:
     * <OL>
     * <LI>A number greater than or equal to zero -- indicates that the
     * command was processed successfully and is an update count giving the
     * number of rows in the database that were affected by the command's
     * execution
     * <LI>A value of <code>SUCCESS_NO_INFO</code> -- indicates that the command was
     * processed successfully but that the number of rows affected is
     * unknown
     * <P>
     * If one of the commands in a batch update fails to execute properly,
     * this method throws a <code>BatchUpdateException</code>, and a JDBC
     * driver may or may not continue to process the remaining commands in
     * the batch.  However, the driver's behavior must be consistent with a
     * particular DBMS, either always continuing to process commands or never
     * continuing to process commands.  If the driver continues processing
     * after a failure, the array returned by the method
     * <code>BatchUpdateException.getLargeUpdateCounts</code>
     * will contain as many elements as there are commands in the batch, and
     * at least one of the elements will be the following:
     *
     * <LI>A value of <code>EXECUTE_FAILED</code> -- indicates that the command failed
     * to execute successfully and occurs only if a driver continues to
     * process commands after a command fails
     * </OL>
     * <p>
     * This method should be used when the returned row count may exceed
     * {@link Integer#MAX_VALUE}.
     *<p>
     * The default implementation will throw {@code UnsupportedOperationException}
     *
     * @return an array of update counts containing one element for each
     * command in the batch.  The elements of the array are ordered according
     * to the order in which commands were added to the batch.
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code> or the
     * driver does not support batch statements. Throws {@link BatchUpdateException}
     * (a subclass of <code>SQLException</code>) if one of the commands sent to the
     * database fails to execute properly or attempts to return a result set.
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     *
     * @see #addBatch
     * @see DatabaseMetaData#supportsBatchUpdates
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    default long getLargeMaxRows() throws SQLException {

    /**
     * Retrieves the maximum number of rows that a
     * <code>ResultSet</code> object produced by this
     * <code>Statement</code> object can contain.  If this limit is exceeded,
     * the excess rows are silently dropped.
     * <p>
     * This method should be used when the returned row limit may exceed
     * {@link Integer#MAX_VALUE}.
     *<p>
     * The default implementation will return {@code 0}
     *
     * @return the current maximum number of rows for a <code>ResultSet</code>
     *         object produced by this <code>Statement</code> object;
     *         zero means there is no limit
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @see #setMaxRows
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    default void setLargeMaxRows(long max) throws SQLException {

    /**
     * Sets the limit for the maximum number of rows that any
     * <code>ResultSet</code> object  generated by this <code>Statement</code>
     * object can contain to the given number.
     * If the limit is exceeded, the excess
     * rows are silently dropped.
     * <p>
     * This method should be used when the row limit may exceed
     * {@link Integer#MAX_VALUE}.
     *<p>
     * The default implementation will throw {@code UnsupportedOperationException}
     *
     * @param max the new max rows limit; zero means there is no limit
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>
     *            or the condition {@code max >= 0} is not satisfied
     * @see #getMaxRows
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    default long getLargeUpdateCount() throws SQLException {

    /**
     *  Retrieves the current result as an update count; if the result
     * is a <code>ResultSet</code> object or there are no more results, -1
     *  is returned. This method should be called only once per result.
     * <p>
     * This method should be used when the returned row count may exceed
     * {@link Integer#MAX_VALUE}.
     *<p>
     * The default implementation will throw {@code UnsupportedOperationException}
     *
     * @return the current result as an update count; -1 if the current result
     * is a <code>ResultSet</code> object or there are no more results
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @see #execute
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    public boolean isCloseOnCompletion() throws SQLException;

    /**
     * Returns a value indicating whether this {@code Statement} will be
     * closed when all its dependent result sets are closed.
     * @return {@code true} if the {@code Statement} will be closed when all
     * of its dependent result sets are closed; {@code false} otherwise
     * @throws SQLException if this method is called on a closed
     * {@code Statement}
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    public void closeOnCompletion() throws SQLException;

    /**
     * Specifies that this {@code Statement} will be closed when all its
     * dependent result sets are closed. If execution of the {@code Statement}
     * does not produce any result sets, this method has no effect.
     * <p>
     * <strong>Note:</strong> Multiple calls to {@code closeOnCompletion} do
     * not toggle the effect on this {@code Statement}. However, a call to
     * {@code closeOnCompletion} does effect both the subsequent execution of
     * statements, and statements that currently have open, dependent,
     * result sets.
     *
     * @throws SQLException if this method is called on a closed
     * {@code Statement}
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
        boolean isPoolable()

        /**
         * Returns a  value indicating whether the <code>Statement</code>
         * is poolable or not.
         * <p>
         * @return              <code>true</code> if the <code>Statement</code>
         * is poolable; <code>false</code> otherwise
         * <p>
         * @throws SQLException if this method is called on a closed
         * <code>Statement</code>
         * <p>
         * @since 1.6
         * <p>
         * @see java.sql.Statement#setPoolable(boolean) setPoolable(boolean)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
        void setPoolable(boolean poolable)

        /**
         * Requests that a <code>Statement</code> be pooled or not pooled.  The value
         * specified is a hint to the statement pool implementation indicating
         * whether the application wants the statement to be pooled.  It is up to
         * the statement pool manager as to whether the hint is used.
         * <p>
         * The poolable value of a statement is applicable to both internal
         * statement caches implemented by the driver and external statement caches
         * implemented by application servers and other applications.
         * <p>
         * By default, a <code>Statement</code> is not poolable when created, and
         * a <code>PreparedStatement</code> and <code>CallableStatement</code>
         * are poolable when created.
         * <p>
         * @param poolable              requests that the statement be pooled if true and
         *                                              that the statement not be pooled if false
         * <p>
         * @throws SQLException if this method is called on a closed
         * <code>Statement</code>
         * <p>
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    boolean isClosed() throws SQLException;

    /**
     * Retrieves whether this <code>Statement</code> object has been closed. A <code>Statement</code> is closed if the
     * method close has been called on it, or if it is automatically closed.
     * @return true if this <code>Statement</code> object is closed; false if it is still open
     * @throws SQLException if a database access error occurs
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int getResultSetHoldability() throws SQLException;

   /**
     * Retrieves the result set holdability for <code>ResultSet</code> objects
     * generated by this <code>Statement</code> object.
     *
     * @return either <code>ResultSet.HOLD_CURSORS_OVER_COMMIT</code> or
     *         <code>ResultSet.CLOSE_CURSORS_AT_COMMIT</code>
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    boolean execute(String sql, String columnNames[]) throws SQLException;

    /**
     * Executes the given SQL statement, which may return multiple results,
     * and signals the driver that the
     * auto-generated keys indicated in the given array should be made available
     * for retrieval. This array contains the names of the columns in the
     * target table that contain the auto-generated keys that should be made
     * available.  The driver will ignore the array if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     * <P>
     * In some (uncommon) situations, a single SQL statement may return
     * multiple result sets and/or update counts.  Normally you can ignore
     * this unless you are (1) executing a stored procedure that you know may
     * return multiple results or (2) you are dynamically executing an
     * unknown SQL string.
     * <P>
     * The <code>execute</code> method executes an SQL statement and indicates the
     * form of the first result.  You must then use the methods
     * <code>getResultSet</code> or <code>getUpdateCount</code>
     * to retrieve the result, and <code>getMoreResults</code> to
     * move to any subsequent result(s).
     *<p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql any SQL statement
     * @param columnNames an array of the names of the columns in the inserted
     *        row that should be made available for retrieval by a call to the
     *        method <code>getGeneratedKeys</code>
     * @return <code>true</code> if the next result is a <code>ResultSet</code>
     *         object; <code>false</code> if it is an update count or there
     *         are no more results
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>,the
     *          elements of the <code>String</code> array passed to this
     *          method are not valid column names, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this method
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @see #getResultSet
     * @see #getUpdateCount
     * @see #getMoreResults
     * @see #getGeneratedKeys
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    boolean execute(String sql, int columnIndexes[]) throws SQLException;

    /**
     * Executes the given SQL statement, which may return multiple results,
     * and signals the driver that the
     * auto-generated keys indicated in the given array should be made available
     * for retrieval.  This array contains the indexes of the columns in the
     * target table that contain the auto-generated keys that should be made
     * available.  The driver will ignore the array if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     * <P>
     * Under some (uncommon) situations, a single SQL statement may return
     * multiple result sets and/or update counts.  Normally you can ignore
     * this unless you are (1) executing a stored procedure that you know may
     * return multiple results or (2) you are dynamically executing an
     * unknown SQL string.
     * <P>
     * The <code>execute</code> method executes an SQL statement and indicates the
     * form of the first result.  You must then use the methods
     * <code>getResultSet</code> or <code>getUpdateCount</code>
     * to retrieve the result, and <code>getMoreResults</code> to
     * move to any subsequent result(s).
     *<p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql any SQL statement
     * @param columnIndexes an array of the indexes of the columns in the
     *        inserted row that should be  made available for retrieval by a
     *        call to the method <code>getGeneratedKeys</code>
     * @return <code>true</code> if the first result is a <code>ResultSet</code>
     *         object; <code>false</code> if it is an update count or there
     *         are no results
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>, the
     *            elements in the <code>int</code> array passed to this method
     *            are not valid column indexes, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this method
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @see #getResultSet
     * @see #getUpdateCount
     * @see #getMoreResults
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    boolean execute(String sql, int autoGeneratedKeys) throws SQLException;

    /**
     * Executes the given SQL statement, which may return multiple results,
     * and signals the driver that any
     * auto-generated keys should be made available
     * for retrieval.  The driver will ignore this signal if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     * <P>
     * In some (uncommon) situations, a single SQL statement may return
     * multiple result sets and/or update counts.  Normally you can ignore
     * this unless you are (1) executing a stored procedure that you know may
     * return multiple results or (2) you are dynamically executing an
     * unknown SQL string.
     * <P>
     * The <code>execute</code> method executes an SQL statement and indicates the
     * form of the first result.  You must then use the methods
     * <code>getResultSet</code> or <code>getUpdateCount</code>
     * to retrieve the result, and <code>getMoreResults</code> to
     * move to any subsequent result(s).
     *<p>
     *<strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql any SQL statement
     * @param autoGeneratedKeys a constant indicating whether auto-generated
     *        keys should be made available for retrieval using the method
     *        <code>getGeneratedKeys</code>; one of the following constants:
     *        <code>Statement.RETURN_GENERATED_KEYS</code> or
     *        <code>Statement.NO_GENERATED_KEYS</code>
     * @return <code>true</code> if the first result is a <code>ResultSet</code>
     *         object; <code>false</code> if it is an update count or there are
     *         no results
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>, the second
     *         parameter supplied to this method is not
     *         <code>Statement.RETURN_GENERATED_KEYS</code> or
     *         <code>Statement.NO_GENERATED_KEYS</code>,
     * the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method with a constant of Statement.RETURN_GENERATED_KEYS
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @see #getResultSet
     * @see #getUpdateCount
     * @see #getMoreResults
     * @see #getGeneratedKeys
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int executeUpdate(String sql, String columnNames[]) throws SQLException;

    /**
     * Executes the given SQL statement and signals the driver that the
     * auto-generated keys indicated in the given array should be made available
     * for retrieval.   This array contains the names of the columns in the
     * target table that contain the auto-generated keys that should be made
     * available. The driver will ignore the array if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     *<p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql an SQL Data Manipulation Language (DML) statement, such as <code>INSERT</code>, <code>UPDATE</code> or
     * <code>DELETE</code>; or an SQL statement that returns nothing,
     * such as a DDL statement.
     * @param columnNames an array of the names of the columns that should be
     *        returned from the inserted row
     * @return either the row count for <code>INSERT</code>, <code>UPDATE</code>,
     *         or <code>DELETE</code> statements, or 0 for SQL statements
     *         that return nothing
     * @exception SQLException if a database access error occurs,
     *  this method is called on a closed <code>Statement</code>, the SQL
     *            statement returns a <code>ResultSet</code> object, the
     *            second argument supplied to this method is not a <code>String</code> array
     *            whose elements are valid column names, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this method
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int executeUpdate(String sql, int columnIndexes[]) throws SQLException;

    /**
     * Executes the given SQL statement and signals the driver that the
     * auto-generated keys indicated in the given array should be made available
     * for retrieval.   This array contains the indexes of the columns in the
     * target table that contain the auto-generated keys that should be made
     * available. The driver will ignore the array if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     *<p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql an SQL Data Manipulation Language (DML) statement, such as <code>INSERT</code>, <code>UPDATE</code> or
     * <code>DELETE</code>; or an SQL statement that returns nothing,
     * such as a DDL statement.
     *
     * @param columnIndexes an array of column indexes indicating the columns
     *        that should be returned from the inserted row
     * @return either (1) the row count for SQL Data Manipulation Language (DML) statements
     *         or (2) 0 for SQL statements that return nothing
     *
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>, the SQL
     * statement returns a <code>ResultSet</code> object,the second argument
     * supplied to this method is not an
     * <code>int</code> array whose elements are valid column indexes, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this method
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException;

    /**
     * Executes the given SQL statement and signals the driver with the
     * given flag about whether the
     * auto-generated keys produced by this <code>Statement</code> object
     * should be made available for retrieval.  The driver will ignore the
     * flag if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     *<p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql an SQL Data Manipulation Language (DML) statement, such as <code>INSERT</code>, <code>UPDATE</code> or
     * <code>DELETE</code>; or an SQL statement that returns nothing,
     * such as a DDL statement.
     *
     * @param autoGeneratedKeys a flag indicating whether auto-generated keys
     *        should be made available for retrieval;
     *         one of the following constants:
     *         <code>Statement.RETURN_GENERATED_KEYS</code>
     *         <code>Statement.NO_GENERATED_KEYS</code>
     * @return either (1) the row count for SQL Data Manipulation Language (DML) statements
     *         or (2) 0 for SQL statements that return nothing
     *
     * @exception SQLException if a database access error occurs,
     *  this method is called on a closed <code>Statement</code>, the given
     *            SQL statement returns a <code>ResultSet</code> object,
     *            the given constant is not one of those allowed, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method with a constant of Statement.RETURN_GENERATED_KEYS
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    ResultSet getGeneratedKeys() throws SQLException;

    /**
     * Retrieves any auto-generated keys created as a result of executing this
     * <code>Statement</code> object. If this <code>Statement</code> object did
     * not generate any keys, an empty <code>ResultSet</code>
     * object is returned.
     *
     *<p><B>Note:</B>If the columns which represent the auto-generated keys were not specified,
     * the JDBC driver implementation will determine the columns which best represent the auto-generated keys.
     *
     * @return a <code>ResultSet</code> object containing the auto-generated key(s)
     *         generated by the execution of this <code>Statement</code> object
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this method
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    boolean getMoreResults(int current) throws SQLException;

    /**
     * Moves to this <code>Statement</code> object's next result, deals with
     * any current <code>ResultSet</code> object(s) according  to the instructions
     * specified by the given flag, and returns
     * <code>true</code> if the next result is a <code>ResultSet</code> object.
     *
     * <P>There are no more results when the following is true:
     * <PRE>{@code
     *     // stmt is a Statement object
     *     ((stmt.getMoreResults(current) == false) && (stmt.getUpdateCount() == -1))
     * }</PRE>
     *
     * @param current one of the following <code>Statement</code>
     *        constants indicating what should happen to current
     *        <code>ResultSet</code> objects obtained using the method
     *        <code>getResultSet</code>:
     *        <code>Statement.CLOSE_CURRENT_RESULT</code>,
     *        <code>Statement.KEEP_CURRENT_RESULT</code>, or
     *        <code>Statement.CLOSE_ALL_RESULTS</code>
     * @return <code>true</code> if the next result is a <code>ResultSet</code>
     *         object; <code>false</code> if it is an update count or there are no
     *         more results
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code> or the argument
         *         supplied is not one of the following:
     *        <code>Statement.CLOSE_CURRENT_RESULT</code>,
     *        <code>Statement.KEEP_CURRENT_RESULT</code> or
     *        <code>Statement.CLOSE_ALL_RESULTS</code>
     *@exception SQLFeatureNotSupportedException if
     * <code>DatabaseMetaData.supportsMultipleOpenResults</code> returns
     * <code>false</code> and either
     *        <code>Statement.KEEP_CURRENT_RESULT</code> or
     *        <code>Statement.CLOSE_ALL_RESULTS</code> are supplied as
     * the argument.
     * @since 1.4
     * @see #execute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int NO_GENERATED_KEYS = 2;

    /**
     * The constant indicating that generated keys should not be made
     * available for retrieval.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int RETURN_GENERATED_KEYS = 1;

    /**
     * The constant indicating that generated keys should be made
     * available for retrieval.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int EXECUTE_FAILED = -3;

    /**
     * The constant indicating that an error occurred while executing a
     * batch statement.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int SUCCESS_NO_INFO = -2;

    /**
     * The constant indicating that a batch statement executed successfully
     * but that no count of the number of rows it affected is available.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int CLOSE_ALL_RESULTS = 3;

    /**
     * The constant indicating that all <code>ResultSet</code> objects that
     * have previously been kept open should be closed when calling
     * <code>getMoreResults</code>.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int KEEP_CURRENT_RESULT = 2;

    /**
     * The constant indicating that the current <code>ResultSet</code> object
     * should not be closed when calling <code>getMoreResults</code>.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int CLOSE_CURRENT_RESULT = 1;

    /**
     * The constant indicating that the current <code>ResultSet</code> object
     * should be closed when calling <code>getMoreResults</code>.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    Connection getConnection()  throws SQLException;

    /**
     * Retrieves the <code>Connection</code> object
     * that produced this <code>Statement</code> object.
     * @return the connection that produced this statement
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int[] executeBatch() throws SQLException;

    /**
     * Submits a batch of commands to the database for execution and
     * if all commands execute successfully, returns an array of update counts.
     * The <code>int</code> elements of the array that is returned are ordered
     * to correspond to the commands in the batch, which are ordered
     * according to the order in which they were added to the batch.
     * The elements in the array returned by the method <code>executeBatch</code>
     * may be one of the following:
     * <OL>
     * <LI>A number greater than or equal to zero -- indicates that the
     * command was processed successfully and is an update count giving the
     * number of rows in the database that were affected by the command's
     * execution
     * <LI>A value of <code>SUCCESS_NO_INFO</code> -- indicates that the command was
     * processed successfully but that the number of rows affected is
     * unknown
     * <P>
     * If one of the commands in a batch update fails to execute properly,
     * this method throws a <code>BatchUpdateException</code>, and a JDBC
     * driver may or may not continue to process the remaining commands in
     * the batch.  However, the driver's behavior must be consistent with a
     * particular DBMS, either always continuing to process commands or never
     * continuing to process commands.  If the driver continues processing
     * after a failure, the array returned by the method
     * <code>BatchUpdateException.getUpdateCounts</code>
     * will contain as many elements as there are commands in the batch, and
     * at least one of the elements will be the following:
     *
     * <LI>A value of <code>EXECUTE_FAILED</code> -- indicates that the command failed
     * to execute successfully and occurs only if a driver continues to
     * process commands after a command fails
     * </OL>
     * <P>
     * The possible implementations and return values have been modified in
     * the Java 2 SDK, Standard Edition, version 1.3 to
     * accommodate the option of continuing to process commands in a batch
     * update after a <code>BatchUpdateException</code> object has been thrown.
     *
     * @return an array of update counts containing one element for each
     * command in the batch.  The elements of the array are ordered according
     * to the order in which commands were added to the batch.
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code> or the
     * driver does not support batch statements. Throws {@link BatchUpdateException}
     * (a subclass of <code>SQLException</code>) if one of the commands sent to the
     * database fails to execute properly or attempts to return a result set.
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     *
     * @see #addBatch
     * @see DatabaseMetaData#supportsBatchUpdates
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void clearBatch() throws SQLException;

    /**
     * Empties this <code>Statement</code> object's current list of
     * SQL commands.
     * <P>
     * @exception SQLException if a database access error occurs,
     *  this method is called on a closed <code>Statement</code> or the
     * driver does not support batch updates
     * @see #addBatch
     * @see DatabaseMetaData#supportsBatchUpdates
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void addBatch( String sql ) throws SQLException;

    /**
     * Adds the given SQL command to the current list of commands for this
     * <code>Statement</code> object. The commands in this list can be
     * executed as a batch by calling the method <code>executeBatch</code>.
     * <P>
     *<strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql typically this is a SQL <code>INSERT</code> or
     * <code>UPDATE</code> statement
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>, the
     * driver does not support batch updates, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @see #executeBatch
     * @see DatabaseMetaData#supportsBatchUpdates
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int getResultSetType()  throws SQLException;

    /**
     * Retrieves the result set type for <code>ResultSet</code> objects
     * generated by this <code>Statement</code> object.
     *
     * @return one of <code>ResultSet.TYPE_FORWARD_ONLY</code>,
     * <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
     * <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int getResultSetConcurrency() throws SQLException;

    /**
     * Retrieves the result set concurrency for <code>ResultSet</code> objects
     * generated by this <code>Statement</code> object.
     *
     * @return either <code>ResultSet.CONCUR_READ_ONLY</code> or
     * <code>ResultSet.CONCUR_UPDATABLE</code>
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int getFetchSize() throws SQLException;

    /**
     * Retrieves the number of result set rows that is the default
     * fetch size for <code>ResultSet</code> objects
     * generated from this <code>Statement</code> object.
     * If this <code>Statement</code> object has not set
     * a fetch size by calling the method <code>setFetchSize</code>,
     * the return value is implementation-specific.
     *
     * @return the default fetch size for result sets generated
     *          from this <code>Statement</code> object
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @since 1.2
     * @see #setFetchSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void setFetchSize(int rows) throws SQLException;

    /**
     * Gives the JDBC driver a hint as to the number of rows that should
     * be fetched from the database when more rows are needed for
     * <code>ResultSet</code> objects generated by this <code>Statement</code>.
     * If the value specified is zero, then the hint is ignored.
     * The default value is zero.
     *
     * @param rows the number of rows to fetch
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code> or the
     *        condition {@code rows >= 0} is not satisfied.
     * @since 1.2
     * @see #getFetchSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int getFetchDirection() throws SQLException;

    /**
     * Retrieves the direction for fetching rows from
     * database tables that is the default for result sets
     * generated from this <code>Statement</code> object.
     * If this <code>Statement</code> object has not set
     * a fetch direction by calling the method <code>setFetchDirection</code>,
     * the return value is implementation-specific.
     *
     * @return the default fetch direction for result sets generated
     *          from this <code>Statement</code> object
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @since 1.2
     * @see #setFetchDirection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void setFetchDirection(int direction) throws SQLException;

    /**
     * Gives the driver a hint as to the direction in which
     * rows will be processed in <code>ResultSet</code>
     * objects created using this <code>Statement</code> object.  The
     * default value is <code>ResultSet.FETCH_FORWARD</code>.
     * <P>
     * Note that this method sets the default fetch direction for
     * result sets generated by this <code>Statement</code> object.
     * Each result set has its own methods for getting and setting
     * its own fetch direction.
     *
     * @param direction the initial direction for processing rows
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>
     * or the given direction
     * is not one of <code>ResultSet.FETCH_FORWARD</code>,
     * <code>ResultSet.FETCH_REVERSE</code>, or <code>ResultSet.FETCH_UNKNOWN</code>
     * @since 1.2
     * @see #getFetchDirection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    boolean getMoreResults() throws SQLException;

    /**
     * Moves to this <code>Statement</code> object's next result, returns
     * <code>true</code> if it is a <code>ResultSet</code> object, and
     * implicitly closes any current <code>ResultSet</code>
     * object(s) obtained with the method <code>getResultSet</code>.
     *
     * <P>There are no more results when the following is true:
     * <PRE>{@code
     *     // stmt is a Statement object
     *     ((stmt.getMoreResults() == false) && (stmt.getUpdateCount() == -1))
     * }</PRE>
     *
     * @return <code>true</code> if the next result is a <code>ResultSet</code>
     *         object; <code>false</code> if it is an update count or there are
     *         no more results
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @see #execute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int getUpdateCount() throws SQLException;

    /**
     *  Retrieves the current result as an update count;
     *  if the result is a <code>ResultSet</code> object or there are no more results, -1
     *  is returned. This method should be called only once per result.
     *
     * @return the current result as an update count; -1 if the current result is a
     * <code>ResultSet</code> object or there are no more results
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @see #execute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    ResultSet getResultSet() throws SQLException;

    /**
     *  Retrieves the current result as a <code>ResultSet</code> object.
     *  This method should be called only once per result.
     *
     * @return the current result as a <code>ResultSet</code> object or
     * <code>null</code> if the result is an update count or there are no more results
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @see #execute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    boolean execute(String sql) throws SQLException;

    /**
     * Executes the given SQL statement, which may return multiple results.
     * In some (uncommon) situations, a single SQL statement may return
     * multiple result sets and/or update counts.  Normally you can ignore
     * this unless you are (1) executing a stored procedure that you know may
     * return multiple results or (2) you are dynamically executing an
     * unknown SQL string.
     * <P>
     * The <code>execute</code> method executes an SQL statement and indicates the
     * form of the first result.  You must then use the methods
     * <code>getResultSet</code> or <code>getUpdateCount</code>
     * to retrieve the result, and <code>getMoreResults</code> to
     * move to any subsequent result(s).
     * <p>
     *<strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql any SQL statement
     * @return <code>true</code> if the first result is a <code>ResultSet</code>
     *         object; <code>false</code> if it is an update count or there are
     *         no results
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>,
     * the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     * @see #getResultSet
     * @see #getUpdateCount
     * @see #getMoreResults
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void setCursorName(String name) throws SQLException;

    /**
     * Sets the SQL cursor name to the given <code>String</code>, which
     * will be used by subsequent <code>Statement</code> object
     * <code>execute</code> methods. This name can then be
     * used in SQL positioned update or delete statements to identify the
     * current row in the <code>ResultSet</code> object generated by this
     * statement.  If the database does not support positioned update/delete,
     * this method is a noop.  To insure that a cursor has the proper isolation
     * level to support updates, the cursor's <code>SELECT</code> statement
     * should have the form <code>SELECT FOR UPDATE</code>.  If
     * <code>FOR UPDATE</code> is not present, positioned updates may fail.
     *
     * <P><B>Note:</B> By definition, the execution of positioned updates and
     * deletes must be done by a different <code>Statement</code> object than
     * the one that generated the <code>ResultSet</code> object being used for
     * positioning. Also, cursor names must be unique within a connection.
     *
     * @param name the new cursor name, which must be unique within
     *             a connection
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void clearWarnings() throws SQLException;

    /**
     * Clears all the warnings reported on this <code>Statement</code>
     * object. After a call to this method,
     * the method <code>getWarnings</code> will return
     * <code>null</code> until a new warning is reported for this
     * <code>Statement</code> object.
     *
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    SQLWarning getWarnings() throws SQLException;

    /**
     * Retrieves the first warning reported by calls on this <code>Statement</code> object.
     * Subsequent <code>Statement</code> object warnings will be chained to this
     * <code>SQLWarning</code> object.
     *
     * <p>The warning chain is automatically cleared each time
     * a statement is (re)executed. This method may not be called on a closed
     * <code>Statement</code> object; doing so will cause an <code>SQLException</code>
     * to be thrown.
     *
     * <P><B>Note:</B> If you are processing a <code>ResultSet</code> object, any
     * warnings associated with reads on that <code>ResultSet</code> object
     * will be chained on it rather than on the <code>Statement</code>
     * object that produced it.
     *
     * @return the first <code>SQLWarning</code> object or <code>null</code>
     *         if there are no warnings
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void cancel() throws SQLException;

    /**
     * Cancels this <code>Statement</code> object if both the DBMS and
     * driver support aborting an SQL statement.
     * This method can be used by one thread to cancel a statement that
     * is being executed by another thread.
     *
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void setQueryTimeout(int seconds) throws SQLException;

    /**
     * Sets the number of seconds the driver will wait for a
     * <code>Statement</code> object to execute to the given number of seconds.
     *By default there is no limit on the amount of time allowed for a running
     * statement to complete. If the limit is exceeded, an
     * <code>SQLTimeoutException</code> is thrown.
     * A JDBC driver must apply this limit to the <code>execute</code>,
     * <code>executeQuery</code> and <code>executeUpdate</code> methods.
     * <p>
     * <strong>Note:</strong> JDBC driver implementations may also apply this
     * limit to {@code ResultSet} methods
     * (consult your driver vendor documentation for details).
     * <p>
     * <strong>Note:</strong> In the case of {@code Statement} batching, it is
     * implementation defined as to whether the time-out is applied to
     * individual SQL commands added via the {@code addBatch} method or to
     * the entire batch of SQL commands invoked by the {@code executeBatch}
     * method (consult your driver vendor documentation for details).
     *
     * @param seconds the new query timeout limit in seconds; zero means
     *        there is no limit
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>
     *            or the condition {@code seconds >= 0} is not satisfied
     * @see #getQueryTimeout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int getQueryTimeout() throws SQLException;

    /**
     * Retrieves the number of seconds the driver will
     * wait for a <code>Statement</code> object to execute.
     * If the limit is exceeded, a
     * <code>SQLException</code> is thrown.
     *
     * @return the current query timeout limit in seconds; zero means there is
     *         no limit
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @see #setQueryTimeout
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void setEscapeProcessing(boolean enable) throws SQLException;

    /**
     * Sets escape processing on or off.
     * If escape scanning is on (the default), the driver will do
     * escape substitution before sending the SQL statement to the database.
     *<p>
     * The {@code Connection} and {@code DataSource} property
     * {@code escapeProcessing} may be used to change the default escape processing
     * behavior.  A value of true (the default) enables escape Processing for
     * all {@code Statement} objects. A value of false disables escape processing
     * for all {@code Statement} objects.  The {@code setEscapeProcessing}
     * method may be used to specify the escape processing behavior for an
     * individual {@code Statement} object.
     * <p>
     * Note: Since prepared statements have usually been parsed prior
     * to making this call, disabling escape processing for
     * <code>PreparedStatements</code> objects will have no effect.
     *
     * @param enable <code>true</code> to enable escape processing;
     *       <code>false</code> to disable it
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void setMaxRows(int max) throws SQLException;

    /**
     * Sets the limit for the maximum number of rows that any
     * <code>ResultSet</code> object  generated by this <code>Statement</code>
     * object can contain to the given number.
     * If the limit is exceeded, the excess
     * rows are silently dropped.
     *
     * @param max the new max rows limit; zero means there is no limit
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>
     *            or the condition {@code max >= 0} is not satisfied
     * @see #getMaxRows
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int getMaxRows() throws SQLException;

    /**
     * Retrieves the maximum number of rows that a
     * <code>ResultSet</code> object produced by this
     * <code>Statement</code> object can contain.  If this limit is exceeded,
     * the excess rows are silently dropped.
     *
     * @return the current maximum number of rows for a <code>ResultSet</code>
     *         object produced by this <code>Statement</code> object;
     *         zero means there is no limit
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @see #setMaxRows
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void setMaxFieldSize(int max) throws SQLException;

    /**
     * Sets the limit for the maximum number of bytes that can be returned for
     * character and binary column values in a <code>ResultSet</code>
     * object produced by this <code>Statement</code> object.
     *
     * This limit applies
     * only to <code>BINARY</code>, <code>VARBINARY</code>,
     * <code>LONGVARBINARY</code>, <code>CHAR</code>, <code>VARCHAR</code>,
     * <code>NCHAR</code>, <code>NVARCHAR</code>, <code>LONGNVARCHAR</code> and
     * <code>LONGVARCHAR</code> fields.  If the limit is exceeded, the excess data
     * is silently discarded. For maximum portability, use values
     * greater than 256.
     *
     * @param max the new column size limit in bytes; zero means there is no limit
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>
     *            or the condition {@code max >= 0} is not satisfied
     * @see #getMaxFieldSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int getMaxFieldSize() throws SQLException;

    /**
     * Retrieves the maximum number of bytes that can be
     * returned for character and binary column values in a <code>ResultSet</code>
     * object produced by this <code>Statement</code> object.
     * This limit applies only to  <code>BINARY</code>, <code>VARBINARY</code>,
     * <code>LONGVARBINARY</code>, <code>CHAR</code>, <code>VARCHAR</code>,
     * <code>NCHAR</code>, <code>NVARCHAR</code>, <code>LONGNVARCHAR</code>
     * and <code>LONGVARCHAR</code> columns.  If the limit is exceeded, the
     * excess data is silently discarded.
     *
     * @return the current column size limit for columns storing character and
     *         binary values; zero means there is no limit
     * @exception SQLException if a database access error occurs or
     * this method is called on a closed <code>Statement</code>
     * @see #setMaxFieldSize
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    void close() throws SQLException;

    /**
     * Releases this <code>Statement</code> object's database
     * and JDBC resources immediately instead of waiting for
     * this to happen when it is automatically closed.
     * It is generally good practice to release resources as soon as
     * you are finished with them to avoid tying up database
     * resources.
     * <P>
     * Calling the method <code>close</code> on a <code>Statement</code>
     * object that is already closed has no effect.
     * <P>
     * <B>Note:</B>When a <code>Statement</code> object is
     * closed, its current <code>ResultSet</code> object, if one exists, is
     * also closed.
     *
     * @exception SQLException if a database access error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    int executeUpdate(String sql) throws SQLException;

    /**
     * Executes the given SQL statement, which may be an <code>INSERT</code>,
     * <code>UPDATE</code>, or <code>DELETE</code> statement or an
     * SQL statement that returns nothing, such as an SQL DDL statement.
     *<p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql an SQL Data Manipulation Language (DML) statement, such as <code>INSERT</code>, <code>UPDATE</code> or
     * <code>DELETE</code>; or an SQL statement that returns nothing,
     * such as a DDL statement.
     *
     * @return either (1) the row count for SQL Data Manipulation Language (DML) statements
     *         or (2) 0 for SQL statements that return nothing
     *
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>, the given
     * SQL statement produces a <code>ResultSet</code> object, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
    ResultSet executeQuery(String sql) throws SQLException;

    /**
     * Executes the given SQL statement, which returns a single
     * <code>ResultSet</code> object.
     *<p>
     * <strong>Note:</strong>This method cannot be called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>.
     * @param sql an SQL statement to be sent to the database, typically a
     *        static SQL <code>SELECT</code> statement
     * @return a <code>ResultSet</code> object that contains the data produced
     *         by the given query; never <code>null</code>
     * @exception SQLException if a database access error occurs,
     * this method is called on a closed <code>Statement</code>, the given
     *            SQL statement produces anything other than a single
     *            <code>ResultSet</code> object, the method is called on a
     * <code>PreparedStatement</code> or <code>CallableStatement</code>
     * @throws SQLTimeoutException when the driver has determined that the
     * timeout value that was specified by the {@code setQueryTimeout}
     * method has been exceeded and has at least attempted to cancel
     * the currently running {@code Statement}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Statement.java
public interface Statement extends Wrapper, AutoCloseable {

/**
 * <P>The object used for executing a static SQL statement
 * and returning the results it produces.
 * <P>
 * By default, only one <code>ResultSet</code> object per <code>Statement</code>
 * object can be open at the same time. Therefore, if the reading of one
 * <code>ResultSet</code> object is interleaved
 * with the reading of another, each must have been generated by
 * different <code>Statement</code> objects. All execution methods in the
 * <code>Statement</code> interface implicitly close a current
 * <code>ResultSet</code> object of the statement if an open one exists.
 *
 * @see Connection#createStatement
 * @see ResultSet
 */
