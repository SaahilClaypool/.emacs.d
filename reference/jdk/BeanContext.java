_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    public static final Object globalHierarchyLock = new Object();

    /**
     * This global lock is used by both <code>BeanContext</code>
     * and <code>BeanContextServices</code> implementors
     * to serialize changes in a <code>BeanContext</code>
     * hierarchy and any service requests etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    void removeBeanContextMembershipListener(BeanContextMembershipListener bcml);

     /**
      * Removes the specified <code>BeanContextMembershipListener</code>
      * so that it no longer receives <code>BeanContextMembershipEvent</code>s
      * when the child <code>Component</code>(s) are added or removed.
      *
      * @param bcml the <code>BeanContextMembershipListener</code>
      * to be removed
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    void addBeanContextMembershipListener(BeanContextMembershipListener bcml);

     /**
      * Adds the specified <code>BeanContextMembershipListener</code>
      * to receive <code>BeanContextMembershipEvents</code> from
      * this <code>BeanContext</code> whenever it adds
      * or removes a child <code>Component</code>(s).
      *
      * @param bcml the BeanContextMembershipListener to be added
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    URL getResource(String name, BeanContextChild bcc) throws IllegalArgumentException;

    /**
     * Analagous to <code>java.lang.ClassLoader.getResource()</code>, this
     * method allows a <code>BeanContext</code> implementation to interpose
     * behavior between the child <code>Component</code>
     * and underlying <code>ClassLoader</code>.
     *
     * @param name the resource name
     * @param bcc the specified child
     * @return a <code>URL</code> for the named
     * resource for the specified child
     * @throws IllegalArgumentException
     * if the resource is not valid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    InputStream getResourceAsStream(String name, BeanContextChild bcc) throws IllegalArgumentException;

    /**
     * Analagous to <code>java.lang.ClassLoader.getResourceAsStream()</code>,
     * this method allows a <code>BeanContext</code> implementation
     * to interpose behavior between the child <code>Component</code>
     * and underlying <code>ClassLoader</code>.
     *
     * @param name the resource name
     * @param bcc the specified child
     * @return an <code>InputStream</code> for reading the resource,
     * or <code>null</code> if the resource could not
     * be found.
     * @throws IllegalArgumentException if
     * the resource is not valid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    Object instantiateChild(String beanName) throws IOException, ClassNotFoundException;

    /**
     * Instantiate the javaBean named as a
     * child of this <code>BeanContext</code>.
     * The implementation of the JavaBean is
     * derived from the value of the beanName parameter,
     * and is defined by the
     * <code>java.beans.Beans.instantiate()</code> method.
     *
     * @return a javaBean named as a child of this
     * <code>BeanContext</code>
     * @param beanName The name of the JavaBean to instantiate
     * as a child of this <code>BeanContext</code>
     * @throws IOException if an IO problem occurs
     * @throws ClassNotFoundException if the class identified
     * by the beanName parameter is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
@SuppressWarnings("rawtypes")

/**
 * <p>
 * The BeanContext acts a logical hierarchical container for JavaBeans.
 * </p>
 *
 * @author Laurence P. G. Cable
 * @since 1.2
 *
 * @see java.beans.Beans
 * @see java.beans.beancontext.BeanContextChild
 * @see java.beans.beancontext.BeanContextMembershipListener
 * @see java.beans.PropertyChangeEvent
 * @see java.beans.DesignMode
 * @see java.beans.Visibility
 * @see java.util.Collection
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    public static final Object globalHierarchyLock = new Object();

    /**
     * This global lock is used by both <code>BeanContext</code>
     * and <code>BeanContextServices</code> implementors
     * to serialize changes in a <code>BeanContext</code>
     * hierarchy and any service requests etc.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    void removeBeanContextMembershipListener(BeanContextMembershipListener bcml);

     /**
      * Removes the specified <code>BeanContextMembershipListener</code>
      * so that it no longer receives <code>BeanContextMembershipEvent</code>s
      * when the child <code>Component</code>(s) are added or removed.
      *
      * @param bcml the <code>BeanContextMembershipListener</code>
      * to be removed
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    void addBeanContextMembershipListener(BeanContextMembershipListener bcml);

     /**
      * Adds the specified <code>BeanContextMembershipListener</code>
      * to receive <code>BeanContextMembershipEvents</code> from
      * this <code>BeanContext</code> whenever it adds
      * or removes a child <code>Component</code>(s).
      *
      * @param bcml the BeanContextMembershipListener to be added
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    URL getResource(String name, BeanContextChild bcc) throws IllegalArgumentException;

    /**
     * Analagous to <code>java.lang.ClassLoader.getResource()</code>, this
     * method allows a <code>BeanContext</code> implementation to interpose
     * behavior between the child <code>Component</code>
     * and underlying <code>ClassLoader</code>.
     *
     * @param name the resource name
     * @param bcc the specified child
     * @return a <code>URL</code> for the named
     * resource for the specified child
     * @throws IllegalArgumentException
     * if the resource is not valid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    InputStream getResourceAsStream(String name, BeanContextChild bcc) throws IllegalArgumentException;

    /**
     * Analagous to <code>java.lang.ClassLoader.getResourceAsStream()</code>,
     * this method allows a <code>BeanContext</code> implementation
     * to interpose behavior between the child <code>Component</code>
     * and underlying <code>ClassLoader</code>.
     *
     * @param name the resource name
     * @param bcc the specified child
     * @return an <code>InputStream</code> for reading the resource,
     * or <code>null</code> if the resource could not
     * be found.
     * @throws IllegalArgumentException if
     * the resource is not valid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
    Object instantiateChild(String beanName) throws IOException, ClassNotFoundException;

    /**
     * Instantiate the javaBean named as a
     * child of this <code>BeanContext</code>.
     * The implementation of the JavaBean is
     * derived from the value of the beanName parameter,
     * and is defined by the
     * <code>java.beans.Beans.instantiate()</code> method.
     *
     * @return a javaBean named as a child of this
     * <code>BeanContext</code>
     * @param beanName The name of the JavaBean to instantiate
     * as a child of this <code>BeanContext</code>
     * @throws IOException if an IO problem occurs
     * @throws ClassNotFoundException if the class identified
     * by the beanName parameter is not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/beancontext/BeanContext.java
@SuppressWarnings("rawtypes")

/**
 * <p>
 * The BeanContext acts a logical hierarchical container for JavaBeans.
 * </p>
 *
 * @author Laurence P. G. Cable
 * @since 1.2
 *
 * @see java.beans.Beans
 * @see java.beans.beancontext.BeanContextChild
 * @see java.beans.beancontext.BeanContextMembershipListener
 * @see java.beans.PropertyChangeEvent
 * @see java.beans.DesignMode
 * @see java.beans.Visibility
 * @see java.util.Collection
 */
