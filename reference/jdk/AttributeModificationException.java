_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/AttributeModificationException.java
    private static final long serialVersionUID = 8060676069678710186L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/AttributeModificationException.java
    public String toString() {

    /**
      * The string representation of this exception consists of
      * information about where the error occurred, and
      * the first unexecuted modification.
      * This string is meant for debugging and not mean to be interpreted
      * programmatically.
      * @return The non-null string representation of this exception.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/AttributeModificationException.java
    public ModificationItem[] getUnexecutedModifications() {

    /**
      * Retrieves the unexecuted modification list.
      * Items in the list appear in the same order in which they were
      * originally supplied in DirContext.modifyAttributes().
      * The first item in the list is the first one that was not executed.
      * If this list is null, none of the operations originally submitted
      * to modifyAttributes() were executed.

      * @return The possibly null unexecuted modification list.
      * @see #setUnexecutedModifications
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/AttributeModificationException.java
    public void setUnexecutedModifications(ModificationItem[] e) {

    /**
      * Sets the unexecuted modification list to be e.
      * Items in the list must appear in the same order in which they were
      * originally supplied in DirContext.modifyAttributes().
      * The first item in the list is the first one that was not executed.
      * If this list is null, none of the operations originally submitted
      * to modifyAttributes() were executed.

      * @param e        The possibly null list of unexecuted modifications.
      * @see #getUnexecutedModifications
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/AttributeModificationException.java
    public AttributeModificationException() {

    /**
      * Constructs a new instance of AttributeModificationException.
      * All fields are set to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/AttributeModificationException.java
    public AttributeModificationException(String explanation) {

    /**
     * Constructs a new instance of AttributeModificationException using
     * an explanation. All other fields are set to null.
     *
     * @param   explanation     Possibly null additional detail about this exception.
     * If null, this exception has no detail message.

     * @see java.lang.Throwable#getMessage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/AttributeModificationException.java
    private ModificationItem[] unexecs = null;

    /**
     * Contains the possibly null list of unexecuted modifications.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/AttributeModificationException.java
/*

/**
  * This exception is thrown when an attempt is
  * made to add, or remove, or modify an attribute, its identifier,
  * or its values that conflicts with the attribute's (schema) definition
  * or the attribute's state.
  * It is thrown in response to DirContext.modifyAttributes().
  * It contains a list of modifications that have not been performed, in the
  * order that they were supplied to modifyAttributes().
  * If the list is null, none of the modifications were performed successfully.
  *<p>
  * An AttributeModificationException instance is not synchronized
  * against concurrent multithreaded access. Multiple threads trying
  * to access and modify a single AttributeModification instance
  * should lock the object.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see DirContext#modifyAttributes
  * @since 1.3
  */
