_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/ConnectionPoolDataSource.java
  PooledConnection getPooledConnection(String user, String password)

  /**
   * Attempts to establish a physical database connection that can
   * be used as a pooled connection.
   *
   * @param user the database user on whose behalf the connection is being made
   * @param password the user's password
   * @return  a <code>PooledConnection</code> object that is a physical
   *         connection to the database that this
   *         <code>ConnectionPoolDataSource</code> object represents
   * @exception SQLException if a database access error occurs
   * @exception java.sql.SQLFeatureNotSupportedException if the JDBC driver does not support
   * this method
   * @since 1.4
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/ConnectionPoolDataSource.java
  PooledConnection getPooledConnection() throws SQLException;

  /**
   * Attempts to establish a physical database connection that can
   * be used as a pooled connection.
   *
   * @return  a <code>PooledConnection</code> object that is a physical
   *         connection to the database that this
   *         <code>ConnectionPoolDataSource</code> object represents
   * @exception SQLException if a database access error occurs
   * @exception java.sql.SQLFeatureNotSupportedException if the JDBC driver does not support
   * this method
   * @since 1.4
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/ConnectionPoolDataSource.java
public interface ConnectionPoolDataSource  extends CommonDataSource {

/**
 * A factory for <code>PooledConnection</code>
 * objects.  An object that implements this interface will typically be
 * registered with a naming service that is based on the
 * Java&trade; Naming and Directory Interface
 * (JNDI).
 *
 * @since 1.4
 */
