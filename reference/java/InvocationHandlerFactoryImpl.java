_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/presentation/rmi/InvocationHandlerFactoryImpl.java
        public Object writeReplace() throws ObjectStreamException

        /** Return the stub, which will actually be written to the stream.
         * It will be custom marshalled, with the actual writing done in
         * StubIORImpl.  There is a corresponding readResolve method on
         * DynamicStubImpl which will re-create the full invocation
         * handler on read, and return the invocation handler on the
         * readResolve method.
         */
