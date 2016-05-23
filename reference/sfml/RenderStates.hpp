_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderStates
/// \ingroup graphics
///
/// There are four global states that can be applied to
/// the drawn objects:
/// \li the blend mode: how pixels of the object are blended with the background
/// \li the transform: how the object is positioned/rotated/scaled
/// \li the texture: what image is mapped to the object
/// \li the shader: what custom effect is applied to the object
///
/// High-level objects such as sprites or text force some of
/// these states when they are drawn. For example, a sprite
/// will set its own texture, so that you don't have to care
/// about it when drawing the sprite.
///
/// The transform is a special case: sprites, texts and shapes
/// (and it's a good idea to do it with your own drawable classes
/// too) combine their transform with the one that is passed in the
/// RenderStates structure. So that you can use a "global" transform
/// on top of each object's transform.
///
/// Most objects, especially high-level drawables, can be drawn
/// directly without defining render states explicitely -- the
/// default set of states is ok in most cases.
/// \code
/// window.Draw(sprite);
/// \endcode
///
/// If you want to use a single specific render state,
/// for example a shader, you can pass it directly to the Draw
/// function: sf::RenderStates has an implicit one-argument
/// constructor for each state.
/// \code
/// window.draw(sprite, shader);
/// \endcode
///
/// When you're inside the Draw function of a drawable
/// object (inherited from sf::Drawable), you can
/// either pass the render states unmodified, or change
/// some of them.
/// For example, a transformable object will combine the
/// current transform with its own transform. A sprite will
/// set its texture. Etc.
///
/// \see sf::RenderTarget, sf::Drawable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
};

    ////////////////////////////////////////////////////////////
    BlendMode      blendMode; ///< Blending mode
    Transform      transform; ///< Transform
    const Texture* texture;   ///< Texture
    const Shader*  shader;    ///< Shader
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const RenderStates Default; ///< Special instance holding the default render states
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode, const Transform& theTransform,
                 const Texture* theTexture, const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a set of render states with all its attributes
    ///
    /// \param theBlendMode Blend mode to use
    /// \param theTransform Transform to use
    /// \param theTexture   Texture to use
    /// \param theShader    Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom shader
    ///
    /// \param theShader Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Texture* theTexture);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom texture
    ///
    /// \param theTexture Texture to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Transform& theTransform);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom transform
    ///
    /// \param theTransform Transform to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom blend mode
    ///
    /// \param theBlendMode Blend mode to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructing a default set of render states is equivalent
    /// to using sf::RenderStates::Default.
    /// The default set defines:
    /// \li the BlendAlpha blend mode
    /// \li the identity transform
    /// \li a null texture
    /// \li a null shader
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
class SFML_GRAPHICS_API RenderStates

////////////////////////////////////////////////////////////
/// \brief Define the states used for drawing to a RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#ifndef SFML_RENDERSTATES_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderStates
/// \ingroup graphics
///
/// There are four global states that can be applied to
/// the drawn objects:
/// \li the blend mode: how pixels of the object are blended with the background
/// \li the transform: how the object is positioned/rotated/scaled
/// \li the texture: what image is mapped to the object
/// \li the shader: what custom effect is applied to the object
///
/// High-level objects such as sprites or text force some of
/// these states when they are drawn. For example, a sprite
/// will set its own texture, so that you don't have to care
/// about it when drawing the sprite.
///
/// The transform is a special case: sprites, texts and shapes
/// (and it's a good idea to do it with your own drawable classes
/// too) combine their transform with the one that is passed in the
/// RenderStates structure. So that you can use a "global" transform
/// on top of each object's transform.
///
/// Most objects, especially high-level drawables, can be drawn
/// directly without defining render states explicitely -- the
/// default set of states is ok in most cases.
/// \code
/// window.Draw(sprite);
/// \endcode
///
/// If you want to use a single specific render state,
/// for example a shader, you can pass it directly to the Draw
/// function: sf::RenderStates has an implicit one-argument
/// constructor for each state.
/// \code
/// window.draw(sprite, shader);
/// \endcode
///
/// When you're inside the Draw function of a drawable
/// object (inherited from sf::Drawable), you can
/// either pass the render states unmodified, or change
/// some of them.
/// For example, a transformable object will combine the
/// current transform with its own transform. A sprite will
/// set its texture. Etc.
///
/// \see sf::RenderTarget, sf::Drawable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
};

    ////////////////////////////////////////////////////////////
    BlendMode      blendMode; ///< Blending mode
    Transform      transform; ///< Transform
    const Texture* texture;   ///< Texture
    const Shader*  shader;    ///< Shader
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const RenderStates Default; ///< Special instance holding the default render states
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode, const Transform& theTransform,
                 const Texture* theTexture, const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a set of render states with all its attributes
    ///
    /// \param theBlendMode Blend mode to use
    /// \param theTransform Transform to use
    /// \param theTexture   Texture to use
    /// \param theShader    Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom shader
    ///
    /// \param theShader Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Texture* theTexture);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom texture
    ///
    /// \param theTexture Texture to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Transform& theTransform);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom transform
    ///
    /// \param theTransform Transform to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom blend mode
    ///
    /// \param theBlendMode Blend mode to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructing a default set of render states is equivalent
    /// to using sf::RenderStates::Default.
    /// The default set defines:
    /// \li the BlendAlpha blend mode
    /// \li the identity transform
    /// \li a null texture
    /// \li a null shader
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
class SFML_GRAPHICS_API RenderStates

