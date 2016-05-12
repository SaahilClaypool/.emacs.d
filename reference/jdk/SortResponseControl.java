_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/SortResponseControl.java
    public NamingException getException() {

    /**
     * Retrieves the NamingException appropriate for the result code.
     *
     * @return A NamingException or null if the result code indicates
     *         success.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/SortResponseControl.java
    public String getAttributeID() {

    /**
     * Retrieves the ID of the attribute that caused the sort to fail.
     * Returns null if no ID was returned by the server.
     *
     * @return The possibly null ID of the bad attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/SortResponseControl.java
    public int getResultCode() {

    /**
     * Retrieves the LDAP result code of the sort operation.
     *
     * @return    The result code. A zero value indicates success.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/SortResponseControl.java
    public boolean isSorted() {

    /**
     * Determines if the search results have been successfully sorted.
     * If an error occurred during sorting a NamingException is thrown.
     *
     * @return    true if the search results have been sorted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/SortResponseControl.java
    public SortResponseControl(String id, boolean criticality, byte[] value)

    /**
     * Constructs a control to indicate the outcome of a sort request.
     *
     * @param   id              The control's object identifier string.
     * @param   criticality     The control's criticality.
     * @param   value           The control's ASN.1 BER encoded value.
     *                          It is not cloned - any changes to value
     *                          will affect the contents of the control.
     * @exception               IOException if an error is encountered
     *                          while decoding the control's value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/SortResponseControl.java
    private String badAttrId = null;

    /**
     * The ID of the attribute that caused the sort to fail.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/SortResponseControl.java
    private int resultCode = 0;

    /**
     * The sort result code.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/SortResponseControl.java
    public static final String OID = "1.2.840.113556.1.4.474";

    /**
     * The server-side sort response control's assigned object identifier
     * is 1.2.840.113556.1.4.474.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/SortResponseControl.java
final public class SortResponseControl extends BasicControl {

/**
 * Indicates whether the requested sort of search results was successful or not.
 * When the result code indicates success then the results have been sorted as
 * requested. Otherwise the sort was unsuccessful and additional details
 * regarding the cause of the error may have been provided by the server.
 * <p>
 * The code sample in {@link SortControl} shows how this class may be used.
 * <p>
 * This class implements the LDAPv3 Response Control for server-side sorting
 * as defined in
 * <a href="http://www.ietf.org/rfc/rfc2891.txt">RFC 2891</a>.
 *
 * The control's value has the following ASN.1 definition:
 * <pre>
 *
 *     SortResult ::= SEQUENCE {
 *        sortResult  ENUMERATED {
 *            success                   (0), -- results are sorted
 *            operationsError           (1), -- server internal failure
 *            timeLimitExceeded         (3), -- timelimit reached before
 *                                           -- sorting was completed
 *            strongAuthRequired        (8), -- refused to return sorted
 *                                           -- results via insecure
 *                                           -- protocol
 *            adminLimitExceeded       (11), -- too many matching entries
 *                                           -- for the server to sort
 *            noSuchAttribute          (16), -- unrecognized attribute
 *                                           -- type in sort key
 *            inappropriateMatching    (18), -- unrecognized or inappro-
 *                                           -- priate matching rule in
 *                                           -- sort key
 *            insufficientAccessRights (50), -- refused to return sorted
 *                                           -- results to this client
 *            busy                     (51), -- too busy to process
 *            unwillingToPerform       (53), -- unable to sort
 *            other                    (80)
 *            },
 *      attributeType [0] AttributeType OPTIONAL }
 *
 * </pre>
 *
 * @since 1.5
 * @see SortControl
 * @author Vincent Ryan
 */
