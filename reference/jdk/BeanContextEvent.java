_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    protected BeanContext propagatedFrom;

    /**
     * The <code>BeanContext</code> from which this event was propagated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    public synchronized boolean isPropagated() {

    /**
     * Reports whether or not this event is
     * propagated from some other <code>BeanContext</code>.
     * @return <code>true</code> if propagated, <code>false</code>
     * if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    public synchronized BeanContext getPropagatedFrom() {

    /**
     * Gets the <code>BeanContext</code> from which this event was propagated.
     * @return the <code>BeanContext</code> from which this
     * event was propagated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    public synchronized void setPropagatedFrom(BeanContext bc) {

    /**
     * Sets the <code>BeanContext</code> from which this event was propagated.
     * @param bc the <code>BeanContext</code> from which this event
     * was propagated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    public BeanContext getBeanContext() { return (BeanContext)getSource(); }

    /**
     * Gets the <code>BeanContext</code> associated with this event.
     * @return the <code>BeanContext</code> associated with this event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    protected BeanContextEvent(BeanContext bc) {

    /**
     * Contruct a BeanContextEvent
     *
     * @param bc        The BeanContext source
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
public abstract class BeanContextEvent extends EventObject {

/**
 * <p>
 * <code>BeanContextEvent</code> is the abstract root event class
 * for all events emitted
 * from, and pertaining to the semantics of, a <code>BeanContext</code>.
 * This class introduces a mechanism to allow the propagation of
 * <code>BeanContextEvent</code> subclasses through a hierarchy of
 * <code>BeanContext</code>s. The <code>setPropagatedFrom()</code>
 * and <code>getPropagatedFrom()</code> methods allow a
 * <code>BeanContext</code> to identify itself as the source
 * of a propagated event.
 * </p>
 *
 * @author      Laurence P. G. Cable
 * @since       1.2
 * @see         java.beans.beancontext.BeanContext
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    protected BeanContext propagatedFrom;

    /**
     * The <code>BeanContext</code> from which this event was propagated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    public synchronized boolean isPropagated() {

    /**
     * Reports whether or not this event is
     * propagated from some other <code>BeanContext</code>.
     * @return <code>true</code> if propagated, <code>false</code>
     * if not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    public synchronized BeanContext getPropagatedFrom() {

    /**
     * Gets the <code>BeanContext</code> from which this event was propagated.
     * @return the <code>BeanContext</code> from which this
     * event was propagated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    public synchronized void setPropagatedFrom(BeanContext bc) {

    /**
     * Sets the <code>BeanContext</code> from which this event was propagated.
     * @param bc the <code>BeanContext</code> from which this event
     * was propagated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    public BeanContext getBeanContext() { return (BeanContext)getSource(); }

    /**
     * Gets the <code>BeanContext</code> associated with this event.
     * @return the <code>BeanContext</code> associated with this event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
    protected BeanContextEvent(BeanContext bc) {

    /**
     * Contruct a BeanContextEvent
     *
     * @param bc        The BeanContext source
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextEvent.java
public abstract class BeanContextEvent extends EventObject {

/**
 * <p>
 * <code>BeanContextEvent</code> is the abstract root event class
 * for all events emitted
 * from, and pertaining to the semantics of, a <code>BeanContext</code>.
 * This class introduces a mechanism to allow the propagation of
 * <code>BeanContextEvent</code> subclasses through a hierarchy of
 * <code>BeanContext</code>s. The <code>setPropagatedFrom()</code>
 * and <code>getPropagatedFrom()</code> methods allow a
 * <code>BeanContext</code> to identify itself as the source
 * of a propagated event.
 * </p>
 *
 * @author      Laurence P. G. Cable
 * @since       1.2
 * @see         java.beans.beancontext.BeanContext
 */