////////////////////////////////////////////////////////////
/// \brief Define the states used for drawing to a RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#ifndef SFML_RENDERSTATES_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderStates
/// \ingroup graphics
///
/// There are four global states that can be applied to
/// the drawn objects:
/// \li the blend mode: how pixels of the object are blended with the background
/// \li the transform: how the object is positioned/rotated/scaled
/// \li the texture: what image is mapped to the object
/// \li the shader: what custom effect is applied to the object
///
/// High-level objects such as sprites or text force some of
/// these states when they are drawn. For example, a sprite
/// will set its own texture, so that you don't have to care
/// about it when drawing the sprite.
///
/// The transform is a special case: sprites, texts and shapes
/// (and it's a good idea to do it with your own drawable classes
/// too) combine their transform with the one that is passed in the
/// RenderStates structure. So that you can use a "global" transform
/// on top of each object's transform.
///
/// Most objects, especially high-level drawables, can be drawn
/// directly without defining render states explicitely -- the
/// default set of states is ok in most cases.
/// \code
/// window.Draw(sprite);
/// \endcode
///
/// If you want to use a single specific render state,
/// for example a shader, you can pass it directly to the Draw
/// function: sf::RenderStates has an implicit one-argument
/// constructor for each state.
/// \code
/// window.draw(sprite, shader);
/// \endcode
///
/// When you're inside the Draw function of a drawable
/// object (inherited from sf::Drawable), you can
/// either pass the render states unmodified, or change
/// some of them.
/// For example, a transformable object will combine the
/// current transform with its own transform. A sprite will
/// set its texture. Etc.
///
/// \see sf::RenderTarget, sf::Drawable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
};

    ////////////////////////////////////////////////////////////
    BlendMode      blendMode; ///< Blending mode
    Transform      transform; ///< Transform
    const Texture* texture;   ///< Texture
    const Shader*  shader;    ///< Shader
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const RenderStates Default; ///< Special instance holding the default render states
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode, const Transform& theTransform,
                 const Texture* theTexture, const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a set of render states with all its attributes
    ///
    /// \param theBlendMode Blend mode to use
    /// \param theTransform Transform to use
    /// \param theTexture   Texture to use
    /// \param theShader    Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom shader
    ///
    /// \param theShader Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Texture* theTexture);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom texture
    ///
    /// \param theTexture Texture to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Transform& theTransform);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom transform
    ///
    /// \param theTransform Transform to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom blend mode
    ///
    /// \param theBlendMode Blend mode to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructing a default set of render states is equivalent
    /// to using sf::RenderStates::Default.
    /// The default set defines:
    /// \li the BlendAlpha blend mode
    /// \li the identity transform
    /// \li a null texture
    /// \li a null shader
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
class SFML_GRAPHICS_API RenderStates

