_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InitialDirContext.java
    public InitialDirContext(Hashtable<?,?> environment)

    /**
     * Constructs an initial DirContext using the supplied environment.
     * Environment properties are discussed in the
     * <tt>javax.naming.InitialContext</tt> class description.
     *
     * <p> This constructor will not modify <tt>environment</tt>
     * or save a reference to it, but may save a clone.
     * Caller should not modify mutable keys and values in
     * <tt>environment</tt> after it has been passed to the constructor.
     *
     * @param environment
     *          environment used to create the initial DirContext.
     *          Null indicates an empty environment.
     *
     * @throws  NamingException if a naming exception is encountered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InitialDirContext.java
    public InitialDirContext() throws NamingException {

    /**
     * Constructs an initial DirContext.
     * No environment properties are supplied.
     * Equivalent to <tt>new InitialDirContext(null)</tt>.
     *
     * @throws  NamingException if a naming exception is encountered
     *
     * @see #InitialDirContext(Hashtable)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InitialDirContext.java
    protected InitialDirContext(boolean lazy) throws NamingException {

    /**
     * Constructs an initial DirContext with the option of not
     * initializing it.  This may be used by a constructor in
     * a subclass when the value of the environment parameter
     * is not yet known at the time the <tt>InitialDirContext</tt>
     * constructor is called.  The subclass's constructor will
     * call this constructor, compute the value of the environment,
     * and then call <tt>init()</tt> before returning.
     *
     * @param lazy
     *          true means do not initialize the initial DirContext; false
     *          is equivalent to calling <tt>new InitialDirContext()</tt>
     * @throws  NamingException if a naming exception is encountered
     *
     * @see InitialContext#init(Hashtable)
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/directory/InitialDirContext.java
public class InitialDirContext extends InitialContext implements DirContext {

/**
 * This class is the starting context for performing
 * directory operations. The documentation in the class description
 * of InitialContext (including those for synchronization) apply here.
 *
 *
 * @author Rosanna Lee
 * @author Scott Seligman
 *
 * @see javax.naming.InitialContext
 * @since 1.3
 */
