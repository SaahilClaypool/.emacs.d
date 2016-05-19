_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/OldJIDLObjectKeyTemplate.java
        if (magic == ObjectKeyFactoryImpl.JAVAMAGIC_NEW &&
            osh.value.length > ((CDRInputStream)is).getPosition()) {

        /**
         * Beginning with JDK 1.3.1_01, a byte was placed at the end of
         * the object key with a value indicating the patch version.
         * JDK 1.3.1_01 had the value 1.  If other patches are necessary
         * which involve ORB versioning changes, they should increment
         * the patch version.
         *
         * Note that if we see a value greater than 1 in this code, we
         * will treat it as if we're talking to the most recent ORB version.
         *
         * WARNING: This code is sensitive to changes in CDRInputStream
         * getPosition.  It assumes that the CDRInputStream is an
         * encapsulation whose position can be compared to the object
         * key array length.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/OldJIDLObjectKeyTemplate.java
    public static final byte NULL_PATCH_VERSION = 0;

    /**
     * JDK 1.3.1 FCS did not include a version byte at the end of
     * its object keys.  JDK 1.3.1_01 included the byte with the
     * value 1.  Anything below 1 is considered an invalid value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/OldJIDLObjectKeyTemplate.java
public final class OldJIDLObjectKeyTemplate extends OldObjectKeyTemplateBase

/**
 * Handles object keys created by JDK ORBs from before JDK 1.4.0.
 */
