_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/StateFactory.java
public interface StateFactory {

/**
  * This interface represents a factory for obtaining the state of an
  * object for binding.
  *<p>
  * The JNDI framework allows for object implementations to
  * be loaded in dynamically via <em>object factories</em>.
  * For example, when looking up a printer bound in the name space,
  * if the print service binds printer names to <tt>Reference</tt>s, the printer
  * <tt>Reference</tt> could be used to create a printer object, so that
  * the caller of lookup can directly operate on the printer object
  * after the lookup.
  * <p>An <tt>ObjectFactory</tt> is responsible
  * for creating objects of a specific type.  In the above example,
  * you may have a <tt>PrinterObjectFactory</tt> for creating
  * <tt>Printer</tt> objects.
  * <p>
  * For the reverse process, when an object is bound into the namespace,
  * JNDI provides <em>state factories</em>.
  * Continuing with the printer example, suppose the printer object is
  * updated and rebound:
  * <blockquote><pre>
  * ctx.rebind("inky", printer);
  * </pre></blockquote>
  * The service provider for <tt>ctx</tt> uses a state factory
  * to obtain the state of <tt>printer</tt> for binding into its namespace.
  * A state factory for the <tt>Printer</tt> type object might return
  * a more compact object for storage in the naming system.
  *<p>
  * A state factory must implement the <tt>StateFactory</tt> interface.
  * In addition, the factory class must be public and must have a
  * public constructor that accepts no parameters.
  *<p>
  * The <tt>getStateToBind()</tt> method of a state factory may
  * be invoked multiple times, possibly using different parameters.
  * The implementation is thread-safe.
  *<p>
  * <tt>StateFactory</tt> is intended for use with service providers
  * that implement only the <tt>Context</tt> interface.
  * <tt>DirStateFactory</tt> is intended for use with service providers
  * that implement the <tt>DirContext</tt> interface.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see NamingManager#getStateToBind
  * @see DirectoryManager#getStateToBind
  * @see ObjectFactory
  * @see DirStateFactory
  * @since 1.3
  */
