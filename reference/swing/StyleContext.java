_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        private transient AttributeSet attributes;

        /**
         * Inner AttributeSet implementation, which may be an
         * immutable unique set being shared.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        protected transient ChangeEvent changeEvent = null;

        /**
         * Only one ChangeEvent is needed per model instance since the
         * event's only (read-only) state is the source property.  The source
         * of events generated here is always "this".
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        protected EventListenerList listenerList = new EventListenerList();

        /**
         * The change listeners for the model.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void setResolveParent(AttributeSet parent) {

        /**
         * Sets the resolving parent.
         *
         * @param parent the parent, null if none
         * @see MutableAttributeSet#setResolveParent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void removeAttributes(AttributeSet attrs) {

        /**
         * Removes a set of attributes for the element.
         *
         * @param attrs the attributes
         * @see MutableAttributeSet#removeAttributes
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void removeAttributes(Enumeration<?> names) {

        /**
         * Removes a set of attributes for the element.
         *
         * @param names the attribute names
         * @see MutableAttributeSet#removeAttributes
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void removeAttribute(Object name) {

        /**
         * Removes an attribute from the set.
         *
         * @param name the non-null attribute name
         * @see MutableAttributeSet#removeAttribute
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void addAttributes(AttributeSet attr) {

        /**
         * Adds a set of attributes to the element.
         *
         * @param attr the attributes to add
         * @see MutableAttributeSet#addAttribute
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void addAttribute(Object name, Object value) {

        /**
         * Adds an attribute.
         *
         * @param name the non-null attribute name
         * @param value the attribute value
         * @see MutableAttributeSet#addAttribute
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public AttributeSet getResolveParent() {

        /**
         * Gets attributes from the parent.
         * If not overriden, the resolving parent defaults to
         * the parent element.
         *
         * @return the attributes from the parent
         * @see AttributeSet#getResolveParent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean containsAttributes(AttributeSet attrs) {

        /**
         * Checks whether the element contains all the attributes.
         *
         * @param attrs the attributes to check
         * @return true if the element contains all the attributes
         * @see AttributeSet#containsAttributes
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean containsAttribute(Object name, Object value) {

        /**
         * Checks whether a given attribute name/value is defined.
         *
         * @param name the non-null attribute name
         * @param value the attribute value
         * @return true if the name/value is defined
         * @see AttributeSet#containsAttribute
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public Enumeration<?> getAttributeNames() {

        /**
         * Gets the names of all attributes.
         *
         * @return the attribute names as an enumeration
         * @see AttributeSet#getAttributeNames
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public Object getAttribute(Object attrName) {

        /**
         * Gets the value of an attribute.
         *
         * @param attrName the non-null attribute name
         * @return the attribute value
         * @see AttributeSet#getAttribute
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public AttributeSet copyAttributes() {

        /**
         * Copies a set of attributes.
         *
         * @return the copy
         * @see AttributeSet#copyAttributes
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean isEqual(AttributeSet attr) {

        /**
         * Checks whether two attribute sets are equal.
         *
         * @param attr the attribute set to check against
         * @return true if the same
         * @see AttributeSet#isEqual
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean isDefined(Object attrName) {

        /**
         * Checks whether a given attribute is defined.
         *
         * @param attrName the non-null attribute name
         * @return true if the attribute is defined
         * @see AttributeSet#isDefined
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public int getAttributeCount() {

        /**
         * Gets the number of attributes that are defined.
         *
         * @return the number of attributes &gt;= 0
         * @see AttributeSet#getAttributeCount
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

        /**
         * Return an array of all the listeners of the given type that
         * were added to this model.
         *
         * @return all of the objects receiving <em>listenerType</em> notifications
         *          from this model
         *
         * @since 1.3
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        protected void fireStateChanged() {

        /**
         * Notifies all listeners that have registered interest for
         * notification on this event type.  The event instance
         * is lazily created using the parameters passed into
         * the fire method.
         *
         * @see EventListenerList
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public ChangeListener[] getChangeListeners() {

        /**
         * Returns an array of all the <code>ChangeListener</code>s added
         * to this NamedStyle with addChangeListener().
         *
         * @return all of the <code>ChangeListener</code>s added or an empty
         *         array if no listeners have been added
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void removeChangeListener(ChangeListener l) {

        /**
         * Removes a change listener.
         *
         * @param l the change listener
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void addChangeListener(ChangeListener l) {

        /**
         * Adds a change listener.
         *
         * @param l the change listener
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void setName(String name) {

        /**
         * Changes the name of the style.  Does nothing with a null name.
         *
         * @param name the new name
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public String getName() {

        /**
         * Fetches the name of the style.   A style is not required to be named,
         * so null is returned if there is no name associated with the style.
         *
         * @return the name
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public String toString() {

        /**
         * Converts the style to a string.
         *
         * @return the string
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public NamedStyle() {

        /**
         * Creates a new named style, with a null name and parent.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public NamedStyle(Style parent) {

        /**
         * Creates a new named style.
         *
         * @param parent the parent style, null if none
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public NamedStyle(String name, Style parent) {

        /**
         * Creates a new named style.
         *
         * @param name the style name, null for unnamed
         * @param parent the parent style, null if none
         * @since 1.4
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public class NamedStyle implements Style, Serializable {

    /**
     * A collection of attributes, typically used to represent
     * character and paragraph styles.  This is an implementation
     * of MutableAttributeSet that can be observed if desired.
     * These styles will take advantage of immutability while
     * the sets are small enough, and may be substantially more
     * efficient than something like SimpleAttributeSet.
     * <p>
     * <strong>Warning:</strong>
     * Serialized objects of this class will not be compatible with
     * future Swing releases. The current serialization support is
     * appropriate for short term storage or RMI between applications running
     * the same version of Swing.  As of 1.4, support for long term storage
     * of all JavaBeans&trade;
     * has been added to the <code>java.beans</code> package.
     * Please see {@link java.beans.XMLEncoder}.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean equals(Object obj) {

        /**
         * Compares this object to the specified object.
         * The result is <code>true</code> if and only if the argument is not
         * <code>null</code> and is a <code>Font</code> object with the same
         * name, style, and point size as this font.
         * @param     obj   the object to compare this font with.
         * @return    <code>true</code> if the objects are equal;
         *            <code>false</code> otherwise.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public int hashCode() {

        /**
         * Returns a hashcode for this font.
         * @return     a hashcode value for this font.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public FontKey(String family, int style, int size) {

        /**
         * Constructs a font key.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    static class FontKey {

    /**
     * key for a font table
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void removeAttributes(AttributeSet attr) {

        /**
         * Removes the set of matching attributes from the set.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void removeAttributes(Enumeration names) {

        /**
         * Removes the set of keys from the set.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void removeAttribute(Object key) {

        /**
         * Removes the given name from the set.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void addAttributes(AttributeSet attr) {

        /**
         * Adds a set of key/value pairs to the set.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public void addAttribute(Object key, Object value) {

        /**
         * Adds a key/value to the set.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        int getCount() {

        /**
         * The number of key/value pairs contained
         * in the current key being forged.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public Object[] createTable() {

        /**
         * Creates a table of sorted key/value entries
         * suitable for creation of an instance of
         * SmallAttributeSet.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        private void initialize(Object[] sorted) {

        /**
         * Initialize with a set of already sorted
         * keys (data from an existing SmallAttributeSet).
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    class KeyBuilder {

    /**
     * Sorts the key strings so that they can be very quickly compared
     * in the attribute set searches.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public Object nextElement() {

        /**
         * Returns the next element of this enumeration.
         *
         * @return     the next element of this enumeration.
         * @exception  NoSuchElementException  if no more elements exist.
         * @since      JDK1.0
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean hasMoreElements() {

        /**
         * Tests if this enumeration contains more elements.
         *
         * @return  <code>true</code> if this enumeration contains more elements;
         *          <code>false</code> otherwise.
         * @since   JDK1.0
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    class KeyEnumeration implements Enumeration<Object> {

    /**
     * An enumeration of the keys in a SmallAttributeSet.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public AttributeSet getResolveParent() {

        /**
         * If not overriden, the resolving parent defaults to
         * the parent element.
         *
         * @return the attributes from the parent
         * @see AttributeSet#getResolveParent
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean containsAttributes(AttributeSet attrs) {

        /**
         * Checks whether the attribute set contains all of
         * the given attributes.
         *
         * @param attrs the attributes to check
         * @return true if the element contains all the attributes
         * @see AttributeSet#containsAttributes
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean containsAttribute(Object name, Object value) {

        /**
         * Checks whether a given attribute name/value is defined.
         *
         * @param name the attribute name
         * @param value the attribute value
         * @return true if the name/value is defined
         * @see AttributeSet#containsAttribute
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public Enumeration<?> getAttributeNames() {

        /**
         * Gets the names of all attributes.
         *
         * @return the attribute names
         * @see AttributeSet#getAttributeNames
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public Object getAttribute(Object key) {

        /**
         * Gets the value of an attribute.
         *
         * @param key the attribute name
         * @return the attribute value
         * @see AttributeSet#getAttribute
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public AttributeSet copyAttributes() {

        /**
         * Copies a set of attributes.
         *
         * @return the copy
         * @see AttributeSet#copyAttributes
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean isEqual(AttributeSet attr) {

        /**
         * Checks whether two attribute sets are equal.
         *
         * @param attr the attribute set to check against
         * @return true if the same
         * @see AttributeSet#isEqual
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean isDefined(Object key) {

        /**
         * Checks whether a given attribute is defined.
         *
         * @param key the attribute key
         * @return true if the attribute is defined
         * @see AttributeSet#isDefined
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public int getAttributeCount() {

        /**
         * Gets the number of attributes that are defined.
         *
         * @return the number of attributes
         * @see AttributeSet#getAttributeCount
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public Object clone() {

        /**
         * Clones a set of attributes.  Since the set is immutable, a
         * clone is basically the same set.
         *
         * @return the set of attributes
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public boolean equals(Object obj) {

        /**
         * Compares this object to the specified object.
         * The result is <code>true</code> if the object is an equivalent
         * set of attributes.
         * @param     obj   the object to compare with.
         * @return    <code>true</code> if the objects are equal;
         *            <code>false</code> otherwise.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public int hashCode() {

        /**
         * Returns a hashcode for this set of attributes.
         * @return     a hashcode value for this set of attributes.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        public String toString() {

        /**
         * Returns a string showing the key/value pairs
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public class SmallAttributeSet implements AttributeSet {

    /**
     * This class holds a small number of attributes in an array.
     * The storage format is key, value, key, value, etc.  The size
     * of the set is the length of the array divided by two.  By
     * default, this is the class that will be used to store attributes
     * when held in the compact sharable form.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    static final int THRESHOLD = 9;

    /**
     * The threshold for no longer sharing the set of attributes
     * in an immutable table.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    private int unusedSets;

    /**
     * Number of immutable sets that are not currently
     * being used.  This helps indicate when the sets need
     * to be cleaned out of the hashtable they are stored
     * in.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public static final String DEFAULT_STYLE = "default";

    /**
     * The name given to the default logical style attached
     * to paragraphs.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public static Object getStaticAttributeKey(Object key) {

    /**
     * Returns the String that <code>key</code> will be registered with
     * @see #getStaticAttribute
     * @see #registerStaticAttributeKey
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public static Object getStaticAttribute(Object key) {

    /**
     * Returns the object previously registered with
     * <code>registerStaticAttributeKey</code>.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public static void registerStaticAttributeKey(Object key) {

    /**
     * Registers an object as a static object that is being
     * used as a key in attribute sets.  This allows the key
     * to be treated specially for serialization.
     * <p>
     * For operation under a 1.1 virtual machine, this
     * uses the value returned by <code>toString</code>
     * concatenated to the classname.  The value returned
     * by toString should not have the class reference
     * in it (ie it should be reimplemented from the
     * definition in Object) in order to be the same when
     * recomputed later.
     *
     * @param key the non-null object key
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public static void readAttributeSet(ObjectInputStream in,
        MutableAttributeSet a) throws ClassNotFoundException, IOException {

    /**
     * Reads a set of attributes from the given object input
     * stream that have been previously written out with
     * <code>writeAttributeSet</code>.  This will try to restore
     * keys that were static objects to the static objects in
     * the current virtual machine considering only those keys
     * that have been registered with the
     * <code>registerStaticAttributeKey</code> method.
     * The attributes retrieved from the stream will be placed
     * into the given mutable set.
     *
     * @param in the object stream to read the attribute data from.
     * @param a  the attribute set to place the attribute
     *   definitions in.
     * @exception ClassNotFoundException passed upward if encountered
     *  when reading the object stream.
     * @exception IOException passed upward if encountered when
     *  reading the object stream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public static void writeAttributeSet(ObjectOutputStream out,
                                         AttributeSet a) throws IOException {

    /**
     * Writes a set of attributes to the given object stream
     * for the purpose of serialization.  This will take
     * special care to deal with static attribute keys that
     * have been registered wit the
     * <code>registerStaticAttributeKey</code> method.
     * Any attribute key not registered as a static key
     * will be serialized directly.  All values are expected
     * to be serializable.
     *
     * @param out the output stream
     * @param a the attribute set
     * @exception IOException on any I/O error
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public void readAttributes(ObjectInputStream in,
                               MutableAttributeSet a) throws ClassNotFoundException, IOException {

    /**
     * Context-specific handling of reading in attributes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public void writeAttributes(ObjectOutputStream out,
                                  AttributeSet a) throws IOException {

    /**
     * Context-specific handling of writing out attributes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public String toString() {

    /**
     * Converts a StyleContext to a String.
     *
     * @return the string
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    MutableAttributeSet getMutableAttributeSet(AttributeSet a) {

    /**
     * Creates a mutable attribute set to hand out because the current
     * needs are too big to try and use a shared version.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    AttributeSet getImmutableUniqueSet() {

    /**
     * Search for an existing attribute set using the current search
     * parameters.  If a matching set is found, return it.  If a match
     * is not found, we create a new set and add it to the pool.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    synchronized void removeUnusedSets() {

    /**
     * Clean the unused immutable sets out of the hashtable.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    protected MutableAttributeSet createLargeAttributeSet(AttributeSet a) {

    /**
     * Create a large set of attributes that should trade off
     * space for time.  This set will not be shared.  This is
     * a hook for subclasses that want to alter the behavior
     * of the larger attribute storage format (which is
     * SimpleAttributeSet by default).   This can be reimplemented
     * to return a MutableAttributeSet that provides some sort of
     * attribute conversion.
     *
     * @param a The set of attributes to be represented in the
     *  the larger form.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    protected SmallAttributeSet createSmallAttributeSet(AttributeSet a) {

    /**
     * Create a compact set of attributes that might be shared.
     * This is a hook for subclasses that want to alter the
     * behavior of SmallAttributeSet.  This can be reimplemented
     * to return an AttributeSet that provides some sort of
     * attribute conversion.
     *
     * @param a The set of attributes to be represented in the
     *  the compact form.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    protected int getCompressionThreshold() {

    /**
     * Returns the maximum number of key/value pairs to try and
     * compress into unique/immutable sets.  Any sets above this
     * limit will use hashtables and be a MutableAttributeSet.
     *
     * @return the threshold
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public void reclaim(AttributeSet a) {

    /**
     * Returns a set no longer needed by the MutableAttributeSet implementation.
     * This is useful for operation under 1.1 where there are no weak
     * references.  This would typically be called by the finalize method
     * of the MutableAttributeSet implementation.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param a the set to reclaim
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public AttributeSet getEmptySet() {

    /**
     * Fetches an empty AttributeSet.
     *
     * @return the set
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public synchronized AttributeSet removeAttributes(AttributeSet old, AttributeSet attrs) {

    /**
     * Removes a set of attributes for the element.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param old the old attribute set
     * @param attrs the attributes
     * @return the updated attribute set
     * @see MutableAttributeSet#removeAttributes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public synchronized AttributeSet removeAttributes(AttributeSet old, Enumeration<?> names) {

    /**
     * Removes a set of attributes for the element.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param old the old attribute set
     * @param names the attribute names
     * @return the updated attribute set
     * @see MutableAttributeSet#removeAttributes
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public synchronized AttributeSet removeAttribute(AttributeSet old, Object name) {

    /**
     * Removes an attribute from the set.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param old the old set of attributes
     * @param name the non-null attribute name
     * @return the updated attribute set
     * @see MutableAttributeSet#removeAttribute
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public synchronized AttributeSet addAttributes(AttributeSet old, AttributeSet attr) {

    /**
     * Adds a set of attributes to the element.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param old the old attribute set
     * @param attr the attributes to add
     * @return the updated attribute set
     * @see MutableAttributeSet#addAttribute
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public synchronized AttributeSet addAttribute(AttributeSet old, Object name, Object value) {

    /**
     * Adds an attribute to the given set, and returns
     * the new representative set.
     * <p>
     * This method is thread safe, although most Swing methods
     * are not. Please see
     * <A HREF="https://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency
     * in Swing</A> for more information.
     *
     * @param old the old attribute set
     * @param name the non-null attribute name
     * @param value the attribute value
     * @return the updated attribute set
     * @see MutableAttributeSet#addAttribute
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public FontMetrics getFontMetrics(Font f) {

    /**
     * Returns font metrics for a font.
     *
     * @param f the font
     * @return the metrics
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public Font getFont(String family, int style, int size) {

    /**
     * Gets a new font.  This returns a Font from a cache
     * if a cached font exists.  If not, a Font is added to
     * the cache.  This is basically a low-level cache for
     * 1.1 font features.
     *
     * @param family the font family (such as "Monospaced")
     * @param style the style of the font (such as Font.PLAIN)
     * @param size the point size &gt;= 1
     * @return the new font
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public Color getBackground(AttributeSet attr) {

    /**
     * Takes a set of attributes and turn it into a background color
     * specification.  This might be used to specify things
     * like brighter, more hue, etc.  By default it simply returns
     * the value specified by the StyleConstants.Background attribute.
     *
     * @param attr the set of attributes
     * @return the color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public Color getForeground(AttributeSet attr) {

    /**
     * Takes a set of attributes and turn it into a foreground color
     * specification.  This might be used to specify things
     * like brighter, more hue, etc.  By default it simply returns
     * the value specified by the StyleConstants.Foreground attribute.
     *
     * @param attr the set of attributes
     * @return the color
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
        if (StyleConstants.isSuperscript(attr) ||

        /**
         * if either superscript or subscript is
         * is set, we need to reduce the font size
         * by 2.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public Font getFont(AttributeSet attr) {

    /**
     * Gets the font from an attribute set.  This is
     * implemented to try and fetch a cached font
     * for the given AttributeSet, and if that fails
     * the font features are resolved and the
     * font is fetched from the low-level font cache.
     *
     * @param attr the attribute set
     * @return the font
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the <code>ChangeListener</code>s added
     * to this StyleContext with addChangeListener().
     *
     * @return all of the <code>ChangeListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public void removeChangeListener(ChangeListener l) {

    /**
     * Removes a listener that was tracking styles being
     * added or removed.
     *
     * @param l the change listener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public void addChangeListener(ChangeListener l) {

    /**
     * Adds a listener to track when styles are added
     * or removed.
     *
     * @param l the change listener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public Enumeration<?> getStyleNames() {

    /**
     * Fetches the names of the styles defined.
     *
     * @return the list of names as an enumeration
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public Style getStyle(String nm) {

    /**
     * Fetches a named style previously added to the document
     *
     * @param nm  the name of the style
     * @return the style
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public void removeStyle(String nm) {

    /**
     * Removes a named style previously added to the document.
     *
     * @param nm  the name of the style to remove
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public Style addStyle(String nm, Style parent) {

    /**
     * Adds a new style into the style hierarchy.  Style attributes
     * resolve from bottom up so an attribute specified in a child
     * will override an attribute specified in the parent.
     *
     * @param nm   the name of the style (must be unique within the
     *   collection of named styles in the document).  The name may
     *   be null if the style is unnamed, but the caller is responsible
     *   for managing the reference returned as an unnamed style can't
     *   be fetched by name.  An unnamed style may be useful for things
     *   like character attribute overrides such as found in a style
     *   run.
     * @param parent the parent style.  This may be null if unspecified
     *   attributes need not be resolved in some other style.
     * @return the created style
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public StyleContext() {

    /**
     * Creates a new StyleContext object.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
    public static final StyleContext getDefaultStyleContext() {

    /**
     * Returns default AttributeContext shared by all documents that
     * don't bother to define/supply their own context.
     *
     * @return the context
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/StyleContext.java
public class StyleContext implements Serializable, AbstractDocument.AttributeContext {

/**
 * A pool of styles and their associated resources.  This class determines
 * the lifetime of a group of resources by being a container that holds
 * caches for various resources such as font and color that get reused
 * by the various style definitions.  This can be shared by multiple
 * documents if desired to maximize the sharing of related resources.
 * <p>
 * This class also provides efficient support for small sets of attributes
 * and compresses them by sharing across uses and taking advantage of
 * their immutable nature.  Since many styles are replicated, the potential
 * for sharing is significant, and copies can be extremely cheap.
 * Larger sets reduce the possibility of sharing, and therefore revert
 * automatically to a less space-efficient implementation.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author  Timothy Prinzing
 */
