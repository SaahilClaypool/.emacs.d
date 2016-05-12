_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileWriter.java
    public abstract int write(Sequence in, int fileType, File out)

    /**
     * Writes a stream of bytes representing a MIDI file of the file type
     * indicated to the external file provided.
     *
     * @param  in sequence containing MIDI data to be written to the external
     *         file
     * @param  fileType type of the file to be written to the external file
     * @param  out external file to which the file data should be written
     * @return the number of bytes written to the file
     * @throws IOException if an I/O exception occurs
     * @throws IllegalArgumentException if the file type is not supported by
     *         this file writer
     * @see #isFileTypeSupported(int, Sequence)
     * @see #getMidiFileTypes(Sequence)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileWriter.java
    public abstract int write(Sequence in, int fileType, OutputStream out)

    /**
     * Writes a stream of bytes representing a MIDI file of the file type
     * indicated to the output stream provided.
     *
     * @param  in sequence containing MIDI data to be written to the file
     * @param  fileType type of the file to be written to the output stream
     * @param  out stream to which the file data should be written
     * @return the number of bytes written to the output stream
     * @throws IOException if an I/O exception occurs
     * @throws IllegalArgumentException if the file type is not supported by
     *         this file writer
     * @see #isFileTypeSupported(int, Sequence)
     * @see #getMidiFileTypes(Sequence)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileWriter.java
    public boolean isFileTypeSupported(int fileType, Sequence sequence) {

    /**
     * Indicates whether a MIDI file of the file type specified can be written
     * from the sequence indicated.
     *
     * @param  fileType the file type for which write capabilities are queried
     * @param  sequence the sequence for which file writing support is queried
     * @return {@code true} if the file type is supported for this sequence,
     *         otherwise {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileWriter.java
    public boolean isFileTypeSupported(int fileType) {

    /**
     * Indicates whether file writing support for the specified MIDI file type
     * is provided by this file writer.
     *
     * @param  fileType the file type for which write capabilities are queried
     * @return {@code true} if the file type is supported, otherwise
     *         {@code false}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileWriter.java
    public abstract int[] getMidiFileTypes(Sequence sequence);

    /**
     * Obtains the file types that this file writer can write from the sequence
     * specified.
     *
     * @param  sequence the sequence for which MIDI file type support is
     *         queried
     * @return array of file types. If no file types are supported, returns an
     *         array of length 0.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileWriter.java
    public abstract int[] getMidiFileTypes();

    /**
     * Obtains the set of MIDI file types for which file writing support is
     * provided by this file writer.
     *
     * @return array of file types. If no file types are supported, an array of
     *         length 0 is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/midi/spi/MidiFileWriter.java
public abstract class MidiFileWriter {

/**
 * A {@code MidiFileWriter} supplies MIDI file-writing services. Classes that
 * implement this interface can write one or more types of MIDI file from a
 * {@link Sequence} object.
 *
 * @author Kara Kytle
 * @since 1.3
 */
