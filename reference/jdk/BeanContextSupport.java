_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected           boolean         designTime;

    /**
     * A <tt>boolean</tt> indicating whether or not
     * this object is currently in design time mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected           boolean         okToUseGui;

    /**
     * A <tt>boolean</tt> indicating if this
     * instance may now render a GUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected           Locale          locale;

    /**
     * The current locale of this BeanContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected transient ArrayList       bcmListeners;

    /**
     * all accesses to the <code> protected ArrayList bcmListeners </code> field
     * shall be synchronized on that object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected transient HashMap         children;

    /**
     * all accesses to the <code> protected HashMap children </code> field
     * shall be synchronized on that object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final boolean classEquals(Class first, Class second) {

    /**
     * Tests to see if two class objects,
     * or their names are equal.
     * @param first the first object
     * @param second the second object
     * @return true if equal, false if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final Object[] copyChildren() {

    /**
     * Gets a copy of the this BeanContext's children.
     * @return a copy of the current nested children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected synchronized void initialize() {

    /**
     * protected method called from constructor and readObject to initialize
     * transient state of BeanContextSupport instance.
     *
     * This class uses this method to instantiate inner class listeners used
     * to monitor PropertyChange and VetoableChange events on children.
     *
     * subclasses may envelope this method to add their own initialization
     * behavior
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final void fireChildrenRemoved(BeanContextMembershipEvent bcme) {

    /**
     * Fire a BeanContextshipEvent on the BeanContextMembershipListener interface
     * @param bcme the event to fire
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final void fireChildrenAdded(BeanContextMembershipEvent bcme) {

    /**
     * Fire a BeanContextshipEvent on the BeanContextMembershipListener interface
     * @param bcme the event to fire
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final BeanContextChild getChildBeanContextChild(Object child) {

    /**
     * Gets the BeanContextChild (if any) of the specified child
     * @param child the specified child
     * @return  the BeanContextChild (if any) of the specified child
     * @throws  IllegalArgumentException if child implements both BeanContextChild and BeanContextProxy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final BeanContextMembershipListener getChildBeanContextMembershipListener(Object child) {

    /**
     * Gets the BeanContextMembershipListener
     * (if any) of the specified child
     * @param child the specified child
     * @return the BeanContextMembershipListener (if any) of the specified child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final VetoableChangeListener getChildVetoableChangeListener(Object child) {

    /**
     * Gets the VetoableChangeListener
     * (if any) of the specified child
     * @param child the specified child
     * @return the VetoableChangeListener (if any) of the specified child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final PropertyChangeListener getChildPropertyChangeListener(Object child) {

    /**
     * Gets the PropertyChangeListener
     * (if any) of the specified child
     * @param child the specified child
     * @return the PropertyChangeListener (if any) of the specified child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final Serializable getChildSerializable(Object child) {

    /**
     * Gets the Serializable (if any) associated with the specified Child
     * @param child the specified child
     * @return the Serializable (if any) associated with the specified Child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final Visibility getChildVisibility(Object child) {

    /**
     * Gets the Component (if any) associated with the specified child.
     * @param child the specified child
     * @return the Component (if any) associated with the specified child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void childJustRemovedHook(Object child, BCSChild bcsc) {

    /**
     * subclasses may override this method to simply extend remove() semantics
     * after the child has been removed and before the event notification has
     * occurred. The method is called with the child synchronized.
     * @param child the child
     * @param bcsc the BCSChild
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void childJustAddedHook(Object child, BCSChild bcsc) {

    /**
     * subclasses may override this method to simply extend add() semantics
     * after the child has been added and before the event notification has
     * occurred. The method is called with the child synchronized.
     * @param child the child
     * @param bcsc the BCSChild
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected boolean validatePendingRemove(Object targetChild) {

    /**
     * <p>
     * Subclasses of this class may override, or envelope, this method to
     * add validation behavior for the BeanContext to examine child objects
     * immediately prior to their being removed from the BeanContext.
     * </p>
     *
     * @param targetChild the child to create the Child on behalf of
     * @return true iff the child may be removed from this BeanContext, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected boolean validatePendingAdd(Object targetChild) {

    /**
     * <p>
     * Subclasses of this class may override, or envelope, this method to
     * add validation behavior for the BeanContext to examine child objects
     * immediately prior to their being added to the BeanContext.
     * </p>
     *
     * @param targetChild the child to create the Child on behalf of
     * @return true iff the child may be added to this BeanContext, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void propertyChange(PropertyChangeEvent pce) {

    /**
     * subclasses may envelope to monitor child property changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void vetoableChange(PropertyChangeEvent pce) throws PropertyVetoException {

    /**
     * subclasses may envelope to monitor veto child property changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    private synchronized void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * deserialize contents ... if this instance has a distinct peer the
     * children are *not* serialized here, the peer's readObject() must call
     * readChildren() after deserializing this instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public final void readChildren(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * When an instance of this class is used as a delegate for the
     * implementation of the BeanContext protocols (and its subprotocols)
     * there exists a 'chicken and egg' problem during deserialization
     * @param ois the ObjectInputStream to use
     * @throws IOException if deserialization failed
     * @throws ClassNotFoundException if needed classes are not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    private synchronized void writeObject(ObjectOutputStream oos) throws IOException, ClassNotFoundException {

    /**
     * Serialize the BeanContextSupport, if this instance has a distinct
     * peer (that is this object is acting as a delegate for another) then
     * the children of this instance are not serialized here due to a
     * 'chicken and egg' problem that occurs on deserialization of the
     * children at the same time as this instance.
     *
     * Therefore in situations where there is a distinct peer to this instance
     * it should always call writeObject() followed by writeChildren() and
     * readObject() followed by readChildren().
     *
     * @param oos the ObjectOutputStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public final void writeChildren(ObjectOutputStream oos) throws IOException {

    /**
     * Used to serialize all children of
     * this <tt>BeanContext</tt>.
     * @param oos the <tt>ObjectOutputStream</tt>
     * to use during serialization
     * @throws IOException if serialization failed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final void deserialize(ObjectInputStream ois, Collection coll) throws IOException, ClassNotFoundException {

    /**
     * used by readObject to deserialize a collection.
     * @param ois the ObjectInputStream to use
     * @param coll the Collection
     * @throws IOException if deserialization failed
     * @throws ClassNotFoundException if needed classes are not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final void serialize(ObjectOutputStream oos, Collection coll) throws IOException {

    /**
     * Used by writeObject to serialize a Collection.
     * @param oos the <tt>ObjectOutputStream</tt>
     * to use during serialization
     * @param coll the <tt>Collection</tt> to serialize
     * @throws IOException if serialization failed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void childDeserializedHook(Object child, BCSChild bcsc) {

    /**
     * Called by readObject with the newly deserialized child and BCSChild.
     * @param child the newly deserialized child
     * @param bcsc the newly deserialized BCSChild
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void bcsPreDeserializationHook(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * called by readObject after defaultReadObject() but prior to
     * deserialization of any children.
     *
     * This method may be overridden by subclasses to perform custom
     * deserialization of their state prior to this superclass deserializing
     * the children.
     *
     * This method should not however be used by subclasses to replace their
     * own implementation (if any) of readObject().
     * @param ois the {@code ObjectInputStream} to use during deserialization
     * @throws IOException if deserialization failed
     * @throws ClassNotFoundException if needed classes are not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void bcsPreSerializationHook(ObjectOutputStream oos) throws IOException {

    /**
     * called by writeObject after defaultWriteObject() but prior to
     * serialization of currently serializable children.
     *
     * This method may be overridden by subclasses to perform custom
     * serialization of their state prior to this superclass serializing
     * the children.
     *
     * This method should not however be used by subclasses to replace their
     * own implementation (if any) of writeObject().
     * @param oos the {@code ObjectOutputStream} to use during serialization
     * @throws IOException if serialization failed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected Iterator bcsChildren() { synchronized(children) { return children.values().iterator();  } }

    /**
     * Returns an iterator of all children
     * of this <tt>BeanContext</tt>.
     * @return an iterator for all the current BCSChild values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean isSerializing() { return serializing; }

    /**
     * Is this <tt>BeanContext</tt> in the
     * process of being serialized?
     * @return if this <tt>BeanContext</tt> is
     * currently being serialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean avoidingGui() {

    /**
     * Used to determine if the <tt>BeanContext</tt>
     * child is avoiding using its GUI.
     * @return is this instance avoiding using its GUI?
     * @see Visibility
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized void okToUseGui() {

    /**
     * Notify this instance that it may now render a GUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized void dontUseGui() {

    /**
     * notify this instance that it may no longer render a GUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized boolean needsGui() {

    /**
     * <p>
     * This method is typically called from the environment in order to determine
     * if the implementor "needs" a GUI.
     * </p>
     * <p>
     * The algorithm used herein tests the BeanContextPeer, and its current children
     * to determine if they are either Containers, Components, or if they implement
     * Visibility and return needsGui() == true.
     * </p>
     * @return <tt>true</tt> if the implementor needs a GUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized Locale getLocale() { return locale; }

    /**
     * Gets the locale for this <tt>BeanContext</tt>.
     *
     * @return the current Locale of the <tt>BeanContext</tt>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized void setLocale(Locale newLocale) throws PropertyVetoException {

    /**
     * Sets the locale of this BeanContext.
     * @param newLocale the new locale. This method call will have
     *        no effect if newLocale is <CODE>null</CODE>.
     * @throws PropertyVetoException if the new value is rejected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized boolean isDesignTime() { return designTime; }

    /**
     * Reports whether or not this object is in
     * currently in design time mode.
     * @return <tt>true</tt> if in design time mode,
     * <tt>false</tt> if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized void setDesignTime(boolean dTime) {

    /**
     * Sets the new design time value for this <tt>BeanContext</tt>.
     * @param dTime the new designTime value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public URL getResource(String name, BeanContextChild bcc) {

    /**
     * @param name the name of the resource requested.
     * @param bcc  the child object making the request.
     *
     * @return the requested resource as an InputStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public InputStream getResourceAsStream(String name, BeanContextChild bcc) {

    /**
     * @param name the name of the resource requested.
     * @param bcc  the child object making the request.
     *
     * @return  the requested resource as an InputStream
     * @throws  NullPointerException if the argument is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void removeBeanContextMembershipListener(BeanContextMembershipListener bcml) {

    /**
     * Removes a BeanContextMembershipListener
     *
     * @param  bcml the BeanContextMembershipListener to remove
     * @throws NullPointerException if the argument is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void addBeanContextMembershipListener(BeanContextMembershipListener bcml) {

    /**
     * Adds a BeanContextMembershipListener
     *
     * @param  bcml the BeanContextMembershipListener to add
     * @throws NullPointerException if the argument is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void clear() {

    /**
     * clear the children (Unsupported)
     * implementations must synchronized on the hierarchy lock and "children" protected field
     * @throws UnsupportedOperationException thrown unconditionally by this implementation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean retainAll(Collection c) {

    /**
     * retain only specified children (Unsupported)
     * implementations must synchronized on the hierarchy lock and "children" protected field
     * @throws UnsupportedOperationException thrown unconditionally by this implementation
     * @return this implementation unconditionally throws {@code UnsupportedOperationException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean removeAll(Collection c) {

    /**
     * remove all specified children (Unsupported)
     * implementations must synchronized on the hierarchy lock and "children" protected field
     * @throws UnsupportedOperationException thrown unconditionally by this implementation
     * @return this implementation unconditionally throws {@code UnsupportedOperationException}

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean addAll(Collection c) {

    /**
     * add Collection to set of Children (Unsupported)
     * implementations must synchronized on the hierarchy lock and "children" protected field
     * @throws UnsupportedOperationException thrown unconditionally by this implementation
     * @return this implementation unconditionally throws {@code UnsupportedOperationException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean containsAll(Collection c) {

    /**
     * Tests to see if all objects in the
     * specified <tt>Collection</tt> are children of
     * this <tt>BeanContext</tt>.
     * @param c the specified <tt>Collection</tt>
     *
     * @return <tt>true</tt> if all objects
     * in the collection are children of
     * this <tt>BeanContext</tt>, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected boolean remove(Object targetChild, boolean callChildSetBC) {

    /**
     * internal remove used when removal caused by
     * unexpected <tt>setBeanContext</tt> or
     * by <tt>remove()</tt> invocation.
     * @param targetChild the JavaBean, BeanContext, or Object to be removed
     * @param callChildSetBC used to indicate that
     * the child should be notified that it is no
     * longer nested in this <tt>BeanContext</tt>.
     * @return whether or not was present before being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean remove(Object targetChild) {

    /**
     * Removes a child from this BeanContext.  If the child object is not
     * for adding then this method throws an IllegalStateException.
     * @param targetChild The child objects to remove
     * @see #validatePendingRemove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected BCSChild createBCSChild(Object targetChild, Object peer) {

    /**
     * <p>
     * Subclasses can override this method to insert their own subclass
     * of Child without having to override add() or the other Collection
     * methods that add children to the set.
     * </p>
     * @param targetChild the child to create the Child on behalf of
     * @param peer        the peer if the tragetChild and the peer are related by an implementation of BeanContextProxy     * @return Subtype-specific subclass of Child without overriding collection methods
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    /*

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public Object[] toArray(Object[] arry) {

    /**
     * Gets an array containing all children of
     * this <tt>BeanContext</tt> that match
     * the types contained in arry.
     * @param arry The array of object
     * types that are of interest.
     * @return an array of children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public Object[] toArray() {

    /**
     * Gets all JavaBean or <tt>BeanContext</tt>
     * instances currently nested in this BeanContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public Iterator iterator() {

    /**
     * Gets all JavaBean or <tt>BeanContext</tt> instances
     * currently nested in this <tt>BeanContext</tt>.
     * @return an <tt>Iterator</tt> of the nested children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean containsKey(Object o) {

    /**
     * Determines whether or not the specified object
     * is currently a child of this <tt>BeanContext</tt>.
     * @param o the Object in question
     * @return if this object is a child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean contains(Object o) {

    /**
     * Determines whether or not the specified object
     * is currently a child of this <tt>BeanContext</tt>.
     * @param o the Object in question
     * @return if this object is a child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean isEmpty() {

    /**
     * Reports whether or not this
     * <tt>BeanContext</tt> is empty.
     * A <tt>BeanContext</tt> is considered
     * empty when it contains zero
     * nested children.
     * @return if there are not children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public int size() {

    /**
     * Gets the number of children currently nested in
     * this BeanContext.
     *
     * @return number of children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public Object instantiateChild(String beanName)

    /**
     * <p>
     * The instantiateChild method is a convenience hook
     * in BeanContext to simplify
     * the task of instantiating a Bean, nested,
     * into a <tt>BeanContext</tt>.
     * </p>
     * <p>
     * The semantics of the beanName parameter are defined by java.beans.Beans.instantiate.
     * </p>
     *
     * @param beanName the name of the Bean to instantiate within this BeanContext
     * @throws IOException if there is an I/O error when the bean is being deserialized
     * @throws ClassNotFoundException if the class
     * identified by the beanName parameter is not found
     * @return the new object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContext getBeanContextPeer() { return (BeanContext)getBeanContextChildPeer(); }

    /**
     * Gets the instance of <tt>BeanContext</tt> that
     * this object is providing the implementation for.
     * @return the BeanContext instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport() {

    /**
     * Create an instance that is not a delegate of another object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport(BeanContext peer) {

    /**
     * Create an instance using with a default locale
     *
     * @param peer      The peer <tt>BeanContext</tt> we are
     *                  supplying an implementation for,
     *                  or <tt>null</tt> if this object
     *                  is its own peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport(BeanContext peer, Locale lcle) {

    /**
     * Create an instance using the specified locale
     *
     * @param peer      The peer BeanContext we are
     *                  supplying an implementation for,
     *                  or <tt>null</tt> if this object
     *                  is its own peer
     * @param lcle      The current Locale for this
     *                  <tt>BeanContext</tt>. If
     *                  <tt>lcle</tt> is <tt>null</tt>,
     *                  the default locale
     *                  is assigned to the <tt>BeanContext</tt>
     *                  instance.
     * @see java.util.Locale#getDefault()
     * @see java.util.Locale#setDefault(java.util.Locale)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport(BeanContext peer, Locale lcle, boolean dtime) {

    /**
     * Create an instance using the specified Locale and design mode.
     *
     * @param peer      The peer <tt>BeanContext</tt> we
     *                  are supplying an implementation for,
     *                  or <tt>null</tt> if this object is its own peer
     * @param lcle      The current Locale for this <tt>BeanContext</tt>. If
     *                  <tt>lcle</tt> is <tt>null</tt>, the default locale
     *                  is assigned to the <tt>BeanContext</tt> instance.
     * @param dtime     The initial state, <tt>true</tt>
     *                  if in design mode,
     *                  <tt>false</tt> if runtime.
     * @see java.util.Locale#getDefault()
     * @see java.util.Locale#setDefault(java.util.Locale)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport(BeanContext peer, Locale lcle, boolean dTime, boolean visible) {

    /**
     *
     * Construct a BeanContextSupport instance
     *
     *
     * @param peer      The peer <tt>BeanContext</tt> we are
     *                  supplying an implementation for,
     *                  or <tt>null</tt>
     *                  if this object is its own peer
     * @param lcle      The current Locale for this BeanContext. If
     *                  <tt>lcle</tt> is <tt>null</tt>, the default locale
     *                  is assigned to the <tt>BeanContext</tt> instance.
     * @param dTime     The initial state,
     *                  <tt>true</tt> if in design mode,
     *                  <tt>false</tt> if runtime.
     * @param visible   The initial visibility.
     * @see java.util.Locale#getDefault()
     * @see java.util.Locale#setDefault(java.util.Locale)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
public class      BeanContextSupport extends BeanContextChildSupport

/**
 * This helper class provides a utility implementation of the
 * java.beans.beancontext.BeanContext interface.
 * <p>
 * Since this class directly implements the BeanContext interface, the class
 * can, and is intended to be used either by subclassing this implementation,
 * or via ad-hoc delegation of an instance of this class from another.
 * </p>
 *
 * @author Laurence P. G. Cable
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected           boolean         designTime;

    /**
     * A <tt>boolean</tt> indicating whether or not
     * this object is currently in design time mode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected           boolean         okToUseGui;

    /**
     * A <tt>boolean</tt> indicating if this
     * instance may now render a GUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected           Locale          locale;

    /**
     * The current locale of this BeanContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected transient ArrayList       bcmListeners;

    /**
     * all accesses to the <code> protected ArrayList bcmListeners </code> field
     * shall be synchronized on that object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected transient HashMap         children;

    /**
     * all accesses to the <code> protected HashMap children </code> field
     * shall be synchronized on that object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final boolean classEquals(Class first, Class second) {

    /**
     * Tests to see if two class objects,
     * or their names are equal.
     * @param first the first object
     * @param second the second object
     * @return true if equal, false if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final Object[] copyChildren() {

    /**
     * Gets a copy of the this BeanContext's children.
     * @return a copy of the current nested children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected synchronized void initialize() {

    /**
     * protected method called from constructor and readObject to initialize
     * transient state of BeanContextSupport instance.
     *
     * This class uses this method to instantiate inner class listeners used
     * to monitor PropertyChange and VetoableChange events on children.
     *
     * subclasses may envelope this method to add their own initialization
     * behavior
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final void fireChildrenRemoved(BeanContextMembershipEvent bcme) {

    /**
     * Fire a BeanContextshipEvent on the BeanContextMembershipListener interface
     * @param bcme the event to fire
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final void fireChildrenAdded(BeanContextMembershipEvent bcme) {

    /**
     * Fire a BeanContextshipEvent on the BeanContextMembershipListener interface
     * @param bcme the event to fire
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final BeanContextChild getChildBeanContextChild(Object child) {

    /**
     * Gets the BeanContextChild (if any) of the specified child
     * @param child the specified child
     * @return  the BeanContextChild (if any) of the specified child
     * @throws  IllegalArgumentException if child implements both BeanContextChild and BeanContextProxy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final BeanContextMembershipListener getChildBeanContextMembershipListener(Object child) {

    /**
     * Gets the BeanContextMembershipListener
     * (if any) of the specified child
     * @param child the specified child
     * @return the BeanContextMembershipListener (if any) of the specified child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final VetoableChangeListener getChildVetoableChangeListener(Object child) {

    /**
     * Gets the VetoableChangeListener
     * (if any) of the specified child
     * @param child the specified child
     * @return the VetoableChangeListener (if any) of the specified child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final PropertyChangeListener getChildPropertyChangeListener(Object child) {

    /**
     * Gets the PropertyChangeListener
     * (if any) of the specified child
     * @param child the specified child
     * @return the PropertyChangeListener (if any) of the specified child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final Serializable getChildSerializable(Object child) {

    /**
     * Gets the Serializable (if any) associated with the specified Child
     * @param child the specified child
     * @return the Serializable (if any) associated with the specified Child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected static final Visibility getChildVisibility(Object child) {

    /**
     * Gets the Component (if any) associated with the specified child.
     * @param child the specified child
     * @return the Component (if any) associated with the specified child.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void childJustRemovedHook(Object child, BCSChild bcsc) {

    /**
     * subclasses may override this method to simply extend remove() semantics
     * after the child has been removed and before the event notification has
     * occurred. The method is called with the child synchronized.
     * @param child the child
     * @param bcsc the BCSChild
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void childJustAddedHook(Object child, BCSChild bcsc) {

    /**
     * subclasses may override this method to simply extend add() semantics
     * after the child has been added and before the event notification has
     * occurred. The method is called with the child synchronized.
     * @param child the child
     * @param bcsc the BCSChild
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected boolean validatePendingRemove(Object targetChild) {

    /**
     * <p>
     * Subclasses of this class may override, or envelope, this method to
     * add validation behavior for the BeanContext to examine child objects
     * immediately prior to their being removed from the BeanContext.
     * </p>
     *
     * @param targetChild the child to create the Child on behalf of
     * @return true iff the child may be removed from this BeanContext, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected boolean validatePendingAdd(Object targetChild) {

    /**
     * <p>
     * Subclasses of this class may override, or envelope, this method to
     * add validation behavior for the BeanContext to examine child objects
     * immediately prior to their being added to the BeanContext.
     * </p>
     *
     * @param targetChild the child to create the Child on behalf of
     * @return true iff the child may be added to this BeanContext, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void propertyChange(PropertyChangeEvent pce) {

    /**
     * subclasses may envelope to monitor child property changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void vetoableChange(PropertyChangeEvent pce) throws PropertyVetoException {

    /**
     * subclasses may envelope to monitor veto child property changes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    private synchronized void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * deserialize contents ... if this instance has a distinct peer the
     * children are *not* serialized here, the peer's readObject() must call
     * readChildren() after deserializing this instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public final void readChildren(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * When an instance of this class is used as a delegate for the
     * implementation of the BeanContext protocols (and its subprotocols)
     * there exists a 'chicken and egg' problem during deserialization
     * @param ois the ObjectInputStream to use
     * @throws IOException if deserialization failed
     * @throws ClassNotFoundException if needed classes are not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    private synchronized void writeObject(ObjectOutputStream oos) throws IOException, ClassNotFoundException {

    /**
     * Serialize the BeanContextSupport, if this instance has a distinct
     * peer (that is this object is acting as a delegate for another) then
     * the children of this instance are not serialized here due to a
     * 'chicken and egg' problem that occurs on deserialization of the
     * children at the same time as this instance.
     *
     * Therefore in situations where there is a distinct peer to this instance
     * it should always call writeObject() followed by writeChildren() and
     * readObject() followed by readChildren().
     *
     * @param oos the ObjectOutputStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public final void writeChildren(ObjectOutputStream oos) throws IOException {

    /**
     * Used to serialize all children of
     * this <tt>BeanContext</tt>.
     * @param oos the <tt>ObjectOutputStream</tt>
     * to use during serialization
     * @throws IOException if serialization failed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final void deserialize(ObjectInputStream ois, Collection coll) throws IOException, ClassNotFoundException {

    /**
     * used by readObject to deserialize a collection.
     * @param ois the ObjectInputStream to use
     * @param coll the Collection
     * @throws IOException if deserialization failed
     * @throws ClassNotFoundException if needed classes are not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected final void serialize(ObjectOutputStream oos, Collection coll) throws IOException {

    /**
     * Used by writeObject to serialize a Collection.
     * @param oos the <tt>ObjectOutputStream</tt>
     * to use during serialization
     * @param coll the <tt>Collection</tt> to serialize
     * @throws IOException if serialization failed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void childDeserializedHook(Object child, BCSChild bcsc) {

    /**
     * Called by readObject with the newly deserialized child and BCSChild.
     * @param child the newly deserialized child
     * @param bcsc the newly deserialized BCSChild
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void bcsPreDeserializationHook(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * called by readObject after defaultReadObject() but prior to
     * deserialization of any children.
     *
     * This method may be overridden by subclasses to perform custom
     * deserialization of their state prior to this superclass deserializing
     * the children.
     *
     * This method should not however be used by subclasses to replace their
     * own implementation (if any) of readObject().
     * @param ois the {@code ObjectInputStream} to use during deserialization
     * @throws IOException if deserialization failed
     * @throws ClassNotFoundException if needed classes are not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected void bcsPreSerializationHook(ObjectOutputStream oos) throws IOException {

    /**
     * called by writeObject after defaultWriteObject() but prior to
     * serialization of currently serializable children.
     *
     * This method may be overridden by subclasses to perform custom
     * serialization of their state prior to this superclass serializing
     * the children.
     *
     * This method should not however be used by subclasses to replace their
     * own implementation (if any) of writeObject().
     * @param oos the {@code ObjectOutputStream} to use during serialization
     * @throws IOException if serialization failed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected Iterator bcsChildren() { synchronized(children) { return children.values().iterator();  } }

    /**
     * Returns an iterator of all children
     * of this <tt>BeanContext</tt>.
     * @return an iterator for all the current BCSChild values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean isSerializing() { return serializing; }

    /**
     * Is this <tt>BeanContext</tt> in the
     * process of being serialized?
     * @return if this <tt>BeanContext</tt> is
     * currently being serialized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean avoidingGui() {

    /**
     * Used to determine if the <tt>BeanContext</tt>
     * child is avoiding using its GUI.
     * @return is this instance avoiding using its GUI?
     * @see Visibility
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized void okToUseGui() {

    /**
     * Notify this instance that it may now render a GUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized void dontUseGui() {

    /**
     * notify this instance that it may no longer render a GUI.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized boolean needsGui() {

    /**
     * <p>
     * This method is typically called from the environment in order to determine
     * if the implementor "needs" a GUI.
     * </p>
     * <p>
     * The algorithm used herein tests the BeanContextPeer, and its current children
     * to determine if they are either Containers, Components, or if they implement
     * Visibility and return needsGui() == true.
     * </p>
     * @return <tt>true</tt> if the implementor needs a GUI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized Locale getLocale() { return locale; }

    /**
     * Gets the locale for this <tt>BeanContext</tt>.
     *
     * @return the current Locale of the <tt>BeanContext</tt>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized void setLocale(Locale newLocale) throws PropertyVetoException {

    /**
     * Sets the locale of this BeanContext.
     * @param newLocale the new locale. This method call will have
     *        no effect if newLocale is <CODE>null</CODE>.
     * @throws PropertyVetoException if the new value is rejected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized boolean isDesignTime() { return designTime; }

    /**
     * Reports whether or not this object is in
     * currently in design time mode.
     * @return <tt>true</tt> if in design time mode,
     * <tt>false</tt> if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public synchronized void setDesignTime(boolean dTime) {

    /**
     * Sets the new design time value for this <tt>BeanContext</tt>.
     * @param dTime the new designTime value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public URL getResource(String name, BeanContextChild bcc) {

    /**
     * @param name the name of the resource requested.
     * @param bcc  the child object making the request.
     *
     * @return the requested resource as an InputStream
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public InputStream getResourceAsStream(String name, BeanContextChild bcc) {

    /**
     * @param name the name of the resource requested.
     * @param bcc  the child object making the request.
     *
     * @return  the requested resource as an InputStream
     * @throws  NullPointerException if the argument is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void removeBeanContextMembershipListener(BeanContextMembershipListener bcml) {

    /**
     * Removes a BeanContextMembershipListener
     *
     * @param  bcml the BeanContextMembershipListener to remove
     * @throws NullPointerException if the argument is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void addBeanContextMembershipListener(BeanContextMembershipListener bcml) {

    /**
     * Adds a BeanContextMembershipListener
     *
     * @param  bcml the BeanContextMembershipListener to add
     * @throws NullPointerException if the argument is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public void clear() {

    /**
     * clear the children (Unsupported)
     * implementations must synchronized on the hierarchy lock and "children" protected field
     * @throws UnsupportedOperationException thrown unconditionally by this implementation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean retainAll(Collection c) {

    /**
     * retain only specified children (Unsupported)
     * implementations must synchronized on the hierarchy lock and "children" protected field
     * @throws UnsupportedOperationException thrown unconditionally by this implementation
     * @return this implementation unconditionally throws {@code UnsupportedOperationException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean removeAll(Collection c) {

    /**
     * remove all specified children (Unsupported)
     * implementations must synchronized on the hierarchy lock and "children" protected field
     * @throws UnsupportedOperationException thrown unconditionally by this implementation
     * @return this implementation unconditionally throws {@code UnsupportedOperationException}

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean addAll(Collection c) {

    /**
     * add Collection to set of Children (Unsupported)
     * implementations must synchronized on the hierarchy lock and "children" protected field
     * @throws UnsupportedOperationException thrown unconditionally by this implementation
     * @return this implementation unconditionally throws {@code UnsupportedOperationException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean containsAll(Collection c) {

    /**
     * Tests to see if all objects in the
     * specified <tt>Collection</tt> are children of
     * this <tt>BeanContext</tt>.
     * @param c the specified <tt>Collection</tt>
     *
     * @return <tt>true</tt> if all objects
     * in the collection are children of
     * this <tt>BeanContext</tt>, false if not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected boolean remove(Object targetChild, boolean callChildSetBC) {

    /**
     * internal remove used when removal caused by
     * unexpected <tt>setBeanContext</tt> or
     * by <tt>remove()</tt> invocation.
     * @param targetChild the JavaBean, BeanContext, or Object to be removed
     * @param callChildSetBC used to indicate that
     * the child should be notified that it is no
     * longer nested in this <tt>BeanContext</tt>.
     * @return whether or not was present before being removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean remove(Object targetChild) {

    /**
     * Removes a child from this BeanContext.  If the child object is not
     * for adding then this method throws an IllegalStateException.
     * @param targetChild The child objects to remove
     * @see #validatePendingRemove
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    protected BCSChild createBCSChild(Object targetChild, Object peer) {

    /**
     * <p>
     * Subclasses can override this method to insert their own subclass
     * of Child without having to override add() or the other Collection
     * methods that add children to the set.
     * </p>
     * @param targetChild the child to create the Child on behalf of
     * @param peer        the peer if the tragetChild and the peer are related by an implementation of BeanContextProxy     * @return Subtype-specific subclass of Child without overriding collection methods
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    /*

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public Object[] toArray(Object[] arry) {

    /**
     * Gets an array containing all children of
     * this <tt>BeanContext</tt> that match
     * the types contained in arry.
     * @param arry The array of object
     * types that are of interest.
     * @return an array of children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public Object[] toArray() {

    /**
     * Gets all JavaBean or <tt>BeanContext</tt>
     * instances currently nested in this BeanContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public Iterator iterator() {

    /**
     * Gets all JavaBean or <tt>BeanContext</tt> instances
     * currently nested in this <tt>BeanContext</tt>.
     * @return an <tt>Iterator</tt> of the nested children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean containsKey(Object o) {

    /**
     * Determines whether or not the specified object
     * is currently a child of this <tt>BeanContext</tt>.
     * @param o the Object in question
     * @return if this object is a child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean contains(Object o) {

    /**
     * Determines whether or not the specified object
     * is currently a child of this <tt>BeanContext</tt>.
     * @param o the Object in question
     * @return if this object is a child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public boolean isEmpty() {

    /**
     * Reports whether or not this
     * <tt>BeanContext</tt> is empty.
     * A <tt>BeanContext</tt> is considered
     * empty when it contains zero
     * nested children.
     * @return if there are not children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public int size() {

    /**
     * Gets the number of children currently nested in
     * this BeanContext.
     *
     * @return number of children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public Object instantiateChild(String beanName)

    /**
     * <p>
     * The instantiateChild method is a convenience hook
     * in BeanContext to simplify
     * the task of instantiating a Bean, nested,
     * into a <tt>BeanContext</tt>.
     * </p>
     * <p>
     * The semantics of the beanName parameter are defined by java.beans.Beans.instantiate.
     * </p>
     *
     * @param beanName the name of the Bean to instantiate within this BeanContext
     * @throws IOException if there is an I/O error when the bean is being deserialized
     * @throws ClassNotFoundException if the class
     * identified by the beanName parameter is not found
     * @return the new object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContext getBeanContextPeer() { return (BeanContext)getBeanContextChildPeer(); }

    /**
     * Gets the instance of <tt>BeanContext</tt> that
     * this object is providing the implementation for.
     * @return the BeanContext instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport() {

    /**
     * Create an instance that is not a delegate of another object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport(BeanContext peer) {

    /**
     * Create an instance using with a default locale
     *
     * @param peer      The peer <tt>BeanContext</tt> we are
     *                  supplying an implementation for,
     *                  or <tt>null</tt> if this object
     *                  is its own peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport(BeanContext peer, Locale lcle) {

    /**
     * Create an instance using the specified locale
     *
     * @param peer      The peer BeanContext we are
     *                  supplying an implementation for,
     *                  or <tt>null</tt> if this object
     *                  is its own peer
     * @param lcle      The current Locale for this
     *                  <tt>BeanContext</tt>. If
     *                  <tt>lcle</tt> is <tt>null</tt>,
     *                  the default locale
     *                  is assigned to the <tt>BeanContext</tt>
     *                  instance.
     * @see java.util.Locale#getDefault()
     * @see java.util.Locale#setDefault(java.util.Locale)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport(BeanContext peer, Locale lcle, boolean dtime) {

    /**
     * Create an instance using the specified Locale and design mode.
     *
     * @param peer      The peer <tt>BeanContext</tt> we
     *                  are supplying an implementation for,
     *                  or <tt>null</tt> if this object is its own peer
     * @param lcle      The current Locale for this <tt>BeanContext</tt>. If
     *                  <tt>lcle</tt> is <tt>null</tt>, the default locale
     *                  is assigned to the <tt>BeanContext</tt> instance.
     * @param dtime     The initial state, <tt>true</tt>
     *                  if in design mode,
     *                  <tt>false</tt> if runtime.
     * @see java.util.Locale#getDefault()
     * @see java.util.Locale#setDefault(java.util.Locale)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
    public BeanContextSupport(BeanContext peer, Locale lcle, boolean dTime, boolean visible) {

    /**
     *
     * Construct a BeanContextSupport instance
     *
     *
     * @param peer      The peer <tt>BeanContext</tt> we are
     *                  supplying an implementation for,
     *                  or <tt>null</tt>
     *                  if this object is its own peer
     * @param lcle      The current Locale for this BeanContext. If
     *                  <tt>lcle</tt> is <tt>null</tt>, the default locale
     *                  is assigned to the <tt>BeanContext</tt> instance.
     * @param dTime     The initial state,
     *                  <tt>true</tt> if in design mode,
     *                  <tt>false</tt> if runtime.
     * @param visible   The initial visibility.
     * @see java.util.Locale#getDefault()
     * @see java.util.Locale#setDefault(java.util.Locale)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextSupport.java
public class      BeanContextSupport extends BeanContextChildSupport

/**
 * This helper class provides a utility implementation of the
 * java.beans.beancontext.BeanContext interface.
 * <p>
 * Since this class directly implements the BeanContext interface, the class
 * can, and is intended to be used either by subclassing this implementation,
 * or via ad-hoc delegation of an instance of this class from another.
 * </p>
 *
 * @author Laurence P. G. Cable
 * @since 1.2
 */