////////////////////////////////////////////////////////////
/// \brief Define the states used for drawing to a RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#ifndef SFML_RENDERSTATES_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderStates
/// \ingroup graphics
///
/// There are four global states that can be applied to
/// the drawn objects:
/// \li the blend mode: how pixels of the object are blended with the background
/// \li the transform: how the object is positioned/rotated/scaled
/// \li the texture: what image is mapped to the object
/// \li the shader: what custom effect is applied to the object
///
/// High-level objects such as sprites or text force some of
/// these states when they are drawn. For example, a sprite
/// will set its own texture, so that you don't have to care
/// about it when drawing the sprite.
///
/// The transform is a special case: sprites, texts and shapes
/// (and it's a good idea to do it with your own drawable classes
/// too) combine their transform with the one that is passed in the
/// RenderStates structure. So that you can use a "global" transform
/// on top of each object's transform.
///
/// Most objects, especially high-level drawables, can be drawn
/// directly without defining render states explicitely -- the
/// default set of states is ok in most cases.
/// \code
/// window.Draw(sprite);
/// \endcode
///
/// If you want to use a single specific render state,
/// for example a shader, you can pass it directly to the Draw
/// function: sf::RenderStates has an implicit one-argument
/// constructor for each state.
/// \code
/// window.draw(sprite, shader);
/// \endcode
///
/// When you're inside the Draw function of a drawable
/// object (inherited from sf::Drawable), you can
/// either pass the render states unmodified, or change
/// some of them.
/// For example, a transformable object will combine the
/// current transform with its own transform. A sprite will
/// set its texture. Etc.
///
/// \see sf::RenderTarget, sf::Drawable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
};

    ////////////////////////////////////////////////////////////
    BlendMode      blendMode; ///< Blending mode
    Transform      transform; ///< Transform
    const Texture* texture;   ///< Texture
    const Shader*  shader;    ///< Shader
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const RenderStates Default; ///< Special instance holding the default render states
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode, const Transform& theTransform,
                 const Texture* theTexture, const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a set of render states with all its attributes
    ///
    /// \param theBlendMode Blend mode to use
    /// \param theTransform Transform to use
    /// \param theTexture   Texture to use
    /// \param theShader    Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom shader
    ///
    /// \param theShader Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Texture* theTexture);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom texture
    ///
    /// \param theTexture Texture to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Transform& theTransform);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom transform
    ///
    /// \param theTransform Transform to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom blend mode
    ///
    /// \param theBlendMode Blend mode to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructing a default set of render states is equivalent
    /// to using sf::RenderStates::Default.
    /// The default set defines:
    /// \li the BlendAlpha blend mode
    /// \li the identity transform
    /// \li a null texture
    /// \li a null shader
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
class SFML_GRAPHICS_API RenderStates

////////////////////////////////////////////////////////////
/// \brief Define the states used for drawing to a RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#ifndef SFML_RENDERSTATES_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderStates
/// \ingroup graphics
///
/// There are four global states that can be applied to
/// the drawn objects:
/// \li the blend mode: how pixels of the object are blended with the background
/// \li the transform: how the object is positioned/rotated/scaled
/// \li the texture: what image is mapped to the object
/// \li the shader: what custom effect is applied to the object
///
/// High-level objects such as sprites or text force some of
/// these states when they are drawn. For example, a sprite
/// will set its own texture, so that you don't have to care
/// about it when drawing the sprite.
///
/// The transform is a special case: sprites, texts and shapes
/// (and it's a good idea to do it with your own drawable classes
/// too) combine their transform with the one that is passed in the
/// RenderStates structure. So that you can use a "global" transform
/// on top of each object's transform.
///
/// Most objects, especially high-level drawables, can be drawn
/// directly without defining render states explicitely -- the
/// default set of states is ok in most cases.
/// \code
/// window.Draw(sprite);
/// \endcode
///
/// If you want to use a single specific render state,
/// for example a shader, you can pass it directly to the Draw
/// function: sf::RenderStates has an implicit one-argument
/// constructor for each state.
/// \code
/// window.draw(sprite, shader);
/// \endcode
///
/// When you're inside the Draw function of a drawable
/// object (inherited from sf::Drawable), you can
/// either pass the render states unmodified, or change
/// some of them.
/// For example, a transformable object will combine the
/// current transform with its own transform. A sprite will
/// set its texture. Etc.
///
/// \see sf::RenderTarget, sf::Drawable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
};

    ////////////////////////////////////////////////////////////
    BlendMode      blendMode; ///< Blending mode
    Transform      transform; ///< Transform
    const Texture* texture;   ///< Texture
    const Shader*  shader;    ///< Shader
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const RenderStates Default; ///< Special instance holding the default render states
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode, const Transform& theTransform,
                 const Texture* theTexture, const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a set of render states with all its attributes
    ///
    /// \param theBlendMode Blend mode to use
    /// \param theTransform Transform to use
    /// \param theTexture   Texture to use
    /// \param theShader    Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom shader
    ///
    /// \param theShader Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Texture* theTexture);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom texture
    ///
    /// \param theTexture Texture to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Transform& theTransform);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom transform
    ///
    /// \param theTransform Transform to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom blend mode
    ///
    /// \param theBlendMode Blend mode to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructing a default set of render states is equivalent
    /// to using sf::RenderStates::Default.
    /// The default set defines:
    /// \li the BlendAlpha blend mode
    /// \li the identity transform
    /// \li a null texture
    /// \li a null shader
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
class SFML_GRAPHICS_API RenderStates

