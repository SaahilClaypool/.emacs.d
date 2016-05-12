_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public String toString() {

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    static Class<?>[] getParameterTypes(Class<?> base, Method method) {

    /**
     * Resolves the parameter types of the method.
     *
     * @param base    the class that contains the method in the hierarchy
     * @param method  the object that represents the method
     * @return an array of classes identifying the parameter types of the method
     *
     * @see Method#getGenericParameterTypes
     * @see Method#getParameterTypes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    static Class<?> getReturnType(Class<?> base, Method method) {

    /**
     * Resolves the return type of the method.
     *
     * @param base    the class that contains the method in the hierarchy
     * @param method  the object that represents the method
     * @return a class identifying the return type of the method
     *
     * @see Method#getGenericReturnType
     * @see Method#getReturnType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    static <T> Reference<T> getWeakReference(T object) {

    /**
     * Creates a new weak reference that refers to the given object.
     *
     * @return a new weak reference or <code>null</code> if object is <code>null</code>
     *
     * @see WeakReference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    static <T> Reference<T> getSoftReference(T object) {

    /**
     * Creates a new soft reference that refers to the given object.
     *
     * @return a new soft reference or <code>null</code> if object is <code>null</code>
     *
     * @see SoftReference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    boolean isTransient() {

    /**
     * Indicates whether the feature is transient.
     *
     * @return {@code true} if the feature is transient,
     *         {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    void setTransient(Transient annotation) {

    /**
     * Sets the "transient" attribute according to the annotation.
     * If the "transient" attribute is already set
     * it should not be changed.
     *
     * @param annotation  the annotation of the element of the feature
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    private Hashtable<String, Object> getTable() {

    /**
     * Returns the initialized attribute table.
     *
     * @return the initialized attribute table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    private void addTable(Hashtable<String, Object> table) {

    /**
     * Copies all values from the specified attribute table.
     * If some attribute is exist its value should be overridden.
     *
     * @param table  the attribute table with new values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    FeatureDescriptor(FeatureDescriptor x, FeatureDescriptor y) {

    /**
     * Package-private constructor,
     * Merge information from two FeatureDescriptors.
     * The merged hidden and expert flags are formed by or-ing the values.
     * In the event of other conflicts, the second argument (y) is
     * given priority over the first argument (x).
     *
     * @param x  The first (lower priority) MethodDescriptor
     * @param y  The second (higher priority) MethodDescriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public Enumeration<String> attributeNames() {

    /**
     * Gets an enumeration of the locale-independent names of this
     * feature.
     *
     * @return  An enumeration of the locale-independent names of any
     *    attributes that have been registered with setValue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public Object getValue(String attributeName) {

    /**
     * Retrieve a named attribute with this feature.
     *
     * @param attributeName  The locale-independent name of the attribute
     * @return  The value of the attribute.  May be null if
     *     the attribute is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setValue(String attributeName, Object value) {

    /**
     * Associate a named attribute with this feature.
     *
     * @param attributeName  The locale-independent name of the attribute
     * @param value  The value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setShortDescription(String text) {

    /**
     * You can associate a short descriptive string with a feature.  Normally
     * these descriptive strings should be less than about 40 characters.
     * @param text  A (localized) short description to be associated with
     * this property/method/event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public String getShortDescription() {

    /**
     * Gets the short description of this feature.
     *
     * @return  A localized short description associated with this
     *   property/method/event.  This defaults to be the display name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setPreferred(boolean preferred) {

    /**
     * The "preferred" flag is used to identify features that are particularly
     * important for presenting to humans.
     *
     * @param preferred  True if this feature should be preferentially shown
     *                   to human users.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public boolean isPreferred() {

    /**
     * The "preferred" flag is used to identify features that are particularly
     * important for presenting to humans.
     *
     * @return True if this feature should be preferentially shown to human users.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setHidden(boolean hidden) {

    /**
     * The "hidden" flag is used to identify features that are intended only
     * for tool use, and which should not be exposed to humans.
     *
     * @param hidden  True if this feature should be hidden from human users.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public boolean isHidden() {

    /**
     * The "hidden" flag is used to identify features that are intended only
     * for tool use, and which should not be exposed to humans.
     *
     * @return True if this feature should be hidden from human users.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setExpert(boolean expert) {

    /**
     * The "expert" flag is used to distinguish between features that are
     * intended for expert users from those that are intended for normal users.
     *
     * @param expert True if this feature is intended for use by experts only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public boolean isExpert() {

    /**
     * The "expert" flag is used to distinguish between those features that are
     * intended for expert users from those that are intended for normal users.
     *
     * @return True if this feature is intended for use by experts only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setDisplayName(String displayName) {

    /**
     * Sets the localized display name of this feature.
     *
     * @param displayName  The localized display name for the
     *          property/method/event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public String getDisplayName() {

    /**
     * Gets the localized display name of this feature.
     *
     * @return The localized display name for the property/method/event.
     *  This defaults to the same as its programmatic name from getName.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setName(String name) {

    /**
     * Sets the programmatic name of this feature.
     *
     * @param name  The programmatic name of the property/method/event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public String getName() {

    /**
     * Gets the programmatic name of this feature.
     *
     * @return The programmatic name of the property/method/event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public FeatureDescriptor() {

    /**
     * Constructs a <code>FeatureDescriptor</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
public class FeatureDescriptor {

/**
 * The FeatureDescriptor class is the common baseclass for PropertyDescriptor,
 * EventSetDescriptor, and MethodDescriptor, etc.
 * <p>
 * It supports some common information that can be set and retrieved for
 * any of the introspection descriptors.
 * <p>
 * In addition it provides an extension mechanism so that arbitrary
 * attribute/value pairs can be associated with a design feature.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public String toString() {

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    static Class<?>[] getParameterTypes(Class<?> base, Method method) {

    /**
     * Resolves the parameter types of the method.
     *
     * @param base    the class that contains the method in the hierarchy
     * @param method  the object that represents the method
     * @return an array of classes identifying the parameter types of the method
     *
     * @see Method#getGenericParameterTypes
     * @see Method#getParameterTypes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    static Class<?> getReturnType(Class<?> base, Method method) {

    /**
     * Resolves the return type of the method.
     *
     * @param base    the class that contains the method in the hierarchy
     * @param method  the object that represents the method
     * @return a class identifying the return type of the method
     *
     * @see Method#getGenericReturnType
     * @see Method#getReturnType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    static <T> Reference<T> getWeakReference(T object) {

    /**
     * Creates a new weak reference that refers to the given object.
     *
     * @return a new weak reference or <code>null</code> if object is <code>null</code>
     *
     * @see WeakReference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    static <T> Reference<T> getSoftReference(T object) {

    /**
     * Creates a new soft reference that refers to the given object.
     *
     * @return a new soft reference or <code>null</code> if object is <code>null</code>
     *
     * @see SoftReference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    boolean isTransient() {

    /**
     * Indicates whether the feature is transient.
     *
     * @return {@code true} if the feature is transient,
     *         {@code false} otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    void setTransient(Transient annotation) {

    /**
     * Sets the "transient" attribute according to the annotation.
     * If the "transient" attribute is already set
     * it should not be changed.
     *
     * @param annotation  the annotation of the element of the feature
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    private Hashtable<String, Object> getTable() {

    /**
     * Returns the initialized attribute table.
     *
     * @return the initialized attribute table
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    private void addTable(Hashtable<String, Object> table) {

    /**
     * Copies all values from the specified attribute table.
     * If some attribute is exist its value should be overridden.
     *
     * @param table  the attribute table with new values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    FeatureDescriptor(FeatureDescriptor x, FeatureDescriptor y) {

    /**
     * Package-private constructor,
     * Merge information from two FeatureDescriptors.
     * The merged hidden and expert flags are formed by or-ing the values.
     * In the event of other conflicts, the second argument (y) is
     * given priority over the first argument (x).
     *
     * @param x  The first (lower priority) MethodDescriptor
     * @param y  The second (higher priority) MethodDescriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public Enumeration<String> attributeNames() {

    /**
     * Gets an enumeration of the locale-independent names of this
     * feature.
     *
     * @return  An enumeration of the locale-independent names of any
     *    attributes that have been registered with setValue.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public Object getValue(String attributeName) {

    /**
     * Retrieve a named attribute with this feature.
     *
     * @param attributeName  The locale-independent name of the attribute
     * @return  The value of the attribute.  May be null if
     *     the attribute is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setValue(String attributeName, Object value) {

    /**
     * Associate a named attribute with this feature.
     *
     * @param attributeName  The locale-independent name of the attribute
     * @param value  The value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setShortDescription(String text) {

    /**
     * You can associate a short descriptive string with a feature.  Normally
     * these descriptive strings should be less than about 40 characters.
     * @param text  A (localized) short description to be associated with
     * this property/method/event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public String getShortDescription() {

    /**
     * Gets the short description of this feature.
     *
     * @return  A localized short description associated with this
     *   property/method/event.  This defaults to be the display name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setPreferred(boolean preferred) {

    /**
     * The "preferred" flag is used to identify features that are particularly
     * important for presenting to humans.
     *
     * @param preferred  True if this feature should be preferentially shown
     *                   to human users.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public boolean isPreferred() {

    /**
     * The "preferred" flag is used to identify features that are particularly
     * important for presenting to humans.
     *
     * @return True if this feature should be preferentially shown to human users.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setHidden(boolean hidden) {

    /**
     * The "hidden" flag is used to identify features that are intended only
     * for tool use, and which should not be exposed to humans.
     *
     * @param hidden  True if this feature should be hidden from human users.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public boolean isHidden() {

    /**
     * The "hidden" flag is used to identify features that are intended only
     * for tool use, and which should not be exposed to humans.
     *
     * @return True if this feature should be hidden from human users.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setExpert(boolean expert) {

    /**
     * The "expert" flag is used to distinguish between features that are
     * intended for expert users from those that are intended for normal users.
     *
     * @param expert True if this feature is intended for use by experts only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public boolean isExpert() {

    /**
     * The "expert" flag is used to distinguish between those features that are
     * intended for expert users from those that are intended for normal users.
     *
     * @return True if this feature is intended for use by experts only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setDisplayName(String displayName) {

    /**
     * Sets the localized display name of this feature.
     *
     * @param displayName  The localized display name for the
     *          property/method/event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public String getDisplayName() {

    /**
     * Gets the localized display name of this feature.
     *
     * @return The localized display name for the property/method/event.
     *  This defaults to the same as its programmatic name from getName.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public void setName(String name) {

    /**
     * Sets the programmatic name of this feature.
     *
     * @param name  The programmatic name of the property/method/event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public String getName() {

    /**
     * Gets the programmatic name of this feature.
     *
     * @return The programmatic name of the property/method/event
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
    public FeatureDescriptor() {

    /**
     * Constructs a <code>FeatureDescriptor</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/FeatureDescriptor.java
public class FeatureDescriptor {

/**
 * The FeatureDescriptor class is the common baseclass for PropertyDescriptor,
 * EventSetDescriptor, and MethodDescriptor, etc.
 * <p>
 * It supports some common information that can be set and retrieved for
 * any of the introspection descriptors.
 * <p>
 * In addition it provides an extension mechanism so that arbitrary
 * attribute/value pairs can be associated with a design feature.
 */
