_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        public final String toString() {

        /**
         * Provides the <code>String</code> representation of the encoding.  This <code>String</code> is
         * the same name that was passed to the constructor.  For the predefined encodings, the name
         * is similar to the encoding's variable (field) name.  For example, <code>PCM_SIGNED.toString()</code> returns
         * the name "pcm_signed".
         *
         * @return the encoding name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        public final int hashCode() {

        /**
         * Finalizes the hashCode method
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        public final boolean equals(Object obj) {

        /**
         * Finalizes the equals method
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        public Encoding(String name) {

        /**
         * Constructs a new encoding.
         * @param name  the name of the new type of encoding
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        private String name;

        /**
         * Encoding name.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        public static final Encoding ALAW = new Encoding("ALAW");

        /**
         * Specifies a-law encoded data.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        public static final Encoding ULAW = new Encoding("ULAW");

        /**
         * Specifies u-law encoded data.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        public static final Encoding PCM_FLOAT = new Encoding("PCM_FLOAT");

        /**
         * Specifies floating-point PCM data.
         *
         * @since 1.7
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        public static final Encoding PCM_UNSIGNED = new Encoding("PCM_UNSIGNED");

        /**
         * Specifies unsigned, linear PCM data.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
        public static final Encoding PCM_SIGNED = new Encoding("PCM_SIGNED");

        /**
         * Specifies signed, linear PCM data.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public static class Encoding {

    /**
     * The <code>Encoding</code> class  names the  specific type of data representation
     * used for an audio stream.   The encoding includes aspects of the
     * sound format other than the number of channels, sample rate, sample size,
     * frame rate, frame size, and byte order.
     * <p>
     * One ubiquitous type of audio encoding is pulse-code modulation (PCM),
     * which is simply a linear (proportional) representation of the sound
     * waveform.  With PCM, the number stored in each sample is proportional
     * to the instantaneous amplitude of the sound pressure at that point in
     * time.  The numbers may be signed or unsigned integers or floats.
     * Besides PCM, other encodings include mu-law and a-law, which are nonlinear
     * mappings of the sound amplitude that are often used for recording speech.
     * <p>
     * You can use a predefined encoding by referring to one of the static
     * objects created by this class, such as PCM_SIGNED or
     * PCM_UNSIGNED.  Service providers can create new encodings, such as
     * compressed audio formats, and make
     * these available through the <code>{@link AudioSystem}</code> class.
     * <p>
     * The <code>Encoding</code> class is static, so that all
     * <code>AudioFormat</code> objects that have the same encoding will refer
     * to the same object (rather than different instances of the same class).
     * This allows matches to be made by checking that two format's encodings
     * are equal.
     *
     * @see AudioFormat
     * @see javax.sound.sampled.spi.FormatConversionProvider
     *
     * @author Kara Kytle
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public String toString() {

    /**
     * Returns a string that describes the format, such as:
     * "PCM SIGNED 22050 Hz 16 bit mono big-endian".  The contents of the string
     * may vary between implementations of Java Sound.
     *
     * @return a string that describes the format parameters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public boolean matches(AudioFormat format) {

    /**
     * Indicates whether this format matches the one specified.
     * To match, two formats must have the same encoding,
     * and consistent values of the number of channels, sample rate, sample size,
     * frame rate, and frame size.
     * The values of the property are consistent if they are equal
     * or the specified format has the property value
     * {@code AudioSystem.NOT_SPECIFIED}.
     * The byte order (big-endian or little-endian) must be the same
     * if the sample size is greater than one byte.
     *
     * @param format format to test for match
     * @return {@code true} if this format matches the one specified,
     *         {@code false} otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public Object getProperty(String key) {

    /**
     * Obtain the property value specified by the key.
     * The concept of properties is further explained in
     * the {@link AudioFileFormat class description}.
     *
     * <p>If the specified property is not defined for a
     * particular file format, this method returns
     * <code>null</code>.
     *
     * @param key the key of the desired property
     * @return the value of the property with the specified key,
     *         or <code>null</code> if the property does not exist.
     *
     * @see #properties()
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public Map<String,Object> properties() {

    /**
     * Obtain an unmodifiable map of properties.
     * The concept of properties is further explained in
     * the {@link AudioFileFormat class description}.
     *
     * @return a <code>Map&lt;String,Object&gt;</code> object containing
     *         all properties. If no properties are recognized, an empty map is
     *         returned.
     *
     * @see #getProperty(String)
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public boolean isBigEndian() {

    /**
     * Indicates whether the audio data is stored in big-endian or little-endian
     * byte order.  If the sample size is not more than one byte, the return value is
     * irrelevant.
     * @return <code>true</code> if the data is stored in big-endian byte order,
     * <code>false</code> if little-endian
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public float getFrameRate() {

    /**
     * Obtains the frame rate in frames per second.
     * When this AudioFormat is used for queries (e.g. {@link
     * AudioSystem#isConversionSupported(AudioFormat, AudioFormat)
     * AudioSystem.isConversionSupported}) or capabilities (e.g. {@link
     * DataLine.Info#getFormats() DataLine.Info.getFormats}), a frame rate of
     * <code>AudioSystem.NOT_SPECIFIED</code> means that any frame rate is
     * acceptable. <code>AudioSystem.NOT_SPECIFIED</code> is also returned when
     * the frame rate is not defined for this audio format.
     * @return the number of frames per second,
     * or <code>AudioSystem.NOT_SPECIFIED</code>
     *
     * @see #getSampleRate()
     * @see AudioSystem#NOT_SPECIFIED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public int getFrameSize() {

    /**
     * Obtains the frame size in bytes.
     * When this AudioFormat is used for queries (e.g. {@link
     * AudioSystem#isConversionSupported(AudioFormat, AudioFormat)
     * AudioSystem.isConversionSupported}) or capabilities (e.g. {@link
     * DataLine.Info#getFormats() DataLine.Info.getFormats}), a frame size of
     * <code>AudioSystem.NOT_SPECIFIED</code> means that any frame size is
     * acceptable. <code>AudioSystem.NOT_SPECIFIED</code> is also returned when
     * the frame size is not defined for this audio format.
     * @return the number of bytes per frame,
     * or <code>AudioSystem.NOT_SPECIFIED</code>
     *
     * @see #getSampleSizeInBits()
     * @see AudioSystem#NOT_SPECIFIED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public int getChannels() {

    /**
     * Obtains the number of channels.
     * When this AudioFormat is used for queries (e.g. {@link
     * AudioSystem#isConversionSupported(AudioFormat, AudioFormat)
     * AudioSystem.isConversionSupported}) or capabilities (e.g. {@link
     * DataLine.Info#getFormats() DataLine.Info.getFormats}), a return value of
     * <code>AudioSystem.NOT_SPECIFIED</code> means that any (positive) number of channels is
     * acceptable.
     * @return The number of channels (1 for mono, 2 for stereo, etc.),
     * or <code>AudioSystem.NOT_SPECIFIED</code>
     *
     * @see AudioSystem#NOT_SPECIFIED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public int getSampleSizeInBits() {

    /**
     * Obtains the size of a sample.
     * For compressed formats, the return value is the sample size of the
     * uncompressed audio data.
     * When this AudioFormat is used for queries (e.g. {@link
     * AudioSystem#isConversionSupported(AudioFormat, AudioFormat)
     * AudioSystem.isConversionSupported}) or capabilities (e.g. {@link
     * DataLine.Info#getFormats() DataLine.Info.getFormats}), a sample size of
     * <code>AudioSystem.NOT_SPECIFIED</code> means that any sample size is
     * acceptable. <code>AudioSystem.NOT_SPECIFIED</code> is also returned when
     * the sample size is not defined for this audio format.
     * @return the number of bits in each sample,
     * or <code>AudioSystem.NOT_SPECIFIED</code>
     *
     * @see #getFrameSize()
     * @see AudioSystem#NOT_SPECIFIED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public float getSampleRate() {

    /**
     * Obtains the sample rate.
     * For compressed formats, the return value is the sample rate of the uncompressed
     * audio data.
     * When this AudioFormat is used for queries (e.g. {@link
     * AudioSystem#isConversionSupported(AudioFormat, AudioFormat)
     * AudioSystem.isConversionSupported}) or capabilities (e.g. {@link
     * DataLine.Info#getFormats() DataLine.Info.getFormats}), a sample rate of
     * <code>AudioSystem.NOT_SPECIFIED</code> means that any sample rate is
     * acceptable. <code>AudioSystem.NOT_SPECIFIED</code> is also returned when
     * the sample rate is not defined for this audio format.
     * @return the number of samples per second,
     * or <code>AudioSystem.NOT_SPECIFIED</code>
     *
     * @see #getFrameRate()
     * @see AudioSystem#NOT_SPECIFIED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public Encoding getEncoding() {

    /**
     * Obtains the type of encoding for sounds in this format.
     *
     * @return the encoding type
     * @see Encoding#PCM_SIGNED
     * @see Encoding#PCM_UNSIGNED
     * @see Encoding#ULAW
     * @see Encoding#ALAW
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public AudioFormat(float sampleRate, int sampleSizeInBits,
                       int channels, boolean signed, boolean bigEndian) {

    /**
     * Constructs an <code>AudioFormat</code> with a linear PCM encoding and
     * the given parameters.  The frame size is set to the number of bytes
     * required to contain one sample from each channel, and the frame rate
     * is set to the sample rate.
     *
     * @param sampleRate                the number of samples per second
     * @param sampleSizeInBits  the number of bits in each sample
     * @param channels                  the number of channels (1 for mono, 2 for stereo, and so on)
     * @param signed                    indicates whether the data is signed or unsigned
     * @param bigEndian                 indicates whether the data for a single sample
     *                                                  is stored in big-endian byte order (<code>false</code>
     *                                                  means little-endian)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public AudioFormat(Encoding encoding, float sampleRate,
                       int sampleSizeInBits, int channels,
                       int frameSize, float frameRate,
                       boolean bigEndian, Map<String, Object> properties) {

    /**
     * Constructs an <code>AudioFormat</code> with the given parameters.
     * The encoding specifies the convention used to represent the data.
     * The other parameters are further explained in the {@link AudioFormat
     * class description}.
     * @param encoding         the audio encoding technique
     * @param sampleRate       the number of samples per second
     * @param sampleSizeInBits the number of bits in each sample
     * @param channels         the number of channels (1 for mono, 2 for
     *                         stereo, and so on)
     * @param frameSize        the number of bytes in each frame
     * @param frameRate        the number of frames per second
     * @param bigEndian        indicates whether the data for a single sample
     *                         is stored in big-endian byte order
     *                         (<code>false</code> means little-endian)
     * @param properties       a <code>Map&lt;String,Object&gt;</code> object
     *                         containing format properties
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    public AudioFormat(Encoding encoding, float sampleRate, int sampleSizeInBits,
                       int channels, int frameSize, float frameRate, boolean bigEndian) {

    /**
     * Constructs an <code>AudioFormat</code> with the given parameters.
     * The encoding specifies the convention used to represent the data.
     * The other parameters are further explained in the {@link AudioFormat
     * class description}.
     * @param encoding                  the audio encoding technique
     * @param sampleRate                the number of samples per second
     * @param sampleSizeInBits  the number of bits in each sample
     * @param channels                  the number of channels (1 for mono, 2 for stereo, and so on)
     * @param frameSize                 the number of bytes in each frame
     * @param frameRate                 the number of frames per second
     * @param bigEndian                 indicates whether the data for a single sample
     *                                                  is stored in big-endian byte order (<code>false</code>
     *                                                  means little-endian)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    private HashMap<String, Object> properties;

    /** The set of properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    protected boolean bigEndian;

    /**
     * Indicates whether the audio data is stored in big-endian or little-endian order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    protected float frameRate;

    /**
     * The number of frames played or recorded per second, for sounds that have this format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    protected int frameSize;

    /**
     * The number of bytes in each frame of a sound that has this format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    protected int channels;

    /**
     * The number of audio channels in this format (1 for mono, 2 for stereo).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    protected int sampleSizeInBits;

    /**
     * The number of bits in each sample of a sound that has this format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    protected float sampleRate;

    /**
     * The number of samples played or recorded per second, for sounds that have this format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
    protected Encoding encoding;

    /**
     * The audio encoding technique used by this format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFormat.java
public class AudioFormat {

/**
 * <code>AudioFormat</code> is the class that specifies a particular arrangement of data in a sound stream.
 * By examining the information stored in the audio format, you can discover how to interpret the bits in the
 * binary sound data.
 * <p>
 * Every data line has an audio format associated with its data stream. The audio format of a source (playback) data line indicates
 * what kind of data the data line expects to receive for output.  For a target (capture) data line, the audio format specifies the kind
 * of the data that can be read from the line.
 * Sound files also have audio formats, of course.  The <code>{@link AudioFileFormat}</code>
 * class encapsulates an <code>AudioFormat</code> in addition to other,
 * file-specific information.  Similarly, an <code>{@link AudioInputStream}</code> has an
 * <code>AudioFormat</code>.
 * <p>
 * The <code>AudioFormat</code> class accommodates a number of common sound-file encoding techniques, including
 * pulse-code modulation (PCM), mu-law encoding, and a-law encoding.  These encoding techniques are predefined,
 * but service providers can create new encoding types.
 * The encoding that a specific format uses is named by its <code>encoding</code> field.
 *<p>
 * In addition to the encoding, the audio format includes other properties that further specify the exact
 * arrangement of the data.
 * These include the number of channels, sample rate, sample size, byte order, frame rate, and frame size.
 * Sounds may have different numbers of audio channels: one for mono, two for stereo.
 * The sample rate measures how many "snapshots" (samples) of the sound pressure are taken per second, per channel.
 * (If the sound is stereo rather than mono, two samples are actually measured at each instant of time: one for the left channel,
 * and another for the right channel; however, the sample rate still measures the number per channel, so the rate is the same
 * regardless of the number of channels.   This is the standard use of the term.)
 * The sample size indicates how many bits are used to store each snapshot; 8 and 16 are typical values.
 * For 16-bit samples (or any other sample size larger than a byte),
 * byte order is important; the bytes in each sample are arranged in
 * either the "little-endian" or "big-endian" style.
 * For encodings like PCM, a frame consists of the set of samples for all channels at a given
 * point in time, and so the size of a frame (in bytes) is always equal to the size of a sample (in bytes) times
 * the number of channels.  However, with some other sorts of encodings a frame can contain
 * a bundle of compressed data for a whole series of samples, as well as additional, non-sample
 * data.  For such encodings, the sample rate and sample size refer to the data after it is decoded into PCM,
 * and so they are completely different from the frame rate and frame size.
 *
 * <p>An <code>AudioFormat</code> object can include a set of
 * properties. A property is a pair of key and value: the key
 * is of type <code>String</code>, the associated property
 * value is an arbitrary object. Properties specify
 * additional format specifications, like the bit rate for
 * compressed formats. Properties are mainly used as a means
 * to transport additional information of the audio format
 * to and from the service providers. Therefore, properties
 * are ignored in the {@link #matches(AudioFormat)} method.
 * However, methods which rely on the installed service
 * providers, like {@link AudioSystem#isConversionSupported
 * (AudioFormat, AudioFormat) isConversionSupported} may consider
 * properties, depending on the respective service provider
 * implementation.
 *
 * <p>The following table lists some common properties which
 * service providers should use, if applicable:
 *
 * <table border=0>
 *  <caption>Audio Format Properties</caption>
 *  <tr>
 *   <th>Property key</th>
 *   <th>Value type</th>
 *   <th>Description</th>
 *  </tr>
 *  <tr>
 *   <td>&quot;bitrate&quot;</td>
 *   <td>{@link java.lang.Integer Integer}</td>
 *   <td>average bit rate in bits per second</td>
 *  </tr>
 *  <tr>
 *   <td>&quot;vbr&quot;</td>
 *   <td>{@link java.lang.Boolean Boolean}</td>
 *   <td><code>true</code>, if the file is encoded in variable bit
 *       rate (VBR)</td>
 *  </tr>
 *  <tr>
 *   <td>&quot;quality&quot;</td>
 *   <td>{@link java.lang.Integer Integer}</td>
 *   <td>encoding/conversion quality, 1..100</td>
 *  </tr>
 * </table>
 *
 * <p>Vendors of service providers (plugins) are encouraged
 * to seek information about other already established
 * properties in third party plugins, and follow the same
 * conventions.
 *
 * @author Kara Kytle
 * @author Florian Bomers
 * @see DataLine#getFormat
 * @see AudioInputStream#getFormat
 * @see AudioFileFormat
 * @see javax.sound.sampled.spi.FormatConversionProvider
 * @since 1.3
 */
