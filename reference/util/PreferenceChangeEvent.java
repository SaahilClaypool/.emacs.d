_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/PreferenceChangeEvent.java
     private void readObject(java.io.ObjectInputStream in)

    /**
     * Throws NotSerializableException, since PreferenceChangeEvent objects
     * are not intended to be serializable.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/PreferenceChangeEvent.java
     private void writeObject(java.io.ObjectOutputStream out)

    /**
     * Throws NotSerializableException, since NodeChangeEvent objects
     * are not intended to be serializable.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/PreferenceChangeEvent.java
    public String getNewValue() {

    /**
     * Returns the new value for the preference.
     *
     * @return  The new value for the preference, or <tt>null</tt> if the
     *          preference was removed.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/PreferenceChangeEvent.java
    public String getKey() {

    /**
     * Returns the key of the preference that was changed.
     *
     * @return  The key of the preference that was changed.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/PreferenceChangeEvent.java
    public Preferences getNode() {

    /**
     * Returns the preference node that emitted the event.
     *
     * @return  The preference node that emitted the event.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/PreferenceChangeEvent.java
    public PreferenceChangeEvent(Preferences node, String key,
                                 String newValue) {

    /**
     * Constructs a new <code>PreferenceChangeEvent</code> instance.
     *
     * @param node  The Preferences node that emitted the event.
     * @param key  The key of the preference that was changed.
     * @param newValue  The new value of the preference, or <tt>null</tt>
     *                  if the preference is being removed.
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/PreferenceChangeEvent.java
    private String newValue;

    /**
     * New value for preference, or <tt>null</tt> if it was removed.
     *
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/PreferenceChangeEvent.java
    private String key;

    /**
     * Key of the preference that changed.
     *
     * @serial
     */
_func_
util
c:/Users/saahil claypool/Documents/JDKSource/java/util//prefs/PreferenceChangeEvent.java
public class PreferenceChangeEvent extends java.util.EventObject {

/**
 * An event emitted by a <tt>Preferences</tt> node to indicate that
 * a preference has been added, removed or has had its value changed.<p>
 *
 * Note, that although PreferenceChangeEvent inherits Serializable interface
 * from EventObject, it is not intended to be Serializable. Appropriate
 * serialization methods are implemented to throw NotSerializableException.
 *
 * @author  Josh Bloch
 * @see Preferences
 * @see PreferenceChangeListener
 * @see NodeChangeEvent
 * @since   1.4
 * @serial exclude
 */
