_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/event/NamespaceChangeListener.java
    void objectRenamed(NamingEvent evt);

    /**
     * Called when an object has been renamed.
     *<p>
     * The binding of the renamed object can be obtained using
     * <tt>evt.getNewBinding()</tt>. Its old binding (before the rename)
     * can be obtained using <tt>evt.getOldBinding()</tt>.
     * One of these may be null if the old/new binding was outside the
     * scope in which the listener has registered interest.
     * @param evt The nonnull event.
     * @see NamingEvent#OBJECT_RENAMED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/event/NamespaceChangeListener.java
    void objectRemoved(NamingEvent evt);

    /**
     * Called when an object has been removed.
     *<p>
     * The binding of the newly removed object can be obtained using
     * <tt>evt.getOldBinding()</tt>.
     * @param evt The nonnull event.
     * @see NamingEvent#OBJECT_REMOVED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/event/NamespaceChangeListener.java
    void objectAdded(NamingEvent evt);

    /**
     * Called when an object has been added.
     *<p>
     * The binding of the newly added object can be obtained using
     * <tt>evt.getNewBinding()</tt>.
     * @param evt The nonnull event.
     * @see NamingEvent#OBJECT_ADDED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/event/NamespaceChangeListener.java
public interface NamespaceChangeListener extends NamingListener {

/**
  * Specifies the methods that a listener interested in namespace changes
  * must implement.
  * Specifically, the listener is interested in <tt>NamingEvent</tt>s
  * with event types of <tt>OBJECT_ADDED</TT>, <TT>OBJECT_RENAMED</TT>, or
  * <TT>OBJECT_REMOVED</TT>.
  *<p>
  * Such a listener must:
  *<ol>
  *<li>Implement this interface and its methods.
  *<li>Implement <tt>NamingListener.namingExceptionThrown()</tt> so that
  * it will be notified of exceptions thrown while attempting to
  * collect information about the events.
  *<li>Register with the source using the source's <tt>addNamingListener()</tt>
  *    method.
  *</ol>
  * A listener that wants to be notified of <tt>OBJECT_CHANGED</tt> event types
  * should also implement the <tt>ObjectChangeListener</tt>
  * interface.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see NamingEvent
  * @see ObjectChangeListener
  * @see EventContext
  * @see EventDirContext
  * @since 1.3
  */
