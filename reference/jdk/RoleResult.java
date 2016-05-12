_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes a {@link RoleResult} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link RoleResult} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    public void setRolesUnresolved(RoleUnresolvedList unresolvedList) {

    /**
     * Sets list of roles unsuccessfully accessed.
     *
     * @param unresolvedList  list of roles unsuccessfully accessed
     *
     * @see #getRolesUnresolved
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    public void setRoles(RoleList list) {

    /**
     * Sets list of roles successfully accessed.
     *
     * @param list  list of roles successfully accessed
     *
     * @see #getRoles
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    public RoleUnresolvedList getRolesUnresolved() {

    /**
     * Retrieves list of roles unsuccessfully accessed.
     *
     * @return a RoleUnresolvedList.
     *
     * @see #setRolesUnresolved
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    public RoleList getRoles() {

    /**
     * Retrieves list of roles successfully accessed.
     *
     * @return a RoleList
     *
     * @see #setRoles
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    public RoleResult(RoleList list,
                      RoleUnresolvedList unresolvedList) {

    /**
     * Constructor.
     *
     * @param list  list of roles successfully accessed.
     * @param unresolvedList  list of roles not accessed (with problem
     * descriptions).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    private RoleUnresolvedList unresolvedRoleList = null;

    /**
     * @serial List of roles unsuccessfully accessed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    private RoleList roleList = null;

    /**
     * @serial List of roles successfully accessed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField roleList RoleList List of roles successfully accessed
     * @serialField unresolvedRoleList RoleUnresolvedList List of roles unsuccessfully accessed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleResult.java
@SuppressWarnings("serial")

/**
 * Represents the result of a multiple access to several roles of a relation
 * (either for reading or writing).
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>-6304063118040985512L</code>.
 *
 * @since 1.5
 */
