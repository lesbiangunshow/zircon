package org.hexworks.zircon.api.dsl.graphics

import org.hexworks.zircon.api.builder.data.TileBuilder
import org.hexworks.zircon.api.builder.graphics.TileGraphicsBuilder
import org.hexworks.zircon.api.data.Tile
import org.hexworks.zircon.internal.dsl.ZirconDsl
import org.hexworks.zircon.api.graphics.TileGraphics

@ZirconDsl
fun tileGraphics(init: TileGraphicsBuilder.() -> Unit): TileGraphics =
    TileGraphicsBuilder().apply(init).build()

@ZirconDsl
fun tile(init: TileBuilder.() -> Unit): Tile =
    TileBuilder().apply(init).build()

@ZirconDsl
fun TileGraphicsBuilder.filler(tile: () -> Tile) {
    withFiller(
        tile()
    )
}

fun makinTileGraphics() {

    TileGraphicsBuilder().apply {
        TileBuilder.apply {
            withSize(5, 5)
        }
    }
    val image =
        tileGraphics {
            withSize(5, 5)
            filler {
                tile {
                    withCharacter('~')
                }
            }
        }
}

