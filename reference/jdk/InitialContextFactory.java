_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/InitialContextFactory.java
public interface InitialContextFactory {

/**
  * This interface represents a factory that creates an initial context.
  *<p>
  * The JNDI framework allows for different initial context implementations
  * to be specified at runtime.  The initial context is created using
  * an <em>initial context factory</em>.
  * An initial context factory must implement the InitialContextFactory
  * interface, which provides a method for creating instances of initial
  * context that implement the Context interface.
  * In addition, the factory class must be public and must have a public
  * constructor that accepts no arguments.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see InitialContextFactoryBuilder
  * @see NamingManager#getInitialContext
  * @see javax.naming.InitialContext
  * @see javax.naming.directory.InitialDirContext
  * @since 1.3
  */
