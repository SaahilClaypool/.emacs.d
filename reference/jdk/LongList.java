_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    private final long[] allocate(final int length) {

    /**
     * Allocate a new array of object of specified length.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    private final void ensure(int length) {

    /**
     * Resize the list. Insure that the new length will be at
     * least equal to <var>length</var>.
     * @param length new minimal length requested.
     * Any call to this method must be protected by a synchronized
     * block on this LongList.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    private final void resize() {

    /**
     * Resize the list. Increase its capacity by DELTA elements.
     * Any call to this method must be protected by a synchronized
     * block on this LongList.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final long[] toArray() {

    /**
     * Same behaviour than the toArray() method in
     * {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final long[] toArray(long[] a) {

    /**
     * Same behaviour than the toArray(long[] a) method in
     * {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final long remove(final int index) {

    /**
     * Same behaviour than remove(int index) in {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final long remove(final int from, final int count) {

    /**
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final void add(final int at,final long[] src, final int from,
                          final int count) {

    /**
     * Adds <var>count</var> elements to the list.
     * @param at index at which the elements must be inserted. The
     *        first element will be inserted at this index.
     * @param src  An array containing the elements we want to insert.
     * @param from Index of the first element from <var>src</var> that
     *        must be inserted.
     * @param count number of elements to insert.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final void add(final int index, final long o) {

    /**
     * Same behaviour than add(int index, long o) in
     * {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final boolean add(final long o) {

    /**
     * Same behaviour than add(long o) in {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final int size() { return size;}

    /**
     * Same behaviour than size() in {@link java.util.List}.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public  long[] list;

    /**
     * The list content. Any access to this variable must be protected
     * by a synchronized block on the LongList object.
     * Only read-only action should be performed on this object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
final class LongList {

/**
 * This list is used in order to construct the OID during the getnext.
 * The constructed oid is checked by the checker AcmChecker.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    private final long[] allocate(final int length) {

    /**
     * Allocate a new array of object of specified length.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    private final void ensure(int length) {

    /**
     * Resize the list. Insure that the new length will be at
     * least equal to <var>length</var>.
     * @param length new minimal length requested.
     * Any call to this method must be protected by a synchronized
     * block on this LongList.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    private final void resize() {

    /**
     * Resize the list. Increase its capacity by DELTA elements.
     * Any call to this method must be protected by a synchronized
     * block on this LongList.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final long[] toArray() {

    /**
     * Same behaviour than the toArray() method in
     * {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final long[] toArray(long[] a) {

    /**
     * Same behaviour than the toArray(long[] a) method in
     * {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final long remove(final int index) {

    /**
     * Same behaviour than remove(int index) in {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final long remove(final int from, final int count) {

    /**
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final void add(final int at,final long[] src, final int from,
                          final int count) {

    /**
     * Adds <var>count</var> elements to the list.
     * @param at index at which the elements must be inserted. The
     *        first element will be inserted at this index.
     * @param src  An array containing the elements we want to insert.
     * @param from Index of the first element from <var>src</var> that
     *        must be inserted.
     * @param count number of elements to insert.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final void add(final int index, final long o) {

    /**
     * Same behaviour than add(int index, long o) in
     * {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final boolean add(final long o) {

    /**
     * Same behaviour than add(long o) in {@link java.util.List}.
     * Any access to this method should be protected in a synchronized
     * block on the LongList object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public final int size() { return size;}

    /**
     * Same behaviour than size() in {@link java.util.List}.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
    public  long[] list;

    /**
     * The list content. Any access to this variable must be protected
     * by a synchronized block on the LongList object.
     * Only read-only action should be performed on this object.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/agent/LongList.java
final class LongList {

/**
 * This list is used in order to construct the OID during the getnext.
 * The constructed oid is checked by the checker AcmChecker.
 */
