_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/StubConnectImpl.java
    public static StubIORImpl connect( StubIORImpl ior, org.omg.CORBA.Object proxy,
        org.omg.CORBA.portable.ObjectImpl stub, ORB orb ) throws RemoteException

    /** Connect the stub to the orb if necessary.
    * @param ior The StubIORImpl for this stub (may be null)
    * @param proxy The externally visible stub seen by the user (may be the same as stub)
    * @param stub The stub implementation that extends ObjectImpl
    * @param orb The ORB to which we connect the stub.
    */
