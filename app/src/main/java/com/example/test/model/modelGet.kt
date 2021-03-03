package com.example.test.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "?xml",strict = false)
class TrendingSearchResponseWrapperUp @JvmOverloads constructor(
    @field: ElementList(inline=true)
    var itemList: List<TrendingSearchItem>? = null
)
@Root(name = "Solicitd", strict = false)
class TrendingSearchItem @JvmOverloads constructor(
    @field: Element(name = "AppID")
    var AppID: String = "",
    @field: Element(name = "sp", required = false)
    var sp: String = "",
    @field: Element(name = "venta")
    var venta: String = "",
    @field: Element(name = "url")
    var url: String = ""
)
