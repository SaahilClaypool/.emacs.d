_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLType.java
    Integer getVendorTypeNumber();

    /**
     * Returns the vendor specific type number for the data type.
     *
     * @return An Integer representing the vendor specific data type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLType.java
    String getVendor();

    /**
     * Returns the name of the vendor that supports this data type. The value
     * returned typically is the package name for this vendor.
     *
     * @return The name of the vendor for this data type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLType.java
    String getName();

    /**
     * Returns the {@code SQLType} name that represents a SQL data type.
     *
     * @return The name of this {@code SQLType}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLType.java
public interface SQLType {

/**
 * An object that is used to identify a generic SQL type, called a JDBC type or
 * a vendor specific data type.
 *
 * @since 1.8
 */
