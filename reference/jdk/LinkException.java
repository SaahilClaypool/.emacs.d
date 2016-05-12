_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    private static final long serialVersionUID = -7967662604076777712L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public String toString(boolean detail) {

    /**
     * Generates the string representation of this exception.
     * This string consists of the NamingException information plus
     * the additional information of resolving the link.
     * If 'detail' is true, the string also contains information on
     * the link resolved object. If false, this method is the same
     * as the form of toString() that accepts no parameters.
     * This string is used for debugging and not meant to be interpreted
     * programmatically.
     *
     * @param   detail  If true, add information about the link resolved
     *                  object.
     * @return The non-null string representation of this link exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public String toString() {

    /**
     * Generates the string representation of this exception.
     * This string consists of the NamingException information plus
     * the link's remaining name.
     * This string is used for debugging and not meant to be interpreted
     * programmatically.
     * @return The non-null string representation of this link exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public void setLinkResolvedObj(Object obj) {

    /**
     * Sets the link resolved object field of this exception.
     * This indicates the last successfully resolved object of link name.
     * @param obj The object to set link resolved object to. This can be null.
     *            If null, the link resolved object field is set to null.
     * @see #getLinkResolvedObj
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public void setLinkRemainingName(Name name) {

    /**
     * Sets the remaining link name field of this exception.
     *<p>
     * <tt>name</tt> is a composite name. If the intent is to set
     * this field using a compound name or string, you must
     * "stringify" the compound name, and create a composite
     * name with a single component using the string. You can then
     * invoke this method using the resulting composite name.
     *<p>
     * A copy of <code>name</code> is made and stored.
     * Subsequent changes to <code>name</code> does not
     * affect the copy in this NamingException and vice versa.
     *
     * @param name The name to set remaining link name to. This can be null.
     *  If null, it sets the remaining name field to null.
     * @see #getLinkRemainingName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public void setLinkResolvedName(Name name) {

    /**
     * Sets the resolved link name field of this exception.
     *<p>
     * <tt>name</tt> is a composite name. If the intent is to set
     * this field using a compound name or string, you must
     * "stringify" the compound name, and create a composite
     * name with a single component using the string. You can then
     * invoke this method using the resulting composite name.
     *<p>
     * A copy of <code>name</code> is made and stored.
     * Subsequent changes to <code>name</code> does not
     * affect the copy in this NamingException and vice versa.
     *
     *
     * @param name The name to set resolved link name to. This can be null.
     *          If null, it sets the link resolved name field to null.
     * @see #getLinkResolvedName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public void setLinkExplanation(String msg) {

    /**
      * Sets the explanation associated with the problem encounter
      * when resolving a link.
      *
      * @param msg The possibly null detail string explaining more about the problem
      * with resolving a link. If null, it means no detail will be recorded.
      * @see #getLinkExplanation
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public String getLinkExplanation() {

    /**
      * Retrieves the explanation associated with the problem encounter
      * when resolving a link.
      *
      * @return The possibly null detail string explaining more about the problem
      * with resolving a link.
      *         If null, it means there is no
      *         link detail message for this exception.
      * @see #setLinkExplanation
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public Object getLinkResolvedObj() {

    /**
     * Retrieves the object to which resolution was successful.
     * This is the object to which the resolved link name is bound.
     *
     * @return The possibly null object that was resolved so far.
     * If null, it means the link resolved object field has not been set.
     * @see #getLinkResolvedName
     * @see #setLinkResolvedObj
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public Name getLinkRemainingName() {

    /**
     * Retrieves the remaining unresolved portion of the link name.
     * @return The part of the link name that has not been resolved.
     *          It is a composite name. It can be null, which means
     *          the link remaining name field has not been set.
     * @see #setLinkRemainingName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public Name getLinkResolvedName() {

    /**
     * Retrieves the leading portion of the link name that was resolved
     * successfully.
     *
     * @return The part of the link name that was resolved successfully.
     *          It is a composite name. It can be null, which means
     *          the link resolved name field has not been set.
     * @see #getLinkResolvedObj
     * @see #setLinkResolvedName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public LinkException() {

    /**
      * Constructs a new instance of LinkException.
      * All the non-link-related and link-related fields are initialized to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    public LinkException(String explanation) {

    /**
      * Constructs a new instance of LinkException with an explanation
      * All the other fields are initialized to null.
      * @param  explanation     A possibly null string containing additional
      *                         detail about this exception.
      * @see java.lang.Throwable#getMessage
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    protected String linkExplanation;

    /**
     * Contains the exception of why resolution of the link failed.
     * Can be null. This field is initialized by the constructors.
     * You should access and manipulate this field
     * through its get and set methods.
     * @serial
     * @see #getLinkExplanation
     * @see #setLinkExplanation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    protected Name linkRemainingName;

    /**
     * Contains the remaining link name that has not been resolved yet.
     * It is a composite name and can be null.
     * This field is initialized by the constructors.
     * You should access and manipulate this field
     * through its get and set methods.
     * @serial
     * @see #getLinkRemainingName
     * @see #setLinkRemainingName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    protected Object linkResolvedObj;

    /**
      * Contains the object to which resolution of the part of the link was successful.
      * Can be null. This field is initialized by the constructors.
      * You should access and manipulate this field
      * through its get and set methods.
      * @serial
      * @see #getLinkResolvedObj
      * @see #setLinkResolvedObj
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
    protected Name linkResolvedName;

    /**
     * Contains the part of the link that has been successfully resolved.
     * It is a composite name and can be null.
     * This field is initialized by the constructors.
     * You should access and manipulate this field
     * through its get and set methods.
     * @serial
     * @see #getLinkResolvedName
     * @see #setLinkResolvedName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkException.java
  /*<p>

/**
 * This exception is used to describe problems encounter while resolving links.
 * Addition information is added to the base NamingException for pinpointing
 * the problem with the link.
 *<p>
 * Analogous to how NamingException captures name resolution information,
 * LinkException captures "link"-name resolution information pinpointing
 * the problem encountered while resolving a link. All these fields may
 * be null.
 * <ul>
 * <li> Link Resolved Name. Portion of link name that has been resolved.
 * <li> Link Resolved Object. Object to which resolution of link name proceeded.
 * <li> Link Remaining Name. Portion of link name that has not been resolved.
 * <li> Link Explanation. Detail explaining why link resolution failed.
 *</ul>
 *
  *<p>
  * A LinkException instance is not synchronized against concurrent
  * multithreaded access. Multiple threads trying to access and modify
  * a single LinkException instance should lock the object.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see Context#lookupLink
  * @see LinkRef
  * @since 1.3
  */
