_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkRef.java
    private static final long serialVersionUID = -5386290613498931298L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkRef.java
    public String getLinkName() throws NamingException {

    /**
      * Retrieves the name of this link.
      *
      * @return The non-null name of this link.
      * @exception MalformedLinkException If a link name could not be extracted
      * @exception NamingException If a naming exception was encountered.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkRef.java
    public LinkRef(String linkName) {

    /**
      * Constructs a LinkRef for a string name.
      * @param linkName The non-null name for which to create this link.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkRef.java
    public LinkRef(Name linkName) {

    /**
      * Constructs a LinkRef for a name.
      * @param linkName The non-null name for which to create this link.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/LinkRef.java
  /*<p>

/**
  * This class represents a Reference whose contents is a name, called the link name,
  * that is bound to an atomic name in a context.
  *<p>
  * The name is a URL, or a name to be resolved relative to the initial
  * context, or if the first character of the name is ".", the name
  * is relative to the context in which the link is bound.
  *<p>
  * Normal resolution of names in context operations always follow links.
  * Resolution of the link name itself may cause resolution to pass through
  * other  links. This gives rise to the possibility of a cycle of links whose
  * resolution could not terminate normally. As a simple means to avoid such
  * non-terminating resolutions, service providers may define limits on the
  * number of links that may be involved in any single operation invoked
  * by the caller.
  *<p>
  * A LinkRef contains a single StringRefAddr, whose type is "LinkAddress",
  * and whose contents is the link name. The class name field of the
  * Reference is that of this (LinkRef) class.
  *<p>
  * LinkRef is bound to a name using the normal Context.bind()/rebind(), and
  * DirContext.bind()/rebind(). Context.lookupLink() is used to retrieve the link
  * itself if the terminal atomic name is bound to a link.
  *<p>
  * Many naming systems support a native notion of link that may be used
  * within the naming system itself. JNDI does not specify whether
  * there is any relationship between such native links and JNDI links.
  *<p>
  * A LinkRef instance is not synchronized against concurrent access by multiple
  * threads. Threads that need to access a LinkRef instance concurrently should
  * synchronize amongst themselves and provide the necessary locking.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see LinkException
  * @see LinkLoopException
  * @see MalformedLinkException
  * @see Context#lookupLink
  * @since 1.3
  */
