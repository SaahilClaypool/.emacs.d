_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/Parsed.java
    TemporalAccessor resolve(ResolverStyle resolverStyle, Set<TemporalField> resolverFields) {

    /**
     * Resolves the fields in this context.
     *
     * @param resolverStyle  the resolver style, not null
     * @param resolverFields  the fields to use for resolving, null for all fields
     * @return this, for method chaining
     * @throws DateTimeException if resolving one field results in a value for
     *  another field that is in conflict
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/Parsed.java
    Parsed copy() {

    /**
     * Creates a copy.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/Parsed.java
    Parsed() {

    /**
     * Creates an instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/Parsed.java
    private LocalTime time;

    /**
     * The resolved time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/Parsed.java
    private ResolverStyle resolverStyle;

    /**
     * The resolver style to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/Parsed.java
    Chronology chrono;

    /**
     * The parsed chronology.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/Parsed.java
    final Map<TemporalField, Long> fieldValues = new HashMap<>();

    /**
     * The parsed fields.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/Parsed.java
final class Parsed implements TemporalAccessor {

/**
 * A store of parsed data.
 * <p>
 * This class is used during parsing to collect the data. Part of the parsing process
 * involves handling optional blocks and multiple copies of the data get created to
 * support the necessary backtracking.
 * <p>
 * Once parsing is completed, this class can be used as the resultant {@code TemporalAccessor}.
 * In most cases, it is only exposed once the fields have been resolved.
 *
 * @implSpec
 * This class is a mutable context intended for use from a single thread.
 * Usage of the class is thread-safe within standard parsing as a new instance of this class
 * is automatically created for each parse and parsing is single-threaded
 *
 * @since 1.8
 */
