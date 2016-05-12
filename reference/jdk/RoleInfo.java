_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private void writeObject(ObjectOutputStream out)

    /**
     * Serializes a {@link RoleInfo} to an {@link ObjectOutputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes a {@link RoleInfo} from an {@link ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public String toString() {

    /**
     * Returns a string describing the role info.
     *
     * @return a description of the role info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public boolean checkMaxDegree(int value) {

    /**
     * Returns true if the <tt>value</tt> parameter is lower than or equal to
     * the expected maximum degree, false otherwise.
     *
     * @param value  the value to be checked
     *
     * @return true if lower than or equal to maximum degree, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public boolean checkMinDegree(int value) {

    /**
     * Returns true if the <tt>value</tt> parameter is greater than or equal to
     * the expected minimum degree, false otherwise.
     *
     * @param value  the value to be checked
     *
     * @return true if greater than or equal to minimum degree, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public String getRefMBeanClassName() {

    /**
     * <p>Returns name of type of MBean expected to be referenced in
     * corresponding role.</p>
     *
     * @return the name of the referenced type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public int getMaxDegree() {

    /**
     * Returns maximum degree for corresponding role reference.
     *
     * @return the maximum degree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public int getMinDegree() {

    /**
     * Returns minimum degree for corresponding role reference.
     *
     * @return the minimum degree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public String getDescription() {

    /**
     * Returns description text for the role.
     *
     * @return the description of the role.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public boolean isWritable() {

    /**
     * Returns write access mode for the role (true if it is writable).
     *
     * @return true if the role is writable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public boolean isReadable() {

    /**
     * Returns read access mode for the role (true if it is readable).
     *
     * @return true if the role is readable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public String getName() {

    /**
     * Returns the name of the role.
     *
     * @return the name of the role.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public RoleInfo(RoleInfo roleInfo)

    /**
     * Copy constructor.
     *
     * @param roleInfo the <tt>RoleInfo</tt> instance to be copied.
     *
     * @exception IllegalArgumentException  if null parameter
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public RoleInfo(String roleName,
                    String mbeanClassName)

    /**
     * Constructor.
     *
     * @param roleName  name of the role
     * @param mbeanClassName  name of the class of MBean(s) expected to
     * be referenced in corresponding role.  If an MBean <em>M</em> is in
     * this role, then the MBean server must return true for
     * {@link MBeanServer#isInstanceOf isInstanceOf(M, mbeanClassName)}.
     *
     * <P>IsReadable and IsWritable defaulted to true.
     * <P>Minimum and maximum degrees defaulted to 1.
     * <P>Description of role defaulted to null.
     *
     * @exception IllegalArgumentException  if null parameter
     * @exception ClassNotFoundException As of JMX 1.2, this exception
     * can no longer be thrown.  It is retained in the declaration of
     * this class for compatibility with existing code.
     * @exception NotCompliantMBeanException As of JMX 1.2, this
     * exception can no longer be thrown.  It is retained in the
     * declaration of this class for compatibility with existing code.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public RoleInfo(String roleName,
                    String mbeanClassName,
                    boolean read,
                    boolean write)

    /**
     * Constructor.
     *
     * @param roleName  name of the role
     * @param mbeanClassName  name of the class of MBean(s) expected to
     * be referenced in corresponding role.  If an MBean <em>M</em> is in
     * this role, then the MBean server must return true for
     * {@link MBeanServer#isInstanceOf isInstanceOf(M, mbeanClassName)}.
     * @param read  flag to indicate if the corresponding role
     * can be read
     * @param write  flag to indicate if the corresponding role
     * can be set
     *
     * <P>Minimum and maximum degrees defaulted to 1.
     * <P>Description of role defaulted to null.
     *
     * @exception IllegalArgumentException  if null parameter
     * @exception ClassNotFoundException As of JMX 1.2, this exception
     * can no longer be thrown.  It is retained in the declaration of
     * this class for compatibility with existing code.
     * @exception NotCompliantMBeanException As of JMX 1.2, this
     * exception can no longer be thrown.  It is retained in the
     * declaration of this class for compatibility with existing code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public RoleInfo(String roleName,
                    String mbeanClassName,
                    boolean read,
                    boolean write,
                    int min,
                    int max,
                    String descr)

    /**
     * Constructor.
     *
     * @param roleName  name of the role.
     * @param mbeanClassName  name of the class of MBean(s) expected to
     * be referenced in corresponding role.  If an MBean <em>M</em> is in
     * this role, then the MBean server must return true for
     * {@link MBeanServer#isInstanceOf isInstanceOf(M, mbeanClassName)}.
     * @param read  flag to indicate if the corresponding role
     * can be read
     * @param write  flag to indicate if the corresponding role
     * can be set
     * @param min  minimum degree for role, i.e. minimum number of
     * MBeans to provide in corresponding role
     * Must be less than or equal to <tt>max</tt>.
     * (ROLE_CARDINALITY_INFINITY for unlimited)
     * @param max  maximum degree for role, i.e. maximum number of
     * MBeans to provide in corresponding role
     * Must be greater than or equal to <tt>min</tt>
     * (ROLE_CARDINALITY_INFINITY for unlimited)
     * @param descr  description of the role (can be null)
     *
     * @exception IllegalArgumentException  if null parameter
     * @exception InvalidRoleInfoException  if the minimum degree is
     * greater than the maximum degree.
     * @exception ClassNotFoundException As of JMX 1.2, this exception
     * can no longer be thrown.  It is retained in the declaration of
     * this class for compatibility with existing code.
     * @exception NotCompliantMBeanException  if the class mbeanClassName
     * is not a MBean class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private String referencedMBeanClassName = null;

    /**
     * @serial Name of class of MBean(s) expected to be referenced in corresponding role
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private int maxDegree;

    /**
     * @serial Maximum degree (i.e. maximum number of referenced MBeans in corresponding role)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private int minDegree;

    /**
     * @serial Minimum degree (i.e. minimum number of referenced MBeans in corresponding role)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private String description = null;

    /**
     * @serial Role description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private boolean isWritable;

    /**
     * @serial Write access mode: <code>true</code> if role is writable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private boolean isReadable;

    /**
     * @serial Read access mode: <code>true</code> if role is readable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private String name = null;

    /**
     * @serial Role name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    public static final int ROLE_CARDINALITY_INFINITY = -1;

    /**
     * To specify an unlimited cardinality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
    private static final ObjectStreamField[] serialPersistentFields;

    /**
     * @serialField name String Role name
     * @serialField isReadable boolean Read access mode: <code>true</code> if role is readable
     * @serialField isWritable boolean Write access mode: <code>true</code> if role is writable
     * @serialField description String Role description
     * @serialField minDegree int Minimum degree (i.e. minimum number of referenced MBeans in corresponding role)
     * @serialField maxDegree int Maximum degree (i.e. maximum number of referenced MBeans in corresponding role)
     * @serialField referencedMBeanClassName String Name of class of MBean(s) expected to be referenced in corresponding role
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleInfo.java
@SuppressWarnings("serial")  // serialVersionUID not constant

/**
 * A RoleInfo object summarises a role in a relation type.
 *
 * <p>The <b>serialVersionUID</b> of this class is <code>2504952983494636987L</code>.
 *
 * @since 1.5
 */
