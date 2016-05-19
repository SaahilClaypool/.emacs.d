_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/MarkerSegment.java
    void write(ImageOutputStream ios) throws IOException {

    /**
     * Writes the data for this segment to the stream in
     * valid JPEG format.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/MarkerSegment.java
    void writeTag(ImageOutputStream ios) throws IOException {

    /**
     * Writes the marker, tag, and length.  Note that length
     * should be verified by the caller as a correct JPEG
     * length, i.e it includes itself.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/MarkerSegment.java
    void loadData(JPEGBuffer buffer) throws IOException {

    /**
     * We have determined that we don't know the type, so load
     * the data using the length parameter.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/MarkerSegment.java
    protected Object clone() {

    /**
     * Deep copy of data array.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/MarkerSegment.java
    MarkerSegment(Node node) throws IIOInvalidTreeException {

    /**
     * Construct a MarkerSegment from an "unknown" DOM Node.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/MarkerSegment.java
    MarkerSegment(int tag) {

    /**
     * Constructor used when creating segments other than by
     * reading them from a stream.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/MarkerSegment.java
    MarkerSegment(JPEGBuffer buffer) throws IOException {

    /**
     * Constructor for creating <code>MarkerSegment</code>s by reading
     * from an <code>ImageInputStream</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/MarkerSegment.java
class MarkerSegment implements Cloneable {

/**
 * All metadata is stored in MarkerSegments.  Marker segments
 * that we know about are stored in subclasses of this
 * basic class, which used for unrecognized APPn marker
 * segments.  XXX break out UnknownMarkerSegment as a subclass
 * and make this abstract, avoiding unused data field.
 */
