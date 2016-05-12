_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowIdLifetime.java
    ROWID_VALID_FOREVER

    /**
     * Indicates that the lifetime of a RowId from this data source is, effectively,
     * unlimited.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowIdLifetime.java
    ROWID_VALID_TRANSACTION,

    /**
     * Indicates that the lifetime of a RowId from this data source is at least the
     * containing transaction.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowIdLifetime.java
    ROWID_VALID_SESSION,

    /**
     * Indicates that the lifetime of a RowId from this data source is at least the
     * containing session.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowIdLifetime.java
    ROWID_VALID_OTHER,

    /**
     * Indicates that the lifetime of a RowId from this data source is indeterminate;
     * but not one of ROWID_VALID_TRANSACTION, ROWID_VALID_SESSION, or,
     * ROWID_VALID_FOREVER.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowIdLifetime.java
    ROWID_UNSUPPORTED,

    /**
     * Indicates that this data source does not support the ROWID type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/RowIdLifetime.java
public enum RowIdLifetime {

/**
 * Enumeration for RowId life-time values.
 *
 * @since 1.6
 */
