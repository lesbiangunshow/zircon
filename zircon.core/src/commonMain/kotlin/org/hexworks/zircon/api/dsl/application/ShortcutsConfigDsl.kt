package org.hexworks.zircon.api.dsl.application

import org.hexworks.zircon.api.application.ShortcutsConfig
import org.hexworks.zircon.api.builder.application.ShortcutsConfigBuilder

fun shortcutsConfig(
    shortcutsConfig: ShortcutsConfig = ShortcutsConfig.defaultConfig(),
    init: ShortcutsConfigBuilder.() -> Unit
): ShortcutsConfig =
    ShortcutsConfigBuilder(shortcutsConfig).apply(init).build()
