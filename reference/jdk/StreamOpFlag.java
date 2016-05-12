_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static int fromCharacteristics(int characteristics) {

    /**
     * Converts a spliterator characteristic bit set to stream flags.
     *
     * @param characteristics the spliterator characteristic bit set.
     * @return the stream flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static int fromCharacteristics(Spliterator<?> spliterator) {

    /**
     * Converts a spliterator characteristic bit set to stream flags.
     *
     * @implSpec
     * If the spliterator is naturally {@code SORTED} (the associated
     * {@code Comparator} is {@code null}) then the characteristic is converted
     * to the {@link #SORTED} flag, otherwise the characteristic is not
     * converted.
     *
     * @param spliterator the spliterator from which to obtain characteristic
     *        bit set.
     * @return the stream flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static int toCharacteristics(int streamFlags) {

    /**
     * Converts stream flags to a spliterator characteristic bit set.
     *
     * @param streamFlags the stream flags.
     * @return the spliterator characteristic bit set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static int toStreamFlags(int combOpFlags) {

    /**
     * Converts combined stream and operation flags to stream flags.
     *
     * <p>Each flag injected on the combined stream and operation flags will be
     * set on the stream flags.
     *
     * @param combOpFlags the combined stream and operation flags.
     * @return the stream flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static int combineOpFlags(int newStreamOrOpFlags, int prevCombOpFlags) {

    /**
     * Combines stream or operation flags with previously combined stream and
     * operation flags to produce updated combined stream and operation flags.
     * <p>
     * A flag set on stream flags or injected on operation flags,
     * and injected combined stream and operation flags,
     * will be injected on the updated combined stream and operation flags.
     *
     * <p>
     * A flag set on stream flags or injected on operation flags,
     * and cleared on the combined stream and operation flags,
     * will be cleared on the updated combined stream and operation flags.
     *
     * <p>
     * A flag set on the stream flags or injected on operation flags,
     * and preserved on the combined stream and operation flags,
     * will be injected on the updated combined stream and operation flags.
     *
     * <p>
     * A flag not set on the stream flags or cleared/preserved on operation
     * flags, and injected on the combined stream and operation flags,
     * will be injected on the updated combined stream and operation flags.
     *
     * <p>
     * A flag not set on the stream flags or cleared/preserved on operation
     * flags, and cleared on the combined stream and operation flags,
     * will be cleared on the updated combined stream and operation flags.
     *
     * <p>
     * A flag not set on the stream flags,
     * and preserved on the combined stream and operation flags
     * will be preserved on the updated combined stream and operation flags.
     *
     * <p>
     * A flag cleared on operation flags,
     * and preserved on the combined stream and operation flags
     * will be cleared on the updated combined stream and operation flags.
     *
     * <p>
     * A flag preserved on operation flags,
     * and preserved on the combined stream and operation flags
     * will be preserved on the updated combined stream and operation flags.
     *
     * @param newStreamOrOpFlags the stream or operation flags.
     * @param prevCombOpFlags previously combined stream and operation flags.
     *        The value {#link INITIAL_OPS_VALUE} must be used as the seed value.
     * @return the updated combined stream and operation flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int IS_SHORT_CIRCUIT = SHORT_CIRCUIT.set;

    /**
     * The bit value to inject {@link #SHORT_CIRCUIT}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int NOT_SIZED = SIZED.clear;

    /**
     * The bit value to clear {@link #SIZED}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int IS_SIZED = SIZED.set;

    /**
     * The bit value to set {@link #SIZED}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int NOT_ORDERED = ORDERED.clear;

    /**
     * The bit value to clear {@link #ORDERED}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int IS_ORDERED = ORDERED.set;

    /**
     * The bit value to set or inject {@link #ORDERED}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int NOT_SORTED = SORTED.clear;

    /**
     * The bit value to clear {@link #SORTED}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int IS_SORTED = SORTED.set;

    /**
     * The bit value to set or inject {@link #SORTED}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int NOT_DISTINCT = DISTINCT.clear;

    /**
     * The bit value to clear {@link #DISTINCT}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int IS_DISTINCT = DISTINCT.set;

    /**
     * The bit value to set or inject {@link #DISTINCT}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int INITIAL_OPS_VALUE = FLAG_MASK_IS | FLAG_MASK_NOT;

    /**
     * The initial value to be combined with the stream flags of the first
     * stream in the pipeline.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private static final int FLAG_MASK_NOT = STREAM_MASK << 1;

    /**
     * Flag mask for stream flags that are cleared.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private static final int FLAG_MASK_IS = STREAM_MASK;

    /**
     * Flag mask for stream flags that are set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private static final int FLAG_MASK = createFlagMask();

    /**
     * Complete flag mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int UPSTREAM_TERMINAL_OP_MASK = createMask(Type.UPSTREAM_TERMINAL_OP);

    /**
     * The bit mask for upstream terminal operation flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int TERMINAL_OP_MASK = createMask(Type.TERMINAL_OP);

    /**
     * The bit mask for terminal operation flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int OP_MASK = createMask(Type.OP);

    /**
     * The bit mask for intermediate operation flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int STREAM_MASK = createMask(Type.STREAM);

    /**
     * The bit mask for source stream flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    static final int SPLITERATOR_CHARACTERISTICS_MASK = createMask(Type.SPLITERATOR);

    /**
     * The bit mask for spliterator characteristics
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    boolean canSet(Type t) {

    /**
     * Determines if this flag can be set for a flag type.
     *
     * @param t the flag type.
     * @return true if this flag can be set for the flag type, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    boolean isPreserved(int flags) {

    /**
     * Checks if this flag is preserved on combined stream and operation flags.
     *
     * @param flags the combined stream and operations flags.
     * @return true if this flag is preserved, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    boolean isCleared(int flags) {

    /**
     * Checks if this flag is cleared on operation flags or combined stream and
     * operation flags.
     *
     * @param flags the operation flags or combined stream and operations flags.
     * @return true if this flag is preserved, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    boolean isKnown(int flags) {

    /**
     * Checks if this flag is set on stream flags, injected on operation flags,
     * and injected on combined stream and operation flags.
     *
     * @param flags the stream flags, operation flags, or combined stream and
     *        operation flags
     * @return true if this flag is known, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    boolean isStreamFlag() {

    /**
     * Determines if this flag is a stream-based flag.
     *
     * @return true if a stream-based flag, otherwise false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    int clear() {

    /**
     * Gets the bitmap associated with clearing this characteristic.
     *
     * @return the bitmap for clearing this characteristic
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    int set() {

    /**
     * Gets the bitmap associated with setting this characteristic.
     *
     * @return the bitmap for setting this characteristic
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private final int preserve;

    /**
     * The preserve 2 bit set offset at the bit position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private final int clear;

    /**
     * The clear 2 bit set offset at the bit position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private final int set;

    /**
     * The set 2 bit set offset at the bit position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private final int bitPosition;

    /**
     * The bit position in the bit mask.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private final Map<Type, Integer> maskTable;

    /**
     * The mask table for a flag, this is used to determine if a flag
     * corresponds to a certain flag type and for creating mask constants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private static final int PRESERVE_BITS = 0b11;

    /**
     * The bit pattern for preserving a flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private static final int CLEAR_BITS = 0b10;

    /**
     * The bit pattern for clearing a flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    private static final int SET_BITS = 0b01;

    /**
     * The bit pattern for setting/injecting a flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
        UPSTREAM_TERMINAL_OP

        /**
         * The flag is associated with terminal operation flags that are
         * propagated upstream across the last stateful operation boundary
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
        TERMINAL_OP,

        /**
         * The flag is associated with terminal operation flags.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
        OP,

        /**
         * The flag is associated with intermediate operation flags.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
        STREAM,

        /**
         * The flag is associated with stream flags.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    enum Type {

    /**
     * Type of a flag
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    // 12, 0x01000000

    /**
     * Characteristic value signifying that an operation may short-circuit the
     * stream.
     * <p>
     * An intermediate operation can preserve or inject this value,
     * or a terminal operation can preserve or inject this value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    // 3, 0x00000040

    /**
     * Characteristic value signifying that size of the stream
     * is of a known finite size that is equal to the known finite
     * size of the source spliterator input to the first stream
     * in the pipeline.
     * <p>
     * A stream can have this value or an intermediate operation can preserve or
     * clear this value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    // 2, 0x00000010

    /**
     * Characteristic value signifying that an encounter order is
     * defined for stream elements.
     * <p>
     * A stream can have this value, an intermediate operation can preserve,
     * clear or inject this value, or a terminal operation can preserve or clear
     * this value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    // 1, 0x00000004

    /**
     * Characteristic value signifying that encounter order follows a natural
     * sort order of comparable elements.
     * <p>
     * A stream can have this value or an intermediate operation can preserve,
     * clear or inject this value.
     * <p>
     * Note: The {@link java.util.Spliterator#SORTED} characteristic can define
     * a sort order with an associated non-null comparator.  Augmenting flag
     * state with addition properties such that those properties can be passed
     * to operations requires some disruptive changes for a singular use-case.
     * Furthermore, comparing comparators for equality beyond that of identity
     * is likely to be unreliable.  Therefore the {@code SORTED} characteristic
     * for a defined non-natural sort order is not mapped internally to the
     * {@code SORTED} flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
    // 0, 0x00000001

    /**
     * Characteristic value signifying that, for each pair of
     * encountered elements in a stream {@code x, y}, {@code !x.equals(y)}.
     * <p>
     * A stream may have this value or an intermediate operation can preserve,
     * clear or inject this value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/StreamOpFlag.java
enum StreamOpFlag {

/**
 * Flags corresponding to characteristics of streams and operations. Flags are
 * utilized by the stream framework to control, specialize or optimize
 * computation.
 *
 * <p>
 * Stream flags may be used to describe characteristics of several different
 * entities associated with streams: stream sources, intermediate operations,
 * and terminal operations.  Not all stream flags are meaningful for all
 * entities; the following table summarizes which flags are meaningful in what
 * contexts:
 *
 * <div>
 * <table>
 *   <caption>Type Characteristics</caption>
 *   <thead class="tableSubHeadingColor">
 *     <tr>
 *       <th colspan="2">&nbsp;</th>
 *       <th>{@code DISTINCT}</th>
 *       <th>{@code SORTED}</th>
 *       <th>{@code ORDERED}</th>
 *       <th>{@code SIZED}</th>
 *       <th>{@code SHORT_CIRCUIT}</th>
 *     </tr>
 *   </thead>
 *   <tbody>
 *      <tr>
 *        <th colspan="2" class="tableSubHeadingColor">Stream source</th>
 *        <td>Y</td>
 *        <td>Y</td>
 *        <td>Y</td>
 *        <td>Y</td>
 *        <td>N</td>
 *      </tr>
 *      <tr>
 *        <th colspan="2" class="tableSubHeadingColor">Intermediate operation</th>
 *        <td>PCI</td>
 *        <td>PCI</td>
 *        <td>PCI</td>
 *        <td>PC</td>
 *        <td>PI</td>
 *      </tr>
 *      <tr>
 *        <th colspan="2" class="tableSubHeadingColor">Terminal operation</th>
 *        <td>N</td>
 *        <td>N</td>
 *        <td>PC</td>
 *        <td>N</td>
 *        <td>PI</td>
 *      </tr>
 *   </tbody>
 *   <tfoot>
 *       <tr>
 *         <th class="tableSubHeadingColor" colspan="2">Legend</th>
 *         <th colspan="6" rowspan="7">&nbsp;</th>
 *       </tr>
 *       <tr>
 *         <th class="tableSubHeadingColor">Flag</th>
 *         <th class="tableSubHeadingColor">Meaning</th>
 *         <th colspan="6"></th>
 *       </tr>
 *       <tr><td>Y</td><td>Allowed</td></tr>
 *       <tr><td>N</td><td>Invalid</td></tr>
 *       <tr><td>P</td><td>Preserves</td></tr>
 *       <tr><td>C</td><td>Clears</td></tr>
 *       <tr><td>I</td><td>Injects</td></tr>
 *   </tfoot>
 * </table>
 * </div>
 *
 * <p>In the above table, "PCI" means "may preserve, clear, or inject"; "PC"
 * means "may preserve or clear", "PI" means "may preserve or inject", and "N"
 * means "not valid".
 *
 * <p>Stream flags are represented by unioned bit sets, so that a single word
 * may describe all the characteristics of a given stream entity, and that, for
 * example, the flags for a stream source can be efficiently combined with the
 * flags for later operations on that stream.
 *
 * <p>The bit masks {@link #STREAM_MASK}, {@link #OP_MASK}, and
 * {@link #TERMINAL_OP_MASK} can be ANDed with a bit set of stream flags to
 * produce a mask containing only the valid flags for that entity type.
 *
 * <p>When describing a stream source, one only need describe what
 * characteristics that stream has; when describing a stream operation, one need
 * describe whether the operation preserves, injects, or clears that
 * characteristic.  Accordingly, two bits are used for each flag, so as to allow
 * representing not only the presence of of a characteristic, but how an
 * operation modifies that characteristic.  There are two common forms in which
 * flag bits are combined into an {@code int} bit set.  <em>Stream flags</em>
 * are a unioned bit set constructed by ORing the enum characteristic values of
 * {@link #set()} (or, more commonly, ORing the corresponding static named
 * constants prefixed with {@code IS_}).  <em>Operation flags</em> are a unioned
 * bit set constructed by ORing the enum characteristic values of {@link #set()}
 * or {@link #clear()} (to inject, or clear, respectively, the corresponding
 * flag), or more commonly ORing the corresponding named constants prefixed with
 * {@code IS_} or {@code NOT_}.  Flags that are not marked with {@code IS_} or
 * {@code NOT_} are implicitly treated as preserved.  Care must be taken when
 * combining bitsets that the correct combining operations are applied in the
 * correct order.
 *
 * <p>
 * With the exception of {@link #SHORT_CIRCUIT}, stream characteristics can be
 * derived from the equivalent {@link java.util.Spliterator} characteristics:
 * {@link java.util.Spliterator#DISTINCT}, {@link java.util.Spliterator#SORTED},
 * {@link java.util.Spliterator#ORDERED}, and
 * {@link java.util.Spliterator#SIZED}.  A spliterator characteristics bit set
 * can be converted to stream flags using the method
 * {@link #fromCharacteristics(java.util.Spliterator)} and converted back using
 * {@link #toCharacteristics(int)}.  (The bit set
 * {@link #SPLITERATOR_CHARACTERISTICS_MASK} is used to AND with a bit set to
 * produce a valid spliterator characteristics bit set that can be converted to
 * stream flags.)
 *
 * <p>
 * The source of a stream encapsulates a spliterator. The characteristics of
 * that source spliterator when transformed to stream flags will be a proper
 * subset of stream flags of that stream.
 * For example:
 * <pre> {@code
 *     Spliterator s = ...;
 *     Stream stream = Streams.stream(s);
 *     flagsFromSplitr = fromCharacteristics(s.characteristics());
 *     assert(flagsFromSplitr & stream.getStreamFlags() == flagsFromSplitr);
 * }</pre>
 *
 * <p>
 * An intermediate operation, performed on an input stream to create a new
 * output stream, may preserve, clear or inject stream or operation
 * characteristics.  Similarly, a terminal operation, performed on an input
 * stream to produce an output result may preserve, clear or inject stream or
 * operation characteristics.  Preservation means that if that characteristic
 * is present on the input, then it is also present on the output.  Clearing
 * means that the characteristic is not present on the output regardless of the
 * input.  Injection means that the characteristic is present on the output
 * regardless of the input.  If a characteristic is not cleared or injected then
 * it is implicitly preserved.
 *
 * <p>
 * A pipeline consists of a stream source encapsulating a spliterator, one or
 * more intermediate operations, and finally a terminal operation that produces
 * a result.  At each stage of the pipeline, a combined stream and operation
 * flags can be calculated, using {@link #combineOpFlags(int, int)}.  Such flags
 * ensure that preservation, clearing and injecting information is retained at
 * each stage.
 *
 * The combined stream and operation flags for the source stage of the pipeline
 * is calculated as follows:
 * <pre> {@code
 *     int flagsForSourceStage = combineOpFlags(sourceFlags, INITIAL_OPS_VALUE);
 * }</pre>
 *
 * The combined stream and operation flags of each subsequent intermediate
 * operation stage in the pipeline is calculated as follows:
 * <pre> {@code
 *     int flagsForThisStage = combineOpFlags(flagsForPreviousStage, thisOpFlags);
 * }</pre>
 *
 * Finally the flags output from the last intermediate operation of the pipeline
 * are combined with the operation flags of the terminal operation to produce
 * the flags output from the pipeline.
 *
 * <p>Those flags can then be used to apply optimizations. For example, if
 * {@code SIZED.isKnown(flags)} returns true then the stream size remains
 * constant throughout the pipeline, this information can be utilized to
 * pre-allocate data structures and combined with
 * {@link java.util.Spliterator#SUBSIZED} that information can be utilized to
 * perform concurrent in-place updates into a shared array.
 *
 * For specific details see the {@link AbstractPipeline} constructors.
 *
 * @since 1.8
 */
