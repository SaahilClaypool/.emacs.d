_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileReader.java
    public abstract Sequence getSequence(File file)

    /**
     * Obtains a MIDI sequence from the {@code File} provided. The {@code File}
     * must point to valid MIDI file data.
     *
     * @param  file the {@code File} from which the {@code Sequence} should be
     *         constructed
     * @return a {@code Sequence} object based on the MIDI file data pointed to
     *         by the {@code File}
     * @throws InvalidMidiDataException if the {@code File} does not point to
     *         valid MIDI file data recognized by the system
     * @throws IOException if an I/O exception occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileReader.java
    public abstract Sequence getSequence(URL url)

    /**
     * Obtains a MIDI sequence from the URL provided. The URL must point to
     * valid MIDI file data.
     *
     * @param  url the URL for which the {@code Sequence} should be constructed
     * @return a {@code Sequence} object based on the MIDI file data pointed to
     *         by the URL
     * @throws InvalidMidiDataException if the URL does not point to valid MIDI
     *         file data recognized by the system
     * @throws IOException if an I/O exception occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileReader.java
    public abstract Sequence getSequence(InputStream stream)

    /**
     * Obtains a MIDI sequence from the input stream provided. The stream must
     * point to valid MIDI file data. In general, MIDI file readers may need to
     * read some data from the stream before determining whether they support
     * it. These parsers must be able to mark the stream, read enough data to
     * determine whether they support the stream, and, if not, reset the
     * stream's read pointer to its original position. If the input stream does
     * not support this, this method may fail with an IOException.
     *
     * @param  stream the input stream from which the {@code Sequence} should
     *         be constructed
     * @return a {@code Sequence} object based on the MIDI file data contained
     *         in the input stream.
     * @throws InvalidMidiDataException if the stream does not point to valid
     *         MIDI file data recognized by the system
     * @throws IOException if an I/O exception occurs
     * @see InputStream#markSupported
     * @see InputStream#mark
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileReader.java
    public abstract MidiFileFormat getMidiFileFormat(File file)

    /**
     * Obtains the MIDI file format of the {@code File} provided. The
     * {@code File} must point to valid MIDI file data.
     *
     * @param  file the {@code File} from which file format information should
     *         be extracted
     * @return a {@code MidiFileFormat} object describing the MIDI file format
     * @throws InvalidMidiDataException if the {@code File} does not point to
     *         valid MIDI file data recognized by the system
     * @throws IOException if an I/O exception occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileReader.java
    public abstract MidiFileFormat getMidiFileFormat(URL url)

    /**
     * Obtains the MIDI file format of the URL provided. The URL must point to
     * valid MIDI file data.
     *
     * @param  url the URL from which file format information should be
     *         extracted
     * @return a {@code MidiFileFormat} object describing the MIDI file format
     * @throws InvalidMidiDataException if the URL does not point to valid MIDI
     *         file data recognized by the system
     * @throws IOException if an I/O exception occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileReader.java
    public abstract MidiFileFormat getMidiFileFormat(InputStream stream)

    /**
     * Obtains the MIDI file format of the input stream provided. The stream
     * must point to valid MIDI file data. In general, MIDI file readers may
     * need to read some data from the stream before determining whether they
     * support it. These parsers must be able to mark the stream, read enough
     * data to determine whether they support the stream, and, if not, reset the
     * stream's read pointer to its original position. If the input stream does
     * not support this, this method may fail with an {@code IOException}.
     *
     * @param  stream the input stream from which file format information
     *         should be extracted
     * @return a {@code MidiFileFormat} object describing the MIDI file format
     * @throws InvalidMidiDataException if the stream does not point to valid
     *         MIDI file data recognized by the system
     * @throws IOException if an I/O exception occurs
     * @see InputStream#markSupported
     * @see InputStream#mark
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileReader.java
public abstract class MidiFileReader {

/**
 * A {@code MidiFileReader} supplies MIDI file-reading services. Classes
 * implementing this interface can parse the format information from one or more
 * types of MIDI file, and can produce a {@link Sequence} object from files of
 * these types.
 *
 * @author Kara Kytle
 * @since 1.3
 */
