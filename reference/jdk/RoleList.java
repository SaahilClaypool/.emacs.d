_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    private static boolean isTainted(Collection<?> c) {

    /**
     * Returns true if c contains any non-Role objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    private static boolean isTainted(Object o) {

    /**
     * Returns true if o is a non-Role object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    private static void checkTypeSafe(Collection<?> c) {

    /**
     * IllegalArgumentException if c contains any non-Role objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    private static void checkTypeSafe(Object o) {

    /**
     * IllegalArgumentException if o is a non-Role object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    public boolean addAll(int index,
                          RoleList roleList)

    /**
     * Inserts all of the elements in the RoleList specified into this
     * list, starting at the specified position, in the order in which they are
     * returned by the Iterator of the RoleList specified.
     *
     * @param index  Position at which to insert the first element from the
     * RoleList specified.
     * @param roleList  Elements to be inserted into the list.
     *
     * @return true if this list changed as a result of the call.
     *
     * @exception IllegalArgumentException  if the role is null.
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     *
     * @see ArrayList#addAll(int, Collection)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    public boolean addAll(RoleList roleList)

    /**
     * Appends all the elements in the RoleList specified to the end
     * of the list, in the order in which they are returned by the Iterator of
     * the RoleList specified.
     *
     * @param roleList  Elements to be inserted into the list (can be null)
     *
     * @return true if this list changed as a result of the call.
     *
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     *
     * @see ArrayList#addAll(Collection)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
     public void set(int index,
                     Role role)

    /**
     * Sets the element at the position specified to be the role
     * specified.
     * The previous element at that position is discarded.
     *
     * @param index  The position specified.
     * @param role  The value to which the role element should be set.
     *
     * @exception IllegalArgumentException  if the role is null.
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    public void add(int index,
                    Role role)

    /**
     * Inserts the role specified as an element at the position specified.
     * Elements with an index greater than or equal to the current position are
     * shifted up.
     *
     * @param index  The position in the list where the new Role
     * object is to be inserted.
     * @param role  The Role object to be inserted.
     *
     * @exception IllegalArgumentException  if the role is null.
     * @exception IndexOutOfBoundsException  if accessing with an index
     * outside of the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    public void add(Role role)

    /**
     * Adds the Role specified as the last element of the list.
     *
     * @param role  the role to be added.
     *
     * @exception IllegalArgumentException  if the role is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    @SuppressWarnings("unchecked")

    /**
     * Return a view of this list as a {@code List<Role>}.
     * Changes to the returned value are reflected by changes
     * to the original {@code RoleList} and vice versa.
     *
     * @return a {@code List<Role>} whose contents
     * reflect the contents of this {@code RoleList}.
     *
     * <p>If this method has ever been called on a given
     * {@code RoleList} instance, a subsequent attempt to add
     * an object to that instance which is not a {@code Role}
     * will fail with an {@code IllegalArgumentException}. For compatibility
     * reasons, a {@code RoleList} on which this method has never
     * been called does allow objects other than {@code Role}s to
     * be added.</p>
     *
     * @throws IllegalArgumentException if this {@code RoleList} contains
     * an element that is not a {@code Role}.
     *
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    public RoleList(List<Role> list) throws IllegalArgumentException {

    /**
     * Constructs a {@code RoleList} containing the elements of the
     * {@code List} specified, in the order in which they are returned by
     * the {@code List}'s iterator. The {@code RoleList} instance has
     * an initial capacity of 110% of the size of the {@code List}
     * specified.
     *
     * @param list the {@code List} that defines the initial contents of
     * the new {@code RoleList}.
     *
     * @exception IllegalArgumentException if the {@code list} parameter
     * is {@code null} or if the {@code list} parameter contains any
     * non-Role objects.
     *
     * @see ArrayList#ArrayList(java.util.Collection)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    public RoleList(int initialCapacity) {

    /**
     * Constructs an empty RoleList with the initial capacity
     * specified.
     *
     * @param initialCapacity  initial capacity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
    public RoleList() {

    /**
     * Constructs an empty RoleList.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/relation/RoleList.java
/* We cannot extend ArrayList<Role> because our legacy

/**
 * A RoleList represents a list of roles (Role objects). It is used as
 * parameter when creating a relation, and when trying to set several roles in
 * a relation (via 'setRoles()' method). It is returned as part of a
 * RoleResult, to provide roles successfully retrieved.
 *
 * @since 1.5
 */
