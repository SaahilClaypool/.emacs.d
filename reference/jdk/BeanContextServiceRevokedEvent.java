_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    /**

    /**
     * fields
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public boolean isCurrentServiceInvalidNow() { return invalidateRefs; }

    /**
     * Reports if the current service is being forcibly revoked,
     * in which case the references are now invalidated and unusable.
     * @return <code>true</code> if current service is being forcibly revoked
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public boolean isServiceClass(Class service) {

    /**
     * Checks this event to determine whether or not
     * the service being revoked is of a particular class.
     * @param service the service of interest (should be non-null)
     * @return <code>true</code> if the service being revoked is of the
     * same class as the specified service
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public Class getServiceClass() { return serviceClass; }

    /**
     * Gets the service class that is the subject of this notification
     * @return A <code>Class</code> reference to the
     * service that is being revoked
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public BeanContextServices getSourceAsBeanContextServices() {

    /**
     * Gets the source as a reference of type <code>BeanContextServices</code>
     * @return the <code>BeanContextServices</code> from which
     * this service is being revoked
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public BeanContextServiceRevokedEvent(BeanContextServices bcs, Class sc, boolean invalidate) {

    /**
     * Construct a <code>BeanContextServiceEvent</code>.
     * @param bcs the <code>BeanContextServices</code>
     * from which this service is being revoked
     * @param sc the service that is being revoked
     * @param invalidate <code>true</code> for immediate revocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
public class BeanContextServiceRevokedEvent extends BeanContextEvent {

/**
 * <p>
 * This event type is used by the
 * <code>BeanContextServiceRevokedListener</code> in order to
 * identify the service being revoked.
 * </p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    /**

    /**
     * fields
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public boolean isCurrentServiceInvalidNow() { return invalidateRefs; }

    /**
     * Reports if the current service is being forcibly revoked,
     * in which case the references are now invalidated and unusable.
     * @return <code>true</code> if current service is being forcibly revoked
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public boolean isServiceClass(Class service) {

    /**
     * Checks this event to determine whether or not
     * the service being revoked is of a particular class.
     * @param service the service of interest (should be non-null)
     * @return <code>true</code> if the service being revoked is of the
     * same class as the specified service
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public Class getServiceClass() { return serviceClass; }

    /**
     * Gets the service class that is the subject of this notification
     * @return A <code>Class</code> reference to the
     * service that is being revoked
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public BeanContextServices getSourceAsBeanContextServices() {

    /**
     * Gets the source as a reference of type <code>BeanContextServices</code>
     * @return the <code>BeanContextServices</code> from which
     * this service is being revoked
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
    public BeanContextServiceRevokedEvent(BeanContextServices bcs, Class sc, boolean invalidate) {

    /**
     * Construct a <code>BeanContextServiceEvent</code>.
     * @param bcs the <code>BeanContextServices</code>
     * from which this service is being revoked
     * @param sc the service that is being revoked
     * @param invalidate <code>true</code> for immediate revocation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextServiceRevokedEvent.java
public class BeanContextServiceRevokedEvent extends BeanContextEvent {

/**
 * <p>
 * This event type is used by the
 * <code>BeanContextServiceRevokedListener</code> in order to
 * identify the service being revoked.
 * </p>
 */
