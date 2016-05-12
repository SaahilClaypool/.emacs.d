_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORBVersionFactory.java
        switch (value) {

        /**
         * Update: If we treat all unknown versions as the latest version
         * then when we send an IOR with a PEORB version to an ORB that
         * doesn't know the PEORB version it will treat it as whatever
         * its idea of the latest version is.  Then, if that IOR is
         * sent back to the server and compared with the original
         * the equality check will fail because the versions will be
         * different.
         *
         * Instead, just capture the version bytes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORBVersionFactory.java
    public static ORBVersion getORBVersion()

    /** Return the current version of this ORB
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORBVersionFactory.java
        switch (value) {

        /**
         * Update: If we treat all unknown versions as the latest version
         * then when we send an IOR with a PEORB version to an ORB that
         * doesn't know the PEORB version it will treat it as whatever
         * its idea of the latest version is.  Then, if that IOR is
         * sent back to the server and compared with the original
         * the equality check will fail because the versions will be
         * different.
         *
         * Instead, just capture the version bytes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orb/ORBVersionFactory.java
    public static ORBVersion getORBVersion()

    /** Return the current version of this ORB
     */
