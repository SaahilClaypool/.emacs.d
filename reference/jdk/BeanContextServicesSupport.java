_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected transient ArrayList                bcsListeners;

    /**
     * List of <tt>BeanContextServicesListener</tt> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected transient BCSSProxyServiceProvider proxy;

    /**
     * Delegate for the <tt>BeanContextServiceProvider</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected transient int                      serializable = 0;

    /**
     * The number of instances of a serializable <tt>BeanContextServceProvider</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected transient HashMap                  services;

    /**
     * all accesses to the <code> protected transient HashMap services </code>
     * field should be synchronized on that object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    private synchronized void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * deserialize the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    private synchronized void writeObject(ObjectOutputStream oos) throws IOException {

    /**
     * serialize the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected synchronized void bcsPreDeserializationHook(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * called from BeanContextSupport readObject before it deserializes the
     * children ...
     *
     * This class will deserialize any Serializable BeanContextServiceProviders
     * serialized earlier thus making them available to the children when they
     * deserialized.
     *
     * subclasses may envelope this method to insert their own serialization
     * processing that has to occur prior to serialization of the children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected synchronized void bcsPreSerializationHook(ObjectOutputStream oos) throws IOException {

    /**
     * called from BeanContextSupport writeObject before it serializes the
     * children ...
     *
     * This class will serialize any Serializable BeanContextServiceProviders
     * herein.
     *
     * subclasses may envelope this method to insert their own serialization
     * processing that has to occur prior to serialization of the children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected final void fireServiceRevoked(Class serviceClass, boolean revokeNow) {

    /**
     * Fires a <tt>BeanContextServiceRevokedEvent</tt>
     * indicating that a particular service is
     * no longer available.
     * @param serviceClass the service class
     * @param revokeNow whether or not the event should be revoked now
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected final void fireServiceRevoked(BeanContextServiceRevokedEvent bcsre) {

    /**
     * Fires a <tt>BeanContextServiceEvent</tt> notifying of a service being revoked.
     *
     * @param bcsre the <tt>BeanContextServiceRevokedEvent</tt>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected final void fireServiceAdded(BeanContextServiceAvailableEvent bcssae) {

    /**
     * Fires a <tt>BeanContextServiceAvailableEvent</tt> indicating that a new
     * service has become available.
     *
     * @param bcssae the <tt>BeanContextServiceAvailableEvent</tt>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected final void fireServiceAdded(Class serviceClass) {

    /**
     * Fires a <tt>BeanContextServiceEvent</tt> notifying of a new service.
     * @param serviceClass the service class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected synchronized void initializeBeanContextResources() {

    /**
     * called from setBeanContext to notify a BeanContextChild
     * to allocate resources obtained from the nesting BeanContext.
     *
     * subclasses may envelope this method to implement their own semantics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected synchronized void releaseBeanContextResources() {

    /**
     * called from setBeanContext to notify a BeanContextChild
     * to release resources obtained from the nesting BeanContext.
     *
     * This method revokes any services obtained from its parent.
     *
     * subclasses may envelope this method to implement their own semantics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected void childJustRemovedHook(Object child, BCSChild bcsc) {

    /**
     * called from superclass child removal operations after a child
     * has been successfully removed. called with child synchronized.
     *
     * This subclass uses this hook to immediately revoke any services
     * being used by this child if it is a BeanContextChild.
     *
     * subclasses may envelope this method in order to implement their
     * own child removal side-effects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected static final BeanContextServicesListener getChildBeanContextServicesListener(Object child) {

    /**
     * Gets the <tt>BeanContextServicesListener</tt> (if any) of the specified
     * child.
     *
     * @param child the specified child
     * @return the BeanContextServicesListener (if any) of the specified child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void serviceRevoked(BeanContextServiceRevokedEvent bcssre) {

    /**
     * BeanContextServicesListener callback, propagates event to all
     * currently registered listeners and BeanContextServices children,
     * if this BeanContextService does not already implement this service
     * itself.
     *
     * subclasses may override or envelope this method to implement their
     * own propagation semantics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
     public void serviceAvailable(BeanContextServiceAvailableEvent bcssae) {

    /**
     * BeanContextServicesListener callback, propagates event to all
     * currently registered listeners and BeanContextServices children,
     * if this BeanContextService does not already implement this service
     * itself.
     *
     * subclasses may override or envelope this method to implement their
     * own propagation semantics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public Iterator getCurrentServiceSelectors(Class serviceClass) {

    /**
     * @return an iterator for all the currently available service selectors
     * (if any) available for the specified service.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public Iterator getCurrentServiceClasses() {

    /**
     * @return an iterator for all the currently registered service classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void releaseService(BeanContextChild child, Object requestor, Object service) {

    /**
     * release a service
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    /*

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public synchronized boolean hasService(Class serviceClass) {

    /**
     * has a service, which may be delegated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void revokeService(Class serviceClass, BeanContextServiceProvider bcsp, boolean revokeCurrentServicesNow) {

    /**
     * remove a service
     * @param serviceClass the service class
     * @param bcsp the service provider
     * @param revokeCurrentServicesNow whether or not to revoke the service
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected boolean addService(Class serviceClass, BeanContextServiceProvider bcsp, boolean fireEvent) {

    /**
     * add a service
     * @param serviceClass the service class
     * @param bcsp the service provider
     * @param fireEvent whether or not an event should be fired
     * @return true if the service was successfully added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public boolean addService(Class serviceClass, BeanContextServiceProvider bcsp) {

    /**
     * add a service
     * @param serviceClass the service class
     * @param bcsp the service provider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void removeBeanContextServicesListener(BeanContextServicesListener bcsl) {

    /**
     * remove a BeanContextServicesListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
        protected BCSSServiceProvider createBCSSServiceProvider(Class sc, BeanContextServiceProvider bcsp) {

        /**
         * subclasses can override this method to create new subclasses of
         * BCSSServiceProvider without having to override addService() in
         * order to instantiate.
         * @param sc the class
         * @param bcsp the service provider
         * @return a service provider without overriding addService()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
            protected BeanContextServiceProvider serviceProvider;

            /**
             * The service provider.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
            protected BeanContextServiceProvider getServiceProvider() {

            /**
             * Returns the service provider.
             * @return the service provider
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
        /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected BCSChild createBCSChild(Object targetChild, Object peer) {

    /**
     * <p>
     * Subclasses can override this method to insert their own subclass
     * of Child without having to override add() or the other Collection
     * methods that add children to the set.
     * </p>
     *
     * @param targetChild the child to create the Child on behalf of
     * @param peer        the peer if the targetChild and peer are related by BeanContextProxy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    /*

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServices getBeanContextServicesPeer() {

    /**
     * Gets the <tt>BeanContextServices</tt> associated with this
     * <tt>BeanContextServicesSupport</tt>.
     *
     * @return the instance of <tt>BeanContext</tt>
     * this object is providing the implementation for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void initialize() {

    /**
     * called by BeanContextSupport superclass during construction and
     * deserialization to initialize subclass transient state.
     *
     * subclasses may envelope this method, but should not override it or
     * call it directly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport() {

    /**
     * Create an instance that is not a delegate of another object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport(BeanContextServices peer) {

    /**
     * Create an instance with a peer
     *
     * @param peer      The peer BeanContext we are supplying an implementation for, if null the this object is its own peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport(BeanContextServices peer, Locale lcle) {

    /**
     * Create an instance using the specified locale
     *
     * @param peer      The peer BeanContext we are supplying an implementation for, if null the this object is its own peer
     * @param lcle      The current Locale for this BeanContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport(BeanContextServices peer, Locale lcle, boolean dtime) {

    /**
     * Create an instance using the specified Locale and design mode.
     *
     * @param peer      The peer BeanContext we are supplying an implementation for, if null the this object is its own peer
     * @param lcle      The current Locale for this BeanContext.
     * @param dtime     The initial state, true if in design mode, false if runtime.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport(BeanContextServices peer, Locale lcle, boolean dTime, boolean visible) {

    /**
     * <p>
     * Construct a BeanContextServicesSupport instance
     * </p>
     *
     * @param peer      The peer BeanContext we are supplying an implementation for, if null the this object is its own peer
     * @param lcle      The current Locale for this BeanContext.
     * @param dTime     The initial state, true if in design mode, false if runtime.
     * @param visible   The initial visibility.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
public class      BeanContextServicesSupport extends BeanContextSupport

/**
 * <p>
 * This helper class provides a utility implementation of the
 * java.beans.beancontext.BeanContextServices interface.
 * </p>
 * <p>
 * Since this class directly implements the BeanContextServices interface,
 * the class can, and is intended to be used either by subclassing this
 * implementation, or via delegation of an instance of this class
 * from another through the BeanContextProxy interface.
 * </p>
 *
 * @author Laurence P. G. Cable
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected transient ArrayList                bcsListeners;

    /**
     * List of <tt>BeanContextServicesListener</tt> objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected transient BCSSProxyServiceProvider proxy;

    /**
     * Delegate for the <tt>BeanContextServiceProvider</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected transient int                      serializable = 0;

    /**
     * The number of instances of a serializable <tt>BeanContextServceProvider</tt>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected transient HashMap                  services;

    /**
     * all accesses to the <code> protected transient HashMap services </code>
     * field should be synchronized on that object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    private synchronized void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * deserialize the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    private synchronized void writeObject(ObjectOutputStream oos) throws IOException {

    /**
     * serialize the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected synchronized void bcsPreDeserializationHook(ObjectInputStream ois) throws IOException, ClassNotFoundException {

    /**
     * called from BeanContextSupport readObject before it deserializes the
     * children ...
     *
     * This class will deserialize any Serializable BeanContextServiceProviders
     * serialized earlier thus making them available to the children when they
     * deserialized.
     *
     * subclasses may envelope this method to insert their own serialization
     * processing that has to occur prior to serialization of the children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected synchronized void bcsPreSerializationHook(ObjectOutputStream oos) throws IOException {

    /**
     * called from BeanContextSupport writeObject before it serializes the
     * children ...
     *
     * This class will serialize any Serializable BeanContextServiceProviders
     * herein.
     *
     * subclasses may envelope this method to insert their own serialization
     * processing that has to occur prior to serialization of the children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected final void fireServiceRevoked(Class serviceClass, boolean revokeNow) {

    /**
     * Fires a <tt>BeanContextServiceRevokedEvent</tt>
     * indicating that a particular service is
     * no longer available.
     * @param serviceClass the service class
     * @param revokeNow whether or not the event should be revoked now
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected final void fireServiceRevoked(BeanContextServiceRevokedEvent bcsre) {

    /**
     * Fires a <tt>BeanContextServiceEvent</tt> notifying of a service being revoked.
     *
     * @param bcsre the <tt>BeanContextServiceRevokedEvent</tt>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected final void fireServiceAdded(BeanContextServiceAvailableEvent bcssae) {

    /**
     * Fires a <tt>BeanContextServiceAvailableEvent</tt> indicating that a new
     * service has become available.
     *
     * @param bcssae the <tt>BeanContextServiceAvailableEvent</tt>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected final void fireServiceAdded(Class serviceClass) {

    /**
     * Fires a <tt>BeanContextServiceEvent</tt> notifying of a new service.
     * @param serviceClass the service class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected synchronized void initializeBeanContextResources() {

    /**
     * called from setBeanContext to notify a BeanContextChild
     * to allocate resources obtained from the nesting BeanContext.
     *
     * subclasses may envelope this method to implement their own semantics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected synchronized void releaseBeanContextResources() {

    /**
     * called from setBeanContext to notify a BeanContextChild
     * to release resources obtained from the nesting BeanContext.
     *
     * This method revokes any services obtained from its parent.
     *
     * subclasses may envelope this method to implement their own semantics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected void childJustRemovedHook(Object child, BCSChild bcsc) {

    /**
     * called from superclass child removal operations after a child
     * has been successfully removed. called with child synchronized.
     *
     * This subclass uses this hook to immediately revoke any services
     * being used by this child if it is a BeanContextChild.
     *
     * subclasses may envelope this method in order to implement their
     * own child removal side-effects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected static final BeanContextServicesListener getChildBeanContextServicesListener(Object child) {

    /**
     * Gets the <tt>BeanContextServicesListener</tt> (if any) of the specified
     * child.
     *
     * @param child the specified child
     * @return the BeanContextServicesListener (if any) of the specified child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void serviceRevoked(BeanContextServiceRevokedEvent bcssre) {

    /**
     * BeanContextServicesListener callback, propagates event to all
     * currently registered listeners and BeanContextServices children,
     * if this BeanContextService does not already implement this service
     * itself.
     *
     * subclasses may override or envelope this method to implement their
     * own propagation semantics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
     public void serviceAvailable(BeanContextServiceAvailableEvent bcssae) {

    /**
     * BeanContextServicesListener callback, propagates event to all
     * currently registered listeners and BeanContextServices children,
     * if this BeanContextService does not already implement this service
     * itself.
     *
     * subclasses may override or envelope this method to implement their
     * own propagation semantics.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public Iterator getCurrentServiceSelectors(Class serviceClass) {

    /**
     * @return an iterator for all the currently available service selectors
     * (if any) available for the specified service.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public Iterator getCurrentServiceClasses() {

    /**
     * @return an iterator for all the currently registered service classes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void releaseService(BeanContextChild child, Object requestor, Object service) {

    /**
     * release a service
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    /*

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public synchronized boolean hasService(Class serviceClass) {

    /**
     * has a service, which may be delegated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void revokeService(Class serviceClass, BeanContextServiceProvider bcsp, boolean revokeCurrentServicesNow) {

    /**
     * remove a service
     * @param serviceClass the service class
     * @param bcsp the service provider
     * @param revokeCurrentServicesNow whether or not to revoke the service
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected boolean addService(Class serviceClass, BeanContextServiceProvider bcsp, boolean fireEvent) {

    /**
     * add a service
     * @param serviceClass the service class
     * @param bcsp the service provider
     * @param fireEvent whether or not an event should be fired
     * @return true if the service was successfully added
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public boolean addService(Class serviceClass, BeanContextServiceProvider bcsp) {

    /**
     * add a service
     * @param serviceClass the service class
     * @param bcsp the service provider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void removeBeanContextServicesListener(BeanContextServicesListener bcsl) {

    /**
     * remove a BeanContextServicesListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
        protected BCSSServiceProvider createBCSSServiceProvider(Class sc, BeanContextServiceProvider bcsp) {

        /**
         * subclasses can override this method to create new subclasses of
         * BCSSServiceProvider without having to override addService() in
         * order to instantiate.
         * @param sc the class
         * @param bcsp the service provider
         * @return a service provider without overriding addService()
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
            protected BeanContextServiceProvider serviceProvider;

            /**
             * The service provider.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
            protected BeanContextServiceProvider getServiceProvider() {

            /**
             * Returns the service provider.
             * @return the service provider
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
        /**

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    protected BCSChild createBCSChild(Object targetChild, Object peer) {

    /**
     * <p>
     * Subclasses can override this method to insert their own subclass
     * of Child without having to override add() or the other Collection
     * methods that add children to the set.
     * </p>
     *
     * @param targetChild the child to create the Child on behalf of
     * @param peer        the peer if the targetChild and peer are related by BeanContextProxy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    /*

    /************************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServices getBeanContextServicesPeer() {

    /**
     * Gets the <tt>BeanContextServices</tt> associated with this
     * <tt>BeanContextServicesSupport</tt>.
     *
     * @return the instance of <tt>BeanContext</tt>
     * this object is providing the implementation for.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public void initialize() {

    /**
     * called by BeanContextSupport superclass during construction and
     * deserialization to initialize subclass transient state.
     *
     * subclasses may envelope this method, but should not override it or
     * call it directly.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport() {

    /**
     * Create an instance that is not a delegate of another object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport(BeanContextServices peer) {

    /**
     * Create an instance with a peer
     *
     * @param peer      The peer BeanContext we are supplying an implementation for, if null the this object is its own peer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport(BeanContextServices peer, Locale lcle) {

    /**
     * Create an instance using the specified locale
     *
     * @param peer      The peer BeanContext we are supplying an implementation for, if null the this object is its own peer
     * @param lcle      The current Locale for this BeanContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport(BeanContextServices peer, Locale lcle, boolean dtime) {

    /**
     * Create an instance using the specified Locale and design mode.
     *
     * @param peer      The peer BeanContext we are supplying an implementation for, if null the this object is its own peer
     * @param lcle      The current Locale for this BeanContext.
     * @param dtime     The initial state, true if in design mode, false if runtime.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
    public BeanContextServicesSupport(BeanContextServices peer, Locale lcle, boolean dTime, boolean visible) {

    /**
     * <p>
     * Construct a BeanContextServicesSupport instance
     * </p>
     *
     * @param peer      The peer BeanContext we are supplying an implementation for, if null the this object is its own peer
     * @param lcle      The current Locale for this BeanContext.
     * @param dTime     The initial state, true if in design mode, false if runtime.
     * @param visible   The initial visibility.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServicesSupport.java
public class      BeanContextServicesSupport extends BeanContextSupport

/**
 * <p>
 * This helper class provides a utility implementation of the
 * java.beans.beancontext.BeanContextServices interface.
 * </p>
 * <p>
 * Since this class directly implements the BeanContextServices interface,
 * the class can, and is intended to be used either by subclassing this
 * implementation, or via delegation of an instance of this class
 * from another through the BeanContextProxy interface.
 * </p>
 *
 * @author Laurence P. G. Cable
 * @since 1.2
 */
