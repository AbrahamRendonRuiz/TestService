package com.example.test

import android.util.Xml
import org.xmlpull.v1.XmlSerializer
import java.io.StringWriter


public class xmlCreate{

    val xmlSerializer = Xml.newSerializer()
    val xmlString = xmlSerializer.document{
        element("solicitud"){
            element("AppId","1"){

            }
            element("sd","spVerVenta")
            element("ventaId","2211")
            element("url","http://localhost/fshop/pages/checkout.php?reload")
        }
    }

    fun XmlSerializer.document(docName: String = "UTF-8",
                               xmlStringWriter: StringWriter = StringWriter(),
                               init: XmlSerializer.() -> Unit): String {
        startDocument(docName, true)
        xmlStringWriter.buffer.setLength(0) //  refreshing string writer due to reuse
        setOutput(xmlStringWriter)
        init()
        endDocument()
        return xmlStringWriter.toString()
    }

    //  element
    fun XmlSerializer.element(name: String, init: XmlSerializer.() -> Unit) {
        startTag("", name)
        init()
        endTag("", name)
    }

    //  element with attribute & content
    fun XmlSerializer.element(name: String,
                              content: String,
                              init: XmlSerializer.() -> Unit) {
        startTag("", name)
        init()
        text(content)
        endTag("", name)
    }

    //  element with content
    fun XmlSerializer.element(name: String, content: String) =
        element(name) {
            text(content)
        }

    //  attribute
    fun XmlSerializer.attribute(name: String, value: String) =
        attribute("", name, value)
    fun traer() : String{
       return xmlString.toString()
    }
}