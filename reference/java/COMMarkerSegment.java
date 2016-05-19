_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/COMMarkerSegment.java
    void write(ImageOutputStream ios) throws IOException {

    /**
     * Writes the data for this segment to the stream in
     * valid JPEG format, directly from the data array.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/COMMarkerSegment.java
    IIOMetadataNode getNativeNode() {

    /**
     * Returns an <code>IIOMetadataNode</code> containing the data array
     * as a user object and a string encoded using ISO-8895-1, as an
     * attribute.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/COMMarkerSegment.java
    String getComment() {

    /**
     * Returns the array encoded as a String, using ISO-Latin-1 encoding.
     * If an application needs another encoding, the data array must be
     * consulted directly.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/COMMarkerSegment.java
    COMMarkerSegment(Node node) throws IIOInvalidTreeException{

    /**
     * Constructs a marker segment from a native tree node.  If the node
     * is an <code>IIOMetadataNode</code> and contains a user object,
     * that object is used rather than the string attribute.  If the
     * string attribute is used, the default encoding is used.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/COMMarkerSegment.java
    COMMarkerSegment(String comment) {

    /**
     * Constructs a marker segment from a String.  This is used when
     * modifying metadata from a non-native tree and when transcoding.
     * The default encoding is used to construct the byte array.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/COMMarkerSegment.java
    COMMarkerSegment(JPEGBuffer buffer) throws IOException {

    /**
     * Constructs a marker segment from the given buffer, which contains
     * data from an <code>ImageInputStream</code>.  This is used when
     * reading metadata from a stream.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/COMMarkerSegment.java
class COMMarkerSegment extends MarkerSegment {

/**
 * A Comment marker segment.  Retains an array of bytes representing the
 * comment data as it is read from the stream.  If the marker segment is
 * constructed from a String, then local default encoding is assumed
 * when creating the byte array.  If the marker segment is created from
 * an <code>IIOMetadataNode</code>, the user object, if present is
 * assumed to be a byte array containing the comment data.  If there is
 * no user object then the comment attribute is used to create the
 * byte array, again assuming the default local encoding.
 */
