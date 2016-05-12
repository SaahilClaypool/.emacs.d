_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/XADataSource.java
  XAConnection getXAConnection(String user, String password)

  /**
   * Attempts to establish a physical database connection, using the given
   * user name and password. The connection that is returned is one that
   * can be used in a distributed transaction.
   *
   * @param user the database user on whose behalf the connection is being made
   * @param password the user's password
   * @return  an {@code XAConnection} object, which represents a
   *          physical connection to a data source, that can be used in
   *          a distributed transaction
   * @exception SQLException if a database access error occurs
   * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
   * this method
   * @throws SQLTimeoutException when the driver has determined that the
   * timeout value specified by the {@code setLoginTimeout} method
   * has been exceeded and has at least tried to cancel the
   * current database connection attempt
   * @since 1.4
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/XADataSource.java
  XAConnection getXAConnection() throws SQLException;

  /**
   * Attempts to establish a physical database connection that can be
   * used in a distributed transaction.
   *
   * @return  an {@code XAConnection} object, which represents a
   *          physical connection to a data source, that can be used in
   *          a distributed transaction
   * @exception SQLException if a database access error occurs
   * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
   * this method
   * @throws SQLTimeoutException when the driver has determined that the
   * timeout value specified by the {@code setLoginTimeout} method
   * has been exceeded and has at least tried to cancel the
   * current database connection attempt
   * @since 1.4
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/XADataSource.java
public interface XADataSource extends CommonDataSource {

/**
 * A factory for {@code XAConnection} objects that is used internally.
 * An object that implements the {@code XADataSource} interface is
 * typically registered with a naming service that uses the
 * Java Naming and Directory Interface&trade;
 * (JNDI).
 *  <p>
 * An implementation of {@code XADataSource} must include a public no-arg
 * constructor.
 * @since 1.4
 */
