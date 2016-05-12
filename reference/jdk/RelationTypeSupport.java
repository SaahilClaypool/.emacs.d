_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes a {@link RelationTypeSupport} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link RelationTypeSupport} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    protected void addRoleInfo(RoleInfo roleInfo)

    /**
     * Add a role info.
     * This method of course should not be used after the creation of the
     * relation type, because updating it would invalidate that the relations
     * created associated to that type still conform to it.
     * Can throw a RuntimeException if trying to update a relation type
     * declared in the Relation Service.
     *
     * @param roleInfo  role info to be added.
     *
     * @exception IllegalArgumentException  if null parameter.
     * @exception InvalidRelationTypeException  if there is already a role
     *  info in current relation type with the same name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    public List<RoleInfo> getRoleInfos() {

    /**
     * Returns the list of role definitions (ArrayList of RoleInfo objects).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    public String getRelationTypeName() {

    /**
     * Returns the relation type name.
     *
     * @return the relation type name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    protected RelationTypeSupport(String relationTypeName)

    /**
     * Constructor to be used for subclasses.
     *
     * @param relationTypeName  Name of relation type.
     *
     * @exception IllegalArgumentException  if null parameter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    public RelationTypeSupport(String relationTypeName,
                            RoleInfo[] roleInfoArray)

    /**
     * Constructor where all role definitions are dynamically created and
     * passed as parameter.
     *
     * @param relationTypeName  Name of relation type
     * @param roleInfoArray  List of role definitions (RoleInfo objects)
     *
     * @exception IllegalArgumentException  if null parameter
     * @exception InvalidRelationTypeException  if:
     * <P>- the same name has been used for two different roles
     * <P>- no role info provided
     * <P>- one null role info provided
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    private boolean isInRelationService = false;

    /**
     * @serial Flag specifying whether the relation type has been declared in the
     *         Relation Service (so can no longer be updated)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    private Map<String,RoleInfo> roleName2InfoMap =

    /**
     * @serial {@link Map} holding the mapping:
     *           &lt;role name ({@link String})&gt; -&gt; &lt;role info ({@link RoleInfo} object)&gt;
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    private String typeName = null;

    /**
     * @serial Relation type name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField typeName String Relation type name
     * @serialField roleName2InfoMap Map {@link Map} holding the mapping:
     *              &lt;role name ({@link String})&gt; -&gt; &lt;role info ({@link RoleInfo} object)&gt;
     * @serialField isInRelationService boolean Flag specifying whether the relation type has been declared in the
     *              Relation Service (so can no longer be updated)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RelationTypeSupport.java
@SuppressWarnings("serial")  // serialVersionUID not constant

/**
 * A RelationTypeSupport object implements the RelationType interface.
 * <P>It represents a relation type, providing role information for each role
 * expected to be supported in every relation of that type.
 *
 * <P>A relation type includes a relation type name and a list of
 * role infos (represented by RoleInfo objects).
 *
 * <P>A relation type has to be declared in the Relation Service:
 * <P>- either using the createRelationType() method, where a RelationTypeSupport
 * object will be created and kept in the Relation Service
 * <P>- either using the addRelationType() method where the user has to create
 * an object implementing the RelationType interface, and this object will be
 * used as representing a relation type in the Relation Service.
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>4611072955724144607L</code>.
 *
 * @since 1.5
 */
