_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationType.java
    public RoleInfo getRoleInfo(String roleInfoName)

    /**
     * Returns the role info (RoleInfo object) for the given role info name
     * (null if not found).
     *
     * @param roleInfoName  role info name
     *
     * @return RoleInfo object providing role definition
     * does not exist
     *
     * @exception IllegalArgumentException  if null parameter
     * @exception RoleInfoNotFoundException  if no role info with that name in
     * relation type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationType.java
    public List<RoleInfo> getRoleInfos();

    /**
     * Returns the list of role definitions (ArrayList of RoleInfo objects).
     *
     * @return an {@link ArrayList} of {@link RoleInfo}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationType.java
    public String getRelationTypeName();

    /**
     * Returns the relation type name.
     *
     * @return the relation type name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationType.java
public interface RelationType extends Serializable {

/**
 * The RelationType interface has to be implemented by any class expected to
 * represent a relation type.
 *
 * @since 1.5
 */
