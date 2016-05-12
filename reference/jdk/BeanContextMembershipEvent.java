_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    @SuppressWarnings("rawtypes")

   /**
    * The list of children affected by this
    * event notification.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    @SuppressWarnings("rawtypes")

    /**
     * Gets the array of children affected by this event.
     * @return the array of children effected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    public Object[] toArray() { return children.toArray(); }

    /**
     * Gets the array of children affected by this event.
     * @return the array of children affected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    public boolean contains(Object child) {

    /**
     * Is the child specified affected by the event?
     * @return <code>true</code> if affected, <code>false</code>
     * if not
     * @param child the object to check for being affected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    public int size() { return children.size(); }

    /**
     * Gets the number of children affected by the notification.
     * @return the number of children affected by the notification
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    public BeanContextMembershipEvent(BeanContext bc, Object[] changes) {

    /**
     * Contruct a BeanContextMembershipEvent
     *
     * @param bc        The BeanContext source
     * @param changes   The Children effected
     * @exception       NullPointerException if changes associated with this
     *                  event are null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    @SuppressWarnings("rawtypes")

    /**
     * Contruct a BeanContextMembershipEvent
     *
     * @param bc        The BeanContext source
     * @param changes   The Children affected
     * @throws NullPointerException if <CODE>changes</CODE> is <CODE>null</CODE>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
public class BeanContextMembershipEvent extends BeanContextEvent {

/**
 * A <code>BeanContextMembershipEvent</code> encapsulates
 * the list of children added to, or removed from,
 * the membership of a particular <code>BeanContext</code>.
 * An instance of this event is fired whenever a successful
 * add(), remove(), retainAll(), removeAll(), or clear() is
 * invoked on a given <code>BeanContext</code> instance.
 * Objects interested in receiving events of this type must
 * implement the <code>BeanContextMembershipListener</code>
 * interface, and must register their intent via the
 * <code>BeanContext</code>'s
 * <code>addBeanContextMembershipListener(BeanContextMembershipListener bcml)
 * </code> method.
 *
 * @author      Laurence P. G. Cable
 * @since       1.2
 * @see         java.beans.beancontext.BeanContext
 * @see         java.beans.beancontext.BeanContextEvent
 * @see         java.beans.beancontext.BeanContextMembershipListener
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    @SuppressWarnings("rawtypes")

   /**
    * The list of children affected by this
    * event notification.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    @SuppressWarnings("rawtypes")

    /**
     * Gets the array of children affected by this event.
     * @return the array of children effected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    public Object[] toArray() { return children.toArray(); }

    /**
     * Gets the array of children affected by this event.
     * @return the array of children affected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    public boolean contains(Object child) {

    /**
     * Is the child specified affected by the event?
     * @return <code>true</code> if affected, <code>false</code>
     * if not
     * @param child the object to check for being affected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    public int size() { return children.size(); }

    /**
     * Gets the number of children affected by the notification.
     * @return the number of children affected by the notification
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    public BeanContextMembershipEvent(BeanContext bc, Object[] changes) {

    /**
     * Contruct a BeanContextMembershipEvent
     *
     * @param bc        The BeanContext source
     * @param changes   The Children effected
     * @exception       NullPointerException if changes associated with this
     *                  event are null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
    @SuppressWarnings("rawtypes")

    /**
     * Contruct a BeanContextMembershipEvent
     *
     * @param bc        The BeanContext source
     * @param changes   The Children affected
     * @throws NullPointerException if <CODE>changes</CODE> is <CODE>null</CODE>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContextMembershipEvent.java
public class BeanContextMembershipEvent extends BeanContextEvent {

/**
 * A <code>BeanContextMembershipEvent</code> encapsulates
 * the list of children added to, or removed from,
 * the membership of a particular <code>BeanContext</code>.
 * An instance of this event is fired whenever a successful
 * add(), remove(), retainAll(), removeAll(), or clear() is
 * invoked on a given <code>BeanContext</code> instance.
 * Objects interested in receiving events of this type must
 * implement the <code>BeanContextMembershipListener</code>
 * interface, and must register their intent via the
 * <code>BeanContext</code>'s
 * <code>addBeanContextMembershipListener(BeanContextMembershipListener bcml)
 * </code> method.
 *
 * @author      Laurence P. G. Cable
 * @since       1.2
 * @see         java.beans.beancontext.BeanContext
 * @see         java.beans.beancontext.BeanContextEvent
 * @see         java.beans.beancontext.BeanContextMembershipListener
 */
