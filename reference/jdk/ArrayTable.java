_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ArrayTable.java
    public Object[] getKeys(Object[] keys) {

    /**
     * Returns the keys of the table, or <code>null</code> if there
     * are currently no bindings.
     * @param keys  array of keys
     * @return an array of bindings
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ArrayTable.java
    public void clear() {

    /**
     * Removes all the mappings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/ArrayTable.java
    static void writeArrayTable(ObjectOutputStream s, ArrayTable table) throws IOException {

    /**
     * Writes the passed in ArrayTable to the passed in ObjectOutputStream.
     * The data is saved as an integer indicating how many key/value
     * pairs are being archived, followed by the the key/value pairs. If
     * <code>table</code> is null, 0 will be written to <code>s</code>.
     * <p>
     * This is a convenience method that ActionMap/InputMap and
     * AbstractAction use to avoid having the same code in each class.
     */
