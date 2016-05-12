_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLTransactionRollbackException.java
    public SQLTransactionRollbackException(String reason, String SQLState, int vendorCode, Throwable cause) {

    /**
     *  Constructs a <code>SQLTransactionRollbackException</code> object
     * with a given
     * <code>reason</code>, <code>SQLState</code>, <code>vendorCode</code>
     * and  <code>cause</code>.
     * <p>
     * @param reason a description of the exception
     * @param SQLState an XOPEN or SQL:2003 code identifying the exception
     * @param vendorCode a database vendor-specific exception code
     * @param cause the underlying reason for this <code>SQLException</code> (which is saved for later retrieval by the <code>getCause()</code> method); may be null indicating
     *     the cause is non-existent or unknown.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLTransactionRollbackException.java
    public SQLTransactionRollbackException(String reason, String SQLState, Throwable cause) {

    /**
     * Constructs a <code>SQLTransactionRollbackException</code> object
     * with a given
     * <code>reason</code>, <code>SQLState</code> and  <code>cause</code>.
     * The vendor code is initialized to 0.
     * <p>
     * @param reason a description of the exception.
     * @param SQLState an XOPEN or SQL:2003 code identifying the exception
     * @param cause the underlying reason for this <code>SQLException</code> (which is saved for later retrieval by the <code>getCause()</code> method); may be null indicating
     *     the cause is non-existent or unknown.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLTransactionRollbackException.java
    public SQLTransactionRollbackException(String reason, Throwable cause) {

    /**
     * Constructs a <code>SQLTransactionRollbackException</code> object
     * with a given
     * <code>reason</code> and  <code>cause</code>.
     * The <code>SQLState</code> is  initialized to <code>null</code>
     * and the vendor code is initialized to 0.
     * <p>
     * @param reason a description of the exception.
     * @param cause the underlying reason for this <code>SQLException</code> (which is saved for later retrieval by the <code>getCause()</code> method); may be null indicating
     *     the cause is non-existent or unknown.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLTransactionRollbackException.java
    public SQLTransactionRollbackException(Throwable cause) {

    /**
     * Constructs a <code>SQLTransactionRollbackException</code> object
     * with a given  <code>cause</code>.
     * The <code>SQLState</code> is initialized
     * to <code>null</code> and the vendor code is initialized to 0.
     * The <code>reason</code>  is initialized to <code>null</code> if
     * <code>cause==null</code> or to <code>cause.toString()</code> if
     * <code>cause!=null</code>.
     * <p>
     * @param cause the underlying reason for this <code>SQLException</code> (which is saved for later retrieval by the <code>getCause()</code> method); may be null indicating
     *     the cause is non-existent or unknown.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLTransactionRollbackException.java
        public SQLTransactionRollbackException(String reason, String SQLState, int vendorCode) {

        /**
         * Constructs a <code>SQLTransactionRollbackException</code> object
         * with a given <code>reason</code>, <code>SQLState</code>  and
         * <code>vendorCode</code>.
         *
         * The <code>cause</code> is not initialized, and may subsequently be
         * initialized by a call to the
         * {@link Throwable#initCause(java.lang.Throwable)} method.
         * <p>
         * @param reason a description of the exception
         * @param SQLState an XOPEN or SQL:2003 code identifying the exception
         * @param vendorCode a database vendor specific exception code
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLTransactionRollbackException.java
        public SQLTransactionRollbackException(String reason, String SQLState) {

        /**
         * Constructs a <code>SQLTransactionRollbackException</code> object
         * with a given <code>reason</code> and <code>SQLState</code>.
         *
         * The <code>cause</code> is not initialized, and may subsequently be
         * initialized by a call to the
         * {@link Throwable#initCause(java.lang.Throwable)} method. The vendor code
         * is initialized to 0.
         * <p>
         * @param reason a description of the exception
         * @param SQLState an XOPEN or SQL:2003 code identifying the exception
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLTransactionRollbackException.java
        public SQLTransactionRollbackException(String reason) {

        /**
         * Constructs a <code>SQLTransactionRollbackException</code> object
         * with a given <code>reason</code>. The <code>SQLState</code>
         * is initialized to <code>null</code> and the vendor code is initialized
         * to 0.
         *
         * The <code>cause</code> is not initialized, and may subsequently be
         * initialized by a call to the
         * {@link Throwable#initCause(java.lang.Throwable)} method.
         * <p>
         * @param reason a description of the exception
         * @since 1.6
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/SQLTransactionRollbackException.java
public class SQLTransactionRollbackException extends SQLTransientException {

/**
 * The subclass of {@link SQLException} thrown when the SQLState class value
 * is '<i>40</i>', or under vendor-specified conditions. This indicates that the
 * current statement was automatically rolled back by the database because
 * of deadlock or other transaction serialization failures.
 * <p>
 * Please consult your driver vendor documentation for the vendor-specified
 * conditions for which this <code>Exception</code> may be thrown.
 * @since 1.6
 */
