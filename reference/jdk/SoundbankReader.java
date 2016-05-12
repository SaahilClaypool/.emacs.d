_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/SoundbankReader.java
    public abstract Soundbank getSoundbank(File file)

    /**
     * Obtains a soundbank object from the {@code File} provided.
     *
     * @param  file the {@code File} representing the soundbank
     * @return soundbank object
     * @throws InvalidMidiDataException if the file does not point to valid MIDI
     *         soundbank data recognized by this soundbank reader
     * @throws IOException if an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/SoundbankReader.java
    public abstract Soundbank getSoundbank(InputStream stream)

    /**
     * Obtains a soundbank object from the {@code InputStream} provided.
     *
     * @param  stream {@code InputStream} representing the soundbank
     * @return soundbank object
     * @throws InvalidMidiDataException if the stream does not point to valid
     *         MIDI soundbank data recognized by this soundbank reader
     * @throws IOException if an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/SoundbankReader.java
    public abstract Soundbank getSoundbank(URL url)

    /**
     * Obtains a soundbank object from the URL provided.
     *
     * @param  url URL representing the soundbank.
     * @return soundbank object
     * @throws InvalidMidiDataException if the URL does not point to valid MIDI
     *         soundbank data recognized by this soundbank reader
     * @throws IOException if an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/SoundbankReader.java
public abstract class SoundbankReader {

/**
 * A {@code SoundbankReader} supplies soundbank file-reading services. Concrete
 * subclasses of {@code SoundbankReader} parse a given soundbank file, producing
 * a {@link javax.sound.midi.Soundbank} object that can be loaded into a
 * {@link javax.sound.midi.Synthesizer}.
 *
 * @since 1.3
 * @author Kara Kytle
 */
