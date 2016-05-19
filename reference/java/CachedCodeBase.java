_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/encoding/CachedCodeBase.java
public class CachedCodeBase extends _CodeBaseImplBase

/**
 * Provides the reading side with a per connection cache of
 * info obtained via calls to the remote CodeBase.
 *
 * Previously, most of this was in IIOPConnection.
 *
 * Features:
 *    Delays cache creation unless used
 *    Postpones remote calls until necessary
 *    Handles creating obj ref from IOR
 *    Maintains caches for the following maps:
 *         CodeBase IOR to obj ref (global)
 *         RepId to implementation URL(s)
 *         RepId to remote FVD
 *         RepId to superclass type list
 *
 * Needs cache management.
 */
