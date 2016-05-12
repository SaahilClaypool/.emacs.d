_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes a {@link Role} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link Role} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    public static String roleValueToString(List<ObjectName> roleValue)

    /**
     * Returns a string for the given role value.
     *
     * @param roleValue  List of ObjectName objects
     *
     * @return A String consisting of the ObjectNames separated by
     * newlines (\n).
     *
     * @exception IllegalArgumentException  if null parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    public Object clone() {

    /**
     * Clone the role object.
     *
     * @return a Role that is an independent copy of the current Role object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    public String toString() {

    /**
     * Returns a string describing the role.
     *
     * @return the description of the role.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    public void setRoleValue(List<ObjectName> roleValue)

    /**
     * Sets role value.
     *
     * @param roleValue  List of ObjectName objects for referenced
     * MBeans.
     *
     * @exception IllegalArgumentException  if null parameter
     *
     * @see #getRoleValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    public void setRoleName(String roleName)

    /**
     * Sets role name.
     *
     * @param roleName  role name
     *
     * @exception IllegalArgumentException  if null parameter
     *
     * @see #getRoleName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    public List<ObjectName> getRoleValue() {

    /**
     * Retrieves role value.
     *
     * @return ArrayList of ObjectName objects for referenced MBeans.
     *
     * @see #setRoleValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    public Role(String roleName,
                List<ObjectName> roleValue)

    /**
     * <p>Make a new Role object.
     * No check is made that the ObjectNames in the role value exist in
     * an MBean server.  That check will be made when the role is set
     * in a relation.
     *
     * @param roleName  role name
     * @param roleValue  role value (List of ObjectName objects)
     *
     * @exception IllegalArgumentException  if null parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    private List<ObjectName> objectNameList = new ArrayList<ObjectName>();

    /**
     * @serial {@link List} of {@link ObjectName}s of referenced MBeans
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    private String name = null;

    /**
     * @serial Role name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField name String Role name
     * @serialField objectNameList List {@link List} of {@link ObjectName}s of referenced MBeans
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/Role.java
@SuppressWarnings("serial")  // serialVersionUID not constant

/**
 * Represents a role: includes a role name and referenced MBeans (via their
 * ObjectNames). The role value is always represented as an ArrayList
 * collection (of ObjectNames) to homogenize the access.
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>-279985518429862552L</code>.
 *
 * @since 1.5
 */
