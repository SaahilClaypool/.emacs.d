_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/KeySelector.java
    public static KeySelector singletonKeySelector(Key key) {

    /**
     * Returns a <code>KeySelector</code> that always selects the specified
     * key, regardless of the <code>KeyInfo</code> passed to it.
     *
     * @param key the sole key to be stored in the key selector
     * @return a key selector that always selects the specified key
     * @throws NullPointerException if <code>key</code> is <code>null</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/KeySelector.java
    public abstract KeySelectorResult select(KeyInfo keyInfo, Purpose purpose,
        AlgorithmMethod method, XMLCryptoContext context)

    /**
     * Attempts to find a key that satisfies the specified constraints.
     *
     * @param keyInfo a <code>KeyInfo</code> (may be <code>null</code>)
     * @param purpose the key's purpose ({@link Purpose#SIGN},
     *    {@link Purpose#VERIFY}, {@link Purpose#ENCRYPT}, or
     *    {@link Purpose#DECRYPT})
     * @param method the algorithm method that this key is to be used for.
     *    Only keys that are compatible with the algorithm and meet the
     *    constraints of the specified algorithm should be returned.
     * @param context an <code>XMLCryptoContext</code> that may contain
     *    useful information for finding an appropriate key. If this key
     *    selector supports resolving {@link RetrievalMethod} types, the
     *    context's <code>baseURI</code> and <code>dereferencer</code>
     *    parameters (if specified) should be used by the selector to
     *    resolve and dereference the URI.
     * @return the result of the key selector
     * @throws KeySelectorException if an exceptional condition occurs while
     *    attempting to find a key. Note that an inability to find a key is not
     *    considered an exception (<code>null</code> should be
     *    returned in that case). However, an error condition (ex: network
     *    communications failure) that prevented the <code>KeySelector</code>
     *    from finding a potential key should be considered an exception.
     * @throws ClassCastException if the data type of <code>method</code>
     *    is not supported by this key selector
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/KeySelector.java
    protected KeySelector() {}

    /**
     * Default no-args constructor; intended for invocation by subclasses only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/KeySelector.java
        public static final Purpose ENCRYPT = new Purpose("encrypt");

        /**
         * A key for encrypting.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/KeySelector.java
        public static final Purpose SIGN = new Purpose("sign");

        /**
         * A key for signing.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/KeySelector.java
        public String toString()        { return name; }

        /**
         * Returns a string representation of this purpose ("sign",
         * "verify", "encrypt", or "decrypt").
         *
         * @return a string representation of this purpose
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/KeySelector.java
    public static class Purpose {

    /**
     * The purpose of the key that is to be selected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/KeySelector.java
public abstract class KeySelector {

/**
 * A selector that finds and returns a key using the data contained in a
 * {@link KeyInfo} object. An example of an implementation of
 * this class is one that searches a {@link java.security.KeyStore} for
 * trusted keys that match information contained in a <code>KeyInfo</code>.
 *
 * <p>Whether or not the returned key is trusted and the mechanisms
 * used to determine that is implementation-specific.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 */
