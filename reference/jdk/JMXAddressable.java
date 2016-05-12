_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/remote/JMXAddressable.java
public interface JMXAddressable {

/**
 * <p>Implemented by objects that can have a {@code JMXServiceURL} address.
 * All {@link JMXConnectorServer} objects implement this interface.
 * Depending on the connector implementation, a {@link JMXConnector}
 * object may implement this interface too.  {@code JMXConnector}
 * objects for the RMI Connector are instances of
 * {@link javax.management.remote.rmi.RMIConnector RMIConnector} which
 * implements this interface.</p>
 *
 * <p>An object implementing this interface might not have an address
 * at a given moment.  This is indicated by a null return value from
 * {@link #getAddress()}.</p>
 *
 * @since 1.6
 */
