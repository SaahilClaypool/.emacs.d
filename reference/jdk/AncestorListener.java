_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/AncestorListener.java
    public void ancestorMoved(AncestorEvent event);

    /**
     * Called when either the source or one of its ancestors is moved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/AncestorListener.java
    public void ancestorRemoved(AncestorEvent event);

    /**
     * Called when the source or one of its ancestors is made invisible
     * either by setVisible(false) being called or by its being
     * remove from the component hierarchy.  The method is only called
     * if the source has actually become invisible.  For this to be true
     * at least one of its parents must by invisible or it is not in
     * a hierarchy rooted at a Window
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/AncestorListener.java
public interface AncestorListener extends EventListener {

/**
 * AncestorListener
 *
 * Interface to support notification when changes occur to a JComponent or one
 * of its ancestors.  These include movement and when the component becomes
 * visible or invisible, either by the setVisible() method or by being added
 * or removed from the component hierarchy.
 *
 * @author Dave Moore
 */
