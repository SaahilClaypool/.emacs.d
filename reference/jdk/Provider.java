_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        public String toString() {

        /**
         * Return a String representation of this service.
         *
         * @return a String representation of this service.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        private boolean hasKeyAttributes() {

        /**
         * Return whether this service has its Supported* properties for
         * keys defined. Parses the attributes if not yet initialized.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        public boolean supportsParameter(Object parameter) {

        /**
         * Test whether this Service can use the specified parameter.
         * Returns false if this service cannot use the parameter. Returns
         * true if this service can use the parameter, if a fast test is
         * infeasible, or if the status is unknown.
         *
         * <p>The security provider framework uses this method with
         * some types of services to quickly exclude non-matching
         * implementations for consideration.
         * Applications will typically not need to call it.
         *
         * <p>For details and the values of parameter that are valid for the
         * various types of services see the top of this class and the
         * <a href="../../../technotes/guides/security/crypto/CryptoSpec.html">
         * Java Cryptography Architecture API Specification &amp;
         * Reference</a>.
         * Security providers can override it to implement their own test.
         *
         * @param parameter the parameter to test
         *
         * @return false if this this service cannot use the specified
         * parameter; true if it can possibly use the parameter
         *
         * @throws InvalidParameterException if the value of parameter is
         * invalid for this type of service or if this method cannot be
         * used with this type of service
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        private Object newInstanceGeneric(Object constructorParameter)

        /**
         * Generic code path for unknown engine types. Call the
         * no-args constructor if constructorParameter is null, otherwise
         * use the first matching constructor.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        public Object newInstance(Object constructorParameter)

        /**
         * Return a new instance of the implementation described by this
         * service. The security provider framework uses this method to
         * construct implementations. Applications will typically not need
         * to call it.
         *
         * <p>The default implementation uses reflection to invoke the
         * standard constructor for this type of service.
         * Security providers can override this method to implement
         * instantiation in a different way.
         * For details and the values of constructorParameter that are
         * valid for the various types of services see the
         * <a href="../../../technotes/guides/security/crypto/CryptoSpec.html">
         * Java Cryptography Architecture API Specification &amp;
         * Reference</a>.
         *
         * @param constructorParameter the value to pass to the constructor,
         * or null if this type of service does not use a constructorParameter.
         *
         * @return a new implementation of this service
         *
         * @throws InvalidParameterException if the value of
         * constructorParameter is invalid for this type of service.
         * @throws NoSuchAlgorithmException if instantiation failed for
         * any other reason.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        public final String getAttribute(String name) {

        /**
         * Return the value of the specified attribute or null if this
         * attribute is not set for this Service.
         *
         * @param name the name of the requested attribute
         *
         * @return the value of the specified attribute or null if the
         *         attribute is not present
         *
         * @throws NullPointerException if name is null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        public final String getClassName() {

        /**
         * Return the name of the class implementing this service.
         *
         * @return the name of the class implementing this service
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        public final Provider getProvider() {

        /**
         * Return the Provider of this service.
         *
         * @return the Provider of this service
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        public final String getAlgorithm() {

        /**
         * Return the name of the algorithm of this service. For example,
         * {@code SHA-1}.
         *
         * @return the algorithm of this service
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        public final String getType() {

        /**
         * Get the type of this service. For example, {@code MessageDigest}.
         *
         * @return the type of this service
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
        public Service(Provider provider, String type, String algorithm,
                String className, List<String> aliases,
                Map<String,String> attributes) {

        /**
         * Construct a new service.
         *
         * @param provider the provider that offers this service
         * @param type the type of this service
         * @param algorithm the algorithm name
         * @param className the name of the class implementing this service
         * @param aliases List of aliases or null if algorithm has no aliases
         * @param attributes Map of attributes or null if this implementation
         *                   has no attributes
         *
         * @throws NullPointerException if provider, type, algorithm, or
         * className is null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    public static class Service {

    /**
     * The description of a security service. It encapsulates the properties
     * of a service and contains a factory method to obtain new implementation
     * instances of this service.
     *
     * <p>Each service has a provider that offers the service, a type,
     * an algorithm name, and the name of the class that implements the
     * service. Optionally, it also includes a list of alternate algorithm
     * names for this service (aliases) and attributes, which are a map of
     * (name, value) String pairs.
     *
     * <p>This class defines the methods {@link #supportsParameter
     * supportsParameter()} and {@link #newInstance newInstance()}
     * which are used by the Java security framework when it searches for
     * suitable services and instantiates them. The valid arguments to those
     * methods depend on the type of service. For the service types defined
     * within Java SE, see the
     * <a href="../../../technotes/guides/security/crypto/CryptoSpec.html">
     * Java Cryptography Architecture API Specification &amp; Reference </a>
     * for the valid values.
     * Note that components outside of Java SE can define additional types of
     * services and their behavior.
     *
     * <p>Instances of this class are immutable.
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    protected synchronized void removeService(Service s) {

    /**
     * Remove a service previously added using
     * {@link #putService putService()}. The specified service is removed from
     * this provider. It will no longer be returned by
     * {@link #getService getService()} and its information will be removed
     * from this provider's Hashtable.
     *
     * <p>Also, if there is a security manager, its
     * {@code checkSecurityAccess} method is called with the string
     * {@code "removeProviderProperty."+name}, where {@code name} is
     * the provider name, to see if it's ok to remove this provider's
     * properties. If the default implementation of
     * {@code checkSecurityAccess} is used (that is, that method is not
     * overriden), then this results in a call to the security manager's
     * {@code checkPermission} method with a
     * {@code SecurityPermission("removeProviderProperty."+name)}
     * permission.
     *
     * @param s the Service to be removed
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method denies
     *          access to remove this provider's properties.
     * @throws NullPointerException if s is null
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    private void removePropertyStrings(Service s) {

    /**
     * Remove the string properties for this Service from this Provider's
     * Hashtable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    private void putPropertyStrings(Service s) {

    /**
     * Put the string properties for this Service in this Provider's
     * Hashtable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    protected synchronized void putService(Service s) {

    /**
     * Add a service. If a service of the same type with the same algorithm
     * name exists and it was added using {@link #putService putService()},
     * it is replaced by the new service.
     * This method also places information about this service
     * in the provider's Hashtable values in the format described in the
     * <a href="../../../technotes/guides/security/crypto/CryptoSpec.html">
     * Java Cryptography Architecture API Specification &amp; Reference </a>.
     *
     * <p>Also, if there is a security manager, its
     * {@code checkSecurityAccess} method is called with the string
     * {@code "putProviderProperty."+name}, where {@code name} is
     * the provider name, to see if it's ok to set this provider's property
     * values. If the default implementation of {@code checkSecurityAccess}
     * is used (that is, that method is not overriden), then this results in
     * a call to the security manager's {@code checkPermission} method with
     * a {@code SecurityPermission("putProviderProperty."+name)}
     * permission.
     *
     * @param s the Service to add
     *
     * @throws SecurityException
     *      if a security manager exists and its {@link
     *      java.lang.SecurityManager#checkSecurityAccess} method denies
     *      access to set property values.
     * @throws NullPointerException if s is null
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    public synchronized Set<Service> getServices() {

    /**
     * Get an unmodifiable Set of all services supported by
     * this Provider.
     *
     * @return an unmodifiable Set of all services supported by
     * this Provider
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    public synchronized Service getService(String type, String algorithm) {

    /**
     * Get the service describing this Provider's implementation of the
     * specified type of this algorithm or alias. If no such
     * implementation exists, this method returns null. If there are two
     * matching services, one added to this provider using
     * {@link #putService putService()} and one added via {@link #put put()},
     * the service added via {@link #putService putService()} is returned.
     *
     * @param type the type of {@link Service service} requested
     * (for example, {@code MessageDigest})
     * @param algorithm the case insensitive algorithm name (or alternate
     * alias) of the service requested (for example, {@code SHA-1})
     *
     * @return the service describing this Provider's matching service
     * or null if no such service exists
     *
     * @throws NullPointerException if type or algorithm is null
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    private void removeInvalidServices(Map<ServiceKey,Service> map) {

    /**
     * Remove all invalid services from the Map. Invalid services can only
     * occur if the legacy properties are inconsistent or incomplete.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    private void ensureLegacyParsed() {

    /**
     * Ensure all the legacy String properties are fully parsed into
     * service objects.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    private void implPutAll(Map<?,?> t) {

    /**
     * Copies all of the mappings from the specified Map to this provider.
     * Internal method to be called AFTER the security check has been
     * performed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * If the specified key is not already associated with a value or is
     * associated with null, associates it with the given value. Otherwise,
     * replaces the value with the results of the given remapping function,
     * or removes if the result is null. This method may be of use when
     * combining multiple mapped values for a key.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the strings {@code "putProviderProperty."+name}
     * and {@code "removeProviderProperty."+name}, where {@code name} is the
     * provider name, to see if it's ok to set this provider's property values
     * and remove this provider's properties.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to set property values or remove properties.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * If the value for the specified key is present and non-null, attempts to
     * compute a new mapping given the key and its current mapped value.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the strings {@code "putProviderProperty."+name}
     * and {@code "removeProviderProperty."+name}, where {@code name} is the
     * provider name, to see if it's ok to set this provider's property values
     * and remove this provider's properties.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to set property values or remove properties.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * If the specified key is not already associated with a value (or
     * is mapped to {@code null}), attempts to compute its value using
     * the given mapping function and enters it into this map unless
     * {@code null}.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the strings {@code "putProviderProperty."+name}
     * and {@code "removeProviderProperty."+name}, where {@code name} is the
     * provider name, to see if it's ok to set this provider's property values
     * and remove this provider's properties.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to set property values and remove properties.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Attempts to compute a mapping for the specified key and its
     * current mapped value (or {@code null} if there is no current
     * mapping).
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the strings {@code "putProviderProperty."+name}
     * and {@code "removeProviderProperty."+name}, where {@code name} is the
     * provider name, to see if it's ok to set this provider's property values
     * and remove this provider's properties.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to set property values or remove properties.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Replaces each entry's value with the result of invoking the given
     * function on that entry, in the order entries are returned by an entry
     * set iterator, until all entries have been processed or the function
     * throws an exception.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the string {@code "putProviderProperty."+name},
     * where {@code name} is the provider name, to see if it's ok to set this
     * provider's property values.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to set property values.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Replaces the entry for the specified key only if it is
     * currently mapped to some value.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the string {@code "putProviderProperty."+name},
     * where {@code name} is the provider name, to see if it's ok to set this
     * provider's property values.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to set property values.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Replaces the entry for the specified key only if currently
     * mapped to the specified value.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the string {@code "putProviderProperty."+name},
     * where {@code name} is the provider name, to see if it's ok to set this
     * provider's property values.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to set property values.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Removes the entry for the specified key only if it is currently
     * mapped to the specified value.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the string {@code "removeProviderProperty."+name},
     * where {@code name} is the provider name, to see if it's ok to remove this
     * provider's properties.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to remove this provider's properties.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Removes the {@code key} property (and its corresponding
     * {@code value}).
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the string {@code "removeProviderProperty."+name},
     * where {@code name} is the provider name, to see if it's ok to remove this
     * provider's properties.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to remove this provider's properties.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * If the specified key is not already associated with a value (or is mapped
     * to {@code null}) associates it with the given value and returns
     * {@code null}, else returns the current value.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the string {@code "putProviderProperty."+name},
     * where {@code name} is the provider name, to see if it's ok to set this
     * provider's property values.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to set property values.
     *
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Sets the {@code key} property to have the specified
     * {@code value}.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the string {@code "putProviderProperty."+name},
     * where {@code name} is the provider name, to see if it's ok to set this
     * provider's property values.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to set property values.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Returns an unmodifiable Collection view of the property values
     * contained in this provider.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Returns an unmodifiable Set view of the property keys contained in
     * this provider.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Returns an unmodifiable Set view of the property entries contained
     * in this Provider.
     *
     * @see   java.util.Map.Entry
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Copies all of the mappings from the specified Map to this provider.
     * These mappings will replace any properties that this provider had
     * for any of the keys currently in the specified Map.
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Reads a property list (key and element pairs) from the input stream.
     *
     * @param inStream   the input stream.
     * @exception  IOException  if an error occurred when reading from the
     *               input stream.
     * @see java.util.Properties#load
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    @Override

    /**
     * Clears this provider so that it no longer contains the properties
     * used to look up facilities implemented by the provider.
     *
     * <p>If a security manager is enabled, its {@code checkSecurityAccess}
     * method is called with the string {@code "clearProviderProperties."+name}
     * (where {@code name} is the provider name) to see if it's ok to clear
     * this provider.
     *
     * @throws  SecurityException
     *          if a security manager exists and its {@link
     *          java.lang.SecurityManager#checkSecurityAccess} method
     *          denies access to clear this provider
     *
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    public String toString() {

    /**
     * Returns a string with the name and the version number
     * of this provider.
     *
     * @return the string with the name and the version number
     * for this provider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    public String getInfo() {

    /**
     * Returns a human-readable description of the provider and its
     * services.  This may return an HTML page, with relevant links.
     *
     * @return a description of the provider and its services.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    public double getVersion() {

    /**
     * Returns the version number for this provider.
     *
     * @return the version number for this provider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    public String getName() {

    /**
     * Returns the name of this provider.
     *
     * @return the name of this provider.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    protected Provider(String name, double version, String info) {

    /**
     * Constructs a provider with the specified name, version number,
     * and information.
     *
     * @param name the provider name.
     *
     * @param version the provider version number.
     *
     * @param info a description of the provider and its services.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    private double version;

    /**
     * The provider version number.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    private String info;

    /**
     * A description of the provider and its services.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
    private String name;

    /**
     * The provider name.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Provider.java
public abstract class Provider extends Properties {

/**
 * This class represents a "provider" for the
 * Java Security API, where a provider implements some or all parts of
 * Java Security. Services that a provider may implement include:
 *
 * <ul>
 *
 * <li>Algorithms (such as DSA, RSA, MD5 or SHA-1).
 *
 * <li>Key generation, conversion, and management facilities (such as for
 * algorithm-specific keys).
 *
 *</ul>
 *
 * <p>Each provider has a name and a version number, and is configured
 * in each runtime it is installed in.
 *
 * <p>See <a href =
 * "../../../technotes/guides/security/crypto/CryptoSpec.html#Provider">The Provider Class</a>
 * in the "Java Cryptography Architecture API Specification &amp; Reference"
 * for information about how a particular type of provider, the
 * cryptographic service provider, works and is installed. However,
 * please note that a provider can be used to implement any security
 * service in Java that uses a pluggable architecture with a choice
 * of implementations that fit underneath.
 *
 * <p>Some provider implementations may encounter unrecoverable internal
 * errors during their operation, for example a failure to communicate with a
 * security token. A {@link ProviderException} should be used to indicate
 * such errors.
 *
 * <p>The service type {@code Provider} is reserved for use by the
 * security framework. Services of this type cannot be added, removed,
 * or modified by applications.
 * The following attributes are automatically placed in each Provider object:
 * <table cellspacing=4>
 * <caption><b>Attributes Automatically Placed in a Provider Object</b></caption>
 * <tr><th>Name</th><th>Value</th>
 * <tr><td>{@code Provider.id name}</td>
  *    <td>{@code String.valueOf(provider.getName())}</td>
 * <tr><td>{@code Provider.id version}</td>
 *     <td>{@code String.valueOf(provider.getVersion())}</td>
 * <tr><td>{@code Provider.id info}</td>
       <td>{@code String.valueOf(provider.getInfo())}</td>
 * <tr><td>{@code Provider.id className}</td>
 *     <td>{@code provider.getClass().getName()}</td>
 * </table>
 *
 * @author Benjamin Renaud
 * @author Andreas Sterbenz
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/Provider.java
  public T invoke(T request);

  /** Invokes an operation occording to the contents of the request
   *  message.
   *
   *  @param  request The request message or message payload.
   *  @return The response message or message payload. May be <code>null</code> if
              there is no response.
   *  @throws WebServiceException If there is an error processing request.
   *          The cause of the <code>WebServiceException</code> may be set to a subclass
   *          of <code>ProtocolException</code> to control the protocol level
   *          representation of the exception.
   *  @see javax.xml.ws.handler.MessageContext
   *  @see javax.xml.ws.ProtocolException
  **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/Provider.java
public interface Provider<T> {

/**
 *  <p>Service endpoints may implement the <code>Provider</code>
 *  interface as a dynamic alternative to an SEI.
 *
 *  <p>Implementations are required to support <code>Provider&lt;Source&gt;</code>,
 *  <code>Provider&lt;SOAPMessage&gt;</code> and
 *  <code>Provider&lt;DataSource&gt;</code>, depending on the binding
 *  in use and the service mode.
 *
 *  <p>The <code>ServiceMode</code> annotation can be used to control whether
 *  the <code>Provider</code> instance will receive entire protocol messages
 *  or just message payloads.
 *
 *  @since JAX-WS 2.0
 *
 *  @see javax.xml.transform.Source
 *  @see javax.xml.soap.SOAPMessage
 *  @see javax.xml.ws.ServiceMode
**/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public Endpoint createEndpoint(String bindingId, Class<?> implementorClass,
            Invoker invoker, WebServiceFeature ... features) {

    /**
     * Creates an endpoint object with the provided binding, implementation
     * class, invoker and web service features. Containers typically use
     * this to create Endpoint objects. <code>Provider</code>
     * implementations must override the default implementation.
     *
     * @param bindingId A URI specifying the desired binding (e.g. SOAP/HTTP).
     *        Can be null.
     * @param implementorClass A service implementation class that
     *        MUST be annotated with all the necessary Web service
     *        annotations.
     * @param invoker that does the actual invocation on the service instance.
     * @param features A list of WebServiceFeatures to configure on the
     *        endpoint.  Supported features not in the <code>features
     *        </code> parameter will have their default values.
     * @return The newly created endpoint.
     * @since JAX-WS 2.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public Endpoint createEndpoint(String bindingId, Object implementor,
            WebServiceFeature ... features) {

    /**
     * Creates an endpoint object with the provided binding, implementation
     * object and web service features. <code>Provider</code> implementations
     * must override the default implementation.
     *
     * @param bindingId A URI specifying the desired binding (e.g. SOAP/HTTP)
     * @param implementor A service implementation object to which
     *        incoming requests will be dispatched. The corresponding
     *        class MUST be annotated with all the necessary Web service
     *        annotations.
     * @param features A list of WebServiceFeatures to configure on the
     *        endpoint.  Supported features not in the <code>features
     *        </code> parameter will have their default values.
     * @return The newly created endpoint.
     * @since JAX-WS 2.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public Endpoint createAndPublishEndpoint(String address,
            Object implementor, WebServiceFeature ... features) {

    /**
     * Creates and publishes an endpoint object with the specified
     * address, implementation object and web service features.
     * <code>Provider</code> implementations must override the
     * default implementation.
     *
     * @param address A URI specifying the address and transport/protocol
     *        to use. A http: URI MUST result in the SOAP 1.1/HTTP
     *        binding being used. Implementations may support other
     *        URI schemes.
     * @param implementor A service implementation object to which
     *        incoming requests will be dispatched. The corresponding
     *        class MUST be annotated with all the necessary Web service
     *        annotations.
     * @param features A list of WebServiceFeatures to configure on the
     *        endpoint.  Supported features not in the <code>features
     *        </code> parameter will have their default values.
     * @return The newly created endpoint.
     * @since JAX-WS 2.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public W3CEndpointReference createW3CEndpointReference(String address,
            QName interfaceName, QName serviceName, QName portName,
            List<Element> metadata, String wsdlDocumentLocation, List<Element> referenceParameters,
            List<Element> elements, Map<QName, String> attributes) {

    /**
     * Factory method to create a <code>W3CEndpointReference</code>.
     * Using this method, a <code>W3CEndpointReference</code> instance
     * can be created with extension elements, and attributes.
     * <code>Provider</code> implementations must override the default
     * implementation.
     *
     * <p>
     * This method can be used to create a <code>W3CEndpointReference</code>
     * for any endpoint by specifying the <code>address</code> property along
     * with any other desired properties.  This method
     * can also be used to create a <code>W3CEndpointReference</code> for
     * an endpoint that is published by the same Java EE application.
     * To do so the <code>address</code> property can be provided or this
     * method can automatically determine the <code>address</code> of
     * an endpoint that is published by the same Java EE application and is
     * identified by the <code>serviceName</code> and
     * <code>portName</code> propeties.  If the <code>address</code> is
     * <code>null</code> and the <code>serviceName</code> and
     * <code>portName</code> do not identify an endpoint published by the
     * same Java EE application, a
     * <code>javax.lang.IllegalStateException</code> MUST be thrown.
     *
     * @param address Specifies the address of the target endpoint
     * @param interfaceName the <code>wsam:InterfaceName</code> element in the
     * <code>wsa:Metadata</code> element.
     * @param serviceName Qualified name of the service in the WSDL.
     * @param portName Qualified name of the endpoint in the WSDL.
     * @param metadata A list of elements that should be added to the
     * <code>W3CEndpointReference</code> instances <code>wsa:metadata</code>
     * element.
     * @param wsdlDocumentLocation URL for the WSDL document location for
     * the service.
     * @param referenceParameters Reference parameters to be associated
     * with the returned <code>EndpointReference</code> instance.
     * @param elements extension elements to be associated
     * with the returned <code>EndpointReference</code> instance.
     * @param attributes extension attributes to be associated
     * with the returned <code>EndpointReference</code> instance.
     *
     * @return the <code>W3CEndpointReference</code> created from
     *          <code>serviceName</code>, <code>portName</code>,
     *          <code>metadata</code>, <code>wsdlDocumentLocation</code>
     *          and <code>referenceParameters</code>. This method
     *          never returns <code>null</code>.
     *
     * @throws java.lang.IllegalStateException
     *     <ul>
     *        <li>If the <code>address</code>, <code>serviceName</code> and
     *            <code>portName</code> are all <code>null</code>.
     *        <li>If the <code>serviceName</code> service is <code>null</code> and the
     *            <code>portName</code> is NOT <code>null</code>.
     *        <li>If the <code>address</code> property is <code>null</code> and
     *            the <code>serviceName</code> and <code>portName</code> do not
     *            specify a valid endpoint published by the same Java EE
     *            application.
     *        <li>If the <code>serviceName</code>is NOT <code>null</code>
     *             and is not present in the specified WSDL.
     *        <li>If the <code>portName</code> port is not <code>null</code> and it
     *             is not present in <code>serviceName</code> service in the WSDL.
     *        <li>If the <code>wsdlDocumentLocation</code> is NOT <code>null</code>
     *            and does not represent a valid WSDL.
     *        <li>If the <code>wsdlDocumentLocation</code> is NOT <code>null</code> but
     *            wsdli:wsdlLocation's namespace name cannot be got from the available
     *            metadata.
     *     </ul>
     * @throws WebServiceException If an error occurs while creating the
     *                             <code>W3CEndpointReference</code>.
     * @since JAX-WS 2.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public abstract W3CEndpointReference createW3CEndpointReference(String address, QName serviceName, QName portName,
            List<Element> metadata, String wsdlDocumentLocation, List<Element> referenceParameters);

    /**
     * Factory method to create a <code>W3CEndpointReference</code>.
     *
     * <p>
     * This method can be used to create a <code>W3CEndpointReference</code>
     * for any endpoint by specifying the <code>address</code> property along
     * with any other desired properties.  This method
     * can also be used to create a <code>W3CEndpointReference</code> for
     * an endpoint that is published by the same Java EE application.
     * To do so the <code>address</code> property can be provided or this
     * method can automatically determine the <code>address</code> of
     * an endpoint that is published by the same Java EE application and is
     * identified by the <code>serviceName</code> and
     * <code>portName</code> propeties.  If the <code>address</code> is
     * <code>null</code> and the <code>serviceName</code> and
     * <code>portName</code> do not identify an endpoint published by the
     * same Java EE application, a
     * <code>javax.lang.IllegalStateException</code> MUST be thrown.
     *
     * @param address Specifies the address of the target endpoint
     * @param serviceName Qualified name of the service in the WSDL.
     * @param portName Qualified name of the endpoint in the WSDL.
     * @param metadata A list of elements that should be added to the
     * <code>W3CEndpointReference</code> instances <code>wsa:metadata</code>
     * element.
     * @param wsdlDocumentLocation URL for the WSDL document location for
     * the service.
     * @param referenceParameters Reference parameters to be associated
     * with the returned <code>EndpointReference</code> instance.
     *
     * @return the <code>W3CEndpointReference</code> created from
     *          <code>serviceName</code>, <code>portName</code>,
     *          <code>metadata</code>, <code>wsdlDocumentLocation</code>
     *          and <code>referenceParameters</code>. This method
     *          never returns <code>null</code>.
     *
     * @throws java.lang.IllegalStateException
     *     <ul>
     *        <li>If the <code>address</code>, <code>serviceName</code> and
     *            <code>portName</code> are all <code>null</code>.
     *        <li>If the <code>serviceName</code> service is <code>null</code> and the
     *            <code>portName</code> is NOT <code>null</code>.
     *        <li>If the <code>address</code> property is <code>null</code> and
     *            the <code>serviceName</code> and <code>portName</code> do not
     *            specify a valid endpoint published by the same Java EE
     *            application.
     *        <li>If the <code>serviceName</code>is NOT <code>null</code>
     *             and is not present in the specified WSDL.
     *        <li>If the <code>portName</code> port is not <code>null</code> and it
     *             is not present in <code>serviceName</code> service in the WSDL.
     *        <li>If the <code>wsdlDocumentLocation</code> is NOT <code>null</code>
     *            and does not represent a valid WSDL.
     *     </ul>
     * @throws WebServiceException If an error occurs while creating the
     *                             <code>W3CEndpointReference</code>.
     *
     * @since JAX-WS 2.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public abstract <T> T getPort(EndpointReference endpointReference,
            Class<T> serviceEndpointInterface,
            WebServiceFeature... features);

    /**
     * The getPort method returns a proxy.  If there
     * are any reference parameters in the
     * <code>endpointReference</code>, then those reference
     * parameters MUST appear as SOAP headers, indicating them to be
     * reference parameters, on all messages sent to the endpoint.
     * The parameter  <code>serviceEndpointInterface</code> specifies
     * the service endpoint interface that is supported by the
     * returned proxy.
     * The parameter <code>endpointReference</code> specifies the
     * endpoint that will be invoked by the returned proxy.
     * In the implementation of this method, the JAX-WS
     * runtime system takes the responsibility of selecting a protocol
     * binding (and a port) and configuring the proxy accordingly from
     * the WSDL metadata of the
     * <code>serviceEndpointInterface</code> and the <code>EndpointReference</code>.
     * For this method
     * to successfully return a proxy, WSDL metadata MUST be available and the
     * <code>endpointReference</code> MUST contain an implementation understood
     * <code>serviceName</code> metadata.
     *
     *
     * @param endpointReference the EndpointReference that will
     * be invoked by the returned proxy.
     * @param serviceEndpointInterface Service endpoint interface
     * @param features  A list of WebServiceFeatures to configure on the
     *                proxy.  Supported features not in the <code>features
     *                </code> parameter will have their default values.
     * @return Object Proxy instance that supports the
     *                  specified service endpoint interface
     * @throws WebServiceException
     *                  <UL>
     *                  <LI>If there is an error during creation
     *                      of the proxy
     *                  <LI>If there is any missing WSDL metadata
     *                      as required by this method}
     *                  <LI>If this
     *                      <code>endpointReference</code>
     *                      is illegal
     *                  <LI>If an illegal
     *                      <code>serviceEndpointInterface</code>
     *                      is specified
     *                  <LI>If a feature is enabled that is not compatible with
     *                      this port or is unsupported.
     *                   </UL>
     *
     * @see WebServiceFeature
     *
     * @since JAX-WS 2.1
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public abstract EndpointReference readEndpointReference(javax.xml.transform.Source eprInfoset);

    /**
     * read an EndpointReference from the infoset contained in
     * <code>eprInfoset</code>.
     *
     * @param eprInfoset infoset for EndpointReference
     *
     * @return the <code>EndpointReference</code> unmarshalled from
     * <code>eprInfoset</code>.  This method never returns <code>null</code>.
     *
     * @throws WebServiceException If there is an error creating the
     * <code>EndpointReference</code> from the specified <code>eprInfoset</code>.
     *
     * @throws NullPointerException If the <code>null</code>
     * <code>eprInfoset</code> value is given.
     *
     * @since JAX-WS 2.1
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public abstract Endpoint createAndPublishEndpoint(String address,
            Object implementor);

    /**
     * Creates and publishes an endpoint object with the specified
     * address and implementation object.
     *
     * @param address A URI specifying the address and transport/protocol
     *        to use. A http: URI MUST result in the SOAP 1.1/HTTP
     *        binding being used. Implementations may support other
     *        URI schemes.
     * @param implementor A service implementation object to which
     *        incoming requests will be dispatched. The corresponding
     *        class MUST be annotated with all the necessary Web service
     *        annotations.
     * @return The newly created endpoint.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public abstract Endpoint createEndpoint(String bindingId,
            Object implementor);

    /**
     *
     * Creates an endpoint object with the provided binding and implementation
     * object.
     *
     * @param bindingId A URI specifying the desired binding (e.g. SOAP/HTTP)
     * @param implementor A service implementation object to which
     *        incoming requests will be dispatched. The corresponding
     *        class MUST be annotated with all the necessary Web service
     *        annotations.
     * @return The newly created endpoint.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public ServiceDelegate createServiceDelegate(
            java.net.URL wsdlDocumentLocation,
            QName serviceName, Class<? extends Service> serviceClass, WebServiceFeature ... features) {

    /**
     * Creates a service delegate object.
     * <p>
     * @param wsdlDocumentLocation A URL pointing to the WSDL document
     *        for the service, or <code>null</code> if there isn't one.
     * @param serviceName The qualified name of the service.
     * @param serviceClass The service class, which MUST be either
     *        <code>javax.xml.ws.Service</code> or a subclass thereof.
     * @param features Web Service features that must be configured on
     *        the service. If the provider doesn't understand a feature,
     *        it must throw a WebServiceException.
     * @return The newly created service delegate.
     *
     * @since JAX-WS 2.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public abstract ServiceDelegate createServiceDelegate(
            java.net.URL wsdlDocumentLocation,
            QName serviceName, Class<? extends Service> serviceClass);

    /**
     * Creates a service delegate object.
     * <p>
     * @param wsdlDocumentLocation A URL pointing to the WSDL document
     *        for the service, or <code>null</code> if there isn't one.
     * @param serviceName The qualified name of the service.
     * @param serviceClass The service class, which MUST be either
     *        <code>javax.xml.ws.Service</code> or a subclass thereof.
     * @return The newly created service delegate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    public static Provider provider() {

    /**
     *
     * Creates a new provider object.
     * <p>
     * The algorithm used to locate the provider subclass to use consists
     * of the following steps:
     * <p>
     * <ul>
     * <li>
     *   If a resource with the name of
     *   <code>META-INF/services/javax.xml.ws.spi.Provider</code>
     *   exists, then its first line, if present, is used as the UTF-8 encoded
     *   name of the implementation class.
     * </li>
     * <li>
     *   If the $java.home/lib/jaxws.properties file exists and it is readable by
     *   the <code>java.util.Properties.load(InputStream)</code> method and it contains
     *   an entry whose key is <code>javax.xml.ws.spi.Provider</code>, then the value of
     *   that entry is used as the name of the implementation class.
     * </li>
     * <li>
     *   If a system property with the name <code>javax.xml.ws.spi.Provider</code>
     *   is defined, then its value is used as the name of the implementation class.
     * </li>
     * <li>
     *   Finally, a default implementation class name is used.
     * </li>
     * </ul>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    protected Provider() {

    /**
     * Creates a new instance of Provider
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    static private final Method loadMethod;

    /**
     * Take advantage of Java SE 6's java.util.ServiceLoader API.
     * Using reflection so that there is no compile-time dependency on SE 6.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    // Using two strings so that package renaming doesn't change it

    /**
     * A constant representing the name of the default
     * <code>Provider</code> implementation class.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
    static public final String JAXWSPROVIDER_PROPERTY

    /**
     * A constant representing the property used to lookup the
     * name of a <code>Provider</code> implementation
     * class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/ws/spi/Provider.java
public abstract class Provider {

/**
 * Service provider for <code>ServiceDelegate</code> and
 * <code>Endpoint</code> objects.
 * <p>
 *
 * @since JAX-WS 2.0
 */
