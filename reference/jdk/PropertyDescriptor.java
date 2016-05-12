_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public int hashCode() {

    /**
     * Returns a hash code value for the object.
     * See {@link java.lang.Object#hashCode} for a complete description.
     *
     * @return a hash code value for this object.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    private Class<?> findPropertyType(Method readMethod, Method writeMethod)

    /**
     * Returns the property type that corresponds to the read and write method.
     * The type precedence is given to the readMethod.
     *
     * @return the type of the property descriptor or null if both
     *         read and write methods are null.
     * @throws IntrospectionException if the read or write method is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    PropertyDescriptor(PropertyDescriptor x, PropertyDescriptor y) {

    /**
     * Package-private constructor.
     * Merge two property descriptors.  Where they conflict, give the
     * second argument (y) priority over the first argument (x).
     *
     * @param x  The first (lower priority) PropertyDescriptor
     * @param y  The second (higher priority) PropertyDescriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    boolean compareMethods(Method a, Method b) {

    /**
     * Package private helper method for Descriptor .equals methods.
     *
     * @param a first method to compare
     * @param b second method to compare
     * @return boolean to indicate that the methods are equivalent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public boolean equals(Object obj) {

    /**
     * Compares this <code>PropertyDescriptor</code> against the specified object.
     * Returns true if the objects are the same. Two <code>PropertyDescriptor</code>s
     * are the same if the read, write, property types, property editor and
     * flags  are equivalent.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public PropertyEditor createPropertyEditor(Object bean) {

    /**
     * Constructs an instance of a property editor using the current
     * property editor class.
     * <p>
     * If the property editor class has a public constructor that takes an
     * Object argument then it will be invoked using the bean parameter
     * as the argument. Otherwise, the default constructor will be invoked.
     *
     * @param bean the source object
     * @return a property editor instance or null if a property editor has
     *         not been defined or cannot be created
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public Class<?> getPropertyEditorClass() {

    /**
     * Gets any explicit PropertyEditor Class that has been registered
     * for this property.
     *
     * @return Any explicit PropertyEditor Class that has been registered
     *          for this property.  Normally this will return "null",
     *          indicating that no special editor has been registered,
     *          so the PropertyEditorManager should be used to locate
     *          a suitable PropertyEditor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public void setPropertyEditorClass(Class<?> propertyEditorClass) {

    /**
     * Normally PropertyEditors will be found using the PropertyEditorManager.
     * However if for some reason you want to associate a particular
     * PropertyEditor with a given property, then you can do it with
     * this method.
     *
     * @param propertyEditorClass  The Class for the desired PropertyEditor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public void setConstrained(boolean constrained) {

    /**
     * Attempted updates to "Constrained" properties will cause a "VetoableChange"
     * event to get fired when the property is changed.
     *
     * @param constrained True if this is a constrained property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public boolean isConstrained() {

    /**
     * Attempted updates to "Constrained" properties will cause a "VetoableChange"
     * event to get fired when the property is changed.
     *
     * @return True if this is a constrained property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public void setBound(boolean bound) {

    /**
     * Updates to "bound" properties will cause a "PropertyChange" event to
     * get fired when the property is changed.
     *
     * @param bound True if this is a bound property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public boolean isBound() {

    /**
     * Updates to "bound" properties will cause a "PropertyChange" event to
     * get fired when the property is changed.
     *
     * @return True if this is a bound property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    void setClass0(Class<?> clz) {

    /**
     * Overridden to ensure that a super class doesn't take precedent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized void setWriteMethod(Method writeMethod)

    /**
     * Sets the method that should be used to write the property value.
     *
     * @param writeMethod The new write method.
     * @throws IntrospectionException if the write method is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized Method getWriteMethod() {

    /**
     * Gets the method that should be used to write the property value.
     *
     * @return The method that should be used to write the property value.
     * May return null if the property can't be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized void setReadMethod(Method readMethod)

    /**
     * Sets the method that should be used to read the property value.
     *
     * @param readMethod The new read method.
     * @throws IntrospectionException if the read method is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized Method getReadMethod() {

    /**
     * Gets the method that should be used to read the property value.
     *
     * @return The method that should be used to read the property value.
     * May return null if the property can't be read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized Class<?> getPropertyType() {

    /**
     * Returns the Java type info for the property.
     * Note that the {@code Class} object may describe
     * primitive Java types such as {@code int}.
     * This type is returned by the read method
     * or is used as the parameter type of the write method.
     * Returns {@code null} if the type is an indexed property
     * that does not support non-indexed access.
     *
     * @return the {@code Class} object that represents the Java type info,
     *         or {@code null} if the type cannot be determined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    PropertyDescriptor(Class<?> bean, String base, Method read, Method write) throws IntrospectionException {

    /**
     * Creates <code>PropertyDescriptor</code> for the specified bean
     * with the specified name and methods to read/write the property value.
     *
     * @param bean   the type of the target bean
     * @param base   the base name of the property (the rest of the method name)
     * @param read   the method used for reading the property value
     * @param write  the method used for writing the property value
     * @exception IntrospectionException if an exception occurs during introspection
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public PropertyDescriptor(String propertyName, Method readMethod, Method writeMethod)

    /**
     * This constructor takes the name of a simple property, and Method
     * objects for reading and writing the property.
     *
     * @param propertyName The programmatic name of the property.
     * @param readMethod The method used for reading the property value.
     *          May be null if the property is write-only.
     * @param writeMethod The method used for writing the property value.
     *          May be null if the property is read-only.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public PropertyDescriptor(String propertyName, Class<?> beanClass,
                String readMethodName, String writeMethodName)

    /**
     * This constructor takes the name of a simple property, and method
     * names for reading and writing the property.
     *
     * @param propertyName The programmatic name of the property.
     * @param beanClass The Class object for the target bean.  For
     *          example sun.beans.OurButton.class.
     * @param readMethodName The name of the method used for reading the property
     *           value.  May be null if the property is write-only.
     * @param writeMethodName The name of the method used for writing the property
     *           value.  May be null if the property is read-only.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public PropertyDescriptor(String propertyName, Class<?> beanClass)

    /**
     * Constructs a PropertyDescriptor for a property that follows
     * the standard Java convention by having getFoo and setFoo
     * accessor methods.  Thus if the argument name is "fred", it will
     * assume that the writer method is "setFred" and the reader method
     * is "getFred" (or "isFred" for a boolean property).  Note that the
     * property name should start with a lower case character, which will
     * be capitalized in the method names.
     *
     * @param propertyName The programmatic name of the property.
     * @param beanClass The Class object for the target bean.  For
     *          example sun.beans.OurButton.class.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
public class PropertyDescriptor extends FeatureDescriptor {

/**
 * A PropertyDescriptor describes one property that a Java Bean
 * exports via a pair of accessor methods.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public int hashCode() {

    /**
     * Returns a hash code value for the object.
     * See {@link java.lang.Object#hashCode} for a complete description.
     *
     * @return a hash code value for this object.
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    private Class<?> findPropertyType(Method readMethod, Method writeMethod)

    /**
     * Returns the property type that corresponds to the read and write method.
     * The type precedence is given to the readMethod.
     *
     * @return the type of the property descriptor or null if both
     *         read and write methods are null.
     * @throws IntrospectionException if the read or write method is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    PropertyDescriptor(PropertyDescriptor x, PropertyDescriptor y) {

    /**
     * Package-private constructor.
     * Merge two property descriptors.  Where they conflict, give the
     * second argument (y) priority over the first argument (x).
     *
     * @param x  The first (lower priority) PropertyDescriptor
     * @param y  The second (higher priority) PropertyDescriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    boolean compareMethods(Method a, Method b) {

    /**
     * Package private helper method for Descriptor .equals methods.
     *
     * @param a first method to compare
     * @param b second method to compare
     * @return boolean to indicate that the methods are equivalent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public boolean equals(Object obj) {

    /**
     * Compares this <code>PropertyDescriptor</code> against the specified object.
     * Returns true if the objects are the same. Two <code>PropertyDescriptor</code>s
     * are the same if the read, write, property types, property editor and
     * flags  are equivalent.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public PropertyEditor createPropertyEditor(Object bean) {

    /**
     * Constructs an instance of a property editor using the current
     * property editor class.
     * <p>
     * If the property editor class has a public constructor that takes an
     * Object argument then it will be invoked using the bean parameter
     * as the argument. Otherwise, the default constructor will be invoked.
     *
     * @param bean the source object
     * @return a property editor instance or null if a property editor has
     *         not been defined or cannot be created
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public Class<?> getPropertyEditorClass() {

    /**
     * Gets any explicit PropertyEditor Class that has been registered
     * for this property.
     *
     * @return Any explicit PropertyEditor Class that has been registered
     *          for this property.  Normally this will return "null",
     *          indicating that no special editor has been registered,
     *          so the PropertyEditorManager should be used to locate
     *          a suitable PropertyEditor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public void setPropertyEditorClass(Class<?> propertyEditorClass) {

    /**
     * Normally PropertyEditors will be found using the PropertyEditorManager.
     * However if for some reason you want to associate a particular
     * PropertyEditor with a given property, then you can do it with
     * this method.
     *
     * @param propertyEditorClass  The Class for the desired PropertyEditor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public void setConstrained(boolean constrained) {

    /**
     * Attempted updates to "Constrained" properties will cause a "VetoableChange"
     * event to get fired when the property is changed.
     *
     * @param constrained True if this is a constrained property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public boolean isConstrained() {

    /**
     * Attempted updates to "Constrained" properties will cause a "VetoableChange"
     * event to get fired when the property is changed.
     *
     * @return True if this is a constrained property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public void setBound(boolean bound) {

    /**
     * Updates to "bound" properties will cause a "PropertyChange" event to
     * get fired when the property is changed.
     *
     * @param bound True if this is a bound property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public boolean isBound() {

    /**
     * Updates to "bound" properties will cause a "PropertyChange" event to
     * get fired when the property is changed.
     *
     * @return True if this is a bound property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    void setClass0(Class<?> clz) {

    /**
     * Overridden to ensure that a super class doesn't take precedent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized void setWriteMethod(Method writeMethod)

    /**
     * Sets the method that should be used to write the property value.
     *
     * @param writeMethod The new write method.
     * @throws IntrospectionException if the write method is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized Method getWriteMethod() {

    /**
     * Gets the method that should be used to write the property value.
     *
     * @return The method that should be used to write the property value.
     * May return null if the property can't be written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized void setReadMethod(Method readMethod)

    /**
     * Sets the method that should be used to read the property value.
     *
     * @param readMethod The new read method.
     * @throws IntrospectionException if the read method is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized Method getReadMethod() {

    /**
     * Gets the method that should be used to read the property value.
     *
     * @return The method that should be used to read the property value.
     * May return null if the property can't be read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public synchronized Class<?> getPropertyType() {

    /**
     * Returns the Java type info for the property.
     * Note that the {@code Class} object may describe
     * primitive Java types such as {@code int}.
     * This type is returned by the read method
     * or is used as the parameter type of the write method.
     * Returns {@code null} if the type is an indexed property
     * that does not support non-indexed access.
     *
     * @return the {@code Class} object that represents the Java type info,
     *         or {@code null} if the type cannot be determined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    PropertyDescriptor(Class<?> bean, String base, Method read, Method write) throws IntrospectionException {

    /**
     * Creates <code>PropertyDescriptor</code> for the specified bean
     * with the specified name and methods to read/write the property value.
     *
     * @param bean   the type of the target bean
     * @param base   the base name of the property (the rest of the method name)
     * @param read   the method used for reading the property value
     * @param write  the method used for writing the property value
     * @exception IntrospectionException if an exception occurs during introspection
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public PropertyDescriptor(String propertyName, Method readMethod, Method writeMethod)

    /**
     * This constructor takes the name of a simple property, and Method
     * objects for reading and writing the property.
     *
     * @param propertyName The programmatic name of the property.
     * @param readMethod The method used for reading the property value.
     *          May be null if the property is write-only.
     * @param writeMethod The method used for writing the property value.
     *          May be null if the property is read-only.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public PropertyDescriptor(String propertyName, Class<?> beanClass,
                String readMethodName, String writeMethodName)

    /**
     * This constructor takes the name of a simple property, and method
     * names for reading and writing the property.
     *
     * @param propertyName The programmatic name of the property.
     * @param beanClass The Class object for the target bean.  For
     *          example sun.beans.OurButton.class.
     * @param readMethodName The name of the method used for reading the property
     *           value.  May be null if the property is write-only.
     * @param writeMethodName The name of the method used for writing the property
     *           value.  May be null if the property is read-only.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
    public PropertyDescriptor(String propertyName, Class<?> beanClass)

    /**
     * Constructs a PropertyDescriptor for a property that follows
     * the standard Java convention by having getFoo and setFoo
     * accessor methods.  Thus if the argument name is "fred", it will
     * assume that the writer method is "setFred" and the reader method
     * is "getFred" (or "isFred" for a boolean property).  Note that the
     * property name should start with a lower case character, which will
     * be capitalized in the method names.
     *
     * @param propertyName The programmatic name of the property.
     * @param beanClass The Class object for the target bean.  For
     *          example sun.beans.OurButton.class.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/PropertyDescriptor.java
public class PropertyDescriptor extends FeatureDescriptor {

/**
 * A PropertyDescriptor describes one property that a Java Bean
 * exports via a pair of accessor methods.
 */
