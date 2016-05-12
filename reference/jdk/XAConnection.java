_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/XAConnection.java
  javax.transaction.xa.XAResource getXAResource() throws SQLException;

  /**
   * Retrieves an <code>XAResource</code> object that
   * the transaction manager will use
   * to manage this <code>XAConnection</code> object's participation in a
   * distributed transaction.
   *
   * @return the <code>XAResource</code> object
   * @exception SQLException if a database access error occurs
   * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
   * this method
   * @since 1.4
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/XAConnection.java
public interface XAConnection extends PooledConnection {

/**
 * An object that provides support for distributed
 * transactions.  An <code>XAConnection</code> object  may be enlisted
 * in a distributed transaction by means of an <code>XAResource</code> object.
 * A transaction manager, usually part of a middle tier server, manages an
 * <code>XAConnection</code> object through the <code>XAResource</code> object.
 * <P>
 * An application programmer does not use this interface directly; rather,
 * it is used by a transaction manager working in the middle tier server.
 *
 * @since 1.4
 */
