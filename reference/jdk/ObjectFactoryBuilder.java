_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/ObjectFactoryBuilder.java
public interface ObjectFactoryBuilder {

 /**
  * This interface represents a builder that creates object factories.
  *<p>
  * The JNDI framework allows for object implementations to
  * be loaded in dynamically via <em>object factories</em>.
  * For example, when looking up a printer bound in the name space,
  * if the print service binds printer names to References, the printer
  * Reference could be used to create a printer object, so that
  * the caller of lookup can directly operate on the printer object
  * after the lookup.  An ObjectFactory is responsible for creating
  * objects of a specific type.  JNDI uses a default policy for using
  * and loading object factories.  You can override this default policy
  * by calling <tt>NamingManager.setObjectFactoryBuilder()</tt> with an ObjectFactoryBuilder,
  * which contains the program-defined way of creating/loading
  * object factories.
  * Any <tt>ObjectFactoryBuilder</tt> implementation must implement this
  * interface that for creating object factories.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see ObjectFactory
  * @see NamingManager#getObjectInstance
  * @see NamingManager#setObjectFactoryBuilder
  * @since 1.3
  */
