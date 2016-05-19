_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/io/ObjectStreamClassCorbaExt.java
    static final boolean isAbstractInterface(Class cl) {

    /**
     * Return true, iff,
     *
     * 1. 'cl' is an interface, and
     * 2. 'cl' and all its ancestors do not implement java.rmi.Remote, and
     * 3. if 'cl' has no methods (including those of its ancestors), or,
     *    if all the methods (including those of its ancestors) throw an
     *    exception that is atleast java.rmi.RemoteException or one of
     *    java.rmi.RemoteException's super classes.
     */
