_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp

////////////////////////////////////////////////////////////
/// \class sf::Event
/// \ingroup window
///
/// sf::Event holds all the informations about a system event
/// that just happened. Events are retrieved using the
/// sf::Window::pollEvent and sf::Window::waitEvent functions.
///
/// A sf::Event instance contains the type of the event
/// (mouse moved, key pressed, window closed, ...) as well
/// as the details about this particular event. Please note that
/// the event parameters are defined in a union, which means that
/// only the member matching the type of the event will be properly
/// filled; all other members will have undefined values and must not
/// be read if the type of the event doesn't match. For example,
/// if you received a KeyPressed event, then you must read the
/// event.key member, all other members such as event.MouseMove
/// or event.text will have undefined values.
///
/// Usage example:
/// \code
/// sf::Event event;
/// while (window.pollEvent(event))
/// {
///     // Request for closing the window
///     if (event.type == sf::Event::Closed)
///         window.close();
///
///     // The escape key was pressed
///     if ((event.type == sf::Event::KeyPressed) && (event.key.code == sf::Keyboard::Escape))
///         window.close();
///
///     // The window was resized
///     if (event.type == sf::Event::Resized)
///         doSomethingWithTheNewSize(event.size.width, event.size.height);
///
///     // etc ...
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        SizeEvent            size;            ///< Size event parameters (Event::Resized)
        KeyEvent             key;             ///< Key event parameters (Event::KeyPressed, Event::KeyReleased)
        TextEvent            text;            ///< Text event parameters (Event::TextEntered)
        MouseMoveEvent       mouseMove;       ///< Mouse move event parameters (Event::MouseMoved)
        MouseButtonEvent     mouseButton;     ///< Mouse button event parameters (Event::MouseButtonPressed, Event::MouseButtonReleased)
        MouseWheelEvent      mouseWheel;      ///< Mouse wheel event parameters (Event::MouseWheelMoved)
        JoystickMoveEvent    joystickMove;    ///< Joystick move event parameters (Event::JoystickMoved)
        JoystickButtonEvent  joystickButton;  ///< Joystick button event parameters (Event::JoystickButtonPressed, Event::JoystickButtonReleased)
        JoystickConnectEvent joystickConnect; ///< Joystick (dis)connect event parameters (Event::JoystickConnected, Event::JoystickDisconnected)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    union

    ////////////////////////////////////////////////////////////
    EventType type; ///< Type of the event
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
        Count                   ///< Keep last -- the total number of event types

        Closed,                 ///< The window requested to be closed (no data)
        Resized,                ///< The window was resized (data in event.size)
        LostFocus,              ///< The window lost the focus (no data)
        GainedFocus,            ///< The window gained the focus (no data)
        TextEntered,            ///< A character was entered (data in event.text)
        KeyPressed,             ///< A key was pressed (data in event.key)
        KeyReleased,            ///< A key was released (data in event.key)
        MouseWheelMoved,        ///< The mouse wheel was scrolled (data in event.mouseWheel)
        MouseButtonPressed,     ///< A mouse button was pressed (data in event.mouseButton)
        MouseButtonReleased,    ///< A mouse button was released (data in event.mouseButton)
        MouseMoved,             ///< The mouse cursor moved (data in event.mouseMove)
        MouseEntered,           ///< The mouse cursor entered the area of the window (no data)
        MouseLeft,              ///< The mouse cursor left the area of the window (no data)
        JoystickButtonPressed,  ///< A joystick button was pressed (data in event.joystickButton)
        JoystickButtonReleased, ///< A joystick button was released (data in event.joystickButton)
        JoystickMoved,          ///< The joystick moved along an axis (data in event.joystickMove)
        JoystickConnected,      ///< A joystick was connected (data in event.joystickConnect)
        JoystickDisconnected,   ///< A joystick was disconnected (data in event.joystickConnect)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    enum EventType

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of the different types of events
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        unsigned int joystickId; ///< Index of the joystick (in range [0 .. Joystick::Count - 1])
        unsigned int button;     ///< Index of the button that has been pressed (in range [0 .. Joystick::ButtonCount - 1])
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct JoystickButtonEvent

    ////////////////////////////////////////////////////////////
    /// \brief Joystick buttons events parameters
    ///        (JoystickButtonPressed, JoystickButtonReleased)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        unsigned int   joystickId; ///< Index of the joystick (in range [0 .. Joystick::Count - 1])
        Joystick::Axis axis;       ///< Axis on which the joystick moved
        float          position;   ///< New position on the axis (in range [-100 .. 100])
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct JoystickMoveEvent

    ////////////////////////////////////////////////////////////
    /// \brief Joystick axis move event parameters (JoystickMoved)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        unsigned int joystickId; ///< Index of the joystick (in range [0 .. Joystick::Count - 1])
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct JoystickConnectEvent

    ////////////////////////////////////////////////////////////
    /// \brief Joystick connection events parameters
    ///        (JoystickConnected, JoystickDisconnected)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        int delta; ///< Number of ticks the wheel has moved (positive is up, negative is down)
        int x;     ///< X position of the mouse pointer, relative to the left of the owner window
        int y;     ///< Y position of the mouse pointer, relative to the top of the owner window
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct MouseWheelEvent

    ////////////////////////////////////////////////////////////
    /// \brief Mouse wheel events parameters (MouseWheelMoved)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        Mouse::Button button; ///< Code of the button that has been pressed
        int           x;      ///< X position of the mouse pointer, relative to the left of the owner window
        int           y;      ///< Y position of the mouse pointer, relative to the top of the owner window
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct MouseButtonEvent

    ////////////////////////////////////////////////////////////
    /// \brief Mouse buttons events parameters
    ///        (MouseButtonPressed, MouseButtonReleased)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        int x; ///< X position of the mouse pointer, relative to the left of the owner window
        int y; ///< Y position of the mouse pointer, relative to the top of the owner window
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct MouseMoveEvent

    ////////////////////////////////////////////////////////////
    /// \brief Mouse move event parameters (MouseMoved)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        Uint32 unicode; ///< UTF-32 unicode value of the character
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct TextEvent

    ////////////////////////////////////////////////////////////
    /// \brief Text event parameters (TextEntered)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        Keyboard::Key code;    ///< Code of the key that has been pressed
        bool          alt;     ///< Is the Alt key pressed?
        bool          control; ///< Is the Control key pressed?
        bool          shift;   ///< Is the Shift key pressed?
        bool          system;  ///< Is the System key pressed?
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct KeyEvent

    ////////////////////////////////////////////////////////////
    /// \brief Keyboard event parameters (KeyPressed, KeyReleased)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        unsigned int width;  ///< New width, in pixels
        unsigned int height; ///< New height, in pixels
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct SizeEvent

    ////////////////////////////////////////////////////////////
    /// \brief Size events parameters (Resized)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
