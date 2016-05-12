_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    transient long sequenceNumber = 0;

    /**
     * SNMP table sequence number.
     * The default value is set to 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private Hashtable<NotificationListener, Vector<NotificationFilter>>

    /**
     * Listener hashtable containing the filter objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private Hashtable<NotificationListener, Vector<Object>> handbackTable =

    /**
     * Listener hashtable containing the hand-back objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    // final Vector callbacks = new Vector();

    /**
     * Callback handlers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private final Vector<ObjectName> entrynames= new Vector<>();

    /**
     * The list of object names.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private final Vector<Object> entries= new Vector<>();

    /**
     * The list of entries.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    // private Vector oids= new Vector();

    /**
     * The list of OIDs.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    //    private Vector indexes= new Vector();

    /**
     * The list of indexes.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private int size=0;

    /**
     * The number of elements in the table.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpTableEntryFactory factory = null;

    /**
     * The entry factory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean creationEnabled = false;

    /**
     * <CODE>true</CODE> if remote creation of entries via SET operations
     * is enabled.
     * [default value is <CODE>false</CODE>]
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpMib theMib;

    /**
     * The MIB to which the metadata is linked.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected int nodeId=1;

    /**
     * The id of the contained entry object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private void insertOid(int pos, SnmpOid oid) {

    /**
     * Insert an OID at the given position.
     *
     * <p>
     * @param oid The OID to be inserted in the table
     * @param pos The position at which the OID to be added is located.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private void removeOid(int pos) {

    /**
     * Remove the OID located at the given position.
     *
     * <p>
     * @param pos The position at which the OID to be removed is located.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private int getInsertionPoint(SnmpOid oid, boolean fail)

    /**
     * Search the position at which the given oid should be inserted
     * in the OID table (tableoids).
     *
     * <p>
     * @param oid The OID we would like to insert.
     *
     * @param fail Tells whether a SnmpStatusException must be generated
     *             if the given OID is already present in the table.
     *
     * @return The position at which the OID should be inserted in
     *         the table. When the OID is found, it returns the next
     *         position. Note that it is not valid to insert twice the
     *         same OID. This feature is only an optimization to improve
     *         the getNextOid() behaviour.
     *
     * @exception SnmpStatusException if the OID is already present in the
     *            table and <code>fail</code> is <code>true</code>.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private int findObject(SnmpOid oid) {

    /**
     * Look for the given oid in the OID table (tableoids) and returns
     * its position.
     *
     * <p>
     * @param oid The OID we're looking for.
     *
     * @return The position of the OID in the table. -1 if the given
     *         OID was not found.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean contains(SnmpOid oid, Object userData) {

    /**
     * Return true if the entry identified by the given OID index
     * is contained in this table.
     * <p>
     * <b>Do not call this method directly</b>.
     * <p>
     * This method is provided has a hook for subclasses.
     * It is called when a get/set request is received in order to
     * determine whether the specified entry is contained in the table.
     * You may want to override this method if you need to perform e.g.
     * lazy evaluation of tables (you need to update the table when a
     * request is received) or if your table is virtual.
     * <p>
     * Note that this method is called by the Runtime from within a
     * synchronized block.
     *
     * @param oid The index part of the OID we're looking for.
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return <code>true</code> if the entry is found, <code>false</code>
     *         otherwise.
     *
     * @since 1.5
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private void sendNotification(String type, long timeStamp,
                                  Object entry, ObjectName name) {

    /**
     * This method is used by the SnmpMibTable to create and send a table
     * entry notification to all the listeners registered for this kind of
     * notification.
     *
     * <p>
     * @param type The notification type.
     *
     * @param timeStamp The notification emission date.
     *
     * @param entry The entry object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private synchronized void sendNotification(Notification notification) {

    /**
     * Enable this <CODE>SnmpMibTable</CODE> to send a notification.
     *
     * <p>
     * @param notification The notification to send.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    final void validateOid(long[] oid, int pos) throws SnmpStatusException {

    /**
     * Validate the specified OID.
     *
     * <p>
     * @param oid The OID array.
     *
     * @param pos The position in the array.
     *
     * @exception SnmpStatusException If the validation fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    SnmpOid getNextOid(long[] oid, int pos, Object userData)

    /**
     * Get the <CODE>SnmpOid</CODE> index of the row that follows the
     * index extracted from the specified OID array.
     * Builds the SnmpOid corresponding to the row OID and calls
     * <code>getNextOid(oid,userData)</code>;
     *
     * <p>
     * @param oid The OID array.
     *
     * @param pos The position in the OID array at which the index starts.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The next <CODE>SnmpOid</CODE>.
     *
     * @exception SnmpStatusException There is no index following the
     *     specified one in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected void set(SnmpMibSubRequest req,
                                SnmpOid rowOid, int depth)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected void check(SnmpMibSubRequest req,
                                  SnmpOid rowOid, int depth)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected void get(SnmpMibSubRequest req,
                                SnmpOid rowOid, int depth)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected boolean isReadableEntryId(SnmpOid rowOid, long var,
                                                 Object userData)

    /**
     *
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     *
     * <p>
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var The OID arc.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @exception SnmpStatusException If this id is not valid.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected void validateVarEntryId(SnmpOid rowOid, long var,
                                               Object userData)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     *
     * <p>
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var The var we want to validate.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @exception SnmpStatusException If this id is not valid.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected long getNextVarEntryId(SnmpOid rowOid, long var,
                                              Object userData)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     *
     * <p> Return the next OID arc corresponding to a readable columnar
     *     object in the underlying entry OBJECT-TYPE.</p>
     *
     * <p>
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var Id of the variable we start from, looking for the next.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The next columnar object id.
     *
     * @exception SnmpStatusException If no id is found after the given id.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpOid getNextOid(Object userData)

    /**
     * Return the first entry OID registered in the table.
     *
     * <p>
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The <CODE>SnmpOid</CODE> of the first entry in the table.
     *
     * @exception SnmpStatusException If the table is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpOid getNextOid(SnmpOid oid, Object userData)

    /**
     * Get the <CODE>SnmpOid</CODE> index of the row that follows
     * the given <CODE>oid</CODE> in the table. The given <CODE>
     * oid</CODE> does not need to be a valid row OID index.
     *
     * <p>
     * @param oid The OID from which the search will begin.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The next <CODE>SnmpOid</CODE> index.
     *
     * @exception SnmpStatusException There is no index following the
     *     specified <CODE>oid</CODE> in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean skipEntryVariable(SnmpOid rowOid,
                                        long var,
                                        Object userData,
                                        int pduVersion) {

    /**
     * Hook for subclasses.
     * The default implementation of this method is to always return
     * false. Subclasses should redefine this method so that it returns
     * true when:
     * <ul><li>the variable is a leaf that is not instantiated,</li>
     * <li>or the variable is a leaf whose type cannot be returned by that
     *     version of the protocol (e.g. an Counter64 with SNMPv1).</li>
     * </ul>
     *
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var Id of the variable we start from, looking for the next.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @param pduVersion Protocol version of the original request PDU.
     *
     * @return true if the variable must be skipped by the get-next
     *         algorithm.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected long getNextVarEntryId(SnmpOid rowOid,
                                     long var,
                                     Object userData,
                                     int pduVersion)

    /**
     * Return the next OID arc corresponding to a readable columnar
     * object in the underlying entry OBJECT-TYPE, possibly skipping over
     * those objects that must not or cannot be returned.
     * Calls {@link
     * #getNextVarEntryId(com.sun.jmx.snmp.SnmpOid,long,java.lang.Object)},
     * until
     * {@link #skipEntryVariable(com.sun.jmx.snmp.SnmpOid,long,
     * java.lang.Object,int)} returns false.
     *
     *
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var Id of the variable we start from, looking for the next.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @param pduVersion Protocol version of the original request PDU.
     *
     * @return The next columnar object id which can be returned using
     *         the given PDU's protocol version.
     *
     * @exception SnmpStatusException If no id is found after the given id.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected void endRowAction(SnmpMibSubRequest req, SnmpOid rowOid,
                               int depth, int rowAction)

    /**
     * This method takes care of final RowStatus handling during the
     * set() phase of a SET request.
     *
     * In particular it will:
     *     <ul><li>either call <code>setRowStatus(<i>active</i>)</code>
     *         (<code> rowAction = <i>createAndGo</i> or <i>active</i>
     *         </code>),</li>
     *     <li>or call <code>setRowStatus(<i>notInService</i> or <i>
     *         notReady</i>)</code> depending on the result of <code>
     *         isRowReady()</code> (<code>rowAction = <i>createAndWait</i>
     *         </code>),</li>
     *     <li>or call <code>setRowStatus(<i>notInService</i>)</code>
     *         (<code> rowAction = <i>notInService</i></code>),
     *     <li>or call <code>removeTableRow()</code> (<code>
     *         rowAction = <i>destroy</i></code>),</li>
     *     <li>or generate a SnmpStatusException if the passed <code>
     *         rowAction</code> is not correct. This should be avoided
     *         since it would break SET request atomicity</li>
     *     </ul>
     * <p>
     * In principle, you should not need to redefine this method.
     * <p>
     * <code>endRowAction()</code> is called during the set() phase
     * of a SET request, after the actual set() on the varbind list
     * has been performed. The varbind containing the control variable
     * is updated with the value returned by setRowStatus() (if it is
     * not <code>null</code>).
     *
     * <p>
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @param rowAction The requested action as returned by <code>
     *        getRowAction()</code>: one of the RowStatus codes defined in
     *        {@link com.sun.jmx.snmp.EnumRowStatus}. These codes
     *        correspond to RowStatus codes as defined in RFC 2579,
     *        plus the <i>unspecified</i> value which is SNMP Runtime specific.
     *
     * @exception SnmpStatusException if the specified <code>rowAction</code>
     *            is not valid.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected synchronized void beginRowAction(SnmpMibSubRequest req,
                              SnmpOid rowOid, int depth, int rowAction)

    /**
     * This method takes care of initial RowStatus handling during the
     * check() phase of a SET request.
     *
     * In particular it will:
     * <ul><li>check that the given <code>rowAction</code> returned by
     *         <code>getRowAction()</code> is valid.</li>
     * <li>Then depending on the <code>rowAction</code> specified it will:
     *     <ul><li>either call <code>createNewEntry()</code> (<code>
     *         rowAction = <i>createAndGo</i> or <i>createAndWait</i>
     *         </code>),</li>
     *     <li>or call <code>checkRemoveTableRow()</code> (<code>
     *         rowAction = <i>destroy</i></code>),</li>
     *     <li>or call <code>checkRowStatusChange()</code> (<code>
     *         rowAction = <i>active</i> or <i>notInService</i></code>),</li>
     *     <li>or generate a SnmpStatusException if the passed <code>
     *         rowAction</code> is not correct.</li>
     * </ul></li></ul>
     * <p>
     * In principle, you should not need to redefine this method.
     * <p>
     * <code>beginRowAction()</code> is called during the check phase
     * of a SET request, before actual checking on the varbind list
     * is performed.
     *
     * <p>
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @param rowAction The requested action as returned by <code>
     *        getRowAction()</code>: one of the RowStatus codes defined in
     *        {@link com.sun.jmx.snmp.EnumRowStatus}. These codes
     *        correspond to RowStatus codes as defined in RFC 2579,
     *        plus the <i>unspecified</i> value which is SNMP Runtime specific.
     *
     * @exception SnmpStatusException if the specified <code>rowAction</code>
     *            is not valid or cannot be executed.
     *            This should not happen since it would break the
     *            atomicity of the SET request. Specific checks should
     *            be implemented in <code>beginRowAction()</code> if needed.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected void removeTableRow(SnmpMibSubRequest req, SnmpOid rowOid,
                                  int depth)

    /**
     * Remove a table row upon a remote manager request.
     *
     * This method is called internally when <code>getRowAction()</code>
     * yields <i>destroy</i> - i.e.: it is only called when a remote
     * manager requests the removal of a table row.<br>
     * You should never need to call this function directly.
     * <p>
     * By default, this method simply calls <code>removeEntry(rowOid)
     * </code>.
     * <p>
     * You can redefine this method if you need to implement some
     * specific behaviour when a remote row deletion is invoked.
     * <p>
     * Note that specific checks should not be implemented in this
     * method, but rather in <code>checkRemoveTableRow()</code>.
     * If <code>checkRemoveTableRow()</code> succeeds and this method
     * fails afterward, the atomicity of the original SET request can no
     * longer be guaranteed.
     * <p>
     *
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @exception SnmpStatusException if the actual row deletion fails.
     *            This should not happen since it would break the
     *            atomicity of the SET request. Specific checks should
     *            be implemented in <code>checkRemoveTableRow()</code>
     *            if needed. If the entry does not exists, no exception
     *            is generated and the method simply returns.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected void checkRemoveTableRow(SnmpMibSubRequest req, SnmpOid rowOid,
                                       int depth)

    /**
     * Check whether the specified row can be removed from the table.
     * <p>
     * This method is called during the <i>check</i> phase of a SET
     * request when the control variable specifies <i>destroy</i>
     * <p>
     * By default it is assumed that nothing prevents row deletion
     * and this method does nothing. It is simply provided as a hook
     * so that specific checks can be implemented.
     * <p>
     * Note that if the actual row deletion fails afterward, the
     * atomicity of the request is no longer guaranteed.
     *
     * <p>
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @exception SnmpStatusException if the row deletion must be
     *            rejected.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected void checkRowStatusChange(SnmpMibSubRequest req,
                                        SnmpOid rowOid, int depth,
                                        int newStatus)

    /**
     * Check whether the control variable of the given row can be
     * switched to the new specified <code>newStatus</code>.
     * <p>
     * This method is called during the <i>check</i> phase of a SET
     * request when the control variable specifies <i>active</i> or
     * <i>notInService</i>.
     * <p>
     * By default it is assumed that nothing prevents putting the
     * row in the requested state, and this method does nothing.
     * It is simply provided as a hook so that specific checks can
     * be implemented.
     * <p>
     * Note that if the actual row deletion fails afterward, the
     * atomicity of the request is no longer guaranteed.
     *
     * <p>
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @param newStatus The new status for the row: one of the
     *        RowStatus code defined in
     *        {@link com.sun.jmx.snmp.EnumRowStatus}. These codes
     *        correspond to RowStatus codes as defined in RFC 2579,
     *        plus the <i>unspecified</i> value which is SNMP Runtime specific.
     *
     * @exception SnmpStatusException if switching to this new state
     *            would fail.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean isRowReady(SnmpOid rowOid, Object userData)

    /**
     * Tell whether the specified row is ready and can be put in the
     * <i>notInService</i> state.
     * <p>
     * This method is called only once, after all the varbind have been
     * set on a new entry for which <i>createAndWait</i> was specified.
     * <p>
     * If the entry is not yet ready, this method should return false.
     * It will then be the responsibility of the entry to switch its
     * own state to <i>notInService</i> when it becomes ready.
     * No further call to <code>isRowReady()</code> will be made.
     * <p>
     * By default, this method always return true. <br>
     * <code>mibgen</code> will not generate any specific implementation
     * for this method - meaning that by default, a row created using
     * <i>createAndWait</i> will always be placed in <i>notInService</i>
     * state at the end of the request.
     * <p>
     * If this table was defined using SMIv2, and if it contains a
     * control variable with RowStatus syntax, <code>mibgen</code>
     * will generate an implementation for this method that will
     * delegate the work to the metadata class modelling the conceptual
     * row, so that you can override the default behaviour by subclassing
     * that metadata class.
     * <p>
     * You will have to redefine this method if this default mechanism
     * does not suit your needs.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return <code>true</code> if the row can be placed in
     *         <i>notInService</i> state.
     *
     * @exception SnmpStatusException An error occurred while trying
     *            to retrieve the row status, and the operation should
     *            be aborted.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpValue setRowStatus(SnmpOid rowOid, int newStatus,
                                     Object userData)

    /**
     * Set the control variable to the specified <code>newStatus</code>
     * value.
     *
     * <p>
     * This method maps the given <code>newStatus</code> to the appropriate
     * value for the control variable, then sets the control variable in
     * the entry identified by <code>rowOid</code>. It returns the new
     * value of the control variable.
     * <p>
     * By default, it is assumed that there is no control variable so this
     * method does nothing and simply returns <code>null</code>.
     * <p>
     * If this table was defined using SMIv2, and if it contains a
     * control variable with RowStatus syntax, <code>mibgen</code>
     * will generate a non default implementation for this method.
     * <p>
     * You will have to redefine this method if you need to implement
     * control variables that do not conform to RFC 2579 RowStatus
     * TEXTUAL-CONVENTION.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param newStatus The new status for the row: one of the
     *        RowStatus code defined in
     *        {@link com.sun.jmx.snmp.EnumRowStatus}. These codes
     *        correspond to RowStatus codes as defined in RFC 2579,
     *        plus the <i>unspecified</i> value which is SNMP Runtime specific.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The new value of the control variable (usually
     *         <code>new SnmpInt(newStatus)</code>) or <code>null</code>
     *         if the table do not have any control variable.
     *
     * @exception SnmpStatusException If the given <code>newStatus</code>
     *            could not be set on the specified entry, or if the
     *            given <code>newStatus</code> is not valid.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected int mapRowStatus(SnmpOid rowOid, SnmpVarBind vbstatus,
                               Object userData)

    /**
     * Map the value of the <code>vbstatus</code> varbind to the
     * corresponding RowStatus code defined in
     * {@link com.sun.jmx.snmp.EnumRowStatus}.
     * These codes correspond to RowStatus codes as defined in RFC 2579,
     * plus the <i>unspecified</i> value which is SNMP Runtime specific.
     * <p>
     * By default, this method assumes that the control variable is
     * an Integer, and it simply returns its value without further
     * analysis.
     * <p>
     * If this table was defined using SMIv2, and if it contains a
     * control variable with RowStatus syntax, <code>mibgen</code>
     * will generate a non default implementation for this method.
     * <p>
     * You will have to redefine this method if you need to implement
     * control variables that do not conform to RFC 2579 RowStatus
     * TEXTUAL-CONVENTION.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param vbstatus The SnmpVarBind containing the value of the control
     *           variable, as identified by the isRowStatus() method.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The RowStatus code mapped from the value contained
     *     in <code>vbstatus</code>.
     *
     * @exception SnmpStatusException if the value of the control variable
     *            could not be mapped to a RowStatus code.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected int getRowAction(SnmpMibSubRequest req, SnmpOid rowOid,
                               int depth)

    /**
     * Return the RowStatus code value specified in this request.
     * <p>
     * The RowStatus code value should be one of the values defined
     * by {@link com.sun.jmx.snmp.EnumRowStatus}. These codes correspond
     * to RowStatus codes as defined in RFC 2579, plus the <i>unspecified</i>
     * value which is SNMP Runtime specific.
     * <p>
     *
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @return The RowStatus code specified in this request, if any:
     * <ul>
     * <li>If the specified row does not exist and this table do
     *     not use any variable to control creation/deletion of
     *     rows, then default creation mechanism is assumed and
     *     <i>createAndGo</i> is returned</li>
     * <li>Otherwise, if the row exists and this table do not use any
     *     variable to control creation/deletion of rows,
     *     <i>unspecified</i> is returned.</li>
     * <li>Otherwise, if the request does not contain the control variable,
     *     <i>unspecified</i> is returned.</li>
     * <li>Otherwise, mapRowStatus() is called to extract the RowStatus
     *     code from the SnmpVarBind that contains the control variable.</li>
     * </ul>
     *
     * @exception SnmpStatusException if the value of the control variable
     *            could not be mapped to a RowStatus code.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean isRowStatus(SnmpOid rowOid, long var,
                                    Object  userData) {

    /**
     * Return true if the columnar object identified by <code>var</code>
     * is used to control the addition/deletion of rows in this table.
     *
     * <p>
     * By default, this method assumes that there is no control variable
     * and always return <code>false</code>
     * <p>
     * If this table was defined using SMIv2, and if it contains a
     * control variable with RowStatus syntax, <code>mibgen</code>
     * will generate a non default implementation for this method
     * that will identify the RowStatus control variable.
     * <p>
     * You will have to redefine this method if you need to implement
     * control variables that do not conform to RFC 2579 RowStatus
     * TEXTUAL-CONVENTION.
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param var The OID arc identifying the involved columnar object.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public void registerEntryFactory(SnmpTableEntryFactory factory) {

    /**
     * Register the factory through which table entries should
     * be created when remote entry creation is enabled.
     *
     * <p>
     * @param factory The
     *        {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} through
     *        which entries will be created when a remote SNMP manager
     *        request the creation of a new entry via an SNMP SET request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Return a <CODE>NotificationInfo</CODE> object containing the
     * notification class and the notification type sent by the
     * <CODE>SnmpMibTable</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Enable to remove an SNMP entry listener from this
     * <CODE>SnmpMibTable</CODE>.
     *
     * @param listener The listener object which will handle the
     *    notifications emitted by the registered MBean.
     *    This method will remove all the information related to this
     *    listener.
     *
     * @exception ListenerNotFoundException The listener is not registered
     *    in the MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Enable to add an SNMP entry listener to this
     * <CODE>SnmpMibTable</CODE>.
     *
     * <p>
     * @param listener The listener object which will handle the
     *    notifications emitted by the registered MBean.
     *
     * @param filter The filter object. If filter is null, no filtering
     *    will be performed before handling notifications.
     *
     * @param handback The context to be sent to the listener when a
     *    notification is emitted.
     *
     * @exception IllegalArgumentException Listener parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public int getSize() {

    /**
     * Get the size of the table.
     *
     * @return The number of entries currently registered in this table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public Object[] getBasicEntries() {

    /**
     * Return the entries stored in this table <CODE>SnmpMibTable</CODE>.
     * <p>
     * If the subclass generated by mibgen uses the generic way to access
     * the entries (i.e. if it goes through the MBeanServer) then some of
     * the entries may be <code>null</code>. It all depends whether a non
     * <code>null</code> entry was passed to addEntry().<br>
     * Otherwise, if it uses the standard way (access the entry directly
     * through their standard MBean interface) this array will contain all
     * the entries.
     * <p>
     * @return The entries array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public synchronized ObjectName getEntryName(SnmpOid rowOid)

    /**
     * Get the ObjectName of the entry corresponding to the
     * specified rowOid.
     * The result of this method is only meaningful if
     * isRegistrationRequired() yields true.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *        row whose ObjectName we want to retrieve.
     *
     * @return The object name of the entry.
     *
     * @exception SnmpStatusException There is no entry with the specified
     *      <code>rowOid</code> in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public synchronized Object getEntry(SnmpOid rowOid)

    /**
     * Get the entry corresponding to the specified rowOid.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the
     *        row to be retrieved.
     *
     * @return The entry.
     *
     * @exception SnmpStatusException There is no entry with the specified
     *      <code>rowOid</code> in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public synchronized void removeEntry(int pos, Object entry)

    /**
     * Remove the specified entry from the table.
     * Also triggers the removeEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * <p>
     * @param pos The position of the entry in the table.
     *
     * @param entry The entry to be removed. This parameter is not used
     *              internally, it is simply passed along to the
     *              removeEntryCB() callback.
     *
     * @exception SnmpStatusException if the specified entry couldn't
     *            be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public void removeEntry(SnmpOid rowOid)

    /**
     * Remove the specified entry from the table.
     * Also triggers the removeEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row to remove.
     *
     * @exception SnmpStatusException if the specified entry couldn't
     *            be removed (if the given <code>rowOid</code> is not
     *            valid for instance).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public synchronized void removeEntry(SnmpOid rowOid, Object entry)

    /**
     * Remove the specified entry from the table.
     * Also triggers the removeEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row to remove.
     *
     * @param entry The entry to be removed. This parameter is not used
     *              internally, it is simply passed along to the
     *              removeEntryCB() callback.
     *
     * @exception SnmpStatusException if the specified entry couldn't
     *            be removed (if the given <code>rowOid</code> is not
     *            valid for instance).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    // protected synchronized void addEntry(SnmpIndex index, ObjectName name,
    //                                      Object entry)

    /**
     * Add a new entry in this <CODE>SnmpMibTable</CODE>.
     * Also triggers the addEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * <p>
     * @param oid    The <CODE>SnmpOid</CODE> identifying the table
     *               row to be added.
     *
     * @param name  The ObjectName with which this entry is registered.
     *              This parameter can be omitted if isRegistrationRequired()
     *              return false.
     *
     * @param entry The entry to add.
     *
     * @exception SnmpStatusException The entry couldn't be added
     *            at the position identified by the given
     *            <code>rowOid</code>, or if this version of the metadata
     *            requires ObjectName's, and the given name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
     // public void addEntry(SnmpIndex index, Object entry)

    /**
     * Add a new entry in this <CODE>SnmpMibTable</CODE>.
     * Also triggers the addEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * This method assumes that the given entry will not be registered.
     * If the entry is going to be registered, or if ObjectName's are
     * required, then
     * {@link com.sun.jmx.snmp.agent.SnmpMibTable#addEntry(SnmpOid,
     * ObjectName, Object)} should be preferred.
     * <br> This function is mainly provided for backward compatibility.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row to be added.
     * @param entry The entry to add.
     *
     * @exception SnmpStatusException The entry couldn't be added
     *            at the position identified by the given
     *            <code>rowOid</code>, or this version of the metadata
     *            requires ObjectName's.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Generic handling of the <CODE>set</CODE> operation.
     * <p> The default implementation of this method is to
     * call the generated
     * <CODE>set(req,oid,depth+1)</CODE> method.
     * <p>
     * <pre>
     * public void set(SnmpMibSubRequest req, int depth)
     *    throws SnmpStatusException {
     *    final SnmpOid oid = req.getEntryOid();
     *    final int  action = getRowAction(req,oid,depth+1);
     *
     *    set(req,oid,depth+1);
     *    endRowAction(req,oid,depth+1,action);
     * }
     * </pre>
     * <p> You should not need to override this method in any cases, because
     * it will eventually call
     * <CODE>set(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>. If you need to implement
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list,
     * you should then rather override
     * <CODE>set(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>.
     * <p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Generic handling of the <CODE>check</CODE> operation.
     * <p> The default implementation of this method is to
     * <ul>
     * <li> check whether a new entry must be created, and if remote
     *      creation of entries is enabled, create it. </li>
     * <li> call the generated
     *      <CODE>check(req,oid,depth+1)</CODE> method. </li>
     * </ul>
     * <p>
     * <pre>
     * public void check(SnmpMibSubRequest req, int depth)
     *    throws SnmpStatusException {
     *    final SnmpOid     oid    = req.getEntryOid();
     *    final int         action = getRowAction(req,oid,depth+1);
     *
     *    beginRowAction(req,oid,depth+1,action);
     *    check(req,oid,depth+1);
     * }
     * </pre>
     * <p> You should not need to override this method in any cases, because
     * it will eventually call
     * <CODE>check(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>. If you need to implement
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list,
     * you should then rather override
     * <CODE>check(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>.
     * <p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Generic handling of the <CODE>get</CODE> operation.
     * <p> The default implementation of this method is to
     * <ul>
     * <li> check whether the entry exists, and if not register an
     *      exception for each varbind in the list.
     * <li> call the generated
     *      <CODE>get(req,oid,depth+1)</CODE> method. </li>
     * </ul>
     * <p>
     * <pre>
     * public void get(SnmpMibSubRequest req, int depth)
     *    throws SnmpStatusException {
     *    boolean         isnew  = req.isNewEntry();
     *
     *    // if the entry does not exists, then registers an error for
     *    // each varbind involved (nb: this should not happen, since
     *    // the error should already have been detected earlier)
     *    //
     *    if (isnew) {
     *        SnmpVarBind     var = null;
     *        for (Enumeration e= req.getElements(); e.hasMoreElements();) {
     *            var = (SnmpVarBind) e.nextElement();
     *            req.registerGetException(var,noSuchNameException);
     *        }
     *    }
     *
     *    final SnmpOid oid = req.getEntryOid();
     *    get(req,oid,depth+1);
     * }
     * </pre>
     * <p> You should not need to override this method in any cases, because
     * it will eventually call
     * <CODE>get(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>. If you need to implement
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list,
     * you should then rather override
     * <CODE>get(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>.
     * <p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public boolean hasRowStatus() {

    /**
     * Return <code>true</code> if the conceptual row contains a columnar
     * object used to control creation/deletion of rows in this table.
     * <p>
     * This  columnar object can be either a variable with RowStatus
     * syntax as defined by RFC 2579, or a plain variable whose
     * semantics is table specific.
     * <p>
     * By default, this function returns <code>false</code>, and it is
     * assumed that the table has no such control variable.<br>
     * When <code>mibgen</code> is used over SMIv2 MIBs, it will generate
     * an <code>hasRowStatus()</code> method returning <code>true</code>
     * for each table containing an object with RowStatus syntax.
     * <p>
     * When this method returns <code>false</code> the default mechanism
     * for remote entry creation is used.
     * Otherwise, creation/deletion is performed as specified
     * by the control variable (see getRowAction() for more details).
     * <p>
     * This method is called internally when a SET request involving
     * this table is processed.
     * <p>
     * If you need to implement a control variable which do not use
     * the RowStatus convention as defined by RFC 2579, you should
     * subclass the generated table metadata class in order to redefine
     * this method and make it returns <code>true</code>.<br>
     * You will then have to redefine the isRowStatus(), mapRowStatus(),
     * isRowReady(), and setRowStatus() methods to suit your specific
     * implementation.
     * <p>
     * @return <li><code>true</code> if this table contains a control
     *         variable (eg: a variable with RFC 2579 RowStatus syntax),
     *         </li>
     *         <li><code>false</code> if this table does not contain
     *         any control variable.</li>
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public void setCreationEnabled(boolean remoteCreationFlag) {

    /**
     * This method lets you dynamically switch the creation policy.
     *
     * <p>
     * @param remoteCreationFlag Tells whether remote entry creation must
     *        be enabled or disabled.
     * <ul><li>
     * <CODE>setCreationEnabled(true)</CODE> will enable remote entry
     *      creation via SET operations.</li>
     * <li>
     * <CODE>setCreationEnabled(false)</CODE> will disable remote entry
     *      creation via SET operations.</li>
     * <p> By default remote entry creation via SET operation is disabled.
     * </p>
     * </ul>
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public boolean isCreationEnabled() {

    /**
     * Tell whether a new entry should be created when a SET operation
     * is received for an entry that does not exist yet.
     *
     * @return true if a new entry must be created, false otherwise.<br>
     *         [default: returns <CODE>false</CODE>]
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public abstract boolean isRegistrationRequired();

    /**
     * Tell whether the specific version of this metadata generated
     * by <code>mibgen</code> requires entries to be registered with
     * the MBeanServer. In this case an ObjectName will have to be
     * passed to addEntry() in order for the table to behave correctly
     * (case of the generic metadata).
     * <p>
     * If that version of the metadata does not require entry to be
     * registered, then passing an ObjectName becomes optional (null
     * can be passed instead).
     *
     * @return <code>true</code> if registration is required by this
     *         version of the metadata.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public abstract void createNewEntry(SnmpMibSubRequest req, SnmpOid rowOid,
                                        int depth)

    /**
     * This method is invoked when the creation of a new entry is requested
     * by a remote SNMP manager.
     * <br>By default, remote entry creation is disabled - and this method
     * will not be called. You can dynamically switch the entry creation
     * policy by calling <code>setCreationEnabled(true)</code> and <code>
     * setCreationEnabled(false)</code> on this object.
     * <p><b><i>
     * This method is called internally by the SNMP runtime and you
     * should never need to call it directly. </b></i>However you might want
     * to extend it in order to implement your own specific application
     * behaviour, should the default behaviour not be at your convenience.
     * </p>
     * <p>
     * @param req   The SNMP  subrequest requesting this creation
     * @param rowOid  The OID indexing the conceptual row (entry) for which
     *                the creation was requested.
     * @param depth The position of the columnar object arc in the OIDs
     *              from the varbind list.
     *
     * @exception SnmpStatusException if the entry cannot be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public SnmpMibTable(SnmpMib mib) {

    /**
     * Create a new <CODE>SnmpMibTable</CODE> metadata node.
     *
     * <p>
     * @param mib The SNMP MIB to which the metadata will be linked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
public abstract class SnmpMibTable extends SnmpMibNode

/**
 * This class is the base class for SNMP table metadata.
 * <p>
 * Its responsibility is to manage a sorted array of OID indexes
 * according to the SNMP indexing scheme over the "real" table.
 * Each object of this class can be bound to an
 * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} to which it will
 * forward remote entry creation requests, and invoke callbacks
 * when an entry has been successfully added to / removed from
 * the OID index array.
 * </p>
 *
 * <p>
 * For each table defined in the MIB, mibgen will generate a specific
 * class called Table<i>TableName</i> that will implement the
 * SnmpTableEntryFactory interface, and a corresponding
 * <i>TableName</i>Meta class that will extend this class. <br>
 * The Table<i>TableName</i> class corresponds to the MBean view of the
 * table while the <i>TableName</i>Meta class corresponds to the
 * MIB metadata view of the same table.
 * </p>
 *
 * <p>
 * Objects of this class are instantiated by the generated
 * whole MIB class extending {@link com.sun.jmx.snmp.agent.SnmpMib}
 * You should never need to instantiate this class directly.
 * </p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.agent.SnmpMib
 * @see com.sun.jmx.snmp.agent.SnmpMibEntry
 * @see com.sun.jmx.snmp.agent.SnmpTableEntryFactory
 * @see com.sun.jmx.snmp.agent.SnmpTableSupport
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    transient long sequenceNumber = 0;

    /**
     * SNMP table sequence number.
     * The default value is set to 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private Hashtable<NotificationListener, Vector<NotificationFilter>>

    /**
     * Listener hashtable containing the filter objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private Hashtable<NotificationListener, Vector<Object>> handbackTable =

    /**
     * Listener hashtable containing the hand-back objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    // final Vector callbacks = new Vector();

    /**
     * Callback handlers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private final Vector<ObjectName> entrynames= new Vector<>();

    /**
     * The list of object names.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private final Vector<Object> entries= new Vector<>();

    /**
     * The list of entries.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    // private Vector oids= new Vector();

    /**
     * The list of OIDs.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    //    private Vector indexes= new Vector();

    /**
     * The list of indexes.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private int size=0;

    /**
     * The number of elements in the table.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpTableEntryFactory factory = null;

    /**
     * The entry factory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean creationEnabled = false;

    /**
     * <CODE>true</CODE> if remote creation of entries via SET operations
     * is enabled.
     * [default value is <CODE>false</CODE>]
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpMib theMib;

    /**
     * The MIB to which the metadata is linked.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected int nodeId=1;

    /**
     * The id of the contained entry object.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private void insertOid(int pos, SnmpOid oid) {

    /**
     * Insert an OID at the given position.
     *
     * <p>
     * @param oid The OID to be inserted in the table
     * @param pos The position at which the OID to be added is located.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private void removeOid(int pos) {

    /**
     * Remove the OID located at the given position.
     *
     * <p>
     * @param pos The position at which the OID to be removed is located.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private int getInsertionPoint(SnmpOid oid, boolean fail)

    /**
     * Search the position at which the given oid should be inserted
     * in the OID table (tableoids).
     *
     * <p>
     * @param oid The OID we would like to insert.
     *
     * @param fail Tells whether a SnmpStatusException must be generated
     *             if the given OID is already present in the table.
     *
     * @return The position at which the OID should be inserted in
     *         the table. When the OID is found, it returns the next
     *         position. Note that it is not valid to insert twice the
     *         same OID. This feature is only an optimization to improve
     *         the getNextOid() behaviour.
     *
     * @exception SnmpStatusException if the OID is already present in the
     *            table and <code>fail</code> is <code>true</code>.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private int findObject(SnmpOid oid) {

    /**
     * Look for the given oid in the OID table (tableoids) and returns
     * its position.
     *
     * <p>
     * @param oid The OID we're looking for.
     *
     * @return The position of the OID in the table. -1 if the given
     *         OID was not found.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean contains(SnmpOid oid, Object userData) {

    /**
     * Return true if the entry identified by the given OID index
     * is contained in this table.
     * <p>
     * <b>Do not call this method directly</b>.
     * <p>
     * This method is provided has a hook for subclasses.
     * It is called when a get/set request is received in order to
     * determine whether the specified entry is contained in the table.
     * You may want to override this method if you need to perform e.g.
     * lazy evaluation of tables (you need to update the table when a
     * request is received) or if your table is virtual.
     * <p>
     * Note that this method is called by the Runtime from within a
     * synchronized block.
     *
     * @param oid The index part of the OID we're looking for.
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return <code>true</code> if the entry is found, <code>false</code>
     *         otherwise.
     *
     * @since 1.5
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private void sendNotification(String type, long timeStamp,
                                  Object entry, ObjectName name) {

    /**
     * This method is used by the SnmpMibTable to create and send a table
     * entry notification to all the listeners registered for this kind of
     * notification.
     *
     * <p>
     * @param type The notification type.
     *
     * @param timeStamp The notification emission date.
     *
     * @param entry The entry object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    private synchronized void sendNotification(Notification notification) {

    /**
     * Enable this <CODE>SnmpMibTable</CODE> to send a notification.
     *
     * <p>
     * @param notification The notification to send.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    final void validateOid(long[] oid, int pos) throws SnmpStatusException {

    /**
     * Validate the specified OID.
     *
     * <p>
     * @param oid The OID array.
     *
     * @param pos The position in the array.
     *
     * @exception SnmpStatusException If the validation fails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    SnmpOid getNextOid(long[] oid, int pos, Object userData)

    /**
     * Get the <CODE>SnmpOid</CODE> index of the row that follows the
     * index extracted from the specified OID array.
     * Builds the SnmpOid corresponding to the row OID and calls
     * <code>getNextOid(oid,userData)</code>;
     *
     * <p>
     * @param oid The OID array.
     *
     * @param pos The position in the OID array at which the index starts.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The next <CODE>SnmpOid</CODE>.
     *
     * @exception SnmpStatusException There is no index following the
     *     specified one in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected void set(SnmpMibSubRequest req,
                                SnmpOid rowOid, int depth)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected void check(SnmpMibSubRequest req,
                                  SnmpOid rowOid, int depth)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected void get(SnmpMibSubRequest req,
                                SnmpOid rowOid, int depth)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected boolean isReadableEntryId(SnmpOid rowOid, long var,
                                                 Object userData)

    /**
     *
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     *
     * <p>
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var The OID arc.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @exception SnmpStatusException If this id is not valid.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected void validateVarEntryId(SnmpOid rowOid, long var,
                                               Object userData)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     *
     * <p>
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var The var we want to validate.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @exception SnmpStatusException If this id is not valid.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    abstract protected long getNextVarEntryId(SnmpOid rowOid, long var,
                                              Object userData)

    /**
     * This method is used internally and is implemented by the
     * <CODE>SnmpMibTable</CODE> subclasses generated by <CODE>mibgen</CODE>.
     *
     * <p> Return the next OID arc corresponding to a readable columnar
     *     object in the underlying entry OBJECT-TYPE.</p>
     *
     * <p>
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var Id of the variable we start from, looking for the next.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The next columnar object id.
     *
     * @exception SnmpStatusException If no id is found after the given id.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpOid getNextOid(Object userData)

    /**
     * Return the first entry OID registered in the table.
     *
     * <p>
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The <CODE>SnmpOid</CODE> of the first entry in the table.
     *
     * @exception SnmpStatusException If the table is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpOid getNextOid(SnmpOid oid, Object userData)

    /**
     * Get the <CODE>SnmpOid</CODE> index of the row that follows
     * the given <CODE>oid</CODE> in the table. The given <CODE>
     * oid</CODE> does not need to be a valid row OID index.
     *
     * <p>
     * @param oid The OID from which the search will begin.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The next <CODE>SnmpOid</CODE> index.
     *
     * @exception SnmpStatusException There is no index following the
     *     specified <CODE>oid</CODE> in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean skipEntryVariable(SnmpOid rowOid,
                                        long var,
                                        Object userData,
                                        int pduVersion) {

    /**
     * Hook for subclasses.
     * The default implementation of this method is to always return
     * false. Subclasses should redefine this method so that it returns
     * true when:
     * <ul><li>the variable is a leaf that is not instantiated,</li>
     * <li>or the variable is a leaf whose type cannot be returned by that
     *     version of the protocol (e.g. an Counter64 with SNMPv1).</li>
     * </ul>
     *
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var Id of the variable we start from, looking for the next.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @param pduVersion Protocol version of the original request PDU.
     *
     * @return true if the variable must be skipped by the get-next
     *         algorithm.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected long getNextVarEntryId(SnmpOid rowOid,
                                     long var,
                                     Object userData,
                                     int pduVersion)

    /**
     * Return the next OID arc corresponding to a readable columnar
     * object in the underlying entry OBJECT-TYPE, possibly skipping over
     * those objects that must not or cannot be returned.
     * Calls {@link
     * #getNextVarEntryId(com.sun.jmx.snmp.SnmpOid,long,java.lang.Object)},
     * until
     * {@link #skipEntryVariable(com.sun.jmx.snmp.SnmpOid,long,
     * java.lang.Object,int)} returns false.
     *
     *
     * @param rowOid The OID index of the row involved in the operation.
     *
     * @param var Id of the variable we start from, looking for the next.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @param pduVersion Protocol version of the original request PDU.
     *
     * @return The next columnar object id which can be returned using
     *         the given PDU's protocol version.
     *
     * @exception SnmpStatusException If no id is found after the given id.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected void endRowAction(SnmpMibSubRequest req, SnmpOid rowOid,
                               int depth, int rowAction)

    /**
     * This method takes care of final RowStatus handling during the
     * set() phase of a SET request.
     *
     * In particular it will:
     *     <ul><li>either call <code>setRowStatus(<i>active</i>)</code>
     *         (<code> rowAction = <i>createAndGo</i> or <i>active</i>
     *         </code>),</li>
     *     <li>or call <code>setRowStatus(<i>notInService</i> or <i>
     *         notReady</i>)</code> depending on the result of <code>
     *         isRowReady()</code> (<code>rowAction = <i>createAndWait</i>
     *         </code>),</li>
     *     <li>or call <code>setRowStatus(<i>notInService</i>)</code>
     *         (<code> rowAction = <i>notInService</i></code>),
     *     <li>or call <code>removeTableRow()</code> (<code>
     *         rowAction = <i>destroy</i></code>),</li>
     *     <li>or generate a SnmpStatusException if the passed <code>
     *         rowAction</code> is not correct. This should be avoided
     *         since it would break SET request atomicity</li>
     *     </ul>
     * <p>
     * In principle, you should not need to redefine this method.
     * <p>
     * <code>endRowAction()</code> is called during the set() phase
     * of a SET request, after the actual set() on the varbind list
     * has been performed. The varbind containing the control variable
     * is updated with the value returned by setRowStatus() (if it is
     * not <code>null</code>).
     *
     * <p>
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @param rowAction The requested action as returned by <code>
     *        getRowAction()</code>: one of the RowStatus codes defined in
     *        {@link com.sun.jmx.snmp.EnumRowStatus}. These codes
     *        correspond to RowStatus codes as defined in RFC 2579,
     *        plus the <i>unspecified</i> value which is SNMP Runtime specific.
     *
     * @exception SnmpStatusException if the specified <code>rowAction</code>
     *            is not valid.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected synchronized void beginRowAction(SnmpMibSubRequest req,
                              SnmpOid rowOid, int depth, int rowAction)

    /**
     * This method takes care of initial RowStatus handling during the
     * check() phase of a SET request.
     *
     * In particular it will:
     * <ul><li>check that the given <code>rowAction</code> returned by
     *         <code>getRowAction()</code> is valid.</li>
     * <li>Then depending on the <code>rowAction</code> specified it will:
     *     <ul><li>either call <code>createNewEntry()</code> (<code>
     *         rowAction = <i>createAndGo</i> or <i>createAndWait</i>
     *         </code>),</li>
     *     <li>or call <code>checkRemoveTableRow()</code> (<code>
     *         rowAction = <i>destroy</i></code>),</li>
     *     <li>or call <code>checkRowStatusChange()</code> (<code>
     *         rowAction = <i>active</i> or <i>notInService</i></code>),</li>
     *     <li>or generate a SnmpStatusException if the passed <code>
     *         rowAction</code> is not correct.</li>
     * </ul></li></ul>
     * <p>
     * In principle, you should not need to redefine this method.
     * <p>
     * <code>beginRowAction()</code> is called during the check phase
     * of a SET request, before actual checking on the varbind list
     * is performed.
     *
     * <p>
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @param rowAction The requested action as returned by <code>
     *        getRowAction()</code>: one of the RowStatus codes defined in
     *        {@link com.sun.jmx.snmp.EnumRowStatus}. These codes
     *        correspond to RowStatus codes as defined in RFC 2579,
     *        plus the <i>unspecified</i> value which is SNMP Runtime specific.
     *
     * @exception SnmpStatusException if the specified <code>rowAction</code>
     *            is not valid or cannot be executed.
     *            This should not happen since it would break the
     *            atomicity of the SET request. Specific checks should
     *            be implemented in <code>beginRowAction()</code> if needed.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected void removeTableRow(SnmpMibSubRequest req, SnmpOid rowOid,
                                  int depth)

    /**
     * Remove a table row upon a remote manager request.
     *
     * This method is called internally when <code>getRowAction()</code>
     * yields <i>destroy</i> - i.e.: it is only called when a remote
     * manager requests the removal of a table row.<br>
     * You should never need to call this function directly.
     * <p>
     * By default, this method simply calls <code>removeEntry(rowOid)
     * </code>.
     * <p>
     * You can redefine this method if you need to implement some
     * specific behaviour when a remote row deletion is invoked.
     * <p>
     * Note that specific checks should not be implemented in this
     * method, but rather in <code>checkRemoveTableRow()</code>.
     * If <code>checkRemoveTableRow()</code> succeeds and this method
     * fails afterward, the atomicity of the original SET request can no
     * longer be guaranteed.
     * <p>
     *
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @exception SnmpStatusException if the actual row deletion fails.
     *            This should not happen since it would break the
     *            atomicity of the SET request. Specific checks should
     *            be implemented in <code>checkRemoveTableRow()</code>
     *            if needed. If the entry does not exists, no exception
     *            is generated and the method simply returns.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected void checkRemoveTableRow(SnmpMibSubRequest req, SnmpOid rowOid,
                                       int depth)

    /**
     * Check whether the specified row can be removed from the table.
     * <p>
     * This method is called during the <i>check</i> phase of a SET
     * request when the control variable specifies <i>destroy</i>
     * <p>
     * By default it is assumed that nothing prevents row deletion
     * and this method does nothing. It is simply provided as a hook
     * so that specific checks can be implemented.
     * <p>
     * Note that if the actual row deletion fails afterward, the
     * atomicity of the request is no longer guaranteed.
     *
     * <p>
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @exception SnmpStatusException if the row deletion must be
     *            rejected.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected void checkRowStatusChange(SnmpMibSubRequest req,
                                        SnmpOid rowOid, int depth,
                                        int newStatus)

    /**
     * Check whether the control variable of the given row can be
     * switched to the new specified <code>newStatus</code>.
     * <p>
     * This method is called during the <i>check</i> phase of a SET
     * request when the control variable specifies <i>active</i> or
     * <i>notInService</i>.
     * <p>
     * By default it is assumed that nothing prevents putting the
     * row in the requested state, and this method does nothing.
     * It is simply provided as a hook so that specific checks can
     * be implemented.
     * <p>
     * Note that if the actual row deletion fails afterward, the
     * atomicity of the request is no longer guaranteed.
     *
     * <p>
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @param newStatus The new status for the row: one of the
     *        RowStatus code defined in
     *        {@link com.sun.jmx.snmp.EnumRowStatus}. These codes
     *        correspond to RowStatus codes as defined in RFC 2579,
     *        plus the <i>unspecified</i> value which is SNMP Runtime specific.
     *
     * @exception SnmpStatusException if switching to this new state
     *            would fail.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean isRowReady(SnmpOid rowOid, Object userData)

    /**
     * Tell whether the specified row is ready and can be put in the
     * <i>notInService</i> state.
     * <p>
     * This method is called only once, after all the varbind have been
     * set on a new entry for which <i>createAndWait</i> was specified.
     * <p>
     * If the entry is not yet ready, this method should return false.
     * It will then be the responsibility of the entry to switch its
     * own state to <i>notInService</i> when it becomes ready.
     * No further call to <code>isRowReady()</code> will be made.
     * <p>
     * By default, this method always return true. <br>
     * <code>mibgen</code> will not generate any specific implementation
     * for this method - meaning that by default, a row created using
     * <i>createAndWait</i> will always be placed in <i>notInService</i>
     * state at the end of the request.
     * <p>
     * If this table was defined using SMIv2, and if it contains a
     * control variable with RowStatus syntax, <code>mibgen</code>
     * will generate an implementation for this method that will
     * delegate the work to the metadata class modelling the conceptual
     * row, so that you can override the default behaviour by subclassing
     * that metadata class.
     * <p>
     * You will have to redefine this method if this default mechanism
     * does not suit your needs.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return <code>true</code> if the row can be placed in
     *         <i>notInService</i> state.
     *
     * @exception SnmpStatusException An error occurred while trying
     *            to retrieve the row status, and the operation should
     *            be aborted.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected SnmpValue setRowStatus(SnmpOid rowOid, int newStatus,
                                     Object userData)

    /**
     * Set the control variable to the specified <code>newStatus</code>
     * value.
     *
     * <p>
     * This method maps the given <code>newStatus</code> to the appropriate
     * value for the control variable, then sets the control variable in
     * the entry identified by <code>rowOid</code>. It returns the new
     * value of the control variable.
     * <p>
     * By default, it is assumed that there is no control variable so this
     * method does nothing and simply returns <code>null</code>.
     * <p>
     * If this table was defined using SMIv2, and if it contains a
     * control variable with RowStatus syntax, <code>mibgen</code>
     * will generate a non default implementation for this method.
     * <p>
     * You will have to redefine this method if you need to implement
     * control variables that do not conform to RFC 2579 RowStatus
     * TEXTUAL-CONVENTION.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param newStatus The new status for the row: one of the
     *        RowStatus code defined in
     *        {@link com.sun.jmx.snmp.EnumRowStatus}. These codes
     *        correspond to RowStatus codes as defined in RFC 2579,
     *        plus the <i>unspecified</i> value which is SNMP Runtime specific.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The new value of the control variable (usually
     *         <code>new SnmpInt(newStatus)</code>) or <code>null</code>
     *         if the table do not have any control variable.
     *
     * @exception SnmpStatusException If the given <code>newStatus</code>
     *            could not be set on the specified entry, or if the
     *            given <code>newStatus</code> is not valid.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected int mapRowStatus(SnmpOid rowOid, SnmpVarBind vbstatus,
                               Object userData)

    /**
     * Map the value of the <code>vbstatus</code> varbind to the
     * corresponding RowStatus code defined in
     * {@link com.sun.jmx.snmp.EnumRowStatus}.
     * These codes correspond to RowStatus codes as defined in RFC 2579,
     * plus the <i>unspecified</i> value which is SNMP Runtime specific.
     * <p>
     * By default, this method assumes that the control variable is
     * an Integer, and it simply returns its value without further
     * analysis.
     * <p>
     * If this table was defined using SMIv2, and if it contains a
     * control variable with RowStatus syntax, <code>mibgen</code>
     * will generate a non default implementation for this method.
     * <p>
     * You will have to redefine this method if you need to implement
     * control variables that do not conform to RFC 2579 RowStatus
     * TEXTUAL-CONVENTION.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param vbstatus The SnmpVarBind containing the value of the control
     *           variable, as identified by the isRowStatus() method.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     * @return The RowStatus code mapped from the value contained
     *     in <code>vbstatus</code>.
     *
     * @exception SnmpStatusException if the value of the control variable
     *            could not be mapped to a RowStatus code.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected int getRowAction(SnmpMibSubRequest req, SnmpOid rowOid,
                               int depth)

    /**
     * Return the RowStatus code value specified in this request.
     * <p>
     * The RowStatus code value should be one of the values defined
     * by {@link com.sun.jmx.snmp.EnumRowStatus}. These codes correspond
     * to RowStatus codes as defined in RFC 2579, plus the <i>unspecified</i>
     * value which is SNMP Runtime specific.
     * <p>
     *
     * @param req    The sub-request that must be handled by this node.
     *
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param depth  The depth reached in the OID tree.
     *
     * @return The RowStatus code specified in this request, if any:
     * <ul>
     * <li>If the specified row does not exist and this table do
     *     not use any variable to control creation/deletion of
     *     rows, then default creation mechanism is assumed and
     *     <i>createAndGo</i> is returned</li>
     * <li>Otherwise, if the row exists and this table do not use any
     *     variable to control creation/deletion of rows,
     *     <i>unspecified</i> is returned.</li>
     * <li>Otherwise, if the request does not contain the control variable,
     *     <i>unspecified</i> is returned.</li>
     * <li>Otherwise, mapRowStatus() is called to extract the RowStatus
     *     code from the SnmpVarBind that contains the control variable.</li>
     * </ul>
     *
     * @exception SnmpStatusException if the value of the control variable
     *            could not be mapped to a RowStatus code.
     *
     * @see com.sun.jmx.snmp.EnumRowStatus
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    protected boolean isRowStatus(SnmpOid rowOid, long var,
                                    Object  userData) {

    /**
     * Return true if the columnar object identified by <code>var</code>
     * is used to control the addition/deletion of rows in this table.
     *
     * <p>
     * By default, this method assumes that there is no control variable
     * and always return <code>false</code>
     * <p>
     * If this table was defined using SMIv2, and if it contains a
     * control variable with RowStatus syntax, <code>mibgen</code>
     * will generate a non default implementation for this method
     * that will identify the RowStatus control variable.
     * <p>
     * You will have to redefine this method if you need to implement
     * control variables that do not conform to RFC 2579 RowStatus
     * TEXTUAL-CONVENTION.
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row involved in the operation.
     *
     * @param var The OID arc identifying the involved columnar object.
     *
     * @param userData A contextual object containing user-data.
     *        This object is allocated through the <code>
     *        {@link com.sun.jmx.snmp.agent.SnmpUserDataFactory}</code>
     *        for each incoming SNMP request.
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public void registerEntryFactory(SnmpTableEntryFactory factory) {

    /**
     * Register the factory through which table entries should
     * be created when remote entry creation is enabled.
     *
     * <p>
     * @param factory The
     *        {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} through
     *        which entries will be created when a remote SNMP manager
     *        request the creation of a new entry via an SNMP SET request.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Return a <CODE>NotificationInfo</CODE> object containing the
     * notification class and the notification type sent by the
     * <CODE>SnmpMibTable</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Enable to remove an SNMP entry listener from this
     * <CODE>SnmpMibTable</CODE>.
     *
     * @param listener The listener object which will handle the
     *    notifications emitted by the registered MBean.
     *    This method will remove all the information related to this
     *    listener.
     *
     * @exception ListenerNotFoundException The listener is not registered
     *    in the MBean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Enable to add an SNMP entry listener to this
     * <CODE>SnmpMibTable</CODE>.
     *
     * <p>
     * @param listener The listener object which will handle the
     *    notifications emitted by the registered MBean.
     *
     * @param filter The filter object. If filter is null, no filtering
     *    will be performed before handling notifications.
     *
     * @param handback The context to be sent to the listener when a
     *    notification is emitted.
     *
     * @exception IllegalArgumentException Listener parameter is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public int getSize() {

    /**
     * Get the size of the table.
     *
     * @return The number of entries currently registered in this table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public Object[] getBasicEntries() {

    /**
     * Return the entries stored in this table <CODE>SnmpMibTable</CODE>.
     * <p>
     * If the subclass generated by mibgen uses the generic way to access
     * the entries (i.e. if it goes through the MBeanServer) then some of
     * the entries may be <code>null</code>. It all depends whether a non
     * <code>null</code> entry was passed to addEntry().<br>
     * Otherwise, if it uses the standard way (access the entry directly
     * through their standard MBean interface) this array will contain all
     * the entries.
     * <p>
     * @return The entries array.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public synchronized ObjectName getEntryName(SnmpOid rowOid)

    /**
     * Get the ObjectName of the entry corresponding to the
     * specified rowOid.
     * The result of this method is only meaningful if
     * isRegistrationRequired() yields true.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *        row whose ObjectName we want to retrieve.
     *
     * @return The object name of the entry.
     *
     * @exception SnmpStatusException There is no entry with the specified
     *      <code>rowOid</code> in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public synchronized Object getEntry(SnmpOid rowOid)

    /**
     * Get the entry corresponding to the specified rowOid.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the
     *        row to be retrieved.
     *
     * @return The entry.
     *
     * @exception SnmpStatusException There is no entry with the specified
     *      <code>rowOid</code> in the table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public synchronized void removeEntry(int pos, Object entry)

    /**
     * Remove the specified entry from the table.
     * Also triggers the removeEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * <p>
     * @param pos The position of the entry in the table.
     *
     * @param entry The entry to be removed. This parameter is not used
     *              internally, it is simply passed along to the
     *              removeEntryCB() callback.
     *
     * @exception SnmpStatusException if the specified entry couldn't
     *            be removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public void removeEntry(SnmpOid rowOid)

    /**
     * Remove the specified entry from the table.
     * Also triggers the removeEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row to remove.
     *
     * @exception SnmpStatusException if the specified entry couldn't
     *            be removed (if the given <code>rowOid</code> is not
     *            valid for instance).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public synchronized void removeEntry(SnmpOid rowOid, Object entry)

    /**
     * Remove the specified entry from the table.
     * Also triggers the removeEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row to remove.
     *
     * @param entry The entry to be removed. This parameter is not used
     *              internally, it is simply passed along to the
     *              removeEntryCB() callback.
     *
     * @exception SnmpStatusException if the specified entry couldn't
     *            be removed (if the given <code>rowOid</code> is not
     *            valid for instance).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    // protected synchronized void addEntry(SnmpIndex index, ObjectName name,
    //                                      Object entry)

    /**
     * Add a new entry in this <CODE>SnmpMibTable</CODE>.
     * Also triggers the addEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * <p>
     * @param oid    The <CODE>SnmpOid</CODE> identifying the table
     *               row to be added.
     *
     * @param name  The ObjectName with which this entry is registered.
     *              This parameter can be omitted if isRegistrationRequired()
     *              return false.
     *
     * @param entry The entry to add.
     *
     * @exception SnmpStatusException The entry couldn't be added
     *            at the position identified by the given
     *            <code>rowOid</code>, or if this version of the metadata
     *            requires ObjectName's, and the given name is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
     // public void addEntry(SnmpIndex index, Object entry)

    /**
     * Add a new entry in this <CODE>SnmpMibTable</CODE>.
     * Also triggers the addEntryCB() callback of the
     * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} interface
     * if this node is bound to a factory.
     *
     * This method assumes that the given entry will not be registered.
     * If the entry is going to be registered, or if ObjectName's are
     * required, then
     * {@link com.sun.jmx.snmp.agent.SnmpMibTable#addEntry(SnmpOid,
     * ObjectName, Object)} should be preferred.
     * <br> This function is mainly provided for backward compatibility.
     *
     * <p>
     * @param rowOid The <CODE>SnmpOid</CODE> identifying the table
     *               row to be added.
     * @param entry The entry to add.
     *
     * @exception SnmpStatusException The entry couldn't be added
     *            at the position identified by the given
     *            <code>rowOid</code>, or this version of the metadata
     *            requires ObjectName's.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Generic handling of the <CODE>set</CODE> operation.
     * <p> The default implementation of this method is to
     * call the generated
     * <CODE>set(req,oid,depth+1)</CODE> method.
     * <p>
     * <pre>
     * public void set(SnmpMibSubRequest req, int depth)
     *    throws SnmpStatusException {
     *    final SnmpOid oid = req.getEntryOid();
     *    final int  action = getRowAction(req,oid,depth+1);
     *
     *    set(req,oid,depth+1);
     *    endRowAction(req,oid,depth+1,action);
     * }
     * </pre>
     * <p> You should not need to override this method in any cases, because
     * it will eventually call
     * <CODE>set(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>. If you need to implement
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list,
     * you should then rather override
     * <CODE>set(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>.
     * <p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Generic handling of the <CODE>check</CODE> operation.
     * <p> The default implementation of this method is to
     * <ul>
     * <li> check whether a new entry must be created, and if remote
     *      creation of entries is enabled, create it. </li>
     * <li> call the generated
     *      <CODE>check(req,oid,depth+1)</CODE> method. </li>
     * </ul>
     * <p>
     * <pre>
     * public void check(SnmpMibSubRequest req, int depth)
     *    throws SnmpStatusException {
     *    final SnmpOid     oid    = req.getEntryOid();
     *    final int         action = getRowAction(req,oid,depth+1);
     *
     *    beginRowAction(req,oid,depth+1,action);
     *    check(req,oid,depth+1);
     * }
     * </pre>
     * <p> You should not need to override this method in any cases, because
     * it will eventually call
     * <CODE>check(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>. If you need to implement
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list,
     * you should then rather override
     * <CODE>check(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>.
     * <p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    @Override

    /**
     * Generic handling of the <CODE>get</CODE> operation.
     * <p> The default implementation of this method is to
     * <ul>
     * <li> check whether the entry exists, and if not register an
     *      exception for each varbind in the list.
     * <li> call the generated
     *      <CODE>get(req,oid,depth+1)</CODE> method. </li>
     * </ul>
     * <p>
     * <pre>
     * public void get(SnmpMibSubRequest req, int depth)
     *    throws SnmpStatusException {
     *    boolean         isnew  = req.isNewEntry();
     *
     *    // if the entry does not exists, then registers an error for
     *    // each varbind involved (nb: this should not happen, since
     *    // the error should already have been detected earlier)
     *    //
     *    if (isnew) {
     *        SnmpVarBind     var = null;
     *        for (Enumeration e= req.getElements(); e.hasMoreElements();) {
     *            var = (SnmpVarBind) e.nextElement();
     *            req.registerGetException(var,noSuchNameException);
     *        }
     *    }
     *
     *    final SnmpOid oid = req.getEntryOid();
     *    get(req,oid,depth+1);
     * }
     * </pre>
     * <p> You should not need to override this method in any cases, because
     * it will eventually call
     * <CODE>get(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>. If you need to implement
     * specific policies for minimizing the accesses made to some remote
     * underlying resources, or if you need to implement some consistency
     * checks between the different values provided in the varbind list,
     * you should then rather override
     * <CODE>get(SnmpMibSubRequest req, int depth)</CODE> on the generated
     * derivative of <CODE>SnmpMibEntry</CODE>.
     * <p>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public boolean hasRowStatus() {

    /**
     * Return <code>true</code> if the conceptual row contains a columnar
     * object used to control creation/deletion of rows in this table.
     * <p>
     * This  columnar object can be either a variable with RowStatus
     * syntax as defined by RFC 2579, or a plain variable whose
     * semantics is table specific.
     * <p>
     * By default, this function returns <code>false</code>, and it is
     * assumed that the table has no such control variable.<br>
     * When <code>mibgen</code> is used over SMIv2 MIBs, it will generate
     * an <code>hasRowStatus()</code> method returning <code>true</code>
     * for each table containing an object with RowStatus syntax.
     * <p>
     * When this method returns <code>false</code> the default mechanism
     * for remote entry creation is used.
     * Otherwise, creation/deletion is performed as specified
     * by the control variable (see getRowAction() for more details).
     * <p>
     * This method is called internally when a SET request involving
     * this table is processed.
     * <p>
     * If you need to implement a control variable which do not use
     * the RowStatus convention as defined by RFC 2579, you should
     * subclass the generated table metadata class in order to redefine
     * this method and make it returns <code>true</code>.<br>
     * You will then have to redefine the isRowStatus(), mapRowStatus(),
     * isRowReady(), and setRowStatus() methods to suit your specific
     * implementation.
     * <p>
     * @return <li><code>true</code> if this table contains a control
     *         variable (eg: a variable with RFC 2579 RowStatus syntax),
     *         </li>
     *         <li><code>false</code> if this table does not contain
     *         any control variable.</li>
     *
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public void setCreationEnabled(boolean remoteCreationFlag) {

    /**
     * This method lets you dynamically switch the creation policy.
     *
     * <p>
     * @param remoteCreationFlag Tells whether remote entry creation must
     *        be enabled or disabled.
     * <ul><li>
     * <CODE>setCreationEnabled(true)</CODE> will enable remote entry
     *      creation via SET operations.</li>
     * <li>
     * <CODE>setCreationEnabled(false)</CODE> will disable remote entry
     *      creation via SET operations.</li>
     * <p> By default remote entry creation via SET operation is disabled.
     * </p>
     * </ul>
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public boolean isCreationEnabled() {

    /**
     * Tell whether a new entry should be created when a SET operation
     * is received for an entry that does not exist yet.
     *
     * @return true if a new entry must be created, false otherwise.<br>
     *         [default: returns <CODE>false</CODE>]
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public abstract boolean isRegistrationRequired();

    /**
     * Tell whether the specific version of this metadata generated
     * by <code>mibgen</code> requires entries to be registered with
     * the MBeanServer. In this case an ObjectName will have to be
     * passed to addEntry() in order for the table to behave correctly
     * (case of the generic metadata).
     * <p>
     * If that version of the metadata does not require entry to be
     * registered, then passing an ObjectName becomes optional (null
     * can be passed instead).
     *
     * @return <code>true</code> if registration is required by this
     *         version of the metadata.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public abstract void createNewEntry(SnmpMibSubRequest req, SnmpOid rowOid,
                                        int depth)

    /**
     * This method is invoked when the creation of a new entry is requested
     * by a remote SNMP manager.
     * <br>By default, remote entry creation is disabled - and this method
     * will not be called. You can dynamically switch the entry creation
     * policy by calling <code>setCreationEnabled(true)</code> and <code>
     * setCreationEnabled(false)</code> on this object.
     * <p><b><i>
     * This method is called internally by the SNMP runtime and you
     * should never need to call it directly. </b></i>However you might want
     * to extend it in order to implement your own specific application
     * behaviour, should the default behaviour not be at your convenience.
     * </p>
     * <p>
     * @param req   The SNMP  subrequest requesting this creation
     * @param rowOid  The OID indexing the conceptual row (entry) for which
     *                the creation was requested.
     * @param depth The position of the columnar object arc in the OIDs
     *              from the varbind list.
     *
     * @exception SnmpStatusException if the entry cannot be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
    public SnmpMibTable(SnmpMib mib) {

    /**
     * Create a new <CODE>SnmpMibTable</CODE> metadata node.
     *
     * <p>
     * @param mib The SNMP MIB to which the metadata will be linked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/SnmpMibTable.java
public abstract class SnmpMibTable extends SnmpMibNode

/**
 * This class is the base class for SNMP table metadata.
 * <p>
 * Its responsibility is to manage a sorted array of OID indexes
 * according to the SNMP indexing scheme over the "real" table.
 * Each object of this class can be bound to an
 * {@link com.sun.jmx.snmp.agent.SnmpTableEntryFactory} to which it will
 * forward remote entry creation requests, and invoke callbacks
 * when an entry has been successfully added to / removed from
 * the OID index array.
 * </p>
 *
 * <p>
 * For each table defined in the MIB, mibgen will generate a specific
 * class called Table<i>TableName</i> that will implement the
 * SnmpTableEntryFactory interface, and a corresponding
 * <i>TableName</i>Meta class that will extend this class. <br>
 * The Table<i>TableName</i> class corresponds to the MBean view of the
 * table while the <i>TableName</i>Meta class corresponds to the
 * MIB metadata view of the same table.
 * </p>
 *
 * <p>
 * Objects of this class are instantiated by the generated
 * whole MIB class extending {@link com.sun.jmx.snmp.agent.SnmpMib}
 * You should never need to instantiate this class directly.
 * </p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see com.sun.jmx.snmp.agent.SnmpMib
 * @see com.sun.jmx.snmp.agent.SnmpMibEntry
 * @see com.sun.jmx.snmp.agent.SnmpTableEntryFactory
 * @see com.sun.jmx.snmp.agent.SnmpTableSupport
 *
 */
