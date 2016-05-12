_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
    private static final long serialVersionUID = 8839217842691845890L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
    public String toString() {

    /**
      * Generates the string representation of this binding.
      * The string representation consists of the string representation
      * of the name/class pair and the string representation of
      * this binding's object, separated by ':'.
      * The contents of this string is useful
      * for debugging and is not meant to be interpreted programmatically.
      *
      * @return The non-null string representation of this binding.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
    public void setObject(Object obj) {

    /**
     * Sets the object associated with this binding.
     * @param obj The possibly null object to use.
     * @see #getObject
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
    public Object getObject() {

    /**
      * Retrieves the object bound to the name of this binding.
      *
      * @return The object bound; null if this binding does not contain an object.
      * @see #setObject
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
    public String getClassName() {

    /**
      * Retrieves the class name of the object bound to the name of this binding.
      * If the class name has been set explicitly, return it.
      * Otherwise, if this binding contains a non-null object,
      * that object's class name is used. Otherwise, null is returned.
      *
      * @return A possibly null string containing class name of object bound.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
    public Binding(String name, String className, Object obj, boolean isRelative) {

    /**
      * Constructs an instance of a Binding given its
      * name, class name, object, and whether the name is relative.
      *
      * @param  name    The non-null string name of the object.
      * @param  className       The possibly null class name of the object
      *         bound to <tt>name</tt>. If null, the class name of <tt>obj</tt> is
      *         returned by <tt>getClassName()</tt>. If <tt>obj</tt> is also
      *         null, <tt>getClassName()</tt> will return null.
      * @param  obj     The possibly null object bound to name.
      * @param isRelative true if <code>name</code> is a name relative
      *         to the target context (which is named by
      *         the first parameter of the <code>listBindings()</code> method);
      *         false if <code>name</code> is a URL string.
      * @see NameClassPair#isRelative
      * @see NameClassPair#setRelative
      * @see NameClassPair#setClassName
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
    public Binding(String name, String className, Object obj) {

    /**
      * Constructs an instance of a Binding given its name, class name, and object.
      *
      * @param  name    The non-null name of the object. It is relative
      *             to the <em>target context</em> (which is
      * named by the first parameter of the <code>listBindings()</code> method)
      * @param  className       The possibly null class name of the object
      *         bound to <tt>name</tt>. If null, the class name of <tt>obj</tt> is
      *         returned by <tt>getClassName()</tt>. If <tt>obj</tt> is also
      *         null, <tt>getClassName()</tt> will return null.
      * @param  obj     The possibly null object bound to name.
      * @see NameClassPair#setClassName
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
    public Binding(String name, Object obj, boolean isRelative) {

    /**
      * Constructs an instance of a Binding given its name, object, and whether
      * the name is relative.
      *<p>
      * <tt>getClassName()</tt> will return the class name of <tt>obj</tt>
      * (or null if <tt>obj</tt> is null) unless the class name has been
      * explicitly set using <tt>setClassName()</tt>
      *
      * @param  name    The non-null string name of the object.
      * @param  obj     The possibly null object bound to name.
      * @param isRelative true if <code>name</code> is a name relative
      *         to the target context (which is named by
      *         the first parameter of the <code>listBindings()</code> method);
      *         false if <code>name</code> is a URL string.
      * @see NameClassPair#isRelative
      * @see NameClassPair#setRelative
      * @see NameClassPair#setClassName
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
    public Binding(String name, Object obj) {

    /**
      * Constructs an instance of a Binding given its name and object.
      *<p>
      * <tt>getClassName()</tt> will return
      * the class name of <tt>obj</tt> (or null if <tt>obj</tt> is null)
      * unless the class name has been explicitly set using <tt>setClassName()</tt>
      *
      * @param  name    The non-null name of the object. It is relative
      *             to the <em>target context</em> (which is
      * named by the first parameter of the <code>listBindings()</code> method)
      * @param  obj     The possibly null object bound to name.
      * @see NameClassPair#setClassName
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Binding.java
public class Binding extends NameClassPair {

/**
  * This class represents a name-to-object binding found in a context.
  *<p>
  * A context consists of name-to-object bindings.
  * The Binding class represents such a binding.  It consists
  * of a name and an object. The <code>Context.listBindings()</code>
  * method returns an enumeration of Binding.
  *<p>
  * Use subclassing for naming systems that generate contents of
  * a binding dynamically.
  *<p>
  * A Binding instance is not synchronized against concurrent access by multiple
  * threads. Threads that need to access a Binding concurrently should
  * synchronize amongst themselves and provide the necessary locking.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/Binding.java
    String getBindingID();

    /**
     * Get the URI for this binding instance.
     *
     * @return String The binding identifier for the port.
     *    Never returns <code>null</code>
     *
     * @since JAX-WS 2.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/Binding.java
    public void setHandlerChain(java.util.List<javax.xml.ws.handler.Handler> chain);

   /**
    * Sets the handler chain for the protocol binding instance.
    *
    *  @param chain    A List of handler configuration entries
    *  @throws WebServiceException On an error in the configuration of
    *                  the handler chain
    *  @throws java.lang.UnsupportedOperationException If this
    *          operation is not supported. This may be done to
    *          avoid any overriding of a pre-configured handler
    *          chain.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/Binding.java
    public java.util.List<javax.xml.ws.handler.Handler> getHandlerChain();

   /**
    * Gets a copy of the handler chain for a protocol binding instance.
    * If the returned chain is modified a call to <code>setHandlerChain</code>
    * is required to configure the binding instance with the new chain.
    *
    *  @return java.util.List&lt;Handler> Handler chain
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/Binding.java
public interface Binding {

/** The <code>Binding</code> interface is the base interface
 *  for JAX-WS protocol bindings.
 *
 *  @since JAX-WS 2.0
**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CosNaming/Binding.java
public final class Binding implements org.omg.CORBA.portable.IDLEntity

/**
* org/omg/CosNaming/Binding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Tuesday, October 6, 2015 4:40:33 PM PDT
*/
