_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public abstract AudioInputStream getAudioInputStream(AudioFormat targetFormat, AudioInputStream sourceStream);

    /**
     * Obtains an audio input stream with the specified format from the given audio
     * input stream.
     * @param targetFormat desired data format of the stream after processing
     * @param sourceStream stream from which data to be processed should be read
     * @return stream from which processed data with the specified format may be read
     * @throws IllegalArgumentException if the format combination supplied is
     * not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public abstract AudioInputStream getAudioInputStream(AudioFormat.Encoding targetEncoding, AudioInputStream sourceStream);

    /**
     * Obtains an audio input stream with the specified encoding from the given audio
     * input stream.
     * @param targetEncoding desired encoding of the stream after processing
     * @param sourceStream stream from which data to be processed should be read
     * @return stream from which processed data with the specified target encoding may be read
     * @throws IllegalArgumentException if the format combination supplied is
     * not supported.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public boolean isConversionSupported(AudioFormat targetFormat, AudioFormat sourceFormat){

    /**
     * Indicates whether the format converter supports conversion to one
     * particular format from another.
     * @param targetFormat desired format of outgoing data
     * @param sourceFormat format of the incoming data
     * @return <code>true</code> if the conversion is supported, otherwise <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public abstract AudioFormat[] getTargetFormats(AudioFormat.Encoding targetEncoding, AudioFormat sourceFormat);

    /**
     * Obtains the set of target formats with the encoding specified
     * supported by the format converter
     * If no target formats with the specified encoding are supported
     * for this source format, an array of length 0 is returned.
     * @param targetEncoding desired encoding of the stream after processing
     * @param sourceFormat format of the incoming data
     * @return array of supported target formats.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public boolean isConversionSupported(AudioFormat.Encoding targetEncoding, AudioFormat sourceFormat){

    /**
     * Indicates whether the format converter supports conversion to a particular encoding
     * from a particular format.
     * @param targetEncoding desired encoding of the outgoing data
     * @param sourceFormat format of the incoming data
     * @return <code>true</code> if the conversion is supported, otherwise <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public abstract AudioFormat.Encoding[] getTargetEncodings(AudioFormat sourceFormat);

    /**
     * Obtains the set of target format encodings supported by the format converter
     * given a particular source format.
     * If no target format encodings are supported for this source format,
     * an array of length 0 is returned.
     * @param sourceFormat format of the incoming data
     * @return array of supported target format encodings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public boolean isTargetEncodingSupported(AudioFormat.Encoding targetEncoding){

    /**
     * Indicates whether the format converter supports conversion to the
     * specified target format encoding.
     * @param targetEncoding the target format encoding for which support is queried
     * @return <code>true</code> if the encoding is supported, otherwise <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public boolean isSourceEncodingSupported(AudioFormat.Encoding sourceEncoding){

    /**
     * Indicates whether the format converter supports conversion from the
     * specified source format encoding.
     * @param sourceEncoding the source format encoding for which support is queried
     * @return <code>true</code> if the encoding is supported, otherwise <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public abstract AudioFormat.Encoding[] getTargetEncodings();

    /**
     * Obtains the set of target format encodings to which format
     * conversion services are provided by this provider.
     * @return array of target format encodings. If for some reason provider
     * does not provide any conversion services, an array of length 0 is
     * returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
    public abstract AudioFormat.Encoding[] getSourceEncodings();

    /**
     * Obtains the set of source format encodings from which format
     * conversion services are provided by this provider.
     * @return array of source format encodings. If for some reason provider
     * does not provide any conversion services, an array of length 0 is
     * returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/spi/FormatConversionProvider.java
public abstract class FormatConversionProvider {

/**
 * A format conversion provider provides format conversion services
 * from one or more input formats to one or more output formats.
 * Converters include codecs, which encode and/or decode audio data,
 * as well as transcoders, etc.  Format converters provide methods for
 * determining what conversions are supported and for obtaining an audio
 * stream from which converted data can be read.
 * <p>
 * The source format represents the format of the incoming
 * audio data, which will be converted.
 * <p>
 * The target format represents the format of the processed, converted
 * audio data.  This is the format of the data that can be read from
 * the stream returned by one of the <code>getAudioInputStream</code> methods.
 *
 * @author Kara Kytle
 * @since 1.3
 */
