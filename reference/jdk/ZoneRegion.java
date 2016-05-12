_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/ZoneRegion.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/ZoneRegion.java
    private Object writeReplace() {

    /**
     * Writes the object using a
     * <a href="../../serialized-form.html#java.time.Ser">dedicated serialized form</a>.
     * @serialData
     * <pre>
     *  out.writeByte(7);  // identifies a ZoneId (not ZoneOffset)
     *  out.writeUTF(zoneId);
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/ZoneRegion.java
    ZoneRegion(String id, ZoneRules rules) {

    /**
     * Constructor.
     *
     * @param id  the time-zone ID, not null
     * @param rules  the rules, null for lazy lookup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/ZoneRegion.java
    private static void checkName(String zoneId) {

    /**
     * Checks that the given string is a legal ZondId name.
     *
     * @param zoneId  the time-zone ID, not null
     * @throws DateTimeException if the ID format is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/ZoneRegion.java
    static ZoneRegion ofId(String zoneId, boolean checkAvailable) {

    /**
     * Obtains an instance of {@code ZoneId} from an identifier.
     *
     * @param zoneId  the time-zone ID, not null
     * @param checkAvailable  whether to check if the zone ID is available
     * @return the zone ID, not null
     * @throws DateTimeException if the ID format is invalid
     * @throws ZoneRulesException if checking availability and the ID cannot be found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/ZoneRegion.java
    private final transient ZoneRules rules;

    /**
     * The time-zone rules, null if zone ID was loaded leniently.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/ZoneRegion.java
    private static final long serialVersionUID = 8386373296231747096L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/ZoneRegion.java
final class ZoneRegion extends ZoneId implements Serializable {

/**
 * A geographical region where the same time-zone rules apply.
 * <p>
 * Time-zone information is categorized as a set of rules defining when and
 * how the offset from UTC/Greenwich changes. These rules are accessed using
 * identifiers based on geographical regions, such as countries or states.
 * The most common region classification is the Time Zone Database (TZDB),
 * which defines regions such as 'Europe/Paris' and 'Asia/Tokyo'.
 * <p>
 * The region identifier, modeled by this class, is distinct from the
 * underlying rules, modeled by {@link ZoneRules}.
 * The rules are defined by governments and change frequently.
 * By contrast, the region identifier is well-defined and long-lived.
 * This separation also allows rules to be shared between regions if appropriate.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
