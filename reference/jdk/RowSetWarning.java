_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetWarning.java
    public void setNextWarning(RowSetWarning warning) {

    /**
     * Sets <i>warning</i> as the next warning, that is, the warning chained
     * to this <code>RowSetWarning</code> object.
     *
     * @param warning the <code>RowSetWarning</code> object to be set as the
     *     next warning; if the <code>RowSetWarning</code> is null, this
     *     represents the finish point in the warning chain
     * @see #getNextWarning
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetWarning.java
    public RowSetWarning getNextWarning() {

    /**
     * Retrieves the warning chained to this <code>RowSetWarning</code>
     * object.
     *
     * @return the <code>RowSetWarning</code> object chained to this one; if no
     *         <code>RowSetWarning</code> object is chained to this one,
     *         <code>null</code> is returned (default value)
     * @see #setNextWarning
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetWarning.java
    public RowSetWarning(java.lang.String reason, java.lang.String SQLState, int vendorCode) {

    /**
     * Constructs a fully specified <code>RowSetWarning</code> object initialized
     * with the given values for the reason, SQLState and vendorCode.
     *
     * If the <code>reason</code>, or the  <code>SQLState</code>
     * parameters are <code>null</code>, this constructor behaves like the default
     * (zero parameter) <code>RowSetWarning</code> constructor.
     *
     * @param reason a <code>String</code> giving a description of the
     *        warning;
     * @param SQLState an XOPEN code identifying the warning; if a non standard
     *        XOPEN <i>SQLState</i> is supplied, no exception is thrown.
     * @param vendorCode a database vendor-specific warning code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetWarning.java
    public RowSetWarning(java.lang.String reason, java.lang.String SQLState) {

    /**
     * Constructs a <code>RowSetWarning</code> object initialized with the
     * given values for the reason and SQLState. The vendor code defaults to 0.
     *
     * If the <code>reason</code> or <code>SQLState</code> parameters are <code>null</code>,
     * this constructor behaves like the default (zero parameter)
     * <code>RowSetWarning</code> constructor.
     *
     * @param reason a <code>String</code> giving a description of the
     *        warning;
     * @param SQLState an XOPEN code identifying the warning; if a non standard
     *        XOPEN <i>SQLState</i> is supplied, no exception is thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetWarning.java
    public RowSetWarning() {

    /**
     * Constructs a default <code>RowSetWarning</code> object. The reason
     * defaults to <code>null</code>, SQLState defaults to null and vendorCode
     * defaults to 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetWarning.java
    public RowSetWarning(String reason) {

    /**
     * Constructs a <code>RowSetWarning</code> object
     * with the given value for the reason; SQLState defaults to null,
     * and vendorCode defaults to 0.
     *
     * @param reason a <code>String</code> object giving a description
     *        of the warning; if the <code>String</code> is <code>null</code>,
     *        this constructor behaves like the default (zero parameter)
     *        <code>RowSetWarning</code> constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sql/rowset/RowSetWarning.java
public class RowSetWarning extends SQLException {

/**
 * An extension of <code>SQLException</code> that provides information
 * about database warnings set on <code>RowSet</code> objects.
 * Warnings are silently chained to the object whose method call
 * caused it to be reported.
 * This class complements the <code>SQLWarning</code> class.
 * <P>
 * Rowset warnings may be retrieved from <code>JdbcRowSet</code>,
 * <code>CachedRowSet</code>&trade;,
 * <code>WebRowSet</code>, <code>FilteredRowSet</code>, or <code>JoinRowSet</code>
 * implementations. To retrieve the first warning reported on any
 * <code>RowSet</code>
 * implementation,  use the method <code>getRowSetWarnings</code> defined
 * in the <code>JdbcRowSet</code> interface or the <code>CachedRowSet</code>
 * interface. To retrieve a warning chained to the first warning, use the
 * <code>RowSetWarning</code> method
 * <code>getNextWarning</code>. To retrieve subsequent warnings, call
 * <code>getNextWarning</code> on each <code>RowSetWarning</code> object that is
 * returned.
 * <P>
 * The inherited methods <code>getMessage</code>, <code>getSQLState</code>,
 * and <code>getErrorCode</code> retrieve information contained in a
 * <code>RowSetWarning</code> object.
 *
 * @since 1.5
 */
