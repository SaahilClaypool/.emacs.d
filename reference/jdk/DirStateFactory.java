_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/DirStateFactory.java
        public Attributes getAttributes() { return attrs; };

        /**
         * Retrieves the attributes to be bound.
         * @return The possibly null attributes to be bound.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/DirStateFactory.java
        public Object getObject() { return obj; };

        /**
         * Retrieves the object to be bound.
         * @return The possibly null object to be bound.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/DirStateFactory.java
        public Result(Object obj, Attributes outAttrs) {

        /**
          * Constructs an instance of Result.
          *
          * @param obj The possibly null object to be bound.
          * @param outAttrs The possibly null attributes to be bound.
          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/DirStateFactory.java
        private Attributes attrs;

        /**
         * The possibly null attributes to be bound.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/DirStateFactory.java
    public static class Result {

        /**
         * An object/attributes pair for returning the result of
         * DirStateFactory.getStateToBind().
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/DirStateFactory.java
public interface DirStateFactory extends StateFactory {

/**
  * This interface represents a factory for obtaining the state of an
  * object and corresponding attributes for binding.
  *<p>
  * The JNDI framework allows for object implementations to
  * be loaded in dynamically via <tt>object factories</tt>.
  * <p>
  * A <tt>DirStateFactory</tt> extends <tt>StateFactory</tt>
  * by allowing an <tt>Attributes</tt> instance
  * to be supplied to and be returned by the <tt>getStateToBind()</tt> method.
  * <tt>DirStateFactory</tt> implementations are intended to be used by
  * <tt>DirContext</tt> service providers.
  * When a caller binds an object using <tt>DirContext.bind()</tt>,
  * he might also specify a set of attributes to be bound with the object.
  * The object and attributes to be bound are passed to
  * the <tt>getStateToBind()</tt> method of a factory.
  * If the factory processes the object and attributes, it returns
  * a corresponding pair of object and attributes to be bound.
  * If the factory does not process the object, it must return null.
  *<p>
  * For example, a caller might bind a printer object with some printer-related
  * attributes.
  *<blockquote><pre>
  * ctx.rebind("inky", printer, printerAttrs);
  *</pre></blockquote>
  * An LDAP service provider for <tt>ctx</tt> uses a <tt>DirStateFactory</tt>
  * (indirectly via <tt>DirectoryManager.getStateToBind()</tt>)
  * and gives it <tt>printer</tt> and <tt>printerAttrs</tt>. A factory for
  * an LDAP directory might turn <tt>printer</tt> into a set of attributes
  * and merge that with <tt>printerAttrs</tt>. The service provider then
  * uses the resulting attributes to create an LDAP entry and updates
  * the directory.
  *
  * <p> Since <tt>DirStateFactory</tt> extends <tt>StateFactory</tt>, it
  * has two <tt>getStateToBind()</tt> methods, where one
  * differs from the other by the attributes
  * argument. <tt>DirectoryManager.getStateToBind()</tt> will only use
  * the form that accepts the attributes argument, while
  * <tt>NamingManager.getStateToBind()</tt> will only use the form that
  * does not accept the attributes argument.
  *
  * <p> Either form of the <tt>getStateToBind()</tt> method of a
  * DirStateFactory may be invoked multiple times, possibly using different
  * parameters.  The implementation is thread-safe.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see DirectoryManager#getStateToBind
  * @see DirObjectFactory
  * @since 1.3
  */
