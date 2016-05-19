_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp

////////////////////////////////////////////////////////////
/// \class sf::Socket
/// \ingroup network
///
/// This class mainly defines internal stuff to be used by
/// derived classes.
///
/// The only public features that it defines, and which
/// is therefore common to all the socket classes, is the
/// blocking state. All sockets can be set as blocking or
/// non-blocking.
///
/// In blocking mode, socket functions will hang until
/// the operation completes, which means that the entire
/// program (well, in fact the current thread if you use
/// multiple ones) will be stuck waiting for your socket
/// operation to complete.
///
/// In non-blocking mode, all the socket functions will
/// return immediately. If the socket is not ready to complete
/// the requested operation, the function simply returns
/// the proper status code (Socket::NotReady).
///
/// The default mode, which is blocking, is the one that is
/// generally used, in combination with threads or selectors.
/// The non-blocking mode is rather used in real-time
/// applications that run an endless loop that can poll
/// the socket often enough, and cannot afford blocking
/// this loop.
///
/// \see sf::TcpListener, sf::TcpSocket, sf::UdpSocket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
};

    ////////////////////////////////////////////////////////////
    Type         m_type;       ///< Type of the socket (TCP or UDP)
    SocketHandle m_socket;     ///< Socket descriptor
    bool         m_isBlocking; ///< Current blocking mode of the socket
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Close the socket gracefully
    ///
    /// This function can only be accessed by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    void create(SocketHandle handle);

    ////////////////////////////////////////////////////////////
    /// \brief Create the internal representation of the socket
    ///        from a socket handle
    ///
    /// This function can only be accessed by derived classes.
    ///
    /// \param handle OS-specific handle of the socket to wrap
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    void create();

    ////////////////////////////////////////////////////////////
    /// \brief Create the internal representation of the socket
    ///
    /// This function can only be accessed by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    SocketHandle getHandle() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the internal handle of the socket
    ///
    /// The returned handle may be invalid if the socket
    /// was not created yet (or already destroyed).
    /// This function can only be accessed by derived classes.
    ///
    /// \return The internal (OS-specific) handle of the socket
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    Socket(Type type);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor can only be accessed by derived classes.
    ///
    /// \param type Type of the socket (TCP or UDP)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    };

        Tcp, ///< TCP protocol
        Udp  ///< UDP protocol
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    enum Type

    ////////////////////////////////////////////////////////////
    /// \brief Types of protocols that the socket can use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    bool isBlocking() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether the socket is in blocking or non-blocking mode
    ///
    /// \return True if the socket is blocking, false otherwise
    ///
    /// \see setBlocking
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    void setBlocking(bool blocking);

    ////////////////////////////////////////////////////////////
    /// \brief Set the blocking state of the socket
    ///
    /// In blocking mode, calls will not return until they have
    /// completed their task. For example, a call to Receive in
    /// blocking mode won't return until some data was actually
    /// received.
    /// In non-blocking mode, calls will always return immediately,
    /// using the return code to signal whether there was data
    /// available or not.
    /// By default, all sockets are blocking.
    ///
    /// \param blocking True to set the socket as blocking, false for non-blocking
    ///
    /// \see isBlocking
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    virtual ~Socket();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    };

        AnyPort = 0 ///< Special value that tells the system to pick any available port
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    enum

    ////////////////////////////////////////////////////////////
    /// \brief Some special values used by sockets
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    };

        Done,         ///< The socket has sent / received the data
        NotReady,     ///< The socket is not ready to send / receive data yet
        Disconnected, ///< The TCP socket has been disconnected
        Error         ///< An unexpected error happened
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    enum Status

    ////////////////////////////////////////////////////////////
    /// \brief Status codes that may be returned by socket functions
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
class SFML_NETWORK_API Socket : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Base class for all the socket types
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
#ifndef SFML_SOCKET_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp

