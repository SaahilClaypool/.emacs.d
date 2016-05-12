_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ClientPropertyKey.java
    public boolean getReportValueNotSerializable() {

    /**
     * Returns whether or not a {@code NotSerializableException} should be thrown
     * during serialization, when the value associated with this key does
     * not implement {@code Serializable}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ClientPropertyKey.java
    private ClientPropertyKey(boolean reportValueNotSerializable) {

    /**
     * Constructs a key with the {@code reportValueNotSerializable} property
     * set to the given value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ClientPropertyKey.java
    private ClientPropertyKey() {

    /**
     * Constructs a key with the {@code reportValueNotSerializable} property
     * set to {@code false}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ClientPropertyKey.java
    private final boolean reportValueNotSerializable;

    /**
     * Whether or not a {@code NotSerializableException} should be thrown
     * during serialization, when the value associated with this key does
     * not implement {@code Serializable}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ClientPropertyKey.java
    PopupFactory_FORCE_HEAVYWEIGHT_POPUP(true);

    /**
     * Key used by PopupFactory to force heavy weight popups for a
     * component.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ClientPropertyKey.java
    JComponent_ANCESTOR_NOTIFIER(true),

    /**
     * Key used by JComponent for storing AncestorNotifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ClientPropertyKey.java
    JComponent_TRANSFER_HANDLER(true),

    /**
     * Key used by JComponent for storing TransferHandler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ClientPropertyKey.java
    JComponent_INPUT_VERIFIER(true),

    /**
     * Key used by JComponent for storing InputVerifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ClientPropertyKey.java
enum ClientPropertyKey {

/**
 * An enumeration for keys used as client properties within the Swing
 * implementation.
 * <p>
 * This enum holds only a small subset of the keys currently used within Swing,
 * but we may move more of them here in the future.
 * <p>
 * Adding an item to, and using, this class instead of {@code String} for
 * client properties protects against conflicts with developer-set client
 * properties. Using this class also avoids a problem with {@code StringBuilder}
 * and {@code StringBuffer} keys, whereby the keys are not recognized upon
 * deserialization.
 * <p>
 * When a client property value associated with one of these keys does not
 * implement {@code Serializable}, the result during serialization depends
 * on how the key is defined here. Historically, client properties with values
 * not implementing {@code Serializable} have simply been dropped and left out
 * of the serialized representation. To define keys with such behavior in this
 * enum, provide a value of {@code false} for the {@code reportValueNotSerializable}
 * property. When migrating existing properties to this enum, one may wish to
 * consider using this by default, to preserve backward compatibility.
 * <p>
 * To instead have a {@code NotSerializableException} thrown when a
 * {@code non-Serializable} property is encountered, provide the value of
 * {@code true} for the {@code reportValueNotSerializable} property. This
 * is useful when the property represents something that the developer
 * needs to know about when it cannot be serialized.
 *
 * @author  Shannon Hickey
 */
