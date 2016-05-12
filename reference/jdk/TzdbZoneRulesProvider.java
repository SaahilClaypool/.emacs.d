_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/TzdbZoneRulesProvider.java
    private void load(DataInputStream dis) throws Exception {

    /**
     * Loads the rules from a DateInputStream, often in a jar file.
     *
     * @param dis  the DateInputStream to load, not null
     * @throws Exception if an error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/TzdbZoneRulesProvider.java
    public TzdbZoneRulesProvider() {

    /**
     * Creates an instance.
     * Created by the {@code ServiceLoader}.
     *
     * @throws ZoneRulesException if unable to load
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/TzdbZoneRulesProvider.java
    private final Map<String, Object> regionToRules = new ConcurrentHashMap<>();

    /**
     * Region to rules mapping
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/TzdbZoneRulesProvider.java
    private List<String> regionIds;

    /**
     * All the regions that are available.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/zone/TzdbZoneRulesProvider.java
final class TzdbZoneRulesProvider extends ZoneRulesProvider {

/**
 * Loads time-zone rules for 'TZDB'.
 *
 * @since 1.8
 */
