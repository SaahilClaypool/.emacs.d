_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/ManageReferralControl.java
    public ManageReferralControl(boolean criticality) {

    /**
     * Constructs a ManageReferral control.
     *
     * @param   criticality The control's criticality setting.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/ManageReferralControl.java
    public ManageReferralControl() {

    /**
     * Constructs a critical ManageReferral control.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/ManageReferralControl.java
    public static final String OID = "2.16.840.1.113730.3.4.2";

    /**
     * The ManageReferral control's assigned object identifier
     * is 2.16.840.1.113730.3.4.2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/ManageReferralControl.java
final public class ManageReferralControl extends BasicControl {

/**
 * Requests that referral and other special LDAP objects be manipulated
 * as normal LDAP objects. It enables the requestor to interrogate or
 * update such objects.
 *<p>
 * This class implements the LDAPv3 Request Control for ManageDsaIT
 * as defined in
 * <a href="http://www.ietf.org/rfc/rfc3296.txt">RFC 3296</a>.
 *
 * The control has no control value.
 *
 * @since 1.5
 * @author Vincent Ryan
 */
