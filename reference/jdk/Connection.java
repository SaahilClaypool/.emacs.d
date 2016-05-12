_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void unregisterWaiter(MessageMediator messageMediator);

    /**
     * Unregister an invocation's
     * {@link com.sun.corba.se.pept.protocol.MessageMediator MessageMediator}
     * with the <code>Connection</code>.
     *
     * @param messageMediator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public InputObject waitForResponse(MessageMediator messageMediator);

    /**
     * If a message expect's a response then this method is called.
     *
     * This method might block on a read (e.g., HTTP), put the calling
     * thread to sleep while another thread read's the response (e.g., GIOP),
     * or it may use the calling thread to perform the server-side work
     * (e.g., Solaris Doors).
     *
     * @param messageMediator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void registerWaiter(MessageMediator messageMediator);

    /**
     * Register an invocation's
     * {@link com.sun.corba.se.pept.protocol.MessageMediator MessageMediator}
     * with the <code>Connection</code>.
     *
     * This is useful in protocols which support fragmentation.
     *
     * @param messageMediator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void writeUnlock();

    /**
     * Release a write lock on the <code>Connection</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void writeLock();

    /**
     * Grab a write lock on the <code>Connection</code>.
     *
     * If another thread already has a write lock then the calling
     * thread will block until the lock is released.  The calling
     * thread must call
     * {@link #writeUnlock}
     * when it is done.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void setState(String state);

    /**
     * The "state" of the <code>Connection</code>.
     *
     * param state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void setTimeStamp(long time);

    /**
     * Timestamps are used for connection management, in particular, for
     * reclaiming idle <code>Connection</code>s.
     *
     * @param time - the "time" the <code>Connection</code> was last used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public long getTimeStamp();

    /**
     * Timestamps are used for connection management, in particular, for
     * reclaiming idle <code>Connection</code>s.
     *
     * @return the "time" the <code>Connection</code> was last used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean isBusy();

    /**
     * Indicates if the <code>Connection</code> is in the process of
     * sending or receiving a message.
     *
     * @return <code>true</code> if the <code>Connection</code> is busy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean isServer();

    /**
     * Indicates whether a
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * or a
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     * created the
     * <code>Connection</code>.
     *
     * @return <code>true</code> if <code>Connection</code> an
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     * created the <code>Connection</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public EventHandler getEventHandler();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.EventHandler EventHandler}
     * associated with this <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.EventHandler EventHandler}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public ContactInfo getContactInfo();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * that created this <code>Connection</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public Acceptor getAcceptor();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     * that created this <code>Connection</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void close();

    /**
     * Close the <code>Connection</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean read();

    /**
     * Called to read incoming messages.
     *
     * @return <code>true</code> if the thread calling read can be released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean shouldRegisterServerReadEvent(); // REVISIT - why special?

    /**
     * Used to determine if the <code>Connection</code> should register
     * with the
     * {@link com.sun.corba.se.pept.transport.TransportManager
     * TransportManager}
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     * to handle read events.
     *
     * For example, an HTTP transport would not register since the requesting
     * thread would just block on read when waiting for the reply.
     *
     * @return <code>true</code> if it should be registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean shouldRegisterReadEvent();

    /**
     * Used to determine if the <code>Connection</code> should register
     * with the
     * {@link com.sun.corba.se.pept.transport.TransportManager
     * TransportManager}
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     * to handle read events.
     *
     * For example, an HTTP transport would not register since the requesting
     * thread would just block on read when waiting for the reply.
     *
     * @return <code>true</code> if it should be registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
public interface Connection

/**
 * <p><code>Connection</code> represents a <em>transport</em> in the
 * PEPt architecture.</p>
 *
 * @author Harold Carr
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/legacy/connection/Connection.java
public interface Connection

/**
 * This interface represents the connection on which a request is made.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void unregisterWaiter(MessageMediator messageMediator);

    /**
     * Unregister an invocation's
     * {@link com.sun.corba.se.pept.protocol.MessageMediator MessageMediator}
     * with the <code>Connection</code>.
     *
     * @param messageMediator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public InputObject waitForResponse(MessageMediator messageMediator);

    /**
     * If a message expect's a response then this method is called.
     *
     * This method might block on a read (e.g., HTTP), put the calling
     * thread to sleep while another thread read's the response (e.g., GIOP),
     * or it may use the calling thread to perform the server-side work
     * (e.g., Solaris Doors).
     *
     * @param messageMediator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void registerWaiter(MessageMediator messageMediator);

    /**
     * Register an invocation's
     * {@link com.sun.corba.se.pept.protocol.MessageMediator MessageMediator}
     * with the <code>Connection</code>.
     *
     * This is useful in protocols which support fragmentation.
     *
     * @param messageMediator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void writeUnlock();

    /**
     * Release a write lock on the <code>Connection</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void writeLock();

    /**
     * Grab a write lock on the <code>Connection</code>.
     *
     * If another thread already has a write lock then the calling
     * thread will block until the lock is released.  The calling
     * thread must call
     * {@link #writeUnlock}
     * when it is done.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void setState(String state);

    /**
     * The "state" of the <code>Connection</code>.
     *
     * param state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void setTimeStamp(long time);

    /**
     * Timestamps are used for connection management, in particular, for
     * reclaiming idle <code>Connection</code>s.
     *
     * @param time - the "time" the <code>Connection</code> was last used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public long getTimeStamp();

    /**
     * Timestamps are used for connection management, in particular, for
     * reclaiming idle <code>Connection</code>s.
     *
     * @return the "time" the <code>Connection</code> was last used.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean isBusy();

    /**
     * Indicates if the <code>Connection</code> is in the process of
     * sending or receiving a message.
     *
     * @return <code>true</code> if the <code>Connection</code> is busy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean isServer();

    /**
     * Indicates whether a
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * or a
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     * created the
     * <code>Connection</code>.
     *
     * @return <code>true</code> if <code>Connection</code> an
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     * created the <code>Connection</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public EventHandler getEventHandler();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.EventHandler EventHandler}
     * associated with this <code>Acceptor</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.EventHandler EventHandler}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public ContactInfo getContactInfo();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * that created this <code>Connection</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public Acceptor getAcceptor();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     * that created this <code>Connection</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.Acceptor Acceptor}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public void close();

    /**
     * Close the <code>Connection</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean read();

    /**
     * Called to read incoming messages.
     *
     * @return <code>true</code> if the thread calling read can be released.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean shouldRegisterServerReadEvent(); // REVISIT - why special?

    /**
     * Used to determine if the <code>Connection</code> should register
     * with the
     * {@link com.sun.corba.se.pept.transport.TransportManager
     * TransportManager}
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     * to handle read events.
     *
     * For example, an HTTP transport would not register since the requesting
     * thread would just block on read when waiting for the reply.
     *
     * @return <code>true</code> if it should be registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
    public boolean shouldRegisterReadEvent();

    /**
     * Used to determine if the <code>Connection</code> should register
     * with the
     * {@link com.sun.corba.se.pept.transport.TransportManager
     * TransportManager}
     * {@link com.sun.corba.se.pept.transport.Selector Selector}
     * to handle read events.
     *
     * For example, an HTTP transport would not register since the requesting
     * thread would just block on read when waiting for the reply.
     *
     * @return <code>true</code> if it should be registered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/Connection.java
public interface Connection

/**
 * <p><code>Connection</code> represents a <em>transport</em> in the
 * PEPt architecture.</p>
 *
 * @author Harold Carr
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/legacy/connection/Connection.java
public interface Connection

/**
 * This interface represents the connection on which a request is made.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    int getNetworkTimeout() throws SQLException;

    /**
     * Retrieves the number of milliseconds the driver will
     * wait for a database request to complete.
     * If the limit is exceeded, a
     * <code>SQLException</code> is thrown.
     *
     * @return the current timeout limit in milliseconds; zero means there is
     *         no limit
     * @throws SQLException if a database access error occurs or
     * this method is called on a closed <code>Connection</code>
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @see #setNetworkTimeout
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException;

    /**
     *
     * Sets the maximum period a <code>Connection</code> or
     * objects created from the <code>Connection</code>
     * will wait for the database to reply to any one request. If any
     *  request remains unanswered, the waiting method will
     * return with a <code>SQLException</code>, and the <code>Connection</code>
     * or objects created from the <code>Connection</code>  will be marked as
     * closed. Any subsequent use of
     * the objects, with the exception of the <code>close</code>,
     * <code>isClosed</code> or <code>Connection.isValid</code>
     * methods, will result in  a <code>SQLException</code>.
     * <p>
     * <b>Note</b>: This method is intended to address a rare but serious
     * condition where network partitions can cause threads issuing JDBC calls
     * to hang uninterruptedly in socket reads, until the OS TCP-TIMEOUT
     * (typically 10 minutes). This method is related to the
     * {@link #abort abort() } method which provides an administrator
     * thread a means to free any such threads in cases where the
     * JDBC connection is accessible to the administrator thread.
     * The <code>setNetworkTimeout</code> method will cover cases where
     * there is no administrator thread, or it has no access to the
     * connection. This method is severe in it's effects, and should be
     * given a high enough value so it is never triggered before any more
     * normal timeouts, such as transaction timeouts.
     * <p>
     * JDBC driver implementations  may also choose to support the
     * {@code setNetworkTimeout} method to impose a limit on database
     * response time, in environments where no network is present.
     * <p>
     * Drivers may internally implement some or all of their API calls with
     * multiple internal driver-database transmissions, and it is left to the
     * driver implementation to determine whether the limit will be
     * applied always to the response to the API call, or to any
     * single  request made during the API call.
     * <p>
     *
     * This method can be invoked more than once, such as to set a limit for an
     * area of JDBC code, and to reset to the default on exit from this area.
     * Invocation of this method has no impact on already outstanding
     * requests.
     * <p>
     * The {@code Statement.setQueryTimeout()} timeout value is independent of the
     * timeout value specified in {@code setNetworkTimeout}. If the query timeout
     * expires  before the network timeout then the
     * statement execution will be canceled. If the network is still
     * active the result will be that both the statement and connection
     * are still usable. However if the network timeout expires before
     * the query timeout or if the statement timeout fails due to network
     * problems, the connection will be marked as closed, any resources held by
     * the connection will be released and both the connection and
     * statement will be unusable.
     *<p>
     * When the driver determines that the {@code setNetworkTimeout} timeout
     * value has expired, the JDBC driver marks the connection
     * closed and releases any resources held by the connection.
     * <p>
     *
     * This method checks to see that there is an <code>SQLPermission</code>
     * object before allowing the method to proceed.  If a
     * <code>SecurityManager</code> exists and its
     * <code>checkPermission</code> method denies calling
     * <code>setNetworkTimeout</code>, this method throws a
     * <code>java.lang.SecurityException</code>.
     *
     * @param executor  The <code>Executor</code>  implementation which will
     * be used by <code>setNetworkTimeout</code>.
     * @param milliseconds The time in milliseconds to wait for the database
     * operation
     *  to complete.  If the JDBC driver does not support milliseconds, the
     * JDBC driver will round the value up to the nearest second.  If the
     * timeout period expires before the operation
     * completes, a SQLException will be thrown.
     * A value of 0 indicates that there is not timeout for database operations.
     * @throws java.sql.SQLException if a database access error occurs, this
     * method is called on a closed connection,
     * the {@code executor} is {@code null},
     * or the value specified for <code>seconds</code> is less than 0.
     * @throws java.lang.SecurityException if a security manager exists and its
     *    <code>checkPermission</code> method denies calling
     * <code>setNetworkTimeout</code>.
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @see SecurityManager#checkPermission
     * @see Statement#setQueryTimeout
     * @see #getNetworkTimeout
     * @see #abort
     * @see Executor
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void abort(Executor executor) throws SQLException;

    /**
     * Terminates an open connection.  Calling <code>abort</code> results in:
     * <ul>
     * <li>The connection marked as closed
     * <li>Closes any physical connection to the database
     * <li>Releases resources used by the connection
     * <li>Insures that any thread that is currently accessing the connection
     * will either progress to completion or throw an <code>SQLException</code>.
     * </ul>
     * <p>
     * Calling <code>abort</code> marks the connection closed and releases any
     * resources. Calling <code>abort</code> on a closed connection is a
     * no-op.
     * <p>
     * It is possible that the aborting and releasing of the resources that are
     * held by the connection can take an extended period of time.  When the
     * <code>abort</code> method returns, the connection will have been marked as
     * closed and the <code>Executor</code> that was passed as a parameter to abort
     * may still be executing tasks to release resources.
     * <p>
     * This method checks to see that there is an <code>SQLPermission</code>
     * object before allowing the method to proceed.  If a
     * <code>SecurityManager</code> exists and its
     * <code>checkPermission</code> method denies calling <code>abort</code>,
     * this method throws a
     * <code>java.lang.SecurityException</code>.
     * @param executor  The <code>Executor</code>  implementation which will
     * be used by <code>abort</code>.
     * @throws java.sql.SQLException if a database access error occurs or
     * the {@code executor} is {@code null},
     * @throws java.lang.SecurityException if a security manager exists and its
     *    <code>checkPermission</code> method denies calling <code>abort</code>
     * @see SecurityManager#checkPermission
     * @see Executor
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    String getSchema() throws SQLException;

    /**
     * Retrieves this <code>Connection</code> object's current schema name.
     *
     * @return the current schema name or <code>null</code> if there is none
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     * @see #setSchema
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void setSchema(String schema) throws SQLException;

   /**
    * Sets the given schema name to access.
    * <P>
    * If the driver does not support schemas, it will
    * silently ignore this request.
    * <p>
    * Calling {@code setSchema} has no effect on previously created or prepared
    * {@code Statement} objects. It is implementation defined whether a DBMS
    * prepare operation takes place immediately when the {@code Connection}
    * method {@code prepareStatement} or {@code prepareCall} is invoked.
    * For maximum portability, {@code setSchema} should be called before a
    * {@code Statement} is created or prepared.
    *
    * @param schema the name of a schema  in which to work
    * @exception SQLException if a database access error occurs
    * or this method is called on a closed connection
    * @see #getSchema
    * @since 1.7
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
 Struct createStruct(String typeName, Object[] attributes)

/**
  * Factory method for creating Struct objects.
  *
  * @param typeName the SQL type name of the SQL structured type that this <code>Struct</code>
  * object maps to. The typeName is the name of  a user-defined type that
  * has been defined for this database. It is the value returned by
  * <code>Struct.getSQLTypeName</code>.

  * @param attributes the attributes that populate the returned object
  *  @return a Struct object that maps to the given SQL type and is populated with the given attributes
  * @throws SQLException if a database error occurs, the typeName is null or this method is called on a closed connection
  * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this data type
  * @since 1.6
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
 Array createArrayOf(String typeName, Object[] elements) throws

/**
  * Factory method for creating Array objects.
  *<p>
  * <b>Note: </b>When <code>createArrayOf</code> is used to create an array object
  * that maps to a primitive data type, then it is implementation-defined
  * whether the <code>Array</code> object is an array of that primitive
  * data type or an array of <code>Object</code>.
  * <p>
  * <b>Note: </b>The JDBC driver is responsible for mapping the elements
  * <code>Object</code> array to the default JDBC SQL type defined in
  * java.sql.Types for the given class of <code>Object</code>. The default
  * mapping is specified in Appendix B of the JDBC specification.  If the
  * resulting JDBC type is not the appropriate type for the given typeName then
  * it is implementation defined whether an <code>SQLException</code> is
  * thrown or the driver supports the resulting conversion.
  *
  * @param typeName the SQL name of the type the elements of the array map to. The typeName is a
  * database-specific name which may be the name of a built-in type, a user-defined type or a standard  SQL type supported by this database. This
  *  is the value returned by <code>Array.getBaseTypeName</code>
  * @param elements the elements that populate the returned object
  * @return an Array object whose elements map to the specified SQL type
  * @throws SQLException if a database error occurs, the JDBC type is not
  *  appropriate for the typeName and the conversion is not supported, the typeName is null or this method is called on a closed connection
  * @throws SQLFeatureNotSupportedException  if the JDBC driver does not support this data type
  * @since 1.6
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
         Properties getClientInfo()

        /**
         * Returns a list containing the name and current value of each client info
         * property supported by the driver.  The value of a client info property
         * may be null if the property has not been set and does not have a
         * default value.
         * <p>
         * @return      A <code>Properties</code> object that contains the name and current value of
         *                      each of the client info properties supported by the driver.
         * <p>
         * @throws      SQLException if the database server returns an error when
         *                      fetching the client info values from the database
         * or this method is called on a closed connection
         * <p>
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
         String getClientInfo(String name)

        /**
         * Returns the value of the client info property specified by name.  This
         * method may return null if the specified client info property has not
         * been set and does not have a default value.  This method will also
         * return null if the specified client info property name is not supported
         * by the driver.
         * <p>
         * Applications may use the <code>DatabaseMetaData.getClientInfoProperties</code>
         * method to determine the client info properties supported by the driver.
         * <p>
         * @param name          The name of the client info property to retrieve
         * <p>
         * @return                      The value of the client info property specified
         * <p>
         * @throws SQLException         if the database server returns an error when
         *                                                      fetching the client info value from the database
         *or this method is called on a closed connection
         * <p>
         * @since 1.6
         *
         * @see java.sql.DatabaseMetaData#getClientInfoProperties
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
         void setClientInfo(Properties properties)

        /**
     * Sets the value of the connection's client info properties.  The
     * <code>Properties</code> object contains the names and values of the client info
     * properties to be set.  The set of client info properties contained in
     * the properties list replaces the current set of client info properties
     * on the connection.  If a property that is currently set on the
     * connection is not present in the properties list, that property is
     * cleared.  Specifying an empty properties list will clear all of the
     * properties on the connection.  See <code>setClientInfo (String, String)</code> for
     * more information.
     * <p>
     * If an error occurs in setting any of the client info properties, a
     * <code>SQLClientInfoException</code> is thrown. The <code>SQLClientInfoException</code>
     * contains information indicating which client info properties were not set.
     * The state of the client information is unknown because
     * some databases do not allow multiple client info properties to be set
     * atomically.  For those databases, one or more properties may have been
     * set before the error occurred.
     * <p>
     *
     * @param properties                the list of client info properties to set
     * <p>
     * @see java.sql.Connection#setClientInfo(String, String) setClientInfo(String, String)
     * @since 1.6
     * <p>
     * @throws SQLClientInfoException if the database server returns an error while
     *                  setting the clientInfo values on the database server or this method
     * is called on a closed connection
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
         void setClientInfo(String name, String value)

        /**
         * Sets the value of the client info property specified by name to the
         * value specified by value.
         * <p>
         * Applications may use the <code>DatabaseMetaData.getClientInfoProperties</code>
         * method to determine the client info properties supported by the driver
         * and the maximum length that may be specified for each property.
         * <p>
         * The driver stores the value specified in a suitable location in the
         * database.  For example in a special register, session parameter, or
         * system table column.  For efficiency the driver may defer setting the
         * value in the database until the next time a statement is executed or
         * prepared.  Other than storing the client information in the appropriate
         * place in the database, these methods shall not alter the behavior of
         * the connection in anyway.  The values supplied to these methods are
         * used for accounting, diagnostics and debugging purposes only.
         * <p>
         * The driver shall generate a warning if the client info name specified
         * is not recognized by the driver.
         * <p>
         * If the value specified to this method is greater than the maximum
         * length for the property the driver may either truncate the value and
         * generate a warning or generate a <code>SQLClientInfoException</code>.  If the driver
         * generates a <code>SQLClientInfoException</code>, the value specified was not set on the
         * connection.
         * <p>
         * The following are standard client info properties.  Drivers are not
         * required to support these properties however if the driver supports a
         * client info property that can be described by one of the standard
         * properties, the standard property name should be used.
         *
         * <ul>
         * <li>ApplicationName  -       The name of the application currently utilizing
         *                                                      the connection</li>
         * <li>ClientUser               -       The name of the user that the application using
         *                                                      the connection is performing work for.  This may
         *                                                      not be the same as the user name that was used
         *                                                      in establishing the connection.</li>
         * <li>ClientHostname   -       The hostname of the computer the application
         *                                                      using the connection is running on.</li>
         * </ul>
         * <p>
         * @param name          The name of the client info property to set
         * @param value         The value to set the client info property to.  If the
         *                                      value is null, the current value of the specified
         *                                      property is cleared.
         * <p>
         * @throws      SQLClientInfoException if the database server returns an error while
         *                      setting the client info value on the database server or this method
         * is called on a closed connection
         * <p>
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
         boolean isValid(int timeout) throws SQLException;

        /**
         * Returns true if the connection has not been closed and is still valid.
         * The driver shall submit a query on the connection or use some other
         * mechanism that positively verifies the connection is still valid when
         * this method is called.
         * <p>
         * The query submitted by the driver to validate the connection shall be
         * executed in the context of the current transaction.
         *
         * @param timeout -             The time in seconds to wait for the database operation
         *                                              used to validate the connection to complete.  If
         *                                              the timeout period expires before the operation
         *                                              completes, this method returns false.  A value of
         *                                              0 indicates a timeout is not applied to the
         *                                              database operation.
         * <p>
         * @return true if the connection is valid, false otherwise
         * @exception SQLException if the value supplied for <code>timeout</code>
         * is less then 0
         * @since 1.6
         *
         * @see java.sql.DatabaseMetaData#getClientInfoProperties
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    SQLXML createSQLXML() throws SQLException;

    /**
     * Constructs an object that implements the <code>SQLXML</code> interface. The object
     * returned initially contains no data. The <code>createXmlStreamWriter</code> object and
     * <code>setString</code> method of the <code>SQLXML</code> interface may be used to add data to the <code>SQLXML</code>
     * object.
     * @return An object that implements the <code>SQLXML</code> interface
     * @throws SQLException if an object that implements the <code>SQLXML</code> interface can not
     * be constructed, this method is
     * called on a closed connection or a database access error occurs.
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this data type
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    NClob createNClob() throws SQLException;

    /**
     * Constructs an object that implements the <code>NClob</code> interface. The object
     * returned initially contains no data.  The <code>setAsciiStream</code>,
     * <code>setCharacterStream</code> and <code>setString</code> methods of the <code>NClob</code> interface may
     * be used to add data to the <code>NClob</code>.
     * @return An object that implements the <code>NClob</code> interface
     * @throws SQLException if an object that implements the
     * <code>NClob</code> interface can not be constructed, this method is
     * called on a closed connection or a database access error occurs.
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this data type
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    Blob createBlob() throws SQLException;

    /**
     * Constructs an object that implements the <code>Blob</code> interface. The object
     * returned initially contains no data.  The <code>setBinaryStream</code> and
     * <code>setBytes</code> methods of the <code>Blob</code> interface may be used to add data to
     * the <code>Blob</code>.
     * @return  An object that implements the <code>Blob</code> interface
     * @throws SQLException if an object that implements the
     * <code>Blob</code> interface can not be constructed, this method is
     * called on a closed connection or a database access error occurs.
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this data type
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    Clob createClob() throws SQLException;

    /**
     * Constructs an object that implements the <code>Clob</code> interface. The object
     * returned initially contains no data.  The <code>setAsciiStream</code>,
     * <code>setCharacterStream</code> and <code>setString</code> methods of
     * the <code>Clob</code> interface may be used to add data to the <code>Clob</code>.
     * @return An object that implements the <code>Clob</code> interface
     * @throws SQLException if an object that implements the
     * <code>Clob</code> interface can not be constructed, this method is
     * called on a closed connection or a database access error occurs.
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this data type
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    PreparedStatement prepareStatement(String sql, String columnNames[])

    /**
     * Creates a default <code>PreparedStatement</code> object capable
     * of returning the auto-generated keys designated by the given array.
     * This array contains the names of the columns in the target
     * table that contain the auto-generated keys that should be returned.
     * The driver will ignore the array if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     * <P>
     * An SQL statement with or without IN parameters can be
     * pre-compiled and stored in a <code>PreparedStatement</code> object. This
     * object can then be used to efficiently execute this statement
     * multiple times.
     * <P>
     * <B>Note:</B> This method is optimized for handling
     * parametric SQL statements that benefit from precompilation. If
     * the driver supports precompilation,
     * the method <code>prepareStatement</code> will send
     * the statement to the database for precompilation. Some drivers
     * may not support precompilation. In this case, the statement may
     * not be sent to the database until the <code>PreparedStatement</code>
     * object is executed.  This has no direct effect on users; however, it does
     * affect which methods throw certain SQLExceptions.
     * <P>
     * Result sets created using the returned <code>PreparedStatement</code>
     * object will by default be type <code>TYPE_FORWARD_ONLY</code>
     * and have a concurrency level of <code>CONCUR_READ_ONLY</code>.
     * The holdability of the created result sets can be determined by
     * calling {@link #getHoldability}.
     *
     * @param sql an SQL statement that may contain one or more '?' IN
     *        parameter placeholders
     * @param columnNames an array of column names indicating the columns
     *        that should be returned from the inserted row or rows
     * @return a new <code>PreparedStatement</code> object, containing the
     *         pre-compiled statement, that is capable of returning the
     *         auto-generated keys designated by the given array of column
     *         names
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    PreparedStatement prepareStatement(String sql, int columnIndexes[])

    /**
     * Creates a default <code>PreparedStatement</code> object capable
     * of returning the auto-generated keys designated by the given array.
     * This array contains the indexes of the columns in the target
     * table that contain the auto-generated keys that should be made
     * available.  The driver will ignore the array if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     *<p>
     * An SQL statement with or without IN parameters can be
     * pre-compiled and stored in a <code>PreparedStatement</code> object. This
     * object can then be used to efficiently execute this statement
     * multiple times.
     * <P>
     * <B>Note:</B> This method is optimized for handling
     * parametric SQL statements that benefit from precompilation. If
     * the driver supports precompilation,
     * the method <code>prepareStatement</code> will send
     * the statement to the database for precompilation. Some drivers
     * may not support precompilation. In this case, the statement may
     * not be sent to the database until the <code>PreparedStatement</code>
     * object is executed.  This has no direct effect on users; however, it does
     * affect which methods throw certain SQLExceptions.
     * <P>
     * Result sets created using the returned <code>PreparedStatement</code>
     * object will by default be type <code>TYPE_FORWARD_ONLY</code>
     * and have a concurrency level of <code>CONCUR_READ_ONLY</code>.
     * The holdability of the created result sets can be determined by
     * calling {@link #getHoldability}.
     *
     * @param sql an SQL statement that may contain one or more '?' IN
     *        parameter placeholders
     * @param columnIndexes an array of column indexes indicating the columns
     *        that should be returned from the inserted row or rows
     * @return a new <code>PreparedStatement</code> object, containing the
     *         pre-compiled statement, that is capable of returning the
     *         auto-generated keys designated by the given array of column
     *         indexes
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)

    /**
     * Creates a default <code>PreparedStatement</code> object that has
     * the capability to retrieve auto-generated keys. The given constant
     * tells the driver whether it should make auto-generated keys
     * available for retrieval.  This parameter is ignored if the SQL statement
     * is not an <code>INSERT</code> statement, or an SQL statement able to return
     * auto-generated keys (the list of such statements is vendor-specific).
     * <P>
     * <B>Note:</B> This method is optimized for handling
     * parametric SQL statements that benefit from precompilation. If
     * the driver supports precompilation,
     * the method <code>prepareStatement</code> will send
     * the statement to the database for precompilation. Some drivers
     * may not support precompilation. In this case, the statement may
     * not be sent to the database until the <code>PreparedStatement</code>
     * object is executed.  This has no direct effect on users; however, it does
     * affect which methods throw certain SQLExceptions.
     * <P>
     * Result sets created using the returned <code>PreparedStatement</code>
     * object will by default be type <code>TYPE_FORWARD_ONLY</code>
     * and have a concurrency level of <code>CONCUR_READ_ONLY</code>.
     * The holdability of the created result sets can be determined by
     * calling {@link #getHoldability}.
     *
     * @param sql an SQL statement that may contain one or more '?' IN
     *        parameter placeholders
     * @param autoGeneratedKeys a flag indicating whether auto-generated keys
     *        should be returned; one of
     *        <code>Statement.RETURN_GENERATED_KEYS</code> or
     *        <code>Statement.NO_GENERATED_KEYS</code>
     * @return a new <code>PreparedStatement</code> object, containing the
     *         pre-compiled SQL statement, that will have the capability of
     *         returning auto-generated keys
     * @exception SQLException if a database access error occurs, this
     *  method is called on a closed connection
     *         or the given parameter is not a <code>Statement</code>
     *         constant indicating whether auto-generated keys should be
     *         returned
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method with a constant of Statement.RETURN_GENERATED_KEYS
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    CallableStatement prepareCall(String sql, int resultSetType,
                                  int resultSetConcurrency,
                                  int resultSetHoldability) throws SQLException;

    /**
     * Creates a <code>CallableStatement</code> object that will generate
     * <code>ResultSet</code> objects with the given type and concurrency.
     * This method is the same as the <code>prepareCall</code> method
     * above, but it allows the default result set
     * type, result set concurrency type and holdability to be overridden.
     *
     * @param sql a <code>String</code> object that is the SQL statement to
     *            be sent to the database; may contain on or more '?' parameters
     * @param resultSetType one of the following <code>ResultSet</code>
     *        constants:
     *         <code>ResultSet.TYPE_FORWARD_ONLY</code>,
     *         <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
     *         <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
     * @param resultSetConcurrency one of the following <code>ResultSet</code>
     *        constants:
     *         <code>ResultSet.CONCUR_READ_ONLY</code> or
     *         <code>ResultSet.CONCUR_UPDATABLE</code>
     * @param resultSetHoldability one of the following <code>ResultSet</code>
     *        constants:
     *         <code>ResultSet.HOLD_CURSORS_OVER_COMMIT</code> or
     *         <code>ResultSet.CLOSE_CURSORS_AT_COMMIT</code>
     * @return a new <code>CallableStatement</code> object, containing the
     *         pre-compiled SQL statement, that will generate
     *         <code>ResultSet</code> objects with the given type,
     *         concurrency, and holdability
     * @exception SQLException if a database access error occurs, this
     * method is called on a closed connection
     *            or the given parameters are not <code>ResultSet</code>
     *            constants indicating type, concurrency, and holdability
      * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method or this method is not supported for the specified result
     * set type, result set holdability and result set concurrency.
     * @see ResultSet
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    PreparedStatement prepareStatement(String sql, int resultSetType,
                                       int resultSetConcurrency, int resultSetHoldability)

    /**
     * Creates a <code>PreparedStatement</code> object that will generate
     * <code>ResultSet</code> objects with the given type, concurrency,
     * and holdability.
     * <P>
     * This method is the same as the <code>prepareStatement</code> method
     * above, but it allows the default result set
     * type, concurrency, and holdability to be overridden.
     *
     * @param sql a <code>String</code> object that is the SQL statement to
     *            be sent to the database; may contain one or more '?' IN
     *            parameters
     * @param resultSetType one of the following <code>ResultSet</code>
     *        constants:
     *         <code>ResultSet.TYPE_FORWARD_ONLY</code>,
     *         <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
     *         <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
     * @param resultSetConcurrency one of the following <code>ResultSet</code>
     *        constants:
     *         <code>ResultSet.CONCUR_READ_ONLY</code> or
     *         <code>ResultSet.CONCUR_UPDATABLE</code>
     * @param resultSetHoldability one of the following <code>ResultSet</code>
     *        constants:
     *         <code>ResultSet.HOLD_CURSORS_OVER_COMMIT</code> or
     *         <code>ResultSet.CLOSE_CURSORS_AT_COMMIT</code>
     * @return a new <code>PreparedStatement</code> object, containing the
     *         pre-compiled SQL statement, that will generate
     *         <code>ResultSet</code> objects with the given type,
     *         concurrency, and holdability
     * @exception SQLException if a database access error occurs, this
     * method is called on a closed connection
     *            or the given parameters are not <code>ResultSet</code>
     *            constants indicating type, concurrency, and holdability
      * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method or this method is not supported for the specified result
     * set type, result set holdability and result set concurrency.
     * @see ResultSet
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    Statement createStatement(int resultSetType, int resultSetConcurrency,
                              int resultSetHoldability) throws SQLException;

    /**
     * Creates a <code>Statement</code> object that will generate
     * <code>ResultSet</code> objects with the given type, concurrency,
     * and holdability.
     * This method is the same as the <code>createStatement</code> method
     * above, but it allows the default result set
     * type, concurrency, and holdability to be overridden.
     *
     * @param resultSetType one of the following <code>ResultSet</code>
     *        constants:
     *         <code>ResultSet.TYPE_FORWARD_ONLY</code>,
     *         <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
     *         <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
     * @param resultSetConcurrency one of the following <code>ResultSet</code>
     *        constants:
     *         <code>ResultSet.CONCUR_READ_ONLY</code> or
     *         <code>ResultSet.CONCUR_UPDATABLE</code>
     * @param resultSetHoldability one of the following <code>ResultSet</code>
     *        constants:
     *         <code>ResultSet.HOLD_CURSORS_OVER_COMMIT</code> or
     *         <code>ResultSet.CLOSE_CURSORS_AT_COMMIT</code>
     * @return a new <code>Statement</code> object that will generate
     *         <code>ResultSet</code> objects with the given type,
     *         concurrency, and holdability
     * @exception SQLException if a database access error occurs, this
     * method is called on a closed connection
     *            or the given parameters are not <code>ResultSet</code>
     *            constants indicating type, concurrency, and holdability
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method or this method is not supported for the specified result
     * set type, result set holdability and result set concurrency.
     * @see ResultSet
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void releaseSavepoint(Savepoint savepoint) throws SQLException;

    /**
     * Removes the specified <code>Savepoint</code>  and subsequent <code>Savepoint</code> objects from the current
     * transaction. Any reference to the savepoint after it have been removed
     * will cause an <code>SQLException</code> to be thrown.
     *
     * @param savepoint the <code>Savepoint</code> object to be removed
     * @exception SQLException if a database access error occurs, this
     *  method is called on a closed connection or
     *            the given <code>Savepoint</code> object is not a valid
     *            savepoint in the current transaction
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void rollback(Savepoint savepoint) throws SQLException;

    /**
     * Undoes all changes made after the given <code>Savepoint</code> object
     * was set.
     * <P>
     * This method should be used only when auto-commit has been disabled.
     *
     * @param savepoint the <code>Savepoint</code> object to roll back to
     * @exception SQLException if a database access error occurs,
     * this method is called while participating in a distributed transaction,
     * this method is called on a closed connection,
     *            the <code>Savepoint</code> object is no longer valid,
     *            or this <code>Connection</code> object is currently in
     *            auto-commit mode
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @see Savepoint
     * @see #rollback
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    Savepoint setSavepoint(String name) throws SQLException;

    /**
     * Creates a savepoint with the given name in the current transaction
     * and returns the new <code>Savepoint</code> object that represents it.
     *
     * <p> if setSavepoint is invoked outside of an active transaction, a transaction will be started at this newly created
     *savepoint.
     *
     * @param name a <code>String</code> containing the name of the savepoint
     * @return the new <code>Savepoint</code> object
     * @exception SQLException if a database access error occurs,
          * this method is called while participating in a distributed transaction,
     * this method is called on a closed connection
     *            or this <code>Connection</code> object is currently in
     *            auto-commit mode
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @see Savepoint
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    Savepoint setSavepoint() throws SQLException;

    /**
     * Creates an unnamed savepoint in the current transaction and
     * returns the new <code>Savepoint</code> object that represents it.
     *
     *<p> if setSavepoint is invoked outside of an active transaction, a transaction will be started at this newly created
     *savepoint.
     *
     * @return the new <code>Savepoint</code> object
     * @exception SQLException if a database access error occurs,
     * this method is called while participating in a distributed transaction,
     * this method is called on a closed connection
     *            or this <code>Connection</code> object is currently in
     *            auto-commit mode
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @see Savepoint
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    int getHoldability() throws SQLException;

    /**
     * Retrieves the current holdability of <code>ResultSet</code> objects
     * created using this <code>Connection</code> object.
     *
     * @return the holdability, one of
     *        <code>ResultSet.HOLD_CURSORS_OVER_COMMIT</code> or
     *        <code>ResultSet.CLOSE_CURSORS_AT_COMMIT</code>
     * @throws SQLException if a database access error occurs
     * or this method is called on a closed connection
     * @see #setHoldability
     * @see DatabaseMetaData#getResultSetHoldability
     * @see ResultSet
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void setHoldability(int holdability) throws SQLException;

    /**
     * Changes the default holdability of <code>ResultSet</code> objects
     * created using this <code>Connection</code> object to the given
     * holdability.  The default holdability of <code>ResultSet</code> objects
     * can be be determined by invoking
     * {@link DatabaseMetaData#getResultSetHoldability}.
     *
     * @param holdability a <code>ResultSet</code> holdability constant; one of
     *        <code>ResultSet.HOLD_CURSORS_OVER_COMMIT</code> or
     *        <code>ResultSet.CLOSE_CURSORS_AT_COMMIT</code>
     * @throws SQLException if a database access occurs, this method is called
     * on a closed connection, or the given parameter
     *         is not a <code>ResultSet</code> constant indicating holdability
     * @exception SQLFeatureNotSupportedException if the given holdability is not supported
     * @see #getHoldability
     * @see DatabaseMetaData#getResultSetHoldability
     * @see ResultSet
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void setTypeMap(java.util.Map<String,Class<?>> map) throws SQLException;

    /**
     * Installs the given <code>TypeMap</code> object as the type map for
     * this <code>Connection</code> object.  The type map will be used for the
     * custom mapping of SQL structured types and distinct types.
     *<p>
     * You must set the the values for the <code>TypeMap</code> prior to
     * callng <code>setMap</code> as a JDBC driver may create an internal copy
     * of the <code>TypeMap</code>:
     *
     * <pre>
     *      Map myMap&lt;String,Class&lt;?&gt;&gt; = new HashMap&lt;String,Class&lt;?&gt;&gt;();
     *      myMap.put("mySchemaName.ATHLETES", Athletes.class);
     *      con.setTypeMap(myMap);
     * </pre>
     * @param map the <code>java.util.Map</code> object to install
     *        as the replacement for this <code>Connection</code>
     *        object's default type map
     * @exception SQLException if a database access error occurs, this
     * method is called on a closed connection or
     *        the given parameter is not a <code>java.util.Map</code>
     *        object
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @since 1.2
     * @see #getTypeMap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    java.util.Map<String,Class<?>> getTypeMap() throws SQLException;

    /**
     * Retrieves the <code>Map</code> object associated with this
     * <code>Connection</code> object.
     * Unless the application has added an entry, the type map returned
     * will be empty.
     * <p>
     * You must invoke <code>setTypeMap</code> after making changes to the
     * <code>Map</code> object returned from
     *  <code>getTypeMap</code> as a JDBC driver may create an internal
     * copy of the <code>Map</code> object passed to <code>setTypeMap</code>:
     *
     * <pre>
     *      Map&lt;String,Class&lt;?&gt;&gt; myMap = con.getTypeMap();
     *      myMap.put("mySchemaName.ATHLETES", Athletes.class);
     *      con.setTypeMap(myMap);
     * </pre>
     * @return the <code>java.util.Map</code> object associated
     *         with this <code>Connection</code> object
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method
     * @since 1.2
     * @see #setTypeMap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    CallableStatement prepareCall(String sql, int resultSetType,
                                  int resultSetConcurrency) throws SQLException;

    /**
     * Creates a <code>CallableStatement</code> object that will generate
     * <code>ResultSet</code> objects with the given type and concurrency.
     * This method is the same as the <code>prepareCall</code> method
     * above, but it allows the default result set
     * type and concurrency to be overridden.
     * The holdability of the created result sets can be determined by
     * calling {@link #getHoldability}.
     *
     * @param sql a <code>String</code> object that is the SQL statement to
     *            be sent to the database; may contain on or more '?' parameters
     * @param resultSetType a result set type; one of
     *         <code>ResultSet.TYPE_FORWARD_ONLY</code>,
     *         <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
     *         <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
     * @param resultSetConcurrency a concurrency type; one of
     *         <code>ResultSet.CONCUR_READ_ONLY</code> or
     *         <code>ResultSet.CONCUR_UPDATABLE</code>
     * @return a new <code>CallableStatement</code> object containing the
     * pre-compiled SQL statement that will produce <code>ResultSet</code>
     * objects with the given type and concurrency
     * @exception SQLException if a database access error occurs, this method
     * is called on a closed connection
     *         or the given parameters are not <code>ResultSet</code>
     *         constants indicating type and concurrency
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method or this method is not supported for the specified result
     * set type and result set concurrency.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    PreparedStatement prepareStatement(String sql, int resultSetType,
                                       int resultSetConcurrency)

    /**
     *
     * Creates a <code>PreparedStatement</code> object that will generate
     * <code>ResultSet</code> objects with the given type and concurrency.
     * This method is the same as the <code>prepareStatement</code> method
     * above, but it allows the default result set
     * type and concurrency to be overridden.
     * The holdability of the created result sets can be determined by
     * calling {@link #getHoldability}.
     *
     * @param sql a <code>String</code> object that is the SQL statement to
     *            be sent to the database; may contain one or more '?' IN
     *            parameters
     * @param resultSetType a result set type; one of
     *         <code>ResultSet.TYPE_FORWARD_ONLY</code>,
     *         <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
     *         <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
     * @param resultSetConcurrency a concurrency type; one of
     *         <code>ResultSet.CONCUR_READ_ONLY</code> or
     *         <code>ResultSet.CONCUR_UPDATABLE</code>
     * @return a new PreparedStatement object containing the
     * pre-compiled SQL statement that will produce <code>ResultSet</code>
     * objects with the given type and concurrency
     * @exception SQLException if a database access error occurs, this
     * method is called on a closed connection
     *         or the given parameters are not <code>ResultSet</code>
     *         constants indicating type and concurrency
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method or this method is not supported for the specified result
     * set type and result set concurrency.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    Statement createStatement(int resultSetType, int resultSetConcurrency)

    /**
     * Creates a <code>Statement</code> object that will generate
     * <code>ResultSet</code> objects with the given type and concurrency.
     * This method is the same as the <code>createStatement</code> method
     * above, but it allows the default result set
     * type and concurrency to be overridden.
     * The holdability of the created result sets can be determined by
     * calling {@link #getHoldability}.
     *
     * @param resultSetType a result set type; one of
     *        <code>ResultSet.TYPE_FORWARD_ONLY</code>,
     *        <code>ResultSet.TYPE_SCROLL_INSENSITIVE</code>, or
     *        <code>ResultSet.TYPE_SCROLL_SENSITIVE</code>
     * @param resultSetConcurrency a concurrency type; one of
     *        <code>ResultSet.CONCUR_READ_ONLY</code> or
     *        <code>ResultSet.CONCUR_UPDATABLE</code>
     * @return a new <code>Statement</code> object that will generate
     *         <code>ResultSet</code> objects with the given type and
     *         concurrency
     * @exception SQLException if a database access error occurs, this
     * method is called on a closed connection
     *         or the given parameters are not <code>ResultSet</code>
     *         constants indicating type and concurrency
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not support
     * this method or this method is not supported for the specified result
     * set type and result set concurrency.
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void clearWarnings() throws SQLException;

    /**
     * Clears all warnings reported for this <code>Connection</code> object.
     * After a call to this method, the method <code>getWarnings</code>
     * returns <code>null</code> until a new warning is
     * reported for this <code>Connection</code> object.
     *
     * @exception SQLException SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    SQLWarning getWarnings() throws SQLException;

    /**
     * Retrieves the first warning reported by calls on this
     * <code>Connection</code> object.  If there is more than one
     * warning, subsequent warnings will be chained to the first one
     * and can be retrieved by calling the method
     * <code>SQLWarning.getNextWarning</code> on the warning
     * that was retrieved previously.
     * <P>
     * This method may not be
     * called on a closed connection; doing so will cause an
     * <code>SQLException</code> to be thrown.
     *
     * <P><B>Note:</B> Subsequent warnings will be chained to this
     * SQLWarning.
     *
     * @return the first <code>SQLWarning</code> object or <code>null</code>
     *         if there are none
     * @exception SQLException if a database access error occurs or
     *            this method is called on a closed connection
     * @see SQLWarning
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    int getTransactionIsolation() throws SQLException;

    /**
     * Retrieves this <code>Connection</code> object's current
     * transaction isolation level.
     *
     * @return the current transaction isolation level, which will be one
     *         of the following constants:
     *        <code>Connection.TRANSACTION_READ_UNCOMMITTED</code>,
     *        <code>Connection.TRANSACTION_READ_COMMITTED</code>,
     *        <code>Connection.TRANSACTION_REPEATABLE_READ</code>,
     *        <code>Connection.TRANSACTION_SERIALIZABLE</code>, or
     *        <code>Connection.TRANSACTION_NONE</code>.
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     * @see #setTransactionIsolation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void setTransactionIsolation(int level) throws SQLException;

    /**
     * Attempts to change the transaction isolation level for this
     * <code>Connection</code> object to the one given.
     * The constants defined in the interface <code>Connection</code>
     * are the possible transaction isolation levels.
     * <P>
     * <B>Note:</B> If this method is called during a transaction, the result
     * is implementation-defined.
     *
     * @param level one of the following <code>Connection</code> constants:
     *        <code>Connection.TRANSACTION_READ_UNCOMMITTED</code>,
     *        <code>Connection.TRANSACTION_READ_COMMITTED</code>,
     *        <code>Connection.TRANSACTION_REPEATABLE_READ</code>, or
     *        <code>Connection.TRANSACTION_SERIALIZABLE</code>.
     *        (Note that <code>Connection.TRANSACTION_NONE</code> cannot be used
     *        because it specifies that transactions are not supported.)
     * @exception SQLException if a database access error occurs, this
     * method is called on a closed connection
     *            or the given parameter is not one of the <code>Connection</code>
     *            constants
     * @see DatabaseMetaData#supportsTransactionIsolationLevel
     * @see #getTransactionIsolation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    int TRANSACTION_SERIALIZABLE     = 8;

    /**
     * A constant indicating that
     * dirty reads, non-repeatable reads and phantom reads are prevented.
     * This level includes the prohibitions in
     * <code>TRANSACTION_REPEATABLE_READ</code> and further prohibits the
     * situation where one transaction reads all rows that satisfy
     * a <code>WHERE</code> condition, a second transaction inserts a row that
     * satisfies that <code>WHERE</code> condition, and the first transaction
     * rereads for the same condition, retrieving the additional
     * "phantom" row in the second read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    int TRANSACTION_REPEATABLE_READ  = 4;

    /**
     * A constant indicating that
     * dirty reads and non-repeatable reads are prevented; phantom
     * reads can occur.  This level prohibits a transaction from
     * reading a row with uncommitted changes in it, and it also
     * prohibits the situation where one transaction reads a row,
     * a second transaction alters the row, and the first transaction
     * rereads the row, getting different values the second time
     * (a "non-repeatable read").
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    int TRANSACTION_READ_COMMITTED   = 2;

    /**
     * A constant indicating that
     * dirty reads are prevented; non-repeatable reads and phantom
     * reads can occur.  This level only prohibits a transaction
     * from reading a row with uncommitted changes in it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    int TRANSACTION_READ_UNCOMMITTED = 1;

    /**
     * A constant indicating that
     * dirty reads, non-repeatable reads and phantom reads can occur.
     * This level allows a row changed by one transaction to be read
     * by another transaction before any changes in that row have been
     * committed (a "dirty read").  If any of the changes are rolled back,
     * the second transaction will have retrieved an invalid row.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    int TRANSACTION_NONE             = 0;

    /**
     * A constant indicating that transactions are not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    String getCatalog() throws SQLException;

    /**
     * Retrieves this <code>Connection</code> object's current catalog name.
     *
     * @return the current catalog name or <code>null</code> if there is none
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     * @see #setCatalog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void setCatalog(String catalog) throws SQLException;

    /**
     * Sets the given catalog name in order to select
     * a subspace of this <code>Connection</code> object's database
     * in which to work.
     * <P>
     * If the driver does not support catalogs, it will
     * silently ignore this request.
     * <p>
     * Calling {@code setCatalog} has no effect on previously created or prepared
     * {@code Statement} objects. It is implementation defined whether a DBMS
     * prepare operation takes place immediately when the {@code Connection}
     * method {@code prepareStatement} or {@code prepareCall} is invoked.
     * For maximum portability, {@code setCatalog} should be called before a
     * {@code Statement} is created or prepared.
     *
     * @param catalog the name of a catalog (subspace in this
     *        <code>Connection</code> object's database) in which to work
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     * @see #getCatalog
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    boolean isReadOnly() throws SQLException;

    /**
     * Retrieves whether this <code>Connection</code>
     * object is in read-only mode.
     *
     * @return <code>true</code> if this <code>Connection</code> object
     *         is read-only; <code>false</code> otherwise
     * @exception SQLException SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void setReadOnly(boolean readOnly) throws SQLException;

    /**
     * Puts this connection in read-only mode as a hint to the driver to enable
     * database optimizations.
     *
     * <P><B>Note:</B> This method cannot be called during a transaction.
     *
     * @param readOnly <code>true</code> enables read-only mode;
     *        <code>false</code> disables it
     * @exception SQLException if a database access error occurs, this
     *  method is called on a closed connection or this
     *            method is called during a transaction
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    DatabaseMetaData getMetaData() throws SQLException;

    /**
     * Retrieves a <code>DatabaseMetaData</code> object that contains
     * metadata about the database to which this
     * <code>Connection</code> object represents a connection.
     * The metadata includes information about the database's
     * tables, its supported SQL grammar, its stored
     * procedures, the capabilities of this connection, and so on.
     *
     * @return a <code>DatabaseMetaData</code> object for this
     *         <code>Connection</code> object
     * @exception  SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    boolean isClosed() throws SQLException;

    /**
     * Retrieves whether this <code>Connection</code> object has been
     * closed.  A connection is closed if the method <code>close</code>
     * has been called on it or if certain fatal errors have occurred.
     * This method is guaranteed to return <code>true</code> only when
     * it is called after the method <code>Connection.close</code> has
     * been called.
     * <P>
     * This method generally cannot be called to determine whether a
     * connection to a database is valid or invalid.  A typical client
     * can determine that a connection is invalid by catching any
     * exceptions that might be thrown when an operation is attempted.
     *
     * @return <code>true</code> if this <code>Connection</code> object
     *         is closed; <code>false</code> if it is still open
     * @exception SQLException if a database access error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void close() throws SQLException;

    /**
     * Releases this <code>Connection</code> object's database and JDBC resources
     * immediately instead of waiting for them to be automatically released.
     * <P>
     * Calling the method <code>close</code> on a <code>Connection</code>
     * object that is already closed is a no-op.
     * <P>
     * It is <b>strongly recommended</b> that an application explicitly
     * commits or rolls back an active transaction prior to calling the
     * <code>close</code> method.  If the <code>close</code> method is called
     * and there is an active transaction, the results are implementation-defined.
     * <P>
     *
     * @exception SQLException SQLException if a database access error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void rollback() throws SQLException;

    /**
     * Undoes all changes made in the current transaction
     * and releases any database locks currently held
     * by this <code>Connection</code> object. This method should be
     * used only when auto-commit mode has been disabled.
     *
     * @exception SQLException if a database access error occurs,
     * this method is called while participating in a distributed transaction,
     * this method is called on a closed connection or this
     *            <code>Connection</code> object is in auto-commit mode
     * @see #setAutoCommit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void commit() throws SQLException;

    /**
     * Makes all changes made since the previous
     * commit/rollback permanent and releases any database locks
     * currently held by this <code>Connection</code> object.
     * This method should be
     * used only when auto-commit mode has been disabled.
     *
     * @exception SQLException if a database access error occurs,
     * this method is called while participating in a distributed transaction,
     * if this method is called on a closed connection or this
     *            <code>Connection</code> object is in auto-commit mode
     * @see #setAutoCommit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    boolean getAutoCommit() throws SQLException;

    /**
     * Retrieves the current auto-commit mode for this <code>Connection</code>
     * object.
     *
     * @return the current state of this <code>Connection</code> object's
     *         auto-commit mode
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     * @see #setAutoCommit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    void setAutoCommit(boolean autoCommit) throws SQLException;

    /**
     * Sets this connection's auto-commit mode to the given state.
     * If a connection is in auto-commit mode, then all its SQL
     * statements will be executed and committed as individual
     * transactions.  Otherwise, its SQL statements are grouped into
     * transactions that are terminated by a call to either
     * the method <code>commit</code> or the method <code>rollback</code>.
     * By default, new connections are in auto-commit
     * mode.
     * <P>
     * The commit occurs when the statement completes. The time when the statement
     * completes depends on the type of SQL Statement:
     * <ul>
     * <li>For DML statements, such as Insert, Update or Delete, and DDL statements,
     * the statement is complete as soon as it has finished executing.
     * <li>For Select statements, the statement is complete when the associated result
     * set is closed.
     * <li>For <code>CallableStatement</code> objects or for statements that return
     * multiple results, the statement is complete
     * when all of the associated result sets have been closed, and all update
     * counts and output parameters have been retrieved.
     *</ul>
     * <P>
     * <B>NOTE:</B>  If this method is called during a transaction and the
     * auto-commit mode is changed, the transaction is committed.  If
     * <code>setAutoCommit</code> is called and the auto-commit mode is
     * not changed, the call is a no-op.
     *
     * @param autoCommit <code>true</code> to enable auto-commit mode;
     *         <code>false</code> to disable it
     * @exception SQLException if a database access error occurs,
     *  setAutoCommit(true) is called while participating in a distributed transaction,
     * or this method is called on a closed connection
     * @see #getAutoCommit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    String nativeSQL(String sql) throws SQLException;

    /**
     * Converts the given SQL statement into the system's native SQL grammar.
     * A driver may convert the JDBC SQL grammar into its system's
     * native SQL grammar prior to sending it. This method returns the
     * native form of the statement that the driver would have sent.
     *
     * @param sql an SQL statement that may contain one or more '?'
     * parameter placeholders
     * @return the native form of this statement
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    CallableStatement prepareCall(String sql) throws SQLException;

    /**
     * Creates a <code>CallableStatement</code> object for calling
     * database stored procedures.
     * The <code>CallableStatement</code> object provides
     * methods for setting up its IN and OUT parameters, and
     * methods for executing the call to a stored procedure.
     *
     * <P><B>Note:</B> This method is optimized for handling stored
     * procedure call statements. Some drivers may send the call
     * statement to the database when the method <code>prepareCall</code>
     * is done; others
     * may wait until the <code>CallableStatement</code> object
     * is executed. This has no
     * direct effect on users; however, it does affect which method
     * throws certain SQLExceptions.
     * <P>
     * Result sets created using the returned <code>CallableStatement</code>
     * object will by default be type <code>TYPE_FORWARD_ONLY</code>
     * and have a concurrency level of <code>CONCUR_READ_ONLY</code>.
     * The holdability of the created result sets can be determined by
     * calling {@link #getHoldability}.
     *
     * @param sql an SQL statement that may contain one or more '?'
     * parameter placeholders. Typically this statement is specified using JDBC
     * call escape syntax.
     * @return a new default <code>CallableStatement</code> object containing the
     * pre-compiled SQL statement
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    PreparedStatement prepareStatement(String sql)

    /**
     * Creates a <code>PreparedStatement</code> object for sending
     * parameterized SQL statements to the database.
     * <P>
     * A SQL statement with or without IN parameters can be
     * pre-compiled and stored in a <code>PreparedStatement</code> object. This
     * object can then be used to efficiently execute this statement
     * multiple times.
     *
     * <P><B>Note:</B> This method is optimized for handling
     * parametric SQL statements that benefit from precompilation. If
     * the driver supports precompilation,
     * the method <code>prepareStatement</code> will send
     * the statement to the database for precompilation. Some drivers
     * may not support precompilation. In this case, the statement may
     * not be sent to the database until the <code>PreparedStatement</code>
     * object is executed.  This has no direct effect on users; however, it does
     * affect which methods throw certain <code>SQLException</code> objects.
     * <P>
     * Result sets created using the returned <code>PreparedStatement</code>
     * object will by default be type <code>TYPE_FORWARD_ONLY</code>
     * and have a concurrency level of <code>CONCUR_READ_ONLY</code>.
     * The holdability of the created result sets can be determined by
     * calling {@link #getHoldability}.
     *
     * @param sql an SQL statement that may contain one or more '?' IN
     * parameter placeholders
     * @return a new default <code>PreparedStatement</code> object containing the
     * pre-compiled SQL statement
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
    Statement createStatement() throws SQLException;

    /**
     * Creates a <code>Statement</code> object for sending
     * SQL statements to the database.
     * SQL statements without parameters are normally
     * executed using <code>Statement</code> objects. If the same SQL statement
     * is executed many times, it may be more efficient to use a
     * <code>PreparedStatement</code> object.
     * <P>
     * Result sets created using the returned <code>Statement</code>
     * object will by default be type <code>TYPE_FORWARD_ONLY</code>
     * and have a concurrency level of <code>CONCUR_READ_ONLY</code>.
     * The holdability of the created result sets can be determined by
     * calling {@link #getHoldability}.
     *
     * @return a new default <code>Statement</code> object
     * @exception SQLException if a database access error occurs
     * or this method is called on a closed connection
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Connection.java
public interface Connection  extends Wrapper, AutoCloseable {

/**
 * <P>A connection (session) with a specific
 * database. SQL statements are executed and results are returned
 * within the context of a connection.
 * <P>
 * A <code>Connection</code> object's database is able to provide information
 * describing its tables, its supported SQL grammar, its stored
 * procedures, the capabilities of this connection, and so on. This
 * information is obtained with the <code>getMetaData</code> method.
 *
 * <P><B>Note:</B> When configuring a <code>Connection</code>, JDBC applications
 *  should use the appropriate <code>Connection</code> method such as
 *  <code>setAutoCommit</code> or <code>setTransactionIsolation</code>.
 *  Applications should not invoke SQL commands directly to change the connection's
 *   configuration when there is a JDBC method available.  By default a <code>Connection</code> object is in
 * auto-commit mode, which means that it automatically commits changes
 * after executing each statement. If auto-commit mode has been
 * disabled, the method <code>commit</code> must be called explicitly in
 * order to commit changes; otherwise, database changes will not be saved.
 * <P>
 * A new <code>Connection</code> object created using the JDBC 2.1 core API
 * has an initially empty type map associated with it. A user may enter a
 * custom mapping for a UDT in this type map.
 * When a UDT is retrieved from a data source with the
 * method <code>ResultSet.getObject</code>, the <code>getObject</code> method
 * will check the connection's type map to see if there is an entry for that
 * UDT.  If so, the <code>getObject</code> method will map the UDT to the
 * class indicated.  If there is no entry, the UDT will be mapped using the
 * standard mapping.
 * <p>
 * A user may create a new type map, which is a <code>java.util.Map</code>
 * object, make an entry in it, and pass it to the <code>java.sql</code>
 * methods that can perform custom mapping.  In this case, the method
 * will use the given type map instead of the one associated with
 * the connection.
 * <p>
 * For example, the following code fragment specifies that the SQL
 * type <code>ATHLETES</code> will be mapped to the class
 * <code>Athletes</code> in the Java programming language.
 * The code fragment retrieves the type map for the <code>Connection
 * </code> object <code>con</code>, inserts the entry into it, and then sets
 * the type map with the new entry as the connection's type map.
 * <pre>
 *      java.util.Map map = con.getTypeMap();
 *      map.put("mySchemaName.ATHLETES", Class.forName("Athletes"));
 *      con.setTypeMap(map);
 * </pre>
 *
 * @see DriverManager#getConnection
 * @see Statement
 * @see ResultSet
 * @see DatabaseMetaData
 */
