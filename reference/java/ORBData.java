_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORBData.java
    public CodeSetComponentInfo getCodeSetComponentInfo() ;

    /**
    * Get the prefered code sets for connections. Should the client send the
    * code set service context on every request?
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORBData.java
    public int getPersistentServerId();

    /** Return the persistent-server-id of this server. This id is the same
     *  across multiple activations of this server. This is in contrast to
     *  com.sun.corba.se.impl.iiop.ORB.getTransientServerId() which
     *  returns a transient id that is guaranteed to be different
     *  across multiple activations of
     *  this server. The user/environment is required to supply the
     *  persistent-server-id every time this server is started, in
     *  the ORBServerId parameter, System properties, or other means.
     *  The user is also required to ensure that no two persistent servers
     *  on the same host have the same server-id.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orb/ORBData.java
    public short getGIOPTargetAddressPreference() ;

    /**
     * @return the GIOP Target Addressing preference of the ORB.
     * This ORB by default supports all addressing dispositions unless specified
     * otherwise via a java system property ORBConstants.GIOP_TARGET_ADDRESSING
     */
