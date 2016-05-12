_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    public static JDBCType valueOf(int type) {

    /**
     * Returns the {@code JDBCType} that corresponds to the specified
     * {@code Types} value
     * @param type {@code Types} value
     * @return The {@code JDBCType} constant
     * @throws IllegalArgumentException if this enum type has no constant with
     * the specified {@code Types} value
     * @see Types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    public Integer getVendorTypeNumber() {

    /**
     * Returns the vendor specific type number for the data type.
     * @return  An Integer representing the data type. For {@code JDBCType},
     * the value will be the same value as in {@code Types} for the data type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    public String getVendor() {

    /**
     * Returns the name of the vendor that supports this data type.
     * @return  The name of the vendor for this data type which is
     * {@literal java.sql} for JDBCType.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    public String getName() {

    /**
     *{@inheritDoc }
     * @return The name of this {@code SQLType}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    JDBCType(final Integer type) {

    /**
     * Constructor to specify the data type value from {@code Types) for
     * this data type.
     * @param type The value from {@code Types) for this data type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    private Integer type;

    /**
     * The Integer value for the JDBCType.  It maps to a value in
     * {@code Types.java}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    TIMESTAMP_WITH_TIMEZONE(Types.TIMESTAMP_WITH_TIMEZONE);

    /**
     * Identifies the generic SQL type {@code TIMESTAMP_WITH_TIMEZONE}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    TIME_WITH_TIMEZONE(Types.TIME_WITH_TIMEZONE),

    /**
     * Identifies the generic SQL type {@code TIME_WITH_TIMEZONE}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    REF_CURSOR(Types.REF_CURSOR),

    /**
     * Identifies the generic SQL type {@code REF_CURSOR}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    NCLOB(Types.NCLOB),

    /**
     * Identifies the generic SQL type {@code NCLOB}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    NVARCHAR(Types.NVARCHAR),

    /**
     * Identifies the generic SQL type {@code NVARCHAR}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    ROWID(Types.ROWID),

    /**
     * Identifies the SQL type {@code ROWID}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    DATALINK(Types.DATALINK),

    /**
     * Identifies the generic SQL type {@code DATALINK}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    CLOB(Types.CLOB),

    /**
     * Identifies the generic SQL type {@code CLOB}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    ARRAY(Types.ARRAY),

    /**
     * Identifies the generic SQL type {@code ARRAY}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    DISTINCT(Types.DISTINCT),

    /**
     * Identifies the generic SQL type {@code DISTINCT}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    OTHER(Types.OTHER),

    /**
     * Indicates that the SQL type
     * is database-specific and gets mapped to a Java object that can be
     * accessed via the methods getObject and setObject.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    LONGVARBINARY(Types.LONGVARBINARY),

    /**
     * Identifies the generic SQL type {@code LONGVARBINARY}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    BINARY(Types.BINARY),

    /**
     * Identifies the generic SQL type {@code BINARY}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    TIME(Types.TIME),

    /**
     * Identifies the generic SQL type {@code TIME}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    LONGVARCHAR(Types.LONGVARCHAR),

    /**
     * Identifies the generic SQL type {@code LONGVARCHAR}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    CHAR(Types.CHAR),

    /**
     * Identifies the generic SQL type {@code CHAR}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    NUMERIC(Types.NUMERIC),

    /**
     * Identifies the generic SQL type {@code NUMERIC}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    REAL(Types.REAL),

    /**
     * Identifies the generic SQL type {@code REAL}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    BIGINT(Types.BIGINT),

    /**
     * Identifies the generic SQL type {@code BIGINT}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    SMALLINT(Types.SMALLINT),

    /**
     * Identifies the generic SQL type {@code SMALLINT}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
    BIT(Types.BIT),

    /**
     * Identifies the generic SQL type {@code BIT}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/JDBCType.java
public enum JDBCType implements SQLType {

/**
 * <P>Defines the constants that are used to identify generic
 * SQL types, called JDBC types.
 * <p>
 * @see SQLType
 * @since 1.8
 */
