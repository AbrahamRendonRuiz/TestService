package com.example.test.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/*@Root(name = "rss", strict = false)
class TrendingSearchResponseWrapper @JvmOverloads constructor(
    @field: Element(name = "channel")
    var channel: TrendingSearchResponse? = null
)

@Root(name = "channel", strict = false)
class TrendingSearchResponse @JvmOverloads constructor(
    @field: ElementList(inline = true)
    var itemList: List<TrendingSearchItem>? = null
)

@Root(name = "item", strict = false)
class TrendingSearchItem @JvmOverloads constructor(
    @field: Element(name = "title")
    var title: String = "",
    @field: Element(name = "description", required = false)
    var description: String = "",
    @field: Element(name = "link")
    var link: String = ""
)*/
//real
@Root(name = "?xml",strict = false)
class TrendingSearchResponseWrapper @JvmOverloads constructor(
    @field: Element(name = "Solicitud")
    var Solicitud :TrendingSearchResponse? = null
)
@Root(name = "Solicitud",strict = false)
class TrendingSearchResponse @JvmOverloads constructor(
    @field:Element(name = "VentaD")
    var venta: TrendingSearchResponse2? = null

)

@Root(name = "venta",strict = false)
class TrendingSearchResponse2 @JvmOverloads constructor(
    //@field: ElementList(inline = true)
    //var itemList: List<TrendingSearchItem>? = null

)