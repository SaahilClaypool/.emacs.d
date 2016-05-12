_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/PagedResultsControl.java
    public PagedResultsControl(int pageSize, byte[] cookie,
        boolean criticality) throws IOException {

    /**
     * Constructs a control to set the number of entries to be returned per
     * page of results. The cookie is provided by the server and may be
     * obtained from the paged-results response control.
     * <p>
     * A sequence of paged-results can be abandoned by setting the pageSize
     * to zero and setting the cookie to the last cookie received from the
     * server.
     *
     * @param   pageSize        The number of entries to return in a page.
     * @param   cookie          A possibly null server-generated cookie.
     * @param   criticality     If true then the server must honor the control
     *                          and return search results as indicated by
     *                          pageSize or refuse to perform the search.
     *                          If false, then the server need not honor the
     *                          control.
     * @exception IOException   If an error was encountered while encoding the
     *                          supplied arguments into a control.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/PagedResultsControl.java
    public PagedResultsControl(int pageSize, boolean criticality)

    /**
     * Constructs a control to set the number of entries to be returned per
     * page of results.
     *
     * @param   pageSize        The number of entries to return in a page.
     * @param   criticality     If true then the server must honor the control
     *                          and return search results as indicated by
     *                          pageSize or refuse to perform the search.
     *                          If false, then the server need not honor the
     *                          control.
     * @exception IOException   If an error was encountered while encoding the
     *                          supplied arguments into a control.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/PagedResultsControl.java
    public static final String OID = "1.2.840.113556.1.4.319";

    /**
     * The paged-results control's assigned object identifier
     * is 1.2.840.113556.1.4.319.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/PagedResultsControl.java
final public class PagedResultsControl extends BasicControl {

/**
 * Requests that the results of a search operation be returned by the LDAP
 * server in batches of a specified size.
 * The requestor controls the rate at which batches are returned by the rate
 * at which it invokes search operations.
 * <p>
 * The following code sample shows how the class may be used:
 * <pre>{@code
 *
 *     // Open an LDAP association
 *     LdapContext ctx = new InitialLdapContext();
 *
 *     // Activate paged results
 *     int pageSize = 20; // 20 entries per page
 *     byte[] cookie = null;
 *     int total;
 *     ctx.setRequestControls(new Control[]{
 *         new PagedResultsControl(pageSize, Control.CRITICAL) });
 *
 *     do {
 *         // Perform the search
 *         NamingEnumeration results =
 *             ctx.search("", "(objectclass=*)", new SearchControls());
 *
 *         // Iterate over a batch of search results
 *         while (results != null && results.hasMore()) {
 *             // Display an entry
 *             SearchResult entry = (SearchResult)results.next();
 *             System.out.println(entry.getName());
 *             System.out.println(entry.getAttributes());
 *
 *             // Handle the entry's response controls (if any)
 *             if (entry instanceof HasControls) {
 *                 // ((HasControls)entry).getControls();
 *             }
 *         }
 *         // Examine the paged results control response
 *         Control[] controls = ctx.getResponseControls();
 *         if (controls != null) {
 *             for (int i = 0; i < controls.length; i++) {
 *                 if (controls[i] instanceof PagedResultsResponseControl) {
 *                     PagedResultsResponseControl prrc =
 *                         (PagedResultsResponseControl)controls[i];
 *                     total = prrc.getResultSize();
 *                     cookie = prrc.getCookie();
 *                 } else {
 *                     // Handle other response controls (if any)
 *                 }
 *             }
 *         }
 *
 *         // Re-activate paged results
 *         ctx.setRequestControls(new Control[]{
 *             new PagedResultsControl(pageSize, cookie, Control.CRITICAL) });
 *     } while (cookie != null);
 *
 *     // Close the LDAP association
 *     ctx.close();
 *     ...
 *
 * } </pre>
 * <p>
 * This class implements the LDAPv3 Control for paged-results as defined in
 * <a href="http://www.ietf.org/rfc/rfc2696.txt">RFC 2696</a>.
 *
 * The control's value has the following ASN.1 definition:
 * <pre>{@code
 *
 *     realSearchControlValue ::= SEQUENCE {
 *         size      INTEGER (0..maxInt),
 *                           -- requested page size from client
 *                           -- result set size estimate from server
 *         cookie    OCTET STRING
 *     }
 *
 * }</pre>
 *
 * @since 1.5
 * @see PagedResultsResponseControl
 * @author Vincent Ryan
 */
