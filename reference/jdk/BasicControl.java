_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/BasicControl.java
    public byte[] getEncodedValue() {

    /**
     * Retrieves the control's ASN.1 BER encoded value.
     * The result includes the BER tag and length for the control's value but
     * does not include the control's object identifier and criticality setting.
     *
     * @return A possibly null byte array representing the control's
     *          ASN.1 BER encoded value. It is not cloned - any changes to the
     *          returned value will affect the contents of the control.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/BasicControl.java
    public boolean isCritical() {

    /**
     * Determines the control's criticality.
     *
     * @return true if the control is critical; false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/BasicControl.java
    public String getID() {

    /**
     * Retrieves the control's object identifier string.
     *
     * @return The non-null object identifier string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/BasicControl.java
    public BasicControl(String id, boolean criticality, byte[] value) {

    /**
     * Constructs a control using the supplied arguments.
     *
     * @param   id              The control's object identifier string.
     * @param   criticality     The control's criticality.
     * @param   value           The control's ASN.1 BER encoded value.
     *                          It is not cloned - any changes to value
     *                          will affect the contents of the control.
     *                          It may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/BasicControl.java
    public BasicControl(String id) {

    /**
     * Constructs a non-critical control.
     *
     * @param   id      The control's object identifier string.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/BasicControl.java
    protected byte[] value = null;

    /**
     * The control's ASN.1 BER encoded value.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/BasicControl.java
    protected boolean criticality = false; // default

    /**
     * The control's criticality.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/BasicControl.java
    protected String id;

    /**
     * The control's object identifier string.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/BasicControl.java
public class BasicControl implements Control {

/**
 * This class provides a basic implementation of the <tt>Control</tt>
 * interface. It represents an LDAPv3 Control as defined in
 * <a href="http://www.ietf.org/rfc/rfc2251.txt">RFC 2251</a>.
 *
 * @since 1.5
 * @author Vincent Ryan
 */
