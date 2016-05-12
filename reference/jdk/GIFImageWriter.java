_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private void writeImage(RenderedImage image,
                            GIFWritableImageMetadata imageMetadata,
                            ImageWriteParam param, byte[] globalColorTable,
                            Rectangle sourceBounds, Dimension destSize)

    /**
     * Writes any extension blocks, the Image Descriptor, and the image data
     *
     * @param iioimage The image and image metadata.
     * @param param The write parameters.
     * @param globalColorTable The Global Color Table.
     * @param sourceBounds The source region.
     * @param destSize The destination dimensions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private void write(boolean writeHeader,
                       boolean writeTrailer,
                       IIOMetadata sm,
                       IIOImage iioimage,
                       ImageWriteParam p) throws IOException {

    /**
     * Writes any extension blocks, the Image Descriptor, the image data,
     * and optionally the header (Signature and Logical Screen Descriptor)
     * and trailer (Block Terminator).
     *
     * @param writeHeader Whether to write the header.
     * @param writeTrailer Whether to write the trailer.
     * @param sm The stream metadata or <code>null</code> if
     * <code>writeHeader</code> is <code>false</code>.
     * @param iioimage The image and image metadata.
     * @param p The write parameters.
     *
     * @throws IllegalArgumentException if the number of bands is not 1.
     * @throws IllegalArgumentException if the number of bits per sample is
     * greater than 8.
     * @throws IllegalArgumentException if the color component size is
     * greater than 8.
     * @throws IllegalArgumentException if <code>writeHeader</code> is
     * <code>true</code> and <code>sm</code> is <code>null</code>.
     * @throws IllegalArgumentException if <code>writeHeader</code> is
     * <code>false</code> and a sequence is not being written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private void resetLocal() {

    /**
     * Resets locally defined instance variables.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    public IIOMetadata convertImageMetadata(IIOMetadata inData,
                                            ImageTypeSpecifier imageType,
                                            ImageWriteParam param) {

    /**
     * Creates a default image metadata object and merges in the
     * supplied metadata.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    public IIOMetadata convertStreamMetadata(IIOMetadata inData,
                                             ImageWriteParam param) {

    /**
     * Creates a default stream metadata object and merges in the
     * supplied metadata.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private void convertMetadata(String metadataFormatName,
                                 IIOMetadata inData,
                                 IIOMetadata outData) {

    /**
     * Merges <code>inData</code> into <code>outData</code>. The supplied
     * metadata format name is attempted first and failing that the standard
     * metadata format name is attempted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private static int getGifPaletteSize(int x) {

    /**
     * According do GIF specification size of clor table (palette here)
     * must be in range from 2 to 256 and must be power of 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
            for (int i = mapSize; i < ctSize; i++) {

            /**
             * fill tail of color component arrays by replica of first color
             * in order to avoid appearance of extra colors in the color table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
            int ctSize = getGifPaletteSize(mapSize);

            /**
             * The GIF image format assumes that size of image palette
             * is power of two. We will use closest larger power of two
             * as size of color table.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private static byte[] createColorTable(ColorModel colorModel,
                                           SampleModel sampleModel)

    /**
     * Create a color table from the image ColorModel and SampleModel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private static void computeRegions(Rectangle sourceBounds,
                                       Dimension destSize,
                                       ImageWriteParam p) {

    /**
     * Compute the source region and destination dimensions taking any
     * parameter settings into account.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private static int getNumBits(int value) throws IOException {

    /**
     * The number of bits represented by the value which should be a
     * legal length for a color table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private int imageIndex = 0;

    /**
     * The index of the image being written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private GIFWritableStreamMetadata theStreamMetadata = null;

    /**
     * The stream metadata of a sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private boolean wroteSequenceHeader = false;

    /**
     * Whether the header has been written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private boolean isWritingSequence = false;

    /**
     * Whether a sequence is being written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private ImageOutputStream stream = null;

    /**
     * The <code>output</code> case to an <code>ImageOutputStream</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private void writeImage(RenderedImage image,
                            GIFWritableImageMetadata imageMetadata,
                            ImageWriteParam param, byte[] globalColorTable,
                            Rectangle sourceBounds, Dimension destSize)

    /**
     * Writes any extension blocks, the Image Descriptor, and the image data
     *
     * @param iioimage The image and image metadata.
     * @param param The write parameters.
     * @param globalColorTable The Global Color Table.
     * @param sourceBounds The source region.
     * @param destSize The destination dimensions.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private void write(boolean writeHeader,
                       boolean writeTrailer,
                       IIOMetadata sm,
                       IIOImage iioimage,
                       ImageWriteParam p) throws IOException {

    /**
     * Writes any extension blocks, the Image Descriptor, the image data,
     * and optionally the header (Signature and Logical Screen Descriptor)
     * and trailer (Block Terminator).
     *
     * @param writeHeader Whether to write the header.
     * @param writeTrailer Whether to write the trailer.
     * @param sm The stream metadata or <code>null</code> if
     * <code>writeHeader</code> is <code>false</code>.
     * @param iioimage The image and image metadata.
     * @param p The write parameters.
     *
     * @throws IllegalArgumentException if the number of bands is not 1.
     * @throws IllegalArgumentException if the number of bits per sample is
     * greater than 8.
     * @throws IllegalArgumentException if the color component size is
     * greater than 8.
     * @throws IllegalArgumentException if <code>writeHeader</code> is
     * <code>true</code> and <code>sm</code> is <code>null</code>.
     * @throws IllegalArgumentException if <code>writeHeader</code> is
     * <code>false</code> and a sequence is not being written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private void resetLocal() {

    /**
     * Resets locally defined instance variables.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    public IIOMetadata convertImageMetadata(IIOMetadata inData,
                                            ImageTypeSpecifier imageType,
                                            ImageWriteParam param) {

    /**
     * Creates a default image metadata object and merges in the
     * supplied metadata.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    public IIOMetadata convertStreamMetadata(IIOMetadata inData,
                                             ImageWriteParam param) {

    /**
     * Creates a default stream metadata object and merges in the
     * supplied metadata.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private void convertMetadata(String metadataFormatName,
                                 IIOMetadata inData,
                                 IIOMetadata outData) {

    /**
     * Merges <code>inData</code> into <code>outData</code>. The supplied
     * metadata format name is attempted first and failing that the standard
     * metadata format name is attempted.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private static int getGifPaletteSize(int x) {

    /**
     * According do GIF specification size of clor table (palette here)
     * must be in range from 2 to 256 and must be power of 2.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
            for (int i = mapSize; i < ctSize; i++) {

            /**
             * fill tail of color component arrays by replica of first color
             * in order to avoid appearance of extra colors in the color table
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
            int ctSize = getGifPaletteSize(mapSize);

            /**
             * The GIF image format assumes that size of image palette
             * is power of two. We will use closest larger power of two
             * as size of color table.
             */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private static byte[] createColorTable(ColorModel colorModel,
                                           SampleModel sampleModel)

    /**
     * Create a color table from the image ColorModel and SampleModel.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private static void computeRegions(Rectangle sourceBounds,
                                       Dimension destSize,
                                       ImageWriteParam p) {

    /**
     * Compute the source region and destination dimensions taking any
     * parameter settings into account.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private static int getNumBits(int value) throws IOException {

    /**
     * The number of bits represented by the value which should be a
     * legal length for a color table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private int imageIndex = 0;

    /**
     * The index of the image being written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private GIFWritableStreamMetadata theStreamMetadata = null;

    /**
     * The stream metadata of a sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private boolean wroteSequenceHeader = false;

    /**
     * Whether the header has been written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private boolean isWritingSequence = false;

    /**
     * Whether a sequence is being written.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/gif/GIFImageWriter.java
    private ImageOutputStream stream = null;

    /**
     * The <code>output</code> case to an <code>ImageOutputStream</code>.
     */