////////////////////////////////////////////////////////////
/// \brief Define the states used for drawing to a RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#ifndef SFML_RENDERSTATES_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderStates
/// \ingroup graphics
///
/// There are four global states that can be applied to
/// the drawn objects:
/// \li the blend mode: how pixels of the object are blended with the background
/// \li the transform: how the object is positioned/rotated/scaled
/// \li the texture: what image is mapped to the object
/// \li the shader: what custom effect is applied to the object
///
/// High-level objects such as sprites or text force some of
/// these states when they are drawn. For example, a sprite
/// will set its own texture, so that you don't have to care
/// about it when drawing the sprite.
///
/// The transform is a special case: sprites, texts and shapes
/// (and it's a good idea to do it with your own drawable classes
/// too) combine their transform with the one that is passed in the
/// RenderStates structure. So that you can use a "global" transform
/// on top of each object's transform.
///
/// Most objects, especially high-level drawables, can be drawn
/// directly without defining render states explicitely -- the
/// default set of states is ok in most cases.
/// \code
/// window.Draw(sprite);
/// \endcode
///
/// If you want to use a single specific render state,
/// for example a shader, you can pass it directly to the Draw
/// function: sf::RenderStates has an implicit one-argument
/// constructor for each state.
/// \code
/// window.draw(sprite, shader);
/// \endcode
///
/// When you're inside the Draw function of a drawable
/// object (inherited from sf::Drawable), you can
/// either pass the render states unmodified, or change
/// some of them.
/// For example, a transformable object will combine the
/// current transform with its own transform. A sprite will
/// set its texture. Etc.
///
/// \see sf::RenderTarget, sf::Drawable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
};

    ////////////////////////////////////////////////////////////
    BlendMode      blendMode; ///< Blending mode
    Transform      transform; ///< Transform
    const Texture* texture;   ///< Texture
    const Shader*  shader;    ///< Shader
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const RenderStates Default; ///< Special instance holding the default render states
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode, const Transform& theTransform,
                 const Texture* theTexture, const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a set of render states with all its attributes
    ///
    /// \param theBlendMode Blend mode to use
    /// \param theTransform Transform to use
    /// \param theTexture   Texture to use
    /// \param theShader    Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom shader
    ///
    /// \param theShader Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Texture* theTexture);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom texture
    ///
    /// \param theTexture Texture to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Transform& theTransform);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom transform
    ///
    /// \param theTransform Transform to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom blend mode
    ///
    /// \param theBlendMode Blend mode to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructing a default set of render states is equivalent
    /// to using sf::RenderStates::Default.
    /// The default set defines:
    /// \li the BlendAlpha blend mode
    /// \li the identity transform
    /// \li a null texture
    /// \li a null shader
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
class SFML_GRAPHICS_API RenderStates

