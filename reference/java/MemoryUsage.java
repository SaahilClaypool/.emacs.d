_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public static MemoryUsage from(CompositeData cd) {

    /**
     * Returns a <tt>MemoryUsage</tt> object represented by the
     * given <tt>CompositeData</tt>. The given <tt>CompositeData</tt>
     * must contain the following attributes:
     *
     * <blockquote>
     * <table border summary="The attributes and the types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>init</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>used</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>committed</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>max</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MemoryUsage</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MemoryUsage</tt> with the attributes described
     *   above.
     *
     * @return a <tt>MemoryUsage</tt> object represented by <tt>cd</tt>
     *         if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public String toString() {

    /**
     * Returns a descriptive representation of this memory usage.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getMax() {

    /**
     * Returns the maximum amount of memory in bytes that can be
     * used for memory management.  This method returns <tt>-1</tt>
     * if the maximum memory size is undefined.
     *
     * <p> This amount of memory is not guaranteed to be available
     * for memory management if it is greater than the amount of
     * committed memory.  The Java virtual machine may fail to allocate
     * memory even if the amount of used memory does not exceed this
     * maximum size.
     *
     * @return the maximum amount of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getCommitted() {

    /**
     * Returns the amount of memory in bytes that is committed for
     * the Java virtual machine to use.  This amount of memory is
     * guaranteed for the Java virtual machine to use.
     *
     * @return the amount of committed memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getUsed() {

    /**
     * Returns the amount of used memory in bytes.
     *
     * @return the amount of used memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getInit() {

    /**
     * Returns the amount of memory in bytes that the Java virtual machine
     * initially requests from the operating system for memory management.
     * This method returns <tt>-1</tt> if the initial memory size is undefined.
     *
     * @return the initial size of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    private MemoryUsage(CompositeData cd) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object from a
     * {@link CompositeData CompositeData}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public MemoryUsage(long init,
                       long used,
                       long committed,
                       long max) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object.
     *
     * @param init      the initial amount of memory in bytes that
     *                  the Java virtual machine allocates;
     *                  or <tt>-1</tt> if undefined.
     * @param used      the amount of used memory in bytes.
     * @param committed the amount of committed memory in bytes.
     * @param max       the maximum amount of memory in bytes that
     *                  can be used; or <tt>-1</tt> if undefined.
     *
     * @throws IllegalArgumentException if
     * <ul>
     * <li> the value of <tt>init</tt> or <tt>max</tt> is negative
     *      but not <tt>-1</tt>; or</li>
     * <li> the value of <tt>used</tt> or <tt>committed</tt> is negative;
     *      or</li>
     * <li> <tt>used</tt> is greater than the value of <tt>committed</tt>;
     *      or</li>
     * <li> <tt>committed</tt> is greater than the value of <tt>max</tt>
     *      <tt>max</tt> if defined.</li>
     * </ul>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
public class MemoryUsage {

/**
 * A <tt>MemoryUsage</tt> object represents a snapshot of memory usage.
 * Instances of the <tt>MemoryUsage</tt> class are usually constructed
 * by methods that are used to obtain memory usage
 * information about individual memory pool of the Java virtual machine or
 * the heap or non-heap memory of the Java virtual machine as a whole.
 *
 * <p> A <tt>MemoryUsage</tt> object contains four values:
 * <table summary="Describes the MemoryUsage object content">
 * <tr>
 * <td valign=top> <tt>init</tt> </td>
 * <td valign=top> represents the initial amount of memory (in bytes) that
 *      the Java virtual machine requests from the operating system
 *      for memory management during startup.  The Java virtual machine
 *      may request additional memory from the operating system and
 *      may also release memory to the system over time.
 *      The value of <tt>init</tt> may be undefined.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>used</tt> </td>
 * <td valign=top> represents the amount of memory currently used (in bytes).
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>committed</tt> </td>
 * <td valign=top> represents the amount of memory (in bytes) that is
 *      guaranteed to be available for use by the Java virtual machine.
 *      The amount of committed memory may change over time (increase
 *      or decrease).  The Java virtual machine may release memory to
 *      the system and <tt>committed</tt> could be less than <tt>init</tt>.
 *      <tt>committed</tt> will always be greater than
 *      or equal to <tt>used</tt>.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>max</tt> </td>
 * <td valign=top> represents the maximum amount of memory (in bytes)
 *      that can be used for memory management. Its value may be undefined.
 *      The maximum amount of memory may change over time if defined.
 *      The amount of used and committed memory will always be less than
 *      or equal to <tt>max</tt> if <tt>max</tt> is defined.
 *      A memory allocation may fail if it attempts to increase the
 *      used memory such that <tt>used &gt; committed</tt> even
 *      if <tt>used &lt;= max</tt> would still be true (for example,
 *      when the system is low on virtual memory).
 * </td>
 * </tr>
 * </table>
 *
 * Below is a picture showing an example of a memory pool:
 *
 * <pre>
 *        +----------------------------------------------+
 *        +////////////////           |                  +
 *        +////////////////           |                  +
 *        +----------------------------------------------+
 *
 *        |--------|
 *           init
 *        |---------------|
 *               used
 *        |---------------------------|
 *                  committed
 *        |----------------------------------------------|
 *                            max
 * </pre>
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MemoryUsage</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in the {@link #from from} method.
 *
 * @author   Mandy Chung
 * @since   1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public static MemoryUsage from(CompositeData cd) {

    /**
     * Returns a <tt>MemoryUsage</tt> object represented by the
     * given <tt>CompositeData</tt>. The given <tt>CompositeData</tt>
     * must contain the following attributes:
     *
     * <blockquote>
     * <table border summary="The attributes and the types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>init</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>used</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>committed</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>max</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MemoryUsage</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MemoryUsage</tt> with the attributes described
     *   above.
     *
     * @return a <tt>MemoryUsage</tt> object represented by <tt>cd</tt>
     *         if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public String toString() {

    /**
     * Returns a descriptive representation of this memory usage.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getMax() {

    /**
     * Returns the maximum amount of memory in bytes that can be
     * used for memory management.  This method returns <tt>-1</tt>
     * if the maximum memory size is undefined.
     *
     * <p> This amount of memory is not guaranteed to be available
     * for memory management if it is greater than the amount of
     * committed memory.  The Java virtual machine may fail to allocate
     * memory even if the amount of used memory does not exceed this
     * maximum size.
     *
     * @return the maximum amount of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getCommitted() {

    /**
     * Returns the amount of memory in bytes that is committed for
     * the Java virtual machine to use.  This amount of memory is
     * guaranteed for the Java virtual machine to use.
     *
     * @return the amount of committed memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getUsed() {

    /**
     * Returns the amount of used memory in bytes.
     *
     * @return the amount of used memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getInit() {

    /**
     * Returns the amount of memory in bytes that the Java virtual machine
     * initially requests from the operating system for memory management.
     * This method returns <tt>-1</tt> if the initial memory size is undefined.
     *
     * @return the initial size of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    private MemoryUsage(CompositeData cd) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object from a
     * {@link CompositeData CompositeData}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public MemoryUsage(long init,
                       long used,
                       long committed,
                       long max) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object.
     *
     * @param init      the initial amount of memory in bytes that
     *                  the Java virtual machine allocates;
     *                  or <tt>-1</tt> if undefined.
     * @param used      the amount of used memory in bytes.
     * @param committed the amount of committed memory in bytes.
     * @param max       the maximum amount of memory in bytes that
     *                  can be used; or <tt>-1</tt> if undefined.
     *
     * @throws IllegalArgumentException if
     * <ul>
     * <li> the value of <tt>init</tt> or <tt>max</tt> is negative
     *      but not <tt>-1</tt>; or</li>
     * <li> the value of <tt>used</tt> or <tt>committed</tt> is negative;
     *      or</li>
     * <li> <tt>used</tt> is greater than the value of <tt>committed</tt>;
     *      or</li>
     * <li> <tt>committed</tt> is greater than the value of <tt>max</tt>
     *      <tt>max</tt> if defined.</li>
     * </ul>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
public class MemoryUsage {

/**
 * A <tt>MemoryUsage</tt> object represents a snapshot of memory usage.
 * Instances of the <tt>MemoryUsage</tt> class are usually constructed
 * by methods that are used to obtain memory usage
 * information about individual memory pool of the Java virtual machine or
 * the heap or non-heap memory of the Java virtual machine as a whole.
 *
 * <p> A <tt>MemoryUsage</tt> object contains four values:
 * <table summary="Describes the MemoryUsage object content">
 * <tr>
 * <td valign=top> <tt>init</tt> </td>
 * <td valign=top> represents the initial amount of memory (in bytes) that
 *      the Java virtual machine requests from the operating system
 *      for memory management during startup.  The Java virtual machine
 *      may request additional memory from the operating system and
 *      may also release memory to the system over time.
 *      The value of <tt>init</tt> may be undefined.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>used</tt> </td>
 * <td valign=top> represents the amount of memory currently used (in bytes).
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>committed</tt> </td>
 * <td valign=top> represents the amount of memory (in bytes) that is
 *      guaranteed to be available for use by the Java virtual machine.
 *      The amount of committed memory may change over time (increase
 *      or decrease).  The Java virtual machine may release memory to
 *      the system and <tt>committed</tt> could be less than <tt>init</tt>.
 *      <tt>committed</tt> will always be greater than
 *      or equal to <tt>used</tt>.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>max</tt> </td>
 * <td valign=top> represents the maximum amount of memory (in bytes)
 *      that can be used for memory management. Its value may be undefined.
 *      The maximum amount of memory may change over time if defined.
 *      The amount of used and committed memory will always be less than
 *      or equal to <tt>max</tt> if <tt>max</tt> is defined.
 *      A memory allocation may fail if it attempts to increase the
 *      used memory such that <tt>used &gt; committed</tt> even
 *      if <tt>used &lt;= max</tt> would still be true (for example,
 *      when the system is low on virtual memory).
 * </td>
 * </tr>
 * </table>
 *
 * Below is a picture showing an example of a memory pool:
 *
 * <pre>
 *        +----------------------------------------------+
 *        +////////////////           |                  +
 *        +////////////////           |                  +
 *        +----------------------------------------------+
 *
 *        |--------|
 *           init
 *        |---------------|
 *               used
 *        |---------------------------|
 *                  committed
 *        |----------------------------------------------|
 *                            max
 * </pre>
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MemoryUsage</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in the {@link #from from} method.
 *
 * @author   Mandy Chung
 * @since   1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public static MemoryUsage from(CompositeData cd) {

    /**
     * Returns a <tt>MemoryUsage</tt> object represented by the
     * given <tt>CompositeData</tt>. The given <tt>CompositeData</tt>
     * must contain the following attributes:
     *
     * <blockquote>
     * <table border summary="The attributes and the types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>init</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>used</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>committed</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>max</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MemoryUsage</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MemoryUsage</tt> with the attributes described
     *   above.
     *
     * @return a <tt>MemoryUsage</tt> object represented by <tt>cd</tt>
     *         if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public String toString() {

    /**
     * Returns a descriptive representation of this memory usage.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getMax() {

    /**
     * Returns the maximum amount of memory in bytes that can be
     * used for memory management.  This method returns <tt>-1</tt>
     * if the maximum memory size is undefined.
     *
     * <p> This amount of memory is not guaranteed to be available
     * for memory management if it is greater than the amount of
     * committed memory.  The Java virtual machine may fail to allocate
     * memory even if the amount of used memory does not exceed this
     * maximum size.
     *
     * @return the maximum amount of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getCommitted() {

    /**
     * Returns the amount of memory in bytes that is committed for
     * the Java virtual machine to use.  This amount of memory is
     * guaranteed for the Java virtual machine to use.
     *
     * @return the amount of committed memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getUsed() {

    /**
     * Returns the amount of used memory in bytes.
     *
     * @return the amount of used memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getInit() {

    /**
     * Returns the amount of memory in bytes that the Java virtual machine
     * initially requests from the operating system for memory management.
     * This method returns <tt>-1</tt> if the initial memory size is undefined.
     *
     * @return the initial size of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    private MemoryUsage(CompositeData cd) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object from a
     * {@link CompositeData CompositeData}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public MemoryUsage(long init,
                       long used,
                       long committed,
                       long max) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object.
     *
     * @param init      the initial amount of memory in bytes that
     *                  the Java virtual machine allocates;
     *                  or <tt>-1</tt> if undefined.
     * @param used      the amount of used memory in bytes.
     * @param committed the amount of committed memory in bytes.
     * @param max       the maximum amount of memory in bytes that
     *                  can be used; or <tt>-1</tt> if undefined.
     *
     * @throws IllegalArgumentException if
     * <ul>
     * <li> the value of <tt>init</tt> or <tt>max</tt> is negative
     *      but not <tt>-1</tt>; or</li>
     * <li> the value of <tt>used</tt> or <tt>committed</tt> is negative;
     *      or</li>
     * <li> <tt>used</tt> is greater than the value of <tt>committed</tt>;
     *      or</li>
     * <li> <tt>committed</tt> is greater than the value of <tt>max</tt>
     *      <tt>max</tt> if defined.</li>
     * </ul>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
public class MemoryUsage {

/**
 * A <tt>MemoryUsage</tt> object represents a snapshot of memory usage.
 * Instances of the <tt>MemoryUsage</tt> class are usually constructed
 * by methods that are used to obtain memory usage
 * information about individual memory pool of the Java virtual machine or
 * the heap or non-heap memory of the Java virtual machine as a whole.
 *
 * <p> A <tt>MemoryUsage</tt> object contains four values:
 * <table summary="Describes the MemoryUsage object content">
 * <tr>
 * <td valign=top> <tt>init</tt> </td>
 * <td valign=top> represents the initial amount of memory (in bytes) that
 *      the Java virtual machine requests from the operating system
 *      for memory management during startup.  The Java virtual machine
 *      may request additional memory from the operating system and
 *      may also release memory to the system over time.
 *      The value of <tt>init</tt> may be undefined.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>used</tt> </td>
 * <td valign=top> represents the amount of memory currently used (in bytes).
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>committed</tt> </td>
 * <td valign=top> represents the amount of memory (in bytes) that is
 *      guaranteed to be available for use by the Java virtual machine.
 *      The amount of committed memory may change over time (increase
 *      or decrease).  The Java virtual machine may release memory to
 *      the system and <tt>committed</tt> could be less than <tt>init</tt>.
 *      <tt>committed</tt> will always be greater than
 *      or equal to <tt>used</tt>.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>max</tt> </td>
 * <td valign=top> represents the maximum amount of memory (in bytes)
 *      that can be used for memory management. Its value may be undefined.
 *      The maximum amount of memory may change over time if defined.
 *      The amount of used and committed memory will always be less than
 *      or equal to <tt>max</tt> if <tt>max</tt> is defined.
 *      A memory allocation may fail if it attempts to increase the
 *      used memory such that <tt>used &gt; committed</tt> even
 *      if <tt>used &lt;= max</tt> would still be true (for example,
 *      when the system is low on virtual memory).
 * </td>
 * </tr>
 * </table>
 *
 * Below is a picture showing an example of a memory pool:
 *
 * <pre>
 *        +----------------------------------------------+
 *        +////////////////           |                  +
 *        +////////////////           |                  +
 *        +----------------------------------------------+
 *
 *        |--------|
 *           init
 *        |---------------|
 *               used
 *        |---------------------------|
 *                  committed
 *        |----------------------------------------------|
 *                            max
 * </pre>
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MemoryUsage</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in the {@link #from from} method.
 *
 * @author   Mandy Chung
 * @since   1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public static MemoryUsage from(CompositeData cd) {

    /**
     * Returns a <tt>MemoryUsage</tt> object represented by the
     * given <tt>CompositeData</tt>. The given <tt>CompositeData</tt>
     * must contain the following attributes:
     *
     * <blockquote>
     * <table border summary="The attributes and the types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>init</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>used</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>committed</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>max</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MemoryUsage</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MemoryUsage</tt> with the attributes described
     *   above.
     *
     * @return a <tt>MemoryUsage</tt> object represented by <tt>cd</tt>
     *         if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public String toString() {

    /**
     * Returns a descriptive representation of this memory usage.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getMax() {

    /**
     * Returns the maximum amount of memory in bytes that can be
     * used for memory management.  This method returns <tt>-1</tt>
     * if the maximum memory size is undefined.
     *
     * <p> This amount of memory is not guaranteed to be available
     * for memory management if it is greater than the amount of
     * committed memory.  The Java virtual machine may fail to allocate
     * memory even if the amount of used memory does not exceed this
     * maximum size.
     *
     * @return the maximum amount of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getCommitted() {

    /**
     * Returns the amount of memory in bytes that is committed for
     * the Java virtual machine to use.  This amount of memory is
     * guaranteed for the Java virtual machine to use.
     *
     * @return the amount of committed memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getUsed() {

    /**
     * Returns the amount of used memory in bytes.
     *
     * @return the amount of used memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getInit() {

    /**
     * Returns the amount of memory in bytes that the Java virtual machine
     * initially requests from the operating system for memory management.
     * This method returns <tt>-1</tt> if the initial memory size is undefined.
     *
     * @return the initial size of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    private MemoryUsage(CompositeData cd) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object from a
     * {@link CompositeData CompositeData}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public MemoryUsage(long init,
                       long used,
                       long committed,
                       long max) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object.
     *
     * @param init      the initial amount of memory in bytes that
     *                  the Java virtual machine allocates;
     *                  or <tt>-1</tt> if undefined.
     * @param used      the amount of used memory in bytes.
     * @param committed the amount of committed memory in bytes.
     * @param max       the maximum amount of memory in bytes that
     *                  can be used; or <tt>-1</tt> if undefined.
     *
     * @throws IllegalArgumentException if
     * <ul>
     * <li> the value of <tt>init</tt> or <tt>max</tt> is negative
     *      but not <tt>-1</tt>; or</li>
     * <li> the value of <tt>used</tt> or <tt>committed</tt> is negative;
     *      or</li>
     * <li> <tt>used</tt> is greater than the value of <tt>committed</tt>;
     *      or</li>
     * <li> <tt>committed</tt> is greater than the value of <tt>max</tt>
     *      <tt>max</tt> if defined.</li>
     * </ul>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
public class MemoryUsage {

/**
 * A <tt>MemoryUsage</tt> object represents a snapshot of memory usage.
 * Instances of the <tt>MemoryUsage</tt> class are usually constructed
 * by methods that are used to obtain memory usage
 * information about individual memory pool of the Java virtual machine or
 * the heap or non-heap memory of the Java virtual machine as a whole.
 *
 * <p> A <tt>MemoryUsage</tt> object contains four values:
 * <table summary="Describes the MemoryUsage object content">
 * <tr>
 * <td valign=top> <tt>init</tt> </td>
 * <td valign=top> represents the initial amount of memory (in bytes) that
 *      the Java virtual machine requests from the operating system
 *      for memory management during startup.  The Java virtual machine
 *      may request additional memory from the operating system and
 *      may also release memory to the system over time.
 *      The value of <tt>init</tt> may be undefined.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>used</tt> </td>
 * <td valign=top> represents the amount of memory currently used (in bytes).
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>committed</tt> </td>
 * <td valign=top> represents the amount of memory (in bytes) that is
 *      guaranteed to be available for use by the Java virtual machine.
 *      The amount of committed memory may change over time (increase
 *      or decrease).  The Java virtual machine may release memory to
 *      the system and <tt>committed</tt> could be less than <tt>init</tt>.
 *      <tt>committed</tt> will always be greater than
 *      or equal to <tt>used</tt>.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>max</tt> </td>
 * <td valign=top> represents the maximum amount of memory (in bytes)
 *      that can be used for memory management. Its value may be undefined.
 *      The maximum amount of memory may change over time if defined.
 *      The amount of used and committed memory will always be less than
 *      or equal to <tt>max</tt> if <tt>max</tt> is defined.
 *      A memory allocation may fail if it attempts to increase the
 *      used memory such that <tt>used &gt; committed</tt> even
 *      if <tt>used &lt;= max</tt> would still be true (for example,
 *      when the system is low on virtual memory).
 * </td>
 * </tr>
 * </table>
 *
 * Below is a picture showing an example of a memory pool:
 *
 * <pre>
 *        +----------------------------------------------+
 *        +////////////////           |                  +
 *        +////////////////           |                  +
 *        +----------------------------------------------+
 *
 *        |--------|
 *           init
 *        |---------------|
 *               used
 *        |---------------------------|
 *                  committed
 *        |----------------------------------------------|
 *                            max
 * </pre>
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MemoryUsage</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in the {@link #from from} method.
 *
 * @author   Mandy Chung
 * @since   1.5
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public static MemoryUsage from(CompositeData cd) {

    /**
     * Returns a <tt>MemoryUsage</tt> object represented by the
     * given <tt>CompositeData</tt>. The given <tt>CompositeData</tt>
     * must contain the following attributes:
     *
     * <blockquote>
     * <table border summary="The attributes and the types the given CompositeData contains">
     * <tr>
     *   <th align=left>Attribute Name</th>
     *   <th align=left>Type</th>
     * </tr>
     * <tr>
     *   <td>init</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>used</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>committed</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * <tr>
     *   <td>max</td>
     *   <td><tt>java.lang.Long</tt></td>
     * </tr>
     * </table>
     * </blockquote>
     *
     * @param cd <tt>CompositeData</tt> representing a <tt>MemoryUsage</tt>
     *
     * @throws IllegalArgumentException if <tt>cd</tt> does not
     *   represent a <tt>MemoryUsage</tt> with the attributes described
     *   above.
     *
     * @return a <tt>MemoryUsage</tt> object represented by <tt>cd</tt>
     *         if <tt>cd</tt> is not <tt>null</tt>;
     *         <tt>null</tt> otherwise.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public String toString() {

    /**
     * Returns a descriptive representation of this memory usage.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getMax() {

    /**
     * Returns the maximum amount of memory in bytes that can be
     * used for memory management.  This method returns <tt>-1</tt>
     * if the maximum memory size is undefined.
     *
     * <p> This amount of memory is not guaranteed to be available
     * for memory management if it is greater than the amount of
     * committed memory.  The Java virtual machine may fail to allocate
     * memory even if the amount of used memory does not exceed this
     * maximum size.
     *
     * @return the maximum amount of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getCommitted() {

    /**
     * Returns the amount of memory in bytes that is committed for
     * the Java virtual machine to use.  This amount of memory is
     * guaranteed for the Java virtual machine to use.
     *
     * @return the amount of committed memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getUsed() {

    /**
     * Returns the amount of used memory in bytes.
     *
     * @return the amount of used memory in bytes.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public long getInit() {

    /**
     * Returns the amount of memory in bytes that the Java virtual machine
     * initially requests from the operating system for memory management.
     * This method returns <tt>-1</tt> if the initial memory size is undefined.
     *
     * @return the initial size of memory in bytes;
     * <tt>-1</tt> if undefined.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    private MemoryUsage(CompositeData cd) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object from a
     * {@link CompositeData CompositeData}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
    public MemoryUsage(long init,
                       long used,
                       long committed,
                       long max) {

    /**
     * Constructs a <tt>MemoryUsage</tt> object.
     *
     * @param init      the initial amount of memory in bytes that
     *                  the Java virtual machine allocates;
     *                  or <tt>-1</tt> if undefined.
     * @param used      the amount of used memory in bytes.
     * @param committed the amount of committed memory in bytes.
     * @param max       the maximum amount of memory in bytes that
     *                  can be used; or <tt>-1</tt> if undefined.
     *
     * @throws IllegalArgumentException if
     * <ul>
     * <li> the value of <tt>init</tt> or <tt>max</tt> is negative
     *      but not <tt>-1</tt>; or</li>
     * <li> the value of <tt>used</tt> or <tt>committed</tt> is negative;
     *      or</li>
     * <li> <tt>used</tt> is greater than the value of <tt>committed</tt>;
     *      or</li>
     * <li> <tt>committed</tt> is greater than the value of <tt>max</tt>
     *      <tt>max</tt> if defined.</li>
     * </ul>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/java/lang//management/MemoryUsage.java
public class MemoryUsage {

/**
 * A <tt>MemoryUsage</tt> object represents a snapshot of memory usage.
 * Instances of the <tt>MemoryUsage</tt> class are usually constructed
 * by methods that are used to obtain memory usage
 * information about individual memory pool of the Java virtual machine or
 * the heap or non-heap memory of the Java virtual machine as a whole.
 *
 * <p> A <tt>MemoryUsage</tt> object contains four values:
 * <table summary="Describes the MemoryUsage object content">
 * <tr>
 * <td valign=top> <tt>init</tt> </td>
 * <td valign=top> represents the initial amount of memory (in bytes) that
 *      the Java virtual machine requests from the operating system
 *      for memory management during startup.  The Java virtual machine
 *      may request additional memory from the operating system and
 *      may also release memory to the system over time.
 *      The value of <tt>init</tt> may be undefined.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>used</tt> </td>
 * <td valign=top> represents the amount of memory currently used (in bytes).
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>committed</tt> </td>
 * <td valign=top> represents the amount of memory (in bytes) that is
 *      guaranteed to be available for use by the Java virtual machine.
 *      The amount of committed memory may change over time (increase
 *      or decrease).  The Java virtual machine may release memory to
 *      the system and <tt>committed</tt> could be less than <tt>init</tt>.
 *      <tt>committed</tt> will always be greater than
 *      or equal to <tt>used</tt>.
 * </td>
 * </tr>
 * <tr>
 * <td valign=top> <tt>max</tt> </td>
 * <td valign=top> represents the maximum amount of memory (in bytes)
 *      that can be used for memory management. Its value may be undefined.
 *      The maximum amount of memory may change over time if defined.
 *      The amount of used and committed memory will always be less than
 *      or equal to <tt>max</tt> if <tt>max</tt> is defined.
 *      A memory allocation may fail if it attempts to increase the
 *      used memory such that <tt>used &gt; committed</tt> even
 *      if <tt>used &lt;= max</tt> would still be true (for example,
 *      when the system is low on virtual memory).
 * </td>
 * </tr>
 * </table>
 *
 * Below is a picture showing an example of a memory pool:
 *
 * <pre>
 *        +----------------------------------------------+
 *        +////////////////           |                  +
 *        +////////////////           |                  +
 *        +----------------------------------------------+
 *
 *        |--------|
 *           init
 *        |---------------|
 *               used
 *        |---------------------------|
 *                  committed
 *        |----------------------------------------------|
 *                            max
 * </pre>
 *
 * <h3>MXBean Mapping</h3>
 * <tt>MemoryUsage</tt> is mapped to a {@link CompositeData CompositeData}
 * with attributes as specified in the {@link #from from} method.
 *
 * @author   Mandy Chung
 * @since   1.5
 */
