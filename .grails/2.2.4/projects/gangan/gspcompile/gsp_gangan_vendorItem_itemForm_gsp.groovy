import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendorItem_itemForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendorItem/_itemForm.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
invokeTag('renderErrors','g',3,['bean':(vendorItemVO)],-1)
printHtmlPart(1)
})
invokeTag('hasErrors','g',5,['bean':(vendorItemVO)],1)
printHtmlPart(2)
codecOut.print(vendorItemVO?.itemName)
printHtmlPart(3)
codecOut.print(vendorItemVO?.itemDescription)
printHtmlPart(4)
codecOut.print(vendorItemVO?.itemQuantity)
printHtmlPart(5)
codecOut.print(vendorItemVO?.itemPrice)
printHtmlPart(6)
invokeTag('select','g',77,['from':(com.gangan.event.Category.list()),'optionKey':("id"),'optionValue':("categoryName"),'name':("categories"),'id':("categories"),'multiple':("true"),'class':("form-control"),'value':(vendorItemVO?.categories)],-1)
printHtmlPart(7)
codecOut.print(vendorItemVO?.itemDiscount)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
