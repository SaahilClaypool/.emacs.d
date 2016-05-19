_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    public void reset() {

    //// End of writer support
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    void writeToStream(ImageOutputStream ios,
                       boolean ignoreJFIF,
                       boolean forceJFIF,
                       List thumbnails,
                       ICC_Profile iccProfile,
                       boolean ignoreAdobe,
                       int newAdobeTransform,
                       JPEGImageWriter writer)

    ///// Writer support
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private int countScanBands() {

    /**
     * Returns the total number of bands referenced in all SOS marker
     * segments, including 0 if there are no SOS marker segments.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private boolean isConsistent() {

    /**
     * Check that this metadata object is in a consistent state and
     * return <code>true</code> if it is or <code>false</code>
     * otherwise.  All the constructors and modifiers should call
     * this method at the end to guarantee that the data is always
     * consistent, as the writer relies on this.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void mergeSOSNode(Node node) throws IIOInvalidTreeException {

    /**
     * Merge the given SOS node into the marker sequence.
     * If there already exists a single SOS marker segment, then the values
     * are updated from the node.
     * If there are more than one existing SOS marker segments, then an
     * IIOInvalidTreeException is thrown, as SOS segments cannot be merged
     * into a set of progressive scans.
     * If there are no SOS marker segments, a new one is created and added
     * to the end of the sequence.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void mergeSOFNode(Node node) throws IIOInvalidTreeException {

    /**
     * Merge the given SOF node into the marker sequence.
     * If there already exists an SOF marker segment in the sequence, then
     * its values are updated from the node.
     * If there is no SOF segment, then a new one is created and added as
     * follows:
     * If there are any SOS segments, the new SOF segment is inserted before
     * the first one.
     * If there is no SOS segment, the new SOF segment is added to the end
     * of the sequence.
     *
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void mergeUnknownNode(Node node) throws IIOInvalidTreeException {

    /**
     * Merge the given Unknown node into the marker sequence.
     * A new Unknown marker segment is created and added to the sequence as
     * follows:
     * If there already exist Unknown marker segments, the new one is inserted
     * after the last one.
     * If there are no Unknown marker segments, the new Unknown marker segment
     * is inserted after the JFIF segment, if there is one.
     * If there is no JFIF segment, the new Unknown segment is inserted before
     * the Adobe marker segment, if there is one.
     * If there is no Adobe segment, the new Unknown segment is inserted
     * at the beginning of the sequence.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void insertAdobeMarkerSegment(AdobeMarkerSegment newGuy) {

    /**
     * Insert the given AdobeMarkerSegment into the marker sequence, as
     * follows (we assume there is no Adobe segment yet):
     * If there is a JFIF segment, then the new Adobe segment is inserted
     * after it.
     * If there is no JFIF segment, the new Adobe segment is inserted after the
     * last Unknown segment, if there are any.
     * If there are no Unknown segments, the new Adobe segment is inserted
     * at the beginning of the sequence.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void mergeAdobeNode(Node node) throws IIOInvalidTreeException {

    /**
     * Merge the given Adobe APP14 node into the marker sequence.
     * If there already exists an Adobe marker segment, then its attributes
     * are updated from the node.
     * If there is no Adobe segment, then a new one is created and added
     * using insertAdobeMarkerSegment.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void insertCOMMarkerSegment(COMMarkerSegment newGuy) {

     /**
      * Insert a new COM marker segment into an appropriate place in the
      * marker sequence, as follows:
      * If there already exist COM marker segments, the new one is inserted
      * after the last one.
      * If there are no COM segments, the new COM segment is inserted after the
      * JFIF segment, if there is one.
      * If there is no JFIF segment, the new COM segment is inserted after the
      * Adobe marker segment, if there is one.
      * If there is no Adobe segment, the new COM segment is inserted
      * at the beginning of the sequence.
      */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void mergeCOMNode(Node node) throws IIOInvalidTreeException {

    /**
     * Merge the given COM node into the marker sequence.
     * A new COM marker segment is created and added to the sequence
     * using insertCOMMarkerSegment.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void mergeDRINode(Node node) throws IIOInvalidTreeException {

    /**
     * Merge the given DRI node into the marker sequence.
     * If there already exists a DRI marker segment, the restart interval
     * value is updated.
     * If there is no DRI segment, then a new one is created and added as
     * follows:
     * If there is an SOF segment, the new DRI segment is inserted before
     * it.
     * If there is no SOF segment, the new DRI segment is inserted before
     * the first SOS segment, if there is one.
     * If there is no SOS segment, the new DRI segment is added to the end
     * of the sequence.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void mergeDHTNode(Node node) throws IIOInvalidTreeException {

    /**
     * Merge the given DHT node into the marker sequence.  If there already
     * exist DHT marker segments in the sequence, then each table in the
     * node replaces the first table, in any DHT segment, with the same
     * table class and table id.  If none of the existing DHT segments contain
     * a table with the same class and id, then the table is added to the last
     * existing DHT segment.
     * If there are no DHT segments, then a new one is created and added
     * as follows:
     * If there are DQT segments, the new DHT segment is inserted immediately
     * following the last DQT segment.
     * If there are no DQT segments, the new DHT segment is inserted before
     * an SOF segment, if there is one.
     * If there is no SOF segment, the new DHT segment is inserted before
     * the first SOS segment, if there is one.
     * If there is no SOS segment, the new DHT segment is added to the end
     * of the sequence.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void mergeDQTNode(Node node) throws IIOInvalidTreeException {

    /**
     * Merge the given DQT node into the marker sequence.  If there already
     * exist DQT marker segments in the sequence, then each table in the
     * node replaces the first table, in any DQT segment, with the same
     * table id.  If none of the existing DQT segments contain a table with
     * the same id, then the table is added to the last existing DQT segment.
     * If there are no DQT segments, then a new one is created and added
     * as follows:
     * If there are DHT segments, the new DQT segment is inserted before the
     * first one.
     * If there are no DHT segments, the new DQT segment is inserted before
     * an SOF segment, if there is one.
     * If there is no SOF segment, the new DQT segment is inserted before
     * the first SOS segment, if there is one.
     * If there is no SOS segment, the new DQT segment is added to the end
     * of the sequence.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private void mergeJFIFsubtree(Node JPEGvariety)

    /**
     * Merge a JFIF subtree into the marker sequence, if the subtree
     * is non-empty.
     * If a JFIF marker exists, update it from the subtree.
     * If none exists, create one from the subtree and insert it at the
     * beginning of the marker sequence.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private List cloneSequence() {

    /**
     * Returns a deep copy of the current marker sequence.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private int findMarkerSegmentPosition(Class cls, boolean first) {

    /**
     * Returns the index of the first or last MarkerSegment in the list
     * of the given class, or -1 if none is found.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    MarkerSegment findMarkerSegment(Class cls, boolean first) {

    /**
     * Returns the first or last MarkerSegment object in the list
     * of the given class, or null if none is found.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    MarkerSegment findMarkerSegment(int tag) {

    /**
     * Returns the first MarkerSegment object in the list
     * with the given tag, or null if none is found.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    // Utilities for dealing with the marker sequence.

    ////// End of constructors
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    JPEGMetadata(ImageTypeSpecifier imageType,
                 ImageWriteParam param,
                 JPEGImageWriter writer) {

    /**
     * Constructs a default image <code>JPEGMetadata</code> object appropriate
     * for the given image type and write parameters.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    JPEGMetadata(ImageWriteParam param, JPEGImageWriter writer) {

    /**
     * Constructs a default stream <code>JPEGMetadata</code> object appropriate
     * for the given write parameters.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    JPEGMetadata(boolean isStream, boolean inThumb) {

    /**
     * Constructor containing code shared by other constructors.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    /////// Constructors

    /////// End of package-access variables
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    final boolean isStream;

    /**
     * Indicates whether this object represents stream or image
     * metadata.  Package-visible so the writer can see it.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    List markerSequence = new ArrayList();

    /**
     * All data is a list of <code>MarkerSegment</code> objects.
     * When accessing the list, use the tag to identify the particular
     * subclass.  Any JFIF marker segment must be the first element
     * of the list if it is present, and any JFXX or APP2ICC marker
     * segments are subordinate to the JFIF marker segment.  This
     * list is package visible so that the writer can access it.
     * @see #MarkerSegment
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    /////// Package-access variables

    //////// end of private variables
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private boolean hasAlpha;

    /**
     * Set by the chroma node construction method to signal the
     * presence or absence of an alpha channel to the transparency
     * node construction method.  Used only when constructing a
     * standard metadata tree.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private boolean inThumb = false;

    /**
     * Set to <code>true</code> when reading a thumbnail stored as
     * JPEG.  This is used to enforce the prohibition of JFIF thumbnails
     * containing any JFIF marker segments, and to ensure generation of
     * a correct native subtree during <code>getAsTree</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private List resetSequence = null;

    /**
     * A copy of <code>markerSequence</code>, created the first time the
     * <code>markerSequence</code> is modified.  This is used by reset
     * to restore the original state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
    private static final boolean debug = false;

    //////// Private variables
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGMetadata.java
public class JPEGMetadata extends IIOMetadata implements Cloneable {

/**
 * Metadata for the JPEG plug-in.
 */