////////////////////////////////////////////////////////////
/// \brief Define the states used for drawing to a RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#ifndef SFML_RENDERSTATES_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderStates
/// \ingroup graphics
///
/// There are four global states that can be applied to
/// the drawn objects:
/// \li the blend mode: how pixels of the object are blended with the background
/// \li the transform: how the object is positioned/rotated/scaled
/// \li the texture: what image is mapped to the object
/// \li the shader: what custom effect is applied to the object
///
/// High-level objects such as sprites or text force some of
/// these states when they are drawn. For example, a sprite
/// will set its own texture, so that you don't have to care
/// about it when drawing the sprite.
///
/// The transform is a special case: sprites, texts and shapes
/// (and it's a good idea to do it with your own drawable classes
/// too) combine their transform with the one that is passed in the
/// RenderStates structure. So that you can use a "global" transform
/// on top of each object's transform.
///
/// Most objects, especially high-level drawables, can be drawn
/// directly without defining render states explicitely -- the
/// default set of states is ok in most cases.
/// \code
/// window.Draw(sprite);
/// \endcode
///
/// If you want to use a single specific render state,
/// for example a shader, you can pass it directly to the Draw
/// function: sf::RenderStates has an implicit one-argument
/// constructor for each state.
/// \code
/// window.draw(sprite, shader);
/// \endcode
///
/// When you're inside the Draw function of a drawable
/// object (inherited from sf::Drawable), you can
/// either pass the render states unmodified, or change
/// some of them.
/// For example, a transformable object will combine the
/// current transform with its own transform. A sprite will
/// set its texture. Etc.
///
/// \see sf::RenderTarget, sf::Drawable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
};

    ////////////////////////////////////////////////////////////
    BlendMode      blendMode; ///< Blending mode
    Transform      transform; ///< Transform
    const Texture* texture;   ///< Texture
    const Shader*  shader;    ///< Shader
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const RenderStates Default; ///< Special instance holding the default render states
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode, const Transform& theTransform,
                 const Texture* theTexture, const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a set of render states with all its attributes
    ///
    /// \param theBlendMode Blend mode to use
    /// \param theTransform Transform to use
    /// \param theTexture   Texture to use
    /// \param theShader    Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom shader
    ///
    /// \param theShader Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Texture* theTexture);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom texture
    ///
    /// \param theTexture Texture to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Transform& theTransform);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom transform
    ///
    /// \param theTransform Transform to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom blend mode
    ///
    /// \param theBlendMode Blend mode to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructing a default set of render states is equivalent
    /// to using sf::RenderStates::Default.
    /// The default set defines:
    /// \li the BlendAlpha blend mode
    /// \li the identity transform
    /// \li a null texture
    /// \li a null shader
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
class SFML_GRAPHICS_API RenderStates

////////////////////////////////////////////////////////////
/// \brief Define the states used for drawing to a RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#ifndef SFML_RENDERSTATES_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderStates
/// \ingroup graphics
///
/// There are four global states that can be applied to
/// the drawn objects:
/// \li the blend mode: how pixels of the object are blended with the background
/// \li the transform: how the object is positioned/rotated/scaled
/// \li the texture: what image is mapped to the object
/// \li the shader: what custom effect is applied to the object
///
/// High-level objects such as sprites or text force some of
/// these states when they are drawn. For example, a sprite
/// will set its own texture, so that you don't have to care
/// about it when drawing the sprite.
///
/// The transform is a special case: sprites, texts and shapes
/// (and it's a good idea to do it with your own drawable classes
/// too) combine their transform with the one that is passed in the
/// RenderStates structure. So that you can use a "global" transform
/// on top of each object's transform.
///
/// Most objects, especially high-level drawables, can be drawn
/// directly without defining render states explicitely -- the
/// default set of states is ok in most cases.
/// \code
/// window.Draw(sprite);
/// \endcode
///
/// If you want to use a single specific render state,
/// for example a shader, you can pass it directly to the Draw
/// function: sf::RenderStates has an implicit one-argument
/// constructor for each state.
/// \code
/// window.draw(sprite, shader);
/// \endcode
///
/// When you're inside the Draw function of a drawable
/// object (inherited from sf::Drawable), you can
/// either pass the render states unmodified, or change
/// some of them.
/// For example, a transformable object will combine the
/// current transform with its own transform. A sprite will
/// set its texture. Etc.
///
/// \see sf::RenderTarget, sf::Drawable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
};

    ////////////////////////////////////////////////////////////
    BlendMode      blendMode; ///< Blending mode
    Transform      transform; ///< Transform
    const Texture* texture;   ///< Texture
    const Shader*  shader;    ///< Shader
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const RenderStates Default; ///< Special instance holding the default render states
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode, const Transform& theTransform,
                 const Texture* theTexture, const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a set of render states with all its attributes
    ///
    /// \param theBlendMode Blend mode to use
    /// \param theTransform Transform to use
    /// \param theTexture   Texture to use
    /// \param theShader    Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom shader
    ///
    /// \param theShader Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Texture* theTexture);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom texture
    ///
    /// \param theTexture Texture to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Transform& theTransform);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom transform
    ///
    /// \param theTransform Transform to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom blend mode
    ///
    /// \param theBlendMode Blend mode to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructing a default set of render states is equivalent
    /// to using sf::RenderStates::Default.
    /// The default set defines:
    /// \li the BlendAlpha blend mode
    /// \li the identity transform
    /// \li a null texture
    /// \li a null shader
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
class SFML_GRAPHICS_API RenderStates

