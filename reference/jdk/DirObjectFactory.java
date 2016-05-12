_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/DirObjectFactory.java
public interface DirObjectFactory extends ObjectFactory {

/**
  * This interface represents a factory for creating an object given
  * an object and attributes about the object.
  *<p>
  * The JNDI framework allows for object implementations to
  * be loaded in dynamically via <em>object factories</em>. See
  * <tt>ObjectFactory</tt> for details.
  * <p>
  * A <tt>DirObjectFactory</tt> extends <tt>ObjectFactory</tt> by allowing
  * an <tt>Attributes</tt> instance
  * to be supplied to the <tt>getObjectInstance()</tt> method.
  * <tt>DirObjectFactory</tt> implementations are intended to be used by <tt>DirContext</tt>
  * service providers. The service provider, in addition reading an
  * object from the directory, might already have attributes that
  * are useful for the object factory to check to see whether the
  * factory is supposed to process the object. For instance, an LDAP-style
  * service provider might have read the "objectclass" of the object.
  * A CORBA object factory might be interested only in LDAP entries
  * with "objectclass=corbaObject". By using the attributes supplied by
  * the LDAP service provider, the CORBA object factory can quickly
  * eliminate objects that it need not worry about, and non-CORBA object
  * factories can quickly eliminate CORBA-related LDAP entries.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see NamingManager#getObjectInstance
  * @see DirectoryManager#getObjectInstance
  * @see ObjectFactory
  * @since 1.3
  */
