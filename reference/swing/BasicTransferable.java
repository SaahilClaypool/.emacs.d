_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    protected boolean isStringFlavor(DataFlavor flavor) {

    /**
     * Returns whether or not the specified data flavor is a String flavor that
     * is supported.
     * @param flavor the requested flavor for the data
     * @return boolean indicating whether or not the data flavor is supported
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    protected String getPlainData() {

    /**
     * Fetch the data in a text/plain format.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    protected boolean isPlainSupported() {

    /**
     * Should the plain text flavors be offered?  If so, the method
     * getPlainData should be implemented to provide something reasonable.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    protected boolean isPlainFlavor(DataFlavor flavor) {

    /**
     * Returns whether or not the specified data flavor is an plain flavor that
     * is supported.
     * @param flavor the requested flavor for the data
     * @return boolean indicating whether or not the data flavor is supported
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    protected String getHTMLData() {

    /**
     * Fetch the data in a text/html format
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    protected boolean isHTMLSupported() {

    /**
     * Should the HTML flavors be offered?  If so, the method
     * getHTMLData should be implemented to provide something reasonable.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    protected boolean isHTMLFlavor(DataFlavor flavor) {

    /**
     * Returns whether or not the specified data flavor is an HTML flavor that
     * is supported.
     * @param flavor the requested flavor for the data
     * @return boolean indicating whether or not the data flavor is supported
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    protected DataFlavor[] getRicherFlavors() {

    /**
     * Some subclasses will have flavors that are more descriptive than HTML
     * or plain text.  If this method returns a non-null value, it will be
     * placed at the start of the array of supported flavors.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {

    /**
     * Returns an object which represents the data to be transferred.  The class
     * of the object returned is defined by the representation class of the flavor.
     *
     * @param flavor the requested flavor for the data
     * @see DataFlavor#getRepresentationClass
     * @exception IOException                if the data is no longer available
     *              in the requested flavor.
     * @exception UnsupportedFlavorException if the requested data flavor is
     *              not supported.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    public boolean isDataFlavorSupported(DataFlavor flavor) {

    /**
     * Returns whether or not the specified data flavor is supported for
     * this object.
     * @param flavor the requested flavor for the data
     * @return boolean indicating whether or not the data flavor is supported
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
    public DataFlavor[] getTransferDataFlavors() {

    /**
     * Returns an array of DataFlavor objects indicating the flavors the data
     * can be provided in.  The array should be ordered according to preference
     * for providing the data (from most richly descriptive to least descriptive).
     * @return an array of data flavors in which this data can be transferred
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicTransferable.java
class BasicTransferable implements Transferable, UIResource {

/**
 * A transferable implementation for the default data transfer of some Swing
 * components.
 *
 * @author  Timothy Prinzing
 */
