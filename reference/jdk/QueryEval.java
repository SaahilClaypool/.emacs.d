_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QueryEval.java
    public static MBeanServer getMBeanServer() {

    /**
     * <p>Return the MBean server that was most recently given to the
     * {@link #setMBeanServer setMBeanServer} method by this thread.
     * If this thread never called that method, the result is the
     * value its parent thread would have obtained from
     * <code>getMBeanServer</code> at the moment of the creation of
     * this thread, or null if there is no parent thread.</p>
     *
     * @return the MBean server.
     *
     * @see #setMBeanServer
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QueryEval.java
    public void setMBeanServer(MBeanServer s) {

    /**
     * <p>Sets the MBean server on which the query is to be performed.
     * The setting is valid for the thread performing the set.
     * It is copied to any threads created by that thread at the moment
     * of their creation.</p>
     *
     * <p>For historical reasons, this method is not static, but its
     * behavior does not depend on the instance on which it is
     * called.</p>
     *
     * @param s The MBean server on which the query is to be performed.
     *
     * @see #getMBeanServer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QueryEval.java
public abstract class QueryEval implements Serializable {

/**
 * Allows a query to be performed in the context of a specific MBean server.
 *
 * @since 1.5
 */
