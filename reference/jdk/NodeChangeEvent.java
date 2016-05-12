_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/NodeChangeEvent.java
     private void readObject(java.io.ObjectInputStream in)

    /**
     * Throws NotSerializableException, since NodeChangeEvent objects are not
     * intended to be serializable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/NodeChangeEvent.java
     private void writeObject(java.io.ObjectOutputStream out)

    /**
     * Throws NotSerializableException, since NodeChangeEvent objects are not
     * intended to be serializable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/NodeChangeEvent.java
    public Preferences getChild() {

    /**
     * Returns the node that was added or removed.
     *
     * @return  The node that was added or removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/NodeChangeEvent.java
    public Preferences getParent() {

    /**
     * Returns the parent of the node that was added or removed.
     *
     * @return  The parent Preferences node whose child was added or removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/NodeChangeEvent.java
    public NodeChangeEvent(Preferences parent, Preferences child) {

    /**
     * Constructs a new <code>NodeChangeEvent</code> instance.
     *
     * @param parent  The parent of the node that was added or removed.
     * @param child   The node that was added or removed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/NodeChangeEvent.java
public class NodeChangeEvent extends java.util.EventObject {

/**
 * An event emitted by a <tt>Preferences</tt> node to indicate that
 * a child of that node has been added or removed.<p>
 *
 * Note, that although NodeChangeEvent inherits Serializable interface from
 * java.util.EventObject, it is not intended to be Serializable. Appropriate
 * serialization methods are implemented to throw NotSerializableException.
 *
 * @author  Josh Bloch
 * @see     Preferences
 * @see     NodeChangeListener
 * @see     PreferenceChangeEvent
 * @since   1.4
 * @serial  exclude
 */
