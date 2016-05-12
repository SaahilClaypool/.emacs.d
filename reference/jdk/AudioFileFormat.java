_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public String getExtension() {

        /**
         * Obtains the common file name extension for this file type.
         * @return file type extension
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public final String toString() {

        /**
         * Provides the file type's name as the <code>String</code> representation
         * of the file type.
         * @return the file type's name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public final int hashCode() {

        /**
         * Finalizes the hashCode method
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public final boolean equals(Object obj) {

        /**
         * Finalizes the equals method
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public Type(String name, String extension) {

        /**
         * Constructs a file type.
         * @param name the string that names the file type
         * @param extension the string that commonly marks the file type
         * without leading dot.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        private final String extension;

        /**
         * File type extension.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        private final String name;

        /**
         * File type name.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public static final Type SND = new Type("SND", "snd");

        /**
         * Specifies a SND file.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public static final Type AIFC = new Type("AIFF-C", "aifc");

        /**
         * Specifies an AIFF-C file.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public static final Type AIFF = new Type("AIFF", "aif");

        /**
         * Specifies an AIFF file.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public static final Type AU = new Type("AU", "au");

        /**
         * Specifies an AU file.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
        public static final Type WAVE = new Type("WAVE", "wav");

        /**
         * Specifies a WAVE file.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    public static class Type {

    /**
     * An instance of the <code>Type</code> class represents one of the
     * standard types of audio file.  Static instances are provided for the
     * common types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    public String toString() {

    /**
     * Provides a string representation of the file format.
     * @return the file format as a string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    public int getFrameLength() {

    /**
     * Obtains the length of the audio data contained in the file, expressed in sample frames.
     * @return the number of sample frames of audio data in the file
     * @see AudioSystem#NOT_SPECIFIED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    public AudioFormat getFormat() {

    /**
     * Obtains the format of the audio data contained in the audio file.
     * @return the audio data format
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    public int getByteLength() {

    /**
     * Obtains the size in bytes of the entire audio file (not just its audio data).
     * @return the audio file length in bytes
     * @see AudioSystem#NOT_SPECIFIED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    public Type getType() {

    /**
     * Obtains the audio file type, such as <code>WAVE</code> or <code>AU</code>.
     * @return the audio file type
     *
     * @see Type#WAVE
     * @see Type#AU
     * @see Type#AIFF
     * @see Type#AIFC
     * @see Type#SND
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    public AudioFileFormat(Type type, AudioFormat format,
                           int frameLength, Map<String, Object> properties) {

    /**
     * Construct an audio file format object with a set of
     * defined properties.
     * This public constructor may be used by applications to describe the
     * properties of a requested audio file. The properties map
     * will be copied to prevent any changes to it.
     *
     * @param type        the type of the audio file
     * @param format      the format of the audio data contained in the file
     * @param frameLength the audio data length in sample frames, or
     *                    <code>AudioSystem.NOT_SPECIFIED</code>
     * @param properties  a <code>Map&lt;String,Object&gt;</code> object
     *        with properties
     *
     * @since 1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    public AudioFileFormat(Type type, AudioFormat format, int frameLength) {

    /**
     * Constructs an audio file format object.
     * This public constructor may be used by applications to describe the
     * properties of a requested audio file.
     * @param type the type of the audio file
     * @param format the format of the audio data contained in the file
     * @param frameLength the audio data length in sample frames, or <code>AudioSystem.NOT_SPECIFIED</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    protected AudioFileFormat(Type type, int byteLength, AudioFormat format, int frameLength) {

    /**
     * Constructs an audio file format object.
     * This protected constructor is intended for use by providers of file-reading
     * services when returning information about an audio file or about supported audio file
     * formats.
     * @param type the type of the audio file
     * @param byteLength the length of the file in bytes, or <code>AudioSystem.NOT_SPECIFIED</code>
     * @param format the format of the audio data contained in the file
     * @param frameLength the audio data length in sample frames, or <code>AudioSystem.NOT_SPECIFIED</code>
     *
     * @see #getType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    private HashMap<String, Object> properties;

    /** The set of properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    private int frameLength;

    /**
     * Audio data length in sample frames
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    private AudioFormat format;

    /**
     * Format of the audio data contained in the file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    private int byteLength;

    /**
     * File length in bytes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
    private Type type;

    /**
     * File type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/AudioFileFormat.java
public class AudioFileFormat {

/**
 * An instance of the <code>AudioFileFormat</code> class describes
 * an audio file, including the file type, the file's length in bytes,
 * the length in sample frames of the audio data contained in the file,
 * and the format of the audio data.
 * <p>
 * The <code>{@link AudioSystem}</code> class includes methods for determining the format
 * of an audio file, obtaining an audio input stream from an audio file, and
 * writing an audio file from an audio input stream.
 *
 * <p>An <code>AudioFileFormat</code> object can
 * include a set of properties. A property is a pair of key and value:
 * the key is of type <code>String</code>, the associated property
 * value is an arbitrary object.
 * Properties specify additional informational
 * meta data (like a author, copyright, or file duration).
 * Properties are optional information, and file reader and file
 * writer implementations are not required to provide or
 * recognize properties.
 *
 * <p>The following table lists some common properties that should
 * be used in implementations:
 *
 * <table border=1>
 *  <caption>Audio File Format Properties</caption>
 *  <tr>
 *   <th>Property key</th>
 *   <th>Value type</th>
 *   <th>Description</th>
 *  </tr>
 *  <tr>
 *   <td>&quot;duration&quot;</td>
 *   <td>{@link java.lang.Long Long}</td>
 *   <td>playback duration of the file in microseconds</td>
 *  </tr>
 *  <tr>
 *   <td>&quot;author&quot;</td>
 *   <td>{@link java.lang.String String}</td>
 *   <td>name of the author of this file</td>
 *  </tr>
 *  <tr>
 *   <td>&quot;title&quot;</td>
 *   <td>{@link java.lang.String String}</td>
 *   <td>title of this file</td>
 *  </tr>
 *  <tr>
 *   <td>&quot;copyright&quot;</td>
 *   <td>{@link java.lang.String String}</td>
 *   <td>copyright message</td>
 *  </tr>
 *  <tr>
 *   <td>&quot;date&quot;</td>
 *   <td>{@link java.util.Date Date}</td>
 *   <td>date of the recording or release</td>
 *  </tr>
 *  <tr>
 *   <td>&quot;comment&quot;</td>
 *   <td>{@link java.lang.String String}</td>
 *   <td>an arbitrary text</td>
 *  </tr>
 * </table>
 *
 *
 * @author David Rivas
 * @author Kara Kytle
 * @author Florian Bomers
 * @see AudioInputStream
 * @since 1.3
 */