class Event

////////////////////////////////////////////////////////////
/// \brief Defines a system event and its parameters
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
#include <SFML/Config.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
#ifndef SFML_EVENT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp

////////////////////////////////////////////////////////////
/// \class sf::Event
/// \ingroup window
///
/// sf::Event holds all the informations about a system event
/// that just happened. Events are retrieved using the
/// sf::Window::pollEvent and sf::Window::waitEvent functions.
///
/// A sf::Event instance contains the type of the event
/// (mouse moved, key pressed, window closed, ...) as well
/// as the details about this particular event. Please note that
/// the event parameters are defined in a union, which means that
/// only the member matching the type of the event will be properly
/// filled; all other members will have undefined values and must not
/// be read if the type of the event doesn't match. For example,
/// if you received a KeyPressed event, then you must read the
/// event.key member, all other members such as event.MouseMove
/// or event.text will have undefined values.
///
/// Usage example:
/// \code
/// sf::Event event;
/// while (window.pollEvent(event))
/// {
///     // Request for closing the window
///     if (event.type == sf::Event::Closed)
///         window.close();
///
///     // The escape key was pressed
///     if ((event.type == sf::Event::KeyPressed) && (event.key.code == sf::Keyboard::Escape))
///         window.close();
///
///     // The window was resized
///     if (event.type == sf::Event::Resized)
///         doSomethingWithTheNewSize(event.size.width, event.size.height);
///
///     // etc ...
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        SizeEvent            size;            ///< Size event parameters (Event::Resized)
        KeyEvent             key;             ///< Key event parameters (Event::KeyPressed, Event::KeyReleased)
        TextEvent            text;            ///< Text event parameters (Event::TextEntered)
        MouseMoveEvent       mouseMove;       ///< Mouse move event parameters (Event::MouseMoved)
        MouseButtonEvent     mouseButton;     ///< Mouse button event parameters (Event::MouseButtonPressed, Event::MouseButtonReleased)
        MouseWheelEvent      mouseWheel;      ///< Mouse wheel event parameters (Event::MouseWheelMoved)
        JoystickMoveEvent    joystickMove;    ///< Joystick move event parameters (Event::JoystickMoved)
        JoystickButtonEvent  joystickButton;  ///< Joystick button event parameters (Event::JoystickButtonPressed, Event::JoystickButtonReleased)
        JoystickConnectEvent joystickConnect; ///< Joystick (dis)connect event parameters (Event::JoystickConnected, Event::JoystickDisconnected)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    union

    ////////////////////////////////////////////////////////////
    EventType type; ///< Type of the event
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
        Count                   ///< Keep last -- the total number of event types

        Closed,                 ///< The window requested to be closed (no data)
        Resized,                ///< The window was resized (data in event.size)
        LostFocus,              ///< The window lost the focus (no data)
        GainedFocus,            ///< The window gained the focus (no data)
        TextEntered,            ///< A character was entered (data in event.text)
        KeyPressed,             ///< A key was pressed (data in event.key)
        KeyReleased,            ///< A key was released (data in event.key)
        MouseWheelMoved,        ///< The mouse wheel was scrolled (data in event.mouseWheel)
        MouseButtonPressed,     ///< A mouse button was pressed (data in event.mouseButton)
        MouseButtonReleased,    ///< A mouse button was released (data in event.mouseButton)
        MouseMoved,             ///< The mouse cursor moved (data in event.mouseMove)
        MouseEntered,           ///< The mouse cursor entered the area of the window (no data)
        MouseLeft,              ///< The mouse cursor left the area of the window (no data)
        JoystickButtonPressed,  ///< A joystick button was pressed (data in event.joystickButton)
        JoystickButtonReleased, ///< A joystick button was released (data in event.joystickButton)
        JoystickMoved,          ///< The joystick moved along an axis (data in event.joystickMove)
        JoystickConnected,      ///< A joystick was connected (data in event.joystickConnect)
        JoystickDisconnected,   ///< A joystick was disconnected (data in event.joystickConnect)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    enum EventType

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of the different types of events
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        unsigned int joystickId; ///< Index of the joystick (in range [0 .. Joystick::Count - 1])
        unsigned int button;     ///< Index of the button that has been pressed (in range [0 .. Joystick::ButtonCount - 1])
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct JoystickButtonEvent

    ////////////////////////////////////////////////////////////
    /// \brief Joystick buttons events parameters
    ///        (JoystickButtonPressed, JoystickButtonReleased)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        unsigned int   joystickId; ///< Index of the joystick (in range [0 .. Joystick::Count - 1])
        Joystick::Axis axis;       ///< Axis on which the joystick moved
        float          position;   ///< New position on the axis (in range [-100 .. 100])
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct JoystickMoveEvent

    ////////////////////////////////////////////////////////////
    /// \brief Joystick axis move event parameters (JoystickMoved)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        unsigned int joystickId; ///< Index of the joystick (in range [0 .. Joystick::Count - 1])
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct JoystickConnectEvent

    ////////////////////////////////////////////////////////////
    /// \brief Joystick connection events parameters
    ///        (JoystickConnected, JoystickDisconnected)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        int delta; ///< Number of ticks the wheel has moved (positive is up, negative is down)
        int x;     ///< X position of the mouse pointer, relative to the left of the owner window
        int y;     ///< Y position of the mouse pointer, relative to the top of the owner window
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct MouseWheelEvent

    ////////////////////////////////////////////////////////////
    /// \brief Mouse wheel events parameters (MouseWheelMoved)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        Mouse::Button button; ///< Code of the button that has been pressed
        int           x;      ///< X position of the mouse pointer, relative to the left of the owner window
        int           y;      ///< Y position of the mouse pointer, relative to the top of the owner window
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct MouseButtonEvent

    ////////////////////////////////////////////////////////////
    /// \brief Mouse buttons events parameters
    ///        (MouseButtonPressed, MouseButtonReleased)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        int x; ///< X position of the mouse pointer, relative to the left of the owner window
        int y; ///< Y position of the mouse pointer, relative to the top of the owner window
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct MouseMoveEvent

    ////////////////////////////////////////////////////////////
    /// \brief Mouse move event parameters (MouseMoved)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        Uint32 unicode; ///< UTF-32 unicode value of the character
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct TextEvent

    ////////////////////////////////////////////////////////////
    /// \brief Text event parameters (TextEntered)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        Keyboard::Key code;    ///< Code of the key that has been pressed
        bool          alt;     ///< Is the Alt key pressed?
        bool          control; ///< Is the Control key pressed?
        bool          shift;   ///< Is the Shift key pressed?
        bool          system;  ///< Is the System key pressed?
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct KeyEvent

    ////////////////////////////////////////////////////////////
    /// \brief Keyboard event parameters (KeyPressed, KeyReleased)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    };

        unsigned int width;  ///< New width, in pixels
        unsigned int height; ///< New height, in pixels
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
    struct SizeEvent

    ////////////////////////////////////////////////////////////
    /// \brief Size events parameters (Resized)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
class Event

////////////////////////////////////////////////////////////
/// \brief Defines a system event and its parameters
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
#include <SFML/Config.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
#ifndef SFML_EVENT_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Event.hpp
//

////////////////////////////////////////////////////////////
