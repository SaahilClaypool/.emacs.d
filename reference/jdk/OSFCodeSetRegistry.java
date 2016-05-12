_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static Entry lookupEntry(int encodingValue) {

    /**
     * Given an OSF registry value, return the corresponding Entry.
     * Returns null if an Entry for that value is unavailable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static final Entry ISO_646

    /**
     * This is the encoding older JavaSoft ORBs advertised as their
     * CORBA char code set.  Actually, they took the lower byte of
     * the Java char.  This is a 7-bit encoding, so they
     * were really sending ISO8859-1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static final Entry UTF_8

    /**
     * Fallback char code set.  Also the code set for char data
     * in encapsulations.  However, since CORBA says chars are
     * only one octet, it is really the same as Latin-1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static final Entry UTF_16

    /**
     * Fallback wchar code set.
     *
     * In the resolution of issue 3405b, UTF-16 defaults to big endian, so
     * doesn't have to have a byte order marker.  Unfortunately, this has to be
     * a special case for compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    static final Entry UTF_16BE

    /**
     * UTF-16 as specified in the OSF registry has an optional
     * byte order marker.  UTF-16BE and UTF-16LE are not in the OSF
     * registry since it is no longer being developed.  When the OMG
     * switches to the IANA registry, these can be public.  Right
     * now, they're used internally by CodeSetConversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static final Entry ISO_8859_1

    /**
     * 8-bit encoding required for GIOP 1.0, and used as the char set
     * when nothing else is specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public int hashCode() {

        /**
         * Uses the registry number as the hash code.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public boolean equals(Object obj) {

        /**
         * First checks reference equality since it's expected
         * people will use the pre-defined constant Entries.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public boolean isFixedWidth() {

        /**
         * Is this a fixed or variable width code set?  (In CORBA
         * terms, "non-byte-oriented" or a "byte-oriented"
         * code set, respectively)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public int getNumber() {

        /**
         * Get the OSF registry number for this code set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public String getName() {

        /**
         * Returns the Java equivalent name.  If the encoding has
         * an optional byte order marker, this name will map to the
         * Java encoding that includes the marker.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public final static class Entry

    /**
     * An entry in the OSF registry which allows users
     * to find out the equivalent Java character encoding
     * name as well as some other facts from the registry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
public final class OSFCodeSetRegistry

/**
 *
 * Information from the OSF code set registry version 1.2g.
 *
 * Use the Entry corresponding to the desired code set.
 *
 * Consider rename to CodeSetRegistry since OSF is dead.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static Entry lookupEntry(int encodingValue) {

    /**
     * Given an OSF registry value, return the corresponding Entry.
     * Returns null if an Entry for that value is unavailable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static final Entry ISO_646

    /**
     * This is the encoding older JavaSoft ORBs advertised as their
     * CORBA char code set.  Actually, they took the lower byte of
     * the Java char.  This is a 7-bit encoding, so they
     * were really sending ISO8859-1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static final Entry UTF_8

    /**
     * Fallback char code set.  Also the code set for char data
     * in encapsulations.  However, since CORBA says chars are
     * only one octet, it is really the same as Latin-1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static final Entry UTF_16

    /**
     * Fallback wchar code set.
     *
     * In the resolution of issue 3405b, UTF-16 defaults to big endian, so
     * doesn't have to have a byte order marker.  Unfortunately, this has to be
     * a special case for compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    static final Entry UTF_16BE

    /**
     * UTF-16 as specified in the OSF registry has an optional
     * byte order marker.  UTF-16BE and UTF-16LE are not in the OSF
     * registry since it is no longer being developed.  When the OMG
     * switches to the IANA registry, these can be public.  Right
     * now, they're used internally by CodeSetConversion.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public static final Entry ISO_8859_1

    /**
     * 8-bit encoding required for GIOP 1.0, and used as the char set
     * when nothing else is specified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public int hashCode() {

        /**
         * Uses the registry number as the hash code.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public boolean equals(Object obj) {

        /**
         * First checks reference equality since it's expected
         * people will use the pre-defined constant Entries.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public boolean isFixedWidth() {

        /**
         * Is this a fixed or variable width code set?  (In CORBA
         * terms, "non-byte-oriented" or a "byte-oriented"
         * code set, respectively)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public int getNumber() {

        /**
         * Get the OSF registry number for this code set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
        public String getName() {

        /**
         * Returns the Java equivalent name.  If the encoding has
         * an optional byte order marker, this name will map to the
         * Java encoding that includes the marker.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
    public final static class Entry

    /**
     * An entry in the OSF registry which allows users
     * to find out the equivalent Java character encoding
     * name as well as some other facts from the registry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/encoding/OSFCodeSetRegistry.java
public final class OSFCodeSetRegistry

/**
 *
 * Information from the OSF code set registry version 1.2g.
 *
 * Use the Entry corresponding to the desired code set.
 *
 * Consider rename to CodeSetRegistry since OSF is dead.
 */
