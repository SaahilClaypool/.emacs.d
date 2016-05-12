_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    IndexedPropertyDescriptor(PropertyDescriptor x, PropertyDescriptor y) {

    /**
     * Package-private constructor.
     * Merge two property descriptors.  Where they conflict, give the
     * second argument (y) priority over the first argumnnt (x).
     *
     * @param x  The first (lower priority) PropertyDescriptor
     * @param y  The second (higher priority) PropertyDescriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized Class<?> getIndexedPropertyType() {

    /**
     * Returns the Java type info for the indexed property.
     * Note that the {@code Class} object may describe
     * primitive Java types such as {@code int}.
     * This type is returned by the indexed read method
     * or is used as the parameter type of the indexed write method.
     *
     * @return the {@code Class} object that represents the Java type info,
     *         or {@code null} if the type cannot be determined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized void setIndexedWriteMethod(Method writeMethod)

    /**
     * Sets the method that should be used to write an indexed property value.
     *
     * @param writeMethod The new indexed write method.
     * @throws IntrospectionException if an exception occurs during
     * introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized Method getIndexedWriteMethod() {

    /**
     * Gets the method that should be used to write an indexed property value.
     *
     * @return The method that should be used to write an indexed
     * property value.
     * May return null if the property isn't indexed or is read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized void setIndexedReadMethod(Method readMethod)

    /**
     * Sets the method that should be used to read an indexed property value.
     *
     * @param readMethod The new indexed read method.
     * @throws IntrospectionException if an exception occurs during
     * introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized Method getIndexedReadMethod() {

    /**
     * Gets the method that should be used to read an indexed
     * property value.
     *
     * @return The method that should be used to read an indexed
     * property value.
     * May return null if the property isn't indexed or is write-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    IndexedPropertyDescriptor(Class<?> bean, String base, Method read, Method write, Method readIndexed, Method writeIndexed) throws IntrospectionException {

    /**
     * Creates <code>PropertyDescriptor</code> for the specified bean
     * with the specified name and methods to read/write the property value.
     *
     * @param bean          the type of the target bean
     * @param base          the base name of the property (the rest of the method name)
     * @param read          the method used for reading the property value
     * @param write         the method used for writing the property value
     * @param readIndexed   the method used for reading an indexed property value
     * @param writeIndexed  the method used for writing an indexed property value
     * @exception IntrospectionException if an exception occurs during introspection
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public IndexedPropertyDescriptor(String propertyName, Method readMethod, Method writeMethod,
                                            Method indexedReadMethod, Method indexedWriteMethod)

    /**
     * This constructor takes the name of a simple property, and Method
     * objects for reading and writing the property.
     *
     * @param propertyName The programmatic name of the property.
     * @param readMethod The method used for reading the property values as an array.
     *          May be null if the property is write-only or must be indexed.
     * @param writeMethod The method used for writing the property values as an array.
     *          May be null if the property is read-only or must be indexed.
     * @param indexedReadMethod The method used for reading an indexed property value.
     *          May be null if the property is write-only.
     * @param indexedWriteMethod The method used for writing an indexed property value.
     *          May be null if the property is read-only.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public IndexedPropertyDescriptor(String propertyName, Class<?> beanClass,
                String readMethodName, String writeMethodName,
                String indexedReadMethodName, String indexedWriteMethodName)

    /**
     * This constructor takes the name of a simple property, and method
     * names for reading and writing the property, both indexed
     * and non-indexed.
     *
     * @param propertyName The programmatic name of the property.
     * @param beanClass  The Class object for the target bean.
     * @param readMethodName The name of the method used for reading the property
     *           values as an array.  May be null if the property is write-only
     *           or must be indexed.
     * @param writeMethodName The name of the method used for writing the property
     *           values as an array.  May be null if the property is read-only
     *           or must be indexed.
     * @param indexedReadMethodName The name of the method used for reading
     *          an indexed property value.
     *          May be null if the property is write-only.
     * @param indexedWriteMethodName The name of the method used for writing
     *          an indexed property value.
     *          May be null if the property is read-only.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public IndexedPropertyDescriptor(String propertyName, Class<?> beanClass)

    /**
     * This constructor constructs an IndexedPropertyDescriptor for a property
     * that follows the standard Java conventions by having getFoo and setFoo
     * accessor methods, for both indexed access and array access.
     * <p>
     * Thus if the argument name is "fred", it will assume that there
     * is an indexed reader method "getFred", a non-indexed (array) reader
     * method also called "getFred", an indexed writer method "setFred",
     * and finally a non-indexed writer method "setFred".
     *
     * @param propertyName The programmatic name of the property.
     * @param beanClass The Class object for the target bean.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
public class IndexedPropertyDescriptor extends PropertyDescriptor {

/**
 * An IndexedPropertyDescriptor describes a property that acts like an
 * array and has an indexed read and/or indexed write method to access
 * specific elements of the array.
 * <p>
 * An indexed property may also provide simple non-indexed read and write
 * methods.  If these are present, they read and write arrays of the type
 * returned by the indexed read method.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    IndexedPropertyDescriptor(PropertyDescriptor x, PropertyDescriptor y) {

    /**
     * Package-private constructor.
     * Merge two property descriptors.  Where they conflict, give the
     * second argument (y) priority over the first argumnnt (x).
     *
     * @param x  The first (lower priority) PropertyDescriptor
     * @param y  The second (higher priority) PropertyDescriptor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized Class<?> getIndexedPropertyType() {

    /**
     * Returns the Java type info for the indexed property.
     * Note that the {@code Class} object may describe
     * primitive Java types such as {@code int}.
     * This type is returned by the indexed read method
     * or is used as the parameter type of the indexed write method.
     *
     * @return the {@code Class} object that represents the Java type info,
     *         or {@code null} if the type cannot be determined
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized void setIndexedWriteMethod(Method writeMethod)

    /**
     * Sets the method that should be used to write an indexed property value.
     *
     * @param writeMethod The new indexed write method.
     * @throws IntrospectionException if an exception occurs during
     * introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized Method getIndexedWriteMethod() {

    /**
     * Gets the method that should be used to write an indexed property value.
     *
     * @return The method that should be used to write an indexed
     * property value.
     * May return null if the property isn't indexed or is read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized void setIndexedReadMethod(Method readMethod)

    /**
     * Sets the method that should be used to read an indexed property value.
     *
     * @param readMethod The new indexed read method.
     * @throws IntrospectionException if an exception occurs during
     * introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public synchronized Method getIndexedReadMethod() {

    /**
     * Gets the method that should be used to read an indexed
     * property value.
     *
     * @return The method that should be used to read an indexed
     * property value.
     * May return null if the property isn't indexed or is write-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    IndexedPropertyDescriptor(Class<?> bean, String base, Method read, Method write, Method readIndexed, Method writeIndexed) throws IntrospectionException {

    /**
     * Creates <code>PropertyDescriptor</code> for the specified bean
     * with the specified name and methods to read/write the property value.
     *
     * @param bean          the type of the target bean
     * @param base          the base name of the property (the rest of the method name)
     * @param read          the method used for reading the property value
     * @param write         the method used for writing the property value
     * @param readIndexed   the method used for reading an indexed property value
     * @param writeIndexed  the method used for writing an indexed property value
     * @exception IntrospectionException if an exception occurs during introspection
     *
     * @since 1.7
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public IndexedPropertyDescriptor(String propertyName, Method readMethod, Method writeMethod,
                                            Method indexedReadMethod, Method indexedWriteMethod)

    /**
     * This constructor takes the name of a simple property, and Method
     * objects for reading and writing the property.
     *
     * @param propertyName The programmatic name of the property.
     * @param readMethod The method used for reading the property values as an array.
     *          May be null if the property is write-only or must be indexed.
     * @param writeMethod The method used for writing the property values as an array.
     *          May be null if the property is read-only or must be indexed.
     * @param indexedReadMethod The method used for reading an indexed property value.
     *          May be null if the property is write-only.
     * @param indexedWriteMethod The method used for writing an indexed property value.
     *          May be null if the property is read-only.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public IndexedPropertyDescriptor(String propertyName, Class<?> beanClass,
                String readMethodName, String writeMethodName,
                String indexedReadMethodName, String indexedWriteMethodName)

    /**
     * This constructor takes the name of a simple property, and method
     * names for reading and writing the property, both indexed
     * and non-indexed.
     *
     * @param propertyName The programmatic name of the property.
     * @param beanClass  The Class object for the target bean.
     * @param readMethodName The name of the method used for reading the property
     *           values as an array.  May be null if the property is write-only
     *           or must be indexed.
     * @param writeMethodName The name of the method used for writing the property
     *           values as an array.  May be null if the property is read-only
     *           or must be indexed.
     * @param indexedReadMethodName The name of the method used for reading
     *          an indexed property value.
     *          May be null if the property is write-only.
     * @param indexedWriteMethodName The name of the method used for writing
     *          an indexed property value.
     *          May be null if the property is read-only.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
    public IndexedPropertyDescriptor(String propertyName, Class<?> beanClass)

    /**
     * This constructor constructs an IndexedPropertyDescriptor for a property
     * that follows the standard Java conventions by having getFoo and setFoo
     * accessor methods, for both indexed access and array access.
     * <p>
     * Thus if the argument name is "fred", it will assume that there
     * is an indexed reader method "getFred", a non-indexed (array) reader
     * method also called "getFred", an indexed writer method "setFred",
     * and finally a non-indexed writer method "setFred".
     *
     * @param propertyName The programmatic name of the property.
     * @param beanClass The Class object for the target bean.
     * @exception IntrospectionException if an exception occurs during
     *              introspection.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/IndexedPropertyDescriptor.java
public class IndexedPropertyDescriptor extends PropertyDescriptor {

/**
 * An IndexedPropertyDescriptor describes a property that acts like an
 * array and has an indexed read and/or indexed write method to access
 * specific elements of the array.
 * <p>
 * An indexed property may also provide simple non-indexed read and write
 * methods.  If these are present, they read and write arrays of the type
 * returned by the indexed read method.
 */
