_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes a {@link RoleUnresolved} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link RoleUnresolved} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    public String toString() {

    /**
     * Return a string describing this object.
     *
     * @return a description of this RoleUnresolved object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    public Object clone() {

    /**
     * Clone this object.
     *
     * @return an independent clone.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    public void setProblemType(int pbType)

    /**
     * Sets problem type.
     *
     * @param pbType  integer corresponding to a problem. Must be one of
     * those described as static final members of current class.
     *
     * @exception IllegalArgumentException  if incorrect problem type
     *
     * @see #getProblemType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    public void setRoleValue(List<ObjectName> value) {

    /**
     * Sets role value.
     *
     * @param value  List of ObjectName objects for referenced
     * MBeans not set in role.
     *
     * @see #getRoleValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    public void setRoleName(String name)

    /**
     * Sets role name.
     *
     * @param name the new role name.
     *
     * @exception IllegalArgumentException  if null parameter
     *
     * @see #getRoleName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    public int getProblemType() {

    /**
     * Retrieves problem type.
     *
     * @return an integer corresponding to a problem, those being described as
     * static final members of current class.
     *
     * @see #setProblemType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    public List<ObjectName> getRoleValue() {

    /**
     * Retrieves role value.
     *
     * @return an ArrayList of ObjectName objects, the one provided to be set
     * in given role. Null if the unresolved role is returned for a read
     * access.
     *
     * @see #setRoleValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    public String getRoleName() {

    /**
     * Retrieves role name.
     *
     * @return the role name.
     *
     * @see #setRoleName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    public RoleUnresolved(String name,
                          List<ObjectName> value,
                          int pbType)

    /**
     * Constructor.
     *
     * @param name  name of the role
     * @param value  value of the role (if problem when setting the
     * role)
     * @param pbType  type of problem (according to known problem types,
     * listed as static final members).
     *
     * @exception IllegalArgumentException  if null parameter or incorrect
     * problem type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    private int problemType;

    /**
     * @serial Problem type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    private List<ObjectName> roleValue = null;

    /**
     * @serial Role value ({@link List} of {@link ObjectName} objects)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    private String roleName = null;

    /**
     * @serial Role name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
    private static final ObjectStreamField[] serialPersistentFields;

    /** @serialField roleName String Role name
     *  @serialField roleValue List Role value ({@link List} of {@link ObjectName} objects)
     *  @serialField problemType int Problem type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolved.java
@SuppressWarnings("serial")  // serialVersionUID not constant

/**
 * Represents an unresolved role: a role not retrieved from a relation due
 * to a problem. It provides the role name, value (if problem when trying to
 * set the role) and an integer defining the problem (constants defined in
 * RoleStatus).
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>-48350262537070138L</code>.
 *
 * @since 1.5
 */
