_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/UnsolicitedNotification.java
    public NamingException getException();

    /**
     * Retrieves the exception as constructed using information
     * sent by the server.
     * @return A possibly null exception as constructed using information
     * sent by the server. If null, a "success" status was indicated by
     * the server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/UnsolicitedNotification.java
public interface UnsolicitedNotification extends ExtendedResponse, HasControls {

/**
 * This interface represents an unsolicited notification as defined in
 * <A HREF="http://www.ietf.org/rfc/rfc2251.txt">RFC 2251</A>.
 * An unsolicited notification is sent by the LDAP server to the LDAP
 * client without any provocation from the client.
 * Its format is that of an extended response (<tt>ExtendedResponse</tt>).
 *
 * @author Rosanna Lee
 * @author Scott Seligman
 * @author Vincent Ryan
 *
 * @see ExtendedResponse
 * @see UnsolicitedNotificationEvent
 * @see UnsolicitedNotificationListener
 * @since 1.3
 */