////////////////////////////////////////////////////////////
/// \class sf::Socket
/// \ingroup network
///
/// This class mainly defines internal stuff to be used by
/// derived classes.
///
/// The only public features that it defines, and which
/// is therefore common to all the socket classes, is the
/// blocking state. All sockets can be set as blocking or
/// non-blocking.
///
/// In blocking mode, socket functions will hang until
/// the operation completes, which means that the entire
/// program (well, in fact the current thread if you use
/// multiple ones) will be stuck waiting for your socket
/// operation to complete.
///
/// In non-blocking mode, all the socket functions will
/// return immediately. If the socket is not ready to complete
/// the requested operation, the function simply returns
/// the proper status code (Socket::NotReady).
///
/// The default mode, which is blocking, is the one that is
/// generally used, in combination with threads or selectors.
/// The non-blocking mode is rather used in real-time
/// applications that run an endless loop that can poll
/// the socket often enough, and cannot afford blocking
/// this loop.
///
/// \see sf::TcpListener, sf::TcpSocket, sf::UdpSocket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
};

    ////////////////////////////////////////////////////////////
    Type         m_type;       ///< Type of the socket (TCP or UDP)
    SocketHandle m_socket;     ///< Socket descriptor
    bool         m_isBlocking; ///< Current blocking mode of the socket
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Close the socket gracefully
    ///
    /// This function can only be accessed by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    void create(SocketHandle handle);

    ////////////////////////////////////////////////////////////
    /// \brief Create the internal representation of the socket
    ///        from a socket handle
    ///
    /// This function can only be accessed by derived classes.
    ///
    /// \param handle OS-specific handle of the socket to wrap
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    void create();

    ////////////////////////////////////////////////////////////
    /// \brief Create the internal representation of the socket
    ///
    /// This function can only be accessed by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    SocketHandle getHandle() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the internal handle of the socket
    ///
    /// The returned handle may be invalid if the socket
    /// was not created yet (or already destroyed).
    /// This function can only be accessed by derived classes.
    ///
    /// \return The internal (OS-specific) handle of the socket
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    Socket(Type type);

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor can only be accessed by derived classes.
    ///
    /// \param type Type of the socket (TCP or UDP)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    };

        Tcp, ///< TCP protocol
        Udp  ///< UDP protocol
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    enum Type

    ////////////////////////////////////////////////////////////
    /// \brief Types of protocols that the socket can use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    bool isBlocking() const;

    ////////////////////////////////////////////////////////////
    /// \brief Tell whether the socket is in blocking or non-blocking mode
    ///
    /// \return True if the socket is blocking, false otherwise
    ///
    /// \see setBlocking
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    void setBlocking(bool blocking);

    ////////////////////////////////////////////////////////////
    /// \brief Set the blocking state of the socket
    ///
    /// In blocking mode, calls will not return until they have
    /// completed their task. For example, a call to Receive in
    /// blocking mode won't return until some data was actually
    /// received.
    /// In non-blocking mode, calls will always return immediately,
    /// using the return code to signal whether there was data
    /// available or not.
    /// By default, all sockets are blocking.
    ///
    /// \param blocking True to set the socket as blocking, false for non-blocking
    ///
    /// \see isBlocking
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    virtual ~Socket();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    };

        AnyPort = 0 ///< Special value that tells the system to pick any available port
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    enum

    ////////////////////////////////////////////////////////////
    /// \brief Some special values used by sockets
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    };

        Done,         ///< The socket has sent / received the data
        NotReady,     ///< The socket is not ready to send / receive data yet
        Disconnected, ///< The TCP socket has been disconnected
        Error         ///< An unexpected error happened
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
    enum Status

    ////////////////////////////////////////////////////////////
    /// \brief Status codes that may be returned by socket functions
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
class SFML_NETWORK_API Socket : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Base class for all the socket types
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
#ifndef SFML_SOCKET_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Socket.hpp
//

////////////////////////////////////////////////////////////
