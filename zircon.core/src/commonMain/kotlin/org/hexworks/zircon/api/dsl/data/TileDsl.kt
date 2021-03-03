package org.hexworks.zircon.api.dsl.data

import org.hexworks.zircon.api.builder.data.TileBuilder
import org.hexworks.zircon.api.data.CharacterTile
import org.hexworks.zircon.api.data.GraphicalTile
import org.hexworks.zircon.api.data.ImageTile
import org.hexworks.zircon.api.data.Tile

fun tile(init: TileBuilder.() -> Unit): Tile =
    TileBuilder().apply(init).build()

fun characterTile(init: TileBuilder.() -> Unit): CharacterTile =
    TileBuilder().apply(init).buildCharacterTile()

fun imageTile(init: TileBuilder.() -> Unit): ImageTile =
    TileBuilder().apply(init).buildImageTile()

fun graphicalTile(init: TileBuilder.() -> Unit): GraphicalTile =
    TileBuilder().apply(init).buildGraphicalTile()