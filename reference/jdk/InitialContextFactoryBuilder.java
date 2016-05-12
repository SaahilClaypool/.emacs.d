_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/spi/InitialContextFactoryBuilder.java
public interface InitialContextFactoryBuilder {

/**
  * This interface represents a builder that creates initial context factories.
  *<p>
  * The JNDI framework allows for different initial context implementations
  * to be specified at runtime.  An initial context is created using
  * an initial context factory. A program can install its own builder
  * that creates initial context factories, thereby overriding the
  * default policies used by the framework, by calling
  * NamingManager.setInitialContextFactoryBuilder().
  * The InitialContextFactoryBuilder interface must be implemented by
  * such a builder.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see InitialContextFactory
  * @see NamingManager#getInitialContext
  * @see NamingManager#setInitialContextFactoryBuilder
  * @see NamingManager#hasInitialContextFactoryBuilder
  * @see javax.naming.InitialContext
  * @see javax.naming.directory.InitialDirContext
  * @since 1.3
  */
