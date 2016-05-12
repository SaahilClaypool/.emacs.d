_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaName.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class MediaTray.
     * @return the enumeration value table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaName.java
    protected String[] getStringTable()

    /**
     * Returns the string table for class MediaTray.
     * @return the String table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaName.java
    protected MediaName(int value) {

    /**
     * Constructs a new media name enumeration value with the given integer
     * value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaName.java
    public static final MediaName ISO_A4_TRANSPARENT= new MediaName(3);

    /**
     *  A4 transparency.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaName.java
    public static final MediaName ISO_A4_WHITE = new MediaName(2);

    /**
     * white A4 paper.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaName.java
    public static final MediaName NA_LETTER_TRANSPARENT = new MediaName(1);

    /**
     *  letter transparency.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaName.java
    public static final MediaName NA_LETTER_WHITE = new MediaName(0);

    /**
     *  white letter paper.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaName.java
public class MediaName extends Media implements Attribute {

/**
 * Class MediaName is a subclass of Media, a printing attribute class (an
 * enumeration) that specifies the media for a print job as a name.
 * <P>
 * This attribute can be used instead of specifying MediaSize or MediaTray.
 * <p>
 * Class MediaName currently declares a few standard media names.
 * Implementation- or site-defined names for a media name attribute may also
 * be created by defining a subclass of class MediaName.
 * <P>
 * <B>IPP Compatibility:</B> MediaName is a representation class for
 * values of the IPP "media" attribute which names media.
 * <P>
 *
 */
