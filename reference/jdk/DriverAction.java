_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/DriverAction.java
public interface DriverAction {

/**
 * An interface that must be implemented when a {@linkplain Driver} wants to be
 * notified by {@code DriverManager}.
 *<P>
 * A {@code DriverAction} implementation is not intended to be used
 * directly by applications. A JDBC Driver  may choose
 * to create its {@code DriverAction} implementation in a private class
 * to avoid it being called directly.
 * <p>
 * The JDBC driver's static initialization block must call
 * {@linkplain DriverManager#registerDriver(java.sql.Driver, java.sql.DriverAction) } in order
 * to inform {@code DriverManager} which {@code DriverAction} implementation to
 * call when the JDBC driver is de-registered.
 * @since 1.8
 */
