_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    Object put(Object key, Object value);

    /**
     * Associates the specified value with the specified key in this context.
     * If the context previously contained a mapping for this key, the old
     * value is replaced by the specified value.
     *
     * <p>This method is useful for storing arbitrary information that is
     * specific to the cryptographic operation that this context is used for.
     *
     * @param key key with which the specified value is to be associated with
     * @param value value to be associated with the specified key
     * @return the previous value associated with the key, or <code>null</code>
     *    if there was no mapping for the key
     * @throws IllegalArgumentException if some aspect of this key or value
     *    prevents it from being stored in this context
     * @see #get(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    Object get(Object key);

    /**
     * Returns the value to which this context maps the specified key.
     *
     * <p>More formally, if this context contains a mapping from a key
     * <code>k</code> to a value <code>v</code> such that
     * <code>(key==null ? k==null : key.equals(k))</code>, then this method
     * returns <code>v</code>; otherwise it returns <code>null</code>. (There
     * can be at most one such mapping.)
     *
     * <p>This method is useful for retrieving arbitrary information that is
     * specific to the cryptographic operation that this context is used for.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which this context maps the specified key, or
     *    <code>null</code> if there is no mapping for the key
     * @see #put(Object, Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    Object getProperty(String name);

    /**
     * Returns the value of the specified property.
     *
     * @param name the name of the property
     * @return the current value of the specified property, or
     *    <code>null</code> if it does not have a value
     * @throws NullPointerException if <code>name</code> is <code>null</code>
     * @see #setProperty(String, Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    Object setProperty(String name, Object value);

    /**
     * Sets the specified property.
     *
     * @param name the name of the property
     * @param value the value of the property to be set
     * @return the previous value of the specified property, or
     *    <code>null</code> if it did not have a value
     * @throws NullPointerException if <code>name</code> is <code>null</code>
     * @see #getProperty(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    void setDefaultNamespacePrefix(String defaultPrefix);

    /**
     * Sets the default namespace prefix. This sets the namespace prefix for
     * all namespace URIs not explicitly set by the {@link #putNamespacePrefix
     * putNamespacePrefix} method.
     *
     * @param defaultPrefix the default namespace prefix, or <code>null</code>
     *    to remove the current setting. Specify the empty string
     *    (<code>""</code>) to bind no prefix.
     * @see #getDefaultNamespacePrefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    String getDefaultNamespacePrefix();

    /**
     * Returns the default namespace prefix. The default namespace prefix
     * is the prefix for all namespace URIs not explicitly set by the
     * {@link #putNamespacePrefix putNamespacePrefix} method.
     *
     * @return the default namespace prefix, or <code>null</code> if none has
     *    been set.
     * @see #setDefaultNamespacePrefix(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    String putNamespacePrefix(String namespaceURI, String prefix);

    /**
     * Maps the specified namespace URI to the specified prefix. If there is
     * already a prefix associated with the specified namespace URI, the old
     * prefix is replaced by the specified prefix.
     *
     * @param namespaceURI a namespace URI
     * @param prefix a namespace prefix (or <code>null</code> to remove any
     *    existing mapping). Specifying the empty string (<code>""</code>)
     *    binds no prefix to the namespace URI.
     * @return the previous prefix associated with the specified namespace
     *    URI, or <code>null</code> if there was none
     * @throws NullPointerException if <code>namespaceURI</code> is
     *    <code>null</code>
     * @see #getNamespacePrefix(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    String getNamespacePrefix(String namespaceURI, String defaultPrefix);

    /**
     * Returns the namespace prefix that the specified namespace URI is
     * associated with. Returns the specified default prefix if the specified
     * namespace URI has not been bound to a prefix. To bind a namespace URI
     * to a prefix, call the {@link #putNamespacePrefix putNamespacePrefix}
     * method.
     *
     * @param namespaceURI a namespace URI
     * @param defaultPrefix the prefix to be returned in the event that the
     *    the specified namespace URI has not been bound to a prefix.
     * @return the prefix that is associated with the specified namespace URI,
     *    or <code>defaultPrefix</code> if the URI is not registered. If
     *    the namespace URI is registered but has no prefix, an empty string
     *    (<code>""</code>) is returned.
     * @throws NullPointerException if <code>namespaceURI</code> is
     *    <code>null</code>
     * @see #putNamespacePrefix(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    void setURIDereferencer(URIDereferencer dereferencer);

    /**
     * Sets a <code>URIDereferencer</code> that is used to dereference
     * {@link URIReference}s. The specified <code>URIDereferencer</code>
     * is used in place of an implementation's default
     * <code>URIDereferencer</code>.
     *
     * @param dereferencer the <code>URIDereferencer</code>, or
     *    <code>null</code> to remove any current setting
     * @see #getURIDereferencer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    URIDereferencer getURIDereferencer();

    /**
     * Returns a <code>URIDereferencer</code> that is used to dereference
     * {@link URIReference}s.
     *
     * @return the <code>URIDereferencer</code>, or <code>null</code> if not
     *    specified
     * @see #setURIDereferencer(URIDereferencer)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    void setKeySelector(KeySelector ks);

    /**
     * Sets the key selector for finding a key.
     *
     * @param ks the key selector, or <code>null</code> to remove the current
     *    setting
     * @see #getKeySelector
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    KeySelector getKeySelector();

    /**
     * Returns the key selector for finding a key.
     *
     * @return the key selector, or <code>null</code> if not specified
     * @see #setKeySelector(KeySelector)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    void setBaseURI(String baseURI);

    /**
     * Sets the base URI.
     *
     * @param baseURI the base URI, or <code>null</code> to remove current
     *    value
     * @throws IllegalArgumentException if <code>baseURI</code> is not RFC
     *    2396 compliant
     * @see #getBaseURI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
    String getBaseURI();

    /**
     * Returns the base URI.
     *
     * @return the base URI, or <code>null</code> if not specified
     * @see #setBaseURI(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/XMLCryptoContext.java
public interface XMLCryptoContext {

/**
 * Contains common context information for XML cryptographic operations.
 *
 * <p>This interface contains methods for setting and retrieving properties
 * that affect the processing of XML signatures or XML encrypted structures.
 *
 * <p>Note that <code>XMLCryptoContext</code> instances can contain information
 * and state specific to the XML cryptographic structure it is used with.
 * The results are unpredictable if an <code>XMLCryptoContext</code> is
 * used with multiple structures (for example, you should not use the same
 * {@link javax.xml.crypto.dsig.XMLValidateContext} instance to validate two
 * different {@link javax.xml.crypto.dsig.XMLSignature} objects).
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 */
