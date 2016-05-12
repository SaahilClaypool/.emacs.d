_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    public void setResolvedObj(Object obj) {

    /**
      * Sets the resolved Object field of this result to obj.
      *
      * @param obj The object to use for setting the resolved obj field.
      *            Cannot be null.
      * @see #getResolvedObj
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    public void appendRemainingComponent(String name) {

    /**
      * Adds a single component to the end of remaining name.
      *
      * @param name The component to add. Can be null.
      * @see #getRemainingName
      * @see #appendRemainingName
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    public void appendRemainingName(Name name) {

    /**
      * Adds components to the end of remaining name.
      *
      * @param name The components to add. Can be null.
      * @see #getRemainingName
      * @see #setRemainingName
      * @see #appendRemainingComponent
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    public void setRemainingName(Name name) {

    /**
      * Sets the remaining name field of this result to name.
      * A copy of name is made so that modifying the copy within
      * this ResolveResult does not affect <code>name</code> and
      * vice versa.
      *
      * @param name The name to set remaining name to. Cannot be null.
      * @see #getRemainingName
      * @see #appendRemainingName
      * @see #appendRemainingComponent
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    public Object getResolvedObj() {

    /**
     * Retrieves the Object to which resolution was successful.
     *
     * @return The Object to which resolution was successful. Cannot be null.
      * @see #setResolvedObj
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    public Name getRemainingName() {

    /**
     * Retrieves the remaining unresolved portion of the name.
     *
     * @return The remaining unresolved portion of the name.
     *          Cannot be null but empty OK.
     * @see #appendRemainingName
     * @see #appendRemainingComponent
     * @see #setRemainingName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    public ResolveResult(Object robj, Name rname) {

    /**
      * Constructs a new instance of ResolveResult consisting of
      * the resolved Object and the remaining name.
      *
      * @param robj The non-null Object resolved to.
      * @param rname The non-null remaining name that has yet to be resolved.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    public ResolveResult(Object robj, String rcomp) {

    /**
      * Constructs a new instance of ResolveResult consisting of
      * the resolved object and the remaining unresolved component.
      *
      * @param robj The non-null object resolved to.
      * @param rcomp The single remaining name component that has yet to be
      *                 resolved. Cannot be null (but can be empty).
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    protected ResolveResult() {

    /**
      * Constructs an instance of ResolveResult with the
      * resolved object and remaining name both initialized to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
    protected Name remainingName;

    /**
     * Field containing the remaining name yet to be resolved.
     * It can be null only when constructed using a subclass.
     * Constructors should always initialize this.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ResolveResult.java
public class ResolveResult implements java.io.Serializable {

/**
  * This class represents the result of resolution of a name.
  * It contains the object to which name was resolved, and the portion
  * of the name that has not been resolved.
  *<p>
  * A ResolveResult instance is not synchronized against concurrent
  * multithreaded access. Multiple threads trying to access and modify
  * a single ResolveResult instance should lock the object.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
