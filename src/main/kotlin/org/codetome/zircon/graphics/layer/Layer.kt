package org.codetome.zircon.graphics.layer

import org.codetome.zircon.behavior.Layerable
import org.codetome.zircon.behavior.Movable
import org.codetome.zircon.graphics.image.TextImage

/**
 * A [Layer] is a specialized [TextImage] which is drawn upon a
 * [Layerable] object. A [Layer] differs from a [TextImage] in
 * the way it is handled. It can be repositioned relative to its
 * parent while a [TextImage] cannot.
 */
interface Layer : TextImage, Movable