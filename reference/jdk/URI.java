_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isURIString(String p_uric) {

 /**
  * Determine whether a given string contains only URI characters (also
  * called "uric" in RFC 2396). uric consist of all reserved
  * characters, unreserved characters and escaped characters.
  *
  * @return true if the string is comprised of uric, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isPathCharacter (char p_char) {

 /**
  * Determine whether a char is a path character.
  *
  * @return true if the char is a path character, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isUserinfoCharacter (char p_char) {

 /**
  * Determine whether a char is a userinfo character.
  *
  * @return true if the char is a userinfo character, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isSchemeCharacter (char p_char) {

 /**
  * Determine whether a char is a scheme character.
  *
  * @return true if the char is a scheme character, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isURICharacter (char p_char) {

 /**
  * Determine whether a char is a URI character (reserved or
  * unreserved, not including '%' for escaped octets).
  *
  * @return true if the char is a URI character, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isUnreservedCharacter(char p_char) {

 /**
  * Determine whether a char is an unreserved character.
  *
  * @return true if the char is unreserved, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isReservedCharacter(char p_char) {

 /**
  * Determine whether a character is a reserved character:
  * ';', '/', '?', ':', '@', '&', '=', '+', '$', ',', '[', or ']'
  *
  * @return true if the string contains any reserved characters
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isAlphanum(char p_char) {

 /**
  * Determine whether a char is an alphanumeric: 0-9, a-z or A-Z
  *
  * @return true if the char is alphanumeric, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isAlpha(char p_char) {

 /**
  * Determine whether a char is an alphabetic character: a-z or A-Z
  *
  * @return true if the char is alphabetic, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isHex(char p_char) {

 /**
  * Determine whether a character is a hexadecimal character.
  *
  * @return true if the char is betweeen '0' and '9', 'a' and 'f'
  *         or 'A' and 'F', false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isDigit(char p_char) {

 /**
  * Determine whether a char is a digit.
  *
  * @return true if the char is betweeen '0' and '9', false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static int scanHexSequence (String address, int index, int end, int [] counter) {

  /**
   * Helper method for isWellFormedIPv6Reference which scans the
   * hex sequences of an IPv6 address. It returns the index of the
   * next character to scan in the address, or -1 if the string
   * cannot match a valid IPv6 address.
   *
   * @param address the string to be scanned
   * @param index the beginning index (inclusive)
   * @param end the ending index (exclusive)
   * @param counter a counter for the number of 16-bit sections read
   * in the address
   *
   * @return the index of the next character to scan, or -1 if the
   * string cannot match a valid IPv6 address
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static boolean isWellFormedIPv6Reference(String address) {

  /**
   * <p>Determines whether a string is an IPv6 reference as defined
   * by RFC 2732, where IPv6address is defined in RFC 2373. The
   * IPv6 address is parsed according to Section 2.2 of RFC 2373,
   * with the additional constraint that the address be composed of
   * 128 bits of information.</p>
   *
   * <p><code>IPv6reference = "[" IPv6address "]"</code></p>
   *
   * <p>Note: The BNF expressed in RFC 2373 Appendix B does not
   * accurately describe section 2.2, and was in fact removed from
   * RFC 3513, the successor of RFC 2373.</p>
   *
   * @return true if the string is a syntactically valid IPv6 reference
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static boolean isWellFormedIPv4Address(String address) {

  /**
   * <p>Determines whether a string is an IPv4 address as defined by
   * RFC 2373, and under the further constraint that it must be a 32-bit
   * address. Though not expressed in the grammar, in order to satisfy
   * the 32-bit address constraint, each segment of the address cannot
   * be greater than 255 (8 bits of information).</p>
   *
   * <p><code>IPv4address = 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT</code></p>
   *
   * @return true if the string is a syntactically valid IPv4 address
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static boolean isWellFormedAddress(String address) {

 /**
  * Determine whether a string is syntactically capable of representing
  * a valid IPv4 address, IPv6 reference or the domain name of a network host.
  * A valid IPv4 address consists of four decimal digit groups separated by a
  * '.'. Each group must consist of one to three digits. See RFC 2732 Section 3,
  * and RFC 2373 Section 2.2, for the definition of IPv6 references. A hostname
  * consists of domain labels (each of which must begin and end with an alphanumeric
  * but may contain '-') separated & by a '.'. See RFC 2396 Section 3.2.2.
  *
  * @return true if the string is a syntactically valid IPv4 address,
  * IPv6 reference or hostname
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static boolean isConformantSchemeName(String p_scheme) {

 /**
  * Determine whether a scheme conforms to the rules for a scheme name.
  * A scheme is conformant if it starts with an alphanumeric, and
  * contains only alphanumerics, '+','-' and '.'.
  *
  * @return true if the scheme is conformant, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public boolean isAbsoluteURI() {

  /**
   * Returns whether this URI represents an absolute URI.
   *
   * @return true if this URI represents an absolute URI, false
   *         otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public boolean isGenericURI() {

 /**
  * Get the indicator as to whether this URI uses the "generic URI"
  * syntax.
  *
  * @return true if this URI uses the "generic URI" syntax, false
  *         otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  @Override

 /**
  * Get the URI as a string specification. See RFC 2396 Section 5.2.
  *
  * @return the URI string specification
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  @Override

 /**
  * Determines if the passed-in Object is equivalent to this URI.
  *
  * @param p_test the Object to test for equality.
  *
  * @return true if p_test is a URI with all values equal to this
  *         URI, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setFragment(String p_fragment) throws MalformedURIException {

 /**
  * Set the fragment for this URI. A non-null value is valid only
  * if this is a URI conforming to the generic URI syntax and
  * the path value is not null.
  *
  * @param p_fragment the fragment for this URI
  *
  * @exception MalformedURIException if p_fragment is not null and this
  *                                  URI does not conform to the generic
  *                                  URI syntax or if the path is null
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setQueryString(String p_queryString) throws MalformedURIException {

 /**
  * Set the query string for this URI. A non-null value is valid only
  * if this is an URI conforming to the generic URI syntax and
  * the path value is not null.
  *
  * @param p_queryString the query string for this URI
  *
  * @exception MalformedURIException if p_queryString is not null and this
  *                                  URI does not conform to the generic
  *                                  URI syntax or if the path is null
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void appendPath(String p_addToPath)

 /**
  * Append to the end of the path of this URI. If the current path does
  * not end in a slash and the path to be appended does not begin with
  * a slash, a slash will be appended to the current path before the
  * new segment is added. Also, if the current path ends in a slash
  * and the new segment begins with a slash, the extra slash will be
  * removed before the new segment is appended.
  *
  * @param p_addToPath the new segment to be added to the current path
  *
  * @exception MalformedURIException if p_addToPath contains syntax
  *                                  errors
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setPath(String p_path) throws MalformedURIException {

 /**
  * Set the path for this URI. If the supplied path is null, then the
  * query string and fragment are set to null as well. If the supplied
  * path includes a query string and/or fragment, these fields will be
  * parsed and set as well. Note that, for URIs following the "generic
  * URI" syntax, the path specified should start with a slash.
  * For URIs that do not follow the generic URI syntax, this method
  * sets the scheme-specific part.
  *
  * @param p_path the path for this URI (may be null)
  *
  * @exception MalformedURIException if p_path contains invalid
  *                                  characters
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setRegBasedAuthority(String authority)

  /**
   * <p>Sets the registry based authority for this URI.</p>
   *
   * <p>Note: This method overwrites server based authority
   * if it previously existed in this URI.</p>
   *
   * @param authority the registry based authority for this URI
   *
   * @exception MalformedURIException it authority is not a
   * well formed registry based authority
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setPort(int p_port) throws MalformedURIException {

 /**
  * Set the port for this URI. -1 is used to indicate that the port is
  * not specified, otherwise valid port numbers are  between 0 and 65535.
  * If a valid port number is passed in and the host field is null,
  * an exception is thrown.
  *
  * @param p_port the port number for this URI
  *
  * @exception MalformedURIException if p_port is not -1 and not a
  *                                  valid port number
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setHost(String p_host) throws MalformedURIException {

 /**
  * <p>Set the host for this URI. If null is passed in, the userinfo
  * field is also set to null and the port is set to -1.</p>
  *
  * <p>Note: This method overwrites registry based authority if it
  * previously existed in this URI.</p>
  *
  * @param p_host the host for this URI
  *
  * @exception MalformedURIException if p_host is not a valid IP
  *                                  address or DNS hostname.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setUserinfo(String p_userinfo) throws MalformedURIException {

 /**
  * Set the userinfo for this URI. If a non-null value is passed in and
  * the host value is null, then an exception is thrown.
  *
  * @param p_userinfo the userinfo for this URI
  *
  * @exception MalformedURIException if p_userinfo contains invalid
  *                                  characters
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setScheme(String p_scheme) throws MalformedURIException {

 /**
  * Set the scheme for this URI. The scheme is converted to lowercase
  * before it is set.
  *
  * @param p_scheme the scheme for this URI (cannot be null)
  *
  * @exception MalformedURIException if p_scheme is not a conformant
  *                                  scheme name
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getFragment() {

 /**
  * Get the fragment for this URI.
  *
  * @return the fragment for this URI. Null is returned if there
  *         was no "#" in the URI spec, empty string if there was a
  *         "#" but no fragment following it.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getQueryString() {

 /**
  * Get the query string for this URI.
  *
  * @return the query string for this URI. Null is returned if there
  *         was no "?" in the URI spec, empty string if there was a
  *         "?" but no query string following it.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getPath() {

 /**
  * Get the path for this URI. Note that the value returned is the path
  * only and does not include the query string or fragment.
  *
  * @return the path for this URI.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getPath(boolean p_includeQueryString,
                        boolean p_includeFragment) {

 /**
  * Get the path for this URI (optionally with the query string and
  * fragment).
  *
  * @param p_includeQueryString if true (and query string is not null),
  *                             then a "?" followed by the query string
  *                             will be appended
  * @param p_includeFragment if true (and fragment is not null),
  *                             then a "#" followed by the fragment
  *                             will be appended
  *
  * @return the path for this URI possibly including the query string
  *         and fragment
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getAuthority() {

  /**
   * Get the authority for this URI.
   *
   * @return the authority
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getRegBasedAuthority() {

  /**
   * Get the registry based authority for this URI.
   *
   * @return the registry based authority (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public int getPort() {

 /**
  * Get the port for this URI.
  *
  * @return the port for this URI (-1 if not specified).
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getHost() {

  /**
  * Get the host for this URI.
  *
  * @return the host for this URI (null if not specified).
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getUserinfo() {

 /**
  * Get the userinfo for this URI.
  *
  * @return the userinfo for this URI (null if not specified).
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getSchemeSpecificPart() {

 /**
  * Get the scheme-specific part for this URI (everything following the
  * scheme and the first colon). See RFC 2396 Section 5.2 for spec.
  *
  * @return the scheme-specific part for this URI
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getScheme() {

 /**
  * Get the scheme for this URI.
  *
  * @return the scheme for this URI
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initializePath(String p_uriSpec, int p_nStartIndex)

 /**
  * Initialize the path for this URI from a URI string spec.
  *
  * @param p_uriSpec the URI specification (cannot be null)
  * @param p_nStartIndex the index to begin scanning from
  *
  * @exception MalformedURIException if p_uriSpec violates syntax rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private boolean isValidRegistryBasedAuthority(String authority) {

  /**
   * Determines whether the given string is a registry based authority.
   *
   * @param authority the authority component of a URI
   *
   * @return true if the given string is a registry based authority
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private boolean isValidServerBasedAuthority(String host, int port, String userinfo) {

  /**
   * Determines whether the components host, port, and user info
   * are valid as a server authority.
   *
   * @param host the host component of authority
   * @param port the port number component of authority
   * @param userinfo the user info component of authority
   *
   * @return true if the given host, port, and userinfo compose
   * a valid server authority
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
          // REVISIT: Remove this code.

          /** for (int i = 0; i < portStr.length(); i++) {
            if (!isDigit(portStr.charAt(i))) {
              throw new MalformedURIException(
                   portStr +
                   " is invalid. Port should only contain digits!");
            }
          }**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private boolean initializeAuthority(String p_uriSpec) {

 /**
  * Initialize the authority (either server or registry based)
  * for this URI from a URI string spec.
  *
  * @param p_uriSpec the URI specification (cannot be null)
  *
  * @return true if the given string matched server or registry
  * based authority
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initializeScheme(String p_uriSpec)

 /**
  * Initialize the scheme for this URI from a URI string spec.
  *
  * @param p_uriSpec the URI specification (cannot be null)
  *
  * @exception MalformedURIException if URI does not have a conformant
  *                                  scheme
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void absolutize(URI p_base) {

  /**
   * Absolutize URI with given base URI.
   *
   * @param p_base base URI for absolutization
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initialize(URI p_base, String p_uriSpec)

 /**
  * Initializes this URI from a base URI and a URI specification string.
  * See RFC 2396 Section 4 and Appendix B for specifications on parsing
  * the URI and Section 5 for specifications on resolving relative URIs
  * and relative paths.
  *
  * @param p_base the base URI (may be null if p_uriSpec is an absolute
  *               URI)
  * @param p_uriSpec the URI spec string which may be an absolute or
  *                  relative URI (can only be null/empty if p_base
  *                  is not null)
  *
  * @exception MalformedURIException if p_base is null and p_uriSpec
  *                                  is not an absolute URI or if
  *                                  p_uriSpec violates syntax rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initialize(URI p_base, String p_uriSpec, boolean allowNonAbsoluteURI)

  /**
   * Initializes this URI from a base URI and a URI specification string.
   * See RFC 2396 Section 4 and Appendix B for specifications on parsing
   * the URI and Section 5 for specifications on resolving relative URIs
   * and relative paths.
   *
   * @param p_base the base URI (may be null if p_uriSpec is an absolute
   *               URI)
   * @param p_uriSpec the URI spec string which may be an absolute or
   *                  relative URI (can only be null/empty if p_base
   *                  is not null)
   * @param allowNonAbsoluteURI true to permit non-absolute URIs,
   *                         in case of relative URI, false otherwise.
   *
   * @exception MalformedURIException if p_base is null and p_uriSpec
   *                                  is not an absolute URI or if
   *                                  p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initialize(URI p_other) {

 /**
  * Initialize all fields of this URI from another URI.
  *
  * @param p_other the URI to copy (cannot be null)
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_scheme, String p_userinfo,
             String p_host, int p_port, String p_path,
             String p_queryString, String p_fragment)

 /**
  * Construct a new URI that follows the generic URI syntax from its
  * component parts. Each component is validated for syntax and some
  * basic semantic checks are performed as well.  See the individual
  * setter methods for specifics.
  *
  * @param p_scheme the URI scheme (cannot be null or empty)
  * @param p_userinfo the URI userinfo (cannot be specified if host
  *                   is null)
  * @param p_host the hostname, IPv4 address or IPv6 reference for the URI
  * @param p_port the URI port (may be -1 for "unspecified"; cannot
  *               be specified if host is null)
  * @param p_path the URI path - if the path contains '?' or '#',
  *               then the query string and/or fragment will be
  *               set from the path; however, if the query and
  *               fragment are specified both in the path and as
  *               separate parameters, an exception is thrown
  * @param p_queryString the URI query string (cannot be specified
  *                      if path is null)
  * @param p_fragment the URI fragment (cannot be specified if path
  *                   is null)
  *
  * @exception MalformedURIException if any of the parameters violates
  *                                  syntax rules or semantic rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_scheme, String p_host, String p_path,
             String p_queryString, String p_fragment)

 /**
  * Construct a new URI that follows the generic URI syntax from its
  * component parts. Each component is validated for syntax and some
  * basic semantic checks are performed as well.  See the individual
  * setter methods for specifics.
  *
  * @param p_scheme the URI scheme (cannot be null or empty)
  * @param p_host the hostname, IPv4 address or IPv6 reference for the URI
  * @param p_path the URI path - if the path contains '?' or '#',
  *               then the query string and/or fragment will be
  *               set from the path; however, if the query and
  *               fragment are specified both in the path and as
  *               separate parameters, an exception is thrown
  * @param p_queryString the URI query string (cannot be specified
  *                      if path is null)
  * @param p_fragment the URI fragment (cannot be specified if path
  *                   is null)
  *
  * @exception MalformedURIException if any of the parameters violates
  *                                  syntax rules or semantic rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_scheme, String p_schemeSpecificPart)

 /**
  * Construct a new URI that does not follow the generic URI syntax.
  * Only the scheme and scheme-specific part (stored as the path) are
  * initialized.
  *
  * @param p_scheme the URI scheme (cannot be null or empty)
  * @param p_schemeSpecificPart the scheme-specific part (cannot be
  *                             null or empty)
  *
  * @exception MalformedURIException if p_scheme violates any
  *                                  syntax rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(URI p_base, String p_uriSpec, boolean allowNonAbsoluteURI) throws MalformedURIException {

  /**
   * Construct a new URI from a base URI and a URI specification string.
   * The URI specification string may be a relative URI.
   * Construct a relative URI if boolean is assigned to "true"
   * and p_uriSpec is not valid absolute URI and p_base is null
   * instead of throwing an exception.
   *
   * @param p_base the base URI (cannot be null if p_uriSpec is null or
   *               empty)
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty if p_base is null)
   * @param allowNonAbsoluteURI true to permit non-absolute URIs,
   *                            false otherwise.
   *
   * @exception MalformedURIException if p_uriSpec violates any syntax
   *                                  rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(URI p_base, String p_uriSpec) throws MalformedURIException {

 /**
  * Construct a new URI from a base URI and a URI specification string.
  * The URI specification string may be a relative URI.
  *
  * @param p_base the base URI (cannot be null if p_uriSpec is null or
  *               empty)
  * @param p_uriSpec the URI specification string (cannot be null or
  *                  empty if p_base is null)
  *
  * @exception MalformedURIException if p_uriSpec violates any syntax
  *                                  rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_uriSpec, boolean allowNonAbsoluteURI) throws MalformedURIException {

  /**
   * Construct a new URI from a URI specification string. If the
   * specification follows the "generic URI" syntax, (two slashes
   * following the first colon), the specification will be parsed
   * accordingly - setting the scheme, userinfo, host,port, path, query
   * string and fragment fields as necessary. If the specification does
   * not follow the "generic URI" syntax, the specification is parsed
   * into a scheme and scheme-specific part (stored as the path) only.
   * Construct a relative URI if boolean is assigned to "true"
   * and p_uriSpec is not valid absolute URI, instead of throwing an exception.
   *
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty)
   * @param allowNonAbsoluteURI true to permit non-absolute URIs,
   *                            false otherwise.
   *
   * @exception MalformedURIException if p_uriSpec violates any syntax
   *                                   rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_uriSpec) throws MalformedURIException {

 /**
  * Construct a new URI from a URI specification string. If the
  * specification follows the "generic URI" syntax, (two slashes
  * following the first colon), the specification will be parsed
  * accordingly - setting the scheme, userinfo, host,port, path, query
  * string and fragment fields as necessary. If the specification does
  * not follow the "generic URI" syntax, the specification is parsed
  * into a scheme and scheme-specific part (stored as the path) only.
  *
  * @param p_uriSpec the URI specification string (cannot be null or
  *                  empty)
  *
  * @exception MalformedURIException if p_uriSpec violates any syntax
  *                                   rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(URI p_other) {

 /**
  * Construct a new URI from another URI. All fields for this URI are
  * set equal to the fields of the URI passed in.
  *
  * @param p_other the URI to copy (cannot be null)
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI() {

  /**
  * Construct a new and uninitialized URI.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_fragment = null;

  /** If specified, stores the fragment for this URI; otherwise null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_queryString = null;

  /** If specified, stores the query string for this URI; otherwise
      null.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_path = null;

  /** If specified, stores the path for this URI; otherwise null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_regAuthority = null;

  /** If specified, stores the registry based authority for this URI; otherwise -1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private int m_port = -1;

  /** If specified, stores the port for this URI; otherwise -1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_host = null;

  /** If specified, stores the host for this URI; otherwise null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_userinfo = null;

  /** If specified, stores the userinfo for this URI; otherwise null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_scheme = null;

  /** Stores the scheme (usually the protocol) for this URI. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_PATH_CHARACTER = MASK_UNRESERVED_MASK | PATH_CHARACTERS;

  /** Mask for path characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_USERINFO_CHARACTER = MASK_UNRESERVED_MASK | USERINFO_CHARACTERS;

  /** Mask for userinfo characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_SCHEME_CHARACTER = MASK_ALPHA_NUMERIC | SCHEME_CHARACTERS;

  /** Mask for scheme characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_URI_CHARACTER = MASK_UNRESERVED_MASK | RESERVED_CHARACTERS;

  /** Mask for URI allowable characters except for % */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_UNRESERVED_MASK = MASK_ALPHA_NUMERIC | MARK_CHARACTERS;

  /** Mask for unreserved characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_ALPHA_NUMERIC = ASCII_ALPHA_CHARACTERS | ASCII_DIGIT_CHARACTERS;

  /** Mask for alpha-numeric characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int PATH_CHARACTERS = 0x80;

  /** Path characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int ASCII_HEX_CHARACTERS = 0x40;

  /** ASCII hex characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int ASCII_DIGIT_CHARACTERS = 0x20;

  /** ASCII digit characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int ASCII_ALPHA_CHARACTERS = 0x10;

  /** ASCII letter characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int USERINFO_CHARACTERS = 0x08;

  /** userinfo can be composed of unreserved, escaped and these
      characters: ;:&=+$, */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int SCHEME_CHARACTERS = 0x04;

  /** scheme can be composed of alphanumerics and these characters: +-. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MARK_CHARACTERS = 0x02;

  /** URI punctuation mark characters: -_.!~*'() - these, combined with
      alphanumerics, constitute the "unreserved" characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  /** reserved characters ;/?:@&=+$,[] */

  /**
   * Character Classes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  static final long serialVersionUID = 1601921774685357214L;

  /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
    public MalformedURIException(String p_msg) {

    /*****************************************************************
    * Constructs a <code>MalformedURIException</code> with the
    * specified detail message.
    *
    * @param p_msg the detail message.
    ******************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
    public MalformedURIException() {

   /******************************************************************
    * Constructs a <code>MalformedURIException</code> with no specified
    * detail message.
    ******************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
   static final long serialVersionUID = -6695054834342951930L;

   /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static class MalformedURIException extends IOException {

  /*******************************************************************
  * MalformedURIExceptions are thrown in the process of building a URI
  * or setting fields on a URI when an operation would result in an
  * invalid URI specification.
  *
  ********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
 public class URI implements Serializable {

/**********************************************************************
* A class to represent a Uniform Resource Identifier (URI). This class
* is designed to handle the parsing of URIs and provide access to
* the various components (scheme, host, port, userinfo, path, query
* string and fragment) that may constitute a URI.
* <p>
* Parsing of a URI specification is done according to the URI
* syntax described in
* <a href="http://www.ietf.org/rfc/rfc2396.txt?number=2396">RFC 2396</a>,
* and amended by
* <a href="http://www.ietf.org/rfc/rfc2732.txt?number=2732">RFC 2732</a>.
* <p>
* Every absolute URI consists of a scheme, followed by a colon (':'),
* followed by a scheme-specific part. For URIs that follow the
* "generic URI" syntax, the scheme-specific part begins with two
* slashes ("//") and may be followed by an authority segment (comprised
* of user information, host, and port), path segment, query segment
* and fragment. Note that RFC 2396 no longer specifies the use of the
* parameters segment and excludes the "user:password" syntax as part of
* the authority segment. If "user:password" appears in a URI, the entire
* user/password string is stored as userinfo.
* <p>
* For URIs that do not follow the "generic URI" syntax (e.g. mailto),
* the entire scheme-specific part is treated as the "path" portion
* of the URI.
* <p>
* Note that, unlike the java.net.URL class, this class does not provide
* any built-in network access functionality nor does it provide any
* scheme-specific functionality (for example, it does not know a
* default port for a specific scheme). Rather, it only knows the
* grammar and basic set of operations that can be applied to a URI.
*
*
**********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isURIString(String p_uric)

  /**
   * Determine whether a given string contains only URI characters (also
   * called "uric" in RFC 2396). uric consist of all reserved
   * characters, unreserved characters and escaped characters.
   *
   *
   * @param p_uric URI string
   * @return true if the string is comprised of uric, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isUnreservedCharacter(char p_char)

  /**
   * Determine whether a char is an unreserved character.
   *
   *
   * @param p_char the character to check
   * @return true if the char is unreserved, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isReservedCharacter(char p_char)

  /**
   * Determine whether a character is a reserved character:
   * ';', '/', '?', ':', '@', '&', '=', '+', '$' or ','
   *
   *
   * @param p_char the character to check
   * @return true if the string contains any reserved characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isAlphanum(char p_char)

  /**
   * Determine whether a char is an alphanumeric: 0-9, a-z or A-Z
   *
   *
   * @param p_char the character to check
   * @return true if the char is alphanumeric, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isAlpha(char p_char)

  /**
   * Determine whether a char is an alphabetic character: a-z or A-Z
   *
   *
   * @param p_char the character to check
   * @return true if the char is alphabetic, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isHex(char p_char)

  /**
   * Determine whether a character is a hexadecimal character.
   *
   *
   * @param p_char the character to check
   * @return true if the char is between '0' and '9', 'a' and 'f'
   *         or 'A' and 'F', false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isDigit(char p_char)

  /**
   * Determine whether a char is a digit.
   *
   *
   * @param p_char the character to check
   * @return true if the char is betweeen '0' and '9', false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public static boolean isWellFormedAddress(String p_address)

  /**
   * Determine whether a string is syntactically capable of representing
   * a valid IPv4 address or the domain name of a network host. A valid
   * IPv4 address consists of four decimal digit groups separated by a
   * '.'. A hostname consists of domain labels (each of which must
   * begin and end with an alphanumeric but may contain '-') separated
   * & by a '.'. See RFC 2396 Section 3.2.2.
   *
   *
   * @param p_address The address string to check
   * @return true if the string is a syntactically valid IPv4 address
   *              or hostname
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public static boolean isConformantSchemeName(String p_scheme)

  /**
   * Determine whether a scheme conforms to the rules for a scheme name.
   * A scheme is conformant if it starts with an alphanumeric, and
   * contains only alphanumerics, '+','-' and '.'.
   *
   *
   * @param p_scheme The sheme name to check
   * @return true if the scheme is conformant, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public boolean isGenericURI()

  /**
   * Get the indicator as to whether this URI uses the "generic URI"
   * syntax.
   *
   * @return true if this URI uses the "generic URI" syntax, false
   *         otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  @Override

  /**
   * Get the URI as a string specification. See RFC 2396 Section 5.2.
   *
   * @return the URI string specification
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  @Override

  /**
   * Determines if the passed-in Object is equivalent to this URI.
   *
   * @param p_test the Object to test for equality.
   *
   * @return true if p_test is a URI with all values equal to this
   *         URI, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setFragment(String p_fragment) throws MalformedURIException

  /**
   * Set the fragment for this URI. A non-null value is valid only
   * if this is a URI conforming to the generic URI syntax and
   * the path value is not null.
   *
   * @param p_fragment the fragment for this URI
   *
   * @throws MalformedURIException if p_fragment is not null and this
   *                                  URI does not conform to the generic
   *                                  URI syntax or if the path is null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setQueryString(String p_queryString)

  /**
   * Set the query string for this URI. A non-null value is valid only
   * if this is an URI conforming to the generic URI syntax and
   * the path value is not null.
   *
   * @param p_queryString the query string for this URI
   *
   * @throws MalformedURIException if p_queryString is not null and this
   *                                  URI does not conform to the generic
   *                                  URI syntax or if the path is null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void appendPath(String p_addToPath) throws MalformedURIException

  /**
   * Append to the end of the path of this URI. If the current path does
   * not end in a slash and the path to be appended does not begin with
   * a slash, a slash will be appended to the current path before the
   * new segment is added. Also, if the current path ends in a slash
   * and the new segment begins with a slash, the extra slash will be
   * removed before the new segment is appended.
   *
   * @param p_addToPath the new segment to be added to the current path
   *
   * @throws MalformedURIException if p_addToPath contains syntax
   *                                  errors
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setPath(String p_path) throws MalformedURIException

  /**
   * Set the path for this URI. If the supplied path is null, then the
   * query string and fragment are set to null as well. If the supplied
   * path includes a query string and/or fragment, these fields will be
   * parsed and set as well. Note that, for URIs following the "generic
   * URI" syntax, the path specified should start with a slash.
   * For URIs that do not follow the generic URI syntax, this method
   * sets the scheme-specific part.
   *
   * @param p_path the path for this URI (may be null)
   *
   * @throws MalformedURIException if p_path contains invalid
   *                                  characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setPort(int p_port) throws MalformedURIException

  /**
   * Set the port for this URI. -1 is used to indicate that the port is
   * not specified, otherwise valid port numbers are  between 0 and 65535.
   * If a valid port number is passed in and the host field is null,
   * an exception is thrown.
   *
   * @param p_port the port number for this URI
   *
   * @throws MalformedURIException if p_port is not -1 and not a
   *                                  valid port number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setHost(String p_host) throws MalformedURIException

  /**
   * Set the host for this URI. If null is passed in, the userinfo
   * field is also set to null and the port is set to -1.
   *
   * @param p_host the host for this URI
   *
   * @throws MalformedURIException if p_host is not a valid IP
   *                                  address or DNS hostname.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setUserinfo(String p_userinfo) throws MalformedURIException

  /**
   * Set the userinfo for this URI. If a non-null value is passed in and
   * the host value is null, then an exception is thrown.
   *
   * @param p_userinfo the userinfo for this URI
   *
   * @throws MalformedURIException if p_userinfo contains invalid
   *                                  characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setScheme(String p_scheme) throws MalformedURIException

  /**
   * Set the scheme for this URI. The scheme is converted to lowercase
   * before it is set.
   *
   * @param p_scheme the scheme for this URI (cannot be null)
   *
   * @throws MalformedURIException if p_scheme is not a conformant
   *                                  scheme name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getFragment()

  /**
   * Get the fragment for this URI.
   *
   * @return the fragment for this URI. Null is returned if there
   *         was no "#" in the URI spec, empty string if there was a
   *         "#" but no fragment following it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getQueryString()

  /**
   * Get the query string for this URI.
   *
   * @return the query string for this URI. Null is returned if there
   *         was no "?" in the URI spec, empty string if there was a
   *         "?" but no query string following it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getPath()

  /**
   * Get the path for this URI. Note that the value returned is the path
   * only and does not include the query string or fragment.
   *
   * @return the path for this URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getPath(boolean p_includeQueryString,
                        boolean p_includeFragment)

  /**
   * Get the path for this URI (optionally with the query string and
   * fragment).
   *
   * @param p_includeQueryString if true (and query string is not null),
   *                             then a "?" followed by the query string
   *                             will be appended
   * @param p_includeFragment if true (and fragment is not null),
   *                             then a "#" followed by the fragment
   *                             will be appended
   *
   * @return the path for this URI possibly including the query string
   *         and fragment
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public int getPort()

  /**
   * Get the port for this URI.
   *
   * @return the port for this URI (-1 if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getHost()

  /**
   * Get the host for this URI.
   *
   * @return the host for this URI (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getUserinfo()

  /**
   * Get the userinfo for this URI.
   *
   * @return the userinfo for this URI (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getSchemeSpecificPart()

  /**
   * Get the scheme-specific part for this URI (everything following the
   * scheme and the first colon). See RFC 2396 Section 5.2 for spec.
   *
   * @return the scheme-specific part for this URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getScheme()

  /**
   * Get the scheme for this URI.
   *
   * @return the scheme for this URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initializePath(String p_uriSpec) throws MalformedURIException

  /**
   * Initialize the path for this URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initializeAuthority(String p_uriSpec)

  /**
   * Initialize the authority (userinfo, host and port) for this
   * URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initializeScheme(String p_uriSpec) throws MalformedURIException

  /**
   * Initialize the scheme for this URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if URI does not have a conformant
   *                                  scheme
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initialize(URI p_base, String p_uriSpec)

  /**
   * Initializes this URI from a base URI and a URI specification string.
   * See RFC 2396 Section 4 and Appendix B for specifications on parsing
   * the URI and Section 5 for specifications on resolving relative URIs
   * and relative paths.
   *
   * @param p_base the base URI (may be null if p_uriSpec is an absolute
   *               URI)
   * @param p_uriSpec the URI spec string which may be an absolute or
   *                  relative URI (can only be null/empty if p_base
   *                  is not null)
   *
   * @throws MalformedURIException if p_base is null and p_uriSpec
   *                                  is not an absolute URI or if
   *                                  p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initialize(URI p_other)

  /**
   * Initialize all fields of this URI from another URI.
   *
   * @param p_other the URI to copy (cannot be null)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(String p_scheme, String p_userinfo, String p_host, int p_port, String p_path, String p_queryString, String p_fragment)

  /**
   * Construct a new URI that follows the generic URI syntax from its
   * component parts. Each component is validated for syntax and some
   * basic semantic checks are performed as well.  See the individual
   * setter methods for specifics.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_userinfo the URI userinfo (cannot be specified if host
   *                   is null)
   * @param p_host the hostname or IPv4 address for the URI
   * @param p_port the URI port (may be -1 for "unspecified"; cannot
   *               be specified if host is null)
   * @param p_path the URI path - if the path contains '?' or '#',
   *               then the query string and/or fragment will be
   *               set from the path; however, if the query and
   *               fragment are specified both in the path and as
   *               separate parameters, an exception is thrown
   * @param p_queryString the URI query string (cannot be specified
   *                      if path is null)
   * @param p_fragment the URI fragment (cannot be specified if path
   *                   is null)
   *
   * @throws MalformedURIException if any of the parameters violates
   *                                  syntax rules or semantic rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(String p_scheme, String p_host, String p_path, String p_queryString, String p_fragment)

  /**
   * Construct a new URI that follows the generic URI syntax from its
   * component parts. Each component is validated for syntax and some
   * basic semantic checks are performed as well.  See the individual
   * setter methods for specifics.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_host the hostname or IPv4 address for the URI
   * @param p_path the URI path - if the path contains '?' or '#',
   *               then the query string and/or fragment will be
   *               set from the path; however, if the query and
   *               fragment are specified both in the path and as
   *               separate parameters, an exception is thrown
   * @param p_queryString the URI query string (cannot be specified
   *                      if path is null)
   * @param p_fragment the URI fragment (cannot be specified if path
   *                   is null)
   *
   * @throws MalformedURIException if any of the parameters violates
   *                                  syntax rules or semantic rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(String p_scheme, String p_schemeSpecificPart)

  /**
   * Construct a new URI that does not follow the generic URI syntax.
   * Only the scheme and scheme-specific part (stored as the path) are
   * initialized.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_schemeSpecificPart the scheme-specific part (cannot be
   *                             null or empty)
   *
   * @throws MalformedURIException if p_scheme violates any
   *                                  syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(URI p_base, String p_uriSpec) throws MalformedURIException

  /**
   * Construct a new URI from a base URI and a URI specification string.
   * The URI specification string may be a relative URI.
   *
   * @param p_base the base URI (cannot be null if p_uriSpec is null or
   *               empty)
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty if p_base is null)
   *
   * @throws MalformedURIException if p_uriSpec violates any syntax
   *                                  rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(String p_uriSpec) throws MalformedURIException

  /**
   * Construct a new URI from a URI specification string. If the
   * specification follows the "generic URI" syntax, (two slashes
   * following the first colon), the specification will be parsed
   * accordingly - setting the scheme, userinfo, host,port, path, query
   * string and fragment fields as necessary. If the specification does
   * not follow the "generic URI" syntax, the specification is parsed
   * into a scheme and scheme-specific part (stored as the path) only.
   *
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty)
   *
   * @throws MalformedURIException if p_uriSpec violates any syntax
   *                                   rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(URI p_other)

  /**
   * Construct a new URI from another URI. All fields for this URI are
   * set equal to the fields of the URI passed in.
   *
   * @param p_other the URI to copy (cannot be null)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(){}

  /**
   * Construct a new and uninitialized URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean DEBUG = false;

  /** Indicate whether in DEBUG mode          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_fragment = null;

  /** If specified, stores the fragment for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_queryString = null;

  /**
   * If specified, stores the query string for this URI; otherwise
   *   null.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_path = null;

  /** If specified, stores the path for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private int m_port = -1;

  /** If specified, stores the port for this URI; otherwise -1.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_host = null;

  /** If specified, stores the host for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_userinfo = null;

  /** If specified, stores the userinfo for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_scheme = null;

  /** Stores the scheme (usually the protocol) for this URI.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static final String USERINFO_CHARACTERS = ";:&=+$,";

  /**
   * userinfo can be composed of unreserved, escaped and these
   *   characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static final String SCHEME_CHARACTERS = "+-.";

  /** scheme can be composed of alphanumerics and these characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static final String MARK_CHARACTERS = "-_.!~*'() ";

  /**
   * URI punctuation mark characters - these, combined with
   *   alphanumerics, constitute the "unreserved" characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static final String RESERVED_CHARACTERS = ";/?:@&=+$,";

  /** reserved characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
    public MalformedURIException(String p_msg)

    /**
     * Constructs a <code>MalformedURIException</code> with the
     * specified detail message.
     *
     * @param p_msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
    public MalformedURIException()

    /**
     * Constructs a <code>MalformedURIException</code> with no specified
     * detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public static class MalformedURIException extends IOException

  /**
   * MalformedURIExceptions are thrown in the process of building a URI
   * or setting fields on a URI when an operation would result in an
   * invalid URI specification.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
final class URI

/**
 * A class to represent a Uniform Resource Identifier (URI). This class
 * is designed to handle the parsing of URIs and provide access to
 * the various components (scheme, host, port, userinfo, path, query
 * string and fragment) that may constitute a URI.
 * <p>
 * Parsing of a URI specification is done according to the URI
 * syntax described in RFC 2396
 * <http://www.ietf.org/rfc/rfc2396.txt?number=2396>. Every URI consists
 * of a scheme, followed by a colon (':'), followed by a scheme-specific
 * part. For URIs that follow the "generic URI" syntax, the scheme-
 * specific part begins with two slashes ("//") and may be followed
 * by an authority segment (comprised of user information, host, and
 * port), path segment, query segment and fragment. Note that RFC 2396
 * no longer specifies the use of the parameters segment and excludes
 * the "user:password" syntax as part of the authority segment. If
 * "user:password" appears in a URI, the entire user/password string
 * is stored as userinfo.
 * <p>
 * For URIs that do not follow the "generic URI" syntax (e.g. mailto),
 * the entire scheme-specific part is treated as the "path" portion
 * of the URI.
 * <p>
 * Note that, unlike the java.net.URL class, this class does not provide
 * any built-in network access functionality nor does it provide any
 * scheme-specific functionality (for example, it does not know a
 * default port for a specific scheme). Rather, it only knows the
 * grammar and basic set of operations that can be applied to a URI.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * A minor change from the original is that this class no longer implements
 * Serializable, and the serialVersionUID magic field is dropped, and
 * the class is no longer "public".
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isURIString(String p_uric)

  /**
   * Determine whether a given string contains only URI characters (also
   * called "uric" in RFC 2396). uric consist of all reserved
   * characters, unreserved characters and escaped characters.
   *
   *
   * @param p_uric URI string
   * @return true if the string is comprised of uric, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isUnreservedCharacter(char p_char)

  /**
   * Determine whether a char is an unreserved character.
   *
   *
   * @param p_char the character to check
   * @return true if the char is unreserved, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isReservedCharacter(char p_char)

  /**
   * Determine whether a character is a reserved character:
   * ';', '/', '?', ':', '@', '&', '=', '+', '$' or ','
   *
   *
   * @param p_char the character to check
   * @return true if the string contains any reserved characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isAlphanum(char p_char)

  /**
   * Determine whether a char is an alphanumeric: 0-9, a-z or A-Z
   *
   *
   * @param p_char the character to check
   * @return true if the char is alphanumeric, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isAlpha(char p_char)

  /**
   * Determine whether a char is an alphabetic character: a-z or A-Z
   *
   *
   * @param p_char the character to check
   * @return true if the char is alphabetic, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isHex(char p_char)

  /**
   * Determine whether a character is a hexadecimal character.
   *
   *
   * @param p_char the character to check
   * @return true if the char is betweeen '0' and '9', 'a' and 'f'
   *         or 'A' and 'F', false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isDigit(char p_char)

  /**
   * Determine whether a char is a digit.
   *
   *
   * @param p_char the character to check
   * @return true if the char is betweeen '0' and '9', false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public static boolean isWellFormedAddress(String p_address)

  /**
   * Determine whether a string is syntactically capable of representing
   * a valid IPv4 address or the domain name of a network host. A valid
   * IPv4 address consists of four decimal digit groups separated by a
   * '.'. A hostname consists of domain labels (each of which must
   * begin and end with an alphanumeric but may contain '-') separated
   * & by a '.'. See RFC 2396 Section 3.2.2.
   *
   *
   * @param p_address The address string to check
   * @return true if the string is a syntactically valid IPv4 address
   *              or hostname
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public static boolean isConformantSchemeName(String p_scheme)

  /**
   * Determine whether a scheme conforms to the rules for a scheme name.
   * A scheme is conformant if it starts with an alphanumeric, and
   * contains only alphanumerics, '+','-' and '.'.
   *
   *
   * @param p_scheme The sheme name to check
   * @return true if the scheme is conformant, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public boolean isGenericURI()

  /**
   * Get the indicator as to whether this URI uses the "generic URI"
   * syntax.
   *
   * @return true if this URI uses the "generic URI" syntax, false
   *         otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  @Override

  /**
   * Get the URI as a string specification. See RFC 2396 Section 5.2.
   *
   * @return the URI string specification
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  @Override

  /**
   * Determines if the passed-in Object is equivalent to this URI.
   *
   * @param p_test the Object to test for equality.
   *
   * @return true if p_test is a URI with all values equal to this
   *         URI, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setFragment(String p_fragment) throws MalformedURIException

  /**
   * Set the fragment for this URI. A non-null value is valid only
   * if this is a URI conforming to the generic URI syntax and
   * the path value is not null.
   *
   * @param p_fragment the fragment for this URI
   *
   * @throws MalformedURIException if p_fragment is not null and this
   *                                  URI does not conform to the generic
   *                                  URI syntax or if the path is null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setQueryString(String p_queryString)

  /**
   * Set the query string for this URI. A non-null value is valid only
   * if this is an URI conforming to the generic URI syntax and
   * the path value is not null.
   *
   * @param p_queryString the query string for this URI
   *
   * @throws MalformedURIException if p_queryString is not null and this
   *                                  URI does not conform to the generic
   *                                  URI syntax or if the path is null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void appendPath(String p_addToPath) throws MalformedURIException

  /**
   * Append to the end of the path of this URI. If the current path does
   * not end in a slash and the path to be appended does not begin with
   * a slash, a slash will be appended to the current path before the
   * new segment is added. Also, if the current path ends in a slash
   * and the new segment begins with a slash, the extra slash will be
   * removed before the new segment is appended.
   *
   * @param p_addToPath the new segment to be added to the current path
   *
   * @throws MalformedURIException if p_addToPath contains syntax
   *                                  errors
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setPath(String p_path) throws MalformedURIException

  /**
   * Set the path for this URI. If the supplied path is null, then the
   * query string and fragment are set to null as well. If the supplied
   * path includes a query string and/or fragment, these fields will be
   * parsed and set as well. Note that, for URIs following the "generic
   * URI" syntax, the path specified should start with a slash.
   * For URIs that do not follow the generic URI syntax, this method
   * sets the scheme-specific part.
   *
   * @param p_path the path for this URI (may be null)
   *
   * @throws MalformedURIException if p_path contains invalid
   *                                  characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setPort(int p_port) throws MalformedURIException

  /**
   * Set the port for this URI. -1 is used to indicate that the port is
   * not specified, otherwise valid port numbers are  between 0 and 65535.
   * If a valid port number is passed in and the host field is null,
   * an exception is thrown.
   *
   * @param p_port the port number for this URI
   *
   * @throws MalformedURIException if p_port is not -1 and not a
   *                                  valid port number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setHost(String p_host) throws MalformedURIException

  /**
   * Set the host for this URI. If null is passed in, the userinfo
   * field is also set to null and the port is set to -1.
   *
   * @param p_host the host for this URI
   *
   * @throws MalformedURIException if p_host is not a valid IP
   *                                  address or DNS hostname.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setUserinfo(String p_userinfo) throws MalformedURIException

  /**
   * Set the userinfo for this URI. If a non-null value is passed in and
   * the host value is null, then an exception is thrown.
   *
   * @param p_userinfo the userinfo for this URI
   *
   * @throws MalformedURIException if p_userinfo contains invalid
   *                                  characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setScheme(String p_scheme) throws MalformedURIException

  /**
   * Set the scheme for this URI. The scheme is converted to lowercase
   * before it is set.
   *
   * @param p_scheme the scheme for this URI (cannot be null)
   *
   * @throws MalformedURIException if p_scheme is not a conformant
   *                                  scheme name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getFragment()

  /**
   * Get the fragment for this URI.
   *
   * @return the fragment for this URI. Null is returned if there
   *         was no "#" in the URI spec, empty string if there was a
   *         "#" but no fragment following it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getQueryString()

  /**
   * Get the query string for this URI.
   *
   * @return the query string for this URI. Null is returned if there
   *         was no "?" in the URI spec, empty string if there was a
   *         "?" but no query string following it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getPath()

  /**
   * Get the path for this URI. Note that the value returned is the path
   * only and does not include the query string or fragment.
   *
   * @return the path for this URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getPath(boolean p_includeQueryString,
                        boolean p_includeFragment)

  /**
   * Get the path for this URI (optionally with the query string and
   * fragment).
   *
   * @param p_includeQueryString if true (and query string is not null),
   *                             then a "?" followed by the query string
   *                             will be appended
   * @param p_includeFragment if true (and fragment is not null),
   *                             then a "#" followed by the fragment
   *                             will be appended
   *
   * @return the path for this URI possibly including the query string
   *         and fragment
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public int getPort()

  /**
   * Get the port for this URI.
   *
   * @return the port for this URI (-1 if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getHost()

  /**
   * Get the host for this URI.
   *
   * @return the host for this URI (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getUserinfo()

  /**
   * Get the userinfo for this URI.
   *
   * @return the userinfo for this URI (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getSchemeSpecificPart()

  /**
   * Get the scheme-specific part for this URI (everything following the
   * scheme and the first colon). See RFC 2396 Section 5.2 for spec.
   *
   * @return the scheme-specific part for this URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getScheme()

  /**
   * Get the scheme for this URI.
   *
   * @return the scheme for this URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initializePath(String p_uriSpec) throws MalformedURIException

  /**
   * Initialize the path for this URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initializeAuthority(String p_uriSpec)

  /**
   * Initialize the authority (userinfo, host and port) for this
   * URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initializeScheme(String p_uriSpec) throws MalformedURIException

  /**
   * Initialize the scheme for this URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if URI does not have a conformant
   *                                  scheme
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initialize(URI p_base, String p_uriSpec)

  /**
   * Initializes this URI from a base URI and a URI specification string.
   * See RFC 2396 Section 4 and Appendix B for specifications on parsing
   * the URI and Section 5 for specifications on resolving relative URIs
   * and relative paths.
   *
   * @param p_base the base URI (may be null if p_uriSpec is an absolute
   *               URI)
   * @param p_uriSpec the URI spec string which may be an absolute or
   *                  relative URI (can only be null/empty if p_base
   *                  is not null)
   *
   * @throws MalformedURIException if p_base is null and p_uriSpec
   *                                  is not an absolute URI or if
   *                                  p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initialize(URI p_other)

  /**
   * Initialize all fields of this URI from another URI.
   *
   * @param p_other the URI to copy (cannot be null)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(String p_scheme, String p_userinfo, String p_host, int p_port, String p_path, String p_queryString, String p_fragment)

  /**
   * Construct a new URI that follows the generic URI syntax from its
   * component parts. Each component is validated for syntax and some
   * basic semantic checks are performed as well.  See the individual
   * setter methods for specifics.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_userinfo the URI userinfo (cannot be specified if host
   *                   is null)
   * @param p_host the hostname or IPv4 address for the URI
   * @param p_port the URI port (may be -1 for "unspecified"; cannot
   *               be specified if host is null)
   * @param p_path the URI path - if the path contains '?' or '#',
   *               then the query string and/or fragment will be
   *               set from the path; however, if the query and
   *               fragment are specified both in the path and as
   *               separate parameters, an exception is thrown
   * @param p_queryString the URI query string (cannot be specified
   *                      if path is null)
   * @param p_fragment the URI fragment (cannot be specified if path
   *                   is null)
   *
   * @throws MalformedURIException if any of the parameters violates
   *                                  syntax rules or semantic rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(String p_scheme, String p_host, String p_path, String p_queryString, String p_fragment)

  /**
   * Construct a new URI that follows the generic URI syntax from its
   * component parts. Each component is validated for syntax and some
   * basic semantic checks are performed as well.  See the individual
   * setter methods for specifics.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_host the hostname or IPv4 address for the URI
   * @param p_path the URI path - if the path contains '?' or '#',
   *               then the query string and/or fragment will be
   *               set from the path; however, if the query and
   *               fragment are specified both in the path and as
   *               separate parameters, an exception is thrown
   * @param p_queryString the URI query string (cannot be specified
   *                      if path is null)
   * @param p_fragment the URI fragment (cannot be specified if path
   *                   is null)
   *
   * @throws MalformedURIException if any of the parameters violates
   *                                  syntax rules or semantic rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(String p_scheme, String p_schemeSpecificPart)

  /**
   * Construct a new URI that does not follow the generic URI syntax.
   * Only the scheme and scheme-specific part (stored as the path) are
   * initialized.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_schemeSpecificPart the scheme-specific part (cannot be
   *                             null or empty)
   *
   * @throws MalformedURIException if p_scheme violates any
   *                                  syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(URI p_base, String p_uriSpec) throws MalformedURIException

  /**
   * Construct a new URI from a base URI and a URI specification string.
   * The URI specification string may be a relative URI.
   *
   * @param p_base the base URI (cannot be null if p_uriSpec is null or
   *               empty)
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty if p_base is null)
   *
   * @throws MalformedURIException if p_uriSpec violates any syntax
   *                                  rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(String p_uriSpec) throws MalformedURIException

  /**
   * Construct a new URI from a URI specification string. If the
   * specification follows the "generic URI" syntax, (two slashes
   * following the first colon), the specification will be parsed
   * accordingly - setting the scheme, userinfo, host,port, path, query
   * string and fragment fields as necessary. If the specification does
   * not follow the "generic URI" syntax, the specification is parsed
   * into a scheme and scheme-specific part (stored as the path) only.
   *
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty)
   *
   * @throws MalformedURIException if p_uriSpec violates any syntax
   *                                   rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(URI p_other)

  /**
   * Construct a new URI from another URI. All fields for this URI are
   * set equal to the fields of the URI passed in.
   *
   * @param p_other the URI to copy (cannot be null)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(){}

  /**
   * Construct a new and uninitialized URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean DEBUG = false;

  /** Indicate whether in DEBUG mode          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_fragment = null;

  /** If specified, stores the fragment for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_queryString = null;

  /**
   * If specified, stores the query string for this URI; otherwise
   *   null.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_path = null;

  /** If specified, stores the path for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private int m_port = -1;

  /** If specified, stores the port for this URI; otherwise -1.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_host = null;

  /** If specified, stores the host for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_userinfo = null;

  /** If specified, stores the userinfo for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_scheme = null;

  /** Stores the scheme (usually the protocol) for this URI.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static final String USERINFO_CHARACTERS = ";:&=+$,";

  /**
   * userinfo can be composed of unreserved, escaped and these
   *   characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static final String SCHEME_CHARACTERS = "+-.";

  /** scheme can be composed of alphanumerics and these characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static final String MARK_CHARACTERS = "-_.!~*'() ";

  /**
   * URI punctuation mark characters - these, combined with
   *   alphanumerics, constitute the "unreserved" characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static final String RESERVED_CHARACTERS = ";/?:@&=+$,";

  /** reserved characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
    public MalformedURIException(String p_msg)

    /**
     * Constructs a <code>MalformedURIException</code> with the
     * specified detail message.
     *
     * @param p_msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
    public MalformedURIException()

    /**
     * Constructs a <code>MalformedURIException</code> with no specified
     * detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public static class MalformedURIException extends IOException

  /**
   * MalformedURIExceptions are thrown in the process of building a URI
   * or setting fields on a URI when an operation would result in an
   * invalid URI specification.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
public class URI implements Serializable

/**
 * A class to represent a Uniform Resource Identifier (URI). This class
 * is designed to handle the parsing of URIs and provide access to
 * the various components (scheme, host, port, userinfo, path, query
 * string and fragment) that may constitute a URI.
 * <p>
 * Parsing of a URI specification is done according to the URI
 * syntax described in RFC 2396
 * <http://www.ietf.org/rfc/rfc2396.txt?number=2396>. Every URI consists
 * of a scheme, followed by a colon (':'), followed by a scheme-specific
 * part. For URIs that follow the "generic URI" syntax, the scheme-
 * specific part begins with two slashes ("//") and may be followed
 * by an authority segment (comprised of user information, host, and
 * port), path segment, query segment and fragment. Note that RFC 2396
 * no longer specifies the use of the parameters segment and excludes
 * the "user:password" syntax as part of the authority segment. If
 * "user:password" appears in a URI, the entire user/password string
 * is stored as userinfo.
 * <p>
 * For URIs that do not follow the "generic URI" syntax (e.g. mailto),
 * the entire scheme-specific part is treated as the "path" portion
 * of the URI.
 * <p>
 * Note that, unlike the java.net.URL class, this class does not provide
 * any built-in network access functionality nor does it provide any
 * scheme-specific functionality (for example, it does not know a
 * default port for a specific scheme). Rather, it only knows the
 * grammar and basic set of operations that can be applied to a URI.
 *
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isURIString(String p_uric) {

 /**
  * Determine whether a given string contains only URI characters (also
  * called "uric" in RFC 2396). uric consist of all reserved
  * characters, unreserved characters and escaped characters.
  *
  * @return true if the string is comprised of uric, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isPathCharacter (char p_char) {

 /**
  * Determine whether a char is a path character.
  *
  * @return true if the char is a path character, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isUserinfoCharacter (char p_char) {

 /**
  * Determine whether a char is a userinfo character.
  *
  * @return true if the char is a userinfo character, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isSchemeCharacter (char p_char) {

 /**
  * Determine whether a char is a scheme character.
  *
  * @return true if the char is a scheme character, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isURICharacter (char p_char) {

 /**
  * Determine whether a char is a URI character (reserved or
  * unreserved, not including '%' for escaped octets).
  *
  * @return true if the char is a URI character, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isUnreservedCharacter(char p_char) {

 /**
  * Determine whether a char is an unreserved character.
  *
  * @return true if the char is unreserved, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isReservedCharacter(char p_char) {

 /**
  * Determine whether a character is a reserved character:
  * ';', '/', '?', ':', '@', '&', '=', '+', '$', ',', '[', or ']'
  *
  * @return true if the string contains any reserved characters
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isAlphanum(char p_char) {

 /**
  * Determine whether a char is an alphanumeric: 0-9, a-z or A-Z
  *
  * @return true if the char is alphanumeric, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isAlpha(char p_char) {

 /**
  * Determine whether a char is an alphabetic character: a-z or A-Z
  *
  * @return true if the char is alphabetic, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isHex(char p_char) {

 /**
  * Determine whether a character is a hexadecimal character.
  *
  * @return true if the char is betweeen '0' and '9', 'a' and 'f'
  *         or 'A' and 'F', false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static boolean isDigit(char p_char) {

 /**
  * Determine whether a char is a digit.
  *
  * @return true if the char is betweeen '0' and '9', false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static int scanHexSequence (String address, int index, int end, int [] counter) {

  /**
   * Helper method for isWellFormedIPv6Reference which scans the
   * hex sequences of an IPv6 address. It returns the index of the
   * next character to scan in the address, or -1 if the string
   * cannot match a valid IPv6 address.
   *
   * @param address the string to be scanned
   * @param index the beginning index (inclusive)
   * @param end the ending index (exclusive)
   * @param counter a counter for the number of 16-bit sections read
   * in the address
   *
   * @return the index of the next character to scan, or -1 if the
   * string cannot match a valid IPv6 address
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static boolean isWellFormedIPv6Reference(String address) {

  /**
   * <p>Determines whether a string is an IPv6 reference as defined
   * by RFC 2732, where IPv6address is defined in RFC 2373. The
   * IPv6 address is parsed according to Section 2.2 of RFC 2373,
   * with the additional constraint that the address be composed of
   * 128 bits of information.</p>
   *
   * <p><code>IPv6reference = "[" IPv6address "]"</code></p>
   *
   * <p>Note: The BNF expressed in RFC 2373 Appendix B does not
   * accurately describe section 2.2, and was in fact removed from
   * RFC 3513, the successor of RFC 2373.</p>
   *
   * @return true if the string is a syntactically valid IPv6 reference
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static boolean isWellFormedIPv4Address(String address) {

  /**
   * <p>Determines whether a string is an IPv4 address as defined by
   * RFC 2373, and under the further constraint that it must be a 32-bit
   * address. Though not expressed in the grammar, in order to satisfy
   * the 32-bit address constraint, each segment of the address cannot
   * be greater than 255 (8 bits of information).</p>
   *
   * <p><code>IPv4address = 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT "." 1*3DIGIT</code></p>
   *
   * @return true if the string is a syntactically valid IPv4 address
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static boolean isWellFormedAddress(String address) {

 /**
  * Determine whether a string is syntactically capable of representing
  * a valid IPv4 address, IPv6 reference or the domain name of a network host.
  * A valid IPv4 address consists of four decimal digit groups separated by a
  * '.'. Each group must consist of one to three digits. See RFC 2732 Section 3,
  * and RFC 2373 Section 2.2, for the definition of IPv6 references. A hostname
  * consists of domain labels (each of which must begin and end with an alphanumeric
  * but may contain '-') separated & by a '.'. See RFC 2396 Section 3.2.2.
  *
  * @return true if the string is a syntactically valid IPv4 address,
  * IPv6 reference or hostname
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static boolean isConformantSchemeName(String p_scheme) {

 /**
  * Determine whether a scheme conforms to the rules for a scheme name.
  * A scheme is conformant if it starts with an alphanumeric, and
  * contains only alphanumerics, '+','-' and '.'.
  *
  * @return true if the scheme is conformant, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public boolean isAbsoluteURI() {

  /**
   * Returns whether this URI represents an absolute URI.
   *
   * @return true if this URI represents an absolute URI, false
   *         otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public boolean isGenericURI() {

 /**
  * Get the indicator as to whether this URI uses the "generic URI"
  * syntax.
  *
  * @return true if this URI uses the "generic URI" syntax, false
  *         otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  @Override

 /**
  * Get the URI as a string specification. See RFC 2396 Section 5.2.
  *
  * @return the URI string specification
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  @Override

 /**
  * Determines if the passed-in Object is equivalent to this URI.
  *
  * @param p_test the Object to test for equality.
  *
  * @return true if p_test is a URI with all values equal to this
  *         URI, false otherwise
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setFragment(String p_fragment) throws MalformedURIException {

 /**
  * Set the fragment for this URI. A non-null value is valid only
  * if this is a URI conforming to the generic URI syntax and
  * the path value is not null.
  *
  * @param p_fragment the fragment for this URI
  *
  * @exception MalformedURIException if p_fragment is not null and this
  *                                  URI does not conform to the generic
  *                                  URI syntax or if the path is null
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setQueryString(String p_queryString) throws MalformedURIException {

 /**
  * Set the query string for this URI. A non-null value is valid only
  * if this is an URI conforming to the generic URI syntax and
  * the path value is not null.
  *
  * @param p_queryString the query string for this URI
  *
  * @exception MalformedURIException if p_queryString is not null and this
  *                                  URI does not conform to the generic
  *                                  URI syntax or if the path is null
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void appendPath(String p_addToPath)

 /**
  * Append to the end of the path of this URI. If the current path does
  * not end in a slash and the path to be appended does not begin with
  * a slash, a slash will be appended to the current path before the
  * new segment is added. Also, if the current path ends in a slash
  * and the new segment begins with a slash, the extra slash will be
  * removed before the new segment is appended.
  *
  * @param p_addToPath the new segment to be added to the current path
  *
  * @exception MalformedURIException if p_addToPath contains syntax
  *                                  errors
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setPath(String p_path) throws MalformedURIException {

 /**
  * Set the path for this URI. If the supplied path is null, then the
  * query string and fragment are set to null as well. If the supplied
  * path includes a query string and/or fragment, these fields will be
  * parsed and set as well. Note that, for URIs following the "generic
  * URI" syntax, the path specified should start with a slash.
  * For URIs that do not follow the generic URI syntax, this method
  * sets the scheme-specific part.
  *
  * @param p_path the path for this URI (may be null)
  *
  * @exception MalformedURIException if p_path contains invalid
  *                                  characters
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setRegBasedAuthority(String authority)

  /**
   * <p>Sets the registry based authority for this URI.</p>
   *
   * <p>Note: This method overwrites server based authority
   * if it previously existed in this URI.</p>
   *
   * @param authority the registry based authority for this URI
   *
   * @exception MalformedURIException it authority is not a
   * well formed registry based authority
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setPort(int p_port) throws MalformedURIException {

 /**
  * Set the port for this URI. -1 is used to indicate that the port is
  * not specified, otherwise valid port numbers are  between 0 and 65535.
  * If a valid port number is passed in and the host field is null,
  * an exception is thrown.
  *
  * @param p_port the port number for this URI
  *
  * @exception MalformedURIException if p_port is not -1 and not a
  *                                  valid port number
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setHost(String p_host) throws MalformedURIException {

 /**
  * <p>Set the host for this URI. If null is passed in, the userinfo
  * field is also set to null and the port is set to -1.</p>
  *
  * <p>Note: This method overwrites registry based authority if it
  * previously existed in this URI.</p>
  *
  * @param p_host the host for this URI
  *
  * @exception MalformedURIException if p_host is not a valid IP
  *                                  address or DNS hostname.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setUserinfo(String p_userinfo) throws MalformedURIException {

 /**
  * Set the userinfo for this URI. If a non-null value is passed in and
  * the host value is null, then an exception is thrown.
  *
  * @param p_userinfo the userinfo for this URI
  *
  * @exception MalformedURIException if p_userinfo contains invalid
  *                                  characters
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void setScheme(String p_scheme) throws MalformedURIException {

 /**
  * Set the scheme for this URI. The scheme is converted to lowercase
  * before it is set.
  *
  * @param p_scheme the scheme for this URI (cannot be null)
  *
  * @exception MalformedURIException if p_scheme is not a conformant
  *                                  scheme name
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getFragment() {

 /**
  * Get the fragment for this URI.
  *
  * @return the fragment for this URI. Null is returned if there
  *         was no "#" in the URI spec, empty string if there was a
  *         "#" but no fragment following it.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getQueryString() {

 /**
  * Get the query string for this URI.
  *
  * @return the query string for this URI. Null is returned if there
  *         was no "?" in the URI spec, empty string if there was a
  *         "?" but no query string following it.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getPath() {

 /**
  * Get the path for this URI. Note that the value returned is the path
  * only and does not include the query string or fragment.
  *
  * @return the path for this URI.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getPath(boolean p_includeQueryString,
                        boolean p_includeFragment) {

 /**
  * Get the path for this URI (optionally with the query string and
  * fragment).
  *
  * @param p_includeQueryString if true (and query string is not null),
  *                             then a "?" followed by the query string
  *                             will be appended
  * @param p_includeFragment if true (and fragment is not null),
  *                             then a "#" followed by the fragment
  *                             will be appended
  *
  * @return the path for this URI possibly including the query string
  *         and fragment
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getAuthority() {

  /**
   * Get the authority for this URI.
   *
   * @return the authority
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getRegBasedAuthority() {

  /**
   * Get the registry based authority for this URI.
   *
   * @return the registry based authority (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public int getPort() {

 /**
  * Get the port for this URI.
  *
  * @return the port for this URI (-1 if not specified).
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getHost() {

  /**
  * Get the host for this URI.
  *
  * @return the host for this URI (null if not specified).
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getUserinfo() {

 /**
  * Get the userinfo for this URI.
  *
  * @return the userinfo for this URI (null if not specified).
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getSchemeSpecificPart() {

 /**
  * Get the scheme-specific part for this URI (everything following the
  * scheme and the first colon). See RFC 2396 Section 5.2 for spec.
  *
  * @return the scheme-specific part for this URI
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public String getScheme() {

 /**
  * Get the scheme for this URI.
  *
  * @return the scheme for this URI
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initializePath(String p_uriSpec, int p_nStartIndex)

 /**
  * Initialize the path for this URI from a URI string spec.
  *
  * @param p_uriSpec the URI specification (cannot be null)
  * @param p_nStartIndex the index to begin scanning from
  *
  * @exception MalformedURIException if p_uriSpec violates syntax rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private boolean isValidRegistryBasedAuthority(String authority) {

  /**
   * Determines whether the given string is a registry based authority.
   *
   * @param authority the authority component of a URI
   *
   * @return true if the given string is a registry based authority
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private boolean isValidServerBasedAuthority(String host, int port, String userinfo) {

  /**
   * Determines whether the components host, port, and user info
   * are valid as a server authority.
   *
   * @param host the host component of authority
   * @param port the port number component of authority
   * @param userinfo the user info component of authority
   *
   * @return true if the given host, port, and userinfo compose
   * a valid server authority
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
          // REVISIT: Remove this code.

          /** for (int i = 0; i < portStr.length(); i++) {
            if (!isDigit(portStr.charAt(i))) {
              throw new MalformedURIException(
                   portStr +
                   " is invalid. Port should only contain digits!");
            }
          }**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private boolean initializeAuthority(String p_uriSpec) {

 /**
  * Initialize the authority (either server or registry based)
  * for this URI from a URI string spec.
  *
  * @param p_uriSpec the URI specification (cannot be null)
  *
  * @return true if the given string matched server or registry
  * based authority
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initializeScheme(String p_uriSpec)

 /**
  * Initialize the scheme for this URI from a URI string spec.
  *
  * @param p_uriSpec the URI specification (cannot be null)
  *
  * @exception MalformedURIException if URI does not have a conformant
  *                                  scheme
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public void absolutize(URI p_base) {

  /**
   * Absolutize URI with given base URI.
   *
   * @param p_base base URI for absolutization
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initialize(URI p_base, String p_uriSpec)

 /**
  * Initializes this URI from a base URI and a URI specification string.
  * See RFC 2396 Section 4 and Appendix B for specifications on parsing
  * the URI and Section 5 for specifications on resolving relative URIs
  * and relative paths.
  *
  * @param p_base the base URI (may be null if p_uriSpec is an absolute
  *               URI)
  * @param p_uriSpec the URI spec string which may be an absolute or
  *                  relative URI (can only be null/empty if p_base
  *                  is not null)
  *
  * @exception MalformedURIException if p_base is null and p_uriSpec
  *                                  is not an absolute URI or if
  *                                  p_uriSpec violates syntax rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initialize(URI p_base, String p_uriSpec, boolean allowNonAbsoluteURI)

  /**
   * Initializes this URI from a base URI and a URI specification string.
   * See RFC 2396 Section 4 and Appendix B for specifications on parsing
   * the URI and Section 5 for specifications on resolving relative URIs
   * and relative paths.
   *
   * @param p_base the base URI (may be null if p_uriSpec is an absolute
   *               URI)
   * @param p_uriSpec the URI spec string which may be an absolute or
   *                  relative URI (can only be null/empty if p_base
   *                  is not null)
   * @param allowNonAbsoluteURI true to permit non-absolute URIs,
   *                         in case of relative URI, false otherwise.
   *
   * @exception MalformedURIException if p_base is null and p_uriSpec
   *                                  is not an absolute URI or if
   *                                  p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private void initialize(URI p_other) {

 /**
  * Initialize all fields of this URI from another URI.
  *
  * @param p_other the URI to copy (cannot be null)
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_scheme, String p_userinfo,
             String p_host, int p_port, String p_path,
             String p_queryString, String p_fragment)

 /**
  * Construct a new URI that follows the generic URI syntax from its
  * component parts. Each component is validated for syntax and some
  * basic semantic checks are performed as well.  See the individual
  * setter methods for specifics.
  *
  * @param p_scheme the URI scheme (cannot be null or empty)
  * @param p_userinfo the URI userinfo (cannot be specified if host
  *                   is null)
  * @param p_host the hostname, IPv4 address or IPv6 reference for the URI
  * @param p_port the URI port (may be -1 for "unspecified"; cannot
  *               be specified if host is null)
  * @param p_path the URI path - if the path contains '?' or '#',
  *               then the query string and/or fragment will be
  *               set from the path; however, if the query and
  *               fragment are specified both in the path and as
  *               separate parameters, an exception is thrown
  * @param p_queryString the URI query string (cannot be specified
  *                      if path is null)
  * @param p_fragment the URI fragment (cannot be specified if path
  *                   is null)
  *
  * @exception MalformedURIException if any of the parameters violates
  *                                  syntax rules or semantic rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_scheme, String p_host, String p_path,
             String p_queryString, String p_fragment)

 /**
  * Construct a new URI that follows the generic URI syntax from its
  * component parts. Each component is validated for syntax and some
  * basic semantic checks are performed as well.  See the individual
  * setter methods for specifics.
  *
  * @param p_scheme the URI scheme (cannot be null or empty)
  * @param p_host the hostname, IPv4 address or IPv6 reference for the URI
  * @param p_path the URI path - if the path contains '?' or '#',
  *               then the query string and/or fragment will be
  *               set from the path; however, if the query and
  *               fragment are specified both in the path and as
  *               separate parameters, an exception is thrown
  * @param p_queryString the URI query string (cannot be specified
  *                      if path is null)
  * @param p_fragment the URI fragment (cannot be specified if path
  *                   is null)
  *
  * @exception MalformedURIException if any of the parameters violates
  *                                  syntax rules or semantic rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_scheme, String p_schemeSpecificPart)

 /**
  * Construct a new URI that does not follow the generic URI syntax.
  * Only the scheme and scheme-specific part (stored as the path) are
  * initialized.
  *
  * @param p_scheme the URI scheme (cannot be null or empty)
  * @param p_schemeSpecificPart the scheme-specific part (cannot be
  *                             null or empty)
  *
  * @exception MalformedURIException if p_scheme violates any
  *                                  syntax rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(URI p_base, String p_uriSpec, boolean allowNonAbsoluteURI) throws MalformedURIException {

  /**
   * Construct a new URI from a base URI and a URI specification string.
   * The URI specification string may be a relative URI.
   * Construct a relative URI if boolean is assigned to "true"
   * and p_uriSpec is not valid absolute URI and p_base is null
   * instead of throwing an exception.
   *
   * @param p_base the base URI (cannot be null if p_uriSpec is null or
   *               empty)
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty if p_base is null)
   * @param allowNonAbsoluteURI true to permit non-absolute URIs,
   *                            false otherwise.
   *
   * @exception MalformedURIException if p_uriSpec violates any syntax
   *                                  rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(URI p_base, String p_uriSpec) throws MalformedURIException {

 /**
  * Construct a new URI from a base URI and a URI specification string.
  * The URI specification string may be a relative URI.
  *
  * @param p_base the base URI (cannot be null if p_uriSpec is null or
  *               empty)
  * @param p_uriSpec the URI specification string (cannot be null or
  *                  empty if p_base is null)
  *
  * @exception MalformedURIException if p_uriSpec violates any syntax
  *                                  rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_uriSpec, boolean allowNonAbsoluteURI) throws MalformedURIException {

  /**
   * Construct a new URI from a URI specification string. If the
   * specification follows the "generic URI" syntax, (two slashes
   * following the first colon), the specification will be parsed
   * accordingly - setting the scheme, userinfo, host,port, path, query
   * string and fragment fields as necessary. If the specification does
   * not follow the "generic URI" syntax, the specification is parsed
   * into a scheme and scheme-specific part (stored as the path) only.
   * Construct a relative URI if boolean is assigned to "true"
   * and p_uriSpec is not valid absolute URI, instead of throwing an exception.
   *
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty)
   * @param allowNonAbsoluteURI true to permit non-absolute URIs,
   *                            false otherwise.
   *
   * @exception MalformedURIException if p_uriSpec violates any syntax
   *                                   rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(String p_uriSpec) throws MalformedURIException {

 /**
  * Construct a new URI from a URI specification string. If the
  * specification follows the "generic URI" syntax, (two slashes
  * following the first colon), the specification will be parsed
  * accordingly - setting the scheme, userinfo, host,port, path, query
  * string and fragment fields as necessary. If the specification does
  * not follow the "generic URI" syntax, the specification is parsed
  * into a scheme and scheme-specific part (stored as the path) only.
  *
  * @param p_uriSpec the URI specification string (cannot be null or
  *                  empty)
  *
  * @exception MalformedURIException if p_uriSpec violates any syntax
  *                                   rules
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI(URI p_other) {

 /**
  * Construct a new URI from another URI. All fields for this URI are
  * set equal to the fields of the URI passed in.
  *
  * @param p_other the URI to copy (cannot be null)
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public URI() {

  /**
  * Construct a new and uninitialized URI.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_fragment = null;

  /** If specified, stores the fragment for this URI; otherwise null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_queryString = null;

  /** If specified, stores the query string for this URI; otherwise
      null.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_path = null;

  /** If specified, stores the path for this URI; otherwise null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_regAuthority = null;

  /** If specified, stores the registry based authority for this URI; otherwise -1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private int m_port = -1;

  /** If specified, stores the port for this URI; otherwise -1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_host = null;

  /** If specified, stores the host for this URI; otherwise null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_userinfo = null;

  /** If specified, stores the userinfo for this URI; otherwise null */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private String m_scheme = null;

  /** Stores the scheme (usually the protocol) for this URI. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_PATH_CHARACTER = MASK_UNRESERVED_MASK | PATH_CHARACTERS;

  /** Mask for path characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_USERINFO_CHARACTER = MASK_UNRESERVED_MASK | USERINFO_CHARACTERS;

  /** Mask for userinfo characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_SCHEME_CHARACTER = MASK_ALPHA_NUMERIC | SCHEME_CHARACTERS;

  /** Mask for scheme characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_URI_CHARACTER = MASK_UNRESERVED_MASK | RESERVED_CHARACTERS;

  /** Mask for URI allowable characters except for % */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_UNRESERVED_MASK = MASK_ALPHA_NUMERIC | MARK_CHARACTERS;

  /** Mask for unreserved characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MASK_ALPHA_NUMERIC = ASCII_ALPHA_CHARACTERS | ASCII_DIGIT_CHARACTERS;

  /** Mask for alpha-numeric characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int PATH_CHARACTERS = 0x80;

  /** Path characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int ASCII_HEX_CHARACTERS = 0x40;

  /** ASCII hex characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int ASCII_DIGIT_CHARACTERS = 0x20;

  /** ASCII digit characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int ASCII_ALPHA_CHARACTERS = 0x10;

  /** ASCII letter characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int USERINFO_CHARACTERS = 0x08;

  /** userinfo can be composed of unreserved, escaped and these
      characters: ;:&=+$, */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int SCHEME_CHARACTERS = 0x04;

  /** scheme can be composed of alphanumerics and these characters: +-. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  private static final int MARK_CHARACTERS = 0x02;

  /** URI punctuation mark characters: -_.!~*'() - these, combined with
      alphanumerics, constitute the "unreserved" characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  /** reserved characters ;/?:@&=+$,[] */

  /**
   * Character Classes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  static final long serialVersionUID = 1601921774685357214L;

  /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
    public MalformedURIException(String p_msg) {

    /*****************************************************************
    * Constructs a <code>MalformedURIException</code> with the
    * specified detail message.
    *
    * @param p_msg the detail message.
    ******************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
    public MalformedURIException() {

   /******************************************************************
    * Constructs a <code>MalformedURIException</code> with no specified
    * detail message.
    ******************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
   static final long serialVersionUID = -6695054834342951930L;

   /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
  public static class MalformedURIException extends IOException {

  /*******************************************************************
  * MalformedURIExceptions are thrown in the process of building a URI
  * or setting fields on a URI when an operation would result in an
  * invalid URI specification.
  *
  ********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/URI.java
 public class URI implements Serializable {

/**********************************************************************
* A class to represent a Uniform Resource Identifier (URI). This class
* is designed to handle the parsing of URIs and provide access to
* the various components (scheme, host, port, userinfo, path, query
* string and fragment) that may constitute a URI.
* <p>
* Parsing of a URI specification is done according to the URI
* syntax described in
* <a href="http://www.ietf.org/rfc/rfc2396.txt?number=2396">RFC 2396</a>,
* and amended by
* <a href="http://www.ietf.org/rfc/rfc2732.txt?number=2732">RFC 2732</a>.
* <p>
* Every absolute URI consists of a scheme, followed by a colon (':'),
* followed by a scheme-specific part. For URIs that follow the
* "generic URI" syntax, the scheme-specific part begins with two
* slashes ("//") and may be followed by an authority segment (comprised
* of user information, host, and port), path segment, query segment
* and fragment. Note that RFC 2396 no longer specifies the use of the
* parameters segment and excludes the "user:password" syntax as part of
* the authority segment. If "user:password" appears in a URI, the entire
* user/password string is stored as userinfo.
* <p>
* For URIs that do not follow the "generic URI" syntax (e.g. mailto),
* the entire scheme-specific part is treated as the "path" portion
* of the URI.
* <p>
* Note that, unlike the java.net.URL class, this class does not provide
* any built-in network access functionality nor does it provide any
* scheme-specific functionality (for example, it does not know a
* default port for a specific scheme). Rather, it only knows the
* grammar and basic set of operations that can be applied to a URI.
*
*
**********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isURIString(String p_uric)

  /**
   * Determine whether a given string contains only URI characters (also
   * called "uric" in RFC 2396). uric consist of all reserved
   * characters, unreserved characters and escaped characters.
   *
   *
   * @param p_uric URI string
   * @return true if the string is comprised of uric, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isUnreservedCharacter(char p_char)

  /**
   * Determine whether a char is an unreserved character.
   *
   *
   * @param p_char the character to check
   * @return true if the char is unreserved, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isReservedCharacter(char p_char)

  /**
   * Determine whether a character is a reserved character:
   * ';', '/', '?', ':', '@', '&', '=', '+', '$' or ','
   *
   *
   * @param p_char the character to check
   * @return true if the string contains any reserved characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isAlphanum(char p_char)

  /**
   * Determine whether a char is an alphanumeric: 0-9, a-z or A-Z
   *
   *
   * @param p_char the character to check
   * @return true if the char is alphanumeric, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isAlpha(char p_char)

  /**
   * Determine whether a char is an alphabetic character: a-z or A-Z
   *
   *
   * @param p_char the character to check
   * @return true if the char is alphabetic, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isHex(char p_char)

  /**
   * Determine whether a character is a hexadecimal character.
   *
   *
   * @param p_char the character to check
   * @return true if the char is between '0' and '9', 'a' and 'f'
   *         or 'A' and 'F', false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean isDigit(char p_char)

  /**
   * Determine whether a char is a digit.
   *
   *
   * @param p_char the character to check
   * @return true if the char is betweeen '0' and '9', false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public static boolean isWellFormedAddress(String p_address)

  /**
   * Determine whether a string is syntactically capable of representing
   * a valid IPv4 address or the domain name of a network host. A valid
   * IPv4 address consists of four decimal digit groups separated by a
   * '.'. A hostname consists of domain labels (each of which must
   * begin and end with an alphanumeric but may contain '-') separated
   * & by a '.'. See RFC 2396 Section 3.2.2.
   *
   *
   * @param p_address The address string to check
   * @return true if the string is a syntactically valid IPv4 address
   *              or hostname
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public static boolean isConformantSchemeName(String p_scheme)

  /**
   * Determine whether a scheme conforms to the rules for a scheme name.
   * A scheme is conformant if it starts with an alphanumeric, and
   * contains only alphanumerics, '+','-' and '.'.
   *
   *
   * @param p_scheme The sheme name to check
   * @return true if the scheme is conformant, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public boolean isGenericURI()

  /**
   * Get the indicator as to whether this URI uses the "generic URI"
   * syntax.
   *
   * @return true if this URI uses the "generic URI" syntax, false
   *         otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  @Override

  /**
   * Get the URI as a string specification. See RFC 2396 Section 5.2.
   *
   * @return the URI string specification
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  @Override

  /**
   * Determines if the passed-in Object is equivalent to this URI.
   *
   * @param p_test the Object to test for equality.
   *
   * @return true if p_test is a URI with all values equal to this
   *         URI, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setFragment(String p_fragment) throws MalformedURIException

  /**
   * Set the fragment for this URI. A non-null value is valid only
   * if this is a URI conforming to the generic URI syntax and
   * the path value is not null.
   *
   * @param p_fragment the fragment for this URI
   *
   * @throws MalformedURIException if p_fragment is not null and this
   *                                  URI does not conform to the generic
   *                                  URI syntax or if the path is null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setQueryString(String p_queryString)

  /**
   * Set the query string for this URI. A non-null value is valid only
   * if this is an URI conforming to the generic URI syntax and
   * the path value is not null.
   *
   * @param p_queryString the query string for this URI
   *
   * @throws MalformedURIException if p_queryString is not null and this
   *                                  URI does not conform to the generic
   *                                  URI syntax or if the path is null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void appendPath(String p_addToPath) throws MalformedURIException

  /**
   * Append to the end of the path of this URI. If the current path does
   * not end in a slash and the path to be appended does not begin with
   * a slash, a slash will be appended to the current path before the
   * new segment is added. Also, if the current path ends in a slash
   * and the new segment begins with a slash, the extra slash will be
   * removed before the new segment is appended.
   *
   * @param p_addToPath the new segment to be added to the current path
   *
   * @throws MalformedURIException if p_addToPath contains syntax
   *                                  errors
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setPath(String p_path) throws MalformedURIException

  /**
   * Set the path for this URI. If the supplied path is null, then the
   * query string and fragment are set to null as well. If the supplied
   * path includes a query string and/or fragment, these fields will be
   * parsed and set as well. Note that, for URIs following the "generic
   * URI" syntax, the path specified should start with a slash.
   * For URIs that do not follow the generic URI syntax, this method
   * sets the scheme-specific part.
   *
   * @param p_path the path for this URI (may be null)
   *
   * @throws MalformedURIException if p_path contains invalid
   *                                  characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setPort(int p_port) throws MalformedURIException

  /**
   * Set the port for this URI. -1 is used to indicate that the port is
   * not specified, otherwise valid port numbers are  between 0 and 65535.
   * If a valid port number is passed in and the host field is null,
   * an exception is thrown.
   *
   * @param p_port the port number for this URI
   *
   * @throws MalformedURIException if p_port is not -1 and not a
   *                                  valid port number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setHost(String p_host) throws MalformedURIException

  /**
   * Set the host for this URI. If null is passed in, the userinfo
   * field is also set to null and the port is set to -1.
   *
   * @param p_host the host for this URI
   *
   * @throws MalformedURIException if p_host is not a valid IP
   *                                  address or DNS hostname.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setUserinfo(String p_userinfo) throws MalformedURIException

  /**
   * Set the userinfo for this URI. If a non-null value is passed in and
   * the host value is null, then an exception is thrown.
   *
   * @param p_userinfo the userinfo for this URI
   *
   * @throws MalformedURIException if p_userinfo contains invalid
   *                                  characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public void setScheme(String p_scheme) throws MalformedURIException

  /**
   * Set the scheme for this URI. The scheme is converted to lowercase
   * before it is set.
   *
   * @param p_scheme the scheme for this URI (cannot be null)
   *
   * @throws MalformedURIException if p_scheme is not a conformant
   *                                  scheme name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getFragment()

  /**
   * Get the fragment for this URI.
   *
   * @return the fragment for this URI. Null is returned if there
   *         was no "#" in the URI spec, empty string if there was a
   *         "#" but no fragment following it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getQueryString()

  /**
   * Get the query string for this URI.
   *
   * @return the query string for this URI. Null is returned if there
   *         was no "?" in the URI spec, empty string if there was a
   *         "?" but no query string following it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getPath()

  /**
   * Get the path for this URI. Note that the value returned is the path
   * only and does not include the query string or fragment.
   *
   * @return the path for this URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getPath(boolean p_includeQueryString,
                        boolean p_includeFragment)

  /**
   * Get the path for this URI (optionally with the query string and
   * fragment).
   *
   * @param p_includeQueryString if true (and query string is not null),
   *                             then a "?" followed by the query string
   *                             will be appended
   * @param p_includeFragment if true (and fragment is not null),
   *                             then a "#" followed by the fragment
   *                             will be appended
   *
   * @return the path for this URI possibly including the query string
   *         and fragment
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public int getPort()

  /**
   * Get the port for this URI.
   *
   * @return the port for this URI (-1 if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getHost()

  /**
   * Get the host for this URI.
   *
   * @return the host for this URI (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getUserinfo()

  /**
   * Get the userinfo for this URI.
   *
   * @return the userinfo for this URI (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getSchemeSpecificPart()

  /**
   * Get the scheme-specific part for this URI (everything following the
   * scheme and the first colon). See RFC 2396 Section 5.2 for spec.
   *
   * @return the scheme-specific part for this URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public String getScheme()

  /**
   * Get the scheme for this URI.
   *
   * @return the scheme for this URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initializePath(String p_uriSpec) throws MalformedURIException

  /**
   * Initialize the path for this URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initializeAuthority(String p_uriSpec)

  /**
   * Initialize the authority (userinfo, host and port) for this
   * URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initializeScheme(String p_uriSpec) throws MalformedURIException

  /**
   * Initialize the scheme for this URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if URI does not have a conformant
   *                                  scheme
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initialize(URI p_base, String p_uriSpec)

  /**
   * Initializes this URI from a base URI and a URI specification string.
   * See RFC 2396 Section 4 and Appendix B for specifications on parsing
   * the URI and Section 5 for specifications on resolving relative URIs
   * and relative paths.
   *
   * @param p_base the base URI (may be null if p_uriSpec is an absolute
   *               URI)
   * @param p_uriSpec the URI spec string which may be an absolute or
   *                  relative URI (can only be null/empty if p_base
   *                  is not null)
   *
   * @throws MalformedURIException if p_base is null and p_uriSpec
   *                                  is not an absolute URI or if
   *                                  p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private void initialize(URI p_other)

  /**
   * Initialize all fields of this URI from another URI.
   *
   * @param p_other the URI to copy (cannot be null)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(String p_scheme, String p_userinfo, String p_host, int p_port, String p_path, String p_queryString, String p_fragment)

  /**
   * Construct a new URI that follows the generic URI syntax from its
   * component parts. Each component is validated for syntax and some
   * basic semantic checks are performed as well.  See the individual
   * setter methods for specifics.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_userinfo the URI userinfo (cannot be specified if host
   *                   is null)
   * @param p_host the hostname or IPv4 address for the URI
   * @param p_port the URI port (may be -1 for "unspecified"; cannot
   *               be specified if host is null)
   * @param p_path the URI path - if the path contains '?' or '#',
   *               then the query string and/or fragment will be
   *               set from the path; however, if the query and
   *               fragment are specified both in the path and as
   *               separate parameters, an exception is thrown
   * @param p_queryString the URI query string (cannot be specified
   *                      if path is null)
   * @param p_fragment the URI fragment (cannot be specified if path
   *                   is null)
   *
   * @throws MalformedURIException if any of the parameters violates
   *                                  syntax rules or semantic rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(String p_scheme, String p_host, String p_path, String p_queryString, String p_fragment)

  /**
   * Construct a new URI that follows the generic URI syntax from its
   * component parts. Each component is validated for syntax and some
   * basic semantic checks are performed as well.  See the individual
   * setter methods for specifics.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_host the hostname or IPv4 address for the URI
   * @param p_path the URI path - if the path contains '?' or '#',
   *               then the query string and/or fragment will be
   *               set from the path; however, if the query and
   *               fragment are specified both in the path and as
   *               separate parameters, an exception is thrown
   * @param p_queryString the URI query string (cannot be specified
   *                      if path is null)
   * @param p_fragment the URI fragment (cannot be specified if path
   *                   is null)
   *
   * @throws MalformedURIException if any of the parameters violates
   *                                  syntax rules or semantic rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(String p_scheme, String p_schemeSpecificPart)

  /**
   * Construct a new URI that does not follow the generic URI syntax.
   * Only the scheme and scheme-specific part (stored as the path) are
   * initialized.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_schemeSpecificPart the scheme-specific part (cannot be
   *                             null or empty)
   *
   * @throws MalformedURIException if p_scheme violates any
   *                                  syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(URI p_base, String p_uriSpec) throws MalformedURIException

  /**
   * Construct a new URI from a base URI and a URI specification string.
   * The URI specification string may be a relative URI.
   *
   * @param p_base the base URI (cannot be null if p_uriSpec is null or
   *               empty)
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty if p_base is null)
   *
   * @throws MalformedURIException if p_uriSpec violates any syntax
   *                                  rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(String p_uriSpec) throws MalformedURIException

  /**
   * Construct a new URI from a URI specification string. If the
   * specification follows the "generic URI" syntax, (two slashes
   * following the first colon), the specification will be parsed
   * accordingly - setting the scheme, userinfo, host,port, path, query
   * string and fragment fields as necessary. If the specification does
   * not follow the "generic URI" syntax, the specification is parsed
   * into a scheme and scheme-specific part (stored as the path) only.
   *
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty)
   *
   * @throws MalformedURIException if p_uriSpec violates any syntax
   *                                   rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(URI p_other)

  /**
   * Construct a new URI from another URI. All fields for this URI are
   * set equal to the fields of the URI passed in.
   *
   * @param p_other the URI to copy (cannot be null)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public URI(){}

  /**
   * Construct a new and uninitialized URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static boolean DEBUG = false;

  /** Indicate whether in DEBUG mode          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_fragment = null;

  /** If specified, stores the fragment for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_queryString = null;

  /**
   * If specified, stores the query string for this URI; otherwise
   *   null.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_path = null;

  /** If specified, stores the path for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private int m_port = -1;

  /** If specified, stores the port for this URI; otherwise -1.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_host = null;

  /** If specified, stores the host for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_userinfo = null;

  /** If specified, stores the userinfo for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private String m_scheme = null;

  /** Stores the scheme (usually the protocol) for this URI.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static final String USERINFO_CHARACTERS = ";:&=+$,";

  /**
   * userinfo can be composed of unreserved, escaped and these
   *   characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static final String SCHEME_CHARACTERS = "+-.";

  /** scheme can be composed of alphanumerics and these characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static final String MARK_CHARACTERS = "-_.!~*'() ";

  /**
   * URI punctuation mark characters - these, combined with
   *   alphanumerics, constitute the "unreserved" characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  private static final String RESERVED_CHARACTERS = ";/?:@&=+$,";

  /** reserved characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
    public MalformedURIException(String p_msg)

    /**
     * Constructs a <code>MalformedURIException</code> with the
     * specified detail message.
     *
     * @param p_msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
    public MalformedURIException()

    /**
     * Constructs a <code>MalformedURIException</code> with no specified
     * detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
  public static class MalformedURIException extends IOException

  /**
   * MalformedURIExceptions are thrown in the process of building a URI
   * or setting fields on a URI when an operation would result in an
   * invalid URI specification.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/URI.java
final class URI

/**
 * A class to represent a Uniform Resource Identifier (URI). This class
 * is designed to handle the parsing of URIs and provide access to
 * the various components (scheme, host, port, userinfo, path, query
 * string and fragment) that may constitute a URI.
 * <p>
 * Parsing of a URI specification is done according to the URI
 * syntax described in RFC 2396
 * <http://www.ietf.org/rfc/rfc2396.txt?number=2396>. Every URI consists
 * of a scheme, followed by a colon (':'), followed by a scheme-specific
 * part. For URIs that follow the "generic URI" syntax, the scheme-
 * specific part begins with two slashes ("//") and may be followed
 * by an authority segment (comprised of user information, host, and
 * port), path segment, query segment and fragment. Note that RFC 2396
 * no longer specifies the use of the parameters segment and excludes
 * the "user:password" syntax as part of the authority segment. If
 * "user:password" appears in a URI, the entire user/password string
 * is stored as userinfo.
 * <p>
 * For URIs that do not follow the "generic URI" syntax (e.g. mailto),
 * the entire scheme-specific part is treated as the "path" portion
 * of the URI.
 * <p>
 * Note that, unlike the java.net.URL class, this class does not provide
 * any built-in network access functionality nor does it provide any
 * scheme-specific functionality (for example, it does not know a
 * default port for a specific scheme). Rather, it only knows the
 * grammar and basic set of operations that can be applied to a URI.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 *
 * A minor change from the original is that this class no longer implements
 * Serializable, and the serialVersionUID magic field is dropped, and
 * the class is no longer "public".
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isURIString(String p_uric)

  /**
   * Determine whether a given string contains only URI characters (also
   * called "uric" in RFC 2396). uric consist of all reserved
   * characters, unreserved characters and escaped characters.
   *
   *
   * @param p_uric URI string
   * @return true if the string is comprised of uric, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isUnreservedCharacter(char p_char)

  /**
   * Determine whether a char is an unreserved character.
   *
   *
   * @param p_char the character to check
   * @return true if the char is unreserved, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isReservedCharacter(char p_char)

  /**
   * Determine whether a character is a reserved character:
   * ';', '/', '?', ':', '@', '&', '=', '+', '$' or ','
   *
   *
   * @param p_char the character to check
   * @return true if the string contains any reserved characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isAlphanum(char p_char)

  /**
   * Determine whether a char is an alphanumeric: 0-9, a-z or A-Z
   *
   *
   * @param p_char the character to check
   * @return true if the char is alphanumeric, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isAlpha(char p_char)

  /**
   * Determine whether a char is an alphabetic character: a-z or A-Z
   *
   *
   * @param p_char the character to check
   * @return true if the char is alphabetic, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isHex(char p_char)

  /**
   * Determine whether a character is a hexadecimal character.
   *
   *
   * @param p_char the character to check
   * @return true if the char is betweeen '0' and '9', 'a' and 'f'
   *         or 'A' and 'F', false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean isDigit(char p_char)

  /**
   * Determine whether a char is a digit.
   *
   *
   * @param p_char the character to check
   * @return true if the char is betweeen '0' and '9', false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public static boolean isWellFormedAddress(String p_address)

  /**
   * Determine whether a string is syntactically capable of representing
   * a valid IPv4 address or the domain name of a network host. A valid
   * IPv4 address consists of four decimal digit groups separated by a
   * '.'. A hostname consists of domain labels (each of which must
   * begin and end with an alphanumeric but may contain '-') separated
   * & by a '.'. See RFC 2396 Section 3.2.2.
   *
   *
   * @param p_address The address string to check
   * @return true if the string is a syntactically valid IPv4 address
   *              or hostname
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public static boolean isConformantSchemeName(String p_scheme)

  /**
   * Determine whether a scheme conforms to the rules for a scheme name.
   * A scheme is conformant if it starts with an alphanumeric, and
   * contains only alphanumerics, '+','-' and '.'.
   *
   *
   * @param p_scheme The sheme name to check
   * @return true if the scheme is conformant, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public boolean isGenericURI()

  /**
   * Get the indicator as to whether this URI uses the "generic URI"
   * syntax.
   *
   * @return true if this URI uses the "generic URI" syntax, false
   *         otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  @Override

  /**
   * Get the URI as a string specification. See RFC 2396 Section 5.2.
   *
   * @return the URI string specification
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  @Override

  /**
   * Determines if the passed-in Object is equivalent to this URI.
   *
   * @param p_test the Object to test for equality.
   *
   * @return true if p_test is a URI with all values equal to this
   *         URI, false otherwise
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setFragment(String p_fragment) throws MalformedURIException

  /**
   * Set the fragment for this URI. A non-null value is valid only
   * if this is a URI conforming to the generic URI syntax and
   * the path value is not null.
   *
   * @param p_fragment the fragment for this URI
   *
   * @throws MalformedURIException if p_fragment is not null and this
   *                                  URI does not conform to the generic
   *                                  URI syntax or if the path is null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setQueryString(String p_queryString)

  /**
   * Set the query string for this URI. A non-null value is valid only
   * if this is an URI conforming to the generic URI syntax and
   * the path value is not null.
   *
   * @param p_queryString the query string for this URI
   *
   * @throws MalformedURIException if p_queryString is not null and this
   *                                  URI does not conform to the generic
   *                                  URI syntax or if the path is null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void appendPath(String p_addToPath) throws MalformedURIException

  /**
   * Append to the end of the path of this URI. If the current path does
   * not end in a slash and the path to be appended does not begin with
   * a slash, a slash will be appended to the current path before the
   * new segment is added. Also, if the current path ends in a slash
   * and the new segment begins with a slash, the extra slash will be
   * removed before the new segment is appended.
   *
   * @param p_addToPath the new segment to be added to the current path
   *
   * @throws MalformedURIException if p_addToPath contains syntax
   *                                  errors
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setPath(String p_path) throws MalformedURIException

  /**
   * Set the path for this URI. If the supplied path is null, then the
   * query string and fragment are set to null as well. If the supplied
   * path includes a query string and/or fragment, these fields will be
   * parsed and set as well. Note that, for URIs following the "generic
   * URI" syntax, the path specified should start with a slash.
   * For URIs that do not follow the generic URI syntax, this method
   * sets the scheme-specific part.
   *
   * @param p_path the path for this URI (may be null)
   *
   * @throws MalformedURIException if p_path contains invalid
   *                                  characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setPort(int p_port) throws MalformedURIException

  /**
   * Set the port for this URI. -1 is used to indicate that the port is
   * not specified, otherwise valid port numbers are  between 0 and 65535.
   * If a valid port number is passed in and the host field is null,
   * an exception is thrown.
   *
   * @param p_port the port number for this URI
   *
   * @throws MalformedURIException if p_port is not -1 and not a
   *                                  valid port number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setHost(String p_host) throws MalformedURIException

  /**
   * Set the host for this URI. If null is passed in, the userinfo
   * field is also set to null and the port is set to -1.
   *
   * @param p_host the host for this URI
   *
   * @throws MalformedURIException if p_host is not a valid IP
   *                                  address or DNS hostname.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setUserinfo(String p_userinfo) throws MalformedURIException

  /**
   * Set the userinfo for this URI. If a non-null value is passed in and
   * the host value is null, then an exception is thrown.
   *
   * @param p_userinfo the userinfo for this URI
   *
   * @throws MalformedURIException if p_userinfo contains invalid
   *                                  characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public void setScheme(String p_scheme) throws MalformedURIException

  /**
   * Set the scheme for this URI. The scheme is converted to lowercase
   * before it is set.
   *
   * @param p_scheme the scheme for this URI (cannot be null)
   *
   * @throws MalformedURIException if p_scheme is not a conformant
   *                                  scheme name
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getFragment()

  /**
   * Get the fragment for this URI.
   *
   * @return the fragment for this URI. Null is returned if there
   *         was no "#" in the URI spec, empty string if there was a
   *         "#" but no fragment following it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getQueryString()

  /**
   * Get the query string for this URI.
   *
   * @return the query string for this URI. Null is returned if there
   *         was no "?" in the URI spec, empty string if there was a
   *         "?" but no query string following it.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getPath()

  /**
   * Get the path for this URI. Note that the value returned is the path
   * only and does not include the query string or fragment.
   *
   * @return the path for this URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getPath(boolean p_includeQueryString,
                        boolean p_includeFragment)

  /**
   * Get the path for this URI (optionally with the query string and
   * fragment).
   *
   * @param p_includeQueryString if true (and query string is not null),
   *                             then a "?" followed by the query string
   *                             will be appended
   * @param p_includeFragment if true (and fragment is not null),
   *                             then a "#" followed by the fragment
   *                             will be appended
   *
   * @return the path for this URI possibly including the query string
   *         and fragment
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public int getPort()

  /**
   * Get the port for this URI.
   *
   * @return the port for this URI (-1 if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getHost()

  /**
   * Get the host for this URI.
   *
   * @return the host for this URI (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getUserinfo()

  /**
   * Get the userinfo for this URI.
   *
   * @return the userinfo for this URI (null if not specified).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getSchemeSpecificPart()

  /**
   * Get the scheme-specific part for this URI (everything following the
   * scheme and the first colon). See RFC 2396 Section 5.2 for spec.
   *
   * @return the scheme-specific part for this URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public String getScheme()

  /**
   * Get the scheme for this URI.
   *
   * @return the scheme for this URI
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initializePath(String p_uriSpec) throws MalformedURIException

  /**
   * Initialize the path for this URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initializeAuthority(String p_uriSpec)

  /**
   * Initialize the authority (userinfo, host and port) for this
   * URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initializeScheme(String p_uriSpec) throws MalformedURIException

  /**
   * Initialize the scheme for this URI from a URI string spec.
   *
   * @param p_uriSpec the URI specification (cannot be null)
   *
   * @throws MalformedURIException if URI does not have a conformant
   *                                  scheme
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initialize(URI p_base, String p_uriSpec)

  /**
   * Initializes this URI from a base URI and a URI specification string.
   * See RFC 2396 Section 4 and Appendix B for specifications on parsing
   * the URI and Section 5 for specifications on resolving relative URIs
   * and relative paths.
   *
   * @param p_base the base URI (may be null if p_uriSpec is an absolute
   *               URI)
   * @param p_uriSpec the URI spec string which may be an absolute or
   *                  relative URI (can only be null/empty if p_base
   *                  is not null)
   *
   * @throws MalformedURIException if p_base is null and p_uriSpec
   *                                  is not an absolute URI or if
   *                                  p_uriSpec violates syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private void initialize(URI p_other)

  /**
   * Initialize all fields of this URI from another URI.
   *
   * @param p_other the URI to copy (cannot be null)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(String p_scheme, String p_userinfo, String p_host, int p_port, String p_path, String p_queryString, String p_fragment)

  /**
   * Construct a new URI that follows the generic URI syntax from its
   * component parts. Each component is validated for syntax and some
   * basic semantic checks are performed as well.  See the individual
   * setter methods for specifics.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_userinfo the URI userinfo (cannot be specified if host
   *                   is null)
   * @param p_host the hostname or IPv4 address for the URI
   * @param p_port the URI port (may be -1 for "unspecified"; cannot
   *               be specified if host is null)
   * @param p_path the URI path - if the path contains '?' or '#',
   *               then the query string and/or fragment will be
   *               set from the path; however, if the query and
   *               fragment are specified both in the path and as
   *               separate parameters, an exception is thrown
   * @param p_queryString the URI query string (cannot be specified
   *                      if path is null)
   * @param p_fragment the URI fragment (cannot be specified if path
   *                   is null)
   *
   * @throws MalformedURIException if any of the parameters violates
   *                                  syntax rules or semantic rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(String p_scheme, String p_host, String p_path, String p_queryString, String p_fragment)

  /**
   * Construct a new URI that follows the generic URI syntax from its
   * component parts. Each component is validated for syntax and some
   * basic semantic checks are performed as well.  See the individual
   * setter methods for specifics.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_host the hostname or IPv4 address for the URI
   * @param p_path the URI path - if the path contains '?' or '#',
   *               then the query string and/or fragment will be
   *               set from the path; however, if the query and
   *               fragment are specified both in the path and as
   *               separate parameters, an exception is thrown
   * @param p_queryString the URI query string (cannot be specified
   *                      if path is null)
   * @param p_fragment the URI fragment (cannot be specified if path
   *                   is null)
   *
   * @throws MalformedURIException if any of the parameters violates
   *                                  syntax rules or semantic rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(String p_scheme, String p_schemeSpecificPart)

  /**
   * Construct a new URI that does not follow the generic URI syntax.
   * Only the scheme and scheme-specific part (stored as the path) are
   * initialized.
   *
   * @param p_scheme the URI scheme (cannot be null or empty)
   * @param p_schemeSpecificPart the scheme-specific part (cannot be
   *                             null or empty)
   *
   * @throws MalformedURIException if p_scheme violates any
   *                                  syntax rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(URI p_base, String p_uriSpec) throws MalformedURIException

  /**
   * Construct a new URI from a base URI and a URI specification string.
   * The URI specification string may be a relative URI.
   *
   * @param p_base the base URI (cannot be null if p_uriSpec is null or
   *               empty)
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty if p_base is null)
   *
   * @throws MalformedURIException if p_uriSpec violates any syntax
   *                                  rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(String p_uriSpec) throws MalformedURIException

  /**
   * Construct a new URI from a URI specification string. If the
   * specification follows the "generic URI" syntax, (two slashes
   * following the first colon), the specification will be parsed
   * accordingly - setting the scheme, userinfo, host,port, path, query
   * string and fragment fields as necessary. If the specification does
   * not follow the "generic URI" syntax, the specification is parsed
   * into a scheme and scheme-specific part (stored as the path) only.
   *
   * @param p_uriSpec the URI specification string (cannot be null or
   *                  empty)
   *
   * @throws MalformedURIException if p_uriSpec violates any syntax
   *                                   rules
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(URI p_other)

  /**
   * Construct a new URI from another URI. All fields for this URI are
   * set equal to the fields of the URI passed in.
   *
   * @param p_other the URI to copy (cannot be null)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public URI(){}

  /**
   * Construct a new and uninitialized URI.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static boolean DEBUG = false;

  /** Indicate whether in DEBUG mode          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_fragment = null;

  /** If specified, stores the fragment for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_queryString = null;

  /**
   * If specified, stores the query string for this URI; otherwise
   *   null.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_path = null;

  /** If specified, stores the path for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private int m_port = -1;

  /** If specified, stores the port for this URI; otherwise -1.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_host = null;

  /** If specified, stores the host for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_userinfo = null;

  /** If specified, stores the userinfo for this URI; otherwise null.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private String m_scheme = null;

  /** Stores the scheme (usually the protocol) for this URI.
   *  @serial */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static final String USERINFO_CHARACTERS = ";:&=+$,";

  /**
   * userinfo can be composed of unreserved, escaped and these
   *   characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static final String SCHEME_CHARACTERS = "+-.";

  /** scheme can be composed of alphanumerics and these characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static final String MARK_CHARACTERS = "-_.!~*'() ";

  /**
   * URI punctuation mark characters - these, combined with
   *   alphanumerics, constitute the "unreserved" characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  private static final String RESERVED_CHARACTERS = ";/?:@&=+$,";

  /** reserved characters */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
    public MalformedURIException(String p_msg)

    /**
     * Constructs a <code>MalformedURIException</code> with the
     * specified detail message.
     *
     * @param p_msg the detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
    public MalformedURIException()

    /**
     * Constructs a <code>MalformedURIException</code> with no specified
     * detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
  public static class MalformedURIException extends IOException

  /**
   * MalformedURIExceptions are thrown in the process of building a URI
   * or setting fields on a URI when an operation would result in an
   * invalid URI specification.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/URI.java
public class URI implements Serializable

/**
 * A class to represent a Uniform Resource Identifier (URI). This class
 * is designed to handle the parsing of URIs and provide access to
 * the various components (scheme, host, port, userinfo, path, query
 * string and fragment) that may constitute a URI.
 * <p>
 * Parsing of a URI specification is done according to the URI
 * syntax described in RFC 2396
 * <http://www.ietf.org/rfc/rfc2396.txt?number=2396>. Every URI consists
 * of a scheme, followed by a colon (':'), followed by a scheme-specific
 * part. For URIs that follow the "generic URI" syntax, the scheme-
 * specific part begins with two slashes ("//") and may be followed
 * by an authority segment (comprised of user information, host, and
 * port), path segment, query segment and fragment. Note that RFC 2396
 * no longer specifies the use of the parameters segment and excludes
 * the "user:password" syntax as part of the authority segment. If
 * "user:password" appears in a URI, the entire user/password string
 * is stored as userinfo.
 * <p>
 * For URIs that do not follow the "generic URI" syntax (e.g. mailto),
 * the entire scheme-specific part is treated as the "path" portion
 * of the URI.
 * <p>
 * Note that, unlike the java.net.URL class, this class does not provide
 * any built-in network access functionality nor does it provide any
 * scheme-specific functionality (for example, it does not know a
 * default port for a specific scheme). Rather, it only knows the
 * grammar and basic set of operations that can be applied to a URI.
 *
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
        // will parse.  This seems to be the intent of RFC2396, though the

        // fragment component.  This is so that URIs such as "file:///foo/bar"
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    private void readObject(ObjectInputStream is)

    /**
     * Reconstitutes a URI from the given serial stream.
     *
     * <p> The {@link java.io.ObjectInputStream#defaultReadObject()} method is
     * invoked to read the value of the {@code string} field.  The result is
     * then parsed in the usual way.
     *
     * @param  is  The object-input stream from which this object
     *             is being read
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    private void writeObject(ObjectOutputStream os)

    /**
     * Saves the content of this URI to the given serial stream.
     *
     * <p> The only serializable field of a URI instance is its {@code string}
     * field.  That field is given a value, if it does not have one already,
     * and then the {@link java.io.ObjectOutputStream#defaultWriteObject()}
     * method of the given object-output stream is invoked. </p>
     *
     * @param  os  The object-output stream to which this object
     *             is to be written
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String toASCIIString() {

    /**
     * Returns the content of this URI as a US-ASCII string.
     *
     * <p> If this URI does not contain any characters in the <i>other</i>
     * category then an invocation of this method will return the same value as
     * an invocation of the {@link #toString() toString} method.  Otherwise
     * this method works as if by invoking that method and then <a
     * href="#encode">encoding</a> the result.  </p>
     *
     * @return  The string form of this URI, encoded as needed
     *          so that it only contains characters in the US-ASCII
     *          charset
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String toString() {

    /**
     * Returns the content of this URI as a string.
     *
     * <p> If this URI was created by invoking one of the constructors in this
     * class then a string equivalent to the original input string, or to the
     * string computed from the originally-given components, as appropriate, is
     * returned.  Otherwise this URI was created by normalization, resolution,
     * or relativization, and so a string is constructed from this URI's
     * components according to the rules specified in <a
     * href="http://www.ietf.org/rfc/rfc2396.txt">RFC&nbsp;2396</a>,
     * section&nbsp;5.2, step&nbsp;7. </p>
     *
     * @return  The string form of this URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public int compareTo(URI that) {

    /**
     * Compares this URI to another object, which must be a URI.
     *
     * <p> When comparing corresponding components of two URIs, if one
     * component is undefined but the other is defined then the first is
     * considered to be less than the second.  Unless otherwise noted, string
     * components are ordered according to their natural, case-sensitive
     * ordering as defined by the {@link java.lang.String#compareTo(Object)
     * String.compareTo} method.  String components that are subject to
     * encoding are compared by comparing their raw forms rather than their
     * encoded forms.
     *
     * <p> The ordering of URIs is defined as follows: </p>
     *
     * <ul>
     *
     *   <li><p> Two URIs with different schemes are ordered according the
     *   ordering of their schemes, without regard to case. </p></li>
     *
     *   <li><p> A hierarchical URI is considered to be less than an opaque URI
     *   with an identical scheme. </p></li>
     *
     *   <li><p> Two opaque URIs with identical schemes are ordered according
     *   to the ordering of their scheme-specific parts. </p></li>
     *
     *   <li><p> Two opaque URIs with identical schemes and scheme-specific
     *   parts are ordered according to the ordering of their
     *   fragments. </p></li>
     *
     *   <li><p> Two hierarchical URIs with identical schemes are ordered
     *   according to the ordering of their authority components: </p>
     *
     *   <ul>
     *
     *     <li><p> If both authority components are server-based then the URIs
     *     are ordered according to their user-information components; if these
     *     components are identical then the URIs are ordered according to the
     *     ordering of their hosts, without regard to case; if the hosts are
     *     identical then the URIs are ordered according to the ordering of
     *     their ports. </p></li>
     *
     *     <li><p> If one or both authority components are registry-based then
     *     the URIs are ordered according to the ordering of their authority
     *     components. </p></li>
     *
     *   </ul></li>
     *
     *   <li><p> Finally, two hierarchical URIs with identical schemes and
     *   authority components are ordered according to the ordering of their
     *   paths; if their paths are identical then they are ordered according to
     *   the ordering of their queries; if the queries are identical then they
     *   are ordered according to the order of their fragments. </p></li>
     *
     * </ul>
     *
     * <p> This method satisfies the general contract of the {@link
     * java.lang.Comparable#compareTo(Object) Comparable.compareTo}
     * method. </p>
     *
     * @param   that
     *          The object to which this URI is to be compared
     *
     * @return  A negative integer, zero, or a positive integer as this URI is
     *          less than, equal to, or greater than the given URI
     *
     * @throws  ClassCastException
     *          If the given object is not a URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public int hashCode() {

    /**
     * Returns a hash-code value for this URI.  The hash code is based upon all
     * of the URI's components, and satisfies the general contract of the
     * {@link java.lang.Object#hashCode() Object.hashCode} method.
     *
     * @return  A hash-code value for this URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public boolean equals(Object ob) {

    /**
     * Tests this URI for equality with another object.
     *
     * <p> If the given object is not a URI then this method immediately
     * returns {@code false}.
     *
     * <p> For two URIs to be considered equal requires that either both are
     * opaque or both are hierarchical.  Their schemes must either both be
     * undefined or else be equal without regard to case. Their fragments
     * must either both be undefined or else be equal.
     *
     * <p> For two opaque URIs to be considered equal, their scheme-specific
     * parts must be equal.
     *
     * <p> For two hierarchical URIs to be considered equal, their paths must
     * be equal and their queries must either both be undefined or else be
     * equal.  Their authorities must either both be undefined, or both be
     * registry-based, or both be server-based.  If their authorities are
     * defined and are registry-based, then they must be equal.  If their
     * authorities are defined and are server-based, then their hosts must be
     * equal without regard to case, their port numbers must be equal, and
     * their user-information components must be equal.
     *
     * <p> When testing the user-information, path, query, fragment, authority,
     * or scheme-specific parts of two URIs for equality, the raw forms rather
     * than the encoded forms of these components are compared and the
     * hexadecimal digits of escaped octets are compared without regard to
     * case.
     *
     * <p> This method satisfies the general contract of the {@link
     * java.lang.Object#equals(Object) Object.equals} method. </p>
     *
     * @param   ob   The object to which this object is to be compared
     *
     * @return  {@code true} if, and only if, the given object is a URI that
     *          is identical to this URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getFragment() {

    /**
     * Returns the decoded fragment component of this URI.
     *
     * <p> The string returned by this method is equal to that returned by the
     * {@link #getRawFragment() getRawFragment} method except that all
     * sequences of escaped octets are <a href="#decode">decoded</a>.  </p>
     *
     * @return  The decoded fragment component of this URI,
     *          or {@code null} if the fragment is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getRawFragment() {

    /**
     * Returns the raw fragment component of this URI.
     *
     * <p> The fragment component of a URI, if defined, only contains legal URI
     * characters. </p>
     *
     * @return  The raw fragment component of this URI,
     *          or {@code null} if the fragment is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getQuery() {

    /**
     * Returns the decoded query component of this URI.
     *
     * <p> The string returned by this method is equal to that returned by the
     * {@link #getRawQuery() getRawQuery} method except that all sequences of
     * escaped octets are <a href="#decode">decoded</a>.  </p>
     *
     * @return  The decoded query component of this URI,
     *          or {@code null} if the query is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getRawQuery() {

    /**
     * Returns the raw query component of this URI.
     *
     * <p> The query component of a URI, if defined, only contains legal URI
     * characters. </p>
     *
     * @return  The raw query component of this URI,
     *          or {@code null} if the query is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getPath() {

    /**
     * Returns the decoded path component of this URI.
     *
     * <p> The string returned by this method is equal to that returned by the
     * {@link #getRawPath() getRawPath} method except that all sequences of
     * escaped octets are <a href="#decode">decoded</a>.  </p>
     *
     * @return  The decoded path component of this URI,
     *          or {@code null} if the path is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getRawPath() {

    /**
     * Returns the raw path component of this URI.
     *
     * <p> The path component of a URI, if defined, only contains the slash
     * character ({@code '/'}), the commercial-at character ({@code '@'}),
     * and characters in the <i>unreserved</i>, <i>punct</i>, <i>escaped</i>,
     * and <i>other</i> categories. </p>
     *
     * @return  The path component of this URI,
     *          or {@code null} if the path is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public int getPort() {

    /**
     * Returns the port number of this URI.
     *
     * <p> The port component of a URI, if defined, is a non-negative
     * integer. </p>
     *
     * @return  The port component of this URI,
     *          or {@code -1} if the port is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getHost() {

    /**
     * Returns the host component of this URI.
     *
     * <p> The host component of a URI, if defined, will have one of the
     * following forms: </p>
     *
     * <ul>
     *
     *   <li><p> A domain name consisting of one or more <i>labels</i>
     *   separated by period characters ({@code '.'}), optionally followed by
     *   a period character.  Each label consists of <i>alphanum</i> characters
     *   as well as hyphen characters ({@code '-'}), though hyphens never
     *   occur as the first or last characters in a label. The rightmost
     *   label of a domain name consisting of two or more labels, begins
     *   with an <i>alpha</i> character. </li>
     *
     *   <li><p> A dotted-quad IPv4 address of the form
     *   <i>digit</i>{@code +.}<i>digit</i>{@code +.}<i>digit</i>{@code +.}<i>digit</i>{@code +},
     *   where no <i>digit</i> sequence is longer than three characters and no
     *   sequence has a value larger than 255. </p></li>
     *
     *   <li><p> An IPv6 address enclosed in square brackets ({@code '['} and
     *   {@code ']'}) and consisting of hexadecimal digits, colon characters
     *   ({@code ':'}), and possibly an embedded IPv4 address.  The full
     *   syntax of IPv6 addresses is specified in <a
     *   href="http://www.ietf.org/rfc/rfc2373.txt"><i>RFC&nbsp;2373: IPv6
     *   Addressing Architecture</i></a>.  </p></li>
     *
     * </ul>
     *
     * The host component of a URI cannot contain escaped octets, hence this
     * method does not perform any decoding.
     *
     * @return  The host component of this URI,
     *          or {@code null} if the host is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getUserInfo() {

    /**
     * Returns the decoded user-information component of this URI.
     *
     * <p> The string returned by this method is equal to that returned by the
     * {@link #getRawUserInfo() getRawUserInfo} method except that all
     * sequences of escaped octets are <a href="#decode">decoded</a>.  </p>
     *
     * @return  The decoded user-information component of this URI,
     *          or {@code null} if the user information is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getRawUserInfo() {

    /**
     * Returns the raw user-information component of this URI.
     *
     * <p> The user-information component of a URI, if defined, only contains
     * characters in the <i>unreserved</i>, <i>punct</i>, <i>escaped</i>, and
     * <i>other</i> categories. </p>
     *
     * @return  The raw user-information component of this URI,
     *          or {@code null} if the user information is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getAuthority() {

    /**
     * Returns the decoded authority component of this URI.
     *
     * <p> The string returned by this method is equal to that returned by the
     * {@link #getRawAuthority() getRawAuthority} method except that all
     * sequences of escaped octets are <a href="#decode">decoded</a>.  </p>
     *
     * @return  The decoded authority component of this URI,
     *          or {@code null} if the authority is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getRawAuthority() {

    /**
     * Returns the raw authority component of this URI.
     *
     * <p> The authority component of a URI, if defined, only contains the
     * commercial-at character ({@code '@'}) and characters in the
     * <i>unreserved</i>, <i>punct</i>, <i>escaped</i>, and <i>other</i>
     * categories.  If the authority is server-based then it is further
     * constrained to have valid user-information, host, and port
     * components. </p>
     *
     * @return  The raw authority component of this URI,
     *          or {@code null} if the authority is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getSchemeSpecificPart() {

    /**
     * Returns the decoded scheme-specific part of this URI.
     *
     * <p> The string returned by this method is equal to that returned by the
     * {@link #getRawSchemeSpecificPart() getRawSchemeSpecificPart} method
     * except that all sequences of escaped octets are <a
     * href="#decode">decoded</a>.  </p>
     *
     * @return  The decoded scheme-specific part of this URI
     *          (never {@code null})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getRawSchemeSpecificPart() {

    /**
     * Returns the raw scheme-specific part of this URI.  The scheme-specific
     * part is never undefined, though it may be empty.
     *
     * <p> The scheme-specific part of a URI only contains legal URI
     * characters. </p>
     *
     * @return  The raw scheme-specific part of this URI
     *          (never {@code null})
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public boolean isOpaque() {

    /**
     * Tells whether or not this URI is opaque.
     *
     * <p> A URI is opaque if, and only if, it is absolute and its
     * scheme-specific part does not begin with a slash character ('/').
     * An opaque URI has a scheme, a scheme-specific part, and possibly
     * a fragment; all other components are undefined. </p>
     *
     * @return  {@code true} if, and only if, this URI is opaque
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public boolean isAbsolute() {

    /**
     * Tells whether or not this URI is absolute.
     *
     * <p> A URI is absolute if, and only if, it has a scheme component. </p>
     *
     * @return  {@code true} if, and only if, this URI is absolute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public String getScheme() {

    /**
     * Returns the scheme component of this URI.
     *
     * <p> The scheme component of a URI, if defined, only contains characters
     * in the <i>alphanum</i> category and in the string {@code "-.+"}.  A
     * scheme always starts with an <i>alpha</i> character. <p>
     *
     * The scheme component of a URI cannot contain escaped octets, hence this
     * method does not perform any decoding.
     *
     * @return  The scheme component of this URI,
     *          or {@code null} if the scheme is undefined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URL toURL()

    /**
     * Constructs a URL from this URI.
     *
     * <p> This convenience method works as if invoking it were equivalent to
     * evaluating the expression {@code new URL(this.toString())} after
     * first checking that this URI is absolute. </p>
     *
     * @return  A URL constructed from this URI
     *
     * @throws  IllegalArgumentException
     *          If this URL is not absolute
     *
     * @throws  MalformedURLException
     *          If a protocol handler for the URL could not be found,
     *          or if some other error occurred while constructing the URL
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI relativize(URI uri) {

    /**
     * Relativizes the given URI against this URI.
     *
     * <p> The relativization of the given URI against this URI is computed as
     * follows: </p>
     *
     * <ol>
     *
     *   <li><p> If either this URI or the given URI are opaque, or if the
     *   scheme and authority components of the two URIs are not identical, or
     *   if the path of this URI is not a prefix of the path of the given URI,
     *   then the given URI is returned. </p></li>
     *
     *   <li><p> Otherwise a new relative hierarchical URI is constructed with
     *   query and fragment components taken from the given URI and with a path
     *   component computed by removing this URI's path from the beginning of
     *   the given URI's path. </p></li>
     *
     * </ol>
     *
     * @param  uri  The URI to be relativized against this URI
     * @return The resulting URI
     *
     * @throws  NullPointerException
     *          If {@code uri} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI resolve(String str) {

    /**
     * Constructs a new URI by parsing the given string and then resolving it
     * against this URI.
     *
     * <p> This convenience method works as if invoking it were equivalent to
     * evaluating the expression {@link #resolve(java.net.URI)
     * resolve}{@code (URI.}{@link #create(String) create}{@code (str))}. </p>
     *
     * @param  str   The string to be parsed into a URI
     * @return The resulting URI
     *
     * @throws  NullPointerException
     *          If {@code str} is {@code null}
     *
     * @throws  IllegalArgumentException
     *          If the given string violates RFC&nbsp;2396
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI resolve(URI uri) {

    /**
     * Resolves the given URI against this URI.
     *
     * <p> If the given URI is already absolute, or if this URI is opaque, then
     * the given URI is returned.
     *
     * <p><a name="resolve-frag"></a> If the given URI's fragment component is
     * defined, its path component is empty, and its scheme, authority, and
     * query components are undefined, then a URI with the given fragment but
     * with all other components equal to those of this URI is returned.  This
     * allows a URI representing a standalone fragment reference, such as
     * {@code "#foo"}, to be usefully resolved against a base URI.
     *
     * <p> Otherwise this method constructs a new hierarchical URI in a manner
     * consistent with <a
     * href="http://www.ietf.org/rfc/rfc2396.txt">RFC&nbsp;2396</a>,
     * section&nbsp;5.2; that is: </p>
     *
     * <ol>
     *
     *   <li><p> A new URI is constructed with this URI's scheme and the given
     *   URI's query and fragment components. </p></li>
     *
     *   <li><p> If the given URI has an authority component then the new URI's
     *   authority and path are taken from the given URI. </p></li>
     *
     *   <li><p> Otherwise the new URI's authority component is copied from
     *   this URI, and its path is computed as follows: </p>
     *
     *   <ol>
     *
     *     <li><p> If the given URI's path is absolute then the new URI's path
     *     is taken from the given URI. </p></li>
     *
     *     <li><p> Otherwise the given URI's path is relative, and so the new
     *     URI's path is computed by resolving the path of the given URI
     *     against the path of this URI.  This is done by concatenating all but
     *     the last segment of this URI's path, if any, with the given URI's
     *     path and then normalizing the result as if by invoking the {@link
     *     #normalize() normalize} method. </p></li>
     *
     *   </ol></li>
     *
     * </ol>
     *
     * <p> The result of this method is absolute if, and only if, either this
     * URI is absolute or the given URI is absolute.  </p>
     *
     * @param  uri  The URI to be resolved against this URI
     * @return The resulting URI
     *
     * @throws  NullPointerException
     *          If {@code uri} is {@code null}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI normalize() {

    /**
     * Normalizes this URI's path.
     *
     * <p> If this URI is opaque, or if its path is already in normal form,
     * then this URI is returned.  Otherwise a new URI is constructed that is
     * identical to this URI except that its path is computed by normalizing
     * this URI's path in a manner consistent with <a
     * href="http://www.ietf.org/rfc/rfc2396.txt">RFC&nbsp;2396</a>,
     * section&nbsp;5.2, step&nbsp;6, sub-steps&nbsp;c through&nbsp;f; that is:
     * </p>
     *
     * <ol>
     *
     *   <li><p> All {@code "."} segments are removed. </p></li>
     *
     *   <li><p> If a {@code ".."} segment is preceded by a non-{@code ".."}
     *   segment then both of these segments are removed.  This step is
     *   repeated until it is no longer applicable. </p></li>
     *
     *   <li><p> If the path is relative, and if its first segment contains a
     *   colon character ({@code ':'}), then a {@code "."} segment is
     *   prepended.  This prevents a relative URI with a path such as
     *   {@code "a:b/c/d"} from later being re-parsed as an opaque URI with a
     *   scheme of {@code "a"} and a scheme-specific part of {@code "b/c/d"}.
     *   <b><i>(Deviation from RFC&nbsp;2396)</i></b> </p></li>
     *
     * </ol>
     *
     * <p> A normalized path will begin with one or more {@code ".."} segments
     * if there were insufficient non-{@code ".."} segments preceding them to
     * allow their removal.  A normalized path will begin with a {@code "."}
     * segment if one was inserted by step 3 above.  Otherwise, a normalized
     * path will not contain any {@code "."} or {@code ".."} segments. </p>
     *
     * @return  A URI equivalent to this URI,
     *          but whose path is in normal form
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI parseServerAuthority()

    /**
     * Attempts to parse this URI's authority component, if defined, into
     * user-information, host, and port components.
     *
     * <p> If this URI's authority component has already been recognized as
     * being server-based then it will already have been parsed into
     * user-information, host, and port components.  In this case, or if this
     * URI has no authority component, this method simply returns this URI.
     *
     * <p> Otherwise this method attempts once more to parse the authority
     * component into user-information, host, and port components, and throws
     * an exception describing why the authority component could not be parsed
     * in that way.
     *
     * <p> This method is provided because the generic URI syntax specified in
     * <a href="http://www.ietf.org/rfc/rfc2396.txt">RFC&nbsp;2396</a>
     * cannot always distinguish a malformed server-based authority from a
     * legitimate registry-based authority.  It must therefore treat some
     * instances of the former as instances of the latter.  The authority
     * component in the URI string {@code "//foo:bar"}, for example, is not a
     * legal server-based authority but it is legal as a registry-based
     * authority.
     *
     * <p> In many common situations, for example when working URIs that are
     * known to be either URNs or URLs, the hierarchical URIs being used will
     * always be server-based.  They therefore must either be parsed as such or
     * treated as an error.  In these cases a statement such as
     *
     * <blockquote>
     * {@code URI }<i>u</i>{@code  = new URI(str).parseServerAuthority();}
     * </blockquote>
     *
     * <p> can be used to ensure that <i>u</i> always refers to a URI that, if
     * it has an authority component, has a server-based authority with proper
     * user-information, host, and port components.  Invoking this method also
     * ensures that if the authority could not be parsed in that way then an
     * appropriate diagnostic message can be issued based upon the exception
     * that is thrown. </p>
     *
     * @return  A URI whose authority field has been parsed
     *          as a server-based authority
     *
     * @throws  URISyntaxException
     *          If the authority component of this URI is defined
     *          but cannot be parsed as a server-based authority
     *          according to RFC&nbsp;2396
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public static URI create(String str) {

    /**
     * Creates a URI by parsing the given string.
     *
     * <p> This convenience factory method works as if by invoking the {@link
     * #URI(String)} constructor; any {@link URISyntaxException} thrown by the
     * constructor is caught and wrapped in a new {@link
     * IllegalArgumentException} object, which is then thrown.
     *
     * <p> This method is provided for use in situations where it is known that
     * the given string is a legal URI, for example for URI constants declared
     * within in a program, and so it would be considered a programming error
     * for the string not to parse as such.  The constructors, which throw
     * {@link URISyntaxException} directly, should be used situations where a
     * URI is being constructed from user input or from some other source that
     * may be prone to errors.  </p>
     *
     * @param  str   The string to be parsed into a URI
     * @return The new URI
     *
     * @throws  NullPointerException
     *          If {@code str} is {@code null}
     *
     * @throws  IllegalArgumentException
     *          If the given string violates RFC&nbsp;2396
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI(String scheme, String ssp, String fragment)

    /**
     * Constructs a URI from the given components.
     *
     * <p> A component may be left undefined by passing {@code null}.
     *
     * <p> This constructor first builds a URI in string form using the given
     * components as follows:  </p>
     *
     * <ol>
     *
     *   <li><p> Initially, the result string is empty.  </p></li>
     *
     *   <li><p> If a scheme is given then it is appended to the result,
     *   followed by a colon character ({@code ':'}).  </p></li>
     *
     *   <li><p> If a scheme-specific part is given then it is appended.  Any
     *   character that is not a <a href="#legal-chars">legal URI character</a>
     *   is <a href="#quote">quoted</a>.  </p></li>
     *
     *   <li><p> Finally, if a fragment is given then a hash character
     *   ({@code '#'}) is appended to the string, followed by the fragment.
     *   Any character that is not a legal URI character is quoted.  </p></li>
     *
     * </ol>
     *
     * <p> The resulting URI string is then parsed in order to create the new
     * URI instance as if by invoking the {@link #URI(String)} constructor;
     * this may cause a {@link URISyntaxException} to be thrown.  </p>
     *
     * @param   scheme    Scheme name
     * @param   ssp       Scheme-specific part
     * @param   fragment  Fragment
     *
     * @throws  URISyntaxException
     *          If the URI string constructed from the given components
     *          violates RFC&nbsp;2396
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI(String scheme, String host, String path, String fragment)

    /**
     * Constructs a hierarchical URI from the given components.
     *
     * <p> A component may be left undefined by passing {@code null}.
     *
     * <p> This convenience constructor works as if by invoking the
     * seven-argument constructor as follows:
     *
     * <blockquote>
     * {@code new} {@link #URI(String, String, String, int, String, String, String)
     * URI}{@code (scheme, null, host, -1, path, null, fragment);}
     * </blockquote>
     *
     * @param   scheme    Scheme name
     * @param   host      Host name
     * @param   path      Path
     * @param   fragment  Fragment
     *
     * @throws  URISyntaxException
     *          If the URI string constructed from the given components
     *          violates RFC&nbsp;2396
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI(String scheme,
               String authority,
               String path, String query, String fragment)

    /**
     * Constructs a hierarchical URI from the given components.
     *
     * <p> If a scheme is given then the path, if also given, must either be
     * empty or begin with a slash character ({@code '/'}).  Otherwise a
     * component of the new URI may be left undefined by passing {@code null}
     * for the corresponding parameter.
     *
     * <p> This constructor first builds a URI string from the given components
     * according to the rules specified in <a
     * href="http://www.ietf.org/rfc/rfc2396.txt">RFC&nbsp;2396</a>,
     * section&nbsp;5.2, step&nbsp;7: </p>
     *
     * <ol>
     *
     *   <li><p> Initially, the result string is empty.  </p></li>
     *
     *   <li><p> If a scheme is given then it is appended to the result,
     *   followed by a colon character ({@code ':'}).  </p></li>
     *
     *   <li><p> If an authority is given then the string {@code "//"} is
     *   appended, followed by the authority.  If the authority contains a
     *   literal IPv6 address then the address must be enclosed in square
     *   brackets ({@code '['} and {@code ']'}).  Any character not in the
     *   <i>unreserved</i>, <i>punct</i>, <i>escaped</i>, or <i>other</i>
     *   categories, and not equal to the commercial-at character
     *   ({@code '@'}), is <a href="#quote">quoted</a>.  </p></li>
     *
     *   <li><p> If a path is given then it is appended.  Any character not in
     *   the <i>unreserved</i>, <i>punct</i>, <i>escaped</i>, or <i>other</i>
     *   categories, and not equal to the slash character ({@code '/'}) or the
     *   commercial-at character ({@code '@'}), is quoted.  </p></li>
     *
     *   <li><p> If a query is given then a question-mark character
     *   ({@code '?'}) is appended, followed by the query.  Any character that
     *   is not a <a href="#legal-chars">legal URI character</a> is quoted.
     *   </p></li>
     *
     *   <li><p> Finally, if a fragment is given then a hash character
     *   ({@code '#'}) is appended, followed by the fragment.  Any character
     *   that is not a legal URI character is quoted.  </p></li>
     *
     * </ol>
     *
     * <p> The resulting URI string is then parsed as if by invoking the {@link
     * #URI(String)} constructor and then invoking the {@link
     * #parseServerAuthority()} method upon the result; this may cause a {@link
     * URISyntaxException} to be thrown.  </p>
     *
     * @param   scheme     Scheme name
     * @param   authority  Authority
     * @param   path       Path
     * @param   query      Query
     * @param   fragment   Fragment
     *
     * @throws URISyntaxException
     *         If both a scheme and a path are given but the path is relative,
     *         if the URI string constructed from the given components violates
     *         RFC&nbsp;2396, or if the authority component of the string is
     *         present but cannot be parsed as a server-based authority
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI(String scheme,
               String userInfo, String host, int port,
               String path, String query, String fragment)

    /**
     * Constructs a hierarchical URI from the given components.
     *
     * <p> If a scheme is given then the path, if also given, must either be
     * empty or begin with a slash character ({@code '/'}).  Otherwise a
     * component of the new URI may be left undefined by passing {@code null}
     * for the corresponding parameter or, in the case of the {@code port}
     * parameter, by passing {@code -1}.
     *
     * <p> This constructor first builds a URI string from the given components
     * according to the rules specified in <a
     * href="http://www.ietf.org/rfc/rfc2396.txt">RFC&nbsp;2396</a>,
     * section&nbsp;5.2, step&nbsp;7: </p>
     *
     * <ol>
     *
     *   <li><p> Initially, the result string is empty. </p></li>
     *
     *   <li><p> If a scheme is given then it is appended to the result,
     *   followed by a colon character ({@code ':'}).  </p></li>
     *
     *   <li><p> If user information, a host, or a port are given then the
     *   string {@code "//"} is appended.  </p></li>
     *
     *   <li><p> If user information is given then it is appended, followed by
     *   a commercial-at character ({@code '@'}).  Any character not in the
     *   <i>unreserved</i>, <i>punct</i>, <i>escaped</i>, or <i>other</i>
     *   categories is <a href="#quote">quoted</a>.  </p></li>
     *
     *   <li><p> If a host is given then it is appended.  If the host is a
     *   literal IPv6 address but is not enclosed in square brackets
     *   ({@code '['} and {@code ']'}) then the square brackets are added.
     *   </p></li>
     *
     *   <li><p> If a port number is given then a colon character
     *   ({@code ':'}) is appended, followed by the port number in decimal.
     *   </p></li>
     *
     *   <li><p> If a path is given then it is appended.  Any character not in
     *   the <i>unreserved</i>, <i>punct</i>, <i>escaped</i>, or <i>other</i>
     *   categories, and not equal to the slash character ({@code '/'}) or the
     *   commercial-at character ({@code '@'}), is quoted.  </p></li>
     *
     *   <li><p> If a query is given then a question-mark character
     *   ({@code '?'}) is appended, followed by the query.  Any character that
     *   is not a <a href="#legal-chars">legal URI character</a> is quoted.
     *   </p></li>
     *
     *   <li><p> Finally, if a fragment is given then a hash character
     *   ({@code '#'}) is appended, followed by the fragment.  Any character
     *   that is not a legal URI character is quoted.  </p></li>
     *
     * </ol>
     *
     * <p> The resulting URI string is then parsed as if by invoking the {@link
     * #URI(String)} constructor and then invoking the {@link
     * #parseServerAuthority()} method upon the result; this may cause a {@link
     * URISyntaxException} to be thrown.  </p>
     *
     * @param   scheme    Scheme name
     * @param   userInfo  User name and authorization information
     * @param   host      Host name
     * @param   port      Port number
     * @param   path      Path
     * @param   query     Query
     * @param   fragment  Fragment
     *
     * @throws URISyntaxException
     *         If both a scheme and a path are given but the path is relative,
     *         if the URI string constructed from the given components violates
     *         RFC&nbsp;2396, or if the authority component of the string is
     *         present but cannot be parsed as a server-based authority
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    public URI(String str) throws URISyntaxException {

    /**
     * Constructs a URI by parsing the given string.
     *
     * <p> This constructor parses the given string exactly as specified by the
     * grammar in <a
     * href="http://www.ietf.org/rfc/rfc2396.txt">RFC&nbsp;2396</a>,
     * Appendix&nbsp;A, <b><i>except for the following deviations:</i></b> </p>
     *
     * <ul>
     *
     *   <li><p> An empty authority component is permitted as long as it is
     *   followed by a non-empty path, a query component, or a fragment
     *   component.  This allows the parsing of URIs such as
     *   {@code "file:///foo/bar"}, which seems to be the intent of
     *   RFC&nbsp;2396 although the grammar does not permit it.  If the
     *   authority component is empty then the user-information, host, and port
     *   components are undefined. </p></li>
     *
     *   <li><p> Empty relative paths are permitted; this seems to be the
     *   intent of RFC&nbsp;2396 although the grammar does not permit it.  The
     *   primary consequence of this deviation is that a standalone fragment
     *   such as {@code "#foo"} parses as a relative URI with an empty path
     *   and the given fragment, and can be usefully <a
     *   href="#resolve-frag">resolved</a> against a base URI.
     *
     *   <li><p> IPv4 addresses in host components are parsed rigorously, as
     *   specified by <a
     *   href="http://www.ietf.org/rfc/rfc2732.txt">RFC&nbsp;2732</a>: Each
     *   element of a dotted-quad address must contain no more than three
     *   decimal digits.  Each element is further constrained to have a value
     *   no greater than 255. </p></li>
     *
     *   <li> <p> Hostnames in host components that comprise only a single
     *   domain label are permitted to start with an <i>alphanum</i>
     *   character. This seems to be the intent of <a
     *   href="http://www.ietf.org/rfc/rfc2396.txt">RFC&nbsp;2396</a>
     *   section&nbsp;3.2.2 although the grammar does not permit it. The
     *   consequence of this deviation is that the authority component of a
     *   hierarchical URI such as {@code s://123}, will parse as a server-based
     *   authority. </p></li>
     *
     *   <li><p> IPv6 addresses are permitted for the host component.  An IPv6
     *   address must be enclosed in square brackets ({@code '['} and
     *   {@code ']'}) as specified by <a
     *   href="http://www.ietf.org/rfc/rfc2732.txt">RFC&nbsp;2732</a>.  The
     *   IPv6 address itself must parse according to <a
     *   href="http://www.ietf.org/rfc/rfc2373.txt">RFC&nbsp;2373</a>.  IPv6
     *   addresses are further constrained to describe no more than sixteen
     *   bytes of address information, a constraint implicit in RFC&nbsp;2373
     *   but not expressible in the grammar. </p></li>
     *
     *   <li><p> Characters in the <i>other</i> category are permitted wherever
     *   RFC&nbsp;2396 permits <i>escaped</i> octets, that is, in the
     *   user-information, path, query, and fragment components, as well as in
     *   the authority component if the authority is registry-based.  This
     *   allows URIs to contain Unicode characters beyond those in the US-ASCII
     *   character set. </p></li>
     *
     * </ul>
     *
     * @param  str   The string to be parsed into a URI
     *
     * @throws  NullPointerException
     *          If {@code str} is {@code null}
     *
     * @throws  URISyntaxException
     *          If the given string violates RFC&nbsp;2396, as augmented
     *          by the above deviations
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
    private volatile String string;             // The only serializable field

    /**
     * The string form of this URI.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/URI.java
public final class URI

/**
 * Represents a Uniform Resource Identifier (URI) reference.
 *
 * <p> Aside from some minor deviations noted below, an instance of this
 * class represents a URI reference as defined by
 * <a href="http://www.ietf.org/rfc/rfc2396.txt"><i>RFC&nbsp;2396: Uniform
 * Resource Identifiers (URI): Generic Syntax</i></a>, amended by <a
 * href="http://www.ietf.org/rfc/rfc2732.txt"><i>RFC&nbsp;2732: Format for
 * Literal IPv6 Addresses in URLs</i></a>. The Literal IPv6 address format
 * also supports scope_ids. The syntax and usage of scope_ids is described
 * <a href="Inet6Address.html#scoped">here</a>.
 * This class provides constructors for creating URI instances from
 * their components or by parsing their string forms, methods for accessing the
 * various components of an instance, and methods for normalizing, resolving,
 * and relativizing URI instances.  Instances of this class are immutable.
 *
 *
 * <h3> URI syntax and components </h3>
 *
 * At the highest level a URI reference (hereinafter simply "URI") in string
 * form has the syntax
 *
 * <blockquote>
 * [<i>scheme</i><b>{@code :}</b>]<i>scheme-specific-part</i>[<b>{@code #}</b><i>fragment</i>]
 * </blockquote>
 *
 * where square brackets [...] delineate optional components and the characters
 * <b>{@code :}</b> and <b>{@code #}</b> stand for themselves.
 *
 * <p> An <i>absolute</i> URI specifies a scheme; a URI that is not absolute is
 * said to be <i>relative</i>.  URIs are also classified according to whether
 * they are <i>opaque</i> or <i>hierarchical</i>.
 *
 * <p> An <i>opaque</i> URI is an absolute URI whose scheme-specific part does
 * not begin with a slash character ({@code '/'}).  Opaque URIs are not
 * subject to further parsing.  Some examples of opaque URIs are:
 *
 * <blockquote><table cellpadding=0 cellspacing=0 summary="layout">
 * <tr><td>{@code mailto:java-net@java.sun.com}<td></tr>
 * <tr><td>{@code news:comp.lang.java}<td></tr>
 * <tr><td>{@code urn:isbn:096139210x}</td></tr>
 * </table></blockquote>
 *
 * <p> A <i>hierarchical</i> URI is either an absolute URI whose
 * scheme-specific part begins with a slash character, or a relative URI, that
 * is, a URI that does not specify a scheme.  Some examples of hierarchical
 * URIs are:
 *
 * <blockquote>
 * {@code http://java.sun.com/j2se/1.3/}<br>
 * {@code docs/guide/collections/designfaq.html#28}<br>
 * {@code ../../../demo/jfc/SwingSet2/src/SwingSet2.java}<br>
 * {@code file:///~/calendar}
 * </blockquote>
 *
 * <p> A hierarchical URI is subject to further parsing according to the syntax
 *
 * <blockquote>
 * [<i>scheme</i><b>{@code :}</b>][<b>{@code //}</b><i>authority</i>][<i>path</i>][<b>{@code ?}</b><i>query</i>][<b>{@code #}</b><i>fragment</i>]
 * </blockquote>
 *
 * where the characters <b>{@code :}</b>, <b>{@code /}</b>,
 * <b>{@code ?}</b>, and <b>{@code #}</b> stand for themselves.  The
 * scheme-specific part of a hierarchical URI consists of the characters
 * between the scheme and fragment components.
 *
 * <p> The authority component of a hierarchical URI is, if specified, either
 * <i>server-based</i> or <i>registry-based</i>.  A server-based authority
 * parses according to the familiar syntax
 *
 * <blockquote>
 * [<i>user-info</i><b>{@code @}</b>]<i>host</i>[<b>{@code :}</b><i>port</i>]
 * </blockquote>
 *
 * where the characters <b>{@code @}</b> and <b>{@code :}</b> stand for
 * themselves.  Nearly all URI schemes currently in use are server-based.  An
 * authority component that does not parse in this way is considered to be
 * registry-based.
 *
 * <p> The path component of a hierarchical URI is itself said to be absolute
 * if it begins with a slash character ({@code '/'}); otherwise it is
 * relative.  The path of a hierarchical URI that is either absolute or
 * specifies an authority is always absolute.
 *
 * <p> All told, then, a URI instance has the following nine components:
 *
 * <blockquote><table summary="Describes the components of a URI:scheme,scheme-specific-part,authority,user-info,host,port,path,query,fragment">
 * <tr><th><i>Component</i></th><th><i>Type</i></th></tr>
 * <tr><td>scheme</td><td>{@code String}</td></tr>
 * <tr><td>scheme-specific-part&nbsp;&nbsp;&nbsp;&nbsp;</td><td>{@code String}</td></tr>
 * <tr><td>authority</td><td>{@code String}</td></tr>
 * <tr><td>user-info</td><td>{@code String}</td></tr>
 * <tr><td>host</td><td>{@code String}</td></tr>
 * <tr><td>port</td><td>{@code int}</td></tr>
 * <tr><td>path</td><td>{@code String}</td></tr>
 * <tr><td>query</td><td>{@code String}</td></tr>
 * <tr><td>fragment</td><td>{@code String}</td></tr>
 * </table></blockquote>
 *
 * In a given instance any particular component is either <i>undefined</i> or
 * <i>defined</i> with a distinct value.  Undefined string components are
 * represented by {@code null}, while undefined integer components are
 * represented by {@code -1}.  A string component may be defined to have the
 * empty string as its value; this is not equivalent to that component being
 * undefined.
 *
 * <p> Whether a particular component is or is not defined in an instance
 * depends upon the type of the URI being represented.  An absolute URI has a
 * scheme component.  An opaque URI has a scheme, a scheme-specific part, and
 * possibly a fragment, but has no other components.  A hierarchical URI always
 * has a path (though it may be empty) and a scheme-specific-part (which at
 * least contains the path), and may have any of the other components.  If the
 * authority component is present and is server-based then the host component
 * will be defined and the user-information and port components may be defined.
 *
 *
 * <h4> Operations on URI instances </h4>
 *
 * The key operations supported by this class are those of
 * <i>normalization</i>, <i>resolution</i>, and <i>relativization</i>.
 *
 * <p> <i>Normalization</i> is the process of removing unnecessary {@code "."}
 * and {@code ".."} segments from the path component of a hierarchical URI.
 * Each {@code "."} segment is simply removed.  A {@code ".."} segment is
 * removed only if it is preceded by a non-{@code ".."} segment.
 * Normalization has no effect upon opaque URIs.
 *
 * <p> <i>Resolution</i> is the process of resolving one URI against another,
 * <i>base</i> URI.  The resulting URI is constructed from components of both
 * URIs in the manner specified by RFC&nbsp;2396, taking components from the
 * base URI for those not specified in the original.  For hierarchical URIs,
 * the path of the original is resolved against the path of the base and then
 * normalized.  The result, for example, of resolving
 *
 * <blockquote>
 * {@code docs/guide/collections/designfaq.html#28}
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 * &nbsp;&nbsp;&nbsp;&nbsp;(1)
 * </blockquote>
 *
 * against the base URI {@code http://java.sun.com/j2se/1.3/} is the result
 * URI
 *
 * <blockquote>
 * {@code https://docs.oracle.com/javase/1.3/docs/guide/collections/designfaq.html#28}
 * </blockquote>
 *
 * Resolving the relative URI
 *
 * <blockquote>
 * {@code ../../../demo/jfc/SwingSet2/src/SwingSet2.java}&nbsp;&nbsp;&nbsp;&nbsp;(2)
 * </blockquote>
 *
 * against this result yields, in turn,
 *
 * <blockquote>
 * {@code http://java.sun.com/j2se/1.3/demo/jfc/SwingSet2/src/SwingSet2.java}
 * </blockquote>
 *
 * Resolution of both absolute and relative URIs, and of both absolute and
 * relative paths in the case of hierarchical URIs, is supported.  Resolving
 * the URI {@code file:///~calendar} against any other URI simply yields the
 * original URI, since it is absolute.  Resolving the relative URI (2) above
 * against the relative base URI (1) yields the normalized, but still relative,
 * URI
 *
 * <blockquote>
 * {@code demo/jfc/SwingSet2/src/SwingSet2.java}
 * </blockquote>
 *
 * <p> <i>Relativization</i>, finally, is the inverse of resolution: For any
 * two normalized URIs <i>u</i> and&nbsp;<i>v</i>,
 *
 * <blockquote>
 *   <i>u</i>{@code .relativize(}<i>u</i>{@code .resolve(}<i>v</i>{@code )).equals(}<i>v</i>{@code )}&nbsp;&nbsp;and<br>
 *   <i>u</i>{@code .resolve(}<i>u</i>{@code .relativize(}<i>v</i>{@code )).equals(}<i>v</i>{@code )}&nbsp;&nbsp;.<br>
 * </blockquote>
 *
 * This operation is often useful when constructing a document containing URIs
 * that must be made relative to the base URI of the document wherever
 * possible.  For example, relativizing the URI
 *
 * <blockquote>
 * {@code https://docs.oracle.com/javase/1.3/docs/guide/index.html}
 * </blockquote>
 *
 * against the base URI
 *
 * <blockquote>
 * {@code http://java.sun.com/j2se/1.3}
 * </blockquote>
 *
 * yields the relative URI {@code docs/guide/index.html}.
 *
 *
 * <h4> Character categories </h4>
 *
 * RFC&nbsp;2396 specifies precisely which characters are permitted in the
 * various components of a URI reference.  The following categories, most of
 * which are taken from that specification, are used below to describe these
 * constraints:
 *
 * <blockquote><table cellspacing=2 summary="Describes categories alpha,digit,alphanum,unreserved,punct,reserved,escaped,and other">
 *   <tr><th valign=top><i>alpha</i></th>
 *       <td>The US-ASCII alphabetic characters,
 *        {@code 'A'}&nbsp;through&nbsp;{@code 'Z'}
 *        and {@code 'a'}&nbsp;through&nbsp;{@code 'z'}</td></tr>
 *   <tr><th valign=top><i>digit</i></th>
 *       <td>The US-ASCII decimal digit characters,
 *       {@code '0'}&nbsp;through&nbsp;{@code '9'}</td></tr>
 *   <tr><th valign=top><i>alphanum</i></th>
 *       <td>All <i>alpha</i> and <i>digit</i> characters</td></tr>
 *   <tr><th valign=top><i>unreserved</i>&nbsp;&nbsp;&nbsp;&nbsp;</th>
 *       <td>All <i>alphanum</i> characters together with those in the string
 *        {@code "_-!.~'()*"}</td></tr>
 *   <tr><th valign=top><i>punct</i></th>
 *       <td>The characters in the string {@code ",;:$&+="}</td></tr>
 *   <tr><th valign=top><i>reserved</i></th>
 *       <td>All <i>punct</i> characters together with those in the string
 *        {@code "?/[]@"}</td></tr>
 *   <tr><th valign=top><i>escaped</i></th>
 *       <td>Escaped octets, that is, triplets consisting of the percent
 *           character ({@code '%'}) followed by two hexadecimal digits
 *           ({@code '0'}-{@code '9'}, {@code 'A'}-{@code 'F'}, and
 *           {@code 'a'}-{@code 'f'})</td></tr>
 *   <tr><th valign=top><i>other</i></th>
 *       <td>The Unicode characters that are not in the US-ASCII character set,
 *           are not control characters (according to the {@link
 *           java.lang.Character#isISOControl(char) Character.isISOControl}
 *           method), and are not space characters (according to the {@link
 *           java.lang.Character#isSpaceChar(char) Character.isSpaceChar}
 *           method)&nbsp;&nbsp;<i>(<b>Deviation from RFC 2396</b>, which is
 *           limited to US-ASCII)</i></td></tr>
 * </table></blockquote>
 *
 * <p><a name="legal-chars"></a> The set of all legal URI characters consists of
 * the <i>unreserved</i>, <i>reserved</i>, <i>escaped</i>, and <i>other</i>
 * characters.
 *
 *
 * <h4> Escaped octets, quotation, encoding, and decoding </h4>
 *
 * RFC 2396 allows escaped octets to appear in the user-info, path, query, and
 * fragment components.  Escaping serves two purposes in URIs:
 *
 * <ul>
 *
 *   <li><p> To <i>encode</i> non-US-ASCII characters when a URI is required to
 *   conform strictly to RFC&nbsp;2396 by not containing any <i>other</i>
 *   characters.  </p></li>
 *
 *   <li><p> To <i>quote</i> characters that are otherwise illegal in a
 *   component.  The user-info, path, query, and fragment components differ
 *   slightly in terms of which characters are considered legal and illegal.
 *   </p></li>
 *
 * </ul>
 *
 * These purposes are served in this class by three related operations:
 *
 * <ul>
 *
 *   <li><p><a name="encode"></a> A character is <i>encoded</i> by replacing it
 *   with the sequence of escaped octets that represent that character in the
 *   UTF-8 character set.  The Euro currency symbol ({@code '\u005Cu20AC'}),
 *   for example, is encoded as {@code "%E2%82%AC"}.  <i>(<b>Deviation from
 *   RFC&nbsp;2396</b>, which does not specify any particular character
 *   set.)</i> </p></li>
 *
 *   <li><p><a name="quote"></a> An illegal character is <i>quoted</i> simply by
 *   encoding it.  The space character, for example, is quoted by replacing it
 *   with {@code "%20"}.  UTF-8 contains US-ASCII, hence for US-ASCII
 *   characters this transformation has exactly the effect required by
 *   RFC&nbsp;2396. </p></li>
 *
 *   <li><p><a name="decode"></a>
 *   A sequence of escaped octets is <i>decoded</i> by
 *   replacing it with the sequence of characters that it represents in the
 *   UTF-8 character set.  UTF-8 contains US-ASCII, hence decoding has the
 *   effect of de-quoting any quoted US-ASCII characters as well as that of
 *   decoding any encoded non-US-ASCII characters.  If a <a
 *   href="../nio/charset/CharsetDecoder.html#ce">decoding error</a> occurs
 *   when decoding the escaped octets then the erroneous octets are replaced by
 *   {@code '\u005CuFFFD'}, the Unicode replacement character.  </p></li>
 *
 * </ul>
 *
 * These operations are exposed in the constructors and methods of this class
 * as follows:
 *
 * <ul>
 *
 *   <li><p> The {@linkplain #URI(java.lang.String) single-argument
 *   constructor} requires any illegal characters in its argument to be
 *   quoted and preserves any escaped octets and <i>other</i> characters that
 *   are present.  </p></li>
 *
 *   <li><p> The {@linkplain
 *   #URI(java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,java.lang.String,java.lang.String)
 *   multi-argument constructors} quote illegal characters as
 *   required by the components in which they appear.  The percent character
 *   ({@code '%'}) is always quoted by these constructors.  Any <i>other</i>
 *   characters are preserved.  </p></li>
 *
 *   <li><p> The {@link #getRawUserInfo() getRawUserInfo}, {@link #getRawPath()
 *   getRawPath}, {@link #getRawQuery() getRawQuery}, {@link #getRawFragment()
 *   getRawFragment}, {@link #getRawAuthority() getRawAuthority}, and {@link
 *   #getRawSchemeSpecificPart() getRawSchemeSpecificPart} methods return the
 *   values of their corresponding components in raw form, without interpreting
 *   any escaped octets.  The strings returned by these methods may contain
 *   both escaped octets and <i>other</i> characters, and will not contain any
 *   illegal characters.  </p></li>
 *
 *   <li><p> The {@link #getUserInfo() getUserInfo}, {@link #getPath()
 *   getPath}, {@link #getQuery() getQuery}, {@link #getFragment()
 *   getFragment}, {@link #getAuthority() getAuthority}, and {@link
 *   #getSchemeSpecificPart() getSchemeSpecificPart} methods decode any escaped
 *   octets in their corresponding components.  The strings returned by these
 *   methods may contain both <i>other</i> characters and illegal characters,
 *   and will not contain any escaped octets.  </p></li>
 *
 *   <li><p> The {@link #toString() toString} method returns a URI string with
 *   all necessary quotation but which may contain <i>other</i> characters.
 *   </p></li>
 *
 *   <li><p> The {@link #toASCIIString() toASCIIString} method returns a fully
 *   quoted and encoded URI string that does not contain any <i>other</i>
 *   characters.  </p></li>
 *
 * </ul>
 *
 *
 * <h4> Identities </h4>
 *
 * For any URI <i>u</i>, it is always the case that
 *
 * <blockquote>
 * {@code new URI(}<i>u</i>{@code .toString()).equals(}<i>u</i>{@code )}&nbsp;.
 * </blockquote>
 *
 * For any URI <i>u</i> that does not contain redundant syntax such as two
 * slashes before an empty authority (as in {@code file:///tmp/}&nbsp;) or a
 * colon following a host name but no port (as in
 * {@code http://java.sun.com:}&nbsp;), and that does not encode characters
 * except those that must be quoted, the following identities also hold:
 * <pre>
 *     new URI(<i>u</i>.getScheme(),
 *             <i>u</i>.getSchemeSpecificPart(),
 *             <i>u</i>.getFragment())
 *     .equals(<i>u</i>)</pre>
 * in all cases,
 * <pre>
 *     new URI(<i>u</i>.getScheme(),
 *             <i>u</i>.getUserInfo(), <i>u</i>.getAuthority(),
 *             <i>u</i>.getPath(), <i>u</i>.getQuery(),
 *             <i>u</i>.getFragment())
 *     .equals(<i>u</i>)</pre>
 * if <i>u</i> is hierarchical, and
 * <pre>
 *     new URI(<i>u</i>.getScheme(),
 *             <i>u</i>.getUserInfo(), <i>u</i>.getHost(), <i>u</i>.getPort(),
 *             <i>u</i>.getPath(), <i>u</i>.getQuery(),
 *             <i>u</i>.getFragment())
 *     .equals(<i>u</i>)</pre>
 * if <i>u</i> is hierarchical and has either no authority or a server-based
 * authority.
 *
 *
 * <h4> URIs, URLs, and URNs </h4>
 *
 * A URI is a uniform resource <i>identifier</i> while a URL is a uniform
 * resource <i>locator</i>.  Hence every URL is a URI, abstractly speaking, but
 * not every URI is a URL.  This is because there is another subcategory of
 * URIs, uniform resource <i>names</i> (URNs), which name resources but do not
 * specify how to locate them.  The {@code mailto}, {@code news}, and
 * {@code isbn} URIs shown above are examples of URNs.
 *
 * <p> The conceptual distinction between URIs and URLs is reflected in the
 * differences between this class and the {@link URL} class.
 *
 * <p> An instance of this class represents a URI reference in the syntactic
 * sense defined by RFC&nbsp;2396.  A URI may be either absolute or relative.
 * A URI string is parsed according to the generic syntax without regard to the
 * scheme, if any, that it specifies.  No lookup of the host, if any, is
 * performed, and no scheme-dependent stream handler is constructed.  Equality,
 * hashing, and comparison are defined strictly in terms of the character
 * content of the instance.  In other words, a URI instance is little more than
 * a structured string that supports the syntactic, scheme-independent
 * operations of comparison, normalization, resolution, and relativization.
 *
 * <p> An instance of the {@link URL} class, by contrast, represents the
 * syntactic components of a URL together with some of the information required
 * to access the resource that it describes.  A URL must be absolute, that is,
 * it must always specify a scheme.  A URL string is parsed according to its
 * scheme.  A stream handler is always established for a URL, and in fact it is
 * impossible to create a URL instance for a scheme for which no handler is
 * available.  Equality and hashing depend upon both the scheme and the
 * Internet address of the host, if any; comparison is not defined.  In other
 * words, a URL is a structured string that supports the syntactic operation of
 * resolution as well as the network I/O operations of looking up the host and
 * opening a connection to the specified resource.
 *
 *
 * @author Mark Reinhold
 * @since 1.4
 *
 * @see <a href="http://www.ietf.org/rfc/rfc2279.txt"><i>RFC&nbsp;2279: UTF-8, a
 * transformation format of ISO 10646</i></a>, <br><a
 * href="http://www.ietf.org/rfc/rfc2373.txt"><i>RFC&nbsp;2373: IPv6 Addressing
 * Architecture</i></a>, <br><a
 * href="http://www.ietf.org/rfc/rfc2396.txt"><i>RFC&nbsp;2396: Uniform
 * Resource Identifiers (URI): Generic Syntax</i></a>, <br><a
 * href="http://www.ietf.org/rfc/rfc2732.txt"><i>RFC&nbsp;2732: Format for
 * Literal IPv6 Addresses in URLs</i></a>, <br><a
 * href="URISyntaxException.html">URISyntaxException</a>
 */
