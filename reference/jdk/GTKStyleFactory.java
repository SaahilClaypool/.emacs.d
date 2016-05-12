_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyleFactory.java
    private static class ComplexKey {

    /**
     * Represents a hash key used for fetching GTKStyle objects from the
     * cache.  In most cases only the WidgetType is used for lookup, but
     * in some complex cases, other Object arguments can be specified
     * via a ComplexKey to differentiate the various styles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyleFactory.java
    public synchronized SynthStyle getStyle(JComponent c, Region id) {

    /**
     * Returns the <code>GTKStyle</code> to use based on the
     * <code>Region</code> id
     *
     * @param c this parameter isn't used, may be null.
     * @param id of the region to get the style.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyleFactory.java
    private final Map<Object, GTKStyle> stylesCache;

    /**
     * Saves all styles that have been accessed.  In most common cases,
     * the hash key is simply the WidgetType, but in more complex cases
     * it will be a ComplexKey object that contains arguments to help
     * differentiate similar styles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyleFactory.java
class GTKStyleFactory extends SynthStyleFactory {

/**
 *
 * @author Scott Violet
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyleFactory.java
    private static class ComplexKey {

    /**
     * Represents a hash key used for fetching GTKStyle objects from the
     * cache.  In most cases only the WidgetType is used for lookup, but
     * in some complex cases, other Object arguments can be specified
     * via a ComplexKey to differentiate the various styles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyleFactory.java
    public synchronized SynthStyle getStyle(JComponent c, Region id) {

    /**
     * Returns the <code>GTKStyle</code> to use based on the
     * <code>Region</code> id
     *
     * @param c this parameter isn't used, may be null.
     * @param id of the region to get the style.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyleFactory.java
    private final Map<Object, GTKStyle> stylesCache;

    /**
     * Saves all styles that have been accessed.  In most common cases,
     * the hash key is simply the WidgetType, but in more complex cases
     * it will be a ComplexKey object that contains arguments to help
     * differentiate similar styles.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/plaf/gtk/GTKStyleFactory.java
class GTKStyleFactory extends SynthStyleFactory {

/**
 *
 * @author Scott Violet
 */
