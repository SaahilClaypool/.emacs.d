_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    private static boolean isTainted(Collection<?> c) {

    /**
     * Returns true if c contains any non-RoleUnresolved objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    private static boolean isTainted(Object o) {

    /**
     * Returns true if o is a non-RoleUnresolved object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    private static void checkTypeSafe(Collection<?> c) {

    /**
     * IllegalArgumentException if c contains any non-RoleUnresolved objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    private static void checkTypeSafe(Object o) {

    /**
     * IllegalArgumentException if o is a non-RoleUnresolved object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    public boolean addAll(int index,
                          RoleUnresolvedList roleList)

    /**
     * Inserts all of the elements in the RoleUnresolvedList specified into
     * this list, starting at the specified position, in the order in which
     * they are returned by the Iterator of the RoleUnresolvedList specified.
     *
     * @param index - Position at which to insert the first element from the
     * RoleUnresolvedList specified.
     * @param roleList - Elements to be inserted into the list.
     *
     * @return true if this list changed as a result of the call.
     *
     * @exception IllegalArgumentException  if the role is null.
     * @exception IndexOutOfBoundsException if index is out of range
     * (<code>index &lt; 0 || index &gt; size()</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    public boolean addAll(RoleUnresolvedList roleList)

    /**
     * Appends all the elements in the RoleUnresolvedList specified to the end
     * of the list, in the order in which they are returned by the Iterator of
     * the RoleUnresolvedList specified.
     *
     * @param roleList - Elements to be inserted into the list
     * (can be null).
     *
     * @return true if this list changed as a result of the call.
     *
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
     public void set(int index,
                     RoleUnresolved role)

    /**
     * Sets the element at the position specified to be the unresolved role
     * specified.
     * The previous element at that position is discarded.
     *
     * @param index - The position specified.
     * @param role - The value to which the unresolved role element
     * should be set.
     *
     * @exception IllegalArgumentException   if the unresolved role is null.
     * @exception IndexOutOfBoundsException if index is out of range
     * (<code>index &lt; 0 || index &gt;= size()</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    public void add(int index,
                    RoleUnresolved role)

    /**
     * Inserts the unresolved role specified as an element at the position
     * specified.
     * Elements with an index greater than or equal to the current position are
     * shifted up.
     *
     * @param index - The position in the list where the new
     * RoleUnresolved object is to be inserted.
     * @param role - The RoleUnresolved object to be inserted.
     *
     * @exception IllegalArgumentException  if the unresolved role is null.
     * @exception IndexOutOfBoundsException if index is out of range
     * (<code>index &lt; 0 || index &gt; size()</code>).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    public void add(RoleUnresolved role)

    /**
     * Adds the RoleUnresolved specified as the last element of the list.
     *
     * @param role - the unresolved role to be added.
     *
     * @exception IllegalArgumentException  if the unresolved role is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    @SuppressWarnings("unchecked")

    /**
     * Return a view of this list as a {@code List<RoleUnresolved>}.
     * Changes to the returned value are reflected by changes
     * to the original {@code RoleUnresolvedList} and vice versa.
     *
     * @return a {@code List<RoleUnresolved>} whose contents
     * reflect the contents of this {@code RoleUnresolvedList}.
     *
     * <p>If this method has ever been called on a given
     * {@code RoleUnresolvedList} instance, a subsequent attempt to add
     * an object to that instance which is not a {@code RoleUnresolved}
     * will fail with an {@code IllegalArgumentException}. For compatibility
     * reasons, a {@code RoleUnresolvedList} on which this method has never
     * been called does allow objects other than {@code RoleUnresolved}s to
     * be added.</p>
     *
     * @throws IllegalArgumentException if this {@code RoleUnresolvedList}
     * contains an element that is not a {@code RoleUnresolved}.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    public RoleUnresolvedList(List<RoleUnresolved> list)

    /**
     * Constructs a {@code RoleUnresolvedList} containing the elements of the
     * {@code List} specified, in the order in which they are returned by
     * the {@code List}'s iterator. The {@code RoleUnresolvedList} instance has
     * an initial capacity of 110% of the size of the {@code List}
     * specified.
     *
     * @param list the {@code List} that defines the initial contents of
     * the new {@code RoleUnresolvedList}.
     *
     * @exception IllegalArgumentException if the {@code list} parameter
     * is {@code null} or if the {@code list} parameter contains any
     * non-RoleUnresolved objects.
     *
     * @see ArrayList#ArrayList(java.util.Collection)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    public RoleUnresolvedList(int initialCapacity) {

    /**
     * Constructs an empty RoleUnresolvedList with the initial capacity
     * specified.
     *
     * @param initialCapacity  initial capacity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
    public RoleUnresolvedList() {

    /**
     * Constructs an empty RoleUnresolvedList.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleUnresolvedList.java
/* We cannot extend ArrayList<RoleUnresolved> because our legacy

/**
 * A RoleUnresolvedList represents a list of RoleUnresolved objects,
 * representing roles not retrieved from a relation due to a problem
 * encountered when trying to access (read or write) the roles.
 *
 * @since 1.5
 */
