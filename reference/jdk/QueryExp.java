_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QueryExp.java
     public void setMBeanServer(MBeanServer s) ;

     /**
      * Sets the MBean server on which the query is to be performed.
      *
      * @param s The MBean server on which the query is to be performed.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QueryExp.java
     public boolean apply(ObjectName name) throws BadStringOperationException, BadBinaryOpValueExpException,

     /**
      * Applies the QueryExp on an MBean.
      *
      * @param name The name of the MBean on which the QueryExp will be applied.
      *
      * @return  True if the query was successfully applied to the MBean, false otherwise
      *
      * @exception BadStringOperationException
      * @exception BadBinaryOpValueExpException
      * @exception BadAttributeValueExpException
      * @exception InvalidApplicationException
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/QueryExp.java
public interface QueryExp extends Serializable {

/**
 * <p>Represents relational constraints similar to database query "where
 * clauses". Instances of QueryExp are returned by the static methods of the
 * {@link Query} class.</p>
 *
 * <p>It is possible, but not
 * recommended, to create custom queries by implementing this
 * interface.  In that case, it is better to extend the {@link
 * QueryEval} class than to implement the interface directly, so that
 * the {@link #setMBeanServer} method works correctly.
 *
 * @see MBeanServer#queryNames MBeanServer.queryNames
 * @since 1.5
 */
