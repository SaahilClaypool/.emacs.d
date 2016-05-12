_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NotContextException.java
    private static final long serialVersionUID = 849752551644540417L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NotContextException.java
    public NotContextException() {

    /**
      * Constructs a new instance of NotContextException.
      * All fields default to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/NotContextException.java
public class NotContextException extends NamingException {

/**
  * This exception is thrown when a naming operation proceeds to a point
  * where a context is required to continue the operation, but the
  * resolved object is not a context. For example, Context.destroy() requires
  * that the named object be a context. If it is not, NotContextException
  * is thrown. Another example is a non-context being encountered during
  * the resolution phase of the Context methods.
  *<p>
  * It is also thrown when a particular subtype of context is required,
  * such as a DirContext, and the resolved object is a context but not of
  * the required subtype.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  * @see Context#destroySubcontext
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
