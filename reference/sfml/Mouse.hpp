_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp

////////////////////////////////////////////////////////////
/// \class sf::Mouse
/// \ingroup window
///
/// sf::Mouse provides an interface to the state of the
/// mouse. It only contains static functions (a single
/// mouse is assumed), so it's not meant to be instanciated.
///
/// This class allows users to query the mouse state at any
/// time and directly, without having to deal with a window and
/// its events. Compared to the MouseMoved, MouseButtonPressed
/// and MouseButtonReleased events, sf::Mouse can retrieve the
/// state of the cursor and the buttons at any time
/// (you don't need to store and update a boolean on your side
/// in order to know if a button is pressed or released), and you
/// always get the real state of the mouse, even if it is
/// moved, pressed or released when your window is out of focus
/// and no event is triggered.
///
/// The setPosition and getPosition functions can be used to change
/// or retrieve the current position of the mouse pointer. There are
/// two versions: one that operates in global coordinates (relative
/// to the desktop) and one that operates in window coordinates
/// (relative to a specific window).
///
/// Usage example:
/// \code
/// if (sf::Mouse::isButtonPressed(sf::Mouse::Left))
/// {
///     // left click...
/// }
///
/// // get global mouse position
/// sf::Vector2i position = sf::Mouse::getPosition();
///
/// // set mouse position relative to a window
/// sf::Mouse::setPosition(sf::Vector2i(100, 200), window);
/// \endcode
///
/// \see sf::Joystick, sf::Keyboard
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
    static void setPosition(const Vector2i& position, const Window& relativeTo);

    ////////////////////////////////////////////////////////////
    /// \brief Set the current position of the mouse in window coordinates
    ///
    /// This function sets the current position of the mouse
    /// cursor, relative to the given window.
    ///
    /// \param position New position of the mouse
    /// \param relativeTo Reference window
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
    static void setPosition(const Vector2i& position);

    ////////////////////////////////////////////////////////////
    /// \brief Set the current position of the mouse in desktop coordinates
    ///
    /// This function sets the global position of the mouse
    /// cursor on the desktop.
    ///
    /// \param position New position of the mouse
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
    static Vector2i getPosition(const Window& relativeTo);

    ////////////////////////////////////////////////////////////
    /// \brief Get the current position of the mouse in window coordinates
    ///
    /// This function returns the current position of the mouse
    /// cursor, relative to the given window.
    ///
    /// \param relativeTo Reference window
    ///
    /// \return Current position of the mouse
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
    static Vector2i getPosition();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current position of the mouse in desktop coordinates
    ///
    /// This function returns the global position of the mouse
    /// cursor on the desktop.
    ///
    /// \return Current position of the mouse
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
    static bool isButtonPressed(Button button);

    ////////////////////////////////////////////////////////////
    /// \brief Check if a mouse button is pressed
    ///
    /// \param button Button to check
    ///
    /// \return True if the button is pressed, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
        ButtonCount ///< Keep last -- the total number of mouse buttons

        Left,       ///< The left mouse button
        Right,      ///< The right mouse button
        Middle,     ///< The middle (wheel) mouse button
        XButton1,   ///< The first extra mouse button
        XButton2,   ///< The second extra mouse button
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
    enum Button

    ////////////////////////////////////////////////////////////
    /// \brief Mouse buttons
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
class SFML_WINDOW_API Mouse

////////////////////////////////////////////////////////////
/// \brief Give access to the real-time state of the mouse
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
#ifndef SFML_MOUSE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Window/Mouse.hpp
//

////////////////////////////////////////////////////////////
