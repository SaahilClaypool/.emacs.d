_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/ImageTranscoderSpi.java
    public abstract ImageTranscoder createTranscoderInstance();

    /**
     * Returns an instance of the <code>ImageTranscoder</code>
     * implementation associated with this service provider.
     *
     * @return an <code>ImageTranscoder</code> instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/ImageTranscoderSpi.java
    public abstract String getWriterServiceProviderName();

    /**
     * Returns the fully qualified class name of an
     * <code>ImageWriterSpi</code> class that generates
     * <code>IIOMetadata</code> objects that may be used as input to
     * this transcoder.
     *
     * @return a <code>String</code> containing the fully-qualified
     * class name of the <code>ImageWriterSpi</code> implementation class.
     *
     * @see ImageWriterSpi
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/ImageTranscoderSpi.java
    public abstract String getReaderServiceProviderName();

    /**
     * Returns the fully qualified class name of an
     * <code>ImageReaderSpi</code> class that generates
     * <code>IIOMetadata</code> objects that may be used as input to
     * this transcoder.
     *
     * @return a <code>String</code> containing the fully-qualified
     * class name of the <code>ImageReaderSpi</code> implementation class.
     *
     * @see ImageReaderSpi
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/ImageTranscoderSpi.java
    public ImageTranscoderSpi(String vendorName,
                              String version) {

    /**
     * Constructs an <code>ImageTranscoderSpi</code> with a given set
     * of values.
     *
     * @param vendorName the vendor name.
     * @param version a version identifier.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/ImageTranscoderSpi.java
    protected ImageTranscoderSpi() {

    /**
     * Constructs a blank <code>ImageTranscoderSpi</code>.  It is up
     * to the subclass to initialize instance variables and/or
     * override method implementations in order to provide working
     * versions of all methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/spi/ImageTranscoderSpi.java
public abstract class ImageTranscoderSpi extends IIOServiceProvider {

/**
 * The service provider interface (SPI) for <code>ImageTranscoder</code>s.
 * For more information on service provider classes, see the class comment
 * for the <code>IIORegistry</code> class.
 *
 * @see IIORegistry
 * @see javax.imageio.ImageTranscoder
 *
 */
