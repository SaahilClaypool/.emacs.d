_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp

////////////////////////////////////////////////////////////
/// \class sf::VertexArray
/// \ingroup graphics
///
/// sf::VertexArray is a very simple wrapper around a dynamic
/// array of vertices and a primitives type.
///
/// It inherits sf::Drawable, but unlike other drawables it
/// is not transformable.
///
/// Example:
/// \code
/// sf::VertexArray lines(sf::LinesStrip, 4);
/// lines[0].position = sf::Vector2f(10, 0);
/// lines[1].position = sf::Vector2f(20, 0);
/// lines[2].position = sf::Vector2f(30, 5);
/// lines[3].position = sf::Vector2f(40, 2);
///
/// window.draw(lines);
/// \endcode
///
/// \see sf::Vertex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
};

    ////////////////////////////////////////////////////////////
    std::vector<Vertex> m_vertices;      ///< Vertices contained in the array
    PrimitiveType       m_primitiveType; ///< Type of primitives to draw
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    virtual void draw(RenderTarget& target, RenderStates states) const;

    ////////////////////////////////////////////////////////////
    /// \brief Draw the vertex array to a render target
    ///
    /// \param target Render target to draw to
    /// \param states Current render states
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    FloatRect getBounds() const;

    ////////////////////////////////////////////////////////////
    /// \brief Compute the bounding rectangle of the vertex array
    ///
    /// This function returns the axis-aligned rectangle that
    /// contains all the vertices of the array.
    ///
    /// \return Bounding rectangle of the vertex array
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    PrimitiveType getPrimitiveType() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the type of primitives drawn by the vertex array
    ///
    /// \return Primitive type
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    void setPrimitiveType(PrimitiveType type);

    ////////////////////////////////////////////////////////////
    /// \brief Set the type of primitives to draw
    ///
    /// This function defines how the vertices must be interpreted
    /// when it's time to draw them:
    /// \li As points
    /// \li As lines
    /// \li As triangles
    /// \li As quads
    /// The default primitive type is sf::Points.
    ///
    /// \param type Type of primitive
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    void append(const Vertex& vertex);

    ////////////////////////////////////////////////////////////
    /// \brief Add a vertex to the array
    ///
    /// \param vertex Vertex to add
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    void resize(unsigned int vertexCount);

    ////////////////////////////////////////////////////////////
    /// \brief Resize the vertex array
    ///
    /// If \a vertexCount is greater than the current size, the previous
    /// vertices are kept and new (default-constructed) vertices are
    /// added.
    /// If \a vertexCount is less than the current size, existing vertices
    /// are removed from the array.
    ///
    /// \param vertexCount New size of the array (number of vertices)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the vertex array
    ///
    /// This function removes all the vertices from the array.
    /// It doesn't deallocate the corresponding memory, so that
    /// adding new vertices after clearing doesn't involve
    /// reallocating all the memory.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    const Vertex& operator [](unsigned int index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a read-only access to a vertex by its index
    ///
    /// This function doesn't check \a index, it must be in range
    /// [0, getVertexCount() - 1]. The behaviour is undefined
    /// otherwise.
    ///
    /// \param index Index of the vertex to get
    ///
    /// \return Const reference to the index-th vertex
    ///
    /// \see getVertexCount
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    Vertex& operator [](unsigned int index);

    ////////////////////////////////////////////////////////////
    /// \brief Get a read-write access to a vertex by its index
    ///
    /// This function doesn't check \a index, it must be in range
    /// [0, getVertexCount() - 1]. The behaviour is undefined
    /// otherwise.
    ///
    /// \param index Index of the vertex to get
    ///
    /// \return Reference to the index-th vertex
    ///
    /// \see getVertexCount
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    unsigned int getVertexCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the vertex count
    ///
    /// \return Number of vertices in the array
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    explicit VertexArray(PrimitiveType type, unsigned int vertexCount = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the vertex array with a type and an initial number of vertices
    ///
    /// \param type        Type of primitives
    /// \param vertexCount Initial number of vertices in the array
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    VertexArray();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Creates an empty vertex array.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
class SFML_GRAPHICS_API VertexArray : public Drawable

////////////////////////////////////////////////////////////
/// \brief Define a set of one or more 2D primitives
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
#ifndef SFML_VERTEXARRAY_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp

////////////////////////////////////////////////////////////
/// \class sf::VertexArray
/// \ingroup graphics
///
/// sf::VertexArray is a very simple wrapper around a dynamic
/// array of vertices and a primitives type.
///
/// It inherits sf::Drawable, but unlike other drawables it
/// is not transformable.
///
/// Example:
/// \code
/// sf::VertexArray lines(sf::LinesStrip, 4);
/// lines[0].position = sf::Vector2f(10, 0);
/// lines[1].position = sf::Vector2f(20, 0);
/// lines[2].position = sf::Vector2f(30, 5);
/// lines[3].position = sf::Vector2f(40, 2);
///
/// window.draw(lines);
/// \endcode
///
/// \see sf::Vertex
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
};

    ////////////////////////////////////////////////////////////
    std::vector<Vertex> m_vertices;      ///< Vertices contained in the array
    PrimitiveType       m_primitiveType; ///< Type of primitives to draw
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    virtual void draw(RenderTarget& target, RenderStates states) const;

    ////////////////////////////////////////////////////////////
    /// \brief Draw the vertex array to a render target
    ///
    /// \param target Render target to draw to
    /// \param states Current render states
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    FloatRect getBounds() const;

    ////////////////////////////////////////////////////////////
    /// \brief Compute the bounding rectangle of the vertex array
    ///
    /// This function returns the axis-aligned rectangle that
    /// contains all the vertices of the array.
    ///
    /// \return Bounding rectangle of the vertex array
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    PrimitiveType getPrimitiveType() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the type of primitives drawn by the vertex array
    ///
    /// \return Primitive type
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    void setPrimitiveType(PrimitiveType type);

    ////////////////////////////////////////////////////////////
    /// \brief Set the type of primitives to draw
    ///
    /// This function defines how the vertices must be interpreted
    /// when it's time to draw them:
    /// \li As points
    /// \li As lines
    /// \li As triangles
    /// \li As quads
    /// The default primitive type is sf::Points.
    ///
    /// \param type Type of primitive
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    void append(const Vertex& vertex);

    ////////////////////////////////////////////////////////////
    /// \brief Add a vertex to the array
    ///
    /// \param vertex Vertex to add
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    void resize(unsigned int vertexCount);

    ////////////////////////////////////////////////////////////
    /// \brief Resize the vertex array
    ///
    /// If \a vertexCount is greater than the current size, the previous
    /// vertices are kept and new (default-constructed) vertices are
    /// added.
    /// If \a vertexCount is less than the current size, existing vertices
    /// are removed from the array.
    ///
    /// \param vertexCount New size of the array (number of vertices)
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    void clear();

    ////////////////////////////////////////////////////////////
    /// \brief Clear the vertex array
    ///
    /// This function removes all the vertices from the array.
    /// It doesn't deallocate the corresponding memory, so that
    /// adding new vertices after clearing doesn't involve
    /// reallocating all the memory.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    const Vertex& operator [](unsigned int index) const;

    ////////////////////////////////////////////////////////////
    /// \brief Get a read-only access to a vertex by its index
    ///
    /// This function doesn't check \a index, it must be in range
    /// [0, getVertexCount() - 1]. The behaviour is undefined
    /// otherwise.
    ///
    /// \param index Index of the vertex to get
    ///
    /// \return Const reference to the index-th vertex
    ///
    /// \see getVertexCount
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    Vertex& operator [](unsigned int index);

    ////////////////////////////////////////////////////////////
    /// \brief Get a read-write access to a vertex by its index
    ///
    /// This function doesn't check \a index, it must be in range
    /// [0, getVertexCount() - 1]. The behaviour is undefined
    /// otherwise.
    ///
    /// \param index Index of the vertex to get
    ///
    /// \return Reference to the index-th vertex
    ///
    /// \see getVertexCount
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    unsigned int getVertexCount() const;

    ////////////////////////////////////////////////////////////
    /// \brief Return the vertex count
    ///
    /// \return Number of vertices in the array
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    explicit VertexArray(PrimitiveType type, unsigned int vertexCount = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the vertex array with a type and an initial number of vertices
    ///
    /// \param type        Type of primitives
    /// \param vertexCount Initial number of vertices in the array
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
    VertexArray();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Creates an empty vertex array.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
class SFML_GRAPHICS_API VertexArray : public Drawable

////////////////////////////////////////////////////////////
/// \brief Define a set of one or more 2D primitives
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
#ifndef SFML_VERTEXARRAY_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/VertexArray.hpp
//

////////////////////////////////////////////////////////////
