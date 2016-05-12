_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/ModificationItem.java
    private static final long serialVersionUID = 7573258562534746850L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/ModificationItem.java
    public String toString() {

    /**
      * Generates the string representation of this modification item,
      * which consists of the modification operation and its related attribute.
      * The string representation is meant for debugging and not to be
      * interpreted programmatically.
      *
      * @return The non-null string representation of this modification item.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/ModificationItem.java
    public Attribute getAttribute() {

    /**
      * Retrieves the attribute associated with this modification item.
      * @return The non-null attribute to use for the modification.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/ModificationItem.java
    public int getModificationOp() {

    /**
      * Retrieves the modification code of this modification item.
      * @return The modification code.  It is one of:
      *         DirContext.ADD_ATTRIBUTE
      *         DirContext.REPLACE_ATTRIBUTE
      *         DirContext.REMOVE_ATTRIBUTE
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/ModificationItem.java
    public ModificationItem(int mod_op, Attribute attr) {

    /**
      * Creates a new instance of ModificationItem.
      * @param mod_op Modification to apply.  It must be one of:
      *         DirContext.ADD_ATTRIBUTE
      *         DirContext.REPLACE_ATTRIBUTE
      *         DirContext.REMOVE_ATTRIBUTE
      * @param attr     The non-null attribute to use for modification.
      * @exception IllegalArgumentException If attr is null, or if mod_op is
      *         not one of the ones specified above.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/ModificationItem.java
    private int mod_op;

    /**
     * Contains an integer identify the modification
     * to be performed.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/ModificationItem.java
/*

/**
  * This class represents a modification item.
  * It consists of a modification code and an attribute on which to operate.
  *<p>
  * A ModificationItem instance is not synchronized against concurrent
  * multithreaded access. Multiple threads trying to access and modify
  * a single ModificationItem instance should lock the object.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
