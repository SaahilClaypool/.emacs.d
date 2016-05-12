_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    private static final long serialVersionUID = -2480540967773454797L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public void setReturningAttributes(String[] attrs) {

    /**
     * Specifies the attributes that will be returned as part of the search.
     *<p>
     * null indicates that all attributes will be returned.
     * An empty array indicates no attributes are returned.
     *
     * @param attrs An array of attribute ids identifying the attributes that
     *              will be returned. Can be null.
     * @see #getReturningAttributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public void setCountLimit(long limit) {

    /**
     * Sets the maximum number of entries to be returned
     * as a result of the search.
     *<p>
     * 0 indicates no limit:  all entries will be returned.
     *
     * @param limit The maximum number of entries that will be returned.
     * @see #getCountLimit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public void setReturningObjFlag(boolean on) {

    /**
     * Enables/disables returning objects returned as part of the result.
     *<p>
     * If disabled, only the name and class of the object is returned.
     * If enabled, the object will be returned.
     *
     * @param on        if true, objects will be returned; if false,
     *                  objects will not be returned.
     * @see #getReturningObjFlag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public void setDerefLinkFlag(boolean on) {

    /**
     * Enables/disables link dereferencing during the search.
     *
     * @param on        if true links will be dereferenced; if false, not followed.
     * @see #getDerefLinkFlag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public void setTimeLimit(int ms) {

    /**
     * Sets the time limit of these SearchControls in milliseconds.
     *<p>
     * If the value is 0, this means to wait indefinitely.
     * @param ms        The time limit of these SearchControls in milliseconds.
     * @see #getTimeLimit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public void setSearchScope(int scope) {

    /**
     * Sets the search scope to one of:
     * OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE.
     * @param scope     The search scope of this SearchControls.
     * @see #getSearchScope
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public String[] getReturningAttributes() {

    /**
     * Retrieves the attributes that will be returned as part of the search.
     *<p>
     * A value of null indicates that all attributes will be returned.
     * An empty array indicates that no attributes are to be returned.
     *
     * @return An array of attribute ids identifying the attributes that
     * will be returned. Can be null.
     * @see #setReturningAttributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public long getCountLimit() {

    /**
     * Retrieves the maximum number of entries that will be returned
     * as a result of the search.
     *<p>
     * 0 indicates that all entries will be returned.
     * @return The maximum number of entries that will be returned.
     * @see #setCountLimit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public boolean getReturningObjFlag() {

    /**
     * Determines whether objects will be returned as part of the result.
     *
     * @return true if objects will be returned; false otherwise.
     * @see #setReturningObjFlag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public boolean getDerefLinkFlag() {

    /**
     * Determines whether links will be dereferenced during the search.
     *
     * @return true if links will be dereferenced; false otherwise.
     * @see #setDerefLinkFlag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public int getTimeLimit() {

    /**
     * Retrieves the time limit of these SearchControls in milliseconds.
     *<p>
     * If the value is 0, this means to wait indefinitely.
     * @return The time limit of these SearchControls in milliseconds.
     * @see #setTimeLimit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public int getSearchScope() {

    /**
     * Retrieves the search scope of these SearchControls.
     *<p>
     * One of OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE.
     *
     * @return The search scope of this SearchControls.
     * @see #setSearchScope
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public SearchControls(int scope,
                             long countlim,
                             int timelim,
                             String[] attrs,
                             boolean retobj,
                             boolean deref) {

    /**
     * Constructs a search constraints using arguments.
     * @param scope     The search scope.  One of:
     *                  OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE.
     * @param timelim   The number of milliseconds to wait before returning.
     *                  If 0, wait indefinitely.
     * @param deref     If true, dereference links during search.
     * @param countlim  The maximum number of entries to return.  If 0, return
     *                  all entries that satisfy filter.
     * @param retobj    If true, return the object bound to the name of the
     *                  entry; if false, do not return object.
     * @param attrs     The identifiers of the attributes to return along with
     *                  the entry.  If null, return all attributes. If empty
     *                  return no attributes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public SearchControls() {

    /**
     * Constructs a search constraints using defaults.
     *<p>
     * The defaults are:
     * <ul>
     * <li>search one level
     * <li>no maximum return limit for search results
     * <li>no time limit for search
     * <li>return all attributes associated with objects that satisfy
     *   the search filter.
     * <li>do not return named object  (return only name and class)
     * <li>do not dereference links during search
     *</ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    private String[] attributesToReturn;

    /**
     *  Contains the list of attributes to be returned in
     * <tt>SearchResult</tt> for each matching entry of search. <tt>null</tt>
     * indicates that all attributes are to be returned.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    private long countLimit;

    /**
     * Contains the maximum number of SearchResults to return.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    private boolean returnObj;

    /**
     *  Indicates whether object is returned in <tt>SearchResult</tt>.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    private boolean derefLink;

    /**
     * Indicates whether JNDI links are dereferenced during
     * search.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    private int timeLimit;

    /**
     * Contains the milliseconds to wait before returning
     * from search.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    private int searchScope;

    /**
     * Contains the scope with which to apply the search. One of
     * <tt>ONELEVEL_SCOPE</tt>, <tt>OBJECT_SCOPE</tt>, or
     * <tt>SUBTREE_SCOPE</tt>.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
    public final static int ONELEVEL_SCOPE = 1;

    /**
     * Search one level of the named context.
     *<p>
     * The NamingEnumeration that results from search()
     * using ONELEVEL_SCOPE contains elements with
     * objects in the named context that satisfy
     * the search filter specified in search().
     * The names of elements in the NamingEnumeration are atomic names
     * relative to the named context.
     * <p>
     * The value of this constant is <tt>1</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/SearchControls.java
public class SearchControls implements java.io.Serializable {

/**
  * This class encapsulates
  * factors that determine scope of search and what gets returned
  * as a result of the search.
  *<p>
  * A SearchControls instance is not synchronized against concurrent
  * multithreaded access. Multiple threads trying to access and modify
  * a single SearchControls instance should lock the object.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