////////////////////////////////////////////////////////////
/// \brief Define the states used for drawing to a RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#ifndef SFML_RENDERSTATES_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderStates
/// \ingroup graphics
///
/// There are four global states that can be applied to
/// the drawn objects:
/// \li the blend mode: how pixels of the object are blended with the background
/// \li the transform: how the object is positioned/rotated/scaled
/// \li the texture: what image is mapped to the object
/// \li the shader: what custom effect is applied to the object
///
/// High-level objects such as sprites or text force some of
/// these states when they are drawn. For example, a sprite
/// will set its own texture, so that you don't have to care
/// about it when drawing the sprite.
///
/// The transform is a special case: sprites, texts and shapes
/// (and it's a good idea to do it with your own drawable classes
/// too) combine their transform with the one that is passed in the
/// RenderStates structure. So that you can use a "global" transform
/// on top of each object's transform.
///
/// Most objects, especially high-level drawables, can be drawn
/// directly without defining render states explicitely -- the
/// default set of states is ok in most cases.
/// \code
/// window.Draw(sprite);
/// \endcode
///
/// If you want to use a single specific render state,
/// for example a shader, you can pass it directly to the Draw
/// function: sf::RenderStates has an implicit one-argument
/// constructor for each state.
/// \code
/// window.draw(sprite, shader);
/// \endcode
///
/// When you're inside the Draw function of a drawable
/// object (inherited from sf::Drawable), you can
/// either pass the render states unmodified, or change
/// some of them.
/// For example, a transformable object will combine the
/// current transform with its own transform. A sprite will
/// set its texture. Etc.
///
/// \see sf::RenderTarget, sf::Drawable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
};

    ////////////////////////////////////////////////////////////
    BlendMode      blendMode; ///< Blending mode
    Transform      transform; ///< Transform
    const Texture* texture;   ///< Texture
    const Shader*  shader;    ///< Shader
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    ////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////
    static const RenderStates Default; ///< Special instance holding the default render states
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    // Static member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode, const Transform& theTransform,
                 const Texture* theTexture, const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a set of render states with all its attributes
    ///
    /// \param theBlendMode Blend mode to use
    /// \param theTransform Transform to use
    /// \param theTexture   Texture to use
    /// \param theShader    Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Shader* theShader);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom shader
    ///
    /// \param theShader Shader to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Texture* theTexture);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom texture
    ///
    /// \param theTexture Texture to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(const Transform& theTransform);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom transform
    ///
    /// \param theTransform Transform to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates(BlendMode theBlendMode);

    ////////////////////////////////////////////////////////////
    /// \brief Construct a default set of render states with a custom blend mode
    ///
    /// \param theBlendMode Blend mode to use
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
    RenderStates();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// Constructing a default set of render states is equivalent
    /// to using sf::RenderStates::Default.
    /// The default set defines:
    /// \li the BlendAlpha blend mode
    /// \li the identity transform
    /// \li a null texture
    /// \li a null shader
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
class SFML_GRAPHICS_API RenderStates

////////////////////////////////////////////////////////////
/// \brief Define the states used for drawing to a RenderTarget
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
#ifndef SFML_RENDERSTATES_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderStates.hpp
//

////////////////////////////////////////////////////////////
