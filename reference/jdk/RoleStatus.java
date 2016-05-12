_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleStatus.java
    public static boolean isRoleStatus(int status) {

    /**
     * Returns true if given value corresponds to a known role status, false
     * otherwise.
     *
     * @param status a status code.
     *
     * @return true if this value is a known role status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleStatus.java
    public static final int REF_MBEAN_NOT_REGISTERED = 7;

    /**
     * Problem type when trying to set a role value including the ObjectName of
     * a MBean not registered in the MBean Server.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleStatus.java
    public static final int MORE_THAN_MAX_ROLE_DEGREE = 5;

    /**
     * Problem type when trying to set a role value with more ObjectNames than
     * the maximum expected cardinality.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleStatus.java
    public static final int ROLE_NOT_WRITABLE = 3;

    /**
     * Problem type when trying to update a non-writable attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleStatus.java
    public static final int NO_ROLE_WITH_NAME = 1;

    /**
     * Problem type when trying to access an unknown role.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleStatus.java
public class RoleStatus {

/**
 * This class describes the various problems which can be encountered when
 * accessing a role.
 *
 * @since 1.5
 */
