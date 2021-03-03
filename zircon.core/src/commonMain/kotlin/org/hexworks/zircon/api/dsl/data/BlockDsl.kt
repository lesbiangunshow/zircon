package org.hexworks.zircon.api.dsl.data

import org.hexworks.zircon.api.builder.data.BlockBuilder
import org.hexworks.zircon.api.builder.data.TileBuilder
import org.hexworks.zircon.api.data.Block
import org.hexworks.zircon.api.data.Tile

fun <T : Tile> block(init: BlockBuilder<T>.() -> Unit): Block<T> =
    BlockBuilder<T>().apply(init).build()

fun BlockBuilder<Tile>.emptyTile(init: TileBuilder.() -> Unit) =
    withEmptyTile(TileBuilder().apply(init).build())

fun BlockBuilder<Tile>.top(init: TileBuilder.() -> Unit) =
    withTop(TileBuilder().apply(init).build())

fun BlockBuilder<Tile>.bottom(init: TileBuilder.() -> Unit) =
    withBottom(TileBuilder().apply(init).build())

fun BlockBuilder<Tile>.front(init: TileBuilder.() -> Unit) =
    withFront(TileBuilder().apply(init).build())

fun BlockBuilder<Tile>.back(init: TileBuilder.() -> Unit) =
    withBack(TileBuilder().apply(init).build())

fun BlockBuilder<Tile>.left(init: TileBuilder.() -> Unit) =
    withLeft(TileBuilder().apply(init).build())

fun BlockBuilder<Tile>.right(init: TileBuilder.() -> Unit) =
    withRight(TileBuilder().apply(init).build())

fun BlockBuilder<Tile>.content(init: TileBuilder.() -> Unit) =
    withContent(TileBuilder().apply(init).build())

fun BlockBuilder<Tile>.tileOnAllSides(init: TileBuilder.() -> Unit) =
    withTileOnAllSides(TileBuilder().apply(init).build())
