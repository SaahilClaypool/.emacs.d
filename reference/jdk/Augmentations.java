_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public void removeAllItems ();

    /**
     * Remove all objects from the Augmentations structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public Enumeration keys ();

    /**
     * Returns an enumeration of the keys in the Augmentations structure
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public Object removeItem (String key);

    /**
     * Remove additional info from the Augmentations structure
     *
     * @param key    Identifier, can't be <code>null</code>
     * @return the previous value of the specified key in the Augmentations structure,
     *         or <code>null</code> if it did not have one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public Object getItem(String key);

    /**
     * Get information identified by a key from the Augmentations structure
     *
     * @param key    Identifier, can't be <code>null</code>
     *
     * @return the value to which the key is mapped in the Augmentations structure;
     *         <code>null</code> if the key is not mapped to any value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public Object putItem (String key, Object item);

    /**
     * Add additional information identified by a key to the Augmentations structure.
     *
     * @param key    Identifier, can't be <code>null</code>
     * @param item   Additional information
     *
     * @return the previous value of the specified key in the Augmentations structure,
     *         or <code>null</code> if it did not have one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
public interface Augmentations {

/**
 * The Augmentations interface defines a table of additional data that may
 * be passed along the document pipeline. The information can contain extra
 * arguments or infoset augmentations, for example PSVI. This additional
 * information is identified by a String key.
 * <p>
 * <strong>Note:</strong>
 * Methods that receive Augmentations are required to copy the information
 * if it is to be saved for use beyond the scope of the method.
 * The Augmentations content is volatile, and maybe modified by any method in
 * any component in the pipeline. Therefore, methods passed this structure
 * should not save any reference to the structure.
 *
 * @author Elena Litani, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public void removeAllItems ();

    /**
     * Remove all objects from the Augmentations structure.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public Enumeration keys ();

    /**
     * Returns an enumeration of the keys in the Augmentations structure
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public Object removeItem (String key);

    /**
     * Remove additional info from the Augmentations structure
     *
     * @param key    Identifier, can't be <code>null</code>
     * @return the previous value of the specified key in the Augmentations structure,
     *         or <code>null</code> if it did not have one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public Object getItem(String key);

    /**
     * Get information identified by a key from the Augmentations structure
     *
     * @param key    Identifier, can't be <code>null</code>
     *
     * @return the value to which the key is mapped in the Augmentations structure;
     *         <code>null</code> if the key is not mapped to any value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
    public Object putItem (String key, Object item);

    /**
     * Add additional information identified by a key to the Augmentations structure.
     *
     * @param key    Identifier, can't be <code>null</code>
     * @param item   Additional information
     *
     * @return the previous value of the specified key in the Augmentations structure,
     *         or <code>null</code> if it did not have one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/Augmentations.java
public interface Augmentations {

/**
 * The Augmentations interface defines a table of additional data that may
 * be passed along the document pipeline. The information can contain extra
 * arguments or infoset augmentations, for example PSVI. This additional
 * information is identified by a String key.
 * <p>
 * <strong>Note:</strong>
 * Methods that receive Augmentations are required to copy the information
 * if it is to be saved for use beyond the scope of the method.
 * The Augmentations content is volatile, and maybe modified by any method in
 * any component in the pipeline. Therefore, methods passed this structure
 * should not save any reference to the structure.
 *
 * @author Elena Litani, IBM
 */
